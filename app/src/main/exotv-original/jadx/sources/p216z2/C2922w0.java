package p216z2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p095l.C1629o;
import p105m0.C1794b;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.w0 */
/* loaded from: classes.dex */
public final class C2922w0 extends C1794b {

    /* renamed from: d */
    public final C2924x0 f10868d;

    /* renamed from: e */
    public final WeakHashMap f10869e = new WeakHashMap();

    public C2922w0(C2924x0 c2924x0) {
        this.f10868d = c2924x0;
    }

    @Override // p105m0.C1794b
    /* renamed from: a */
    public final boolean mo3501a(View view, AccessibilityEvent accessibilityEvent) {
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        return c1794b != null ? c1794b.mo3501a(view, accessibilityEvent) : this.f6850a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p105m0.C1794b
    /* renamed from: b */
    public final C1629o mo3502b(View view) {
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        return c1794b != null ? c1794b.mo3502b(view) : super.mo3502b(view);
    }

    @Override // p105m0.C1794b
    /* renamed from: c */
    public final void mo1360c(View view, AccessibilityEvent accessibilityEvent) {
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        if (c1794b != null) {
            c1794b.mo1360c(view, accessibilityEvent);
        } else {
            super.mo1360c(view, accessibilityEvent);
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: d */
    public final void mo1361d(View view, C1952d c1952d) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
        C2924x0 c2924x0 = this.f10868d;
        RecyclerView recyclerView = c2924x0.f10873d;
        RecyclerView recyclerView2 = c2924x0.f10873d;
        boolean zM1164O = recyclerView.m1164O();
        View.AccessibilityDelegate accessibilityDelegate = this.f6850a;
        if (zM1164O || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m4998W(view, c1952d);
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        if (c1794b != null) {
            c1794b.mo1361d(view, c1952d);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: e */
    public final void mo1363e(View view, AccessibilityEvent accessibilityEvent) {
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        if (c1794b != null) {
            c1794b.mo1363e(view, accessibilityEvent);
        } else {
            super.mo1363e(view, accessibilityEvent);
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: f */
    public final boolean mo3503f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1794b c1794b = (C1794b) this.f10869e.get(viewGroup);
        return c1794b != null ? c1794b.mo3503f(viewGroup, view, accessibilityEvent) : this.f6850a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p105m0.C1794b
    /* renamed from: g */
    public final boolean mo1362g(View view, int i, Bundle bundle) {
        C2924x0 c2924x0 = this.f10868d;
        RecyclerView recyclerView = c2924x0.f10873d;
        RecyclerView recyclerView2 = c2924x0.f10873d;
        if (recyclerView.m1164O() || recyclerView2.getLayoutManager() == null) {
            return super.mo1362g(view, i, bundle);
        }
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        if (c1794b != null) {
            if (c1794b.mo1362g(view, i, bundle)) {
                return true;
            }
        } else if (super.mo1362g(view, i, bundle)) {
            return true;
        }
        C2900l0 c2900l0 = recyclerView2.getLayoutManager().f10670b.f2058l;
        return false;
    }

    @Override // p105m0.C1794b
    /* renamed from: h */
    public final void mo3504h(View view, int i) {
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        if (c1794b != null) {
            c1794b.mo3504h(view, i);
        } else {
            super.mo3504h(view, i);
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: i */
    public final void mo3505i(View view, AccessibilityEvent accessibilityEvent) {
        C1794b c1794b = (C1794b) this.f10869e.get(view);
        if (c1794b != null) {
            c1794b.mo3505i(view, accessibilityEvent);
        } else {
            super.mo3505i(view, accessibilityEvent);
        }
    }
}
