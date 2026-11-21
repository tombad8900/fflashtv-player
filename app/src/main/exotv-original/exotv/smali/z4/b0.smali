.class public final Lz4/b0;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Li7/m;

.field public final synthetic b:Ljava/util/LinkedHashSet;

.field public final synthetic c:Landroid/os/Handler;

.field public final synthetic d:Lz6/n;

.field public final synthetic e:Lz4/o;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lz6/l;

.field public final synthetic i:Lz4/z;

.field public final synthetic j:Lz6/k;


# direct methods
.method public constructor <init>(Li7/m;Ljava/util/LinkedHashSet;Landroid/os/Handler;Lz6/n;Lz4/o;ILjava/lang/String;Lz6/l;Lz4/z;Lz6/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/b0;->a:Li7/m;

    .line 2
    .line 3
    iput-object p2, p0, Lz4/b0;->b:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    iput-object p3, p0, Lz4/b0;->c:Landroid/os/Handler;

    .line 6
    .line 7
    iput-object p4, p0, Lz4/b0;->d:Lz6/n;

    .line 8
    .line 9
    iput-object p5, p0, Lz4/b0;->e:Lz4/o;

    .line 10
    .line 11
    iput p6, p0, Lz4/b0;->f:I

    .line 12
    .line 13
    iput-object p7, p0, Lz4/b0;->g:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p8, p0, Lz4/b0;->h:Lz6/l;

    .line 16
    .line 17
    iput-object p9, p0, Lz4/b0;->i:Lz4/z;

    .line 18
    .line 19
    iput-object p10, p0, Lz4/b0;->j:Lz6/k;

    .line 20
    .line 21
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lz4/b0;->d:Lz6/n;

    .line 12
    .line 13
    iput-object p2, v0, Lz6/n;->j:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p2, p0, Lz4/b0;->e:Lz4/o;

    .line 16
    .line 17
    iget v0, p0, Lz4/b0;->f:I

    .line 18
    .line 19
    invoke-static {p2, v0, p1}, Lz4/e0;->l(Lz4/o;ILandroid/webkit/WebView;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    const-string p3, "view"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "url"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Lz4/b0;->d:Lz6/n;

    .line 12
    .line 13
    iput-object p2, p3, Lz6/n;->j:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p2, p0, Lz4/b0;->e:Lz4/o;

    .line 16
    .line 17
    iget p3, p0, Lz4/b0;->f:I

    .line 18
    .line 19
    invoke-static {p2, p3, p1}, Lz4/e0;->l(Lz4/o;ILandroid/webkit/WebView;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 9

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lz4/b0;->a:Li7/m;

    .line 7
    .line 8
    invoke-virtual {p1}, Li7/a1;->E()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    if-eqz p3, :cond_8

    .line 17
    .line 18
    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    const/16 v0, 0x190

    .line 23
    .line 24
    const-string v1, "ResolverChain"

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    iget-object v3, p0, Lz4/b0;->c:Landroid/os/Handler;

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ne v4, v2, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x193

    .line 38
    .line 39
    sget-object v5, Lm6/p;->j:Lm6/p;

    .line 40
    .line 41
    iget-object v6, p0, Lz4/b0;->d:Lz6/n;

    .line 42
    .line 43
    const/16 v7, 0x5a

    .line 44
    .line 45
    const-string v8, "toString(...)"

    .line 46
    .line 47
    if-eq p3, v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x19a

    .line 50
    .line 51
    if-ne p3, v4, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    if-lt p3, v0, :cond_8

    .line 55
    .line 56
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {v8, p2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v7, p2}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v2, "missing page (HTTP "

    .line 74
    .line 75
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p3, "): "

    .line 82
    .line 83
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v3, v6, v5}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_2
    :goto_0
    iget-object v0, p0, Lz4/b0;->j:Lz6/k;

    .line 101
    .line 102
    iput-boolean v2, v0, Lz6/k;->j:Z

    .line 103
    .line 104
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-static {v8, p2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v7, p2}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v2, "refused with HTTP "

    .line 122
    .line 123
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p3, ": "

    .line 130
    .line 131
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v3, v6, v5}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    const/4 p1, 0x0

    .line 149
    if-eqz p2, :cond_4

    .line 150
    .line 151
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    if-eqz p2, :cond_4

    .line 156
    .line 157
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    goto :goto_1

    .line 162
    :cond_4
    move-object p2, p1

    .line 163
    :goto_1
    iget-object v4, p0, Lz4/b0;->e:Lz4/o;

    .line 164
    .line 165
    sget-object v5, Lz4/o;->l:Lz4/o;

    .line 166
    .line 167
    if-ne v4, v5, :cond_8

    .line 168
    .line 169
    if-lt p3, v0, :cond_8

    .line 170
    .line 171
    sget-object v0, Lz4/g0;->a:Lz4/g0;

    .line 172
    .line 173
    invoke-static {p2}, Lz4/g0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    const/4 v4, 0x0

    .line 178
    if-nez v0, :cond_5

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    iget-object v5, p0, Lz4/b0;->g:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v5}, Lz4/g0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    if-nez v5, :cond_6

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    :goto_2
    if-eqz v4, :cond_8

    .line 195
    .line 196
    iget-object v0, p0, Lz4/b0;->h:Lz6/l;

    .line 197
    .line 198
    iget v4, v0, Lz6/l;->j:I

    .line 199
    .line 200
    add-int/2addr v4, v2

    .line 201
    iput v4, v0, Lz6/l;->j:I

    .line 202
    .line 203
    if-eqz p2, :cond_7

    .line 204
    .line 205
    const/16 p1, 0x50

    .line 206
    .line 207
    invoke-static {p1, p2}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v0, "backup refused one of its calls: HTTP "

    .line 214
    .line 215
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string p3, " "

    .line 222
    .line 223
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Lz4/b0;->i:Lz4/z;

    .line 237
    .line 238
    invoke-virtual {v3, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 239
    .line 240
    .line 241
    const-wide/16 p2, 0x1f40

    .line 242
    .line 243
    invoke-virtual {v3, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 244
    .line 245
    .line 246
    :cond_8
    :goto_3
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "req"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "toString(...)"

    .line 20
    .line 21
    invoke-static {p2, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p2, Lz4/g0;->e:Lh7/f;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lh7/f;->a(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    new-instance p2, Lorg/json/JSONArray;

    .line 33
    .line 34
    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lz4/b0;->c:Landroid/os/Handler;

    .line 41
    .line 42
    iget-object v0, p0, Lz4/b0;->d:Lz6/n;

    .line 43
    .line 44
    iget-object v1, p0, Lz4/b0;->a:Li7/m;

    .line 45
    .line 46
    iget-object v2, p0, Lz4/b0;->b:Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    invoke-static {v1, v2, p1, v0, p2}, Lz4/e0;->m(Li7/m;Ljava/util/LinkedHashSet;Landroid/os/Handler;Lz6/n;Lorg/json/JSONArray;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return p1
.end method
