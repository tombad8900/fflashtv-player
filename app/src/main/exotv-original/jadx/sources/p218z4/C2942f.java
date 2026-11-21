package p218z4;

import com.bumptech.glide.AbstractC0714c;
import okhttp3.AbstractC2160j0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import p016b5.AbstractC0590m;
import p016b5.C0586i;
import p069h7.AbstractC1206h;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.f */
/* loaded from: classes.dex */
public final class C2942f extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ String f10954n;

    /* renamed from: o */
    public final /* synthetic */ C0586i f10955o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2942f(String str, C0586i c0586i, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f10954n = str;
        this.f10955o = c0586i;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2942f) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C2942f(this.f10954n, this.f10955o, interfaceC2222c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        AbstractC0714c.m1516d0(obj);
        try {
            C2076g0.a aVarUrl = new C2076g0.a().url(this.f10954n);
            C2952k c2952k = C2952k.f11010a;
            String str = (String) this.f10955o.f2341p.get("User-Agent");
            if (str == null) {
                str = "okhttp/5.4.0";
            } else {
                if (AbstractC1206h.m2630D0(str)) {
                    str = null;
                }
                if (str == null) {
                }
            }
            C2080i0 c2080i0Execute = AbstractC0590m.f2359a.newCall(aVarUrl.header("User-Agent", str).build()).execute();
            try {
                AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
                String strString = abstractC2160j0Body != null ? abstractC2160j0Body.string() : null;
                if (strString == null) {
                    strString = C2181z.FRAGMENT_ENCODE_SET;
                }
                String string = AbstractC1206h.m2645S0(strString).toString();
                c2080i0Execute.close();
                return string;
            } finally {
            }
        } catch (Throwable unused) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
    }
}
