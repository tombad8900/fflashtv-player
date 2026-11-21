package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.source.MediaSource;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p063h1.AbstractC1101a;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ImageRenderer extends BaseRenderer {
    private static final long IMAGE_PRESENTATION_WINDOW_THRESHOLD_US = 30000;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM_THEN_WAIT = 2;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 3;
    private static final String TAG = "ImageRenderer";
    private int currentTileIndex;
    private ImageDecoder decoder;
    private final ImageDecoder.Factory decoderFactory;
    private int decoderReinitializationState;
    private int firstFrameState;
    private final C1872g flagsOnlyBuffer;
    private ImageOutput imageOutput;
    private C1872g inputBuffer;
    private C0249w inputFormat;
    private boolean inputStreamEnded;
    private long largestQueuedPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;
    private TileInfo nextTileInfo;
    private Bitmap outputBitmap;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private boolean readyToOutputTiles;
    private TileInfo tileInfo;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L);
        public final long previousStreamLastBufferTimeUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j, long j8) {
            this.previousStreamLastBufferTimeUs = j;
            this.streamOffsetUs = j8;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class TileInfo {
        private final long presentationTimeUs;
        private Bitmap tileBitmap;
        private final int tileIndex;

        public TileInfo(int i, long j) {
            this.tileIndex = i;
            this.presentationTimeUs = j;
        }

        public long getPresentationTimeUs() {
            return this.presentationTimeUs;
        }

        public Bitmap getTileBitmap() {
            return this.tileBitmap;
        }

        public int getTileIndex() {
            return this.tileIndex;
        }

        public boolean hasTileBitmap() {
            return this.tileBitmap != null;
        }

        public void setTileBitmap(Bitmap bitmap) {
            this.tileBitmap = bitmap;
        }
    }

    public ImageRenderer(ImageDecoder.Factory factory, ImageOutput imageOutput) {
        super(4);
        this.decoderFactory = factory;
        this.imageOutput = getImageOutput(imageOutput);
        this.flagsOnlyBuffer = C1872g.newNoDataInstance();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.decoderReinitializationState = 0;
        this.firstFrameState = 1;
    }

    private boolean canCreateDecoderForFormat(C0249w c0249w) {
        int iSupportsFormat = this.decoderFactory.supportsFormat(c0249w);
        return iSupportsFormat == RendererCapabilities.create(4) || iSupportsFormat == RendererCapabilities.create(3);
    }

    private Bitmap cropTileFromImageGrid(int i) {
        AbstractC1101a.m2360k(this.outputBitmap);
        int width = this.outputBitmap.getWidth();
        C0249w c0249w = this.inputFormat;
        AbstractC1101a.m2360k(c0249w);
        int i4 = width / c0249w.f1505J;
        int height = this.outputBitmap.getHeight();
        C0249w c0249w2 = this.inputFormat;
        AbstractC1101a.m2360k(c0249w2);
        int i8 = height / c0249w2.f1506K;
        int i9 = this.inputFormat.f1505J;
        return Bitmap.createBitmap(this.outputBitmap, (i % i9) * i4, (i / i9) * i8, i4, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean drainOutput(long j, long j8) throws ExoPlaybackException {
        Bitmap tileBitmap;
        Bitmap bitmapCropTileFromImageGrid;
        if ((this.outputBitmap == null || this.tileInfo != null) && (this.firstFrameState != 0 || getState() == 2)) {
            if (this.outputBitmap == null) {
                AbstractC1101a.m2360k(this.decoder);
                ImageOutputBuffer imageOutputBufferDequeueOutputBuffer = this.decoder.dequeueOutputBuffer();
                if (imageOutputBufferDequeueOutputBuffer != null) {
                    if (!imageOutputBufferDequeueOutputBuffer.isEndOfStream()) {
                        AbstractC1101a.m2361l("Non-EOS buffer came back from the decoder without bitmap.", imageOutputBufferDequeueOutputBuffer.bitmap);
                        this.outputBitmap = imageOutputBufferDequeueOutputBuffer.bitmap;
                        imageOutputBufferDequeueOutputBuffer.release();
                        if (this.readyToOutputTiles && this.outputBitmap != null && this.tileInfo != null) {
                            AbstractC1101a.m2360k(this.inputFormat);
                            C0249w c0249w = this.inputFormat;
                            int i = c0249w.f1505J;
                            int i4 = c0249w.f1506K;
                            boolean z7 = ((i != 1 && i4 == 1) || i == -1 || i4 == -1) ? false : true;
                            if (!this.tileInfo.hasTileBitmap()) {
                                TileInfo tileInfo = this.tileInfo;
                                if (z7) {
                                    bitmapCropTileFromImageGrid = cropTileFromImageGrid(tileInfo.getTileIndex());
                                } else {
                                    bitmapCropTileFromImageGrid = this.outputBitmap;
                                    AbstractC1101a.m2360k(bitmapCropTileFromImageGrid);
                                }
                                tileInfo.setTileBitmap(bitmapCropTileFromImageGrid);
                            }
                            tileBitmap = this.tileInfo.getTileBitmap();
                            AbstractC1101a.m2360k(tileBitmap);
                            if (processOutputBuffer(j, j8, tileBitmap, this.tileInfo.getPresentationTimeUs())) {
                                TileInfo tileInfo2 = this.tileInfo;
                                AbstractC1101a.m2360k(tileInfo2);
                                onProcessedOutputBuffer(tileInfo2.getPresentationTimeUs());
                                this.firstFrameState = 3;
                                if (z7) {
                                    TileInfo tileInfo3 = this.tileInfo;
                                    AbstractC1101a.m2360k(tileInfo3);
                                    int tileIndex = tileInfo3.getTileIndex();
                                    C0249w c0249w2 = this.inputFormat;
                                    AbstractC1101a.m2360k(c0249w2);
                                    int i8 = c0249w2.f1506K;
                                    C0249w c0249w3 = this.inputFormat;
                                    AbstractC1101a.m2360k(c0249w3);
                                    if (tileIndex == (i8 * c0249w3.f1505J) - 1) {
                                        this.outputBitmap = null;
                                    }
                                }
                                this.tileInfo = this.nextTileInfo;
                                this.nextTileInfo = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.decoderReinitializationState == 3) {
                            releaseDecoderResources();
                            AbstractC1101a.m2360k(this.inputFormat);
                            initDecoder();
                            return false;
                        }
                        imageOutputBufferDequeueOutputBuffer.release();
                        if (this.pendingOutputStreamChanges.isEmpty()) {
                            this.outputStreamEnded = true;
                            return false;
                        }
                    }
                }
            } else if (this.readyToOutputTiles) {
                AbstractC1101a.m2360k(this.inputFormat);
                C0249w c0249w4 = this.inputFormat;
                int i9 = c0249w4.f1505J;
                int i42 = c0249w4.f1506K;
                if (i9 != 1) {
                    if (!this.tileInfo.hasTileBitmap()) {
                    }
                    tileBitmap = this.tileInfo.getTileBitmap();
                    AbstractC1101a.m2360k(tileBitmap);
                    if (processOutputBuffer(j, j8, tileBitmap, this.tileInfo.getPresentationTimeUs())) {
                    }
                } else {
                    if (!this.tileInfo.hasTileBitmap()) {
                    }
                    tileBitmap = this.tileInfo.getTileBitmap();
                    AbstractC1101a.m2360k(tileBitmap);
                    if (processOutputBuffer(j, j8, tileBitmap, this.tileInfo.getPresentationTimeUs())) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean feedInputBuffer(long j) {
        boolean z7;
        if (!this.readyToOutputTiles || this.tileInfo == null) {
            FormatHolder formatHolder = getFormatHolder();
            ImageDecoder imageDecoder = this.decoder;
            if (imageDecoder != null && this.decoderReinitializationState != 3 && !this.inputStreamEnded) {
                if (this.inputBuffer == null) {
                    C1872g c1872g = (C1872g) imageDecoder.dequeueInputBuffer();
                    this.inputBuffer = c1872g;
                    if (c1872g != null) {
                        if (this.decoderReinitializationState == 2) {
                            AbstractC1101a.m2360k(this.inputBuffer);
                            this.inputBuffer.setFlags(4);
                            ImageDecoder imageDecoder2 = this.decoder;
                            AbstractC1101a.m2360k(imageDecoder2);
                            imageDecoder2.queueInputBuffer(this.inputBuffer);
                            this.inputBuffer = null;
                            this.decoderReinitializationState = 3;
                            return false;
                        }
                        int source = readSource(formatHolder, this.inputBuffer, 0);
                        if (source == -5) {
                            C0249w c0249w = formatHolder.format;
                            AbstractC1101a.m2360k(c0249w);
                            this.inputFormat = c0249w;
                            this.decoderReinitializationState = 2;
                            return true;
                        }
                        if (source == -4) {
                            this.inputBuffer.flip();
                            ByteBuffer byteBuffer = this.inputBuffer.data;
                            if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                                C1872g c1872g2 = this.inputBuffer;
                                AbstractC1101a.m2360k(c1872g2);
                                z7 = c1872g2.isEndOfStream();
                            }
                            if (z7) {
                                ImageDecoder imageDecoder3 = this.decoder;
                                AbstractC1101a.m2360k(imageDecoder3);
                                C1872g c1872g3 = this.inputBuffer;
                                AbstractC1101a.m2360k(c1872g3);
                                imageDecoder3.queueInputBuffer(c1872g3);
                                this.currentTileIndex = 0;
                            }
                            C1872g c1872g4 = this.inputBuffer;
                            AbstractC1101a.m2360k(c1872g4);
                            maybeAdvanceTileInfo(j, c1872g4);
                            C1872g c1872g5 = this.inputBuffer;
                            AbstractC1101a.m2360k(c1872g5);
                            if (c1872g5.isEndOfStream()) {
                                this.inputStreamEnded = true;
                                this.inputBuffer = null;
                                return false;
                            }
                            long j8 = this.largestQueuedPresentationTimeUs;
                            C1872g c1872g6 = this.inputBuffer;
                            AbstractC1101a.m2360k(c1872g6);
                            this.largestQueuedPresentationTimeUs = Math.max(j8, c1872g6.timeUs);
                            if (z7) {
                                this.inputBuffer = null;
                            } else {
                                C1872g c1872g7 = this.inputBuffer;
                                AbstractC1101a.m2360k(c1872g7);
                                c1872g7.clear();
                            }
                            return !this.readyToOutputTiles;
                        }
                        if (source != -3) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
        }
        return false;
    }

    private static ImageOutput getImageOutput(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.NO_OP : imageOutput;
    }

    @EnsuresNonNull({"decoder"})
    @RequiresNonNull({"inputFormat"})
    private void initDecoder() throws ExoPlaybackException {
        if (!canCreateDecoderForFormat(this.inputFormat)) {
            throw createRendererException(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.inputFormat, C0253x0.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED);
        }
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.release();
        }
        this.decoder = this.decoderFactory.createImageDecoder();
    }

    private boolean isTileLastInGrid(TileInfo tileInfo) {
        C0249w c0249w = this.inputFormat;
        AbstractC1101a.m2360k(c0249w);
        if (c0249w.f1505J != -1 && this.inputFormat.f1506K != -1) {
            int tileIndex = tileInfo.getTileIndex();
            C0249w c0249w2 = this.inputFormat;
            AbstractC1101a.m2360k(c0249w2);
            if (tileIndex != (c0249w2.f1506K * this.inputFormat.f1505J) - 1) {
                return false;
            }
        }
        return true;
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = Math.min(this.firstFrameState, i);
    }

    private void maybeAdvanceTileInfo(long j, C1872g c1872g) {
        boolean z7 = true;
        if (c1872g.isEndOfStream()) {
            this.readyToOutputTiles = true;
            return;
        }
        TileInfo tileInfo = new TileInfo(this.currentTileIndex, c1872g.timeUs);
        this.nextTileInfo = tileInfo;
        this.currentTileIndex++;
        if (!this.readyToOutputTiles) {
            long presentationTimeUs = tileInfo.getPresentationTimeUs();
            boolean z8 = presentationTimeUs - 30000 <= j && j <= 30000 + presentationTimeUs;
            TileInfo tileInfo2 = this.tileInfo;
            boolean z9 = tileInfo2 != null && tileInfo2.getPresentationTimeUs() <= j && j < presentationTimeUs;
            TileInfo tileInfo3 = this.nextTileInfo;
            AbstractC1101a.m2360k(tileInfo3);
            boolean zIsTileLastInGrid = isTileLastInGrid(tileInfo3);
            if (!z8 && !z9 && !zIsTileLastInGrid) {
                z7 = false;
            }
            this.readyToOutputTiles = z7;
            if (z9 && !z8) {
                return;
            }
        }
        this.tileInfo = this.nextTileInfo;
        this.nextTileInfo = null;
    }

    private void onProcessedOutputBuffer(long j) {
        this.lastProcessedOutputBufferTimeUs = j;
        while (!this.pendingOutputStreamChanges.isEmpty() && j >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.removeFirst();
        }
    }

    private void releaseDecoderResources() {
        this.inputBuffer = null;
        this.decoderReinitializationState = 0;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.release();
            this.decoder = null;
        }
    }

    private void setImageOutput(ImageOutput imageOutput) {
        this.imageOutput = getImageOutput(imageOutput);
    }

    private boolean shouldForceRender() {
        boolean z7 = getState() == 2;
        int i = this.firstFrameState;
        if (i == 0) {
            return z7;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i != 15) {
            super.handleMessage(i, obj);
        } else {
            setImageOutput(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        int i = this.firstFrameState;
        if (i != 3) {
            return i == 0 && this.readyToOutputTiles;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges.clear();
        releaseDecoderResources();
        this.imageOutput.onDisabled();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z7, boolean z8) {
        this.firstFrameState = z8 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z7) {
        lowerFirstFrameState(1);
        this.outputStreamEnded = false;
        this.inputStreamEnded = false;
        this.outputBitmap = null;
        this.tileInfo = null;
        this.nextTileInfo = null;
        this.readyToOutputTiles = false;
        this.inputBuffer = null;
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.flush();
        }
        this.pendingOutputStreamChanges.clear();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        releaseDecoderResources();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        releaseDecoderResources();
        lowerFirstFrameState(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStreamChanged(C0249w[] c0249wArr, long j, long j8, MediaSource.MediaPeriodId mediaPeriodId) {
        super.onStreamChanged(c0249wArr, j, j8, mediaPeriodId);
        if (this.outputStreamInfo.streamOffsetUs != -9223372036854775807L) {
            if (this.pendingOutputStreamChanges.isEmpty()) {
                long j9 = this.largestQueuedPresentationTimeUs;
                if (j9 != -9223372036854775807L) {
                    long j10 = this.lastProcessedOutputBufferTimeUs;
                    if (j10 != -9223372036854775807L) {
                    }
                }
            }
            this.pendingOutputStreamChanges.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j8));
            return;
        }
        this.outputStreamInfo = new OutputStreamInfo(-9223372036854775807L, j8);
    }

    public boolean processOutputBuffer(long j, long j8, Bitmap bitmap, long j9) {
        long j10 = j9 - j;
        if (!shouldForceRender() && j10 >= 30000) {
            return false;
        }
        this.imageOutput.onImageAvailable(j9 - this.outputStreamInfo.streamOffsetUs, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j8) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    AbstractC1101a.m2359j(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            C0249w c0249w = formatHolder.format;
            AbstractC1101a.m2360k(c0249w);
            this.inputFormat = c0249w;
            initDecoder();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (drainOutput(j, j8)) {
            }
            while (feedInputBuffer(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw createRendererException(e, null, C0253x0.ERROR_CODE_DECODING_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(C0249w c0249w) {
        return this.decoderFactory.supportsFormat(c0249w);
    }
}
