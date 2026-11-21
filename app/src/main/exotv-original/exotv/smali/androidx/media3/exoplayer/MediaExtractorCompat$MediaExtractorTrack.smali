.class final Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/MediaExtractorCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaExtractorTrack"
.end annotation


# instance fields
.field public final compatibilityTrackMimeType:Ljava/lang/String;

.field public final isCompatibilityTrack:Z

.field public final sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;ZLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 4
    iput-boolean p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->isCompatibilityTrack:Z

    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->compatibilityTrackMimeType:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;ZLjava/lang/String;Landroidx/media3/exoplayer/MediaExtractorCompat$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;-><init>(Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createDownstreamMediaFormat(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;)Landroid/media/MediaFormat;
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/FormatHolder;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/media3/exoplayer/source/SampleQueue;->read(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;IZ)I

    .line 9
    .line 10
    .line 11
    iget-object p2, p1, Landroidx/media3/exoplayer/FormatHolder;->format:Landroidx/media3/common/w;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/media/MediaFormat;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "bitrate"

    .line 22
    .line 23
    iget v4, p2, Landroidx/media3/common/w;->j:I

    .line 24
    .line 25
    invoke-static {v0, v3, v4}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    const-string v3, "max-bitrate"

    .line 29
    .line 30
    iget v4, p2, Landroidx/media3/common/w;->i:I

    .line 31
    .line 32
    invoke-static {v0, v3, v4}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    const-string v3, "channel-count"

    .line 36
    .line 37
    iget v4, p2, Landroidx/media3/common/w;->C:I

    .line 38
    .line 39
    invoke-static {v0, v3, v4}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p2, Landroidx/media3/common/w;->B:Landroidx/media3/common/l;

    .line 43
    .line 44
    invoke-static {v0, v3}, Lh1/a;->y(Landroid/media/MediaFormat;Landroidx/media3/common/l;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, p2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 48
    .line 49
    const-string v4, "mime"

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v4, v3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object v3, p2, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 57
    .line 58
    const-string v5, "codecs-string"

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0, v5, v3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget v3, p2, Landroidx/media3/common/w;->w:F

    .line 66
    .line 67
    const/high16 v6, -0x40800000    # -1.0f

    .line 68
    .line 69
    cmpl-float v6, v3, v6

    .line 70
    .line 71
    if-eqz v6, :cond_2

    .line 72
    .line 73
    const-string v6, "frame-rate"

    .line 74
    .line 75
    invoke-virtual {v0, v6, v3}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 76
    .line 77
    .line 78
    :cond_2
    const-string v3, "width"

    .line 79
    .line 80
    iget v6, p2, Landroidx/media3/common/w;->u:I

    .line 81
    .line 82
    invoke-static {v0, v3, v6}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    const-string v3, "height"

    .line 86
    .line 87
    iget v6, p2, Landroidx/media3/common/w;->v:I

    .line 88
    .line 89
    invoke-static {v0, v3, v6}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    iget-object v3, p2, Landroidx/media3/common/w;->q:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v0, v3}, Lh1/a;->D(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    iget v3, p2, Landroidx/media3/common/w;->E:I

    .line 98
    .line 99
    const/4 v6, -0x1

    .line 100
    if-ne v3, v6, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    const-string v6, "exo-pcm-encoding-int"

    .line 104
    .line 105
    invoke-static {v0, v6, v3}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 106
    .line 107
    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    if-eq v3, v1, :cond_4

    .line 111
    .line 112
    const/4 v6, 0x3

    .line 113
    if-eq v3, v6, :cond_6

    .line 114
    .line 115
    const/4 v6, 0x4

    .line 116
    if-eq v3, v6, :cond_6

    .line 117
    .line 118
    const/16 v6, 0x15

    .line 119
    .line 120
    if-eq v3, v6, :cond_6

    .line 121
    .line 122
    const/16 v6, 0x16

    .line 123
    .line 124
    if-eq v3, v6, :cond_6

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    move v6, v1

    .line 128
    goto :goto_0

    .line 129
    :cond_5
    move v6, v2

    .line 130
    :cond_6
    :goto_0
    const-string v3, "pcm-encoding"

    .line 131
    .line 132
    invoke-virtual {v0, v3, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    :goto_1
    iget-object v3, p2, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v3, :cond_7

    .line 138
    .line 139
    const-string v6, "language"

    .line 140
    .line 141
    invoke-virtual {v0, v6, v3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_7
    const-string v3, "max-input-size"

    .line 145
    .line 146
    iget v6, p2, Landroidx/media3/common/w;->o:I

    .line 147
    .line 148
    invoke-static {v0, v3, v6}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    const-string v3, "sample-rate"

    .line 152
    .line 153
    iget v6, p2, Landroidx/media3/common/w;->D:I

    .line 154
    .line 155
    invoke-static {v0, v3, v6}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 156
    .line 157
    .line 158
    const-string v3, "caption-service-number"

    .line 159
    .line 160
    iget v6, p2, Landroidx/media3/common/w;->H:I

    .line 161
    .line 162
    invoke-static {v0, v3, v6}, Lh1/a;->z(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    const-string v3, "rotation-degrees"

    .line 166
    .line 167
    iget v6, p2, Landroidx/media3/common/w;->x:I

    .line 168
    .line 169
    invoke-virtual {v0, v3, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    iget v3, p2, Landroidx/media3/common/w;->e:I

    .line 173
    .line 174
    and-int/lit8 v6, v3, 0x4

    .line 175
    .line 176
    const/4 v7, 0x1

    .line 177
    if-eqz v6, :cond_8

    .line 178
    .line 179
    move v6, v7

    .line 180
    goto :goto_2

    .line 181
    :cond_8
    move v6, v2

    .line 182
    :goto_2
    const-string v8, "is-autoselect"

    .line 183
    .line 184
    invoke-virtual {v0, v8, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 185
    .line 186
    .line 187
    and-int/lit8 v6, v3, 0x1

    .line 188
    .line 189
    if-eqz v6, :cond_9

    .line 190
    .line 191
    move v6, v7

    .line 192
    goto :goto_3

    .line 193
    :cond_9
    move v6, v2

    .line 194
    :goto_3
    const-string v8, "is-default"

    .line 195
    .line 196
    invoke-virtual {v0, v8, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    and-int/2addr v1, v3

    .line 200
    if-eqz v1, :cond_a

    .line 201
    .line 202
    move v2, v7

    .line 203
    :cond_a
    const-string v1, "is-forced-subtitle"

    .line 204
    .line 205
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 206
    .line 207
    .line 208
    const-string v1, "encoder-delay"

    .line 209
    .line 210
    iget v2, p2, Landroidx/media3/common/w;->F:I

    .line 211
    .line 212
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 213
    .line 214
    .line 215
    const-string v1, "encoder-padding"

    .line 216
    .line 217
    iget v2, p2, Landroidx/media3/common/w;->G:I

    .line 218
    .line 219
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    iget p2, p2, Landroidx/media3/common/w;->y:F

    .line 223
    .line 224
    const-string v1, "exo-pixel-width-height-ratio-float"

    .line 225
    .line 226
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 227
    .line 228
    .line 229
    const/high16 v1, 0x3f800000    # 1.0f

    .line 230
    .line 231
    cmpg-float v2, p2, v1

    .line 232
    .line 233
    const/high16 v3, 0x40000000    # 2.0f

    .line 234
    .line 235
    if-gez v2, :cond_b

    .line 236
    .line 237
    int-to-float v1, v3

    .line 238
    mul-float/2addr p2, v1

    .line 239
    float-to-int v7, p2

    .line 240
    goto :goto_4

    .line 241
    :cond_b
    cmpl-float v1, p2, v1

    .line 242
    .line 243
    if-lez v1, :cond_c

    .line 244
    .line 245
    int-to-float v1, v3

    .line 246
    div-float/2addr v1, p2

    .line 247
    float-to-int v7, v1

    .line 248
    move v9, v7

    .line 249
    move v7, v3

    .line 250
    move v3, v9

    .line 251
    goto :goto_4

    .line 252
    :cond_c
    move v3, v7

    .line 253
    :goto_4
    const-string p2, "sar-width"

    .line 254
    .line 255
    invoke-virtual {v0, p2, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 256
    .line 257
    .line 258
    const-string p2, "sar-height"

    .line 259
    .line 260
    invoke-virtual {v0, p2, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1}, Landroidx/media3/exoplayer/FormatHolder;->clear()V

    .line 264
    .line 265
    .line 266
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->compatibilityTrackMimeType:Ljava/lang/String;

    .line 267
    .line 268
    if-eqz p1, :cond_e

    .line 269
    .line 270
    sget p1, Lh1/i0;->a:I

    .line 271
    .line 272
    const/16 p2, 0x1d

    .line 273
    .line 274
    if-lt p1, p2, :cond_d

    .line 275
    .line 276
    invoke-virtual {v0, v5}, Landroid/media/MediaFormat;->removeKey(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :cond_d
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->compatibilityTrackMimeType:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v0, v4, p1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :cond_e
    return-object v0
.end method

.method public discardFrontSample()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/source/SampleQueue;->skip(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/SampleQueue;->discardToRead()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public getIdOfBackingTrack()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->trackId:I

    .line 4
    .line 5
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->isCompatibilityTrack:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->compatibilityTrackMimeType:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v4, "MediaExtractorSampleQueue: "

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", isCompatibilityTrack: "

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", compatibilityTrackMimeType: "

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
