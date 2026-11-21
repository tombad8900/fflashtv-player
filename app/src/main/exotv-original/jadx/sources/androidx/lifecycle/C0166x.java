package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p004a3.C0064b;
import p094k7.C1608a;
import p113n.C1947a;
import p120o.C2029a;
import p120o.C2030b;
import p120o.C2031c;
import p120o.C2032d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public final class C0166x extends AbstractC0150o {

    /* renamed from: k */
    public final boolean f949k;

    /* renamed from: l */
    public C2029a f950l;

    /* renamed from: m */
    public EnumC0148n f951m;

    /* renamed from: n */
    public final WeakReference f952n;

    /* renamed from: o */
    public int f953o;

    /* renamed from: p */
    public boolean f954p;

    /* renamed from: q */
    public boolean f955q;

    /* renamed from: r */
    public final ArrayList f956r;

    /* renamed from: s */
    public final C1608a f957s;

    public C0166x(InterfaceC0164v interfaceC0164v) {
        super(0);
        this.f949k = true;
        this.f950l = new C2029a();
        EnumC0148n enumC0148n = EnumC0148n.f926k;
        this.f951m = enumC0148n;
        this.f956r = new ArrayList();
        this.f952n = new WeakReference(interfaceC0164v);
        this.f957s = new C1608a(enumC0148n);
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: a */
    public final void mo568a(InterfaceC0162u interfaceC0162u) {
        InterfaceC0160t c0132f;
        Object obj;
        InterfaceC0164v interfaceC0164v;
        AbstractC2980h.m5136e("observer", interfaceC0162u);
        m584k("addObserver");
        EnumC0148n enumC0148n = this.f951m;
        EnumC0148n enumC0148n2 = EnumC0148n.f925j;
        if (enumC0148n != enumC0148n2) {
            enumC0148n2 = EnumC0148n.f926k;
        }
        C0165w c0165w = new C0165w();
        HashMap map = AbstractC0167y.f958a;
        boolean z7 = interfaceC0162u instanceof InterfaceC0160t;
        boolean z8 = interfaceC0162u instanceof InterfaceC0128d;
        int i = 2;
        if (z7 && z8) {
            c0132f = new C0132f((InterfaceC0128d) interfaceC0162u, (InterfaceC0160t) interfaceC0162u);
        } else if (z8) {
            c0132f = new C0132f((InterfaceC0128d) interfaceC0162u, (InterfaceC0160t) null);
        } else if (z7) {
            c0132f = (InterfaceC0160t) interfaceC0162u;
        } else {
            Class<?> cls = interfaceC0162u.getClass();
            if (AbstractC0167y.m590b(cls) == 2) {
                Object obj2 = AbstractC0167y.f959b.get(cls);
                AbstractC2980h.m5133b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0167y.m589a((Constructor) list.get(0), interfaceC0162u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0136h[] interfaceC0136hArr = new InterfaceC0136h[size];
                if (size > 0) {
                    AbstractC0167y.m589a((Constructor) list.get(0), interfaceC0162u);
                    throw null;
                }
                c0132f = new C0064b(i, interfaceC0136hArr);
            } else {
                c0132f = new C0132f(interfaceC0162u);
            }
        }
        c0165w.f948b = c0132f;
        c0165w.f947a = enumC0148n2;
        C2029a c2029a = this.f950l;
        C2031c c2031cMo3921a = c2029a.mo3921a(interfaceC0162u);
        if (c2031cMo3921a != null) {
            obj = c2031cMo3921a.f7493k;
        } else {
            HashMap map2 = c2029a.f7488n;
            C2031c c2031c = new C2031c(interfaceC0162u, c0165w);
            c2029a.f7502m++;
            C2031c c2031c2 = c2029a.f7500k;
            if (c2031c2 == null) {
                c2029a.f7499j = c2031c;
                c2029a.f7500k = c2031c;
            } else {
                c2031c2.f7494l = c2031c;
                c2031c.f7495m = c2031c2;
                c2029a.f7500k = c2031c;
            }
            map2.put(interfaceC0162u, c2031c);
            obj = null;
        }
        if (((C0165w) obj) == null && (interfaceC0164v = (InterfaceC0164v) this.f952n.get()) != null) {
            boolean z9 = this.f953o != 0 || this.f954p;
            EnumC0148n enumC0148nM583j = m583j(interfaceC0162u);
            this.f953o++;
            while (c0165w.f947a.compareTo(enumC0148nM583j) < 0 && this.f950l.f7488n.containsKey(interfaceC0162u)) {
                EnumC0148n enumC0148n3 = c0165w.f947a;
                ArrayList arrayList = this.f956r;
                arrayList.add(enumC0148n3);
                C0142k c0142k = EnumC0146m.Companion;
                EnumC0148n enumC0148n4 = c0165w.f947a;
                c0142k.getClass();
                AbstractC2980h.m5136e("state", enumC0148n4);
                int iOrdinal = enumC0148n4.ordinal();
                EnumC0146m enumC0146m = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0146m.ON_RESUME : EnumC0146m.ON_START : EnumC0146m.ON_CREATE;
                if (enumC0146m == null) {
                    throw new IllegalStateException("no event up from " + c0165w.f947a);
                }
                c0165w.m582a(interfaceC0164v, enumC0146m);
                arrayList.remove(arrayList.size() - 1);
                enumC0148nM583j = m583j(interfaceC0162u);
            }
            if (!z9) {
                m588o();
            }
            this.f953o--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: b */
    public final EnumC0148n mo569b() {
        return this.f951m;
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: i */
    public final void mo575i(InterfaceC0162u interfaceC0162u) {
        AbstractC2980h.m5136e("observer", interfaceC0162u);
        m584k("removeObserver");
        this.f950l.mo3922b(interfaceC0162u);
    }

    /* renamed from: j */
    public final EnumC0148n m583j(InterfaceC0162u interfaceC0162u) {
        C0165w c0165w;
        HashMap map = this.f950l.f7488n;
        C2031c c2031c = map.containsKey(interfaceC0162u) ? ((C2031c) map.get(interfaceC0162u)).f7495m : null;
        EnumC0148n enumC0148n = (c2031c == null || (c0165w = (C0165w) c2031c.f7493k) == null) ? null : c0165w.f947a;
        ArrayList arrayList = this.f956r;
        EnumC0148n enumC0148n2 = arrayList.isEmpty() ? null : (EnumC0148n) arrayList.get(arrayList.size() - 1);
        EnumC0148n enumC0148n3 = this.f951m;
        AbstractC2980h.m5136e("state1", enumC0148n3);
        if (enumC0148n == null || enumC0148n.compareTo(enumC0148n3) >= 0) {
            enumC0148n = enumC0148n3;
        }
        return (enumC0148n2 == null || enumC0148n2.compareTo(enumC0148n) >= 0) ? enumC0148n : enumC0148n2;
    }

    /* renamed from: k */
    public final void m584k(String str) {
        if (this.f949k) {
            ((C1947a) C1947a.m3804s0().f7240n).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0008a1.m17m("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: l */
    public final void m585l(EnumC0146m enumC0146m) {
        AbstractC2980h.m5136e("event", enumC0146m);
        m584k("handleLifecycleEvent");
        m586m(enumC0146m.m563a());
    }

    /* renamed from: m */
    public final void m586m(EnumC0148n enumC0148n) {
        EnumC0148n enumC0148n2 = this.f951m;
        if (enumC0148n2 == enumC0148n) {
            return;
        }
        EnumC0148n enumC0148n3 = EnumC0148n.f926k;
        EnumC0148n enumC0148n4 = EnumC0148n.f925j;
        if (enumC0148n2 == enumC0148n3 && enumC0148n == enumC0148n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0148n + ", but was " + this.f951m + " in component " + this.f952n.get()).toString());
        }
        this.f951m = enumC0148n;
        if (this.f954p || this.f953o != 0) {
            this.f955q = true;
            return;
        }
        this.f954p = true;
        m588o();
        this.f954p = false;
        if (this.f951m == enumC0148n4) {
            this.f950l = new C2029a();
        }
    }

    /* renamed from: n */
    public final void m587n() {
        m584k("setCurrentState");
        m586m(EnumC0148n.f927l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r12.f955q = false;
        r0 = r12.f957s;
        r1 = r12.f951m;
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r1 = p103l7.AbstractC1695a.f6500a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r2 = p094k7.C1608a.f6108c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (p220z6.AbstractC2980h.m5132a(r2.get(r0), r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r2.set(r0, r1);
        r1 = r0.f6109b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if ((r1 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r1 = r1 + 1;
        r0.f6109b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r2 = r0.f6109b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r2 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r0.f6109b = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        r0.f6109b = r1 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        return;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m588o() {
        ArrayList arrayList = this.f956r;
        InterfaceC0164v interfaceC0164v = (InterfaceC0164v) this.f952n.get();
        if (interfaceC0164v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C2029a c2029a = this.f950l;
            if (c2029a.f7502m != 0) {
                C2031c c2031c = c2029a.f7499j;
                AbstractC2980h.m5133b(c2031c);
                EnumC0148n enumC0148n = ((C0165w) c2031c.f7493k).f947a;
                C2031c c2031c2 = this.f950l.f7500k;
                AbstractC2980h.m5133b(c2031c2);
                EnumC0148n enumC0148n2 = ((C0165w) c2031c2.f7493k).f947a;
                if (enumC0148n == enumC0148n2 && this.f951m == enumC0148n2) {
                    break;
                }
                this.f955q = false;
                EnumC0148n enumC0148n3 = this.f951m;
                C2031c c2031c3 = this.f950l.f7499j;
                AbstractC2980h.m5133b(c2031c3);
                if (enumC0148n3.compareTo(((C0165w) c2031c3.f7493k).f947a) < 0) {
                    C2029a c2029a2 = this.f950l;
                    C2030b c2030b = new C2030b(c2029a2.f7500k, c2029a2.f7499j, 1);
                    c2029a2.f7501l.put(c2030b, Boolean.FALSE);
                    while (c2030b.hasNext() && !this.f955q) {
                        Map.Entry entry = (Map.Entry) c2030b.next();
                        AbstractC2980h.m5135d("next()", entry);
                        InterfaceC0162u interfaceC0162u = (InterfaceC0162u) entry.getKey();
                        C0165w c0165w = (C0165w) entry.getValue();
                        while (c0165w.f947a.compareTo(this.f951m) > 0 && !this.f955q && this.f950l.f7488n.containsKey(interfaceC0162u)) {
                            C0142k c0142k = EnumC0146m.Companion;
                            EnumC0148n enumC0148n4 = c0165w.f947a;
                            c0142k.getClass();
                            AbstractC2980h.m5136e("state", enumC0148n4);
                            int iOrdinal = enumC0148n4.ordinal();
                            EnumC0146m enumC0146m = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0146m.ON_PAUSE : EnumC0146m.ON_STOP : EnumC0146m.ON_DESTROY;
                            if (enumC0146m == null) {
                                throw new IllegalStateException("no event down from " + c0165w.f947a);
                            }
                            arrayList.add(enumC0146m.m563a());
                            c0165w.m582a(interfaceC0164v, enumC0146m);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C2031c c2031c4 = this.f950l.f7500k;
                if (!this.f955q && c2031c4 != null && this.f951m.compareTo(((C0165w) c2031c4.f7493k).f947a) > 0) {
                    C2029a c2029a3 = this.f950l;
                    c2029a3.getClass();
                    C2032d c2032d = new C2032d(c2029a3);
                    c2029a3.f7501l.put(c2032d, Boolean.FALSE);
                    while (c2032d.hasNext() && !this.f955q) {
                        Map.Entry entry2 = (Map.Entry) c2032d.next();
                        InterfaceC0162u interfaceC0162u2 = (InterfaceC0162u) entry2.getKey();
                        C0165w c0165w2 = (C0165w) entry2.getValue();
                        while (c0165w2.f947a.compareTo(this.f951m) < 0 && !this.f955q && this.f950l.f7488n.containsKey(interfaceC0162u2)) {
                            arrayList.add(c0165w2.f947a);
                            C0142k c0142k2 = EnumC0146m.Companion;
                            EnumC0148n enumC0148n5 = c0165w2.f947a;
                            c0142k2.getClass();
                            AbstractC2980h.m5136e("state", enumC0148n5);
                            int iOrdinal2 = enumC0148n5.ordinal();
                            EnumC0146m enumC0146m2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0146m.ON_RESUME : EnumC0146m.ON_START : EnumC0146m.ON_CREATE;
                            if (enumC0146m2 == null) {
                                throw new IllegalStateException("no event up from " + c0165w2.f947a);
                            }
                            c0165w2.m582a(interfaceC0164v, enumC0146m2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
