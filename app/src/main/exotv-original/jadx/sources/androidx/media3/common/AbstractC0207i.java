package androidx.media3.common;

import java.util.List;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.i */
/* loaded from: classes.dex */
public abstract class AbstractC0207i implements InterfaceC0193d1 {
    protected final C0227o1 window = new C0227o1();

    /* renamed from: a */
    public final void m623a(int i) {
        seekTo(-1, -9223372036854775807L, i, false);
    }

    public final void addMediaItem(int i, C0226o0 c0226o0) {
        addMediaItems(i, AbstractC0983m0.m2168n(c0226o0));
    }

    public final void addMediaItems(List<C0226o0> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    /* renamed from: b */
    public final void m624b(int i) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            m623a(i);
        } else if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, i, true);
        } else {
            seekTo(previousMediaItemIndex, -9223372036854775807L, i, false);
        }
    }

    public final boolean canAdvertiseSession() {
        return true;
    }

    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return AbstractC1118i0.m2451j((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final long getContentDuration() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        return AbstractC1118i0.m2447f0(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1272m);
    }

    public final long getCurrentLiveOffset() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1265f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (AbstractC1118i0.m2412C(this.window.f1266g) - this.window.f1265f) - getContentPosition();
    }

    public final Object getCurrentManifest() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1263d;
    }

    public final C0226o0 getCurrentMediaItem() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1262c;
    }

    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    public final C0226o0 getMediaItemAt(int i) {
        return getCurrentTimeline().getWindow(i, this.window).f1262c;
    }

    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    public final int getNextMediaItemIndex() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getNextWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    public final int getPreviousMediaItemIndex() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getPreviousWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().f1557a.f1421a.get(i);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final boolean isCurrentMediaItemDynamic() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1268i;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final boolean isCurrentMediaItemLive() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).m654a();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final boolean isCurrentMediaItemSeekable() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1267h;
    }

    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    public final void moveMediaItem(int i, int i4) {
        if (i != i4) {
            moveMediaItems(i, i + 1, i4);
        }
    }

    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void play() {
        setPlayWhenReady(true);
    }

    public final void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    public final void replaceMediaItem(int i, C0226o0 c0226o0) {
        replaceMediaItems(i, i + 1, AbstractC0983m0.m2168n(c0226o0));
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void seekBack() {
        long currentPosition = getCurrentPosition() + (-getSeekBackIncrement());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), 11, false);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void seekForward() {
        long currentPosition = getCurrentPosition() + getSeekForwardIncrement();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), 12, false);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void seekTo(int i, long j) {
        seekTo(i, j, 10, false);
    }

    public abstract void seekTo(int i, long j, int i4, boolean z7);

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void seekToDefaultPosition() {
        seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 4, false);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            m623a(9);
            return;
        }
        if (!hasNextMediaItem()) {
            if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 9, false);
                return;
            } else {
                m623a(9);
                return;
            }
        }
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            m623a(9);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 9, true);
        } else {
            seekTo(nextMediaItemIndex, -9223372036854775807L, 9, false);
        }
    }

    public final void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            m623a(8);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 8, true);
        } else {
            seekTo(nextMediaItemIndex, -9223372036854775807L, 8, false);
        }
    }

    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            m623a(7);
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                m624b(7);
                return;
            } else {
                m623a(7);
                return;
            }
        }
        if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekTo(getCurrentMediaItemIndex(), 0L, 7, false);
        } else {
            m624b(7);
        }
    }

    public final void seekToPreviousMediaItem() {
        m624b(6);
    }

    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    public final void setMediaItem(C0226o0 c0226o0) {
        setMediaItems(AbstractC0983m0.m2168n(c0226o0));
    }

    public final void setMediaItems(List<C0226o0> list) {
        setMediaItems(list, true);
    }

    public final void setPlaybackSpeed(float f8) {
        setPlaybackParameters(new C0256y0(f8, getPlaybackParameters().f1550b));
    }

    public final void addMediaItem(C0226o0 c0226o0) {
        addMediaItems(AbstractC0983m0.m2168n(c0226o0));
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public final void seekTo(long j) {
        seekTo(getCurrentMediaItemIndex(), j, 5, false);
    }

    public final void setMediaItem(C0226o0 c0226o0, long j) {
        setMediaItems(AbstractC0983m0.m2168n(c0226o0), 0, j);
    }

    public final void seekToDefaultPosition(int i) {
        seekTo(i, -9223372036854775807L, 10, false);
    }

    public final void setMediaItem(C0226o0 c0226o0, boolean z7) {
        setMediaItems(AbstractC0983m0.m2168n(c0226o0), z7);
    }
}
