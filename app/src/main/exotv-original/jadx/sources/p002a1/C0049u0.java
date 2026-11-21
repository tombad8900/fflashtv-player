package p002a1;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC0147m0;
import androidx.lifecycle.C0166x;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.EnumC0148n;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p004a3.C0064b;
import p012b1.AbstractC0548c;
import p012b1.C0546a;
import p012b1.C0547b;
import p047f1.C0931a;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1828m0;
import p130p.C2193l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.u0 */
/* loaded from: classes.dex */
public final class C0049u0 {

    /* renamed from: a */
    public final C0016e f203a;

    /* renamed from: b */
    public final C0022h f204b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0050v f205c;

    /* renamed from: d */
    public boolean f206d = false;

    /* renamed from: e */
    public int f207e = -1;

    public C0049u0(C0016e c0016e, C0022h c0022h, AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        this.f203a = c0016e;
        this.f204b = c0022h;
        this.f205c = abstractComponentCallbacksC0050v;
    }

    /* renamed from: a */
    public final void m200a() {
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0050v);
        }
        Bundle bundle = abstractComponentCallbacksC0050v.f237k;
        abstractComponentCallbacksC0050v.f211C.m119M();
        abstractComponentCallbacksC0050v.f236j = 3;
        abstractComponentCallbacksC0050v.f220L = false;
        abstractComponentCallbacksC0050v.mo183q();
        if (!abstractComponentCallbacksC0050v.f220L) {
            throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onActivityCreated()");
        }
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0050v);
        }
        View view = abstractComponentCallbacksC0050v.f222N;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0050v.f237k;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0050v.f238l;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0050v.f238l = null;
            }
            if (abstractComponentCallbacksC0050v.f222N != null) {
                abstractComponentCallbacksC0050v.f231W.f267m.m3889e(abstractComponentCallbacksC0050v.f239m);
                abstractComponentCallbacksC0050v.f239m = null;
            }
            abstractComponentCallbacksC0050v.f220L = false;
            abstractComponentCallbacksC0050v.mo179B(bundle2);
            if (!abstractComponentCallbacksC0050v.f220L) {
                throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0050v.f222N != null) {
                abstractComponentCallbacksC0050v.f231W.m239d(EnumC0146m.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0050v.f237k = null;
        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f211C;
        c0035n0.f106E = false;
        c0035n0.f107F = false;
        c0035n0.f113L.f174g = false;
        c0035n0.m154t(4);
        this.f203a.m45b(false);
    }

    /* renamed from: b */
    public final void m201b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f204b.f78j;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        ViewGroup viewGroup = abstractComponentCallbacksC0050v.f221M;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0050v);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = (AbstractComponentCallbacksC0050v) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0050v2.f221M == viewGroup && (view = abstractComponentCallbacksC0050v2.f222N) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v3 = (AbstractComponentCallbacksC0050v) arrayList.get(i);
                    if (abstractComponentCallbacksC0050v3.f221M == viewGroup && (view2 = abstractComponentCallbacksC0050v3.f222N) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        abstractComponentCallbacksC0050v.f221M.addView(abstractComponentCallbacksC0050v.f222N, iIndexOfChild);
    }

    /* renamed from: c */
    public final void m202c() {
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0050v);
        }
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = abstractComponentCallbacksC0050v.f242p;
        C0049u0 c0049u0 = null;
        C0022h c0022h = this.f204b;
        if (abstractComponentCallbacksC0050v2 != null) {
            C0049u0 c0049u02 = (C0049u0) ((HashMap) c0022h.f79k).get(abstractComponentCallbacksC0050v2.f240n);
            if (c0049u02 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050v + " declared target fragment " + abstractComponentCallbacksC0050v.f242p + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0050v.f243q = abstractComponentCallbacksC0050v.f242p.f240n;
            abstractComponentCallbacksC0050v.f242p = null;
            c0049u0 = c0049u02;
        } else {
            String str = abstractComponentCallbacksC0050v.f243q;
            if (str != null && (c0049u0 = (C0049u0) ((HashMap) c0022h.f79k).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0050v);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC0008a1.m18n(sb, abstractComponentCallbacksC0050v.f243q, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0049u0 != null) {
            c0049u0.m210k();
        }
        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f209A;
        abstractComponentCallbacksC0050v.f210B = c0035n0.f134t;
        abstractComponentCallbacksC0050v.f212D = c0035n0.f136v;
        C0016e c0016e = this.f203a;
        c0016e.m60q(false);
        ArrayList arrayList = abstractComponentCallbacksC0050v.f234Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v3 = ((C0042r) obj).f175a;
            abstractComponentCallbacksC0050v3.f233Y.m3888d();
            AbstractC0147m0.m565d(abstractComponentCallbacksC0050v3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0050v.f211C.m134b(abstractComponentCallbacksC0050v.f210B, abstractComponentCallbacksC0050v.mo182d(), abstractComponentCallbacksC0050v);
        abstractComponentCallbacksC0050v.f236j = 0;
        abstractComponentCallbacksC0050v.f220L = false;
        abstractComponentCallbacksC0050v.mo184s(abstractComponentCallbacksC0050v.f210B.f278q);
        if (!abstractComponentCallbacksC0050v.f220L) {
            throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onAttach()");
        }
        Iterator it = abstractComponentCallbacksC0050v.f209A.f127m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0043r0) it.next()).mo89a();
        }
        C0035n0 c0035n02 = abstractComponentCallbacksC0050v.f211C;
        c0035n02.f106E = false;
        c0035n02.f107F = false;
        c0035n02.f113L.f174g = false;
        c0035n02.m154t(0);
        c0016e.m51h(false);
    }

    /* renamed from: d */
    public final int m203d() {
        C0059z0 c0059z0;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (abstractComponentCallbacksC0050v.f209A == null) {
            return abstractComponentCallbacksC0050v.f236j;
        }
        int iMin = this.f207e;
        int iOrdinal = abstractComponentCallbacksC0050v.f229U.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0050v.f248v) {
            if (abstractComponentCallbacksC0050v.f249w) {
                iMin = Math.max(this.f207e, 2);
                View view = abstractComponentCallbacksC0050v.f222N;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f207e < 4 ? Math.min(iMin, abstractComponentCallbacksC0050v.f236j) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0050v.f246t) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0050v.f221M;
        if (viewGroup != null) {
            C0030l c0030lM99f = C0030l.m99f(viewGroup, abstractComponentCallbacksC0050v.m229j().m115E());
            C0059z0 c0059z0M103d = c0030lM99f.m103d(abstractComponentCallbacksC0050v);
            int i4 = c0059z0M103d != null ? c0059z0M103d.f283b : 0;
            ArrayList arrayList = c0030lM99f.f95c;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    c0059z0 = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                c0059z0 = (C0059z0) obj;
                if (c0059z0.f284c.equals(abstractComponentCallbacksC0050v) && !c0059z0.f287f) {
                    break;
                }
            }
            i = (c0059z0 == null || !(i4 == 0 || i4 == 1)) ? i4 : c0059z0.f283b;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0050v.f247u) {
            iMin = abstractComponentCallbacksC0050v.m235p() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0050v.f223O && abstractComponentCallbacksC0050v.f236j < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0050v);
        }
        return iMin;
    }

    /* renamed from: e */
    public final void m204e() {
        Parcelable parcelable;
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0050v);
        }
        if (abstractComponentCallbacksC0050v.f227S) {
            Bundle bundle = abstractComponentCallbacksC0050v.f237k;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0050v.f211C.m125S(parcelable);
                C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f211C;
                c0035n0.f106E = false;
                c0035n0.f107F = false;
                c0035n0.f113L.f174g = false;
                c0035n0.m154t(1);
            }
            abstractComponentCallbacksC0050v.f236j = 1;
            return;
        }
        C0016e c0016e = this.f203a;
        c0016e.m61r(false);
        Bundle bundle2 = abstractComponentCallbacksC0050v.f237k;
        abstractComponentCallbacksC0050v.f211C.m119M();
        abstractComponentCallbacksC0050v.f236j = 1;
        abstractComponentCallbacksC0050v.f220L = false;
        abstractComponentCallbacksC0050v.f230V.mo568a(new C0064b(1, abstractComponentCallbacksC0050v));
        abstractComponentCallbacksC0050v.f233Y.m3889e(bundle2);
        abstractComponentCallbacksC0050v.mo185t(bundle2);
        abstractComponentCallbacksC0050v.f227S = true;
        if (abstractComponentCallbacksC0050v.f220L) {
            abstractComponentCallbacksC0050v.f230V.m585l(EnumC0146m.ON_CREATE);
            c0016e.m56m(false);
        } else {
            throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onCreate()");
        }
    }

    /* renamed from: f */
    public final void m205f() throws Resources.NotFoundException {
        String resourceName;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (abstractComponentCallbacksC0050v.f248v) {
            return;
        }
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0050v);
        }
        LayoutInflater layoutInflaterMo188x = abstractComponentCallbacksC0050v.mo188x(abstractComponentCallbacksC0050v.f237k);
        ViewGroup viewGroup = abstractComponentCallbacksC0050v.f221M;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0050v.f214F;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0050v + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0050v.f209A.f135u.mo175U(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0050v.f250x) {
                        try {
                            resourceName = abstractComponentCallbacksC0050v.m217D().getResources().getResourceName(abstractComponentCallbacksC0050v.f214F);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0050v.f214F) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0050v);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0547b c0547b = AbstractC0548c.f2224a;
                    AbstractC0548c.m1278b(new C0546a(abstractComponentCallbacksC0050v, "Attempting to add fragment " + abstractComponentCallbacksC0050v + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0548c.m1277a(abstractComponentCallbacksC0050v).getClass();
                }
            }
        }
        abstractComponentCallbacksC0050v.f221M = viewGroup;
        abstractComponentCallbacksC0050v.mo180C(layoutInflaterMo188x, viewGroup, abstractComponentCallbacksC0050v.f237k);
        View view = abstractComponentCallbacksC0050v.f222N;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0050v.f222N.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0050v);
            if (viewGroup != null) {
                m201b();
            }
            if (abstractComponentCallbacksC0050v.f216H) {
                abstractComponentCallbacksC0050v.f222N.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0050v.f222N;
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            if (view2.isAttachedToWindow()) {
                AbstractC1798c0.m3516c(abstractComponentCallbacksC0050v.f222N);
            } else {
                View view3 = abstractComponentCallbacksC0050v.f222N;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0047t0(0, view3));
            }
            abstractComponentCallbacksC0050v.f211C.m154t(2);
            this.f203a.m66w(false);
            int visibility = abstractComponentCallbacksC0050v.f222N.getVisibility();
            abstractComponentCallbacksC0050v.m225f().f199j = abstractComponentCallbacksC0050v.f222N.getAlpha();
            if (abstractComponentCallbacksC0050v.f221M != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0050v.f222N.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0050v.m225f().f200k = viewFindFocus;
                    if (C0035n0.m106G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0050v);
                    }
                }
                abstractComponentCallbacksC0050v.f222N.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0050v.f236j = 2;
    }

    /* renamed from: g */
    public final void m206g() {
        boolean z7;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM73c;
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0050v);
        }
        int i = 0;
        boolean z8 = abstractComponentCallbacksC0050v.f247u && !abstractComponentCallbacksC0050v.m235p();
        C0022h c0022h = this.f204b;
        if (z8) {
        }
        if (!z8) {
            C0041q0 c0041q0 = (C0041q0) c0022h.f81m;
            if (!((c0041q0.f169b.containsKey(abstractComponentCallbacksC0050v.f240n) && c0041q0.f172e) ? c0041q0.f173f : true)) {
                String str = abstractComponentCallbacksC0050v.f243q;
                if (str != null && (abstractComponentCallbacksC0050vM73c = c0022h.m73c(str)) != null && abstractComponentCallbacksC0050vM73c.f218J) {
                    abstractComponentCallbacksC0050v.f242p = abstractComponentCallbacksC0050vM73c;
                }
                abstractComponentCallbacksC0050v.f236j = 0;
                return;
            }
        }
        C0058z c0058z = abstractComponentCallbacksC0050v.f210B;
        if (c0058z != null) {
            z7 = ((C0041q0) c0022h.f81m).f173f;
        } else {
            z7 = c0058z.f278q != null ? !r5.isChangingConfigurations() : true;
        }
        if (z8 || z7) {
            ((C0041q0) c0022h.f81m).m192c(abstractComponentCallbacksC0050v);
        }
        abstractComponentCallbacksC0050v.f211C.m145k();
        abstractComponentCallbacksC0050v.f230V.m585l(EnumC0146m.ON_DESTROY);
        abstractComponentCallbacksC0050v.f236j = 0;
        abstractComponentCallbacksC0050v.f227S = false;
        abstractComponentCallbacksC0050v.f220L = true;
        this.f203a.m57n(false);
        ArrayList arrayListM78i = c0022h.m78i();
        int size = arrayListM78i.size();
        while (i < size) {
            Object obj = arrayListM78i.get(i);
            i++;
            C0049u0 c0049u0 = (C0049u0) obj;
            if (c0049u0 != null) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = c0049u0.f205c;
                if (abstractComponentCallbacksC0050v.f240n.equals(abstractComponentCallbacksC0050v2.f243q)) {
                    abstractComponentCallbacksC0050v2.f242p = abstractComponentCallbacksC0050v;
                    abstractComponentCallbacksC0050v2.f243q = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0050v.f243q;
        if (str2 != null) {
            abstractComponentCallbacksC0050v.f242p = c0022h.m73c(str2);
        }
        c0022h.m82m(this);
    }

    /* renamed from: h */
    public final void m207h() {
        View view;
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0050v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0050v.f221M;
        if (viewGroup != null && (view = abstractComponentCallbacksC0050v.f222N) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0050v.f211C.m154t(1);
        if (abstractComponentCallbacksC0050v.f222N != null) {
            C0053w0 c0053w0 = abstractComponentCallbacksC0050v.f231W;
            c0053w0.m240f();
            if (c0053w0.f266l.f951m.compareTo(EnumC0148n.f927l) >= 0) {
                abstractComponentCallbacksC0050v.f231W.m239d(EnumC0146m.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0050v.f236j = 1;
        abstractComponentCallbacksC0050v.f220L = false;
        abstractComponentCallbacksC0050v.mo186v();
        if (!abstractComponentCallbacksC0050v.f220L) {
            throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onDestroyView()");
        }
        C2193l c2193l = ((C0931a) new C0036o(abstractComponentCallbacksC0050v.mo222b(), C0931a.f3994c).m172o(C0931a.class)).f3995b;
        if (c2193l.f7659l > 0) {
            c2193l.f7658k[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0050v.f251y = false;
        this.f203a.m67x(false);
        abstractComponentCallbacksC0050v.f221M = null;
        abstractComponentCallbacksC0050v.f222N = null;
        abstractComponentCallbacksC0050v.f231W = null;
        abstractComponentCallbacksC0050v.f232X.m551d(null);
        abstractComponentCallbacksC0050v.f249w = false;
    }

    /* renamed from: i */
    public final void m208i() {
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0050v);
        }
        abstractComponentCallbacksC0050v.f236j = -1;
        abstractComponentCallbacksC0050v.f220L = false;
        abstractComponentCallbacksC0050v.mo187w();
        if (!abstractComponentCallbacksC0050v.f220L) {
            throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onDetach()");
        }
        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f211C;
        if (!c0035n0.f108G) {
            c0035n0.m145k();
            abstractComponentCallbacksC0050v.f211C = new C0035n0();
        }
        this.f203a.m58o(false);
        abstractComponentCallbacksC0050v.f236j = -1;
        abstractComponentCallbacksC0050v.f210B = null;
        abstractComponentCallbacksC0050v.f212D = null;
        abstractComponentCallbacksC0050v.f209A = null;
        if (!abstractComponentCallbacksC0050v.f247u || abstractComponentCallbacksC0050v.m235p()) {
            C0041q0 c0041q0 = (C0041q0) this.f204b.f81m;
            if (!((c0041q0.f169b.containsKey(abstractComponentCallbacksC0050v.f240n) && c0041q0.f172e) ? c0041q0.f173f : true)) {
                return;
            }
        }
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0050v);
        }
        abstractComponentCallbacksC0050v.m232m();
    }

    /* renamed from: j */
    public final void m209j() {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (abstractComponentCallbacksC0050v.f248v && abstractComponentCallbacksC0050v.f249w && !abstractComponentCallbacksC0050v.f251y) {
            if (C0035n0.m106G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0050v);
            }
            abstractComponentCallbacksC0050v.mo180C(abstractComponentCallbacksC0050v.mo188x(abstractComponentCallbacksC0050v.f237k), null, abstractComponentCallbacksC0050v.f237k);
            View view = abstractComponentCallbacksC0050v.f222N;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0050v.f222N.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0050v);
                if (abstractComponentCallbacksC0050v.f216H) {
                    abstractComponentCallbacksC0050v.f222N.setVisibility(8);
                }
                abstractComponentCallbacksC0050v.f211C.m154t(2);
                this.f203a.m66w(false);
                abstractComponentCallbacksC0050v.f236j = 2;
            }
        }
    }

    /* renamed from: k */
    public final void m210k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0022h c0022h = this.f204b;
        boolean z7 = this.f206d;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (z7) {
            if (C0035n0.m106G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0050v);
                return;
            }
            return;
        }
        try {
            this.f206d = true;
            boolean z8 = false;
            while (true) {
                int iM203d = m203d();
                int i = abstractComponentCallbacksC0050v.f236j;
                if (iM203d == i) {
                    if (!z8 && i == -1 && abstractComponentCallbacksC0050v.f247u && !abstractComponentCallbacksC0050v.m235p()) {
                        if (C0035n0.m106G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0050v);
                        }
                        ((C0041q0) c0022h.f81m).m192c(abstractComponentCallbacksC0050v);
                        c0022h.m82m(this);
                        if (C0035n0.m106G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0050v);
                        }
                        abstractComponentCallbacksC0050v.m232m();
                    }
                    if (abstractComponentCallbacksC0050v.f226R) {
                        if (abstractComponentCallbacksC0050v.f222N != null && (viewGroup = abstractComponentCallbacksC0050v.f221M) != null) {
                            C0030l c0030lM99f = C0030l.m99f(viewGroup, abstractComponentCallbacksC0050v.m229j().m115E());
                            if (abstractComponentCallbacksC0050v.f216H) {
                                if (C0035n0.m106G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0050v);
                                }
                                c0030lM99f.m100a(3, 1, this);
                            } else {
                                if (C0035n0.m106G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0050v);
                                }
                                c0030lM99f.m100a(2, 1, this);
                            }
                        }
                        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f209A;
                        if (c0035n0 != null && abstractComponentCallbacksC0050v.f246t && C0035n0.m107H(abstractComponentCallbacksC0050v)) {
                            c0035n0.f105D = true;
                        }
                        abstractComponentCallbacksC0050v.f226R = false;
                        abstractComponentCallbacksC0050v.f211C.m148n();
                    }
                    this.f206d = false;
                    return;
                }
                if (iM203d <= i) {
                    switch (i - 1) {
                        case -1:
                            m208i();
                            break;
                        case 0:
                            m206g();
                            break;
                        case 1:
                            m207h();
                            abstractComponentCallbacksC0050v.f236j = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0050v.f249w = false;
                            abstractComponentCallbacksC0050v.f236j = 2;
                            break;
                        case 3:
                            if (C0035n0.m106G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0050v);
                            }
                            if (abstractComponentCallbacksC0050v.f222N != null && abstractComponentCallbacksC0050v.f238l == null) {
                                m214o();
                            }
                            if (abstractComponentCallbacksC0050v.f222N != null && (viewGroup2 = abstractComponentCallbacksC0050v.f221M) != null) {
                                C0030l c0030lM99f2 = C0030l.m99f(viewGroup2, abstractComponentCallbacksC0050v.m229j().m115E());
                                if (C0035n0.m106G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0050v);
                                }
                                c0030lM99f2.m100a(1, 3, this);
                            }
                            abstractComponentCallbacksC0050v.f236j = 3;
                            break;
                        case 4:
                            m216q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0050v.f236j = 5;
                            break;
                        case 6:
                            m211l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m202c();
                            break;
                        case 1:
                            m204e();
                            break;
                        case 2:
                            m209j();
                            m205f();
                            break;
                        case 3:
                            m200a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0050v.f222N != null && (viewGroup3 = abstractComponentCallbacksC0050v.f221M) != null) {
                                C0030l c0030lM99f3 = C0030l.m99f(viewGroup3, abstractComponentCallbacksC0050v.m229j().m115E());
                                int iM6b = AbstractC0008a1.m6b(abstractComponentCallbacksC0050v.f222N.getVisibility());
                                if (C0035n0.m106G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0050v);
                                }
                                c0030lM99f3.m100a(iM6b, 2, this);
                            }
                            abstractComponentCallbacksC0050v.f236j = 4;
                            break;
                        case 5:
                            m215p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0050v.f236j = 6;
                            break;
                        case 7:
                            m213n();
                            break;
                    }
                }
                z8 = true;
            }
        } catch (Throwable th) {
            this.f206d = false;
            throw th;
        }
    }

    /* renamed from: l */
    public final void m211l() {
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0050v);
        }
        abstractComponentCallbacksC0050v.f211C.m154t(5);
        if (abstractComponentCallbacksC0050v.f222N != null) {
            abstractComponentCallbacksC0050v.f231W.m239d(EnumC0146m.ON_PAUSE);
        }
        abstractComponentCallbacksC0050v.f230V.m585l(EnumC0146m.ON_PAUSE);
        abstractComponentCallbacksC0050v.f236j = 6;
        abstractComponentCallbacksC0050v.f220L = true;
        this.f203a.m59p(false);
    }

    /* renamed from: m */
    public final void m212m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        Bundle bundle = abstractComponentCallbacksC0050v.f237k;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0050v.f238l = abstractComponentCallbacksC0050v.f237k.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0050v.f239m = abstractComponentCallbacksC0050v.f237k.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0050v.f237k.getString("android:target_state");
        abstractComponentCallbacksC0050v.f243q = string;
        if (string != null) {
            abstractComponentCallbacksC0050v.f244r = abstractComponentCallbacksC0050v.f237k.getInt("android:target_req_state", 0);
        }
        boolean z7 = abstractComponentCallbacksC0050v.f237k.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0050v.f224P = z7;
        if (z7) {
            return;
        }
        abstractComponentCallbacksC0050v.f223O = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m213n() {
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0050v);
        }
        C0046t c0046t = abstractComponentCallbacksC0050v.f225Q;
        View view = c0046t == null ? null : c0046t.f200k;
        if (view != null) {
            if (view == abstractComponentCallbacksC0050v.f222N) {
                boolean zRequestFocus = view.requestFocus();
                if (C0035n0.m106G(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(abstractComponentCallbacksC0050v);
                    sb.append(" resulting in focused view ");
                    sb.append(abstractComponentCallbacksC0050v.f222N.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == abstractComponentCallbacksC0050v.f222N) {
                        boolean zRequestFocus2 = view.requestFocus();
                        if (C0035n0.m106G(2)) {
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC0050v.m225f().f200k = null;
        abstractComponentCallbacksC0050v.f211C.m119M();
        abstractComponentCallbacksC0050v.f211C.m159y(true);
        abstractComponentCallbacksC0050v.f236j = 7;
        abstractComponentCallbacksC0050v.f220L = true;
        C0166x c0166x = abstractComponentCallbacksC0050v.f230V;
        EnumC0146m enumC0146m = EnumC0146m.ON_RESUME;
        c0166x.m585l(enumC0146m);
        if (abstractComponentCallbacksC0050v.f222N != null) {
            abstractComponentCallbacksC0050v.f231W.f266l.m585l(enumC0146m);
        }
        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f211C;
        c0035n0.f106E = false;
        c0035n0.f107F = false;
        c0035n0.f113L.f174g = false;
        c0035n0.m154t(7);
        this.f203a.m62s(false);
        abstractComponentCallbacksC0050v.f237k = null;
        abstractComponentCallbacksC0050v.f238l = null;
        abstractComponentCallbacksC0050v.f239m = null;
    }

    /* renamed from: o */
    public final void m214o() {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (abstractComponentCallbacksC0050v.f222N == null) {
            return;
        }
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0050v + " with view " + abstractComponentCallbacksC0050v.f222N);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0050v.f222N.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0050v.f238l = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0050v.f231W.f267m.m3890f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0050v.f239m = bundle;
    }

    /* renamed from: p */
    public final void m215p() {
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0050v);
        }
        abstractComponentCallbacksC0050v.f211C.m119M();
        abstractComponentCallbacksC0050v.f211C.m159y(true);
        abstractComponentCallbacksC0050v.f236j = 5;
        abstractComponentCallbacksC0050v.f220L = false;
        abstractComponentCallbacksC0050v.mo190z();
        if (!abstractComponentCallbacksC0050v.f220L) {
            throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onStart()");
        }
        C0166x c0166x = abstractComponentCallbacksC0050v.f230V;
        EnumC0146m enumC0146m = EnumC0146m.ON_START;
        c0166x.m585l(enumC0146m);
        if (abstractComponentCallbacksC0050v.f222N != null) {
            abstractComponentCallbacksC0050v.f231W.f266l.m585l(enumC0146m);
        }
        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f211C;
        c0035n0.f106E = false;
        c0035n0.f107F = false;
        c0035n0.f113L.f174g = false;
        c0035n0.m154t(5);
        this.f203a.m64u(false);
    }

    /* renamed from: q */
    public final void m216q() {
        boolean zM106G = C0035n0.m106G(3);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f205c;
        if (zM106G) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0050v);
        }
        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f211C;
        c0035n0.f107F = true;
        c0035n0.f113L.f174g = true;
        c0035n0.m154t(4);
        if (abstractComponentCallbacksC0050v.f222N != null) {
            abstractComponentCallbacksC0050v.f231W.m239d(EnumC0146m.ON_STOP);
        }
        abstractComponentCallbacksC0050v.f230V.m585l(EnumC0146m.ON_STOP);
        abstractComponentCallbacksC0050v.f236j = 4;
        abstractComponentCallbacksC0050v.f220L = false;
        abstractComponentCallbacksC0050v.mo178A();
        if (abstractComponentCallbacksC0050v.f220L) {
            this.f203a.m65v(false);
            return;
        }
        throw new C0011b1("Fragment " + abstractComponentCallbacksC0050v + " did not call through to super.onStop()");
    }

    public C0049u0(C0016e c0016e, C0022h c0022h, ClassLoader classLoader, C0023h0 c0023h0, C0045s0 c0045s0) {
        this.f203a = c0016e;
        this.f204b = c0022h;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM87a = c0023h0.m87a(c0045s0.f177j);
        Bundle bundle = c0045s0.f186s;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0050vM87a.m220G(bundle);
        abstractComponentCallbacksC0050vM87a.f240n = c0045s0.f178k;
        abstractComponentCallbacksC0050vM87a.f248v = c0045s0.f179l;
        abstractComponentCallbacksC0050vM87a.f250x = true;
        abstractComponentCallbacksC0050vM87a.f213E = c0045s0.f180m;
        abstractComponentCallbacksC0050vM87a.f214F = c0045s0.f181n;
        abstractComponentCallbacksC0050vM87a.f215G = c0045s0.f182o;
        abstractComponentCallbacksC0050vM87a.f218J = c0045s0.f183p;
        abstractComponentCallbacksC0050vM87a.f247u = c0045s0.f184q;
        abstractComponentCallbacksC0050vM87a.f217I = c0045s0.f185r;
        abstractComponentCallbacksC0050vM87a.f216H = c0045s0.f187t;
        abstractComponentCallbacksC0050vM87a.f229U = EnumC0148n.values()[c0045s0.f188u];
        Bundle bundle2 = c0045s0.f189v;
        if (bundle2 != null) {
            abstractComponentCallbacksC0050vM87a.f237k = bundle2;
        } else {
            abstractComponentCallbacksC0050vM87a.f237k = new Bundle();
        }
        this.f205c = abstractComponentCallbacksC0050vM87a;
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0050vM87a);
        }
    }

    public C0049u0(C0016e c0016e, C0022h c0022h, AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v, C0045s0 c0045s0) {
        this.f203a = c0016e;
        this.f204b = c0022h;
        this.f205c = abstractComponentCallbacksC0050v;
        abstractComponentCallbacksC0050v.f238l = null;
        abstractComponentCallbacksC0050v.f239m = null;
        abstractComponentCallbacksC0050v.f252z = 0;
        abstractComponentCallbacksC0050v.f249w = false;
        abstractComponentCallbacksC0050v.f246t = false;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = abstractComponentCallbacksC0050v.f242p;
        abstractComponentCallbacksC0050v.f243q = abstractComponentCallbacksC0050v2 != null ? abstractComponentCallbacksC0050v2.f240n : null;
        abstractComponentCallbacksC0050v.f242p = null;
        Bundle bundle = c0045s0.f189v;
        if (bundle != null) {
            abstractComponentCallbacksC0050v.f237k = bundle;
        } else {
            abstractComponentCallbacksC0050v.f237k = new Bundle();
        }
    }
}
