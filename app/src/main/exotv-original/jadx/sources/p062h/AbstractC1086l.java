package p062h;

import android.app.Activity;
import android.app.LocaleManager;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.C0253x0;
import p010b.C0527q;
import p028d.C0783a;
import p104m.C1730i1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.l */
/* loaded from: classes.dex */
public abstract class AbstractC1086l {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2291a(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedDispatcher m2292b(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* renamed from: c */
    public static Object m2293c(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0783a.class);
    }

    /* renamed from: d */
    public static String m2294d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: e */
    public static boolean m2295e(C1730i1 c1730i1) {
        return c1730i1.isSelectedChildViewEnabled();
    }

    /* renamed from: f */
    public static boolean m2296f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: g */
    public static LocaleList m2297g(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: h */
    public static void m2298h(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* renamed from: i */
    public static C0527q m2299i(Object obj, LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x) {
        C0527q c0527q = new C0527q(1, layoutInflaterFactory2C1098x);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(C0253x0.CUSTOM_ERROR_CODE_BASE, c0527q);
        return c0527q;
    }

    /* renamed from: j */
    public static void m2300j(C1730i1 c1730i1, boolean z7) {
        c1730i1.setSelectedChildViewEnabled(z7);
    }

    /* renamed from: k */
    public static void m2301k(Object obj, C0527q c0527q) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(C0253x0.CUSTOM_ERROR_CODE_BASE, c0527q);
    }

    /* renamed from: l */
    public static void m2302l(Object obj, C0527q c0527q) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(c0527q);
    }

    /* renamed from: m */
    public static void m2303m(Object obj, C0527q c0527q) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(c0527q);
    }
}
