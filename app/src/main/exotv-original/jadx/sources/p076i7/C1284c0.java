package p076i7;

import com.bumptech.glide.AbstractC0715d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p112m7.AbstractC1925a;
import p112m7.C1941q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.c0 */
/* loaded from: classes.dex */
public final class C1284c0 extends C1941q {

    /* renamed from: n */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5311n = AtomicIntegerFieldUpdater.newUpdater(C1284c0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p112m7.C1941q, p076i7.C1279a1
    /* renamed from: k */
    public final void mo2763k(Object obj) {
        mo2764l(obj);
    }

    @Override // p112m7.C1941q, p076i7.C1279a1
    /* renamed from: l */
    public final void mo2764l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f5311n;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC1925a.m3770f(AbstractC1339x.m2851l(obj), AbstractC0715d.m1547P(this.f7229m));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
