package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0120b;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.R;
import com.google.android.material.button.MaterialButton;
import p005a4.C0073c;
import p017b6.C0600e0;
import p105m0.AbstractC1828m0;
import p211y5.C2819f;
import p216z2.C2917u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class C0755m<S> extends AbstractC0767y {

    /* renamed from: d0 */
    public int f3258d0;

    /* renamed from: e0 */
    public C0741b f3259e0;

    /* renamed from: f0 */
    public C0761s f3260f0;

    /* renamed from: g0 */
    public int f3261g0;

    /* renamed from: h0 */
    public C0073c f3262h0;

    /* renamed from: i0 */
    public RecyclerView f3263i0;

    /* renamed from: j0 */
    public RecyclerView f3264j0;

    /* renamed from: k0 */
    public View f3265k0;

    /* renamed from: l0 */
    public View f3266l0;

    /* renamed from: m0 */
    public View f3267m0;

    /* renamed from: n0 */
    public View f3268n0;

    /* renamed from: o0 */
    public MaterialButton f3269o0;

    /* renamed from: p0 */
    public AccessibilityManager f3270p0;

    /* renamed from: q0 */
    public C2917u f3271q0;

    /* renamed from: r0 */
    public boolean f3272r0;

    /* renamed from: I */
    public static boolean m1849I(C0755m c0755m, boolean z7) {
        C0761s c0761s;
        if (c0755m.f3272r0) {
            return false;
        }
        if (c0755m.f3264j0.getScrollState() != 0) {
            return true;
        }
        C0766x c0766x = (C0766x) c0755m.f3264j0.getAdapter();
        if (c0766x == null || (c0761s = c0755m.f3260f0) == null) {
            return false;
        }
        int iM1873h = c0766x.m1873h(c0761s) + (z7 ? 1 : -1);
        if (iM1873h < 0 || iM1873h >= c0766x.f3324d.f3234p) {
            return false;
        }
        c0766x.f3329i = z7 ? 2 : 1;
        c0755m.m1851J(c0766x.m1872g(iM1873h));
        return true;
    }

    @Override // com.google.android.material.datepicker.AbstractC0767y
    /* renamed from: H */
    public final void mo1850H(C2819f c2819f) {
        this.f3330c0.add(c2819f);
    }

    /* renamed from: J */
    public final void m1851J(C0761s c0761s) {
        C0766x c0766x = (C0766x) this.f3264j0.getAdapter();
        int iM1873h = c0766x.m1873h(c0761s);
        AccessibilityManager accessibilityManager = this.f3270p0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM1873h2 = iM1873h - c0766x.m1873h(this.f3260f0);
            boolean z7 = Math.abs(iM1873h2) > 3;
            boolean z8 = iM1873h2 > 0;
            this.f3260f0 = c0761s;
            if (z7 && z8) {
                this.f3264j0.m1182g0(iM1873h - 3);
                this.f3264j0.post(new RunnableC0748f(iM1873h, 0, this));
            } else if (z7) {
                this.f3264j0.m1182g0(iM1873h + 3);
                this.f3264j0.post(new RunnableC0748f(iM1873h, 0, this));
            } else {
                this.f3264j0.post(new RunnableC0748f(iM1873h, 0, this));
            }
        } else {
            this.f3260f0 = c0761s;
            this.f3264j0.m1182g0(iM1873h);
        }
        m1854M();
        m1855N(iM1873h);
    }

    /* renamed from: K */
    public final void m1852K(int i) {
        this.f3261g0 = i;
        if (i == 2) {
            this.f3263i0.getLayoutManager().mo1138p0(this.f3260f0.f3308l - ((C0746d0) this.f3263i0.getAdapter()).f3242d.f3259e0.f3228j.f3308l);
            this.f3267m0.setVisibility(0);
            this.f3268n0.setVisibility(8);
            this.f3265k0.setVisibility(8);
            this.f3266l0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f3267m0.setVisibility(8);
            this.f3268n0.setVisibility(0);
            this.f3265k0.setVisibility(0);
            this.f3266l0.setVisibility(0);
            m1851J(this.f3260f0);
        }
    }

    /* renamed from: L */
    public final void m1853L(View view) {
        if (view == null) {
            return;
        }
        int i = this.f3261g0;
        if (i == 2) {
            AbstractC1828m0.m3609n(view, m230k(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            AbstractC1828m0.m3609n(view, m230k(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* renamed from: M */
    public final void m1854M() {
        C0761s c0761s;
        C0766x c0766x = (C0766x) this.f3264j0.getAdapter();
        if (c0766x == null || this.f3272r0 || (c0761s = this.f3260f0) == null || c0761s.equals(c0766x.f3328h)) {
            return;
        }
        int iM1873h = c0766x.m1873h(c0766x.f3328h);
        c0766x.f3328h = c0761s;
        int iM1873h2 = c0766x.m1873h(c0761s);
        c0766x.m5085c(iM1873h);
        c0766x.m5085c(iM1873h2);
    }

    /* renamed from: N */
    public final void m1855N(int i) {
        View view = this.f3266l0;
        if (view != null) {
            view.setEnabled(i + 1 < this.f3264j0.getAdapter().mo1455a());
        }
        View view2 = this.f3265k0;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: t */
    public final void mo185t(Bundle bundle) {
        super.mo185t(bundle);
        if (bundle == null) {
            bundle = this.f241o;
        }
        this.f3258d0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3259e0 = (C0741b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3260f0 = (C0761s) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: u */
    public final View mo237u(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i;
        int i4;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m227h(), this.f3258d0);
        this.f3262h0 = new C0073c(contextThemeWrapper, 6);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f3270p0 = (AccessibilityManager) m217D().getSystemService("accessibility");
        C0761s c0761s = this.f3259e0.f3228j;
        boolean zM1860K = C0759q.m1860K(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.f3272r0 = zM1860K;
        if (zM1860K) {
            i = R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m217D().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i8 = C0762t.f3313d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i8 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i8) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        AbstractC1828m0.m3608m(gridView, new C0600e0(1));
        int i9 = this.f3259e0.f3232n;
        gridView.setAdapter((ListAdapter) (i9 > 0 ? new C0745d(i9) : new C0745d()));
        gridView.setNumColumns(c0761s.f3309m);
        gridView.setEnabled(false);
        this.f3264j0 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f3264j0.setLayoutManager(new C0749g(this, i4, i4));
        this.f3264j0.setTag("MONTHS_VIEW_GROUP_TAG");
        C0766x c0766x = new C0766x(contextThemeWrapper, this.f3259e0, new C0750h(this), new C0750h(this));
        this.f3264j0.setAdapter(c0766x);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f3263i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f3263i0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f3263i0.setAdapter(new C0746d0(this));
            RecyclerView recyclerView2 = this.f3263i0;
            C0751i c0751i = new C0751i();
            AbstractC0742b0.m1847c(null);
            AbstractC0742b0.m1847c(null);
            recyclerView2.m1185i(c0751i);
        }
        if (!this.f3272r0) {
            C2917u c2917u = new C2917u();
            this.f3271q0 = c2917u;
            c2917u.m5089a(this.f3264j0);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f3269o0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC1828m0.m3608m(this.f3269o0, new C0752j(0, this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.f3265k0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            AbstractC0120b.m400K(this.f3265k0, m230k(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.f3266l0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            AbstractC0120b.m400K(this.f3266l0, m230k(R.string.mtrl_picker_next_month_tooltip));
            this.f3267m0 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f3268n0 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m1852K(1);
            this.f3269o0.setText(this.f3260f0.m1864c());
            this.f3264j0.m1187j(new C0753k(this, c0766x));
            int i10 = 0;
            this.f3269o0.setOnClickListener(new ViewOnClickListenerC0754l(i10, this));
            this.f3266l0.setOnClickListener(new ViewOnClickListenerC0747e(this, c0766x, i10));
            this.f3265k0.setOnClickListener(new ViewOnClickListenerC0747e(this, c0766x, 1));
            m1855N(c0766x.m1873h(this.f3260f0));
        }
        this.f3264j0.m1182g0(c0766x.m1873h(this.f3260f0));
        AbstractC1828m0.m3608m(this.f3264j0, new C0600e0(2));
        m1853L(viewInflate);
        return viewInflate;
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: y */
    public final void mo189y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3258d0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3259e0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3260f0);
    }
}
