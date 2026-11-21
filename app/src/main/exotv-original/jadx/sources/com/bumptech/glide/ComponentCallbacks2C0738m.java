package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p002a1.RunnableC0018f;
import p090k2.C1584b;
import p100l4.C1674b;
import p118n4.C2006c;
import p118n4.C2014k;
import p118n4.C2019p;
import p118n4.C2020q;
import p118n4.InterfaceC2005b;
import p118n4.InterfaceC2010g;
import p118n4.InterfaceC2012i;
import p144q4.C2269e;
import p144q4.InterfaceC2267c;
import p152r4.InterfaceC2314e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.m */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0738m implements ComponentCallbacks2, InterfaceC2012i {

    /* renamed from: t */
    public static final C2269e f2871t;

    /* renamed from: j */
    public final ComponentCallbacks2C0713b f2872j;

    /* renamed from: k */
    public final Context f2873k;

    /* renamed from: l */
    public final InterfaceC2010g f2874l;

    /* renamed from: m */
    public final C2019p f2875m;

    /* renamed from: n */
    public final C1584b f2876n;

    /* renamed from: o */
    public final C2020q f2877o;

    /* renamed from: p */
    public final RunnableC0018f f2878p;

    /* renamed from: q */
    public final InterfaceC2005b f2879q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f2880r;

    /* renamed from: s */
    public final C2269e f2881s;

    static {
        C2269e c2269e = (C2269e) new C2269e().m4053c(Bitmap.class);
        c2269e.f7902u = true;
        f2871t = c2269e;
        ((C2269e) new C2269e().m4053c(C1674b.class)).f7902u = true;
    }

    public ComponentCallbacks2C0738m(ComponentCallbacks2C0713b componentCallbacks2C0713b, InterfaceC2010g interfaceC2010g, C1584b c1584b, Context context) {
        C2269e c2269e;
        C2019p c2019p = new C2019p();
        C1584b c1584b2 = componentCallbacks2C0713b.f2779o;
        this.f2877o = new C2020q();
        RunnableC0018f runnableC0018f = new RunnableC0018f(6, this);
        this.f2878p = runnableC0018f;
        this.f2872j = componentCallbacks2C0713b;
        this.f2874l = interfaceC2010g;
        this.f2876n = c1584b;
        this.f2875m = c2019p;
        this.f2873k = context;
        Context applicationContext = context.getApplicationContext();
        C0723l c0723l = new C0723l(this, c2019p);
        c1584b2.getClass();
        boolean z7 = AbstractC0120b.m413i(applicationContext) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z7 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC2005b c2006c = z7 ? new C2006c(applicationContext, c0723l) : new C2014k();
        this.f2879q = c2006c;
        synchronized (componentCallbacks2C0713b.f2780p) {
            if (componentCallbacks2C0713b.f2780p.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0713b.f2780p.add(this);
        }
        char[] cArr = AbstractC2478m.f9069a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC2010g.mo3256a(this);
        } else {
            AbstractC2478m.m4458f().post(runnableC0018f);
        }
        interfaceC2010g.mo3256a(c2006c);
        this.f2880r = new CopyOnWriteArrayList(componentCallbacks2C0713b.f2776l.f2805e);
        C0716e c0716e = componentCallbacks2C0713b.f2776l;
        synchronized (c0716e) {
            try {
                if (c0716e.f2810j == null) {
                    c0716e.f2804d.getClass();
                    C2269e c2269e2 = new C2269e();
                    c2269e2.f7902u = true;
                    c0716e.f2810j = c2269e2;
                }
                c2269e = c0716e.f2810j;
            } finally {
            }
        }
        synchronized (this) {
            C2269e c2269e3 = (C2269e) c2269e.clone();
            if (c2269e3.f7902u && !c2269e3.f7903v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c2269e3.f7903v = true;
            c2269e3.f7902u = true;
            this.f2881s = c2269e3;
        }
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: d */
    public final synchronized void mo1632d() {
        int i;
        this.f2877o.mo1632d();
        synchronized (this) {
            try {
                ArrayList arrayListM4457e = AbstractC2478m.m4457e(this.f2877o.f7452j);
                int size = arrayListM4457e.size();
                i = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayListM4457e.get(i4);
                    i4++;
                    m1659l((InterfaceC2314e) obj);
                }
                this.f2877o.f7452j.clear();
            } finally {
            }
        }
        C2019p c2019p = this.f2875m;
        ArrayList arrayListM4457e2 = AbstractC2478m.m4457e((Set) c2019p.f7450l);
        int size2 = arrayListM4457e2.size();
        while (i < size2) {
            Object obj2 = arrayListM4457e2.get(i);
            i++;
            c2019p.m3886a((InterfaceC2267c) obj2);
        }
        ((HashSet) c2019p.f7451m).clear();
        this.f2874l.mo3260l(this);
        this.f2874l.mo3260l(this.f2879q);
        AbstractC2478m.m4458f().removeCallbacks(this.f2878p);
        ComponentCallbacks2C0713b componentCallbacks2C0713b = this.f2872j;
        synchronized (componentCallbacks2C0713b.f2780p) {
            if (!componentCallbacks2C0713b.f2780p.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C0713b.f2780p.remove(this);
        }
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: f */
    public final synchronized void mo1634f() {
        this.f2877o.mo1634f();
        m1661n();
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: k */
    public final synchronized void mo1639k() {
        m1662o();
        this.f2877o.mo1639k();
    }

    /* renamed from: l */
    public final void m1659l(InterfaceC2314e interfaceC2314e) {
        if (interfaceC2314e == null) {
            return;
        }
        boolean zM1663p = m1663p(interfaceC2314e);
        InterfaceC2267c interfaceC2267cMo1637i = interfaceC2314e.mo1637i();
        if (zM1663p) {
            return;
        }
        ComponentCallbacks2C0713b componentCallbacks2C0713b = this.f2872j;
        synchronized (componentCallbacks2C0713b.f2780p) {
            try {
                ArrayList arrayList = componentCallbacks2C0713b.f2780p;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((ComponentCallbacks2C0738m) obj).m1663p(interfaceC2314e)) {
                        return;
                    }
                }
                if (interfaceC2267cMo1637i != null) {
                    interfaceC2314e.mo1630b(null);
                    interfaceC2267cMo1637i.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public final C0721j m1660m(String str) {
        return new C0721j(this.f2872j, this, Drawable.class, this.f2873k).m1628w(str);
    }

    /* renamed from: n */
    public final synchronized void m1661n() {
        C2019p c2019p = this.f2875m;
        c2019p.f7449k = true;
        ArrayList arrayListM4457e = AbstractC2478m.m4457e((Set) c2019p.f7450l);
        int size = arrayListM4457e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            InterfaceC2267c interfaceC2267c = (InterfaceC2267c) obj;
            if (interfaceC2267c.isRunning()) {
                interfaceC2267c.pause();
                ((HashSet) c2019p.f7451m).add(interfaceC2267c);
            }
        }
    }

    /* renamed from: o */
    public final synchronized void m1662o() {
        C2019p c2019p = this.f2875m;
        int i = 0;
        c2019p.f7449k = false;
        ArrayList arrayListM4457e = AbstractC2478m.m4457e((Set) c2019p.f7450l);
        int size = arrayListM4457e.size();
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            InterfaceC2267c interfaceC2267c = (InterfaceC2267c) obj;
            if (!interfaceC2267c.mo4074i() && !interfaceC2267c.isRunning()) {
                interfaceC2267c.mo4073h();
            }
        }
        ((HashSet) c2019p.f7451m).clear();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    /* renamed from: p */
    public final synchronized boolean m1663p(InterfaceC2314e interfaceC2314e) {
        InterfaceC2267c interfaceC2267cMo1637i = interfaceC2314e.mo1637i();
        if (interfaceC2267cMo1637i == null) {
            return true;
        }
        if (!this.f2875m.m3886a(interfaceC2267cMo1637i)) {
            return false;
        }
        this.f2877o.f7452j.remove(interfaceC2314e);
        interfaceC2314e.mo1630b(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2875m + ", treeNode=" + this.f2876n + "}";
    }
}
