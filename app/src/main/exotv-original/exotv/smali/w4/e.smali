.class public final synthetic Lw4/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/e;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/e;->k:Lcom/exotv/net/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lw4/e;->j:I

    .line 2
    .line 3
    const-string v1, "b"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Ll6/j;->a:Ll6/j;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v7, p0, Lw4/e;->k:Lcom/exotv/net/MainActivity;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Lcom/exotv/net/model/Channel;

    .line 17
    .line 18
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 19
    .line 20
    const-string v0, "channel"

    .line 21
    .line 22
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v0, v7, Lcom/exotv/net/MainActivity;->W:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput-boolean v4, v7, Lcom/exotv/net/MainActivity;->W:Z

    .line 31
    .line 32
    iput-object p1, v7, Lcom/exotv/net/MainActivity;->Z:Lcom/exotv/net/model/Channel;

    .line 33
    .line 34
    iget-object v0, v7, Lcom/exotv/net/MainActivity;->T:Lc5/t;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lc5/t;->g(Lcom/exotv/net/model/Channel;)V

    .line 39
    .line 40
    .line 41
    const v0, 0x7f110101

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lw4/q;->j:Lw4/q;

    .line 49
    .line 50
    invoke-virtual {v7, v4, v0, v3, v1}, Lcom/exotv/net/MainActivity;->T(ZLjava/lang/String;ZLw4/q;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v7}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Lw4/x;

    .line 58
    .line 59
    invoke-direct {v1, p1, v7, v6}, Lw4/x;-><init>(Lcom/exotv/net/model/Channel;Lcom/exotv/net/MainActivity;Lp6/c;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v6, v1, v2}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 63
    .line 64
    .line 65
    :goto_0
    return-object v5

    .line 66
    :cond_1
    const-string p1, "channelAdapter"

    .line 67
    .line 68
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v6

    .line 72
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iget v0, v7, Lcom/exotv/net/MainActivity;->V:I

    .line 79
    .line 80
    if-ne p1, v0, :cond_2

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_2
    iput p1, v7, Lcom/exotv/net/MainActivity;->V:I

    .line 85
    .line 86
    iget-object v0, v7, Lcom/exotv/net/MainActivity;->S:Lc5/o;

    .line 87
    .line 88
    if-eqz v0, :cond_b

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Lc5/o;->g(I)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v7, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 94
    .line 95
    if-eqz v0, :cond_a

    .line 96
    .line 97
    iget-object v0, v0, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 98
    .line 99
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->g0(I)V

    .line 100
    .line 101
    .line 102
    iget-object v0, v7, Lcom/exotv/net/MainActivity;->U:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Lcom/exotv/net/model/ChannelCategory;

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/exotv/net/model/ChannelCategory;->getChannels()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {v7, p1}, Lcom/exotv/net/MainActivity;->S(Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, v7, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 118
    .line 119
    if-eqz p1, :cond_9

    .line 120
    .line 121
    iget-object p1, p1, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_3

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-virtual {v7}, Lcom/exotv/net/MainActivity;->J()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_8

    .line 137
    .line 138
    iget-object p1, v7, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 139
    .line 140
    sget-object v0, Lw4/q;->j:Lw4/q;

    .line 141
    .line 142
    if-eq p1, v0, :cond_4

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    iget-object p1, v7, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 146
    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    iget-object p1, p1, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_6

    .line 162
    .line 163
    iget-object p1, v7, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 164
    .line 165
    if-eqz p1, :cond_5

    .line 166
    .line 167
    iget-object p1, p1, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 168
    .line 169
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->H(I)Lz2/v0;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-eqz p1, :cond_8

    .line 174
    .line 175
    iget-object p1, p1, Lz2/v0;->a:Landroid/view/View;

    .line 176
    .line 177
    if-eqz p1, :cond_8

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_5
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v6

    .line 187
    :cond_6
    new-instance v0, Lh5/a;

    .line 188
    .line 189
    invoke-direct {v0, v4, v7}, Lh5/a;-><init>(ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_7
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v6

    .line 200
    :cond_8
    :goto_1
    return-object v5

    .line 201
    :cond_9
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v6

    .line 205
    :cond_a
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v6

    .line 209
    :cond_b
    const-string p1, "categoryAdapter"

    .line 210
    .line 211
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v6

    .line 215
    :pswitch_1
    check-cast p1, Ll6/f;

    .line 216
    .line 217
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 218
    .line 219
    invoke-virtual {v7, v3}, Lcom/exotv/net/MainActivity;->R(Z)V

    .line 220
    .line 221
    .line 222
    iget-object p1, p1, Ll6/f;->j:Ljava/io/Serializable;

    .line 223
    .line 224
    invoke-static {p1}, Ll6/f;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-nez v0, :cond_e

    .line 229
    .line 230
    check-cast p1, Ljava/lang/String;

    .line 231
    .line 232
    iget-object p1, v7, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 233
    .line 234
    if-eqz p1, :cond_d

    .line 235
    .line 236
    iget-object p1, p1, La5/a;->m:Landroid/widget/TextView;

    .line 237
    .line 238
    const v0, 0x7f110100

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    iget-object p1, v7, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 249
    .line 250
    if-eqz p1, :cond_c

    .line 251
    .line 252
    iget-object p1, p1, La5/a;->o:Landroid/widget/TextView;

    .line 253
    .line 254
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_c
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v6

    .line 262
    :cond_d
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v6

    .line 266
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    if-nez p1, :cond_f

    .line 271
    .line 272
    const p1, 0x7f110043

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    const-string v0, "getString(...)"

    .line 280
    .line 281
    invoke-static {v0, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_f
    invoke-virtual {v7, p1}, Lcom/exotv/net/MainActivity;->V(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :goto_2
    return-object v5

    .line 288
    :pswitch_2
    check-cast p1, Lc5/w;

    .line 289
    .line 290
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 291
    .line 292
    const-string v0, "dest"

    .line 293
    .line 294
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-eqz p1, :cond_13

    .line 305
    .line 306
    if-eq p1, v4, :cond_12

    .line 307
    .line 308
    const/4 v0, 0x2

    .line 309
    if-eq p1, v0, :cond_11

    .line 310
    .line 311
    if-ne p1, v2, :cond_10

    .line 312
    .line 313
    sget-object p1, Lw4/q;->m:Lw4/q;

    .line 314
    .line 315
    invoke-virtual {v7, p1}, Lcom/exotv/net/MainActivity;->O(Lw4/q;)V

    .line 316
    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_10
    new-instance p1, La1/u;

    .line 320
    .line 321
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 322
    .line 323
    .line 324
    throw p1

    .line 325
    :cond_11
    sget-object p1, Lw4/q;->l:Lw4/q;

    .line 326
    .line 327
    invoke-virtual {v7, p1}, Lcom/exotv/net/MainActivity;->O(Lw4/q;)V

    .line 328
    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_12
    sget-object p1, Lw4/q;->k:Lw4/q;

    .line 332
    .line 333
    invoke-virtual {v7, p1}, Lcom/exotv/net/MainActivity;->O(Lw4/q;)V

    .line 334
    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_13
    sget-object p1, Lw4/q;->j:Lw4/q;

    .line 338
    .line 339
    invoke-virtual {v7, p1}, Lcom/exotv/net/MainActivity;->O(Lw4/q;)V

    .line 340
    .line 341
    .line 342
    :goto_3
    return-object v5

    .line 343
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 344
    .line 345
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    iget-object v0, v7, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 350
    .line 351
    if-eqz v0, :cond_14

    .line 352
    .line 353
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-static {p1}, Lcom/exotv/net/MainActivity;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    return-object p1

    .line 362
    :cond_14
    const-string p1, "catalogContent"

    .line 363
    .line 364
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v6

    .line 368
    nop

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
