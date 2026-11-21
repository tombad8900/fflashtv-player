package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import p002a1.C0036o;
import p005a4.C0095p;
import p005a4.C0096q;
import p015b4.C0572f;
import p090k2.C1584b;
import p118n4.C2019p;
import p130p.C2186e;
import p144q4.C2269e;
import p161s4.C2362b;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.e */
/* loaded from: classes.dex */
public final class C0716e extends ContextWrapper {

    /* renamed from: k */
    public static final C0712a f2800k;

    /* renamed from: a */
    public final C0572f f2801a;

    /* renamed from: b */
    public final C0095p f2802b;

    /* renamed from: c */
    public final C1584b f2803c;

    /* renamed from: d */
    public final C2819f f2804d;

    /* renamed from: e */
    public final List f2805e;

    /* renamed from: f */
    public final C2186e f2806f;

    /* renamed from: g */
    public final C0096q f2807g;

    /* renamed from: h */
    public final C0036o f2808h;

    /* renamed from: i */
    public final int f2809i;

    /* renamed from: j */
    public C2269e f2810j;

    static {
        C0712a c0712a = new C0712a();
        c0712a.f2771j = C2362b.f8279a;
        f2800k = c0712a;
    }

    public C0716e(Context context, C0572f c0572f, C2019p c2019p, C1584b c1584b, C2819f c2819f, C2186e c2186e, List list, C0096q c0096q, C0036o c0036o) {
        super(context.getApplicationContext());
        this.f2801a = c0572f;
        this.f2803c = c1584b;
        this.f2804d = c2819f;
        this.f2805e = list;
        this.f2806f = c2186e;
        this.f2807g = c0096q;
        this.f2808h = c0036o;
        this.f2809i = 4;
        this.f2802b = new C0095p(c2019p);
    }

    /* renamed from: a */
    public final C0719h m1610a() {
        return (C0719h) this.f2802b.get();
    }
}
