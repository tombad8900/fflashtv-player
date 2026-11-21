package p194w3;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w3.f */
/* loaded from: classes.dex */
public final class C2644f implements Closeable {

    /* renamed from: j */
    public final FileInputStream f9625j;

    /* renamed from: k */
    public final Charset f9626k;

    /* renamed from: l */
    public byte[] f9627l;

    /* renamed from: m */
    public int f9628m;

    /* renamed from: n */
    public int f9629n;

    public C2644f(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC2645g.f9630a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f9625j = fileInputStream;
        this.f9626k = charset;
        this.f9627l = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4749b() {
        int i;
        synchronized (this.f9625j) {
            try {
                byte[] bArr = this.f9627l;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f9628m >= this.f9629n) {
                    int i4 = this.f9625j.read(bArr, 0, bArr.length);
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.f9628m = 0;
                    this.f9629n = i4;
                }
                for (int i8 = this.f9628m; i8 != this.f9629n; i8++) {
                    byte[] bArr2 = this.f9627l;
                    if (bArr2[i8] == 10) {
                        int i9 = this.f9628m;
                        if (i8 != i9) {
                            i = i8 - 1;
                            if (bArr2[i] != 13) {
                                i = i8;
                            }
                        }
                        String str = new String(bArr2, i9, i - i9, this.f9626k.name());
                        this.f9628m = i8 + 1;
                        return str;
                    }
                }
                C2643e c2643e = new C2643e(this, (this.f9629n - this.f9628m) + 80);
                while (true) {
                    byte[] bArr3 = this.f9627l;
                    int i10 = this.f9628m;
                    c2643e.write(bArr3, i10, this.f9629n - i10);
                    this.f9629n = -1;
                    FileInputStream fileInputStream = this.f9625j;
                    byte[] bArr4 = this.f9627l;
                    int i11 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f9628m = 0;
                    this.f9629n = i11;
                    for (int i12 = 0; i12 != this.f9629n; i12++) {
                        byte[] bArr5 = this.f9627l;
                        if (bArr5[i12] == 10) {
                            int i13 = this.f9628m;
                            if (i12 != i13) {
                                c2643e.write(bArr5, i13, i12 - i13);
                            }
                            this.f9628m = i12 + 1;
                            return c2643e.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9625j) {
            try {
                if (this.f9627l != null) {
                    this.f9627l = null;
                    this.f9625j.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
