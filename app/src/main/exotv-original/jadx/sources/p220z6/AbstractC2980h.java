package p220z6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p002a1.AbstractC0008a1;
import p002a1.C0048u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.h */
/* loaded from: classes.dex */
public abstract class AbstractC2980h {

    /* renamed from: a */
    public static final Object[] f11112a = new Object[0];

    /* renamed from: a */
    public static boolean m5132a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m5133b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m5138g(nullPointerException, AbstractC2980h.class.getName());
        throw nullPointerException;
    }

    /* renamed from: c */
    public static void m5134c(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m5138g(nullPointerException, AbstractC2980h.class.getName());
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m5135d(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m5138g(nullPointerException, AbstractC2980h.class.getName());
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m5136e(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC2980h.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m5138g(nullPointerException, AbstractC2980h.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static int m5137f(int i, int i4) {
        if (i < i4) {
            return -1;
        }
        return i == i4 ? 0 : 1;
    }

    /* renamed from: g */
    public static void m5138g(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i = i4;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* renamed from: h */
    public static void m5139h(String str) {
        C0048u c0048u = new C0048u(AbstractC0008a1.m17m("lateinit property ", str, " has not been initialized"));
        m5138g(c0048u, AbstractC2980h.class.getName());
        throw c0048u;
    }

    /* renamed from: i */
    public static final Object[] m5140i(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i4 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i4 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i8 = ((i4 * 3) + 1) >>> 1;
                        if (i8 <= i4) {
                            i8 = 2147483645;
                            if (i4 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
                        m5135d("copyOf(...)", objArrCopyOf);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i4);
                        m5135d("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i4;
                }
            }
        }
        return f11112a;
    }

    /* renamed from: j */
    public static final Object[] m5141j(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    m5134c("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i4 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i4 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i8 = ((i4 * 3) + 1) >>> 1;
                        if (i8 <= i4) {
                            i8 = 2147483645;
                            if (i4 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
                        m5135d("copyOf(...)", objArrCopyOf);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i4] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i4);
                        m5135d("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i4;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
