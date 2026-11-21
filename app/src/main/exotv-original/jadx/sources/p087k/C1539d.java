package p087k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p002a1.C0016e;
import p002a1.C0022h;
import p095l.InterfaceC1625k;
import p095l.MenuC1627m;
import p104m.C1736k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.d */
/* loaded from: classes.dex */
public final class C1539d extends AbstractC1536a implements InterfaceC1625k {

    /* renamed from: l */
    public Context f5865l;

    /* renamed from: m */
    public ActionBarContextView f5866m;

    /* renamed from: n */
    public C0016e f5867n;

    /* renamed from: o */
    public WeakReference f5868o;

    /* renamed from: p */
    public boolean f5869p;

    /* renamed from: q */
    public MenuC1627m f5870q;

    @Override // p087k.AbstractC1536a
    /* renamed from: a */
    public final void mo2257a() {
        if (this.f5869p) {
            return;
        }
        this.f5869p = true;
        this.f5867n.m37G(this);
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: b */
    public final View mo2258b() {
        WeakReference weakReference = this.f5868o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: c */
    public final MenuC1627m mo2259c() {
        return this.f5870q;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: d */
    public final MenuInflater mo2260d() {
        return new C1543h(this.f5866m.getContext());
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: e */
    public final CharSequence mo2261e() {
        return this.f5866m.getSubtitle();
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: f */
    public final CharSequence mo2262f() {
        return this.f5866m.getTitle();
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: g */
    public final void mo2263g() {
        this.f5867n.m38H(this, this.f5870q);
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: h */
    public final void mo2264h(MenuC1627m menuC1627m) {
        mo2263g();
        C1736k c1736k = this.f5866m.f662m;
        if (c1736k != null) {
            c1736k.m3417l();
        }
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: i */
    public final boolean mo2265i() {
        return this.f5866m.f650B;
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: j */
    public final void mo2266j(View view) {
        this.f5866m.setCustomView(view);
        this.f5868o = view != null ? new WeakReference(view) : null;
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: k */
    public final boolean mo2267k(MenuC1627m menuC1627m, MenuItem menuItem) {
        return ((C0022h) this.f5867n.f62k).m83n(this, menuItem);
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: l */
    public final void mo2268l(int i) {
        mo2269m(this.f5865l.getString(i));
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: m */
    public final void mo2269m(CharSequence charSequence) {
        this.f5866m.setSubtitle(charSequence);
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: n */
    public final void mo2270n(int i) {
        mo2271o(this.f5865l.getString(i));
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: o */
    public final void mo2271o(CharSequence charSequence) {
        this.f5866m.setTitle(charSequence);
    }

    @Override // p087k.AbstractC1536a
    /* renamed from: p */
    public final void mo2272p(boolean z7) {
        this.f5858k = z7;
        this.f5866m.setTitleOptional(z7);
    }
}
