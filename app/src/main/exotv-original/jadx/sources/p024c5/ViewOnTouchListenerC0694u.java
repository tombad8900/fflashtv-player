package p024c5;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.u */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0694u implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            view.setPressed(true);
            view.requestFocus();
        } else if (actionMasked == 1) {
            view.setPressed(false);
            view.performClick();
        } else if (actionMasked == 3) {
            view.setPressed(false);
        }
        return true;
    }
}
