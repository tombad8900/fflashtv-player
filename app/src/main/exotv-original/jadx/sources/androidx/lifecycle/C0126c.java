package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0126c {

    /* renamed from: c */
    public static final C0126c f900c = new C0126c();

    /* renamed from: a */
    public final HashMap f901a = new HashMap();

    /* renamed from: b */
    public final HashMap f902b = new HashMap();

    /* renamed from: b */
    public static void m552b(HashMap map, C0124b c0124b, EnumC0146m enumC0146m, Class cls) {
        EnumC0146m enumC0146m2 = (EnumC0146m) map.get(c0124b);
        if (enumC0146m2 == null || enumC0146m == enumC0146m2) {
            if (enumC0146m2 == null) {
                map.put(c0124b, enumC0146m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0124b.f899b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0146m2 + ", new value " + enumC0146m);
    }

    /* renamed from: a */
    public final C0122a m553a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f901a;
        if (superclass != null) {
            C0122a c0122aM553a = (C0122a) map2.get(superclass);
            if (c0122aM553a == null) {
                c0122aM553a = m553a(superclass, null);
            }
            map.putAll(c0122aM553a.f887b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0122a c0122aM553a2 = (C0122a) map2.get(cls2);
            if (c0122aM553a2 == null) {
                c0122aM553a2 = m553a(cls2, null);
            }
            for (Map.Entry entry : c0122aM553a2.f887b.entrySet()) {
                m552b(map, (C0124b) entry.getKey(), (EnumC0146m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            InterfaceC0125b0 interfaceC0125b0 = (InterfaceC0125b0) method.getAnnotation(InterfaceC0125b0.class);
            if (interfaceC0125b0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0164v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0146m enumC0146mValue = interfaceC0125b0.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0146m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0146mValue != EnumC0146m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m552b(map, new C0124b(i, method), enumC0146mValue, cls);
                z7 = true;
            }
        }
        C0122a c0122a = new C0122a(map);
        map2.put(cls, c0122a);
        this.f902b.put(cls, Boolean.valueOf(z7));
        return c0122a;
    }
}
