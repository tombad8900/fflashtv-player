package p183v0;

import java.nio.ByteBuffer;
import p191w0.C2597a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.p */
/* loaded from: classes.dex */
public final class C2516p {

    /* renamed from: a */
    public int f9155a = 1;

    /* renamed from: b */
    public final C2519s f9156b;

    /* renamed from: c */
    public C2519s f9157c;

    /* renamed from: d */
    public C2519s f9158d;

    /* renamed from: e */
    public int f9159e;

    /* renamed from: f */
    public int f9160f;

    public C2516p(C2519s c2519s) {
        this.f9156b = c2519s;
        this.f9157c = c2519s;
    }

    /* renamed from: a */
    public final void m4529a() {
        this.f9155a = 1;
        this.f9157c = this.f9156b;
        this.f9160f = 0;
    }

    /* renamed from: b */
    public final boolean m4530b() {
        C2597a c2597aM4540b = this.f9157c.f9171b.m4540b();
        int iM3506a = c2597aM4540b.m3506a(6);
        return !(iM3506a == 0 || ((ByteBuffer) c2597aM4540b.f6855m).get(iM3506a + c2597aM4540b.f6852j) == 0) || this.f9159e == 65039;
    }
}
