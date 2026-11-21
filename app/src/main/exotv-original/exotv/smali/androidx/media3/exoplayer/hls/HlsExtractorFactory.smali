.class public interface abstract Landroidx/media3/exoplayer/hls/HlsExtractorFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final DEFAULT:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/hls/HlsExtractorFactory;->DEFAULT:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract createExtractor(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/util/List;Lh1/d0;Ljava/util/Map;Ln1/o;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;",
            "Lh1/d0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ln1/o;",
            "Landroidx/media3/exoplayer/analytics/PlayerId;",
            ")",
            "Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;"
        }
    .end annotation
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/hls/HlsExtractorFactory;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 0

    .line 1
    return-object p1
.end method

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/hls/HlsExtractorFactory;
    .locals 0

    .line 1
    return-object p0
.end method
