package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.l */
/* loaded from: classes.dex */
public abstract class AbstractC2146l {
    public static boolean matchesSocketFactory(InterfaceC2147m interfaceC2147m, SSLSocketFactory sSLSocketFactory) {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        return false;
    }

    public static X509TrustManager trustManager(InterfaceC2147m interfaceC2147m, SSLSocketFactory sSLSocketFactory) {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        return null;
    }
}
