.class public final Lx4/w;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lx4/w;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lx4/w;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx4/w;->a:Lx4/w;

    .line 7
    .line 8
    sget-object v0, Lx4/m;->j:Lx4/m;

    .line 9
    .line 10
    const-string v1, "title"

    .line 11
    .line 12
    const-string v2, "original_title"

    .line 13
    .line 14
    const-string v3, "name"

    .line 15
    .line 16
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v4, Ll6/d;

    .line 25
    .line 26
    invoke-direct {v4, v0, v2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Lx4/m;->k:Lx4/m;

    .line 30
    .line 31
    const-string v5, "original_name"

    .line 32
    .line 33
    filled-new-array {v3, v5, v1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v3, Ll6/d;

    .line 42
    .line 43
    invoke-direct {v3, v2, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    filled-new-array {v4, v3}, [Ll6/d;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Lm6/s;->U([Ll6/d;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sput-object v1, Lx4/w;->b:Ljava/lang/Object;

    .line 55
    .line 56
    const-string v1, "release_date"

    .line 57
    .line 58
    invoke-static {v1}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    new-instance v4, Ll6/d;

    .line 63
    .line 64
    invoke-direct {v4, v0, v3}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-string v0, "first_air_date"

    .line 68
    .line 69
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, Ll6/d;

    .line 78
    .line 79
    invoke-direct {v1, v2, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    filled-new-array {v4, v1}, [Ll6/d;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lm6/s;->U([Ll6/d;)Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, Lx4/w;->c:Ljava/lang/Object;

    .line 91
    .line 92
    return-void
.end method

.method public static a(Lorg/json/JSONObject;Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "optString(...)"

    .line 30
    .line 31
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v0, v1

    .line 42
    :goto_0
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_2
    return-object v1
.end method

.method public static b(Lorg/json/JSONArray;Lx4/m;Ljava/util/Set;)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "kind"

    .line 6
    .line 7
    invoke-static {v2, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lm6/p;->j:Lm6/p;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v3, v2}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v4, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :cond_1
    :goto_0
    move-object v5, v2

    .line 34
    check-cast v5, Le7/b;

    .line 35
    .line 36
    iget-boolean v6, v5, Le7/b;->l:Z

    .line 37
    .line 38
    if-eqz v6, :cond_a

    .line 39
    .line 40
    invoke-virtual {v5}, Le7/b;->nextInt()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const/4 v6, 0x0

    .line 49
    if-nez v5, :cond_2

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_2
    const-string v7, "id"

    .line 54
    .line 55
    const-wide/16 v8, 0x0

    .line 56
    .line 57
    invoke-virtual {v5, v7, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 58
    .line 59
    .line 60
    move-result-wide v11

    .line 61
    cmp-long v7, v11, v8

    .line 62
    .line 63
    if-nez v7, :cond_3

    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_3
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-nez v7, :cond_6

    .line 72
    .line 73
    const-string v7, "genre_ids"

    .line 74
    .line 75
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    if-nez v7, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    move v9, v3

    .line 87
    :goto_1
    if-ge v9, v8, :cond_6

    .line 88
    .line 89
    const/4 v10, -0x1

    .line 90
    invoke-virtual {v7, v9, v10}, Lorg/json/JSONArray;->optInt(II)I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    move-object/from16 v13, p2

    .line 99
    .line 100
    invoke-interface {v13, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-eqz v10, :cond_5

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    :goto_2
    move-object/from16 v13, p2

    .line 111
    .line 112
    sget-object v7, Lx4/w;->b:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-static {v7, v1}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    check-cast v7, Ljava/util/List;

    .line 119
    .line 120
    invoke-static {v5, v7}, Lx4/w;->a(Lorg/json/JSONObject;Ljava/util/List;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    if-nez v7, :cond_7

    .line 125
    .line 126
    const-string v7, "Untitled"

    .line 127
    .line 128
    :cond_7
    invoke-static {v5, v1}, Lx4/w;->d(Lorg/json/JSONObject;Lx4/m;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    const-string v8, "poster_path"

    .line 133
    .line 134
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    const-string v10, "null"

    .line 146
    .line 147
    if-lez v9, :cond_8

    .line 148
    .line 149
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-nez v9, :cond_8

    .line 154
    .line 155
    move-object v15, v8

    .line 156
    goto :goto_3

    .line 157
    :cond_8
    move-object v15, v6

    .line 158
    :goto_3
    const-string v8, "backdrop_path"

    .line 159
    .line 160
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-lez v9, :cond_9

    .line 172
    .line 173
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-nez v9, :cond_9

    .line 178
    .line 179
    move-object/from16 v16, v8

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_9
    move-object/from16 v16, v6

    .line 183
    .line 184
    :goto_4
    invoke-static {v5}, Lx4/w;->c(Lorg/json/JSONObject;)Ljava/lang/Double;

    .line 185
    .line 186
    .line 187
    move-result-object v17

    .line 188
    new-instance v10, Lx4/l;

    .line 189
    .line 190
    move-object v13, v7

    .line 191
    invoke-direct/range {v10 .. v17}, Lx4/l;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    .line 192
    .line 193
    .line 194
    move-object v6, v10

    .line 195
    :goto_5
    if-eqz v6, :cond_1

    .line 196
    .line 197
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_a
    return-object v4
.end method

.method public static c(Lorg/json/JSONObject;)Ljava/lang/Double;
    .locals 4

    .line 1
    const-string v0, "vote_average"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    cmpl-double v0, v0, v2

    .line 21
    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static d(Lorg/json/JSONObject;Lx4/m;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "kind"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx4/w;->c:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lx4/w;->a(Lorg/json/JSONObject;Ljava/util/List;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    invoke-static {p1, p0}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    if-nez p0, :cond_1

    .line 28
    .line 29
    const-string p0, ""

    .line 30
    .line 31
    :cond_1
    return-object p0
.end method
