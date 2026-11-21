package p195w4;

import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import p016b5.C0585h;
import p016b5.C0586i;
import p069h7.AbstractC1206h;
import p076i7.InterfaceC1333u;
import p102l6.C1687d;
import p102l6.C1693j;
import p111m6.AbstractC1915j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p204x4.C2768k;
import p204x4.C2780w;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.s */
/* loaded from: classes.dex */
public final class C2687s extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public EnumC2770m f9757n;

    /* renamed from: o */
    public Collection f9758o;

    /* renamed from: p */
    public Iterator f9759p;

    /* renamed from: q */
    public C2671k f9760q;

    /* renamed from: r */
    public C2780w f9761r;

    /* renamed from: s */
    public C2671k f9762s;

    /* renamed from: t */
    public Collection f9763t;

    /* renamed from: u */
    public int f9764u;

    /* renamed from: v */
    public final /* synthetic */ List f9765v;

    /* renamed from: w */
    public final /* synthetic */ EnumC2770m f9766w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2687s(List list, EnumC2770m enumC2770m, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9765v = list;
        this.f9766w = enumC2770m;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2687s) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C2687s(this.f9765v, this.f9766w, interfaceC2222c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00da -> B:37:0x00dc). Please report as a decompilation issue!!! */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        Iterator it;
        EnumC2770m enumC2770m;
        Collection collection;
        String str;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f9764u;
        if (i == 0) {
            AbstractC0714c.m1516d0(obj);
            List list = this.f9765v;
            EnumC2770m enumC2770m2 = this.f9766w;
            ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(list));
            it = list.iterator();
            enumC2770m = enumC2770m2;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = this.f9763t;
            C2671k c2671k = this.f9762s;
            C2780w c2780w = this.f9761r;
            C2671k c2671k2 = this.f9760q;
            it = this.f9759p;
            Collection collection2 = this.f9758o;
            enumC2770m = this.f9757n;
            AbstractC0714c.m1516d0(obj);
            JSONArray jSONArrayOptJSONArray = new JSONObject((String) obj).optJSONArray("results");
            Set set = c2671k2.f9709d;
            c2780w.getClass();
            collection.add(new C1687d(c2671k, C2780w.m4864b(jSONArrayOptJSONArray, enumC2770m, set)));
            collection = collection2;
            if (it.hasNext()) {
                c2671k = (C2671k) it.next();
                String str2 = c2671k.f9706a.f9721c;
                InterfaceC2840a interfaceC2840a = c2671k.f9708c;
                String str3 = interfaceC2840a != null ? (String) interfaceC2840a.invoke() : null;
                if (str3 == null) {
                    str3 = C2181z.FRAGMENT_ENCODE_SET;
                }
                if (str3.length() != 0) {
                    str2 = str2 + (AbstractC1206h.m2650v0(str2, '?') ? "&" : "?") + str3;
                }
                String str4 = "https://api.themoviedb.org/3" + str2;
                AbstractC2980h.m5136e("url", str4);
                String str5 = AbstractC1206h.m2650v0(str4, '?') ? "&" : "?";
                C0586i c0586i = C0585h.f2325a;
                if (c0586i == null || (str = c0586i.f2343r) == null) {
                    str = "4e44d9029b1270a757cddc766a1bcb63";
                }
                String str6 = str4 + str5 + "api_key=" + str;
                c2780w = C2780w.f10327a;
                C2768k c2768k = C2768k.f10237a;
                this.f9757n = enumC2770m;
                this.f9758o = collection;
                this.f9759p = it;
                this.f9760q = c2671k;
                this.f9761r = c2780w;
                this.f9762s = c2671k;
                this.f9763t = collection;
                this.f9764u = 1;
                obj = C2768k.m4851f(str6, this);
                if (obj == enumC2273a) {
                    return enumC2273a;
                }
                collection2 = collection;
                c2671k2 = c2671k;
                JSONArray jSONArrayOptJSONArray2 = new JSONObject((String) obj).optJSONArray("results");
                Set set2 = c2671k2.f9709d;
                c2780w.getClass();
                collection.add(new C1687d(c2671k, C2780w.m4864b(jSONArrayOptJSONArray2, enumC2770m, set2)));
                collection = collection2;
                if (it.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }
}
