package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p089k1.C1568l;
import p089k1.InterfaceC1557c0;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class IcyDataSource implements InterfaceC1564h {
    private int bytesUntilMetadata;
    private final Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final InterfaceC1564h upstream;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Listener {
        void onIcyMetadata(C1132w c1132w);
    }

    public IcyDataSource(InterfaceC1564h interfaceC1564h, int i, Listener listener) {
        AbstractC1101a.m2353d(i > 0);
        this.upstream = interfaceC1564h;
        this.metadataIntervalBytes = i;
        this.listener = listener;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i;
    }

    private boolean readMetadata() {
        if (this.upstream.read(this.metadataLengthByteHolder, 0, 1) != -1) {
            int i = (this.metadataLengthByteHolder[0] & 255) << 4;
            if (i != 0) {
                byte[] bArr = new byte[i];
                int i4 = i;
                int i8 = 0;
                while (i4 > 0) {
                    int i9 = this.upstream.read(bArr, i8, i4);
                    if (i9 != -1) {
                        i8 += i9;
                        i4 -= i9;
                    }
                }
                while (i > 0 && bArr[i - 1] == 0) {
                    i--;
                }
                if (i > 0) {
                    this.listener.onIcyMetadata(new C1132w(bArr, i));
                }
            }
            return true;
        }
        return false;
    }

    @Override // p089k1.InterfaceC1564h
    public void addTransferListener(InterfaceC1557c0 interfaceC1557c0) {
        interfaceC1557c0.getClass();
        this.upstream.addTransferListener(interfaceC1557c0);
    }

    @Override // p089k1.InterfaceC1564h
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p089k1.InterfaceC1564h
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // p089k1.InterfaceC1564h
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // p089k1.InterfaceC1564h
    public long open(C1568l c1568l) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public int read(byte[] bArr, int i, int i4) {
        if (this.bytesUntilMetadata == 0) {
            if (!readMetadata()) {
                return -1;
            }
            this.bytesUntilMetadata = this.metadataIntervalBytes;
        }
        int i8 = this.upstream.read(bArr, i, Math.min(this.bytesUntilMetadata, i4));
        if (i8 != -1) {
            this.bytesUntilMetadata -= i8;
        }
        return i8;
    }
}
