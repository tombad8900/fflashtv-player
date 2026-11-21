package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.C0752j;
import p104m.C1782x;
import p105m0.AbstractC1828m0;
import p162s5.C2364b;
import p162s5.InterfaceC2363a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class CheckableImageButton extends C1782x implements Checkable {

    /* renamed from: q */
    public static final int[] f3358q = {R.attr.state_checked};

    /* renamed from: m */
    public boolean f3359m;

    /* renamed from: n */
    public boolean f3360n;

    /* renamed from: o */
    public boolean f3361o;

    /* renamed from: p */
    public InterfaceC2363a f3362p;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.exotv.net.R.attr.imageButtonStyle);
        this.f3360n = true;
        this.f3361o = true;
        AbstractC1828m0.m3608m(this, new C0752j(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3359m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f3359m ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f3358q) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f3362p = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2364b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2364b c2364b = (C2364b) parcelable;
        super.onRestoreInstanceState(c2364b.f8189j);
        setChecked(c2364b.f8280l);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2364b c2364b = new C2364b(super.onSaveInstanceState());
        c2364b.f8280l = this.f3359m;
        return c2364b;
    }

    public void setCheckable(boolean z7) {
        if (this.f3360n != z7) {
            this.f3360n = z7;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        if (!this.f3360n || this.f3359m == z7) {
            return;
        }
        this.f3359m = z7;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z7) {
        InterfaceC2363a interfaceC2363a;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z7);
        if (zIsFocusable == z7 || (interfaceC2363a = this.f3362p) == null) {
            return;
        }
        interfaceC2363a.mo996b();
    }

    public void setOnFocusableChangedListener(InterfaceC2363a interfaceC2363a) {
        this.f3362p = interfaceC2363a;
    }

    public void setPressable(boolean z7) {
        this.f3361o = z7;
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        if (this.f3361o) {
            super.setPressed(z7);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3359m);
    }
}
