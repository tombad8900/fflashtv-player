package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.exotv.net.R;
import p042e5.AbstractC0910a;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: j */
    public TextView f3400j;

    /* renamed from: k */
    public Button f3401k;

    /* renamed from: l */
    public Button f3402l;

    /* renamed from: m */
    public int f3403m;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2436a.m4343r(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3957b);
    }

    /* renamed from: a */
    public final boolean m1890a(int i, int i4, int i8) {
        boolean z7;
        if (i != getOrientation()) {
            setOrientation(i);
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f3400j.getPaddingTop() == i4 && this.f3400j.getPaddingBottom() == i8) {
            return z7;
        }
        TextView textView = this.f3400j;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i8);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i8);
        return true;
    }

    public Button getActionView() {
        return this.f3401k;
    }

    public Button getCloseView() {
        return this.f3402l;
    }

    public TextView getMessageView() {
        return this.f3400j;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3400j = (TextView) findViewById(R.id.snackbar_text);
        this.f3401k = (Button) findViewById(R.id.snackbar_action);
        this.f3402l = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) throws Resources.NotFoundException {
        super.onMeasure(i, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f3400j.getLayout();
        boolean z7 = layout != null && layout.getLineCount() > 1;
        if (!z7 || this.f3403m <= 0 || this.f3401k.getMeasuredWidth() <= this.f3403m) {
            if (!z7) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m1890a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m1890a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i4);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f3403m = i;
    }
}
