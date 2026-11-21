package p024c5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1313m;
import p076i7.C1319o;
import p076i7.InterfaceC1310l;
import p102l6.C1687d;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.C1921p;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p195w4.C2663g;
import p195w4.C2685r;
import p195w4.C2688s0;
import p195w4.C2690t0;
import p204x4.C2769l;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2851l;
import p216z2.AbstractC2888f0;
import p216z2.AbstractC2923x;
import p216z2.C2890g0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.r0 */
/* loaded from: classes.dex */
public final class C0689r0 {

    /* renamed from: a */
    public static final C0689r0 f2694a = new C0689r0();

    /* renamed from: b */
    public static final ConcurrentHashMap f2695b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentHashMap.KeySetView f2696c = ConcurrentHashMap.newKeySet();

    /* renamed from: d */
    public static final ConcurrentHashMap f2697d = new ConcurrentHashMap();

    /* renamed from: a */
    public static View m1461a(RecyclerView recyclerView) {
        AbstractC2888f0 layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return m1462b(recyclerView);
        }
        AbstractC2923x adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return m1462b(recyclerView);
        }
        int iMo1455a = adapter.mo1455a();
        if (iMo1455a == 0 || recyclerView.getWidth() <= 0) {
            return m1462b(recyclerView);
        }
        int iM1109M0 = linearLayoutManager.m1109M0();
        if (iM1109M0 == -1) {
            return m1462b(recyclerView);
        }
        View viewMo1139q = linearLayoutManager.mo1139q(iM1109M0);
        if (viewMo1139q == null) {
            return m1462b(recyclerView);
        }
        int width = viewMo1139q.getWidth();
        ViewGroup.LayoutParams layoutParams = viewMo1139q.getLayoutParams();
        C2890g0 c2890g0 = layoutParams instanceof C2890g0 ? (C2890g0) layoutParams : null;
        Integer numValueOf = c2890g0 != null ? Integer.valueOf(((ViewGroup.MarginLayoutParams) c2890g0).rightMargin) : null;
        int iIntValue = width + (numValueOf != null ? numValueOf.intValue() : 0);
        if (iIntValue <= 0) {
            return m1462b(recyclerView);
        }
        View viewMo1139q2 = linearLayoutManager.mo1139q(AbstractC0714c.m1534t(AbstractC0715d.m1560f0((((recyclerView.getWidth() / 2.0f) - ((viewMo1139q.getRight() + viewMo1139q.getLeft()) / 2.0f)) / iIntValue) + iM1109M0), 0, iMo1455a - 1));
        return viewMo1139q2 == null ? m1462b(recyclerView) : viewMo1139q2;
    }

    /* renamed from: b */
    public static final View m1462b(RecyclerView recyclerView) {
        float width = recyclerView.getWidth() / 2.0f;
        int childCount = recyclerView.getChildCount();
        View view = null;
        float f8 = Float.MAX_VALUE;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getWidth() > 0) {
                float fAbs = Math.abs(((childAt.getRight() + childAt.getLeft()) / 2.0f) - width);
                if (fAbs < f8) {
                    view = childAt;
                    f8 = fAbs;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    public static void m1463c(RecyclerView recyclerView) {
        View viewM1461a;
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        C0665g0 c0665g0 = recyclerView instanceof C0665g0 ? (C0665g0) recyclerView : null;
        if (c0665g0 == null || !c0665g0.f2603S0 || (viewM1461a = recyclerView.getFocusedChild()) == null) {
            viewM1461a = m1461a(recyclerView);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            boolean z7 = childAt == viewM1461a;
            float f8 = 1.0f;
            childAt.setAlpha(z7 ? 1.0f : 0.6f);
            if (!z7) {
                f8 = 0.86f;
            }
            childAt.setScaleY(f8);
        }
    }

    /* renamed from: d */
    public static FrameLayout m1464d(Context context, List list, EnumC2770m enumC2770m, C2685r c2685r, C2685r c2685r2, C2663g c2663g) throws Resources.NotFoundException {
        C1687d c1687d;
        AbstractC2980h.m5136e("items", list);
        if (context.getResources().getBoolean(R.bool.is_large_screen)) {
            int iM1560f0 = AbstractC0715d.m1560f0(context.getResources().getDisplayMetrics().widthPixels * 0.46f);
            c1687d = new C1687d(Integer.valueOf(iM1560f0), Integer.valueOf(AbstractC0715d.m1560f0((iM1560f0 * 9.0f) / 16.0f)));
        } else {
            c1687d = new C1687d(Integer.valueOf(AbstractC0715d.m1560f0(context.getResources().getDisplayMetrics().widthPixels * 0.7f)), Integer.valueOf(AbstractC0715d.m1560f0(context.getResources().getDisplayMetrics().heightPixels * 0.5f)));
        }
        int iIntValue = ((Number) c1687d.f6486j).intValue();
        int iIntValue2 = ((Number) c1687d.f6487k).intValue();
        boolean z7 = context.getResources().getBoolean(R.bool.is_large_screen);
        int iM3752s0 = AbstractC1914i.m3752s0(list);
        if (iM3752s0 < 0) {
            iM3752s0 = 0;
        }
        int i = 1 > iM3752s0 ? iM3752s0 : 1;
        C0665g0 c0665g0 = new C0665g0(i, context, z7);
        c0665g0.f2605U0 = iIntValue;
        c0665g0.setClipToPadding(false);
        c0665g0.setClipChildren(false);
        c0665g0.setHorizontalScrollBarEnabled(false);
        c0665g0.setOverScrollMode(2);
        c0665g0.setLayoutManager(new LinearLayoutManager(0));
        c0665g0.setAdapter(new C0675k0(list, iIntValue, iIntValue2, context.getResources().getBoolean(R.bool.is_large_screen) ? "w1280" : "w500", enumC2770m, z7, c2685r, c2685r2, c2663g));
        if (context.getResources().getBoolean(R.bool.is_large_screen)) {
            c0665g0.setFocusable(true);
            c0665g0.setFocusableInTouchMode(true);
            c0665g0.setDescendantFocusability(262144);
        }
        c0665g0.post(new RunnableC0653c0(i, 0, c0665g0));
        if (!z7) {
            C0668h0 c0668h0 = new C0668h0(new C0656d0(0, list));
            c0668h0.m5089a(c0665g0);
            c0665g0.m1187j(new C0662f0(1, c0668h0));
        }
        m1463c(c0665g0);
        c0665g0.m1187j(new C0679m0());
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.featured_slider_margin_top), 0, context.getResources().getDimensionPixelSize(R.dimen.featured_slider_margin_v));
        frameLayout.addView(c0665g0, new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Type inference failed for: r37v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v3, types: [w4.t0] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout m1465f(Context context, String str, final List list, InterfaceC2851l interfaceC2851l, InterfaceC2851l interfaceC2851l2, C2663g c2663g, ArrayList arrayList, C2688s0 c2688s0, C2690t0 c2690t0, int i) {
        C1687d c1687d;
        String str2;
        String strM17m;
        Context context2 = context;
        InterfaceC2851l interfaceC2851l3 = (i & 32) != 0 ? null : interfaceC2851l2;
        C2663g c2663g2 = (i & 64) != 0 ? null : c2663g;
        int i4 = 0;
        boolean z7 = (i & 128) == 0;
        List list2 = (i & 256) != 0 ? C1921p.f7187j : arrayList;
        C2688s0 c2688s02 = (i & 512) != 0 ? null : c2688s0;
        C2690t0 c2690t02 = (i & 1024) != 0 ? null : c2690t0;
        C0672j c0672j = C0672j.f2641a;
        AbstractC2980h.m5136e("items", list);
        AbstractC2980h.m5136e("focusEntryFrom", list2);
        if (context2.getResources().getBoolean(R.bool.is_large_screen)) {
            int iM1560f0 = AbstractC0715d.m1560f0(context2.getResources().getDisplayMetrics().heightPixels * 0.31f);
            c1687d = new C1687d(Integer.valueOf(AbstractC0715d.m1560f0((iM1560f0 * 2.0f) / 3.0f)), Integer.valueOf(iM1560f0));
        } else {
            c1687d = new C1687d(Integer.valueOf(AbstractC0715d.m1560f0(context2.getResources().getDisplayMetrics().widthPixels * 0.3f)), Integer.valueOf(AbstractC0715d.m1560f0(context2.getResources().getDisplayMetrics().heightPixels * 0.2f)));
        }
        int iIntValue = ((Number) c1687d.f6486j).intValue();
        int iIntValue2 = ((Number) c1687d.f6487k).intValue();
        int iM1445d = C0672j.m1445d(context2, 16);
        String str3 = context2.getResources().getBoolean(R.bool.is_large_screen) ? "w500" : "w185";
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, C0672j.m1445d(context2, 32));
        C2690t0 c2690t03 = c2690t02;
        String str4 = str3;
        int i8 = iIntValue2;
        int i9 = iM1445d;
        linearLayout.addView(C0672j.m1451k(context2, str, 20.0f, -1, 15, context2.getResources().getBoolean(R.bool.is_large_screen) ? 8 : 16, 160));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(C0672j.m1445d(context2, 15), 0, C0672j.m1445d(context2, 15), 0);
        if (context2.getResources().getBoolean(R.bool.is_large_screen)) {
            linearLayout2.setDescendantFocusability(262144);
        }
        char c8 = 4;
        int iM1445d2 = C0672j.m1445d(context2, 4) / 2;
        if (context2.getResources().getBoolean(R.bool.is_large_screen)) {
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            int i11 = iM1445d2;
            if (!it.hasNext()) {
                LinearLayout linearLayout3 = linearLayout2;
                C0677l0 c0677l0 = new C0677l0(context2, context2.getResources().getBoolean(R.bool.is_large_screen) ? AbstractC0715d.m1560f0(((i11 * 2) + iIntValue) * 0.029999971f) + 4 : 0);
                c0677l0.setHorizontalScrollBarEnabled(false);
                c0677l0.setClipToPadding(false);
                if (context2.getResources().getBoolean(R.bool.is_large_screen)) {
                    c0677l0.setClipChildren(false);
                    float f8 = 8;
                    c0677l0.setPadding(0, (int) TypedValue.applyDimension(1, f8, context2.getResources().getDisplayMetrics()), 0, (int) TypedValue.applyDimension(1, f8, context2.getResources().getDisplayMetrics()));
                }
                c0677l0.addView(linearLayout3);
                linearLayout.addView(c0677l0, new LinearLayout.LayoutParams(-1, -2));
                return linearLayout;
            }
            Object next = it.next();
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC1914i.m3755v0();
                throw null;
            }
            C2769l c2769l = (C2769l) next;
            String str5 = c2769l.f10244d;
            if (str5 == null) {
                str2 = str4;
                strM17m = null;
            } else {
                if (AbstractC1206h.m2630D0(str5) || str5.equals("null")) {
                    str5 = null;
                }
                if (str5 != null) {
                    str2 = str4;
                    strM17m = AbstractC0008a1.m17m("https://image.tmdb.org/t/p/", str2, str5);
                }
            }
            ImageView imageView = new ImageView(context2);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            int i13 = AbstractC0704z.f2760j;
            ?? r37 = linearLayout2;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(i4);
            gradientDrawable.setCornerRadius(24);
            gradientDrawable.setColor(i13);
            imageView.setBackground(gradientDrawable);
            imageView.setClipToOutline(true);
            if (strM17m != null) {
                ComponentCallbacks2C0713b.m1485b(context2).m3883c(context2).m1660m(strM17m).m1626u(imageView);
            } else {
                imageView.setImageResource(android.R.drawable.ic_menu_gallery);
            }
            LinearLayout linearLayout4 = new LinearLayout(context2);
            linearLayout4.setOrientation(1);
            linearLayout4.setPadding(0, 0, i9, 0);
            linearLayout4.setClickable(true);
            linearLayout4.setFocusable(true);
            if (context2.getResources().getBoolean(R.bool.is_large_screen)) {
                linearLayout4.setClipChildren(false);
                linearLayout4.setClipToPadding(false);
            }
            linearLayout4.setOnClickListener(new ViewOnClickListenerC0684p(interfaceC2851l, 2, c2769l));
            if (interfaceC2851l3 != null) {
                linearLayout4.setOnLongClickListener(new ViewOnLongClickListenerC0647a0(interfaceC2851l3, c2769l, 0));
            }
            int i14 = i9;
            String str6 = str2;
            InterfaceC2851l interfaceC2851l4 = interfaceC2851l3;
            final boolean z8 = z7;
            final List list3 = list2;
            ?? r9 = c2690t03;
            Context context3 = context2;
            C0672j c0672j2 = c0672j;
            C2663g c2663g3 = c2663g2;
            C0672j.m1447f(c0672j2, context3, linearLayout4, 24, null, i10 == 0 ? c2663g2 : null, imageView, 48);
            C0672j c0672j3 = c0672j2;
            context2 = context3;
            final C2688s0 c2688s03 = c2688s02;
            final int i15 = i10;
            linearLayout4.setOnKeyListener(new View.OnKeyListener() { // from class: c5.b0
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i16, KeyEvent keyEvent) {
                    InterfaceC2840a interfaceC2840a;
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    if (i16 == 19 && (interfaceC2840a = c2688s03) != null) {
                        View view2 = (View) interfaceC2840a.invoke();
                        if (view2 == null) {
                            return false;
                        }
                        view2.requestFocus();
                        return true;
                    }
                    if (i16 == 19) {
                        List list4 = list3;
                        if (!list4.isEmpty()) {
                            ((View) AbstractC1913h.m3736A0(list4)).requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 22 && z8) {
                        return i15 == AbstractC1914i.m3752s0(list);
                    }
                    return false;
                }
            });
            if (i15 == 0 && !list3.isEmpty()) {
                linearLayout4.setId(View.generateViewId());
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setNextFocusDownId(linearLayout4.getId());
                    c0672j3 = c0672j3;
                }
            }
            C0672j c0672j4 = c0672j3;
            if (i15 == 0 && r9 != 0) {
                r9.invoke(linearLayout4);
            }
            if (!list3.isEmpty()) {
                linearLayout4.setNextFocusUpId(((View) AbstractC1913h.m3736A0(list3)).getId());
            }
            int i16 = i8;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, i16);
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
            layoutParams.topMargin = i11;
            layoutParams.bottomMargin = i11;
            linearLayout4.addView(imageView, layoutParams);
            String str7 = c2769l.f10242b;
            TextView textView = new TextView(context2);
            textView.setText(str7);
            textView.setTextColor(-1);
            if (context2.getResources().getBoolean(R.bool.is_large_screen)) {
                textView.setTextSize(20.0f);
                textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            } else {
                textView.setTextSize(14.0f);
            }
            textView.setMaxLines(1);
            textView.setSingleLine();
            textView.setGravity(8388611);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((i11 * 2) + iIntValue, -2);
            layoutParams2.topMargin = i11;
            linearLayout4.addView(textView, layoutParams2);
            r37.addView(linearLayout4);
            z7 = z8;
            list2 = list3;
            c2688s02 = c2688s03;
            i8 = i16;
            c2690t03 = r9;
            linearLayout2 = r37;
            iM1445d2 = i11;
            c2663g2 = c2663g3;
            i10 = i12;
            c8 = 4;
            str4 = str6;
            i9 = i14;
            interfaceC2851l3 = interfaceC2851l4;
            i4 = 0;
            c0672j = c0672j4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1466e(Context context, C2769l c2769l, EnumC2770m enumC2770m, AbstractC2320c abstractC2320c) throws Throwable {
        C0681n0 c0681n0;
        C1313m c1313m;
        String str;
        SharedPreferences sharedPreferences;
        if (abstractC2320c instanceof C0681n0) {
            C0681n0 c0681n02 = (C0681n0) abstractC2320c;
            int i = c0681n02.f2673r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0681n02.f2673r = i - Integer.MIN_VALUE;
                c0681n0 = c0681n02;
            } else {
                c0681n0 = new C0681n0(this, abstractC2320c);
            }
        }
        Object obj = c0681n0.f2671p;
        Object obj2 = EnumC2273a.f7953j;
        int i4 = c0681n0.f2673r;
        int i8 = 0;
        ConcurrentHashMap.KeySetView keySetView = f2696c;
        ConcurrentHashMap concurrentHashMap = f2695b;
        ConcurrentHashMap concurrentHashMap2 = f2697d;
        try {
            if (i4 == 0) {
                AbstractC0714c.m1516d0(obj);
                String str2 = enumC2770m.name() + ":" + c2769l.f10241a;
                String str3 = (String) concurrentHashMap.get(str2);
                if (str3 != null) {
                    return str3;
                }
                InterfaceC2222c interfaceC2222c = null;
                if (keySetView.contains(str2)) {
                    return null;
                }
                SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences("featured_logo_cache", 0);
                String string = sharedPreferences2.getString(str2, null);
                if (string != null) {
                    if (string.equals("__no_featured_logo__")) {
                        keySetView.add(str2);
                        return null;
                    }
                    concurrentHashMap.put(str2, string);
                    return string;
                }
                C1313m c1313m2 = new C1313m(true);
                c1313m2.m2746C(null);
                InterfaceC1310l interfaceC1310l = (InterfaceC1310l) concurrentHashMap2.putIfAbsent(str2, c1313m2);
                if (interfaceC1310l != null) {
                    c0681n0.f2673r = 1;
                    Object objM2829T = ((C1313m) interfaceC1310l).m2829T(c0681n0);
                    if (objM2829T != obj2) {
                        return objM2829T;
                    }
                } else {
                    try {
                        C2054e c2054e = AbstractC1290e0.f5316a;
                        ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                        C0687q0 c0687q0 = new C0687q0(enumC2770m, c2769l, interfaceC2222c, i8);
                        c0681n0.f2668m = str2;
                        c0681n0.f2669n = sharedPreferences2;
                        c0681n0.f2670o = c1313m2;
                        c0681n0.f2673r = 2;
                        Object objM2857r = AbstractC1339x.m2857r(executorC2053d, c0687q0, c0681n0);
                        if (objM2857r != obj2) {
                            str = str2;
                            c1313m = c1313m2;
                            obj = objM2857r;
                            sharedPreferences = sharedPreferences2;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        c1313m = c1313m2;
                        c1313m.m2765m(e);
                        throw e;
                    } catch (Exception e8) {
                        e = e8;
                        c1313m = c1313m2;
                        c1313m.getClass();
                        c1313m.m2750G(new C1319o(e, false));
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c0681n0 = str2;
                        obj2 = c1313m2;
                        concurrentHashMap2.remove(c0681n0, obj2);
                        throw th;
                    }
                }
                return obj2;
            }
            if (i4 == 1) {
                AbstractC0714c.m1516d0(obj);
                return obj;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1313m = c0681n0.f2670o;
            sharedPreferences = c0681n0.f2669n;
            str = c0681n0.f2668m;
            try {
                AbstractC0714c.m1516d0(obj);
            } catch (CancellationException e9) {
                e = e9;
                c1313m.m2765m(e);
                throw e;
            } catch (Exception e10) {
                e = e10;
                c1313m.getClass();
                c1313m.m2750G(new C1319o(e, false));
                throw e;
            }
            String str4 = (String) obj;
            if (str4 == null) {
                keySetView.add(str);
                sharedPreferences.edit().putString(str, "__no_featured_logo__").apply();
            } else {
                concurrentHashMap.put(str, str4);
                sharedPreferences.edit().putString(str, str4).apply();
            }
            c1313m.m2750G(str4);
            concurrentHashMap2.remove(str, c1313m);
            return str4;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
