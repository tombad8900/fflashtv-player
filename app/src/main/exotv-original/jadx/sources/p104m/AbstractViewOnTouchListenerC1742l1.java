package p104m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p095l.InterfaceC1616d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.l1 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1742l1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: j */
    public final float f6617j;

    /* renamed from: k */
    public final int f6618k;

    /* renamed from: l */
    public final int f6619l;

    /* renamed from: m */
    public final View f6620m;

    /* renamed from: n */
    public RunnableC1738k1 f6621n;

    /* renamed from: o */
    public RunnableC1738k1 f6622o;

    /* renamed from: p */
    public boolean f6623p;

    /* renamed from: q */
    public int f6624q;

    /* renamed from: r */
    public final int[] f6625r = new int[2];

    public AbstractViewOnTouchListenerC1742l1(View view) {
        this.f6620m = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f6617j = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f6618k = tapTimeout;
        this.f6619l = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m3419a() {
        RunnableC1738k1 runnableC1738k1 = this.f6622o;
        View view = this.f6620m;
        if (runnableC1738k1 != null) {
            view.removeCallbacks(runnableC1738k1);
        }
        RunnableC1738k1 runnableC1738k12 = this.f6621n;
        if (runnableC1738k12 != null) {
            view.removeCallbacks(runnableC1738k12);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC1616d0 mo3271b();

    /* renamed from: c */
    public abstract boolean mo3272c();

    /* renamed from: d */
    public boolean mo3273d() {
        InterfaceC1616d0 interfaceC1616d0Mo3271b = mo3271b();
        if (interfaceC1616d0Mo3271b == null || !interfaceC1616d0Mo3271b.mo3274a()) {
            return true;
        }
        interfaceC1616d0Mo3271b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        boolean z7;
        C1730i1 c1730i1Mo3276h;
        boolean z8 = this.f6623p;
        View view2 = this.f6620m;
        if (z8) {
            InterfaceC1616d0 interfaceC1616d0Mo3271b = mo3271b();
            if (interfaceC1616d0Mo3271b == null || !interfaceC1616d0Mo3271b.mo3274a() || (c1730i1Mo3276h = interfaceC1616d0Mo3271b.mo3276h()) == null || !c1730i1Mo3276h.isShown()) {
                z7 = !mo3273d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f6625r;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c1730i1Mo3276h.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM3413b = c1730i1Mo3276h.m3413b(motionEventObtainNoHistory, this.f6624q);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z9 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM3413b || !z9) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f6624q = motionEvent.getPointerId(0);
                if (this.f6621n == null) {
                    this.f6621n = new RunnableC1738k1(this, 0);
                }
                view2.postDelayed(this.f6621n, this.f6618k);
                if (this.f6622o == null) {
                    this.f6622o = new RunnableC1738k1(this, 1);
                }
                view2.postDelayed(this.f6622o, this.f6619l);
            } else if (actionMasked2 == 1) {
                m3419a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f6624q);
                if (iFindPointerIndex >= 0) {
                    float x6 = motionEvent.getX(iFindPointerIndex);
                    float y4 = motionEvent.getY(iFindPointerIndex);
                    float f8 = this.f6617j;
                    float f9 = -f8;
                    if (x6 < f9 || y4 < f9 || x6 >= (view2.getRight() - view2.getLeft()) + f8 || y4 >= (view2.getBottom() - view2.getTop()) + f8) {
                        m3419a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (mo3272c()) {
                            z7 = true;
                        }
                        if (z7) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z7 = false;
            if (z7) {
            }
        } else {
            z7 = false;
            if (z7) {
            }
        }
        this.f6623p = z7;
        return z7 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6623p = false;
        this.f6624q = -1;
        RunnableC1738k1 runnableC1738k1 = this.f6621n;
        if (runnableC1738k1 != null) {
            this.f6620m.removeCallbacks(runnableC1738k1);
        }
    }
}
