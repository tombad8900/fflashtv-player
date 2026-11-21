package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.timepicker.m */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0782m implements View.OnTouchListener {

    /* renamed from: j */
    public final /* synthetic */ GestureDetector f3532j;

    public ViewOnTouchListenerC0782m(GestureDetector gestureDetector) {
        this.f3532j = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f3532j.onTouchEvent(motionEvent);
        }
        return false;
    }
}
