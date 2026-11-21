package p189v7;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1912g;
import p198w7.AbstractC2706b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.h0 */
/* loaded from: classes.dex */
public final class C2570h0 extends C2579m {

    /* renamed from: n */
    public final transient byte[][] f9309n;

    /* renamed from: o */
    public final transient int[] f9310o;

    public C2570h0(byte[][] bArr, int[] iArr) {
        super(C2579m.f9316m.f9317j);
        this.f9309n = bArr;
        this.f9310o = iArr;
    }

    @Override // p189v7.C2579m
    /* renamed from: a */
    public final String mo4632a() {
        return m4646t().mo4632a();
    }

    @Override // p189v7.C2579m
    /* renamed from: c */
    public final C2579m mo4633c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f9309n;
        int length = bArr.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int[] iArr = this.f9310o;
            int i8 = iArr[length + i];
            int i9 = iArr[i];
            messageDigest.update(bArr[i], i8, i9 - i4);
            i++;
            i4 = i9;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC2980h.m5133b(bArrDigest);
        return new C2579m(bArrDigest);
    }

    @Override // p189v7.C2579m
    /* renamed from: d */
    public final int mo4634d() {
        return this.f9310o[this.f9309n.length - 1];
    }

    @Override // p189v7.C2579m
    /* renamed from: e */
    public final String mo4635e() {
        return m4646t().mo4635e();
    }

    @Override // p189v7.C2579m
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2579m) {
            C2579m c2579m = (C2579m) obj;
            if (c2579m.mo4634d() == mo4634d() && mo4641m(0, c2579m, mo4634d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p189v7.C2579m
    /* renamed from: f */
    public final int mo4636f(byte[] bArr, int i) {
        AbstractC2980h.m5136e("other", bArr);
        return m4646t().mo4636f(bArr, i);
    }

    @Override // p189v7.C2579m
    /* renamed from: h */
    public final byte[] mo4637h() {
        return m4645s();
    }

    @Override // p189v7.C2579m
    public final int hashCode() {
        int i = this.f9318k;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f9309n;
        int length = bArr.length;
        int i4 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i4 < length) {
            int[] iArr = this.f9310o;
            int i10 = iArr[length + i4];
            int i11 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr2[i10];
                i10++;
            }
            i4++;
            i9 = i11;
        }
        this.f9318k = i8;
        return i8;
    }

    @Override // p189v7.C2579m
    /* renamed from: i */
    public final byte mo4638i(int i) {
        byte[][] bArr = this.f9309n;
        int length = bArr.length - 1;
        int[] iArr = this.f9310o;
        AbstractC2557b.m4580e(iArr[length], i, 1L);
        int iM4767g = AbstractC2706b.m4767g(this, i);
        return bArr[iM4767g][(i - (iM4767g == 0 ? 0 : iArr[iM4767g - 1])) + iArr[bArr.length + iM4767g]];
    }

    @Override // p189v7.C2579m
    /* renamed from: j */
    public final int mo4639j(byte[] bArr) {
        AbstractC2980h.m5136e("other", bArr);
        return m4646t().mo4639j(bArr);
    }

    @Override // p189v7.C2579m
    /* renamed from: l */
    public final boolean mo4640l(int i, int i4, int i8, byte[] bArr) {
        AbstractC2980h.m5136e("other", bArr);
        if (i < 0 || i > mo4634d() - i8 || i4 < 0 || i4 > bArr.length - i8) {
            return false;
        }
        int i9 = i8 + i;
        int iM4767g = AbstractC2706b.m4767g(this, i);
        while (i < i9) {
            int[] iArr = this.f9310o;
            int i10 = iM4767g == 0 ? 0 : iArr[iM4767g - 1];
            int i11 = iArr[iM4767g] - i10;
            byte[][] bArr2 = this.f9309n;
            int i12 = iArr[bArr2.length + iM4767g];
            int iMin = Math.min(i9, i11 + i10) - i;
            if (!AbstractC2557b.m4576a((i - i10) + i12, i4, iMin, bArr2[iM4767g], bArr)) {
                return false;
            }
            i4 += iMin;
            i += iMin;
            iM4767g++;
        }
        return true;
    }

    @Override // p189v7.C2579m
    /* renamed from: m */
    public final boolean mo4641m(int i, C2579m c2579m, int i4) {
        AbstractC2980h.m5136e("other", c2579m);
        if (i >= 0 && i <= mo4634d() - i4) {
            int i8 = i4 + i;
            int iM4767g = AbstractC2706b.m4767g(this, i);
            int i9 = 0;
            while (i < i8) {
                int[] iArr = this.f9310o;
                int i10 = iM4767g == 0 ? 0 : iArr[iM4767g - 1];
                int i11 = iArr[iM4767g] - i10;
                byte[][] bArr = this.f9309n;
                int i12 = iArr[bArr.length + iM4767g];
                int iMin = Math.min(i8, i11 + i10) - i;
                if (c2579m.mo4640l(i9, (i - i10) + i12, iMin, bArr[iM4767g])) {
                    i9 += iMin;
                    i += iMin;
                    iM4767g++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p189v7.C2579m
    /* renamed from: n */
    public final C2579m mo4642n(int i, int i4) {
        if (i4 == -1234567890) {
            i4 = mo4634d();
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("beginIndex=", i, " < 0").toString());
        }
        if (i4 > mo4634d()) {
            throw new IllegalArgumentException(("endIndex=" + i4 + " > length(" + mo4634d() + ')').toString());
        }
        int i8 = i4 - i;
        if (i8 < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m11g(i4, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i4 == mo4634d()) {
            return this;
        }
        if (i == i4) {
            return C2579m.f9316m;
        }
        int iM4767g = AbstractC2706b.m4767g(this, i);
        int iM4767g2 = AbstractC2706b.m4767g(this, i4 - 1);
        byte[][] bArr = this.f9309n;
        byte[][] bArr2 = (byte[][]) AbstractC1912g.m3731o0(bArr, iM4767g, iM4767g2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f9310o;
        if (iM4767g <= iM4767g2) {
            int i9 = iM4767g;
            int i10 = 0;
            while (true) {
                iArr[i10] = Math.min(iArr2[i9] - i, i8);
                int i11 = i10 + 1;
                iArr[i10 + bArr2.length] = iArr2[bArr.length + i9];
                if (i9 == iM4767g2) {
                    break;
                }
                i9++;
                i10 = i11;
            }
        }
        int i12 = iM4767g != 0 ? iArr2[iM4767g - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i12) + iArr[length];
        return new C2570h0(bArr2, iArr);
    }

    @Override // p189v7.C2579m
    /* renamed from: p */
    public final C2579m mo4643p() {
        return m4646t().mo4643p();
    }

    @Override // p189v7.C2579m
    /* renamed from: r */
    public final void mo4644r(int i, C2573j c2573j) {
        int iM4767g = AbstractC2706b.m4767g(this, 0);
        int i4 = 0;
        while (i4 < i) {
            int[] iArr = this.f9310o;
            int i8 = iM4767g == 0 ? 0 : iArr[iM4767g - 1];
            int i9 = iArr[iM4767g] - i8;
            byte[][] bArr = this.f9309n;
            int i10 = iArr[bArr.length + iM4767g];
            int iMin = Math.min(i, i9 + i8) - i4;
            int i11 = (i4 - i8) + i10;
            C2566f0 c2566f0 = new C2566f0(bArr[iM4767g], i11, i11 + iMin, true, false);
            C2566f0 c2566f02 = c2573j.f9313j;
            if (c2566f02 == null) {
                c2566f0.f9298g = c2566f0;
                c2566f0.f9297f = c2566f0;
                c2573j.f9313j = c2566f0;
            } else {
                C2566f0 c2566f03 = c2566f02.f9298g;
                AbstractC2980h.m5133b(c2566f03);
                c2566f03.m4625b(c2566f0);
            }
            i4 += iMin;
            iM4767g++;
        }
        c2573j.f9314k += i;
    }

    /* renamed from: s */
    public final byte[] m4645s() {
        byte[] bArr = new byte[mo4634d()];
        byte[][] bArr2 = this.f9309n;
        int length = bArr2.length;
        int i = 0;
        int i4 = 0;
        int i8 = 0;
        while (i < length) {
            int[] iArr = this.f9310o;
            int i9 = iArr[length + i];
            int i10 = iArr[i];
            int i11 = i10 - i4;
            AbstractC1912g.m3726j0(i8, i9, i9 + i11, bArr2[i], bArr);
            i8 += i11;
            i++;
            i4 = i10;
        }
        return bArr;
    }

    /* renamed from: t */
    public final C2579m m4646t() {
        return new C2579m(m4645s());
    }

    @Override // p189v7.C2579m
    public final String toString() {
        return m4646t().toString();
    }
}
