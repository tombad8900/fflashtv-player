package p166t0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.AbstractC0715d;
import java.util.Arrays;
import java.util.WeakHashMap;
import p002a1.RunnableC0018f;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t0.f */
/* loaded from: classes.dex */
public final class C2392f {

    /* renamed from: w */
    public static final InterpolatorC2390d f8396w = new InterpolatorC2390d(0);

    /* renamed from: a */
    public int f8397a;

    /* renamed from: b */
    public final int f8398b;

    /* renamed from: d */
    public float[] f8400d;

    /* renamed from: e */
    public float[] f8401e;

    /* renamed from: f */
    public float[] f8402f;

    /* renamed from: g */
    public float[] f8403g;

    /* renamed from: h */
    public int[] f8404h;

    /* renamed from: i */
    public int[] f8405i;

    /* renamed from: j */
    public int[] f8406j;

    /* renamed from: k */
    public int f8407k;

    /* renamed from: l */
    public VelocityTracker f8408l;

    /* renamed from: m */
    public final float f8409m;

    /* renamed from: n */
    public final float f8410n;

    /* renamed from: o */
    public final int f8411o;

    /* renamed from: p */
    public final OverScroller f8412p;

    /* renamed from: q */
    public final AbstractC0715d f8413q;

    /* renamed from: r */
    public View f8414r;

    /* renamed from: s */
    public boolean f8415s;

    /* renamed from: t */
    public final CoordinatorLayout f8416t;

    /* renamed from: u */
    public InterpolatorC2390d f8417u;

    /* renamed from: c */
    public int f8399c = -1;

    /* renamed from: v */
    public final RunnableC0018f f8418v = new RunnableC0018f(12, this);

    public C2392f(Context context, CoordinatorLayout coordinatorLayout, AbstractC0715d abstractC0715d) {
        if (abstractC0715d == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.f8416t = coordinatorLayout;
        this.f8413q = abstractC0715d;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8411o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f8398b = viewConfiguration.getScaledTouchSlop();
        this.f8409m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f8410n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8417u = f8396w;
        this.f8412p = new OverScroller(context, new InterpolatorC2391e(this));
    }

    /* renamed from: a */
    public final void m4223a() {
        this.f8399c = -1;
        float[] fArr = this.f8400d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f8401e, 0.0f);
            Arrays.fill(this.f8402f, 0.0f);
            Arrays.fill(this.f8403g, 0.0f);
            Arrays.fill(this.f8404h, 0);
            Arrays.fill(this.f8405i, 0);
            Arrays.fill(this.f8406j, 0);
            this.f8407k = 0;
        }
        VelocityTracker velocityTracker = this.f8408l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8408l = null;
        }
    }

    /* renamed from: b */
    public final void m4224b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f8416t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f8414r = view;
        this.f8399c = i;
        this.f8413q.mo1584W(view, i);
        m4235m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4225c(View view, float f8, float f9) {
        if (view != null) {
            AbstractC0715d abstractC0715d = this.f8413q;
            boolean z7 = abstractC0715d.mo1580I(view) > 0;
            boolean z8 = abstractC0715d.mo1582K() > 0;
            if (z7 && z8) {
                float f10 = (f9 * f9) + (f8 * f8);
                int i = this.f8398b;
                if (f10 > i * i) {
                }
            } else if (!z7 ? !(!z8 || Math.abs(f9) <= this.f8398b) : Math.abs(f8) > this.f8398b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m4226d(int i) {
        float[] fArr = this.f8400d;
        if (fArr != null) {
            int i4 = this.f8407k;
            int i8 = 1 << i;
            if ((i4 & i8) != 0) {
                fArr[i] = 0.0f;
                this.f8401e[i] = 0.0f;
                this.f8402f[i] = 0.0f;
                this.f8403g[i] = 0.0f;
                this.f8404h[i] = 0;
                this.f8405i[i] = 0;
                this.f8406j[i] = 0;
                this.f8407k = (~i8) & i4;
            }
        }
    }

    /* renamed from: e */
    public final int m4227e(int i, int i4, int i8) {
        if (i == 0) {
            return 0;
        }
        float width = this.f8416t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i4);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i8) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: f */
    public final boolean m4228f() {
        if (this.f8397a == 2) {
            OverScroller overScroller = this.f8412p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f8414r.getLeft();
            int top = currY - this.f8414r.getTop();
            if (left != 0) {
                View view = this.f8414r;
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f8414r;
                WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f8413q.mo1586Y(this.f8414r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f8416t.post(this.f8418v);
            }
        }
        return this.f8397a == 2;
    }

    /* renamed from: g */
    public final View m4229g(int i, int i4) {
        CoordinatorLayout coordinatorLayout = this.f8416t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f8413q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final boolean m4230h(int i, int i4, int i8, int i9) {
        float f8;
        float f9;
        float f10;
        float f11;
        int left = this.f8414r.getLeft();
        int top = this.f8414r.getTop();
        int i10 = i - left;
        int i11 = i4 - top;
        OverScroller overScroller = this.f8412p;
        if (i10 == 0 && i11 == 0) {
            overScroller.abortAnimation();
            m4235m(0);
            return false;
        }
        View view = this.f8414r;
        int i12 = (int) this.f8410n;
        int i13 = (int) this.f8409m;
        int iAbs = Math.abs(i8);
        if (iAbs < i12) {
            i8 = 0;
        } else if (iAbs > i13) {
            i8 = i8 > 0 ? i13 : -i13;
        }
        int iAbs2 = Math.abs(i9);
        if (iAbs2 < i12) {
            i9 = 0;
        } else if (iAbs2 > i13) {
            i9 = i9 > 0 ? i13 : -i13;
        }
        int iAbs3 = Math.abs(i10);
        int iAbs4 = Math.abs(i11);
        int iAbs5 = Math.abs(i8);
        int iAbs6 = Math.abs(i9);
        int i14 = iAbs5 + iAbs6;
        int i15 = iAbs3 + iAbs4;
        if (i8 != 0) {
            f8 = iAbs5;
            f9 = i14;
        } else {
            f8 = iAbs3;
            f9 = i15;
        }
        float f12 = f8 / f9;
        if (i9 != 0) {
            f10 = iAbs6;
            f11 = i14;
        } else {
            f10 = iAbs4;
            f11 = i15;
        }
        float f13 = f10 / f11;
        AbstractC0715d abstractC0715d = this.f8413q;
        this.f8417u = f8396w;
        overScroller.startScroll(left, top, i10, i11, (int) ((m4227e(i11, i9, abstractC0715d.mo1582K()) * f13) + (m4227e(i10, i8, abstractC0715d.mo1580I(view)) * f12)));
        m4235m(2);
        return true;
    }

    /* renamed from: i */
    public final void m4231i(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m4223a();
        }
        if (this.f8408l == null) {
            this.f8408l = VelocityTracker.obtain();
        }
        this.f8408l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM4229g = m4229g((int) x6, (int) y4);
            m4233k(x6, y4, pointerId);
            m4238p(viewM4229g, pointerId);
            int i4 = this.f8404h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f8397a == 1) {
                m4232j();
            }
            m4223a();
            return;
        }
        AbstractC0715d abstractC0715d = this.f8413q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f8397a == 1) {
                    this.f8415s = true;
                    abstractC0715d.mo1587Z(this.f8414r, 0.0f, 0.0f);
                    this.f8415s = false;
                    if (this.f8397a == 1) {
                        m4235m(0);
                    }
                }
                m4223a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x7 = motionEvent.getX(actionIndex);
                float y7 = motionEvent.getY(actionIndex);
                m4233k(x7, y7, pointerId2);
                if (this.f8397a == 0) {
                    m4238p(m4229g((int) x7, (int) y7), pointerId2);
                    int i8 = this.f8404h[pointerId2];
                    return;
                }
                int i9 = (int) x7;
                int i10 = (int) y7;
                View view = this.f8414r;
                if (view != null && i9 >= view.getLeft() && i9 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    m4238p(this.f8414r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f8397a == 1 && pointerId3 == this.f8399c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.f8399c) {
                        View viewM4229g2 = m4229g((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.f8414r;
                        if (viewM4229g2 == view2 && m4238p(view2, pointerId4)) {
                            i = this.f8399c;
                            break;
                        }
                    }
                    i++;
                }
                if (i == -1) {
                    m4232j();
                }
            }
            m4226d(pointerId3);
            return;
        }
        if (this.f8397a == 1) {
            int i11 = this.f8399c;
            if (((this.f8407k & (1 << i11)) != 0 ? 1 : 0) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i11)) == -1) {
                return;
            }
            float x8 = motionEvent.getX(iFindPointerIndex);
            float y8 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f8402f;
            int i12 = this.f8399c;
            int i13 = (int) (x8 - fArr[i12]);
            int i14 = (int) (y8 - this.f8403g[i12]);
            int left = this.f8414r.getLeft() + i13;
            int top = this.f8414r.getTop() + i14;
            int left2 = this.f8414r.getLeft();
            int top2 = this.f8414r.getTop();
            if (i13 != 0) {
                left = abstractC0715d.mo1600n(this.f8414r, left);
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                this.f8414r.offsetLeftAndRight(left - left2);
            }
            if (i14 != 0) {
                top = abstractC0715d.mo1602o(this.f8414r, top);
                WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                this.f8414r.offsetTopAndBottom(top - top2);
            }
            if (i13 != 0 || i14 != 0) {
                abstractC0715d.mo1586Y(this.f8414r, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount2; i15++) {
                int pointerId5 = motionEvent.getPointerId(i15);
                if ((this.f8407k & (1 << pointerId5)) != 0) {
                    float x9 = motionEvent.getX(i15);
                    float y9 = motionEvent.getY(i15);
                    float f8 = x9 - this.f8400d[pointerId5];
                    float f9 = y9 - this.f8401e[pointerId5];
                    Math.abs(f8);
                    Math.abs(f9);
                    int i16 = this.f8404h[pointerId5];
                    Math.abs(f9);
                    Math.abs(f8);
                    int i17 = this.f8404h[pointerId5];
                    Math.abs(f8);
                    Math.abs(f9);
                    int i18 = this.f8404h[pointerId5];
                    Math.abs(f9);
                    Math.abs(f8);
                    int i19 = this.f8404h[pointerId5];
                    if (this.f8397a == 1) {
                        break;
                    }
                    View viewM4229g3 = m4229g((int) x9, (int) y9);
                    if (m4225c(viewM4229g3, f8, f9) && m4238p(viewM4229g3, pointerId5)) {
                        break;
                    }
                }
            }
        }
        m4234l(motionEvent);
    }

    /* renamed from: j */
    public final void m4232j() {
        VelocityTracker velocityTracker = this.f8408l;
        float f8 = this.f8409m;
        velocityTracker.computeCurrentVelocity(1000, f8);
        float xVelocity = this.f8408l.getXVelocity(this.f8399c);
        float fAbs = Math.abs(xVelocity);
        float f9 = this.f8410n;
        if (fAbs < f9) {
            xVelocity = 0.0f;
        } else if (fAbs > f8) {
            xVelocity = xVelocity > 0.0f ? f8 : -f8;
        }
        float yVelocity = this.f8408l.getYVelocity(this.f8399c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f9) {
            f8 = 0.0f;
        } else if (fAbs2 <= f8) {
            f8 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f8 = -f8;
        }
        this.f8415s = true;
        this.f8413q.mo1587Z(this.f8414r, xVelocity, f8);
        this.f8415s = false;
        if (this.f8397a == 1) {
            m4235m(0);
        }
    }

    /* renamed from: k */
    public final void m4233k(float f8, float f9, int i) {
        float[] fArr = this.f8400d;
        if (fArr == null || fArr.length <= i) {
            int i4 = i + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f8401e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f8402f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f8403g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f8404h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f8405i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f8406j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f8400d = fArr2;
            this.f8401e = fArr3;
            this.f8402f = fArr4;
            this.f8403g = fArr5;
            this.f8404h = iArr;
            this.f8405i = iArr2;
            this.f8406j = iArr3;
        }
        float[] fArr9 = this.f8400d;
        this.f8402f[i] = f8;
        fArr9[i] = f8;
        float[] fArr10 = this.f8401e;
        this.f8403g[i] = f9;
        fArr10[i] = f9;
        int[] iArr7 = this.f8404h;
        int i8 = (int) f8;
        int i9 = (int) f9;
        CoordinatorLayout coordinatorLayout = this.f8416t;
        int left = coordinatorLayout.getLeft();
        int i10 = this.f8411o;
        int i11 = i8 < left + i10 ? 1 : 0;
        if (i9 < coordinatorLayout.getTop() + i10) {
            i11 |= 4;
        }
        if (i8 > coordinatorLayout.getRight() - i10) {
            i11 |= 2;
        }
        if (i9 > coordinatorLayout.getBottom() - i10) {
            i11 |= 8;
        }
        iArr7[i] = i11;
        this.f8407k |= 1 << i;
    }

    /* renamed from: l */
    public final void m4234l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f8407k & (1 << pointerId)) != 0) {
                float x6 = motionEvent.getX(i);
                float y4 = motionEvent.getY(i);
                this.f8402f[pointerId] = x6;
                this.f8403g[pointerId] = y4;
            }
        }
    }

    /* renamed from: m */
    public final void m4235m(int i) {
        this.f8416t.removeCallbacks(this.f8418v);
        if (this.f8397a != i) {
            this.f8397a = i;
            this.f8413q.mo1585X(i);
            if (this.f8397a == 0) {
                this.f8414r = null;
            }
        }
    }

    /* renamed from: n */
    public final boolean m4236n(int i, int i4) {
        if (this.f8415s) {
            return m4230h(i, i4, (int) this.f8408l.getXVelocity(this.f8399c), (int) this.f8408l.getYVelocity(this.f8399c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4237o(MotionEvent motionEvent) {
        View viewM4229g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m4223a();
        }
        if (this.f8408l == null) {
            this.f8408l = VelocityTracker.obtain();
        }
        this.f8408l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m4233k(x6, y4, pointerId);
            View viewM4229g2 = m4229g((int) x6, (int) y4);
            if (viewM4229g2 == this.f8414r && this.f8397a == 2) {
                m4238p(viewM4229g2, pointerId);
            }
            int i = this.f8404h[pointerId];
        } else if (actionMasked == 1) {
            m4223a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x7 = motionEvent.getX(actionIndex);
                    float y7 = motionEvent.getY(actionIndex);
                    m4233k(x7, y7, pointerId2);
                    int i4 = this.f8397a;
                    if (i4 == 0) {
                        int i8 = this.f8404h[pointerId2];
                    } else if (i4 == 2 && (viewM4229g = m4229g((int) x7, (int) y7)) == this.f8414r) {
                        m4238p(viewM4229g, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    m4226d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f8400d != null && this.f8401e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i9 = 0; i9 < pointerCount; i9++) {
                int pointerId3 = motionEvent.getPointerId(i9);
                if ((this.f8407k & (1 << pointerId3)) != 0) {
                    float x8 = motionEvent.getX(i9);
                    float y8 = motionEvent.getY(i9);
                    float f8 = x8 - this.f8400d[pointerId3];
                    float f9 = y8 - this.f8401e[pointerId3];
                    View viewM4229g3 = m4229g((int) x8, (int) y8);
                    boolean zM4225c = m4225c(viewM4229g3, f8, f9);
                    if (zM4225c) {
                        int left = viewM4229g3.getLeft();
                        AbstractC0715d abstractC0715d = this.f8413q;
                        int iMo1600n = abstractC0715d.mo1600n(viewM4229g3, ((int) f8) + left);
                        int top = viewM4229g3.getTop();
                        int iMo1602o = abstractC0715d.mo1602o(viewM4229g3, ((int) f9) + top);
                        int iMo1580I = abstractC0715d.mo1580I(viewM4229g3);
                        int iMo1582K = abstractC0715d.mo1582K();
                        if ((iMo1580I == 0 || (iMo1580I > 0 && iMo1600n == left)) && (iMo1582K == 0 || (iMo1582K > 0 && iMo1602o == top))) {
                            break;
                        }
                        Math.abs(f8);
                        Math.abs(f9);
                        int i10 = this.f8404h[pointerId3];
                        Math.abs(f9);
                        Math.abs(f8);
                        int i11 = this.f8404h[pointerId3];
                        Math.abs(f8);
                        Math.abs(f9);
                        int i12 = this.f8404h[pointerId3];
                        Math.abs(f9);
                        Math.abs(f8);
                        int i13 = this.f8404h[pointerId3];
                        if (this.f8397a == 1 || (zM4225c && m4238p(viewM4229g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m4234l(motionEvent);
        }
        return this.f8397a == 1;
    }

    /* renamed from: p */
    public final boolean m4238p(View view, int i) {
        if (view == this.f8414r && this.f8399c == i) {
            return true;
        }
        if (view == null || !this.f8413q.mo1603q0(view, i)) {
            return false;
        }
        this.f8399c = i;
        m4224b(view, i);
        return true;
    }
}
