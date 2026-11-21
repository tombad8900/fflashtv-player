package p040e3;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.c */
/* loaded from: classes.dex */
public final class C0865c implements Drawable.Callback {

    /* renamed from: j */
    public final /* synthetic */ C0868f f3806j;

    public C0865c(C0868f c0868f) {
        this.f3806j = c0868f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3806j.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f3806j.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3806j.unscheduleSelf(runnable);
    }
}
