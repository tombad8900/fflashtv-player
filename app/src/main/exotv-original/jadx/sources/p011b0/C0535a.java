package p011b0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import p085j6.RunnableC1527q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b0.a */
/* loaded from: classes.dex */
public final class C0535a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Object f2187a;

    /* renamed from: b */
    public Activity f2188b;

    /* renamed from: c */
    public final int f2189c;

    /* renamed from: d */
    public boolean f2190d = false;

    /* renamed from: e */
    public boolean f2191e = false;

    /* renamed from: f */
    public boolean f2192f = false;

    public C0535a(Activity activity) {
        this.f2188b = activity;
        this.f2189c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2188b == activity) {
            this.f2188b = null;
            this.f2191e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f2191e || this.f2192f || this.f2190d) {
            return;
        }
        Object obj = this.f2187a;
        try {
            Object obj2 = AbstractC0536b.f2195c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f2189c) {
                AbstractC0536b.f2199g.postAtFrontOfQueue(new RunnableC1527q(AbstractC0536b.f2194b.get(activity), 4, obj2));
                this.f2192f = true;
                this.f2187a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2188b == activity) {
            this.f2190d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
