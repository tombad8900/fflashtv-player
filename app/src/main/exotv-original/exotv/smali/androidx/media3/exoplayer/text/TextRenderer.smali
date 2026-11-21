.class public final Landroidx/media3/exoplayer/text/TextRenderer;
.super Landroidx/media3/exoplayer/BaseRenderer;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field private static final MSG_UPDATE_OUTPUT:I = 0x1

.field private static final REPLACEMENT_STATE_NONE:I = 0x0

.field private static final REPLACEMENT_STATE_SIGNAL_END_OF_STREAM:I = 0x1

.field private static final REPLACEMENT_STATE_WAIT_END_OF_STREAM:I = 0x2

.field private static final TAG:Ljava/lang/String; = "TextRenderer"


# instance fields
.field private final cueDecoder:Lk2/a;

.field private final cueDecoderInputBuffer:Lm1/g;

.field private cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

.field private decoderReplacementState:I

.field private finalStreamEndPositionUs:J

.field private final formatHolder:Landroidx/media3/exoplayer/FormatHolder;

.field private inputStreamEnded:Z

.field private lastRendererPositionUs:J

.field private legacyDecodingEnabled:Z

.field private nextSubtitle:Lk2/n;

.field private nextSubtitleEventIndex:I

.field private nextSubtitleInputBuffer:Lk2/m;

.field private final output:Landroidx/media3/exoplayer/text/TextOutput;

.field private final outputHandler:Landroid/os/Handler;

.field private outputStreamEnded:Z

.field private streamError:Ljava/io/IOException;

.field private streamFormat:Landroidx/media3/common/w;

.field private subtitle:Lk2/n;

.field private subtitleDecoder:Lk2/i;

.field private final subtitleDecoderFactory:Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;

.field private waitingForKeyFrame:Z


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/text/TextOutput;Landroid/os/Looper;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;->DEFAULT:Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;

    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/text/TextRenderer;-><init>(Landroidx/media3/exoplayer/text/TextOutput;Landroid/os/Looper;Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/text/TextOutput;Landroid/os/Looper;Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;)V
    .locals 1

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/BaseRenderer;-><init>(I)V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->output:Landroidx/media3/exoplayer/text/TextOutput;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 5
    :cond_0
    sget p1, Lh1/i0;->a:I

    .line 6
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 7
    :goto_0
    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputHandler:Landroid/os/Handler;

    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoderFactory:Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;

    .line 9
    new-instance p1, Lk2/a;

    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoder:Lk2/a;

    .line 12
    new-instance p1, Lm1/g;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lm1/g;-><init>(I)V

    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoderInputBuffer:Lm1/g;

    .line 13
    new-instance p1, Landroidx/media3/exoplayer/FormatHolder;

    invoke-direct {p1}, Landroidx/media3/exoplayer/FormatHolder;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    iput-wide p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->finalStreamEndPositionUs:J

    .line 15
    iput-wide p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->legacyDecodingEnabled:Z

    return-void
.end method

.method private assertLegacyDecodingEnabledIfRequired()V
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "streamFormat"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->legacyDecodingEnabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "application/cea-608"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "application/x-mp4-cea-608"

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "application/cea-708"

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 45
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "Legacy decoding is disabled, can\'t handle "

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 53
    .line 54
    iget-object v2, v2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, " samples (expected application/x-media3-cues)."

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1, v0}, Lh1/a;->i(Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method private clearOutput()V
    .locals 4

    .line 1
    new-instance v0, Lg1/c;

    .line 2
    .line 3
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 6
    .line 7
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/text/TextRenderer;->getPresentationTimeUs(J)J

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lg1/c;-><init>(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/text/TextRenderer;->updateOutput(Lg1/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private getCurrentEventTimeUs(J)J
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "subtitle"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk2/n;->c(J)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 10
    .line 11
    invoke-virtual {p2}, Lk2/n;->n()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, -0x1

    .line 19
    if-ne p1, p2, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 22
    .line 23
    invoke-virtual {p1}, Lk2/n;->n()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lk2/n;->f(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :cond_1
    iget-object p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lk2/n;->f(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    return-wide p1

    .line 43
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 44
    .line 45
    iget-wide p1, p1, Lm1/h;->timeUs:J

    .line 46
    .line 47
    return-wide p1
.end method

.method private getNextEventTime()J
    .locals 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleEventIndex:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleEventIndex:I

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 20
    .line 21
    invoke-virtual {v1}, Lk2/n;->n()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 29
    .line 30
    iget v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleEventIndex:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lk2/n;->f(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
.end method

.method private getPresentationTimeUs(J)J
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getStreamOffsetUs()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sub-long/2addr p1, v0

    .line 21
    return-wide p1
.end method

.method private handleDecoderError(Lk2/j;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Subtitle decoding failed. streamFormat="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "TextRenderer"

    .line 18
    .line 19
    invoke-static {v1, v0, p1}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->clearOutput()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->replaceSubtitleDecoder()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static hasNoEventsAfter(Lk2/h;J)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-interface {p0}, Lk2/h;->n()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    sub-int/2addr v1, v0

    .line 9
    invoke-interface {p0, v1}, Lk2/h;->f(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    cmp-long p0, v1, p1

    .line 14
    .line 15
    if-gtz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    return v0
.end method

.method private initSubtitleDecoder()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->waitingForKeyFrame:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoderFactory:Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;->createDecoder(Landroidx/media3/common/w;)Lk2/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getLastResetPositionUs()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-interface {v0, v1, v2}, Lm1/d;->setOutputStartTimeUs(J)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private invokeUpdateOutputInternal(Lg1/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->output:Landroidx/media3/exoplayer/text/TextOutput;

    .line 2
    .line 3
    iget-object v1, p1, Lg1/c;->a:Lf6/m0;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/text/TextOutput;->onCues(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->output:Landroidx/media3/exoplayer/text/TextOutput;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/text/TextOutput;->onCues(Lg1/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static isCuesWithTiming(Landroidx/media3/common/w;)Z
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "application/x-media3-cues"

    .line 4
    .line 5
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private readAndDecodeCuesWithTiming(J)Z
    .locals 10
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "this.cuesResolver"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->inputStreamEnded:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoderInputBuffer:Lm1/g;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/BaseRenderer;->readSource(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, -0x4

    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    :goto_0
    return v1

    .line 19
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoderInputBuffer:Lm1/g;

    .line 20
    .line 21
    invoke-virtual {v0}, Lm1/a;->isEndOfStream()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->inputStreamEnded:Z

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoderInputBuffer:Lm1/g;

    .line 32
    .line 33
    invoke-virtual {v0}, Lm1/g;->flip()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoderInputBuffer:Lm1/g;

    .line 37
    .line 38
    iget-object v0, v0, Lm1/g;->data:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoder:Lk2/a;

    .line 44
    .line 45
    iget-object v3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoderInputBuffer:Lm1/g;

    .line 46
    .line 47
    iget-wide v6, v3, Lm1/g;->timeUs:J

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2, v3, v4, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 72
    .line 73
    .line 74
    const-class v0, Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 85
    .line 86
    .line 87
    const-string v1, "c"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v4, Lk2/c;

    .line 97
    .line 98
    new-instance v2, Lg2/d;

    .line 99
    .line 100
    const/16 v3, 0xc

    .line 101
    .line 102
    invoke-direct {v2, v3}, Lg2/d;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v1}, Lh1/a;->q(Le6/d;Ljava/util/List;)Lf6/l1;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    const-string v1, "d"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v8

    .line 115
    invoke-direct/range {v4 .. v9}, Lk2/c;-><init>(Ljava/util/List;JJ)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cueDecoderInputBuffer:Lm1/g;

    .line 119
    .line 120
    invoke-virtual {v0}, Lm1/g;->clear()V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 124
    .line 125
    invoke-interface {v0, v4, p1, p2}, Landroidx/media3/exoplayer/text/CuesResolver;->addCues(Lk2/c;J)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    return p1
.end method

.method private releaseSubtitleBuffers()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleInputBuffer:Lk2/m;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleEventIndex:I

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lm1/h;->release()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitle:Lk2/n;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lm1/h;->release()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitle:Lk2/n;

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method private releaseSubtitleDecoder()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->releaseSubtitleBuffers()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lm1/d;->release()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->decoderReplacementState:I

    .line 17
    .line 18
    return-void
.end method

.method private renderFromCuesWithTiming(J)V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "this.cuesResolver"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/text/TextRenderer;->readAndDecodeCuesWithTiming(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 6
    .line 7
    iget-wide v2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/text/CuesResolver;->getNextCueChangeTimeUs(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/high16 v3, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long v3, v1, v3

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    iget-boolean v5, p0, Landroidx/media3/exoplayer/text/TextRenderer;->inputStreamEnded:Z

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iput-boolean v4, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputStreamEnded:Z

    .line 27
    .line 28
    :cond_0
    if-eqz v3, :cond_1

    .line 29
    .line 30
    cmp-long v1, v1, p1

    .line 31
    .line 32
    if-gtz v1, :cond_1

    .line 33
    .line 34
    move v0, v4

    .line 35
    :cond_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 38
    .line 39
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/text/CuesResolver;->getCuesAtTimeUs(J)Lf6/m0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 44
    .line 45
    invoke-interface {v1, p1, p2}, Landroidx/media3/exoplayer/text/CuesResolver;->getPreviousCueChangeTimeUs(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    new-instance v3, Lg1/c;

    .line 50
    .line 51
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/text/TextRenderer;->getPresentationTimeUs(J)J

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v0}, Lg1/c;-><init>(Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/text/TextRenderer;->updateOutput(Lg1/c;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 61
    .line 62
    invoke-interface {v0, v1, v2}, Landroidx/media3/exoplayer/text/CuesResolver;->discardCuesBeforeTimeUs(J)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iput-wide p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 66
    .line 67
    return-void
.end method

.method private renderFromSubtitles(J)V
    .locals 10

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitle:Lk2/n;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Lk2/i;->setPositionUs(J)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lm1/d;->dequeueOutputBuffer()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lk2/n;

    .line 25
    .line 26
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitle:Lk2/n;
    :try_end_0
    .catch Lk2/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/text/TextRenderer;->handleDecoderError(Lk2/j;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getState()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x2

    .line 39
    if-eq v0, v1, :cond_1

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x1

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->getNextEventTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    move v0, v2

    .line 54
    :goto_1
    cmp-long v4, v4, p1

    .line 55
    .line 56
    if-gtz v4, :cond_3

    .line 57
    .line 58
    iget v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleEventIndex:I

    .line 59
    .line 60
    add-int/2addr v0, v3

    .line 61
    iput v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleEventIndex:I

    .line 62
    .line 63
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->getNextEventTime()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    move v0, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move v0, v2

    .line 70
    :cond_3
    iget-object v4, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitle:Lk2/n;

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    if-eqz v4, :cond_7

    .line 74
    .line 75
    invoke-virtual {v4}, Lm1/a;->isEndOfStream()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->getNextEventTime()J

    .line 84
    .line 85
    .line 86
    move-result-wide v6

    .line 87
    const-wide v8, 0x7fffffffffffffffL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    cmp-long v4, v6, v8

    .line 93
    .line 94
    if-nez v4, :cond_7

    .line 95
    .line 96
    iget v4, p0, Landroidx/media3/exoplayer/text/TextRenderer;->decoderReplacementState:I

    .line 97
    .line 98
    if-ne v4, v1, :cond_4

    .line 99
    .line 100
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->replaceSubtitleDecoder()V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->releaseSubtitleBuffers()V

    .line 105
    .line 106
    .line 107
    iput-boolean v3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputStreamEnded:Z

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    iget-wide v6, v4, Lm1/h;->timeUs:J

    .line 111
    .line 112
    cmp-long v6, v6, p1

    .line 113
    .line 114
    if-gtz v6, :cond_7

    .line 115
    .line 116
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    invoke-virtual {v0}, Lm1/h;->release()V

    .line 121
    .line 122
    .line 123
    :cond_6
    invoke-virtual {v4, p1, p2}, Lk2/n;->c(J)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iput v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleEventIndex:I

    .line 128
    .line 129
    iput-object v4, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 130
    .line 131
    iput-object v5, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitle:Lk2/n;

    .line 132
    .line 133
    move v0, v3

    .line 134
    :cond_7
    :goto_2
    if-eqz v0, :cond_8

    .line 135
    .line 136
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/text/TextRenderer;->getCurrentEventTimeUs(J)J

    .line 142
    .line 143
    .line 144
    move-result-wide v6

    .line 145
    invoke-direct {p0, v6, v7}, Landroidx/media3/exoplayer/text/TextRenderer;->getPresentationTimeUs(J)J

    .line 146
    .line 147
    .line 148
    new-instance v0, Lg1/c;

    .line 149
    .line 150
    iget-object v4, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 151
    .line 152
    invoke-virtual {v4, p1, p2}, Lk2/n;->m(J)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {v0, p1}, Lg1/c;-><init>(Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/text/TextRenderer;->updateOutput(Lg1/c;)V

    .line 160
    .line 161
    .line 162
    :cond_8
    iget p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->decoderReplacementState:I

    .line 163
    .line 164
    if-ne p1, v1, :cond_9

    .line 165
    .line 166
    goto/16 :goto_6

    .line 167
    .line 168
    :cond_9
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->inputStreamEnded:Z

    .line 169
    .line 170
    if-nez p1, :cond_10

    .line 171
    .line 172
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleInputBuffer:Lk2/m;

    .line 173
    .line 174
    if-nez p1, :cond_b

    .line 175
    .line 176
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-interface {p1}, Lm1/d;->dequeueInputBuffer()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, Lk2/m;

    .line 186
    .line 187
    if-nez p1, :cond_a

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_a
    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleInputBuffer:Lk2/m;

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :catch_1
    move-exception p1

    .line 194
    goto :goto_7

    .line 195
    :cond_b
    :goto_4
    iget p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->decoderReplacementState:I

    .line 196
    .line 197
    if-ne p2, v3, :cond_c

    .line 198
    .line 199
    const/4 p2, 0x4

    .line 200
    invoke-virtual {p1, p2}, Lm1/a;->setFlags(I)V

    .line 201
    .line 202
    .line 203
    iget-object p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-interface {p2, p1}, Lm1/d;->queueInputBuffer(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iput-object v5, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleInputBuffer:Lk2/m;

    .line 212
    .line 213
    iput v1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->decoderReplacementState:I

    .line 214
    .line 215
    return-void

    .line 216
    :cond_c
    iget-object p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 217
    .line 218
    invoke-virtual {p0, p2, p1, v2}, Landroidx/media3/exoplayer/BaseRenderer;->readSource(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    const/4 v0, -0x4

    .line 223
    if-ne p2, v0, :cond_f

    .line 224
    .line 225
    invoke-virtual {p1}, Lm1/a;->isEndOfStream()Z

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    if-eqz p2, :cond_d

    .line 230
    .line 231
    iput-boolean v3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->inputStreamEnded:Z

    .line 232
    .line 233
    iput-boolean v2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->waitingForKeyFrame:Z

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_d
    iget-object p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 237
    .line 238
    iget-object p2, p2, Landroidx/media3/exoplayer/FormatHolder;->format:Landroidx/media3/common/w;

    .line 239
    .line 240
    if-nez p2, :cond_e

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_e
    iget-wide v6, p2, Landroidx/media3/common/w;->s:J

    .line 244
    .line 245
    iput-wide v6, p1, Lk2/m;->j:J

    .line 246
    .line 247
    invoke-virtual {p1}, Lm1/g;->flip()V

    .line 248
    .line 249
    .line 250
    iget-boolean p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->waitingForKeyFrame:Z

    .line 251
    .line 252
    invoke-virtual {p1}, Lm1/a;->isKeyFrame()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    xor-int/2addr v0, v3

    .line 257
    and-int/2addr p2, v0

    .line 258
    iput-boolean p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->waitingForKeyFrame:Z

    .line 259
    .line 260
    :goto_5
    iget-boolean p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->waitingForKeyFrame:Z

    .line 261
    .line 262
    if-nez p2, :cond_9

    .line 263
    .line 264
    iget-object p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 265
    .line 266
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-interface {p2, p1}, Lm1/d;->queueInputBuffer(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iput-object v5, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleInputBuffer:Lk2/m;
    :try_end_1
    .catch Lk2/j; {:try_start_1 .. :try_end_1} :catch_1

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_f
    const/4 p1, -0x3

    .line 276
    if-ne p2, p1, :cond_9

    .line 277
    .line 278
    :cond_10
    :goto_6
    return-void

    .line 279
    :goto_7
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/text/TextRenderer;->handleDecoderError(Lk2/j;)V

    .line 280
    .line 281
    .line 282
    return-void
.end method

.method private replaceSubtitleDecoder()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->releaseSubtitleDecoder()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->initSubtitleDecoder()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private updateOutput(Lg1/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputHandler:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/text/TextRenderer;->invokeUpdateOutputInternal(Lg1/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public experimentalSetLegacyDecodingEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->legacyDecodingEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lg1/c;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/text/TextRenderer;->invokeUpdateOutputInternal(Lg1/c;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public isEnded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputStreamEnded:Z

    .line 2
    .line 3
    return v0
.end method

.method public isReady()Z
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamError:Ljava/io/IOException;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->maybeThrowStreamError()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamError:Ljava/io/IOException;

    .line 17
    .line 18
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamError:Ljava/io/IOException;

    .line 19
    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroidx/media3/exoplayer/text/TextRenderer;->isCuesWithTiming(Landroidx/media3/common/w;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-wide v3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 40
    .line 41
    invoke-interface {v0, v3, v4}, Landroidx/media3/exoplayer/text/CuesResolver;->getNextCueChangeTimeUs(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    const-wide/high16 v5, -0x8000000000000000L

    .line 46
    .line 47
    cmp-long v0, v3, v5

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v1, v2

    .line 53
    :goto_1
    return v1

    .line 54
    :cond_3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputStreamEnded:Z

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    iget-boolean v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->inputStreamEnded:Z

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitle:Lk2/n;

    .line 63
    .line 64
    iget-wide v3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 65
    .line 66
    invoke-static {v0, v3, v4}, Landroidx/media3/exoplayer/text/TextRenderer;->hasNoEventsAfter(Lk2/h;J)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitle:Lk2/n;

    .line 73
    .line 74
    iget-wide v3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 75
    .line 76
    invoke-static {v0, v3, v4}, Landroidx/media3/exoplayer/text/TextRenderer;->hasNoEventsAfter(Lk2/h;J)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->nextSubtitleInputBuffer:Lk2/m;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    :cond_4
    return v2

    .line 87
    :cond_5
    return v1
.end method

.method public onDisabled()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->finalStreamEndPositionUs:J

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->clearOutput()V

    .line 12
    .line 13
    .line 14
    iput-wide v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->releaseSubtitleDecoder()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onPositionReset(JZ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->lastRendererPositionUs:J

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Landroidx/media3/exoplayer/text/CuesResolver;->clear()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->clearOutput()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->inputStreamEnded:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputStreamEnded:Z

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->finalStreamEndPositionUs:J

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, Landroidx/media3/exoplayer/text/TextRenderer;->isCuesWithTiming(Landroidx/media3/common/w;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    iget p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->decoderReplacementState:I

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->replaceSubtitleDecoder()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->releaseSubtitleBuffers()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Lm1/d;->flush()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getLastResetPositionUs()J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    invoke-interface {p1, p2, p3}, Lm1/d;->setOutputStartTimeUs(J)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public onStreamChanged([Landroidx/media3/common/w;JJLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    aget-object p1, p1, p2

    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 5
    .line 6
    invoke-static {p1}, Landroidx/media3/exoplayer/text/TextRenderer;->isCuesWithTiming(Landroidx/media3/common/w;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p2, 0x1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->assertLegacyDecodingEnabledIfRequired()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoder:Lk2/i;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iput p2, p0, Landroidx/media3/exoplayer/text/TextRenderer;->decoderReplacementState:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->initSubtitleDecoder()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 28
    .line 29
    iget p1, p1, Landroidx/media3/common/w;->I:I

    .line 30
    .line 31
    if-ne p1, p2, :cond_2

    .line 32
    .line 33
    new-instance p1, Landroidx/media3/exoplayer/text/MergingCuesResolver;

    .line 34
    .line 35
    invoke-direct {p1}, Landroidx/media3/exoplayer/text/MergingCuesResolver;-><init>()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    new-instance p1, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;

    .line 40
    .line 41
    invoke-direct {p1}, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;-><init>()V

    .line 42
    .line 43
    .line 44
    :goto_0
    iput-object p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 45
    .line 46
    return-void
.end method

.method public render(JJ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->isCurrentStreamFinal()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget-wide p3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->finalStreamEndPositionUs:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p3, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    cmp-long p3, p1, p3

    .line 19
    .line 20
    if-ltz p3, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->releaseSubtitleBuffers()V

    .line 23
    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    iput-boolean p3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputStreamEnded:Z

    .line 27
    .line 28
    :cond_0
    iget-boolean p3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->outputStreamEnded:Z

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->streamFormat:Landroidx/media3/common/w;

    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {p3}, Landroidx/media3/exoplayer/text/TextRenderer;->isCuesWithTiming(Landroidx/media3/common/w;)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    iget-object p3, p0, Landroidx/media3/exoplayer/text/TextRenderer;->cuesResolver:Landroidx/media3/exoplayer/text/CuesResolver;

    .line 45
    .line 46
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/text/TextRenderer;->renderFromCuesWithTiming(J)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/text/TextRenderer;->assertLegacyDecodingEnabledIfRequired()V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/text/TextRenderer;->renderFromSubtitles(J)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public setFinalStreamEndPositionUs(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->isCurrentStreamFinal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Landroidx/media3/exoplayer/text/TextRenderer;->finalStreamEndPositionUs:J

    .line 9
    .line 10
    return-void
.end method

.method public supportsFormat(Landroidx/media3/common/w;)I
    .locals 1

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/text/TextRenderer;->isCuesWithTiming(Landroidx/media3/common/w;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/text/TextRenderer;->subtitleDecoderFactory:Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/text/SubtitleDecoderFactory;->supportsFormat(Landroidx/media3/common/w;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/media3/common/u0;->n(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-static {p1}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    invoke-static {p1}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_2
    :goto_0
    iget p1, p1, Landroidx/media3/common/w;->L:I

    .line 37
    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    const/4 p1, 0x4

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    const/4 p1, 0x2

    .line 43
    :goto_1
    invoke-static {p1}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1
.end method
