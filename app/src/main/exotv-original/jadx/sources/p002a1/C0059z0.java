package p002a1;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import p070i0.C1217b;
import p070i0.InterfaceC1216a;
import p156s.AbstractC2334g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.z0 */
/* loaded from: classes.dex */
public final class C0059z0 {

    /* renamed from: a */
    public int f282a;

    /* renamed from: b */
    public int f283b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0050v f284c;

    /* renamed from: d */
    public final ArrayList f285d;

    /* renamed from: e */
    public final HashSet f286e;

    /* renamed from: f */
    public boolean f287f;

    /* renamed from: g */
    public boolean f288g;

    /* renamed from: h */
    public final C0049u0 f289h;

    public C0059z0(int i, int i4, C0049u0 c0049u0, C1217b c1217b) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
        this.f285d = new ArrayList();
        this.f286e = new HashSet();
        this.f287f = false;
        this.f288g = false;
        this.f282a = i;
        this.f283b = i4;
        this.f284c = abstractComponentCallbacksC0050v;
        c1217b.m2668a(new C0036o(2, this));
        this.f289h = c0049u0;
    }

    /* renamed from: a */
    public final void m243a() {
        if (this.f287f) {
            return;
        }
        this.f287f = true;
        if (this.f286e.isEmpty()) {
            m244b();
            return;
        }
        ArrayList arrayList = new ArrayList(this.f286e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1217b c1217b = (C1217b) obj;
            synchronized (c1217b) {
                try {
                    if (!c1217b.f5097a) {
                        c1217b.f5097a = true;
                        c1217b.f5099c = true;
                        InterfaceC1216a interfaceC1216a = c1217b.f5098b;
                        if (interfaceC1216a != null) {
                            try {
                                interfaceC1216a.onCancel();
                            } catch (Throwable th) {
                                synchronized (c1217b) {
                                    c1217b.f5099c = false;
                                    c1217b.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c1217b) {
                            c1217b.f5099c = false;
                            c1217b.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final void m244b() {
        if (!this.f288g) {
            if (C0035n0.m106G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f288g = true;
            ArrayList arrayList = this.f285d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f289h.m210k();
    }

    /* renamed from: c */
    public final void m245c(int i, int i4) {
        int iM4162a = AbstractC2334g.m4162a(i4);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f284c;
        if (iM4162a == 0) {
            if (this.f282a != 1) {
                if (C0035n0.m106G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050v + " mFinalState = " + AbstractC0008a1.m28x(this.f282a) + " -> " + AbstractC0008a1.m28x(i) + ". ");
                }
                this.f282a = i;
                return;
            }
            return;
        }
        if (iM4162a == 1) {
            if (this.f282a == 1) {
                if (C0035n0.m106G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050v + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0008a1.m27w(this.f283b) + " to ADDING.");
                }
                this.f282a = 2;
                this.f283b = 2;
                return;
            }
            return;
        }
        if (iM4162a != 2) {
            return;
        }
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050v + " mFinalState = " + AbstractC0008a1.m28x(this.f282a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0008a1.m27w(this.f283b) + " to REMOVING.");
        }
        this.f282a = 1;
        this.f283b = 3;
    }

    /* renamed from: d */
    public final void m246d() {
        int i = this.f283b;
        C0049u0 c0049u0 = this.f289h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
                View viewM218E = abstractComponentCallbacksC0050v.m218E();
                if (C0035n0.m106G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewM218E.findFocus() + " on view " + viewM218E + " for Fragment " + abstractComponentCallbacksC0050v);
                }
                viewM218E.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = c0049u0.f205c;
        View viewFindFocus = abstractComponentCallbacksC0050v2.f222N.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC0050v2.m225f().f200k = viewFindFocus;
            if (C0035n0.m106G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0050v2);
            }
        }
        View viewM218E2 = this.f284c.m218E();
        if (viewM218E2.getParent() == null) {
            c0049u0.m201b();
            viewM218E2.setAlpha(0.0f);
        }
        if (viewM218E2.getAlpha() == 0.0f && viewM218E2.getVisibility() == 0) {
            viewM218E2.setVisibility(4);
        }
        C0046t c0046t = abstractComponentCallbacksC0050v2.f225Q;
        viewM218E2.setAlpha(c0046t == null ? 1.0f : c0046t.f199j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0008a1.m28x(this.f282a) + "} {mLifecycleImpact = " + AbstractC0008a1.m27w(this.f283b) + "} {mFragment = " + this.f284c + "}";
    }
}
