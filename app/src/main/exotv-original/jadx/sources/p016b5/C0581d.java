package p016b5;

import com.bumptech.glide.AbstractC0714c;
import p002a1.AbstractC0008a1;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;
import p218z4.C2945g0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.d */
/* loaded from: classes.dex */
public final class C0581d extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f2316n;

    /* renamed from: o */
    public int f2317o;

    /* renamed from: p */
    public final /* synthetic */ String f2318p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0581d(String str, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f2316n = i;
        this.f2318p = str;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f2316n) {
        }
        return ((C0581d) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f2316n) {
            case 0:
                return new C0581d(this.f2318p, interfaceC2222c, 0);
            default:
                return new C0581d(this.f2318p, interfaceC2222c, 1);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        switch (this.f2316n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i = this.f2317o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                String strM17m = AbstractC0008a1.m17m("/api/categories/", this.f2318p, "/channels");
                this.f2317o = 1;
                Object objM1332a = C0583f.m1332a(strM17m, this);
                return objM1332a == enumC2273a ? enumC2273a : objM1332a;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i4 = this.f2317o;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                C2945g0 c2945g0 = C2945g0.f10965a;
                this.f2317o = 1;
                Object objM5104c = c2945g0.m5104c(this.f2318p, this);
                return objM5104c == enumC2273a2 ? enumC2273a2 : objM5104c;
        }
    }
}
