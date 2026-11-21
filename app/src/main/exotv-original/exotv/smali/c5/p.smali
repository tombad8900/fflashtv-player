.class public final synthetic Lc5/p;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lc5/p;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/p;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lc5/p;->l:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Lc5/p;->j:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lc5/p;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v2, p0, Lc5/p;->k:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, Lw4/m0;

    .line 12
    .line 13
    check-cast v1, Lcom/exotv/net/PlayerActivity;

    .line 14
    .line 15
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 16
    .line 17
    iget-object p1, v2, Lw4/m0;->a:Ljava/lang/String;

    .line 18
    .line 19
    if-nez p1, :cond_3

    .line 20
    .line 21
    iget-object p1, v1, Lcom/exotv/net/PlayerActivity;->b0:Li7/a0;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Li7/x;->b(Li7/s0;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v0, v1, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v0, v1, Lcom/exotv/net/PlayerActivity;->Z:Ljava/lang/String;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput p1, v1, Lcom/exotv/net/PlayerActivity;->a0:I

    .line 34
    .line 35
    const-string v2, "exotv_subtitles"

    .line 36
    .line 37
    invoke-virtual {v1, v2, p1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v2, "language"

    .line 46
    .line 47
    const-string v3, "off"

    .line 48
    .line 49
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->x()V

    .line 57
    .line 58
    .line 59
    sget-object p1, Lm6/p;->j:Lm6/p;

    .line 60
    .line 61
    iput-object p1, v1, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 62
    .line 63
    iget-object p1, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 64
    .line 65
    iget-object v2, v1, Lcom/exotv/net/PlayerActivity;->w0:Lw4/n0;

    .line 66
    .line 67
    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->I()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 74
    .line 75
    .line 76
    iget-object p1, v1, Lcom/exotv/net/PlayerActivity;->n0:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget-object v1, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 83
    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    iget-object v0, v1, La5/b;->h:Landroid/widget/ImageView;

    .line 87
    .line 88
    if-nez p1, :cond_1

    .line 89
    .line 90
    const p1, -0x23ebc4

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    const/4 p1, -0x1

    .line 95
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const-string p1, "b"

    .line 100
    .line 101
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_3
    invoke-virtual {v1, p1}, Lcom/exotv/net/PlayerActivity;->O(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    return-void

    .line 109
    :pswitch_0
    check-cast v2, Lcom/exotv/net/MovieDetailActivity;

    .line 110
    .line 111
    check-cast v1, Lw4/y;

    .line 112
    .line 113
    iget-boolean p1, v2, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 114
    .line 115
    if-nez p1, :cond_5

    .line 116
    .line 117
    iget-boolean p1, v2, Lcom/exotv/net/MovieDetailActivity;->S:Z

    .line 118
    .line 119
    if-eqz p1, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    const/4 p1, 0x1

    .line 123
    invoke-virtual {v2, p1}, Lcom/exotv/net/MovieDetailActivity;->v(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Lw4/y;->invoke()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_2
    return-void

    .line 130
    :pswitch_1
    check-cast v2, Lc5/a1;

    .line 131
    .line 132
    check-cast v1, Lx4/l;

    .line 133
    .line 134
    iget-object p1, v1, Lx4/l;->b:Ljava/lang/String;

    .line 135
    .line 136
    iget-wide v0, v1, Lx4/l;->a:J

    .line 137
    .line 138
    iget-object v3, v2, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 139
    .line 140
    iget-object v2, v2, Lc5/a1;->f:Lc5/w0;

    .line 141
    .line 142
    sget-object v4, Lc5/w0;->m:Lc5/w0;

    .line 143
    .line 144
    if-ne v2, v4, :cond_6

    .line 145
    .line 146
    new-instance v2, Landroid/content/Intent;

    .line 147
    .line 148
    const-class v4, Lcom/exotv/net/SeriesDetailActivity;

    .line 149
    .line 150
    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 151
    .line 152
    .line 153
    const-string v4, "series_id"

    .line 154
    .line 155
    invoke-virtual {v2, v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v1, "series_title"

    .line 160
    .line 161
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    new-instance v2, Landroid/content/Intent;

    .line 170
    .line 171
    const-class v4, Lcom/exotv/net/MovieDetailActivity;

    .line 172
    .line 173
    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 174
    .line 175
    .line 176
    const-string v4, "movie_id"

    .line 177
    .line 178
    invoke-virtual {v2, v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const-string v1, "movie_title"

    .line 183
    .line 184
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 189
    .line 190
    .line 191
    :goto_3
    return-void

    .line 192
    :pswitch_2
    check-cast v2, Lc5/a1;

    .line 193
    .line 194
    check-cast v1, Lc5/w0;

    .line 195
    .line 196
    iget-object p1, v2, Lc5/a1;->f:Lc5/w0;

    .line 197
    .line 198
    if-eq p1, v1, :cond_8

    .line 199
    .line 200
    iput-object v1, v2, Lc5/a1;->f:Lc5/w0;

    .line 201
    .line 202
    invoke-virtual {v2}, Lc5/a1;->e()V

    .line 203
    .line 204
    .line 205
    iget-object p1, v2, Lc5/a1;->g:Landroid/widget/EditText;

    .line 206
    .line 207
    if-eqz p1, :cond_7

    .line 208
    .line 209
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {v2, p1}, Lc5/a1;->c(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_7
    const-string p1, "input"

    .line 222
    .line 223
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0

    .line 227
    :cond_8
    :goto_4
    return-void

    .line 228
    :pswitch_3
    check-cast v2, Lc5/k0;

    .line 229
    .line 230
    check-cast v1, Lx4/l;

    .line 231
    .line 232
    iget-object p1, v2, Lc5/k0;->j:Lw4/r;

    .line 233
    .line 234
    invoke-virtual {p1, v1}, Lw4/r;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :pswitch_4
    check-cast v2, Ly6/l;

    .line 239
    .line 240
    check-cast v1, Lx4/l;

    .line 241
    .line 242
    invoke-interface {v2, v1}, Ly6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_5
    check-cast v2, Lc5/y;

    .line 247
    .line 248
    check-cast v1, Lc5/w;

    .line 249
    .line 250
    iget-object p1, v2, Lc5/y;->a:Lw4/e;

    .line 251
    .line 252
    invoke-virtual {p1, v1}, Lw4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_6
    check-cast v2, Lc5/t;

    .line 257
    .line 258
    check-cast v1, Lcom/exotv/net/model/Channel;

    .line 259
    .line 260
    iget-object p1, v2, Lc5/t;->e:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p1, Lw4/e;

    .line 263
    .line 264
    invoke-virtual {p1, v1}, Lw4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
