package okhttp3.internal.http;

import java.net.Proxy;
import okhttp3.C2076g0;
import okhttp3.C2181z;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.k */
/* loaded from: classes.dex */
public final class C2112k {
    public static final C2112k INSTANCE = new C2112k();

    private C2112k() {
    }

    private final boolean includeAuthorityInRequestLine(C2076g0 c2076g0, Proxy.Type type) {
        return !c2076g0.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String get(C2076g0 c2076g0, Proxy.Type type) {
        AbstractC2980h.m5136e("request", c2076g0);
        AbstractC2980h.m5136e("proxyType", type);
        StringBuilder sb = new StringBuilder();
        sb.append(c2076g0.method());
        sb.append(' ');
        C2112k c2112k = INSTANCE;
        if (c2112k.includeAuthorityInRequestLine(c2076g0, type)) {
            sb.append(c2076g0.url());
        } else {
            sb.append(c2112k.requestPath(c2076g0.url()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final String requestPath(C2181z c2181z) {
        AbstractC2980h.m5136e("url", c2181z);
        String strEncodedPath = c2181z.encodedPath();
        String strEncodedQuery = c2181z.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + strEncodedQuery;
    }
}
