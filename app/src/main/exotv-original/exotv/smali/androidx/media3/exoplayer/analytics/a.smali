.class public final synthetic Landroidx/media3/exoplayer/analytics/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;
.implements Lh1/n;
.implements Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo$Factory;
.implements Lm0/o;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/analytics/a;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Landroidx/media3/common/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/media3/common/d1;

    .line 8
    .line 9
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 10
    .line 11
    invoke-static {v0, v1, p1, p2}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->z(Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener;Landroidx/media3/common/u;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public create(ILandroidx/media3/common/q1;[I)Ljava/util/List;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/analytics/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, p1, p2, p3}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->b(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;Ljava/lang/String;ILandroidx/media3/common/q1;[I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, [I

    .line 26
    .line 27
    invoke-static {v0, v1, p1, p2, p3}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->d(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;[IILandroidx/media3/common/q1;[I)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/analytics/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/media3/common/v1;

    .line 13
    .line 14
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->a(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/v1;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lg1/c;

    .line 27
    .line 28
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 29
    .line 30
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->k0(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Lg1/c;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Landroidx/media3/common/d2;

    .line 41
    .line 42
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 43
    .line 44
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->o(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/d2;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 51
    .line 52
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Landroidx/media3/common/q;

    .line 55
    .line 56
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 57
    .line 58
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->v(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/q;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_4
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 65
    .line 66
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 71
    .line 72
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->L(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/util/List;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_5
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Landroidx/media3/common/x1;

    .line 83
    .line 84
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 85
    .line 86
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->u(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/x1;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_6
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 93
    .line 94
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Landroidx/media3/common/t0;

    .line 97
    .line 98
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 99
    .line 100
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->D(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/t0;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_7
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 107
    .line 108
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Landroidx/media3/common/g;

    .line 111
    .line 112
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 113
    .line 114
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->h(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/g;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_8
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 121
    .line 122
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Landroidx/media3/common/z0;

    .line 125
    .line 126
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 127
    .line 128
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->c0(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/z0;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_9
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 135
    .line 136
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Landroidx/media3/common/y0;

    .line 139
    .line 140
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 141
    .line 142
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->H(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/y0;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 8

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/exotv/net/MovieDetailActivity;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/a;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    sget v1, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 10
    .line 11
    iget-object p2, p2, Lm0/r1;->a:Lm0/o1;

    .line 12
    .line 13
    const/16 v1, 0x287

    .line 14
    .line 15
    invoke-virtual {p2, v1}, Lm0/o1;->f(I)Le0/b;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p2, v1}, Lm0/o1;->f(I)Le0/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const v4, 0x7f050002

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    iget p2, v1, Le0/b;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 v1, 0x80

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Lm0/o1;->f(I)Le0/b;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget p2, p2, Le0/b;->b:I

    .line 46
    .line 47
    :goto_0
    iput p2, p1, Lcom/exotv/net/MovieDetailActivity;->U:I

    .line 48
    .line 49
    iget-object p2, p1, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    iget v3, v2, Le0/b;->a:I

    .line 55
    .line 56
    iget v4, v2, Le0/b;->d:I

    .line 57
    .line 58
    iget v5, v2, Le0/b;->c:I

    .line 59
    .line 60
    const/16 v6, 0x14

    .line 61
    .line 62
    invoke-virtual {p1, v6}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    add-int/2addr v6, v4

    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-virtual {p2, v3, v7, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 78
    .line 79
    iput v4, p2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 80
    .line 81
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p1, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 85
    .line 86
    const-string v0, "back"

    .line 87
    .line 88
    if-eqz p2, :cond_2

    .line 89
    .line 90
    iget v3, v2, Le0/b;->a:I

    .line 91
    .line 92
    int-to-float v3, v3

    .line 93
    invoke-virtual {p2, v3}, Landroid/view/View;->setTranslationX(F)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 97
    .line 98
    if-eqz p1, :cond_1

    .line 99
    .line 100
    iget p2, v2, Le0/b;->b:I

    .line 101
    .line 102
    int-to-float p2, p2

    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 104
    .line 105
    .line 106
    sget-object p1, Lm0/r1;->b:Lm0/r1;

    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_1
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :cond_2
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1

    .line 117
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 118
    .line 119
    const-string p2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 120
    .line 121
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_4
    const-string p1, "body"

    .line 126
    .line 127
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v1
.end method
