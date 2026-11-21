package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p002a1.C0035n0;
import p002a1.C0036o;
import p002a1.DialogInterfaceOnCancelListenerC0040q;
import p113n.C1947a;
import p120o.C2032d;
import p120o.C2034f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes.dex */
public class C0123a0 {

    /* renamed from: j */
    public static final Object f888j = new Object();

    /* renamed from: a */
    public final Object f889a = new Object();

    /* renamed from: b */
    public final C2034f f890b = new C2034f();

    /* renamed from: c */
    public int f891c = 0;

    /* renamed from: d */
    public boolean f892d;

    /* renamed from: e */
    public volatile Object f893e;

    /* renamed from: f */
    public volatile Object f894f;

    /* renamed from: g */
    public int f895g;

    /* renamed from: h */
    public boolean f896h;

    /* renamed from: i */
    public boolean f897i;

    public C0123a0() {
        Object obj = f888j;
        this.f894f = obj;
        this.f893e = obj;
        this.f895g = -1;
    }

    /* renamed from: a */
    public static void m548a(String str) {
        ((C1947a) C1947a.m3804s0().f7240n).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0008a1.m17m("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m549b(C0168z c0168z) {
        if (c0168z.f961b) {
            int i = c0168z.f962c;
            int i4 = this.f895g;
            if (i >= i4) {
                return;
            }
            c0168z.f962c = i4;
            C0036o c0036o = c0168z.f960a;
            Object obj = this.f893e;
            c0036o.getClass();
            InterfaceC0164v interfaceC0164v = (InterfaceC0164v) obj;
            DialogInterfaceOnCancelListenerC0040q dialogInterfaceOnCancelListenerC0040q = (DialogInterfaceOnCancelListenerC0040q) c0036o.f143k;
            if (interfaceC0164v == null || !dialogInterfaceOnCancelListenerC0040q.f160h0) {
                return;
            }
            View viewM218E = dialogInterfaceOnCancelListenerC0040q.m218E();
            if (viewM218E.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (dialogInterfaceOnCancelListenerC0040q.f164l0 != null) {
                if (C0035n0.m106G(3)) {
                    Log.d("FragmentManager", "DialogFragment " + c0036o + " setting the content view on " + dialogInterfaceOnCancelListenerC0040q.f164l0);
                }
                dialogInterfaceOnCancelListenerC0040q.f164l0.setContentView(viewM218E);
            }
        }
    }

    /* renamed from: c */
    public final void m550c(C0168z c0168z) {
        if (this.f896h) {
            this.f897i = true;
            return;
        }
        this.f896h = true;
        do {
            this.f897i = false;
            if (c0168z != null) {
                m549b(c0168z);
                c0168z = null;
            } else {
                C2034f c2034f = this.f890b;
                c2034f.getClass();
                C2032d c2032d = new C2032d(c2034f);
                c2034f.f7501l.put(c2032d, Boolean.FALSE);
                while (c2032d.hasNext()) {
                    m549b((C0168z) ((Map.Entry) c2032d.next()).getValue());
                    if (this.f897i) {
                        break;
                    }
                }
            }
        } while (this.f897i);
        this.f896h = false;
    }

    /* renamed from: d */
    public final void m551d(Object obj) {
        m548a("setValue");
        this.f895g++;
        this.f893e = obj;
        m550c(null);
    }
}
