package p100l4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p144q4.C2270f;
import p144q4.InterfaceC2267c;
import p152r4.InterfaceC2314e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l4.d */
/* loaded from: classes.dex */
public final class C1676d implements InterfaceC2314e {

    /* renamed from: j */
    public final int f6430j;

    /* renamed from: k */
    public final int f6431k;

    /* renamed from: l */
    public InterfaceC2267c f6432l;

    /* renamed from: m */
    public final Handler f6433m;

    /* renamed from: n */
    public final int f6434n;

    /* renamed from: o */
    public final long f6435o;

    /* renamed from: p */
    public Bitmap f6436p;

    public C1676d(Handler handler, int i, long j) {
        if (!AbstractC2478m.m4461i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f6430j = Integer.MIN_VALUE;
        this.f6431k = Integer.MIN_VALUE;
        this.f6433m = handler;
        this.f6434n = i;
        this.f6435o = j;
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: a */
    public final void mo1629a(C2270f c2270f) throws Throwable {
        c2270f.m4082l(this.f6430j, this.f6431k);
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: b */
    public final void mo1630b(InterfaceC2267c interfaceC2267c) {
        this.f6432l = interfaceC2267c;
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: c */
    public final void mo1631c(Object obj) {
        this.f6436p = (Bitmap) obj;
        Handler handler = this.f6433m;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f6435o);
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
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: h */
    public final void mo1636h(Drawable drawable) {
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: i */
    public final InterfaceC2267c mo1637i() {
        return this.f6432l;
    }

    @Override // p152r4.InterfaceC2314e
    /* renamed from: j */
    public final void mo1638j(Drawable drawable) {
        this.f6436p = null;
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: k */
    public final void mo1639k() {
    }
}
