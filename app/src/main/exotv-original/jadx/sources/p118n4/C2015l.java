package p118n4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.bumptech.glide.ComponentCallbacks2C0738m;
import java.util.Iterator;
import java.util.List;
import p002a1.AbstractComponentCallbacksC0050v;
import p002a1.C0016e;
import p002a1.C0058z;
import p062h.AbstractActivityC1083i;
import p066h4.C1187u;
import p090k2.C1584b;
import p130p.C2186e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.l */
/* loaded from: classes.dex */
public final class C2015l implements Handler.Callback {

    /* renamed from: n */
    public static final C1584b f7436n = new C1584b(14);

    /* renamed from: j */
    public volatile ComponentCallbacks2C0738m f7437j;

    /* renamed from: l */
    public final InterfaceC2009f f7439l;

    /* renamed from: k */
    public final C2186e f7438k = new C2186e(0);

    /* renamed from: m */
    public final C0016e f7440m = new C0016e(f7436n);

    public C2015l() {
        this.f7439l = (C1187u.f5053f && C1187u.f5052e) ? new C2008e() : new C1584b(11);
    }

    /* renamed from: a */
    public static Activity m3881a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m3881a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: b */
    public static void m3882b(List list, C2186e c2186e) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = (AbstractComponentCallbacksC0050v) it.next();
            if (abstractComponentCallbacksC0050v != null && (obj = abstractComponentCallbacksC0050v.f222N) != null) {
                c2186e.put(obj, abstractComponentCallbacksC0050v);
                m3882b(abstractComponentCallbacksC0050v.m226g().f117c.m80k(), c2186e);
            }
        }
    }

    /* renamed from: c */
    public final ComponentCallbacks2C0738m m3883c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC2478m.f9069a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1083i) {
                return m3884d((AbstractActivityC1083i) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m3883c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f7437j == null) {
            synchronized (this) {
                try {
                    if (this.f7437j == null) {
                        this.f7437j = new ComponentCallbacks2C0738m(ComponentCallbacks2C0713b.m1484a(context.getApplicationContext()), new C1584b(9), new C1584b(12), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f7437j;
    }

    /* renamed from: d */
    public final ComponentCallbacks2C0738m m3884d(AbstractActivityC1083i abstractActivityC1083i) {
        char[] cArr = AbstractC2478m.f9069a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return m3883c(abstractActivityC1083i.getApplicationContext());
        }
        if (abstractActivityC1083i.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f7439l.mo3258e(abstractActivityC1083i);
        Activity activityM3881a = m3881a(abstractActivityC1083i);
        return this.f7440m.m33C(abstractActivityC1083i, ComponentCallbacks2C0713b.m1484a(abstractActivityC1083i.getApplicationContext()), abstractActivityC1083i.f2201j, ((C0058z) abstractActivityC1083i.f4599B.f143k).f280s, activityM3881a == null || !activityM3881a.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
