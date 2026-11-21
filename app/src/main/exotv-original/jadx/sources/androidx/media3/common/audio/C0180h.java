package androidx.media3.common.audio;

import java.util.Arrays;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.h */
/* loaded from: classes.dex */
public final class C0180h {

    /* renamed from: a */
    public final int f989a;

    /* renamed from: b */
    public final int f990b;

    /* renamed from: c */
    public final float f991c;

    /* renamed from: d */
    public final float f992d;

    /* renamed from: e */
    public final float f993e;

    /* renamed from: f */
    public final int f994f;

    /* renamed from: g */
    public final int f995g;

    /* renamed from: h */
    public final int f996h;

    /* renamed from: i */
    public final short[] f997i;

    /* renamed from: j */
    public short[] f998j;

    /* renamed from: k */
    public int f999k;

    /* renamed from: l */
    public short[] f1000l;

    /* renamed from: m */
    public int f1001m;

    /* renamed from: n */
    public short[] f1002n;

    /* renamed from: o */
    public int f1003o;

    /* renamed from: p */
    public int f1004p;

    /* renamed from: q */
    public int f1005q;

    /* renamed from: r */
    public int f1006r;

    /* renamed from: s */
    public int f1007s;

    /* renamed from: t */
    public int f1008t;

    /* renamed from: u */
    public int f1009u;

    /* renamed from: v */
    public int f1010v;

    /* renamed from: w */
    public double f1011w;

    public C0180h(int i, int i4, float f8, float f9, int i8) {
        this.f989a = i;
        this.f990b = i4;
        this.f991c = f8;
        this.f992d = f9;
        this.f993e = i / i8;
        this.f994f = i / 400;
        int i9 = i / 65;
        this.f995g = i9;
        int i10 = i9 * 2;
        this.f996h = i10;
        this.f997i = new short[i10];
        this.f998j = new short[i10 * i4];
        this.f1000l = new short[i10 * i4];
        this.f1002n = new short[i10 * i4];
    }

    /* renamed from: e */
    public static void m598e(int i, int i4, short[] sArr, int i8, short[] sArr2, int i9, short[] sArr3, int i10) {
        for (int i11 = 0; i11 < i4; i11++) {
            int i12 = (i8 * i4) + i11;
            int i13 = (i10 * i4) + i11;
            int i14 = (i9 * i4) + i11;
            for (int i15 = 0; i15 < i; i15++) {
                sArr[i12] = (short) (((sArr3[i13] * i15) + ((i - i15) * sArr2[i14])) / i);
                i12 += i4;
                i14 += i4;
                i13 += i4;
            }
        }
    }

    /* renamed from: a */
    public final void m599a(short[] sArr, int i, int i4) {
        short[] sArrM601c = m601c(this.f1000l, this.f1001m, i4);
        this.f1000l = sArrM601c;
        int i8 = this.f990b;
        System.arraycopy(sArr, i * i8, sArrM601c, this.f1001m * i8, i8 * i4);
        this.f1001m += i4;
    }

    /* renamed from: b */
    public final void m600b(short[] sArr, int i, int i4) {
        int i8 = this.f996h / i4;
        int i9 = this.f990b;
        int i10 = i4 * i9;
        int i11 = i * i9;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 += sArr[(i12 * i10) + i11 + i14];
            }
            this.f997i[i12] = (short) (i13 / i10);
        }
    }

    /* renamed from: c */
    public final short[] m601c(short[] sArr, int i, int i4) {
        int length = sArr.length;
        int i8 = this.f990b;
        int i9 = length / i8;
        return i + i4 <= i9 ? sArr : Arrays.copyOf(sArr, (((i9 * 3) / 2) + i4) * i8);
    }

    /* renamed from: d */
    public final int m602d(short[] sArr, int i, int i4, int i8) {
        int i9 = i * this.f990b;
        int i10 = 255;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i4 <= i8) {
            int iAbs = 0;
            for (int i14 = 0; i14 < i4; i14++) {
                iAbs += Math.abs(sArr[i9 + i14] - sArr[(i9 + i4) + i14]);
            }
            if (iAbs * i12 < i11 * i4) {
                i12 = i4;
                i11 = iAbs;
            }
            if (iAbs * i10 > i13 * i4) {
                i10 = i4;
                i13 = iAbs;
            }
            i4++;
        }
        this.f1009u = i11 / i12;
        this.f1010v = i13 / i10;
        return i12;
    }

    /* renamed from: f */
    public final void m603f() {
        float f8;
        double d8;
        int iM602d;
        int i;
        int i4;
        int i8;
        int iRound;
        int i9;
        int i10;
        int i11;
        long j;
        long j8;
        int i12 = this.f1001m;
        float f9 = this.f991c;
        float f10 = this.f992d;
        double d9 = f9 / f10;
        float f11 = this.f993e * f10;
        int i13 = this.f989a;
        int i14 = 1;
        int i15 = this.f990b;
        int i16 = 0;
        if (d9 > 1.00001d || d9 < 0.99999d) {
            int i17 = this.f999k;
            int i18 = this.f996h;
            if (i17 >= i18) {
                int i19 = 0;
                while (true) {
                    int i20 = this.f1006r;
                    if (i20 > 0) {
                        int iMin = Math.min(i18, i20);
                        m599a(this.f998j, i19, iMin);
                        this.f1006r -= iMin;
                        i19 += iMin;
                        f8 = f11;
                        d8 = d9;
                        i4 = i18;
                    } else {
                        short[] sArr = this.f998j;
                        int i21 = i13 > 4000 ? i13 / 4000 : i14;
                        int i22 = this.f995g;
                        int i23 = this.f994f;
                        if (i15 == i14 && i21 == i14) {
                            iM602d = m602d(sArr, i19, i23, i22);
                            f8 = f11;
                            d8 = d9;
                        } else {
                            m600b(sArr, i19, i21);
                            f8 = f11;
                            d8 = d9;
                            short[] sArr2 = this.f997i;
                            int iM602d2 = m602d(sArr2, i16, i23 / i21, i22 / i21);
                            if (i21 != 1) {
                                int i24 = iM602d2 * i21;
                                int i25 = i21 * 4;
                                int i26 = i24 - i25;
                                int i27 = i24 + i25;
                                if (i26 >= i23) {
                                    i23 = i26;
                                }
                                if (i27 <= i22) {
                                    i22 = i27;
                                }
                                if (i15 == 1) {
                                    iM602d = m602d(sArr, i19, i23, i22);
                                } else {
                                    m600b(sArr, i19, 1);
                                    iM602d = m602d(sArr2, i16, i23, i22);
                                }
                            } else {
                                iM602d = iM602d2;
                            }
                        }
                        int i28 = this.f1009u;
                        int i29 = this.f1010v;
                        if (i28 == 0 || (i = this.f1007s) == 0 || i29 > i28 * 3 || i28 * 2 <= this.f1008t * 3) {
                            i = iM602d;
                        }
                        this.f1008t = i28;
                        this.f1007s = iM602d;
                        if (d8 > 1.0d) {
                            short[] sArr3 = this.f998j;
                            if (d8 >= 2.0d) {
                                i4 = i18;
                                double d10 = (i / (d8 - 1.0d)) + this.f1011w;
                                iRound = (int) Math.round(d10);
                                this.f1011w = d10 - iRound;
                            } else {
                                i4 = i18;
                                double d11 = (((2.0d - d8) * i) / (d8 - 1.0d)) + this.f1011w;
                                int iRound2 = (int) Math.round(d11);
                                this.f1006r = iRound2;
                                this.f1011w = d11 - iRound2;
                                iRound = i;
                            }
                            short[] sArrM601c = m601c(this.f1000l, this.f1001m, iRound);
                            this.f1000l = sArrM601c;
                            int i30 = i19 + i;
                            int i31 = i19;
                            int i32 = iRound;
                            m598e(i32, this.f990b, sArrM601c, this.f1001m, sArr3, i31, sArr3, i30);
                            this.f1001m += i32;
                            i19 = i + i32 + i31;
                        } else {
                            i4 = i18;
                            int i33 = i19;
                            short[] sArr4 = this.f998j;
                            if (d8 < 0.5d) {
                                double d12 = ((i * d8) / (1.0d - d8)) + this.f1011w;
                                int iRound3 = (int) Math.round(d12);
                                this.f1011w = d12 - iRound3;
                                i8 = iRound3;
                            } else {
                                double d13 = ((((d8 * 2.0d) - 1.0d) * i) / (1.0d - d8)) + this.f1011w;
                                int iRound4 = (int) Math.round(d13);
                                this.f1006r = iRound4;
                                this.f1011w = d13 - iRound4;
                                i8 = i;
                            }
                            int i34 = i + i8;
                            short[] sArrM601c2 = m601c(this.f1000l, this.f1001m, i34);
                            this.f1000l = sArrM601c2;
                            System.arraycopy(sArr4, i33 * i15, sArrM601c2, this.f1001m * i15, i * i15);
                            m598e(i8, this.f990b, this.f1000l, this.f1001m + i, sArr4, i33 + i, sArr4, i33);
                            this.f1001m += i34;
                            i19 = i33 + i8;
                        }
                    }
                    if (i19 + i4 > i17) {
                        break;
                    }
                    i16 = 0;
                    i18 = i4;
                    i14 = 1;
                    f11 = f8;
                    d9 = d8;
                }
                int i35 = this.f999k - i19;
                short[] sArr5 = this.f998j;
                System.arraycopy(sArr5, i19 * i15, sArr5, 0, i35 * i15);
                this.f999k = i35;
            }
            if (f8 != 1.0f || this.f1001m == i12) {
            }
            long j9 = (long) (i13 / f8);
            long j10 = i13;
            while (j9 != 0 && j10 != 0 && j9 % 2 == 0 && j10 % 2 == 0) {
                j9 /= 2;
                j10 /= 2;
            }
            int i36 = this.f1001m - i12;
            short[] sArrM601c3 = m601c(this.f1002n, this.f1003o, i36);
            this.f1002n = sArrM601c3;
            System.arraycopy(this.f1000l, i12 * i15, sArrM601c3, this.f1003o * i15, i36 * i15);
            this.f1001m = i12;
            this.f1003o += i36;
            int i37 = 0;
            while (true) {
                i9 = this.f1003o;
                i10 = i9 - 1;
                if (i37 >= i10) {
                    break;
                }
                while (true) {
                    i11 = this.f1004p + 1;
                    j = i11;
                    long j11 = j * j9;
                    j8 = this.f1005q;
                    if (j11 <= j8 * j10) {
                        break;
                    }
                    this.f1000l = m601c(this.f1000l, this.f1001m, 1);
                    int i38 = 0;
                    while (i38 < i15) {
                        short[] sArr6 = this.f1000l;
                        int i39 = (this.f1001m * i15) + i38;
                        short[] sArr7 = this.f1002n;
                        int i40 = (i37 * i15) + i38;
                        short s8 = sArr7[i40];
                        short s9 = sArr7[i40 + i15];
                        long j12 = j9;
                        int i41 = i37;
                        long j13 = (r12 + 1) * j12;
                        long j14 = j13 - (this.f1005q * j10);
                        long j15 = j13 - (this.f1004p * j12);
                        sArr6[i39] = (short) ((((j15 - j14) * s9) + (s8 * j14)) / j15);
                        i38++;
                        i37 = i41;
                        j9 = j12;
                    }
                    this.f1005q++;
                    this.f1001m++;
                    i37 = i37;
                    j9 = j9;
                }
                long j16 = j9;
                int i42 = i37;
                this.f1004p = i11;
                if (j == j10) {
                    this.f1004p = 0;
                    AbstractC1101a.m2359j(j8 == j16);
                    this.f1005q = 0;
                }
                i37 = i42 + 1;
                j9 = j16;
            }
            if (i10 == 0) {
                return;
            }
            short[] sArr8 = this.f1002n;
            System.arraycopy(sArr8, i10 * i15, sArr8, 0, (i9 - i10) * i15);
            this.f1003o -= i10;
            return;
        }
        m599a(this.f998j, 0, this.f999k);
        this.f999k = 0;
        f8 = f11;
        if (f8 != 1.0f) {
        }
    }
}
