.class public final Lj6/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La1/l;Ljava/util/ArrayList;La1/z0;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lj6/q;->j:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj6/q;->k:Ljava/lang/Object;

    iput-object p3, p0, Lj6/q;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x6

    iput p3, p0, Lj6/q;->j:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lj6/q;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lj6/q;->j:I

    iput-object p1, p0, Lj6/q;->k:Ljava/lang/Object;

    iput-object p3, p0, Lj6/q;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Lj6/q;->j:I

    iput-object p1, p0, Lj6/q;->l:Ljava/lang/Object;

    iput-object p2, p0, Lj6/q;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lj6/q;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh4/u;->a()Lh4/u;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lu4/m;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lh4/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ln4/d;

    .line 25
    .line 26
    iget-object v0, v0, Ln4/d;->k:Ln4/e;

    .line 27
    .line 28
    iput-boolean v1, v0, Ln4/e;->k:Z

    .line 29
    .line 30
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ln4/d;

    .line 33
    .line 34
    iget-object v0, v0, Ln4/d;->j:Landroid/view/View;

    .line 35
    .line 36
    iget-object v1, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ln4/d;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ln4/d;

    .line 50
    .line 51
    iget-object v0, v0, Ln4/d;->k:Ln4/e;

    .line 52
    .line 53
    iget-object v0, v0, Ln4/e;->j:Ljava/util/Set;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_0
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lm7/g;

    .line 62
    .line 63
    iget-object v1, v0, Lm7/g;->m:Li7/r;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    :cond_0
    :try_start_0
    iget-object v3, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Ljava/lang/Runnable;

    .line 69
    .line 70
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v3

    .line 75
    sget-object v4, Lp6/i;->j:Lp6/i;

    .line 76
    .line 77
    invoke-static {v4, v3}, Li7/x;->i(Lp6/h;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-virtual {v0}, Lm7/g;->G()Ljava/lang/Runnable;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-nez v3, :cond_1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iput-object v3, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 88
    .line 89
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    const/16 v3, 0x10

    .line 92
    .line 93
    if-lt v2, v3, :cond_0

    .line 94
    .line 95
    invoke-virtual {v1, v0}, Li7/r;->E(Lp6/h;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_0

    .line 100
    .line 101
    invoke-virtual {v1, v0, p0}, Li7/r;->D(Lp6/h;Ljava/lang/Runnable;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    return-void

    .line 105
    :pswitch_1
    iget-object v0, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Li7/g;

    .line 108
    .line 109
    iget-object v1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Lj7/d;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Li7/g;->E(Li7/r;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_2
    iget-object v0, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lj0/f;

    .line 120
    .line 121
    iget-object v1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lj0/f;->accept(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_3
    iget-object v0, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, La1/o;

    .line 130
    .line 131
    iget-object v1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Landroid/graphics/Typeface;

    .line 134
    .line 135
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, Ld0/b;

    .line 138
    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ld0/b;->h(Landroid/graphics/Typeface;)V

    .line 142
    .line 143
    .line 144
    :cond_2
    return-void

    .line 145
    :pswitch_4
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 148
    .line 149
    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:Lt0/f;

    .line 150
    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    invoke-virtual {v0}, Lt0/f;->f()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_3

    .line 158
    .line 159
    iget-object v0, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Landroid/view/View;

    .line 162
    .line 163
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    return-void

    .line 167
    :pswitch_5
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Ld4/c;

    .line 170
    .line 171
    iget-boolean v1, v0, Ld4/c;->d:Z

    .line 172
    .line 173
    if-eqz v1, :cond_4

    .line 174
    .line 175
    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 176
    .line 177
    invoke-direct {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 193
    .line 194
    .line 195
    :cond_4
    :try_start_1
    iget-object v1, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v1, Ljava/lang/Runnable;

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :catchall_1
    move-exception v1

    .line 204
    iget-object v0, v0, Ld4/c;->c:Ld4/d;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    const/4 v0, 0x6

    .line 210
    const-string v2, "GlideExecutor"

    .line 211
    .line 212
    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_5

    .line 217
    .line 218
    const-string v0, "Request threw uncaught throwable"

    .line 219
    .line 220
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 221
    .line 222
    .line 223
    :cond_5
    :goto_2
    return-void

    .line 224
    :pswitch_6
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v1, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 227
    .line 228
    :try_start_2
    sget-object v2, Lb0/b;->d:Ljava/lang/reflect/Method;

    .line 229
    .line 230
    if-eqz v2, :cond_6

    .line 231
    .line 232
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 233
    .line 234
    const-string v4, "AppCompat recreation"

    .line 235
    .line 236
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :catchall_2
    move-exception v0

    .line 245
    goto :goto_3

    .line 246
    :catch_0
    move-exception v0

    .line 247
    goto :goto_4

    .line 248
    :cond_6
    sget-object v2, Lb0/b;->e:Ljava/lang/reflect/Method;

    .line 249
    .line 250
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 251
    .line 252
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :goto_3
    const-string v1, "ActivityRecreator"

    .line 261
    .line 262
    const-string v2, "Exception while invoking performStopActivity"

    .line 263
    .line 264
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 265
    .line 266
    .line 267
    goto :goto_5

    .line 268
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const-class v2, Ljava/lang/RuntimeException;

    .line 273
    .line 274
    if-ne v1, v2, :cond_8

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-eqz v1, :cond_8

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    const-string v2, "Unable to stop"

    .line 287
    .line 288
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-nez v1, :cond_7

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_7
    throw v0

    .line 296
    :cond_8
    :goto_5
    return-void

    .line 297
    :pswitch_7
    iget-object v0, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Landroid/app/Application;

    .line 300
    .line 301
    iget-object v1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Lb0/a;

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_8
    iget-object v0, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Lb0/a;

    .line 312
    .line 313
    iget-object v1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 314
    .line 315
    iput-object v1, v0, Lb0/a;->a:Ljava/lang/Object;

    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_9
    iget-object v0, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Ljava/util/ArrayList;

    .line 321
    .line 322
    iget-object v1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v1, La1/z0;

    .line 325
    .line 326
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_9

    .line 331
    .line 332
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    iget-object v0, v1, La1/z0;->c:La1/v;

    .line 336
    .line 337
    iget-object v0, v0, La1/v;->N:Landroid/view/View;

    .line 338
    .line 339
    iget v1, v1, La1/z0;->a:I

    .line 340
    .line 341
    invoke-static {v0, v1}, La1/a1;->a(Landroid/view/View;I)V

    .line 342
    .line 343
    .line 344
    :cond_9
    return-void

    .line 345
    :pswitch_a
    iget-object v0, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Lj6/p;

    .line 348
    .line 349
    iget-object v1, p0, Lj6/q;->k:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v1, Ljava/util/concurrent/Future;

    .line 352
    .line 353
    instance-of v2, v1, Lk6/a;

    .line 354
    .line 355
    if-eqz v2, :cond_c

    .line 356
    .line 357
    move-object v2, v1

    .line 358
    check-cast v2, Lk6/a;

    .line 359
    .line 360
    check-cast v2, Lj6/n;

    .line 361
    .line 362
    instance-of v3, v2, Lj6/g;

    .line 363
    .line 364
    if-eqz v3, :cond_a

    .line 365
    .line 366
    iget-object v2, v2, Lj6/n;->j:Ljava/lang/Object;

    .line 367
    .line 368
    instance-of v3, v2, Lj6/c;

    .line 369
    .line 370
    if-eqz v3, :cond_b

    .line 371
    .line 372
    check-cast v2, Lj6/c;

    .line 373
    .line 374
    iget-object v2, v2, Lj6/c;->a:Ljava/lang/Throwable;

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    :cond_b
    const/4 v2, 0x0

    .line 381
    :goto_6
    if-eqz v2, :cond_c

    .line 382
    .line 383
    invoke-interface {v0, v2}, Lj6/p;->onFailure(Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_c
    :try_start_3
    invoke-static {v1}, Landroid/support/v4/media/session/b;->u(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 391
    invoke-interface {v0, v1}, Lj6/p;->onSuccess(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    goto :goto_7

    .line 395
    :catchall_3
    move-exception v1

    .line 396
    invoke-interface {v0, v1}, Lj6/p;->onFailure(Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    goto :goto_7

    .line 400
    :catch_1
    move-exception v1

    .line 401
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-interface {v0, v1}, Lj6/p;->onFailure(Ljava/lang/Throwable;)V

    .line 406
    .line 407
    .line 408
    :goto_7
    return-void

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
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

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lj6/q;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, La4/c;

    .line 12
    .line 13
    const-class v1, Lj6/q;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, La4/c;-><init>(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lj6/q;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lj6/p;

    .line 27
    .line 28
    new-instance v2, La1/e;

    .line 29
    .line 30
    const/16 v3, 0xc

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v2, v3, v4}, La1/e;-><init>(IZ)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v0, La4/c;->m:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, La1/e;

    .line 39
    .line 40
    iput-object v2, v3, La1/e;->l:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v2, v0, La4/c;->m:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object v1, v2, La1/e;->k:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0}, La4/c;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
