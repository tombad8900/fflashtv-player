package p115n1;

import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.h0 */
/* loaded from: classes.dex */
public final class C1978h0 {

    /* renamed from: a */
    public final int f7338a;

    /* renamed from: b */
    public final byte[] f7339b;

    /* renamed from: c */
    public final int f7340c;

    /* renamed from: d */
    public final int f7341d;

    public C1978h0(int i, int i4, int i8, byte[] bArr) {
        this.f7338a = i;
        this.f7339b = bArr;
        this.f7340c = i4;
        this.f7341d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1978h0.class == obj.getClass()) {
            C1978h0 c1978h0 = (C1978h0) obj;
            if (this.f7338a == c1978h0.f7338a && this.f7340c == c1978h0.f7340c && this.f7341d == c1978h0.f7341d && Arrays.equals(this.f7339b, c1978h0.f7339b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f7339b) + (this.f7338a * 31)) * 31) + this.f7340c) * 31) + this.f7341d;
    }
}
