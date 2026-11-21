.class public final Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/media/MediaParser$OutputConsumer;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Override"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;,
        Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;
    }
.end annotation


# static fields
.field private static final MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS:Ljava/lang/String; = "chunk-index-long-us-durations"

.field private static final MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS:Ljava/lang/String; = "chunk-index-long-offsets"

.field private static final MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES:Ljava/lang/String; = "chunk-index-int-sizes"

.field private static final MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES:Ljava/lang/String; = "chunk-index-long-us-times"

.field private static final MEDIA_FORMAT_KEY_TRACK_TYPE:Ljava/lang/String; = "track-type-string"

.field private static final REGEX_CRYPTO_INFO_PATTERN:Ljava/util/regex/Pattern;

.field private static final SEEK_POINT_PAIR_START:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Landroid/media/MediaParser$SeekPoint;",
            "Landroid/media/MediaParser$SeekPoint;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "OConsumerAdapterV30"


# instance fields
.field private containerMimeType:Ljava/lang/String;

.field private dummySeekMap:Landroid/media/MediaParser$SeekMap;

.field private final expectDummySeekMap:Z

.field private extractorOutput:Ln1/p;

.field private lastChunkIndex:Ln1/j;

.field private final lastOutputCryptoDatas:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ln1/h0;",
            ">;"
        }
    .end annotation
.end field

.field private final lastReceivedCryptoInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/media/MediaCodec$CryptoInfo;",
            ">;"
        }
    .end annotation
.end field

.field private lastSeekMap:Landroid/media/MediaParser$SeekMap;

.field private muxedCaptionFormats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;"
        }
    .end annotation
.end field

.field private primaryTrackIndex:I

.field private final primaryTrackManifestFormat:Landroidx/media3/common/w;

.field private final primaryTrackType:I

.field private sampleTimestampUpperLimitFilterUs:J

.field private final scratchDataReaderAdapter:Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;

.field private seekingDisabled:Z

.field private timestampAdjuster:Lh1/d0;

.field private final trackFormats:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/w;",
            ">;"
        }
    .end annotation
.end field

.field private final trackOutputs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ln1/i0;",
            ">;"
        }
    .end annotation
.end field

.field private tracksEnded:Z

.field private tracksFoundCalled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/media3/exoplayer/hls/a;->a()Landroid/media/MediaParser$SeekPoint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->SEEK_POINT_PAIR_START:Landroid/util/Pair;

    .line 10
    .line 11
    const-string v0, "pattern \\(encrypt: (\\d+), skip: (\\d+)\\)"

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->REGEX_CRYPTO_INFO_PATTERN:Ljava/util/regex/Pattern;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, -0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    invoke-direct {p0, v2, v0, v1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;-><init>(Landroidx/media3/common/w;IZ)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/w;IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p3, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->expectDummySeekMap:Z

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->primaryTrackManifestFormat:Landroidx/media3/common/w;

    .line 5
    iput p2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->primaryTrackType:I

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackFormats:Ljava/util/ArrayList;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastReceivedCryptoInfos:Ljava/util/ArrayList;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastOutputCryptoDatas:Ljava/util/ArrayList;

    .line 10
    new-instance p1, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;-><init>(Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$1;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->scratchDataReaderAdapter:Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;

    .line 11
    new-instance p1, Lk2/b;

    const/16 p2, 0x8

    .line 12
    invoke-direct {p1, p2}, Lk2/b;-><init>(I)V

    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->extractorOutput:Ln1/p;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->sampleTimestampUpperLimitFilterUs:J

    .line 15
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 16
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->muxedCaptionFormats:Ljava/util/List;

    return-void
.end method

.method private ensureSpaceForTrackIndex(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :goto_0
    if-gt v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackFormats:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastReceivedCryptoInfos:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastOutputCryptoDatas:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method private static getFlag(Landroid/media/MediaFormat;Ljava/lang/String;I)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return p2

    .line 9
    :cond_0
    return v0
.end method

.method private static getInitializationData(Landroid/media/MediaFormat;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/MediaFormat;",
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
    const/4 v1, 0x0

    .line 7
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "csd-"

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    new-array v2, v2, [B

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move v1, v3

    .line 43
    goto :goto_0
.end method

.method private static getMimeType(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :sswitch_0
    const-string v0, "android.media.mediaparser.FlvParser"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_0
    const/16 v1, 0xd

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :sswitch_1
    const-string v0, "android.media.mediaparser.Mp3Parser"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_1
    const/16 v1, 0xc

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :sswitch_2
    const-string v0, "android.media.mediaparser.Ac4Parser"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_2
    const/16 v1, 0xb

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :sswitch_3
    const-string v0, "android.media.mediaparser.MatroskaParser"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :cond_3
    const/16 v1, 0xa

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :sswitch_4
    const-string v0, "android.media.mediaparser.FlacParser"

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_4
    const/16 v1, 0x9

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :sswitch_5
    const-string v0, "android.media.mediaparser.AmrParser"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_5
    const/16 v1, 0x8

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :sswitch_6
    const-string v0, "android.media.mediaparser.Ac3Parser"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    const/4 v1, 0x7

    .line 108
    goto :goto_0

    .line 109
    :sswitch_7
    const-string v0, "android.media.mediaparser.FragmentedMp4Parser"

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_7

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_7
    const/4 v1, 0x6

    .line 119
    goto :goto_0

    .line 120
    :sswitch_8
    const-string v0, "android.media.mediaparser.PsParser"

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_8

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_8
    const/4 v1, 0x5

    .line 130
    goto :goto_0

    .line 131
    :sswitch_9
    const-string v0, "android.media.mediaparser.WavParser"

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_9

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_9
    const/4 v1, 0x4

    .line 141
    goto :goto_0

    .line 142
    :sswitch_a
    const-string v0, "android.media.mediaparser.AdtsParser"

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_a

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_a
    const/4 v1, 0x3

    .line 152
    goto :goto_0

    .line 153
    :sswitch_b
    const-string v0, "android.media.mediaparser.TsParser"

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_b

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_b
    const/4 v1, 0x2

    .line 163
    goto :goto_0

    .line 164
    :sswitch_c
    const-string v0, "android.media.mediaparser.OggParser"

    .line 165
    .line 166
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_c

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_c
    const/4 v1, 0x1

    .line 174
    goto :goto_0

    .line 175
    :sswitch_d
    const-string v0, "android.media.mediaparser.Mp4Parser"

    .line 176
    .line 177
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_d

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_d
    const/4 v1, 0x0

    .line 185
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 186
    .line 187
    .line 188
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 189
    .line 190
    const-string v1, "Illegal parser name: "

    .line 191
    .line 192
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    :pswitch_0
    const-string p0, "video/x-flv"

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_1
    const-string p0, "audio/mpeg"

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_2
    const-string p0, "audio/ac4"

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_3
    const-string p0, "video/webm"

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_4
    const-string p0, "audio/flac"

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_5
    const-string p0, "audio/amr"

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_6
    const-string p0, "audio/ac3"

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_7
    const-string p0, "video/mp2p"

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_8
    const-string p0, "audio/raw"

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_9
    const-string p0, "audio/mp4a-latm"

    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_a
    const-string p0, "video/mp2t"

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_b
    const-string p0, "audio/ogg"

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_c
    const-string p0, "video/mp4"

    .line 237
    .line 238
    return-object p0

    .line 239
    :sswitch_data_0
    .sparse-switch
        -0x7afe9a64 -> :sswitch_d
        -0x6f828246 -> :sswitch_c
        -0x5d5dc92e -> :sswitch_b
        -0x35a8150b -> :sswitch_a
        -0x23289ea9 -> :sswitch_9
        0x31d8356 -> :sswitch_8
        0x6f5c06d -> :sswitch_7
        0x1676aefc -> :sswitch_6
        0x29eb04b1 -> :sswitch_5
        0x2dd08ffb -> :sswitch_4
        0x39936bdf -> :sswitch_3
        0x4b5cea3d -> :sswitch_2
        0x501b2a5b -> :sswitch_1
        0x7af8efdb -> :sswitch_0
    .end sparse-switch

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
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_c
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static getSelectionFlags(Landroid/media/MediaFormat;)I
    .locals 3

    .line 1
    const-string v0, "is-autoselect"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->getFlag(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "is-default"

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-static {p0, v1, v2}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->getFlag(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    or-int/2addr v0, v1

    .line 16
    const-string v1, "is-forced-subtitle"

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-static {p0, v1, v2}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->getFlag(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    or-int/2addr p0, v0

    .line 24
    return p0
.end method

.method private maybeEndTracks()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->tracksFoundCalled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->tracksEnded:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->extractorOutput:Ln1/p;

    .line 32
    .line 33
    invoke-interface {v0}, Ln1/p;->endTracks()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->tracksEnded:Z

    .line 38
    .line 39
    :cond_3
    :goto_1
    return-void
.end method

.method private maybeObtainChunkIndex(Landroid/media/MediaFormat;)Z
    .locals 7

    .line 1
    const-string v0, "chunk-index-int-sizes"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "chunk-index-long-offsets"

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asLongBuffer()Ljava/nio/LongBuffer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "chunk-index-long-us-durations"

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asLongBuffer()Ljava/nio/LongBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "chunk-index-long-us-times"

    .line 42
    .line 43
    invoke-virtual {p1, v3}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asLongBuffer()Ljava/nio/LongBuffer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    new-array v3, v3, [I

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    new-array v4, v4, [J

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    new-array v5, v5, [J

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    new-array v6, v6, [J

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/nio/IntBuffer;->get([I)Ljava/nio/IntBuffer;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v4}, Ljava/nio/LongBuffer;->get([J)Ljava/nio/LongBuffer;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v5}, Ljava/nio/LongBuffer;->get([J)Ljava/nio/LongBuffer;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v6}, Ljava/nio/LongBuffer;->get([J)Ljava/nio/LongBuffer;

    .line 88
    .line 89
    .line 90
    new-instance p1, Ln1/j;

    .line 91
    .line 92
    invoke-direct {p1, v3, v4, v5, v6}, Ln1/j;-><init>([I[J[J[J)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastChunkIndex:Ln1/j;

    .line 96
    .line 97
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->extractorOutput:Ln1/p;

    .line 98
    .line 99
    invoke-interface {v0, p1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x1

    .line 103
    return p1
.end method

.method private toExoPlayerCryptoData(ILandroid/media/MediaCodec$CryptoInfo;)Ln1/h0;
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastReceivedCryptoInfos:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/media/MediaCodec$CryptoInfo;

    .line 12
    .line 13
    if-ne v0, p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastOutputCryptoDatas:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ln1/h0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    :try_start_0
    sget-object v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->REGEX_CRYPTO_INFO_PATTERN:Ljava/util/regex/Pattern;

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/media/MediaCodec$CryptoInfo;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget v2, Lh1/i0;->a:I

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x2

    .line 52
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "Unexpected error while parsing CryptoInfo: "

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "OConsumerAdapterV30"

    .line 77
    .line 78
    invoke-static {v2, v1, v0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    move v0, v1

    .line 83
    :goto_0
    new-instance v2, Ln1/h0;

    .line 84
    .line 85
    iget v3, p2, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 86
    .line 87
    iget-object v4, p2, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 88
    .line 89
    invoke-direct {v2, v3, v1, v0, v4}, Ln1/h0;-><init>(III[B)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastReceivedCryptoInfos:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object p2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastOutputCryptoDatas:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {p2, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    return-object v2
.end method

.method private static toExoPlayerDrmInitData(Ljava/lang/String;Landroid/media/DrmInitData;)Landroidx/media3/common/s;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/media/DrmInitData;->getSchemeInitDataCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v2, v1, [Landroidx/media3/common/r;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, v3}, Landroid/media/DrmInitData;->getSchemeInitDataAt(I)Landroid/media/DrmInitData$SchemeInitData;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    new-instance v5, Landroidx/media3/common/r;

    .line 19
    .line 20
    iget-object v6, v4, Landroid/media/DrmInitData$SchemeInitData;->uuid:Ljava/util/UUID;

    .line 21
    .line 22
    iget-object v7, v4, Landroid/media/DrmInitData$SchemeInitData;->mimeType:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v4, v4, Landroid/media/DrmInitData$SchemeInitData;->data:[B

    .line 25
    .line 26
    invoke-direct {v5, v6, v0, v7, v4}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 27
    .line 28
    .line 29
    aput-object v5, v2, v3

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p1, Landroidx/media3/common/s;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-direct {p1, p0, v0, v2}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 38
    .line 39
    .line 40
    return-object p1
.end method

.method private toExoPlayerFormat(Landroid/media/MediaParser$TrackData;)Landroidx/media3/common/w;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Landroidx/media3/common/n;->d(Landroid/media/MediaParser$TrackData;)Landroid/media/MediaFormat;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "mime"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "caption-service-number"

    .line 14
    .line 15
    const/4 v4, -0x1

    .line 16
    invoke-virtual {v1, v3, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    new-instance v5, Landroidx/media3/common/v;

    .line 21
    .line 22
    invoke-direct {v5}, Landroidx/media3/common/v;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v6, "crypto-mode-fourcc"

    .line 26
    .line 27
    invoke-virtual {v1, v6}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    move-object/from16 v7, p1

    .line 32
    .line 33
    iget-object v7, v7, Landroid/media/MediaParser$TrackData;->drmInitData:Landroid/media/DrmInitData;

    .line 34
    .line 35
    invoke-static {v6, v7}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->toExoPlayerDrmInitData(Ljava/lang/String;Landroid/media/DrmInitData;)Landroidx/media3/common/s;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iput-object v6, v5, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 40
    .line 41
    iget-object v6, v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->containerMimeType:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v6}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iput-object v6, v5, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 48
    .line 49
    const-string v6, "bitrate"

    .line 50
    .line 51
    invoke-virtual {v1, v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    iput v6, v5, Landroidx/media3/common/v;->i:I

    .line 56
    .line 57
    const-string v6, "channel-count"

    .line 58
    .line 59
    invoke-virtual {v1, v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    iput v6, v5, Landroidx/media3/common/v;->B:I

    .line 64
    .line 65
    sget v6, Lh1/i0;->a:I

    .line 66
    .line 67
    const/16 v7, 0x18

    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    if-ge v6, v7, :cond_0

    .line 71
    .line 72
    goto/16 :goto_a

    .line 73
    .line 74
    :cond_0
    const-string v6, "color-standard"

    .line 75
    .line 76
    invoke-virtual {v1, v6}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_1

    .line 81
    .line 82
    invoke-virtual {v1, v6}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move v6, v4

    .line 88
    :goto_0
    const-string v7, "color-range"

    .line 89
    .line 90
    invoke-virtual {v1, v7}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_2

    .line 95
    .line 96
    invoke-virtual {v1, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move v7, v4

    .line 102
    :goto_1
    const-string v9, "color-transfer"

    .line 103
    .line 104
    invoke-virtual {v1, v9}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_3

    .line 109
    .line 110
    invoke-virtual {v1, v9}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    move v9, v4

    .line 116
    :goto_2
    const-string v10, "hdr-static-info"

    .line 117
    .line 118
    invoke-virtual {v1, v10}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    if-eqz v10, :cond_4

    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/nio/Buffer;->remaining()I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    new-array v11, v11, [B

    .line 129
    .line 130
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    .line 133
    move-object/from16 v18, v11

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    move-object/from16 v18, v8

    .line 137
    .line 138
    :goto_3
    const/4 v10, 0x6

    .line 139
    const/4 v11, 0x2

    .line 140
    const/4 v12, 0x1

    .line 141
    if-eq v6, v11, :cond_6

    .line 142
    .line 143
    if-eq v6, v12, :cond_6

    .line 144
    .line 145
    if-eq v6, v10, :cond_6

    .line 146
    .line 147
    if-ne v6, v4, :cond_5

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    move v13, v4

    .line 151
    goto :goto_5

    .line 152
    :cond_6
    :goto_4
    move v13, v6

    .line 153
    :goto_5
    if-eq v7, v11, :cond_8

    .line 154
    .line 155
    if-eq v7, v12, :cond_8

    .line 156
    .line 157
    if-ne v7, v4, :cond_7

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_7
    move v14, v4

    .line 161
    goto :goto_7

    .line 162
    :cond_8
    :goto_6
    move v14, v7

    .line 163
    :goto_7
    if-eq v9, v12, :cond_a

    .line 164
    .line 165
    const/4 v6, 0x3

    .line 166
    if-eq v9, v6, :cond_a

    .line 167
    .line 168
    if-eq v9, v10, :cond_a

    .line 169
    .line 170
    const/4 v6, 0x7

    .line 171
    if-eq v9, v6, :cond_a

    .line 172
    .line 173
    if-ne v9, v4, :cond_9

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_9
    move v15, v4

    .line 177
    goto :goto_9

    .line 178
    :cond_a
    :goto_8
    move v15, v9

    .line 179
    :goto_9
    if-ne v13, v4, :cond_b

    .line 180
    .line 181
    if-ne v14, v4, :cond_b

    .line 182
    .line 183
    if-ne v15, v4, :cond_b

    .line 184
    .line 185
    if-eqz v18, :cond_c

    .line 186
    .line 187
    :cond_b
    new-instance v12, Landroidx/media3/common/l;

    .line 188
    .line 189
    const/16 v16, -0x1

    .line 190
    .line 191
    move/from16 v17, v16

    .line 192
    .line 193
    invoke-direct/range {v12 .. v18}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    .line 194
    .line 195
    .line 196
    move-object v8, v12

    .line 197
    :cond_c
    :goto_a
    iput-object v8, v5, Landroidx/media3/common/v;->A:Landroidx/media3/common/l;

    .line 198
    .line 199
    invoke-static {v2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    iput-object v6, v5, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 204
    .line 205
    const-string v6, "codecs-string"

    .line 206
    .line 207
    invoke-virtual {v1, v6}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    iput-object v6, v5, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 212
    .line 213
    const-string v6, "frame-rate"

    .line 214
    .line 215
    const/high16 v7, -0x40800000    # -1.0f

    .line 216
    .line 217
    invoke-virtual {v1, v6, v7}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;F)F

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    iput v6, v5, Landroidx/media3/common/v;->v:F

    .line 222
    .line 223
    const-string v6, "width"

    .line 224
    .line 225
    invoke-virtual {v1, v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    iput v6, v5, Landroidx/media3/common/v;->t:I

    .line 230
    .line 231
    const-string v6, "height"

    .line 232
    .line 233
    invoke-virtual {v1, v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    iput v6, v5, Landroidx/media3/common/v;->u:I

    .line 238
    .line 239
    invoke-static {v1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->getInitializationData(Landroid/media/MediaFormat;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    iput-object v6, v5, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 244
    .line 245
    const-string v6, "language"

    .line 246
    .line 247
    invoke-virtual {v1, v6}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    iput-object v6, v5, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 252
    .line 253
    const-string v6, "max-input-size"

    .line 254
    .line 255
    invoke-virtual {v1, v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    iput v6, v5, Landroidx/media3/common/v;->n:I

    .line 260
    .line 261
    const-string v6, "exo-pcm-encoding"

    .line 262
    .line 263
    invoke-virtual {v1, v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    iput v6, v5, Landroidx/media3/common/v;->D:I

    .line 268
    .line 269
    const-string v6, "rotation-degrees"

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    invoke-virtual {v1, v6, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    iput v6, v5, Landroidx/media3/common/v;->w:I

    .line 277
    .line 278
    const-string v6, "sample-rate"

    .line 279
    .line 280
    invoke-virtual {v1, v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    iput v4, v5, Landroidx/media3/common/v;->C:I

    .line 285
    .line 286
    invoke-static {v1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->getSelectionFlags(Landroid/media/MediaFormat;)I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    iput v4, v5, Landroidx/media3/common/v;->e:I

    .line 291
    .line 292
    const-string v4, "encoder-delay"

    .line 293
    .line 294
    invoke-virtual {v1, v4, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    iput v4, v5, Landroidx/media3/common/v;->E:I

    .line 299
    .line 300
    const-string v4, "encoder-padding"

    .line 301
    .line 302
    invoke-virtual {v1, v4, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    iput v4, v5, Landroidx/media3/common/v;->F:I

    .line 307
    .line 308
    const-string v4, "pixel-width-height-ratio-float"

    .line 309
    .line 310
    const/high16 v6, 0x3f800000    # 1.0f

    .line 311
    .line 312
    invoke-virtual {v1, v4, v6}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;F)F

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    iput v4, v5, Landroidx/media3/common/v;->x:F

    .line 317
    .line 318
    const-string v4, "subsample-offset-us-long"

    .line 319
    .line 320
    const-wide v8, 0x7fffffffffffffffL

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v4, v8, v9}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;J)J

    .line 326
    .line 327
    .line 328
    move-result-wide v8

    .line 329
    iput-wide v8, v5, Landroidx/media3/common/v;->r:J

    .line 330
    .line 331
    iput v3, v5, Landroidx/media3/common/v;->G:I

    .line 332
    .line 333
    :goto_b
    iget-object v1, v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->muxedCaptionFormats:Ljava/util/List;

    .line 334
    .line 335
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-ge v7, v1, :cond_e

    .line 340
    .line 341
    iget-object v1, v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->muxedCaptionFormats:Ljava/util/List;

    .line 342
    .line 343
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, Landroidx/media3/common/w;

    .line 348
    .line 349
    iget-object v4, v1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    if-eqz v4, :cond_d

    .line 356
    .line 357
    iget v4, v1, Landroidx/media3/common/w;->H:I

    .line 358
    .line 359
    if-ne v4, v3, :cond_d

    .line 360
    .line 361
    iget-object v2, v1, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 362
    .line 363
    iput-object v2, v5, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 364
    .line 365
    iget v2, v1, Landroidx/media3/common/w;->f:I

    .line 366
    .line 367
    iput v2, v5, Landroidx/media3/common/v;->f:I

    .line 368
    .line 369
    iget v2, v1, Landroidx/media3/common/w;->e:I

    .line 370
    .line 371
    iput v2, v5, Landroidx/media3/common/v;->e:I

    .line 372
    .line 373
    iget-object v2, v1, Landroidx/media3/common/w;->b:Ljava/lang/String;

    .line 374
    .line 375
    iput-object v2, v5, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 376
    .line 377
    iget-object v2, v1, Landroidx/media3/common/w;->c:Lf6/m0;

    .line 378
    .line 379
    invoke-static {v2}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    iput-object v2, v5, Landroidx/media3/common/v;->c:Lf6/m0;

    .line 384
    .line 385
    iget-object v1, v1, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 386
    .line 387
    iput-object v1, v5, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_e
    :goto_c
    new-instance v1, Landroidx/media3/common/w;

    .line 394
    .line 395
    invoke-direct {v1, v5}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 396
    .line 397
    .line 398
    return-object v1
.end method

.method private static toTrackTypeConstant(Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x1

    .line 12
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    :goto_0
    move v1, v0

    .line 16
    goto :goto_1

    .line 17
    :sswitch_0
    const-string v1, "video"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x4

    .line 27
    goto :goto_1

    .line 28
    :sswitch_1
    const-string v1, "audio"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move v1, v2

    .line 38
    goto :goto_1

    .line 39
    :sswitch_2
    const-string v1, "text"

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    move v1, v3

    .line 49
    goto :goto_1

    .line 50
    :sswitch_3
    const-string v1, "unknown"

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_4

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    move v1, v4

    .line 60
    goto :goto_1

    .line 61
    :sswitch_4
    const-string v1, "metadata"

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_5

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    const/4 v1, 0x0

    .line 71
    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Landroidx/media3/common/u0;->i(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    :pswitch_0
    return v3

    .line 80
    :pswitch_1
    return v4

    .line 81
    :pswitch_2
    return v2

    .line 82
    :pswitch_3
    return v0

    .line 83
    :pswitch_4
    const/4 p0, 0x5

    .line 84
    return p0

    .line 85
    :sswitch_data_0
    .sparse-switch
        -0x1ad284d1 -> :sswitch_4
        -0x10fa53b6 -> :sswitch_3
        0x36452d -> :sswitch_2
        0x58d9bd6 -> :sswitch_1
        0x6b0147b -> :sswitch_0
    .end sparse-switch

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
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public disableSeeking()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->seekingDisabled:Z

    .line 3
    .line 4
    return-void
.end method

.method public getChunkIndex()Ln1/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastChunkIndex:Ln1/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDummySeekMap()Landroid/media/MediaParser$SeekMap;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->dummySeekMap:Landroid/media/MediaParser$SeekMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSampleFormats()[Landroidx/media3/common/w;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->tracksFoundCalled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackFormats:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v0, v0, [Landroidx/media3/common/w;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackFormats:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge v1, v2, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackFormats:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroidx/media3/common/w;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    aput-object v2, v0, v1

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-object v0
.end method

.method public getSeekPoints(J)Landroid/util/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Landroid/util/Pair<",
            "Landroid/media/MediaParser$SeekPoint;",
            "Landroid/media/MediaParser$SeekPoint;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastSeekMap:Landroid/media/MediaParser$SeekMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaParser$SeekMap;->getSeekPoints(J)Landroid/util/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    sget-object p1, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->SEEK_POINT_PAIR_START:Landroid/util/Pair;

    .line 11
    .line 12
    return-object p1
.end method

.method public onSampleCompleted(IJIIILandroid/media/MediaCodec$CryptoInfo;)V
    .locals 7

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->sampleTimestampUpperLimitFilterUs:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    cmp-long v0, p2, v0

    .line 13
    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->timestampAdjuster:Lh1/d0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, p2, p3}, Lh1/d0;->a(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    :cond_1
    move-wide v1, p2

    .line 26
    iget-object p2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, Ln1/i0;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, p7}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->toExoPlayerCryptoData(ILandroid/media/MediaCodec$CryptoInfo;)Ln1/h0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    move v3, p4

    .line 43
    move v4, p5

    .line 44
    move v5, p6

    .line 45
    invoke-interface/range {v0 .. v6}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public onSampleDataFound(ILandroid/media/MediaParser$InputReader;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->ensureSpaceForTrackIndex(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->scratchDataReaderAdapter:Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;

    .line 5
    .line 6
    iput-object p2, v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;->input:Landroid/media/MediaParser$InputReader;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ln1/i0;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->extractorOutput:Ln1/p;

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    invoke-interface {v0, p1, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->scratchDataReaderAdapter:Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$DataReaderAdapter;

    .line 31
    .line 32
    invoke-interface {p2}, Landroid/media/MediaParser$InputReader;->getLength()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    long-to-int p2, v1

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-interface {v0, p1, p2, v1}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onSeekMapFound(Landroid/media/MediaParser$SeekMap;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->expectDummySeekMap:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->dummySeekMap:Landroid/media/MediaParser$SeekMap;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->dummySeekMap:Landroid/media/MediaParser$SeekMap;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->lastSeekMap:Landroid/media/MediaParser$SeekMap;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/media/MediaParser$SeekMap;->getDurationMicros()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->extractorOutput:Ln1/p;

    .line 19
    .line 20
    iget-boolean v3, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->seekingDisabled:Z

    .line 21
    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    new-instance p1, Ln1/s;

    .line 25
    .line 26
    const-wide/32 v3, -0x80000000

    .line 27
    .line 28
    .line 29
    cmp-long v3, v0, v3

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-direct {p1, v0, v1}, Ln1/s;-><init>(J)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    new-instance v0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;-><init>(Landroid/media/MediaParser$SeekMap;)V

    .line 46
    .line 47
    .line 48
    move-object p1, v0

    .line 49
    :goto_1
    invoke-interface {v2, p1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public onTrackCountFound(I)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->tracksFoundCalled:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->maybeEndTracks()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onTrackDataFound(ILandroid/media/MediaParser$TrackData;)V
    .locals 3

    .line 1
    invoke-static {p2}, Landroidx/media3/common/n;->d(Landroid/media/MediaParser$TrackData;)Landroid/media/MediaFormat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->maybeObtainChunkIndex(Landroid/media/MediaFormat;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->ensureSpaceForTrackIndex(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ln1/i0;

    .line 22
    .line 23
    if-nez v0, :cond_4

    .line 24
    .line 25
    invoke-static {p2}, Landroidx/media3/common/n;->d(Landroid/media/MediaParser$TrackData;)Landroid/media/MediaFormat;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "track-type-string"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    move-object v1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {p2}, Landroidx/media3/common/n;->d(Landroid/media/MediaParser$TrackData;)Landroid/media/MediaFormat;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "mime"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_0
    invoke-static {v1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->toTrackTypeConstant(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->primaryTrackType:I

    .line 54
    .line 55
    if-ne v1, v2, :cond_2

    .line 56
    .line 57
    iput p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->primaryTrackIndex:I

    .line 58
    .line 59
    :cond_2
    iget-object v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->extractorOutput:Ln1/p;

    .line 60
    .line 61
    invoke-interface {v2, p1, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackOutputs:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v2, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    :goto_1
    return-void

    .line 73
    :cond_3
    move-object v0, v1

    .line 74
    :cond_4
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->toExoPlayerFormat(Landroid/media/MediaParser$TrackData;)Landroidx/media3/common/w;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iget-object v1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->primaryTrackManifestFormat:Landroidx/media3/common/w;

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    iget v2, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->primaryTrackIndex:I

    .line 83
    .line 84
    if-ne p1, v2, :cond_5

    .line 85
    .line 86
    invoke-virtual {p2, v1}, Landroidx/media3/common/w;->f(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    move-object v1, p2

    .line 92
    :goto_2
    invoke-interface {v0, v1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->trackFormats:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-direct {p0}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->maybeEndTracks()V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public setExtractorOutput(Ln1/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->extractorOutput:Ln1/p;

    .line 2
    .line 3
    return-void
.end method

.method public setMuxedCaptionFormats(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->muxedCaptionFormats:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public setSampleTimestampUpperLimitFilterUs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->sampleTimestampUpperLimitFilterUs:J

    .line 2
    .line 3
    return-void
.end method

.method public setSelectedParserName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->getMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->containerMimeType:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method

.method public setTimestampAdjuster(Lh1/d0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;->timestampAdjuster:Lh1/d0;

    .line 2
    .line 3
    return-void
.end method
