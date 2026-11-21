package p082j3;

import androidx.lifecycle.AbstractC0150o;
import com.bumptech.glide.AbstractC0714c;
import java.io.IOException;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p151r3.C2308t;
import p151r3.ViewOnAttachStateChangeListenerC2309u;
import p154r6.AbstractC2325h;
import p169t3.C2433a;
import p189v7.AbstractC2557b;
import p189v7.C2567g;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.e */
/* loaded from: classes.dex */
public final class C1492e extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f5738n;

    /* renamed from: o */
    public final /* synthetic */ Object f5739o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1492e(Object obj, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f5738n = i;
        this.f5739o = obj;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) throws Throwable {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f5738n) {
            case 0:
                return ((C1492e) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
            default:
                C1492e c1492e = (C1492e) mo577g(interfaceC1333u, interfaceC2222c);
                C1693j c1693j = C1693j.f6497a;
                c1492e.mo578h(c1693j);
                return c1693j;
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f5738n) {
            case 0:
                return new C1492e((C1493f) this.f5739o, interfaceC2222c, 0);
            default:
                return new C1492e((ViewOnAttachStateChangeListenerC2309u) this.f5739o, interfaceC2222c, 1);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        switch (this.f5738n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                C1493f c1493f = (C1493f) this.f5739o;
                synchronized (c1493f) {
                    if (!c1493f.f5752u || c1493f.f5753v) {
                        return C1693j.f6497a;
                    }
                    try {
                        c1493f.m3169G();
                    } catch (IOException unused) {
                        c1493f.f5754w = true;
                    }
                    try {
                        if (c1493f.f5749r >= 2000) {
                            c1493f.m3170I();
                        }
                    } catch (IOException unused2) {
                        c1493f.f5755x = true;
                        c1493f.f5750s = AbstractC2557b.m4577b(new C2567g());
                    }
                    return C1693j.f6497a;
                }
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                ViewOnAttachStateChangeListenerC2309u viewOnAttachStateChangeListenerC2309u = (ViewOnAttachStateChangeListenerC2309u) this.f5739o;
                C2308t c2308t = viewOnAttachStateChangeListenerC2309u.f8089m;
                if (c2308t != null) {
                    AbstractC0150o abstractC0150o = c2308t.f8084m;
                    AbstractC1339x.m2841b(c2308t.f8085n);
                    C2433a c2433a = c2308t.f8083l;
                    if (c2433a != null) {
                        abstractC0150o.mo575i(c2433a);
                    }
                    abstractC0150o.mo575i(c2308t);
                }
                viewOnAttachStateChangeListenerC2309u.f8089m = null;
                return C1693j.f6497a;
        }
    }
}
