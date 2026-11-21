package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p052f6.C1012w;
import p066h4.C1173g;
import p066h4.C1174h;
import p066h4.C1179m;
import p066h4.C1186t;
import p118n4.C2019p;
import p130p.C2186e;
import p144q4.AbstractC2265a;
import p144q4.C2266b;
import p144q4.C2269e;
import p144q4.C2270f;
import p144q4.C2271g;
import p144q4.InterfaceC2267c;
import p144q4.InterfaceC2268d;
import p152r4.C2310a;
import p152r4.InterfaceC2314e;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public final class C0721j extends AbstractC2265a {

    /* renamed from: A */
    public final Class f2828A;

    /* renamed from: B */
    public final C0716e f2829B;

    /* renamed from: C */
    public C0712a f2830C;

    /* renamed from: D */
    public Object f2831D;

    /* renamed from: E */
    public ArrayList f2832E;

    /* renamed from: F */
    public C0721j f2833F;

    /* renamed from: G */
    public C0721j f2834G;

    /* renamed from: H */
    public final boolean f2835H = true;

    /* renamed from: I */
    public boolean f2836I;

    /* renamed from: J */
    public boolean f2837J;

    /* renamed from: y */
    public final Context f2838y;

    /* renamed from: z */
    public final ComponentCallbacks2C0738m f2839z;

    static {
    }

    public C0721j(ComponentCallbacks2C0713b componentCallbacks2C0713b, ComponentCallbacks2C0738m componentCallbacks2C0738m, Class cls, Context context) {
        C2269e c2269e;
        this.f2839z = componentCallbacks2C0738m;
        this.f2828A = cls;
        this.f2838y = context;
        C2186e c2186e = componentCallbacks2C0738m.f2872j.f2776l.f2806f;
        C0712a c0712a = (C0712a) c2186e.get(cls);
        if (c0712a == null) {
            Iterator it = ((C1012w) c2186e.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c0712a = (C0712a) entry.getValue();
                }
            }
        }
        this.f2830C = c0712a == null ? C0716e.f2800k : c0712a;
        this.f2829B = componentCallbacks2C0713b.f2776l;
        Iterator it2 = componentCallbacks2C0738m.f2880r.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            m1622q();
        }
        synchronized (componentCallbacks2C0738m) {
            c2269e = componentCallbacks2C0738m.f2881s;
        }
        mo1620a(c2269e);
    }

    @Override // p144q4.AbstractC2265a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0721j)) {
            return false;
        }
        C0721j c0721j = (C0721j) obj;
        return super.equals(c0721j) && Objects.equals(this.f2828A, c0721j.f2828A) && this.f2830C.equals(c0721j.f2830C) && Objects.equals(this.f2831D, c0721j.f2831D) && Objects.equals(this.f2832E, c0721j.f2832E) && Objects.equals(this.f2833F, c0721j.f2833F) && Objects.equals(this.f2834G, c0721j.f2834G) && this.f2835H == c0721j.f2835H && this.f2836I == c0721j.f2836I;
    }

    @Override // p144q4.AbstractC2265a
    public final int hashCode() {
        return AbstractC2478m.m4459g(this.f2836I ? 1 : 0, AbstractC2478m.m4459g(this.f2835H ? 1 : 0, AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(super.hashCode(), this.f2828A), this.f2830C), this.f2831D), this.f2832E), this.f2833F), this.f2834G), null)));
    }

    /* renamed from: q */
    public final C0721j m1622q() {
        if (this.f7903v) {
            return clone().m1622q();
        }
        m4059j();
        return this;
    }

    @Override // p144q4.AbstractC2265a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C0721j mo1620a(AbstractC2265a abstractC2265a) {
        AbstractC2470e.m4445b(abstractC2265a);
        return (C0721j) super.mo1620a(abstractC2265a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final InterfaceC2267c m1624s(Object obj, InterfaceC2314e interfaceC2314e, InterfaceC2268d interfaceC2268d, C0712a c0712a, EnumC0717f enumC0717f, int i, int i4, AbstractC2265a abstractC2265a) {
        InterfaceC2268d interfaceC2268d2;
        InterfaceC2268d c2266b;
        AbstractC2265a abstractC2265a2;
        C2270f c2270f;
        EnumC0717f enumC0717f2;
        if (this.f2834G != null) {
            c2266b = new C2266b(obj, interfaceC2268d);
            interfaceC2268d2 = c2266b;
        } else {
            interfaceC2268d2 = null;
            c2266b = interfaceC2268d;
        }
        C0721j c0721j = this.f2833F;
        if (c0721j == null) {
            Context context = this.f2838y;
            C0716e c0716e = this.f2829B;
            abstractC2265a2 = abstractC2265a;
            c2270f = new C2270f(context, c0716e, obj, this.f2831D, this.f2828A, abstractC2265a2, i, i4, enumC0717f, interfaceC2314e, this.f2832E, c2266b, c0716e.f2807g, c0712a.f2771j);
        } else {
            if (this.f2837J) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C0712a c0712a2 = c0721j.f2835H ? c0712a : c0721j.f2830C;
            if (AbstractC2265a.m4052f(c0721j.f7891j, 8)) {
                enumC0717f2 = this.f2833F.f7893l;
            } else {
                int iOrdinal = enumC0717f.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC0717f2 = EnumC0717f.f2811j;
                } else if (iOrdinal == 2) {
                    enumC0717f2 = EnumC0717f.f2812k;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f7893l);
                    }
                    enumC0717f2 = EnumC0717f.f2813l;
                }
            }
            EnumC0717f enumC0717f3 = enumC0717f2;
            C0721j c0721j2 = this.f2833F;
            int i8 = c0721j2.f7896o;
            int i9 = c0721j2.f7895n;
            if (AbstractC2478m.m4461i(i, i4)) {
                C0721j c0721j3 = this.f2833F;
                if (!AbstractC2478m.m4461i(c0721j3.f7896o, c0721j3.f7895n)) {
                    i8 = abstractC2265a.f7896o;
                    i9 = abstractC2265a.f7895n;
                }
            }
            int i10 = i9;
            C2271g c2271g = new C2271g(obj, c2266b);
            Context context2 = this.f2838y;
            C2271g c2271g2 = c2271g;
            C0716e c0716e2 = this.f2829B;
            C2270f c2270f2 = new C2270f(context2, c0716e2, obj, this.f2831D, this.f2828A, abstractC2265a, i, i4, enumC0717f, interfaceC2314e, this.f2832E, c2271g2, c0716e2.f2807g, c0712a.f2771j);
            this.f2837J = true;
            C0721j c0721j4 = this.f2833F;
            InterfaceC2267c interfaceC2267cM1624s = c0721j4.m1624s(obj, interfaceC2314e, c2271g2, c0712a2, enumC0717f3, i8, i10, c0721j4);
            this.f2837J = false;
            c2271g2.f7942c = c2270f2;
            c2271g2.f7943d = interfaceC2267cM1624s;
            abstractC2265a2 = abstractC2265a;
            c2270f = c2271g2;
        }
        if (interfaceC2268d2 == null) {
            return c2270f;
        }
        C0721j c0721j5 = this.f2834G;
        int i11 = c0721j5.f7896o;
        int i12 = c0721j5.f7895n;
        if (AbstractC2478m.m4461i(i, i4)) {
            C0721j c0721j6 = this.f2834G;
            if (!AbstractC2478m.m4461i(c0721j6.f7896o, c0721j6.f7895n)) {
                i11 = abstractC2265a2.f7896o;
                i12 = abstractC2265a2.f7895n;
            }
        }
        int i13 = i12;
        C0721j c0721j7 = this.f2834G;
        C2266b c2266b2 = interfaceC2268d2;
        InterfaceC2267c interfaceC2267cM1624s2 = c0721j7.m1624s(obj, interfaceC2314e, c2266b2, c0721j7.f2830C, c0721j7.f7893l, i11, i13, c0721j7);
        c2266b2.f7908c = c2270f;
        c2266b2.f7909d = interfaceC2267cM1624s2;
        return c2266b2;
    }

    @Override // p144q4.AbstractC2265a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final C0721j clone() {
        C0721j c0721j = (C0721j) super.clone();
        c0721j.f2830C = c0721j.f2830C.clone();
        if (c0721j.f2832E != null) {
            c0721j.f2832E = new ArrayList(c0721j.f2832E);
        }
        C0721j c0721j2 = c0721j.f2833F;
        if (c0721j2 != null) {
            c0721j.f2833F = c0721j2.clone();
        }
        C0721j c0721j3 = c0721j.f2834G;
        if (c0721j3 != null) {
            c0721j.f2834G = c0721j3.clone();
        }
        return c0721j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1626u(ImageView imageView) {
        AbstractC2265a abstractC2265aM4056g;
        C2310a c2310a;
        AbstractC2478m.m4453a();
        AbstractC2470e.m4445b(imageView);
        if (!AbstractC2265a.m4052f(this.f7891j, 2048) && imageView.getScaleType() != null) {
            switch (AbstractC0720i.f2826a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC2265aM4056g = clone().m4056g(C1179m.f5031d, new C1173g());
                    break;
                case 2:
                    abstractC2265aM4056g = clone().m4056g(C1179m.f5030c, new C1174h());
                    abstractC2265aM4056g.f7904w = true;
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC2265aM4056g = clone().m4056g(C1179m.f5029b, new C1186t());
                    abstractC2265aM4056g.f7904w = true;
                    break;
                case 6:
                    abstractC2265aM4056g = clone().m4056g(C1179m.f5030c, new C1174h());
                    abstractC2265aM4056g.f7904w = true;
                    break;
            }
        } else {
            abstractC2265aM4056g = this;
        }
        this.f2829B.f2803c.getClass();
        Class cls = this.f2828A;
        if (Bitmap.class.equals(cls)) {
            c2310a = new C2310a(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c2310a = new C2310a(imageView, 1);
        }
        m1627v(c2310a, abstractC2265aM4056g);
    }

    /* renamed from: v */
    public final void m1627v(InterfaceC2314e interfaceC2314e, AbstractC2265a abstractC2265a) {
        AbstractC2470e.m4445b(interfaceC2314e);
        if (!this.f2836I) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC2267c interfaceC2267cM1624s = m1624s(new Object(), interfaceC2314e, null, this.f2830C, abstractC2265a.f7893l, abstractC2265a.f7896o, abstractC2265a.f7895n, abstractC2265a);
        InterfaceC2267c interfaceC2267cMo1637i = interfaceC2314e.mo1637i();
        if (interfaceC2267cM1624s.mo4072g(interfaceC2267cMo1637i) && (abstractC2265a.f7894m || !interfaceC2267cMo1637i.mo4074i())) {
            AbstractC2470e.m4446c("Argument must not be null", interfaceC2267cMo1637i);
            if (interfaceC2267cMo1637i.isRunning()) {
                return;
            }
            interfaceC2267cMo1637i.mo4073h();
            return;
        }
        this.f2839z.m1659l(interfaceC2314e);
        interfaceC2314e.mo1630b(interfaceC2267cM1624s);
        ComponentCallbacks2C0738m componentCallbacks2C0738m = this.f2839z;
        synchronized (componentCallbacks2C0738m) {
            componentCallbacks2C0738m.f2877o.f7452j.add(interfaceC2314e);
            C2019p c2019p = componentCallbacks2C0738m.f2875m;
            ((Set) c2019p.f7450l).add(interfaceC2267cM1624s);
            if (c2019p.f7449k) {
                interfaceC2267cM1624s.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c2019p.f7451m).add(interfaceC2267cM1624s);
            } else {
                interfaceC2267cM1624s.mo4073h();
            }
        }
    }

    /* renamed from: w */
    public final C0721j m1628w(Object obj) {
        if (this.f7903v) {
            return clone().m1628w(obj);
        }
        this.f2831D = obj;
        this.f2836I = true;
        m4059j();
        return this;
    }
}
