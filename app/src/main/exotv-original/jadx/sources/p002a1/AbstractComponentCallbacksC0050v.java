package p002a1;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0147m0;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.C0123a0;
import androidx.lifecycle.C0161t0;
import androidx.lifecycle.C0166x;
import androidx.lifecycle.EnumC0148n;
import androidx.lifecycle.InterfaceC0138i;
import androidx.lifecycle.InterfaceC0163u0;
import androidx.lifecycle.InterfaceC0164v;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p004a3.C0067e;
import p004a3.InterfaceC0068f;
import p030d1.C0798b;
import p062h.AbstractActivityC1083i;
import p118n4.C2019p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.v */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0050v implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0164v, InterfaceC0163u0, InterfaceC0138i, InterfaceC0068f {

    /* renamed from: b0 */
    public static final Object f208b0 = new Object();

    /* renamed from: A */
    public C0035n0 f209A;

    /* renamed from: B */
    public C0058z f210B;

    /* renamed from: D */
    public AbstractComponentCallbacksC0050v f212D;

    /* renamed from: E */
    public int f213E;

    /* renamed from: F */
    public int f214F;

    /* renamed from: G */
    public String f215G;

    /* renamed from: H */
    public boolean f216H;

    /* renamed from: I */
    public boolean f217I;

    /* renamed from: J */
    public boolean f218J;

    /* renamed from: L */
    public boolean f220L;

    /* renamed from: M */
    public ViewGroup f221M;

    /* renamed from: N */
    public View f222N;

    /* renamed from: O */
    public boolean f223O;

    /* renamed from: Q */
    public C0046t f225Q;

    /* renamed from: R */
    public boolean f226R;

    /* renamed from: S */
    public boolean f227S;

    /* renamed from: T */
    public String f228T;

    /* renamed from: V */
    public C0166x f230V;

    /* renamed from: W */
    public C0053w0 f231W;

    /* renamed from: Y */
    public C2019p f233Y;

    /* renamed from: Z */
    public final ArrayList f234Z;

    /* renamed from: a0 */
    public final C0042r f235a0;

    /* renamed from: k */
    public Bundle f237k;

    /* renamed from: l */
    public SparseArray f238l;

    /* renamed from: m */
    public Bundle f239m;

    /* renamed from: o */
    public Bundle f241o;

    /* renamed from: p */
    public AbstractComponentCallbacksC0050v f242p;

    /* renamed from: r */
    public int f244r;

    /* renamed from: t */
    public boolean f246t;

    /* renamed from: u */
    public boolean f247u;

    /* renamed from: v */
    public boolean f248v;

    /* renamed from: w */
    public boolean f249w;

    /* renamed from: x */
    public boolean f250x;

    /* renamed from: y */
    public boolean f251y;

    /* renamed from: z */
    public int f252z;

    /* renamed from: j */
    public int f236j = -1;

    /* renamed from: n */
    public String f240n = UUID.randomUUID().toString();

    /* renamed from: q */
    public String f243q = null;

    /* renamed from: s */
    public Boolean f245s = null;

    /* renamed from: C */
    public C0035n0 f211C = new C0035n0();

    /* renamed from: K */
    public final boolean f219K = true;

    /* renamed from: P */
    public boolean f224P = true;

    /* renamed from: U */
    public EnumC0148n f229U = EnumC0148n.f929n;

    /* renamed from: X */
    public final C0123a0 f232X = new C0123a0();

    public AbstractComponentCallbacksC0050v() {
        new AtomicInteger();
        this.f234Z = new ArrayList();
        this.f235a0 = new C0042r(this);
        m231l();
    }

    /* renamed from: A */
    public void mo178A() {
        this.f220L = true;
    }

    /* renamed from: B */
    public void mo179B(Bundle bundle) {
        this.f220L = true;
    }

    /* renamed from: C */
    public void mo180C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f211C.m119M();
        this.f251y = true;
        this.f231W = new C0053w0(this, mo222b());
        View viewMo237u = mo237u(layoutInflater, viewGroup);
        this.f222N = viewMo237u;
        if (viewMo237u == null) {
            if (this.f231W.f266l != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f231W = null;
            return;
        }
        this.f231W.m240f();
        View view = this.f222N;
        C0053w0 c0053w0 = this.f231W;
        AbstractC2980h.m5136e("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, c0053w0);
        View view2 = this.f222N;
        C0053w0 c0053w02 = this.f231W;
        AbstractC2980h.m5136e("<this>", view2);
        view2.setTag(R.id.view_tree_view_model_store_owner, c0053w02);
        View view3 = this.f222N;
        C0053w0 c0053w03 = this.f231W;
        AbstractC2980h.m5136e("<this>", view3);
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0053w03);
        this.f232X.m551d(this.f231W);
    }

    /* renamed from: D */
    public final Context m217D() {
        Context contextM227h = m227h();
        if (contextM227h != null) {
            return contextM227h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: E */
    public final View m218E() {
        View view = this.f222N;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: F */
    public final void m219F(int i, int i4, int i8, int i9) {
        if (this.f225Q == null && i == 0 && i4 == 0 && i8 == 0 && i9 == 0) {
            return;
        }
        m225f().f191b = i;
        m225f().f192c = i4;
        m225f().f193d = i8;
        m225f().f194e = i9;
    }

    /* renamed from: G */
    public final void m220G(Bundle bundle) {
        C0035n0 c0035n0 = this.f209A;
        if (c0035n0 != null && (c0035n0.f106E || c0035n0.f107F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f241o = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0138i
    /* renamed from: a */
    public final C0798b mo221a() {
        Application application;
        Context applicationContext = m217D().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && C0035n0.m106G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m217D().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0798b c0798b = new C0798b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0798b.f933j;
        if (application != null) {
            linkedHashMap.put(AbstractC0147m0.f924d, application);
        }
        linkedHashMap.put(AbstractC0147m0.f921a, this);
        linkedHashMap.put(AbstractC0147m0.f922b, this);
        Bundle bundle = this.f241o;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0147m0.f923c, bundle);
        }
        return c0798b;
    }

    @Override // androidx.lifecycle.InterfaceC0163u0
    /* renamed from: b */
    public final C0161t0 mo222b() {
        if (this.f209A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m228i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f209A.f113L.f171d;
        C0161t0 c0161t0 = (C0161t0) map.get(this.f240n);
        if (c0161t0 != null) {
            return c0161t0;
        }
        C0161t0 c0161t02 = new C0161t0();
        map.put(this.f240n, c0161t02);
        return c0161t02;
    }

    @Override // p004a3.InterfaceC0068f
    /* renamed from: c */
    public final C0067e mo223c() {
        return (C0067e) this.f233Y.f7451m;
    }

    /* renamed from: d */
    public AbstractC0714c mo182d() {
        return new C0044s(this);
    }

    @Override // androidx.lifecycle.InterfaceC0164v
    /* renamed from: e */
    public final AbstractC0150o mo224e() {
        return this.f230V;
    }

    /* renamed from: f */
    public final C0046t m225f() {
        if (this.f225Q == null) {
            C0046t c0046t = new C0046t();
            Object obj = f208b0;
            c0046t.f196g = obj;
            c0046t.f197h = obj;
            c0046t.f198i = obj;
            c0046t.f199j = 1.0f;
            c0046t.f200k = null;
            this.f225Q = c0046t;
        }
        return this.f225Q;
    }

    /* renamed from: g */
    public final C0035n0 m226g() {
        if (this.f210B != null) {
            return this.f211C;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: h */
    public final Context m227h() {
        C0058z c0058z = this.f210B;
        if (c0058z == null) {
            return null;
        }
        return c0058z.f278q;
    }

    /* renamed from: i */
    public final int m228i() {
        EnumC0148n enumC0148n = this.f229U;
        return (enumC0148n == EnumC0148n.f926k || this.f212D == null) ? enumC0148n.ordinal() : Math.min(enumC0148n.ordinal(), this.f212D.m228i());
    }

    /* renamed from: j */
    public final C0035n0 m229j() {
        C0035n0 c0035n0 = this.f209A;
        if (c0035n0 != null) {
            return c0035n0;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: k */
    public final String m230k(int i) {
        return m217D().getResources().getString(i);
    }

    /* renamed from: l */
    public final void m231l() {
        this.f230V = new C0166x(this);
        this.f233Y = new C2019p(this);
        ArrayList arrayList = this.f234Z;
        C0042r c0042r = this.f235a0;
        if (arrayList.contains(c0042r)) {
            return;
        }
        if (this.f236j < 0) {
            arrayList.add(c0042r);
            return;
        }
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0042r.f175a;
        abstractComponentCallbacksC0050v.f233Y.m3888d();
        AbstractC0147m0.m565d(abstractComponentCallbacksC0050v);
    }

    /* renamed from: m */
    public final void m232m() {
        m231l();
        this.f228T = this.f240n;
        this.f240n = UUID.randomUUID().toString();
        this.f246t = false;
        this.f247u = false;
        this.f248v = false;
        this.f249w = false;
        this.f250x = false;
        this.f252z = 0;
        this.f209A = null;
        this.f211C = new C0035n0();
        this.f210B = null;
        this.f213E = 0;
        this.f214F = 0;
        this.f215G = null;
        this.f216H = false;
        this.f217I = false;
    }

    /* renamed from: n */
    public final boolean m233n() {
        return this.f210B != null && this.f246t;
    }

    /* renamed from: o */
    public final boolean m234o() {
        if (this.f216H) {
            return true;
        }
        C0035n0 c0035n0 = this.f209A;
        if (c0035n0 != null) {
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f212D;
            c0035n0.getClass();
            if (abstractComponentCallbacksC0050v == null ? false : abstractComponentCallbacksC0050v.m234o()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f220L = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0058z c0058z = this.f210B;
        AbstractActivityC1083i abstractActivityC1083i = c0058z == null ? null : c0058z.f277p;
        if (abstractActivityC1083i != null) {
            abstractActivityC1083i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f220L = true;
    }

    /* renamed from: p */
    public final boolean m235p() {
        return this.f252z > 0;
    }

    /* renamed from: q */
    public void mo183q() {
        this.f220L = true;
    }

    /* renamed from: r */
    public final void m236r(int i, int i4, Intent intent) {
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i4 + " data: " + intent);
        }
    }

    /* renamed from: s */
    public void mo184s(Context context) {
        this.f220L = true;
        C0058z c0058z = this.f210B;
        if ((c0058z == null ? null : c0058z.f277p) != null) {
            this.f220L = true;
        }
    }

    /* renamed from: t */
    public void mo185t(Bundle bundle) {
        Parcelable parcelable;
        this.f220L = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f211C.m125S(parcelable);
            C0035n0 c0035n0 = this.f211C;
            c0035n0.f106E = false;
            c0035n0.f107F = false;
            c0035n0.f113L.f174g = false;
            c0035n0.m154t(1);
        }
        C0035n0 c0035n02 = this.f211C;
        if (c0035n02.f133s >= 1) {
            return;
        }
        c0035n02.f106E = false;
        c0035n02.f107F = false;
        c0035n02.f113L.f174g = false;
        c0035n02.m154t(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f240n);
        if (this.f213E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f213E));
        }
        if (this.f215G != null) {
            sb.append(" tag=");
            sb.append(this.f215G);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public View mo237u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: v */
    public void mo186v() {
        this.f220L = true;
    }

    /* renamed from: w */
    public void mo187w() {
        this.f220L = true;
    }

    /* renamed from: x */
    public LayoutInflater mo188x(Bundle bundle) {
        C0058z c0058z = this.f210B;
        if (c0058z == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC1083i abstractActivityC1083i = c0058z.f281t;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC1083i.getLayoutInflater().cloneInContext(abstractActivityC1083i);
        layoutInflaterCloneInContext.setFactory2(this.f211C.f120f);
        return layoutInflaterCloneInContext;
    }

    /* renamed from: y */
    public abstract void mo189y(Bundle bundle);

    /* renamed from: z */
    public void mo190z() {
        this.f220L = true;
    }
}
