.class Landroidx/media3/exoplayer/drm/DefaultDrmSession;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/drm/DrmSession;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;,
        Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;,
        Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;,
        Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;,
        Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestTask;,
        Landroidx/media3/exoplayer/drm/DefaultDrmSession$UnexpectedDrmSessionException;
    }
.end annotation


# static fields
.field private static final MAX_LICENSE_DURATION_TO_RENEW_SECONDS:I = 0x3c

.field private static final MSG_KEYS:I = 0x2

.field private static final MSG_PROVISION:I = 0x1

.field private static final TAG:Ljava/lang/String; = "DefaultDrmSession"


# instance fields
.field private final callback:Landroidx/media3/exoplayer/drm/MediaDrmCallback;

.field private cryptoConfig:Lm1/b;

.field private currentKeyRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$KeyRequest;

.field private currentProvisionRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$ProvisionRequest;

.field private final eventDispatchers:Lh1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh1/g;"
        }
    .end annotation
.end field

.field private final isPlaceholderSession:Z

.field private final keyRequestParameters:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private lastException:Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

.field private final loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field private final mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

.field private final mode:I

.field private offlineLicenseKeySetId:[B

.field private final playClearSamplesWithoutKeys:Z

.field private final playbackLooper:Landroid/os/Looper;

.field private final playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

.field private final provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

.field private referenceCount:I

.field private final referenceCountListener:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;

.field private requestHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;

.field private requestHandlerThread:Landroid/os/HandlerThread;

.field private final responseHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;

.field public final schemeDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/common/r;",
            ">;"
        }
    .end annotation
.end field

.field private sessionId:[B

.field private state:I

.field private final uuid:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Landroidx/media3/exoplayer/drm/ExoMediaDrm;Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;Ljava/util/List;IZZ[BLjava/util/HashMap;Landroidx/media3/exoplayer/drm/MediaDrmCallback;Landroid/os/Looper;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;Landroidx/media3/exoplayer/analytics/PlayerId;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Landroidx/media3/exoplayer/drm/ExoMediaDrm;",
            "Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;",
            "Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;",
            "Ljava/util/List<",
            "Landroidx/media3/common/r;",
            ">;IZZ[B",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/media3/exoplayer/drm/MediaDrmCallback;",
            "Landroid/os/Looper;",
            "Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;",
            "Landroidx/media3/exoplayer/analytics/PlayerId;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p6, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-ne p6, v0, :cond_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :cond_1
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->uuid:Ljava/util/UUID;

    .line 14
    .line 15
    iput-object p3, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

    .line 16
    .line 17
    iput-object p4, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCountListener:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;

    .line 18
    .line 19
    iput-object p2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 20
    .line 21
    iput p6, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mode:I

    .line 22
    .line 23
    iput-boolean p7, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->playClearSamplesWithoutKeys:Z

    .line 24
    .line 25
    iput-boolean p8, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->isPlaceholderSession:Z

    .line 26
    .line 27
    if-eqz p9, :cond_2

    .line 28
    .line 29
    iput-object p9, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->schemeDatas:Ljava/util/List;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->schemeDatas:Ljava/util/List;

    .line 43
    .line 44
    :goto_0
    iput-object p10, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->keyRequestParameters:Ljava/util/HashMap;

    .line 45
    .line 46
    iput-object p11, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->callback:Landroidx/media3/exoplayer/drm/MediaDrmCallback;

    .line 47
    .line 48
    new-instance p1, Lh1/g;

    .line 49
    .line 50
    invoke-direct {p1}, Lh1/g;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->eventDispatchers:Lh1/g;

    .line 54
    .line 55
    iput-object p13, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 56
    .line 57
    iput-object p14, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 58
    .line 59
    const/4 p1, 0x2

    .line 60
    iput p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 61
    .line 62
    iput-object p12, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->playbackLooper:Landroid/os/Looper;

    .line 63
    .line 64
    new-instance p1, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;

    .line 65
    .line 66
    invoke-direct {p1, p0, p12}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;-><init>(Landroidx/media3/exoplayer/drm/DefaultDrmSession;Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->responseHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;

    .line 70
    .line 71
    return-void
.end method

.method public static synthetic a(Ljava/lang/Exception;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->lambda$onError$1(Ljava/lang/Throwable;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$000(Landroidx/media3/exoplayer/drm/DefaultDrmSession;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onProvisionResponse(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100(Landroidx/media3/exoplayer/drm/DefaultDrmSession;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onKeyResponse(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/drm/DefaultDrmSession;)Ljava/util/UUID;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->uuid:Ljava/util/UUID;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Landroidx/media3/exoplayer/drm/DefaultDrmSession;)Landroidx/media3/exoplayer/drm/MediaDrmCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->callback:Landroidx/media3/exoplayer/drm/MediaDrmCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Landroidx/media3/exoplayer/drm/DefaultDrmSession;)Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Landroidx/media3/exoplayer/drm/DefaultDrmSession;)Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->responseHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0, p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->lambda$openInternal$0(ILandroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private dispatchEvent(Lh1/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/f;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->eventDispatchers:Lh1/g;

    .line 2
    .line 3
    iget-object v1, v0, Lh1/g;->j:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Lh1/g;->l:Ljava/util/Set;

    .line 7
    .line 8
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;

    .line 24
    .line 25
    invoke-interface {p1, v1}, Lh1/f;->accept(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method private doLicense(Z)V
    .locals 9
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sessionId"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->isPlaceholderSession:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 7
    .line 8
    sget v1, Lh1/i0;->a:I

    .line 9
    .line 10
    iget v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mode:I

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x2

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    if-eq v1, v3, :cond_4

    .line 18
    .line 19
    if-eq v1, v4, :cond_2

    .line 20
    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 35
    .line 36
    invoke-direct {p0, v0, v2, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->postKeyRequest([BIZ)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->restoreKeys()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_6

    .line 49
    .line 50
    :cond_3
    invoke-direct {p0, v0, v4, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->postKeyRequest([BIZ)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 55
    .line 56
    if-nez v1, :cond_5

    .line 57
    .line 58
    invoke-direct {p0, v0, v3, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->postKeyRequest([BIZ)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_5
    iget v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 63
    .line 64
    const/4 v3, 0x4

    .line 65
    if-eq v1, v3, :cond_7

    .line 66
    .line 67
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->restoreKeys()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    :goto_0
    return-void

    .line 75
    :cond_7
    :goto_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->getLicenseDurationRemainingSec()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    iget v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mode:I

    .line 80
    .line 81
    if-nez v1, :cond_8

    .line 82
    .line 83
    const-wide/16 v7, 0x3c

    .line 84
    .line 85
    cmp-long v1, v5, v7

    .line 86
    .line 87
    if-gtz v1, :cond_8

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v2, "Offline license has expired or will expire soon. Remaining seconds: "

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v2, "DefaultDrmSession"

    .line 104
    .line 105
    invoke-static {v2, v1}, Lh1/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v0, v4, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->postKeyRequest([BIZ)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_8
    const-wide/16 v0, 0x0

    .line 113
    .line 114
    cmp-long p1, v5, v0

    .line 115
    .line 116
    if-gtz p1, :cond_9

    .line 117
    .line 118
    new-instance p1, Landroidx/media3/exoplayer/drm/KeysExpiredException;

    .line 119
    .line 120
    invoke-direct {p1}, Landroidx/media3/exoplayer/drm/KeysExpiredException;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-direct {p0, p1, v4}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onError(Ljava/lang/Throwable;I)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_9
    iput v3, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 128
    .line 129
    new-instance p1, Landroidx/media3/exoplayer/drm/a;

    .line 130
    .line 131
    invoke-direct {p1, v2}, Landroidx/media3/exoplayer/drm/a;-><init>(I)V

    .line 132
    .line 133
    .line 134
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->dispatchEvent(Lh1/f;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method private getLicenseDurationRemainingSec()J
    .locals 5

    .line 1
    sget-object v0, Landroidx/media3/common/k;->d:Ljava/util/UUID;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->uuid:Ljava/util/UUID;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-wide v0, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    invoke-static {p0}, Landroidx/media3/exoplayer/drm/WidevineUtil;->getLicenseDurationRemainingSec(Landroidx/media3/exoplayer/drm/DrmSession;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Long;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/lang/Long;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0
.end method

.method private isOpen()Z
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method private static synthetic lambda$onError$1(Ljava/lang/Throwable;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V
    .locals 0

    .line 1
    check-cast p0, Ljava/lang/Exception;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;->drmSessionManagerError(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$openInternal$0(ILandroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;->drmSessionAcquired(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private onError(Ljava/lang/Throwable;I)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/drm/DrmUtil;->getErrorCodeForMediaDrmException(Ljava/lang/Throwable;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-direct {v0, p1, p2}, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;-><init>(Ljava/lang/Throwable;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->lastException:Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 11
    .line 12
    const-string p2, "DefaultDrmSession"

    .line 13
    .line 14
    const-string v0, "DRM session error"

    .line 15
    .line 16
    invoke-static {p2, v0, p1}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    instance-of p2, p1, Ljava/lang/Exception;

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    new-instance p2, Landroidx/media3/exoplayer/drm/b;

    .line 24
    .line 25
    check-cast p1, Ljava/lang/Exception;

    .line 26
    .line 27
    invoke-direct {p2, p1}, Landroidx/media3/exoplayer/drm/b;-><init>(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->dispatchEvent(Lh1/f;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of p2, p1, Ljava/lang/Error;

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    invoke-static {p1}, Landroidx/media3/exoplayer/drm/DrmUtil;->isFailureToConstructResourceBusyException(Ljava/lang/Throwable;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-nez p2, :cond_2

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/drm/DrmUtil;->isFailureToConstructNotProvisionedException(Ljava/lang/Throwable;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    check-cast p1, Ljava/lang/Error;

    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    :goto_0
    iget p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 55
    .line 56
    const/4 p2, 0x4

    .line 57
    if-eq p1, p2, :cond_3

    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    iput p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 61
    .line 62
    :cond_3
    return-void

    .line 63
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v0, "Unexpected Throwable subclass"

    .line 66
    .line 67
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p2
.end method

.method private onKeyResponse(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentKeyRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$KeyRequest;

    .line 2
    .line 3
    if-ne p1, v0, :cond_6

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->isOpen()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentKeyRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$KeyRequest;

    .line 14
    .line 15
    instance-of p1, p2, Ljava/lang/Exception;

    .line 16
    .line 17
    if-nez p1, :cond_5

    .line 18
    .line 19
    instance-of p1, p2, Ljava/lang/NoSuchMethodError;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p1, 0x1

    .line 25
    :try_start_0
    check-cast p2, [B

    .line 26
    .line 27
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mode:I

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 35
    .line 36
    sget v2, Lh1/i0;->a:I

    .line 37
    .line 38
    invoke-interface {v0, v1, p2}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->provideKeyResponse([B[B)[B

    .line 39
    .line 40
    .line 41
    new-instance p2, Landroidx/media3/exoplayer/drm/a;

    .line 42
    .line 43
    invoke-direct {p2, p1}, Landroidx/media3/exoplayer/drm/a;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->dispatchEvent(Lh1/f;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception p2

    .line 51
    goto :goto_0

    .line 52
    :catch_1
    move-exception p2

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 57
    .line 58
    invoke-interface {v0, v1, p2}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->provideKeyResponse([B[B)[B

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mode:I

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    if-eq v0, v1, :cond_3

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    :cond_3
    if-eqz p2, :cond_4

    .line 74
    .line 75
    array-length v0, p2

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iput-object p2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 79
    .line 80
    :cond_4
    const/4 p2, 0x4

    .line 81
    iput p2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 82
    .line 83
    new-instance p2, Landroidx/media3/exoplayer/drm/a;

    .line 84
    .line 85
    invoke-direct {p2, v1}, Landroidx/media3/exoplayer/drm/a;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->dispatchEvent(Lh1/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :goto_0
    invoke-direct {p0, p2, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onKeysError(Ljava/lang/Throwable;Z)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/Throwable;

    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    invoke-direct {p0, p2, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onKeysError(Ljava/lang/Throwable;Z)V

    .line 100
    .line 101
    .line 102
    :cond_6
    :goto_2
    return-void
.end method

.method private onKeysError(Ljava/lang/Throwable;Z)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/media/NotProvisionedException;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/media3/exoplayer/drm/DrmUtil;->isFailureToConstructNotProvisionedException(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p2, 0x2

    .line 17
    :goto_0
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onError(Ljava/lang/Throwable;I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

    .line 22
    .line 23
    invoke-interface {p1, p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;->provisionRequired(Landroidx/media3/exoplayer/drm/DefaultDrmSession;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private onKeysRequired()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    sget v0, Lh1/i0;->a:I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->doLicense(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private onProvisionResponse(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentProvisionRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$ProvisionRequest;

    .line 2
    .line 3
    if-ne p1, v0, :cond_2

    .line 4
    .line 5
    iget p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->isOpen()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentProvisionRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$ProvisionRequest;

    .line 19
    .line 20
    instance-of p1, p2, Ljava/lang/Exception;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Exception;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-interface {p1, p2, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;->onProvisionError(Ljava/lang/Exception;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    :try_start_0
    iget-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 34
    .line 35
    check-cast p2, [B

    .line 36
    .line 37
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->provideProvisionResponse([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

    .line 41
    .line 42
    invoke-interface {p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;->onProvisionCompleted()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception p1

    .line 47
    iget-object p2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-interface {p2, p1, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;->onProvisionError(Ljava/lang/Exception;Z)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void
.end method

.method private openInternal()Z
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->isOpen()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->openSession()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 18
    .line 19
    iget-object v3, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 20
    .line 21
    invoke-interface {v2, v0, v3}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->setPlayerIdForSession([BLandroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 27
    .line 28
    invoke-interface {v0, v2}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->createCryptoConfig([B)Lm1/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->cryptoConfig:Lm1/b;

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    iput v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 36
    .line 37
    new-instance v0, Landroidx/media3/exoplayer/drm/a;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v0, v2}, Landroidx/media3/exoplayer/drm/a;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->dispatchEvent(Lh1/f;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return v1

    .line 52
    :catch_0
    move-exception v0

    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception v0

    .line 55
    :goto_0
    invoke-static {v0}, Landroidx/media3/exoplayer/drm/DrmUtil;->isFailureToConstructNotProvisionedException(Ljava/lang/Throwable;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

    .line 62
    .line 63
    invoke-interface {v0, p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;->provisionRequired(Landroidx/media3/exoplayer/drm/DefaultDrmSession;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onError(Ljava/lang/Throwable;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_2
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->provisioningManager:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;

    .line 72
    .line 73
    invoke-interface {v0, p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ProvisioningManager;->provisionRequired(Landroidx/media3/exoplayer/drm/DefaultDrmSession;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    const/4 v0, 0x0

    .line 77
    return v0
.end method

.method private postKeyRequest([BIZ)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->schemeDatas:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->keyRequestParameters:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-interface {v0, p1, v1, p2, v2}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->getKeyRequest([BLjava/util/List;ILjava/util/HashMap;)Landroidx/media3/exoplayer/drm/ExoMediaDrm$KeyRequest;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentKeyRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$KeyRequest;

    .line 12
    .line 13
    iget-object p2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;

    .line 14
    .line 15
    sget v0, Lh1/i0;->a:I

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-virtual {p2, v0, p1, p3}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;->post(ILjava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception p1

    .line 28
    :goto_0
    const/4 p2, 0x1

    .line 29
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onKeysError(Ljava/lang/Throwable;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private restoreKeys()Z
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sessionId",
            "offlineLicenseKeySetId"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 3
    .line 4
    iget-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 5
    .line 6
    iget-object v3, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 7
    .line 8
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->restoreKeys([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return v0

    .line 12
    :catch_0
    move-exception v1

    .line 13
    goto :goto_0

    .line 14
    :catch_1
    move-exception v1

    .line 15
    :goto_0
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onError(Ljava/lang/Throwable;I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private verifyPlaybackThread()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->playbackLooper:Landroid/os/Looper;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "\nExpected thread: "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->playbackLooper:Landroid/os/Looper;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v2, "DefaultDrmSession"

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Lh1/a;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method


# virtual methods
.method public acquire(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "DefaultDrmSession"

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Session reference count less than zero: "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v3, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v0, v2}, Lh1/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 31
    .line 32
    :cond_0
    const/4 v0, 0x1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->eventDispatchers:Lh1/g;

    .line 36
    .line 37
    iget-object v3, v2, Lh1/g;->j:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v3

    .line 40
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object v5, v2, Lh1/g;->m:Ljava/util/List;

    .line 43
    .line 44
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iput-object v4, v2, Lh1/g;->m:Ljava/util/List;

    .line 55
    .line 56
    iget-object v4, v2, Lh1/g;->k:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/Integer;

    .line 63
    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    new-instance v5, Ljava/util/HashSet;

    .line 67
    .line 68
    iget-object v6, v2, Lh1/g;->l:Ljava/util/Set;

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iput-object v5, v2, Lh1/g;->l:Ljava/util/Set;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto :goto_2

    .line 85
    :cond_1
    :goto_0
    iget-object v2, v2, Lh1/g;->k:Ljava/util/HashMap;

    .line 86
    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    add-int/2addr v4, v0

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move v4, v0

    .line 96
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v2, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    monitor-exit v3

    .line 104
    goto :goto_3

    .line 105
    :goto_2
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    throw p1

    .line 107
    :cond_3
    :goto_3
    iget v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 108
    .line 109
    add-int/2addr v2, v0

    .line 110
    iput v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 111
    .line 112
    if-ne v2, v0, :cond_5

    .line 113
    .line 114
    iget p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 115
    .line 116
    const/4 v2, 0x2

    .line 117
    if-ne p1, v2, :cond_4

    .line 118
    .line 119
    move v1, v0

    .line 120
    :cond_4
    invoke-static {v1}, Lh1/a;->j(Z)V

    .line 121
    .line 122
    .line 123
    new-instance p1, Landroid/os/HandlerThread;

    .line 124
    .line 125
    const-string v1, "ExoPlayer:DrmRequestHandler"

    .line 126
    .line 127
    invoke-direct {p1, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandlerThread:Landroid/os/HandlerThread;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 133
    .line 134
    .line 135
    new-instance p1, Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;

    .line 136
    .line 137
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandlerThread:Landroid/os/HandlerThread;

    .line 138
    .line 139
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-direct {p1, p0, v1}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;-><init>(Landroidx/media3/exoplayer/drm/DefaultDrmSession;Landroid/os/Looper;)V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;

    .line 147
    .line 148
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->openInternal()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->doLicense(Z)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_5
    if-eqz p1, :cond_6

    .line 159
    .line 160
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->isOpen()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_6

    .line 165
    .line 166
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->eventDispatchers:Lh1/g;

    .line 167
    .line 168
    invoke-virtual {v1, p1}, Lh1/g;->a(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-ne v1, v0, :cond_6

    .line 173
    .line 174
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 175
    .line 176
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;->drmSessionAcquired(I)V

    .line 177
    .line 178
    .line 179
    :cond_6
    :goto_4
    iget-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCountListener:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;

    .line 180
    .line 181
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 182
    .line 183
    invoke-interface {p1, p0, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;->onReferenceCountIncremented(Landroidx/media3/exoplayer/drm/DefaultDrmSession;I)V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method public final getCryptoConfig()Lm1/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->cryptoConfig:Lm1/b;

    .line 5
    .line 6
    return-object v0
.end method

.method public final getError()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->lastException:Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public getOfflineLicenseKeySetId()[B
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->offlineLicenseKeySetId:[B

    .line 5
    .line 6
    return-object v0
.end method

.method public final getSchemeUuid()Ljava/util/UUID;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->uuid:Ljava/util/UUID;

    .line 5
    .line 6
    return-object v0
.end method

.method public final getState()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 5
    .line 6
    return v0
.end method

.method public hasSessionId([B)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 5
    .line 6
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public onMediaDrmEvent(I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onKeysRequired()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onProvisionCompleted()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->openInternal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->doLicense(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onProvisionError(Ljava/lang/Exception;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p2, 0x3

    .line 6
    :goto_0
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->onError(Ljava/lang/Throwable;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public playClearSamplesWithoutKeys()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->playClearSamplesWithoutKeys:Z

    .line 5
    .line 6
    return v0
.end method

.method public provision()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->getProvisionRequest()Landroidx/media3/exoplayer/drm/ExoMediaDrm$ProvisionRequest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentProvisionRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$ProvisionRequest;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;

    .line 10
    .line 11
    sget v2, Lh1/i0;->a:I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v1, v2, v0, v2}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;->post(ILjava/lang/Object;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public queryKeyStatus()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->queryKeyStatus([B)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public release(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    const-string p1, "DefaultDrmSession"

    .line 9
    .line 10
    const-string v0, "release() called on a session that\'s already fully released."

    .line 11
    .line 12
    invoke-static {p1, v0}, Lh1/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    sub-int/2addr v0, v1

    .line 18
    iput v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->state:I

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->responseHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ResponseHandler;

    .line 26
    .line 27
    sget v2, Lh1/i0;->a:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;->release()V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandler:Landroidx/media3/exoplayer/drm/DefaultDrmSession$RequestHandler;

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandlerThread:Landroid/os/HandlerThread;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->requestHandlerThread:Landroid/os/HandlerThread;

    .line 46
    .line 47
    iput-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->cryptoConfig:Lm1/b;

    .line 48
    .line 49
    iput-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->lastException:Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 50
    .line 51
    iput-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentKeyRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$KeyRequest;

    .line 52
    .line 53
    iput-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->currentProvisionRequest:Landroidx/media3/exoplayer/drm/ExoMediaDrm$ProvisionRequest;

    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iget-object v3, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 60
    .line 61
    invoke-interface {v3, v0}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->closeSession([B)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 65
    .line 66
    :cond_1
    if-eqz p1, :cond_4

    .line 67
    .line 68
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->eventDispatchers:Lh1/g;

    .line 69
    .line 70
    iget-object v2, v0, Lh1/g;->j:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v2

    .line 73
    :try_start_0
    iget-object v3, v0, Lh1/g;->k:Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/lang/Integer;

    .line 80
    .line 81
    if-nez v3, :cond_2

    .line 82
    .line 83
    monitor-exit v2

    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 88
    .line 89
    iget-object v5, v0, Lh1/g;->m:Ljava/util/List;

    .line 90
    .line 91
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iput-object v4, v0, Lh1/g;->m:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-ne v4, v1, :cond_3

    .line 108
    .line 109
    iget-object v1, v0, Lh1/g;->k:Ljava/util/HashMap;

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    new-instance v1, Ljava/util/HashSet;

    .line 115
    .line 116
    iget-object v3, v0, Lh1/g;->l:Ljava/util/Set;

    .line 117
    .line 118
    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iput-object v1, v0, Lh1/g;->l:Ljava/util/Set;

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    iget-object v0, v0, Lh1/g;->k:Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    sub-int/2addr v3, v1

    .line 138
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :goto_1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->eventDispatchers:Lh1/g;

    .line 147
    .line 148
    invoke-virtual {v0, p1}, Lh1/g;->a(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_4

    .line 153
    .line 154
    invoke-virtual {p1}, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;->drmSessionReleased()V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    throw p1

    .line 160
    :cond_4
    :goto_3
    iget-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCountListener:Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;

    .line 161
    .line 162
    iget v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->referenceCount:I

    .line 163
    .line 164
    invoke-interface {p1, p0, v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession$ReferenceCountListener;->onReferenceCountDecremented(Landroidx/media3/exoplayer/drm/DefaultDrmSession;I)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public requiresSecureDecoder(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->verifyPlaybackThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->mediaDrm:Landroidx/media3/exoplayer/drm/ExoMediaDrm;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSession;->sessionId:[B

    .line 7
    .line 8
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, p1}, Landroidx/media3/exoplayer/drm/ExoMediaDrm;->requiresSecureDecoder([BLjava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method
