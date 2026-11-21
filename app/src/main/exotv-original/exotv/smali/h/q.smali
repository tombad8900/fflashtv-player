.class public final Lh/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lm0/o;
.implements Lm/b1;
.implements Ll/y;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lh/x;


# direct methods
.method public synthetic constructor <init>(Lh/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh/q;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lh/q;->k:Lh/x;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Ll/m;Z)V
    .locals 9

    .line 1
    iget v0, p0, Lh/q;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ll/m;->k()Ll/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    move v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_1
    iget-object v4, p0, Lh/q;->k:Lh/x;

    .line 21
    .line 22
    iget-object v5, v4, Lh/x;->T:[Lh/w;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v6, v1

    .line 29
    :goto_1
    if-ge v1, v6, :cond_4

    .line 30
    .line 31
    aget-object v7, v5, v1

    .line 32
    .line 33
    if-eqz v7, :cond_3

    .line 34
    .line 35
    iget-object v8, v7, Lh/w;->h:Ll/m;

    .line 36
    .line 37
    if-ne v8, p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    const/4 v7, 0x0

    .line 44
    :goto_2
    if-eqz v7, :cond_6

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget p1, v7, Lh/w;->a:I

    .line 49
    .line 50
    invoke-virtual {v4, p1, v7, v0}, Lh/x;->p(ILh/w;Ll/m;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v7, v2}, Lh/x;->r(Lh/w;Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {v4, v7, p2}, Lh/x;->r(Lh/w;Z)V

    .line 58
    .line 59
    .line 60
    :cond_6
    :goto_3
    return-void

    .line 61
    :pswitch_0
    iget-object p2, p0, Lh/q;->k:Lh/x;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Lh/x;->q(Ll/m;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public i(Ll/m;)Z
    .locals 2

    .line 1
    iget v0, p0, Lh/q;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ll/m;->k()Ll/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lh/q;->k:Lh/x;

    .line 13
    .line 14
    iget-boolean v1, v0, Lh/x;->N:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lh/x;->u:Landroid/view/Window;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-boolean v0, v0, Lh/x;->Y:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x6c

    .line 31
    .line 32
    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :pswitch_0
    iget-object v0, p0, Lh/q;->k:Lh/x;

    .line 38
    .line 39
    iget-object v0, v0, Lh/x;->u:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const/16 v1, 0x6c

    .line 48
    .line 49
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    invoke-virtual {v2}, Lm0/r1;->d()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    invoke-virtual {v2}, Lm0/r1;->d()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    move-object/from16 v5, p0

    .line 14
    .line 15
    iget-object v6, v5, Lh/q;->k:Lh/x;

    .line 16
    .line 17
    iget-object v0, v6, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 18
    .line 19
    const/16 v7, 0x1d

    .line 20
    .line 21
    if-eqz v0, :cond_8

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 28
    .line 29
    if-eqz v0, :cond_8

    .line 30
    .line 31
    iget-object v0, v6, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v8, v0

    .line 38
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 39
    .line 40
    iget-object v0, v6, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_7

    .line 47
    .line 48
    iget-object v0, v6, Lh/x;->k0:Landroid/graphics/Rect;

    .line 49
    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, v6, Lh/x;->k0:Landroid/graphics/Rect;

    .line 58
    .line 59
    new-instance v0, Landroid/graphics/Rect;

    .line 60
    .line 61
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, v6, Lh/x;->l0:Landroid/graphics/Rect;

    .line 65
    .line 66
    :cond_0
    iget-object v10, v6, Lh/x;->k0:Landroid/graphics/Rect;

    .line 67
    .line 68
    iget-object v11, v6, Lh/x;->l0:Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-virtual {v2}, Lm0/r1;->b()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {v2}, Lm0/r1;->d()I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    invoke-virtual {v2}, Lm0/r1;->c()I

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    invoke-virtual {v2}, Lm0/r1;->a()I

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    invoke-virtual {v10, v0, v12, v13, v14}, Landroid/graphics/Rect;->set(IIII)V

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x2

    .line 90
    iget-object v12, v2, Lm0/r1;->a:Lm0/o1;

    .line 91
    .line 92
    invoke-virtual {v12, v0}, Lm0/o1;->f(I)Le0/b;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    iget-object v0, v6, Lh/x;->J:Landroid/view/ViewGroup;

    .line 97
    .line 98
    const-class v13, Landroid/graphics/Rect;

    .line 99
    .line 100
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 101
    .line 102
    const/4 v15, 0x1

    .line 103
    if-lt v14, v7, :cond_1

    .line 104
    .line 105
    sget-boolean v13, Lm/q2;->a:Z

    .line 106
    .line 107
    invoke-static {v0, v10, v11}, Landroidx/media3/common/e;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    sget-boolean v14, Lm/q2;->a:Z

    .line 112
    .line 113
    const-string v7, "ViewUtils"

    .line 114
    .line 115
    if-nez v14, :cond_2

    .line 116
    .line 117
    sput-boolean v15, Lm/q2;->a:Z

    .line 118
    .line 119
    :try_start_0
    const-class v14, Landroid/view/View;

    .line 120
    .line 121
    const-string v9, "computeFitSystemWindows"

    .line 122
    .line 123
    filled-new-array {v13, v13}, [Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-virtual {v14, v9, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    sput-object v9, Lm/q2;->b:Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-nez v9, :cond_2

    .line 138
    .line 139
    sget-object v9, Lm/q2;->b:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    invoke-virtual {v9, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :catch_0
    const-string v9, "Could not find method computeFitSystemWindows. Oh well."

    .line 146
    .line 147
    invoke-static {v7, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    :cond_2
    :goto_0
    sget-object v9, Lm/q2;->b:Ljava/lang/reflect/Method;

    .line 151
    .line 152
    if-eqz v9, :cond_3

    .line 153
    .line 154
    :try_start_1
    filled-new-array {v10, v11}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v9, v0, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catch_1
    move-exception v0

    .line 163
    const-string v9, "Could not invoke computeFitSystemWindows"

    .line 164
    .line 165
    invoke-static {v7, v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 166
    .line 167
    .line 168
    :cond_3
    :goto_1
    iget v0, v11, Landroid/graphics/Rect;->left:I

    .line 169
    .line 170
    iget v7, v11, Landroid/graphics/Rect;->top:I

    .line 171
    .line 172
    iget v9, v11, Landroid/graphics/Rect;->right:I

    .line 173
    .line 174
    iget v11, v11, Landroid/graphics/Rect;->bottom:I

    .line 175
    .line 176
    iget v13, v12, Le0/b;->a:I

    .line 177
    .line 178
    sub-int/2addr v13, v0

    .line 179
    const/4 v14, 0x0

    .line 180
    invoke-static {v14, v13}, Ljava/lang/Math;->max(II)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iget v13, v12, Le0/b;->b:I

    .line 185
    .line 186
    sub-int/2addr v13, v7

    .line 187
    invoke-static {v14, v13}, Ljava/lang/Math;->max(II)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    iget v13, v12, Le0/b;->c:I

    .line 192
    .line 193
    sub-int/2addr v13, v9

    .line 194
    invoke-static {v14, v13}, Ljava/lang/Math;->max(II)I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    iget v12, v12, Le0/b;->d:I

    .line 199
    .line 200
    sub-int/2addr v12, v11

    .line 201
    invoke-static {v14, v12}, Ljava/lang/Math;->max(II)I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    invoke-static {v0, v7, v9, v11}, Le0/b;->c(IIII)Le0/b;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    iget v7, v0, Le0/b;->c:I

    .line 210
    .line 211
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 212
    .line 213
    iget v0, v0, Le0/b;->a:I

    .line 214
    .line 215
    if-ne v9, v0, :cond_5

    .line 216
    .line 217
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 218
    .line 219
    if-eq v9, v7, :cond_4

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_4
    move v15, v14

    .line 223
    goto :goto_3

    .line 224
    :cond_5
    :goto_2
    iput v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 225
    .line 226
    iput v7, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 227
    .line 228
    :goto_3
    iget-object v9, v6, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 229
    .line 230
    iget v11, v10, Landroid/graphics/Rect;->left:I

    .line 231
    .line 232
    sub-int/2addr v11, v0

    .line 233
    iget v0, v10, Landroid/graphics/Rect;->top:I

    .line 234
    .line 235
    iget v12, v10, Landroid/graphics/Rect;->right:I

    .line 236
    .line 237
    sub-int/2addr v12, v7

    .line 238
    iput v11, v9, Landroidx/appcompat/widget/ActionBarContextView;->D:I

    .line 239
    .line 240
    iput v0, v9, Landroidx/appcompat/widget/ActionBarContextView;->E:I

    .line 241
    .line 242
    iput v12, v9, Landroidx/appcompat/widget/ActionBarContextView;->F:I

    .line 243
    .line 244
    invoke-virtual {v9}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    .line 245
    .line 246
    .line 247
    iget-boolean v0, v6, Lh/x;->P:Z

    .line 248
    .line 249
    if-nez v0, :cond_6

    .line 250
    .line 251
    iget v0, v10, Landroid/graphics/Rect;->top:I

    .line 252
    .line 253
    if-lez v0, :cond_6

    .line 254
    .line 255
    move v4, v14

    .line 256
    :cond_6
    move v9, v15

    .line 257
    goto :goto_4

    .line 258
    :cond_7
    const/4 v14, 0x0

    .line 259
    move v9, v14

    .line 260
    :goto_4
    if-eqz v9, :cond_8

    .line 261
    .line 262
    iget-object v0, v6, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 263
    .line 264
    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 265
    .line 266
    .line 267
    :cond_8
    if-eq v3, v4, :cond_c

    .line 268
    .line 269
    invoke-virtual {v2}, Lm0/r1;->b()I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    invoke-virtual {v2}, Lm0/r1;->c()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    invoke-virtual {v2}, Lm0/r1;->a()I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 282
    .line 283
    const/16 v8, 0x22

    .line 284
    .line 285
    if-lt v7, v8, :cond_9

    .line 286
    .line 287
    new-instance v7, Lm0/g1;

    .line 288
    .line 289
    invoke-direct {v7, v2}, Lm0/g1;-><init>(Lm0/r1;)V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_9
    const/16 v8, 0x1e

    .line 294
    .line 295
    if-lt v7, v8, :cond_a

    .line 296
    .line 297
    new-instance v7, Lm0/f1;

    .line 298
    .line 299
    invoke-direct {v7, v2}, Lm0/f1;-><init>(Lm0/r1;)V

    .line 300
    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_a
    const/16 v8, 0x1d

    .line 304
    .line 305
    if-lt v7, v8, :cond_b

    .line 306
    .line 307
    new-instance v7, Lm0/e1;

    .line 308
    .line 309
    invoke-direct {v7, v2}, Lm0/e1;-><init>(Lm0/r1;)V

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_b
    new-instance v7, Lm0/c1;

    .line 314
    .line 315
    invoke-direct {v7, v2}, Lm0/c1;-><init>(Lm0/r1;)V

    .line 316
    .line 317
    .line 318
    :goto_5
    invoke-static {v0, v4, v3, v6}, Le0/b;->c(IIII)Le0/b;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v7, v0}, Lm0/h1;->g(Le0/b;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7}, Lm0/h1;->b()Lm0/r1;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    goto :goto_6

    .line 330
    :cond_c
    move-object v0, v2

    .line 331
    :goto_6
    sget-object v2, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 332
    .line 333
    invoke-virtual {v0}, Lm0/r1;->f()Landroid/view/WindowInsets;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    if-eqz v2, :cond_d

    .line 338
    .line 339
    invoke-static {v1, v2}, Lm0/c0;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-nez v2, :cond_d

    .line 348
    .line 349
    invoke-static {v1, v3}, Lm0/r1;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lm0/r1;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    :cond_d
    return-object v0
.end method
