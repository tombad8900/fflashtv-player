.class public final synthetic Landroidx/media3/exoplayer/video/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic j:Lh1/b0;


# direct methods
.method public synthetic constructor <init>(Lh1/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/video/b;->j:Lh1/b0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/b;->j:Lh1/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh1/b0;->e(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
