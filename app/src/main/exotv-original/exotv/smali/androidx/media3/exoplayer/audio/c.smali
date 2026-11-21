.class public final synthetic Landroidx/media3/exoplayer/audio/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

.field public final synthetic k:I

.field public final synthetic l:J

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/c;->j:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/audio/c;->k:I

    .line 7
    .line 8
    iput-wide p3, p0, Landroidx/media3/exoplayer/audio/c;->l:J

    .line 9
    .line 10
    iput-wide p5, p0, Landroidx/media3/exoplayer/audio/c;->m:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/c;->l:J

    .line 2
    .line 3
    iget-wide v4, p0, Landroidx/media3/exoplayer/audio/c;->m:J

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/c;->j:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 6
    .line 7
    iget v1, p0, Landroidx/media3/exoplayer/audio/c;->k:I

    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->b(Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;IJJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
