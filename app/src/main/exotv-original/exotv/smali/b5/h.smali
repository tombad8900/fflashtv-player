.class public final Lb5/h;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static volatile a:Lb5/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final a(Lorg/json/JSONObject;)Lb5/i;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "version"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const-string v1, "forceUpdate"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const-string v1, "message"

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const-string v1, "apkUrl"

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const-string v1, "updateUrl"

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    const-string v1, "smartLinkURL"

    .line 34
    .line 35
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    const-string v1, "adsRefreshHours"

    .line 40
    .line 41
    const-wide/16 v9, 0x0

    .line 42
    .line 43
    invoke-virtual {v0, v1, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    cmpl-double v1, v1, v9

    .line 52
    .line 53
    if-lez v1, :cond_0

    .line 54
    .line 55
    move-object v9, v11

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v9, 0x0

    .line 58
    :goto_0
    const-string v1, "channelsURL"

    .line 59
    .line 60
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    const-string v1, "ytapi"

    .line 65
    .line 66
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    const-string v1, "ytapihd"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v12, "headers"

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/4 v1, 0x0

    .line 86
    :goto_1
    invoke-static {v1}, Landroid/support/v4/media/session/b;->b(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v13, "ostapi"

    .line 91
    .line 92
    invoke-static {v0, v13}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v13

    .line 96
    const-string v14, "ostapihd"

    .line 97
    .line 98
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    if-eqz v14, :cond_2

    .line 103
    .line 104
    invoke-virtual {v14, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    goto :goto_2

    .line 109
    :cond_2
    const/4 v14, 0x0

    .line 110
    :goto_2
    invoke-static {v14}, Landroid/support/v4/media/session/b;->b(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    const-string v15, "ytvbase"

    .line 115
    .line 116
    invoke-static {v0, v15}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    const-string v2, "ytvhd"

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-eqz v2, :cond_3

    .line 127
    .line 128
    invoke-virtual {v2, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    goto :goto_3

    .line 133
    :cond_3
    const/4 v2, 0x0

    .line 134
    :goto_3
    invoke-static {v2}, Landroid/support/v4/media/session/b;->b(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const-string v12, "genapi"

    .line 139
    .line 140
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v17

    .line 144
    const-string v12, "genapihd"

    .line 145
    .line 146
    move-object/from16 v18, v1

    .line 147
    .line 148
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    move-object/from16 v19, v2

    .line 153
    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    const-string v2, "api_headers"

    .line 157
    .line 158
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    goto :goto_4

    .line 163
    :cond_4
    const/4 v1, 0x0

    .line 164
    :goto_4
    invoke-static {v1}, Landroid/support/v4/media/session/b;->b(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eqz v2, :cond_5

    .line 173
    .line 174
    const-string v12, "stream_headers"

    .line 175
    .line 176
    invoke-virtual {v2, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    goto :goto_5

    .line 181
    :cond_5
    const/4 v2, 0x0

    .line 182
    :goto_5
    invoke-static {v2}, Landroid/support/v4/media/session/b;->b(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const-string v12, "tmdbApiKey"

    .line 187
    .line 188
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v20

    .line 192
    const-string v12, "gateBase"

    .line 193
    .line 194
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v21

    .line 198
    const-string v12, "gateInfoBase"

    .line 199
    .line 200
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v22

    .line 204
    const-string v12, "wasmOrigin"

    .line 205
    .line 206
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v23

    .line 210
    const-string v12, "opensubtitlesBase"

    .line 211
    .line 212
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v24

    .line 216
    const-string v12, "ipLookupUrl"

    .line 217
    .line 218
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v25

    .line 222
    const-string v12, "vidcoreBase"

    .line 223
    .line 224
    invoke-static {v0, v12}, Landroid/support/v4/media/session/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v26

    .line 228
    move-object/from16 v16, v19

    .line 229
    .line 230
    move-object/from16 v19, v2

    .line 231
    .line 232
    new-instance v2, Lb5/i;

    .line 233
    .line 234
    move-object/from16 v12, v18

    .line 235
    .line 236
    move-object/from16 v18, v1

    .line 237
    .line 238
    invoke-direct/range {v2 .. v26}, Lb5/i;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-object v2
.end method
