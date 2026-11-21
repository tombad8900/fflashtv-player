package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.exotv.net.R;
import java.util.WeakHashMap;
import p105m0.AbstractC1828m0;
import p105m0.C1864z;
import p216z2.AbstractC2920v0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.w */
/* loaded from: classes.dex */
public final class C0765w extends AbstractC2920v0 {

    /* renamed from: u */
    public final TextView f3322u;

    /* renamed from: v */
    public final MaterialCalendarGridView f3323v;

    public C0765w(LinearLayout linearLayout, boolean z7) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f3322u = textView;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        new C1864z(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m3511f(textView, Boolean.TRUE);
        this.f3323v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z7) {
            return;
        }
        textView.setVisibility(8);
    }
}
