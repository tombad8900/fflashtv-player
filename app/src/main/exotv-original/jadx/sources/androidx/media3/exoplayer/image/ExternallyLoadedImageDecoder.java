package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.session.AbstractC0120b;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p063h1.AbstractC1101a;
import p085j6.InterfaceFutureC1529s;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ExternallyLoadedImageDecoder implements ImageDecoder {
    private final BitmapResolver bitmapResolver;
    private final C1872g inputBuffer;
    private final ImageOutputBuffer outputBuffer;
    private InterfaceFutureC1529s pendingDecode;
    private long pendingDecodeTimeUs;
    private boolean pendingEndOfStream;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface BitmapResolver {
        InterfaceFutureC1529s resolve(ExternalImageRequest externalImageRequest);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ExternalImageRequest {
        public final Uri uri;

        public ExternalImageRequest(Uri uri) {
            this.uri = uri;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapResolver bitmapResolver;

        public Factory(BitmapResolver bitmapResolver) {
            this.bitmapResolver = bitmapResolver;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(C0249w c0249w) {
            return RendererCapabilities.create(Objects.equals(c0249w.f1522n, "application/x-image-uri") ? 4 : AbstractC0244u0.m683l(c0249w.f1522n) ? 1 : 0);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public ExternallyLoadedImageDecoder createImageDecoder() {
            return new ExternallyLoadedImageDecoder(this.bitmapResolver);
        }
    }

    private void resetState() {
        InterfaceFutureC1529s interfaceFutureC1529s = this.pendingDecode;
        if (interfaceFutureC1529s != null) {
            interfaceFutureC1529s.cancel(false);
            this.pendingDecode = null;
        }
        this.pendingEndOfStream = false;
        this.outputBuffer.release();
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, p106m1.InterfaceC1869d
    public void flush() {
        resetState();
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder
    public String getName() {
        return "externallyLoadedImageDecoder";
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, p106m1.InterfaceC1869d
    public void release() {
        resetState();
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, p106m1.InterfaceC1869d
    public void setOutputStartTimeUs(long j) {
    }

    private ExternallyLoadedImageDecoder(BitmapResolver bitmapResolver) {
        this.bitmapResolver = bitmapResolver;
        this.inputBuffer = new C1872g(1);
        this.outputBuffer = new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.ExternallyLoadedImageDecoder.1
            @Override // p106m1.AbstractC1873h
            public void release() {
                clear();
            }
        };
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, p106m1.InterfaceC1869d
    public C1872g dequeueInputBuffer() {
        if (this.pendingDecode == null) {
            return this.inputBuffer;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    public ImageOutputBuffer dequeueOutputBuffer() {
        if (this.pendingEndOfStream) {
            this.outputBuffer.addFlag(4);
            this.pendingEndOfStream = false;
            return this.outputBuffer;
        }
        InterfaceFutureC1529s interfaceFutureC1529s = this.pendingDecode;
        if (interfaceFutureC1529s != null) {
            try {
                if (interfaceFutureC1529s.isDone()) {
                    try {
                        this.outputBuffer.bitmap = (Bitmap) AbstractC0120b.m425u(this.pendingDecode);
                        ImageOutputBuffer imageOutputBuffer = this.outputBuffer;
                        imageOutputBuffer.timeUs = this.pendingDecodeTimeUs;
                        return imageOutputBuffer;
                    } catch (CancellationException e) {
                        throw new ImageDecoderException(e);
                    } catch (ExecutionException e8) {
                        throw new ImageDecoderException(e8.getCause());
                    }
                }
            } finally {
                this.pendingDecode = null;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, p106m1.InterfaceC1869d
    public void queueInputBuffer(C1872g c1872g) {
        if (c1872g.isEndOfStream()) {
            this.pendingEndOfStream = true;
            c1872g.clear();
            return;
        }
        ByteBuffer byteBuffer = c1872g.data;
        byteBuffer.getClass();
        AbstractC1101a.m2359j(byteBuffer.hasArray());
        this.pendingDecode = this.bitmapResolver.resolve(new ExternalImageRequest(Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8))));
        this.pendingDecodeTimeUs = c1872g.timeUs;
        c1872g.clear();
    }
}
