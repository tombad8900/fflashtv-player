package p125o5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o5.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2048a implements View.OnTouchListener {

    /* renamed from: j */
    public final Dialog f7565j;

    /* renamed from: k */
    public final int f7566k;

    /* renamed from: l */
    public final int f7567l;

    /* renamed from: m */
    public final int f7568m;

    public ViewOnTouchListenerC2048a(Dialog dialog, Rect rect) {
        this.f7565j = dialog;
        this.f7566k = rect.left;
        this.f7567l = rect.top;
        this.f7568m = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f7566k;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f7567l, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f7568m;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f7565j.onTouchEvent(motionEventObtain);
    }
}
