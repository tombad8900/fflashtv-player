.class public Landroidx/media3/exoplayer/image/ImageRenderer;
.super Landroidx/media3/exoplayer/BaseRenderer;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;,
        Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;
    }
.end annotation


# static fields
.field private static final IMAGE_PRESENTATION_WINDOW_THRESHOLD_US:J = 0x7530L

.field private static final REINITIALIZATION_STATE_NONE:I = 0x0

.field private static final REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM_THEN_WAIT:I = 0x2

.field private static final REINITIALIZATION_STATE_WAIT_END_OF_STREAM:I = 0x3

.field private static final TAG:Ljava/lang/String; = "ImageRenderer"


# instance fields
.field private currentTileIndex:I

.field private decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

.field private final decoderFactory:Landroidx/media3/exoplayer/image/ImageDecoder$Factory;

.field private decoderReinitializationState:I

.field private firstFrameState:I

.field private final flagsOnlyBuffer:Lm1/g;

.field private imageOutput:Landroidx/media3/exoplayer/image/ImageOutput;

.field private inputBuffer:Lm1/g;

.field private inputFormat:Landroidx/media3/common/w;

.field private inputStreamEnded:Z

.field private largestQueuedPresentationTimeUs:J

.field private lastProcessedOutputBufferTimeUs:J

.field private nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

.field private outputBitmap:Landroid/graphics/Bitmap;

.field private outputStreamEnded:Z

.field private outputStreamInfo:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

.field private final pendingOutputStreamChanges:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;",
            ">;"
        }
    .end annotation
.end field

.field private readyToOutputTiles:Z

.field private tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/image/ImageDecoder$Factory;Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/BaseRenderer;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderFactory:Landroidx/media3/exoplayer/image/ImageDecoder$Factory;

    .line 6
    .line 7
    invoke-static {p2}, Landroidx/media3/exoplayer/image/ImageRenderer;->getImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->imageOutput:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 12
    .line 13
    invoke-static {}, Lm1/g;->newNoDataInstance()Lm1/g;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->flagsOnlyBuffer:Lm1/g;

    .line 18
    .line 19
    sget-object p1, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;->UNSET:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamInfo:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->largestQueuedPresentationTimeUs:J

    .line 36
    .line 37
    iput-wide p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->lastProcessedOutputBufferTimeUs:J

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderReinitializationState:I

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 44
    .line 45
    return-void
.end method

.method private canCreateDecoderForFormat(Landroidx/media3/common/w;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderFactory:Landroidx/media3/exoplayer/image/ImageDecoder$Factory;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/image/ImageDecoder$Factory;->supportsFormat(Landroidx/media3/common/w;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x4

    .line 8
    invoke-static {v0}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    invoke-static {v0}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1
.end method

.method private cropTileFromImageGrid(I)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 13
    .line 14
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget v1, v1, Landroidx/media3/common/w;->J:I

    .line 18
    .line 19
    div-int/2addr v0, v1

    .line 20
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 27
    .line 28
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget v2, v2, Landroidx/media3/common/w;->K:I

    .line 32
    .line 33
    div-int/2addr v1, v2

    .line 34
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 35
    .line 36
    iget v2, v2, Landroidx/media3/common/w;->J:I

    .line 37
    .line 38
    rem-int v3, p1, v2

    .line 39
    .line 40
    mul-int/2addr v3, v0

    .line 41
    div-int/2addr p1, v2

    .line 42
    mul-int/2addr p1, v1

    .line 43
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    invoke-static {v2, v3, p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
.end method

.method private drainOutput(JJ)Z
    .locals 12

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    iget v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getState()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 26
    .line 27
    const/4 v9, 0x3

    .line 28
    const/4 v10, 0x1

    .line 29
    if-nez v1, :cond_5

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 32
    .line 33
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 37
    .line 38
    invoke-interface {v1}, Landroidx/media3/exoplayer/image/ImageDecoder;->dequeueOutputBuffer()Landroidx/media3/exoplayer/image/ImageOutputBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :cond_2
    invoke-virtual {v1}, Lm1/a;->isEndOfStream()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    iget v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderReinitializationState:I

    .line 53
    .line 54
    if-ne v2, v9, :cond_3

    .line 55
    .line 56
    invoke-direct {p0}, Landroidx/media3/exoplayer/image/ImageRenderer;->releaseDecoderResources()V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 60
    .line 61
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Landroidx/media3/exoplayer/image/ImageRenderer;->initDecoder()V

    .line 65
    .line 66
    .line 67
    return v8

    .line 68
    :cond_3
    invoke-virtual {v1}, Lm1/h;->release()V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_d

    .line 78
    .line 79
    iput-boolean v10, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamEnded:Z

    .line 80
    .line 81
    return v8

    .line 82
    :cond_4
    iget-object v2, v1, Landroidx/media3/exoplayer/image/ImageOutputBuffer;->bitmap:Landroid/graphics/Bitmap;

    .line 83
    .line 84
    const-string v3, "Non-EOS buffer came back from the decoder without bitmap."

    .line 85
    .line 86
    invoke-static {v3, v2}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v1, Landroidx/media3/exoplayer/image/ImageOutputBuffer;->bitmap:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    iput-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 92
    .line 93
    invoke-virtual {v1}, Lm1/h;->release()V

    .line 94
    .line 95
    .line 96
    :cond_5
    iget-boolean v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 97
    .line 98
    if-eqz v1, :cond_d

    .line 99
    .line 100
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    if-eqz v1, :cond_d

    .line 103
    .line 104
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 105
    .line 106
    if-eqz v1, :cond_d

    .line 107
    .line 108
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 109
    .line 110
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 114
    .line 115
    iget v2, v1, Landroidx/media3/common/w;->J:I

    .line 116
    .line 117
    iget v1, v1, Landroidx/media3/common/w;->K:I

    .line 118
    .line 119
    if-ne v2, v10, :cond_6

    .line 120
    .line 121
    if-eq v1, v10, :cond_7

    .line 122
    .line 123
    :cond_6
    const/4 v3, -0x1

    .line 124
    if-eq v2, v3, :cond_7

    .line 125
    .line 126
    if-eq v1, v3, :cond_7

    .line 127
    .line 128
    move v11, v10

    .line 129
    goto :goto_0

    .line 130
    :cond_7
    move v11, v8

    .line 131
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 132
    .line 133
    invoke-virtual {v1}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->hasTileBitmap()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_9

    .line 138
    .line 139
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 140
    .line 141
    if-eqz v11, :cond_8

    .line 142
    .line 143
    invoke-virtual {v1}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getTileIndex()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/image/ImageRenderer;->cropTileFromImageGrid(I)Landroid/graphics/Bitmap;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    goto :goto_1

    .line 152
    :cond_8
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 153
    .line 154
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :goto_1
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->setTileBitmap(Landroid/graphics/Bitmap;)V

    .line 158
    .line 159
    .line 160
    :cond_9
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getTileBitmap()Landroid/graphics/Bitmap;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-static {v5}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 170
    .line 171
    invoke-virtual {v1}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getPresentationTimeUs()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    move-object v0, p0

    .line 176
    move-wide v1, p1

    .line 177
    move-wide v3, p3

    .line 178
    invoke-virtual/range {v0 .. v7}, Landroidx/media3/exoplayer/image/ImageRenderer;->processOutputBuffer(JJLandroid/graphics/Bitmap;J)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_a

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_a
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 186
    .line 187
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getPresentationTimeUs()J

    .line 191
    .line 192
    .line 193
    move-result-wide v1

    .line 194
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/image/ImageRenderer;->onProcessedOutputBuffer(J)V

    .line 195
    .line 196
    .line 197
    iput v9, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 198
    .line 199
    const/4 v1, 0x0

    .line 200
    if-eqz v11, :cond_b

    .line 201
    .line 202
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 203
    .line 204
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getTileIndex()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    iget-object v3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 212
    .line 213
    invoke-static {v3}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget v3, v3, Landroidx/media3/common/w;->K:I

    .line 217
    .line 218
    iget-object v4, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 219
    .line 220
    invoke-static {v4}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget v4, v4, Landroidx/media3/common/w;->J:I

    .line 224
    .line 225
    mul-int/2addr v3, v4

    .line 226
    sub-int/2addr v3, v10

    .line 227
    if-ne v2, v3, :cond_c

    .line 228
    .line 229
    :cond_b
    iput-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 230
    .line 231
    :cond_c
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 232
    .line 233
    iput-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 234
    .line 235
    iput-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 236
    .line 237
    return v10

    .line 238
    :cond_d
    :goto_2
    return v8
.end method

.method private feedInputBuffer(J)Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getFormatHolder()Landroidx/media3/exoplayer/FormatHolder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 17
    .line 18
    if-eqz v2, :cond_d

    .line 19
    .line 20
    iget v3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderReinitializationState:I

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    if-eq v3, v4, :cond_d

    .line 24
    .line 25
    iget-boolean v3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputStreamEnded:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_1
    iget-object v3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 32
    .line 33
    if-nez v3, :cond_2

    .line 34
    .line 35
    invoke-interface {v2}, Landroidx/media3/exoplayer/image/ImageDecoder;->dequeueInputBuffer()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lm1/g;

    .line 40
    .line 41
    iput-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_2
    iget v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderReinitializationState:I

    .line 48
    .line 49
    const/4 v3, 0x2

    .line 50
    const/4 v5, 0x0

    .line 51
    if-ne v2, v3, :cond_3

    .line 52
    .line 53
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 54
    .line 55
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 59
    .line 60
    const/4 p2, 0x4

    .line 61
    invoke-virtual {p1, p2}, Lm1/a;->setFlags(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 65
    .line 66
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 70
    .line 71
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/image/ImageDecoder;->queueInputBuffer(Lm1/g;)V

    .line 72
    .line 73
    .line 74
    iput-object v5, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 75
    .line 76
    iput v4, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderReinitializationState:I

    .line 77
    .line 78
    return v1

    .line 79
    :cond_3
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 80
    .line 81
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/BaseRenderer;->readSource(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v4, -0x5

    .line 86
    const/4 v6, 0x1

    .line 87
    if-eq v2, v4, :cond_c

    .line 88
    .line 89
    const/4 v0, -0x4

    .line 90
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    const/4 p1, -0x3

    .line 93
    if-ne v2, p1, :cond_4

    .line 94
    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_5
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 104
    .line 105
    invoke-virtual {v0}, Lm1/g;->flip()V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 109
    .line 110
    iget-object v0, v0, Lm1/g;->data:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-gtz v0, :cond_7

    .line 119
    .line 120
    :cond_6
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 121
    .line 122
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lm1/a;->isEndOfStream()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_8

    .line 130
    .line 131
    :cond_7
    move v0, v6

    .line 132
    goto :goto_0

    .line 133
    :cond_8
    move v0, v1

    .line 134
    :goto_0
    if-eqz v0, :cond_9

    .line 135
    .line 136
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 137
    .line 138
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object v3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 142
    .line 143
    invoke-static {v3}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v2, v3}, Landroidx/media3/exoplayer/image/ImageDecoder;->queueInputBuffer(Lm1/g;)V

    .line 147
    .line 148
    .line 149
    iput v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->currentTileIndex:I

    .line 150
    .line 151
    :cond_9
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 152
    .line 153
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {p0, p1, p2, v2}, Landroidx/media3/exoplayer/image/ImageRenderer;->maybeAdvanceTileInfo(JLm1/g;)V

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 160
    .line 161
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Lm1/a;->isEndOfStream()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_a

    .line 169
    .line 170
    iput-boolean v6, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputStreamEnded:Z

    .line 171
    .line 172
    iput-object v5, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 173
    .line 174
    return v1

    .line 175
    :cond_a
    iget-wide p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->largestQueuedPresentationTimeUs:J

    .line 176
    .line 177
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 178
    .line 179
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-wide v1, v1, Lm1/g;->timeUs:J

    .line 183
    .line 184
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 185
    .line 186
    .line 187
    move-result-wide p1

    .line 188
    iput-wide p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->largestQueuedPresentationTimeUs:J

    .line 189
    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    iput-object v5, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_b
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 196
    .line 197
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Lm1/g;->clear()V

    .line 201
    .line 202
    .line 203
    :goto_1
    iget-boolean p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 204
    .line 205
    xor-int/2addr p1, v6

    .line 206
    return p1

    .line 207
    :cond_c
    iget-object p1, v0, Landroidx/media3/exoplayer/FormatHolder;->format:Landroidx/media3/common/w;

    .line 208
    .line 209
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 213
    .line 214
    iput v3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderReinitializationState:I

    .line 215
    .line 216
    return v6

    .line 217
    :cond_d
    :goto_2
    return v1
.end method

.method private static getImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Landroidx/media3/exoplayer/image/ImageOutput;->NO_OP:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method

.method private initDecoder()V
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "decoder"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "inputFormat"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/image/ImageRenderer;->canCreateDecoderForFormat(Landroidx/media3/common/w;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/media3/exoplayer/image/ImageDecoder;->release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderFactory:Landroidx/media3/exoplayer/image/ImageDecoder$Factory;

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/media3/exoplayer/image/ImageDecoder$Factory;->createImageDecoder()Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Landroidx/media3/exoplayer/image/ImageDecoderException;

    .line 26
    .line 27
    const-string v1, "Provided decoder factory can\'t create decoder for format."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/image/ImageDecoderException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 33
    .line 34
    const/16 v2, 0xfa5

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    throw v0
.end method

.method private isTileLastInGrid(Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget v0, v0, Landroidx/media3/common/w;->J:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 13
    .line 14
    iget v0, v0, Landroidx/media3/common/w;->K:I

    .line 15
    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getTileIndex()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 23
    .line 24
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget v0, v0, Landroidx/media3/common/w;->K:I

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 30
    .line 31
    iget v2, v2, Landroidx/media3/common/w;->J:I

    .line 32
    .line 33
    mul-int/2addr v0, v2

    .line 34
    sub-int/2addr v0, v1

    .line 35
    if-ne p1, v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :cond_1
    :goto_0
    return v1
.end method

.method private lowerFirstFrameState(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 8
    .line 9
    return-void
.end method

.method private maybeAdvanceTileInfo(JLm1/g;)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Lm1/a;->isEndOfStream()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 12
    .line 13
    iget v2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->currentTileIndex:I

    .line 14
    .line 15
    iget-wide v3, p3, Lm1/g;->timeUs:J

    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v4}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;-><init>(IJ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 21
    .line 22
    iget p3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->currentTileIndex:I

    .line 23
    .line 24
    add-int/2addr p3, v1

    .line 25
    iput p3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->currentTileIndex:I

    .line 26
    .line 27
    iget-boolean p3, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 28
    .line 29
    if-nez p3, :cond_5

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getPresentationTimeUs()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x7530

    .line 36
    .line 37
    sub-long v6, v2, v4

    .line 38
    .line 39
    cmp-long p3, v6, p1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    if-gtz p3, :cond_1

    .line 43
    .line 44
    add-long/2addr v4, v2

    .line 45
    cmp-long p3, p1, v4

    .line 46
    .line 47
    if-gtz p3, :cond_1

    .line 48
    .line 49
    move p3, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move p3, v0

    .line 52
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v4}, Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;->getPresentationTimeUs()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    cmp-long v4, v4, p1

    .line 61
    .line 62
    if-gtz v4, :cond_2

    .line 63
    .line 64
    cmp-long p1, p1, v2

    .line 65
    .line 66
    if-gez p1, :cond_2

    .line 67
    .line 68
    move p1, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move p1, v0

    .line 71
    :goto_1
    iget-object p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 72
    .line 73
    invoke-static {p2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/image/ImageRenderer;->isTileLastInGrid(Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-nez p3, :cond_4

    .line 81
    .line 82
    if-nez p1, :cond_4

    .line 83
    .line 84
    if-eqz p2, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    move v1, v0

    .line 88
    :cond_4
    :goto_2
    iput-boolean v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    return-void

    .line 95
    :cond_5
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 96
    .line 97
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 101
    .line 102
    return-void
.end method

.method private onProcessedOutputBuffer(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->lastProcessedOutputBufferTimeUs:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 18
    .line 19
    iget-wide v0, v0, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;->previousStreamLastBufferTimeUs:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 32
    .line 33
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamInfo:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method private releaseDecoderResources()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderReinitializationState:I

    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->largestQueuedPresentationTimeUs:J

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Landroidx/media3/exoplayer/image/ImageDecoder;->release()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/image/ImageRenderer;->getImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->imageOutput:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 6
    .line 7
    return-void
.end method

.method private shouldForceRender()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    iget v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-ne v1, v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_2
    return v3

    .line 30
    :cond_3
    return v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ImageRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public handleMessage(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Landroidx/media3/exoplayer/BaseRenderer;->handleMessage(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    instance-of p1, p2, Landroidx/media3/exoplayer/image/ImageOutput;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p2, Landroidx/media3/exoplayer/image/ImageOutput;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p2, 0x0

    .line 17
    :goto_0
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/image/ImageRenderer;->setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public isEnded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamEnded:Z

    .line 2
    .line 3
    return v0
.end method

.method public isReady()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
.end method

.method public onDisabled()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 3
    .line 4
    sget-object v0, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;->UNSET:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamInfo:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/media3/exoplayer/image/ImageRenderer;->releaseDecoderResources()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->imageOutput:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/media3/exoplayer/image/ImageOutput;->onDisabled()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onEnabled(ZZ)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->firstFrameState:I

    .line 2
    .line 3
    return-void
.end method

.method public onPositionReset(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/image/ImageRenderer;->lowerFirstFrameState(I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamEnded:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputStreamEnded:Z

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputBitmap:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    iput-object p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->tileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 14
    .line 15
    iput-object p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->nextTileInfo:Landroidx/media3/exoplayer/image/ImageRenderer$TileInfo;

    .line 16
    .line 17
    iput-boolean p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->readyToOutputTiles:Z

    .line 18
    .line 19
    iput-object p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputBuffer:Lm1/g;

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoder:Landroidx/media3/exoplayer/image/ImageDecoder;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Landroidx/media3/exoplayer/image/ImageDecoder;->flush()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onRelease()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/image/ImageRenderer;->releaseDecoderResources()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onReset()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/image/ImageRenderer;->releaseDecoderResources()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/image/ImageRenderer;->lowerFirstFrameState(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onStreamChanged([Landroidx/media3/common/w;JJLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V
    .locals 4

    .line 1
    invoke-super/range {p0 .. p6}, Landroidx/media3/exoplayer/BaseRenderer;->onStreamChanged([Landroidx/media3/common/w;JJLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object p2, p1, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamInfo:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 6
    .line 7
    iget-wide p2, p2, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;->streamOffsetUs:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p2, p2, v0

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p2, p1, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    iget-wide p2, p1, Landroidx/media3/exoplayer/image/ImageRenderer;->largestQueuedPresentationTimeUs:J

    .line 27
    .line 28
    cmp-long p6, p2, v0

    .line 29
    .line 30
    if-eqz p6, :cond_1

    .line 31
    .line 32
    iget-wide v2, p1, Landroidx/media3/exoplayer/image/ImageRenderer;->lastProcessedOutputBufferTimeUs:J

    .line 33
    .line 34
    cmp-long p6, v2, v0

    .line 35
    .line 36
    if-eqz p6, :cond_0

    .line 37
    .line 38
    cmp-long p2, v2, p2

    .line 39
    .line 40
    if-ltz p2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p2, p1, Landroidx/media3/exoplayer/image/ImageRenderer;->pendingOutputStreamChanges:Ljava/util/ArrayDeque;

    .line 44
    .line 45
    new-instance p3, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 46
    .line 47
    iget-wide v0, p1, Landroidx/media3/exoplayer/image/ImageRenderer;->largestQueuedPresentationTimeUs:J

    .line 48
    .line 49
    invoke-direct {p3, v0, v1, p4, p5}, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;-><init>(JJ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    :goto_0
    new-instance p2, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 57
    .line 58
    invoke-direct {p2, v0, v1, p4, p5}, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;-><init>(JJ)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p1, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamInfo:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 62
    .line 63
    return-void
.end method

.method public processOutputBuffer(JJLandroid/graphics/Bitmap;J)Z
    .locals 0

    .line 1
    sub-long p1, p6, p1

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/image/ImageRenderer;->shouldForceRender()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-nez p3, :cond_1

    .line 8
    .line 9
    const-wide/16 p3, 0x7530

    .line 10
    .line 11
    cmp-long p1, p1, p3

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->imageOutput:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 19
    .line 20
    iget-object p2, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamInfo:Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;

    .line 21
    .line 22
    iget-wide p2, p2, Landroidx/media3/exoplayer/image/ImageRenderer$OutputStreamInfo;->streamOffsetUs:J

    .line 23
    .line 24
    sub-long/2addr p6, p2

    .line 25
    invoke-interface {p1, p6, p7, p5}, Landroidx/media3/exoplayer/image/ImageOutput;->onImageAvailable(JLandroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public render(JJ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamEnded:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getFormatHolder()Landroidx/media3/exoplayer/FormatHolder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->flagsOnlyBuffer:Lm1/g;

    .line 15
    .line 16
    invoke-virtual {v1}, Lm1/g;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->flagsOnlyBuffer:Lm1/g;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/BaseRenderer;->readSource(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x5

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Landroidx/media3/exoplayer/FormatHolder;->format:Landroidx/media3/common/w;

    .line 30
    .line 31
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 35
    .line 36
    invoke-direct {p0}, Landroidx/media3/exoplayer/image/ImageRenderer;->initDecoder()V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 p1, -0x4

    .line 41
    if-ne v1, p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->flagsOnlyBuffer:Lm1/g;

    .line 44
    .line 45
    invoke-virtual {p1}, Lm1/a;->isEndOfStream()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->inputStreamEnded:Z

    .line 54
    .line 55
    iput-boolean p1, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->outputStreamEnded:Z

    .line 56
    .line 57
    :cond_2
    :goto_0
    return-void

    .line 58
    :cond_3
    :goto_1
    :try_start_0
    const-string v0, "drainAndFeedDecoder"

    .line 59
    .line 60
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/image/ImageRenderer;->drainOutput(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_3
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/image/ImageRenderer;->feedInputBuffer(J)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_0
    .catch Landroidx/media3/exoplayer/image/ImageDecoderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catch_0
    move-exception p1

    .line 82
    const/4 p2, 0x0

    .line 83
    const/16 p3, 0xfa3

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    throw p1
.end method

.method public supportsFormat(Landroidx/media3/common/w;)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/image/ImageRenderer;->decoderFactory:Landroidx/media3/exoplayer/image/ImageDecoder$Factory;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/image/ImageDecoder$Factory;->supportsFormat(Landroidx/media3/common/w;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
