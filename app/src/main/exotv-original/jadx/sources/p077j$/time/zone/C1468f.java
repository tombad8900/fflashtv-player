package p077j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p077j$.time.AbstractC1352b;
import p077j$.time.C1351a0;
import p077j$.time.C1424j;
import p077j$.time.C1426l;
import p077j$.time.EnumC1394e;
import p077j$.time.EnumC1428n;
import p077j$.time.Instant;
import p077j$.time.LocalDate;
import p077j$.time.chrono.C1384s;
import p077j$.time.temporal.C1450p;
import p077j$.time.temporal.EnumC1435a;

/* renamed from: j$.time.zone.f */
/* loaded from: classes2.dex */
public final class C1468f implements Serializable {

    /* renamed from: i */
    public static final long[] f5661i = new long[0];

    /* renamed from: j */
    public static final C1467e[] f5662j = new C1467e[0];

    /* renamed from: k */
    public static final C1424j[] f5663k = new C1424j[0];

    /* renamed from: l */
    public static final C1464b[] f5664l = new C1464b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a */
    public final long[] f5665a;

    /* renamed from: b */
    public final C1351a0[] f5666b;

    /* renamed from: c */
    public final long[] f5667c;

    /* renamed from: d */
    public final C1424j[] f5668d;

    /* renamed from: e */
    public final C1351a0[] f5669e;

    /* renamed from: f */
    public final C1467e[] f5670f;

    /* renamed from: g */
    public final TimeZone f5671g;

    /* renamed from: h */
    public final transient ConcurrentMap f5672h = new ConcurrentHashMap();

    /* renamed from: a */
    public static Object m3131a(C1424j c1424j, C1464b c1464b) {
        C1424j c1424j2 = c1464b.f5647b;
        if (c1464b.m3128w()) {
            if (c1424j.m3057F(c1424j2)) {
                return c1464b.f5648c;
            }
            if (!c1424j.m3057F(c1464b.f5647b.m3059X(c1464b.f5649d.f5419b - c1464b.f5648c.f5419b))) {
                return c1464b.f5649d;
            }
        } else {
            if (!c1424j.m3057F(c1424j2)) {
                return c1464b.f5649d;
            }
            if (c1424j.m3057F(c1464b.f5647b.m3059X(c1464b.f5649d.f5419b - c1464b.f5648c.f5419b))) {
                return c1464b.f5648c;
            }
        }
        return c1464b;
    }

    public C1468f(long[] jArr, C1351a0[] c1351a0Arr, long[] jArr2, C1351a0[] c1351a0Arr2, C1467e[] c1467eArr) {
        this.f5665a = jArr;
        this.f5666b = c1351a0Arr;
        this.f5667c = jArr2;
        this.f5669e = c1351a0Arr2;
        this.f5670f = c1467eArr;
        if (jArr2.length == 0) {
            this.f5668d = f5663k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jArr2.length) {
                int i4 = i + 1;
                C1464b c1464b = new C1464b(jArr2[i], c1351a0Arr2[i], c1351a0Arr2[i4]);
                if (c1464b.m3128w()) {
                    arrayList.add(c1464b.f5647b);
                    arrayList.add(c1464b.f5647b.m3059X(c1464b.f5649d.f5419b - c1464b.f5648c.f5419b));
                } else {
                    arrayList.add(c1464b.f5647b.m3059X(c1464b.f5649d.f5419b - c1464b.f5648c.f5419b));
                    arrayList.add(c1464b.f5647b);
                }
                i = i4;
            }
            this.f5668d = (C1424j[]) arrayList.toArray(new C1424j[arrayList.size()]);
        }
        this.f5671g = null;
    }

    public C1468f(C1351a0 c1351a0) {
        C1351a0[] c1351a0Arr = {c1351a0};
        this.f5666b = c1351a0Arr;
        long[] jArr = f5661i;
        this.f5665a = jArr;
        this.f5667c = jArr;
        this.f5668d = f5663k;
        this.f5669e = c1351a0Arr;
        this.f5670f = f5662j;
        this.f5671g = null;
    }

    public C1468f(TimeZone timeZone) {
        C1351a0[] c1351a0Arr = {m3133g(timeZone.getRawOffset())};
        this.f5666b = c1351a0Arr;
        long[] jArr = f5661i;
        this.f5665a = jArr;
        this.f5667c = jArr;
        this.f5668d = f5663k;
        this.f5669e = c1351a0Arr;
        this.f5670f = f5662j;
        this.f5671g = timeZone;
    }

    /* renamed from: g */
    public static C1351a0 m3133g(int i) {
        return C1351a0.m2915Y(i / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1463a(this.f5671g != null ? (byte) 100 : (byte) 1, this);
    }

    /* renamed from: c */
    public static int m3132c(long j, C1351a0 c1351a0) {
        return LocalDate.m2887c0(Math.floorDiv(j + c1351a0.f5419b, 86400)).f5410a;
    }

    /* renamed from: d */
    public final C1351a0 m3135d(Instant instant) {
        TimeZone timeZone = this.f5671g;
        if (timeZone != null) {
            return m3133g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f5667c;
        if (jArr.length == 0) {
            return this.f5666b[0];
        }
        long j = instant.f5406a;
        if (this.f5670f.length > 0 && j > jArr[jArr.length - 1]) {
            C1464b[] c1464bArrM3134b = m3134b(m3132c(j, this.f5669e[r8.length - 1]));
            C1464b c1464b = null;
            for (int i = 0; i < c1464bArrM3134b.length; i++) {
                c1464b = c1464bArrM3134b[i];
                if (j < c1464b.f5646a) {
                    return c1464b.f5648c;
                }
            }
            return c1464b.f5649d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f5669e[iBinarySearch + 1];
    }

    /* renamed from: f */
    public final List m3137f(C1424j c1424j) {
        Object objM3136e = m3136e(c1424j);
        if (!(objM3136e instanceof C1464b)) {
            return Collections.singletonList((C1351a0) objM3136e);
        }
        C1464b c1464b = (C1464b) objM3136e;
        return c1464b.m3128w() ? Collections.EMPTY_LIST : AbstractC1352b.m2922a(new Object[]{c1464b.f5648c, c1464b.f5649d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.m3063w(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f5571b.m3075d0() <= r0.f5571b.m3075d0()) goto L44;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3136e(C1424j c1424j) {
        Object obj = null;
        int i = 0;
        if (this.f5671g != null) {
            C1464b[] c1464bArrM3134b = m3134b(c1424j.f5570a.f5410a);
            if (c1464bArrM3134b.length == 0) {
                return m3133g(this.f5671g.getOffset(c1424j.m2956v(this.f5666b[0]) * 1000));
            }
            int length = c1464bArrM3134b.length;
            while (i < length) {
                C1464b c1464b = c1464bArrM3134b[i];
                Object objM3131a = m3131a(c1424j, c1464b);
                if ((objM3131a instanceof C1464b) || objM3131a.equals(c1464b.f5648c)) {
                    return objM3131a;
                }
                i++;
                obj = objM3131a;
            }
            return obj;
        }
        if (this.f5667c.length == 0) {
            return this.f5666b[0];
        }
        if (this.f5670f.length > 0) {
            C1424j c1424j2 = this.f5668d[r0.length - 1];
            if (c1424j2 == null) {
                long jMo2891K = c1424j.f5570a.mo2891K();
                long jMo2891K2 = c1424j2.f5570a.mo2891K();
                if (jMo2891K <= jMo2891K2) {
                    if (jMo2891K == jMo2891K2) {
                    }
                }
                C1464b[] c1464bArrM3134b2 = m3134b(c1424j.f5570a.f5410a);
                int length2 = c1464bArrM3134b2.length;
                while (i < length2) {
                    C1464b c1464b2 = c1464bArrM3134b2[i];
                    Object objM3131a2 = m3131a(c1424j, c1464b2);
                    if ((objM3131a2 instanceof C1464b) || objM3131a2.equals(c1464b2.f5648c)) {
                        return objM3131a2;
                    }
                    i++;
                    obj = objM3131a2;
                }
                return obj;
            }
            c1424j.getClass();
        }
        int iBinarySearch = Arrays.binarySearch(this.f5668d, c1424j);
        if (iBinarySearch == -1) {
            return this.f5669e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f5668d;
            if (iBinarySearch < objArr.length - 1) {
                int i4 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i4])) {
                    iBinarySearch = i4;
                }
            }
        }
        if ((iBinarySearch & 1) == 0) {
            C1424j[] c1424jArr = this.f5668d;
            C1424j c1424j3 = c1424jArr[iBinarySearch];
            C1424j c1424j4 = c1424jArr[iBinarySearch + 1];
            C1351a0[] c1351a0Arr = this.f5669e;
            int i8 = iBinarySearch / 2;
            C1351a0 c1351a0 = c1351a0Arr[i8];
            C1351a0 c1351a02 = c1351a0Arr[i8 + 1];
            if (c1351a02.f5419b > c1351a0.f5419b) {
                return new C1464b(c1424j3, c1351a0, c1351a02);
            }
            return new C1464b(c1424j4, c1351a0, c1351a02);
        }
        return this.f5669e[(iBinarySearch / 2) + 1];
    }

    /* renamed from: b */
    public final C1464b[] m3134b(int i) {
        LocalDate localDateM2883A;
        C1464b[] c1464bArr = f5664l;
        Integer numValueOf = Integer.valueOf(i);
        C1464b[] c1464bArr2 = (C1464b[]) ((ConcurrentHashMap) this.f5672h).get(numValueOf);
        if (c1464bArr2 != null) {
            return c1464bArr2;
        }
        long j = 1;
        int i4 = 0;
        int i8 = 1;
        if (this.f5671g != null) {
            if (i < 1800) {
                return c1464bArr;
            }
            C1424j c1424j = C1424j.f5568c;
            LocalDate localDateM2886b0 = LocalDate.m2886b0(i - 1, 12, 31);
            EnumC1435a.HOUR_OF_DAY.m3094X(0);
            long jM2956v = new C1424j(localDateM2886b0, C1426l.f5577h[0]).m2956v(this.f5666b[0]);
            long j8 = 1000;
            int offset = this.f5671g.getOffset(jM2956v * 1000);
            long j9 = 31968000 + jM2956v;
            while (jM2956v < j9) {
                long j10 = jM2956v + 7776000;
                long j11 = j8;
                if (offset != this.f5671g.getOffset(j10 * j11)) {
                    while (j10 - jM2956v > j) {
                        long jFloorDiv = Math.floorDiv(j10 + jM2956v, 2L);
                        if (this.f5671g.getOffset(jFloorDiv * j11) == offset) {
                            jM2956v = jFloorDiv;
                        } else {
                            j10 = jFloorDiv;
                        }
                        j = 1;
                    }
                    if (this.f5671g.getOffset(jM2956v * j11) == offset) {
                        jM2956v = j10;
                    }
                    C1351a0 c1351a0M3133g = m3133g(offset);
                    int offset2 = this.f5671g.getOffset(jM2956v * j11);
                    C1351a0 c1351a0M3133g2 = m3133g(offset2);
                    if (m3132c(jM2956v, c1351a0M3133g2) == i) {
                        c1464bArr = (C1464b[]) Arrays.copyOf(c1464bArr, c1464bArr.length + 1);
                        c1464bArr[c1464bArr.length - 1] = new C1464b(jM2956v, c1351a0M3133g, c1351a0M3133g2);
                    }
                    offset = offset2;
                } else {
                    jM2956v = j10;
                }
                j8 = j11;
                j = 1;
            }
            if (1916 <= i && i < 2100) {
                ((ConcurrentHashMap) this.f5672h).putIfAbsent(numValueOf, c1464bArr);
            }
            return c1464bArr;
        }
        C1467e[] c1467eArr = this.f5670f;
        C1464b[] c1464bArr3 = new C1464b[c1467eArr.length];
        int i9 = 0;
        while (i9 < c1467eArr.length) {
            C1467e c1467e = c1467eArr[i9];
            byte b7 = c1467e.f5653b;
            if (b7 < 0) {
                EnumC1428n enumC1428n = c1467e.f5652a;
                long j12 = i;
                C1384s.f5471c.getClass();
                int iM3082A = enumC1428n.m3082A(C1384s.m2993X(j12)) + 1 + c1467e.f5653b;
                LocalDate localDate = LocalDate.f5408d;
                EnumC1435a.YEAR.m3094X(j12);
                EnumC1435a.DAY_OF_MONTH.m3094X(iM3082A);
                localDateM2883A = LocalDate.m2883A(i, enumC1428n.getValue(), iM3082A);
                EnumC1394e enumC1394e = c1467e.f5654c;
                if (enumC1394e != null) {
                    localDateM2883A = localDateM2883A.mo2879g(new C1450p(enumC1394e.getValue(), i8));
                }
            } else {
                EnumC1428n enumC1428n2 = c1467e.f5652a;
                LocalDate localDate2 = LocalDate.f5408d;
                EnumC1435a.YEAR.m3094X(i);
                EnumC1435a.DAY_OF_MONTH.m3094X(b7);
                localDateM2883A = LocalDate.m2883A(i, enumC1428n2.getValue(), b7);
                EnumC1394e enumC1394e2 = c1467e.f5654c;
                if (enumC1394e2 != null) {
                    localDateM2883A = localDateM2883A.mo2879g(new C1450p(enumC1394e2.getValue(), i4));
                }
            }
            if (c1467e.f5656e) {
                localDateM2883A = localDateM2883A.m2903f0(1L);
            }
            C1424j c1424jM3055I = C1424j.m3055I(localDateM2883A, c1467e.f5655d);
            EnumC1466d enumC1466d = c1467e.f5657f;
            C1351a0 c1351a0 = c1467e.f5658g;
            C1351a0 c1351a02 = c1467e.f5659h;
            int i10 = AbstractC1465c.f5650a[enumC1466d.ordinal()];
            if (i10 == 1) {
                c1424jM3055I = c1424jM3055I.m3059X(c1351a02.f5419b - C1351a0.f5416f.f5419b);
            } else if (i10 == 2) {
                c1424jM3055I = c1424jM3055I.m3059X(c1351a02.f5419b - c1351a0.f5419b);
            }
            c1464bArr3[i9] = new C1464b(c1424jM3055I, c1467e.f5659h, c1467e.f5660i);
            i9++;
            i4 = 0;
        }
        if (i < 2100) {
            ((ConcurrentHashMap) this.f5672h).putIfAbsent(numValueOf, c1464bArr3);
        }
        return c1464bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1468f) {
            C1468f c1468f = (C1468f) obj;
            if (Objects.equals(this.f5671g, c1468f.f5671g) && Arrays.equals(this.f5665a, c1468f.f5665a) && Arrays.equals(this.f5666b, c1468f.f5666b) && Arrays.equals(this.f5667c, c1468f.f5667c) && Arrays.equals(this.f5669e, c1468f.f5669e) && Arrays.equals(this.f5670f, c1468f.f5670f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f5671g) ^ Arrays.hashCode(this.f5665a)) ^ Arrays.hashCode(this.f5666b)) ^ Arrays.hashCode(this.f5667c)) ^ Arrays.hashCode(this.f5669e)) ^ Arrays.hashCode(this.f5670f);
    }

    public final String toString() {
        TimeZone timeZone = this.f5671g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f5666b[r0.length - 1] + "]";
    }
}
