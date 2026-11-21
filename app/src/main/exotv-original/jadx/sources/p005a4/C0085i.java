package p005a4;

import com.bumptech.glide.C0716e;
import com.bumptech.glide.C0718g;
import com.bumptech.glide.C0719h;
import com.bumptech.glide.EnumC0717f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002a1.C0016e;
import p041e4.C0900q;
import p041e4.InterfaceC0901r;
import p058g4.C1048c;
import p109m4.C1897b;
import p109m4.C1898c;
import p109m4.C1899d;
import p109m4.InterfaceC1896a;
import p135p4.C2214a;
import p135p4.C2215b;
import p135p4.C2216c;
import p178u4.C2476k;
import p210y3.C2804h;
import p210y3.InterfaceC2798b;
import p210y3.InterfaceC2801e;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.i */
/* loaded from: classes.dex */
public final class C0085i {

    /* renamed from: a */
    public final ArrayList f366a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f367b = new ArrayList();

    /* renamed from: c */
    public C0716e f368c;

    /* renamed from: d */
    public Object f369d;

    /* renamed from: e */
    public int f370e;

    /* renamed from: f */
    public int f371f;

    /* renamed from: g */
    public Class f372g;

    /* renamed from: h */
    public C0095p f373h;

    /* renamed from: i */
    public C2804h f374i;

    /* renamed from: j */
    public Map f375j;

    /* renamed from: k */
    public Class f376k;

    /* renamed from: l */
    public boolean f377l;

    /* renamed from: m */
    public boolean f378m;

    /* renamed from: n */
    public InterfaceC2801e f379n;

    /* renamed from: o */
    public EnumC0717f f380o;

    /* renamed from: p */
    public C0093n f381p;

    /* renamed from: q */
    public boolean f382q;

    /* renamed from: r */
    public boolean f383r;

    /* renamed from: a */
    public final ArrayList m312a() {
        boolean z7 = this.f378m;
        ArrayList arrayList = this.f367b;
        if (!z7) {
            this.f378m = true;
            arrayList.clear();
            ArrayList arrayListM313b = m313b();
            int size = arrayListM313b.size();
            for (int i = 0; i < size; i++) {
                C0900q c0900q = (C0900q) arrayListM313b.get(i);
                InterfaceC2801e interfaceC2801e = c0900q.f3930a;
                List list = c0900q.f3931b;
                if (!arrayList.contains(interfaceC2801e)) {
                    arrayList.add(c0900q.f3930a);
                }
                for (int i4 = 0; i4 < list.size(); i4++) {
                    if (!arrayList.contains(list.get(i4))) {
                        arrayList.add(list.get(i4));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final ArrayList m313b() {
        boolean z7 = this.f377l;
        ArrayList arrayList = this.f366a;
        if (!z7) {
            this.f377l = true;
            arrayList.clear();
            List listM1616f = this.f368c.m1610a().m1616f(this.f369d);
            int size = listM1616f.size();
            for (int i = 0; i < size; i++) {
                C0900q c0900qMo2050b = ((InterfaceC0901r) listM1616f.get(i)).mo2050b(this.f369d, this.f370e, this.f371f, this.f374i);
                if (c0900qMo2050b != null) {
                    arrayList.add(c0900qMo2050b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final C0076d0 m314c(Class cls) {
        C0076d0 c0076d0;
        Class cls2;
        Class cls3;
        Class cls4;
        C0076d0 c0076d02;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC1896a interfaceC1896a;
        Class cls5 = cls;
        C0719h c0719hM1610a = this.f368c.m1610a();
        Class cls6 = this.f372g;
        Class cls7 = this.f376k;
        C2215b c2215b = c0719hM1610a.f2824i;
        C2476k c2476k = (C2476k) c2215b.f7737b.getAndSet(null);
        if (c2476k == null) {
            c2476k = new C2476k();
        }
        c2476k.f9065a = cls5;
        c2476k.f9066b = cls6;
        c2476k.f9067c = cls7;
        synchronized (c2215b.f7736a) {
            c0076d0 = (C0076d0) c2215b.f7736a.get(c2476k);
        }
        c2215b.f7737b.set(c2476k);
        c0719hM1610a.f2824i.getClass();
        if (C2215b.f7735c.equals(c0076d0)) {
            return null;
        }
        if (c0076d0 != null) {
            return c0076d0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListM34D = c0719hM1610a.f2818c.m34D(cls5, cls6);
        int size = arrayListM34D.size();
        int i = 0;
        while (i < size) {
            int i4 = i + 1;
            Class<?> cls8 = (Class) arrayListM34D.get(i);
            ArrayList arrayListM3673b = c0719hM1610a.f2821f.m3673b(cls8, cls7);
            int size2 = arrayListM3673b.size();
            int i8 = 0;
            while (i8 < size2) {
                int i9 = i8 + 1;
                Class cls9 = (Class) arrayListM3673b.get(i8);
                C0016e c0016e = c0719hM1610a.f2818c;
                synchronized (c0016e) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) c0016e.f62k;
                    int size3 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj = arrayList4.get(i10);
                        int i11 = i10 + 1;
                        String str = (String) obj;
                        ArrayList arrayList5 = arrayListM3673b;
                        List list = (List) ((HashMap) c0016e.f63l).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C2216c c2216c = (C2216c) it.next();
                                Iterator it2 = it;
                                if (c2216c.f7738a.isAssignableFrom(cls5) && cls8.isAssignableFrom(c2216c.f7739b)) {
                                    arrayList.add(c2216c.f7740c);
                                }
                                it = it2;
                            }
                        }
                        arrayListM3673b = arrayList5;
                        i10 = i11;
                    }
                    arrayList2 = arrayListM3673b;
                }
                C1898c c1898c = c0719hM1610a.f2821f;
                synchronized (c1898c) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        ArrayList arrayList6 = c1898c.f7107a;
                        int size4 = arrayList6.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            Object obj2 = arrayList6.get(i12);
                            i12++;
                            C1897b c1897b = (C1897b) obj2;
                            ArrayList arrayList7 = arrayList6;
                            if (c1897b.f7104a.isAssignableFrom(cls8) && cls9.isAssignableFrom(c1897b.f7105b)) {
                                interfaceC1896a = c1897b.f7106c;
                            } else {
                                cls5 = cls;
                                arrayList6 = arrayList7;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC1896a = C1899d.f7108k;
                }
                arrayList3.add(new C0092m(cls5, cls8, cls9, arrayList, interfaceC1896a, c0719hM1610a.f2825j));
                cls5 = cls;
                size2 = size2;
                i8 = i9;
                arrayListM3673b = arrayList2;
            }
            cls5 = cls;
            i = i4;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c0076d02 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c0076d02 = new C0076d0(cls2, cls3, cls4, arrayList3, c0719hM1610a.f2825j);
        }
        C2215b c2215b2 = c0719hM1610a.f2824i;
        synchronized (c2215b2.f7736a) {
            c2215b2.f7736a.put(new C2476k(cls2, cls3, cls4), c0076d02 != null ? c0076d02 : C2215b.f7735c);
        }
        return c0076d02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r1 = r5.f7734b;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2798b m315d(Object obj) {
        InterfaceC2798b interfaceC2798b;
        C1898c c1898c = this.f368c.m1610a().f2817b;
        Class<?> cls = obj.getClass();
        synchronized (c1898c) {
            ArrayList arrayList = c1898c.f7107a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    interfaceC2798b = null;
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                C2214a c2214a = (C2214a) obj2;
                if (c2214a.f7733a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC2798b != null) {
            return interfaceC2798b;
        }
        throw new C0718g("Failed to find source encoder for data class: " + obj.getClass());
    }

    /* renamed from: e */
    public final InterfaceC2808l m316e(Class cls) {
        InterfaceC2808l interfaceC2808l = (InterfaceC2808l) this.f375j.get(cls);
        if (interfaceC2808l == null) {
            Iterator it = this.f375j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC2808l = (InterfaceC2808l) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC2808l != null) {
            return interfaceC2808l;
        }
        if (!this.f375j.isEmpty() || !this.f382q) {
            return C1048c.f4461b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
