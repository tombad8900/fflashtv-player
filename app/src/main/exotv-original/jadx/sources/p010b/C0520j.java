package p010b;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0120b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import p002a1.C0016e;
import p002a1.C0017e0;
import p028d.C0783a;
import p028d.C0784b;
import p061g7.C1054a;
import p061g7.C1060g;
import p061g7.C1065l;
import p062h.AbstractC1086l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.j */
/* loaded from: classes.dex */
public final class C0520j {

    /* renamed from: a */
    public final LinkedHashMap f2128a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f2129b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f2130c = new LinkedHashMap();

    /* renamed from: d */
    public final ArrayList f2131d = new ArrayList();

    /* renamed from: e */
    public final transient LinkedHashMap f2132e = new LinkedHashMap();

    /* renamed from: f */
    public final LinkedHashMap f2133f = new LinkedHashMap();

    /* renamed from: g */
    public final Bundle f2134g = new Bundle();

    /* renamed from: a */
    public final boolean m1242a(int i, int i4, Intent intent) {
        String str = (String) this.f2128a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0784b c0784b = (C0784b) this.f2132e.get(str);
        if ((c0784b != null ? c0784b.f3535a : null) != null) {
            ArrayList arrayList = this.f2131d;
            if (arrayList.contains(str)) {
                c0784b.f3535a.m70a(c0784b.f3536b.mo98D(intent, i4));
                arrayList.remove(str);
                return true;
            }
        }
        this.f2133f.remove(str);
        this.f2134g.putParcelable(str, new C0783a(intent, i4));
        return true;
    }

    /* renamed from: b */
    public final C0016e m1243b(String str, AbstractC0120b abstractC0120b, C0017e0 c0017e0) {
        Object parcelable;
        AbstractC2980h.m5136e("key", str);
        LinkedHashMap linkedHashMap = this.f2129b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new C1054a(new C1060g(0, new C1065l(0))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                Integer numValueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.f2128a;
                if (!linkedHashMap2.containsKey(numValueOf)) {
                    int iIntValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                    linkedHashMap.put(str, Integer.valueOf(iIntValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f2132e.put(str, new C0784b(c0017e0, abstractC0120b));
        LinkedHashMap linkedHashMap3 = this.f2133f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            c0017e0.m70a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f2134g;
        if (i >= 34) {
            parcelable = AbstractC1086l.m2293c(str, bundle);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0783a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0783a c0783a = (C0783a) parcelable;
        if (c0783a != null) {
            bundle.remove(str);
            c0017e0.m70a(abstractC0120b.mo98D(c0783a.f3534k, c0783a.f3533j));
        }
        return new C0016e(this, 10, str);
    }
}
