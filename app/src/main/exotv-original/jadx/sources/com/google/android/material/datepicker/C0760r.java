package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C0760r<S> extends AbstractC0767y {

    /* renamed from: d0 */
    public int f3304d0;

    /* renamed from: e0 */
    public C0741b f3305e0;

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: t */
    public final void mo185t(Bundle bundle) {
        super.mo185t(bundle);
        if (bundle == null) {
            bundle = this.f241o;
        }
        this.f3304d0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3305e0 = (C0741b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: u */
    public final View mo237u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m227h(), this.f3304d0));
        throw null;
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: y */
    public final void mo189y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3304d0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3305e0);
    }
}
