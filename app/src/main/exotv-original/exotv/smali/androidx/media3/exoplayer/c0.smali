.class public final synthetic Landroidx/media3/exoplayer/c0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/MediaSourceList$ForwardingEventListener;

.field public final synthetic k:Landroid/util/Pair;

.field public final synthetic l:Landroidx/media3/exoplayer/source/LoadEventInfo;

.field public final synthetic m:Landroidx/media3/exoplayer/source/MediaLoadData;

.field public final synthetic n:Ljava/io/IOException;

.field public final synthetic o:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/MediaSourceList$ForwardingEventListener;Landroid/util/Pair;Landroidx/media3/exoplayer/source/LoadEventInfo;Landroidx/media3/exoplayer/source/MediaLoadData;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/c0;->j:Landroidx/media3/exoplayer/MediaSourceList$ForwardingEventListener;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/c0;->k:Landroid/util/Pair;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/c0;->l:Landroidx/media3/exoplayer/source/LoadEventInfo;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/c0;->m:Landroidx/media3/exoplayer/source/MediaLoadData;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/media3/exoplayer/c0;->n:Ljava/io/IOException;

    .line 13
    .line 14
    iput-boolean p6, p0, Landroidx/media3/exoplayer/c0;->o:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v4, p0, Landroidx/media3/exoplayer/c0;->n:Ljava/io/IOException;

    .line 2
    .line 3
    iget-boolean v5, p0, Landroidx/media3/exoplayer/c0;->o:Z

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/c0;->j:Landroidx/media3/exoplayer/MediaSourceList$ForwardingEventListener;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/c0;->k:Landroid/util/Pair;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/c0;->l:Landroidx/media3/exoplayer/source/LoadEventInfo;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/media3/exoplayer/c0;->m:Landroidx/media3/exoplayer/source/MediaLoadData;

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Landroidx/media3/exoplayer/MediaSourceList$ForwardingEventListener;->h(Landroidx/media3/exoplayer/MediaSourceList$ForwardingEventListener;Landroid/util/Pair;Landroidx/media3/exoplayer/source/LoadEventInfo;Landroidx/media3/exoplayer/source/MediaLoadData;Ljava/io/IOException;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
