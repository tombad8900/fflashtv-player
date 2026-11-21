package okhttp3.internal.http;

import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.internal.connection.C2096f;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.f */
/* loaded from: classes.dex */
public interface InterfaceC2107f {
    public static final C2106e Companion = C2106e.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    InterfaceC2572i0 createRequestBody(C2076g0 c2076g0, long j);

    void finishRequest();

    void flushRequest();

    C2096f getConnection();

    InterfaceC2576k0 openResponseBodySource(C2080i0 c2080i0);

    C2080i0.a readResponseHeaders(boolean z7);

    long reportedContentLength(C2080i0 c2080i0);

    C2180y trailers();

    void writeRequestHeaders(C2076g0 c2076g0);
}
