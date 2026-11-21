.class public final La4/k0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements La4/h;
.implements La4/g;


# instance fields
.field public final j:La4/i;

.field public final k:La4/l;

.field public volatile l:I

.field public volatile m:La4/e;

.field public volatile n:Ljava/lang/Object;

.field public volatile o:Le4/q;

.field public volatile p:La4/f;


# direct methods
.method public constructor <init>(La4/i;La4/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4/k0;->j:La4/i;

    .line 5
    .line 6
    iput-object p2, p0, La4/k0;->k:La4/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 7

    .line 1
    iget-object v0, p0, La4/k0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La4/k0;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v1, p0, La4/k0;->n:Ljava/lang/Object;

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0, v0}, La4/k0;->d(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    const/4 v3, 0x3

    .line 20
    const-string v4, "SourceGenerator"

    .line 21
    .line 22
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const-string v3, "Failed to properly rewind or write data to cache"

    .line 29
    .line 30
    invoke-static {v4, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, La4/k0;->m:La4/e;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, La4/k0;->m:La4/e;

    .line 38
    .line 39
    invoke-virtual {v0}, La4/e;->a()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    :goto_0
    return v2

    .line 46
    :cond_1
    iput-object v1, p0, La4/k0;->m:La4/e;

    .line 47
    .line 48
    iput-object v1, p0, La4/k0;->o:Le4/q;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    :cond_2
    :goto_1
    if-nez v0, :cond_4

    .line 52
    .line 53
    iget v1, p0, La4/k0;->l:I

    .line 54
    .line 55
    iget-object v3, p0, La4/k0;->j:La4/i;

    .line 56
    .line 57
    invoke-virtual {v3}, La4/i;->b()Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v1, v3, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, La4/k0;->j:La4/i;

    .line 68
    .line 69
    invoke-virtual {v1}, La4/i;->b()Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget v3, p0, La4/k0;->l:I

    .line 74
    .line 75
    add-int/lit8 v4, v3, 0x1

    .line 76
    .line 77
    iput v4, p0, La4/k0;->l:I

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Le4/q;

    .line 84
    .line 85
    iput-object v1, p0, La4/k0;->o:Le4/q;

    .line 86
    .line 87
    iget-object v1, p0, La4/k0;->o:Le4/q;

    .line 88
    .line 89
    if-eqz v1, :cond_2

    .line 90
    .line 91
    iget-object v1, p0, La4/k0;->j:La4/i;

    .line 92
    .line 93
    iget-object v1, v1, La4/i;->p:La4/n;

    .line 94
    .line 95
    iget-object v3, p0, La4/k0;->o:Le4/q;

    .line 96
    .line 97
    iget-object v3, v3, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 98
    .line 99
    invoke-interface {v3}, Lcom/bumptech/glide/load/data/e;->c()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v1, v3}, La4/n;->a(I)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    iget-object v1, p0, La4/k0;->j:La4/i;

    .line 110
    .line 111
    iget-object v3, p0, La4/k0;->o:Le4/q;

    .line 112
    .line 113
    iget-object v3, v3, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 114
    .line 115
    invoke-interface {v3}, Lcom/bumptech/glide/load/data/e;->a()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1, v3}, La4/i;->c(Ljava/lang/Class;)La4/d0;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    :cond_3
    iget-object v0, p0, La4/k0;->o:Le4/q;

    .line 126
    .line 127
    iget-object v1, p0, La4/k0;->o:Le4/q;

    .line 128
    .line 129
    iget-object v1, v1, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 130
    .line 131
    iget-object v3, p0, La4/k0;->j:La4/i;

    .line 132
    .line 133
    iget-object v3, v3, La4/i;->o:Lcom/bumptech/glide/f;

    .line 134
    .line 135
    new-instance v4, La1/e;

    .line 136
    .line 137
    const/4 v5, 0x3

    .line 138
    const/4 v6, 0x0

    .line 139
    invoke-direct {v4, p0, v0, v5, v6}, La1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1, v3, v4}, Lcom/bumptech/glide/load/data/e;->e(Lcom/bumptech/glide/f;Lcom/bumptech/glide/load/data/d;)V

    .line 143
    .line 144
    .line 145
    move v0, v2

    .line 146
    goto :goto_1

    .line 147
    :cond_4
    return v0
.end method

.method public final b(Ly3/e;Ljava/lang/Object;Lcom/bumptech/glide/load/data/e;ILy3/e;)V
    .locals 6

    .line 1
    iget-object v0, p0, La4/k0;->k:La4/l;

    .line 2
    .line 3
    iget-object p4, p0, La4/k0;->o:Le4/q;

    .line 4
    .line 5
    iget-object p4, p4, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 6
    .line 7
    invoke-interface {p4}, Lcom/bumptech/glide/load/data/e;->c()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    move-object v5, p1

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move-object v3, p3

    .line 15
    invoke-virtual/range {v0 .. v5}, La4/l;->b(Ly3/e;Ljava/lang/Object;Lcom/bumptech/glide/load/data/e;ILy3/e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final c(Ly3/e;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/e;I)V
    .locals 1

    .line 1
    iget-object p4, p0, La4/k0;->k:La4/l;

    .line 2
    .line 3
    iget-object v0, p0, La4/k0;->o:Le4/q;

    .line 4
    .line 5
    iget-object v0, v0, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/e;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p4, p1, p2, p3, v0}, La4/l;->c(Ly3/e;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/e;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, La4/k0;->o:Le4/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/e;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "SourceGenerator"

    .line 6
    .line 7
    const-string v3, "Attempt to write: "

    .line 8
    .line 9
    const-string v4, "Finished encoding source to cache, key: "

    .line 10
    .line 11
    sget v5, Lu4/g;->b:I

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    const/4 v7, 0x0

    .line 18
    :try_start_0
    iget-object v8, v1, La4/k0;->j:La4/i;

    .line 19
    .line 20
    iget-object v8, v8, La4/i;->c:Lcom/bumptech/glide/e;

    .line 21
    .line 22
    invoke-virtual {v8}, Lcom/bumptech/glide/e;->a()Lcom/bumptech/glide/h;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    invoke-virtual {v8, v0}, Lcom/bumptech/glide/h;->g(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/g;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-interface {v8}, Lcom/bumptech/glide/load/data/g;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    iget-object v10, v1, La4/k0;->j:La4/i;

    .line 35
    .line 36
    invoke-virtual {v10, v9}, La4/i;->d(Ljava/lang/Object;)Ly3/b;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    new-instance v11, La4/c;

    .line 41
    .line 42
    iget-object v12, v1, La4/k0;->j:La4/i;

    .line 43
    .line 44
    iget-object v12, v12, La4/i;->i:Ly3/h;

    .line 45
    .line 46
    const/4 v13, 0x1

    .line 47
    invoke-direct {v11, v10, v9, v12, v13}, La4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    new-instance v9, La4/f;

    .line 51
    .line 52
    iget-object v12, v1, La4/k0;->o:Le4/q;

    .line 53
    .line 54
    iget-object v12, v12, Le4/q;->a:Ly3/e;

    .line 55
    .line 56
    iget-object v14, v1, La4/k0;->j:La4/i;

    .line 57
    .line 58
    iget-object v15, v14, La4/i;->n:Ly3/e;

    .line 59
    .line 60
    invoke-direct {v9, v12, v15}, La4/f;-><init>(Ly3/e;Ly3/e;)V

    .line 61
    .line 62
    .line 63
    iget-object v12, v14, La4/i;->h:La4/p;

    .line 64
    .line 65
    invoke-virtual {v12}, La4/p;->a()Lc4/a;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    invoke-interface {v12, v9, v11}, Lc4/a;->h(Ly3/e;La4/c;)V

    .line 70
    .line 71
    .line 72
    const/4 v11, 0x2

    .line 73
    invoke-static {v2, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 74
    .line 75
    .line 76
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    const-string v14, ", data: "

    .line 78
    .line 79
    if-eqz v11, :cond_0

    .line 80
    .line 81
    :try_start_1
    new-instance v11, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v11, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v4, ", encoder: "

    .line 96
    .line 97
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v4, ", duration: "

    .line 104
    .line 105
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-static {v5, v6}, Lu4/g;->a(J)D

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_1

    .line 125
    :cond_0
    :goto_0
    invoke-interface {v12, v9}, Lc4/a;->b(Ly3/e;)Ljava/io/File;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-eqz v4, :cond_1

    .line 130
    .line 131
    iput-object v9, v1, La4/k0;->p:La4/f;

    .line 132
    .line 133
    new-instance v0, La4/e;

    .line 134
    .line 135
    iget-object v2, v1, La4/k0;->o:Le4/q;

    .line 136
    .line 137
    iget-object v2, v2, Le4/q;->a:Ly3/e;

    .line 138
    .line 139
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget-object v3, v1, La4/k0;->j:La4/i;

    .line 144
    .line 145
    invoke-direct {v0, v2, v3, v1}, La4/e;-><init>(Ljava/util/List;La4/i;La4/g;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, v1, La4/k0;->m:La4/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    iget-object v0, v1, La4/k0;->o:Le4/q;

    .line 151
    .line 152
    iget-object v0, v0, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 153
    .line 154
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/e;->b()V

    .line 155
    .line 156
    .line 157
    return v13

    .line 158
    :cond_1
    const/4 v4, 0x3

    .line 159
    :try_start_2
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_2

    .line 164
    .line 165
    new-instance v4, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget-object v3, v1, La4/k0;->p:La4/f;

    .line 171
    .line 172
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v0, " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."

    .line 182
    .line 183
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 191
    .line 192
    .line 193
    :cond_2
    :try_start_3
    iget-object v14, v1, La4/k0;->k:La4/l;

    .line 194
    .line 195
    iget-object v0, v1, La4/k0;->o:Le4/q;

    .line 196
    .line 197
    iget-object v15, v0, Le4/q;->a:Ly3/e;

    .line 198
    .line 199
    invoke-interface {v8}, Lcom/bumptech/glide/load/data/g;->d()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    iget-object v0, v1, La4/k0;->o:Le4/q;

    .line 204
    .line 205
    iget-object v0, v0, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 206
    .line 207
    iget-object v2, v1, La4/k0;->o:Le4/q;

    .line 208
    .line 209
    iget-object v2, v2, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 210
    .line 211
    invoke-interface {v2}, Lcom/bumptech/glide/load/data/e;->c()I

    .line 212
    .line 213
    .line 214
    move-result v18

    .line 215
    iget-object v2, v1, La4/k0;->o:Le4/q;

    .line 216
    .line 217
    iget-object v2, v2, Le4/q;->a:Ly3/e;

    .line 218
    .line 219
    move-object/from16 v17, v0

    .line 220
    .line 221
    move-object/from16 v19, v2

    .line 222
    .line 223
    invoke-virtual/range {v14 .. v19}, La4/l;->b(Ly3/e;Ljava/lang/Object;Lcom/bumptech/glide/load/data/e;ILy3/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 224
    .line 225
    .line 226
    return v7

    .line 227
    :catchall_1
    move-exception v0

    .line 228
    move v7, v13

    .line 229
    :goto_1
    if-nez v7, :cond_3

    .line 230
    .line 231
    iget-object v2, v1, La4/k0;->o:Le4/q;

    .line 232
    .line 233
    iget-object v2, v2, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 234
    .line 235
    invoke-interface {v2}, Lcom/bumptech/glide/load/data/e;->b()V

    .line 236
    .line 237
    .line 238
    :cond_3
    throw v0
.end method
