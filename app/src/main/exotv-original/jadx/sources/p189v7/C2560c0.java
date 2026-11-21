package p189v7;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.c0 */
/* loaded from: classes.dex */
public final class C2560c0 implements InterfaceC2576k0 {

    /* renamed from: j */
    public final InterfaceC2577l f9274j;

    /* renamed from: k */
    public final C2573j f9275k;

    /* renamed from: l */
    public C2566f0 f9276l;

    /* renamed from: m */
    public int f9277m;

    /* renamed from: n */
    public boolean f9278n;

    /* renamed from: o */
    public long f9279o;

    public C2560c0(InterfaceC2577l interfaceC2577l) {
        this.f9274j = interfaceC2577l;
        C2573j c2573jMo4607a = interfaceC2577l.mo4607a();
        this.f9275k = c2573jMo4607a;
        C2566f0 c2566f0 = c2573jMo4607a.f9313j;
        this.f9276l = c2566f0;
        this.f9277m = c2566f0 != null ? c2566f0.f9293b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9278n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f9293b) goto L15;
     */
    @Override // p189v7.InterfaceC2576k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(C2573j c2573j, long j) {
        C2566f0 c2566f0;
        AbstractC2980h.m5136e("sink", c2573j);
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
        }
        if (this.f9278n) {
            throw new IllegalStateException("closed");
        }
        C2566f0 c2566f02 = this.f9276l;
        C2573j c2573j2 = this.f9275k;
        if (c2566f02 != null) {
            C2566f0 c2566f03 = c2573j2.f9313j;
            if (c2566f02 == c2566f03) {
                int i = this.f9277m;
                AbstractC2980h.m5133b(c2566f03);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f9274j.request(this.f9279o + 1)) {
            return -1L;
        }
        if (this.f9276l == null && (c2566f0 = c2573j2.f9313j) != null) {
            this.f9276l = c2566f0;
            this.f9277m = c2566f0.f9293b;
        }
        long jMin = Math.min(j, c2573j2.f9314k - this.f9279o);
        this.f9275k.m4665c(c2573j, this.f9279o, jMin);
        this.f9279o += jMin;
        return jMin;
    }

    @Override // p189v7.InterfaceC2576k0
    public final C2582n0 timeout() {
        return this.f9274j.timeout();
    }
}
