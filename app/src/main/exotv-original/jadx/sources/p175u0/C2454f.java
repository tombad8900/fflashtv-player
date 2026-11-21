package p175u0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import p002a1.AbstractC0008a1;
import p156s.C2332e;
import p168t2.AbstractC2415i0;
import p211y5.InterfaceC2839z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u0.f */
/* loaded from: classes.dex */
public final class C2454f {

    /* renamed from: m */
    public static final C2453e f8988m = new C2453e(1);

    /* renamed from: n */
    public static final C2453e f8989n = new C2453e(2);

    /* renamed from: o */
    public static final C2453e f8990o = new C2453e(3);

    /* renamed from: p */
    public static final C2453e f8991p = new C2453e(4);

    /* renamed from: q */
    public static final C2453e f8992q = new C2453e(5);

    /* renamed from: r */
    public static final C2453e f8993r = new C2453e(0);

    /* renamed from: c */
    public final InterfaceC2839z f8996c;

    /* renamed from: d */
    public final AbstractC2415i0 f8997d;

    /* renamed from: g */
    public final float f9000g;

    /* renamed from: j */
    public C2455g f9003j;

    /* renamed from: k */
    public float f9004k;

    /* renamed from: l */
    public boolean f9005l;

    /* renamed from: a */
    public float f8994a = 0.0f;

    /* renamed from: b */
    public float f8995b = Float.MAX_VALUE;

    /* renamed from: e */
    public boolean f8998e = false;

    /* renamed from: f */
    public long f8999f = 0;

    /* renamed from: h */
    public final ArrayList f9001h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f9002i = new ArrayList();

    public C2454f(InterfaceC2839z interfaceC2839z, AbstractC2415i0 abstractC2415i0) {
        this.f8996c = interfaceC2839z;
        this.f8997d = abstractC2415i0;
        if (abstractC2415i0 == f8990o || abstractC2415i0 == f8991p || abstractC2415i0 == f8992q) {
            this.f9000g = 0.1f;
        } else if (abstractC2415i0 == f8993r) {
            this.f9000g = 0.00390625f;
        } else if (abstractC2415i0 == f8988m || abstractC2415i0 == f8989n) {
            this.f9000g = 0.002f;
        } else {
            this.f9000g = 1.0f;
        }
        this.f9003j = null;
        this.f9004k = Float.MAX_VALUE;
        this.f9005l = false;
    }

    /* renamed from: b */
    public static C2452d m4430b() {
        ThreadLocal threadLocal = C2452d.f8978i;
        if (threadLocal.get() == null) {
            threadLocal.set(new C2452d(new C2332e(6)));
        }
        return (C2452d) threadLocal.get();
    }

    /* renamed from: a */
    public final void m4431a(float f8) {
        if (this.f8998e) {
            this.f9004k = f8;
            return;
        }
        if (this.f9003j == null) {
            this.f9003j = new C2455g(f8);
        }
        C2455g c2455g = this.f9003j;
        double d8 = f8;
        c2455g.f9014i = d8;
        double d9 = (float) d8;
        if (d9 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d9 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f9000g * 0.75f);
        c2455g.f9009d = dAbs;
        c2455g.f9010e = dAbs * 62.5d;
        C2332e c2332e = m4430b().f8983e;
        c2332e.getClass();
        if (Thread.currentThread() != ((Looper) c2332e.f8171l).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z7 = this.f8998e;
        if (z7 || z7) {
            return;
        }
        this.f8998e = true;
        float fMo3181q = this.f8997d.mo3181q(this.f8996c);
        this.f8995b = fMo3181q;
        if (fMo3181q > Float.MAX_VALUE || fMo3181q < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        m4430b().m4429a(this);
    }

    /* renamed from: c */
    public final void m4432c(float f8) {
        this.f8997d.mo3180D(this.f8996c, f8);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9002i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                throw AbstractC0008a1.m10f(i, arrayList);
            }
            i++;
        }
    }

    /* renamed from: d */
    public final void m4433d() {
        if (this.f9003j.f9007b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        C2332e c2332e = m4430b().f8983e;
        c2332e.getClass();
        if (Thread.currentThread() != ((Looper) c2332e.f8171l).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f8998e) {
            this.f9005l = true;
        }
    }
}
