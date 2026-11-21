package p185v3;

import android.os.SystemClock;
import com.bumptech.glide.AbstractC0715d;
import p082j3.C1496i;
import p160s3.C2350a;
import p160s3.C2357h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v3.k */
/* loaded from: classes.dex */
public final class C2541k implements InterfaceC2539i {

    /* renamed from: a */
    public static final C2541k f9231a = new C2541k();

    /* renamed from: b */
    public static C1496i f9232b;

    @Override // p185v3.InterfaceC2539i
    /* renamed from: a */
    public boolean mo3867a(C2357h c2357h) {
        AbstractC0715d abstractC0715d = c2357h.f8270a;
        if ((abstractC0715d instanceof C2350a ? ((C2350a) abstractC0715d).f8260n : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        AbstractC0715d abstractC0715d2 = c2357h.f8271b;
        return (abstractC0715d2 instanceof C2350a ? ((C2350a) abstractC0715d2).f8260n : Integer.MAX_VALUE) > 100;
    }

    @Override // p185v3.InterfaceC2539i
    /* renamed from: b */
    public boolean mo3868b() {
        boolean z7;
        synchronized (C2538h.f9221a) {
            try {
                int i = C2538h.f9223c;
                C2538h.f9223c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > C2538h.f9224d + 30000) {
                    C2538h.f9223c = 0;
                    C2538h.f9224d = SystemClock.uptimeMillis();
                    String[] list = C2538h.f9222b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C2538h.f9225e = list.length < 800;
                }
                z7 = C2538h.f9225e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}
