package p195w4;

import com.bumptech.glide.AbstractC0714c;
import p016b5.C0584g;
import p016b5.C0585h;
import p016b5.C0589l;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.u */
/* loaded from: classes.dex */
public final class C2691u extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public int f9777n;

    /* renamed from: o */
    public final /* synthetic */ boolean f9778o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2691u(boolean z7, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9778o = z7;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2691u) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C2691u(this.f9778o, interfaceC2222c);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f9777n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(obj);
            return obj;
        }
        AbstractC0714c.m1516d0(obj);
        if (this.f9778o) {
            C0589l.f2355a.set(null);
        }
        boolean z7 = this.f9778o;
        this.f9777n = 1;
        Object objM2857r = C0585h.f2325a;
        if (objM2857r == null || z7) {
            C2054e c2054e = AbstractC1290e0.f5316a;
            objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0584g(2, null), this);
        }
        return objM2857r == enumC2273a ? enumC2273a : objM2857r;
    }
}
