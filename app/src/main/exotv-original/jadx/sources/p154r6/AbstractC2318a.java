package p154r6;

import com.bumptech.glide.AbstractC0714c;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p005a4.C0073c;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r6.a */
/* loaded from: classes.dex */
public abstract class AbstractC2318a implements InterfaceC2222c, InterfaceC2321d, Serializable {

    /* renamed from: j */
    public final InterfaceC2222c f8129j;

    public AbstractC2318a(InterfaceC2222c interfaceC2222c) {
        this.f8129j = interfaceC2222c;
    }

    @Override // p154r6.InterfaceC2321d
    /* renamed from: a */
    public final InterfaceC2321d mo2800a() {
        InterfaceC2222c interfaceC2222c = this.f8129j;
        if (interfaceC2222c instanceof InterfaceC2321d) {
            return (InterfaceC2321d) interfaceC2222c;
        }
        return null;
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: d */
    public final void mo2248d(Object obj) {
        InterfaceC2222c interfaceC2222c = this;
        while (true) {
            AbstractC2318a abstractC2318a = (AbstractC2318a) interfaceC2222c;
            InterfaceC2222c interfaceC2222c2 = abstractC2318a.f8129j;
            AbstractC2980h.m5133b(interfaceC2222c2);
            try {
                obj = abstractC2318a.mo578h(obj);
                if (obj == EnumC2273a.f7953j) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0714c.m1539y(th);
            }
            abstractC2318a.mo4102k();
            if (!(interfaceC2222c2 instanceof AbstractC2318a)) {
                interfaceC2222c2.mo2248d(obj);
                return;
            }
            interfaceC2222c = interfaceC2222c2;
        }
    }

    /* renamed from: g */
    public InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: h */
    public abstract Object mo578h(Object obj);

    /* renamed from: k */
    public void mo4102k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strM4103c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC2322e interfaceC2322e = (InterfaceC2322e) getClass().getAnnotation(InterfaceC2322e.class);
        String name = null;
        if (interfaceC2322e != null) {
            int iM4107v = interfaceC2322e.m4107v();
            if (iM4107v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM4107v + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i = iIntValue >= 0 ? interfaceC2322e.m4105l()[iIntValue] : -1;
            C0073c c0073c = AbstractC2323f.f8134b;
            C0073c c0073c2 = AbstractC2323f.f8133a;
            if (c0073c == null) {
                try {
                    C0073c c0073c3 = new C0073c(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 21);
                    AbstractC2323f.f8134b = c0073c3;
                    c0073c = c0073c3;
                } catch (Exception unused2) {
                    AbstractC2323f.f8134b = c0073c2;
                    c0073c = c0073c2;
                }
            }
            if (c0073c != c0073c2 && (method = (Method) c0073c.f324k) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0073c.f325l) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = (Method) c0073c.f326m;
                String strInvoke = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (strInvoke instanceof String) {
                    name = strInvoke;
                }
            }
            if (name == null) {
                strM4103c = interfaceC2322e.m4103c();
            } else {
                strM4103c = name + '/' + interfaceC2322e.m4103c();
            }
            name = new StackTraceElement(strM4103c, interfaceC2322e.m4106m(), interfaceC2322e.m4104f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append((Object) name);
        return sb.toString();
    }
}
