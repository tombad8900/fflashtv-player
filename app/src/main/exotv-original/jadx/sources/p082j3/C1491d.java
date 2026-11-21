package p082j3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p069h7.AbstractC1206h;
import p111m6.C1911f;
import p182v.C2490e;
import p189v7.AbstractC2585p;
import p189v7.C2558b0;
import p189v7.C2591v;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2987o;
import p220z6.C2976d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.d */
/* loaded from: classes.dex */
public final class C1491d extends AbstractC2585p {

    /* renamed from: b */
    public final AbstractC2585p f5737b;

    public C1491d(AbstractC2585p abstractC2585p) {
        AbstractC2980h.m5136e("delegate", abstractC2585p);
        this.f5737b = abstractC2585p;
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: a */
    public final InterfaceC2572i0 mo3155a(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("file", c2558b0);
        return this.f5737b.mo3155a(c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: b */
    public final void mo3156b(C2558b0 c2558b0, C2558b0 c2558b02) {
        AbstractC2980h.m5136e("source", c2558b0);
        AbstractC2980h.m5136e("target", c2558b02);
        this.f5737b.mo3156b(c2558b0, c2558b02);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: c */
    public final void mo3157c(C2558b0 c2558b0) {
        this.f5737b.mo3157c(c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: d */
    public final void mo3158d(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("path", c2558b0);
        this.f5737b.mo3158d(c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: g */
    public final List mo3159g(C2558b0 c2558b0) {
        List<C2558b0> listMo3159g = this.f5737b.mo3159g(c2558b0);
        ArrayList arrayList = new ArrayList();
        for (C2558b0 c2558b02 : listMo3159g) {
            AbstractC2980h.m5136e("path", c2558b02);
            arrayList.add(c2558b02);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: i */
    public final C2490e mo3160i(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("path", c2558b0);
        C2490e c2490eMo3160i = this.f5737b.mo3160i(c2558b0);
        if (c2490eMo3160i == null) {
            return null;
        }
        C2558b0 c2558b02 = (C2558b0) c2490eMo3160i.f9091d;
        if (c2558b02 == null) {
            return c2490eMo3160i;
        }
        boolean z7 = c2490eMo3160i.f9089b;
        boolean z8 = c2490eMo3160i.f9090c;
        Long l8 = (Long) c2490eMo3160i.f9092e;
        Long l9 = (Long) c2490eMo3160i.f9093f;
        Long l10 = (Long) c2490eMo3160i.f9094g;
        Long l11 = (Long) c2490eMo3160i.f9095h;
        Map map = (Map) c2490eMo3160i.f9096i;
        AbstractC2980h.m5136e("extras", map);
        return new C2490e(z7, z8, c2558b02, l8, l9, l10, l11, map);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: j */
    public final C2591v mo3161j(C2558b0 c2558b0) {
        return this.f5737b.mo3161j(c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: k */
    public final InterfaceC2572i0 mo3162k(C2558b0 c2558b0) {
        C2558b0 c2558b0M4588b = c2558b0.m4588b();
        AbstractC2585p abstractC2585p = this.f5737b;
        if (c2558b0M4588b != null) {
            C1911f c1911f = new C1911f();
            while (c2558b0M4588b != null && !m4678f(c2558b0M4588b)) {
                c1911f.addFirst(c2558b0M4588b);
                c2558b0M4588b = c2558b0M4588b.m4588b();
            }
            Iterator<E> it = c1911f.iterator();
            while (it.hasNext()) {
                C2558b0 c2558b02 = (C2558b0) it.next();
                AbstractC2980h.m5136e("dir", c2558b02);
                abstractC2585p.mo3157c(c2558b02);
            }
        }
        return abstractC2585p.mo3162k(c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: l */
    public final InterfaceC2576k0 mo3163l(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("file", c2558b0);
        return this.f5737b.mo3163l(c2558b0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        C2976d c2976dM5142a = AbstractC2987o.m5142a(C1491d.class);
        LinkedHashMap linkedHashMap = C2976d.f11108d;
        Class cls = c2976dM5142a.f11109a;
        String simpleName = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName2 = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    simpleName = AbstractC1206h.m2640N0(simpleName2, enclosingMethod.getName() + '$', simpleName2);
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        simpleName = AbstractC1206h.m2640N0(simpleName2, enclosingConstructor.getName() + '$', simpleName2);
                    } else {
                        simpleName = AbstractC1206h.m2639M0(simpleName2, '$', simpleName2);
                    }
                }
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                    simpleName = str.concat("Array");
                }
                if (simpleName == null) {
                    simpleName = "Array";
                }
            } else {
                simpleName = (String) linkedHashMap.get(cls.getName());
                if (simpleName == null) {
                    simpleName = cls.getSimpleName();
                }
            }
        }
        sb.append(simpleName);
        sb.append('(');
        sb.append(this.f5737b);
        sb.append(')');
        return sb.toString();
    }
}
