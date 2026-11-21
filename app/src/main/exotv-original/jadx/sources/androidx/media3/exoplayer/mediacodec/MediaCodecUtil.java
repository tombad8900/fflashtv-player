package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0228p;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1105c;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p071i1.AbstractC1237p;
import p071i1.C1229h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class MediaCodecUtil {
    private static final String TAG = "MediaCodecUtil";
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String str, boolean z7, boolean z8) {
            this.mimeType = str;
            this.secure = z7;
            this.tunneling = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((AbstractC0008a1.m9e(this.mimeType, 31, 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z7, boolean z8) {
            this.codecKind = (z7 || z8) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface ScoreProvider<T> {
        int getScore(T t8);
    }

    private MediaCodecUtil() {
    }

    private static void applyWorkarounds(String str, List<MediaCodecInfo> list) {
        if ("audio/raw".equals(str)) {
            if (AbstractC1118i0.f4750a < 26 && AbstractC1118i0.f4751b.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            sortByScore(list, new C0393e());
        }
        if (AbstractC1118i0.f4750a >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int avcLevelToMaxFrameSize(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED /* 4096 */:
                return 2097152;
            case DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE /* 32768 */:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static synchronized void clearDecoderInfoCache() {
        decoderInfosCache.clear();
    }

    public static String getAlternativeCodecMimeType(C0249w c0249w) {
        Pair<Integer, Integer> codecProfileAndLevel;
        String str = c0249w.f1522n;
        String str2 = c0249w.f1522n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (codecProfileAndLevel = getCodecProfileAndLevel(c0249w)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<MediaCodecInfo> getAlternativeDecoderInfos(MediaCodecSelector mediaCodecSelector, C0249w c0249w, boolean z7, boolean z8) {
        String alternativeCodecMimeType = getAlternativeCodecMimeType(c0249w);
        if (alternativeCodecMimeType != null) {
            return mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z7, z8);
        }
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03e4 A[Catch: NumberFormatException -> 0x03f2, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x03f2, blocks: (B:273:0x0396, B:275:0x03a8, B:286:0x03c6, B:297:0x03e4), top: B:433:0x0396 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> getCodecProfileAndLevel(C0249w c0249w) {
        char c8;
        int i;
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num;
        char c9;
        Integer num2;
        byte[] bArr = AbstractC1105c.f4716a;
        Integer numValueOf = 1;
        String str = c0249w.f1519k;
        C0216l c0216l = c0249w.f1497B;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i13 = 16;
        if (!"video/dolby-vision".equals(c0249w.f1522n)) {
            String str2 = strArrSplit[0];
            str2.getClass();
            switch (str2.hashCode()) {
                case 3004662:
                    if (!str2.equals("av01")) {
                        c8 = '\uffff';
                        break;
                    } else {
                        c8 = 0;
                        break;
                    }
                case 3006243:
                    if (str2.equals("avc1")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3006244:
                    if (str2.equals("avc2")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 3199032:
                    if (str2.equals("hev1")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 3214780:
                    if (str2.equals("hvc1")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        c8 = 7;
                        break;
                    }
                    break;
            }
            int i14 = 16384;
            switch (c8) {
                case 0:
                    if (strArrSplit.length >= 4) {
                        try {
                            int i15 = Integer.parseInt(strArrSplit[1]);
                            int i16 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                            int i17 = Integer.parseInt(strArrSplit[3]);
                            if (i15 != 0) {
                                AbstractC0008a1.m23s("Unknown AV1 profile: ", i15, "CodecSpecificDataUtil");
                                return null;
                            }
                            if (i17 != 8 && i17 != 10) {
                                AbstractC0008a1.m23s("Unknown AV1 bit depth: ", i17, "CodecSpecificDataUtil");
                                return null;
                            }
                            int i18 = i17 == 8 ? 1 : (c0216l == null || !(c0216l.f1188d != null || (i = c0216l.f1187c) == 7 || i == 6)) ? 2 : 4096;
                            switch (i16) {
                                case 0:
                                    i14 = 1;
                                    i4 = -1;
                                    break;
                                case 1:
                                    i14 = 2;
                                    i4 = -1;
                                    break;
                                case 2:
                                    i14 = 4;
                                    i4 = -1;
                                    break;
                                case 3:
                                    i14 = 8;
                                    i4 = -1;
                                    break;
                                case 4:
                                    i14 = 16;
                                    i4 = -1;
                                    break;
                                case 5:
                                    i14 = 32;
                                    i4 = -1;
                                    break;
                                case 6:
                                    i14 = 64;
                                    i4 = -1;
                                    break;
                                case 7:
                                    i14 = 128;
                                    i4 = -1;
                                    break;
                                case 8:
                                    i14 = 256;
                                    i4 = -1;
                                    break;
                                case 9:
                                    i14 = 512;
                                    i4 = -1;
                                    break;
                                case 10:
                                    i14 = 1024;
                                    i4 = -1;
                                    break;
                                case 11:
                                    i14 = 2048;
                                    i4 = -1;
                                    break;
                                case 12:
                                    i14 = 4096;
                                    i4 = -1;
                                    break;
                                case 13:
                                    i14 = 8192;
                                    i4 = -1;
                                    break;
                                case 14:
                                    i4 = -1;
                                    break;
                                case 15:
                                    i14 = 32768;
                                    i4 = -1;
                                    break;
                                case 16:
                                    i14 = 65536;
                                    i4 = -1;
                                    break;
                                case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                                    i14 = 131072;
                                    i4 = -1;
                                    break;
                                case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                                    i14 = 262144;
                                    i4 = -1;
                                    break;
                                case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                                    i14 = 524288;
                                    i4 = -1;
                                    break;
                                case 20:
                                    i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                    i4 = -1;
                                    break;
                                case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                                    i14 = 2097152;
                                    i4 = -1;
                                    break;
                                case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                                    i14 = 4194304;
                                    i4 = -1;
                                    break;
                                case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                                    i14 = 8388608;
                                    i4 = -1;
                                    break;
                                default:
                                    i4 = -1;
                                    i14 = -1;
                                    break;
                            }
                            if (i14 != i4) {
                                return new Pair<>(Integer.valueOf(i18), Integer.valueOf(i14));
                            }
                            AbstractC0008a1.m23s("Unknown AV1 level: ", i16, "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused) {
                            AbstractC0008a1.m24t("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0008a1.m24t("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                    break;
                case 1:
                case 2:
                    if (strArrSplit.length >= 2) {
                        try {
                            if (strArrSplit[1].length() == 6) {
                                i8 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                i9 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                            } else {
                                if (strArrSplit.length < 3) {
                                    AbstractC1101a.m2348F("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                                    return null;
                                }
                                i8 = Integer.parseInt(strArrSplit[1]);
                                i9 = Integer.parseInt(strArrSplit[2]);
                            }
                            int i19 = i8 != 66 ? i8 != 77 ? i8 != 88 ? i8 != 100 ? i8 != 110 ? i8 != 122 ? i8 != 244 ? -1 : 64 : 32 : 16 : 8 : 4 : 2 : 1;
                            if (i19 == -1) {
                                AbstractC0008a1.m23s("Unknown AVC profile: ", i8, "CodecSpecificDataUtil");
                                return null;
                            }
                            switch (i9) {
                                case 10:
                                    i10 = -1;
                                    i14 = 1;
                                    break;
                                case 11:
                                    i10 = -1;
                                    i14 = 4;
                                    break;
                                case 12:
                                    i10 = -1;
                                    i14 = 8;
                                    break;
                                case 13:
                                    i14 = 16;
                                    i10 = -1;
                                    break;
                                default:
                                    switch (i9) {
                                        case 20:
                                            i14 = 32;
                                            i10 = -1;
                                            break;
                                        case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                                            i14 = 64;
                                            i10 = -1;
                                            break;
                                        case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                                            i14 = 128;
                                            i10 = -1;
                                            break;
                                        default:
                                            switch (i9) {
                                                case AnalyticsListener.EVENT_DEVICE_VOLUME_CHANGED /* 30 */:
                                                    i14 = 256;
                                                    i10 = -1;
                                                    break;
                                                case 31:
                                                    i14 = 512;
                                                    i10 = -1;
                                                    break;
                                                case 32:
                                                    i14 = 1024;
                                                    i10 = -1;
                                                    break;
                                                default:
                                                    switch (i9) {
                                                        case 40:
                                                            i14 = 2048;
                                                            i10 = -1;
                                                            break;
                                                        case 41:
                                                            i14 = 4096;
                                                            i10 = -1;
                                                            break;
                                                        case 42:
                                                            i14 = 8192;
                                                            i10 = -1;
                                                            break;
                                                        default:
                                                            switch (i9) {
                                                                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                                                                    i10 = -1;
                                                                    break;
                                                                case 51:
                                                                    i14 = 32768;
                                                                    i10 = -1;
                                                                    break;
                                                                case 52:
                                                                    i14 = 65536;
                                                                    i10 = -1;
                                                                    break;
                                                                default:
                                                                    i10 = -1;
                                                                    i14 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i14 != i10) {
                                return new Pair<>(Integer.valueOf(i19), Integer.valueOf(i14));
                            }
                            AbstractC0008a1.m23s("Unknown AVC level: ", i9, "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused2) {
                            AbstractC0008a1.m24t("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0008a1.m24t("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                case 3:
                case 4:
                    return AbstractC1105c.m2386b(str, strArrSplit, c0216l);
                case 5:
                    if (strArrSplit.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(AbstractC0244u0.m677f(Integer.parseInt(strArrSplit[1], 16)))) {
                                int i20 = Integer.parseInt(strArrSplit[2]);
                                int i21 = 17;
                                if (i20 == 17) {
                                    i11 = -1;
                                    if (i21 != i11) {
                                        return new Pair<>(Integer.valueOf(i21), 0);
                                    }
                                } else {
                                    if (i20 != 20) {
                                        i21 = 23;
                                        if (i20 != 23) {
                                            i21 = 29;
                                            if (i20 != 29) {
                                                i21 = 39;
                                                if (i20 != 39) {
                                                    i21 = 42;
                                                    if (i20 != 42) {
                                                        switch (i20) {
                                                            case 1:
                                                                i11 = -1;
                                                                i21 = 1;
                                                                break;
                                                            case 2:
                                                                i11 = -1;
                                                                i21 = 2;
                                                                break;
                                                            case 3:
                                                                i11 = -1;
                                                                i21 = 3;
                                                                break;
                                                            case 4:
                                                                i11 = -1;
                                                                i21 = 4;
                                                                break;
                                                            case 5:
                                                                i11 = -1;
                                                                i21 = 5;
                                                                break;
                                                            case 6:
                                                                i11 = -1;
                                                                i21 = 6;
                                                                break;
                                                            default:
                                                                i11 = -1;
                                                                i21 = -1;
                                                                break;
                                                        }
                                                    }
                                                    if (i21 != i11) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i21 = 20;
                                    }
                                    i11 = -1;
                                    if (i21 != i11) {
                                    }
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            AbstractC0008a1.m24t("Ignoring malformed MP4A codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0008a1.m24t("Ignoring malformed MP4A codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                    break;
                case 6:
                    Pair<Integer, Integer> pair = new Pair<>(numValueOf, numValueOf);
                    if (strArrSplit.length < 3) {
                        AbstractC0008a1.m24t("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
                        return pair;
                    }
                    try {
                        return new Pair<>(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                    } catch (NumberFormatException unused4) {
                        AbstractC0008a1.m24t("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
                        return pair;
                    }
                case 7:
                    if (strArrSplit.length >= 3) {
                        try {
                            int i22 = Integer.parseInt(strArrSplit[1]);
                            int i23 = Integer.parseInt(strArrSplit[2]);
                            int i24 = i22 != 0 ? i22 != 1 ? i22 != 2 ? i22 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i24 == -1) {
                                AbstractC0008a1.m23s("Unknown VP9 profile: ", i22, "CodecSpecificDataUtil");
                                return null;
                            }
                            if (i23 == 10) {
                                i12 = -1;
                                i13 = 1;
                            } else if (i23 == 11) {
                                i12 = -1;
                                i13 = 2;
                            } else if (i23 == 20) {
                                i12 = -1;
                                i13 = 4;
                            } else if (i23 == 21) {
                                i12 = -1;
                                i13 = 8;
                            } else if (i23 == 30) {
                                i12 = -1;
                            } else {
                                if (i23 == 31) {
                                    i13 = 32;
                                } else if (i23 == 40) {
                                    i13 = 64;
                                } else if (i23 == 41) {
                                    i13 = 128;
                                } else if (i23 == 50) {
                                    i13 = 256;
                                } else if (i23 != 51) {
                                    switch (i23) {
                                        case 60:
                                            i13 = 2048;
                                            break;
                                        case 61:
                                            i13 = 4096;
                                            break;
                                        case 62:
                                            i13 = 8192;
                                            break;
                                        default:
                                            i12 = -1;
                                            i13 = -1;
                                            break;
                                    }
                                } else {
                                    i13 = 512;
                                }
                                i12 = -1;
                            }
                            if (i13 != i12) {
                                return new Pair<>(Integer.valueOf(i24), Integer.valueOf(i13));
                            }
                            AbstractC0008a1.m23s("Unknown VP9 level: ", i23, "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused5) {
                            AbstractC0008a1.m24t("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0008a1.m24t("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                default:
                    return null;
            }
            return null;
        }
        if (strArrSplit.length < 3) {
            AbstractC0008a1.m24t("Ignoring malformed Dolby Vision codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = AbstractC1105c.f4718c.matcher(strArrSplit[1]);
        if (!matcher.matches()) {
            AbstractC0008a1.m24t("Ignoring malformed Dolby Vision codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            switch (strGroup.hashCode()) {
                case 1536:
                    num = 8;
                    if (!strGroup.equals("00")) {
                        c9 = '\uffff';
                        break;
                    } else {
                        c9 = 0;
                        break;
                    }
                case 1537:
                    if (strGroup.equals("01")) {
                        num = 8;
                        c9 = 1;
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1538:
                    if (strGroup.equals("02")) {
                        num = 8;
                        c9 = 2;
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1539:
                    if (strGroup.equals("03")) {
                        num = 8;
                        c9 = 3;
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1540:
                    if (strGroup.equals("04")) {
                        num = 8;
                        c9 = 4;
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1541:
                    if (strGroup.equals("05")) {
                        num = 8;
                        c9 = 5;
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1542:
                    if (strGroup.equals("06")) {
                        num = 8;
                        c9 = 6;
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1543:
                    if (strGroup.equals("07")) {
                        num = 8;
                        c9 = 7;
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1544:
                    if (strGroup.equals("08")) {
                        num = 8;
                        c9 = '\b';
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1545:
                    if (strGroup.equals("09")) {
                        num = 8;
                        c9 = '\t';
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                case 1567:
                    if (strGroup.equals("10")) {
                        num = 8;
                        c9 = '\n';
                        break;
                    }
                    num = 8;
                    c9 = '\uffff';
                    break;
                default:
                    num = 8;
                    c9 = '\uffff';
                    break;
            }
            switch (c9) {
                case 0:
                    num2 = numValueOf;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = num;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case '\b':
                    num2 = 256;
                    break;
                case '\t':
                    num2 = 512;
                    break;
                case '\n':
                    num2 = 1024;
                    break;
            }
            if (num2 != null) {
                AbstractC0008a1.m24t("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            String str3 = strArrSplit[2];
            if (str3 != null) {
                switch (str3) {
                    case "02":
                        numValueOf = 2;
                        break;
                    case "03":
                        numValueOf = 4;
                        break;
                    case "04":
                        numValueOf = num;
                        break;
                    case "05":
                        numValueOf = 16;
                        break;
                    case "06":
                        numValueOf = 32;
                        break;
                    case "07":
                        numValueOf = 64;
                        break;
                    case "08":
                        numValueOf = 128;
                        break;
                    case "09":
                        numValueOf = 256;
                        break;
                    case "10":
                        numValueOf = 512;
                        break;
                    case "11":
                        numValueOf = 1024;
                        break;
                    case "12":
                        numValueOf = 2048;
                        break;
                    case "13":
                        numValueOf = Integer.valueOf(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
                        break;
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return new Pair<>(num2, numValueOf);
            }
            AbstractC0008a1.m24t("Unknown Dolby Vision level string: ", str3, "CodecSpecificDataUtil");
            return null;
        }
        num = 8;
        num2 = null;
        if (num2 != null) {
        }
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z7, boolean z8) {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z7, z8);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z7, boolean z8) {
        try {
            CodecKey codecKey = new CodecKey(str, z7, z8);
            HashMap<CodecKey, List<MediaCodecInfo>> map = decoderInfosCache;
            List<MediaCodecInfo> list = map.get(codecKey);
            if (list != null) {
                return list;
            }
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV21(z7, z8));
            if (z7 && decoderInfosInternal.isEmpty() && AbstractC1118i0.f4750a <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV16());
                if (!decoderInfosInternal.isEmpty()) {
                    AbstractC1101a.m2348F(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            AbstractC0983m0 abstractC0983m0M2165j = AbstractC0983m0.m2165j(decoderInfosInternal);
            map.put(codecKey, abstractC0983m0M2165j);
            return abstractC0983m0M2165j;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[PHI: r16
      0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) throws Exception {
        String str;
        int i;
        boolean z7;
        boolean z8;
        CodecKey codecKey2 = codecKey;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str2 = codecKey2.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            int i4 = 0;
            while (i4 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat.getCodecInfoAt(i4);
                if (isAlias(codecInfoAt)) {
                    z7 = zSecureDecodersExplicit;
                    i = i4;
                } else {
                    String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, zSecureDecodersExplicit, str2)) {
                        int i8 = i4;
                        String codecMimeType = getCodecMimeType(codecInfoAt, name, str2);
                        if (codecMimeType == null) {
                            z7 = zSecureDecodersExplicit;
                            i = i8;
                        } else {
                            boolean z9 = zSecureDecodersExplicit;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                                boolean zIsFeatureSupported = mediaCodecListCompat.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean zIsFeatureRequired = mediaCodecListCompat.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean z10 = codecKey2.tunneling;
                                if ((z10 || !zIsFeatureRequired) && (!z10 || zIsFeatureSupported)) {
                                    boolean zIsFeatureSupported2 = mediaCodecListCompat.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean zIsFeatureRequired2 = mediaCodecListCompat.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean z11 = codecKey2.secure;
                                    if ((z11 || !zIsFeatureRequired2) && (!z11 || zIsFeatureSupported2)) {
                                        try {
                                            boolean zIsHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str2);
                                            try {
                                                boolean zIsSoftwareOnly = isSoftwareOnly(codecInfoAt, str2);
                                                boolean zIsVendor = isVendor(codecInfoAt);
                                                if (z9) {
                                                    z8 = zIsVendor;
                                                    if (codecKey2.secure == zIsFeatureSupported2) {
                                                        z7 = z9;
                                                        boolean z12 = z8;
                                                        i = i8;
                                                        try {
                                                            arrayList.add(MediaCodecInfo.newInstance(name, str2, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z12, false, false));
                                                        } catch (Exception e) {
                                                            e = e;
                                                            str = name;
                                                            if (AbstractC1118i0.f4750a > 23) {
                                                            }
                                                            AbstractC1101a.m2364o(TAG, "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z8 = zIsVendor;
                                                }
                                                if (!z9) {
                                                    try {
                                                        if (!codecKey2.secure) {
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        i = i8;
                                                        z7 = z9;
                                                        str = name;
                                                        if (AbstractC1118i0.f4750a > 23 || arrayList.isEmpty()) {
                                                            AbstractC1101a.m2364o(TAG, "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                            throw e;
                                                        }
                                                        AbstractC1101a.m2364o(TAG, "Skipping codec " + str + " (failed to query capabilities)");
                                                        i4 = i + 1;
                                                        codecKey2 = codecKey;
                                                        zSecureDecodersExplicit = z7;
                                                    }
                                                }
                                                z7 = z9;
                                                boolean z13 = z8;
                                                i = i8;
                                                if (!z7 && zIsFeatureSupported2) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(MediaCodecInfo.newInstance(name + ".secure", str2, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z13, false, true));
                                                        break;
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        if (AbstractC1118i0.f4750a > 23) {
                                                        }
                                                        AbstractC1101a.m2364o(TAG, "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                str = name;
                                                i = i8;
                                                z7 = z9;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            str = name;
                                            z7 = z9;
                                            i = i8;
                                        }
                                    } else {
                                        i = i8;
                                        z7 = z9;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str = name;
                                i = i8;
                                z7 = z9;
                            }
                        }
                    } else {
                        z7 = zSecureDecodersExplicit;
                        i = i4;
                    }
                }
                i4 = i + 1;
                codecKey2 = codecKey;
                zSecureDecodersExplicit = z7;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new DecoderQueryException(e13);
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List<MediaCodecInfo> getDecoderInfosSoftMatch(MediaCodecSelector mediaCodecSelector, C0249w c0249w, boolean z7, boolean z8) {
        List<MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(c0249w.f1522n, z7, z8);
        List<MediaCodecInfo> alternativeDecoderInfos = getAlternativeDecoderInfos(mediaCodecSelector, c0249w, z7, z8);
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        c0974j0M2164i.m2143c(decoderInfos);
        c0974j0M2164i.m2143c(alternativeDecoderInfos);
        return c0974j0M2164i.m2159f();
    }

    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> list, final C0249w c0249w) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new ScoreProvider() { // from class: androidx.media3.exoplayer.mediacodec.f
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(Object obj) {
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(c0249w, (MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo getDecryptOnlyDecoderInfo() {
        return getDecoderInfo("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> getHevcBaseLayerCodecProfileAndLevel(C0249w c0249w) {
        String strM2385a;
        List list = c0249w.f1525q;
        int i = 0;
        loop0: while (true) {
            if (i >= list.size()) {
                strM2385a = null;
                break;
            }
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
                int i4 = 0;
                while (i4 < bArr.length) {
                    int iM2681b = AbstractC1237p.m2681b(bArr, i4, bArr.length, zArr);
                    if (iM2681b != bArr.length) {
                        c0974j0M2164i.m2141a(Integer.valueOf(iM2681b));
                    }
                    i4 = iM2681b + 3;
                }
                C0981l1 c0981l1M2159f = c0974j0M2164i.m2159f();
                for (int i8 = 0; i8 < c0981l1M2159f.f4213m; i8++) {
                    if (((Integer) c0981l1M2159f.get(i8)).intValue() + 3 < length) {
                        C1131v c1131v = new C1131v(bArr, ((Integer) c0981l1M2159f.get(i8)).intValue() + 3, length);
                        C0228p c0228pM2683d = AbstractC1237p.m2683d(c1131v);
                        if (c0228pM2683d.f1276a == 33 && c0228pM2683d.f1277b == 0) {
                            c1131v.m2505v(4);
                            int iM2494k = c1131v.m2494k(3);
                            c1131v.m2504u();
                            C1229h c1229hM2684e = AbstractC1237p.m2684e(c1131v, true, iM2494k, null);
                            strM2385a = AbstractC1105c.m2385a(c1229hM2684e.f5122a, c1229hM2684e.f5123b, c1229hM2684e.f5124c, c1229hM2684e.f5125d, c1229hM2684e.f5126e, c1229hM2684e.f5127f);
                            break loop0;
                        }
                    }
                }
            }
            i++;
        }
        if (strM2385a == null) {
            return null;
        }
        String strTrim = strM2385a.trim();
        int i9 = AbstractC1118i0.f4750a;
        return AbstractC1105c.m2386b(strM2385a, strTrim.split("\\.", -1), c0249w.f1497B);
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return AbstractC1118i0.f4750a >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z7, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z7 && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC1118i0.f4750a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC1118i0.f4752c))) {
            String str3 = AbstractC1118i0.f4751b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        return AbstractC1118i0.f4750a >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC1118i0.f4750a >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (AbstractC0244u0.m682k(str)) {
            return true;
        }
        String strM1517e0 = AbstractC0714c.m1517e0(mediaCodecInfo.getName());
        if (strM1517e0.startsWith("arc.")) {
            return false;
        }
        return strM1517e0.startsWith("omx.google.") || strM1517e0.startsWith("omx.ffmpeg.") || (strM1517e0.startsWith("omx.sec.") && strM1517e0.contains(".sw.")) || strM1517e0.equals("omx.qcom.video.decoder.hevcswvdec") || strM1517e0.startsWith("c2.android.") || strM1517e0.startsWith("c2.google.") || !(strM1517e0.startsWith("omx.") || strM1517e0.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (AbstractC1118i0.f4750a >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String strM1517e0 = AbstractC0714c.m1517e0(mediaCodecInfo.getName());
        return (strM1517e0.startsWith("omx.google.") || strM1517e0.startsWith("c2.android.") || strM1517e0.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyWorkarounds$1(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC1118i0.f4750a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(C0249w c0249w, MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatFunctionallySupported(c0249w) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortByScore$2(ScoreProvider scoreProvider, Object obj, Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    public static int maxH264DecodableFrameSize() {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, 345600);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    private static <T> void sortByScore(List<T> list, final ScoreProvider<T> scoreProvider) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.lambda$sortByScore$2(scoreProvider, obj, obj2);
            }
        });
    }

    public static void warmDecoderInfoCache(String str, boolean z7, boolean z8) {
        try {
            getDecoderInfos(str, z7, z8);
        } catch (DecoderQueryException e) {
            AbstractC1101a.m2365p(TAG, "Codec warming failed", e);
        }
    }
}
