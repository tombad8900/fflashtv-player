package p075i6;

import com.bumptech.glide.AbstractC0714c;
import java.io.Serializable;
import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i6.a */
/* loaded from: classes.dex */
public final class C1274a implements Serializable {

    /* renamed from: l */
    public static final /* synthetic */ int f5298l = 0;

    /* renamed from: j */
    public final int[] f5299j;

    /* renamed from: k */
    public final int f5300k;

    static {
        new C1274a(new int[0]);
    }

    public C1274a(int[] iArr) {
        int length = iArr.length;
        this.f5299j = iArr;
        this.f5300k = length;
    }

    public final boolean equals(Object obj) {
        C1274a c1274a;
        int i;
        int i4;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1274a) && (i4 = this.f5300k) == (i = (c1274a = (C1274a) obj).f5300k)) {
            for (int i8 = 0; i8 < i4; i8++) {
                AbstractC0714c.m1527m(i8, i4);
                int i9 = this.f5299j[i8];
                AbstractC0714c.m1527m(i8, i);
                if (i9 == c1274a.f5299j[i8]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f5300k; i4++) {
            i = (i * 31) + this.f5299j[i4];
        }
        return i;
    }

    public final String toString() {
        int i = this.f5300k;
        if (i == 0) {
            return C2181z.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f5299j;
        sb.append(iArr[0]);
        for (int i4 = 1; i4 < i; i4++) {
            sb.append(", ");
            sb.append(iArr[i4]);
        }
        sb.append(']');
        return sb.toString();
    }
}
