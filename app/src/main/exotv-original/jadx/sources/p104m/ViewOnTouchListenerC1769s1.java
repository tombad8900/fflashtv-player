package p104m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.s1 */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1769s1 implements View.OnTouchListener {

    /* renamed from: j */
    public final /* synthetic */ C1772t1 f6746j;

    public ViewOnTouchListenerC1769s1(C1772t1 c1772t1) {
        this.f6746j = c1772t1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1772t1 c1772t1 = this.f6746j;
        RunnableC1758p1 runnableC1758p1 = c1772t1.f6752A;
        Handler handler = c1772t1.f6756E;
        C1697a0 c1697a0 = c1772t1.f6760I;
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        if (action == 0 && c1697a0 != null && c1697a0.isShowing() && x6 >= 0 && x6 < c1697a0.getWidth() && y4 >= 0 && y4 < c1697a0.getHeight()) {
            handler.postDelayed(runnableC1758p1, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC1758p1);
        return false;
    }
}
