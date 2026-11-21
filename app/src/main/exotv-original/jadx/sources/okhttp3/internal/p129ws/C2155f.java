package okhttp3.internal.p129ws;

import p002a1.AbstractC0008a1;
import p090k2.C1584b;
import p189v7.C2569h;
import p189v7.C2573j;
import p189v7.C2579m;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.ws.f */
/* loaded from: classes.dex */
public final class C2155f {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final C2155f INSTANCE = new C2155f();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private C2155f() {
    }

    public final String acceptHeader(String str) {
        AbstractC2980h.m5136e("key", str);
        C2579m c2579m = C2579m.f9316m;
        return C1584b.m3251p(str.concat(ACCEPT_MAGIC)).mo4633c("SHA-1").mo4632a();
    }

    public final String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return AbstractC0008a1.m12h(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return AbstractC0008a1.m14j("Code ", i, " is reserved and may not be used.");
    }

    public final void toggleMask(C2569h c2569h, byte[] bArr) {
        long j;
        AbstractC2980h.m5136e("cursor", c2569h);
        AbstractC2980h.m5136e("key", bArr);
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = c2569h.f9306n;
            int i4 = c2569h.f9307o;
            int i8 = c2569h.f9308p;
            if (bArr2 != null) {
                while (i4 < i8) {
                    int i9 = i % length;
                    bArr2[i4] = (byte) (bArr2[i4] ^ bArr[i9]);
                    i4++;
                    i = i9 + 1;
                }
            }
            long j8 = c2569h.f9305m;
            C2573j c2573j = c2569h.f9302j;
            AbstractC2980h.m5133b(c2573j);
            if (j8 == c2573j.f9314k) {
                throw new IllegalStateException("no more bytes");
            }
            j = c2569h.f9305m;
        } while (c2569h.m4631c(j == -1 ? 0L : j + (c2569h.f9308p - c2569h.f9307o)) != -1);
    }

    public final void validateCloseCode(int i) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        AbstractC2980h.m5133b(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }
}
