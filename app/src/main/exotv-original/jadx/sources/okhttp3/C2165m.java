package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.connection.C2098h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.m */
/* loaded from: classes.dex */
public final class C2165m {
    private final C2098h delegate;

    public C2165m(C2098h c2098h) {
        AbstractC2980h.m5136e("delegate", c2098h);
        this.delegate = c2098h;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    public final C2098h getDelegate$okhttp() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2165m(int i, long j, TimeUnit timeUnit) {
        this(new C2098h(C2090e.INSTANCE, i, j, timeUnit));
        AbstractC2980h.m5136e("timeUnit", timeUnit);
    }

    public C2165m() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
