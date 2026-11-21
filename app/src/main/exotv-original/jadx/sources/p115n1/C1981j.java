package p115n1;

import java.util.Arrays;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.j */
/* loaded from: classes.dex */
public final class C1981j implements InterfaceC1968c0 {

    /* renamed from: a */
    public final int f7342a;

    /* renamed from: b */
    public final int[] f7343b;

    /* renamed from: c */
    public final long[] f7344c;

    /* renamed from: d */
    public final long[] f7345d;

    /* renamed from: e */
    public final long[] f7346e;

    /* renamed from: f */
    public final long f7347f;

    public C1981j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7343b = iArr;
        this.f7344c = jArr;
        this.f7345d = jArr2;
        this.f7346e = jArr3;
        int length = iArr.length;
        this.f7342a = length;
        if (length > 0) {
            this.f7347f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f7347f = 0L;
        }
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f7347f;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        long[] jArr = this.f7346e;
        int iM2444e = AbstractC1118i0.m2444e(jArr, j, true);
        long j8 = jArr[iM2444e];
        long[] jArr2 = this.f7344c;
        C1970d0 c1970d0 = new C1970d0(j8, jArr2[iM2444e]);
        if (j8 >= j || iM2444e == this.f7342a - 1) {
            return new C1966b0(c1970d0, c1970d0);
        }
        int i = iM2444e + 1;
        return new C1966b0(c1970d0, new C1970d0(jArr[i], jArr2[i]));
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f7342a + ", sizes=" + Arrays.toString(this.f7343b) + ", offsets=" + Arrays.toString(this.f7344c) + ", timeUs=" + Arrays.toString(this.f7346e) + ", durationsUs=" + Arrays.toString(this.f7345d) + ")";
    }
}
