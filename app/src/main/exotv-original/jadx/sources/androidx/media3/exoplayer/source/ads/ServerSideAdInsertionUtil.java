package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0183b;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Arrays;
import java.util.Objects;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0187c addAdGroupToAdPlaybackState(C0187c c0187c, long j, long j8, long... jArr) {
        int i;
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j, -1, c0187c);
        int i4 = c0187c.f1054e;
        while (i4 < c0187c.f1051b && c0187c.m609a(i4).f1021a != Long.MIN_VALUE && c0187c.m609a(i4).f1021a <= mediaPeriodPositionUsForContent) {
            i4++;
        }
        int i8 = i4 - c0187c.f1054e;
        C0183b c0183b = new C0183b(mediaPeriodPositionUsForContent);
        C0183b[] c0183bArr = c0187c.f1055f;
        int i9 = AbstractC1118i0.f4750a;
        Object[] objArrCopyOf = Arrays.copyOf(c0183bArr, c0183bArr.length + 1);
        objArrCopyOf[c0183bArr.length] = c0183b;
        C0183b[] c0183bArr2 = (C0183b[]) objArrCopyOf;
        System.arraycopy(c0183bArr2, i8, c0183bArr2, i8 + 1, c0183bArr.length - i8);
        c0183bArr2[i8] = c0183b;
        Object obj = c0187c.f1050a;
        long j9 = c0187c.f1052c;
        long j10 = c0187c.f1053d;
        int i10 = c0187c.f1054e;
        C0187c c0187c2 = new C0187c(obj, c0183bArr2, j9, j10, i10);
        int i11 = i4 - i10;
        if (!c0183bArr2[i11].f1029i) {
            C0183b[] c0183bArr3 = (C0183b[]) AbstractC1118i0.m2430U(c0183bArr2.length, c0183bArr2);
            C0183b c0183b2 = c0183bArr3[i11];
            c0183bArr3[i11] = new C0183b(c0183b2.f1021a, c0183b2.f1022b, c0183b2.f1023c, c0183b2.f1026f, c0183b2.f1025e, c0183b2.f1027g, c0183b2.f1028h, true);
            c0187c2 = new C0187c(obj, c0183bArr3, j9, j10, i10);
        }
        int length = jArr.length;
        int i12 = 0;
        AbstractC1101a.m2353d(length > 0);
        int i13 = i4 - c0187c2.f1054e;
        C0183b[] c0183bArr4 = c0187c2.f1055f;
        if (c0183bArr4[i13].f1022b != length) {
            C0183b[] c0183bArr5 = (C0183b[]) AbstractC1118i0.m2430U(c0183bArr4.length, c0183bArr4);
            c0183bArr5[i13] = c0183bArr4[i13].m606c(length);
            c0187c2 = new C0187c(c0187c2.f1050a, c0183bArr5, c0187c2.f1052c, c0187c2.f1053d, c0187c2.f1054e);
        }
        int i14 = i4 - c0187c2.f1054e;
        C0183b[] c0183bArr6 = c0187c2.f1055f;
        C0183b[] c0183bArr7 = (C0183b[]) AbstractC1118i0.m2430U(c0183bArr6.length, c0183bArr6);
        c0183bArr7[i14] = c0183bArr7[i14].m607d(jArr);
        Object obj2 = c0187c2.f1050a;
        long j11 = c0187c2.f1052c;
        long j12 = c0187c2.f1053d;
        int i15 = c0187c2.f1054e;
        C0187c c0187c3 = new C0187c(obj2, c0183bArr7, j11, j12, i15);
        int i16 = i4 - i15;
        if (c0183bArr7[i16].f1028h != j8) {
            C0183b[] c0183bArr8 = (C0183b[]) AbstractC1118i0.m2430U(c0183bArr7.length, c0183bArr7);
            C0183b c0183b3 = c0183bArr8[i16];
            c0183bArr8[i16] = new C0183b(c0183b3.f1021a, c0183b3.f1022b, c0183b3.f1023c, c0183b3.f1026f, c0183b3.f1025e, c0183b3.f1027g, j8, c0183b3.f1029i);
            c0187c3 = new C0187c(obj2, c0183bArr8, j11, j12, i15);
        }
        int i17 = 0;
        C0187c c0187c4 = c0187c3;
        while (i17 < jArr.length && jArr[i17] == 0) {
            int i18 = i17 + 1;
            int i19 = i4 - c0187c4.f1054e;
            C0183b[] c0183bArr9 = c0187c4.f1055f;
            C0183b[] c0183bArr10 = (C0183b[]) AbstractC1118i0.m2430U(c0183bArr9.length, c0183bArr9);
            C0183b c0183b4 = c0183bArr10[i19];
            int i20 = c0183b4.f1022b;
            AbstractC1101a.m2353d((i20 == -1 || i17 < i20) ? 1 : i12);
            int[] iArr = c0183b4.f1026f;
            int length2 = iArr.length;
            int iMax = Math.max(i18, length2);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length2, iMax, i12);
            int i21 = iArrCopyOf[i17];
            AbstractC1101a.m2353d((i21 == 0 || i21 == 1 || i21 == 2) ? 1 : i12);
            long[] jArrCopyOf = c0183b4.f1027g;
            if (jArrCopyOf.length == iArrCopyOf.length) {
                i = i18;
            } else {
                int length3 = iArrCopyOf.length;
                int length4 = jArrCopyOf.length;
                int iMax2 = Math.max(length3, length4);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, iMax2);
                i = i18;
                Arrays.fill(jArrCopyOf, length4, iMax2, -9223372036854775807L);
            }
            long[] jArr2 = jArrCopyOf;
            C0226o0[] c0226o0Arr = c0183b4.f1025e;
            if (c0226o0Arr.length != iArrCopyOf.length) {
                c0226o0Arr = (C0226o0[]) Arrays.copyOf(c0226o0Arr, iArrCopyOf.length);
            }
            C0226o0[] c0226o0Arr2 = c0226o0Arr;
            iArrCopyOf[i17] = 2;
            c0183bArr10[i19] = new C0183b(c0183b4.f1021a, c0183b4.f1022b, c0183b4.f1023c, iArrCopyOf, c0226o0Arr2, jArr2, c0183b4.f1028h, c0183b4.f1029i);
            i17 = i;
            c0187c4 = new C0187c(c0187c4.f1050a, c0183bArr10, c0187c4.f1052c, c0187c4.f1053d, c0187c4.f1054e);
            i12 = 0;
        }
        long j13 = 0;
        for (long j14 : jArr) {
            j13 += j14;
        }
        return correctFollowingAdGroupTimes(c0187c4, i4, j13, j8);
    }

    private static C0187c correctFollowingAdGroupTimes(C0187c c0187c, int i, long j, long j8) {
        long j9;
        long j10 = (-j) + j8;
        int i4 = i + 1;
        C0187c c0187c2 = c0187c;
        while (i4 < c0187c2.f1051b) {
            long j11 = c0187c2.m609a(i4).f1021a;
            if (j11 != Long.MIN_VALUE) {
                long j12 = j11 + j10;
                int i8 = i4 - c0187c2.f1054e;
                C0183b[] c0183bArr = c0187c2.f1055f;
                C0183b[] c0183bArr2 = (C0183b[]) AbstractC1118i0.m2430U(c0183bArr.length, c0183bArr);
                C0183b c0183b = c0183bArr[i8];
                j9 = j10;
                c0183bArr2[i8] = new C0183b(j12, c0183b.f1022b, c0183b.f1023c, c0183b.f1026f, c0183b.f1025e, c0183b.f1027g, c0183b.f1028h, c0183b.f1029i);
                c0187c2 = new C0187c(c0187c2.f1050a, c0183bArr2, c0187c2.f1052c, c0187c2.f1053d, c0187c2.f1054e);
            } else {
                j9 = j10;
            }
            i4++;
            j10 = j9;
        }
        return c0187c2;
    }

    public static int getAdCountInGroup(C0187c c0187c, int i) {
        int i4 = c0187c.m609a(i).f1022b;
        if (i4 == -1) {
            return 0;
        }
        return i4;
    }

    public static long getMediaPeriodPositionUs(long j, MediaSource.MediaPeriodId mediaPeriodId, C0187c c0187c) {
        return mediaPeriodId.isAd() ? getMediaPeriodPositionUsForAd(j, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, c0187c) : getMediaPeriodPositionUsForContent(j, mediaPeriodId.nextAdGroupIndex, c0187c);
    }

    public static long getMediaPeriodPositionUsForAd(long j, int i, int i4, C0187c c0187c) {
        int i8;
        C0183b c0183bM609a = c0187c.m609a(i);
        long j8 = j - c0183bM609a.f1021a;
        int i9 = c0187c.f1054e;
        while (true) {
            i8 = 0;
            if (i9 >= i) {
                break;
            }
            C0183b c0183bM609a2 = c0187c.m609a(i9);
            while (i8 < getAdCountInGroup(c0187c, i9)) {
                j8 -= c0183bM609a2.f1027g[i8];
                i8++;
            }
            j8 += c0183bM609a2.f1028h;
            i9++;
        }
        if (i4 < getAdCountInGroup(c0187c, i)) {
            while (i8 < i4) {
                j8 -= c0183bM609a.f1027g[i8];
                i8++;
            }
        }
        return j8;
    }

    public static long getMediaPeriodPositionUsForContent(long j, int i, C0187c c0187c) {
        if (i == -1) {
            i = c0187c.f1051b;
        }
        long j8 = 0;
        for (int i4 = c0187c.f1054e; i4 < i; i4++) {
            C0183b c0183bM609a = c0187c.m609a(i4);
            long j9 = c0183bM609a.f1021a;
            if (j9 == Long.MIN_VALUE || j9 > j - j8) {
                break;
            }
            for (int i8 = 0; i8 < getAdCountInGroup(c0187c, i4); i8++) {
                j8 += c0183bM609a.f1027g[i8];
            }
            long j10 = c0183bM609a.f1028h;
            j8 -= j10;
            long j11 = c0183bM609a.f1021a;
            long j12 = j - j8;
            if (j10 + j11 > j12) {
                return Math.max(j11, j12);
            }
        }
        return j - j8;
    }

    public static long getStreamPositionUs(InterfaceC0193d1 interfaceC0193d1, C0187c c0187c) {
        AbstractC0230p1 currentTimeline = interfaceC0193d1.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        C0221m1 period = currentTimeline.getPeriod(interfaceC0193d1.getCurrentPeriodIndex(), new C0221m1());
        Object obj = period.f1210g.f1050a;
        Object obj2 = c0187c.f1050a;
        int i = AbstractC1118i0.f4750a;
        if (!Objects.equals(obj, obj2)) {
            return -9223372036854775807L;
        }
        if (!interfaceC0193d1.isPlayingAd()) {
            return getStreamPositionUsForContent(AbstractC1118i0.m2428S(interfaceC0193d1.getCurrentPosition()) - period.f1208e, -1, c0187c);
        }
        return getStreamPositionUsForAd(AbstractC1118i0.m2428S(interfaceC0193d1.getCurrentPosition()), interfaceC0193d1.getCurrentAdGroupIndex(), interfaceC0193d1.getCurrentAdIndexInAdGroup(), c0187c);
    }

    public static long getStreamPositionUsForAd(long j, int i, int i4, C0187c c0187c) {
        int i8;
        C0183b c0183bM609a = c0187c.m609a(i);
        long j8 = j + c0183bM609a.f1021a;
        int i9 = c0187c.f1054e;
        while (true) {
            i8 = 0;
            if (i9 >= i) {
                break;
            }
            C0183b c0183bM609a2 = c0187c.m609a(i9);
            while (i8 < getAdCountInGroup(c0187c, i9)) {
                j8 += c0183bM609a2.f1027g[i8];
                i8++;
            }
            j8 -= c0183bM609a2.f1028h;
            i9++;
        }
        if (i4 < getAdCountInGroup(c0187c, i)) {
            while (i8 < i4) {
                j8 += c0183bM609a.f1027g[i8];
                i8++;
            }
        }
        return j8;
    }

    public static long getStreamPositionUsForContent(long j, int i, C0187c c0187c) {
        if (i == -1) {
            i = c0187c.f1051b;
        }
        long j8 = 0;
        for (int i4 = c0187c.f1054e; i4 < i; i4++) {
            C0183b c0183bM609a = c0187c.m609a(i4);
            long j9 = c0183bM609a.f1021a;
            if (j9 == Long.MIN_VALUE || j9 > j) {
                break;
            }
            long j10 = j9 + j8;
            for (int i8 = 0; i8 < getAdCountInGroup(c0187c, i4); i8++) {
                j8 += c0183bM609a.f1027g[i8];
            }
            long j11 = c0183bM609a.f1028h;
            j8 -= j11;
            if (c0183bM609a.f1021a + j11 > j) {
                return Math.max(j10, j + j8);
            }
        }
        return j + j8;
    }

    public static long getStreamPositionUs(long j, MediaSource.MediaPeriodId mediaPeriodId, C0187c c0187c) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, c0187c);
        }
        return getStreamPositionUsForContent(j, mediaPeriodId.nextAdGroupIndex, c0187c);
    }
}
