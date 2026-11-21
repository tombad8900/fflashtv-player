package p017b6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import p037e0.AbstractC0850a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.z */
/* loaded from: classes.dex */
public final class C0626z extends ArrayAdapter {

    /* renamed from: a */
    public ColorStateList f2503a;

    /* renamed from: b */
    public ColorStateList f2504b;

    /* renamed from: c */
    public final /* synthetic */ C0592a0 f2505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0626z(C0592a0 c0592a0, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f2505c = c0592a0;
        m1417a();
    }

    /* renamed from: a */
    public final void m1417a() {
        ColorStateList colorStateList;
        C0592a0 c0592a0 = this.f2505c;
        ColorStateList colorStateList2 = c0592a0.f2370v;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f2504b = colorStateList;
        if (c0592a0.f2369u != 0 && c0592a0.f2370v != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0850a.m2017b(c0592a0.f2370v.getColorForState(iArr3, 0), c0592a0.f2369u), AbstractC0850a.m2017b(c0592a0.f2370v.getColorForState(iArr2, 0), c0592a0.f2369u), c0592a0.f2369u});
        }
        this.f2503a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0592a0 c0592a0 = this.f2505c;
            ColorDrawable colorDrawable = null;
            if (c0592a0.getText().toString().contentEquals(textView.getText()) && c0592a0.f2369u != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(c0592a0.f2369u);
                if (this.f2504b != null) {
                    colorDrawable2.setTintList(this.f2503a);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f2504b, colorDrawable2, null);
                    FocusRingDrawable focusRingDrawableM1880e = FocusRingDrawable.m1880e(getContext(), rippleDrawable, null);
                    if (focusRingDrawableM1880e != null) {
                        focusRingDrawableM1880e.f3355x.f8128x = c0592a0.f2364p;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
