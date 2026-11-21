package p010b;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.AbstractC0135g0;
import androidx.lifecycle.AbstractC0147m0;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.C0161t0;
import androidx.lifecycle.C0166x;
import androidx.lifecycle.FragmentC0139i0;
import androidx.lifecycle.InterfaceC0138i;
import androidx.lifecycle.InterfaceC0163u0;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p002a1.C0021g0;
import p002a1.C0052w;
import p002a1.C0056y;
import p004a3.C0064b;
import p004a3.C0067e;
import p004a3.InterfaceC0068f;
import p005a4.C0073c;
import p005a4.C0095p;
import p011b0.AbstractActivityC0539e;
import p011b0.C0540f;
import p011b0.C0545k;
import p018c.InterfaceC0627a;
import p030d1.C0798b;
import p062h.AbstractActivityC1083i;
import p096l0.InterfaceC1641a;
import p102l6.C1690g;
import p118n4.C2019p;
import p211y5.C2819f;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.l */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0522l extends AbstractActivityC0539e implements InterfaceC0163u0, InterfaceC0138i, InterfaceC0068f {

    /* renamed from: A */
    public static final /* synthetic */ int f2137A = 0;

    /* renamed from: k */
    public final C0095p f2138k = new C0095p();

    /* renamed from: l */
    public final C0073c f2139l;

    /* renamed from: m */
    public final C2019p f2140m;

    /* renamed from: n */
    public C0161t0 f2141n;

    /* renamed from: o */
    public final ViewTreeObserverOnDrawListenerC0519i f2142o;

    /* renamed from: p */
    public final C1690g f2143p;

    /* renamed from: q */
    public final C0520j f2144q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f2145r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f2146s;

    /* renamed from: t */
    public final CopyOnWriteArrayList f2147t;

    /* renamed from: u */
    public final CopyOnWriteArrayList f2148u;

    /* renamed from: v */
    public final CopyOnWriteArrayList f2149v;

    /* renamed from: w */
    public final CopyOnWriteArrayList f2150w;

    /* renamed from: x */
    public boolean f2151x;

    /* renamed from: y */
    public boolean f2152y;

    /* renamed from: z */
    public final C1690g f2153z;

    public AbstractActivityC0522l() {
        AbstractActivityC1083i abstractActivityC1083i = (AbstractActivityC1083i) this;
        this.f2139l = new C0073c(new RunnableC0514d(abstractActivityC1083i, 0));
        C2019p c2019p = new C2019p((InterfaceC0068f) this);
        this.f2140m = c2019p;
        this.f2142o = new ViewTreeObserverOnDrawListenerC0519i(abstractActivityC1083i);
        this.f2143p = new C1690g(new C0521k(abstractActivityC1083i, 1));
        new AtomicInteger();
        this.f2144q = new C0520j();
        this.f2145r = new CopyOnWriteArrayList();
        this.f2146s = new CopyOnWriteArrayList();
        this.f2147t = new CopyOnWriteArrayList();
        this.f2148u = new CopyOnWriteArrayList();
        this.f2149v = new CopyOnWriteArrayList();
        this.f2150w = new CopyOnWriteArrayList();
        C0166x c0166x = this.f2201j;
        if (c0166x == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        c0166x.mo568a(new C0515e(0, abstractActivityC1083i));
        this.f2201j.mo568a(new C0515e(1, abstractActivityC1083i));
        this.f2201j.mo568a(new C0064b(4, abstractActivityC1083i));
        c2019p.m3888d();
        AbstractC0147m0.m565d(this);
        ((C0067e) c2019p.f7451m).m254e("android:support:activity-result", new C0052w(1, abstractActivityC1083i));
        m1246h(new C0056y(abstractActivityC1083i, 1));
        this.f2153z = new C1690g(new C0521k(abstractActivityC1083i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0138i
    /* renamed from: a */
    public final C0798b mo221a() {
        C0798b c0798b = new C0798b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0798b.f933j;
        if (getApplication() != null) {
            C2819f c2819f = AbstractC0147m0.f924d;
            Application application = getApplication();
            AbstractC2980h.m5135d("application", application);
            linkedHashMap.put(c2819f, application);
        }
        linkedHashMap.put(AbstractC0147m0.f921a, this);
        linkedHashMap.put(AbstractC0147m0.f922b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC0147m0.f923c, extras);
        }
        return c0798b;
    }

    @Override // androidx.lifecycle.InterfaceC0163u0
    /* renamed from: b */
    public final C0161t0 mo222b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2141n == null) {
            C0518h c0518h = (C0518h) getLastNonConfigurationInstance();
            if (c0518h != null) {
                this.f2141n = c0518h.f2123a;
            }
            if (this.f2141n == null) {
                this.f2141n = new C0161t0();
            }
        }
        C0161t0 c0161t0 = this.f2141n;
        AbstractC2980h.m5133b(c0161t0);
        return c0161t0;
    }

    @Override // p004a3.InterfaceC0068f
    /* renamed from: c */
    public final C0067e mo223c() {
        return (C0067e) this.f2140m.f7451m;
    }

    @Override // androidx.lifecycle.InterfaceC0164v
    /* renamed from: e */
    public final AbstractC0150o mo224e() {
        return this.f2201j;
    }

    /* renamed from: g */
    public final void m1245g(InterfaceC1641a interfaceC1641a) {
        AbstractC2980h.m5136e("listener", interfaceC1641a);
        this.f2145r.add(interfaceC1641a);
    }

    /* renamed from: h */
    public final void m1246h(InterfaceC0627a interfaceC0627a) {
        C0095p c0095p = this.f2138k;
        c0095p.getClass();
        AbstractActivityC0522l abstractActivityC0522l = (AbstractActivityC0522l) c0095p.f444k;
        if (abstractActivityC0522l != null) {
            interfaceC0627a.mo242a(abstractActivityC0522l);
        }
        ((CopyOnWriteArraySet) c0095p.f443j).add(interfaceC0627a);
    }

    /* renamed from: i */
    public final C0534x m1247i() {
        return (C0534x) this.f2153z.getValue();
    }

    /* renamed from: j */
    public final void m1248j() {
        View decorView = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        if (this.f2144q.m1242a(i, i4, intent)) {
            return;
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m1247i().m1257c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC2980h.m5136e("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2145r.iterator();
        while (it.hasNext()) {
            ((InterfaceC1641a) it.next()).accept(configuration);
        }
    }

    @Override // p011b0.AbstractActivityC0539e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2140m.m3889e(bundle);
        C0095p c0095p = this.f2138k;
        c0095p.getClass();
        c0095p.f444k = this;
        Iterator it = ((CopyOnWriteArraySet) c0095p.f443j).iterator();
        while (it.hasNext()) {
            ((InterfaceC0627a) it.next()).mo242a(this);
        }
        super.onCreate(bundle);
        int i = FragmentC0139i0.f918k;
        AbstractC0135g0.m558b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        AbstractC2980h.m5136e("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f2139l.f326m).iterator();
        while (it.hasNext()) {
            ((C0021g0) it.next()).f77a.m144j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        AbstractC2980h.m5136e("item", menuItem);
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f2139l.f326m).iterator();
            while (it.hasNext()) {
                if (((C0021g0) it.next()).f77a.m149o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7) {
        if (this.f2151x) {
            return;
        }
        Iterator it = this.f2148u.iterator();
        while (it.hasNext()) {
            ((InterfaceC1641a) it.next()).accept(new C0540f(z7));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC2980h.m5136e("intent", intent);
        super.onNewIntent(intent);
        Iterator it = this.f2147t.iterator();
        while (it.hasNext()) {
            ((InterfaceC1641a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        AbstractC2980h.m5136e("menu", menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2139l.f326m).iterator();
        while (it.hasNext()) {
            ((C0021g0) it.next()).f77a.m150p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7) {
        if (this.f2152y) {
            return;
        }
        Iterator it = this.f2149v.iterator();
        while (it.hasNext()) {
            ((InterfaceC1641a) it.next()).accept(new C0545k(z7));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        AbstractC2980h.m5136e("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2139l.f326m).iterator();
        while (it.hasNext()) {
            ((C0021g0) it.next()).f77a.m153s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC2980h.m5136e("permissions", strArr);
        AbstractC2980h.m5136e("grantResults", iArr);
        if (this.f2144q.m1242a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0518h c0518h;
        C0161t0 c0161t0 = this.f2141n;
        if (c0161t0 == null && (c0518h = (C0518h) getLastNonConfigurationInstance()) != null) {
            c0161t0 = c0518h.f2123a;
        }
        if (c0161t0 == null) {
            return null;
        }
        C0518h c0518h2 = new C0518h();
        c0518h2.f2123a = c0161t0;
        return c0518h2;
    }

    @Override // p011b0.AbstractActivityC0539e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC2980h.m5136e("outState", bundle);
        C0166x c0166x = this.f2201j;
        if (c0166x != null) {
            c0166x.m587n();
        }
        super.onSaveInstanceState(bundle);
        this.f2140m.m3890f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f2146s.iterator();
        while (it.hasNext()) {
            ((InterfaceC1641a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f2150w.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0715d.m1548Q()) {
                AbstractC0715d.m1561g("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0524n c0524n = (C0524n) this.f2143p.getValue();
            synchronized (c0524n.f2158b) {
                try {
                    c0524n.f2159c = true;
                    ArrayList arrayList = c0524n.f2160d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((InterfaceC2840a) obj).invoke();
                    }
                    c0524n.f2160d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m1248j();
        View decorView = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView);
        ViewTreeObserverOnDrawListenerC0519i viewTreeObserverOnDrawListenerC0519i = this.f2142o;
        viewTreeObserverOnDrawListenerC0519i.getClass();
        if (!viewTreeObserverOnDrawListenerC0519i.f2126l) {
            viewTreeObserverOnDrawListenerC0519i.f2126l = true;
            decorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0519i);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        AbstractC2980h.m5136e("intent", intent);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i4, int i8, int i9) throws IntentSender.SendIntentException {
        AbstractC2980h.m5136e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i4, i8, i9);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC2980h.m5136e("intent", intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i4, int i8, int i9, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC2980h.m5136e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i4, i8, i9, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7, Configuration configuration) {
        AbstractC2980h.m5136e("newConfig", configuration);
        this.f2151x = true;
        try {
            super.onMultiWindowModeChanged(z7, configuration);
            this.f2151x = false;
            Iterator it = this.f2148u.iterator();
            while (it.hasNext()) {
                ((InterfaceC1641a) it.next()).accept(new C0540f(z7));
            }
        } catch (Throwable th) {
            this.f2151x = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7, Configuration configuration) {
        AbstractC2980h.m5136e("newConfig", configuration);
        this.f2152y = true;
        try {
            super.onPictureInPictureModeChanged(z7, configuration);
            this.f2152y = false;
            Iterator it = this.f2149v.iterator();
            while (it.hasNext()) {
                ((InterfaceC1641a) it.next()).accept(new C0545k(z7));
            }
        } catch (Throwable th) {
            this.f2152y = false;
            throw th;
        }
    }
}
