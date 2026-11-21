package p118n4;

import android.net.ConnectivityManager;
import android.net.Network;
import p005a4.C0073c;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.o */
/* loaded from: classes.dex */
public final class C2018o extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ int f7445a;

    /* renamed from: b */
    public final /* synthetic */ Object f7446b;

    public /* synthetic */ C2018o(int i, Object obj) {
        this.f7445a = i;
        this.f7446b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f7445a) {
            case 0:
                AbstractC2478m.m4458f().post(new RunnableC2017n(this, true));
                break;
            default:
                C0073c.m266p((C0073c) this.f7446b, network, true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f7445a) {
            case 0:
                AbstractC2478m.m4458f().post(new RunnableC2017n(this, false));
                break;
            default:
                C0073c.m266p((C0073c) this.f7446b, network, false);
                break;
        }
    }
}
