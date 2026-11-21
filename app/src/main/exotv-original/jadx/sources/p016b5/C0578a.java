package p016b5;

import com.bumptech.glide.AbstractC0714c;
import java.util.Map;
import okhttp3.AbstractC2160j0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import p069h7.AbstractC1206h;
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
/* renamed from: b5.a */
/* loaded from: classes.dex */
public final class C0578a extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public int f2311n;

    /* renamed from: o */
    public final /* synthetic */ String f2312o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578a(String str, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2312o = str;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C0578a) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C0578a(this.f2312o, interfaceC2222c);
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Map] */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f2311n;
        try {
            if (i == 0) {
                AbstractC0714c.m1516d0(obj);
                this.f2311n = 1;
                obj = C0585h.f2325a;
                if (obj == null) {
                    C2054e c2054e = AbstractC1290e0.f5316a;
                    obj = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0584g(2, null), this);
                }
                if (obj == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0714c.m1516d0(obj);
            }
            C0586i c0586i = (C0586i) obj;
            String str = c0586i.f2334i;
            if (str != null) {
                if (AbstractC1206h.m2630D0(str)) {
                    str = null;
                }
                if (str != null) {
                    C2076g0.a aVarUrl = new C2076g0.a().url(str + this.f2312o + "?_=" + System.currentTimeMillis());
                    for (Map.Entry entry : c0586i.f2335j.entrySet()) {
                        aVarUrl.header((String) entry.getKey(), (String) entry.getValue());
                    }
                    C2080i0 c2080i0Execute = AbstractC0590m.f2359a.newCall(aVarUrl.build()).execute();
                    try {
                        AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
                        String strString = abstractC2160j0Body != null ? abstractC2160j0Body.string() : null;
                        if (strString == null) {
                            strString = C2181z.FRAGMENT_ENCODE_SET;
                        }
                        C0587j c0587j = new C0587j(strString, C2080i0.header$default(c2080i0Execute, "t", null, 2, null));
                        c2080i0Execute.close();
                        return c0587j;
                    } finally {
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
