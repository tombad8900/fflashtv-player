package p024c5;

import com.bumptech.glide.AbstractC0714c;
import p010b.AbstractActivityC0522l;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p204x4.C2768k;
import p212y6.InterfaceC2855p;
import p218z4.C2945g0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.h */
/* loaded from: classes.dex */
public final class C0667h extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f2615n = 0;

    /* renamed from: o */
    public int f2616o;

    /* renamed from: p */
    public final /* synthetic */ String f2617p;

    /* renamed from: q */
    public final /* synthetic */ int f2618q;

    /* renamed from: r */
    public final /* synthetic */ int f2619r;

    /* renamed from: s */
    public final /* synthetic */ Object f2620s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667h(AbstractActivityC0522l abstractActivityC0522l, String str, int i, int i4, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2620s = abstractActivityC0522l;
        this.f2617p = str;
        this.f2618q = i;
        this.f2619r = i4;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f2615n) {
        }
        return ((C0667h) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f2615n) {
            case 0:
                return new C0667h((AbstractActivityC0522l) this.f2620s, this.f2617p, this.f2618q, this.f2619r, interfaceC2222c);
            default:
                return new C0667h(this.f2617p, this.f2618q, this.f2619r, (String) this.f2620s, interfaceC2222c);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        switch (this.f2615n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i = this.f2616o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                C2945g0 c2945g0 = C2945g0.f10965a;
                AbstractActivityC0522l abstractActivityC0522l = (AbstractActivityC0522l) this.f2620s;
                this.f2616o = 1;
                Object objM5109k = c2945g0.m5109k(abstractActivityC0522l, this.f2617p, this.f2618q, this.f2619r, this);
                return objM5109k == enumC2273a ? enumC2273a : objM5109k;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i4 = this.f2616o;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                C2768k c2768k = C2768k.f10237a;
                String str = (String) this.f2620s;
                this.f2616o = 1;
                Object objM4854g = c2768k.m4854g(this.f2618q, this.f2619r, this.f2617p, str, this);
                return objM4854g == enumC2273a2 ? enumC2273a2 : objM4854g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667h(String str, int i, int i4, String str2, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2617p = str;
        this.f2618q = i;
        this.f2619r = i4;
        this.f2620s = str2;
    }
}
