.class public final Lcom/exotv/net/PlayerActivity;
.super Lh/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final synthetic z0:I


# instance fields
.field public H:La5/b;

.field public I:Landroidx/media3/exoplayer/ExoPlayer;

.field public final J:Landroid/os/Handler;

.field public final K:Lw4/g0;

.field public L:Ljava/util/List;

.field public M:I

.field public N:Z

.field public final O:Lc5/b1;

.field public P:Z

.field public Q:J

.field public R:Z

.field public S:Ljava/lang/String;

.field public final T:Lw4/n0;

.field public final U:Lw4/g0;

.field public final V:Lw4/g0;

.field public final W:Lw4/g0;

.field public final X:Ljava/util/HashMap;

.field public Y:Ljava/lang/String;

.field public Z:Ljava/lang/String;

.field public a0:I

.field public b0:Li7/a0;

.field public c0:Ljava/lang/String;

.field public d0:I

.field public e0:I

.field public f0:I

.field public final g0:Ljava/util/List;

.field public final h0:Ljava/util/LinkedHashMap;

.field public i0:Ljava/lang/String;

.field public j0:Ljava/lang/String;

.field public k0:Z

.field public l0:Z

.field public final m0:Lw4/g0;

.field public n0:Ljava/util/List;

.field public o0:Landroid/widget/TextView;

.field public p0:Ljava/util/List;

.field public q0:Ljava/lang/Integer;

.field public r0:Landroid/widget/TextView;

.field public s0:Landroid/widget/TextView;

.field public t0:Landroid/view/View;

.field public u0:Lw4/k0;

.field public final v0:Lw4/n0;

.field public final w0:Lw4/n0;

.field public x0:Ljava/lang/String;

.field public y0:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lh/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lw4/g0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, v1}, Lw4/g0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->K:Lw4/g0;

    .line 22
    .line 23
    sget-object v0, Lm6/p;->j:Lm6/p;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 26
    .line 27
    new-instance v1, Lc5/b1;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    iput v2, v1, Lc5/b1;->a:I

    .line 34
    .line 35
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 36
    .line 37
    const-wide/16 v1, -0x1

    .line 38
    .line 39
    iput-wide v1, p0, Lcom/exotv/net/PlayerActivity;->Q:J

    .line 40
    .line 41
    new-instance v1, Lw4/n0;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {v1, p0, v2}, Lw4/n0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->T:Lw4/n0;

    .line 48
    .line 49
    new-instance v1, Lw4/g0;

    .line 50
    .line 51
    invoke-direct {v1, p0, v2}, Lw4/g0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->U:Lw4/g0;

    .line 55
    .line 56
    new-instance v1, Lw4/g0;

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    invoke-direct {v1, p0, v2}, Lw4/g0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->V:Lw4/g0;

    .line 63
    .line 64
    new-instance v1, Lw4/g0;

    .line 65
    .line 66
    const/4 v2, 0x4

    .line 67
    invoke-direct {v1, p0, v2}, Lw4/g0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->W:Lw4/g0;

    .line 71
    .line 72
    new-instance v1, Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->X:Ljava/util/HashMap;

    .line 78
    .line 79
    const/4 v1, -0x1

    .line 80
    iput v1, p0, Lcom/exotv/net/PlayerActivity;->d0:I

    .line 81
    .line 82
    iput v1, p0, Lcom/exotv/net/PlayerActivity;->e0:I

    .line 83
    .line 84
    iput v1, p0, Lcom/exotv/net/PlayerActivity;->f0:I

    .line 85
    .line 86
    new-instance v2, Lw4/m0;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    const v3, 0x7f11012c

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v1, v3}, Lw4/m0;-><init>(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Lw4/m0;

    .line 96
    .line 97
    const-string v1, "ara"

    .line 98
    .line 99
    const v4, 0x7f110129

    .line 100
    .line 101
    .line 102
    invoke-direct {v3, v1, v4}, Lw4/m0;-><init>(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    new-instance v4, Lw4/m0;

    .line 106
    .line 107
    const-string v1, "eng"

    .line 108
    .line 109
    const v5, 0x7f11012a

    .line 110
    .line 111
    .line 112
    invoke-direct {v4, v1, v5}, Lw4/m0;-><init>(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    new-instance v5, Lw4/m0;

    .line 116
    .line 117
    const-string v1, "fre"

    .line 118
    .line 119
    const v6, 0x7f11012b

    .line 120
    .line 121
    .line 122
    invoke-direct {v5, v1, v6}, Lw4/m0;-><init>(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    new-instance v6, Lw4/m0;

    .line 126
    .line 127
    const-string v1, "por"

    .line 128
    .line 129
    const v7, 0x7f11012e

    .line 130
    .line 131
    .line 132
    invoke-direct {v6, v1, v7}, Lw4/m0;-><init>(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    new-instance v7, Lw4/m0;

    .line 136
    .line 137
    const-string v1, "pob"

    .line 138
    .line 139
    const v8, 0x7f11012d

    .line 140
    .line 141
    .line 142
    invoke-direct {v7, v1, v8}, Lw4/m0;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    new-instance v8, Lw4/m0;

    .line 146
    .line 147
    const-string v1, "spa"

    .line 148
    .line 149
    const v9, 0x7f11012f

    .line 150
    .line 151
    .line 152
    invoke-direct {v8, v1, v9}, Lw4/m0;-><init>(Ljava/lang/String;I)V

    .line 153
    .line 154
    .line 155
    filled-new-array/range {v2 .. v8}, [Lw4/m0;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->g0:Ljava/util/List;

    .line 164
    .line 165
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->h0:Ljava/util/LinkedHashMap;

    .line 171
    .line 172
    new-instance v1, Lw4/g0;

    .line 173
    .line 174
    const/4 v2, 0x5

    .line 175
    invoke-direct {v1, p0, v2}, Lw4/g0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 176
    .line 177
    .line 178
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->m0:Lw4/g0;

    .line 179
    .line 180
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 181
    .line 182
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->p0:Ljava/util/List;

    .line 183
    .line 184
    new-instance v0, Lw4/n0;

    .line 185
    .line 186
    const/4 v1, 0x1

    .line 187
    invoke-direct {v0, p0, v1}, Lw4/n0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 188
    .line 189
    .line 190
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->v0:Lw4/n0;

    .line 191
    .line 192
    new-instance v0, Lw4/n0;

    .line 193
    .line 194
    const/4 v1, 0x0

    .line 195
    invoke-direct {v0, p0, v1}, Lw4/n0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 196
    .line 197
    .line 198
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->w0:Lw4/n0;

    .line 199
    .line 200
    sget-object v0, Lm6/q;->j:Lm6/q;

    .line 201
    .line 202
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->y0:Ljava/util/Map;

    .line 203
    .line 204
    return-void
.end method

.method public static C(J)Ljava/lang/String;
    .locals 6

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    div-long/2addr p0, v0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p0, v0

    .line 8
    .line 9
    if-gez v2, :cond_0

    .line 10
    .line 11
    move-wide p0, v0

    .line 12
    :cond_0
    const/16 v0, 0xe10

    .line 13
    .line 14
    int-to-long v0, v0

    .line 15
    div-long v2, p0, v0

    .line 16
    .line 17
    rem-long v0, p0, v0

    .line 18
    .line 19
    const/16 v4, 0x3c

    .line 20
    .line 21
    int-to-long v4, v4

    .line 22
    div-long/2addr v0, v4

    .line 23
    rem-long/2addr p0, v4

    .line 24
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 25
    .line 26
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    filled-new-array {v2, v0, p0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 p1, 0x3

    .line 43
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "%d:%02d:%02d"

    .line 48
    .line 49
    invoke-static {v4, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static final r(Lcom/exotv/net/PlayerActivity;Ljava/lang/String;Z)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lx4/v;->a:Lx4/v;

    .line 8
    .line 9
    sget-object v3, Lx4/v;->g:Lh7/f;

    .line 10
    .line 11
    sget-object v4, Lx4/v;->d:Lh7/f;

    .line 12
    .line 13
    sget-object v5, Lx4/v;->f:Lh7/f;

    .line 14
    .line 15
    const-string v6, "body"

    .line 16
    .line 17
    invoke-static {v6, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string v7, "\ufeff"

    .line 21
    .line 22
    invoke-static {v1, v7}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v8, "\r\n"

    .line 27
    .line 28
    const-string v9, "\n"

    .line 29
    .line 30
    invoke-static {v1, v8, v9}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/16 v10, 0xd

    .line 35
    .line 36
    const/16 v11, 0xa

    .line 37
    .line 38
    invoke-static {v1, v10, v11}, Lh7/p;->q0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v12, 0x1

    .line 43
    new-array v13, v12, [C

    .line 44
    .line 45
    const/4 v14, 0x0

    .line 46
    aput-char v11, v13, v14

    .line 47
    .line 48
    invoke-static {v1, v13}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    const/16 v16, -0x1

    .line 57
    .line 58
    const-string v10, "matcher(...)"

    .line 59
    .line 60
    const-string v11, "input"

    .line 61
    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    if-eqz v15, :cond_0

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_0
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    :cond_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v20

    .line 76
    if-eqz v20, :cond_9

    .line 77
    .line 78
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v20

    .line 82
    check-cast v20, Ljava/lang/String;

    .line 83
    .line 84
    invoke-static/range {v20 .. v20}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 85
    .line 86
    .line 87
    move-result-object v20

    .line 88
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    invoke-virtual {v5, v14}, Lh7/f;->c(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    if-eqz v14, :cond_1

    .line 97
    .line 98
    new-instance v1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-wide/high16 v6, 0x4039000000000000L    # 25.0

    .line 108
    .line 109
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_8

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    check-cast v8, Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v8}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-static {v11, v8}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v13, v5, Lh7/f;->j:Ljava/util/regex/Pattern;

    .line 133
    .line 134
    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    invoke-static {v10, v13}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->matches()Z

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    if-nez v14, :cond_2

    .line 146
    .line 147
    move-object/from16 v14, v18

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_2
    new-instance v14, La1/e;

    .line 151
    .line 152
    invoke-direct {v14, v13, v8}, La1/e;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    :goto_1
    if-nez v14, :cond_3

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_3
    invoke-virtual {v14}, La1/e;->A()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    check-cast v8, Lh7/e;

    .line 163
    .line 164
    invoke-virtual {v8, v12}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    check-cast v8, Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v14}, La1/e;->A()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    check-cast v13, Lh7/e;

    .line 175
    .line 176
    const/4 v15, 0x2

    .line 177
    invoke-virtual {v13, v15}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    check-cast v13, Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v14}, La1/e;->A()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    check-cast v14, Lh7/e;

    .line 188
    .line 189
    const/4 v15, 0x3

    .line 190
    invoke-virtual {v14, v15}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    check-cast v14, Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v14}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    const-string v12, "<this>"

    .line 205
    .line 206
    invoke-static {v12, v15}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :try_start_0
    invoke-static {v15}, Lh7/n;->i0(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-eqz v12, :cond_4

    .line 214
    .line 215
    invoke-static {v15}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 216
    .line 217
    .line 218
    move-result-wide v21

    .line 219
    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 220
    .line 221
    .line 222
    move-result-object v12
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    goto :goto_2

    .line 224
    :catch_0
    :cond_4
    move-object/from16 v12, v18

    .line 225
    .line 226
    :goto_2
    invoke-static {v8, v13}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    if-eqz v15, :cond_6

    .line 231
    .line 232
    if-eqz v12, :cond_6

    .line 233
    .line 234
    invoke-virtual {v12}, Ljava/lang/Number;->doubleValue()D

    .line 235
    .line 236
    .line 237
    move-result-wide v21

    .line 238
    const-wide/high16 v23, 0x3ff0000000000000L    # 1.0

    .line 239
    .line 240
    cmpl-double v15, v21, v23

    .line 241
    .line 242
    if-ltz v15, :cond_6

    .line 243
    .line 244
    const-wide v23, 0x405e400000000000L    # 121.0

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    cmpg-double v15, v21, v23

    .line 250
    .line 251
    if-gtz v15, :cond_6

    .line 252
    .line 253
    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    .line 254
    .line 255
    .line 256
    move-result-wide v6

    .line 257
    :cond_5
    :goto_3
    const/4 v12, 0x1

    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_6
    invoke-virtual {v4, v14}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    const-string v14, "|"

    .line 265
    .line 266
    invoke-static {v12, v14, v9}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    invoke-static {v12}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v22

    .line 278
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    if-nez v12, :cond_7

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_7
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 286
    .line 287
    .line 288
    move-result-wide v14

    .line 289
    const-wide v23, 0x408f400000000000L    # 1000.0

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    mul-double v14, v14, v23

    .line 295
    .line 296
    div-double/2addr v14, v6

    .line 297
    double-to-long v14, v14

    .line 298
    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 299
    .line 300
    .line 301
    move-result-wide v12

    .line 302
    mul-double v12, v12, v23

    .line 303
    .line 304
    div-double/2addr v12, v6

    .line 305
    double-to-long v12, v12

    .line 306
    cmp-long v8, v12, v14

    .line 307
    .line 308
    if-lez v8, :cond_5

    .line 309
    .line 310
    new-instance v21, Lx4/s;

    .line 311
    .line 312
    move-wide/from16 v25, v12

    .line 313
    .line 314
    move-wide/from16 v23, v14

    .line 315
    .line 316
    invoke-direct/range {v21 .. v26}, Lx4/s;-><init>(Ljava/lang/String;JJ)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v8, v21

    .line 320
    .line 321
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_8
    new-instance v3, Lx4/q;

    .line 326
    .line 327
    const/4 v4, 0x1

    .line 328
    invoke-direct {v3, v4}, Lx4/q;-><init>(I)V

    .line 329
    .line 330
    .line 331
    invoke-static {v1, v3}, Lm6/h;->J0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    :goto_4
    const/4 v10, 0x0

    .line 336
    goto/16 :goto_f

    .line 337
    .line 338
    :cond_9
    :goto_5
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    if-eqz v5, :cond_a

    .line 343
    .line 344
    goto/16 :goto_a

    .line 345
    .line 346
    :cond_a
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v12

    .line 354
    if-eqz v12, :cond_13

    .line 355
    .line 356
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    check-cast v12, Ljava/lang/String;

    .line 361
    .line 362
    invoke-static {v12}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 363
    .line 364
    .line 365
    move-result-object v12

    .line 366
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    invoke-virtual {v3, v12}, Lh7/f;->c(Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    if-eqz v12, :cond_b

    .line 375
    .line 376
    new-instance v1, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 379
    .line 380
    .line 381
    new-instance v5, Lz6/n;

    .line 382
    .line 383
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 384
    .line 385
    .line 386
    new-instance v6, Lz6/m;

    .line 387
    .line 388
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 389
    .line 390
    .line 391
    new-instance v7, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    if-eqz v9, :cond_12

    .line 405
    .line 406
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v9

    .line 410
    check-cast v9, Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v9}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v9

    .line 420
    invoke-static {v11, v9}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    iget-object v12, v3, Lh7/f;->j:Ljava/util/regex/Pattern;

    .line 424
    .line 425
    invoke-virtual {v12, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    invoke-static {v10, v12}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 433
    .line 434
    .line 435
    move-result v13

    .line 436
    if-nez v13, :cond_c

    .line 437
    .line 438
    move-object/from16 v13, v18

    .line 439
    .line 440
    goto :goto_7

    .line 441
    :cond_c
    new-instance v13, La1/e;

    .line 442
    .line 443
    invoke-direct {v13, v12, v9}, La1/e;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 444
    .line 445
    .line 446
    :goto_7
    if-eqz v13, :cond_e

    .line 447
    .line 448
    invoke-static {v5, v7, v6, v1}, Lx4/v;->b(Lz6/n;Ljava/lang/StringBuilder;Lz6/m;Ljava/util/ArrayList;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    check-cast v9, Lh7/e;

    .line 456
    .line 457
    const/4 v12, 0x1

    .line 458
    invoke-virtual {v9, v12}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v9

    .line 462
    check-cast v9, Ljava/lang/String;

    .line 463
    .line 464
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v12

    .line 468
    check-cast v12, Lh7/e;

    .line 469
    .line 470
    const/4 v15, 0x2

    .line 471
    invoke-virtual {v12, v15}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v12

    .line 475
    check-cast v12, Ljava/lang/String;

    .line 476
    .line 477
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v14

    .line 481
    check-cast v14, Lh7/e;

    .line 482
    .line 483
    const/4 v15, 0x3

    .line 484
    invoke-virtual {v14, v15}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v14

    .line 488
    check-cast v14, Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 491
    .line 492
    .line 493
    move-result-object v15

    .line 494
    move-object/from16 v21, v3

    .line 495
    .line 496
    const/4 v3, 0x4

    .line 497
    check-cast v15, Lh7/e;

    .line 498
    .line 499
    invoke-virtual {v15, v3}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    check-cast v3, Ljava/lang/String;

    .line 504
    .line 505
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v15

    .line 509
    move-object/from16 p1, v8

    .line 510
    .line 511
    const/4 v8, 0x5

    .line 512
    check-cast v15, Lh7/e;

    .line 513
    .line 514
    invoke-virtual {v15, v8}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    check-cast v8, Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v15

    .line 524
    move-object/from16 v22, v10

    .line 525
    .line 526
    const/4 v10, 0x6

    .line 527
    check-cast v15, Lh7/e;

    .line 528
    .line 529
    invoke-virtual {v15, v10}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v10

    .line 533
    check-cast v10, Ljava/lang/String;

    .line 534
    .line 535
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v15

    .line 539
    move-object/from16 v23, v11

    .line 540
    .line 541
    const/4 v11, 0x7

    .line 542
    check-cast v15, Lh7/e;

    .line 543
    .line 544
    invoke-virtual {v15, v11}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v11

    .line 548
    check-cast v11, Ljava/lang/String;

    .line 549
    .line 550
    invoke-virtual {v13}, La1/e;->A()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v13

    .line 554
    const/16 v15, 0x8

    .line 555
    .line 556
    check-cast v13, Lh7/e;

    .line 557
    .line 558
    invoke-virtual {v13, v15}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v13

    .line 562
    check-cast v13, Ljava/lang/String;

    .line 563
    .line 564
    invoke-static {v9, v12, v14, v3}, Lx4/v;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 565
    .line 566
    .line 567
    move-result-wide v14

    .line 568
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    iput-object v3, v5, Lz6/n;->j:Ljava/lang/Object;

    .line 573
    .line 574
    invoke-static {v8, v10, v11, v13}, Lx4/v;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 575
    .line 576
    .line 577
    move-result-wide v8

    .line 578
    iput-wide v8, v6, Lz6/m;->j:J

    .line 579
    .line 580
    :cond_d
    :goto_8
    move-object/from16 v8, p1

    .line 581
    .line 582
    move-object/from16 v3, v21

    .line 583
    .line 584
    move-object/from16 v10, v22

    .line 585
    .line 586
    move-object/from16 v11, v23

    .line 587
    .line 588
    goto/16 :goto_6

    .line 589
    .line 590
    :cond_e
    move-object/from16 v21, v3

    .line 591
    .line 592
    move-object/from16 p1, v8

    .line 593
    .line 594
    move-object/from16 v22, v10

    .line 595
    .line 596
    move-object/from16 v23, v11

    .line 597
    .line 598
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    if-nez v3, :cond_f

    .line 603
    .line 604
    goto :goto_9

    .line 605
    :cond_f
    const-string v3, "["

    .line 606
    .line 607
    const/4 v8, 0x0

    .line 608
    invoke-static {v9, v3, v8}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    if-eqz v3, :cond_10

    .line 613
    .line 614
    const-string v3, "]"

    .line 615
    .line 616
    invoke-static {v9, v3, v8}, Lh7/p;->m0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    if-eqz v3, :cond_10

    .line 621
    .line 622
    :goto_9
    invoke-static {v5, v7, v6, v1}, Lx4/v;->b(Lz6/n;Ljava/lang/StringBuilder;Lz6/m;Ljava/util/ArrayList;)V

    .line 623
    .line 624
    .line 625
    goto :goto_8

    .line 626
    :cond_10
    iget-object v3, v5, Lz6/n;->j:Ljava/lang/Object;

    .line 627
    .line 628
    if-eqz v3, :cond_d

    .line 629
    .line 630
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    .line 631
    .line 632
    .line 633
    move-result v3

    .line 634
    if-lez v3, :cond_11

    .line 635
    .line 636
    const/16 v3, 0xa

    .line 637
    .line 638
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    :cond_11
    invoke-virtual {v4, v9}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    invoke-static {v3}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v3

    .line 653
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    goto :goto_8

    .line 657
    :cond_12
    invoke-static {v5, v7, v6, v1}, Lx4/v;->b(Lz6/n;Ljava/lang/StringBuilder;Lz6/m;Ljava/util/ArrayList;)V

    .line 658
    .line 659
    .line 660
    new-instance v3, Lx4/q;

    .line 661
    .line 662
    const/4 v15, 0x3

    .line 663
    invoke-direct {v3, v15}, Lx4/q;-><init>(I)V

    .line 664
    .line 665
    .line 666
    invoke-static {v1, v3}, Lm6/h;->J0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    goto/16 :goto_4

    .line 671
    .line 672
    :cond_13
    :goto_a
    invoke-static {v1}, Lx4/v;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-static {v6, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    invoke-static {v1, v7}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-static {v1, v8, v9}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    const/16 v3, 0xd

    .line 688
    .line 689
    const/16 v4, 0xa

    .line 690
    .line 691
    invoke-static {v1, v3, v4}, Lh7/p;->q0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    new-instance v3, Ljava/util/ArrayList;

    .line 696
    .line 697
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 698
    .line 699
    .line 700
    sget-object v4, Lx4/v;->e:Lh7/f;

    .line 701
    .line 702
    invoke-virtual {v4, v1}, Lh7/f;->e(Ljava/lang/String;)Ljava/util/List;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    :cond_14
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    if-eqz v4, :cond_1a

    .line 715
    .line 716
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    check-cast v4, Ljava/lang/String;

    .line 721
    .line 722
    const/4 v12, 0x1

    .line 723
    new-array v5, v12, [C

    .line 724
    .line 725
    const/16 v17, 0xa

    .line 726
    .line 727
    const/16 v19, 0x0

    .line 728
    .line 729
    aput-char v17, v5, v19

    .line 730
    .line 731
    invoke-static {v4, v5}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    new-instance v5, Ljava/util/ArrayList;

    .line 736
    .line 737
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 738
    .line 739
    .line 740
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 741
    .line 742
    .line 743
    move-result-object v4

    .line 744
    :cond_15
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 745
    .line 746
    .line 747
    move-result v6

    .line 748
    if-eqz v6, :cond_16

    .line 749
    .line 750
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    move-object v7, v6

    .line 755
    check-cast v7, Ljava/lang/String;

    .line 756
    .line 757
    invoke-static {v7}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 758
    .line 759
    .line 760
    move-result v7

    .line 761
    if-nez v7, :cond_15

    .line 762
    .line 763
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    goto :goto_c

    .line 767
    :cond_16
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 768
    .line 769
    .line 770
    move-result v4

    .line 771
    if-nez v4, :cond_14

    .line 772
    .line 773
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    const/4 v6, 0x0

    .line 778
    const/4 v8, 0x0

    .line 779
    :goto_d
    const-string v7, "-->"

    .line 780
    .line 781
    if-ge v6, v4, :cond_18

    .line 782
    .line 783
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v9

    .line 787
    add-int/lit8 v6, v6, 0x1

    .line 788
    .line 789
    check-cast v9, Ljava/lang/String;

    .line 790
    .line 791
    const/4 v10, 0x0

    .line 792
    invoke-static {v9, v7, v10}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 793
    .line 794
    .line 795
    move-result v9

    .line 796
    if-eqz v9, :cond_17

    .line 797
    .line 798
    goto :goto_e

    .line 799
    :cond_17
    add-int/lit8 v8, v8, 0x1

    .line 800
    .line 801
    goto :goto_d

    .line 802
    :cond_18
    move/from16 v8, v16

    .line 803
    .line 804
    :goto_e
    if-ltz v8, :cond_14

    .line 805
    .line 806
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    check-cast v4, Ljava/lang/CharSequence;

    .line 811
    .line 812
    filled-new-array {v7}, [Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v6

    .line 816
    invoke-static {v4, v6}, Lh7/h;->K0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object v4

    .line 820
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 821
    .line 822
    .line 823
    move-result v6

    .line 824
    const/4 v15, 0x2

    .line 825
    if-lt v6, v15, :cond_14

    .line 826
    .line 827
    const/4 v10, 0x0

    .line 828
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v6

    .line 832
    check-cast v6, Ljava/lang/String;

    .line 833
    .line 834
    invoke-static {v6}, Lx4/v;->c(Ljava/lang/String;)Ljava/lang/Long;

    .line 835
    .line 836
    .line 837
    move-result-object v6

    .line 838
    if-eqz v6, :cond_14

    .line 839
    .line 840
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 841
    .line 842
    .line 843
    move-result-wide v23

    .line 844
    const/4 v12, 0x1

    .line 845
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v4

    .line 849
    check-cast v4, Ljava/lang/String;

    .line 850
    .line 851
    invoke-static {v4}, Lx4/v;->c(Ljava/lang/String;)Ljava/lang/Long;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    if-eqz v4, :cond_14

    .line 856
    .line 857
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 858
    .line 859
    .line 860
    move-result-wide v25

    .line 861
    cmp-long v4, v25, v23

    .line 862
    .line 863
    if-lez v4, :cond_14

    .line 864
    .line 865
    add-int/lit8 v8, v8, 0x1

    .line 866
    .line 867
    invoke-static {v8, v5}, Lm6/h;->y0(ILjava/util/List;)Ljava/util/List;

    .line 868
    .line 869
    .line 870
    move-result-object v27

    .line 871
    new-instance v4, Lg7/l;

    .line 872
    .line 873
    const/4 v15, 0x3

    .line 874
    invoke-direct {v4, v15}, Lg7/l;-><init>(I)V

    .line 875
    .line 876
    .line 877
    const/16 v32, 0x1e

    .line 878
    .line 879
    const-string v28, "\n"

    .line 880
    .line 881
    const/16 v29, 0x0

    .line 882
    .line 883
    const/16 v30, 0x0

    .line 884
    .line 885
    move-object/from16 v31, v4

    .line 886
    .line 887
    invoke-static/range {v27 .. v32}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v4

    .line 891
    invoke-static {v4}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v22

    .line 899
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    if-nez v4, :cond_19

    .line 904
    .line 905
    goto/16 :goto_b

    .line 906
    .line 907
    :cond_19
    new-instance v21, Lx4/s;

    .line 908
    .line 909
    invoke-direct/range {v21 .. v26}, Lx4/s;-><init>(Ljava/lang/String;JJ)V

    .line 910
    .line 911
    .line 912
    move-object/from16 v4, v21

    .line 913
    .line 914
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    goto/16 :goto_b

    .line 918
    .line 919
    :cond_1a
    const/4 v10, 0x0

    .line 920
    new-instance v1, Lx4/q;

    .line 921
    .line 922
    const/4 v15, 0x2

    .line 923
    invoke-direct {v1, v15}, Lx4/q;-><init>(I)V

    .line 924
    .line 925
    .line 926
    invoke-static {v3, v1}, Lm6/h;->J0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    :goto_f
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 931
    .line 932
    .line 933
    move-result v3

    .line 934
    if-eqz v3, :cond_1b

    .line 935
    .line 936
    const v1, 0x7f110128

    .line 937
    .line 938
    .line 939
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v1

    .line 943
    const-string v3, "getString(...)"

    .line 944
    .line 945
    invoke-static {v3, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, v1}, Lcom/exotv/net/PlayerActivity;->S(Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v0, v2}, Lcom/exotv/net/PlayerActivity;->B(Z)V

    .line 955
    .line 956
    .line 957
    return-void

    .line 958
    :cond_1b
    iput-object v1, v0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 959
    .line 960
    sget-object v1, Lx4/v;->a:Lx4/v;

    .line 961
    .line 962
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->Z:Ljava/lang/String;

    .line 963
    .line 964
    if-eqz v1, :cond_1c

    .line 965
    .line 966
    invoke-static {v1}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    if-eqz v1, :cond_1c

    .line 975
    .line 976
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 977
    .line 978
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    const-string v3, "toLowerCase(...)"

    .line 983
    .line 984
    invoke-static {v3, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    sget-object v3, Lx4/v;->b:Ljava/util/Set;

    .line 988
    .line 989
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 990
    .line 991
    .line 992
    move-result v1

    .line 993
    const/4 v12, 0x1

    .line 994
    if-ne v1, v12, :cond_1c

    .line 995
    .line 996
    goto :goto_10

    .line 997
    :cond_1c
    move v12, v10

    .line 998
    :goto_10
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 999
    .line 1000
    const-string v3, "b"

    .line 1001
    .line 1002
    if-eqz v1, :cond_1f

    .line 1003
    .line 1004
    iget-object v1, v1, La5/b;->E:Landroid/widget/TextView;

    .line 1005
    .line 1006
    invoke-virtual {v1, v12}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1007
    .line 1008
    .line 1009
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 1010
    .line 1011
    iget-object v4, v0, Lcom/exotv/net/PlayerActivity;->w0:Lw4/n0;

    .line 1012
    .line 1013
    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->I()V

    .line 1020
    .line 1021
    .line 1022
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 1023
    .line 1024
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1025
    .line 1026
    .line 1027
    move-result v1

    .line 1028
    iget-object v4, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1029
    .line 1030
    if-eqz v4, :cond_1e

    .line 1031
    .line 1032
    iget-object v3, v4, La5/b;->h:Landroid/widget/ImageView;

    .line 1033
    .line 1034
    if-nez v1, :cond_1d

    .line 1035
    .line 1036
    const v16, -0x23ebc4

    .line 1037
    .line 1038
    .line 1039
    :cond_1d
    move/from16 v1, v16

    .line 1040
    .line 1041
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v0, v2}, Lcom/exotv/net/PlayerActivity;->B(Z)V

    .line 1048
    .line 1049
    .line 1050
    return-void

    .line 1051
    :cond_1e
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1052
    .line 1053
    .line 1054
    throw v18

    .line 1055
    :cond_1f
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    throw v18
.end method

.method public static final s(Lcom/exotv/net/PlayerActivity;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lw4/p0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lw4/p0;

    .line 11
    .line 12
    iget v3, v2, Lw4/p0;->r:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lw4/p0;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lw4/p0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lw4/p0;-><init>(Lcom/exotv/net/PlayerActivity;Lr6/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lw4/p0;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lq6/a;->j:Lq6/a;

    .line 32
    .line 33
    iget v4, v2, Lw4/p0;->r:I

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    if-eq v4, v6, :cond_2

    .line 41
    .line 42
    if-ne v4, v5, :cond_1

    .line 43
    .line 44
    iget-object v0, v2, Lw4/p0;->m:Lcom/exotv/net/PlayerActivity;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_8

    .line 50
    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_2
    iget-object v0, v2, Lw4/p0;->o:Lx4/d;

    .line 60
    .line 61
    iget-object v4, v2, Lw4/p0;->n:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v8, v2, Lw4/p0;->m:Lcom/exotv/net/PlayerActivity;

    .line 64
    .line 65
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v27, v1

    .line 69
    .line 70
    move-object v1, v0

    .line 71
    move-object v0, v8

    .line 72
    move-object/from16 v8, v27

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->c0:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v1, :cond_2b

    .line 81
    .line 82
    iget v4, v0, Lcom/exotv/net/PlayerActivity;->d0:I

    .line 83
    .line 84
    if-ltz v4, :cond_4

    .line 85
    .line 86
    iget v4, v0, Lcom/exotv/net/PlayerActivity;->e0:I

    .line 87
    .line 88
    if-ltz v4, :cond_4

    .line 89
    .line 90
    sget-object v4, Lx4/d;->k:Lx4/d;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    sget-object v4, Lx4/d;->j:Lx4/d;

    .line 94
    .line 95
    :goto_1
    iget-object v8, v0, Lcom/exotv/net/PlayerActivity;->j0:Ljava/lang/String;

    .line 96
    .line 97
    if-nez v8, :cond_7

    .line 98
    .line 99
    sget-object v8, Lx4/v;->a:Lx4/v;

    .line 100
    .line 101
    iput-object v0, v2, Lw4/p0;->m:Lcom/exotv/net/PlayerActivity;

    .line 102
    .line 103
    move-object/from16 v9, p1

    .line 104
    .line 105
    iput-object v9, v2, Lw4/p0;->n:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v4, v2, Lw4/p0;->o:Lx4/d;

    .line 108
    .line 109
    iput v6, v2, Lw4/p0;->r:I

    .line 110
    .line 111
    invoke-virtual {v8, v1, v4, v2}, Lx4/v;->a(Ljava/lang/String;Lx4/d;Lr6/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-ne v1, v3, :cond_5

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_5
    move-object v8, v1

    .line 119
    move-object v1, v4

    .line 120
    move-object v4, v9

    .line 121
    :goto_2
    check-cast v8, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v8, :cond_6

    .line 124
    .line 125
    move-object v10, v4

    .line 126
    move-object v4, v1

    .line 127
    :goto_3
    move-object v9, v8

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    const v1, 0x7f110132

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const-string v1, "getString(...)"

    .line 137
    .line 138
    invoke-static {v1, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :cond_7
    move-object/from16 v9, p1

    .line 152
    .line 153
    move-object v10, v9

    .line 154
    goto :goto_3

    .line 155
    :goto_4
    sget-object v1, Lx4/v;->a:Lx4/v;

    .line 156
    .line 157
    sget-object v1, Lx4/d;->k:Lx4/d;

    .line 158
    .line 159
    if-ne v4, v1, :cond_8

    .line 160
    .line 161
    iget v8, v0, Lcom/exotv/net/PlayerActivity;->d0:I

    .line 162
    .line 163
    new-instance v11, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-direct {v11, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    move-object v11, v7

    .line 170
    :goto_5
    if-ne v4, v1, :cond_9

    .line 171
    .line 172
    iget v1, v0, Lcom/exotv/net/PlayerActivity;->f0:I

    .line 173
    .line 174
    new-instance v4, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 177
    .line 178
    .line 179
    move-object v12, v4

    .line 180
    goto :goto_6

    .line 181
    :cond_9
    move-object v12, v7

    .line 182
    :goto_6
    iput-object v0, v2, Lw4/p0;->m:Lcom/exotv/net/PlayerActivity;

    .line 183
    .line 184
    iput-object v7, v2, Lw4/p0;->n:Ljava/lang/String;

    .line 185
    .line 186
    iput-object v7, v2, Lw4/p0;->o:Lx4/d;

    .line 187
    .line 188
    iput v5, v2, Lw4/p0;->r:I

    .line 189
    .line 190
    sget-object v1, Li7/e0;->a:Lo7/e;

    .line 191
    .line 192
    sget-object v1, Lo7/d;->l:Lo7/d;

    .line 193
    .line 194
    new-instance v8, Lw4/t;

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x1

    .line 198
    invoke-direct/range {v8 .. v14}, Lw4/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v8, v2}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-ne v1, v3, :cond_a

    .line 206
    .line 207
    :goto_7
    return-object v3

    .line 208
    :cond_a
    :goto_8
    check-cast v1, Ljava/util/List;

    .line 209
    .line 210
    sget-object v2, Lx4/r;->a:Lh7/f;

    .line 211
    .line 212
    iget-object v0, v0, Lcom/exotv/net/PlayerActivity;->i0:Ljava/lang/String;

    .line 213
    .line 214
    const-string v2, "hits"

    .line 215
    .line 216
    invoke-static {v2, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-ge v2, v5, :cond_b

    .line 224
    .line 225
    return-object v1

    .line 226
    :cond_b
    invoke-static {v0}, Lx4/r;->a(Ljava/lang/String;)Lx4/o;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    new-instance v2, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-static {v1}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    const/4 v4, 0x0

    .line 248
    if-eqz v3, :cond_29

    .line 249
    .line 250
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    check-cast v3, Lx4/t;

    .line 255
    .line 256
    sget-object v8, Lx4/r;->a:Lh7/f;

    .line 257
    .line 258
    const-string v8, "hit"

    .line 259
    .line 260
    invoke-static {v8, v3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-object v8, v3, Lx4/t;->c:Ljava/lang/String;

    .line 264
    .line 265
    iget-object v9, v3, Lx4/t;->b:Ljava/lang/String;

    .line 266
    .line 267
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    invoke-static {v10}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    new-instance v11, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    :cond_c
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v12

    .line 288
    if-eqz v12, :cond_d

    .line 289
    .line 290
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    move-object v13, v12

    .line 295
    check-cast v13, Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {v13}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    if-nez v13, :cond_c

    .line 302
    .line 303
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_d
    const/4 v15, 0x0

    .line 308
    const/16 v16, 0x3e

    .line 309
    .line 310
    const-string v12, " "

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    invoke-static/range {v11 .. v16}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 319
    .line 320
    const-string v12, "US"

    .line 321
    .line 322
    invoke-static {v12, v11}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    const-string v11, "toLowerCase(...)"

    .line 330
    .line 331
    invoke-static {v11, v10}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v8}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-eqz v11, :cond_e

    .line 339
    .line 340
    move-object v8, v9

    .line 341
    :cond_e
    invoke-static {v8}, Lx4/r;->a(Ljava/lang/String;)Lx4/o;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    if-eqz v0, :cond_f

    .line 346
    .line 347
    if-eqz v8, :cond_f

    .line 348
    .line 349
    iget-object v9, v8, Lx4/o;->c:Lx4/p;

    .line 350
    .line 351
    iget-object v15, v0, Lx4/o;->c:Lx4/p;

    .line 352
    .line 353
    if-ne v9, v15, :cond_f

    .line 354
    .line 355
    sget-object v9, Lx4/p;->o:Lx4/p;

    .line 356
    .line 357
    if-eq v15, v9, :cond_f

    .line 358
    .line 359
    const-wide/high16 v15, 0x4010000000000000L    # 4.0

    .line 360
    .line 361
    goto :goto_d

    .line 362
    :cond_f
    if-eqz v8, :cond_10

    .line 363
    .line 364
    iget-object v9, v8, Lx4/o;->c:Lx4/p;

    .line 365
    .line 366
    goto :goto_b

    .line 367
    :cond_10
    move-object v9, v7

    .line 368
    :goto_b
    sget-object v15, Lx4/p;->j:Lx4/p;

    .line 369
    .line 370
    if-ne v9, v15, :cond_11

    .line 371
    .line 372
    if-eqz v0, :cond_11

    .line 373
    .line 374
    iget-object v9, v0, Lx4/o;->c:Lx4/p;

    .line 375
    .line 376
    if-eq v9, v15, :cond_11

    .line 377
    .line 378
    const-wide/high16 v15, -0x3fd8000000000000L    # -12.0

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_11
    if-eqz v8, :cond_12

    .line 382
    .line 383
    iget-object v9, v8, Lx4/o;->c:Lx4/p;

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_12
    move-object v9, v7

    .line 387
    :goto_c
    if-ne v9, v15, :cond_13

    .line 388
    .line 389
    if-nez v0, :cond_13

    .line 390
    .line 391
    const-wide/high16 v15, -0x3ff0000000000000L    # -4.0

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :cond_13
    if-eqz v0, :cond_14

    .line 395
    .line 396
    if-eqz v8, :cond_14

    .line 397
    .line 398
    iget-object v9, v8, Lx4/o;->c:Lx4/p;

    .line 399
    .line 400
    sget-object v15, Lx4/p;->o:Lx4/p;

    .line 401
    .line 402
    if-eq v9, v15, :cond_14

    .line 403
    .line 404
    iget-object v9, v0, Lx4/o;->c:Lx4/p;

    .line 405
    .line 406
    if-eq v9, v15, :cond_14

    .line 407
    .line 408
    const-wide/high16 v15, -0x4000000000000000L    # -2.0

    .line 409
    .line 410
    goto :goto_d

    .line 411
    :cond_14
    const-wide/16 v15, 0x0

    .line 412
    .line 413
    :goto_d
    const-wide/high16 v17, 0x4008000000000000L    # 3.0

    .line 414
    .line 415
    const-wide/high16 v19, 0x4024000000000000L    # 10.0

    .line 416
    .line 417
    const-wide/high16 v21, 0x3ff0000000000000L    # 1.0

    .line 418
    .line 419
    if-eqz v0, :cond_21

    .line 420
    .line 421
    iget-object v9, v0, Lx4/o;->h:Ljava/lang/String;

    .line 422
    .line 423
    iget-object v7, v0, Lx4/o;->g:Ljava/lang/Integer;

    .line 424
    .line 425
    const-wide/high16 p0, 0x4010000000000000L    # 4.0

    .line 426
    .line 427
    iget-object v11, v0, Lx4/o;->d:Ljava/lang/String;

    .line 428
    .line 429
    if-eqz v8, :cond_22

    .line 430
    .line 431
    iget-object v12, v8, Lx4/o;->h:Ljava/lang/String;

    .line 432
    .line 433
    const-wide/16 v23, 0x0

    .line 434
    .line 435
    iget-object v13, v8, Lx4/o;->g:Ljava/lang/Integer;

    .line 436
    .line 437
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 438
    .line 439
    .line 440
    move-result v14

    .line 441
    if-lez v14, :cond_15

    .line 442
    .line 443
    iget-object v14, v8, Lx4/o;->d:Ljava/lang/String;

    .line 444
    .line 445
    invoke-virtual {v11, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    if-eqz v11, :cond_15

    .line 450
    .line 451
    add-double v15, v15, v19

    .line 452
    .line 453
    :cond_15
    iget-object v11, v0, Lx4/o;->b:Ljava/lang/Integer;

    .line 454
    .line 455
    const-wide/high16 v25, 0x4000000000000000L    # 2.0

    .line 456
    .line 457
    if-eqz v11, :cond_16

    .line 458
    .line 459
    iget-object v14, v8, Lx4/o;->b:Ljava/lang/Integer;

    .line 460
    .line 461
    invoke-static {v14, v11}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v11

    .line 465
    if-eqz v11, :cond_16

    .line 466
    .line 467
    add-double v15, v15, v25

    .line 468
    .line 469
    :cond_16
    iget-object v11, v0, Lx4/o;->a:Ljava/lang/Integer;

    .line 470
    .line 471
    if-eqz v11, :cond_17

    .line 472
    .line 473
    iget-object v14, v8, Lx4/o;->a:Ljava/lang/Integer;

    .line 474
    .line 475
    invoke-static {v14, v11}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    if-eqz v11, :cond_17

    .line 480
    .line 481
    add-double v15, v15, v25

    .line 482
    .line 483
    :cond_17
    iget-object v11, v0, Lx4/o;->f:Ljava/lang/Integer;

    .line 484
    .line 485
    if-eqz v11, :cond_19

    .line 486
    .line 487
    if-eqz v7, :cond_19

    .line 488
    .line 489
    iget-object v8, v8, Lx4/o;->f:Ljava/lang/Integer;

    .line 490
    .line 491
    if-eqz v8, :cond_19

    .line 492
    .line 493
    if-eqz v13, :cond_19

    .line 494
    .line 495
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    if-eqz v8, :cond_18

    .line 500
    .line 501
    invoke-virtual {v13, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    if-eqz v7, :cond_18

    .line 506
    .line 507
    const-wide/high16 v7, 0x4018000000000000L    # 6.0

    .line 508
    .line 509
    goto :goto_e

    .line 510
    :cond_18
    const-wide/high16 v7, -0x3fe0000000000000L    # -8.0

    .line 511
    .line 512
    :goto_e
    add-double/2addr v15, v7

    .line 513
    :cond_19
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    if-lez v7, :cond_1b

    .line 518
    .line 519
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 520
    .line 521
    .line 522
    move-result v7

    .line 523
    if-lez v7, :cond_1b

    .line 524
    .line 525
    invoke-virtual {v12, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v7

    .line 529
    if-eqz v7, :cond_1a

    .line 530
    .line 531
    move-wide/from16 v7, v25

    .line 532
    .line 533
    goto :goto_f

    .line 534
    :cond_1a
    const-wide/high16 v7, -0x3fdc000000000000L    # -10.0

    .line 535
    .line 536
    :goto_f
    add-double/2addr v15, v7

    .line 537
    :cond_1b
    iget-wide v7, v0, Lx4/o;->e:D

    .line 538
    .line 539
    iget-wide v11, v3, Lx4/t;->k:D

    .line 540
    .line 541
    cmpg-double v9, v7, v23

    .line 542
    .line 543
    if-lez v9, :cond_1f

    .line 544
    .line 545
    cmpg-double v9, v11, v23

    .line 546
    .line 547
    if-gtz v9, :cond_1c

    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_1c
    div-double/2addr v11, v7

    .line 551
    sub-double v11, v11, v21

    .line 552
    .line 553
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    .line 554
    .line 555
    .line 556
    move-result-wide v7

    .line 557
    const-wide v11, 0x3f60624dd2f1a9fcL    # 0.002

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    cmpg-double v9, v7, v11

    .line 563
    .line 564
    if-gtz v9, :cond_1d

    .line 565
    .line 566
    move-wide/from16 v13, v17

    .line 567
    .line 568
    goto :goto_11

    .line 569
    :cond_1d
    const-wide v11, 0x3f947ae147ae147bL    # 0.02

    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    cmpg-double v7, v7, v11

    .line 575
    .line 576
    if-gtz v7, :cond_1e

    .line 577
    .line 578
    move-wide/from16 v13, v25

    .line 579
    .line 580
    goto :goto_11

    .line 581
    :cond_1e
    const-wide/high16 v13, -0x3fe8000000000000L    # -6.0

    .line 582
    .line 583
    goto :goto_11

    .line 584
    :cond_1f
    :goto_10
    move-wide/from16 v13, v23

    .line 585
    .line 586
    :goto_11
    add-double/2addr v15, v13

    .line 587
    const-string v7, "x264"

    .line 588
    .line 589
    invoke-static {v10, v7, v4}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 590
    .line 591
    .line 592
    move-result v7

    .line 593
    if-nez v7, :cond_20

    .line 594
    .line 595
    const-string v7, "h.264"

    .line 596
    .line 597
    invoke-static {v10, v7, v4}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    if-nez v7, :cond_20

    .line 602
    .line 603
    const-string v7, "avc"

    .line 604
    .line 605
    invoke-static {v10, v7, v4}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 606
    .line 607
    .line 608
    move-result v7

    .line 609
    if-eqz v7, :cond_22

    .line 610
    .line 611
    :cond_20
    add-double v15, v15, v21

    .line 612
    .line 613
    goto :goto_12

    .line 614
    :cond_21
    const-wide/high16 p0, 0x4010000000000000L    # 4.0

    .line 615
    .line 616
    :cond_22
    :goto_12
    iget-boolean v7, v3, Lx4/t;->o:Z

    .line 617
    .line 618
    if-nez v7, :cond_23

    .line 619
    .line 620
    const-string v7, "forced"

    .line 621
    .line 622
    invoke-static {v10, v7, v4}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    if-eqz v7, :cond_24

    .line 627
    .line 628
    :cond_23
    const-wide/high16 v7, 0x4028000000000000L    # 12.0

    .line 629
    .line 630
    sub-double/2addr v15, v7

    .line 631
    :cond_24
    iget v7, v3, Lx4/t;->l:I

    .line 632
    .line 633
    if-le v7, v6, :cond_25

    .line 634
    .line 635
    sub-double v15, v15, p0

    .line 636
    .line 637
    :cond_25
    iget-boolean v7, v3, Lx4/t;->m:Z

    .line 638
    .line 639
    if-eqz v7, :cond_26

    .line 640
    .line 641
    sub-double v15, v15, v17

    .line 642
    .line 643
    :cond_26
    iget-boolean v7, v3, Lx4/t;->n:Z

    .line 644
    .line 645
    if-eqz v7, :cond_27

    .line 646
    .line 647
    sub-double v15, v15, v21

    .line 648
    .line 649
    :cond_27
    iget v7, v3, Lx4/t;->g:I

    .line 650
    .line 651
    if-gez v7, :cond_28

    .line 652
    .line 653
    goto :goto_13

    .line 654
    :cond_28
    move v4, v7

    .line 655
    :goto_13
    int-to-double v7, v4

    .line 656
    add-double v7, v7, v21

    .line 657
    .line 658
    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    .line 659
    .line 660
    .line 661
    move-result-wide v7

    .line 662
    div-double v7, v7, v19

    .line 663
    .line 664
    add-double/2addr v7, v15

    .line 665
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    new-instance v7, Ll6/d;

    .line 670
    .line 671
    invoke-direct {v7, v3, v4}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    const/4 v7, 0x0

    .line 678
    goto/16 :goto_9

    .line 679
    .line 680
    :cond_29
    new-instance v0, Lx4/q;

    .line 681
    .line 682
    invoke-direct {v0, v4}, Lx4/q;-><init>(I)V

    .line 683
    .line 684
    .line 685
    new-instance v1, Lc5/p0;

    .line 686
    .line 687
    invoke-direct {v1, v0, v5}, Lc5/p0;-><init>(Ljava/util/Comparator;I)V

    .line 688
    .line 689
    .line 690
    invoke-static {v2, v1}, Lm6/h;->J0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    new-instance v1, Ljava/util/ArrayList;

    .line 695
    .line 696
    invoke-static {v0}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 701
    .line 702
    .line 703
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    if-eqz v2, :cond_2a

    .line 712
    .line 713
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    check-cast v2, Ll6/d;

    .line 718
    .line 719
    iget-object v2, v2, Ll6/d;->j:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v2, Lx4/t;

    .line 722
    .line 723
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    goto :goto_14

    .line 727
    :cond_2a
    return-object v1

    .line 728
    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 729
    .line 730
    const-string v1, "no TMDB id"

    .line 731
    .line 732
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    throw v0
.end method

.method public static final t(Lcom/exotv/net/PlayerActivity;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->getDuration()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v3, v1, v3

    .line 13
    .line 14
    if-gtz v3, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    iget-object v3, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const-string v5, "b"

    .line 21
    .line 22
    if-eqz v3, :cond_9

    .line 23
    .line 24
    iget-object v3, v3, La5/b;->s:Landroid/widget/SeekBar;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getMax()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    long-to-int v6, v1

    .line 31
    if-eq v3, v6, :cond_4

    .line 32
    .line 33
    iget-object v3, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    iget-object v3, v3, La5/b;->s:Landroid/widget/SeekBar;

    .line 38
    .line 39
    invoke-virtual {v3, v6}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    iget-object v3, v3, La5/b;->s:Landroid/widget/SeekBar;

    .line 47
    .line 48
    const/16 v6, 0x2710

    .line 49
    .line 50
    invoke-virtual {v3, v6}, Landroid/widget/AbsSeekBar;->setKeyProgressIncrement(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v4

    .line 58
    :cond_3
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v4

    .line 62
    :cond_4
    :goto_1
    iget-boolean v3, p0, Lcom/exotv/net/PlayerActivity;->l0:Z

    .line 63
    .line 64
    if-nez v3, :cond_6

    .line 65
    .line 66
    iget-object v3, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    iget-object v3, v3, La5/b;->s:Landroid/widget/SeekBar;

    .line 71
    .line 72
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->getCurrentPosition()J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    long-to-int v6, v6

    .line 77
    invoke-virtual {v3, v6}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v4

    .line 85
    :cond_6
    :goto_2
    iget-object v3, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 86
    .line 87
    if-eqz v3, :cond_8

    .line 88
    .line 89
    iget-object v3, v3, La5/b;->u:Landroid/widget/TextView;

    .line 90
    .line 91
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->getCurrentPosition()J

    .line 92
    .line 93
    .line 94
    move-result-wide v6

    .line 95
    invoke-static {v6, v7}, Lcom/exotv/net/PlayerActivity;->C(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 103
    .line 104
    if-eqz p0, :cond_7

    .line 105
    .line 106
    iget-object p0, p0, La5/b;->v:Landroid/widget/TextView;

    .line 107
    .line 108
    invoke-static {v1, v2}, Lcom/exotv/net/PlayerActivity;->C(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_7
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v4

    .line 120
    :cond_8
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v4

    .line 124
    :cond_9
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v4
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->s0:Landroid/widget/TextView;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, v0, La5/b;->w:Landroid/widget/LinearLayout;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_2
    new-instance v1, Lm0/t;

    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    invoke-direct {v1, v0, v2}, Lm0/t;-><init>(Landroid/view/View;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1
.end method

.method public final B(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lcom/exotv/net/PlayerActivity;->o0:Landroid/widget/TextView;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object p1, v1

    .line 21
    :goto_0
    if-nez p1, :cond_3

    .line 22
    .line 23
    iget-object p1, p0, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->h0:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/widget/TextView;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Landroid/view/View;

    .line 41
    .line 42
    :goto_1
    if-nez p1, :cond_3

    .line 43
    .line 44
    :goto_2
    return-void

    .line 45
    :cond_3
    new-instance v0, Lw4/j0;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, p1, v1}, Lw4/j0;-><init>(Lcom/exotv/net/PlayerActivity;Landroid/view/View;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_4
    const-string p1, "b"

    .line 56
    .line 57
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method public final D()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 18
    .line 19
    if-eqz v0, :cond_7

    .line 20
    .line 21
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 31
    .line 32
    if-eqz v0, :cond_6

    .line 33
    .line 34
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :cond_2
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget-object v0, v0, La5/b;->j:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget-object v0, v0, La5/b;->j:Landroid/widget/LinearLayout;

    .line 57
    .line 58
    const/16 v3, 0x8

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, v0, La5/b;->F:Landroid/widget/LinearLayout;

    .line 68
    .line 69
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/exotv/net/PlayerActivity;->v0:Lw4/n0;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v1

    .line 88
    :cond_5
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_6
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v1

    .line 96
    :cond_7
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :cond_8
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1
.end method

.method public final E()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-object v1, v1, La5/b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    .line 11
    new-instance v2, Ll/o;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Ll/o;-><init>(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v3, 0x23

    .line 19
    .line 20
    if-lt v1, v3, :cond_0

    .line 21
    .line 22
    new-instance v1, Lm0/w1;

    .line 23
    .line 24
    invoke-direct {v1, v0, v2}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v3, 0x1e

    .line 29
    .line 30
    if-lt v1, v3, :cond_1

    .line 31
    .line 32
    new-instance v1, Lm0/u1;

    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/16 v3, 0x1a

    .line 39
    .line 40
    if-lt v1, v3, :cond_2

    .line 41
    .line 42
    new-instance v1, Lm0/t1;

    .line 43
    .line 44
    invoke-direct {v1, v0, v2}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance v1, Lm0/s1;

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    const/16 v0, 0x207

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Lcom/bumptech/glide/d;->L(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/bumptech/glide/d;->j0()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    const-string v0, "b"

    .line 63
    .line 64
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    throw v0
.end method

.method public final F(ILjava/util/List;Z)V
    .locals 7

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->b0:Li7/a0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput p1, p0, Lcom/exotv/net/PlayerActivity;->a0:I

    .line 17
    .line 18
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lw4/o0;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v4, p0

    .line 26
    move v3, p1

    .line 27
    move-object v2, p2

    .line 28
    move v5, p3

    .line 29
    invoke-direct/range {v1 .. v6}, Lw4/o0;-><init>(Ljava/util/List;ILcom/exotv/net/PlayerActivity;ZLp6/c;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x3

    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-static {v0, p2, v1, p1}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, v4, Lcom/exotv/net/PlayerActivity;->b0:Li7/a0;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    move-object v4, p0

    .line 42
    return-void
.end method

.method public final G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41600000    # 14.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p1, -0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const p1, -0x5c5c5d

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    .line 23
    .line 24
    const/16 p1, 0xa

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0, p1}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p0, p1}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {p0, p1}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 58
    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    const p1, 0x7f080082

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Lb6/a;

    .line 73
    .line 74
    const/16 p2, 0xb

    .line 75
    .line 76
    invoke-direct {p1, p2, p3}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    return-object v0
.end method

.method public final H()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->u0:Lw4/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->u0:Lw4/k0;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 10
    .line 11
    const-string v3, "b"

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget-object v2, v2, La5/b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iget-object v1, v2, La5/b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_2
    :goto_0
    return-void

    .line 46
    :cond_3
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1
.end method

.method public final I()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_8

    .line 5
    .line 6
    iget-object v0, v0, La5/b;->E:Landroid/widget/TextView;

    .line 7
    .line 8
    const-string v2, "subtitleText"

    .line 9
    .line 10
    invoke-static {v2, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 14
    .line 15
    const/16 v3, 0x8

    .line 16
    .line 17
    if-eqz v2, :cond_7

    .line 18
    .line 19
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-interface {v2}, Landroidx/media3/exoplayer/ExoPlayer;->getCurrentPosition()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/lit8 v2, v2, -0x1

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, -0x1

    .line 42
    move v8, v6

    .line 43
    :goto_0
    if-gt v8, v2, :cond_2

    .line 44
    .line 45
    add-int v9, v8, v2

    .line 46
    .line 47
    div-int/lit8 v9, v9, 0x2

    .line 48
    .line 49
    iget-object v10, p0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    check-cast v10, Lx4/s;

    .line 56
    .line 57
    iget-wide v10, v10, Lx4/s;->b:J

    .line 58
    .line 59
    cmp-long v10, v10, v4

    .line 60
    .line 61
    if-lez v10, :cond_1

    .line 62
    .line 63
    add-int/lit8 v2, v9, -0x1

    .line 64
    .line 65
    move v7, v9

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    add-int/lit8 v8, v9, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    if-gez v7, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lx4/s;

    .line 80
    .line 81
    iget-wide v7, v2, Lx4/s;->a:J

    .line 82
    .line 83
    cmp-long v4, v4, v7

    .line 84
    .line 85
    if-ltz v4, :cond_4

    .line 86
    .line 87
    move-object v1, v2

    .line 88
    :cond_4
    :goto_1
    if-nez v1, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    iget-object v1, v1, Lx4/s;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v2, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_6

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_7
    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_8
    const-string v0, "b"

    .line 118
    .line 119
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v1
.end method

.method public final J()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    iget-object v0, v0, La5/b;->q:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->r0:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->p0:Ljava/util/List;

    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {v2}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lw4/l0;

    .line 43
    .line 44
    iget v4, v4, Lw4/l0;->a:I

    .line 45
    .line 46
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v1, v3}, Lm6/h;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x0

    .line 63
    :goto_1
    if-ge v3, v2, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    check-cast v4, Ljava/lang/Integer;

    .line 72
    .line 73
    iget-object v5, p0, Lcom/exotv/net/PlayerActivity;->q0:Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-static {v4, v5}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const-string v6, "getString(...)"

    .line 80
    .line 81
    if-nez v4, :cond_1

    .line 82
    .line 83
    const v7, 0x7f11010c

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    :goto_2
    invoke-static {v6, v7}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_1
    const v7, 0x7f11010d

    .line 95
    .line 96
    .line 97
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {p0, v7, v8}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    goto :goto_2

    .line 106
    :goto_3
    if-eqz v5, :cond_2

    .line 107
    .line 108
    const v6, 0x7f110125

    .line 109
    .line 110
    .line 111
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {p0, v6, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    :cond_2
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v6, Lw4/y;

    .line 123
    .line 124
    const/4 v8, 0x1

    .line 125
    invoke-direct {v6, p0, v4, v8}, Lw4/y;-><init>(Lh/i;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    invoke-virtual {p0, v7, v4, v6}, Lcom/exotv/net/PlayerActivity;->G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    if-eqz v5, :cond_3

    .line 134
    .line 135
    iput-object v4, p0, Lcom/exotv/net/PlayerActivity;->r0:Landroid/widget/TextView;

    .line 136
    .line 137
    :cond_3
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    return-void

    .line 142
    :cond_5
    const-string v0, "b"

    .line 143
    .line 144
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v1
.end method

.method public final K()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    iget-object v0, v0, La5/b;->w:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->s0:Landroid/widget/TextView;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    const-string v4, "getString(...)"

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const v2, 0x7f110120

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v4, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2, v3, v1}, Lcom/exotv/net/PlayerActivity;->G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    move v5, v3

    .line 49
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_8

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    add-int/lit8 v7, v5, 0x1

    .line 60
    .line 61
    if-ltz v5, :cond_7

    .line 62
    .line 63
    check-cast v6, Lcom/exotv/net/model/BackupSource;

    .line 64
    .line 65
    invoke-virtual {v6}, Lcom/exotv/net/model/BackupSource;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    invoke-static {v6}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-nez v8, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move-object v6, v1

    .line 79
    :goto_1
    if-nez v6, :cond_3

    .line 80
    .line 81
    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const v8, 0x7f11011f

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v8, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v4, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    iget v8, p0, Lcom/exotv/net/PlayerActivity;->M:I

    .line 100
    .line 101
    const/4 v9, 0x1

    .line 102
    if-ne v5, v8, :cond_4

    .line 103
    .line 104
    move v8, v9

    .line 105
    goto :goto_2

    .line 106
    :cond_4
    move v8, v3

    .line 107
    :goto_2
    if-eqz v8, :cond_5

    .line 108
    .line 109
    const v10, 0x7f110125

    .line 110
    .line 111
    .line 112
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {p0, v10, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    :cond_5
    invoke-static {v6}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v10, Lw4/i0;

    .line 124
    .line 125
    invoke-direct {v10, p0, v5}, Lw4/i0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v6, v9, v10}, Lcom/exotv/net/PlayerActivity;->G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-eqz v8, :cond_6

    .line 133
    .line 134
    iput-object v5, p0, Lcom/exotv/net/PlayerActivity;->s0:Landroid/widget/TextView;

    .line 135
    .line 136
    :cond_6
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    move v5, v7

    .line 140
    goto :goto_0

    .line 141
    :cond_7
    invoke-static {}, Lm6/i;->v0()V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :cond_8
    return-void

    .line 146
    :cond_9
    const-string v0, "b"

    .line 147
    .line 148
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1
.end method

.method public final L()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->h0:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2, v3}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    if-eqz v0, :cond_d

    .line 49
    .line 50
    iget-object v0, v0, La5/b;->A:Landroid/widget/LinearLayout;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->o0:Landroid/widget/TextView;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    const-string v4, "getString(...)"

    .line 61
    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    const v2, 0x7f110126

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v4, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2, v3, v1}, Lcom/exotv/net/PlayerActivity;->G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    iget-object v5, p0, Lcom/exotv/net/PlayerActivity;->X:Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, Ljava/util/List;

    .line 89
    .line 90
    if-nez v5, :cond_2

    .line 91
    .line 92
    const v5, 0x7f110134

    .line 93
    .line 94
    .line 95
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {p0, v5, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v4, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2, v3, v1}, Lcom/exotv/net/PlayerActivity;->G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_3

    .line 119
    .line 120
    const v5, 0x7f110127

    .line 121
    .line 122
    .line 123
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {p0, v5, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-static {v4, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v2, v3, v1}, Lcom/exotv/net/PlayerActivity;->G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    move v6, v3

    .line 147
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-eqz v7, :cond_c

    .line 152
    .line 153
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    add-int/lit8 v8, v6, 0x1

    .line 158
    .line 159
    if-ltz v6, :cond_b

    .line 160
    .line 161
    check-cast v7, Lx4/t;

    .line 162
    .line 163
    iget-object v9, p0, Lcom/exotv/net/PlayerActivity;->Z:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v9, v2}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    const/4 v10, 0x1

    .line 170
    if-eqz v9, :cond_4

    .line 171
    .line 172
    iget v9, p0, Lcom/exotv/net/PlayerActivity;->a0:I

    .line 173
    .line 174
    if-ne v9, v6, :cond_4

    .line 175
    .line 176
    move v9, v10

    .line 177
    goto :goto_2

    .line 178
    :cond_4
    move v9, v3

    .line 179
    :goto_2
    iget-object v7, v7, Lx4/t;->b:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    const/16 v12, 0x2a

    .line 186
    .line 187
    if-gt v11, v12, :cond_5

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_5
    invoke-static {v12, v7}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    add-int/lit8 v11, v11, -0x1

    .line 199
    .line 200
    if-ltz v11, :cond_8

    .line 201
    .line 202
    :goto_3
    add-int/lit8 v12, v11, -0x1

    .line 203
    .line 204
    invoke-virtual {v7, v11}, Ljava/lang/String;->charAt(I)C

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    invoke-static {v13}, Landroid/support/v4/media/session/b;->y(C)Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-nez v13, :cond_6

    .line 213
    .line 214
    add-int/lit8 v11, v11, 0x1

    .line 215
    .line 216
    invoke-virtual {v7, v3, v11}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    goto :goto_5

    .line 221
    :cond_6
    if-gez v12, :cond_7

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_7
    move v11, v12

    .line 225
    goto :goto_3

    .line 226
    :cond_8
    :goto_4
    const-string v7, ""

    .line 227
    .line 228
    :goto_5
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    const-string v11, "\u2026"

    .line 233
    .line 234
    invoke-static {v7, v11}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    :goto_6
    if-eqz v9, :cond_9

    .line 239
    .line 240
    const v11, 0x7f110125

    .line 241
    .line 242
    .line 243
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    invoke-virtual {p0, v11, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    :cond_9
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    new-instance v11, Lw4/h0;

    .line 255
    .line 256
    invoke-direct {v11, p0, v5, v6}, Lw4/h0;-><init>(Lcom/exotv/net/PlayerActivity;Ljava/util/List;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, v7, v10, v11}, Lcom/exotv/net/PlayerActivity;->G(Ljava/lang/String;ZLy6/a;)Landroid/widget/TextView;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    if-eqz v9, :cond_a

    .line 264
    .line 265
    iput-object v6, p0, Lcom/exotv/net/PlayerActivity;->o0:Landroid/widget/TextView;

    .line 266
    .line 267
    :cond_a
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    move v6, v8

    .line 271
    goto :goto_1

    .line 272
    :cond_b
    invoke-static {}, Lm6/i;->v0()V

    .line 273
    .line 274
    .line 275
    throw v1

    .line 276
    :cond_c
    return-void

    .line 277
    :cond_d
    const-string v0, "b"

    .line 278
    .line 279
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v1
.end method

.method public final M()J
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/exotv/net/PlayerActivity;->k0:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->getCurrentPosition()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-wide v3, v1

    .line 18
    :goto_0
    cmp-long v0, v3, v1

    .line 19
    .line 20
    if-lez v0, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    iget-wide v3, p0, Lcom/exotv/net/PlayerActivity;->Q:J

    .line 24
    .line 25
    :goto_1
    const-wide/16 v5, 0x1388

    .line 26
    .line 27
    cmp-long v0, v3, v5

    .line 28
    .line 29
    if-lez v0, :cond_3

    .line 30
    .line 31
    return-wide v3

    .line 32
    :cond_3
    return-wide v1
.end method

.method public final N(Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const-string v1, "b"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->l:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v3, "PlayerActivity"

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "ignoring "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, ": the failure screen is up"

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 42
    .line 43
    iget v4, v0, Lc5/b1;->d:I

    .line 44
    .line 45
    iget v5, v0, Lc5/b1;->a:I

    .line 46
    .line 47
    iget-object v6, p0, Lcom/exotv/net/PlayerActivity;->W:Lw4/g0;

    .line 48
    .line 49
    iget-object v7, p0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 50
    .line 51
    const/4 v8, 0x1

    .line 52
    if-lt v4, v5, :cond_5

    .line 53
    .line 54
    iget v5, p0, Lcom/exotv/net/PlayerActivity;->M:I

    .line 55
    .line 56
    add-int/2addr v5, v8

    .line 57
    const/4 v9, 0x0

    .line 58
    const-string v10, " retries (reason="

    .line 59
    .line 60
    if-ltz v5, :cond_3

    .line 61
    .line 62
    iget-object v11, p0, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-ge v5, v11, :cond_3

    .line 69
    .line 70
    iput v5, p0, Lcom/exotv/net/PlayerActivity;->M:I

    .line 71
    .line 72
    iput v9, v0, Lc5/b1;->d:I

    .line 73
    .line 74
    iput-boolean v9, v0, Lc5/b1;->b:Z

    .line 75
    .line 76
    invoke-virtual {v7, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 77
    .line 78
    .line 79
    iput-object v2, p0, Lcom/exotv/net/PlayerActivity;->S:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lcom/exotv/net/model/BackupSource;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/exotv/net/model/BackupSource;->getUrl()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {v0}, Lcom/exotv/net/model/BackupSource;->getHeaders()Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->M()J

    .line 98
    .line 99
    .line 100
    move-result-wide v11

    .line 101
    invoke-virtual {p0, v6, v0, v11, v12}, Lcom/exotv/net/PlayerActivity;->T(Ljava/lang/String;Ljava/util/Map;J)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 105
    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_1

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->K()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->A()V

    .line 120
    .line 121
    .line 122
    :cond_1
    iget v0, p0, Lcom/exotv/net/PlayerActivity;->M:I

    .line 123
    .line 124
    add-int/2addr v0, v8

    .line 125
    iget-object v1, p0, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    const-string v2, "server "

    .line 132
    .line 133
    const-string v6, " spent "

    .line 134
    .line 135
    invoke-static {v5, v4, v2, v6, v10}, La1/a1;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string p1, "), now on server "

    .line 143
    .line 144
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p1, " of "

    .line 151
    .line 152
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_2
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v2

    .line 170
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v1, "giving up after "

    .line 173
    .line 174
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string p1, ")"

    .line 187
    .line 188
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v9}, Lcom/exotv/net/PlayerActivity;->P(Z)V

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Lcom/exotv/net/PlayerActivity;->S:Ljava/lang/String;

    .line 202
    .line 203
    if-nez p1, :cond_4

    .line 204
    .line 205
    const p1, 0x7f110109

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    const-string v0, "getString(...)"

    .line 213
    .line 214
    invoke-static {v0, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_4
    invoke-virtual {p0, p1}, Lcom/exotv/net/PlayerActivity;->R(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_5
    add-int/2addr v4, v8

    .line 222
    iput v4, v0, Lc5/b1;->d:I

    .line 223
    .line 224
    invoke-virtual {p0, v8}, Lcom/exotv/net/PlayerActivity;->P(Z)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 228
    .line 229
    .line 230
    const-wide/16 v0, 0x2bc

    .line 231
    .line 232
    invoke-virtual {v7, v6, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_6
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v2
.end method

.method public final O(Ljava/lang/String;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "exotv_subtitles"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const-string v1, "off"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, p1

    .line 20
    :goto_0
    const-string v2, "language"

    .line 21
    .line 22
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->b0:Li7/a0;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->X:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/exotv/net/PlayerActivity;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v1, Lc5/q0;

    .line 59
    .line 60
    const/4 v2, 0x4

    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v1, p0, p1, v3, v2}, Lc5/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x3

    .line 66
    invoke-static {v0, v3, v1, p1}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcom/exotv/net/PlayerActivity;->b0:Li7/a0;

    .line 71
    .line 72
    return-void
.end method

.method public final P(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, La5/b;->i:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, La5/b;->l:Landroid/widget/LinearLayout;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 p1, 0x8

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p1, "b"

    .line 26
    .line 27
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

.method public final Q()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->j:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v0, La5/b;->j:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, v0, La5/b;->F:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const v3, 0x7f050003

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget-object v0, v0, La5/b;->b:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    iget-object v0, v0, La5/b;->b:Landroid/widget/ImageView;

    .line 62
    .line 63
    new-instance v1, Lw4/g0;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-direct {v1, p0, v2}, Lw4/g0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :cond_4
    :goto_0
    iget-boolean v0, p0, Lcom/exotv/net/PlayerActivity;->k0:Z

    .line 90
    .line 91
    iget-object v1, p0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->v0:Lw4/n0;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->K:Lw4/g0;

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v2, 0xfa0

    .line 109
    .line 110
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1
.end method

.method public final R(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->l:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v3

    .line 20
    :goto_0
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->K:Lw4/g0;

    .line 21
    .line 22
    iget-object v5, p0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 23
    .line 24
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->U:Lw4/g0;

    .line 28
    .line 29
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->V:Lw4/g0;

    .line 33
    .line 34
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->W:Lw4/g0;

    .line 38
    .line 39
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->T:Lw4/n0;

    .line 43
    .line 44
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 48
    .line 49
    if-eqz v4, :cond_d

    .line 50
    .line 51
    iget-object v4, v4, La5/b;->j:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    const/16 v6, 0x8

    .line 54
    .line 55
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 59
    .line 60
    if-eqz v4, :cond_c

    .line 61
    .line 62
    iget-object v4, v4, La5/b;->F:Landroid/widget/LinearLayout;

    .line 63
    .line 64
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 68
    .line 69
    if-eqz v4, :cond_b

    .line 70
    .line 71
    iget-object v4, v4, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 72
    .line 73
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 77
    .line 78
    if-eqz v4, :cond_a

    .line 79
    .line 80
    iget-object v4, v4, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 81
    .line 82
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 86
    .line 87
    if-eqz v4, :cond_9

    .line 88
    .line 89
    iget-object v4, v4, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 90
    .line 91
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->v0:Lw4/n0;

    .line 95
    .line 96
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 100
    .line 101
    if-eqz v4, :cond_2

    .line 102
    .line 103
    invoke-interface {v4}, Landroidx/media3/exoplayer/ExoPlayer;->getCurrentPosition()J

    .line 104
    .line 105
    .line 106
    move-result-wide v5

    .line 107
    const-wide/16 v7, 0x0

    .line 108
    .line 109
    cmp-long v7, v5, v7

    .line 110
    .line 111
    if-lez v7, :cond_1

    .line 112
    .line 113
    iput-wide v5, p0, Lcom/exotv/net/PlayerActivity;->Q:J

    .line 114
    .line 115
    :cond_1
    invoke-interface {v4, v3}, Landroidx/media3/exoplayer/ExoPlayer;->setPlayWhenReady(Z)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v4}, Landroidx/media3/exoplayer/ExoPlayer;->stop()V

    .line 119
    .line 120
    .line 121
    :cond_2
    invoke-virtual {p0, v3}, Lcom/exotv/net/PlayerActivity;->P(Z)V

    .line 122
    .line 123
    .line 124
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 125
    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    iget-object v4, v4, La5/b;->l:Landroid/widget/LinearLayout;

    .line 129
    .line 130
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    iget-object v3, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 134
    .line 135
    if-eqz v3, :cond_7

    .line 136
    .line 137
    iget-object v3, v3, La5/b;->k:Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const v3, 0x7f050003

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_6

    .line 154
    .line 155
    if-nez v0, :cond_6

    .line 156
    .line 157
    iget-object p1, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 158
    .line 159
    if-eqz p1, :cond_5

    .line 160
    .line 161
    iget-object v0, p1, La5/b;->n:Landroid/widget/TextView;

    .line 162
    .line 163
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->t0:Landroid/view/View;

    .line 164
    .line 165
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->u0:Lw4/k0;

    .line 166
    .line 167
    if-eqz v0, :cond_3

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_3
    new-instance v0, Lw4/k0;

    .line 171
    .line 172
    const/4 v3, 0x0

    .line 173
    invoke-direct {v0, p0, v3}, Lw4/k0;-><init>(Lh/i;I)V

    .line 174
    .line 175
    .line 176
    iput-object v0, p0, Lcom/exotv/net/PlayerActivity;->u0:Lw4/k0;

    .line 177
    .line 178
    iget-object p1, p1, La5/b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 179
    .line 180
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 185
    .line 186
    .line 187
    :goto_1
    iget-object p1, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 188
    .line 189
    if-eqz p1, :cond_4

    .line 190
    .line 191
    iget-object p1, p1, La5/b;->n:Landroid/widget/TextView;

    .line 192
    .line 193
    new-instance v0, Lw4/g0;

    .line 194
    .line 195
    const/4 v1, 0x6

    .line 196
    invoke-direct {v0, p0, v1}, Lw4/g0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v1

    .line 207
    :cond_5
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_6
    return-void

    .line 212
    :cond_7
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v1

    .line 216
    :cond_8
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v1

    .line 220
    :cond_9
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v1

    .line 224
    :cond_a
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v1

    .line 228
    :cond_b
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v1

    .line 232
    :cond_c
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v1

    .line 236
    :cond_d
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v1

    .line 240
    :cond_e
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v1
.end method

.method public final S(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->D:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, La5/b;->D:Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1
.end method

.method public final T(Ljava/lang/String;Ljava/util/Map;J)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    iget-object v5, v1, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    invoke-interface {v5}, Landroidx/media3/exoplayer/ExoPlayer;->stop()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v5}, Landroidx/media3/exoplayer/ExoPlayer;->release()V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v5, 0x0

    .line 20
    iput-object v5, v1, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 21
    .line 22
    iget-object v6, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 23
    .line 24
    if-eqz v6, :cond_1b

    .line 25
    .line 26
    iget-object v6, v6, La5/b;->p:Landroidx/media3/ui/PlayerView;

    .line 27
    .line 28
    invoke-virtual {v6, v5}, Landroidx/media3/ui/PlayerView;->setPlayer(Landroidx/media3/common/d1;)V

    .line 29
    .line 30
    .line 31
    iget-object v6, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 32
    .line 33
    if-eqz v6, :cond_1a

    .line 34
    .line 35
    iget-object v6, v6, La5/b;->l:Landroid/widget/LinearLayout;

    .line 36
    .line 37
    const/16 v7, 0x8

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->H()V

    .line 43
    .line 44
    .line 45
    iget-object v6, v1, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 46
    .line 47
    iget-boolean v8, v6, Lc5/b1;->b:Z

    .line 48
    .line 49
    const/4 v9, 0x1

    .line 50
    if-eqz v8, :cond_1

    .line 51
    .line 52
    const/4 v8, 0x2

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget v8, v1, Lcom/exotv/net/PlayerActivity;->M:I

    .line 55
    .line 56
    add-int/2addr v8, v9

    .line 57
    iget-object v10, v1, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-ge v8, v10, :cond_2

    .line 64
    .line 65
    move v8, v9

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/4 v8, 0x3

    .line 68
    :goto_0
    iput v8, v6, Lc5/b1;->a:I

    .line 69
    .line 70
    iput-object v0, v1, Lcom/exotv/net/PlayerActivity;->x0:Ljava/lang/String;

    .line 71
    .line 72
    iput-object v2, v1, Lcom/exotv/net/PlayerActivity;->y0:Ljava/util/Map;

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const/4 v8, 0x0

    .line 79
    if-eqz v6, :cond_4

    .line 80
    .line 81
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_4

    .line 86
    .line 87
    :cond_3
    move v6, v8

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_3

    .line 98
    .line 99
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    check-cast v10, Ljava/lang/String;

    .line 104
    .line 105
    const-string v11, "User-Agent"

    .line 106
    .line 107
    invoke-static {v10, v11}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_5

    .line 112
    .line 113
    move v6, v9

    .line 114
    :goto_1
    new-instance v10, Ln6/f;

    .line 115
    .line 116
    invoke-direct {v10, v7}, Ln6/f;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10, v2}, Ln6/f;->putAll(Ljava/util/Map;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v7, "exo_referer"

    .line 127
    .line 128
    invoke-virtual {v2, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_a

    .line 133
    .line 134
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-nez v7, :cond_6

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    move-object v2, v5

    .line 142
    :goto_2
    if-eqz v2, :cond_a

    .line 143
    .line 144
    invoke-virtual {v10}, Ln6/f;->keySet()Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    move-object v11, v7

    .line 149
    check-cast v11, Ln6/g;

    .line 150
    .line 151
    iget-object v11, v11, Ln6/g;->k:Ln6/f;

    .line 152
    .line 153
    invoke-virtual {v11}, Ln6/f;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    if-eqz v11, :cond_7

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    check-cast v7, Ln6/g;

    .line 161
    .line 162
    invoke-virtual {v7}, Ln6/g;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-eqz v11, :cond_9

    .line 171
    .line 172
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    check-cast v11, Ljava/lang/String;

    .line 177
    .line 178
    const-string v12, "Referer"

    .line 179
    .line 180
    invoke-static {v11, v12}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    if-eqz v11, :cond_8

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_9
    :goto_3
    const-string v7, "Referer"

    .line 188
    .line 189
    invoke-virtual {v10, v7, v2}, Ln6/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_a
    :goto_4
    invoke-virtual {v10}, Ln6/f;->b()V

    .line 193
    .line 194
    .line 195
    iput-boolean v9, v10, Ln6/f;->v:Z

    .line 196
    .line 197
    iget v2, v10, Ln6/f;->r:I

    .line 198
    .line 199
    if-lez v2, :cond_b

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_b
    sget-object v10, Ln6/f;->w:Ln6/f;

    .line 203
    .line 204
    const-string v2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"

    .line 205
    .line 206
    invoke-static {v2, v10}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :goto_5
    new-instance v2, Li2/e;

    .line 210
    .line 211
    const/4 v7, 0x1

    .line 212
    invoke-direct {v2, v7}, Li2/e;-><init>(I)V

    .line 213
    .line 214
    .line 215
    iput-boolean v9, v2, Li2/e;->l:Z

    .line 216
    .line 217
    iget-object v7, v2, Li2/e;->m:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v7, La1/e;

    .line 220
    .line 221
    monitor-enter v7

    .line 222
    :try_start_0
    iput-object v5, v7, La1/e;->l:Ljava/lang/Object;

    .line 223
    .line 224
    iget-object v11, v7, La1/e;->k:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v11, Ljava/util/HashMap;

    .line 227
    .line 228
    invoke-virtual {v11}, Ljava/util/HashMap;->clear()V

    .line 229
    .line 230
    .line 231
    iget-object v11, v7, La1/e;->k:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v11, Ljava/util/HashMap;

    .line 234
    .line 235
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    .line 237
    .line 238
    monitor-exit v7

    .line 239
    const/16 v7, 0x1388

    .line 240
    .line 241
    iput v7, v2, Li2/e;->j:I

    .line 242
    .line 243
    const/16 v7, 0x2ee0

    .line 244
    .line 245
    iput v7, v2, Li2/e;->k:I

    .line 246
    .line 247
    if-eqz v6, :cond_c

    .line 248
    .line 249
    move-object v6, v5

    .line 250
    goto :goto_6

    .line 251
    :cond_c
    const-string v6, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36"

    .line 252
    .line 253
    :goto_6
    iput-object v6, v2, Li2/e;->n:Ljava/lang/Object;

    .line 254
    .line 255
    new-instance v6, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    .line 256
    .line 257
    invoke-direct {v6, v1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;-><init>(Landroid/content/Context;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v6, v2}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;->setDataSourceFactory(Lk1/g;)Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    const-string v6, "setDataSourceFactory(...)"

    .line 265
    .line 266
    invoke-static {v6, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    new-instance v6, Landroidx/media3/exoplayer/ExoPlayer$Builder;

    .line 270
    .line 271
    invoke-direct {v6, v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v2}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->setMediaSourceFactory(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/ExoPlayer$Builder;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v2}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->build()Landroidx/media3/exoplayer/ExoPlayer;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const-string v6, "build(...)"

    .line 283
    .line 284
    invoke-static {v6, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    new-instance v6, Landroidx/media3/common/c0;

    .line 288
    .line 289
    invoke-direct {v6}, Landroidx/media3/common/c0;-><init>()V

    .line 290
    .line 291
    .line 292
    new-instance v7, Landroidx/media3/common/f0;

    .line 293
    .line 294
    invoke-direct {v7}, Landroidx/media3/common/f0;-><init>()V

    .line 295
    .line 296
    .line 297
    sget-object v15, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 298
    .line 299
    sget-object v17, Lf6/l1;->n:Lf6/l1;

    .line 300
    .line 301
    new-instance v10, Landroidx/media3/common/h0;

    .line 302
    .line 303
    invoke-direct {v10}, Landroidx/media3/common/h0;-><init>()V

    .line 304
    .line 305
    .line 306
    sget-object v24, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 307
    .line 308
    if-nez v0, :cond_d

    .line 309
    .line 310
    move-object v11, v5

    .line 311
    goto :goto_7

    .line 312
    :cond_d
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    :goto_7
    const-string v12, "application/x-mpegURL"

    .line 317
    .line 318
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    if-eqz v0, :cond_e

    .line 327
    .line 328
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 329
    .line 330
    invoke-virtual {v0, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    const-string v13, "toLowerCase(...)"

    .line 335
    .line 336
    invoke-static {v13, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_e
    move-object v0, v5

    .line 341
    :goto_8
    if-nez v0, :cond_f

    .line 342
    .line 343
    const-string v0, ""

    .line 344
    .line 345
    :cond_f
    const-string v13, ".m3u8"

    .line 346
    .line 347
    invoke-static {v0, v13, v8}, Lh7/p;->m0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 348
    .line 349
    .line 350
    move-result v13

    .line 351
    if-eqz v13, :cond_10

    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_10
    const-string v13, ".mpd"

    .line 355
    .line 356
    invoke-static {v0, v13, v8}, Lh7/p;->m0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    if-eqz v13, :cond_11

    .line 361
    .line 362
    const-string v12, "application/dash+xml"

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_11
    const-string v13, ".mp4"

    .line 366
    .line 367
    invoke-static {v0, v13, v8}, Lh7/p;->m0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    if-nez v13, :cond_12

    .line 372
    .line 373
    const-string v13, ".m4v"

    .line 374
    .line 375
    invoke-static {v0, v13, v8}, Lh7/p;->m0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_13

    .line 380
    .line 381
    :cond_12
    const-string v12, "video/mp4"

    .line 382
    .line 383
    :cond_13
    :goto_9
    iget-object v0, v7, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 384
    .line 385
    if-eqz v0, :cond_14

    .line 386
    .line 387
    iget-object v0, v7, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 388
    .line 389
    if-eqz v0, :cond_15

    .line 390
    .line 391
    :cond_14
    move v8, v9

    .line 392
    :cond_15
    invoke-static {v8}, Lh1/a;->j(Z)V

    .line 393
    .line 394
    .line 395
    move-object v0, v10

    .line 396
    if-eqz v11, :cond_17

    .line 397
    .line 398
    new-instance v10, Landroidx/media3/common/j0;

    .line 399
    .line 400
    iget-object v8, v7, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 401
    .line 402
    if-eqz v8, :cond_16

    .line 403
    .line 404
    new-instance v8, Landroidx/media3/common/g0;

    .line 405
    .line 406
    invoke-direct {v8, v7}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 407
    .line 408
    .line 409
    move-object v13, v8

    .line 410
    goto :goto_a

    .line 411
    :cond_16
    move-object v13, v5

    .line 412
    :goto_a
    const/4 v14, 0x0

    .line 413
    const/16 v16, 0x0

    .line 414
    .line 415
    const/16 v18, 0x0

    .line 416
    .line 417
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    invoke-direct/range {v10 .. v20}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 423
    .line 424
    .line 425
    move-object/from16 v21, v10

    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_17
    move-object/from16 v21, v5

    .line 429
    .line 430
    :goto_b
    new-instance v18, Landroidx/media3/common/o0;

    .line 431
    .line 432
    const-string v19, ""

    .line 433
    .line 434
    new-instance v7, Landroidx/media3/common/e0;

    .line 435
    .line 436
    invoke-direct {v7, v6}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 437
    .line 438
    .line 439
    new-instance v6, Landroidx/media3/common/i0;

    .line 440
    .line 441
    invoke-direct {v6, v0}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 442
    .line 443
    .line 444
    sget-object v23, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 445
    .line 446
    move-object/from16 v22, v6

    .line 447
    .line 448
    move-object/from16 v20, v7

    .line 449
    .line 450
    invoke-direct/range {v18 .. v24}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 451
    .line 452
    .line 453
    move-object/from16 v0, v18

    .line 454
    .line 455
    invoke-interface {v2, v0}, Landroidx/media3/exoplayer/ExoPlayer;->setMediaItem(Landroidx/media3/common/o0;)V

    .line 456
    .line 457
    .line 458
    const-wide/16 v6, 0x0

    .line 459
    .line 460
    cmp-long v0, v3, v6

    .line 461
    .line 462
    if-lez v0, :cond_18

    .line 463
    .line 464
    invoke-interface {v2, v3, v4}, Landroidx/media3/exoplayer/ExoPlayer;->seekTo(J)V

    .line 465
    .line 466
    .line 467
    :cond_18
    invoke-interface {v2, v9}, Landroidx/media3/exoplayer/ExoPlayer;->setPlayWhenReady(Z)V

    .line 468
    .line 469
    .line 470
    new-instance v0, Lw4/r0;

    .line 471
    .line 472
    invoke-direct {v0, v1, v2}, Lw4/r0;-><init>(Lcom/exotv/net/PlayerActivity;Landroidx/media3/exoplayer/ExoPlayer;)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v2, v0}, Landroidx/media3/exoplayer/ExoPlayer;->addListener(Landroidx/media3/common/b1;)V

    .line 476
    .line 477
    .line 478
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 479
    .line 480
    if-eqz v0, :cond_19

    .line 481
    .line 482
    iget-object v0, v0, La5/b;->p:Landroidx/media3/ui/PlayerView;

    .line 483
    .line 484
    invoke-virtual {v0, v2}, Landroidx/media3/ui/PlayerView;->setPlayer(Landroidx/media3/common/d1;)V

    .line 485
    .line 486
    .line 487
    invoke-interface {v2}, Landroidx/media3/exoplayer/ExoPlayer;->prepare()V

    .line 488
    .line 489
    .line 490
    iput-object v2, v1, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 491
    .line 492
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->u()V

    .line 493
    .line 494
    .line 495
    const-wide/16 v2, -0x1

    .line 496
    .line 497
    iput-wide v2, v1, Lcom/exotv/net/PlayerActivity;->Q:J

    .line 498
    .line 499
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 500
    .line 501
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 502
    .line 503
    .line 504
    move-result-wide v2

    .line 505
    iput-wide v2, v0, Lc5/b1;->c:J

    .line 506
    .line 507
    invoke-virtual {v1, v9}, Lcom/exotv/net/PlayerActivity;->P(Z)V

    .line 508
    .line 509
    .line 510
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 511
    .line 512
    iget-object v2, v1, Lcom/exotv/net/PlayerActivity;->U:Lw4/g0;

    .line 513
    .line 514
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 515
    .line 516
    .line 517
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 518
    .line 519
    iget-object v2, v1, Lcom/exotv/net/PlayerActivity;->V:Lw4/g0;

    .line 520
    .line 521
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 522
    .line 523
    .line 524
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 525
    .line 526
    iget-object v2, v1, Lcom/exotv/net/PlayerActivity;->W:Lw4/g0;

    .line 527
    .line 528
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 529
    .line 530
    .line 531
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 532
    .line 533
    iget-object v2, v1, Lcom/exotv/net/PlayerActivity;->U:Lw4/g0;

    .line 534
    .line 535
    const-wide/16 v3, 0x2710

    .line 536
    .line 537
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->v()V

    .line 541
    .line 542
    .line 543
    return-void

    .line 544
    :cond_19
    const-string v0, "b"

    .line 545
    .line 546
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v5

    .line 550
    :catchall_0
    move-exception v0

    .line 551
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 552
    throw v0

    .line 553
    :cond_1a
    const-string v0, "b"

    .line 554
    .line 555
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v5

    .line 559
    :cond_1b
    const-string v0, "b"

    .line 560
    .line 561
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    throw v5
.end method

.method public final U()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v3, 0x8

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->J()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->z()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_5
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1
.end method

.method public final V()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v3, 0x8

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->K()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->A()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_5
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1
.end method

.method public final W()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v3, 0x8

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v4}, Lcom/exotv/net/PlayerActivity;->B(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_5
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1e

    .line 11
    .line 12
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 13
    .line 14
    const-string v1, "b"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_1d

    .line 18
    .line 19
    iget-object v0, v0, La5/b;->l:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-super {p0, p1}, Lh/i;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v3, 0x16

    .line 37
    .line 38
    const/16 v4, 0x15

    .line 39
    .line 40
    const/16 v5, 0x14

    .line 41
    .line 42
    const/16 v6, 0x13

    .line 43
    .line 44
    const/4 v7, 0x1

    .line 45
    if-eq v0, v6, :cond_1

    .line 46
    .line 47
    if-eq v0, v5, :cond_1

    .line 48
    .line 49
    if-eq v0, v4, :cond_1

    .line 50
    .line 51
    if-eq v0, v3, :cond_1

    .line 52
    .line 53
    const/16 v8, 0x17

    .line 54
    .line 55
    if-eq v0, v8, :cond_1

    .line 56
    .line 57
    const/16 v8, 0x42

    .line 58
    .line 59
    if-ne v0, v8, :cond_3

    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 62
    .line 63
    if-eqz v0, :cond_1c

    .line 64
    .line 65
    iget-object v0, v0, La5/b;->j:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 74
    .line 75
    .line 76
    return v7

    .line 77
    :cond_2
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 78
    .line 79
    iget-object v8, p0, Lcom/exotv/net/PlayerActivity;->K:Lw4/g0;

    .line 80
    .line 81
    invoke-virtual {v0, v8}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    const-wide/16 v9, 0xfa0

    .line 85
    .line 86
    invoke-virtual {v0, v8, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 90
    .line 91
    if-eqz v0, :cond_1b

    .line 92
    .line 93
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/4 v8, 0x0

    .line 100
    if-nez v0, :cond_c

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-ne v0, v6, :cond_4

    .line 107
    .line 108
    move v0, v7

    .line 109
    goto :goto_0

    .line 110
    :cond_4
    move v0, v8

    .line 111
    :goto_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-ne v6, v5, :cond_5

    .line 116
    .line 117
    move v5, v7

    .line 118
    goto :goto_1

    .line 119
    :cond_5
    move v5, v8

    .line 120
    :goto_1
    if-nez v0, :cond_6

    .line 121
    .line 122
    if-eqz v5, :cond_c

    .line 123
    .line 124
    :cond_6
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    if-eqz v6, :cond_9

    .line 129
    .line 130
    iget-object v9, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 131
    .line 132
    if-eqz v9, :cond_8

    .line 133
    .line 134
    iget-object v9, v9, La5/b;->y:Landroid/widget/LinearLayout;

    .line 135
    .line 136
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    sub-int/2addr v10, v7

    .line 141
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    if-ne v6, v9, :cond_9

    .line 146
    .line 147
    if-eqz v5, :cond_9

    .line 148
    .line 149
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 150
    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    iget-object v0, v0, La5/b;->h:Landroid/widget/ImageView;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_c

    .line 160
    .line 161
    goto/16 :goto_9

    .line 162
    .line 163
    :cond_7
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v2

    .line 167
    :cond_8
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v2

    .line 171
    :cond_9
    if-eqz v6, :cond_c

    .line 172
    .line 173
    iget-object v5, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 174
    .line 175
    if-eqz v5, :cond_b

    .line 176
    .line 177
    iget-object v5, v5, La5/b;->y:Landroid/widget/LinearLayout;

    .line 178
    .line 179
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    if-ne v6, v5, :cond_c

    .line 184
    .line 185
    if-eqz v0, :cond_c

    .line 186
    .line 187
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 188
    .line 189
    if-eqz v0, :cond_a

    .line 190
    .line 191
    iget-object v0, v0, La5/b;->h:Landroid/widget/ImageView;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_c

    .line 198
    .line 199
    goto/16 :goto_9

    .line 200
    .line 201
    :cond_a
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v2

    .line 205
    :cond_b
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v2

    .line 209
    :cond_c
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 210
    .line 211
    if-eqz v0, :cond_1a

    .line 212
    .line 213
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 214
    .line 215
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-nez v0, :cond_e

    .line 220
    .line 221
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 222
    .line 223
    if-eqz v0, :cond_d

    .line 224
    .line 225
    iget-object v5, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 226
    .line 227
    iget-object v0, v0, La5/b;->e:Landroid/widget/ImageView;

    .line 228
    .line 229
    new-instance v6, Ll6/d;

    .line 230
    .line 231
    invoke-direct {v6, v5, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_d
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v2

    .line 239
    :cond_e
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 240
    .line 241
    if-eqz v0, :cond_19

    .line 242
    .line 243
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 244
    .line 245
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_10

    .line 250
    .line 251
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 252
    .line 253
    if-eqz v0, :cond_f

    .line 254
    .line 255
    iget-object v5, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 256
    .line 257
    iget-object v0, v0, La5/b;->g:Landroid/widget/ImageView;

    .line 258
    .line 259
    new-instance v6, Ll6/d;

    .line 260
    .line 261
    invoke-direct {v6, v5, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_f
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v2

    .line 269
    :cond_10
    move-object v6, v2

    .line 270
    :goto_2
    if-eqz v6, :cond_1e

    .line 271
    .line 272
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eq v0, v4, :cond_12

    .line 277
    .line 278
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-ne v0, v3, :cond_11

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_11
    move v0, v8

    .line 286
    goto :goto_4

    .line 287
    :cond_12
    :goto_3
    move v0, v7

    .line 288
    :goto_4
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    if-eqz v3, :cond_18

    .line 293
    .line 294
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    :goto_5
    instance-of v5, v4, Landroid/view/View;

    .line 299
    .line 300
    if-eqz v5, :cond_15

    .line 301
    .line 302
    iget-object v5, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 303
    .line 304
    if-eqz v5, :cond_14

    .line 305
    .line 306
    iget-object v5, v5, La5/b;->q:Landroid/widget/LinearLayout;

    .line 307
    .line 308
    if-ne v4, v5, :cond_13

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_13
    check-cast v4, Landroid/view/View;

    .line 312
    .line 313
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    goto :goto_5

    .line 318
    :cond_14
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v2

    .line 322
    :cond_15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    :goto_6
    instance-of v4, v3, Landroid/view/View;

    .line 327
    .line 328
    if-eqz v4, :cond_18

    .line 329
    .line 330
    iget-object v4, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 331
    .line 332
    if-eqz v4, :cond_17

    .line 333
    .line 334
    iget-object v4, v4, La5/b;->w:Landroid/widget/LinearLayout;

    .line 335
    .line 336
    if-ne v3, v4, :cond_16

    .line 337
    .line 338
    :goto_7
    move v8, v7

    .line 339
    goto :goto_8

    .line 340
    :cond_16
    check-cast v3, Landroid/view/View;

    .line 341
    .line 342
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    goto :goto_6

    .line 347
    :cond_17
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v2

    .line 351
    :cond_18
    :goto_8
    if-eqz v0, :cond_1e

    .line 352
    .line 353
    if-eqz v8, :cond_1e

    .line 354
    .line 355
    iget-object v0, v6, Ll6/d;->k:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Landroid/widget/ImageView;

    .line 358
    .line 359
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_1e

    .line 364
    .line 365
    :goto_9
    return v7

    .line 366
    :cond_19
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw v2

    .line 370
    :cond_1a
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v2

    .line 374
    :cond_1b
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v2

    .line 378
    :cond_1c
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v2

    .line 382
    :cond_1d
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    throw v2

    .line 386
    :cond_1e
    invoke-super {p0, p1}, Lh/i;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    return p1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Lh/i;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Lb/l;->i()Lb/x;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v2, La1/f0;

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v2, v1, v3}, La1/f0;-><init>(Lh/i;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lb/x;->a(Landroidx/lifecycle/v;La1/f0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v2, 0x80

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->rotationAnimation:I

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 43
    .line 44
    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v2, 0x1c

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    if-lt v0, v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2, v3}, Ln0/b;->c(Landroid/view/WindowManager$LayoutParams;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-static {v0, v2}, Landroid/support/v4/media/session/b;->G(Landroid/view/Window;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const v4, 0x7f0d001e

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-virtual {v0, v4, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const v4, 0x7f0a0070

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    move-object v9, v6

    .line 98
    check-cast v9, Landroid/widget/ImageView;

    .line 99
    .line 100
    if-eqz v9, :cond_44

    .line 101
    .line 102
    const v4, 0x7f0a0071

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    move-object v10, v6

    .line 110
    check-cast v10, Landroid/widget/ImageView;

    .line 111
    .line 112
    if-eqz v10, :cond_44

    .line 113
    .line 114
    const v4, 0x7f0a0072

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    move-object v11, v6

    .line 122
    check-cast v11, Landroid/widget/ImageView;

    .line 123
    .line 124
    if-eqz v11, :cond_44

    .line 125
    .line 126
    const v4, 0x7f0a0073

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    move-object v12, v6

    .line 134
    check-cast v12, Landroid/widget/ImageView;

    .line 135
    .line 136
    if-eqz v12, :cond_44

    .line 137
    .line 138
    const v4, 0x7f0a0074

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    move-object v13, v6

    .line 146
    check-cast v13, Landroid/widget/ImageView;

    .line 147
    .line 148
    if-eqz v13, :cond_44

    .line 149
    .line 150
    const v4, 0x7f0a0075

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    move-object v14, v6

    .line 158
    check-cast v14, Landroid/widget/ImageView;

    .line 159
    .line 160
    if-eqz v14, :cond_44

    .line 161
    .line 162
    const v4, 0x7f0a0076

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    move-object v15, v6

    .line 170
    check-cast v15, Landroid/widget/ImageView;

    .line 171
    .line 172
    if-eqz v15, :cond_44

    .line 173
    .line 174
    const v4, 0x7f0a0077

    .line 175
    .line 176
    .line 177
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    move-object/from16 v16, v6

    .line 182
    .line 183
    check-cast v16, Landroid/widget/FrameLayout;

    .line 184
    .line 185
    if-eqz v16, :cond_44

    .line 186
    .line 187
    const v4, 0x7f0a0078

    .line 188
    .line 189
    .line 190
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    check-cast v6, Landroid/widget/ProgressBar;

    .line 195
    .line 196
    if-eqz v6, :cond_44

    .line 197
    .line 198
    const v4, 0x7f0a00a5

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    move-object/from16 v17, v6

    .line 206
    .line 207
    check-cast v17, Landroid/widget/LinearLayout;

    .line 208
    .line 209
    if-eqz v17, :cond_44

    .line 210
    .line 211
    const v4, 0x7f0a00a6

    .line 212
    .line 213
    .line 214
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    check-cast v6, Landroid/widget/LinearLayout;

    .line 219
    .line 220
    if-eqz v6, :cond_44

    .line 221
    .line 222
    const v4, 0x7f0a01d5

    .line 223
    .line 224
    .line 225
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    move-object/from16 v18, v6

    .line 230
    .line 231
    check-cast v18, Landroid/widget/TextView;

    .line 232
    .line 233
    if-eqz v18, :cond_44

    .line 234
    .line 235
    const v4, 0x7f0a01d6

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    move-object/from16 v19, v6

    .line 243
    .line 244
    check-cast v19, Landroid/widget/LinearLayout;

    .line 245
    .line 246
    if-eqz v19, :cond_44

    .line 247
    .line 248
    const v4, 0x7f0a01d7

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    move-object/from16 v20, v6

    .line 256
    .line 257
    check-cast v20, Landroid/widget/TextView;

    .line 258
    .line 259
    if-eqz v20, :cond_44

    .line 260
    .line 261
    const v4, 0x7f0a01d8

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    move-object/from16 v21, v6

    .line 269
    .line 270
    check-cast v21, Landroid/widget/TextView;

    .line 271
    .line 272
    if-eqz v21, :cond_44

    .line 273
    .line 274
    const v4, 0x7f0a01d9

    .line 275
    .line 276
    .line 277
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    move-object/from16 v22, v6

    .line 282
    .line 283
    check-cast v22, Landroid/widget/TextView;

    .line 284
    .line 285
    if-eqz v22, :cond_44

    .line 286
    .line 287
    const v4, 0x7f0a01da

    .line 288
    .line 289
    .line 290
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    move-object/from16 v23, v6

    .line 295
    .line 296
    check-cast v23, Landroidx/media3/ui/PlayerView;

    .line 297
    .line 298
    if-eqz v23, :cond_44

    .line 299
    .line 300
    const v4, 0x7f0a01e2

    .line 301
    .line 302
    .line 303
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    move-object/from16 v24, v6

    .line 308
    .line 309
    check-cast v24, Landroid/widget/LinearLayout;

    .line 310
    .line 311
    if-eqz v24, :cond_44

    .line 312
    .line 313
    const v4, 0x7f0a01e3

    .line 314
    .line 315
    .line 316
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    move-object/from16 v25, v6

    .line 321
    .line 322
    check-cast v25, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 323
    .line 324
    if-eqz v25, :cond_44

    .line 325
    .line 326
    const v4, 0x7f0a0205

    .line 327
    .line 328
    .line 329
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    move-object/from16 v26, v6

    .line 334
    .line 335
    check-cast v26, Landroid/widget/SeekBar;

    .line 336
    .line 337
    if-eqz v26, :cond_44

    .line 338
    .line 339
    const v4, 0x7f0a0206

    .line 340
    .line 341
    .line 342
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    move-object/from16 v27, v6

    .line 347
    .line 348
    check-cast v27, Landroid/widget/LinearLayout;

    .line 349
    .line 350
    if-eqz v27, :cond_44

    .line 351
    .line 352
    const v4, 0x7f0a0207

    .line 353
    .line 354
    .line 355
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    move-object/from16 v28, v6

    .line 360
    .line 361
    check-cast v28, Landroid/widget/TextView;

    .line 362
    .line 363
    if-eqz v28, :cond_44

    .line 364
    .line 365
    const v4, 0x7f0a0208

    .line 366
    .line 367
    .line 368
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    move-object/from16 v29, v6

    .line 373
    .line 374
    check-cast v29, Landroid/widget/TextView;

    .line 375
    .line 376
    if-eqz v29, :cond_44

    .line 377
    .line 378
    const v4, 0x7f0a020c

    .line 379
    .line 380
    .line 381
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    move-object/from16 v30, v6

    .line 386
    .line 387
    check-cast v30, Landroid/widget/LinearLayout;

    .line 388
    .line 389
    if-eqz v30, :cond_44

    .line 390
    .line 391
    const v4, 0x7f0a020d

    .line 392
    .line 393
    .line 394
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    move-object/from16 v31, v6

    .line 399
    .line 400
    check-cast v31, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 401
    .line 402
    if-eqz v31, :cond_44

    .line 403
    .line 404
    const v4, 0x7f0a023a

    .line 405
    .line 406
    .line 407
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    move-object/from16 v32, v6

    .line 412
    .line 413
    check-cast v32, Landroid/widget/LinearLayout;

    .line 414
    .line 415
    if-eqz v32, :cond_44

    .line 416
    .line 417
    const v4, 0x7f0a023b

    .line 418
    .line 419
    .line 420
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    move-object/from16 v33, v6

    .line 425
    .line 426
    check-cast v33, Landroid/widget/ScrollView;

    .line 427
    .line 428
    if-eqz v33, :cond_44

    .line 429
    .line 430
    const v4, 0x7f0a023c

    .line 431
    .line 432
    .line 433
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    move-object/from16 v34, v6

    .line 438
    .line 439
    check-cast v34, Landroid/widget/LinearLayout;

    .line 440
    .line 441
    if-eqz v34, :cond_44

    .line 442
    .line 443
    const v4, 0x7f0a023d

    .line 444
    .line 445
    .line 446
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    move-object/from16 v35, v6

    .line 451
    .line 452
    check-cast v35, Landroid/widget/ScrollView;

    .line 453
    .line 454
    if-eqz v35, :cond_44

    .line 455
    .line 456
    const v4, 0x7f0a023e

    .line 457
    .line 458
    .line 459
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    move-object/from16 v36, v6

    .line 464
    .line 465
    check-cast v36, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 466
    .line 467
    if-eqz v36, :cond_44

    .line 468
    .line 469
    const v4, 0x7f0a023f

    .line 470
    .line 471
    .line 472
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    move-object/from16 v37, v6

    .line 477
    .line 478
    check-cast v37, Landroid/widget/TextView;

    .line 479
    .line 480
    if-eqz v37, :cond_44

    .line 481
    .line 482
    const v4, 0x7f0a0240

    .line 483
    .line 484
    .line 485
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    move-object/from16 v38, v6

    .line 490
    .line 491
    check-cast v38, Landroid/widget/TextView;

    .line 492
    .line 493
    if-eqz v38, :cond_44

    .line 494
    .line 495
    const v4, 0x7f0a026a

    .line 496
    .line 497
    .line 498
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    move-object/from16 v39, v6

    .line 503
    .line 504
    check-cast v39, Landroid/widget/LinearLayout;

    .line 505
    .line 506
    if-eqz v39, :cond_44

    .line 507
    .line 508
    const v4, 0x7f0a026d

    .line 509
    .line 510
    .line 511
    invoke-static {v0, v4}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 512
    .line 513
    .line 514
    move-result-object v40

    .line 515
    if-eqz v40, :cond_44

    .line 516
    .line 517
    new-instance v7, La5/b;

    .line 518
    .line 519
    move-object v8, v0

    .line 520
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 521
    .line 522
    invoke-direct/range {v7 .. v40}, La5/b;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/media3/ui/PlayerView;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/SeekBar;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    iput-object v7, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 526
    .line 527
    invoke-virtual {v1, v8}, Lh/i;->setContentView(Landroid/view/View;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->E()V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    const-string v4, "exo_url"

    .line 538
    .line 539
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    const-string v4, "exo_title"

    .line 548
    .line 549
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    if-nez v0, :cond_1

    .line 554
    .line 555
    const-string v0, ""

    .line 556
    .line 557
    :cond_1
    move-object v4, v0

    .line 558
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    const-string v6, "exo_headers"

    .line 563
    .line 564
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    const-string v6, "keys(...)"

    .line 569
    .line 570
    sget-object v8, Lm6/q;->j:Lm6/q;

    .line 571
    .line 572
    if-eqz v0, :cond_3

    .line 573
    .line 574
    :try_start_0
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 575
    .line 576
    .line 577
    move-result v9

    .line 578
    if-eqz v9, :cond_2

    .line 579
    .line 580
    goto :goto_1

    .line 581
    :cond_2
    new-instance v9, Lorg/json/JSONObject;

    .line 582
    .line 583
    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v9}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v6, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    new-instance v10, Lg7/g;

    .line 594
    .line 595
    const/4 v11, 0x1

    .line 596
    invoke-direct {v10, v11, v0}, Lg7/g;-><init>(ILjava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    new-instance v0, Lg7/a;

    .line 600
    .line 601
    invoke-direct {v0, v10}, Lg7/a;-><init>(Lg7/h;)V

    .line 602
    .line 603
    .line 604
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 605
    .line 606
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v0}, Lg7/a;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v11

    .line 617
    if-eqz v11, :cond_4

    .line 618
    .line 619
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v11

    .line 623
    move-object v12, v11

    .line 624
    check-cast v12, Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v12

    .line 630
    invoke-interface {v10, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 631
    .line 632
    .line 633
    goto :goto_0

    .line 634
    :catchall_0
    move-exception v0

    .line 635
    invoke-static {v0}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    goto :goto_2

    .line 640
    :cond_3
    :goto_1
    move-object v10, v8

    .line 641
    :cond_4
    move-object v0, v10

    .line 642
    :goto_2
    instance-of v9, v0, Ll6/e;

    .line 643
    .line 644
    if-eqz v9, :cond_5

    .line 645
    .line 646
    goto :goto_3

    .line 647
    :cond_5
    move-object v8, v0

    .line 648
    :goto_3
    check-cast v8, Ljava/util/Map;

    .line 649
    .line 650
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    const-string v9, "exo_backups"

    .line 655
    .line 656
    invoke-virtual {v0, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    sget-object v9, Lm6/p;->j:Lm6/p;

    .line 661
    .line 662
    if-eqz v0, :cond_6

    .line 663
    .line 664
    :try_start_1
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 665
    .line 666
    .line 667
    move-result v10

    .line 668
    if-eqz v10, :cond_7

    .line 669
    .line 670
    :cond_6
    move-object/from16 p1, v5

    .line 671
    .line 672
    goto/16 :goto_a

    .line 673
    .line 674
    :cond_7
    new-instance v10, Lorg/json/JSONArray;

    .line 675
    .line 676
    invoke-direct {v10, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    invoke-static {}, Lcom/bumptech/glide/d;->w()Ln6/c;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 684
    .line 685
    .line 686
    move-result v11

    .line 687
    move v12, v2

    .line 688
    :goto_4
    if-ge v12, v11, :cond_d

    .line 689
    .line 690
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v13

    .line 694
    instance-of v14, v13, Ljava/lang/String;

    .line 695
    .line 696
    if-eqz v14, :cond_a

    .line 697
    .line 698
    move-object v14, v13

    .line 699
    check-cast v14, Ljava/lang/String;

    .line 700
    .line 701
    invoke-static {v14}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 702
    .line 703
    .line 704
    move-result v14

    .line 705
    if-nez v14, :cond_8

    .line 706
    .line 707
    goto :goto_5

    .line 708
    :cond_8
    move-object v13, v5

    .line 709
    :goto_5
    move-object v15, v13

    .line 710
    check-cast v15, Ljava/lang/String;

    .line 711
    .line 712
    if-eqz v15, :cond_9

    .line 713
    .line 714
    new-instance v14, Lcom/exotv/net/model/BackupSource;

    .line 715
    .line 716
    const/16 v18, 0x6

    .line 717
    .line 718
    const/16 v19, 0x0

    .line 719
    .line 720
    const/16 v16, 0x0

    .line 721
    .line 722
    const/16 v17, 0x0

    .line 723
    .line 724
    invoke-direct/range {v14 .. v19}, Lcom/exotv/net/model/BackupSource;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILz6/e;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v0, v14}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    :cond_9
    move-object/from16 p1, v5

    .line 731
    .line 732
    goto/16 :goto_8

    .line 733
    .line 734
    :catchall_1
    move-exception v0

    .line 735
    move-object/from16 p1, v5

    .line 736
    .line 737
    goto/16 :goto_9

    .line 738
    .line 739
    :cond_a
    instance-of v14, v13, Lorg/json/JSONObject;

    .line 740
    .line 741
    if-eqz v14, :cond_9

    .line 742
    .line 743
    move-object v14, v13

    .line 744
    check-cast v14, Lorg/json/JSONObject;

    .line 745
    .line 746
    const-string v15, "url"

    .line 747
    .line 748
    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v14

    .line 752
    invoke-static {v14}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    invoke-static {v14}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 756
    .line 757
    .line 758
    move-result v15

    .line 759
    if-nez v15, :cond_9

    .line 760
    .line 761
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 762
    .line 763
    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 764
    .line 765
    .line 766
    move-object/from16 p1, v5

    .line 767
    .line 768
    :try_start_2
    move-object v5, v13

    .line 769
    check-cast v5, Lorg/json/JSONObject;

    .line 770
    .line 771
    const-string v2, "headers"

    .line 772
    .line 773
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    if-eqz v2, :cond_b

    .line 778
    .line 779
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 780
    .line 781
    .line 782
    move-result-object v5

    .line 783
    invoke-static {v6, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v17

    .line 790
    if-eqz v17, :cond_b

    .line 791
    .line 792
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v17

    .line 796
    move-object/from16 v3, v17

    .line 797
    .line 798
    check-cast v3, Ljava/lang/String;

    .line 799
    .line 800
    move-object/from16 v17, v5

    .line 801
    .line 802
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    invoke-interface {v15, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-object/from16 v5, v17

    .line 810
    .line 811
    const/4 v3, 0x1

    .line 812
    goto :goto_6

    .line 813
    :catchall_2
    move-exception v0

    .line 814
    goto :goto_9

    .line 815
    :cond_b
    check-cast v13, Lorg/json/JSONObject;

    .line 816
    .line 817
    const-string v2, "name"

    .line 818
    .line 819
    invoke-virtual {v13, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    if-nez v3, :cond_c

    .line 831
    .line 832
    goto :goto_7

    .line 833
    :cond_c
    move-object/from16 v2, p1

    .line 834
    .line 835
    :goto_7
    new-instance v3, Lcom/exotv/net/model/BackupSource;

    .line 836
    .line 837
    invoke-direct {v3, v14, v15, v2}, Lcom/exotv/net/model/BackupSource;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, v3}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 844
    .line 845
    move-object/from16 v5, p1

    .line 846
    .line 847
    const/4 v2, 0x0

    .line 848
    const/4 v3, 0x1

    .line 849
    goto/16 :goto_4

    .line 850
    .line 851
    :cond_d
    move-object/from16 p1, v5

    .line 852
    .line 853
    invoke-static {v0}, Lcom/bumptech/glide/d;->h(Ln6/c;)Ln6/c;

    .line 854
    .line 855
    .line 856
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 857
    goto :goto_b

    .line 858
    :goto_9
    invoke-static {v0}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    goto :goto_b

    .line 863
    :goto_a
    move-object v0, v9

    .line 864
    :goto_b
    instance-of v2, v0, Ll6/e;

    .line 865
    .line 866
    if-eqz v2, :cond_e

    .line 867
    .line 868
    goto :goto_c

    .line 869
    :cond_e
    move-object v9, v0

    .line 870
    :goto_c
    move-object v0, v9

    .line 871
    check-cast v0, Ljava/util/List;

    .line 872
    .line 873
    if-eqz v7, :cond_13

    .line 874
    .line 875
    invoke-static {v7}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 876
    .line 877
    .line 878
    move-result v2

    .line 879
    if-eqz v2, :cond_f

    .line 880
    .line 881
    goto :goto_e

    .line 882
    :cond_f
    if-eqz v0, :cond_10

    .line 883
    .line 884
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    if-eqz v2, :cond_10

    .line 889
    .line 890
    goto :goto_d

    .line 891
    :cond_10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    :cond_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    if-eqz v3, :cond_12

    .line 900
    .line 901
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    check-cast v3, Lcom/exotv/net/model/BackupSource;

    .line 906
    .line 907
    invoke-virtual {v3}, Lcom/exotv/net/model/BackupSource;->getUrl()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    invoke-static {v3, v7}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v3

    .line 915
    if-eqz v3, :cond_11

    .line 916
    .line 917
    goto :goto_e

    .line 918
    :cond_12
    :goto_d
    new-instance v6, Lcom/exotv/net/model/BackupSource;

    .line 919
    .line 920
    const/4 v10, 0x4

    .line 921
    const/4 v11, 0x0

    .line 922
    const/4 v9, 0x0

    .line 923
    invoke-direct/range {v6 .. v11}, Lcom/exotv/net/model/BackupSource;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILz6/e;)V

    .line 924
    .line 925
    .line 926
    invoke-static {v6}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    invoke-static {v2, v0}, Lm6/h;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    :cond_13
    :goto_e
    iput-object v0, v1, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 935
    .line 936
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    const-string v2, "exo_tmdb_id"

    .line 941
    .line 942
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    if-eqz v0, :cond_15

    .line 947
    .line 948
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 949
    .line 950
    .line 951
    move-result v0

    .line 952
    if-eqz v0, :cond_14

    .line 953
    .line 954
    goto :goto_f

    .line 955
    :cond_14
    const/4 v0, 0x0

    .line 956
    goto :goto_10

    .line 957
    :cond_15
    :goto_f
    const/4 v0, 0x1

    .line 958
    :goto_10
    xor-int/lit8 v3, v0, 0x1

    .line 959
    .line 960
    iput-boolean v3, v1, Lcom/exotv/net/PlayerActivity;->k0:Z

    .line 961
    .line 962
    iget-object v3, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 963
    .line 964
    const-string v5, "b"

    .line 965
    .line 966
    if-eqz v3, :cond_43

    .line 967
    .line 968
    iget-object v3, v3, La5/b;->t:Landroid/widget/LinearLayout;

    .line 969
    .line 970
    const/16 v6, 0x8

    .line 971
    .line 972
    if-nez v0, :cond_16

    .line 973
    .line 974
    const/4 v0, 0x0

    .line 975
    goto :goto_11

    .line 976
    :cond_16
    move v0, v6

    .line 977
    :goto_11
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 978
    .line 979
    .line 980
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 981
    .line 982
    if-eqz v0, :cond_42

    .line 983
    .line 984
    iget-object v0, v0, La5/b;->o:Landroid/widget/TextView;

    .line 985
    .line 986
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 987
    .line 988
    .line 989
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 990
    .line 991
    if-eqz v0, :cond_41

    .line 992
    .line 993
    iget-object v0, v0, La5/b;->o:Landroid/widget/TextView;

    .line 994
    .line 995
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    if-eqz v3, :cond_17

    .line 1000
    .line 1001
    goto :goto_12

    .line 1002
    :cond_17
    const/4 v6, 0x0

    .line 1003
    :goto_12
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1004
    .line 1005
    .line 1006
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1007
    .line 1008
    if-eqz v0, :cond_40

    .line 1009
    .line 1010
    iget-object v0, v0, La5/b;->n:Landroid/widget/TextView;

    .line 1011
    .line 1012
    new-instance v3, Lw4/f0;

    .line 1013
    .line 1014
    const/4 v4, 0x0

    .line 1015
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1019
    .line 1020
    .line 1021
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1022
    .line 1023
    if-eqz v0, :cond_3f

    .line 1024
    .line 1025
    iget-object v0, v0, La5/b;->m:Landroid/widget/TextView;

    .line 1026
    .line 1027
    new-instance v3, Lw4/f0;

    .line 1028
    .line 1029
    const/4 v4, 0x1

    .line 1030
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1037
    .line 1038
    if-eqz v0, :cond_3e

    .line 1039
    .line 1040
    iget-object v3, v0, La5/b;->n:Landroid/widget/TextView;

    .line 1041
    .line 1042
    iget-object v0, v0, La5/b;->m:Landroid/widget/TextView;

    .line 1043
    .line 1044
    filled-new-array {v3, v0}, [Landroid/widget/TextView;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1057
    .line 1058
    .line 1059
    move-result v3

    .line 1060
    if-eqz v3, :cond_18

    .line 1061
    .line 1062
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v3

    .line 1066
    check-cast v3, Landroid/widget/TextView;

    .line 1067
    .line 1068
    new-instance v4, Lb6/b;

    .line 1069
    .line 1070
    const/4 v6, 0x2

    .line 1071
    invoke-direct {v4, v6, v1}, Lb6/b;-><init>(ILjava/lang/Object;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 1075
    .line 1076
    .line 1077
    goto :goto_13

    .line 1078
    :cond_18
    if-eqz v7, :cond_3d

    .line 1079
    .line 1080
    invoke-static {v7}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v0

    .line 1084
    if-eqz v0, :cond_19

    .line 1085
    .line 1086
    goto/16 :goto_1e

    .line 1087
    .line 1088
    :cond_19
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1089
    .line 1090
    if-eqz v0, :cond_3c

    .line 1091
    .line 1092
    iget-object v0, v0, La5/b;->b:Landroid/widget/ImageView;

    .line 1093
    .line 1094
    new-instance v3, Lw4/f0;

    .line 1095
    .line 1096
    const/4 v4, 0x3

    .line 1097
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1101
    .line 1102
    .line 1103
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1104
    .line 1105
    if-eqz v0, :cond_3b

    .line 1106
    .line 1107
    iget-object v0, v0, La5/b;->d:Landroid/widget/ImageView;

    .line 1108
    .line 1109
    new-instance v3, Lw4/f0;

    .line 1110
    .line 1111
    const/4 v4, 0x4

    .line 1112
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1116
    .line 1117
    .line 1118
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1119
    .line 1120
    if-eqz v0, :cond_3a

    .line 1121
    .line 1122
    iget-object v0, v0, La5/b;->c:Landroid/widget/ImageView;

    .line 1123
    .line 1124
    new-instance v3, Lw4/f0;

    .line 1125
    .line 1126
    const/4 v4, 0x5

    .line 1127
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1131
    .line 1132
    .line 1133
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1134
    .line 1135
    if-eqz v0, :cond_39

    .line 1136
    .line 1137
    iget-object v0, v0, La5/b;->f:Landroid/widget/ImageView;

    .line 1138
    .line 1139
    new-instance v3, Lw4/f0;

    .line 1140
    .line 1141
    const/4 v4, 0x6

    .line 1142
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1146
    .line 1147
    .line 1148
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1149
    .line 1150
    if-eqz v0, :cond_38

    .line 1151
    .line 1152
    iget-object v0, v0, La5/b;->g:Landroid/widget/ImageView;

    .line 1153
    .line 1154
    new-instance v3, Lw4/f0;

    .line 1155
    .line 1156
    const/4 v4, 0x7

    .line 1157
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1161
    .line 1162
    .line 1163
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1164
    .line 1165
    if-eqz v0, :cond_37

    .line 1166
    .line 1167
    iget-object v0, v0, La5/b;->e:Landroid/widget/ImageView;

    .line 1168
    .line 1169
    new-instance v3, Lw4/f0;

    .line 1170
    .line 1171
    const/16 v4, 0x8

    .line 1172
    .line 1173
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    const v3, 0x7f050003

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v0

    .line 1190
    if-eqz v0, :cond_1a

    .line 1191
    .line 1192
    goto :goto_15

    .line 1193
    :cond_1a
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1194
    .line 1195
    if-eqz v0, :cond_36

    .line 1196
    .line 1197
    iget-object v9, v0, La5/b;->d:Landroid/widget/ImageView;

    .line 1198
    .line 1199
    iget-object v10, v0, La5/b;->c:Landroid/widget/ImageView;

    .line 1200
    .line 1201
    iget-object v11, v0, La5/b;->f:Landroid/widget/ImageView;

    .line 1202
    .line 1203
    iget-object v12, v0, La5/b;->h:Landroid/widget/ImageView;

    .line 1204
    .line 1205
    iget-object v13, v0, La5/b;->e:Landroid/widget/ImageView;

    .line 1206
    .line 1207
    iget-object v14, v0, La5/b;->b:Landroid/widget/ImageView;

    .line 1208
    .line 1209
    iget-object v15, v0, La5/b;->g:Landroid/widget/ImageView;

    .line 1210
    .line 1211
    filled-new-array/range {v9 .. v15}, [Landroid/widget/ImageView;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v3

    .line 1227
    if-eqz v3, :cond_1b

    .line 1228
    .line 1229
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v3

    .line 1233
    check-cast v3, Landroid/widget/ImageView;

    .line 1234
    .line 1235
    const v4, 0x7f080083

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v1, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v4

    .line 1242
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1243
    .line 1244
    .line 1245
    goto :goto_14

    .line 1246
    :cond_1b
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1247
    .line 1248
    if-eqz v0, :cond_35

    .line 1249
    .line 1250
    iget-object v0, v0, La5/b;->j:Landroid/widget/LinearLayout;

    .line 1251
    .line 1252
    const/4 v3, 0x1

    .line 1253
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 1254
    .line 1255
    .line 1256
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1257
    .line 1258
    if-eqz v0, :cond_34

    .line 1259
    .line 1260
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1261
    .line 1262
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 1263
    .line 1264
    .line 1265
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1266
    .line 1267
    if-eqz v0, :cond_33

    .line 1268
    .line 1269
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1270
    .line 1271
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 1272
    .line 1273
    .line 1274
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1275
    .line 1276
    if-eqz v0, :cond_32

    .line 1277
    .line 1278
    iget-object v0, v0, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1279
    .line 1280
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 1281
    .line 1282
    .line 1283
    :goto_15
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1284
    .line 1285
    if-eqz v0, :cond_31

    .line 1286
    .line 1287
    iget-object v0, v0, La5/b;->h:Landroid/widget/ImageView;

    .line 1288
    .line 1289
    new-instance v3, Lw4/f0;

    .line 1290
    .line 1291
    const/4 v4, 0x2

    .line 1292
    invoke-direct {v3, v1, v4}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1296
    .line 1297
    .line 1298
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1299
    .line 1300
    if-eqz v0, :cond_30

    .line 1301
    .line 1302
    iget-object v0, v0, La5/b;->y:Landroid/widget/LinearLayout;

    .line 1303
    .line 1304
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1305
    .line 1306
    .line 1307
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->h0:Ljava/util/LinkedHashMap;

    .line 1308
    .line 1309
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 1310
    .line 1311
    .line 1312
    iget-object v3, v1, Lcom/exotv/net/PlayerActivity;->g0:Ljava/util/List;

    .line 1313
    .line 1314
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v4

    .line 1318
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1319
    .line 1320
    .line 1321
    move-result v6

    .line 1322
    const/4 v9, -0x1

    .line 1323
    if-eqz v6, :cond_1d

    .line 1324
    .line 1325
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v6

    .line 1329
    check-cast v6, Lw4/m0;

    .line 1330
    .line 1331
    new-instance v10, Landroid/widget/TextView;

    .line 1332
    .line 1333
    invoke-direct {v10, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1334
    .line 1335
    .line 1336
    iget v11, v6, Lw4/m0;->b:I

    .line 1337
    .line 1338
    invoke-virtual {v1, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v11

    .line 1342
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1343
    .line 1344
    .line 1345
    const/high16 v11, 0x41600000    # 14.0f

    .line 1346
    .line 1347
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1351
    .line 1352
    .line 1353
    const/16 v11, 0x11

    .line 1354
    .line 1355
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 1356
    .line 1357
    .line 1358
    const/16 v11, 0xa

    .line 1359
    .line 1360
    invoke-virtual {v1, v11}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 1361
    .line 1362
    .line 1363
    move-result v12

    .line 1364
    const/4 v13, 0x5

    .line 1365
    invoke-virtual {v1, v13}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 1366
    .line 1367
    .line 1368
    move-result v14

    .line 1369
    invoke-virtual {v1, v11}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 1370
    .line 1371
    .line 1372
    move-result v11

    .line 1373
    invoke-virtual {v1, v13}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 1374
    .line 1375
    .line 1376
    move-result v13

    .line 1377
    invoke-virtual {v10, v12, v14, v11, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1378
    .line 1379
    .line 1380
    const v11, 0x7f08008a

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v1, v11}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v11

    .line 1387
    invoke-virtual {v10, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1388
    .line 1389
    .line 1390
    const/4 v11, 0x1

    .line 1391
    invoke-virtual {v10, v11}, Landroid/view/View;->setFocusable(Z)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v10, v11}, Landroid/view/View;->setClickable(Z)V

    .line 1395
    .line 1396
    .line 1397
    new-instance v12, Lc5/p;

    .line 1398
    .line 1399
    const/4 v13, 0x7

    .line 1400
    invoke-direct {v12, v6, v13, v1}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1404
    .line 1405
    .line 1406
    iget-object v12, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1407
    .line 1408
    if-eqz v12, :cond_1c

    .line 1409
    .line 1410
    iget-object v12, v12, La5/b;->y:Landroid/widget/LinearLayout;

    .line 1411
    .line 1412
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 1413
    .line 1414
    const/4 v14, -0x2

    .line 1415
    invoke-direct {v13, v9, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1416
    .line 1417
    .line 1418
    const/4 v9, 0x4

    .line 1419
    invoke-virtual {v1, v9}, Lcom/exotv/net/PlayerActivity;->y(I)I

    .line 1420
    .line 1421
    .line 1422
    move-result v9

    .line 1423
    iput v9, v13, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1424
    .line 1425
    invoke-virtual {v12, v10, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1426
    .line 1427
    .line 1428
    iget-object v6, v6, Lw4/m0;->a:Ljava/lang/String;

    .line 1429
    .line 1430
    invoke-interface {v0, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    goto :goto_16

    .line 1434
    :cond_1c
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1435
    .line 1436
    .line 1437
    throw p1

    .line 1438
    :cond_1d
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1439
    .line 1440
    if-eqz v0, :cond_2f

    .line 1441
    .line 1442
    iget-object v0, v0, La5/b;->B:Landroid/widget/ScrollView;

    .line 1443
    .line 1444
    const/4 v4, 0x0

    .line 1445
    invoke-virtual {v0, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 1446
    .line 1447
    .line 1448
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1449
    .line 1450
    if-eqz v0, :cond_2e

    .line 1451
    .line 1452
    iget-object v0, v0, La5/b;->z:Landroid/widget/ScrollView;

    .line 1453
    .line 1454
    invoke-virtual {v0, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 1455
    .line 1456
    .line 1457
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1458
    .line 1459
    if-eqz v0, :cond_2d

    .line 1460
    .line 1461
    iget-object v0, v0, La5/b;->s:Landroid/widget/SeekBar;

    .line 1462
    .line 1463
    const/16 v4, 0x2710

    .line 1464
    .line 1465
    invoke-virtual {v0, v4}, Landroid/widget/AbsSeekBar;->setKeyProgressIncrement(I)V

    .line 1466
    .line 1467
    .line 1468
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1469
    .line 1470
    if-eqz v0, :cond_2c

    .line 1471
    .line 1472
    iget-object v0, v0, La5/b;->s:Landroid/widget/SeekBar;

    .line 1473
    .line 1474
    new-instance v4, Lw4/q0;

    .line 1475
    .line 1476
    invoke-direct {v4, v1}, Lw4/q0;-><init>(Lcom/exotv/net/PlayerActivity;)V

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v0, v4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1480
    .line 1481
    .line 1482
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1483
    .line 1484
    if-eqz v0, :cond_2b

    .line 1485
    .line 1486
    iget-object v0, v0, La5/b;->G:Landroid/view/View;

    .line 1487
    .line 1488
    new-instance v4, Lw4/f0;

    .line 1489
    .line 1490
    const/16 v6, 0x9

    .line 1491
    .line 1492
    invoke-direct {v4, v1, v6}, Lw4/f0;-><init>(Lcom/exotv/net/PlayerActivity;I)V

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1496
    .line 1497
    .line 1498
    const-string v0, "exotv_player"

    .line 1499
    .line 1500
    const/4 v4, 0x0

    .line 1501
    invoke-virtual {v1, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    const-string v6, "stretch"

    .line 1506
    .line 1507
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1508
    .line 1509
    .line 1510
    move-result v0

    .line 1511
    iput-boolean v0, v1, Lcom/exotv/net/PlayerActivity;->N:Z

    .line 1512
    .line 1513
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->v()V

    .line 1514
    .line 1515
    .line 1516
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 1517
    .line 1518
    iget-object v4, v1, Lcom/exotv/net/PlayerActivity;->T:Lw4/n0;

    .line 1519
    .line 1520
    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1521
    .line 1522
    .line 1523
    const-wide/16 v10, 0x7d0

    .line 1524
    .line 1525
    invoke-virtual {v0, v4, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    if-eqz v0, :cond_2a

    .line 1537
    .line 1538
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1539
    .line 1540
    .line 1541
    move-result v2

    .line 1542
    if-eqz v2, :cond_1e

    .line 1543
    .line 1544
    goto/16 :goto_1d

    .line 1545
    .line 1546
    :cond_1e
    iput-object v0, v1, Lcom/exotv/net/PlayerActivity;->c0:Ljava/lang/String;

    .line 1547
    .line 1548
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v0

    .line 1552
    const-string v2, "exo_season"

    .line 1553
    .line 1554
    invoke-virtual {v0, v2, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1555
    .line 1556
    .line 1557
    move-result v0

    .line 1558
    iput v0, v1, Lcom/exotv/net/PlayerActivity;->d0:I

    .line 1559
    .line 1560
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    const-string v2, "exo_episode"

    .line 1565
    .line 1566
    invoke-virtual {v0, v2, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1567
    .line 1568
    .line 1569
    move-result v0

    .line 1570
    iput v0, v1, Lcom/exotv/net/PlayerActivity;->e0:I

    .line 1571
    .line 1572
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    const-string v2, "exo_episode_tmdb"

    .line 1577
    .line 1578
    invoke-virtual {v0, v2, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1579
    .line 1580
    .line 1581
    move-result v0

    .line 1582
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v2

    .line 1586
    if-lez v0, :cond_1f

    .line 1587
    .line 1588
    goto :goto_17

    .line 1589
    :cond_1f
    move-object/from16 v2, p1

    .line 1590
    .line 1591
    :goto_17
    if-eqz v2, :cond_20

    .line 1592
    .line 1593
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1594
    .line 1595
    .line 1596
    move-result v0

    .line 1597
    goto :goto_18

    .line 1598
    :cond_20
    iget v0, v1, Lcom/exotv/net/PlayerActivity;->e0:I

    .line 1599
    .line 1600
    :goto_18
    iput v0, v1, Lcom/exotv/net/PlayerActivity;->f0:I

    .line 1601
    .line 1602
    iget v2, v1, Lcom/exotv/net/PlayerActivity;->d0:I

    .line 1603
    .line 1604
    if-gez v2, :cond_21

    .line 1605
    .line 1606
    iput v9, v1, Lcom/exotv/net/PlayerActivity;->d0:I

    .line 1607
    .line 1608
    :cond_21
    iget v2, v1, Lcom/exotv/net/PlayerActivity;->e0:I

    .line 1609
    .line 1610
    if-gez v2, :cond_22

    .line 1611
    .line 1612
    iput v9, v1, Lcom/exotv/net/PlayerActivity;->e0:I

    .line 1613
    .line 1614
    :cond_22
    if-gez v0, :cond_23

    .line 1615
    .line 1616
    iput v9, v1, Lcom/exotv/net/PlayerActivity;->f0:I

    .line 1617
    .line 1618
    :cond_23
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v0

    .line 1622
    const-string v2, "exo_file_name"

    .line 1623
    .line 1624
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    if-eqz v0, :cond_24

    .line 1629
    .line 1630
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1631
    .line 1632
    .line 1633
    move-result v2

    .line 1634
    if-nez v2, :cond_24

    .line 1635
    .line 1636
    goto :goto_19

    .line 1637
    :cond_24
    move-object/from16 v0, p1

    .line 1638
    .line 1639
    :goto_19
    iput-object v0, v1, Lcom/exotv/net/PlayerActivity;->i0:Ljava/lang/String;

    .line 1640
    .line 1641
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    const-string v2, "exo_imdb_id"

    .line 1646
    .line 1647
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    if-eqz v0, :cond_25

    .line 1652
    .line 1653
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1654
    .line 1655
    .line 1656
    move-result v2

    .line 1657
    if-nez v2, :cond_25

    .line 1658
    .line 1659
    goto :goto_1a

    .line 1660
    :cond_25
    move-object/from16 v0, p1

    .line 1661
    .line 1662
    :goto_1a
    iput-object v0, v1, Lcom/exotv/net/PlayerActivity;->j0:Ljava/lang/String;

    .line 1663
    .line 1664
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 1665
    .line 1666
    if-eqz v0, :cond_29

    .line 1667
    .line 1668
    iget-object v0, v0, La5/b;->h:Landroid/widget/ImageView;

    .line 1669
    .line 1670
    const/4 v4, 0x0

    .line 1671
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 1675
    .line 1676
    .line 1677
    const-string v0, "exotv_subtitles"

    .line 1678
    .line 1679
    invoke-virtual {v1, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v0

    .line 1683
    const-string v2, "language"

    .line 1684
    .line 1685
    move-object/from16 v4, p1

    .line 1686
    .line 1687
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v0

    .line 1691
    if-eqz v0, :cond_2a

    .line 1692
    .line 1693
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v2

    .line 1697
    :cond_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1698
    .line 1699
    .line 1700
    move-result v3

    .line 1701
    if-eqz v3, :cond_27

    .line 1702
    .line 1703
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v4

    .line 1707
    move-object v3, v4

    .line 1708
    check-cast v3, Lw4/m0;

    .line 1709
    .line 1710
    iget-object v3, v3, Lw4/m0;->a:Ljava/lang/String;

    .line 1711
    .line 1712
    invoke-static {v3, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v3

    .line 1716
    if-eqz v3, :cond_26

    .line 1717
    .line 1718
    goto :goto_1b

    .line 1719
    :cond_27
    const/4 v4, 0x0

    .line 1720
    :goto_1b
    check-cast v4, Lw4/m0;

    .line 1721
    .line 1722
    if-eqz v4, :cond_28

    .line 1723
    .line 1724
    iget-object v5, v4, Lw4/m0;->a:Ljava/lang/String;

    .line 1725
    .line 1726
    goto :goto_1c

    .line 1727
    :cond_28
    const/4 v5, 0x0

    .line 1728
    :goto_1c
    if-eqz v5, :cond_2a

    .line 1729
    .line 1730
    invoke-virtual {v1, v5}, Lcom/exotv/net/PlayerActivity;->O(Ljava/lang/String;)V

    .line 1731
    .line 1732
    .line 1733
    goto :goto_1d

    .line 1734
    :cond_29
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1735
    .line 1736
    .line 1737
    const/4 v4, 0x0

    .line 1738
    throw v4

    .line 1739
    :cond_2a
    :goto_1d
    const-wide/16 v2, 0x0

    .line 1740
    .line 1741
    invoke-virtual {v1, v7, v8, v2, v3}, Lcom/exotv/net/PlayerActivity;->T(Ljava/lang/String;Ljava/util/Map;J)V

    .line 1742
    .line 1743
    .line 1744
    return-void

    .line 1745
    :cond_2b
    move-object/from16 v4, p1

    .line 1746
    .line 1747
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1748
    .line 1749
    .line 1750
    throw v4

    .line 1751
    :cond_2c
    move-object/from16 v4, p1

    .line 1752
    .line 1753
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1754
    .line 1755
    .line 1756
    throw v4

    .line 1757
    :cond_2d
    move-object/from16 v4, p1

    .line 1758
    .line 1759
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1760
    .line 1761
    .line 1762
    throw v4

    .line 1763
    :cond_2e
    move-object/from16 v4, p1

    .line 1764
    .line 1765
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1766
    .line 1767
    .line 1768
    throw v4

    .line 1769
    :cond_2f
    move-object/from16 v4, p1

    .line 1770
    .line 1771
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1772
    .line 1773
    .line 1774
    throw v4

    .line 1775
    :cond_30
    move-object/from16 v4, p1

    .line 1776
    .line 1777
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1778
    .line 1779
    .line 1780
    throw v4

    .line 1781
    :cond_31
    move-object/from16 v4, p1

    .line 1782
    .line 1783
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1784
    .line 1785
    .line 1786
    throw v4

    .line 1787
    :cond_32
    move-object/from16 v4, p1

    .line 1788
    .line 1789
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1790
    .line 1791
    .line 1792
    throw v4

    .line 1793
    :cond_33
    move-object/from16 v4, p1

    .line 1794
    .line 1795
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1796
    .line 1797
    .line 1798
    throw v4

    .line 1799
    :cond_34
    move-object/from16 v4, p1

    .line 1800
    .line 1801
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1802
    .line 1803
    .line 1804
    throw v4

    .line 1805
    :cond_35
    move-object/from16 v4, p1

    .line 1806
    .line 1807
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1808
    .line 1809
    .line 1810
    throw v4

    .line 1811
    :cond_36
    move-object/from16 v4, p1

    .line 1812
    .line 1813
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1814
    .line 1815
    .line 1816
    throw v4

    .line 1817
    :cond_37
    move-object/from16 v4, p1

    .line 1818
    .line 1819
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1820
    .line 1821
    .line 1822
    throw v4

    .line 1823
    :cond_38
    move-object/from16 v4, p1

    .line 1824
    .line 1825
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1826
    .line 1827
    .line 1828
    throw v4

    .line 1829
    :cond_39
    move-object/from16 v4, p1

    .line 1830
    .line 1831
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1832
    .line 1833
    .line 1834
    throw v4

    .line 1835
    :cond_3a
    move-object/from16 v4, p1

    .line 1836
    .line 1837
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1838
    .line 1839
    .line 1840
    throw v4

    .line 1841
    :cond_3b
    move-object/from16 v4, p1

    .line 1842
    .line 1843
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1844
    .line 1845
    .line 1846
    throw v4

    .line 1847
    :cond_3c
    move-object/from16 v4, p1

    .line 1848
    .line 1849
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1850
    .line 1851
    .line 1852
    throw v4

    .line 1853
    :cond_3d
    :goto_1e
    const v0, 0x7f11010b

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v0

    .line 1860
    const-string v2, "getString(...)"

    .line 1861
    .line 1862
    invoke-static {v2, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual {v1, v0}, Lcom/exotv/net/PlayerActivity;->R(Ljava/lang/String;)V

    .line 1866
    .line 1867
    .line 1868
    return-void

    .line 1869
    :cond_3e
    move-object/from16 v4, p1

    .line 1870
    .line 1871
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1872
    .line 1873
    .line 1874
    throw v4

    .line 1875
    :cond_3f
    move-object/from16 v4, p1

    .line 1876
    .line 1877
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1878
    .line 1879
    .line 1880
    throw v4

    .line 1881
    :cond_40
    move-object/from16 v4, p1

    .line 1882
    .line 1883
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    throw v4

    .line 1887
    :cond_41
    move-object/from16 v4, p1

    .line 1888
    .line 1889
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1890
    .line 1891
    .line 1892
    throw v4

    .line 1893
    :cond_42
    move-object/from16 v4, p1

    .line 1894
    .line 1895
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1896
    .line 1897
    .line 1898
    throw v4

    .line 1899
    :cond_43
    move-object/from16 v4, p1

    .line 1900
    .line 1901
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1902
    .line 1903
    .line 1904
    throw v4

    .line 1905
    :cond_44
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v0

    .line 1909
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v0

    .line 1913
    new-instance v2, Ljava/lang/NullPointerException;

    .line 1914
    .line 1915
    const-string v3, "Missing required view with ID: "

    .line 1916
    .line 1917
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v0

    .line 1921
    invoke-direct {v2, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1922
    .line 1923
    .line 1924
    throw v2
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->b0:Li7/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->H()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->stop()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->release()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v1, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, v0, La5/b;->p:Landroidx/media3/ui/PlayerView;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setPlayer(Landroidx/media3/common/d1;)V

    .line 36
    .line 37
    .line 38
    invoke-super {p0}, Lh/i;->onDestroy()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    const-string v0, "b"

    .line 43
    .line 44
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public final onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lh/i;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/exotv/net/PlayerActivity;->R:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->pause()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lh/i;->onResume()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/exotv/net/PlayerActivity;->R:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->E()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Lh/i;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->play()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/exotv/net/PlayerActivity;->P:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, La5/b;->d:Landroid/widget/ImageView;

    .line 19
    .line 20
    const v1, 0x7f080102

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    iput-wide v1, v0, Lc5/b1;->c:J

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string v0, "b"

    .line 36
    .line 37
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    throw v0

    .line 42
    :cond_1
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/exotv/net/PlayerActivity;->E()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final u()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->getTrackSelectionParameters()Landroidx/media3/common/v1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroidx/media3/common/v1;->buildUpon()Landroidx/media3/common/u1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "buildUpon(...)"

    .line 15
    .line 16
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/exotv/net/PlayerActivity;->p0:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move-object v5, v3

    .line 37
    check-cast v5, Lw4/l0;

    .line 38
    .line 39
    iget v5, v5, Lw4/l0;->a:I

    .line 40
    .line 41
    iget-object v6, p0, Lcom/exotv/net/PlayerActivity;->q0:Ljava/lang/Integer;

    .line 42
    .line 43
    if-nez v6, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-ne v5, v6, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v3, v4

    .line 54
    :goto_1
    check-cast v3, Lw4/l0;

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget v2, v3, Lw4/l0;->b:I

    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :cond_4
    if-nez v4, :cond_5

    .line 65
    .line 66
    invoke-virtual {v1}, Landroidx/media3/common/u1;->clearVideoSizeConstraints()Landroidx/media3/common/u1;

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const v2, 0x7fffffff

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {v1, v2, v3}, Landroidx/media3/common/u1;->setMaxVideoSize(II)Landroidx/media3/common/u1;

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {v1, v2, v3}, Landroidx/media3/common/u1;->setMinVideoSize(II)Landroidx/media3/common/u1;

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-virtual {v1}, Landroidx/media3/common/u1;->build()Landroidx/media3/common/v1;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/ExoPlayer;->setTrackSelectionParameters(Landroidx/media3/common/v1;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final v()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->p:Landroidx/media3/ui/PlayerView;

    .line 9
    .line 10
    iget-boolean v3, p0, Lcom/exotv/net/PlayerActivity;->N:Z

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, v3}, Landroidx/media3/ui/PlayerView;->setResizeMode(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, v0, La5/b;->f:Landroid/widget/ImageView;

    .line 25
    .line 26
    iget-boolean v1, p0, Lcom/exotv/net/PlayerActivity;->N:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const v1, 0x7f0800f8

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const v1, 0x7f0800ec

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1
.end method

.method public final w(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->X:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/List;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget-object v1, p0, Lcom/exotv/net/PlayerActivity;->Z:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget p1, p0, Lcom/exotv/net/PlayerActivity;->a0:I

    .line 37
    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    iget-object p1, p0, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :cond_3
    const/4 p1, 0x0

    .line 50
    invoke-virtual {p0, p1, v0, p1}, Lcom/exotv/net/PlayerActivity;->F(ILjava/util/List;Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->D:Landroid/widget/TextView;

    .line 9
    .line 10
    const-string v3, ""

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, La5/b;->D:Landroid/widget/TextView;

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1
.end method

.method public final y(I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, v0

    .line 13
    float-to-int p1, p1

    .line 14
    return p1
.end method

.method public final z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->r0:Landroid/widget/TextView;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, v0, La5/b;->q:Landroid/widget/LinearLayout;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_2
    new-instance v1, Lm0/t;

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    invoke-direct {v1, v0, v2}, Lm0/t;-><init>(Landroid/view/View;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1
.end method
