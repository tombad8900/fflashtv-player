package p130p;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p090k2.C1584b;
import p139q.C2240b;
import p216z2.AbstractC2888f0;
import p216z2.C2877b1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.j */
/* loaded from: classes.dex */
public class C2191j {

    /* renamed from: a */
    public final /* synthetic */ int f7647a;

    /* renamed from: b */
    public int f7648b;

    /* renamed from: c */
    public int f7649c;

    /* renamed from: d */
    public int f7650d;

    /* renamed from: e */
    public int f7651e;

    /* renamed from: f */
    public final Object f7652f;

    /* renamed from: g */
    public final Object f7653g;

    public C2191j(int i) {
        this.f7647a = 0;
        this.f7648b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f7652f = new C2240b();
        this.f7653g = new C1584b(16);
    }

    /* renamed from: a */
    public void m3973a() {
        View view = (View) ((ArrayList) this.f7652f).get(r0.size() - 1);
        C2877b1 c2877b1 = (C2877b1) view.getLayoutParams();
        this.f7649c = ((StaggeredGridLayoutManager) this.f7653g).f2101r.mo4507b(view);
        c2877b1.getClass();
    }

    /* renamed from: b */
    public void m3974b() {
        ((ArrayList) this.f7652f).clear();
        this.f7648b = Integer.MIN_VALUE;
        this.f7649c = Integer.MIN_VALUE;
        this.f7650d = 0;
    }

    /* renamed from: c */
    public void mo3975c(Object obj, Object obj2, Object obj3) {
        AbstractC2980h.m5136e("key", obj);
        AbstractC2980h.m5136e("oldValue", obj2);
    }

    /* renamed from: d */
    public int m3976d() {
        return ((StaggeredGridLayoutManager) this.f7653g).f2106w ? m3978f(r0.size() - 1, -1) : m3978f(0, ((ArrayList) this.f7652f).size());
    }

    /* renamed from: e */
    public int m3977e() {
        return ((StaggeredGridLayoutManager) this.f7653g).f2106w ? m3978f(0, ((ArrayList) this.f7652f).size()) : m3978f(r0.size() - 1, -1);
    }

    /* renamed from: f */
    public int m3978f(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f7653g;
        int iMo4516k = staggeredGridLayoutManager.f2101r.mo4516k();
        int iMo4512g = staggeredGridLayoutManager.f2101r.mo4512g();
        int i8 = i4 > i ? 1 : -1;
        while (i != i4) {
            View view = (View) ((ArrayList) this.f7652f).get(i);
            int iMo4510e = staggeredGridLayoutManager.f2101r.mo4510e(view);
            int iMo4507b = staggeredGridLayoutManager.f2101r.mo4507b(view);
            boolean z7 = iMo4510e <= iMo4512g;
            boolean z8 = iMo4507b >= iMo4516k;
            if (z7 && z8 && (iMo4510e < iMo4516k || iMo4507b > iMo4512g)) {
                return AbstractC2888f0.m4983H(view);
            }
            i += i8;
        }
        return -1;
    }

    /* renamed from: g */
    public Object m3979g(Object obj) {
        AbstractC2980h.m5136e("key", obj);
        synchronized (((C1584b) this.f7653g)) {
            C2240b c2240b = (C2240b) this.f7652f;
            c2240b.getClass();
            Object obj2 = c2240b.f7770a.get(obj);
            if (obj2 != null) {
                this.f7650d++;
                return obj2;
            }
            this.f7651e++;
            return null;
        }
    }

    /* renamed from: h */
    public int m3980h(int i) {
        int i4 = this.f7649c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (((ArrayList) this.f7652f).size() == 0) {
            return i;
        }
        m3973a();
        return this.f7649c;
    }

    /* renamed from: i */
    public View m3981i(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f7653g;
        ArrayList arrayList = (ArrayList) this.f7652f;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2106w && AbstractC2888f0.m4983H(view2) >= i) || ((!staggeredGridLayoutManager.f2106w && AbstractC2888f0.m4983H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            View view3 = (View) arrayList.get(i8);
            if ((staggeredGridLayoutManager.f2106w && AbstractC2888f0.m4983H(view3) <= i) || ((!staggeredGridLayoutManager.f2106w && AbstractC2888f0.m4983H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i8++;
            view = view3;
        }
        return view;
    }

    /* renamed from: j */
    public int m3982j(int i) {
        ArrayList arrayList = (ArrayList) this.f7652f;
        int i4 = this.f7648b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C2877b1 c2877b1 = (C2877b1) view.getLayoutParams();
        this.f7648b = ((StaggeredGridLayoutManager) this.f7653g).f2101r.mo4510e(view);
        c2877b1.getClass();
        return this.f7648b;
    }

    /* renamed from: k */
    public Object m3983k(Object obj, Object obj2) {
        Object objPut;
        AbstractC2980h.m5136e("key", obj);
        AbstractC2980h.m5136e("value", obj2);
        synchronized (((C1584b) this.f7653g)) {
            this.f7649c += m3984l(obj, obj2);
            C2240b c2240b = (C2240b) this.f7652f;
            c2240b.getClass();
            objPut = c2240b.f7770a.put(obj, obj2);
            if (objPut != null) {
                this.f7649c -= m3984l(obj, objPut);
            }
        }
        if (objPut != null) {
            mo3975c(obj, objPut, obj2);
        }
        m3986n(this.f7648b);
        return objPut;
    }

    /* renamed from: l */
    public int m3984l(Object obj, Object obj2) {
        int iMo3985m = mo3985m(obj, obj2);
        if (iMo3985m >= 0) {
            return iMo3985m;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    /* renamed from: m */
    public int mo3985m(Object obj, Object obj2) {
        AbstractC2980h.m5136e("key", obj);
        AbstractC2980h.m5136e("value", obj2);
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m3986n(int i) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (((C1584b) this.f7653g)) {
                try {
                    if (this.f7649c < 0 || (((C2240b) this.f7652f).f7770a.isEmpty() && this.f7649c != 0)) {
                        break;
                    }
                    if (this.f7649c <= i || ((C2240b) this.f7652f).f7770a.isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((C2240b) this.f7652f).f7770a.entrySet();
                    AbstractC2980h.m5135d("map.entries", setEntrySet);
                    if (setEntrySet instanceof List) {
                        List list = (List) setEntrySet;
                        next = list.isEmpty() ? null : list.get(0);
                    } else {
                        Iterator it = setEntrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    C2240b c2240b = (C2240b) this.f7652f;
                    c2240b.getClass();
                    AbstractC2980h.m5136e("key", key);
                    c2240b.f7770a.remove(key);
                    this.f7649c -= m3984l(key, value);
                } catch (Throwable th) {
                    throw th;
                }
            }
            mo3975c(key, value, null);
        }
    }

    public String toString() {
        String str;
        switch (this.f7647a) {
            case 0:
                synchronized (((C1584b) this.f7653g)) {
                    try {
                        int i = this.f7650d;
                        int i4 = this.f7651e + i;
                        str = "LruCache[maxSize=" + this.f7648b + ",hits=" + this.f7650d + ",misses=" + this.f7651e + ",hitRate=" + (i4 != 0 ? (i * 100) / i4 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C2191j(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f7647a = 1;
        this.f7653g = staggeredGridLayoutManager;
        this.f7652f = new ArrayList();
        this.f7648b = Integer.MIN_VALUE;
        this.f7649c = Integer.MIN_VALUE;
        this.f7650d = 0;
        this.f7651e = i;
    }
}
