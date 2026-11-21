package p059g5;

import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.AbstractC0715d;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p085j6.RunnableC1527q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g5.c */
/* loaded from: classes.dex */
public final class C1051c extends AbstractC0715d {

    /* renamed from: n */
    public int f4466n;

    /* renamed from: o */
    public int f4467o = -1;

    /* renamed from: p */
    public final /* synthetic */ SwipeDismissBehavior f4468p;

    public C1051c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4468p = swipeDismissBehavior;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: I */
    public final int mo1580I(View view) {
        return view.getWidth();
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: W */
    public final void mo1584W(View view, int i) {
        this.f4467o = i;
        this.f4466n = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4468p;
            swipeDismissBehavior.f3085c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f3085c = false;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: X */
    public final void mo1585X(int i) {
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: Y */
    public final void mo1586Y(View view, int i, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4468p;
        float f8 = width * swipeDismissBehavior.f3087e;
        float width2 = view.getWidth() * swipeDismissBehavior.f3088f;
        float fAbs = Math.abs(i - this.f4466n);
        if (fAbs <= f8) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f8) / (width2 - f8))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1587Z(View view, float f8, float f9) {
        int i;
        this.f4467o = -1;
        int width = view.getWidth();
        boolean z7 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f4468p;
        if (f8 != 0.0f) {
            boolean z8 = view.getLayoutDirection() == 1;
            int i4 = swipeDismissBehavior.f3086d;
            if (i4 != 2 && (i4 != 0 ? i4 != 1 || (!z8 ? f8 < 0.0f : f8 > 0.0f) : !z8 ? f8 > 0.0f : f8 < 0.0f)) {
                i = this.f4466n;
            } else if (f8 >= 0.0f) {
                int left = view.getLeft();
                int i8 = this.f4466n;
                i = left < i8 ? this.f4466n - width : i8 + width;
                z7 = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f4466n) >= Math.round(view.getWidth() * 0.5f)) {
            }
        }
        if (swipeDismissBehavior.f3083a.m4236n(i, view.getTop())) {
            view.postOnAnimation(new RunnableC1527q(swipeDismissBehavior, view, z7));
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: n */
    public final int mo1600n(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z7 = view.getLayoutDirection() == 1;
        int i4 = this.f4468p.f3086d;
        if (i4 == 0) {
            if (z7) {
                width = this.f4466n - view.getWidth();
                width2 = this.f4466n;
            } else {
                width = this.f4466n;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i4 != 1) {
            width = this.f4466n - view.getWidth();
            width2 = view.getWidth() + this.f4466n;
        } else if (z7) {
            width = this.f4466n;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4466n - view.getWidth();
            width2 = this.f4466n;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: o */
    public final int mo1602o(View view, int i) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: q0 */
    public final boolean mo1603q0(View view, int i) {
        int i4 = this.f4467o;
        return (i4 == -1 || i4 == i) && this.f4468p.mo1775r(view);
    }
}
