package p172t6;

import java.lang.reflect.Method;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t6.a */
/* loaded from: classes.dex */
public abstract class AbstractC2437a {

    /* renamed from: a */
    public static final Method f8789a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC2980h.m5133b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC2980h.m5132a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC2980h.m5135d("getParameterTypes(...)", parameterTypes);
                if (AbstractC2980h.m5132a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f8789a = method;
        int length2 = methods.length;
        for (int i4 = 0; i4 < length2 && !AbstractC2980h.m5132a(methods[i4].getName(), "getSuppressed"); i4++) {
        }
    }
}
