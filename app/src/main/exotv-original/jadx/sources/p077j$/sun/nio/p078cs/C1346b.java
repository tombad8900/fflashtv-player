package p077j$.sun.nio.p078cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

/* renamed from: j$.sun.nio.cs.b */
/* loaded from: classes2.dex */
public final class C1346b extends CharsetEncoder {

    /* renamed from: a */
    public final C1349e f5397a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c8) {
        return c8 <= '\u00ff';
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    public C1346b(C1347c c1347c) {
        super(c1347c, 1.0f, 1.0f);
        C1349e c1349e = new C1349e();
        c1349e.f5400a = CoderResult.UNDERFLOW;
        this.f5397a = c1349e;
    }

    /* renamed from: a */
    public static int m2864a(char[] cArr, int i, byte[] bArr, int i4, int i8) {
        int i9 = 0;
        if (i8 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i4 < 0 || i4 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i4);
        }
        int i10 = (i + i8) - 1;
        if (i10 < 0 || i10 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i11 = (i4 + i8) - 1;
        if (i11 < 0 || i11 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i11);
        }
        while (i9 < i8) {
            int i12 = i + 1;
            char c8 = cArr[i];
            if (c8 > '\u00ff') {
                break;
            }
            bArr[i4] = (byte) c8;
            i9++;
            i = i12;
            i4++;
        }
        return i9;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultUnmappableForLength;
        CoderResult coderResultUnmappableForLength2;
        int i = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResultUnmappableForLength = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c8 = charBuffer.get();
                    if (c8 <= '\u00ff') {
                        if (!byteBuffer.hasRemaining()) {
                            coderResultUnmappableForLength = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c8);
                        iPosition++;
                    } else if (this.f5397a.m2865a(c8, charBuffer) < 0) {
                        coderResultUnmappableForLength = this.f5397a.f5400a;
                    } else {
                        if (!this.f5397a.f5401b) {
                            i = 1;
                        }
                        coderResultUnmappableForLength = CoderResult.unmappableForLength(i);
                    }
                } finally {
                }
            }
            return coderResultUnmappableForLength;
        }
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset();
        int iPosition2 = charBuffer.position() + iArrayOffset;
        int iLimit = charBuffer.limit() + iArrayOffset;
        if (iPosition2 > iLimit) {
            iPosition2 = iLimit;
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset2 = byteBuffer.arrayOffset();
        int iPosition3 = byteBuffer.position() + iArrayOffset2;
        int iLimit2 = byteBuffer.limit() + iArrayOffset2;
        if (iPosition3 > iLimit2) {
            iPosition3 = iLimit2;
        }
        int i4 = iLimit2 - iPosition3;
        int i8 = iLimit - iPosition2;
        if (i4 >= i8) {
            i4 = i8;
        }
        try {
            int iM2864a = m2864a(cArrArray, iPosition2, bArrArray, iPosition3, i4);
            int i9 = iPosition2 + iM2864a;
            int i10 = iPosition3 + iM2864a;
            if (iM2864a == i4) {
                coderResultUnmappableForLength2 = i4 < i8 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            } else if (this.f5397a.m2866b(cArrArray[i9], cArrArray, i9, iLimit) < 0) {
                coderResultUnmappableForLength2 = this.f5397a.f5400a;
            } else {
                if (!this.f5397a.f5401b) {
                    i = 1;
                }
                coderResultUnmappableForLength2 = CoderResult.unmappableForLength(i);
            }
            return coderResultUnmappableForLength2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
