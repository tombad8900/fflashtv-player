.class Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SpatializerWrapperV32"
.end annotation


# instance fields
.field private handler:Landroid/os/Handler;

.field private listener:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

.field private final spatializationSupported:Z

.field private final spatializer:Landroid/media/Spatializer;


# direct methods
.method private constructor <init>(Landroid/media/Spatializer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializer:Landroid/media/Spatializer;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/media/Spatializer;->getImmersiveAudioLevel()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializationSupported:Z

    .line 16
    .line 17
    return-void
.end method

.method public static tryCreateInstance(Landroid/content/Context;)Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;
    .locals 1

    .line 1
    const-string v0, "audio"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/media/AudioManager;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/media/AudioManager;->getSpatializer()Landroid/media/Spatializer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;-><init>(Landroid/media/Spatializer;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method


# virtual methods
.method public canBeSpatialized(Landroidx/media3/common/g;Landroidx/media3/common/w;)Z
    .locals 4

    .line 1
    iget-object v0, p2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p2, Landroidx/media3/common/w;->C:I

    .line 6
    .line 7
    const-string v3, "audio/eac3-joc"

    .line 8
    .line 9
    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, -0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    if-ne v2, v0, :cond_3

    .line 19
    .line 20
    const/16 v2, 0xc

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v0, "audio/iamf"

    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    if-ne v2, v3, :cond_3

    .line 32
    .line 33
    const/4 v2, 0x6

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v0, "audio/ac4"

    .line 36
    .line 37
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/16 v0, 0x12

    .line 44
    .line 45
    if-eq v2, v0, :cond_2

    .line 46
    .line 47
    const/16 v0, 0x15

    .line 48
    .line 49
    if-ne v2, v0, :cond_3

    .line 50
    .line 51
    :cond_2
    const/16 v2, 0x18

    .line 52
    .line 53
    :cond_3
    :goto_0
    invoke-static {v2}, Lh1/i0;->u(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    return p1

    .line 61
    :cond_4
    new-instance v1, Landroid/media/AudioFormat$Builder;

    .line 62
    .line 63
    invoke-direct {v1}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x2

    .line 67
    invoke-virtual {v1, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1, v0}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget p2, p2, Landroidx/media3/common/w;->D:I

    .line 76
    .line 77
    if-eq p2, v3, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 80
    .line 81
    .line 82
    :cond_5
    iget-object p2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializer:Landroid/media/Spatializer;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroidx/media3/common/g;->a()La1/o;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object p1, p1, La1/o;->k:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Landroid/media/AudioAttributes;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p2, p1, v0}, Landroid/media/Spatializer;->canBeSpatialized(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    return p1
.end method

.method public ensureInitialized(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;Landroid/os/Looper;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->listener:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->handler:Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32$1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32$1;-><init>(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->listener:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 16
    .line 17
    new-instance p1, Landroid/os/Handler;

    .line 18
    .line 19
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->handler:Landroid/os/Handler;

    .line 23
    .line 24
    iget-object p2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializer:Landroid/media/Spatializer;

    .line 25
    .line 26
    new-instance v0, Landroidx/media3/exoplayer/audio/n;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/audio/n;-><init>(Landroid/os/Handler;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->listener:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 32
    .line 33
    invoke-virtual {p2, v0, p1}, Landroid/media/Spatializer;->addOnSpatializerStateChangedListener(Ljava/util/concurrent/Executor;Landroid/media/Spatializer$OnSpatializerStateChangedListener;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public isAvailable()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializer:Landroid/media/Spatializer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/Spatializer;->isAvailable()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializer:Landroid/media/Spatializer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/Spatializer;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isSpatializationSupported()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializationSupported:Z

    .line 2
    .line 3
    return v0
.end method

.method public release()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->listener:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->handler:Landroid/os/Handler;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->spatializer:Landroid/media/Spatializer;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/media/Spatializer;->removeOnSpatializerStateChangedListener(Landroid/media/Spatializer$OnSpatializerStateChangedListener;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->handler:Landroid/os/Handler;

    .line 16
    .line 17
    sget v1, Lh1/i0;->a:I

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->handler:Landroid/os/Handler;

    .line 24
    .line 25
    iput-object v1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$SpatializerWrapperV32;->listener:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method
