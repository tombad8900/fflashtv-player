package p152r4;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.exotv.net.R;
import java.util.ArrayList;
import p144q4.C2270f;
import p144q4.InterfaceC2267c;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r4.a */
/* loaded from: classes.dex */
public final class C2310a implements InterfaceC2314e {

    /* renamed from: j */
    public final ImageView f8091j;

    /* renamed from: k */
    public final C2315f f8092k;

    /* renamed from: l */
    public Animatable f8093l;

    /* renamed from: m */
    public final /* synthetic */ int f8094m;

    public C2310a(ImageView imageView, int i) {
        this.f8094m = i;
        AbstractC2470e.m4446c("Argument must not be null", imageView);
        this.f8091j = imageView;
        this.f8092k = new C2315f(imageView);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: a */
    public final void mo1629a(C2270f c2270f) throws Throwable {
        C2315f c2315f = this.f8092k;
        ArrayList arrayList = c2315f.f8103b;
        View view = c2315f.f8102a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM4101a = c2315f.m4101a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM4101a2 = c2315f.m4101a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM4101a > 0 || iM4101a == Integer.MIN_VALUE) && (iM4101a2 > 0 || iM4101a2 == Integer.MIN_VALUE)) {
            c2270f.m4082l(iM4101a, iM4101a2);
            return;
        }
        if (!arrayList.contains(c2270f)) {
            arrayList.add(c2270f);
        }
        if (c2315f.f8104c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC2311b viewTreeObserverOnPreDrawListenerC2311b = new ViewTreeObserverOnPreDrawListenerC2311b(c2315f);
            c2315f.f8104c = viewTreeObserverOnPreDrawListenerC2311b;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2311b);
        }
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: b */
    public final void mo1630b(InterfaceC2267c interfaceC2267c) {
        this.f8091j.setTag(R.id.glide_custom_view_target_tag, interfaceC2267c);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: c */
    public final void mo1631c(Object obj) {
        m4099l(obj);
        if (!(obj instanceof Animatable)) {
            this.f8093l = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f8093l = animatable;
        animatable.start();
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: d */
    public final void mo1632d() {
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: e */
    public final void mo1633e(Drawable drawable) {
        m4099l(null);
        this.f8093l = null;
        this.f8091j.setImageDrawable(drawable);
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: f */
    public final void mo1634f() {
        Animatable animatable = this.f8093l;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: g */
    public final void mo1635g(C2270f c2270f) {
        this.f8092k.f8103b.remove(c2270f);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: h */
    public final void mo1636h(Drawable drawable) {
        m4099l(null);
        this.f8093l = null;
        this.f8091j.setImageDrawable(drawable);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: i */
    public final InterfaceC2267c mo1637i() {
        Object tag = this.f8091j.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC2267c) {
            return (InterfaceC2267c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: j */
    public final void mo1638j(Drawable drawable) {
        C2315f c2315f = this.f8092k;
        ViewTreeObserver viewTreeObserver = c2315f.f8102a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2315f.f8104c);
        }
        c2315f.f8104c = null;
        c2315f.f8103b.clear();
        Animatable animatable = this.f8093l;
        if (animatable != null) {
            animatable.stop();
        }
        m4099l(null);
        this.f8093l = null;
        this.f8091j.setImageDrawable(drawable);
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: k */
    public final void mo1639k() {
        Animatable animatable = this.f8093l;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: l */
    public final void m4099l(Object obj) {
        switch (this.f8094m) {
            case 0:
                this.f8091j.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f8091j.setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.f8091j;
    }
}
