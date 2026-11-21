package p015b4;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p002a1.C0016e;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b4.f */
/* loaded from: classes.dex */
public final class C0572f {

    /* renamed from: a */
    public final C0016e f2283a = new C0016e(6);

    /* renamed from: b */
    public final C0571e f2284b = new C0571e(0);

    /* renamed from: c */
    public final HashMap f2285c = new HashMap();

    /* renamed from: d */
    public final HashMap f2286d = new HashMap();

    /* renamed from: e */
    public final int f2287e;

    /* renamed from: f */
    public int f2288f;

    public C0572f(int i) {
        this.f2287e = i;
    }

    /* renamed from: a */
    public final void m1317a(int i, Class cls) {
        NavigableMap navigableMapM1322f = m1322f(cls);
        Integer num = (Integer) navigableMapM1322f.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM1322f.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM1322f.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: b */
    public final void m1318b(int i) {
        while (this.f2288f > i) {
            Object objM42L = this.f2283a.m42L();
            AbstractC2470e.m4445b(objM42L);
            C0568b c0568bM1320d = m1320d(objM42L.getClass());
            this.f2288f -= c0568bM1320d.m1313b() * c0568bM1320d.m1312a(objM42L);
            m1317a(c0568bM1320d.m1312a(objM42L), objM42L.getClass());
            if (Log.isLoggable(c0568bM1320d.m1314c(), 2)) {
                Log.v(c0568bM1320d.m1314c(), "evicted: " + c0568bM1320d.m1312a(objM42L));
            }
        }
    }

    /* renamed from: c */
    public final synchronized Object m1319c(int i, Class cls) {
        C0570d c0570d;
        int i4;
        try {
            Integer num = (Integer) m1322f(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i4 = this.f2288f) != 0 && this.f2287e / i4 < 2 && num.intValue() > i * 8)) {
                C0571e c0571e = this.f2284b;
                InterfaceC0574h interfaceC0574hM1316j = (InterfaceC0574h) ((ArrayDeque) c0571e.f933j).poll();
                if (interfaceC0574hM1316j == null) {
                    interfaceC0574hM1316j = c0571e.m1316j();
                }
                c0570d = (C0570d) interfaceC0574hM1316j;
                c0570d.f2280b = i;
                c0570d.f2281c = cls;
            } else {
                C0571e c0571e2 = this.f2284b;
                int iIntValue = num.intValue();
                InterfaceC0574h interfaceC0574hM1316j2 = (InterfaceC0574h) ((ArrayDeque) c0571e2.f933j).poll();
                if (interfaceC0574hM1316j2 == null) {
                    interfaceC0574hM1316j2 = c0571e2.m1316j();
                }
                c0570d = (C0570d) interfaceC0574hM1316j2;
                c0570d.f2280b = iIntValue;
                c0570d.f2281c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m1321e(c0570d, cls);
    }

    /* renamed from: d */
    public final C0568b m1320d(Class cls) {
        C0568b c0568b;
        HashMap map = this.f2286d;
        C0568b c0568b2 = (C0568b) map.get(cls);
        if (c0568b2 != null) {
            return c0568b2;
        }
        if (cls.equals(int[].class)) {
            c0568b = new C0568b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c0568b = new C0568b(0);
        }
        map.put(cls, c0568b);
        return c0568b;
    }

    /* renamed from: e */
    public final Object m1321e(C0570d c0570d, Class cls) {
        C0568b c0568bM1320d = m1320d(cls);
        Object objM68y = this.f2283a.m68y(c0570d);
        if (objM68y != null) {
            this.f2288f -= c0568bM1320d.m1313b() * c0568bM1320d.m1312a(objM68y);
            m1317a(c0568bM1320d.m1312a(objM68y), cls);
        }
        if (objM68y != null) {
            return objM68y;
        }
        if (Log.isLoggable(c0568bM1320d.m1314c(), 2)) {
            Log.v(c0568bM1320d.m1314c(), "Allocated " + c0570d.f2280b + " bytes");
        }
        int i = c0570d.f2280b;
        switch (c0568bM1320d.f2274a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* renamed from: f */
    public final NavigableMap m1322f(Class cls) {
        HashMap map = this.f2285c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: g */
    public final synchronized void m1323g(Object obj) {
        Class<?> cls = obj.getClass();
        C0568b c0568bM1320d = m1320d(cls);
        int iM1312a = c0568bM1320d.m1312a(obj);
        int iM1313b = c0568bM1320d.m1313b() * iM1312a;
        if (iM1313b <= this.f2287e / 2) {
            C0571e c0571e = this.f2284b;
            InterfaceC0574h interfaceC0574hM1316j = (InterfaceC0574h) ((ArrayDeque) c0571e.f933j).poll();
            if (interfaceC0574hM1316j == null) {
                interfaceC0574hM1316j = c0571e.m1316j();
            }
            C0570d c0570d = (C0570d) interfaceC0574hM1316j;
            c0570d.f2280b = iM1312a;
            c0570d.f2281c = cls;
            this.f2283a.m40J(c0570d, obj);
            NavigableMap navigableMapM1322f = m1322f(cls);
            Integer num = (Integer) navigableMapM1322f.get(Integer.valueOf(c0570d.f2280b));
            Integer numValueOf = Integer.valueOf(c0570d.f2280b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM1322f.put(numValueOf, Integer.valueOf(iIntValue));
            this.f2288f += iM1313b;
            m1318b(this.f2287e);
        }
    }
}
