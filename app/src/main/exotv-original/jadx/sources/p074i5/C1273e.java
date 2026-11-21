package p074i5;

import android.view.View;
import androidx.lifecycle.AbstractC0150o;
import java.util.Iterator;
import java.util.List;
import p002a1.C0016e;
import p042e5.AbstractC0910a;
import p105m0.C1796b1;
import p105m0.C1844r1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i5.e */
/* loaded from: classes.dex */
public final class C1273e extends AbstractC0150o {

    /* renamed from: k */
    public final View f5294k;

    /* renamed from: l */
    public int f5295l;

    /* renamed from: m */
    public int f5296m;

    /* renamed from: n */
    public final int[] f5297n = new int[2];

    public C1273e(View view) {
        this.f5294k = view;
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: d */
    public final void mo571d(C1796b1 c1796b1) {
        this.f5294k.setTranslationY(0.0f);
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: e */
    public final void mo572e(C1796b1 c1796b1) {
        View view = this.f5294k;
        int[] iArr = this.f5297n;
        view.getLocationOnScreen(iArr);
        this.f5295l = iArr[1];
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: f */
    public final C1844r1 mo573f(C1844r1 c1844r1, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C1796b1) it.next()).f6856a.mo3499d() & 8) != 0) {
                this.f5294k.setTranslationY(AbstractC0910a.m2079c(r0.f6856a.mo3498c(), this.f5296m, 0));
                break;
            }
        }
        return c1844r1;
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: h */
    public final C0016e mo574h(C1796b1 c1796b1, C0016e c0016e) {
        View view = this.f5294k;
        int[] iArr = this.f5297n;
        view.getLocationOnScreen(iArr);
        int i = this.f5295l - iArr[1];
        this.f5296m = i;
        view.setTranslationY(i);
        return c0016e;
    }
}
