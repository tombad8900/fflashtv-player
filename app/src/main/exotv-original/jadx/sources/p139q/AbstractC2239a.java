package p139q;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q.a */
/* loaded from: classes.dex */
public abstract class AbstractC2239a {

    /* renamed from: a */
    public static final int[] f7768a = new int[0];

    /* renamed from: b */
    public static final Object[] f7769b = new Object[0];

    /* renamed from: a */
    public static final int m4011a(int i, int i4, int[] iArr) {
        AbstractC2980h.m5136e("array", iArr);
        int i8 = i - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i4) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i4) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    /* renamed from: b */
    public static final int m4012b(long[] jArr, int i, long j) {
        AbstractC2980h.m5136e("array", jArr);
        int i4 = i - 1;
        int i8 = 0;
        while (i8 <= i4) {
            int i9 = (i8 + i4) >>> 1;
            long j8 = jArr[i9];
            if (j8 < j) {
                i8 = i9 + 1;
            } else {
                if (j8 <= j) {
                    return i9;
                }
                i4 = i9 - 1;
            }
        }
        return ~i8;
    }
}
