package p063h1;

import android.util.Pair;
import androidx.media3.common.C0216l;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import okhttp3.internal.http2.C2122f;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.c */
/* loaded from: classes.dex */
public abstract class AbstractC1105c {

    /* renamed from: a */
    public static final byte[] f4716a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f4717b = {C2181z.FRAGMENT_ENCODE_SET, "A", "B", "C"};

    /* renamed from: c */
    public static final Pattern f4718c = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: a */
    public static String m2385a(int i, boolean z7, int i4, int i8, int[] iArr, int i9) {
        Object[] objArr = {f4717b[i], Integer.valueOf(i4), Integer.valueOf(i8), Character.valueOf(z7 ? 'H' : 'L'), Integer.valueOf(i9)};
        int i10 = AbstractC1118i0.f4750a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m2386b(String str, String[] strArr, C0216l c0216l) {
        int i;
        Integer numValueOf;
        if (strArr.length < 4) {
            AbstractC0008a1.m24t("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f4718c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC0008a1.m24t("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        char c8 = 6;
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (c0216l == null || c0216l.f1187c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                AbstractC0008a1.m24t("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (!str2.equals("H30")) {
                        c8 = '\uffff';
                        break;
                    } else {
                        c8 = 0;
                        break;
                    }
                case 70914:
                    if (str2.equals("H60")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 74758:
                    if (!str2.equals("L60")) {
                    }
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c8 = '\n';
                        break;
                    }
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c8 = 11;
                        break;
                    }
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c8 = '\f';
                        break;
                    }
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c8 = '\r';
                        break;
                    }
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c8 = 14;
                        break;
                    }
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c8 = 15;
                        break;
                    }
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c8 = 16;
                        break;
                    }
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c8 = 17;
                        break;
                    }
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c8 = 18;
                        break;
                    }
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c8 = 19;
                        break;
                    }
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c8 = 20;
                        break;
                    }
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c8 = 21;
                        break;
                    }
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c8 = 22;
                        break;
                    }
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c8 = 23;
                        break;
                    }
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c8 = 24;
                        break;
                    }
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c8 = 25;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    numValueOf = 2;
                    break;
                case 1:
                    numValueOf = 8;
                    break;
                case 2:
                    numValueOf = 32;
                    break;
                case 3:
                    numValueOf = 128;
                    break;
                case 4:
                    numValueOf = 512;
                    break;
                case 5:
                    numValueOf = 1;
                    break;
                case 6:
                    numValueOf = 4;
                    break;
                case 7:
                    numValueOf = 16;
                    break;
                case '\b':
                    numValueOf = 64;
                    break;
                case '\t':
                    numValueOf = 256;
                    break;
                case '\n':
                    numValueOf = 2048;
                    break;
                case 11:
                    numValueOf = Integer.valueOf(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED);
                    break;
                case '\f':
                    numValueOf = Integer.valueOf(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE);
                    break;
                case '\r':
                    numValueOf = 131072;
                    break;
                case 14:
                    numValueOf = 524288;
                    break;
                case 15:
                    numValueOf = 2097152;
                    break;
                case 16:
                    numValueOf = 8388608;
                    break;
                case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                    numValueOf = 33554432;
                    break;
                case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                    numValueOf = 1024;
                    break;
                case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                    numValueOf = Integer.valueOf(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
                    break;
                case 20:
                    numValueOf = 16384;
                    break;
                case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                    numValueOf = 65536;
                    break;
                case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                    numValueOf = 262144;
                    break;
                case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                    numValueOf = Integer.valueOf(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    break;
                case 24:
                    numValueOf = 4194304;
                    break;
                case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                    numValueOf = Integer.valueOf(C2122f.OKHTTP_CLIENT_WINDOW_SIZE);
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i), numValueOf);
        }
        AbstractC0008a1.m24t("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}
