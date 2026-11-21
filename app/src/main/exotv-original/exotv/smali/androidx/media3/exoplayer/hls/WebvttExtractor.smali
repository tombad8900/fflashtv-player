.class public final Landroidx/media3/exoplayer/hls/WebvttExtractor;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# static fields
.field private static final HEADER_MAX_LENGTH:I = 0x9

.field private static final HEADER_MIN_LENGTH:I = 0x6

.field private static final LOCAL_TIMESTAMP:Ljava/util/regex/Pattern;

.field private static final MEDIA_TIMESTAMP:Ljava/util/regex/Pattern;


# instance fields
.field private final language:Ljava/lang/String;

.field private output:Ln1/p;

.field private final parseSubtitlesDuringExtraction:Z

.field private sampleData:[B

.field private final sampleDataWrapper:Lh1/w;

.field private sampleSize:I

.field private final subtitleParserFactory:Lk2/o;

.field private final timestampAdjuster:Lh1/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "LOCAL:([^,]+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->LOCAL_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "MPEGTS:(-?\\d+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->MEDIA_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lh1/d0;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Lk2/o;->g:Lk2/b;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/exoplayer/hls/WebvttExtractor;-><init>(Ljava/lang/String;Lh1/d0;Lk2/o;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lh1/d0;Lk2/o;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->language:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->timestampAdjuster:Lh1/d0;

    .line 5
    new-instance p1, Lh1/w;

    invoke-direct {p1}, Lh1/w;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Lh1/w;

    const/16 p1, 0x400

    .line 6
    new-array p1, p1, [B

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 7
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->subtitleParserFactory:Lk2/o;

    .line 8
    iput-boolean p4, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->parseSubtitlesDuringExtraction:Z

    return-void
.end method

.method private buildTrackOutput(J)Ln1/i0;
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Ln1/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-interface {v0, v1, v2}, Ln1/p;->track(II)Ln1/i0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Landroidx/media3/common/v;

    .line 10
    .line 11
    invoke-direct {v1}, Landroidx/media3/common/v;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "text/vtt"

    .line 15
    .line 16
    invoke-static {v2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, v1, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->language:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v2, v1, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 25
    .line 26
    iput-wide p1, v1, Landroidx/media3/common/v;->r:J

    .line 27
    .line 28
    new-instance p1, Landroidx/media3/common/w;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, p1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Ln1/p;

    .line 37
    .line 38
    invoke-interface {p1}, Ln1/p;->endTracks()V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method private processSample()V
    .locals 15
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    new-instance v0, Lh1/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh1/w;-><init>([B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ls2/i;->d(Lh1/w;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    move-wide v4, v2

    .line 20
    move-wide v6, v4

    .line 21
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    const/4 v9, 0x1

    .line 26
    const/4 v10, 0x0

    .line 27
    if-nez v8, :cond_3

    .line 28
    .line 29
    const-string v8, "X-TIMESTAMP-MAP"

    .line 30
    .line 31
    invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_2

    .line 36
    .line 37
    sget-object v4, Landroidx/media3/exoplayer/hls/WebvttExtractor;->LOCAL_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 38
    .line 39
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    sget-object v5, Landroidx/media3/exoplayer/hls/WebvttExtractor;->MEDIA_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 50
    .line 51
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_0

    .line 60
    .line 61
    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Ls2/i;->c(Ljava/lang/String;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v8

    .line 83
    sget v1, Lh1/i0;->a:I

    .line 84
    .line 85
    sget-object v14, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 86
    .line 87
    const-wide/32 v10, 0xf4240

    .line 88
    .line 89
    .line 90
    const-wide/32 v12, 0x15f90

    .line 91
    .line 92
    .line 93
    invoke-static/range {v8 .. v14}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    goto :goto_1

    .line 98
    :cond_0
    const-string v0, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0, v10}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    throw v0

    .line 109
    :cond_1
    const-string v0, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0, v10}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    throw v0

    .line 120
    :cond_2
    :goto_1
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    goto :goto_0

    .line 127
    :cond_3
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    sget-object v8, Ls2/i;->a:Ljava/util/regex/Pattern;

    .line 136
    .line 137
    invoke-virtual {v8, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_4

    .line 146
    .line 147
    :goto_2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-eqz v1, :cond_3

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_3

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_4
    sget-object v8, Ls2/h;->a:Ljava/util/regex/Pattern;

    .line 163
    .line 164
    invoke-virtual {v8, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    if-eqz v8, :cond_3

    .line 173
    .line 174
    move-object v10, v1

    .line 175
    :cond_5
    if-nez v10, :cond_6

    .line 176
    .line 177
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/hls/WebvttExtractor;->buildTrackOutput(J)Ln1/i0;

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_6
    invoke-virtual {v10, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Ls2/i;->c(Ljava/lang/String;)J

    .line 189
    .line 190
    .line 191
    move-result-wide v0

    .line 192
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->timestampAdjuster:Lh1/d0;

    .line 193
    .line 194
    add-long/2addr v4, v0

    .line 195
    sub-long v8, v4, v6

    .line 196
    .line 197
    sget v3, Lh1/i0;->a:I

    .line 198
    .line 199
    sget-object v14, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 200
    .line 201
    const-wide/32 v10, 0x15f90

    .line 202
    .line 203
    .line 204
    const-wide/32 v12, 0xf4240

    .line 205
    .line 206
    .line 207
    invoke-static/range {v8 .. v14}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 208
    .line 209
    .line 210
    move-result-wide v3

    .line 211
    const-wide v5, 0x200000000L

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    rem-long/2addr v3, v5

    .line 217
    invoke-virtual {v2, v3, v4}, Lh1/d0;->b(J)J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    sub-long v0, v6, v0

    .line 222
    .line 223
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/hls/WebvttExtractor;->buildTrackOutput(J)Ln1/i0;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Lh1/w;

    .line 228
    .line 229
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 230
    .line 231
    iget v2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 232
    .line 233
    invoke-virtual {v0, v1, v2}, Lh1/w;->E([BI)V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Lh1/w;

    .line 237
    .line 238
    iget v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 239
    .line 240
    invoke-interface {v5, v0, v1}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 241
    .line 242
    .line 243
    iget v9, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 244
    .line 245
    const/4 v10, 0x0

    .line 246
    const/4 v11, 0x0

    .line 247
    const/4 v8, 0x1

    .line 248
    invoke-interface/range {v5 .. v11}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 249
    .line 250
    .line 251
    return-void
.end method


# virtual methods
.method public getSniffFailureDetails()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 2
    .line 3
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    .line 4
    .line 5
    return-object v0
.end method

.method public getUnderlyingImplementation()Ln1/n;
    .locals 0
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    .line 1
    return-object p0
.end method

.method public init(Ln1/p;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->parseSubtitlesDuringExtraction:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La4/c;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->subtitleParserFactory:Lk2/o;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, La4/c;-><init>(Ln1/p;Lk2/o;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Ln1/p;

    .line 14
    .line 15
    new-instance v0, Ln1/s;

    .line 16
    .line 17
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Ln1/s;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v0}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public read(Ln1/o;Ln1/a0;)I
    .locals 4

    .line 1
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Ln1/p;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ln1/o;->getLength()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    long-to-int p2, v0

    .line 11
    iget v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, -0x1

    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    if-eq p2, v3, :cond_0

    .line 20
    .line 21
    move v0, p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    array-length v0, v1

    .line 24
    :goto_0
    mul-int/lit8 v0, v0, 0x3

    .line 25
    .line 26
    div-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 35
    .line 36
    iget v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 37
    .line 38
    array-length v2, v0

    .line 39
    sub-int/2addr v2, v1

    .line 40
    invoke-interface {p1, v0, v1, v2}, Landroidx/media3/common/m;->read([BII)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eq p1, v3, :cond_3

    .line 45
    .line 46
    iget v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 47
    .line 48
    add-int/2addr v0, p1

    .line 49
    iput v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 50
    .line 51
    if-eq p2, v3, :cond_2

    .line 52
    .line 53
    if-eq v0, p2, :cond_3

    .line 54
    .line 55
    :cond_2
    const/4 p1, 0x0

    .line 56
    return p1

    .line 57
    :cond_3
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/WebvttExtractor;->processSample()V

    .line 58
    .line 59
    .line 60
    return v3
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method

.method public seek(JJ)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public sniff(Ln1/o;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-interface {p1, v0, v1, v2, v1}, Ln1/o;->b([BIIZ)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Lh1/w;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 11
    .line 12
    invoke-virtual {v0, v3, v2}, Lh1/w;->E([BI)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Lh1/w;

    .line 16
    .line 17
    invoke-static {v0}, Ls2/i;->a(Lh1/w;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 26
    .line 27
    const/4 v3, 0x3

    .line 28
    invoke-interface {p1, v0, v2, v3, v1}, Ln1/o;->b([BIIZ)Z

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Lh1/w;

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 34
    .line 35
    const/16 v1, 0x9

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Lh1/w;->E([BI)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Lh1/w;

    .line 41
    .line 42
    invoke-static {p1}, Ls2/i;->a(Lh1/w;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
.end method
