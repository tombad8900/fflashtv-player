.class public final synthetic Lz4/c0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lz6/k;

.field public final synthetic l:Lz6/n;

.field public final synthetic m:Li7/m;

.field public final synthetic n:Ljava/util/ArrayList;

.field public final synthetic o:Lz6/n;

.field public final synthetic p:Lz6/n;

.field public final synthetic q:Landroid/webkit/WebView;

.field public final synthetic r:Lc5/b;

.field public final synthetic s:Ljava/util/LinkedHashSet;

.field public final synthetic t:Landroid/os/Handler;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lz6/k;Lz6/n;Li7/m;Ljava/util/ArrayList;Lz6/n;Lz6/n;Landroid/webkit/WebView;Lc5/b;Ljava/util/LinkedHashSet;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz4/c0;->j:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lz4/c0;->k:Lz6/k;

    .line 7
    .line 8
    iput-object p3, p0, Lz4/c0;->l:Lz6/n;

    .line 9
    .line 10
    iput-object p4, p0, Lz4/c0;->m:Li7/m;

    .line 11
    .line 12
    iput-object p5, p0, Lz4/c0;->n:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p6, p0, Lz4/c0;->o:Lz6/n;

    .line 15
    .line 16
    iput-object p7, p0, Lz4/c0;->p:Lz6/n;

    .line 17
    .line 18
    iput-object p8, p0, Lz4/c0;->q:Landroid/webkit/WebView;

    .line 19
    .line 20
    iput-object p9, p0, Lz4/c0;->r:Lc5/b;

    .line 21
    .line 22
    iput-object p10, p0, Lz4/c0;->s:Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    iput-object p11, p0, Lz4/c0;->t:Landroid/os/Handler;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lz4/c0;->j:Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    const-string v0, "type"

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_9

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v3, p0, Lz4/c0;->l:Lz6/n;

    .line 21
    .line 22
    iget-object v4, p0, Lz4/c0;->m:Li7/m;

    .line 23
    .line 24
    iget-object v5, p0, Lz4/c0;->t:Landroid/os/Handler;

    .line 25
    .line 26
    sget-object v6, Lm6/p;->j:Lm6/p;

    .line 27
    .line 28
    const-string v7, "ResolverChain"

    .line 29
    .line 30
    sparse-switch v2, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :sswitch_0
    const-string v2, "exhausted"

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_0
    const-string v0, "fails"

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v2, "backup exhausted its servers ("

    .line 54
    .line 55
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, " refused)"

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v7, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    invoke-static {v4, v5, v3, v6}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :sswitch_1
    const-string v1, "limited"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_1
    const-string v0, "refused: the site is rate limiting this connection"

    .line 88
    .line 89
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v5, v3, v6}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :sswitch_2
    const-string v1, "stall"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :cond_2
    invoke-static {v4, v5, v3, v6}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :sswitch_3
    const-string v2, "hop"

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_3
    const-string v0, "url"

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "optString(...)"

    .line 127
    .line 128
    invoke-static {v1, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_9

    .line 136
    .line 137
    invoke-virtual {v4}, Li7/a1;->E()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_4

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_4
    iget-object v1, p0, Lz4/c0;->n:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_5

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_5
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    iget-object v1, p0, Lz4/c0;->p:Lz6/n;

    .line 158
    .line 159
    iget-object v2, v1, Lz6/n;->j:Ljava/lang/Object;

    .line 160
    .line 161
    iget-object v4, p0, Lz4/c0;->o:Lz6/n;

    .line 162
    .line 163
    iput-object v2, v4, Lz6/n;->j:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v0, v1, Lz6/n;->j:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v0, v3, Lz6/n;->j:Ljava/lang/Object;

    .line 168
    .line 169
    iget-object v1, p0, Lz4/c0;->q:Landroid/webkit/WebView;

    .line 170
    .line 171
    iget-object v2, p0, Lz4/c0;->r:Lc5/b;

    .line 172
    .line 173
    invoke-static {v1, v2, v0}, Lz4/e0;->o(Landroid/webkit/WebView;Lc5/b;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :sswitch_4
    const-string v2, "err"

    .line 178
    .line 179
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_6

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_6
    const-string v0, "message"

    .line 187
    .line 188
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    new-instance v1, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v2, "page error: "

    .line 195
    .line 196
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :sswitch_5
    const-string v2, "stream"

    .line 211
    .line 212
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_7

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_7
    const-string v0, "urls"

    .line 220
    .line 221
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget-object v1, p0, Lz4/c0;->s:Ljava/util/LinkedHashSet;

    .line 226
    .line 227
    invoke-static {v4, v1, v5, v3, v0}, Lz4/e0;->m(Li7/m;Ljava/util/LinkedHashSet;Landroid/os/Handler;Lz6/n;Lorg/json/JSONArray;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :sswitch_6
    const-string v1, "expired"

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_8

    .line 238
    .line 239
    goto :goto_0

    .line 240
    :cond_8
    const/4 v0, 0x1

    .line 241
    iget-object v1, p0, Lz4/c0;->k:Lz6/k;

    .line 242
    .line 243
    iput-boolean v0, v1, Lz6/k;->j:Z

    .line 244
    .line 245
    iget-object v0, v3, Lz6/n;->j:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, Ljava/lang/String;

    .line 248
    .line 249
    const/16 v1, 0x5a

    .line 250
    .line 251
    invoke-static {v1, v0}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    const-string v1, "expired session: "

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v7, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    invoke-static {v4, v5, v3, v6}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 265
    .line 266
    .line 267
    :catch_0
    :cond_9
    :goto_0
    return-void

    .line 268
    nop

    .line 269
    :sswitch_data_0
    .sparse-switch
        -0x4e0958db -> :sswitch_6
        -0x352ab080 -> :sswitch_5
        0x18965 -> :sswitch_4
        0x19449 -> :sswitch_3
        0x68ac3a0 -> :sswitch_2
        0xa7f559a -> :sswitch_1
        0x5a41bf49 -> :sswitch_0
    .end sparse-switch
.end method
