.class final Landroidx/media3/exoplayer/ExoPlayerImpl$Api23;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/ExoPlayerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Api23"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static isSuitableExternalAudioOutputPresentInAudioDeviceInfoList(Landroid/content/Context;[Landroid/media/AudioDeviceInfo;)Z
    .locals 8

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "android.hardware.type.watch"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v0, 0x1

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    array-length p0, p1

    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    if-ge v2, p0, :cond_8

    .line 21
    .line 22
    aget-object v3, p1, v2

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v5, 0x8

    .line 29
    .line 30
    if-eq v4, v5, :cond_7

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x5

    .line 37
    if-eq v4, v5, :cond_7

    .line 38
    .line 39
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x6

    .line 44
    if-eq v4, v5, :cond_7

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/16 v5, 0xb

    .line 51
    .line 52
    if-eq v4, v5, :cond_7

    .line 53
    .line 54
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/4 v5, 0x4

    .line 59
    if-eq v4, v5, :cond_7

    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const/4 v5, 0x3

    .line 66
    if-ne v4, v5, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    sget v4, Lh1/i0;->a:I

    .line 70
    .line 71
    const/16 v5, 0x1a

    .line 72
    .line 73
    if-lt v4, v5, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    const/16 v7, 0x16

    .line 80
    .line 81
    if-ne v6, v7, :cond_2

    .line 82
    .line 83
    return v0

    .line 84
    :cond_2
    const/16 v6, 0x1c

    .line 85
    .line 86
    if-lt v4, v6, :cond_3

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    const/16 v7, 0x17

    .line 93
    .line 94
    if-ne v6, v7, :cond_3

    .line 95
    .line 96
    return v0

    .line 97
    :cond_3
    const/16 v6, 0x1f

    .line 98
    .line 99
    if-lt v4, v6, :cond_5

    .line 100
    .line 101
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eq v6, v5, :cond_4

    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    const/16 v6, 0x1b

    .line 112
    .line 113
    if-ne v5, v6, :cond_5

    .line 114
    .line 115
    :cond_4
    return v0

    .line 116
    :cond_5
    const/16 v5, 0x21

    .line 117
    .line 118
    if-lt v4, v5, :cond_6

    .line 119
    .line 120
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    const/16 v4, 0x1e

    .line 125
    .line 126
    if-ne v3, v4, :cond_6

    .line 127
    .line 128
    return v0

    .line 129
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_7
    :goto_1
    return v0

    .line 133
    :cond_8
    return v1
.end method

.method public static registerAudioDeviceCallback(Landroid/media/AudioManager;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
