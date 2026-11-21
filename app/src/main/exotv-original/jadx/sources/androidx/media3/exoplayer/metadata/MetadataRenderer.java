package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p171t5.AbstractC2436a;
import p192w1.C2600b;
import p192w1.InterfaceC2599a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 1;
    private static final String TAG = "MetadataRenderer";
    private final C2600b buffer;
    private InterfaceC2599a decoder;
    private final MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final MetadataOutput output;
    private final Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private C0241t0 pendingMetadata;
    private long subsampleOffsetUs;

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.DEFAULT);
    }

    private void decodeWrappedMetadata(C0241t0 c0241t0, List<InterfaceC0238s0> list) {
        int i = 0;
        while (true) {
            InterfaceC0238s0[] interfaceC0238s0Arr = c0241t0.f1412j;
            if (i >= interfaceC0238s0Arr.length) {
                return;
            }
            C0249w wrappedMetadataFormat = interfaceC0238s0Arr[i].getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                list.add(interfaceC0238s0Arr[i]);
            } else {
                InterfaceC2599a interfaceC2599aCreateDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] wrappedMetadataBytes = interfaceC0238s0Arr[i].getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(wrappedMetadataBytes.length);
                ByteBuffer byteBuffer = this.buffer.data;
                int i4 = AbstractC1118i0.f4750a;
                byteBuffer.put(wrappedMetadataBytes);
                this.buffer.flip();
                C0241t0 c0241t0M4347c = ((AbstractC2436a) interfaceC2599aCreateDecoder).m4347c(this.buffer);
                if (c0241t0M4347c != null) {
                    decodeWrappedMetadata(c0241t0M4347c, list);
                }
            }
            i++;
        }
    }

    @SideEffectFree
    private long getPresentationTimeUs(long j) {
        AbstractC1101a.m2359j(j != -9223372036854775807L);
        AbstractC1101a.m2359j(this.outputStreamOffsetUs != -9223372036854775807L);
        return j - this.outputStreamOffsetUs;
    }

    private void invokeRenderer(C0241t0 c0241t0) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, c0241t0).sendToTarget();
        } else {
            invokeRendererInternal(c0241t0);
        }
    }

    private void invokeRendererInternal(C0241t0 c0241t0) {
        this.output.onMetadata(c0241t0);
    }

    private boolean outputMetadata(long j) {
        boolean z7;
        C0241t0 c0241t0 = this.pendingMetadata;
        if (c0241t0 == null || (!this.outputMetadataEarly && c0241t0.f1413k > getPresentationTimeUs(j))) {
            z7 = false;
        } else {
            invokeRenderer(this.pendingMetadata);
            this.pendingMetadata = null;
            z7 = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z7;
    }

    private void readMetadata() {
        if (this.inputStreamEnded || this.pendingMetadata != null) {
            return;
        }
        this.buffer.clear();
        FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.buffer, 0);
        if (source != -4) {
            if (source == -5) {
                C0249w c0249w = formatHolder.format;
                c0249w.getClass();
                this.subsampleOffsetUs = c0249w.f1527s;
                return;
            }
            return;
        }
        if (this.buffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return;
        }
        if (this.buffer.timeUs >= getLastResetPositionUs()) {
            C2600b c2600b = this.buffer;
            c2600b.f9349j = this.subsampleOffsetUs;
            c2600b.flip();
            InterfaceC2599a interfaceC2599a = this.decoder;
            int i = AbstractC1118i0.f4750a;
            C0241t0 c0241t0M4347c = ((AbstractC2436a) interfaceC2599a).m4347c(this.buffer);
            if (c0241t0M4347c != null) {
                ArrayList arrayList = new ArrayList(c0241t0M4347c.f1412j.length);
                decodeWrappedMetadata(c0241t0M4347c, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.pendingMetadata = new C0241t0(getPresentationTimeUs(this.buffer.timeUs), (InterfaceC0238s0[]) arrayList.toArray(new InterfaceC0238s0[0]));
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        invokeRendererInternal((C0241t0) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z7) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(C0249w[] c0249wArr, long j, long j8, MediaSource.MediaPeriodId mediaPeriodId) {
        this.decoder = this.decoderFactory.createDecoder(c0249wArr[0]);
        C0241t0 c0241t0 = this.pendingMetadata;
        if (c0241t0 != null) {
            long j9 = c0241t0.f1413k;
            long j10 = (this.outputStreamOffsetUs + j9) - j8;
            if (j9 != j10) {
                c0241t0 = new C0241t0(j10, c0241t0.f1412j);
            }
            this.pendingMetadata = c0241t0;
        }
        this.outputStreamOffsetUs = j8;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j8) {
        boolean zOutputMetadata = true;
        while (zOutputMetadata) {
            readMetadata();
            zOutputMetadata = outputMetadata(j);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(C0249w c0249w) {
        if (this.decoderFactory.supportsFormat(c0249w)) {
            return RendererCapabilities.create(c0249w.f1507L == 0 ? 4 : 2);
        }
        return RendererCapabilities.create(0);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        this(metadataOutput, looper, metadataDecoderFactory, false);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory, boolean z7) {
        Handler handler;
        super(5);
        metadataOutput.getClass();
        this.output = metadataOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i = AbstractC1118i0.f4750a;
            handler = new Handler(looper, this);
        }
        this.outputHandler = handler;
        metadataDecoderFactory.getClass();
        this.decoderFactory = metadataDecoderFactory;
        this.outputMetadataEarly = z7;
        this.buffer = new C2600b(1);
        this.outputStreamOffsetUs = -9223372036854775807L;
    }
}
