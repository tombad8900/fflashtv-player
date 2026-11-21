.class public Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StreamElement"
.end annotation


# static fields
.field private static final URL_PLACEHOLDER_BITRATE_1:Ljava/lang/String; = "{bitrate}"

.field private static final URL_PLACEHOLDER_BITRATE_2:Ljava/lang/String; = "{Bitrate}"

.field private static final URL_PLACEHOLDER_START_TIME_1:Ljava/lang/String; = "{start time}"

.field private static final URL_PLACEHOLDER_START_TIME_2:Ljava/lang/String; = "{start_time}"


# instance fields
.field private final baseUri:Ljava/lang/String;

.field public final chunkCount:I

.field private final chunkStartTimes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final chunkStartTimesUs:[J

.field private final chunkTemplate:Ljava/lang/String;

.field public final displayHeight:I

.field public final displayWidth:I

.field public final formats:[Landroidx/media3/common/w;

.field public final language:Ljava/lang/String;

.field private final lastChunkDurationUs:J

.field public final maxHeight:I

.field public final maxWidth:I

.field public final name:Ljava/lang/String;

.field public final subType:Ljava/lang/String;

.field public final timescale:J

.field public final type:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;IIIILjava/lang/String;[Landroidx/media3/common/w;Ljava/util/List;J)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "IIII",
            "Ljava/lang/String;",
            "[",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;J)V"
        }
    .end annotation

    move-wide/from16 v4, p5

    move-object/from16 v14, p14

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 3
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v7

    new-array v15, v7, [J

    const-wide/32 v2, 0xf4240

    cmp-long v0, v4, v2

    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    if-ltz v0, :cond_0

    .line 4
    rem-long v10, v4, v2

    cmp-long v10, v10, v8

    if-nez v10, :cond_0

    .line 5
    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {v4, v5, v2, v3, v0}, Lcom/bumptech/glide/c;->E(JJLjava/math/RoundingMode;)J

    move-result-wide v2

    :goto_0
    if-ge v1, v7, :cond_5

    .line 6
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9, v2, v3, v6}, Lcom/bumptech/glide/c;->E(JJLjava/math/RoundingMode;)J

    move-result-wide v8

    aput-wide v8, v15, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-gez v0, :cond_1

    .line 7
    rem-long v10, v2, v4

    cmp-long v0, v10, v8

    if-nez v0, :cond_1

    .line 8
    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {v2, v3, v4, v5, v0}, Lcom/bumptech/glide/c;->E(JJLjava/math/RoundingMode;)J

    move-result-wide v2

    :goto_1
    if-ge v1, v7, :cond_5

    .line 9
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9, v2, v3}, Lcom/bumptech/glide/c;->Z(JJ)J

    move-result-wide v8

    aput-wide v8, v15, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    move v10, v1

    :goto_2
    if-ge v10, v7, :cond_5

    .line 10
    invoke-interface {v14, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v11, v0, v8

    if-nez v11, :cond_2

    goto :goto_3

    :cond_2
    cmp-long v11, v4, v0

    if-ltz v11, :cond_3

    .line 11
    rem-long v12, v4, v0

    cmp-long v12, v12, v8

    if-nez v12, :cond_3

    .line 12
    sget-object v11, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {v4, v5, v0, v1, v11}, Lcom/bumptech/glide/c;->E(JJLjava/math/RoundingMode;)J

    move-result-wide v0

    .line 13
    invoke-static {v2, v3, v0, v1, v6}, Lcom/bumptech/glide/c;->E(JJLjava/math/RoundingMode;)J

    move-result-wide v0

    aput-wide v0, v15, v10

    goto :goto_3

    :cond_3
    if-gez v11, :cond_4

    .line 14
    rem-long v11, v0, v4

    cmp-long v11, v11, v8

    if-nez v11, :cond_4

    .line 15
    sget-object v11, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {v0, v1, v4, v5, v11}, Lcom/bumptech/glide/c;->E(JJLjava/math/RoundingMode;)J

    move-result-wide v0

    .line 16
    invoke-static {v2, v3, v0, v1}, Lcom/bumptech/glide/c;->Z(JJ)J

    move-result-wide v0

    aput-wide v0, v15, v10

    goto :goto_3

    .line 17
    :cond_4
    invoke-static/range {v0 .. v6}, Lh1/i0;->b0(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    aput-wide v0, v15, v10

    :goto_3
    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v4, p5

    goto :goto_2

    :cond_5
    const-wide/32 v2, 0xf4240

    .line 18
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v4, p5

    move-wide/from16 v0, p15

    invoke-static/range {v0 .. v6}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    move-result-wide v16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-wide v5, v4

    move-object/from16 v4, p4

    .line 19
    invoke-direct/range {v0 .. v17}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;IIIILjava/lang/String;[Landroidx/media3/common/w;Ljava/util/List;[JJ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;IIIILjava/lang/String;[Landroidx/media3/common/w;Ljava/util/List;[JJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "IIII",
            "Ljava/lang/String;",
            "[",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;[JJ)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->baseUri:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkTemplate:Ljava/lang/String;

    .line 23
    iput p3, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->type:I

    .line 24
    iput-object p4, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->subType:Ljava/lang/String;

    .line 25
    iput-wide p5, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->timescale:J

    .line 26
    iput-object p7, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->name:Ljava/lang/String;

    .line 27
    iput p8, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->maxWidth:I

    .line 28
    iput p9, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->maxHeight:I

    .line 29
    iput p10, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->displayWidth:I

    .line 30
    iput p11, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->displayHeight:I

    .line 31
    iput-object p12, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->language:Ljava/lang/String;

    .line 32
    iput-object p13, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->formats:[Landroidx/media3/common/w;

    .line 33
    iput-object p14, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimes:Ljava/util/List;

    .line 34
    iput-object p15, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimesUs:[J

    move-wide/from16 p2, p16

    .line 35
    iput-wide p2, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->lastChunkDurationUs:J

    .line 36
    invoke-interface {p14}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkCount:I

    return-void
.end method


# virtual methods
.method public buildRequestUri(II)Landroid/net/Uri;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->formats:[Landroidx/media3/common/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimes:Ljava/util/List;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v0, v1

    .line 20
    :goto_1
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimes:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ge p2, v0, :cond_2

    .line 30
    .line 31
    move v1, v2

    .line 32
    :cond_2
    invoke-static {v1}, Lh1/a;->j(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->formats:[Landroidx/media3/common/w;

    .line 36
    .line 37
    aget-object p1, v0, p1

    .line 38
    .line 39
    iget p1, p1, Landroidx/media3/common/w;->j:I

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimes:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkTemplate:Ljava/lang/String;

    .line 58
    .line 59
    const-string v1, "{bitrate}"

    .line 60
    .line 61
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "{Bitrate}"

    .line 66
    .line 67
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "{start time}"

    .line 72
    .line 73
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "{start_time}"

    .line 78
    .line 79
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->baseUri:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p2, p1}, Lh1/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1
.end method

.method public copy([Landroidx/media3/common/w;)Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->baseUri:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkTemplate:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->type:I

    .line 10
    .line 11
    iget-object v5, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->subType:Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v6, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->timescale:J

    .line 14
    .line 15
    iget-object v8, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->name:Ljava/lang/String;

    .line 16
    .line 17
    iget v9, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->maxWidth:I

    .line 18
    .line 19
    iget v10, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->maxHeight:I

    .line 20
    .line 21
    iget v11, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->displayWidth:I

    .line 22
    .line 23
    iget v12, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->displayHeight:I

    .line 24
    .line 25
    iget-object v13, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->language:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v15, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimes:Ljava/util/List;

    .line 28
    .line 29
    iget-object v14, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimesUs:[J

    .line 30
    .line 31
    move-object/from16 v16, v1

    .line 32
    .line 33
    move-object/from16 v17, v2

    .line 34
    .line 35
    iget-wide v1, v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->lastChunkDurationUs:J

    .line 36
    .line 37
    move-wide/from16 v19, v1

    .line 38
    .line 39
    move-object/from16 v2, v17

    .line 40
    .line 41
    move-wide/from16 v17, v19

    .line 42
    .line 43
    move-object/from16 v1, v16

    .line 44
    .line 45
    move-object/from16 v16, v14

    .line 46
    .line 47
    move-object/from16 v14, p1

    .line 48
    .line 49
    invoke-direct/range {v1 .. v18}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;IIIILjava/lang/String;[Landroidx/media3/common/w;Ljava/util/List;[JJ)V

    .line 50
    .line 51
    .line 52
    move-object/from16 v16, v1

    .line 53
    .line 54
    return-object v16
.end method

.method public getChunkDurationUs(I)J
    .locals 5

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->lastChunkDurationUs:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimesUs:[J

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    aget-wide v1, v0, v1

    .line 15
    .line 16
    aget-wide v3, v0, p1

    .line 17
    .line 18
    sub-long/2addr v1, v3

    .line 19
    return-wide v1
.end method

.method public getChunkIndex(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimesUs:[J

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p1, p2, v1}, Lh1/i0;->e([JJZ)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public getStartTimeUs(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkStartTimesUs:[J

    .line 2
    .line 3
    aget-wide v1, v0, p1

    .line 4
    .line 5
    return-wide v1
.end method
