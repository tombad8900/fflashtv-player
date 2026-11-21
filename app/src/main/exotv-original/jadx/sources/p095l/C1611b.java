package p095l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p104m.AbstractViewOnTouchListenerC1742l1;
import p104m.C1720g;
import p104m.C1724h;
import p104m.C1732j;
import p104m.C1736k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.b */
/* loaded from: classes.dex */
public final class C1611b extends AbstractViewOnTouchListenerC1742l1 {

    /* renamed from: s */
    public final /* synthetic */ int f6126s = 0;

    /* renamed from: t */
    public final /* synthetic */ View f6127t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f6127t = actionMenuItemView;
    }

    @Override // p104m.AbstractViewOnTouchListenerC1742l1
    /* renamed from: b */
    public final InterfaceC1616d0 mo3271b() {
        C1720g c1720g;
        switch (this.f6126s) {
            case 0:
                AbstractC1613c abstractC1613c = ((ActionMenuItemView) this.f6127t).f617w;
                if (abstractC1613c == null || (c1720g = ((C1724h) abstractC1613c).f6555a.f6586C) == null) {
                    return null;
                }
                return c1720g.m3338a();
            default:
                C1720g c1720g2 = ((C1732j) this.f6127t).f6579m.f6585B;
                if (c1720g2 == null) {
                    return null;
                }
                return c1720g2.m3338a();
        }
    }

    @Override // p104m.AbstractViewOnTouchListenerC1742l1
    /* renamed from: c */
    public final boolean mo3272c() {
        InterfaceC1616d0 interfaceC1616d0Mo3271b;
        switch (this.f6126s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f6127t;
                InterfaceC1626l interfaceC1626l = actionMenuItemView.f615u;
                return interfaceC1626l != null && interfaceC1626l.mo441a(actionMenuItemView.f612r) && (interfaceC1616d0Mo3271b = mo3271b()) != null && interfaceC1616d0Mo3271b.mo3274a();
            default:
                ((C1732j) this.f6127t).f6579m.m3417l();
                return true;
        }
    }

    @Override // p104m.AbstractViewOnTouchListenerC1742l1
    /* renamed from: d */
    public boolean mo3273d() {
        switch (this.f6126s) {
            case 1:
                C1736k c1736k = ((C1732j) this.f6127t).f6579m;
                if (c1736k.f6587D != null) {
                    return false;
                }
                c1736k.m3415f();
                return true;
            default:
                return super.mo3273d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611b(C1732j c1732j, C1732j c1732j2) {
        super(c1732j2);
        this.f6127t = c1732j;
    }
}
