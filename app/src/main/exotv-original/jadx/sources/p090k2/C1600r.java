package p090k2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.analytics.C0294p;
import java.io.EOFException;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p115n1.C1978h0;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.r */
/* loaded from: classes.dex */
public final class C1600r implements InterfaceC1980i0 {

    /* renamed from: a */
    public final InterfaceC1980i0 f6081a;

    /* renamed from: b */
    public final InterfaceC1597o f6082b;

    /* renamed from: g */
    public InterfaceC1599q f6087g;

    /* renamed from: h */
    public C0249w f6088h;

    /* renamed from: d */
    public int f6084d = 0;

    /* renamed from: e */
    public int f6085e = 0;

    /* renamed from: f */
    public byte[] f6086f = AbstractC1118i0.f4755f;

    /* renamed from: c */
    public final C1132w f6083c = new C1132w();

    public C1600r(InterfaceC1980i0 interfaceC1980i0, InterfaceC1597o interfaceC1597o) {
        this.f6081a = interfaceC1980i0;
        this.f6082b = interfaceC1597o;
    }

    /* renamed from: a */
    public final void m3265a(int i) {
        int length = this.f6086f.length;
        int i4 = this.f6085e;
        if (length - i4 >= i) {
            return;
        }
        int i8 = i4 - this.f6084d;
        int iMax = Math.max(i8 * 2, i + i8);
        byte[] bArr = this.f6086f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f6084d, bArr2, 0, i8);
        this.f6084d = 0;
        this.f6085e = i8;
        this.f6086f = bArr2;
    }

    @Override // p115n1.InterfaceC1980i0
    public final void format(C0249w c0249w) {
        c0249w.f1522n.getClass();
        String str = c0249w.f1522n;
        AbstractC1101a.m2353d(AbstractC0244u0.m680i(str) == 3);
        boolean zEquals = c0249w.equals(this.f6088h);
        InterfaceC1597o interfaceC1597o = this.f6082b;
        if (!zEquals) {
            this.f6088h = c0249w;
            this.f6087g = interfaceC1597o.supportsFormat(c0249w) ? interfaceC1597o.mo3259g(c0249w) : null;
        }
        InterfaceC1599q interfaceC1599q = this.f6087g;
        InterfaceC1980i0 interfaceC1980i0 = this.f6081a;
        if (interfaceC1599q == null) {
            interfaceC1980i0.format(c0249w);
            return;
        }
        C0246v c0246vM692a = c0249w.m692a();
        c0246vM692a.f1447m = AbstractC0244u0.m687p("application/x-media3-cues");
        c0246vM692a.f1444j = str;
        c0246vM692a.f1452r = Long.MAX_VALUE;
        c0246vM692a.f1431H = interfaceC1597o.mo3257c(c0249w);
        interfaceC1980i0.format(new C0249w(c0246vM692a));
    }

    @Override // p115n1.InterfaceC1980i0
    public final int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7, int i4) throws EOFException {
        if (this.f6087g == null) {
            return this.f6081a.sampleData(interfaceC0219m, i, z7, 0);
        }
        m3265a(i);
        int i8 = interfaceC0219m.read(this.f6086f, this.f6085e, i);
        if (i8 != -1) {
            this.f6085e += i8;
            return i8;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p115n1.InterfaceC1980i0
    public final void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
        if (this.f6087g == null) {
            this.f6081a.sampleMetadata(j, i, i4, i8, c1978h0);
            return;
        }
        AbstractC1101a.m2352c("DRM on subtitles is not supported", c1978h0 == null);
        int i9 = (this.f6085e - i8) - i4;
        this.f6087g.mo75f(this.f6086f, i9, i4, C1598p.f6078c, new C0294p(this, i, 2, j));
        int i10 = i9 + i4;
        this.f6084d = i10;
        if (i10 == this.f6085e) {
            this.f6084d = 0;
            this.f6085e = 0;
        }
    }

    @Override // p115n1.InterfaceC1980i0
    public final void sampleData(C1132w c1132w, int i, int i4) {
        if (this.f6087g == null) {
            this.f6081a.sampleData(c1132w, i, i4);
            return;
        }
        m3265a(i);
        c1132w.m2519e(this.f6086f, this.f6085e, i);
        this.f6085e += i;
    }
}
