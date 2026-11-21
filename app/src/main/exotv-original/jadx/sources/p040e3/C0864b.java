package p040e3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p101l5.C1681a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.b */
/* loaded from: classes.dex */
public final class C0864b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C1681a f3805a;

    public C0864b(C1681a c1681a) {
        this.f3805a = c1681a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3805a.f6459b.f6482x;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f3805a.m3380a(drawable);
    }
}
