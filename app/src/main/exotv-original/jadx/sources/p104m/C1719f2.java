package p104m;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p002a1.C0021g0;
import p095l.InterfaceC1625k;
import p095l.MenuC1627m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.f2 */
/* loaded from: classes.dex */
public final class C1719f2 implements InterfaceC1748n, InterfaceC1625k {

    /* renamed from: j */
    public final /* synthetic */ Toolbar f6545j;

    public /* synthetic */ C1719f2(Toolbar toolbar) {
        this.f6545j = toolbar;
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: h */
    public void mo2264h(MenuC1627m menuC1627m) {
        Toolbar toolbar = this.f6545j;
        C1736k c1736k = toolbar.f762j.f712C;
        if (c1736k == null || !c1736k.m3416h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f751P.f326m).iterator();
            while (it.hasNext()) {
                ((C0021g0) it.next()).f77a.m153s();
            }
        }
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: k */
    public boolean mo2267k(MenuC1627m menuC1627m, MenuItem menuItem) {
        this.f6545j.getClass();
        return false;
    }
}
