package p002a1;

import android.animation.ValueAnimator;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bumptech.glide.ComponentCallbacks2C0738m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.ReferenceQueue;
import java.util.WeakHashMap;
import p005a4.C0071b;
import p005a4.C0073c;
import p074i5.C1272d;
import p104m.C1730i1;
import p104m.C1736k;
import p105m0.AbstractC1828m0;
import p140q0.C2241a;
import p140q0.ViewOnTouchListenerC2244d;
import p166t0.C2392f;
import p216z2.C2895j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.f */
/* loaded from: classes.dex */
public final class RunnableC0018f implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f66j;

    /* renamed from: k */
    public final /* synthetic */ Object f67k;

    public /* synthetic */ RunnableC0018f(int i, Object obj) {
        this.f66j = i;
        this.f67k = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        C1736k c1736k;
        int i = this.f66j;
        Object obj = this.f67k;
        switch (i) {
            case 0:
                AnimationAnimationListenerC0020g animationAnimationListenerC0020g = (AnimationAnimationListenerC0020g) obj;
                animationAnimationListenerC0020g.f74b.endViewTransition(animationAnimationListenerC0020g.f75c);
                animationAnimationListenerC0020g.f76d.m91d();
                return;
            case 1:
                DialogInterfaceOnCancelListenerC0040q dialogInterfaceOnCancelListenerC0040q = (DialogInterfaceOnCancelListenerC0040q) obj;
                dialogInterfaceOnCancelListenerC0040q.f156d0.onDismiss(dialogInterfaceOnCancelListenerC0040q.f164l0);
                return;
            case 2:
                ((C0035n0) obj).m159y(true);
                return;
            case 3:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                return;
            case 4:
                C0073c c0073c = (C0073c) obj;
                c0073c.getClass();
                while (true) {
                    try {
                        c0073c.m295r((C0071b) ((ReferenceQueue) c0073c.f325l).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 5:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f3455l.f2453p;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 6:
                ComponentCallbacks2C0738m componentCallbacks2C0738m = (ComponentCallbacks2C0738m) obj;
                componentCallbacks2C0738m.f2874l.mo3256a(componentCallbacks2C0738m);
                return;
            case 7:
                C1272d c1272d = (C1272d) obj;
                c1272d.f5291c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1272d.f5293e;
                C2392f c2392f = bottomSheetBehavior.f3106Q;
                if (c2392f != null && c2392f.m4228f()) {
                    c1272d.m2738a(c1272d.f5290b);
                    return;
                } else {
                    if (bottomSheetBehavior.f3105P == 2) {
                        bottomSheetBehavior.m1783F(c1272d.f5290b);
                        return;
                    }
                    return;
                }
            case 8:
                C1730i1 c1730i1 = (C1730i1) obj;
                c1730i1.f6578u = null;
                c1730i1.drawableStateChanged();
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f734o) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f734o = false;
                    return;
                }
                return;
            case 10:
                ActionMenuView actionMenuView = ((Toolbar) obj).f762j;
                if (actionMenuView == null || (c1736k = actionMenuView.f712C) == null) {
                    return;
                }
                c1736k.m3417l();
                return;
            case 11:
                ViewOnTouchListenerC2244d viewOnTouchListenerC2244d = (ViewOnTouchListenerC2244d) obj;
                C1730i1 c1730i12 = viewOnTouchListenerC2244d.f7783l;
                C2241a c2241a = viewOnTouchListenerC2244d.f7781j;
                if (viewOnTouchListenerC2244d.f7795x) {
                    if (viewOnTouchListenerC2244d.f7793v) {
                        viewOnTouchListenerC2244d.f7793v = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2241a.f7775e = jCurrentAnimationTimeMillis;
                        c2241a.f7777g = -1L;
                        c2241a.f7776f = jCurrentAnimationTimeMillis;
                        c2241a.f7778h = 0.5f;
                    }
                    if ((c2241a.f7777g > 0 && AnimationUtils.currentAnimationTimeMillis() > c2241a.f7777g + c2241a.f7779i) || !viewOnTouchListenerC2244d.m4022e()) {
                        viewOnTouchListenerC2244d.f7795x = false;
                        return;
                    }
                    if (viewOnTouchListenerC2244d.f7794w) {
                        viewOnTouchListenerC2244d.f7794w = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c1730i12.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c2241a.f7776f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM4013a = c2241a.m4013a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c2241a.f7776f;
                    c2241a.f7776f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC2244d.f7797z.scrollListBy((int) (j * ((fM4013a * 4.0f) + ((-4.0f) * fM4013a * fM4013a)) * c2241a.f7774d));
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    c1730i12.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                ((C2392f) obj).m4235m(0);
                return;
            case 13:
                C2895j c2895j = (C2895j) obj;
                ValueAnimator valueAnimator = c2895j.f10737z;
                int i4 = c2895j.f10710A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                c2895j.f10710A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).m1206C0();
                return;
        }
    }
}
