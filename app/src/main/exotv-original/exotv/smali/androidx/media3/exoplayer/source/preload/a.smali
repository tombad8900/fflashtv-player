.class public final synthetic Landroidx/media3/exoplayer/source/preload/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;
.implements Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo$Factory;
.implements Landroidx/media3/exoplayer/trackselection/TrackSelectionUtil$AdaptiveTrackSelectionFactory;
.implements Ls5/a;
.implements Lh1/f;
.implements Lm0/o;
.implements Lokhttp3/w;
.implements Ln1/g;
.implements Li1/r;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/source/preload/a;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(JLh1/w;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La4/c;

    .line 4
    .line 5
    iget-object v0, v0, La4/c;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, [Ln1/i0;

    .line 8
    .line 9
    invoke-static {p1, p2, p3, v0}, Ln1/b;->e(JLh1/w;[Ln1/i0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/source/preload/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lf6/j0;

    .line 9
    .line 10
    check-cast p1, Lk2/c;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lk2/l;

    .line 19
    .line 20
    check-cast p1, Lk2/c;

    .line 21
    .line 22
    new-instance v1, Lk2/k;

    .line 23
    .line 24
    iget-wide v2, p1, Lk2/c;->b:J

    .line 25
    .line 26
    iget-object v4, p1, Lk2/c;->a:Lf6/m0;

    .line 27
    .line 28
    iget-wide v5, p1, Lk2/c;->c:J

    .line 29
    .line 30
    invoke-static {v4, v5, v6}, Lk2/b;->o(Lf6/m0;J)[B

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-direct {v1, v2, v3, v4}, Lk2/k;-><init>(J[B)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lk2/l;->c:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-wide v2, v0, Lk2/l;->j:J

    .line 43
    .line 44
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long v4, v2, v4

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    iget-wide v4, p1, Lk2/c;->b:J

    .line 54
    .line 55
    cmp-long p1, v4, v2

    .line 56
    .line 57
    if-ltz p1, :cond_1

    .line 58
    .line 59
    :cond_0
    invoke-virtual {v0, v1}, Lk2/l;->a(Lk2/k;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb6/c0;

    .line 4
    .line 5
    iget-object v1, v0, Lb6/c0;->m:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    iget-object v0, v0, Lb6/c0;->r:Landroid/view/View$OnLongClickListener;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1, v0, v2}, Lb6/v;->s(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c(Ll/o;ILandroid/os/Bundle;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm/v;

    .line 4
    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x19

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-lt v1, v2, :cond_1

    .line 12
    .line 13
    and-int/2addr p2, v4

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p1, Ll/o;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lo0/f;

    .line 19
    .line 20
    invoke-interface {p2}, Lo0/f;->j()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object p2, p1, Ll/o;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, Lo0/f;

    .line 26
    .line 27
    invoke-interface {p2}, Lo0/f;->o()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroid/os/Parcelable;

    .line 32
    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    new-instance p3, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v2, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    move-object p3, v2

    .line 47
    :goto_0
    const-string v2, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 48
    .line 49
    invoke-virtual {p3, v2, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    const-string p2, "InputConnectionCompat"

    .line 55
    .line 56
    const-string p3, "Can\'t insert content from IME; requestPermission() failed"

    .line 57
    .line 58
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    return v3

    .line 62
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 63
    .line 64
    iget-object p1, p1, Ll/o;->j:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lo0/f;

    .line 67
    .line 68
    invoke-interface {p1}, Lo0/f;->getDescription()Landroid/content/ClipDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v5, Landroid/content/ClipData$Item;

    .line 73
    .line 74
    invoke-interface {p1}, Lo0/f;->i()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-direct {v5, v6}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v2, v5}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 82
    .line 83
    .line 84
    const/16 v2, 0x1f

    .line 85
    .line 86
    const/4 v5, 0x2

    .line 87
    if-lt v1, v2, :cond_2

    .line 88
    .line 89
    new-instance v1, Lm0/d;

    .line 90
    .line 91
    invoke-direct {v1, p2, v5}, Lm0/d;-><init>(Landroid/content/ClipData;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    new-instance v1, Lm0/f;

    .line 96
    .line 97
    invoke-direct {v1}, Lm0/f;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, v1, Lm0/f;->b:Landroid/content/ClipData;

    .line 101
    .line 102
    iput v5, v1, Lm0/f;->c:I

    .line 103
    .line 104
    :goto_2
    invoke-interface {p1}, Lo0/f;->k()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {v1, p1}, Lm0/e;->b(Landroid/net/Uri;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1, p3}, Lm0/e;->setExtras(Landroid/os/Bundle;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Lm0/e;->build()Lm0/h;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v0, p1}, Lm0/m0;->i(Lm/v;Lm0/h;)Lm0/h;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    return v4

    .line 125
    :cond_3
    return v3
.end method

.method public create(ILandroidx/media3/common/q1;[I)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    invoke-static {v0, p1, p2, p3}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->a(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;ILandroidx/media3/common/q1;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public create(Lokhttp3/g;)Lokhttp3/v;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    check-cast v0, Lokhttp3/v;

    invoke-static {v0, p1}, Lq7/c;->a(Lokhttp3/v;Lokhttp3/g;)Lokhttp3/v;

    move-result-object p1

    return-object p1
.end method

.method public createAdaptiveTrackSelection(Landroidx/media3/exoplayer/trackselection/ExoTrackSelection$Definition;)Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/trackselection/RandomTrackSelection$Factory;

    .line 4
    .line 5
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/trackselection/RandomTrackSelection$Factory;->a(Landroidx/media3/exoplayer/trackselection/RandomTrackSelection$Factory;Landroidx/media3/exoplayer/trackselection/ExoTrackSelection$Definition;)Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public d(J)J
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln1/t;

    .line 4
    .line 5
    iget v1, v0, Ln1/t;->e:I

    .line 6
    .line 7
    int-to-long v1, v1

    .line 8
    mul-long/2addr p1, v1

    .line 9
    const-wide/32 v1, 0xf4240

    .line 10
    .line 11
    .line 12
    div-long v3, p1, v1

    .line 13
    .line 14
    iget-wide p1, v0, Ln1/t;->j:J

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    sub-long v7, p1, v0

    .line 19
    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    invoke-static/range {v3 .. v8}, Lh1/i0;->k(JJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/source/preload/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/source/preload/PreloadException;

    .line 9
    .line 10
    check-cast p1, Landroidx/media3/exoplayer/source/preload/BasePreloadManager$Listener;

    .line 11
    .line 12
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/source/preload/BasePreloadManager;->e(Landroidx/media3/exoplayer/source/preload/PreloadException;Landroidx/media3/exoplayer/source/preload/BasePreloadManager$Listener;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/media3/exoplayer/source/MediaSource;

    .line 19
    .line 20
    check-cast p1, Landroidx/media3/exoplayer/source/preload/BasePreloadManager$Listener;

    .line 21
    .line 22
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/source/preload/BasePreloadManager;->a(Landroidx/media3/exoplayer/source/MediaSource;Landroidx/media3/exoplayer/source/preload/BasePreloadManager$Listener;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 6

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lp0/d;

    .line 4
    .line 5
    iget-object v0, p1, Lp0/d;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p2, Lm0/r1;->a:Lm0/o1;

    .line 8
    .line 9
    const/16 v2, 0x207

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lm0/o1;->f(I)Le0/b;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/16 v4, 0x40

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Lm0/o1;->f(I)Le0/b;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v3, v5}, Le0/b;->b(Le0/b;Le0/b;)Le0/b;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v1, v2}, Lm0/o1;->g(I)Le0/b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v4}, Lm0/o1;->g(I)Le0/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v2, v1}, Le0/b;->b(Le0/b;Le0/b;)Le0/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p1, Lp0/d;->c:Le0/b;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Le0/b;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    iget-object v2, p1, Lp0/d;->d:Le0/b;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Le0/b;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    :cond_0
    iput-object v3, p1, Lp0/d;->c:Le0/b;

    .line 54
    .line 55
    iput-object v1, p1, Lp0/d;->d:Le0/b;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    add-int/lit8 p1, p1, -0x1

    .line 62
    .line 63
    :goto_0
    if-ltz p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lp0/a;

    .line 70
    .line 71
    iget-object v1, v1, Lp0/a;->a:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    add-int/lit8 v2, v2, -0x1

    .line 78
    .line 79
    if-gez v2, :cond_1

    .line 80
    .line 81
    add-int/lit8 p1, p1, -0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-static {v2, v1}, La1/a1;->f(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    throw p1

    .line 89
    :cond_2
    return-object p2
.end method
