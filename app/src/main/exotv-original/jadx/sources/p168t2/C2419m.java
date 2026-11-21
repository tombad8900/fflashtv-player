package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.Arrays;
import java.util.Collections;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;
import p156s.C2332e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.m */
/* loaded from: classes.dex */
public final class C2419m implements InterfaceC2412h {

    /* renamed from: l */
    public static final float[] f8610l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final C2332e f8611a;

    /* renamed from: b */
    public final C1132w f8612b;

    /* renamed from: c */
    public final boolean[] f8613c = new boolean[4];

    /* renamed from: d */
    public final C2417k f8614d;

    /* renamed from: e */
    public final C2430x f8615e;

    /* renamed from: f */
    public C2418l f8616f;

    /* renamed from: g */
    public long f8617g;

    /* renamed from: h */
    public String f8618h;

    /* renamed from: i */
    public InterfaceC1980i0 f8619i;

    /* renamed from: j */
    public boolean f8620j;

    /* renamed from: k */
    public long f8621k;

    public C2419m(C2332e c2332e) {
        this.f8611a = c2332e;
        C2417k c2417k = new C2417k();
        c2417k.f8601e = new byte[128];
        this.f8614d = c2417k;
        this.f8621k = -9223372036854775807L;
        this.f8615e = new C2430x(178);
        this.f8612b = new C1132w();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0233  */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) {
        int i;
        int i4;
        boolean z7;
        int i8;
        int i9;
        float f8;
        AbstractC1101a.m2360k(this.f8616f);
        AbstractC1101a.m2360k(this.f8619i);
        int i10 = c1132w.f4800b;
        int i11 = c1132w.f4801c;
        byte[] bArr = c1132w.f4799a;
        this.f8617g += c1132w.m2515a();
        this.f8619i.sampleData(c1132w, c1132w.m2515a());
        while (true) {
            int iM2681b = AbstractC1237p.m2681b(bArr, i10, i11, this.f8613c);
            C2417k c2417k = this.f8614d;
            C2430x c2430x = this.f8615e;
            if (iM2681b == i11) {
                if (!this.f8620j) {
                    c2417k.m4289a(bArr, i10, i11);
                }
                this.f8616f.m4290a(bArr, i10, i11);
                if (c2430x != null) {
                    c2430x.m4316a(bArr, i10, i11);
                    return;
                }
                return;
            }
            int i12 = iM2681b + 3;
            byte b7 = c1132w.f4799a[i12];
            int i13 = b7 & 255;
            int i14 = iM2681b - i10;
            if (this.f8620j) {
                i = i11;
                i4 = i12;
            } else {
                if (i14 > 0) {
                    c2417k.m4289a(bArr, i10, iM2681b);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                int i16 = c2417k.f8598b;
                if (i16 != 0) {
                    i = i11;
                    if (i16 == 1) {
                        i4 = i12;
                        i9 = 0;
                        if (i13 != 181) {
                            AbstractC1101a.m2348F("H263Reader", "Unexpected start code value");
                            c2417k.f8597a = false;
                            c2417k.f8599c = 0;
                            c2417k.f8598b = 0;
                        } else {
                            c2417k.f8598b = 2;
                        }
                    } else if (i16 != 2) {
                        i4 = i12;
                        if (i16 != 3) {
                            if (i16 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i13 == 179 || i13 == 181) {
                                c2417k.f8599c -= i15;
                                c2417k.f8597a = false;
                                InterfaceC1980i0 interfaceC1980i0 = this.f8619i;
                                int i17 = c2417k.f8600d;
                                String str = this.f8618h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(c2417k.f8601e, c2417k.f8599c);
                                C1131v c1131v = new C1131v(bArrCopyOf, bArrCopyOf.length);
                                c1131v.m2506w(i17);
                                c1131v.m2506w(4);
                                c1131v.m2504u();
                                c1131v.m2505v(8);
                                if (c1131v.m2493j()) {
                                    c1131v.m2505v(4);
                                    c1131v.m2505v(3);
                                }
                                int iM2494k = c1131v.m2494k(4);
                                if (iM2494k == 15) {
                                    int iM2494k2 = c1131v.m2494k(8);
                                    int iM2494k3 = c1131v.m2494k(8);
                                    if (iM2494k3 == 0) {
                                        AbstractC1101a.m2348F("H263Reader", "Invalid aspect ratio");
                                        f8 = 1.0f;
                                        if (c1131v.m2493j()) {
                                            c1131v.m2505v(2);
                                            c1131v.m2505v(1);
                                            if (c1131v.m2493j()) {
                                                c1131v.m2505v(15);
                                                c1131v.m2504u();
                                                c1131v.m2505v(15);
                                                c1131v.m2504u();
                                                c1131v.m2505v(15);
                                                c1131v.m2504u();
                                                c1131v.m2505v(3);
                                                c1131v.m2505v(11);
                                                c1131v.m2504u();
                                                c1131v.m2505v(15);
                                                c1131v.m2504u();
                                            }
                                        }
                                        if (c1131v.m2494k(2) != 0) {
                                            AbstractC1101a.m2348F("H263Reader", "Unhandled video object layer shape");
                                        }
                                        c1131v.m2504u();
                                        int iM2494k4 = c1131v.m2494k(16);
                                        c1131v.m2504u();
                                        if (c1131v.m2493j()) {
                                            if (iM2494k4 == 0) {
                                                AbstractC1101a.m2348F("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i18 = 0;
                                                for (int i19 = iM2494k4 - 1; i19 > 0; i19 >>= 1) {
                                                    i18++;
                                                }
                                                c1131v.m2505v(i18);
                                            }
                                        }
                                        c1131v.m2504u();
                                        int iM2494k5 = c1131v.m2494k(13);
                                        c1131v.m2504u();
                                        int iM2494k6 = c1131v.m2494k(13);
                                        c1131v.m2504u();
                                        c1131v.m2504u();
                                        C0246v c0246v = new C0246v();
                                        c0246v.f1435a = str;
                                        c0246v.f1447m = AbstractC0244u0.m687p("video/mp4v-es");
                                        c0246v.f1454t = iM2494k5;
                                        c0246v.f1455u = iM2494k6;
                                        c0246v.f1458x = f8;
                                        c0246v.f1450p = Collections.singletonList(bArrCopyOf);
                                        interfaceC1980i0.format(new C0249w(c0246v));
                                        this.f8620j = true;
                                    } else {
                                        f8 = iM2494k2 / iM2494k3;
                                        if (c1131v.m2493j()) {
                                        }
                                        if (c1131v.m2494k(2) != 0) {
                                        }
                                        c1131v.m2504u();
                                        int iM2494k42 = c1131v.m2494k(16);
                                        c1131v.m2504u();
                                        if (c1131v.m2493j()) {
                                        }
                                        c1131v.m2504u();
                                        int iM2494k52 = c1131v.m2494k(13);
                                        c1131v.m2504u();
                                        int iM2494k62 = c1131v.m2494k(13);
                                        c1131v.m2504u();
                                        c1131v.m2504u();
                                        C0246v c0246v2 = new C0246v();
                                        c0246v2.f1435a = str;
                                        c0246v2.f1447m = AbstractC0244u0.m687p("video/mp4v-es");
                                        c0246v2.f1454t = iM2494k52;
                                        c0246v2.f1455u = iM2494k62;
                                        c0246v2.f1458x = f8;
                                        c0246v2.f1450p = Collections.singletonList(bArrCopyOf);
                                        interfaceC1980i0.format(new C0249w(c0246v2));
                                        this.f8620j = true;
                                    }
                                } else if (iM2494k < 7) {
                                    f8 = f8610l[iM2494k];
                                    if (c1131v.m2493j()) {
                                    }
                                    if (c1131v.m2494k(2) != 0) {
                                    }
                                    c1131v.m2504u();
                                    int iM2494k422 = c1131v.m2494k(16);
                                    c1131v.m2504u();
                                    if (c1131v.m2493j()) {
                                    }
                                    c1131v.m2504u();
                                    int iM2494k522 = c1131v.m2494k(13);
                                    c1131v.m2504u();
                                    int iM2494k622 = c1131v.m2494k(13);
                                    c1131v.m2504u();
                                    c1131v.m2504u();
                                    C0246v c0246v22 = new C0246v();
                                    c0246v22.f1435a = str;
                                    c0246v22.f1447m = AbstractC0244u0.m687p("video/mp4v-es");
                                    c0246v22.f1454t = iM2494k522;
                                    c0246v22.f1455u = iM2494k622;
                                    c0246v22.f1458x = f8;
                                    c0246v22.f1450p = Collections.singletonList(bArrCopyOf);
                                    interfaceC1980i0.format(new C0249w(c0246v22));
                                    this.f8620j = true;
                                } else {
                                    AbstractC1101a.m2348F("H263Reader", "Invalid aspect ratio");
                                    f8 = 1.0f;
                                    if (c1131v.m2493j()) {
                                    }
                                    if (c1131v.m2494k(2) != 0) {
                                    }
                                    c1131v.m2504u();
                                    int iM2494k4222 = c1131v.m2494k(16);
                                    c1131v.m2504u();
                                    if (c1131v.m2493j()) {
                                    }
                                    c1131v.m2504u();
                                    int iM2494k5222 = c1131v.m2494k(13);
                                    c1131v.m2504u();
                                    int iM2494k6222 = c1131v.m2494k(13);
                                    c1131v.m2504u();
                                    c1131v.m2504u();
                                    C0246v c0246v222 = new C0246v();
                                    c0246v222.f1435a = str;
                                    c0246v222.f1447m = AbstractC0244u0.m687p("video/mp4v-es");
                                    c0246v222.f1454t = iM2494k5222;
                                    c0246v222.f1455u = iM2494k6222;
                                    c0246v222.f1458x = f8;
                                    c0246v222.f1450p = Collections.singletonList(bArrCopyOf);
                                    interfaceC1980i0.format(new C0249w(c0246v222));
                                    this.f8620j = true;
                                }
                            } else {
                                i9 = 0;
                            }
                        } else if ((b7 & 240) != 32) {
                            AbstractC1101a.m2348F("H263Reader", "Unexpected start code value");
                            i9 = 0;
                            c2417k.f8597a = false;
                            c2417k.f8599c = 0;
                            c2417k.f8598b = 0;
                        } else {
                            i9 = 0;
                            c2417k.f8600d = c2417k.f8599c;
                            c2417k.f8598b = 4;
                        }
                    } else {
                        i4 = i12;
                        i9 = 0;
                        if (i13 > 31) {
                            AbstractC1101a.m2348F("H263Reader", "Unexpected start code value");
                            c2417k.f8597a = false;
                            c2417k.f8599c = 0;
                            c2417k.f8598b = 0;
                        } else {
                            c2417k.f8598b = 3;
                        }
                    }
                } else {
                    i = i11;
                    i4 = i12;
                    i9 = 0;
                    if (i13 == 176) {
                        c2417k.f8598b = 1;
                        c2417k.f8597a = true;
                    }
                }
                c2417k.m4289a(C2417k.f8596f, i9, 3);
            }
            this.f8616f.m4290a(bArr, i10, iM2681b);
            if (c2430x == null) {
                z7 = true;
            } else {
                if (i14 > 0) {
                    c2430x.m4316a(bArr, i10, iM2681b);
                    i8 = 0;
                } else {
                    i8 = -i14;
                }
                if (c2430x.m4320e(i8)) {
                    int iM2690k = AbstractC1237p.m2690k((byte[]) c2430x.f8763f, c2430x.f8760c);
                    int i20 = AbstractC1118i0.f4750a;
                    byte[] bArr2 = (byte[]) c2430x.f8763f;
                    C1132w c1132w2 = this.f8612b;
                    c1132w2.m2511E(bArr2, iM2690k);
                    this.f8611a.m4148l(this.f8621k, c1132w2);
                }
                if (i13 == 178) {
                    z7 = true;
                    if (c1132w.f4799a[iM2681b + 2] == 1) {
                        c2430x.m4322g(i13);
                    }
                }
            }
            int i21 = i - iM2681b;
            this.f8616f.m4291b(i21, this.f8620j, this.f8617g - i21);
            C2418l c2418l = this.f8616f;
            long j = this.f8621k;
            c2418l.f8606e = i13;
            c2418l.f8605d = false;
            c2418l.f8603b = (i13 == 182 || i13 == 179) ? z7 : false;
            c2418l.f8604c = i13 == 182 ? z7 : false;
            c2418l.f8607f = 0;
            c2418l.f8609h = j;
            i11 = i;
            i10 = i4;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        AbstractC1237p.m2680a(this.f8613c);
        C2417k c2417k = this.f8614d;
        c2417k.f8597a = false;
        c2417k.f8599c = 0;
        c2417k.f8598b = 0;
        C2418l c2418l = this.f8616f;
        if (c2418l != null) {
            c2418l.f8603b = false;
            c2418l.f8604c = false;
            c2418l.f8605d = false;
            c2418l.f8606e = -1;
        }
        C2430x c2430x = this.f8615e;
        if (c2430x != null) {
            c2430x.m4321f();
        }
        this.f8617g = 0L;
        this.f8621k = -9223372036854775807L;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
        AbstractC1101a.m2360k(this.f8616f);
        if (z7) {
            this.f8616f.m4291b(0, this.f8620j, this.f8617g);
            C2418l c2418l = this.f8616f;
            c2418l.f8603b = false;
            c2418l.f8604c = false;
            c2418l.f8605d = false;
            c2418l.f8606e = -1;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        c2411g0.m4255a();
        c2411g0.m4256b();
        this.f8618h = c2411g0.f8573e;
        c2411g0.m4256b();
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 2);
        this.f8619i = interfaceC1980i0Track;
        this.f8616f = new C2418l(interfaceC1980i0Track);
        this.f8611a.m4149m(interfaceC1989p, c2411g0);
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8621k = j;
    }
}
