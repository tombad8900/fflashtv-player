.class public final Lw4/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lcom/exotv/net/MainActivity;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Landroid/os/Handler;

.field public volatile d:Ljava/lang/String;

.field public e:J


# direct methods
.method public constructor <init>(Lcom/exotv/net/MainActivity;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/b;->a:Lcom/exotv/net/MainActivity;

    .line 5
    .line 6
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lw4/b;->b:Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lw4/b;->c:Landroid/os/Handler;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lw4/b;->d:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v1, "update_apk"

    .line 33
    .line 34
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    array-length v0, p1

    .line 51
    const/4 v1, 0x0

    .line 52
    :goto_0
    if-ge v1, v0, :cond_1

    .line 53
    .line 54
    aget-object v2, p1, v1

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 57
    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/io/File;Lh7/q;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "Server returned HTTP "

    .line 4
    .line 5
    new-instance v2, Ljava/net/URL;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 17
    .line 18
    invoke-static {v3, v2}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 22
    .line 23
    const/16 v3, 0x7530

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 33
    .line 34
    .line 35
    const-string v3, "User-Agent"

    .line 36
    .line 37
    const-string v4, "exoTV-updater (Android)"

    .line 38
    .line 39
    invoke-virtual {v2, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/16 v4, 0xc8

    .line 47
    .line 48
    if-gt v4, v3, :cond_3

    .line 49
    .line 50
    const/16 v4, 0x12c

    .line 51
    .line 52
    if-ge v3, v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentLengthLong()J

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 63
    .line 64
    .line 65
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 66
    :try_start_1
    new-instance v12, Ljava/io/FileOutputStream;

    .line 67
    .line 68
    move-object/from16 v0, p2

    .line 69
    .line 70
    invoke-direct {v12, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 71
    .line 72
    .line 73
    const/16 v0, 0x2000

    .line 74
    .line 75
    :try_start_2
    new-array v0, v0, [B

    .line 76
    .line 77
    const-wide/16 v5, 0x0

    .line 78
    .line 79
    :goto_0
    invoke-virtual {v11, v0}, Ljava/io/InputStream;->read([B)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-ltz v7, :cond_2

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    invoke-virtual {v12, v0, v8, v7}, Ljava/io/FileOutputStream;->write([BII)V

    .line 87
    .line 88
    .line 89
    int-to-long v7, v7

    .line 90
    add-long/2addr v7, v5

    .line 91
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 92
    .line 93
    .line 94
    move-result-wide v5

    .line 95
    iget-wide v13, v1, Lw4/b;->e:J

    .line 96
    .line 97
    sub-long v13, v5, v13

    .line 98
    .line 99
    const-wide/16 v15, 0x64

    .line 100
    .line 101
    cmp-long v13, v13, v15

    .line 102
    .line 103
    if-gez v13, :cond_0

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_0
    iput-wide v5, v1, Lw4/b;->e:J

    .line 107
    .line 108
    iget-object v13, v1, Lw4/b;->c:Landroid/os/Handler;

    .line 109
    .line 110
    new-instance v5, Lw4/a;

    .line 111
    .line 112
    move-object/from16 v6, p3

    .line 113
    .line 114
    invoke-direct/range {v5 .. v10}, Lw4/a;-><init>(Lh7/q;JJ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v13, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    sub-long/2addr v5, v3

    .line 125
    const-wide/32 v13, 0xdbba0

    .line 126
    .line 127
    .line 128
    cmp-long v5, v5, v13

    .line 129
    .line 130
    if-gtz v5, :cond_1

    .line 131
    .line 132
    move-wide v5, v7

    .line 133
    goto :goto_0

    .line 134
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 135
    .line 136
    const-string v3, "Download timed out \u2014 connection too slow, please retry."

    .line 137
    .line 138
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    move-object v3, v0

    .line 144
    goto :goto_2

    .line 145
    :cond_2
    :try_start_3
    invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 146
    .line 147
    .line 148
    :try_start_4
    invoke-interface {v11}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    goto :goto_4

    .line 157
    :catchall_2
    move-exception v0

    .line 158
    move-object v3, v0

    .line 159
    goto :goto_3

    .line 160
    :goto_2
    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 161
    :catchall_3
    move-exception v0

    .line 162
    :try_start_6
    invoke-static {v12, v3}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 166
    :goto_3
    :try_start_7
    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 167
    :catchall_4
    move-exception v0

    .line 168
    :try_start_8
    invoke-static {v11, v3}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_3
    new-instance v4, Ljava/io/IOException;

    .line 173
    .line 174
    new-instance v5, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v0, " \u2014 the update link may be invalid."

    .line 183
    .line 184
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 195
    :goto_4
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 196
    .line 197
    .line 198
    throw v0
.end method

.method public final b(Ljava/io/File;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lw4/b;->a:Lcom/exotv/net/MainActivity;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, ".fileprovider"

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v1, v0, p1}, Landroidx/core/content/FileProvider;->d(Lcom/exotv/net/MainActivity;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    new-instance v4, Landroid/content/Intent;

    .line 29
    .line 30
    const-string v0, "android.intent.action.VIEW"

    .line 31
    .line 32
    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "application/vnd.android.package-archive"

    .line 36
    .line 37
    invoke-virtual {v4, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const v0, 0x10000001

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v3, 0x21

    .line 53
    .line 54
    if-lt v2, v3, :cond_0

    .line 55
    .line 56
    const-wide/32 v2, 0x10000

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Landroid/content/pm/PackageManager$ResolveInfoFlags;->of(J)Landroid/content/pm/PackageManager$ResolveInfoFlags;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0, v4, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/high16 v2, 0x10000

    .line 69
    .line 70
    invoke-virtual {v0, v4, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_0
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v3, 0x1

    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v5, v0

    .line 99
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 100
    .line 101
    :try_start_1
    iget-object v0, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 102
    .line 103
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v1, v0, p1, v3}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    iget-object v3, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 111
    .line 112
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 113
    .line 114
    new-instance v5, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v6, "URI grant failed for "

    .line 117
    .line 118
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    const-string v5, "ApkInstaller"

    .line 129
    .line 130
    invoke-static {v5, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    new-instance v5, Lz6/n;

    .line 135
    .line 136
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 137
    .line 138
    .line 139
    new-instance v6, Ljava/util/concurrent/CountDownLatch;

    .line 140
    .line 141
    invoke-direct {v6, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Landroidx/media3/exoplayer/audio/j;

    .line 145
    .line 146
    const/4 v7, 0x2

    .line 147
    move-object v3, p0

    .line 148
    invoke-direct/range {v2 .. v7}, Landroidx/media3/exoplayer/audio/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 149
    .line 150
    .line 151
    iget-object p1, v3, Lw4/b;->c:Landroid/os/Handler;

    .line 152
    .line 153
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 154
    .line 155
    .line 156
    :try_start_2
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 157
    .line 158
    const-wide/16 v0, 0xa

    .line 159
    .line 160
    invoke-virtual {v6, v0, v1, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 161
    .line 162
    .line 163
    move-result p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 164
    if-eqz p1, :cond_3

    .line 165
    .line 166
    iget-object p1, v5, Lz6/n;->j:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p1, Ljava/lang/Throwable;

    .line 169
    .line 170
    if-nez p1, :cond_2

    .line 171
    .line 172
    return-void

    .line 173
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const-string v1, "Could not open the system installer: "

    .line 180
    .line 181
    invoke-static {v1, p1}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v0

    .line 189
    :cond_3
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    .line 190
    .line 191
    const-string v0, "Timed out opening the system installer."

    .line 192
    .line 193
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 197
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 202
    .line 203
    .line 204
    new-instance p1, Ljava/io/IOException;

    .line 205
    .line 206
    const-string v0, "Interrupted while opening the system installer."

    .line 207
    .line 208
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_4
    move-object v3, p0

    .line 213
    new-instance p1, Ljava/io/IOException;

    .line 214
    .line 215
    const-string v0, "No system installer found on this device to open the update."

    .line 216
    .line 217
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :catchall_1
    move-exception v0

    .line 222
    move-object v3, p0

    .line 223
    move-object p1, v0

    .line 224
    new-instance v0, Ljava/io/IOException;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    const-string v1, "Could not share the update file with the installer: "

    .line 231
    .line 232
    invoke-static {v1, p1}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v0
.end method

.method public final c(Ljava/io/File;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x7a120

    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-ltz v2, :cond_7

    .line 11
    .line 12
    new-instance v0, Ljava/io/FileInputStream;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    :try_start_0
    new-array v2, v1, [B

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    if-ge v4, v1, :cond_0

    .line 23
    .line 24
    rsub-int/lit8 v5, v4, 0x4

    .line 25
    .line 26
    invoke-virtual {v0, v2, v4, v5}, Ljava/io/FileInputStream;->read([BII)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-ltz v5, :cond_0

    .line 31
    .line 32
    add-int/2addr v4, v5

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    aget-byte v4, v2, v3

    .line 38
    .line 39
    const/16 v5, 0x50

    .line 40
    .line 41
    if-ne v4, v5, :cond_6

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    aget-byte v4, v2, v4

    .line 45
    .line 46
    const/16 v5, 0x4b

    .line 47
    .line 48
    if-ne v4, v5, :cond_6

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    aget-byte v4, v2, v4

    .line 52
    .line 53
    const/4 v5, 0x3

    .line 54
    if-ne v4, v5, :cond_6

    .line 55
    .line 56
    aget-byte v2, v2, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    if-ne v2, v1, :cond_6

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lw4/b;->a:Lcom/exotv/net/MainActivity;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v1, p1, v3}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget-object v2, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v2, v4}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 v4, 0x1c

    .line 94
    .line 95
    if-lt v2, v4, :cond_1

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 103
    .line 104
    int-to-long v5, p1

    .line 105
    :goto_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v1, p1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-lt v2, v4, :cond_2

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 121
    .line 122
    int-to-long v0, p1

    .line 123
    :goto_2
    cmp-long p1, v5, v0

    .line 124
    .line 125
    if-ltz p1, :cond_3

    .line 126
    .line 127
    return-void

    .line 128
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 129
    .line 130
    const-string v0, "This update is older than the installed app \u2014 nothing to install."

    .line 131
    .line 132
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 137
    .line 138
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 139
    .line 140
    const-string v1, "Update file is for a different app ("

    .line 141
    .line 142
    const-string v2, ") \u2014 wrong APK on the server."

    .line 143
    .line 144
    invoke-static {v1, p1, v2}, La1/a1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 153
    .line 154
    const-string v0, "Downloaded file is not a valid APK (cannot be parsed)."

    .line 155
    .line 156
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1

    .line 160
    :cond_6
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    .line 161
    .line 162
    const-string v1, "Downloaded file is not an APK (bad header) \u2014 the link may have returned an error page."

    .line 163
    .line 164
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    :goto_3
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 169
    :catchall_1
    move-exception v1

    .line 170
    invoke-static {v0, p1}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 175
    .line 176
    new-instance v2, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v3, "Downloaded file too small ("

    .line 179
    .line 180
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, " bytes) \u2014 the update link did not return a full APK."

    .line 187
    .line 188
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p1
.end method
