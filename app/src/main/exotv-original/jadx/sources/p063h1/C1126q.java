package p063h1;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.q */
/* loaded from: classes.dex */
public final class C1126q {

    /* renamed from: a */
    public int f4780a;

    /* renamed from: b */
    public int f4781b;

    /* renamed from: c */
    public int f4782c;

    /* renamed from: d */
    public long[] f4783d;

    /* renamed from: e */
    public int f4784e;

    /* renamed from: a */
    public final long m2476a() {
        int i = this.f4782c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f4783d;
        int i4 = this.f4780a;
        long j = jArr[i4];
        this.f4780a = this.f4784e & (i4 + 1);
        this.f4782c = i - 1;
        return j;
    }
}
