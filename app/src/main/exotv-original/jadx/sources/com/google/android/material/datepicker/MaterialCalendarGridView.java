package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import p002a1.C0036o;
import p005a4.C0073c;
import p017b6.C0600e0;
import p105m0.AbstractC1828m0;
import p171t5.AbstractC2436a;
import p211y5.C2828o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: j */
    public final boolean f3224j;

    /* renamed from: k */
    public C0750h f3225k;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0742b0.m1847c(null);
        if (C0759q.m1860K(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.exotv.net.R.id.cancel_button);
            setNextFocusRightId(com.exotv.net.R.id.confirm_button);
        }
        this.f3224j = C0759q.m1860K(getContext(), com.exotv.net.R.attr.nestedScrollable);
        AbstractC1828m0.m3608m(this, new C0600e0(3));
    }

    /* renamed from: a */
    public static void m1841a(MaterialCalendarGridView materialCalendarGridView) {
        C0762t c0762t = (C0762t) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f3339y;
        if (AbstractC2436a.m4341p(context.getTheme(), com.exotv.net.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            C0073c c0073c = c0762t.f3316b;
            if (c0073c != null) {
                focusRingDrawable.f3355x.f8124t = (C2828o) ((C0036o) c0073c.f324k).f143k;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    /* renamed from: b */
    public final C0762t m1842b() {
        return (C0762t) super.getAdapter();
    }

    /* renamed from: c */
    public final boolean m1843c(int i, boolean z7) {
        C0750h c0750h;
        C0750h c0750h2;
        int iM1866a = z7 ? ((C0762t) super.getAdapter()).m1866a(i) : ((C0762t) super.getAdapter()).m1867b(i);
        if (iM1866a != -1) {
            setSelection(iM1866a);
            return true;
        }
        if (!z7 && (c0750h2 = this.f3225k) != null) {
            return C0755m.m1849I(c0750h2.f3251a, false);
        }
        if (!z7 || (c0750h = this.f3225k) == null) {
            return true;
        }
        return C0755m.m1849I(c0750h.f3251a, true);
    }

    /* renamed from: d */
    public final boolean m1844d(int i) {
        C0762t c0762t = (C0762t) super.getAdapter();
        if (!c0762t.m1870e(i)) {
            long itemId = c0762t.getItemId(i);
            for (int i4 = 1; i4 < c0762t.f3315a.f3309m; i4++) {
                int i8 = i + i4;
                if ((i8 < C0762t.f3314e && c0762t.getItemId(i8) == itemId && c0762t.m1870e(i8)) || ((i8 = i - i4) >= 0 && c0762t.getItemId(i8) == itemId && c0762t.m1870e(i8))) {
                    i = i8;
                    break;
                }
            }
            i = -1;
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0762t) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0762t) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.n
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.m1841a(this.f3273j);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0762t c0762t = (C0762t) super.getAdapter();
        c0762t.getClass();
        int iMax = Math.max(c0762t.m1868c(), getFirstVisiblePosition());
        int iMin = Math.min(c0762t.m1871f(), getLastVisiblePosition());
        c0762t.getItem(iMax);
        c0762t.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z7, int i, Rect rect) {
        int iM1867b;
        if (!z7) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            C0762t c0762t = (C0762t) super.getAdapter();
            iM1867b = c0762t.m1867b(c0762t.m1871f() + 1);
        } else if (i == 130 || i == 2) {
            C0762t c0762t2 = (C0762t) super.getAdapter();
            iM1867b = c0762t2.m1866a(c0762t2.m1868c() - 1);
        } else {
            iM1867b = -1;
        }
        if (iM1867b != -1) {
            setSelection(iM1867b);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z7 = getLayoutDirection() == 1;
        if (i == 21) {
            return m1843c(selectedItemPosition, z7);
        }
        if (i == 22) {
            return m1843c(selectedItemPosition, !z7);
        }
        if (i == 61) {
            int iM1867b = keyEvent.isShiftPressed() ? ((C0762t) super.getAdapter()).m1867b(selectedItemPosition) : ((C0762t) super.getAdapter()).m1866a(selectedItemPosition);
            if (iM1867b == -1) {
                return false;
            }
            setSelection(iM1867b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        C0762t c0762t = (C0762t) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || c0762t.m1870e(selectedItemPosition2)) {
            return true;
        }
        C0762t c0762t2 = (C0762t) super.getAdapter();
        if (!m1844d(selectedItemPosition2)) {
            if (19 == i) {
                int numColumns = getNumColumns();
                while (true) {
                    selectedItemPosition2 -= numColumns;
                    if (selectedItemPosition2 < c0762t2.m1868c()) {
                        break;
                    }
                    if (m1844d(selectedItemPosition2)) {
                        break;
                    }
                    numColumns = getNumColumns();
                }
                return false;
            }
            if (i == 20) {
                int numColumns2 = getNumColumns();
                while (true) {
                    numColumns2 += selectedItemPosition2;
                    if (numColumns2 > c0762t2.m1871f()) {
                        break;
                    }
                    if (m1844d(numColumns2)) {
                        break;
                    }
                    selectedItemPosition2 = getNumColumns();
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i4) {
        if (!this.f3224j) {
            super.onMeasure(i, i4);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((C0762t) super.getAdapter()).m1866a(r0.m1868c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0762t) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0762t)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0762t.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
