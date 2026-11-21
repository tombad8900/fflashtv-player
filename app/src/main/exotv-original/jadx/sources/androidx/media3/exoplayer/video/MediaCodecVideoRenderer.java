package androidx.media3.exoplayer.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.p129ws.C2155f;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1134y;
import p063h1.C1135z;
import p085j6.EnumC1525o;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements VideoFrameReleaseControl.FrameTimingEvaluator {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final long MIN_EARLY_US_LATE_THRESHOLD = -30000;
    private static final long MIN_EARLY_US_VERY_LATE_THRESHOLD = -500000;
    private static final long OFFSET_FROM_PERIOD_END_TO_TREAT_AS_LAST_US = 100000;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private int buffersInCodecCount;
    private int changeFrameRateStrategy;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private C0194d2 decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private Surface displaySurface;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private VideoFrameMetadataListener frameMetadataListener;
    private boolean hasSetVideoSink;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long lastFrameReleaseTimeNs;
    private final int maxDroppedFramesToNotify;
    private C1134y outputResolution;
    private final boolean ownsVideoSink;
    private boolean pendingVideoSinkInputStreamChange;
    private long periodDurationUs;
    private PlaceholderSurface placeholderSurface;
    private int rendererPriority;
    private C0194d2 reportedVideoSize;
    private int scalingMode;
    private long startPositionUs;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private List<Object> videoEffects;
    private int videoFrameProcessingOffsetCount;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo;
    private VideoSink videoSink;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api26 {
        private Api26() {
        }

        public static boolean doesDisplaySupportDolbyVision(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i, int i4, int i8) {
            this.width = i;
            this.height = i4;
            this.inputSize = i8;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler handlerM2457p = AbstractC1118i0.m2457p(this);
            this.handler = handlerM2457p;
            mediaCodecAdapter.setOnFrameRenderedListener(this, handlerM2457p);
        }

        private void handleFrameRendered(long j) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener || mediaCodecVideoRenderer.getCodec() == null) {
                return;
            }
            if (j == MediaCodecVideoRenderer.TUNNELING_EOS_PRESENTATION_TIME_US) {
                MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j);
            } catch (ExoPlaybackException e) {
                MediaCodecVideoRenderer.this.setPendingPlaybackException(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i4 = message.arg2;
            int i8 = AbstractC1118i0.f4750a;
            handleFrameRendered(((i & 4294967295L) << 32) | (4294967295L & i4));
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j, long j8) {
            if (AbstractC1118i0.f4750a >= 30) {
                handleFrameRendered(j);
            } else {
                this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j >> 32), (int) j));
            }
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(AbstractC1118i0.f4752c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        String str;
        int i = AbstractC1118i0.f4750a;
        char c8 = 7;
        if (i <= 28) {
            String str2 = AbstractC1118i0.f4751b;
            str2.getClass();
            switch (str2) {
            }
            return true;
        }
        if (i <= 27 && "HWEML".equals(AbstractC1118i0.f4751b)) {
            return true;
        }
        str = AbstractC1118i0.f4753d;
        str.getClass();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i <= 26) {
                    String str3 = AbstractC1118i0.f4751b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (!str3.equals("GIONEE_SWW1609")) {
                                c8 = '\uffff';
                                break;
                            } else {
                                c8 = 0;
                                break;
                            }
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c8 = 1;
                                break;
                            }
                            break;
                        case -2144781160:
                            if (str3.equals("GIONEE_SWW1631")) {
                                c8 = 2;
                                break;
                            }
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c8 = 3;
                                break;
                            }
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c8 = 4;
                                break;
                            }
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c8 = 5;
                                break;
                            }
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c8 = 6;
                                break;
                            }
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                            }
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                c8 = '\b';
                                break;
                            }
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c8 = '\t';
                                break;
                            }
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c8 = '\n';
                                break;
                            }
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c8 = 11;
                                break;
                            }
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c8 = '\f';
                                break;
                            }
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c8 = '\r';
                                break;
                            }
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c8 = 14;
                                break;
                            }
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c8 = 15;
                                break;
                            }
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c8 = 16;
                                break;
                            }
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c8 = 17;
                                break;
                            }
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c8 = 18;
                                break;
                            }
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c8 = 19;
                                break;
                            }
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c8 = 20;
                                break;
                            }
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c8 = 21;
                                break;
                            }
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c8 = 22;
                                break;
                            }
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c8 = 23;
                                break;
                            }
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c8 = 24;
                                break;
                            }
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                c8 = 25;
                                break;
                            }
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c8 = 26;
                                break;
                            }
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c8 = 27;
                                break;
                            }
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c8 = 28;
                                break;
                            }
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c8 = 29;
                                break;
                            }
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c8 = 30;
                                break;
                            }
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c8 = 31;
                                break;
                            }
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c8 = ' ';
                                break;
                            }
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c8 = '!';
                                break;
                            }
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c8 = '\"';
                                break;
                            }
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c8 = '#';
                                break;
                            }
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c8 = '$';
                                break;
                            }
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c8 = '%';
                                break;
                            }
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c8 = '&';
                                break;
                            }
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c8 = '\'';
                                break;
                            }
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c8 = '(';
                                break;
                            }
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c8 = ')';
                                break;
                            }
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c8 = '*';
                                break;
                            }
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c8 = '+';
                                break;
                            }
                            break;
                        case 2126:
                            if (str3.equals("C1")) {
                                c8 = ',';
                                break;
                            }
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c8 = '-';
                                break;
                            }
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c8 = '.';
                                break;
                            }
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c8 = '/';
                                break;
                            }
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c8 = '0';
                                break;
                            }
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c8 = '1';
                                break;
                            }
                            break;
                        case 73405:
                            if (str3.equals("JGZ")) {
                                c8 = '2';
                                break;
                            }
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                c8 = '3';
                                break;
                            }
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c8 = '4';
                                break;
                            }
                            break;
                        case 76779:
                            if (str3.equals("MX6")) {
                                c8 = '5';
                                break;
                            }
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c8 = '6';
                                break;
                            }
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c8 = '7';
                                break;
                            }
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c8 = '8';
                                break;
                            }
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c8 = '9';
                                break;
                            }
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c8 = ':';
                                break;
                            }
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c8 = ';';
                                break;
                            }
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c8 = '<';
                                break;
                            }
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c8 = '=';
                                break;
                            }
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c8 = '>';
                                break;
                            }
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c8 = '?';
                                break;
                            }
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                c8 = '@';
                                break;
                            }
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c8 = 'A';
                                break;
                            }
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c8 = 'B';
                                break;
                            }
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c8 = 'C';
                                break;
                            }
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c8 = 'D';
                                break;
                            }
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c8 = 'E';
                                break;
                            }
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c8 = 'F';
                                break;
                            }
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c8 = 'G';
                                break;
                            }
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c8 = 'H';
                                break;
                            }
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c8 = 'I';
                                break;
                            }
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c8 = 'J';
                                break;
                            }
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c8 = 'K';
                                break;
                            }
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c8 = 'L';
                                break;
                            }
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c8 = 'M';
                                break;
                            }
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c8 = 'N';
                                break;
                            }
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c8 = 'O';
                                break;
                            }
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c8 = 'P';
                                break;
                            }
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c8 = 'Q';
                                break;
                            }
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c8 = 'R';
                                break;
                            }
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c8 = 'S';
                                break;
                            }
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c8 = 'T';
                                break;
                            }
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c8 = 'U';
                                break;
                            }
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c8 = 'V';
                                break;
                            }
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c8 = 'W';
                                break;
                            }
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                c8 = 'X';
                                break;
                            }
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c8 = 'Y';
                                break;
                            }
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c8 = 'Z';
                                break;
                            }
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                                c8 = '[';
                                break;
                            }
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c8 = '\\';
                                break;
                            }
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c8 = ']';
                                break;
                            }
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c8 = '^';
                                break;
                            }
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c8 = '_';
                                break;
                            }
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c8 = '`';
                                break;
                            }
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c8 = 'a';
                                break;
                            }
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c8 = 'b';
                                break;
                            }
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c8 = 'c';
                                break;
                            }
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c8 = 'd';
                                break;
                            }
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c8 = 'e';
                                break;
                            }
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                                c8 = 'f';
                                break;
                            }
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c8 = 'g';
                                break;
                            }
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c8 = 'h';
                                break;
                            }
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c8 = 'i';
                                break;
                            }
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c8 = 'j';
                                break;
                            }
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c8 = 'k';
                                break;
                            }
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c8 = 'l';
                                break;
                            }
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c8 = 'm';
                                break;
                            }
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c8 = 'n';
                                break;
                            }
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c8 = 'o';
                                break;
                            }
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c8 = 'p';
                                break;
                            }
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                c8 = 'q';
                                break;
                            }
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c8 = 'r';
                                break;
                            }
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c8 = 's';
                                break;
                            }
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c8 = 't';
                                break;
                            }
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c8 = 'u';
                                break;
                            }
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c8 = 'v';
                                break;
                            }
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c8 = 'w';
                                break;
                            }
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                                c8 = 'x';
                                break;
                            }
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c8 = 'y';
                                break;
                            }
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c8 = 'z';
                                break;
                            }
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                c8 = '{';
                                break;
                            }
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c8 = '|';
                                break;
                            }
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c8 = '}';
                                break;
                            }
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c8 = '~';
                                break;
                            }
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c8 = '\u007f';
                                break;
                            }
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c8 = '\u0080';
                                break;
                            }
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c8 = '\u0081';
                                break;
                            }
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c8 = '\u0082';
                                break;
                            }
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c8 = '\u0083';
                                break;
                            }
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c8 = '\u0084';
                                break;
                            }
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c8 = '\u0085';
                                break;
                            }
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c8 = '\u0086';
                                break;
                            }
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c8 = '\u0087';
                                break;
                            }
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c8 = '\u0088';
                                break;
                            }
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c8 = '\u0089';
                                break;
                            }
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c8 = '\u008a';
                                break;
                            }
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c8 = '\u008b';
                                break;
                            }
                            break;
                    }
                    switch (c8) {
                        default:
                            str.getClass();
                            if (!str.equals("JSN-L21")) {
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                        case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                        case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                        case 20:
                        case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                        case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                        case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                        case 24:
                        case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                        case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                        case AnalyticsListener.EVENT_CUES /* 27 */:
                        case AnalyticsListener.EVENT_METADATA /* 28 */:
                        case AnalyticsListener.EVENT_DEVICE_INFO_CHANGED /* 29 */:
                        case AnalyticsListener.EVENT_DEVICE_VOLUME_CHANGED /* 30 */:
                        case 31:
                        case ' ':
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case '\\':
                        case ']':
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case '|':
                        case '}':
                        case C2155f.PAYLOAD_SHORT /* 126 */:
                        case '\u007f':
                        case '\u0080':
                        case '\u0081':
                        case '\u0082':
                        case '\u0083':
                        case '\u0084':
                        case '\u0085':
                        case '\u0086':
                        case '\u0087':
                        case '\u0088':
                        case '\u0089':
                        case '\u008a':
                        case '\u008b':
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, C0249w c0249w) {
        int iIntValue;
        int i = c0249w.f1529u;
        int i4 = c0249w.f1530v;
        if (i == -1 || i4 == -1) {
            return -1;
        }
        String str = c0249w.f1522n;
        str.getClass();
        char c8 = 1;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(c0249w);
            str = (codecProfileAndLevel == null || !((iIntValue = ((Integer) codecProfileAndLevel.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals("video/3gpp")) {
                    c8 = '\uffff';
                    break;
                } else {
                    c8 = 0;
                    break;
                }
            case -1662735862:
                if (!str.equals("video/av01")) {
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c8 = 2;
                    break;
                }
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c8 = 3;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c8 = 4;
                    break;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c8 = 5;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c8 = 6;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case 1:
            case 3:
            case 5:
                return getMaxSampleSize(i * i4, 2);
            case 2:
                return Math.max(HEVC_MAX_INPUT_SIZE_THRESHOLD, getMaxSampleSize(i * i4, 2));
            case 4:
                String str2 = AbstractC1118i0.f4753d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(AbstractC1118i0.f4752c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                return getMaxSampleSize(AbstractC1118i0.m2446f(i4, 16) * AbstractC1118i0.m2446f(i, 16) * 256, 2);
            case 6:
                return getMaxSampleSize(i * i4, 4);
            default:
                return -1;
        }
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, C0249w c0249w) {
        int i = c0249w.f1530v;
        int i4 = c0249w.f1529u;
        boolean z7 = i > i4;
        int i8 = z7 ? i : i4;
        if (z7) {
            i = i4;
        }
        float f8 = i / i8;
        for (int i9 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i10 = (int) (i9 * f8);
            if (i9 <= i8 || i10 <= i) {
                break;
            }
            int i11 = z7 ? i10 : i9;
            if (!z7) {
                i9 = i10;
            }
            Point pointAlignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i11, i9);
            float f9 = c0249w.f1531w;
            if (pointAlignVideoSizeV21 != null && mediaCodecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, f9)) {
                return pointAlignVideoSizeV21;
            }
        }
        return null;
    }

    public static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, C0249w c0249w) {
        int i = c0249w.f1523o;
        List list = c0249w.f1525q;
        if (i == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, c0249w);
        }
        int size = list.size();
        int length = 0;
        for (int i4 = 0; i4 < size; i4++) {
            length += ((byte[]) list.get(i4)).length;
        }
        return c0249w.f1523o + length;
    }

    private static int getMaxSampleSize(int i, int i4) {
        return (i * 3) / (i4 * 2);
    }

    private Surface getSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.getInputSurface();
        }
        Surface surface = this.displaySurface;
        if (surface != null) {
            return surface;
        }
        if (shouldUseDetachedSurface(mediaCodecInfo)) {
            return null;
        }
        AbstractC1101a.m2359j(shouldUsePlaceholderSurface(mediaCodecInfo));
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        if (this.placeholderSurface == null) {
            this.placeholderSurface = PlaceholderSurface.newInstance(this.context, mediaCodecInfo.secure);
        }
        return this.placeholderSurface;
    }

    private boolean hasSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        Surface surface = this.displaySurface;
        return (surface != null && surface.isValid()) || shouldUseDetachedSurface(mediaCodecInfo) || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    private boolean isBufferBeforeStartTime(C1872g c1872g) {
        return c1872g.timeUs < getLastResetPositionUs();
    }

    private boolean isBufferProbablyLastSample(C1872g c1872g) {
        if (hasReadStreamToEnd() || c1872g.isLastSample() || this.periodDurationUs == -9223372036854775807L) {
            return true;
        }
        return this.periodDurationUs - (c1872g.timeUs - getOutputStreamOffsetUs()) <= 100000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            ((C1135z) getClock()).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame() || this.displaySurface == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i = this.videoFrameProcessingOffsetCount;
        if (i != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private void maybeNotifyVideoSizeChanged(C0194d2 c0194d2) {
        if (c0194d2.equals(C0194d2.f1085d) || c0194d2.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = c0194d2;
        this.eventDispatcher.videoSizeChanged(c0194d2);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Surface surface = this.displaySurface;
        if (surface == null || !this.haveReportedFirstFrameRenderedForCurrentSurface) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(surface);
    }

    private void maybeRenotifyVideoSizeChanged() {
        C0194d2 c0194d2 = this.reportedVideoSize;
        if (c0194d2 != null) {
            this.eventDispatcher.videoSizeChanged(c0194d2);
        }
    }

    private void maybeSetKeyAllowFrameDrop(MediaFormat mediaFormat) {
        if (this.videoSink == null || AbstractC1118i0.m2424O(this.context)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void maybeSetupTunnelingForFirstFrame() {
        int i;
        MediaCodecAdapter codec;
        if (!this.tunneling || (i = AbstractC1118i0.f4750a) < 23 || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            codec.setParameters(bundle);
        }
    }

    private void notifyFrameMetadataListener(long j, long j8, C0249w c0249w) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j8, c0249w, getCodecOutputMediaFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public void notifyRenderedFirstFrame() {
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    private void releaseFrame(MediaCodecAdapter mediaCodecAdapter, int i, long j, C0249w c0249w) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer;
        long releaseTimeNs = this.videoFrameReleaseInfo.getReleaseTimeNs();
        long earlyUs = this.videoFrameReleaseInfo.getEarlyUs();
        if (shouldSkipBuffersWithIdenticalReleaseTime() && releaseTimeNs == this.lastFrameReleaseTimeNs) {
            skipOutputBuffer(mediaCodecAdapter, i, j);
            mediaCodecVideoRenderer = this;
        } else {
            mediaCodecVideoRenderer = this;
            mediaCodecVideoRenderer.notifyFrameMetadataListener(j, releaseTimeNs, c0249w);
            mediaCodecVideoRenderer.renderOutputBufferV21(mediaCodecAdapter, i, j, releaseTimeNs);
            releaseTimeNs = releaseTimeNs;
        }
        updateVideoFrameProcessingOffsetCounters(earlyUs);
        mediaCodecVideoRenderer.lastFrameReleaseTimeNs = releaseTimeNs;
    }

    private void releasePlaceholderSurface() {
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j, long j8) {
        renderOutputBufferV21(mediaCodecAdapter, i, j, j8);
    }

    private static void setHdr10PlusInfoV29(MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    private void setOutput(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.displaySurface == surface) {
            if (surface != null) {
                maybeRenotifyVideoSizeChanged();
                maybeRenotifyRenderedFirstFrame();
                return;
            }
            return;
        }
        this.displaySurface = surface;
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        int state = getState();
        MediaCodecAdapter codec = getCodec();
        if (codec != null && this.videoSink == null) {
            MediaCodecInfo codecInfo = getCodecInfo();
            codecInfo.getClass();
            boolean zHasSurfaceForCodec = hasSurfaceForCodec(codecInfo);
            if (AbstractC1118i0.f4750a < 23 || !zHasSurfaceForCodec || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodecOrBypass();
            } else {
                setOutputSurface(codec, getSurfaceForCodec(codecInfo));
            }
        }
        if (surface != null) {
            maybeRenotifyVideoSizeChanged();
            if (state == 2) {
                VideoSink videoSink = this.videoSink;
                if (videoSink != null) {
                    videoSink.join(true);
                } else {
                    this.videoFrameReleaseControl.join(true);
                }
            }
        } else {
            this.reportedVideoSize = null;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.clearOutputSurfaceInfo();
            }
        }
        maybeSetupTunnelingForFirstFrame();
    }

    private void setOutputSurface(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        int i = AbstractC1118i0.f4750a;
        if (i >= 23 && surface != null) {
            setOutputSurfaceV23(mediaCodecAdapter, surface);
        } else {
            if (i < 35) {
                throw new IllegalStateException();
            }
            detachOutputSurfaceV35(mediaCodecAdapter);
        }
    }

    private boolean shouldUsePlaceholderSurface(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC1118i0.f4750a < 23 || this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported(this.context);
    }

    public static int supportsFormat(Context context, MediaCodecSelector mediaCodecSelector, C0249w c0249w) {
        return supportsFormatInternal(context, mediaCodecSelector, c0249w);
    }

    private static int supportsFormatInternal(Context context, MediaCodecSelector mediaCodecSelector, C0249w c0249w) {
        boolean z7;
        int i = 0;
        if (!AbstractC0244u0.m686o(c0249w.f1522n)) {
            return RendererCapabilities.create(0);
        }
        boolean z8 = c0249w.f1526r != null;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(context, mediaCodecSelector, c0249w, z8, false);
        if (z8 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(context, mediaCodecSelector, c0249w, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return RendererCapabilities.create(1);
        }
        if (!MediaCodecRenderer.supportsFormatDrm(c0249w)) {
            return RendererCapabilities.create(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(c0249w);
        if (zIsFormatSupported) {
            z7 = true;
        } else {
            for (int i4 = 1; i4 < decoderInfos.size(); i4++) {
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i4);
                if (mediaCodecInfo2.isFormatSupported(c0249w)) {
                    z7 = false;
                    zIsFormatSupported = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
            }
            z7 = true;
        }
        int i8 = zIsFormatSupported ? 4 : 3;
        int i9 = mediaCodecInfo.isSeamlessAdaptationSupported(c0249w) ? 16 : 8;
        int i10 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i11 = z7 ? 128 : 0;
        if (AbstractC1118i0.f4750a >= 26 && "video/dolby-vision".equals(c0249w.f1522n) && !Api26.doesDisplaySupportDolbyVision(context)) {
            i11 = 256;
        }
        if (zIsFormatSupported) {
            List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(context, mediaCodecSelector, c0249w, z8, true);
            if (!decoderInfos2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo3 = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, c0249w).get(0);
                if (mediaCodecInfo3.isFormatSupported(c0249w) && mediaCodecInfo3.isSeamlessAdaptationSupported(c0249w)) {
                    i = 32;
                }
            }
        }
        return RendererCapabilities.create(i8, i9, i, i10, i11);
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && AbstractC1118i0.f4750a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updatePeriodDurationUs(MediaSource.MediaPeriodId mediaPeriodId) {
        AbstractC0230p1 timeline = getTimeline();
        if (timeline.isEmpty()) {
            this.periodDurationUs = -9223372036854775807L;
        } else {
            mediaPeriodId.getClass();
            this.periodDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, new C0221m1()).f1207d;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, C0249w c0249w, C0249w c0249w2) {
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(c0249w, c0249w2);
        int i = decoderReuseEvaluationCanReuseCodec.discardReasons;
        CodecMaxValues codecMaxValues = this.codecMaxValues;
        codecMaxValues.getClass();
        if (c0249w2.f1529u > codecMaxValues.width || c0249w2.f1530v > codecMaxValues.height) {
            i |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, c0249w2) > codecMaxValues.inputSize) {
            i |= 64;
        }
        int i4 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, c0249w, c0249w2, i4 != 0 ? 0 : decoderReuseEvaluationCanReuseCodec.result, i4);
    }

    public boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th, mediaCodecInfo, this.displaySurface);
    }

    public void detachOutputSurfaceV35(MediaCodecAdapter mediaCodecAdapter) {
        mediaCodecAdapter.detachOutputSurface();
    }

    public void dropOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        Trace.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.enableMayRenderStartOfStream();
        } else {
            this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }
    }

    public long getBufferTimestampAdjustmentUs() {
        return -this.startPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int getCodecBufferFlags(C1872g c1872g) {
        return (AbstractC1118i0.f4750a >= 34 && this.tunneling && isBufferBeforeStartTime(c1872g)) ? 32 : 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, C0249w c0249w, C0249w[] c0249wArr) {
        int codecMaxInputSize;
        int iMax = c0249w.f1529u;
        C0216l c0216l = c0249w.f1497B;
        int iMax2 = c0249w.f1530v;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, c0249w);
        if (c0249wArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, c0249w)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new CodecMaxValues(iMax, iMax2, maxInputSize);
        }
        int length = c0249wArr.length;
        boolean z7 = false;
        for (int i = 0; i < length; i++) {
            C0249w c0249w2 = c0249wArr[i];
            if (c0216l != null && c0249w2.f1497B == null) {
                C0246v c0246vM692a = c0249w2.m692a();
                c0246vM692a.f1424A = c0216l;
                c0249w2 = new C0249w(c0246vM692a);
            }
            if (mediaCodecInfo.canReuseCodec(c0249w, c0249w2).result != 0) {
                int i4 = c0249w2.f1529u;
                int i8 = c0249w2.f1530v;
                z7 |= i4 == -1 || i8 == -1;
                iMax = Math.max(iMax, i4);
                iMax2 = Math.max(iMax2, i8);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, c0249w2));
            }
        }
        if (z7) {
            AbstractC1101a.m2348F(TAG, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, c0249w);
            if (codecMaxSize != null) {
                iMax = Math.max(iMax, codecMaxSize.x);
                iMax2 = Math.max(iMax2, codecMaxSize.y);
                C0246v c0246vM692a2 = c0249w.m692a();
                c0246vM692a2.f1454t = iMax;
                c0246vM692a2.f1455u = iMax2;
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, new C0249w(c0246vM692a2)));
                AbstractC1101a.m2348F(TAG, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean getCodecNeedsEosPropagation() {
        return this.tunneling && AbstractC1118i0.f4750a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f8, C0249w c0249w, C0249w[] c0249wArr) {
        float fMax = -1.0f;
        for (C0249w c0249w2 : c0249wArr) {
            float f9 = c0249w2.f1531w;
            if (f9 != -1.0f) {
                fMax = Math.max(fMax, f9);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f8;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, C0249w c0249w, boolean z7) {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.context, mediaCodecSelector, c0249w, z7, this.tunneling), c0249w);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, C0249w c0249w, MediaCrypto mediaCrypto, float f8) {
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, c0249w, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(c0249w, str, codecMaxValues, f8, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        Surface surfaceForCodec = getSurfaceForCodec(mediaCodecInfo);
        maybeSetKeyAllowFrameDrop(mediaFormat);
        return MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, c0249w, surfaceForCodec, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(C0249w c0249w, String str, CodecMaxValues codecMaxValues, float f8, boolean z7, int i) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c0249w.f1529u);
        mediaFormat.setInteger("height", c0249w.f1530v);
        AbstractC1101a.m2346D(mediaFormat, c0249w.f1525q);
        float f9 = c0249w.f1531w;
        if (f9 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f9);
        }
        AbstractC1101a.m2375z(mediaFormat, "rotation-degrees", c0249w.f1532x);
        AbstractC1101a.m2374y(mediaFormat, c0249w.f1497B);
        if ("video/dolby-vision".equals(c0249w.f1522n) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(c0249w)) != null) {
            AbstractC1101a.m2375z(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        AbstractC1101a.m2375z(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        int i4 = AbstractC1118i0.f4750a;
        if (i4 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if (z7) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    public Surface getSurface() {
        return this.displaySurface;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(AnalyticsListener.EVENT_DEVICE_INFO_CHANGED)
    public void handleInputBufferSupplementalData(C1872g c1872g) {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            ByteBuffer byteBuffer = c1872g.supplementalData;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s8 == 60 && s9 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        MediaCodecAdapter codec = getCodec();
                        codec.getClass();
                        setHdr10PlusInfoV29(codec, bArr);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
            this.frameMetadataListener = videoFrameMetadataListener;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.tunnelingAudioSessionId != iIntValue) {
                this.tunnelingAudioSessionId = iIntValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.rendererPriority = ((Integer) obj).intValue();
            updateCodecImportance();
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.scalingMode = ((Integer) obj).intValue();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.changeFrameRateStrategy = iIntValue2;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setChangeFrameRateStrategy(iIntValue2);
                return;
            } else {
                this.videoFrameReleaseControl.setChangeFrameRateStrategy(iIntValue2);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            setVideoEffects((List) obj);
            return;
        }
        if (i != 14) {
            super.handleMessage(i, obj);
            return;
        }
        obj.getClass();
        C1134y c1134y = (C1134y) obj;
        if (c1134y.f4803a == 0 || c1134y.f4804b == 0) {
            return;
        }
        this.outputResolution = c1134y;
        VideoSink videoSink3 = this.videoSink;
        if (videoSink3 != null) {
            Surface surface = this.displaySurface;
            AbstractC1101a.m2360k(surface);
            videoSink3.setOutputSurfaceInfo(surface, c1134y);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        VideoSink videoSink = this.videoSink;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.isReady(zIsReady);
        }
        if (zIsReady && (getCodec() == null || this.displaySurface == null || this.tunneling)) {
            return true;
        }
        return this.videoFrameReleaseControl.isReady(zIsReady);
    }

    public boolean maybeDropBuffersToKeyframe(long j, boolean z7) {
        int iSkipSource = skipSource(j);
        if (iSkipSource == 0) {
            return false;
        }
        if (z7) {
            DecoderCounters decoderCounters = this.decoderCounters;
            decoderCounters.skippedInputBufferCount += iSkipSource;
            decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(iSkipSource, this.buffersInCodecCount);
        }
        flushOrReinitializeCodec();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception exc) {
        AbstractC1101a.m2365p(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j8) {
        this.eventDispatcher.decoderInitialized(str, j, j8);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        MediaCodecInfo codecInfo = getCodecInfo();
        codecInfo.getClass();
        this.codecHandlesHdr10PlusOutOfBandMetadata = codecInfo.isHdr10PlusOutOfBandMetadataSupported();
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.reportedVideoSize = null;
        this.periodDurationUs = -9223372036854775807L;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererDisabled();
        } else {
            this.videoFrameReleaseControl.onDisabled();
        }
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(C0194d2.f1085d);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z7, boolean z8) {
        super.onEnabled(z7, z8);
        boolean z9 = getConfiguration().tunneling;
        AbstractC1101a.m2359j((z9 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z9) {
            this.tunneling = z9;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        if (!this.hasSetVideoSink) {
            if (this.videoEffects != null && this.videoSink == null) {
                this.videoSink = new PlaybackVideoGraphWrapper.Builder(this.context, this.videoFrameReleaseControl).setClock(getClock()).build().getSink();
            }
            this.hasSetVideoSink = true;
        }
        VideoSink videoSink = this.videoSink;
        if (videoSink == null) {
            this.videoFrameReleaseControl.setClock(getClock());
            this.videoFrameReleaseControl.onEnabled(z8);
            return;
        }
        videoSink.setListener(new VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onError(VideoSink videoSink2, VideoSink.VideoSinkException videoSinkException) {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                mediaCodecVideoRenderer.setPendingPlaybackException(mediaCodecVideoRenderer.createRendererException(videoSinkException, videoSinkException.format, C0253x0.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED));
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFirstFrameRendered(VideoSink videoSink2) {
                if (MediaCodecVideoRenderer.this.displaySurface != null) {
                    MediaCodecVideoRenderer.this.notifyRenderedFirstFrame();
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameDropped(VideoSink videoSink2) {
                if (MediaCodecVideoRenderer.this.displaySurface != null) {
                    MediaCodecVideoRenderer.this.updateDroppedBufferCounters(0, 1);
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onVideoSizeChanged(VideoSink videoSink2, C0194d2 c0194d2) {
            }
        }, EnumC1525o.f5844j);
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
        if (this.displaySurface != null && !this.outputResolution.equals(C1134y.f4802c)) {
            this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
        }
        this.videoSink.setChangeFrameRateStrategy(this.changeFrameRateStrategy);
        this.videoSink.setPlaybackSpeed(getPlaybackSpeed());
        List<Object> list = this.videoEffects;
        if (list != null) {
            this.videoSink.setVideoEffects(list);
        }
        this.videoSink.onRendererEnabled(z8);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onInit() {
        super.onInit();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
        C0249w c0249w = formatHolder.format;
        c0249w.getClass();
        eventDispatcher.inputFormatChanged(c0249w, decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(C0249w c0249w, MediaFormat mediaFormat) {
        int integer;
        int i;
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            i = c0249w.f1529u;
            integer = c0249w.f1530v;
        } else {
            mediaFormat.getClass();
            boolean z7 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            int integer2 = z7 ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger("width");
            integer = z7 ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f8 = c0249w.f1533y;
        int i4 = c0249w.f1532x;
        if (i4 == 90 || i4 == 270) {
            f8 = 1.0f / f8;
            int i8 = integer;
            integer = i;
            i = i8;
        }
        this.decodedVideoSize = new C0194d2(f8, i, integer);
        if (this.videoSink == null || !this.pendingVideoSinkInputStreamChange) {
            this.videoFrameReleaseControl.setFrameRate(c0249w.f1531w);
        } else {
            onReadyToChangeVideoSinkInputStream();
            VideoSink videoSink = this.videoSink;
            C0246v c0246vM692a = c0249w.m692a();
            c0246vM692a.f1454t = i;
            c0246vM692a.f1455u = integer;
            c0246vM692a.f1458x = f8;
            videoSink.onInputStreamChanged(1, new C0249w(c0246vM692a));
        }
        this.pendingVideoSinkInputStreamChange = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z7) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(true);
            this.videoSink.setStreamTimestampInfo(getOutputStreamStartPositionUs(), getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs(), getLastResetPositionUs());
            this.pendingVideoSinkInputStreamChange = true;
        }
        super.onPositionReset(j, z7);
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.reset();
        }
        if (z7) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(false);
            } else {
                this.videoFrameReleaseControl.join(false);
            }
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j) {
        super.onProcessedOutputBuffer(j);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setStreamTimestampInfo(getOutputStreamStartPositionUs(), getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs(), getLastResetPositionUs());
        } else {
            this.videoFrameReleaseControl.onProcessedStreamChange();
        }
        this.pendingVideoSinkInputStreamChange = true;
        maybeSetupTunnelingForFirstFrame();
    }

    public void onProcessedTunneledBuffer(long j) {
        updateOutputFormatForTime(j);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(C1872g c1872g) {
        boolean z7 = this.tunneling;
        if (!z7) {
            this.buffersInCodecCount++;
        }
        if (AbstractC1118i0.f4750a >= 23 || !z7) {
            return;
        }
        onProcessedTunneledBuffer(c1872g.timeUs);
    }

    public void onReadyToChangeVideoSinkInputStream() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onReadyToInitializeCodec(C0249w c0249w) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.videoSink.initialize(c0249w);
        } catch (VideoSink.VideoSinkException e) {
            throw createRendererException(e, c0249w, C0253x0.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        super.onRelease();
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.ownsVideoSink) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        try {
            super.onReset();
        } finally {
            this.hasSetVideoSink = false;
            this.startPositionUs = -9223372036854775807L;
            releasePlaceholderSurface();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        ((C1135z) getClock()).getClass();
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStarted();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStopped();
        } else {
            this.videoFrameReleaseControl.onStopped();
        }
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(C0249w[] c0249wArr, long j, long j8, MediaSource.MediaPeriodId mediaPeriodId) {
        super.onStreamChanged(c0249wArr, j, j8, mediaPeriodId);
        if (this.startPositionUs == -9223372036854775807L) {
            this.startPositionUs = j;
        }
        updatePeriodDurationUs(mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j8, final MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, final int i, int i4, int i8, long j9, boolean z7, boolean z8, C0249w c0249w) throws ExoPlaybackException {
        mediaCodecAdapter.getClass();
        final long outputStreamOffsetUs = j9 - getOutputStreamOffsetUs();
        if (this.videoSink != null) {
            try {
                return this.videoSink.handleInputFrame(j9 + getBufferTimestampAdjustmentUs(), z8, j, j8, new VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.2
                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void render(long j10) {
                        MediaCodecVideoRenderer.this.renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, j10);
                    }

                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void skip() {
                        MediaCodecVideoRenderer.this.skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
                    }
                });
            } catch (VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.format, C0253x0.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
        int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j9, j, j8, getOutputStreamStartPositionUs(), z8, this.videoFrameReleaseInfo);
        if (frameReleaseAction == 4) {
            return false;
        }
        if (z7 && !z8) {
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            return true;
        }
        if (this.displaySurface == null) {
            if (this.videoFrameReleaseInfo.getEarlyUs() >= 30000) {
                return false;
            }
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 0) {
            ((C1135z) getClock()).getClass();
            long jNanoTime = System.nanoTime();
            notifyFrameMetadataListener(outputStreamOffsetUs, jNanoTime, c0249w);
            renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, jNanoTime);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            releaseFrame(mediaCodecAdapter, i, outputStreamOffsetUs, c0249w);
            return true;
        }
        if (frameReleaseAction == 2) {
            dropOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction != 3) {
            if (frameReleaseAction == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(frameReleaseAction));
        }
        skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
        updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void render(long j, long j8) throws ExoPlaybackException {
        super.render(j, j8);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j, j8);
            } catch (VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.format, C0253x0.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
    }

    public void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i, long j, long j8) {
        Trace.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, j8);
        Trace.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.buffersInCodecCount = 0;
    }

    public void setOutputSurfaceV23(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f8, float f9) {
        super.setPlaybackSpeed(f8, f9);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f8);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f8);
        }
    }

    public void setVideoEffects(List<Object> list) {
        this.videoEffects = list;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setVideoEffects(list);
        }
    }

    public boolean shouldDropBuffersToKeyframe(long j, long j8, boolean z7) {
        return j < MIN_EARLY_US_VERY_LATE_THRESHOLD && !z7;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldDropFrame(long j, long j8, boolean z7) {
        return shouldDropOutputBuffer(j, j8, z7);
    }

    public boolean shouldDropOutputBuffer(long j, long j8, boolean z7) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && !z7;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldForceReleaseFrame(long j, long j8) {
        return shouldForceRenderOutputBuffer(j, j8);
    }

    public boolean shouldForceRenderOutputBuffer(long j, long j8) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && j8 > 100000;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldIgnoreFrame(long j, long j8, long j9, boolean z7, boolean z8) {
        return shouldDropBuffersToKeyframe(j, j9, z7) && maybeDropBuffersToKeyframe(j8, z8);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return hasSurfaceForCodec(mediaCodecInfo);
    }

    public boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldSkipDecoderInputBuffer(C1872g c1872g) {
        if (!c1872g.notDependedOn() || isBufferProbablyLastSample(c1872g) || c1872g.isEncrypted()) {
            return false;
        }
        return isBufferBeforeStartTime(c1872g);
    }

    public boolean shouldUseDetachedSurface(MediaCodecInfo mediaCodecInfo) {
        return AbstractC1118i0.f4750a >= 35 && mediaCodecInfo.detachedSurfaceSupported;
    }

    public void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        Trace.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    public void updateDroppedBufferCounters(int i, int i4) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i;
        int i8 = i + i4;
        decoderCounters.droppedBufferCount += i8;
        this.droppedFrames += i8;
        int i9 = this.consecutiveDroppedFrameCount + i8;
        this.consecutiveDroppedFrameCount = i9;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i9, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i10 = this.maxDroppedFramesToNotify;
        if (i10 <= 0 || this.droppedFrames < i10) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    public void updateVideoFrameProcessingOffsetCounters(long j) {
        this.decoderCounters.addVideoFrameProcessingOffset(j);
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount++;
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j) {
        this(context, mediaCodecSelector, j, null, null, 0);
    }

    @Deprecated
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        Trace.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, true);
        Trace.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, C0249w c0249w) {
        return supportsFormatInternal(this.context, mediaCodecSelector, c0249w);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, j, false, handler, videoRendererEventListener, i, 30.0f);
    }

    private static List<MediaCodecInfo> getDecoderInfos(Context context, MediaCodecSelector mediaCodecSelector, C0249w c0249w, boolean z7, boolean z8) {
        String str = c0249w.f1522n;
        if (str == null) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            return C0981l1.f4211n;
        }
        if (AbstractC1118i0.f4750a >= 26 && "video/dolby-vision".equals(str) && !Api26.doesDisplaySupportDolbyVision(context)) {
            List<MediaCodecInfo> alternativeDecoderInfos = MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, c0249w, z7, z8);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, c0249w, z7, z8);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, boolean z7, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, j, z7, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z7, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, factory, mediaCodecSelector, j, z7, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z7, Handler handler, VideoRendererEventListener videoRendererEventListener, int i, float f8) {
        this(context, factory, mediaCodecSelector, j, z7, handler, videoRendererEventListener, i, f8, (VideoSink) null);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z7, Handler handler, VideoRendererEventListener videoRendererEventListener, int i, float f8, VideoSinkProvider videoSinkProvider) {
        this(context, factory, mediaCodecSelector, j, z7, handler, videoRendererEventListener, i, f8, videoSinkProvider == null ? null : videoSinkProvider.getSink());
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z7, Handler handler, VideoRendererEventListener videoRendererEventListener, int i, float f8, VideoSink videoSink) {
        super(2, factory, mediaCodecSelector, z7, f8);
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = i;
        this.videoSink = videoSink;
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.ownsVideoSink = videoSink == null;
        this.videoFrameReleaseControl = new VideoFrameReleaseControl(applicationContext, this, j);
        this.videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.outputResolution = C1134y.f4802c;
        this.scalingMode = 1;
        this.changeFrameRateStrategy = 0;
        this.decodedVideoSize = C0194d2.f1085d;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = -1000;
        this.startPositionUs = -9223372036854775807L;
        this.periodDurationUs = -9223372036854775807L;
    }
}
