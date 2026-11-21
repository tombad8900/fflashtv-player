package p085j6;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.AbstractC0715d;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.l */
/* loaded from: classes.dex */
public final class C1522l extends AbstractC0715d {

    /* renamed from: n */
    public static final Unsafe f5828n;

    /* renamed from: o */
    public static final long f5829o;

    /* renamed from: p */
    public static final long f5830p;

    /* renamed from: q */
    public static final long f5831q;

    /* renamed from: r */
    public static final long f5832r;

    /* renamed from: s */
    public static final long f5833s;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C1521k());
        }
        try {
            f5830p = unsafe.objectFieldOffset(AbstractC1524n.class.getDeclaredField(CmcdData.Factory.STREAM_TYPE_LIVE));
            f5829o = unsafe.objectFieldOffset(AbstractC1524n.class.getDeclaredField("k"));
            f5831q = unsafe.objectFieldOffset(AbstractC1524n.class.getDeclaredField("j"));
            f5832r = unsafe.objectFieldOffset(C1523m.class.getDeclaredField(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY));
            f5833s = unsafe.objectFieldOffset(C1523m.class.getDeclaredField("b"));
            f5828n = unsafe;
        } catch (NoSuchFieldException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: A */
    public final C1514d mo1575A(AbstractC1524n abstractC1524n) {
        C1514d c1514d;
        C1514d c1514d2 = C1514d.f5819d;
        do {
            c1514d = abstractC1524n.f5842k;
            if (c1514d2 == c1514d) {
                break;
            }
        } while (!mo1593i(abstractC1524n, c1514d, c1514d2));
        return c1514d;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: B */
    public final C1523m mo1576B(AbstractC1524n abstractC1524n) {
        C1523m c1523m;
        C1523m c1523m2 = C1523m.f5834c;
        do {
            c1523m = abstractC1524n.f5843l;
            if (c1523m2 == c1523m) {
                break;
            }
        } while (!mo1597k(abstractC1524n, c1523m, c1523m2));
        return c1523m;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: b0 */
    public final void mo1590b0(C1523m c1523m, C1523m c1523m2) {
        f5828n.putObject(c1523m, f5833s, c1523m2);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: c0 */
    public final void mo1591c0(C1523m c1523m, Thread thread) {
        f5828n.putObject(c1523m, f5832r, thread);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: i */
    public final boolean mo1593i(AbstractC1524n abstractC1524n, C1514d c1514d, C1514d c1514d2) {
        return AbstractC1519i.m3199a(f5828n, abstractC1524n, f5829o, c1514d, c1514d2);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: j */
    public final boolean mo1595j(AbstractC1524n abstractC1524n, Object obj, Object obj2) {
        return AbstractC1520j.m3200a(f5828n, abstractC1524n, f5831q, obj, obj2);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: k */
    public final boolean mo1597k(AbstractC1524n abstractC1524n, C1523m c1523m, C1523m c1523m2) {
        return AbstractC1518h.m3198a(f5828n, abstractC1524n, f5830p, c1523m, c1523m2);
    }
}
