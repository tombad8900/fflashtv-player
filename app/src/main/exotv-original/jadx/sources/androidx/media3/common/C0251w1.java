package androidx.media3.common;

import java.util.Arrays;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.w1 */
/* loaded from: classes.dex */
public final class C0251w1 {

    /* renamed from: a */
    public final int f1537a;

    /* renamed from: b */
    public final C0233q1 f1538b;

    /* renamed from: c */
    public final boolean f1539c;

    /* renamed from: d */
    public final int[] f1540d;

    /* renamed from: e */
    public final boolean[] f1541e;

    static {
        AbstractC1118i0.m2422M(0);
        AbstractC1118i0.m2422M(1);
        AbstractC1118i0.m2422M(3);
        AbstractC1118i0.m2422M(4);
    }

    public C0251w1(C0233q1 c0233q1, boolean z7, int[] iArr, boolean[] zArr) {
        int i = c0233q1.f1319a;
        this.f1537a = i;
        boolean z8 = false;
        AbstractC1101a.m2353d(i == iArr.length && i == zArr.length);
        this.f1538b = c0233q1;
        if (z7 && i > 1) {
            z8 = true;
        }
        this.f1539c = z8;
        this.f1540d = (int[]) iArr.clone();
        this.f1541e = (boolean[]) zArr.clone();
    }

    /* renamed from: a */
    public final C0249w m696a(int i) {
        return this.f1538b.f1322d[i];
    }

    /* renamed from: b */
    public final boolean m697b(int i) {
        return this.f1540d[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0251w1.class == obj.getClass()) {
            C0251w1 c0251w1 = (C0251w1) obj;
            if (this.f1539c == c0251w1.f1539c && this.f1538b.equals(c0251w1.f1538b) && Arrays.equals(this.f1540d, c0251w1.f1540d) && Arrays.equals(this.f1541e, c0251w1.f1541e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1541e) + ((Arrays.hashCode(this.f1540d) + (((this.f1538b.hashCode() * 31) + (this.f1539c ? 1 : 0)) * 31)) * 31);
    }
}
