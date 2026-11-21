package p066h4;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import p002a1.C0016e;
import p005a4.C0073c;
import p005a4.InterfaceC0080f0;
import p015b4.C0572f;
import p015b4.InterfaceC0567a;
import p083j4.C1500d;
import p083j4.C1501e;
import p178u4.C2469d;
import p178u4.C2475j;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.a */
/* loaded from: classes.dex */
public final class C1164a implements InterfaceC2806j {

    /* renamed from: a */
    public final /* synthetic */ int f5001a;

    /* renamed from: b */
    public final Object f5002b;

    /* renamed from: c */
    public final Object f5003c;

    public /* synthetic */ C1164a(Object obj, int i, Object obj2) {
        this.f5001a = i;
        this.f5002b = obj;
        this.f5003c = obj2;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final boolean mo2583a(Object obj, C2804h c2804h) {
        switch (this.f5001a) {
            case 0:
                return ((InterfaceC2806j) this.f5002b).mo2583a(obj, c2804h);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((C1181o) this.f5002b).getClass();
                return true;
        }
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final InterfaceC0080f0 mo2584b(Object obj, int i, int i4, C2804h c2804h) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z7;
        C1189w c1189w;
        C2469d c2469d;
        switch (this.f5001a) {
            case 0:
                InterfaceC0080f0 interfaceC0080f0Mo2584b = ((InterfaceC2806j) this.f5002b).mo2584b(obj, i, i4, c2804h);
                Resources resources = (Resources) this.f5003c;
                if (interfaceC0080f0Mo2584b == null) {
                    return null;
                }
                return new C1168c(resources, interfaceC0080f0Mo2584b);
            case 1:
                InterfaceC0080f0 interfaceC0080f0M3179c = ((C1501e) this.f5002b).m3179c((Uri) obj, c2804h);
                if (interfaceC0080f0M3179c == null) {
                    return null;
                }
                return AbstractC1183q.m2605a((InterfaceC0567a) this.f5003c, (Drawable) ((C1500d) interfaceC0080f0M3179c).get(), i, i4);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C1189w) {
                    c1189w = (C1189w) inputStream;
                    z7 = false;
                } else {
                    z7 = true;
                    c1189w = new C1189w(inputStream, (C0572f) this.f5003c);
                }
                ArrayDeque arrayDeque = C2469d.f9052l;
                synchronized (arrayDeque) {
                    c2469d = (C2469d) arrayDeque.poll();
                }
                if (c2469d == null) {
                    c2469d = new C2469d();
                }
                C2469d c2469d2 = c2469d;
                c2469d2.f9053j = c1189w;
                C2475j c2475j = new C2475j(c2469d2);
                C0016e c0016e = new C0016e(c1189w, 15, c2469d2);
                try {
                    C1181o c1181o = (C1181o) this.f5002b;
                    C1168c c1168cM2603a = c1181o.m2603a(new C0073c(c2475j, c1181o.f5046d, c1181o.f5045c), i, i4, c2804h, c0016e);
                    c2469d2.f9054k = null;
                    c2469d2.f9053j = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c2469d2);
                    }
                    if (z7) {
                        c1189w.m2611c();
                    }
                    return c1168cM2603a;
                } catch (Throwable th) {
                    c2469d2.f9054k = null;
                    c2469d2.f9053j = null;
                    ArrayDeque arrayDeque2 = C2469d.f9052l;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c2469d2);
                        if (!z7) {
                            throw th;
                        }
                        c1189w.m2611c();
                        throw th;
                    }
                }
        }
    }

    public C1164a(Resources resources, InterfaceC2806j interfaceC2806j) {
        this.f5001a = 0;
        this.f5003c = resources;
        this.f5002b = interfaceC2806j;
    }
}
