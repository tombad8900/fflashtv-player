package p198w7;

import java.io.IOException;
import p189v7.AbstractC2587r;
import p189v7.C2573j;
import p189v7.InterfaceC2576k0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.e */
/* loaded from: classes.dex */
public final class C2709e extends AbstractC2587r {

    /* renamed from: j */
    public final long f9831j;

    /* renamed from: k */
    public final boolean f9832k;

    /* renamed from: l */
    public long f9833l;

    public C2709e(InterfaceC2576k0 interfaceC2576k0, long j, boolean z7) {
        super(interfaceC2576k0);
        this.f9831j = j;
        this.f9832k = z7;
    }

    @Override // p189v7.AbstractC2587r, p189v7.InterfaceC2576k0
    public final long read(C2573j c2573j, long j) throws IOException {
        AbstractC2980h.m5136e("sink", c2573j);
        long j8 = this.f9833l;
        long j9 = this.f9831j;
        if (j8 > j9) {
            j = 0;
        } else if (this.f9832k) {
            long j10 = j9 - j8;
            if (j10 == 0) {
                return -1L;
            }
            j = Math.min(j, j10);
        }
        long j11 = super.read(c2573j, j);
        if (j11 != -1) {
            this.f9833l += j11;
        }
        long j12 = this.f9833l;
        if ((j12 >= j9 || j11 != -1) && j12 <= j9) {
            return j11;
        }
        if (j11 > 0 && j12 > j9) {
            long j13 = c2573j.f9314k - (j12 - j9);
            C2573j c2573j2 = new C2573j();
            c2573j2.mo4598f(c2573j);
            c2573j.write(c2573j2, j13);
            c2573j2.skip(c2573j2.f9314k);
        }
        throw new IOException("expected " + j9 + " bytes but got " + this.f9833l);
    }
}
