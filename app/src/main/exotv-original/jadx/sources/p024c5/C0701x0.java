package p024c5;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http.C2114m;
import org.json.JSONArray;
import org.json.JSONObject;
import p016b5.C0585h;
import p016b5.C0586i;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1295g;
import p076i7.InterfaceC1333u;
import p102l6.C1687d;
import p102l6.C1693j;
import p111m6.C1923r;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p171t5.AbstractC2436a;
import p204x4.C2768k;
import p204x4.C2769l;
import p204x4.C2780w;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.x0 */
/* loaded from: classes.dex */
public final class C0701x0 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f2731n = 1;

    /* renamed from: o */
    public int f2732o;

    /* renamed from: p */
    public final /* synthetic */ String f2733p;

    /* renamed from: q */
    public final /* synthetic */ EnumC0699w0 f2734q;

    /* renamed from: r */
    public Object f2735r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0701x0(EnumC0699w0 enumC0699w0, String str, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2734q = enumC0699w0;
        this.f2733p = str;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f2731n) {
        }
        return ((C0701x0) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f2731n) {
            case 0:
                return new C0701x0(this.f2734q, this.f2733p, interfaceC2222c);
            default:
                return new C0701x0((C0648a1) this.f2735r, this.f2733p, this.f2734q, interfaceC2222c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2 == r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0286  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        String str;
        Object objM4851f;
        C2780w c2780w;
        C1693j c1693j;
        Object objM2857r;
        C1687d c1687d;
        C1693j c1693j2;
        String strConcat;
        ImageView imageView;
        int i;
        int i4;
        MainActivity mainActivity;
        switch (this.f2731n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i8 = this.f2732o;
                if (i8 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    String str2 = "https://api.themoviedb.org/3" + this.f2734q.f2727k + "?query=" + URLEncoder.encode(this.f2733p, "UTF-8") + "&include_adult=false";
                    AbstractC2980h.m5136e("url", str2);
                    String str3 = AbstractC1206h.m2650v0(str2, '?') ? "&" : "?";
                    C0586i c0586i = C0585h.f2325a;
                    if (c0586i == null || (str = c0586i.f2343r) == null) {
                        str = "4e44d9029b1270a757cddc766a1bcb63";
                    }
                    String str4 = str2 + str3 + "api_key=" + str;
                    C2780w c2780w2 = C2780w.f10327a;
                    C2768k c2768k = C2768k.f10237a;
                    this.f2735r = c2780w2;
                    this.f2732o = 1;
                    objM4851f = C2768k.m4851f(str4, this);
                    if (objM4851f == enumC2273a) {
                        return enumC2273a;
                    }
                    c2780w = c2780w2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2780w = (C2780w) this.f2735r;
                    AbstractC0714c.m1516d0(obj);
                    objM4851f = obj;
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject((String) objM4851f).optJSONArray("results");
                EnumC2770m enumC2770m = this.f2734q == EnumC0699w0.f2723l ? EnumC2770m.f10247j : EnumC2770m.f10248k;
                C2780w c2780w3 = C2780w.f10327a;
                C1923r c1923r = C1923r.f7189j;
                c2780w.getClass();
                return C2780w.m4864b(jSONArrayOptJSONArray, enumC2770m, c1923r);
            default:
                String str5 = this.f2733p;
                EnumC0699w0 enumC0699w0 = this.f2734q;
                C1693j c1693j3 = C1693j.f6497a;
                final C0648a1 c0648a1 = (C0648a1) this.f2735r;
                int i9 = c0648a1.f2563m;
                int i10 = c0648a1.f2562l;
                MainActivity mainActivity2 = c0648a1.f2551a;
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i11 = this.f2732o;
                try {
                } catch (Exception e) {
                    c1693j = c1693j3;
                    Log.e("SearchPanel", "search failed", e);
                    String string = mainActivity2.getString(R.string.search_failed);
                    AbstractC2980h.m5135d("getString(...)", string);
                    c0648a1.f2560j = null;
                    LinearLayout linearLayout = c0648a1.f2559i;
                    if (linearLayout == null) {
                        AbstractC2980h.m5139h("results");
                        throw null;
                    }
                    linearLayout.removeAllViews();
                    LinearLayout linearLayout2 = c0648a1.f2559i;
                    if (linearLayout2 == null) {
                        AbstractC2980h.m5139h("results");
                        throw null;
                    }
                    TextView textView = new TextView(mainActivity2);
                    textView.setText(string);
                    textView.setTextColor(AbstractC0704z.f2753c);
                    textView.setTextSize(14.0f);
                    textView.setGravity(17);
                    textView.setPadding(0, c0648a1.m1427a(48), 0, c0648a1.m1427a(48));
                    linearLayout2.addView(textView, new LinearLayout.LayoutParams(i10, i9));
                }
                if (i11 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    this.f2732o = 1;
                    C1295g c1295g = new C1295g(1, AbstractC0715d.m1547P(this));
                    c1295g.m2810v();
                    AbstractC1339x.m2844e(c1295g.f5323n).mo2778x(c1295g);
                    Object objM2809u = c1295g.m2809u();
                    if (objM2809u != enumC2273a2) {
                        objM2809u = c1693j3;
                    }
                    if (objM2809u != enumC2273a2) {
                    }
                    return enumC2273a2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    objM2857r = obj;
                    List list = (List) objM2857r;
                    EditText editText = c0648a1.f2557g;
                    if (editText == null) {
                        AbstractC2980h.m5139h("input");
                        throw null;
                    }
                    if (AbstractC2980h.m5132a(AbstractC1206h.m2645S0(editText.getText().toString()).toString(), str5) && c0648a1.f2556f == enumC0699w0) {
                        if (list.isEmpty()) {
                            c0648a1.m1430d();
                            return c1693j3;
                        }
                        c0648a1.f2560j = null;
                        LinearLayout linearLayout3 = c0648a1.f2559i;
                        if (linearLayout3 == null) {
                            AbstractC2980h.m5139h("results");
                            throw null;
                        }
                        linearLayout3.removeAllViews();
                        DisplayMetrics displayMetrics = mainActivity2.getResources().getDisplayMetrics();
                        if (c0648a1.m1428b()) {
                            int i12 = (int) (displayMetrics.widthPixels * 0.4f);
                            c1687d = new C1687d(Integer.valueOf(i12), Integer.valueOf((int) ((i12 * 9.0f) / 16.0f)));
                        } else {
                            int i13 = (int) (displayMetrics.widthPixels * 0.44f);
                            c1687d = new C1687d(Integer.valueOf(i13), Integer.valueOf((int) ((i13 * 3.0f) / 2.0f)));
                        }
                        int iIntValue = ((Number) c1687d.f6486j).intValue();
                        int iIntValue2 = ((Number) c1687d.f6487k).intValue();
                        final C0669h1 c0669h1 = new C0669h1(mainActivity2);
                        int i14 = 24;
                        int i15 = 2;
                        c0669h1.setPadding(c0648a1.m1427a(15), c0648a1.m1428b() ? c0648a1.m1427a(16) : 0, c0648a1.m1427a(15), c0648a1.m1427a(24));
                        c0669h1.f2624j = iIntValue;
                        if (c0648a1.m1428b()) {
                            c0669h1.f2625k = 2;
                            c0669h1.f2626l = c0648a1.m1427a(32);
                        }
                        c0669h1.setClipChildren(false);
                        c0669h1.setClipToPadding(false);
                        LinearLayout linearLayout4 = c0648a1.f2559i;
                        if (linearLayout4 == null) {
                            AbstractC2980h.m5139h("results");
                            throw null;
                        }
                        linearLayout4.addView(c0669h1);
                        int iApplyDimension = ((int) TypedValue.applyDimension(1, 4, mainActivity2.getResources().getDisplayMetrics())) / 2;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C2769l c2769l = (C2769l) it.next();
                            ImageView imageView2 = new ImageView(mainActivity2);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            C0672j c0672j = C0672j.f2641a;
                            int i16 = AbstractC0704z.f2760j;
                            Iterator it2 = it;
                            imageView2.setBackground(C0672j.m1449i(i16, i14, 0, 0));
                            imageView2.setClipToOutline(true);
                            FrameLayout frameLayout = new FrameLayout(mainActivity2);
                            frameLayout.setBackground(C0672j.m1449i(i16, i14, 0, 0));
                            frameLayout.setClipToOutline(true);
                            frameLayout.addView(imageView2, new FrameLayout.LayoutParams(i10, i10));
                            if (c0648a1.m1428b()) {
                                String strM4337l = AbstractC2436a.m4337l(c2769l.f10245e, "w780");
                                if (strM4337l == null) {
                                    strM4337l = AbstractC2436a.m4337l(c2769l.f10244d, "w780");
                                }
                                if (strM4337l != null) {
                                    ComponentCallbacks2C0713b.m1485b(mainActivity2).m3884d(mainActivity2).m1660m(strM4337l).m1626u(imageView2);
                                } else {
                                    imageView2.setImageResource(android.R.drawable.ic_menu_gallery);
                                }
                                View view = new View(mainActivity2);
                                c1693j2 = c1693j3;
                                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -654311424}));
                                frameLayout.addView(view, new FrameLayout.LayoutParams(i10, c0648a1.m1427a(100), 80));
                                imageView = new ImageView(mainActivity2);
                                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                imageView.setVisibility(8);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (iIntValue * 0.78f), (int) (iIntValue2 * 0.38f), 81);
                                layoutParams.bottomMargin = c0648a1.m1427a(12);
                                frameLayout.addView(imageView, layoutParams);
                            } else {
                                c1693j2 = c1693j3;
                                String str6 = c2769l.f10244d;
                                if (str6 == null) {
                                    strConcat = null;
                                    if (strConcat == null) {
                                        ComponentCallbacks2C0713b.m1485b(mainActivity2).m3884d(mainActivity2).m1660m(strConcat).m1626u(imageView2);
                                    } else {
                                        imageView2.setImageResource(android.R.drawable.ic_menu_gallery);
                                    }
                                    imageView = null;
                                } else {
                                    if (AbstractC1206h.m2630D0(str6) || str6.equals("null")) {
                                        str6 = null;
                                    }
                                    if (str6 != null) {
                                        strConcat = "https://image.tmdb.org/t/p/w500".concat(str6);
                                    }
                                    if (strConcat == null) {
                                    }
                                    imageView = null;
                                }
                            }
                            EnumC0699w0 enumC0699w02 = c0648a1.f2556f;
                            EnumC0699w0 enumC0699w03 = EnumC0699w0.f2723l;
                            EnumC2770m enumC2770m2 = enumC0699w02 == enumC0699w03 ? EnumC2770m.f10247j : EnumC2770m.f10248k;
                            int i17 = iIntValue;
                            String str7 = enumC2770m2.name() + ":" + c2769l.f10241a;
                            LinearLayout linearLayout5 = new LinearLayout(mainActivity2);
                            linearLayout5.setTag(str7);
                            linearLayout5.setOrientation(1);
                            linearLayout5.setPadding(0, 0, 0, c0648a1.m1427a(16));
                            linearLayout5.setClickable(true);
                            linearLayout5.setFocusable(true);
                            linearLayout5.setOnClickListener(new ViewOnClickListenerC0684p(c0648a1, 5, c2769l));
                            if (c0648a1.f2556f == enumC0699w03) {
                                i = i15;
                                linearLayout5.setOnLongClickListener(new ViewOnLongClickListenerC0647a0(c0648a1, c2769l, i));
                            } else {
                                i = i15;
                            }
                            C0672j.m1447f(c0672j, mainActivity2, linearLayout5, 24, null, new C0695u0(c0648a1, linearLayout5, 1), frameLayout, C2114m.HTTP_PERM_REDIRECT);
                            MainActivity mainActivity3 = mainActivity2;
                            linearLayout5.setOnKeyListener(new View.OnKeyListener() { // from class: c5.v0
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view2, int i18, KeyEvent keyEvent) {
                                    if (keyEvent.getAction() == 0) {
                                        C0669h1 c0669h12 = c0669h1;
                                        if (i18 == 19) {
                                            AbstractC2980h.m5133b(view2);
                                            int width = (c0669h12.getWidth() - c0669h12.getPaddingLeft()) - c0669h12.getPaddingRight();
                                            if (width < 0) {
                                                width = 0;
                                            }
                                            int iM1441a = c0669h12.m1441a(width);
                                            int iIndexOfChild = c0669h12.indexOfChild(view2);
                                            if (iIndexOfChild >= 0 && iIndexOfChild < iM1441a) {
                                                C0648a1 c0648a12 = c0648a1;
                                                return ((TextView) c0648a12.f2561k.get(c0648a12.f2556f.ordinal())).requestFocus();
                                            }
                                        }
                                        if (i18 == 22) {
                                            AbstractC2980h.m5133b(view2);
                                            int iIndexOfChild2 = c0669h12.indexOfChild(view2);
                                            if (iIndexOfChild2 >= 0) {
                                                int width2 = (c0669h12.getWidth() - c0669h12.getPaddingLeft()) - c0669h12.getPaddingRight();
                                                if (width2 < 0) {
                                                    width2 = 0;
                                                }
                                                int iM1441a2 = c0669h12.m1441a(width2);
                                                if (iIndexOfChild2 % iM1441a2 == iM1441a2 - 1 || iIndexOfChild2 == c0669h12.getChildCount() - 1) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                    return false;
                                }
                            });
                            int i18 = iApplyDimension * 2;
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i17 - i18, iIntValue2 - i18);
                            layoutParams2.leftMargin = iApplyDimension;
                            layoutParams2.rightMargin = iApplyDimension;
                            layoutParams2.topMargin = iApplyDimension;
                            linearLayout5.addView(frameLayout, layoutParams2);
                            TextView textView2 = new TextView(mainActivity3);
                            textView2.setText(C0672j.m1446e(36, c2769l.f10242b));
                            textView2.setTextColor(AbstractC0704z.f2755e);
                            textView2.setTextSize(c0648a1.m1428b() ? 18.0f : 15.0f);
                            textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
                            textView2.setMaxLines(2);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setPadding(c0648a1.m1427a(8), i18, c0648a1.m1427a(8), 0);
                            linearLayout5.addView(textView2);
                            c0669h1.addView(linearLayout5);
                            if (c0648a1.f2560j == null) {
                                c0648a1.f2560j = linearLayout5;
                            }
                            if (imageView != null) {
                                mainActivity = mainActivity3;
                                ImageView imageView3 = imageView;
                                i15 = 2;
                                i4 = i10;
                                AbstractC1339x.m2850k(c0648a1.f2555e, null, new C0705z0(c0648a1, c2769l, enumC2770m2, linearLayout5, str7, imageView3, null), 3);
                            } else {
                                i4 = i10;
                                mainActivity = mainActivity3;
                                i15 = 2;
                            }
                            i10 = i4;
                            mainActivity2 = mainActivity;
                            it = it2;
                            i14 = 24;
                            c1693j3 = c1693j2;
                            iIntValue = i17;
                        }
                    }
                    c1693j = c1693j3;
                    return c1693j;
                }
                AbstractC0714c.m1516d0(obj);
                c0648a1.f2560j = null;
                LinearLayout linearLayout6 = c0648a1.f2559i;
                if (linearLayout6 == null) {
                    AbstractC2980h.m5139h("results");
                    throw null;
                }
                linearLayout6.removeAllViews();
                LinearLayout linearLayout7 = c0648a1.f2559i;
                if (linearLayout7 == null) {
                    AbstractC2980h.m5139h("results");
                    throw null;
                }
                ProgressBar progressBar = new ProgressBar(mainActivity2);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i10, i9);
                layoutParams3.gravity = 17;
                linearLayout7.addView(progressBar, layoutParams3);
                C2054e c2054e = AbstractC1290e0.f5316a;
                ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                C0701x0 c0701x0 = new C0701x0(enumC0699w0, str5, null);
                this.f2732o = 2;
                objM2857r = AbstractC1339x.m2857r(executorC2053d, c0701x0, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0701x0(C0648a1 c0648a1, String str, EnumC0699w0 enumC0699w0, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2735r = c0648a1;
        this.f2733p = str;
        this.f2734q = enumC0699w0;
    }
}
