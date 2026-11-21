.class public final Lz4/e0;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic A:Lz6/n;

.field public final synthetic B:Lc5/b;

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:J

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Li7/m;

.field public final synthetic s:Lz4/o;

.field public final synthetic t:Lz6/l;

.field public final synthetic u:Lz6/n;

.field public final synthetic v:Ljava/util/LinkedHashSet;

.field public final synthetic w:I

.field public final synthetic x:Lz6/k;

.field public final synthetic y:Ljava/util/ArrayList;

.field public final synthetic z:Lz6/n;


# direct methods
.method public constructor <init>(JLjava/lang/String;Li7/m;Lz4/o;Lz6/l;Lz6/n;Ljava/util/LinkedHashSet;ILz6/k;Ljava/util/ArrayList;Lz6/n;Lz6/n;Lc5/b;Lp6/c;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lz4/e0;->p:J

    .line 2
    .line 3
    iput-object p3, p0, Lz4/e0;->q:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lz4/e0;->r:Li7/m;

    .line 6
    .line 7
    iput-object p5, p0, Lz4/e0;->s:Lz4/o;

    .line 8
    .line 9
    iput-object p6, p0, Lz4/e0;->t:Lz6/l;

    .line 10
    .line 11
    iput-object p7, p0, Lz4/e0;->u:Lz6/n;

    .line 12
    .line 13
    iput-object p8, p0, Lz4/e0;->v:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    iput p9, p0, Lz4/e0;->w:I

    .line 16
    .line 17
    iput-object p10, p0, Lz4/e0;->x:Lz6/k;

    .line 18
    .line 19
    iput-object p11, p0, Lz4/e0;->y:Ljava/util/ArrayList;

    .line 20
    .line 21
    iput-object p12, p0, Lz4/e0;->z:Lz6/n;

    .line 22
    .line 23
    iput-object p13, p0, Lz4/e0;->A:Lz6/n;

    .line 24
    .line 25
    iput-object p14, p0, Lz4/e0;->B:Lc5/b;

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    invoke-direct {p0, p1, p15}, Lr6/h;-><init>(ILp6/c;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final l(Lz4/o;ILandroid/webkit/WebView;)V
    .locals 2

    .line 1
    sget-object v0, Lz4/o;->l:Lz4/o;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-string p0, "true"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p0, "false"

    .line 9
    .line 10
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "window.__exoStallTicks = "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, "; window.__exoNoHops = "

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, "; true;"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-virtual {p2, p0, p1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lz4/g0;->f:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p2, p0, p1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lz4/g0;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p2, p0, p1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lz4/g0;->h:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p2, p0, p1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static final m(Li7/m;Ljava/util/LinkedHashSet;Landroid/os/Handler;Lz6/n;Lorg/json/JSONArray;)V
    .locals 6

    .line 1
    if-eqz p4, :cond_3

    .line 2
    .line 3
    invoke-virtual {p0}, Li7/a1;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p4}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v2, v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p4, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string v5, "http"

    .line 27
    .line 28
    invoke-static {v4, v5, v1}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    sget-object v5, Lz4/g0;->e:Lh7/f;

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Lh7/f;->a(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    if-lez v3, :cond_3

    .line 54
    .line 55
    invoke-static {p1}, Lm6/h;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p0, p2, p3, p1}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    return-void
.end method

.method public static final n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V
    .locals 7

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Li7/a1;

    .line 3
    .line 4
    invoke-virtual {v0}, Li7/a1;->E()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lz4/n;

    .line 16
    .line 17
    iget-object p1, p2, Lz6/n;->j:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, p1

    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    const-string p1, "User-Agent"

    .line 23
    .line 24
    const-string p2, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"

    .line 25
    .line 26
    invoke-static {p1, p2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string p1, "singletonMap(...)"

    .line 31
    .line 32
    invoke-static {p1, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v2, p3

    .line 38
    invoke-direct/range {v1 .. v6}, Lz4/n;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast p0, Li7/m;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Li7/a1;->G(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final o(Landroid/webkit/WebView;Lc5/b;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Lc5/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ll6/d;

    .line 6
    .line 7
    const-string v1, "Referer"

    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ll6/d;

    .line 13
    .line 14
    const-string v1, "User-Agent"

    .line 15
    .line 16
    const-string v2, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"

    .line 17
    .line 18
    invoke-direct {p1, v1, v2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    filled-new-array {v0, p1}, [Ll6/d;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lm6/s;->U([Ll6/d;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/webkit/WebView;

    .line 2
    .line 3
    check-cast p2, Lp6/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lz4/e0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lz4/e0;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lz4/e0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lz4/e0;

    .line 4
    .line 5
    iget-object v14, v0, Lz4/e0;->A:Lz6/n;

    .line 6
    .line 7
    iget-object v15, v0, Lz4/e0;->B:Lc5/b;

    .line 8
    .line 9
    iget-wide v2, v0, Lz4/e0;->p:J

    .line 10
    .line 11
    iget-object v4, v0, Lz4/e0;->q:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v5, v0, Lz4/e0;->r:Li7/m;

    .line 14
    .line 15
    iget-object v6, v0, Lz4/e0;->s:Lz4/o;

    .line 16
    .line 17
    iget-object v7, v0, Lz4/e0;->t:Lz6/l;

    .line 18
    .line 19
    iget-object v8, v0, Lz4/e0;->u:Lz6/n;

    .line 20
    .line 21
    iget-object v9, v0, Lz4/e0;->v:Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    iget v10, v0, Lz4/e0;->w:I

    .line 24
    .line 25
    iget-object v11, v0, Lz4/e0;->x:Lz6/k;

    .line 26
    .line 27
    iget-object v12, v0, Lz4/e0;->y:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v13, v0, Lz4/e0;->z:Lz6/n;

    .line 30
    .line 31
    move-object/from16 v16, p2

    .line 32
    .line 33
    invoke-direct/range {v1 .. v16}, Lz4/e0;-><init>(JLjava/lang/String;Li7/m;Lz4/o;Lz6/l;Lz6/n;Ljava/util/LinkedHashSet;ILz6/k;Ljava/util/ArrayList;Lz6/n;Lz6/n;Lc5/b;Lp6/c;)V

    .line 34
    .line 35
    .line 36
    move-object v2, v1

    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    iput-object v1, v2, Lz4/e0;->o:Ljava/lang/Object;

    .line 40
    .line 41
    return-object v2
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 4
    .line 5
    iget v2, v0, Lz4/e0;->n:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v1

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, Lz4/e0;->o:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v12, v2

    .line 30
    check-cast v12, Landroid/webkit/WebView;

    .line 31
    .line 32
    new-instance v5, Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v5, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v12}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v4, "getSettings(...)"

    .line 46
    .line 47
    invoke-static {v4, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 63
    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 67
    .line 68
    .line 69
    const-string v4, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"

    .line 70
    .line 71
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2, v3}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2, v12, v3}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 86
    .line 87
    .line 88
    new-instance v4, Lz4/z;

    .line 89
    .line 90
    iget-object v14, v0, Lz4/e0;->r:Li7/m;

    .line 91
    .line 92
    iget-object v6, v0, Lz4/e0;->s:Lz4/o;

    .line 93
    .line 94
    iget-object v7, v0, Lz4/e0;->t:Lz6/l;

    .line 95
    .line 96
    iget-object v9, v0, Lz4/e0;->u:Lz6/n;

    .line 97
    .line 98
    move-object v8, v5

    .line 99
    move-object v5, v14

    .line 100
    invoke-direct/range {v4 .. v9}, Lz4/z;-><init>(Li7/m;Lz4/o;Lz6/l;Landroid/os/Handler;Lz6/n;)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v21, v7

    .line 104
    .line 105
    move-object/from16 v16, v8

    .line 106
    .line 107
    move-object/from16 v17, v9

    .line 108
    .line 109
    new-instance v13, Lz4/b0;

    .line 110
    .line 111
    iget v2, v0, Lz4/e0;->w:I

    .line 112
    .line 113
    iget-object v14, v0, Lz4/e0;->v:Ljava/util/LinkedHashSet;

    .line 114
    .line 115
    iget-object v7, v0, Lz4/e0;->q:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v8, v0, Lz4/e0;->x:Lz6/k;

    .line 118
    .line 119
    move/from16 v19, v2

    .line 120
    .line 121
    move-object/from16 v22, v4

    .line 122
    .line 123
    move-object/from16 v18, v6

    .line 124
    .line 125
    move-object/from16 v20, v7

    .line 126
    .line 127
    move-object/from16 v23, v8

    .line 128
    .line 129
    move-object v15, v14

    .line 130
    move-object v14, v5

    .line 131
    invoke-direct/range {v13 .. v23}, Lz4/b0;-><init>(Li7/m;Ljava/util/LinkedHashSet;Landroid/os/Handler;Lz6/n;Lz4/o;ILjava/lang/String;Lz6/l;Lz4/z;Lz6/k;)V

    .line 132
    .line 133
    .line 134
    move-object v14, v15

    .line 135
    move-object/from16 v2, v20

    .line 136
    .line 137
    move-object/from16 v6, v23

    .line 138
    .line 139
    invoke-virtual {v12, v13}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 140
    .line 141
    .line 142
    new-instance v4, Lz4/d0;

    .line 143
    .line 144
    iget-object v10, v0, Lz4/e0;->z:Lz6/n;

    .line 145
    .line 146
    iget-object v11, v0, Lz4/e0;->A:Lz6/n;

    .line 147
    .line 148
    iget-object v9, v0, Lz4/e0;->y:Ljava/util/ArrayList;

    .line 149
    .line 150
    iget-object v13, v0, Lz4/e0;->B:Lc5/b;

    .line 151
    .line 152
    move-object v8, v5

    .line 153
    move-object/from16 v5, v16

    .line 154
    .line 155
    move-object/from16 v7, v17

    .line 156
    .line 157
    invoke-direct/range {v4 .. v14}, Lz4/d0;-><init>(Landroid/os/Handler;Lz6/k;Lz6/n;Li7/m;Ljava/util/ArrayList;Lz6/n;Lz6/n;Landroid/webkit/WebView;Lc5/b;Ljava/util/LinkedHashSet;)V

    .line 158
    .line 159
    .line 160
    move-object v5, v8

    .line 161
    const-string v6, "ExoBridge"

    .line 162
    .line 163
    invoke-virtual {v12, v4, v6}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    new-instance v4, Lz4/a0;

    .line 167
    .line 168
    iget-wide v7, v0, Lz4/e0;->p:J

    .line 169
    .line 170
    move-object/from16 v9, v16

    .line 171
    .line 172
    move-object/from16 v10, v17

    .line 173
    .line 174
    move-object/from16 v6, v18

    .line 175
    .line 176
    invoke-direct/range {v4 .. v10}, Lz4/a0;-><init>(Li7/m;Lz4/o;JLandroid/os/Handler;Lz6/n;)V

    .line 177
    .line 178
    .line 179
    move-object v14, v5

    .line 180
    move-object v5, v9

    .line 181
    invoke-virtual {v5, v4, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 182
    .line 183
    .line 184
    invoke-static {v12, v13, v2}, Lz4/e0;->o(Landroid/webkit/WebView;Lc5/b;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    iput v3, v0, Lz4/e0;->n:I

    .line 188
    .line 189
    invoke-virtual {v14, v0}, Li7/m;->T(Lr6/c;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-ne v2, v1, :cond_2

    .line 194
    .line 195
    return-object v1

    .line 196
    :cond_2
    return-object v2
.end method
