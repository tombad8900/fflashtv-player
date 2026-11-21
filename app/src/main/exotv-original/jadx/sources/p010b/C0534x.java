package p010b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.EnumC0148n;
import androidx.lifecycle.InterfaceC0164v;
import com.exotv.net.MainActivity;
import com.exotv.net.PlayerActivity;
import java.util.Iterator;
import java.util.ListIterator;
import p002a1.C0019f0;
import p002a1.C0035n0;
import p006a5.C0107b;
import p111m6.C1911f;
import p195w4.EnumC2683q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.x */
/* loaded from: classes.dex */
public final class C0534x {

    /* renamed from: a */
    public final Runnable f2180a;

    /* renamed from: b */
    public final C1911f f2181b = new C1911f();

    /* renamed from: c */
    public C0019f0 f2182c;

    /* renamed from: d */
    public final OnBackInvokedCallback f2183d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f2184e;

    /* renamed from: f */
    public boolean f2185f;

    /* renamed from: g */
    public boolean f2186g;

    public C0534x(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM1251a;
        this.f2180a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM1251a = C0530t.f2172a.m1254a(new C0525o(this, 0), new C0525o(this, 1), new C0526p(this, 0), new C0526p(this, 1));
            } else {
                onBackInvokedCallbackM1251a = C0528r.f2167a.m1251a(new C0526p(this, 2));
            }
            this.f2183d = onBackInvokedCallbackM1251a;
        }
    }

    /* renamed from: a */
    public final void m1255a(InterfaceC0164v interfaceC0164v, C0019f0 c0019f0) {
        AbstractC2980h.m5136e("onBackPressedCallback", c0019f0);
        AbstractC0150o abstractC0150oMo224e = interfaceC0164v.mo224e();
        if (abstractC0150oMo224e.mo569b() == EnumC0148n.f925j) {
            return;
        }
        c0019f0.f69b.add(new C0531u(this, abstractC0150oMo224e, c0019f0));
        m1259e();
        c0019f0.f70c = new C0533w(0, this, C0534x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    /* renamed from: b */
    public final void m1256b() {
        Object objPrevious;
        if (this.f2182c == null) {
            C1911f c1911f = this.f2181b;
            ListIterator<E> listIterator = c1911f.listIterator(c1911f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((C0019f0) objPrevious).f68a) {
                        break;
                    }
                }
            }
        }
        this.f2182c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [y6.a, z6.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [y6.a, z6.g] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* renamed from: c */
    public final void m1257c() {
        C0019f0 c0019f0Previous;
        C0019f0 c0019f0 = this.f2182c;
        if (c0019f0 == null) {
            C1911f c1911f = this.f2181b;
            ListIterator listIterator = c1911f.listIterator(c1911f.mo3715a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0019f0Previous = 0;
                    break;
                } else {
                    c0019f0Previous = listIterator.previous();
                    if (((C0019f0) c0019f0Previous).f68a) {
                        break;
                    }
                }
            }
            c0019f0 = c0019f0Previous;
        }
        this.f2182c = null;
        if (c0019f0 == null) {
            this.f2180a.run();
            return;
        }
        switch (c0019f0.f71d) {
            case 0:
                C0035n0 c0035n0 = (C0035n0) c0019f0.f72e;
                c0035n0.m159y(true);
                if (c0035n0.f122h.f68a) {
                    c0035n0.m120N();
                    return;
                } else {
                    c0035n0.f121g.m1257c();
                    return;
                }
            case 1:
                MainActivity mainActivity = (MainActivity) c0019f0.f72e;
                if (mainActivity.f2887K == EnumC2683q.f9749m) {
                    mainActivity.m1685O(mainActivity.f2888L);
                    return;
                }
                c0019f0.f68a = false;
                ?? r22 = c0019f0.f70c;
                if (r22 != 0) {
                    r22.invoke();
                }
                mainActivity.m1247i().m1257c();
                c0019f0.f68a = true;
                ?? r02 = c0019f0.f70c;
                if (r02 != 0) {
                    r02.invoke();
                    return;
                }
                return;
            default:
                PlayerActivity playerActivity = (PlayerActivity) c0019f0.f72e;
                C0107b c0107b = playerActivity.f2937H;
                if (c0107b == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b.f519C.getVisibility() == 0) {
                    playerActivity.m1729W();
                    return;
                }
                C0107b c0107b2 = playerActivity.f2937H;
                if (c0107b2 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b2.f541r.getVisibility() == 0) {
                    playerActivity.m1727U();
                    return;
                }
                C0107b c0107b3 = playerActivity.f2937H;
                if (c0107b3 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b3.f547x.getVisibility() == 0) {
                    playerActivity.m1728V();
                    return;
                }
                C0107b c0107b4 = playerActivity.f2937H;
                if (c0107b4 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b4.f533j.getVisibility() == 0) {
                    playerActivity.m1710D();
                    return;
                } else {
                    playerActivity.finish();
                    return;
                }
        }
    }

    /* renamed from: d */
    public final void m1258d(boolean z7) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2184e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f2183d) == null) {
            return;
        }
        C0528r c0528r = C0528r.f2167a;
        if (z7 && !this.f2185f) {
            c0528r.m1252b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2185f = true;
        } else {
            if (z7 || !this.f2185f) {
                return;
            }
            c0528r.m1253c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2185f = false;
        }
    }

    /* renamed from: e */
    public final void m1259e() {
        boolean z7 = this.f2186g;
        boolean z8 = false;
        C1911f c1911f = this.f2181b;
        if (c1911f == null || !c1911f.isEmpty()) {
            Iterator it = c1911f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0019f0) it.next()).f68a) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f2186g = z8;
        if (z8 == z7 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m1258d(z8);
    }
}
