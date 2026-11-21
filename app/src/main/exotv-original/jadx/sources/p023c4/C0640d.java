package p023c4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import p002a1.C0016e;
import p005a4.C0073c;
import p082j3.C1488a;
import p095l.C1629o;
import p194w3.C2642d;
import p210y3.C2804h;
import p210y3.InterfaceC2798b;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c4.d */
/* loaded from: classes.dex */
public final class C0640d implements InterfaceC0637a {

    /* renamed from: k */
    public final File f2529k;

    /* renamed from: n */
    public C2642d f2532n;

    /* renamed from: m */
    public final C0016e f2531m = new C0016e(7);

    /* renamed from: l */
    public final long f2530l = 262144000;

    /* renamed from: j */
    public final C0016e f2528j = new C0016e(8);

    public C0640d(File file) {
        this.f2529k = file;
    }

    /* renamed from: a */
    public final synchronized C2642d m1423a() {
        try {
            if (this.f2532n == null) {
                this.f2532n = C2642d.m4735D(this.f2529k, this.f2530l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2532n;
    }

    @Override // p023c4.InterfaceC0637a
    /* renamed from: b */
    public final File mo1420b(InterfaceC2801e interfaceC2801e) {
        String strM35E = this.f2528j.m35E(interfaceC2801e);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM35E + " for for Key: " + interfaceC2801e);
        }
        try {
            C1629o c1629oM4747t = m1423a().m4747t(strM35E);
            if (c1629oM4747t != null) {
                return ((File[]) c1629oM4747t.f6229j)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // p023c4.InterfaceC0637a
    /* renamed from: h */
    public final void mo1421h(InterfaceC2801e interfaceC2801e, C0073c c0073c) {
        C0638b c0638b;
        boolean z7;
        String strM35E = this.f2528j.m35E(interfaceC2801e);
        C0016e c0016e = this.f2531m;
        synchronized (c0016e) {
            c0638b = (C0638b) ((HashMap) c0016e.f62k).get(strM35E);
            if (c0638b == null) {
                C0639c c0639c = (C0639c) c0016e.f63l;
                synchronized (c0639c.f2527a) {
                    c0638b = (C0638b) c0639c.f2527a.poll();
                }
                if (c0638b == null) {
                    c0638b = new C0638b();
                }
                ((HashMap) c0016e.f62k).put(strM35E, c0638b);
            }
            c0638b.f2526b++;
        }
        c0638b.f2525a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM35E + " for for Key: " + interfaceC2801e);
            }
            try {
                C2642d c2642dM1423a = m1423a();
                if (c2642dM1423a.m4747t(strM35E) == null) {
                    C1488a c1488aM4746k = c2642dM1423a.m4746k(strM35E);
                    if (c1488aM4746k == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM35E));
                    }
                    try {
                        if (((InterfaceC2798b) c0073c.f324k).mo54k(c0073c.f325l, c1488aM4746k.m3153d(), (C2804h) c0073c.f326m)) {
                            C2642d.m4737b((C2642d) c1488aM4746k.f5724d, c1488aM4746k, true);
                            c1488aM4746k.f5721a = true;
                        }
                        if (!z7) {
                            try {
                                c1488aM4746k.m3150a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!c1488aM4746k.f5721a) {
                            try {
                                c1488aM4746k.m3150a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.f2531m.m41K(strM35E);
        }
    }
}
