package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.exotv.net.R;
import p034d5.AbstractC0847a;
import p211y5.C2823j;
import p211y5.C2824k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.timepicker.h */
/* loaded from: classes.dex */
public abstract class AbstractC0777h extends ConstraintLayout {

    /* renamed from: A */
    public int f3526A;

    /* renamed from: B */
    public final C2823j f3527B;

    /* renamed from: z */
    public final RunnableC0776g f3528z;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public AbstractC0777h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C2823j c2823j = new C2823j();
        this.f3527B = c2823j;
        c2823j.setShapeAppearanceModel(c2823j.f10492k.f10459a.mo4921c(new C2824k(0.5f)));
        this.f3527B.m4945q(ColorStateList.valueOf(-1));
        setBackground(this.f3527B);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3763y, R.attr.materialClockStyle, 0);
        this.f3526A = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3528z = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f3525j.mo1923m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0776g runnableC0776g = this.f3528z;
            handler.removeCallbacks(runnableC0776g);
            handler.post(runnableC0776g);
        }
    }

    /* renamed from: m */
    public abstract void mo1923m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1923m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0776g runnableC0776g = this.f3528z;
            handler.removeCallbacks(runnableC0776g);
            handler.post(runnableC0776g);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f3527B.m4945q(ColorStateList.valueOf(i));
    }
}
