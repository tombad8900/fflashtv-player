package p150r2;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import okhttp3.C2181z;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p056g1.C1029b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p090k2.C1585c;
import p090k2.C1598p;
import p090k2.InterfaceC1599q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r2.a */
/* loaded from: classes.dex */
public final class C2288a implements InterfaceC1599q {

    /* renamed from: j */
    public final C1132w f7980j = new C1132w();

    /* renamed from: k */
    public final boolean f7981k;

    /* renamed from: l */
    public final int f7982l;

    /* renamed from: m */
    public final int f7983m;

    /* renamed from: n */
    public final String f7984n;

    /* renamed from: o */
    public final float f7985o;

    /* renamed from: p */
    public final int f7986p;

    public C2288a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f7982l = 0;
            this.f7983m = -1;
            this.f7984n = "sans-serif";
            this.f7981k = false;
            this.f7985o = 0.85f;
            this.f7986p = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f7982l = bArr[24];
        this.f7983m = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f7984n = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f7986p = i;
        boolean z7 = (bArr[0] & 32) != 0;
        this.f7981k = z7;
        if (z7) {
            this.f7985o = AbstractC1118i0.m2450i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f7985o = 0.85f;
        }
    }

    /* renamed from: a */
    public static void m4091a(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i8, int i9, int i10) {
        if (i != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i8, i9, i10 | 33);
        }
    }

    /* renamed from: b */
    public static void m4092b(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i8, int i9, int i10) {
        if (i != i4) {
            int i11 = i10 | 33;
            boolean z7 = (i & 1) != 0;
            boolean z8 = (i & 2) != 0;
            if (z7) {
                if (z8) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i8, i9, i11);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i8, i9, i11);
                }
            } else if (z8) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i8, i9, i11);
            }
            boolean z9 = (i & 4) != 0;
            if (z9) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i9, i11);
            }
            if (z9 || z7 || z8) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i8, i9, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    public final void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) {
        String strM2533s;
        int i8;
        int i9;
        C1132w c1132w = this.f7980j;
        c1132w.m2511E(bArr, i + i4);
        c1132w.m2513G(i);
        int i10 = 1;
        int i11 = 0;
        int i12 = 2;
        AbstractC1101a.m2353d(c1132w.m2515a() >= 2);
        int iM2507A = c1132w.m2507A();
        if (iM2507A == 0) {
            strM2533s = C2181z.FRAGMENT_ENCODE_SET;
        } else {
            int i13 = c1132w.f4800b;
            Charset charsetM2509C = c1132w.m2509C();
            int i14 = iM2507A - (c1132w.f4800b - i13);
            if (charsetM2509C == null) {
                charsetM2509C = StandardCharsets.UTF_8;
            }
            strM2533s = c1132w.m2533s(i14, charsetM2509C);
        }
        if (strM2533s.isEmpty()) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            interfaceC1111f.accept(new C1585c(C0981l1.f4211n, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM2533s);
        m4092b(spannableStringBuilder, this.f7982l, 0, 0, spannableStringBuilder.length(), 16711680);
        m4091a(spannableStringBuilder, this.f7983m, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f7984n;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM2450i = this.f7985o;
        while (c1132w.m2515a() >= 8) {
            int i15 = c1132w.f4800b;
            int iM2521g = c1132w.m2521g();
            int iM2521g2 = c1132w.m2521g();
            if (iM2521g2 == 1937013100) {
                AbstractC1101a.m2353d(c1132w.m2515a() >= i12 ? i10 : i11);
                int iM2507A2 = c1132w.m2507A();
                int i16 = i11;
                while (i16 < iM2507A2) {
                    AbstractC1101a.m2353d(c1132w.m2515a() >= 12 ? i10 : i11);
                    int iM2507A3 = c1132w.m2507A();
                    int iM2507A4 = c1132w.m2507A();
                    c1132w.m2514H(i12);
                    int i17 = i16;
                    int iM2535u = c1132w.m2535u();
                    c1132w.m2514H(i10);
                    int iM2521g3 = c1132w.m2521g();
                    if (iM2507A4 > spannableStringBuilder.length()) {
                        AbstractC1101a.m2348F("Tx3gParser", "Truncating styl end (" + iM2507A4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iM2507A4 = spannableStringBuilder.length();
                    }
                    if (iM2507A3 >= iM2507A4) {
                        AbstractC1101a.m2348F("Tx3gParser", "Ignoring styl with start (" + iM2507A3 + ") >= end (" + iM2507A4 + ").");
                        i9 = i17;
                    } else {
                        i9 = i17;
                        int i18 = iM2507A4;
                        m4092b(spannableStringBuilder, iM2535u, this.f7982l, iM2507A3, i18, 0);
                        m4091a(spannableStringBuilder, iM2521g3, this.f7983m, iM2507A3, i18, 0);
                    }
                    i16 = i9 + 1;
                    i10 = 1;
                    i11 = 0;
                    i12 = 2;
                }
                i8 = i12;
            } else if (iM2521g2 == 1952608120 && this.f7981k) {
                i8 = 2;
                AbstractC1101a.m2353d(c1132w.m2515a() >= 2);
                fM2450i = AbstractC1118i0.m2450i(c1132w.m2507A() / this.f7986p, 0.0f, 0.95f);
            } else {
                i8 = 2;
            }
            c1132w.m2513G(i15 + iM2521g);
            i12 = i8;
            i10 = 1;
            i11 = 0;
        }
        interfaceC1111f.accept(new C1585c(AbstractC0983m0.m2168n(new C1029b(spannableStringBuilder, null, null, null, fM2450i, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public final int mo77h() {
        return 2;
    }
}
