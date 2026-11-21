package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import p056g1.C1030c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.d1 */
/* loaded from: classes.dex */
public interface InterfaceC0193d1 {
    void addListener(InterfaceC0185b1 interfaceC0185b1);

    void addMediaItems(int i, List list);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    Looper getApplicationLooper();

    C0259z0 getAvailableCommands();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    C1030c getCurrentCues();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    AbstractC0230p1 getCurrentTimeline();

    C0254x1 getCurrentTracks();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    C0235r0 getMediaMetadata();

    boolean getPlayWhenReady();

    C0256y0 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    C0253x0 getPlayerError();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    C0248v1 getTrackSelectionParameters();

    C0194d2 getVideoSize();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItems(int i, int i4, int i8);

    void pause();

    void play();

    void prepare();

    void removeListener(InterfaceC0185b1 interfaceC0185b1);

    void removeMediaItems(int i, int i4);

    void replaceMediaItems(int i, int i4, List list);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToNext();

    void seekToPrevious();

    void setMediaItems(List list, int i, long j);

    void setMediaItems(List list, boolean z7);

    void setPlayWhenReady(boolean z7);

    void setPlaybackParameters(C0256y0 c0256y0);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z7);

    void setTrackSelectionParameters(C0248v1 c0248v1);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);
}
