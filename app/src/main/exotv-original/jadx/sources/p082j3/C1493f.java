package p082j3;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p024c5.C0654c1;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p069h7.C1204f;
import p076i7.AbstractC1327r;
import p076i7.AbstractC1339x;
import p076i7.C1294f1;
import p112m7.C1927c;
import p171t5.AbstractC2436a;
import p185v3.AbstractC2536f;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2585p;
import p189v7.C2558b0;
import p189v7.C2562d0;
import p189v7.C2564e0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.f */
/* loaded from: classes.dex */
public final class C1493f implements Closeable, Flushable {

    /* renamed from: z */
    public static final C1204f f5740z = new C1204f("[a-z0-9_-]{1,120}");

    /* renamed from: j */
    public final C2558b0 f5741j;

    /* renamed from: k */
    public final long f5742k;

    /* renamed from: l */
    public final C2558b0 f5743l;

    /* renamed from: m */
    public final C2558b0 f5744m;

    /* renamed from: n */
    public final C2558b0 f5745n;

    /* renamed from: o */
    public final LinkedHashMap f5746o;

    /* renamed from: p */
    public final C1927c f5747p;

    /* renamed from: q */
    public long f5748q;

    /* renamed from: r */
    public int f5749r;

    /* renamed from: s */
    public C2562d0 f5750s;

    /* renamed from: t */
    public boolean f5751t;

    /* renamed from: u */
    public boolean f5752u;

    /* renamed from: v */
    public boolean f5753v;

    /* renamed from: w */
    public boolean f5754w;

    /* renamed from: x */
    public boolean f5755x;

    /* renamed from: y */
    public final C1491d f5756y;

    public C1493f(long j, AbstractC1327r abstractC1327r, AbstractC2585p abstractC2585p, C2558b0 c2558b0) {
        this.f5741j = c2558b0;
        this.f5742k = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5743l = c2558b0.m4590d("journal");
        this.f5744m = c2558b0.m4590d("journal.tmp");
        this.f5745n = c2558b0.m4590d("journal.bkp");
        this.f5746o = new LinkedHashMap(0, 0.75f, true);
        this.f5747p = AbstractC1339x.m2840a(AbstractC0714c.m1508W(new C1294f1(), abstractC1327r.mo2830F(1)));
        this.f5756y = new C1491d(abstractC2585p);
    }

    /* renamed from: H */
    public static void m3164H(String str) {
        if (f5740z.m2624c(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:26:0x005c, B:28:0x006c, B:37:0x00aa, B:39:0x00b1, B:42:0x00b6, B:44:0x00c7, B:47:0x00cc, B:52:0x0107, B:54:0x0112, B:58:0x011b, B:48:0x00e4, B:50:0x00f9, B:51:0x0104, B:36:0x009a, B:61:0x0120, B:62:0x0127), top: B:65:0x0001 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3165b(C1493f c1493f, C1488a c1488a, boolean z7) {
        synchronized (c1493f) {
            C1489b c1489b = (C1489b) c1488a.f5722b;
            if (!AbstractC2980h.m5132a(c1489b.f5731g, c1488a)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z7 || c1489b.f5730f) {
                for (int i = 0; i < 2; i++) {
                    c1493f.f5756y.m4677e((C2558b0) c1489b.f5728d.get(i));
                }
            } else {
                for (int i4 = 0; i4 < 2; i4++) {
                    if (((boolean[]) c1488a.f5723c)[i4] && !c1493f.f5756y.m4678f((C2558b0) c1489b.f5728d.get(i4))) {
                        c1488a.m3151b(false);
                        return;
                    }
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    C2558b0 c2558b0 = (C2558b0) c1489b.f5728d.get(i8);
                    C2558b0 c2558b02 = (C2558b0) c1489b.f5727c.get(i8);
                    if (c1493f.f5756y.m4678f(c2558b0)) {
                        c1493f.f5756y.mo3156b(c2558b0, c2558b02);
                    } else {
                        C1491d c1491d = c1493f.f5756y;
                        C2558b0 c2558b03 = (C2558b0) c1489b.f5727c.get(i8);
                        if (!c1491d.m4678f(c2558b03)) {
                            AbstractC2536f.m4554a(c1491d.mo3162k(c2558b03));
                        }
                    }
                    long j = c1489b.f5726b[i8];
                    Long l8 = (Long) c1493f.f5756y.m4679h(c2558b02).f9092e;
                    long jLongValue = l8 != null ? l8.longValue() : 0L;
                    c1489b.f5726b[i8] = jLongValue;
                    c1493f.f5748q = (c1493f.f5748q - j) + jLongValue;
                }
            }
            c1489b.f5731g = null;
            if (c1489b.f5730f) {
                c1493f.m3168F(c1489b);
                return;
            }
            c1493f.f5749r++;
            C2562d0 c2562d0 = c1493f.f5750s;
            AbstractC2980h.m5133b(c2562d0);
            if (z7 || c1489b.f5729e) {
                c1489b.f5729e = true;
                c2562d0.mo4600o("CLEAN");
                c2562d0.writeByte(32);
                c2562d0.mo4600o(c1489b.f5725a);
                for (long j8 : c1489b.f5726b) {
                    c2562d0.writeByte(32);
                    c2562d0.mo4603z(j8);
                }
                c2562d0.writeByte(10);
            } else {
                c1493f.f5746o.remove(c1489b.f5725a);
                c2562d0.mo4600o("REMOVE");
                c2562d0.writeByte(32);
                c2562d0.mo4600o(c1489b.f5725a);
                c2562d0.writeByte(10);
            }
            c2562d0.flush();
            if (c1493f.f5748q > c1493f.f5742k) {
                c1493f.m3174p();
            } else if (c1493f.f5749r >= 2000) {
            }
        }
    }

    /* renamed from: D */
    public final void m3166D() throws Throwable {
        C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(this.f5756y.mo3163l(this.f5743l));
        try {
            String strMo4617n = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n2 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n3 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n4 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n5 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo4617n) || !"1".equals(strMo4617n2) || !AbstractC2980h.m5132a(String.valueOf(1), strMo4617n3) || !AbstractC2980h.m5132a(String.valueOf(2), strMo4617n4) || strMo4617n5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo4617n + ", " + strMo4617n2 + ", " + strMo4617n3 + ", " + strMo4617n4 + ", " + strMo4617n5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m3167E(c2564e0M4578c.mo4617n(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f5749r = i - this.f5746o.size();
                    if (c2564e0M4578c.mo4614j()) {
                        this.f5750s = m3175t();
                    } else {
                        m3170I();
                    }
                    try {
                        c2564e0M4578c.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                c2564e0M4578c.close();
            } catch (Throwable th3) {
                AbstractC0715d.m1557e(th, th3);
            }
        }
    }

    /* renamed from: E */
    public final void m3167E(String str) throws IOException {
        String strSubstring;
        int iM2627A0 = AbstractC1206h.m2627A0(str, ' ', 0, 6);
        if (iM2627A0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iM2627A0 + 1;
        int iM2627A02 = AbstractC1206h.m2627A0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f5746o;
        if (iM2627A02 == -1) {
            strSubstring = str.substring(i);
            AbstractC2980h.m5135d("substring(...)", strSubstring);
            if (iM2627A0 == 6 && AbstractC1214p.m2667t0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM2627A02);
            AbstractC2980h.m5135d("substring(...)", strSubstring);
        }
        Object c1489b = linkedHashMap.get(strSubstring);
        if (c1489b == null) {
            c1489b = new C1489b(this, strSubstring);
            linkedHashMap.put(strSubstring, c1489b);
        }
        C1489b c1489b2 = (C1489b) c1489b;
        if (iM2627A02 == -1 || iM2627A0 != 5 || !AbstractC1214p.m2667t0(str, "CLEAN", false)) {
            if (iM2627A02 == -1 && iM2627A0 == 5 && AbstractC1214p.m2667t0(str, "DIRTY", false)) {
                c1489b2.f5731g = new C1488a(this, c1489b2);
                return;
            } else {
                if (iM2627A02 != -1 || iM2627A0 != 4 || !AbstractC1214p.m2667t0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iM2627A02 + 1);
        AbstractC2980h.m5135d("substring(...)", strSubstring2);
        List listM2638L0 = AbstractC1206h.m2638L0(strSubstring2, new char[]{' '});
        c1489b2.f5729e = true;
        c1489b2.f5731g = null;
        if (listM2638L0.size() != 2) {
            throw new IOException("unexpected journal line: " + listM2638L0);
        }
        try {
            int size = listM2638L0.size();
            for (int i4 = 0; i4 < size; i4++) {
                c1489b2.f5726b[i4] = Long.parseLong((String) listM2638L0.get(i4));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listM2638L0);
        }
    }

    /* renamed from: F */
    public final void m3168F(C1489b c1489b) {
        C2562d0 c2562d0;
        int i = c1489b.f5732h;
        String str = c1489b.f5725a;
        if (i > 0 && (c2562d0 = this.f5750s) != null) {
            c2562d0.mo4600o("DIRTY");
            c2562d0.writeByte(32);
            c2562d0.mo4600o(str);
            c2562d0.writeByte(10);
            c2562d0.flush();
        }
        if (c1489b.f5732h > 0 || c1489b.f5731g != null) {
            c1489b.f5730f = true;
            return;
        }
        for (int i4 = 0; i4 < 2; i4++) {
            this.f5756y.m4677e((C2558b0) c1489b.f5727c.get(i4));
            long j = this.f5748q;
            long[] jArr = c1489b.f5726b;
            this.f5748q = j - jArr[i4];
            jArr[i4] = 0;
        }
        this.f5749r++;
        C2562d0 c2562d02 = this.f5750s;
        if (c2562d02 != null) {
            c2562d02.mo4600o("REMOVE");
            c2562d02.writeByte(32);
            c2562d02.mo4600o(str);
            c2562d02.writeByte(10);
        }
        this.f5746o.remove(str);
        if (this.f5749r >= 2000) {
            m3174p();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        m3168F(r1);
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3169G() {
        while (this.f5748q > this.f5742k) {
            for (C1489b c1489b : this.f5746o.values()) {
                if (!c1489b.f5730f) {
                    break;
                }
            }
            return;
        }
        this.f5754w = false;
    }

    /* renamed from: I */
    public final synchronized void m3170I() {
        Throwable th;
        try {
            C2562d0 c2562d0 = this.f5750s;
            if (c2562d0 != null) {
                c2562d0.close();
            }
            C2562d0 c2562d0M4577b = AbstractC2557b.m4577b(this.f5756y.mo3162k(this.f5744m));
            try {
                c2562d0M4577b.mo4600o("libcore.io.DiskLruCache");
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4600o("1");
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4603z(1);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4603z(2);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.writeByte(10);
                for (C1489b c1489b : this.f5746o.values()) {
                    if (c1489b.f5731g != null) {
                        c2562d0M4577b.mo4600o("DIRTY");
                        c2562d0M4577b.writeByte(32);
                        c2562d0M4577b.mo4600o(c1489b.f5725a);
                        c2562d0M4577b.writeByte(10);
                    } else {
                        c2562d0M4577b.mo4600o("CLEAN");
                        c2562d0M4577b.writeByte(32);
                        c2562d0M4577b.mo4600o(c1489b.f5725a);
                        for (long j : c1489b.f5726b) {
                            c2562d0M4577b.writeByte(32);
                            c2562d0M4577b.mo4603z(j);
                        }
                        c2562d0M4577b.writeByte(10);
                    }
                }
                try {
                    c2562d0M4577b.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c2562d0M4577b.close();
                } catch (Throwable th4) {
                    AbstractC0715d.m1557e(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.f5756y.m4678f(this.f5743l)) {
                this.f5756y.mo3156b(this.f5743l, this.f5745n);
                this.f5756y.mo3156b(this.f5744m, this.f5743l);
                this.f5756y.m4677e(this.f5745n);
            } else {
                this.f5756y.mo3156b(this.f5744m, this.f5743l);
            }
            this.f5750s = m3175t();
            this.f5749r = 0;
            this.f5751t = false;
            this.f5755x = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* renamed from: c */
    public final synchronized C1488a m3171c(String str) {
        if (this.f5753v) {
            throw new IllegalStateException("cache is closed");
        }
        m3164H(str);
        m3173k();
        C1489b c1489b = (C1489b) this.f5746o.get(str);
        if ((c1489b != null ? c1489b.f5731g : null) != null) {
            return null;
        }
        if (c1489b != null && c1489b.f5732h != 0) {
            return null;
        }
        if (!this.f5754w && !this.f5755x) {
            C2562d0 c2562d0 = this.f5750s;
            AbstractC2980h.m5133b(c2562d0);
            c2562d0.mo4600o("DIRTY");
            c2562d0.writeByte(32);
            c2562d0.mo4600o(str);
            c2562d0.writeByte(10);
            c2562d0.flush();
            if (this.f5751t) {
                return null;
            }
            if (c1489b == null) {
                c1489b = new C1489b(this, str);
                this.f5746o.put(str, c1489b);
            }
            C1488a c1488a = new C1488a(this, c1489b);
            c1489b.f5731g = c1488a;
            return c1488a;
        }
        m3174p();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f5752u && !this.f5753v) {
                for (C1489b c1489b : (C1489b[]) this.f5746o.values().toArray(new C1489b[0])) {
                    C1488a c1488a = c1489b.f5731g;
                    if (c1488a != null) {
                        C1489b c1489b2 = (C1489b) c1488a.f5722b;
                        if (AbstractC2980h.m5132a(c1489b2.f5731g, c1488a)) {
                            c1489b2.f5730f = true;
                        }
                    }
                }
                m3169G();
                AbstractC1339x.m2842c(this.f5747p);
                C2562d0 c2562d0 = this.f5750s;
                AbstractC2980h.m5133b(c2562d0);
                c2562d0.close();
                this.f5750s = null;
                this.f5753v = true;
                return;
            }
            this.f5753v = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f5752u) {
            if (this.f5753v) {
                throw new IllegalStateException("cache is closed");
            }
            m3169G();
            C2562d0 c2562d0 = this.f5750s;
            AbstractC2980h.m5133b(c2562d0);
            c2562d0.flush();
        }
    }

    /* renamed from: g */
    public final synchronized C1490c m3172g(String str) {
        C1490c c1490cM3154a;
        if (this.f5753v) {
            throw new IllegalStateException("cache is closed");
        }
        m3164H(str);
        m3173k();
        C1489b c1489b = (C1489b) this.f5746o.get(str);
        if (c1489b != null && (c1490cM3154a = c1489b.m3154a()) != null) {
            boolean z7 = true;
            this.f5749r++;
            C2562d0 c2562d0 = this.f5750s;
            AbstractC2980h.m5133b(c2562d0);
            c2562d0.mo4600o("READ");
            c2562d0.writeByte(32);
            c2562d0.mo4600o(str);
            c2562d0.writeByte(10);
            if (this.f5749r < 2000) {
                z7 = false;
            }
            if (z7) {
                m3174p();
            }
            return c1490cM3154a;
        }
        return null;
    }

    /* renamed from: k */
    public final synchronized void m3173k() {
        try {
            if (this.f5752u) {
                return;
            }
            this.f5756y.m4677e(this.f5744m);
            if (this.f5756y.m4678f(this.f5745n)) {
                if (this.f5756y.m4678f(this.f5743l)) {
                    this.f5756y.m4677e(this.f5745n);
                } else {
                    this.f5756y.mo3156b(this.f5745n, this.f5743l);
                }
            }
            if (this.f5756y.m4678f(this.f5743l)) {
                try {
                    m3166D();
                    m3176x();
                    this.f5752u = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC2436a.m4331e(this.f5756y, this.f5741j);
                        this.f5753v = false;
                    } catch (Throwable th) {
                        this.f5753v = false;
                        throw th;
                    }
                }
            }
            m3170I();
            this.f5752u = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: p */
    public final void m3174p() {
        AbstractC1339x.m2850k(this.f5747p, null, new C1492e(this, null, 0), 3);
    }

    /* renamed from: t */
    public final C2562d0 m3175t() {
        C1491d c1491d = this.f5756y;
        c1491d.getClass();
        C2558b0 c2558b0 = this.f5743l;
        AbstractC2980h.m5136e("file", c2558b0);
        return AbstractC2557b.m4577b(new C1494g(c1491d.mo3155a(c2558b0), new C0654c1(1, this)));
    }

    /* renamed from: x */
    public final void m3176x() {
        Iterator it = this.f5746o.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C1489b c1489b = (C1489b) it.next();
            int i = 0;
            if (c1489b.f5731g == null) {
                while (i < 2) {
                    j += c1489b.f5726b[i];
                    i++;
                }
            } else {
                c1489b.f5731g = null;
                while (i < 2) {
                    C2558b0 c2558b0 = (C2558b0) c1489b.f5727c.get(i);
                    C1491d c1491d = this.f5756y;
                    c1491d.m4677e(c2558b0);
                    c1491d.m4677e((C2558b0) c1489b.f5728d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f5748q = j;
    }
}
