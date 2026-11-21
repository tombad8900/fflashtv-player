package p032d3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.v4.media.session.AbstractC0120b;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import okhttp3.C2181z;
import p002a1.C0022h;
import p017b6.C0614n;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p130p.AbstractC2190i;
import p130p.C2186e;
import p130p.C2189h;
import p139q.AbstractC2239a;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.n */
/* loaded from: classes.dex */
public abstract class AbstractC0829n implements Cloneable {

    /* renamed from: F */
    public static final Animator[] f3681F = new Animator[0];

    /* renamed from: G */
    public static final int[] f3682G = {2, 1, 3, 4};

    /* renamed from: H */
    public static final C2819f f3683H = new C2819f(17);

    /* renamed from: I */
    public static final ThreadLocal f3684I = new ThreadLocal();

    /* renamed from: t */
    public ArrayList f3700t;

    /* renamed from: u */
    public ArrayList f3701u;

    /* renamed from: v */
    public InterfaceC0827l[] f3702v;

    /* renamed from: j */
    public final String f3690j = getClass().getName();

    /* renamed from: k */
    public long f3691k = -1;

    /* renamed from: l */
    public long f3692l = -1;

    /* renamed from: m */
    public TimeInterpolator f3693m = null;

    /* renamed from: n */
    public final ArrayList f3694n = new ArrayList();

    /* renamed from: o */
    public final ArrayList f3695o = new ArrayList();

    /* renamed from: p */
    public C0022h f3696p = new C0022h(2);

    /* renamed from: q */
    public C0022h f3697q = new C0022h(2);

    /* renamed from: r */
    public C0809a f3698r = null;

    /* renamed from: s */
    public final int[] f3699s = f3682G;

    /* renamed from: w */
    public final ArrayList f3703w = new ArrayList();

    /* renamed from: x */
    public Animator[] f3704x = f3681F;

    /* renamed from: y */
    public int f3705y = 0;

    /* renamed from: z */
    public boolean f3706z = false;

    /* renamed from: A */
    public boolean f3685A = false;

    /* renamed from: B */
    public AbstractC0829n f3686B = null;

    /* renamed from: C */
    public ArrayList f3687C = null;

    /* renamed from: D */
    public ArrayList f3688D = new ArrayList();

    /* renamed from: E */
    public C2819f f3689E = f3683H;

    /* renamed from: b */
    public static void m1988b(C0022h c0022h, View view, C0837v c0837v) {
        C2186e c2186e = (C2186e) c0022h.f78j;
        C2186e c2186e2 = (C2186e) c0022h.f81m;
        SparseArray sparseArray = (SparseArray) c0022h.f79k;
        C2189h c2189h = (C2189h) c0022h.f80l;
        c2186e.put(view, c0837v);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        String strM3533e = AbstractC1804e0.m3533e(view);
        if (strM3533e != null) {
            if (c2186e2.containsKey(strM3533e)) {
                c2186e2.put(strM3533e, null);
            } else {
                c2186e2.put(strM3533e, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2189h.f7641j) {
                    int i = c2189h.f7644m;
                    long[] jArr = c2189h.f7642k;
                    Object[] objArr = c2189h.f7643l;
                    int i4 = 0;
                    for (int i8 = 0; i8 < i; i8++) {
                        Object obj = objArr[i8];
                        if (obj != AbstractC2190i.f7645a) {
                            if (i8 != i4) {
                                jArr[i4] = jArr[i8];
                                objArr[i4] = obj;
                                objArr[i8] = null;
                            }
                            i4++;
                        }
                    }
                    c2189h.f7641j = false;
                    c2189h.f7644m = i4;
                }
                if (AbstractC2239a.m4012b(c2189h.f7642k, c2189h.f7644m, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2189h.m3968d(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) c2189h.m3966b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c2189h.m3968d(null, itemIdAtPosition);
                }
            }
        }
    }

    /* renamed from: o */
    public static C2186e m1989o() {
        ThreadLocal threadLocal = f3684I;
        C2186e c2186e = (C2186e) threadLocal.get();
        if (c2186e != null) {
            return c2186e;
        }
        C2186e c2186e2 = new C2186e(0);
        threadLocal.set(c2186e2);
        return c2186e2;
    }

    /* renamed from: t */
    public static boolean m1990t(C0837v c0837v, C0837v c0837v2, String str) {
        Object obj = c0837v.f3717a.get(str);
        Object obj2 = c0837v2.f3717a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo1949A(AbstractC0120b abstractC0120b) {
    }

    /* renamed from: B */
    public void mo1950B(TimeInterpolator timeInterpolator) {
        this.f3693m = timeInterpolator;
    }

    /* renamed from: C */
    public void mo1951C(C2819f c2819f) {
        if (c2819f == null) {
            this.f3689E = f3683H;
        } else {
            this.f3689E = c2819f;
        }
    }

    /* renamed from: D */
    public void mo1952D() {
    }

    /* renamed from: E */
    public void mo1953E(long j) {
        this.f3691k = j;
    }

    /* renamed from: F */
    public final void m1991F() {
        if (this.f3705y == 0) {
            m2001u(this, InterfaceC0828m.f3676b);
            this.f3685A = false;
        }
        this.f3705y++;
    }

    /* renamed from: G */
    public String mo1954G(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3692l != -1) {
            sb.append("dur(");
            sb.append(this.f3692l);
            sb.append(") ");
        }
        if (this.f3691k != -1) {
            sb.append("dly(");
            sb.append(this.f3691k);
            sb.append(") ");
        }
        if (this.f3693m != null) {
            sb.append("interp(");
            sb.append(this.f3693m);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3694n;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3695o;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m1992a(InterfaceC0827l interfaceC0827l) {
        if (this.f3687C == null) {
            this.f3687C = new ArrayList();
        }
        this.f3687C.add(interfaceC0827l);
    }

    /* renamed from: c */
    public abstract void mo1956c(C0837v c0837v);

    public void cancel() {
        ArrayList arrayList = this.f3703w;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3704x);
        this.f3704x = f3681F;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3704x = animatorArr;
        m2001u(this, InterfaceC0828m.f3678d);
    }

    /* renamed from: d */
    public final void m1993d(View view, boolean z7) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0837v c0837v = new C0837v(view);
            if (z7) {
                mo1958f(c0837v);
            } else {
                mo1956c(c0837v);
            }
            c0837v.f3719c.add(this);
            mo1957e(c0837v);
            if (z7) {
                m1988b(this.f3696p, view, c0837v);
            } else {
                m1988b(this.f3697q, view, c0837v);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1993d(viewGroup.getChildAt(i), z7);
            }
        }
    }

    /* renamed from: e */
    public void mo1957e(C0837v c0837v) {
    }

    /* renamed from: f */
    public abstract void mo1958f(C0837v c0837v);

    /* renamed from: g */
    public final void m1994g(ViewGroup viewGroup, boolean z7) {
        m1995h(z7);
        ArrayList arrayList = this.f3694n;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3695o;
        if (size <= 0 && arrayList2.size() <= 0) {
            m1993d(viewGroup, z7);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C0837v c0837v = new C0837v(viewFindViewById);
                if (z7) {
                    mo1958f(c0837v);
                } else {
                    mo1956c(c0837v);
                }
                c0837v.f3719c.add(this);
                mo1957e(c0837v);
                if (z7) {
                    m1988b(this.f3696p, viewFindViewById, c0837v);
                } else {
                    m1988b(this.f3697q, viewFindViewById, c0837v);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            C0837v c0837v2 = new C0837v(view);
            if (z7) {
                mo1958f(c0837v2);
            } else {
                mo1956c(c0837v2);
            }
            c0837v2.f3719c.add(this);
            mo1957e(c0837v2);
            if (z7) {
                m1988b(this.f3696p, view, c0837v2);
            } else {
                m1988b(this.f3697q, view, c0837v2);
            }
        }
    }

    /* renamed from: h */
    public final void m1995h(boolean z7) {
        if (z7) {
            ((C2186e) this.f3696p.f78j).clear();
            ((SparseArray) this.f3696p.f79k).clear();
            ((C2189h) this.f3696p.f80l).m3965a();
        } else {
            ((C2186e) this.f3697q.f78j).clear();
            ((SparseArray) this.f3697q.f79k).clear();
            ((C2189h) this.f3697q.f80l).m3965a();
        }
    }

    @Override // 
    /* renamed from: i */
    public AbstractC0829n clone() {
        try {
            AbstractC0829n abstractC0829n = (AbstractC0829n) super.clone();
            abstractC0829n.f3688D = new ArrayList();
            abstractC0829n.f3696p = new C0022h(2);
            abstractC0829n.f3697q = new C0022h(2);
            abstractC0829n.f3700t = null;
            abstractC0829n.f3701u = null;
            abstractC0829n.f3686B = this;
            abstractC0829n.f3687C = null;
            return abstractC0829n;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public Animator mo1978j(ViewGroup viewGroup, C0837v c0837v, C0837v c0837v2) {
        return null;
    }

    /* renamed from: k */
    public void mo1960k(ViewGroup viewGroup, C0022h c0022h, C0022h c0022h2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i4;
        View view;
        C0837v c0837v;
        Animator animator;
        C0837v c0837v2;
        C2186e c2186eM1989o = m1989o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m1998n().getClass();
        int i8 = 0;
        while (i8 < size) {
            C0837v c0837v3 = (C0837v) arrayList.get(i8);
            C0837v c0837v4 = (C0837v) arrayList2.get(i8);
            if (c0837v3 != null && !c0837v3.f3719c.contains(this)) {
                c0837v3 = null;
            }
            if (c0837v4 != null && !c0837v4.f3719c.contains(this)) {
                c0837v4 = null;
            }
            if ((c0837v3 != null || c0837v4 != null) && (c0837v3 == null || c0837v4 == null || mo1986r(c0837v3, c0837v4))) {
                Animator animatorMo1978j = mo1978j(viewGroup, c0837v3, c0837v4);
                if (animatorMo1978j != null) {
                    String str = this.f3690j;
                    if (c0837v4 != null) {
                        view = c0837v4.f3718b;
                        String[] strArrMo1979p = mo1979p();
                        if (strArrMo1979p != null && strArrMo1979p.length > 0) {
                            c0837v2 = new C0837v(view);
                            C0837v c0837v5 = (C0837v) ((C2186e) c0022h2.f78j).get(view);
                            i = size;
                            if (c0837v5 != null) {
                                int i9 = 0;
                                while (i9 < strArrMo1979p.length) {
                                    String str2 = strArrMo1979p[i9];
                                    c0837v2.f3717a.put(str2, c0837v5.f3717a.get(str2));
                                    i9++;
                                    i8 = i8;
                                    c0837v5 = c0837v5;
                                }
                            }
                            i4 = i8;
                            int i10 = c2186eM1989o.f7656l;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    animator = animatorMo1978j;
                                    break;
                                }
                                C0826k c0826k = (C0826k) c2186eM1989o.get((Animator) c2186eM1989o.m3992f(i11));
                                if (c0826k.f3672c != null && c0826k.f3670a == view && c0826k.f3671b.equals(str) && c0826k.f3672c.equals(c0837v2)) {
                                    animator = null;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            i = size;
                            i4 = i8;
                            animator = animatorMo1978j;
                            c0837v2 = null;
                        }
                        animatorMo1978j = animator;
                        c0837v = c0837v2;
                    } else {
                        i = size;
                        i4 = i8;
                        view = c0837v3.f3718b;
                        c0837v = null;
                    }
                    if (animatorMo1978j != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0826k c0826k2 = new C0826k();
                        c0826k2.f3670a = view;
                        c0826k2.f3671b = str;
                        c0826k2.f3672c = c0837v;
                        c0826k2.f3673d = windowId;
                        c0826k2.f3674e = this;
                        c0826k2.f3675f = animatorMo1978j;
                        c2186eM1989o.put(animatorMo1978j, c0826k2);
                        this.f3688D.add(animatorMo1978j);
                    }
                }
                i8 = i4 + 1;
                size = i;
            }
            i = size;
            i4 = i8;
            i8 = i4 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                C0826k c0826k3 = (C0826k) c2186eM1989o.get((Animator) this.f3688D.get(sparseIntArray.keyAt(i12)));
                c0826k3.f3675f.setStartDelay(c0826k3.f3675f.getStartDelay() + (sparseIntArray.valueAt(i12) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: l */
    public final void m1996l() {
        int i = this.f3705y - 1;
        this.f3705y = i;
        if (i == 0) {
            m2001u(this, InterfaceC0828m.f3677c);
            for (int i4 = 0; i4 < ((C2189h) this.f3696p.f80l).m3969e(); i4++) {
                View view = (View) ((C2189h) this.f3696p.f80l).m3970f(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i8 = 0; i8 < ((C2189h) this.f3697q.f80l).m3969e(); i8++) {
                View view2 = (View) ((C2189h) this.f3697q.f80l).m3970f(i8);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3685A = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f3701u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f3700t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p032d3.C0837v) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0837v m1997m(View view, boolean z7) {
        C0809a c0809a = this.f3698r;
        if (c0809a != null) {
            return c0809a.m1997m(view, z7);
        }
        ArrayList arrayList = z7 ? this.f3700t : this.f3701u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C0837v c0837v = (C0837v) arrayList.get(i);
            if (c0837v == null) {
                return null;
            }
            if (c0837v.f3718b == view) {
                break;
            }
            i++;
        }
    }

    /* renamed from: n */
    public final AbstractC0829n m1998n() {
        C0809a c0809a = this.f3698r;
        return c0809a != null ? c0809a.m1998n() : this;
    }

    /* renamed from: p */
    public String[] mo1979p() {
        return null;
    }

    /* renamed from: q */
    public final C0837v m1999q(View view, boolean z7) {
        C0809a c0809a = this.f3698r;
        if (c0809a != null) {
            return c0809a.m1999q(view, z7);
        }
        return (C0837v) ((C2186e) (z7 ? this.f3696p : this.f3697q).f78j).get(view);
    }

    /* renamed from: r */
    public boolean mo1986r(C0837v c0837v, C0837v c0837v2) {
        if (c0837v != null && c0837v2 != null) {
            String[] strArrMo1979p = mo1979p();
            if (strArrMo1979p != null) {
                for (String str : strArrMo1979p) {
                    if (m1990t(c0837v, c0837v2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c0837v.f3717a.keySet().iterator();
                while (it.hasNext()) {
                    if (m1990t(c0837v, c0837v2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m2000s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3694n;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3695o;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo1954G(C2181z.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: u */
    public final void m2001u(AbstractC0829n abstractC0829n, InterfaceC0828m interfaceC0828m) {
        AbstractC0829n abstractC0829n2 = this.f3686B;
        if (abstractC0829n2 != null) {
            abstractC0829n2.m2001u(abstractC0829n, interfaceC0828m);
        }
        ArrayList arrayList = this.f3687C;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3687C.size();
        InterfaceC0827l[] interfaceC0827lArr = this.f3702v;
        if (interfaceC0827lArr == null) {
            interfaceC0827lArr = new InterfaceC0827l[size];
        }
        this.f3702v = null;
        InterfaceC0827l[] interfaceC0827lArr2 = (InterfaceC0827l[]) this.f3687C.toArray(interfaceC0827lArr);
        for (int i = 0; i < size; i++) {
            interfaceC0828m.mo646a(interfaceC0827lArr2[i], abstractC0829n);
            interfaceC0827lArr2[i] = null;
        }
        this.f3702v = interfaceC0827lArr2;
    }

    /* renamed from: v */
    public void mo1961v(View view) {
        if (this.f3685A) {
            return;
        }
        ArrayList arrayList = this.f3703w;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3704x);
        this.f3704x = f3681F;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3704x = animatorArr;
        m2001u(this, InterfaceC0828m.f3679e);
        this.f3706z = true;
    }

    /* renamed from: w */
    public AbstractC0829n mo1962w(InterfaceC0827l interfaceC0827l) {
        AbstractC0829n abstractC0829n;
        ArrayList arrayList = this.f3687C;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC0827l) && (abstractC0829n = this.f3686B) != null) {
                abstractC0829n.mo1962w(interfaceC0827l);
            }
            if (this.f3687C.size() == 0) {
                this.f3687C = null;
            }
        }
        return this;
    }

    /* renamed from: x */
    public void mo1963x(View view) {
        if (this.f3706z) {
            if (!this.f3685A) {
                ArrayList arrayList = this.f3703w;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3704x);
                this.f3704x = f3681F;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3704x = animatorArr;
                m2001u(this, InterfaceC0828m.f3680f);
            }
            this.f3706z = false;
        }
    }

    /* renamed from: y */
    public void mo1964y() {
        m1991F();
        C2186e c2186eM1989o = m1989o();
        ArrayList arrayList = this.f3688D;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (c2186eM1989o.containsKey(animator)) {
                m1991F();
                if (animator != null) {
                    animator.addListener(new C0825j(this, 0, c2186eM1989o));
                    long j = this.f3692l;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j8 = this.f3691k;
                    if (j8 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j8);
                    }
                    TimeInterpolator timeInterpolator = this.f3693m;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0614n(1, this));
                    animator.start();
                }
            }
        }
        this.f3688D.clear();
        m1996l();
    }

    /* renamed from: z */
    public void mo1965z(long j) {
        this.f3692l = j;
    }
}
