package p123o2;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.exoplayer.Renderer;
import com.bumptech.glide.AbstractC0714c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p056g1.C1029b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p090k2.C1585c;
import p090k2.C1598p;
import p090k2.InterfaceC1599q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o2.b */
/* loaded from: classes.dex */
public final class C2043b implements InterfaceC1599q {

    /* renamed from: p */
    public static final Pattern f7532p = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: j */
    public final boolean f7533j;

    /* renamed from: k */
    public final C2042a f7534k;

    /* renamed from: m */
    public LinkedHashMap f7536m;

    /* renamed from: n */
    public float f7537n = -3.4028235E38f;

    /* renamed from: o */
    public float f7538o = -3.4028235E38f;

    /* renamed from: l */
    public final C1132w f7535l = new C1132w();

    public C2043b(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f7533j = false;
            this.f7534k = null;
            return;
        }
        this.f7533j = true;
        String strM2459r = AbstractC1118i0.m2459r((byte[]) list.get(0));
        AbstractC1101a.m2353d(strM2459r.startsWith("Format:"));
        C2042a c2042aM3931b = C2042a.m3931b(strM2459r);
        c2042aM3931b.getClass();
        this.f7534k = c2042aM3931b;
        m3935b(new C1132w((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    /* renamed from: a */
    public static int m3933a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* renamed from: c */
    public static long m3934c(String str) {
        Matcher matcher = f7532p.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = AbstractC1118i0.f4750a;
        return (Long.parseLong(matcher.group(4)) * Renderer.DEFAULT_DURATION_TO_PROGRESS_US) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3935b(C1132w c1132w, Charset charset) throws NumberFormatException {
        int i;
        C2046e c2046e;
        int i4;
        while (true) {
            String strM2522h = c1132w.m2522h(charset);
            if (strM2522h == null) {
                return;
            }
            int i8 = 2;
            int i9 = 0;
            char c8 = '[';
            if ("[Script Info]".equalsIgnoreCase(strM2522h)) {
                while (true) {
                    String strM2522h2 = c1132w.m2522h(charset);
                    if (strM2522h2 == null || (c1132w.m2515a() != 0 && c1132w.m2517c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strM2522h2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM1517e0 = AbstractC0714c.m1517e0(strArrSplit[0].trim());
                        strM1517e0.getClass();
                        if (strM1517e0.equals("playresx")) {
                            this.f7537n = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM1517e0.equals("playresy")) {
                            try {
                                this.f7538o = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM2522h)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    C2044c c2044c = null;
                    while (true) {
                        String strM2522h3 = c1132w.m2522h(charset);
                        if (strM2522h3 != null && (c1132w.m2515a() == 0 || c1132w.m2517c(charset) != c8)) {
                            int i10 = -1;
                            if (strM2522h3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM2522h3.substring(7), ",");
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                for (int i21 = i9; i21 < strArrSplit2.length; i21++) {
                                    String strM1517e02 = AbstractC0714c.m1517e0(strArrSplit2[i21].trim());
                                    strM1517e02.getClass();
                                    switch (strM1517e02.hashCode()) {
                                        case -1178781136:
                                            if (strM1517e02.equals("italic")) {
                                                i = i9;
                                                break;
                                            } else {
                                                i = -1;
                                                break;
                                            }
                                        case -1026963764:
                                            if (strM1517e02.equals("underline")) {
                                                i = 1;
                                                break;
                                            }
                                            break;
                                        case -192095652:
                                            if (strM1517e02.equals("strikeout")) {
                                                i = i8;
                                                break;
                                            }
                                            break;
                                        case -70925746:
                                            if (strM1517e02.equals("primarycolour")) {
                                                i = 3;
                                                break;
                                            }
                                            break;
                                        case 3029637:
                                            if (strM1517e02.equals("bold")) {
                                                i = 4;
                                                break;
                                            }
                                            break;
                                        case 3373707:
                                            if (strM1517e02.equals("name")) {
                                                i = 5;
                                                break;
                                            }
                                            break;
                                        case 366554320:
                                            if (strM1517e02.equals("fontsize")) {
                                                i = 6;
                                                break;
                                            }
                                            break;
                                        case 767321349:
                                            if (strM1517e02.equals("borderstyle")) {
                                                i = 7;
                                                break;
                                            }
                                            break;
                                        case 1767875043:
                                            if (strM1517e02.equals("alignment")) {
                                                i = 8;
                                                break;
                                            }
                                            break;
                                        case 1988365454:
                                            if (strM1517e02.equals("outlinecolour")) {
                                                i = 9;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i17 = i21;
                                            break;
                                        case 1:
                                            i18 = i21;
                                            break;
                                        case 2:
                                            i19 = i21;
                                            break;
                                        case 3:
                                            i13 = i21;
                                            break;
                                        case 4:
                                            i16 = i21;
                                            break;
                                        case 5:
                                            i11 = i21;
                                            break;
                                        case 6:
                                            i15 = i21;
                                            break;
                                        case 7:
                                            i20 = i21;
                                            break;
                                        case 8:
                                            i12 = i21;
                                            break;
                                        case 9:
                                            i14 = i21;
                                            break;
                                    }
                                }
                                if (i11 != -1) {
                                    c2044c = new C2044c(i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, strArrSplit2.length);
                                }
                            } else {
                                if (strM2522h3.startsWith("Style:")) {
                                    if (c2044c == null) {
                                        AbstractC1101a.m2348F("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM2522h3));
                                    } else {
                                        AbstractC1101a.m2353d(strM2522h3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM2522h3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i22 = c2044c.f7549k;
                                        if (length != i22) {
                                            int length2 = strArrSplit3.length;
                                            int i23 = AbstractC1118i0.f4750a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbM19o = AbstractC0008a1.m19o(i22, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            sbM19o.append(strM2522h3);
                                            sbM19o.append("'");
                                            AbstractC1101a.m2348F("SsaStyle", sbM19o.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[c2044c.f7539a].trim();
                                                int i24 = c2044c.f7540b;
                                                int iM3937a = i24 != -1 ? C2046e.m3937a(strArrSplit3[i24].trim()) : -1;
                                                int i25 = c2044c.f7541c;
                                                Integer numM3939c = i25 != -1 ? C2046e.m3939c(strArrSplit3[i25].trim()) : null;
                                                int i26 = c2044c.f7542d;
                                                Integer numM3939c2 = i26 != -1 ? C2046e.m3939c(strArrSplit3[i26].trim()) : null;
                                                int i27 = c2044c.f7543e;
                                                float f8 = -3.4028235E38f;
                                                if (i27 != -1) {
                                                    String strTrim2 = strArrSplit3[i27].trim();
                                                    try {
                                                        f8 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        AbstractC1101a.m2349G("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                    }
                                                }
                                                float f9 = f8;
                                                int i28 = c2044c.f7544f;
                                                boolean z7 = i28 != -1 && C2046e.m3938b(strArrSplit3[i28].trim());
                                                int i29 = c2044c.f7545g;
                                                boolean z8 = i29 != -1 && C2046e.m3938b(strArrSplit3[i29].trim());
                                                int i30 = c2044c.f7546h;
                                                boolean z9 = i30 != -1 && C2046e.m3938b(strArrSplit3[i30].trim());
                                                int i31 = c2044c.f7547i;
                                                boolean z10 = i31 != -1 && C2046e.m3938b(strArrSplit3[i31].trim());
                                                int i32 = c2044c.f7548j;
                                                if (i32 != -1) {
                                                    String strTrim3 = strArrSplit3[i32].trim();
                                                    try {
                                                        i4 = Integer.parseInt(strTrim3.trim());
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    if (i4 == 1 || i4 == 3) {
                                                        i10 = i4;
                                                    } else {
                                                        AbstractC1101a.m2348F("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                }
                                                c2046e = new C2046e(strTrim, iM3937a, numM3939c, numM3939c2, f9, z7, z8, z9, z10, i10);
                                            } catch (RuntimeException e8) {
                                                AbstractC1101a.m2349G("SsaStyle", "Skipping malformed 'Style:' line: '" + strM2522h3 + "'", e8);
                                            }
                                            if (c2046e != null) {
                                                linkedHashMap.put(c2046e.f7554a, c2046e);
                                            }
                                        }
                                        c2046e = null;
                                        if (c2046e != null) {
                                        }
                                    }
                                }
                                i8 = 2;
                                i9 = 0;
                                c8 = '[';
                            }
                        }
                    }
                }
                this.f7536m = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM2522h)) {
                AbstractC1101a.m2371v("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM2522h)) {
                return;
            }
        }
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    public final void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) throws NumberFormatException {
        Charset charset;
        C1132w c1132w;
        C2042a c2042a;
        long j;
        float f8;
        int i8;
        int i9;
        float f9;
        int i10;
        Layout.Alignment alignment;
        PointF pointF;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        boolean z7;
        int i13;
        int i14;
        float f13;
        int i15;
        float f14;
        int i16;
        int i17;
        int iM3937a;
        int i18;
        C2043b c2043b = this;
        long j8 = c1598p.f6079a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1132w c1132w2 = c2043b.f7535l;
        c1132w2.m2511E(bArr, i + i4);
        c1132w2.m2513G(i);
        Charset charsetM2509C = c1132w2.m2509C();
        if (charsetM2509C == null) {
            charsetM2509C = StandardCharsets.UTF_8;
        }
        boolean z8 = c2043b.f7533j;
        if (!z8) {
            c2043b.m3935b(c1132w2, charsetM2509C);
        }
        C2042a c2042aM3931b = z8 ? c2043b.f7534k : null;
        while (true) {
            String strM2522h = c1132w2.m2522h(charsetM2509C);
            if (strM2522h == null) {
                long j9 = j8;
                ArrayList arrayList3 = (j9 == -9223372036854775807L || !c1598p.f6080b) ? null : new ArrayList();
                int i19 = 0;
                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                    List list = (List) arrayList.get(i20);
                    if (!list.isEmpty() || i20 == 0) {
                        if (i20 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i20)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i20 + 1)).longValue() - ((Long) arrayList2.get(i20)).longValue();
                        if (j9 == -9223372036854775807L || jLongValue >= j9) {
                            interfaceC1111f.accept(new C1585c(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C1585c(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i19 < size) {
                        Object obj = arrayList3.get(i19);
                        i19++;
                        interfaceC1111f.accept((C1585c) obj);
                    }
                    return;
                }
                return;
            }
            if (strM2522h.startsWith("Format:")) {
                c2042aM3931b = C2042a.m3931b(strM2522h);
            } else if (strM2522h.startsWith("Dialogue:")) {
                if (c2042aM3931b == null) {
                    AbstractC1101a.m2348F("SsaParser", "Skipping dialogue line before complete format: ".concat(strM2522h));
                } else {
                    int i21 = c2042aM3931b.f7531e;
                    AbstractC1101a.m2353d(strM2522h.startsWith("Dialogue:"));
                    String[] strArrSplit = strM2522h.substring(9).split(",", i21);
                    if (strArrSplit.length != i21) {
                        AbstractC1101a.m2348F("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM2522h));
                    } else {
                        long jM3934c = m3934c(strArrSplit[c2042aM3931b.f7527a]);
                        charset = charsetM2509C;
                        if (jM3934c == -9223372036854775807L) {
                            AbstractC1101a.m2348F("SsaParser", "Skipping invalid timing: ".concat(strM2522h));
                            j = j8;
                            c2042a = c2042aM3931b;
                            c1132w = c1132w2;
                            c2043b = this;
                            charsetM2509C = charset;
                            j8 = j;
                            c2042aM3931b = c2042a;
                            c1132w2 = c1132w;
                        } else {
                            j = j8;
                            long jM3934c2 = m3934c(strArrSplit[c2042aM3931b.f7528b]);
                            if (jM3934c2 == -9223372036854775807L) {
                                AbstractC1101a.m2348F("SsaParser", "Skipping invalid timing: ".concat(strM2522h));
                                c2042a = c2042aM3931b;
                                c1132w = c1132w2;
                                c2043b = this;
                                charsetM2509C = charset;
                                j8 = j;
                                c2042aM3931b = c2042a;
                                c1132w2 = c1132w;
                            } else {
                                LinkedHashMap linkedHashMap = c2043b.f7536m;
                                C2046e c2046e = (linkedHashMap == null || (i18 = c2042aM3931b.f7529c) == -1) ? null : (C2046e) linkedHashMap.get(strArrSplit[i18].trim());
                                String str = strArrSplit[c2042aM3931b.f7530d];
                                Matcher matcher = C2045d.f7550a.matcher(str);
                                int i22 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    C2042a c2042a2 = c2042aM3931b;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFM3936a = C2045d.m3936a(strGroup);
                                        if (pointFM3936a != null) {
                                            pointF2 = pointFM3936a;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = C2045d.f7553d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iM3937a = C2046e.m3937a(strGroup2);
                                        } else {
                                            iM3937a = -1;
                                        }
                                        if (iM3937a != -1) {
                                            i22 = iM3937a;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    c2042aM3931b = c2042a2;
                                }
                                c2042a = c2042aM3931b;
                                String strReplace = C2045d.f7550a.matcher(str).replaceAll(C2181z.FRAGMENT_ENCODE_SET).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", "\u00a0");
                                float f15 = c2043b.f7537n;
                                float f16 = c2043b.f7538o;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (c2046e != null) {
                                    boolean z9 = c2046e.f7560g;
                                    Integer num = c2046e.f7557d;
                                    Integer num2 = c2046e.f7556c;
                                    if (num2 != null) {
                                        z7 = z9;
                                        c1132w = c1132w2;
                                        f8 = f15;
                                        i13 = 33;
                                        i14 = 0;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        z7 = z9;
                                        c1132w = c1132w2;
                                        f8 = f15;
                                        i13 = 33;
                                        i14 = 0;
                                    }
                                    if (c2046e.f7563j == 3 && num != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i14, spannableString.length(), i13);
                                    }
                                    float f17 = c2046e.f7558e;
                                    if (f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                        f13 = -3.4028235E38f;
                                        i15 = Integer.MIN_VALUE;
                                    } else {
                                        f13 = f17 / f16;
                                        i15 = 1;
                                    }
                                    boolean z10 = c2046e.f7559f;
                                    if (z10 && z7) {
                                        f14 = f13;
                                        i16 = i15;
                                        i17 = 33;
                                        i8 = 0;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f14 = f13;
                                        i16 = i15;
                                        i17 = 33;
                                        i8 = 0;
                                        if (z10) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z7) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (c2046e.f7561h) {
                                        spannableString.setSpan(new UnderlineSpan(), i8, spannableString.length(), i17);
                                    }
                                    if (c2046e.f7562i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i8, spannableString.length(), i17);
                                    }
                                    i9 = i22;
                                    f9 = f14;
                                    i10 = i16;
                                } else {
                                    c1132w = c1132w2;
                                    f8 = f15;
                                    i8 = 0;
                                    i9 = i22;
                                    f9 = -3.4028235E38f;
                                    i10 = Integer.MIN_VALUE;
                                }
                                if (i9 == -1) {
                                    i9 = c2046e != null ? c2046e.f7555b : -1;
                                }
                                switch (i9) {
                                    case 0:
                                    default:
                                        AbstractC0008a1.m23s("Unknown alignment: ", i9, "SsaParser");
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                int i23 = Integer.MIN_VALUE;
                                switch (i9) {
                                    case 0:
                                    default:
                                        AbstractC0008a1.m23s("Unknown alignment: ", i9, "SsaParser");
                                    case -1:
                                        i8 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i8 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i8 = 2;
                                        break;
                                }
                                switch (i9) {
                                    case 0:
                                    default:
                                        AbstractC0008a1.m23s("Unknown alignment: ", i9, "SsaParser");
                                    case -1:
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i23 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        pointF = pointF2;
                                        i23 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        pointF = pointF2;
                                        i23 = 0;
                                        break;
                                }
                                if (pointF == null || f16 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                    float f18 = 0.5f;
                                    if (i8 != 0) {
                                        i12 = 1;
                                        if (i8 != 1) {
                                            i11 = 2;
                                            f10 = i8 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i11 = 2;
                                            f10 = 0.5f;
                                        }
                                    } else {
                                        i11 = 2;
                                        i12 = 1;
                                        f10 = 0.05f;
                                    }
                                    if (i23 == 0) {
                                        f18 = 0.05f;
                                    } else if (i23 != i12) {
                                        f18 = i23 != i11 ? -3.4028235E38f : 0.95f;
                                    }
                                    f11 = f18;
                                    f12 = f10;
                                } else {
                                    float f19 = pointF.x / f8;
                                    f11 = pointF.y / f16;
                                    f12 = f19;
                                }
                                C1029b c1029b = new C1029b(spannableString, alignment, null, null, f11, 0, i23, f12, i8, i10, f9, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iM3933a = m3933a(jM3934c2, arrayList2, arrayList);
                                for (int iM3933a2 = m3933a(jM3934c, arrayList2, arrayList); iM3933a2 < iM3933a; iM3933a2++) {
                                    ((List) arrayList.get(iM3933a2)).add(c1029b);
                                }
                                c2043b = this;
                                charsetM2509C = charset;
                                j8 = j;
                                c2042aM3931b = c2042a;
                                c1132w2 = c1132w;
                            }
                        }
                    }
                }
                charset = charsetM2509C;
                j = j8;
                c2042a = c2042aM3931b;
                c1132w = c1132w2;
                c2043b = this;
                charsetM2509C = charset;
                j8 = j;
                c2042aM3931b = c2042a;
                c1132w2 = c1132w;
            } else {
                charset = charsetM2509C;
                j = j8;
                c2042a = c2042aM3931b;
                c1132w = c1132w2;
                c2043b = this;
                charsetM2509C = charset;
                j8 = j;
                c2042aM3931b = c2042a;
                c1132w2 = c1132w;
            }
        }
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public final int mo77h() {
        return 1;
    }
}
