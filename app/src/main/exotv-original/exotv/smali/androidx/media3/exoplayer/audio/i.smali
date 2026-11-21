.class public final synthetic Landroidx/media3/exoplayer/audio/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/audio/i;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/i;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/audio/i;->l:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/audio/i;->j:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/i;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, Landroidx/media3/exoplayer/audio/i;->k:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    check-cast v4, Lcom/exotv/net/MainActivity;

    .line 16
    .line 17
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 18
    .line 19
    sget-object v0, Lc5/r0;->a:Lc5/r0;

    .line 20
    .line 21
    instance-of v0, v5, Lc5/g0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move-object v3, v5

    .line 26
    check-cast v3, Lc5/g0;

    .line 27
    .line 28
    :cond_0
    const/4 v0, -0x1

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-static {v5}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_6

    .line 36
    .line 37
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-virtual {v6}, Lz2/x;->a()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move v6, v1

    .line 54
    :goto_0
    if-nez v6, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iget v0, v3, Lc5/g0;->W0:I

    .line 58
    .line 59
    if-ltz v0, :cond_4

    .line 60
    .line 61
    if-ge v0, v6, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    if-le v6, v2, :cond_5

    .line 65
    .line 66
    move v1, v2

    .line 67
    :cond_5
    iput v1, v3, Lc5/g0;->W0:I

    .line 68
    .line 69
    :goto_1
    iget v0, v3, Lc5/g0;->W0:I

    .line 70
    .line 71
    :cond_6
    :goto_2
    invoke-virtual {v5, v0}, Landroidx/recyclerview/widget/RecyclerView;->H(I)Lz2/v0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_7

    .line 76
    .line 77
    iget-object v1, v1, Lz2/v0;->a:Landroid/view/View;

    .line 78
    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    :cond_7
    invoke-static {v5}, Lcom/exotv/net/MainActivity;->C(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_8
    if-eqz v1, :cond_9

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 94
    .line 95
    .line 96
    new-instance v1, Landroidx/media3/exoplayer/drm/f;

    .line 97
    .line 98
    invoke-direct {v1, v0, v5, v4}, Landroidx/media3/exoplayer/drm/f;-><init>(ILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 102
    .line 103
    .line 104
    :cond_9
    invoke-static {v5}, Lc5/r0;->c(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_0
    check-cast v5, Lw4/e;

    .line 109
    .line 110
    check-cast v4, Ljava/io/Serializable;

    .line 111
    .line 112
    new-instance v0, Ll6/f;

    .line 113
    .line 114
    invoke-direct {v0, v4}, Ll6/f;-><init>(Ljava/io/Serializable;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v0}, Lw4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_1
    check-cast v5, Landroidx/media3/ui/PlayerView;

    .line 122
    .line 123
    check-cast v4, Landroid/graphics/Bitmap;

    .line 124
    .line 125
    invoke-static {v5, v4}, Landroidx/media3/ui/PlayerView;->a(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_2
    check-cast v5, Lcom/google/android/material/button/MaterialButton;

    .line 130
    .line 131
    check-cast v4, Ljava/lang/Runnable;

    .line 132
    .line 133
    sget-object v0, Lcom/google/android/material/button/MaterialButton;->a0:[I

    .line 134
    .line 135
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 136
    .line 137
    .line 138
    iget-object v0, v5, Lcom/google/android/material/button/MaterialButton;->M:Landroid/widget/LinearLayout$LayoutParams;

    .line 139
    .line 140
    if-eqz v0, :cond_a

    .line 141
    .line 142
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    .line 144
    .line 145
    iput-object v3, v5, Lcom/google/android/material/button/MaterialButton;->M:Landroid/widget/LinearLayout$LayoutParams;

    .line 146
    .line 147
    const/high16 v0, -0x31000000

    .line 148
    .line 149
    iput v0, v5, Lcom/google/android/material/button/MaterialButton;->J:F

    .line 150
    .line 151
    :cond_a
    invoke-virtual {v5}, Landroid/view/View;->requestLayout()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_3
    check-cast v5, Lh1/t;

    .line 156
    .line 157
    check-cast v4, Landroidx/media3/exoplayer/upstream/c;

    .line 158
    .line 159
    invoke-virtual {v5}, Lh1/t;->c()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {v4, v0}, Landroidx/media3/exoplayer/upstream/c;->a(I)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_4
    check-cast v5, Lh/m;

    .line 168
    .line 169
    check-cast v4, Ljava/lang/Runnable;

    .line 170
    .line 171
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    :try_start_0
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5}, Lh/m;->a()V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    invoke-virtual {v5}, Lh/m;->a()V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :pswitch_5
    check-cast v5, Ld0/b;

    .line 187
    .line 188
    check-cast v4, Landroid/graphics/Typeface;

    .line 189
    .line 190
    invoke-virtual {v5, v4}, Ld0/b;->h(Landroid/graphics/Typeface;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :pswitch_6
    check-cast v5, Landroid/widget/TextView;

    .line 195
    .line 196
    check-cast v4, Landroid/widget/TextView;

    .line 197
    .line 198
    invoke-virtual {v5}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-nez v0, :cond_b

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_b
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    sub-int/2addr v6, v2

    .line 210
    if-gez v6, :cond_c

    .line 211
    .line 212
    move v6, v1

    .line 213
    :cond_c
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-virtual {v0, v6}, Landroid/text/Layout;->getLineTop(I)I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    add-int/2addr v7, v2

    .line 222
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    invoke-virtual {v0, v6}, Landroid/text/Layout;->getLineBottom(I)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    add-int/2addr v0, v2

    .line 231
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    instance-of v5, v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 236
    .line 237
    if-eqz v5, :cond_d

    .line 238
    .line 239
    move-object v3, v2

    .line 240
    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 241
    .line 242
    :cond_d
    if-nez v3, :cond_e

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_e
    add-int/2addr v7, v0

    .line 246
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    sub-int/2addr v7, v0

    .line 251
    div-int/lit8 v7, v7, 0x2

    .line 252
    .line 253
    if-gez v7, :cond_f

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_f
    move v1, v7

    .line 257
    :goto_3
    iget v0, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 258
    .line 259
    if-eq v0, v1, :cond_10

    .line 260
    .line 261
    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 262
    .line 263
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 264
    .line 265
    .line 266
    :cond_10
    :goto_4
    return-void

    .line 267
    :pswitch_7
    check-cast v5, Lcom/exotv/net/ui/AdActivity;

    .line 268
    .line 269
    check-cast v4, Ljava/lang/String;

    .line 270
    .line 271
    iget-object v0, v5, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 272
    .line 273
    if-eqz v0, :cond_11

    .line 274
    .line 275
    invoke-virtual {v5, v0, v4}, Lcom/exotv/net/ui/AdActivity;->v(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_11
    const-string v0, "webView"

    .line 280
    .line 281
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v3

    .line 285
    :pswitch_8
    check-cast v5, Lh/i;

    .line 286
    .line 287
    check-cast v4, Lb/x;

    .line 288
    .line 289
    sget v0, Lb/l;->A:I

    .line 290
    .line 291
    iget-object v0, v5, Lb0/e;->j:Landroidx/lifecycle/x;

    .line 292
    .line 293
    new-instance v1, Lb/f;

    .line 294
    .line 295
    invoke-direct {v1, v4, v5}, Lb/f;-><init>(Lb/x;Lh/i;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/u;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_9
    check-cast v5, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 303
    .line 304
    check-cast v4, Landroid/graphics/SurfaceTexture;

    .line 305
    .line 306
    invoke-static {v5, v4}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->b(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;Landroid/graphics/SurfaceTexture;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :pswitch_a
    check-cast v5, Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 311
    .line 312
    check-cast v4, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;

    .line 313
    .line 314
    invoke-static {v5, v4}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->a(Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_b
    check-cast v5, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 319
    .line 320
    check-cast v4, Ljava/lang/String;

    .line 321
    .line 322
    invoke-static {v5, v4}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->l(Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
