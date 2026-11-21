.class public final synthetic Lw2/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lw2/m;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw2/m;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lw2/m;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lw2/m;->m:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lw2/m;->n:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw2/m;->j:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, Lw2/m;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, v0, Lw2/m;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lw2/m;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, Lw2/m;->k:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v13, v7

    .line 19
    check-cast v13, Lcom/exotv/net/SeriesDetailActivity;

    .line 20
    .line 21
    check-cast v6, Lw4/a1;

    .line 22
    .line 23
    check-cast v5, Landroid/widget/TextView;

    .line 24
    .line 25
    check-cast v4, Landroid/widget/ProgressBar;

    .line 26
    .line 27
    sget v1, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 28
    .line 29
    sget-object v1, Lz4/g0;->a:Lz4/g0;

    .line 30
    .line 31
    iget-object v1, v6, Lw4/a1;->f:Ljava/lang/String;

    .line 32
    .line 33
    iget v7, v6, Lw4/a1;->a:I

    .line 34
    .line 35
    invoke-static {v1}, Lz4/g0;->e(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_0
    iget-boolean v1, v13, Lcom/exotv/net/SeriesDetailActivity;->W:Z

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iput-boolean v3, v13, Lcom/exotv/net/SeriesDetailActivity;->W:Z

    .line 49
    .line 50
    iput-object v5, v13, Lcom/exotv/net/SeriesDetailActivity;->U:Landroid/widget/TextView;

    .line 51
    .line 52
    iput-object v4, v13, Lcom/exotv/net/SeriesDetailActivity;->V:Landroid/widget/ProgressBar;

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v13, Lcom/exotv/net/SeriesDetailActivity;->c0:Ljava/lang/String;

    .line 63
    .line 64
    iget v2, v13, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 65
    .line 66
    invoke-static {v2}, Lcom/exotv/net/SeriesDetailActivity;->A(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v7}, Lcom/exotv/net/SeriesDetailActivity;->A(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, "  S"

    .line 83
    .line 84
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, "E"

    .line 91
    .line 92
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    iget v2, v13, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 103
    .line 104
    iget v3, v6, Lw4/a1;->g:I

    .line 105
    .line 106
    const-string v4, "play S"

    .line 107
    .line 108
    const-string v5, " (tmdb episode "

    .line 109
    .line 110
    invoke-static {v2, v7, v4, v1, v5}, La1/a1;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v2, ")"

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v2, "SeriesDetail"

    .line 127
    .line 128
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    iget-wide v1, v13, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 132
    .line 133
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    iget v11, v13, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 138
    .line 139
    iget v12, v6, Lw4/a1;->a:I

    .line 140
    .line 141
    new-instance v9, Lw4/s0;

    .line 142
    .line 143
    const/4 v1, 0x2

    .line 144
    invoke-direct {v9, v1, v13}, Lw4/s0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 145
    .line 146
    .line 147
    iget v15, v6, Lw4/a1;->g:I

    .line 148
    .line 149
    const-string v1, "id"

    .line 150
    .line 151
    invoke-static {v1, v10}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v13}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v8, Lc5/i;

    .line 159
    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    invoke-direct/range {v8 .. v16}, Lc5/i;-><init>(Ly6/a;Ljava/lang/String;IILb/l;Ljava/lang/String;ILp6/c;)V

    .line 163
    .line 164
    .line 165
    const/4 v2, 0x3

    .line 166
    const/4 v3, 0x0

    .line 167
    invoke-static {v1, v3, v8, v2}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 168
    .line 169
    .line 170
    :goto_0
    return-void

    .line 171
    :pswitch_0
    check-cast v7, Lw2/e;

    .line 172
    .line 173
    check-cast v6, Landroidx/media3/common/d1;

    .line 174
    .line 175
    check-cast v5, Landroidx/media3/common/q1;

    .line 176
    .line 177
    check-cast v4, Lw2/l;

    .line 178
    .line 179
    const/16 v1, 0x1d

    .line 180
    .line 181
    invoke-interface {v6, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_2

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_2
    invoke-interface {v6}, Landroidx/media3/common/d1;->getTrackSelectionParameters()Landroidx/media3/common/v1;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Landroidx/media3/common/v1;->buildUpon()Landroidx/media3/common/u1;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    new-instance v8, Landroidx/media3/common/r1;

    .line 197
    .line 198
    iget v9, v4, Lw2/l;->b:I

    .line 199
    .line 200
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    invoke-static {v9}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-direct {v8, v5, v9}, Landroidx/media3/common/r1;-><init>(Landroidx/media3/common/q1;Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v8}, Landroidx/media3/common/u1;->setOverrideForType(Landroidx/media3/common/r1;)Landroidx/media3/common/u1;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    iget-object v5, v4, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 216
    .line 217
    iget-object v5, v5, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 218
    .line 219
    iget v5, v5, Landroidx/media3/common/q1;->c:I

    .line 220
    .line 221
    invoke-virtual {v1, v5, v2}, Landroidx/media3/common/u1;->setTrackTypeDisabled(IZ)Landroidx/media3/common/u1;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v1}, Landroidx/media3/common/u1;->build()Landroidx/media3/common/v1;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-interface {v6, v1}, Landroidx/media3/common/d1;->setTrackSelectionParameters(Landroidx/media3/common/v1;)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v4, Lw2/l;->c:Ljava/lang/String;

    .line 233
    .line 234
    iget v2, v7, Lw2/e;->f:I

    .line 235
    .line 236
    packed-switch v2, :pswitch_data_1

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :pswitch_1
    iget-object v2, v7, Lw2/e;->g:Lw2/o;

    .line 241
    .line 242
    iget-object v2, v2, Lw2/o;->o:Lc5/t;

    .line 243
    .line 244
    iget-object v2, v2, Lc5/t;->f:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v2, [Ljava/lang/String;

    .line 247
    .line 248
    aput-object v1, v2, v3

    .line 249
    .line 250
    :goto_1
    iget-object v1, v7, Lw2/e;->e:Lw2/o;

    .line 251
    .line 252
    iget-object v1, v1, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 253
    .line 254
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 255
    .line 256
    .line 257
    :goto_2
    return-void

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
