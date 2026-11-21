package p127o7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p076i7.AbstractC1317n0;
import p137p6.InterfaceC2227h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.h */
/* loaded from: classes.dex */
public abstract class AbstractC2057h extends AbstractC1317n0 {

    /* renamed from: l */
    public ExecutorC2052c f7602l;

    @Override // p076i7.AbstractC1327r
    /* renamed from: D */
    public final void mo2822D(InterfaceC2227h interfaceC2227h, Runnable runnable) {
        ExecutorC2052c executorC2052c = this.f7602l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2052c.f7587q;
        executorC2052c.m3951c(runnable, false);
    }
}
