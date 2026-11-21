package okhttp3;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.a0 */
/* loaded from: classes.dex */
public interface InterfaceC2064a0 {
    InterfaceC2075g call();

    int connectTimeoutMillis();

    InterfaceC2163l connection();

    C2080i0 proceed(C2076g0 c2076g0);

    int readTimeoutMillis();

    C2076g0 request();

    InterfaceC2064a0 withConnectTimeout(int i, TimeUnit timeUnit);

    InterfaceC2064a0 withReadTimeout(int i, TimeUnit timeUnit);

    InterfaceC2064a0 withWriteTimeout(int i, TimeUnit timeUnit);

    int writeTimeoutMillis();
}
