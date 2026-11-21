package p185v3;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.support.v4.media.session.AbstractC0120b;
import java.lang.ref.WeakReference;
import p005a4.C0073c;
import p005a4.C0087j;
import p065h3.C1163h;
import p090k2.C1584b;
import p134p3.C2209c;
import p143q3.InterfaceC2264f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v3.l */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C2542l implements ComponentCallbacks2 {

    /* renamed from: j */
    public final WeakReference f9233j;

    /* renamed from: k */
    public Context f9234k;

    /* renamed from: l */
    public InterfaceC2264f f9235l;

    /* renamed from: m */
    public boolean f9236m;

    /* renamed from: n */
    public boolean f9237n = true;

    public ComponentCallbacks2C2542l(C1163h c1163h) {
        this.f9233j = new WeakReference(c1163h);
    }

    /* renamed from: a */
    public final synchronized void m4559a() {
        InterfaceC2264f c1584b;
        try {
            C1163h c1163h = (C1163h) this.f9233j.get();
            if (c1163h == null) {
                m4560b();
            } else if (this.f9235l == null) {
                if (c1163h.f4996d.f9227b) {
                    Context context = c1163h.f4993a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || AbstractC0120b.m413i(context) != 0) {
                        c1584b = new C1584b(17);
                    } else {
                        try {
                            c1584b = new C0073c(connectivityManager, this);
                        } catch (Exception unused) {
                            c1584b = new C1584b(17);
                        }
                    }
                } else {
                    c1584b = new C1584b(17);
                }
                this.f9235l = c1584b;
                this.f9237n = c1584b.mo286h();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void m4560b() {
        try {
            if (this.f9236m) {
                return;
            }
            this.f9236m = true;
            Context context = this.f9234k;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            InterfaceC2264f interfaceC2264f = this.f9235l;
            if (interfaceC2264f != null) {
                interfaceC2264f.shutdown();
            }
            this.f9233j.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C1163h) this.f9233j.get()) == null) {
            m4560b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        C1163h c1163h = (C1163h) this.f9233j.get();
        if (c1163h != null) {
            C2209c c2209c = (C2209c) c1163h.f4995c.getValue();
            if (c2209c != null) {
                c2209c.f7723a.mo44a(i);
                C0087j c0087j = c2209c.f7724b;
                synchronized (c0087j) {
                    if (i >= 10 && i != 20) {
                        c0087j.m319e();
                    }
                }
            }
        } else {
            m4560b();
        }
    }
}
