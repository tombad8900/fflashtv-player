.class public final Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException;,
        Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;,
        Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompatV21;,
        Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;,
        Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompatV16;,
        Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MediaCodecUtil"

.field private static final decoderInfosCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private static maxH264DecodableFrameSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->decoderInfosCache:Ljava/util/HashMap;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    sput v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->maxH264DecodableFrameSize:I

    .line 10
    .line 11
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->lambda$sortByScore$2(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;Ljava/lang/Object;Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static applyWorkarounds(Ljava/lang/String;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "audio/raw"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    sget p0, Lh1/i0;->a:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    if-ge p0, v2, :cond_0

    .line 16
    .line 17
    sget-object p0, Lh1/i0;->b:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "R9"

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 38
    .line 39
    iget-object p0, p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->name:Ljava/lang/String;

    .line 40
    .line 41
    const-string v2, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const-string v2, "OMX.google.raw.decoder"

    .line 52
    .line 53
    const-string v3, "audio/raw"

    .line 54
    .line 55
    const-string v4, "audio/raw"

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x1

    .line 60
    const/4 v8, 0x0

    .line 61
    invoke-static/range {v2 .. v10}, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_0
    new-instance p0, Landroidx/media3/exoplayer/mediacodec/e;

    .line 69
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->sortByScore(Ljava/util/List;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    sget p0, Lh1/i0;->a:I

    .line 77
    .line 78
    const/16 v2, 0x20

    .line 79
    .line 80
    if-ge p0, v2, :cond_2

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-le p0, v0, :cond_2

    .line 87
    .line 88
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 93
    .line 94
    iget-object p0, p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->name:Ljava/lang/String;

    .line 95
    .line 96
    const-string v0, "OMX.qti.audio.decoder.flac"

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_2

    .line 103
    .line 104
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 109
    .line 110
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_2
    return-void
.end method

.method private static avcLevelToMaxFrameSize(I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    sparse-switch p0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    const/4 p0, -0x1

    .line 11
    return p0

    .line 12
    :sswitch_0
    const/high16 p0, 0x2200000

    .line 13
    .line 14
    return p0

    .line 15
    :sswitch_1
    const/high16 p0, 0x900000

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_2
    const p0, 0x564000

    .line 19
    .line 20
    .line 21
    return p0

    .line 22
    :sswitch_3
    const/high16 p0, 0x220000

    .line 23
    .line 24
    return p0

    .line 25
    :sswitch_4
    const/high16 p0, 0x200000

    .line 26
    .line 27
    return p0

    .line 28
    :sswitch_5
    const/high16 p0, 0x140000

    .line 29
    .line 30
    return p0

    .line 31
    :sswitch_6
    const p0, 0xe1000

    .line 32
    .line 33
    .line 34
    return p0

    .line 35
    :sswitch_7
    const p0, 0x65400

    .line 36
    .line 37
    .line 38
    return p0

    .line 39
    :sswitch_8
    const p0, 0x31800

    .line 40
    .line 41
    .line 42
    return p0

    .line 43
    :sswitch_9
    const p0, 0x18c00

    .line 44
    .line 45
    .line 46
    return p0

    .line 47
    :cond_0
    const/16 p0, 0x6300

    .line 48
    .line 49
    return p0

    .line 50
    nop

    .line 51
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_9
        0x10 -> :sswitch_9
        0x20 -> :sswitch_9
        0x40 -> :sswitch_8
        0x80 -> :sswitch_7
        0x100 -> :sswitch_7
        0x200 -> :sswitch_6
        0x400 -> :sswitch_5
        0x800 -> :sswitch_4
        0x1000 -> :sswitch_4
        0x2000 -> :sswitch_3
        0x4000 -> :sswitch_2
        0x8000 -> :sswitch_1
        0x10000 -> :sswitch_1
        0x20000 -> :sswitch_0
        0x40000 -> :sswitch_0
        0x80000 -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic b(Landroidx/media3/common/w;Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->lambda$getDecoderInfosSortedByFormatSupport$0(Landroidx/media3/common/w;Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;)I
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->lambda$applyWorkarounds$1(Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static declared-synchronized clearDecoderInfoCache()V
    .locals 2

    .line 1
    const-class v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->decoderInfosCache:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v1
.end method

.method public static getAlternativeCodecMimeType(Landroidx/media3/common/w;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "audio/eac3-joc"

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p0, "audio/eac3"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string v0, "video/dolby-vision"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v2, "video/hevc"

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    invoke-static {p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getCodecProfileAndLevel(Landroidx/media3/common/w;)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_4

    .line 31
    .line 32
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/16 v0, 0x10

    .line 41
    .line 42
    if-eq p0, v0, :cond_3

    .line 43
    .line 44
    const/16 v0, 0x100

    .line 45
    .line 46
    if-ne p0, v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/16 v0, 0x200

    .line 50
    .line 51
    if-ne p0, v0, :cond_2

    .line 52
    .line 53
    const-string p0, "video/avc"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    const/16 v0, 0x400

    .line 57
    .line 58
    if-ne p0, v0, :cond_4

    .line 59
    .line 60
    const-string p0, "video/av01"

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    :goto_0
    return-object v2

    .line 64
    :cond_4
    const-string p0, "video/mv-hevc"

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_5
    const/4 p0, 0x0

    .line 74
    return-object p0
.end method

.method public static getAlternativeDecoderInfos(Landroidx/media3/exoplayer/mediacodec/MediaCodecSelector;Landroidx/media3/common/w;ZZ)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecSelector;",
            "Landroidx/media3/common/w;",
            "ZZ)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getAlternativeCodecMimeType(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p0, Lf6/m0;->k:Lf6/k0;

    .line 8
    .line 9
    sget-object p0, Lf6/l1;->n:Lf6/l1;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Landroidx/media3/exoplayer/mediacodec/MediaCodecSelector;->getDecoderInfos(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static getCodecMimeType(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-virtual {v2, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p0, "video/dolby-vision"

    .line 22
    .line 23
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_4

    .line 28
    .line 29
    const-string p0, "OMX.MS.HEVCDV.Decoder"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    const-string p0, "video/hevcdv"

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string p0, "OMX.RTK.video.decoder"

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_3

    .line 47
    .line 48
    const-string p0, "OMX.realtek.video.decoder.tunneled"

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_8

    .line 55
    .line 56
    :cond_3
    const-string p0, "video/dv_hevc"

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    const-string p0, "video/mv-hevc"

    .line 60
    .line 61
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    const-string p0, "c2.qti.mvhevc.decoder"

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_8

    .line 74
    .line 75
    const-string p0, "video/x-mvhevc"

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    const-string p0, "audio/alac"

    .line 79
    .line 80
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    const-string p0, "OMX.lge.alac.decoder"

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_6

    .line 93
    .line 94
    const-string p0, "audio/x-lg-alac"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_6
    const-string p0, "audio/flac"

    .line 98
    .line 99
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_7

    .line 104
    .line 105
    const-string p0, "OMX.lge.flac.decoder"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_7

    .line 112
    .line 113
    const-string p0, "audio/x-lg-flac"

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_7
    const-string p0, "audio/ac3"

    .line 117
    .line 118
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_8

    .line 123
    .line 124
    const-string p0, "OMX.lge.ac3.decoder"

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    const-string p0, "audio/lg-ac3"

    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_8
    const/4 p0, 0x0

    .line 136
    return-object p0
.end method

.method public static getCodecProfileAndLevel(Landroidx/media3/common/w;)Landroid/util/Pair;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/w;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lh1/c;->a:[B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, v0, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, v0, Landroidx/media3/common/w;->B:Landroidx/media3/common/l;

    .line 13
    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    const/16 v21, 0x0

    .line 17
    .line 18
    goto/16 :goto_b

    .line 19
    .line 20
    :cond_0
    const-string v6, "\\."

    .line 21
    .line 22
    invoke-virtual {v3, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const-string v7, "video/dolby-vision"

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v16, 0x200

    .line 35
    .line 36
    const/16 v17, 0x100

    .line 37
    .line 38
    const/16 v18, 0x80

    .line 39
    .line 40
    const/16 v19, 0x40

    .line 41
    .line 42
    const/16 v20, 0x20

    .line 43
    .line 44
    const/16 v21, 0x0

    .line 45
    .line 46
    const/16 v5, 0x8

    .line 47
    .line 48
    const/16 v8, 0x10

    .line 49
    .line 50
    const/16 v22, 0x400

    .line 51
    .line 52
    const/4 v11, 0x4

    .line 53
    const/16 v23, 0x800

    .line 54
    .line 55
    const/4 v14, 0x3

    .line 56
    const/16 v24, 0x1000

    .line 57
    .line 58
    const-string v15, "CodecSpecificDataUtil"

    .line 59
    .line 60
    const/4 v7, 0x2

    .line 61
    if-eqz v0, :cond_1f

    .line 62
    .line 63
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v20

    .line 79
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v19

    .line 83
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v18

    .line 87
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v17

    .line 91
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v16

    .line 95
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v22

    .line 99
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v25

    .line 103
    array-length v5, v6

    .line 104
    const-string v11, "Ignoring malformed Dolby Vision codec string: "

    .line 105
    .line 106
    if-ge v5, v14, :cond_1

    .line 107
    .line 108
    invoke-static {v11, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v21

    .line 112
    :cond_1
    sget-object v5, Lh1/c;->c:Ljava/util/regex/Pattern;

    .line 113
    .line 114
    const/16 v26, 0x0

    .line 115
    .line 116
    aget-object v13, v6, v1

    .line 117
    .line 118
    invoke-virtual {v5, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-nez v13, :cond_2

    .line 127
    .line 128
    invoke-static {v11, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v21

    .line 132
    :cond_2
    invoke-virtual {v5, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    const-string v5, "10"

    .line 137
    .line 138
    const-string v13, "09"

    .line 139
    .line 140
    const-string v11, "08"

    .line 141
    .line 142
    const-string v10, "07"

    .line 143
    .line 144
    const-string v9, "06"

    .line 145
    .line 146
    const-string v12, "05"

    .line 147
    .line 148
    move/from16 v27, v7

    .line 149
    .line 150
    const-string v7, "04"

    .line 151
    .line 152
    move/from16 v28, v1

    .line 153
    .line 154
    const-string v1, "03"

    .line 155
    .line 156
    const-string v14, "02"

    .line 157
    .line 158
    move-object/from16 v30, v0

    .line 159
    .line 160
    const-string v0, "01"

    .line 161
    .line 162
    if-nez v3, :cond_3

    .line 163
    .line 164
    move-object/from16 v31, v4

    .line 165
    .line 166
    :goto_0
    move-object/from16 v4, v21

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 171
    .line 172
    .line 173
    move-result v31

    .line 174
    sparse-switch v31, :sswitch_data_0

    .line 175
    .line 176
    .line 177
    :goto_1
    move-object/from16 v31, v4

    .line 178
    .line 179
    :goto_2
    const/4 v4, -0x1

    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    :sswitch_0
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v31

    .line 186
    if-nez v31, :cond_4

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_4
    move-object/from16 v31, v4

    .line 190
    .line 191
    const/16 v4, 0xa

    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :sswitch_1
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v31

    .line 199
    if-nez v31, :cond_5

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_5
    move-object/from16 v31, v4

    .line 203
    .line 204
    const/16 v4, 0x9

    .line 205
    .line 206
    goto/16 :goto_3

    .line 207
    .line 208
    :sswitch_2
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v31

    .line 212
    if-nez v31, :cond_6

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_6
    move-object/from16 v31, v4

    .line 216
    .line 217
    const/16 v4, 0x8

    .line 218
    .line 219
    goto/16 :goto_3

    .line 220
    .line 221
    :sswitch_3
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v31

    .line 225
    if-nez v31, :cond_7

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_7
    move-object/from16 v31, v4

    .line 229
    .line 230
    const/4 v4, 0x7

    .line 231
    goto :goto_3

    .line 232
    :sswitch_4
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v31

    .line 236
    if-nez v31, :cond_8

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_8
    move-object/from16 v31, v4

    .line 240
    .line 241
    const/4 v4, 0x6

    .line 242
    goto :goto_3

    .line 243
    :sswitch_5
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v31

    .line 247
    if-nez v31, :cond_9

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_9
    move-object/from16 v31, v4

    .line 251
    .line 252
    const/4 v4, 0x5

    .line 253
    goto :goto_3

    .line 254
    :sswitch_6
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v31

    .line 258
    if-nez v31, :cond_a

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_a
    move-object/from16 v31, v4

    .line 262
    .line 263
    const/4 v4, 0x4

    .line 264
    goto :goto_3

    .line 265
    :sswitch_7
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v31

    .line 269
    if-nez v31, :cond_b

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_b
    move-object/from16 v31, v4

    .line 273
    .line 274
    const/4 v4, 0x3

    .line 275
    goto :goto_3

    .line 276
    :sswitch_8
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v31

    .line 280
    if-nez v31, :cond_c

    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_c
    move-object/from16 v31, v4

    .line 284
    .line 285
    move/from16 v4, v27

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :sswitch_9
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v31

    .line 292
    if-nez v31, :cond_d

    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_d
    move-object/from16 v31, v4

    .line 296
    .line 297
    move/from16 v4, v28

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :sswitch_a
    move-object/from16 v31, v4

    .line 301
    .line 302
    const-string v4, "00"

    .line 303
    .line 304
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-nez v4, :cond_e

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_e
    move/from16 v4, v26

    .line 313
    .line 314
    :goto_3
    packed-switch v4, :pswitch_data_0

    .line 315
    .line 316
    .line 317
    goto/16 :goto_0

    .line 318
    .line 319
    :pswitch_0
    move-object/from16 v4, v22

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :pswitch_1
    move-object/from16 v4, v16

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :pswitch_2
    move-object/from16 v4, v17

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :pswitch_3
    move-object/from16 v4, v18

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :pswitch_4
    move-object/from16 v4, v19

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :pswitch_5
    move-object/from16 v4, v20

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :pswitch_6
    move-object v4, v8

    .line 338
    goto :goto_4

    .line 339
    :pswitch_7
    move-object/from16 v4, v31

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :pswitch_8
    move-object/from16 v4, v30

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :pswitch_9
    move-object/from16 v4, v25

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :pswitch_a
    move-object v4, v2

    .line 349
    :goto_4
    if-nez v4, :cond_f

    .line 350
    .line 351
    const-string v0, "Unknown Dolby Vision profile string: "

    .line 352
    .line 353
    invoke-static {v0, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    return-object v21

    .line 357
    :cond_f
    aget-object v3, v6, v27

    .line 358
    .line 359
    if-nez v3, :cond_10

    .line 360
    .line 361
    :goto_5
    move-object/from16 v2, v21

    .line 362
    .line 363
    goto/16 :goto_8

    .line 364
    .line 365
    :cond_10
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    sparse-switch v6, :sswitch_data_1

    .line 370
    .line 371
    .line 372
    :goto_6
    const/4 v1, -0x1

    .line 373
    goto/16 :goto_7

    .line 374
    .line 375
    :sswitch_b
    const-string v0, "13"

    .line 376
    .line 377
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-nez v0, :cond_11

    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_11
    const/16 v1, 0xc

    .line 385
    .line 386
    goto/16 :goto_7

    .line 387
    .line 388
    :sswitch_c
    const-string v0, "12"

    .line 389
    .line 390
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-nez v0, :cond_12

    .line 395
    .line 396
    goto :goto_6

    .line 397
    :cond_12
    const/16 v1, 0xb

    .line 398
    .line 399
    goto/16 :goto_7

    .line 400
    .line 401
    :sswitch_d
    const-string v0, "11"

    .line 402
    .line 403
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    if-nez v0, :cond_13

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_13
    const/16 v1, 0xa

    .line 411
    .line 412
    goto/16 :goto_7

    .line 413
    .line 414
    :sswitch_e
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-nez v0, :cond_14

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_14
    const/16 v1, 0x9

    .line 422
    .line 423
    goto/16 :goto_7

    .line 424
    .line 425
    :sswitch_f
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-nez v0, :cond_15

    .line 430
    .line 431
    goto :goto_6

    .line 432
    :cond_15
    const/16 v1, 0x8

    .line 433
    .line 434
    goto :goto_7

    .line 435
    :sswitch_10
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-nez v0, :cond_16

    .line 440
    .line 441
    goto :goto_6

    .line 442
    :cond_16
    const/4 v1, 0x7

    .line 443
    goto :goto_7

    .line 444
    :sswitch_11
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-nez v0, :cond_17

    .line 449
    .line 450
    goto :goto_6

    .line 451
    :cond_17
    const/4 v1, 0x6

    .line 452
    goto :goto_7

    .line 453
    :sswitch_12
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    if-nez v0, :cond_18

    .line 458
    .line 459
    goto :goto_6

    .line 460
    :cond_18
    const/4 v1, 0x5

    .line 461
    goto :goto_7

    .line 462
    :sswitch_13
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-nez v0, :cond_19

    .line 467
    .line 468
    goto :goto_6

    .line 469
    :cond_19
    const/4 v1, 0x4

    .line 470
    goto :goto_7

    .line 471
    :sswitch_14
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-nez v0, :cond_1a

    .line 476
    .line 477
    goto :goto_6

    .line 478
    :cond_1a
    const/4 v1, 0x3

    .line 479
    goto :goto_7

    .line 480
    :sswitch_15
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-nez v0, :cond_1b

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_1b
    move/from16 v1, v27

    .line 488
    .line 489
    goto :goto_7

    .line 490
    :sswitch_16
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-nez v0, :cond_1c

    .line 495
    .line 496
    goto :goto_6

    .line 497
    :cond_1c
    move/from16 v1, v28

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :sswitch_17
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    if-nez v0, :cond_1d

    .line 505
    .line 506
    goto/16 :goto_6

    .line 507
    .line 508
    :cond_1d
    move/from16 v1, v26

    .line 509
    .line 510
    :goto_7
    packed-switch v1, :pswitch_data_1

    .line 511
    .line 512
    .line 513
    goto/16 :goto_5

    .line 514
    .line 515
    :pswitch_b
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    goto :goto_8

    .line 520
    :pswitch_c
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    goto :goto_8

    .line 525
    :pswitch_d
    move-object/from16 v2, v22

    .line 526
    .line 527
    goto :goto_8

    .line 528
    :pswitch_e
    move-object/from16 v2, v16

    .line 529
    .line 530
    goto :goto_8

    .line 531
    :pswitch_f
    move-object/from16 v2, v17

    .line 532
    .line 533
    goto :goto_8

    .line 534
    :pswitch_10
    move-object/from16 v2, v18

    .line 535
    .line 536
    goto :goto_8

    .line 537
    :pswitch_11
    move-object/from16 v2, v19

    .line 538
    .line 539
    goto :goto_8

    .line 540
    :pswitch_12
    move-object/from16 v2, v20

    .line 541
    .line 542
    goto :goto_8

    .line 543
    :pswitch_13
    move-object v2, v8

    .line 544
    goto :goto_8

    .line 545
    :pswitch_14
    move-object/from16 v2, v31

    .line 546
    .line 547
    goto :goto_8

    .line 548
    :pswitch_15
    move-object/from16 v2, v30

    .line 549
    .line 550
    goto :goto_8

    .line 551
    :pswitch_16
    move-object/from16 v2, v25

    .line 552
    .line 553
    :goto_8
    :pswitch_17
    if-nez v2, :cond_1e

    .line 554
    .line 555
    const-string v0, "Unknown Dolby Vision level string: "

    .line 556
    .line 557
    invoke-static {v0, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    return-object v21

    .line 561
    :cond_1e
    new-instance v0, Landroid/util/Pair;

    .line 562
    .line 563
    invoke-direct {v0, v4, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    return-object v0

    .line 567
    :cond_1f
    move/from16 v28, v1

    .line 568
    .line 569
    move/from16 v27, v7

    .line 570
    .line 571
    const/16 v26, 0x0

    .line 572
    .line 573
    aget-object v0, v6, v26

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    sparse-switch v1, :sswitch_data_2

    .line 583
    .line 584
    .line 585
    :goto_9
    const/4 v0, -0x1

    .line 586
    goto/16 :goto_a

    .line 587
    .line 588
    :sswitch_18
    const-string v1, "vp09"

    .line 589
    .line 590
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    if-nez v0, :cond_20

    .line 595
    .line 596
    goto :goto_9

    .line 597
    :cond_20
    const/4 v0, 0x7

    .line 598
    goto :goto_a

    .line 599
    :sswitch_19
    const-string v1, "s263"

    .line 600
    .line 601
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-nez v0, :cond_21

    .line 606
    .line 607
    goto :goto_9

    .line 608
    :cond_21
    const/4 v0, 0x6

    .line 609
    goto :goto_a

    .line 610
    :sswitch_1a
    const-string v1, "mp4a"

    .line 611
    .line 612
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-nez v0, :cond_22

    .line 617
    .line 618
    goto :goto_9

    .line 619
    :cond_22
    const/4 v0, 0x5

    .line 620
    goto :goto_a

    .line 621
    :sswitch_1b
    const-string v1, "hvc1"

    .line 622
    .line 623
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-nez v0, :cond_23

    .line 628
    .line 629
    goto :goto_9

    .line 630
    :cond_23
    const/4 v0, 0x4

    .line 631
    goto :goto_a

    .line 632
    :sswitch_1c
    const-string v1, "hev1"

    .line 633
    .line 634
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    if-nez v0, :cond_24

    .line 639
    .line 640
    goto :goto_9

    .line 641
    :cond_24
    const/4 v0, 0x3

    .line 642
    goto :goto_a

    .line 643
    :sswitch_1d
    const-string v1, "avc2"

    .line 644
    .line 645
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    if-nez v0, :cond_25

    .line 650
    .line 651
    goto :goto_9

    .line 652
    :cond_25
    move/from16 v0, v27

    .line 653
    .line 654
    goto :goto_a

    .line 655
    :sswitch_1e
    const-string v1, "avc1"

    .line 656
    .line 657
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    if-nez v0, :cond_26

    .line 662
    .line 663
    goto :goto_9

    .line 664
    :cond_26
    move/from16 v0, v28

    .line 665
    .line 666
    goto :goto_a

    .line 667
    :sswitch_1f
    const-string v1, "av01"

    .line 668
    .line 669
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    if-nez v0, :cond_27

    .line 674
    .line 675
    goto :goto_9

    .line 676
    :cond_27
    move/from16 v0, v26

    .line 677
    .line 678
    :goto_a
    const/16 v1, 0x4000

    .line 679
    .line 680
    const v5, 0x8000

    .line 681
    .line 682
    .line 683
    const/high16 v7, 0x10000

    .line 684
    .line 685
    const/16 v9, 0x14

    .line 686
    .line 687
    const/16 v10, 0x2000

    .line 688
    .line 689
    packed-switch v0, :pswitch_data_2

    .line 690
    .line 691
    .line 692
    :goto_b
    return-object v21

    .line 693
    :pswitch_18
    array-length v0, v6

    .line 694
    const-string v1, "Ignoring malformed VP9 codec string: "

    .line 695
    .line 696
    const/4 v2, 0x3

    .line 697
    if-ge v0, v2, :cond_28

    .line 698
    .line 699
    invoke-static {v1, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    return-object v21

    .line 703
    :cond_28
    :try_start_0
    aget-object v0, v6, v28

    .line 704
    .line 705
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    aget-object v2, v6, v27

    .line 710
    .line 711
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 712
    .line 713
    .line 714
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 715
    if-eqz v0, :cond_2c

    .line 716
    .line 717
    move/from16 v2, v28

    .line 718
    .line 719
    if-eq v0, v2, :cond_2b

    .line 720
    .line 721
    move/from16 v2, v27

    .line 722
    .line 723
    if-eq v0, v2, :cond_2a

    .line 724
    .line 725
    const/4 v2, 0x3

    .line 726
    if-eq v0, v2, :cond_29

    .line 727
    .line 728
    const/4 v2, -0x1

    .line 729
    :goto_c
    const/4 v3, -0x1

    .line 730
    goto :goto_d

    .line 731
    :cond_29
    const/16 v2, 0x8

    .line 732
    .line 733
    goto :goto_c

    .line 734
    :cond_2a
    const/4 v2, 0x4

    .line 735
    goto :goto_c

    .line 736
    :cond_2b
    const/4 v2, 0x2

    .line 737
    goto :goto_c

    .line 738
    :cond_2c
    const/4 v2, 0x1

    .line 739
    goto :goto_c

    .line 740
    :goto_d
    if-ne v2, v3, :cond_2d

    .line 741
    .line 742
    const-string v1, "Unknown VP9 profile: "

    .line 743
    .line 744
    invoke-static {v1, v0, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 745
    .line 746
    .line 747
    return-object v21

    .line 748
    :cond_2d
    const/16 v0, 0xa

    .line 749
    .line 750
    if-eq v1, v0, :cond_37

    .line 751
    .line 752
    const/16 v0, 0xb

    .line 753
    .line 754
    if-eq v1, v0, :cond_36

    .line 755
    .line 756
    if-eq v1, v9, :cond_35

    .line 757
    .line 758
    const/16 v0, 0x15

    .line 759
    .line 760
    if-eq v1, v0, :cond_34

    .line 761
    .line 762
    const/16 v0, 0x1e

    .line 763
    .line 764
    if-eq v1, v0, :cond_2e

    .line 765
    .line 766
    const/16 v0, 0x1f

    .line 767
    .line 768
    if-eq v1, v0, :cond_33

    .line 769
    .line 770
    const/16 v0, 0x28

    .line 771
    .line 772
    if-eq v1, v0, :cond_32

    .line 773
    .line 774
    const/16 v0, 0x29

    .line 775
    .line 776
    if-eq v1, v0, :cond_31

    .line 777
    .line 778
    const/16 v0, 0x32

    .line 779
    .line 780
    if-eq v1, v0, :cond_30

    .line 781
    .line 782
    const/16 v0, 0x33

    .line 783
    .line 784
    if-eq v1, v0, :cond_2f

    .line 785
    .line 786
    packed-switch v1, :pswitch_data_3

    .line 787
    .line 788
    .line 789
    const/4 v3, -0x1

    .line 790
    const/4 v8, -0x1

    .line 791
    goto :goto_f

    .line 792
    :pswitch_19
    move v8, v10

    .line 793
    :cond_2e
    :goto_e
    const/4 v3, -0x1

    .line 794
    goto :goto_f

    .line 795
    :pswitch_1a
    move/from16 v8, v24

    .line 796
    .line 797
    goto :goto_e

    .line 798
    :pswitch_1b
    move/from16 v8, v23

    .line 799
    .line 800
    goto :goto_e

    .line 801
    :cond_2f
    move/from16 v8, v16

    .line 802
    .line 803
    goto :goto_e

    .line 804
    :cond_30
    move/from16 v8, v17

    .line 805
    .line 806
    goto :goto_e

    .line 807
    :cond_31
    move/from16 v8, v18

    .line 808
    .line 809
    goto :goto_e

    .line 810
    :cond_32
    move/from16 v8, v19

    .line 811
    .line 812
    goto :goto_e

    .line 813
    :cond_33
    move/from16 v8, v20

    .line 814
    .line 815
    goto :goto_e

    .line 816
    :cond_34
    const/4 v3, -0x1

    .line 817
    const/16 v8, 0x8

    .line 818
    .line 819
    goto :goto_f

    .line 820
    :cond_35
    const/4 v3, -0x1

    .line 821
    const/4 v8, 0x4

    .line 822
    goto :goto_f

    .line 823
    :cond_36
    const/4 v3, -0x1

    .line 824
    const/4 v8, 0x2

    .line 825
    goto :goto_f

    .line 826
    :cond_37
    const/4 v3, -0x1

    .line 827
    const/4 v8, 0x1

    .line 828
    :goto_f
    if-ne v8, v3, :cond_38

    .line 829
    .line 830
    const-string v0, "Unknown VP9 level: "

    .line 831
    .line 832
    invoke-static {v0, v1, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 833
    .line 834
    .line 835
    return-object v21

    .line 836
    :cond_38
    new-instance v0, Landroid/util/Pair;

    .line 837
    .line 838
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    return-object v0

    .line 850
    :catch_0
    invoke-static {v1, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    :cond_39
    :goto_10
    move-object/from16 v5, v21

    .line 854
    .line 855
    goto/16 :goto_1b

    .line 856
    .line 857
    :pswitch_1c
    new-instance v5, Landroid/util/Pair;

    .line 858
    .line 859
    invoke-direct {v5, v2, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    array-length v0, v6

    .line 863
    const-string v1, "Ignoring malformed H263 codec string: "

    .line 864
    .line 865
    const/4 v2, 0x3

    .line 866
    if-ge v0, v2, :cond_3a

    .line 867
    .line 868
    invoke-static {v1, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    return-object v5

    .line 872
    :cond_3a
    const/16 v28, 0x1

    .line 873
    .line 874
    :try_start_1
    aget-object v0, v6, v28

    .line 875
    .line 876
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    const/16 v27, 0x2

    .line 881
    .line 882
    aget-object v2, v6, v27

    .line 883
    .line 884
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    new-instance v4, Landroid/util/Pair;

    .line 889
    .line 890
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    invoke-direct {v4, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 899
    .line 900
    .line 901
    return-object v4

    .line 902
    :catch_1
    invoke-static {v1, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    goto/16 :goto_1b

    .line 906
    .line 907
    :pswitch_1d
    array-length v0, v6

    .line 908
    const-string v1, "Ignoring malformed MP4A codec string: "

    .line 909
    .line 910
    const/4 v2, 0x3

    .line 911
    if-eq v0, v2, :cond_3b

    .line 912
    .line 913
    invoke-static {v1, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    return-object v21

    .line 917
    :cond_3b
    const/16 v28, 0x1

    .line 918
    .line 919
    :try_start_2
    aget-object v0, v6, v28

    .line 920
    .line 921
    invoke-static {v0, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 922
    .line 923
    .line 924
    move-result v0

    .line 925
    invoke-static {v0}, Landroidx/media3/common/u0;->f(I)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    const-string v2, "audio/mp4a-latm"

    .line 930
    .line 931
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    move-result v0

    .line 935
    if-eqz v0, :cond_39

    .line 936
    .line 937
    const/16 v27, 0x2

    .line 938
    .line 939
    aget-object v0, v6, v27

    .line 940
    .line 941
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 942
    .line 943
    .line 944
    move-result v0

    .line 945
    const/16 v2, 0x11

    .line 946
    .line 947
    if-eq v0, v2, :cond_3c

    .line 948
    .line 949
    if-eq v0, v9, :cond_3d

    .line 950
    .line 951
    const/16 v2, 0x17

    .line 952
    .line 953
    if-eq v0, v2, :cond_3c

    .line 954
    .line 955
    const/16 v2, 0x1d

    .line 956
    .line 957
    if-eq v0, v2, :cond_3c

    .line 958
    .line 959
    const/16 v2, 0x27

    .line 960
    .line 961
    if-eq v0, v2, :cond_3c

    .line 962
    .line 963
    const/16 v2, 0x2a

    .line 964
    .line 965
    if-eq v0, v2, :cond_3c

    .line 966
    .line 967
    packed-switch v0, :pswitch_data_4

    .line 968
    .line 969
    .line 970
    const/4 v0, -0x1

    .line 971
    const/4 v2, -0x1

    .line 972
    goto :goto_12

    .line 973
    :pswitch_1e
    const/4 v0, -0x1

    .line 974
    const/4 v2, 0x6

    .line 975
    goto :goto_12

    .line 976
    :pswitch_1f
    const/4 v0, -0x1

    .line 977
    const/4 v2, 0x5

    .line 978
    goto :goto_12

    .line 979
    :pswitch_20
    const/4 v0, -0x1

    .line 980
    const/4 v2, 0x4

    .line 981
    goto :goto_12

    .line 982
    :pswitch_21
    const/4 v0, -0x1

    .line 983
    const/4 v2, 0x3

    .line 984
    goto :goto_12

    .line 985
    :pswitch_22
    const/4 v0, -0x1

    .line 986
    const/4 v2, 0x2

    .line 987
    goto :goto_12

    .line 988
    :pswitch_23
    const/4 v0, -0x1

    .line 989
    const/4 v2, 0x1

    .line 990
    goto :goto_12

    .line 991
    :cond_3c
    :goto_11
    const/4 v0, -0x1

    .line 992
    goto :goto_12

    .line 993
    :cond_3d
    move v2, v9

    .line 994
    goto :goto_11

    .line 995
    :goto_12
    if-eq v2, v0, :cond_39

    .line 996
    .line 997
    new-instance v0, Landroid/util/Pair;

    .line 998
    .line 999
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v4

    .line 1007
    invoke-direct {v0, v2, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1008
    .line 1009
    .line 1010
    return-object v0

    .line 1011
    :catch_2
    invoke-static {v1, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    goto/16 :goto_10

    .line 1015
    .line 1016
    :pswitch_24
    invoke-static {v3, v6, v4}, Lh1/c;->b(Ljava/lang/String;[Ljava/lang/String;Landroidx/media3/common/l;)Landroid/util/Pair;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    return-object v0

    .line 1021
    :pswitch_25
    array-length v0, v6

    .line 1022
    const-string v2, "Ignoring malformed AVC codec string: "

    .line 1023
    .line 1024
    const/4 v4, 0x2

    .line 1025
    if-ge v0, v4, :cond_3e

    .line 1026
    .line 1027
    invoke-static {v2, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1028
    .line 1029
    .line 1030
    return-object v21

    .line 1031
    :cond_3e
    const/16 v28, 0x1

    .line 1032
    .line 1033
    :try_start_3
    aget-object v0, v6, v28

    .line 1034
    .line 1035
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1036
    .line 1037
    .line 1038
    move-result v0

    .line 1039
    const/4 v9, 0x6

    .line 1040
    if-ne v0, v9, :cond_3f

    .line 1041
    .line 1042
    aget-object v0, v6, v28

    .line 1043
    .line 1044
    move/from16 v9, v26

    .line 1045
    .line 1046
    invoke-virtual {v0, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    invoke-static {v0, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1051
    .line 1052
    .line 1053
    move-result v0

    .line 1054
    aget-object v4, v6, v28

    .line 1055
    .line 1056
    const/4 v6, 0x4

    .line 1057
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v4

    .line 1061
    invoke-static {v4, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    goto :goto_13

    .line 1066
    :cond_3f
    array-length v0, v6

    .line 1067
    const/4 v4, 0x3

    .line 1068
    if-lt v0, v4, :cond_49

    .line 1069
    .line 1070
    const/16 v28, 0x1

    .line 1071
    .line 1072
    aget-object v0, v6, v28

    .line 1073
    .line 1074
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    const/16 v27, 0x2

    .line 1079
    .line 1080
    aget-object v4, v6, v27

    .line 1081
    .line 1082
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1083
    .line 1084
    .line 1085
    move-result v2
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1086
    :goto_13
    const/16 v3, 0x42

    .line 1087
    .line 1088
    if-eq v0, v3, :cond_46

    .line 1089
    .line 1090
    const/16 v3, 0x4d

    .line 1091
    .line 1092
    if-eq v0, v3, :cond_45

    .line 1093
    .line 1094
    const/16 v3, 0x58

    .line 1095
    .line 1096
    if-eq v0, v3, :cond_44

    .line 1097
    .line 1098
    const/16 v3, 0x64

    .line 1099
    .line 1100
    if-eq v0, v3, :cond_43

    .line 1101
    .line 1102
    const/16 v3, 0x6e

    .line 1103
    .line 1104
    if-eq v0, v3, :cond_42

    .line 1105
    .line 1106
    const/16 v3, 0x7a

    .line 1107
    .line 1108
    if-eq v0, v3, :cond_41

    .line 1109
    .line 1110
    const/16 v3, 0xf4

    .line 1111
    .line 1112
    if-eq v0, v3, :cond_40

    .line 1113
    .line 1114
    const/4 v3, -0x1

    .line 1115
    :goto_14
    const/4 v4, -0x1

    .line 1116
    goto :goto_15

    .line 1117
    :cond_40
    move/from16 v3, v19

    .line 1118
    .line 1119
    goto :goto_14

    .line 1120
    :cond_41
    move/from16 v3, v20

    .line 1121
    .line 1122
    goto :goto_14

    .line 1123
    :cond_42
    move v3, v8

    .line 1124
    goto :goto_14

    .line 1125
    :cond_43
    const/16 v3, 0x8

    .line 1126
    .line 1127
    goto :goto_14

    .line 1128
    :cond_44
    const/4 v3, 0x4

    .line 1129
    goto :goto_14

    .line 1130
    :cond_45
    const/4 v3, 0x2

    .line 1131
    goto :goto_14

    .line 1132
    :cond_46
    const/4 v3, 0x1

    .line 1133
    goto :goto_14

    .line 1134
    :goto_15
    if-ne v3, v4, :cond_47

    .line 1135
    .line 1136
    const-string v1, "Unknown AVC profile: "

    .line 1137
    .line 1138
    invoke-static {v1, v0, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1139
    .line 1140
    .line 1141
    return-object v21

    .line 1142
    :cond_47
    packed-switch v2, :pswitch_data_5

    .line 1143
    .line 1144
    .line 1145
    packed-switch v2, :pswitch_data_6

    .line 1146
    .line 1147
    .line 1148
    packed-switch v2, :pswitch_data_7

    .line 1149
    .line 1150
    .line 1151
    packed-switch v2, :pswitch_data_8

    .line 1152
    .line 1153
    .line 1154
    packed-switch v2, :pswitch_data_9

    .line 1155
    .line 1156
    .line 1157
    const/4 v0, -0x1

    .line 1158
    const/4 v1, -0x1

    .line 1159
    goto :goto_17

    .line 1160
    :pswitch_26
    move v1, v7

    .line 1161
    :goto_16
    :pswitch_27
    const/4 v0, -0x1

    .line 1162
    goto :goto_17

    .line 1163
    :pswitch_28
    move v1, v5

    .line 1164
    goto :goto_16

    .line 1165
    :pswitch_29
    move v1, v10

    .line 1166
    goto :goto_16

    .line 1167
    :pswitch_2a
    move/from16 v1, v24

    .line 1168
    .line 1169
    goto :goto_16

    .line 1170
    :pswitch_2b
    move/from16 v1, v23

    .line 1171
    .line 1172
    goto :goto_16

    .line 1173
    :pswitch_2c
    move/from16 v1, v22

    .line 1174
    .line 1175
    goto :goto_16

    .line 1176
    :pswitch_2d
    move/from16 v1, v16

    .line 1177
    .line 1178
    goto :goto_16

    .line 1179
    :pswitch_2e
    move/from16 v1, v17

    .line 1180
    .line 1181
    goto :goto_16

    .line 1182
    :pswitch_2f
    move/from16 v1, v18

    .line 1183
    .line 1184
    goto :goto_16

    .line 1185
    :pswitch_30
    move/from16 v1, v19

    .line 1186
    .line 1187
    goto :goto_16

    .line 1188
    :pswitch_31
    move/from16 v1, v20

    .line 1189
    .line 1190
    goto :goto_16

    .line 1191
    :pswitch_32
    move v1, v8

    .line 1192
    goto :goto_16

    .line 1193
    :pswitch_33
    const/4 v0, -0x1

    .line 1194
    const/16 v1, 0x8

    .line 1195
    .line 1196
    goto :goto_17

    .line 1197
    :pswitch_34
    const/4 v0, -0x1

    .line 1198
    const/4 v1, 0x4

    .line 1199
    goto :goto_17

    .line 1200
    :pswitch_35
    const/4 v0, -0x1

    .line 1201
    const/4 v1, 0x1

    .line 1202
    :goto_17
    if-ne v1, v0, :cond_48

    .line 1203
    .line 1204
    const-string v0, "Unknown AVC level: "

    .line 1205
    .line 1206
    invoke-static {v0, v2, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    return-object v21

    .line 1210
    :cond_48
    new-instance v0, Landroid/util/Pair;

    .line 1211
    .line 1212
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v2

    .line 1216
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1221
    .line 1222
    .line 1223
    return-object v0

    .line 1224
    :cond_49
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1225
    .line 1226
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    invoke-static {v15, v0}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1237
    .line 1238
    .line 1239
    return-object v21

    .line 1240
    :catch_3
    invoke-static {v2, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
    goto/16 :goto_10

    .line 1244
    .line 1245
    :pswitch_36
    array-length v0, v6

    .line 1246
    const-string v2, "Ignoring malformed AV1 codec string: "

    .line 1247
    .line 1248
    const/4 v9, 0x4

    .line 1249
    if-ge v0, v9, :cond_4a

    .line 1250
    .line 1251
    invoke-static {v2, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1252
    .line 1253
    .line 1254
    return-object v21

    .line 1255
    :cond_4a
    const/16 v28, 0x1

    .line 1256
    .line 1257
    :try_start_5
    aget-object v0, v6, v28

    .line 1258
    .line 1259
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1260
    .line 1261
    .line 1262
    move-result v0

    .line 1263
    const/4 v11, 0x2

    .line 1264
    aget-object v12, v6, v11

    .line 1265
    .line 1266
    const/4 v13, 0x0

    .line 1267
    invoke-virtual {v12, v13, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v12

    .line 1271
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1272
    .line 1273
    .line 1274
    move-result v12

    .line 1275
    const/16 v29, 0x3

    .line 1276
    .line 1277
    aget-object v6, v6, v29

    .line 1278
    .line 1279
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1280
    .line 1281
    .line 1282
    move-result v2
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1283
    if-eqz v0, :cond_4b

    .line 1284
    .line 1285
    const-string v1, "Unknown AV1 profile: "

    .line 1286
    .line 1287
    invoke-static {v1, v0, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1288
    .line 1289
    .line 1290
    return-object v21

    .line 1291
    :cond_4b
    const/16 v0, 0x8

    .line 1292
    .line 1293
    if-eq v2, v0, :cond_4c

    .line 1294
    .line 1295
    const/16 v3, 0xa

    .line 1296
    .line 1297
    if-eq v2, v3, :cond_4c

    .line 1298
    .line 1299
    const-string v0, "Unknown AV1 bit depth: "

    .line 1300
    .line 1301
    invoke-static {v0, v2, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    return-object v21

    .line 1305
    :cond_4c
    if-ne v2, v0, :cond_4d

    .line 1306
    .line 1307
    move/from16 v2, v28

    .line 1308
    .line 1309
    goto :goto_18

    .line 1310
    :cond_4d
    if-eqz v4, :cond_4f

    .line 1311
    .line 1312
    iget-object v2, v4, Landroidx/media3/common/l;->d:[B

    .line 1313
    .line 1314
    if-nez v2, :cond_4e

    .line 1315
    .line 1316
    iget v2, v4, Landroidx/media3/common/l;->c:I

    .line 1317
    .line 1318
    const/4 v3, 0x7

    .line 1319
    if-eq v2, v3, :cond_4e

    .line 1320
    .line 1321
    const/4 v3, 0x6

    .line 1322
    if-ne v2, v3, :cond_4f

    .line 1323
    .line 1324
    :cond_4e
    move/from16 v2, v24

    .line 1325
    .line 1326
    goto :goto_18

    .line 1327
    :cond_4f
    move v2, v11

    .line 1328
    :goto_18
    packed-switch v12, :pswitch_data_a

    .line 1329
    .line 1330
    .line 1331
    const/4 v0, -0x1

    .line 1332
    const/4 v1, -0x1

    .line 1333
    goto/16 :goto_1a

    .line 1334
    .line 1335
    :pswitch_37
    const/high16 v1, 0x800000

    .line 1336
    .line 1337
    :goto_19
    :pswitch_38
    const/4 v0, -0x1

    .line 1338
    goto/16 :goto_1a

    .line 1339
    .line 1340
    :pswitch_39
    const/high16 v1, 0x400000

    .line 1341
    .line 1342
    goto :goto_19

    .line 1343
    :pswitch_3a
    const/high16 v1, 0x200000

    .line 1344
    .line 1345
    goto :goto_19

    .line 1346
    :pswitch_3b
    const/high16 v1, 0x100000

    .line 1347
    .line 1348
    goto :goto_19

    .line 1349
    :pswitch_3c
    const/high16 v1, 0x80000

    .line 1350
    .line 1351
    goto :goto_19

    .line 1352
    :pswitch_3d
    const/high16 v1, 0x40000

    .line 1353
    .line 1354
    goto :goto_19

    .line 1355
    :pswitch_3e
    const/high16 v1, 0x20000

    .line 1356
    .line 1357
    goto :goto_19

    .line 1358
    :pswitch_3f
    move v1, v7

    .line 1359
    goto :goto_19

    .line 1360
    :pswitch_40
    move v1, v5

    .line 1361
    goto :goto_19

    .line 1362
    :pswitch_41
    move v1, v10

    .line 1363
    goto :goto_19

    .line 1364
    :pswitch_42
    move/from16 v1, v24

    .line 1365
    .line 1366
    goto :goto_19

    .line 1367
    :pswitch_43
    move/from16 v1, v23

    .line 1368
    .line 1369
    goto :goto_19

    .line 1370
    :pswitch_44
    move/from16 v1, v22

    .line 1371
    .line 1372
    goto :goto_19

    .line 1373
    :pswitch_45
    move/from16 v1, v16

    .line 1374
    .line 1375
    goto :goto_19

    .line 1376
    :pswitch_46
    move/from16 v1, v17

    .line 1377
    .line 1378
    goto :goto_19

    .line 1379
    :pswitch_47
    move/from16 v1, v18

    .line 1380
    .line 1381
    goto :goto_19

    .line 1382
    :pswitch_48
    move/from16 v1, v19

    .line 1383
    .line 1384
    goto :goto_19

    .line 1385
    :pswitch_49
    move/from16 v1, v20

    .line 1386
    .line 1387
    goto :goto_19

    .line 1388
    :pswitch_4a
    move v1, v8

    .line 1389
    goto :goto_19

    .line 1390
    :pswitch_4b
    move v1, v0

    .line 1391
    goto :goto_19

    .line 1392
    :pswitch_4c
    move v1, v9

    .line 1393
    goto :goto_19

    .line 1394
    :pswitch_4d
    move v1, v11

    .line 1395
    goto :goto_19

    .line 1396
    :pswitch_4e
    move/from16 v1, v28

    .line 1397
    .line 1398
    goto :goto_19

    .line 1399
    :goto_1a
    if-ne v1, v0, :cond_50

    .line 1400
    .line 1401
    const-string v0, "Unknown AV1 level: "

    .line 1402
    .line 1403
    invoke-static {v0, v12, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1404
    .line 1405
    .line 1406
    return-object v21

    .line 1407
    :cond_50
    new-instance v0, Landroid/util/Pair;

    .line 1408
    .line 1409
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v2

    .line 1413
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v1

    .line 1417
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1418
    .line 1419
    .line 1420
    return-object v0

    .line 1421
    :catch_4
    invoke-static {v2, v3, v15}, La1/a1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1422
    .line 1423
    .line 1424
    goto/16 :goto_10

    .line 1425
    .line 1426
    :goto_1b
    return-object v5

    .line 1427
    :sswitch_data_0
    .sparse-switch
        0x600 -> :sswitch_a
        0x601 -> :sswitch_9
        0x602 -> :sswitch_8
        0x603 -> :sswitch_7
        0x604 -> :sswitch_6
        0x605 -> :sswitch_5
        0x606 -> :sswitch_4
        0x607 -> :sswitch_3
        0x608 -> :sswitch_2
        0x609 -> :sswitch_1
        0x61f -> :sswitch_0
    .end sparse-switch

    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    :sswitch_data_1
    .sparse-switch
        0x601 -> :sswitch_17
        0x602 -> :sswitch_16
        0x603 -> :sswitch_15
        0x604 -> :sswitch_14
        0x605 -> :sswitch_13
        0x606 -> :sswitch_12
        0x607 -> :sswitch_11
        0x608 -> :sswitch_10
        0x609 -> :sswitch_f
        0x61f -> :sswitch_e
        0x620 -> :sswitch_d
        0x621 -> :sswitch_c
        0x622 -> :sswitch_b
    .end sparse-switch

    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    :sswitch_data_2
    .sparse-switch
        0x2dd8f6 -> :sswitch_1f
        0x2ddf23 -> :sswitch_1e
        0x2ddf24 -> :sswitch_1d
        0x30d038 -> :sswitch_1c
        0x310dbc -> :sswitch_1b
        0x333790 -> :sswitch_1a
        0x35091c -> :sswitch_19
        0x374e43 -> :sswitch_18
    .end sparse-switch

    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_36
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_1d
        :pswitch_1c
        :pswitch_18
    .end packed-switch

    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    :pswitch_data_3
    .packed-switch 0x3c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    :pswitch_data_5
    .packed-switch 0xa
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch

    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    :pswitch_data_6
    .packed-switch 0x14
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch

    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    :pswitch_data_7
    .packed-switch 0x1e
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
    .end packed-switch

    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    :pswitch_data_8
    .packed-switch 0x28
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    :pswitch_data_9
    .packed-switch 0x32
        :pswitch_27
        :pswitch_28
        :pswitch_26
    .end packed-switch

    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_38
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_37
    .end packed-switch
.end method

.method public static getDecoderInfo(Ljava/lang/String;ZZ)Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getDecoderInfos(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 19
    .line 20
    return-object p0
.end method

.method public static declared-synchronized getDecoderInfos(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "MediaCodecList API didn\'t list secure decoder for: "

    .line 2
    .line 3
    const-class v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    new-instance v2, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;

    .line 7
    .line 8
    invoke-direct {v2, p0, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;-><init>(Ljava/lang/String;ZZ)V

    .line 9
    .line 10
    .line 11
    sget-object v3, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->decoderInfosCache:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v1

    .line 22
    return-object v4

    .line 23
    :cond_0
    :try_start_1
    new-instance v4, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompatV21;

    .line 24
    .line 25
    invoke-direct {v4, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompatV21;-><init>(ZZ)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v4}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getDecoderInfosInternal(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget p1, Lh1/i0;->a:I

    .line 41
    .line 42
    const/16 v4, 0x17

    .line 43
    .line 44
    if-gt p1, v4, :cond_1

    .line 45
    .line 46
    new-instance p1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompatV16;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompatV16;-><init>(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$1;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2, p1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getDecoderInfosInternal(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    const-string p1, "MediaCodecUtil"

    .line 63
    .line 64
    new-instance v4, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ". Assuming: "

    .line 73
    .line 74
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 83
    .line 84
    iget-object v0, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->name:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1, v0}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    :goto_0
    invoke-static {p0, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->applyWorkarounds(Ljava/lang/String;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p2}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v3, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    monitor-exit v1

    .line 110
    return-object p0

    .line 111
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    throw p0
.end method

.method private static getDecoderInfosInternal(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;)Ljava/util/ArrayList;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;",
            ")",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "secure-playback"

    .line 6
    .line 7
    const-string v4, "tunneled-playback"

    .line 8
    .line 9
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v7, v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;->mimeType:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;->getCodecCount()I

    .line 17
    .line 18
    .line 19
    move-result v15

    .line 20
    invoke-interface {v2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;->secureDecodersExplicit()Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    const/4 v0, 0x0

    .line 25
    move v8, v0

    .line 26
    :goto_0
    if-ge v8, v15, :cond_d

    .line 27
    .line 28
    invoke-interface {v2, v8}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isAlias(Landroid/media/MediaCodecInfo;)Z

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-eqz v9, :cond_0

    .line 37
    .line 38
    :goto_1
    move/from16 v17, v6

    .line 39
    .line 40
    move/from16 v16, v8

    .line 41
    .line 42
    goto/16 :goto_9

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-static {v0, v9, v6, v7}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isCodecUsableDecoder(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-nez v10, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v10, v8

    .line 56
    invoke-static {v0, v9, v7}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getCodecMimeType(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    .line 60
    if-nez v8, :cond_2

    .line 61
    .line 62
    move/from16 v17, v6

    .line 63
    .line 64
    move/from16 v16, v10

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_2
    move v11, v6

    .line 69
    move-object v6, v9

    .line 70
    :try_start_1
    invoke-virtual {v0, v8}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-interface {v2, v4, v8, v9}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;->isFeatureSupported(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    invoke-interface {v2, v4, v8, v9}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;->isFeatureRequired(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    iget-boolean v14, v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;->tunneling:Z

    .line 83
    .line 84
    if-nez v14, :cond_3

    .line 85
    .line 86
    if-nez v13, :cond_4

    .line 87
    .line 88
    :cond_3
    if-eqz v14, :cond_5

    .line 89
    .line 90
    if-nez v12, :cond_5

    .line 91
    .line 92
    :cond_4
    :goto_2
    move/from16 v16, v10

    .line 93
    .line 94
    move/from16 v17, v11

    .line 95
    .line 96
    goto/16 :goto_9

    .line 97
    .line 98
    :cond_5
    invoke-interface {v2, v3, v8, v9}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;->isFeatureSupported(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    invoke-interface {v2, v3, v8, v9}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;->isFeatureRequired(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    iget-boolean v14, v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;->secure:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    .line 107
    .line 108
    if-nez v14, :cond_6

    .line 109
    .line 110
    if-nez v13, :cond_4

    .line 111
    .line 112
    :cond_6
    if-eqz v14, :cond_7

    .line 113
    .line 114
    if-nez v12, :cond_7

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    move v13, v10

    .line 118
    :try_start_2
    invoke-static {v0, v7}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isHardwareAccelerated(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 122
    move v14, v11

    .line 123
    :try_start_3
    invoke-static {v0, v7}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isSoftwareOnly(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    invoke-static {v0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isVendor(Landroid/media/MediaCodecInfo;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v14, :cond_9

    .line 132
    .line 133
    move/from16 v16, v0

    .line 134
    .line 135
    iget-boolean v0, v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;->secure:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 136
    .line 137
    if-eq v0, v12, :cond_8

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_8
    :goto_3
    move v12, v13

    .line 141
    goto :goto_5

    .line 142
    :catch_0
    move-exception v0

    .line 143
    move-object v1, v6

    .line 144
    move/from16 v16, v13

    .line 145
    .line 146
    move/from16 v17, v14

    .line 147
    .line 148
    goto/16 :goto_8

    .line 149
    .line 150
    :cond_9
    move/from16 v16, v0

    .line 151
    .line 152
    :goto_4
    if-nez v14, :cond_a

    .line 153
    .line 154
    :try_start_4
    iget-boolean v0, v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$CodecKey;->secure:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 155
    .line 156
    if-nez v0, :cond_a

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :goto_5
    const/4 v13, 0x0

    .line 160
    move/from16 v17, v14

    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    move/from16 v18, v16

    .line 164
    .line 165
    move/from16 v16, v12

    .line 166
    .line 167
    move/from16 v12, v18

    .line 168
    .line 169
    :try_start_5
    invoke-static/range {v6 .. v14}, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto/16 :goto_9

    .line 177
    .line 178
    :catch_1
    move-exception v0

    .line 179
    :goto_6
    move-object v1, v6

    .line 180
    goto :goto_8

    .line 181
    :cond_a
    move v0, v12

    .line 182
    move/from16 v17, v14

    .line 183
    .line 184
    move/from16 v12, v16

    .line 185
    .line 186
    move/from16 v16, v13

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :catch_2
    move-exception v0

    .line 190
    move/from16 v16, v13

    .line 191
    .line 192
    move/from16 v17, v14

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :goto_7
    if-nez v17, :cond_b

    .line 196
    .line 197
    if-eqz v0, :cond_b

    .line 198
    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v13, ".secure"

    .line 208
    .line 209
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x1

    .line 218
    move-object v1, v6

    .line 219
    move-object v6, v0

    .line 220
    :try_start_6
    invoke-static/range {v6 .. v14}, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 225
    .line 226
    .line 227
    goto :goto_a

    .line 228
    :catch_3
    move-exception v0

    .line 229
    goto :goto_8

    .line 230
    :catch_4
    move-exception v0

    .line 231
    move-object v1, v6

    .line 232
    move/from16 v17, v11

    .line 233
    .line 234
    move/from16 v16, v13

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :catch_5
    move-exception v0

    .line 238
    move-object v1, v6

    .line 239
    move/from16 v16, v10

    .line 240
    .line 241
    move/from16 v17, v11

    .line 242
    .line 243
    :goto_8
    :try_start_7
    sget v6, Lh1/i0;->a:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 244
    .line 245
    const/16 v9, 0x17

    .line 246
    .line 247
    const-string v10, "MediaCodecUtil"

    .line 248
    .line 249
    if-gt v6, v9, :cond_c

    .line 250
    .line 251
    :try_start_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-nez v6, :cond_c

    .line 256
    .line 257
    new-instance v0, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const-string v6, "Skipping codec "

    .line 263
    .line 264
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string v1, " (failed to query capabilities)"

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v10, v0}, Lh1/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :cond_b
    :goto_9
    add-int/lit8 v8, v16, 0x1

    .line 283
    .line 284
    move-object/from16 v1, p0

    .line 285
    .line 286
    move/from16 v6, v17

    .line 287
    .line 288
    goto/16 :goto_0

    .line 289
    .line 290
    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const-string v3, "Failed to query codec "

    .line 296
    .line 297
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    const-string v1, " ("

    .line 304
    .line 305
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string v1, ")"

    .line 312
    .line 313
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-static {v10, v1}, Lh1/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 324
    :cond_d
    :goto_a
    return-object v5

    .line 325
    :catch_6
    move-exception v0

    .line 326
    new-instance v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException;

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    invoke-direct {v1, v0, v2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException;-><init>(Ljava/lang/Throwable;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$1;)V

    .line 330
    .line 331
    .line 332
    throw v1
.end method

.method public static getDecoderInfosSoftMatch(Landroidx/media3/exoplayer/mediacodec/MediaCodecSelector;Landroidx/media3/common/w;ZZ)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecSelector;",
            "Landroidx/media3/common/w;",
            "ZZ)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#2.sampleMimeType"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {p0, v0, p2, p3}, Landroidx/media3/exoplayer/mediacodec/MediaCodecSelector;->getDecoderInfos(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, p1, p2, p3}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getAlternativeDecoderInfos(Landroidx/media3/exoplayer/mediacodec/MediaCodecSelector;Landroidx/media3/common/w;ZZ)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, v0}, Lf6/g0;->c(Ljava/lang/Iterable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lf6/g0;->c(Ljava/lang/Iterable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lf6/j0;->f()Lf6/l1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static getDecoderInfosSortedByFormatSupport(Ljava/util/List;Landroidx/media3/common/w;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;",
            "Landroidx/media3/common/w;",
            ")",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroidx/media3/exoplayer/mediacodec/f;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/mediacodec/f;-><init>(Landroidx/media3/common/w;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->sortByScore(Ljava/util/List;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static getDecryptOnlyDecoderInfo()Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;
    .locals 2

    .line 1
    const-string v0, "audio/raw"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getDecoderInfo(Ljava/lang/String;ZZ)Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static getHevcBaseLayerCodecProfileAndLevel(Landroidx/media3/common/w;)Landroid/util/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/w;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/common/w;->q:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v4, 0x0

    .line 10
    if-ge v2, v3, :cond_4

    .line 11
    .line 12
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, [B

    .line 17
    .line 18
    array-length v5, v3

    .line 19
    const/4 v6, 0x3

    .line 20
    if-le v5, v6, :cond_3

    .line 21
    .line 22
    new-array v7, v6, [Z

    .line 23
    .line 24
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    move v9, v1

    .line 29
    :goto_1
    array-length v10, v3

    .line 30
    if-ge v9, v10, :cond_1

    .line 31
    .line 32
    array-length v10, v3

    .line 33
    invoke-static {v3, v9, v10, v7}, Li1/p;->b([BII[Z)I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    array-length v10, v3

    .line 38
    if-eq v9, v10, :cond_0

    .line 39
    .line 40
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-virtual {v8, v10}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v9, v9, 0x3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v8}, Lf6/j0;->f()Lf6/l1;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    move v8, v1

    .line 55
    :goto_2
    iget v9, v7, Lf6/l1;->m:I

    .line 56
    .line 57
    if-ge v8, v9, :cond_3

    .line 58
    .line 59
    invoke-virtual {v7, v8}, Lf6/l1;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    add-int/2addr v9, v6

    .line 70
    if-ge v9, v5, :cond_2

    .line 71
    .line 72
    new-instance v9, Lh1/v;

    .line 73
    .line 74
    invoke-virtual {v7, v8}, Lf6/l1;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    add-int/2addr v10, v6

    .line 85
    invoke-direct {v9, v3, v10, v5}, Lh1/v;-><init>([BII)V

    .line 86
    .line 87
    .line 88
    invoke-static {v9}, Li1/p;->d(Lh1/v;)Landroidx/media3/common/p;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    iget v11, v10, Landroidx/media3/common/p;->a:I

    .line 93
    .line 94
    const/16 v12, 0x21

    .line 95
    .line 96
    if-ne v11, v12, :cond_2

    .line 97
    .line 98
    iget v10, v10, Landroidx/media3/common/p;->b:I

    .line 99
    .line 100
    if-nez v10, :cond_2

    .line 101
    .line 102
    const/4 v0, 0x4

    .line 103
    invoke-virtual {v9, v0}, Lh1/v;->v(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9, v6}, Lh1/v;->k(I)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {v9}, Lh1/v;->u()V

    .line 111
    .line 112
    .line 113
    const/4 v1, 0x1

    .line 114
    invoke-static {v9, v1, v0, v4}, Li1/p;->e(Lh1/v;ZILi1/h;)Li1/h;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget v5, v0, Li1/h;->a:I

    .line 119
    .line 120
    iget-boolean v6, v0, Li1/h;->b:Z

    .line 121
    .line 122
    iget v7, v0, Li1/h;->c:I

    .line 123
    .line 124
    iget v8, v0, Li1/h;->d:I

    .line 125
    .line 126
    iget-object v9, v0, Li1/h;->e:[I

    .line 127
    .line 128
    iget v10, v0, Li1/h;->f:I

    .line 129
    .line 130
    invoke-static/range {v5 .. v10}, Lh1/c;->a(IZII[II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_3

    .line 135
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_4
    move-object v0, v4

    .line 143
    :goto_3
    if-nez v0, :cond_5

    .line 144
    .line 145
    return-object v4

    .line 146
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    sget v2, Lh1/i0;->a:I

    .line 151
    .line 152
    const/4 v2, -0x1

    .line 153
    const-string v3, "\\."

    .line 154
    .line 155
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object p0, p0, Landroidx/media3/common/w;->B:Landroidx/media3/common/l;

    .line 160
    .line 161
    invoke-static {v0, v1, p0}, Lh1/c;->b(Ljava/lang/String;[Ljava/lang/String;Landroidx/media3/common/l;)Landroid/util/Pair;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0
.end method

.method private static isAlias(Landroid/media/MediaCodecInfo;)Z
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isAliasV29(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private static isAliasV29(Landroid/media/MediaCodecInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isAlias()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static isCodecUsableDecoder(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_5

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const-string p0, ".secure"

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    sget p0, Lh1/i0;->a:I

    .line 21
    .line 22
    const/16 p2, 0x18

    .line 23
    .line 24
    if-ge p0, p2, :cond_3

    .line 25
    .line 26
    const-string p2, "OMX.SEC.aac.dec"

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    const-string p2, "OMX.Exynos.AAC.Decoder"

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    :cond_1
    const-string p2, "samsung"

    .line 43
    .line 44
    sget-object v1, Lh1/i0;->c:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    sget-object p2, Lh1/i0;->b:Ljava/lang/String;

    .line 53
    .line 54
    const-string v1, "zeroflte"

    .line 55
    .line 56
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    const-string v1, "zerolte"

    .line 63
    .line 64
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    const-string v1, "zenlte"

    .line 71
    .line 72
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    const-string v1, "SC-05G"

    .line 79
    .line 80
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_2

    .line 85
    .line 86
    const-string v1, "marinelteatt"

    .line 87
    .line 88
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_2

    .line 93
    .line 94
    const-string v1, "404SC"

    .line 95
    .line 96
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_2

    .line 101
    .line 102
    const-string v1, "SC-04G"

    .line 103
    .line 104
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_2

    .line 109
    .line 110
    const-string v1, "SCV31"

    .line 111
    .line 112
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_3

    .line 117
    .line 118
    :cond_2
    return v0

    .line 119
    :cond_3
    const/16 p2, 0x17

    .line 120
    .line 121
    if-gt p0, p2, :cond_4

    .line 122
    .line 123
    const-string p0, "audio/eac3-joc"

    .line 124
    .line 125
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_4

    .line 130
    .line 131
    const-string p0, "OMX.MTK.AUDIO.DECODER.DSPAC3"

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_4

    .line 138
    .line 139
    return v0

    .line 140
    :cond_4
    const/4 p0, 0x1

    .line 141
    return p0

    .line 142
    :cond_5
    :goto_0
    return v0
.end method

.method private static isHardwareAccelerated(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isHardwareAcceleratedV29(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isSoftwareOnly(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    xor-int/lit8 p0, p0, 0x1

    .line 17
    .line 18
    return p0
.end method

.method private static isHardwareAcceleratedV29(Landroid/media/MediaCodecInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isHardwareAccelerated()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static isSoftwareOnly(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isSoftwareOnlyV29(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1}, Landroidx/media3/common/u0;->k(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lcom/bumptech/glide/c;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "arc."

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    const-string p1, "omx.google."

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_5

    .line 45
    .line 46
    const-string p1, "omx.ffmpeg."

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_5

    .line 53
    .line 54
    const-string p1, "omx.sec."

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    const-string p1, ".sw."

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    const-string p1, "c2.android."

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    const-string p1, "c2.google."

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    const-string p1, "omx."

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_4

    .line 101
    .line 102
    const-string p1, "c2."

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_4

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    return v1

    .line 112
    :cond_5
    :goto_0
    return v0
.end method

.method private static isSoftwareOnlyV29(Landroid/media/MediaCodecInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isSoftwareOnly()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static isVendor(Landroid/media/MediaCodecInfo;)Z
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->isVendorV29(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lcom/bumptech/glide/c;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "omx.google."

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "c2.android."

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string v0, "c2.google."

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method private static isVendorV29(Landroid/media/MediaCodecInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isVendor()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static synthetic lambda$applyWorkarounds$1(Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;)I
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->name:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "OMX.google"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    const-string v0, "c2.android"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget v0, Lh1/i0;->a:I

    .line 21
    .line 22
    const/16 v1, 0x1a

    .line 23
    .line 24
    if-ge v0, v1, :cond_1

    .line 25
    .line 26
    const-string v0, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    const/4 p0, -0x1

    .line 35
    return p0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0
.end method

.method private static synthetic lambda$getDecoderInfosSortedByFormatSupport$0(Landroidx/media3/common/w;Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->isFormatFunctionallySupported(Landroidx/media3/common/w;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static synthetic lambda$sortByScore$2(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-interface {p0, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;->getScore(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-interface {p0, p1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;->getScore(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int/2addr p2, p0

    .line 10
    return p2
.end method

.method public static maxH264DecodableFrameSize()I
    .locals 5

    .line 1
    sget v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->maxH264DecodableFrameSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_2

    .line 5
    .line 6
    const-string v0, "video/avc"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1, v1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getDecoderInfo(Ljava/lang/String;ZZ)Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/media3/exoplayer/mediacodec/MediaCodecInfo;->getProfileLevels()[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    array-length v2, v0

    .line 20
    move v3, v1

    .line 21
    :goto_0
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-object v4, v0, v1

    .line 24
    .line 25
    iget v4, v4, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 26
    .line 27
    invoke-static {v4}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->avcLevelToMaxFrameSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const v0, 0x54600

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :cond_1
    sput v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->maxH264DecodableFrameSize:I

    .line 46
    .line 47
    :cond_2
    sget v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->maxH264DecodableFrameSize:I

    .line 48
    .line 49
    return v0
.end method

.method private static sortByScore(Ljava/util/List;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/mediacodec/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/mediacodec/d;-><init>(Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$ScoreProvider;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static warmDecoderInfoCache(Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getDecoderInfos(Ljava/lang/String;ZZ)Ljava/util/List;
    :try_end_0
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p0

    .line 6
    const-string p1, "MediaCodecUtil"

    .line 7
    .line 8
    const-string p2, "Codec warming failed"

    .line 9
    .line 10
    invoke-static {p1, p2, p0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
