package androidx.media3.exoplayer.image;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import p106m1.C1872g;
import p106m1.InterfaceC1869d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ImageDecoder extends InterfaceC1869d {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Factory {
        public static final Factory DEFAULT = new BitmapFactoryImageDecoder.Factory();

        ImageDecoder createImageDecoder();

        int supportsFormat(C0249w c0249w);
    }

    @Override // p106m1.InterfaceC1869d
    /* synthetic */ Object dequeueInputBuffer();

    ImageOutputBuffer dequeueOutputBuffer();

    @Override // p106m1.InterfaceC1869d
    /* synthetic */ void flush();

    /* synthetic */ String getName();

    @Override // p106m1.InterfaceC1869d
    void queueInputBuffer(C1872g c1872g);

    @Override // p106m1.InterfaceC1869d
    /* synthetic */ void release();

    @Override // p106m1.InterfaceC1869d
    /* synthetic */ void setOutputStartTimeUs(long j);
}
