package androidx.lifecycle;

import android.os.Handler;
import p002a1.C0036o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.f0 */
/* loaded from: classes.dex */
public final class C0133f0 implements InterfaceC0164v {

    /* renamed from: r */
    public static final C0133f0 f909r = new C0133f0();

    /* renamed from: j */
    public int f910j;

    /* renamed from: k */
    public int f911k;

    /* renamed from: n */
    public Handler f914n;

    /* renamed from: l */
    public boolean f912l = true;

    /* renamed from: m */
    public boolean f913m = true;

    /* renamed from: o */
    public final C0166x f915o = new C0166x(this);

    /* renamed from: p */
    public final RunnableC0127c0 f916p = new RunnableC0127c0(0, this);

    /* renamed from: q */
    public final C0036o f917q = new C0036o(6, this);

    /* renamed from: a */
    public final void m556a() {
        int i = this.f911k + 1;
        this.f911k = i;
        if (i == 1) {
            if (this.f912l) {
                this.f915o.m585l(EnumC0146m.ON_RESUME);
                this.f912l = false;
            } else {
                Handler handler = this.f914n;
                AbstractC2980h.m5133b(handler);
                handler.removeCallbacks(this.f916p);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0164v
    /* renamed from: e */
    public final AbstractC0150o mo224e() {
        return this.f915o;
    }
}
