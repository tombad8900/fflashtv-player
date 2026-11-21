.class public final synthetic Landroidx/media3/exoplayer/source/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/f;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

.field public final synthetic k:Landroidx/media3/exoplayer/source/MediaLoadData;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;Landroidx/media3/exoplayer/source/MediaLoadData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/g;->j:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/source/g;->k:Landroidx/media3/exoplayer/source/MediaLoadData;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/g;->k:Landroidx/media3/exoplayer/source/MediaLoadData;

    .line 2
    .line 3
    check-cast p1, Landroidx/media3/exoplayer/source/MediaSourceEventListener;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/source/g;->j:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 6
    .line 7
    invoke-static {v1, v0, p1}, Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;->d(Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;Landroidx/media3/exoplayer/source/MediaLoadData;Landroidx/media3/exoplayer/source/MediaSourceEventListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
