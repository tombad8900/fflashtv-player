package p063h1;

import android.os.SystemClock;
import java.math.RoundingMode;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.d0 */
/* loaded from: classes.dex */
public final class C1108d0 {

    /* renamed from: a */
    public long f4727a;

    /* renamed from: b */
    public long f4728b;

    /* renamed from: c */
    public long f4729c;

    /* renamed from: d */
    public final ThreadLocal f4730d = new ThreadLocal();

    public C1108d0(long j) {
        m2401f(j);
    }

    /* renamed from: a */
    public final synchronized long m2396a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m2400e()) {
                long jLongValue = this.f4727a;
                if (jLongValue == 9223372036854775806L) {
                    Long l8 = (Long) this.f4730d.get();
                    l8.getClass();
                    jLongValue = l8.longValue();
                }
                this.f4728b = jLongValue - j;
                notifyAll();
            }
            this.f4729c = j;
            return j + this.f4728b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized long m2397b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f4729c;
            if (j8 != -9223372036854775807L) {
                int i = AbstractC1118i0.f4750a;
                long jM2437a0 = AbstractC1118i0.m2437a0(j8, 90000L, 1000000L, RoundingMode.DOWN);
                long j9 = (4294967296L + jM2437a0) / 8589934592L;
                long j10 = ((j9 - 1) * 8589934592L) + j;
                long j11 = (j9 * 8589934592L) + j;
                j = Math.abs(j10 - jM2437a0) < Math.abs(j11 - jM2437a0) ? j10 : j11;
            }
            long j12 = j;
            int i4 = AbstractC1118i0.f4750a;
            return m2396a(AbstractC1118i0.m2437a0(j12, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized long m2398c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f4729c;
            if (j8 != -9223372036854775807L) {
                int i = AbstractC1118i0.f4750a;
                long jM2437a0 = AbstractC1118i0.m2437a0(j8, 90000L, 1000000L, RoundingMode.DOWN);
                long j9 = jM2437a0 / 8589934592L;
                long j10 = (j9 * 8589934592L) + j;
                j = j10 >= jM2437a0 ? j10 : ((j9 + 1) * 8589934592L) + j;
            }
            long j11 = j;
            int i4 = AbstractC1118i0.f4750a;
            return m2396a(AbstractC1118i0.m2437a0(j11, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public final synchronized long m2399d() {
        long j;
        j = this.f4727a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: e */
    public final synchronized boolean m2400e() {
        return this.f4728b != -9223372036854775807L;
    }

    /* renamed from: f */
    public final synchronized void m2401f(long j) {
        this.f4727a = j;
        this.f4728b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f4729c = -9223372036854775807L;
    }

    /* renamed from: g */
    public final synchronized void m2402g(boolean z7, long j, long j8) {
        try {
            AbstractC1101a.m2359j(this.f4727a == 9223372036854775806L);
            if (m2400e()) {
                return;
            }
            if (z7) {
                this.f4730d.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j9 = j8;
                while (!m2400e()) {
                    if (j8 == 0) {
                        wait();
                    } else {
                        AbstractC1101a.m2359j(j9 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j9);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j8 && !m2400e()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j8 + " milliseconds");
                        }
                        j9 = j8 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
