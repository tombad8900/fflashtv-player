package okhttp3.internal.http;

import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.AbstractC2078h0;
import okhttp3.AbstractC2160j0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.InterfaceC2064a0;
import okhttp3.InterfaceC2068c0;
import okhttp3.internal.connection.C2093c;
import okhttp3.internal.http2.C2117a;
import p147q7.AbstractC2278c;
import p189v7.AbstractC2557b;
import p189v7.C2562d0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.b */
/* loaded from: classes.dex */
public final class C2103b implements InterfaceC2068c0 {
    private final boolean forWebSocket;

    public C2103b(boolean z7) {
        this.forWebSocket = z7;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.InterfaceC2068c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) throws Throwable {
        C2080i0.a responseHeaders;
        int iCode;
        C2080i0 c2080i0Build;
        AbstractC2160j0 abstractC2160j0Body;
        boolean z7;
        AbstractC2980h.m5136e("chain", interfaceC2064a0);
        C2110i c2110i = (C2110i) interfaceC2064a0;
        C2093c exchange$okhttp = c2110i.getExchange$okhttp();
        AbstractC2980h.m5133b(exchange$okhttp);
        C2076g0 request$okhttp = c2110i.getRequest$okhttp();
        AbstractC2078h0 abstractC2078h0Body = request$okhttp.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z8 = true;
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            if (!C2109h.permitsRequestBody(request$okhttp.method()) || abstractC2078h0Body == null) {
                exchange$okhttp.noRequestBody();
                responseHeaders = null;
            } else {
                if ("100-continue".equalsIgnoreCase(request$okhttp.header("Expect"))) {
                    exchange$okhttp.flushRequest();
                    responseHeaders = exchange$okhttp.readResponseHeaders(true);
                    try {
                        exchange$okhttp.responseHeadersStart();
                        z7 = false;
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof C2117a) {
                            throw e;
                        }
                        throw e;
                    }
                } else {
                    z7 = true;
                    responseHeaders = null;
                }
                try {
                    if (responseHeaders != null) {
                        exchange$okhttp.noRequestBody();
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange$okhttp.noNewExchangesOnConnection();
                        }
                    } else if (abstractC2078h0Body.isDuplex()) {
                        exchange$okhttp.flushRequest();
                        abstractC2078h0Body.writeTo(AbstractC2557b.m4577b(exchange$okhttp.createRequestBody(request$okhttp, true)));
                    } else {
                        C2562d0 c2562d0M4577b = AbstractC2557b.m4577b(exchange$okhttp.createRequestBody(request$okhttp, false));
                        abstractC2078h0Body.writeTo(c2562d0M4577b);
                        c2562d0M4577b.close();
                    }
                    z8 = z7;
                } catch (IOException e8) {
                    e = e8;
                    z8 = z7;
                    if ((e instanceof C2117a) || !exchange$okhttp.getHasFailure$okhttp()) {
                        throw e;
                    }
                    if (responseHeaders == null) {
                    }
                    C2080i0 c2080i0Build2 = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                    iCode = c2080i0Build2.code();
                    if (shouldIgnoreAndWaitForRealResponse(iCode)) {
                    }
                    exchange$okhttp.responseHeadersEnd(c2080i0Build2);
                    if (this.forWebSocket) {
                    }
                    if (!"close".equalsIgnoreCase(c2080i0Build.request().header("Connection"))) {
                        exchange$okhttp.noNewExchangesOnConnection();
                    }
                    if (iCode != 204) {
                        abstractC2160j0Body = c2080i0Build.body();
                        if ((abstractC2160j0Body == null ? abstractC2160j0Body.contentLength() : -1L) > 0) {
                        }
                    }
                    return c2080i0Build;
                }
            }
            if (abstractC2078h0Body == null || !abstractC2078h0Body.isDuplex()) {
                exchange$okhttp.finishRequest();
            }
            e = null;
        } catch (IOException e9) {
            e = e9;
            responseHeaders = null;
        }
        if (responseHeaders == null) {
            try {
                responseHeaders = exchange$okhttp.readResponseHeaders(false);
                AbstractC2980h.m5133b(responseHeaders);
                if (z8) {
                    exchange$okhttp.responseHeadersStart();
                    z8 = false;
                }
            } catch (IOException e10) {
                if (e == null) {
                    throw e10;
                }
                AbstractC0715d.m1557e(e, e10);
                throw e;
            }
        }
        C2080i0 c2080i0Build22 = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        iCode = c2080i0Build22.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            C2080i0.a responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
            AbstractC2980h.m5133b(responseHeaders2);
            if (z8) {
                exchange$okhttp.responseHeadersStart();
            }
            c2080i0Build22 = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = c2080i0Build22.code();
        }
        exchange$okhttp.responseHeadersEnd(c2080i0Build22);
        c2080i0Build = (this.forWebSocket || iCode != 101) ? c2080i0Build22.newBuilder().body(exchange$okhttp.openResponseBody(c2080i0Build22)).build() : c2080i0Build22.newBuilder().body(AbstractC2278c.EMPTY_RESPONSE).build();
        if (!"close".equalsIgnoreCase(c2080i0Build.request().header("Connection")) || "close".equalsIgnoreCase(C2080i0.header$default(c2080i0Build, "Connection", null, 2, null))) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (iCode != 204 || iCode == 205) {
            abstractC2160j0Body = c2080i0Build.body();
            if ((abstractC2160j0Body == null ? abstractC2160j0Body.contentLength() : -1L) > 0) {
                StringBuilder sb = new StringBuilder("HTTP ");
                sb.append(iCode);
                sb.append(" had non-zero Content-Length: ");
                AbstractC2160j0 abstractC2160j0Body2 = c2080i0Build.body();
                sb.append(abstractC2160j0Body2 != null ? Long.valueOf(abstractC2160j0Body2.contentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return c2080i0Build;
    }
}
