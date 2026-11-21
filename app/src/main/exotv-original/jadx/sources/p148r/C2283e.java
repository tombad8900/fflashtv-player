package p148r;

import android.support.v4.media.session.AbstractC0120b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r.e */
/* loaded from: classes.dex */
public final class C2283e extends AbstractC0120b {
    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: E */
    public final void mo431E(C2284f c2284f, C2284f c2284f2) {
        c2284f.f7971b = c2284f2;
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: F */
    public final void mo432F(C2284f c2284f, Thread thread) {
        c2284f.f7970a = thread;
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: d */
    public final boolean mo433d(AbstractC2285g abstractC2285g, C2281c c2281c, C2281c c2281c2) {
        synchronized (abstractC2285g) {
            try {
                if (abstractC2285g.f7977k != c2281c) {
                    return false;
                }
                abstractC2285g.f7977k = c2281c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: e */
    public final boolean mo434e(AbstractC2285g abstractC2285g, Object obj, Object obj2) {
        synchronized (abstractC2285g) {
            try {
                if (abstractC2285g.f7976j != obj) {
                    return false;
                }
                abstractC2285g.f7976j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: f */
    public final boolean mo435f(AbstractC2285g abstractC2285g, C2284f c2284f, C2284f c2284f2) {
        synchronized (abstractC2285g) {
            try {
                if (abstractC2285g.f7978l != c2284f) {
                    return false;
                }
                abstractC2285g.f7978l = c2284f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
