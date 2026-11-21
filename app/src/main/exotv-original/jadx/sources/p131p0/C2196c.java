package p131p0;

import android.graphics.RectF;
import androidx.lifecycle.AbstractC0150o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p037e0.C0851b;
import p105m0.C1796b1;
import p105m0.C1844r1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p0.c */
/* loaded from: classes.dex */
public final class C2196c extends AbstractC0150o {

    /* renamed from: k */
    public final HashMap f7666k = new HashMap();

    /* renamed from: l */
    public final /* synthetic */ C2197d f7667l;

    public C2196c(C2197d c2197d) {
        this.f7667l = c2197d;
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: d */
    public final void mo571d(C1796b1 c1796b1) {
        ArrayList arrayList = this.f7667l.f7669b;
        if ((c1796b1.f6856a.mo3499d() & 519) != 0) {
            this.f7666k.remove(c1796b1);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2194a c2194a = (C2194a) arrayList.get(size);
                int i = c2194a.f7662c;
                boolean z7 = i > 0;
                int i4 = i - 1;
                c2194a.f7662c = i4;
                if (z7 && i4 == 0) {
                    ArrayList arrayList2 = c2194a.f7660a;
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        throw AbstractC0008a1.m10f(size2, arrayList2);
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: e */
    public final void mo572e(C1796b1 c1796b1) {
        ArrayList arrayList = this.f7667l.f7669b;
        if ((c1796b1.f6856a.mo3499d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C2194a) arrayList.get(size)).f7662c++;
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: f */
    public final C1844r1 mo573f(C1844r1 c1844r1, List list) {
        ArrayList arrayList = this.f7667l.f7669b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        for (int size = list.size() - 1; size >= 0; size--) {
            C1796b1 c1796b1 = (C1796b1) list.get(size);
            Integer num = (Integer) this.f7666k.get(c1796b1);
            if (num != null) {
                int iIntValue = num.intValue();
                float fMo3496a = c1796b1.f6856a.mo3496a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fMo3496a;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fMo3496a;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fMo3496a;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fMo3496a;
                }
            }
        }
        C0851b.m2021b(c1844r1.f6934a.mo3563f(519), c1844r1.f6934a.mo3563f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList2 = ((C2194a) arrayList.get(size2)).f7660a;
            int size3 = arrayList2.size() - 1;
            if (size3 >= 0) {
                throw AbstractC0008a1.m10f(size3, arrayList2);
            }
        }
        return c1844r1;
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: h */
    public final C0016e mo574h(C1796b1 c1796b1, C0016e c0016e) {
        if ((c1796b1.f6856a.mo3499d() & 519) != 0) {
            C0851b c0851b = (C0851b) c0016e.f63l;
            C0851b c0851b2 = (C0851b) c0016e.f62k;
            int i = c0851b.f3769a != c0851b2.f3769a ? 1 : 0;
            if (c0851b.f3770b != c0851b2.f3770b) {
                i |= 2;
            }
            if (c0851b.f3771c != c0851b2.f3771c) {
                i |= 4;
            }
            if (c0851b.f3772d != c0851b2.f3772d) {
                i |= 8;
            }
            this.f7666k.put(c1796b1, Integer.valueOf(i));
        }
        return c0016e;
    }
}
