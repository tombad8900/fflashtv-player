package p218z4;

import android.content.Context;
import com.bumptech.glide.AbstractC0714c;
import java.util.Map;
import okhttp3.AbstractC2160j0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import org.json.JSONObject;
import org.json.JSONTokener;
import p016b5.AbstractC0590m;
import p016b5.C0586i;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.i */
/* loaded from: classes.dex */
public final class C2948i extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ String f10988n;

    /* renamed from: o */
    public final /* synthetic */ C0586i f10989o;

    /* renamed from: p */
    public final /* synthetic */ Context f10990p;

    /* renamed from: q */
    public final /* synthetic */ String f10991q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2948i(String str, C0586i c0586i, Context context, String str2, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f10988n = str;
        this.f10989o = c0586i;
        this.f10990p = context;
        this.f10991q = str2;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2948i) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C2948i(this.f10988n, this.f10989o, this.f10990p, this.f10991q, interfaceC2222c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        Object objNextValue;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        AbstractC0714c.m1516d0(obj);
        String str = this.f10988n;
        boolean zM2667t0 = AbstractC1214p.m2667t0(str, "http", false);
        C0586i c0586i = this.f10989o;
        if (!zM2667t0) {
            C2952k c2952k = C2952k.f11010a;
            String str2 = c0586i.f2340o;
            if (str2 == null) {
                str2 = "https://nonz.vevi-cobty-14-b.club/genral/api/v3";
                str = str2 + "/" + AbstractC1206h.m2648V0(str, '/');
            } else {
                if (AbstractC1206h.m2630D0(str2)) {
                    str2 = null;
                }
                if (str2 == null) {
                }
                str = str2 + "/" + AbstractC1206h.m2648V0(str, '/');
            }
        }
        try {
            C2076g0.a aVarUrl = new C2076g0.a().url(str);
            for (Map.Entry entry : C2952k.m5113a(c0586i, this.f10990p, this.f10991q).entrySet()) {
                aVarUrl.header((String) entry.getKey(), (String) entry.getValue());
            }
            C2080i0 c2080i0Execute = AbstractC0590m.f2359a.newCall(aVarUrl.build()).execute();
            try {
                AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
                String strString = abstractC2160j0Body != null ? abstractC2160j0Body.string() : null;
                if (strString == null) {
                    strString = C2181z.FRAGMENT_ENCODE_SET;
                }
                c2080i0Execute.close();
                try {
                    objNextValue = new JSONTokener(strString).nextValue();
                } catch (Throwable unused) {
                    objNextValue = strString;
                }
                AbstractC2980h.m5133b(objNextValue);
                if (objNextValue instanceof JSONObject) {
                    Object objOpt = ((JSONObject) objNextValue).opt("data");
                    if (objOpt instanceof String) {
                        C2952k c2952k2 = C2952k.f11010a;
                        String strM5117e = C2952k.m5117e((String) objOpt);
                        if (strM5117e.length() > 0) {
                            try {
                                return new JSONTokener(strM5117e).nextValue();
                            } catch (Throwable unused2) {
                                return strString;
                            }
                        }
                    }
                }
                return objNextValue;
            } finally {
            }
        } catch (Throwable unused3) {
            return null;
        }
    }
}
