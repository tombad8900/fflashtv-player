package p017b6;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p105m0.C1794b;
import p114n0.C1951c;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.e0 */
/* loaded from: classes.dex */
public final class C0600e0 extends C1794b {

    /* renamed from: d */
    public final /* synthetic */ int f2402d;

    public /* synthetic */ C0600e0(int i) {
        this.f2402d = i;
    }

    @Override // p105m0.C1794b
    /* renamed from: c */
    public void mo1360c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2402d) {
            case 4:
                super.mo1360c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo1360c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: d */
    public final void mo1361d(View view, C1952d c1952d) {
        int scrollRange;
        switch (this.f2402d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
                this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1952d.f7258a;
                this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1952d.f7258a;
                this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c1952d.f7258a;
                this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = c1952d.f7258a;
                this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c1952d.m3818i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo5.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c1952d.m3812b(C1951c.f7248g);
                        c1952d.m3812b(C1951c.f7251j);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c1952d.m3812b(C1951c.f7247f);
                        c1952d.m3812b(C1951c.f7252k);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // p105m0.C1794b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1362g(View view, int i, Bundle bundle) {
        switch (this.f2402d) {
            case 4:
                if (super.mo1362g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m540u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m540u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                    }
                }
                return false;
            default:
                return super.mo1362g(view, i, bundle);
        }
    }
}
