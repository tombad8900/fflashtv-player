.class public final Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/offline/DownloadNotificationHelper$Api31;
    }
.end annotation


# static fields
.field private static final NULL_STRING_ID:I


# instance fields
.field private final notificationBuilder:Lb0/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb0/g;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lb0/g;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, Lb0/g;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Lb0/g;->d:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    iput-boolean v1, v0, Lb0/g;->g:Z

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    iput v2, v0, Lb0/g;->n:I

    .line 39
    .line 40
    new-instance v2, Landroid/app/Notification;

    .line 41
    .line 42
    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v2, v0, Lb0/g;->p:Landroid/app/Notification;

    .line 46
    .line 47
    iput-object p1, v0, Lb0/g;->a:Landroid/content/Context;

    .line 48
    .line 49
    iput-object p2, v0, Lb0/g;->m:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 56
    .line 57
    const/4 p1, -0x1

    .line 58
    iput p1, v2, Landroid/app/Notification;->audioStreamType:I

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, v0, Lb0/g;->q:Ljava/util/ArrayList;

    .line 66
    .line 67
    iput-boolean v1, v0, Lb0/g;->o:Z

    .line 68
    .line 69
    iput-object v0, p0, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->notificationBuilder:Lb0/g;

    .line 70
    .line 71
    return-void
.end method

.method private buildEndStateNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;I)Landroid/app/Notification;
    .locals 11

    .line 1
    const/4 v9, 0x0

    .line 2
    const/4 v10, 0x1

    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    const/4 v8, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    invoke-direct/range {v0 .. v10}, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->buildNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;IIIZZZ)Landroid/app/Notification;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method private buildNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;IIIZZZ)Landroid/app/Notification;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move/from16 v2, p5

    .line 1
    iget-object v3, v0, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->notificationBuilder:Lb0/g;

    .line 2
    iget-object v4, v3, Lb0/g;->p:Landroid/app/Notification;

    move/from16 v5, p2

    .line 3
    iput v5, v4, Landroid/app/Notification;->icon:I

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move-object v2, v4

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    const/16 v5, 0x1400

    const/4 v6, 0x0

    if-nez v2, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v5, :cond_2

    .line 6
    invoke-virtual {v2, v6, v5}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    .line 7
    :cond_2
    :goto_1
    iput-object v2, v3, Lb0/g;->e:Ljava/lang/CharSequence;

    .line 8
    iget-object v2, v0, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->notificationBuilder:Lb0/g;

    move-object/from16 v3, p3

    .line 9
    iput-object v3, v2, Lb0/g;->f:Landroid/app/PendingIntent;

    if-nez v1, :cond_3

    move-object v3, v4

    goto :goto_2

    .line 10
    :cond_3
    new-instance v3, La1/e;

    const/4 v7, 0x5

    const/4 v8, 0x0

    .line 11
    invoke-direct {v3, v7, v8}, La1/e;-><init>(IZ)V

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v5, :cond_4

    .line 13
    invoke-virtual {v1, v6, v5}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 14
    :cond_4
    iput-object v1, v3, La1/e;->l:Ljava/lang/Object;

    .line 15
    :goto_2
    invoke-virtual {v2, v3}, Lb0/g;->a(La1/e;)V

    .line 16
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->notificationBuilder:Lb0/g;

    move/from16 v2, p6

    .line 17
    iput v2, v1, Lb0/g;->i:I

    move/from16 v2, p7

    .line 18
    iput v2, v1, Lb0/g;->j:I

    move/from16 v2, p8

    .line 19
    iput-boolean v2, v1, Lb0/g;->k:Z

    .line 20
    iget-object v2, v1, Lb0/g;->p:Landroid/app/Notification;

    if-eqz p9, :cond_5

    .line 21
    iget v3, v2, Landroid/app/Notification;->flags:I

    or-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/app/Notification;->flags:I

    :goto_3
    move/from16 v2, p10

    goto :goto_4

    .line 22
    :cond_5
    iget v3, v2, Landroid/app/Notification;->flags:I

    and-int/lit8 v3, v3, -0x3

    iput v3, v2, Landroid/app/Notification;->flags:I

    goto :goto_3

    .line 23
    :goto_4
    iput-boolean v2, v1, Lb0/g;->g:Z

    .line 24
    sget v2, Lh1/i0;->a:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_6

    .line 25
    invoke-static {v1}, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper$Api31;->setForegroundServiceBehavior(Lb0/g;)V

    .line 26
    :cond_6
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->notificationBuilder:Lb0/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 29
    iget-object v5, v1, Lb0/g;->a:Landroid/content/Context;

    iget-object v7, v1, Lb0/g;->q:Ljava/util/ArrayList;

    iget-object v8, v1, Lb0/g;->c:Ljava/util/ArrayList;

    iget-object v9, v1, Lb0/g;->m:Ljava/lang/String;

    iget-object v10, v1, Lb0/g;->d:Ljava/util/ArrayList;

    .line 30
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1a

    if-lt v11, v12, :cond_7

    .line 31
    invoke-static {v5, v9}, Lb0/h;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v5

    goto :goto_5

    .line 32
    :cond_7
    new-instance v13, Landroid/app/Notification$Builder;

    invoke-direct {v13, v5}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    move-object v5, v13

    .line 33
    :goto_5
    iget-object v13, v1, Lb0/g;->p:Landroid/app/Notification;

    .line 34
    iget-wide v14, v13, Landroid/app/Notification;->when:J

    invoke-virtual {v5, v14, v15}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v14

    iget v15, v13, Landroid/app/Notification;->icon:I

    iget v3, v13, Landroid/app/Notification;->iconLevel:I

    .line 35
    invoke-virtual {v14, v15, v3}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v14, v13, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 36
    invoke-virtual {v3, v14}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v14, v13, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 37
    invoke-virtual {v3, v14, v4}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v14, v13, Landroid/app/Notification;->vibrate:[J

    .line 38
    invoke-virtual {v3, v14}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v14, v13, Landroid/app/Notification;->ledARGB:I

    iget v15, v13, Landroid/app/Notification;->ledOnMS:I

    iget v12, v13, Landroid/app/Notification;->ledOffMS:I

    .line 39
    invoke-virtual {v3, v14, v15, v12}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v12, v13, Landroid/app/Notification;->flags:I

    and-int/lit8 v12, v12, 0x2

    const/4 v14, 0x1

    if-eqz v12, :cond_8

    move v12, v14

    goto :goto_6

    :cond_8
    move v12, v6

    .line 40
    :goto_6
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v12, v13, Landroid/app/Notification;->flags:I

    and-int/lit8 v12, v12, 0x8

    if-eqz v12, :cond_9

    move v12, v14

    goto :goto_7

    :cond_9
    move v12, v6

    .line 41
    :goto_7
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v12, v13, Landroid/app/Notification;->flags:I

    and-int/lit8 v12, v12, 0x10

    if-eqz v12, :cond_a

    move v12, v14

    goto :goto_8

    :cond_a
    move v12, v6

    .line 42
    :goto_8
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v12, v13, Landroid/app/Notification;->defaults:I

    .line 43
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v12, v1, Lb0/g;->e:Ljava/lang/CharSequence;

    .line 44
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 45
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 46
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v12, v1, Lb0/g;->f:Landroid/app/PendingIntent;

    .line 47
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v12, v13, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 48
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v12, v13, Landroid/app/Notification;->flags:I

    and-int/lit16 v12, v12, 0x80

    if-eqz v12, :cond_b

    goto :goto_9

    :cond_b
    move v14, v6

    .line 49
    :goto_9
    invoke-virtual {v3, v4, v14}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 50
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v12, v1, Lb0/g;->i:I

    iget v14, v1, Lb0/g;->j:I

    iget-boolean v15, v1, Lb0/g;->k:Z

    .line 51
    invoke-virtual {v3, v12, v14, v15}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 52
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 53
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 54
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 55
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 56
    iget-object v3, v1, Lb0/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_22

    .line 57
    iget-object v3, v1, Lb0/g;->l:Landroid/os/Bundle;

    if-eqz v3, :cond_c

    .line 58
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 59
    :cond_c
    iget-boolean v3, v1, Lb0/g;->g:Z

    invoke-virtual {v5, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 60
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 61
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 62
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 63
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 64
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 65
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 66
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 67
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 68
    iget-object v3, v13, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v12, v13, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 69
    invoke-virtual {v5, v3, v12}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    const/16 v3, 0x1c

    if-ge v11, v3, :cond_11

    if-nez v8, :cond_d

    move-object v11, v4

    goto :goto_a

    .line 70
    :cond_d
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_10

    :goto_a
    if-nez v11, :cond_e

    goto :goto_b

    :cond_e
    if-nez v7, :cond_f

    move-object v7, v11

    goto :goto_b

    .line 72
    :cond_f
    new-instance v12, Lp/f;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v14

    add-int/2addr v14, v13

    invoke-direct {v12, v14}, Lp/f;-><init>(I)V

    .line 73
    invoke-virtual {v12, v11}, Lp/f;->addAll(Ljava/util/Collection;)Z

    .line 74
    invoke-virtual {v12, v7}, Lp/f;->addAll(Ljava/util/Collection;)Z

    .line 75
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_b

    .line 76
    :cond_10
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_11
    :goto_b
    if-eqz v7, :cond_12

    .line 79
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_12

    .line 80
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    move v12, v6

    :goto_c
    if-ge v12, v11, :cond_12

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v12, v12, 0x1

    check-cast v13, Ljava/lang/String;

    .line 81
    invoke-virtual {v5, v13}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_c

    .line 82
    :cond_12
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lez v7, :cond_18

    .line 83
    iget-object v7, v1, Lb0/g;->l:Landroid/os/Bundle;

    if-nez v7, :cond_13

    .line 84
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    iput-object v7, v1, Lb0/g;->l:Landroid/os/Bundle;

    .line 85
    :cond_13
    iget-object v7, v1, Lb0/g;->l:Landroid/os/Bundle;

    .line 86
    const-string v11, "android.car.EXTENSIONS"

    invoke-virtual {v7, v11}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    if-nez v7, :cond_14

    .line 87
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 88
    :cond_14
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12, v7}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 89
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 90
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-gtz v14, :cond_16

    .line 91
    const-string v10, "invisible_actions"

    invoke-virtual {v7, v10, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 92
    invoke-virtual {v12, v10, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 93
    iget-object v10, v1, Lb0/g;->l:Landroid/os/Bundle;

    if-nez v10, :cond_15

    .line 94
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    iput-object v10, v1, Lb0/g;->l:Landroid/os/Bundle;

    .line 95
    :cond_15
    iget-object v10, v1, Lb0/g;->l:Landroid/os/Bundle;

    .line 96
    invoke-virtual {v10, v11, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 97
    invoke-virtual {v2, v11, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_d

    .line 98
    :cond_16
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 99
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_17

    .line 100
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 101
    throw v4

    .line 102
    :cond_17
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    .line 103
    :cond_18
    :goto_d
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    iget-object v7, v1, Lb0/g;->l:Landroid/os/Bundle;

    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 105
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    const/16 v7, 0x1a

    if-lt v2, v7, :cond_19

    .line 106
    invoke-static {v5}, Lb0/h;->b(Landroid/app/Notification$Builder;)V

    .line 107
    invoke-static {v5}, Lb0/h;->d(Landroid/app/Notification$Builder;)V

    .line 108
    invoke-static {v5}, Lb0/h;->e(Landroid/app/Notification$Builder;)V

    .line 109
    invoke-static {v5}, Lb0/h;->f(Landroid/app/Notification$Builder;)V

    .line 110
    invoke-static {v5}, Lb0/h;->c(Landroid/app/Notification$Builder;)V

    .line 111
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_19

    .line 112
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v7

    .line 113
    invoke-virtual {v7, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v7

    .line 114
    invoke-virtual {v7, v6, v6, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v6

    .line 115
    invoke-virtual {v6, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_19
    if-lt v2, v3, :cond_1b

    .line 116
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1a

    goto :goto_e

    :cond_1a
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_1b
    :goto_e
    const/16 v3, 0x1d

    if-lt v2, v3, :cond_1c

    .line 119
    iget-boolean v3, v1, Lb0/g;->o:Z

    invoke-static {v5, v3}, Lb0/d;->b(Landroid/app/Notification$Builder;Z)V

    .line 120
    invoke-static {v5}, Lb0/d;->c(Landroid/app/Notification$Builder;)V

    :cond_1c
    const/16 v3, 0x1f

    if-lt v2, v3, :cond_1d

    .line 121
    iget v3, v1, Lb0/g;->n:I

    if-eqz v3, :cond_1d

    .line 122
    invoke-static {v5, v3}, Lb0/i;->a(Landroid/app/Notification$Builder;I)V

    .line 123
    :cond_1d
    iget-object v3, v1, Lb0/g;->h:La1/e;

    if-eqz v3, :cond_1e

    .line 124
    new-instance v6, Landroid/app/Notification$BigTextStyle;

    invoke-direct {v6, v5}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V

    .line 125
    invoke-virtual {v6, v4}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object v4

    .line 126
    iget-object v6, v3, La1/e;->l:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v4, v6}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    :cond_1e
    const/16 v7, 0x1a

    if-lt v2, v7, :cond_1f

    .line 127
    invoke-virtual {v5}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    goto :goto_f

    .line 128
    :cond_1f
    invoke-virtual {v5}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    :goto_f
    if-eqz v3, :cond_20

    .line 129
    iget-object v1, v1, Lb0/g;->h:La1/e;

    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_20
    if-eqz v3, :cond_21

    .line 131
    iget-object v1, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz v1, :cond_21

    .line 132
    const-string v3, "androidx.core.app.NotificationCompat$BigTextStyle"

    .line 133
    const-string v4, "androidx.core.app.extra.COMPAT_TEMPLATE"

    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_21
    return-object v2

    .line 134
    :cond_22
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1
.end method


# virtual methods
.method public buildDownloadCompletedNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;)Landroid/app/Notification;
    .locals 6

    .line 1
    sget v5, Landroidx/media3/exoplayer/R$string;->exo_download_completed:I

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->buildEndStateNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;I)Landroid/app/Notification;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public buildDownloadFailedNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;)Landroid/app/Notification;
    .locals 6

    .line 1
    sget v5, Landroidx/media3/exoplayer/R$string;->exo_download_failed:I

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->buildEndStateNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;I)Landroid/app/Notification;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public buildProgressNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;Ljava/util/List;I)Landroid/app/Notification;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Landroid/app/PendingIntent;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/offline/Download;",
            ">;I)",
            "Landroid/app/Notification;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    move v3, v1

    .line 5
    move v4, v3

    .line 6
    move v5, v4

    .line 7
    move v6, v5

    .line 8
    move v7, v6

    .line 9
    move v8, v7

    .line 10
    move v9, v2

    .line 11
    :goto_0
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v10

    .line 15
    if-ge v3, v10, :cond_5

    .line 16
    .line 17
    move-object/from16 v10, p5

    .line 18
    .line 19
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    check-cast v11, Landroidx/media3/exoplayer/offline/Download;

    .line 24
    .line 25
    iget v12, v11, Landroidx/media3/exoplayer/offline/Download;->state:I

    .line 26
    .line 27
    if-eqz v12, :cond_4

    .line 28
    .line 29
    const/4 v13, 0x2

    .line 30
    if-eq v12, v13, :cond_1

    .line 31
    .line 32
    const/4 v13, 0x5

    .line 33
    if-eq v12, v13, :cond_0

    .line 34
    .line 35
    const/4 v13, 0x7

    .line 36
    if-eq v12, v13, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    move v7, v2

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-virtual {v11}, Landroidx/media3/exoplayer/offline/Download;->getPercentDownloaded()F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/high16 v12, -0x40800000    # -1.0f

    .line 46
    .line 47
    cmpl-float v12, v4, v12

    .line 48
    .line 49
    if-eqz v12, :cond_2

    .line 50
    .line 51
    add-float/2addr v0, v4

    .line 52
    move v9, v1

    .line 53
    :cond_2
    invoke-virtual {v11}, Landroidx/media3/exoplayer/offline/Download;->getBytesDownloaded()J

    .line 54
    .line 55
    .line 56
    move-result-wide v11

    .line 57
    const-wide/16 v13, 0x0

    .line 58
    .line 59
    cmp-long v4, v11, v13

    .line 60
    .line 61
    if-lez v4, :cond_3

    .line 62
    .line 63
    move v4, v2

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move v4, v1

    .line 66
    :goto_1
    or-int/2addr v6, v4

    .line 67
    add-int/lit8 v8, v8, 0x1

    .line 68
    .line 69
    move v4, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    move v5, v2

    .line 72
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    if-eqz v4, :cond_6

    .line 76
    .line 77
    sget v3, Landroidx/media3/exoplayer/R$string;->exo_download_downloading:I

    .line 78
    .line 79
    :goto_3
    move v15, v3

    .line 80
    :goto_4
    move v3, v2

    .line 81
    goto :goto_6

    .line 82
    :cond_6
    if-eqz v5, :cond_9

    .line 83
    .line 84
    if-eqz p6, :cond_9

    .line 85
    .line 86
    and-int/lit8 v3, p6, 0x2

    .line 87
    .line 88
    if-eqz v3, :cond_7

    .line 89
    .line 90
    sget v3, Landroidx/media3/exoplayer/R$string;->exo_download_paused_for_wifi:I

    .line 91
    .line 92
    :goto_5
    move v15, v3

    .line 93
    move v3, v1

    .line 94
    goto :goto_6

    .line 95
    :cond_7
    and-int/lit8 v3, p6, 0x1

    .line 96
    .line 97
    if-eqz v3, :cond_8

    .line 98
    .line 99
    sget v3, Landroidx/media3/exoplayer/R$string;->exo_download_paused_for_network:I

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    sget v3, Landroidx/media3/exoplayer/R$string;->exo_download_paused:I

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_9
    if-eqz v7, :cond_a

    .line 106
    .line 107
    sget v3, Landroidx/media3/exoplayer/R$string;->exo_download_removing:I

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_a
    move v15, v1

    .line 111
    goto :goto_4

    .line 112
    :goto_6
    if-eqz v3, :cond_d

    .line 113
    .line 114
    const/16 v3, 0x64

    .line 115
    .line 116
    if-eqz v4, :cond_c

    .line 117
    .line 118
    int-to-float v4, v8

    .line 119
    div-float/2addr v0, v4

    .line 120
    float-to-int v0, v0

    .line 121
    if-eqz v9, :cond_b

    .line 122
    .line 123
    if-eqz v6, :cond_b

    .line 124
    .line 125
    move v1, v2

    .line 126
    :cond_b
    move/from16 v17, v0

    .line 127
    .line 128
    move/from16 v18, v1

    .line 129
    .line 130
    :goto_7
    move/from16 v16, v3

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_c
    move/from16 v17, v1

    .line 134
    .line 135
    move/from16 v18, v2

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_d
    move/from16 v16, v1

    .line 139
    .line 140
    move/from16 v17, v16

    .line 141
    .line 142
    move/from16 v18, v17

    .line 143
    .line 144
    :goto_8
    const/16 v19, 0x1

    .line 145
    .line 146
    const/16 v20, 0x0

    .line 147
    .line 148
    move-object/from16 v10, p0

    .line 149
    .line 150
    move-object/from16 v11, p1

    .line 151
    .line 152
    move/from16 v12, p2

    .line 153
    .line 154
    move-object/from16 v13, p3

    .line 155
    .line 156
    move-object/from16 v14, p4

    .line 157
    .line 158
    invoke-direct/range {v10 .. v20}, Landroidx/media3/exoplayer/offline/DownloadNotificationHelper;->buildNotification(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;IIIZZZ)Landroid/app/Notification;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0
.end method
