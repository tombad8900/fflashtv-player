package okhttp3.internal.http2;

import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1214p;
import p090k2.C1584b;
import p147q7.AbstractC2278c;
import p189v7.C2579m;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.e */
/* loaded from: classes.dex */
public final class C2121e {
    private static final String[] BINARY;
    public static final C2579m CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final C2121e INSTANCE = new C2121e();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        C2579m c2579m = C2579m.f9316m;
        CONNECTION_PREFACE = C1584b.m3251p("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            AbstractC2980h.m5135d("toBinaryString(it)", binaryString);
            strArr[i] = AbstractC1214p.m2664q0(AbstractC2278c.format("%8s", binaryString), ' ', '0');
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = C2181z.FRAGMENT_ENCODE_SET;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = AbstractC0008a1.m18n(new StringBuilder(), strArr2[i4], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr2[i8];
            int i10 = iArr[0];
            String[] strArr3 = FLAGS;
            int i11 = i10 | i9;
            strArr3[i11] = strArr3[i10] + '|' + strArr3[i9];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i10]);
            sb.append('|');
            strArr3[i11 | 8] = AbstractC0008a1.m18n(sb, strArr3[i9], "|PADDED");
        }
        int length = FLAGS.length;
        for (int i12 = 0; i12 < length; i12++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i12] == null) {
                strArr4[i12] = BINARY[i12];
            }
        }
    }

    private C2121e() {
    }

    public final String formatFlags(int i, int i4) {
        String str;
        if (i4 == 0) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i4 == 1 ? "ACK" : BINARY[i4];
            }
            if (i != 7 && i != 8) {
                String[] strArr = FLAGS;
                if (i4 < strArr.length) {
                    str = strArr[i4];
                    AbstractC2980h.m5133b(str);
                } else {
                    str = BINARY[i4];
                }
                return (i != 5 || (i4 & 4) == 0) ? (i != 0 || (i4 & 32) == 0) ? str : AbstractC1214p.m2665r0(str, "PRIORITY", "COMPRESSED") : AbstractC1214p.m2665r0(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return BINARY[i4];
    }

    public final String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        return i < strArr.length ? strArr[i] : AbstractC2278c.format("0x%02x", Integer.valueOf(i));
    }

    public final String frameLog(boolean z7, int i, int i4, int i8, int i9) {
        return AbstractC2278c.format("%s 0x%08x %5d %-13s %s", z7 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i4), formattedType$okhttp(i8), formatFlags(i8, i9));
    }
}
