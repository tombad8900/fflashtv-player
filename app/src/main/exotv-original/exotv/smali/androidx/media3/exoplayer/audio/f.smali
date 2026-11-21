.class public final synthetic Landroidx/media3/exoplayer/audio/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/media3/exoplayer/audio/f;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/f;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/media3/exoplayer/audio/f;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Landroidx/media3/exoplayer/audio/f;->m:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/audio/f;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/f;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw2/z;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/f;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/view/SurfaceView;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/f;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/lifecycle/c0;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lw2/z;->a(Lw2/z;Landroid/view/SurfaceView;Landroidx/lifecycle/c0;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/f;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lc4/e;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/f;->l:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lt2/i0;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/f;->m:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 33
    .line 34
    :try_start_0
    iget-object v0, v0, Lc4/e;->k:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v0}, Lt2/w;->c(Landroid/content/Context;)Lv0/r;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object v3, v0, Lv0/f;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Lv0/i;

    .line 45
    .line 46
    check-cast v3, Lv0/q;

    .line 47
    .line 48
    iget-object v4, v3, Lv0/q;->m:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :try_start_1
    iput-object v2, v3, Lv0/q;->o:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 52
    .line 53
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    :try_start_2
    iget-object v0, v0, Lv0/f;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lv0/i;

    .line 57
    .line 58
    new-instance v3, Lv0/l;

    .line 59
    .line 60
    invoke-direct {v3, v1, v2}, Lv0/l;-><init>(Lt2/i0;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v3}, Lv0/i;->a(Lt2/i0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_0

    .line 69
    :catchall_1
    move-exception v0

    .line 70
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 71
    :try_start_4
    throw v0

    .line 72
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 73
    .line 74
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 75
    .line 76
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 80
    :goto_0
    invoke-virtual {v1, v0}, Lt2/i0;->u(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 84
    .line 85
    .line 86
    :goto_1
    return-void

    .line 87
    :pswitch_1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/f;->k:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Landroidx/media3/exoplayer/source/preload/BasePreloadManager;

    .line 90
    .line 91
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/f;->l:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Landroidx/media3/exoplayer/source/preload/PreloadException;

    .line 94
    .line 95
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/f;->m:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Landroidx/media3/exoplayer/source/MediaSource;

    .line 98
    .line 99
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/source/preload/BasePreloadManager;->d(Landroidx/media3/exoplayer/source/preload/BasePreloadManager;Landroidx/media3/exoplayer/source/preload/PreloadException;Landroidx/media3/exoplayer/source/MediaSource;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_2
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/f;->k:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;

    .line 106
    .line 107
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/f;->l:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Landroidx/media3/exoplayer/drm/DrmSessionEventListener;

    .line 110
    .line 111
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/f;->m:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Ljava/lang/Exception;

    .line 114
    .line 115
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;->e(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Landroidx/media3/exoplayer/drm/DrmSessionEventListener;Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_3
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/f;->k:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 122
    .line 123
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/f;->l:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, Landroidx/media3/common/w;

    .line 126
    .line 127
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/f;->m:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Landroidx/media3/exoplayer/DecoderReuseEvaluation;

    .line 130
    .line 131
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->h(Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;Landroidx/media3/common/w;Landroidx/media3/exoplayer/DecoderReuseEvaluation;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
