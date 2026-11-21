.class public final Ln4/l;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final n:Lk2/b;


# instance fields
.field public volatile j:Lcom/bumptech/glide/m;

.field public final k:Lp/e;

.field public final l:Ln4/f;

.field public final m:La1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk2/b;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk2/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ln4/l;->n:Lk2/b;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp/e;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lp/k;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ln4/l;->k:Lp/e;

    .line 11
    .line 12
    new-instance v0, La1/e;

    .line 13
    .line 14
    sget-object v1, Ln4/l;->n:Lk2/b;

    .line 15
    .line 16
    invoke-direct {v0, v1}, La1/e;-><init>(Lk2/b;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ln4/l;->m:La1/e;

    .line 20
    .line 21
    sget-boolean v0, Lh4/u;->f:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-boolean v0, Lh4/u;->e:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, Ln4/e;

    .line 31
    .line 32
    invoke-direct {v0}, Ln4/e;-><init>()V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    new-instance v0, Lk2/b;

    .line 37
    .line 38
    const/16 v1, 0xb

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lk2/b;-><init>(I)V

    .line 41
    .line 42
    .line 43
    :goto_1
    iput-object v0, p0, Ln4/l;->l:Ln4/f;

    .line 44
    .line 45
    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/app/Activity;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ln4/l;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static b(Ljava/util/List;Lp/e;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La1/v;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v1, v0, La1/v;->N:Landroid/view/View;

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p1, v1, v0}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La1/v;->g()La1/n0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, La1/n0;->c:La1/h;

    .line 35
    .line 36
    invoke-virtual {v0}, La1/h;->k()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0, p1}, Ln4/l;->b(Ljava/util/List;Lp/e;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Lcom/bumptech/glide/m;
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    sget-object v0, Lu4/m;->a:[C

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    instance-of v0, p1, Landroid/app/Application;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    instance-of v0, p1, Lh/i;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    check-cast p1, Lh/i;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    move-object v0, p1

    .line 35
    check-cast v0, Landroid/content/ContextWrapper;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Ln4/l;->c(Landroid/content/Context;)Lcom/bumptech/glide/m;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_1
    iget-object v0, p0, Ln4/l;->j:Lcom/bumptech/glide/m;

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    monitor-enter p0

    .line 61
    :try_start_0
    iget-object v0, p0, Ln4/l;->j:Lcom/bumptech/glide/m;

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Lk2/b;

    .line 74
    .line 75
    const/16 v2, 0x9

    .line 76
    .line 77
    invoke-direct {v1, v2}, Lk2/b;-><init>(I)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Lk2/b;

    .line 81
    .line 82
    const/16 v3, 0xc

    .line 83
    .line 84
    invoke-direct {v2, v3}, Lk2/b;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v3, Lcom/bumptech/glide/m;

    .line 92
    .line 93
    invoke-direct {v3, v0, v1, v2, p1}, Lcom/bumptech/glide/m;-><init>(Lcom/bumptech/glide/b;Ln4/g;Lk2/b;Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    iput-object v3, p0, Ln4/l;->j:Lcom/bumptech/glide/m;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    move-exception p1

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    :goto_0
    monitor-exit p0

    .line 102
    goto :goto_2

    .line 103
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    throw p1

    .line 105
    :cond_3
    :goto_2
    iget-object p1, p0, Ln4/l;->j:Lcom/bumptech/glide/m;

    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    const-string v0, "You cannot start a load on a null Context"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
.end method

.method public final d(Lh/i;)Lcom/bumptech/glide/m;
    .locals 10

    .line 1
    sget-object v0, Lu4/m;->a:[C

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ln4/l;->c(Landroid/content/Context;)Lcom/bumptech/glide/m;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    iget-object v0, p0, Ln4/l;->l:Ln4/f;

    .line 36
    .line 37
    invoke-interface {v0, p1}, Ln4/f;->e(Lh/i;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Ln4/l;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v9, v2

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    :goto_1
    move v9, v3

    .line 56
    :goto_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    iget-object v7, p1, Lb0/e;->j:Landroidx/lifecycle/x;

    .line 65
    .line 66
    iget-object v0, p1, Lh/i;->B:La1/o;

    .line 67
    .line 68
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La1/z;

    .line 71
    .line 72
    iget-object v8, v0, La1/z;->s:La1/n0;

    .line 73
    .line 74
    iget-object v4, p0, Ln4/l;->m:La1/e;

    .line 75
    .line 76
    move-object v5, p1

    .line 77
    invoke-virtual/range {v4 .. v9}, La1/e;->C(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/o;La1/n0;Z)Lcom/bumptech/glide/m;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 83
    .line 84
    const-string v0, "You cannot start a load for a destroyed activity"

    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
