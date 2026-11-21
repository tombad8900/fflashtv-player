package p133p2;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import p052f6.AbstractC0983m0;
import p056g1.C1029b;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p090k2.C1585c;
import p090k2.C1598p;
import p090k2.InterfaceC1599q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p2.a */
/* loaded from: classes.dex */
public final class C2206a implements InterfaceC1599q {

    /* renamed from: m */
    public static final Pattern f7714m = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: n */
    public static final Pattern f7715n = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: j */
    public final StringBuilder f7716j = new StringBuilder();

    /* renamed from: k */
    public final ArrayList f7717k = new ArrayList();

    /* renamed from: l */
    public final C1132w f7718l = new C1132w();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1029b m4004a(Spanned spanned, String str) {
        int i;
        int i4;
        float f8;
        if (str == null) {
            return new C1029b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i = 1;
                    break;
                } else {
                    i = 0;
                    break;
                }
            case -685620679:
                str.equals("{\\an2}");
                i = 1;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    i = 2;
                    break;
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i = 1;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i = 1;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                }
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i4 = 1;
                    break;
                } else {
                    i4 = 2;
                    break;
                }
            case -685620679:
                if (str.equals("{\\an2}")) {
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                i4 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i4 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i4 = 1;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    i4 = 0;
                    break;
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                }
                break;
        }
        float f9 = 0.92f;
        if (i == 0) {
            f8 = 0.08f;
        } else if (i == 1) {
            f8 = 0.5f;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            f8 = 0.92f;
        }
        if (i4 == 0) {
            f9 = 0.08f;
        } else if (i4 == 1) {
            f9 = 0.5f;
        } else if (i4 != 2) {
            throw new IllegalArgumentException();
        }
        return new C1029b(spanned, null, null, null, f9, 0, i4, f8, i, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* renamed from: b */
    public static long m4005b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j8 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j9 = (Long.parseLong(strGroup3) * 1000) + j8;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j9 += Long.parseLong(strGroup4);
        }
        return j9 * 1000;
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    public final void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) throws NumberFormatException {
        String strM2522h;
        String str;
        C2206a c2206a = this;
        long j = c1598p.f6079a;
        C1132w c1132w = c2206a.f7718l;
        c1132w.m2511E(bArr, i + i4);
        c1132w.m2513G(i);
        Charset charsetM2509C = c1132w.m2509C();
        if (charsetM2509C == null) {
            charsetM2509C = StandardCharsets.UTF_8;
        }
        long j8 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !c1598p.f6080b) ? null : new ArrayList();
        while (true) {
            String strM2522h2 = c1132w.m2522h(charsetM2509C);
            int i8 = 0;
            if (strM2522h2 == null) {
                break;
            }
            if (strM2522h2.length() != 0) {
                try {
                    Integer.parseInt(strM2522h2);
                    strM2522h = c1132w.m2522h(charsetM2509C);
                } catch (NumberFormatException unused) {
                    AbstractC1101a.m2348F("SubripParser", "Skipping invalid index: ".concat(strM2522h2));
                }
                if (strM2522h == null) {
                    AbstractC1101a.m2348F("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f7714m.matcher(strM2522h);
                if (matcher.matches()) {
                    long jM4005b = m4005b(matcher, 1);
                    long jM4005b2 = m4005b(matcher, 6);
                    StringBuilder sb = c2206a.f7716j;
                    sb.setLength(0);
                    ArrayList arrayList2 = c2206a.f7717k;
                    arrayList2.clear();
                    String strM2522h3 = c1132w.m2522h(charsetM2509C);
                    while (!TextUtils.isEmpty(strM2522h3)) {
                        long j9 = j8;
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strM2522h3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = f7715n.matcher(strTrim);
                        int i9 = i8;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher2.start() - i9;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, C2181z.FRAGMENT_ENCODE_SET);
                            i9 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                        strM2522h3 = c1132w.m2522h(charsetM2509C);
                        j8 = j9;
                        i8 = 0;
                    }
                    long j10 = j;
                    long j11 = j8;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i10);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (j10 == j11 || jM4005b >= j10) {
                        interfaceC1111f.accept(new C1585c(AbstractC0983m0.m2168n(m4004a(spannedFromHtml, str)), jM4005b, jM4005b2 - jM4005b));
                    } else if (arrayList != null) {
                        arrayList.add(new C1585c(AbstractC0983m0.m2168n(m4004a(spannedFromHtml, str)), jM4005b, jM4005b2 - jM4005b));
                    }
                    c2206a = this;
                    j8 = j11;
                    j = j10;
                } else {
                    AbstractC1101a.m2348F("SubripParser", "Skipping invalid timing: ".concat(strM2522h));
                    c2206a = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                interfaceC1111f.accept((C1585c) obj);
            }
        }
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public final int mo77h() {
        return 1;
    }
}
