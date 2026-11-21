package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p014b3.C0565a;
import p014b3.InterfaceC0566b;
import p111m6.C1921p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0566b {
    @Override // p014b3.InterfaceC0566b
    /* renamed from: a */
    public final List mo544a() {
        return C1921p.f7187j;
    }

    @Override // p014b3.InterfaceC0566b
    /* renamed from: b */
    public final Object mo545b(Context context) {
        AbstractC2980h.m5136e("context", context);
        C0565a c0565aM1304c = C0565a.m1304c(context);
        AbstractC2980h.m5135d("getInstance(context)", c0565aM1304c);
        if (!c0565aM1304c.f2272b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0158s.f945a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC2980h.m5134c("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0156r());
        }
        C0133f0 c0133f0 = C0133f0.f909r;
        c0133f0.getClass();
        c0133f0.f914n = new Handler();
        c0133f0.f915o.m585l(EnumC0146m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC2980h.m5134c("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0131e0(c0133f0));
        return c0133f0;
    }
}
