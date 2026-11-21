package p169t3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0128d;
import androidx.lifecycle.InterfaceC0164v;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t3.a */
/* loaded from: classes.dex */
public final class C2433a implements InterfaceC0128d {

    /* renamed from: j */
    public boolean f8785j;

    /* renamed from: k */
    public final ImageView f8786k;

    public C2433a(ImageView imageView) {
        this.f8786k = imageView;
    }

    /* renamed from: a */
    public final void m4327a() {
        Object drawable = this.f8786k.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f8785j) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* renamed from: d */
    public final void m4328d(Drawable drawable) {
        ImageView imageView = this.f8786k;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        m4327a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2433a) {
            return AbstractC2980h.m5132a(this.f8786k, ((C2433a) obj).f8786k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8786k.hashCode();
    }

    @Override // androidx.lifecycle.InterfaceC0128d
    public final void onStart(InterfaceC0164v interfaceC0164v) {
        this.f8785j = true;
        m4327a();
    }

    @Override // androidx.lifecycle.InterfaceC0128d
    public final void onStop(InterfaceC0164v interfaceC0164v) {
        this.f8785j = false;
        m4327a();
    }
}
