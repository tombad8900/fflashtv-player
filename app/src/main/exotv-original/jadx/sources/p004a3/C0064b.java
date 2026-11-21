package p004a3;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC0147m0;
import androidx.lifecycle.AbstractC0157r0;
import androidx.lifecycle.C0151o0;
import androidx.lifecycle.C0161t0;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.InterfaceC0136h;
import androidx.lifecycle.InterfaceC0160t;
import androidx.lifecycle.InterfaceC0163u0;
import androidx.lifecycle.InterfaceC0164v;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p002a1.AbstractC0008a1;
import p002a1.AbstractComponentCallbacksC0050v;
import p010b.C0518h;
import p062h.AbstractActivityC1083i;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a3.b */
/* loaded from: classes.dex */
public final class C0064b implements InterfaceC0160t {

    /* renamed from: j */
    public final /* synthetic */ int f304j;

    /* renamed from: k */
    public final Object f305k;

    public /* synthetic */ C0064b(int i, Object obj) {
        this.f304j = i;
        this.f305k = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public final void mo249c(InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        switch (this.f304j) {
            case 0:
                InterfaceC0068f interfaceC0068f = (InterfaceC0068f) this.f305k;
                if (enumC0146m != EnumC0146m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0164v.mo224e().mo575i(this);
                Bundle bundleM252c = interfaceC0068f.mo223c().m252c("androidx.savedstate.Restarter");
                if (bundleM252c == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM252c.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, C0064b.class.getClassLoader()).asSubclass(InterfaceC0065c.class);
                        AbstractC2980h.m5135d("{\n                Class.\u2026class.java)\n            }", clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC2980h.m5135d("{\n                constr\u2026wInstance()\n            }", objNewInstance);
                                if (!(interfaceC0068f instanceof InterfaceC0163u0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                C0161t0 c0161t0Mo222b = ((InterfaceC0163u0) interfaceC0068f).mo222b();
                                C0067e c0067eMo223c = interfaceC0068f.mo223c();
                                c0161t0Mo222b.getClass();
                                LinkedHashMap linkedHashMap = c0161t0Mo222b.f946a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    AbstractC2980h.m5136e("key", str3);
                                    AbstractC0157r0 abstractC0157r0 = (AbstractC0157r0) linkedHashMap.get(str3);
                                    AbstractC2980h.m5133b(abstractC0157r0);
                                    AbstractC0147m0.m564c(abstractC0157r0, c0067eMo223c, interfaceC0068f.mo224e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c0067eMo223c.m255f();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC0008a1.m25u("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e8) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException(AbstractC0008a1.m17m("Class ", str2, " wasn't found"), e9);
                    }
                }
                return;
            case 1:
                if (enumC0146m != EnumC0146m.ON_STOP || (view = ((AbstractComponentCallbacksC0050v) this.f305k).f222N) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                new HashMap();
                InterfaceC0136h[] interfaceC0136hArr = (InterfaceC0136h[]) this.f305k;
                if (interfaceC0136hArr.length > 0) {
                    InterfaceC0136h interfaceC0136h = interfaceC0136hArr[0];
                    throw null;
                }
                if (interfaceC0136hArr.length <= 0) {
                    return;
                }
                InterfaceC0136h interfaceC0136h2 = interfaceC0136hArr[0];
                throw null;
            case 3:
                if (enumC0146m != EnumC0146m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0146m).toString());
                }
                interfaceC0164v.mo224e().mo575i(this);
                C0151o0 c0151o0 = (C0151o0) this.f305k;
                if (c0151o0.f935b) {
                    return;
                }
                Bundle bundleM252c2 = c0151o0.f934a.m252c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = c0151o0.f936c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (bundleM252c2 != null) {
                    bundle.putAll(bundleM252c2);
                }
                c0151o0.f936c = bundle;
                c0151o0.f935b = true;
                return;
            default:
                AbstractActivityC1083i abstractActivityC1083i = (AbstractActivityC1083i) this.f305k;
                if (abstractActivityC1083i.f2141n == null) {
                    C0518h c0518h = (C0518h) abstractActivityC1083i.getLastNonConfigurationInstance();
                    if (c0518h != null) {
                        abstractActivityC1083i.f2141n = c0518h.f2123a;
                    }
                    if (abstractActivityC1083i.f2141n == null) {
                        abstractActivityC1083i.f2141n = new C0161t0();
                    }
                }
                abstractActivityC1083i.f2201j.mo575i(this);
                return;
        }
    }
}
