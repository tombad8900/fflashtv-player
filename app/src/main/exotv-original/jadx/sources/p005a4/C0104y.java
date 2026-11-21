package p005a4;

import p178u4.AbstractC2470e;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.y */
/* loaded from: classes.dex */
public final class C0104y implements InterfaceC0080f0 {

    /* renamed from: j */
    public final boolean f491j;

    /* renamed from: k */
    public final boolean f492k;

    /* renamed from: l */
    public final InterfaceC0080f0 f493l;

    /* renamed from: m */
    public final InterfaceC0103x f494m;

    /* renamed from: n */
    public final InterfaceC2801e f495n;

    /* renamed from: o */
    public int f496o;

    /* renamed from: p */
    public boolean f497p;

    public C0104y(InterfaceC0080f0 interfaceC0080f0, boolean z7, boolean z8, InterfaceC2801e interfaceC2801e, InterfaceC0103x interfaceC0103x) {
        AbstractC2470e.m4446c("Argument must not be null", interfaceC0080f0);
        this.f493l = interfaceC0080f0;
        this.f491j = z7;
        this.f492k = z8;
        this.f495n = interfaceC2801e;
        AbstractC2470e.m4446c("Argument must not be null", interfaceC0103x);
        this.f494m = interfaceC0103x;
    }

    /* renamed from: a */
    public final synchronized void m368a() {
        if (this.f497p) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f496o++;
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: b */
    public final synchronized void mo305b() {
        if (this.f496o > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f497p) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f497p = true;
        if (this.f492k) {
            this.f493l.mo305b();
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: c */
    public final int mo306c() {
        return this.f493l.mo306c();
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: d */
    public final Class mo307d() {
        return this.f493l.mo307d();
    }

    /* renamed from: e */
    public final void m369e() {
        boolean z7;
        synchronized (this) {
            int i = this.f496o;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z7 = true;
            int i4 = i - 1;
            this.f496o = i4;
            if (i4 != 0) {
                z7 = false;
            }
        }
        if (z7) {
            ((C0096q) this.f494m).m359e(this.f495n, this);
        }
    }

    @Override // p005a4.InterfaceC0080f0
    public final Object get() {
        return this.f493l.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f491j + ", listener=" + this.f494m + ", key=" + this.f495n + ", acquired=" + this.f496o + ", isRecycled=" + this.f497p + ", resource=" + this.f493l + '}';
    }
}
