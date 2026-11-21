.class final Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$ReflectivePreviewingSingleInputVideoGraphFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/e1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ReflectivePreviewingSingleInputVideoGraphFactory"
.end annotation


# instance fields
.field private final videoFrameProcessorFactory:Landroidx/media3/common/z1;


# direct methods
.method public constructor <init>(Landroidx/media3/common/z1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$ReflectivePreviewingSingleInputVideoGraphFactory;->videoFrameProcessorFactory:Landroidx/media3/common/z1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public create(Landroid/content/Context;Landroidx/media3/common/l;Landroidx/media3/common/o;Landroidx/media3/common/c2;Ljava/util/concurrent/Executor;Ljava/util/List;J)Landroidx/media3/common/f1;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/media3/common/l;",
            "Landroidx/media3/common/o;",
            "Landroidx/media3/common/c2;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;J)",
            "Landroidx/media3/common/f1;"
        }
    .end annotation

    .line 1
    :try_start_0
    const-string v0, "androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Landroidx/media3/common/z1;

    .line 8
    .line 9
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$ReflectivePreviewingSingleInputVideoGraphFactory;->videoFrameProcessorFactory:Landroidx/media3/common/z1;

    .line 18
    .line 19
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, Landroidx/media3/common/e1;

    .line 29
    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p2

    .line 32
    move-object v4, p3

    .line 33
    move-object v5, p4

    .line 34
    move-object v6, p5

    .line 35
    move-object/from16 v7, p6

    .line 36
    .line 37
    move-wide/from16 v8, p7

    .line 38
    .line 39
    invoke-interface/range {v1 .. v9}, Landroidx/media3/common/e1;->create(Landroid/content/Context;Landroidx/media3/common/l;Landroidx/media3/common/o;Landroidx/media3/common/c2;Ljava/util/concurrent/Executor;Ljava/util/List;J)Landroidx/media3/common/f1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    return-object p1

    .line 44
    :catch_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    instance-of p2, p1, Landroidx/media3/common/y1;

    .line 47
    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    sget p2, Landroidx/media3/common/y1;->j:I

    .line 51
    .line 52
    check-cast p1, Landroidx/media3/common/y1;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p2, Landroidx/media3/common/y1;

    .line 56
    .line 57
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    move-object p1, p2

    .line 61
    :goto_0
    throw p1
.end method
