.class public final Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;,
        Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$AudioDeviceCallbackV23;,
        Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver;,
        Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;,
        Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Api23;
    }
.end annotation


# instance fields
.field private audioAttributes:Landroidx/media3/common/g;

.field private audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

.field private final audioDeviceCallback:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$AudioDeviceCallbackV23;

.field private final context:Landroid/content/Context;

.field private final externalSurroundSoundSettingObserver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;

.field private final handler:Landroid/os/Handler;

.field private final hdmiAudioPlugBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private final listener:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;

.field private registered:Z

.field private routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Landroidx/media3/common/g;->b:Landroidx/media3/common/g;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;Landroidx/media3/common/g;Landroid/media/AudioDeviceInfo;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;Landroidx/media3/common/g;Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 2
    sget v0, Lh1/i0;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    if-eqz p4, :cond_0

    new-instance v0, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    invoke-direct {v0, p4}, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;-><init>(Landroid/media/AudioDeviceInfo;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;Landroidx/media3/common/g;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;Landroidx/media3/common/g;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iput-object p2, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->listener:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;

    .line 9
    iput-object p3, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioAttributes:Landroidx/media3/common/g;

    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    const/4 p2, 0x0

    .line 11
    invoke-static {p2}, Lh1/i0;->q(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p3

    .line 12
    iput-object p3, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->handler:Landroid/os/Handler;

    .line 13
    sget p4, Lh1/i0;->a:I

    const/16 v0, 0x17

    if-lt p4, v0, :cond_0

    new-instance p4, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$AudioDeviceCallbackV23;

    invoke-direct {p4, p0, p2}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$AudioDeviceCallbackV23;-><init>(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$1;)V

    goto :goto_0

    :cond_0
    move-object p4, p2

    :goto_0
    iput-object p4, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioDeviceCallback:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$AudioDeviceCallbackV23;

    .line 14
    new-instance p4, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver;

    invoke-direct {p4, p0, p2}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver;-><init>(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$1;)V

    iput-object p4, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->hdmiAudioPlugBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 15
    invoke-static {}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->getExternalSurroundSoundGlobalSettingUri()Landroid/net/Uri;

    move-result-object p4

    if-eqz p4, :cond_1

    .line 16
    new-instance p2, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-direct {p2, p0, p3, p1, p4}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;-><init>(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 18
    :cond_1
    iput-object p2, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->externalSurroundSoundSettingObserver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;

    return-void
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;)Landroidx/media3/common/g;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioAttributes:Landroidx/media3/common/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;)Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$302(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$400(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;Landroidx/media3/exoplayer/audio/AudioCapabilities;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->onNewAudioCapabilities(Landroidx/media3/exoplayer/audio/AudioCapabilities;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$500(Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method private onNewAudioCapabilities(Landroidx/media3/exoplayer/audio/AudioCapabilities;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->registered:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->listener:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;->onAudioCapabilitiesChanged(Landroidx/media3/exoplayer/audio/AudioCapabilities;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public register()Landroidx/media3/exoplayer/audio/AudioCapabilities;
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->registered:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->registered:Z

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->externalSurroundSoundSettingObserver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;->register()V

    .line 19
    .line 20
    .line 21
    :cond_1
    sget v0, Lh1/i0;->a:I

    .line 22
    .line 23
    const/16 v1, 0x17

    .line 24
    .line 25
    if-lt v0, v1, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioDeviceCallback:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$AudioDeviceCallbackV23;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->handler:Landroid/os/Handler;

    .line 34
    .line 35
    invoke-static {v1, v0, v2}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Api23;->registerAudioDeviceCallback(Landroid/content/Context;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->hdmiAudioPlugBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 41
    .line 42
    new-instance v2, Landroid/content/IntentFilter;

    .line 43
    .line 44
    const-string v3, "android.media.action.HDMI_AUDIO_PLUG"

    .line 45
    .line 46
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->handler:Landroid/os/Handler;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioAttributes:Landroidx/media3/common/g;

    .line 59
    .line 60
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 61
    .line 62
    invoke-static {v1, v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->getCapabilitiesInternal(Landroid/content/Context;Landroid/content/Intent;Landroidx/media3/common/g;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 67
    .line 68
    return-object v0
.end method

.method public setAudioAttributes(Landroidx/media3/common/g;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioAttributes:Landroidx/media3/common/g;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->getCapabilitiesInternal(Landroid/content/Context;Landroidx/media3/common/g;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->onNewAudioCapabilities(Landroidx/media3/exoplayer/audio/AudioCapabilities;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setRoutedDevice(Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;->audioDeviceInfo:Landroid/media/AudioDeviceInfo;

    .line 9
    .line 10
    :goto_0
    sget v2, Lh1/i0;->a:I

    .line 11
    .line 12
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    if-eqz p1, :cond_2

    .line 20
    .line 21
    new-instance v1, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    iput-object v1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->routedDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioAttributes:Landroidx/media3/common/g;

    .line 31
    .line 32
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->getCapabilitiesInternal(Landroid/content/Context;Landroidx/media3/common/g;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->onNewAudioCapabilities(Landroidx/media3/exoplayer/audio/AudioCapabilities;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public unregister()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->registered:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 8
    .line 9
    sget v0, Lh1/i0;->a:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->audioDeviceCallback:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$AudioDeviceCallbackV23;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Api23;->unregisterAudioDeviceCallback(Landroid/content/Context;Landroid/media/AudioDeviceCallback;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->context:Landroid/content/Context;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->hdmiAudioPlugBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->externalSurroundSoundSettingObserver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver;->unregister()V

    .line 36
    .line 37
    .line 38
    :cond_2
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->registered:Z

    .line 40
    .line 41
    return-void
.end method
