package p118n4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.EnumC0148n;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p004a3.C0064b;
import p004a3.C0067e;
import p004a3.InterfaceC0066d;
import p004a3.InterfaceC0068f;
import p005a4.C0095p;
import p010b.C0515e;
import p023c4.C0641e;
import p082j3.C1488a;
import p120o.C2032d;
import p120o.C2034f;
import p144q4.InterfaceC2267c;
import p178u4.InterfaceC2471f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.p */
/* loaded from: classes.dex */
public final class C2019p implements InterfaceC2471f {

    /* renamed from: n */
    public static volatile C2019p f7447n;

    /* renamed from: j */
    public final /* synthetic */ int f7448j;

    /* renamed from: k */
    public boolean f7449k;

    /* renamed from: l */
    public final Object f7450l;

    /* renamed from: m */
    public final Object f7451m;

    public C2019p() {
        this.f7448j = 3;
        this.f7450l = Collections.newSetFromMap(new WeakHashMap());
        this.f7451m = new HashSet();
    }

    /* renamed from: b */
    public static C2019p m3885b(Context context) {
        if (f7447n == null) {
            synchronized (C2019p.class) {
                try {
                    if (f7447n == null) {
                        f7447n = new C2019p(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f7447n;
    }

    /* renamed from: a */
    public boolean m3886a(InterfaceC2267c interfaceC2267c) {
        boolean z7 = true;
        if (interfaceC2267c == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f7450l).remove(interfaceC2267c);
        if (!((HashSet) this.f7451m).remove(interfaceC2267c) && !zRemove) {
            z7 = false;
        }
        if (z7) {
            interfaceC2267c.clear();
        }
        return z7;
    }

    /* renamed from: c */
    public void m3887c() {
        if (this.f7449k || ((HashSet) this.f7451m).isEmpty()) {
            return;
        }
        C1488a c1488a = (C1488a) this.f7450l;
        C0095p c0095p = (C0095p) c1488a.f5723c;
        boolean z7 = false;
        c1488a.f5721a = ((ConnectivityManager) c0095p.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c0095p.get()).registerDefaultNetworkCallback((C2018o) c1488a.f5724d);
            z7 = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f7449k = z7;
    }

    /* renamed from: d */
    public void m3888d() {
        InterfaceC0068f interfaceC0068f = (InterfaceC0068f) this.f7450l;
        AbstractC0150o abstractC0150oMo224e = interfaceC0068f.mo224e();
        if (abstractC0150oMo224e.mo569b() != EnumC0148n.f926k) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        abstractC0150oMo224e.mo568a(new C0064b(0, interfaceC0068f));
        C0067e c0067e = (C0067e) this.f7451m;
        c0067e.getClass();
        if (c0067e.f306a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC0150oMo224e.mo568a(new C0515e(2, c0067e));
        c0067e.f306a = true;
        this.f7449k = true;
    }

    /* renamed from: e */
    public void m3889e(Bundle bundle) {
        if (!this.f7449k) {
            m3888d();
        }
        AbstractC0150o abstractC0150oMo224e = ((InterfaceC0068f) this.f7450l).mo224e();
        if (abstractC0150oMo224e.mo569b().compareTo(EnumC0148n.f928m) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + abstractC0150oMo224e.mo569b()).toString());
        }
        C0067e c0067e = (C0067e) this.f7451m;
        if (!c0067e.f306a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0067e.f307b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0067e.f310e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0067e.f307b = true;
    }

    /* renamed from: f */
    public void m3890f(Bundle bundle) {
        C0067e c0067e = (C0067e) this.f7451m;
        c0067e.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0067e.f310e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2034f c2034f = (C2034f) c0067e.f309d;
        c2034f.getClass();
        C2032d c2032d = new C2032d(c2034f);
        c2034f.f7501l.put(c2032d, Boolean.FALSE);
        while (c2032d.hasNext()) {
            Map.Entry entry = (Map.Entry) c2032d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0066d) entry.getValue()).mo238a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // p178u4.InterfaceC2471f
    public Object get() {
        if (this.f7449k) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        AbstractC0715d.m1561g("Glide registry");
        this.f7449k = true;
        try {
            return AbstractC0715d.m1570q((ComponentCallbacks2C0713b) this.f7450l, (ArrayList) this.f7451m);
        } finally {
            this.f7449k = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f7448j) {
            case 3:
                return super.toString() + "{numRequests=" + ((Set) this.f7450l).size() + ", isPaused=" + this.f7449k + "}";
            default:
                return super.toString();
        }
    }

    public C2019p(InterfaceC0068f interfaceC0068f) {
        this.f7448j = 1;
        this.f7450l = interfaceC0068f;
        this.f7451m = new C0067e();
    }

    public C2019p(Context context) {
        this.f7448j = 0;
        this.f7451m = new HashSet();
        this.f7450l = new C1488a(new C0095p(new C0641e(context, 9)), new C2016m(this));
    }

    public C2019p(ComponentCallbacks2C0713b componentCallbacks2C0713b, ArrayList arrayList, AbstractC0714c abstractC0714c) {
        this.f7448j = 2;
        this.f7450l = componentCallbacks2C0713b;
        this.f7451m = arrayList;
    }
}
