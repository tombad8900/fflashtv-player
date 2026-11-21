package p016b5;

import java.util.concurrent.TimeUnit;
import okhttp3.C2072e0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.m */
/* loaded from: classes.dex */
public abstract class AbstractC0590m {

    /* renamed from: a */
    public static final C2072e0 f2359a;

    static {
        C2072e0.a aVar = new C2072e0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2359a = aVar.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).followRedirects(true).retryOnConnectionFailure(true).build();
    }
}
