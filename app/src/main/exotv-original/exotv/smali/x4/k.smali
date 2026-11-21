.class public final Lx4/k;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lx4/k;

.field public static final b:Lh7/f;

.field public static final c:Lokhttp3/e0;

.field public static final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx4/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx4/k;->a:Lx4/k;

    .line 7
    .line 8
    new-instance v0, Lh7/f;

    .line 9
    .line 10
    const-string v1, "^[\\w-]+(\\.[\\w-]+)+$"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lx4/k;->b:Lh7/f;

    .line 16
    .line 17
    new-instance v0, Lokhttp3/e0$a;

    .line 18
    .line 19
    invoke-direct {v0}, Lokhttp3/e0$a;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 23
    .line 24
    const-wide/16 v2, 0xf

    .line 25
    .line 26
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/e0$a;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-wide/16 v2, 0x19

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/e0$a;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide/16 v2, 0x28

    .line 37
    .line 38
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/e0$a;->callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Lokhttp3/e0$a;->followRedirects(Z)Lokhttp3/e0$a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lokhttp3/e0$a;->build()Lokhttp3/e0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lx4/k;->c:Lokhttp3/e0;

    .line 52
    .line 53
    const-string v0, "window.CFG"

    .line 54
    .line 55
    const-string v1, "window.CONFIG"

    .line 56
    .line 57
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lx4/k;->d:Ljava/util/List;

    .line 66
    .line 67
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0;
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/g0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/g0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "User-Agent"

    .line 16
    .line 17
    const-string v2, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"

    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "Referer"

    .line 32
    .line 33
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p0, v1, v0}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {p0}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public static c(Ljava/lang/String;Lz4/q;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v5, Lx4/f;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v5, v0, v2, v1}, Lx4/f;-><init>(ILp6/c;I)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lx4/d;->j:Lx4/d;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    sget-object v0, Lx4/k;->a:Lx4/k;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    move-object v6, p1

    .line 17
    invoke-virtual/range {v0 .. v6}, Lx4/k;->b(Lx4/d;Ljava/lang/String;IILy6/q;Lr6/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static d(Ljava/lang/String;IILz4/q;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v5, Lx4/f;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v5, v0, v2, v1}, Lx4/f;-><init>(ILp6/c;I)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lx4/d;->k:Lx4/d;

    .line 10
    .line 11
    sget-object v0, Lx4/k;->a:Lx4/k;

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    move v3, p1

    .line 15
    move v4, p2

    .line 16
    move-object v6, p3

    .line 17
    invoke-virtual/range {v0 .. v6}, Lx4/k;->b(Lx4/d;Ljava/lang/String;IILy6/q;Lr6/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 2
    .line 3
    sget-object v0, Lo7/d;->l:Lo7/d;

    .line 4
    .line 5
    new-instance v1, Lx4/i;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, p1, v2, v3}, Lx4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lp6/c;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p2}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 2
    .line 3
    sget-object v0, Lo7/d;->l:Lo7/d;

    .line 4
    .line 5
    new-instance v1, Lx4/i;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v3, v2}, Lx4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lp6/c;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const/16 v0, 0x5c

    .line 2
    .line 3
    invoke-static {p0, v0}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v2, v3, :cond_8

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ne v3, v0, :cond_7

    .line 31
    .line 32
    add-int/lit8 v4, v2, 0x1

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-lt v4, v5, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/16 v4, 0x6e

    .line 46
    .line 47
    if-eq v3, v4, :cond_6

    .line 48
    .line 49
    const/16 v4, 0x72

    .line 50
    .line 51
    if-eq v3, v4, :cond_5

    .line 52
    .line 53
    const/16 v4, 0x74

    .line 54
    .line 55
    if-eq v3, v4, :cond_4

    .line 56
    .line 57
    const/16 v4, 0x75

    .line 58
    .line 59
    if-eq v3, v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :goto_1
    add-int/lit8 v2, v2, 0x2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    add-int/lit8 v4, v2, 0x2

    .line 68
    .line 69
    add-int/lit8 v5, v2, 0x6

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const-string v5, "substring(...)"

    .line 84
    .line 85
    invoke-static {v5, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const/16 v5, 0x10

    .line 89
    .line 90
    invoke-static {v5, v4}, Lh7/o;->j0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eqz v5, :cond_3

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    int-to-char v3, v3

    .line 101
    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    add-int/lit8 v3, v3, 0x2

    .line 109
    .line 110
    add-int/2addr v2, v3

    .line 111
    goto :goto_0

    .line 112
    :cond_4
    const/16 v3, 0x9

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const/16 v3, 0xd

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    const/16 v3, 0xa

    .line 125
    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_7
    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const-string v0, "toString(...)"

    .line 141
    .line 142
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-object p0
.end method


# virtual methods
.method public final b(Lx4/d;Ljava/lang/String;IILy6/q;Lr6/c;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    instance-of v5, v4, Lx4/g;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v4

    .line 16
    check-cast v5, Lx4/g;

    .line 17
    .line 18
    iget v6, v5, Lx4/g;->u:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, Lx4/g;->u:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v5, Lx4/g;

    .line 31
    .line 32
    invoke-direct {v5, v0, v4}, Lx4/g;-><init>(Lx4/k;Lr6/c;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v4, v5, Lx4/g;->s:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v6, Lq6/a;->j:Lq6/a;

    .line 38
    .line 39
    iget v7, v5, Lx4/g;->u:I

    .line 40
    .line 41
    const-string v9, "stream_urls"

    .line 42
    .line 43
    const-string v10, ""

    .line 44
    .line 45
    const-string v11, "compile(...)"

    .line 46
    .line 47
    const/16 v13, 0x5a

    .line 48
    .line 49
    const-string v15, "/"

    .line 50
    .line 51
    const/16 p6, 0x2f

    .line 52
    .line 53
    const-string v14, "null"

    .line 54
    .line 55
    const/16 v16, 0x0

    .line 56
    .line 57
    const/4 v12, 0x1

    .line 58
    packed-switch v7, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :pswitch_0
    iget-object v1, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lorg/json/JSONObject;

    .line 72
    .line 73
    iget-object v2, v5, Lx4/g;->o:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v3, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Ljava/lang/String;

    .line 78
    .line 79
    iget-object v5, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v5, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 v9, 0x0

    .line 87
    goto/16 :goto_2b

    .line 88
    .line 89
    :pswitch_1
    iget-object v1, v5, Lx4/g;->r:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v2, v5, Lx4/g;->q:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v3, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Lorg/json/JSONObject;

    .line 96
    .line 97
    iget-object v7, v5, Lx4/g;->o:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v11, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v11, Ly6/q;

    .line 102
    .line 103
    iget-object v13, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v13, Lx4/k;

    .line 106
    .line 107
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object/from16 p6, v2

    .line 111
    .line 112
    move-object v2, v1

    .line 113
    move-object/from16 v1, p6

    .line 114
    .line 115
    move-object v0, v4

    .line 116
    move-object v4, v9

    .line 117
    move-object/from16 p6, v10

    .line 118
    .line 119
    goto/16 :goto_26

    .line 120
    .line 121
    :pswitch_2
    iget-object v1, v5, Lx4/g;->q:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v2, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, Lorg/json/JSONObject;

    .line 126
    .line 127
    iget-object v3, v5, Lx4/g;->o:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v7, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v7, Ly6/q;

    .line 132
    .line 133
    iget-object v13, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v13, Lx4/k;

    .line 136
    .line 137
    :try_start_0
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    .line 140
    move-object/from16 v19, v9

    .line 141
    .line 142
    move-object/from16 p6, v10

    .line 143
    .line 144
    goto/16 :goto_18

    .line 145
    .line 146
    :catch_0
    move-object/from16 v19, v9

    .line 147
    .line 148
    move-object/from16 p6, v10

    .line 149
    .line 150
    goto/16 :goto_1a

    .line 151
    .line 152
    :pswitch_3
    iget-object v1, v5, Lx4/g;->q:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v2, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v2, Lorg/json/JSONObject;

    .line 157
    .line 158
    iget-object v3, v5, Lx4/g;->o:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v7, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v7, Ly6/q;

    .line 163
    .line 164
    iget-object v13, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v13, Lx4/k;

    .line 167
    .line 168
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object/from16 v19, v9

    .line 172
    .line 173
    move-object/from16 p6, v10

    .line 174
    .line 175
    goto/16 :goto_17

    .line 176
    .line 177
    :pswitch_4
    iget-object v1, v5, Lx4/g;->o:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v2, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v2, Ly6/q;

    .line 182
    .line 183
    iget-object v3, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v3, Lx4/k;

    .line 186
    .line 187
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_7

    .line 191
    .line 192
    :pswitch_5
    iget-object v1, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, Ljava/lang/String;

    .line 195
    .line 196
    iget-object v2, v5, Lx4/g;->o:Ljava/lang/String;

    .line 197
    .line 198
    iget-object v3, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v3, Ly6/q;

    .line 201
    .line 202
    iget-object v7, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v7, Lx4/k;

    .line 205
    .line 206
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_6

    .line 210
    .line 211
    :pswitch_6
    iget-object v1, v5, Lx4/g;->o:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v2, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, Ly6/q;

    .line 216
    .line 217
    iget-object v3, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v3, Lx4/k;

    .line 220
    .line 221
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_4

    .line 225
    .line 226
    :pswitch_7
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    sget-object v4, Lb5/h;->a:Lb5/i;

    .line 230
    .line 231
    if-eqz v4, :cond_1

    .line 232
    .line 233
    iget-object v4, v4, Lb5/i;->s:Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v4, :cond_1

    .line 236
    .line 237
    new-array v7, v12, [C

    .line 238
    .line 239
    aput-char p6, v7, v16

    .line 240
    .line 241
    invoke-static {v4, v7}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    if-eqz v4, :cond_1

    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    if-lez v7, :cond_1

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_1
    const/4 v4, 0x0

    .line 255
    :goto_1
    if-eqz v4, :cond_40

    .line 256
    .line 257
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-eqz v7, :cond_3

    .line 262
    .line 263
    if-ne v7, v12, :cond_2

    .line 264
    .line 265
    new-instance v7, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string v8, "/embed/tv/"

    .line 274
    .line 275
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    goto :goto_2

    .line 298
    :cond_2
    new-instance v1, La1/u;

    .line 299
    .line 300
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 301
    .line 302
    .line 303
    throw v1

    .line 304
    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v8, "/embed/movie/"

    .line 313
    .line 314
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-eqz v8, :cond_5

    .line 329
    .line 330
    if-ne v8, v12, :cond_4

    .line 331
    .line 332
    new-instance v8, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v4, "/vs_src.php?type=tv&id="

    .line 341
    .line 342
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    const-string v1, "&season="

    .line 349
    .line 350
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v1, "&episode="

    .line 357
    .line 358
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    goto :goto_3

    .line 369
    :cond_4
    new-instance v1, La1/u;

    .line 370
    .line 371
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 372
    .line 373
    .line 374
    throw v1

    .line 375
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    const-string v3, "/vs_src.php?type=movie&id="

    .line 384
    .line 385
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    :goto_3
    iput-object v0, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 396
    .line 397
    move-object/from16 v2, p5

    .line 398
    .line 399
    iput-object v2, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 400
    .line 401
    iput-object v7, v5, Lx4/g;->o:Ljava/lang/String;

    .line 402
    .line 403
    iput v12, v5, Lx4/g;->u:I

    .line 404
    .line 405
    invoke-static {v1, v7, v5}, Lx4/k;->e(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    if-ne v4, v6, :cond_6

    .line 410
    .line 411
    goto/16 :goto_2a

    .line 412
    .line 413
    :cond_6
    move-object v3, v0

    .line 414
    move-object v1, v7

    .line 415
    :goto_4
    check-cast v4, Lorg/json/JSONObject;

    .line 416
    .line 417
    const-string v7, "src"

    .line 418
    .line 419
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 427
    .line 428
    .line 429
    move-result v7

    .line 430
    if-lez v7, :cond_7

    .line 431
    .line 432
    invoke-virtual {v4, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    if-nez v7, :cond_7

    .line 437
    .line 438
    goto :goto_5

    .line 439
    :cond_7
    const/4 v4, 0x0

    .line 440
    :goto_5
    if-eqz v4, :cond_3f

    .line 441
    .line 442
    new-instance v7, Ljava/lang/Integer;

    .line 443
    .line 444
    invoke-direct {v7, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 445
    .line 446
    .line 447
    invoke-static {v13, v4}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    iput-object v3, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 452
    .line 453
    iput-object v2, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 454
    .line 455
    iput-object v1, v5, Lx4/g;->o:Ljava/lang/String;

    .line 456
    .line 457
    iput-object v4, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 458
    .line 459
    const/4 v13, 0x2

    .line 460
    iput v13, v5, Lx4/g;->u:I

    .line 461
    .line 462
    invoke-interface {v2, v7, v8, v5}, Ly6/q;->b(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    if-ne v7, v6, :cond_8

    .line 467
    .line 468
    goto/16 :goto_2a

    .line 469
    .line 470
    :cond_8
    move-object v7, v3

    .line 471
    move-object v3, v2

    .line 472
    move-object v2, v1

    .line 473
    move-object v1, v4

    .line 474
    :goto_6
    iput-object v7, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 475
    .line 476
    iput-object v3, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 477
    .line 478
    iput-object v1, v5, Lx4/g;->o:Ljava/lang/String;

    .line 479
    .line 480
    const/4 v4, 0x0

    .line 481
    iput-object v4, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 482
    .line 483
    const/4 v8, 0x3

    .line 484
    iput v8, v5, Lx4/g;->u:I

    .line 485
    .line 486
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    sget-object v8, Li7/e0;->a:Lo7/e;

    .line 490
    .line 491
    sget-object v8, Lo7/d;->l:Lo7/d;

    .line 492
    .line 493
    new-instance v13, Lx4/i;

    .line 494
    .line 495
    invoke-direct {v13, v1, v2, v4, v12}, Lx4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lp6/c;I)V

    .line 496
    .line 497
    .line 498
    invoke-static {v8, v13, v5}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    if-ne v4, v6, :cond_9

    .line 503
    .line 504
    goto/16 :goto_2a

    .line 505
    .line 506
    :cond_9
    move-object v2, v3

    .line 507
    move-object v3, v7

    .line 508
    :goto_7
    check-cast v4, Ljava/lang/String;

    .line 509
    .line 510
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    const-string v7, "html"

    .line 514
    .line 515
    invoke-static {v7, v4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    sget-object v7, Lx4/k;->d:Ljava/util/List;

    .line 519
    .line 520
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v8

    .line 528
    const-string v12, "substring(...)"

    .line 529
    .line 530
    if-eqz v8, :cond_16

    .line 531
    .line 532
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v8

    .line 536
    check-cast v8, Ljava/lang/String;

    .line 537
    .line 538
    move/from16 v0, v16

    .line 539
    .line 540
    const/4 v13, 0x6

    .line 541
    invoke-static {v4, v8, v0, v0, v13}, Lh7/h;->B0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 542
    .line 543
    .line 544
    move-result v8

    .line 545
    if-gez v8, :cond_a

    .line 546
    .line 547
    :goto_9
    move-object/from16 p3, v7

    .line 548
    .line 549
    :catch_1
    :goto_a
    const/4 v7, 0x0

    .line 550
    goto/16 :goto_e

    .line 551
    .line 552
    :cond_a
    const/16 v0, 0x7b

    .line 553
    .line 554
    const/4 v13, 0x4

    .line 555
    invoke-static {v4, v0, v8, v13}, Lh7/h;->A0(Ljava/lang/CharSequence;CII)I

    .line 556
    .line 557
    .line 558
    move-result v8

    .line 559
    if-gez v8, :cond_b

    .line 560
    .line 561
    goto :goto_9

    .line 562
    :cond_b
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 563
    .line 564
    .line 565
    move-result v13

    .line 566
    move v0, v8

    .line 567
    const/16 v19, 0x0

    .line 568
    .line 569
    const/16 v20, 0x0

    .line 570
    .line 571
    const/16 v21, 0x0

    .line 572
    .line 573
    :goto_b
    if-ge v0, v13, :cond_13

    .line 574
    .line 575
    move-object/from16 p3, v7

    .line 576
    .line 577
    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    .line 578
    .line 579
    .line 580
    move-result v7

    .line 581
    move/from16 p4, v0

    .line 582
    .line 583
    if-eqz v19, :cond_e

    .line 584
    .line 585
    if-eqz v20, :cond_c

    .line 586
    .line 587
    const/16 v20, 0x0

    .line 588
    .line 589
    goto :goto_c

    .line 590
    :cond_c
    const/16 v0, 0x5c

    .line 591
    .line 592
    if-ne v7, v0, :cond_d

    .line 593
    .line 594
    const/16 v20, 0x1

    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_d
    const/16 v0, 0x22

    .line 598
    .line 599
    if-ne v7, v0, :cond_12

    .line 600
    .line 601
    const/16 v19, 0x0

    .line 602
    .line 603
    goto :goto_c

    .line 604
    :cond_e
    const/16 v0, 0x22

    .line 605
    .line 606
    if-eq v7, v0, :cond_11

    .line 607
    .line 608
    const/16 v0, 0x7b

    .line 609
    .line 610
    if-eq v7, v0, :cond_10

    .line 611
    .line 612
    const/16 v0, 0x7d

    .line 613
    .line 614
    if-eq v7, v0, :cond_f

    .line 615
    .line 616
    goto :goto_c

    .line 617
    :cond_f
    add-int/lit8 v21, v21, -0x1

    .line 618
    .line 619
    if-nez v21, :cond_12

    .line 620
    .line 621
    add-int/lit8 v0, p4, 0x1

    .line 622
    .line 623
    invoke-virtual {v4, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-static {v12, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    goto :goto_d

    .line 631
    :cond_10
    add-int/lit8 v21, v21, 0x1

    .line 632
    .line 633
    goto :goto_c

    .line 634
    :cond_11
    const/16 v19, 0x1

    .line 635
    .line 636
    :cond_12
    :goto_c
    add-int/lit8 v0, p4, 0x1

    .line 637
    .line 638
    move-object/from16 v7, p3

    .line 639
    .line 640
    goto :goto_b

    .line 641
    :cond_13
    move-object/from16 p3, v7

    .line 642
    .line 643
    const/4 v0, 0x0

    .line 644
    :goto_d
    if-nez v0, :cond_14

    .line 645
    .line 646
    goto :goto_a

    .line 647
    :cond_14
    :try_start_1
    new-instance v7, Lorg/json/JSONObject;

    .line 648
    .line 649
    invoke-direct {v7, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 650
    .line 651
    .line 652
    :goto_e
    if-eqz v7, :cond_15

    .line 653
    .line 654
    goto :goto_f

    .line 655
    :cond_15
    move-object/from16 v0, p0

    .line 656
    .line 657
    move-object/from16 v7, p3

    .line 658
    .line 659
    const/4 v12, 0x1

    .line 660
    const/16 v16, 0x0

    .line 661
    .line 662
    goto/16 :goto_8

    .line 663
    .line 664
    :cond_16
    const/4 v7, 0x0

    .line 665
    :goto_f
    if-eqz v7, :cond_3e

    .line 666
    .line 667
    const-string v0, "playerUrl"

    .line 668
    .line 669
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 677
    .line 678
    .line 679
    move-result v4

    .line 680
    if-lez v4, :cond_17

    .line 681
    .line 682
    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    if-nez v4, :cond_17

    .line 687
    .line 688
    goto :goto_10

    .line 689
    :cond_17
    const/4 v0, 0x0

    .line 690
    :goto_10
    if-eqz v0, :cond_3d

    .line 691
    .line 692
    const-string v4, "base"

    .line 693
    .line 694
    invoke-static {v4, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 698
    .line 699
    .line 700
    move-result v4

    .line 701
    if-nez v4, :cond_18

    .line 702
    .line 703
    move-object v0, v1

    .line 704
    :goto_11
    move-object/from16 v19, v9

    .line 705
    .line 706
    move-object/from16 p6, v10

    .line 707
    .line 708
    goto/16 :goto_16

    .line 709
    .line 710
    :cond_18
    sget-object v4, Lh7/g;->k:Lh7/g;

    .line 711
    .line 712
    const/16 v17, 0x2

    .line 713
    .line 714
    invoke-static/range {v17 .. v17}, Ly5/f;->o(I)I

    .line 715
    .line 716
    .line 717
    move-result v4

    .line 718
    const-string v8, "^https?://"

    .line 719
    .line 720
    invoke-static {v8, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 721
    .line 722
    .line 723
    move-result-object v4

    .line 724
    invoke-static {v11, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 732
    .line 733
    .line 734
    move-result v4

    .line 735
    if-eqz v4, :cond_19

    .line 736
    .line 737
    const/4 v13, 0x0

    .line 738
    goto :goto_12

    .line 739
    :cond_19
    new-instance v4, Lh7/f;

    .line 740
    .line 741
    const-string v8, "^([a-z]+://[^/?#]+)(/[^?#]*)?"

    .line 742
    .line 743
    const/4 v13, 0x0

    .line 744
    invoke-direct {v4, v8, v13}, Lh7/f;-><init>(Ljava/lang/String;I)V

    .line 745
    .line 746
    .line 747
    invoke-static {v4, v1}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    if-nez v4, :cond_1a

    .line 752
    .line 753
    :goto_12
    goto :goto_11

    .line 754
    :cond_1a
    invoke-virtual {v4}, La1/e;->A()Ljava/util/List;

    .line 755
    .line 756
    .line 757
    move-result-object v8

    .line 758
    check-cast v8, Lh7/e;

    .line 759
    .line 760
    const/4 v13, 0x1

    .line 761
    invoke-virtual {v8, v13}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v8

    .line 765
    check-cast v8, Ljava/lang/String;

    .line 766
    .line 767
    const/4 v13, 0x0

    .line 768
    invoke-static {v0, v15, v13}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 769
    .line 770
    .line 771
    move-result v19

    .line 772
    if-eqz v19, :cond_1b

    .line 773
    .line 774
    invoke-static {v8, v0}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    goto :goto_11

    .line 779
    :cond_1b
    invoke-virtual {v4}, La1/e;->A()Ljava/util/List;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    const/4 v13, 0x2

    .line 784
    invoke-static {v13, v4}, Lm6/h;->C0(ILjava/util/List;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v4

    .line 788
    check-cast v4, Ljava/lang/String;

    .line 789
    .line 790
    if-nez v4, :cond_1c

    .line 791
    .line 792
    move-object v4, v10

    .line 793
    :cond_1c
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 794
    .line 795
    .line 796
    move-result v13

    .line 797
    if-nez v13, :cond_1d

    .line 798
    .line 799
    move-object v4, v10

    .line 800
    move/from16 v10, p6

    .line 801
    .line 802
    move-object/from16 p6, v4

    .line 803
    .line 804
    move-object v4, v15

    .line 805
    :goto_13
    move-object/from16 v19, v9

    .line 806
    .line 807
    const/4 v9, 0x0

    .line 808
    const/4 v13, 0x6

    .line 809
    goto :goto_14

    .line 810
    :cond_1d
    move-object v13, v10

    .line 811
    move/from16 v10, p6

    .line 812
    .line 813
    move-object/from16 p6, v13

    .line 814
    .line 815
    goto :goto_13

    .line 816
    :goto_14
    invoke-static {v4, v10, v9, v13}, Lh7/h;->E0(Ljava/lang/CharSequence;CII)I

    .line 817
    .line 818
    .line 819
    move-result v16

    .line 820
    move/from16 v20, v10

    .line 821
    .line 822
    const/4 v13, 0x1

    .line 823
    add-int/lit8 v10, v16, 0x1

    .line 824
    .line 825
    invoke-virtual {v4, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v4

    .line 829
    invoke-static {v12, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    new-instance v10, Ljava/util/ArrayList;

    .line 833
    .line 834
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    new-array v4, v13, [C

    .line 842
    .line 843
    aput-char v20, v4, v9

    .line 844
    .line 845
    invoke-static {v0, v4}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    :cond_1e
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 854
    .line 855
    .line 856
    move-result v4

    .line 857
    if-eqz v4, :cond_22

    .line 858
    .line 859
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v4

    .line 863
    check-cast v4, Ljava/lang/String;

    .line 864
    .line 865
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 866
    .line 867
    .line 868
    move-result v9

    .line 869
    if-nez v9, :cond_1f

    .line 870
    .line 871
    goto :goto_15

    .line 872
    :cond_1f
    const-string v9, "."

    .line 873
    .line 874
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v9

    .line 878
    if-eqz v9, :cond_20

    .line 879
    .line 880
    goto :goto_15

    .line 881
    :cond_20
    const-string v9, ".."

    .line 882
    .line 883
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v9

    .line 887
    if-eqz v9, :cond_21

    .line 888
    .line 889
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 890
    .line 891
    .line 892
    move-result v4

    .line 893
    if-nez v4, :cond_1e

    .line 894
    .line 895
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 896
    .line 897
    .line 898
    move-result v4

    .line 899
    const/16 v18, 0x1

    .line 900
    .line 901
    add-int/lit8 v4, v4, -0x1

    .line 902
    .line 903
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    goto :goto_15

    .line 907
    :cond_21
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    goto :goto_15

    .line 911
    :cond_22
    const/16 v25, 0x0

    .line 912
    .line 913
    const/16 v26, 0x3e

    .line 914
    .line 915
    const-string v22, "/"

    .line 916
    .line 917
    const/16 v23, 0x0

    .line 918
    .line 919
    const/16 v24, 0x0

    .line 920
    .line 921
    move-object/from16 v21, v10

    .line 922
    .line 923
    invoke-static/range {v21 .. v26}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    new-instance v4, Ljava/lang/StringBuilder;

    .line 928
    .line 929
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    :goto_16
    new-instance v4, Ljava/lang/Integer;

    .line 946
    .line 947
    const/4 v13, 0x2

    .line 948
    invoke-direct {v4, v13}, Ljava/lang/Integer;-><init>(I)V

    .line 949
    .line 950
    .line 951
    const/16 v8, 0x5a

    .line 952
    .line 953
    invoke-static {v8, v0}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v8

    .line 957
    iput-object v3, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 958
    .line 959
    iput-object v2, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 960
    .line 961
    iput-object v1, v5, Lx4/g;->o:Ljava/lang/String;

    .line 962
    .line 963
    iput-object v7, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 964
    .line 965
    iput-object v0, v5, Lx4/g;->q:Ljava/lang/String;

    .line 966
    .line 967
    const/4 v13, 0x4

    .line 968
    iput v13, v5, Lx4/g;->u:I

    .line 969
    .line 970
    invoke-interface {v2, v4, v8, v5}, Ly6/q;->b(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    if-ne v4, v6, :cond_23

    .line 975
    .line 976
    goto/16 :goto_2a

    .line 977
    .line 978
    :cond_23
    move-object v13, v7

    .line 979
    move-object v7, v2

    .line 980
    move-object v2, v13

    .line 981
    move-object v13, v3

    .line 982
    move-object v3, v1

    .line 983
    move-object v1, v0

    .line 984
    :goto_17
    :try_start_2
    iput-object v13, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 985
    .line 986
    iput-object v7, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 987
    .line 988
    iput-object v3, v5, Lx4/g;->o:Ljava/lang/String;

    .line 989
    .line 990
    iput-object v2, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 991
    .line 992
    iput-object v1, v5, Lx4/g;->q:Ljava/lang/String;

    .line 993
    .line 994
    const/4 v0, 0x5

    .line 995
    iput v0, v5, Lx4/g;->u:I

    .line 996
    .line 997
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 1001
    .line 1002
    sget-object v0, Lo7/d;->l:Lo7/d;

    .line 1003
    .line 1004
    new-instance v4, Lx4/i;

    .line 1005
    .line 1006
    const/4 v8, 0x1

    .line 1007
    const/4 v9, 0x0

    .line 1008
    invoke-direct {v4, v1, v3, v9, v8}, Lx4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lp6/c;I)V

    .line 1009
    .line 1010
    .line 1011
    invoke-static {v0, v4, v5}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    if-ne v4, v6, :cond_24

    .line 1016
    .line 1017
    goto/16 :goto_2a

    .line 1018
    .line 1019
    :cond_24
    :goto_18
    check-cast v4, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1020
    .line 1021
    :goto_19
    move-object v0, v3

    .line 1022
    move-object v3, v2

    .line 1023
    goto :goto_1b

    .line 1024
    :catch_2
    :goto_1a
    const/4 v4, 0x0

    .line 1025
    goto :goto_19

    .line 1026
    :goto_1b
    const-string v2, "metaApi"

    .line 1027
    .line 1028
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1036
    .line 1037
    .line 1038
    move-result v8

    .line 1039
    if-lez v8, :cond_25

    .line 1040
    .line 1041
    invoke-virtual {v2, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v8

    .line 1045
    if-nez v8, :cond_25

    .line 1046
    .line 1047
    goto :goto_1c

    .line 1048
    :cond_25
    const/4 v2, 0x0

    .line 1049
    :goto_1c
    if-nez v2, :cond_2a

    .line 1050
    .line 1051
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    if-nez v4, :cond_27

    .line 1055
    .line 1056
    :cond_26
    :goto_1d
    const/4 v2, 0x0

    .line 1057
    goto :goto_1e

    .line 1058
    :cond_27
    new-instance v2, Lh7/f;

    .line 1059
    .line 1060
    const-string v8, "\"metaApi\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)\""

    .line 1061
    .line 1062
    invoke-direct {v2, v8}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-static {v2, v4}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v2

    .line 1069
    if-nez v2, :cond_28

    .line 1070
    .line 1071
    goto :goto_1d

    .line 1072
    :cond_28
    invoke-virtual {v2}, La1/e;->A()Ljava/util/List;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v2

    .line 1076
    check-cast v2, Lh7/e;

    .line 1077
    .line 1078
    const/4 v8, 0x1

    .line 1079
    invoke-virtual {v2, v8}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    check-cast v2, Ljava/lang/String;

    .line 1084
    .line 1085
    invoke-static {v2}, Lx4/k;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1090
    .line 1091
    .line 1092
    move-result v8

    .line 1093
    if-lez v8, :cond_26

    .line 1094
    .line 1095
    :goto_1e
    if-eqz v2, :cond_29

    .line 1096
    .line 1097
    goto :goto_1f

    .line 1098
    :cond_29
    new-instance v0, Ljava/io/IOException;

    .line 1099
    .line 1100
    const-string v1, "window.CFG has no metaApi"

    .line 1101
    .line 1102
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1103
    .line 1104
    .line 1105
    throw v0

    .line 1106
    :cond_2a
    :goto_1f
    if-eqz v4, :cond_2c

    .line 1107
    .line 1108
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1109
    .line 1110
    .line 1111
    new-instance v8, Lh7/f;

    .line 1112
    .line 1113
    const-string v9, "\"apiToken\"\\s*:\\s*\"([^\"]+)\""

    .line 1114
    .line 1115
    invoke-direct {v8, v9}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 1116
    .line 1117
    .line 1118
    invoke-static {v8, v4}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v8

    .line 1122
    if-nez v8, :cond_2b

    .line 1123
    .line 1124
    goto :goto_20

    .line 1125
    :cond_2b
    invoke-virtual {v8}, La1/e;->A()Ljava/util/List;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v8

    .line 1129
    check-cast v8, Lh7/e;

    .line 1130
    .line 1131
    const/4 v9, 0x1

    .line 1132
    invoke-virtual {v8, v9}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v8

    .line 1136
    check-cast v8, Ljava/lang/String;

    .line 1137
    .line 1138
    invoke-static {v8}, Lx4/k;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v8

    .line 1142
    sget-object v9, Lx4/k;->b:Lh7/f;

    .line 1143
    .line 1144
    invoke-static {v8}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v10

    .line 1148
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v10

    .line 1152
    invoke-virtual {v9, v10}, Lh7/f;->c(Ljava/lang/String;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v9

    .line 1156
    if-eqz v9, :cond_2c

    .line 1157
    .line 1158
    goto :goto_21

    .line 1159
    :cond_2c
    :goto_20
    const/4 v8, 0x0

    .line 1160
    :goto_21
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    if-eqz v4, :cond_2e

    .line 1164
    .line 1165
    const-string v9, "\"rateLimited\"\\s*:\\s*true"

    .line 1166
    .line 1167
    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v9

    .line 1171
    invoke-static {v11, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v9, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v4

    .line 1178
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 1179
    .line 1180
    .line 1181
    move-result v4

    .line 1182
    if-nez v4, :cond_2d

    .line 1183
    .line 1184
    goto :goto_22

    .line 1185
    :cond_2d
    new-instance v0, Ljava/io/IOException;

    .line 1186
    .line 1187
    const-string v1, "site is rate limiting this connection (rateLimited); try again shortly"

    .line 1188
    .line 1189
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1190
    .line 1191
    .line 1192
    throw v0

    .line 1193
    :cond_2e
    :goto_22
    const/16 v4, 0x3f

    .line 1194
    .line 1195
    invoke-static {v2, v4}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v4

    .line 1199
    if-eqz v4, :cond_2f

    .line 1200
    .line 1201
    const-string v4, "&"

    .line 1202
    .line 1203
    goto :goto_23

    .line 1204
    :cond_2f
    const-string v4, "?"

    .line 1205
    .line 1206
    :goto_23
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v2

    .line 1210
    const-string v4, "stream_urls="

    .line 1211
    .line 1212
    const/4 v9, 0x0

    .line 1213
    invoke-static {v2, v4, v9}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v4

    .line 1217
    if-nez v4, :cond_30

    .line 1218
    .line 1219
    move-object/from16 v4, v19

    .line 1220
    .line 1221
    invoke-static {v2, v4}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    goto :goto_24

    .line 1226
    :cond_30
    move-object/from16 v4, v19

    .line 1227
    .line 1228
    :goto_24
    if-eqz v8, :cond_32

    .line 1229
    .line 1230
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1231
    .line 1232
    .line 1233
    move-result v9

    .line 1234
    if-nez v9, :cond_31

    .line 1235
    .line 1236
    goto :goto_25

    .line 1237
    :cond_31
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1238
    .line 1239
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1243
    .line 1244
    .line 1245
    const-string v2, "&api_token="

    .line 1246
    .line 1247
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v2

    .line 1257
    :cond_32
    :goto_25
    iput-object v13, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 1258
    .line 1259
    iput-object v7, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 1260
    .line 1261
    iput-object v0, v5, Lx4/g;->o:Ljava/lang/String;

    .line 1262
    .line 1263
    iput-object v3, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 1264
    .line 1265
    iput-object v1, v5, Lx4/g;->q:Ljava/lang/String;

    .line 1266
    .line 1267
    iput-object v8, v5, Lx4/g;->r:Ljava/lang/String;

    .line 1268
    .line 1269
    const/4 v9, 0x6

    .line 1270
    iput v9, v5, Lx4/g;->u:I

    .line 1271
    .line 1272
    invoke-static {v2, v1, v5}, Lx4/k;->e(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    if-ne v2, v6, :cond_33

    .line 1277
    .line 1278
    goto/16 :goto_2a

    .line 1279
    .line 1280
    :cond_33
    move-object v11, v7

    .line 1281
    move-object v7, v0

    .line 1282
    move-object v0, v2

    .line 1283
    move-object v2, v8

    .line 1284
    :goto_26
    check-cast v0, Lorg/json/JSONObject;

    .line 1285
    .line 1286
    const-string v8, "data"

    .line 1287
    .line 1288
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v8

    .line 1292
    if-nez v8, :cond_35

    .line 1293
    .line 1294
    const-string v1, "status_code"

    .line 1295
    .line 1296
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v2

    .line 1300
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    if-eqz v2, :cond_34

    .line 1304
    .line 1305
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v2

    .line 1309
    if-eqz v2, :cond_34

    .line 1310
    .line 1311
    invoke-static {v2}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    if-eqz v2, :cond_34

    .line 1316
    .line 1317
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1318
    .line 1319
    .line 1320
    move-result v2

    .line 1321
    const/16 v3, 0x194

    .line 1322
    .line 1323
    if-ne v2, v3, :cond_34

    .line 1324
    .line 1325
    new-instance v0, Lx4/e;

    .line 1326
    .line 1327
    const-string v1, "primary has no source for this title (404)"

    .line 1328
    .line 1329
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1330
    .line 1331
    .line 1332
    throw v0

    .line 1333
    :cond_34
    new-instance v2, Ljava/io/IOException;

    .line 1334
    .line 1335
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1340
    .line 1341
    const-string v3, "no source (status "

    .line 1342
    .line 1343
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1347
    .line 1348
    .line 1349
    const-string v0, ")"

    .line 1350
    .line 1351
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    throw v2

    .line 1362
    :cond_35
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    instance-of v0, v0, Lorg/json/JSONArray;

    .line 1367
    .line 1368
    const-string v4, "epLabel"

    .line 1369
    .line 1370
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v3

    .line 1374
    const-string v4, "optString(...)"

    .line 1375
    .line 1376
    invoke-static {v4, v3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1377
    .line 1378
    .line 1379
    invoke-static {v3}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v3

    .line 1383
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v3

    .line 1387
    const/4 v13, 0x1

    .line 1388
    new-array v4, v13, [C

    .line 1389
    .line 1390
    const/16 v9, 0xb7

    .line 1391
    .line 1392
    const/16 v16, 0x0

    .line 1393
    .line 1394
    aput-char v9, v4, v16

    .line 1395
    .line 1396
    invoke-static {v3, v4}, Lh7/h;->V0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v3

    .line 1400
    invoke-static {v3}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v3

    .line 1404
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v3

    .line 1408
    new-instance v4, Ljava/lang/Integer;

    .line 1409
    .line 1410
    const/4 v9, 0x3

    .line 1411
    invoke-direct {v4, v9}, Ljava/lang/Integer;-><init>(I)V

    .line 1412
    .line 1413
    .line 1414
    const-string v9, "title"

    .line 1415
    .line 1416
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v9

    .line 1420
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1421
    .line 1422
    .line 1423
    move-result v10

    .line 1424
    if-nez v10, :cond_36

    .line 1425
    .line 1426
    move-object/from16 v10, p6

    .line 1427
    .line 1428
    goto :goto_27

    .line 1429
    :cond_36
    const-string v10, "  ["

    .line 1430
    .line 1431
    const-string v12, "]"

    .line 1432
    .line 1433
    invoke-static {v10, v3, v12}, La1/a1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v10

    .line 1437
    :goto_27
    if-eqz v0, :cond_37

    .line 1438
    .line 1439
    const-string v0, "plain array"

    .line 1440
    .line 1441
    goto :goto_28

    .line 1442
    :cond_37
    const-string v0, "encrypted blob"

    .line 1443
    .line 1444
    :goto_28
    if-eqz v2, :cond_38

    .line 1445
    .line 1446
    const-string v3, " | token"

    .line 1447
    .line 1448
    goto :goto_29

    .line 1449
    :cond_38
    const-string v3, " | no token"

    .line 1450
    .line 1451
    :goto_29
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1452
    .line 1453
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1460
    .line 1461
    .line 1462
    const-string v9, " | "

    .line 1463
    .line 1464
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    iput-object v7, v5, Lx4/g;->m:Ljava/lang/Object;

    .line 1478
    .line 1479
    iput-object v1, v5, Lx4/g;->n:Ljava/lang/Object;

    .line 1480
    .line 1481
    iput-object v2, v5, Lx4/g;->o:Ljava/lang/String;

    .line 1482
    .line 1483
    iput-object v8, v5, Lx4/g;->p:Ljava/lang/Object;

    .line 1484
    .line 1485
    const/4 v9, 0x0

    .line 1486
    iput-object v9, v5, Lx4/g;->q:Ljava/lang/String;

    .line 1487
    .line 1488
    iput-object v9, v5, Lx4/g;->r:Ljava/lang/String;

    .line 1489
    .line 1490
    const/4 v3, 0x7

    .line 1491
    iput v3, v5, Lx4/g;->u:I

    .line 1492
    .line 1493
    invoke-interface {v11, v4, v0, v5}, Ly6/q;->b(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    if-ne v0, v6, :cond_39

    .line 1498
    .line 1499
    :goto_2a
    return-object v6

    .line 1500
    :cond_39
    move-object v3, v1

    .line 1501
    move-object v5, v7

    .line 1502
    move-object v1, v8

    .line 1503
    :goto_2b
    const-string v0, "file_name"

    .line 1504
    .line 1505
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v4

    .line 1509
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 1510
    .line 1511
    .line 1512
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1513
    .line 1514
    .line 1515
    move-result v0

    .line 1516
    if-nez v0, :cond_3a

    .line 1517
    .line 1518
    invoke-virtual {v4, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v0

    .line 1522
    if-nez v0, :cond_3a

    .line 1523
    .line 1524
    goto :goto_2c

    .line 1525
    :cond_3a
    move-object v4, v9

    .line 1526
    :goto_2c
    const-string v0, "imdb_id"

    .line 1527
    .line 1528
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 1533
    .line 1534
    .line 1535
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result v1

    .line 1539
    if-nez v1, :cond_3b

    .line 1540
    .line 1541
    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1542
    .line 1543
    .line 1544
    move-result v1

    .line 1545
    if-nez v1, :cond_3b

    .line 1546
    .line 1547
    goto :goto_2d

    .line 1548
    :cond_3b
    move-object v0, v9

    .line 1549
    :goto_2d
    if-eqz v0, :cond_3c

    .line 1550
    .line 1551
    const-string v1, "tt"

    .line 1552
    .line 1553
    invoke-static {v0, v1}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v8

    .line 1557
    goto :goto_2e

    .line 1558
    :cond_3c
    move-object v8, v9

    .line 1559
    :goto_2e
    new-instance v0, Lx4/c;

    .line 1560
    .line 1561
    move-object/from16 p1, v0

    .line 1562
    .line 1563
    move-object/from16 p6, v2

    .line 1564
    .line 1565
    move-object/from16 p3, v3

    .line 1566
    .line 1567
    move-object/from16 p4, v4

    .line 1568
    .line 1569
    move-object/from16 p2, v5

    .line 1570
    .line 1571
    move-object/from16 p5, v8

    .line 1572
    .line 1573
    invoke-direct/range {p1 .. p6}, Lx4/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1574
    .line 1575
    .line 1576
    return-object v0

    .line 1577
    :cond_3d
    new-instance v0, Ljava/io/IOException;

    .line 1578
    .line 1579
    const-string v1, "window.CFG has no playerUrl"

    .line 1580
    .line 1581
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1582
    .line 1583
    .line 1584
    throw v0

    .line 1585
    :cond_3e
    new-instance v0, Ljava/io/IOException;

    .line 1586
    .line 1587
    const-string v1, "window.CFG not found in landing HTML"

    .line 1588
    .line 1589
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1590
    .line 1591
    .line 1592
    throw v0

    .line 1593
    :cond_3f
    new-instance v0, Ljava/io/IOException;

    .line 1594
    .line 1595
    const-string v1, "no src in vs_src.php response"

    .line 1596
    .line 1597
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1598
    .line 1599
    .line 1600
    throw v0

    .line 1601
    :cond_40
    new-instance v0, Ljava/io/IOException;

    .line 1602
    .line 1603
    const-string v1, "no gateBase in the server config"

    .line 1604
    .line 1605
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1606
    .line 1607
    .line 1608
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(IILjava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p5, Lx4/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lx4/j;

    .line 7
    .line 8
    iget v1, v0, Lx4/j;->o:I

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
    iput v1, v0, Lx4/j;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx4/j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lx4/j;-><init>(Lx4/k;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lx4/j;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lx4/j;->o:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p5}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p5}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p5, Lb5/h;->a:Lb5/i;

    .line 54
    .line 55
    if-eqz p5, :cond_3

    .line 56
    .line 57
    iget-object p5, p5, Lb5/i;->u:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz p5, :cond_3

    .line 60
    .line 61
    invoke-static {p5}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    move-result-object p5

    .line 65
    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p5

    .line 69
    if-eqz p5, :cond_3

    .line 70
    .line 71
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-lez v2, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move-object p5, v4

    .line 79
    :goto_1
    if-eqz p5, :cond_d

    .line 80
    .line 81
    new-array v2, v3, [C

    .line 82
    .line 83
    const/16 v5, 0x2f

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    aput-char v5, v2, v6

    .line 87
    .line 88
    invoke-static {p5, v2}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p5

    .line 92
    if-nez p5, :cond_4

    .line 93
    .line 94
    goto/16 :goto_7

    .line 95
    .line 96
    :cond_4
    if-ltz p1, :cond_5

    .line 97
    .line 98
    if-ltz p2, :cond_5

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v5, "/api.php?type=tv&tmdb="

    .line 103
    .line 104
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p3, "&season="

    .line 111
    .line 112
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p1, "&episode="

    .line 119
    .line 120
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    goto :goto_2

    .line 131
    :cond_5
    const-string p1, "/api.php?type=movie&tmdb="

    .line 132
    .line 133
    invoke-static {p1, p3}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :goto_2
    if-eqz p4, :cond_7

    .line 138
    .line 139
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-nez p2, :cond_6

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p1, "&api_token="

    .line 155
    .line 156
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    :cond_7
    :goto_3
    :try_start_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iput v3, v0, Lx4/j;->o:I

    .line 182
    .line 183
    sget-object p2, Li7/e0;->a:Lo7/e;

    .line 184
    .line 185
    sget-object p2, Lo7/d;->l:Lo7/d;

    .line 186
    .line 187
    new-instance p3, Lx4/h;

    .line 188
    .line 189
    invoke-direct {p3, p1, v4, v3}, Lx4/h;-><init>(Ljava/lang/String;Lp6/c;I)V

    .line 190
    .line 191
    .line 192
    invoke-static {p2, p3, v0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p5

    .line 196
    if-ne p5, v1, :cond_8

    .line 197
    .line 198
    return-object v1

    .line 199
    :cond_8
    :goto_4
    check-cast p5, Lorg/json/JSONObject;

    .line 200
    .line 201
    if-eqz p5, :cond_d

    .line 202
    .line 203
    const-string p1, "data"

    .line 204
    .line 205
    invoke-virtual {p5, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 209
    if-nez p1, :cond_9

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_9
    const-string p2, "file_name"

    .line 213
    .line 214
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-static {p2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-static {p2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result p3

    .line 225
    const-string p4, "null"

    .line 226
    .line 227
    if-nez p3, :cond_a

    .line 228
    .line 229
    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p3

    .line 233
    if-nez p3, :cond_a

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_a
    move-object p2, v4

    .line 237
    :goto_5
    const-string p3, "imdb_id"

    .line 238
    .line 239
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-static {p1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 247
    .line 248
    .line 249
    move-result p3

    .line 250
    if-nez p3, :cond_b

    .line 251
    .line 252
    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p3

    .line 256
    if-nez p3, :cond_b

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_b
    move-object p1, v4

    .line 260
    :goto_6
    if-eqz p1, :cond_c

    .line 261
    .line 262
    const-string p3, "tt"

    .line 263
    .line 264
    invoke-static {p1, p3}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    :cond_c
    new-instance p1, Lx4/b;

    .line 269
    .line 270
    invoke-direct {p1, p2, v4}, Lx4/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    return-object p1

    .line 274
    :catch_0
    :cond_d
    :goto_7
    return-object v4
.end method
