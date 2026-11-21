package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0222n;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import com.bumptech.glide.AbstractC0714c;
import java.io.IOException;
import java.nio.ByteBuffer;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p106m1.AbstractC1875j;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class BitmapFactoryImageDecoder extends AbstractC1875j implements ImageDecoder {
    private final BitmapDecoder bitmapDecoder;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface BitmapDecoder {
        Bitmap decode(byte[] bArr, int i);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapDecoder bitmapDecoder;

        public Factory() {
            this.bitmapDecoder = new C0222n(13);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
        
            if (r0 >= 26) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
        
            if (r0 >= 34) goto L44;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int supportsFormat(C0249w c0249w) {
            String str = c0249w.f1522n;
            char c8 = 0;
            if (str == null || !AbstractC0244u0.m683l(str)) {
                return RendererCapabilities.create(0);
            }
            String str2 = c0249w.f1522n;
            int i = AbstractC1118i0.f4750a;
            str2.getClass();
            switch (str2.hashCode()) {
                case -1487656890:
                    if (!str2.equals("image/avif")) {
                        c8 = '\uffff';
                        break;
                    }
                    break;
                case -1487464693:
                    if (str2.equals("image/heic")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1487464690:
                    if (str2.equals("image/heif")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1487394660:
                    if (str2.equals("image/jpeg")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -1487018032:
                    if (str2.equals("image/webp")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case -879272239:
                    if (str2.equals("image/bmp")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case -879258763:
                    if (str2.equals("image/png")) {
                        c8 = 6;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 3:
                case 4:
                case 5:
                case 6:
                    return RendererCapabilities.create(4);
            }
            return RendererCapabilities.create(1);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.bitmapDecoder);
        }

        public Factory(BitmapDecoder bitmapDecoder) {
            this.bitmapDecoder = bitmapDecoder;
        }
    }

    public static /* synthetic */ Bitmap access$100(byte[] bArr, int i) {
        return decode(bArr, i);
    }

    @Override // p106m1.AbstractC1875j
    public C1872g createInputBuffer() {
        return new C1872g(1);
    }

    @Override // p106m1.AbstractC1875j, p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() {
        return (ImageOutputBuffer) dequeueOutputBuffer();
    }

    @Override // p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(BitmapDecoder bitmapDecoder) {
        super(new C1872g[1], new ImageOutputBuffer[1]);
        this.bitmapDecoder = bitmapDecoder;
    }

    @Override // p106m1.AbstractC1875j
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // p106m1.AbstractC1873h
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override // p106m1.AbstractC1875j
    public ImageDecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // p106m1.AbstractC1875j
    public ImageDecoderException decode(C1872g c1872g, ImageOutputBuffer imageOutputBuffer, boolean z7) {
        try {
            ByteBuffer byteBuffer = c1872g.data;
            byteBuffer.getClass();
            AbstractC1101a.m2359j(byteBuffer.hasArray());
            AbstractC1101a.m2353d(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.bitmap = this.bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            imageOutputBuffer.timeUs = c1872g.timeUs;
            return null;
        } catch (ImageDecoderException e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr, int i) throws ImageDecoderException {
        try {
            return AbstractC0714c.m1488A(bArr, i);
        } catch (C0247v0 e) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e8) {
            throw new ImageDecoderException(e8);
        }
    }
}
