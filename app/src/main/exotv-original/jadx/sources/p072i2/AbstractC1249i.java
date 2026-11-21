package p072i2;

import p002a1.C0016e;
import p063h1.C1132w;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.i */
/* loaded from: classes.dex */
public abstract class AbstractC1249i {

    /* renamed from: b */
    public InterfaceC1980i0 f5216b;

    /* renamed from: c */
    public InterfaceC1989p f5217c;

    /* renamed from: d */
    public InterfaceC1247g f5218d;

    /* renamed from: e */
    public long f5219e;

    /* renamed from: f */
    public long f5220f;

    /* renamed from: g */
    public long f5221g;

    /* renamed from: h */
    public int f5222h;

    /* renamed from: i */
    public int f5223i;

    /* renamed from: k */
    public long f5225k;

    /* renamed from: l */
    public boolean f5226l;

    /* renamed from: m */
    public boolean f5227m;

    /* renamed from: a */
    public final C1245e f5215a = new C1245e(0);

    /* renamed from: j */
    public C0016e f5224j = new C0016e(17, false);

    /* renamed from: a */
    public void mo2723a(long j) {
        this.f5221g = j;
    }

    /* renamed from: b */
    public abstract long mo2714b(C1132w c1132w);

    /* renamed from: c */
    public abstract boolean mo2715c(C1132w c1132w, long j, C0016e c0016e);

    /* renamed from: d */
    public void mo2716d(boolean z7) {
        if (z7) {
            this.f5224j = new C0016e(17, false);
            this.f5220f = 0L;
            this.f5222h = 0;
        } else {
            this.f5222h = 1;
        }
        this.f5219e = -1L;
        this.f5221g = 0L;
    }
}
