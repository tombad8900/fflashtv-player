package p142q2;

import android.support.v4.media.session.AbstractC0120b;
import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.common.C0228p;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.AbstractC0714c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC1006u;
import p052f6.AbstractC1013w0;
import p052f6.C0999r1;
import p052f6.C1005t1;
import p052f6.C1016x0;
import p052f6.C1017x1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1107d;
import p063h1.AbstractC1118i0;
import p063h1.InterfaceC1111f;
import p065h3.C1157b;
import p090k2.C1592j;
import p090k2.C1598p;
import p090k2.InterfaceC1590h;
import p090k2.InterfaceC1599q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q2.e */
/* loaded from: classes.dex */
public final class C2256e implements InterfaceC1599q {

    /* renamed from: k */
    public static final Pattern f7832k = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: l */
    public static final Pattern f7833l = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: m */
    public static final Pattern f7834m = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: n */
    public static final Pattern f7835n = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: o */
    public static final Pattern f7836o = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: p */
    public static final Pattern f7837p = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: q */
    public static final Pattern f7838q = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: r */
    public static final C2255d f7839r = new C2255d(30.0f, 1, 1);

    /* renamed from: j */
    public final XmlPullParserFactory f7840j;

    public C2256e() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f7840j = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: a */
    public static C2258g m4037a(C2258g c2258g) {
        return c2258g == null ? new C2258g() : c2258g;
    }

    /* renamed from: b */
    public static boolean m4038b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals(CmcdConfiguration.KEY_BITRATE) || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: c */
    public static int m4039c(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f7838q.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC1101a.m2348F("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z7 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i4 = Integer.parseInt(strGroup2);
            if (i == 0 || i4 == 0) {
                z7 = false;
            }
            AbstractC1101a.m2352c("Invalid cell resolution " + i + " " + i4, z7);
            return i4;
        } catch (NumberFormatException unused) {
            AbstractC1101a.m2348F("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* renamed from: e */
    public static void m4040e(String str, C2258g c2258g) throws C1592j {
        Matcher matcher;
        String strGroup;
        int i = AbstractC1118i0.f4750a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f7834m;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C1592j("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC1101a.m2348F("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C1592j(AbstractC0008a1.m17m("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c2258g.f7860j = 3;
                break;
            case "em":
                c2258g.f7860j = 2;
                break;
            case "px":
                c2258g.f7860j = 1;
                break;
            default:
                throw new C1592j(AbstractC0008a1.m17m("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c2258g.f7861k = Float.parseFloat(strGroup2);
    }

    /* renamed from: g */
    public static C2255d m4041g(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f8;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i4 = AbstractC1118i0.f4750a;
            AbstractC1101a.m2352c("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f8 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f8 = 1.0f;
        }
        C2255d c2255d = f7839r;
        int i8 = c2255d.f7830b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i8 = Integer.parseInt(attributeValue3);
        }
        int i9 = c2255d.f7831c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i9 = Integer.parseInt(attributeValue4);
        }
        return new C2255d(i * f8, i8, i9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4042i(XmlPullParser xmlPullParser, HashMap map, int i, C0228p c0228p, HashMap map2, HashMap map3) throws XmlPullParserException, IOException, NumberFormatException {
        String strM2367r;
        float f8;
        float f9;
        String strM2367r2;
        float f10;
        float f11;
        String strM2367r3;
        float f12;
        float f13;
        int i4;
        int i8;
        C2257f c2257f;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "style")) {
                String strM2367r4 = AbstractC1101a.m2367r(xmlPullParser, "style");
                C2258g c2258gM4044k = m4044k(xmlPullParser, new C2258g());
                if (strM2367r4 != null) {
                    String strTrim = strM2367r4.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i9 = AbstractC1118i0.f4750a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        c2258gM4044k.m4047a((C2258g) map.get(str));
                    }
                }
                String str2 = c2258gM4044k.f7862l;
                if (str2 != null) {
                    map.put(str2, c2258gM4044k);
                }
            } else if (AbstractC1101a.m2373x(xmlPullParser, "region")) {
                String strM2367r5 = AbstractC1101a.m2367r(xmlPullParser, "id");
                if (strM2367r5 != null) {
                    String strM2367r6 = AbstractC1101a.m2367r(xmlPullParser, "origin");
                    if (strM2367r6 != null) {
                        Pattern pattern = f7836o;
                        Matcher matcher = pattern.matcher(strM2367r6);
                        Pattern pattern2 = f7837p;
                        Matcher matcher2 = pattern2.matcher(strM2367r6);
                        int i10 = 2;
                        if (matcher.matches()) {
                            try {
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                f8 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher.group(2);
                                strGroup2.getClass();
                                f9 = Float.parseFloat(strGroup2) / 100.0f;
                                strM2367r2 = AbstractC1101a.m2367r(xmlPullParser, "extent");
                            } catch (NumberFormatException unused) {
                                AbstractC1101a.m2348F("TtmlParser", "Ignoring region with malformed origin: ".concat(strM2367r6));
                            }
                            if (strM2367r2 == null) {
                                Matcher matcher3 = pattern.matcher(strM2367r2);
                                Matcher matcher4 = pattern2.matcher(strM2367r2);
                                if (matcher3.matches()) {
                                    try {
                                        String strGroup3 = matcher3.group(1);
                                        strGroup3.getClass();
                                        f10 = Float.parseFloat(strGroup3) / 100.0f;
                                        String strGroup4 = matcher3.group(2);
                                        strGroup4.getClass();
                                        f11 = Float.parseFloat(strGroup4) / 100.0f;
                                        float f14 = f10;
                                        strM2367r3 = AbstractC1101a.m2367r(xmlPullParser, "displayAlign");
                                        if (strM2367r3 == null) {
                                            String strM1517e0 = AbstractC0714c.m1517e0(strM2367r3);
                                            strM1517e0.getClass();
                                            if (strM1517e0.equals("center")) {
                                                f12 = f9 + (f11 / 2.0f);
                                                f13 = f8;
                                                i4 = 1;
                                            } else if (strM1517e0.equals("after")) {
                                                f12 = f9 + f11;
                                                f13 = f8;
                                                i4 = 2;
                                            } else {
                                                f12 = f9;
                                                f13 = f8;
                                                i4 = 0;
                                            }
                                            float f15 = 1.0f / i;
                                            String strM2367r7 = AbstractC1101a.m2367r(xmlPullParser, "writingMode");
                                            if (strM2367r7 != null) {
                                                String strM1517e02 = AbstractC0714c.m1517e0(strM2367r7);
                                                strM1517e02.getClass();
                                                switch (strM1517e02) {
                                                    case "tb":
                                                    case "tblr":
                                                        i8 = i10;
                                                        break;
                                                    case "tbrl":
                                                        i8 = 1;
                                                        break;
                                                    default:
                                                        i10 = Integer.MIN_VALUE;
                                                        i8 = i10;
                                                        break;
                                                }
                                                c2257f = new C2257f(strM2367r5, f13, f12, 0, i4, f14, f11, 1, f15, i8);
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                        AbstractC1101a.m2348F("TtmlParser", "Ignoring region with malformed extent: ".concat(strM2367r6));
                                    }
                                } else if (!matcher4.matches()) {
                                    AbstractC1101a.m2348F("TtmlParser", "Ignoring region with unsupported extent: ".concat(strM2367r6));
                                } else if (c0228p == null) {
                                    AbstractC1101a.m2348F("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM2367r6));
                                } else {
                                    try {
                                        String strGroup5 = matcher4.group(1);
                                        strGroup5.getClass();
                                        int i11 = Integer.parseInt(strGroup5);
                                        String strGroup6 = matcher4.group(2);
                                        strGroup6.getClass();
                                        f10 = i11 / c0228p.f1276a;
                                        f11 = Integer.parseInt(strGroup6) / c0228p.f1277b;
                                        float f142 = f10;
                                        strM2367r3 = AbstractC1101a.m2367r(xmlPullParser, "displayAlign");
                                        if (strM2367r3 == null) {
                                        }
                                    } catch (NumberFormatException unused3) {
                                        AbstractC1101a.m2348F("TtmlParser", "Ignoring region with malformed extent: ".concat(strM2367r6));
                                    }
                                }
                                if (c2257f != null) {
                                    map2.put(c2257f.f7841a, c2257f);
                                }
                            } else {
                                AbstractC1101a.m2348F("TtmlParser", "Ignoring region without an extent");
                            }
                        } else if (!matcher2.matches()) {
                            AbstractC1101a.m2348F("TtmlParser", "Ignoring region with unsupported origin: ".concat(strM2367r6));
                        } else if (c0228p == null) {
                            AbstractC1101a.m2348F("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM2367r6));
                        } else {
                            try {
                                String strGroup7 = matcher2.group(1);
                                strGroup7.getClass();
                                int i12 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher2.group(2);
                                strGroup8.getClass();
                                float f16 = i12 / c0228p.f1276a;
                                f9 = Integer.parseInt(strGroup8) / c0228p.f1277b;
                                f8 = f16;
                                strM2367r2 = AbstractC1101a.m2367r(xmlPullParser, "extent");
                                if (strM2367r2 == null) {
                                }
                            } catch (NumberFormatException unused4) {
                                AbstractC1101a.m2348F("TtmlParser", "Ignoring region with malformed origin: ".concat(strM2367r6));
                            }
                        }
                    } else {
                        AbstractC1101a.m2348F("TtmlParser", "Ignoring region without an origin");
                    }
                    c2257f = null;
                    if (c2257f != null) {
                    }
                } else {
                    c2257f = null;
                    if (c2257f != null) {
                    }
                }
            } else if (AbstractC1101a.m2373x(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (AbstractC1101a.m2373x(xmlPullParser, "image") && (strM2367r = AbstractC1101a.m2367r(xmlPullParser, "id")) != null) {
                        map3.put(strM2367r, xmlPullParser.nextText());
                    }
                } while (!AbstractC1101a.m2372w(xmlPullParser, "metadata"));
            }
        } while (!AbstractC1101a.m2372w(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2254c m4043j(XmlPullParser xmlPullParser, C2254c c2254c, HashMap map, C2255d c2255d) throws C1592j, NumberFormatException {
        long j;
        String attributeValue;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        C2258g c2258gM4044k = m4044k(xmlPullParser, null);
        String strSubstring = null;
        String str = C2181z.FRAGMENT_ENCODE_SET;
        long jM4045l = -9223372036854775807L;
        long jM4045l2 = -9223372036854775807L;
        long jM4045l3 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                case "dur":
                    jM4045l3 = m4045l(attributeValue, c2255d);
                    break;
                case "end":
                    jM4045l2 = m4045l(attributeValue, c2255d);
                    break;
                case "begin":
                    jM4045l = m4045l(attributeValue, c2255d);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i4 = AbstractC1118i0.f4750a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c2254c != null) {
            long j8 = c2254c.f7819d;
            if (j8 != -9223372036854775807L) {
                if (jM4045l != -9223372036854775807L) {
                    jM4045l += j8;
                }
                if (jM4045l2 != -9223372036854775807L) {
                    jM4045l2 += j8;
                }
            }
        }
        if (jM4045l2 != -9223372036854775807L) {
            j = jM4045l2;
        } else {
            if (jM4045l3 != -9223372036854775807L) {
                jM4045l2 = jM4045l + jM4045l3;
            } else if (c2254c != null) {
                long j9 = c2254c.f7820e;
                if (j9 != -9223372036854775807L) {
                    j = j9;
                }
            }
            j = jM4045l2;
        }
        return new C2254c(xmlPullParser.getName(), null, jM4045l, j, c2258gM4044k, strArr, str, strSubstring, c2254c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2258g m4044k(XmlPullParser xmlPullParser, C2258g c2258g) {
        char c8;
        int i;
        C1005t1 c1005t1M2197l;
        int iHashCode;
        int i4;
        C2253b c2253b;
        int attributeCount = xmlPullParser.getAttributeCount();
        C2258g c2258gM4037a = c2258g;
        for (int i8 = 0; i8 < attributeCount; i8++) {
            String attributeValue = xmlPullParser.getAttributeValue(i8);
            String attributeName = xmlPullParser.getAttributeName(i8);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c8 = 0;
                        break;
                    } else {
                        c8 = '\uffff';
                        break;
                    }
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c8 = '\n';
                        break;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c8 = 11;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c8 = '\f';
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c8 = '\r';
                        break;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c8 = 14;
                        break;
                    }
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c8) {
                case 0:
                    c2258gM4037a = m4037a(c2258gM4037a);
                    c2258gM4037a.f7859i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    c2258gM4037a = m4037a(c2258gM4037a);
                    c2258gM4037a.f7851a = attributeValue;
                    break;
                case 2:
                    c2258gM4037a = m4037a(c2258gM4037a);
                    String strM1517e0 = AbstractC0714c.m1517e0(attributeValue);
                    strM1517e0.getClass();
                    switch (strM1517e0) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c2258gM4037a.f7865o = alignment;
                    break;
                case 3:
                    String strM1517e02 = AbstractC0714c.m1517e0(attributeValue);
                    strM1517e02.getClass();
                    switch (strM1517e02) {
                        case "nounderline":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7857g = 0;
                            break;
                        case "underline":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7857g = 1;
                            break;
                        case "nolinethrough":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7856f = 0;
                            break;
                        case "linethrough":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7856f = 1;
                            break;
                    }
                case 4:
                    c2258gM4037a = m4037a(c2258gM4037a);
                    c2258gM4037a.f7858h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        c2258gM4037a = m4037a(c2258gM4037a);
                        c2258gM4037a.f7862l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String strM1517e03 = AbstractC0714c.m1517e0(attributeValue);
                    strM1517e03.getClass();
                    switch (strM1517e03) {
                        case "baseContainer":
                        case "base":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7863m = 2;
                            break;
                        case "container":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7863m = 1;
                            break;
                        case "delimiter":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7863m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            c2258gM4037a = m4037a(c2258gM4037a);
                            c2258gM4037a.f7863m = 3;
                            break;
                    }
                case 7:
                    c2258gM4037a = m4037a(c2258gM4037a);
                    try {
                        c2258gM4037a.f7852b = AbstractC1107d.m2395a(attributeValue, false);
                        c2258gM4037a.f7853c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC0008a1.m24t("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\b':
                    C2258g c2258gM4037a2 = m4037a(c2258gM4037a);
                    Matcher matcher = f7835n.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            AbstractC1101a.m2349G("TtmlParser", "Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        AbstractC0008a1.m24t("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    c2258gM4037a2.f7869s = fMin;
                    c2258gM4037a = c2258gM4037a2;
                    break;
                case '\t':
                    String strM1517e04 = AbstractC0714c.m1517e0(attributeValue);
                    strM1517e04.getClass();
                    if (strM1517e04.equals("all")) {
                        c2258gM4037a = m4037a(c2258gM4037a);
                        c2258gM4037a.f7867q = 1;
                        break;
                    } else if (strM1517e04.equals("none")) {
                        c2258gM4037a = m4037a(c2258gM4037a);
                        c2258gM4037a.f7867q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        c2258gM4037a = m4037a(c2258gM4037a);
                        m4040e(attributeValue, c2258gM4037a);
                        break;
                    } catch (C1592j unused2) {
                        AbstractC0008a1.m24t("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 11:
                    c2258gM4037a = m4037a(c2258gM4037a);
                    Pattern pattern = C2253b.f7808d;
                    if (attributeValue == null) {
                        c2253b = null;
                        c2258gM4037a.f7868r = c2253b;
                        break;
                    } else {
                        String strM1517e05 = AbstractC0714c.m1517e0(attributeValue.trim());
                        if (!strM1517e05.isEmpty()) {
                            String[] strArrSplit = TextUtils.split(strM1517e05, C2253b.f7808d);
                            int length = strArrSplit.length;
                            AbstractC1013w0 abstractC1013w0M2209i = length != 0 ? length != 1 ? AbstractC1013w0.m2209i(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C1017x1(strArrSplit[0]) : C0999r1.f4255s;
                            String str = (String) AbstractC1006u.m2193h(AbstractC1006u.m2197l(C2253b.f7812h, abstractC1013w0M2209i), "outside");
                            int iHashCode2 = str.hashCode();
                            if (iHashCode2 == -1392885889) {
                                str.equals("before");
                            } else if (iHashCode2 != -1106037339) {
                                if (iHashCode2 == 92734940 && str.equals("after")) {
                                    i = 2;
                                }
                                c1005t1M2197l = AbstractC1006u.m2197l(C2253b.f7809e, abstractC1013w0M2209i);
                                if (c1005t1M2197l.isEmpty()) {
                                    C1005t1 c1005t1M2197l2 = AbstractC1006u.m2197l(C2253b.f7811g, abstractC1013w0M2209i);
                                    C1005t1 c1005t1M2197l3 = AbstractC1006u.m2197l(C2253b.f7810f, abstractC1013w0M2209i);
                                    if (c1005t1M2197l2.isEmpty() && c1005t1M2197l3.isEmpty()) {
                                        c2253b = new C2253b(-1, 0, i);
                                    } else {
                                        String str2 = (String) AbstractC1006u.m2193h(c1005t1M2197l2, "filled");
                                        int iHashCode3 = str2.hashCode();
                                        if (iHashCode3 != -1274499742) {
                                            int i9 = (iHashCode3 == 3417674 && str2.equals("open")) ? 2 : 1;
                                            String str3 = (String) AbstractC1006u.m2193h(c1005t1M2197l3, "circle");
                                            iHashCode = str3.hashCode();
                                            if (iHashCode != -1360216880) {
                                                str3.equals("circle");
                                            } else if (iHashCode != -905816648) {
                                                if (iHashCode == 99657 && str3.equals("dot")) {
                                                    i4 = 2;
                                                }
                                                c2253b = new C2253b(i4, i9, i);
                                            } else {
                                                if (str3.equals("sesame")) {
                                                    i4 = 3;
                                                }
                                                c2253b = new C2253b(i4, i9, i);
                                            }
                                            i4 = 1;
                                            c2253b = new C2253b(i4, i9, i);
                                        } else {
                                            str2.equals("filled");
                                        }
                                        String str32 = (String) AbstractC1006u.m2193h(c1005t1M2197l3, "circle");
                                        iHashCode = str32.hashCode();
                                        if (iHashCode != -1360216880) {
                                        }
                                        i4 = 1;
                                        c2253b = new C2253b(i4, i9, i);
                                    }
                                } else {
                                    String str4 = (String) new C1016x0(c1005t1M2197l).next();
                                    int iHashCode4 = str4.hashCode();
                                    if (iHashCode4 != 3005871) {
                                        int i10 = (iHashCode4 == 3387192 && str4.equals("none")) ? 0 : -1;
                                        c2253b = new C2253b(i10, 0, i);
                                    } else {
                                        str4.equals("auto");
                                    }
                                    c2253b = new C2253b(i10, 0, i);
                                }
                            } else {
                                if (str.equals("outside")) {
                                    i = -2;
                                }
                                c1005t1M2197l = AbstractC1006u.m2197l(C2253b.f7809e, abstractC1013w0M2209i);
                                if (c1005t1M2197l.isEmpty()) {
                                }
                            }
                            i = 1;
                            c1005t1M2197l = AbstractC1006u.m2197l(C2253b.f7809e, abstractC1013w0M2209i);
                            if (c1005t1M2197l.isEmpty()) {
                            }
                        }
                        c2258gM4037a.f7868r = c2253b;
                    }
                    break;
                case '\f':
                    String strM1517e06 = AbstractC0714c.m1517e0(attributeValue);
                    strM1517e06.getClass();
                    if (strM1517e06.equals("before")) {
                        c2258gM4037a = m4037a(c2258gM4037a);
                        c2258gM4037a.f7864n = 1;
                        break;
                    } else if (strM1517e06.equals("after")) {
                        c2258gM4037a = m4037a(c2258gM4037a);
                        c2258gM4037a.f7864n = 2;
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    c2258gM4037a = m4037a(c2258gM4037a);
                    try {
                        c2258gM4037a.f7854d = AbstractC1107d.m2395a(attributeValue, false);
                        c2258gM4037a.f7855e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC0008a1.m24t("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 14:
                    c2258gM4037a = m4037a(c2258gM4037a);
                    String strM1517e07 = AbstractC0714c.m1517e0(attributeValue);
                    strM1517e07.getClass();
                    switch (strM1517e07) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c2258gM4037a.f7866p = alignment;
                    break;
            }
        }
        return c2258gM4037a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m4045l(String str, C2255d c2255d) throws C1592j, NumberFormatException {
        double d8;
        double d9;
        Matcher matcher = f7832k.matcher(str);
        char c8 = 4;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d10 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d11 = d10 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d12 = d11 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d12 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c2255d.f7829a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / c2255d.f7830b) / c2255d.f7829a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f7833l.matcher(str);
        if (!matcher2.matches()) {
            throw new C1592j(AbstractC0008a1.m25u("Malformed time expression: ", str));
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        double d13 = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4.hashCode()) {
            case 102:
                if (!strGroup4.equals("f")) {
                    c8 = '\uffff';
                    break;
                } else {
                    c8 = 0;
                    break;
                }
            case 104:
                if (strGroup4.equals(CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                    c8 = 1;
                    break;
                }
                break;
            case 109:
                if (strGroup4.equals("m")) {
                    c8 = 2;
                    break;
                }
                break;
            case 116:
                if (strGroup4.equals("t")) {
                    c8 = 3;
                    break;
                }
                break;
            case 3494:
                if (!strGroup4.equals("ms")) {
                }
                break;
        }
        switch (c8) {
            case 0:
                d8 = c2255d.f7829a;
                d13 /= d8;
                return (long) (d13 * 1000000.0d);
            case 1:
                d9 = 3600.0d;
                break;
            case 2:
                d9 = 60.0d;
                break;
            case 3:
                d8 = c2255d.f7831c;
                d13 /= d8;
                return (long) (d13 * 1000000.0d);
            case 4:
                d8 = 1000.0d;
                d13 /= d8;
                return (long) (d13 * 1000000.0d);
            default:
                return (long) (d13 * 1000000.0d);
        }
        d13 *= d9;
        return (long) (d13 * 1000000.0d);
    }

    /* renamed from: m */
    public static C0228p m4046m(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strM2367r = AbstractC1101a.m2367r(xmlPullParser, "extent");
        if (strM2367r == null) {
            return null;
        }
        Matcher matcher = f7837p.matcher(strM2367r);
        if (!matcher.matches()) {
            AbstractC1101a.m2348F("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM2367r));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C0228p(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            AbstractC1101a.m2348F("TtmlParser", "Ignoring malformed tts extent: ".concat(strM2367r));
            return null;
        }
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: d */
    public final InterfaceC1590h mo3264d(byte[] bArr, int i, int i4) throws XmlPullParserException, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f7840j.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put(C2181z.FRAGMENT_ENCODE_SET, new C2257f(C2181z.FRAGMENT_ENCODE_SET, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0228p c0228pM4046m = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i4), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C2255d c2255dM4041g = f7839r;
            int i8 = 0;
            int iM4039c = 15;
            C1157b c1157b = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C2254c c2254c = (C2254c) arrayDeque.peek();
                if (i8 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c2255dM4041g = m4041g(xmlPullParserNewPullParser);
                            iM4039c = m4039c(xmlPullParserNewPullParser);
                            c0228pM4046m = m4046m(xmlPullParserNewPullParser);
                        }
                        C2255d c2255d = c2255dM4041g;
                        C0228p c0228p = c0228pM4046m;
                        int i9 = iM4039c;
                        if (m4038b(name)) {
                            if ("head".equals(name)) {
                                m4042i(xmlPullParserNewPullParser, map, i9, c0228p, map2, map3);
                            } else {
                                try {
                                    C2254c c2254cM4043j = m4043j(xmlPullParserNewPullParser, c2254c, map2, c2255d);
                                    arrayDeque.push(c2254cM4043j);
                                    if (c2254c != null) {
                                        if (c2254c.f7828m == null) {
                                            c2254c.f7828m = new ArrayList();
                                        }
                                        c2254c.f7828m.add(c2254cM4043j);
                                    }
                                } catch (C1592j e) {
                                    AbstractC1101a.m2349G("TtmlParser", "Suppressing parser error", e);
                                }
                            }
                            iM4039c = i9;
                            c0228pM4046m = c0228p;
                            c2255dM4041g = c2255d;
                        } else {
                            AbstractC1101a.m2371v("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i8++;
                        iM4039c = i9;
                        c0228pM4046m = c0228p;
                        c2255dM4041g = c2255d;
                    } else if (eventType == 4) {
                        c2254c.getClass();
                        C2254c c2254cM4028a = C2254c.m4028a(xmlPullParserNewPullParser.getText());
                        if (c2254c.f7828m == null) {
                            c2254c.f7828m = new ArrayList();
                        }
                        c2254c.f7828m.add(c2254cM4028a);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C2254c c2254c2 = (C2254c) arrayDeque.peek();
                            c2254c2.getClass();
                            c1157b = new C1157b(c2254c2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i8++;
                } else if (eventType == 3) {
                    i8--;
                }
                xmlPullParserNewPullParser.next();
            }
            c1157b.getClass();
            return c1157b;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    public final void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) {
        AbstractC0120b.m404O(mo3264d(bArr, i, i4), c1598p, interfaceC1111f);
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public final int mo77h() {
        return 1;
    }
}
