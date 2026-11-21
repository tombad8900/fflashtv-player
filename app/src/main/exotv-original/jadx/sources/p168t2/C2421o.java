package p168t2;

import android.util.SparseArray;
import p063h1.C1131v;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.o */
/* loaded from: classes.dex */
public final class C2421o {

    /* renamed from: a */
    public final InterfaceC1980i0 f8638a;

    /* renamed from: b */
    public final boolean f8639b;

    /* renamed from: c */
    public final boolean f8640c;

    /* renamed from: f */
    public final C1131v f8643f;

    /* renamed from: g */
    public byte[] f8644g;

    /* renamed from: h */
    public int f8645h;

    /* renamed from: i */
    public int f8646i;

    /* renamed from: j */
    public long f8647j;

    /* renamed from: l */
    public long f8649l;

    /* renamed from: p */
    public long f8653p;

    /* renamed from: q */
    public long f8654q;

    /* renamed from: r */
    public boolean f8655r;

    /* renamed from: s */
    public boolean f8656s;

    /* renamed from: d */
    public final SparseArray f8641d = new SparseArray();

    /* renamed from: e */
    public final SparseArray f8642e = new SparseArray();

    /* renamed from: m */
    public C2420n f8650m = new C2420n();

    /* renamed from: n */
    public C2420n f8651n = new C2420n();

    /* renamed from: k */
    public boolean f8648k = false;

    /* renamed from: o */
    public boolean f8652o = false;

    public C2421o(InterfaceC1980i0 interfaceC1980i0, boolean z7, boolean z8) {
        this.f8638a = interfaceC1980i0;
        this.f8639b = z7;
        this.f8640c = z8;
        byte[] bArr = new byte[128];
        this.f8644g = bArr;
        this.f8643f = new C1131v(bArr, 0, 0);
        C2420n c2420n = this.f8651n;
        c2420n.f8623b = false;
        c2420n.f8622a = false;
    }

    /* renamed from: a */
    public final void m4292a() {
        boolean z7;
        int i;
        boolean z8 = false;
        if (this.f8639b) {
            C2420n c2420n = this.f8651n;
            z7 = c2420n.f8623b && ((i = c2420n.f8626e) == 7 || i == 2);
        } else {
            z7 = this.f8656s;
        }
        boolean z9 = this.f8655r;
        int i4 = this.f8646i;
        if (i4 == 5 || (z7 && i4 == 1)) {
            z8 = true;
        }
        this.f8655r = z9 | z8;
    }
}
