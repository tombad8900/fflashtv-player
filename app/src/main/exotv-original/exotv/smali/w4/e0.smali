.class public final Lw4/e0;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:Lx4/x;

.field public o:I

.field public final synthetic p:J


# direct methods
.method public constructor <init>(JLp6/c;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lw4/e0;->p:J

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li7/u;

    .line 2
    .line 3
    check-cast p2, Lp6/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw4/e0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw4/e0;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw4/e0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 2

    .line 1
    new-instance p1, Lw4/e0;

    .line 2
    .line 3
    iget-wide v0, p0, Lw4/e0;->p:J

    .line 4
    .line 5
    invoke-direct {p1, v0, v1, p2}, Lw4/e0;-><init>(JLp6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v1, p0, Lw4/e0;->o:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lw4/e0;->n:Lx4/x;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lx4/x;->a:Lx4/x;

    .line 28
    .line 29
    sget-object v1, Lx4/k;->a:Lx4/k;

    .line 30
    .line 31
    iget-wide v3, p0, Lw4/e0;->p:J

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v5, "https://api.themoviedb.org/3/movie/"

    .line 36
    .line 37
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v3, "/similar"

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v3, "url"

    .line 53
    .line 54
    invoke-static {v3, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/16 v3, 0x3f

    .line 58
    .line 59
    invoke-static {v1, v3}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    const-string v3, "&"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string v3, "?"

    .line 69
    .line 70
    :goto_0
    sget-object v4, Lb5/h;->a:Lb5/i;

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    iget-object v4, v4, Lb5/i;->r:Ljava/lang/String;

    .line 75
    .line 76
    if-nez v4, :cond_4

    .line 77
    .line 78
    :cond_3
    const-string v4, "4e44d9029b1270a757cddc766a1bcb63"

    .line 79
    .line 80
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, "api_key="

    .line 92
    .line 93
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object p1, p0, Lw4/e0;->n:Lx4/x;

    .line 104
    .line 105
    iput v2, p0, Lw4/e0;->o:I

    .line 106
    .line 107
    invoke-static {v1, p0}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-ne v1, v0, :cond_5

    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_5
    move-object v0, p1

    .line 115
    move-object p1, v1

    .line 116
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 117
    .line 118
    new-instance v1, Lorg/json/JSONObject;

    .line 119
    .line 120
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    sget-object p1, Lx4/w;->a:Lx4/w;

    .line 127
    .line 128
    const-string p1, "results"

    .line 129
    .line 130
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    sget-object v0, Lx4/m;->j:Lx4/m;

    .line 135
    .line 136
    sget-object v1, Lm6/r;->j:Lm6/r;

    .line 137
    .line 138
    invoke-static {p1, v0, v1}, Lx4/w;->b(Lorg/json/JSONArray;Lx4/m;Ljava/util/Set;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1
.end method
