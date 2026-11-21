.class public final Lw2/l0;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lw2/f0;


# instance fields
.field public final j:Lw2/b;

.field public final k:Lw2/j0;

.field public l:Ljava/util/List;

.field public m:Lw2/c;

.field public n:F

.field public o:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v1, p0, Lw2/l0;->l:Ljava/util/List;

    .line 8
    .line 9
    sget-object v1, Lw2/c;->g:Lw2/c;

    .line 10
    .line 11
    iput-object v1, p0, Lw2/l0;->m:Lw2/c;

    .line 12
    .line 13
    const v1, 0x3d5a511a    # 0.0533f

    .line 14
    .line 15
    .line 16
    iput v1, p0, Lw2/l0;->n:F

    .line 17
    .line 18
    const v1, 0x3da3d70a    # 0.08f

    .line 19
    .line 20
    .line 21
    iput v1, p0, Lw2/l0;->o:F

    .line 22
    .line 23
    new-instance v1, Lw2/b;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p1, v2}, Lw2/b;-><init>(Landroid/content/Context;I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lw2/l0;->j:Lw2/b;

    .line 30
    .line 31
    new-instance v3, Lw2/j0;

    .line 32
    .line 33
    invoke-direct {v3, p1, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    .line 35
    .line 36
    iput-object v3, p0, Lw2/l0;->k:Lw2/j0;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lw2/c;FF)V
    .locals 5

    .line 1
    iput-object p2, p0, Lw2/l0;->m:Lw2/c;

    .line 2
    .line 3
    iput p3, p0, Lw2/l0;->n:F

    .line 4
    .line 5
    iput p4, p0, Lw2/l0;->o:F

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v2, v3, :cond_1

    .line 23
    .line 24
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lg1/b;

    .line 29
    .line 30
    iget-object v4, v3, Lg1/b;->d:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object p1, p0, Lw2/l0;->l:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    :cond_2
    iput-object v1, p0, Lw2/l0;->l:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {p0}, Lw2/l0;->c()V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object p1, p0, Lw2/l0;->j:Lw2/b;

    .line 64
    .line 65
    invoke-virtual {p1, v0, p2, p3, p4}, Lw2/b;->a(Ljava/util/List;Lw2/c;FF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final b(IF)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v1, v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v1, v2

    .line 19
    invoke-static {p1, v0, v1, p2}, Lt2/i0;->A(IIIF)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const p2, -0x800001

    .line 24
    .line 25
    .line 26
    cmpl-float p2, p1, p2

    .line 27
    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    const-string p1, "unset"

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 46
    .line 47
    div-float/2addr p1, p2

    .line 48
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget p2, Lh1/i0;->a:I

    .line 57
    .line 58
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 59
    .line 60
    const-string v0, "%.2fpx"

    .line 61
    .line 62
    invoke-static {p2, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1
.end method

.method public final c()V
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lw2/l0;->m:Lw2/c;

    .line 9
    .line 10
    iget v2, v2, Lw2/c;->a:I

    .line 11
    .line 12
    invoke-static {v2}, Lt2/w;->s(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget v3, v0, Lw2/l0;->n:F

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-virtual {v0, v4, v3}, Lw2/l0;->b(IF)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const v5, 0x3f99999a    # 1.2f

    .line 24
    .line 25
    .line 26
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    iget-object v7, v0, Lw2/l0;->m:Lw2/c;

    .line 31
    .line 32
    iget v8, v7, Lw2/c;->d:I

    .line 33
    .line 34
    iget v7, v7, Lw2/c;->e:I

    .line 35
    .line 36
    const-string v9, "unset"

    .line 37
    .line 38
    const/4 v10, 0x3

    .line 39
    const/4 v11, 0x2

    .line 40
    const/4 v12, 0x1

    .line 41
    if-eq v8, v12, :cond_3

    .line 42
    .line 43
    if-eq v8, v11, :cond_2

    .line 44
    .line 45
    if-eq v8, v10, :cond_1

    .line 46
    .line 47
    const/4 v13, 0x4

    .line 48
    if-eq v8, v13, :cond_0

    .line 49
    .line 50
    move-object v7, v9

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v7}, Lt2/w;->s(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    sget v8, Lh1/i0;->a:I

    .line 57
    .line 58
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 59
    .line 60
    const-string v8, "-0.05em -0.05em 0.15em "

    .line 61
    .line 62
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-static {v7}, Lt2/w;->s(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    sget v8, Lh1/i0;->a:I

    .line 72
    .line 73
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 74
    .line 75
    const-string v8, "0.06em 0.08em 0.15em "

    .line 76
    .line 77
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-static {v7}, Lt2/w;->s(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    sget v8, Lh1/i0;->a:I

    .line 87
    .line 88
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 89
    .line 90
    const-string v8, "0.1em 0.12em 0.15em "

    .line 91
    .line 92
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-static {v7}, Lt2/w;->s(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    sget v8, Lh1/i0;->a:I

    .line 106
    .line 107
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 108
    .line 109
    const-string v13, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"

    .line 110
    .line 111
    invoke-static {v8, v13, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    :goto_0
    filled-new-array {v2, v3, v6, v7}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    sget v3, Lh1/i0;->a:I

    .line 120
    .line 121
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 122
    .line 123
    const-string v6, "<body><div style=\'-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;\'>"

    .line 124
    .line 125
    invoke-static {v3, v6, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    new-instance v2, Ljava/util/HashMap;

    .line 133
    .line 134
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 135
    .line 136
    .line 137
    iget-object v3, v0, Lw2/l0;->m:Lw2/c;

    .line 138
    .line 139
    iget v3, v3, Lw2/c;->b:I

    .line 140
    .line 141
    invoke-static {v3}, Lt2/w;->s(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    new-instance v6, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v7, "background-color:"

    .line 148
    .line 149
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v3, ";"

    .line 156
    .line 157
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    const-string v8, ".default_bg,.default_bg *"

    .line 165
    .line 166
    invoke-virtual {v2, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move v6, v4

    .line 170
    :goto_1
    iget-object v8, v0, Lw2/l0;->l:Ljava/util/List;

    .line 171
    .line 172
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-ge v6, v8, :cond_53

    .line 177
    .line 178
    iget-object v8, v0, Lw2/l0;->l:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    check-cast v8, Lg1/b;

    .line 185
    .line 186
    iget v13, v8, Lg1/b;->h:F

    .line 187
    .line 188
    iget v14, v8, Lg1/b;->g:I

    .line 189
    .line 190
    iget v15, v8, Lg1/b;->p:I

    .line 191
    .line 192
    const v16, -0x800001

    .line 193
    .line 194
    .line 195
    cmpl-float v17, v13, v16

    .line 196
    .line 197
    const/high16 v18, 0x42c80000    # 100.0f

    .line 198
    .line 199
    if-eqz v17, :cond_4

    .line 200
    .line 201
    mul-float v13, v13, v18

    .line 202
    .line 203
    :goto_2
    move/from16 v17, v5

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_4
    const/high16 v13, 0x42480000    # 50.0f

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :goto_3
    iget v5, v8, Lg1/b;->i:I

    .line 210
    .line 211
    const/16 v19, -0x32

    .line 212
    .line 213
    const/16 v20, -0x64

    .line 214
    .line 215
    if-eq v5, v12, :cond_6

    .line 216
    .line 217
    if-eq v5, v11, :cond_5

    .line 218
    .line 219
    move v5, v4

    .line 220
    goto :goto_4

    .line 221
    :cond_5
    move/from16 v5, v20

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_6
    move/from16 v5, v19

    .line 225
    .line 226
    :goto_4
    iget v4, v8, Lg1/b;->e:F

    .line 227
    .line 228
    cmpl-float v21, v4, v16

    .line 229
    .line 230
    const/high16 v22, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    const-string v10, "%.2f%%"

    .line 235
    .line 236
    if-eqz v21, :cond_e

    .line 237
    .line 238
    iget v11, v8, Lg1/b;->f:I

    .line 239
    .line 240
    if-eq v11, v12, :cond_c

    .line 241
    .line 242
    mul-float v4, v4, v18

    .line 243
    .line 244
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 253
    .line 254
    invoke-static {v11, v10, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    if-ne v15, v12, :cond_9

    .line 259
    .line 260
    if-eq v14, v12, :cond_8

    .line 261
    .line 262
    const/4 v11, 0x2

    .line 263
    if-eq v14, v11, :cond_7

    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    goto :goto_5

    .line 267
    :cond_7
    move/from16 v14, v20

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_8
    const/4 v11, 0x2

    .line 271
    move/from16 v14, v19

    .line 272
    .line 273
    :goto_5
    neg-int v14, v14

    .line 274
    move/from16 v20, v14

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_9
    const/4 v11, 0x2

    .line 278
    if-eq v14, v12, :cond_b

    .line 279
    .line 280
    if-eq v14, v11, :cond_a

    .line 281
    .line 282
    const/16 v19, 0x0

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_a
    move/from16 v19, v20

    .line 286
    .line 287
    :cond_b
    :goto_6
    move/from16 v20, v19

    .line 288
    .line 289
    :goto_7
    move-object/from16 v28, v4

    .line 290
    .line 291
    const/4 v4, 0x0

    .line 292
    goto :goto_9

    .line 293
    :cond_c
    cmpl-float v11, v4, v23

    .line 294
    .line 295
    const-string v14, "%.2fem"

    .line 296
    .line 297
    if-ltz v11, :cond_d

    .line 298
    .line 299
    mul-float v4, v4, v17

    .line 300
    .line 301
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 310
    .line 311
    invoke-static {v11, v14, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    move-object/from16 v28, v4

    .line 316
    .line 317
    const/4 v4, 0x0

    .line 318
    :goto_8
    const/16 v20, 0x0

    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_d
    neg-float v4, v4

    .line 322
    sub-float v4, v4, v22

    .line 323
    .line 324
    mul-float v4, v4, v17

    .line 325
    .line 326
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 335
    .line 336
    invoke-static {v11, v14, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    move-object/from16 v28, v4

    .line 341
    .line 342
    move v4, v12

    .line 343
    goto :goto_8

    .line 344
    :cond_e
    iget v4, v0, Lw2/l0;->o:F

    .line 345
    .line 346
    sub-float v22, v22, v4

    .line 347
    .line 348
    mul-float v22, v22, v18

    .line 349
    .line 350
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 359
    .line 360
    invoke-static {v11, v10, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    goto :goto_7

    .line 365
    :goto_9
    iget v11, v8, Lg1/b;->j:F

    .line 366
    .line 367
    cmpl-float v14, v11, v16

    .line 368
    .line 369
    if-eqz v14, :cond_f

    .line 370
    .line 371
    mul-float v11, v11, v18

    .line 372
    .line 373
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v11

    .line 381
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 382
    .line 383
    invoke-static {v14, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    :goto_a
    move-object/from16 v30, v10

    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_f
    const-string v10, "fit-content"

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :goto_b
    iget-object v10, v8, Lg1/b;->b:Landroid/text/Layout$Alignment;

    .line 394
    .line 395
    const-string v11, "start"

    .line 396
    .line 397
    const-string v14, "end"

    .line 398
    .line 399
    const-string v16, "center"

    .line 400
    .line 401
    if-nez v10, :cond_10

    .line 402
    .line 403
    move v10, v12

    .line 404
    move-object/from16 v31, v16

    .line 405
    .line 406
    const/4 v12, 0x2

    .line 407
    goto :goto_d

    .line 408
    :cond_10
    sget-object v19, Lw2/k0;->a:[I

    .line 409
    .line 410
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    aget v10, v19, v10

    .line 415
    .line 416
    if-eq v10, v12, :cond_12

    .line 417
    .line 418
    const/4 v12, 0x2

    .line 419
    if-eq v10, v12, :cond_11

    .line 420
    .line 421
    move-object/from16 v31, v16

    .line 422
    .line 423
    :goto_c
    const/4 v10, 0x1

    .line 424
    goto :goto_d

    .line 425
    :cond_11
    move-object/from16 v31, v14

    .line 426
    .line 427
    goto :goto_c

    .line 428
    :cond_12
    const/4 v12, 0x2

    .line 429
    move-object/from16 v31, v11

    .line 430
    .line 431
    goto :goto_c

    .line 432
    :goto_d
    if-eq v15, v10, :cond_14

    .line 433
    .line 434
    if-eq v15, v12, :cond_13

    .line 435
    .line 436
    const-string v10, "horizontal-tb"

    .line 437
    .line 438
    :goto_e
    move-object/from16 v32, v10

    .line 439
    .line 440
    goto :goto_f

    .line 441
    :cond_13
    const-string v10, "vertical-lr"

    .line 442
    .line 443
    goto :goto_e

    .line 444
    :cond_14
    const-string v10, "vertical-rl"

    .line 445
    .line 446
    goto :goto_e

    .line 447
    :goto_f
    iget v10, v8, Lg1/b;->n:I

    .line 448
    .line 449
    iget v12, v8, Lg1/b;->o:F

    .line 450
    .line 451
    invoke-virtual {v0, v10, v12}, Lw2/l0;->b(IF)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v33

    .line 455
    iget-boolean v10, v8, Lg1/b;->l:Z

    .line 456
    .line 457
    if-eqz v10, :cond_15

    .line 458
    .line 459
    iget v10, v8, Lg1/b;->m:I

    .line 460
    .line 461
    goto :goto_10

    .line 462
    :cond_15
    iget-object v10, v0, Lw2/l0;->m:Lw2/c;

    .line 463
    .line 464
    iget v10, v10, Lw2/c;->c:I

    .line 465
    .line 466
    :goto_10
    invoke-static {v10}, Lt2/w;->s(I)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v34

    .line 470
    const-string v10, "right"

    .line 471
    .line 472
    const-string v12, "top"

    .line 473
    .line 474
    const-string v22, "left"

    .line 475
    .line 476
    move/from16 v24, v4

    .line 477
    .line 478
    const/4 v4, 0x1

    .line 479
    if-eq v15, v4, :cond_1a

    .line 480
    .line 481
    const/4 v4, 0x2

    .line 482
    if-eq v15, v4, :cond_17

    .line 483
    .line 484
    if-eqz v24, :cond_16

    .line 485
    .line 486
    const-string v12, "bottom"

    .line 487
    .line 488
    :cond_16
    move-object/from16 v27, v12

    .line 489
    .line 490
    move-object/from16 v25, v22

    .line 491
    .line 492
    :goto_11
    const/4 v4, 0x2

    .line 493
    goto :goto_14

    .line 494
    :cond_17
    if-eqz v24, :cond_18

    .line 495
    .line 496
    goto :goto_13

    .line 497
    :cond_18
    :goto_12
    move-object/from16 v10, v22

    .line 498
    .line 499
    :cond_19
    :goto_13
    move-object/from16 v27, v10

    .line 500
    .line 501
    move-object/from16 v25, v12

    .line 502
    .line 503
    goto :goto_11

    .line 504
    :cond_1a
    if-eqz v24, :cond_19

    .line 505
    .line 506
    goto :goto_12

    .line 507
    :goto_14
    if-eq v15, v4, :cond_1c

    .line 508
    .line 509
    const/4 v4, 0x1

    .line 510
    if-ne v15, v4, :cond_1b

    .line 511
    .line 512
    goto :goto_16

    .line 513
    :cond_1b
    const-string v4, "width"

    .line 514
    .line 515
    :goto_15
    move-object/from16 v29, v4

    .line 516
    .line 517
    goto :goto_17

    .line 518
    :cond_1c
    :goto_16
    const-string v4, "height"

    .line 519
    .line 520
    move/from16 v29, v20

    .line 521
    .line 522
    move/from16 v20, v5

    .line 523
    .line 524
    move/from16 v5, v29

    .line 525
    .line 526
    goto :goto_15

    .line 527
    :goto_17
    iget-object v4, v8, Lg1/b;->a:Ljava/lang/CharSequence;

    .line 528
    .line 529
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 530
    .line 531
    .line 532
    move-result-object v10

    .line 533
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 534
    .line 535
    .line 536
    move-result-object v10

    .line 537
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 538
    .line 539
    .line 540
    move-result-object v10

    .line 541
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 542
    .line 543
    sget-object v12, Lw2/d0;->a:Ljava/util/regex/Pattern;

    .line 544
    .line 545
    const-string v12, "</span>"

    .line 546
    .line 547
    move/from16 v22, v5

    .line 548
    .line 549
    const-string v5, ";\'>"

    .line 550
    .line 551
    move/from16 v38, v6

    .line 552
    .line 553
    const-string v6, ""

    .line 554
    .line 555
    if-nez v4, :cond_1d

    .line 556
    .line 557
    new-instance v4, Lm7/s;

    .line 558
    .line 559
    const/4 v10, 0x3

    .line 560
    invoke-direct {v4, v6, v10}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v40, v3

    .line 564
    .line 565
    move-object/from16 v24, v6

    .line 566
    .line 567
    :goto_18
    move-object/from16 v41, v7

    .line 568
    .line 569
    move-object/from16 v39, v11

    .line 570
    .line 571
    move/from16 v35, v13

    .line 572
    .line 573
    move-object/from16 v45, v14

    .line 574
    .line 575
    goto/16 :goto_2a

    .line 576
    .line 577
    :cond_1d
    move-object/from16 v24, v6

    .line 578
    .line 579
    instance-of v6, v4, Landroid/text/Spanned;

    .line 580
    .line 581
    if-nez v6, :cond_1e

    .line 582
    .line 583
    new-instance v6, Lm7/s;

    .line 584
    .line 585
    invoke-static {v4}, Lw2/d0;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    const/4 v10, 0x3

    .line 590
    invoke-direct {v6, v4, v10}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v40, v3

    .line 594
    .line 595
    move-object v4, v6

    .line 596
    goto :goto_18

    .line 597
    :cond_1e
    check-cast v4, Landroid/text/Spanned;

    .line 598
    .line 599
    new-instance v6, Ljava/util/HashSet;

    .line 600
    .line 601
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 602
    .line 603
    .line 604
    move/from16 v26, v10

    .line 605
    .line 606
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 607
    .line 608
    .line 609
    move-result v10

    .line 610
    move-object/from16 v39, v11

    .line 611
    .line 612
    const-class v11, Landroid/text/style/BackgroundColorSpan;

    .line 613
    .line 614
    move/from16 v35, v13

    .line 615
    .line 616
    const/4 v13, 0x0

    .line 617
    invoke-interface {v4, v13, v10, v11}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v10

    .line 621
    check-cast v10, [Landroid/text/style/BackgroundColorSpan;

    .line 622
    .line 623
    array-length v11, v10

    .line 624
    const/4 v13, 0x0

    .line 625
    :goto_19
    if-ge v13, v11, :cond_1f

    .line 626
    .line 627
    aget-object v36, v10, v13

    .line 628
    .line 629
    invoke-virtual/range {v36 .. v36}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 630
    .line 631
    .line 632
    move-result v36

    .line 633
    move-object/from16 v37, v10

    .line 634
    .line 635
    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 636
    .line 637
    .line 638
    move-result-object v10

    .line 639
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    add-int/lit8 v13, v13, 0x1

    .line 643
    .line 644
    move-object/from16 v10, v37

    .line 645
    .line 646
    goto :goto_19

    .line 647
    :cond_1f
    new-instance v10, Ljava/util/HashMap;

    .line 648
    .line 649
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    :goto_1a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 657
    .line 658
    .line 659
    move-result v11

    .line 660
    if-eqz v11, :cond_20

    .line 661
    .line 662
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v11

    .line 666
    check-cast v11, Ljava/lang/Integer;

    .line 667
    .line 668
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 669
    .line 670
    .line 671
    move-result v11

    .line 672
    const-string v13, "bg_"

    .line 673
    .line 674
    invoke-static {v11, v13}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v13

    .line 678
    move-object/from16 v36, v6

    .line 679
    .line 680
    new-instance v6, Ljava/lang/StringBuilder;

    .line 681
    .line 682
    move/from16 v37, v11

    .line 683
    .line 684
    const-string v11, "."

    .line 685
    .line 686
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    const-string v11, ",."

    .line 693
    .line 694
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    const-string v11, " *"

    .line 701
    .line 702
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v6

    .line 709
    invoke-static/range {v37 .. v37}, Lt2/w;->s(I)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v11

    .line 713
    sget v13, Lh1/i0;->a:I

    .line 714
    .line 715
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 716
    .line 717
    new-instance v13, Ljava/lang/StringBuilder;

    .line 718
    .line 719
    invoke-direct {v13, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v11

    .line 732
    invoke-virtual {v10, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-object/from16 v6, v36

    .line 736
    .line 737
    goto :goto_1a

    .line 738
    :cond_20
    new-instance v6, Landroid/util/SparseArray;

    .line 739
    .line 740
    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    .line 741
    .line 742
    .line 743
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 744
    .line 745
    .line 746
    move-result v10

    .line 747
    const-class v11, Ljava/lang/Object;

    .line 748
    .line 749
    const/4 v13, 0x0

    .line 750
    invoke-interface {v4, v13, v10, v11}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v10

    .line 754
    array-length v11, v10

    .line 755
    const/4 v13, 0x0

    .line 756
    :goto_1b
    if-ge v13, v11, :cond_46

    .line 757
    .line 758
    move-object/from16 v40, v3

    .line 759
    .line 760
    aget-object v3, v10, v13

    .line 761
    .line 762
    move-object/from16 v41, v7

    .line 763
    .line 764
    instance-of v7, v3, Landroid/text/style/StrikethroughSpan;

    .line 765
    .line 766
    const/16 v36, 0x0

    .line 767
    .line 768
    if-eqz v7, :cond_21

    .line 769
    .line 770
    const-string v37, "<span style=\'text-decoration:line-through;\'>"

    .line 771
    .line 772
    move-object/from16 v42, v37

    .line 773
    .line 774
    move/from16 v37, v7

    .line 775
    .line 776
    move-object/from16 v7, v42

    .line 777
    .line 778
    move-object/from16 v42, v10

    .line 779
    .line 780
    :goto_1c
    move/from16 v43, v11

    .line 781
    .line 782
    :goto_1d
    move/from16 v44, v13

    .line 783
    .line 784
    move-object/from16 v45, v14

    .line 785
    .line 786
    goto/16 :goto_23

    .line 787
    .line 788
    :cond_21
    move/from16 v37, v7

    .line 789
    .line 790
    instance-of v7, v3, Landroid/text/style/ForegroundColorSpan;

    .line 791
    .line 792
    if-eqz v7, :cond_22

    .line 793
    .line 794
    move-object v7, v3

    .line 795
    check-cast v7, Landroid/text/style/ForegroundColorSpan;

    .line 796
    .line 797
    invoke-virtual {v7}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    invoke-static {v7}, Lt2/w;->s(I)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v7

    .line 805
    sget v42, Lh1/i0;->a:I

    .line 806
    .line 807
    sget-object v42, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 808
    .line 809
    move-object/from16 v42, v10

    .line 810
    .line 811
    const-string v10, "<span style=\'color:"

    .line 812
    .line 813
    invoke-static {v10, v7, v5}, La1/a1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v7

    .line 817
    goto :goto_1c

    .line 818
    :cond_22
    move-object/from16 v42, v10

    .line 819
    .line 820
    instance-of v7, v3, Landroid/text/style/BackgroundColorSpan;

    .line 821
    .line 822
    if-eqz v7, :cond_23

    .line 823
    .line 824
    move-object v7, v3

    .line 825
    check-cast v7, Landroid/text/style/BackgroundColorSpan;

    .line 826
    .line 827
    invoke-virtual {v7}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 828
    .line 829
    .line 830
    move-result v7

    .line 831
    sget v10, Lh1/i0;->a:I

    .line 832
    .line 833
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 834
    .line 835
    const-string v10, "<span class=\'bg_"

    .line 836
    .line 837
    move/from16 v43, v11

    .line 838
    .line 839
    const-string v11, "\'>"

    .line 840
    .line 841
    invoke-static {v10, v7, v11}, La1/a1;->j(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v7

    .line 845
    goto :goto_1d

    .line 846
    :cond_23
    move/from16 v43, v11

    .line 847
    .line 848
    instance-of v7, v3, Lg1/e;

    .line 849
    .line 850
    if-eqz v7, :cond_24

    .line 851
    .line 852
    const-string v7, "<span style=\'text-combine-upright:all;\'>"

    .line 853
    .line 854
    goto :goto_1d

    .line 855
    :cond_24
    instance-of v7, v3, Landroid/text/style/AbsoluteSizeSpan;

    .line 856
    .line 857
    if-eqz v7, :cond_26

    .line 858
    .line 859
    move-object v7, v3

    .line 860
    check-cast v7, Landroid/text/style/AbsoluteSizeSpan;

    .line 861
    .line 862
    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getDip()Z

    .line 863
    .line 864
    .line 865
    move-result v10

    .line 866
    if-eqz v10, :cond_25

    .line 867
    .line 868
    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 869
    .line 870
    .line 871
    move-result v7

    .line 872
    int-to-float v7, v7

    .line 873
    goto :goto_1e

    .line 874
    :cond_25
    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 875
    .line 876
    .line 877
    move-result v7

    .line 878
    int-to-float v7, v7

    .line 879
    div-float v7, v7, v26

    .line 880
    .line 881
    :goto_1e
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 882
    .line 883
    .line 884
    move-result-object v7

    .line 885
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v7

    .line 889
    sget v10, Lh1/i0;->a:I

    .line 890
    .line 891
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 892
    .line 893
    const-string v11, "<span style=\'font-size:%.2fpx;\'>"

    .line 894
    .line 895
    invoke-static {v10, v11, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v7

    .line 899
    goto :goto_1d

    .line 900
    :cond_26
    instance-of v7, v3, Landroid/text/style/RelativeSizeSpan;

    .line 901
    .line 902
    if-eqz v7, :cond_27

    .line 903
    .line 904
    move-object v7, v3

    .line 905
    check-cast v7, Landroid/text/style/RelativeSizeSpan;

    .line 906
    .line 907
    invoke-virtual {v7}, Landroid/text/style/RelativeSizeSpan;->getSizeChange()F

    .line 908
    .line 909
    .line 910
    move-result v7

    .line 911
    mul-float v7, v7, v18

    .line 912
    .line 913
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 914
    .line 915
    .line 916
    move-result-object v7

    .line 917
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v7

    .line 921
    sget v10, Lh1/i0;->a:I

    .line 922
    .line 923
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 924
    .line 925
    const-string v11, "<span style=\'font-size:%.2f%%;\'>"

    .line 926
    .line 927
    invoke-static {v10, v11, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v7

    .line 931
    goto/16 :goto_1d

    .line 932
    .line 933
    :cond_27
    instance-of v7, v3, Landroid/text/style/TypefaceSpan;

    .line 934
    .line 935
    if-eqz v7, :cond_29

    .line 936
    .line 937
    move-object v7, v3

    .line 938
    check-cast v7, Landroid/text/style/TypefaceSpan;

    .line 939
    .line 940
    invoke-virtual {v7}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v7

    .line 944
    if-eqz v7, :cond_28

    .line 945
    .line 946
    sget v10, Lh1/i0;->a:I

    .line 947
    .line 948
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 949
    .line 950
    const-string v10, "<span style=\'font-family:\""

    .line 951
    .line 952
    const-string v11, "\";\'>"

    .line 953
    .line 954
    invoke-static {v10, v7, v11}, La1/a1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v7

    .line 958
    goto/16 :goto_1d

    .line 959
    .line 960
    :cond_28
    :goto_1f
    move/from16 v44, v13

    .line 961
    .line 962
    move-object/from16 v45, v14

    .line 963
    .line 964
    move-object/from16 v7, v36

    .line 965
    .line 966
    goto/16 :goto_23

    .line 967
    .line 968
    :cond_29
    instance-of v7, v3, Landroid/text/style/StyleSpan;

    .line 969
    .line 970
    if-eqz v7, :cond_2d

    .line 971
    .line 972
    move-object v7, v3

    .line 973
    check-cast v7, Landroid/text/style/StyleSpan;

    .line 974
    .line 975
    invoke-virtual {v7}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 976
    .line 977
    .line 978
    move-result v7

    .line 979
    const/4 v10, 0x1

    .line 980
    if-eq v7, v10, :cond_2c

    .line 981
    .line 982
    const/4 v11, 0x2

    .line 983
    if-eq v7, v11, :cond_2b

    .line 984
    .line 985
    const/4 v10, 0x3

    .line 986
    if-eq v7, v10, :cond_2a

    .line 987
    .line 988
    goto :goto_1f

    .line 989
    :cond_2a
    const-string v7, "<b><i>"

    .line 990
    .line 991
    goto/16 :goto_1d

    .line 992
    .line 993
    :cond_2b
    const-string v7, "<i>"

    .line 994
    .line 995
    goto/16 :goto_1d

    .line 996
    .line 997
    :cond_2c
    const-string v7, "<b>"

    .line 998
    .line 999
    goto/16 :goto_1d

    .line 1000
    .line 1001
    :cond_2d
    instance-of v7, v3, Lg1/g;

    .line 1002
    .line 1003
    if-eqz v7, :cond_31

    .line 1004
    .line 1005
    move-object v7, v3

    .line 1006
    check-cast v7, Lg1/g;

    .line 1007
    .line 1008
    iget v7, v7, Lg1/g;->b:I

    .line 1009
    .line 1010
    const/4 v10, -0x1

    .line 1011
    if-eq v7, v10, :cond_30

    .line 1012
    .line 1013
    const/4 v10, 0x1

    .line 1014
    if-eq v7, v10, :cond_2f

    .line 1015
    .line 1016
    const/4 v11, 0x2

    .line 1017
    if-eq v7, v11, :cond_2e

    .line 1018
    .line 1019
    goto :goto_1f

    .line 1020
    :cond_2e
    const-string v7, "<ruby style=\'ruby-position:under;\'>"

    .line 1021
    .line 1022
    goto/16 :goto_1d

    .line 1023
    .line 1024
    :cond_2f
    const-string v7, "<ruby style=\'ruby-position:over;\'>"

    .line 1025
    .line 1026
    goto/16 :goto_1d

    .line 1027
    .line 1028
    :cond_30
    const-string v7, "<ruby style=\'ruby-position:unset;\'>"

    .line 1029
    .line 1030
    goto/16 :goto_1d

    .line 1031
    .line 1032
    :cond_31
    instance-of v7, v3, Landroid/text/style/UnderlineSpan;

    .line 1033
    .line 1034
    if-eqz v7, :cond_32

    .line 1035
    .line 1036
    const-string v7, "<u>"

    .line 1037
    .line 1038
    goto/16 :goto_1d

    .line 1039
    .line 1040
    :cond_32
    instance-of v7, v3, Lg1/h;

    .line 1041
    .line 1042
    if-eqz v7, :cond_28

    .line 1043
    .line 1044
    move-object v7, v3

    .line 1045
    check-cast v7, Lg1/h;

    .line 1046
    .line 1047
    iget v10, v7, Lg1/h;->a:I

    .line 1048
    .line 1049
    iget v11, v7, Lg1/h;->b:I

    .line 1050
    .line 1051
    move/from16 v44, v13

    .line 1052
    .line 1053
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 1056
    .line 1057
    .line 1058
    move-object/from16 v45, v14

    .line 1059
    .line 1060
    const/4 v14, 0x1

    .line 1061
    if-eq v11, v14, :cond_34

    .line 1062
    .line 1063
    const/4 v14, 0x2

    .line 1064
    if-eq v11, v14, :cond_33

    .line 1065
    .line 1066
    goto :goto_20

    .line 1067
    :cond_33
    const-string v11, "open "

    .line 1068
    .line 1069
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    .line 1072
    goto :goto_20

    .line 1073
    :cond_34
    const/4 v14, 0x2

    .line 1074
    const-string v11, "filled "

    .line 1075
    .line 1076
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1077
    .line 1078
    .line 1079
    :goto_20
    if-eqz v10, :cond_38

    .line 1080
    .line 1081
    const/4 v11, 0x1

    .line 1082
    if-eq v10, v11, :cond_37

    .line 1083
    .line 1084
    if-eq v10, v14, :cond_36

    .line 1085
    .line 1086
    const/4 v11, 0x3

    .line 1087
    if-eq v10, v11, :cond_35

    .line 1088
    .line 1089
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    .line 1092
    goto :goto_21

    .line 1093
    :cond_35
    const-string v10, "sesame"

    .line 1094
    .line 1095
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1096
    .line 1097
    .line 1098
    goto :goto_21

    .line 1099
    :cond_36
    const-string v10, "dot"

    .line 1100
    .line 1101
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1102
    .line 1103
    .line 1104
    goto :goto_21

    .line 1105
    :cond_37
    const-string v10, "circle"

    .line 1106
    .line 1107
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    .line 1110
    goto :goto_21

    .line 1111
    :cond_38
    const-string v10, "none"

    .line 1112
    .line 1113
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1114
    .line 1115
    .line 1116
    :goto_21
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v10

    .line 1120
    iget v7, v7, Lg1/h;->c:I

    .line 1121
    .line 1122
    const/4 v11, 0x2

    .line 1123
    if-eq v7, v11, :cond_39

    .line 1124
    .line 1125
    const-string v7, "over right"

    .line 1126
    .line 1127
    goto :goto_22

    .line 1128
    :cond_39
    const-string v7, "under left"

    .line 1129
    .line 1130
    :goto_22
    filled-new-array {v10, v7}, [Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v7

    .line 1134
    sget v10, Lh1/i0;->a:I

    .line 1135
    .line 1136
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1137
    .line 1138
    const-string v11, "<span style=\'-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;\'>"

    .line 1139
    .line 1140
    invoke-static {v10, v11, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v7

    .line 1144
    :goto_23
    if-nez v37, :cond_3b

    .line 1145
    .line 1146
    instance-of v10, v3, Landroid/text/style/ForegroundColorSpan;

    .line 1147
    .line 1148
    if-nez v10, :cond_3b

    .line 1149
    .line 1150
    instance-of v10, v3, Landroid/text/style/BackgroundColorSpan;

    .line 1151
    .line 1152
    if-nez v10, :cond_3b

    .line 1153
    .line 1154
    instance-of v10, v3, Lg1/e;

    .line 1155
    .line 1156
    if-nez v10, :cond_3b

    .line 1157
    .line 1158
    instance-of v10, v3, Landroid/text/style/AbsoluteSizeSpan;

    .line 1159
    .line 1160
    if-nez v10, :cond_3b

    .line 1161
    .line 1162
    instance-of v10, v3, Landroid/text/style/RelativeSizeSpan;

    .line 1163
    .line 1164
    if-nez v10, :cond_3b

    .line 1165
    .line 1166
    instance-of v10, v3, Lg1/h;

    .line 1167
    .line 1168
    if-eqz v10, :cond_3a

    .line 1169
    .line 1170
    goto :goto_24

    .line 1171
    :cond_3a
    instance-of v10, v3, Landroid/text/style/TypefaceSpan;

    .line 1172
    .line 1173
    if-eqz v10, :cond_3d

    .line 1174
    .line 1175
    move-object v10, v3

    .line 1176
    check-cast v10, Landroid/text/style/TypefaceSpan;

    .line 1177
    .line 1178
    invoke-virtual {v10}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v10

    .line 1182
    if-eqz v10, :cond_3c

    .line 1183
    .line 1184
    :cond_3b
    :goto_24
    move-object v10, v12

    .line 1185
    goto :goto_26

    .line 1186
    :cond_3c
    :goto_25
    move-object/from16 v10, v36

    .line 1187
    .line 1188
    goto :goto_26

    .line 1189
    :cond_3d
    instance-of v10, v3, Landroid/text/style/StyleSpan;

    .line 1190
    .line 1191
    if-eqz v10, :cond_41

    .line 1192
    .line 1193
    move-object v10, v3

    .line 1194
    check-cast v10, Landroid/text/style/StyleSpan;

    .line 1195
    .line 1196
    invoke-virtual {v10}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 1197
    .line 1198
    .line 1199
    move-result v10

    .line 1200
    const/4 v11, 0x1

    .line 1201
    if-eq v10, v11, :cond_40

    .line 1202
    .line 1203
    const/4 v11, 0x2

    .line 1204
    if-eq v10, v11, :cond_3f

    .line 1205
    .line 1206
    const/4 v11, 0x3

    .line 1207
    if-eq v10, v11, :cond_3e

    .line 1208
    .line 1209
    goto :goto_25

    .line 1210
    :cond_3e
    const-string v36, "</i></b>"

    .line 1211
    .line 1212
    goto :goto_25

    .line 1213
    :cond_3f
    const-string v36, "</i>"

    .line 1214
    .line 1215
    goto :goto_25

    .line 1216
    :cond_40
    const-string v36, "</b>"

    .line 1217
    .line 1218
    goto :goto_25

    .line 1219
    :cond_41
    instance-of v10, v3, Lg1/g;

    .line 1220
    .line 1221
    if-eqz v10, :cond_42

    .line 1222
    .line 1223
    move-object v10, v3

    .line 1224
    check-cast v10, Lg1/g;

    .line 1225
    .line 1226
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1227
    .line 1228
    const-string v13, "<rt>"

    .line 1229
    .line 1230
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    iget-object v10, v10, Lg1/g;->a:Ljava/lang/String;

    .line 1234
    .line 1235
    invoke-static {v10}, Lw2/d0;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v10

    .line 1239
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1240
    .line 1241
    .line 1242
    const-string v10, "</rt></ruby>"

    .line 1243
    .line 1244
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v36

    .line 1251
    goto :goto_25

    .line 1252
    :cond_42
    instance-of v10, v3, Landroid/text/style/UnderlineSpan;

    .line 1253
    .line 1254
    if-eqz v10, :cond_3c

    .line 1255
    .line 1256
    const-string v36, "</u>"

    .line 1257
    .line 1258
    goto :goto_25

    .line 1259
    :goto_26
    invoke-interface {v4, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 1260
    .line 1261
    .line 1262
    move-result v11

    .line 1263
    invoke-interface {v4, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 1264
    .line 1265
    .line 1266
    move-result v3

    .line 1267
    if-eqz v7, :cond_45

    .line 1268
    .line 1269
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1270
    .line 1271
    .line 1272
    new-instance v13, Lw2/b0;

    .line 1273
    .line 1274
    invoke-direct {v13, v11, v3, v7, v10}, Lw2/b0;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v6, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v7

    .line 1281
    check-cast v7, Lw2/c0;

    .line 1282
    .line 1283
    if-nez v7, :cond_43

    .line 1284
    .line 1285
    new-instance v7, Lw2/c0;

    .line 1286
    .line 1287
    invoke-direct {v7}, Lw2/c0;-><init>()V

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v6, v11, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1291
    .line 1292
    .line 1293
    :cond_43
    iget-object v7, v7, Lw2/c0;->a:Ljava/util/ArrayList;

    .line 1294
    .line 1295
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v6, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v7

    .line 1302
    check-cast v7, Lw2/c0;

    .line 1303
    .line 1304
    if-nez v7, :cond_44

    .line 1305
    .line 1306
    new-instance v7, Lw2/c0;

    .line 1307
    .line 1308
    invoke-direct {v7}, Lw2/c0;-><init>()V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v6, v3, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1312
    .line 1313
    .line 1314
    :cond_44
    iget-object v3, v7, Lw2/c0;->b:Ljava/util/ArrayList;

    .line 1315
    .line 1316
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    :cond_45
    add-int/lit8 v13, v44, 0x1

    .line 1320
    .line 1321
    move-object/from16 v3, v40

    .line 1322
    .line 1323
    move-object/from16 v7, v41

    .line 1324
    .line 1325
    move-object/from16 v10, v42

    .line 1326
    .line 1327
    move/from16 v11, v43

    .line 1328
    .line 1329
    move-object/from16 v14, v45

    .line 1330
    .line 1331
    goto/16 :goto_1b

    .line 1332
    .line 1333
    :cond_46
    move-object/from16 v40, v3

    .line 1334
    .line 1335
    move-object/from16 v41, v7

    .line 1336
    .line 1337
    move-object/from16 v45, v14

    .line 1338
    .line 1339
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1340
    .line 1341
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 1342
    .line 1343
    .line 1344
    move-result v7

    .line 1345
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1346
    .line 1347
    .line 1348
    const/4 v7, 0x0

    .line 1349
    const/4 v13, 0x0

    .line 1350
    :goto_27
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 1351
    .line 1352
    .line 1353
    move-result v10

    .line 1354
    if-ge v13, v10, :cond_49

    .line 1355
    .line 1356
    invoke-virtual {v6, v13}, Landroid/util/SparseArray;->keyAt(I)I

    .line 1357
    .line 1358
    .line 1359
    move-result v10

    .line 1360
    invoke-interface {v4, v7, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v7

    .line 1364
    invoke-static {v7}, Lw2/d0;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v7

    .line 1368
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v6, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v7

    .line 1375
    check-cast v7, Lw2/c0;

    .line 1376
    .line 1377
    iget-object v11, v7, Lw2/c0;->b:Ljava/util/ArrayList;

    .line 1378
    .line 1379
    iget-object v14, v7, Lw2/c0;->a:Ljava/util/ArrayList;

    .line 1380
    .line 1381
    move-object/from16 v18, v6

    .line 1382
    .line 1383
    sget-object v6, Lw2/b0;->f:Lj0/a;

    .line 1384
    .line 1385
    invoke-static {v11, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1386
    .line 1387
    .line 1388
    iget-object v6, v7, Lw2/c0;->b:Ljava/util/ArrayList;

    .line 1389
    .line 1390
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1391
    .line 1392
    .line 1393
    move-result v7

    .line 1394
    const/4 v11, 0x0

    .line 1395
    :goto_28
    if-ge v11, v7, :cond_47

    .line 1396
    .line 1397
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v26

    .line 1401
    add-int/lit8 v11, v11, 0x1

    .line 1402
    .line 1403
    move-object/from16 v36, v6

    .line 1404
    .line 1405
    move-object/from16 v6, v26

    .line 1406
    .line 1407
    check-cast v6, Lw2/b0;

    .line 1408
    .line 1409
    iget-object v6, v6, Lw2/b0;->d:Ljava/lang/String;

    .line 1410
    .line 1411
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1412
    .line 1413
    .line 1414
    move-object/from16 v6, v36

    .line 1415
    .line 1416
    goto :goto_28

    .line 1417
    :cond_47
    sget-object v6, Lw2/b0;->e:Lj0/a;

    .line 1418
    .line 1419
    invoke-static {v14, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 1423
    .line 1424
    .line 1425
    move-result v6

    .line 1426
    const/4 v7, 0x0

    .line 1427
    :goto_29
    if-ge v7, v6, :cond_48

    .line 1428
    .line 1429
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v11

    .line 1433
    add-int/lit8 v7, v7, 0x1

    .line 1434
    .line 1435
    check-cast v11, Lw2/b0;

    .line 1436
    .line 1437
    iget-object v11, v11, Lw2/b0;->c:Ljava/lang/String;

    .line 1438
    .line 1439
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1440
    .line 1441
    .line 1442
    goto :goto_29

    .line 1443
    :cond_48
    add-int/lit8 v13, v13, 0x1

    .line 1444
    .line 1445
    move v7, v10

    .line 1446
    move-object/from16 v6, v18

    .line 1447
    .line 1448
    goto :goto_27

    .line 1449
    :cond_49
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 1450
    .line 1451
    .line 1452
    move-result v6

    .line 1453
    invoke-interface {v4, v7, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v4

    .line 1457
    invoke-static {v4}, Lw2/d0;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v4

    .line 1461
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1462
    .line 1463
    .line 1464
    new-instance v4, Lm7/s;

    .line 1465
    .line 1466
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v3

    .line 1470
    const/4 v10, 0x3

    .line 1471
    invoke-direct {v4, v3, v10}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 1472
    .line 1473
    .line 1474
    :goto_2a
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v3

    .line 1478
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v3

    .line 1482
    :goto_2b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1483
    .line 1484
    .line 1485
    move-result v6

    .line 1486
    if-eqz v6, :cond_4c

    .line 1487
    .line 1488
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v6

    .line 1492
    check-cast v6, Ljava/lang/String;

    .line 1493
    .line 1494
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v7

    .line 1498
    check-cast v7, Ljava/lang/String;

    .line 1499
    .line 1500
    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v7

    .line 1504
    check-cast v7, Ljava/lang/String;

    .line 1505
    .line 1506
    if-eqz v7, :cond_4b

    .line 1507
    .line 1508
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v6

    .line 1512
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1513
    .line 1514
    .line 1515
    move-result v6

    .line 1516
    if-eqz v6, :cond_4a

    .line 1517
    .line 1518
    goto :goto_2c

    .line 1519
    :cond_4a
    const/4 v6, 0x0

    .line 1520
    goto :goto_2d

    .line 1521
    :cond_4b
    :goto_2c
    const/4 v6, 0x1

    .line 1522
    :goto_2d
    invoke-static {v6}, Lh1/a;->j(Z)V

    .line 1523
    .line 1524
    .line 1525
    goto :goto_2b

    .line 1526
    :cond_4c
    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v3

    .line 1530
    invoke-static/range {v35 .. v35}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v26

    .line 1534
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v35

    .line 1538
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v36

    .line 1542
    iget v6, v8, Lg1/b;->q:F

    .line 1543
    .line 1544
    cmpl-float v7, v6, v23

    .line 1545
    .line 1546
    if-eqz v7, :cond_4f

    .line 1547
    .line 1548
    const/4 v11, 0x2

    .line 1549
    if-eq v15, v11, :cond_4e

    .line 1550
    .line 1551
    const/4 v11, 0x1

    .line 1552
    if-ne v15, v11, :cond_4d

    .line 1553
    .line 1554
    goto :goto_2e

    .line 1555
    :cond_4d
    const-string v7, "skewX"

    .line 1556
    .line 1557
    goto :goto_2f

    .line 1558
    :cond_4e
    :goto_2e
    const-string v7, "skewY"

    .line 1559
    .line 1560
    :goto_2f
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v6

    .line 1564
    filled-new-array {v7, v6}, [Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v6

    .line 1568
    sget v7, Lh1/i0;->a:I

    .line 1569
    .line 1570
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1571
    .line 1572
    const-string v11, "%s(%.2fdeg)"

    .line 1573
    .line 1574
    invoke-static {v7, v11, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v6

    .line 1578
    move-object/from16 v37, v6

    .line 1579
    .line 1580
    :goto_30
    move-object/from16 v24, v3

    .line 1581
    .line 1582
    goto :goto_31

    .line 1583
    :cond_4f
    move-object/from16 v37, v24

    .line 1584
    .line 1585
    goto :goto_30

    .line 1586
    :goto_31
    filled-new-array/range {v24 .. v37}, [Ljava/lang/Object;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v3

    .line 1590
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1591
    .line 1592
    const-string v7, "<div style=\'position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;\'>"

    .line 1593
    .line 1594
    invoke-static {v6, v7, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v3

    .line 1598
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1599
    .line 1600
    .line 1601
    const-string v3, "<span class=\'default_bg\'>"

    .line 1602
    .line 1603
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1604
    .line 1605
    .line 1606
    iget-object v3, v8, Lg1/b;->c:Landroid/text/Layout$Alignment;

    .line 1607
    .line 1608
    iget-object v4, v4, Lm7/s;->k:Ljava/lang/String;

    .line 1609
    .line 1610
    if-eqz v3, :cond_52

    .line 1611
    .line 1612
    sget-object v6, Lw2/k0;->a:[I

    .line 1613
    .line 1614
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1615
    .line 1616
    .line 1617
    move-result v3

    .line 1618
    aget v3, v6, v3

    .line 1619
    .line 1620
    const/4 v11, 0x1

    .line 1621
    if-eq v3, v11, :cond_51

    .line 1622
    .line 1623
    const/4 v11, 0x2

    .line 1624
    if-eq v3, v11, :cond_50

    .line 1625
    .line 1626
    move-object/from16 v3, v16

    .line 1627
    .line 1628
    goto :goto_32

    .line 1629
    :cond_50
    move-object/from16 v3, v45

    .line 1630
    .line 1631
    goto :goto_32

    .line 1632
    :cond_51
    const/4 v11, 0x2

    .line 1633
    move-object/from16 v3, v39

    .line 1634
    .line 1635
    :goto_32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1636
    .line 1637
    const-string v7, "<span style=\'display:inline-block; text-align:"

    .line 1638
    .line 1639
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v3

    .line 1652
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1659
    .line 1660
    .line 1661
    goto :goto_33

    .line 1662
    :cond_52
    const/4 v11, 0x2

    .line 1663
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1664
    .line 1665
    .line 1666
    :goto_33
    const-string v3, "</span></div>"

    .line 1667
    .line 1668
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1669
    .line 1670
    .line 1671
    add-int/lit8 v6, v38, 0x1

    .line 1672
    .line 1673
    move/from16 v5, v17

    .line 1674
    .line 1675
    move-object/from16 v3, v40

    .line 1676
    .line 1677
    move-object/from16 v7, v41

    .line 1678
    .line 1679
    const/4 v4, 0x0

    .line 1680
    const/4 v12, 0x1

    .line 1681
    goto/16 :goto_1

    .line 1682
    .line 1683
    :cond_53
    const-string v3, "</div></body></html>"

    .line 1684
    .line 1685
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1686
    .line 1687
    .line 1688
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1689
    .line 1690
    const-string v4, "<html><head><style>"

    .line 1691
    .line 1692
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v4

    .line 1699
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v4

    .line 1703
    :goto_34
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1704
    .line 1705
    .line 1706
    move-result v5

    .line 1707
    if-eqz v5, :cond_54

    .line 1708
    .line 1709
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v5

    .line 1713
    check-cast v5, Ljava/lang/String;

    .line 1714
    .line 1715
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1716
    .line 1717
    .line 1718
    const-string v6, "{"

    .line 1719
    .line 1720
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v5

    .line 1727
    check-cast v5, Ljava/lang/String;

    .line 1728
    .line 1729
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1730
    .line 1731
    .line 1732
    const-string v5, "}"

    .line 1733
    .line 1734
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1735
    .line 1736
    .line 1737
    goto :goto_34

    .line 1738
    :cond_54
    const-string v2, "</style></head>"

    .line 1739
    .line 1740
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1741
    .line 1742
    .line 1743
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v2

    .line 1747
    const/4 v13, 0x0

    .line 1748
    invoke-virtual {v1, v13, v2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v1

    .line 1755
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1756
    .line 1757
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1758
    .line 1759
    .line 1760
    move-result-object v1

    .line 1761
    const/4 v11, 0x1

    .line 1762
    invoke-static {v1, v11}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v1

    .line 1766
    const-string v2, "text/html"

    .line 1767
    .line 1768
    const-string v3, "base64"

    .line 1769
    .line 1770
    iget-object v4, v0, Lw2/l0;->k:Lw2/j0;

    .line 1771
    .line 1772
    invoke-virtual {v4, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1773
    .line 1774
    .line 1775
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p1, Lw2/l0;->l:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lw2/l0;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
