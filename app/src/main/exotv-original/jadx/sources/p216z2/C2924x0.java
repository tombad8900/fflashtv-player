package p216z2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p105m0.C1794b;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.x0 */
/* loaded from: classes.dex */
public final class C2924x0 extends C1794b {

    /* renamed from: d */
    public final RecyclerView f10873d;

    /* renamed from: e */
    public final C2922w0 f10874e;

    public C2924x0(RecyclerView recyclerView) {
        this.f10873d = recyclerView;
        C2922w0 c2922w0 = this.f10874e;
        if (c2922w0 != null) {
            this.f10874e = c2922w0;
        } else {
            this.f10874e = new C2922w0(this);
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: c */
    public final void mo1360c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1360c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f10873d.m1164O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1117U(accessibilityEvent);
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: d */
    public final void mo1361d(View view, C1952d c1952d) {
        this.f6850a.onInitializeAccessibilityNodeInfo(view, c1952d.f7258a);
        RecyclerView recyclerView = this.f10873d;
        if (recyclerView.m1164O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC2888f0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f10670b;
        layoutManager.mo1066V(recyclerView2.f2058l, recyclerView2.f2067p0, c1952d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[PHI: r7
      0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p105m0.C1794b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1362g(View view, int i, Bundle bundle) {
        int iM4996G;
        int iM4994E;
        if (super.mo1362g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f10873d;
        if (!recyclerView.m1164O() && recyclerView.getLayoutManager() != null) {
            AbstractC2888f0 layoutManager = recyclerView.getLayoutManager();
            C2900l0 c2900l0 = layoutManager.f10670b.f2058l;
            int iHeight = layoutManager.f10683o;
            int iWidth = layoutManager.f10682n;
            Rect rect = new Rect();
            if (layoutManager.f10670b.getMatrix().isIdentity() && layoutManager.f10670b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iM4996G = layoutManager.f10670b.canScrollVertically(1) ? (iHeight - layoutManager.m4996G()) - layoutManager.m4993D() : 0;
                if (layoutManager.f10670b.canScrollHorizontally(1)) {
                    iM4994E = (iWidth - layoutManager.m4994E()) - layoutManager.m4995F();
                }
                if (iM4996G == 0) {
                }
                layoutManager.f10670b.m1186i0(iM4994E, iM4996G, true);
                return true;
            }
            if (i != 8192) {
                iM4996G = 0;
                iM4994E = 0;
            } else {
                iM4996G = layoutManager.f10670b.canScrollVertically(-1) ? -((iHeight - layoutManager.m4996G()) - layoutManager.m4993D()) : 0;
                iM4994E = layoutManager.f10670b.canScrollHorizontally(-1) ? -((iWidth - layoutManager.m4994E()) - layoutManager.m4995F()) : 0;
            }
            if (iM4996G == 0 || iM4994E != 0) {
                layoutManager.f10670b.m1186i0(iM4994E, iM4996G, true);
                return true;
            }
        }
        return false;
    }
}
