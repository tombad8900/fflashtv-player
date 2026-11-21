.class public final Lokhttp3/internal/ws/d$f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/ws/d;->connect(Lokhttp3/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $request:Lokhttp3/g0;

.field final synthetic this$0:Lokhttp3/internal/ws/d;


# direct methods
.method public constructor <init>(Lokhttp3/internal/ws/d;Lokhttp3/g0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/internal/ws/d$f;->$request:Lokhttp3/g0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/g;Ljava/io/IOException;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "e"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, p2, v0}, Lokhttp3/internal/ws/d;->failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onResponse(Lokhttp3/g;Lokhttp3/i0;)V
    .locals 3

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lokhttp3/i0;->exchange()Lokhttp3/internal/connection/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 16
    .line 17
    invoke-virtual {v0, p2, p1}, Lokhttp3/internal/ws/d;->checkUpgradeSuccess$okhttp(Lokhttp3/i0;Lokhttp3/internal/connection/c;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lokhttp3/internal/connection/c;->newWebSocketStreams()Lokhttp3/internal/ws/d$d;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 27
    sget-object v0, Lokhttp3/internal/ws/e;->Companion:Lokhttp3/internal/ws/e$a;

    .line 28
    .line 29
    invoke-virtual {p2}, Lokhttp3/i0;->headers()Lokhttp3/y;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lokhttp3/internal/ws/e$a;->parse(Lokhttp3/y;)Lokhttp3/internal/ws/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 38
    .line 39
    invoke-static {v1, v0}, Lokhttp3/internal/ws/d;->access$setExtensions$p(Lokhttp3/internal/ws/d;Lokhttp3/internal/ws/e;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 43
    .line 44
    invoke-static {v1, v0}, Lokhttp3/internal/ws/d;->access$isValid(Lokhttp3/internal/ws/d;Lokhttp3/internal/ws/e;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 51
    .line 52
    monitor-enter v0

    .line 53
    :try_start_1
    invoke-static {v0}, Lokhttp3/internal/ws/d;->access$getMessageAndCloseQueue$p(Lokhttp3/internal/ws/d;)Ljava/util/ArrayDeque;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 58
    .line 59
    .line 60
    const-string v1, "unexpected Sec-WebSocket-Extensions in response header"

    .line 61
    .line 62
    const/16 v2, 0x3f2

    .line 63
    .line 64
    invoke-virtual {v0, v2, v1}, Lokhttp3/internal/ws/d;->close(ILjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit v0

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    monitor-exit v0

    .line 71
    throw p1

    .line 72
    :cond_0
    :goto_0
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    sget-object v1, Lq7/c;->okHttpName:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, " WebSocket "

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lokhttp3/internal/ws/d$f;->$request:Lokhttp3/g0;

    .line 88
    .line 89
    invoke-virtual {v1}, Lokhttp3/g0;->url()Lokhttp3/z;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Lokhttp3/z;->redact()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 105
    .line 106
    invoke-virtual {v1, v0, p1}, Lokhttp3/internal/ws/d;->initReaderAndWriter(Ljava/lang/String;Lokhttp3/internal/ws/d$d;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 110
    .line 111
    invoke-virtual {p1}, Lokhttp3/internal/ws/d;->getListener$okhttp()Lokhttp3/o0;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object v0, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 116
    .line 117
    invoke-virtual {p1, v0, p2}, Lokhttp3/o0;->onOpen(Lokhttp3/n0;Lokhttp3/i0;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 121
    .line 122
    invoke-virtual {p1}, Lokhttp3/internal/ws/d;->loopReader()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :catch_0
    move-exception p1

    .line 127
    iget-object p2, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-virtual {p2, p1, v0}, Lokhttp3/internal/ws/d;->failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :catch_1
    move-exception v0

    .line 135
    iget-object v1, p0, Lokhttp3/internal/ws/d$f;->this$0:Lokhttp3/internal/ws/d;

    .line 136
    .line 137
    invoke-virtual {v1, v0, p2}, Lokhttp3/internal/ws/d;->failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p2}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 141
    .line 142
    .line 143
    if-eqz p1, :cond_1

    .line 144
    .line 145
    invoke-virtual {p1}, Lokhttp3/internal/connection/c;->webSocketUpgradeFailed()V

    .line 146
    .line 147
    .line 148
    :cond_1
    return-void
.end method
