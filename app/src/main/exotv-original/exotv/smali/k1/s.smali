.class public final Lk1/s;
.super Lk1/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final u:Ljava/util/Set;


# instance fields
.field public final n:Ljava/io/FileDescriptor;

.field public final o:J

.field public final p:J

.field public q:Landroid/net/Uri;

.field public r:Ljava/io/FileInputStream;

.field public s:J

.field public t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lk1/s;->u:Ljava/util/Set;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/io/FileDescriptor;JJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lk1/c;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lk1/s;->n:Ljava/io/FileDescriptor;

    .line 9
    .line 10
    iput-wide p2, p0, Lk1/s;->o:J

    .line 11
    .line 12
    iput-wide p4, p0, Lk1/s;->p:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lk1/s;->q:Landroid/net/Uri;

    .line 3
    .line 4
    sget-object v1, Lk1/s;->u:Ljava/util/Set;

    .line 5
    .line 6
    iget-object v2, p0, Lk1/s;->n:Ljava/io/FileDescriptor;

    .line 7
    .line 8
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    iget-object v2, p0, Lk1/s;->r:Ljava/io/FileInputStream;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v2

    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception v2

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    iput-object v0, p0, Lk1/s;->r:Ljava/io/FileInputStream;

    .line 25
    .line 26
    iget-boolean v0, p0, Lk1/s;->t:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iput-boolean v1, p0, Lk1/s;->t:Z

    .line 31
    .line 32
    invoke-virtual {p0}, Lk1/c;->k()V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :goto_1
    :try_start_1
    new-instance v3, Lk1/i;

    .line 37
    .line 38
    const/16 v4, 0x7d0

    .line 39
    .line 40
    invoke-direct {v3, v2, v4}, Lk1/i;-><init>(Ljava/lang/Exception;I)V

    .line 41
    .line 42
    .line 43
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    :goto_2
    iput-object v0, p0, Lk1/s;->r:Ljava/io/FileInputStream;

    .line 45
    .line 46
    iget-boolean v0, p0, Lk1/s;->t:Z

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iput-boolean v1, p0, Lk1/s;->t:Z

    .line 51
    .line 52
    invoke-virtual {p0}, Lk1/c;->k()V

    .line 53
    .line 54
    .line 55
    :cond_2
    throw v2
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/s;->q:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final open(Lk1/l;)J
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lk1/s;->n:Ljava/io/FileDescriptor;

    .line 6
    .line 7
    :try_start_0
    iget-object v4, v0, Lk1/l;->a:Landroid/net/Uri;

    .line 8
    .line 9
    iget-wide v5, v0, Lk1/l;->f:J

    .line 10
    .line 11
    iget-wide v7, v0, Lk1/l;->e:J

    .line 12
    .line 13
    iput-object v4, v1, Lk1/s;->q:Landroid/net/Uri;

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p1}, Lk1/c;->l(Lk1/l;)V

    .line 16
    .line 17
    .line 18
    sget-object v4, Lk1/s;->u:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4
    :try_end_0
    .catch Lk1/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    if-eqz v4, :cond_9

    .line 25
    .line 26
    iget-wide v9, v1, Lk1/s;->p:J

    .line 27
    .line 28
    const-wide/16 v11, -0x1

    .line 29
    .line 30
    cmp-long v4, v9, v11

    .line 31
    .line 32
    const/16 v13, 0x7d8

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    cmp-long v14, v7, v9

    .line 37
    .line 38
    if-gtz v14, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    :try_start_1
    new-instance v0, Lk1/i;

    .line 42
    .line 43
    invoke-direct {v0, v13}, Lk1/i;-><init>(I)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    const/16 v3, 0x7d0

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :catch_1
    move-exception v0

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_1
    :goto_0
    iget-wide v14, v1, Lk1/s;->o:J
    :try_end_1
    .catch Lk1/i; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    .line 57
    add-long/2addr v14, v7

    .line 58
    :try_start_2
    sget v3, Landroid/system/OsConstants;->SEEK_SET:I

    .line 59
    .line 60
    invoke-static {v2, v14, v15, v3}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_2
    .catch Landroid/system/ErrnoException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lk1/i; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 61
    .line 62
    .line 63
    :try_start_3
    new-instance v3, Ljava/io/FileInputStream;

    .line 64
    .line 65
    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 66
    .line 67
    .line 68
    iput-object v3, v1, Lk1/s;->r:Ljava/io/FileInputStream;

    .line 69
    .line 70
    const-wide/16 v14, 0x0

    .line 71
    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    cmp-long v7, v3, v14

    .line 83
    .line 84
    if-nez v7, :cond_2

    .line 85
    .line 86
    iput-wide v11, v1, Lk1/s;->s:J

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->position()J

    .line 90
    .line 91
    .line 92
    move-result-wide v7

    .line 93
    sub-long/2addr v3, v7

    .line 94
    iput-wide v3, v1, Lk1/s;->s:J

    .line 95
    .line 96
    cmp-long v2, v3, v14

    .line 97
    .line 98
    if-ltz v2, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    new-instance v0, Lk1/i;

    .line 102
    .line 103
    invoke-direct {v0, v13}, Lk1/i;-><init>(I)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :cond_4
    sub-long/2addr v9, v7

    .line 108
    iput-wide v9, v1, Lk1/s;->s:J
    :try_end_3
    .catch Lk1/i; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 109
    .line 110
    cmp-long v2, v9, v14

    .line 111
    .line 112
    if-ltz v2, :cond_8

    .line 113
    .line 114
    :goto_1
    cmp-long v2, v5, v11

    .line 115
    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    iget-wide v3, v1, Lk1/s;->s:J

    .line 119
    .line 120
    cmp-long v7, v3, v11

    .line 121
    .line 122
    if-nez v7, :cond_5

    .line 123
    .line 124
    move-wide v3, v5

    .line 125
    goto :goto_2

    .line 126
    :cond_5
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    :goto_2
    iput-wide v3, v1, Lk1/s;->s:J

    .line 131
    .line 132
    :cond_6
    const/4 v3, 0x1

    .line 133
    iput-boolean v3, v1, Lk1/s;->t:Z

    .line 134
    .line 135
    invoke-virtual/range {p0 .. p1}, Lk1/c;->m(Lk1/l;)V

    .line 136
    .line 137
    .line 138
    if-eqz v2, :cond_7

    .line 139
    .line 140
    return-wide v5

    .line 141
    :cond_7
    iget-wide v2, v1, Lk1/s;->s:J

    .line 142
    .line 143
    return-wide v2

    .line 144
    :cond_8
    :try_start_4
    new-instance v0, Lk1/i;

    .line 145
    .line 146
    invoke-direct {v0, v13}, Lk1/i;-><init>(I)V

    .line 147
    .line 148
    .line 149
    throw v0

    .line 150
    :catch_2
    move-exception v0

    .line 151
    new-instance v2, Lk1/i;
    :try_end_4
    .catch Lk1/i; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 152
    .line 153
    const/16 v3, 0x7d0

    .line 154
    .line 155
    :try_start_5
    invoke-direct {v2, v0, v3}, Lk1/i;-><init>(Ljava/lang/Exception;I)V

    .line 156
    .line 157
    .line 158
    throw v2

    .line 159
    :cond_9
    const/16 v3, 0x7d0

    .line 160
    .line 161
    new-instance v0, Lk1/i;

    .line 162
    .line 163
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    const-string v4, "Attempted to re-use an already in-use file descriptor"

    .line 166
    .line 167
    invoke-direct {v2, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/4 v4, -0x2

    .line 171
    invoke-direct {v0, v2, v4}, Lk1/i;-><init>(Ljava/lang/Exception;I)V

    .line 172
    .line 173
    .line 174
    throw v0
    :try_end_5
    .catch Lk1/i; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 175
    :catch_3
    move-exception v0

    .line 176
    :goto_3
    new-instance v2, Lk1/i;

    .line 177
    .line 178
    instance-of v4, v0, Ljava/io/FileNotFoundException;

    .line 179
    .line 180
    if-eqz v4, :cond_a

    .line 181
    .line 182
    const/16 v3, 0x7d5

    .line 183
    .line 184
    :cond_a
    invoke-direct {v2, v0, v3}, Lk1/i;-><init>(Ljava/lang/Exception;I)V

    .line 185
    .line 186
    .line 187
    throw v2

    .line 188
    :goto_4
    throw v0
.end method

.method public final read([BII)I
    .locals 8

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget-wide v0, p0, Lk1/s;->s:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const-wide/16 v4, -0x1

    .line 16
    .line 17
    cmp-long v2, v0, v4

    .line 18
    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    int-to-long v6, p3

    .line 23
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    long-to-int p3, v0

    .line 28
    :goto_0
    :try_start_0
    iget-object v0, p0, Lk1/s;->r:Ljava/io/FileInputStream;

    .line 29
    .line 30
    sget v1, Lh1/i0;->a:I

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileInputStream;->read([BII)I

    .line 33
    .line 34
    .line 35
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    if-ne p1, v3, :cond_3

    .line 37
    .line 38
    :goto_1
    return v3

    .line 39
    :cond_3
    iget-wide p2, p0, Lk1/s;->s:J

    .line 40
    .line 41
    cmp-long v0, p2, v4

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    int-to-long v0, p1

    .line 46
    sub-long/2addr p2, v0

    .line 47
    iput-wide p2, p0, Lk1/s;->s:J

    .line 48
    .line 49
    :cond_4
    invoke-virtual {p0, p1}, Lk1/c;->j(I)V

    .line 50
    .line 51
    .line 52
    return p1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    new-instance p2, Lk1/i;

    .line 55
    .line 56
    const/16 p3, 0x7d0

    .line 57
    .line 58
    invoke-direct {p2, p1, p3}, Lk1/i;-><init>(Ljava/lang/Exception;I)V

    .line 59
    .line 60
    .line 61
    throw p2
.end method
