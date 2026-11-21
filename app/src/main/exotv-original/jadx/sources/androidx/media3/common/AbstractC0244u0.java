package androidx.media3.common;

import android.text.TextUtils;
import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.u0 */
/* loaded from: classes.dex */
public abstract class AbstractC0244u0 {

    /* renamed from: a */
    public static final ArrayList f1422a = new ArrayList();

    /* renamed from: b */
    public static final Pattern f1423b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: a */
    public static boolean m672a(String str, String str2) {
        C0228p c0228pM678g;
        int iM656a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (c0228pM678g = m678g(str2)) != null && (iM656a = c0228pM678g.m656a()) != 0 && iM656a != 16) {
                }
                break;
        }
        return false;
    }

    /* renamed from: b */
    public static String m673b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC1118i0.m2443d0(str)) {
            String strM676e = m676e(str2);
            if (strM676e != null && m682k(strM676e)) {
                return strM676e;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m674c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM2443d0 = AbstractC1118i0.m2443d0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM2443d0) {
                if (str2.equals(m676e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: d */
    public static int m675d(String str, String str2) {
        C0228p c0228pM678g;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c0228pM678g = m678g(str2)) == null) {
                    return 0;
                }
                return c0228pM678g.m656a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    public static String m676e(String str) {
        C0228p c0228pM678g;
        String strM677f = null;
        if (str != null) {
            String strM1517e0 = AbstractC0714c.m1517e0(str.trim());
            if (strM1517e0.startsWith("avc1") || strM1517e0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strM1517e0.startsWith("hev1") || strM1517e0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strM1517e0.startsWith("dvav") || strM1517e0.startsWith("dva1") || strM1517e0.startsWith("dvhe") || strM1517e0.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strM1517e0.startsWith("av01")) {
                return "video/av01";
            }
            if (strM1517e0.startsWith("vp9") || strM1517e0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strM1517e0.startsWith("vp8") || strM1517e0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strM1517e0.startsWith("mp4a")) {
                if (strM1517e0.startsWith("mp4a.") && (c0228pM678g = m678g(strM1517e0)) != null) {
                    strM677f = m677f(c0228pM678g.f1276a);
                }
                return strM677f == null ? "audio/mp4a-latm" : strM677f;
            }
            if (strM1517e0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strM1517e0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strM1517e0.startsWith("ac-3") || strM1517e0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strM1517e0.startsWith("ec-3") || strM1517e0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strM1517e0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strM1517e0.startsWith("ac-4") || strM1517e0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strM1517e0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strM1517e0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strM1517e0.startsWith("dtsh") || strM1517e0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strM1517e0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strM1517e0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strM1517e0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strM1517e0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strM1517e0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strM1517e0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strM1517e0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strM1517e0.contains("eia608") || strM1517e0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f1422a;
            if (arrayList.size() > 0) {
                throw AbstractC0008a1.m10f(0, arrayList);
            }
        }
        return null;
    }

    /* renamed from: f */
    public static String m677f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: g */
    public static C0228p m678g(String str) {
        Matcher matcher = f1423b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C0228p(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m679h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* renamed from: i */
    public static int m680i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m682k(str)) {
            return 1;
        }
        if (m686o(str)) {
            return 2;
        }
        if (m685n(str)) {
            return 3;
        }
        if (m683l(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f1422a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        throw AbstractC0008a1.m10f(0, arrayList);
    }

    /* renamed from: j */
    public static String m681j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC1118i0.m2443d0(str)) {
            String strM676e = m676e(str2);
            if (strM676e != null && m686o(strM676e)) {
                return strM676e;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m682k(String str) {
        return "audio".equals(m679h(str));
    }

    /* renamed from: l */
    public static boolean m683l(String str) {
        return "image".equals(m679h(str)) || "application/x-image-uri".equals(str);
    }

    /* renamed from: m */
    public static boolean m684m(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* renamed from: n */
    public static boolean m685n(String str) {
        return "text".equals(m679h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: o */
    public static boolean m686o(String str) {
        return "video".equals(m679h(str));
    }

    /* renamed from: p */
    public static String m687p(String str) {
        String strM1517e0;
        if (str == null) {
            return null;
        }
        strM1517e0 = AbstractC0714c.m1517e0(str);
        strM1517e0.getClass();
        switch (strM1517e0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM1517e0;
        }
    }
}
