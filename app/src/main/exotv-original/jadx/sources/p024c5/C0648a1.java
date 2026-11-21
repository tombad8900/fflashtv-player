package p024c5;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0154q;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Locale;
import p017b6.ViewOnClickListenerC0591a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p076i7.C1294f1;
import p112m7.AbstractC1938n;
import p112m7.C1927c;
import p127o7.C2054e;
import p195w4.C2663g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.a1 */
/* loaded from: classes.dex */
public final class C0648a1 {

    /* renamed from: a */
    public final MainActivity f2551a;

    /* renamed from: b */
    public final C0154q f2552b;

    /* renamed from: c */
    public final C2663g f2553c;

    /* renamed from: d */
    public C1278a0 f2554d;

    /* renamed from: e */
    public final C1927c f2555e;

    /* renamed from: f */
    public EnumC0699w0 f2556f;

    /* renamed from: g */
    public final EditText f2557g;

    /* renamed from: h */
    public final TextView f2558h;

    /* renamed from: i */
    public final LinearLayout f2559i;

    /* renamed from: j */
    public LinearLayout f2560j;

    /* renamed from: k */
    public final ArrayList f2561k;

    /* renamed from: l */
    public final int f2562l;

    /* renamed from: m */
    public final int f2563m;

    /* renamed from: n */
    public final LinearLayout f2564n;

    public C0648a1(MainActivity mainActivity, C0154q c0154q, C2663g c2663g) {
        this.f2551a = mainActivity;
        this.f2552b = c0154q;
        this.f2553c = c2663g;
        C1294f1 c1294f1 = new C1294f1();
        C2054e c2054e = AbstractC1290e0.f5316a;
        this.f2555e = AbstractC1339x.m2840a(AbstractC0714c.m1508W(c1294f1, AbstractC1938n.f7227a.f5856n));
        this.f2556f = EnumC0699w0.f2723l;
        this.f2561k = new ArrayList();
        this.f2562l = -1;
        this.f2563m = -2;
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        final int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(AbstractC0704z.f2752b);
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        final int i4 = 0;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(m1427a(6), m1427a(4), m1427a(6), m1427a(4));
        C0672j c0672j = C0672j.f2641a;
        int i8 = AbstractC0704z.f2758h;
        int i9 = AbstractC0704z.f2759i;
        linearLayout2.setBackground(C0672j.m1449i(i8, 16, 1, i9));
        EditText editText = new EditText(mainActivity);
        editText.setId(View.generateViewId());
        editText.setHint(mainActivity.getString(R.string.search_hint));
        editText.setHintTextColor(AbstractC0704z.f2754d);
        editText.setTextColor(-1);
        editText.setTextSize(15.0f);
        editText.setInputType(1);
        editText.setImeOptions(3);
        editText.setSingleLine();
        editText.setPadding(m1427a(14), m1427a(10), m1427a(8), m1427a(10));
        editText.setBackground(null);
        editText.addTextChangedListener(new C0703y0(this));
        editText.setOnKeyListener(new View.OnKeyListener(this) { // from class: c5.t0

            /* renamed from: k */
            public final /* synthetic */ C0648a1 f2706k;

            {
                this.f2706k = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                switch (i4) {
                    case 0:
                        if (i10 != 20 || keyEvent.getAction() != 0) {
                            return false;
                        }
                        C0648a1 c0648a1 = this.f2706k;
                        return ((TextView) c0648a1.f2561k.get(c0648a1.f2556f.ordinal())).requestFocus();
                    default:
                        if (i10 != 21 || keyEvent.getAction() != 0) {
                            return false;
                        }
                        EditText editText2 = this.f2706k.f2557g;
                        if (editText2 != null) {
                            return editText2.requestFocus();
                        }
                        AbstractC2980h.m5139h("input");
                        throw null;
                }
            }
        });
        this.f2557g = editText;
        linearLayout2.addView(editText, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(mainActivity);
        textView.setId(View.generateViewId());
        textView.setText("\u2715");
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(AbstractC0704z.f2753c);
        textView.setContentDescription(mainActivity.getString(R.string.search_clear));
        textView.setBackground(C0672j.m1449i(i9, 999, 0, 0));
        textView.setVisibility(8);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0591a(4, this));
        C0672j.m1447f(c0672j, mainActivity, textView, 999, null, null, null, 484);
        textView.setOnKeyListener(new View.OnKeyListener(this) { // from class: c5.t0

            /* renamed from: k */
            public final /* synthetic */ C0648a1 f2706k;

            {
                this.f2706k = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        if (i10 != 20 || keyEvent.getAction() != 0) {
                            return false;
                        }
                        C0648a1 c0648a1 = this.f2706k;
                        return ((TextView) c0648a1.f2561k.get(c0648a1.f2556f.ordinal())).requestFocus();
                    default:
                        if (i10 != 21 || keyEvent.getAction() != 0) {
                            return false;
                        }
                        EditText editText2 = this.f2706k.f2557g;
                        if (editText2 != null) {
                            return editText2.requestFocus();
                        }
                        AbstractC2980h.m5139h("input");
                        throw null;
                }
            }
        });
        this.f2558h = textView;
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(m1427a(32), m1427a(32)));
        C0695u0 c0695u0 = new C0695u0(this, linearLayout2, i4);
        AbstractC2980h.m5136e("ctx", mainActivity);
        Resources resources = mainActivity.getResources();
        int i10 = R.bool.is_large_screen;
        if (resources.getBoolean(R.bool.is_large_screen)) {
            c0695u0.invoke();
        }
        LinearLayout linearLayout3 = new LinearLayout(mainActivity);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(m1427a(16), m1427a(14), m1427a(16), 0);
        linearLayout3.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(mainActivity);
        linearLayout4.setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(14);
        gradientDrawable.setColor(i8);
        gradientDrawable.setStroke(1, i9);
        linearLayout4.setBackground(gradientDrawable);
        EnumC0699w0[] enumC0699w0ArrValues = EnumC0699w0.values();
        int length = enumC0699w0ArrValues.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            EnumC0699w0 enumC0699w0 = enumC0699w0ArrValues[i11];
            int i13 = i12 + 1;
            if (i12 > 0) {
                View view = new View(mainActivity);
                view.setBackgroundColor(AbstractC0704z.f2759i);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m1427a(1), m1427a(20));
                layoutParams.gravity = 16;
                linearLayout4.addView(view, layoutParams);
            }
            TextView textView2 = new TextView(mainActivity);
            textView2.setId(View.generateViewId());
            textView2.setText(enumC0699w0.f2726j);
            textView2.setTextSize(13.0f);
            textView2.setGravity(17);
            textView2.setClickable(true);
            textView2.setFocusable(true);
            if (mainActivity.getResources().getBoolean(i10)) {
                C0672j.m1447f(c0672j, this.f2551a, textView2, 11, null, i12 == 0 ? this.f2553c : null, null, 420);
            }
            textView2.setOnClickListener(new ViewOnClickListenerC0684p(this, 4, enumC0699w0));
            textView2.setOnKeyListener(new ViewOnKeyListenerC0686q(i12, i, this));
            this.f2561k.add(textView2);
            linearLayout4.addView(textView2, new LinearLayout.LayoutParams(0, m1427a(38), 1.0f));
            i11++;
            i12 = i13;
            i10 = R.bool.is_large_screen;
        }
        m1431e();
        LinearLayout linearLayout5 = new LinearLayout(mainActivity);
        linearLayout5.setOrientation(1);
        linearLayout5.setPadding(m1427a(16), m1427a(12), m1427a(16), m1427a(12));
        linearLayout5.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(linearLayout5);
        FrameLayout frameLayout = new FrameLayout(mainActivity);
        LinearLayout linearLayout6 = new LinearLayout(mainActivity);
        linearLayout6.setOrientation(1);
        this.f2559i = linearLayout6;
        LinearLayout linearLayout7 = this.f2559i;
        if (linearLayout7 == null) {
            AbstractC2980h.m5139h("results");
            throw null;
        }
        frameLayout.addView(new C0691s0(linearLayout7, m1428b() ? m1427a(16) : 0), new FrameLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f2564n = linearLayout;
    }

    /* renamed from: a */
    public final int m1427a(int i) {
        return (int) TypedValue.applyDimension(1, i, this.f2551a.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public final boolean m1428b() {
        return this.f2551a.getResources().getBoolean(R.bool.is_large_screen);
    }

    /* renamed from: c */
    public final void m1429c(String str) {
        C1278a0 c1278a0 = this.f2554d;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        String string = AbstractC1206h.m2645S0(str).toString();
        EnumC0699w0 enumC0699w0 = this.f2556f;
        TextView textView = this.f2558h;
        if (textView == null) {
            AbstractC2980h.m5139h("clear");
            throw null;
        }
        textView.setVisibility(str.length() == 0 ? 8 : 0);
        if (string.length() < 3) {
            m1430d();
        } else {
            this.f2554d = AbstractC1339x.m2850k(this.f2552b, null, new C0701x0(this, string, enumC0699w0, null), 3);
        }
    }

    /* renamed from: d */
    public final void m1430d() {
        this.f2560j = null;
        LinearLayout linearLayout = this.f2559i;
        if (linearLayout == null) {
            AbstractC2980h.m5139h("results");
            throw null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f2559i;
        if (linearLayout2 == null) {
            AbstractC2980h.m5139h("results");
            throw null;
        }
        MainActivity mainActivity = this.f2551a;
        TextView textView = new TextView(mainActivity);
        textView.setText(mainActivity.getString(R.string.search_empty, this.f2556f.f2726j));
        textView.setTextColor(-1);
        textView.setTextSize(26.0f);
        textView.setGravity(17);
        textView.setPadding(0, m1427a(80), 0, m1427a(80));
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(this.f2562l, this.f2563m));
    }

    /* renamed from: e */
    public final void m1431e() {
        EnumC0699w0[] enumC0699w0ArrValues = EnumC0699w0.values();
        int length = enumC0699w0ArrValues.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            EnumC0699w0 enumC0699w0 = enumC0699w0ArrValues[i];
            int i8 = i4 + 1;
            Object obj = this.f2561k.get(i4);
            AbstractC2980h.m5135d("get(...)", obj);
            TextView textView = (TextView) obj;
            boolean z7 = enumC0699w0 == this.f2556f;
            textView.setTextColor(z7 ? -1 : AbstractC0704z.f2753c);
            textView.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            int color = z7 ? Color.parseColor("#8B0000") : 0;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(11);
            gradientDrawable.setColor(color);
            textView.setBackground(gradientDrawable);
            i++;
            i4 = i8;
        }
        EditText editText = this.f2557g;
        if (editText == null) {
            AbstractC2980h.m5139h("input");
            throw null;
        }
        String string = this.f2551a.getString(R.string.search_hint);
        AbstractC2980h.m5135d("getString(...)", string);
        String lowerCase = this.f2556f.f2726j.toLowerCase(Locale.ROOT);
        AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
        editText.setHint(AbstractC1214p.m2665r0(string, "movie", lowerCase));
    }
}
