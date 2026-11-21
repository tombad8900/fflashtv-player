.class public final Lw2/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/b1;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic j:Lw2/o;


# direct methods
.method public constructor <init>(Lw2/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw2/f;->j:Lw2/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lw2/f;->j:Lw2/o;

    .line 2
    .line 3
    iget-object v1, v0, Lw2/o;->F:Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object v2, v0, Lw2/o;->K:Landroid/view/View;

    .line 6
    .line 7
    iget-object v3, v0, Lw2/o;->J:Landroid/view/View;

    .line 8
    .line 9
    iget-object v4, v0, Lw2/o;->I:Landroid/view/View;

    .line 10
    .line 11
    iget-object v5, v0, Lw2/o;->j:Lw2/t;

    .line 12
    .line 13
    iget-object v6, v0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 14
    .line 15
    if-nez v6, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v5}, Lw2/t;->g()V

    .line 20
    .line 21
    .line 22
    iget-object v7, v0, Lw2/o;->w:Landroid/widget/ImageView;

    .line 23
    .line 24
    if-ne v7, p1, :cond_1

    .line 25
    .line 26
    const/16 p1, 0x9

    .line 27
    .line 28
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_11

    .line 33
    .line 34
    invoke-interface {v6}, Landroidx/media3/common/d1;->seekToNext()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object v7, v0, Lw2/o;->v:Landroid/widget/ImageView;

    .line 39
    .line 40
    if-ne v7, p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x7

    .line 43
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_11

    .line 48
    .line 49
    invoke-interface {v6}, Landroidx/media3/common/d1;->seekToPrevious()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iget-object v7, v0, Lw2/o;->y:Landroid/view/View;

    .line 54
    .line 55
    if-ne v7, p1, :cond_3

    .line 56
    .line 57
    invoke-interface {v6}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/4 v0, 0x4

    .line 62
    if-eq p1, v0, :cond_11

    .line 63
    .line 64
    const/16 p1, 0xc

    .line 65
    .line 66
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_11

    .line 71
    .line 72
    invoke-interface {v6}, Landroidx/media3/common/d1;->seekForward()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    iget-object v7, v0, Lw2/o;->z:Landroid/view/View;

    .line 77
    .line 78
    if-ne v7, p1, :cond_4

    .line 79
    .line 80
    const/16 p1, 0xb

    .line 81
    .line 82
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_11

    .line 87
    .line 88
    invoke-interface {v6}, Landroidx/media3/common/d1;->seekBack()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    iget-object v7, v0, Lw2/o;->x:Landroid/widget/ImageView;

    .line 93
    .line 94
    const/4 v8, 0x1

    .line 95
    if-ne v7, p1, :cond_6

    .line 96
    .line 97
    iget-boolean p1, v0, Lw2/o;->w0:Z

    .line 98
    .line 99
    invoke-static {v6, p1}, Lh1/i0;->c0(Landroidx/media3/common/d1;Z)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    invoke-static {v6}, Lh1/i0;->J(Landroidx/media3/common/d1;)Z

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_5
    invoke-interface {v6, v8}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_11

    .line 114
    .line 115
    invoke-interface {v6}, Landroidx/media3/common/d1;->pause()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    iget-object v7, v0, Lw2/o;->C:Landroid/widget/ImageView;

    .line 120
    .line 121
    if-ne v7, p1, :cond_c

    .line 122
    .line 123
    const/16 p1, 0xf

    .line 124
    .line 125
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_11

    .line 130
    .line 131
    invoke-interface {v6}, Landroidx/media3/common/d1;->getRepeatMode()I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iget v0, v0, Lw2/o;->B0:I

    .line 136
    .line 137
    move v1, v8

    .line 138
    :goto_0
    const/4 v2, 0x2

    .line 139
    if-gt v1, v2, :cond_b

    .line 140
    .line 141
    add-int v3, p1, v1

    .line 142
    .line 143
    rem-int/lit8 v3, v3, 0x3

    .line 144
    .line 145
    if-eqz v3, :cond_a

    .line 146
    .line 147
    if-eq v3, v8, :cond_8

    .line 148
    .line 149
    if-eq v3, v2, :cond_7

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_7
    and-int/lit8 v2, v0, 0x2

    .line 153
    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    and-int/lit8 v2, v0, 0x1

    .line 158
    .line 159
    if-eqz v2, :cond_9

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_9
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_a
    :goto_2
    move p1, v3

    .line 166
    :cond_b
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->setRepeatMode(I)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_c
    iget-object v7, v0, Lw2/o;->D:Landroid/widget/ImageView;

    .line 171
    .line 172
    if-ne v7, p1, :cond_d

    .line 173
    .line 174
    const/16 p1, 0xe

    .line 175
    .line 176
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_11

    .line 181
    .line 182
    invoke-interface {v6}, Landroidx/media3/common/d1;->getShuffleModeEnabled()Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    xor-int/2addr p1, v8

    .line 187
    invoke-interface {v6, p1}, Landroidx/media3/common/d1;->setShuffleModeEnabled(Z)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_d
    if-ne v4, p1, :cond_e

    .line 192
    .line 193
    invoke-virtual {v5}, Lw2/t;->f()V

    .line 194
    .line 195
    .line 196
    iget-object p1, v0, Lw2/o;->o:Lc5/t;

    .line 197
    .line 198
    invoke-virtual {v0, p1, v4}, Lw2/o;->d(Lz2/x;Landroid/view/View;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_e
    if-ne v3, p1, :cond_f

    .line 203
    .line 204
    invoke-virtual {v5}, Lw2/t;->f()V

    .line 205
    .line 206
    .line 207
    iget-object p1, v0, Lw2/o;->p:Lw2/h;

    .line 208
    .line 209
    invoke-virtual {v0, p1, v3}, Lw2/o;->d(Lz2/x;Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_f
    if-ne v2, p1, :cond_10

    .line 214
    .line 215
    invoke-virtual {v5}, Lw2/t;->f()V

    .line 216
    .line 217
    .line 218
    iget-object p1, v0, Lw2/o;->r:Lw2/e;

    .line 219
    .line 220
    invoke-virtual {v0, p1, v2}, Lw2/o;->d(Lz2/x;Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_10
    if-ne v1, p1, :cond_11

    .line 225
    .line 226
    invoke-virtual {v5}, Lw2/t;->f()V

    .line 227
    .line 228
    .line 229
    iget-object p1, v0, Lw2/o;->q:Lw2/e;

    .line 230
    .line 231
    invoke-virtual {v0, p1, v1}, Lw2/o;->d(Lz2/x;Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    :cond_11
    :goto_3
    return-void
.end method

.method public final onDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/f;->j:Lw2/o;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw2/o;->H0:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lw2/o;->j:Lw2/t;

    .line 8
    .line 9
    invoke-virtual {v0}, Lw2/t;->g()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onEvents(Landroidx/media3/common/d1;Landroidx/media3/common/a1;)V
    .locals 4

    .line 1
    const/4 p1, 0x4

    .line 2
    const/4 v0, 0x5

    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    filled-new-array {p1, v0, v1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object p2, p2, Landroidx/media3/common/a1;->a:Landroidx/media3/common/u;

    .line 10
    .line 11
    invoke-virtual {p2, v2}, Landroidx/media3/common/u;->a([I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Lw2/f;->j:Lw2/o;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, Lw2/o;->m()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v2, 0x7

    .line 23
    filled-new-array {p1, v0, v2, v1}, [I

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p2, p1}, Landroidx/media3/common/u;->a([I)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Lw2/o;->o()V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/16 p1, 0x8

    .line 37
    .line 38
    filled-new-array {p1, v1}, [I

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p2, p1}, Landroidx/media3/common/u;->a([I)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v3}, Lw2/o;->p()V

    .line 49
    .line 50
    .line 51
    :cond_2
    const/16 p1, 0x9

    .line 52
    .line 53
    filled-new-array {p1, v1}, [I

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p2, p1}, Landroidx/media3/common/u;->a([I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v3}, Lw2/o;->r()V

    .line 64
    .line 65
    .line 66
    :cond_3
    new-array p1, v2, [I

    .line 67
    .line 68
    fill-array-data p1, :array_0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, p1}, Landroidx/media3/common/u;->a([I)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {v3}, Lw2/o;->l()V

    .line 78
    .line 79
    .line 80
    :cond_4
    const/16 p1, 0xb

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    filled-new-array {p1, v0, v1}, [I

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p2, p1}, Landroidx/media3/common/u;->a([I)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-virtual {v3}, Lw2/o;->s()V

    .line 94
    .line 95
    .line 96
    :cond_5
    const/16 p1, 0xc

    .line 97
    .line 98
    filled-new-array {p1, v1}, [I

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p2, p1}, Landroidx/media3/common/u;->a([I)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    invoke-virtual {v3}, Lw2/o;->n()V

    .line 109
    .line 110
    .line 111
    :cond_6
    const/4 p1, 0x2

    .line 112
    filled-new-array {p1, v1}, [I

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p2, p1}, Landroidx/media3/common/u;->a([I)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    invoke-virtual {v3}, Lw2/o;->t()V

    .line 123
    .line 124
    .line 125
    :cond_7
    return-void

    .line 126
    nop

    .line 127
    :array_0
    .array-data 4
        0x8
        0x9
        0xb
        0x0
        0x10
        0x11
        0xd
    .end array-data
.end method
