package okhttp3.internal.http;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.h */
/* loaded from: classes.dex */
public final class C2109h {
    public static final C2109h INSTANCE = new C2109h();

    private C2109h() {
    }

    public static final boolean permitsRequestBody(String str) {
        AbstractC2980h.m5136e("method", str);
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        AbstractC2980h.m5136e("method", str);
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public final boolean invalidatesCache(String str) {
        AbstractC2980h.m5136e("method", str);
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public final boolean redirectsToGet(String str) {
        AbstractC2980h.m5136e("method", str);
        return !str.equals("PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        AbstractC2980h.m5136e("method", str);
        return str.equals("PROPFIND");
    }
}
