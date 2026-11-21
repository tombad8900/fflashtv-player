package p024c5;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p216z2.AbstractC2888f0;
import p216z2.AbstractC2894i0;
import p216z2.C2895j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.f0 */
/* loaded from: classes.dex */
public final class C0662f0 extends AbstractC2894i0 {

    /* renamed from: a */
    public final /* synthetic */ int f2596a;

    /* renamed from: b */
    public final /* synthetic */ Object f2597b;

    public /* synthetic */ C0662f0(int i, Object obj) {
        this.f2596a = i;
        this.f2597b = obj;
    }

    @Override // p216z2.AbstractC2894i0
    /* renamed from: a */
    public void mo1432a(RecyclerView recyclerView, int i) {
        View viewMo1439d;
        ViewGroup viewGroupM1437h;
        switch (this.f2596a) {
            case 0:
                if (i == 0) {
                    ((C0665g0) this.f2597b).m1435n0();
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    C0668h0 c0668h0 = (C0668h0) this.f2597b;
                    AbstractC2888f0 layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null && (viewMo1439d = c0668h0.mo1439d(layoutManager)) != null && (viewGroupM1437h = C0668h0.m1437h(layoutManager)) != null) {
                        c0668h0.f2623e = C0668h0.m1436g(layoutManager, viewMo1439d, viewGroupM1437h);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p216z2.AbstractC2894i0
    /* renamed from: b */
    public void mo1433b(RecyclerView recyclerView, int i, int i4) {
        switch (this.f2596a) {
            case 0:
                ((C0665g0) this.f2597b).m1435n0();
                break;
            case 2:
                C2895j c2895j = (C2895j) this.f2597b;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i8 = c2895j.f10712a;
                int iComputeVerticalScrollRange = c2895j.f10730s.computeVerticalScrollRange();
                int i9 = c2895j.f10729r;
                c2895j.f10731t = iComputeVerticalScrollRange - i9 > 0 && i9 >= i8;
                int iComputeHorizontalScrollRange = c2895j.f10730s.computeHorizontalScrollRange();
                int i10 = c2895j.f10728q;
                boolean z7 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= i8;
                c2895j.f10732u = z7;
                boolean z8 = c2895j.f10731t;
                if (!z8 && !z7) {
                    if (c2895j.f10733v != 0) {
                        c2895j.m5023g(0);
                        break;
                    }
                } else {
                    if (z8) {
                        float f8 = i9;
                        c2895j.f10723l = (int) ((((f8 / 2.0f) + iComputeVerticalScrollOffset) * f8) / iComputeVerticalScrollRange);
                        c2895j.f10722k = Math.min(i9, (i9 * i9) / iComputeVerticalScrollRange);
                    }
                    if (c2895j.f10732u) {
                        float f9 = iComputeHorizontalScrollOffset;
                        float f10 = i10;
                        c2895j.f10726o = (int) ((((f10 / 2.0f) + f9) * f10) / iComputeHorizontalScrollRange);
                        c2895j.f10725n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
                    }
                    int i11 = c2895j.f10733v;
                    if (i11 == 0 || i11 == 1) {
                        c2895j.m5023g(1);
                        break;
                    }
                }
                break;
        }
    }
}
