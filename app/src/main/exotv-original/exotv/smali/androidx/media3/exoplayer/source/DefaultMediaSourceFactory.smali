.class public final Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/MediaSourceFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;,
        Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$UnknownSubtitlesExtractor;,
        Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$AdsLoaderProvider;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "DMediaSourceFactory"


# instance fields
.field private adViewProvider:Landroidx/media3/common/d;

.field private adsLoaderProvider:Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;

.field private dataSourceFactory:Lk1/g;

.field private final delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

.field private externalImageLoader:Landroidx/media3/exoplayer/source/ExternalLoader;

.field private liveMaxOffsetMs:J

.field private liveMaxSpeed:F

.field private liveMinOffsetMs:J

.field private liveMinSpeed:F

.field private liveTargetOffsetMs:J

.field private loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field private parseSubtitlesDuringExtraction:Z

.field private serverSideAdInsertionMediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

.field private subtitleParserFactory:Lk2/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, La1/e;

    invoke-direct {v0, p1}, La1/e;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;-><init>(Lk1/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ln1/q;)V
    .locals 1

    .line 2
    new-instance v0, La1/e;

    invoke-direct {v0, p1}, La1/e;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;-><init>(Lk1/g;Ln1/q;)V

    return-void
.end method

.method public constructor <init>(Lk1/g;)V
    .locals 1

    .line 3
    new-instance v0, Ln1/l;

    invoke-direct {v0}, Ln1/l;-><init>()V

    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;-><init>(Lk1/g;Ln1/q;)V

    return-void
.end method

.method public constructor <init>(Lk1/g;Ln1/q;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->dataSourceFactory:Lk1/g;

    .line 6
    new-instance v0, Lk2/e;

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->subtitleParserFactory:Lk2/o;

    .line 9
    new-instance v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    invoke-direct {v1, p2, v0}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;-><init>(Ln1/q;Lk2/o;)V

    iput-object v1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    .line 10
    invoke-virtual {v1, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setDataSourceFactory(Lk1/g;)V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveTargetOffsetMs:J

    .line 12
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMinOffsetMs:J

    .line 13
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMaxOffsetMs:J

    const p1, -0x800001

    .line 14
    iput p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMinSpeed:F

    .line 15
    iput p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMaxSpeed:F

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->parseSubtitlesDuringExtraction:Z

    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;Landroidx/media3/common/w;)[Ln1/n;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->lambda$createMediaSource$0(Landroidx/media3/common/w;)[Ln1/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$000(Ljava/lang/Class;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->newInstance(Ljava/lang/Class;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$100(Ljava/lang/Class;Lk1/g;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->newInstance(Ljava/lang/Class;Lk1/g;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private synthetic lambda$createMediaSource$0(Landroidx/media3/common/w;)[Ln1/n;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->subtitleParserFactory:Lk2/o;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lk2/o;->supportsFormat(Landroidx/media3/common/w;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lk2/l;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->subtitleParserFactory:Lk2/o;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Lk2/o;->g(Landroidx/media3/common/w;)Lk2/q;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, p1}, Lk2/l;-><init>(Lk2/q;Landroidx/media3/common/w;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$UnknownSubtitlesExtractor;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$UnknownSubtitlesExtractor;-><init>(Landroidx/media3/common/w;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x1

    .line 27
    new-array p1, p1, [Ln1/n;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    aput-object v0, p1, v1

    .line 31
    .line 32
    return-object p1
.end method

.method private static maybeClipMediaSource(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/source/MediaSource;)Landroidx/media3/exoplayer/source/MediaSource;
    .locals 9

    .line 1
    iget-object p0, p0, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 2
    .line 3
    iget-wide v2, p0, Landroidx/media3/common/d0;->b:J

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v0, v2, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Landroidx/media3/common/d0;->d:J

    .line 12
    .line 13
    const-wide/high16 v4, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long v0, v0, v4

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-boolean v0, p0, Landroidx/media3/common/d0;->f:Z

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/source/ClippingMediaSource;

    .line 25
    .line 26
    iget-wide v4, p0, Landroidx/media3/common/d0;->d:J

    .line 27
    .line 28
    iget-boolean v1, p0, Landroidx/media3/common/d0;->g:Z

    .line 29
    .line 30
    xor-int/lit8 v6, v1, 0x1

    .line 31
    .line 32
    iget-boolean v7, p0, Landroidx/media3/common/d0;->e:Z

    .line 33
    .line 34
    iget-boolean v8, p0, Landroidx/media3/common/d0;->f:Z

    .line 35
    .line 36
    move-object v1, p1

    .line 37
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/source/ClippingMediaSource;-><init>(Landroidx/media3/exoplayer/source/MediaSource;JJZZZ)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private maybeWrapWithAdsMediaSource(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/source/MediaSource;)Landroidx/media3/exoplayer/source/MediaSource;
    .locals 11

    .line 1
    iget-object v0, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/media3/common/j0;->d:Landroidx/media3/common/a0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-object p2

    .line 13
    :cond_0
    iget-object v2, v1, Landroidx/media3/common/a0;->a:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v3, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adsLoaderProvider:Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;

    .line 16
    .line 17
    iget-object v10, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adViewProvider:Landroidx/media3/common/d;

    .line 18
    .line 19
    const-string v4, "DMediaSourceFactory"

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-nez v10, :cond_2

    .line 24
    .line 25
    :cond_1
    move-object v5, p2

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-interface {v3, v1}, Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;->getAdsLoader(Landroidx/media3/common/a0;)Landroidx/media3/exoplayer/source/ads/AdsLoader;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    if-nez v9, :cond_3

    .line 32
    .line 33
    const-string p1, "Playing media without ads, as no AdsLoader was provided."

    .line 34
    .line 35
    invoke-static {v4, p1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p2

    .line 39
    :cond_3
    new-instance v4, Landroidx/media3/exoplayer/source/ads/AdsMediaSource;

    .line 40
    .line 41
    new-instance v6, Lk1/l;

    .line 42
    .line 43
    invoke-direct {v6, v2}, Lk1/l;-><init>(Landroid/net/Uri;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p1, Landroidx/media3/common/o0;->a:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v0, v0, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 49
    .line 50
    filled-new-array {p1, v0, v2}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/4 v0, 0x3

    .line 55
    invoke-static {v0, p1}, Lf6/u;->b(I[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p1}, Lf6/m0;->h(I[Ljava/lang/Object;)Lf6/l1;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    move-object v8, p0

    .line 63
    move-object v5, p2

    .line 64
    invoke-direct/range {v4 .. v10}, Landroidx/media3/exoplayer/source/ads/AdsMediaSource;-><init>(Landroidx/media3/exoplayer/source/MediaSource;Lk1/l;Ljava/lang/Object;Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/exoplayer/source/ads/AdsLoader;Landroidx/media3/common/d;)V

    .line 65
    .line 66
    .line 67
    return-object v4

    .line 68
    :goto_0
    const-string p1, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider."

    .line 69
    .line 70
    invoke-static {v4, p1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5
.end method

.method private static newInstance(Ljava/lang/Class;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/media3/exoplayer/source/MediaSource$Factory;",
            ">;)",
            "Landroidx/media3/exoplayer/source/MediaSource$Factory;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/media3/exoplayer/source/MediaSource$Factory;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static newInstance(Ljava/lang/Class;Lk1/g;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/media3/exoplayer/source/MediaSource$Factory;",
            ">;",
            "Lk1/g;",
            ")",
            "Landroidx/media3/exoplayer/source/MediaSource$Factory;"
        }
    .end annotation

    .line 1
    :try_start_0
    const-class v0, Lk1/g;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/media3/exoplayer/source/MediaSource$Factory;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public clearLocalAdInsertionComponents()Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adsLoaderProvider:Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adViewProvider:Landroidx/media3/common/d;

    .line 5
    .line 6
    return-object p0
.end method

.method public createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/MediaSource;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 13
    .line 14
    iget-object v4, v2, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 15
    .line 16
    iget-wide v5, v2, Landroidx/media3/common/j0;->i:J

    .line 17
    .line 18
    iget-object v7, v2, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const-string v8, "ssai"

    .line 27
    .line 28
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->serverSideAdInsertionMediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-interface {v2, v0}, Landroidx/media3/exoplayer/source/MediaSource$Factory;->createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/MediaSource;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :cond_0
    const-string v4, "application/x-image-uri"

    .line 45
    .line 46
    invoke-static {v7, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    new-instance v2, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource$Factory;

    .line 53
    .line 54
    invoke-static {v5, v6}, Lh1/i0;->S(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    iget-object v5, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->externalImageLoader:Landroidx/media3/exoplayer/source/ExternalLoader;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v3, v4, v5}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource$Factory;-><init>(JLandroidx/media3/exoplayer/source/ExternalLoader;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource$Factory;->createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_1
    iget-object v2, v2, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 72
    .line 73
    invoke-static {v2, v7}, Lh1/i0;->K(Landroid/net/Uri;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    cmp-long v4, v5, v7

    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    iget-object v4, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    .line 88
    .line 89
    invoke-virtual {v4, v5}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setJpegExtractorFlags(I)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :try_start_0
    iget-object v4, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    .line 93
    .line 94
    invoke-virtual {v4, v2}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->getMediaSourceFactory(I)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 95
    .line 96
    .line 97
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    invoke-virtual {v3}, Landroidx/media3/common/i0;->a()Landroidx/media3/common/h0;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iget-wide v9, v3, Landroidx/media3/common/i0;->a:J

    .line 103
    .line 104
    cmp-long v6, v9, v7

    .line 105
    .line 106
    if-nez v6, :cond_3

    .line 107
    .line 108
    iget-wide v9, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveTargetOffsetMs:J

    .line 109
    .line 110
    iput-wide v9, v4, Landroidx/media3/common/h0;->a:J

    .line 111
    .line 112
    :cond_3
    iget v6, v3, Landroidx/media3/common/i0;->d:F

    .line 113
    .line 114
    const v9, -0x800001

    .line 115
    .line 116
    .line 117
    cmpl-float v6, v6, v9

    .line 118
    .line 119
    if-nez v6, :cond_4

    .line 120
    .line 121
    iget v6, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMinSpeed:F

    .line 122
    .line 123
    iput v6, v4, Landroidx/media3/common/h0;->d:F

    .line 124
    .line 125
    :cond_4
    iget v6, v3, Landroidx/media3/common/i0;->e:F

    .line 126
    .line 127
    cmpl-float v6, v6, v9

    .line 128
    .line 129
    if-nez v6, :cond_5

    .line 130
    .line 131
    iget v6, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMaxSpeed:F

    .line 132
    .line 133
    iput v6, v4, Landroidx/media3/common/h0;->e:F

    .line 134
    .line 135
    :cond_5
    iget-wide v9, v3, Landroidx/media3/common/i0;->b:J

    .line 136
    .line 137
    cmp-long v6, v9, v7

    .line 138
    .line 139
    if-nez v6, :cond_6

    .line 140
    .line 141
    iget-wide v9, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMinOffsetMs:J

    .line 142
    .line 143
    iput-wide v9, v4, Landroidx/media3/common/h0;->b:J

    .line 144
    .line 145
    :cond_6
    iget-wide v9, v3, Landroidx/media3/common/i0;->c:J

    .line 146
    .line 147
    cmp-long v6, v9, v7

    .line 148
    .line 149
    if-nez v6, :cond_7

    .line 150
    .line 151
    iget-wide v9, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMaxOffsetMs:J

    .line 152
    .line 153
    iput-wide v9, v4, Landroidx/media3/common/h0;->c:J

    .line 154
    .line 155
    :cond_7
    new-instance v6, Landroidx/media3/common/i0;

    .line 156
    .line 157
    invoke-direct {v6, v4}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v3}, Landroidx/media3/common/i0;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-nez v3, :cond_8

    .line 165
    .line 166
    invoke-virtual {v0}, Landroidx/media3/common/o0;->a()Landroidx/media3/common/b0;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v6}, Landroidx/media3/common/i0;->a()Landroidx/media3/common/h0;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    iput-object v3, v0, Landroidx/media3/common/b0;->m:Landroidx/media3/common/h0;

    .line 175
    .line 176
    invoke-virtual {v0}, Landroidx/media3/common/b0;->a()Landroidx/media3/common/o0;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :cond_8
    invoke-interface {v2, v0}, Landroidx/media3/exoplayer/source/MediaSource$Factory;->createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/MediaSource;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    iget-object v3, v0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 185
    .line 186
    iget-object v3, v3, Landroidx/media3/common/j0;->g:Lf6/m0;

    .line 187
    .line 188
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-nez v4, :cond_12

    .line 193
    .line 194
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    add-int/2addr v4, v5

    .line 199
    new-array v4, v4, [Landroidx/media3/exoplayer/source/MediaSource;

    .line 200
    .line 201
    const/4 v6, 0x0

    .line 202
    aput-object v2, v4, v6

    .line 203
    .line 204
    move v2, v6

    .line 205
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    if-ge v2, v9, :cond_11

    .line 210
    .line 211
    iget-boolean v9, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->parseSubtitlesDuringExtraction:Z

    .line 212
    .line 213
    if-eqz v9, :cond_f

    .line 214
    .line 215
    new-instance v9, Landroidx/media3/common/v;

    .line 216
    .line 217
    invoke-direct {v9}, Landroidx/media3/common/v;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    check-cast v10, Landroidx/media3/common/n0;

    .line 225
    .line 226
    iget-object v10, v10, Landroidx/media3/common/n0;->b:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v10}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    iput-object v10, v9, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 233
    .line 234
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    check-cast v10, Landroidx/media3/common/n0;

    .line 239
    .line 240
    iget-object v10, v10, Landroidx/media3/common/n0;->c:Ljava/lang/String;

    .line 241
    .line 242
    iput-object v10, v9, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 243
    .line 244
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    check-cast v10, Landroidx/media3/common/n0;

    .line 249
    .line 250
    iget v10, v10, Landroidx/media3/common/n0;->d:I

    .line 251
    .line 252
    iput v10, v9, Landroidx/media3/common/v;->e:I

    .line 253
    .line 254
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    check-cast v10, Landroidx/media3/common/n0;

    .line 259
    .line 260
    iget v10, v10, Landroidx/media3/common/n0;->e:I

    .line 261
    .line 262
    iput v10, v9, Landroidx/media3/common/v;->f:I

    .line 263
    .line 264
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    check-cast v10, Landroidx/media3/common/n0;

    .line 269
    .line 270
    iget-object v10, v10, Landroidx/media3/common/n0;->f:Ljava/lang/String;

    .line 271
    .line 272
    iput-object v10, v9, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 273
    .line 274
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    check-cast v10, Landroidx/media3/common/n0;

    .line 279
    .line 280
    iget-object v10, v10, Landroidx/media3/common/n0;->g:Ljava/lang/String;

    .line 281
    .line 282
    iput-object v10, v9, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 283
    .line 284
    new-instance v10, Landroidx/media3/common/w;

    .line 285
    .line 286
    invoke-direct {v10, v9}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 287
    .line 288
    .line 289
    new-instance v9, Landroidx/media3/exoplayer/source/c;

    .line 290
    .line 291
    invoke-direct {v9, v1, v10}, Landroidx/media3/exoplayer/source/c;-><init>(Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;Landroidx/media3/common/w;)V

    .line 292
    .line 293
    .line 294
    new-instance v10, Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;

    .line 295
    .line 296
    iget-object v11, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->dataSourceFactory:Lk1/g;

    .line 297
    .line 298
    invoke-direct {v10, v11, v9}, Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;-><init>(Lk1/g;Ln1/q;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v10, v5}, Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;->setSuppressPrepareError(Z)Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    iget-object v10, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 306
    .line 307
    if-eqz v10, :cond_9

    .line 308
    .line 309
    invoke-virtual {v9, v10}, Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;->setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;

    .line 310
    .line 311
    .line 312
    :cond_9
    add-int/lit8 v10, v2, 0x1

    .line 313
    .line 314
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    check-cast v11, Landroidx/media3/common/n0;

    .line 319
    .line 320
    iget-object v11, v11, Landroidx/media3/common/n0;->a:Landroid/net/Uri;

    .line 321
    .line 322
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    new-instance v12, Landroidx/media3/common/c0;

    .line 327
    .line 328
    invoke-direct {v12}, Landroidx/media3/common/c0;-><init>()V

    .line 329
    .line 330
    .line 331
    new-instance v13, Landroidx/media3/common/f0;

    .line 332
    .line 333
    invoke-direct {v13}, Landroidx/media3/common/f0;-><init>()V

    .line 334
    .line 335
    .line 336
    sget-object v19, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 337
    .line 338
    sget-object v21, Lf6/l1;->n:Lf6/l1;

    .line 339
    .line 340
    new-instance v14, Landroidx/media3/common/h0;

    .line 341
    .line 342
    invoke-direct {v14}, Landroidx/media3/common/h0;-><init>()V

    .line 343
    .line 344
    .line 345
    sget-object v28, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 346
    .line 347
    const/4 v15, 0x0

    .line 348
    if-nez v11, :cond_a

    .line 349
    .line 350
    move-object v11, v15

    .line 351
    goto :goto_1

    .line 352
    :cond_a
    invoke-static {v11}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    :goto_1
    iget-object v5, v13, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 357
    .line 358
    if-eqz v5, :cond_c

    .line 359
    .line 360
    iget-object v5, v13, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 361
    .line 362
    if-eqz v5, :cond_b

    .line 363
    .line 364
    goto :goto_2

    .line 365
    :cond_b
    move v5, v6

    .line 366
    goto :goto_3

    .line 367
    :cond_c
    :goto_2
    const/4 v5, 0x1

    .line 368
    :goto_3
    invoke-static {v5}, Lh1/a;->j(Z)V

    .line 369
    .line 370
    .line 371
    move-object v5, v14

    .line 372
    if-eqz v11, :cond_e

    .line 373
    .line 374
    new-instance v14, Landroidx/media3/common/j0;

    .line 375
    .line 376
    iget-object v6, v13, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 377
    .line 378
    if-eqz v6, :cond_d

    .line 379
    .line 380
    new-instance v15, Landroidx/media3/common/g0;

    .line 381
    .line 382
    invoke-direct {v15, v13}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 383
    .line 384
    .line 385
    :cond_d
    move-object/from16 v17, v15

    .line 386
    .line 387
    const/16 v16, 0x0

    .line 388
    .line 389
    const/16 v18, 0x0

    .line 390
    .line 391
    const/16 v20, 0x0

    .line 392
    .line 393
    const/16 v22, 0x0

    .line 394
    .line 395
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    move-object v15, v11

    .line 401
    invoke-direct/range {v14 .. v24}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 402
    .line 403
    .line 404
    move-object/from16 v25, v14

    .line 405
    .line 406
    goto :goto_4

    .line 407
    :cond_e
    move-object/from16 v25, v15

    .line 408
    .line 409
    :goto_4
    new-instance v22, Landroidx/media3/common/o0;

    .line 410
    .line 411
    new-instance v6, Landroidx/media3/common/e0;

    .line 412
    .line 413
    invoke-direct {v6, v12}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 414
    .line 415
    .line 416
    new-instance v11, Landroidx/media3/common/i0;

    .line 417
    .line 418
    invoke-direct {v11, v5}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 419
    .line 420
    .line 421
    sget-object v27, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 422
    .line 423
    const-string v23, ""

    .line 424
    .line 425
    move-object/from16 v24, v6

    .line 426
    .line 427
    move-object/from16 v26, v11

    .line 428
    .line 429
    invoke-direct/range {v22 .. v28}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 430
    .line 431
    .line 432
    move-object/from16 v5, v22

    .line 433
    .line 434
    invoke-virtual {v9, v5}, Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;->createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/ProgressiveMediaSource;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    aput-object v5, v4, v10

    .line 439
    .line 440
    goto :goto_5

    .line 441
    :cond_f
    new-instance v5, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;

    .line 442
    .line 443
    iget-object v6, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->dataSourceFactory:Lk1/g;

    .line 444
    .line 445
    invoke-direct {v5, v6}, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;-><init>(Lk1/g;)V

    .line 446
    .line 447
    .line 448
    iget-object v6, v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 449
    .line 450
    if-eqz v6, :cond_10

    .line 451
    .line 452
    invoke-virtual {v5, v6}, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;

    .line 453
    .line 454
    .line 455
    :cond_10
    add-int/lit8 v6, v2, 0x1

    .line 456
    .line 457
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    check-cast v9, Landroidx/media3/common/n0;

    .line 462
    .line 463
    invoke-virtual {v5, v9, v7, v8}, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->createMediaSource(Landroidx/media3/common/n0;J)Landroidx/media3/exoplayer/source/SingleSampleMediaSource;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    aput-object v5, v4, v6

    .line 468
    .line 469
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 470
    .line 471
    const/4 v5, 0x1

    .line 472
    const/4 v6, 0x0

    .line 473
    goto/16 :goto_0

    .line 474
    .line 475
    :cond_11
    new-instance v2, Landroidx/media3/exoplayer/source/MergingMediaSource;

    .line 476
    .line 477
    invoke-direct {v2, v4}, Landroidx/media3/exoplayer/source/MergingMediaSource;-><init>([Landroidx/media3/exoplayer/source/MediaSource;)V

    .line 478
    .line 479
    .line 480
    :cond_12
    invoke-static {v0, v2}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->maybeClipMediaSource(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/source/MediaSource;)Landroidx/media3/exoplayer/source/MediaSource;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-direct {v1, v0, v2}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->maybeWrapWithAdsMediaSource(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/source/MediaSource;)Landroidx/media3/exoplayer/source/MediaSource;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    return-object v0

    .line 489
    :catch_0
    move-exception v0

    .line 490
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 491
    .line 492
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 493
    .line 494
    .line 495
    throw v2
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->parseSubtitlesDuringExtraction:Z

    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setParseSubtitlesDuringExtraction(Z)V

    return-object p0
.end method

.method public bridge synthetic experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    move-result-object p1

    return-object p1
.end method

.method public getSupportedTypes()[I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->getSupportedTypes()[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public setAdViewProvider(Landroidx/media3/common/d;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adViewProvider:Landroidx/media3/common/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public setAdsLoaderProvider(Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adsLoaderProvider:Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;

    .line 2
    .line 3
    return-object p0
.end method

.method public setCmcdConfigurationFactory(Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setCmcdConfigurationFactory(Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;)V

    return-object p0
.end method

.method public bridge synthetic setCmcdConfigurationFactory(Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->setCmcdConfigurationFactory(Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    move-result-object p1

    return-object p1
.end method

.method public setDataSourceFactory(Lk1/g;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->dataSourceFactory:Lk1/g;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setDataSourceFactory(Lk1/g;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public setDrmSessionManagerProvider(Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    const-string v1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 3
    invoke-static {v1, p1}, Lh1/a;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setDrmSessionManagerProvider(Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;)V

    return-object p0
.end method

.method public bridge synthetic setDrmSessionManagerProvider(Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->setDrmSessionManagerProvider(Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    move-result-object p1

    return-object p1
.end method

.method public setExternalImageLoader(Landroidx/media3/exoplayer/source/ExternalLoader;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->externalImageLoader:Landroidx/media3/exoplayer/source/ExternalLoader;

    .line 2
    .line 3
    return-object p0
.end method

.method public setLiveMaxOffsetMs(J)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMaxOffsetMs:J

    .line 2
    .line 3
    return-object p0
.end method

.method public setLiveMaxSpeed(F)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMaxSpeed:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setLiveMinOffsetMs(J)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMinOffsetMs:J

    .line 2
    .line 3
    return-object p0
.end method

.method public setLiveMinSpeed(F)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveMinSpeed:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setLiveTargetOffsetMs(J)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->liveTargetOffsetMs:J

    .line 2
    .line 3
    return-object p0
.end method

.method public setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 1

    .line 2
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 3
    invoke-static {v0, p1}, Lh1/a;->h(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)V

    return-object p0
.end method

.method public bridge synthetic setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    move-result-object p1

    return-object p1
.end method

.method public setLocalAdInsertionComponents(Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;Landroidx/media3/common/d;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adsLoaderProvider:Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->adViewProvider:Landroidx/media3/common/d;

    .line 10
    .line 11
    return-object p0
.end method

.method public setServerSideAdInsertionMediaSourceFactory(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->serverSideAdInsertionMediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    return-object p0
.end method

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
    .locals 1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->subtitleParserFactory:Lk2/o;

    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->delegateFactoryLoader:Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->setSubtitleParserFactory(Lk2/o;)V

    return-object p0
.end method

.method public bridge synthetic setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    move-result-object p1

    return-object p1
.end method
