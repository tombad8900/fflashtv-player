package p195w4;

import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.SeriesDetailActivity;
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
import p204x4.EnumC2770m;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.d1 */
/* loaded from: classes.dex */
public final class C2657d1 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f9669n;

    /* renamed from: o */
    public int f9670o;

    /* renamed from: p */
    public final /* synthetic */ SeriesDetailActivity f9671p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2657d1(SeriesDetailActivity seriesDetailActivity, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f9669n = i;
        this.f9671p = seriesDetailActivity;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f9669n) {
        }
        return ((C2657d1) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f9669n) {
            case 0:
                return new C2657d1(this.f9671p, interfaceC2222c, 0);
            default:
                return new C2657d1(this.f9671p, interfaceC2222c, 1);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4 = "4e44d9029b1270a757cddc766a1bcb63";
        switch (this.f9669n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i = this.f9670o;
                if (i == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C2768k c2768k = C2768k.f10237a;
                    String str5 = "https://api.themoviedb.org/3/tv/" + this.f9671p.f3024b0;
                    AbstractC2980h.m5136e("url", str5);
                    str = AbstractC1206h.m2650v0(str5, '?') ? "&" : "?";
                    C0586i c0586i = C0585h.f2325a;
                    if (c0586i != null && (str2 = c0586i.f2343r) != null) {
                        str4 = str2;
                    }
                    this.f9670o = 1;
                    obj = C2768k.m4851f(str5 + str + "api_key=" + str4, this);
                    if (obj == enumC2273a) {
                        return enumC2273a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                }
                return new JSONObject((String) obj);
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i4 = this.f9670o;
                if (i4 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C2768k c2768k2 = C2768k.f10237a;
                    String str6 = "https://api.themoviedb.org/3/tv/" + this.f9671p.f3024b0 + "/similar";
                    AbstractC2980h.m5136e("url", str6);
                    str = AbstractC1206h.m2650v0(str6, '?') ? "&" : "?";
                    C0586i c0586i2 = C0585h.f2325a;
                    if (c0586i2 != null && (str3 = c0586i2.f2343r) != null) {
                        str4 = str3;
                    }
                    this.f9670o = 1;
                    obj = C2768k.m4851f(str6 + str + "api_key=" + str4, this);
                    if (obj == enumC2273a2) {
                        return enumC2273a2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                }
                JSONObject jSONObject = new JSONObject((String) obj);
                C2780w c2780w = C2780w.f10327a;
                return C2780w.m4864b(jSONObject.optJSONArray("results"), EnumC2770m.f10248k, C1923r.f7189j);
        }
    }
}
