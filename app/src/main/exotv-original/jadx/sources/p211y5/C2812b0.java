package p211y5;

import android.util.StateSet;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.b0 */
/* loaded from: classes.dex */
public final class C2812b0 {

    /* renamed from: a */
    public int f10434a;

    /* renamed from: b */
    public C2828o f10435b;

    /* renamed from: c */
    public int[][] f10436c;

    /* renamed from: d */
    public C2828o[] f10437d;

    /* renamed from: e */
    public C2810a0 f10438e;

    /* renamed from: f */
    public C2810a0 f10439f;

    /* renamed from: g */
    public C2810a0 f10440g;

    /* renamed from: h */
    public C2810a0 f10441h;

    public C2812b0(C2828o c2828o) {
        m4916c();
        m4914a(StateSet.WILD_CARD, c2828o);
    }

    /* renamed from: a */
    public final void m4914a(int[] iArr, C2828o c2828o) {
        int i = this.f10434a;
        if (i == 0 || iArr.length == 0) {
            this.f10435b = c2828o;
        }
        int[][] iArr2 = this.f10436c;
        if (i >= iArr2.length) {
            int i4 = i + 10;
            int[][] iArr3 = new int[i4][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f10436c = iArr3;
            C2828o[] c2828oArr = new C2828o[i4];
            System.arraycopy(this.f10437d, 0, c2828oArr, 0, i);
            this.f10437d = c2828oArr;
        }
        int[][] iArr4 = this.f10436c;
        int i8 = this.f10434a;
        iArr4[i8] = iArr;
        this.f10437d[i8] = c2828o;
        this.f10434a = i8 + 1;
    }

    /* renamed from: b */
    public final C2814c0 m4915b() {
        if (this.f10434a == 0) {
            return null;
        }
        return new C2814c0(this);
    }

    /* renamed from: c */
    public final void m4916c() {
        this.f10435b = new C2828o();
        this.f10436c = new int[10][];
        this.f10437d = new C2828o[10];
    }
}
