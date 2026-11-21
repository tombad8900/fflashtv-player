package p063h1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C0243u;
import androidx.media3.exoplayer.drm.RunnableC0348f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p005a4.C0088j0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.p */
/* loaded from: classes.dex */
public final class C1125p {

    /* renamed from: a */
    public final InterfaceC1103b f4771a;

    /* renamed from: b */
    public final C1104b0 f4772b;

    /* renamed from: c */
    public final InterfaceC1123n f4773c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f4774d;

    /* renamed from: e */
    public final ArrayDeque f4775e;

    /* renamed from: f */
    public final ArrayDeque f4776f;

    /* renamed from: g */
    public final Object f4777g;

    /* renamed from: h */
    public boolean f4778h;

    /* renamed from: i */
    public boolean f4779i;

    public C1125p(Looper looper, InterfaceC1103b interfaceC1103b, InterfaceC1123n interfaceC1123n) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1103b, interfaceC1123n, true);
    }

    /* renamed from: a */
    public final void m2469a(Object obj) {
        obj.getClass();
        synchronized (this.f4777g) {
            try {
                if (this.f4778h) {
                    return;
                }
                this.f4774d.add(new C1124o(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m2470b() {
        m2475g();
        ArrayDeque arrayDeque = this.f4776f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C1104b0 c1104b0 = this.f4772b;
        if (!c1104b0.f4715a.hasMessages(1)) {
            C1102a0 c1102a0M2379a = c1104b0.m2379a(1);
            Handler handler = c1104b0.f4715a;
            Message message = c1102a0M2379a.f4712a;
            message.getClass();
            handler.sendMessageAtFrontOfQueue(message);
            c1102a0M2379a.m2376a();
        }
        ArrayDeque arrayDeque2 = this.f4775e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* renamed from: c */
    public final void m2471c(int i, InterfaceC1122m interfaceC1122m) {
        m2475g();
        this.f4776f.add(new RunnableC0348f(new CopyOnWriteArraySet(this.f4774d), i, interfaceC1122m, 1));
    }

    /* renamed from: d */
    public final void m2472d() {
        m2475g();
        synchronized (this.f4777g) {
            this.f4778h = true;
        }
        Iterator it = this.f4774d.iterator();
        while (it.hasNext()) {
            ((C1124o) it.next()).m2468a(this.f4773c);
        }
        this.f4774d.clear();
    }

    /* renamed from: e */
    public final void m2473e(Object obj) {
        m2475g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f4774d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C1124o c1124o = (C1124o) it.next();
            if (c1124o.f4767a.equals(obj)) {
                c1124o.m2468a(this.f4773c);
                copyOnWriteArraySet.remove(c1124o);
            }
        }
    }

    /* renamed from: f */
    public final void m2474f(int i, InterfaceC1122m interfaceC1122m) {
        m2471c(i, interfaceC1122m);
        m2470b();
    }

    /* renamed from: g */
    public final void m2475g() {
        if (this.f4779i) {
            AbstractC1101a.m2359j(Thread.currentThread() == this.f4772b.f4715a.getLooper().getThread());
        }
    }

    public C1125p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC1103b interfaceC1103b, InterfaceC1123n interfaceC1123n, boolean z7) {
        this.f4771a = interfaceC1103b;
        this.f4774d = copyOnWriteArraySet;
        this.f4773c = interfaceC1123n;
        this.f4777g = new Object();
        this.f4775e = new ArrayDeque();
        this.f4776f = new ArrayDeque();
        this.f4772b = ((C1135z) interfaceC1103b).m2541a(looper, new Handler.Callback() { // from class: h1.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C1125p c1125p = this.f4766j;
                Iterator it = c1125p.f4774d.iterator();
                while (it.hasNext()) {
                    C1124o c1124o = (C1124o) it.next();
                    InterfaceC1123n interfaceC1123n2 = c1125p.f4773c;
                    if (!c1124o.f4770d && c1124o.f4769c) {
                        C0243u c0243uM324b = c1124o.f4768b.m324b();
                        c1124o.f4768b = new C0088j0(1);
                        c1124o.f4769c = false;
                        interfaceC1123n2.mo648c(c1124o.f4767a, c0243uM324b);
                    }
                    if (c1125p.f4772b.f4715a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f4779i = z7;
    }
}
