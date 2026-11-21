package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p199x.C2718e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: j */
    public boolean f800j;

    public Guideline(Context context) {
        super(context);
        this.f800j = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z7) {
        this.f800j = z7;
    }

    public void setGuidelineBegin(int i) {
        C2718e c2718e = (C2718e) getLayoutParams();
        if (this.f800j && c2718e.f9913a == i) {
            return;
        }
        c2718e.f9913a = i;
        setLayoutParams(c2718e);
    }

    public void setGuidelineEnd(int i) {
        C2718e c2718e = (C2718e) getLayoutParams();
        if (this.f800j && c2718e.f9915b == i) {
            return;
        }
        c2718e.f9915b = i;
        setLayoutParams(c2718e);
    }

    public void setGuidelinePercent(float f8) {
        C2718e c2718e = (C2718e) getLayoutParams();
        if (this.f800j && c2718e.f9917c == f8) {
            return;
        }
        c2718e.f9917c = f8;
        setLayoutParams(c2718e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f800j = true;
        super.setVisibility(8);
    }
}
