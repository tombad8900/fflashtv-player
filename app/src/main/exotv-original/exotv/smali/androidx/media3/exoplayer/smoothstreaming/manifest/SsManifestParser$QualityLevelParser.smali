.class Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$QualityLevelParser;
.super Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QualityLevelParser"
.end annotation


# static fields
.field private static final KEY_BITRATE:Ljava/lang/String; = "Bitrate"

.field private static final KEY_CHANNELS:Ljava/lang/String; = "Channels"

.field private static final KEY_CODEC_PRIVATE_DATA:Ljava/lang/String; = "CodecPrivateData"

.field private static final KEY_FOUR_CC:Ljava/lang/String; = "FourCC"

.field private static final KEY_INDEX:Ljava/lang/String; = "Index"

.field private static final KEY_LANGUAGE:Ljava/lang/String; = "Language"

.field private static final KEY_MAX_HEIGHT:Ljava/lang/String; = "MaxHeight"

.field private static final KEY_MAX_WIDTH:Ljava/lang/String; = "MaxWidth"

.field private static final KEY_NAME:Ljava/lang/String; = "Name"

.field private static final KEY_SAMPLING_RATE:Ljava/lang/String; = "SamplingRate"

.field private static final KEY_SUB_TYPE:Ljava/lang/String; = "Subtype"

.field private static final KEY_TYPE:Ljava/lang/String; = "Type"

.field public static final TAG:Ljava/lang/String; = "QualityLevel"


# instance fields
.field private format:Landroidx/media3/common/w;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "QualityLevel"

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;-><init>(Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static buildCodecSpecificData(Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_c

    .line 11
    .line 12
    sget v1, Lh1/i0;->a:I

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    div-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    new-array v2, v1, [B

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :goto_0
    const/4 v5, 0x4

    .line 25
    if-ge v4, v1, :cond_0

    .line 26
    .line 27
    mul-int/lit8 v6, v4, 0x2

    .line 28
    .line 29
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    const/16 v8, 0x10

    .line 34
    .line 35
    invoke-static {v7, v8}, Ljava/lang/Character;->digit(CI)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    shl-int/lit8 v5, v7, 0x4

    .line 40
    .line 41
    add-int/lit8 v6, v6, 0x1

    .line 42
    .line 43
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-static {v6, v8}, Ljava/lang/Character;->digit(CI)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    add-int/2addr v6, v5

    .line 52
    int-to-byte v5, v6

    .line 53
    aput-byte v5, v2, v4

    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    sget-object p0, Lh1/c;->a:[B

    .line 59
    .line 60
    if-gt v1, v5, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    move p0, v3

    .line 64
    :goto_1
    sget-object v4, Lh1/c;->a:[B

    .line 65
    .line 66
    if-ge p0, v5, :cond_3

    .line 67
    .line 68
    aget-byte v6, v2, p0

    .line 69
    .line 70
    aget-byte v4, v4, p0

    .line 71
    .line 72
    if-eq v6, v4, :cond_2

    .line 73
    .line 74
    :goto_2
    const/4 p0, 0x0

    .line 75
    goto/16 :goto_8

    .line 76
    .line 77
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    move v4, v3

    .line 86
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    add-int/2addr v4, v5

    .line 94
    add-int/lit8 v6, v1, -0x4

    .line 95
    .line 96
    :goto_3
    const/4 v7, -0x1

    .line 97
    if-gt v4, v6, :cond_7

    .line 98
    .line 99
    sub-int v8, v1, v4

    .line 100
    .line 101
    if-gt v8, v5, :cond_5

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    move v8, v3

    .line 105
    :goto_4
    sget-object v9, Lh1/c;->a:[B

    .line 106
    .line 107
    if-ge v8, v5, :cond_8

    .line 108
    .line 109
    add-int v10, v4, v8

    .line 110
    .line 111
    aget-byte v10, v2, v10

    .line 112
    .line 113
    aget-byte v9, v9, v8

    .line 114
    .line 115
    if-eq v10, v9, :cond_6

    .line 116
    .line 117
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    move v4, v7

    .line 124
    :cond_8
    if-ne v4, v7, :cond_4

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    new-array v4, v4, [[B

    .line 131
    .line 132
    move v5, v3

    .line 133
    :goto_6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-ge v5, v6, :cond_a

    .line 138
    .line 139
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    check-cast v6, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    add-int/lit8 v7, v7, -0x1

    .line 154
    .line 155
    if-ge v5, v7, :cond_9

    .line 156
    .line 157
    add-int/lit8 v7, v5, 0x1

    .line 158
    .line 159
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    check-cast v7, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    goto :goto_7

    .line 170
    :cond_9
    move v7, v1

    .line 171
    :goto_7
    sub-int/2addr v7, v6

    .line 172
    new-array v8, v7, [B

    .line 173
    .line 174
    invoke-static {v2, v6, v8, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 175
    .line 176
    .line 177
    aput-object v8, v4, v5

    .line 178
    .line 179
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_a
    move-object p0, v4

    .line 183
    :goto_8
    if-nez p0, :cond_b

    .line 184
    .line 185
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :cond_b
    invoke-static {v0, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    :cond_c
    return-object v0
.end method

.method private static fourCCToMimeType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "H264"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    const-string v0, "X264"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_e

    .line 16
    .line 17
    const-string v0, "AVC1"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_e

    .line 24
    .line 25
    const-string v0, "DAVC"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    const-string v0, "AAC"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_d

    .line 42
    .line 43
    const-string v0, "AACL"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_d

    .line 50
    .line 51
    const-string v0, "AACH"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_d

    .line 58
    .line 59
    const-string v0, "AACP"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :cond_1
    const-string v0, "TTML"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_c

    .line 76
    .line 77
    const-string v0, "DFXP"

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    const-string v0, "ac-3"

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_b

    .line 93
    .line 94
    const-string v0, "dac3"

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    const-string v0, "ec-3"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_a

    .line 110
    .line 111
    const-string v0, "dec3"

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    const-string v0, "dtsc"

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    const-string p0, "audio/vnd.dts"

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_5
    const-string v0, "dtsh"

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_9

    .line 138
    .line 139
    const-string v0, "dtsl"

    .line 140
    .line 141
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_6
    const-string v0, "dtse"

    .line 149
    .line 150
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    const-string p0, "audio/vnd.dts.hd;profile=lbr"

    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_7
    const-string v0, "opus"

    .line 160
    .line 161
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_8

    .line 166
    .line 167
    const-string p0, "audio/opus"

    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_8
    const/4 p0, 0x0

    .line 171
    return-object p0

    .line 172
    :cond_9
    :goto_0
    const-string p0, "audio/vnd.dts.hd"

    .line 173
    .line 174
    return-object p0

    .line 175
    :cond_a
    :goto_1
    const-string p0, "audio/eac3"

    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_b
    :goto_2
    const-string p0, "audio/ac3"

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_c
    :goto_3
    const-string p0, "application/ttml+xml"

    .line 182
    .line 183
    return-object p0

    .line 184
    :cond_d
    :goto_4
    const-string p0, "audio/mp4a-latm"

    .line 185
    .line 186
    return-object p0

    .line 187
    :cond_e
    :goto_5
    const-string p0, "video/avc"

    .line 188
    .line 189
    return-object p0
.end method


# virtual methods
.method public build()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$QualityLevelParser;->format:Landroidx/media3/common/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public parseStartTag(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 12

    .line 1
    new-instance v0, Landroidx/media3/common/v;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "FourCC"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v1}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->parseRequiredString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$QualityLevelParser;->fourCCToMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "Type"

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->getNormalizedAttribute(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const-string v3, "CodecPrivateData"

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x2

    .line 32
    if-ne v2, v5, :cond_0

    .line 33
    .line 34
    invoke-interface {p1, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$QualityLevelParser;->buildCodecSpecificData(Ljava/lang/String;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "video/mp4"

    .line 43
    .line 44
    invoke-static {v3}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iput-object v3, v0, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 49
    .line 50
    const-string v3, "MaxWidth"

    .line 51
    .line 52
    invoke-virtual {p0, p1, v3}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->parseRequiredInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iput v3, v0, Landroidx/media3/common/v;->t:I

    .line 57
    .line 58
    const-string v3, "MaxHeight"

    .line 59
    .line 60
    invoke-virtual {p0, p1, v3}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->parseRequiredInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iput v3, v0, Landroidx/media3/common/v;->u:I

    .line 65
    .line 66
    iput-object v2, v0, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_0
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x1

    .line 72
    if-ne v2, v7, :cond_8

    .line 73
    .line 74
    const-string v2, "audio/mp4a-latm"

    .line 75
    .line 76
    if-nez v1, :cond_1

    .line 77
    .line 78
    move-object v1, v2

    .line 79
    :cond_1
    const-string v7, "Channels"

    .line 80
    .line 81
    invoke-virtual {p0, p1, v7}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->parseRequiredInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    const-string v8, "SamplingRate"

    .line 86
    .line 87
    invoke-virtual {p0, p1, v8}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->parseRequiredInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    invoke-interface {p1, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v3}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$QualityLevelParser;->buildCodecSpecificData(Ljava/lang/String;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-eqz v9, :cond_7

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_7

    .line 110
    .line 111
    const/4 v2, -0x1

    .line 112
    move v9, v2

    .line 113
    move v3, v6

    .line 114
    :goto_0
    sget-object v10, Ln1/b;->a:[I

    .line 115
    .line 116
    const/16 v11, 0xd

    .line 117
    .line 118
    if-ge v3, v11, :cond_3

    .line 119
    .line 120
    aget v10, v10, v3

    .line 121
    .line 122
    if-ne v8, v10, :cond_2

    .line 123
    .line 124
    move v9, v3

    .line 125
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    move v3, v2

    .line 129
    :goto_1
    sget-object v10, Ln1/b;->b:[I

    .line 130
    .line 131
    const/16 v11, 0x10

    .line 132
    .line 133
    if-ge v6, v11, :cond_5

    .line 134
    .line 135
    aget v10, v10, v6

    .line 136
    .line 137
    if-ne v7, v10, :cond_4

    .line 138
    .line 139
    move v3, v6

    .line 140
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_5
    if-eq v8, v2, :cond_6

    .line 144
    .line 145
    if-eq v3, v2, :cond_6

    .line 146
    .line 147
    invoke-static {v5, v9, v3}, Ln1/b;->a(III)[B

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    goto :goto_2

    .line 156
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    const-string v0, "Invalid sample rate or number of channels: "

    .line 159
    .line 160
    const-string v1, ", "

    .line 161
    .line 162
    invoke-static {v8, v7, v0, v1}, La1/a1;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_7
    :goto_2
    const-string v2, "audio/mp4"

    .line 171
    .line 172
    invoke-static {v2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    iput-object v2, v0, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 177
    .line 178
    iput v7, v0, Landroidx/media3/common/v;->B:I

    .line 179
    .line 180
    iput v8, v0, Landroidx/media3/common/v;->C:I

    .line 181
    .line 182
    iput-object v3, v0, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_8
    const/4 v3, 0x3

    .line 186
    const-string v5, "application/mp4"

    .line 187
    .line 188
    if-ne v2, v3, :cond_c

    .line 189
    .line 190
    const-string v2, "Subtype"

    .line 191
    .line 192
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->getNormalizedAttribute(Ljava/lang/String;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    check-cast v2, Ljava/lang/String;

    .line 197
    .line 198
    if-eqz v2, :cond_b

    .line 199
    .line 200
    const-string v3, "CAPT"

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-nez v3, :cond_a

    .line 207
    .line 208
    const-string v3, "DESC"

    .line 209
    .line 210
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-nez v2, :cond_9

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_9
    const/16 v6, 0x400

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_a
    const/16 v6, 0x40

    .line 221
    .line 222
    :cond_b
    :goto_3
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iput-object v2, v0, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 227
    .line 228
    iput v6, v0, Landroidx/media3/common/v;->f:I

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_c
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    iput-object v2, v0, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 236
    .line 237
    :goto_4
    const-string v2, "Index"

    .line 238
    .line 239
    invoke-interface {p1, v4, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    iput-object v2, v0, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 244
    .line 245
    const-string v2, "Name"

    .line 246
    .line 247
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->getNormalizedAttribute(Ljava/lang/String;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Ljava/lang/String;

    .line 252
    .line 253
    iput-object v2, v0, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iput-object v1, v0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 260
    .line 261
    const-string v1, "Bitrate"

    .line 262
    .line 263
    invoke-virtual {p0, p1, v1}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->parseRequiredInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    iput p1, v0, Landroidx/media3/common/v;->h:I

    .line 268
    .line 269
    const-string p1, "Language"

    .line 270
    .line 271
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$ElementParser;->getNormalizedAttribute(Ljava/lang/String;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    check-cast p1, Ljava/lang/String;

    .line 276
    .line 277
    iput-object p1, v0, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 278
    .line 279
    new-instance p1, Landroidx/media3/common/w;

    .line 280
    .line 281
    invoke-direct {p1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 282
    .line 283
    .line 284
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$QualityLevelParser;->format:Landroidx/media3/common/w;

    .line 285
    .line 286
    return-void
.end method
