package p166t0;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Comparator;
import p090k2.C1584b;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t0.c */
/* loaded from: classes.dex */
public final class C2389c implements Comparator {

    /* renamed from: j */
    public final Rect f8390j = new Rect();

    /* renamed from: k */
    public final Rect f8391k = new Rect();

    /* renamed from: l */
    public final boolean f8392l;

    /* renamed from: m */
    public final C1584b f8393m;

    public C2389c(boolean z7, C1584b c1584b) {
        this.f8392l = z7;
        this.f8393m = c1584b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f8393m.getClass();
        AccessibilityNodeInfo accessibilityNodeInfo = ((C1952d) obj).f7258a;
        Rect rect = this.f8390j;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((C1952d) obj2).f7258a;
        Rect rect2 = this.f8391k;
        accessibilityNodeInfo2.getBoundsInScreen(rect2);
        int i = rect.top;
        int i4 = rect2.top;
        if (i < i4) {
            return -1;
        }
        if (i > i4) {
            return 1;
        }
        int i8 = rect.left;
        int i9 = rect2.left;
        boolean z7 = this.f8392l;
        if (i8 < i9) {
            return z7 ? 1 : -1;
        }
        if (i8 > i9) {
            return z7 ? -1 : 1;
        }
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.right;
        int i13 = rect2.right;
        if (i12 < i13) {
            return z7 ? 1 : -1;
        }
        if (i12 > i13) {
            return z7 ? -1 : 1;
        }
        return 0;
    }
}
