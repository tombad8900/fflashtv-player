package okhttp3.internal.http;

import java.util.List;
import okhttp3.AbstractC2078h0;
import okhttp3.AbstractC2160j0;
import okhttp3.C2070d0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2169o;
import okhttp3.InterfaceC2064a0;
import okhttp3.InterfaceC2068c0;
import okhttp3.InterfaceC2172q;
import p111m6.AbstractC1914i;
import p147q7.AbstractC2278c;
import p189v7.AbstractC2557b;
import p189v7.C2589t;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.a */
/* loaded from: classes.dex */
public final class C2102a implements InterfaceC2068c0 {
    private final InterfaceC2172q cookieJar;

    public C2102a(InterfaceC2172q interfaceC2172q) {
        AbstractC2980h.m5136e("cookieJar", interfaceC2172q);
        this.cookieJar = interfaceC2172q;
    }

    private final String cookieHeader(List<C2169o> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC1914i.m3755v0();
                throw null;
            }
            C2169o c2169o = (C2169o) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(c2169o.name());
            sb.append('=');
            sb.append(c2169o.value());
            i = i4;
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    @Override // okhttp3.InterfaceC2068c0
    public C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) {
        AbstractC2160j0 abstractC2160j0Body;
        AbstractC2980h.m5136e("chain", interfaceC2064a0);
        C2076g0 c2076g0Request = interfaceC2064a0.request();
        C2076g0.a aVarNewBuilder = c2076g0Request.newBuilder();
        AbstractC2078h0 abstractC2078h0Body = c2076g0Request.body();
        if (abstractC2078h0Body != null) {
            C2070d0 c2070d0ContentType = abstractC2078h0Body.contentType();
            if (c2070d0ContentType != null) {
                aVarNewBuilder.header("Content-Type", c2070d0ContentType.toString());
            }
            long jContentLength = abstractC2078h0Body.contentLength();
            if (jContentLength != -1) {
                aVarNewBuilder.header("Content-Length", String.valueOf(jContentLength));
                aVarNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                aVarNewBuilder.header("Transfer-Encoding", "chunked");
                aVarNewBuilder.removeHeader("Content-Length");
            }
        }
        boolean z7 = true;
        if (c2076g0Request.header("Host") == null) {
            aVarNewBuilder.header("Host", AbstractC2278c.toHostHeader$default(c2076g0Request.url(), false, 1, null));
        }
        if (c2076g0Request.header("Connection") == null) {
            aVarNewBuilder.header("Connection", "Keep-Alive");
        }
        if (c2076g0Request.header("Accept-Encoding") == null && c2076g0Request.header("Range") == null) {
            aVarNewBuilder.header("Accept-Encoding", "gzip");
        } else {
            z7 = false;
        }
        List<C2169o> listLoadForRequest = this.cookieJar.loadForRequest(c2076g0Request.url());
        if (!listLoadForRequest.isEmpty()) {
            aVarNewBuilder.header("Cookie", cookieHeader(listLoadForRequest));
        }
        if (c2076g0Request.header("User-Agent") == null) {
            aVarNewBuilder.header("User-Agent", AbstractC2278c.userAgent);
        }
        C2080i0 c2080i0Proceed = interfaceC2064a0.proceed(aVarNewBuilder.build());
        AbstractC2108g.receiveHeaders(this.cookieJar, c2076g0Request.url(), c2080i0Proceed.headers());
        C2080i0.a aVarRequest = c2080i0Proceed.newBuilder().request(c2076g0Request);
        if (z7 && "gzip".equalsIgnoreCase(C2080i0.header$default(c2080i0Proceed, "Content-Encoding", null, 2, null)) && AbstractC2108g.promisesBody(c2080i0Proceed) && (abstractC2160j0Body = c2080i0Proceed.body()) != null) {
            C2589t c2589t = new C2589t(abstractC2160j0Body.source());
            aVarRequest.headers(c2080i0Proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            aVarRequest.body(new C2111j(C2080i0.header$default(c2080i0Proceed, "Content-Type", null, 2, null), -1L, AbstractC2557b.m4578c(c2589t)));
        }
        return aVarRequest.build();
    }
}
