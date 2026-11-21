.class public interface abstract Landroidx/media3/exoplayer/source/chunk/MediaChunkIterator;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final EMPTY:Landroidx/media3/exoplayer/source/chunk/MediaChunkIterator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/chunk/MediaChunkIterator$1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/exoplayer/source/chunk/MediaChunkIterator$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/source/chunk/MediaChunkIterator;->EMPTY:Landroidx/media3/exoplayer/source/chunk/MediaChunkIterator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract getChunkEndTimeUs()J
.end method

.method public abstract getChunkStartTimeUs()J
.end method

.method public abstract getDataSpec()Lk1/l;
.end method

.method public abstract isEnded()Z
.end method

.method public abstract next()Z
.end method

.method public abstract reset()V
.end method
