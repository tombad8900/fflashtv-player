package p072i2;

import java.io.EOFException;
import p002a1.C0016e;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p089k1.C1572p;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.e */
/* loaded from: classes.dex */
public final class C1245e implements InterfaceC1563g {

    /* renamed from: j */
    public int f5200j;

    /* renamed from: k */
    public int f5201k;

    /* renamed from: l */
    public boolean f5202l;

    /* renamed from: m */
    public final Object f5203m;

    /* renamed from: n */
    public Object f5204n;

    public C1245e(int i) {
        switch (i) {
            case 1:
                this.f5203m = new C0016e(20);
                this.f5200j = 8000;
                this.f5201k = 8000;
                break;
            default:
                this.f5203m = new C1246f();
                this.f5204n = new C1132w(new byte[65025], 0);
                this.f5200j = -1;
                break;
        }
    }

    /* renamed from: a */
    public int m2718a(int i) {
        int i4;
        int i8 = 0;
        this.f5201k = 0;
        do {
            int i9 = this.f5201k;
            int i10 = i + i9;
            C1246f c1246f = (C1246f) this.f5203m;
            if (i10 >= c1246f.f5207c) {
                break;
            }
            int[] iArr = c1246f.f5210f;
            this.f5201k = i9 + 1;
            i4 = iArr[i10];
            i8 += i4;
        } while (i4 == 255);
        return i8;
    }

    /* renamed from: b */
    public boolean m2719b(InterfaceC1988o interfaceC1988o) {
        int i;
        C1246f c1246f = (C1246f) this.f5203m;
        C1132w c1132w = (C1132w) this.f5204n;
        AbstractC1101a.m2359j(interfaceC1988o != null);
        if (this.f5202l) {
            this.f5202l = false;
            c1132w.m2510D(0);
        }
        while (!this.f5202l) {
            if (this.f5200j < 0) {
                if (c1246f.m2721b(interfaceC1988o, -1L) && c1246f.m2720a(interfaceC1988o, true)) {
                    int iM2718a = c1246f.f5208d;
                    if ((c1246f.f5205a & 1) == 1 && c1132w.f4801c == 0) {
                        iM2718a += m2718a(0);
                        i = this.f5201k;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC1988o.mo3861h(iM2718a);
                        this.f5200j = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM2718a2 = m2718a(this.f5200j);
            int i4 = this.f5200j + this.f5201k;
            if (iM2718a2 > 0) {
                c1132w.m2516b(c1132w.f4801c + iM2718a2);
                try {
                    interfaceC1988o.readFully(c1132w.f4799a, c1132w.f4801c, iM2718a2);
                    c1132w.m2512F(c1132w.f4801c + iM2718a2);
                    this.f5202l = c1246f.f5210f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == c1246f.f5207c) {
                i4 = -1;
            }
            this.f5200j = i4;
        }
        return true;
    }

    @Override // p089k1.InterfaceC1563g
    /* renamed from: l */
    public InterfaceC1564h mo55l() {
        return new C1572p((String) this.f5204n, this.f5200j, this.f5201k, this.f5202l, (C0016e) this.f5203m);
    }
}
