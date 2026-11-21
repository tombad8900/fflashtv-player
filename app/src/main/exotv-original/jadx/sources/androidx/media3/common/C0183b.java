package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.b */
/* loaded from: classes.dex */
public final class C0183b {

    /* renamed from: j */
    public static final String f1012j;

    /* renamed from: k */
    public static final String f1013k;

    /* renamed from: l */
    public static final String f1014l;

    /* renamed from: m */
    public static final String f1015m;

    /* renamed from: n */
    public static final String f1016n;

    /* renamed from: o */
    public static final String f1017o;

    /* renamed from: p */
    public static final String f1018p;

    /* renamed from: q */
    public static final String f1019q;

    /* renamed from: r */
    public static final String f1020r;

    /* renamed from: a */
    public final long f1021a;

    /* renamed from: b */
    public final int f1022b;

    /* renamed from: c */
    public final int f1023c;

    /* renamed from: d */
    public final Uri[] f1024d;

    /* renamed from: e */
    public final C0226o0[] f1025e;

    /* renamed from: f */
    public final int[] f1026f;

    /* renamed from: g */
    public final long[] f1027g;

    /* renamed from: h */
    public final long f1028h;

    /* renamed from: i */
    public final boolean f1029i;

    static {
        int i = AbstractC1118i0.f4750a;
        f1012j = Integer.toString(0, 36);
        f1013k = Integer.toString(1, 36);
        f1014l = Integer.toString(2, 36);
        f1015m = Integer.toString(3, 36);
        f1016n = Integer.toString(4, 36);
        f1017o = Integer.toString(5, 36);
        f1018p = Integer.toString(6, 36);
        f1019q = Integer.toString(7, 36);
        f1020r = Integer.toString(8, 36);
    }

    public C0183b(long j) {
        this(j, -1, -1, new int[0], new C0226o0[0], new long[0], 0L, false);
    }

    /* renamed from: a */
    public static C0183b m604a(Bundle bundle) {
        C0226o0[] c0226o0Arr;
        long j = bundle.getLong(f1012j);
        int i = bundle.getInt(f1013k);
        int i4 = bundle.getInt(f1019q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1014l);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f1020r);
        int[] intArray = bundle.getIntArray(f1015m);
        long[] longArray = bundle.getLongArray(f1016n);
        long j8 = bundle.getLong(f1017o);
        boolean z7 = bundle.getBoolean(f1018p);
        if (intArray == null) {
            intArray = new int[0];
        }
        if (parcelableArrayList2 != null) {
            c0226o0Arr = new C0226o0[parcelableArrayList2.size()];
            for (int i8 = 0; i8 < parcelableArrayList2.size(); i8++) {
                Bundle bundle2 = (Bundle) parcelableArrayList2.get(i8);
                c0226o0Arr[i8] = bundle2 == null ? null : C0226o0.m650b(bundle2);
            }
        } else if (parcelableArrayList != null) {
            C0226o0[] c0226o0Arr2 = new C0226o0[parcelableArrayList.size()];
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                Uri uri = (Uri) parcelableArrayList.get(i9);
                c0226o0Arr2[i9] = uri == null ? null : C0226o0.m651c(uri);
            }
            c0226o0Arr = c0226o0Arr2;
        } else {
            c0226o0Arr = new C0226o0[0];
        }
        if (longArray == null) {
            longArray = new long[0];
        }
        return new C0183b(j, i, i4, intArray, c0226o0Arr, longArray, j8, z7);
    }

    /* renamed from: b */
    public final int m605b(int i) {
        int i4;
        int i8 = i + 1;
        while (true) {
            int[] iArr = this.f1026f;
            if (i8 >= iArr.length || this.f1029i || (i4 = iArr[i8]) == 0 || i4 == 1) {
                break;
            }
            i8++;
        }
        return i8;
    }

    /* renamed from: c */
    public final C0183b m606c(int i) {
        int[] iArr = this.f1026f;
        int length = iArr.length;
        int iMax = Math.max(i, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f1027g;
        int length2 = jArr.length;
        int iMax2 = Math.max(i, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C0183b(this.f1021a, i, this.f1023c, iArrCopyOf, (C0226o0[]) Arrays.copyOf(this.f1025e, i), jArrCopyOf, this.f1028h, this.f1029i);
    }

    /* renamed from: d */
    public final C0183b m607d(long[] jArr) {
        int length = jArr.length;
        C0226o0[] c0226o0Arr = this.f1025e;
        if (length < c0226o0Arr.length) {
            int length2 = c0226o0Arr.length;
            int length3 = jArr.length;
            int iMax = Math.max(length2, length3);
            jArr = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArr, length3, iMax, -9223372036854775807L);
        } else if (this.f1022b != -1 && jArr.length > c0226o0Arr.length) {
            jArr = Arrays.copyOf(jArr, c0226o0Arr.length);
        }
        return new C0183b(this.f1021a, this.f1022b, this.f1023c, this.f1026f, this.f1025e, jArr, this.f1028h, this.f1029i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0183b.class == obj.getClass()) {
            C0183b c0183b = (C0183b) obj;
            if (this.f1021a == c0183b.f1021a && this.f1022b == c0183b.f1022b && this.f1023c == c0183b.f1023c && Arrays.equals(this.f1025e, c0183b.f1025e) && Arrays.equals(this.f1026f, c0183b.f1026f) && Arrays.equals(this.f1027g, c0183b.f1027g) && this.f1028h == c0183b.f1028h && this.f1029i == c0183b.f1029i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f1022b * 31) + this.f1023c) * 31;
        long j = this.f1021a;
        int iHashCode = (Arrays.hashCode(this.f1027g) + ((Arrays.hashCode(this.f1026f) + ((Arrays.hashCode(this.f1025e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j8 = this.f1028h;
        return ((iHashCode + ((int) ((j8 >>> 32) ^ j8))) * 31) + (this.f1029i ? 1 : 0);
    }

    public C0183b(long j, int i, int i4, int[] iArr, C0226o0[] c0226o0Arr, long[] jArr, long j8, boolean z7) {
        Uri uri;
        int i8 = 0;
        AbstractC1101a.m2353d(iArr.length == c0226o0Arr.length);
        this.f1021a = j;
        this.f1022b = i;
        this.f1023c = i4;
        this.f1026f = iArr;
        this.f1025e = c0226o0Arr;
        this.f1027g = jArr;
        this.f1028h = j8;
        this.f1029i = z7;
        this.f1024d = new Uri[c0226o0Arr.length];
        while (true) {
            Uri[] uriArr = this.f1024d;
            if (i8 >= uriArr.length) {
                return;
            }
            C0226o0 c0226o0 = c0226o0Arr[i8];
            if (c0226o0 == null) {
                uri = null;
            } else {
                C0211j0 c0211j0 = c0226o0.f1239b;
                c0211j0.getClass();
                uri = c0211j0.f1147a;
            }
            uriArr[i8] = uri;
            i8++;
        }
    }
}
