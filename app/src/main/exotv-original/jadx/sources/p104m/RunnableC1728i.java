package p104m;

import android.view.View;
import p095l.InterfaceC1625k;
import p095l.MenuC1627m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.i */
/* loaded from: classes.dex */
public final class RunnableC1728i implements Runnable {

    /* renamed from: j */
    public final C1720g f6563j;

    /* renamed from: k */
    public final /* synthetic */ C1736k f6564k;

    public RunnableC1728i(C1736k c1736k, C1720g c1720g) {
        this.f6564k = c1736k;
        this.f6563j = c1720g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1625k interfaceC1625k;
        C1736k c1736k = this.f6564k;
        MenuC1627m menuC1627m = c1736k.f6592l;
        if (menuC1627m != null && (interfaceC1625k = menuC1627m.f6213n) != null) {
            interfaceC1625k.mo2264h(menuC1627m);
        }
        View view = (View) c1736k.f6597q;
        if (view != null && view.getWindowToken() != null) {
            C1720g c1720g = this.f6563j;
            if (c1720g.m3339b()) {
                c1736k.f6585B = c1720g;
            } else if (c1720g.f6275f != null) {
                c1720g.m3341d(0, 0, false, false);
                c1736k.f6585B = c1720g;
            }
        }
        c1736k.f6587D = null;
    }
}
