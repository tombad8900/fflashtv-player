package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C2162k0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.i */
/* loaded from: classes.dex */
public final class C2099i {
    private final Set<C2162k0> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(C2162k0 c2162k0) {
        AbstractC2980h.m5136e("route", c2162k0);
        this.failedRoutes.remove(c2162k0);
    }

    public final synchronized void failed(C2162k0 c2162k0) {
        AbstractC2980h.m5136e("failedRoute", c2162k0);
        this.failedRoutes.add(c2162k0);
    }

    public final synchronized boolean shouldPostpone(C2162k0 c2162k0) {
        AbstractC2980h.m5136e("route", c2162k0);
        return this.failedRoutes.contains(c2162k0);
    }
}
