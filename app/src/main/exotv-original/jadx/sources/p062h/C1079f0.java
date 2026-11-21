package p062h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p002a1.C0016e;
import p002a1.C0022h;
import p087k.AbstractC1536a;
import p087k.C1543h;
import p095l.InterfaceC1625k;
import p095l.MenuC1627m;
import p104m.C1736k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.f0 */
/* loaded from: classes.dex */
public final class C1079f0 extends AbstractC1536a implements InterfaceC1625k {

    /* renamed from: l */
    public final Context f4564l;

    /* renamed from: m */
    public final MenuC1627m f4565m;

    /* renamed from: n */
    public C0016e f4566n;

    /* renamed from: o */
    public WeakReference f4567o;

    /* renamed from: p */
    public final /* synthetic */ C1081g0 f4568p;

    public C1079f0(C1081g0 c1081g0, Context context, C0016e c0016e) {
        this.f4568p = c1081g0;
        this.f4564l = context;
        this.f4566n = c0016e;
        MenuC1627m menuC1627m = new MenuC1627m(context);
        menuC1627m.f6220u = 1;
        this.f4565m = menuC1627m;
        menuC1627m.f6213n = this;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: a */
    public final void mo2257a() {
        C1081g0 c1081g0 = this.f4568p;
        if (c1081g0.f4595x != this) {
            return;
        }
        if (c1081g0.f4578E) {
            c1081g0.f4596y = this;
            c1081g0.f4597z = this.f4566n;
        } else {
            this.f4566n.m37G(this);
        }
        this.f4566n = null;
        c1081g0.m2278h0(false);
        ActionBarContextView actionBarContextView = c1081g0.f4592u;
        if (actionBarContextView.f669t == null) {
            actionBarContextView.m449e();
        }
        c1081g0.f4589r.setHideOnContentScrollEnabled(c1081g0.f4583J);
        c1081g0.f4595x = null;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: b */
    public final View mo2258b() {
        WeakReference weakReference = this.f4567o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: c */
    public final MenuC1627m mo2259c() {
        return this.f4565m;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: d */
    public final MenuInflater mo2260d() {
        return new C1543h(this.f4564l);
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: e */
    public final CharSequence mo2261e() {
        return this.f4568p.f4592u.getSubtitle();
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: f */
    public final CharSequence mo2262f() {
        return this.f4568p.f4592u.getTitle();
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: g */
    public final void mo2263g() {
        if (this.f4568p.f4595x != this) {
            return;
        }
        MenuC1627m menuC1627m = this.f4565m;
        menuC1627m.m3320w();
        try {
            this.f4566n.m38H(this, menuC1627m);
        } finally {
            menuC1627m.m3319v();
        }
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: h */
    public final void mo2264h(MenuC1627m menuC1627m) {
        if (this.f4566n == null) {
            return;
        }
        mo2263g();
        C1736k c1736k = this.f4568p.f4592u.f662m;
        if (c1736k != null) {
            c1736k.m3417l();
        }
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: i */
    public final boolean mo2265i() {
        return this.f4568p.f4592u.f650B;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: j */
    public final void mo2266j(View view) {
        this.f4568p.f4592u.setCustomView(view);
        this.f4567o = new WeakReference(view);
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: k */
    public final boolean mo2267k(MenuC1627m menuC1627m, MenuItem menuItem) {
        C0016e c0016e = this.f4566n;
        if (c0016e != null) {
            return ((C0022h) c0016e.f62k).m83n(this, menuItem);
        }
        return false;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: l */
    public final void mo2268l(int i) {
        mo2269m(this.f4568p.f4587p.getResources().getString(i));
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: m */
    public final void mo2269m(CharSequence charSequence) {
        this.f4568p.f4592u.setSubtitle(charSequence);
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: n */
    public final void mo2270n(int i) {
        mo2271o(this.f4568p.f4587p.getResources().getString(i));
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: o */
    public final void mo2271o(CharSequence charSequence) {
        this.f4568p.f4592u.setTitle(charSequence);
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: p */
    public final void mo2272p(boolean z7) {
        this.f5858k = z7;
        this.f4568p.f4592u.setTitleOptional(z7);
    }
}
