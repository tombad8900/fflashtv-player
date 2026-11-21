package p089k1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.b0 */
/* loaded from: classes.dex */
public final class C1555b0 implements InterfaceC1564h {

    /* renamed from: j */
    public final InterfaceC1564h f5953j;

    /* renamed from: k */
    public long f5954k;

    /* renamed from: l */
    public Uri f5955l;

    /* renamed from: m */
    public Map f5956m;

    public C1555b0(InterfaceC1564h interfaceC1564h) {
        interfaceC1564h.getClass();
        this.f5953j = interfaceC1564h;
        this.f5955l = Uri.EMPTY;
        this.f5956m = Collections.EMPTY_MAP;
    }

    @Override // p089k1.InterfaceC1564h
    public final void addTransferListener(InterfaceC1557c0 interfaceC1557c0) {
        interfaceC1557c0.getClass();
        this.f5953j.addTransferListener(interfaceC1557c0);
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        this.f5953j.close();
    }

    @Override // p089k1.InterfaceC1564h
    public final Map getResponseHeaders() {
        return this.f5953j.getResponseHeaders();
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.f5953j.getUri();
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) {
        InterfaceC1564h interfaceC1564h = this.f5953j;
        this.f5955l = c1568l.f5996a;
        this.f5956m = Collections.EMPTY_MAP;
        try {
            return interfaceC1564h.open(c1568l);
        } finally {
            Uri uri = interfaceC1564h.getUri();
            if (uri != null) {
                this.f5955l = uri;
            }
            this.f5956m = interfaceC1564h.getResponseHeaders();
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) {
        int i8 = this.f5953j.read(bArr, i, i4);
        if (i8 != -1) {
            this.f5954k += i8;
        }
        return i8;
    }
}
