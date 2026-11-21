package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.AbstractC2078h0;
import okhttp3.C2072e0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2162k0;
import okhttp3.C2181z;
import okhttp3.InterfaceC2064a0;
import okhttp3.InterfaceC2068c0;
import okhttp3.internal.connection.C2093c;
import okhttp3.internal.connection.C2095e;
import okhttp3.internal.connection.C2096f;
import okhttp3.internal.connection.C2100j;
import okhttp3.internal.http2.C2117a;
import p111m6.AbstractC1913h;
import p111m6.C1921p;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.l */
/* loaded from: classes.dex */
public final class C2113l implements InterfaceC2068c0 {
    public static final a Companion = new a(null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final C2072e0 client;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http.l$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private a() {
        }
    }

    public C2113l(C2072e0 c2072e0) {
        AbstractC2980h.m5136e("client", c2072e0);
        this.client = c2072e0;
    }

    private final C2076g0 buildRedirectRequest(C2080i0 c2080i0, String str) {
        String strHeader$default;
        C2181z c2181zResolve;
        if (!this.client.followRedirects() || (strHeader$default = C2080i0.header$default(c2080i0, "Location", null, 2, null)) == null || (c2181zResolve = c2080i0.request().url().resolve(strHeader$default)) == null) {
            return null;
        }
        if (!AbstractC2980h.m5132a(c2181zResolve.scheme(), c2080i0.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        C2076g0.a aVarNewBuilder = c2080i0.request().newBuilder();
        if (C2109h.permitsRequestBody(str)) {
            int iCode = c2080i0.code();
            C2109h c2109h = C2109h.INSTANCE;
            boolean z7 = c2109h.redirectsWithBody(str) || iCode == 308 || iCode == 307;
            if (!c2109h.redirectsToGet(str) || iCode == 308 || iCode == 307) {
                aVarNewBuilder.method(str, z7 ? c2080i0.request().body() : null);
            } else {
                aVarNewBuilder.method("GET", null);
            }
            if (!z7) {
                aVarNewBuilder.removeHeader("Transfer-Encoding");
                aVarNewBuilder.removeHeader("Content-Length");
                aVarNewBuilder.removeHeader("Content-Type");
            }
        }
        if (!AbstractC2278c.canReuseConnectionFor(c2080i0.request().url(), c2181zResolve)) {
            aVarNewBuilder.removeHeader("Authorization");
        }
        return aVarNewBuilder.url(c2181zResolve).build();
    }

    private final C2076g0 followUpRequest(C2080i0 c2080i0, C2093c c2093c) throws ProtocolException {
        C2096f connection$okhttp;
        C2162k0 c2162k0Route = (c2093c == null || (connection$okhttp = c2093c.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int iCode = c2080i0.code();
        String strMethod = c2080i0.request().method();
        if (iCode != 307 && iCode != 308) {
            if (iCode == 401) {
                return this.client.authenticator().authenticate(c2162k0Route, c2080i0);
            }
            if (iCode == 421) {
                AbstractC2078h0 abstractC2078h0Body = c2080i0.request().body();
                if ((abstractC2078h0Body != null && abstractC2078h0Body.isOneShot()) || c2093c == null || !c2093c.isCoalescedConnection$okhttp()) {
                    return null;
                }
                c2093c.getConnection$okhttp().noCoalescedConnections$okhttp();
                return c2080i0.request();
            }
            if (iCode == 503) {
                C2080i0 c2080i0PriorResponse = c2080i0.priorResponse();
                if ((c2080i0PriorResponse == null || c2080i0PriorResponse.code() != 503) && retryAfter(c2080i0, Integer.MAX_VALUE) == 0) {
                    return c2080i0.request();
                }
                return null;
            }
            if (iCode == 407) {
                AbstractC2980h.m5133b(c2162k0Route);
                if (c2162k0Route.proxy().type() == Proxy.Type.HTTP) {
                    return this.client.proxyAuthenticator().authenticate(c2162k0Route, c2080i0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iCode == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                AbstractC2078h0 abstractC2078h0Body2 = c2080i0.request().body();
                if (abstractC2078h0Body2 != null && abstractC2078h0Body2.isOneShot()) {
                    return null;
                }
                C2080i0 c2080i0PriorResponse2 = c2080i0.priorResponse();
                if ((c2080i0PriorResponse2 == null || c2080i0PriorResponse2.code() != 408) && retryAfter(c2080i0, 0) <= 0) {
                    return c2080i0.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(c2080i0, strMethod);
    }

    private final boolean isRecoverable(IOException iOException, boolean z7) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z7 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException iOException, C2095e c2095e, C2076g0 c2076g0, boolean z7) {
        if (this.client.retryOnConnectionFailure()) {
            return !(z7 && requestIsOneShot(iOException, c2076g0)) && isRecoverable(iOException, z7) && c2095e.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, C2076g0 c2076g0) {
        AbstractC2078h0 abstractC2078h0Body = c2076g0.body();
        return (abstractC2078h0Body != null && abstractC2078h0Body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int retryAfter(C2080i0 c2080i0, int i) throws NumberFormatException {
        String strHeader$default = C2080i0.header$default(c2080i0, "Retry-After", null, 2, null);
        if (strHeader$default == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC2980h.m5135d("compile(...)", patternCompile);
        if (!patternCompile.matcher(strHeader$default).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        AbstractC2980h.m5135d("valueOf(header)", numValueOf);
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0 = r1.getInterceptorScopedExchange$okhttp();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r0.isDuplex$okhttp() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r0 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        p147q7.AbstractC2278c.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r0 = r0.newBuilder().priorResponse(r7.newBuilder().body(null).build()).build();
     */
    @Override // okhttp3.InterfaceC2068c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) {
        C2076g0 c2076g0FollowUpRequest;
        AbstractC2980h.m5136e("chain", interfaceC2064a0);
        C2110i c2110i = (C2110i) interfaceC2064a0;
        C2076g0 request$okhttp = c2110i.getRequest$okhttp();
        C2095e call$okhttp = c2110i.getCall$okhttp();
        List listM3744I0 = C1921p.f7187j;
        int i = 0;
        C2080i0 c2080i0 = null;
        while (true) {
            boolean z7 = true;
            while (true) {
                call$okhttp.enterNetworkInterceptorExchange(request$okhttp, z7);
                try {
                    if (call$okhttp.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        try {
                            C2080i0 c2080i0Proceed = c2110i.proceed(request$okhttp);
                            break;
                        } catch (IOException e) {
                            if (!recover(e, call$okhttp, request$okhttp, !(e instanceof C2117a))) {
                                throw AbstractC2278c.withSuppressed(e, listM3744I0);
                            }
                            listM3744I0 = AbstractC1913h.m3744I0(listM3744I0, e);
                        }
                    } catch (C2100j e8) {
                        if (!recover(e8.getLastConnectException(), call$okhttp, request$okhttp, false)) {
                            throw AbstractC2278c.withSuppressed(e8.getFirstConnectException(), listM3744I0);
                        }
                        listM3744I0 = AbstractC1913h.m3744I0(listM3744I0, e8.getFirstConnectException());
                    }
                    call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                    z7 = false;
                } catch (Throwable th) {
                    call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                    throw th;
                }
            }
            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
            request$okhttp = c2076g0FollowUpRequest;
        }
    }
}
