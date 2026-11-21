.class public final Landroidx/media3/exoplayer/source/DefaultCompositeSequenceableLoaderFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public create(Ljava/util/List;Ljava/util/List;)Landroidx/media3/exoplayer/source/SequenceableLoader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/media3/exoplayer/source/SequenceableLoader;",
            ">;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Landroidx/media3/exoplayer/source/SequenceableLoader;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/CompositeSequenceableLoader;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/media3/exoplayer/source/CompositeSequenceableLoader;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public varargs createCompositeSequenceableLoader([Landroidx/media3/exoplayer/source/SequenceableLoader;)Landroidx/media3/exoplayer/source/SequenceableLoader;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/CompositeSequenceableLoader;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/source/CompositeSequenceableLoader;-><init>([Landroidx/media3/exoplayer/source/SequenceableLoader;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public empty()Landroidx/media3/exoplayer/source/SequenceableLoader;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/CompositeSequenceableLoader;

    .line 2
    .line 3
    sget-object v1, Lf6/m0;->k:Lf6/k0;

    .line 4
    .line 5
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1}, Landroidx/media3/exoplayer/source/CompositeSequenceableLoader;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
