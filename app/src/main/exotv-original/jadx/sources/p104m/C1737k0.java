package p104m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.exotv.net.R;
import p017b6.C0625y;
import p095l.ViewTreeObserverOnGlobalLayoutListenerC1615d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.k0 */
/* loaded from: classes.dex */
public final class C1737k0 extends C1772t1 implements InterfaceC1745m0 {

    /* renamed from: L */
    public CharSequence f6607L;

    /* renamed from: M */
    public C1729i0 f6608M;

    /* renamed from: N */
    public final Rect f6609N;

    /* renamed from: O */
    public int f6610O;

    /* renamed from: P */
    public final /* synthetic */ C1749n0 f6611P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737k0(C1749n0 c1749n0, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f6611P = c1749n0;
        this.f6609N = new Rect();
        this.f6775x = c1749n0;
        this.f6759H = true;
        this.f6760I.setFocusable(true);
        this.f6776y = new C0625y(1, this);
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: e */
    public final CharSequence mo3403e() {
        return this.f6607L;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: i */
    public final void mo3405i(CharSequence charSequence) {
        this.f6607L = charSequence;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: l */
    public final void mo3408l(int i) {
        this.f6610O = i;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: m */
    public final void mo3409m(int i, int i4) {
        ViewTreeObserver viewTreeObserver;
        C1697a0 c1697a0 = this.f6760I;
        boolean zIsShowing = c1697a0.isShowing();
        m3418s();
        c1697a0.setInputMethodMode(2);
        mo3275f();
        C1730i1 c1730i1 = this.f6763l;
        c1730i1.setChoiceMode(1);
        c1730i1.setTextDirection(i);
        c1730i1.setTextAlignment(i4);
        C1749n0 c1749n0 = this.f6611P;
        int selectedItemPosition = c1749n0.getSelectedItemPosition();
        C1730i1 c1730i12 = this.f6763l;
        if (c1697a0.isShowing() && c1730i12 != null) {
            c1730i12.setListSelectionHidden(false);
            c1730i12.setSelection(selectedItemPosition);
            if (c1730i12.getChoiceMode() != 0) {
                c1730i12.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1749n0.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1615d viewTreeObserverOnGlobalLayoutListenerC1615d = new ViewTreeObserverOnGlobalLayoutListenerC1615d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1615d);
        c1697a0.setOnDismissListener(new C1733j0(this, viewTreeObserverOnGlobalLayoutListenerC1615d));
    }

    @Override // p104m.C1772t1, p104m.InterfaceC1745m0
    /* renamed from: p */
    public final void mo3411p(ListAdapter listAdapter) {
        super.mo3411p(listAdapter);
        this.f6608M = (C1729i0) listAdapter;
    }

    /* renamed from: s */
    public final void m3418s() {
        int i;
        C1749n0 c1749n0 = this.f6611P;
        Rect rect = c1749n0.f6657q;
        C1697a0 c1697a0 = this.f6760I;
        Drawable background = c1697a0.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z7 = AbstractC1763q2.f6715a;
            i = c1749n0.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c1749n0.getPaddingLeft();
        int paddingRight = c1749n0.getPaddingRight();
        int width = c1749n0.getWidth();
        int i4 = c1749n0.f6656p;
        if (i4 == -2) {
            int iM3423a = c1749n0.m3423a(this.f6608M, c1697a0.getBackground());
            int i8 = (c1749n0.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM3423a > i8) {
                iM3423a = i8;
            }
            m3465r(Math.max(iM3423a, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            m3465r((width - paddingLeft) - paddingRight);
        } else {
            m3465r(i4);
        }
        boolean z8 = AbstractC1763q2.f6715a;
        this.f6766o = c1749n0.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f6765n) - this.f6610O) + i : paddingLeft + this.f6610O + i;
    }
}
