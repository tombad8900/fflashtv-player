package p168t2;

import android.util.Pair;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.Arrays;
import java.util.Collections;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;
import p156s.C2332e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.j */
/* loaded from: classes.dex */
public final class C2416j implements InterfaceC2412h {

    /* renamed from: q */
    public static final double[] f8579q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f8580a;

    /* renamed from: b */
    public InterfaceC1980i0 f8581b;

    /* renamed from: c */
    public final C2332e f8582c;

    /* renamed from: d */
    public final C1132w f8583d;

    /* renamed from: e */
    public final C2430x f8584e;

    /* renamed from: f */
    public final boolean[] f8585f = new boolean[4];

    /* renamed from: g */
    public final C2414i f8586g;

    /* renamed from: h */
    public long f8587h;

    /* renamed from: i */
    public boolean f8588i;

    /* renamed from: j */
    public boolean f8589j;

    /* renamed from: k */
    public long f8590k;

    /* renamed from: l */
    public long f8591l;

    /* renamed from: m */
    public long f8592m;

    /* renamed from: n */
    public long f8593n;

    /* renamed from: o */
    public boolean f8594o;

    /* renamed from: p */
    public boolean f8595p;

    public C2416j(C2332e c2332e) {
        this.f8582c = c2332e;
        C2414i c2414i = new C2414i();
        c2414i.f8578d = new byte[128];
        this.f8586g = c2414i;
        if (c2332e != null) {
            this.f8584e = new C2430x(178);
            this.f8583d = new C1132w();
        } else {
            this.f8584e = null;
            this.f8583d = null;
        }
        this.f8591l = -9223372036854775807L;
        this.f8593n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fd  */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) {
        C2414i c2414i;
        C2430x c2430x;
        int i;
        boolean z7;
        long j;
        long j8;
        boolean z8;
        boolean z9;
        int i4;
        float f8;
        int i8;
        float f9;
        int i9;
        long j9;
        AbstractC1101a.m2360k(this.f8581b);
        int i10 = c1132w.f4800b;
        int i11 = c1132w.f4801c;
        byte[] bArr = c1132w.f4799a;
        this.f8587h += c1132w.m2515a();
        this.f8581b.sampleData(c1132w, c1132w.m2515a());
        while (true) {
            int iM2681b = AbstractC1237p.m2681b(bArr, i10, i11, this.f8585f);
            c2414i = this.f8586g;
            c2430x = this.f8584e;
            if (iM2681b == i11) {
                break;
            }
            int i12 = iM2681b + 3;
            int i13 = c1132w.f4799a[i12] & 255;
            int i14 = iM2681b - i10;
            if (this.f8589j) {
                i = i11;
            } else {
                if (i14 > 0) {
                    c2414i.m4257a(bArr, i10, iM2681b);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                if (c2414i.f8575a) {
                    int i16 = c2414i.f8576b - i15;
                    c2414i.f8576b = i16;
                    if (c2414i.f8577c == 0 && i13 == 181) {
                        c2414i.f8577c = i16;
                        i = i11;
                    } else {
                        c2414i.f8575a = false;
                        String str = this.f8580a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(c2414i.f8578d, c2414i.f8576b);
                        int i17 = bArrCopyOf[4] & 255;
                        byte b7 = bArrCopyOf[5];
                        i = i11;
                        int i18 = ((b7 & 255) >> 4) | (i17 << 4);
                        int i19 = (bArrCopyOf[6] & 255) | ((b7 & 15) << 8);
                        int i20 = (bArrCopyOf[7] & 240) >> 4;
                        if (i20 == 2) {
                            f8 = i19 * 4;
                            i8 = i18 * 3;
                        } else if (i20 == 3) {
                            f8 = i19 * 16;
                            i8 = i18 * 9;
                        } else if (i20 != 4) {
                            f9 = 1.0f;
                            C0246v c0246v = new C0246v();
                            c0246v.f1435a = str;
                            c0246v.f1447m = AbstractC0244u0.m687p("video/mpeg2");
                            c0246v.f1454t = i18;
                            c0246v.f1455u = i19;
                            c0246v.f1458x = f9;
                            c0246v.f1450p = Collections.singletonList(bArrCopyOf);
                            C0249w c0249w = new C0249w(c0246v);
                            i9 = (bArrCopyOf[7] & 15) - 1;
                            if (i9 >= 0 || i9 >= 8) {
                                j9 = 0;
                            } else {
                                double d8 = f8579q[i9];
                                byte b8 = bArrCopyOf[c2414i.f8577c + 9];
                                int i21 = (b8 & 96) >> 5;
                                if (i21 != (b8 & 31)) {
                                    d8 = ((i21 + 1.0d) / (r6 + 1)) * d8;
                                }
                                j9 = (long) (1000000.0d / d8);
                            }
                            Pair pairCreate = Pair.create(c0249w, Long.valueOf(j9));
                            this.f8581b.format((C0249w) pairCreate.first);
                            this.f8590k = ((Long) pairCreate.second).longValue();
                            this.f8589j = true;
                        } else {
                            f8 = i19 * 121;
                            i8 = i18 * 100;
                        }
                        f9 = f8 / i8;
                        C0246v c0246v2 = new C0246v();
                        c0246v2.f1435a = str;
                        c0246v2.f1447m = AbstractC0244u0.m687p("video/mpeg2");
                        c0246v2.f1454t = i18;
                        c0246v2.f1455u = i19;
                        c0246v2.f1458x = f9;
                        c0246v2.f1450p = Collections.singletonList(bArrCopyOf);
                        C0249w c0249w2 = new C0249w(c0246v2);
                        i9 = (bArrCopyOf[7] & 15) - 1;
                        if (i9 >= 0) {
                            j9 = 0;
                            Pair pairCreate2 = Pair.create(c0249w2, Long.valueOf(j9));
                            this.f8581b.format((C0249w) pairCreate2.first);
                            this.f8590k = ((Long) pairCreate2.second).longValue();
                            this.f8589j = true;
                        }
                    }
                } else {
                    i = i11;
                    if (i13 == 179) {
                        c2414i.f8575a = true;
                    }
                }
                c2414i.m4257a(C2414i.f8574e, 0, 3);
            }
            if (c2430x == null) {
                z7 = true;
            } else {
                if (i14 > 0) {
                    c2430x.m4316a(bArr, i10, iM2681b);
                    i4 = 0;
                } else {
                    i4 = -i14;
                }
                if (c2430x.m4320e(i4)) {
                    int iM2690k = AbstractC1237p.m2690k((byte[]) c2430x.f8763f, c2430x.f8760c);
                    int i22 = AbstractC1118i0.f4750a;
                    byte[] bArr2 = (byte[]) c2430x.f8763f;
                    C1132w c1132w2 = this.f8583d;
                    c1132w2.m2511E(bArr2, iM2690k);
                    this.f8582c.m4148l(this.f8593n, c1132w2);
                }
                if (i13 == 178) {
                    z7 = true;
                    if (c1132w.f4799a[iM2681b + 2] == 1) {
                        c2430x.m4322g(i13);
                    }
                }
            }
            if (i13 == 0 || i13 == 179) {
                int i23 = i - iM2681b;
                if (this.f8595p && this.f8589j) {
                    long j10 = this.f8593n;
                    if (j10 != -9223372036854775807L) {
                        j = -9223372036854775807L;
                        this.f8581b.sampleMetadata(j10, this.f8594o ? 1 : 0, ((int) (this.f8587h - this.f8592m)) - i23, i23, null);
                    }
                    if (this.f8588i) {
                        this.f8592m = this.f8587h - i23;
                        j8 = this.f8591l;
                        if (j8 == j) {
                        }
                        this.f8593n = j8;
                        z8 = false;
                        this.f8594o = false;
                        this.f8591l = j;
                        z9 = true;
                        this.f8588i = true;
                        this.f8595p = i13 != 0 ? z9 : z8;
                    }
                } else {
                    j = -9223372036854775807L;
                    if (this.f8588i || this.f8595p) {
                        this.f8592m = this.f8587h - i23;
                        j8 = this.f8591l;
                        if (j8 == j) {
                            long j11 = this.f8593n;
                            j8 = j11 != j ? j11 + this.f8590k : j;
                        }
                        this.f8593n = j8;
                        z8 = false;
                        this.f8594o = false;
                        this.f8591l = j;
                        z9 = true;
                        this.f8588i = true;
                    } else {
                        z9 = true;
                        z8 = false;
                    }
                    this.f8595p = i13 != 0 ? z9 : z8;
                }
            } else if (i13 == 184) {
                this.f8594o = z7;
            }
            i10 = i12;
            i11 = i;
        }
        if (!this.f8589j) {
            c2414i.m4257a(bArr, i10, i11);
        }
        if (c2430x != null) {
            c2430x.m4316a(bArr, i10, i11);
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        AbstractC1237p.m2680a(this.f8585f);
        C2414i c2414i = this.f8586g;
        c2414i.f8575a = false;
        c2414i.f8576b = 0;
        c2414i.f8577c = 0;
        C2430x c2430x = this.f8584e;
        if (c2430x != null) {
            c2430x.m4321f();
        }
        this.f8587h = 0L;
        this.f8588i = false;
        this.f8591l = -9223372036854775807L;
        this.f8593n = -9223372036854775807L;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
        AbstractC1101a.m2360k(this.f8581b);
        if (z7) {
            boolean z8 = this.f8594o;
            this.f8581b.sampleMetadata(this.f8593n, z8 ? 1 : 0, (int) (this.f8587h - this.f8592m), 0, null);
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        c2411g0.m4255a();
        c2411g0.m4256b();
        this.f8580a = c2411g0.f8573e;
        c2411g0.m4256b();
        this.f8581b = interfaceC1989p.track(c2411g0.f8572d, 2);
        C2332e c2332e = this.f8582c;
        if (c2332e != null) {
            c2332e.m4149m(interfaceC1989p, c2411g0);
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8591l = j;
    }
}
