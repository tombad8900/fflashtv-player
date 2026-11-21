package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.e0 */
/* loaded from: classes.dex */
public final class C0131e0 extends AbstractC0134g {
    final /* synthetic */ C0133f0 this$0;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: androidx.lifecycle.e0$a */
    public static final class a extends AbstractC0134g {
        final /* synthetic */ C0133f0 this$0;

        public a(C0133f0 c0133f0) {
            this.this$0 = c0133f0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
            this.this$0.m556a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
            C0133f0 c0133f0 = this.this$0;
            int i = c0133f0.f910j + 1;
            c0133f0.f910j = i;
            if (i == 1 && c0133f0.f913m) {
                c0133f0.f915o.m585l(EnumC0146m.ON_START);
                c0133f0.f913m = false;
            }
        }
    }

    public C0131e0(C0133f0 c0133f0) {
        this.this$0 = c0133f0;
    }

    @Override // androidx.lifecycle.AbstractC0134g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC2980h.m5136e("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0139i0.f918k;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC2980h.m5134c("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((FragmentC0139i0) fragmentFindFragmentByTag).f919j = this.this$0.f917q;
        }
    }

    @Override // androidx.lifecycle.AbstractC0134g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC2980h.m5136e("activity", activity);
        C0133f0 c0133f0 = this.this$0;
        int i = c0133f0.f911k - 1;
        c0133f0.f911k = i;
        if (i == 0) {
            Handler handler = c0133f0.f914n;
            AbstractC2980h.m5133b(handler);
            handler.postDelayed(c0133f0.f916p, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC2980h.m5136e("activity", activity);
        AbstractC0129d0.m555a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0134g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC2980h.m5136e("activity", activity);
        C0133f0 c0133f0 = this.this$0;
        int i = c0133f0.f910j - 1;
        c0133f0.f910j = i;
        if (i == 0 && c0133f0.f912l) {
            c0133f0.f915o.m585l(EnumC0146m.ON_STOP);
            c0133f0.f913m = true;
        }
    }
}
