package okhttp3.internal.p129ws;

import okhttp3.C2180y;
import p069h7.AbstractC1213o;
import p069h7.AbstractC1214p;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.ws.e */
/* loaded from: classes.dex */
public final class C2154e {
    public static final a Companion = new a(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[PHI: r7 r9 r11
          0x00bd: PHI (r7v5 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v9 java.lang.Integer) binds: [B:52:0x00e8, B:34:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          0x00bd: PHI (r9v8 java.lang.Integer) = (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:52:0x00e8, B:34:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          0x00bd: PHI (r11v16 boolean) = (r11v10 boolean), (r11v19 boolean) binds: [B:52:0x00e8, B:34:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C2154e parse(C2180y c2180y) {
            boolean z7;
            String strTrimSubstring;
            AbstractC2980h.m5136e("responseHeaders", c2180y);
            int size = c2180y.size();
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            Integer numM2658k0 = null;
            Integer numM2658k02 = null;
            for (int i = 0; i < size; i++) {
                if (AbstractC1214p.m2661n0(c2180y.name(i), C2154e.HEADER_WEB_SOCKET_EXTENSION)) {
                    String strValue = c2180y.value(i);
                    int i4 = 0;
                    while (i4 < strValue.length()) {
                        int iDelimiterOffset$default = AbstractC2278c.delimiterOffset$default(strValue, ',', i4, 0, 4, (Object) null);
                        char c8 = ';';
                        int iDelimiterOffset = AbstractC2278c.delimiterOffset(strValue, ';', i4, iDelimiterOffset$default);
                        String strTrimSubstring2 = AbstractC2278c.trimSubstring(strValue, i4, iDelimiterOffset);
                        int i8 = iDelimiterOffset + 1;
                        boolean z12 = true;
                        if (AbstractC1214p.m2661n0(strTrimSubstring2, "permessage-deflate")) {
                            if (z8) {
                                z11 = true;
                            }
                            i4 = i8;
                            while (i4 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = AbstractC2278c.delimiterOffset(strValue, c8, i4, iDelimiterOffset$default);
                                int iDelimiterOffset3 = AbstractC2278c.delimiterOffset(strValue, '=', i4, iDelimiterOffset2);
                                String strTrimSubstring3 = AbstractC2278c.trimSubstring(strValue, i4, iDelimiterOffset3);
                                if (iDelimiterOffset3 < iDelimiterOffset2) {
                                    strTrimSubstring = AbstractC2278c.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2);
                                    AbstractC2980h.m5136e("<this>", strTrimSubstring);
                                    if (strTrimSubstring.length() >= 2 && AbstractC1214p.m2667t0(strTrimSubstring, "\"", false) && AbstractC1214p.m2660m0(strTrimSubstring, "\"", false)) {
                                        z7 = z12;
                                        strTrimSubstring = strTrimSubstring.substring(z7 ? 1 : 0, strTrimSubstring.length() - 1);
                                        AbstractC2980h.m5135d("substring(...)", strTrimSubstring);
                                    } else {
                                        z7 = z12;
                                    }
                                } else {
                                    z7 = z12;
                                    strTrimSubstring = null;
                                }
                                int i9 = iDelimiterOffset2 + 1;
                                if (AbstractC1214p.m2661n0(strTrimSubstring3, "client_max_window_bits")) {
                                    if (numM2658k0 != null) {
                                        z11 = z7;
                                    }
                                    numM2658k0 = strTrimSubstring != null ? AbstractC1213o.m2658k0(strTrimSubstring) : null;
                                    if (numM2658k0 == null) {
                                        i4 = i9;
                                        z11 = z7;
                                        z12 = z11;
                                    } else {
                                        i4 = i9;
                                        z12 = z7;
                                    }
                                } else if (AbstractC1214p.m2661n0(strTrimSubstring3, "client_no_context_takeover")) {
                                    if (z9) {
                                        z11 = z7;
                                    }
                                    if (strTrimSubstring != null) {
                                        z11 = z7;
                                    }
                                    i4 = i9;
                                    z9 = z7;
                                    z12 = z9;
                                } else {
                                    if (AbstractC1214p.m2661n0(strTrimSubstring3, "server_max_window_bits")) {
                                        if (numM2658k02 != null) {
                                            z11 = z7;
                                        }
                                        numM2658k02 = strTrimSubstring != null ? AbstractC1213o.m2658k0(strTrimSubstring) : null;
                                        if (numM2658k02 == null) {
                                        }
                                    } else if (AbstractC1214p.m2661n0(strTrimSubstring3, "server_no_context_takeover")) {
                                        if (z10) {
                                            z11 = z7;
                                        }
                                        if (strTrimSubstring != null) {
                                            z11 = z7;
                                        }
                                        i4 = i9;
                                        z10 = z7;
                                        z12 = z10;
                                    }
                                    i4 = i9;
                                    z11 = z7;
                                    z12 = z11;
                                }
                                c8 = ';';
                            }
                            z8 = z12;
                        } else {
                            i4 = i8;
                            z11 = true;
                        }
                    }
                }
            }
            return new C2154e(z8, numM2658k0, z9, numM2658k02, z10, z11);
        }

        private a() {
        }
    }

    public C2154e() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ C2154e copy$default(C2154e c2154e, boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z7 = c2154e.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = c2154e.clientMaxWindowBits;
        }
        if ((i & 4) != 0) {
            z8 = c2154e.clientNoContextTakeover;
        }
        if ((i & 8) != 0) {
            num2 = c2154e.serverMaxWindowBits;
        }
        if ((i & 16) != 0) {
            z9 = c2154e.serverNoContextTakeover;
        }
        if ((i & 32) != 0) {
            z10 = c2154e.unknownValues;
        }
        boolean z11 = z9;
        boolean z12 = z10;
        return c2154e.copy(z7, num, z8, num2, z11, z12);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final C2154e copy(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10) {
        return new C2154e(z7, num, z8, num2, z9, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2154e)) {
            return false;
        }
        C2154e c2154e = (C2154e) obj;
        return this.perMessageDeflate == c2154e.perMessageDeflate && AbstractC2980h.m5132a(this.clientMaxWindowBits, c2154e.clientMaxWindowBits) && this.clientNoContextTakeover == c2154e.clientNoContextTakeover && AbstractC2980h.m5132a(this.serverMaxWindowBits, c2154e.serverMaxWindowBits) && this.serverNoContextTakeover == c2154e.serverNoContextTakeover && this.unknownValues == c2154e.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z7 = this.perMessageDeflate;
        ?? r02 = z7;
        if (z7) {
            r02 = 1;
        }
        int i = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i8 = (iHashCode + i4) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i8 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i9 = r23;
        if (r23 != 0) {
            i9 = 1;
        }
        int i10 = (iHashCode2 + i9) * 31;
        boolean z8 = this.unknownValues;
        return i10 + (z8 ? 1 : z8 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z7) {
        return z7 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public C2154e(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10) {
        this.perMessageDeflate = z7;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z8;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z9;
        this.unknownValues = z10;
    }

    public /* synthetic */ C2154e(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10, int i, AbstractC2977e abstractC2977e) {
        this((i & 1) != 0 ? false : z7, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z8, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z9, (i & 32) != 0 ? false : z10);
    }
}
