package p115n1;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import p063h1.AbstractC1101a;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.e0 */
/* loaded from: classes.dex */
public final class C1972e0 implements InterfaceC1987n {

    /* renamed from: a */
    public final int f7319a;

    /* renamed from: b */
    public final int f7320b;

    /* renamed from: c */
    public final String f7321c;

    /* renamed from: d */
    public int f7322d;

    /* renamed from: e */
    public int f7323e;

    /* renamed from: f */
    public InterfaceC1989p f7324f;

    /* renamed from: g */
    public InterfaceC1980i0 f7325g;

    public C1972e0(String str, int i, int i4) {
        this.f7319a = i;
        this.f7320b = i4;
        this.f7321c = str;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f7324f = interfaceC1989p;
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(1024, 4);
        this.f7325g = interfaceC1980i0Track;
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p(this.f7321c);
        interfaceC1980i0Track.format(new C0249w(c0246v));
        this.f7324f.endTracks();
        this.f7324f.seekMap(new C1974f0());
        this.f7323e = 1;
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        int i = this.f7323e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC1980i0 interfaceC1980i0 = this.f7325g;
        interfaceC1980i0.getClass();
        int iSampleData = interfaceC1980i0.sampleData((InterfaceC0219m) interfaceC1988o, 1024, true);
        if (iSampleData != -1) {
            this.f7322d += iSampleData;
            return 0;
        }
        this.f7323e = 2;
        this.f7325g.sampleMetadata(0L, 1, this.f7322d, 0, null);
        this.f7322d = 0;
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        if (j == 0 || this.f7323e == 1) {
            this.f7323e = 1;
            this.f7322d = 0;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        int i = this.f7320b;
        int i4 = this.f7319a;
        AbstractC1101a.m2359j((i4 == -1 || i == -1) ? false : true);
        C1132w c1132w = new C1132w(i);
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, i);
        return c1132w.m2507A() == i4;
    }
}
