.class public Landroidx/media3/common/audio/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/audio/d;


# static fields
.field private static final CLOSE_THRESHOLD:F = 1.0E-4f

.field private static final MIN_BYTES_FOR_DURATION_SCALING_CALCULATION:I = 0x400

.field public static final SAMPLE_RATE_NO_CHANGE:I = -0x1


# instance fields
.field private buffer:Ljava/nio/ByteBuffer;

.field private inputAudioFormat:Landroidx/media3/common/audio/b;

.field private inputBytes:J

.field private inputEnded:Z

.field private outputAudioFormat:Landroidx/media3/common/audio/b;

.field private outputBuffer:Ljava/nio/ByteBuffer;

.field private outputBytes:J

.field private pendingInputAudioFormat:Landroidx/media3/common/audio/b;

.field private pendingOutputAudioFormat:Landroidx/media3/common/audio/b;

.field private pendingOutputSampleRate:I

.field private pendingSonicRecreation:Z

.field private pitch:F

.field private shortBuffer:Ljava/nio/ShortBuffer;

.field private sonic:Landroidx/media3/common/audio/h;

.field private speed:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 7
    .line 8
    iput v0, p0, Landroidx/media3/common/audio/i;->pitch:F

    .line 9
    .line 10
    sget-object v0, Landroidx/media3/common/audio/b;->e:Landroidx/media3/common/audio/b;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/media3/common/audio/i;->pendingInputAudioFormat:Landroidx/media3/common/audio/b;

    .line 13
    .line 14
    iput-object v0, p0, Landroidx/media3/common/audio/i;->pendingOutputAudioFormat:Landroidx/media3/common/audio/b;

    .line 15
    .line 16
    iput-object v0, p0, Landroidx/media3/common/audio/i;->inputAudioFormat:Landroidx/media3/common/audio/b;

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/media3/common/audio/i;->outputAudioFormat:Landroidx/media3/common/audio/b;

    .line 19
    .line 20
    sget-object v0, Landroidx/media3/common/audio/d;->a:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/media3/common/audio/i;->buffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Landroidx/media3/common/audio/i;->shortBuffer:Ljava/nio/ShortBuffer;

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/media3/common/audio/i;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    const/4 v0, -0x1

    .line 33
    iput v0, p0, Landroidx/media3/common/audio/i;->pendingOutputSampleRate:I

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final configure(Landroidx/media3/common/audio/b;)Landroidx/media3/common/audio/b;
    .locals 3

    .line 1
    iget v0, p1, Landroidx/media3/common/audio/b;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget v0, p0, Landroidx/media3/common/audio/i;->pendingOutputSampleRate:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    iget v0, p1, Landroidx/media3/common/audio/b;->a:I

    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Landroidx/media3/common/audio/i;->pendingInputAudioFormat:Landroidx/media3/common/audio/b;

    .line 14
    .line 15
    new-instance v2, Landroidx/media3/common/audio/b;

    .line 16
    .line 17
    iget p1, p1, Landroidx/media3/common/audio/b;->b:I

    .line 18
    .line 19
    invoke-direct {v2, v0, p1, v1}, Landroidx/media3/common/audio/b;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Landroidx/media3/common/audio/i;->pendingOutputAudioFormat:Landroidx/media3/common/audio/b;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Landroidx/media3/common/audio/i;->pendingSonicRecreation:Z

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_1
    new-instance v0, Landroidx/media3/common/audio/c;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Landroidx/media3/common/audio/c;-><init>(Landroidx/media3/common/audio/b;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final flush()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/audio/i;->isActive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/common/audio/i;->pendingInputAudioFormat:Landroidx/media3/common/audio/b;

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/common/audio/i;->inputAudioFormat:Landroidx/media3/common/audio/b;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/media3/common/audio/i;->pendingOutputAudioFormat:Landroidx/media3/common/audio/b;

    .line 13
    .line 14
    iput-object v2, p0, Landroidx/media3/common/audio/i;->outputAudioFormat:Landroidx/media3/common/audio/b;

    .line 15
    .line 16
    iget-boolean v3, p0, Landroidx/media3/common/audio/i;->pendingSonicRecreation:Z

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    new-instance v4, Landroidx/media3/common/audio/h;

    .line 21
    .line 22
    iget v5, v0, Landroidx/media3/common/audio/b;->a:I

    .line 23
    .line 24
    iget v6, v0, Landroidx/media3/common/audio/b;->b:I

    .line 25
    .line 26
    iget v7, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 27
    .line 28
    iget v8, p0, Landroidx/media3/common/audio/i;->pitch:F

    .line 29
    .line 30
    iget v9, v2, Landroidx/media3/common/audio/b;->a:I

    .line 31
    .line 32
    invoke-direct/range {v4 .. v9}, Landroidx/media3/common/audio/h;-><init>(IIFFI)V

    .line 33
    .line 34
    .line 35
    iput-object v4, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iput v1, v0, Landroidx/media3/common/audio/h;->k:I

    .line 43
    .line 44
    iput v1, v0, Landroidx/media3/common/audio/h;->m:I

    .line 45
    .line 46
    iput v1, v0, Landroidx/media3/common/audio/h;->o:I

    .line 47
    .line 48
    iput v1, v0, Landroidx/media3/common/audio/h;->p:I

    .line 49
    .line 50
    iput v1, v0, Landroidx/media3/common/audio/h;->q:I

    .line 51
    .line 52
    iput v1, v0, Landroidx/media3/common/audio/h;->r:I

    .line 53
    .line 54
    iput v1, v0, Landroidx/media3/common/audio/h;->s:I

    .line 55
    .line 56
    iput v1, v0, Landroidx/media3/common/audio/h;->t:I

    .line 57
    .line 58
    iput v1, v0, Landroidx/media3/common/audio/h;->u:I

    .line 59
    .line 60
    iput v1, v0, Landroidx/media3/common/audio/h;->v:I

    .line 61
    .line 62
    const-wide/16 v2, 0x0

    .line 63
    .line 64
    iput-wide v2, v0, Landroidx/media3/common/audio/h;->w:D

    .line 65
    .line 66
    :cond_1
    :goto_0
    sget-object v0, Landroidx/media3/common/audio/d;->a:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    iput-object v0, p0, Landroidx/media3/common/audio/i;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    const-wide/16 v2, 0x0

    .line 71
    .line 72
    iput-wide v2, p0, Landroidx/media3/common/audio/i;->inputBytes:J

    .line 73
    .line 74
    iput-wide v2, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 75
    .line 76
    iput-boolean v1, p0, Landroidx/media3/common/audio/i;->inputEnded:Z

    .line 77
    .line 78
    return-void
.end method

.method public getDurationAfterProcessorApplied(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/common/audio/i;->getPlayoutDuration(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public final getMediaDuration(J)J
    .locals 11

    .line 1
    iget-wide v0, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 2
    .line 3
    const-wide/16 v2, 0x400

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/media3/common/audio/i;->inputBytes:J

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v3, v2, Landroidx/media3/common/audio/h;->k:I

    .line 17
    .line 18
    iget v2, v2, Landroidx/media3/common/audio/h;->b:I

    .line 19
    .line 20
    mul-int/2addr v3, v2

    .line 21
    mul-int/lit8 v3, v3, 0x2

    .line 22
    .line 23
    int-to-long v2, v3

    .line 24
    sub-long v6, v0, v2

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/media3/common/audio/i;->outputAudioFormat:Landroidx/media3/common/audio/b;

    .line 27
    .line 28
    iget v0, v0, Landroidx/media3/common/audio/b;->a:I

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/common/audio/i;->inputAudioFormat:Landroidx/media3/common/audio/b;

    .line 31
    .line 32
    iget v1, v1, Landroidx/media3/common/audio/b;->a:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    iget-wide v8, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 37
    .line 38
    sget-object v10, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 39
    .line 40
    move-wide v4, p1

    .line 41
    invoke-static/range {v4 .. v10}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    return-wide p1

    .line 46
    :cond_0
    move-wide v4, p1

    .line 47
    int-to-long p1, v0

    .line 48
    mul-long v2, v6, p1

    .line 49
    .line 50
    iget-wide p1, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 51
    .line 52
    int-to-long v0, v1

    .line 53
    mul-long/2addr p1, v0

    .line 54
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 55
    .line 56
    move-wide v0, v4

    .line 57
    move-wide v4, p1

    .line 58
    invoke-static/range {v0 .. v6}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    return-wide p1

    .line 63
    :cond_1
    move-wide v4, p1

    .line 64
    iget p1, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 65
    .line 66
    float-to-double p1, p1

    .line 67
    long-to-double v0, v4

    .line 68
    mul-double/2addr p1, v0

    .line 69
    double-to-long p1, p1

    .line 70
    return-wide p1
.end method

.method public final getOutput()Ljava/nio/ByteBuffer;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, v0, Landroidx/media3/common/audio/h;->b:I

    .line 6
    .line 7
    iget v2, v0, Landroidx/media3/common/audio/h;->m:I

    .line 8
    .line 9
    mul-int/2addr v2, v1

    .line 10
    mul-int/lit8 v2, v2, 0x2

    .line 11
    .line 12
    if-lez v2, :cond_1

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/media3/common/audio/i;->buffer:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v3, v2, :cond_0

    .line 21
    .line 22
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iput-object v3, p0, Landroidx/media3/common/audio/i;->buffer:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iput-object v3, p0, Landroidx/media3/common/audio/i;->shortBuffer:Ljava/nio/ShortBuffer;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v3, p0, Landroidx/media3/common/audio/i;->buffer:Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 46
    .line 47
    .line 48
    iget-object v3, p0, Landroidx/media3/common/audio/i;->shortBuffer:Ljava/nio/ShortBuffer;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v3, p0, Landroidx/media3/common/audio/i;->shortBuffer:Ljava/nio/ShortBuffer;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    div-int/2addr v4, v1

    .line 60
    iget v5, v0, Landroidx/media3/common/audio/h;->m:I

    .line 61
    .line 62
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v5, v0, Landroidx/media3/common/audio/h;->l:[S

    .line 67
    .line 68
    mul-int v6, v4, v1

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    invoke-virtual {v3, v5, v7, v6}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    .line 72
    .line 73
    .line 74
    iget v3, v0, Landroidx/media3/common/audio/h;->m:I

    .line 75
    .line 76
    sub-int/2addr v3, v4

    .line 77
    iput v3, v0, Landroidx/media3/common/audio/h;->m:I

    .line 78
    .line 79
    iget-object v0, v0, Landroidx/media3/common/audio/h;->l:[S

    .line 80
    .line 81
    mul-int/2addr v3, v1

    .line 82
    invoke-static {v0, v6, v0, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    .line 84
    .line 85
    iget-wide v0, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 86
    .line 87
    int-to-long v3, v2

    .line 88
    add-long/2addr v0, v3

    .line 89
    iput-wide v0, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 90
    .line 91
    iget-object v0, p0, Landroidx/media3/common/audio/i;->buffer:Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Landroidx/media3/common/audio/i;->buffer:Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    iput-object v0, p0, Landroidx/media3/common/audio/i;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    :cond_1
    iget-object v0, p0, Landroidx/media3/common/audio/i;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    sget-object v1, Landroidx/media3/common/audio/d;->a:Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    iput-object v1, p0, Landroidx/media3/common/audio/i;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    return-object v0
.end method

.method public final getPlayoutDuration(J)J
    .locals 11

    .line 1
    iget-wide v0, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 2
    .line 3
    const-wide/16 v2, 0x400

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/media3/common/audio/i;->inputBytes:J

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v3, v2, Landroidx/media3/common/audio/h;->k:I

    .line 17
    .line 18
    iget v2, v2, Landroidx/media3/common/audio/h;->b:I

    .line 19
    .line 20
    mul-int/2addr v3, v2

    .line 21
    mul-int/lit8 v3, v3, 0x2

    .line 22
    .line 23
    int-to-long v2, v3

    .line 24
    sub-long v8, v0, v2

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/media3/common/audio/i;->outputAudioFormat:Landroidx/media3/common/audio/b;

    .line 27
    .line 28
    iget v0, v0, Landroidx/media3/common/audio/b;->a:I

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/common/audio/i;->inputAudioFormat:Landroidx/media3/common/audio/b;

    .line 31
    .line 32
    iget v1, v1, Landroidx/media3/common/audio/b;->a:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    iget-wide v6, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 37
    .line 38
    sget-object v10, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 39
    .line 40
    move-wide v4, p1

    .line 41
    invoke-static/range {v4 .. v10}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    return-wide p1

    .line 46
    :cond_0
    move-wide v4, p1

    .line 47
    iget-wide p1, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 48
    .line 49
    int-to-long v1, v1

    .line 50
    mul-long v2, p1, v1

    .line 51
    .line 52
    int-to-long p1, v0

    .line 53
    mul-long/2addr v8, p1

    .line 54
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 55
    .line 56
    move-wide v0, v4

    .line 57
    move-wide v4, v8

    .line 58
    invoke-static/range {v0 .. v6}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    return-wide p1

    .line 63
    :cond_1
    move-wide v4, p1

    .line 64
    long-to-double p1, v4

    .line 65
    iget v0, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 66
    .line 67
    float-to-double v0, v0

    .line 68
    div-double/2addr p1, v0

    .line 69
    double-to-long p1, p1

    .line 70
    return-wide p1
.end method

.method public final getProcessedInputBytes()J
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/common/audio/i;->inputBytes:J

    .line 2
    .line 3
    iget-object v2, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v3, v2, Landroidx/media3/common/audio/h;->k:I

    .line 9
    .line 10
    iget v2, v2, Landroidx/media3/common/audio/h;->b:I

    .line 11
    .line 12
    mul-int/2addr v3, v2

    .line 13
    mul-int/lit8 v3, v3, 0x2

    .line 14
    .line 15
    int-to-long v2, v3

    .line 16
    sub-long/2addr v0, v2

    .line 17
    return-wide v0
.end method

.method public final isActive()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/common/audio/i;->pendingOutputAudioFormat:Landroidx/media3/common/audio/b;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/common/audio/b;->a:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    iget v0, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    sub-float/2addr v0, v1

    .line 13
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const v2, 0x38d1b717    # 1.0E-4f

    .line 18
    .line 19
    .line 20
    cmpl-float v0, v0, v2

    .line 21
    .line 22
    if-gez v0, :cond_0

    .line 23
    .line 24
    iget v0, p0, Landroidx/media3/common/audio/i;->pitch:F

    .line 25
    .line 26
    sub-float/2addr v0, v1

    .line 27
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    cmpl-float v0, v0, v2

    .line 32
    .line 33
    if-gez v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/common/audio/i;->pendingOutputAudioFormat:Landroidx/media3/common/audio/b;

    .line 36
    .line 37
    iget v0, v0, Landroidx/media3/common/audio/b;->a:I

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/media3/common/audio/i;->pendingInputAudioFormat:Landroidx/media3/common/audio/b;

    .line 40
    .line 41
    iget v1, v1, Landroidx/media3/common/audio/b;->a:I

    .line 42
    .line 43
    if-eq v0, v1, :cond_1

    .line 44
    .line 45
    :cond_0
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    return v0
.end method

.method public final isEnded()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/common/audio/i;->inputEnded:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v1, v0, Landroidx/media3/common/audio/h;->m:I

    .line 10
    .line 11
    iget v0, v0, Landroidx/media3/common/audio/h;->b:I

    .line 12
    .line 13
    mul-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final queueEndOfStream()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v1, v0, Landroidx/media3/common/audio/h;->k:I

    .line 6
    .line 7
    iget v2, v0, Landroidx/media3/common/audio/h;->c:F

    .line 8
    .line 9
    iget v3, v0, Landroidx/media3/common/audio/h;->d:F

    .line 10
    .line 11
    div-float/2addr v2, v3

    .line 12
    float-to-double v4, v2

    .line 13
    iget v2, v0, Landroidx/media3/common/audio/h;->e:F

    .line 14
    .line 15
    mul-float/2addr v2, v3

    .line 16
    float-to-double v2, v2

    .line 17
    iget v6, v0, Landroidx/media3/common/audio/h;->r:I

    .line 18
    .line 19
    sub-int v7, v1, v6

    .line 20
    .line 21
    iget v8, v0, Landroidx/media3/common/audio/h;->m:I

    .line 22
    .line 23
    int-to-double v9, v7

    .line 24
    div-double/2addr v9, v4

    .line 25
    int-to-double v4, v6

    .line 26
    add-double/2addr v9, v4

    .line 27
    iget-wide v4, v0, Landroidx/media3/common/audio/h;->w:D

    .line 28
    .line 29
    add-double/2addr v9, v4

    .line 30
    iget v4, v0, Landroidx/media3/common/audio/h;->o:I

    .line 31
    .line 32
    int-to-double v4, v4

    .line 33
    add-double/2addr v9, v4

    .line 34
    div-double/2addr v9, v2

    .line 35
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 36
    .line 37
    add-double/2addr v9, v2

    .line 38
    double-to-int v2, v9

    .line 39
    add-int/2addr v8, v2

    .line 40
    const-wide/16 v2, 0x0

    .line 41
    .line 42
    iput-wide v2, v0, Landroidx/media3/common/audio/h;->w:D

    .line 43
    .line 44
    iget-object v2, v0, Landroidx/media3/common/audio/h;->j:[S

    .line 45
    .line 46
    iget v3, v0, Landroidx/media3/common/audio/h;->h:I

    .line 47
    .line 48
    mul-int/lit8 v3, v3, 0x2

    .line 49
    .line 50
    add-int v4, v3, v1

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1, v4}, Landroidx/media3/common/audio/h;->c([SII)[S

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iput-object v2, v0, Landroidx/media3/common/audio/h;->j:[S

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    move v4, v2

    .line 60
    :goto_0
    iget v5, v0, Landroidx/media3/common/audio/h;->b:I

    .line 61
    .line 62
    mul-int v6, v3, v5

    .line 63
    .line 64
    if-ge v4, v6, :cond_0

    .line 65
    .line 66
    iget-object v6, v0, Landroidx/media3/common/audio/h;->j:[S

    .line 67
    .line 68
    mul-int/2addr v5, v1

    .line 69
    add-int/2addr v5, v4

    .line 70
    aput-short v2, v6, v5

    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget v1, v0, Landroidx/media3/common/audio/h;->k:I

    .line 76
    .line 77
    add-int/2addr v3, v1

    .line 78
    iput v3, v0, Landroidx/media3/common/audio/h;->k:I

    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/media3/common/audio/h;->f()V

    .line 81
    .line 82
    .line 83
    iget v1, v0, Landroidx/media3/common/audio/h;->m:I

    .line 84
    .line 85
    if-le v1, v8, :cond_1

    .line 86
    .line 87
    iput v8, v0, Landroidx/media3/common/audio/h;->m:I

    .line 88
    .line 89
    :cond_1
    iput v2, v0, Landroidx/media3/common/audio/h;->k:I

    .line 90
    .line 91
    iput v2, v0, Landroidx/media3/common/audio/h;->r:I

    .line 92
    .line 93
    iput v2, v0, Landroidx/media3/common/audio/h;->o:I

    .line 94
    .line 95
    :cond_2
    const/4 v0, 0x1

    .line 96
    iput-boolean v0, p0, Landroidx/media3/common/audio/i;->inputEnded:Z

    .line 97
    .line 98
    return-void
.end method

.method public final queueInput(Ljava/nio/ByteBuffer;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-wide v3, p0, Landroidx/media3/common/audio/i;->inputBytes:J

    .line 22
    .line 23
    int-to-long v5, v2

    .line 24
    add-long/2addr v3, v5

    .line 25
    iput-wide v3, p0, Landroidx/media3/common/audio/i;->inputBytes:J

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget v4, v0, Landroidx/media3/common/audio/h;->b:I

    .line 32
    .line 33
    div-int/2addr v3, v4

    .line 34
    mul-int v5, v3, v4

    .line 35
    .line 36
    mul-int/lit8 v5, v5, 0x2

    .line 37
    .line 38
    iget-object v6, v0, Landroidx/media3/common/audio/h;->j:[S

    .line 39
    .line 40
    iget v7, v0, Landroidx/media3/common/audio/h;->k:I

    .line 41
    .line 42
    invoke-virtual {v0, v6, v7, v3}, Landroidx/media3/common/audio/h;->c([SII)[S

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    iput-object v6, v0, Landroidx/media3/common/audio/h;->j:[S

    .line 47
    .line 48
    iget v7, v0, Landroidx/media3/common/audio/h;->k:I

    .line 49
    .line 50
    mul-int/2addr v7, v4

    .line 51
    div-int/lit8 v5, v5, 0x2

    .line 52
    .line 53
    invoke-virtual {v1, v6, v7, v5}, Ljava/nio/ShortBuffer;->get([SII)Ljava/nio/ShortBuffer;

    .line 54
    .line 55
    .line 56
    iget v1, v0, Landroidx/media3/common/audio/h;->k:I

    .line 57
    .line 58
    add-int/2addr v1, v3

    .line 59
    iput v1, v0, Landroidx/media3/common/audio/h;->k:I

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/media3/common/audio/h;->f()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, v2

    .line 69
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final reset()V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iput v0, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/common/audio/i;->pitch:F

    .line 6
    .line 7
    sget-object v0, Landroidx/media3/common/audio/b;->e:Landroidx/media3/common/audio/b;

    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/common/audio/i;->pendingInputAudioFormat:Landroidx/media3/common/audio/b;

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/media3/common/audio/i;->pendingOutputAudioFormat:Landroidx/media3/common/audio/b;

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/media3/common/audio/i;->inputAudioFormat:Landroidx/media3/common/audio/b;

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/media3/common/audio/i;->outputAudioFormat:Landroidx/media3/common/audio/b;

    .line 16
    .line 17
    sget-object v0, Landroidx/media3/common/audio/d;->a:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    iput-object v0, p0, Landroidx/media3/common/audio/i;->buffer:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Landroidx/media3/common/audio/i;->shortBuffer:Ljava/nio/ShortBuffer;

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/media3/common/audio/i;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    iput v0, p0, Landroidx/media3/common/audio/i;->pendingOutputSampleRate:I

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Landroidx/media3/common/audio/i;->pendingSonicRecreation:Z

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Landroidx/media3/common/audio/i;->sonic:Landroidx/media3/common/audio/h;

    .line 37
    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    iput-wide v1, p0, Landroidx/media3/common/audio/i;->inputBytes:J

    .line 41
    .line 42
    iput-wide v1, p0, Landroidx/media3/common/audio/i;->outputBytes:J

    .line 43
    .line 44
    iput-boolean v0, p0, Landroidx/media3/common/audio/i;->inputEnded:Z

    .line 45
    .line 46
    return-void
.end method

.method public final setOutputSampleRateHz(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/audio/i;->pendingOutputSampleRate:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPitch(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/common/audio/i;->pitch:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Landroidx/media3/common/audio/i;->pitch:F

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroidx/media3/common/audio/i;->pendingSonicRecreation:Z

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setSpeed(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Landroidx/media3/common/audio/i;->speed:F

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroidx/media3/common/audio/i;->pendingSonicRecreation:Z

    .line 11
    .line 12
    :cond_0
    return-void
.end method
