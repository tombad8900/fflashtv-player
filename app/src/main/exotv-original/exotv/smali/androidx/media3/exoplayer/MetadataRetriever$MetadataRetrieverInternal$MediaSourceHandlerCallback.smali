.class final Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MediaSourceHandlerCallback"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller;
    }
.end annotation


# static fields
.field private static final ERROR_POLL_INTERVAL_MS:I = 0x64


# instance fields
.field private mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

.field private mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

.field private final mediaSourceCaller:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller;

.field final synthetic this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller;-><init>(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaSourceCaller:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic access$500(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;)Landroidx/media3/exoplayer/source/MediaPeriod;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$502(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;Landroidx/media3/exoplayer/source/MediaPeriod;)Landroidx/media3/exoplayer/source/MediaPeriod;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v3, :cond_5

    .line 7
    .line 8
    const/4 p1, 0x4

    .line 9
    if-eq v0, v2, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    if-eq v0, p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 28
    .line 29
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/source/MediaSource;->releasePeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaSourceCaller:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller;

    .line 38
    .line 39
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/source/MediaSource;->releaseSource(Landroidx/media3/exoplayer/source/MediaSource$MediaSourceCaller;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->access$100(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Lh1/k;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lh1/b0;

    .line 49
    .line 50
    iget-object p1, p1, Lh1/b0;->a:Landroid/os/Handler;

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->access$300()Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;->removeWorker()V

    .line 60
    .line 61
    .line 62
    return v3

    .line 63
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v0, Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 69
    .line 70
    invoke-direct {v0}, Landroidx/media3/exoplayer/LoadingInfo$Builder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-wide/16 v1, 0x0

    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->setPlaybackPositionUs(J)Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->build()Landroidx/media3/exoplayer/LoadingInfo;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/source/MediaPeriod;->continueLoading(Landroidx/media3/exoplayer/LoadingInfo;)Z

    .line 84
    .line 85
    .line 86
    return v3

    .line 87
    :cond_3
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 88
    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/MediaSource;->maybeThrowSourceInfoRefreshError()V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/MediaPeriod;->maybeThrowPrepareError()V

    .line 103
    .line 104
    .line 105
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    .line 106
    .line 107
    invoke-static {v0}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->access$100(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Lh1/k;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Lh1/b0;

    .line 112
    .line 113
    iget-object v0, v0, Lh1/b0;->a:Landroid/os/Handler;

    .line 114
    .line 115
    const/16 v1, 0x64

    .line 116
    .line 117
    int-to-long v4, v1

    .line 118
    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    return v3

    .line 122
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    .line 123
    .line 124
    invoke-static {v1}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->access$200(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Lj6/t;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1, v0}, Lj6/t;->k(Ljava/lang/Throwable;)Z

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    .line 132
    .line 133
    invoke-static {v0}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->access$100(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Lh1/k;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lh1/b0;

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Lh1/b0;->a(I)Lh1/a0;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 144
    .line 145
    .line 146
    return v3

    .line 147
    :cond_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, Landroidx/media3/common/o0;

    .line 150
    .line 151
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    .line 152
    .line 153
    invoke-static {v0}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->access$000(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/source/MediaSource$Factory;->createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/MediaSource;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

    .line 162
    .line 163
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->mediaSourceCaller:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller;

    .line 164
    .line 165
    sget-object v4, Landroidx/media3/exoplayer/analytics/PlayerId;->UNSET:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 166
    .line 167
    invoke-interface {p1, v0, v1, v4}, Landroidx/media3/exoplayer/source/MediaSource;->prepareSource(Landroidx/media3/exoplayer/source/MediaSource$MediaSourceCaller;Lk1/c0;Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 168
    .line 169
    .line 170
    iget-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;->this$0:Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    .line 171
    .line 172
    invoke-static {p1}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->access$100(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Lh1/k;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, Lh1/b0;

    .line 177
    .line 178
    invoke-virtual {p1, v2}, Lh1/b0;->g(I)Z

    .line 179
    .line 180
    .line 181
    return v3
.end method
