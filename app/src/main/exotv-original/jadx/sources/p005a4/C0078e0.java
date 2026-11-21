package p005a4;

import p186v4.AbstractC2547c;
import p186v4.C2548d;
import p186v4.InterfaceC2546b;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.e0 */
/* loaded from: classes.dex */
public final class C0078e0 implements InterfaceC0080f0, InterfaceC2546b {

    /* renamed from: n */
    public static final C0073c f340n = AbstractC2547c.m4561a(20, new C2819f(4));

    /* renamed from: j */
    public final C2548d f341j = new C2548d();

    /* renamed from: k */
    public InterfaceC0080f0 f342k;

    /* renamed from: l */
    public boolean f343l;

    /* renamed from: m */
    public boolean f344m;

    @Override // p186v4.InterfaceC2546b
    /* renamed from: a */
    public final C2548d mo304a() {
        return this.f341j;
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: b */
    public final synchronized void mo305b() {
        this.f341j.m4562a();
        this.f344m = true;
        if (!this.f343l) {
            this.f342k.mo305b();
            this.f342k = null;
            f340n.mo285g(this);
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: c */
    public final int mo306c() {
        return this.f342k.mo306c();
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: d */
    public final Class mo307d() {
        return this.f342k.mo307d();
    }

    /* renamed from: e */
    public final synchronized void m308e() {
        this.f341j.m4562a();
        if (!this.f343l) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f343l = false;
        if (this.f344m) {
            mo305b();
        }
    }

    @Override // p005a4.InterfaceC0080f0
    public final Object get() {
        return this.f342k.get();
    }
}
