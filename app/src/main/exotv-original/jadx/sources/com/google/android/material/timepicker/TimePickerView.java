package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.exotv.net.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: A */
    public static final /* synthetic */ int f3519A = 0;

    /* renamed from: z */
    public final Chip f3520z;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0780k viewOnClickListenerC0780k = new ViewOnClickListenerC0780k(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f3195v.add(new C0778i());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f3520z = chip2;
        clockFaceView.f3504R = new C0779j(this);
        ViewOnTouchListenerC0782m viewOnTouchListenerC0782m = new ViewOnTouchListenerC0782m(new GestureDetector(getContext(), new C0781l(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0782m);
        chip2.setOnTouchListener(viewOnTouchListenerC0782m);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0780k);
        chip2.setOnClickListener(viewOnClickListenerC0780k);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f3520z.sendAccessibilityEvent(8);
        }
    }
}
