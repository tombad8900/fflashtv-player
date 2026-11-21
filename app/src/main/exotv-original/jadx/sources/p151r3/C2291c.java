package p151r3;

import android.graphics.Bitmap;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1327r;
import p086j7.C1534d;
import p112m7.AbstractC1938n;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p160s3.EnumC2353d;
import p177u3.C2462b;
import p177u3.InterfaceC2464d;
import p185v3.AbstractC2536f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.c */
/* loaded from: classes.dex */
public final class C2291c {

    /* renamed from: a */
    public final AbstractC1327r f7994a;

    /* renamed from: b */
    public final AbstractC1327r f7995b;

    /* renamed from: c */
    public final AbstractC1327r f7996c;

    /* renamed from: d */
    public final AbstractC1327r f7997d;

    /* renamed from: e */
    public final C2462b f7998e;

    /* renamed from: f */
    public final EnumC2353d f7999f;

    /* renamed from: g */
    public final Bitmap.Config f8000g;

    /* renamed from: h */
    public final boolean f8001h;

    /* renamed from: i */
    public final EnumC2290b f8002i;

    /* renamed from: j */
    public final EnumC2290b f8003j;

    /* renamed from: k */
    public final EnumC2290b f8004k;

    public C2291c() {
        C2054e c2054e = AbstractC1290e0.f5316a;
        C1534d c1534d = AbstractC1938n.f7227a.f5856n;
        ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
        EnumC2353d enumC2353d = EnumC2353d.f8263j;
        Bitmap.Config config = AbstractC2536f.f9217b;
        EnumC2290b enumC2290b = EnumC2290b.f7989l;
        this.f7994a = c1534d;
        this.f7995b = executorC2053d;
        this.f7996c = executorC2053d;
        this.f7997d = executorC2053d;
        this.f7998e = InterfaceC2464d.f9047a;
        this.f7999f = enumC2353d;
        this.f8000g = config;
        this.f8001h = true;
        this.f8002i = enumC2290b;
        this.f8003j = enumC2290b;
        this.f8004k = enumC2290b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2291c)) {
            return false;
        }
        C2291c c2291c = (C2291c) obj;
        return AbstractC2980h.m5132a(this.f7994a, c2291c.f7994a) && AbstractC2980h.m5132a(this.f7995b, c2291c.f7995b) && AbstractC2980h.m5132a(this.f7996c, c2291c.f7996c) && AbstractC2980h.m5132a(this.f7997d, c2291c.f7997d) && AbstractC2980h.m5132a(this.f7998e, c2291c.f7998e) && this.f7999f == c2291c.f7999f && this.f8000g == c2291c.f8000g && this.f8001h == c2291c.f8001h && this.f8002i == c2291c.f8002i && this.f8003j == c2291c.f8003j && this.f8004k == c2291c.f8004k;
    }

    public final int hashCode() {
        int iHashCode = (this.f7997d.hashCode() + ((this.f7996c.hashCode() + ((this.f7995b.hashCode() + (this.f7994a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f7998e.getClass();
        return this.f8004k.hashCode() + ((this.f8003j.hashCode() + ((this.f8002i.hashCode() + ((Boolean.hashCode(false) + ((Boolean.hashCode(this.f8001h) + ((this.f8000g.hashCode() + ((this.f7999f.hashCode() + ((C2462b.class.hashCode() + iHashCode) * 31)) * 31)) * 31)) * 31)) * 923521)) * 31)) * 31);
    }
}
