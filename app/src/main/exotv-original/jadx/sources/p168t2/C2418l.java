package p168t2;

import p063h1.AbstractC1101a;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.l */
/* loaded from: classes.dex */
public final class C2418l {

    /* renamed from: a */
    public final InterfaceC1980i0 f8602a;

    /* renamed from: b */
    public boolean f8603b;

    /* renamed from: c */
    public boolean f8604c;

    /* renamed from: d */
    public boolean f8605d;

    /* renamed from: e */
    public int f8606e;

    /* renamed from: f */
    public int f8607f;

    /* renamed from: g */
    public long f8608g;

    /* renamed from: h */
    public long f8609h;

    public C2418l(InterfaceC1980i0 interfaceC1980i0) {
        this.f8602a = interfaceC1980i0;
    }

    /* renamed from: a */
    public final void m4290a(byte[] bArr, int i, int i4) {
        if (this.f8604c) {
            int i8 = this.f8607f;
            int i9 = (i + 1) - i8;
            if (i9 >= i4) {
                this.f8607f = (i4 - i) + i8;
            } else {
                this.f8605d = ((bArr[i9] & 192) >> 6) == 0;
                this.f8604c = false;
            }
        }
    }

    /* renamed from: b */
    public final void m4291b(int i, boolean z7, long j) {
        AbstractC1101a.m2359j(this.f8609h != -9223372036854775807L);
        if (this.f8606e == 182 && z7 && this.f8603b) {
            this.f8602a.sampleMetadata(this.f8609h, this.f8605d ? 1 : 0, (int) (j - this.f8608g), i, null);
        }
        if (this.f8606e != 179) {
            this.f8608g = j;
        }
    }
}
