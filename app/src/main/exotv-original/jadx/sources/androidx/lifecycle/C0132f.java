package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import p004a3.C0067e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public final class C0132f implements InterfaceC0160t {

    /* renamed from: j */
    public final /* synthetic */ int f906j = 1;

    /* renamed from: k */
    public final Object f907k;

    /* renamed from: l */
    public final Object f908l;

    public C0132f(InterfaceC0128d interfaceC0128d, InterfaceC0160t interfaceC0160t) {
        AbstractC2980h.m5136e("defaultLifecycleObserver", interfaceC0128d);
        this.f907k = interfaceC0128d;
        this.f908l = interfaceC0160t;
    }

    @Override // androidx.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public final void mo249c(InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f906j) {
            case 0:
                InterfaceC0128d interfaceC0128d = (InterfaceC0128d) this.f907k;
                switch (AbstractC0130e.f905a[enumC0146m.ordinal()]) {
                    case 1:
                        interfaceC0128d.getClass();
                        break;
                    case 2:
                        interfaceC0128d.onStart(interfaceC0164v);
                        break;
                    case 3:
                        interfaceC0128d.mo554b(interfaceC0164v);
                        break;
                    case 4:
                        interfaceC0128d.getClass();
                        break;
                    case 5:
                        interfaceC0128d.onStop(interfaceC0164v);
                        break;
                    case 6:
                        interfaceC0128d.onDestroy(interfaceC0164v);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0160t interfaceC0160t = (InterfaceC0160t) this.f908l;
                if (interfaceC0160t != null) {
                    interfaceC0160t.mo249c(interfaceC0164v, enumC0146m);
                    return;
                }
                return;
            case 1:
                if (enumC0146m == EnumC0146m.ON_START) {
                    ((AbstractC0150o) this.f907k).mo575i(this);
                    ((C0067e) this.f908l).m255f();
                    return;
                }
                return;
            default:
                HashMap map = ((C0122a) this.f908l).f886a;
                List list = (List) map.get(enumC0146m);
                Object obj = this.f907k;
                C0122a.m547a(list, interfaceC0164v, enumC0146m, obj);
                C0122a.m547a((List) map.get(EnumC0146m.ON_ANY), interfaceC0164v, enumC0146m, obj);
                return;
        }
    }

    public C0132f(InterfaceC0162u interfaceC0162u) {
        this.f907k = interfaceC0162u;
        C0126c c0126c = C0126c.f900c;
        Class<?> cls = interfaceC0162u.getClass();
        C0122a c0122a = (C0122a) c0126c.f901a.get(cls);
        this.f908l = c0122a == null ? c0126c.m553a(cls, null) : c0122a;
    }

    public C0132f(C0067e c0067e, AbstractC0150o abstractC0150o) {
        this.f907k = abstractC0150o;
        this.f908l = c0067e;
    }
}
