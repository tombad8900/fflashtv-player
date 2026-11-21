package androidx.media3.exoplayer.dash.manifest;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j, long j8, long j9, float f8, float f9) {
        this.targetOffsetMs = j;
        this.minOffsetMs = j8;
        this.maxOffsetMs = j9;
        this.minPlaybackSpeed = f8;
        this.maxPlaybackSpeed = f9;
    }
}
