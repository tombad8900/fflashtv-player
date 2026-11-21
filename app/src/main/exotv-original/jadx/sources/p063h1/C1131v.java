package p063h1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p216z2.AbstractC2888f0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.v */
/* loaded from: classes.dex */
public final class C1131v {

    /* renamed from: a */
    public final /* synthetic */ int f4791a;

    /* renamed from: b */
    public Object f4792b;

    /* renamed from: c */
    public int f4793c;

    /* renamed from: d */
    public int f4794d;

    /* renamed from: e */
    public int f4795e;

    public C1131v(int i) {
        this.f4791a = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f4792b = AbstractC1118i0.f4755f;
                break;
        }
    }

    /* renamed from: a */
    public void m2484a(int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i8 = this.f4795e;
        int i9 = i8 * 2;
        int[] iArr = (int[]) this.f4792b;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f4792b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i9 >= iArr.length) {
            int[] iArr3 = new int[i8 * 4];
            this.f4792b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f4792b;
        iArr4[i9] = i;
        iArr4[i9 + 1] = i4;
        this.f4795e++;
    }

    /* renamed from: b */
    public void m2485b() {
        int i;
        int i4;
        switch (this.f4791a) {
            case 0:
                int i8 = this.f4793c;
                AbstractC1101a.m2359j(i8 >= 0 && (i8 < (i = this.f4795e) || (i8 == i && this.f4794d == 0)));
                break;
            default:
                int i9 = this.f4794d;
                AbstractC1101a.m2359j(i9 >= 0 && (i9 < (i4 = this.f4793c) || (i9 == i4 && this.f4795e == 0)));
                break;
        }
    }

    /* renamed from: c */
    public int m2486c() {
        return ((this.f4795e - this.f4793c) * 8) - this.f4794d;
    }

    /* renamed from: d */
    public void m2487d() {
        if (this.f4794d == 0) {
            return;
        }
        this.f4794d = 0;
        this.f4793c++;
        m2485b();
    }

    /* renamed from: e */
    public boolean m2488e(int i) {
        int i4 = this.f4794d;
        int i8 = i / 8;
        int i9 = i4 + i8;
        int i10 = (this.f4795e + i) - (i8 * 8);
        if (i10 > 7) {
            i9++;
            i10 -= 8;
        }
        while (true) {
            i4++;
            if (i4 > i9 || i9 >= this.f4793c) {
                break;
            }
            if (m2503t(i4)) {
                i9++;
                i4 += 2;
            }
        }
        int i11 = this.f4793c;
        if (i9 >= i11) {
            return i9 == i11 && i10 == 0;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m2489f() {
        int i = this.f4794d;
        int i4 = this.f4795e;
        int i8 = 0;
        while (this.f4794d < this.f4793c && !m2493j()) {
            i8++;
        }
        boolean z7 = this.f4794d == this.f4793c;
        this.f4794d = i;
        this.f4795e = i4;
        return !z7 && m2488e((i8 * 2) + 1);
    }

    /* renamed from: g */
    public void m2490g(RecyclerView recyclerView, boolean z7) {
        this.f4795e = 0;
        int[] iArr = (int[]) this.f4792b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC2888f0 abstractC2888f0 = recyclerView.f2080w;
        if (recyclerView.f2078v == null || abstractC2888f0 == null || !abstractC2888f0.f10677i) {
            return;
        }
        if (z7) {
            if (!recyclerView.f2062n.m2702l()) {
                abstractC2888f0.mo1135i(recyclerView.f2078v.mo1455a(), this);
            }
        } else if (!recyclerView.m1164O()) {
            abstractC2888f0.mo1134h(this.f4793c, this.f4794d, recyclerView.f2067p0, this);
        }
        int i = this.f4795e;
        if (i > abstractC2888f0.f10678j) {
            abstractC2888f0.f10678j = i;
            abstractC2888f0.f10679k = z7;
            recyclerView.f2058l.m5042n();
        }
    }

    /* renamed from: h */
    public int m2491h() {
        AbstractC1101a.m2359j(this.f4794d == 0);
        return this.f4793c;
    }

    /* renamed from: i */
    public int m2492i() {
        return (this.f4793c * 8) + this.f4794d;
    }

    /* renamed from: j */
    public boolean m2493j() {
        switch (this.f4791a) {
            case 0:
                boolean z7 = (((byte[]) this.f4792b)[this.f4793c] & (128 >> this.f4794d)) != 0;
                m2504u();
                return z7;
            case 1:
                boolean z8 = (((byte[]) this.f4792b)[this.f4794d] & (128 >> this.f4795e)) != 0;
                m2504u();
                return z8;
            default:
                boolean z9 = (((((byte[]) this.f4792b)[this.f4794d] & 255) >> this.f4795e) & 1) == 1;
                m2505v(1);
                return z9;
        }
    }

    /* renamed from: k */
    public int m2494k(int i) {
        switch (this.f4791a) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                this.f4794d += i;
                int i4 = 0;
                while (true) {
                    int i8 = this.f4794d;
                    if (i8 <= 8) {
                        byte[] bArr = (byte[]) this.f4792b;
                        int i9 = this.f4793c;
                        int i10 = ((-1) >>> (32 - i)) & (i4 | ((bArr[i9] & 255) >> (8 - i8)));
                        if (i8 == 8) {
                            this.f4794d = 0;
                            this.f4793c = i9 + 1;
                        }
                        m2485b();
                        return i10;
                    }
                    int i11 = i8 - 8;
                    this.f4794d = i11;
                    byte[] bArr2 = (byte[]) this.f4792b;
                    int i12 = this.f4793c;
                    this.f4793c = i12 + 1;
                    i4 |= (bArr2[i12] & 255) << i11;
                }
            case 1:
                this.f4795e += i;
                int i13 = 0;
                while (true) {
                    int i14 = this.f4795e;
                    if (i14 <= 8) {
                        byte[] bArr3 = (byte[]) this.f4792b;
                        int i15 = this.f4794d;
                        int i16 = ((-1) >>> (32 - i)) & (i13 | ((bArr3[i15] & 255) >> (8 - i14)));
                        if (i14 == 8) {
                            this.f4795e = 0;
                            this.f4794d = i15 + (m2503t(i15 + 1) ? 2 : 1);
                        }
                        m2485b();
                        return i16;
                    }
                    int i17 = i14 - 8;
                    this.f4795e = i17;
                    byte[] bArr4 = (byte[]) this.f4792b;
                    int i18 = this.f4794d;
                    i13 |= (bArr4[i18] & 255) << i17;
                    if (!m2503t(i18 + 1)) {
                        i = 1;
                    }
                    this.f4794d = i18 + i;
                }
            default:
                int i19 = this.f4794d;
                int iMin = Math.min(i, 8 - this.f4795e);
                byte[] bArr5 = (byte[]) this.f4792b;
                int i20 = i19 + 1;
                int i21 = ((bArr5[i19] & 255) >> this.f4795e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i21 |= (bArr5[i20] & 255) << iMin;
                    iMin += 8;
                    i20++;
                }
                int i22 = i21 & ((-1) >>> (32 - i));
                m2505v(i);
                return i22;
        }
    }

    /* renamed from: l */
    public void m2495l(byte[] bArr, int i) {
        int i4 = i >> 3;
        for (int i8 = 0; i8 < i4; i8++) {
            byte[] bArr2 = (byte[]) this.f4792b;
            int i9 = this.f4793c;
            int i10 = i9 + 1;
            this.f4793c = i10;
            byte b7 = bArr2[i9];
            int i11 = this.f4794d;
            byte b8 = (byte) (b7 << i11);
            bArr[i8] = b8;
            bArr[i8] = (byte) (((255 & bArr2[i10]) >> (8 - i11)) | b8);
        }
        int i12 = i & 7;
        if (i12 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i4] & (255 >> i12));
        bArr[i4] = b9;
        int i13 = this.f4794d;
        if (i13 + i12 > 8) {
            byte[] bArr3 = (byte[]) this.f4792b;
            int i14 = this.f4793c;
            this.f4793c = i14 + 1;
            bArr[i4] = (byte) (b9 | ((bArr3[i14] & 255) << i13));
            this.f4794d = i13 - 8;
        }
        int i15 = this.f4794d + i12;
        this.f4794d = i15;
        byte[] bArr4 = (byte[]) this.f4792b;
        int i16 = this.f4793c;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i16]) >> (8 - i15)) << (8 - i12))) | bArr[i4]);
        if (i15 == 8) {
            this.f4794d = 0;
            this.f4793c = i16 + 1;
        }
        m2485b();
    }

    /* renamed from: m */
    public long m2496m(int i) {
        if (i <= 32) {
            int iM2494k = m2494k(i);
            int i4 = AbstractC1118i0.f4750a;
            return 4294967295L & iM2494k;
        }
        int iM2494k2 = m2494k(i - 32);
        int iM2494k3 = m2494k(32);
        int i8 = AbstractC1118i0.f4750a;
        return (4294967295L & iM2494k3) | ((iM2494k2 & 4294967295L) << 32);
    }

    /* renamed from: n */
    public void m2497n(byte[] bArr, int i) {
        AbstractC1101a.m2359j(this.f4794d == 0);
        System.arraycopy((byte[]) this.f4792b, this.f4793c, bArr, 0, i);
        this.f4793c += i;
        m2485b();
    }

    /* renamed from: o */
    public int m2498o() {
        int i = 0;
        while (!m2493j()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m2494k(i) : 0);
    }

    /* renamed from: p */
    public int m2499p() {
        int iM2498o = m2498o();
        return ((iM2498o + 1) / 2) * (iM2498o % 2 == 0 ? -1 : 1);
    }

    /* renamed from: q */
    public void m2500q(C1132w c1132w) {
        m2501r(c1132w.f4799a, c1132w.f4801c);
        m2502s(c1132w.f4800b * 8);
    }

    /* renamed from: r */
    public void m2501r(byte[] bArr, int i) {
        this.f4792b = bArr;
        this.f4793c = 0;
        this.f4794d = 0;
        this.f4795e = i;
    }

    /* renamed from: s */
    public void m2502s(int i) {
        int i4 = i / 8;
        this.f4793c = i4;
        this.f4794d = i - (i4 * 8);
        m2485b();
    }

    /* renamed from: t */
    public boolean m2503t(int i) {
        if (2 > i || i >= this.f4793c) {
            return false;
        }
        byte[] bArr = (byte[]) this.f4792b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* renamed from: u */
    public void m2504u() {
        switch (this.f4791a) {
            case 0:
                int i = this.f4794d + 1;
                this.f4794d = i;
                if (i == 8) {
                    this.f4794d = 0;
                    this.f4793c++;
                }
                m2485b();
                break;
            default:
                int i4 = this.f4795e + 1;
                this.f4795e = i4;
                if (i4 == 8) {
                    this.f4795e = 0;
                    int i8 = this.f4794d;
                    this.f4794d = i8 + (m2503t(i8 + 1) ? 2 : 1);
                }
                m2485b();
                break;
        }
    }

    /* renamed from: v */
    public void m2505v(int i) {
        int i4;
        switch (this.f4791a) {
            case 0:
                int i8 = i / 8;
                int i9 = this.f4793c + i8;
                this.f4793c = i9;
                int i10 = (i - (i8 * 8)) + this.f4794d;
                this.f4794d = i10;
                if (i10 > 7) {
                    this.f4793c = i9 + 1;
                    this.f4794d = i10 - 8;
                }
                m2485b();
                break;
            case 1:
                int i11 = this.f4794d;
                int i12 = i / 8;
                int i13 = i11 + i12;
                this.f4794d = i13;
                int i14 = (i - (i12 * 8)) + this.f4795e;
                this.f4795e = i14;
                if (i14 > 7) {
                    this.f4794d = i13 + 1;
                    this.f4795e = i14 - 8;
                }
                while (true) {
                    i11++;
                    if (i11 > this.f4794d) {
                        m2485b();
                        break;
                    } else if (m2503t(i11)) {
                        this.f4794d++;
                        i11 += 2;
                    }
                }
            default:
                int i15 = i / 8;
                int i16 = this.f4794d + i15;
                this.f4794d = i16;
                int i17 = (i - (i15 * 8)) + this.f4795e;
                this.f4795e = i17;
                boolean z7 = true;
                if (i17 > 7) {
                    this.f4794d = i16 + 1;
                    this.f4795e = i17 - 8;
                }
                int i18 = this.f4794d;
                if (i18 < 0 || (i18 >= (i4 = this.f4793c) && (i18 != i4 || this.f4795e != 0))) {
                    z7 = false;
                }
                AbstractC1101a.m2359j(z7);
                break;
        }
    }

    /* renamed from: w */
    public void m2506w(int i) {
        AbstractC1101a.m2359j(this.f4794d == 0);
        this.f4793c += i;
        m2485b();
    }

    public C1131v(byte[] bArr) {
        this.f4791a = 3;
        this.f4792b = bArr;
        this.f4793c = bArr.length;
    }

    public C1131v(byte[] bArr, int i, int i4) {
        this.f4791a = 1;
        this.f4792b = bArr;
        this.f4794d = i;
        this.f4793c = i4;
        this.f4795e = 0;
        m2485b();
    }

    public C1131v(byte[] bArr, int i) {
        this.f4791a = 0;
        this.f4792b = bArr;
        this.f4795e = i;
    }

    public C1131v(int i, int i4) {
        this.f4791a = 2;
        this.f4793c = i;
        this.f4794d = i4;
        this.f4792b = new byte[(i4 * 2) - 1];
        this.f4795e = 0;
    }
}
