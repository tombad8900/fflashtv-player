package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0120b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.common.AbstractC0195e;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p002a1.AbstractComponentCallbacksC0050v;
import p002a1.DialogInterfaceOnCancelListenerC0040q;
import p034d5.AbstractC0847a;
import p037e0.AbstractC0850a;
import p095l.C1629o;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p105m0.C1847s1;
import p105m0.C1850t1;
import p105m0.C1853u1;
import p105m0.C1859w1;
import p125o5.ViewOnTouchListenerC2048a;
import p171t5.AbstractC2436a;
import p211y5.C2819f;
import p211y5.C2823j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public class C0759q<S> extends DialogInterfaceOnCancelListenerC0040q {

    /* renamed from: A0 */
    public CharSequence f3280A0;

    /* renamed from: B0 */
    public int f3281B0;

    /* renamed from: C0 */
    public CharSequence f3282C0;

    /* renamed from: D0 */
    public int f3283D0;

    /* renamed from: E0 */
    public CharSequence f3284E0;

    /* renamed from: F0 */
    public int f3285F0;

    /* renamed from: G0 */
    public CharSequence f3286G0;

    /* renamed from: H0 */
    public TextView f3287H0;

    /* renamed from: I0 */
    public CheckableImageButton f3288I0;

    /* renamed from: J0 */
    public C2823j f3289J0;

    /* renamed from: K0 */
    public boolean f3290K0;

    /* renamed from: L0 */
    public CharSequence f3291L0;

    /* renamed from: M0 */
    public CharSequence f3292M0;

    /* renamed from: p0 */
    public final LinkedHashSet f3293p0;

    /* renamed from: q0 */
    public final LinkedHashSet f3294q0;

    /* renamed from: r0 */
    public int f3295r0;

    /* renamed from: s0 */
    public AbstractC0767y f3296s0;

    /* renamed from: t0 */
    public C0741b f3297t0;

    /* renamed from: u0 */
    public C0755m f3298u0;

    /* renamed from: v0 */
    public int f3299v0;

    /* renamed from: w0 */
    public CharSequence f3300w0;

    /* renamed from: x0 */
    public boolean f3301x0;

    /* renamed from: y0 */
    public int f3302y0;

    /* renamed from: z0 */
    public int f3303z0;

    public C0759q() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3293p0 = new LinkedHashSet();
        this.f3294q0 = new LinkedHashSet();
    }

    /* renamed from: J */
    public static int m1859J(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM1846b = AbstractC0742b0.m1846b();
        calendarM1846b.set(5, 1);
        Calendar calendarM1845a = AbstractC0742b0.m1845a(calendarM1846b);
        calendarM1845a.get(2);
        calendarM1845a.get(1);
        int maximum = calendarM1845a.getMaximum(7);
        calendarM1845a.getActualMaximum(5);
        calendarM1845a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: K */
    public static boolean m1860K(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2436a.m4344s(context, R.attr.materialCalendarStyle, C0755m.class.getCanonicalName()).data, new int[]{i});
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z7;
    }

    @Override // p002a1.DialogInterfaceOnCancelListenerC0040q, p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: A */
    public final void mo178A() {
        this.f3296s0.f3330c0.clear();
        super.mo178A();
    }

    @Override // p002a1.DialogInterfaceOnCancelListenerC0040q
    /* renamed from: H */
    public final Dialog mo181H() {
        Context contextM217D = m217D();
        m217D();
        int i = this.f3295r0;
        if (i == 0) {
            m1861I();
            throw null;
        }
        Dialog dialog = new Dialog(contextM217D, i);
        Context context = dialog.getContext();
        this.f3301x0 = m1860K(context, android.R.attr.windowFullscreen);
        this.f3289J0 = new C2823j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0847a.f3753o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3289J0.m4941m(context);
        this.f3289J0.m4945q(ColorStateList.valueOf(color));
        this.f3289J0.m4944p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    /* renamed from: I */
    public final void m1861I() {
        if (this.f241o.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // p002a1.DialogInterfaceOnCancelListenerC0040q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3293p0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p002a1.DialogInterfaceOnCancelListenerC0040q, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3294q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f222N;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p002a1.DialogInterfaceOnCancelListenerC0040q, p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: t */
    public final void mo185t(Bundle bundle) throws Resources.NotFoundException {
        super.mo185t(bundle);
        if (bundle == null) {
            bundle = this.f241o;
        }
        this.f3295r0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3297t0 = (C0741b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3299v0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3300w0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3302y0 = bundle.getInt("INPUT_MODE_KEY");
        this.f3303z0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3280A0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f3281B0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3282C0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f3283D0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3284E0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f3285F0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3286G0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f3300w0;
        if (text == null) {
            text = m217D().getResources().getText(this.f3299v0);
        }
        this.f3291L0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f3292M0 = text;
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: u */
    public final View mo237u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f3301x0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f3301x0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m1859J(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m1859J(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f3288I0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f3287H0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f3288I0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f3288I0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0715d.m1542D(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0715d.m1542D(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f3288I0.setChecked(this.f3302y0 != 0);
        AbstractC1828m0.m3608m(this.f3288I0, null);
        CheckableImageButton checkableImageButton2 = this.f3288I0;
        this.f3288I0.setContentDescription(this.f3302y0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.f3288I0;
        AbstractC0120b.m400K(this.f3288I0, this.f3302y0 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.f3288I0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3274j.m1861I();
                throw null;
            }
        });
        m1861I();
        throw null;
    }

    @Override // p002a1.DialogInterfaceOnCancelListenerC0040q, p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: y */
    public final void mo189y(Bundle bundle) {
        super.mo189y(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3295r0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0741b c0741b = this.f3297t0;
        C0739a c0739a = new C0739a();
        int i = C0739a.f3226b;
        int i4 = C0739a.f3226b;
        long j = c0741b.f3228j.f3311o;
        long j8 = c0741b.f3229k.f3311o;
        c0739a.f3227a = Long.valueOf(c0741b.f3231m.f3311o);
        int i8 = c0741b.f3232n;
        C0743c c0743c = c0741b.f3230l;
        C0755m c0755m = this.f3298u0;
        C0761s c0761s = c0755m == null ? null : c0755m.f3260f0;
        if (c0761s != null) {
            c0739a.f3227a = Long.valueOf(c0761s.f3311o);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0743c);
        C0761s c0761sM1863b = C0761s.m1863b(j);
        C0761s c0761sM1863b2 = C0761s.m1863b(j8);
        C0743c c0743c2 = (C0743c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l8 = c0739a.f3227a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0741b(c0761sM1863b, c0761sM1863b2, c0743c2, l8 == null ? null : C0761s.m1863b(l8.longValue()), i8));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3299v0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3300w0);
        bundle.putInt("INPUT_MODE_KEY", this.f3302y0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f3303z0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f3280A0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3281B0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3282C0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f3283D0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f3284E0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3285F0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3286G0);
    }

    @Override // p002a1.DialogInterfaceOnCancelListenerC0040q, p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: z */
    public final void mo190z() throws Resources.NotFoundException {
        AbstractC0767y abstractC0767y;
        super.mo190z();
        Dialog dialog = this.f164l0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f3301x0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f3289J0);
            if (!this.f3290K0) {
                View viewFindViewById = m218E().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM612b = AbstractC0195e.m612b(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM612b != null ? Integer.valueOf(colorStateListM612b.getDefaultColor()) : null;
                boolean z7 = false;
                boolean z8 = numValueOf == null || numValueOf.intValue() == 0;
                int iM1496I = AbstractC0714c.m1496I(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z8) {
                    numValueOf = Integer.valueOf(iM1496I);
                }
                AbstractC0120b.m396G(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int iM2019d = i < 27 ? AbstractC0850a.m2019d(AbstractC0714c.m1496I(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(iM2019d);
                }
                boolean z9 = AbstractC0714c.m1501N(0) || AbstractC0714c.m1501N(numValueOf.intValue());
                C1629o c1629o = new C1629o(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                (i4 >= 35 ? new C1859w1(window, c1629o) : i4 >= 30 ? new C1853u1(window, c1629o) : i4 >= 26 ? new C1850t1(window, c1629o) : new C1847s1(window, c1629o)).mo1594i0(z9);
                boolean zM1501N = AbstractC0714c.m1501N(iM1496I);
                if (AbstractC0714c.m1501N(iM2019d) || (iM2019d == 0 && zM1501N)) {
                    z7 = true;
                }
                C1629o c1629o2 = new C1629o(window.getDecorView());
                int i8 = Build.VERSION.SDK_INT;
                (i8 >= 35 ? new C1859w1(window, c1629o2) : i8 >= 30 ? new C1853u1(window, c1629o2) : i8 >= 26 ? new C1850t1(window, c1629o2) : new C1847s1(window, c1629o2)).mo1592h0(z7);
                C0758p c0758p = new C0758p(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                AbstractC1804e0.m3538j(viewFindViewById, c0758p);
                this.f3290K0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m217D().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f3289J0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f164l0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC2048a(dialog2, rect));
        }
        m217D();
        int i9 = this.f3295r0;
        if (i9 == 0) {
            m1861I();
            throw null;
        }
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM112B = m226g().m112B(this.f3302y0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        AbstractC0767y abstractC0767y2 = abstractComponentCallbacksC0050vM112B instanceof AbstractC0767y ? (AbstractC0767y) abstractComponentCallbacksC0050vM112B : null;
        if (abstractC0767y2 == null) {
            if (this.f3302y0 == 1) {
                m1861I();
                C0741b c0741b = this.f3297t0;
                C0760r c0760r = new C0760r();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i9);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0741b);
                c0760r.m220G(bundle);
                abstractC0767y = c0760r;
            } else {
                m1861I();
                C0741b c0741b2 = this.f3297t0;
                C0755m c0755m = new C0755m();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i9);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0741b2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", c0741b2.f3231m);
                c0755m.m220G(bundle2);
                this.f3298u0 = c0755m;
                abstractC0767y = c0755m;
            }
            abstractC0767y2 = abstractC0767y;
        }
        this.f3296s0 = abstractC0767y2;
        abstractC0767y2.mo1850H(new C2819f(16));
        this.f3287H0.setText((this.f3302y0 == 1 && m217D().getResources().getConfiguration().orientation == 2) ? this.f3292M0 : this.f3291L0);
        m1861I();
        throw null;
    }
}
