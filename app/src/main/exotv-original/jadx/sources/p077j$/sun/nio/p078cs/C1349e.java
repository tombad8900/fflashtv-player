package p077j$.sun.nio.p078cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* renamed from: j$.sun.nio.cs.e */
/* loaded from: classes2.dex */
public final class C1349e {

    /* renamed from: a */
    public CoderResult f5400a;

    /* renamed from: b */
    public boolean f5401b;

    /* renamed from: a */
    public final int m2865a(char c8, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c8)) {
            if (!charBuffer.hasRemaining()) {
                this.f5400a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c9 = charBuffer.get();
            if (Character.isLowSurrogate(c9)) {
                int codePoint = Character.toCodePoint(c8, c9);
                this.f5401b = true;
                this.f5400a = null;
                return codePoint;
            }
            this.f5400a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c8)) {
            this.f5400a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.f5401b = false;
        this.f5400a = null;
        return c8;
    }

    /* renamed from: b */
    public final int m2866b(char c8, char[] cArr, int i, int i4) {
        if (!Character.isHighSurrogate(c8)) {
            if (Character.isLowSurrogate(c8)) {
                this.f5400a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f5401b = false;
            this.f5400a = null;
            return c8;
        }
        if (i4 - i < 2) {
            this.f5400a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c9 = cArr[i + 1];
        if (Character.isLowSurrogate(c9)) {
            int codePoint = Character.toCodePoint(c8, c9);
            this.f5401b = true;
            this.f5400a = null;
            return codePoint;
        }
        this.f5400a = CoderResult.malformedForLength(1);
        return -1;
    }
}
