package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import androidx.media3.exoplayer.SuitableOutputChecker;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {
    private static final RouteDiscoveryPreference EMPTY_DISCOVERY_PREFERENCE;
    private MediaRouter2$ControllerCallback controllerCallback;
    private final Executor executor;
    private boolean isPreviousSelectedOutputSuitableForPlayback;
    private final MediaRouter2$RouteCallback routeCallback = new MediaRouter2$RouteCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.1
    };
    private final MediaRouter2 router;

    static {
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        EMPTY_DISCOVERY_PREFERENCE = new RouteDiscoveryPreference.Builder(C0981l1.f4211n, false).build();
    }

    public DefaultSuitableOutputChecker(Context context, final Handler handler) {
        this.router = MediaRouter2.getInstance(context);
        this.executor = new Executor() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.2
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                AbstractC1118i0.m2432W(handler, runnable);
            }
        };
    }

    private static boolean isRouteSuitableForMediaPlayback(MediaRoute2Info mediaRoute2Info, int i, boolean z7) {
        int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
        return suitabilityStatus == 1 ? (i == 1 || i == 2) && z7 : suitabilityStatus == 0;
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void disable() {
        AbstractC1101a.m2361l("SuitableOutputChecker is not enabled", this.controllerCallback);
        this.router.unregisterControllerCallback(this.controllerCallback);
        this.controllerCallback = null;
        this.router.unregisterRouteCallback(this.routeCallback);
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void enable(final SuitableOutputChecker.Callback callback) {
        this.router.registerRouteCallback(this.executor, this.routeCallback, EMPTY_DISCOVERY_PREFERENCE);
        MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = new MediaRouter2$ControllerCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.3
            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                boolean zIsSelectedOutputSuitableForPlayback = DefaultSuitableOutputChecker.this.isSelectedOutputSuitableForPlayback();
                if (DefaultSuitableOutputChecker.this.isPreviousSelectedOutputSuitableForPlayback != zIsSelectedOutputSuitableForPlayback) {
                    DefaultSuitableOutputChecker.this.isPreviousSelectedOutputSuitableForPlayback = zIsSelectedOutputSuitableForPlayback;
                    callback.onSelectedOutputSuitabilityChanged(zIsSelectedOutputSuitableForPlayback);
                }
            }
        };
        this.controllerCallback = mediaRouter2$ControllerCallback;
        this.router.registerControllerCallback(this.executor, mediaRouter2$ControllerCallback);
        this.isPreviousSelectedOutputSuitableForPlayback = isSelectedOutputSuitableForPlayback();
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public boolean isSelectedOutputSuitableForPlayback() {
        AbstractC1101a.m2361l("SuitableOutputChecker is not enabled", this.controllerCallback);
        int transferReason = this.router.getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean zWasTransferInitiatedBySelf = this.router.getSystemController().wasTransferInitiatedBySelf();
        Iterator<MediaRoute2Info> it = this.router.getSystemController().getSelectedRoutes().iterator();
        while (it.hasNext()) {
            if (isRouteSuitableForMediaPlayback(it.next(), transferReason, zWasTransferInitiatedBySelf)) {
                return true;
            }
        }
        return false;
    }
}
