package p014b3;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p002a1.C0048u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b3.a */
/* loaded from: classes.dex */
public final class C0565a {

    /* renamed from: d */
    public static volatile C0565a f2269d;

    /* renamed from: e */
    public static final Object f2270e = new Object();

    /* renamed from: c */
    public final Context f2273c;

    /* renamed from: b */
    public final HashSet f2272b = new HashSet();

    /* renamed from: a */
    public final HashMap f2271a = new HashMap();

    public C0565a(Context context) {
        this.f2273c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C0565a m1304c(Context context) {
        if (f2269d == null) {
            synchronized (f2270e) {
                try {
                    if (f2269d == null) {
                        f2269d = new C0565a(context);
                    }
                } finally {
                }
            }
        }
        return f2269d;
    }

    /* renamed from: a */
    public final void m1305a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f2273c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f2272b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0566b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m1306b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0048u(e);
            }
        }
    }

    /* renamed from: b */
    public final Object m1306b(Class cls, HashSet hashSet) {
        Object objMo545b;
        HashMap map = this.f2271a;
        if (AbstractC0715d.m1548Q()) {
            try {
                AbstractC0715d.m1561g(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo545b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0566b interfaceC0566b = (InterfaceC0566b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo544a = interfaceC0566b.mo544a();
                if (!listMo544a.isEmpty()) {
                    for (Class cls2 : listMo544a) {
                        if (!map.containsKey(cls2)) {
                            m1306b(cls2, hashSet);
                        }
                    }
                }
                objMo545b = interfaceC0566b.mo545b(this.f2273c);
                hashSet.remove(cls);
                map.put(cls, objMo545b);
            } catch (Throwable th2) {
                throw new C0048u(th2);
            }
        }
        Trace.endSection();
        return objMo545b;
    }
}
