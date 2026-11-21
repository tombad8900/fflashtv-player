.class public Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/xml/sax/helpers/DefaultHandler;",
        "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
        "Landroidx/media3/exoplayer/dash/manifest/DashManifest;",
        ">;"
    }
.end annotation


# static fields
.field private static final CEA_608_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

.field private static final CEA_708_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

.field private static final FRAME_RATE_PATTERN:Ljava/util/regex/Pattern;

.field private static final MPEG_CHANNEL_CONFIGURATION_MAPPING:[I

.field private static final TAG:Ljava/lang/String; = "MpdParser"


# instance fields
.field private final xmlParserFactory:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(\\d+)(?:/(\\d+))?"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->FRAME_RATE_PATTERN:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "CC([1-4])=.*"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_608_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "([1-9]|[1-5][0-9]|6[0-3])=.*"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_708_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const/16 v0, 0x15

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    fill-array-data v0, :array_0

    .line 30
    .line 31
    .line 32
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->MPEG_CHANNEL_CONFIGURATION_MAPPING:[I

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 4
        -0x1
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        0x2
        0x3
        0x4
        0x7
        0x8
        0x18
        0x8
        0xc
        0xa
        0xc
        0xe
        0xc
        0xe
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->xmlParserFactory:Lorg/xmlpull/v1/XmlPullParserFactory;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception v0

    .line 12
    new-instance v1, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    .line 15
    .line 16
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw v1
.end method

.method private addSegmentTimelineElementsToList(Ljava/util/List;JJIJ)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;JJIJ)J"
        }
    .end annotation

    .line 1
    if-ltz p6, :cond_0

    .line 2
    .line 3
    add-int/lit8 p6, p6, 0x1

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sub-long/2addr p7, p2

    .line 7
    sget p6, Lh1/i0;->a:I

    .line 8
    .line 9
    add-long/2addr p7, p4

    .line 10
    const-wide/16 v0, 0x1

    .line 11
    .line 12
    sub-long/2addr p7, v0

    .line 13
    div-long/2addr p7, p4

    .line 14
    long-to-int p6, p7

    .line 15
    :goto_0
    const/4 p7, 0x0

    .line 16
    :goto_1
    if-ge p7, p6, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSegmentTimelineElement(JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;

    .line 19
    .line 20
    .line 21
    move-result-object p8

    .line 22
    invoke-interface {p1, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-long/2addr p2, p4

    .line 26
    add-int/lit8 p7, p7, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    return-wide p2
.end method

.method private static checkContentTypeConsistency(II)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    if-ne p1, v0, :cond_1

    .line 6
    .line 7
    return p0

    .line 8
    :cond_1
    if-ne p0, p1, :cond_2

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_2
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 14
    .line 15
    .line 16
    return p0
.end method

.method private static checkLanguageConsistency(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method private static fillInClearKeyInformation(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroidx/media3/common/r;

    .line 14
    .line 15
    sget-object v3, Landroidx/media3/common/k;->c:Ljava/util/UUID;

    .line 16
    .line 17
    iget-object v4, v2, Landroidx/media3/common/r;->k:Ljava/util/UUID;

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/media3/common/r;->l:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v2, 0x0

    .line 37
    :goto_1
    if-nez v2, :cond_2

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_2
    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-ge v0, v1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroidx/media3/common/r;

    .line 51
    .line 52
    sget-object v3, Landroidx/media3/common/k;->b:Ljava/util/UUID;

    .line 53
    .line 54
    iget-object v4, v1, Landroidx/media3/common/r;->k:Ljava/util/UUID;

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    iget-object v3, v1, Landroidx/media3/common/r;->l:Ljava/lang/String;

    .line 63
    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    new-instance v3, Landroidx/media3/common/r;

    .line 67
    .line 68
    sget-object v4, Landroidx/media3/common/k;->c:Ljava/util/UUID;

    .line 69
    .line 70
    iget-object v5, v1, Landroidx/media3/common/r;->m:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, v1, Landroidx/media3/common/r;->n:[B

    .line 73
    .line 74
    invoke-direct {v3, v4, v2, v5, v1}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_3
    return-void
.end method

.method private static filterRedundantIncompleteSchemeDatas(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/media3/common/r;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/common/r;->n:[B

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-ge v2, v3, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroidx/media3/common/r;

    .line 32
    .line 33
    iget-object v4, v3, Landroidx/media3/common/r;->n:[B

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    iget-object v4, v1, Landroidx/media3/common/r;->n:[B

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    iget-object v4, v1, Landroidx/media3/common/r;->k:Ljava/util/UUID;

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Landroidx/media3/common/r;->a(Ljava/util/UUID;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_3
    add-int/lit8 v0, v0, -0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    return-void
.end method

.method private static getFinalAvailabilityTimeOffset(JJ)J
    .locals 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p2, v0

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide p0, p2

    .line 12
    :goto_0
    const-wide p2, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long p2, p0, p2

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_1
    return-wide p0
.end method

.method private static getSampleMimeType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/media3/common/u0;->k(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/media3/common/u0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Landroidx/media3/common/u0;->o(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/media3/common/u0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p0}, Landroidx/media3/common/u0;->n(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p0}, Landroidx/media3/common/u0;->l(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    :goto_0
    return-object p0

    .line 37
    :cond_3
    const-string v0, "application/mp4"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_5

    .line 44
    .line 45
    invoke-static {p1}, Landroidx/media3/common/u0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, "text/vtt"

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    const-string p0, "application/x-mp4-vtt"

    .line 58
    .line 59
    :cond_4
    return-object p0

    .line 60
    :cond_5
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method private isDvbProfileDeclared([Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    const-string v4, "urn:dvb:dash:profile:dvb-dash:"

    .line 9
    .line 10
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return v1
.end method

.method public static maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    :goto_0
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ne v2, v1, :cond_1

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x3

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return-void
.end method

.method public static parseCea608AccessibilityChannel(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 13
    .line 14
    const-string v2, "urn:scte:dash:cc:cea-608:2015"

    .line 15
    .line 16
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sget-object v3, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_608_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    invoke-virtual {v2, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v3, "Unable to parse CEA-608 channel number from: "

    .line 53
    .line 54
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "MpdParser"

    .line 67
    .line 68
    invoke-static {v2, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    const/4 p0, -0x1

    .line 75
    return p0
.end method

.method public static parseCea708AccessibilityChannel(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 13
    .line 14
    const-string v2, "urn:scte:dash:cc:cea-708:2015"

    .line 15
    .line 16
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sget-object v3, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_708_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    invoke-virtual {v2, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v3, "Unable to parse CEA-708 service block number from: "

    .line 53
    .line 54
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "MpdParser"

    .line 67
    .line 68
    invoke-static {v2, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    const/4 p0, -0x1

    .line 75
    return p0
.end method

.method public static parseDateTime(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-wide p2

    .line 9
    :cond_0
    invoke-static {p0}, Lh1/i0;->V(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method public static parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;
    .locals 4

    .line 1
    const-string v0, "schemeIdUri"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "value"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {p0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v3, "id"

    .line 17
    .line 18
    invoke-static {p0, v3, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    new-instance p0, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 32
    .line 33
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/Descriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public static parseDolbyChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "value"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, -0x1

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    invoke-static {p0}, Lcom/bumptech/glide/c;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x2

    .line 24
    const/4 v3, 0x1

    .line 25
    sparse-switch v1, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    :goto_0
    move p0, v0

    .line 29
    goto :goto_1

    .line 30
    :sswitch_0
    const-string v1, "fa01"

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p0, 0x4

    .line 40
    goto :goto_1

    .line 41
    :sswitch_1
    const-string v1, "f801"

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p0, 0x3

    .line 51
    goto :goto_1

    .line 52
    :sswitch_2
    const-string v1, "f800"

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move p0, v2

    .line 62
    goto :goto_1

    .line 63
    :sswitch_3
    const-string v1, "a000"

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    move p0, v3

    .line 73
    goto :goto_1

    .line 74
    :sswitch_4
    const-string v1, "4000"

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_5

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    const/4 p0, 0x0

    .line 84
    :goto_1
    packed-switch p0, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    return v0

    .line 88
    :pswitch_0
    const/16 p0, 0x8

    .line 89
    .line 90
    return p0

    .line 91
    :pswitch_1
    const/4 p0, 0x6

    .line 92
    return p0

    .line 93
    :pswitch_2
    const/4 p0, 0x5

    .line 94
    return p0

    .line 95
    :pswitch_3
    return v2

    .line 96
    :pswitch_4
    return v3

    .line 97
    :sswitch_data_0
    .sparse-switch
        0x185d7c -> :sswitch_4
        0x2cd22f -> :sswitch_3
        0x2f3612 -> :sswitch_2
        0x2f3613 -> :sswitch_1
        0x2fcffc -> :sswitch_0
    .end sparse-switch

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseDtsChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-lez p0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x21

    .line 11
    .line 12
    if-ge p0, v0, :cond_0

    .line 13
    .line 14
    return p0

    .line 15
    :cond_0
    return v1
.end method

.method public static parseDtsxChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "value"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, -0x1

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-static {p0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->bitCount(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    return p0
.end method

.method public static parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-wide p2

    .line 9
    :cond_0
    sget-object p1, Lh1/i0;->i:Ljava/util/regex/Pattern;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_8

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    invoke-virtual {p1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 p2, 0x3

    .line 41
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    const-wide v6, 0x417e1852c0000000L    # 3.1556908E7

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-double/2addr p2, v6

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-wide p2, v4

    .line 61
    :goto_0
    const/4 v6, 0x5

    .line 62
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_2

    .line 67
    .line 68
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    const-wide v8, 0x4144103580000000L    # 2629739.0

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    mul-double/2addr v6, v8

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-wide v6, v4

    .line 80
    :goto_1
    add-double/2addr p2, v6

    .line 81
    const/4 v6, 0x7

    .line 82
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-eqz v6, :cond_3

    .line 87
    .line 88
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    const-wide v8, 0x40f5180000000000L    # 86400.0

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    mul-double/2addr v6, v8

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-wide v6, v4

    .line 100
    :goto_2
    add-double/2addr p2, v6

    .line 101
    const/16 v6, 0xa

    .line 102
    .line 103
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    mul-double/2addr v6, v2

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move-wide v6, v4

    .line 116
    :goto_3
    add-double/2addr p2, v6

    .line 117
    const/16 v2, 0xc

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    const-wide/high16 v6, 0x404e000000000000L    # 60.0

    .line 130
    .line 131
    mul-double/2addr v2, v6

    .line 132
    goto :goto_4

    .line 133
    :cond_5
    move-wide v2, v4

    .line 134
    :goto_4
    add-double/2addr p2, v2

    .line 135
    const/16 v2, 0xe

    .line 136
    .line 137
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    :cond_6
    add-double/2addr p2, v4

    .line 148
    mul-double/2addr p2, v0

    .line 149
    double-to-long p1, p2

    .line 150
    if-nez p0, :cond_7

    .line 151
    .line 152
    neg-long p0, p1

    .line 153
    return-wide p0

    .line 154
    :cond_7
    return-wide p1

    .line 155
    :cond_8
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 156
    .line 157
    .line 158
    move-result-wide p0

    .line 159
    mul-double/2addr p0, v2

    .line 160
    mul-double/2addr p0, v0

    .line 161
    double-to-long p0, p0

    .line 162
    return-wide p0
.end method

.method public static parseEac3SupplementalProperties(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_3

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 13
    .line 14
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const-string v3, "JOC"

    .line 25
    .line 26
    iget-object v4, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    :cond_0
    const-string v3, "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const-string v2, "ec+3"

    .line 43
    .line 44
    iget-object v1, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    :cond_1
    const-string p0, "audio/eac3-joc"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const-string p0, "audio/eac3"

    .line 59
    .line 60
    return-object p0
.end method

.method public static parseFloat(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;F)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return p2

    .line 9
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static parseFrameRate(Lorg/xmlpull/v1/XmlPullParser;F)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "frameRate"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    sget-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->FRAME_RATE_PATTERN:Ljava/util/regex/Pattern;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    int-to-float p1, p1

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-float p0, p0

    .line 48
    div-float/2addr p1, p0

    .line 49
    return p1

    .line 50
    :cond_0
    int-to-float p0, p1

    .line 51
    return p0

    .line 52
    :cond_1
    return p1
.end method

.method public static parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return p2

    .line 9
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static parseLastSegmentNumberSupplementalProperty(Ljava/util/List;)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)J"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 13
    .line 14
    const-string v2, "http://dashif.org/guidelines/last-segment-number"

    .line 15
    .line 16
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v3}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object p0, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    return-wide v0
.end method

.method public static parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-wide p2

    .line 9
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method public static parseMpegChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 3

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-ltz p0, :cond_0

    .line 9
    .line 10
    sget-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->MPEG_CHANNEL_CONFIGURATION_MAPPING:[I

    .line 11
    .line 12
    array-length v2, v0

    .line 13
    if-ge p0, v2, :cond_0

    .line 14
    .line 15
    aget p0, v0, p0

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    return v1
.end method

.method public static parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p2

    .line 9
    :cond_0
    return-object p0
.end method

.method public static parseText(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x4

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-static {p0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {p0, p1}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    return-object v0
.end method


# virtual methods
.method public buildAdaptationSet(JILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Representation;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    move-object v6, p6

    .line 8
    move-object v7, p7

    .line 9
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;-><init>(JILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public buildEvent(Ljava/lang/String;Ljava/lang/String;JJ[B)Ly1/a;
    .locals 8

    .line 1
    new-instance v0, Ly1/a;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-wide v5, p3

    .line 6
    move-wide v3, p5

    .line 7
    move-object v7, p7

    .line 8
    invoke-direct/range {v0 .. v7}, Ly1/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public buildEventStream(Ljava/lang/String;Ljava/lang/String;J[J[Ly1/a;)Landroidx/media3/exoplayer/dash/manifest/EventStream;
    .locals 7

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/EventStream;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-wide v3, p3

    .line 6
    move-object v5, p5

    .line 7
    move-object v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/manifest/EventStream;-><init>(Ljava/lang/String;Ljava/lang/String;J[J[Ly1/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public buildFormat(Ljava/lang/String;Ljava/lang/String;IIFIIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Landroidx/media3/common/w;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIFIII",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroidx/media3/common/w;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p10

    .line 2
    .line 3
    move-object/from16 v1, p13

    .line 4
    .line 5
    move-object/from16 v2, p12

    .line 6
    .line 7
    invoke-static {p2, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->getSampleMimeType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "audio/eac3"

    .line 12
    .line 13
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    invoke-static/range {p14 .. p14}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEac3SupplementalProperties(Ljava/util/List;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "audio/eac3-joc"

    .line 24
    .line 25
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const-string v2, "ec+3"

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSelectionFlagsFromRoleDescriptors(Ljava/util/List;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromRoleDescriptors(Ljava/util/List;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    move-object/from16 v5, p11

    .line 42
    .line 43
    invoke-virtual {p0, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromAccessibilityDescriptors(Ljava/util/List;)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    or-int/2addr v0, v6

    .line 48
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromProperties(Ljava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    or-int/2addr v0, v6

    .line 53
    move-object/from16 v6, p14

    .line 54
    .line 55
    invoke-virtual {p0, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromProperties(Ljava/util/List;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    or-int/2addr v0, v6

    .line 60
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseTileCountFromProperties(Ljava/util/List;)Landroid/util/Pair;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v6, Landroidx/media3/common/v;

    .line 65
    .line 66
    invoke-direct {v6}, Landroidx/media3/common/v;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, v6, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, v6, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v3}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, v6, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 82
    .line 83
    iput-object v2, v6, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 84
    .line 85
    iput p8, v6, Landroidx/media3/common/v;->i:I

    .line 86
    .line 87
    iput v4, v6, Landroidx/media3/common/v;->e:I

    .line 88
    .line 89
    iput v0, v6, Landroidx/media3/common/v;->f:I

    .line 90
    .line 91
    move-object/from16 p1, p9

    .line 92
    .line 93
    iput-object p1, v6, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 94
    .line 95
    const/4 p1, -0x1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    iget-object p2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p2, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    goto :goto_0

    .line 107
    :cond_1
    move p2, p1

    .line 108
    :goto_0
    iput p2, v6, Landroidx/media3/common/v;->I:I

    .line 109
    .line 110
    if-eqz v1, :cond_2

    .line 111
    .line 112
    iget-object p2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p2, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    goto :goto_1

    .line 121
    :cond_2
    move p2, p1

    .line 122
    :goto_1
    iput p2, v6, Landroidx/media3/common/v;->J:I

    .line 123
    .line 124
    invoke-static {v3}, Landroidx/media3/common/u0;->o(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_3

    .line 129
    .line 130
    iput p3, v6, Landroidx/media3/common/v;->t:I

    .line 131
    .line 132
    iput p4, v6, Landroidx/media3/common/v;->u:I

    .line 133
    .line 134
    iput p5, v6, Landroidx/media3/common/v;->v:F

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    invoke-static {v3}, Landroidx/media3/common/u0;->k(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-eqz p2, :cond_4

    .line 142
    .line 143
    iput p6, v6, Landroidx/media3/common/v;->B:I

    .line 144
    .line 145
    iput p7, v6, Landroidx/media3/common/v;->C:I

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    invoke-static {v3}, Landroidx/media3/common/u0;->n(Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_7

    .line 153
    .line 154
    const-string p2, "application/cea-608"

    .line 155
    .line 156
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-eqz p2, :cond_5

    .line 161
    .line 162
    invoke-static {v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseCea608AccessibilityChannel(Ljava/util/List;)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    goto :goto_2

    .line 167
    :cond_5
    const-string p2, "application/cea-708"

    .line 168
    .line 169
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-eqz p2, :cond_6

    .line 174
    .line 175
    invoke-static {v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseCea708AccessibilityChannel(Ljava/util/List;)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    :cond_6
    :goto_2
    iput p1, v6, Landroidx/media3/common/v;->G:I

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    invoke-static {v3}, Landroidx/media3/common/u0;->l(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_8

    .line 187
    .line 188
    iput p3, v6, Landroidx/media3/common/v;->t:I

    .line 189
    .line 190
    iput p4, v6, Landroidx/media3/common/v;->u:I

    .line 191
    .line 192
    :cond_8
    :goto_3
    new-instance p1, Landroidx/media3/common/w;

    .line 193
    .line 194
    invoke-direct {p1, v6}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 195
    .line 196
    .line 197
    return-object p1
.end method

.method public buildMediaPresentationDescription(JJJZJJJJLandroidx/media3/exoplayer/dash/manifest/ProgramInformation;Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;Landroid/net/Uri;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJZJJJJ",
            "Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;",
            "Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;",
            "Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Period;",
            ">;)",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifest;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    move-wide/from16 v5, p5

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    move-wide/from16 v8, p8

    .line 12
    .line 13
    move-wide/from16 v10, p10

    .line 14
    .line 15
    move-wide/from16 v12, p12

    .line 16
    .line 17
    move-wide/from16 v14, p14

    .line 18
    .line 19
    move-object/from16 v16, p16

    .line 20
    .line 21
    move-object/from16 v17, p17

    .line 22
    .line 23
    move-object/from16 v18, p18

    .line 24
    .line 25
    move-object/from16 v19, p19

    .line 26
    .line 27
    move-object/from16 v20, p20

    .line 28
    .line 29
    invoke-direct/range {v0 .. v20}, Landroidx/media3/exoplayer/dash/manifest/DashManifest;-><init>(JJJZJJJJLandroidx/media3/exoplayer/dash/manifest/ProgramInformation;Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;Landroid/net/Uri;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public buildPeriod(Ljava/lang/String;JLjava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/Descriptor;)Landroidx/media3/exoplayer/dash/manifest/Period;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/EventStream;",
            ">;",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ")",
            "Landroidx/media3/exoplayer/dash/manifest/Period;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/Period;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    move-object v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/manifest/Period;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/Descriptor;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public buildRangedUri(Ljava/lang/String;JJ)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 6

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/manifest/RangedUri;-><init>(Ljava/lang/String;JJ)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public buildRepresentation(Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Landroidx/media3/exoplayer/dash/manifest/Representation;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/common/z;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/r;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroidx/media3/exoplayer/dash/manifest/Representation;"
        }
    .end annotation

    .line 1
    iget-object v1, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->format:Landroidx/media3/common/w;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iput-object p2, v1, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static/range {p3 .. p3}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, v1, Landroidx/media3/common/v;->c:Lf6/m0;

    .line 23
    .line 24
    :goto_0
    iget-object v0, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->drmSchemeType:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    move-object/from16 v0, p4

    .line 29
    .line 30
    :cond_1
    iget-object v2, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->drmSchemeDatas:Ljava/util/ArrayList;

    .line 31
    .line 32
    move-object/from16 v3, p5

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    invoke-static {v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->fillInClearKeyInformation(Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->filterRedundantIncompleteSchemeDatas(Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroidx/media3/common/s;

    .line 50
    .line 51
    invoke-direct {v3, v0, v2}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v1, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 55
    .line 56
    :cond_2
    iget-object v9, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->inbandEventStreams:Ljava/util/ArrayList;

    .line 57
    .line 58
    move-object/from16 v0, p6

    .line 59
    .line 60
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    iget-wide v4, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->revisionId:J

    .line 64
    .line 65
    new-instance v6, Landroidx/media3/common/w;

    .line 66
    .line 67
    invoke-direct {v6, v1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 68
    .line 69
    .line 70
    iget-object v7, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->baseUrls:Lf6/m0;

    .line 71
    .line 72
    iget-object v8, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->segmentBase:Landroidx/media3/exoplayer/dash/manifest/SegmentBase;

    .line 73
    .line 74
    iget-object v10, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->essentialProperties:Ljava/util/List;

    .line 75
    .line 76
    iget-object v11, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->supplementalProperties:Ljava/util/List;

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    invoke-static/range {v4 .. v12}, Landroidx/media3/exoplayer/dash/manifest/Representation;->newInstance(JLandroidx/media3/common/w;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
.end method

.method public buildSegmentList(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJLjava/util/List;JLjava/util/List;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/dash/manifest/RangedUri;",
            "JJJJ",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;J",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/RangedUri;",
            ">;JJ)",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 2
    .line 3
    invoke-static/range {p14 .. p15}, Lh1/i0;->S(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v14

    .line 7
    invoke-static/range {p16 .. p17}, Lh1/i0;->S(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v16

    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    move-wide/from16 v2, p2

    .line 14
    .line 15
    move-wide/from16 v4, p4

    .line 16
    .line 17
    move-wide/from16 v6, p6

    .line 18
    .line 19
    move-wide/from16 v8, p8

    .line 20
    .line 21
    move-object/from16 v10, p10

    .line 22
    .line 23
    move-wide/from16 v11, p11

    .line 24
    .line 25
    move-object/from16 v13, p13

    .line 26
    .line 27
    invoke-direct/range {v0 .. v17}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJLjava/util/List;JLjava/util/List;JJ)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public buildSegmentTemplate(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJJLjava/util/List;JLandroidx/media3/exoplayer/dash/manifest/UrlTemplate;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/dash/manifest/RangedUri;",
            "JJJJJ",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;J",
            "Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;",
            "Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;",
            "JJ)",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 2
    .line 3
    invoke-static/range {p17 .. p18}, Lh1/i0;->S(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v17

    .line 7
    invoke-static/range {p19 .. p20}, Lh1/i0;->S(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v19

    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    move-wide/from16 v2, p2

    .line 14
    .line 15
    move-wide/from16 v4, p4

    .line 16
    .line 17
    move-wide/from16 v6, p6

    .line 18
    .line 19
    move-wide/from16 v8, p8

    .line 20
    .line 21
    move-wide/from16 v10, p10

    .line 22
    .line 23
    move-object/from16 v12, p12

    .line 24
    .line 25
    move-wide/from16 v13, p13

    .line 26
    .line 27
    move-object/from16 v15, p15

    .line 28
    .line 29
    move-object/from16 v16, p16

    .line 30
    .line 31
    invoke-direct/range {v0 .. v20}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJJLjava/util/List;JLandroidx/media3/exoplayer/dash/manifest/UrlTemplate;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;JJ)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public buildSegmentTimelineElement(JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;-><init>(JJ)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public buildSingleSegmentBase(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;
    .locals 10

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    move-wide/from16 v6, p6

    .line 7
    .line 8
    move-wide/from16 v8, p8

    .line 9
    .line 10
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public buildUtcTimingElement(Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public parse(Landroid/net/Uri;Ljava/io/InputStream;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;
    .locals 3

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->xmlParserFactory:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v1

    .line 3
    invoke-interface {v1, p2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 4
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p2

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    .line 5
    const-string p2, "MPD"

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p0, v1, p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseMediaPresentationDescription(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    .line 7
    :cond_0
    const-string p1, "inputStream does not contain a valid media presentation description"

    invoke-static {p1, v0}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :goto_0
    invoke-static {v0, p1}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic parse(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parse(Landroid/net/Uri;Ljava/io/InputStream;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    move-result-object p1

    return-object p1
.end method

.method public parseAdaptationSet(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase;",
            "JJJJJZ)",
            "Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    const-wide/16 v3, -0x1

    .line 8
    .line 9
    invoke-static {v1, v2, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v28

    .line 13
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentType(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const-string v3, "mimeType"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-interface {v1, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v5, "codecs"

    .line 25
    .line 26
    invoke-interface {v1, v4, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const-string v6, "width"

    .line 31
    .line 32
    const/4 v7, -0x1

    .line 33
    invoke-static {v1, v6, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const-string v8, "height"

    .line 38
    .line 39
    invoke-static {v1, v8, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    const/high16 v9, -0x40800000    # -1.0f

    .line 44
    .line 45
    invoke-static {v1, v9}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFrameRate(Lorg/xmlpull/v1/XmlPullParser;F)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    const-string v10, "audioSamplingRate"

    .line 50
    .line 51
    invoke-static {v1, v10, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    const-string v11, "lang"

    .line 56
    .line 57
    invoke-interface {v1, v4, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    const-string v13, "label"

    .line 62
    .line 63
    invoke-interface {v1, v4, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v30

    .line 67
    new-instance v13, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v14, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v15, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    move-object/from16 v16, v13

    .line 83
    .line 84
    new-instance v13, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    move-object/from16 v17, v12

    .line 90
    .line 91
    new-instance v12, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v7, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    move-object/from16 v19, v15

    .line 102
    .line 103
    new-instance v15, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v4, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    move/from16 v21, v2

    .line 114
    .line 115
    new-instance v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    const/16 v31, 0x0

    .line 121
    .line 122
    move-wide/from16 v23, p8

    .line 123
    .line 124
    move-object/from16 v18, v3

    .line 125
    .line 126
    move-object/from16 v22, v5

    .line 127
    .line 128
    move/from16 v25, v6

    .line 129
    .line 130
    move/from16 v26, v8

    .line 131
    .line 132
    move v8, v9

    .line 133
    move-object/from16 v6, v17

    .line 134
    .line 135
    move/from16 v5, v21

    .line 136
    .line 137
    move/from16 v32, v31

    .line 138
    .line 139
    const/4 v9, -0x1

    .line 140
    const/16 v33, 0x0

    .line 141
    .line 142
    move-object/from16 v17, p3

    .line 143
    .line 144
    move-object/from16 v21, v4

    .line 145
    .line 146
    move-wide/from16 v3, p6

    .line 147
    .line 148
    :goto_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 149
    .line 150
    .line 151
    move/from16 p3, v8

    .line 152
    .line 153
    const-string v8, "BaseURL"

    .line 154
    .line 155
    invoke-static {v1, v8}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_1

    .line 160
    .line 161
    if-nez v32, :cond_0

    .line 162
    .line 163
    invoke-virtual {v0, v1, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    const/16 v32, 0x1

    .line 168
    .line 169
    :cond_0
    move-object/from16 v8, p2

    .line 170
    .line 171
    move-wide/from16 p6, v3

    .line 172
    .line 173
    move/from16 v3, p14

    .line 174
    .line 175
    invoke-virtual {v0, v1, v8, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 180
    .line 181
    .line 182
    move-object/from16 v35, v2

    .line 183
    .line 184
    move-object/from16 v40, v11

    .line 185
    .line 186
    move-object/from16 v34, v14

    .line 187
    .line 188
    move-object v3, v15

    .line 189
    move-object/from16 v4, v17

    .line 190
    .line 191
    move-object/from16 v2, v19

    .line 192
    .line 193
    move-object/from16 p9, v21

    .line 194
    .line 195
    const/16 v39, 0x0

    .line 196
    .line 197
    move/from16 v14, p3

    .line 198
    .line 199
    move-object/from16 v19, v7

    .line 200
    .line 201
    move/from16 v21, v9

    .line 202
    .line 203
    move v15, v10

    .line 204
    move-object/from16 v17, v12

    .line 205
    .line 206
    move-object/from16 v9, v16

    .line 207
    .line 208
    move-wide/from16 v7, p6

    .line 209
    .line 210
    :goto_1
    move-object/from16 v16, v13

    .line 211
    .line 212
    goto/16 :goto_8

    .line 213
    .line 214
    :cond_1
    move-object/from16 v8, p2

    .line 215
    .line 216
    move-wide/from16 v34, v3

    .line 217
    .line 218
    move/from16 v3, p14

    .line 219
    .line 220
    const-string v4, "ContentProtection"

    .line 221
    .line 222
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_4

    .line 227
    .line 228
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentProtection(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    iget-object v0, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 233
    .line 234
    if-eqz v0, :cond_2

    .line 235
    .line 236
    move-object/from16 v33, v0

    .line 237
    .line 238
    check-cast v33, Ljava/lang/String;

    .line 239
    .line 240
    :cond_2
    iget-object v0, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 241
    .line 242
    if-eqz v0, :cond_3

    .line 243
    .line 244
    check-cast v0, Landroidx/media3/common/r;

    .line 245
    .line 246
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    :cond_3
    move-wide/from16 v3, v34

    .line 250
    .line 251
    move-object/from16 v35, v2

    .line 252
    .line 253
    move-object/from16 v2, v19

    .line 254
    .line 255
    move-object/from16 v19, v7

    .line 256
    .line 257
    move-wide v7, v3

    .line 258
    move-object/from16 v40, v11

    .line 259
    .line 260
    move-object/from16 v34, v14

    .line 261
    .line 262
    move-object v3, v15

    .line 263
    move-object/from16 v4, v17

    .line 264
    .line 265
    move-object/from16 p9, v21

    .line 266
    .line 267
    const/16 v39, 0x0

    .line 268
    .line 269
    :goto_2
    move/from16 v14, p3

    .line 270
    .line 271
    move/from16 v21, v9

    .line 272
    .line 273
    move v15, v10

    .line 274
    move-object/from16 v17, v12

    .line 275
    .line 276
    move-object/from16 v9, v16

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_4
    const-string v0, "ContentComponent"

    .line 280
    .line 281
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_5

    .line 286
    .line 287
    const/4 v0, 0x0

    .line 288
    invoke-interface {v1, v0, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-static {v6, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->checkLanguageConsistency(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentType(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    invoke-static {v5, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->checkContentTypeConsistency(II)I

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    move-wide/from16 v39, v34

    .line 305
    .line 306
    move-object/from16 v35, v2

    .line 307
    .line 308
    move-object/from16 v2, v19

    .line 309
    .line 310
    move-object/from16 v19, v7

    .line 311
    .line 312
    move-wide/from16 v7, v39

    .line 313
    .line 314
    move-object/from16 v39, v0

    .line 315
    .line 316
    move-object v6, v4

    .line 317
    move-object/from16 v40, v11

    .line 318
    .line 319
    move-object/from16 v34, v14

    .line 320
    .line 321
    move-object v3, v15

    .line 322
    move-object/from16 v4, v17

    .line 323
    .line 324
    move-object/from16 p9, v21

    .line 325
    .line 326
    goto :goto_2

    .line 327
    :cond_5
    const/4 v0, 0x0

    .line 328
    const-string v4, "Role"

    .line 329
    .line 330
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v20

    .line 334
    if-eqz v20, :cond_6

    .line 335
    .line 336
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    :goto_3
    move-wide/from16 v3, v34

    .line 344
    .line 345
    move-object/from16 v35, v2

    .line 346
    .line 347
    move-object/from16 v2, v19

    .line 348
    .line 349
    move-object/from16 v19, v7

    .line 350
    .line 351
    move-wide v7, v3

    .line 352
    move-object/from16 v39, v0

    .line 353
    .line 354
    move-object/from16 v20, v6

    .line 355
    .line 356
    move-object/from16 v40, v11

    .line 357
    .line 358
    move-object/from16 v34, v14

    .line 359
    .line 360
    move-object v3, v15

    .line 361
    move-object/from16 v4, v17

    .line 362
    .line 363
    move-object/from16 p9, v21

    .line 364
    .line 365
    move/from16 v14, p3

    .line 366
    .line 367
    move/from16 v21, v9

    .line 368
    .line 369
    move v15, v10

    .line 370
    move-object/from16 v17, v12

    .line 371
    .line 372
    move-object/from16 v9, v16

    .line 373
    .line 374
    move-object/from16 v16, v13

    .line 375
    .line 376
    move-wide/from16 v41, v23

    .line 377
    .line 378
    move/from16 v23, v5

    .line 379
    .line 380
    move-wide/from16 v5, v41

    .line 381
    .line 382
    goto/16 :goto_7

    .line 383
    .line 384
    :cond_6
    const-string v4, "AudioChannelConfiguration"

    .line 385
    .line 386
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-eqz v4, :cond_7

    .line 391
    .line 392
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAudioChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    move-wide/from16 v39, v34

    .line 397
    .line 398
    move-object/from16 v35, v2

    .line 399
    .line 400
    move-object/from16 v2, v19

    .line 401
    .line 402
    move-object/from16 v19, v7

    .line 403
    .line 404
    move-wide/from16 v7, v39

    .line 405
    .line 406
    move-object/from16 v39, v0

    .line 407
    .line 408
    move-object/from16 v40, v11

    .line 409
    .line 410
    move-object/from16 v34, v14

    .line 411
    .line 412
    move-object v3, v15

    .line 413
    move-object/from16 v9, v16

    .line 414
    .line 415
    move-object/from16 p9, v21

    .line 416
    .line 417
    move/from16 v14, p3

    .line 418
    .line 419
    move/from16 v21, v4

    .line 420
    .line 421
    move v15, v10

    .line 422
    move-object/from16 v16, v13

    .line 423
    .line 424
    move-object/from16 v4, v17

    .line 425
    .line 426
    move-object/from16 v17, v12

    .line 427
    .line 428
    goto/16 :goto_8

    .line 429
    .line 430
    :cond_7
    const-string v4, "Accessibility"

    .line 431
    .line 432
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 433
    .line 434
    .line 435
    move-result v20

    .line 436
    if-eqz v20, :cond_8

    .line 437
    .line 438
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_3

    .line 446
    :cond_8
    const-string v4, "EssentialProperty"

    .line 447
    .line 448
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 449
    .line 450
    .line 451
    move-result v20

    .line 452
    if-eqz v20, :cond_9

    .line 453
    .line 454
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    goto :goto_3

    .line 462
    :cond_9
    const-string v4, "SupplementalProperty"

    .line 463
    .line 464
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 465
    .line 466
    .line 467
    move-result v20

    .line 468
    if-eqz v20, :cond_a

    .line 469
    .line 470
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    goto/16 :goto_3

    .line 478
    .line 479
    :cond_a
    const-string v4, "Representation"

    .line 480
    .line 481
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    if-eqz v4, :cond_c

    .line 486
    .line 487
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    move-object/from16 v39, v0

    .line 492
    .line 493
    move/from16 v27, v3

    .line 494
    .line 495
    move v0, v5

    .line 496
    if-nez v4, :cond_b

    .line 497
    .line 498
    move-object/from16 v38, v21

    .line 499
    .line 500
    move-object/from16 v5, v22

    .line 501
    .line 502
    move-wide/from16 v21, v34

    .line 503
    .line 504
    move-object v3, v2

    .line 505
    move-object/from16 v35, v3

    .line 506
    .line 507
    move/from16 v8, p3

    .line 508
    .line 509
    move-object/from16 v40, v11

    .line 510
    .line 511
    move-object/from16 v36, v16

    .line 512
    .line 513
    move-object/from16 v16, v17

    .line 514
    .line 515
    move-object/from16 v4, v18

    .line 516
    .line 517
    move-object/from16 v37, v19

    .line 518
    .line 519
    :goto_4
    move-wide/from16 v19, p4

    .line 520
    .line 521
    move-wide/from16 v17, p10

    .line 522
    .line 523
    move-object v11, v6

    .line 524
    move-object/from16 v34, v14

    .line 525
    .line 526
    move/from16 v6, v25

    .line 527
    .line 528
    move-object v2, v1

    .line 529
    move-object v14, v7

    .line 530
    move/from16 v7, v26

    .line 531
    .line 532
    move-object/from16 v1, p0

    .line 533
    .line 534
    move-wide/from16 v25, p12

    .line 535
    .line 536
    goto :goto_5

    .line 537
    :cond_b
    move-object v3, v8

    .line 538
    move-object/from16 v38, v21

    .line 539
    .line 540
    move-object/from16 v5, v22

    .line 541
    .line 542
    move-wide/from16 v21, v34

    .line 543
    .line 544
    move-object/from16 v35, v2

    .line 545
    .line 546
    move-object/from16 v40, v11

    .line 547
    .line 548
    move-object/from16 v36, v16

    .line 549
    .line 550
    move-object/from16 v16, v17

    .line 551
    .line 552
    move-object/from16 v4, v18

    .line 553
    .line 554
    move-object/from16 v37, v19

    .line 555
    .line 556
    move/from16 v8, p3

    .line 557
    .line 558
    goto :goto_4

    .line 559
    :goto_5
    invoke-virtual/range {v1 .. v27}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRepresentation(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIFIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    move-object/from16 v18, v4

    .line 564
    .line 565
    move/from16 v25, v6

    .line 566
    .line 567
    move/from16 v26, v7

    .line 568
    .line 569
    move-object/from16 v20, v11

    .line 570
    .line 571
    move-object/from16 v17, v12

    .line 572
    .line 573
    move-object/from16 v19, v14

    .line 574
    .line 575
    move-object/from16 v4, v16

    .line 576
    .line 577
    move v14, v8

    .line 578
    move-object/from16 v16, v13

    .line 579
    .line 580
    move-object v13, v15

    .line 581
    move-wide/from16 v7, v21

    .line 582
    .line 583
    move-object/from16 v22, v5

    .line 584
    .line 585
    move/from16 v21, v9

    .line 586
    .line 587
    move v15, v10

    .line 588
    move-wide/from16 v5, v23

    .line 589
    .line 590
    iget-object v9, v3, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->format:Landroidx/media3/common/w;

    .line 591
    .line 592
    iget-object v9, v9, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 593
    .line 594
    invoke-static {v9}, Landroidx/media3/common/u0;->i(Ljava/lang/String;)I

    .line 595
    .line 596
    .line 597
    move-result v9

    .line 598
    invoke-static {v0, v9}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->checkContentTypeConsistency(II)I

    .line 599
    .line 600
    .line 601
    move-result v0

    .line 602
    move-object/from16 v9, v38

    .line 603
    .line 604
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-object v1, v2

    .line 608
    :goto_6
    move-object/from16 p9, v9

    .line 609
    .line 610
    move-object v3, v13

    .line 611
    move-object/from16 v6, v20

    .line 612
    .line 613
    move-object/from16 v9, v36

    .line 614
    .line 615
    move-object/from16 v2, v37

    .line 616
    .line 617
    move v5, v0

    .line 618
    goto/16 :goto_8

    .line 619
    .line 620
    :cond_c
    move-object/from16 v4, v21

    .line 621
    .line 622
    move/from16 v21, v9

    .line 623
    .line 624
    move-object v9, v4

    .line 625
    move-object/from16 v39, v0

    .line 626
    .line 627
    move v0, v5

    .line 628
    move-object/from16 v20, v6

    .line 629
    .line 630
    move-object/from16 v40, v11

    .line 631
    .line 632
    move-object/from16 v36, v16

    .line 633
    .line 634
    move-object/from16 v4, v17

    .line 635
    .line 636
    move-object/from16 v37, v19

    .line 637
    .line 638
    move-wide/from16 v5, v23

    .line 639
    .line 640
    move-object/from16 v19, v7

    .line 641
    .line 642
    move-object/from16 v17, v12

    .line 643
    .line 644
    move-object/from16 v16, v13

    .line 645
    .line 646
    move-object v13, v15

    .line 647
    move-wide/from16 v7, v34

    .line 648
    .line 649
    move-object/from16 v35, v2

    .line 650
    .line 651
    move v15, v10

    .line 652
    move-object/from16 v34, v14

    .line 653
    .line 654
    move/from16 v14, p3

    .line 655
    .line 656
    move-object v2, v1

    .line 657
    move-object/from16 v1, p0

    .line 658
    .line 659
    const-string v3, "SegmentBase"

    .line 660
    .line 661
    invoke-static {v2, v3}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    if-eqz v3, :cond_d

    .line 666
    .line 667
    move-object v3, v4

    .line 668
    check-cast v3, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 669
    .line 670
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    move-object v1, v2

    .line 675
    move-object v4, v3

    .line 676
    move-wide/from16 v23, v5

    .line 677
    .line 678
    goto :goto_6

    .line 679
    :cond_d
    const-string v3, "SegmentList"

    .line 680
    .line 681
    invoke-static {v2, v3}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    if-eqz v3, :cond_e

    .line 686
    .line 687
    move-object/from16 v38, v9

    .line 688
    .line 689
    invoke-virtual {v1, v2, v5, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 690
    .line 691
    .line 692
    move-result-wide v9

    .line 693
    move-object v2, v4

    .line 694
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 695
    .line 696
    move-wide/from16 v5, p4

    .line 697
    .line 698
    move-wide/from16 v3, p10

    .line 699
    .line 700
    move-wide/from16 v11, p12

    .line 701
    .line 702
    move/from16 v23, v0

    .line 703
    .line 704
    move-object v0, v1

    .line 705
    move-object/from16 p9, v38

    .line 706
    .line 707
    move-object/from16 v1, p1

    .line 708
    .line 709
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    move-object v4, v2

    .line 714
    move-object v3, v13

    .line 715
    move-object/from16 v6, v20

    .line 716
    .line 717
    move/from16 v5, v23

    .line 718
    .line 719
    move-object/from16 v2, v37

    .line 720
    .line 721
    move-wide/from16 v23, v9

    .line 722
    .line 723
    move-object/from16 v9, v36

    .line 724
    .line 725
    goto/16 :goto_8

    .line 726
    .line 727
    :cond_e
    move/from16 v23, v0

    .line 728
    .line 729
    move-object v0, v1

    .line 730
    move-object v1, v2

    .line 731
    move-object/from16 p9, v9

    .line 732
    .line 733
    const-string v2, "SegmentTemplate"

    .line 734
    .line 735
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eqz v2, :cond_f

    .line 740
    .line 741
    invoke-virtual {v0, v1, v5, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 742
    .line 743
    .line 744
    move-result-wide v10

    .line 745
    move-object v2, v4

    .line 746
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 747
    .line 748
    move-wide/from16 v4, p10

    .line 749
    .line 750
    move-wide v8, v7

    .line 751
    move-object v3, v13

    .line 752
    move-wide/from16 v6, p4

    .line 753
    .line 754
    move-wide/from16 v12, p12

    .line 755
    .line 756
    invoke-virtual/range {v0 .. v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    move-wide v7, v8

    .line 761
    move-object v4, v2

    .line 762
    move-object/from16 v6, v20

    .line 763
    .line 764
    move/from16 v5, v23

    .line 765
    .line 766
    move-object/from16 v9, v36

    .line 767
    .line 768
    move-object/from16 v2, v37

    .line 769
    .line 770
    move-wide/from16 v23, v10

    .line 771
    .line 772
    goto :goto_8

    .line 773
    :cond_f
    move-object v3, v13

    .line 774
    const-string v0, "InbandEventStream"

    .line 775
    .line 776
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    if-eqz v2, :cond_10

    .line 781
    .line 782
    invoke-static {v1, v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    move-object/from16 v2, v37

    .line 787
    .line 788
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-object/from16 v9, v36

    .line 792
    .line 793
    goto :goto_7

    .line 794
    :cond_10
    move-object/from16 v2, v37

    .line 795
    .line 796
    const-string v0, "Label"

    .line 797
    .line 798
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-eqz v0, :cond_11

    .line 803
    .line 804
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLabel(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/common/z;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    move-object/from16 v9, v36

    .line 809
    .line 810
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    goto :goto_7

    .line 814
    :cond_11
    move-object/from16 v9, v36

    .line 815
    .line 816
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    const/4 v10, 0x2

    .line 821
    if-ne v0, v10, :cond_12

    .line 822
    .line 823
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAdaptationSetChild(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 824
    .line 825
    .line 826
    :cond_12
    :goto_7
    move-wide/from16 v41, v5

    .line 827
    .line 828
    move/from16 v5, v23

    .line 829
    .line 830
    move-wide/from16 v23, v41

    .line 831
    .line 832
    move-object/from16 v6, v20

    .line 833
    .line 834
    :goto_8
    const-string v0, "AdaptationSet"

    .line 835
    .line 836
    invoke-static {v1, v0}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    if-eqz v0, :cond_14

    .line 841
    .line 842
    new-instance v0, Ljava/util/ArrayList;

    .line 843
    .line 844
    invoke-virtual/range {p9 .. p9}, Ljava/util/ArrayList;->size()I

    .line 845
    .line 846
    .line 847
    move-result v1

    .line 848
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 849
    .line 850
    .line 851
    move/from16 v1, v31

    .line 852
    .line 853
    :goto_9
    invoke-virtual/range {p9 .. p9}, Ljava/util/ArrayList;->size()I

    .line 854
    .line 855
    .line 856
    move-result v4

    .line 857
    if-ge v1, v4, :cond_13

    .line 858
    .line 859
    move-object/from16 v10, p9

    .line 860
    .line 861
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    check-cast v4, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;

    .line 866
    .line 867
    move-object/from16 p1, p0

    .line 868
    .line 869
    move-object/from16 p7, v2

    .line 870
    .line 871
    move-object/from16 p2, v4

    .line 872
    .line 873
    move-object/from16 p4, v9

    .line 874
    .line 875
    move-object/from16 p3, v30

    .line 876
    .line 877
    move-object/from16 p5, v33

    .line 878
    .line 879
    move-object/from16 p6, v34

    .line 880
    .line 881
    invoke-virtual/range {p1 .. p7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildRepresentation(Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    move-object/from16 v9, p3

    .line 886
    .line 887
    move-object/from16 v36, p4

    .line 888
    .line 889
    move-object/from16 v37, p7

    .line 890
    .line 891
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    add-int/lit8 v1, v1, 0x1

    .line 895
    .line 896
    move-object/from16 v30, v9

    .line 897
    .line 898
    move-object/from16 v9, v36

    .line 899
    .line 900
    move-object/from16 v2, v37

    .line 901
    .line 902
    goto :goto_9

    .line 903
    :cond_13
    move-object/from16 p1, p0

    .line 904
    .line 905
    move-object/from16 p5, v0

    .line 906
    .line 907
    move-object/from16 p8, v3

    .line 908
    .line 909
    move/from16 p4, v5

    .line 910
    .line 911
    move-object/from16 p6, v16

    .line 912
    .line 913
    move-object/from16 p7, v19

    .line 914
    .line 915
    move-wide/from16 p2, v28

    .line 916
    .line 917
    invoke-virtual/range {p1 .. p8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildAdaptationSet(JILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    return-object v0

    .line 922
    :cond_14
    move-object/from16 v0, p0

    .line 923
    .line 924
    move v10, v15

    .line 925
    move-object/from16 v13, v16

    .line 926
    .line 927
    move-object/from16 v12, v17

    .line 928
    .line 929
    move-object/from16 v11, v40

    .line 930
    .line 931
    move-object v15, v3

    .line 932
    move-object/from16 v17, v4

    .line 933
    .line 934
    move-wide v3, v7

    .line 935
    move-object/from16 v16, v9

    .line 936
    .line 937
    move v8, v14

    .line 938
    move-object/from16 v7, v19

    .line 939
    .line 940
    move/from16 v9, v21

    .line 941
    .line 942
    move-object/from16 v14, v34

    .line 943
    .line 944
    move-object/from16 v21, p9

    .line 945
    .line 946
    move-object/from16 v19, v2

    .line 947
    .line 948
    move-object/from16 v2, v35

    .line 949
    .line 950
    goto/16 :goto_0
.end method

.method public parseAdaptationSetChild(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public parseAudioChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 3

    .line 1
    const-string v0, "schemeIdUri"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, -0x1

    .line 16
    sparse-switch v1, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    :goto_0
    move v0, v2

    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v1, "urn:dolby:dash:audio_channel_configuration:2011"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x6

    .line 31
    goto :goto_1

    .line 32
    :sswitch_1
    const-string v1, "tag:dts.com,2018:uhd:audio_channel_configuration"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x5

    .line 42
    goto :goto_1

    .line 43
    :sswitch_2
    const-string v1, "tag:dts.com,2014:dash:audio_channel_configuration:2012"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v0, 0x4

    .line 53
    goto :goto_1

    .line 54
    :sswitch_3
    const-string v1, "urn:mpeg:mpegB:cicp:ChannelConfiguration"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 v0, 0x3

    .line 64
    goto :goto_1

    .line 65
    :sswitch_4
    const-string v1, "tag:dolby.com,2014:dash:audio_channel_configuration:2011"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const/4 v0, 0x2

    .line 75
    goto :goto_1

    .line 76
    :sswitch_5
    const-string v1, "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    const/4 v0, 0x1

    .line 86
    goto :goto_1

    .line 87
    :sswitch_6
    const-string v1, "urn:dts:dash:audio_channel_configuration:2012"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    const/4 v0, 0x0

    .line 97
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :pswitch_0
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDtsxChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    goto :goto_2

    .line 106
    :pswitch_1
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseMpegChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    goto :goto_2

    .line 111
    :pswitch_2
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDolbyChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    goto :goto_2

    .line 116
    :pswitch_3
    const-string v0, "value"

    .line 117
    .line 118
    invoke-static {p1, v0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    goto :goto_2

    .line 123
    :pswitch_4
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDtsChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    :cond_7
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 128
    .line 129
    .line 130
    const-string v0, "AudioChannelConfiguration"

    .line 131
    .line 132
    invoke-static {p1, v0}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_7

    .line 137
    .line 138
    return v2

    .line 139
    :sswitch_data_0
    .sparse-switch
        -0x7ee09c90 -> :sswitch_6
        -0x50a2db6e -> :sswitch_5
        -0x43d6a909 -> :sswitch_4
        -0x3aced4cf -> :sswitch_3
        -0x4b58cf3 -> :sswitch_2
        0x129b7989 -> :sswitch_1
        0x79657164 -> :sswitch_0
    .end sparse-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "availabilityTimeOffset"

    .line 3
    .line 4
    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return-wide p2

    .line 11
    :cond_0
    const-string p2, "INF"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    const-wide p1, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    return-wide p1

    .line 25
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const p2, 0x49742400    # 1000000.0f

    .line 30
    .line 31
    .line 32
    mul-float/2addr p1, p2

    .line 33
    float-to-long p1, p1

    .line 34
    return-wide p1
.end method

.method public parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;Z)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "dvb:priority"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/high16 v0, -0x80000000

    .line 21
    .line 22
    :goto_0
    const-string v3, "dvb:weight"

    .line 23
    .line 24
    invoke-interface {p1, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    :cond_2
    const-string v3, "serviceLocation"

    .line 35
    .line 36
    invoke-interface {p1, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v3, "BaseURL"

    .line 41
    .line 42
    invoke-static {p1, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseText(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    invoke-static {p1}, Lh1/a;->u(Ljava/lang/String;)[I

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    aget v4, v4, v3

    .line 54
    .line 55
    const/4 v5, -0x1

    .line 56
    if-eq v4, v5, :cond_4

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    move-object v1, p1

    .line 61
    :cond_3
    new-instance p2, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 62
    .line 63
    invoke-direct {p2, p1, v1, v0, v2}, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 64
    .line 65
    .line 66
    filled-new-array {p2}, [Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, Lf6/u;->n([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-ge v3, v5, :cond_7

    .line 85
    .line 86
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 91
    .line 92
    iget-object v6, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->url:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v6, p1}, Lh1/a;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    if-nez v1, :cond_5

    .line 99
    .line 100
    move-object v7, v6

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    move-object v7, v1

    .line 103
    :goto_2
    if-eqz p3, :cond_6

    .line 104
    .line 105
    iget v0, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->priority:I

    .line 106
    .line 107
    iget v2, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->weight:I

    .line 108
    .line 109
    iget-object v7, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->serviceLocation:Ljava/lang/String;

    .line 110
    .line 111
    :cond_6
    new-instance v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 112
    .line 113
    invoke-direct {v5, v6, v7, v0, v2}, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    return-object v4
.end method

.method public parseContentProtection(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/r;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "schemeIdUri"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, -0x1

    .line 10
    const/16 v4, 0x3a

    .line 11
    .line 12
    const-string v5, "MpdParser"

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    if-eqz v0, :cond_9

    .line 16
    .line 17
    invoke-static {v0}, Lcom/bumptech/glide/c;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    sparse-switch v7, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    :goto_0
    move v0, v3

    .line 32
    goto :goto_1

    .line 33
    :sswitch_0
    const-string v7, "urn:mpeg:dash:mp4protection:2011"

    .line 34
    .line 35
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x3

    .line 43
    goto :goto_1

    .line 44
    :sswitch_1
    const-string v7, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 45
    .line 46
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v0, v2

    .line 54
    goto :goto_1

    .line 55
    :sswitch_2
    const-string v7, "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"

    .line 56
    .line 57
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const/4 v0, 0x1

    .line 65
    goto :goto_1

    .line 66
    :sswitch_3
    const-string v7, "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"

    .line 67
    .line 68
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move v0, v6

    .line 76
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_9

    .line 80
    .line 81
    :pswitch_0
    const-string v0, "value"

    .line 82
    .line 83
    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    move v8, v6

    .line 92
    :goto_2
    if-ge v8, v7, :cond_6

    .line 93
    .line 94
    invoke-interface {p1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-virtual {v9, v4}, Ljava/lang/String;->indexOf(I)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-ne v10, v3, :cond_4

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 106
    .line 107
    invoke-virtual {v9, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    :goto_3
    const-string v10, "default_KID"

    .line 112
    .line 113
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_5

    .line 118
    .line 119
    invoke-interface {p1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_6
    move-object v7, v1

    .line 128
    :goto_4
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-nez v8, :cond_8

    .line 133
    .line 134
    const-string v8, "00000000-0000-0000-0000-000000000000"

    .line 135
    .line 136
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-nez v8, :cond_8

    .line 141
    .line 142
    const-string v8, "\\s+"

    .line 143
    .line 144
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    array-length v8, v7

    .line 149
    new-array v8, v8, [Ljava/util/UUID;

    .line 150
    .line 151
    move v9, v6

    .line 152
    :goto_5
    array-length v10, v7

    .line 153
    if-ge v9, v10, :cond_7

    .line 154
    .line 155
    aget-object v10, v7, v9

    .line 156
    .line 157
    invoke-static {v10}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    aput-object v10, v8, v9

    .line 162
    .line 163
    add-int/lit8 v9, v9, 0x1

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    sget-object v7, Landroidx/media3/common/k;->b:Ljava/util/UUID;

    .line 167
    .line 168
    invoke-static {v7, v8, v1}, Lh2/p;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    move-object v9, v1

    .line 173
    goto :goto_a

    .line 174
    :cond_8
    const-string v7, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute."

    .line 175
    .line 176
    invoke-static {v5, v7}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    move-object v7, v1

    .line 180
    :goto_6
    move-object v8, v7

    .line 181
    :goto_7
    move-object v9, v8

    .line 182
    goto :goto_a

    .line 183
    :pswitch_1
    sget-object v7, Landroidx/media3/common/k;->d:Ljava/util/UUID;

    .line 184
    .line 185
    :goto_8
    move-object v0, v1

    .line 186
    move-object v8, v0

    .line 187
    goto :goto_7

    .line 188
    :pswitch_2
    sget-object v7, Landroidx/media3/common/k;->e:Ljava/util/UUID;

    .line 189
    .line 190
    goto :goto_8

    .line 191
    :pswitch_3
    sget-object v7, Landroidx/media3/common/k;->c:Ljava/util/UUID;

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_9
    :goto_9
    move-object v0, v1

    .line 195
    move-object v7, v0

    .line 196
    goto :goto_6

    .line 197
    :cond_a
    :goto_a
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 198
    .line 199
    .line 200
    const-string v10, "clearkey:Laurl"

    .line 201
    .line 202
    invoke-static {p1, v10}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    const/4 v11, 0x4

    .line 207
    if-nez v10, :cond_b

    .line 208
    .line 209
    const-string v10, "dashif:Laurl"

    .line 210
    .line 211
    invoke-static {p1, v10}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-eqz v10, :cond_c

    .line 216
    .line 217
    :cond_b
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-ne v10, v11, :cond_c

    .line 222
    .line 223
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    goto/16 :goto_d

    .line 228
    .line 229
    :cond_c
    const-string v10, "ms:laurl"

    .line 230
    .line 231
    invoke-static {p1, v10}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    if-eqz v10, :cond_d

    .line 236
    .line 237
    const-string v9, "licenseUrl"

    .line 238
    .line 239
    invoke-interface {p1, v1, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    goto/16 :goto_d

    .line 244
    .line 245
    :cond_d
    if-nez v8, :cond_11

    .line 246
    .line 247
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-ne v10, v2, :cond_11

    .line 252
    .line 253
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-virtual {v10, v4}, Ljava/lang/String;->indexOf(I)I

    .line 258
    .line 259
    .line 260
    move-result v12

    .line 261
    if-ne v12, v3, :cond_e

    .line 262
    .line 263
    goto :goto_b

    .line 264
    :cond_e
    add-int/lit8 v12, v12, 0x1

    .line 265
    .line 266
    invoke-virtual {v10, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    :goto_b
    const-string v12, "pssh"

    .line 271
    .line 272
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    if-eqz v10, :cond_11

    .line 277
    .line 278
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-ne v10, v11, :cond_11

    .line 283
    .line 284
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-static {v7, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-static {v7}, Lh2/p;->i([B)La4/o;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    if-nez v8, :cond_f

    .line 297
    .line 298
    move-object v8, v1

    .line 299
    goto :goto_c

    .line 300
    :cond_f
    iget-object v8, v8, La4/o;->k:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v8, Ljava/util/UUID;

    .line 303
    .line 304
    :goto_c
    if-nez v8, :cond_10

    .line 305
    .line 306
    const-string v7, "Skipping malformed cenc:pssh data"

    .line 307
    .line 308
    invoke-static {v5, v7}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    move-object v7, v8

    .line 312
    move-object v8, v1

    .line 313
    goto :goto_d

    .line 314
    :cond_10
    move-object v13, v8

    .line 315
    move-object v8, v7

    .line 316
    move-object v7, v13

    .line 317
    goto :goto_d

    .line 318
    :cond_11
    if-nez v8, :cond_12

    .line 319
    .line 320
    sget-object v10, Landroidx/media3/common/k;->e:Ljava/util/UUID;

    .line 321
    .line 322
    invoke-virtual {v10, v7}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    if-eqz v12, :cond_12

    .line 327
    .line 328
    const-string v12, "mspr:pro"

    .line 329
    .line 330
    invoke-static {p1, v12}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v12

    .line 334
    if-eqz v12, :cond_12

    .line 335
    .line 336
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    if-ne v12, v11, :cond_12

    .line 341
    .line 342
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    invoke-static {v8, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    invoke-static {v10, v1, v8}, Lh2/p;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    goto :goto_d

    .line 355
    :cond_12
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 356
    .line 357
    .line 358
    :goto_d
    const-string v10, "ContentProtection"

    .line 359
    .line 360
    invoke-static {p1, v10}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    if-eqz v10, :cond_a

    .line 365
    .line 366
    if-eqz v7, :cond_13

    .line 367
    .line 368
    new-instance v1, Landroidx/media3/common/r;

    .line 369
    .line 370
    const-string p1, "video/mp4"

    .line 371
    .line 372
    invoke-direct {v1, v7, v9, p1, v8}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 373
    .line 374
    .line 375
    :cond_13
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    return-object p1

    .line 380
    nop

    .line 381
    :sswitch_data_0
    .sparse-switch
        -0x7610741f -> :sswitch_3
        0x1d2c5beb -> :sswitch_2
        0x2d06c692 -> :sswitch_1
        0x6c0c9d2a -> :sswitch_0
    .end sparse-switch

    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public parseContentType(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "contentType"

    .line 3
    .line 4
    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const-string v0, "audio"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_1
    const-string v0, "video"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x2

    .line 35
    return p1

    .line 36
    :cond_2
    const-string v0, "text"

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    const/4 p1, 0x3

    .line 45
    return p1

    .line 46
    :cond_3
    const-string v0, "image"

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    const/4 p1, 0x4

    .line 55
    return p1

    .line 56
    :cond_4
    return v1
.end method

.method public parseEvent(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;JJLjava/io/ByteArrayOutputStream;)Landroid/util/Pair;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/io/ByteArrayOutputStream;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ly1/a;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v7

    .line 11
    const-string v1, "duration"

    .line 12
    .line 13
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v9

    .line 22
    const-string v1, "presentationTime"

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    sget v3, Lh1/i0;->a:I

    .line 29
    .line 30
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 31
    .line 32
    const-wide/16 v11, 0x3e8

    .line 33
    .line 34
    move-wide/from16 v13, p4

    .line 35
    .line 36
    invoke-static/range {v9 .. v15}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    sub-long v11, v1, p6

    .line 41
    .line 42
    const-wide/32 v13, 0xf4240

    .line 43
    .line 44
    .line 45
    move-object/from16 v17, v15

    .line 46
    .line 47
    move-wide/from16 v15, p4

    .line 48
    .line 49
    invoke-static/range {v11 .. v17}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    const-string v3, "messageData"

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static {v0, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    move-object/from16 v4, p0

    .line 61
    .line 62
    move-object/from16 v5, p8

    .line 63
    .line 64
    invoke-virtual {v4, v0, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEventObject(Lorg/xmlpull/v1/XmlPullParser;Ljava/io/ByteArrayOutputStream;)[B

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-nez v3, :cond_0

    .line 73
    .line 74
    :goto_0
    move-object/from16 v5, p2

    .line 75
    .line 76
    move-object/from16 v6, p3

    .line 77
    .line 78
    move-object v11, v0

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 81
    .line 82
    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_0

    .line 87
    :goto_1
    invoke-virtual/range {v4 .. v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildEvent(Ljava/lang/String;Ljava/lang/String;JJ[B)Ly1/a;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method

.method public parseEventObject(Lorg/xmlpull/v1/XmlPullParser;Ljava/io/ByteArrayOutputStream;)[B
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0, p2, v1}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 18
    .line 19
    .line 20
    :goto_0
    const-string v1, "Event"

    .line 21
    .line 22
    invoke-static {p1, v1}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    packed-switch v1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :pswitch_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->docdecl(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :pswitch_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->comment(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :pswitch_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->processingInstruction(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :pswitch_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->ignorableWhitespace(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :pswitch_4
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->entityRef(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :pswitch_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->cdsect(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :pswitch_6
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :pswitch_7
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :pswitch_8
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 115
    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    :goto_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-ge v1, v2, :cond_0

    .line 123
    .line 124
    invoke-interface {p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-interface {p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-interface {v0, v2, v3, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 137
    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :pswitch_9
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :pswitch_a
    const/4 v1, 0x0

    .line 147
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 150
    .line 151
    .line 152
    :cond_0
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlSerializer;->flush()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
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
.end method

.method public parseEventStream(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/EventStream;
    .locals 11

    .line 1
    const-string v0, "schemeIdUri"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const-string v0, "value"

    .line 10
    .line 11
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v0, "timescale"

    .line 16
    .line 17
    const-wide/16 v1, 0x1

    .line 18
    .line 19
    invoke-static {p1, v0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    const-string v0, "presentationTimeOffset"

    .line 24
    .line 25
    const-wide/16 v1, 0x0

    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v8

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 37
    .line 38
    const/16 v1, 0x200

    .line 39
    .line 40
    invoke-direct {v10, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 44
    .line 45
    .line 46
    const-string v1, "Event"

    .line 47
    .line 48
    invoke-static {p1, v1}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    move-object v2, p0

    .line 55
    move-wide v6, v5

    .line 56
    move-object v5, v4

    .line 57
    move-object v4, v3

    .line 58
    move-object v3, p1

    .line 59
    invoke-virtual/range {v2 .. v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEvent(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;JJLjava/io/ByteArrayOutputStream;)Landroid/util/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    move-wide v6, v5

    .line 68
    move-object v5, v4

    .line 69
    move-object v4, v3

    .line 70
    move-object v3, p1

    .line 71
    invoke-static {v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    const-string p1, "EventStream"

    .line 75
    .line 76
    invoke-static {v3, p1}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    new-array p1, p1, [J

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    new-array v8, v1, [Ly1/a;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-ge v1, v2, :cond_1

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Landroid/util/Pair;

    .line 106
    .line 107
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v9

    .line 115
    aput-wide v9, p1, v1

    .line 116
    .line 117
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Ly1/a;

    .line 120
    .line 121
    aput-object v2, v8, v1

    .line 122
    .line 123
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    move-object v2, p0

    .line 127
    move-object v3, v4

    .line 128
    move-object v4, v5

    .line 129
    move-wide v5, v6

    .line 130
    move-object v7, p1

    .line 131
    invoke-virtual/range {v2 .. v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildEventStream(Ljava/lang/String;Ljava/lang/String;J[J[Ly1/a;)Landroidx/media3/exoplayer/dash/manifest/EventStream;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :cond_2
    move-object p1, v3

    .line 137
    move-object v3, v4

    .line 138
    move-object v4, v5

    .line 139
    move-wide v5, v6

    .line 140
    goto :goto_0
.end method

.method public parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 2

    .line 1
    const-string v0, "sourceURL"

    .line 2
    .line 3
    const-string v1, "range"

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRangedUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public parseLabel(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/common/z;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "lang"

    .line 3
    .line 4
    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "Label"

    .line 9
    .line 10
    invoke-static {p1, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseText(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v1, Landroidx/media3/common/z;

    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, Landroidx/media3/common/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method

.method public parseMediaPresentationDescription(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/String;

    .line 7
    .line 8
    const-string v4, "profiles"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v4, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseProfiles(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->isDvbProfileDeclared([Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v11

    .line 18
    const-string v3, "availabilityStartTime"

    .line 19
    .line 20
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDateTime(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    const-string v3, "mediaPresentationDuration"

    .line 30
    .line 31
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v14

    .line 35
    const-string v3, "minBufferTime"

    .line 36
    .line 37
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v16

    .line 41
    const-string v3, "type"

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-interface {v1, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v5, "dynamic"

    .line 49
    .line 50
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v18

    .line 54
    if-eqz v18, :cond_0

    .line 55
    .line 56
    const-string v3, "minimumUpdatePeriod"

    .line 57
    .line 58
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    move-wide/from16 v19, v5

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-wide/from16 v19, v12

    .line 66
    .line 67
    :goto_0
    if-eqz v18, :cond_1

    .line 68
    .line 69
    const-string v3, "timeShiftBufferDepth"

    .line 70
    .line 71
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    move-wide v9, v5

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move-wide v9, v12

    .line 78
    :goto_1
    if-eqz v18, :cond_2

    .line 79
    .line 80
    const-string v3, "suggestedPresentationDelay"

    .line 81
    .line 82
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    move-wide/from16 v21, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move-wide/from16 v21, v12

    .line 90
    .line 91
    :goto_2
    const-string v3, "publishTime"

    .line 92
    .line 93
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDateTime(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v23

    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    if-eqz v18, :cond_3

    .line 100
    .line 101
    move-wide/from16 v25, v5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move-wide/from16 v25, v12

    .line 105
    .line 106
    :goto_3
    new-instance v3, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 107
    .line 108
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    move-wide/from16 v29, v12

    .line 117
    .line 118
    const/4 v12, 0x1

    .line 119
    if-eqz v11, :cond_4

    .line 120
    .line 121
    move v13, v12

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    const/high16 v13, -0x80000000

    .line 124
    .line 125
    :goto_4
    invoke-direct {v3, v2, v4, v13, v12}, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 126
    .line 127
    .line 128
    filled-new-array {v3}, [Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, Lf6/u;->n([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    new-instance v2, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    new-instance v3, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    if-eqz v18, :cond_5

    .line 147
    .line 148
    move-wide/from16 v5, v29

    .line 149
    .line 150
    :cond_5
    move-object/from16 v31, v13

    .line 151
    .line 152
    move-wide/from16 v12, v25

    .line 153
    .line 154
    const/16 v25, 0x0

    .line 155
    .line 156
    const/16 v27, 0x0

    .line 157
    .line 158
    const/16 v32, 0x0

    .line 159
    .line 160
    const/16 v33, 0x0

    .line 161
    .line 162
    const/16 v34, 0x0

    .line 163
    .line 164
    const/16 v35, 0x0

    .line 165
    .line 166
    :goto_5
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 167
    .line 168
    .line 169
    const-string v4, "BaseURL"

    .line 170
    .line 171
    invoke-static {v1, v4}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_7

    .line 176
    .line 177
    if-nez v27, :cond_6

    .line 178
    .line 179
    invoke-virtual {v0, v1, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 180
    .line 181
    .line 182
    move-result-wide v12

    .line 183
    const/16 v27, 0x1

    .line 184
    .line 185
    :cond_6
    move-object/from16 v4, v31

    .line 186
    .line 187
    move-object/from16 v31, v2

    .line 188
    .line 189
    invoke-virtual {v0, v1, v4, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 194
    .line 195
    .line 196
    :goto_6
    move-object/from16 v28, v3

    .line 197
    .line 198
    move-wide v2, v12

    .line 199
    move-wide/from16 v36, v14

    .line 200
    .line 201
    move-object/from16 v12, v31

    .line 202
    .line 203
    move-object/from16 v31, v4

    .line 204
    .line 205
    goto/16 :goto_b

    .line 206
    .line 207
    :cond_7
    move-object/from16 v4, v31

    .line 208
    .line 209
    move-object/from16 v31, v2

    .line 210
    .line 211
    const-string v2, "ProgramInformation"

    .line 212
    .line 213
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_8

    .line 218
    .line 219
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseProgramInformation(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;

    .line 220
    .line 221
    .line 222
    move-result-object v32

    .line 223
    goto :goto_6

    .line 224
    :cond_8
    const-string v2, "UTCTiming"

    .line 225
    .line 226
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_9

    .line 231
    .line 232
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseUtcTiming(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;

    .line 233
    .line 234
    .line 235
    move-result-object v33

    .line 236
    goto :goto_6

    .line 237
    :cond_9
    const-string v2, "Location"

    .line 238
    .line 239
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_a

    .line 244
    .line 245
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {v2, v0}, Lh1/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 254
    .line 255
    .line 256
    move-result-object v34

    .line 257
    goto :goto_6

    .line 258
    :cond_a
    const-string v0, "ServiceDescription"

    .line 259
    .line 260
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_b

    .line 265
    .line 266
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseServiceDescription(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;

    .line 267
    .line 268
    .line 269
    move-result-object v35

    .line 270
    goto :goto_6

    .line 271
    :cond_b
    const-string v0, "Period"

    .line 272
    .line 273
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_10

    .line 278
    .line 279
    if-nez v25, :cond_10

    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_c

    .line 286
    .line 287
    move-object v2, v3

    .line 288
    move-object/from16 v28, v2

    .line 289
    .line 290
    move-object/from16 v38, v31

    .line 291
    .line 292
    move-object/from16 v31, v4

    .line 293
    .line 294
    move-wide v3, v5

    .line 295
    move-wide v5, v12

    .line 296
    move-object/from16 v12, v38

    .line 297
    .line 298
    :goto_7
    move-object/from16 v0, p0

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    goto :goto_8

    .line 302
    :cond_c
    move-object/from16 v28, v3

    .line 303
    .line 304
    move-object v2, v4

    .line 305
    move-wide v3, v5

    .line 306
    move-wide v5, v12

    .line 307
    move-object/from16 v12, v31

    .line 308
    .line 309
    move-object/from16 v31, v2

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :goto_8
    invoke-virtual/range {v0 .. v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parsePeriod(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;JJJJZ)Landroid/util/Pair;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, Landroidx/media3/exoplayer/dash/manifest/Period;

    .line 319
    .line 320
    move-wide/from16 v36, v14

    .line 321
    .line 322
    iget-wide v13, v0, Landroidx/media3/exoplayer/dash/manifest/Period;->startMs:J

    .line 323
    .line 324
    cmp-long v13, v13, v29

    .line 325
    .line 326
    if-nez v13, :cond_e

    .line 327
    .line 328
    if-eqz v18, :cond_d

    .line 329
    .line 330
    move-wide v13, v3

    .line 331
    const/16 v25, 0x1

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    const-string v1, "Unable to determine start of period "

    .line 337
    .line 338
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    const/4 v15, 0x0

    .line 353
    invoke-static {v0, v15}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    throw v0

    .line 358
    :cond_e
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v2, Ljava/lang/Long;

    .line 361
    .line 362
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 363
    .line 364
    .line 365
    move-result-wide v2

    .line 366
    cmp-long v4, v2, v29

    .line 367
    .line 368
    if-nez v4, :cond_f

    .line 369
    .line 370
    move-wide/from16 v13, v29

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_f
    iget-wide v13, v0, Landroidx/media3/exoplayer/dash/manifest/Period;->startMs:J

    .line 374
    .line 375
    add-long/2addr v13, v2

    .line 376
    :goto_9
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    :goto_a
    move-wide v2, v5

    .line 380
    move-wide v5, v13

    .line 381
    goto :goto_b

    .line 382
    :cond_10
    move-object/from16 v28, v3

    .line 383
    .line 384
    move-wide/from16 v36, v14

    .line 385
    .line 386
    move-object/from16 v38, v31

    .line 387
    .line 388
    move-object/from16 v31, v4

    .line 389
    .line 390
    move-wide v3, v5

    .line 391
    move-wide v5, v12

    .line 392
    move-object/from16 v12, v38

    .line 393
    .line 394
    invoke-static {v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 395
    .line 396
    .line 397
    move-wide/from16 v38, v5

    .line 398
    .line 399
    move-wide v5, v3

    .line 400
    move-wide/from16 v2, v38

    .line 401
    .line 402
    :goto_b
    const-string v0, "MPD"

    .line 403
    .line 404
    invoke-static {v1, v0}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-eqz v0, :cond_15

    .line 409
    .line 410
    cmp-long v0, v36, v29

    .line 411
    .line 412
    if-nez v0, :cond_12

    .line 413
    .line 414
    cmp-long v0, v5, v29

    .line 415
    .line 416
    if-eqz v0, :cond_11

    .line 417
    .line 418
    move-wide v4, v5

    .line 419
    const/4 v15, 0x0

    .line 420
    goto :goto_d

    .line 421
    :cond_11
    if-eqz v18, :cond_13

    .line 422
    .line 423
    :cond_12
    const/4 v15, 0x0

    .line 424
    goto :goto_c

    .line 425
    :cond_13
    const-string v0, "Unable to determine duration of static manifest."

    .line 426
    .line 427
    const/4 v15, 0x0

    .line 428
    invoke-static {v0, v15}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    throw v0

    .line 433
    :goto_c
    move-wide/from16 v4, v36

    .line 434
    .line 435
    :goto_d
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-nez v0, :cond_14

    .line 440
    .line 441
    move-object/from16 v1, p0

    .line 442
    .line 443
    move-wide v2, v7

    .line 444
    move-wide/from16 v6, v16

    .line 445
    .line 446
    move/from16 v8, v18

    .line 447
    .line 448
    move-wide/from16 v13, v21

    .line 449
    .line 450
    move-wide/from16 v15, v23

    .line 451
    .line 452
    move-object/from16 v17, v32

    .line 453
    .line 454
    move-object/from16 v18, v33

    .line 455
    .line 456
    move-object/from16 v21, v12

    .line 457
    .line 458
    move-wide v11, v9

    .line 459
    move-wide/from16 v9, v19

    .line 460
    .line 461
    move-object/from16 v20, v34

    .line 462
    .line 463
    move-object/from16 v19, v35

    .line 464
    .line 465
    invoke-virtual/range {v1 .. v21}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildMediaPresentationDescription(JJJZJJJJLandroidx/media3/exoplayer/dash/manifest/ProgramInformation;Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;Landroid/net/Uri;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    return-object v0

    .line 470
    :cond_14
    move-object v0, v15

    .line 471
    const-string v1, "No periods found."

    .line 472
    .line 473
    invoke-static {v1, v0}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    throw v0

    .line 478
    :cond_15
    move-wide v14, v9

    .line 479
    move-wide/from16 v9, v16

    .line 480
    .line 481
    move/from16 v4, v18

    .line 482
    .line 483
    move-object/from16 v17, v32

    .line 484
    .line 485
    move-object/from16 v18, v33

    .line 486
    .line 487
    const/4 v0, 0x0

    .line 488
    move-object/from16 v16, v12

    .line 489
    .line 490
    move-wide/from16 v12, v19

    .line 491
    .line 492
    move-object/from16 v20, v34

    .line 493
    .line 494
    move-object/from16 v19, v35

    .line 495
    .line 496
    move-object/from16 v0, p0

    .line 497
    .line 498
    move/from16 v18, v4

    .line 499
    .line 500
    move-wide/from16 v19, v12

    .line 501
    .line 502
    move-wide v12, v2

    .line 503
    move-object/from16 v2, v16

    .line 504
    .line 505
    move-object/from16 v3, v28

    .line 506
    .line 507
    move-wide/from16 v16, v9

    .line 508
    .line 509
    move-wide v9, v14

    .line 510
    move-wide/from16 v14, v36

    .line 511
    .line 512
    goto/16 :goto_5
.end method

.method public parsePeriod(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;JJJJZ)Landroid/util/Pair;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;JJJJZ)",
            "Landroid/util/Pair<",
            "Landroidx/media3/exoplayer/dash/manifest/Period;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    const/4 v15, 0x0

    .line 8
    invoke-interface {v1, v15, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v16

    .line 12
    const-string v2, "start"

    .line 13
    .line 14
    move-wide/from16 v3, p3

    .line 15
    .line 16
    invoke-static {v1, v2, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v17

    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v4, p7, v2

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    add-long v4, p7, v17

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-wide v4, v2

    .line 33
    :goto_0
    const-string v6, "duration"

    .line 34
    .line 35
    invoke-static {v1, v6, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    new-instance v8, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v9, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v10, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    move-wide/from16 v21, v2

    .line 56
    .line 57
    move-object v13, v9

    .line 58
    move/from16 v19, v11

    .line 59
    .line 60
    move-object/from16 v20, v15

    .line 61
    .line 62
    move-wide/from16 v11, p5

    .line 63
    .line 64
    move-object v2, v8

    .line 65
    move-object/from16 v3, v20

    .line 66
    .line 67
    move-wide/from16 v8, v21

    .line 68
    .line 69
    :goto_1
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 70
    .line 71
    .line 72
    const-string v14, "BaseURL"

    .line 73
    .line 74
    invoke-static {v1, v14}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    if-eqz v14, :cond_2

    .line 79
    .line 80
    if-nez v19, :cond_1

    .line 81
    .line 82
    invoke-virtual {v0, v1, v11, v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v11

    .line 86
    const/16 v19, 0x1

    .line 87
    .line 88
    :cond_1
    move-object/from16 v14, p2

    .line 89
    .line 90
    move/from16 v15, p11

    .line 91
    .line 92
    move-object/from16 p3, v2

    .line 93
    .line 94
    invoke-virtual {v0, v1, v14, v15}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 99
    .line 100
    .line 101
    move-object/from16 v24, p3

    .line 102
    .line 103
    move-wide/from16 v25, v11

    .line 104
    .line 105
    move-object/from16 p4, v13

    .line 106
    .line 107
    move/from16 v11, v19

    .line 108
    .line 109
    move-wide/from16 v14, v21

    .line 110
    .line 111
    const/16 v23, 0x0

    .line 112
    .line 113
    move-wide v12, v6

    .line 114
    move-object/from16 v21, v10

    .line 115
    .line 116
    move-object/from16 v6, v20

    .line 117
    .line 118
    move-object v7, v1

    .line 119
    move-object v10, v3

    .line 120
    move-wide/from16 v19, v8

    .line 121
    .line 122
    move-wide v8, v4

    .line 123
    goto/16 :goto_8

    .line 124
    .line 125
    :cond_2
    move-object/from16 v14, p2

    .line 126
    .line 127
    move/from16 v15, p11

    .line 128
    .line 129
    move-object/from16 p3, v2

    .line 130
    .line 131
    const-string v2, "AdaptationSet"

    .line 132
    .line 133
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_3

    .line 144
    .line 145
    move-object v2, v10

    .line 146
    move-object/from16 v21, v2

    .line 147
    .line 148
    :goto_2
    move-object/from16 v24, v13

    .line 149
    .line 150
    move v14, v15

    .line 151
    move-object/from16 v15, p3

    .line 152
    .line 153
    move-wide/from16 v27, v11

    .line 154
    .line 155
    move-wide/from16 v12, p9

    .line 156
    .line 157
    move-wide v10, v4

    .line 158
    move-wide v4, v6

    .line 159
    move-wide/from16 v6, v27

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    move-object/from16 v21, v10

    .line 163
    .line 164
    move-object v2, v14

    .line 165
    goto :goto_2

    .line 166
    :goto_3
    invoke-virtual/range {v0 .. v14}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAdaptationSet(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    move-wide/from16 v27, v6

    .line 171
    .line 172
    move-wide v6, v4

    .line 173
    move-wide v4, v10

    .line 174
    move-wide v10, v8

    .line 175
    move-wide/from16 v8, v27

    .line 176
    .line 177
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-object/from16 p3, v3

    .line 181
    .line 182
    move-wide v12, v6

    .line 183
    move-object/from16 p4, v24

    .line 184
    .line 185
    const/16 v23, 0x0

    .line 186
    .line 187
    move-object v7, v1

    .line 188
    move-wide v0, v8

    .line 189
    move-object/from16 v24, v15

    .line 190
    .line 191
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    :goto_4
    move-wide v8, v4

    .line 197
    goto/16 :goto_7

    .line 198
    .line 199
    :cond_4
    move-object/from16 v15, p3

    .line 200
    .line 201
    move-object/from16 v21, v10

    .line 202
    .line 203
    move-object/from16 v24, v13

    .line 204
    .line 205
    move-wide/from16 v27, v11

    .line 206
    .line 207
    move-wide v10, v8

    .line 208
    move-wide/from16 v8, v27

    .line 209
    .line 210
    const-string v2, "EventStream"

    .line 211
    .line 212
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEventStream(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/EventStream;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move-object/from16 v14, v24

    .line 223
    .line 224
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-object/from16 p3, v3

    .line 228
    .line 229
    move-wide v12, v6

    .line 230
    move-object/from16 p4, v14

    .line 231
    .line 232
    move-object/from16 v24, v15

    .line 233
    .line 234
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    const/16 v23, 0x0

    .line 240
    .line 241
    move-object v7, v1

    .line 242
    move-wide v0, v8

    .line 243
    goto :goto_4

    .line 244
    :cond_5
    move-object/from16 v14, v24

    .line 245
    .line 246
    const-string v2, "SegmentBase"

    .line 247
    .line 248
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_6

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    invoke-virtual {v0, v1, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    move-wide/from16 v25, v8

    .line 260
    .line 261
    move-object/from16 v23, v13

    .line 262
    .line 263
    move-object/from16 p4, v14

    .line 264
    .line 265
    move-object/from16 v24, v15

    .line 266
    .line 267
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    move-wide v8, v4

    .line 273
    move-wide v12, v6

    .line 274
    move-object/from16 v6, v20

    .line 275
    .line 276
    move-object v7, v1

    .line 277
    :goto_5
    move-wide/from16 v27, v10

    .line 278
    .line 279
    move-object v10, v3

    .line 280
    :goto_6
    move/from16 v11, v19

    .line 281
    .line 282
    move-wide/from16 v19, v27

    .line 283
    .line 284
    goto/16 :goto_8

    .line 285
    .line 286
    :cond_6
    const/4 v13, 0x0

    .line 287
    const-string v2, "SegmentList"

    .line 288
    .line 289
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_7

    .line 294
    .line 295
    move-wide/from16 v22, v4

    .line 296
    .line 297
    move-wide v5, v6

    .line 298
    move-wide v7, v8

    .line 299
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v9

    .line 308
    move-wide/from16 v25, v2

    .line 309
    .line 310
    const/4 v2, 0x0

    .line 311
    move-wide/from16 v11, p9

    .line 312
    .line 313
    move-object/from16 p4, v14

    .line 314
    .line 315
    move-object/from16 v24, v15

    .line 316
    .line 317
    move-wide/from16 v3, v22

    .line 318
    .line 319
    move-wide/from16 v14, v25

    .line 320
    .line 321
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    move-wide v10, v9

    .line 326
    move-wide v8, v7

    .line 327
    move-wide v6, v5

    .line 328
    move-wide v4, v3

    .line 329
    move-wide/from16 v25, v8

    .line 330
    .line 331
    move-object/from16 v23, v13

    .line 332
    .line 333
    move-wide v8, v4

    .line 334
    move-wide v12, v6

    .line 335
    move-object/from16 v6, v20

    .line 336
    .line 337
    move-object v7, v1

    .line 338
    move-wide/from16 v27, v10

    .line 339
    .line 340
    move-object v10, v2

    .line 341
    goto :goto_6

    .line 342
    :cond_7
    move-object/from16 p3, v3

    .line 343
    .line 344
    move-object/from16 p4, v14

    .line 345
    .line 346
    move-object/from16 v24, v15

    .line 347
    .line 348
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    const-string v2, "SegmentTemplate"

    .line 354
    .line 355
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_8

    .line 360
    .line 361
    invoke-virtual {v0, v1, v14, v15}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 362
    .line 363
    .line 364
    move-result-wide v10

    .line 365
    sget-object v2, Lf6/m0;->k:Lf6/k0;

    .line 366
    .line 367
    sget-object v3, Lf6/l1;->n:Lf6/l1;

    .line 368
    .line 369
    const/4 v2, 0x0

    .line 370
    move-object/from16 v23, v13

    .line 371
    .line 372
    move-wide/from16 v12, p9

    .line 373
    .line 374
    invoke-virtual/range {v0 .. v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    move-wide v12, v6

    .line 379
    move-object v7, v1

    .line 380
    move-wide v0, v8

    .line 381
    move-wide v8, v4

    .line 382
    move-wide/from16 v25, v0

    .line 383
    .line 384
    move-object/from16 v6, v20

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_8
    move-object/from16 v23, v13

    .line 388
    .line 389
    move-wide v12, v6

    .line 390
    move-object v7, v1

    .line 391
    move-wide v0, v8

    .line 392
    move-wide v8, v4

    .line 393
    const-string v2, "AssetIdentifier"

    .line 394
    .line 395
    invoke-static {v7, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_9

    .line 400
    .line 401
    invoke-static {v7, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 402
    .line 403
    .line 404
    move-result-object v20

    .line 405
    :goto_7
    move-wide/from16 v25, v0

    .line 406
    .line 407
    move-object/from16 v6, v20

    .line 408
    .line 409
    move-wide/from16 v27, v10

    .line 410
    .line 411
    move-object/from16 v10, p3

    .line 412
    .line 413
    goto/16 :goto_6

    .line 414
    .line 415
    :cond_9
    invoke-static {v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 416
    .line 417
    .line 418
    goto :goto_7

    .line 419
    :goto_8
    const-string v0, "Period"

    .line 420
    .line 421
    invoke-static {v7, v0}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_a

    .line 426
    .line 427
    move-object/from16 v0, p0

    .line 428
    .line 429
    move-object/from16 v5, p4

    .line 430
    .line 431
    move-object/from16 v1, v16

    .line 432
    .line 433
    move-wide/from16 v2, v17

    .line 434
    .line 435
    move-object/from16 v4, v24

    .line 436
    .line 437
    invoke-virtual/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildPeriod(Ljava/lang/String;JLjava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/Descriptor;)Landroidx/media3/exoplayer/dash/manifest/Period;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    return-object v0

    .line 450
    :cond_a
    move-object/from16 v0, p0

    .line 451
    .line 452
    move-object v1, v7

    .line 453
    move-wide v4, v8

    .line 454
    move-object v3, v10

    .line 455
    move-wide/from16 v8, v19

    .line 456
    .line 457
    move-object/from16 v10, v21

    .line 458
    .line 459
    move-object/from16 v2, v24

    .line 460
    .line 461
    move-object/from16 v20, v6

    .line 462
    .line 463
    move/from16 v19, v11

    .line 464
    .line 465
    move-wide v6, v12

    .line 466
    move-wide/from16 v21, v14

    .line 467
    .line 468
    move-object/from16 v15, v23

    .line 469
    .line 470
    move-wide/from16 v11, v25

    .line 471
    .line 472
    move-object/from16 v13, p4

    .line 473
    .line 474
    goto/16 :goto_1
.end method

.method public parseProfiles(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object p3

    .line 9
    :cond_0
    const-string p2, ","

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public parseProgramInformation(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;
    .locals 8

    .line 1
    const-string v0, "moreInformationURL"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    const-string v0, "lang"

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    move-object v0, v1

    .line 15
    move-object v2, v0

    .line 16
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 17
    .line 18
    .line 19
    const-string v3, "Title"

    .line 20
    .line 21
    invoke-static {p1, v3}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_1
    move-object v4, v0

    .line 32
    move-object v3, v1

    .line 33
    move-object v5, v2

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    const-string v3, "Source"

    .line 36
    .line 37
    invoke-static {p1, v3}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string v3, "Copyright"

    .line 49
    .line 50
    invoke-static {p1, v3}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :goto_2
    const-string v0, "ProgramInformation"

    .line 66
    .line 67
    invoke-static {p1, v0}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    new-instance v2, Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;

    .line 74
    .line 75
    invoke-direct/range {v2 .. v7}, Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_3
    move-object v1, v3

    .line 80
    move-object v0, v4

    .line 81
    move-object v2, v5

    .line 82
    goto :goto_0
.end method

.method public parseRangedUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v2

    .line 6
    invoke-interface {p1, v0, p3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-wide/16 p2, -0x1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const-string v0, "-"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    aget-object v0, p1, v0

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    array-length v3, p1

    .line 28
    const/4 v4, 0x2

    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    aget-object p1, p1, p2

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    sub-long/2addr p1, v0

    .line 39
    const-wide/16 v3, 0x1

    .line 40
    .line 41
    add-long p2, p1, v3

    .line 42
    .line 43
    :cond_0
    :goto_0
    move-wide v5, p2

    .line 44
    move-wide v3, v0

    .line 45
    move-object v1, p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-wide/16 v0, 0x0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :goto_1
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildRangedUri(Ljava/lang/String;JJ)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public parseRepresentation(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIFIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIFII",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase;",
            "JJJJJZ)",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    const-string v2, "id"

    const/4 v3, 0x0

    invoke-interface {v1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 2
    const-string v2, "bandwidth"

    const/4 v4, -0x1

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v15

    .line 3
    const-string v2, "mimeType"

    move-object/from16 v4, p3

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 4
    const-string v2, "codecs"

    move-object/from16 v4, p4

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 5
    const-string v2, "width"

    move/from16 v4, p5

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v18

    .line 6
    const-string v2, "height"

    move/from16 v4, p6

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v19

    move/from16 v2, p7

    .line 7
    invoke-static {v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFrameRate(Lorg/xmlpull/v1/XmlPullParser;F)F

    move-result v20

    .line 8
    const-string v2, "audioSamplingRate"

    move/from16 v4, p9

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v21

    .line 9
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v5, p13

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v22, v14

    .line 12
    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 v5, p14

    invoke-direct {v14, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    move/from16 v23, p8

    move-wide/from16 v9, p22

    move-object/from16 v24, v3

    move/from16 v25, v7

    move-object/from16 v3, p15

    move-wide/from16 v7, p20

    .line 14
    :goto_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 15
    const-string v11, "BaseURL"

    invoke-static {v1, v11}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    if-nez v25, :cond_0

    .line 16
    invoke-virtual {v0, v1, v7, v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v7

    const/16 v25, 0x1

    :cond_0
    move-object/from16 v11, p2

    move/from16 v12, p26

    move-object/from16 p7, v2

    .line 17
    invoke-virtual {v0, v1, v11, v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    move-object/from16 v27, v6

    move-wide/from16 v28, v9

    move-object v2, v14

    move/from16 v26, v15

    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v15, p7

    move-object/from16 v23, v3

    move-wide/from16 v24, v7

    :goto_1
    move-object v14, v13

    move-object v13, v4

    goto/16 :goto_6

    :cond_1
    move-object/from16 v11, p2

    move/from16 v12, p26

    move-object/from16 p7, v2

    .line 18
    const-string v2, "AudioChannelConfiguration"

    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 19
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAudioChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v2

    move-object v0, v1

    move-object/from16 v23, v3

    move-object/from16 v27, v6

    move-wide/from16 v28, v9

    move/from16 v26, v15

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v15, p7

    move v6, v2

    :goto_2
    move-wide/from16 v24, v7

    move-object v2, v14

    goto :goto_1

    .line 20
    :cond_2
    const-string v2, "SegmentBase"

    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 21
    check-cast v3, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    invoke-virtual {v0, v1, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    move-result-object v2

    move-object v0, v1

    move-object/from16 v27, v6

    move-wide/from16 v28, v9

    move/from16 v26, v15

    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v15, p7

    move-object/from16 v23, v2

    goto :goto_2

    .line 22
    :cond_3
    const-string v2, "SegmentList"

    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 23
    invoke-virtual {v0, v1, v9, v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v9

    .line 24
    move-object v2, v3

    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    move-wide/from16 v11, p24

    move-object/from16 v27, v6

    move-object/from16 p9, v14

    move/from16 v26, v15

    move-object/from16 v15, p7

    move-wide/from16 v5, p18

    move-object v14, v4

    move-wide/from16 v3, p16

    .line 25
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    move-result-object v2

    move-object v0, v14

    move-object v14, v13

    move-object v13, v0

    move-object v0, v1

    move-wide/from16 v28, v9

    :goto_3
    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v23, v2

    move-wide/from16 v24, v7

    move-object/from16 v2, p9

    goto/16 :goto_6

    :cond_4
    move-object/from16 v27, v6

    move-object/from16 p9, v14

    move/from16 v26, v15

    move-object/from16 v15, p7

    move-object v14, v4

    .line 26
    const-string v2, "SegmentTemplate"

    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 27
    invoke-virtual {v0, v1, v9, v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v10

    .line 28
    move-object v2, v3

    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    move-object/from16 v3, p14

    move-wide/from16 v4, p16

    move-wide v8, v7

    move-object/from16 p8, v14

    move-wide/from16 v6, p18

    move-object v14, v13

    move-wide/from16 v12, p24

    .line 29
    invoke-virtual/range {v0 .. v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    move-result-object v2

    move-object v0, v1

    move-wide v7, v8

    move-object/from16 v13, p8

    move-wide/from16 v28, v10

    goto :goto_3

    :cond_5
    move-object v0, v1

    move-object/from16 p8, v14

    move-object v14, v13

    .line 30
    const-string v1, "ContentProtection"

    invoke-static {v0, v1}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 31
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentProtection(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    move-result-object v1

    .line 32
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz v2, :cond_6

    .line 33
    move-object/from16 v24, v2

    check-cast v24, Ljava/lang/String;

    .line 34
    :cond_6
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v1, :cond_7

    .line 35
    check-cast v1, Landroidx/media3/common/r;

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v13, p8

    :goto_4
    move-object/from16 v2, p9

    :goto_5
    move-wide/from16 v28, v9

    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v23, v3

    move-wide/from16 v24, v7

    goto :goto_6

    .line 36
    :cond_8
    const-string v1, "InbandEventStream"

    invoke-static {v0, v1}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 37
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    move-result-object v1

    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v13, p8

    goto :goto_4

    .line 38
    :cond_9
    const-string v1, "EssentialProperty"

    invoke-static {v0, v1}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 39
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    move-result-object v1

    move-object/from16 v13, p8

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    move-object/from16 v13, p8

    .line 40
    const-string v1, "SupplementalProperty"

    invoke-static {v0, v1}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 41
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    move-result-object v1

    move-object/from16 v2, p9

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    move-object/from16 v2, p9

    .line 42
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_5

    .line 43
    :goto_6
    const-string v1, "Representation"

    invoke-static {v0, v1}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    move-object v0, v14

    move-object v14, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, v17

    move/from16 v3, v18

    move/from16 v4, v19

    move/from16 v5, v20

    move/from16 v7, v21

    move-object/from16 v1, v22

    move/from16 v8, v26

    .line 44
    invoke-virtual/range {v0 .. v14}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildFormat(Ljava/lang/String;Ljava/lang/String;IIFIIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Landroidx/media3/common/w;

    move-result-object v1

    if-eqz v23, :cond_c

    goto :goto_7

    .line 45
    :cond_c
    new-instance v23, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    invoke-direct/range {v23 .. v23}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;-><init>()V

    .line 46
    :goto_7
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;

    .line 47
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_8

    :cond_d
    move-object/from16 v27, p2

    :goto_8
    const-wide/16 v2, -0x1

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    move-wide/from16 p10, v2

    move-object/from16 p8, v13

    move-object/from16 p9, v14

    move-object/from16 p7, v15

    move-object/from16 p6, v16

    move-object/from16 p4, v23

    move-object/from16 p3, v27

    move-object/from16 p5, v30

    invoke-direct/range {p1 .. p11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;-><init>(Landroidx/media3/common/w;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;J)V

    return-object v0

    :cond_e
    move-object v1, v2

    move-object/from16 v0, v30

    move-object/from16 v5, p14

    move-object v4, v13

    move-object v13, v14

    move-object v2, v15

    move-object/from16 v3, v23

    move-wide/from16 v7, v24

    move/from16 v15, v26

    move-wide/from16 v9, v28

    move/from16 v25, v31

    move-object/from16 v24, v0

    move-object v14, v1

    move/from16 v23, v6

    move-object/from16 v6, v27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_0
.end method

.method public parseRoleFlagsFromAccessibilityDescriptors(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_2

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    const-string v3, "urn:mpeg:dash:role:2011"

    .line 16
    .line 17
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v4}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromDashRoleScheme(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :goto_1
    or-int/2addr v1, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    const-string v3, "urn:tva:metadata:cs:AudioPurposeCS:2007"

    .line 34
    .line 35
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3, v4}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseTvaAudioPurposeCsValue(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return v1
.end method

.method public parseRoleFlagsFromDashRoleScheme(Ljava/lang/String;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, -0x1

    .line 15
    sparse-switch v1, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :sswitch_0
    const-string v1, "supplementary"

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_1
    const/16 v6, 0xc

    .line 31
    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :sswitch_1
    const-string v1, "emergency"

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :cond_2
    const/16 v6, 0xb

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :sswitch_2
    const-string v1, "commentary"

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :cond_3
    const/16 v6, 0xa

    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :sswitch_3
    const-string v1, "caption"

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :cond_4
    const/16 v6, 0x9

    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :sswitch_4
    const-string v1, "sign"

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :cond_5
    move v6, v2

    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :sswitch_5
    const-string v1, "main"

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_6

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_6
    const/4 v6, 0x7

    .line 99
    goto :goto_0

    .line 100
    :sswitch_6
    const-string v1, "dub"

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_7

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_7
    const/4 v6, 0x6

    .line 110
    goto :goto_0

    .line 111
    :sswitch_7
    const-string v1, "forced-subtitle"

    .line 112
    .line 113
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-nez p1, :cond_8

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_8
    const/4 v6, 0x5

    .line 121
    goto :goto_0

    .line 122
    :sswitch_8
    const-string v1, "alternate"

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_9

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_9
    move v6, v3

    .line 132
    goto :goto_0

    .line 133
    :sswitch_9
    const-string v1, "forced_subtitle"

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_a

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_a
    const/4 v6, 0x3

    .line 143
    goto :goto_0

    .line 144
    :sswitch_a
    const-string v1, "enhanced-audio-intelligibility"

    .line 145
    .line 146
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-nez p1, :cond_b

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_b
    move v6, v4

    .line 154
    goto :goto_0

    .line 155
    :sswitch_b
    const-string v1, "description"

    .line 156
    .line 157
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-nez p1, :cond_c

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_c
    move v6, v5

    .line 165
    goto :goto_0

    .line 166
    :sswitch_c
    const-string v1, "subtitle"

    .line 167
    .line 168
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_d

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_d
    move v6, v0

    .line 176
    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 177
    .line 178
    .line 179
    return v0

    .line 180
    :pswitch_0
    return v3

    .line 181
    :pswitch_1
    const/16 p1, 0x20

    .line 182
    .line 183
    return p1

    .line 184
    :pswitch_2
    return v2

    .line 185
    :pswitch_3
    const/16 p1, 0x40

    .line 186
    .line 187
    return p1

    .line 188
    :pswitch_4
    const/16 p1, 0x100

    .line 189
    .line 190
    return p1

    .line 191
    :pswitch_5
    return v5

    .line 192
    :pswitch_6
    const/16 p1, 0x10

    .line 193
    .line 194
    return p1

    .line 195
    :pswitch_7
    return v4

    .line 196
    :pswitch_8
    const/16 p1, 0x800

    .line 197
    .line 198
    return p1

    .line 199
    :pswitch_9
    const/16 p1, 0x200

    .line 200
    .line 201
    return p1

    .line 202
    :pswitch_a
    const/16 p1, 0x80

    .line 203
    .line 204
    return p1

    .line 205
    :sswitch_data_0
    .sparse-switch
        -0x7ad0b3e8 -> :sswitch_c
        -0x66ca7c04 -> :sswitch_b
        -0x5e3a5c50 -> :sswitch_a
        -0x5dde3142 -> :sswitch_9
        -0x53ecbf86 -> :sswitch_8
        -0x533bdf74 -> :sswitch_7
        0x185f1 -> :sswitch_6
        0x3305b9 -> :sswitch_5
        0x35ddbd -> :sswitch_4
        0x20ef99e6 -> :sswitch_3
        0x3597fba9 -> :sswitch_2
        0x6118c591 -> :sswitch_1
        0x6e96bb0f -> :sswitch_0
    .end sparse-switch

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public parseRoleFlagsFromProperties(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    const-string v3, "http://dashif.org/guidelines/trickmode"

    .line 16
    .line 17
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v2}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x4000

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v1
.end method

.method public parseRoleFlagsFromRoleDescriptors(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    const-string v3, "urn:mpeg:dash:role:2011"

    .line 16
    .line 17
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v4}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromDashRoleScheme(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    or-int/2addr v1, v2

    .line 32
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return v1
.end method

.method public parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const-string v6, "timescale"

    .line 14
    .line 15
    invoke-static {v0, v6, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v9

    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-wide v6, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-wide v6, v4

    .line 27
    :goto_1
    const-string v8, "presentationTimeOffset"

    .line 28
    .line 29
    invoke-static {v0, v8, v6, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v11

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-wide v6, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexStart:J

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-wide v6, v4

    .line 39
    :goto_2
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-wide v4, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexLength:J

    .line 42
    .line 43
    :cond_3
    const-string v8, "indexRange"

    .line 44
    .line 45
    const/4 v13, 0x0

    .line 46
    invoke-interface {v0, v13, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    if-eqz v8, :cond_4

    .line 51
    .line 52
    const-string v4, "-"

    .line 53
    .line 54
    invoke-virtual {v8, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const/4 v5, 0x0

    .line 59
    aget-object v5, v4, v5

    .line 60
    .line 61
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    const/4 v5, 0x1

    .line 66
    aget-object v4, v4, v5

    .line 67
    .line 68
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    sub-long/2addr v4, v6

    .line 73
    add-long/2addr v4, v2

    .line 74
    :cond_4
    move-wide v15, v4

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    iget-object v13, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 78
    .line 79
    :cond_5
    :goto_3
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 80
    .line 81
    .line 82
    const-string v1, "Initialization"

    .line 83
    .line 84
    invoke-static {v0, v1}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    :goto_4
    move-object v8, v13

    .line 95
    goto :goto_5

    .line 96
    :cond_6
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :goto_5
    const-string v1, "SegmentBase"

    .line 101
    .line 102
    invoke-static {v0, v1}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_7

    .line 107
    .line 108
    move-wide v13, v6

    .line 109
    move-object/from16 v7, p0

    .line 110
    .line 111
    invoke-virtual/range {v7 .. v16}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSingleSegmentBase(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :cond_7
    move-object v13, v8

    .line 117
    goto :goto_3
.end method

.method public parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;
    .locals 24

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v6, :cond_0

    .line 8
    .line 9
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const-string v0, "timescale"

    .line 14
    .line 15
    invoke-static {v1, v0, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    if-eqz v6, :cond_1

    .line 20
    .line 21
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    :goto_1
    const-string v0, "presentationTimeOffset"

    .line 27
    .line 28
    invoke-static {v1, v0, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v10

    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->duration:J

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :goto_2
    const-string v0, "duration"

    .line 43
    .line 44
    invoke-static {v1, v0, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v14

    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    iget-wide v2, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->startNumber:J

    .line 51
    .line 52
    :cond_3
    const-string v0, "startNumber"

    .line 53
    .line 54
    invoke-static {v1, v0, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v12

    .line 58
    invoke-static/range {p7 .. p10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->getFinalAvailabilityTimeOffset(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v17

    .line 62
    const/4 v0, 0x0

    .line 63
    move-object v7, v0

    .line 64
    move-object/from16 v16, v7

    .line 65
    .line 66
    move-object/from16 v19, v16

    .line 67
    .line 68
    :goto_3
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 69
    .line 70
    .line 71
    const-string v0, "Initialization"

    .line 72
    .line 73
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object/from16 v16, v0

    .line 84
    .line 85
    move-wide v2, v8

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    const-string v0, "SegmentTimeline"

    .line 88
    .line 89
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    move-object/from16 v0, p0

    .line 96
    .line 97
    move-wide/from16 v4, p5

    .line 98
    .line 99
    move-wide v2, v8

    .line 100
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTimeline(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    move-object/from16 v19, v8

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move-wide v2, v8

    .line 108
    const-string v0, "SegmentURL"

    .line 109
    .line 110
    invoke-static {v1, v0}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    if-nez v7, :cond_6

    .line 117
    .line 118
    new-instance v7, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    :cond_6
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentUrl(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    invoke-static {v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 132
    .line 133
    .line 134
    :goto_4
    const-string v0, "SegmentList"

    .line 135
    .line 136
    invoke-static {v1, v0}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_c

    .line 141
    .line 142
    if-eqz v6, :cond_b

    .line 143
    .line 144
    if-eqz v16, :cond_8

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_8
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 148
    .line 149
    move-object/from16 v16, v0

    .line 150
    .line 151
    :goto_5
    if-eqz v19, :cond_9

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_9
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->segmentTimeline:Ljava/util/List;

    .line 155
    .line 156
    move-object/from16 v19, v0

    .line 157
    .line 158
    :goto_6
    if-eqz v7, :cond_a

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_a
    iget-object v7, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;->mediaSegments:Ljava/util/List;

    .line 162
    .line 163
    :cond_b
    :goto_7
    move-object/from16 v6, v19

    .line 164
    .line 165
    move-object/from16 v19, v7

    .line 166
    .line 167
    move-object/from16 v7, v16

    .line 168
    .line 169
    move-object/from16 v16, v6

    .line 170
    .line 171
    move-object/from16 v6, p0

    .line 172
    .line 173
    move-wide/from16 v22, p3

    .line 174
    .line 175
    move-wide/from16 v20, p11

    .line 176
    .line 177
    move-wide v8, v2

    .line 178
    invoke-virtual/range {v6 .. v23}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSegmentList(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJLjava/util/List;JLjava/util/List;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :cond_c
    move-wide v8, v2

    .line 184
    goto :goto_3
.end method

.method public parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;JJJJJ)",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    if-eqz v6, :cond_0

    .line 10
    .line 11
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v4, v2

    .line 15
    :goto_0
    const-string v7, "timescale"

    .line 16
    .line 17
    invoke-static {v1, v7, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    if-eqz v6, :cond_1

    .line 22
    .line 23
    iget-wide v7, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-wide/16 v7, 0x0

    .line 27
    .line 28
    :goto_1
    const-string v9, "presentationTimeOffset"

    .line 29
    .line 30
    invoke-static {v1, v9, v7, v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v7

    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    iget-wide v9, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->duration:J

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :goto_2
    const-string v11, "duration"

    .line 45
    .line 46
    invoke-static {v1, v11, v9, v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    if-eqz v6, :cond_3

    .line 51
    .line 52
    iget-wide v2, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->startNumber:J

    .line 53
    .line 54
    :cond_3
    const-string v9, "startNumber"

    .line 55
    .line 56
    invoke-static {v1, v9, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v9

    .line 60
    invoke-static/range {p3 .. p3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLastSegmentNumberSupplementalProperty(Ljava/util/List;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v13

    .line 64
    invoke-static/range {p8 .. p11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->getFinalAvailabilityTimeOffset(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v15

    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    iget-object v3, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;->mediaTemplate:Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/4 v3, 0x0

    .line 74
    :goto_3
    const-string v2, "media"

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseUrlTemplate(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 77
    .line 78
    .line 79
    move-result-object v17

    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    iget-object v2, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;->initializationTemplate:Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    const/4 v2, 0x0

    .line 86
    :goto_4
    const-string v3, "initialization"

    .line 87
    .line 88
    invoke-virtual {v0, v1, v3, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseUrlTemplate(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 89
    .line 90
    .line 91
    move-result-object v18

    .line 92
    const/16 v19, 0x0

    .line 93
    .line 94
    const/16 v20, 0x0

    .line 95
    .line 96
    :goto_5
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 97
    .line 98
    .line 99
    const-string v2, "Initialization"

    .line 100
    .line 101
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_6

    .line 106
    .line 107
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    move-object/from16 v19, v2

    .line 112
    .line 113
    move-wide v2, v4

    .line 114
    goto :goto_6

    .line 115
    :cond_6
    const-string v2, "SegmentTimeline"

    .line 116
    .line 117
    invoke-static {v1, v2}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_7

    .line 122
    .line 123
    move-wide v2, v4

    .line 124
    move-wide/from16 v4, p6

    .line 125
    .line 126
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTimeline(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v20

    .line 130
    goto :goto_6

    .line 131
    :cond_7
    move-wide v2, v4

    .line 132
    invoke-static {v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 133
    .line 134
    .line 135
    :goto_6
    const-string v0, "SegmentTemplate"

    .line 136
    .line 137
    invoke-static {v1, v0}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_b

    .line 142
    .line 143
    if-eqz v6, :cond_a

    .line 144
    .line 145
    if-eqz v19, :cond_8

    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_8
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 149
    .line 150
    move-object/from16 v19, v0

    .line 151
    .line 152
    :goto_7
    if-eqz v20, :cond_9

    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_9
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->segmentTimeline:Ljava/util/List;

    .line 156
    .line 157
    move-object/from16 v20, v0

    .line 158
    .line 159
    :cond_a
    :goto_8
    move-object/from16 v1, p0

    .line 160
    .line 161
    move-wide v3, v2

    .line 162
    move-wide v5, v7

    .line 163
    move-wide v7, v9

    .line 164
    move-wide v9, v13

    .line 165
    move-wide v14, v15

    .line 166
    move-object/from16 v16, v18

    .line 167
    .line 168
    move-object/from16 v2, v19

    .line 169
    .line 170
    move-object/from16 v13, v20

    .line 171
    .line 172
    move-wide/from16 v20, p4

    .line 173
    .line 174
    move-wide/from16 v18, p12

    .line 175
    .line 176
    invoke-virtual/range {v1 .. v21}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSegmentTemplate(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJJLjava/util/List;JLandroidx/media3/exoplayer/dash/manifest/UrlTemplate;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    return-object v0

    .line 181
    :cond_b
    move-wide v4, v7

    .line 182
    move-wide v7, v9

    .line 183
    move-wide v9, v13

    .line 184
    move-wide v14, v15

    .line 185
    move-object/from16 v0, p0

    .line 186
    .line 187
    move-wide v15, v14

    .line 188
    move-wide v13, v9

    .line 189
    move-wide v9, v7

    .line 190
    move-wide v7, v4

    .line 191
    move-wide v4, v2

    .line 192
    goto :goto_5
.end method

.method public parseSegmentTimeline(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "JJ)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/4 v12, 0x0

    .line 16
    move-wide v3, v2

    .line 17
    move-wide v5, v10

    .line 18
    move v2, v12

    .line 19
    move v7, v2

    .line 20
    :cond_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 21
    .line 22
    .line 23
    const-string v8, "S"

    .line 24
    .line 25
    invoke-static {v0, v8}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-eqz v8, :cond_3

    .line 30
    .line 31
    const-string v8, "t"

    .line 32
    .line 33
    invoke-static {v0, v8, v10, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    move-object v2, v1

    .line 40
    move-object v1, p0

    .line 41
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->addSegmentTimelineElementsToList(Ljava/util/List;JJIJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    move-object v1, v2

    .line 46
    :cond_1
    cmp-long v2, v8, v10

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    move-wide v3, v8

    .line 51
    :cond_2
    const-string v2, "d"

    .line 52
    .line 53
    invoke-static {v0, v2, v10, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    const-string v2, "r"

    .line 58
    .line 59
    invoke-static {v0, v2, v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    const/4 v2, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    const-string v8, "SegmentTimeline"

    .line 69
    .line 70
    invoke-static {v0, v8}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-eqz v8, :cond_0

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    sget v0, Lh1/i0;->a:I

    .line 79
    .line 80
    sget-object v14, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 81
    .line 82
    const-wide/16 v12, 0x3e8

    .line 83
    .line 84
    move-wide/from16 v10, p2

    .line 85
    .line 86
    move-wide/from16 v8, p4

    .line 87
    .line 88
    invoke-static/range {v8 .. v14}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v8

    .line 92
    move-object v0, p0

    .line 93
    move-wide v2, v3

    .line 94
    move-wide v4, v5

    .line 95
    move v6, v7

    .line 96
    move-wide v7, v8

    .line 97
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->addSegmentTimelineElementsToList(Ljava/util/List;JJIJ)J

    .line 98
    .line 99
    .line 100
    :cond_4
    return-object v1
.end method

.method public parseSegmentUrl(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 2

    .line 1
    const-string v0, "media"

    .line 2
    .line 3
    const-string v1, "mediaRange"

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRangedUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public parseSelectionFlagsFromDashRoleScheme(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "forced_subtitle"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v1, "forced-subtitle"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p1, 0x2

    .line 23
    return p1
.end method

.method public parseSelectionFlagsFromRoleDescriptors(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    const-string v3, "urn:mpeg:dash:role:2011"

    .line 16
    .line 17
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v4}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSelectionFlagsFromDashRoleScheme(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    or-int/2addr v1, v2

    .line 32
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return v1
.end method

.method public parseServiceDescription(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const v3, -0x800001

    .line 9
    .line 10
    .line 11
    move-wide v4, v1

    .line 12
    move-wide v6, v4

    .line 13
    move-wide v8, v6

    .line 14
    move v10, v3

    .line 15
    move v11, v10

    .line 16
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 17
    .line 18
    .line 19
    const-string v12, "Latency"

    .line 20
    .line 21
    invoke-static {v0, v12}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v12

    .line 25
    const-string v13, "max"

    .line 26
    .line 27
    const-string v14, "min"

    .line 28
    .line 29
    if-eqz v12, :cond_1

    .line 30
    .line 31
    const-string v4, "target"

    .line 32
    .line 33
    invoke-static {v0, v4, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-static {v0, v14, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    invoke-static {v0, v13, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    :cond_0
    :goto_1
    move-wide v13, v4

    .line 46
    move-wide v15, v6

    .line 47
    move-wide/from16 v17, v8

    .line 48
    .line 49
    move/from16 v19, v10

    .line 50
    .line 51
    move/from16 v20, v11

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    const-string v12, "PlaybackRate"

    .line 55
    .line 56
    invoke-static {v0, v12}, Lh1/a;->x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    if-eqz v12, :cond_0

    .line 61
    .line 62
    invoke-static {v0, v14, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFloat(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;F)F

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    invoke-static {v0, v13, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFloat(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;F)F

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    goto :goto_1

    .line 71
    :goto_2
    const-string v4, "ServiceDescription"

    .line 72
    .line 73
    invoke-static {v0, v4}, Lh1/a;->w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    new-instance v12, Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;

    .line 80
    .line 81
    invoke-direct/range {v12 .. v20}, Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;-><init>(JJJFF)V

    .line 82
    .line 83
    .line 84
    return-object v12

    .line 85
    :cond_2
    move-wide v4, v13

    .line 86
    move-wide v6, v15

    .line 87
    move-wide/from16 v8, v17

    .line 88
    .line 89
    move/from16 v10, v19

    .line 90
    .line 91
    move/from16 v11, v20

    .line 92
    .line 93
    goto :goto_0
.end method

.method public parseTileCountFromProperties(Ljava/util/List;)Landroid/util/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_3

    .line 8
    .line 9
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    const-string v3, "http://dashif.org/thumbnail_tile"

    .line 16
    .line 17
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v4}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    const-string v3, "http://dashif.org/guidelines/thumbnail_tile"

    .line 26
    .line 27
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v3, v4}, Lcom/bumptech/glide/c;->F(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    :cond_0
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    sget v3, Lh1/i0;->a:I

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    const-string v4, "x"

    .line 43
    .line 44
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    array-length v3, v2

    .line 49
    const/4 v4, 0x2

    .line 50
    if-eq v3, v4, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :try_start_0
    aget-object v3, v2, v0

    .line 54
    .line 55
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/4 v4, 0x1

    .line 60
    aget-object v2, v2, v4

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 75
    .line 76
    .line 77
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    return-object p1

    .line 79
    :catch_0
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    const/4 p1, 0x0

    .line 83
    return-object p1
.end method

.method public parseTvaAudioPurposeCsValue(Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, -0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    goto :goto_0

    .line 16
    :pswitch_1
    const-string v1, "6"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v4, v2

    .line 26
    goto :goto_0

    .line 27
    :pswitch_2
    const-string v1, "4"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v4, 0x3

    .line 37
    goto :goto_0

    .line 38
    :pswitch_3
    const-string v1, "3"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const/4 v4, 0x2

    .line 48
    goto :goto_0

    .line 49
    :pswitch_4
    const-string v1, "2"

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    move v4, v3

    .line 59
    goto :goto_0

    .line 60
    :pswitch_5
    const-string v1, "1"

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    move v4, v0

    .line 70
    :goto_0
    packed-switch v4, :pswitch_data_1

    .line 71
    .line 72
    .line 73
    return v0

    .line 74
    :pswitch_6
    return v3

    .line 75
    :pswitch_7
    const/16 p1, 0x8

    .line 76
    .line 77
    return p1

    .line 78
    :pswitch_8
    return v2

    .line 79
    :pswitch_9
    const/16 p1, 0x800

    .line 80
    .line 81
    return p1

    .line 82
    :pswitch_a
    const/16 p1, 0x200

    .line 83
    .line 84
    return p1

    .line 85
    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public parseUrlTemplate(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;->compile(Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    return-object p3
.end method

.method public parseUtcTiming(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;
    .locals 3

    .line 1
    const-string v0, "schemeIdUri"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v2, "value"

    .line 9
    .line 10
    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, v0, p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildUtcTimingElement(Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
