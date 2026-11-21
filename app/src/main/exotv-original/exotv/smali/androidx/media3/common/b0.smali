.class public final Landroidx/media3/common/b0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public c:Ljava/lang/String;

.field public d:Landroidx/media3/common/c0;

.field public e:Landroidx/media3/common/f0;

.field public f:Ljava/util/List;

.field public g:Ljava/lang/String;

.field public h:Lf6/m0;

.field public i:Landroidx/media3/common/a0;

.field public j:Ljava/lang/Object;

.field public k:J

.field public l:Landroidx/media3/common/r0;

.field public m:Landroidx/media3/common/h0;

.field public n:Landroidx/media3/common/k0;


# virtual methods
.method public final a()Landroidx/media3/common/o0;
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/media3/common/b0;->e:Landroidx/media3/common/f0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/common/b0;->b:Landroid/net/Uri;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    new-instance v1, Landroidx/media3/common/j0;

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/media3/common/b0;->c:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v4, p0, Landroidx/media3/common/b0;->e:Landroidx/media3/common/f0;

    .line 28
    .line 29
    iget-object v5, v4, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 30
    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    new-instance v0, Landroidx/media3/common/g0;

    .line 34
    .line 35
    invoke-direct {v0, v4}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    move-object v4, v0

    .line 39
    iget-object v5, p0, Landroidx/media3/common/b0;->i:Landroidx/media3/common/a0;

    .line 40
    .line 41
    iget-object v6, p0, Landroidx/media3/common/b0;->f:Ljava/util/List;

    .line 42
    .line 43
    iget-object v7, p0, Landroidx/media3/common/b0;->g:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v8, p0, Landroidx/media3/common/b0;->h:Lf6/m0;

    .line 46
    .line 47
    iget-object v9, p0, Landroidx/media3/common/b0;->j:Ljava/lang/Object;

    .line 48
    .line 49
    iget-wide v10, p0, Landroidx/media3/common/b0;->k:J

    .line 50
    .line 51
    invoke-direct/range {v1 .. v11}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 52
    .line 53
    .line 54
    move-object v5, v1

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move-object v5, v0

    .line 57
    :goto_2
    new-instance v2, Landroidx/media3/common/o0;

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/media3/common/b0;->a:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    :goto_3
    move-object v3, v0

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    const-string v0, ""

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :goto_4
    iget-object v0, p0, Landroidx/media3/common/b0;->d:Landroidx/media3/common/c0;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v4, Landroidx/media3/common/e0;

    .line 74
    .line 75
    invoke-direct {v4, v0}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroidx/media3/common/b0;->m:Landroidx/media3/common/h0;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v6, Landroidx/media3/common/i0;

    .line 84
    .line 85
    invoke-direct {v6, v0}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Landroidx/media3/common/b0;->l:Landroidx/media3/common/r0;

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    :goto_5
    move-object v7, v0

    .line 93
    goto :goto_6

    .line 94
    :cond_5
    sget-object v0, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :goto_6
    iget-object v8, p0, Landroidx/media3/common/b0;->n:Landroidx/media3/common/k0;

    .line 98
    .line 99
    invoke-direct/range {v2 .. v8}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 100
    .line 101
    .line 102
    return-object v2
.end method
