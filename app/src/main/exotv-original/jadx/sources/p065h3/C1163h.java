package p065h3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import androidx.lifecycle.AbstractC0150o;
import androidx.media3.common.C0169a;
import com.bumptech.glide.AbstractC0714c;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C2181z;
import p002a1.C0048u;
import p005a4.C0073c;
import p024c5.C0673j0;
import p024c5.C0687q0;
import p073i3.C1254c;
import p076i7.AbstractC1277a;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1327r;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p076i7.C1294f1;
import p076i7.C1329s;
import p076i7.EnumC1335v;
import p076i7.InterfaceC1330s0;
import p099l3.C1659a;
import p099l3.C1668j;
import p102l6.C1687d;
import p102l6.C1690g;
import p108m3.C1893h;
import p111m6.AbstractC1913h;
import p112m7.AbstractC1938n;
import p112m7.C1927c;
import p117n3.C2001a;
import p117n3.C2003c;
import p124o3.C2047a;
import p127o7.C2054e;
import p134p3.C2209c;
import p137p6.C2223d;
import p137p6.C2228i;
import p137p6.InterfaceC2227h;
import p146q6.EnumC2273a;
import p151r3.AbstractC2300l;
import p151r3.C2289a;
import p151r3.C2291c;
import p151r3.C2294f;
import p151r3.C2297i;
import p151r3.C2299k;
import p151r3.C2301m;
import p151r3.C2302n;
import p151r3.C2306r;
import p151r3.C2308t;
import p151r3.InterfaceC2293e;
import p151r3.InterfaceC2298j;
import p151r3.InterfaceC2305q;
import p151r3.ViewOnAttachStateChangeListenerC2309u;
import p154r6.AbstractC2320c;
import p160s3.C2357h;
import p160s3.InterfaceC2358i;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;
import p169t3.C2433a;
import p177u3.C2463c;
import p177u3.InterfaceC2465e;
import p185v3.AbstractC2534d;
import p185v3.AbstractC2536f;
import p185v3.C2540j;
import p185v3.ComponentCallbacks2C2542l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h3.h */
/* loaded from: classes.dex */
public final class C1163h {

    /* renamed from: a */
    public final Context f4993a;

    /* renamed from: b */
    public final C2291c f4994b;

    /* renamed from: c */
    public final C1690g f4995c;

    /* renamed from: d */
    public final C2540j f4996d;

    /* renamed from: e */
    public final C1927c f4997e;

    /* renamed from: f */
    public final C0073c f4998f;

    /* renamed from: g */
    public final C1158c f4999g;

    /* renamed from: h */
    public final ArrayList f5000h;

    public C1163h(Context context, C2291c c2291c, C1690g c1690g, C1690g c1690g2, C1690g c1690g3, C1158c c1158c, C2540j c2540j) {
        this.f4993a = context;
        this.f4994b = c2291c;
        this.f4995c = c1690g;
        this.f4996d = c2540j;
        C1294f1 c1294f1 = new C1294f1();
        C2054e c2054e = AbstractC1290e0.f5316a;
        this.f4997e = AbstractC1339x.m2840a(AbstractC0714c.m1508W(c1294f1, AbstractC1938n.f7227a.f5856n).mo2761c(new C1162g(C1329s.f5368j)));
        ComponentCallbacks2C2542l componentCallbacks2C2542l = new ComponentCallbacks2C2542l(this);
        C0073c c0073c = new C0073c(this, componentCallbacks2C2542l);
        this.f4998f = c0073c;
        C1157b c1157b = new C1157b(c1158c);
        c1157b.m2577b(new C2047a(2), C2181z.class);
        int i = 5;
        c1157b.m2577b(new C2047a(i), String.class);
        c1157b.m2577b(new C2047a(1), Uri.class);
        int i4 = 4;
        c1157b.m2577b(new C2047a(i4), Uri.class);
        int i8 = 3;
        c1157b.m2577b(new C2047a(i8), Integer.class);
        int i9 = 0;
        c1157b.m2577b(new C2047a(i9), byte[].class);
        C2003c c2003c = new C2003c();
        ArrayList arrayList = (ArrayList) c1157b.f4974l;
        arrayList.add(new C1687d(c2003c, Uri.class));
        arrayList.add(new C1687d(new C2001a(c2540j.f9226a), File.class));
        c1157b.m2576a(new C1668j(c1690g3, c1690g2, c2540j.f9228c), Uri.class);
        c1157b.m2576a(new C1659a(i), File.class);
        c1157b.m2576a(new C1659a(i9), Uri.class);
        c1157b.m2576a(new C1659a(i8), Uri.class);
        c1157b.m2576a(new C1659a(6), Uri.class);
        c1157b.m2576a(new C1659a(i4), Drawable.class);
        c1157b.m2576a(new C1659a(1), Bitmap.class);
        c1157b.m2576a(new C1659a(2), ByteBuffer.class);
        C1254c c1254c = new C1254c(c2540j.f9229d, c2540j.f9230e);
        ArrayList arrayList2 = (ArrayList) c1157b.f4976n;
        arrayList2.add(c1254c);
        List listM4259F = AbstractC2415i0.m4259F((ArrayList) c1157b.f4972j);
        this.f4999g = new C1158c(listM4259F, AbstractC2415i0.m4259F((ArrayList) c1157b.f4973k), AbstractC2415i0.m4259F(arrayList), AbstractC2415i0.m4259F((ArrayList) c1157b.f4975m), AbstractC2415i0.m4259F(arrayList2));
        this.f5000h = AbstractC1913h.m3744I0(listM4259F, new C1893h(this, componentCallbacks2C2542l, c0073c));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x00e8, TryCatch #3 {all -> 0x00e8, blocks: (B:39:0x00da, B:41:0x00e4, B:44:0x00eb, B:46:0x00f9, B:47:0x00fc, B:34:0x00be, B:36:0x00c4, B:74:0x0180, B:75:0x0187), top: B:92:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[Catch: all -> 0x00e8, TryCatch #3 {all -> 0x00e8, blocks: (B:39:0x00da, B:41:0x00e4, B:44:0x00eb, B:46:0x00f9, B:47:0x00fc, B:34:0x00be, B:36:0x00c4, B:74:0x0180, B:75:0x0187), top: B:92:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:57:0x0145, B:59:0x014b, B:63:0x015d, B:65:0x0161, B:68:0x0170, B:69:0x0175), top: B:93:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:57:0x0145, B:59:0x014b, B:63:0x015d, B:65:0x0161, B:68:0x0170, B:69:0x0175), top: B:93:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #6 {all -> 0x019e, blocks: (B:76:0x0188, B:78:0x018c, B:83:0x01a0, B:84:0x01a8), top: B:96:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0 A[Catch: all -> 0x019e, TRY_ENTER, TryCatch #6 {all -> 0x019e, blocks: (B:76:0x0188, B:78:0x018c, B:83:0x01a0, B:84:0x01a8), top: B:96:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [r3.q] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [r3.k] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [h3.d, java.lang.Object] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2579a(C1163h c1163h, C2299k c2299k, AbstractC2320c abstractC2320c) throws Throwable {
        C1161f c1161f;
        ?? r22;
        ?? r42;
        InterfaceC2305q interfaceC2305q;
        C1159d c1159d;
        ?? r32;
        Bitmap bitmap;
        C1159d c1159d2;
        C2299k c2299k2;
        InterfaceC2305q interfaceC2305q2;
        C1163h c1163h2;
        C1159d c1159d3;
        C2299k c2299k3;
        AbstractC2300l abstractC2300l;
        C1159d c1159d4;
        C2299k c2299k4;
        C2433a c2433a;
        Object objMo4189a;
        C1163h c1163h3 = c1163h;
        if (abstractC2320c instanceof C1161f) {
            c1161f = (C1161f) abstractC2320c;
            int i = c1161f.f4992t;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1161f.f4992t = i - Integer.MIN_VALUE;
            } else {
                c1161f = new C1161f(c1163h3, abstractC2320c);
            }
        }
        C1161f c1161f2 = c1161f;
        Object objM2857r = c1161f2.f4990r;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c1161f2.f4992t;
        if (i4 != 0) {
            try {
                if (i4 == 1) {
                    C1159d c1159d5 = c1161f2.f4988p;
                    C2299k c2299k5 = c1161f2.f4987o;
                    InterfaceC2305q interfaceC2305q3 = c1161f2.f4986n;
                    C1163h c1163h4 = c1161f2.f4985m;
                    AbstractC0714c.m1516d0(objM2857r);
                    interfaceC2305q = interfaceC2305q3;
                    c1159d = c1159d5;
                    c1163h3 = c1163h4;
                    c2299k4 = c2299k5;
                    if (((C2209c) c1163h3.f4995c.getValue()) != null) {
                        c2299k4.getClass();
                    }
                    c2299k4.getClass();
                    c2299k4.f8026A.getClass();
                    C2291c c2291c = AbstractC2534d.f9214a;
                    c2433a = c2299k4.f8029c;
                    if (c2433a != null) {
                        c2433a.m4328d(null);
                    }
                    c1159d.getClass();
                    InterfaceC2358i interfaceC2358i = c2299k4.f8049w;
                    c1161f2.f4985m = c1163h3;
                    c1161f2.f4986n = interfaceC2305q;
                    c1161f2.f4987o = c2299k4;
                    c1161f2.f4988p = c1159d;
                    c1161f2.f4989q = null;
                    c1161f2.f4992t = 2;
                    objMo4189a = interfaceC2358i.mo4189a(c1161f2);
                    if (objMo4189a != enumC2273a) {
                        c1163h2 = c1163h3;
                        c2299k2 = c2299k4;
                        c1159d2 = c1159d;
                        bitmap = null;
                        interfaceC2305q2 = interfaceC2305q;
                        objM2857r = objMo4189a;
                        c1159d2.getClass();
                        AbstractC1327r abstractC1327r = c2299k2.f8044r;
                        C0673j0 c0673j0 = new C0673j0(c2299k2, c1163h2, (C2357h) objM2857r, c1159d2, bitmap, null, 1);
                        c1159d4 = c1159d2;
                        c1161f2.f4985m = c1163h2;
                        c1161f2.f4986n = interfaceC2305q2;
                        c1161f2.f4987o = c2299k2;
                        c1161f2.f4988p = c1159d4;
                        c1161f2.f4989q = null;
                        c1161f2.f4992t = 3;
                        objM2857r = AbstractC1339x.m2857r(abstractC1327r, c0673j0, c1161f2);
                        if (objM2857r != enumC2273a) {
                        }
                    }
                    return enumC2273a;
                }
                if (i4 == 2) {
                    Bitmap bitmap2 = c1161f2.f4989q;
                    C1159d c1159d6 = c1161f2.f4988p;
                    C2299k c2299k6 = c1161f2.f4987o;
                    InterfaceC2305q interfaceC2305q4 = c1161f2.f4986n;
                    C1163h c1163h5 = c1161f2.f4985m;
                    try {
                        AbstractC0714c.m1516d0(objM2857r);
                        bitmap = bitmap2;
                        c1159d2 = c1159d6;
                        c2299k2 = c2299k6;
                        interfaceC2305q2 = interfaceC2305q4;
                        c1163h2 = c1163h5;
                        try {
                            c1159d2.getClass();
                            AbstractC1327r abstractC1327r2 = c2299k2.f8044r;
                            C0673j0 c0673j02 = new C0673j0(c2299k2, c1163h2, (C2357h) objM2857r, c1159d2, bitmap, null, 1);
                            c1159d4 = c1159d2;
                            try {
                                c1161f2.f4985m = c1163h2;
                                c1161f2.f4986n = interfaceC2305q2;
                                c1161f2.f4987o = c2299k2;
                                c1161f2.f4988p = c1159d4;
                                c1161f2.f4989q = null;
                                c1161f2.f4992t = 3;
                                objM2857r = AbstractC1339x.m2857r(abstractC1327r2, c0673j02, c1161f2);
                                if (objM2857r != enumC2273a) {
                                    c1159d3 = c1159d4;
                                    c2299k3 = c2299k2;
                                    abstractC2300l = (AbstractC2300l) objM2857r;
                                    if (!(abstractC2300l instanceof C2306r)) {
                                    }
                                    interfaceC2305q2.mo4093k();
                                    return abstractC2300l;
                                }
                                return enumC2273a;
                            } catch (Throwable th) {
                                th = th;
                                r22 = interfaceC2305q2;
                                c1163h3 = c1163h2;
                                r42 = c1159d4;
                                r32 = c2299k2;
                                if (th instanceof CancellationException) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c1159d4 = c1159d2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r42 = c1159d6;
                        r32 = c2299k6;
                        r22 = interfaceC2305q4;
                        c1163h3 = c1163h5;
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1159d3 = c1161f2.f4988p;
                    C2299k c2299k7 = c1161f2.f4987o;
                    interfaceC2305q2 = c1161f2.f4986n;
                    C1163h c1163h6 = c1161f2.f4985m;
                    AbstractC0714c.m1516d0(objM2857r);
                    c1163h2 = c1163h6;
                    c2299k3 = c2299k7;
                    try {
                        abstractC2300l = (AbstractC2300l) objM2857r;
                        if (!(abstractC2300l instanceof C2306r)) {
                            C2433a c2433a2 = c2299k3.f8029c;
                            c1163h2.getClass();
                            m2581d((C2306r) abstractC2300l, c2433a2, c1159d3);
                        } else {
                            if (!(abstractC2300l instanceof C2294f)) {
                                throw new C0048u();
                            }
                            C2433a c2433a3 = c2299k3.f8029c;
                            c1163h2.getClass();
                            m2580c((C2294f) abstractC2300l, c2433a3, c1159d3);
                        }
                        interfaceC2305q2.mo4093k();
                        return abstractC2300l;
                    } catch (Throwable th4) {
                        th = th4;
                        r22 = interfaceC2305q2;
                        r42 = c1159d3;
                        c1163h3 = c1163h2;
                        r32 = c2299k3;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                r22 = c2299k;
                r42 = c1163h3;
                c1163h3 = -2147483648;
                r32 = i4;
            }
        } else {
            AbstractC0714c.m1516d0(objM2857r);
            C0073c c0073c = c1163h3.f4998f;
            InterfaceC2227h interfaceC2227h = c1161f2.f8131k;
            AbstractC2980h.m5133b(interfaceC2227h);
            InterfaceC1330s0 interfaceC1330s0M2846g = AbstractC1339x.m2846g(interfaceC2227h);
            c0073c.getClass();
            AbstractC0150o abstractC0150o = c2299k.f8048v;
            C2433a c2433a4 = c2299k.f8029c;
            InterfaceC2305q c2308t = c2433a4 instanceof C2433a ? new C2308t((C1163h) c0073c.f324k, c2299k, c2433a4, abstractC0150o, interfaceC1330s0M2846g) : new C2289a(abstractC0150o, interfaceC1330s0M2846g);
            c2308t.mo4097g();
            C2297i c2297i = new C2297i(c2299k, c2299k.f8027a);
            c2297i.f8012b = c1163h3.f4994b;
            c2297i.f8025o = null;
            C2299k c2299kM4096a = c2297i.m4096a();
            C1159d c1159d7 = C1159d.f4982j;
            try {
                if (c2299kM4096a.f8028b == C2301m.f8053b) {
                    throw new C2302n("The request's data is null.");
                }
                c2308t.start();
                AbstractC0150o abstractC0150o2 = c2299kM4096a.f8048v;
                c1161f2.f4985m = c1163h3;
                c1161f2.f4986n = c2308t;
                c1161f2.f4987o = c2299kM4096a;
                c1161f2.f4988p = c1159d7;
                c1161f2.f4992t = 1;
                interfaceC2305q = c2308t;
                c2299k4 = c2299kM4096a;
                c1159d = c1159d7;
                if (AbstractC2429w.m4297b(abstractC0150o2, c1161f2) != enumC2273a) {
                    if (((C2209c) c1163h3.f4995c.getValue()) != null) {
                    }
                    c2299k4.getClass();
                    c2299k4.f8026A.getClass();
                    C2291c c2291c2 = AbstractC2534d.f9214a;
                    c2433a = c2299k4.f8029c;
                    if (c2433a != null) {
                    }
                    c1159d.getClass();
                    InterfaceC2358i interfaceC2358i2 = c2299k4.f8049w;
                    c1161f2.f4985m = c1163h3;
                    c1161f2.f4986n = interfaceC2305q;
                    c1161f2.f4987o = c2299k4;
                    c1161f2.f4988p = c1159d;
                    c1161f2.f4989q = null;
                    c1161f2.f4992t = 2;
                    objMo4189a = interfaceC2358i2.mo4189a(c1161f2);
                    if (objMo4189a != enumC2273a) {
                    }
                }
                return enumC2273a;
            } catch (Throwable th6) {
                th = th6;
                r22 = c2308t;
                r32 = c2299kM4096a;
                r42 = c1159d7;
            }
        }
        try {
            if (th instanceof CancellationException) {
                c1163h3.f4998f.getClass();
                C2294f c2294fM268v = C0073c.m268v(r32, th);
                m2580c(c2294fM268v, r32.f8029c, r42);
                return c2294fM268v;
            }
            c1163h3.getClass();
            r42.getClass();
            InterfaceC2298j interfaceC2298j = r32.f8030d;
            throw th;
        } finally {
            r22.mo4093k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2580c(C2294f c2294f, C2433a c2433a, C1159d c1159d) {
        C2299k c2299k = c2294f.f8007b;
        Drawable drawable = c2294f.f8006a;
        if (c2433a instanceof C2433a) {
            InterfaceC2465e interfaceC2465eMo4438a = c2299k.f8034h.mo4438a(c2433a, c2294f);
            if (!(interfaceC2465eMo4438a instanceof C2463c)) {
                c1159d.getClass();
                interfaceC2465eMo4438a.mo346a();
            }
        } else if (c2433a != null) {
            c2433a.m4328d(drawable);
        }
        c1159d.getClass();
        InterfaceC2298j interfaceC2298j = c2299k.f8030d;
        if (interfaceC2298j != null) {
            interfaceC2298j.mo283e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2581d(C2306r c2306r, C2433a c2433a, C1159d c1159d) {
        C2299k c2299k = c2306r.f8073b;
        Drawable drawable = c2306r.f8072a;
        if (c2433a instanceof C2433a) {
            InterfaceC2465e interfaceC2465eMo4438a = c2299k.f8034h.mo4438a(c2433a, c2306r);
            if (!(interfaceC2465eMo4438a instanceof C2463c)) {
                c1159d.getClass();
                interfaceC2465eMo4438a.mo346a();
            }
        } else if (c2433a != null) {
            c2433a.m4328d(drawable);
        }
        c1159d.getClass();
        InterfaceC2298j interfaceC2298j = c2299k.f8030d;
        if (interfaceC2298j != null) {
            interfaceC2298j.mo290l();
        }
    }

    /* renamed from: b */
    public final InterfaceC2293e m2582b(C2299k c2299k) {
        C1927c c1927c = this.f4997e;
        char c8 = 1;
        C0687q0 c0687q0 = new C0687q0(this, c2299k, null, 1);
        C2228i c2228i = C2228i.f7747j;
        EnumC1335v enumC1335v = EnumC1335v.f5372j;
        InterfaceC2227h interfaceC2227hM2843d = AbstractC1339x.m2843d(c1927c.mo579h(), c2228i, true);
        C2054e c2054e = AbstractC1290e0.f5316a;
        if (interfaceC2227hM2843d != c2054e && interfaceC2227hM2843d.mo2760b(C2223d.f7746j) == null) {
            interfaceC2227hM2843d = interfaceC2227hM2843d.mo2761c(c2054e);
        }
        EnumC1335v enumC1335v2 = EnumC1335v.f5372j;
        AbstractC1277a c1278a0 = new C1278a0(interfaceC2227hM2843d, c8 == true ? 1 : 0, 0);
        c1278a0.m2741T(enumC1335v, c1278a0, c0687q0);
        C2433a c2433a = c2299k.f8029c;
        if (!(c2433a instanceof C2433a)) {
            return new C2301m(1);
        }
        ViewOnAttachStateChangeListenerC2309u viewOnAttachStateChangeListenerC2309uM4556c = AbstractC2536f.m4556c(c2433a.f8786k);
        synchronized (viewOnAttachStateChangeListenerC2309uM4556c) {
            C0169a c0169a = viewOnAttachStateChangeListenerC2309uM4556c.f8087k;
            if (c0169a != null && AbstractC2980h.m5132a(Looper.myLooper(), Looper.getMainLooper()) && viewOnAttachStateChangeListenerC2309uM4556c.f8090n) {
                viewOnAttachStateChangeListenerC2309uM4556c.f8090n = false;
                return c0169a;
            }
            C1278a0 c1278a02 = viewOnAttachStateChangeListenerC2309uM4556c.f8088l;
            if (c1278a02 != null) {
                AbstractC1339x.m2841b(c1278a02);
            }
            viewOnAttachStateChangeListenerC2309uM4556c.f8088l = null;
            C0169a c0169a2 = new C0169a(viewOnAttachStateChangeListenerC2309uM4556c.f8086j);
            viewOnAttachStateChangeListenerC2309uM4556c.f8087k = c0169a2;
            return c0169a2;
        }
    }
}
