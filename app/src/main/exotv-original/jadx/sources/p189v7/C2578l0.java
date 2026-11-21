package p189v7;

import java.util.concurrent.TimeUnit;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.l0 */
/* loaded from: classes.dex */
public final class C2578l0 extends C2582n0 {
    @Override // p189v7.C2582n0
    public final C2582n0 deadlineNanoTime(long j) {
        return this;
    }

    @Override // p189v7.C2582n0
    public final void throwIfReached() {
    }

    @Override // p189v7.C2582n0
    public final C2582n0 timeout(long j, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("unit", timeUnit);
        return this;
    }
}
