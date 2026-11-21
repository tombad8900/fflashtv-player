package p115n1;

import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.j0 */
/* loaded from: classes.dex */
public final class C1982j0 {

    /* renamed from: a */
    public final byte[] f7348a = new byte[10];

    /* renamed from: b */
    public boolean f7349b;

    /* renamed from: c */
    public int f7350c;

    /* renamed from: d */
    public long f7351d;

    /* renamed from: e */
    public int f7352e;

    /* renamed from: f */
    public int f7353f;

    /* renamed from: g */
    public int f7354g;

    /* renamed from: a */
    public final void m3851a(InterfaceC1980i0 interfaceC1980i0, C1978h0 c1978h0) {
        if (this.f7350c > 0) {
            interfaceC1980i0.sampleMetadata(this.f7351d, this.f7352e, this.f7353f, this.f7354g, c1978h0);
            this.f7350c = 0;
        }
    }

    /* renamed from: b */
    public final void m3852b(InterfaceC1980i0 interfaceC1980i0, long j, int i, int i4, int i8, C1978h0 c1978h0) {
        AbstractC1101a.m2358i("TrueHD chunk samples must be contiguous in the sample queue.", this.f7354g <= i4 + i8);
        if (this.f7349b) {
            int i9 = this.f7350c;
            int i10 = i9 + 1;
            this.f7350c = i10;
            if (i9 == 0) {
                this.f7351d = j;
                this.f7352e = i;
                this.f7353f = 0;
            }
            this.f7353f += i4;
            this.f7354g = i8;
            if (i10 >= 16) {
                m3851a(interfaceC1980i0, c1978h0);
            }
        }
    }

    /* renamed from: c */
    public final void m3853c(InterfaceC1988o interfaceC1988o) {
        if (this.f7349b) {
            return;
        }
        byte[] bArr = this.f7348a;
        interfaceC1988o.mo3862i(bArr, 0, 10);
        interfaceC1988o.mo3860g();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b7 = bArr[7];
            if ((b7 & 254) == 186) {
                i = 40 << ((bArr[((b7 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f7349b = true;
    }
}
