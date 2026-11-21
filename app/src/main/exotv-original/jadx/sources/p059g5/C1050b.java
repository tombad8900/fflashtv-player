package p059g5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bumptech.glide.AbstractC0715d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g5.b */
/* loaded from: classes.dex */
public final class C1050b extends AbstractC0715d {

    /* renamed from: n */
    public final /* synthetic */ int f4465n;

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: F */
    public final int mo1577F(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.f4465n) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: H */
    public final int mo1579H() {
        switch (this.f4465n) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: J */
    public final ViewPropertyAnimator mo1581J(View view, int i) {
        switch (this.f4465n) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
