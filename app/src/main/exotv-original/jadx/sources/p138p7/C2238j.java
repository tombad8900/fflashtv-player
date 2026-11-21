package p138p7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p112m7.AbstractC1942r;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p7.j */
/* loaded from: classes.dex */
public final class C2238j extends AbstractC1942r {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f7767e;

    public C2238j(long j, C2238j c2238j, int i) {
        super(j, c2238j, i);
        this.f7767e = new AtomicReferenceArray(AbstractC2237i.f7766f);
    }

    @Override // p112m7.AbstractC1942r
    /* renamed from: d */
    public final int mo3794d() {
        return AbstractC2237i.f7766f;
    }

    @Override // p112m7.AbstractC1942r
    /* renamed from: e */
    public final void mo3795e(int i) {
        this.f7767e.set(i, AbstractC2237i.f7765e);
        if (AbstractC1942r.f7230d.incrementAndGet(this) == AbstractC2237i.f7766f) {
            m3775b();
        }
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f7231c + ", hashCode=" + hashCode() + ']';
    }
}
