.class public final Lj3/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La4/p;Ln4/m;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ln4/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ln4/o;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lj3/a;->d:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lj3/a;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lj3/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj3/f;Lj3/b;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/a;->d:Ljava/lang/Object;

    iput-object p2, p0, Lj3/a;->b:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 6
    new-array p1, p1, [Z

    iput-object p1, p0, Lj3/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw3/d;Lw3/c;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/a;->d:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, Lj3/a;->b:Ljava/lang/Object;

    .line 9
    iget-boolean p2, p2, Lw3/c;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 10
    :cond_0
    iget p1, p1, Lw3/d;->p:I

    .line 11
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lj3/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw3/d;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p0, v1}, Lw3/d;->b(Lw3/d;Lj3/a;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj3/f;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, Lj3/a;->a:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lj3/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lj3/b;

    .line 13
    .line 14
    iget-object v1, v1, Lj3/b;->g:Lj3/a;

    .line 15
    .line 16
    invoke-static {v1, p0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {v0, p0, p1}, Lj3/f;->b(Lj3/f;Lj3/a;Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lj3/a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 34
    .line 35
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p1
.end method

.method public c(I)Lv7/b0;
    .locals 4

    .line 1
    iget-object v0, p0, Lj3/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj3/f;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, Lj3/a;->a:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lj3/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, [Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aput-boolean v2, v1, p1

    .line 16
    .line 17
    iget-object v1, p0, Lj3/a;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lj3/b;

    .line 20
    .line 21
    iget-object v1, v1, Lj3/b;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v1, v0, Lj3/f;->y:Lj3/d;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, Lv7/b0;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lv7/p;->f(Lv7/b0;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lj3/d;->k(Lv7/b0;)Lv7/i0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    check-cast p1, Lv7/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 52
    .line 53
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    :goto_0
    monitor-exit v0

    .line 60
    throw p1
.end method

.method public d()Ljava/io/File;
    .locals 5

    .line 1
    iget-object v0, p0, Lj3/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw3/d;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lj3/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lw3/c;

    .line 9
    .line 10
    iget-object v2, v1, Lw3/c;->f:Lj3/a;

    .line 11
    .line 12
    if-ne v2, p0, :cond_1

    .line 13
    .line 14
    iget-boolean v2, v1, Lw3/c;->e:Z

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lj3/a;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, [Z

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    aput-boolean v4, v2, v3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    iget-object v1, v1, Lw3/c;->d:[Ljava/io/File;

    .line 30
    .line 31
    aget-object v1, v1, v3

    .line 32
    .line 33
    iget-object v2, p0, Lj3/a;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lw3/d;

    .line 36
    .line 37
    iget-object v2, v2, Lw3/d;->j:Ljava/io/File;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-object v1

    .line 44
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw v1
.end method
