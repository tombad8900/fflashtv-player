package p002a1;

import java.lang.reflect.InvocationTargetException;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.h0 */
/* loaded from: classes.dex */
public final class C0023h0 {

    /* renamed from: b */
    public static final C2192k f82b = new C2192k(0);

    /* renamed from: a */
    public final /* synthetic */ C0035n0 f83a;

    public C0023h0(C0035n0 c0035n0) {
        this.f83a = c0035n0;
    }

    /* renamed from: b */
    public static Class m85b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C2192k c2192k = f82b;
        C2192k c2192k2 = (C2192k) c2192k.get(classLoader);
        if (c2192k2 == null) {
            c2192k2 = new C2192k(0);
            c2192k.put(classLoader, c2192k2);
        }
        Class cls = (Class) c2192k2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c2192k2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class m86c(ClassLoader classLoader, String str) {
        try {
            return m85b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0048u(AbstractC0008a1.m17m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e8) {
            throw new C0048u(AbstractC0008a1.m17m("Unable to instantiate fragment ", str, ": make sure class name exists"), e8);
        }
    }

    /* renamed from: a */
    public final AbstractComponentCallbacksC0050v m87a(String str) {
        try {
            return (AbstractComponentCallbacksC0050v) m86c(this.f83a.f134t.f278q.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0048u(AbstractC0008a1.m17m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e8) {
            throw new C0048u(AbstractC0008a1.m17m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (NoSuchMethodException e9) {
            throw new C0048u(AbstractC0008a1.m17m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e9);
        } catch (InvocationTargetException e10) {
            throw new C0048u(AbstractC0008a1.m17m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
        }
    }
}
