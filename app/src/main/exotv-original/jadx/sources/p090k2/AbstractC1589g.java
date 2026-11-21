package p090k2;

import java.nio.ByteBuffer;
import p106m1.AbstractC1875j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.g */
/* loaded from: classes.dex */
public abstract class AbstractC1589g extends AbstractC1875j implements InterfaceC1591i {
    private final String name;

    public AbstractC1589g(String str) {
        super(new C1595m[2], new AbstractC1596n[2]);
        this.name = str;
        setInitialInputBufferSize(1024);
    }

    public abstract InterfaceC1590h decode(byte[] bArr, int i, boolean z7);

    @Override // p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    public final String getName() {
        return this.name;
    }

    @Override // p090k2.InterfaceC1591i
    public void setPositionUs(long j) {
    }

    @Override // p106m1.AbstractC1875j
    public final C1595m createInputBuffer() {
        return new C1595m(1);
    }

    @Override // p106m1.AbstractC1875j
    public final AbstractC1596n createOutputBuffer() {
        return new C1588f(this);
    }

    @Override // p106m1.AbstractC1875j
    public final C1592j createUnexpectedDecodeException(Throwable th) {
        return new C1592j("Unexpected decode error", th);
    }

    @Override // p106m1.AbstractC1875j
    public final C1592j decode(C1595m c1595m, AbstractC1596n abstractC1596n, boolean z7) {
        try {
            ByteBuffer byteBuffer = c1595m.data;
            byteBuffer.getClass();
            InterfaceC1590h interfaceC1590hDecode = decode(byteBuffer.array(), byteBuffer.limit(), z7);
            long j = c1595m.timeUs;
            long j8 = c1595m.f6074j;
            abstractC1596n.timeUs = j;
            abstractC1596n.f6075j = interfaceC1590hDecode;
            if (j8 != Long.MAX_VALUE) {
                j = j8;
            }
            abstractC1596n.f6076k = j;
            abstractC1596n.shouldBeSkipped = false;
            return null;
        } catch (C1592j e) {
            return e;
        }
    }
}
