.class public final Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioOffloadSupportProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider$Api31;,
        Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider$Api29;
    }
.end annotation


# static fields
.field private static final OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY:Ljava/lang/String; = "offloadVariableRateSupported"


# instance fields
.field private final context:Landroid/content/Context;

.field private isOffloadVariableRateSupported:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->context:Landroid/content/Context;

    return-void
.end method

.method private isOffloadVariableRateSupported(Landroid/content/Context;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->isOffloadVariableRateSupported:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    if-eqz p1, :cond_3

    .line 11
    .line 12
    const-string v0, "audio"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/media/AudioManager;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    const-string v0, "offloadVariableRateSupported"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const-string v0, "offloadVariableRateSupported=1"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->isOffloadVariableRateSupported:Ljava/lang/Boolean;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 49
    .line 50
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->isOffloadVariableRateSupported:Ljava/lang/Boolean;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->isOffloadVariableRateSupported:Ljava/lang/Boolean;

    .line 56
    .line 57
    :goto_1
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->isOffloadVariableRateSupported:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1
.end method


# virtual methods
.method public getAudioOffloadSupport(Landroidx/media3/common/w;Landroidx/media3/common/g;)Landroidx/media3/exoplayer/audio/AudioOffloadSupport;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Landroidx/media3/common/w;->D:I

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget v1, Lh1/i0;->a:I

    .line 10
    .line 11
    const/16 v2, 0x1d

    .line 12
    .line 13
    if-lt v1, v2, :cond_5

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->context:Landroid/content/Context;

    .line 20
    .line 21
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider;->isOffloadVariableRateSupported(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v4, p1, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v3, v4}, Landroidx/media3/common/u0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_4

    .line 37
    .line 38
    invoke-static {v3}, Lh1/i0;->s(I)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-ge v1, v4, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget p1, p1, Landroidx/media3/common/w;->C:I

    .line 46
    .line 47
    invoke-static {p1}, Lh1/i0;->u(I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    sget-object p1, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->DEFAULT_UNSUPPORTED:Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_2
    :try_start_0
    invoke-static {v0, p1, v3}, Lh1/i0;->t(III)Landroid/media/AudioFormat;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    const/16 v0, 0x1f

    .line 61
    .line 62
    if-lt v1, v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {p2}, Landroidx/media3/common/g;->a()La1/o;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iget-object p2, p2, La1/o;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, Landroid/media/AudioAttributes;

    .line 71
    .line 72
    invoke-static {p1, p2, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider$Api31;->getOffloadedPlaybackSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_3
    invoke-virtual {p2}, Landroidx/media3/common/g;->a()La1/o;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iget-object p2, p2, La1/o;->k:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Landroid/media/AudioAttributes;

    .line 84
    .line 85
    invoke-static {p1, p2, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioOffloadSupportProvider$Api29;->getOffloadedPlaybackSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :catch_0
    sget-object p1, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->DEFAULT_UNSUPPORTED:Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_4
    :goto_0
    sget-object p1, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->DEFAULT_UNSUPPORTED:Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_5
    :goto_1
    sget-object p1, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->DEFAULT_UNSUPPORTED:Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 97
    .line 98
    return-object p1
.end method
