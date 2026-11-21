package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1924s;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.j */
/* loaded from: classes.dex */
public final class C2159j {
    private final Map<String, String> authParams;
    private final String scheme;

    public C2159j(String str, Map<String, String> map) {
        String lowerCase;
        AbstractC2980h.m5136e("scheme", str);
        AbstractC2980h.m5136e("authParams", map);
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                AbstractC2980h.m5135d("US", locale);
                lowerCase = key.toLowerCase(locale);
                AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase);
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC2980h.m5135d("unmodifiableMap<String?, String>(newAuthParams)", mapUnmodifiableMap);
        this.authParams = mapUnmodifiableMap;
    }

    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m5233deprecated_authParams() {
        return this.authParams;
    }

    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m5234deprecated_charset() {
        return charset();
    }

    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m5235deprecated_realm() {
        return realm();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m5236deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                AbstractC2980h.m5135d("forName(charset)", charsetForName);
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        AbstractC2980h.m5135d("ISO_8859_1", charset);
        return charset;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2159j)) {
            return false;
        }
        C2159j c2159j = (C2159j) obj;
        return AbstractC2980h.m5132a(c2159j.scheme, this.scheme) && AbstractC2980h.m5132a(c2159j.authParams, this.authParams);
    }

    public int hashCode() {
        return this.authParams.hashCode() + AbstractC0008a1.m9e(this.scheme, 899, 31);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final C2159j withCharset(Charset charset) {
        AbstractC2980h.m5136e("charset", charset);
        LinkedHashMap linkedHashMapM3764Y = AbstractC1924s.m3764Y(this.authParams);
        String strName = charset.name();
        AbstractC2980h.m5135d("charset.name()", strName);
        linkedHashMapM3764Y.put("charset", strName);
        return new C2159j(this.scheme, linkedHashMapM3764Y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2159j(String str, String str2) {
        AbstractC2980h.m5136e("scheme", str);
        AbstractC2980h.m5136e("realm", str2);
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        AbstractC2980h.m5135d("singletonMap(\"realm\", realm)", mapSingletonMap);
        this(str, (Map<String, String>) mapSingletonMap);
    }
}
