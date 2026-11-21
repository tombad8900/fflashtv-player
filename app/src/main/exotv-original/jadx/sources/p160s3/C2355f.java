package p160s3;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC0715d;
import p065h3.C1161f;
import p076i7.C1295g;
import p146q6.EnumC2273a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s3.f */
/* loaded from: classes.dex */
public final class C2355f implements InterfaceC2358i {

    /* renamed from: a */
    public final ImageView f8265a;

    public C2355f(ImageView imageView) {
        this.f8265a = imageView;
    }

    /* renamed from: b */
    public static AbstractC0715d m4190b(int i, int i4, int i8) {
        if (i == -2) {
            return C2351b.f8261n;
        }
        int i9 = i - i8;
        if (i9 > 0) {
            return new C2350a(i9);
        }
        int i10 = i4 - i8;
        if (i10 > 0) {
            return new C2350a(i10);
        }
        return null;
    }

    @Override // p160s3.InterfaceC2358i
    /* renamed from: a */
    public Object mo4189a(C1161f c1161f) throws Throwable {
        C2357h c2357hM4191c = m4191c();
        if (c2357hM4191c != null) {
            return c2357hM4191c;
        }
        C1295g c1295g = new C1295g(1, AbstractC0715d.m1547P(c1161f));
        c1295g.m2810v();
        ViewTreeObserver viewTreeObserver = this.f8265a.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC2360k viewTreeObserverOnPreDrawListenerC2360k = new ViewTreeObserverOnPreDrawListenerC2360k(this, viewTreeObserver, c1295g);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2360k);
        c1295g.m2812x(new C2359j(this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC2360k));
        Object objM2809u = c1295g.m2809u();
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        return objM2809u;
    }

    /* renamed from: c */
    public C2357h m4191c() {
        ImageView imageView = this.f8265a;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        AbstractC0715d abstractC0715dM4190b = m4190b(layoutParams != null ? layoutParams.width : -1, imageView.getWidth(), imageView.getPaddingRight() + imageView.getPaddingLeft());
        if (abstractC0715dM4190b == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        AbstractC0715d abstractC0715dM4190b2 = m4190b(layoutParams2 != null ? layoutParams2.height : -1, imageView.getHeight(), imageView.getPaddingBottom() + imageView.getPaddingTop());
        if (abstractC0715dM4190b2 == null) {
            return null;
        }
        return new C2357h(abstractC0715dM4190b, abstractC0715dM4190b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2355f) {
            return this.f8265a.equals(((C2355f) obj).f8265a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f8265a.hashCode() * 31);
    }
}
