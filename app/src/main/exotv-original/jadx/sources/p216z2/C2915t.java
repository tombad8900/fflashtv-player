package p216z2;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.t */
/* loaded from: classes.dex */
public final class C2915t extends C2911r {

    /* renamed from: q */
    public final /* synthetic */ int f10834q;

    /* renamed from: r */
    public final /* synthetic */ AbstractC2928z0 f10835r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2915t(AbstractC2928z0 abstractC2928z0, Context context, int i) {
        super(context);
        this.f10834q = i;
        this.f10835r = abstractC2928z0;
    }

    @Override // p216z2.C2911r
    /* renamed from: d */
    public final float mo1876d(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f10834q) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // p216z2.C2911r
    /* renamed from: e */
    public int mo5047e(int i) {
        switch (this.f10834q) {
            case 0:
                return Math.min(100, super.mo5047e(i));
            default:
                return super.mo5047e(i);
        }
    }

    @Override // p216z2.C2911r
    /* renamed from: h */
    public final void mo5049h(View view, C2908p0 c2908p0) {
        switch (this.f10834q) {
            case 0:
                C2917u c2917u = (C2917u) this.f10835r;
                int[] iArrMo1438b = c2917u.mo1438b(c2917u.f10877a.getLayoutManager(), view);
                int i = iArrMo1438b[0];
                int i4 = iArrMo1438b[1];
                int iCeil = (int) Math.ceil(mo5047e(Math.max(Math.abs(i), Math.abs(i4))) / 0.3356d);
                if (iCeil > 0) {
                    c2908p0.f10793a = i;
                    c2908p0.f10794b = i4;
                    c2908p0.f10795c = iCeil;
                    c2908p0.f10797e = this.f10812j;
                    c2908p0.f10798f = true;
                    break;
                }
                break;
            default:
                AbstractC2928z0 abstractC2928z0 = this.f10835r;
                RecyclerView recyclerView = abstractC2928z0.f10877a;
                if (recyclerView != null) {
                    int[] iArrMo1438b2 = abstractC2928z0.mo1438b(recyclerView.getLayoutManager(), view);
                    int i8 = iArrMo1438b2[0];
                    int i9 = iArrMo1438b2[1];
                    int iCeil2 = (int) Math.ceil(mo5047e(Math.max(Math.abs(i8), Math.abs(i9))) / 0.3356d);
                    if (iCeil2 > 0) {
                        c2908p0.f10793a = i8;
                        c2908p0.f10794b = i9;
                        c2908p0.f10795c = iCeil2;
                        c2908p0.f10797e = this.f10812j;
                        c2908p0.f10798f = true;
                        break;
                    }
                }
                break;
        }
    }
}
