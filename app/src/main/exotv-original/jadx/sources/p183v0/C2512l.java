package p183v0;

import java.util.concurrent.ThreadPoolExecutor;
import p002a1.C0022h;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.l */
/* loaded from: classes.dex */
public final class C2512l extends AbstractC2415i0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2415i0 f9153a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f9154b;

    public C2512l(AbstractC2415i0 abstractC2415i0, ThreadPoolExecutor threadPoolExecutor) {
        this.f9153a = abstractC2415i0;
        this.f9154b = threadPoolExecutor;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: u */
    public final void mo4287u(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f9154b;
        try {
            this.f9153a.mo4287u(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: x */
    public final void mo4288x(C0022h c0022h) {
        ThreadPoolExecutor threadPoolExecutor = this.f9154b;
        try {
            this.f9153a.mo4288x(c0022h);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
