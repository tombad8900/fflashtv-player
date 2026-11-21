package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.exotv.net.R;
import java.util.ArrayList;
import p144q4.C2270f;
import p144q4.InterfaceC2267c;
import p152r4.C2312c;
import p152r4.InterfaceC2314e;
import p152r4.ViewTreeObserverOnPreDrawListenerC2311b;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.k */
/* loaded from: classes.dex */
public final class C0722k implements InterfaceC2314e {

    /* renamed from: j */
    public final C2312c f2840j;

    /* renamed from: k */
    public final View f2841k;

    public C0722k(ImageView imageView) {
        AbstractC2470e.m4446c("Argument must not be null", imageView);
        this.f2841k = imageView;
        this.f2840j = new C2312c(imageView);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: a */
    public final void mo1629a(C2270f c2270f) throws Throwable {
        C2312c c2312c = this.f2840j;
        ArrayList arrayList = c2312c.f8099b;
        View view = c2312c.f8098a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM4100a = c2312c.m4100a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM4100a2 = c2312c.m4100a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM4100a > 0 || iM4100a == Integer.MIN_VALUE) && (iM4100a2 > 0 || iM4100a2 == Integer.MIN_VALUE)) {
            c2270f.m4082l(iM4100a, iM4100a2);
            return;
        }
        if (!arrayList.contains(c2270f)) {
            arrayList.add(c2270f);
        }
        if (c2312c.f8100c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC2311b viewTreeObserverOnPreDrawListenerC2311b = new ViewTreeObserverOnPreDrawListenerC2311b(c2312c);
            c2312c.f8100c = viewTreeObserverOnPreDrawListenerC2311b;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2311b);
        }
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: b */
    public final void mo1630b(InterfaceC2267c interfaceC2267c) {
        this.f2841k.setTag(R.id.glide_custom_view_target_tag, interfaceC2267c);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: c */
    public final void mo1631c(Object obj) {
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: d */
    public final void mo1632d() {
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: e */
    public final void mo1633e(Drawable drawable) {
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: f */
    public final void mo1634f() {
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: g */
    public final void mo1635g(C2270f c2270f) {
        this.f2840j.f8099b.remove(c2270f);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: h */
    public final void mo1636h(Drawable drawable) {
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: i */
    public final InterfaceC2267c mo1637i() {
        Object tag = this.f2841k.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC2267c) {
            return (InterfaceC2267c) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: j */
    public final void mo1638j(Drawable drawable) {
        C2312c c2312c = this.f2840j;
        ViewTreeObserver viewTreeObserver = c2312c.f8098a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2312c.f8100c);
        }
        c2312c.f8100c = null;
        c2312c.f8099b.clear();
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: k */
    public final void mo1639k() {
    }

    public final String toString() {
        return "Target for: " + this.f2841k;
    }
}
