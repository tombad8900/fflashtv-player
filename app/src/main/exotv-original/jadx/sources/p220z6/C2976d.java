package p220z6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p053f7.InterfaceC1025b;
import p069h7.AbstractC1206h;
import p102l6.C1687d;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1915j;
import p111m6.AbstractC1924s;
import p168t2.AbstractC2429w;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2841b;
import p212y6.InterfaceC2842c;
import p212y6.InterfaceC2843d;
import p212y6.InterfaceC2844e;
import p212y6.InterfaceC2845f;
import p212y6.InterfaceC2846g;
import p212y6.InterfaceC2847h;
import p212y6.InterfaceC2848i;
import p212y6.InterfaceC2849j;
import p212y6.InterfaceC2850k;
import p212y6.InterfaceC2851l;
import p212y6.InterfaceC2852m;
import p212y6.InterfaceC2853n;
import p212y6.InterfaceC2854o;
import p212y6.InterfaceC2855p;
import p212y6.InterfaceC2856q;
import p212y6.InterfaceC2857r;
import p212y6.InterfaceC2858s;
import p212y6.InterfaceC2859t;
import p212y6.InterfaceC2860u;
import p212y6.InterfaceC2861v;
import p212y6.InterfaceC2862w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.d */
/* loaded from: classes.dex */
public final class C2976d implements InterfaceC1025b, InterfaceC2975c {

    /* renamed from: b */
    public static final Map f11106b;

    /* renamed from: c */
    public static final HashMap f11107c;

    /* renamed from: d */
    public static final LinkedHashMap f11108d;

    /* renamed from: a */
    public final Class f11109a;

    static {
        List listM3753t0 = AbstractC1914i.m3753t0(InterfaceC2840a.class, InterfaceC2851l.class, InterfaceC2855p.class, InterfaceC2856q.class, InterfaceC2857r.class, InterfaceC2858s.class, InterfaceC2859t.class, InterfaceC2860u.class, InterfaceC2861v.class, InterfaceC2862w.class, InterfaceC2841b.class, InterfaceC2842c.class, InterfaceC2843d.class, InterfaceC2844e.class, InterfaceC2845f.class, InterfaceC2846g.class, InterfaceC2847h.class, InterfaceC2848i.class, InterfaceC2849j.class, InterfaceC2850k.class, InterfaceC2852m.class, InterfaceC2853n.class, InterfaceC2854o.class);
        ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(listM3753t0));
        int i = 0;
        for (Object obj : listM3753t0) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC1914i.m3755v0();
                throw null;
            }
            arrayList.add(new C1687d((Class) obj, Integer.valueOf(i)));
            i = i4;
        }
        f11106b = AbstractC1924s.m3762W(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC2980h.m5135d("<get-values>(...)", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC2980h.m5133b(str);
            sb.append(AbstractC1206h.m2641O0(str, '.', str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f11106b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f11107c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1924s.m3759T(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC2980h.m5133b(str2);
            linkedHashMap.put(key, AbstractC1206h.m2641O0(str2, '.', str2));
        }
        f11108d = linkedHashMap;
    }

    public C2976d(Class cls) {
        this.f11109a = cls;
    }

    @Override // p220z6.InterfaceC2975c
    /* renamed from: a */
    public final Class mo5130a() {
        return this.f11109a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2976d) && AbstractC2429w.m4304i(this).equals(AbstractC2429w.m4304i((InterfaceC1025b) obj));
    }

    public final int hashCode() {
        return AbstractC2429w.m4304i(this).hashCode();
    }

    public final String toString() {
        return this.f11109a + " (Kotlin reflection is not available)";
    }
}
