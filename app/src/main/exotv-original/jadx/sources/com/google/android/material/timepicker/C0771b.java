package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import p162s5.AbstractC2373k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class C0771b extends AbstractC2373k {

    /* renamed from: j */
    public final /* synthetic */ ChipTextInputComboView f3523j;

    public C0771b(ChipTextInputComboView chipTextInputComboView) {
        this.f3523j = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f3523j;
        if (zIsEmpty) {
            chipTextInputComboView.f3488m = ChipTextInputComboView.m1922a(chipTextInputComboView, "00");
            return;
        }
        String strM1922a = ChipTextInputComboView.m1922a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(strM1922a)) {
            strM1922a = ChipTextInputComboView.m1922a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.f3488m = strM1922a;
    }
}
