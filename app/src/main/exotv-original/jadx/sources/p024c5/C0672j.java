package p024c5;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;
import android.text.Layout;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0147m0;
import androidx.media3.common.C0222n;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p010b.AbstractActivityC0522l;
import p062h.AbstractActivityC1083i;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1339x;
import p095l.C1629o;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p105m0.C1847s1;
import p105m0.C1850t1;
import p105m0.C1853u1;
import p105m0.C1859w1;
import p195w4.C2647a0;
import p195w4.C2698x0;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.j */
/* loaded from: classes.dex */
public final class C0672j {

    /* renamed from: a */
    public static final C0672j f2641a = new C0672j();

    /* renamed from: a */
    public static void m1442a(AbstractActivityC1083i abstractActivityC1083i) {
        Window window = abstractActivityC1083i.getWindow();
        if (abstractActivityC1083i.getResources().getBoolean(R.bool.is_large_screen)) {
            AbstractC0120b.m396G(window, false);
            C1629o c1629o = new C1629o(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            AbstractC0715d c1859w1 = i >= 35 ? new C1859w1(window, c1629o) : i >= 30 ? new C1853u1(window, c1629o) : i >= 26 ? new C1850t1(window, c1629o) : new C1847s1(window, c1629o);
            c1859w1.mo1583L(1);
            c1859w1.mo1596j0();
            return;
        }
        AbstractC0120b.m396G(window, false);
        C1629o c1629o2 = new C1629o(window.getDecorView());
        int i4 = Build.VERSION.SDK_INT;
        AbstractC0715d c1859w12 = i4 >= 35 ? new C1859w1(window, c1629o2) : i4 >= 30 ? new C1853u1(window, c1629o2) : i4 >= 26 ? new C1850t1(window, c1629o2) : new C1847s1(window, c1629o2);
        c1859w12.mo1594i0(false);
        c1859w12.mo1601n0(1);
        ViewGroup viewGroup = (ViewGroup) abstractActivityC1083i.findViewById(android.R.id.content);
        if (viewGroup != null && viewGroup.findViewWithTag("exoStatusBarScrim") == null) {
            View view = new View(abstractActivityC1083i);
            view.setTag("exoStatusBarScrim");
            view.setBackgroundColor(855638016);
            view.setClickable(false);
            view.setFocusable(false);
            view.setImportantForAccessibility(2);
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, 0));
            C0222n c0222n = new C0222n(20);
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            AbstractC1804e0.m3538j(view, c0222n);
        }
    }

    /* renamed from: b */
    public static TextView m1443b(Context context, String str, int i, int i4, int i8) {
        AbstractC2980h.m5136e("text", str);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(m1445d(context, i4), m1445d(context, i8), m1445d(context, i4), m1445d(context, i8));
        textView.setBackground(m1449i(i, 6, 0, 0));
        return textView;
    }

    /* renamed from: c */
    public static GradientDrawable m1444c() {
        int i = AbstractC0704z.f2752b;
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, Color.argb(204, Color.red(i), Color.green(i), Color.blue(i)), i});
    }

    /* renamed from: d */
    public static int m1445d(Context context, int i) {
        AbstractC2980h.m5136e("ctx", context);
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static String m1446e(int i, String str) {
        AbstractC2980h.m5136e("text", str);
        return str.length() > i ? AbstractC1206h.m2644R0(i, str).concat("...") : str;
    }

    /* renamed from: f */
    public static void m1447f(C0672j c0672j, final Context context, View view, final int i, C2698x0 c2698x0, InterfaceC2840a interfaceC2840a, View view2, int i4) {
        final boolean z7 = (i4 & 16) != 0;
        final C2698x0 c2698x02 = (i4 & 32) != 0 ? null : c2698x0;
        final InterfaceC2840a interfaceC2840a2 = (i4 & 64) != 0 ? null : interfaceC2840a;
        View view3 = (i4 & 128) == 0 ? view2 : null;
        final boolean z8 = (i4 & 256) == 0;
        AbstractC2980h.m5136e("ctx", context);
        AbstractC2980h.m5136e("view", view);
        if (context.getResources().getBoolean(R.bool.is_large_screen)) {
            view.setFocusable(true);
            final View view4 = view3 == null ? view : view3;
            view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c5.g1
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view5, boolean z9) {
                    View view6 = view4;
                    InterfaceC2840a interfaceC2840a3 = c2698x02;
                    if (!z9) {
                        view6.setForeground(null);
                        view5.setScaleX(1.0f);
                        view5.setScaleY(1.0f);
                        if (interfaceC2840a3 != null) {
                            view5.setAlpha(((Number) interfaceC2840a3.invoke()).floatValue());
                        }
                        view5.setElevation(0.0f);
                        return;
                    }
                    Context context2 = context;
                    AbstractC2980h.m5136e("ctx", context2);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    int i8 = i - 2;
                    if (i8 < 0) {
                        i8 = 0;
                    }
                    gradientDrawable.setCornerRadius(i8);
                    gradientDrawable.setColor(0);
                    gradientDrawable.setStroke((int) TypedValue.applyDimension(1, 4, context2.getResources().getDisplayMetrics()), AbstractC0704z.f2756f);
                    view6.setForeground(gradientDrawable);
                    if (z7) {
                        view5.setScaleX(1.06f);
                        view5.setScaleY(1.06f);
                    }
                    if (interfaceC2840a3 != null) {
                        view5.setAlpha(1.0f);
                    }
                    view5.setElevation((int) TypedValue.applyDimension(1, 8, context2.getResources().getDisplayMetrics()));
                    InterfaceC2840a interfaceC2840a4 = interfaceC2840a2;
                    if (interfaceC2840a4 != null) {
                        view5.setNextFocusLeftId(((Number) interfaceC2840a4.invoke()).intValue());
                    }
                    if (z8) {
                        for (Object parent = view5.getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                            HorizontalScrollView horizontalScrollView = parent instanceof HorizontalScrollView ? (HorizontalScrollView) parent : null;
                            if (horizontalScrollView != null) {
                                int iM1560f0 = AbstractC0715d.m1560f0(((view5.getWidth() / 2.0f) + view5.getLeft()) - (horizontalScrollView.getWidth() / 2.0f));
                                int i9 = iM1560f0 >= 0 ? iM1560f0 : 0;
                                if (Math.abs(horizontalScrollView.getScrollX() - i9) > 1) {
                                    horizontalScrollView.post(new RunnableC0653c0(i9, 1, horizontalScrollView));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public static void m1448g(AbstractActivityC1083i abstractActivityC1083i) {
        abstractActivityC1083i.setRequestedOrientation(abstractActivityC1083i.getResources().getBoolean(R.bool.is_large_screen) ? 4 : 1);
    }

    /* renamed from: i */
    public static GradientDrawable m1449i(int i, int i4, int i8, int i9) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i4);
        gradientDrawable.setColor(i);
        if (i8 > 0) {
            gradientDrawable.setStroke(i8, i9);
        }
        return gradientDrawable;
    }

    /* renamed from: j */
    public static LinearLayout m1450j(Context context, Double d8, int i, String str) {
        if (d8 == null && str == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = m1445d(context, 12);
        linearLayout.setLayoutParams(layoutParams);
        if (d8 != null) {
            linearLayout.addView(m1443b(context, String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d8.doubleValue())}, 1)), i, 10, 4));
        }
        if (str != null) {
            View viewM1443b = m1443b(context, str, AbstractC0704z.f2757g, 10, 4);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart(m1445d(context, 8));
            viewM1443b.setLayoutParams(layoutParams2);
            linearLayout.addView(viewM1443b);
        }
        return linearLayout;
    }

    /* renamed from: k */
    public static LinearLayout m1451k(Context context, String str, float f8, int i, int i4, int i8, int i9) {
        int i10 = (i9 & 32) != 0 ? 0 : 20;
        if ((i9 & 64) != 0) {
            i8 = 0;
        }
        AbstractC2980h.m5136e("ctx", context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(m1445d(context, i4), m1445d(context, i10), m1445d(context, i4), m1445d(context, i8));
        int iM1445d = m1445d(context, (int) (0.8f * f8));
        View view = new View(context);
        view.setBackground(m1449i(AbstractC0704z.f2756f, 2, 0, 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m1445d(context, 4), iM1445d);
        layoutParams.rightMargin = m1445d(context, 8);
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setTextSize(f8);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setIncludeFontPadding(false);
        linearLayout.addView(textView);
        return linearLayout;
    }

    /* renamed from: l */
    public static void m1452l(AbstractActivityC0522l abstractActivityC0522l, String str, String str2, C2647a0 c2647a0, int i) {
        InterfaceC2840a c0661f = c2647a0;
        if ((i & 32) != 0) {
            c0661f = new C0661f(0);
        }
        AbstractC2980h.m5136e("activity", abstractActivityC0522l);
        AbstractC2980h.m5136e("id", str);
        AbstractC1339x.m2850k(AbstractC0147m0.m566e(abstractActivityC0522l), null, new C0670i(c0661f, str, -1, -1, abstractActivityC0522l, str2, -1, null), 3);
    }

    /* renamed from: h */
    public FrameLayout m1453h(Context context, String str) {
        final TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(str);
        textView.setTextColor(AbstractC0704z.f2753c);
        textView.setTextSize(14.0f);
        textView.setLineSpacing(m1445d(context, 3), 1.0f);
        textView.setLetterSpacing(0.02f);
        textView.setPadding(m1445d(context, 16), m1445d(context, 20), m1445d(context, 16), 0);
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        final TextView textView2 = new TextView(context);
        textView2.setText(context.getString(R.string.see_more));
        textView2.setTextColor(AbstractC0704z.f2756f);
        textView2.setTextSize(13.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setIncludeFontPadding(false);
        textView2.setPadding(m1445d(context, 6), m1445d(context, 1), 0, m1445d(context, 1));
        textView2.setBackgroundColor(AbstractC0704z.f2752b);
        textView2.setClickable(true);
        textView2.setFocusable(true);
        m1447f(this, context, textView2, 8, null, null, null, 484);
        final FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.rightMargin = m1445d(context, 16);
        frameLayout.addView(textView2, layoutParams);
        textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: c5.e1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i4, int i8, int i9, int i10, int i11, int i12, int i13) {
                TextView textView3 = textView;
                Layout layout = textView3.getLayout();
                int i14 = 0;
                boolean z7 = textView3.getMaxLines() == Integer.MAX_VALUE;
                boolean z8 = layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0;
                if (!z7 && !z8) {
                    i14 = 8;
                }
                TextView textView4 = textView2;
                textView4.setVisibility(i14);
                frameLayout.post(new RunnableC0320i(textView3, 5, textView4));
            }
        });
        textView2.setOnClickListener(new ViewOnClickListenerC0663f1(textView, textView2, context, 0));
        return frameLayout;
    }
}
