.class public final Lokhttp3/internal/http2/j$b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lv7/i0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private closed:Z

.field private finished:Z

.field private final sendBuffer:Lv7/j;

.field final synthetic this$0:Lokhttp3/internal/http2/j;

.field private trailers:Lokhttp3/y;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http2/j;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p2, p0, Lokhttp3/internal/http2/j$b;->finished:Z

    .line 3
    new-instance p1, Lv7/j;

    .line 4
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/internal/http2/j;ZILz6/e;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/http2/j$b;-><init>(Lokhttp3/internal/http2/j;Z)V

    return-void
.end method

.method private final emitFrame(Z)V
    .locals 12

    .line 1
    iget-object v1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteTimeout$okhttp()Lokhttp3/internal/http2/j$d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lv7/f;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteBytesTotal()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteBytesMaximum()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    cmp-long v0, v2, v4

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    iget-boolean v0, p0, Lokhttp3/internal/http2/j$b;->finished:Z

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-boolean v0, p0, Lokhttp3/internal/http2/j$b;->closed:Z

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getErrorCode$okhttp()Lokhttp3/internal/http2/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->waitForIo$okhttp()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteTimeout$okhttp()Lokhttp3/internal/http2/j$d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lokhttp3/internal/http2/j$d;->exitAndThrowIfTimedOut()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->checkOutNotClosed$okhttp()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteBytesMaximum()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteBytesTotal()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    sub-long/2addr v2, v4

    .line 63
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 64
    .line 65
    iget-wide v4, v0, Lv7/j;->k:J

    .line 66
    .line 67
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 68
    .line 69
    .line 70
    move-result-wide v10

    .line 71
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteBytesTotal()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    add-long/2addr v2, v10

    .line 76
    invoke-virtual {v1, v2, v3}, Lokhttp3/internal/http2/j;->setWriteBytesTotal$okhttp(J)V

    .line 77
    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    iget-object p1, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 82
    .line 83
    iget-wide v2, p1, Lv7/j;->k:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    cmp-long p1, v10, v2

    .line 86
    .line 87
    if-nez p1, :cond_1

    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    :goto_1
    move v8, p1

    .line 91
    goto :goto_2

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    move-object p1, v0

    .line 94
    goto :goto_4

    .line 95
    :cond_1
    const/4 p1, 0x0

    .line 96
    goto :goto_1

    .line 97
    :goto_2
    monitor-exit v1

    .line 98
    iget-object p1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 99
    .line 100
    invoke-virtual {p1}, Lokhttp3/internal/http2/j;->getWriteTimeout$okhttp()Lokhttp3/internal/http2/j$d;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lv7/f;->enter()V

    .line 105
    .line 106
    .line 107
    :try_start_3
    iget-object p1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 108
    .line 109
    invoke-virtual {p1}, Lokhttp3/internal/http2/j;->getConnection()Lokhttp3/internal/http2/f;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    iget-object p1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 114
    .line 115
    invoke-virtual {p1}, Lokhttp3/internal/http2/j;->getId()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    iget-object v9, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 120
    .line 121
    invoke-virtual/range {v6 .. v11}, Lokhttp3/internal/http2/f;->writeData(IZLv7/j;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 125
    .line 126
    invoke-virtual {p1}, Lokhttp3/internal/http2/j;->getWriteTimeout$okhttp()Lokhttp3/internal/http2/j$d;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lokhttp3/internal/http2/j$d;->exitAndThrowIfTimedOut()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :catchall_2
    move-exception v0

    .line 135
    move-object p1, v0

    .line 136
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 137
    .line 138
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->getWriteTimeout$okhttp()Lokhttp3/internal/http2/j$d;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Lokhttp3/internal/http2/j$d;->exitAndThrowIfTimedOut()V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :goto_3
    :try_start_4
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getWriteTimeout$okhttp()Lokhttp3/internal/http2/j$d;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Lokhttp3/internal/http2/j$d;->exitAndThrowIfTimedOut()V

    .line 151
    .line 152
    .line 153
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 154
    :goto_4
    monitor-exit v1

    .line 155
    throw p1
.end method


# virtual methods
.method public close()V
    .locals 10

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 2
    .line 3
    sget-boolean v1, Lq7/c;->assertionsEnabled:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "Thread "

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, " MUST NOT hold lock on "

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 51
    .line 52
    monitor-enter v1

    .line 53
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http2/j$b;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    monitor-exit v1

    .line 58
    return-void

    .line 59
    :cond_2
    :try_start_1
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getErrorCode$okhttp()Lokhttp3/internal/http2/b;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x1

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    move v0, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v0, v2

    .line 70
    :goto_1
    monitor-exit v1

    .line 71
    iget-object v1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 72
    .line 73
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getSink$okhttp()Lokhttp3/internal/http2/j$b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-boolean v1, v1, Lokhttp3/internal/http2/j$b;->finished:Z

    .line 78
    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    iget-object v1, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 82
    .line 83
    iget-wide v4, v1, Lv7/j;->k:J

    .line 84
    .line 85
    const-wide/16 v6, 0x0

    .line 86
    .line 87
    cmp-long v1, v4, v6

    .line 88
    .line 89
    if-lez v1, :cond_4

    .line 90
    .line 91
    move v1, v3

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move v1, v2

    .line 94
    :goto_2
    iget-object v4, p0, Lokhttp3/internal/http2/j$b;->trailers:Lokhttp3/y;

    .line 95
    .line 96
    if-eqz v4, :cond_6

    .line 97
    .line 98
    :goto_3
    iget-object v1, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 99
    .line 100
    iget-wide v4, v1, Lv7/j;->k:J

    .line 101
    .line 102
    cmp-long v1, v4, v6

    .line 103
    .line 104
    if-lez v1, :cond_5

    .line 105
    .line 106
    invoke-direct {p0, v2}, Lokhttp3/internal/http2/j$b;->emitFrame(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    iget-object v1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 111
    .line 112
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getConnection()Lokhttp3/internal/http2/f;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-object v2, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 117
    .line 118
    invoke-virtual {v2}, Lokhttp3/internal/http2/j;->getId()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    iget-object v4, p0, Lokhttp3/internal/http2/j$b;->trailers:Lokhttp3/y;

    .line 123
    .line 124
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v4}, Lq7/c;->toHeaderList(Lokhttp3/y;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v1, v2, v0, v4}, Lokhttp3/internal/http2/f;->writeHeaders$okhttp(IZLjava/util/List;)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_6
    if-eqz v1, :cond_7

    .line 136
    .line 137
    :goto_4
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 138
    .line 139
    iget-wide v0, v0, Lv7/j;->k:J

    .line 140
    .line 141
    cmp-long v0, v0, v6

    .line 142
    .line 143
    if-lez v0, :cond_8

    .line 144
    .line 145
    invoke-direct {p0, v3}, Lokhttp3/internal/http2/j$b;->emitFrame(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_7
    if-eqz v0, :cond_8

    .line 150
    .line 151
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 152
    .line 153
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->getConnection()Lokhttp3/internal/http2/f;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 158
    .line 159
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->getId()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    const/4 v7, 0x0

    .line 164
    const-wide/16 v8, 0x0

    .line 165
    .line 166
    const/4 v6, 0x1

    .line 167
    invoke-virtual/range {v4 .. v9}, Lokhttp3/internal/http2/f;->writeData(IZLv7/j;J)V

    .line 168
    .line 169
    .line 170
    :cond_8
    :goto_5
    iget-object v1, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 171
    .line 172
    monitor-enter v1

    .line 173
    :try_start_2
    iput-boolean v3, p0, Lokhttp3/internal/http2/j$b;->closed:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 174
    .line 175
    monitor-exit v1

    .line 176
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 177
    .line 178
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->getConnection()Lokhttp3/internal/http2/f;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Lokhttp3/internal/http2/f;->flush()V

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 186
    .line 187
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->cancelStreamIfNecessary$okhttp()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    monitor-exit v1

    .line 193
    throw v0

    .line 194
    :catchall_1
    move-exception v0

    .line 195
    monitor-exit v1

    .line 196
    throw v0
.end method

.method public flush()V
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 2
    .line 3
    sget-boolean v1, Lq7/c;->assertionsEnabled:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "Thread "

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, " MUST NOT hold lock on "

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :cond_1
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 51
    .line 52
    monitor-enter v0

    .line 53
    :try_start_0
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->checkOutNotClosed$okhttp()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    :goto_1
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 58
    .line 59
    iget-wide v0, v0, Lv7/j;->k:J

    .line 60
    .line 61
    const-wide/16 v2, 0x0

    .line 62
    .line 63
    cmp-long v0, v0, v2

    .line 64
    .line 65
    if-lez v0, :cond_2

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, v0}, Lokhttp3/internal/http2/j$b;->emitFrame(Z)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 72
    .line 73
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->getConnection()Lokhttp3/internal/http2/f;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lokhttp3/internal/http2/f;->flush()V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    return-void

    .line 82
    :catchall_0
    move-exception v1

    .line 83
    monitor-exit v0

    .line 84
    throw v1
.end method

.method public final getClosed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http2/j$b;->closed:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getFinished()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http2/j$b;->finished:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTrailers()Lokhttp3/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->trailers:Lokhttp3/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setClosed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/internal/http2/j$b;->closed:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFinished(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/internal/http2/j$b;->finished:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTrailers(Lokhttp3/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/http2/j$b;->trailers:Lokhttp3/y;

    .line 2
    .line 3
    return-void
.end method

.method public timeout()Lv7/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/http2/j;->getWriteTimeout$okhttp()Lokhttp3/internal/http2/j$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public write(Lv7/j;J)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->this$0:Lokhttp3/internal/http2/j;

    .line 7
    .line 8
    sget-boolean v1, Lq7/c;->assertionsEnabled:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p3, "Thread "

    .line 24
    .line 25
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p3, " MUST NOT hold lock on "

    .line 40
    .line 41
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 56
    .line 57
    invoke-virtual {v0, p1, p2, p3}, Lv7/j;->write(Lv7/j;J)V

    .line 58
    .line 59
    .line 60
    :goto_1
    iget-object p1, p0, Lokhttp3/internal/http2/j$b;->sendBuffer:Lv7/j;

    .line 61
    .line 62
    iget-wide p1, p1, Lv7/j;->k:J

    .line 63
    .line 64
    const-wide/16 v0, 0x4000

    .line 65
    .line 66
    cmp-long p1, p1, v0

    .line 67
    .line 68
    if-ltz p1, :cond_2

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    invoke-direct {p0, p1}, Lokhttp3/internal/http2/j$b;->emitFrame(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    return-void
.end method
