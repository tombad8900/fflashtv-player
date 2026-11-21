.class public final synthetic Landroidx/media3/exoplayer/audio/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


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
    iput p5, p0, Landroidx/media3/exoplayer/audio/j;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/j;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/media3/exoplayer/audio/j;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Landroidx/media3/exoplayer/audio/j;->m:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Landroidx/media3/exoplayer/audio/j;->n:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/audio/j;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/j;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw4/b;

    .line 9
    .line 10
    iget-object v0, v0, Lw4/b;->a:Lcom/exotv/net/MainActivity;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/j;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/content/Intent;

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/j;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lz6/n;

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/j;->n:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ljava/util/concurrent/CountDownLatch;

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    const-string v0, "ApkInstaller"

    .line 40
    .line 41
    const-string v1, "Launched system installer UI"

    .line 42
    .line 43
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :goto_2
    :try_start_1
    iput-object v0, v2, Lz6/n;->j:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :goto_3
    return-void

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/j;->k:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lw4/b;

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/j;->l:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/j;->m:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lh7/q;

    .line 70
    .line 71
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/j;->n:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lw4/e;

    .line 74
    .line 75
    const-string v4, "Reusing staged APK ("

    .line 76
    .line 77
    :try_start_2
    new-instance v5, Ljava/io/File;

    .line 78
    .line 79
    iget-object v6, v0, Lw4/b;->a:Lcom/exotv/net/MainActivity;

    .line 80
    .line 81
    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const-string v7, "update_apk"

    .line 86
    .line 87
    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_1

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :catchall_2
    move-exception v1

    .line 101
    goto/16 :goto_8

    .line 102
    .line 103
    :cond_1
    :goto_4
    new-instance v6, Ljava/io/File;

    .line 104
    .line 105
    const-string v7, "exotv_update.apk"

    .line 106
    .line 107
    invoke-direct {v6, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const-wide/16 v10, 0x0

    .line 117
    .line 118
    if-eqz v7, :cond_2

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 121
    .line 122
    .line 123
    move-result-wide v12

    .line 124
    cmp-long v7, v12, v10

    .line 125
    .line 126
    if-lez v7, :cond_2

    .line 127
    .line 128
    iget-object v7, v0, Lw4/b;->d:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v7, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-eqz v7, :cond_2

    .line 135
    .line 136
    const-string v1, "ApkInstaller"

    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 139
    .line 140
    .line 141
    move-result-wide v10

    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v4, " bytes), skipping download"

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_2
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-eqz v4, :cond_3

    .line 168
    .line 169
    array-length v7, v4

    .line 170
    move v12, v9

    .line 171
    :goto_5
    if-ge v12, v7, :cond_3

    .line 172
    .line 173
    aget-object v13, v4, v12

    .line 174
    .line 175
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    .line 176
    .line 177
    .line 178
    add-int/lit8 v12, v12, 0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_3
    iput-object v8, v0, Lw4/b;->d:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v0, v1, v6, v2}, Lw4/b;->a(Ljava/lang/String;Ljava/io/File;Lh7/q;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_5

    .line 191
    .line 192
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 193
    .line 194
    .line 195
    move-result-wide v12

    .line 196
    cmp-long v2, v12, v10

    .line 197
    .line 198
    if-eqz v2, :cond_5

    .line 199
    .line 200
    iput-object v1, v0, Lw4/b;->d:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 201
    .line 202
    :goto_6
    :try_start_3
    invoke-virtual {v0, v6}, Lw4/b;->c(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 203
    .line 204
    .line 205
    :try_start_4
    invoke-virtual {v0, v6}, Lw4/b;->b(Ljava/io/File;)V

    .line 206
    .line 207
    .line 208
    const-string v1, "ok"

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :catch_0
    move-exception v1

    .line 212
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    if-eqz v2, :cond_4

    .line 217
    .line 218
    array-length v4, v2

    .line 219
    :goto_7
    if-ge v9, v4, :cond_4

    .line 220
    .line 221
    aget-object v5, v2, v9

    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 224
    .line 225
    .line 226
    add-int/lit8 v9, v9, 0x1

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_4
    iput-object v8, v0, Lw4/b;->d:Ljava/lang/String;

    .line 230
    .line 231
    throw v1

    .line 232
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 233
    .line 234
    const-string v2, "Downloaded APK is empty"

    .line 235
    .line 236
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 240
    :goto_8
    invoke-static {v1}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    :goto_9
    iget-object v0, v0, Lw4/b;->c:Landroid/os/Handler;

    .line 245
    .line 246
    new-instance v2, Landroidx/media3/exoplayer/audio/i;

    .line 247
    .line 248
    const/16 v4, 0xb

    .line 249
    .line 250
    invoke-direct {v2, v3, v4, v1}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/j;->k:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Landroid/media/AudioTrack;

    .line 260
    .line 261
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/j;->l:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 264
    .line 265
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/j;->m:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v2, Landroid/os/Handler;

    .line 268
    .line 269
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/j;->n:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v3, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;

    .line 272
    .line 273
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->c(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
