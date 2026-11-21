package p087k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p095l.MenuC1614c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.e */
/* loaded from: classes.dex */
public final class C1540e extends ActionMode {

    /* renamed from: a */
    public final Context f5871a;

    /* renamed from: b */
    public final AbstractC1536a f5872b;

    public C1540e(Context context, AbstractC1536a abstractC1536a) {
        this.f5871a = context;
        this.f5872b = abstractC1536a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f5872b.mo2257a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f5872b.mo2258b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1614c0(this.f5871a, this.f5872b.mo2259c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f5872b.mo2260d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f5872b.mo2261e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f5872b.f5857j;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f5872b.mo2262f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f5872b.f5858k;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f5872b.mo2263g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f5872b.mo2265i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f5872b.mo2266j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f5872b.mo2269m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f5872b.f5857j = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f5872b.mo2271o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z7) {
        this.f5872b.mo2272p(z7);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f5872b.mo2268l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f5872b.mo2270n(i);
    }
}
