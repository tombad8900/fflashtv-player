package p220z6;

import java.util.List;
import p008a7.InterfaceC0113a;
import p008a7.InterfaceC0114b;
import p102l6.InterfaceC1684a;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2851l;
import p212y6.InterfaceC2855p;
import p212y6.InterfaceC2856q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.q */
/* loaded from: classes.dex */
public abstract class AbstractC2989q {
    /* renamed from: a */
    public static List m5144a(Object obj) {
        if ((obj instanceof InterfaceC0113a) && !(obj instanceof InterfaceC0114b)) {
            m5147d("kotlin.collections.MutableList", obj);
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC2980h.m5138g(e, AbstractC2989q.class.getName());
            throw e;
        }
    }

    /* renamed from: b */
    public static void m5145b(InterfaceC2855p interfaceC2855p) {
        if (interfaceC2855p == null || m5146c(2, interfaceC2855p)) {
            return;
        }
        m5147d("kotlin.jvm.functions.Function2", interfaceC2855p);
        throw null;
    }

    /* renamed from: c */
    public static boolean m5146c(int i, Object obj) {
        if (obj instanceof InterfaceC1684a) {
            if ((obj instanceof InterfaceC2978f ? ((InterfaceC2978f) obj).getArity() : obj instanceof InterfaceC2840a ? 0 : obj instanceof InterfaceC2851l ? 1 : obj instanceof InterfaceC2855p ? 2 : obj instanceof InterfaceC2856q ? 3 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m5147d(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC2980h.m5138g(classCastException, AbstractC2989q.class.getName());
        throw classCastException;
    }
}
