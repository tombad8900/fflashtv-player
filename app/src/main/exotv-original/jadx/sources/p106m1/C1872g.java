package p106m1;

import androidx.media3.common.AbstractC0229p0;
import androidx.media3.common.C0249w;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m1.g */
/* loaded from: classes.dex */
public class C1872g extends AbstractC1866a {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public ByteBuffer data;
    public C0249w format;
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;
    public final C1868c cryptoInfo = new C1868c();
    private final int paddingSize = 0;

    static {
        AbstractC0229p0.m658a("media3.decoder");
    }

    public C1872g(int i) {
        this.bufferReplacementMode = i;
    }

    public static C1872g newNoDataInstance() {
        return new C1872g(0);
    }

    /* renamed from: a */
    public final ByteBuffer m3657a(int i) {
        int i4 = this.bufferReplacementMode;
        if (i4 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i4 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.data;
        throw new C1871f("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    @Override // p106m1.AbstractC1866a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i) {
        int i4 = i + this.paddingSize;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = m3657a(i4);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i8 = i4 + iPosition;
        if (iCapacity >= i8) {
            this.data = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM3657a = m3657a(i8);
        byteBufferM3657a.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM3657a.put(byteBuffer);
        }
        this.data = byteBufferM3657a;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i) {
        ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.supplementalData = ByteBuffer.allocate(i);
        } else {
            this.supplementalData.clear();
        }
    }
}
