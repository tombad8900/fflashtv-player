.class public final Landroidx/media3/exoplayer/hls/DefaultHlsDataSourceFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;


# instance fields
.field private final dataSourceFactory:Lk1/g;


# direct methods
.method public constructor <init>(Lk1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsDataSourceFactory;->dataSourceFactory:Lk1/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createDataSource(I)Lk1/h;
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsDataSourceFactory;->dataSourceFactory:Lk1/g;

    .line 2
    .line 3
    invoke-interface {p1}, Lk1/g;->l()Lk1/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
