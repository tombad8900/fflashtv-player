.class public final Lb5/l;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final b:Lp7/b;

.field public static final c:Ljava/lang/Object;

.field public static final d:Lh7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb5/l;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    new-instance v0, Lp7/b;

    .line 10
    .line 11
    invoke-direct {v0}, Lp7/b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lb5/l;->b:Lp7/b;

    .line 15
    .line 16
    new-instance v1, Ll6/d;

    .line 17
    .line 18
    const-string v0, "Accept"

    .line 19
    .line 20
    const-string v2, "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Ll6/d;

    .line 26
    .line 27
    const-string v0, "Accept-Language"

    .line 28
    .line 29
    const-string v3, "en-US,en;q=0.9,ar;q=0.8,fr;q=0.7"

    .line 30
    .line 31
    invoke-direct {v2, v0, v3}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Ll6/d;

    .line 35
    .line 36
    const-string v0, "Connection"

    .line 37
    .line 38
    const-string v4, "keep-alive"

    .line 39
    .line 40
    invoke-direct {v3, v0, v4}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Ll6/d;

    .line 44
    .line 45
    const-string v0, "sec-ch-ua"

    .line 46
    .line 47
    const-string v5, "\"Google Chrome\";v=\"153\", \"Not_A Brand\";v=\"8\", \"Chromium\";v=\"153\""

    .line 48
    .line 49
    invoke-direct {v4, v0, v5}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v5, Ll6/d;

    .line 53
    .line 54
    const-string v0, "sec-ch-ua-mobile"

    .line 55
    .line 56
    const-string v6, "?0"

    .line 57
    .line 58
    invoke-direct {v5, v0, v6}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Ll6/d;

    .line 62
    .line 63
    const-string v0, "sec-ch-ua-platform"

    .line 64
    .line 65
    const-string v7, "\"Windows\""

    .line 66
    .line 67
    invoke-direct {v6, v0, v7}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Ll6/d;

    .line 71
    .line 72
    const-string v0, "Sec-Fetch-Dest"

    .line 73
    .line 74
    const-string v8, "document"

    .line 75
    .line 76
    invoke-direct {v7, v0, v8}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v8, Ll6/d;

    .line 80
    .line 81
    const-string v0, "Sec-Fetch-Mode"

    .line 82
    .line 83
    const-string v9, "navigate"

    .line 84
    .line 85
    invoke-direct {v8, v0, v9}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance v9, Ll6/d;

    .line 89
    .line 90
    const-string v0, "Sec-Fetch-Site"

    .line 91
    .line 92
    const-string v10, "none"

    .line 93
    .line 94
    invoke-direct {v9, v0, v10}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance v10, Ll6/d;

    .line 98
    .line 99
    const-string v0, "Sec-Fetch-User"

    .line 100
    .line 101
    const-string v11, "?1"

    .line 102
    .line 103
    invoke-direct {v10, v0, v11}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance v11, Ll6/d;

    .line 107
    .line 108
    const-string v0, "Upgrade-Insecure-Requests"

    .line 109
    .line 110
    const-string v12, "1"

    .line 111
    .line 112
    invoke-direct {v11, v0, v12}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    new-instance v12, Ll6/d;

    .line 116
    .line 117
    const-string v0, "User-Agent"

    .line 118
    .line 119
    const-string v13, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36"

    .line 120
    .line 121
    invoke-direct {v12, v0, v13}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    filled-new-array/range {v1 .. v12}, [Ll6/d;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v0}, Lm6/s;->U([Ll6/d;)Ljava/util/Map;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sput-object v0, Lb5/l;->c:Ljava/lang/Object;

    .line 133
    .line 134
    new-instance v0, Lh7/f;

    .line 135
    .line 136
    const-string v1, "^https?://\\S+$"

    .line 137
    .line 138
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sput-object v0, Lb5/l;->d:Lh7/f;

    .line 142
    .line 143
    return-void
.end method

.method public static final a()Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lokhttp3/g0$a;

    .line 3
    .line 4
    invoke-direct {v1}, Lokhttp3/g0$a;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v2, "https://raw.githubusercontent.com/nativedevonly/Spark_Game/master/credentials.js"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lb5/l;->c:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v4, v3}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v1}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v2, Lb5/m;->a:Lokhttp3/e0;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 65
    .line 66
    .line 67
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :try_start_1
    invoke-virtual {v1}, Lokhttp3/i0;->isSuccessful()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    invoke-virtual {v1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    invoke-virtual {v2}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    goto :goto_1

    .line 85
    :catchall_1
    move-exception v2

    .line 86
    goto :goto_3

    .line 87
    :cond_1
    move-object v2, v0

    .line 88
    :goto_1
    if-nez v2, :cond_2

    .line 89
    .line 90
    const-string v2, ""

    .line 91
    .line 92
    :cond_2
    invoke-static {v2}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const-string v3, "encoded"

    .line 101
    .line 102
    invoke-static {v3, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {v2}, Lt2/i0;->I([B)[B

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    array-length v3, v2

    .line 114
    new-array v3, v3, [C

    .line 115
    .line 116
    array-length v4, v2

    .line 117
    const/4 v5, 0x0

    .line 118
    :goto_2
    if-ge v5, v4, :cond_3

    .line 119
    .line 120
    aget-byte v6, v2, v5

    .line 121
    .line 122
    and-int/lit16 v6, v6, 0xff

    .line 123
    .line 124
    int-to-char v6, v6

    .line 125
    aput-char v6, v3, v5

    .line 126
    .line 127
    add-int/lit8 v5, v5, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    new-instance v2, Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V

    .line 133
    .line 134
    .line 135
    invoke-static {v2}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    sget-object v3, Lb5/l;->d:Lh7/f;

    .line 144
    .line 145
    invoke-virtual {v3, v2}, Lh7/f;->c(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 149
    if-eqz v3, :cond_4

    .line 150
    .line 151
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    .line 153
    .line 154
    return-object v2

    .line 155
    :cond_4
    :try_start_3
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 156
    .line 157
    const-string v3, "decrypted base url looks invalid"

    .line 158
    .line 159
    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v2

    .line 163
    :cond_5
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    invoke-virtual {v1}, Lokhttp3/i0;->code()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    new-instance v4, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v5, "credentials request failed with status "

    .line 175
    .line 176
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    :goto_3
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 195
    :catchall_2
    move-exception v3

    .line 196
    :try_start_5
    invoke-static {v1, v2}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 200
    :goto_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    new-instance v2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v3, "credentials fetch failed, using pinned API base: "

    .line 207
    .line 208
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    const-string v2, "Credentials"

    .line 219
    .line 220
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    return-object v0
.end method
