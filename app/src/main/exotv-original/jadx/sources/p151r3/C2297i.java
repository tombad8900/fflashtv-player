package p151r3;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.InterfaceC0164v;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.C2180y;
import p076i7.AbstractC1327r;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p139q.C2240b;
import p160s3.C2352c;
import p160s3.C2354e;
import p160s3.C2355f;
import p160s3.C2357h;
import p160s3.EnumC2353d;
import p160s3.EnumC2356g;
import p160s3.InterfaceC2358i;
import p168t2.AbstractC2415i0;
import p169t3.C2433a;
import p177u3.InterfaceC2464d;
import p185v3.AbstractC2534d;
import p185v3.AbstractC2535e;
import p185v3.AbstractC2536f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.i */
/* loaded from: classes.dex */
public final class C2297i {

    /* renamed from: a */
    public final Context f8011a;

    /* renamed from: b */
    public C2291c f8012b;

    /* renamed from: c */
    public Object f8013c;

    /* renamed from: d */
    public C2433a f8014d;

    /* renamed from: e */
    public InterfaceC2298j f8015e;

    /* renamed from: f */
    public final List f8016f;

    /* renamed from: g */
    public InterfaceC2464d f8017g;

    /* renamed from: h */
    public final C2180y.a f8018h;

    /* renamed from: i */
    public final LinkedHashMap f8019i;

    /* renamed from: j */
    public final boolean f8020j;

    /* renamed from: k */
    public final boolean f8021k;

    /* renamed from: l */
    public final C2240b f8022l;

    /* renamed from: m */
    public AbstractC0150o f8023m;

    /* renamed from: n */
    public InterfaceC2358i f8024n;

    /* renamed from: o */
    public EnumC2356g f8025o;

    public C2297i(Context context) {
        this.f8011a = context;
        this.f8012b = AbstractC2534d.f9214a;
        this.f8013c = null;
        this.f8014d = null;
        this.f8015e = null;
        this.f8016f = C1921p.f7187j;
        this.f8017g = null;
        this.f8018h = null;
        this.f8019i = null;
        this.f8020j = true;
        this.f8021k = true;
        this.f8022l = null;
        this.f8023m = null;
        this.f8024n = null;
        this.f8025o = null;
    }

    /* renamed from: a */
    public final C2299k m4096a() {
        AbstractC1327r abstractC1327r;
        Object obj;
        Object obj2 = this.f8013c;
        if (obj2 == null) {
            obj2 = C2301m.f8053b;
        }
        Object obj3 = obj2;
        C2433a c2433a = this.f8014d;
        InterfaceC2298j interfaceC2298j = this.f8015e;
        C2291c c2291c = this.f8012b;
        Bitmap.Config config = c2291c.f8000g;
        EnumC2353d enumC2353d = c2291c.f7999f;
        InterfaceC2464d interfaceC2464d = this.f8017g;
        if (interfaceC2464d == null) {
            interfaceC2464d = c2291c.f7998e;
        }
        InterfaceC2464d interfaceC2464d2 = interfaceC2464d;
        C2180y.a aVar = this.f8018h;
        C2180y c2180yBuild = aVar != null ? aVar.build() : null;
        if (c2180yBuild == null) {
            c2180yBuild = AbstractC2536f.f9218c;
        } else {
            Bitmap.Config[] configArr = AbstractC2536f.f9216a;
        }
        C2180y c2180y = c2180yBuild;
        LinkedHashMap linkedHashMap = this.f8019i;
        C2307s c2307s = linkedHashMap != null ? new C2307s(AbstractC2415i0.m4260G(linkedHashMap)) : null;
        if (c2307s == null) {
            c2307s = C2307s.f8079b;
        }
        C2307s c2307s2 = c2307s;
        C2291c c2291c2 = this.f8012b;
        boolean z7 = c2291c2.f8001h;
        c2291c2.getClass();
        C2291c c2291c3 = this.f8012b;
        EnumC2290b enumC2290b = c2291c3.f8002i;
        EnumC2290b enumC2290b2 = c2291c3.f8003j;
        EnumC2290b enumC2290b3 = c2291c3.f8004k;
        AbstractC1327r abstractC1327r2 = c2291c3.f7994a;
        AbstractC1327r abstractC1327r3 = c2291c3.f7995b;
        AbstractC1327r abstractC1327r4 = c2291c3.f7996c;
        AbstractC1327r abstractC1327r5 = c2291c3.f7997d;
        AbstractC0150o abstractC0150oMo224e = this.f8023m;
        Context context = this.f8011a;
        if (abstractC0150oMo224e == null) {
            C2433a c2433a2 = this.f8014d;
            abstractC1327r = abstractC1327r5;
            Object context2 = c2433a2 instanceof C2433a ? c2433a2.f8786k.getContext() : context;
            while (true) {
                if (context2 instanceof InterfaceC0164v) {
                    abstractC0150oMo224e = ((InterfaceC0164v) context2).mo224e();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    abstractC0150oMo224e = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (abstractC0150oMo224e == null) {
                abstractC0150oMo224e = C2296h.f8009k;
            }
        } else {
            abstractC1327r = abstractC1327r5;
        }
        AbstractC0150o abstractC0150o = abstractC0150oMo224e;
        InterfaceC2358i c2352c = this.f8024n;
        if (c2352c == null) {
            C2433a c2433a3 = this.f8014d;
            if (c2433a3 instanceof C2433a) {
                ImageView imageView = c2433a3.f8786k;
                ImageView.ScaleType scaleType = imageView.getScaleType();
                obj = obj3;
                if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                    C2357h c2357h = C2357h.f8269c;
                    c2352c = new C2354e();
                } else {
                    c2352c = new C2355f(imageView);
                }
            } else {
                obj = obj3;
                c2352c = new C2352c(context);
            }
        } else {
            obj = obj3;
        }
        InterfaceC2358i interfaceC2358i = c2352c;
        EnumC2356g enumC2356g = this.f8025o;
        if (enumC2356g == null) {
            C2433a c2433a4 = this.f8014d;
            if (!(c2433a4 instanceof C2433a)) {
                c2433a4 = null;
            }
            ImageView imageView2 = c2433a4 != null ? c2433a4.f8786k : null;
            if (imageView2 != null) {
                Bitmap.Config[] configArr2 = AbstractC2536f.f9216a;
                ImageView.ScaleType scaleType2 = imageView2.getScaleType();
                int i = scaleType2 == null ? -1 : AbstractC2535e.f9215a[scaleType2.ordinal()];
                enumC2356g = (i == 1 || i == 2 || i == 3 || i == 4) ? EnumC2356g.f8267k : EnumC2356g.f8266j;
            } else {
                enumC2356g = EnumC2356g.f8267k;
            }
        }
        EnumC2356g enumC2356g2 = enumC2356g;
        C2240b c2240b = this.f8022l;
        C2304p c2304p = c2240b != null ? new C2304p(AbstractC2415i0.m4260G(c2240b.f7770a)) : null;
        if (c2304p == null) {
            c2304p = C2304p.f8070k;
        }
        return new C2299k(context, obj, c2433a, interfaceC2298j, config, enumC2353d, this.f8016f, interfaceC2464d2, c2180y, c2307s2, this.f8020j, z7, false, this.f8021k, enumC2290b, enumC2290b2, enumC2290b3, abstractC1327r2, abstractC1327r3, abstractC1327r4, abstractC1327r, abstractC0150o, interfaceC2358i, enumC2356g2, c2304p, new C2292d(this.f8017g), this.f8012b);
    }

    public C2297i(C2299k c2299k, Context context) {
        this.f8011a = context;
        this.f8012b = c2299k.f8026A;
        this.f8013c = c2299k.f8028b;
        this.f8014d = c2299k.f8029c;
        this.f8015e = c2299k.f8030d;
        C2292d c2292d = c2299k.f8052z;
        this.f8016f = c2299k.f8033g;
        this.f8017g = c2292d.f8005a;
        this.f8018h = c2299k.f8035i.newBuilder();
        this.f8019i = AbstractC1924s.m3764Y(c2299k.f8036j.f8080a);
        this.f8020j = c2299k.f8037k;
        this.f8021k = c2299k.f8040n;
        this.f8022l = new C2240b(c2299k.f8051y);
        if (c2299k.f8027a == context) {
            this.f8023m = c2299k.f8048v;
            this.f8024n = c2299k.f8049w;
            this.f8025o = c2299k.f8050x;
        } else {
            this.f8023m = null;
            this.f8024n = null;
            this.f8025o = null;
        }
    }
}
