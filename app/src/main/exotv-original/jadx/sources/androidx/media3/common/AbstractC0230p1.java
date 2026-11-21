package androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p043e6.InterfaceC0916d;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.p1 */
/* loaded from: classes.dex */
public abstract class AbstractC0230p1 {
    public static final AbstractC0230p1 EMPTY = new C0218l1();
    private static final String FIELD_PERIODS;
    private static final String FIELD_SHUFFLED_WINDOW_INDICES;
    private static final String FIELD_WINDOWS;

    static {
        int i = AbstractC1118i0.f4750a;
        FIELD_WINDOWS = Integer.toString(0, 36);
        FIELD_PERIODS = Integer.toString(1, 36);
        FIELD_SHUFFLED_WINDOW_INDICES = Integer.toString(2, 36);
    }

    /* renamed from: a */
    public static C0981l1 m659a(InterfaceC0916d interfaceC0916d, IBinder iBinder) {
        List listM2159f;
        int i;
        if (iBinder == null) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            return C0981l1.f4211n;
        }
        if (iBinder instanceof BinderC0210j) {
            listM2159f = ((BinderC0210j) iBinder).f1138b;
        } else {
            int i4 = BinderC0210j.f1137c;
            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
            int i8 = 0;
            int i9 = 1;
            while (i9 != 0) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInt(i8);
                    try {
                        iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                        while (true) {
                            i = parcelObtain2.readInt();
                            if (i == 1) {
                                Bundle bundle = parcelObtain2.readBundle();
                                bundle.getClass();
                                c0974j0M2164i.m2141a(bundle);
                                i8++;
                            }
                        }
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        i9 = i;
                    } catch (RemoteException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
            listM2159f = c0974j0M2164i.m2159f();
        }
        return AbstractC1101a.m2366q(interfaceC0916d, listM2159f);
    }

    public static AbstractC0230p1 fromBundle(Bundle bundle) {
        C0981l1 c0981l1M659a = m659a(new C0222n(6), bundle.getBinder(FIELD_WINDOWS));
        C0981l1 c0981l1M659a2 = m659a(new C0222n(7), bundle.getBinder(FIELD_PERIODS));
        int[] intArray = bundle.getIntArray(FIELD_SHUFFLED_WINDOW_INDICES);
        if (intArray == null) {
            int i = c0981l1M659a.f4213m;
            int[] iArr = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = i4;
            }
            intArray = iArr;
        }
        return new C0224n1(c0981l1M659a, c0981l1M659a2, intArray);
    }

    public final AbstractC0230p1 copyWithSingleWindow(int i) {
        if (getWindowCount() == 1) {
            return this;
        }
        C0227o1 window = getWindow(i, new C0227o1(), 0L);
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        int i4 = window.f1273n;
        while (true) {
            int i8 = window.f1274o;
            if (i4 > i8) {
                window.f1274o = i8 - window.f1273n;
                window.f1273n = 0;
                return new C0224n1(AbstractC0983m0.m2168n(window), c0974j0M2164i.m2159f(), new int[]{0});
            }
            C0221m1 period = getPeriod(i4, new C0221m1(), true);
            period.f1206c = 0;
            c0974j0M2164i.m2141a(period);
            i4++;
        }
    }

    public boolean equals(Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0230p1)) {
            return false;
        }
        AbstractC0230p1 abstractC0230p1 = (AbstractC0230p1) obj;
        if (abstractC0230p1.getWindowCount() != getWindowCount() || abstractC0230p1.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        C0227o1 c0227o1 = new C0227o1();
        C0221m1 c0221m1 = new C0221m1();
        C0227o1 c0227o12 = new C0227o1();
        C0221m1 c0221m12 = new C0221m1();
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, c0227o1).equals(abstractC0230p1.getWindow(i, c0227o12))) {
                return false;
            }
        }
        for (int i4 = 0; i4 < getPeriodCount(); i4++) {
            if (!getPeriod(i4, c0221m1, true).equals(abstractC0230p1.getPeriod(i4, c0221m12, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != abstractC0230p1.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != abstractC0230p1.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != abstractC0230p1.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z7) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z7) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i, C0221m1 c0221m1, C0227o1 c0227o1, int i4, boolean z7) {
        int i8 = getPeriod(i, c0221m1).f1206c;
        if (getWindow(i8, c0227o1).f1274o != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i8, i4, z7);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, c0227o1).f1273n;
    }

    public int getNextWindowIndex(int i, int i4, boolean z7) {
        if (i4 == 0) {
            if (i == getLastWindowIndex(z7)) {
                return -1;
            }
            return i + 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == getLastWindowIndex(z7) ? getFirstWindowIndex(z7) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final C0221m1 getPeriod(int i, C0221m1 c0221m1) {
        return getPeriod(i, c0221m1, false);
    }

    public abstract C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7);

    public C0221m1 getPeriodByUid(Object obj, C0221m1 c0221m1) {
        return getPeriod(getIndexOfPeriod(obj), c0221m1, true);
    }

    public abstract int getPeriodCount();

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(C0227o1 c0227o1, C0221m1 c0221m1, int i, long j) {
        return getPeriodPositionUs(c0227o1, c0221m1, i, j);
    }

    public final Pair<Object, Long> getPeriodPositionUs(C0227o1 c0227o1, C0221m1 c0221m1, int i, long j) {
        Pair<Object, Long> periodPositionUs = getPeriodPositionUs(c0227o1, c0221m1, i, j, 0L);
        periodPositionUs.getClass();
        return periodPositionUs;
    }

    public int getPreviousWindowIndex(int i, int i4, boolean z7) {
        if (i4 == 0) {
            if (i == getFirstWindowIndex(z7)) {
                return -1;
            }
            return i - 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == getFirstWindowIndex(z7) ? getLastWindowIndex(z7) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i);

    public final C0227o1 getWindow(int i, C0227o1 c0227o1) {
        return getWindow(i, c0227o1, 0L);
    }

    public abstract C0227o1 getWindow(int i, C0227o1 c0227o1, long j);

    public abstract int getWindowCount();

    public int hashCode() {
        C0227o1 c0227o1 = new C0227o1();
        C0221m1 c0221m1 = new C0221m1();
        int windowCount = getWindowCount() + 217;
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, c0227o1).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i4 = 0; i4 < getPeriodCount(); i4++) {
            periodCount = (periodCount * 31) + getPeriod(i4, c0221m1, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i, C0221m1 c0221m1, C0227o1 c0227o1, int i4, boolean z7) {
        return getNextPeriodIndex(i, c0221m1, c0227o1, i4, z7) == -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Bundle toBundle() {
        long j;
        long j8;
        boolean z7;
        int i;
        long j9;
        C0221m1 c0221m1;
        int i4;
        Bundle bundleM653d;
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        C0227o1 c0227o1 = new C0227o1();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            j = -9223372036854775807L;
            j8 = 0;
            if (i8 >= windowCount) {
                break;
            }
            C0227o1 window = getWindow(i8, c0227o1, 0L);
            window.getClass();
            Bundle bundle = new Bundle();
            if (!C0226o0.f1231g.equals(window.f1262c)) {
                bundle.putBundle(C0227o1.f1253t, window.f1262c.m653d(false));
            }
            long j10 = window.f1264e;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(C0227o1.f1254u, j10);
            }
            long j11 = window.f1265f;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(C0227o1.f1255v, j11);
            }
            long j12 = window.f1266g;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(C0227o1.f1256w, j12);
            }
            boolean z9 = window.f1267h;
            if (z9) {
                bundle.putBoolean(C0227o1.f1257x, z9);
            }
            boolean z10 = window.f1268i;
            if (z10) {
                bundle.putBoolean(C0227o1.f1258y, z10);
            }
            C0208i0 c0208i0 = window.f1269j;
            if (c0208i0 != null) {
                bundle.putBundle(C0227o1.f1259z, c0208i0.m627c());
            }
            boolean z11 = window.f1270k;
            if (z11) {
                bundle.putBoolean(C0227o1.f1244A, z11);
            }
            long j13 = window.f1271l;
            if (j13 != 0) {
                bundle.putLong(C0227o1.f1245B, j13);
            }
            long j14 = window.f1272m;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(C0227o1.f1246C, j14);
            }
            int i9 = window.f1273n;
            if (i9 != 0) {
                bundle.putInt(C0227o1.f1247D, i9);
            }
            int i10 = window.f1274o;
            if (i10 != 0) {
                bundle.putInt(C0227o1.f1248E, i10);
            }
            long j15 = window.f1275p;
            if (j15 != 0) {
                bundle.putLong(C0227o1.f1249F, j15);
            }
            arrayList.add(bundle);
            i8++;
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        C0221m1 c0221m12 = new C0221m1();
        int i11 = 0;
        while (i11 < periodCount) {
            C0221m1 period = getPeriod(i11, c0221m12, z8);
            period.getClass();
            Bundle bundle2 = new Bundle();
            int i12 = period.f1206c;
            long j16 = j;
            if (i12 != 0) {
                bundle2.putInt(C0221m1.f1199h, i12);
            }
            long j17 = period.f1207d;
            if (j17 != j16) {
                bundle2.putLong(C0221m1.f1200i, j17);
            }
            long j18 = period.f1208e;
            if (j18 != j8) {
                bundle2.putLong(C0221m1.f1201j, j18);
            }
            boolean z12 = period.f1209f;
            if (z12) {
                bundle2.putBoolean(C0221m1.f1202k, z12);
            }
            if (period.f1210g.equals(C0187c.f1044g)) {
                z7 = z8;
                i = periodCount;
                j9 = j8;
                c0221m1 = c0221m12;
            } else {
                String str = C0221m1.f1203l;
                C0187c c0187c = period.f1210g;
                c0187c.getClass();
                Bundle bundle3 = new Bundle();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                j9 = j8;
                C0183b[] c0183bArr = c0187c.f1055f;
                int length = c0183bArr.length;
                z7 = z8;
                ?? r42 = z8;
                while (r42 < length) {
                    C0183b c0183b = c0183bArr[r42];
                    c0183b.getClass();
                    int i13 = r42;
                    Bundle bundle4 = new Bundle();
                    int i14 = periodCount;
                    C0183b[] c0183bArr2 = c0183bArr;
                    int i15 = length;
                    bundle4.putLong(C0183b.f1012j, c0183b.f1021a);
                    bundle4.putInt(C0183b.f1013k, c0183b.f1022b);
                    bundle4.putInt(C0183b.f1019q, c0183b.f1023c);
                    bundle4.putParcelableArrayList(C0183b.f1014l, new ArrayList<>(Arrays.asList(c0183b.f1024d)));
                    String str2 = C0183b.f1020r;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    C0226o0[] c0226o0Arr = c0183b.f1025e;
                    C0221m1 c0221m13 = c0221m12;
                    int length2 = c0226o0Arr.length;
                    ?? r9 = z7;
                    while (r9 < length2) {
                        int i16 = r9;
                        C0226o0 c0226o0 = c0226o0Arr[i16];
                        if (c0226o0 == null) {
                            bundleM653d = null;
                            i4 = length2;
                        } else {
                            i4 = length2;
                            bundleM653d = c0226o0.m653d(true);
                        }
                        arrayList4.add(bundleM653d);
                        r9 = i16 + 1;
                        length2 = i4;
                    }
                    bundle4.putParcelableArrayList(str2, arrayList4);
                    bundle4.putIntArray(C0183b.f1015m, c0183b.f1026f);
                    bundle4.putLongArray(C0183b.f1016n, c0183b.f1027g);
                    bundle4.putLong(C0183b.f1017o, c0183b.f1028h);
                    bundle4.putBoolean(C0183b.f1018p, c0183b.f1029i);
                    arrayList3.add(bundle4);
                    periodCount = i14;
                    c0183bArr = c0183bArr2;
                    length = i15;
                    c0221m12 = c0221m13;
                    r42 = i13 + 1;
                }
                i = periodCount;
                c0221m1 = c0221m12;
                if (!arrayList3.isEmpty()) {
                    bundle3.putParcelableArrayList(C0187c.f1046i, arrayList3);
                }
                long j19 = c0187c.f1052c;
                if (j19 != j9) {
                    bundle3.putLong(C0187c.f1047j, j19);
                }
                long j20 = c0187c.f1053d;
                if (j20 != j16) {
                    bundle3.putLong(C0187c.f1048k, j20);
                }
                int i17 = c0187c.f1054e;
                if (i17 != 0) {
                    bundle3.putInt(C0187c.f1049l, i17);
                }
                bundle2.putBundle(str, bundle3);
            }
            arrayList2.add(bundle2);
            i11++;
            j = j16;
            j8 = j9;
            z8 = z7;
            periodCount = i;
            c0221m12 = c0221m1;
        }
        int i18 = z8;
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[i18] = getFirstWindowIndex(true);
        }
        for (int i19 = 1; i19 < windowCount; i19++) {
            iArr[i19] = getNextWindowIndex(iArr[i19 - 1], i18, true);
        }
        Bundle bundle5 = new Bundle();
        bundle5.putBinder(FIELD_WINDOWS, new BinderC0210j(arrayList));
        bundle5.putBinder(FIELD_PERIODS, new BinderC0210j(arrayList2));
        bundle5.putIntArray(FIELD_SHUFFLED_WINDOW_INDICES, iArr);
        return bundle5;
    }

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(C0227o1 c0227o1, C0221m1 c0221m1, int i, long j, long j8) {
        return getPeriodPositionUs(c0227o1, c0221m1, i, j, j8);
    }

    public final Pair<Object, Long> getPeriodPositionUs(C0227o1 c0227o1, C0221m1 c0221m1, int i, long j, long j8) {
        AbstractC1101a.m2356g(i, getWindowCount());
        getWindow(i, c0227o1, j8);
        if (j == -9223372036854775807L) {
            j = c0227o1.f1271l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i4 = c0227o1.f1273n;
        getPeriod(i4, c0221m1);
        while (i4 < c0227o1.f1274o && c0221m1.f1208e != j) {
            int i8 = i4 + 1;
            if (getPeriod(i8, c0221m1).f1208e > j) {
                break;
            }
            i4 = i8;
        }
        getPeriod(i4, c0221m1, true);
        long jMin = j - c0221m1.f1208e;
        long j9 = c0221m1.f1207d;
        if (j9 != -9223372036854775807L) {
            jMin = Math.min(jMin, j9 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c0221m1.f1205b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }
}
