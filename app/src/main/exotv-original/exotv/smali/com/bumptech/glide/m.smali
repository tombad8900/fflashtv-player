.class public final Lcom/bumptech/glide/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Ln4/i;


# static fields
.field public static final t:Lq4/e;


# instance fields
.field public final j:Lcom/bumptech/glide/b;

.field public final k:Landroid/content/Context;

.field public final l:Ln4/g;

.field public final m:Ln4/p;

.field public final n:Lk2/b;

.field public final o:Ln4/q;

.field public final p:La1/f;

.field public final q:Ln4/b;

.field public final r:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final s:Lq4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lq4/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lq4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lq4/a;->c(Ljava/lang/Class;)Lq4/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lq4/e;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Lq4/a;->u:Z

    .line 16
    .line 17
    sput-object v0, Lcom/bumptech/glide/m;->t:Lq4/e;

    .line 18
    .line 19
    new-instance v0, Lq4/e;

    .line 20
    .line 21
    invoke-direct {v0}, Lq4/a;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v2, Ll4/b;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lq4/a;->c(Ljava/lang/Class;)Lq4/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lq4/e;

    .line 31
    .line 32
    iput-boolean v1, v0, Lq4/a;->u:Z

    .line 33
    .line 34
    new-instance v0, Lq4/e;

    .line 35
    .line 36
    invoke-direct {v0}, Lq4/a;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v1, La4/n;->d:La4/n;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lq4/a;->d(La4/n;)Lq4/a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lq4/e;

    .line 46
    .line 47
    invoke-virtual {v0}, Lq4/a;->i()Lq4/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lq4/e;

    .line 52
    .line 53
    invoke-virtual {v0}, Lq4/a;->m()Lq4/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lq4/e;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Ln4/g;Lk2/b;Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Ln4/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ln4/p;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/bumptech/glide/b;->o:Lk2/b;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ln4/q;

    .line 12
    .line 13
    invoke-direct {v2}, Ln4/q;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, p0, Lcom/bumptech/glide/m;->o:Ln4/q;

    .line 17
    .line 18
    new-instance v2, La1/f;

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    invoke-direct {v2, v3, p0}, La1/f;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lcom/bumptech/glide/m;->p:La1/f;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/bumptech/glide/m;->j:Lcom/bumptech/glide/b;

    .line 27
    .line 28
    iput-object p2, p0, Lcom/bumptech/glide/m;->l:Ln4/g;

    .line 29
    .line 30
    iput-object p3, p0, Lcom/bumptech/glide/m;->n:Lk2/b;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/bumptech/glide/m;->m:Ln4/p;

    .line 33
    .line 34
    iput-object p4, p0, Lcom/bumptech/glide/m;->k:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    new-instance p4, Lcom/bumptech/glide/l;

    .line 41
    .line 42
    invoke-direct {p4, p0, v0}, Lcom/bumptech/glide/l;-><init>(Lcom/bumptech/glide/m;Ln4/p;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v0, "ConnectivityMonitor"

    .line 49
    .line 50
    invoke-static {p3}, Landroid/support/v4/media/session/b;->i(Landroid/content/Context;)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x1

    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    move v1, v4

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v1, v3

    .line 61
    :goto_0
    const/4 v5, 0x3

    .line 62
    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    const-string v5, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const-string v5, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    .line 74
    .line 75
    :goto_1
    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    :cond_2
    if-eqz v1, :cond_3

    .line 79
    .line 80
    new-instance v0, Ln4/c;

    .line 81
    .line 82
    invoke-direct {v0, p3, p4}, Ln4/c;-><init>(Landroid/content/Context;Lcom/bumptech/glide/l;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    new-instance v0, Ln4/k;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    :goto_2
    iput-object v0, p0, Lcom/bumptech/glide/m;->q:Ln4/b;

    .line 92
    .line 93
    iget-object p3, p1, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 94
    .line 95
    monitor-enter p3

    .line 96
    :try_start_0
    iget-object p4, p1, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p4

    .line 102
    if-nez p4, :cond_9

    .line 103
    .line 104
    iget-object p4, p1, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 110
    sget-object p3, Lu4/m;->a:[C

    .line 111
    .line 112
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    if-ne p3, p4, :cond_4

    .line 121
    .line 122
    move v3, v4

    .line 123
    :cond_4
    if-nez v3, :cond_5

    .line 124
    .line 125
    invoke-static {}, Lu4/m;->f()Landroid/os/Handler;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    invoke-interface {p2, p0}, Ln4/g;->a(Ln4/i;)V

    .line 134
    .line 135
    .line 136
    :goto_3
    invoke-interface {p2, v0}, Ln4/g;->a(Ln4/i;)V

    .line 137
    .line 138
    .line 139
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 140
    .line 141
    iget-object p3, p1, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/e;

    .line 142
    .line 143
    iget-object p3, p3, Lcom/bumptech/glide/e;->e:Ljava/util/List;

    .line 144
    .line 145
    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 146
    .line 147
    .line 148
    iput-object p2, p0, Lcom/bumptech/glide/m;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 149
    .line 150
    iget-object p1, p1, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/e;

    .line 151
    .line 152
    monitor-enter p1

    .line 153
    :try_start_1
    iget-object p2, p1, Lcom/bumptech/glide/e;->j:Lq4/e;

    .line 154
    .line 155
    if-nez p2, :cond_6

    .line 156
    .line 157
    iget-object p2, p1, Lcom/bumptech/glide/e;->d:Ly5/f;

    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance p2, Lq4/e;

    .line 163
    .line 164
    invoke-direct {p2}, Lq4/a;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-boolean v4, p2, Lq4/a;->u:Z

    .line 168
    .line 169
    iput-object p2, p1, Lcom/bumptech/glide/e;->j:Lq4/e;

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :catchall_0
    move-exception p2

    .line 173
    goto :goto_6

    .line 174
    :cond_6
    :goto_4
    iget-object p2, p1, Lcom/bumptech/glide/e;->j:Lq4/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    .line 176
    monitor-exit p1

    .line 177
    monitor-enter p0

    .line 178
    :try_start_2
    invoke-virtual {p2}, Lq4/a;->b()Lq4/a;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Lq4/e;

    .line 183
    .line 184
    iget-boolean p2, p1, Lq4/a;->u:Z

    .line 185
    .line 186
    if-eqz p2, :cond_8

    .line 187
    .line 188
    iget-boolean p2, p1, Lq4/a;->v:Z

    .line 189
    .line 190
    if-eqz p2, :cond_7

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 194
    .line 195
    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    .line 196
    .line 197
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1

    .line 201
    :cond_8
    :goto_5
    iput-boolean v4, p1, Lq4/a;->v:Z

    .line 202
    .line 203
    iput-boolean v4, p1, Lq4/a;->u:Z

    .line 204
    .line 205
    iput-object p1, p0, Lcom/bumptech/glide/m;->s:Lq4/e;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 206
    .line 207
    monitor-exit p0

    .line 208
    return-void

    .line 209
    :catchall_1
    move-exception p1

    .line 210
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 211
    throw p1

    .line 212
    :goto_6
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 213
    throw p2

    .line 214
    :catchall_2
    move-exception p1

    .line 215
    goto :goto_7

    .line 216
    :cond_9
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    const-string p2, "Cannot register already registered manager"

    .line 219
    .line 220
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p1

    .line 224
    :goto_7
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 225
    throw p1
.end method


# virtual methods
.method public final declared-synchronized d()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/m;->o:Ln4/q;

    .line 3
    .line 4
    invoke-virtual {v0}, Ln4/q;->d()V

    .line 5
    .line 6
    .line 7
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    :try_start_1
    iget-object v0, p0, Lcom/bumptech/glide/m;->o:Ln4/q;

    .line 9
    .line 10
    iget-object v0, v0, Ln4/q;->j:Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {v0}, Lu4/m;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    if-ge v3, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    check-cast v4, Lr4/e;

    .line 31
    .line 32
    invoke-virtual {p0, v4}, Lcom/bumptech/glide/m;->l(Lr4/e;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_3

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/m;->o:Ln4/q;

    .line 39
    .line 40
    iget-object v0, v0, Ln4/q;->j:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    :try_start_2
    monitor-exit p0

    .line 46
    iget-object v0, p0, Lcom/bumptech/glide/m;->m:Ln4/p;

    .line 47
    .line 48
    iget-object v1, v0, Ln4/p;->l:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/util/Set;

    .line 51
    .line 52
    invoke-static {v1}, Lu4/m;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    :goto_1
    if-ge v2, v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    check-cast v4, Lq4/c;

    .line 69
    .line 70
    invoke-virtual {v0, v4}, Ln4/p;->a(Lq4/c;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    iget-object v0, v0, Ln4/p;->m:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/bumptech/glide/m;->l:Ln4/g;

    .line 82
    .line 83
    invoke-interface {v0, p0}, Ln4/g;->l(Ln4/i;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/bumptech/glide/m;->l:Ln4/g;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/bumptech/glide/m;->q:Ln4/b;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Ln4/g;->l(Ln4/i;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/bumptech/glide/m;->p:La1/f;

    .line 94
    .line 95
    invoke-static {}, Lu4/m;->f()Landroid/os/Handler;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/bumptech/glide/m;->j:Lcom/bumptech/glide/b;

    .line 103
    .line 104
    iget-object v1, v0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 105
    .line 106
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 107
    :try_start_3
    iget-object v2, v0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    iget-object v0, v0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    monitor-exit p0

    .line 122
    return-void

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto :goto_2

    .line 125
    :cond_2
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    const-string v2, "Cannot unregister not yet registered manager"

    .line 128
    .line 129
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 134
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 135
    :catchall_2
    move-exception v0

    .line 136
    goto :goto_4

    .line 137
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 138
    :try_start_7
    throw v0

    .line 139
    :goto_4
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 140
    throw v0
.end method

.method public final declared-synchronized f()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/m;->o:Ln4/q;

    .line 3
    .line 4
    invoke-virtual {v0}, Ln4/q;->f()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bumptech/glide/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final declared-synchronized k()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/m;->o()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/bumptech/glide/m;->o:Ln4/q;

    .line 6
    .line 7
    invoke-virtual {v0}, Ln4/q;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final l(Lr4/e;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/m;->p(Lr4/e;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-interface {p1}, Lr4/e;->i()Lq4/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lcom/bumptech/glide/m;->j:Lcom/bumptech/glide/b;

    .line 15
    .line 16
    iget-object v2, v0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    iget-object v0, v0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    :cond_1
    if-ge v4, v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    check-cast v5, Lcom/bumptech/glide/m;

    .line 35
    .line 36
    invoke-virtual {v5, p1}, Lcom/bumptech/glide/m;->p(Lr4/e;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    monitor-exit v2

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-interface {p1, v0}, Lr4/e;->b(Lq4/c;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Lq4/c;->clear()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p1

    .line 59
    :cond_3
    :goto_1
    return-void
.end method

.method public final m(Ljava/lang/String;)Lcom/bumptech/glide/j;
    .locals 4

    .line 1
    new-instance v0, Lcom/bumptech/glide/j;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/m;->j:Lcom/bumptech/glide/b;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/m;->k:Landroid/content/Context;

    .line 6
    .line 7
    const-class v3, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-direct {v0, v1, p0, v3, v2}, Lcom/bumptech/glide/j;-><init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/m;Ljava/lang/Class;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->w(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final declared-synchronized n()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/m;->m:Ln4/p;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Ln4/p;->k:Z

    .line 6
    .line 7
    iget-object v1, v0, Ln4/p;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Lu4/m;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    check-cast v4, Lq4/c;

    .line 29
    .line 30
    invoke-interface {v4}, Lq4/c;->isRunning()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-interface {v4}, Lq4/c;->pause()V

    .line 37
    .line 38
    .line 39
    iget-object v5, v0, Ln4/p;->m:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v0
.end method

.method public final declared-synchronized o()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/m;->m:Ln4/p;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Ln4/p;->k:Z

    .line 6
    .line 7
    iget-object v2, v0, Ln4/p;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v2}, Lu4/m;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    :cond_0
    :goto_0
    if-ge v1, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    check-cast v4, Lq4/c;

    .line 28
    .line 29
    invoke-interface {v4}, Lq4/c;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    invoke-interface {v4}, Lq4/c;->isRunning()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    invoke-interface {v4}, Lq4/c;->h()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v0, v0, Ln4/p;->m:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized p(Lr4/e;)Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Lr4/e;->i()Lq4/c;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/m;->m:Ln4/p;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ln4/p;->a(Lq4/c;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bumptech/glide/m;->o:Ln4/q;

    .line 20
    .line 21
    iget-object v0, v0, Ln4/q;->j:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p1, v0}, Lr4/e;->b(Lq4/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return v1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    monitor-exit p0

    .line 35
    const/4 p1, 0x0

    .line 36
    return p1

    .line 37
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    throw p1
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "{tracker="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/bumptech/glide/m;->m:Ln4/p;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", treeNode="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/bumptech/glide/m;->n:Lk2/b;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "}"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-object v0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw v0
.end method
