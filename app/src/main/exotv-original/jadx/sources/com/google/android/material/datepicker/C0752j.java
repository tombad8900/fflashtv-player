package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.exotv.net.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p105m0.C1794b;
import p114n0.C1951c;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class C0752j extends C1794b {

    /* renamed from: d */
    public final /* synthetic */ int f3252d;

    /* renamed from: e */
    public final /* synthetic */ Object f3253e;

    public /* synthetic */ C0752j(int i, Object obj) {
        this.f3252d = i;
        this.f3253e = obj;
    }

    @Override // p105m0.C1794b
    /* renamed from: c */
    public void mo1360c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3252d) {
            case 2:
                super.mo1360c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3253e).f3359m);
                break;
            default:
                super.mo1360c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: d */
    public final void mo1361d(View view, C1952d c1952d) {
        int i;
        int i4 = this.f3252d;
        Object obj = this.f3253e;
        View.AccessibilityDelegate accessibilityDelegate = this.f6850a;
        switch (i4) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1952d.f7258a);
                C0755m c0755m = (C0755m) obj;
                c1952d.m3812b(new C1951c(16, c0755m.f3268n0.getVisibility() == 0 ? c0755m.m230k(R.string.mtrl_picker_toggle_to_year_selection) : c0755m.m230k(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i8 = MaterialButtonToggleGroup.f3193B;
                if (view instanceof MaterialButton) {
                    int i9 = 0;
                    for (int i10 = 0; i10 < materialButtonToggleGroup.getChildCount(); i10++) {
                        if (materialButtonToggleGroup.getChildAt(i10) == view) {
                            i = i9;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i10) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i10).getVisibility() != 8) {
                                i9++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f3161E));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1952d.f7258a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f3360n);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f3359m);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1952d.f7258a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo3.setCheckable(navigationMenuItemView.f3367G);
                accessibilityNodeInfo3.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }
}
