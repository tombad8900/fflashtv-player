package p143q3;

import android.graphics.Bitmap;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.C2071e;
import okhttp3.C2076g0;
import okhttp3.C2180y;
import p069h7.AbstractC1213o;
import p069h7.AbstractC1214p;
import p185v3.AbstractC2536f;
import p185v3.AbstractC2544n;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q3.d */
/* loaded from: classes.dex */
public final class C2262d {

    /* renamed from: a */
    public final C2076g0 f7878a;

    /* renamed from: b */
    public final C2260b f7879b;

    /* renamed from: c */
    public final Date f7880c;

    /* renamed from: d */
    public final String f7881d;

    /* renamed from: e */
    public final Date f7882e;

    /* renamed from: f */
    public final String f7883f;

    /* renamed from: g */
    public final Date f7884g;

    /* renamed from: h */
    public final long f7885h;

    /* renamed from: i */
    public final long f7886i;

    /* renamed from: j */
    public final String f7887j;

    /* renamed from: k */
    public final int f7888k;

    public C2262d(C2076g0 c2076g0, C2260b c2260b) {
        int i;
        this.f7878a = c2076g0;
        this.f7879b = c2260b;
        this.f7888k = -1;
        if (c2260b != null) {
            this.f7885h = c2260b.f7874c;
            this.f7886i = c2260b.f7875d;
            C2180y c2180y = c2260b.f7877f;
            int size = c2180y.size();
            for (int i4 = 0; i4 < size; i4++) {
                String strName = c2180y.name(i4);
                if (AbstractC1214p.m2661n0(strName, "Date")) {
                    this.f7880c = c2180y.getDate("Date");
                    this.f7881d = c2180y.value(i4);
                } else if (AbstractC1214p.m2661n0(strName, "Expires")) {
                    this.f7884g = c2180y.getDate("Expires");
                } else if (AbstractC1214p.m2661n0(strName, "Last-Modified")) {
                    this.f7882e = c2180y.getDate("Last-Modified");
                    this.f7883f = c2180y.value(i4);
                } else if (AbstractC1214p.m2661n0(strName, "ETag")) {
                    this.f7887j = c2180y.value(i4);
                } else if (AbstractC1214p.m2661n0(strName, "Age")) {
                    String strValue = c2180y.value(i4);
                    Bitmap.Config[] configArr = AbstractC2536f.f9216a;
                    Long lM2659l0 = AbstractC1213o.m2659l0(strValue);
                    if (lM2659l0 != null) {
                        long jLongValue = lM2659l0.longValue();
                        i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i = -1;
                    }
                    this.f7888k = i;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l6.b] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2263e m4051a() {
        long jMax;
        long millis;
        long time;
        C2071e c2071e;
        C2076g0 c2076g0 = this.f7878a;
        C2260b c2260b = this.f7879b;
        if (c2260b == null) {
            return new C2263e(c2076g0, null);
        }
        ?? r42 = c2260b.f7872a;
        if (c2076g0.isHttps() && !c2260b.f7876e) {
            return new C2263e(c2076g0, null);
        }
        C2071e c2071e2 = (C2071e) r42.getValue();
        if (c2076g0.cacheControl().noStore() || ((C2071e) r42.getValue()).noStore() || AbstractC2980h.m5132a(c2260b.f7877f.get("Vary"), "*")) {
            return new C2263e(c2076g0, null);
        }
        C2071e c2071eCacheControl = c2076g0.cacheControl();
        if (!c2071eCacheControl.noCache()) {
            String str = "If-Modified-Since";
            if (c2076g0.header("If-Modified-Since") == null && c2076g0.header("If-None-Match") == null) {
                long time2 = this.f7886i;
                Date date = this.f7880c;
                if (date != null) {
                    jMax = Math.max(0L, time2 - date.getTime());
                    millis = 0;
                } else {
                    jMax = 0;
                    millis = 0;
                }
                int i = this.f7888k;
                if (i != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                }
                long time3 = this.f7885h;
                long jLongValue = jMax + (time2 - time3) + (((Number) AbstractC2544n.f9239a.invoke()).longValue() - time2);
                int iMaxAgeSeconds = ((C2071e) r42.getValue()).maxAgeSeconds();
                Date date2 = this.f7882e;
                if (iMaxAgeSeconds != -1) {
                    time = TimeUnit.SECONDS.toMillis(r2.maxAgeSeconds());
                } else {
                    Date date3 = this.f7884g;
                    if (date3 != null) {
                        if (date != null) {
                            time2 = date.getTime();
                        }
                        time = date3.getTime() - time2;
                        if (time <= millis) {
                            time = millis;
                        }
                    } else if (date2 != null && c2076g0.url().query() == null) {
                        if (date != null) {
                            time3 = date.getTime();
                        }
                        long time4 = time3 - date2.getTime();
                        if (time4 > millis) {
                            time = time4 / 10;
                        }
                    }
                }
                if (c2071eCacheControl.maxAgeSeconds() != -1) {
                    time = Math.min(time, TimeUnit.SECONDS.toMillis(c2071eCacheControl.maxAgeSeconds()));
                }
                long millis2 = c2071eCacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(c2071eCacheControl.minFreshSeconds()) : millis;
                if (c2071e2.mustRevalidate() || c2071eCacheControl.maxStaleSeconds() == -1) {
                    c2071e = c2071e2;
                } else {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int iMaxStaleSeconds = c2071eCacheControl.maxStaleSeconds();
                    c2071e = c2071e2;
                    millis = timeUnit.toMillis(iMaxStaleSeconds);
                }
                if (!c2071e.noCache() && jLongValue + millis2 < time + millis) {
                    return new C2263e(null, c2260b);
                }
                String str2 = this.f7887j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date2 != null) {
                    str2 = this.f7883f;
                    AbstractC2980h.m5133b(str2);
                } else {
                    if (date == null) {
                        return new C2263e(c2076g0, null);
                    }
                    str2 = this.f7881d;
                    AbstractC2980h.m5133b(str2);
                }
                return new C2263e(c2076g0.newBuilder().addHeader(str, str2).build(), c2260b);
            }
        }
        return new C2263e(c2076g0, null);
    }
}
