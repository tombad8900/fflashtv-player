package p076i7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.o */
/* loaded from: classes.dex */
public class C1319o {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5357b = AtomicIntegerFieldUpdater.newUpdater(C1319o.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f5358a;

    public C1319o(Throwable th, boolean z7) {
        this.f5358a = th;
        this._handled$volatile = z7 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5358a + ']';
    }
}
