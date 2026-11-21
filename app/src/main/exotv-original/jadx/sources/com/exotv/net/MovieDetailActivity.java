package com.exotv.net;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0147m0;
import androidx.media3.exoplayer.analytics.C0279a;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MovieDetailActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p017b6.ViewOnClickListenerC0591a;
import p024c5.AbstractC0704z;
import p024c5.C0672j;
import p024c5.C0687q0;
import p024c5.C0689r0;
import p062h.AbstractActivityC1083i;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p102l6.C1690g;
import p102l6.C1693j;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p195w4.C2647a0;
import p195w4.C2656d0;
import p195w4.C2659e0;
import p204x4.C2769l;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MovieDetailActivity extends AbstractActivityC1083i {

    /* renamed from: Y */
    public static final /* synthetic */ int f2918Y = 0;

    /* renamed from: H */
    public C1278a0 f2919H;

    /* renamed from: I */
    public long f2920I;

    /* renamed from: J */
    public LinearLayout f2921J;

    /* renamed from: K */
    public ScrollView f2922K;

    /* renamed from: L */
    public FrameLayout f2923L;

    /* renamed from: M */
    public TextView f2924M;

    /* renamed from: N */
    public LinearLayout f2925N;

    /* renamed from: P */
    public TextView f2927P;

    /* renamed from: Q */
    public ProgressBar f2928Q;

    /* renamed from: R */
    public TextView f2929R;

    /* renamed from: S */
    public boolean f2930S;

    /* renamed from: T */
    public boolean f2931T;

    /* renamed from: U */
    public int f2932U;

    /* renamed from: O */
    public final ArrayList f2926O = new ArrayList();

    /* renamed from: V */
    public final C1690g f2933V = new C1690g(new C2647a0(this, 0));

    /* renamed from: W */
    public final int f2934W = -1;

    /* renamed from: X */
    public final int f2935X = -2;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1699r(MovieDetailActivity movieDetailActivity, long j, AbstractC2320c abstractC2320c) throws Throwable {
        C2656d0 c2656d0;
        MovieDetailActivity movieDetailActivity2 = movieDetailActivity;
        if (abstractC2320c instanceof C2656d0) {
            c2656d0 = (C2656d0) abstractC2320c;
            int i = c2656d0.f9668p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2656d0.f9668p = i - Integer.MIN_VALUE;
            } else {
                c2656d0 = new C2656d0(movieDetailActivity2, abstractC2320c);
            }
        }
        Object objM2857r = c2656d0.f9666n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2656d0.f9668p;
        final int i8 = 1;
        C1693j c1693j = C1693j.f6497a;
        try {
            if (i4 == 0) {
                AbstractC0714c.m1516d0(objM2857r);
                C2054e c2054e = AbstractC1290e0.f5316a;
                ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                C2659e0 c2659e0 = new C2659e0(j, null);
                c2656d0.f9665m = movieDetailActivity2;
                c2656d0.f9668p = 1;
                objM2857r = AbstractC1339x.m2857r(executorC2053d, c2659e0, c2656d0);
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                movieDetailActivity2 = c2656d0.f9665m;
                AbstractC0714c.m1516d0(objM2857r);
            }
            final MovieDetailActivity movieDetailActivity3 = movieDetailActivity2;
            List list = (List) objM2857r;
            if (!list.isEmpty()) {
                LinearLayout linearLayout = movieDetailActivity3.f2921J;
                if (linearLayout == null) {
                    AbstractC2980h.m5139h("body");
                    throw null;
                }
                C0689r0 c0689r0 = C0689r0.f2694a;
                String string = movieDetailActivity3.getString(R.string.section_similar);
                AbstractC2980h.m5135d("getString(...)", string);
                final int i9 = 0;
                linearLayout.addView(C0689r0.m1465f(movieDetailActivity3, string, list, new InterfaceC2851l(movieDetailActivity3) { // from class: w4.c0

                    /* renamed from: k */
                    public final /* synthetic */ MovieDetailActivity f9659k;

                    {
                        this.f9659k = movieDetailActivity3;
                    }

                    @Override // p212y6.InterfaceC2851l
                    public final Object invoke(Object obj) {
                        int i10 = i9;
                        C1693j c1693j2 = C1693j.f6497a;
                        MovieDetailActivity movieDetailActivity4 = this.f9659k;
                        C2769l c2769l = (C2769l) obj;
                        switch (i10) {
                            case 0:
                                int i11 = MovieDetailActivity.f2918Y;
                                AbstractC2980h.m5136e("it", c2769l);
                                movieDetailActivity4.getClass();
                                movieDetailActivity4.startActivity(new Intent(movieDetailActivity4, (Class<?>) MovieDetailActivity.class).addFlags(603979776).putExtra("movie_id", c2769l.f10241a).putExtra("movie_title", c2769l.f10242b));
                                break;
                            default:
                                int i12 = MovieDetailActivity.f2918Y;
                                AbstractC2980h.m5136e("it", c2769l);
                                C0672j.m1452l(movieDetailActivity4, String.valueOf(c2769l.f10241a), c2769l.f10242b, null, 120);
                                break;
                        }
                        return c1693j2;
                    }
                }, new InterfaceC2851l(movieDetailActivity3) { // from class: w4.c0

                    /* renamed from: k */
                    public final /* synthetic */ MovieDetailActivity f9659k;

                    {
                        this.f9659k = movieDetailActivity3;
                    }

                    @Override // p212y6.InterfaceC2851l
                    public final Object invoke(Object obj) {
                        int i10 = i8;
                        C1693j c1693j2 = C1693j.f6497a;
                        MovieDetailActivity movieDetailActivity4 = this.f9659k;
                        C2769l c2769l = (C2769l) obj;
                        switch (i10) {
                            case 0:
                                int i11 = MovieDetailActivity.f2918Y;
                                AbstractC2980h.m5136e("it", c2769l);
                                movieDetailActivity4.getClass();
                                movieDetailActivity4.startActivity(new Intent(movieDetailActivity4, (Class<?>) MovieDetailActivity.class).addFlags(603979776).putExtra("movie_id", c2769l.f10241a).putExtra("movie_title", c2769l.f10242b));
                                break;
                            default:
                                int i12 = MovieDetailActivity.f2918Y;
                                AbstractC2980h.m5136e("it", c2769l);
                                C0672j.m1452l(movieDetailActivity4, String.valueOf(c2769l.f10241a), c2769l.f10242b, null, 120);
                                break;
                        }
                        return c1693j2;
                    }
                }, null, movieDetailActivity3.f2926O, null, null, 1608));
                return c1693j;
            }
        } catch (Exception unused) {
        }
        return c1693j;
    }

    @Override // p062h.AbstractActivityC1083i, p010b.AbstractActivityC0522l, p011b0.AbstractActivityC0539e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.rotationAnimation = 2;
        window.setAttributes(attributes);
        C0672j c0672j = C0672j.f2641a;
        C0672j.m1442a(this);
        C0672j.m1448g(this);
        this.f2920I = getIntent().getLongExtra("movie_id", 0L);
        FrameLayout frameLayout = new FrameLayout(this);
        int i = AbstractC0704z.f2752b;
        frameLayout.setBackgroundColor(i);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, m1700s(20));
        this.f2921J = linearLayout;
        ScrollView scrollView = new ScrollView(this);
        scrollView.setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout2 = this.f2921J;
        if (linearLayout2 == null) {
            AbstractC2980h.m5139h("body");
            throw null;
        }
        scrollView.addView(linearLayout2);
        this.f2922K = scrollView;
        int i4 = this.f2934W;
        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(i4, i4));
        TextView textView = new TextView(this);
        textView.setId(View.generateViewId());
        textView.setText("\u2039");
        textView.setTextSize(30.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setContentDescription(getString(R.string.action_back));
        textView.setBackground(C0672j.m1449i(Color.argb(102, 0, 0, 0), 22, 0, 0));
        textView.setMinimumWidth(m1700s(44));
        textView.setMinimumHeight(m1700s(44));
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0591a(10, this));
        C0672j.m1447f(c0672j, this, textView, 22, null, null, null, 484);
        this.f2924M = textView;
        int i8 = this.f2935X;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i8);
        layoutParams.gravity = 8388659;
        layoutParams.setMarginStart(m1700s(8));
        layoutParams.topMargin = m1700s(8);
        frameLayout.addView(textView, layoutParams);
        View view = new View(this);
        view.setBackgroundColor(i);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, 0);
        layoutParams2.gravity = 80;
        frameLayout.addView(view, layoutParams2);
        C0279a c0279a = new C0279a(this, 13, view);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1804e0.m3538j(frameLayout, c0279a);
        setContentView(frameLayout);
        m1702u();
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onDestroy() {
        C1278a0 c1278a0 = this.f2919H;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        super.onDestroy();
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC2980h.m5136e("intent", intent);
        super.onNewIntent(intent);
        setIntent(intent);
        C1278a0 c1278a0 = this.f2919H;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        this.f2920I = intent.getLongExtra("movie_id", 0L);
        m1702u();
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f2930S) {
            m1703v(false);
        }
    }

    /* renamed from: s */
    public final int m1700s(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* renamed from: t */
    public final boolean m1701t() {
        return ((Boolean) this.f2933V.getValue()).booleanValue();
    }

    /* renamed from: u */
    public final void m1702u() {
        if (this.f2930S) {
            m1703v(false);
        }
        this.f2931T = false;
        LinearLayout linearLayout = this.f2921J;
        InterfaceC2222c interfaceC2222c = null;
        if (linearLayout == null) {
            AbstractC2980h.m5139h("body");
            throw null;
        }
        linearLayout.removeAllViews();
        this.f2926O.clear();
        LinearLayout linearLayout2 = this.f2921J;
        if (linearLayout2 == null) {
            AbstractC2980h.m5139h("body");
            throw null;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        ProgressBar progressBar = new ProgressBar(this);
        int i = this.f2935X;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(this.f2934W, ((int) (getResources().getDisplayMetrics().heightPixels * (m1701t() ? 0.52f : 0.42f))) + this.f2932U));
        this.f2919H = AbstractC1339x.m2850k(AbstractC0147m0.m566e(this), null, new C0687q0(this, interfaceC2222c, 3), 3);
    }

    /* renamed from: v */
    public final void m1703v(boolean z7) {
        Log.i("MovieDetailActivity", "play pending=" + z7 + " (unavailable=" + this.f2931T + ")");
        this.f2930S = z7;
        boolean z8 = (z7 || this.f2931T) ? false : true;
        LinearLayout linearLayout = this.f2925N;
        if (linearLayout == null) {
            AbstractC2980h.m5139h("playAction");
            throw null;
        }
        linearLayout.setEnabled(z8);
        LinearLayout linearLayout2 = this.f2925N;
        if (linearLayout2 == null) {
            AbstractC2980h.m5139h("playAction");
            throw null;
        }
        linearLayout2.setClickable(z8);
        LinearLayout linearLayout3 = this.f2925N;
        if (linearLayout3 == null) {
            AbstractC2980h.m5139h("playAction");
            throw null;
        }
        linearLayout3.setFocusable(z8);
        TextView textView = this.f2927P;
        if (textView != null) {
            textView.setVisibility((z7 || this.f2931T) ? 8 : 0);
        }
        ProgressBar progressBar = this.f2928Q;
        if (progressBar != null) {
            progressBar.setVisibility((!z7 || this.f2931T) ? 8 : 0);
        }
    }
}
