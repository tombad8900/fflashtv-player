.class public final La1/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La1/f;->j:I

    .line 2
    .line 3
    iput-object p2, p0, La1/f;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La1/f;->j:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La1/f;->k:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 14
    .line 15
    invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C0()Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast v5, Lz2/j;

    .line 20
    .line 21
    iget-object v1, v5, Lz2/j;->z:Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    iget v6, v5, Lz2/j;->A:I

    .line 24
    .line 25
    if-eq v6, v3, :cond_0

    .line 26
    .line 27
    if-eq v6, v2, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v6, 0x3

    .line 34
    iput v6, v5, Lz2/j;->A:I

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/lang/Float;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    new-array v2, v2, [F

    .line 47
    .line 48
    aput v5, v2, v4

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    aput v4, v2, v3

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 54
    .line 55
    .line 56
    const/16 v2, 0x1f4

    .line 57
    .line 58
    int-to-long v2, v2

    .line 59
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void

    .line 66
    :pswitch_1
    check-cast v5, Lt0/f;

    .line 67
    .line 68
    invoke-virtual {v5, v4}, Lt0/f;->m(I)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_2
    check-cast v5, Lq0/d;

    .line 73
    .line 74
    iget-object v1, v5, Lq0/d;->l:Lm/i1;

    .line 75
    .line 76
    iget-object v2, v5, Lq0/d;->j:Lq0/a;

    .line 77
    .line 78
    iget-boolean v3, v5, Lq0/d;->x:Z

    .line 79
    .line 80
    if-nez v3, :cond_2

    .line 81
    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :cond_2
    iget-boolean v3, v5, Lq0/d;->v:Z

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    iput-boolean v4, v5, Lq0/d;->v:Z

    .line 89
    .line 90
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    iput-wide v6, v2, Lq0/a;->e:J

    .line 95
    .line 96
    const-wide/16 v8, -0x1

    .line 97
    .line 98
    iput-wide v8, v2, Lq0/a;->g:J

    .line 99
    .line 100
    iput-wide v6, v2, Lq0/a;->f:J

    .line 101
    .line 102
    const/high16 v3, 0x3f000000    # 0.5f

    .line 103
    .line 104
    iput v3, v2, Lq0/a;->h:F

    .line 105
    .line 106
    :cond_3
    iget-wide v6, v2, Lq0/a;->g:J

    .line 107
    .line 108
    const-wide/16 v8, 0x0

    .line 109
    .line 110
    cmp-long v3, v6, v8

    .line 111
    .line 112
    if-lez v3, :cond_4

    .line 113
    .line 114
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    iget-wide v10, v2, Lq0/a;->g:J

    .line 119
    .line 120
    iget v3, v2, Lq0/a;->i:I

    .line 121
    .line 122
    int-to-long v12, v3

    .line 123
    add-long/2addr v10, v12

    .line 124
    cmp-long v3, v6, v10

    .line 125
    .line 126
    if-lez v3, :cond_4

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    invoke-virtual {v5}, Lq0/d;->e()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_5

    .line 134
    .line 135
    :goto_1
    iput-boolean v4, v5, Lq0/d;->x:Z

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    iget-boolean v3, v5, Lq0/d;->w:Z

    .line 139
    .line 140
    if-eqz v3, :cond_6

    .line 141
    .line 142
    iput-boolean v4, v5, Lq0/d;->w:Z

    .line 143
    .line 144
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 145
    .line 146
    .line 147
    move-result-wide v10

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const/4 v14, 0x3

    .line 153
    const/4 v15, 0x0

    .line 154
    move-wide v12, v10

    .line 155
    invoke-static/range {v10 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v1, v3}, Lm/i1;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 163
    .line 164
    .line 165
    :cond_6
    iget-wide v3, v2, Lq0/a;->f:J

    .line 166
    .line 167
    cmp-long v3, v3, v8

    .line 168
    .line 169
    if-eqz v3, :cond_7

    .line 170
    .line 171
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v3

    .line 175
    invoke-virtual {v2, v3, v4}, Lq0/a;->a(J)F

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    const/high16 v7, -0x3f800000    # -4.0f

    .line 180
    .line 181
    mul-float/2addr v7, v6

    .line 182
    mul-float/2addr v7, v6

    .line 183
    const/high16 v8, 0x40800000    # 4.0f

    .line 184
    .line 185
    mul-float/2addr v6, v8

    .line 186
    add-float/2addr v6, v7

    .line 187
    iget-wide v7, v2, Lq0/a;->f:J

    .line 188
    .line 189
    sub-long v7, v3, v7

    .line 190
    .line 191
    iput-wide v3, v2, Lq0/a;->f:J

    .line 192
    .line 193
    long-to-float v3, v7

    .line 194
    mul-float/2addr v3, v6

    .line 195
    iget v2, v2, Lq0/a;->d:F

    .line 196
    .line 197
    mul-float/2addr v3, v2

    .line 198
    float-to-int v2, v3

    .line 199
    iget-object v3, v5, Lq0/d;->z:Lm/i1;

    .line 200
    .line 201
    invoke-virtual {v3, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 202
    .line 203
    .line 204
    sget-object v2, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 205
    .line 206
    invoke-virtual {v1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 207
    .line 208
    .line 209
    :goto_2
    return-void

    .line 210
    :cond_7
    new-instance v1, Ljava/lang/RuntimeException;

    .line 211
    .line 212
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 213
    .line 214
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v1

    .line 218
    :pswitch_3
    check-cast v5, Landroidx/appcompat/widget/Toolbar;

    .line 219
    .line 220
    iget-object v1, v5, Landroidx/appcompat/widget/Toolbar;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 221
    .line 222
    if-eqz v1, :cond_8

    .line 223
    .line 224
    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->C:Lm/k;

    .line 225
    .line 226
    if-eqz v1, :cond_8

    .line 227
    .line 228
    invoke-virtual {v1}, Lm/k;->l()Z

    .line 229
    .line 230
    .line 231
    :cond_8
    return-void

    .line 232
    :pswitch_4
    check-cast v5, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 233
    .line 234
    iget-boolean v1, v5, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->o:Z

    .line 235
    .line 236
    if-eqz v1, :cond_9

    .line 237
    .line 238
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    const-string v2, "input_method"

    .line 243
    .line 244
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 249
    .line 250
    invoke-virtual {v1, v5, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 251
    .line 252
    .line 253
    iput-boolean v4, v5, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->o:Z

    .line 254
    .line 255
    :cond_9
    return-void

    .line 256
    :pswitch_5
    check-cast v5, Lm/i1;

    .line 257
    .line 258
    const/4 v1, 0x0

    .line 259
    iput-object v1, v5, Lm/i1;->u:La1/f;

    .line 260
    .line 261
    invoke-virtual {v5}, Lm/i1;->drawableStateChanged()V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_6
    check-cast v5, Li5/d;

    .line 266
    .line 267
    iput-boolean v4, v5, Li5/d;->c:Z

    .line 268
    .line 269
    iget-object v1, v5, Li5/d;->e:Lz/a;

    .line 270
    .line 271
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 272
    .line 273
    iget-object v3, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:Lt0/f;

    .line 274
    .line 275
    if-eqz v3, :cond_a

    .line 276
    .line 277
    invoke-virtual {v3}, Lt0/f;->f()Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-eqz v3, :cond_a

    .line 282
    .line 283
    iget v1, v5, Li5/d;->b:I

    .line 284
    .line 285
    invoke-virtual {v5, v1}, Li5/d;->a(I)V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_a
    iget v3, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 290
    .line 291
    if-ne v3, v2, :cond_b

    .line 292
    .line 293
    iget v2, v5, Li5/d;->b:I

    .line 294
    .line 295
    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F(I)V

    .line 296
    .line 297
    .line 298
    :cond_b
    :goto_3
    return-void

    .line 299
    :pswitch_7
    check-cast v5, Lcom/bumptech/glide/m;

    .line 300
    .line 301
    iget-object v1, v5, Lcom/bumptech/glide/m;->l:Ln4/g;

    .line 302
    .line 303
    invoke-interface {v1, v5}, Ln4/g;->a(Ln4/i;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_8
    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 308
    .line 309
    iget-object v1, v5, Lcom/google/android/material/textfield/TextInputLayout;->l:Lb6/t;

    .line 310
    .line 311
    iget-object v1, v1, Lb6/t;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 312
    .line 313
    invoke-virtual {v1}, Landroid/view/View;->performClick()Z

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_9
    move-object v1, v5

    .line 321
    check-cast v1, La4/c;

    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    :goto_4
    :try_start_0
    iget-object v2, v1, La4/c;->l:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v2, Ljava/lang/ref/ReferenceQueue;

    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, La4/b;

    .line 335
    .line 336
    invoke-virtual {v1, v2}, La4/c;->r(La4/b;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 337
    .line 338
    .line 339
    goto :goto_4

    .line 340
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 345
    .line 346
    .line 347
    goto :goto_4

    .line 348
    :pswitch_a
    const/16 v1, 0xa

    .line 349
    .line 350
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 351
    .line 352
    .line 353
    check-cast v5, Ljava/lang/Runnable;

    .line 354
    .line 355
    invoke-interface {v5}, Ljava/lang/Runnable;->run()V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :pswitch_b
    check-cast v5, La1/n0;

    .line 360
    .line 361
    invoke-virtual {v5, v3}, La1/n0;->y(Z)Z

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :pswitch_c
    check-cast v5, La1/q;

    .line 366
    .line 367
    iget-object v1, v5, La1/q;->d0:La1/n;

    .line 368
    .line 369
    iget-object v2, v5, La1/q;->l0:Landroid/app/Dialog;

    .line 370
    .line 371
    invoke-virtual {v1, v2}, La1/n;->onDismiss(Landroid/content/DialogInterface;)V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_d
    check-cast v5, La1/g;

    .line 376
    .line 377
    iget-object v1, v5, La1/g;->b:Landroid/view/ViewGroup;

    .line 378
    .line 379
    iget-object v2, v5, La1/g;->c:Landroid/view/View;

    .line 380
    .line 381
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 382
    .line 383
    .line 384
    iget-object v1, v5, La1/g;->d:La1/i;

    .line 385
    .line 386
    invoke-virtual {v1}, La1/j;->d()V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    nop

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
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
