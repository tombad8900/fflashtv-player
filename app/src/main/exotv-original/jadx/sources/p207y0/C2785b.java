package p207y0;

import android.util.Log;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y0.b */
/* loaded from: classes.dex */
public class C2785b extends InputStream implements DataInput {

    /* renamed from: j */
    public final DataInputStream f10347j;

    /* renamed from: k */
    public int f10348k;

    /* renamed from: l */
    public ByteOrder f10349l;

    /* renamed from: m */
    public byte[] f10350m;

    /* renamed from: n */
    public final int f10351n;

    public C2785b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f10351n = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10347j.available();
    }

    /* renamed from: b */
    public final void m4867b(int i) throws IOException {
        int i4 = 0;
        while (i4 < i) {
            int i8 = i - i4;
            DataInputStream dataInputStream = this.f10347j;
            int iSkip = (int) dataInputStream.skip(i8);
            if (iSkip <= 0) {
                if (this.f10350m == null) {
                    this.f10350m = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED];
                }
                iSkip = dataInputStream.read(this.f10350m, 0, Math.min(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED, i8));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC0008a1.m14j("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i4 += iSkip;
        }
        this.f10348k += i4;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f10348k++;
        return this.f10347j.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f10348k++;
        return this.f10347j.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f10348k++;
        int i = this.f10347j.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f10348k += 2;
        return this.f10347j.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i4) throws IOException {
        this.f10348k += i4;
        this.f10347j.readFully(bArr, i, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f10348k += 4;
        DataInputStream dataInputStream = this.f10347j;
        int i = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i | i4 | i8 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10349l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i9 << 24) + (i8 << 16) + (i4 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i4 << 16) + (i8 << 8) + i9;
        }
        throw new IOException("Invalid byte order: " + this.f10349l);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j8;
        this.f10348k += 8;
        DataInputStream dataInputStream = this.f10347j;
        int i = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i | i4 | i8 | i9 | i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10349l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (i13 << 56) + (i12 << 48) + (i11 << 40) + (i10 << 32) + (i9 << 24) + (i8 << 16) + (i4 << 8);
            j8 = i;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f10349l);
            }
            j = (i << 56) + (i4 << 48) + (i8 << 40) + (i9 << 32) + (i10 << 24) + (i11 << 16) + (i12 << 8);
            j8 = i13;
        }
        return j + j8;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f10348k += 2;
        DataInputStream dataInputStream = this.f10347j;
        int i = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10349l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i4 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i4);
        }
        throw new IOException("Invalid byte order: " + this.f10349l);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f10348k += 2;
        return this.f10347j.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f10348k++;
        return this.f10347j.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f10348k += 2;
        DataInputStream dataInputStream = this.f10347j;
        int i = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10349l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f10349l);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2785b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i8 = this.f10347j.read(bArr, i, i4);
        this.f10348k += i8;
        return i8;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f10348k += bArr.length;
        this.f10347j.readFully(bArr);
    }

    public C2785b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10347j = dataInputStream;
        dataInputStream.mark(0);
        this.f10348k = 0;
        this.f10349l = byteOrder;
        this.f10351n = inputStream instanceof C2785b ? ((C2785b) inputStream).f10351n : -1;
    }
}
