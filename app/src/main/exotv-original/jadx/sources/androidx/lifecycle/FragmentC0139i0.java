package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p002a1.C0036o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.i0 */
/* loaded from: classes.dex */
public class FragmentC0139i0 extends Fragment {

    /* renamed from: k */
    public static final /* synthetic */ int f918k = 0;

    /* renamed from: j */
    public C0036o f919j;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: androidx.lifecycle.i0$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0137h0 Companion = new C0137h0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            C0137h0.m559a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC2980h.m5136e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC2980h.m5136e("activity", activity);
            int i = FragmentC0139i0.f918k;
            AbstractC0135g0.m557a(activity, EnumC0146m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
            int i = FragmentC0139i0.f918k;
            AbstractC0135g0.m557a(activity, EnumC0146m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
            int i = FragmentC0139i0.f918k;
            AbstractC0135g0.m557a(activity, EnumC0146m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
            int i = FragmentC0139i0.f918k;
            AbstractC0135g0.m557a(activity, EnumC0146m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
            int i = FragmentC0139i0.f918k;
            AbstractC0135g0.m557a(activity, EnumC0146m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
            int i = FragmentC0139i0.f918k;
            AbstractC0135g0.m557a(activity, EnumC0146m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC2980h.m5136e("activity", activity);
            AbstractC2980h.m5136e("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC2980h.m5136e("activity", activity);
        }
    }

    /* renamed from: a */
    public final void m560a(EnumC0146m enumC0146m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC2980h.m5135d("activity", activity);
            AbstractC0135g0.m557a(activity, enumC0146m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m560a(EnumC0146m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m560a(EnumC0146m.ON_DESTROY);
        this.f919j = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m560a(EnumC0146m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0036o c0036o = this.f919j;
        if (c0036o != null) {
            ((C0133f0) c0036o.f143k).m556a();
        }
        m560a(EnumC0146m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0036o c0036o = this.f919j;
        if (c0036o != null) {
            C0133f0 c0133f0 = (C0133f0) c0036o.f143k;
            int i = c0133f0.f910j + 1;
            c0133f0.f910j = i;
            if (i == 1 && c0133f0.f913m) {
                c0133f0.f915o.m585l(EnumC0146m.ON_START);
                c0133f0.f913m = false;
            }
        }
        m560a(EnumC0146m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m560a(EnumC0146m.ON_STOP);
    }
}
