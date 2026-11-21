package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p062h.C1091q;
import p062h.LayoutInflaterFactory2C1098x;
import p095l.MenuC1627m;
import p104m.C1720g;
import p104m.C1736k;
import p104m.C1743l2;
import p104m.InterfaceC1702b1;
import p104m.InterfaceC1706c1;
import p105m0.C1843r0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: j */
    public TypedValue f725j;

    /* renamed from: k */
    public TypedValue f726k;

    /* renamed from: l */
    public TypedValue f727l;

    /* renamed from: m */
    public TypedValue f728m;

    /* renamed from: n */
    public TypedValue f729n;

    /* renamed from: o */
    public TypedValue f730o;

    /* renamed from: p */
    public final Rect f731p;

    /* renamed from: q */
    public InterfaceC1702b1 f732q;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f731p = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f729n == null) {
            this.f729n = new TypedValue();
        }
        return this.f729n;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f730o == null) {
            this.f730o = new TypedValue();
        }
        return this.f730o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f727l == null) {
            this.f727l = new TypedValue();
        }
        return this.f727l;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f728m == null) {
            this.f728m = new TypedValue();
        }
        return this.f728m;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f725j == null) {
            this.f725j = new TypedValue();
        }
        return this.f725j;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f726k == null) {
            this.f726k = new TypedValue();
        }
        return this.f726k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1702b1 interfaceC1702b1 = this.f732q;
        if (interfaceC1702b1 != null) {
            interfaceC1702b1.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1736k c1736k;
        super.onDetachedFromWindow();
        InterfaceC1702b1 interfaceC1702b1 = this.f732q;
        if (interfaceC1702b1 != null) {
            LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = ((C1091q) interfaceC1702b1).f4624k;
            InterfaceC1706c1 interfaceC1706c1 = layoutInflaterFactory2C1098x.f4657A;
            if (interfaceC1706c1 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1706c1;
                actionBarOverlayLayout.m464j();
                ActionMenuView actionMenuView = ((C1743l2) actionBarOverlayLayout.f697n).f6626a.f762j;
                if (actionMenuView != null && (c1736k = actionMenuView.f712C) != null) {
                    c1736k.m3415f();
                    C1720g c1720g = c1736k.f6586C;
                    if (c1720g != null && c1720g.m3339b()) {
                        c1720g.f6279j.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C1098x.f4662F != null) {
                layoutInflaterFactory2C1098x.f4700u.getDecorView().removeCallbacks(layoutInflaterFactory2C1098x.f4663G);
                if (layoutInflaterFactory2C1098x.f4662F.isShowing()) {
                    try {
                        layoutInflaterFactory2C1098x.f4662F.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1098x.f4662F = null;
            }
            C1843r0 c1843r0 = layoutInflaterFactory2C1098x.f4664H;
            if (c1843r0 != null) {
                c1843r0.m3616b();
            }
            MenuC1627m menuC1627m = layoutInflaterFactory2C1098x.m2341y(0).f4645h;
            if (menuC1627m != null) {
                menuC1627m.m3308c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int iMakeMeasureSpec;
        boolean z7;
        int iMakeMeasureSpec2;
        int i8;
        int i9;
        float fraction;
        int i10;
        int i11;
        float fraction2;
        int i12;
        int i13;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z8 = true;
        boolean z9 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f731p;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z7 = false;
        } else {
            TypedValue typedValue = z9 ? this.f728m : this.f727l;
            if (typedValue != null && (i12 = typedValue.type) != 0) {
                if (i12 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i12 == 6) {
                    int i14 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i14, i14);
                } else {
                    i13 = 0;
                    if (i13 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z7 = true;
                    }
                }
                i13 = (int) fraction3;
                if (i13 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i4;
        } else {
            TypedValue typedValue2 = z9 ? this.f729n : this.f730o;
            if (typedValue2 != null && (i10 = typedValue2.type) != 0) {
                if (i10 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i10 == 6) {
                    int i15 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i15, i15);
                } else {
                    i11 = 0;
                    if (i11 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                    }
                }
                i11 = (int) fraction2;
                if (i11 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z7 || mode != Integer.MIN_VALUE) {
            z8 = false;
        } else {
            TypedValue typedValue3 = z9 ? this.f726k : this.f725j;
            if (typedValue3 != null && (i8 = typedValue3.type) != 0) {
                if (i8 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i8 == 6) {
                    int i16 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i16, i16);
                } else {
                    i9 = 0;
                    if (i9 > 0) {
                        i9 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i9) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    }
                }
                i9 = (int) fraction;
                if (i9 > 0) {
                }
                if (measuredWidth >= i9) {
                }
            }
        }
        if (z8) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC1702b1 interfaceC1702b1) {
        this.f732q = interfaceC1702b1;
    }
}
