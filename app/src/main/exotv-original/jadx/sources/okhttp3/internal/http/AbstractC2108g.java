package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C2080i0;
import okhttp3.C2159j;
import okhttp3.C2169o;
import okhttp3.C2180y;
import okhttp3.C2181z;
import okhttp3.InterfaceC2172q;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1214p;
import p090k2.C1584b;
import p111m6.C1922q;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p189v7.C2573j;
import p189v7.C2579m;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.g */
/* loaded from: classes.dex */
public abstract class AbstractC2108g {
    private static final C2579m QUOTED_STRING_DELIMITERS;
    private static final C2579m TOKEN_DELIMITERS;

    static {
        C2579m c2579m = C2579m.f9316m;
        QUOTED_STRING_DELIMITERS = C1584b.m3251p("\"\\");
        TOKEN_DELIMITERS = C1584b.m3251p("\t ,=");
    }

    public static final boolean hasBody(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("response", c2080i0);
        return promisesBody(c2080i0);
    }

    public static final List<C2159j> parseChallenges(C2180y c2180y, String str) {
        AbstractC2980h.m5136e("<this>", c2180y);
        AbstractC2980h.m5136e("headerName", str);
        ArrayList arrayList = new ArrayList();
        int size = c2180y.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c2180y.name(i))) {
                C2573j c2573j = new C2573j();
                c2573j.m4661Q(c2180y.value(i));
                try {
                    readChallengeHeader(c2573j, arrayList);
                } catch (EOFException e) {
                    C2385h.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("<this>", c2080i0);
        if (AbstractC2980h.m5132a(c2080i0.request().method(), "HEAD")) {
            return false;
        }
        int iCode = c2080i0.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && AbstractC2278c.headersContentLength(c2080i0) == -1 && !"chunked".equalsIgnoreCase(C2080i0.header$default(c2080i0, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ae, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(C2573j c2573j, List<C2159j> list) throws EOFException {
        String token;
        int iSkipAll;
        LinkedHashMap linkedHashMap;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(c2573j);
                    token2 = readToken(c2573j);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(c2573j);
                token = readToken(c2573j);
                if (token == null) {
                    if (c2573j.mo4614j()) {
                        list.add(new C2159j(token2, C1922q.f7188j));
                        return;
                    }
                    return;
                }
                iSkipAll = AbstractC2278c.skipAll(c2573j, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(c2573j);
                if (zSkipCommasAndWhitespace || (!zSkipCommasAndWhitespace2 && !c2573j.mo4614j())) {
                    linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = AbstractC2278c.skipAll(c2573j, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token == null) {
                            token = readToken(c2573j);
                            if (!skipCommasAndWhitespace(c2573j)) {
                                iSkipAll2 = AbstractC2278c.skipAll(c2573j, (byte) 61);
                                if (iSkipAll2 == 0) {
                                    if (iSkipAll2 > 1 || skipCommasAndWhitespace(c2573j)) {
                                        return;
                                    }
                                    String quotedString = startsWith(c2573j, (byte) 34) ? readQuotedString(c2573j) : readToken(c2573j);
                                    if (quotedString == null || ((String) linkedHashMap.put(token, quotedString)) != null) {
                                        return;
                                    }
                                    if (!skipCommasAndWhitespace(c2573j) && !c2573j.mo4614j()) {
                                        return;
                                    } else {
                                        token = null;
                                    }
                                }
                            }
                        } else if (iSkipAll2 == 0) {
                            break;
                        }
                    }
                }
                list.add(new C2159j(token2, linkedHashMap));
                token2 = token;
            }
            Map mapSingletonMap = Collections.singletonMap(null, token.concat(AbstractC1214p.m2663p0(iSkipAll)));
            AbstractC2980h.m5135d("singletonMap<String, Str\u2026ek + \"=\".repeat(eqCount))", mapSingletonMap);
            list.add(new C2159j(token2, (Map<String, String>) mapSingletonMap));
        }
    }

    private static final String readQuotedString(C2573j c2573j) throws EOFException {
        if (c2573j.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C2573j c2573j2 = new C2573j();
        while (true) {
            long jM4668p = c2573j.m4668p(QUOTED_STRING_DELIMITERS);
            if (jM4668p == -1) {
                return null;
            }
            if (c2573j.m4666g(jM4668p) == 34) {
                c2573j2.write(c2573j, jM4668p);
                c2573j.readByte();
                return c2573j2.m4651G();
            }
            if (c2573j.f9314k == jM4668p + 1) {
                return null;
            }
            c2573j2.write(c2573j, jM4668p);
            c2573j.readByte();
            c2573j2.write(c2573j, 1L);
        }
    }

    private static final String readToken(C2573j c2573j) {
        long jM4668p = c2573j.m4668p(TOKEN_DELIMITERS);
        if (jM4668p == -1) {
            jM4668p = c2573j.f9314k;
        }
        if (jM4668p != 0) {
            return c2573j.m4650F(jM4668p, AbstractC1199a.f5077a);
        }
        return null;
    }

    public static final void receiveHeaders(InterfaceC2172q interfaceC2172q, C2181z c2181z, C2180y c2180y) {
        AbstractC2980h.m5136e("<this>", interfaceC2172q);
        AbstractC2980h.m5136e("url", c2181z);
        AbstractC2980h.m5136e("headers", c2180y);
        if (interfaceC2172q == InterfaceC2172q.NO_COOKIES) {
            return;
        }
        List<C2169o> all = C2169o.Companion.parseAll(c2181z, c2180y);
        if (all.isEmpty()) {
            return;
        }
        interfaceC2172q.saveFromResponse(c2181z, all);
    }

    private static final boolean skipCommasAndWhitespace(C2573j c2573j) throws EOFException {
        boolean z7 = false;
        while (!c2573j.mo4614j()) {
            byte bM4666g = c2573j.m4666g(0L);
            if (bM4666g == 44) {
                c2573j.readByte();
                z7 = true;
            } else {
                if (bM4666g != 32 && bM4666g != 9) {
                    break;
                }
                c2573j.readByte();
            }
        }
        return z7;
    }

    private static final boolean startsWith(C2573j c2573j, byte b7) {
        return !c2573j.mo4614j() && c2573j.m4666g(0L) == b7;
    }
}
