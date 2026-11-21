package p130p;

import p111m6.AbstractC1912g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.g */
/* loaded from: classes.dex */
public final class C2188g {

    /* renamed from: a */
    public int[] f7637a;

    /* renamed from: b */
    public int f7638b;

    /* renamed from: c */
    public int f7639c;

    /* renamed from: d */
    public int f7640d;

    public C2188g() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f7640d = iHighestOneBit - 1;
        this.f7637a = new int[iHighestOneBit];
    }

    /* renamed from: a */
    public final void m3964a(int i) {
        int[] iArr = this.f7637a;
        int i4 = this.f7639c;
        iArr[i4] = i;
        int i8 = this.f7640d & (i4 + 1);
        this.f7639c = i8;
        int i9 = this.f7638b;
        if (i8 == i9) {
            int length = iArr.length;
            int i10 = length - i9;
            int i11 = length << 1;
            if (i11 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i11];
            AbstractC1912g.m3727k0(0, i9, length, iArr, iArr2);
            AbstractC1912g.m3727k0(i10, 0, this.f7638b, this.f7637a, iArr2);
            this.f7637a = iArr2;
            this.f7638b = 0;
            this.f7639c = length;
            this.f7640d = i11 - 1;
        }
    }
}
