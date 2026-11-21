.class public final Lw4/d1;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Lcom/exotv/net/SeriesDetailActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/SeriesDetailActivity;Lp6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw4/d1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/d1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw4/d1;->n:I

    .line 2
    .line 3
    check-cast p1, Li7/u;

    .line 4
    .line 5
    check-cast p2, Lp6/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lw4/d1;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw4/d1;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw4/d1;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw4/d1;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lw4/d1;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lw4/d1;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 2

    .line 1
    iget p1, p0, Lw4/d1;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lw4/d1;

    .line 7
    .line 8
    iget-object v0, p0, Lw4/d1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {p1, v0, p2, v1}, Lw4/d1;-><init>(Lcom/exotv/net/SeriesDetailActivity;Lp6/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lw4/d1;

    .line 16
    .line 17
    iget-object v0, p0, Lw4/d1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v0, p2, v1}, Lw4/d1;-><init>(Lcom/exotv/net/SeriesDetailActivity;Lp6/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw4/d1;->n:I

    .line 2
    .line 3
    const-string v1, "api_key="

    .line 4
    .line 5
    const-string v2, "4e44d9029b1270a757cddc766a1bcb63"

    .line 6
    .line 7
    const-string v3, "?"

    .line 8
    .line 9
    const-string v4, "&"

    .line 10
    .line 11
    const/16 v5, 0x3f

    .line 12
    .line 13
    const-string v6, "url"

    .line 14
    .line 15
    const-string v7, "https://api.themoviedb.org/3/tv/"

    .line 16
    .line 17
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 24
    .line 25
    iget v10, p0, Lw4/d1;->o:I

    .line 26
    .line 27
    if-eqz v10, :cond_1

    .line 28
    .line 29
    if-ne v10, v9, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    invoke-direct {p1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lx4/k;->a:Lx4/k;

    .line 45
    .line 46
    iget-object p1, p0, Lw4/d1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 47
    .line 48
    iget-wide v10, p1, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 49
    .line 50
    new-instance p1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v7, "/similar"

    .line 59
    .line 60
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {v6, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v5}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    move-object v3, v4

    .line 77
    :cond_2
    sget-object v4, Lb5/h;->a:Lb5/i;

    .line 78
    .line 79
    if-eqz v4, :cond_4

    .line 80
    .line 81
    iget-object v4, v4, Lb5/i;->r:Ljava/lang/String;

    .line 82
    .line 83
    if-nez v4, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    move-object v2, v4

    .line 87
    :cond_4
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput v9, p0, Lw4/d1;->o:I

    .line 109
    .line 110
    invoke-static {p1, p0}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v0, :cond_5

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 118
    .line 119
    new-instance v0, Lorg/json/JSONObject;

    .line 120
    .line 121
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Lx4/w;->a:Lx4/w;

    .line 125
    .line 126
    const-string p1, "results"

    .line 127
    .line 128
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    sget-object v0, Lx4/m;->k:Lx4/m;

    .line 133
    .line 134
    sget-object v1, Lm6/r;->j:Lm6/r;

    .line 135
    .line 136
    invoke-static {p1, v0, v1}, Lx4/w;->b(Lorg/json/JSONArray;Lx4/m;Ljava/util/Set;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :goto_2
    return-object v0

    .line 141
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 142
    .line 143
    iget v10, p0, Lw4/d1;->o:I

    .line 144
    .line 145
    if-eqz v10, :cond_7

    .line 146
    .line 147
    if-ne v10, v9, :cond_6

    .line 148
    .line 149
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {p1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_7
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object p1, Lx4/k;->a:Lx4/k;

    .line 163
    .line 164
    iget-object p1, p0, Lw4/d1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 165
    .line 166
    iget-wide v10, p1, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 167
    .line 168
    new-instance p1, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {v6, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-static {p1, v5}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-eqz v5, :cond_8

    .line 188
    .line 189
    move-object v3, v4

    .line 190
    :cond_8
    sget-object v4, Lb5/h;->a:Lb5/i;

    .line 191
    .line 192
    if-eqz v4, :cond_a

    .line 193
    .line 194
    iget-object v4, v4, Lb5/i;->r:Ljava/lang/String;

    .line 195
    .line 196
    if-nez v4, :cond_9

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_9
    move-object v2, v4

    .line 200
    :cond_a
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    iput v9, p0, Lw4/d1;->o:I

    .line 222
    .line 223
    invoke-static {p1, p0}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-ne p1, v0, :cond_b

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_b
    :goto_4
    check-cast p1, Ljava/lang/String;

    .line 231
    .line 232
    new-instance v0, Lorg/json/JSONObject;

    .line 233
    .line 234
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_5
    return-object v0

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
