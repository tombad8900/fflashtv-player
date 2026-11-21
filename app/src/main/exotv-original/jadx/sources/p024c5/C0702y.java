package p024c5;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0127c0;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import java.util.ArrayList;
import p111m6.AbstractC1914i;
import p195w4.C2658e;
import p195w4.C2663g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.y */
/* loaded from: classes.dex */
public final class C0702y {

    /* renamed from: a */
    public final C2658e f2736a;

    /* renamed from: b */
    public final C2663g f2737b;

    /* renamed from: c */
    public final TextView f2738c;

    /* renamed from: d */
    public final LinearLayout f2739d;

    /* renamed from: e */
    public final MainActivity f2740e;

    /* renamed from: f */
    public final ArrayList f2741f = new ArrayList();

    /* renamed from: g */
    public final boolean f2742g;

    /* renamed from: h */
    public final int f2743h;

    /* renamed from: i */
    public boolean f2744i;

    /* renamed from: j */
    public final int f2745j;

    /* renamed from: k */
    public final float f2746k;

    /* renamed from: l */
    public LinearLayout f2747l;

    /* renamed from: m */
    public final int f2748m;

    /* renamed from: n */
    public final LinearLayout f2749n;

    public C0702y(MainActivity mainActivity, C2658e c2658e, C2663g c2663g) throws Resources.NotFoundException {
        int i;
        float f8;
        LinearLayout.LayoutParams layoutParams;
        char c8;
        int i4;
        this.f2736a = c2658e;
        this.f2737b = c2663g;
        this.f2740e = mainActivity;
        boolean z7 = mainActivity.getResources().getBoolean(R.bool.is_large_screen);
        this.f2742g = z7;
        this.f2743h = Color.parseColor("#861337");
        this.f2744i = !z7;
        this.f2745j = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_label_indent);
        this.f2746k = mainActivity.getResources().getDimension(R.dimen.nav_icon_lift);
        this.f2748m = -2;
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(z7 ? 1 : 0);
        linearLayout.setGravity(z7 ? 48 : 17);
        linearLayout.setBackgroundColor(AbstractC0704z.f2752b);
        int dimensionPixelSize = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_horizontal_padding);
        int dimensionPixelSize2 = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_vertical_padding);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        if (z7) {
            linearLayout.setFocusable(false);
            linearLayout.setDescendantFocusability(262144);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
        }
        this.f2749n = linearLayout;
        int dimensionPixelSize3 = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_icon_size);
        float dimension = mainActivity.getResources().getDimension(R.dimen.nav_label_text_size);
        int dimensionPixelSize4 = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_item_padding_h);
        int dimensionPixelSize5 = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_item_padding_v);
        int dimensionPixelSize6 = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_item_gap);
        if (z7) {
            i = 2;
            int dimensionPixelSize7 = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_logo_size);
            TextView textView = new TextView(mainActivity);
            textView.setText(mainActivity.getString(R.string.app_name));
            textView.setTextSize(0, mainActivity.getResources().getDimension(R.dimen.nav_logo_text));
            textView.setTextColor(-1);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.getPaint().setFakeBoldText(true);
            textView.setIncludeFontPadding(false);
            this.f2738c = textView;
            LinearLayout linearLayout2 = new LinearLayout(mainActivity);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            int i8 = dimensionPixelSize4 - ((dimensionPixelSize7 - dimensionPixelSize3) / 2);
            linearLayout2.setPadding(i8 < 0 ? 0 : i8, 0, 0, 0);
            ImageView imageView = new ImageView(mainActivity);
            imageView.setImageResource(R.drawable.exo_logo);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setContentDescription(mainActivity.getString(R.string.app_name));
            linearLayout2.addView(imageView, new LinearLayout.LayoutParams(dimensionPixelSize7, dimensionPixelSize7));
            if (this.f2744i) {
                i4 = -2;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart(mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_logo_mark_gap));
                linearLayout2.addView(textView, layoutParams2);
            } else {
                i4 = -2;
            }
            this.f2739d = linearLayout2;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i4);
            int dimensionPixelSize8 = (mainActivity.getResources().getDimensionPixelSize(R.dimen.category_margin_v) + mainActivity.getResources().getDimensionPixelSize(R.dimen.rail_padding_v)) - mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_vertical_padding);
            layoutParams3.topMargin = dimensionPixelSize8 < 0 ? 0 : dimensionPixelSize8;
            layoutParams3.bottomMargin = mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_logo_margin_bottom);
            linearLayout.addView(linearLayout2, layoutParams3);
        } else {
            i = 2;
        }
        LinearLayout linearLayout3 = linearLayout;
        if (z7) {
            LinearLayout linearLayout4 = new LinearLayout(mainActivity);
            linearLayout4.setOrientation(1);
            linearLayout4.setGravity(16);
            linearLayout4.setClipChildren(false);
            linearLayout4.setClipToPadding(false);
            linearLayout.addView(linearLayout4, new LinearLayout.LayoutParams(-2, 0, 1.0f));
            linearLayout3 = linearLayout4;
        }
        EnumC0698w[] enumC0698wArrValues = EnumC0698w.values();
        int length = enumC0698wArrValues.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            EnumC0698w enumC0698w = enumC0698wArrValues[i9];
            int i11 = i10 + 1;
            ImageView imageView2 = new ImageView(mainActivity);
            int i12 = enumC0698w.f2721k;
            EnumC0698w[] enumC0698wArr = enumC0698wArrValues;
            float f9 = enumC0698w.f2722l;
            imageView2.setImageResource(i12);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int i13 = AbstractC0704z.f2754d;
            imageView2.setColorFilter(i13);
            int i14 = length;
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize3));
            imageView2.setScaleX(f9);
            imageView2.setScaleY(f9);
            TextView textView2 = new TextView(mainActivity);
            textView2.setText(mainActivity.getString(enumC0698w.f2720j));
            float f10 = this.f2742g ? 17.0f : dimension / (this.f2740e.getResources().getConfiguration().fontScale * this.f2740e.getResources().getDisplayMetrics().density);
            int i15 = i9;
            textView2.setTextSize(i, f10);
            textView2.setGravity(16);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            int i16 = dimensionPixelSize3;
            textView2.getPaint().setFakeBoldText(true);
            textView2.setIncludeFontPadding(false);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            if (this.f2742g || Build.VERSION.SDK_INT < 26) {
                f8 = dimension;
            } else {
                int i17 = (int) f10;
                f8 = dimension;
                textView2.setAutoSizeTextTypeUniformWithConfiguration(10, i17 < 11 ? 11 : i17, 1, 2);
            }
            textView2.setTextColor(i13);
            textView2.setVisibility(this.f2744i ? 0 : 8);
            Paint.FontMetrics fontMetrics = textView2.getPaint().getFontMetrics();
            textView2.getPaint().getTextBounds(textView2.getText().toString(), 0, textView2.getText().length(), new Rect());
            imageView2.setTranslationY((((r6.top + r6.bottom) / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f)) - this.f2746k);
            LinearLayout linearLayout5 = new LinearLayout(mainActivity);
            linearLayout5.setOrientation(0);
            linearLayout5.setId(View.generateViewId());
            linearLayout5.setGravity(this.f2742g ? 16 : 17);
            linearLayout5.setPadding(dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize5);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(10);
            gradientDrawable.setColor(0);
            linearLayout5.setBackground(gradientDrawable);
            linearLayout5.setClickable(true);
            linearLayout5.setFocusable(true);
            if (this.f2742g) {
                linearLayout5.setFocusableInTouchMode(true);
                linearLayout5.setClipChildren(false);
                linearLayout5.setClipToPadding(false);
            }
            linearLayout5.setOnClickListener(new ViewOnClickListenerC0684p(this, 1, enumC0698w));
            linearLayout5.addView(imageView2);
            linearLayout5.addView(textView2);
            if (this.f2742g) {
                linearLayout5.setOnTouchListener(new ViewOnTouchListenerC0694u());
            }
            final C0700x c0700x = new C0700x(linearLayout5, imageView2, textView2);
            this.f2741f.add(c0700x);
            linearLayout5.setOnKeyListener(new ViewOnKeyListenerC0676l(1, this));
            linearLayout5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c5.v
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z8) {
                    boolean z9;
                    C0700x c0700x2 = c0700x;
                    LinearLayout linearLayout6 = c0700x2.f2728a;
                    C0702y c0702y = this.f2710a;
                    if (c0702y.f2742g) {
                        if (z8) {
                            c0702y.f2747l = linearLayout6;
                        }
                        if (z8) {
                            z9 = true;
                            break;
                        }
                        ArrayList arrayList = c0702y.f2741f;
                        z9 = false;
                        if (arrayList == null || !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj = arrayList.get(i18);
                                i18++;
                                if (((C0700x) obj).f2728a.hasFocus()) {
                                    z9 = true;
                                    break;
                                }
                            }
                        }
                        c0702y.f2744i = z9;
                        c0702y.m1475f();
                        c0702y.m1472c(c0700x2, linearLayout6.isSelected());
                    }
                }
            });
            if (this.f2742g) {
                int i18 = this.f2748m;
                layoutParams = new LinearLayout.LayoutParams(i18, i18);
                if (i10 > 0) {
                    layoutParams.topMargin = dimensionPixelSize6;
                }
                c8 = 0;
            } else {
                c8 = 0;
                layoutParams = new LinearLayout.LayoutParams(0, this.f2748m, 1.0f);
                if (i10 > 0) {
                    layoutParams.leftMargin = dimensionPixelSize6;
                }
                int dimensionPixelSize9 = this.f2740e.getResources().getDimensionPixelSize(R.dimen.nav_edge_margin);
                if (i10 == 0) {
                    layoutParams.leftMargin = dimensionPixelSize9;
                }
                if (i10 == AbstractC1914i.m3752s0(EnumC0698w.f2719r)) {
                    layoutParams.rightMargin = dimensionPixelSize9;
                }
            }
            linearLayout3.addView(linearLayout5, layoutParams);
            dimension = f8;
            length = i14;
            dimensionPixelSize3 = i16;
            i10 = i11;
            i = 2;
            i9 = i15 + 1;
            enumC0698wArrValues = enumC0698wArr;
        }
    }

    /* renamed from: a */
    public final void m1470a() {
        Object obj;
        if (this.f2742g) {
            ArrayList arrayList = this.f2741f;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((C0700x) obj).f2728a.isSelected()) {
                    break;
                }
            }
            C0700x c0700x = (C0700x) obj;
            if (c0700x != null) {
                LinearLayout linearLayout = c0700x.f2728a;
                linearLayout.post(new RunnableC0127c0(13, linearLayout));
            }
        }
    }

    /* renamed from: b */
    public final int m1471b() {
        Object obj;
        ArrayList arrayList = this.f2741f;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((C0700x) obj).f2728a.isSelected()) {
                break;
            }
        }
        C0700x c0700x = (C0700x) obj;
        LinearLayout linearLayout = c0700x != null ? c0700x.f2728a : this.f2747l;
        if (linearLayout != null) {
            return linearLayout.getId();
        }
        return -1;
    }

    /* renamed from: c */
    public final void m1472c(C0700x c0700x, boolean z7) {
        GradientDrawable gradientDrawable;
        LinearLayout linearLayout = c0700x.f2728a;
        boolean z8 = this.f2742g;
        boolean z9 = z8 && linearLayout.hasFocus();
        int i = (z7 || z9) ? -1 : AbstractC0704z.f2754d;
        c0700x.f2730c.setTextColor(i);
        c0700x.f2729b.setColorFilter(i);
        if (z9) {
            int i4 = AbstractC0704z.f2756f;
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(10);
            gradientDrawable.setColor(i4);
        } else if (z7) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(10);
            gradientDrawable.setColor(this.f2743h);
        } else {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(10);
            gradientDrawable.setColor(0);
        }
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setForeground(null);
        linearLayout.setElevation(z9 ? (int) TypedValue.applyDimension(1, 8, this.f2740e.getResources().getDisplayMetrics()) : 0.0f);
        float f8 = z9 ? 1.1f : (z8 && z7) ? 1.04f : 1.0f;
        if (z8) {
            linearLayout.animate().cancel();
            linearLayout.animate().scaleX(f8).scaleY(f8).setDuration(140L).start();
        } else {
            linearLayout.setScaleX(f8);
            linearLayout.setScaleY(f8);
        }
    }

    /* renamed from: d */
    public final void m1473d(boolean z7) {
        ArrayList arrayList = this.f2741f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LinearLayout linearLayout = ((C0700x) obj).f2728a;
            linearLayout.setClickable(z7);
            linearLayout.setFocusable(z7);
            linearLayout.setAlpha(z7 ? 1.0f : 0.4f);
        }
        if (!z7) {
            this.f2744i = !this.f2742g;
        }
        m1475f();
    }

    /* renamed from: e */
    public final void m1474e(EnumC0698w enumC0698w) {
        EnumC0698w[] enumC0698wArrValues = EnumC0698w.values();
        int length = enumC0698wArrValues.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int i8 = i4 + 1;
            boolean z7 = enumC0698wArrValues[i] == enumC0698w;
            ArrayList arrayList = this.f2741f;
            ((C0700x) arrayList.get(i4)).f2728a.setSelected(z7);
            Object obj = arrayList.get(i4);
            AbstractC2980h.m5135d("get(...)", obj);
            m1472c((C0700x) obj, z7);
            i++;
            i4 = i8;
        }
    }

    /* renamed from: f */
    public final void m1475f() {
        TextView textView;
        ViewGroup.LayoutParams layoutParams;
        boolean z7 = this.f2744i;
        int i = z7 ? 0 : 8;
        int i4 = this.f2748m;
        MainActivity mainActivity = this.f2740e;
        boolean z8 = this.f2742g;
        int dimensionPixelSize = (z8 && z7) ? mainActivity.getResources().getDimensionPixelSize(R.dimen.large_nav_item_width) : i4;
        ArrayList arrayList = this.f2741f;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C0700x c0700x = (C0700x) obj;
            TextView textView2 = c0700x.f2730c;
            LinearLayout linearLayout = c0700x.f2728a;
            if (textView2.getVisibility() != i) {
                textView2.setVisibility(i);
                textView2.setPadding(this.f2744i ? this.f2745j : 0, 0, 0, 0);
            }
            if (z8 && (layoutParams = linearLayout.getLayoutParams()) != null && layoutParams.width != dimensionPixelSize) {
                layoutParams.width = dimensionPixelSize;
                linearLayout.setLayoutParams(layoutParams);
            }
        }
        LinearLayout linearLayout2 = this.f2739d;
        if (linearLayout2 != null && (textView = this.f2738c) != null) {
            if (this.f2744i && textView.getParent() == null) {
                textView.setVisibility(0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, i4);
                layoutParams2.setMarginStart(mainActivity.getResources().getDimensionPixelSize(R.dimen.nav_logo_mark_gap));
                linearLayout2.addView(textView, layoutParams2);
            } else if (!this.f2744i && textView.getParent() != null) {
                linearLayout2.removeView(textView);
            }
        }
        this.f2749n.requestLayout();
    }
}
