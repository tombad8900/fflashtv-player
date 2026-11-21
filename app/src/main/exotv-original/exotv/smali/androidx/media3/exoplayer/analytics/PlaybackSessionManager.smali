.class public interface abstract Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/analytics/PlaybackSessionManager$Listener;
    }
.end annotation


# virtual methods
.method public abstract belongsToSession(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/String;)Z
.end method

.method public abstract finishAllSessions(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;)V
.end method

.method public abstract getActiveSessionId()Ljava/lang/String;
.end method

.method public abstract getSessionForMediaPeriodId(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Ljava/lang/String;
.end method

.method public abstract setListener(Landroidx/media3/exoplayer/analytics/PlaybackSessionManager$Listener;)V
.end method

.method public abstract updateSessions(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;)V
.end method

.method public abstract updateSessionsWithDiscontinuity(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;I)V
.end method

.method public abstract updateSessionsWithTimelineChange(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;)V
.end method
