package com.exotv.net;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0147m0;
import androidx.media3.exoplayer.source.C0447i;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.exotv.net.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p017b6.ViewOnClickListenerC0591a;
import p024c5.AbstractC0704z;
import p024c5.C0672j;
import p024c5.C0687q0;
import p024c5.C0689r0;
import p024c5.ViewOnClickListenerC0663f1;
import p024c5.ViewOnClickListenerC0674k;
import p024c5.ViewOnKeyListenerC0686q;
import p044e7.C0926c;
import p062h.AbstractActivityC1083i;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p102l6.C1687d;
import p102l6.C1690g;
import p102l6.C1691h;
import p102l6.C1693j;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.C1921p;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p193w2.ViewOnClickListenerC2625m;
import p195w4.AbstractC2702z0;
import p195w4.C2648a1;
import p195w4.C2651b1;
import p195w4.C2654c1;
import p195w4.C2657d1;
import p195w4.C2660e1;
import p195w4.C2688s0;
import p195w4.C2690t0;
import p195w4.ViewOnKeyListenerC2694v0;
import p195w4.ViewTreeObserverOnGlobalFocusChangeListenerC2672k0;
import p204x4.C2769l;
import p212y6.InterfaceC2840a;
import p218z4.C2945g0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SeriesDetailActivity extends AbstractActivityC1083i {

    /* renamed from: k0 */
    public static final /* synthetic */ int f3003k0 = 0;

    /* renamed from: H */
    public LinearLayout f3004H;

    /* renamed from: I */
    public TextView f3005I;

    /* renamed from: J */
    public ScrollView f3006J;

    /* renamed from: K */
    public LinearLayout f3007K;

    /* renamed from: L */
    public LinearLayout f3008L;

    /* renamed from: M */
    public TextView f3009M;

    /* renamed from: O */
    public LinearLayout f3011O;

    /* renamed from: P */
    public TextView f3012P;

    /* renamed from: Q */
    public View f3013Q;

    /* renamed from: R */
    public boolean f3014R;

    /* renamed from: S */
    public String f3015S;

    /* renamed from: T */
    public Integer f3016T;

    /* renamed from: U */
    public TextView f3017U;

    /* renamed from: V */
    public ProgressBar f3018V;

    /* renamed from: W */
    public boolean f3019W;

    /* renamed from: X */
    public LinearLayout f3020X;

    /* renamed from: Y */
    public TextView f3021Y;

    /* renamed from: Z */
    public int f3022Z;

    /* renamed from: b0 */
    public long f3024b0;

    /* renamed from: f0 */
    public C1278a0 f3028f0;

    /* renamed from: N */
    public final ArrayList f3010N = new ArrayList();

    /* renamed from: a0 */
    public final C1690g f3023a0 = new C1690g(new C2688s0(0, this));

    /* renamed from: c0 */
    public String f3025c0 = C2181z.FRAGMENT_ENCODE_SET;

    /* renamed from: d0 */
    public List f3026d0 = AbstractC0715d.m1551T(new C2651b1(30));

    /* renamed from: e0 */
    public int f3027e0 = 1;

    /* renamed from: g0 */
    public List f3029g0 = C1921p.f7187j;

    /* renamed from: h0 */
    public int f3030h0 = 1;

    /* renamed from: i0 */
    public final int f3031i0 = -1;

    /* renamed from: j0 */
    public final int f3032j0 = -2;

    /* renamed from: A */
    public static String m1736A(int i) {
        return i < 10 ? AbstractC0008a1.m12h(i, "0") : String.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1737r(SeriesDetailActivity seriesDetailActivity, AbstractC2320c abstractC2320c) throws Throwable {
        C2660e1 c2660e1;
        SeriesDetailActivity seriesDetailActivity2 = seriesDetailActivity;
        if (abstractC2320c instanceof C2660e1) {
            c2660e1 = (C2660e1) abstractC2320c;
            int i = c2660e1.f9680p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2660e1.f9680p = i - Integer.MIN_VALUE;
            } else {
                c2660e1 = new C2660e1(seriesDetailActivity2, abstractC2320c);
            }
        }
        Object objM2857r = c2660e1.f9678n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2660e1.f9680p;
        InterfaceC2222c interfaceC2222c = null;
        int i8 = 1;
        C1693j c1693j = C1693j.f6497a;
        try {
            if (i4 == 0) {
                AbstractC0714c.m1516d0(objM2857r);
                c2660e1.f9677m = seriesDetailActivity2;
                c2660e1.f9680p = 1;
                C2054e c2054e = AbstractC1290e0.f5316a;
                objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2657d1(seriesDetailActivity2, interfaceC2222c, i8), c2660e1);
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                seriesDetailActivity2 = c2660e1.f9677m;
                AbstractC0714c.m1516d0(objM2857r);
            }
            SeriesDetailActivity seriesDetailActivity3 = seriesDetailActivity2;
            List list = (List) objM2857r;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C2769l) obj).f10241a != seriesDetailActivity3.f3024b0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                LinearLayout linearLayout = seriesDetailActivity3.f3004H;
                if (linearLayout == null) {
                    AbstractC2980h.m5139h("content");
                    throw null;
                }
                C0689r0 c0689r0 = C0689r0.f2694a;
                String string = seriesDetailActivity3.getString(R.string.section_similar_series);
                AbstractC2980h.m5135d("getString(...)", string);
                linearLayout.addView(C0689r0.m1465f(seriesDetailActivity3, string, arrayList, new C2690t0(1, seriesDetailActivity3), null, null, null, new C2688s0(1, seriesDetailActivity3), new C2690t0(0, seriesDetailActivity3), 360), m1738x(seriesDetailActivity3, 16, 0, 0, 0, 0, 62));
                return c1693j;
            }
        } catch (Exception unused) {
        }
        return c1693j;
    }

    /* renamed from: x */
    public static LinearLayout.LayoutParams m1738x(SeriesDetailActivity seriesDetailActivity, int i, int i4, int i8, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i4 = 0;
        }
        if ((i11 & 4) != 0) {
            i8 = seriesDetailActivity.f3031i0;
        }
        int i12 = seriesDetailActivity.f3032j0;
        if ((i11 & 16) != 0) {
            i9 = 0;
        }
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i8, i12);
        layoutParams.topMargin = C0672j.m1445d(seriesDetailActivity, i);
        layoutParams.bottomMargin = C0672j.m1445d(seriesDetailActivity, i4);
        layoutParams.leftMargin = C0672j.m1445d(seriesDetailActivity, i9);
        layoutParams.rightMargin = C0672j.m1445d(seriesDetailActivity, i10);
        return layoutParams;
    }

    /* renamed from: z */
    public static String m1739z(String str) {
        if (AbstractC1206h.m2630D0(str) || str.equals("null")) {
            return null;
        }
        return str;
    }

    /* renamed from: B */
    public final TextView m1740B(String str, InterfaceC2840a interfaceC2840a) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(26.0f);
        textView.setGravity(17);
        textView.setTextColor(AbstractC2702z0.f9818h);
        C0672j.m1447f(C0672j.f2641a, this, textView, 16, null, null, null, 484);
        textView.setPadding(C0672j.m1445d(this, 20), C0672j.m1445d(this, 18), C0672j.m1445d(this, 20), C0672j.m1445d(this, 18));
        textView.setOnClickListener(new ViewOnClickListenerC0663f1(this, str, interfaceC2840a, 1));
        textView.setOnKeyListener(new ViewOnKeyListenerC2694v0(2, this));
        return textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f8  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1741C() {
        C0926c c0926cM1521g0;
        int i;
        C1691h c1691h;
        int i4;
        int i8;
        View viewM1740B;
        float f8;
        TextView textView;
        View viewM1740B2;
        int i9;
        int i10;
        C2648a1 c2648a1;
        C0926c c0926c;
        C0672j c0672j;
        ViewGroup viewGroup;
        C0672j c0672j2;
        C2648a1 c2648a12;
        FrameLayout frameLayout;
        String str;
        ImageView imageView;
        String strConcat;
        int i11;
        int i12;
        final SeriesDetailActivity seriesDetailActivity = this;
        C0672j c0672j3 = C0672j.f2641a;
        LinearLayout linearLayout = seriesDetailActivity.f3008L;
        String str2 = "episodeBox";
        if (linearLayout == null) {
            AbstractC2980h.m5139h("episodeBox");
            throw null;
        }
        linearLayout.removeAllViews();
        ArrayList arrayList = seriesDetailActivity.f3010N;
        arrayList.clear();
        seriesDetailActivity.f3012P = null;
        if (seriesDetailActivity.f3029g0.isEmpty()) {
            LinearLayout linearLayout2 = seriesDetailActivity.f3008L;
            if (linearLayout2 == null) {
                AbstractC2980h.m5139h("episodeBox");
                throw null;
            }
            linearLayout2.addView(seriesDetailActivity.m1748y("No episodes listed for season " + seriesDetailActivity.f3027e0), m1738x(seriesDetailActivity, 0, 0, 0, 0, 0, 63));
            return;
        }
        int size = seriesDetailActivity.f3029g0.size();
        int i13 = 0;
        final int i14 = size <= 0 ? 0 : (size + 19) / 20;
        int iM1534t = i14 == 0 ? 1 : AbstractC0714c.m1534t(seriesDetailActivity.f3030h0, 1, i14);
        if (size <= 0) {
            c0926cM1521g0 = AbstractC0714c.m1521g0(0, 0);
        } else {
            int iM1534t2 = (AbstractC0714c.m1534t(iM1534t, 1, size <= 0 ? 0 : (size + 19) / 20) - 1) * 20;
            c0926cM1521g0 = AbstractC0714c.m1521g0(iM1534t2, Math.min(iM1534t2 + 20, size));
        }
        List list = seriesDetailActivity.f3029g0;
        int i15 = c0926cM1521g0.f3986j;
        int i16 = c0926cM1521g0.f3987k + 1;
        for (C2648a1 c2648a13 : list.subList(i15, i16)) {
            C2945g0 c2945g0 = C2945g0.f10965a;
            String str3 = c2648a13.f9641f;
            String str4 = c2648a13.f9640e;
            int i17 = c2648a13.f9636a;
            boolean zM5098e = C2945g0.m5098e(str3);
            C0926c c0926c2 = c0926cM1521g0;
            LinearLayout linearLayout3 = new LinearLayout(seriesDetailActivity);
            linearLayout3.setOrientation(i13);
            linearLayout3.setGravity(16);
            linearLayout3.setPadding(C0672j.m1445d(seriesDetailActivity, 10), C0672j.m1445d(seriesDetailActivity, 10), C0672j.m1445d(seriesDetailActivity, 14), C0672j.m1445d(seriesDetailActivity, 10));
            linearLayout3.setBackground(C0672j.m1449i(AbstractC2702z0.f9812b, 24, 1, AbstractC2702z0.f9815e));
            if (zM5098e) {
                linearLayout3.setAlpha(0.4f);
                c0672j = c0672j3;
                viewGroup = linearLayout3;
                c2648a1 = c2648a13;
                i9 = i17;
                i10 = i16;
                c0926c = c0926c2;
            } else {
                i9 = i17;
                i10 = i16;
                C0672j c0672j4 = c0672j3;
                SeriesDetailActivity seriesDetailActivity2 = seriesDetailActivity;
                c2648a1 = c2648a13;
                c0926c = c0926c2;
                C0672j.m1447f(c0672j4, seriesDetailActivity2, linearLayout3, 24, null, null, null, 500);
                c0672j = c0672j4;
                seriesDetailActivity = seriesDetailActivity2;
                viewGroup = linearLayout3;
                viewGroup.setOnKeyListener(new ViewOnKeyListenerC2694v0(1, seriesDetailActivity));
            }
            FrameLayout frameLayout2 = new FrameLayout(seriesDetailActivity);
            ImageView imageView2 = new ImageView(seriesDetailActivity);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setBackground(C0672j.m1449i(AbstractC2702z0.f9813c, 16, 0, 0));
            imageView2.setClipToOutline(true);
            imageView2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            int i18 = seriesDetailActivity.f3031i0;
            frameLayout2.addView(imageView2, new FrameLayout.LayoutParams(i18, i18));
            TextView textViewM1443b = C0672j.m1443b(seriesDetailActivity, m1736A(i9), AbstractC2702z0.f9814d, 6, 4);
            textViewM1443b.setGravity(17);
            int i19 = seriesDetailActivity.f3032j0;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i19, i19);
            layoutParams.gravity = 17;
            frameLayout2.addView(textViewM1443b, layoutParams);
            ProgressBar progressBar = new ProgressBar(seriesDetailActivity, null, android.R.attr.progressBarStyle);
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(-1));
            progressBar.setVisibility(8);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0672j.m1445d(seriesDetailActivity, 24), C0672j.m1445d(seriesDetailActivity, 24));
            layoutParams2.gravity = 17;
            frameLayout2.addView(progressBar, layoutParams2);
            if (zM5098e) {
                c0672j2 = c0672j;
                c2648a12 = c2648a1;
                frameLayout = frameLayout2;
                str = str2;
                imageView = imageView2;
            } else {
                c0672j2 = c0672j;
                c2648a12 = c2648a1;
                frameLayout = frameLayout2;
                str = str2;
                imageView = imageView2;
                seriesDetailActivity = this;
                viewGroup.setOnClickListener(new ViewOnClickListenerC2625m(this, c2648a12, textViewM1443b, progressBar, 1));
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C0672j.m1445d(seriesDetailActivity, 124), C0672j.m1445d(seriesDetailActivity, 70));
            layoutParams3.setMarginEnd(C0672j.m1445d(seriesDetailActivity, 12));
            viewGroup.addView(frameLayout, layoutParams3);
            String str5 = c2648a12.f9638c;
            if (str5 == null) {
                strConcat = null;
            } else {
                if (AbstractC1206h.m2630D0(str5) || str5.equals("null")) {
                    str5 = null;
                }
                if (str5 != null) {
                    strConcat = "https://image.tmdb.org/t/p/w342".concat(str5);
                }
            }
            if (strConcat != null) {
                ComponentCallbacks2C0713b.m1485b(seriesDetailActivity).m3884d(seriesDetailActivity).m1660m(strConcat).m1626u(imageView);
            }
            LinearLayout linearLayout4 = new LinearLayout(seriesDetailActivity);
            linearLayout4.setOrientation(1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("E" + m1736A(i9));
            int i20 = c2648a12.f9639d;
            if (i20 > 0) {
                arrayList2.add(i20 + " min");
            }
            TextView textView2 = new TextView(seriesDetailActivity);
            textView2.setText(AbstractC1913h.m3740E0(arrayList2, "  \u00b7  ", null, null, null, 62));
            textView2.setTextColor(AbstractC2702z0.f9816f);
            textView2.setTextSize(13.0f);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout4.addView(textView2);
            TextView textView3 = new TextView(seriesDetailActivity);
            textView3.setText(c2648a12.f9637b);
            textView3.setTextColor(AbstractC2702z0.f9817g);
            textView3.setTextSize(17.0f);
            textView3.setMaxLines(2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setLineSpacing(C0672j.m1445d(seriesDetailActivity, 2), 1.0f);
            textView3.setPadding(0, C0672j.m1445d(seriesDetailActivity, 3), 0, 0);
            linearLayout4.addView(textView3);
            if (AbstractC1206h.m2630D0(str4)) {
                i11 = 0;
            } else {
                TextView textView4 = new TextView(seriesDetailActivity);
                textView4.setText(str4);
                textView4.setTextColor(AbstractC2702z0.f9818h);
                textView4.setTextSize(14.0f);
                textView4.setMaxLines(2);
                textView4.setEllipsize(truncateAt);
                textView4.setLineSpacing(C0672j.m1445d(seriesDetailActivity, 2), 1.0f);
                i11 = 0;
                textView4.setPadding(0, C0672j.m1445d(seriesDetailActivity, 3), 0, 0);
                linearLayout4.addView(textView4);
            }
            viewGroup.addView(linearLayout4, new LinearLayout.LayoutParams(i11, i19, 1.0f));
            if (seriesDetailActivity.m1745u()) {
                int iCeil = (int) Math.ceil((((seriesDetailActivity.getResources().getDisplayMetrics().widthPixels / seriesDetailActivity.getResources().getDisplayMetrics().density) * 0.029999971f) + 2.0f) - seriesDetailActivity.m1744t());
                if (iCeil < 96) {
                    iCeil = 96;
                }
                i12 = iCeil;
            } else {
                i12 = 0;
            }
            LinearLayout linearLayout5 = seriesDetailActivity.f3008L;
            if (linearLayout5 == null) {
                AbstractC2980h.m5139h(str);
                throw null;
            }
            ViewGroup viewGroup2 = viewGroup;
            linearLayout5.addView(viewGroup2, m1738x(seriesDetailActivity, 0, 10, 0, i12, i12, 13));
            if (!zM5098e) {
                arrayList.add(viewGroup2);
            }
            c0926cM1521g0 = c0926c;
            str2 = str;
            c0672j3 = c0672j2;
            i16 = i10;
            i13 = 0;
        }
        C0672j c0672j5 = c0672j3;
        C0926c c0926c3 = c0926cM1521g0;
        int i21 = i16;
        String str6 = str2;
        if (seriesDetailActivity.f3014R) {
            View view = (View) AbstractC1913h.m3737B0(arrayList);
            if (view != null) {
                view.requestFocus();
            }
            i = 0;
            seriesDetailActivity.f3014R = false;
        } else {
            i = 0;
        }
        if (i14 > 1) {
            int i22 = c0926c3.f3986j;
            LinearLayout linearLayout6 = new LinearLayout(seriesDetailActivity);
            linearLayout6.setOrientation(i);
            linearLayout6.setGravity(17);
            linearLayout6.setPadding(0, (int) TypedValue.applyDimension(1, 12, seriesDetailActivity.getResources().getDisplayMetrics()), 0, (int) TypedValue.applyDimension(1, 8, seriesDetailActivity.getResources().getDisplayMetrics()));
            int i23 = size <= 0 ? 0 : (size + 19) / 20;
            if (i23 == 0) {
                c1691h = new C1691h(0, 0, 0);
            } else {
                int iM1534t3 = ((AbstractC0714c.m1534t(iM1534t, 1, i23) - 1) / 5) * 5;
                c1691h = new C1691h(Integer.valueOf(iM1534t3 + 1), Integer.valueOf(Math.min(iM1534t3 + 5, i23)), Integer.valueOf(i23));
            }
            final int iIntValue = c1691h.f6493j.intValue();
            final int iIntValue2 = c1691h.f6494k.intValue();
            if (iIntValue > 1) {
                final int i24 = 0;
                viewM1740B = seriesDetailActivity.m1740B("\u2039", new InterfaceC2840a(seriesDetailActivity) { // from class: w4.u0

                    /* renamed from: k */
                    public final /* synthetic */ SeriesDetailActivity f9780k;

                    {
                        this.f9780k = seriesDetailActivity;
                    }

                    @Override // p212y6.InterfaceC2840a
                    public final Object invoke() {
                        int i25 = i24;
                        C1693j c1693j = C1693j.f6497a;
                        int i26 = i14;
                        int i27 = iIntValue;
                        SeriesDetailActivity seriesDetailActivity3 = this.f9780k;
                        switch (i25) {
                            case 0:
                                int i28 = SeriesDetailActivity.f3003k0;
                                seriesDetailActivity3.f3030h0 = AbstractC0714c.m1534t(i27 - 1, 1, i26);
                                seriesDetailActivity3.m1741C();
                                break;
                            default:
                                int i29 = SeriesDetailActivity.f3003k0;
                                seriesDetailActivity3.f3030h0 = AbstractC0714c.m1534t(i27 + 1, 1, i26);
                                seriesDetailActivity3.m1741C();
                                break;
                        }
                        return c1693j;
                    }
                });
                i4 = i22;
                i8 = 12;
                linearLayout6.addView(viewM1740B, m1738x(seriesDetailActivity, 0, 0, seriesDetailActivity.f3032j0, 0, 4, 27));
            } else {
                i4 = i22;
                i8 = 12;
                viewM1740B = null;
            }
            float f9 = 15.0f;
            if (iIntValue <= iIntValue2) {
                int i25 = iIntValue;
                textView = null;
                while (true) {
                    boolean z7 = i25 == iM1534t;
                    TextView textView5 = new TextView(seriesDetailActivity);
                    textView5.setText(String.valueOf(i25));
                    textView5.setTextSize(f9);
                    textView5.setGravity(17);
                    textView5.setTextColor(z7 ? -1 : AbstractC2702z0.f9818h);
                    textView5.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{android.R.attr.state_focused}, C0672j.m1449i(AbstractC2702z0.f9816f, i8, 0, 0));
                    stateListDrawable.addState(new int[0], z7 ? C0672j.m1449i(Color.parseColor("#8B0000"), i8, 0, 0) : C0672j.m1449i(0, i8, 1, AbstractC2702z0.f9815e));
                    textView5.setBackground(stateListDrawable);
                    textView5.setContentDescription(seriesDetailActivity.getString(R.string.action_episode_page, Integer.valueOf(i25)));
                    textView5.setPadding(C0672j.m1445d(seriesDetailActivity, 18), C0672j.m1445d(seriesDetailActivity, 15), C0672j.m1445d(seriesDetailActivity, 18), C0672j.m1445d(seriesDetailActivity, 15));
                    textView5.setOnClickListener(new ViewOnClickListenerC0674k(i25, seriesDetailActivity));
                    textView5.setOnKeyListener(new ViewOnKeyListenerC2694v0(0, seriesDetailActivity));
                    int i26 = i25;
                    f8 = 15.0f;
                    SeriesDetailActivity seriesDetailActivity3 = seriesDetailActivity;
                    C0672j c0672j6 = c0672j5;
                    C0672j.m1447f(c0672j6, seriesDetailActivity3, textView5, 12, null, null, null, 484);
                    seriesDetailActivity = seriesDetailActivity3;
                    if (z7) {
                        seriesDetailActivity.f3012P = textView5;
                    }
                    Integer num = seriesDetailActivity.f3016T;
                    if (num != null && num.intValue() == i26) {
                        textView = textView5;
                    }
                    c0672j5 = c0672j6;
                    linearLayout6.addView(textView5, m1738x(seriesDetailActivity, 0, 0, seriesDetailActivity.f3032j0, 0, 4, 27));
                    if (i26 == iIntValue2) {
                        break;
                    }
                    i25 = i26 + 1;
                    f9 = 15.0f;
                    i8 = 12;
                }
            } else {
                f8 = 15.0f;
                textView = null;
            }
            if (iIntValue2 < i14) {
                final int i27 = 1;
                viewM1740B2 = seriesDetailActivity.m1740B("\u203a", new InterfaceC2840a(seriesDetailActivity) { // from class: w4.u0

                    /* renamed from: k */
                    public final /* synthetic */ SeriesDetailActivity f9780k;

                    {
                        this.f9780k = seriesDetailActivity;
                    }

                    @Override // p212y6.InterfaceC2840a
                    public final Object invoke() {
                        int i252 = i27;
                        C1693j c1693j = C1693j.f6497a;
                        int i262 = i14;
                        int i272 = iIntValue2;
                        SeriesDetailActivity seriesDetailActivity32 = this.f9780k;
                        switch (i252) {
                            case 0:
                                int i28 = SeriesDetailActivity.f3003k0;
                                seriesDetailActivity32.f3030h0 = AbstractC0714c.m1534t(i272 - 1, 1, i262);
                                seriesDetailActivity32.m1741C();
                                break;
                            default:
                                int i29 = SeriesDetailActivity.f3003k0;
                                seriesDetailActivity32.f3030h0 = AbstractC0714c.m1534t(i272 + 1, 1, i262);
                                seriesDetailActivity32.m1741C();
                                break;
                        }
                        return c1693j;
                    }
                });
                linearLayout6.addView(viewM1740B2, m1738x(seriesDetailActivity, 0, 0, seriesDetailActivity.f3032j0, 0, 0, 59));
            } else {
                viewM1740B2 = null;
            }
            LinearLayout linearLayout7 = seriesDetailActivity.f3008L;
            if (linearLayout7 == null) {
                AbstractC2980h.m5139h(str6);
                throw null;
            }
            TextView textView6 = new TextView(seriesDetailActivity);
            textView6.setText(seriesDetailActivity.getString(R.string.episodes_page_range, Integer.valueOf(i4 + 1), Integer.valueOf(i21), Integer.valueOf(size)));
            textView6.setTextColor(AbstractC2702z0.f9819i);
            textView6.setTextSize(seriesDetailActivity.m1745u() ? f8 : 11.0f);
            textView6.setGravity(17);
            textView6.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 2, seriesDetailActivity.getResources().getDisplayMetrics()));
            linearLayout7.addView(textView6, m1738x(seriesDetailActivity, 12, 0, 0, 0, 0, 62));
            LinearLayout linearLayout8 = seriesDetailActivity.f3008L;
            if (linearLayout8 == null) {
                AbstractC2980h.m5139h(str6);
                throw null;
            }
            linearLayout8.addView(linearLayout6, m1738x(seriesDetailActivity, 0, 0, 0, 0, 0, 63));
            String str7 = seriesDetailActivity.f3015S;
            if (textView != null) {
                textView.requestFocus();
            } else if (str7 != null) {
                if (str7.equals("\u2039")) {
                    viewM1740B = viewM1740B2;
                    if (viewM1740B == null) {
                        viewM1740B = seriesDetailActivity.f3012P;
                    }
                    if (viewM1740B != null) {
                        viewM1740B.requestFocus();
                    }
                } else {
                    viewM1740B = viewM1740B2;
                    if (viewM1740B == null) {
                    }
                    if (viewM1740B != null) {
                    }
                }
            }
            if (str7 != null) {
                seriesDetailActivity.f3015S = null;
            }
            if (seriesDetailActivity.f3016T != null) {
                seriesDetailActivity.f3016T = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r4v1, types: [w4.x0] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1742D() throws Throwable {
        C1687d c1687d;
        String strConcat;
        int i;
        char c8;
        LinearLayout linearLayout = this.f3007K;
        String str = "seasonStrip";
        Throwable th = null;
        if (linearLayout == null) {
            AbstractC2980h.m5139h("seasonStrip");
            throw null;
        }
        linearLayout.removeAllViews();
        this.f3011O = null;
        if (m1745u()) {
            int i4 = (int) (getResources().getDisplayMetrics().heightPixels * 0.28f);
            c1687d = new C1687d(Integer.valueOf((int) ((i4 * 2.0f) / 3.0f)), Integer.valueOf(i4));
        } else {
            int i8 = (int) (getResources().getDisplayMetrics().widthPixels * 0.27f);
            c1687d = new C1687d(Integer.valueOf(i8), Integer.valueOf((int) (i8 * 1.5f)));
        }
        int iIntValue = ((Number) c1687d.f6486j).intValue();
        int iIntValue2 = ((Number) c1687d.f6487k).intValue();
        int i9 = 1;
        int iApplyDimension = ((int) TypedValue.applyDimension(1, 4, getResources().getDisplayMetrics())) / 2;
        ?? r02 = 0;
        int i10 = 0;
        for (Object obj : this.f3026d0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                Throwable th2 = th;
                AbstractC1914i.m3755v0();
                throw th2;
            }
            final C2651b1 c2651b1 = (C2651b1) obj;
            int i12 = c2651b1.f9651a;
            final boolean z7 = i12 == this.f3027e0 ? i9 : r02;
            final float f8 = z7 != 0 ? 1.0f : 0.6f;
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(i9);
            linearLayout2.setAlpha(f8);
            linearLayout2.setClipChildren(r02);
            linearLayout2.setClipToPadding(r02);
            Throwable th3 = th;
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: w4.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    boolean z8 = z7;
                    SeriesDetailActivity seriesDetailActivity = this;
                    if (!z8) {
                        seriesDetailActivity.f3014R = true;
                        seriesDetailActivity.m1746v(c2651b1.f9651a);
                    } else {
                        View view2 = (View) AbstractC1913h.m3737B0(seriesDetailActivity.f3010N);
                        if (view2 != null) {
                            view2.requestFocus();
                        }
                    }
                }
            });
            linearLayout2.setOnKeyListener(new ViewOnKeyListenerC0686q(i10, 2, this));
            FrameLayout frameLayout = new FrameLayout(this);
            C0672j c0672j = C0672j.f2641a;
            int i13 = z7 != 0 ? r02 : AbstractC2702z0.f9813c;
            int i14 = z7 != 0 ? 2 : r02;
            boolean z8 = z7;
            int i15 = AbstractC2702z0.f9816f;
            frameLayout.setBackground(C0672j.m1449i(i13, 24, i14, i15));
            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setBackground(C0672j.m1449i(AbstractC2702z0.f9813c, 24, r02, r02));
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            frameLayout.setClipChildren(r02);
            frameLayout.setClipToPadding(r02);
            int i16 = this.f3031i0;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i16, i16);
            layoutParams.setMargins(iApplyDimension, iApplyDimension, iApplyDimension, iApplyDimension);
            frameLayout.addView(imageView, layoutParams);
            String str2 = c2651b1.f9654d;
            if (str2 == null) {
                strConcat = th3;
            } else if (!AbstractC1206h.m2630D0(str2)) {
                boolean zEquals = str2.equals("null");
                String str3 = str2;
                if (zEquals) {
                    str3 = th3;
                }
                if (str3 != 0) {
                    strConcat = "https://image.tmdb.org/t/p/w500".concat(str3);
                }
            }
            if (strConcat != 0) {
                ComponentCallbacks2C0713b.m1485b(this).m3884d(this).m1660m(strConcat).m1626u(imageView);
            }
            int i17 = r02;
            String str4 = str;
            C0672j.m1447f(c0672j, this, linearLayout2, 24, new InterfaceC2840a() { // from class: w4.x0
                @Override // p212y6.InterfaceC2840a
                public final Object invoke() {
                    int i18 = SeriesDetailActivity.f3003k0;
                    return Float.valueOf(f8);
                }
            }, null, imageView, 84);
            if (z8) {
                this.f3011O = linearLayout2;
            }
            TextView textViewM1443b = C0672j.m1443b(this, AbstractC0008a1.m25u("S", m1736A(i12)), AbstractC2702z0.f9814d, 8, 6);
            textViewM1443b.setGravity(17);
            int i18 = this.f3032j0;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i18, i18);
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = C0672j.m1445d(this, 8);
            layoutParams2.setMarginStart(C0672j.m1445d(this, 8));
            frameLayout.addView(textViewM1443b, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iIntValue, iIntValue2);
            layoutParams3.setMargins(iApplyDimension, iApplyDimension, iApplyDimension, iApplyDimension);
            linearLayout2.addView(frameLayout, layoutParams3);
            String strM12h = c2651b1.f9652b;
            if (strM12h.length() == 0) {
                strM12h = AbstractC0008a1.m12h(i12, "Season ");
            }
            TextView textView = new TextView(this);
            textView.setText(C0672j.m1446e(22, strM12h));
            textView.setTextColor(AbstractC2702z0.f9817g);
            textView.setTextSize(12.0f);
            textView.setMaxLines(1);
            textView.setTypeface(z8 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            textView.setPadding(i17, C0672j.m1445d(this, 6), i17, i17);
            linearLayout2.addView(textView, new LinearLayout.LayoutParams(iIntValue, i18));
            ArrayList arrayList = new ArrayList();
            int i19 = c2651b1.f9653c;
            if (i19 > 0) {
                arrayList.add(i19 + " episodes");
            }
            String str5 = c2651b1.f9655e;
            if (str5 != null) {
                String strM2644R0 = AbstractC1206h.m2644R0(4, str5);
                int length = strM2644R0.length();
                Throwable th4 = strM2644R0;
                if (length != 4) {
                    th4 = th3;
                }
                if (th4 != null) {
                    arrayList.add(th4);
                }
            }
            if (arrayList.isEmpty()) {
                i = 1;
                c8 = 2;
            } else {
                TextView textView2 = new TextView(this);
                textView2.setText(AbstractC1913h.m3740E0(arrayList, " \u2022 ", null, null, null, 62));
                textView2.setTextColor(z8 ? i15 : AbstractC2702z0.f9819i);
                textView2.setTextSize(11.0f);
                i = 1;
                textView2.setMaxLines(1);
                c8 = 2;
                textView2.setPadding(i17, C0672j.m1445d(this, 2), i17, i17);
                linearLayout2.addView(textView2, new LinearLayout.LayoutParams(iIntValue, i18));
            }
            LinearLayout linearLayout3 = this.f3007K;
            if (linearLayout3 == null) {
                AbstractC2980h.m5139h(str4);
                throw th3;
            }
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iIntValue, i18);
            layoutParams4.setMarginEnd(C0672j.m1445d(this, 16));
            linearLayout3.addView(linearLayout2, layoutParams4);
            i9 = i;
            r02 = i17;
            i10 = i11;
            th = th3;
            str = str4;
        }
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
        this.f3024b0 = getIntent().getLongExtra("series_id", 0L);
        String stringExtra = getIntent().getStringExtra("series_title");
        if (stringExtra == null) {
            stringExtra = C2181z.FRAGMENT_ENCODE_SET;
        }
        this.f3025c0 = stringExtra;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(AbstractC2702z0.f9811a);
        int i = 1;
        if (m1745u()) {
            frameLayout.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserverOnGlobalFocusChangeListenerC2672k0(this, i));
        }
        ScrollView scrollView = new ScrollView(this);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setFillViewport(true);
        this.f3006J = scrollView;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setTextColor(AbstractC2702z0.f9819i);
        textView.setTextSize(12.0f);
        textView.setVisibility(8);
        textView.setPadding(m1744t(), C0672j.m1445d(this, 12), m1744t(), C0672j.m1445d(this, 12));
        this.f3005I = textView;
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        this.f3004H = linearLayout2;
        int i4 = this.f3031i0;
        int i8 = this.f3032j0;
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(i4, i8));
        ScrollView scrollView2 = this.f3006J;
        if (scrollView2 == null) {
            AbstractC2980h.m5139h("pageScroll");
            throw null;
        }
        scrollView2.addView(linearLayout, new FrameLayout.LayoutParams(i4, i8));
        ScrollView scrollView3 = this.f3006J;
        if (scrollView3 == null) {
            AbstractC2980h.m5139h("pageScroll");
            throw null;
        }
        frameLayout.addView(scrollView3, new FrameLayout.LayoutParams(i4, i4));
        TextView textView2 = new TextView(this);
        textView2.setText("\u2039");
        textView2.setTextSize(30.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setContentDescription(getString(R.string.action_back));
        textView2.setBackground(C0672j.m1449i(Color.argb(102, 0, 0, 0), 22, 0, 0));
        textView2.setMinimumWidth(C0672j.m1445d(this, 44));
        textView2.setMinimumHeight(C0672j.m1445d(this, 44));
        textView2.setClickable(true);
        textView2.setFocusable(true);
        textView2.setOnClickListener(new ViewOnClickListenerC0591a(12, this));
        textView2.setOnKeyListener(new ViewOnKeyListenerC2694v0(3, this));
        C0672j.m1447f(c0672j, this, textView2, 22, null, null, null, 484);
        this.f3009M = textView2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i8);
        layoutParams.gravity = 8388659;
        layoutParams.setMarginStart(C0672j.m1445d(this, 8));
        layoutParams.topMargin = C0672j.m1445d(this, 8);
        frameLayout.addView(textView2, layoutParams);
        int i9 = AbstractC0704z.f2752b;
        View view = new View(this);
        view.setBackgroundColor(i9);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, 0);
        layoutParams2.gravity = 80;
        frameLayout.addView(view, layoutParams2);
        C0447i c0447i = new C0447i(this, linearLayout, view);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1804e0.m3538j(frameLayout, c0447i);
        setContentView(frameLayout);
        m1747w();
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onDestroy() {
        C1278a0 c1278a0 = this.f3028f0;
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
        C1278a0 c1278a0 = this.f3028f0;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        this.f3024b0 = intent.getLongExtra("series_id", 0L);
        String stringExtra = intent.getStringExtra("series_title");
        if (stringExtra == null) {
            stringExtra = C2181z.FRAGMENT_ENCODE_SET;
        }
        this.f3025c0 = stringExtra;
        TextView textView = this.f3005I;
        if (textView == null) {
            AbstractC2980h.m5139h("status");
            throw null;
        }
        textView.setVisibility(0);
        m1747w();
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onResume() {
        super.onResume();
        m1743s();
    }

    /* renamed from: s */
    public final void m1743s() {
        Log.i("SeriesDetail", "episode pending cleared (was pending=" + this.f3019W + ")");
        if (this.f3019W) {
            this.f3019W = false;
            TextView textView = this.f3017U;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ProgressBar progressBar = this.f3018V;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* renamed from: t */
    public final int m1744t() {
        return (int) TypedValue.applyDimension(1, 16, getResources().getDisplayMetrics());
    }

    /* renamed from: u */
    public final boolean m1745u() {
        return ((Boolean) this.f3023a0.getValue()).booleanValue();
    }

    /* renamed from: v */
    public final void m1746v(int i) throws Throwable {
        C1278a0 c1278a0 = this.f3028f0;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        this.f3027e0 = i;
        this.f3030h0 = 1;
        TextView textView = this.f3021Y;
        if (textView != null) {
            textView.setText(getString(R.string.section_episodes_season, m1736A(i)));
        }
        m1742D();
        LinearLayout linearLayout = this.f3008L;
        InterfaceC2222c interfaceC2222c = null;
        if (linearLayout == null) {
            AbstractC2980h.m5139h("episodeBox");
            throw null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f3008L;
        if (linearLayout2 == null) {
            AbstractC2980h.m5139h("episodeBox");
            throw null;
        }
        ProgressBar progressBar = new ProgressBar(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f3031i0, this.f3032j0);
        layoutParams.gravity = 17;
        linearLayout2.addView(progressBar, layoutParams);
        this.f3028f0 = AbstractC1339x.m2850k(AbstractC0147m0.m566e(this), null, new C2654c1(this, i, interfaceC2222c, 1), 3);
    }

    /* renamed from: w */
    public final void m1747w() {
        TextView textView = this.f3005I;
        InterfaceC2222c interfaceC2222c = null;
        if (textView == null) {
            AbstractC2980h.m5139h("status");
            throw null;
        }
        textView.setText(C2181z.FRAGMENT_ENCODE_SET);
        TextView textView2 = this.f3005I;
        if (textView2 == null) {
            AbstractC2980h.m5139h("status");
            throw null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f3005I;
        if (textView3 == null) {
            AbstractC2980h.m5139h("status");
            throw null;
        }
        textView3.setPadding(0, 0, 0, 0);
        LinearLayout linearLayout = this.f3004H;
        if (linearLayout == null) {
            AbstractC2980h.m5139h("content");
            throw null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f3004H;
        if (linearLayout2 == null) {
            AbstractC2980h.m5139h("content");
            throw null;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        ProgressBar progressBar = new ProgressBar(this);
        int i = this.f3032j0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(this.f3031i0, ((int) (getResources().getDisplayMetrics().heightPixels * (m1745u() ? 0.52f : 0.42f))) + this.f3022Z));
        AbstractC1339x.m2850k(AbstractC0147m0.m566e(this), null, new C0687q0(this, interfaceC2222c, 5), 3);
    }

    /* renamed from: y */
    public final TextView m1748y(String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        int i = AbstractC2702z0.f9811a;
        textView.setTextColor(AbstractC2702z0.f9819i);
        textView.setTextSize(13.0f);
        textView.setPadding(m1744t(), (int) TypedValue.applyDimension(1, 12, getResources().getDisplayMetrics()), m1744t(), 0);
        return textView;
    }
}
