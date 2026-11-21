package p127o7;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.concurrent.TimeUnit;
import p112m7.AbstractC1925a;
import p112m7.AbstractC1944t;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.k */
/* loaded from: classes.dex */
public abstract class AbstractC2060k {

    /* renamed from: a */
    public static final String f7606a;

    /* renamed from: b */
    public static final long f7607b;

    /* renamed from: c */
    public static final int f7608c;

    /* renamed from: d */
    public static final int f7609d;

    /* renamed from: e */
    public static final long f7610e;

    /* renamed from: f */
    public static final C2056g f7611f;

    static {
        String property;
        int i = AbstractC1944t.f7234a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7606a = property;
        f7607b = AbstractC1925a.m3771g("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1L, Long.MAX_VALUE);
        int i4 = AbstractC1944t.f7234a;
        if (i4 < 2) {
            i4 = 2;
        }
        f7608c = AbstractC1925a.m3772h("kotlinx.coroutines.scheduler.core.pool.size", i4, 8);
        f7609d = AbstractC1925a.m3772h("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7610e = TimeUnit.SECONDS.toNanos(AbstractC1925a.m3771g("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7611f = C2056g.f7601a;
    }
}
