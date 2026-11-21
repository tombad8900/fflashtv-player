package p005a4;

import android.util.Log;
import com.bumptech.glide.C0718g;
import com.bumptech.glide.load.data.InterfaceC0730g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p041e4.C0900q;
import p096l0.InterfaceC1642b;
import p109m4.InterfaceC1896a;
import p156s.AbstractC2334g;
import p178u4.AbstractC2470e;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;
import p210y3.InterfaceC2806j;
import p210y3.InterfaceC2807k;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.m */
/* loaded from: classes.dex */
public final class C0092m {

    /* renamed from: a */
    public final Class f430a;

    /* renamed from: b */
    public final List f431b;

    /* renamed from: c */
    public final InterfaceC1896a f432c;

    /* renamed from: d */
    public final InterfaceC1642b f433d;

    /* renamed from: e */
    public final String f434e;

    public C0092m(Class cls, Class cls2, Class cls3, List list, InterfaceC1896a interfaceC1896a, InterfaceC1642b interfaceC1642b) {
        this.f430a = cls;
        this.f431b = list;
        this.f432c = interfaceC1896a;
        this.f433d = interfaceC1642b;
        this.f434e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final InterfaceC0080f0 m342a(int i, int i4, C0087j c0087j, InterfaceC0730g interfaceC0730g, C2804h c2804h) {
        InterfaceC0080f0 interfaceC0080f0Mo2242b;
        InterfaceC2808l interfaceC2808l;
        int iMo53j;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object c0079f;
        InterfaceC1642b interfaceC1642b = this.f433d;
        Object objAcquire = interfaceC1642b.acquire();
        AbstractC2470e.m4446c("Argument must not be null", objAcquire);
        List list = (List) objAcquire;
        try {
            InterfaceC0080f0 interfaceC0080f0M343b = m343b(interfaceC0730g, i, i4, c2804h, list);
            interfaceC1642b.mo285g(list);
            RunnableC0091l runnableC0091l = (RunnableC0091l) c0087j.f386k;
            int i8 = c0087j.f385j;
            C0085i c0085i = runnableC0091l.f413j;
            Class<?> cls = interfaceC0080f0M343b.get().getClass();
            InterfaceC2807k interfaceC2807kM3672a = null;
            if (i8 != 4) {
                InterfaceC2808l interfaceC2808lM316e = c0085i.m316e(cls);
                interfaceC2808l = interfaceC2808lM316e;
                interfaceC0080f0Mo2242b = interfaceC2808lM316e.mo2242b(runnableC0091l.f420q, interfaceC0080f0M343b, runnableC0091l.f424u, runnableC0091l.f425v);
            } else {
                interfaceC0080f0Mo2242b = interfaceC0080f0M343b;
                interfaceC2808l = null;
            }
            if (!interfaceC0080f0M343b.equals(interfaceC0080f0Mo2242b)) {
                interfaceC0080f0M343b.mo305b();
            }
            if (c0085i.f368c.m1610a().f2819d.m3672a(interfaceC0080f0Mo2242b.mo307d()) != null) {
                interfaceC2807kM3672a = c0085i.f368c.m1610a().f2819d.m3672a(interfaceC0080f0Mo2242b.mo307d());
                if (interfaceC2807kM3672a == null) {
                    throw new C0718g(interfaceC0080f0Mo2242b.mo307d());
                }
                iMo53j = interfaceC2807kM3672a.mo53j(runnableC0091l.f427x);
            } else {
                iMo53j = 3;
            }
            InterfaceC2807k interfaceC2807k = interfaceC2807kM3672a;
            InterfaceC2801e interfaceC2801e = runnableC0091l.f402D;
            ArrayList arrayListM313b = c0085i.m313b();
            int size = arrayListM313b.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z7 = false;
                    break;
                }
                if (((C0900q) arrayListM313b.get(i9)).f3930a.equals(interfaceC2801e)) {
                    z7 = true;
                    break;
                }
                i9++;
            }
            switch (runnableC0091l.f426w.f439a) {
                case 0:
                    z8 = (i8 == 4 || i8 == 5) ? false : true;
                    break;
                default:
                    z8 = true;
                    if (((z7 || i8 != 3) && i8 != 1) || iMo53j != 2) {
                    }
                    break;
                case 1:
                case 2:
                    z8 = false;
                    break;
            }
            if (z8) {
                if (interfaceC2807k == null) {
                    throw new C0718g(interfaceC0080f0Mo2242b.get().getClass());
                }
                int iM4162a = AbstractC2334g.m4162a(iMo53j);
                if (iM4162a == 0) {
                    z9 = false;
                    z10 = true;
                    c0079f = new C0079f(runnableC0091l.f402D, runnableC0091l.f421r);
                } else {
                    if (iM4162a != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iMo53j != 1 ? iMo53j != 2 ? iMo53j != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z9 = false;
                    z10 = true;
                    c0079f = new C0084h0(c0085i.f368c.f2801a, runnableC0091l.f402D, runnableC0091l.f421r, runnableC0091l.f424u, runnableC0091l.f425v, interfaceC2808l, cls, runnableC0091l.f427x);
                }
                C0078e0 c0078e0 = (C0078e0) C0078e0.f340n.acquire();
                c0078e0.f344m = z9;
                c0078e0.f343l = z10;
                c0078e0.f342k = interfaceC0080f0Mo2242b;
                C0073c c0073c = runnableC0091l.f418o;
                c0073c.f324k = c0079f;
                c0073c.f325l = interfaceC2807k;
                c0073c.f326m = c0078e0;
                interfaceC0080f0Mo2242b = c0078e0;
            }
            return this.f432c.mo282d(interfaceC0080f0Mo2242b, c2804h);
        } catch (Throwable th) {
            interfaceC1642b.mo285g(list);
            throw th;
        }
    }

    /* renamed from: b */
    public final InterfaceC0080f0 m343b(InterfaceC0730g interfaceC0730g, int i, int i4, C2804h c2804h, List list) throws C0070a0 {
        List list2 = this.f431b;
        int size = list2.size();
        InterfaceC0080f0 interfaceC0080f0Mo2584b = null;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC2806j interfaceC2806j = (InterfaceC2806j) list2.get(i8);
            try {
                if (interfaceC2806j.mo2583a(interfaceC0730g.mo1653d(), c2804h)) {
                    interfaceC0080f0Mo2584b = interfaceC2806j.mo2584b(interfaceC0730g.mo1653d(), i, i4, c2804h);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC2806j, e);
                }
                list.add(e);
            }
            if (interfaceC0080f0Mo2584b != null) {
                break;
            }
        }
        if (interfaceC0080f0Mo2584b != null) {
            return interfaceC0080f0Mo2584b;
        }
        throw new C0070a0(this.f434e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f430a + ", decoders=" + this.f431b + ", transcoder=" + this.f432c + '}';
    }
}
