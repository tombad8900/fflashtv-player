package p089k1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.m */
/* loaded from: classes.dex */
public final class C1569m implements InterfaceC1564h {

    /* renamed from: j */
    public final Context f6004j;

    /* renamed from: k */
    public final ArrayList f6005k;

    /* renamed from: l */
    public final InterfaceC1564h f6006l;

    /* renamed from: m */
    public C1574r f6007m;

    /* renamed from: n */
    public C1554b f6008n;

    /* renamed from: o */
    public C1560e f6009o;

    /* renamed from: p */
    public InterfaceC1564h f6010p;

    /* renamed from: q */
    public C1561e0 f6011q;

    /* renamed from: r */
    public C1562f f6012r;

    /* renamed from: s */
    public C1553a0 f6013s;

    /* renamed from: t */
    public InterfaceC1564h f6014t;

    public C1569m(Context context, InterfaceC1564h interfaceC1564h) {
        this.f6004j = context.getApplicationContext();
        interfaceC1564h.getClass();
        this.f6006l = interfaceC1564h;
        this.f6005k = new ArrayList();
    }

    /* renamed from: k */
    public static void m3240k(InterfaceC1564h interfaceC1564h, InterfaceC1557c0 interfaceC1557c0) {
        if (interfaceC1564h != null) {
            interfaceC1564h.addTransferListener(interfaceC1557c0);
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final void addTransferListener(InterfaceC1557c0 interfaceC1557c0) {
        interfaceC1557c0.getClass();
        this.f6006l.addTransferListener(interfaceC1557c0);
        this.f6005k.add(interfaceC1557c0);
        m3240k(this.f6007m, interfaceC1557c0);
        m3240k(this.f6008n, interfaceC1557c0);
        m3240k(this.f6009o, interfaceC1557c0);
        m3240k(this.f6010p, interfaceC1557c0);
        m3240k(this.f6011q, interfaceC1557c0);
        m3240k(this.f6012r, interfaceC1557c0);
        m3240k(this.f6013s, interfaceC1557c0);
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        InterfaceC1564h interfaceC1564h = this.f6014t;
        if (interfaceC1564h != null) {
            try {
                interfaceC1564h.close();
            } finally {
                this.f6014t = null;
            }
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Map getResponseHeaders() {
        InterfaceC1564h interfaceC1564h = this.f6014t;
        return interfaceC1564h == null ? Collections.EMPTY_MAP : interfaceC1564h.getResponseHeaders();
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        InterfaceC1564h interfaceC1564h = this.f6014t;
        if (interfaceC1564h == null) {
            return null;
        }
        return interfaceC1564h.getUri();
    }

    /* renamed from: j */
    public final void m3241j(InterfaceC1564h interfaceC1564h) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6005k;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC1564h.addTransferListener((InterfaceC1557c0) arrayList.get(i));
            i++;
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) {
        AbstractC1101a.m2359j(this.f6014t == null);
        Uri uri = c1568l.f5996a;
        String scheme = uri.getScheme();
        int i = AbstractC1118i0.f4750a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f6004j;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f6007m == null) {
                    C1574r c1574r = new C1574r(false);
                    this.f6007m = c1574r;
                    m3241j(c1574r);
                }
                this.f6014t = this.f6007m;
            } else {
                if (this.f6008n == null) {
                    C1554b c1554b = new C1554b(context);
                    this.f6008n = c1554b;
                    m3241j(c1554b);
                }
                this.f6014t = this.f6008n;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f6008n == null) {
                C1554b c1554b2 = new C1554b(context);
                this.f6008n = c1554b2;
                m3241j(c1554b2);
            }
            this.f6014t = this.f6008n;
        } else if ("content".equals(scheme)) {
            if (this.f6009o == null) {
                C1560e c1560e = new C1560e(context);
                this.f6009o = c1560e;
                m3241j(c1560e);
            }
            this.f6014t = this.f6009o;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC1564h interfaceC1564h = this.f6006l;
            if (zEquals) {
                if (this.f6010p == null) {
                    try {
                        InterfaceC1564h interfaceC1564h2 = (InterfaceC1564h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f6010p = interfaceC1564h2;
                        m3241j(interfaceC1564h2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1101a.m2348F("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f6010p == null) {
                        this.f6010p = interfaceC1564h;
                    }
                }
                this.f6014t = this.f6010p;
            } else if ("udp".equals(scheme)) {
                if (this.f6011q == null) {
                    C1561e0 c1561e0 = new C1561e0();
                    this.f6011q = c1561e0;
                    m3241j(c1561e0);
                }
                this.f6014t = this.f6011q;
            } else if ("data".equals(scheme)) {
                if (this.f6012r == null) {
                    C1562f c1562f = new C1562f(false);
                    this.f6012r = c1562f;
                    m3241j(c1562f);
                }
                this.f6014t = this.f6012r;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f6013s == null) {
                    C1553a0 c1553a0 = new C1553a0(context);
                    this.f6013s = c1553a0;
                    m3241j(c1553a0);
                }
                this.f6014t = this.f6013s;
            } else {
                this.f6014t = interfaceC1564h;
            }
        }
        return this.f6014t.open(c1568l);
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) {
        InterfaceC1564h interfaceC1564h = this.f6014t;
        interfaceC1564h.getClass();
        return interfaceC1564h.read(bArr, i, i4);
    }
}
