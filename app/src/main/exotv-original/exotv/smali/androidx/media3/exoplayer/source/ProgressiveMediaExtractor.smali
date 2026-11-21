.class public interface abstract Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor$Factory;
    }
.end annotation


# virtual methods
.method public abstract disableSeekingOnMp3Streams()V
.end method

.method public abstract getCurrentInputPosition()J
.end method

.method public abstract init(Landroidx/media3/common/m;Landroid/net/Uri;Ljava/util/Map;JJLn1/p;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/m;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;JJ",
            "Ln1/p;",
            ")V"
        }
    .end annotation
.end method

.method public abstract read(Ln1/a0;)I
.end method

.method public abstract release()V
.end method

.method public abstract seek(JJ)V
.end method
