package p024c5;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.StateListDrawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0127c0;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.exotv.net.MovieDetailActivity;
import com.exotv.net.PlayerActivity;
import com.exotv.net.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import p016b5.C0585h;
import p016b5.C0586i;
import p044e7.C0925b;
import p044e7.C0926c;
import p062h.AbstractActivityC1083i;
import p065h3.C1163h;
import p069h7.AbstractC1206h;
import p069h7.EnumC1205g;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p151r3.C2299k;
import p154r6.AbstractC2325h;
import p171t5.AbstractC2436a;
import p195w4.AbstractC2702z0;
import p195w4.C2651b1;
import p195w4.C2657d1;
import p195w4.C2699y;
import p204x4.C2758a;
import p204x4.C2768k;
import p204x4.C2769l;
import p204x4.C2771n;
import p204x4.C2780w;
import p204x4.C2781x;
import p204x4.EnumC2770m;
import p211y5.C2819f;
import p212y6.InterfaceC2855p;
import p218z4.C2945g0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.q0 */
/* loaded from: classes.dex */
public final class C0687q0 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f2687n;

    /* renamed from: o */
    public int f2688o;

    /* renamed from: p */
    public Object f2689p;

    /* renamed from: q */
    public final /* synthetic */ Object f2690q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0687q0(AbstractActivityC1083i abstractActivityC1083i, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f2687n = i;
        this.f2690q = abstractActivityC1083i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|285|(1:(1:(1:(2:7|8)(2:9|10))(7:11|289|12|13|28|32|(11:34|(1:36)(1:37)|38|(1:42)|(1:44)|(1:46)(1:47)|(1:49)(1:50)|51|(1:53)|54|(2:56|(4:58|(2:60|(1:62)(2:63|64))|65|(2:67|(21:69|(1:71)(1:73)|72|74|(1:76)|77|(1:80)|(1:82)|83|(1:86)|87|(3:89|(1:91)|92)|(3:94|(1:96)|97)|98|(1:100)|101|(1:103)|104|(1:106)|107|(21:109|(1:111)(1:112)|113|(1:115)(1:117)|116|118|(1:120)(1:121)|122|(1:124)(1:125)|126|(1:128)(1:129)|130|(1:132)(1:133)|134|(1:136)(1:137)|138|(1:140)(1:141)|142|(1:144)(1:145)|146|(2:148|(10:150|(2:152|(1:154)(2:155|156))|157|(2:162|(4:164|(1:166)|167|(2:169|(4:187|184|188|(2:191|(2:193|(1:195)(2:196|197))(2:198|199)))(2:171|(1:(0)(5:(3:178|(2:180|(2:295|187)(1:296))|294)|183|184|188|(2:191|(0)(0))))(2:185|186)))(2:200|201))(2:202|203))(1:159)|204|(2:206|(1:208)(2:209|210))|211|(2:214|(6:216|(1:218)|219|(3:222|(8:224|(1:235)(3:226|(1:231)|(0)(1:234))|(1:237)(1:238)|239|(1:241)|(2:243|(1:245)(3:293|247|248))|246|249)(3:292|250|251)|220)|291|252)(2:257|258))|253|(1:297)(1:256))(2:259|260))(2:261|262))(2:263|264))(2:265|266))(2:267|268))(2:269|270))(2:271|272))(2:273|274)))(2:16|17))(5:20|21|(0)|23|255)|24|287|25|(3:27|23|255)|28|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Collection] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m1460l(Object obj) throws Throwable {
        Object objM2857r;
        C2771n c2771n;
        Object objM5106g;
        String str;
        LinearLayout linearLayout;
        String str2;
        boolean z7;
        TextView textView;
        String strConcat;
        C0672j c0672j = C0672j.f2641a;
        final MovieDetailActivity movieDetailActivity = (MovieDetailActivity) this.f2690q;
        ArrayList arrayList = movieDetailActivity.f2926O;
        int i = movieDetailActivity.f2934W;
        int i4 = movieDetailActivity.f2935X;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i8 = this.f2688o;
        C1693j c1693j = C1693j.f6497a;
        int i9 = 2;
        InterfaceC2222c interfaceC2222c = null;
        try {
            if (i8 == 0) {
                AbstractC0714c.m1516d0(obj);
                C2054e c2054e = AbstractC1290e0.f5316a;
                ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                C0687q0 c0687q0 = new C0687q0(movieDetailActivity, interfaceC2222c, i9);
                this.f2688o = 1;
                objM2857r = AbstractC1339x.m2857r(executorC2053d, c0687q0, this);
                if (objM2857r != enumC2273a) {
                }
                return enumC2273a;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return c1693j;
                }
                C2771n c2771n2 = (C2771n) this.f2689p;
                try {
                    AbstractC0714c.m1516d0(obj);
                    objM5106g = obj;
                    c2771n = c2771n2;
                    str = (String) objM5106g;
                } catch (Exception e) {
                    Exception e8 = e;
                    c2771n = c2771n2;
                    Log.w("MovieDetailActivity", "quality lookup failed", e8);
                    str = null;
                    linearLayout = movieDetailActivity.f2921J;
                    if (linearLayout != null) {
                    }
                }
                linearLayout = movieDetailActivity.f2921J;
                if (linearLayout != null) {
                    AbstractC2980h.m5139h("body");
                    throw null;
                }
                linearLayout.removeAllViews();
                movieDetailActivity.f2923L = new FrameLayout(movieDetailActivity);
                ImageView imageView = new ImageView(movieDetailActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                int i10 = (int) (movieDetailActivity.getResources().getDisplayMetrics().heightPixels * (movieDetailActivity.m1701t() ? 0.52f : 0.42f));
                int i11 = (int) (i10 * 0.55f);
                String str3 = c2771n.f10259j;
                ?? r9 = c2771n.f10257h;
                String str4 = c2771n.f10252c;
                int i12 = c2771n.f10255f;
                String strM4337l = AbstractC2436a.m4337l(str3, "original");
                if (strM4337l == null && (strM4337l = AbstractC2436a.m4337l(str3, "w1280")) == null) {
                    strM4337l = AbstractC2436a.m4337l(str3, "w780");
                }
                if (strM4337l == null) {
                    strM4337l = AbstractC2436a.m4337l(c2771n.f10258i, "w500");
                }
                boolean z8 = strM4337l != null;
                int i13 = z8 ? i10 + movieDetailActivity.f2932U : i10;
                if (strM4337l != null) {
                    ComponentCallbacks2C0713b.m1485b(movieDetailActivity).m3884d(movieDetailActivity).m1660m(strM4337l).m1626u(imageView);
                }
                FrameLayout frameLayout = movieDetailActivity.f2923L;
                if (frameLayout == null) {
                    AbstractC2980h.m5139h("hero");
                    throw null;
                }
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(i, i13));
                FrameLayout frameLayout2 = movieDetailActivity.f2923L;
                if (frameLayout2 == null) {
                    AbstractC2980h.m5139h("hero");
                    throw null;
                }
                View view = new View(movieDetailActivity);
                view.setBackground(C0672j.m1444c());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i11);
                layoutParams.gravity = 80;
                frameLayout2.addView(view, layoutParams);
                TextView textView2 = new TextView(movieDetailActivity);
                textView2.setText(c2771n.f10251b);
                textView2.setTextColor(-1);
                textView2.setTextSize(26.0f);
                Typeface typeface = Typeface.DEFAULT_BOLD;
                textView2.setTypeface(typeface);
                textView2.setLetterSpacing(0.08f);
                textView2.setGravity(17);
                textView2.setShadowLayer(movieDetailActivity.m1700s(4), 0.0f, movieDetailActivity.m1700s(1), -16777216);
                if (z8) {
                    FrameLayout frameLayout3 = movieDetailActivity.f2923L;
                    if (frameLayout3 == null) {
                        AbstractC2980h.m5139h("hero");
                        throw null;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i4);
                    layoutParams2.gravity = 81;
                    layoutParams2.bottomMargin = movieDetailActivity.m1700s(12);
                    layoutParams2.leftMargin = movieDetailActivity.m1700s(16);
                    layoutParams2.rightMargin = movieDetailActivity.m1700s(16);
                    frameLayout3.addView(textView2, layoutParams2);
                }
                LinearLayout linearLayout2 = movieDetailActivity.f2921J;
                if (linearLayout2 == null) {
                    AbstractC2980h.m5139h("body");
                    throw null;
                }
                FrameLayout frameLayout4 = movieDetailActivity.f2923L;
                if (frameLayout4 == null) {
                    AbstractC2980h.m5139h("hero");
                    throw null;
                }
                linearLayout2.addView(frameLayout4, new LinearLayout.LayoutParams(i, i13));
                LinearLayout linearLayout3 = new LinearLayout(movieDetailActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setPadding(0, z8 ? movieDetailActivity.m1700s(2) : movieDetailActivity.m1700s(16) + movieDetailActivity.f2932U, 0, 0);
                if (!z8) {
                    linearLayout3.addView(textView2);
                }
                StringBuilder sb = new StringBuilder();
                String str5 = c2771n.f10256g;
                if (AbstractC1206h.m2630D0(str5)) {
                    str5 = null;
                }
                if (str5 != null) {
                    sb.append(str5);
                }
                String str6 = c2771n.f10253d;
                if (AbstractC1206h.m2630D0(str6)) {
                    str6 = null;
                }
                if (str6 != null) {
                    if (sb.length() > 0) {
                        sb.append(" \u2022 ");
                    }
                    sb.append(str6);
                }
                if (i12 > 0) {
                    if (sb.length() > 0) {
                        sb.append(" \u2022 ");
                    }
                    sb.append(i12 + " min");
                }
                TextView textView3 = new TextView(movieDetailActivity);
                textView3.setText(sb.toString());
                int i14 = AbstractC0704z.f2753c;
                textView3.setTextColor(i14);
                textView3.setTextSize(14.0f);
                textView3.setTypeface(typeface);
                textView3.setGravity(17);
                textView3.setPadding(0, movieDetailActivity.m1700s(6), 0, 0);
                if (sb.length() == 0) {
                    textView3.setVisibility(8);
                }
                linearLayout3.addView(textView3);
                if (!r9.isEmpty()) {
                    TextView textView4 = new TextView(movieDetailActivity);
                    textView4.setText(AbstractC1913h.m3740E0((Collection) r9, " \u2022 ", null, null, null, 62));
                    textView4.setTextColor(i14);
                    textView4.setTextSize(14.0f);
                    textView4.setTypeface(typeface);
                    textView4.setGravity(17);
                    textView4.setPadding(0, movieDetailActivity.m1700s(10), 0, 0);
                    textView4.setLetterSpacing(0.02f);
                    linearLayout3.addView(textView4);
                }
                Double d8 = c2771n.f10260k;
                int i15 = AbstractC0704z.f2756f;
                LinearLayout linearLayoutM1450j = C0672j.m1450j(movieDetailActivity, d8, i15, str);
                if (linearLayoutM1450j != null) {
                    linearLayout3.addView(linearLayoutM1450j);
                }
                LinearLayout linearLayout4 = movieDetailActivity.f2921J;
                if (linearLayout4 == null) {
                    AbstractC2980h.m5139h("body");
                    throw null;
                }
                linearLayout4.addView(linearLayout3);
                C2699y c2699y = new C2699y(movieDetailActivity, c2771n, 0);
                LinearLayout linearLayout5 = new LinearLayout(movieDetailActivity);
                float f8 = movieDetailActivity.m1701t() ? 20.0f : 17.0f;
                float f9 = movieDetailActivity.m1701t() ? 19.0f : 16.0f;
                linearLayout5.setOrientation(0);
                linearLayout5.setGravity(17);
                linearLayout5.setPadding(movieDetailActivity.m1700s(movieDetailActivity.m1701t() ? 28 : 24), 0, movieDetailActivity.m1700s(movieDetailActivity.m1701t() ? 28 : 24), 0);
                linearLayout5.setMinimumWidth(movieDetailActivity.m1700s(movieDetailActivity.m1701t() ? 200 : 176));
                linearLayout5.setMinimumHeight(movieDetailActivity.m1700s(movieDetailActivity.m1701t() ? 58 : 52));
                StateListDrawable stateListDrawable = new StateListDrawable();
                float f10 = f8;
                stateListDrawable.addState(new int[]{R.attr.state_focused}, C0672j.m1449i(i15, 24, 0, 0));
                stateListDrawable.addState(new int[0], C0672j.m1449i(Color.parseColor("#8B0000"), 24, 0, 0));
                linearLayout5.setBackground(stateListDrawable);
                linearLayout5.setContentDescription(movieDetailActivity.getString(com.exotv.net.R.string.action_play));
                linearLayout5.setClickable(true);
                linearLayout5.setFocusable(true);
                linearLayout5.setOnClickListener(new ViewOnClickListenerC0684p(movieDetailActivity, 6, c2699y));
                float f11 = f9;
                C0672j c0672j2 = c0672j;
                C0672j.m1447f(c0672j2, movieDetailActivity, linearLayout5, 24, null, null, null, 500);
                int iM1700s = movieDetailActivity.m1700s(movieDetailActivity.m1701t() ? 24 : 20);
                TextView textView5 = new TextView(movieDetailActivity);
                textView5.setText("\u25b6");
                textView5.setTextSize(f11);
                textView5.setTextColor(-1);
                textView5.setGravity(17);
                textView5.setIncludeFontPadding(false);
                movieDetailActivity.f2927P = textView5;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iM1700s, iM1700s);
                layoutParams3.gravity = 16;
                layoutParams3.setMarginEnd(movieDetailActivity.m1700s(movieDetailActivity.m1701t() ? 12 : 10));
                linearLayout5.addView(textView5, layoutParams3);
                Object obj2 = null;
                ProgressBar progressBar = new ProgressBar(movieDetailActivity, null, R.attr.progressBarStyle);
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(-1));
                progressBar.setVisibility(8);
                movieDetailActivity.f2928Q = progressBar;
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iM1700s, iM1700s);
                layoutParams4.gravity = 16;
                layoutParams4.setMarginEnd(movieDetailActivity.m1700s(movieDetailActivity.m1701t() ? 12 : 10));
                linearLayout5.addView(progressBar, layoutParams4);
                TextView textView6 = new TextView(movieDetailActivity);
                textView6.setText(movieDetailActivity.getString(com.exotv.net.R.string.action_play));
                textView6.setTextColor(-1);
                textView6.setTextSize(f10);
                textView6.setTypeface(typeface);
                textView6.setIncludeFontPadding(false);
                movieDetailActivity.f2929R = textView6;
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i4, i4);
                layoutParams5.gravity = 16;
                linearLayout5.addView(textView6, layoutParams5);
                movieDetailActivity.f2925N = linearLayout5;
                linearLayout5.setOnKeyListener(new ViewOnKeyListenerC0676l(2, movieDetailActivity));
                LinearLayout linearLayout6 = movieDetailActivity.f2921J;
                if (linearLayout6 == null) {
                    AbstractC2980h.m5139h("body");
                    throw null;
                }
                LinearLayout linearLayout7 = movieDetailActivity.f2925N;
                if (linearLayout7 == null) {
                    AbstractC2980h.m5139h("playAction");
                    throw null;
                }
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(i4, i4);
                final int i16 = 1;
                layoutParams6.gravity = 1;
                layoutParams6.topMargin = movieDetailActivity.m1700s(18);
                layoutParams6.bottomMargin = movieDetailActivity.m1700s(2);
                linearLayout6.addView(linearLayout7, layoutParams6);
                if (movieDetailActivity.m1701t()) {
                    LinearLayout linearLayout8 = movieDetailActivity.f2925N;
                    if (linearLayout8 == null) {
                        AbstractC2980h.m5139h("playAction");
                        throw null;
                    }
                    linearLayout8.post(new Runnable() { // from class: w4.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view2;
                            switch (i16) {
                                case 0:
                                    TextView textView7 = movieDetailActivity.f2924M;
                                    if (textView7 != null) {
                                        textView7.requestFocus();
                                        return;
                                    } else {
                                        AbstractC2980h.m5139h("back");
                                        throw null;
                                    }
                                default:
                                    MovieDetailActivity movieDetailActivity2 = movieDetailActivity;
                                    if (movieDetailActivity2.f2931T) {
                                        view2 = movieDetailActivity2.f2924M;
                                        if (view2 == null) {
                                            AbstractC2980h.m5139h("back");
                                            throw null;
                                        }
                                    } else {
                                        view2 = movieDetailActivity2.f2925N;
                                        if (view2 == null) {
                                            AbstractC2980h.m5139h("playAction");
                                            throw null;
                                        }
                                    }
                                    view2.requestFocus();
                                    return;
                            }
                        }
                    });
                }
                String str7 = c2771n.f10254e;
                if (!movieDetailActivity.f2931T && C2945g0.m5098e(str7)) {
                    movieDetailActivity.f2931T = true;
                    String string = movieDetailActivity.getString(com.exotv.net.R.string.play_coming_soon);
                    str2 = "getString(...)";
                    AbstractC2980h.m5135d(str2, string);
                    LinearLayout linearLayout9 = movieDetailActivity.f2925N;
                    if (linearLayout9 == null) {
                        AbstractC2980h.m5139h("playAction");
                        throw null;
                    }
                    linearLayout9.setAlpha(0.4f);
                    TextView textView7 = movieDetailActivity.f2929R;
                    if (textView7 != null) {
                        textView7.setText(string);
                    }
                    LinearLayout linearLayout10 = movieDetailActivity.f2925N;
                    if (linearLayout10 == null) {
                        AbstractC2980h.m5139h("playAction");
                        throw null;
                    }
                    linearLayout10.setContentDescription(string);
                    View currentFocus = movieDetailActivity.getCurrentFocus();
                    if (currentFocus == null) {
                        z7 = true;
                        final int i17 = 0;
                        movieDetailActivity.m1703v(false);
                        if (movieDetailActivity.m1701t() && z7) {
                            textView = movieDetailActivity.f2924M;
                            if (textView != null) {
                                AbstractC2980h.m5139h("back");
                                throw null;
                            }
                            textView.requestFocus();
                            TextView textView8 = movieDetailActivity.f2924M;
                            if (textView8 == null) {
                                AbstractC2980h.m5139h("back");
                                throw null;
                            }
                            textView8.post(new Runnable() { // from class: w4.z
                                @Override // java.lang.Runnable
                                public final void run() {
                                    View view2;
                                    switch (i17) {
                                        case 0:
                                            TextView textView72 = movieDetailActivity.f2924M;
                                            if (textView72 != null) {
                                                textView72.requestFocus();
                                                return;
                                            } else {
                                                AbstractC2980h.m5139h("back");
                                                throw null;
                                            }
                                        default:
                                            MovieDetailActivity movieDetailActivity2 = movieDetailActivity;
                                            if (movieDetailActivity2.f2931T) {
                                                view2 = movieDetailActivity2.f2924M;
                                                if (view2 == null) {
                                                    AbstractC2980h.m5139h("back");
                                                    throw null;
                                                }
                                            } else {
                                                view2 = movieDetailActivity2.f2925N;
                                                if (view2 == null) {
                                                    AbstractC2980h.m5139h("playAction");
                                                    throw null;
                                                }
                                            }
                                            view2.requestFocus();
                                            return;
                                    }
                                }
                            });
                        }
                    } else {
                        LinearLayout linearLayout11 = movieDetailActivity.f2925N;
                        if (linearLayout11 == null) {
                            AbstractC2980h.m5139h("playAction");
                            throw null;
                        }
                        if (currentFocus != linearLayout11) {
                            if (arrayList == null || !arrayList.isEmpty()) {
                                int size = arrayList.size();
                                int i18 = 0;
                                while (i18 < size) {
                                    Object obj3 = arrayList.get(i18);
                                    i18++;
                                    if (((View) obj3) == currentFocus) {
                                        z7 = true;
                                        break;
                                    }
                                }
                            }
                            z7 = false;
                            final int i172 = 0;
                            movieDetailActivity.m1703v(false);
                            if (movieDetailActivity.m1701t()) {
                                textView = movieDetailActivity.f2924M;
                                if (textView != null) {
                                }
                            }
                        }
                    }
                } else {
                    str2 = "getString(...)";
                }
                if (!AbstractC1206h.m2630D0(str4)) {
                    LinearLayout linearLayout12 = movieDetailActivity.f2921J;
                    if (linearLayout12 == null) {
                        AbstractC2980h.m5139h("body");
                        throw null;
                    }
                    linearLayout12.addView(c0672j2.m1453h(movieDetailActivity, str4), new LinearLayout.LayoutParams(i, i4));
                }
                final ?? r02 = c2771n.f10261l;
                if (!r02.isEmpty()) {
                    LinearLayout linearLayout13 = movieDetailActivity.f2921J;
                    if (linearLayout13 == null) {
                        AbstractC2980h.m5139h("body");
                        throw null;
                    }
                    LinearLayout linearLayout14 = new LinearLayout(movieDetailActivity);
                    linearLayout14.setOrientation(1);
                    linearLayout14.setPadding(0, movieDetailActivity.m1700s(24), 0, movieDetailActivity.m1700s(32));
                    String string2 = movieDetailActivity.getString(com.exotv.net.R.string.section_actors);
                    AbstractC2980h.m5135d(str2, string2);
                    LinearLayout linearLayout15 = linearLayout14;
                    int i19 = 16;
                    linearLayout15.addView(C0672j.m1451k(movieDetailActivity, string2, 18.0f, -1, 16, 16, 160));
                    LinearLayout linearLayout16 = new LinearLayout(movieDetailActivity);
                    linearLayout16.setOrientation(0);
                    linearLayout16.setPadding(movieDetailActivity.m1700s(16), 0, movieDetailActivity.m1700s(16), 0);
                    if (movieDetailActivity.getResources().getBoolean(com.exotv.net.R.bool.is_large_screen)) {
                        int i20 = MovieDetailActivity.f2918Y;
                        linearLayout16.setDescendantFocusability(262144);
                    }
                    int iM1700s2 = movieDetailActivity.m1700s(80);
                    int i21 = 0;
                    LinearLayout linearLayout17 = linearLayout16;
                    ViewGroup viewGroup = linearLayout15;
                    for (Object obj4 : r02) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            AbstractC1914i.m3755v0();
                            throw null;
                        }
                        C2758a c2758a = (C2758a) obj4;
                        ?? linearLayout18 = new LinearLayout(movieDetailActivity);
                        linearLayout18.setOrientation(1);
                        linearLayout18.setGravity(1);
                        linearLayout18.setPadding(0, 0, movieDetailActivity.m1700s(i19), 0);
                        linearLayout18.setFocusable(false);
                        FrameLayout frameLayout5 = new FrameLayout(movieDetailActivity);
                        C0672j c0672j3 = c0672j2;
                        LinearLayout linearLayout19 = linearLayout17;
                        final int i23 = i21;
                        frameLayout5.setBackground(C0672j.m1449i(0, 40, 1, AbstractC0704z.f2754d));
                        ImageView imageView2 = new ImageView(movieDetailActivity);
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        imageView2.setBackground(C0672j.m1449i(AbstractC0704z.f2760j, 40, 0, 0));
                        imageView2.setClipToOutline(true);
                        String str8 = c2758a.f10208d;
                        if (str8 == null) {
                            strConcat = null;
                        } else {
                            if (AbstractC1206h.m2630D0(str8) || str8.equals("null")) {
                                str8 = null;
                            }
                            if (str8 != null) {
                                strConcat = "https://image.tmdb.org/t/p/w185".concat(str8);
                            }
                        }
                        if (strConcat != null) {
                            ComponentCallbacks2C0713b.m1485b(movieDetailActivity).m3884d(movieDetailActivity).m1660m(strConcat).m1626u(imageView2);
                        } else {
                            imageView2.setImageResource(R.drawable.ic_menu_gallery);
                        }
                        frameLayout5.addView(imageView2, new FrameLayout.LayoutParams(iM1700s2, iM1700s2));
                        int i24 = iM1700s2;
                        c0672j2 = c0672j3;
                        int i25 = i;
                        LinearLayout linearLayout20 = linearLayout13;
                        ViewGroup viewGroup2 = viewGroup;
                        int i26 = i4;
                        C0672j.m1447f(c0672j2, movieDetailActivity, imageView2, 40, null, null, null, 484);
                        if (imageView2.getId() == -1) {
                            imageView2.setId(View.generateViewId());
                        }
                        if (i23 == 0) {
                            LinearLayout linearLayout21 = movieDetailActivity.f2925N;
                            if (linearLayout21 == null) {
                                AbstractC2980h.m5139h("playAction");
                                throw null;
                            }
                            linearLayout21.setNextFocusDownId(imageView2.getId());
                        }
                        arrayList.add(imageView2);
                        imageView2.setOnKeyListener(new View.OnKeyListener() { // from class: w4.b0
                            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
                            @Override // android.view.View.OnKeyListener
                            public final boolean onKey(View view2, int i27, KeyEvent keyEvent) {
                                int i28 = MovieDetailActivity.f2918Y;
                                if (keyEvent.getAction() == 0) {
                                    if (i27 == 19) {
                                        MovieDetailActivity movieDetailActivity2 = movieDetailActivity;
                                        if (!movieDetailActivity2.f2931T) {
                                            LinearLayout linearLayout22 = movieDetailActivity2.f2925N;
                                            if (linearLayout22 != null) {
                                                linearLayout22.requestFocus();
                                                return true;
                                            }
                                            AbstractC2980h.m5139h("playAction");
                                            throw null;
                                        }
                                        TextView textView9 = movieDetailActivity2.f2924M;
                                        if (textView9 == null) {
                                            AbstractC2980h.m5139h("back");
                                            throw null;
                                        }
                                        textView9.requestFocus();
                                        ScrollView scrollView = movieDetailActivity2.f2922K;
                                        if (scrollView != null) {
                                            scrollView.smoothScrollTo(0, 0);
                                            return true;
                                        }
                                        AbstractC2980h.m5139h("pageScroll");
                                        throw null;
                                    }
                                    if (i27 == 22) {
                                        if (i23 == AbstractC1914i.m3752s0(r02)) {
                                            return true;
                                        }
                                    }
                                }
                                return false;
                            }
                        });
                        linearLayout18.addView(frameLayout5, new LinearLayout.LayoutParams(i24, i24));
                        TextView textView9 = new TextView(movieDetailActivity);
                        textView9.setText(C0672j.m1446e(10, c2758a.f10207c));
                        textView9.setTextColor(-1);
                        textView9.setTextSize(12.0f);
                        textView9.setGravity(17);
                        textView9.setMaxLines(1);
                        textView9.setSingleLine();
                        textView9.setPadding(0, movieDetailActivity.m1700s(6), 0, 0);
                        linearLayout18.addView(textView9);
                        TextView textView10 = new TextView(movieDetailActivity);
                        textView10.setText(C0672j.m1446e(10, c2758a.f10206b));
                        textView10.setTextColor(AbstractC0704z.f2753c);
                        textView10.setTextSize(12.0f);
                        textView10.setGravity(17);
                        textView10.setMaxLines(1);
                        textView10.setSingleLine();
                        linearLayout18.addView(textView10);
                        ?? r42 = linearLayout19;
                        r42.addView(linearLayout18);
                        iM1700s2 = i24;
                        i21 = i22;
                        linearLayout13 = linearLayout20;
                        viewGroup = viewGroup2;
                        i = i25;
                        i4 = i26;
                        i19 = 16;
                        linearLayout17 = r42;
                    }
                    obj2 = null;
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(movieDetailActivity);
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    horizontalScrollView.setClipToPadding(false);
                    horizontalScrollView.setClipChildren(false);
                    linearLayout17.setClipChildren(false);
                    linearLayout17.setClipToPadding(false);
                    horizontalScrollView.addView(linearLayout17);
                    viewGroup.addView(horizontalScrollView, new LinearLayout.LayoutParams(i, i4));
                    linearLayout13.addView(viewGroup);
                }
                long j = movieDetailActivity.f2920I;
                this.f2689p = obj2;
                this.f2688o = 3;
                return MovieDetailActivity.m1699r(movieDetailActivity, j, this) == enumC2273a ? enumC2273a : c1693j;
            }
            AbstractC0714c.m1516d0(obj);
            objM2857r = obj;
            c2771n = (C2771n) objM2857r;
            C2945g0 c2945g0 = C2945g0.f10965a;
            String strValueOf = String.valueOf(movieDetailActivity.f2920I);
            this.f2689p = c2771n;
            this.f2688o = 2;
            objM5106g = c2945g0.m5106g(strValueOf, this);
            if (objM5106g == enumC2273a) {
                return enumC2273a;
            }
            str = (String) objM5106g;
            linearLayout = movieDetailActivity.f2921J;
            if (linearLayout != null) {
            }
        } catch (Exception e9) {
            int i27 = MovieDetailActivity.f2918Y;
            Log.e("MovieDetailActivity", "load failed", e9);
            LinearLayout linearLayout22 = movieDetailActivity.f2921J;
            if (linearLayout22 == null) {
                AbstractC2980h.m5139h("body");
                throw null;
            }
            linearLayout22.removeAllViews();
            LinearLayout linearLayout23 = movieDetailActivity.f2921J;
            if (linearLayout23 == null) {
                AbstractC2980h.m5139h("body");
                throw null;
            }
            String string3 = movieDetailActivity.getString(com.exotv.net.R.string.detail_load_failed);
            AbstractC2980h.m5135d("getString(...)", string3);
            TextView textView11 = new TextView(movieDetailActivity);
            textView11.setText(string3);
            textView11.setTextColor(AbstractC0704z.f2753c);
            textView11.setTextSize(14.0f);
            textView11.setGravity(17);
            textView11.setPadding(C0672j.m1445d(movieDetailActivity, 16), C0672j.m1445d(movieDetailActivity, 48), C0672j.m1445d(movieDetailActivity, 16), C0672j.m1445d(movieDetailActivity, 48));
            linearLayout23.addView(textView11, new LinearLayout.LayoutParams(i, i4));
            return c1693j;
        }
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f2687n) {
        }
        return ((C0687q0) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f2687n) {
            case 0:
                return new C0687q0((EnumC2770m) this.f2689p, (C2769l) this.f2690q, interfaceC2222c, 0);
            case 1:
                return new C0687q0((C1163h) this.f2689p, (C2299k) this.f2690q, interfaceC2222c, 1);
            case 2:
                return new C0687q0((MovieDetailActivity) this.f2690q, interfaceC2222c, 2);
            case 3:
                return new C0687q0((MovieDetailActivity) this.f2690q, interfaceC2222c, 3);
            case 4:
                return new C0687q0((PlayerActivity) this.f2689p, (String) this.f2690q, interfaceC2222c, 4);
            default:
                return new C0687q0((SeriesDetailActivity) this.f2690q, interfaceC2222c, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0619, code lost:
    
        if (com.exotv.net.SeriesDetailActivity.m1737r(r7, r42) == r6) goto L194;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0277  */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        String str;
        String str2;
        Object objM4850e;
        String strOptString;
        Object objM2579a;
        String str3;
        String str4;
        Object objM4851f;
        C2781x c2781x;
        C1921p c1921p;
        String strOptString2;
        C1921p c1921p2;
        JSONArray jSONArrayOptJSONArray;
        C2758a c2758a;
        Object objM1706s;
        String str5;
        Object objM2857r;
        JSONObject jSONObject;
        String str6;
        Object objM5110m;
        JSONArray jSONArray;
        Exception e;
        String str7;
        String strM1739z;
        String str8;
        ArrayList arrayList;
        String strM1739z2;
        String strM2644R0;
        int iOptInt;
        int iOptInt2;
        ArrayList arrayList2;
        JSONArray jSONArrayOptJSONArray2;
        Double dValueOf;
        LinearLayout linearLayoutM1450j;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        String strOptString3;
        String strM1739z3;
        switch (this.f2687n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i = this.f2688o;
                if (i == 0) {
                    AbstractC0714c.m1516d0(obj);
                    String str9 = ((EnumC2770m) this.f2689p) == EnumC2770m.f10247j ? "movie" : "tv";
                    String str10 = "https://api.themoviedb.org/3/" + str9 + "/" + ((C2769l) this.f2690q).f10241a + "/images?include_image_language=en,null";
                    AbstractC2980h.m5136e("url", str10);
                    String str11 = AbstractC1206h.m2650v0(str10, '?') ? "&" : "?";
                    C0586i c0586i = C0585h.f2325a;
                    if (c0586i == null || (str = c0586i.f2343r) == null) {
                        str = "4e44d9029b1270a757cddc766a1bcb63";
                    }
                    String str12 = str10 + str11 + "api_key=" + str;
                    C2768k c2768k = C2768k.f10237a;
                    this.f2688o = 1;
                    str2 = null;
                    objM4850e = C2768k.m4850e(str12, null, this);
                    if (objM4850e == enumC2273a) {
                        return enumC2273a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    objM4850e = obj;
                    str2 = null;
                }
                JSONArray jSONArrayOptJSONArray3 = ((JSONObject) objM4850e).optJSONArray("logos");
                if (jSONArrayOptJSONArray3 != null) {
                    C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(0, jSONArrayOptJSONArray3.length());
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = c0926cM1521g0.iterator();
                    while (true) {
                        C0925b c0925b = (C0925b) it;
                        if (c0925b.f3991l) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray3.optJSONObject(c0925b.nextInt());
                            if (jSONObjectOptJSONObject != null) {
                                arrayList3.add(jSONObjectOptJSONObject);
                            }
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            int size = arrayList3.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj2 = arrayList3.get(i4);
                                i4++;
                                String strOptString4 = ((JSONObject) obj2).optString("file_path");
                                AbstractC2980h.m5133b(strOptString4);
                                if (!AbstractC1206h.m2630D0(strOptString4) && !strOptString4.equals("null")) {
                                    arrayList4.add(obj2);
                                }
                            }
                            JSONObject jSONObject2 = (JSONObject) AbstractC1913h.m3737B0(AbstractC1913h.m3745J0(arrayList4, new C0685p0(new C0685p0(new C0683o0(), 0), 1)));
                            if (jSONObject2 != null && (strOptString = jSONObject2.optString("file_path")) != null) {
                                EnumC1205g enumC1205g = EnumC1205g.f5092k;
                                Pattern patternCompile = Pattern.compile("\\.svg$", C2819f.m4927o(2));
                                AbstractC2980h.m5135d("compile(...)", patternCompile);
                                String strReplaceAll = patternCompile.matcher(strOptString).replaceAll(".png");
                                AbstractC2980h.m5135d("replaceAll(...)", strReplaceAll);
                                if (AbstractC1206h.m2630D0(strReplaceAll) || strReplaceAll.equals("null")) {
                                    strReplaceAll = str2;
                                }
                                if (strReplaceAll != null) {
                                    return "https://image.tmdb.org/t/p/w500".concat(strReplaceAll);
                                }
                            }
                        }
                    }
                }
                return str2;
            case 1:
                C1163h c1163h = (C1163h) this.f2689p;
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i8 = this.f2688o;
                if (i8 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C2299k c2299k = (C2299k) this.f2690q;
                    this.f2688o = 1;
                    objM2579a = C1163h.m2579a(c1163h, c2299k, this);
                    if (objM2579a == enumC2273a2) {
                        return enumC2273a2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    objM2579a = obj;
                }
                return objM2579a;
            case 2:
                EnumC2273a enumC2273a3 = EnumC2273a.f7953j;
                int i9 = this.f2688o;
                if (i9 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C2781x c2781x2 = C2781x.f10330a;
                    C2768k c2768k2 = C2768k.f10237a;
                    str3 = "backdrop_path";
                    String str13 = "https://api.themoviedb.org/3/movie/" + ((MovieDetailActivity) this.f2690q).f2920I + "?append_to_response=credits";
                    AbstractC2980h.m5136e("url", str13);
                    String str14 = AbstractC1206h.m2650v0(str13, '?') ? "&" : "?";
                    C0586i c0586i2 = C0585h.f2325a;
                    if (c0586i2 == null || (str4 = c0586i2.f2343r) == null) {
                        str4 = "4e44d9029b1270a757cddc766a1bcb63";
                    }
                    this.f2689p = c2781x2;
                    this.f2688o = 1;
                    objM4851f = C2768k.m4851f(str13 + str14 + "api_key=" + str4, this);
                    if (objM4851f == enumC2273a3) {
                        return enumC2273a3;
                    }
                    c2781x = c2781x2;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2781x = (C2781x) this.f2689p;
                    AbstractC0714c.m1516d0(obj);
                    objM4851f = obj;
                    str3 = "backdrop_path";
                }
                JSONObject jSONObject3 = new JSONObject((String) objM4851f);
                c2781x.getClass();
                C1921p c1921p3 = C1921p.f7187j;
                long jOptLong = jSONObject3.optLong("id");
                C2780w c2780w = C2780w.f10327a;
                EnumC2770m enumC2770m = EnumC2770m.f10247j;
                String strM4863a = C2780w.m4863a(jSONObject3, (List) AbstractC1924s.m3758S(C2780w.f10328b, enumC2770m));
                if (strM4863a == null) {
                    strM4863a = "Untitled";
                }
                String str15 = strM4863a;
                String strOptString5 = jSONObject3.optString("overview");
                AbstractC2980h.m5135d("optString(...)", strOptString5);
                String strM4866d = C2780w.m4866d(jSONObject3, enumC2770m);
                String strOptString6 = jSONObject3.optString("release_date");
                AbstractC2980h.m5133b(strOptString6);
                String str16 = (AbstractC1206h.m2630D0(strOptString6) || strOptString6.equals("null")) ? null : strOptString6;
                int iOptInt3 = jSONObject3.optInt("runtime");
                String strOptString7 = jSONObject3.optString("status");
                AbstractC2980h.m5135d("optString(...)", strOptString7);
                JSONArray jSONArrayOptJSONArray4 = jSONObject3.optJSONArray("genres");
                if (jSONArrayOptJSONArray4 == null) {
                    c1921p = c1921p3;
                } else {
                    C0926c c0926cM1521g02 = AbstractC0714c.m1521g0(0, jSONArrayOptJSONArray4.length());
                    ?? arrayList5 = new ArrayList();
                    Iterator it2 = c0926cM1521g02.iterator();
                    while (true) {
                        C0925b c0925b2 = (C0925b) it2;
                        if (c0925b2.f3991l) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray4.optJSONObject(c0925b2.nextInt());
                            if (jSONObjectOptJSONObject2 == null || (strOptString2 = jSONObjectOptJSONObject2.optString("name")) == null || AbstractC1206h.m2630D0(strOptString2)) {
                                strOptString2 = null;
                            }
                            if (strOptString2 != null) {
                                arrayList5.add(strOptString2);
                            }
                        } else {
                            c1921p = arrayList5;
                        }
                    }
                }
                String strOptString8 = jSONObject3.optString("poster_path");
                AbstractC2980h.m5133b(strOptString8);
                String str17 = (strOptString8.length() <= 0 || strOptString8.equals("null")) ? null : strOptString8;
                String strOptString9 = jSONObject3.optString(str3);
                AbstractC2980h.m5133b(strOptString9);
                String str18 = (strOptString9.length() <= 0 || strOptString9.equals("null")) ? null : strOptString9;
                C2780w c2780w2 = C2780w.f10327a;
                Double dM4865c = C2780w.m4865c(jSONObject3);
                JSONObject jSONObjectOptJSONObject3 = jSONObject3.optJSONObject("credits");
                if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("cast")) == null) {
                    c1921p2 = c1921p3;
                } else {
                    C0926c c0926cM1521g03 = AbstractC0714c.m1521g0(0, jSONArrayOptJSONArray.length());
                    ?? arrayList6 = new ArrayList();
                    Iterator it3 = c0926cM1521g03.iterator();
                    while (true) {
                        C0925b c0925b3 = (C0925b) it3;
                        if (c0925b3.f3991l) {
                            JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(c0925b3.nextInt());
                            if (jSONObjectOptJSONObject4 == null) {
                                c2758a = null;
                            } else {
                                String strOptString10 = jSONObjectOptJSONObject4.optString("name");
                                AbstractC2980h.m5133b(strOptString10);
                                String str19 = !AbstractC1206h.m2630D0(strOptString10) ? strOptString10 : null;
                                if (str19 != null) {
                                    long jOptLong2 = jSONObjectOptJSONObject4.optLong("id");
                                    String strOptString11 = jSONObjectOptJSONObject4.optString("character");
                                    AbstractC2980h.m5135d("optString(...)", strOptString11);
                                    String strOptString12 = jSONObjectOptJSONObject4.optString("profile_path");
                                    AbstractC2980h.m5133b(strOptString12);
                                    c2758a = new C2758a(jOptLong2, str19, strOptString11, (strOptString12.length() <= 0 || strOptString12.equals("null")) ? null : strOptString12);
                                }
                            }
                            if (c2758a != null) {
                                arrayList6.add(c2758a);
                            }
                        } else {
                            c1921p2 = arrayList6;
                        }
                    }
                }
                return new C2771n(jOptLong, str15, strOptString5, strM4866d, str16, iOptInt3, strOptString7, c1921p, str17, str18, dM4865c, c1921p2);
            case 3:
                return m1460l(obj);
            case 4:
                String str20 = (String) this.f2690q;
                PlayerActivity playerActivity = (PlayerActivity) this.f2689p;
                EnumC2273a enumC2273a4 = EnumC2273a.f7953j;
                int i10 = this.f2688o;
                try {
                    if (i10 == 0) {
                        AbstractC0714c.m1516d0(obj);
                        this.f2688o = 1;
                        objM1706s = PlayerActivity.m1706s(playerActivity, str20, this);
                        if (objM1706s == enumC2273a4) {
                            return enumC2273a4;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0714c.m1516d0(obj);
                        objM1706s = obj;
                    }
                    playerActivity.f2953X.put(str20, (List) objM1706s);
                    if (AbstractC2980h.m5132a(playerActivity.f2954Y, str20)) {
                        playerActivity.m1733x();
                        playerActivity.m1718L();
                        playerActivity.m1732w(str20);
                    }
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Exception unused) {
                    String string = playerActivity.getString(com.exotv.net.R.string.subs_search_failed);
                    AbstractC2980h.m5135d("getString(...)", string);
                    playerActivity.m1725S(string);
                }
                return C1693j.f6497a;
            default:
                C1693j c1693j = C1693j.f6497a;
                C0672j c0672j = C0672j.f2641a;
                SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) this.f2690q;
                int i11 = seriesDetailActivity.f3031i0;
                int i12 = seriesDetailActivity.f3032j0;
                EnumC2273a enumC2273a5 = EnumC2273a.f7953j;
                int i13 = this.f2688o;
                try {
                } catch (Exception e9) {
                    Log.e("SeriesDetailActivity", "series load failed", e9);
                    TextView textView = seriesDetailActivity.f3005I;
                    if (textView == null) {
                        AbstractC2980h.m5139h("status");
                        throw null;
                    }
                    textView.setVisibility(8);
                    LinearLayout linearLayout3 = seriesDetailActivity.f3004H;
                    if (linearLayout3 == null) {
                        AbstractC2980h.m5139h("content");
                        throw null;
                    }
                    linearLayout3.removeAllViews();
                    LinearLayout linearLayout4 = seriesDetailActivity.f3004H;
                    if (linearLayout4 == null) {
                        AbstractC2980h.m5139h("content");
                        throw null;
                    }
                    String string2 = seriesDetailActivity.getString(com.exotv.net.R.string.detail_load_failed);
                    AbstractC2980h.m5135d("getString(...)", string2);
                    TextView textView2 = new TextView(seriesDetailActivity);
                    textView2.setText(string2);
                    textView2.setTextColor(AbstractC0704z.f2753c);
                    textView2.setTextSize(14.0f);
                    textView2.setGravity(17);
                    textView2.setPadding(C0672j.m1445d(seriesDetailActivity, 16), C0672j.m1445d(seriesDetailActivity, 48), C0672j.m1445d(seriesDetailActivity, 16), C0672j.m1445d(seriesDetailActivity, 48));
                    linearLayout4.addView(textView2, new LinearLayout.LayoutParams(i11, i12));
                }
                if (i13 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    this.f2688o = 1;
                    int i14 = SeriesDetailActivity.f3003k0;
                    C2054e c2054e = AbstractC1290e0.f5316a;
                    str5 = "genres";
                    objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2657d1(seriesDetailActivity, null, 0), this);
                    if (objM2857r == enumC2273a5) {
                    }
                    return enumC2273a5;
                }
                if (i13 == 1) {
                    AbstractC0714c.m1516d0(obj);
                    objM2857r = obj;
                    str5 = "genres";
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0714c.m1516d0(obj);
                        return c1693j;
                    }
                    jSONObject = (JSONObject) this.f2689p;
                    try {
                        AbstractC0714c.m1516d0(obj);
                        objM5110m = obj;
                        str5 = "genres";
                        str6 = "status";
                        str7 = (String) objM5110m;
                    } catch (Exception e10) {
                        e = e10;
                        str5 = "genres";
                        str6 = "status";
                        Log.w("SeriesDetailActivity", "quality lookup failed", e);
                        str7 = null;
                        String strOptString13 = jSONObject.optString("backdrop_path");
                        AbstractC2980h.m5135d("optString(...)", strOptString13);
                        strM1739z = SeriesDetailActivity.m1739z(strOptString13);
                        if (strM1739z == null) {
                        }
                        int i15 = (int) (seriesDetailActivity.getResources().getDisplayMetrics().heightPixels * (!seriesDetailActivity.m1745u() ? 0.52f : 0.42f));
                        int i16 = (int) (i15 * 0.55f);
                        FrameLayout frameLayout = new FrameLayout(seriesDetailActivity);
                        if (strM1739z != null) {
                        }
                        TextView textView3 = new TextView(seriesDetailActivity);
                        textView3.setText(seriesDetailActivity.f3025c0);
                        textView3.setTextColor(-1);
                        textView3.setTextSize(26.0f);
                        Typeface typeface = Typeface.DEFAULT_BOLD;
                        textView3.setTypeface(typeface);
                        textView3.setLetterSpacing(0.08f);
                        textView3.setGravity(17);
                        str8 = strM1739z;
                        textView3.setShadowLayer(C0672j.m1445d(seriesDetailActivity, 4), 0.0f, C0672j.m1445d(seriesDetailActivity, 1), -16777216);
                        if (str8 != null) {
                        }
                        LinearLayout linearLayout5 = new LinearLayout(seriesDetailActivity);
                        linearLayout5.setOrientation(1);
                        linearLayout5.setPadding(0, C0672j.m1445d(seriesDetailActivity, 2) + (str8 != null ? seriesDetailActivity.f3022Z : 0), 0, 0);
                        if (str8 == null) {
                        }
                        arrayList = new ArrayList();
                        String strOptString14 = jSONObject.optString(str6);
                        AbstractC2980h.m5135d("optString(...)", strOptString14);
                        strM1739z2 = SeriesDetailActivity.m1739z(strOptString14);
                        if (strM1739z2 != null) {
                        }
                        String strOptString15 = jSONObject.optString("first_air_date");
                        AbstractC2980h.m5135d("optString(...)", strOptString15);
                        strM2644R0 = AbstractC1206h.m2644R0(4, strOptString15);
                        if (strM2644R0.length() != 4) {
                        }
                        if (strM2644R0 != null) {
                        }
                        iOptInt = jSONObject.optInt("number_of_seasons");
                        if (iOptInt > 0) {
                        }
                        iOptInt2 = jSONObject.optInt("number_of_episodes");
                        if (iOptInt2 > 0) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                        arrayList2 = new ArrayList();
                        jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str5);
                        if (jSONArrayOptJSONArray2 != null) {
                        }
                        if (!arrayList2.isEmpty()) {
                        }
                        if (!jSONObject.isNull("vote_average")) {
                        }
                        dValueOf = null;
                        linearLayoutM1450j = C0672j.m1450j(seriesDetailActivity, dValueOf, AbstractC2702z0.f9816f, str7);
                        if (linearLayoutM1450j != null) {
                        }
                        linearLayout = seriesDetailActivity.f3004H;
                        if (linearLayout == null) {
                        }
                    }
                    String strOptString132 = jSONObject.optString("backdrop_path");
                    AbstractC2980h.m5135d("optString(...)", strOptString132);
                    strM1739z = SeriesDetailActivity.m1739z(strOptString132);
                    if (strM1739z == null) {
                        String strOptString16 = jSONObject.optString("poster_path");
                        AbstractC2980h.m5135d("optString(...)", strOptString16);
                        strM1739z = SeriesDetailActivity.m1739z(strOptString16);
                    }
                    int i152 = (int) (seriesDetailActivity.getResources().getDisplayMetrics().heightPixels * (!seriesDetailActivity.m1745u() ? 0.52f : 0.42f));
                    int i162 = (int) (i152 * 0.55f);
                    FrameLayout frameLayout2 = new FrameLayout(seriesDetailActivity);
                    if (strM1739z != null) {
                        ImageView imageView = new ImageView(seriesDetailActivity);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        imageView.setBackgroundColor(AbstractC2702z0.f9813c);
                        int i17 = i152 + seriesDetailActivity.f3022Z;
                        String strM4337l = AbstractC2436a.m4337l(strM1739z, "original");
                        if (strM4337l == null && (strM4337l = AbstractC2436a.m4337l(strM1739z, "w1280")) == null) {
                            strM4337l = AbstractC2436a.m4337l(strM1739z, "w780");
                        }
                        if (strM4337l != null) {
                            ComponentCallbacks2C0713b.m1485b(seriesDetailActivity).m3884d(seriesDetailActivity).m1660m(strM4337l).m1626u(imageView);
                        }
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(i11, i17));
                        View view = new View(seriesDetailActivity);
                        view.setBackground(C0672j.m1444c());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i162);
                        layoutParams.gravity = 80;
                        frameLayout2.addView(view, layoutParams);
                        LinearLayout linearLayout6 = seriesDetailActivity.f3004H;
                        if (linearLayout6 == null) {
                            AbstractC2980h.m5139h("content");
                            throw null;
                        }
                        linearLayout6.addView(frameLayout2, new LinearLayout.LayoutParams(i11, i17));
                    }
                    TextView textView32 = new TextView(seriesDetailActivity);
                    textView32.setText(seriesDetailActivity.f3025c0);
                    textView32.setTextColor(-1);
                    textView32.setTextSize(26.0f);
                    Typeface typeface2 = Typeface.DEFAULT_BOLD;
                    textView32.setTypeface(typeface2);
                    textView32.setLetterSpacing(0.08f);
                    textView32.setGravity(17);
                    str8 = strM1739z;
                    textView32.setShadowLayer(C0672j.m1445d(seriesDetailActivity, 4), 0.0f, C0672j.m1445d(seriesDetailActivity, 1), -16777216);
                    if (str8 != null) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i12);
                        layoutParams2.gravity = 81;
                        layoutParams2.bottomMargin = C0672j.m1445d(seriesDetailActivity, 12);
                        layoutParams2.leftMargin = C0672j.m1445d(seriesDetailActivity, 16);
                        layoutParams2.rightMargin = C0672j.m1445d(seriesDetailActivity, 16);
                        frameLayout2.addView(textView32, layoutParams2);
                    }
                    LinearLayout linearLayout52 = new LinearLayout(seriesDetailActivity);
                    linearLayout52.setOrientation(1);
                    linearLayout52.setPadding(0, C0672j.m1445d(seriesDetailActivity, 2) + (str8 != null ? seriesDetailActivity.f3022Z : 0), 0, 0);
                    if (str8 == null) {
                        linearLayout52.addView(textView32);
                    }
                    arrayList = new ArrayList();
                    String strOptString142 = jSONObject.optString(str6);
                    AbstractC2980h.m5135d("optString(...)", strOptString142);
                    strM1739z2 = SeriesDetailActivity.m1739z(strOptString142);
                    if (strM1739z2 != null) {
                        if (strM1739z2.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            String strValueOf = String.valueOf(strM1739z2.charAt(0));
                            AbstractC2980h.m5134c("null cannot be cast to non-null type java.lang.String", strValueOf);
                            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                            AbstractC2980h.m5135d("toUpperCase(...)", upperCase);
                            sb.append((Object) upperCase);
                            String strSubstring = strM1739z2.substring(1);
                            AbstractC2980h.m5135d("substring(...)", strSubstring);
                            sb.append(strSubstring);
                            strM1739z2 = sb.toString();
                        }
                        arrayList.add(strM1739z2);
                    }
                    String strOptString152 = jSONObject.optString("first_air_date");
                    AbstractC2980h.m5135d("optString(...)", strOptString152);
                    strM2644R0 = AbstractC1206h.m2644R0(4, strOptString152);
                    if (strM2644R0.length() != 4) {
                        strM2644R0 = null;
                    }
                    if (strM2644R0 != null) {
                        arrayList.add(strM2644R0);
                    }
                    iOptInt = jSONObject.optInt("number_of_seasons");
                    if (iOptInt > 0) {
                        arrayList.add(seriesDetailActivity.getResources().getQuantityString(com.exotv.net.R.plurals.season_count, iOptInt, Integer.valueOf(iOptInt)));
                    }
                    iOptInt2 = jSONObject.optInt("number_of_episodes");
                    if (iOptInt2 > 0) {
                        arrayList.add(seriesDetailActivity.getResources().getQuantityString(com.exotv.net.R.plurals.episode_count, iOptInt2, Integer.valueOf(iOptInt2)));
                    }
                    if (!arrayList.isEmpty()) {
                        TextView textView4 = new TextView(seriesDetailActivity);
                        textView4.setText(AbstractC1913h.m3740E0(arrayList, " \u2022 ", null, null, null, 62));
                        textView4.setTextColor(AbstractC0704z.f2753c);
                        textView4.setTextSize(14.0f);
                        textView4.setTypeface(typeface2);
                        textView4.setGravity(17);
                        textView4.setPadding(0, C0672j.m1445d(seriesDetailActivity, 6), 0, 0);
                        linearLayout52.addView(textView4);
                    }
                    arrayList2 = new ArrayList();
                    jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str5);
                    if (jSONArrayOptJSONArray2 != null) {
                        int length = jSONArrayOptJSONArray2.length();
                        for (int i18 = 0; i18 < length; i18++) {
                            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i18);
                            if (jSONObjectOptJSONObject5 != null && (strOptString3 = jSONObjectOptJSONObject5.optString("name")) != null && (strM1739z3 = SeriesDetailActivity.m1739z(strOptString3)) != null) {
                                arrayList2.add(strM1739z3);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        TextView textView5 = new TextView(seriesDetailActivity);
                        textView5.setText(AbstractC1913h.m3740E0(arrayList2, " \u2022 ", null, null, null, 62));
                        textView5.setTextColor(AbstractC0704z.f2753c);
                        textView5.setTextSize(14.0f);
                        textView5.setTypeface(Typeface.DEFAULT_BOLD);
                        textView5.setGravity(17);
                        textView5.setPadding(0, (int) TypedValue.applyDimension(1, 10, seriesDetailActivity.getResources().getDisplayMetrics()), 0, 0);
                        textView5.setLetterSpacing(0.02f);
                        linearLayout52.addView(textView5);
                    }
                    if (!jSONObject.isNull("vote_average")) {
                        double dOptDouble = jSONObject.optDouble("vote_average");
                        dValueOf = Double.valueOf(dOptDouble);
                        if (dOptDouble <= 0.0d) {
                        }
                        linearLayoutM1450j = C0672j.m1450j(seriesDetailActivity, dValueOf, AbstractC2702z0.f9816f, str7);
                        if (linearLayoutM1450j != null) {
                            linearLayout52.addView(linearLayoutM1450j);
                        }
                        linearLayout = seriesDetailActivity.f3004H;
                        if (linearLayout == null) {
                            AbstractC2980h.m5139h("content");
                            throw null;
                        }
                        linearLayout.addView(linearLayout52);
                        String strOptString17 = jSONObject.optString("overview");
                        AbstractC2980h.m5135d("optString(...)", strOptString17);
                        String strM1739z4 = SeriesDetailActivity.m1739z(strOptString17);
                        if (strM1739z4 != null) {
                            LinearLayout linearLayout7 = seriesDetailActivity.f3004H;
                            if (linearLayout7 == null) {
                                AbstractC2980h.m5139h("content");
                                throw null;
                            }
                            linearLayout7.addView(c0672j.m1453h(seriesDetailActivity, strM1739z4), new LinearLayout.LayoutParams(i11, i12));
                        }
                        LinearLayout linearLayout8 = seriesDetailActivity.f3004H;
                        if (linearLayout8 == null) {
                            AbstractC2980h.m5139h("content");
                            throw null;
                        }
                        int i19 = AbstractC2702z0.f9817g;
                        linearLayout8.addView(C0672j.m1451k(seriesDetailActivity, "Seasons", 15.0f, i19, seriesDetailActivity.m1744t(), 0, 192), SeriesDetailActivity.m1738x(seriesDetailActivity, 0, 0, 0, 0, 0, 63));
                        C0672j.m1445d(seriesDetailActivity, 4);
                        LinearLayout linearLayout9 = new LinearLayout(seriesDetailActivity);
                        linearLayout9.setOrientation(0);
                        linearLayout9.setGravity(16);
                        linearLayout9.setPadding(C0672j.m1445d(seriesDetailActivity, 15), 0, C0672j.m1445d(seriesDetailActivity, 15), 0);
                        seriesDetailActivity.f3007K = linearLayout9;
                        LinearLayout linearLayout10 = seriesDetailActivity.f3004H;
                        if (linearLayout10 == null) {
                            AbstractC2980h.m5139h("content");
                            throw null;
                        }
                        C0677l0 c0677l0 = new C0677l0(seriesDetailActivity, !seriesDetailActivity.m1745u() ? 0 : ((int) Math.ceil((((((int) TypedValue.applyDimension(1, 4, seriesDetailActivity.getResources().getDisplayMetrics())) / 2) * 2) + ((int) ((((int) (seriesDetailActivity.getResources().getDisplayMetrics().heightPixels * 0.28f)) * 2.0f) / 3.0f))) * 0.029999971f)) + 4);
                        c0677l0.setHorizontalScrollBarEnabled(false);
                        c0677l0.setClipToPadding(false);
                        c0677l0.setClipChildren(false);
                        c0677l0.setPadding(0, C0672j.m1445d(seriesDetailActivity, 8), 0, seriesDetailActivity.m1745u() ? C0672j.m1445d(seriesDetailActivity, 12) : 0);
                        LinearLayout linearLayout11 = seriesDetailActivity.f3007K;
                        if (linearLayout11 == null) {
                            AbstractC2980h.m5139h("seasonStrip");
                            throw null;
                        }
                        linearLayout11.setClipChildren(false);
                        LinearLayout linearLayout12 = seriesDetailActivity.f3007K;
                        if (linearLayout12 == null) {
                            AbstractC2980h.m5139h("seasonStrip");
                            throw null;
                        }
                        linearLayout12.setClipToPadding(false);
                        LinearLayout linearLayout13 = seriesDetailActivity.f3007K;
                        if (linearLayout13 == null) {
                            AbstractC2980h.m5139h("seasonStrip");
                            throw null;
                        }
                        c0677l0.addView(linearLayout13);
                        linearLayout10.addView(c0677l0, SeriesDetailActivity.m1738x(seriesDetailActivity, 8, 4, 0, 0, 0, 60));
                        seriesDetailActivity.m1742D();
                        if (seriesDetailActivity.m1745u() && (linearLayout2 = seriesDetailActivity.f3011O) != null) {
                            linearLayout2.post(new RunnableC0127c0(22, seriesDetailActivity));
                        }
                        String string3 = seriesDetailActivity.getString(com.exotv.net.R.string.section_episodes_season, SeriesDetailActivity.m1736A(seriesDetailActivity.f3027e0));
                        AbstractC2980h.m5135d("getString(...)", string3);
                        seriesDetailActivity.f3020X = C0672j.m1451k(seriesDetailActivity, string3, 15.0f, i19, seriesDetailActivity.m1744t(), 0, 192);
                        LinearLayout linearLayout14 = seriesDetailActivity.f3004H;
                        if (linearLayout14 == null) {
                            AbstractC2980h.m5139h("content");
                            throw null;
                        }
                        LinearLayout linearLayout15 = seriesDetailActivity.f3020X;
                        if (linearLayout15 == null) {
                            AbstractC2980h.m5139h("episodesHeading");
                            throw null;
                        }
                        linearLayout14.addView(linearLayout15, SeriesDetailActivity.m1738x(seriesDetailActivity, 0, 0, 0, 0, 0, 63));
                        LinearLayout linearLayout16 = seriesDetailActivity.f3020X;
                        if (linearLayout16 == null) {
                            AbstractC2980h.m5139h("episodesHeading");
                            throw null;
                        }
                        View childAt = linearLayout16.getChildAt(linearLayout16.getChildCount() - 1);
                        AbstractC2980h.m5134c("null cannot be cast to non-null type android.widget.TextView", childAt);
                        seriesDetailActivity.f3021Y = (TextView) childAt;
                        LinearLayout linearLayout17 = new LinearLayout(seriesDetailActivity);
                        linearLayout17.setOrientation(1);
                        linearLayout17.setClipChildren(false);
                        linearLayout17.setClipToPadding(false);
                        linearLayout17.setPadding(seriesDetailActivity.m1744t(), C0672j.m1445d(seriesDetailActivity, 8), seriesDetailActivity.m1744t(), 0);
                        seriesDetailActivity.f3008L = linearLayout17;
                        LinearLayout linearLayout18 = seriesDetailActivity.f3004H;
                        if (linearLayout18 == null) {
                            AbstractC2980h.m5139h("content");
                            throw null;
                        }
                        LinearLayout linearLayout19 = seriesDetailActivity.f3008L;
                        if (linearLayout19 == null) {
                            AbstractC2980h.m5139h("episodeBox");
                            throw null;
                        }
                        linearLayout18.addView(linearLayout19, SeriesDetailActivity.m1738x(seriesDetailActivity, 12, 0, 0, 0, 0, 62));
                        seriesDetailActivity.m1746v(seriesDetailActivity.f3027e0);
                        this.f2689p = null;
                        this.f2688o = 3;
                        break;
                    }
                    dValueOf = null;
                    linearLayoutM1450j = C0672j.m1450j(seriesDetailActivity, dValueOf, AbstractC2702z0.f9816f, str7);
                    if (linearLayoutM1450j != null) {
                    }
                    linearLayout = seriesDetailActivity.f3004H;
                    if (linearLayout == null) {
                    }
                }
                jSONObject = (JSONObject) objM2857r;
                String strOptString18 = jSONObject.optString("name");
                if (strOptString18.length() == 0) {
                    strOptString18 = jSONObject.optString("original_name");
                }
                if (strOptString18.length() == 0) {
                    strOptString18 = seriesDetailActivity.f3025c0;
                }
                seriesDetailActivity.f3025c0 = strOptString18;
                ArrayList arrayList7 = new ArrayList();
                JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("seasons");
                if (jSONArrayOptJSONArray5 != null) {
                    int length2 = jSONArrayOptJSONArray5.length();
                    str6 = "status";
                    int i20 = 0;
                    while (i20 < length2) {
                        int i21 = length2;
                        JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray5.optJSONObject(i20);
                        if (jSONObjectOptJSONObject6 == null) {
                            jSONArray = jSONArrayOptJSONArray5;
                        } else {
                            jSONArray = jSONArrayOptJSONArray5;
                            int iOptInt4 = jSONObjectOptJSONObject6.optInt("season_number");
                            if (iOptInt4 > 0) {
                                String strOptString19 = jSONObjectOptJSONObject6.optString("name");
                                AbstractC2980h.m5135d("optString(...)", strOptString19);
                                int iOptInt5 = jSONObjectOptJSONObject6.optInt("episode_count");
                                String strOptString20 = jSONObjectOptJSONObject6.optString("poster_path");
                                AbstractC2980h.m5133b(strOptString20);
                                String str21 = (strOptString20.length() <= 0 || strOptString20.equals("null")) ? null : strOptString20;
                                String strOptString21 = jSONObjectOptJSONObject6.optString("air_date");
                                AbstractC2980h.m5133b(strOptString21);
                                arrayList7.add(new C2651b1(iOptInt4, iOptInt5, strOptString19, str21, strOptString21.length() > 0 ? strOptString21 : null));
                            }
                        }
                        i20++;
                        length2 = i21;
                        jSONArrayOptJSONArray5 = jSONArray;
                    }
                } else {
                    str6 = "status";
                }
                boolean zIsEmpty = arrayList7.isEmpty();
                ArrayList arrayListM1551T = arrayList7;
                if (zIsEmpty) {
                    arrayListM1551T = AbstractC0715d.m1551T(new C2651b1(24));
                }
                seriesDetailActivity.f3026d0 = arrayListM1551T;
                seriesDetailActivity.f3027e0 = ((C2651b1) AbstractC1913h.m3736A0(arrayListM1551T)).f9651a;
                TextView textView6 = seriesDetailActivity.f3005I;
                if (textView6 == null) {
                    AbstractC2980h.m5139h(str6);
                    throw null;
                }
                textView6.setText(C2181z.FRAGMENT_ENCODE_SET);
                TextView textView7 = seriesDetailActivity.f3005I;
                if (textView7 == null) {
                    AbstractC2980h.m5139h(str6);
                    throw null;
                }
                textView7.setVisibility(8);
                LinearLayout linearLayout20 = seriesDetailActivity.f3004H;
                if (linearLayout20 == null) {
                    AbstractC2980h.m5139h("content");
                    throw null;
                }
                linearLayout20.removeAllViews();
                seriesDetailActivity.f3010N.clear();
                seriesDetailActivity.f3013Q = null;
                try {
                    C2945g0 c2945g0 = C2945g0.f10965a;
                    String strValueOf2 = String.valueOf(seriesDetailActivity.f3024b0);
                    this.f2689p = jSONObject;
                    this.f2688o = 2;
                    objM5110m = c2945g0.m5110m(strValueOf2, this);
                } catch (Exception e11) {
                    e = e11;
                    Log.w("SeriesDetailActivity", "quality lookup failed", e);
                    str7 = null;
                    String strOptString1322 = jSONObject.optString("backdrop_path");
                    AbstractC2980h.m5135d("optString(...)", strOptString1322);
                    strM1739z = SeriesDetailActivity.m1739z(strOptString1322);
                    if (strM1739z == null) {
                    }
                    int i1522 = (int) (seriesDetailActivity.getResources().getDisplayMetrics().heightPixels * (!seriesDetailActivity.m1745u() ? 0.52f : 0.42f));
                    int i1622 = (int) (i1522 * 0.55f);
                    FrameLayout frameLayout22 = new FrameLayout(seriesDetailActivity);
                    if (strM1739z != null) {
                    }
                    TextView textView322 = new TextView(seriesDetailActivity);
                    textView322.setText(seriesDetailActivity.f3025c0);
                    textView322.setTextColor(-1);
                    textView322.setTextSize(26.0f);
                    Typeface typeface22 = Typeface.DEFAULT_BOLD;
                    textView322.setTypeface(typeface22);
                    textView322.setLetterSpacing(0.08f);
                    textView322.setGravity(17);
                    str8 = strM1739z;
                    textView322.setShadowLayer(C0672j.m1445d(seriesDetailActivity, 4), 0.0f, C0672j.m1445d(seriesDetailActivity, 1), -16777216);
                    if (str8 != null) {
                    }
                    LinearLayout linearLayout522 = new LinearLayout(seriesDetailActivity);
                    linearLayout522.setOrientation(1);
                    linearLayout522.setPadding(0, C0672j.m1445d(seriesDetailActivity, 2) + (str8 != null ? seriesDetailActivity.f3022Z : 0), 0, 0);
                    if (str8 == null) {
                    }
                    arrayList = new ArrayList();
                    String strOptString1422 = jSONObject.optString(str6);
                    AbstractC2980h.m5135d("optString(...)", strOptString1422);
                    strM1739z2 = SeriesDetailActivity.m1739z(strOptString1422);
                    if (strM1739z2 != null) {
                    }
                    String strOptString1522 = jSONObject.optString("first_air_date");
                    AbstractC2980h.m5135d("optString(...)", strOptString1522);
                    strM2644R0 = AbstractC1206h.m2644R0(4, strOptString1522);
                    if (strM2644R0.length() != 4) {
                    }
                    if (strM2644R0 != null) {
                    }
                    iOptInt = jSONObject.optInt("number_of_seasons");
                    if (iOptInt > 0) {
                    }
                    iOptInt2 = jSONObject.optInt("number_of_episodes");
                    if (iOptInt2 > 0) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    arrayList2 = new ArrayList();
                    jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str5);
                    if (jSONArrayOptJSONArray2 != null) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    if (!jSONObject.isNull("vote_average")) {
                    }
                    dValueOf = null;
                    linearLayoutM1450j = C0672j.m1450j(seriesDetailActivity, dValueOf, AbstractC2702z0.f9816f, str7);
                    if (linearLayoutM1450j != null) {
                    }
                    linearLayout = seriesDetailActivity.f3004H;
                    if (linearLayout == null) {
                    }
                }
                if (objM5110m == enumC2273a5) {
                    return enumC2273a5;
                }
                str7 = (String) objM5110m;
                String strOptString13222 = jSONObject.optString("backdrop_path");
                AbstractC2980h.m5135d("optString(...)", strOptString13222);
                strM1739z = SeriesDetailActivity.m1739z(strOptString13222);
                if (strM1739z == null) {
                }
                int i15222 = (int) (seriesDetailActivity.getResources().getDisplayMetrics().heightPixels * (!seriesDetailActivity.m1745u() ? 0.52f : 0.42f));
                int i16222 = (int) (i15222 * 0.55f);
                FrameLayout frameLayout222 = new FrameLayout(seriesDetailActivity);
                if (strM1739z != null) {
                }
                TextView textView3222 = new TextView(seriesDetailActivity);
                textView3222.setText(seriesDetailActivity.f3025c0);
                textView3222.setTextColor(-1);
                textView3222.setTextSize(26.0f);
                Typeface typeface222 = Typeface.DEFAULT_BOLD;
                textView3222.setTypeface(typeface222);
                textView3222.setLetterSpacing(0.08f);
                textView3222.setGravity(17);
                str8 = strM1739z;
                textView3222.setShadowLayer(C0672j.m1445d(seriesDetailActivity, 4), 0.0f, C0672j.m1445d(seriesDetailActivity, 1), -16777216);
                if (str8 != null) {
                }
                LinearLayout linearLayout5222 = new LinearLayout(seriesDetailActivity);
                linearLayout5222.setOrientation(1);
                linearLayout5222.setPadding(0, C0672j.m1445d(seriesDetailActivity, 2) + (str8 != null ? seriesDetailActivity.f3022Z : 0), 0, 0);
                if (str8 == null) {
                }
                arrayList = new ArrayList();
                String strOptString14222 = jSONObject.optString(str6);
                AbstractC2980h.m5135d("optString(...)", strOptString14222);
                strM1739z2 = SeriesDetailActivity.m1739z(strOptString14222);
                if (strM1739z2 != null) {
                }
                String strOptString15222 = jSONObject.optString("first_air_date");
                AbstractC2980h.m5135d("optString(...)", strOptString15222);
                strM2644R0 = AbstractC1206h.m2644R0(4, strOptString15222);
                if (strM2644R0.length() != 4) {
                }
                if (strM2644R0 != null) {
                }
                iOptInt = jSONObject.optInt("number_of_seasons");
                if (iOptInt > 0) {
                }
                iOptInt2 = jSONObject.optInt("number_of_episodes");
                if (iOptInt2 > 0) {
                }
                if (!arrayList.isEmpty()) {
                }
                arrayList2 = new ArrayList();
                jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str5);
                if (jSONArrayOptJSONArray2 != null) {
                }
                if (!arrayList2.isEmpty()) {
                }
                if (!jSONObject.isNull("vote_average")) {
                }
                dValueOf = null;
                linearLayoutM1450j = C0672j.m1450j(seriesDetailActivity, dValueOf, AbstractC2702z0.f9816f, str7);
                if (linearLayoutM1450j != null) {
                }
                linearLayout = seriesDetailActivity.f3004H;
                if (linearLayout == null) {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0687q0(Object obj, Object obj2, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f2687n = i;
        this.f2689p = obj;
        this.f2690q = obj2;
    }
}
