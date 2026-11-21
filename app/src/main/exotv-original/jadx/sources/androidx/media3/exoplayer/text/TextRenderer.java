package androidx.media3.exoplayer.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p052f6.AbstractC0983m0;
import p052f6.C0981l1;
import p056g1.C1030c;
import p057g2.C1040d;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p090k2.AbstractC1596n;
import p090k2.C1583a;
import p090k2.C1585c;
import p090k2.C1592j;
import p090k2.C1595m;
import p090k2.InterfaceC1590h;
import p090k2.InterfaceC1591i;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 1;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private final C1583a cueDecoder;
    private final C1872g cueDecoderInputBuffer;
    private CuesResolver cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private boolean legacyDecodingEnabled;
    private AbstractC1596n nextSubtitle;
    private int nextSubtitleEventIndex;
    private C1595m nextSubtitleInputBuffer;
    private final TextOutput output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private IOException streamError;
    private C0249w streamFormat;
    private AbstractC1596n subtitle;
    private InterfaceC1591i subtitleDecoder;
    private final SubtitleDecoderFactory subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    public TextRenderer(TextOutput textOutput, Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.DEFAULT);
    }

    @RequiresNonNull({"streamFormat"})
    private void assertLegacyDecodingEnabledIfRequired() {
        AbstractC1101a.m2358i("Legacy decoding is disabled, can't handle " + this.streamFormat.f1522n + " samples (expected application/x-media3-cues).", this.legacyDecodingEnabled || Objects.equals(this.streamFormat.f1522n, "application/cea-608") || Objects.equals(this.streamFormat.f1522n, "application/x-mp4-cea-608") || Objects.equals(this.streamFormat.f1522n, "application/cea-708"));
    }

    private void clearOutput() {
        C0981l1 c0981l1 = C0981l1.f4211n;
        getPresentationTimeUs(this.lastRendererPositionUs);
        updateOutput(new C1030c(c0981l1));
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long getCurrentEventTimeUs(long j) {
        int iMo281c = this.subtitle.mo281c(j);
        if (iMo281c == 0 || this.subtitle.mo292n() == 0) {
            return this.subtitle.timeUs;
        }
        if (iMo281c != -1) {
            return this.subtitle.mo284f(iMo281c - 1);
        }
        return this.subtitle.mo284f(r2.mo292n() - 1);
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        this.subtitle.getClass();
        if (this.nextSubtitleEventIndex >= this.subtitle.mo292n()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.mo284f(this.nextSubtitleEventIndex);
    }

    @SideEffectFree
    private long getPresentationTimeUs(long j) {
        AbstractC1101a.m2359j(j != -9223372036854775807L);
        return j - getStreamOffsetUs();
    }

    private void handleDecoderError(C1592j c1592j) {
        AbstractC1101a.m2365p(TAG, "Subtitle decoding failed. streamFormat=" + this.streamFormat, c1592j);
        clearOutput();
        replaceSubtitleDecoder();
    }

    private static boolean hasNoEventsAfter(InterfaceC1590h interfaceC1590h, long j) {
        return interfaceC1590h == null || interfaceC1590h.mo284f(interfaceC1590h.mo292n() - 1) <= j;
    }

    private void initSubtitleDecoder() {
        this.waitingForKeyFrame = true;
        SubtitleDecoderFactory subtitleDecoderFactory = this.subtitleDecoderFactory;
        C0249w c0249w = this.streamFormat;
        c0249w.getClass();
        InterfaceC1591i interfaceC1591iCreateDecoder = subtitleDecoderFactory.createDecoder(c0249w);
        this.subtitleDecoder = interfaceC1591iCreateDecoder;
        interfaceC1591iCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    private void invokeUpdateOutputInternal(C1030c c1030c) {
        this.output.onCues(c1030c.f4388a);
        this.output.onCues(c1030c);
    }

    @SideEffectFree
    private static boolean isCuesWithTiming(C0249w c0249w) {
        return Objects.equals(c0249w.f1522n, "application/x-media3-cues");
    }

    @RequiresNonNull({"this.cuesResolver"})
    private boolean readAndDecodeCuesWithTiming(long j) {
        if (this.inputStreamEnded || readSource(this.formatHolder, this.cueDecoderInputBuffer, 0) != -4) {
            return false;
        }
        if (this.cueDecoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return false;
        }
        this.cueDecoderInputBuffer.flip();
        ByteBuffer byteBuffer = this.cueDecoderInputBuffer.data;
        byteBuffer.getClass();
        C1583a c1583a = this.cueDecoder;
        long j8 = this.cueDecoderInputBuffer.timeUs;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iLimit = byteBuffer.limit();
        c1583a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
        parcelableArrayList.getClass();
        C1585c c1585c = new C1585c(AbstractC1101a.m2366q(new C1040d(12), parcelableArrayList), j8, bundle.getLong("d"));
        this.cueDecoderInputBuffer.clear();
        return this.cuesResolver.addCues(c1585c, j);
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        AbstractC1596n abstractC1596n = this.subtitle;
        if (abstractC1596n != null) {
            abstractC1596n.release();
            this.subtitle = null;
        }
        AbstractC1596n abstractC1596n2 = this.nextSubtitle;
        if (abstractC1596n2 != null) {
            abstractC1596n2.release();
            this.nextSubtitle = null;
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        InterfaceC1591i interfaceC1591i = this.subtitleDecoder;
        interfaceC1591i.getClass();
        interfaceC1591i.release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    @RequiresNonNull({"this.cuesResolver"})
    private void renderFromCuesWithTiming(long j) {
        boolean andDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j);
        long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.inputStreamEnded && !andDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j) {
            andDecodeCuesWithTiming = true;
        }
        if (andDecodeCuesWithTiming) {
            AbstractC0983m0 cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j);
            long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j);
            getPresentationTimeUs(previousCueChangeTimeUs);
            updateOutput(new C1030c(cuesAtTimeUs));
            this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.lastRendererPositionUs = j;
    }

    private void renderFromSubtitles(long j) {
        boolean z7;
        this.lastRendererPositionUs = j;
        if (this.nextSubtitle == null) {
            InterfaceC1591i interfaceC1591i = this.subtitleDecoder;
            interfaceC1591i.getClass();
            interfaceC1591i.setPositionUs(j);
            try {
                InterfaceC1591i interfaceC1591i2 = this.subtitleDecoder;
                interfaceC1591i2.getClass();
                this.nextSubtitle = (AbstractC1596n) interfaceC1591i2.dequeueOutputBuffer();
            } catch (C1592j e) {
                handleDecoderError(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z7 = false;
            while (nextEventTime <= j) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z7 = true;
            }
        } else {
            z7 = false;
        }
        AbstractC1596n abstractC1596n = this.nextSubtitle;
        if (abstractC1596n != null) {
            if (abstractC1596n.isEndOfStream()) {
                if (!z7 && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.decoderReplacementState == 2) {
                        replaceSubtitleDecoder();
                    } else {
                        releaseSubtitleBuffers();
                        this.outputStreamEnded = true;
                    }
                }
            } else if (abstractC1596n.timeUs <= j) {
                AbstractC1596n abstractC1596n2 = this.subtitle;
                if (abstractC1596n2 != null) {
                    abstractC1596n2.release();
                }
                this.nextSubtitleEventIndex = abstractC1596n.mo281c(j);
                this.subtitle = abstractC1596n;
                this.nextSubtitle = null;
                z7 = true;
            }
        }
        if (z7) {
            this.subtitle.getClass();
            getPresentationTimeUs(getCurrentEventTimeUs(j));
            updateOutput(new C1030c(this.subtitle.mo291m(j)));
        }
        if (this.decoderReplacementState == 2) {
            return;
        }
        while (!this.inputStreamEnded) {
            try {
                C1595m c1595m = this.nextSubtitleInputBuffer;
                if (c1595m == null) {
                    InterfaceC1591i interfaceC1591i3 = this.subtitleDecoder;
                    interfaceC1591i3.getClass();
                    c1595m = (C1595m) interfaceC1591i3.dequeueInputBuffer();
                    if (c1595m == null) {
                        return;
                    } else {
                        this.nextSubtitleInputBuffer = c1595m;
                    }
                }
                if (this.decoderReplacementState == 1) {
                    c1595m.setFlags(4);
                    InterfaceC1591i interfaceC1591i4 = this.subtitleDecoder;
                    interfaceC1591i4.getClass();
                    interfaceC1591i4.queueInputBuffer(c1595m);
                    this.nextSubtitleInputBuffer = null;
                    this.decoderReplacementState = 2;
                    return;
                }
                int source = readSource(this.formatHolder, c1595m, 0);
                if (source == -4) {
                    if (c1595m.isEndOfStream()) {
                        this.inputStreamEnded = true;
                        this.waitingForKeyFrame = false;
                    } else {
                        C0249w c0249w = this.formatHolder.format;
                        if (c0249w == null) {
                            return;
                        }
                        c1595m.f6074j = c0249w.f1527s;
                        c1595m.flip();
                        this.waitingForKeyFrame &= !c1595m.isKeyFrame();
                    }
                    if (!this.waitingForKeyFrame) {
                        InterfaceC1591i interfaceC1591i5 = this.subtitleDecoder;
                        interfaceC1591i5.getClass();
                        interfaceC1591i5.queueInputBuffer(c1595m);
                        this.nextSubtitleInputBuffer = null;
                    }
                } else if (source == -3) {
                    return;
                }
            } catch (C1592j e8) {
                handleDecoderError(e8);
                return;
            }
        }
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    private void updateOutput(C1030c c1030c) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, c1030c).sendToTarget();
        } else {
            invokeUpdateOutputInternal(c1030c);
        }
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z7) {
        this.legacyDecodingEnabled = z7;
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
        invokeUpdateOutputInternal((C1030c) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.streamFormat == null) {
            return true;
        }
        if (this.streamError == null) {
            try {
                maybeThrowStreamError();
            } catch (IOException e) {
                this.streamError = e;
            }
        }
        if (this.streamError != null) {
            C0249w c0249w = this.streamFormat;
            c0249w.getClass();
            if (isCuesWithTiming(c0249w)) {
                CuesResolver cuesResolver = this.cuesResolver;
                cuesResolver.getClass();
                return cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs) != Long.MIN_VALUE;
            }
            if (this.outputStreamEnded || (this.inputStreamEnded && hasNoEventsAfter(this.subtitle, this.lastRendererPositionUs) && hasNoEventsAfter(this.nextSubtitle, this.lastRendererPositionUs) && this.nextSubtitleInputBuffer != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        clearOutput();
        this.lastRendererPositionUs = -9223372036854775807L;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z7) {
        this.lastRendererPositionUs = j;
        CuesResolver cuesResolver = this.cuesResolver;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        C0249w c0249w = this.streamFormat;
        if (c0249w == null || isCuesWithTiming(c0249w)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        InterfaceC1591i interfaceC1591i = this.subtitleDecoder;
        interfaceC1591i.getClass();
        interfaceC1591i.flush();
        interfaceC1591i.setOutputStartTimeUs(getLastResetPositionUs());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(C0249w[] c0249wArr, long j, long j8, MediaSource.MediaPeriodId mediaPeriodId) {
        C0249w c0249w = c0249wArr[0];
        this.streamFormat = c0249w;
        if (isCuesWithTiming(c0249w)) {
            this.cuesResolver = this.streamFormat.f1504I == 1 ? new MergingCuesResolver() : new ReplacingCuesResolver();
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.subtitleDecoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j8) {
        if (isCurrentStreamFinal()) {
            long j9 = this.finalStreamEndPositionUs;
            if (j9 != -9223372036854775807L && j >= j9) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        C0249w c0249w = this.streamFormat;
        c0249w.getClass();
        if (isCuesWithTiming(c0249w)) {
            this.cuesResolver.getClass();
            renderFromCuesWithTiming(j);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j);
        }
    }

    public void setFinalStreamEndPositionUs(long j) {
        AbstractC1101a.m2359j(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(C0249w c0249w) {
        if (isCuesWithTiming(c0249w) || this.subtitleDecoderFactory.supportsFormat(c0249w)) {
            return RendererCapabilities.create(c0249w.f1507L == 0 ? 4 : 2);
        }
        return AbstractC0244u0.m685n(c0249w.f1522n) ? RendererCapabilities.create(1) : RendererCapabilities.create(0);
    }

    public TextRenderer(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        Handler handler;
        super(3);
        textOutput.getClass();
        this.output = textOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i = AbstractC1118i0.f4750a;
            handler = new Handler(looper, this);
        }
        this.outputHandler = handler;
        this.subtitleDecoderFactory = subtitleDecoderFactory;
        this.cueDecoder = new C1583a();
        this.cueDecoderInputBuffer = new C1872g(1);
        this.formatHolder = new FormatHolder();
        this.finalStreamEndPositionUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
        this.legacyDecodingEnabled = false;
    }
}
