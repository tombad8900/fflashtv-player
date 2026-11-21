package p204x4;

import com.bumptech.glide.AbstractC0714c;
import java.io.IOException;
import okhttp3.AbstractC2160j0;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import org.json.JSONObject;
import p069h7.AbstractC1206h;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.h */
/* loaded from: classes.dex */
public final class C2765h extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f10229n;

    /* renamed from: o */
    public final /* synthetic */ String f10230o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2765h(String str, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f10229n = i;
        this.f10230o = str;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f10229n) {
        }
        return ((C2765h) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f10229n) {
            case 0:
                return new C2765h(this.f10230o, interfaceC2222c, 0);
            default:
                return new C2765h(this.f10230o, interfaceC2222c, 1);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        C2080i0 c2080i0Execute;
        byte[] bArrBytes;
        int i = this.f10229n;
        String str = this.f10230o;
        switch (i) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                c2080i0Execute = C2768k.f10239c.newCall(C2768k.m4847a(str, null)).execute();
                try {
                    if (!c2080i0Execute.isSuccessful()) {
                        throw new IOException("HTTP " + c2080i0Execute.code());
                    }
                    AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
                    if (abstractC2160j0Body == null || (bArrBytes = abstractC2160j0Body.bytes()) == null) {
                        throw new IOException("empty body");
                    }
                    c2080i0Execute.close();
                    return bArrBytes;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                try {
                    c2080i0Execute = C2768k.f10239c.newCall(C2768k.m4847a(str, null)).execute();
                    try {
                        AbstractC2160j0 abstractC2160j0Body2 = c2080i0Execute.body();
                        String strString = abstractC2160j0Body2 != null ? abstractC2160j0Body2.string() : null;
                        if (strString == null) {
                            strString = C2181z.FRAGMENT_ENCODE_SET;
                        }
                        JSONObject jSONObject = AbstractC1206h.m2630D0(strString) ? null : new JSONObject(strString);
                        c2080i0Execute.close();
                        return jSONObject;
                    } finally {
                    }
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
