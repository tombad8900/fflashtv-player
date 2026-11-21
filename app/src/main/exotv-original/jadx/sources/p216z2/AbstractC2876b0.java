package p216z2;

import android.util.Log;
import android.view.View;
import androidx.media3.common.C0228p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p072i2.C1250j;
import p184v1.C2528c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC2876b0 {

    /* renamed from: a */
    public C2921w f10616a;

    /* renamed from: b */
    public ArrayList f10617b;

    /* renamed from: c */
    public long f10618c;

    /* renamed from: d */
    public long f10619d;

    /* renamed from: e */
    public long f10620e;

    /* renamed from: f */
    public long f10621f;

    /* renamed from: b */
    public static void m4971b(AbstractC2920v0 abstractC2920v0) {
        RecyclerView recyclerView;
        int i = abstractC2920v0.f10857j;
        if (abstractC2920v0.m5066f() || (i & 4) != 0 || (recyclerView = abstractC2920v0.f10865r) == null) {
            return;
        }
        recyclerView.m1160I(abstractC2920v0);
    }

    /* renamed from: a */
    public abstract boolean mo4972a(AbstractC2920v0 abstractC2920v0, AbstractC2920v0 abstractC2920v02, C0228p c0228p, C0228p c0228p2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4973c(AbstractC2920v0 abstractC2920v0) {
        C2921w c2921w = this.f10616a;
        if (c2921w != null) {
            RecyclerView recyclerView = c2921w.f10867a;
            boolean z7 = true;
            abstractC2920v0.m5074n(true);
            View view = abstractC2920v0.f10848a;
            if (abstractC2920v0.f10855h != null && abstractC2920v0.f10856i == null) {
                abstractC2920v0.f10855h = null;
            }
            abstractC2920v0.f10856i = null;
            if ((abstractC2920v0.f10857j & 16) != 0) {
                return;
            }
            C2900l0 c2900l0 = recyclerView.f2058l;
            recyclerView.m1188j0();
            C1250j c1250j = recyclerView.f2064o;
            C2528c c2528c = (C2528c) c1250j.f5231m;
            C2921w c2921w2 = (C2921w) c1250j.f5230l;
            int i = c1250j.f5229k;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c1250j.f5229k = 2;
                    int iIndexOfChild = c2921w2.f10867a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c1250j.m2733l(view);
                    } else if (c2528c.m4546m(iIndexOfChild)) {
                        c2528c.m4548o(iIndexOfChild);
                        c1250j.m2733l(view);
                        c2921w2.m5084h(iIndexOfChild);
                    }
                    if (z7) {
                        AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
                        c2900l0.m5041m(abstractC2920v0M1144M);
                        c2900l0.m5038j(abstractC2920v0M1144M);
                        if (RecyclerView.f2005J0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m1190k0(!z7);
                    if (z7 && abstractC2920v0.m5070j()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c1250j.f5229k = 0;
                }
            }
            if (((View) c1250j.f5233o) != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z7 = false;
            if (z7) {
            }
            recyclerView.m1190k0(!z7);
            if (z7) {
            }
        }
    }

    /* renamed from: d */
    public abstract void mo4974d(AbstractC2920v0 abstractC2920v0);

    /* renamed from: e */
    public abstract void mo4975e();

    /* renamed from: f */
    public abstract boolean mo4976f();
}
