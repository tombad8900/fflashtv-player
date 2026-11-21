package p104m;

import android.content.Context;
import android.view.View;
import com.exotv.net.R;
import p095l.AbstractC1636v;
import p095l.C1629o;
import p095l.C1638x;
import p095l.MenuC1627m;
import p095l.SubMenuC1620f0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.g */
/* loaded from: classes.dex */
public final class C1720g extends C1638x {

    /* renamed from: m */
    public final /* synthetic */ int f6546m = 0;

    /* renamed from: n */
    public final /* synthetic */ C1736k f6547n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720g(C1736k c1736k, Context context, MenuC1627m menuC1627m, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, menuC1627m, true);
        this.f6547n = c1736k;
        this.f6276g = 8388613;
        C1629o c1629o = c1736k.f6589F;
        this.f6278i = c1629o;
        AbstractC1636v abstractC1636v = this.f6279j;
        if (abstractC1636v != null) {
            abstractC1636v.mo3280g(c1629o);
        }
    }

    @Override // p095l.C1638x
    /* renamed from: c */
    public final void mo3340c() {
        switch (this.f6546m) {
            case 0:
                C1736k c1736k = this.f6547n;
                c1736k.f6586C = null;
                c1736k.getClass();
                super.mo3340c();
                break;
            default:
                C1736k c1736k2 = this.f6547n;
                MenuC1627m menuC1627m = c1736k2.f6592l;
                if (menuC1627m != null) {
                    menuC1627m.m3308c(true);
                }
                c1736k2.f6585B = null;
                super.mo3340c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720g(C1736k c1736k, Context context, SubMenuC1620f0 subMenuC1620f0, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC1620f0, false);
        this.f6547n = c1736k;
        if ((subMenuC1620f0.f6160J.f6236G & 32) != 32) {
            View view2 = c1736k.f6598r;
            this.f6275f = view2 == null ? (View) c1736k.f6597q : view2;
        }
        C1629o c1629o = c1736k.f6589F;
        this.f6278i = c1629o;
        AbstractC1636v abstractC1636v = this.f6279j;
        if (abstractC1636v != null) {
            abstractC1636v.mo3280g(c1629o);
        }
    }
}
