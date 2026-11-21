package androidx.media3.exoplayer.source;

import android.media.MediaParser;
import androidx.media3.common.C0233q1;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.SampleQueue;
import p043e6.InterfaceC0916d;
import p063h1.InterfaceC1111f;
import p115n1.InterfaceC1987n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0448j implements InterfaceC0916d, InterfaceC1111f, ProgressiveMediaExtractor.Factory {

    /* renamed from: j */
    public final /* synthetic */ int f1842j;

    public /* synthetic */ C0448j(int i) {
        this.f1842j = i;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m969b(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    @Override // p063h1.InterfaceC1111f
    public void accept(Object obj) {
        switch (this.f1842j) {
            case 1:
                SampleQueue.lambda$new$0((SampleQueue.SharedSampleMetadata) obj);
                break;
            default:
                SpannedData.lambda$new$0(obj);
                break;
        }
    }

    @Override // p043e6.InterfaceC0916d
    public Object apply(Object obj) {
        switch (this.f1842j) {
            case 0:
                return MergingMediaPeriod.lambda$selectTracks$0((MediaPeriod) obj);
            case 3:
                return BundledExtractorsAdapter.lambda$init$0((InterfaceC1987n) obj);
            default:
                return TrackGroupArray.lambda$getTrackTypes$0((C0233q1) obj);
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return MediaParserExtractorAdapter.lambda$static$0(playerId);
    }
}
