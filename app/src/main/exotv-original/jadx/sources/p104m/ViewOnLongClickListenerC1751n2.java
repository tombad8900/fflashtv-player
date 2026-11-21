package p104m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.exotv.net.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p046f0.AbstractC0928a;
import p105m0.AbstractC1828m0;
import p105m0.AbstractC1831n0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.n2 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC1751n2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: t */
    public static ViewOnLongClickListenerC1751n2 f6673t;

    /* renamed from: u */
    public static ViewOnLongClickListenerC1751n2 f6674u;

    /* renamed from: j */
    public final View f6675j;

    /* renamed from: k */
    public final CharSequence f6676k;

    /* renamed from: l */
    public final int f6677l;

    /* renamed from: m */
    public final RunnableC1747m2 f6678m;

    /* renamed from: n */
    public final RunnableC1747m2 f6679n;

    /* renamed from: o */
    public int f6680o;

    /* renamed from: p */
    public int f6681p;

    /* renamed from: q */
    public C1755o2 f6682q;

    /* renamed from: r */
    public boolean f6683r;

    /* renamed from: s */
    public boolean f6684s;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.m2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.m2] */
    public ViewOnLongClickListenerC1751n2(View view, CharSequence charSequence) {
        final int i = 0;
        this.f6678m = new Runnable(this) { // from class: m.m2

            /* renamed from: k */
            public final /* synthetic */ ViewOnLongClickListenerC1751n2 f6648k;

            {
                this.f6648k = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        this.f6648k.m3429c(false);
                        break;
                    default:
                        this.f6648k.m3428a();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f6679n = new Runnable(this) { // from class: m.m2

            /* renamed from: k */
            public final /* synthetic */ ViewOnLongClickListenerC1751n2 f6648k;

            {
                this.f6648k = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i4) {
                    case 0:
                        this.f6648k.m3429c(false);
                        break;
                    default:
                        this.f6648k.m3428a();
                        break;
                }
            }
        };
        this.f6675j = view;
        this.f6676k = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC1831n0.f6917a;
        this.f6677l = Build.VERSION.SDK_INT >= 28 ? AbstractC0928a.m2093h(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f6684s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m3427b(ViewOnLongClickListenerC1751n2 viewOnLongClickListenerC1751n2) {
        ViewOnLongClickListenerC1751n2 viewOnLongClickListenerC1751n22 = f6673t;
        if (viewOnLongClickListenerC1751n22 != null) {
            viewOnLongClickListenerC1751n22.f6675j.removeCallbacks(viewOnLongClickListenerC1751n22.f6678m);
        }
        f6673t = viewOnLongClickListenerC1751n2;
        if (viewOnLongClickListenerC1751n2 != null) {
            viewOnLongClickListenerC1751n2.f6675j.postDelayed(viewOnLongClickListenerC1751n2.f6678m, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m3428a() {
        ViewOnLongClickListenerC1751n2 viewOnLongClickListenerC1751n2 = f6674u;
        View view = this.f6675j;
        if (viewOnLongClickListenerC1751n2 == this) {
            f6674u = null;
            C1755o2 c1755o2 = this.f6682q;
            if (c1755o2 != null) {
                View view2 = (View) c1755o2.f6695b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1755o2.f6694a).getSystemService("window")).removeView(view2);
                }
                this.f6682q = null;
                this.f6684s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f6673t == this) {
            m3427b(null);
        }
        view.removeCallbacks(this.f6679n);
    }

    /* renamed from: c */
    public final void m3429c(boolean z7) throws Resources.NotFoundException {
        int height;
        int i;
        int i4;
        boolean z8;
        int i8;
        int i9;
        long longPressTimeout;
        long j;
        long j8;
        View view = this.f6675j;
        if (view.isAttachedToWindow()) {
            m3427b(null);
            ViewOnLongClickListenerC1751n2 viewOnLongClickListenerC1751n2 = f6674u;
            if (viewOnLongClickListenerC1751n2 != null) {
                viewOnLongClickListenerC1751n2.m3428a();
            }
            f6674u = this;
            this.f6683r = z7;
            C1755o2 c1755o2 = new C1755o2(view.getContext());
            View view2 = (View) c1755o2.f6695b;
            Context context = (Context) c1755o2.f6694a;
            this.f6682q = c1755o2;
            int width = this.f6680o;
            int i10 = this.f6681p;
            boolean z9 = this.f6683r;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c1755o2.f6697d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c1755o2.f6696c).setText(this.f6676k);
            int[] iArr = (int[]) c1755o2.f6700g;
            int[] iArr2 = (int[]) c1755o2.f6699f;
            Rect rect = (Rect) c1755o2.f6698e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i10 + dimensionPixelOffset2;
                i = i10 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z9 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i11 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i9 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = i;
                    z8 = z9;
                    i8 = 0;
                    i9 = 1;
                } else {
                    Resources resources = context.getResources();
                    i9 = 1;
                    i4 = i;
                    z8 = z9;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i8 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i12 = iArr2[i8] - iArr[i8];
                iArr2[i8] = i12;
                iArr2[i9] = iArr2[i9] - iArr[i9];
                layoutParams.x = (i12 + i11) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, i8);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = iArr2[i9];
                int i14 = ((i13 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i13 + height + dimensionPixelOffset3;
                if (z8) {
                    if (i14 >= 0) {
                        layoutParams.y = i14;
                    } else {
                        layoutParams.y = i15;
                    }
                } else if (measuredHeight + i15 <= rect.height()) {
                    layoutParams.y = i15;
                } else {
                    layoutParams.y = i14;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f6683r) {
                j8 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                if ((view.getWindowSystemUiVisibility() & 1) == i9) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j8 = j - longPressTimeout;
            }
            RunnableC1747m2 runnableC1747m2 = this.f6679n;
            view.removeCallbacks(runnableC1747m2);
            view.postDelayed(runnableC1747m2, j8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f6682q == null || !this.f6683r) {
            View view2 = this.f6675j;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f6684s = true;
                        m3428a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f6682q == null) {
                    int x6 = (int) motionEvent.getX();
                    int y4 = (int) motionEvent.getY();
                    if (!this.f6684s) {
                        int iAbs = Math.abs(x6 - this.f6680o);
                        int i = this.f6677l;
                        if (iAbs > i || Math.abs(y4 - this.f6681p) > i) {
                            this.f6680o = x6;
                            this.f6681p = y4;
                            this.f6684s = false;
                            m3427b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f6680o = view.getWidth() / 2;
        this.f6681p = view.getHeight() / 2;
        m3429c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m3428a();
    }
}
