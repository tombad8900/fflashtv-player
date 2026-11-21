package p175u0;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u0.b */
/* loaded from: classes.dex */
public final class C2450b {

    /* renamed from: a */
    public C2449a f8974a;

    /* renamed from: b */
    public final /* synthetic */ C2452d f8975b;

    public C2450b(C2452d c2452d) {
        this.f8975b = c2452d;
    }

    /* renamed from: a */
    public final boolean m4428a() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f8974a);
        this.f8974a = null;
        return zUnregisterDurationScaleChangeListener;
    }
}
