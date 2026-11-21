.class final Landroidx/media3/exoplayer/audio/AudioCapabilities$Api33;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/audio/AudioCapabilities;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Api33"
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

.method public static getCapabilitiesInternalForDirectPlayback(Landroid/media/AudioManager;Landroidx/media3/common/g;)Landroidx/media3/exoplayer/audio/AudioCapabilities;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/media3/common/g;->a()La1/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La1/o;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroid/media/AudioAttributes;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getDirectProfilesForAttributes(Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->access$000(Ljava/util/List;)Lf6/m0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p1, p0, v0}, Landroidx/media3/exoplayer/audio/AudioCapabilities;-><init>(Ljava/util/List;Landroidx/media3/exoplayer/audio/AudioCapabilities$1;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public static getDefaultRoutedDeviceForAttributes(Landroid/media/AudioManager;Landroidx/media3/common/g;)Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/common/g;->a()La1/o;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p1, p1, La1/o;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Landroid/media/AudioAttributes;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getAudioDevicesForAttributes(Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance p1, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Landroid/media/AudioDeviceInfo;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :catch_0
    return-object v0
.end method
