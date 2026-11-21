package p178u4;

import android.os.SystemClock;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.g */
/* loaded from: classes.dex */
public abstract class AbstractC2472g {

    /* renamed from: a */
    public static final double f9057a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b */
    public static final /* synthetic */ int f9058b = 0;

    /* renamed from: a */
    public static double m4447a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f9057a;
    }
}
