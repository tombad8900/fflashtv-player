package p114n0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n0.e */
/* loaded from: classes.dex */
public class C1953e extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C1629o f7260a;

    public C1953e(C1629o c1629o) {
        this.f7260a = c1629o;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1952d c1952dMo3327r = this.f7260a.mo3327r(i);
        if (c1952dMo3327r == null) {
            return null;
        }
        return c1952dMo3327r.f7258a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f7260a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C1952d c1952dMo3328s = this.f7260a.mo3328s(i);
        if (c1952dMo3328s == null) {
            return null;
        }
        return c1952dMo3328s.f7258a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i4, Bundle bundle) {
        return this.f7260a.mo3331w(i, i4, bundle);
    }
}
