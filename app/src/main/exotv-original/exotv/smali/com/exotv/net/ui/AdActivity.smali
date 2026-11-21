.class public final Lcom/exotv/net/ui/AdActivity;
.super Lh/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final P:Ljava/util/Set;


# instance fields
.field public H:Landroid/webkit/WebView;

.field public I:Landroid/widget/Button;

.field public J:Landroid/os/CountDownTimer;

.field public K:Ljava/lang/String;

.field public L:Z

.field public M:Ljava/lang/String;

.field public N:Ljava/lang/String;

.field public O:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "market"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "singleton(...)"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/exotv/net/ui/AdActivity;->P:Ljava/util/Set;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh/i;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static r(Lcom/exotv/net/ui/AdActivity;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const-string v2, "ad_next"

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Landroid/content/Intent;

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/content/Intent;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/content/Intent;

    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static final s(Lcom/exotv/net/ui/AdActivity;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/exotv/net/ui/AdActivity;->K:Ljava/lang/String;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/exotv/net/ui/AdActivity;->L:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const-string v0, "intent:"

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {p1, v0, v1}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_2
    iput-boolean v1, p0, Lcom/exotv/net/ui/AdActivity;->L:Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1}, Lcom/exotv/net/ui/AdActivity;->v(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_3
    const-string p0, "webView"

    .line 34
    .line 35
    invoke-static {p0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method

.method public static u(Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "intentUrl"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x23

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x6

    .line 12
    invoke-static {v0, v1, v2, v3}, Lh7/h;->A0(Ljava/lang/CharSequence;CII)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const-string v5, "substring(...)"

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    if-gez v4, :cond_0

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    add-int/2addr v4, v6

    .line 24
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v5, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    const/16 v8, 0x3a

    .line 32
    .line 33
    const-string v9, "https"

    .line 34
    .line 35
    const-string v10, "http"

    .line 36
    .line 37
    const-string v11, "toLowerCase(...)"

    .line 38
    .line 39
    const-string v12, ""

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    :cond_1
    :goto_1
    const/4 v6, 0x0

    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_2
    const-string v13, "intent:"

    .line 47
    .line 48
    invoke-static {v0, v13, v6}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    const-string v6, "S.browser_fallback_url"

    .line 56
    .line 57
    invoke-static {v4, v6}, Lcom/bumptech/glide/c;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-nez v6, :cond_5

    .line 62
    .line 63
    const-string v6, "browser_fallback_url"

    .line 64
    .line 65
    invoke-static {v4, v6}, Lcom/bumptech/glide/c;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-nez v6, :cond_5

    .line 70
    .line 71
    :cond_4
    const/4 v6, 0x0

    .line 72
    goto :goto_2

    .line 73
    :cond_5
    :try_start_0
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    invoke-virtual {v13}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v13

    .line 79
    invoke-static {v6, v13}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :catch_0
    const-string v13, "url"

    .line 84
    .line 85
    invoke-static {v13, v6}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v6, v8, v12}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 93
    .line 94
    invoke-virtual {v13, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    invoke-static {v11, v13}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    if-nez v14, :cond_6

    .line 106
    .line 107
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    if-eqz v13, :cond_4

    .line 112
    .line 113
    :cond_6
    :goto_2
    if-eqz v6, :cond_7

    .line 114
    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :cond_7
    const-string v6, "scheme"

    .line 118
    .line 119
    invoke-static {v4, v6}, Lcom/bumptech/glide/c;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    if-eqz v6, :cond_1

    .line 124
    .line 125
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 126
    .line 127
    invoke-virtual {v6, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v11, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-nez v13, :cond_8

    .line 139
    .line 140
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-nez v13, :cond_8

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_8
    const-string v13, "//"

    .line 148
    .line 149
    invoke-static {v0, v13, v12}, Lh7/h;->N0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-nez v13, :cond_9

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    const-string v13, "/"

    .line 161
    .line 162
    invoke-static {v0, v13, v2}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-eqz v13, :cond_a

    .line 167
    .line 168
    :goto_3
    goto :goto_1

    .line 169
    :cond_a
    const/16 v13, 0x2f

    .line 170
    .line 171
    invoke-static {v0, v13, v0}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    invoke-static {v13, v1, v13}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    if-nez v14, :cond_b

    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :cond_b
    invoke-static {v0, v1, v0}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    const/16 v15, 0x3f

    .line 192
    .line 193
    invoke-static {v14, v15, v12}, Lh7/h;->M0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    invoke-static {v0, v1, v0}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0, v15, v0}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0, v13, v12}, Lh7/h;->N0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v7, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v6, "://"

    .line 218
    .line 219
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-lez v0, :cond_c

    .line 233
    .line 234
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    :cond_c
    const-string v0, ";end"

    .line 241
    .line 242
    invoke-static {v4, v0, v2, v2, v3}, Lh7/h;->B0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-gez v0, :cond_d

    .line 247
    .line 248
    move-object v0, v12

    .line 249
    goto :goto_4

    .line 250
    :cond_d
    add-int/lit8 v0, v0, 0x4

    .line 251
    .line 252
    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v5, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    const-string v2, "#"

    .line 260
    .line 261
    invoke-static {v0, v2}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-lez v2, :cond_e

    .line 270
    .line 271
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    :cond_e
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    :goto_5
    if-nez v6, :cond_11

    .line 282
    .line 283
    if-eqz p1, :cond_f

    .line 284
    .line 285
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-eqz v0, :cond_f

    .line 290
    .line 291
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-eqz v0, :cond_f

    .line 296
    .line 297
    invoke-static {v0, v8, v12}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 302
    .line 303
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v11, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-nez v2, :cond_10

    .line 315
    .line 316
    invoke-virtual {v1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_f

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_f
    const/4 v7, 0x0

    .line 324
    goto :goto_7

    .line 325
    :cond_10
    :goto_6
    move-object v7, v0

    .line 326
    goto :goto_7

    .line 327
    :cond_11
    move-object v7, v6

    .line 328
    :goto_7
    return-object v7
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Lh/i;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lc5/j;->a(Lh/i;)V

    .line 5
    .line 6
    .line 7
    const p1, 0x7f0d001c

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lh/i;->setContentView(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lc5/j;->g(Lh/i;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "ad_url"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "ad_duration_ms"

    .line 31
    .line 32
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    const-wide/16 v6, 0x1

    .line 39
    .line 40
    const-wide/16 v8, 0x3e80

    .line 41
    .line 42
    invoke-static/range {v4 .. v9}, Lcom/bumptech/glide/c;->u(JJJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    const-string v4, "exotv_ads"

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-virtual {p0, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v6, "interstitial_last_shown_at"

    .line 62
    .line 63
    invoke-interface {v4, v6, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 68
    .line 69
    .line 70
    const v2, 0x7f0a0049

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v2}, Lh/i;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroid/widget/Button;

    .line 78
    .line 79
    iput-object v2, p0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    const-string v4, "close"

    .line 83
    .line 84
    if-eqz v2, :cond_8

    .line 85
    .line 86
    invoke-virtual {v2, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 87
    .line 88
    .line 89
    const v2, 0x7f0a004c

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2}, Lh/i;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const v6, 0x7f0a004b

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v6}, Lh/i;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    iget-object v7, p0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 104
    .line 105
    if-eqz v7, :cond_7

    .line 106
    .line 107
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    const-string v8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 112
    .line 113
    invoke-static {v8, v7}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 117
    .line 118
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 119
    .line 120
    sget v8, Lc5/z;->b:I

    .line 121
    .line 122
    invoke-virtual {v6, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 123
    .line 124
    .line 125
    new-instance v8, Landroidx/media3/exoplayer/analytics/i;

    .line 126
    .line 127
    invoke-direct {v8, p0, v7, v6}, Landroidx/media3/exoplayer/analytics/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-object v6, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 131
    .line 132
    invoke-static {v2, v8}, Lm0/e0;->j(Landroid/view/View;Lm0/o;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    const-wide/16 v6, 0x3e7

    .line 140
    .line 141
    add-long/2addr v6, v0

    .line 142
    const-wide/16 v8, 0x3e8

    .line 143
    .line 144
    div-long/2addr v6, v8

    .line 145
    long-to-int v6, v6

    .line 146
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    const v7, 0x7f11001f

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v7, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    iget-object v2, p0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 165
    .line 166
    if-eqz v2, :cond_5

    .line 167
    .line 168
    new-instance v4, Lb6/a;

    .line 169
    .line 170
    const/4 v6, 0x3

    .line 171
    invoke-direct {v4, v6, p0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 175
    .line 176
    .line 177
    const v2, 0x7f0a004d

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v2}, Lh/i;->findViewById(I)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Landroid/webkit/WebView;

    .line 185
    .line 186
    iput-object v2, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 187
    .line 188
    const-string v4, "webView"

    .line 189
    .line 190
    if-eqz v2, :cond_4

    .line 191
    .line 192
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    const-string v7, "getSettings(...)"

    .line 197
    .line 198
    invoke-static {v7, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    const/4 v7, 0x1

    .line 202
    invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 215
    .line 216
    .line 217
    const/4 v8, -0x1

    .line 218
    invoke-virtual {v6, v8}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v5}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6, v5}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-virtual {v5, v7}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 232
    .line 233
    .line 234
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5, v2, v7}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 239
    .line 240
    .line 241
    const v2, 0x7f0a004a

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v2}, Lh/i;->findViewById(I)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget-object v5, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 249
    .line 250
    if-eqz v5, :cond_3

    .line 251
    .line 252
    new-instance v6, Lc5/a;

    .line 253
    .line 254
    invoke-direct {v6, v2, p0}, Lc5/a;-><init>(Landroid/view/View;Lcom/exotv/net/ui/AdActivity;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5, v6}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 258
    .line 259
    .line 260
    iget-object v2, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 261
    .line 262
    if-eqz v2, :cond_2

    .line 263
    .line 264
    new-instance v5, Lc5/d;

    .line 265
    .line 266
    invoke-direct {v5, p0}, Lc5/d;-><init>(Lcom/exotv/net/ui/AdActivity;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v5}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 270
    .line 271
    .line 272
    iget-object v2, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 273
    .line 274
    if-eqz v2, :cond_1

    .line 275
    .line 276
    if-nez p1, :cond_0

    .line 277
    .line 278
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_0
    invoke-virtual {v2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    new-instance p1, Lc5/e;

    .line 286
    .line 287
    invoke-direct {p1, v0, v1, p0}, Lc5/e;-><init>(JLcom/exotv/net/ui/AdActivity;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    iput-object p1, p0, Lcom/exotv/net/ui/AdActivity;->J:Landroid/os/CountDownTimer;

    .line 295
    .line 296
    return-void

    .line 297
    :cond_1
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v3

    .line 301
    :cond_2
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v3

    .line 305
    :cond_3
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v3

    .line 309
    :cond_4
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v3

    .line 313
    :cond_5
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v3

    .line 317
    :cond_6
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v3

    .line 321
    :cond_7
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v3

    .line 325
    :cond_8
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v3
.end method

.method public final onDestroy()V
    .locals 4

    invoke-super {p0}, Lh/i;->onDestroy()V

    return-void

    .line 1
    iget-object v0, p0, Lcom/exotv/net/ui/AdActivity;->J:Landroid/os/CountDownTimer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/exotv/net/ui/AdActivity;->J:Landroid/os/CountDownTimer;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 12
    .line 13
    const-string v2, "webView"

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const-string v3, "about:blank"

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    invoke-static {v0}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-super {p0}, Lh/i;->onDestroy()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public final t(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/exotv/net/ui/AdActivity;->N:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-wide v2, p0, Lcom/exotv/net/ui/AdActivity;->O:J

    .line 14
    .line 15
    sub-long v2, v0, v2

    .line 16
    .line 17
    const-wide/16 v4, 0xbb8

    .line 18
    .line 19
    cmp-long v2, v2, v4

    .line 20
    .line 21
    if-gez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p2, p0, Lcom/exotv/net/ui/AdActivity;->N:Ljava/lang/String;

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/exotv/net/ui/AdActivity;->O:J

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public final v(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 8

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const-string v3, "toLowerCase(...)"

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v3, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_0
    if-eqz v1, :cond_9

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_2
    const-string v4, "http"

    .line 40
    .line 41
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_8

    .line 46
    .line 47
    const-string v4, "https"

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_3
    const-string v4, "intent"

    .line 58
    .line 59
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const-string v5, "nothing on this device can open "

    .line 64
    .line 65
    const-string v6, "AdActivity"

    .line 66
    .line 67
    sget-object v7, Lcom/exotv/net/ui/AdActivity;->P:Ljava/util/Set;

    .line 68
    .line 69
    if-eqz v4, :cond_6

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    :try_start_0
    invoke-static {p2, v0}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_1

    .line 77
    :catch_0
    move-exception v0

    .line 78
    const-string v1, "ad sent an intent link that could not be parsed"

    .line 79
    .line 80
    invoke-static {v6, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    .line 83
    move-object v0, v2

    .line 84
    :goto_1
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    if-eqz v2, :cond_5

    .line 108
    .line 109
    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    :try_start_1
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :catch_1
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    invoke-static {p2, v0}, Lcom/exotv/net/ui/AdActivity;->u(Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    if-eqz p2, :cond_9

    .line 143
    .line 144
    invoke-virtual {p0, p1, p2}, Lcom/exotv/net/ui/AdActivity;->t(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    invoke-static {p2, v0}, Lcom/exotv/net/ui/AdActivity;->u(Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-eqz p2, :cond_9

    .line 153
    .line 154
    invoke-virtual {p0, p1, p2}, Lcom/exotv/net/ui/AdActivity;->t(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    invoke-interface {v7, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_7

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    new-instance p1, Landroid/content/Intent;

    .line 166
    .line 167
    const-string p2, "android.intent.action.VIEW"

    .line 168
    .line 169
    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 170
    .line 171
    .line 172
    :try_start_2
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :catch_2
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance p2, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_8
    :goto_2
    if-eqz p1, :cond_9

    .line 197
    .line 198
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_9
    :goto_3
    return-void
.end method
