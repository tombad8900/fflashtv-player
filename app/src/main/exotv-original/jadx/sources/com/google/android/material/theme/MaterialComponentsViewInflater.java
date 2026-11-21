package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import p017b6.C0592a0;
import p025c6.C0706a;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p062h.C1069a0;
import p101l5.C1683c;
import p104m.C1705c0;
import p104m.C1752o;
import p104m.C1760q;
import p104m.C1764r;
import p104m.C1780w0;
import p171t5.AbstractC2436a;
import p179u5.C2479a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C1069a0 {
    @Override // p062h.C1069a0
    /* renamed from: a */
    public final C1752o mo1917a(Context context, AttributeSet attributeSet) {
        return new C0592a0(context, attributeSet);
    }

    @Override // p062h.C1069a0
    /* renamed from: b */
    public final C1760q mo1918b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p062h.C1069a0
    /* renamed from: c */
    public final C1764r mo1919c(Context context, AttributeSet attributeSet) {
        return new C1683c(context, attributeSet);
    }

    @Override // p062h.C1069a0
    /* renamed from: d */
    public final C1705c0 mo1920d(Context context, AttributeSet attributeSet) {
        return new C2479a(context, attributeSet);
    }

    @Override // p062h.C1069a0
    /* renamed from: e */
    public final C1780w0 mo1921e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C0706a c0706a = new C0706a(AbstractC0848a.m2015b(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = c0706a.getContext();
        if (AbstractC2436a.m4341p(context2.getTheme(), com.exotv.net.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0847a.f3761w;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iM1476h = C0706a.m1476h(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM1476h == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0847a.f3760v);
                    int iM1476h2 = C0706a.m1476h(c0706a.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM1476h2 >= 0) {
                        c0706a.setLineHeight(iM1476h2);
                    }
                }
            }
        }
        return c0706a;
    }
}
