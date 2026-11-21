.class public final synthetic Landroidx/media3/exoplayer/drm/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Landroidx/media3/exoplayer/drm/f;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/media3/exoplayer/drm/f;->k:I

    iput-object p2, p0, Landroidx/media3/exoplayer/drm/f;->l:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/media3/exoplayer/drm/f;->m:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Landroidx/media3/exoplayer/drm/DrmSessionEventListener;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Landroidx/media3/exoplayer/drm/f;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/drm/f;->l:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/media3/exoplayer/drm/f;->m:Ljava/lang/Object;

    iput p3, p0, Landroidx/media3/exoplayer/drm/f;->k:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Landroidx/media3/exoplayer/drm/f;->j:I

    iput-object p1, p0, Landroidx/media3/exoplayer/drm/f;->l:Ljava/lang/Object;

    iput p2, p0, Landroidx/media3/exoplayer/drm/f;->k:I

    iput-object p3, p0, Landroidx/media3/exoplayer/drm/f;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/drm/f;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/f;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lx2/a;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/f;->m:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, Lx2/a;->b:Lx2/c;

    .line 13
    .line 14
    iget v2, p0, Landroidx/media3/exoplayer/drm/f;->k:I

    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Lx2/c;->j(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/f;->l:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/f;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lcom/exotv/net/MainActivity;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    iget v3, p0, Landroidx/media3/exoplayer/drm/f;->k:I

    .line 30
    .line 31
    invoke-static {v3, v2, v0, v1}, Lcom/exotv/net/MainActivity;->y(IILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/f;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/f;->m:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lh1/m;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lh1/o;

    .line 58
    .line 59
    iget-boolean v3, v2, Lh1/o;->d:Z

    .line 60
    .line 61
    if-nez v3, :cond_0

    .line 62
    .line 63
    const/4 v3, -0x1

    .line 64
    iget v4, p0, Landroidx/media3/exoplayer/drm/f;->k:I

    .line 65
    .line 66
    if-eq v4, v3, :cond_1

    .line 67
    .line 68
    iget-object v3, v2, Lh1/o;->b:La4/j0;

    .line 69
    .line 70
    invoke-virtual {v3, v4}, La4/j0;->a(I)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 v3, 0x1

    .line 74
    iput-boolean v3, v2, Lh1/o;->c:Z

    .line 75
    .line 76
    iget-object v2, v2, Lh1/o;->a:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-interface {v1, v2}, Lh1/m;->invoke(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    return-void

    .line 83
    :pswitch_2
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/f;->l:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;

    .line 86
    .line 87
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/f;->m:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Landroidx/media3/exoplayer/drm/DrmSessionEventListener;

    .line 90
    .line 91
    iget v2, p0, Landroidx/media3/exoplayer/drm/f;->k:I

    .line 92
    .line 93
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;->c(Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Landroidx/media3/exoplayer/drm/DrmSessionEventListener;I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
