package com.bumptech.glide;

import com.bumptech.glide.load.data.C0732i;
import com.bumptech.glide.load.data.InterfaceC0729f;
import com.bumptech.glide.load.data.InterfaceC0730g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p002a1.C0016e;
import p005a4.C0073c;
import p041e4.C0903t;
import p041e4.C0904u;
import p041e4.C0906w;
import p041e4.C0907x;
import p041e4.InterfaceC0901r;
import p041e4.InterfaceC0902s;
import p090k2.C1584b;
import p096l0.C1644d;
import p109m4.C1897b;
import p109m4.C1898c;
import p109m4.InterfaceC1896a;
import p135p4.C2214a;
import p135p4.C2215b;
import p135p4.C2216c;
import p135p4.C2217d;
import p178u4.AbstractC2470e;
import p210y3.InterfaceC2798b;
import p210y3.InterfaceC2806j;
import p210y3.InterfaceC2807k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.h */
/* loaded from: classes.dex */
public final class C0719h {

    /* renamed from: a */
    public final C0904u f2816a;

    /* renamed from: b */
    public final C1898c f2817b;

    /* renamed from: c */
    public final C0016e f2818c;

    /* renamed from: d */
    public final C1898c f2819d;

    /* renamed from: e */
    public final C0732i f2820e;

    /* renamed from: f */
    public final C1898c f2821f;

    /* renamed from: g */
    public final C1898c f2822g;

    /* renamed from: h */
    public final C0016e f2823h = new C0016e(28);

    /* renamed from: i */
    public final C2215b f2824i = new C2215b();

    /* renamed from: j */
    public final C0073c f2825j;

    public C0719h() {
        C0073c c0073c = new C0073c(new C1644d(20), new C1584b(27), new C1584b(28));
        this.f2825j = c0073c;
        this.f2816a = new C0904u(c0073c);
        this.f2817b = new C1898c(1);
        this.f2818c = new C0016e(29);
        this.f2819d = new C1898c(3);
        this.f2820e = new C0732i();
        this.f2821f = new C1898c(0);
        this.f2822g = new C1898c(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C0016e c0016e = this.f2818c;
        synchronized (c0016e) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) c0016e.f62k);
                ((ArrayList) c0016e.f62k).clear();
                int size = arrayList.size();
                int i = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((ArrayList) c0016e.f62k).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c0016e.f62k).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m1611a(Class cls, Class cls2, InterfaceC0902s interfaceC0902s) {
        C0904u c0904u = this.f2816a;
        synchronized (c0904u) {
            C0907x c0907x = c0904u.f3934a;
            synchronized (c0907x) {
                try {
                    C0906w c0906w = new C0906w(cls, cls2, interfaceC0902s);
                    ArrayList arrayList = c0907x.f3948a;
                    arrayList.add(arrayList.size(), c0906w);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0904u.f3935b.f327a.clear();
        }
    }

    /* renamed from: b */
    public final void m1612b(Class cls, InterfaceC2798b interfaceC2798b) {
        C1898c c1898c = this.f2817b;
        synchronized (c1898c) {
            c1898c.f7107a.add(new C2214a(cls, interfaceC2798b));
        }
    }

    /* renamed from: c */
    public final void m1613c(Class cls, InterfaceC2807k interfaceC2807k) {
        C1898c c1898c = this.f2819d;
        synchronized (c1898c) {
            c1898c.f7107a.add(new C2217d(cls, interfaceC2807k));
        }
    }

    /* renamed from: d */
    public final void m1614d(String str, Class cls, Class cls2, InterfaceC2806j interfaceC2806j) {
        C0016e c0016e = this.f2818c;
        synchronized (c0016e) {
            c0016e.m32B(str).add(new C2216c(cls, cls2, interfaceC2806j));
        }
    }

    /* renamed from: e */
    public final ArrayList m1615e() {
        ArrayList arrayList;
        C1898c c1898c = this.f2822g;
        synchronized (c1898c) {
            arrayList = c1898c.f7107a;
        }
        if (arrayList.isEmpty()) {
            throw new C0718g("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List m1616f(Object obj) {
        List listUnmodifiableList;
        C0904u c0904u = this.f2816a;
        c0904u.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c0904u) {
            C0903t c0903t = (C0903t) c0904u.f3935b.f327a.get(cls);
            listUnmodifiableList = c0903t == null ? null : c0903t.f3933a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c0904u.f3934a.m2071b(cls));
                if (((C0903t) c0904u.f3935b.f327a.put(cls, new C0903t(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C0718g("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z7 = true;
        for (int i = 0; i < size; i++) {
            InterfaceC0901r interfaceC0901r = (InterfaceC0901r) listUnmodifiableList.get(i);
            if (interfaceC0901r.mo2049a(obj)) {
                if (z7) {
                    arrayList = new ArrayList(size - i);
                    z7 = false;
                }
                arrayList.add(interfaceC0901r);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new C0718g("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* renamed from: g */
    public final InterfaceC0730g m1617g(Object obj) {
        InterfaceC0730g interfaceC0730gMo1651b;
        C0732i c0732i = this.f2820e;
        synchronized (c0732i) {
            try {
                AbstractC2470e.m4445b(obj);
                InterfaceC0729f interfaceC0729f = (InterfaceC0729f) ((HashMap) c0732i.f2858k).get(obj.getClass());
                if (interfaceC0729f == null) {
                    Iterator it = ((HashMap) c0732i.f2858k).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC0729f interfaceC0729f2 = (InterfaceC0729f) it.next();
                        if (interfaceC0729f2.mo1650a().isAssignableFrom(obj.getClass())) {
                            interfaceC0729f = interfaceC0729f2;
                            break;
                        }
                    }
                }
                if (interfaceC0729f == null) {
                    interfaceC0729f = C0732i.f2856l;
                }
                interfaceC0730gMo1651b = interfaceC0729f.mo1651b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0730gMo1651b;
    }

    /* renamed from: h */
    public final void m1618h(InterfaceC0729f interfaceC0729f) {
        C0732i c0732i = this.f2820e;
        synchronized (c0732i) {
            ((HashMap) c0732i.f2858k).put(interfaceC0729f.mo1650a(), interfaceC0729f);
        }
    }

    /* renamed from: i */
    public final void m1619i(Class cls, Class cls2, InterfaceC1896a interfaceC1896a) {
        C1898c c1898c = this.f2821f;
        synchronized (c1898c) {
            c1898c.f7107a.add(new C1897b(cls, cls2, interfaceC1896a));
        }
    }
}
