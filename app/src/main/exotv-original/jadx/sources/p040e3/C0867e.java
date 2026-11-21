package p040e3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p100l4.C1674b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.e */
/* loaded from: classes.dex */
public final class C0867e extends Drawable.ConstantState {

    /* renamed from: a */
    public final /* synthetic */ int f3811a;

    /* renamed from: b */
    public final Object f3812b;

    public /* synthetic */ C0867e(int i, Object obj) {
        this.f3811a = i;
        this.f3812b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f3811a) {
            case 0:
                return ((Drawable.ConstantState) this.f3812b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f3811a) {
            case 0:
                return ((Drawable.ConstantState) this.f3812b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f3811a) {
            case 0:
                C0868f c0868f = new C0868f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f3812b).newDrawable();
                c0868f.f3818j = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0868f.f3817o);
                return c0868f;
            default:
                return new C1674b(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f3811a) {
            case 0:
                C0868f c0868f = new C0868f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f3812b).newDrawable(resources);
                c0868f.f3818j = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0868f.f3817o);
                return c0868f;
            default:
                return new C1674b(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f3811a) {
            case 0:
                C0868f c0868f = new C0868f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f3812b).newDrawable(resources, theme);
                c0868f.f3818j = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0868f.f3817o);
                return c0868f;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
