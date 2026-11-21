.class public final Lcom/exotv/net/MovieDetailActivity;
.super Lh/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final synthetic Y:I


# instance fields
.field public H:Li7/a0;

.field public I:J

.field public J:Landroid/widget/LinearLayout;

.field public K:Landroid/widget/ScrollView;

.field public L:Landroid/widget/FrameLayout;

.field public M:Landroid/widget/TextView;

.field public N:Landroid/widget/LinearLayout;

.field public final O:Ljava/util/ArrayList;

.field public P:Landroid/widget/TextView;

.field public Q:Landroid/widget/ProgressBar;

.field public R:Landroid/widget/TextView;

.field public S:Z

.field public T:Z

.field public U:I

.field public final V:Ll6/g;

.field public final W:I

.field public final X:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lh/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->O:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lw4/a0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, Lw4/a0;-><init>(Lcom/exotv/net/MovieDetailActivity;I)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ll6/g;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ll6/g;-><init>(Ly6/a;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/exotv/net/MovieDetailActivity;->V:Ll6/g;

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    iput v0, p0, Lcom/exotv/net/MovieDetailActivity;->W:I

    .line 26
    .line 27
    const/4 v0, -0x2

    .line 28
    iput v0, p0, Lcom/exotv/net/MovieDetailActivity;->X:I

    .line 29
    .line 30
    return-void
.end method

.method public static final r(Lcom/exotv/net/MovieDetailActivity;JLr6/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lw4/d0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lw4/d0;

    .line 11
    .line 12
    iget v3, v2, Lw4/d0;->p:I

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
    iput v3, v2, Lw4/d0;->p:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lw4/d0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lw4/d0;-><init>(Lcom/exotv/net/MovieDetailActivity;Lr6/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lw4/d0;->n:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lq6/a;->j:Lq6/a;

    .line 32
    .line 33
    iget v4, v2, Lw4/d0;->p:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    sget-object v7, Ll6/j;->a:Ll6/j;

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-ne v4, v6, :cond_2

    .line 42
    .line 43
    iget-object v0, v2, Lw4/d0;->m:Lcom/exotv/net/MovieDetailActivity;

    .line 44
    .line 45
    :try_start_0
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object v8, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_3
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_1
    sget-object v1, Li7/e0;->a:Lo7/e;

    .line 62
    .line 63
    sget-object v1, Lo7/d;->l:Lo7/d;

    .line 64
    .line 65
    new-instance v4, Lw4/e0;

    .line 66
    .line 67
    move-wide/from16 v8, p1

    .line 68
    .line 69
    invoke-direct {v4, v8, v9, v5}, Lw4/e0;-><init>(JLp6/c;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, v2, Lw4/d0;->m:Lcom/exotv/net/MovieDetailActivity;

    .line 73
    .line 74
    iput v6, v2, Lw4/d0;->p:I

    .line 75
    .line 76
    invoke-static {v1, v4, v2}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-ne v1, v3, :cond_1

    .line 81
    .line 82
    return-object v3

    .line 83
    :goto_1
    move-object v10, v1

    .line 84
    check-cast v10, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    iget-object v0, v8, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    sget-object v1, Lc5/r0;->a:Lc5/r0;

    .line 98
    .line 99
    const v1, 0x7f11011b

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    const-string v1, "getString(...)"

    .line 107
    .line 108
    invoke-static {v1, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance v11, Lw4/c0;

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-direct {v11, v8, v1}, Lw4/c0;-><init>(Lcom/exotv/net/MovieDetailActivity;I)V

    .line 115
    .line 116
    .line 117
    new-instance v12, Lw4/c0;

    .line 118
    .line 119
    invoke-direct {v12, v8, v6}, Lw4/c0;-><init>(Lcom/exotv/net/MovieDetailActivity;I)V

    .line 120
    .line 121
    .line 122
    iget-object v14, v8, Lcom/exotv/net/MovieDetailActivity;->O:Ljava/util/ArrayList;

    .line 123
    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/16 v17, 0x648

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v15, 0x0

    .line 130
    invoke-static/range {v8 .. v17}, Lc5/r0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ly6/l;Ly6/l;Lw4/g;Ljava/util/ArrayList;Lw4/s0;Lw4/t0;I)Landroid/widget/LinearLayout;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    return-object v7

    .line 138
    :cond_5
    const-string v0, "body"

    .line 139
    .line 140
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v5

    .line 144
    :catch_0
    :goto_2
    return-object v7
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Lh/i;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x2

    .line 17
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->rotationAnimation:I

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lc5/j;->a:Lc5/j;

    .line 23
    .line 24
    invoke-static {p0}, Lc5/j;->a(Lh/i;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lc5/j;->g(Lh/i;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "movie_id"

    .line 35
    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    invoke-virtual {p1, v0, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, Lcom/exotv/net/MovieDetailActivity;->I:J

    .line 43
    .line 44
    new-instance p1, Landroid/widget/FrameLayout;

    .line 45
    .line 46
    invoke-direct {p1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    sget v0, Lc5/z;->b:I

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Landroid/widget/LinearLayout;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 61
    .line 62
    .line 63
    const/16 v4, 0x14

    .line 64
    .line 65
    invoke-virtual {p0, v4}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/4 v10, 0x0

    .line 70
    invoke-virtual {v1, v10, v10, v10, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 74
    .line 75
    new-instance v1, Landroid/widget/ScrollView;

    .line 76
    .line 77
    invoke-direct {v1, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v10}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 84
    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    invoke-virtual {v1, v4}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lcom/exotv/net/MovieDetailActivity;->K:Landroid/widget/ScrollView;

    .line 91
    .line 92
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 93
    .line 94
    iget v11, p0, Lcom/exotv/net/MovieDetailActivity;->W:I

    .line 95
    .line 96
    invoke-direct {v4, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    .line 101
    .line 102
    new-instance v4, Landroid/widget/TextView;

    .line 103
    .line 104
    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {v4, v1}, Landroid/view/View;->setId(I)V

    .line 112
    .line 113
    .line 114
    const-string v1, "\u2039"

    .line 115
    .line 116
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    const/high16 v1, 0x41f00000    # 30.0f

    .line 120
    .line 121
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 122
    .line 123
    .line 124
    const/4 v1, -0x1

    .line 125
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 126
    .line 127
    .line 128
    const/16 v1, 0x11

    .line 129
    .line 130
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 131
    .line 132
    .line 133
    const v1, 0x7f11001b

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v4, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    const/16 v1, 0x66

    .line 144
    .line 145
    invoke-static {v1, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    const/16 v5, 0x16

    .line 150
    .line 151
    invoke-static {v1, v5, v10, v10}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 156
    .line 157
    .line 158
    const/16 v1, 0x2c

    .line 159
    .line 160
    invoke-virtual {p0, v1}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    invoke-virtual {v4, v5}, Landroid/view/View;->setMinimumWidth(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v1}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-virtual {v4, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v3}, Landroid/view/View;->setClickable(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Lb6/a;

    .line 181
    .line 182
    const/16 v3, 0xa

    .line 183
    .line 184
    invoke-direct {v1, v3, p0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    .line 189
    .line 190
    const/4 v8, 0x0

    .line 191
    const/16 v9, 0x1e4

    .line 192
    .line 193
    const/16 v5, 0x16

    .line 194
    .line 195
    const/4 v6, 0x0

    .line 196
    const/4 v7, 0x0

    .line 197
    move-object v3, p0

    .line 198
    invoke-static/range {v2 .. v9}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 199
    .line 200
    .line 201
    iput-object v4, v3, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 202
    .line 203
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 204
    .line 205
    iget v2, v3, Lcom/exotv/net/MovieDetailActivity;->X:I

    .line 206
    .line 207
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 208
    .line 209
    .line 210
    const v2, 0x800033

    .line 211
    .line 212
    .line 213
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 214
    .line 215
    const/16 v2, 0x8

    .line 216
    .line 217
    invoke-virtual {p0, v2}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v2}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 229
    .line 230
    invoke-virtual {p1, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    .line 232
    .line 233
    new-instance v1, Landroid/view/View;

    .line 234
    .line 235
    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 239
    .line 240
    .line 241
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 242
    .line 243
    invoke-direct {v0, v11, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 244
    .line 245
    .line 246
    const/16 v2, 0x50

    .line 247
    .line 248
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 249
    .line 250
    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    .line 252
    .line 253
    new-instance v0, Landroidx/media3/exoplayer/analytics/a;

    .line 254
    .line 255
    const/16 v2, 0xd

    .line 256
    .line 257
    invoke-direct {v0, p0, v2, v1}, Landroidx/media3/exoplayer/analytics/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    sget-object v1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 261
    .line 262
    invoke-static {p1, v0}, Lm0/e0;->j(Landroid/view/View;Lm0/o;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, p1}, Lh/i;->setContentView(Landroid/view/View;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Lcom/exotv/net/MovieDetailActivity;->u()V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_0
    move-object v3, p0

    .line 273
    const-string p1, "body"

    .line 274
    .line 275
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    const/4 p1, 0x0

    .line 279
    throw p1
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->H:Li7/a0;

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
    invoke-super {p0}, Lh/i;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lb/l;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->H:Li7/a0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string v0, "movie_id"

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Lcom/exotv/net/MovieDetailActivity;->I:J

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/exotv/net/MovieDetailActivity;->u()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lh/i;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/exotv/net/MovieDetailActivity;->S:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Lcom/exotv/net/MovieDetailActivity;->v(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final s(I)I
    .locals 2

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
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    float-to-int p1, p1

    .line 16
    return p1
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->V:Ll6/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final u()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/exotv/net/MovieDetailActivity;->S:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lcom/exotv/net/MovieDetailActivity;->v(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-boolean v1, p0, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 12
    .line 13
    const-string v1, "body"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->O:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    new-instance v1, Landroid/widget/FrameLayout;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroid/widget/ProgressBar;

    .line 36
    .line 37
    invoke-direct {v3, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 41
    .line 42
    iget v5, p0, Lcom/exotv/net/MovieDetailActivity;->X:I

    .line 43
    .line 44
    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 45
    .line 46
    .line 47
    const/16 v5, 0x11

    .line 48
    .line 49
    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 50
    .line 51
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 65
    .line 66
    int-to-float v4, v4

    .line 67
    invoke-virtual {p0}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    const v5, 0x3f051eb8    # 0.52f

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const v5, 0x3ed70a3d    # 0.42f

    .line 78
    .line 79
    .line 80
    :goto_0
    mul-float/2addr v4, v5

    .line 81
    float-to-int v4, v4

    .line 82
    iget v5, p0, Lcom/exotv/net/MovieDetailActivity;->U:I

    .line 83
    .line 84
    add-int/2addr v4, v5

    .line 85
    iget v5, p0, Lcom/exotv/net/MovieDetailActivity;->W:I

    .line 86
    .line 87
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Lc5/q0;

    .line 98
    .line 99
    const/4 v3, 0x3

    .line 100
    invoke-direct {v1, p0, v2, v3}, Lc5/q0;-><init>(Lh/i;Lp6/c;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v2, v1, v3}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, Lcom/exotv/net/MovieDetailActivity;->H:Li7/a0;

    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v2

    .line 114
    :cond_3
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v2
.end method

.method public final v(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "play pending="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, " (unavailable="

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ")"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "MovieDetailActivity"

    .line 31
    .line 32
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    iput-boolean p1, p0, Lcom/exotv/net/MovieDetailActivity;->S:Z

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    iget-boolean v1, p0, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v1, v0

    .line 47
    :goto_0
    iget-object v2, p0, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const-string v4, "playAction"

    .line 51
    .line 52
    if-eqz v2, :cond_8

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 58
    .line 59
    if-eqz v2, :cond_7

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Landroid/view/View;->setClickable(Z)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 65
    .line 66
    if-eqz v2, :cond_6

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lcom/exotv/net/MovieDetailActivity;->P:Landroid/widget/TextView;

    .line 72
    .line 73
    const/16 v2, 0x8

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    iget-boolean v3, p0, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 80
    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v3, v0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    :goto_1
    move v3, v2

    .line 87
    :goto_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    :cond_3
    iget-object v1, p0, Lcom/exotv/net/MovieDetailActivity;->Q:Landroid/widget/ProgressBar;

    .line 91
    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    iget-boolean p1, p0, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 97
    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    move v0, v2

    .line 102
    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    :cond_5
    return-void

    .line 106
    :cond_6
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v3

    .line 110
    :cond_7
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v3

    .line 114
    :cond_8
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v3
.end method
