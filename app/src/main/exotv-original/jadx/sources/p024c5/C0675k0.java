package p024c5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.C0721j;
import com.bumptech.glide.C0722k;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.bumptech.glide.ComponentCallbacks2C0738m;
import com.exotv.net.R;
import java.util.List;
import p002a1.AbstractC0008a1;
import p005a4.C0093n;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1294f1;
import p112m7.AbstractC1938n;
import p112m7.C1927c;
import p127o7.C2054e;
import p171t5.AbstractC2436a;
import p195w4.C2663g;
import p195w4.C2685r;
import p204x4.C2769l;
import p204x4.EnumC2770m;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;
import p216z2.C2890g0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.k0 */
/* loaded from: classes.dex */
public final class C0675k0 extends AbstractC2923x {

    /* renamed from: d */
    public final List f2652d;

    /* renamed from: e */
    public final int f2653e;

    /* renamed from: f */
    public final int f2654f;

    /* renamed from: g */
    public final String f2655g;

    /* renamed from: h */
    public final EnumC2770m f2656h;

    /* renamed from: i */
    public final boolean f2657i;

    /* renamed from: j */
    public final C2685r f2658j;

    /* renamed from: k */
    public final C2685r f2659k;

    /* renamed from: l */
    public final C2663g f2660l;

    /* renamed from: m */
    public final C1927c f2661m;

    public C0675k0(List list, int i, int i4, String str, EnumC2770m enumC2770m, boolean z7, C2685r c2685r, C2685r c2685r2, C2663g c2663g) {
        AbstractC2980h.m5136e("items", list);
        this.f2652d = list;
        this.f2653e = i;
        this.f2654f = i4;
        this.f2655g = str;
        this.f2656h = enumC2770m;
        this.f2657i = z7;
        this.f2658j = c2685r;
        this.f2659k = c2685r2;
        this.f2660l = c2663g;
        C1294f1 c1294f1 = new C1294f1();
        C2054e c2054e = AbstractC1290e0.f5316a;
        this.f2661m = AbstractC1339x.m2840a(AbstractC0714c.m1508W(c1294f1, AbstractC1938n.f7227a.f5856n));
    }

    /* renamed from: g */
    public static void m1454g(C0671i0 c0671i0, String str, String str2) {
        String str3 = c0671i0.f2640y;
        ImageView imageView = c0671i0.f2638w;
        if (AbstractC2980h.m5132a(str3, str)) {
            ((C0721j) ComponentCallbacks2C0713b.m1487d(imageView).m1660m(str2).m4054d(C0093n.f435b)).m1626u(imageView);
            imageView.setVisibility(0);
            c0671i0.f2639x.setVisibility(8);
        }
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: a */
    public final int mo1455a() {
        return this.f2652d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    @Override // p216z2.AbstractC2923x
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1456d(AbstractC2920v0 abstractC2920v0, int i) throws Resources.NotFoundException {
        String strM17m;
        C2663g c2663g;
        C0671i0 c0671i0 = (C0671i0) abstractC2920v0;
        TextView textView = c0671i0.f2639x;
        ImageView imageView = c0671i0.f2638w;
        ImageView imageView2 = c0671i0.f2637v;
        C2769l c2769l = (C2769l) this.f2652d.get(i);
        FrameLayout frameLayout = c0671i0.f2636u;
        Context context = frameLayout.getContext();
        String strName = this.f2656h.name();
        long j = c2769l.f10241a;
        String str = c2769l.f10242b;
        String str2 = c2769l.f10244d;
        String str3 = strName + ":" + j;
        c0671i0.f2640y = str3;
        C0689r0 c0689r0 = C0689r0.f2694a;
        AbstractC2980h.m5133b(context);
        boolean z7 = context.getResources().getBoolean(R.bool.is_large_screen);
        String str4 = this.f2655g;
        if (z7) {
            strM17m = AbstractC2436a.m4337l(c2769l.f10245e, str4);
            if (strM17m == null) {
                strM17m = AbstractC2436a.m4337l(str2, "w780");
            }
        } else {
            AbstractC2980h.m5136e("size", str4);
            if (str2 == null) {
                strM17m = null;
            } else {
                if (AbstractC1206h.m2630D0(str2) || str2.equals("null")) {
                    str2 = null;
                }
                if (str2 != null) {
                    strM17m = AbstractC0008a1.m17m("https://image.tmdb.org/t/p/", str4, str2);
                }
            }
        }
        if (strM17m != null) {
            ComponentCallbacks2C0713b.m1487d(imageView2).m1660m(strM17m).m1626u(imageView2);
        } else {
            imageView2.setImageResource(android.R.drawable.ic_menu_gallery);
        }
        int i4 = this.f2653e;
        int i8 = this.f2654f;
        frameLayout.setLayoutParams(new C2890g0(i4, i8));
        c0671i0.f10848a.setLayoutParams(new C2890g0(i4, i8));
        frameLayout.setContentDescription(str);
        textView.setText(str);
        imageView.setVisibility(8);
        boolean z8 = this.f2657i;
        textView.setVisibility(z8 ? 0 : 8);
        ComponentCallbacks2C0738m componentCallbacks2C0738mM1487d = ComponentCallbacks2C0713b.m1487d(imageView);
        componentCallbacks2C0738mM1487d.getClass();
        componentCallbacks2C0738mM1487d.m1659l(new C0722k(imageView));
        frameLayout.setOnClickListener(new ViewOnClickListenerC0684p(this, 3, c2769l));
        int iIntValue = -1;
        if (i == 0 && (c2663g = this.f2660l) != null) {
            iIntValue = ((Number) c2663g.invoke()).intValue();
        }
        frameLayout.setNextFocusLeftId(iIntValue);
        C2685r c2685r = this.f2659k;
        if (c2685r != null) {
            frameLayout.setOnLongClickListener(new ViewOnLongClickListenerC0647a0(c2685r, c2769l, 1));
        }
        if (z8) {
            String str5 = (String) C0689r0.f2695b.get(str3);
            if (str5 != null) {
                m1454g(c0671i0, str3, str5);
            } else if (!C0689r0.f2696c.contains(str3)) {
                AbstractC1339x.m2850k(this.f2661m, null, new C0673j0(context, c2769l, this, c0671i0, str3, null, 0), 3);
            }
        }
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: e */
    public final AbstractC2920v0 mo1457e(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        C0672j c0672j = C0672j.f2641a;
        frameLayout.setBackground(C0672j.m1449i(AbstractC0704z.f2760j, 24, 0, 0));
        frameLayout.setClipToOutline(true);
        AbstractC2980h.m5133b(context);
        C0672j.m1447f(c0672j, context, frameLayout, 24, null, null, null, 484);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        boolean z7 = this.f2657i;
        if (z7) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -654311424}));
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, C0672j.m1445d(context, 104), 80));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0715d.m1560f0(this.f2653e * 0.78f), AbstractC0715d.m1560f0(this.f2654f * 0.38f), 81);
        layoutParams.bottomMargin = C0672j.m1445d(context, 12);
        frameLayout.addView(imageView2, layoutParams);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(2, 23.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 1));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setShadowLayer(4.0f, 0.0f, 2.0f, -16777216);
        textView.setVisibility(z7 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, C0672j.m1445d(context, 62), 80);
        layoutParams2.leftMargin = C0672j.m1445d(context, 18);
        layoutParams2.rightMargin = C0672j.m1445d(context, 18);
        layoutParams2.bottomMargin = C0672j.m1445d(context, 12);
        frameLayout.addView(textView, layoutParams2);
        return new C0671i0(frameLayout, imageView, imageView2, textView);
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: f */
    public final void mo1458f(RecyclerView recyclerView) {
        AbstractC1339x.m2842c(this.f2661m);
    }
}
