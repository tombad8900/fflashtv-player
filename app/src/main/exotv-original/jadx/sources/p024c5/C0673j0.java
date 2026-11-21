package p024c5;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.AbstractC0714c;
import java.util.concurrent.CancellationException;
import p065h3.C1159d;
import p065h3.C1163h;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p108m3.C1895j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p151r3.C2299k;
import p154r6.AbstractC2325h;
import p160s3.C2357h;
import p204x4.C2769l;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.j0 */
/* loaded from: classes.dex */
public final class C0673j0 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f2642n;

    /* renamed from: o */
    public int f2643o;

    /* renamed from: p */
    public final /* synthetic */ Object f2644p;

    /* renamed from: q */
    public final /* synthetic */ Object f2645q;

    /* renamed from: r */
    public final /* synthetic */ Object f2646r;

    /* renamed from: s */
    public final /* synthetic */ Object f2647s;

    /* renamed from: t */
    public final /* synthetic */ Object f2648t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0673j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f2642n = i;
        this.f2644p = obj;
        this.f2645q = obj2;
        this.f2646r = obj3;
        this.f2647s = obj4;
        this.f2648t = obj5;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f2642n) {
        }
        return ((C0673j0) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f2642n) {
            case 0:
                return new C0673j0((Context) this.f2644p, (C2769l) this.f2645q, (C0675k0) this.f2646r, (C0671i0) this.f2647s, (String) this.f2648t, interfaceC2222c, 0);
            default:
                return new C0673j0((C2299k) this.f2644p, (C1163h) this.f2645q, (C2357h) this.f2646r, (C1159d) this.f2647s, (Bitmap) this.f2648t, interfaceC2222c, 1);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        switch (this.f2642n) {
            case 0:
                C0675k0 c0675k0 = (C0675k0) this.f2646r;
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i = this.f2643o;
                C1693j c1693j = C1693j.f6497a;
                try {
                    if (i == 0) {
                        AbstractC0714c.m1516d0(obj);
                        C0689r0 c0689r0 = C0689r0.f2694a;
                        Context context = (Context) this.f2644p;
                        C2769l c2769l = (C2769l) this.f2645q;
                        EnumC2770m enumC2770m = c0675k0.f2656h;
                        this.f2643o = 1;
                        obj = c0689r0.m1466e(context, c2769l, enumC2770m, this);
                        if (obj == enumC2273a) {
                            return enumC2273a;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0714c.m1516d0(obj);
                    }
                    String str = (String) obj;
                    if (str != null) {
                        C0675k0.m1454g((C0671i0) this.f2647s, (String) this.f2648t, str);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return c1693j;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i4 = this.f2643o;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                C2299k c2299k = (C2299k) this.f2644p;
                C1895j c1895j = new C1895j(c2299k, ((C1163h) this.f2645q).f5000h, 0, c2299k, (C2357h) this.f2646r, (C1159d) this.f2647s, ((Bitmap) this.f2648t) != null);
                this.f2643o = 1;
                Object objM3671b = c1895j.m3671b(c2299k, this);
                return objM3671b == enumC2273a2 ? enumC2273a2 : objM3671b;
        }
    }
}
