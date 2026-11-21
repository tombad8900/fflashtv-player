package androidx.media3.exoplayer.dash;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;
import p063h1.AbstractC1118i0;
import p106m1.C1872g;
import p208y1.C2795c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private final C0249w upstreamFormat;
    private final C2795c eventMessageEncoder = new C2795c();
    private long pendingSeekPositionUs = -9223372036854775807L;

    public EventSampleStream(EventStream eventStream, C0249w c0249w, boolean z7) {
        this.upstreamFormat = c0249w;
        this.eventStream = eventStream;
        this.eventTimesUs = eventStream.presentationTimesUs;
        updateEventStream(eventStream, z7);
    }

    public String eventStreamId() {
        return this.eventStream.m875id();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() {
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, C1872g c1872g, int i) throws IOException {
        int i4 = this.currentIndex;
        boolean z7 = i4 == this.eventTimesUs.length;
        if (z7 && !this.eventStreamAppendable) {
            c1872g.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        }
        if (z7) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.currentIndex = i4 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrM4906a = this.eventMessageEncoder.m4906a(this.eventStream.events[i4]);
            c1872g.ensureSpaceForWrite(bArrM4906a.length);
            c1872g.data.put(bArrM4906a);
        }
        c1872g.timeUs = this.eventTimesUs[i4];
        c1872g.setFlags(1);
        return -4;
    }

    public void seekToUs(long j) {
        int iM2436a = AbstractC1118i0.m2436a(this.eventTimesUs, j, true);
        this.currentIndex = iM2436a;
        if (!this.eventStreamAppendable || iM2436a != this.eventTimesUs.length) {
            j = -9223372036854775807L;
        }
        this.pendingSeekPositionUs = j;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        int iMax = Math.max(this.currentIndex, AbstractC1118i0.m2436a(this.eventTimesUs, j, true));
        int i = iMax - this.currentIndex;
        this.currentIndex = iMax;
        return i;
    }

    public void updateEventStream(EventStream eventStream, boolean z7) {
        int i = this.currentIndex;
        long j = i == 0 ? -9223372036854775807L : this.eventTimesUs[i - 1];
        this.eventStreamAppendable = z7;
        this.eventStream = eventStream;
        long[] jArr = eventStream.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j8 = this.pendingSeekPositionUs;
        if (j8 != -9223372036854775807L) {
            seekToUs(j8);
        } else if (j != -9223372036854775807L) {
            this.currentIndex = AbstractC1118i0.m2436a(jArr, j, false);
        }
    }
}
