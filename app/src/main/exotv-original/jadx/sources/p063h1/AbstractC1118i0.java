package p063h1;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0253x0;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.C2181z;
import okhttp3.internal.p129ws.C2155f;
import p002a1.AbstractC0008a1;
import p005a4.C0087j;
import p068h6.AbstractC1195b;
import p068h6.AbstractC1196c;
import p077j$.util.DesugarTimeZone;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1118i0 {

    /* renamed from: a */
    public static final int f4750a;

    /* renamed from: b */
    public static final String f4751b;

    /* renamed from: c */
    public static final String f4752c;

    /* renamed from: d */
    public static final String f4753d;

    /* renamed from: e */
    public static final String f4754e;

    /* renamed from: f */
    public static final byte[] f4755f;

    /* renamed from: g */
    public static final long[] f4756g;

    /* renamed from: h */
    public static final Pattern f4757h;

    /* renamed from: i */
    public static final Pattern f4758i;

    /* renamed from: j */
    public static final Pattern f4759j;

    /* renamed from: k */
    public static HashMap f4760k;

    /* renamed from: l */
    public static final String[] f4761l;

    /* renamed from: m */
    public static final String[] f4762m;

    /* renamed from: n */
    public static final int[] f4763n;

    /* renamed from: o */
    public static final int[] f4764o;

    /* renamed from: p */
    public static final int[] f4765p;

    static {
        int i = Build.VERSION.SDK_INT;
        f4750a = i;
        String str = Build.DEVICE;
        f4751b = str;
        String str2 = Build.MANUFACTURER;
        f4752c = str2;
        String str3 = Build.MODEL;
        f4753d = str3;
        f4754e = str + ", " + str3 + ", " + str2 + ", " + i;
        f4755f = new byte[0];
        f4756g = new long[0];
        f4757h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f4758i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f4759j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f4761l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f4762m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f4763n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f4764o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f4765p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, C2155f.PAYLOAD_SHORT, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static String m2410A(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: B */
    public static long m2411B(long j, float f8) {
        return f8 == 1.0f ? j : Math.round(j * f8);
    }

    /* renamed from: C */
    public static long m2412C(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    /* renamed from: D */
    public static int m2413D(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2414E(int i, int i4) {
        int i8 = 2;
        if (i != 2) {
            if (i == 3) {
                i8 = 1;
            } else if (i == 4) {
                i8 = 4;
            } else if (i == 21) {
                i8 = 3;
            } else if (i != 22) {
                if (i != 268435456) {
                    if (i != 1342177280) {
                        if (i != 1610612736) {
                            throw new IllegalArgumentException();
                        }
                        i8 = 4;
                    }
                    i8 = 3;
                }
            }
        }
        return i8 * i4;
    }

    /* renamed from: F */
    public static long m2415F(long j, float f8) {
        return f8 == 1.0f ? j : Math.round(j / f8);
    }

    /* renamed from: G */
    public static String m2416G(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : C2181z.FRAGMENT_ENCODE_SET;
        long jAbs = (Math.abs(j) + 500) / 1000;
        long j8 = jAbs % 60;
        long j9 = (jAbs / 60) % 60;
        long j10 = jAbs / 3600;
        sb.setLength(0);
        return j10 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j10), Long.valueOf(j9), Long.valueOf(j8)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j9), Long.valueOf(j8)).toString();
    }

    /* renamed from: H */
    public static String m2417H(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            AbstractC1101a.m2365p("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* renamed from: I */
    public static String m2418I(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? AbstractC0008a1.m14j("custom (", i, ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2419J(InterfaceC0193d1 interfaceC0193d1) {
        boolean z7 = false;
        if (interfaceC0193d1 == null) {
            return false;
        }
        int playbackState = interfaceC0193d1.getPlaybackState();
        if (playbackState != 1 || !interfaceC0193d1.isCommandAvailable(2)) {
            if (playbackState == 4 && interfaceC0193d1.isCommandAvailable(4)) {
                interfaceC0193d1.seekToDefaultPosition();
            }
            if (interfaceC0193d1.isCommandAvailable(1)) {
                return z7;
            }
            interfaceC0193d1.play();
            return true;
        }
        interfaceC0193d1.prepare();
        z7 = true;
        if (interfaceC0193d1.isCommandAvailable(1)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9 A[RETURN] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2420K(Uri uri, String str) {
        int i;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || !AbstractC0714c.m1493F("rtsp", scheme)) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (iLastIndexOf >= 0) {
                        String strM1517e0 = AbstractC0714c.m1517e0(lastPathSegment.substring(iLastIndexOf + 1));
                        strM1517e0.getClass();
                        switch (strM1517e0) {
                            case "ism":
                            case "isml":
                                i = 1;
                                break;
                            case "mpd":
                                i = 0;
                                break;
                            case "m3u8":
                                i = 2;
                                break;
                            default:
                                i = 4;
                                break;
                        }
                        if (i != 4) {
                            return i;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = f4759j.matcher(path);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(2);
                        if (strGroup != null) {
                            if (!strGroup.contains("format=mpd-time-csf")) {
                                if (strGroup.contains("format=m3u8-aapl")) {
                                    return 2;
                                }
                            }
                            return 0;
                        }
                        return 1;
                    }
                }
                return 4;
            }
            return 3;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    break;
                }
                break;
        }
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Switch insn not found in header
            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
            */
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p063h1.AbstractC1118i0.m2420K(android.net.Uri, java.lang.String):int");
    }

    /* renamed from: L */
    public static boolean m2421L(C1132w c1132w, C1132w c1132w2, Inflater inflater) {
        if (c1132w.m2515a() <= 0) {
            return false;
        }
        if (c1132w2.f4799a.length < c1132w.m2515a()) {
            c1132w2.m2516b(c1132w.m2515a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c1132w.f4799a, c1132w.f4800b, c1132w.m2515a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = c1132w2.f4799a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = c1132w2.f4799a;
                    if (iInflate == bArr2.length) {
                        c1132w2.m2516b(bArr2.length * 2);
                    }
                } else {
                    c1132w2.m2512F(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: M */
    public static void m2422M(int i) {
        Integer.toString(i, 36);
    }

    /* renamed from: N */
    public static boolean m2423N(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* renamed from: O */
    public static boolean m2424O(Context context) {
        int i = f4750a;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        String str = f4753d;
        if (i == 30 && (AbstractC0714c.m1493F(str, "moto g(20)") || AbstractC0714c.m1493F(str, "rmx3231"))) {
            return true;
        }
        return i == 34 && AbstractC0714c.m1493F(str, "sm-x200");
    }

    /* renamed from: P */
    public static boolean m2425P(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: Q */
    public static boolean m2426Q(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: R */
    public static void m2427R(List list, int i, int i4, int i8) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i9 = (i4 - i) - 1; i9 >= 0; i9--) {
            arrayDeque.addFirst(list.remove(i + i9));
        }
        list.addAll(Math.min(i8, list.size()), arrayDeque);
    }

    /* renamed from: S */
    public static long m2428S(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: T */
    public static String m2429T(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM1517e0 = AbstractC0714c.m1517e0(str);
        int i = 0;
        String str2 = strM1517e0.split("-", 2)[0];
        if (f4760k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f4761l;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i4 = 0; i4 < strArr.length; i4 += 2) {
                map.put(strArr[i4], strArr[i4 + 1]);
            }
            f4760k = map;
        }
        String str4 = (String) f4760k.get(str2);
        if (str4 != null) {
            strM1517e0 = str4 + strM1517e0.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) && !"zh".equals(str2)) {
            return strM1517e0;
        }
        while (true) {
            String[] strArr2 = f4762m;
            if (i >= strArr2.length) {
                return strM1517e0;
            }
            if (strM1517e0.startsWith(strArr2[i])) {
                return strArr2[i + 1] + strM1517e0.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: U */
    public static Object[] m2430U(int i, Object[] objArr) {
        AbstractC1101a.m2353d(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: V */
    public static long m2431V(String str) throws C0247v0 {
        Matcher matcher = f4757h.matcher(str);
        if (!matcher.matches()) {
            throw C0247v0.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* renamed from: W */
    public static void m2432W(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: X */
    public static void m2433X(int i, int i4, List list) {
        if (i < 0 || i4 > list.size() || i > i4) {
            throw new IllegalArgumentException();
        }
        if (i != i4) {
            list.subList(i, i4).clear();
        }
    }

    /* renamed from: Y */
    public static long m2434Y(int i, long j) {
        return m2437a0(j, 1000000L, i, RoundingMode.DOWN);
    }

    /* renamed from: Z */
    public static void m2435Z(long[] jArr, long j) {
        long j8;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long jM1492E = AbstractC0714c.m1492E(j, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = AbstractC0714c.m1492E(jArr[i], jM1492E, roundingMode);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long jM1492E2 = AbstractC0714c.m1492E(1000000L, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = AbstractC0714c.m1511Z(jArr[i], jM1492E2);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < jArr.length) {
            long j9 = jArr[i4];
            if (j9 != 0) {
                if (j >= j9 && j % j9 == 0) {
                    jArr[i4] = AbstractC0714c.m1492E(1000000L, AbstractC0714c.m1492E(j, j9, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j >= j9 || j9 % j != 0) {
                    j8 = j;
                    jArr[i4] = m2439b0(j9, 1000000L, j8, roundingMode);
                } else {
                    jArr[i4] = AbstractC0714c.m1511Z(1000000L, AbstractC0714c.m1492E(j9, j, RoundingMode.UNNECESSARY));
                }
                j8 = j;
            } else {
                j8 = j;
            }
            i4++;
            j = j8;
        }
    }

    /* renamed from: a */
    public static int m2436a(long[] jArr, long j, boolean z7) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return z7 ? iBinarySearch : i;
    }

    /* renamed from: a0 */
    public static long m2437a0(long j, long j8, long j9, RoundingMode roundingMode) {
        if (j == 0 || j8 == 0) {
            return 0L;
        }
        return (j9 < j8 || j9 % j8 != 0) ? (j9 >= j8 || j8 % j9 != 0) ? (j9 < j || j9 % j != 0) ? (j9 >= j || j % j9 != 0) ? m2439b0(j, j8, j9, roundingMode) : AbstractC0714c.m1511Z(j8, AbstractC0714c.m1492E(j, j9, RoundingMode.UNNECESSARY)) : AbstractC0714c.m1492E(j8, AbstractC0714c.m1492E(j9, j, RoundingMode.UNNECESSARY), roundingMode) : AbstractC0714c.m1511Z(j, AbstractC0714c.m1492E(j8, j9, RoundingMode.UNNECESSARY)) : AbstractC0714c.m1492E(j, AbstractC0714c.m1492E(j9, j8, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* renamed from: b */
    public static int m2438b(C0087j c0087j, long j) {
        int i = c0087j.f385j - 1;
        int i4 = 0;
        while (i4 <= i) {
            int i8 = (i4 + i) >>> 1;
            if (c0087j.m320f(i8) < j) {
                i4 = i8 + 1;
            } else {
                i = i8 - 1;
            }
        }
        int i9 = i + 1;
        if (i9 < c0087j.f385j && c0087j.m320f(i9) == j) {
            return i9;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m2439b0(long j, long j8, long j9, RoundingMode roundingMode) {
        double dRint;
        long j10;
        long jM1511Z = AbstractC0714c.m1511Z(j, j8);
        if (jM1511Z != Long.MAX_VALUE && jM1511Z != Long.MIN_VALUE) {
            return AbstractC0714c.m1492E(jM1511Z, j9, roundingMode);
        }
        long jM1495H = AbstractC0714c.m1495H(Math.abs(j8), Math.abs(j9));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jM1492E = AbstractC0714c.m1492E(j8, jM1495H, roundingMode2);
        long jM1492E2 = AbstractC0714c.m1492E(j9, jM1495H, roundingMode2);
        long jM1495H2 = AbstractC0714c.m1495H(Math.abs(j), Math.abs(jM1492E2));
        long jM1492E3 = AbstractC0714c.m1492E(j, jM1495H2, roundingMode2);
        long jM1492E4 = AbstractC0714c.m1492E(jM1492E2, jM1495H2, roundingMode2);
        long jM1511Z2 = AbstractC0714c.m1511Z(jM1492E3, jM1492E);
        if (jM1511Z2 != Long.MAX_VALUE && jM1511Z2 != Long.MIN_VALUE) {
            return AbstractC0714c.m1492E(jM1511Z2, jM1492E4, roundingMode);
        }
        double d8 = jM1492E3 * (jM1492E / jM1492E4);
        if (d8 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d8 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i = AbstractC1196c.f5074a;
        if (!AbstractC0715d.m1549R(d8)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AbstractC1195b.f5073a[roundingMode.ordinal()]) {
            case 1:
                if (!AbstractC1196c.m2617a(d8)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                dRint = d8;
                if (!((-9.223372036854776E18d) - dRint >= 1.0d) || !(dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d8 + " and rounding mode " + roundingMode);
            case 2:
                if (d8 < 0.0d && !AbstractC1196c.m2617a(d8)) {
                    j10 = ((long) d8) - 1;
                    dRint = j10;
                    if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                    }
                }
                dRint = d8;
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d8 > 0.0d && !AbstractC1196c.m2617a(d8)) {
                    j10 = ((long) d8) + 1;
                    dRint = j10;
                    if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                    }
                }
                dRint = d8;
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                dRint = d8;
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!AbstractC1196c.m2617a(d8)) {
                    dRint = ((long) d8) + (d8 > 0.0d ? 1 : -1);
                }
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                dRint = Math.rint(d8);
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                dRint = Math.rint(d8);
                if (Math.abs(d8 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d8) + d8;
                }
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                dRint = Math.rint(d8);
                if (Math.abs(d8 - dRint) == 0.5d) {
                }
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: c */
    public static int m2440c(List list, Comparable comparable, boolean z7, boolean z8) {
        int i;
        int i4;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || ((Comparable) list.get(i)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i4 = z7 ? iBinarySearch : i;
        }
        return z8 ? Math.max(0, i4) : i4;
    }

    /* renamed from: c0 */
    public static boolean m2441c0(InterfaceC0193d1 interfaceC0193d1, boolean z7) {
        return interfaceC0193d1 == null || !interfaceC0193d1.getPlayWhenReady() || interfaceC0193d1.getPlaybackState() == 1 || interfaceC0193d1.getPlaybackState() == 4 || (z7 && interfaceC0193d1.getPlaybackSuppressionReason() != 0);
    }

    /* renamed from: d */
    public static int m2442d(int[] iArr, int i, boolean z7, boolean z8) {
        int i4;
        int i8;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i8 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i4 = iBinarySearch - 1;
                if (i4 < 0 || iArr[i4] != i) {
                    break;
                }
                iBinarySearch = i4;
            }
            i8 = z7 ? iBinarySearch : i4;
        }
        return z8 ? Math.max(0, i8) : i8;
    }

    /* renamed from: d0 */
    public static String[] m2443d0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    /* renamed from: e */
    public static int m2444e(long[] jArr, long j, boolean z7) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i4 = iBinarySearch - 1;
                if (i4 < 0 || jArr[i4] != j) {
                    break;
                }
                iBinarySearch = i4;
            }
            i = iBinarySearch;
        }
        return z7 ? Math.max(0, i) : i;
    }

    /* renamed from: e0 */
    public static void m2445e0(Context context, Intent intent) {
        if (f4750a >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: f */
    public static int m2446f(int i, int i4) {
        return ((i + i4) - 1) / i4;
    }

    /* renamed from: f0 */
    public static long m2447f0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: g */
    public static void m2448g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h */
    public static int m2449h(long j, long j8) {
        if (j < j8) {
            return -1;
        }
        return j == j8 ? 0 : 1;
    }

    /* renamed from: i */
    public static float m2450i(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f8, f10));
    }

    /* renamed from: j */
    public static int m2451j(int i, int i4, int i8) {
        return Math.max(i4, Math.min(i, i8));
    }

    /* renamed from: k */
    public static long m2452k(long j, long j8, long j9) {
        return Math.max(j8, Math.min(j, j9));
    }

    /* renamed from: l */
    public static boolean m2453l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m2454m(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f4750a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static int m2455n(SparseArray sparseArray) {
        if (f4750a >= 31) {
            return sparseArray.contentHashCode();
        }
        int iHashCode = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
        }
        return iHashCode;
    }

    /* renamed from: o */
    public static int m2456o(int i, int i4, int i8, byte[] bArr) {
        while (i < i4) {
            i8 = f4763n[((i8 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i8 << 8);
            i++;
        }
        return i8;
    }

    /* renamed from: p */
    public static Handler m2457p(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC1101a.m2360k(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    /* renamed from: q */
    public static Handler m2458q(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper, callback);
    }

    /* renamed from: r */
    public static String m2459r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: s */
    public static int m2460s(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                    case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* renamed from: t */
    public static AudioFormat m2461t(int i, int i4, int i8) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i4).setEncoding(i8).build();
    }

    /* renamed from: u */
    public static int m2462u(int i) {
        int i4 = f4750a;
        if (i == 10) {
            return i4 >= 32 ? 737532 : 6396;
        }
        if (i == 12) {
            return 743676;
        }
        if (i == 24) {
            return i4 >= 32 ? 67108860 : 0;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    /* renamed from: v */
    public static int m2463v(int i, String str) {
        int i4 = 0;
        for (String str2 : m2443d0(str)) {
            if (i == AbstractC0244u0.m680i(AbstractC0244u0.m676e(str2))) {
                i4++;
            }
        }
        return i4;
    }

    /* renamed from: w */
    public static String m2464w(int i, String str) {
        String[] strArrM2443d0 = m2443d0(str);
        if (strArrM2443d0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM2443d0) {
            if (i == AbstractC0244u0.m680i(AbstractC0244u0.m676e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: x */
    public static String m2465x(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return AbstractC0714c.m1519f0(networkCountryIso);
            }
        }
        return AbstractC0714c.m1519f0(Locale.getDefault().getCountry());
    }

    /* renamed from: y */
    public static int m2466y(int i) {
        if (i == 2 || i == 4) {
            return C0253x0.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return C0253x0.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return C0253x0.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return C0253x0.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i) {
            case 15:
                return C0253x0.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                return C0253x0.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
            case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
            case 20:
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                return C0253x0.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                    case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                    case AnalyticsListener.EVENT_CUES /* 27 */:
                    case AnalyticsListener.EVENT_METADATA /* 28 */:
                        return C0253x0.ERROR_CODE_DRM_PROVISIONING_FAILED;
                    default:
                        return C0253x0.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    /* renamed from: z */
    public static int m2467z(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        int i = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z7 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
            if (z7) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }
}
