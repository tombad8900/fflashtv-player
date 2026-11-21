package p005a4;

import com.bumptech.glide.C0719h;
import com.bumptech.glide.load.data.InterfaceC0727d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p002a1.C0016e;
import p041e4.C0900q;
import p041e4.C0904u;
import p041e4.InterfaceC0901r;
import p130p.C2186e;
import p178u4.C2476k;
import p210y3.InterfaceC2801e;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.g0 */
/* loaded from: classes.dex */
public final class C0082g0 implements InterfaceC0083h, InterfaceC0727d {

    /* renamed from: j */
    public final RunnableC0091l f347j;

    /* renamed from: k */
    public final C0085i f348k;

    /* renamed from: l */
    public int f349l;

    /* renamed from: m */
    public int f350m = -1;

    /* renamed from: n */
    public InterfaceC2801e f351n;

    /* renamed from: o */
    public List f352o;

    /* renamed from: p */
    public int f353p;

    /* renamed from: q */
    public volatile C0900q f354q;

    /* renamed from: r */
    public File f355r;

    /* renamed from: s */
    public C0084h0 f356s;

    public C0082g0(C0085i c0085i, RunnableC0091l runnableC0091l) {
        this.f348k = c0085i;
        this.f347j = runnableC0091l;
    }

    @Override // p005a4.InterfaceC0083h
    /* renamed from: a */
    public final boolean mo303a() {
        List list;
        boolean z7;
        List list2;
        boolean z8;
        ArrayList arrayListM2072c;
        ArrayList arrayListM312a = this.f348k.m312a();
        if (arrayListM312a.isEmpty()) {
            return false;
        }
        C0085i c0085i = this.f348k;
        C0719h c0719hM1610a = c0085i.f368c.m1610a();
        Class<?> cls = c0085i.f369d.getClass();
        Class cls2 = c0085i.f372g;
        Class cls3 = c0085i.f376k;
        C0016e c0016e = c0719hM1610a.f2823h;
        C2476k c2476k = (C2476k) ((AtomicReference) c0016e.f62k).getAndSet(null);
        if (c2476k == null) {
            c2476k = new C2476k(cls, cls2, cls3);
        } else {
            c2476k.f9065a = cls;
            c2476k.f9066b = cls2;
            c2476k.f9067c = cls3;
        }
        synchronized (((C2186e) c0016e.f63l)) {
            list = (List) ((C2186e) c0016e.f63l).get(c2476k);
        }
        ((AtomicReference) c0016e.f62k).set(c2476k);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            C0904u c0904u = c0719hM1610a.f2816a;
            synchronized (c0904u) {
                arrayListM2072c = c0904u.f3934a.m2072c(cls);
            }
            int size = arrayListM2072c.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM2072c.get(i);
                i++;
                ArrayList arrayListM34D = c0719hM1610a.f2818c.m34D((Class) obj, cls2);
                int size2 = arrayListM34D.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayListM34D.get(i4);
                    i4++;
                    Class cls4 = (Class) obj2;
                    if (!c0719hM1610a.f2821f.m3673b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z7 = false;
            C0016e c0016e2 = c0719hM1610a.f2823h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((C2186e) c0016e2.f63l)) {
                ((C2186e) c0016e2.f63l).put(new C2476k(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z7 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f348k.f376k)) {
                return z7;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f348k.f369d.getClass() + " to " + this.f348k.f376k);
        }
        while (true) {
            List list3 = this.f352o;
            if (list3 != null && this.f353p < list3.size()) {
                this.f354q = null;
                boolean z9 = z7;
                while (!z9 && this.f353p < this.f352o.size()) {
                    List list4 = this.f352o;
                    int i8 = this.f353p;
                    this.f353p = i8 + 1;
                    InterfaceC0901r interfaceC0901r = (InterfaceC0901r) list4.get(i8);
                    File file = this.f355r;
                    C0085i c0085i2 = this.f348k;
                    this.f354q = interfaceC0901r.mo2050b(file, c0085i2.f370e, c0085i2.f371f, c0085i2.f374i);
                    if (this.f354q != null && this.f348k.m314c(this.f354q.f3932c.mo1641a()) != null) {
                        this.f354q.f3932c.mo1648e(this.f348k.f380o, this);
                        z9 = true;
                    }
                }
                return z9;
            }
            int i9 = this.f350m + 1;
            this.f350m = i9;
            if (i9 >= list2.size()) {
                int i10 = this.f349l + 1;
                this.f349l = i10;
                if (i10 >= arrayListM312a.size()) {
                    return z7;
                }
                this.f350m = z7 ? 1 : 0;
            }
            InterfaceC2801e interfaceC2801e = (InterfaceC2801e) arrayListM312a.get(this.f349l);
            Class cls5 = (Class) list2.get(this.f350m);
            InterfaceC2808l interfaceC2808lM316e = this.f348k.m316e(cls5);
            C0085i c0085i3 = this.f348k;
            this.f356s = new C0084h0(c0085i3.f368c.f2801a, interfaceC2801e, c0085i3.f379n, c0085i3.f370e, c0085i3.f371f, interfaceC2808lM316e, cls5, c0085i3.f374i);
            File fileMo1420b = c0085i3.f373h.m353a().mo1420b(this.f356s);
            this.f355r = fileMo1420b;
            if (fileMo1420b != null) {
                this.f351n = interfaceC2801e;
                this.f352o = this.f348k.f368c.m1610a().m1616f(fileMo1420b);
                z8 = false;
                this.f353p = 0;
            } else {
                z8 = false;
            }
            z7 = z8;
        }
    }

    @Override // p005a4.InterfaceC0083h
    public final void cancel() {
        C0900q c0900q = this.f354q;
        if (c0900q != null) {
            c0900q.f3932c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: d */
    public final void mo47d(Exception exc) {
        this.f347j.mo311c(this.f356s, exc, this.f354q.f3932c, 4);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: f */
    public final void mo49f(Object obj) {
        this.f347j.mo310b(this.f351n, obj, this.f354q.f3932c, 4, this.f356s);
    }
}
