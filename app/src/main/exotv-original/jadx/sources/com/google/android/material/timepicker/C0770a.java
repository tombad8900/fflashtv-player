package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.exotv.net.R;
import p105m0.C1794b;
import p114n0.C1951c;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C0770a extends C1794b {

    /* renamed from: d */
    public final /* synthetic */ int f3521d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f3522e;

    public /* synthetic */ C0770a(ViewGroup viewGroup, int i) {
        this.f3521d = i;
        this.f3522e = viewGroup;
    }

    @Override // p105m0.C1794b
    /* renamed from: d */
    public final void mo1361d(View view, C1952d c1952d) {
        switch (this.f3521d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
                this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                c1952d.m3824o(((EditText) view).getText());
                c1952d.m3820k(((ChipTextInputComboView) this.f3522e).f3487l.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1952d.f7258a;
                this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) this.f3522e).f3493G.get(iIntValue - 1));
                }
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfo2.setClickable(true);
                c1952d.m3812b(C1951c.f7246e);
                break;
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: g */
    public boolean mo1362g(View view, int i, Bundle bundle) {
        switch (this.f3521d) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.f3522e;
                if (i != 16) {
                    break;
                } else {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(clockFaceView.f3490D);
                    float fCenterX = clockFaceView.f3490D.centerX();
                    float fCenterY = clockFaceView.f3490D.centerY();
                    clockFaceView.f3489C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                    clockFaceView.f3489C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                    break;
                }
        }
        return super.mo1362g(view, i, bundle);
    }
}
