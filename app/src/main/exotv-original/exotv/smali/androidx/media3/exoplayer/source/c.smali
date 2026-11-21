.class public final synthetic Landroidx/media3/exoplayer/source/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/q;


# instance fields
.field public final synthetic b:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

.field public final synthetic c:Landroidx/media3/common/w;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;Landroidx/media3/common/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/c;->b:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/source/c;->c:Landroidx/media3/common/w;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()[Ln1/n;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/c;->b:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/source/c;->c:Landroidx/media3/common/w;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->a(Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;Landroidx/media3/common/w;)[Ln1/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
