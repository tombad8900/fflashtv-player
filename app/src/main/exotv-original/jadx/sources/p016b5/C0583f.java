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
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.f */
/* loaded from: classes.dex */
public final class C0583f {

    /* renamed from: a */
    public static final C0583f f2323a = new C0583f();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1332a(String str, AbstractC2320c abstractC2320c) throws Throwable {
        C0582e c0582e;
        C0586i c0586i;
        String strM1333b;
        C0583f c0583f = f2323a;
        if (abstractC2320c instanceof C0582e) {
            c0582e = (C0582e) abstractC2320c;
            int i = c0582e.f2322p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0582e.f2322p = i - Integer.MIN_VALUE;
            } else {
                c0582e = new C0582e(abstractC2320c);
            }
        }
        Object objM2857r = c0582e.f2321o;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c0582e.f2322p;
        try {
            if (i4 == 0) {
                AbstractC0714c.m1516d0(objM2857r);
                c0582e.f2319m = c0583f;
                c0582e.f2320n = str;
                c0582e.f2322p = 1;
                objM2857r = C0585h.f2325a;
                if (objM2857r == null) {
                    C2054e c2054e = AbstractC1290e0.f5316a;
                    objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0584g(2, null), c0582e);
                }
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c0582e.f2320n;
                c0583f = c0582e.f2319m;
                AbstractC0714c.m1516d0(objM2857r);
            }
            c0586i = (C0586i) objM2857r;
            c0583f.getClass();
            strM1333b = m1333b(c0586i);
        } catch (Throwable unused) {
        }
        if (strM1333b.length() == 0) {
            return null;
        }
        int i8 = AbstractC1206h.m2650v0(str, '?') ? 38 : 63;
        C2076g0.a aVarUrl = new C2076g0.a().url(strM1333b + str + ((char) i8) + "_=" + System.currentTimeMillis());
        for (Map.Entry entry : (!c0586i.f2339n.isEmpty() ? c0586i.f2339n : c0586i.f2335j).entrySet()) {
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1333b(C0586i c0586i) {
        AbstractC2980h.m5136e("cfg", c0586i);
        String str = c0586i.f2338m;
        String str2 = null;
        if (str == null) {
            String str3 = c0586i.f2334i;
            if (str3 != null && !AbstractC1206h.m2630D0(str3)) {
                str2 = str3;
            }
            str = str2 == null ? C2181z.FRAGMENT_ENCODE_SET : str2;
        } else {
            if (AbstractC1206h.m2630D0(str)) {
                str = null;
            }
            if (str == null) {
            }
        }
        String strM2646T0 = AbstractC1206h.m2646T0(AbstractC1206h.m2645S0(str).toString(), '/');
        if (strM2646T0.length() == 0) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        int iM2628B0 = AbstractC1206h.m2628B0(strM2646T0, "/api", 0, false, 6);
        if (iM2628B0 <= 0) {
            return strM2646T0;
        }
        String strSubstring = strM2646T0.substring(0, iM2628B0);
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }
}
