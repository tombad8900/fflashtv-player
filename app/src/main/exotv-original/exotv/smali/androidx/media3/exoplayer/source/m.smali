.class public final synthetic Landroidx/media3/exoplayer/source/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor$Factory;


# instance fields
.field public final synthetic j:Ln1/q;


# direct methods
.method public synthetic constructor <init>(Ln1/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/m;->j:Ln1/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createProgressiveMediaExtractor(Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/m;->j:Ln1/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;->a(Ln1/q;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
