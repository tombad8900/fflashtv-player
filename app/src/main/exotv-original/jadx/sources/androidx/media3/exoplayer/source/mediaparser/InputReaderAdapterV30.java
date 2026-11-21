package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser$SeekableInputReader;
import androidx.media3.common.InterfaceC0219m;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"Override"})
/* loaded from: classes.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;
    private InterfaceC0219m dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i, int i4) {
        InterfaceC0219m interfaceC0219m = this.dataReader;
        int i8 = AbstractC1118i0.f4750a;
        int i9 = interfaceC0219m.read(bArr, i, i4);
        this.currentPosition += i9;
        return i9;
    }

    public void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    public void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public void setDataReader(InterfaceC0219m interfaceC0219m, long j) {
        this.dataReader = interfaceC0219m;
        this.resourceLength = j;
        this.lastSeekPosition = -1L;
    }
}
