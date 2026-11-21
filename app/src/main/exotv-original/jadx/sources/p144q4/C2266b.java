package p144q4;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q4.b */
/* loaded from: classes.dex */
public final class C2266b implements InterfaceC2268d, InterfaceC2267c {

    /* renamed from: a */
    public final Object f7906a;

    /* renamed from: b */
    public final InterfaceC2268d f7907b;

    /* renamed from: c */
    public volatile InterfaceC2267c f7908c;

    /* renamed from: d */
    public volatile InterfaceC2267c f7909d;

    /* renamed from: e */
    public int f7910e = 3;

    /* renamed from: f */
    public int f7911f = 3;

    public C2266b(Object obj, InterfaceC2268d interfaceC2268d) {
        this.f7906a = obj;
        this.f7907b = interfaceC2268d;
    }

    @Override // p144q4.InterfaceC2268d, p144q4.InterfaceC2267c
    /* renamed from: a */
    public final boolean mo4066a() {
        boolean z7;
        synchronized (this.f7906a) {
            try {
                z7 = this.f7908c.mo4066a() || this.f7909d.mo4066a();
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: b */
    public final boolean mo4067b(InterfaceC2267c interfaceC2267c) {
        boolean z7;
        int i;
        synchronized (this.f7906a) {
            InterfaceC2268d interfaceC2268d = this.f7907b;
            z7 = false;
            if (interfaceC2268d == null || interfaceC2268d.mo4067b(this)) {
                if (this.f7910e != 5 ? interfaceC2267c.equals(this.f7908c) : interfaceC2267c.equals(this.f7909d) && ((i = this.f7911f) == 4 || i == 5)) {
                    z7 = true;
                }
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: c */
    public final boolean mo4068c(InterfaceC2267c interfaceC2267c) {
        boolean z7;
        synchronized (this.f7906a) {
            InterfaceC2268d interfaceC2268d = this.f7907b;
            z7 = (interfaceC2268d == null || interfaceC2268d.mo4068c(this)) && interfaceC2267c.equals(this.f7908c);
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    public final void clear() {
        synchronized (this.f7906a) {
            try {
                this.f7910e = 3;
                this.f7908c.clear();
                if (this.f7911f != 3) {
                    this.f7911f = 3;
                    this.f7909d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: d */
    public final boolean mo4069d(InterfaceC2267c interfaceC2267c) {
        boolean z7;
        synchronized (this.f7906a) {
            InterfaceC2268d interfaceC2268d = this.f7907b;
            z7 = interfaceC2268d == null || interfaceC2268d.mo4069d(this);
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: e */
    public final void mo4070e(InterfaceC2267c interfaceC2267c) {
        synchronized (this.f7906a) {
            try {
                if (interfaceC2267c.equals(this.f7909d)) {
                    this.f7911f = 5;
                    InterfaceC2268d interfaceC2268d = this.f7907b;
                    if (interfaceC2268d != null) {
                        interfaceC2268d.mo4070e(this);
                    }
                    return;
                }
                this.f7910e = 5;
                if (this.f7911f != 1) {
                    this.f7911f = 1;
                    this.f7909d.mo4073h();
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
        synchronized (this.f7906a) {
            try {
                z7 = this.f7910e == 3 && this.f7911f == 3;
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: g */
    public final boolean mo4072g(InterfaceC2267c interfaceC2267c) {
        if (interfaceC2267c instanceof C2266b) {
            C2266b c2266b = (C2266b) interfaceC2267c;
            if (this.f7908c.mo4072g(c2266b.f7908c) && this.f7909d.mo4072g(c2266b.f7909d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p144q4.InterfaceC2268d
    public final InterfaceC2268d getRoot() {
        InterfaceC2268d root;
        synchronized (this.f7906a) {
            try {
                InterfaceC2268d interfaceC2268d = this.f7907b;
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
        synchronized (this.f7906a) {
            try {
                if (this.f7910e != 1) {
                    this.f7910e = 1;
                    this.f7908c.mo4073h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: i */
    public final boolean mo4074i() {
        boolean z7;
        synchronized (this.f7906a) {
            try {
                z7 = this.f7910e == 4 || this.f7911f == 4;
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    public final boolean isRunning() {
        boolean z7;
        synchronized (this.f7906a) {
            try {
                z7 = true;
                if (this.f7910e != 1 && this.f7911f != 1) {
                    z7 = false;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2268d
    /* renamed from: j */
    public final void mo4075j(InterfaceC2267c interfaceC2267c) {
        synchronized (this.f7906a) {
            try {
                if (interfaceC2267c.equals(this.f7908c)) {
                    this.f7910e = 4;
                } else if (interfaceC2267c.equals(this.f7909d)) {
                    this.f7911f = 4;
                }
                InterfaceC2268d interfaceC2268d = this.f7907b;
                if (interfaceC2268d != null) {
                    interfaceC2268d.mo4075j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    public final void pause() {
        synchronized (this.f7906a) {
            try {
                if (this.f7910e == 1) {
                    this.f7910e = 2;
                    this.f7908c.pause();
                }
                if (this.f7911f == 1) {
                    this.f7911f = 2;
                    this.f7909d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
