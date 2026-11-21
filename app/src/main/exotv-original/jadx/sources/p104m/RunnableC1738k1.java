package p104m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.k1 */
/* loaded from: classes.dex */
public final class RunnableC1738k1 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f6612j;

    /* renamed from: k */
    public final /* synthetic */ AbstractViewOnTouchListenerC1742l1 f6613k;

    public /* synthetic */ RunnableC1738k1(AbstractViewOnTouchListenerC1742l1 abstractViewOnTouchListenerC1742l1, int i) {
        this.f6612j = i;
        this.f6613k = abstractViewOnTouchListenerC1742l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6612j) {
            case 0:
                ViewParent parent = this.f6613k.f6620m.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC1742l1 abstractViewOnTouchListenerC1742l1 = this.f6613k;
                abstractViewOnTouchListenerC1742l1.m3419a();
                View view = abstractViewOnTouchListenerC1742l1.f6620m;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1742l1.mo3272c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1742l1.f6623p = true;
                    break;
                }
                break;
        }
    }
}
