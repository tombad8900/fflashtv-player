package p099l3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.util.Map;
import okhttp3.AbstractC2160j0;
import okhttp3.C2070d0;
import okhttp3.C2071e;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.InterfaceC2073f;
import okhttp3.InterfaceC2075g;
import p002a1.C0036o;
import p002a1.C0048u;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p073i3.C1265n;
import p073i3.C1268q;
import p073i3.EnumC1257f;
import p076i7.C1295g;
import p082j3.C1488a;
import p082j3.C1490c;
import p082j3.C1493f;
import p082j3.C1495h;
import p082j3.C1496i;
import p090k2.C1584b;
import p102l6.C1690g;
import p137p6.InterfaceC2222c;
import p143q3.AbstractC2261c;
import p143q3.C2260b;
import p143q3.C2262d;
import p143q3.C2263e;
import p146q6.EnumC2273a;
import p151r3.C2303o;
import p151r3.EnumC2290b;
import p154r6.AbstractC2320c;
import p185v3.AbstractC2536f;
import p185v3.C2537g;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2585p;
import p189v7.C2558b0;
import p189v7.C2562d0;
import p189v7.C2564e0;
import p189v7.C2579m;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.m */
/* loaded from: classes.dex */
public final class C1671m implements InterfaceC1666h {

    /* renamed from: f */
    public static final C2071e f6402f = new C2071e.a().noCache().noStore().build();

    /* renamed from: g */
    public static final C2071e f6403g = new C2071e.a().noCache().onlyIfCached().build();

    /* renamed from: a */
    public final String f6404a;

    /* renamed from: b */
    public final C2303o f6405b;

    /* renamed from: c */
    public final C1690g f6406c;

    /* renamed from: d */
    public final C1690g f6407d;

    /* renamed from: e */
    public final boolean f6408e;

    public C1671m(String str, C2303o c2303o, C1690g c1690g, C1690g c1690g2, boolean z7) {
        this.f6404a = str;
        this.f6405b = c2303o;
        this.f6406c = c1690g;
        this.f6407d = c1690g2;
        this.f6408e = z7;
    }

    /* renamed from: d */
    public static String m3367d(String str, C2070d0 c2070d0) {
        String strM4555b;
        String string = c2070d0 != null ? c2070d0.toString() : null;
        if ((string == null || AbstractC1214p.m2667t0(string, "text/plain", false)) && (strM4555b = AbstractC2536f.m4555b(MimeTypeMap.getSingleton(), str)) != null) {
            return strM4555b;
        }
        if (string != null) {
            return AbstractC1206h.m2642P0(string, ';', string);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020f A[Catch: Exception -> 0x018d, TryCatch #1 {Exception -> 0x018d, blocks: (B:92:0x01dc, B:94:0x01e4, B:96:0x0206, B:98:0x020b, B:97:0x0209, B:100:0x020f, B:101:0x0214, B:68:0x015d, B:71:0x0169, B:73:0x0175, B:75:0x0183, B:79:0x018f, B:81:0x019b, B:83:0x01b8, B:85:0x01bd, B:84:0x01bb, B:87:0x01c1), top: B:110:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: Exception -> 0x00cd, TRY_ENTER, TryCatch #0 {Exception -> 0x00cd, blocks: (B:102:0x0215, B:103:0x0218, B:66:0x0153, B:104:0x0219, B:105:0x021e, B:36:0x0093, B:38:0x009d, B:47:0x00d1, B:49:0x00d5, B:52:0x00ee, B:62:0x013a, B:54:0x0106, B:56:0x0112, B:57:0x011b, B:41:0x00b3, B:43:0x00bd, B:59:0x0125, B:60:0x012c, B:61:0x012d), top: B:109:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:102:0x0215, B:103:0x0218, B:66:0x0153, B:104:0x0219, B:105:0x021e, B:36:0x0093, B:38:0x009d, B:47:0x00d1, B:49:0x00d5, B:52:0x00ee, B:62:0x013a, B:54:0x0106, B:56:0x0112, B:57:0x011b, B:41:0x00b3, B:43:0x00bd, B:59:0x0125, B:60:0x012c, B:61:0x012d), top: B:109:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4 A[Catch: Exception -> 0x018d, TryCatch #1 {Exception -> 0x018d, blocks: (B:92:0x01dc, B:94:0x01e4, B:96:0x0206, B:98:0x020b, B:97:0x0209, B:100:0x020f, B:101:0x0214, B:68:0x015d, B:71:0x0169, B:73:0x0175, B:75:0x0183, B:79:0x018f, B:81:0x019b, B:83:0x01b8, B:85:0x01bd, B:84:0x01bb, B:87:0x01c1), top: B:110:0x015d }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, l6.b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, l6.b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, l6.b] */
    @Override // p099l3.InterfaceC1666h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3366a(InterfaceC2222c interfaceC2222c) throws Exception {
        C1670l c1670l;
        C1495h c1495h;
        C1495h c1495h2;
        C2263e c2263eM4051a;
        Object objM3368b;
        C2263e c2263e;
        C1671m c1671m;
        C1496i c1496i;
        C2080i0 c2080i0;
        Exception e;
        C1671m c1671m2;
        AbstractC2160j0 abstractC2160j0Body;
        if (interfaceC2222c instanceof C1670l) {
            c1670l = (C1670l) interfaceC2222c;
            int i = c1670l.f6401r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1670l.f6401r = i - Integer.MIN_VALUE;
            } else {
                c1670l = new C1670l(this, (AbstractC2320c) interfaceC2222c);
            }
        }
        Object obj = c1670l.f6399p;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        ?? r22 = c1670l.f6401r;
        try {
            if (r22 == 0) {
                AbstractC0714c.m1516d0(obj);
                C2303o c2303o = this.f6405b;
                boolean z7 = c2303o.f8068n.f7992j;
                String str = this.f6404a;
                if (z7 && (c1496i = (C1496i) this.f6407d.getValue()) != null) {
                    String str2 = c2303o.f8063i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    C1493f c1493f = c1496i.f5761b;
                    C2579m c2579m = C2579m.f9316m;
                    C1490c c1490cM3172g = c1493f.m3172g(C1584b.m3251p(str2).mo4633c("SHA-256").mo4635e());
                    if (c1490cM3172g != null) {
                        c1495h2 = new C1495h(c1490cM3172g);
                    }
                    if (c1495h2 == null) {
                        AbstractC2585p abstractC2585pM3369c = m3369c();
                        C1490c c1490c = c1495h2.f5759j;
                        if (c1490c.f5735k) {
                            throw new IllegalStateException("snapshot is closed");
                        }
                        Long l8 = (Long) abstractC2585pM3369c.m4679h((C2558b0) c1490c.f5734j.f5727c.get(0)).f9092e;
                        if (l8 != null && l8.longValue() == 0) {
                            return new C1672n(m3372g(c1495h2), m3367d(str, null), EnumC1257f.f5253l);
                        }
                        if (!this.f6408e) {
                            C1265n c1265nM3372g = m3372g(c1495h2);
                            C2260b c2260bM3371f = m3371f(c1495h2);
                            return new C1672n(c1265nM3372g, m3367d(str, c2260bM3371f != null ? (C2070d0) c2260bM3371f.f7873b.getValue() : null), EnumC1257f.f5253l);
                        }
                        c2263eM4051a = new C2262d(m3370e(), m3371f(c1495h2)).m4051a();
                        C2260b c2260b = c2263eM4051a.f7890b;
                        if (c2263eM4051a.f7889a == null && c2260b != null) {
                            return new C1672n(m3372g(c1495h2), m3367d(str, (C2070d0) c2260b.f7873b.getValue()), EnumC1257f.f5253l);
                        }
                    } else {
                        c2263eM4051a = new C2262d(m3370e(), null).m4051a();
                    }
                    C2076g0 c2076g0 = c2263eM4051a.f7889a;
                    AbstractC2980h.m5133b(c2076g0);
                    c1670l.f6396m = this;
                    c1670l.f6397n = c1495h2;
                    c1670l.f6398o = c2263eM4051a;
                    c1670l.f6401r = 1;
                    objM3368b = m3368b(c2076g0, c1670l);
                    if (objM3368b != enumC2273a) {
                        return enumC2273a;
                    }
                    c2263e = c2263eM4051a;
                    obj = objM3368b;
                    c1671m = this;
                }
                c1495h2 = null;
                if (c1495h2 == null) {
                }
                C2076g0 c2076g02 = c2263eM4051a.f7889a;
                AbstractC2980h.m5133b(c2076g02);
                c1670l.f6396m = this;
                c1670l.f6397n = c1495h2;
                c1670l.f6398o = c2263eM4051a;
                c1670l.f6401r = 1;
                objM3368b = m3368b(c2076g02, c1670l);
                if (objM3368b != enumC2273a) {
                }
            } else {
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2080i0 = (C2080i0) c1670l.f6398o;
                    C1495h c1495h3 = c1670l.f6397n;
                    c1671m2 = c1670l.f6396m;
                    try {
                        AbstractC0714c.m1516d0(obj);
                        C2080i0 c2080i02 = (C2080i0) obj;
                        Bitmap.Config[] configArr = AbstractC2536f.f9216a;
                        abstractC2160j0Body = c2080i02.body();
                        if (abstractC2160j0Body != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        c1671m2.getClass();
                        InterfaceC2577l interfaceC2577lSource = abstractC2160j0Body.source();
                        Context context = c1671m2.f6405b.f8055a;
                        return new C1672n(new C1268q(interfaceC2577lSource, null), m3367d(c1671m2.f6404a, abstractC2160j0Body.contentType()), c2080i02.networkResponse() != null ? EnumC1257f.f5254m : EnumC1257f.f5253l);
                    } catch (Exception e8) {
                        e = e8;
                        AbstractC2536f.m4554a(c2080i0);
                        throw e;
                    }
                }
                C2263e c2263e2 = (C2263e) c1670l.f6398o;
                c1495h = c1670l.f6397n;
                c1671m = c1670l.f6396m;
                try {
                    AbstractC0714c.m1516d0(obj);
                    c2263e = c2263e2;
                    c1495h2 = c1495h;
                } catch (Exception e9) {
                    e = e9;
                    if (c1495h != null) {
                        AbstractC2536f.m4554a(c1495h);
                    }
                    throw e;
                }
            }
            C2080i0 c2080i03 = (C2080i0) obj;
            Bitmap.Config[] configArr2 = AbstractC2536f.f9216a;
            AbstractC2160j0 abstractC2160j0Body2 = c2080i03.body();
            if (abstractC2160j0Body2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                C1495h c1495hM3373h = c1671m.m3373h(c1495h2, c2263e.f7889a, c2080i03, c2263e.f7890b);
                String str3 = c1671m.f6404a;
                if (c1495hM3373h != null) {
                    C1265n c1265nM3372g2 = c1671m.m3372g(c1495hM3373h);
                    C2260b c2260bM3371f2 = c1671m.m3371f(c1495hM3373h);
                    return new C1672n(c1265nM3372g2, m3367d(str3, c2260bM3371f2 != null ? (C2070d0) c2260bM3371f2.f7873b.getValue() : null), EnumC1257f.f5254m);
                }
                if (abstractC2160j0Body2.source().request(1L)) {
                    InterfaceC2577l interfaceC2577lSource2 = abstractC2160j0Body2.source();
                    Context context2 = c1671m.f6405b.f8055a;
                    return new C1672n(new C1268q(interfaceC2577lSource2, null), m3367d(str3, abstractC2160j0Body2.contentType()), c2080i03.networkResponse() != null ? EnumC1257f.f5254m : EnumC1257f.f5253l);
                }
                AbstractC2536f.m4554a(c2080i03);
                C2076g0 c2076g0M3370e = c1671m.m3370e();
                c1670l.f6396m = c1671m;
                c1670l.f6397n = c1495hM3373h;
                c1670l.f6398o = c2080i03;
                c1670l.f6401r = 2;
                Object objM3368b2 = c1671m.m3368b(c2076g0M3370e, c1670l);
                if (objM3368b2 != enumC2273a) {
                    c2080i0 = c2080i03;
                    obj = objM3368b2;
                    c1671m2 = c1671m;
                    C2080i0 c2080i022 = (C2080i0) obj;
                    Bitmap.Config[] configArr3 = AbstractC2536f.f9216a;
                    abstractC2160j0Body = c2080i022.body();
                    if (abstractC2160j0Body != null) {
                    }
                }
                return enumC2273a;
            } catch (Exception e10) {
                c2080i0 = c2080i03;
                e = e10;
                AbstractC2536f.m4554a(c2080i0);
                throw e;
            }
        } catch (Exception e11) {
            e = e11;
            c1495h = r22;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3368b(C2076g0 c2076g0, AbstractC2320c abstractC2320c) throws Throwable {
        C1669k c1669k;
        C2080i0 c2080i0Execute;
        if (abstractC2320c instanceof C1669k) {
            c1669k = (C1669k) abstractC2320c;
            int i = c1669k.f6395o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1669k.f6395o = i - Integer.MIN_VALUE;
            } else {
                c1669k = new C1669k(this, abstractC2320c);
            }
        }
        Object objM2809u = c1669k.f6393m;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c1669k.f6395o;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM2809u);
            Bitmap.Config[] configArr = AbstractC2536f.f9216a;
            boolean zM5132a = AbstractC2980h.m5132a(Looper.myLooper(), Looper.getMainLooper());
            C1690g c1690g = this.f6406c;
            if (zM5132a) {
                if (this.f6405b.f8069o.f7992j) {
                    throw new NetworkOnMainThreadException();
                }
                c2080i0Execute = ((InterfaceC2073f) c1690g.getValue()).newCall(c2076g0).execute();
                if (!c2080i0Execute.isSuccessful() || c2080i0Execute.code() == 304) {
                    return c2080i0Execute;
                }
                AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
                if (abstractC2160j0Body != null) {
                    AbstractC2536f.m4554a(abstractC2160j0Body);
                }
                throw new C0048u("HTTP " + c2080i0Execute.code() + ": " + c2080i0Execute.message());
            }
            InterfaceC2075g interfaceC2075gNewCall = ((InterfaceC2073f) c1690g.getValue()).newCall(c2076g0);
            c1669k.f6395o = 1;
            C1295g c1295g = new C1295g(1, AbstractC0715d.m1547P(c1669k));
            c1295g.m2810v();
            C2537g c2537g = new C2537g(interfaceC2075gNewCall, c1295g);
            interfaceC2075gNewCall.enqueue(c2537g);
            c1295g.m2812x(c2537g);
            objM2809u = c1295g.m2809u();
            if (objM2809u == enumC2273a) {
                return enumC2273a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(objM2809u);
        }
        c2080i0Execute = (C2080i0) objM2809u;
        if (c2080i0Execute.isSuccessful()) {
        }
        return c2080i0Execute;
    }

    /* renamed from: c */
    public final AbstractC2585p m3369c() {
        Object value = this.f6407d.getValue();
        AbstractC2980h.m5133b(value);
        return ((C1496i) value).f5760a;
    }

    /* renamed from: e */
    public final C2076g0 m3370e() {
        C2076g0.a aVarUrl = new C2076g0.a().url(this.f6404a);
        C2303o c2303o = this.f6405b;
        C2076g0.a aVarHeaders = aVarUrl.headers(c2303o.f8064j);
        for (Map.Entry entry : c2303o.f8065k.f8080a.entrySet()) {
            Object key = entry.getKey();
            AbstractC2980h.m5134c("null cannot be cast to non-null type java.lang.Class<kotlin.Any>", key);
            aVarHeaders.tag((Class) key, entry.getValue());
        }
        EnumC2290b enumC2290b = c2303o.f8068n;
        boolean z7 = enumC2290b.f7992j;
        boolean z8 = c2303o.f8069o.f7992j;
        if (!z8 && z7) {
            aVarHeaders.cacheControl(C2071e.FORCE_CACHE);
        } else if (!z8 || z7) {
            if (!z8 && !z7) {
                aVarHeaders.cacheControl(f6403g);
            }
        } else if (enumC2290b.f7993k) {
            aVarHeaders.cacheControl(C2071e.FORCE_NETWORK);
        } else {
            aVarHeaders.cacheControl(f6402f);
        }
        return aVarHeaders.build();
    }

    /* renamed from: f */
    public final C2260b m3371f(C1495h c1495h) throws Throwable {
        Throwable th;
        C2260b c2260b;
        try {
            AbstractC2585p abstractC2585pM3369c = m3369c();
            C1490c c1490c = c1495h.f5759j;
            if (c1490c.f5735k) {
                throw new IllegalStateException("snapshot is closed");
            }
            C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(abstractC2585pM3369c.mo3163l((C2558b0) c1490c.f5734j.f5727c.get(0)));
            try {
                c2260b = new C2260b(c2564e0M4578c);
                try {
                    c2564e0M4578c.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c2564e0M4578c.close();
                } catch (Throwable th4) {
                    AbstractC0715d.m1557e(th3, th4);
                }
                th = th3;
                c2260b = null;
            }
            if (th == null) {
                return c2260b;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final C1265n m3372g(C1495h c1495h) {
        C1490c c1490c = c1495h.f5759j;
        if (c1490c.f5735k) {
            throw new IllegalStateException("snapshot is closed");
        }
        C2558b0 c2558b0 = (C2558b0) c1490c.f5734j.f5727c.get(1);
        AbstractC2585p abstractC2585pM3369c = m3369c();
        String str = this.f6405b.f8063i;
        if (str == null) {
            str = this.f6404a;
        }
        return new C1265n(c2558b0, abstractC2585pM3369c, str, c1495h);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1495h m3373h(C1495h c1495h, C2076g0 c2076g0, C2080i0 c2080i0, C2260b c2260b) throws IOException {
        C0036o c0036o;
        Throwable th;
        C1488a c1488aM3171c;
        Throwable th2 = null;
        if (!this.f6405b.f8068n.f7993k || (this.f6408e && (c2076g0.cacheControl().noStore() || c2080i0.cacheControl().noStore() || AbstractC2980h.m5132a(c2080i0.headers().get("Vary"), "*")))) {
            if (c1495h != null) {
                AbstractC2536f.m4554a(c1495h);
            }
        } else if (c1495h != null) {
            C1490c c1490c = c1495h.f5759j;
            C1493f c1493f = c1490c.f5736l;
            synchronized (c1493f) {
                c1490c.close();
                c1488aM3171c = c1493f.m3171c(c1490c.f5734j.f5725a);
            }
            c0036o = c1488aM3171c != null ? new C0036o(27, c1488aM3171c) : null;
            if (c0036o != null) {
                try {
                    try {
                        if (c2080i0.code() != 304 || c2260b == null) {
                            C2562d0 c2562d0M4577b = AbstractC2557b.m4577b(m3369c().mo3162k(((C1488a) c0036o.f143k).m3152c(0)));
                            try {
                                new C2260b(c2080i0).m4048a(c2562d0M4577b);
                                try {
                                    c2562d0M4577b.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    c2562d0M4577b.close();
                                } catch (Throwable th5) {
                                    AbstractC0715d.m1557e(th4, th5);
                                }
                                th = th4;
                            }
                            if (th != null) {
                                throw th;
                            }
                            C2562d0 c2562d0M4577b2 = AbstractC2557b.m4577b(m3369c().mo3162k(((C1488a) c0036o.f143k).m3152c(1)));
                            try {
                                AbstractC2160j0 abstractC2160j0Body = c2080i0.body();
                                AbstractC2980h.m5133b(abstractC2160j0Body);
                                abstractC2160j0Body.source().mo4621u(c2562d0M4577b2);
                                try {
                                    c2562d0M4577b2.close();
                                } catch (Throwable th6) {
                                    th2 = th6;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                try {
                                    c2562d0M4577b2.close();
                                } catch (Throwable th8) {
                                    AbstractC0715d.m1557e(th2, th8);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        } else {
                            C2080i0 c2080i0Build = c2080i0.newBuilder().headers(AbstractC2261c.m4049a(c2260b.f7877f, c2080i0.headers())).build();
                            C2562d0 c2562d0M4577b3 = AbstractC2557b.m4577b(m3369c().mo3162k(((C1488a) c0036o.f143k).m3152c(0)));
                            try {
                                new C2260b(c2080i0Build).m4048a(c2562d0M4577b3);
                                try {
                                    c2562d0M4577b3.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                th2 = th10;
                                try {
                                    c2562d0M4577b3.close();
                                } catch (Throwable th11) {
                                    AbstractC0715d.m1557e(th2, th11);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        C1495h c1495hM170l = c0036o.m170l();
                        AbstractC2536f.m4554a(c2080i0);
                        return c1495hM170l;
                    } catch (Exception e) {
                        Bitmap.Config[] configArr = AbstractC2536f.f9216a;
                        try {
                            ((C1488a) c0036o.f143k).m3151b(false);
                        } catch (Exception unused) {
                        }
                        throw e;
                    }
                } catch (Throwable th12) {
                    AbstractC2536f.m4554a(c2080i0);
                    throw th12;
                }
            }
        } else {
            C1496i c1496i = (C1496i) this.f6407d.getValue();
            if (c1496i != null) {
                String str = this.f6405b.f8063i;
                if (str == null) {
                    str = this.f6404a;
                }
                C1493f c1493f2 = c1496i.f5761b;
                C2579m c2579m = C2579m.f9316m;
                C1488a c1488aM3171c2 = c1493f2.m3171c(C1584b.m3251p(str).mo4633c("SHA-256").mo4635e());
                if (c1488aM3171c2 != null) {
                    c0036o = new C0036o(27, c1488aM3171c2);
                }
                if (c0036o != null) {
                }
            }
        }
        return null;
    }
}
