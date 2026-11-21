.class public final La4/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements La4/v;
.implements La4/x;


# static fields
.field public static final h:Z


# instance fields
.field public final a:La4/c0;

.field public final b:Ly5/f;

.field public final c:Lc4/f;

.field public final d:Lm/o2;

.field public final e:La4/j0;

.field public final f:La4/o;

.field public final g:La4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Engine"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, La4/q;->h:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lc4/f;La1/o;Ld4/e;Ld4/e;Ld4/e;Ld4/e;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4/q;->c:Lc4/f;

    .line 5
    .line 6
    new-instance v0, La4/p;

    .line 7
    .line 8
    invoke-direct {v0, p2}, La4/p;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, La4/c;

    .line 12
    .line 13
    invoke-direct {p2}, La4/c;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La4/q;->g:La4/c;

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    iput-object p0, p2, La4/c;->m:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    new-instance p2, Ly5/f;

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-direct {p2, v1}, Ly5/f;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, La4/q;->b:Ly5/f;

    .line 31
    .line 32
    new-instance p2, La4/c0;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {p2, v1}, La4/c0;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p2, p0, La4/q;->a:La4/c0;

    .line 39
    .line 40
    new-instance v2, Lm/o2;

    .line 41
    .line 42
    move-object v8, p0

    .line 43
    move-object v7, p0

    .line 44
    move-object v3, p3

    .line 45
    move-object v4, p4

    .line 46
    move-object v5, p5

    .line 47
    move-object v6, p6

    .line 48
    invoke-direct/range {v2 .. v8}, Lm/o2;-><init>(Ld4/e;Ld4/e;Ld4/e;Ld4/e;La4/q;La4/q;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, v7, La4/q;->d:Lm/o2;

    .line 52
    .line 53
    new-instance p2, La4/o;

    .line 54
    .line 55
    invoke-direct {p2, v0}, La4/o;-><init>(La4/p;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, v7, La4/q;->f:La4/o;

    .line 59
    .line 60
    new-instance p2, La4/j0;

    .line 61
    .line 62
    const/4 p3, 0x0

    .line 63
    invoke-direct {p2, p3}, La4/j0;-><init>(I)V

    .line 64
    .line 65
    .line 66
    iput-object p2, v7, La4/q;->e:La4/j0;

    .line 67
    .line 68
    iput-object v7, p1, Lc4/f;->d:La4/q;

    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    move-object v7, p0

    .line 73
    :goto_0
    move-object p1, v0

    .line 74
    goto :goto_2

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    move-object v7, p0

    .line 77
    :goto_1
    move-object p1, v0

    .line 78
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 79
    :try_start_4
    throw p1

    .line 80
    :catchall_2
    move-exception v0

    .line 81
    goto :goto_0

    .line 82
    :catchall_3
    move-exception v0

    .line 83
    goto :goto_1

    .line 84
    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 85
    throw p1
.end method

.method public static c(Ljava/lang/String;JLa4/w;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " in "

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Lu4/g;->a(J)D

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, "ms, key: "

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "Engine"

    .line 34
    .line 35
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static f(La4/f0;)V
    .locals 1

    .line 1
    instance-of v0, p0, La4/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, La4/y;

    .line 6
    .line 7
    invoke-virtual {p0}, La4/y;->e()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "Cannot release anything but an EngineResource"

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/e;Ljava/lang/Object;Ly3/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f;La4/n;Lu4/b;ZZLy3/h;ZZLq4/f;Lh/n;)La4/c;
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    sget-boolean v0, La4/q;->h:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Lu4/g;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    :goto_0
    iget-object v3, v2, La4/q;->b:Ly5/f;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v4, La4/w;

    .line 22
    .line 23
    move-object/from16 v5, p2

    .line 24
    .line 25
    move-object/from16 v6, p3

    .line 26
    .line 27
    move/from16 v7, p4

    .line 28
    .line 29
    move/from16 v8, p5

    .line 30
    .line 31
    move-object/from16 v10, p6

    .line 32
    .line 33
    move-object/from16 v11, p7

    .line 34
    .line 35
    move-object/from16 v9, p10

    .line 36
    .line 37
    move-object/from16 v12, p13

    .line 38
    .line 39
    invoke-direct/range {v4 .. v12}, La4/w;-><init>(Ljava/lang/Object;Ly3/e;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Ly3/h;)V

    .line 40
    .line 41
    .line 42
    monitor-enter p0

    .line 43
    move/from16 v3, p14

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v2, v4, v3, v0, v1}, La4/q;->b(La4/w;ZJ)La4/y;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    move-object/from16 v5, p3

    .line 52
    .line 53
    move/from16 v6, p4

    .line 54
    .line 55
    move/from16 v7, p5

    .line 56
    .line 57
    move-object/from16 v8, p6

    .line 58
    .line 59
    move-object/from16 v9, p7

    .line 60
    .line 61
    move-object/from16 v10, p8

    .line 62
    .line 63
    move-object/from16 v11, p9

    .line 64
    .line 65
    move-object/from16 v12, p10

    .line 66
    .line 67
    move/from16 v13, p11

    .line 68
    .line 69
    move/from16 v14, p12

    .line 70
    .line 71
    move-object/from16 v15, p13

    .line 72
    .line 73
    move/from16 v17, p15

    .line 74
    .line 75
    move-object/from16 v18, p16

    .line 76
    .line 77
    move-object/from16 v19, p17

    .line 78
    .line 79
    move-wide/from16 v21, v0

    .line 80
    .line 81
    move/from16 v16, v3

    .line 82
    .line 83
    move-object/from16 v20, v4

    .line 84
    .line 85
    move-object/from16 v3, p1

    .line 86
    .line 87
    move-object/from16 v4, p2

    .line 88
    .line 89
    invoke-virtual/range {v2 .. v22}, La4/q;->g(Lcom/bumptech/glide/e;Ljava/lang/Object;Ly3/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f;La4/n;Ljava/util/Map;ZZLy3/h;ZZLq4/f;Ljava/util/concurrent/Executor;La4/w;J)La4/c;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-object v0, v5

    .line 98
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    const/4 v1, 0x5

    .line 100
    const/4 v2, 0x0

    .line 101
    move-object/from16 v3, p16

    .line 102
    .line 103
    invoke-virtual {v3, v0, v1, v2}, Lq4/f;->j(La4/f0;IZ)V

    .line 104
    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    return-object v0

    .line 108
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw v0
.end method

.method public final b(La4/w;ZJ)La4/y;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    move-object v6, p0

    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object p2, p0, La4/q;->g:La4/c;

    .line 8
    .line 9
    monitor-enter p2

    .line 10
    :try_start_0
    iget-object v1, p2, La4/c;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La4/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    monitor-exit p2

    .line 23
    move-object v2, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, La4/y;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    :try_start_2
    invoke-virtual {p2, v1}, La4/c;->r(La4/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    move-object v6, p0

    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_2
    :goto_0
    monitor-exit p2

    .line 43
    :goto_1
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2}, La4/y;->a()V

    .line 46
    .line 47
    .line 48
    :cond_3
    if-eqz v2, :cond_5

    .line 49
    .line 50
    sget-boolean p2, La4/q;->h:Z

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    const-string p2, "Loaded resource from active resources"

    .line 55
    .line 56
    invoke-static {p2, p3, p4, p1}, La4/q;->c(Ljava/lang/String;JLa4/w;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    return-object v2

    .line 60
    :cond_5
    iget-object v1, p0, La4/q;->c:Lc4/f;

    .line 61
    .line 62
    monitor-enter v1

    .line 63
    :try_start_3
    iget-object p2, v1, Lu4/i;->a:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Lu4/h;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 70
    .line 71
    if-nez p2, :cond_6

    .line 72
    .line 73
    monitor-exit v1

    .line 74
    move-object p2, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_6
    :try_start_4
    iget-wide v2, v1, Lu4/i;->c:J

    .line 77
    .line 78
    iget v4, p2, Lu4/h;->b:I

    .line 79
    .line 80
    int-to-long v4, v4

    .line 81
    sub-long/2addr v2, v4

    .line 82
    iput-wide v2, v1, Lu4/i;->c:J

    .line 83
    .line 84
    iget-object p2, p2, Lu4/h;->a:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 85
    .line 86
    monitor-exit v1

    .line 87
    :goto_2
    move-object v2, p2

    .line 88
    check-cast v2, La4/f0;

    .line 89
    .line 90
    if-nez v2, :cond_7

    .line 91
    .line 92
    move-object v6, p0

    .line 93
    move-object v5, p1

    .line 94
    move-object v2, v0

    .line 95
    goto :goto_3

    .line 96
    :cond_7
    instance-of p2, v2, La4/y;

    .line 97
    .line 98
    if-eqz p2, :cond_8

    .line 99
    .line 100
    check-cast v2, La4/y;

    .line 101
    .line 102
    move-object v6, p0

    .line 103
    move-object v5, p1

    .line 104
    goto :goto_3

    .line 105
    :cond_8
    new-instance v1, La4/y;

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    const/4 v4, 0x1

    .line 109
    move-object v6, p0

    .line 110
    move-object v5, p1

    .line 111
    invoke-direct/range {v1 .. v6}, La4/y;-><init>(La4/f0;ZZLy3/e;La4/x;)V

    .line 112
    .line 113
    .line 114
    move-object v2, v1

    .line 115
    :goto_3
    if-eqz v2, :cond_9

    .line 116
    .line 117
    invoke-virtual {v2}, La4/y;->a()V

    .line 118
    .line 119
    .line 120
    iget-object p1, v6, La4/q;->g:La4/c;

    .line 121
    .line 122
    invoke-virtual {p1, v5, v2}, La4/c;->q(Ly3/e;La4/y;)V

    .line 123
    .line 124
    .line 125
    :cond_9
    if-eqz v2, :cond_b

    .line 126
    .line 127
    sget-boolean p1, La4/q;->h:Z

    .line 128
    .line 129
    if-eqz p1, :cond_a

    .line 130
    .line 131
    const-string p1, "Loaded resource from cache"

    .line 132
    .line 133
    invoke-static {p1, p3, p4, v5}, La4/q;->c(Ljava/lang/String;JLa4/w;)V

    .line 134
    .line 135
    .line 136
    :cond_a
    return-object v2

    .line 137
    :cond_b
    :goto_4
    return-object v0

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    move-object v6, p0

    .line 140
    :goto_5
    move-object p1, v0

    .line 141
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 142
    throw p1

    .line 143
    :catchall_2
    move-exception v0

    .line 144
    goto :goto_5

    .line 145
    :catchall_3
    move-exception v0

    .line 146
    move-object v6, p0

    .line 147
    :goto_6
    move-object p1, v0

    .line 148
    :goto_7
    :try_start_6
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 149
    throw p1

    .line 150
    :catchall_4
    move-exception v0

    .line 151
    goto :goto_6
.end method

.method public final declared-synchronized d(La4/u;Ly3/e;La4/y;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-boolean v0, p3, La4/y;->j:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La4/q;->g:La4/c;

    .line 9
    .line 10
    invoke-virtual {v0, p2, p3}, La4/c;->q(Ly3/e;La4/y;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object p3, p0, La4/q;->a:La4/c0;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p3, p3, La4/c0;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :cond_1
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public final e(Ly3/e;La4/y;)V
    .locals 3

    .line 1
    iget-object v0, p0, La4/q;->g:La4/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, La4/c;->k:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, La4/b;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v1, La4/b;->c:La4/f0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    iget-boolean v0, p2, La4/y;->j:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, La4/q;->c:Lc4/f;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lu4/i;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, La4/f0;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, La4/q;->e:La4/j0;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, p2, v0}, La4/j0;->e(La4/f0;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public final g(Lcom/bumptech/glide/e;Ljava/lang/Object;Ly3/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f;La4/n;Ljava/util/Map;ZZLy3/h;ZZLq4/f;Ljava/util/concurrent/Executor;La4/w;J)La4/c;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p8

    .line 14
    .line 15
    move-object/from16 v7, p9

    .line 16
    .line 17
    move-object/from16 v8, p13

    .line 18
    .line 19
    move-object/from16 v9, p16

    .line 20
    .line 21
    move-object/from16 v10, p17

    .line 22
    .line 23
    move-object/from16 v11, p18

    .line 24
    .line 25
    move-wide/from16 v12, p19

    .line 26
    .line 27
    iget-object v14, v1, La4/q;->a:La4/c0;

    .line 28
    .line 29
    iget-object v14, v14, La4/c0;->a:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v14

    .line 35
    check-cast v14, La4/u;

    .line 36
    .line 37
    if-eqz v14, :cond_1

    .line 38
    .line 39
    invoke-virtual {v14, v9, v10}, La4/u;->b(Lq4/f;Ljava/util/concurrent/Executor;)V

    .line 40
    .line 41
    .line 42
    sget-boolean v0, La4/q;->h:Z

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const-string v0, "Added to existing load"

    .line 47
    .line 48
    invoke-static {v0, v12, v13, v11}, La4/q;->c(Ljava/lang/String;JLa4/w;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    new-instance v0, La4/c;

    .line 52
    .line 53
    invoke-direct {v0, v1, v9, v14}, La4/c;-><init>(La4/q;Lq4/f;La4/u;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_1
    iget-object v14, v1, La4/q;->d:Lm/o2;

    .line 58
    .line 59
    iget-object v14, v14, Lm/o2;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v14, La4/c;

    .line 62
    .line 63
    invoke-virtual {v14}, La4/c;->acquire()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v14

    .line 67
    check-cast v14, La4/u;

    .line 68
    .line 69
    monitor-enter v14

    .line 70
    :try_start_0
    iput-object v11, v14, La4/u;->t:La4/w;

    .line 71
    .line 72
    move/from16 v15, p14

    .line 73
    .line 74
    iput-boolean v15, v14, La4/u;->u:Z

    .line 75
    .line 76
    move/from16 v15, p15

    .line 77
    .line 78
    iput-boolean v15, v14, La4/u;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 79
    .line 80
    monitor-exit v14

    .line 81
    iget-object v15, v1, La4/q;->f:La4/o;

    .line 82
    .line 83
    iget-object v12, v15, La4/o;->l:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v12, La4/c;

    .line 86
    .line 87
    invoke-virtual {v12}, La4/c;->acquire()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    check-cast v12, La4/l;

    .line 92
    .line 93
    iget v13, v15, La4/o;->j:I

    .line 94
    .line 95
    add-int/lit8 v9, v13, 0x1

    .line 96
    .line 97
    iput v9, v15, La4/o;->j:I

    .line 98
    .line 99
    iget-object v9, v12, La4/l;->j:La4/i;

    .line 100
    .line 101
    iget-object v15, v12, La4/l;->m:La4/p;

    .line 102
    .line 103
    iput-object v0, v9, La4/i;->c:Lcom/bumptech/glide/e;

    .line 104
    .line 105
    iput-object v2, v9, La4/i;->d:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v3, v9, La4/i;->n:Ly3/e;

    .line 108
    .line 109
    iput v4, v9, La4/i;->e:I

    .line 110
    .line 111
    iput v5, v9, La4/i;->f:I

    .line 112
    .line 113
    iput-object v7, v9, La4/i;->p:La4/n;

    .line 114
    .line 115
    move-object/from16 v10, p6

    .line 116
    .line 117
    iput-object v10, v9, La4/i;->g:Ljava/lang/Class;

    .line 118
    .line 119
    iput-object v15, v9, La4/i;->h:La4/p;

    .line 120
    .line 121
    move-object/from16 v10, p7

    .line 122
    .line 123
    iput-object v10, v9, La4/i;->k:Ljava/lang/Class;

    .line 124
    .line 125
    iput-object v6, v9, La4/i;->o:Lcom/bumptech/glide/f;

    .line 126
    .line 127
    iput-object v8, v9, La4/i;->i:Ly3/h;

    .line 128
    .line 129
    move-object/from16 v10, p10

    .line 130
    .line 131
    iput-object v10, v9, La4/i;->j:Ljava/util/Map;

    .line 132
    .line 133
    move/from16 v10, p11

    .line 134
    .line 135
    iput-boolean v10, v9, La4/i;->q:Z

    .line 136
    .line 137
    move/from16 v10, p12

    .line 138
    .line 139
    iput-boolean v10, v9, La4/i;->r:Z

    .line 140
    .line 141
    iput-object v0, v12, La4/l;->q:Lcom/bumptech/glide/e;

    .line 142
    .line 143
    iput-object v3, v12, La4/l;->r:Ly3/e;

    .line 144
    .line 145
    iput-object v6, v12, La4/l;->s:Lcom/bumptech/glide/f;

    .line 146
    .line 147
    iput-object v11, v12, La4/l;->t:La4/w;

    .line 148
    .line 149
    iput v4, v12, La4/l;->u:I

    .line 150
    .line 151
    iput v5, v12, La4/l;->v:I

    .line 152
    .line 153
    iput-object v7, v12, La4/l;->w:La4/n;

    .line 154
    .line 155
    iput-object v8, v12, La4/l;->x:Ly3/h;

    .line 156
    .line 157
    iput-object v14, v12, La4/l;->y:La4/u;

    .line 158
    .line 159
    iput v13, v12, La4/l;->z:I

    .line 160
    .line 161
    const/4 v0, 0x1

    .line 162
    iput v0, v12, La4/l;->M:I

    .line 163
    .line 164
    iput-object v2, v12, La4/l;->B:Ljava/lang/Object;

    .line 165
    .line 166
    iget-object v2, v1, La4/q;->a:La4/c0;

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v2, v2, La4/c0;->a:Ljava/util/HashMap;

    .line 172
    .line 173
    invoke-virtual {v2, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-object/from16 v9, p16

    .line 177
    .line 178
    move-object/from16 v10, p17

    .line 179
    .line 180
    invoke-virtual {v14, v9, v10}, La4/u;->b(Lq4/f;Ljava/util/concurrent/Executor;)V

    .line 181
    .line 182
    .line 183
    monitor-enter v14

    .line 184
    :try_start_1
    iput-object v12, v14, La4/u;->C:La4/l;

    .line 185
    .line 186
    invoke-virtual {v12, v0}, La4/l;->h(I)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    const/4 v2, 0x2

    .line 191
    if-eq v0, v2, :cond_4

    .line 192
    .line 193
    const/4 v2, 0x3

    .line 194
    if-ne v0, v2, :cond_2

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_2
    iget-boolean v0, v14, La4/u;->v:Z

    .line 198
    .line 199
    if-eqz v0, :cond_3

    .line 200
    .line 201
    iget-object v0, v14, La4/u;->r:Ld4/e;

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_3
    iget-object v0, v14, La4/u;->q:Ld4/e;

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_4
    :goto_0
    iget-object v0, v14, La4/u;->p:Ld4/e;

    .line 208
    .line 209
    :goto_1
    invoke-virtual {v0, v12}, Ld4/e;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    .line 211
    .line 212
    monitor-exit v14

    .line 213
    sget-boolean v0, La4/q;->h:Z

    .line 214
    .line 215
    if-eqz v0, :cond_5

    .line 216
    .line 217
    const-string v0, "Started new load"

    .line 218
    .line 219
    move-wide/from16 v12, p19

    .line 220
    .line 221
    invoke-static {v0, v12, v13, v11}, La4/q;->c(Ljava/lang/String;JLa4/w;)V

    .line 222
    .line 223
    .line 224
    :cond_5
    new-instance v0, La4/c;

    .line 225
    .line 226
    invoke-direct {v0, v1, v9, v14}, La4/c;-><init>(La4/q;Lq4/f;La4/u;)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :catchall_0
    move-exception v0

    .line 231
    :try_start_2
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 232
    throw v0

    .line 233
    :catchall_1
    move-exception v0

    .line 234
    :try_start_3
    monitor-exit v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 235
    throw v0
.end method
