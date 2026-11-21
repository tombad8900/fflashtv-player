package p082j3;

import java.io.File;
import p005a4.C0095p;
import p118n4.C2016m;
import p118n4.C2018o;
import p185v3.AbstractC2536f;
import p189v7.C2558b0;
import p194w3.C2641c;
import p194w3.C2642d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.a */
/* loaded from: classes.dex */
public final class C1488a {

    /* renamed from: a */
    public boolean f5721a;

    /* renamed from: b */
    public final Object f5722b;

    /* renamed from: c */
    public final Object f5723c;

    /* renamed from: d */
    public final Object f5724d;

    public C1488a(C0095p c0095p, C2016m c2016m) {
        this.f5724d = new C2018o(0, this);
        this.f5723c = c0095p;
        this.f5722b = c2016m;
    }

    /* renamed from: a */
    public void m3150a() {
        C2642d.m4737b((C2642d) this.f5724d, this, false);
    }

    /* renamed from: b */
    public void m3151b(boolean z7) {
        C1493f c1493f = (C1493f) this.f5724d;
        synchronized (c1493f) {
            try {
                if (this.f5721a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC2980h.m5132a(((C1489b) this.f5722b).f5731g, this)) {
                    C1493f.m3165b(c1493f, this, z7);
                }
                this.f5721a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public C2558b0 m3152c(int i) {
        C2558b0 c2558b0;
        C1493f c1493f = (C1493f) this.f5724d;
        synchronized (c1493f) {
            if (this.f5721a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f5723c)[i] = true;
            Object obj = ((C1489b) this.f5722b).f5728d.get(i);
            C1491d c1491d = c1493f.f5756y;
            C2558b0 c2558b02 = (C2558b0) obj;
            if (!c1491d.m4678f(c2558b02)) {
                AbstractC2536f.m4554a(c1491d.mo3162k(c2558b02));
            }
            c2558b0 = (C2558b0) obj;
        }
        return c2558b0;
    }

    /* renamed from: d */
    public File m3153d() {
        File file;
        synchronized (((C2642d) this.f5724d)) {
            try {
                C2641c c2641c = (C2641c) this.f5722b;
                if (c2641c.f9608f != this) {
                    throw new IllegalStateException();
                }
                if (!c2641c.f9607e) {
                    ((boolean[]) this.f5723c)[0] = true;
                }
                file = c2641c.f9606d[0];
                ((C2642d) this.f5724d).f9610j.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C1488a(C1493f c1493f, C1489b c1489b) {
        this.f5724d = c1493f;
        this.f5722b = c1489b;
        this.f5723c = new boolean[2];
    }

    public C1488a(C2642d c2642d, C2641c c2641c) {
        this.f5724d = c2642d;
        this.f5722b = c2641c;
        this.f5723c = c2641c.f9607e ? null : new boolean[c2642d.f9616p];
    }
}
