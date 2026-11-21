package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.exotv.net.R;
import java.util.Locale;
import p005a4.C0073c;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.d0 */
/* loaded from: classes.dex */
public final class C0746d0 extends AbstractC2923x {

    /* renamed from: d */
    public final C0755m f3242d;

    public C0746d0(C0755m c0755m) {
        this.f3242d = c0755m;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: a */
    public final int mo1455a() {
        return this.f3242d.f3259e0.f3233o;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: d */
    public final void mo1456d(AbstractC2920v0 abstractC2920v0, int i) {
        C0755m c0755m = this.f3242d;
        int i4 = c0755m.f3259e0.f3228j.f3308l + i;
        TextView textView = ((C0744c0) abstractC2920v0).f3237u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i4)));
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0742b0.m1846b().get(1) == i4 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4)));
        C0073c c0073c = c0755m.f3262h0;
        if (AbstractC0742b0.m1846b().get(1) == i4) {
            Object obj = c0073c.f326m;
        } else {
            Object obj2 = c0073c.f325l;
        }
        throw null;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: e */
    public final AbstractC2920v0 mo1457e(ViewGroup viewGroup) {
        return new C0744c0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
