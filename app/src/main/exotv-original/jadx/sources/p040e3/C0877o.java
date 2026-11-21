package p040e3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.o */
/* loaded from: classes.dex */
public final class C0877o extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f3872a;

    public C0877o(Drawable.ConstantState constantState) {
        this.f3872a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3872a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3872a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0878p c0878p = new C0878p();
        c0878p.f3818j = (VectorDrawable) this.f3872a.newDrawable();
        return c0878p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0878p c0878p = new C0878p();
        c0878p.f3818j = (VectorDrawable) this.f3872a.newDrawable(resources);
        return c0878p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0878p c0878p = new C0878p();
        c0878p.f3818j = (VectorDrawable) this.f3872a.newDrawable(resources, theme);
        return c0878p;
    }
}
