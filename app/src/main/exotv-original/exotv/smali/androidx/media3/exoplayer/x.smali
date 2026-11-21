.class public final synthetic Landroidx/media3/exoplayer/x;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

.field public final synthetic k:I

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/ExoPlayerImplInternal;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/x;->j:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/x;->k:I

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/media3/exoplayer/x;->l:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/x;->k:I

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/media3/exoplayer/x;->l:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/x;->j:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->b(Landroidx/media3/exoplayer/ExoPlayerImplInternal;IZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
