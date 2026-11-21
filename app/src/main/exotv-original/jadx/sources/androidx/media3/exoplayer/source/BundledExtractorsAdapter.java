package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.InterfaceC0219m;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import p043e6.C0917e;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p057g2.C1041e;
import p063h1.AbstractC1101a;
import p115n1.C1964a0;
import p115n1.C1983k;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p115n1.InterfaceC1990q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {
    private InterfaceC1987n extractor;
    private InterfaceC1988o extractorInput;
    private final InterfaceC1990q extractorsFactory;

    public BundledExtractorsAdapter(InterfaceC1990q interfaceC1990q) {
        this.extractorsFactory = interfaceC1990q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$init$0(InterfaceC1987n interfaceC1987n) {
        return interfaceC1987n.getUnderlyingImplementation().getClass().getSimpleName();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        InterfaceC1987n interfaceC1987n = this.extractor;
        if (interfaceC1987n == null) {
            return;
        }
        InterfaceC1987n underlyingImplementation = interfaceC1987n.getUnderlyingImplementation();
        if (underlyingImplementation instanceof C1041e) {
            ((C1041e) underlyingImplementation).f4439r = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        InterfaceC1988o interfaceC1988o = this.extractorInput;
        if (interfaceC1988o != null) {
            return interfaceC1988o.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(InterfaceC0219m interfaceC0219m, Uri uri, Map<String, List<String>> map, long j, long j8, InterfaceC1989p interfaceC1989p) throws UnrecognizedInputFormatException {
        C1983k c1983k = new C1983k(interfaceC0219m, j, j8);
        this.extractorInput = c1983k;
        if (this.extractor != null) {
            return;
        }
        InterfaceC1987n[] interfaceC1987nArrMo3870c = this.extractorsFactory.mo3870c(uri, map);
        int length = interfaceC1987nArrMo3870c.length;
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        AbstractC1006u.m2188c(length, "expectedSize");
        C0974j0 c0974j0 = new C0974j0(length);
        boolean z7 = true;
        if (interfaceC1987nArrMo3870c.length == 1) {
            this.extractor = interfaceC1987nArrMo3870c[0];
        } else {
            int length2 = interfaceC1987nArrMo3870c.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                InterfaceC1987n interfaceC1987n = interfaceC1987nArrMo3870c[i];
                try {
                } catch (EOFException unused) {
                    if (this.extractor != null || c1983k.f7358m == j) {
                    }
                } catch (Throwable th) {
                    if (this.extractor == null && c1983k.f7358m != j) {
                        z7 = false;
                    }
                    AbstractC1101a.m2359j(z7);
                    c1983k.f7360o = 0;
                    throw th;
                }
                if (interfaceC1987n.sniff(c1983k)) {
                    this.extractor = interfaceC1987n;
                    c1983k.f7360o = 0;
                    break;
                } else {
                    c0974j0.m2143c(interfaceC1987n.getSniffFailureDetails());
                    boolean z8 = this.extractor != null || c1983k.f7358m == j;
                    AbstractC1101a.m2359j(z8);
                    c1983k.f7360o = 0;
                    i++;
                }
            }
            if (this.extractor == null) {
                String str = "None of the available extractors (" + new C0917e(", ").m2085b(AbstractC1006u.m2206u(new C0448j(3), AbstractC0983m0.m2166k(interfaceC1987nArrMo3870c))) + ") could read the stream.";
                uri.getClass();
                throw new UnrecognizedInputFormatException(str, uri, c0974j0.m2159f());
            }
        }
        this.extractor.init(interfaceC1989p);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(C1964a0 c1964a0) {
        InterfaceC1987n interfaceC1987n = this.extractor;
        interfaceC1987n.getClass();
        InterfaceC1988o interfaceC1988o = this.extractorInput;
        interfaceC1988o.getClass();
        return interfaceC1987n.read(interfaceC1988o, c1964a0);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        InterfaceC1987n interfaceC1987n = this.extractor;
        if (interfaceC1987n != null) {
            interfaceC1987n.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j8) {
        InterfaceC1987n interfaceC1987n = this.extractor;
        interfaceC1987n.getClass();
        interfaceC1987n.seek(j, j8);
    }
}
