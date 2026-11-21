.class final Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;
.super Landroidx/media3/common/audio/f;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field private outputChannels:[I

.field private pendingOutputChannels:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/common/audio/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getDurationAfterProcessorApplied(J)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public onConfigure(Landroidx/media3/common/audio/b;)Landroidx/media3/common/audio/b;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->pendingOutputChannels:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/media3/common/audio/b;->e:Landroidx/media3/common/audio/b;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget v1, p1, Landroidx/media3/common/audio/b;->c:I

    .line 9
    .line 10
    iget v2, p1, Landroidx/media3/common/audio/b;->b:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    if-ne v1, v3, :cond_6

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eq v2, v1, :cond_1

    .line 19
    .line 20
    move v1, v5

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v1, v4

    .line 23
    :goto_0
    move v6, v4

    .line 24
    :goto_1
    array-length v7, v0

    .line 25
    if-ge v6, v7, :cond_4

    .line 26
    .line 27
    aget v7, v0, v6

    .line 28
    .line 29
    if-ge v7, v2, :cond_3

    .line 30
    .line 31
    if-eq v7, v6, :cond_2

    .line 32
    .line 33
    move v7, v5

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move v7, v4

    .line 36
    :goto_2
    or-int/2addr v1, v7

    .line 37
    add-int/lit8 v6, v6, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    new-instance v0, Landroidx/media3/common/audio/c;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Landroidx/media3/common/audio/c;-><init>(Landroidx/media3/common/audio/b;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_4
    if-eqz v1, :cond_5

    .line 47
    .line 48
    new-instance v1, Landroidx/media3/common/audio/b;

    .line 49
    .line 50
    iget p1, p1, Landroidx/media3/common/audio/b;->a:I

    .line 51
    .line 52
    array-length v0, v0

    .line 53
    invoke-direct {v1, p1, v0, v3}, Landroidx/media3/common/audio/b;-><init>(III)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_5
    sget-object p1, Landroidx/media3/common/audio/b;->e:Landroidx/media3/common/audio/b;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_6
    new-instance v0, Landroidx/media3/common/audio/c;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Landroidx/media3/common/audio/c;-><init>(Landroidx/media3/common/audio/b;)V

    .line 63
    .line 64
    .line 65
    throw v0
.end method

.method public onFlush()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->pendingOutputChannels:[I

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->outputChannels:[I

    .line 4
    .line 5
    return-void
.end method

.method public onReset()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->outputChannels:[I

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->pendingOutputChannels:[I

    .line 5
    .line 6
    return-void
.end method

.method public queueInput(Ljava/nio/ByteBuffer;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->outputChannels:[I

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    sub-int v3, v2, v1

    .line 15
    .line 16
    iget-object v4, p0, Landroidx/media3/common/audio/f;->inputAudioFormat:Landroidx/media3/common/audio/b;

    .line 17
    .line 18
    iget v4, v4, Landroidx/media3/common/audio/b;->d:I

    .line 19
    .line 20
    div-int/2addr v3, v4

    .line 21
    iget-object v4, p0, Landroidx/media3/common/audio/f;->outputAudioFormat:Landroidx/media3/common/audio/b;

    .line 22
    .line 23
    iget v4, v4, Landroidx/media3/common/audio/b;->d:I

    .line 24
    .line 25
    mul-int/2addr v3, v4

    .line 26
    invoke-virtual {p0, v3}, Landroidx/media3/common/audio/f;->replaceOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    if-ge v1, v2, :cond_1

    .line 31
    .line 32
    array-length v4, v0

    .line 33
    const/4 v5, 0x0

    .line 34
    :goto_1
    if-ge v5, v4, :cond_0

    .line 35
    .line 36
    aget v6, v0, v5

    .line 37
    .line 38
    mul-int/lit8 v6, v6, 0x2

    .line 39
    .line 40
    add-int/2addr v6, v1

    .line 41
    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    iget-object v4, p0, Landroidx/media3/common/audio/f;->inputAudioFormat:Landroidx/media3/common/audio/b;

    .line 52
    .line 53
    iget v4, v4, Landroidx/media3/common/audio/b;->d:I

    .line 54
    .line 55
    add-int/2addr v1, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public setChannelMap([I)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->pendingOutputChannels:[I

    .line 2
    .line 3
    return-void
.end method
