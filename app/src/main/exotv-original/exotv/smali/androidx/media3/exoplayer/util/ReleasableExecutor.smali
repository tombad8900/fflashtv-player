.class public interface abstract Landroidx/media3/exoplayer/util/ReleasableExecutor;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/concurrent/Executor;


# direct methods
.method public static from(Ljava/util/concurrent/Executor;Lh1/f;)Landroidx/media3/exoplayer/util/ReleasableExecutor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/util/concurrent/Executor;",
            ">(TT;",
            "Lh1/f;",
            ")",
            "Landroidx/media3/exoplayer/util/ReleasableExecutor;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/util/ReleasableExecutor$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroidx/media3/exoplayer/util/ReleasableExecutor$1;-><init>(Ljava/util/concurrent/Executor;Lh1/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract release()V
.end method
