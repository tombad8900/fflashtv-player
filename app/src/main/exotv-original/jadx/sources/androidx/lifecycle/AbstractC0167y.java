package androidx.lifecycle;

import com.bumptech.glide.AbstractC0715d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import okhttp3.C2181z;
import p069h7.AbstractC1214p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public abstract class AbstractC0167y {

    /* renamed from: a */
    public static final HashMap f958a = new HashMap();

    /* renamed from: b */
    public static final HashMap f959b = new HashMap();

    /* renamed from: a */
    public static void m589a(Constructor constructor, InterfaceC0162u interfaceC0162u) {
        try {
            AbstractC2980h.m5135d("{\n            constructo\u2026tance(`object`)\n        }", constructor.newInstance(interfaceC0162u));
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m590b(Class cls) throws NoSuchMethodException, SecurityException {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i;
        HashMap map = f958a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i4 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : C2181z.FRAGMENT_ENCODE_SET;
                AbstractC2980h.m5135d("fullPackage", name);
                if (name.length() != 0) {
                    AbstractC2980h.m5135d("name", canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", canonicalName);
                }
                AbstractC2980h.m5135d("if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)", canonicalName);
                String strConcat = AbstractC1214p.m2665r0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = f959b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC0715d.m1551T(declaredConstructor));
            } else {
                C0126c c0126c = C0126c.f900c;
                HashMap map3 = c0126c.f902b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC0125b0) declaredMethods[i8].getAnnotation(InterfaceC0125b0.class)) != null) {
                                c0126c.m553a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i8++;
                        }
                    } catch (NoClassDefFoundError e8) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0162u.class.isAssignableFrom(superclass)) {
                        AbstractC2980h.m5135d("superclass", superclass);
                        if (m590b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC2980h.m5133b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            AbstractC2980h.m5135d("klass.interfaces", interfaces);
                            length = interfaces.length;
                            i = 0;
                            while (true) {
                                if (i < length) {
                                    Class<?> cls2 = interfaces[i];
                                    if (cls2 != null && InterfaceC0162u.class.isAssignableFrom(cls2)) {
                                        AbstractC2980h.m5135d("intrface", cls2);
                                        if (m590b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC2980h.m5133b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        AbstractC2980h.m5135d("klass.interfaces", interfaces2);
                        length = interfaces2.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                            }
                            i++;
                        }
                    }
                }
            }
            i4 = 2;
        }
        map.put(cls, Integer.valueOf(i4));
        return i4;
    }
}
