package com.exotv.net.model;

import java.util.Map;
import p002a1.AbstractC0008a1;
import p111m6.C1922q;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ResolvedStream {
    private final Map<String, String> headers;
    private final String name;
    private final String url;

    public ResolvedStream(String str, Map<String, String> map, String str2) {
        AbstractC2980h.m5136e("url", str);
        AbstractC2980h.m5136e("headers", map);
        this.url = str;
        this.headers = map;
        this.name = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolvedStream copy$default(ResolvedStream resolvedStream, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resolvedStream.url;
        }
        if ((i & 2) != 0) {
            map = resolvedStream.headers;
        }
        if ((i & 4) != 0) {
            str2 = resolvedStream.name;
        }
        return resolvedStream.copy(str, map, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final String component3() {
        return this.name;
    }

    public final ResolvedStream copy(String str, Map<String, String> map, String str2) {
        AbstractC2980h.m5136e("url", str);
        AbstractC2980h.m5136e("headers", map);
        return new ResolvedStream(str, map, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedStream)) {
            return false;
        }
        ResolvedStream resolvedStream = (ResolvedStream) obj;
        return AbstractC2980h.m5132a(this.url, resolvedStream.url) && AbstractC2980h.m5132a(this.headers, resolvedStream.headers) && AbstractC2980h.m5132a(this.name, resolvedStream.name);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = (this.headers.hashCode() + (this.url.hashCode() * 31)) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.url;
        Map<String, String> map = this.headers;
        String str2 = this.name;
        StringBuilder sb = new StringBuilder("ResolvedStream(url=");
        sb.append(str);
        sb.append(", headers=");
        sb.append(map);
        sb.append(", name=");
        return AbstractC0008a1.m18n(sb, str2, ")");
    }

    public /* synthetic */ ResolvedStream(String str, Map map, String str2, int i, AbstractC2977e abstractC2977e) {
        this(str, (i & 2) != 0 ? C1922q.f7188j : map, (i & 4) != 0 ? null : str2);
    }
}
