package p024c5;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.C0721j;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.exotv.net.MainActivity;
import java.util.concurrent.CancellationException;
import p005a4.C0093n;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p204x4.C2769l;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.z0 */
/* loaded from: classes.dex */
public final class C0705z0 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public int f2761n;

    /* renamed from: o */
    public final /* synthetic */ C0648a1 f2762o;

    /* renamed from: p */
    public final /* synthetic */ C2769l f2763p;

    /* renamed from: q */
    public final /* synthetic */ EnumC2770m f2764q;

    /* renamed from: r */
    public final /* synthetic */ LinearLayout f2765r;

    /* renamed from: s */
    public final /* synthetic */ String f2766s;

    /* renamed from: t */
    public final /* synthetic */ ImageView f2767t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0705z0(C0648a1 c0648a1, C2769l c2769l, EnumC2770m enumC2770m, LinearLayout linearLayout, String str, ImageView imageView, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2762o = c0648a1;
        this.f2763p = c2769l;
        this.f2764q = enumC2770m;
        this.f2765r = linearLayout;
        this.f2766s = str;
        this.f2767t = imageView;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C0705z0) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C0705z0(this.f2762o, this.f2763p, this.f2764q, this.f2765r, this.f2766s, this.f2767t, interfaceC2222c);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        String str;
        MainActivity mainActivity = this.f2762o.f2551a;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f2761n;
        try {
            if (i == 0) {
                AbstractC0714c.m1516d0(obj);
                C0689r0 c0689r0 = C0689r0.f2694a;
                C2769l c2769l = this.f2763p;
                EnumC2770m enumC2770m = this.f2764q;
                this.f2761n = 1;
                obj = c0689r0.m1466e(mainActivity, c2769l, enumC2770m, this);
                if (obj == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0714c.m1516d0(obj);
            }
            str = (String) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            str = null;
        }
        if (str != null) {
            LinearLayout linearLayout = this.f2765r;
            if (AbstractC2980h.m5132a(linearLayout.getTag(), this.f2766s) && linearLayout.isAttachedToWindow()) {
                C0721j c0721j = (C0721j) ComponentCallbacks2C0713b.m1485b(mainActivity).m3884d(mainActivity).m1660m(str).m4054d(C0093n.f435b);
                ImageView imageView = this.f2767t;
                c0721j.m1626u(imageView);
                imageView.setVisibility(0);
            }
        }
        return C1693j.f6497a;
    }
}
