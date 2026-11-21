package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC0129d0 {
    /* renamed from: a */
    public static final void m555a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC2980h.m5136e("activity", activity);
        AbstractC2980h.m5136e("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
