package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p054g.AbstractC1026a;
import p095l.AbstractC1613c;
import p095l.C1611b;
import p095l.C1630p;
import p095l.InterfaceC1610a0;
import p095l.InterfaceC1626l;
import p095l.MenuC1627m;
import p104m.C1780w0;
import p104m.InterfaceC1740l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends C1780w0 implements InterfaceC1610a0, View.OnClickListener, InterfaceC1740l {

    /* renamed from: A */
    public int f610A;

    /* renamed from: B */
    public final int f611B;

    /* renamed from: r */
    public C1630p f612r;

    /* renamed from: s */
    public CharSequence f613s;

    /* renamed from: t */
    public Drawable f614t;

    /* renamed from: u */
    public InterfaceC1626l f615u;

    /* renamed from: v */
    public C1611b f616v;

    /* renamed from: w */
    public AbstractC1613c f617w;

    /* renamed from: x */
    public boolean f618x;

    /* renamed from: y */
    public boolean f619y;

    /* renamed from: z */
    public final int f620z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f618x = m439h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4310c, 0, 0);
        this.f620z = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f611B = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f610A = -1;
        setSaveEnabled(false);
    }

    @Override // p104m.InterfaceC1740l
    /* renamed from: a */
    public final boolean mo436a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p095l.InterfaceC1610a0
    /* renamed from: b */
    public final void mo437b(C1630p c1630p) {
        this.f612r = c1630p;
        setIcon(c1630p.getIcon());
        setTitle(c1630p.getTitleCondensed());
        setId(c1630p.f6242j);
        setVisibility(c1630p.isVisible() ? 0 : 8);
        setEnabled(c1630p.isEnabled());
        if (c1630p.hasSubMenu() && this.f616v == null) {
            this.f616v = new C1611b(this);
        }
    }

    @Override // p104m.InterfaceC1740l
    /* renamed from: c */
    public final boolean mo438c() {
        return !TextUtils.isEmpty(getText()) && this.f612r.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p095l.InterfaceC1610a0
    public C1630p getItemData() {
        return this.f612r;
    }

    /* renamed from: h */
    public final boolean m439h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* renamed from: i */
    public final void m440i() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f613s);
        if (this.f614t != null && ((this.f612r.f6237H & 4) != 4 || (!this.f618x && !this.f619y))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f613s : null);
        CharSequence charSequence = this.f612r.f6258z;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z9 ? null : this.f612r.f6246n);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f612r.f6230A;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0120b.m400K(this, z9 ? null : this.f612r.f6246n);
        } else {
            AbstractC0120b.m400K(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1626l interfaceC1626l = this.f615u;
        if (interfaceC1626l != null) {
            interfaceC1626l.mo441a(this.f612r);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f618x = m439h();
        m440i();
    }

    @Override // p104m.C1780w0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i8;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i8 = this.f610A) >= 0) {
            super.setPadding(i8, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i9 = this.f620z;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i9) : i9;
        if (mode != 1073741824 && i9 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i4);
        }
        if (!zIsEmpty || this.f614t == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f614t.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1611b c1611b;
        if (this.f612r.hasSubMenu() && (c1611b = this.f616v) != null && c1611b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f619y != z7) {
            this.f619y = z7;
            C1630p c1630p = this.f612r;
            if (c1630p != null) {
                MenuC1627m menuC1627m = c1630p.f6255w;
                menuC1627m.f6219t = true;
                menuC1627m.m3313p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f614t = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f611B;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m440i();
    }

    public void setItemInvoker(InterfaceC1626l interfaceC1626l) {
        this.f615u = interfaceC1626l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i4, int i8, int i9) {
        this.f610A = i;
        super.setPadding(i, i4, i8, i9);
    }

    public void setPopupCallback(AbstractC1613c abstractC1613c) {
        this.f617w = abstractC1613c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f613s = charSequence;
        m440i();
    }
}
