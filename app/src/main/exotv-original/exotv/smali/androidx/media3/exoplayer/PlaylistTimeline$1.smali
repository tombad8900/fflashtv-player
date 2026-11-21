.class Landroidx/media3/exoplayer/PlaylistTimeline$1;
.super Landroidx/media3/exoplayer/source/ForwardingTimeline;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/PlaylistTimeline;->copyWithPlaceholderTimeline(Landroidx/media3/exoplayer/source/ShuffleOrder;)Landroidx/media3/exoplayer/PlaylistTimeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/PlaylistTimeline;

.field private final window:Landroidx/media3/common/o1;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/PlaylistTimeline;Landroidx/media3/common/p1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/PlaylistTimeline$1;->this$0:Landroidx/media3/exoplayer/PlaylistTimeline;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/source/ForwardingTimeline;-><init>(Landroidx/media3/common/p1;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/media3/common/o1;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/media3/common/o1;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/PlaylistTimeline$1;->window:Landroidx/media3/common/o1;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;
    .locals 10

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/media3/exoplayer/source/ForwardingTimeline;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget p1, v0, Landroidx/media3/common/m1;->c:I

    .line 6
    .line 7
    iget-object p3, p0, Landroidx/media3/exoplayer/PlaylistTimeline$1;->window:Landroidx/media3/common/o1;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p3}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroidx/media3/common/o1;->a()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object v1, p2, Landroidx/media3/common/m1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, p2, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget v3, p2, Landroidx/media3/common/m1;->c:I

    .line 24
    .line 25
    iget-wide v4, p2, Landroidx/media3/common/m1;->d:J

    .line 26
    .line 27
    iget-wide v6, p2, Landroidx/media3/common/m1;->e:J

    .line 28
    .line 29
    sget-object v8, Landroidx/media3/common/c;->g:Landroidx/media3/common/c;

    .line 30
    .line 31
    const/4 v9, 0x1

    .line 32
    invoke-virtual/range {v0 .. v9}, Landroidx/media3/common/m1;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLandroidx/media3/common/c;Z)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, v0, Landroidx/media3/common/m1;->f:Z

    .line 38
    .line 39
    return-object v0
.end method
