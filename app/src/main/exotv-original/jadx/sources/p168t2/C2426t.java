package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p115n1.C1999z;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.t */
/* loaded from: classes.dex */
public final class C2426t implements InterfaceC2412h {

    /* renamed from: a */
    public final C1132w f8721a;

    /* renamed from: b */
    public final C1999z f8722b;

    /* renamed from: c */
    public final String f8723c;

    /* renamed from: d */
    public final int f8724d;

    /* renamed from: e */
    public InterfaceC1980i0 f8725e;

    /* renamed from: f */
    public String f8726f;

    /* renamed from: g */
    public int f8727g = 0;

    /* renamed from: h */
    public int f8728h;

    /* renamed from: i */
    public boolean f8729i;

    /* renamed from: j */
    public boolean f8730j;

    /* renamed from: k */
    public long f8731k;

    /* renamed from: l */
    public int f8732l;

    /* renamed from: m */
    public long f8733m;

    public C2426t(String str, int i) {
        C1132w c1132w = new C1132w(4);
        this.f8721a = c1132w;
        c1132w.f4799a[0] = -1;
        this.f8722b = new C1999z();
        this.f8733m = -9223372036854775807L;
        this.f8723c = str;
        this.f8724d = i;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    public final void mo4245a(C1132w c1132w) {
        AbstractC1101a.m2360k(this.f8725e);
        while (c1132w.m2515a() > 0) {
            int i = this.f8727g;
            C1132w c1132w2 = this.f8721a;
            if (i == 0) {
                byte[] bArr = c1132w.f4799a;
                int i4 = c1132w.f4800b;
                int i8 = c1132w.f4801c;
                while (true) {
                    if (i4 >= i8) {
                        c1132w.m2513G(i8);
                        break;
                    }
                    byte b7 = bArr[i4];
                    boolean z7 = (b7 & 255) == 255;
                    boolean z8 = this.f8730j && (b7 & 224) == 224;
                    this.f8730j = z7;
                    if (z8) {
                        c1132w.m2513G(i4 + 1);
                        this.f8730j = false;
                        c1132w2.f4799a[1] = bArr[i4];
                        this.f8728h = 2;
                        this.f8727g = 1;
                        break;
                    }
                    i4++;
                }
            } else if (i == 1) {
                int iMin = Math.min(c1132w.m2515a(), 4 - this.f8728h);
                c1132w.m2519e(c1132w2.f4799a, this.f8728h, iMin);
                int i9 = this.f8728h + iMin;
                this.f8728h = i9;
                if (i9 >= 4) {
                    c1132w2.m2513G(0);
                    int iM2521g = c1132w2.m2521g();
                    C1999z c1999z = this.f8722b;
                    if (c1999z.m3879a(iM2521g)) {
                        this.f8732l = c1999z.f7410b;
                        if (!this.f8729i) {
                            this.f8731k = (c1999z.f7414f * 1000000) / c1999z.f7411c;
                            C0246v c0246v = new C0246v();
                            c0246v.f1435a = this.f8726f;
                            c0246v.f1447m = AbstractC0244u0.m687p((String) c1999z.f7415g);
                            c0246v.f1448n = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                            c0246v.f1425B = c1999z.f7412d;
                            c0246v.f1426C = c1999z.f7411c;
                            c0246v.f1438d = this.f8723c;
                            c0246v.f1440f = this.f8724d;
                            this.f8725e.format(new C0249w(c0246v));
                            this.f8729i = true;
                        }
                        c1132w2.m2513G(0);
                        this.f8725e.sampleData(c1132w2, 4);
                        this.f8727g = 2;
                    } else {
                        this.f8728h = 0;
                        this.f8727g = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c1132w.m2515a(), this.f8732l - this.f8728h);
                this.f8725e.sampleData(c1132w, iMin2);
                int i10 = this.f8728h + iMin2;
                this.f8728h = i10;
                if (i10 >= this.f8732l) {
                    AbstractC1101a.m2359j(this.f8733m != -9223372036854775807L);
                    this.f8725e.sampleMetadata(this.f8733m, 1, this.f8732l, 0, null);
                    this.f8733m += this.f8731k;
                    this.f8728h = 0;
                    this.f8727g = 0;
                }
            }
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        this.f8727g = 0;
        this.f8728h = 0;
        this.f8730j = false;
        this.f8733m = -9223372036854775807L;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        c2411g0.m4255a();
        c2411g0.m4256b();
        this.f8726f = c2411g0.f8573e;
        c2411g0.m4256b();
        this.f8725e = interfaceC1989p.track(c2411g0.f8572d, 1);
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8733m = j;
    }
}
