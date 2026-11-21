package p108m3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.AbstractC0714c;
import java.util.LinkedHashMap;
import p065h3.C1158c;
import p065h3.C1159d;
import p065h3.C1163h;
import p073i3.EnumC1257f;
import p076i7.InterfaceC1333u;
import p095l.C1629o;
import p099l3.C1672n;
import p102l6.C1693j;
import p134p3.C2207a;
import p134p3.C2209c;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p151r3.C2299k;
import p151r3.C2303o;
import p151r3.C2306r;
import p154r6.AbstractC2325h;
import p168t2.AbstractC2415i0;
import p185v3.AbstractC2536f;
import p185v3.ComponentCallbacks2C2542l;
import p212y6.InterfaceC2855p;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m3.d */
/* loaded from: classes.dex */
public final class C1889d extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f7052n = 1;

    /* renamed from: o */
    public int f7053o;

    /* renamed from: p */
    public final /* synthetic */ C1893h f7054p;

    /* renamed from: q */
    public final /* synthetic */ C2299k f7055q;

    /* renamed from: r */
    public final /* synthetic */ Object f7056r;

    /* renamed from: s */
    public final /* synthetic */ C1159d f7057s;

    /* renamed from: t */
    public final /* synthetic */ Object f7058t;

    /* renamed from: u */
    public final /* synthetic */ Object f7059u;

    /* renamed from: v */
    public final /* synthetic */ Object f7060v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889d(C1893h c1893h, C2299k c2299k, Object obj, C2303o c2303o, C1159d c1159d, C2207a c2207a, C1895j c1895j, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f7054p = c1893h;
        this.f7055q = c2299k;
        this.f7056r = obj;
        this.f7058t = c2303o;
        this.f7057s = c1159d;
        this.f7059u = c2207a;
        this.f7060v = c1895j;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f7052n) {
        }
        return ((C1889d) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f7052n) {
            case 0:
                return new C1889d(this.f7054p, (C2986n) this.f7058t, (C2986n) this.f7059u, this.f7055q, this.f7056r, (C2986n) this.f7060v, this.f7057s, interfaceC2222c);
            default:
                return new C1889d(this.f7054p, this.f7055q, this.f7056r, (C2303o) this.f7058t, this.f7057s, (C2207a) this.f7059u, (C1895j) this.f7060v, interfaceC2222c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        Object objM3667b;
        C2209c c2209c;
        Bitmap bitmap;
        boolean z7;
        switch (this.f7052n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i = this.f7053o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                C1893h c1893h = this.f7054p;
                C1672n c1672n = (C1672n) ((C2986n) this.f7058t).f11117j;
                C1158c c1158c = (C1158c) ((C2986n) this.f7059u).f11117j;
                C2299k c2299k = this.f7055q;
                Object obj2 = this.f7056r;
                C2303o c2303o = (C2303o) ((C2986n) this.f7060v).f11117j;
                C1159d c1159d = this.f7057s;
                this.f7053o = 1;
                Object objM3666a = C1893h.m3666a(c1893h, c1672n, c1158c, c2299k, obj2, c2303o, c1159d, this);
                return objM3666a == enumC2273a ? enumC2273a : objM3666a;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i4 = this.f7053o;
                if (i4 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C1893h c1893h2 = this.f7054p;
                    C2299k c2299k2 = this.f7055q;
                    Object obj3 = this.f7056r;
                    C2303o c2303o2 = (C2303o) this.f7058t;
                    C1159d c1159d2 = this.f7057s;
                    this.f7053o = 1;
                    objM3667b = C1893h.m3667b(c1893h2, c2299k2, obj3, c2303o2, c1159d2, this);
                    if (objM3667b == enumC2273a2) {
                        return enumC2273a2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    objM3667b = obj;
                }
                C1886a c1886a = (C1886a) objM3667b;
                ComponentCallbacks2C2542l componentCallbacks2C2542l = this.f7054p.f7089b;
                synchronized (componentCallbacks2C2542l) {
                    try {
                        C1163h c1163h = (C1163h) componentCallbacks2C2542l.f9233j.get();
                        if (c1163h == null) {
                            componentCallbacks2C2542l.m4560b();
                        } else if (componentCallbacks2C2542l.f9234k == null) {
                            Context context = c1163h.f4993a;
                            componentCallbacks2C2542l.f9234k = context;
                            context.registerComponentCallbacks(componentCallbacks2C2542l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C1629o c1629o = this.f7054p.f7091d;
                C2207a c2207a = (C2207a) this.f7059u;
                if (this.f7055q.f8041o.f7993k && (c2209c = (C2209c) ((C1163h) c1629o.f6229j).f4995c.getValue()) != null && c2207a != null) {
                    Drawable drawable = c1886a.f7026a;
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                        z7 = false;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c1886a.f7027b));
                        String str = c1886a.f7029d;
                        if (str != null) {
                            linkedHashMap.put("coil#disk_cache_key", str);
                        }
                        c2209c.f7723a.mo50g(new C2207a(c2207a.f7719j, AbstractC2415i0.m4260G(c2207a.f7720k)), bitmap, AbstractC2415i0.m4260G(linkedHashMap));
                        z7 = true;
                    }
                }
                Drawable drawable2 = c1886a.f7026a;
                C2299k c2299k3 = this.f7055q;
                EnumC1257f enumC1257f = c1886a.f7028c;
                C2207a c2207a2 = z7 ? (C2207a) this.f7059u : null;
                String str2 = c1886a.f7029d;
                boolean z8 = c1886a.f7027b;
                C1895j c1895j = (C1895j) this.f7060v;
                Bitmap.Config[] configArr = AbstractC2536f.f9216a;
                return new C2306r(drawable2, c2299k3, enumC1257f, c2207a2, str2, z8, c1895j != null && c1895j.f7103g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889d(C1893h c1893h, C2986n c2986n, C2986n c2986n2, C2299k c2299k, Object obj, C2986n c2986n3, C1159d c1159d, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f7054p = c1893h;
        this.f7058t = c2986n;
        this.f7059u = c2986n2;
        this.f7055q = c2299k;
        this.f7056r = obj;
        this.f7060v = c2986n3;
        this.f7057s = c1159d;
    }
}
