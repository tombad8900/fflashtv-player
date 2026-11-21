package p168t2;

import android.util.SparseArray;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.ArrayList;
import java.util.Arrays;
import p005a4.C0073c;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1105c;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p071i1.C1235n;
import p071i1.C1236o;
import p071i1.C1240s;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.p */
/* loaded from: classes.dex */
public final class C2422p implements InterfaceC2412h {

    /* renamed from: a */
    public final C0073c f8657a;

    /* renamed from: b */
    public final boolean f8658b;

    /* renamed from: c */
    public final boolean f8659c;

    /* renamed from: g */
    public long f8663g;

    /* renamed from: i */
    public String f8665i;

    /* renamed from: j */
    public InterfaceC1980i0 f8666j;

    /* renamed from: k */
    public C2421o f8667k;

    /* renamed from: l */
    public boolean f8668l;

    /* renamed from: n */
    public boolean f8670n;

    /* renamed from: h */
    public final boolean[] f8664h = new boolean[3];

    /* renamed from: d */
    public final C2430x f8660d = new C2430x(7);

    /* renamed from: e */
    public final C2430x f8661e = new C2430x(8);

    /* renamed from: f */
    public final C2430x f8662f = new C2430x(6);

    /* renamed from: m */
    public long f8669m = -9223372036854775807L;

    /* renamed from: o */
    public final C1132w f8671o = new C1132w();

    public C2422p(C0073c c0073c, boolean z7, boolean z8) {
        this.f8657a = c0073c;
        this.f8658b = z7;
        this.f8659c = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296  */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) {
        int i;
        int i4;
        byte[] bArr;
        int i8;
        int i9;
        long j;
        boolean z7;
        long j8;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z8;
        AbstractC1101a.m2360k(this.f8666j);
        int i14 = AbstractC1118i0.f4750a;
        int i15 = c1132w.f4800b;
        int i16 = c1132w.f4801c;
        byte[] bArr2 = c1132w.f4799a;
        this.f8663g += c1132w.m2515a();
        this.f8666j.sampleData(c1132w, c1132w.m2515a());
        while (true) {
            int iM2681b = AbstractC1237p.m2681b(bArr2, i15, i16, this.f8664h);
            if (iM2681b == i16) {
                m4293b(bArr2, i15, i16);
                return;
            }
            int i17 = iM2681b + 3;
            int i18 = bArr2[i17] & 31;
            int i19 = iM2681b - i15;
            if (i19 > 0) {
                m4293b(bArr2, i15, iM2681b);
            }
            int i20 = i16 - iM2681b;
            long j9 = this.f8663g - i20;
            int i21 = i19 < 0 ? -i19 : 0;
            long j10 = this.f8669m;
            C1240s c1240s = (C1240s) this.f8657a.f326m;
            boolean z9 = this.f8668l;
            C2430x c2430x = this.f8660d;
            C2430x c2430x2 = this.f8661e;
            if (!z9 || this.f8667k.f8640c) {
                c2430x.m4320e(i21);
                c2430x2.m4320e(i21);
                if (this.f8668l) {
                    i = i20;
                    i4 = i16;
                    bArr = bArr2;
                    i8 = i17;
                    i9 = i18;
                    j = j9;
                    if (c2430x.f8762e) {
                        C1236o c1236oM2688i = AbstractC1237p.m2688i((byte[]) c2430x.f8763f, 3, c2430x.f8760c);
                        int i22 = c1236oM2688i.f5169s;
                        c1240s.getClass();
                        AbstractC1101a.m2359j(i22 >= 0);
                        c1240s.f5176a = i22;
                        c1240s.m2699i(i22);
                        this.f8667k.f8641d.append(c1236oM2688i.f5154d, c1236oM2688i);
                        c2430x.m4321f();
                    } else if (c2430x2.f8762e) {
                        C1131v c1131v = new C1131v((byte[]) c2430x2.f8763f, 4, c2430x2.f8760c);
                        int iM2498o = c1131v.m2498o();
                        int iM2498o2 = c1131v.m2498o();
                        c1131v.m2504u();
                        this.f8667k.f8642e.append(iM2498o, new C1235n(iM2498o, iM2498o2, c1131v.m2493j()));
                        c2430x2.m4321f();
                    }
                } else if (c2430x.f8762e && c2430x2.f8762e) {
                    ArrayList arrayList = new ArrayList();
                    i = i20;
                    arrayList.add(Arrays.copyOf((byte[]) c2430x.f8763f, c2430x.f8760c));
                    arrayList.add(Arrays.copyOf((byte[]) c2430x2.f8763f, c2430x2.f8760c));
                    i4 = i16;
                    C1236o c1236oM2688i2 = AbstractC1237p.m2688i((byte[]) c2430x.f8763f, 3, c2430x.f8760c);
                    int i23 = c1236oM2688i2.f5169s;
                    bArr = bArr2;
                    i8 = i17;
                    j = j9;
                    C1131v c1131v2 = new C1131v((byte[]) c2430x2.f8763f, 4, c2430x2.f8760c);
                    int iM2498o3 = c1131v2.m2498o();
                    int iM2498o4 = c1131v2.m2498o();
                    c1131v2.m2504u();
                    C1235n c1235n = new C1235n(iM2498o3, iM2498o4, c1131v2.m2493j());
                    int i24 = c1236oM2688i2.f5151a;
                    int i25 = c1236oM2688i2.f5152b;
                    int i26 = c1236oM2688i2.f5153c;
                    byte[] bArr3 = AbstractC1105c.f4716a;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i24), Integer.valueOf(i25), Integer.valueOf(i26));
                    InterfaceC1980i0 interfaceC1980i0 = this.f8666j;
                    C0246v c0246v = new C0246v();
                    i9 = i18;
                    c0246v.f1435a = this.f8665i;
                    c0246v.f1447m = AbstractC0244u0.m687p("video/avc");
                    c0246v.f1444j = str;
                    c0246v.f1454t = c1236oM2688i2.f5155e;
                    c0246v.f1455u = c1236oM2688i2.f5156f;
                    c0246v.f1424A = new C0216l(c1236oM2688i2.f5166p, c1236oM2688i2.f5167q, c1236oM2688i2.f5168r, c1236oM2688i2.f5158h + 8, c1236oM2688i2.f5159i + 8, null);
                    c0246v.f1458x = c1236oM2688i2.f5157g;
                    c0246v.f1450p = arrayList;
                    c0246v.f1449o = i23;
                    interfaceC1980i0.format(new C0249w(c0246v));
                    this.f8668l = true;
                    c1240s.getClass();
                    AbstractC1101a.m2359j(i23 >= 0);
                    c1240s.f5176a = i23;
                    c1240s.m2699i(i23);
                    this.f8667k.f8641d.append(c1236oM2688i2.f5154d, c1236oM2688i2);
                    this.f8667k.f8642e.append(iM2498o3, c1235n);
                    c2430x.m4321f();
                    c2430x2.m4321f();
                } else {
                    i = i20;
                    i4 = i16;
                    bArr = bArr2;
                    i8 = i17;
                    i9 = i18;
                    j = j9;
                }
            }
            C2430x c2430x3 = this.f8662f;
            if (c2430x3.m4320e(i21)) {
                int iM2690k = AbstractC1237p.m2690k((byte[]) c2430x3.f8763f, c2430x3.f8760c);
                byte[] bArr4 = (byte[]) c2430x3.f8763f;
                C1132w c1132w2 = this.f8671o;
                c1132w2.m2511E(bArr4, iM2690k);
                c1132w2.m2513G(4);
                c1240s.m2691a(j10, c1132w2);
            }
            C2421o c2421o = this.f8667k;
            boolean z10 = this.f8668l;
            if (c2421o.f8646i == 9) {
                if (z10 && c2421o.f8652o) {
                    long j11 = c2421o.f8647j;
                    int i27 = i + ((int) (j - j11));
                    j8 = c2421o.f8654q;
                    if (j8 != -9223372036854775807L) {
                        c2421o.f8638a.sampleMetadata(j8, c2421o.f8655r ? 1 : 0, (int) (j11 - c2421o.f8653p), i27, null);
                    }
                }
                c2421o.f8653p = c2421o.f8647j;
                c2421o.f8654q = c2421o.f8649l;
                z7 = false;
                c2421o.f8655r = false;
                c2421o.f8652o = true;
            } else {
                if (c2421o.f8640c) {
                    C2420n c2420n = c2421o.f8651n;
                    C2420n c2420n2 = c2421o.f8650m;
                    if (c2420n.f8622a) {
                        if (c2420n2.f8622a) {
                            C1236o c1236o = c2420n.f8624c;
                            AbstractC1101a.m2360k(c1236o);
                            C1236o c1236o2 = c2420n2.f8624c;
                            AbstractC1101a.m2360k(c1236o2);
                            int i28 = c1236o2.f5163m;
                            if (c2420n.f8627f != c2420n2.f8627f || c2420n.f8628g != c2420n2.f8628g || c2420n.f8629h != c2420n2.f8629h || ((c2420n.f8630i && c2420n2.f8630i && c2420n.f8631j != c2420n2.f8631j) || (((i11 = c2420n.f8625d) != (i12 = c2420n2.f8625d) && (i11 == 0 || i12 == 0)) || (((i13 = c1236o.f5163m) == 0 && i28 == 0 && (c2420n.f8634m != c2420n2.f8634m || c2420n.f8635n != c2420n2.f8635n)) || ((i13 == 1 && i28 == 1 && (c2420n.f8636o != c2420n2.f8636o || c2420n.f8637p != c2420n2.f8637p)) || (z8 = c2420n.f8632k) != c2420n2.f8632k || (z8 && c2420n.f8633l != c2420n2.f8633l)))))) {
                            }
                        }
                        if (z10) {
                            long j112 = c2421o.f8647j;
                            int i272 = i + ((int) (j - j112));
                            j8 = c2421o.f8654q;
                            if (j8 != -9223372036854775807L) {
                            }
                        }
                        c2421o.f8653p = c2421o.f8647j;
                        c2421o.f8654q = c2421o.f8649l;
                        z7 = false;
                        c2421o.f8655r = false;
                        c2421o.f8652o = true;
                    }
                }
                z7 = false;
            }
            c2421o.m4292a();
            if (c2421o.f8655r) {
                this.f8670n = z7;
            }
            long j12 = this.f8669m;
            if (!this.f8668l || this.f8667k.f8640c) {
                i10 = i9;
                c2430x.m4322g(i10);
                c2430x2.m4322g(i10);
            } else {
                i10 = i9;
            }
            c2430x3.m4322g(i10);
            C2421o c2421o2 = this.f8667k;
            boolean z11 = this.f8670n;
            c2421o2.f8646i = i10;
            c2421o2.f8649l = j12;
            c2421o2.f8647j = j;
            c2421o2.f8656s = z11;
            if ((c2421o2.f8639b && i10 == 1) || (c2421o2.f8640c && (i10 == 5 || i10 == 1 || i10 == 2))) {
                C2420n c2420n3 = c2421o2.f8650m;
                c2421o2.f8650m = c2421o2.f8651n;
                c2421o2.f8651n = c2420n3;
                c2420n3.f8623b = false;
                c2420n3.f8622a = false;
                c2421o2.f8645h = 0;
                c2421o2.f8648k = true;
            }
            i16 = i4;
            bArr2 = bArr;
            i15 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4293b(byte[] bArr, int i, int i4) {
        boolean zM2493j;
        boolean zM2493j2;
        boolean z7;
        boolean z8;
        int iM2498o;
        int i8;
        int iM2499p;
        int iM2499p2;
        int iM2494k;
        int i9;
        if (!this.f8668l || this.f8667k.f8640c) {
            this.f8660d.m4316a(bArr, i, i4);
            this.f8661e.m4316a(bArr, i, i4);
        }
        this.f8662f.m4316a(bArr, i, i4);
        C2421o c2421o = this.f8667k;
        SparseArray sparseArray = c2421o.f8642e;
        C1131v c1131v = c2421o.f8643f;
        if (c2421o.f8648k) {
            int i10 = i4 - i;
            byte[] bArr2 = c2421o.f8644g;
            int length = bArr2.length;
            int i11 = c2421o.f8645h + i10;
            if (length < i11) {
                c2421o.f8644g = Arrays.copyOf(bArr2, i11 * 2);
            }
            System.arraycopy(bArr, i, c2421o.f8644g, c2421o.f8645h, i10);
            int i12 = c2421o.f8645h + i10;
            c2421o.f8645h = i12;
            c1131v.f4792b = c2421o.f8644g;
            c1131v.f4794d = 0;
            c1131v.f4793c = i12;
            c1131v.f4795e = 0;
            c1131v.m2485b();
            if (c1131v.m2488e(8)) {
                c1131v.m2504u();
                int iM2494k2 = c1131v.m2494k(2);
                c1131v.m2505v(5);
                if (c1131v.m2489f()) {
                    c1131v.m2498o();
                    if (c1131v.m2489f()) {
                        int iM2498o2 = c1131v.m2498o();
                        if (!c2421o.f8640c) {
                            c2421o.f8648k = false;
                            C2420n c2420n = c2421o.f8651n;
                            c2420n.f8626e = iM2498o2;
                            c2420n.f8623b = true;
                            return;
                        }
                        if (c1131v.m2489f()) {
                            int iM2498o3 = c1131v.m2498o();
                            if (sparseArray.indexOfKey(iM2498o3) < 0) {
                                c2421o.f8648k = false;
                                return;
                            }
                            C1235n c1235n = (C1235n) sparseArray.get(iM2498o3);
                            SparseArray sparseArray2 = c2421o.f8641d;
                            int i13 = c1235n.f5149a;
                            boolean z9 = c1235n.f5150b;
                            C1236o c1236o = (C1236o) sparseArray2.get(i13);
                            boolean z10 = c1236o.f5160j;
                            int i14 = c1236o.f5164n;
                            int i15 = c1236o.f5162l;
                            if (z10) {
                                if (!c1131v.m2488e(2)) {
                                    return;
                                } else {
                                    c1131v.m2505v(2);
                                }
                            }
                            if (c1131v.m2488e(i15)) {
                                int iM2494k3 = c1131v.m2494k(i15);
                                if (c1236o.f5161k) {
                                    zM2493j = false;
                                    zM2493j2 = false;
                                } else {
                                    if (!c1131v.m2488e(1)) {
                                        return;
                                    }
                                    zM2493j = c1131v.m2493j();
                                    if (zM2493j) {
                                        if (c1131v.m2488e(1)) {
                                            zM2493j2 = c1131v.m2493j();
                                            z7 = true;
                                            z8 = c2421o.f8646i != 5;
                                            if (z8) {
                                                iM2498o = 0;
                                            } else if (!c1131v.m2489f()) {
                                                return;
                                            } else {
                                                iM2498o = c1131v.m2498o();
                                            }
                                            i8 = c1236o.f5163m;
                                            if (i8 != 0) {
                                                if (!c1131v.m2488e(i14)) {
                                                    return;
                                                }
                                                iM2494k = c1131v.m2494k(i14);
                                                if (!z9 || zM2493j) {
                                                    iM2499p = 0;
                                                } else if (!c1131v.m2489f()) {
                                                    return;
                                                } else {
                                                    iM2499p = c1131v.m2499p();
                                                }
                                                iM2499p2 = 0;
                                            } else {
                                                if (i8 == 1 && !c1236o.f5165o) {
                                                    if (c1131v.m2489f()) {
                                                        int iM2499p3 = c1131v.m2499p();
                                                        if (!z9 || zM2493j) {
                                                            i9 = iM2499p3;
                                                            iM2499p = 0;
                                                            iM2499p2 = 0;
                                                        } else {
                                                            if (!c1131v.m2489f()) {
                                                                return;
                                                            }
                                                            iM2499p2 = c1131v.m2499p();
                                                            i9 = iM2499p3;
                                                            iM2499p = 0;
                                                        }
                                                        iM2494k = 0;
                                                        C2420n c2420n2 = c2421o.f8651n;
                                                        c2420n2.f8624c = c1236o;
                                                        c2420n2.f8625d = iM2494k2;
                                                        c2420n2.f8626e = iM2498o2;
                                                        c2420n2.f8627f = iM2494k3;
                                                        c2420n2.f8628g = iM2498o3;
                                                        c2420n2.f8629h = zM2493j;
                                                        c2420n2.f8630i = z7;
                                                        c2420n2.f8631j = zM2493j2;
                                                        c2420n2.f8632k = z8;
                                                        c2420n2.f8633l = iM2498o;
                                                        c2420n2.f8634m = iM2494k;
                                                        c2420n2.f8635n = iM2499p;
                                                        c2420n2.f8636o = i9;
                                                        c2420n2.f8637p = iM2499p2;
                                                        c2420n2.f8622a = true;
                                                        c2420n2.f8623b = true;
                                                        c2421o.f8648k = false;
                                                    }
                                                    return;
                                                }
                                                iM2499p = 0;
                                                iM2499p2 = 0;
                                                iM2494k = 0;
                                            }
                                            i9 = 0;
                                            C2420n c2420n22 = c2421o.f8651n;
                                            c2420n22.f8624c = c1236o;
                                            c2420n22.f8625d = iM2494k2;
                                            c2420n22.f8626e = iM2498o2;
                                            c2420n22.f8627f = iM2494k3;
                                            c2420n22.f8628g = iM2498o3;
                                            c2420n22.f8629h = zM2493j;
                                            c2420n22.f8630i = z7;
                                            c2420n22.f8631j = zM2493j2;
                                            c2420n22.f8632k = z8;
                                            c2420n22.f8633l = iM2498o;
                                            c2420n22.f8634m = iM2494k;
                                            c2420n22.f8635n = iM2499p;
                                            c2420n22.f8636o = i9;
                                            c2420n22.f8637p = iM2499p2;
                                            c2420n22.f8622a = true;
                                            c2420n22.f8623b = true;
                                            c2421o.f8648k = false;
                                        }
                                        return;
                                    }
                                    zM2493j2 = false;
                                }
                                z7 = zM2493j2;
                                if (c2421o.f8646i != 5) {
                                }
                                if (z8) {
                                }
                                i8 = c1236o.f5163m;
                                if (i8 != 0) {
                                }
                                i9 = 0;
                                C2420n c2420n222 = c2421o.f8651n;
                                c2420n222.f8624c = c1236o;
                                c2420n222.f8625d = iM2494k2;
                                c2420n222.f8626e = iM2498o2;
                                c2420n222.f8627f = iM2494k3;
                                c2420n222.f8628g = iM2498o3;
                                c2420n222.f8629h = zM2493j;
                                c2420n222.f8630i = z7;
                                c2420n222.f8631j = zM2493j2;
                                c2420n222.f8632k = z8;
                                c2420n222.f8633l = iM2498o;
                                c2420n222.f8634m = iM2494k;
                                c2420n222.f8635n = iM2499p;
                                c2420n222.f8636o = i9;
                                c2420n222.f8637p = iM2499p2;
                                c2420n222.f8622a = true;
                                c2420n222.f8623b = true;
                                c2421o.f8648k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        this.f8663g = 0L;
        this.f8670n = false;
        this.f8669m = -9223372036854775807L;
        AbstractC1237p.m2680a(this.f8664h);
        this.f8660d.m4321f();
        this.f8661e.m4321f();
        this.f8662f.m4321f();
        ((C1240s) this.f8657a.f326m).m2699i(0);
        C2421o c2421o = this.f8667k;
        if (c2421o != null) {
            c2421o.f8648k = false;
            c2421o.f8652o = false;
            C2420n c2420n = c2421o.f8651n;
            c2420n.f8623b = false;
            c2420n.f8622a = false;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
        AbstractC1101a.m2360k(this.f8666j);
        int i = AbstractC1118i0.f4750a;
        if (z7) {
            ((C1240s) this.f8657a.f326m).m2699i(0);
            C2421o c2421o = this.f8667k;
            long j = this.f8663g;
            c2421o.m4292a();
            c2421o.f8647j = j;
            long j8 = c2421o.f8654q;
            if (j8 != -9223372036854775807L) {
                boolean z8 = c2421o.f8655r;
                c2421o.f8638a.sampleMetadata(j8, z8 ? 1 : 0, (int) (j - c2421o.f8653p), 0, null);
            }
            c2421o.f8652o = false;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        c2411g0.m4255a();
        c2411g0.m4256b();
        this.f8665i = c2411g0.f8573e;
        c2411g0.m4256b();
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 2);
        this.f8666j = interfaceC1980i0Track;
        this.f8667k = new C2421o(interfaceC1980i0Track, this.f8658b, this.f8659c);
        this.f8657a.m296s(interfaceC1989p, c2411g0);
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8669m = j;
        this.f8670n = ((i & 2) != 0) | this.f8670n;
    }
}
