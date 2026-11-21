package androidx.media3.exoplayer.offline;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface Downloader {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface ProgressListener {
        void onProgress(long j, long j8, float f8);
    }

    void cancel();

    void download(ProgressListener progressListener);

    void remove();
}
