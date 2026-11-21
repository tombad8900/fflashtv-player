package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.q1 */
/* loaded from: classes.dex */
public final class C0233q1 {

    /* renamed from: f */
    public static final String f1317f;

    /* renamed from: g */
    public static final String f1318g;

    /* renamed from: a */
    public final int f1319a;

    /* renamed from: b */
    public final String f1320b;

    /* renamed from: c */
    public final int f1321c;

    /* renamed from: d */
    public final C0249w[] f1322d;

    /* renamed from: e */
    public int f1323e;

    static {
        int i = AbstractC1118i0.f4750a;
        f1317f = Integer.toString(0, 36);
        f1318g = Integer.toString(1, 36);
    }

    public C0233q1(String str, C0249w... c0249wArr) {
        AbstractC1101a.m2353d(c0249wArr.length > 0);
        this.f1320b = str;
        this.f1322d = c0249wArr;
        this.f1319a = c0249wArr.length;
        int iM680i = AbstractC0244u0.m680i(c0249wArr[0].f1522n);
        this.f1321c = iM680i == -1 ? AbstractC0244u0.m680i(c0249wArr[0].f1521m) : iM680i;
        String str2 = c0249wArr[0].f1512d;
        str2 = (str2 == null || str2.equals("und")) ? C2181z.FRAGMENT_ENCODE_SET : str2;
        int i = c0249wArr[0].f1514f | 16384;
        for (int i4 = 1; i4 < c0249wArr.length; i4++) {
            String str3 = c0249wArr[i4].f1512d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? C2181z.FRAGMENT_ENCODE_SET : str3)) {
                m662c(i4, "languages", c0249wArr[0].f1512d, c0249wArr[i4].f1512d);
                return;
            } else {
                if (i != (c0249wArr[i4].f1514f | 16384)) {
                    m662c(i4, "role flags", Integer.toBinaryString(c0249wArr[0].f1514f), Integer.toBinaryString(c0249wArr[i4].f1514f));
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static C0233q1 m661a(Bundle bundle) {
        C0981l1 c0981l1M2366q;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1317f);
        if (parcelableArrayList == null) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            c0981l1M2366q = C0981l1.f4211n;
        } else {
            c0981l1M2366q = AbstractC1101a.m2366q(new C0222n(8), parcelableArrayList);
        }
        return new C0233q1(bundle.getString(f1318g, C2181z.FRAGMENT_ENCODE_SET), (C0249w[]) c0981l1M2366q.toArray(new C0249w[0]));
    }

    /* renamed from: c */
    public static void m662c(int i, String str, String str2, String str3) {
        AbstractC1101a.m2365p("TrackGroup", C2181z.FRAGMENT_ENCODE_SET, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* renamed from: b */
    public final int m663b(C0249w c0249w) {
        int i = 0;
        while (true) {
            C0249w[] c0249wArr = this.f1322d;
            if (i >= c0249wArr.length) {
                return -1;
            }
            if (c0249w == c0249wArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: d */
    public final Bundle m664d() {
        Bundle bundle = new Bundle();
        C0249w[] c0249wArr = this.f1322d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c0249wArr.length);
        for (C0249w c0249w : c0249wArr) {
            arrayList.add(c0249w.m694d(true));
        }
        bundle.putParcelableArrayList(f1317f, arrayList);
        bundle.putString(f1318g, this.f1320b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0233q1.class == obj.getClass()) {
            C0233q1 c0233q1 = (C0233q1) obj;
            if (this.f1320b.equals(c0233q1.f1320b) && Arrays.equals(this.f1322d, c0233q1.f1322d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1323e == 0) {
            this.f1323e = Arrays.hashCode(this.f1322d) + AbstractC0008a1.m9e(this.f1320b, 527, 31);
        }
        return this.f1323e;
    }
}
