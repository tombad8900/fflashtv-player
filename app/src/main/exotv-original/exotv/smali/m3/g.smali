.class public final Lm3/g;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:Ljava/util/List;

.field public o:Lr3/o;

.field public p:I

.field public q:I

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lm3/h;

.field public final synthetic u:Lm3/a;

.field public final synthetic v:Lr3/o;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Lh3/d;

.field public final synthetic y:Lr3/k;


# direct methods
.method public constructor <init>(Lm3/h;Lm3/a;Lr3/o;Ljava/util/List;Lh3/d;Lr3/k;Lp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm3/g;->t:Lm3/h;

    .line 2
    .line 3
    iput-object p2, p0, Lm3/g;->u:Lm3/a;

    .line 4
    .line 5
    iput-object p3, p0, Lm3/g;->v:Lr3/o;

    .line 6
    .line 7
    iput-object p4, p0, Lm3/g;->w:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, Lm3/g;->x:Lh3/d;

    .line 10
    .line 11
    iput-object p6, p0, Lm3/g;->y:Lr3/k;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lr6/h;-><init>(ILp6/c;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lm3/g;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm3/g;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm3/g;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 8

    .line 1
    new-instance v0, Lm3/g;

    .line 2
    .line 3
    iget-object v5, p0, Lm3/g;->x:Lh3/d;

    .line 4
    .line 5
    iget-object v6, p0, Lm3/g;->y:Lr3/k;

    .line 6
    .line 7
    iget-object v1, p0, Lm3/g;->t:Lm3/h;

    .line 8
    .line 9
    iget-object v2, p0, Lm3/g;->u:Lm3/a;

    .line 10
    .line 11
    iget-object v3, p0, Lm3/g;->v:Lr3/o;

    .line 12
    .line 13
    iget-object v4, p0, Lm3/g;->w:Ljava/util/List;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lm3/g;-><init>(Lm3/h;Lm3/a;Lr3/o;Ljava/util/List;Lh3/d;Lr3/k;Lp6/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lm3/g;->s:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v0, p0, Lm3/g;->r:I

    .line 4
    .line 5
    iget-object v1, p0, Lm3/g;->x:Lh3/d;

    .line 6
    .line 7
    iget-object v2, p0, Lm3/g;->u:Lm3/a;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-ne v0, v3, :cond_2

    .line 13
    .line 14
    iget v0, p0, Lm3/g;->q:I

    .line 15
    .line 16
    iget v4, p0, Lm3/g;->p:I

    .line 17
    .line 18
    iget-object v5, p0, Lm3/g;->o:Lr3/o;

    .line 19
    .line 20
    iget-object v6, p0, Lm3/g;->n:Ljava/util/List;

    .line 21
    .line 22
    iget-object v7, p0, Lm3/g;->s:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v7, Li7/u;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Landroid/graphics/Bitmap;

    .line 30
    .line 31
    invoke-interface {v7}, Li7/u;->h()Lp6/h;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    sget-object v9, Li7/s;->k:Li7/s;

    .line 36
    .line 37
    invoke-interface {v8, v9}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    check-cast v8, Li7/s0;

    .line 42
    .line 43
    if-eqz v8, :cond_1

    .line 44
    .line 45
    invoke-interface {v8}, Li7/s0;->isActive()Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    check-cast v8, Li7/a1;

    .line 53
    .line 54
    invoke-virtual {v8}, Li7/a1;->v()Ljava/util/concurrent/CancellationException;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    throw p1

    .line 59
    :cond_1
    :goto_0
    add-int/2addr v4, v3

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lm3/g;->s:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v7, p1

    .line 75
    check-cast v7, Li7/u;

    .line 76
    .line 77
    iget-object p1, v2, Lm3/a;->a:Landroid/graphics/drawable/Drawable;

    .line 78
    .line 79
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 80
    .line 81
    iget-object v5, p0, Lm3/g;->v:Lr3/o;

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    move-object v0, p1

    .line 86
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 99
    .line 100
    :cond_4
    sget-object v6, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 101
    .line 102
    invoke-static {v6, v4}, Lm6/g;->i0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    move-object p1, v0

    .line 109
    goto :goto_1

    .line 110
    :cond_5
    iget-object v0, v5, Lr3/o;->b:Landroid/graphics/Bitmap$Config;

    .line 111
    .line 112
    iget-object v4, v5, Lr3/o;->d:Ls3/h;

    .line 113
    .line 114
    iget-object v6, v5, Lr3/o;->e:Ls3/g;

    .line 115
    .line 116
    iget-boolean v8, v5, Lr3/o;->f:Z

    .line 117
    .line 118
    invoke-static {p1, v0, v4, v6, v8}, Lt2/i0;->g(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Ls3/h;Ls3/g;Z)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v6, p0, Lm3/g;->w:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    const/4 v4, 0x0

    .line 132
    :goto_2
    if-lt v4, v0, :cond_6

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lm3/g;->y:Lr3/k;

    .line 138
    .line 139
    iget-object v0, v0, Lr3/k;->a:Landroid/content/Context;

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 146
    .line 147
    invoke-direct {v1, v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 148
    .line 149
    .line 150
    iget-boolean p1, v2, Lm3/a;->b:Z

    .line 151
    .line 152
    iget-object v0, v2, Lm3/a;->c:Li3/f;

    .line 153
    .line 154
    iget-object v2, v2, Lm3/a;->d:Ljava/lang/String;

    .line 155
    .line 156
    new-instance v3, Lm3/a;

    .line 157
    .line 158
    invoke-direct {v3, v1, p1, v0, v2}, Lm3/a;-><init>(Landroid/graphics/drawable/Drawable;ZLi3/f;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v3

    .line 162
    :cond_6
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-nez p1, :cond_7

    .line 167
    .line 168
    iget-object p1, v5, Lr3/o;->d:Ls3/h;

    .line 169
    .line 170
    iput-object v7, p0, Lm3/g;->s:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v6, p0, Lm3/g;->n:Ljava/util/List;

    .line 173
    .line 174
    iput-object v5, p0, Lm3/g;->o:Lr3/o;

    .line 175
    .line 176
    iput v4, p0, Lm3/g;->p:I

    .line 177
    .line 178
    iput v0, p0, Lm3/g;->q:I

    .line 179
    .line 180
    iput v3, p0, Lm3/g;->r:I

    .line 181
    .line 182
    const/4 p1, 0x0

    .line 183
    throw p1

    .line 184
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 185
    .line 186
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 187
    .line 188
    .line 189
    throw p1
.end method
