package p195w4;

import com.bumptech.glide.AbstractC0714c;
import org.json.JSONObject;
import p016b5.C0585h;
import p016b5.C0586i;
import p069h7.AbstractC1206h;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p111m6.C1923r;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p204x4.C2768k;
import p204x4.C2780w;
import p204x4.C2781x;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.e0 */
/* loaded from: classes.dex */
public final class C2659e0 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public C2781x f9674n;

    /* renamed from: o */
    public int f9675o;

    /* renamed from: p */
    public final /* synthetic */ long f9676p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2659e0(long j, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9676p = j;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2659e0) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C2659e0(this.f9676p, interfaceC2222c);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        String str;
        C2781x c2781x;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f9675o;
        if (i == 0) {
            AbstractC0714c.m1516d0(obj);
            C2781x c2781x2 = C2781x.f10330a;
            C2768k c2768k = C2768k.f10237a;
            String str2 = "https://api.themoviedb.org/3/movie/" + this.f9676p + "/similar";
            AbstractC2980h.m5136e("url", str2);
            String str3 = AbstractC1206h.m2650v0(str2, '?') ? "&" : "?";
            C0586i c0586i = C0585h.f2325a;
            if (c0586i == null || (str = c0586i.f2343r) == null) {
                str = "4e44d9029b1270a757cddc766a1bcb63";
            }
            this.f9674n = c2781x2;
            this.f9675o = 1;
            Object objM4851f = C2768k.m4851f(str2 + str3 + "api_key=" + str, this);
            if (objM4851f == enumC2273a) {
                return enumC2273a;
            }
            c2781x = c2781x2;
            obj = objM4851f;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2781x = this.f9674n;
            AbstractC0714c.m1516d0(obj);
        }
        JSONObject jSONObject = new JSONObject((String) obj);
        c2781x.getClass();
        C2780w c2780w = C2780w.f10327a;
        return C2780w.m4864b(jSONObject.optJSONArray("results"), EnumC2770m.f10247j, C1923r.f7189j);
    }
}
