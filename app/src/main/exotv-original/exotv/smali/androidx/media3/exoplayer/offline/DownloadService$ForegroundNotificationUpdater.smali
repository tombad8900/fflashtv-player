.class final Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/offline/DownloadService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ForegroundNotificationUpdater"
.end annotation


# instance fields
.field private final handler:Landroid/os/Handler;

.field private notificationDisplayed:Z

.field private final notificationId:I

.field private periodicUpdatesStarted:Z

.field final synthetic this$0:Landroidx/media3/exoplayer/offline/DownloadService;

.field private final updateInterval:J


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/offline/DownloadService;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->this$0:Landroidx/media3/exoplayer/offline/DownloadService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->notificationId:I

    .line 7
    .line 8
    iput-wide p3, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->updateInterval:J

    .line 9
    .line 10
    new-instance p1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->handler:Landroid/os/Handler;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->update()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private update()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->this$0:Landroidx/media3/exoplayer/offline/DownloadService;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/offline/DownloadService;->access$200(Landroidx/media3/exoplayer/offline/DownloadService;)Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->access$100(Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;)Landroidx/media3/exoplayer/offline/DownloadManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/media3/exoplayer/offline/DownloadManager;->getCurrentDownloads()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0}, Landroidx/media3/exoplayer/offline/DownloadManager;->getNotMetRequirements()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->this$0:Landroidx/media3/exoplayer/offline/DownloadService;

    .line 23
    .line 24
    invoke-virtual {v2, v1, v0}, Landroidx/media3/exoplayer/offline/DownloadService;->getForegroundNotification(Ljava/util/List;I)Landroid/app/Notification;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-boolean v1, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->notificationDisplayed:Z

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->this$0:Landroidx/media3/exoplayer/offline/DownloadService;

    .line 33
    .line 34
    iget v2, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->notificationId:I

    .line 35
    .line 36
    sget v3, Lh1/i0;->a:I

    .line 37
    .line 38
    const/16 v4, 0x1d

    .line 39
    .line 40
    if-lt v3, v4, :cond_0

    .line 41
    .line 42
    invoke-static {v1, v2, v0}, Lh1/h0;->a(Landroid/app/Service;ILandroid/app/Notification;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v1, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->notificationDisplayed:Z

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->this$0:Landroidx/media3/exoplayer/offline/DownloadService;

    .line 54
    .line 55
    const-string v2, "notification"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Landroid/app/NotificationManager;

    .line 62
    .line 63
    iget v2, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->notificationId:I

    .line 64
    .line 65
    invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->periodicUpdatesStarted:Z

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->handler:Landroid/os/Handler;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->handler:Landroid/os/Handler;

    .line 79
    .line 80
    new-instance v1, Landroidx/media3/exoplayer/offline/f;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-direct {v1, v2, p0}, Landroidx/media3/exoplayer/offline/f;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-wide v2, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->updateInterval:J

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 89
    .line 90
    .line 91
    :cond_2
    return-void
.end method


# virtual methods
.method public invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->notificationDisplayed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->update()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public showNotificationIfNotAlready()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->notificationDisplayed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->update()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public startPeriodicUpdates()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->periodicUpdatesStarted:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->update()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public stopPeriodicUpdates()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->periodicUpdatesStarted:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/DownloadService$ForegroundNotificationUpdater;->handler:Landroid/os/Handler;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
