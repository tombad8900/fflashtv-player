package p010b;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.g */
/* loaded from: classes.dex */
public final class C0517g {

    /* renamed from: a */
    public static final C0517g f2122a = new C0517g();

    /* renamed from: a */
    public final OnBackInvokedDispatcher m1241a(Activity activity) {
        AbstractC2980h.m5136e("activity", activity);
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC2980h.m5135d("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
        return onBackInvokedDispatcher;
    }
}
