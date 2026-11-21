package p144q4;

import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q4.g */
/* loaded from: classes.dex */
public final class C2271g implements InterfaceC2268d, InterfaceC2267c {

    /* renamed from: a */
    public final InterfaceC2268d f7940a;

    /* renamed from: b */
    public final Object f7941b;

    /* renamed from: c */
    public volatile C2270f f7942c;

    /* renamed from: d */
    public volatile InterfaceC2267c f7943d;

    /* renamed from: e */
    public int f7944e = 3;

    /* renamed from: f */
    public int f7945f = 3;

    /* renamed from: g */
    public boolean f7946g;

    public C2271g(Object obj, InterfaceC2268d interfaceC2268d) {
        this.f7941b = obj;
        this.f7940a = interfaceC2268d;
    }

    @Override // p144q4.InterfaceC2268d, p144q4.InterfaceC2267c
    /* renamed from: a */
    public final boolean mo4066a() {
        boolean z7;
        synchronized (this.f7941b) {
            try {
                z7 = this.f7943d.mo4066a() || this.f7942c.mo4066a();
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: b */
    public final boolean mo4067b(InterfaceC2267c interfaceC2267c) {
        boolean z7;
        synchronized (this.f7941b) {
            try {
                InterfaceC2268d interfaceC2268d = this.f7940a;
                z7 = (interfaceC2268d == null || interfaceC2268d.mo4067b(this)) && interfaceC2267c.equals(this.f7942c) && !mo4066a();
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: c */
    public final boolean mo4068c(InterfaceC2267c interfaceC2267c) {
        boolean z7;
        synchronized (this.f7941b) {
            try {
                InterfaceC2268d interfaceC2268d = this.f7940a;
                z7 = (interfaceC2268d == null || interfaceC2268d.mo4068c(this)) && interfaceC2267c.equals(this.f7942c) && this.f7944e != 2;
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    public final void clear() {
        synchronized (this.f7941b) {
            this.f7946g = false;
            this.f7944e = 3;
            this.f7945f = 3;
            this.f7943d.clear();
            this.f7942c.clear();
        }
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: d */
    public final boolean mo4069d(InterfaceC2267c interfaceC2267c) {
        boolean z7;
        synchronized (this.f7941b) {
            try {
                InterfaceC2268d interfaceC2268d = this.f7940a;
                z7 = (interfaceC2268d == null || interfaceC2268d.mo4069d(this)) && (interfaceC2267c.equals(this.f7942c) || this.f7944e != 4);
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: e */
    public final void mo4070e(InterfaceC2267c interfaceC2267c) {
        synchronized (this.f7941b) {
            try {
                if (!interfaceC2267c.equals(this.f7942c)) {
                    this.f7945f = 5;
                    return;
                }
                this.f7944e = 5;
                InterfaceC2268d interfaceC2268d = this.f7940a;
                if (interfaceC2268d != null) {
                    interfaceC2268d.mo4070e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: f */
    public final boolean mo4071f() {
        boolean z7;
        synchronized (this.f7941b) {
            z7 = this.f7944e == 3;
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: g */
    public final boolean mo4072g(InterfaceC2267c interfaceC2267c) {
        if (!(interfaceC2267c instanceof C2271g)) {
            return false;
        }
        C2271g c2271g = (C2271g) interfaceC2267c;
        if (this.f7942c == null) {
            if (c2271g.f7942c != null) {
                return false;
            }
        } else if (!this.f7942c.mo4072g(c2271g.f7942c)) {
            return false;
        }
        return this.f7943d == null ? c2271g.f7943d == null : this.f7943d.mo4072g(c2271g.f7943d);
    }

    @Override // p144q4.InterfaceC2268d
    public final InterfaceC2268d getRoot() {
        InterfaceC2268d root;
        synchronized (this.f7941b) {
            try {
                InterfaceC2268d interfaceC2268d = this.f7940a;
                root = interfaceC2268d != null ? interfaceC2268d.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: h */
    public final void mo4073h() {
        synchronized (this.f7941b) {
            try {
                this.f7946g = true;
                try {
                    if (this.f7944e != 4 && this.f7945f != 1) {
                        this.f7945f = 1;
                        this.f7943d.mo4073h();
                    }
                    if (this.f7946g && this.f7944e != 1) {
                        this.f7944e = 1;
                        this.f7942c.mo4073h();
                    }
                    this.f7946g = false;
                } catch (Throwable th) {
                    this.f7946g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: i */
    public final boolean mo4074i() {
        boolean z7;
        synchronized (this.f7941b) {
            z7 = this.f7944e == 4;
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    public final boolean isRunning() {
        boolean z7;
        synchronized (this.f7941b) {
            z7 = true;
            if (this.f7944e != 1) {
                z7 = false;
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: j */
    public final void mo4075j(InterfaceC2267c interfaceC2267c) {
        synchronized (this.f7941b) {
            try {
                if (interfaceC2267c.equals(this.f7943d)) {
                    this.f7945f = 4;
                    return;
                }
                this.f7944e = 4;
                InterfaceC2268d interfaceC2268d = this.f7940a;
                if (interfaceC2268d != null) {
                    interfaceC2268d.mo4075j(this);
                }
                if (!AbstractC0008a1.m8d(this.f7945f)) {
                    this.f7943d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    public final void pause() {
        synchronized (this.f7941b) {
            try {
                if (!AbstractC0008a1.m8d(this.f7945f)) {
                    this.f7945f = 2;
                    this.f7943d.pause();
                }
                if (!AbstractC0008a1.m8d(this.f7944e)) {
                    this.f7944e = 2;
                    this.f7942c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
