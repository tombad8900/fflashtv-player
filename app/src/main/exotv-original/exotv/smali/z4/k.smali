.class public final Lz4/k;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lz4/k;

.field public static final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final d:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lz4/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz4/k;->a:Lz4/k;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lz4/k;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lz4/k;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    const-string v0, "id"

    .line 30
    .line 31
    const-string v1, "key"

    .line 32
    .line 33
    const-string v2, "use-multi-hosts"

    .line 34
    .line 35
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lz4/k;->d:Ljava/util/Set;

    .line 44
    .line 45
    return-void
.end method

.method public static final a(Lb5/i;Landroid/content/Context;Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 7

    .line 1
    sget-object v0, Lz4/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const-string v0, "context"

    .line 4
    .line 5
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lz4/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "android_id"

    .line 25
    .line 26
    invoke-static {p1, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-object p1, v2

    .line 32
    :goto_0
    if-eqz p1, :cond_1

    .line 33
    .line 34
    sget-object v1, Lz4/c;->b:Lh7/f;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lh7/f;->c(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    :goto_1
    move-object v1, p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p1, "43a5eaa56716eb6f"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    const/16 p1, 0x3e8

    .line 55
    .line 56
    int-to-long v5, p1

    .line 57
    div-long/2addr v3, v5

    .line 58
    const/16 p1, 0x12c

    .line 59
    .line 60
    int-to-long v5, p1

    .line 61
    div-long/2addr v3, v5

    .line 62
    const-string p1, "GENRAL TV|com.genraltvpro.app|2.19|29CA406BCB43A33B2FECBD228BDDC7A1E11E772D|"

    .line 63
    .line 64
    invoke-static {p1, v3, v4}, La1/a1;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lb5/i;->p:Ljava/lang/Object;

    .line 74
    .line 75
    const-string v3, "User-Agent"

    .line 76
    .line 77
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Ljava/lang/String;

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    invoke-static {p0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_2

    .line 90
    .line 91
    move-object v2, p0

    .line 92
    :cond_2
    if-nez v2, :cond_4

    .line 93
    .line 94
    :cond_3
    const-string v2, "okhttp/5.4.0"

    .line 95
    .line 96
    :cond_4
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    const-string p0, "data"

    .line 100
    .line 101
    invoke-static {p0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    const-string p0, "HmacSHA256"

    .line 105
    .line 106
    invoke-static {p0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    .line 111
    .line 112
    sget-object v4, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 113
    .line 114
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    const-string v6, "getBytes(...)"

    .line 119
    .line 120
    invoke-static {v6, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v3, v5, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {v6, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const-string p1, "doFinal(...)"

    .line 141
    .line 142
    invoke-static {p1, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    array-length v2, p0

    .line 148
    mul-int/lit8 v2, v2, 0x2

    .line 149
    .line 150
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 151
    .line 152
    .line 153
    array-length v2, p0

    .line 154
    const/4 v3, 0x0

    .line 155
    :goto_4
    if-ge v3, v2, :cond_5

    .line 156
    .line 157
    aget-byte v4, p0, v3

    .line 158
    .line 159
    and-int/lit16 v5, v4, 0xff

    .line 160
    .line 161
    ushr-int/lit8 v5, v5, 0x4

    .line 162
    .line 163
    const-string v6, "0123456789abcdef"

    .line 164
    .line 165
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    and-int/lit8 v4, v4, 0xf

    .line 173
    .line 174
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    add-int/lit8 v3, v3, 0x1

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_5
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    const-string p1, "toString(...)"

    .line 189
    .line 190
    invoke-static {p1, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const-string p1, "x-v3-token"

    .line 194
    .line 195
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    const-string p0, "x-app-id"

    .line 199
    .line 200
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    if-eqz p2, :cond_7

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-nez p0, :cond_6

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_6
    const-string p0, "x-cat-info"

    .line 213
    .line 214
    invoke-interface {v0, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    :cond_7
    :goto_5
    return-object v0
.end method

.method public static b(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "servers"

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    instance-of v3, v2, Lorg/json/JSONArray;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Lorg/json/JSONArray;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    instance-of v3, v2, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    .line 25
    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    move-object v2, v3

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    new-instance v2, Lorg/json/JSONArray;

    .line 34
    .line 35
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v2, Lorg/json/JSONArray;

    .line 40
    .line 41
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    sget-object v0, Lm6/p;->j:Lm6/p;

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, 0x0

    .line 63
    move v6, v5

    .line 64
    :goto_1
    if-ge v6, v4, :cond_19

    .line 65
    .line 66
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    if-nez v7, :cond_3

    .line 71
    .line 72
    move-object/from16 v18, v2

    .line 73
    .line 74
    move-object v2, v3

    .line 75
    move/from16 v21, v4

    .line 76
    .line 77
    move/from16 v17, v5

    .line 78
    .line 79
    move/from16 v16, v6

    .line 80
    .line 81
    goto/16 :goto_e

    .line 82
    .line 83
    :cond_3
    const-string v8, "url"

    .line 84
    .line 85
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    const-string v9, "headers"

    .line 90
    .line 91
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-static {v9}, Lz4/k;->j(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const-string v10, "stream="

    .line 103
    .line 104
    invoke-static {v8, v10, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    const-string v12, "your_secret_key"

    .line 109
    .line 110
    const-string v13, "substring(...)"

    .line 111
    .line 112
    const-string v15, "stream_key"

    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    if-eqz v10, :cond_11

    .line 117
    .line 118
    const/4 v10, 0x7

    .line 119
    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-static {v13, v8}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const-string v10, "use-multi-hosts"

    .line 127
    .line 128
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    const-string v13, "true"

    .line 133
    .line 134
    invoke-static {v10, v13}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    const-string v13, "?token="

    .line 139
    .line 140
    if-eqz v10, :cond_b

    .line 141
    .line 142
    const-string v10, "stream_hosts"

    .line 143
    .line 144
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    if-eqz v10, :cond_4

    .line 149
    .line 150
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 151
    .line 152
    .line 153
    move-result v17

    .line 154
    move/from16 v14, v17

    .line 155
    .line 156
    :goto_2
    const/16 p0, 0x2f

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    move v14, v5

    .line 160
    goto :goto_2

    .line 161
    :goto_3
    invoke-static {v5, v14}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    move/from16 v17, v5

    .line 166
    .line 167
    new-instance v5, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v14}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    :goto_4
    move-object v11, v14

    .line 177
    check-cast v11, Le7/b;

    .line 178
    .line 179
    move-object/from16 v18, v2

    .line 180
    .line 181
    iget-boolean v2, v11, Le7/b;->l:Z

    .line 182
    .line 183
    if-eqz v2, :cond_7

    .line 184
    .line 185
    invoke-virtual {v11}, Le7/b;->nextInt()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-static {v10}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v10, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    if-nez v11, :cond_5

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_5
    move-object/from16 v2, v16

    .line 204
    .line 205
    :goto_5
    if-eqz v2, :cond_6

    .line 206
    .line 207
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    :cond_6
    move-object/from16 v2, v18

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_7
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-nez v10, :cond_8

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_8
    move-object/from16 v2, v16

    .line 228
    .line 229
    :goto_6
    if-nez v2, :cond_9

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_9
    move-object v12, v2

    .line 233
    :goto_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-nez v2, :cond_c

    .line 238
    .line 239
    sget-object v2, Lc7/e;->j:Lc7/d;

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-nez v10, :cond_a

    .line 246
    .line 247
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual {v2, v10}, Lc7/d;->a(I)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {v1, v12}, Lz4/k;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    new-instance v10, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v2, "&ip="

    .line 283
    .line 284
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const-string v5, "multi-host"

    .line 295
    .line 296
    invoke-static {v9, v7, v2, v5}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-static {v2}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    :goto_8
    move-object/from16 v20, v3

    .line 305
    .line 306
    move/from16 v21, v4

    .line 307
    .line 308
    move/from16 v16, v6

    .line 309
    .line 310
    goto/16 :goto_c

    .line 311
    .line 312
    :cond_a
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 313
    .line 314
    const-string v1, "Collection is empty."

    .line 315
    .line 316
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :cond_b
    move-object/from16 v18, v2

    .line 321
    .line 322
    move/from16 v17, v5

    .line 323
    .line 324
    const/16 p0, 0x2f

    .line 325
    .line 326
    :cond_c
    const-string v2, "remote_url_2"

    .line 327
    .line 328
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    const-string v10, "remote_key_2"

    .line 333
    .line 334
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    invoke-static {v10}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v10}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    if-nez v11, :cond_d

    .line 346
    .line 347
    move-object/from16 v16, v10

    .line 348
    .line 349
    :cond_d
    if-nez v16, :cond_e

    .line 350
    .line 351
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v16

    .line 355
    :cond_e
    move-object/from16 v10, v16

    .line 356
    .line 357
    invoke-static {v5}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v5}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    if-nez v11, :cond_10

    .line 365
    .line 366
    if-eqz v10, :cond_10

    .line 367
    .line 368
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 369
    .line 370
    .line 371
    move-result v11

    .line 372
    if-nez v11, :cond_f

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_f
    const/4 v11, 0x1

    .line 376
    new-array v11, v11, [C

    .line 377
    .line 378
    aput-char p0, v11, v17

    .line 379
    .line 380
    invoke-static {v5, v11}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    invoke-static {v1, v10}, Lz4/k;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v10

    .line 388
    new-instance v11, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    invoke-static {v9, v7, v5, v2}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-static {v2}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    goto :goto_8

    .line 418
    :cond_10
    :goto_9
    const-string v2, "stream(no-base)"

    .line 419
    .line 420
    invoke-static {v9, v7, v8, v2}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-static {v2}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    goto :goto_8

    .line 429
    :cond_11
    move-object/from16 v18, v2

    .line 430
    .line 431
    move/from16 v17, v5

    .line 432
    .line 433
    const/16 p0, 0x2f

    .line 434
    .line 435
    const-string v2, "id="

    .line 436
    .line 437
    invoke-static {v8, v2, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    const-string v10, "&remote="

    .line 442
    .line 443
    const-string v11, "-"

    .line 444
    .line 445
    const-string v14, "/index.m3u8?token="

    .line 446
    .line 447
    const-string v5, "/"

    .line 448
    .line 449
    move/from16 v19, v2

    .line 450
    .line 451
    if-eqz v19, :cond_15

    .line 452
    .line 453
    const/4 v2, 0x3

    .line 454
    invoke-virtual {v8, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-static {v13, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    const-string v8, "remote_url"

    .line 462
    .line 463
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v8

    .line 467
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v13

    .line 471
    invoke-static {v13}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    invoke-static {v13}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v15

    .line 478
    if-nez v15, :cond_12

    .line 479
    .line 480
    move-object/from16 v16, v13

    .line 481
    .line 482
    :cond_12
    if-nez v16, :cond_13

    .line 483
    .line 484
    goto :goto_a

    .line 485
    :cond_13
    move-object/from16 v12, v16

    .line 486
    .line 487
    :goto_a
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-static {v8}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 491
    .line 492
    .line 493
    move-result v13

    .line 494
    if-nez v13, :cond_14

    .line 495
    .line 496
    const/4 v13, 0x1

    .line 497
    new-array v13, v13, [C

    .line 498
    .line 499
    const/16 v17, 0x0

    .line 500
    .line 501
    aput-char p0, v13, v17

    .line 502
    .line 503
    invoke-static {v8, v13}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 508
    .line 509
    .line 510
    move-result-wide v15

    .line 511
    move-object/from16 v20, v3

    .line 512
    .line 513
    move/from16 v21, v4

    .line 514
    .line 515
    const/16 v13, 0x3e8

    .line 516
    .line 517
    int-to-long v3, v13

    .line 518
    div-long/2addr v15, v3

    .line 519
    const/16 v3, 0x426

    .line 520
    .line 521
    int-to-long v3, v3

    .line 522
    sub-long v3, v15, v3

    .line 523
    .line 524
    move v15, v6

    .line 525
    move-object/from16 v16, v7

    .line 526
    .line 527
    const/16 v13, 0x2a30

    .line 528
    .line 529
    int-to-long v6, v13

    .line 530
    add-long/2addr v6, v3

    .line 531
    const/16 v13, 0x8

    .line 532
    .line 533
    new-array v13, v13, [B

    .line 534
    .line 535
    new-instance v0, Ljava/security/SecureRandom;

    .line 536
    .line 537
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v13}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 541
    .line 542
    .line 543
    invoke-static {v13}, Lt2/w;->k([B)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    new-instance v13, Ljava/lang/StringBuilder;

    .line 548
    .line 549
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v13, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v12

    .line 574
    invoke-static {v12}, Lt2/w;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v12

    .line 578
    new-instance v13, Ljava/lang/StringBuilder;

    .line 579
    .line 580
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v13, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    const-string v2, "id-signed"

    .line 627
    .line 628
    move-object/from16 v3, v16

    .line 629
    .line 630
    invoke-static {v9, v3, v0, v2}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    :goto_b
    move/from16 v16, v15

    .line 639
    .line 640
    const/16 v17, 0x0

    .line 641
    .line 642
    goto/16 :goto_c

    .line 643
    .line 644
    :cond_14
    move-object/from16 v20, v3

    .line 645
    .line 646
    move/from16 v21, v4

    .line 647
    .line 648
    move v15, v6

    .line 649
    move-object v3, v7

    .line 650
    const-string v0, "id(no-base)"

    .line 651
    .line 652
    invoke-static {v9, v3, v2, v0}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    goto :goto_b

    .line 661
    :cond_15
    move-object/from16 v20, v3

    .line 662
    .line 663
    move/from16 v21, v4

    .line 664
    .line 665
    move v15, v6

    .line 666
    move-object v3, v7

    .line 667
    const-string v0, "http"

    .line 668
    .line 669
    const/4 v2, 0x0

    .line 670
    invoke-static {v8, v0, v2}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    const-string v2, "direct"

    .line 675
    .line 676
    if-eqz v0, :cond_17

    .line 677
    .line 678
    const-string v0, "id"

    .line 679
    .line 680
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    const-string v4, "key"

    .line 685
    .line 686
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v4

    .line 690
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 694
    .line 695
    .line 696
    move-result v6

    .line 697
    if-nez v6, :cond_16

    .line 698
    .line 699
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 703
    .line 704
    .line 705
    move-result v6

    .line 706
    if-nez v6, :cond_16

    .line 707
    .line 708
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 709
    .line 710
    .line 711
    move-result-wide v6

    .line 712
    const/16 v13, 0x3e8

    .line 713
    .line 714
    int-to-long v12, v13

    .line 715
    div-long/2addr v6, v12

    .line 716
    const/16 v2, 0x426

    .line 717
    .line 718
    int-to-long v12, v2

    .line 719
    sub-long/2addr v6, v12

    .line 720
    const/16 v13, 0x2a30

    .line 721
    .line 722
    int-to-long v12, v13

    .line 723
    add-long/2addr v12, v6

    .line 724
    const/16 v2, 0x8

    .line 725
    .line 726
    new-array v2, v2, [B

    .line 727
    .line 728
    move/from16 v16, v15

    .line 729
    .line 730
    new-instance v15, Ljava/security/SecureRandom;

    .line 731
    .line 732
    invoke-direct {v15}, Ljava/security/SecureRandom;-><init>()V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v15, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 736
    .line 737
    .line 738
    invoke-static {v2}, Lt2/w;->k([B)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    new-instance v15, Ljava/lang/StringBuilder;

    .line 743
    .line 744
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v15, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    invoke-static {v4}, Lt2/w;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    const/4 v15, 0x1

    .line 774
    new-array v15, v15, [C

    .line 775
    .line 776
    const/16 v17, 0x0

    .line 777
    .line 778
    aput-char p0, v15, v17

    .line 779
    .line 780
    invoke-static {v8, v15}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v8

    .line 784
    new-instance v15, Ljava/lang/StringBuilder;

    .line 785
    .line 786
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v15, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    const-string v2, "cdn-signed"

    .line 833
    .line 834
    invoke-static {v9, v3, v0, v2}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    goto :goto_c

    .line 843
    :cond_16
    move/from16 v16, v15

    .line 844
    .line 845
    const/16 v17, 0x0

    .line 846
    .line 847
    invoke-static {v9, v3, v8, v2}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    goto :goto_c

    .line 856
    :cond_17
    move/from16 v16, v15

    .line 857
    .line 858
    const/16 v17, 0x0

    .line 859
    .line 860
    invoke-static {v9, v3, v8, v2}, Lz4/k;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    :goto_c
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 873
    .line 874
    .line 875
    move-result v2

    .line 876
    if-eqz v2, :cond_18

    .line 877
    .line 878
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    check-cast v2, Lz4/e;

    .line 883
    .line 884
    new-instance v3, Lz4/d;

    .line 885
    .line 886
    iget-object v4, v2, Lz4/e;->a:Ljava/lang/String;

    .line 887
    .line 888
    iget-object v5, v2, Lz4/e;->b:Ljava/lang/String;

    .line 889
    .line 890
    iget-object v6, v2, Lz4/e;->c:Lorg/json/JSONObject;

    .line 891
    .line 892
    iget-object v7, v2, Lz4/e;->d:Ljava/lang/String;

    .line 893
    .line 894
    iget-object v8, v2, Lz4/e;->e:Ljava/lang/String;

    .line 895
    .line 896
    iget-object v9, v2, Lz4/e;->f:Ljava/lang/String;

    .line 897
    .line 898
    invoke-direct/range {v3 .. v9}, Lz4/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    move-object/from16 v2, v20

    .line 902
    .line 903
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    goto :goto_d

    .line 907
    :cond_18
    move-object/from16 v2, v20

    .line 908
    .line 909
    :goto_e
    add-int/lit8 v6, v16, 0x1

    .line 910
    .line 911
    move-object/from16 v0, p1

    .line 912
    .line 913
    move-object v3, v2

    .line 914
    move/from16 v5, v17

    .line 915
    .line 916
    move-object/from16 v2, v18

    .line 917
    .line 918
    move/from16 v4, v21

    .line 919
    .line 920
    goto/16 :goto_1

    .line 921
    .line 922
    :cond_19
    move-object v2, v3

    .line 923
    return-object v2
.end method

.method public static c(Lz4/d;Lb5/i;)Ljava/util/LinkedHashMap;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lz4/d;->c:Lorg/json/JSONObject;

    .line 7
    .line 8
    iget-object v2, p0, Lz4/d;->f:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v3, p0, Lz4/d;->e:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p0, p0, Lz4/d;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v5, "keys(...)"

    .line 19
    .line 20
    invoke-static {v5, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_2

    .line 28
    .line 29
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v6}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 39
    .line 40
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const-string v8, "toLowerCase(...)"

    .line 45
    .line 46
    invoke-static {v8, v7}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v8, Lz4/k;->d:Ljava/util/Set;

    .line 50
    .line 51
    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-nez v7, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-nez v8, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-lez v1, :cond_3

    .line 80
    .line 81
    const-string v1, "Referer"

    .line 82
    .line 83
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    const-string v1, "User-Agent"

    .line 91
    .line 92
    if-lez p0, :cond_4

    .line 93
    .line 94
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-lez p0, :cond_6

    .line 102
    .line 103
    :try_start_0
    invoke-static {v2}, Lz4/k;->j(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v5, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_6

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-lez v5, :cond_5

    .line 138
    .line 139
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catchall_0
    :cond_6
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    check-cast p0, Ljava/lang/CharSequence;

    .line 148
    .line 149
    if-eqz p0, :cond_7

    .line 150
    .line 151
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-nez p0, :cond_b

    .line 156
    .line 157
    :cond_7
    iget-object p0, p1, Lb5/i;->q:Ljava/lang/Object;

    .line 158
    .line 159
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    check-cast p0, Ljava/lang/String;

    .line 164
    .line 165
    if-eqz p0, :cond_9

    .line 166
    .line 167
    invoke-static {p0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-nez p1, :cond_8

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_8
    const/4 p0, 0x0

    .line 175
    :goto_2
    if-nez p0, :cond_a

    .line 176
    .line 177
    :cond_9
    const-string p0, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36"

    .line 178
    .line 179
    :cond_a
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_b
    return-object v0
.end method

.method public static final d(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lz4/e;
    .locals 7

    .line 1
    new-instance v0, Lz4/e;

    .line 2
    .line 3
    const-string v1, "Referer"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    const-string v1, "optString(...)"

    .line 10
    .line 11
    invoke-static {v1, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "userAgent"

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v1, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const-string v2, "otherHeaders"

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v1, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object v3, p0

    .line 33
    move-object v1, p2

    .line 34
    move-object v2, p3

    .line 35
    invoke-direct/range {v0 .. v6}, Lz4/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    :try_start_0
    const-string v0, "yNPSFW@;Au,!ir%2"

    .line 2
    .line 3
    sget-object v1, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "getBytes(...)"

    .line 10
    .line 11
    invoke-static {v2, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "SHA-256"

    .line 15
    .line 16
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "digest(...)"

    .line 25
    .line 26
    invoke-static {v2, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    array-length v2, p0

    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    if-gt v2, v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v2, Ljava/lang/String;

    .line 40
    .line 41
    array-length v4, p0

    .line 42
    invoke-static {p0, v3, v4}, Lm6/g;->n0([BII)[B

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-static {p0, v5, v3}, Lm6/g;->n0([BII)[B

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v3, "AES/CBC/PKCS5Padding"

    .line 52
    .line 53
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    .line 58
    .line 59
    const-string v6, "AES"

    .line 60
    .line 61
    invoke-direct {v5, v0, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x2

    .line 70
    invoke-virtual {v3, p0, v5, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string v0, "doFinal(...)"

    .line 78
    .line 79
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :catchall_0
    :goto_0
    const-string p0, ""

    .line 87
    .line 88
    return-object p0
.end method

.method public static final g(Ljava/util/HashSet;Ljava/lang/String;Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;ILr6/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, v1, Lz4/h;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lz4/h;

    .line 11
    .line 12
    iget v3, v2, Lz4/h;->w:I

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
    iput v3, v2, Lz4/h;->w:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lz4/h;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lr6/c;-><init>(Lp6/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lz4/h;->v:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lq6/a;->j:Lq6/a;

    .line 32
    .line 33
    iget v4, v2, Lz4/h;->w:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v8, 0x1

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    if-eq v4, v8, :cond_2

    .line 41
    .line 42
    if-ne v4, v6, :cond_1

    .line 43
    .line 44
    iget v0, v2, Lz4/h;->u:I

    .line 45
    .line 46
    iget v4, v2, Lz4/h;->t:I

    .line 47
    .line 48
    iget v9, v2, Lz4/h;->s:I

    .line 49
    .line 50
    iget-object v10, v2, Lz4/h;->r:Lorg/json/JSONArray;

    .line 51
    .line 52
    iget-object v11, v2, Lz4/h;->q:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v12, v2, Lz4/h;->p:Landroid/content/Context;

    .line 55
    .line 56
    iget-object v13, v2, Lz4/h;->o:Lb5/i;

    .line 57
    .line 58
    iget-object v14, v2, Lz4/h;->n:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v15, v2, Lz4/h;->m:Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/16 p7, 0x0

    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_2
    iget v0, v2, Lz4/h;->u:I

    .line 78
    .line 79
    iget v4, v2, Lz4/h;->t:I

    .line 80
    .line 81
    iget v9, v2, Lz4/h;->s:I

    .line 82
    .line 83
    iget-object v10, v2, Lz4/h;->r:Lorg/json/JSONArray;

    .line 84
    .line 85
    iget-object v11, v2, Lz4/h;->q:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v12, v2, Lz4/h;->p:Landroid/content/Context;

    .line 88
    .line 89
    iget-object v13, v2, Lz4/h;->o:Lb5/i;

    .line 90
    .line 91
    iget-object v14, v2, Lz4/h;->n:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v15, v2, Lz4/h;->m:Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object/from16 v21, v1

    .line 99
    .line 100
    const/16 p7, 0x0

    .line 101
    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :cond_3
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    instance-of v1, v0, Lorg/json/JSONArray;

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    check-cast v0, Lorg/json/JSONArray;

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    instance-of v1, v0, Lorg/json/JSONObject;

    .line 115
    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    new-instance v1, Lorg/json/JSONArray;

    .line 119
    .line 120
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    goto :goto_1

    .line 128
    :cond_5
    const/4 v0, 0x0

    .line 129
    :goto_1
    if-nez v0, :cond_7

    .line 130
    .line 131
    :cond_6
    const/16 p7, 0x0

    .line 132
    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_7
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    move-object/from16 v4, p3

    .line 140
    .line 141
    move-object/from16 v9, p4

    .line 142
    .line 143
    move/from16 v10, p6

    .line 144
    .line 145
    move-object v11, v0

    .line 146
    move v12, v1

    .line 147
    move-object v13, v2

    .line 148
    move v14, v5

    .line 149
    move-object/from16 v0, p0

    .line 150
    .line 151
    move-object/from16 v1, p1

    .line 152
    .line 153
    move-object/from16 v2, p2

    .line 154
    .line 155
    :goto_2
    if-ge v14, v12, :cond_6

    .line 156
    .line 157
    invoke-virtual {v11, v14}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    if-nez v15, :cond_8

    .line 162
    .line 163
    const/16 p7, 0x0

    .line 164
    .line 165
    goto/16 :goto_7

    .line 166
    .line 167
    :cond_8
    const/16 p7, 0x0

    .line 168
    .line 169
    invoke-virtual {v15}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    const-string v6, "toString(...)"

    .line 174
    .line 175
    invoke-static {v6, v7}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_a

    .line 183
    .line 184
    const-string v6, "servers"

    .line 185
    .line 186
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-eqz v6, :cond_b

    .line 191
    .line 192
    const-string v6, "id"

    .line 193
    .line 194
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    if-eqz v6, :cond_9

    .line 199
    .line 200
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    goto :goto_3

    .line 205
    :cond_9
    move-object/from16 v6, p7

    .line 206
    .line 207
    :goto_3
    invoke-static {v6, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-eqz v6, :cond_a

    .line 212
    .line 213
    return-object v15

    .line 214
    :cond_a
    const/4 v6, 0x2

    .line 215
    goto/16 :goto_7

    .line 216
    .line 217
    :cond_b
    const-string v6, "url"

    .line 218
    .line 219
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-static {v6}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    const-string v7, "/get/"

    .line 227
    .line 228
    invoke-static {v6, v7, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-eqz v7, :cond_a

    .line 233
    .line 234
    const/4 v7, 0x3

    .line 235
    if-ge v10, v7, :cond_a

    .line 236
    .line 237
    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    const-string v7, "substring(...)"

    .line 242
    .line 243
    invoke-static {v7, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iput-object v0, v13, Lz4/h;->m:Ljava/util/HashSet;

    .line 247
    .line 248
    iput-object v1, v13, Lz4/h;->n:Ljava/lang/String;

    .line 249
    .line 250
    iput-object v2, v13, Lz4/h;->o:Lb5/i;

    .line 251
    .line 252
    iput-object v4, v13, Lz4/h;->p:Landroid/content/Context;

    .line 253
    .line 254
    iput-object v9, v13, Lz4/h;->q:Ljava/lang/String;

    .line 255
    .line 256
    iput-object v11, v13, Lz4/h;->r:Lorg/json/JSONArray;

    .line 257
    .line 258
    iput v10, v13, Lz4/h;->s:I

    .line 259
    .line 260
    iput v14, v13, Lz4/h;->t:I

    .line 261
    .line 262
    iput v12, v13, Lz4/h;->u:I

    .line 263
    .line 264
    iput v8, v13, Lz4/h;->w:I

    .line 265
    .line 266
    invoke-static {v2, v4, v6, v9, v13}, Lz4/k;->h(Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    if-ne v6, v3, :cond_c

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_c
    move-object v15, v13

    .line 274
    move-object v13, v2

    .line 275
    move-object v2, v15

    .line 276
    move-object v15, v11

    .line 277
    move-object v11, v9

    .line 278
    move v9, v10

    .line 279
    move-object v10, v15

    .line 280
    move-object v15, v0

    .line 281
    move-object/from16 v21, v6

    .line 282
    .line 283
    move v0, v12

    .line 284
    move-object v12, v4

    .line 285
    move v4, v14

    .line 286
    move-object v14, v1

    .line 287
    :goto_4
    add-int/lit8 v22, v9, 0x1

    .line 288
    .line 289
    iput-object v15, v2, Lz4/h;->m:Ljava/util/HashSet;

    .line 290
    .line 291
    iput-object v14, v2, Lz4/h;->n:Ljava/lang/String;

    .line 292
    .line 293
    iput-object v13, v2, Lz4/h;->o:Lb5/i;

    .line 294
    .line 295
    iput-object v12, v2, Lz4/h;->p:Landroid/content/Context;

    .line 296
    .line 297
    iput-object v11, v2, Lz4/h;->q:Ljava/lang/String;

    .line 298
    .line 299
    iput-object v10, v2, Lz4/h;->r:Lorg/json/JSONArray;

    .line 300
    .line 301
    iput v9, v2, Lz4/h;->s:I

    .line 302
    .line 303
    iput v4, v2, Lz4/h;->t:I

    .line 304
    .line 305
    iput v0, v2, Lz4/h;->u:I

    .line 306
    .line 307
    const/4 v6, 0x2

    .line 308
    iput v6, v2, Lz4/h;->w:I

    .line 309
    .line 310
    move-object/from16 v23, v2

    .line 311
    .line 312
    move-object/from16 v20, v11

    .line 313
    .line 314
    move-object/from16 v19, v12

    .line 315
    .line 316
    move-object/from16 v18, v13

    .line 317
    .line 318
    move-object/from16 v17, v14

    .line 319
    .line 320
    move-object/from16 v16, v15

    .line 321
    .line 322
    invoke-static/range {v16 .. v23}, Lz4/k;->g(Ljava/util/HashSet;Ljava/lang/String;Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;ILr6/c;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    if-ne v1, v3, :cond_d

    .line 327
    .line 328
    :goto_5
    return-object v3

    .line 329
    :cond_d
    move-object/from16 v15, v16

    .line 330
    .line 331
    move-object/from16 v14, v17

    .line 332
    .line 333
    move-object/from16 v13, v18

    .line 334
    .line 335
    move-object/from16 v12, v19

    .line 336
    .line 337
    move-object/from16 v11, v20

    .line 338
    .line 339
    move-object/from16 v2, v23

    .line 340
    .line 341
    :goto_6
    check-cast v1, Lorg/json/JSONObject;

    .line 342
    .line 343
    if-eqz v1, :cond_e

    .line 344
    .line 345
    return-object v1

    .line 346
    :cond_e
    move-object v1, v13

    .line 347
    move-object v13, v2

    .line 348
    move-object v2, v1

    .line 349
    move-object v1, v10

    .line 350
    move v10, v9

    .line 351
    move-object v9, v11

    .line 352
    move-object v11, v1

    .line 353
    move-object v1, v14

    .line 354
    move v14, v4

    .line 355
    move-object v4, v12

    .line 356
    move v12, v0

    .line 357
    move-object v0, v15

    .line 358
    :goto_7
    add-int/2addr v14, v8

    .line 359
    goto/16 :goto_2

    .line 360
    .line 361
    :goto_8
    return-object p7
.end method

.method public static h(Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 2
    .line 3
    sget-object v0, Lo7/d;->l:Lo7/d;

    .line 4
    .line 5
    new-instance v1, Lz4/i;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move-object v4, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v5, p3

    .line 12
    invoke-direct/range {v1 .. v6}, Lz4/i;-><init>(Ljava/lang/String;Lb5/i;Landroid/content/Context;Ljava/lang/String;Lp6/c;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p4}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, ":"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "input"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "MD5"

    .line 27
    .line 28
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object v0, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "getBytes(...)"

    .line 39
    .line 40
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "digest(...)"

    .line 48
    .line 49
    invoke-static {p1, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    array-length v0, p0

    .line 55
    mul-int/lit8 v0, v0, 0x2

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 58
    .line 59
    .line 60
    array-length v0, p0

    .line 61
    const/4 v1, 0x0

    .line 62
    :goto_0
    if-ge v1, v0, :cond_0

    .line 63
    .line 64
    aget-byte v2, p0, v1

    .line 65
    .line 66
    and-int/lit16 v3, v2, 0xff

    .line 67
    .line 68
    ushr-int/lit8 v3, v3, 0x4

    .line 69
    .line 70
    const-string v4, "0123456789abcdef"

    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    and-int/lit8 v2, v2, 0xf

    .line 80
    .line 81
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const-string p1, "toString(...)"

    .line 96
    .line 97
    invoke-static {p1, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object p0
.end method

.method public static j(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/json/JSONObject;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :catchall_0
    new-instance p0, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance p0, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method


# virtual methods
.method public final f(Lb5/i;Landroid/content/Context;Lr6/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lz4/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lz4/g;

    .line 7
    .line 8
    iget v1, v0, Lz4/g;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/g;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lz4/g;-><init>(Lz4/k;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lz4/g;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/g;->o:I

    .line 30
    .line 31
    sget-object v3, Lz4/k;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    sget-object v4, Lz4/k;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    check-cast p3, Lorg/json/JSONObject;

    .line 61
    .line 62
    if-eqz p3, :cond_3

    .line 63
    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v9, "get(...)"

    .line 73
    .line 74
    invoke-static {v9, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    check-cast v2, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    sub-long/2addr v7, v9

    .line 84
    const-wide/32 v9, 0x1499700

    .line 85
    .line 86
    .line 87
    cmp-long v2, v7, v9

    .line 88
    .line 89
    if-gez v2, :cond_3

    .line 90
    .line 91
    return-object p3

    .line 92
    :cond_3
    iput v5, v0, Lz4/g;->o:I

    .line 93
    .line 94
    const-string p3, "settings/app_tv_box.php?v="

    .line 95
    .line 96
    invoke-static {p1, p2, p3, v6, v0}, Lz4/k;->h(Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    if-ne p3, v1, :cond_4

    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_4
    :goto_1
    instance-of p1, p3, Lorg/json/JSONArray;

    .line 104
    .line 105
    const/4 p2, 0x0

    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    check-cast p3, Lorg/json/JSONArray;

    .line 109
    .line 110
    invoke-virtual {p3, p2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-nez p1, :cond_7

    .line 115
    .line 116
    new-instance p1, Lorg/json/JSONObject;

    .line 117
    .line 118
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    instance-of p1, p3, Lorg/json/JSONObject;

    .line 123
    .line 124
    if-eqz p1, :cond_6

    .line 125
    .line 126
    move-object p1, p3

    .line 127
    check-cast p1, Lorg/json/JSONObject;

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    new-instance p1, Lorg/json/JSONObject;

    .line 131
    .line 132
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_2
    new-instance p3, Lorg/json/JSONObject;

    .line 136
    .line 137
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v1, "keys(...)"

    .line 145
    .line 146
    invoke-static {v1, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_d

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    instance-of v5, v2, Ljava/lang/String;

    .line 166
    .line 167
    if-eqz v5, :cond_b

    .line 168
    .line 169
    move-object v5, v2

    .line 170
    check-cast v5, Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    const/4 v8, 0x2

    .line 177
    if-lt v7, v8, :cond_b

    .line 178
    .line 179
    const-string v7, "\""

    .line 180
    .line 181
    invoke-static {v5, v7, p2}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_b

    .line 186
    .line 187
    invoke-static {v5, v7, p2}, Lh7/p;->m0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_b

    .line 192
    .line 193
    :try_start_0
    new-instance v7, Lorg/json/JSONTokener;

    .line 194
    .line 195
    move-object v8, v2

    .line 196
    check-cast v8, Ljava/lang/String;

    .line 197
    .line 198
    invoke-direct {v7, v8}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    instance-of v8, v7, Ljava/lang/String;

    .line 206
    .line 207
    if-eqz v8, :cond_8

    .line 208
    .line 209
    check-cast v7, Ljava/lang/String;

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_8
    move-object v7, v6

    .line 213
    :goto_4
    if-nez v7, :cond_9

    .line 214
    .line 215
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    move-object v5, v2

    .line 218
    goto :goto_5

    .line 219
    :cond_9
    move-object v5, v7

    .line 220
    :catchall_0
    :goto_5
    invoke-static {v5}, Lz4/k;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-lez v7, :cond_a

    .line 229
    .line 230
    move-object v5, v2

    .line 231
    :cond_a
    invoke-virtual {p3, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_b
    if-nez v2, :cond_c

    .line 236
    .line 237
    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 238
    .line 239
    :cond_c
    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_d
    const-string p1, "stream_hosts"

    .line 244
    .line 245
    invoke-virtual {p3, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    const-string v0, "optString(...)"

    .line 250
    .line 251
    invoke-static {v0, p2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    const-string v0, "|"

    .line 255
    .line 256
    filled-new-array {v0}, [Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {p2, v0}, Lh7/h;->K0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    new-instance v0, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    :cond_e
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_f

    .line 278
    .line 279
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    move-object v2, v1

    .line 284
    check-cast v2, Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-lez v2, :cond_e

    .line 291
    .line 292
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_f
    new-instance p2, Lorg/json/JSONArray;

    .line 297
    .line 298
    invoke-direct {p2, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4, p3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 308
    .line 309
    .line 310
    move-result-wide p1

    .line 311
    new-instance v0, Ljava/lang/Long;

    .line 312
    .line 313
    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    return-object p3
.end method

.method public final k(Lcom/exotv/net/MainActivity;Lcom/exotv/net/model/Channel;Lr6/c;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    sget-object v2, Lm6/p;->j:Lm6/p;

    .line 6
    .line 7
    const-string v3, "resolved kind="

    .line 8
    .line 9
    const-string v4, "no GEN match for id_gen="

    .line 10
    .line 11
    const-string v5, "get/?from=channels&cat=categories&parent="

    .line 12
    .line 13
    const-string v6, "get/?from=channels2&parent="

    .line 14
    .line 15
    instance-of v7, v0, Lz4/j;

    .line 16
    .line 17
    if-eqz v7, :cond_0

    .line 18
    .line 19
    move-object v7, v0

    .line 20
    check-cast v7, Lz4/j;

    .line 21
    .line 22
    iget v8, v7, Lz4/j;->u:I

    .line 23
    .line 24
    const/high16 v9, -0x80000000

    .line 25
    .line 26
    and-int v10, v8, v9

    .line 27
    .line 28
    if-eqz v10, :cond_0

    .line 29
    .line 30
    sub-int/2addr v8, v9

    .line 31
    iput v8, v7, Lz4/j;->u:I

    .line 32
    .line 33
    :goto_0
    move-object v15, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    new-instance v7, Lz4/j;

    .line 36
    .line 37
    invoke-direct {v7, v1, v0}, Lz4/j;-><init>(Lz4/k;Lr6/c;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :goto_1
    iget-object v0, v15, Lz4/j;->s:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object v7, Lq6/a;->j:Lq6/a;

    .line 44
    .line 45
    iget v8, v15, Lz4/j;->u:I

    .line 46
    .line 47
    const-string v9, "GenResolver"

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, 0x1

    .line 51
    packed-switch v8, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :pswitch_0
    iget-object v4, v15, Lz4/j;->q:Lorg/json/JSONObject;

    .line 63
    .line 64
    iget-object v5, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v5, Lorg/json/JSONObject;

    .line 67
    .line 68
    iget-object v6, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v6, Lb5/i;

    .line 71
    .line 72
    iget-object v7, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v7, Lcom/exotv/net/model/Channel;

    .line 75
    .line 76
    iget-object v8, v15, Lz4/j;->m:Lz4/k;

    .line 77
    .line 78
    :try_start_0
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    move-object v1, v9

    .line 82
    goto/16 :goto_f

    .line 83
    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object v1, v9

    .line 86
    goto/16 :goto_15

    .line 87
    .line 88
    :pswitch_1
    iget-object v5, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v5, Lorg/json/JSONObject;

    .line 91
    .line 92
    iget-object v6, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v6, Lb5/i;

    .line 95
    .line 96
    iget-object v8, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v8, Lcom/exotv/net/model/Channel;

    .line 99
    .line 100
    iget-object v10, v15, Lz4/j;->m:Lz4/k;

    .line 101
    .line 102
    :try_start_1
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    move-object v1, v9

    .line 106
    move-object v9, v8

    .line 107
    move-object v8, v0

    .line 108
    move-object v0, v11

    .line 109
    goto/16 :goto_b

    .line 110
    .line 111
    :pswitch_2
    iget-object v5, v15, Lz4/j;->r:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v6, v15, Lz4/j;->q:Lorg/json/JSONObject;

    .line 114
    .line 115
    iget-object v8, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v8, Lb5/i;

    .line 118
    .line 119
    iget-object v10, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v10, Lcom/exotv/net/model/Channel;

    .line 122
    .line 123
    iget-object v13, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v13, Landroid/content/Context;

    .line 126
    .line 127
    iget-object v14, v15, Lz4/j;->m:Lz4/k;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :goto_2
    move-object v12, v5

    .line 131
    move-object v11, v13

    .line 132
    move-object v5, v14

    .line 133
    move-object v13, v0

    .line 134
    move-object v0, v10

    .line 135
    move-object v10, v8

    .line 136
    move-object v8, v9

    .line 137
    goto/16 :goto_a

    .line 138
    .line 139
    :pswitch_3
    iget-object v5, v15, Lz4/j;->r:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v6, v15, Lz4/j;->q:Lorg/json/JSONObject;

    .line 142
    .line 143
    iget-object v8, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v8, Lb5/i;

    .line 146
    .line 147
    iget-object v10, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v10, Lcom/exotv/net/model/Channel;

    .line 150
    .line 151
    iget-object v13, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v13, Landroid/content/Context;

    .line 154
    .line 155
    iget-object v14, v15, Lz4/j;->m:Lz4/k;

    .line 156
    .line 157
    :goto_3
    :try_start_2
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :pswitch_4
    iget-object v8, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v8, Lb5/i;

    .line 164
    .line 165
    iget-object v13, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v13, Lcom/exotv/net/model/Channel;

    .line 168
    .line 169
    iget-object v14, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v14, Landroid/content/Context;

    .line 172
    .line 173
    iget-object v10, v15, Lz4/j;->m:Lz4/k;

    .line 174
    .line 175
    :try_start_3
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 176
    .line 177
    .line 178
    move-object/from16 v19, v14

    .line 179
    .line 180
    move-object v14, v10

    .line 181
    move-object v10, v13

    .line 182
    move-object/from16 v13, v19

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :pswitch_5
    iget-object v8, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v8, Lcom/exotv/net/model/Channel;

    .line 188
    .line 189
    iget-object v10, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v10, Landroid/content/Context;

    .line 192
    .line 193
    iget-object v13, v15, Lz4/j;->m:Lz4/k;

    .line 194
    .line 195
    :try_start_4
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 196
    .line 197
    .line 198
    move-object/from16 v19, v10

    .line 199
    .line 200
    move-object v10, v0

    .line 201
    move-object/from16 v0, v19

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :pswitch_6
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :try_start_5
    iput-object v1, v15, Lz4/j;->m:Lz4/k;

    .line 208
    .line 209
    move-object/from16 v0, p1

    .line 210
    .line 211
    iput-object v0, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 212
    .line 213
    move-object/from16 v8, p2

    .line 214
    .line 215
    iput-object v8, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 216
    .line 217
    iput v12, v15, Lz4/j;->u:I

    .line 218
    .line 219
    sget-object v10, Lb5/h;->a:Lb5/i;

    .line 220
    .line 221
    if-eqz v10, :cond_1

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_1
    sget-object v10, Li7/e0;->a:Lo7/e;

    .line 225
    .line 226
    sget-object v10, Lo7/d;->l:Lo7/d;

    .line 227
    .line 228
    new-instance v13, Lb5/g;

    .line 229
    .line 230
    const/4 v14, 0x2

    .line 231
    invoke-direct {v13, v14, v11}, Lr6/h;-><init>(ILp6/c;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v10, v13, v15}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    :goto_4
    if-ne v10, v7, :cond_2

    .line 239
    .line 240
    goto/16 :goto_e

    .line 241
    .line 242
    :cond_2
    move-object v13, v1

    .line 243
    :goto_5
    check-cast v10, Lb5/i;

    .line 244
    .line 245
    iput-object v13, v15, Lz4/j;->m:Lz4/k;

    .line 246
    .line 247
    iput-object v0, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v8, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v10, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 252
    .line 253
    const/4 v14, 0x2

    .line 254
    iput v14, v15, Lz4/j;->u:I

    .line 255
    .line 256
    invoke-virtual {v13, v10, v0, v15}, Lz4/k;->f(Lb5/i;Landroid/content/Context;Lr6/c;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v14

    .line 260
    if-ne v14, v7, :cond_3

    .line 261
    .line 262
    goto/16 :goto_e

    .line 263
    .line 264
    :cond_3
    move-object/from16 v19, v13

    .line 265
    .line 266
    move-object v13, v0

    .line 267
    move-object v0, v14

    .line 268
    move-object/from16 v14, v19

    .line 269
    .line 270
    move-object/from16 v19, v10

    .line 271
    .line 272
    move-object v10, v8

    .line 273
    move-object/from16 v8, v19

    .line 274
    .line 275
    :goto_6
    check-cast v0, Lorg/json/JSONObject;

    .line 276
    .line 277
    invoke-virtual {v10}, Lcom/exotv/net/model/Channel;->getXCatInfo()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v16

    .line 281
    if-eqz v16, :cond_6

    .line 282
    .line 283
    invoke-static/range {v16 .. v16}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v17

    .line 287
    if-nez v17, :cond_4

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_4
    move-object/from16 v16, v11

    .line 291
    .line 292
    :goto_7
    if-nez v16, :cond_5

    .line 293
    .line 294
    goto :goto_8

    .line 295
    :cond_5
    move-object/from16 v11, v16

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_6
    :goto_8
    invoke-virtual {v10}, Lcom/exotv/net/model/Channel;->getParent()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v12

    .line 302
    invoke-static {v12}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    sget-object v11, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 306
    .line 307
    invoke-virtual {v12, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    const-string v12, "getBytes(...)"

    .line 312
    .line 313
    invoke-static {v12, v11}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    const/4 v12, 0x2

    .line 317
    invoke-static {v11, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    :goto_9
    invoke-virtual {v10}, Lcom/exotv/net/model/Channel;->isSub()Z

    .line 322
    .line 323
    .line 324
    move-result v12

    .line 325
    if-eqz v12, :cond_8

    .line 326
    .line 327
    invoke-virtual {v10}, Lcom/exotv/net/model/Channel;->getParent()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    new-instance v12, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v12, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v5, "&cat=channels"

    .line 340
    .line 341
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    iput-object v14, v15, Lz4/j;->m:Lz4/k;

    .line 349
    .line 350
    iput-object v13, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v10, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v8, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 355
    .line 356
    iput-object v0, v15, Lz4/j;->q:Lorg/json/JSONObject;

    .line 357
    .line 358
    iput-object v11, v15, Lz4/j;->r:Ljava/lang/String;

    .line 359
    .line 360
    const/4 v6, 0x3

    .line 361
    iput v6, v15, Lz4/j;->u:I

    .line 362
    .line 363
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-static {v8, v13, v5, v11, v15}, Lz4/k;->h(Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    if-ne v5, v7, :cond_7

    .line 371
    .line 372
    goto/16 :goto_e

    .line 373
    .line 374
    :cond_7
    move-object v6, v0

    .line 375
    move-object v0, v5

    .line 376
    move-object v5, v11

    .line 377
    goto/16 :goto_2

    .line 378
    .line 379
    :cond_8
    invoke-virtual {v10}, Lcom/exotv/net/model/Channel;->getParent()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    new-instance v12, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    invoke-direct {v12, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    iput-object v14, v15, Lz4/j;->m:Lz4/k;

    .line 396
    .line 397
    iput-object v13, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v10, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 400
    .line 401
    iput-object v8, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 402
    .line 403
    iput-object v0, v15, Lz4/j;->q:Lorg/json/JSONObject;

    .line 404
    .line 405
    iput-object v11, v15, Lz4/j;->r:Ljava/lang/String;

    .line 406
    .line 407
    const/4 v6, 0x4

    .line 408
    iput v6, v15, Lz4/j;->u:I

    .line 409
    .line 410
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-static {v8, v13, v5, v11, v15}, Lz4/k;->h(Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 417
    if-ne v5, v7, :cond_9

    .line 418
    .line 419
    goto/16 :goto_e

    .line 420
    .line 421
    :cond_9
    move-object v6, v0

    .line 422
    move-object v0, v10

    .line 423
    move-object v12, v11

    .line 424
    move-object v11, v13

    .line 425
    move-object v13, v5

    .line 426
    move-object v10, v8

    .line 427
    move-object v8, v9

    .line 428
    move-object v5, v14

    .line 429
    :goto_a
    :try_start_6
    invoke-virtual {v0}, Lcom/exotv/net/model/Channel;->getIdGen()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    invoke-static {v9}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    iput-object v5, v15, Lz4/j;->m:Lz4/k;

    .line 437
    .line 438
    iput-object v0, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 439
    .line 440
    iput-object v10, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 441
    .line 442
    iput-object v6, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 443
    .line 444
    const/4 v14, 0x0

    .line 445
    iput-object v14, v15, Lz4/j;->q:Lorg/json/JSONObject;

    .line 446
    .line 447
    iput-object v14, v15, Lz4/j;->r:Ljava/lang/String;

    .line 448
    .line 449
    const/4 v14, 0x5

    .line 450
    iput v14, v15, Lz4/j;->u:I

    .line 451
    .line 452
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 453
    .line 454
    .line 455
    move-object v14, v8

    .line 456
    :try_start_7
    new-instance v8, Ljava/util/HashSet;

    .line 457
    .line 458
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 459
    .line 460
    .line 461
    move-object/from16 v18, v14

    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    move-object/from16 p1, v0

    .line 465
    .line 466
    move-object/from16 v1, v18

    .line 467
    .line 468
    const/4 v0, 0x0

    .line 469
    :try_start_8
    invoke-static/range {v8 .. v15}, Lz4/k;->g(Ljava/util/HashSet;Ljava/lang/String;Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;ILr6/c;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    if-ne v8, v7, :cond_a

    .line 474
    .line 475
    goto/16 :goto_e

    .line 476
    .line 477
    :cond_a
    move-object v9, v10

    .line 478
    move-object v10, v5

    .line 479
    move-object v5, v6

    .line 480
    move-object v6, v9

    .line 481
    move-object/from16 v9, p1

    .line 482
    .line 483
    :goto_b
    check-cast v8, Lorg/json/JSONObject;

    .line 484
    .line 485
    if-nez v8, :cond_b

    .line 486
    .line 487
    invoke-virtual {v9}, Lcom/exotv/net/model/Channel;->getIdGen()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v9}, Lcom/exotv/net/model/Channel;->getParent()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    new-instance v5, Ljava/lang/StringBuilder;

    .line 496
    .line 497
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    const-string v0, " parent="

    .line 504
    .line 505
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 516
    .line 517
    .line 518
    return-object v2

    .line 519
    :catchall_1
    move-exception v0

    .line 520
    goto/16 :goto_15

    .line 521
    .line 522
    :cond_b
    iput-object v10, v15, Lz4/j;->m:Lz4/k;

    .line 523
    .line 524
    iput-object v9, v15, Lz4/j;->n:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v6, v15, Lz4/j;->o:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v5, v15, Lz4/j;->p:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v8, v15, Lz4/j;->q:Lorg/json/JSONObject;

    .line 531
    .line 532
    const/4 v4, 0x6

    .line 533
    iput v4, v15, Lz4/j;->u:I

    .line 534
    .line 535
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    const-string v4, "remote_addr_url"

    .line 539
    .line 540
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v11

    .line 544
    invoke-static {v11}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-static {v11}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-nez v4, :cond_c

    .line 552
    .line 553
    goto :goto_c

    .line 554
    :cond_c
    move-object v11, v0

    .line 555
    :goto_c
    if-nez v11, :cond_e

    .line 556
    .line 557
    iget-object v11, v6, Lb5/i;->w:Ljava/lang/String;

    .line 558
    .line 559
    if-eqz v11, :cond_d

    .line 560
    .line 561
    invoke-static {v11}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    if-nez v4, :cond_d

    .line 566
    .line 567
    goto :goto_d

    .line 568
    :cond_d
    move-object v11, v0

    .line 569
    :goto_d
    if-nez v11, :cond_e

    .line 570
    .line 571
    const-string v11, "https://api.ipify.org/"

    .line 572
    .line 573
    :cond_e
    sget-object v4, Li7/e0;->a:Lo7/e;

    .line 574
    .line 575
    sget-object v4, Lo7/d;->l:Lo7/d;

    .line 576
    .line 577
    new-instance v12, Lz4/f;

    .line 578
    .line 579
    invoke-direct {v12, v11, v6, v0}, Lz4/f;-><init>(Ljava/lang/String;Lb5/i;Lp6/c;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v4, v12, v15}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    if-ne v0, v7, :cond_f

    .line 587
    .line 588
    :goto_e
    return-object v7

    .line 589
    :cond_f
    move-object v4, v8

    .line 590
    move-object v7, v9

    .line 591
    move-object v8, v10

    .line 592
    :goto_f
    check-cast v0, Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    invoke-static {v4, v5, v0}, Lz4/k;->b(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 602
    .line 603
    .line 604
    move-result v4

    .line 605
    if-eqz v4, :cond_10

    .line 606
    .line 607
    return-object v2

    .line 608
    :cond_10
    invoke-virtual {v7}, Lcom/exotv/net/model/Channel;->getServer()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    if-eqz v4, :cond_11

    .line 613
    .line 614
    invoke-static {v4}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    if-eqz v4, :cond_11

    .line 619
    .line 620
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    :goto_10
    move v12, v4

    .line 625
    goto :goto_11

    .line 626
    :cond_11
    const/4 v4, 0x0

    .line 627
    goto :goto_10

    .line 628
    :goto_11
    if-eqz v12, :cond_12

    .line 629
    .line 630
    :goto_12
    const/4 v4, 0x1

    .line 631
    goto :goto_13

    .line 632
    :cond_12
    const/4 v12, 0x1

    .line 633
    goto :goto_12

    .line 634
    :goto_13
    if-lt v12, v4, :cond_13

    .line 635
    .line 636
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 637
    .line 638
    .line 639
    move-result v5

    .line 640
    if-gt v12, v5, :cond_13

    .line 641
    .line 642
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    sub-int/2addr v4, v12

    .line 647
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    check-cast v4, Lz4/d;

    .line 652
    .line 653
    goto :goto_14

    .line 654
    :cond_13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 655
    .line 656
    .line 657
    move-result v5

    .line 658
    sub-int/2addr v5, v4

    .line 659
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    check-cast v4, Lz4/d;

    .line 664
    .line 665
    :goto_14
    iget-object v5, v4, Lz4/d;->b:Ljava/lang/String;

    .line 666
    .line 667
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    new-instance v7, Ljava/lang/StringBuilder;

    .line 672
    .line 673
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    const-string v3, " server="

    .line 680
    .line 681
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    const-string v3, " of "

    .line 688
    .line 689
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 700
    .line 701
    .line 702
    new-instance v7, Lcom/exotv/net/model/ResolvedStream;

    .line 703
    .line 704
    iget-object v8, v4, Lz4/d;->a:Ljava/lang/String;

    .line 705
    .line 706
    invoke-static {v4, v6}, Lz4/k;->c(Lz4/d;Lb5/i;)Ljava/util/LinkedHashMap;

    .line 707
    .line 708
    .line 709
    move-result-object v9

    .line 710
    const/4 v11, 0x4

    .line 711
    const/4 v12, 0x0

    .line 712
    const/4 v10, 0x0

    .line 713
    invoke-direct/range {v7 .. v12}, Lcom/exotv/net/model/ResolvedStream;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILz6/e;)V

    .line 714
    .line 715
    .line 716
    invoke-static {v7}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 720
    return-object v0

    .line 721
    :catchall_2
    move-exception v0

    .line 722
    move-object v1, v14

    .line 723
    goto :goto_15

    .line 724
    :catchall_3
    move-exception v0

    .line 725
    move-object v1, v8

    .line 726
    :goto_15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    new-instance v4, Ljava/lang/StringBuilder;

    .line 731
    .line 732
    const-string v5, "gen stream error: "

    .line 733
    .line 734
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 745
    .line 746
    .line 747
    return-object v2

    .line 748
    nop

    .line 749
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
