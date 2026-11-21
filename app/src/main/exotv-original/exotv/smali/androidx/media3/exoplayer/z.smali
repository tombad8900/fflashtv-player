.class public final synthetic Landroidx/media3/exoplayer/z;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/MediaSource$MediaSourceCaller;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/MediaSourceList;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/MediaSourceList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/z;->j:Landroidx/media3/exoplayer/MediaSourceList;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onSourceInfoRefreshed(Landroidx/media3/exoplayer/source/MediaSource;Landroidx/media3/common/p1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/z;->j:Landroidx/media3/exoplayer/MediaSourceList;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Landroidx/media3/exoplayer/MediaSourceList;->a(Landroidx/media3/exoplayer/MediaSourceList;Landroidx/media3/exoplayer/source/MediaSource;Landroidx/media3/common/p1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
