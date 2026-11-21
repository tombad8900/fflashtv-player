package p002a1;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0148n;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.C2181z;
import p004a3.C0067e;
import p005a4.C0073c;
import p010b.C0520j;
import p010b.C0534x;
import p010b.InterfaceC0513c;
import p011b0.C0540f;
import p011b0.C0545k;
import p012b1.AbstractC0548c;
import p047f1.C0931a;
import p062h.AbstractActivityC1083i;
import p096l0.InterfaceC1641a;
import p130p.C2193l;
import p211y5.C2819f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.n0 */
/* loaded from: classes.dex */
public final class C0035n0 {

    /* renamed from: A */
    public C0016e f102A;

    /* renamed from: B */
    public C0016e f103B;

    /* renamed from: C */
    public ArrayDeque f104C;

    /* renamed from: D */
    public boolean f105D;

    /* renamed from: E */
    public boolean f106E;

    /* renamed from: F */
    public boolean f107F;

    /* renamed from: G */
    public boolean f108G;

    /* renamed from: H */
    public boolean f109H;

    /* renamed from: I */
    public ArrayList f110I;

    /* renamed from: J */
    public ArrayList f111J;

    /* renamed from: K */
    public ArrayList f112K;

    /* renamed from: L */
    public C0041q0 f113L;

    /* renamed from: M */
    public final RunnableC0018f f114M;

    /* renamed from: b */
    public boolean f116b;

    /* renamed from: d */
    public ArrayList f118d;

    /* renamed from: e */
    public ArrayList f119e;

    /* renamed from: g */
    public C0534x f121g;

    /* renamed from: l */
    public final C0016e f126l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f127m;

    /* renamed from: n */
    public final C0015d0 f128n;

    /* renamed from: o */
    public final C0015d0 f129o;

    /* renamed from: p */
    public final C0015d0 f130p;

    /* renamed from: q */
    public final C0015d0 f131q;

    /* renamed from: r */
    public final C0021g0 f132r;

    /* renamed from: s */
    public int f133s;

    /* renamed from: t */
    public C0058z f134t;

    /* renamed from: u */
    public AbstractC0714c f135u;

    /* renamed from: v */
    public AbstractComponentCallbacksC0050v f136v;

    /* renamed from: w */
    public AbstractComponentCallbacksC0050v f137w;

    /* renamed from: x */
    public final C0023h0 f138x;

    /* renamed from: y */
    public final C2819f f139y;

    /* renamed from: z */
    public C0016e f140z;

    /* renamed from: a */
    public final ArrayList f115a = new ArrayList();

    /* renamed from: c */
    public final C0022h f117c = new C0022h(1);

    /* renamed from: f */
    public final LayoutInflaterFactory2C0013c0 f120f = new LayoutInflaterFactory2C0013c0(this);

    /* renamed from: h */
    public final C0019f0 f122h = new C0019f0(this);

    /* renamed from: i */
    public final AtomicInteger f123i = new AtomicInteger();

    /* renamed from: j */
    public final Map f124j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map f125k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [a1.d0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [a1.d0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [a1.d0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [a1.d0] */
    public C0035n0() {
        Collections.synchronizedMap(new HashMap());
        this.f126l = new C0016e(this);
        this.f127m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f128n = new InterfaceC1641a(this) { // from class: a1.d0

            /* renamed from: b */
            public final /* synthetic */ C0035n0 f59b;

            {
                this.f59b = this;
            }

            @Override // p096l0.InterfaceC1641a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        C0035n0 c0035n0 = this.f59b;
                        if (c0035n0.m117I()) {
                            c0035n0.m142h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0035n0 c0035n02 = this.f59b;
                        if (c0035n02.m117I() && num.intValue() == 80) {
                            c0035n02.m146l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0540f c0540f = (C0540f) obj;
                        C0035n0 c0035n03 = this.f59b;
                        if (c0035n03.m117I()) {
                            boolean z7 = c0540f.f2202a;
                            c0035n03.m147m(false);
                            break;
                        }
                        break;
                    default:
                        C0545k c0545k = (C0545k) obj;
                        C0035n0 c0035n04 = this.f59b;
                        if (c0035n04.m117I()) {
                            boolean z8 = c0545k.f2221a;
                            c0035n04.m152r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f129o = new InterfaceC1641a(this) { // from class: a1.d0

            /* renamed from: b */
            public final /* synthetic */ C0035n0 f59b;

            {
                this.f59b = this;
            }

            @Override // p096l0.InterfaceC1641a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        C0035n0 c0035n0 = this.f59b;
                        if (c0035n0.m117I()) {
                            c0035n0.m142h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0035n0 c0035n02 = this.f59b;
                        if (c0035n02.m117I() && num.intValue() == 80) {
                            c0035n02.m146l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0540f c0540f = (C0540f) obj;
                        C0035n0 c0035n03 = this.f59b;
                        if (c0035n03.m117I()) {
                            boolean z7 = c0540f.f2202a;
                            c0035n03.m147m(false);
                            break;
                        }
                        break;
                    default:
                        C0545k c0545k = (C0545k) obj;
                        C0035n0 c0035n04 = this.f59b;
                        if (c0035n04.m117I()) {
                            boolean z8 = c0545k.f2221a;
                            c0035n04.m152r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i8 = 2;
        this.f130p = new InterfaceC1641a(this) { // from class: a1.d0

            /* renamed from: b */
            public final /* synthetic */ C0035n0 f59b;

            {
                this.f59b = this;
            }

            @Override // p096l0.InterfaceC1641a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        C0035n0 c0035n0 = this.f59b;
                        if (c0035n0.m117I()) {
                            c0035n0.m142h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0035n0 c0035n02 = this.f59b;
                        if (c0035n02.m117I() && num.intValue() == 80) {
                            c0035n02.m146l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0540f c0540f = (C0540f) obj;
                        C0035n0 c0035n03 = this.f59b;
                        if (c0035n03.m117I()) {
                            boolean z7 = c0540f.f2202a;
                            c0035n03.m147m(false);
                            break;
                        }
                        break;
                    default:
                        C0545k c0545k = (C0545k) obj;
                        C0035n0 c0035n04 = this.f59b;
                        if (c0035n04.m117I()) {
                            boolean z8 = c0545k.f2221a;
                            c0035n04.m152r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i9 = 3;
        this.f131q = new InterfaceC1641a(this) { // from class: a1.d0

            /* renamed from: b */
            public final /* synthetic */ C0035n0 f59b;

            {
                this.f59b = this;
            }

            @Override // p096l0.InterfaceC1641a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        C0035n0 c0035n0 = this.f59b;
                        if (c0035n0.m117I()) {
                            c0035n0.m142h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0035n0 c0035n02 = this.f59b;
                        if (c0035n02.m117I() && num.intValue() == 80) {
                            c0035n02.m146l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0540f c0540f = (C0540f) obj;
                        C0035n0 c0035n03 = this.f59b;
                        if (c0035n03.m117I()) {
                            boolean z7 = c0540f.f2202a;
                            c0035n03.m147m(false);
                            break;
                        }
                        break;
                    default:
                        C0545k c0545k = (C0545k) obj;
                        C0035n0 c0035n04 = this.f59b;
                        if (c0035n04.m117I()) {
                            boolean z8 = c0545k.f2221a;
                            c0035n04.m152r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f132r = new C0021g0(this);
        this.f133s = -1;
        this.f138x = new C0023h0(this);
        this.f139y = new C2819f(1);
        this.f104C = new ArrayDeque();
        this.f114M = new RunnableC0018f(2, this);
    }

    /* renamed from: G */
    public static boolean m106G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: H */
    public static boolean m107H(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        abstractComponentCallbacksC0050v.getClass();
        ArrayList arrayListM79j = abstractComponentCallbacksC0050v.f211C.f117c.m79j();
        int size = arrayListM79j.size();
        boolean zM107H = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListM79j.get(i);
            i++;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = (AbstractComponentCallbacksC0050v) obj;
            if (abstractComponentCallbacksC0050v2 != null) {
                zM107H = m107H(abstractComponentCallbacksC0050v2);
            }
            if (zM107H) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m108J(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (abstractComponentCallbacksC0050v == null) {
            return true;
        }
        if (abstractComponentCallbacksC0050v.f219K) {
            return abstractComponentCallbacksC0050v.f209A == null || m108J(abstractComponentCallbacksC0050v.f212D);
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m109K(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (abstractComponentCallbacksC0050v == null) {
            return true;
        }
        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f209A;
        return abstractComponentCallbacksC0050v.equals(c0035n0.f137w) && m109K(c0035n0.f136v);
    }

    /* renamed from: Z */
    public static void m110Z(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (m106G(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0050v);
        }
        if (abstractComponentCallbacksC0050v.f216H) {
            abstractComponentCallbacksC0050v.f216H = false;
            abstractComponentCallbacksC0050v.f226R = !abstractComponentCallbacksC0050v.f226R;
        }
    }

    /* renamed from: A */
    public final AbstractComponentCallbacksC0050v m111A(int i) {
        C0022h c0022h = this.f117c;
        ArrayList arrayList = (ArrayList) c0022h.f78j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = (AbstractComponentCallbacksC0050v) arrayList.get(size);
            if (abstractComponentCallbacksC0050v != null && abstractComponentCallbacksC0050v.f213E == i) {
                return abstractComponentCallbacksC0050v;
            }
        }
        for (C0049u0 c0049u0 : ((HashMap) c0022h.f79k).values()) {
            if (c0049u0 != null) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = c0049u0.f205c;
                if (abstractComponentCallbacksC0050v2.f213E == i) {
                    return abstractComponentCallbacksC0050v2;
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    public final AbstractComponentCallbacksC0050v m112B(String str) {
        C0022h c0022h = this.f117c;
        ArrayList arrayList = (ArrayList) c0022h.f78j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = (AbstractComponentCallbacksC0050v) arrayList.get(size);
            if (abstractComponentCallbacksC0050v != null && str.equals(abstractComponentCallbacksC0050v.f215G)) {
                return abstractComponentCallbacksC0050v;
            }
        }
        for (C0049u0 c0049u0 : ((HashMap) c0022h.f79k).values()) {
            if (c0049u0 != null) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = c0049u0.f205c;
                if (str.equals(abstractComponentCallbacksC0050v2.f215G)) {
                    return abstractComponentCallbacksC0050v2;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public final ViewGroup m113C(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        ViewGroup viewGroup = abstractComponentCallbacksC0050v.f221M;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0050v.f214F <= 0 || !this.f135u.mo176V()) {
            return null;
        }
        View viewMo175U = this.f135u.mo175U(abstractComponentCallbacksC0050v.f214F);
        if (viewMo175U instanceof ViewGroup) {
            return (ViewGroup) viewMo175U;
        }
        return null;
    }

    /* renamed from: D */
    public final C0023h0 m114D() {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f136v;
        return abstractComponentCallbacksC0050v != null ? abstractComponentCallbacksC0050v.f209A.m114D() : this.f138x;
    }

    /* renamed from: E */
    public final C2819f m115E() {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f136v;
        return abstractComponentCallbacksC0050v != null ? abstractComponentCallbacksC0050v.f209A.m115E() : this.f139y;
    }

    /* renamed from: F */
    public final void m116F(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (m106G(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0050v);
        }
        if (abstractComponentCallbacksC0050v.f216H) {
            return;
        }
        abstractComponentCallbacksC0050v.f216H = true;
        abstractComponentCallbacksC0050v.f226R = true ^ abstractComponentCallbacksC0050v.f226R;
        m131Y(abstractComponentCallbacksC0050v);
    }

    /* renamed from: I */
    public final boolean m117I() {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f136v;
        if (abstractComponentCallbacksC0050v == null) {
            return true;
        }
        return abstractComponentCallbacksC0050v.m233n() && this.f136v.m229j().m117I();
    }

    /* renamed from: L */
    public final void m118L(int i, boolean z7) {
        C0058z c0058z;
        if (this.f134t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z7 || i != this.f133s) {
            this.f133s = i;
            C0022h c0022h = this.f117c;
            HashMap map = (HashMap) c0022h.f79k;
            ArrayList arrayList = (ArrayList) c0022h.f78j;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C0049u0 c0049u0 = (C0049u0) map.get(((AbstractComponentCallbacksC0050v) obj).f240n);
                if (c0049u0 != null) {
                    c0049u0.m210k();
                }
            }
            for (C0049u0 c0049u02 : map.values()) {
                if (c0049u02 != null) {
                    c0049u02.m210k();
                    AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u02.f205c;
                    if (abstractComponentCallbacksC0050v.f247u && !abstractComponentCallbacksC0050v.m235p()) {
                        c0022h.m82m(c0049u02);
                    }
                }
            }
            m133a0();
            if (this.f105D && (c0058z = this.f134t) != null && this.f133s == 7) {
                c0058z.f281t.invalidateOptionsMenu();
                this.f105D = false;
            }
        }
    }

    /* renamed from: M */
    public final void m119M() {
        if (this.f134t == null) {
            return;
        }
        this.f106E = false;
        this.f107F = false;
        this.f113L.f174g = false;
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null) {
                abstractComponentCallbacksC0050v.f211C.m119M();
            }
        }
    }

    /* renamed from: N */
    public final boolean m120N() {
        return m121O(-1, 0);
    }

    /* renamed from: O */
    public final boolean m121O(int i, int i4) {
        m159y(false);
        m158x(true);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f137w;
        if (abstractComponentCallbacksC0050v != null && i < 0 && abstractComponentCallbacksC0050v.m226g().m120N()) {
            return true;
        }
        boolean zM122P = m122P(this.f110I, this.f111J, i, i4);
        if (zM122P) {
            this.f116b = true;
            try {
                m124R(this.f110I, this.f111J);
            } finally {
                m138d();
            }
        }
        m137c0();
        m155u();
        ((HashMap) this.f117c.f79k).values().removeAll(Collections.singleton(null));
        return zM122P;
    }

    /* renamed from: P */
    public final boolean m122P(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        boolean z7 = (i4 & 1) != 0;
        ArrayList arrayList3 = this.f118d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z7 ? 0 : this.f118d.size() - 1;
            } else {
                int size2 = this.f118d.size() - 1;
                while (size2 >= 0) {
                    C0006a c0006a = (C0006a) this.f118d.get(size2);
                    if (i >= 0 && i == c0006a.f28r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z7) {
                    size = size2;
                    while (size > 0) {
                        C0006a c0006a2 = (C0006a) this.f118d.get(size - 1);
                        if (i < 0 || i != c0006a2.f28r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f118d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f118d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0006a) this.f118d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: Q */
    public final void m123Q(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (m106G(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0050v + " nesting=" + abstractComponentCallbacksC0050v.f252z);
        }
        boolean zM235p = abstractComponentCallbacksC0050v.m235p();
        if (abstractComponentCallbacksC0050v.f217I && zM235p) {
            return;
        }
        C0022h c0022h = this.f117c;
        synchronized (((ArrayList) c0022h.f78j)) {
            ((ArrayList) c0022h.f78j).remove(abstractComponentCallbacksC0050v);
        }
        abstractComponentCallbacksC0050v.f246t = false;
        if (m107H(abstractComponentCallbacksC0050v)) {
            this.f105D = true;
        }
        abstractComponentCallbacksC0050v.f247u = true;
        m131Y(abstractComponentCallbacksC0050v);
    }

    /* renamed from: R */
    public final void m124R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i < size) {
            if (!((C0006a) arrayList.get(i)).f25o) {
                if (i4 != i) {
                    m160z(arrayList, arrayList2, i4, i);
                }
                i4 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0006a) arrayList.get(i4)).f25o) {
                        i4++;
                    }
                }
                m160z(arrayList, arrayList2, i, i4);
                i = i4 - 1;
            }
            i++;
        }
        if (i4 != size) {
            m160z(arrayList, arrayList2, i4, size);
        }
    }

    /* renamed from: S */
    public final void m125S(Parcelable parcelable) {
        C0016e c0016e;
        int i;
        boolean z7;
        int i4;
        C0049u0 c0049u0;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f134t.f278q.getClassLoader());
                this.f125k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f134t.f278q.getClassLoader());
                arrayList.add((C0045s0) bundle.getParcelable("state"));
            }
        }
        C0022h c0022h = this.f117c;
        HashMap map = (HashMap) c0022h.f80l;
        HashMap map2 = (HashMap) c0022h.f79k;
        map.clear();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C0045s0 c0045s0 = (C0045s0) obj;
            map.put(c0045s0.f178k, c0045s0);
        }
        C0037o0 c0037o0 = (C0037o0) bundle3.getParcelable("state");
        if (c0037o0 == null) {
            return;
        }
        map2.clear();
        ArrayList arrayList2 = c0037o0.f144j;
        int size2 = arrayList2.size();
        int i9 = 0;
        while (true) {
            c0016e = this.f126l;
            i = 2;
            if (i9 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i9);
            i9++;
            C0045s0 c0045s02 = (C0045s0) ((HashMap) c0022h.f80l).remove((String) obj2);
            if (c0045s02 != null) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = (AbstractComponentCallbacksC0050v) this.f113L.f169b.get(c0045s02.f178k);
                if (abstractComponentCallbacksC0050v != null) {
                    if (m106G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0050v);
                    }
                    c0049u0 = new C0049u0(c0016e, c0022h, abstractComponentCallbacksC0050v, c0045s02);
                } else {
                    c0049u0 = new C0049u0(this.f126l, this.f117c, this.f134t.f278q.getClassLoader(), m114D(), c0045s02);
                }
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = c0049u0.f205c;
                abstractComponentCallbacksC0050v2.f209A = this;
                if (m106G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0050v2.f240n + "): " + abstractComponentCallbacksC0050v2);
                }
                c0049u0.m212m(this.f134t.f278q.getClassLoader());
                c0022h.m81l(c0049u0);
                c0049u0.f207e = this.f133s;
            }
        }
        C0041q0 c0041q0 = this.f113L;
        c0041q0.getClass();
        ArrayList arrayList3 = new ArrayList(c0041q0.f169b.values());
        int size3 = arrayList3.size();
        int i10 = 0;
        while (true) {
            z7 = true;
            if (i10 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i10);
            i10++;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v3 = (AbstractComponentCallbacksC0050v) obj3;
            if (map2.get(abstractComponentCallbacksC0050v3.f240n) == null) {
                if (m106G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0050v3 + " that was not found in the set of active Fragments " + c0037o0.f144j);
                }
                this.f113L.m194e(abstractComponentCallbacksC0050v3);
                abstractComponentCallbacksC0050v3.f209A = this;
                C0049u0 c0049u02 = new C0049u0(c0016e, c0022h, abstractComponentCallbacksC0050v3);
                c0049u02.f207e = 1;
                c0049u02.m210k();
                abstractComponentCallbacksC0050v3.f247u = true;
                c0049u02.m210k();
            }
        }
        ArrayList arrayList4 = c0037o0.f145k;
        ((ArrayList) c0022h.f78j).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i11 = 0;
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                String str3 = (String) obj4;
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM73c = c0022h.m73c(str3);
                if (abstractComponentCallbacksC0050vM73c == null) {
                    throw new IllegalStateException(AbstractC0008a1.m17m("No instantiated fragment for (", str3, ")"));
                }
                if (m106G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0050vM73c);
                }
                c0022h.m71a(abstractComponentCallbacksC0050vM73c);
            }
        }
        if (c0037o0.f146l != null) {
            this.f118d = new ArrayList(c0037o0.f146l.length);
            int i12 = 0;
            while (true) {
                C0009b[] c0009bArr = c0037o0.f146l;
                if (i12 >= c0009bArr.length) {
                    break;
                }
                C0009b c0009b = c0009bArr[i12];
                ArrayList arrayList5 = c0009b.f35k;
                C0006a c0006a = new C0006a(this);
                int[] iArr = c0009b.f34j;
                int i13 = 0;
                int i14 = 0;
                while (i13 < iArr.length) {
                    C0051v0 c0051v0 = new C0051v0();
                    int i15 = i13 + 1;
                    int i16 = i;
                    c0051v0.f253a = iArr[i13];
                    if (m106G(i16)) {
                        Log.v("FragmentManager", "Instantiate " + c0006a + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    c0051v0.f260h = EnumC0148n.values()[c0009b.f36l[i14]];
                    c0051v0.f261i = EnumC0148n.values()[c0009b.f37m[i14]];
                    int i17 = i13 + 2;
                    c0051v0.f255c = iArr[i15] != 0 ? z7 : false;
                    int i18 = iArr[i17];
                    c0051v0.f256d = i18;
                    int i19 = iArr[i13 + 3];
                    c0051v0.f257e = i19;
                    int i20 = i13 + 5;
                    int i21 = iArr[i13 + 4];
                    c0051v0.f258f = i21;
                    i13 += 6;
                    int[] iArr2 = iArr;
                    int i22 = iArr2[i20];
                    c0051v0.f259g = i22;
                    c0006a.f12b = i18;
                    c0006a.f13c = i19;
                    c0006a.f14d = i21;
                    c0006a.f15e = i22;
                    c0006a.m2b(c0051v0);
                    i14++;
                    i = i16;
                    iArr = iArr2;
                    z7 = true;
                }
                int i23 = i;
                c0006a.f16f = c0009b.f38n;
                c0006a.f18h = c0009b.f39o;
                c0006a.f17g = true;
                c0006a.f19i = c0009b.f41q;
                c0006a.f20j = c0009b.f42r;
                c0006a.f21k = c0009b.f43s;
                c0006a.f22l = c0009b.f44t;
                c0006a.f23m = c0009b.f45u;
                c0006a.f24n = c0009b.f46v;
                c0006a.f25o = c0009b.f47w;
                c0006a.f28r = c0009b.f40p;
                for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                    String str4 = (String) arrayList5.get(i24);
                    if (str4 != null) {
                        ((C0051v0) c0006a.f11a.get(i24)).f254b = c0022h.m73c(str4);
                    }
                }
                c0006a.m3c(1);
                if (m106G(i23)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i12 + " (index " + c0006a.f28r + "): " + c0006a);
                    PrintWriter printWriter = new PrintWriter(new C0055x0());
                    c0006a.m4d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f118d.add(c0006a);
                i12++;
                i = i23;
                z7 = true;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.f118d = null;
        }
        this.f123i.set(c0037o0.f147m);
        String str5 = c0037o0.f148n;
        if (str5 != null) {
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM73c2 = c0022h.m73c(str5);
            this.f137w = abstractComponentCallbacksC0050vM73c2;
            m151q(abstractComponentCallbacksC0050vM73c2);
        }
        ArrayList arrayList6 = c0037o0.f149o;
        if (arrayList6 != null) {
            while (i4 < arrayList6.size()) {
                this.f124j.put((String) arrayList6.get(i4), (C0012c) c0037o0.f150p.get(i4));
                i4++;
            }
        }
        this.f104C = new ArrayDeque(c0037o0.f151q);
    }

    /* renamed from: T */
    public final Bundle m126T() {
        int i;
        ArrayList arrayList;
        C0009b[] c0009bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m139e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C0030l c0030l = (C0030l) it.next();
            if (c0030l.f97e) {
                if (m106G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0030l.f97e = false;
                c0030l.m102c();
            }
        }
        Iterator it2 = m139e().iterator();
        while (it2.hasNext()) {
            ((C0030l) it2.next()).m104e();
        }
        m159y(true);
        this.f106E = true;
        this.f113L.f174g = true;
        C0022h c0022h = this.f117c;
        c0022h.getClass();
        HashMap map = (HashMap) c0022h.f79k;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0049u0 c0049u0 = (C0049u0) it3.next();
            if (c0049u0 != null) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
                C0045s0 c0045s0 = new C0045s0(abstractComponentCallbacksC0050v);
                if (abstractComponentCallbacksC0050v.f236j <= -1 || c0045s0.f189v != null) {
                    c0045s0.f189v = abstractComponentCallbacksC0050v.f237k;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0050v.mo189y(bundle2);
                    abstractComponentCallbacksC0050v.f233Y.m3890f(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0050v.f211C.m126T());
                    c0049u0.f203a.m63t(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC0050v.f222N != null) {
                        c0049u0.m214o();
                    }
                    if (abstractComponentCallbacksC0050v.f238l != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0050v.f238l);
                    }
                    if (abstractComponentCallbacksC0050v.f239m != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC0050v.f239m);
                    }
                    if (!abstractComponentCallbacksC0050v.f224P) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0050v.f224P);
                    }
                    c0045s0.f189v = bundle3;
                    if (abstractComponentCallbacksC0050v.f243q != null) {
                        if (bundle3 == null) {
                            c0045s0.f189v = new Bundle();
                        }
                        c0045s0.f189v.putString("android:target_state", abstractComponentCallbacksC0050v.f243q);
                        int i4 = abstractComponentCallbacksC0050v.f244r;
                        if (i4 != 0) {
                            c0045s0.f189v.putInt("android:target_req_state", i4);
                        }
                    }
                }
                arrayList2.add(abstractComponentCallbacksC0050v.f240n);
                if (m106G(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0050v + ": " + abstractComponentCallbacksC0050v.f237k);
                }
            }
        }
        C0022h c0022h2 = this.f117c;
        c0022h2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) c0022h2.f80l).values());
        if (!arrayList3.isEmpty()) {
            C0022h c0022h3 = this.f117c;
            synchronized (((ArrayList) c0022h3.f78j)) {
                try {
                    if (((ArrayList) c0022h3.f78j).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c0022h3.f78j).size());
                        ArrayList arrayList4 = (ArrayList) c0022h3.f78j;
                        int size2 = arrayList4.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj = arrayList4.get(i8);
                            i8++;
                            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = (AbstractComponentCallbacksC0050v) obj;
                            arrayList.add(abstractComponentCallbacksC0050v2.f240n);
                            if (m106G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0050v2.f240n + "): " + abstractComponentCallbacksC0050v2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.f118d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                c0009bArr = null;
            } else {
                c0009bArr = new C0009b[size];
                for (int i9 = 0; i9 < size; i9++) {
                    c0009bArr[i9] = new C0009b((C0006a) this.f118d.get(i9));
                    if (m106G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i9 + ": " + this.f118d.get(i9));
                    }
                }
            }
            C0037o0 c0037o0 = new C0037o0();
            c0037o0.f148n = null;
            ArrayList arrayList6 = new ArrayList();
            c0037o0.f149o = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            c0037o0.f150p = arrayList7;
            c0037o0.f144j = arrayList2;
            c0037o0.f145k = arrayList;
            c0037o0.f146l = c0009bArr;
            c0037o0.f147m = this.f123i.get();
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v3 = this.f137w;
            if (abstractComponentCallbacksC0050v3 != null) {
                c0037o0.f148n = abstractComponentCallbacksC0050v3.f240n;
            }
            arrayList6.addAll(this.f124j.keySet());
            arrayList7.addAll(this.f124j.values());
            c0037o0.f151q = new ArrayList(this.f104C);
            bundle.putParcelable("state", c0037o0);
            for (String str : this.f125k.keySet()) {
                bundle.putBundle(AbstractC0008a1.m25u("result_", str), (Bundle) this.f125k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                C0045s0 c0045s02 = (C0045s0) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", c0045s02);
                bundle.putBundle("fragment_" + c0045s02.f178k, bundle4);
            }
        } else if (m106G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* renamed from: U */
    public final void m127U() {
        synchronized (this.f115a) {
            try {
                if (this.f115a.size() == 1) {
                    this.f134t.f279r.removeCallbacks(this.f114M);
                    this.f134t.f279r.post(this.f114M);
                    m137c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: V */
    public final void m128V(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v, boolean z7) {
        ViewGroup viewGroupM113C = m113C(abstractComponentCallbacksC0050v);
        if (viewGroupM113C == null || !(viewGroupM113C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM113C).setDrawDisappearingViewsLast(!z7);
    }

    /* renamed from: W */
    public final void m129W(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v, EnumC0148n enumC0148n) {
        if (abstractComponentCallbacksC0050v.equals(this.f117c.m73c(abstractComponentCallbacksC0050v.f240n)) && (abstractComponentCallbacksC0050v.f210B == null || abstractComponentCallbacksC0050v.f209A == this)) {
            abstractComponentCallbacksC0050v.f229U = enumC0148n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0050v + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: X */
    public final void m130X(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (abstractComponentCallbacksC0050v != null) {
            if (!abstractComponentCallbacksC0050v.equals(this.f117c.m73c(abstractComponentCallbacksC0050v.f240n)) || (abstractComponentCallbacksC0050v.f210B != null && abstractComponentCallbacksC0050v.f209A != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0050v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = this.f137w;
        this.f137w = abstractComponentCallbacksC0050v;
        m151q(abstractComponentCallbacksC0050v2);
        m151q(this.f137w);
    }

    /* renamed from: Y */
    public final void m131Y(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        ViewGroup viewGroupM113C = m113C(abstractComponentCallbacksC0050v);
        if (viewGroupM113C != null) {
            C0046t c0046t = abstractComponentCallbacksC0050v.f225Q;
            if ((c0046t == null ? 0 : c0046t.f194e) + (c0046t == null ? 0 : c0046t.f193d) + (c0046t == null ? 0 : c0046t.f192c) + (c0046t == null ? 0 : c0046t.f191b) > 0) {
                if (viewGroupM113C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM113C.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0050v);
                }
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = (AbstractComponentCallbacksC0050v) viewGroupM113C.getTag(R.id.visible_removing_fragment_view_tag);
                C0046t c0046t2 = abstractComponentCallbacksC0050v.f225Q;
                boolean z7 = c0046t2 != null ? c0046t2.f190a : false;
                if (abstractComponentCallbacksC0050v2.f225Q == null) {
                    return;
                }
                abstractComponentCallbacksC0050v2.m225f().f190a = z7;
            }
        }
    }

    /* renamed from: a */
    public final C0049u0 m132a(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        String str = abstractComponentCallbacksC0050v.f228T;
        if (str != null) {
            AbstractC0548c.m1279c(abstractComponentCallbacksC0050v, str);
        }
        if (m106G(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0050v);
        }
        C0049u0 c0049u0M140f = m140f(abstractComponentCallbacksC0050v);
        abstractComponentCallbacksC0050v.f209A = this;
        C0022h c0022h = this.f117c;
        c0022h.m81l(c0049u0M140f);
        if (!abstractComponentCallbacksC0050v.f217I) {
            c0022h.m71a(abstractComponentCallbacksC0050v);
            abstractComponentCallbacksC0050v.f247u = false;
            if (abstractComponentCallbacksC0050v.f222N == null) {
                abstractComponentCallbacksC0050v.f226R = false;
            }
            if (m107H(abstractComponentCallbacksC0050v)) {
                this.f105D = true;
            }
        }
        return c0049u0M140f;
    }

    /* renamed from: a0 */
    public final void m133a0() {
        ArrayList arrayListM78i = this.f117c.m78i();
        int size = arrayListM78i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM78i.get(i);
            i++;
            C0049u0 c0049u0 = (C0049u0) obj;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
            if (abstractComponentCallbacksC0050v.f223O) {
                if (this.f116b) {
                    this.f109H = true;
                } else {
                    abstractComponentCallbacksC0050v.f223O = false;
                    c0049u0.m210k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m134b(C0058z c0058z, AbstractC0714c abstractC0714c, AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (this.f134t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f134t = c0058z;
        this.f135u = abstractC0714c;
        this.f136v = abstractComponentCallbacksC0050v;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f127m;
        if (abstractComponentCallbacksC0050v != 0) {
            copyOnWriteArrayList.add(new C0025i0(abstractComponentCallbacksC0050v));
        } else if (c0058z != null) {
            copyOnWriteArrayList.add(c0058z);
        }
        if (this.f136v != null) {
            m137c0();
        }
        if (c0058z != null) {
            C0534x c0534xM1247i = c0058z.f281t.m1247i();
            this.f121g = c0534xM1247i;
            c0534xM1247i.m1255a(abstractComponentCallbacksC0050v != 0 ? abstractComponentCallbacksC0050v : c0058z, this.f122h);
        }
        if (abstractComponentCallbacksC0050v != 0) {
            C0041q0 c0041q0 = abstractComponentCallbacksC0050v.f209A.f113L;
            HashMap map = c0041q0.f170c;
            C0041q0 c0041q02 = (C0041q0) map.get(abstractComponentCallbacksC0050v.f240n);
            if (c0041q02 == null) {
                c0041q02 = new C0041q0(c0041q0.f172e);
                map.put(abstractComponentCallbacksC0050v.f240n, c0041q02);
            }
            this.f113L = c0041q02;
        } else if (c0058z != null) {
            this.f113L = (C0041q0) new C0036o(c0058z.f281t.mo222b(), C0041q0.f168h).m172o(C0041q0.class);
        } else {
            this.f113L = new C0041q0(false);
        }
        C0041q0 c0041q03 = this.f113L;
        c0041q03.f174g = this.f106E || this.f107F;
        this.f117c.f81m = c0041q03;
        C0058z c0058z2 = this.f134t;
        if (c0058z2 != null && abstractComponentCallbacksC0050v == 0) {
            C0067e c0067eMo223c = c0058z2.mo223c();
            c0067eMo223c.m254e("android:support:fragments", new C0052w(2, this));
            Bundle bundleM252c = c0067eMo223c.m252c("android:support:fragments");
            if (bundleM252c != null) {
                m125S(bundleM252c);
            }
        }
        C0058z c0058z3 = this.f134t;
        if (c0058z3 != null) {
            C0520j c0520j = c0058z3.f281t.f2144q;
            String strM25u = AbstractC0008a1.m25u("FragmentManager:", abstractComponentCallbacksC0050v != 0 ? AbstractC0008a1.m18n(new StringBuilder(), abstractComponentCallbacksC0050v.f240n, ":") : C2181z.FRAGMENT_ENCODE_SET);
            this.f140z = c0520j.m1243b(AbstractC0008a1.m16l(strM25u, "StartActivityForResult"), new C0027j0(2), new C0017e0(this, 1));
            this.f102A = c0520j.m1243b(AbstractC0008a1.m16l(strM25u, "StartIntentSenderForResult"), new C0027j0(0), new C0017e0(this, 2));
            this.f103B = c0520j.m1243b(AbstractC0008a1.m16l(strM25u, "RequestPermissions"), new C0027j0(1), new C0017e0(this, 0));
        }
        C0058z c0058z4 = this.f134t;
        if (c0058z4 != null) {
            c0058z4.f281t.m1245g(this.f128n);
        }
        C0058z c0058z5 = this.f134t;
        if (c0058z5 != null) {
            AbstractActivityC1083i abstractActivityC1083i = c0058z5.f281t;
            abstractActivityC1083i.getClass();
            C0015d0 c0015d0 = this.f129o;
            AbstractC2980h.m5136e("listener", c0015d0);
            abstractActivityC1083i.f2146s.add(c0015d0);
        }
        C0058z c0058z6 = this.f134t;
        if (c0058z6 != null) {
            AbstractActivityC1083i abstractActivityC1083i2 = c0058z6.f281t;
            abstractActivityC1083i2.getClass();
            C0015d0 c0015d02 = this.f130p;
            AbstractC2980h.m5136e("listener", c0015d02);
            abstractActivityC1083i2.f2148u.add(c0015d02);
        }
        C0058z c0058z7 = this.f134t;
        if (c0058z7 != null) {
            AbstractActivityC1083i abstractActivityC1083i3 = c0058z7.f281t;
            abstractActivityC1083i3.getClass();
            C0015d0 c0015d03 = this.f131q;
            AbstractC2980h.m5136e("listener", c0015d03);
            abstractActivityC1083i3.f2149v.add(c0015d03);
        }
        C0058z c0058z8 = this.f134t;
        if (c0058z8 == null || abstractComponentCallbacksC0050v != 0) {
            return;
        }
        AbstractActivityC1083i abstractActivityC1083i4 = c0058z8.f281t;
        abstractActivityC1083i4.getClass();
        C0021g0 c0021g0 = this.f132r;
        AbstractC2980h.m5136e("provider", c0021g0);
        C0073c c0073c = abstractActivityC1083i4.f2139l;
        ((CopyOnWriteArrayList) c0073c.f326m).add(c0021g0);
        ((Runnable) c0073c.f325l).run();
    }

    /* renamed from: b0 */
    public final void m135b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0055x0());
        C0058z c0058z = this.f134t;
        if (c0058z == null) {
            try {
                m156v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c0058z.f281t.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw illegalStateException;
        }
    }

    /* renamed from: c */
    public final void m136c(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (m106G(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0050v);
        }
        if (abstractComponentCallbacksC0050v.f217I) {
            abstractComponentCallbacksC0050v.f217I = false;
            if (abstractComponentCallbacksC0050v.f246t) {
                return;
            }
            this.f117c.m71a(abstractComponentCallbacksC0050v);
            if (m106G(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0050v);
            }
            if (m107H(abstractComponentCallbacksC0050v)) {
                this.f105D = true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [y6.a, z6.g] */
    /* JADX WARN: Type inference failed for: r1v10, types: [y6.a, z6.g] */
    /* renamed from: c0 */
    public final void m137c0() {
        synchronized (this.f115a) {
            try {
                if (!this.f115a.isEmpty()) {
                    C0019f0 c0019f0 = this.f122h;
                    c0019f0.f68a = true;
                    ?? r1 = c0019f0.f70c;
                    if (r1 != 0) {
                        r1.invoke();
                    }
                    return;
                }
                C0019f0 c0019f02 = this.f122h;
                ArrayList arrayList = this.f118d;
                c0019f02.f68a = (arrayList != null ? arrayList.size() : 0) > 0 && m109K(this.f136v);
                ?? r02 = c0019f02.f70c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m138d() {
        this.f116b = false;
        this.f111J.clear();
        this.f110I.clear();
    }

    /* renamed from: e */
    public final HashSet m139e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListM78i = this.f117c.m78i();
        int size = arrayListM78i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM78i.get(i);
            i++;
            ViewGroup viewGroup = ((C0049u0) obj).f205c.f221M;
            if (viewGroup != null) {
                hashSet.add(C0030l.m99f(viewGroup, m115E()));
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public final C0049u0 m140f(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        String str = abstractComponentCallbacksC0050v.f240n;
        C0022h c0022h = this.f117c;
        C0049u0 c0049u0 = (C0049u0) ((HashMap) c0022h.f79k).get(str);
        if (c0049u0 != null) {
            return c0049u0;
        }
        C0049u0 c0049u02 = new C0049u0(this.f126l, c0022h, abstractComponentCallbacksC0050v);
        c0049u02.m212m(this.f134t.f278q.getClassLoader());
        c0049u02.f207e = this.f133s;
        return c0049u02;
    }

    /* renamed from: g */
    public final void m141g(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (m106G(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0050v);
        }
        if (abstractComponentCallbacksC0050v.f217I) {
            return;
        }
        abstractComponentCallbacksC0050v.f217I = true;
        if (abstractComponentCallbacksC0050v.f246t) {
            if (m106G(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0050v);
            }
            C0022h c0022h = this.f117c;
            synchronized (((ArrayList) c0022h.f78j)) {
                ((ArrayList) c0022h.f78j).remove(abstractComponentCallbacksC0050v);
            }
            abstractComponentCallbacksC0050v.f246t = false;
            if (m107H(abstractComponentCallbacksC0050v)) {
                this.f105D = true;
            }
            m131Y(abstractComponentCallbacksC0050v);
        }
    }

    /* renamed from: h */
    public final void m142h(boolean z7) {
        if (z7 && this.f134t != null) {
            m135b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null) {
                abstractComponentCallbacksC0050v.f220L = true;
                if (z7) {
                    abstractComponentCallbacksC0050v.f211C.m142h(true);
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m143i() {
        if (this.f133s >= 1) {
            for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
                if (abstractComponentCallbacksC0050v != null) {
                    if (!abstractComponentCallbacksC0050v.f216H ? abstractComponentCallbacksC0050v.f211C.m143i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m144j() {
        if (this.f133s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z7 = false;
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null && m108J(abstractComponentCallbacksC0050v)) {
                if (!abstractComponentCallbacksC0050v.f216H ? abstractComponentCallbacksC0050v.f211C.m144j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0050v);
                    z7 = true;
                }
            }
        }
        if (this.f119e != null) {
            for (int i = 0; i < this.f119e.size(); i++) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = (AbstractComponentCallbacksC0050v) this.f119e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0050v2)) {
                    abstractComponentCallbacksC0050v2.getClass();
                }
            }
        }
        this.f119e = arrayList;
        return z7;
    }

    /* renamed from: k */
    public final void m145k() {
        boolean zIsChangingConfigurations = true;
        this.f108G = true;
        m159y(true);
        Iterator it = m139e().iterator();
        while (it.hasNext()) {
            ((C0030l) it.next()).m104e();
        }
        C0058z c0058z = this.f134t;
        C0022h c0022h = this.f117c;
        if (c0058z != null) {
            zIsChangingConfigurations = ((C0041q0) c0022h.f81m).f173f;
        } else {
            AbstractActivityC1083i abstractActivityC1083i = c0058z.f278q;
            if (abstractActivityC1083i != null) {
                zIsChangingConfigurations = true ^ abstractActivityC1083i.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f124j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C0012c) it2.next()).f50j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    C0041q0 c0041q0 = (C0041q0) c0022h.f81m;
                    c0041q0.getClass();
                    if (m106G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c0041q0.m193d(str);
                }
            }
        }
        m154t(-1);
        C0058z c0058z2 = this.f134t;
        if (c0058z2 != null) {
            AbstractActivityC1083i abstractActivityC1083i2 = c0058z2.f281t;
            abstractActivityC1083i2.getClass();
            C0015d0 c0015d0 = this.f129o;
            AbstractC2980h.m5136e("listener", c0015d0);
            abstractActivityC1083i2.f2146s.remove(c0015d0);
        }
        C0058z c0058z3 = this.f134t;
        if (c0058z3 != null) {
            AbstractActivityC1083i abstractActivityC1083i3 = c0058z3.f281t;
            abstractActivityC1083i3.getClass();
            C0015d0 c0015d02 = this.f128n;
            AbstractC2980h.m5136e("listener", c0015d02);
            abstractActivityC1083i3.f2145r.remove(c0015d02);
        }
        C0058z c0058z4 = this.f134t;
        if (c0058z4 != null) {
            AbstractActivityC1083i abstractActivityC1083i4 = c0058z4.f281t;
            abstractActivityC1083i4.getClass();
            C0015d0 c0015d03 = this.f130p;
            AbstractC2980h.m5136e("listener", c0015d03);
            abstractActivityC1083i4.f2148u.remove(c0015d03);
        }
        C0058z c0058z5 = this.f134t;
        if (c0058z5 != null) {
            AbstractActivityC1083i abstractActivityC1083i5 = c0058z5.f281t;
            abstractActivityC1083i5.getClass();
            C0015d0 c0015d04 = this.f131q;
            AbstractC2980h.m5136e("listener", c0015d04);
            abstractActivityC1083i5.f2149v.remove(c0015d04);
        }
        C0058z c0058z6 = this.f134t;
        if (c0058z6 != null) {
            AbstractActivityC1083i abstractActivityC1083i6 = c0058z6.f281t;
            abstractActivityC1083i6.getClass();
            C0021g0 c0021g0 = this.f132r;
            AbstractC2980h.m5136e("provider", c0021g0);
            C0073c c0073c = abstractActivityC1083i6.f2139l;
            ((CopyOnWriteArrayList) c0073c.f326m).remove(c0021g0);
            if (((HashMap) c0073c.f324k).remove(c0021g0) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0073c.f325l).run();
        }
        this.f134t = null;
        this.f135u = null;
        this.f136v = null;
        if (this.f121g != null) {
            Iterator it3 = this.f122h.f69b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0513c) it3.next()).cancel();
            }
            this.f121g = null;
        }
        C0016e c0016e = this.f140z;
        if (c0016e != null) {
            c0016e.m43M();
            this.f102A.m43M();
            this.f103B.m43M();
        }
    }

    /* renamed from: l */
    public final void m146l(boolean z7) {
        if (z7 && this.f134t != null) {
            m135b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null) {
                abstractComponentCallbacksC0050v.f220L = true;
                if (z7) {
                    abstractComponentCallbacksC0050v.f211C.m146l(true);
                }
            }
        }
    }

    /* renamed from: m */
    public final void m147m(boolean z7) {
        if (z7 && this.f134t != null) {
            m135b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null && z7) {
                abstractComponentCallbacksC0050v.f211C.m147m(true);
            }
        }
    }

    /* renamed from: n */
    public final void m148n() {
        ArrayList arrayListM79j = this.f117c.m79j();
        int size = arrayListM79j.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM79j.get(i);
            i++;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = (AbstractComponentCallbacksC0050v) obj;
            if (abstractComponentCallbacksC0050v != null) {
                abstractComponentCallbacksC0050v.m234o();
                abstractComponentCallbacksC0050v.f211C.m148n();
            }
        }
    }

    /* renamed from: o */
    public final boolean m149o() {
        if (this.f133s >= 1) {
            for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
                if (abstractComponentCallbacksC0050v != null) {
                    if (!abstractComponentCallbacksC0050v.f216H ? abstractComponentCallbacksC0050v.f211C.m149o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m150p() {
        if (this.f133s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null && !abstractComponentCallbacksC0050v.f216H) {
                abstractComponentCallbacksC0050v.f211C.m150p();
            }
        }
    }

    /* renamed from: q */
    public final void m151q(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (abstractComponentCallbacksC0050v != null) {
            if (abstractComponentCallbacksC0050v.equals(this.f117c.m73c(abstractComponentCallbacksC0050v.f240n))) {
                abstractComponentCallbacksC0050v.f209A.getClass();
                boolean zM109K = m109K(abstractComponentCallbacksC0050v);
                Boolean bool = abstractComponentCallbacksC0050v.f245s;
                if (bool == null || bool.booleanValue() != zM109K) {
                    abstractComponentCallbacksC0050v.f245s = Boolean.valueOf(zM109K);
                    C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f211C;
                    c0035n0.m137c0();
                    c0035n0.m151q(c0035n0.f137w);
                }
            }
        }
    }

    /* renamed from: r */
    public final void m152r(boolean z7) {
        if (z7 && this.f134t != null) {
            m135b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null && z7) {
                abstractComponentCallbacksC0050v.f211C.m152r(true);
            }
        }
    }

    /* renamed from: s */
    public final boolean m153s() {
        if (this.f133s < 1) {
            return false;
        }
        boolean z7 = false;
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : this.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null && m108J(abstractComponentCallbacksC0050v)) {
                if (!abstractComponentCallbacksC0050v.f216H ? abstractComponentCallbacksC0050v.f211C.m153s() : false) {
                    z7 = true;
                }
            }
        }
        return z7;
    }

    /* renamed from: t */
    public final void m154t(int i) {
        try {
            this.f116b = true;
            for (C0049u0 c0049u0 : ((HashMap) this.f117c.f79k).values()) {
                if (c0049u0 != null) {
                    c0049u0.f207e = i;
                }
            }
            m118L(i, false);
            Iterator it = m139e().iterator();
            while (it.hasNext()) {
                ((C0030l) it.next()).m104e();
            }
            this.f116b = false;
            m159y(true);
        } catch (Throwable th) {
            this.f116b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f136v;
        if (abstractComponentCallbacksC0050v != null) {
            sb.append(abstractComponentCallbacksC0050v.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f136v)));
            sb.append("}");
        } else {
            C0058z c0058z = this.f134t;
            if (c0058z != null) {
                sb.append(c0058z.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f134t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m155u() {
        if (this.f109H) {
            this.f109H = false;
            m133a0();
        }
    }

    /* renamed from: v */
    public final void m156v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strM16l = AbstractC0008a1.m16l(str, "    ");
        C0022h c0022h = this.f117c;
        ArrayList arrayList = (ArrayList) c0022h.f78j;
        String strM16l2 = AbstractC0008a1.m16l(str, "    ");
        HashMap map = (HashMap) c0022h.f79k;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0049u0 c0049u0 : map.values()) {
                printWriter.print(str);
                if (c0049u0 != null) {
                    AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
                    printWriter.println(abstractComponentCallbacksC0050v);
                    abstractComponentCallbacksC0050v.getClass();
                    printWriter.print(strM16l2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0050v.f213E));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0050v.f214F));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0050v.f215G);
                    printWriter.print(strM16l2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0050v.f236j);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0050v.f240n);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0050v.f252z);
                    printWriter.print(strM16l2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0050v.f246t);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0050v.f247u);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0050v.f248v);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0050v.f249w);
                    printWriter.print(strM16l2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0050v.f216H);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0050v.f217I);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0050v.f219K);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM16l2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0050v.f218J);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0050v.f224P);
                    if (abstractComponentCallbacksC0050v.f209A != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0050v.f209A);
                    }
                    if (abstractComponentCallbacksC0050v.f210B != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0050v.f210B);
                    }
                    if (abstractComponentCallbacksC0050v.f212D != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0050v.f212D);
                    }
                    if (abstractComponentCallbacksC0050v.f241o != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0050v.f241o);
                    }
                    if (abstractComponentCallbacksC0050v.f237k != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0050v.f237k);
                    }
                    if (abstractComponentCallbacksC0050v.f238l != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0050v.f238l);
                    }
                    if (abstractComponentCallbacksC0050v.f239m != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0050v.f239m);
                    }
                    Object objM73c = abstractComponentCallbacksC0050v.f242p;
                    if (objM73c == null) {
                        C0035n0 c0035n0 = abstractComponentCallbacksC0050v.f209A;
                        objM73c = (c0035n0 == null || (str2 = abstractComponentCallbacksC0050v.f243q) == null) ? null : c0035n0.f117c.m73c(str2);
                    }
                    if (objM73c != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM73c);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0050v.f244r);
                    }
                    printWriter.print(strM16l2);
                    printWriter.print("mPopDirection=");
                    C0046t c0046t = abstractComponentCallbacksC0050v.f225Q;
                    printWriter.println(c0046t == null ? false : c0046t.f190a);
                    C0046t c0046t2 = abstractComponentCallbacksC0050v.f225Q;
                    if ((c0046t2 == null ? 0 : c0046t2.f191b) != 0) {
                        printWriter.print(strM16l2);
                        printWriter.print("getEnterAnim=");
                        C0046t c0046t3 = abstractComponentCallbacksC0050v.f225Q;
                        printWriter.println(c0046t3 == null ? 0 : c0046t3.f191b);
                    }
                    C0046t c0046t4 = abstractComponentCallbacksC0050v.f225Q;
                    if ((c0046t4 == null ? 0 : c0046t4.f192c) != 0) {
                        printWriter.print(strM16l2);
                        printWriter.print("getExitAnim=");
                        C0046t c0046t5 = abstractComponentCallbacksC0050v.f225Q;
                        printWriter.println(c0046t5 == null ? 0 : c0046t5.f192c);
                    }
                    C0046t c0046t6 = abstractComponentCallbacksC0050v.f225Q;
                    if ((c0046t6 == null ? 0 : c0046t6.f193d) != 0) {
                        printWriter.print(strM16l2);
                        printWriter.print("getPopEnterAnim=");
                        C0046t c0046t7 = abstractComponentCallbacksC0050v.f225Q;
                        printWriter.println(c0046t7 == null ? 0 : c0046t7.f193d);
                    }
                    C0046t c0046t8 = abstractComponentCallbacksC0050v.f225Q;
                    if ((c0046t8 == null ? 0 : c0046t8.f194e) != 0) {
                        printWriter.print(strM16l2);
                        printWriter.print("getPopExitAnim=");
                        C0046t c0046t9 = abstractComponentCallbacksC0050v.f225Q;
                        printWriter.println(c0046t9 == null ? 0 : c0046t9.f194e);
                    }
                    if (abstractComponentCallbacksC0050v.f221M != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0050v.f221M);
                    }
                    if (abstractComponentCallbacksC0050v.f222N != null) {
                        printWriter.print(strM16l2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0050v.f222N);
                    }
                    if (abstractComponentCallbacksC0050v.m227h() != null) {
                        C2193l c2193l = ((C0931a) new C0036o(abstractComponentCallbacksC0050v.mo222b(), C0931a.f3994c).m172o(C0931a.class)).f3995b;
                        if (c2193l.f7659l > 0) {
                            printWriter.print(strM16l2);
                            printWriter.println("Loaders:");
                            if (c2193l.f7659l > 0) {
                                if (c2193l.f7658k[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strM16l2);
                                printWriter.print("  #");
                                printWriter.print(c2193l.f7657j[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strM16l2);
                    printWriter.println("Child " + abstractComponentCallbacksC0050v.f211C + ":");
                    abstractComponentCallbacksC0050v.f211C.m156v(AbstractC0008a1.m16l(strM16l2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = (AbstractComponentCallbacksC0050v) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0050v2.toString());
            }
        }
        ArrayList arrayList2 = this.f119e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v3 = (AbstractComponentCallbacksC0050v) this.f119e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0050v3.toString());
            }
        }
        ArrayList arrayList3 = this.f118d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                C0006a c0006a = (C0006a) this.f118d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c0006a.toString());
                c0006a.m4d(strM16l, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f123i.get());
        synchronized (this.f115a) {
            try {
                int size4 = this.f115a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size4; i9++) {
                        Object obj = (InterfaceC0031l0) this.f115a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f134t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f135u);
        if (this.f136v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f136v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f133s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f106E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f107F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f108G);
        if (this.f105D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f105D);
        }
    }

    /* renamed from: w */
    public final void m157w(InterfaceC0031l0 interfaceC0031l0, boolean z7) {
        if (!z7) {
            if (this.f134t == null) {
                if (!this.f108G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f106E || this.f107F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f115a) {
            try {
                if (this.f134t == null) {
                    if (!z7) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f115a.add(interfaceC0031l0);
                    m127U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: x */
    public final void m158x(boolean z7) {
        if (this.f116b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f134t == null) {
            if (!this.f108G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f134t.f279r.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7 && (this.f106E || this.f107F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f110I == null) {
            this.f110I = new ArrayList();
            this.f111J = new ArrayList();
        }
    }

    /* renamed from: y */
    public final boolean m159y(boolean z7) {
        boolean zMo1a;
        m158x(z7);
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f110I;
            ArrayList arrayList2 = this.f111J;
            synchronized (this.f115a) {
                if (this.f115a.isEmpty()) {
                    zMo1a = false;
                } else {
                    try {
                        int size = this.f115a.size();
                        zMo1a = false;
                        for (int i = 0; i < size; i++) {
                            zMo1a |= ((InterfaceC0031l0) this.f115a.get(i)).mo1a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo1a) {
                m137c0();
                m155u();
                ((HashMap) this.f117c.f79k).values().removeAll(Collections.singleton(null));
                return z8;
            }
            z8 = true;
            this.f116b = true;
            try {
                m124R(this.f110I, this.f111J);
            } finally {
                m138d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[PHI: r14
      0x022b: PHI (r14v23 int) = (r14v22 int), (r14v24 int) binds: [B:103:0x021b, B:108:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m160z(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        ViewGroup viewGroup;
        boolean z7;
        int i8;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        C0022h c0022h = this.f117c;
        boolean z12 = ((C0006a) arrayList.get(i)).f25o;
        ArrayList arrayList3 = this.f112K;
        if (arrayList3 == null) {
            this.f112K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f112K.addAll(c0022h.m80k());
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f137w;
        int i12 = i;
        boolean z13 = false;
        while (true) {
            int i13 = 1;
            if (i12 >= i4) {
                boolean z14 = z12;
                this.f112K.clear();
                if (!z14 && this.f133s >= 1) {
                    for (int i14 = i; i14 < i4; i14++) {
                        ArrayList arrayList4 = ((C0006a) arrayList.get(i14)).f11a;
                        int size = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = arrayList4.get(i15);
                            i15++;
                            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = ((C0051v0) obj).f254b;
                            if (abstractComponentCallbacksC0050v2 != null && abstractComponentCallbacksC0050v2.f209A != null) {
                                c0022h.m81l(m140f(abstractComponentCallbacksC0050v2));
                            }
                        }
                    }
                }
                for (int i16 = i; i16 < i4; i16++) {
                    C0006a c0006a = (C0006a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                        c0006a.m3c(-1);
                        C0035n0 c0035n0 = c0006a.f26p;
                        ArrayList arrayList5 = c0006a.f11a;
                        boolean z15 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            C0051v0 c0051v0 = (C0051v0) arrayList5.get(size2);
                            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v3 = c0051v0.f254b;
                            if (abstractComponentCallbacksC0050v3 != null) {
                                if (abstractComponentCallbacksC0050v3.f225Q != null) {
                                    abstractComponentCallbacksC0050v3.m225f().f190a = z15;
                                }
                                int i17 = c0006a.f16f;
                                int i18 = 8194;
                                int i19 = 4097;
                                if (i17 != 4097) {
                                    if (i17 != 8194) {
                                        i18 = 4100;
                                        i19 = 8197;
                                        if (i17 != 8197) {
                                            i18 = i17 != 4099 ? i17 != 4100 ? 0 : i19 : 4099;
                                        }
                                    }
                                }
                                if (abstractComponentCallbacksC0050v3.f225Q != null || i18 != 0) {
                                    abstractComponentCallbacksC0050v3.m225f();
                                    abstractComponentCallbacksC0050v3.f225Q.f195f = i18;
                                }
                                abstractComponentCallbacksC0050v3.m225f();
                                abstractComponentCallbacksC0050v3.f225Q.getClass();
                            }
                            switch (c0051v0.f253a) {
                                case 1:
                                    abstractComponentCallbacksC0050v3.m219F(c0051v0.f256d, c0051v0.f257e, c0051v0.f258f, c0051v0.f259g);
                                    z15 = true;
                                    c0035n0.m128V(abstractComponentCallbacksC0050v3, true);
                                    c0035n0.m123Q(abstractComponentCallbacksC0050v3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0051v0.f253a);
                                case 3:
                                    abstractComponentCallbacksC0050v3.m219F(c0051v0.f256d, c0051v0.f257e, c0051v0.f258f, c0051v0.f259g);
                                    c0035n0.m132a(abstractComponentCallbacksC0050v3);
                                    z15 = true;
                                case 4:
                                    abstractComponentCallbacksC0050v3.m219F(c0051v0.f256d, c0051v0.f257e, c0051v0.f258f, c0051v0.f259g);
                                    c0035n0.getClass();
                                    m110Z(abstractComponentCallbacksC0050v3);
                                    z15 = true;
                                case 5:
                                    abstractComponentCallbacksC0050v3.m219F(c0051v0.f256d, c0051v0.f257e, c0051v0.f258f, c0051v0.f259g);
                                    c0035n0.m128V(abstractComponentCallbacksC0050v3, true);
                                    c0035n0.m116F(abstractComponentCallbacksC0050v3);
                                    z15 = true;
                                case 6:
                                    abstractComponentCallbacksC0050v3.m219F(c0051v0.f256d, c0051v0.f257e, c0051v0.f258f, c0051v0.f259g);
                                    c0035n0.m136c(abstractComponentCallbacksC0050v3);
                                    z15 = true;
                                case 7:
                                    abstractComponentCallbacksC0050v3.m219F(c0051v0.f256d, c0051v0.f257e, c0051v0.f258f, c0051v0.f259g);
                                    c0035n0.m128V(abstractComponentCallbacksC0050v3, true);
                                    c0035n0.m141g(abstractComponentCallbacksC0050v3);
                                    z15 = true;
                                case 8:
                                    c0035n0.m130X(null);
                                    z15 = true;
                                case 9:
                                    c0035n0.m130X(abstractComponentCallbacksC0050v3);
                                    z15 = true;
                                case 10:
                                    c0035n0.m129W(abstractComponentCallbacksC0050v3, c0051v0.f260h);
                                    z15 = true;
                            }
                        }
                    } else {
                        c0006a.m3c(1);
                        C0035n0 c0035n02 = c0006a.f26p;
                        ArrayList arrayList6 = c0006a.f11a;
                        int size3 = arrayList6.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            C0051v0 c0051v02 = (C0051v0) arrayList6.get(i20);
                            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v4 = c0051v02.f254b;
                            if (abstractComponentCallbacksC0050v4 != null) {
                                if (abstractComponentCallbacksC0050v4.f225Q != null) {
                                    abstractComponentCallbacksC0050v4.m225f().f190a = false;
                                }
                                int i21 = c0006a.f16f;
                                if (abstractComponentCallbacksC0050v4.f225Q != null || i21 != 0) {
                                    abstractComponentCallbacksC0050v4.m225f();
                                    abstractComponentCallbacksC0050v4.f225Q.f195f = i21;
                                }
                                abstractComponentCallbacksC0050v4.m225f();
                                abstractComponentCallbacksC0050v4.f225Q.getClass();
                            }
                            switch (c0051v02.f253a) {
                                case 1:
                                    abstractComponentCallbacksC0050v4.m219F(c0051v02.f256d, c0051v02.f257e, c0051v02.f258f, c0051v02.f259g);
                                    c0035n02.m128V(abstractComponentCallbacksC0050v4, false);
                                    c0035n02.m132a(abstractComponentCallbacksC0050v4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0051v02.f253a);
                                case 3:
                                    abstractComponentCallbacksC0050v4.m219F(c0051v02.f256d, c0051v02.f257e, c0051v02.f258f, c0051v02.f259g);
                                    c0035n02.m123Q(abstractComponentCallbacksC0050v4);
                                case 4:
                                    abstractComponentCallbacksC0050v4.m219F(c0051v02.f256d, c0051v02.f257e, c0051v02.f258f, c0051v02.f259g);
                                    c0035n02.m116F(abstractComponentCallbacksC0050v4);
                                case 5:
                                    abstractComponentCallbacksC0050v4.m219F(c0051v02.f256d, c0051v02.f257e, c0051v02.f258f, c0051v02.f259g);
                                    c0035n02.m128V(abstractComponentCallbacksC0050v4, false);
                                    m110Z(abstractComponentCallbacksC0050v4);
                                case 6:
                                    abstractComponentCallbacksC0050v4.m219F(c0051v02.f256d, c0051v02.f257e, c0051v02.f258f, c0051v02.f259g);
                                    c0035n02.m141g(abstractComponentCallbacksC0050v4);
                                case 7:
                                    abstractComponentCallbacksC0050v4.m219F(c0051v02.f256d, c0051v02.f257e, c0051v02.f258f, c0051v02.f259g);
                                    c0035n02.m128V(abstractComponentCallbacksC0050v4, false);
                                    c0035n02.m136c(abstractComponentCallbacksC0050v4);
                                case 8:
                                    c0035n02.m130X(abstractComponentCallbacksC0050v4);
                                case 9:
                                    c0035n02.m130X(null);
                                case 10:
                                    c0035n02.m129W(abstractComponentCallbacksC0050v4, c0051v02.f261i);
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i22 = i; i22 < i4; i22++) {
                    C0006a c0006a2 = (C0006a) arrayList.get(i22);
                    if (zBooleanValue) {
                        for (int size4 = c0006a2.f11a.size() - 1; size4 >= 0; size4--) {
                            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v5 = ((C0051v0) c0006a2.f11a.get(size4)).f254b;
                            if (abstractComponentCallbacksC0050v5 != null) {
                                m140f(abstractComponentCallbacksC0050v5).m210k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = c0006a2.f11a;
                        int size5 = arrayList7.size();
                        int i23 = 0;
                        while (i23 < size5) {
                            Object obj2 = arrayList7.get(i23);
                            i23++;
                            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v6 = ((C0051v0) obj2).f254b;
                            if (abstractComponentCallbacksC0050v6 != null) {
                                m140f(abstractComponentCallbacksC0050v6).m210k();
                            }
                        }
                    }
                }
                m118L(this.f133s, true);
                HashSet hashSet = new HashSet();
                for (int i24 = i; i24 < i4; i24++) {
                    ArrayList arrayList8 = ((C0006a) arrayList.get(i24)).f11a;
                    int size6 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size6) {
                        Object obj3 = arrayList8.get(i25);
                        i25++;
                        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v7 = ((C0051v0) obj3).f254b;
                        if (abstractComponentCallbacksC0050v7 != null && (viewGroup = abstractComponentCallbacksC0050v7.f221M) != null) {
                            hashSet.add(C0030l.m99f(viewGroup, m115E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C0030l c0030l = (C0030l) it.next();
                    c0030l.f96d = zBooleanValue;
                    synchronized (c0030l.f94b) {
                        try {
                            c0030l.m105g();
                            c0030l.f97e = false;
                            int size7 = c0030l.f94b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    C0059z0 c0059z0 = (C0059z0) c0030l.f94b.get(size7);
                                    int iM7c = AbstractC0008a1.m7c(c0059z0.f284c.f222N);
                                    if (c0059z0.f282a != 2 || iM7c == 2) {
                                        size7--;
                                    } else {
                                        C0046t c0046t = c0059z0.f284c.f225Q;
                                        c0030l.f97e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0030l.m102c();
                }
                for (int i26 = i; i26 < i4; i26++) {
                    C0006a c0006a3 = (C0006a) arrayList.get(i26);
                    if (((Boolean) arrayList2.get(i26)).booleanValue() && c0006a3.f28r >= 0) {
                        c0006a3.f28r = -1;
                    }
                    c0006a3.getClass();
                }
                return;
            }
            C0006a c0006a4 = (C0006a) arrayList.get(i12);
            if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                z7 = z12;
                i8 = i12;
                z8 = z13;
                int i27 = 1;
                ArrayList arrayList9 = this.f112K;
                ArrayList arrayList10 = c0006a4.f11a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    C0051v0 c0051v03 = (C0051v0) arrayList10.get(size8);
                    int i28 = c0051v03.f253a;
                    if (i28 == i27) {
                        arrayList9.remove(c0051v03.f254b);
                    } else if (i28 != 3) {
                        switch (i28) {
                            case 6:
                                arrayList9.add(c0051v03.f254b);
                                break;
                            case 8:
                                abstractComponentCallbacksC0050v = null;
                                break;
                            case 9:
                                abstractComponentCallbacksC0050v = c0051v03.f254b;
                                break;
                            case 10:
                                c0051v03.f261i = c0051v03.f260h;
                                break;
                        }
                    }
                    size8--;
                    i27 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f112K;
                ArrayList arrayList12 = c0006a4.f11a;
                int i29 = 0;
                while (i29 < arrayList12.size()) {
                    C0051v0 c0051v04 = (C0051v0) arrayList12.get(i29);
                    int i30 = c0051v04.f253a;
                    if (i30 != i13) {
                        z9 = z12;
                        if (i30 != 2) {
                            if (i30 == 3 || i30 == 6) {
                                arrayList11.remove(c0051v04.f254b);
                                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v8 = c0051v04.f254b;
                                if (abstractComponentCallbacksC0050v8 == abstractComponentCallbacksC0050v) {
                                    arrayList12.add(i29, new C0051v0(9, abstractComponentCallbacksC0050v8));
                                    i29++;
                                    i10 = i12;
                                    z10 = z13;
                                    i9 = 1;
                                    abstractComponentCallbacksC0050v = null;
                                }
                            } else if (i30 == 7) {
                                i9 = 1;
                            } else if (i30 == 8) {
                                arrayList12.add(i29, new C0051v0(9, abstractComponentCallbacksC0050v, 0));
                                c0051v04.f255c = true;
                                i29++;
                                abstractComponentCallbacksC0050v = c0051v04.f254b;
                            }
                            i10 = i12;
                            z10 = z13;
                            i9 = 1;
                        } else {
                            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v9 = c0051v04.f254b;
                            int i31 = abstractComponentCallbacksC0050v9.f214F;
                            int size9 = arrayList11.size() - 1;
                            boolean z16 = false;
                            while (size9 >= 0) {
                                int i32 = size9;
                                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v10 = (AbstractComponentCallbacksC0050v) arrayList11.get(size9);
                                int i33 = i12;
                                if (abstractComponentCallbacksC0050v10.f214F != i31) {
                                    z11 = z13;
                                } else if (abstractComponentCallbacksC0050v10 == abstractComponentCallbacksC0050v9) {
                                    z11 = z13;
                                    z16 = true;
                                } else {
                                    if (abstractComponentCallbacksC0050v10 == abstractComponentCallbacksC0050v) {
                                        z11 = z13;
                                        i11 = 0;
                                        arrayList12.add(i29, new C0051v0(9, abstractComponentCallbacksC0050v10, 0));
                                        i29++;
                                        abstractComponentCallbacksC0050v = null;
                                    } else {
                                        z11 = z13;
                                        i11 = 0;
                                    }
                                    C0051v0 c0051v05 = new C0051v0(3, abstractComponentCallbacksC0050v10, i11);
                                    c0051v05.f256d = c0051v04.f256d;
                                    c0051v05.f258f = c0051v04.f258f;
                                    c0051v05.f257e = c0051v04.f257e;
                                    c0051v05.f259g = c0051v04.f259g;
                                    arrayList12.add(i29, c0051v05);
                                    arrayList11.remove(abstractComponentCallbacksC0050v10);
                                    i29++;
                                    abstractComponentCallbacksC0050v = abstractComponentCallbacksC0050v;
                                }
                                size9 = i32 - 1;
                                z13 = z11;
                                i12 = i33;
                            }
                            i10 = i12;
                            z10 = z13;
                            i9 = 1;
                            if (z16) {
                                arrayList12.remove(i29);
                                i29--;
                            } else {
                                c0051v04.f253a = 1;
                                c0051v04.f255c = true;
                                arrayList11.add(abstractComponentCallbacksC0050v9);
                            }
                        }
                        i29 += i9;
                        i13 = i9;
                        z12 = z9;
                        z13 = z10;
                        i12 = i10;
                    } else {
                        z9 = z12;
                        i9 = i13;
                    }
                    i10 = i12;
                    z10 = z13;
                    arrayList11.add(c0051v04.f254b);
                    i29 += i9;
                    i13 = i9;
                    z12 = z9;
                    z13 = z10;
                    i12 = i10;
                }
                z7 = z12;
                i8 = i12;
                z8 = z13;
            }
            z13 = z8 || c0006a4.f17g;
            i12 = i8 + 1;
            z12 = z7;
        }
    }
}
