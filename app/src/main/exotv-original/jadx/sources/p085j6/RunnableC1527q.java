package p085j6;

import android.app.Application;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p002a1.C0030l;
import p002a1.C0036o;
import p002a1.C0059z0;
import p005a4.C0073c;
import p011b0.AbstractC0536b;
import p011b0.C0535a;
import p029d0.AbstractC0786b;
import p033d4.ThreadFactoryC0844c;
import p066h4.C1187u;
import p076i7.AbstractC1327r;
import p076i7.AbstractC1339x;
import p076i7.C1295g;
import p079j0.C1478f;
import p086j7.C1534d;
import p093k6.AbstractC1607a;
import p112m7.C1931g;
import p118n4.ViewTreeObserverOnDrawListenerC2007d;
import p137p6.C2228i;
import p166t0.C2392f;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.q */
/* loaded from: classes.dex */
public final class RunnableC1527q implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f5846j;

    /* renamed from: k */
    public Object f5847k;

    /* renamed from: l */
    public final Object f5848l;

    public /* synthetic */ RunnableC1527q(Object obj, int i, Object obj2) {
        this.f5846j = i;
        this.f5847k = obj;
        this.f5848l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        switch (this.f5846j) {
            case 0:
                InterfaceC1526p interfaceC1526p = (InterfaceC1526p) this.f5848l;
                Future future = (Future) this.f5847k;
                if (future instanceof AbstractC1607a) {
                    AbstractC1524n abstractC1524n = (AbstractC1524n) ((AbstractC1607a) future);
                    if (abstractC1524n instanceof InterfaceC1517g) {
                        Object obj = abstractC1524n.f5841j;
                        th = obj instanceof C1513c ? ((C1513c) obj).f5818a : null;
                        if (th != null) {
                            interfaceC1526p.onFailure(th);
                            return;
                        }
                    } else {
                        abstractC1524n.getClass();
                    }
                    if (th != null) {
                    }
                }
                try {
                    interfaceC1526p.onSuccess(AbstractC0120b.m425u(future));
                    return;
                } catch (ExecutionException e) {
                    interfaceC1526p.onFailure(e.getCause());
                    return;
                } catch (Throwable th2) {
                    interfaceC1526p.onFailure(th2);
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.f5847k;
                C0059z0 c0059z0 = (C0059z0) this.f5848l;
                if (arrayList.contains(c0059z0)) {
                    arrayList.remove(c0059z0);
                    AbstractC0008a1.m5a(c0059z0.f284c.f222N, c0059z0.f282a);
                    return;
                }
                return;
            case 2:
                ((C0535a) this.f5847k).f2187a = this.f5848l;
                return;
            case 3:
                ((Application) this.f5847k).unregisterActivityLifecycleCallbacks((C0535a) this.f5848l);
                return;
            case 4:
                Object obj2 = this.f5848l;
                Object obj3 = this.f5847k;
                try {
                    Method method = AbstractC0536b.f2196d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0536b.f2197e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e8) {
                    if (e8.getClass() == RuntimeException.class && e8.getMessage() != null && e8.getMessage().startsWith("Unable to stop")) {
                        throw e8;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 5:
                ThreadFactoryC0844c threadFactoryC0844c = (ThreadFactoryC0844c) this.f5848l;
                if (threadFactoryC0844c.f3726d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f5847k).run();
                    return;
                } catch (Throwable th4) {
                    threadFactoryC0844c.f3725c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th4);
                        return;
                    }
                    return;
                }
            case 6:
                C2392f c2392f = ((SwipeDismissBehavior) this.f5848l).f3083a;
                if (c2392f == null || !c2392f.m4228f()) {
                    return;
                }
                ((View) this.f5847k).postOnAnimation(this);
                return;
            case 7:
                C0036o c0036o = (C0036o) this.f5847k;
                Typeface typeface = (Typeface) this.f5848l;
                AbstractC0786b abstractC0786b = (AbstractC0786b) c0036o.f143k;
                if (abstractC0786b != null) {
                    abstractC0786b.mo1943h(typeface);
                    return;
                }
                return;
            case 8:
                ((C1478f) this.f5847k).accept(this.f5848l);
                return;
            case 9:
                ((C1295g) this.f5847k).m2799E((C1534d) this.f5848l);
                return;
            case 10:
                C1931g c1931g = (C1931g) this.f5848l;
                AbstractC1327r abstractC1327r = c1931g.f7209m;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f5847k).run();
                    } catch (Throwable th5) {
                        AbstractC1339x.m2848i(C2228i.f7747j, th5);
                    }
                    Runnable runnableM3776G = c1931g.m3776G();
                    if (runnableM3776G == null) {
                        return;
                    }
                    this.f5847k = runnableM3776G;
                    i++;
                    if (i >= 16 && abstractC1327r.mo2838E(c1931g)) {
                        abstractC1327r.mo2822D(c1931g, this);
                        return;
                    }
                }
                break;
            default:
                C1187u c1187uM2606a = C1187u.m2606a();
                c1187uM2606a.getClass();
                AbstractC2478m.m4453a();
                c1187uM2606a.f5059d.set(true);
                ((ViewTreeObserverOnDrawListenerC2007d) this.f5848l).f7429k.f7431k = true;
                ((ViewTreeObserverOnDrawListenerC2007d) this.f5848l).f7428j.getViewTreeObserver().removeOnDrawListener((ViewTreeObserverOnDrawListenerC2007d) this.f5847k);
                ((ViewTreeObserverOnDrawListenerC2007d) this.f5848l).f7429k.f7430j.clear();
                return;
        }
    }

    public String toString() {
        switch (this.f5846j) {
            case 0:
                C0073c c0073c = new C0073c(RunnableC1527q.class.getSimpleName(), 8);
                InterfaceC1526p interfaceC1526p = (InterfaceC1526p) this.f5848l;
                C0016e c0016e = new C0016e(12, false);
                ((C0016e) c0073c.f326m).f63l = c0016e;
                c0073c.f326m = c0016e;
                c0016e.f62k = interfaceC1526p;
                return c0073c.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC1527q(Object obj, Object obj2, int i, boolean z7) {
        this.f5846j = i;
        this.f5848l = obj;
        this.f5847k = obj2;
    }

    public RunnableC1527q(C0030l c0030l, ArrayList arrayList, C0059z0 c0059z0) {
        this.f5846j = 1;
        this.f5847k = arrayList;
        this.f5848l = c0059z0;
    }

    public RunnableC1527q(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z7) {
        this.f5846j = 6;
        this.f5848l = swipeDismissBehavior;
        this.f5847k = view;
    }
}
