package p083j4;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import p005a4.InterfaceC0080f0;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j4.a */
/* loaded from: classes.dex */
public final class C1497a implements InterfaceC0080f0 {

    /* renamed from: j */
    public final AnimatedImageDrawable f5762j;

    public C1497a(AnimatedImageDrawable animatedImageDrawable) {
        this.f5762j = animatedImageDrawable;
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: b */
    public final void mo305b() {
        this.f5762j.stop();
        this.f5762j.clearAnimationCallbacks();
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: c */
    public final int mo306c() {
        return AbstractC2478m.m4456d(Bitmap.Config.ARGB_8888) * this.f5762j.getIntrinsicHeight() * this.f5762j.getIntrinsicWidth() * 2;
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: d */
    public final Class mo307d() {
        return Drawable.class;
    }

    @Override // p005a4.InterfaceC0080f0
    public final Object get() {
        return this.f5762j;
    }
}
