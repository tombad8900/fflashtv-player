.class public final Lokhttp3/internal/http2/f$d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/internal/http2/i;
.implements Ly6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final reader:Lokhttp3/internal/http2/h;

.field final synthetic this$0:Lokhttp3/internal/http2/f;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http2/f;Lokhttp3/internal/http2/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/http2/h;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "reader"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/http2/f$d;->reader:Lokhttp3/internal/http2/h;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public ackSettings()V
    .locals 0

    .line 1
    return-void
.end method

.method public alternateService(ILjava/lang/String;Lv7/m;Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    const-string p1, "origin"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "protocol"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "host"

    .line 12
    .line 13
    invoke-static {p1, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final applyAndAckSettings(ZLokhttp3/internal/http2/o;)V
    .locals 11

    .line 1
    const-string v0, "settings"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lz6/n;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 12
    .line 13
    invoke-virtual {v1}, Lokhttp3/internal/http2/f;->getWriter()Lokhttp3/internal/http2/k;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 18
    .line 19
    monitor-enter v1

    .line 20
    :try_start_0
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getPeerSettings()Lokhttp3/internal/http2/o;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Lokhttp3/internal/http2/o;

    .line 29
    .line 30
    invoke-direct {p1}, Lokhttp3/internal/http2/o;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v3}, Lokhttp3/internal/http2/o;->merge(Lokhttp3/internal/http2/o;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Lokhttp3/internal/http2/o;->merge(Lokhttp3/internal/http2/o;)V

    .line 37
    .line 38
    .line 39
    move-object p2, p1

    .line 40
    :goto_0
    iput-object p2, v0, Lz6/n;->j:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p2}, Lokhttp3/internal/http2/o;->getInitialWindowSize()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    int-to-long p1, p1

    .line 47
    invoke-virtual {v3}, Lokhttp3/internal/http2/o;->getInitialWindowSize()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    int-to-long v3, v3

    .line 52
    sub-long/2addr p1, v3

    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    cmp-long v5, p1, v3

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getStreams$okhttp()Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getStreams$okhttp()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    new-array v7, v6, [Lokhttp3/internal/http2/j;

    .line 80
    .line 81
    invoke-interface {v5, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, [Lokhttp3/internal/http2/j;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto :goto_5

    .line 90
    :cond_2
    :goto_1
    const/4 v5, 0x0

    .line 91
    :goto_2
    iget-object v7, v0, Lz6/n;->j:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v7, Lokhttp3/internal/http2/o;

    .line 94
    .line 95
    invoke-virtual {v2, v7}, Lokhttp3/internal/http2/f;->setPeerSettings(Lokhttp3/internal/http2/o;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Lokhttp3/internal/http2/f;->access$getSettingsListenerQueue$p(Lokhttp3/internal/http2/f;)Lokhttp3/internal/concurrent/c;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    new-instance v8, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getConnectionName$okhttp()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v9, " onSettings"

    .line 115
    .line 116
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    new-instance v9, Lokhttp3/internal/http2/f$d$a;

    .line 124
    .line 125
    const/4 v10, 0x1

    .line 126
    invoke-direct {v9, v8, v10, v2, v0}, Lokhttp3/internal/http2/f$d$a;-><init>(Ljava/lang/String;ZLokhttp3/internal/http2/f;Lz6/n;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v9, v3, v4}, Lokhttp3/internal/concurrent/c;->schedule(Lokhttp3/internal/concurrent/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    .line 132
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    :try_start_3
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getWriter()Lokhttp3/internal/http2/k;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-object v0, v0, Lz6/n;->j:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lokhttp3/internal/http2/o;

    .line 140
    .line 141
    invoke-virtual {v3, v0}, Lokhttp3/internal/http2/k;->applyAndAckSettings(Lokhttp3/internal/http2/o;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catchall_1
    move-exception p1

    .line 146
    goto :goto_6

    .line 147
    :catch_0
    move-exception v0

    .line 148
    :try_start_4
    invoke-static {v2, v0}, Lokhttp3/internal/http2/f;->access$failConnection(Lokhttp3/internal/http2/f;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    .line 150
    .line 151
    :goto_3
    monitor-exit v1

    .line 152
    if-eqz v5, :cond_3

    .line 153
    .line 154
    array-length v0, v5

    .line 155
    :goto_4
    if-ge v6, v0, :cond_3

    .line 156
    .line 157
    aget-object v1, v5, v6

    .line 158
    .line 159
    monitor-enter v1

    .line 160
    :try_start_5
    invoke-virtual {v1, p1, p2}, Lokhttp3/internal/http2/j;->addBytesToWriteWindow(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 161
    .line 162
    .line 163
    monitor-exit v1

    .line 164
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :catchall_2
    move-exception p1

    .line 168
    monitor-exit v1

    .line 169
    throw p1

    .line 170
    :cond_3
    return-void

    .line 171
    :goto_5
    :try_start_6
    monitor-exit v2

    .line 172
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 173
    :goto_6
    monitor-exit v1

    .line 174
    throw p1
.end method

.method public data(ZILv7/l;I)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lokhttp3/internal/http2/f;->pushedStream$okhttp(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 15
    .line 16
    invoke-virtual {v0, p2, p3, p4, p1}, Lokhttp3/internal/http2/f;->pushDataLater$okhttp(ILv7/l;IZ)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lokhttp3/internal/http2/f;->getStream(I)Lokhttp3/internal/http2/j;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 29
    .line 30
    sget-object v0, Lokhttp3/internal/http2/b;->PROTOCOL_ERROR:Lokhttp3/internal/http2/b;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Lokhttp3/internal/http2/f;->writeSynResetLater$okhttp(ILokhttp3/internal/http2/b;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 36
    .line 37
    int-to-long v0, p4

    .line 38
    invoke-virtual {p1, v0, v1}, Lokhttp3/internal/http2/f;->updateConnectionFlowControl$okhttp(J)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p3, v0, v1}, Lv7/l;->skip(J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-virtual {v0, p3, p4}, Lokhttp3/internal/http2/j;->receiveData(Lv7/l;I)V

    .line 46
    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    sget-object p1, Lq7/c;->EMPTY_HEADERS:Lokhttp3/y;

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    invoke-virtual {v0, p1, p2}, Lokhttp3/internal/http2/j;->receiveHeaders(Lokhttp3/y;Z)V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public final getReader$okhttp()Lokhttp3/internal/http2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->reader:Lokhttp3/internal/http2/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public goAway(ILokhttp3/internal/http2/b;Lv7/m;)V
    .locals 3

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "debugData"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Lv7/m;->d()I

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 15
    .line 16
    monitor-enter p2

    .line 17
    :try_start_0
    invoke-virtual {p2}, Lokhttp3/internal/http2/f;->getStreams$okhttp()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    const/4 v0, 0x0

    .line 26
    new-array v1, v0, [Lokhttp3/internal/http2/j;

    .line 27
    .line 28
    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-static {p2, v1}, Lokhttp3/internal/http2/f;->access$setShutdown$p(Lokhttp3/internal/http2/f;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p2

    .line 37
    check-cast p3, [Lokhttp3/internal/http2/j;

    .line 38
    .line 39
    array-length p2, p3

    .line 40
    :goto_0
    if-ge v0, p2, :cond_1

    .line 41
    .line 42
    aget-object v1, p3, v0

    .line 43
    .line 44
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-le v2, p1, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->isLocallyInitiated()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    sget-object v2, Lokhttp3/internal/http2/b;->REFUSED_STREAM:Lokhttp3/internal/http2/b;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Lokhttp3/internal/http2/j;->receiveRstStream(Lokhttp3/internal/http2/b;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 62
    .line 63
    invoke-virtual {v1}, Lokhttp3/internal/http2/j;->getId()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v2, v1}, Lokhttp3/internal/http2/f;->removeStream$okhttp(I)Lokhttp3/internal/http2/j;

    .line 68
    .line 69
    .line 70
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    return-void

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    monitor-exit p2

    .line 76
    throw p1
.end method

.method public headers(ZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lokhttp3/internal/http2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string p3, "headerBlock"

    .line 2
    .line 3
    invoke-static {p3, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 7
    .line 8
    invoke-virtual {p3, p2}, Lokhttp3/internal/http2/f;->pushedStream$okhttp(I)Z

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    iget-object p3, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 15
    .line 16
    invoke-virtual {p3, p2, p4, p1}, Lokhttp3/internal/http2/f;->pushHeadersLater$okhttp(ILjava/util/List;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v2, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 21
    .line 22
    monitor-enter v2

    .line 23
    :try_start_0
    invoke-virtual {v2, p2}, Lokhttp3/internal/http2/f;->getStream(I)Lokhttp3/internal/http2/j;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    if-nez p3, :cond_4

    .line 28
    .line 29
    invoke-static {v2}, Lokhttp3/internal/http2/f;->access$isShutdown$p(Lokhttp3/internal/http2/f;)Z

    .line 30
    .line 31
    .line 32
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    monitor-exit v2

    .line 36
    return-void

    .line 37
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getLastGoodStreamId$okhttp()I

    .line 38
    .line 39
    .line 40
    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    if-gt p2, p3, :cond_2

    .line 42
    .line 43
    monitor-exit v2

    .line 44
    return-void

    .line 45
    :cond_2
    :try_start_2
    rem-int/lit8 p3, p2, 0x2

    .line 46
    .line 47
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getNextStreamId$okhttp()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    rem-int/lit8 v0, v0, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    if-ne p3, v0, :cond_3

    .line 54
    .line 55
    monitor-exit v2

    .line 56
    return-void

    .line 57
    :cond_3
    :try_start_3
    invoke-static {p4}, Lq7/c;->toHeaders(Ljava/util/List;)Lokhttp3/y;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    new-instance v0, Lokhttp3/internal/http2/j;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    move v4, p1

    .line 65
    move v1, p2

    .line 66
    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/http2/j;-><init>(ILokhttp3/internal/http2/f;ZZLokhttp3/y;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v1}, Lokhttp3/internal/http2/f;->setLastGoodStreamId$okhttp(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getStreams$okhttp()Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Lokhttp3/internal/http2/f;->access$getTaskRunner$p(Lokhttp3/internal/http2/f;)Lokhttp3/internal/concurrent/e;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lokhttp3/internal/concurrent/e;->newQueue()Lokhttp3/internal/concurrent/c;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance p2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getConnectionName$okhttp()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 p3, 0x5b

    .line 104
    .line 105
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p3, "] onStream"

    .line 112
    .line 113
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    new-instance p3, Lokhttp3/internal/http2/f$d$b;

    .line 121
    .line 122
    const/4 p4, 0x1

    .line 123
    invoke-direct {p3, p2, p4, v2, v0}, Lokhttp3/internal/http2/f$d$b;-><init>(Ljava/lang/String;ZLokhttp3/internal/http2/f;Lokhttp3/internal/http2/j;)V

    .line 124
    .line 125
    .line 126
    const-wide/16 v0, 0x0

    .line 127
    .line 128
    invoke-virtual {p1, p3, v0, v1}, Lokhttp3/internal/concurrent/c;->schedule(Lokhttp3/internal/concurrent/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 129
    .line 130
    .line 131
    monitor-exit v2

    .line 132
    return-void

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move-object p1, v0

    .line 135
    goto :goto_0

    .line 136
    :cond_4
    move v4, p1

    .line 137
    monitor-exit v2

    .line 138
    invoke-static {p4}, Lq7/c;->toHeaders(Ljava/util/List;)Lokhttp3/y;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p3, p1, v4}, Lokhttp3/internal/http2/j;->receiveHeaders(Lokhttp3/y;Z)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :goto_0
    monitor-exit v2

    .line 147
    throw p1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/http2/f$d;->invoke()V

    sget-object v0, Ll6/j;->a:Ll6/j;

    return-object v0
.end method

.method public invoke()V
    .locals 5

    .line 2
    sget-object v0, Lokhttp3/internal/http2/b;->INTERNAL_ERROR:Lokhttp3/internal/http2/b;

    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lokhttp3/internal/http2/f$d;->reader:Lokhttp3/internal/http2/h;

    invoke-virtual {v2, p0}, Lokhttp3/internal/http2/h;->readConnectionPreface(Lokhttp3/internal/http2/i;)V

    .line 4
    :cond_0
    iget-object v2, p0, Lokhttp3/internal/http2/f$d;->reader:Lokhttp3/internal/http2/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, Lokhttp3/internal/http2/h;->nextFrame(ZLokhttp3/internal/http2/i;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 5
    sget-object v2, Lokhttp3/internal/http2/b;->NO_ERROR:Lokhttp3/internal/http2/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    sget-object v0, Lokhttp3/internal/http2/b;->CANCEL:Lokhttp3/internal/http2/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    iget-object v3, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    invoke-virtual {v3, v2, v0, v1}, Lokhttp3/internal/http2/f;->close$okhttp(Lokhttp3/internal/http2/b;Lokhttp3/internal/http2/b;Ljava/io/IOException;)V

    .line 8
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->reader:Lokhttp3/internal/http2/h;

    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v3

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v3

    move-object v2, v0

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v2, v0

    .line 9
    :goto_1
    :try_start_2
    sget-object v0, Lokhttp3/internal/http2/b;->PROTOCOL_ERROR:Lokhttp3/internal/http2/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    iget-object v2, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    invoke-virtual {v2, v0, v0, v1}, Lokhttp3/internal/http2/f;->close$okhttp(Lokhttp3/internal/http2/b;Lokhttp3/internal/http2/b;Ljava/io/IOException;)V

    goto :goto_0

    :goto_2
    iget-object v4, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    invoke-virtual {v4, v2, v0, v1}, Lokhttp3/internal/http2/f;->close$okhttp(Lokhttp3/internal/http2/b;Lokhttp3/internal/http2/b;Ljava/io/IOException;)V

    .line 11
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->reader:Lokhttp3/internal/http2/h;

    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    throw v3
.end method

.method public ping(ZII)V
    .locals 8

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    const/4 p3, 0x1

    .line 7
    const-wide/16 v0, 0x1

    .line 8
    .line 9
    if-eq p2, p3, :cond_2

    .line 10
    .line 11
    const/4 p3, 0x2

    .line 12
    if-eq p2, p3, :cond_1

    .line 13
    .line 14
    const/4 p3, 0x3

    .line 15
    if-eq p2, p3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    invoke-static {p1}, Lokhttp3/internal/http2/f;->access$getAwaitPongsReceived$p(Lokhttp3/internal/http2/f;)J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    add-long/2addr p2, v0

    .line 23
    invoke-static {p1, p2, p3}, Lokhttp3/internal/http2/f;->access$setAwaitPongsReceived$p(Lokhttp3/internal/http2/f;J)V

    .line 24
    .line 25
    .line 26
    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p2, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {p1}, Lokhttp3/internal/http2/f;->access$getDegradedPongsReceived$p(Lokhttp3/internal/http2/f;)J

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    add-long/2addr p2, v0

    .line 43
    invoke-static {p1, p2, p3}, Lokhttp3/internal/http2/f;->access$setDegradedPongsReceived$p(Lokhttp3/internal/http2/f;J)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p1}, Lokhttp3/internal/http2/f;->access$getIntervalPongsReceived$p(Lokhttp3/internal/http2/f;)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    add-long/2addr p2, v0

    .line 52
    invoke-static {p1, p2, p3}, Lokhttp3/internal/http2/f;->access$setIntervalPongsReceived$p(Lokhttp3/internal/http2/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :goto_0
    monitor-exit p1

    .line 56
    return-void

    .line 57
    :goto_1
    monitor-exit p1

    .line 58
    throw p2

    .line 59
    :cond_3
    iget-object p1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 60
    .line 61
    invoke-static {p1}, Lokhttp3/internal/http2/f;->access$getWriterQueue$p(Lokhttp3/internal/http2/f;)Lokhttp3/internal/concurrent/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 71
    .line 72
    invoke-virtual {v1}, Lokhttp3/internal/http2/f;->getConnectionName$okhttp()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, " ping"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget-object v5, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 89
    .line 90
    new-instance v2, Lokhttp3/internal/http2/f$d$c;

    .line 91
    .line 92
    const/4 v4, 0x1

    .line 93
    move v6, p2

    .line 94
    move v7, p3

    .line 95
    invoke-direct/range {v2 .. v7}, Lokhttp3/internal/http2/f$d$c;-><init>(Ljava/lang/String;ZLokhttp3/internal/http2/f;II)V

    .line 96
    .line 97
    .line 98
    const-wide/16 p2, 0x0

    .line 99
    .line 100
    invoke-virtual {p1, v2, p2, p3}, Lokhttp3/internal/concurrent/c;->schedule(Lokhttp3/internal/concurrent/a;J)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public priority(IIIZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public pushPromise(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lokhttp3/internal/http2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string p1, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3}, Lokhttp3/internal/http2/f;->pushRequestLater$okhttp(ILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public rstStream(ILokhttp3/internal/http2/b;)V
    .locals 1

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lokhttp3/internal/http2/f;->pushedStream$okhttp(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lokhttp3/internal/http2/f;->pushResetLater$okhttp(ILokhttp3/internal/http2/b;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lokhttp3/internal/http2/f;->removeStream$okhttp(I)Lokhttp3/internal/http2/j;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lokhttp3/internal/http2/j;->receiveRstStream(Lokhttp3/internal/http2/b;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public settings(ZLokhttp3/internal/http2/o;)V
    .locals 9

    .line 1
    const-string v0, "settings"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 7
    .line 8
    invoke-static {v0}, Lokhttp3/internal/http2/f;->access$getWriterQueue$p(Lokhttp3/internal/http2/f;)Lokhttp3/internal/concurrent/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 18
    .line 19
    invoke-virtual {v2}, Lokhttp3/internal/http2/f;->getConnectionName$okhttp()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, " applyAndAckSettings"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v3, Lokhttp3/internal/http2/f$d$d;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    move-object v6, p0

    .line 39
    move v7, p1

    .line 40
    move-object v8, p2

    .line 41
    invoke-direct/range {v3 .. v8}, Lokhttp3/internal/http2/f$d$d;-><init>(Ljava/lang/String;ZLokhttp3/internal/http2/f$d;ZLokhttp3/internal/http2/o;)V

    .line 42
    .line 43
    .line 44
    const-wide/16 p1, 0x0

    .line 45
    .line 46
    invoke-virtual {v0, v3, p1, p2}, Lokhttp3/internal/concurrent/c;->schedule(Lokhttp3/internal/concurrent/a;J)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public windowUpdate(IJ)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/internal/http2/f;->getWriteBytesMaximum()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    add-long/2addr v0, p2

    .line 11
    invoke-static {p1, v0, v1}, Lokhttp3/internal/http2/f;->access$setWriteBytesMaximum$p(Lokhttp3/internal/http2/f;J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p1

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p2

    .line 20
    monitor-exit p1

    .line 21
    throw p2

    .line 22
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http2/f$d;->this$0:Lokhttp3/internal/http2/f;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lokhttp3/internal/http2/f;->getStream(I)Lokhttp3/internal/http2/j;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    monitor-enter p1

    .line 31
    :try_start_1
    invoke-virtual {p1, p2, p3}, Lokhttp3/internal/http2/j;->addBytesToWriteWindow(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    monitor-exit p1

    .line 35
    return-void

    .line 36
    :catchall_1
    move-exception p2

    .line 37
    monitor-exit p1

    .line 38
    throw p2

    .line 39
    :cond_1
    return-void
.end method
