package p002a1;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0147m0;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.C0161t0;
import androidx.lifecycle.C0166x;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.InterfaceC0138i;
import androidx.lifecycle.InterfaceC0163u0;
import java.util.LinkedHashMap;
import p004a3.C0067e;
import p004a3.InterfaceC0068f;
import p030d1.C0798b;
import p118n4.C2019p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.w0 */
/* loaded from: classes.dex */
public final class C0053w0 implements InterfaceC0138i, InterfaceC0068f, InterfaceC0163u0 {

    /* renamed from: j */
    public final AbstractComponentCallbacksC0050v f264j;

    /* renamed from: k */
    public final C0161t0 f265k;

    /* renamed from: l */
    public C0166x f266l = null;

    /* renamed from: m */
    public C2019p f267m = null;

    public C0053w0(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v, C0161t0 c0161t0) {
        this.f264j = abstractComponentCallbacksC0050v;
        this.f265k = c0161t0;
    }

    @Override // androidx.lifecycle.InterfaceC0138i
    /* renamed from: a */
    public final C0798b mo221a() {
        Application application;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f264j;
        Context applicationContext = abstractComponentCallbacksC0050v.m217D().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0798b c0798b = new C0798b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0798b.f933j;
        if (application != null) {
            linkedHashMap.put(AbstractC0147m0.f924d, application);
        }
        linkedHashMap.put(AbstractC0147m0.f921a, this);
        linkedHashMap.put(AbstractC0147m0.f922b, this);
        Bundle bundle = abstractComponentCallbacksC0050v.f241o;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0147m0.f923c, bundle);
        }
        return c0798b;
    }

    @Override // androidx.lifecycle.InterfaceC0163u0
    /* renamed from: b */
    public final C0161t0 mo222b() {
        m240f();
        return this.f265k;
    }

    @Override // p004a3.InterfaceC0068f
    /* renamed from: c */
    public final C0067e mo223c() {
        m240f();
        return (C0067e) this.f267m.f7451m;
    }

    /* renamed from: d */
    public final void m239d(EnumC0146m enumC0146m) {
        this.f266l.m585l(enumC0146m);
    }

    @Override // androidx.lifecycle.InterfaceC0164v
    /* renamed from: e */
    public final AbstractC0150o mo224e() {
        m240f();
        return this.f266l;
    }

    /* renamed from: f */
    public final void m240f() {
        if (this.f266l == null) {
            this.f266l = new C0166x(this);
            C2019p c2019p = new C2019p(this);
            this.f267m = c2019p;
            c2019p.m3888d();
            AbstractC0147m0.m565d(this);
        }
    }
}
