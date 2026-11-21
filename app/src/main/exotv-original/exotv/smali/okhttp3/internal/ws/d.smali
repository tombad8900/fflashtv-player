.class public final Lokhttp3/internal/ws/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/n0;
.implements Lokhttp3/internal/ws/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/ws/d$a;,
        Lokhttp3/internal/ws/d$b;,
        Lokhttp3/internal/ws/d$c;,
        Lokhttp3/internal/ws/d$d;,
        Lokhttp3/internal/ws/d$e;
    }
.end annotation


# static fields
.field private static final CANCEL_AFTER_CLOSE_MILLIS:J = 0xea60L

.field public static final Companion:Lokhttp3/internal/ws/d$b;

.field public static final DEFAULT_MINIMUM_DEFLATE_SIZE:J = 0x400L

.field private static final MAX_QUEUE_SIZE:J = 0x1000000L

.field private static final ONLY_HTTP1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/f0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private awaitingPong:Z

.field private call:Lokhttp3/g;

.field private enqueuedClose:Z

.field private extensions:Lokhttp3/internal/ws/e;

.field private failed:Z

.field private final key:Ljava/lang/String;

.field private final listener:Lokhttp3/o0;

.field private final messageAndCloseQueue:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private minimumDeflateSize:J

.field private name:Ljava/lang/String;

.field private final originalRequest:Lokhttp3/g0;

.field private final pingIntervalMillis:J

.field private final pongQueue:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lv7/m;",
            ">;"
        }
    .end annotation
.end field

.field private queueSize:J

.field private final random:Ljava/util/Random;

.field private reader:Lokhttp3/internal/ws/h;

.field private receivedCloseCode:I

.field private receivedCloseReason:Ljava/lang/String;

.field private receivedPingCount:I

.field private receivedPongCount:I

.field private sentPingCount:I

.field private streams:Lokhttp3/internal/ws/d$d;

.field private taskQueue:Lokhttp3/internal/concurrent/c;

.field private writer:Lokhttp3/internal/ws/i;

.field private writerTask:Lokhttp3/internal/concurrent/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/ws/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/ws/d$b;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/ws/d;->Companion:Lokhttp3/internal/ws/d$b;

    .line 8
    .line 9
    sget-object v0, Lokhttp3/f0;->HTTP_1_1:Lokhttp3/f0;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lokhttp3/internal/ws/d;->ONLY_HTTP1:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/concurrent/e;Lokhttp3/g0;Lokhttp3/o0;Ljava/util/Random;JLokhttp3/internal/ws/e;J)V
    .locals 1

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originalRequest"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "listener"

    .line 12
    .line 13
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "random"

    .line 17
    .line 18
    invoke-static {v0, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lokhttp3/internal/ws/d;->originalRequest:Lokhttp3/g0;

    .line 25
    .line 26
    iput-object p3, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    .line 27
    .line 28
    iput-object p4, p0, Lokhttp3/internal/ws/d;->random:Ljava/util/Random;

    .line 29
    .line 30
    iput-wide p5, p0, Lokhttp3/internal/ws/d;->pingIntervalMillis:J

    .line 31
    .line 32
    iput-object p7, p0, Lokhttp3/internal/ws/d;->extensions:Lokhttp3/internal/ws/e;

    .line 33
    .line 34
    iput-wide p8, p0, Lokhttp3/internal/ws/d;->minimumDeflateSize:J

    .line 35
    .line 36
    invoke-virtual {p1}, Lokhttp3/internal/concurrent/e;->newQueue()Lokhttp3/internal/concurrent/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayDeque;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lokhttp3/internal/ws/d;->pongQueue:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    new-instance p1, Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    .line 55
    .line 56
    const/4 p1, -0x1

    .line 57
    iput p1, p0, Lokhttp3/internal/ws/d;->receivedCloseCode:I

    .line 58
    .line 59
    const-string p1, "GET"

    .line 60
    .line 61
    invoke-virtual {p2}, Lokhttp3/g0;->method()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    sget-object p1, Lv7/m;->m:Lv7/m;

    .line 72
    .line 73
    const/16 p1, 0x10

    .line 74
    .line 75
    new-array p1, p1, [B

    .line 76
    .line 77
    invoke-virtual {p4, p1}, Ljava/util/Random;->nextBytes([B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lk2/b;->t([B)Lv7/m;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lv7/m;->a()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lokhttp3/internal/ws/d;->key:Ljava/lang/String;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string p3, "Request must be GET: "

    .line 94
    .line 95
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lokhttp3/g0;->method()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p2
.end method

.method public static final synthetic access$getMessageAndCloseQueue$p(Lokhttp3/internal/ws/d;)Ljava/util/ArrayDeque;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getName$p(Lokhttp3/internal/ws/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ws/d;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$isValid(Lokhttp3/internal/ws/d;Lokhttp3/internal/ws/e;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lokhttp3/internal/ws/d;->isValid(Lokhttp3/internal/ws/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$setExtensions$p(Lokhttp3/internal/ws/d;Lokhttp3/internal/ws/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/ws/d;->extensions:Lokhttp3/internal/ws/e;

    .line 2
    .line 3
    return-void
.end method

.method private final isValid(Lokhttp3/internal/ws/e;)Z
    .locals 5

    .line 1
    iget-boolean v0, p1, Lokhttp3/internal/ws/e;->unknownValues:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p1, Lokhttp3/internal/ws/e;->clientMaxWindowBits:Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    iget-object v0, p1, Lokhttp3/internal/ws/e;->serverMaxWindowBits:Ljava/lang/Integer;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    new-instance v0, Le7/c;

    .line 18
    .line 19
    const/16 v3, 0xf

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    invoke-direct {v0, v4, v3, v2}, Le7/a;-><init>(III)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lokhttp3/internal/ws/e;->serverMaxWindowBits:Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-gt v4, p1, :cond_2

    .line 33
    .line 34
    iget v0, v0, Le7/a;->k:I

    .line 35
    .line 36
    if-gt p1, v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return v1

    .line 40
    :cond_3
    :goto_0
    return v2
.end method

.method private final runWriter()V
    .locals 8

    .line 1
    sget-boolean v0, Lq7/c;->assertionsEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Thread "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, " MUST hold lock on "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    :goto_0
    iget-object v3, p0, Lokhttp3/internal/ws/d;->writerTask:Lokhttp3/internal/concurrent/a;

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    iget-object v2, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 53
    .line 54
    const/4 v6, 0x2

    .line 55
    const/4 v7, 0x0

    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    invoke-static/range {v2 .. v7}, Lokhttp3/internal/concurrent/c;->schedule$default(Lokhttp3/internal/concurrent/c;Lokhttp3/internal/concurrent/a;JILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method private final declared-synchronized send(Lv7/m;I)Z
    .locals 6

    monitor-enter p0

    .line 3
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->failed:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->enqueuedClose:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-wide v2, p0, Lokhttp3/internal/ws/d;->queueSize:J

    .line 5
    invoke-virtual {p1}, Lv7/m;->d()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    const-wide/32 v4, 0x1000000

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/16 p1, 0x3e9

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p0, p1, p2}, Lokhttp3/internal/ws/d;->close(ILjava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 8
    :cond_1
    :try_start_1
    iget-wide v0, p0, Lokhttp3/internal/ws/d;->queueSize:J

    .line 9
    invoke-virtual {p1}, Lv7/m;->d()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 10
    iput-wide v0, p0, Lokhttp3/internal/ws/d;->queueSize:J

    .line 11
    iget-object v0, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    new-instance v1, Lokhttp3/internal/ws/d$c;

    invoke-direct {v1, p2, p1}, Lokhttp3/internal/ws/d$c;-><init>(ILv7/m;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-direct {p0}, Lokhttp3/internal/ws/d;->runWriter()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    .line 14
    :cond_2
    :goto_0
    monitor-exit p0

    return v1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final awaitTermination(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    .line 1
    const-string v0, "timeUnit"

    .line 2
    .line 3
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/internal/concurrent/c;->idleLatch()Ljava/util/concurrent/CountDownLatch;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->call:Lokhttp3/g;

    .line 2
    .line 3
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lokhttp3/g;->cancel()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final checkUpgradeSuccess$okhttp(Lokhttp3/i0;Lokhttp3/internal/connection/c;)V
    .locals 6

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x65

    .line 11
    .line 12
    const/16 v2, 0x27

    .line 13
    .line 14
    if-ne v0, v1, :cond_4

    .line 15
    .line 16
    const-string v0, "Connection"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v3, 0x2

    .line 20
    invoke-static {p1, v0, v1, v3, v1}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v4, "Upgrade"

    .line 25
    .line 26
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_3

    .line 31
    .line 32
    invoke-static {p1, v4, v1, v3, v1}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v4, "websocket"

    .line 37
    .line 38
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const-string v0, "Sec-WebSocket-Accept"

    .line 45
    .line 46
    invoke-static {p1, v0, v1, v3, v1}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, Lv7/m;->m:Lv7/m;

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lokhttp3/internal/ws/d;->key:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "SHA-1"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lv7/m;->c(Ljava/lang/String;)Lv7/m;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lv7/m;->a()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    if-eqz p2, :cond_0

    .line 92
    .line 93
    return-void

    .line 94
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    .line 95
    .line 96
    const-string p2, "Web Socket exchange missing: bad interceptor?"

    .line 97
    .line 98
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_1
    new-instance p2, Ljava/net/ProtocolException;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v3, "Expected \'Sec-WebSocket-Accept\' header value \'"

    .line 107
    .line 108
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, "\' but was \'"

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p2

    .line 133
    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    .line 134
    .line 135
    new-instance p2, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v1, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    .line 138
    .line 139
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    .line 157
    .line 158
    new-instance p2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v1, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    .line 161
    .line 162
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_4
    new-instance p2, Ljava/net/ProtocolException;

    .line 180
    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v1, "Expected HTTP 101 response but was \'"

    .line 184
    .line 185
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const/16 v1, 0x20

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Lokhttp3/i0;->message()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p2
.end method

.method public close(ILjava/lang/String;)Z
    .locals 2

    const-wide/32 v0, 0xea60

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Lokhttp3/internal/ws/d;->close(ILjava/lang/String;J)Z

    move-result p1

    return p1
.end method

.method public final declared-synchronized close(ILjava/lang/String;J)Z
    .locals 6

    const-string v0, "reason.size() > 123: "

    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v1, Lokhttp3/internal/ws/f;->INSTANCE:Lokhttp3/internal/ws/f;

    invoke-virtual {v1, p1}, Lokhttp3/internal/ws/f;->validateCloseCode(I)V

    if-eqz p2, :cond_1

    .line 3
    sget-object v1, Lv7/m;->m:Lv7/m;

    invoke-static {p2}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    move-result-object v1

    .line 4
    iget-object v2, v1, Lv7/m;->j:[B

    .line 5
    array-length v2, v2

    int-to-long v2, v2

    const-wide/16 v4, 0x7b

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    .line 8
    :goto_0
    iget-boolean p2, p0, Lokhttp3/internal/ws/d;->failed:Z

    if-nez p2, :cond_3

    iget-boolean p2, p0, Lokhttp3/internal/ws/d;->enqueuedClose:Z

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p0, Lokhttp3/internal/ws/d;->enqueuedClose:Z

    .line 10
    iget-object v0, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    new-instance v2, Lokhttp3/internal/ws/d$a;

    invoke-direct {v2, p1, v1, p3, p4}, Lokhttp3/internal/ws/d$a;-><init>(ILv7/m;J)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-direct {p0}, Lokhttp3/internal/ws/d;->runWriter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit p0

    return p2

    .line 13
    :cond_3
    :goto_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final connect(Lokhttp3/e0;)V
    .locals 4

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/ws/d;->originalRequest:Lokhttp3/g0;

    .line 7
    .line 8
    const-string v1, "Sec-WebSocket-Extensions"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lokhttp3/g0;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance p1, Ljava/net/ProtocolException;

    .line 17
    .line 18
    const-string v0, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lokhttp3/internal/ws/d;->failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p1}, Lokhttp3/e0;->newBuilder()Lokhttp3/e0$a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object v0, Lokhttp3/v;->NONE:Lokhttp3/v;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lokhttp3/e0$a;->eventListener(Lokhttp3/v;)Lokhttp3/e0$a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lokhttp3/internal/ws/d;->ONLY_HTTP1:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lokhttp3/e0$a;->protocols(Ljava/util/List;)Lokhttp3/e0$a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lokhttp3/e0$a;->build()Lokhttp3/e0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Lokhttp3/internal/ws/d;->originalRequest:Lokhttp3/g0;

    .line 49
    .line 50
    invoke-virtual {v0}, Lokhttp3/g0;->newBuilder()Lokhttp3/g0$a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "websocket"

    .line 55
    .line 56
    const-string v3, "Upgrade"

    .line 57
    .line 58
    invoke-virtual {v0, v3, v2}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v2, "Connection"

    .line 63
    .line 64
    invoke-virtual {v0, v2, v3}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v2, "Sec-WebSocket-Key"

    .line 69
    .line 70
    iget-object v3, p0, Lokhttp3/internal/ws/d;->key:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v2, v3}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, "Sec-WebSocket-Version"

    .line 77
    .line 78
    const-string v3, "13"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v3}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v2, "permessage-deflate"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, Lokhttp3/internal/connection/e;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v1, p1, v0, v2}, Lokhttp3/internal/connection/e;-><init>(Lokhttp3/e0;Lokhttp3/g0;Z)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lokhttp3/internal/ws/d;->call:Lokhttp3/g;

    .line 101
    .line 102
    new-instance p1, Lokhttp3/internal/ws/d$f;

    .line 103
    .line 104
    invoke-direct {p1, p0, v0}, Lokhttp3/internal/ws/d$f;-><init>(Lokhttp3/internal/ws/d;Lokhttp3/g0;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1, p1}, Lokhttp3/g;->enqueue(Lokhttp3/h;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V
    .locals 4

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->failed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    :try_start_1
    iput-boolean v0, p0, Lokhttp3/internal/ws/d;->failed:Z

    .line 15
    .line 16
    iget-object v0, p0, Lokhttp3/internal/ws/d;->streams:Lokhttp3/internal/ws/d$d;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, Lokhttp3/internal/ws/d;->streams:Lokhttp3/internal/ws/d$d;

    .line 20
    .line 21
    iget-object v2, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 22
    .line 23
    iput-object v1, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 24
    .line 25
    iget-object v3, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 26
    .line 27
    iput-object v1, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 28
    .line 29
    iget-object v1, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 30
    .line 31
    invoke-virtual {v1}, Lokhttp3/internal/concurrent/c;->shutdown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    monitor-exit p0

    .line 35
    :try_start_2
    iget-object v1, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    .line 36
    .line 37
    invoke-virtual {v1, p0, p1, p2}, Lokhttp3/o0;->onFailure(Lokhttp3/n0;Ljava/lang/Throwable;Lokhttp3/i0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-static {v2}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    if-eqz v3, :cond_3

    .line 51
    .line 52
    invoke-static {v3}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    if-eqz v2, :cond_5

    .line 63
    .line 64
    invoke-static {v2}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 65
    .line 66
    .line 67
    :cond_5
    if-eqz v3, :cond_6

    .line 68
    .line 69
    invoke-static {v3}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 70
    .line 71
    .line 72
    :cond_6
    throw p1

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    monitor-exit p0

    .line 75
    throw p1
.end method

.method public final getListener$okhttp()Lokhttp3/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final initReaderAndWriter(Ljava/lang/String;Lokhttp3/internal/ws/d$d;)V
    .locals 10

    .line 1
    const-string v0, " ping"

    .line 2
    .line 3
    const-string v1, "name"

    .line 4
    .line 5
    invoke-static {v1, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "streams"

    .line 9
    .line 10
    invoke-static {v1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/internal/ws/d;->extensions:Lokhttp3/internal/ws/e;

    .line 14
    .line 15
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_0
    iput-object p1, p0, Lokhttp3/internal/ws/d;->name:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lokhttp3/internal/ws/d;->streams:Lokhttp3/internal/ws/d$d;

    .line 22
    .line 23
    new-instance v2, Lokhttp3/internal/ws/i;

    .line 24
    .line 25
    invoke-virtual {p2}, Lokhttp3/internal/ws/d$d;->getClient()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p2}, Lokhttp3/internal/ws/d$d;->getSink()Lv7/k;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p0, Lokhttp3/internal/ws/d;->random:Ljava/util/Random;

    .line 34
    .line 35
    iget-boolean v6, v1, Lokhttp3/internal/ws/e;->perMessageDeflate:Z

    .line 36
    .line 37
    invoke-virtual {p2}, Lokhttp3/internal/ws/d$d;->getClient()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-virtual {v1, v7}, Lokhttp3/internal/ws/e;->noContextTakeover(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    iget-wide v8, p0, Lokhttp3/internal/ws/d;->minimumDeflateSize:J

    .line 46
    .line 47
    invoke-direct/range {v2 .. v9}, Lokhttp3/internal/ws/i;-><init>(ZLv7/k;Ljava/util/Random;ZZJ)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 51
    .line 52
    new-instance v2, Lokhttp3/internal/ws/d$e;

    .line 53
    .line 54
    invoke-direct {v2, p0}, Lokhttp3/internal/ws/d$e;-><init>(Lokhttp3/internal/ws/d;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Lokhttp3/internal/ws/d;->writerTask:Lokhttp3/internal/concurrent/a;

    .line 58
    .line 59
    iget-wide v2, p0, Lokhttp3/internal/ws/d;->pingIntervalMillis:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    .line 61
    const-wide/16 v4, 0x0

    .line 62
    .line 63
    cmp-long v4, v2, v4

    .line 64
    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    :try_start_1
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 68
    .line 69
    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    iget-object v4, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, Lokhttp3/internal/ws/d$g;

    .line 80
    .line 81
    invoke-direct {v0, p1, p0, v2, v3}, Lokhttp3/internal/ws/d$g;-><init>(Ljava/lang/String;Lokhttp3/internal/ws/d;J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v0, v2, v3}, Lokhttp3/internal/concurrent/c;->schedule(Lokhttp3/internal/concurrent/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    move-object v3, p0

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    :goto_0
    :try_start_2
    iget-object p1, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 98
    if-nez p1, :cond_1

    .line 99
    .line 100
    :try_start_3
    invoke-direct {p0}, Lokhttp3/internal/ws/d;->runWriter()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    .line 102
    .line 103
    :cond_1
    monitor-exit p0

    .line 104
    new-instance v0, Lokhttp3/internal/ws/h;

    .line 105
    .line 106
    move-object p1, v1

    .line 107
    invoke-virtual {p2}, Lokhttp3/internal/ws/d$d;->getClient()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {p2}, Lokhttp3/internal/ws/d$d;->getSource()Lv7/l;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-boolean v4, p1, Lokhttp3/internal/ws/e;->perMessageDeflate:Z

    .line 116
    .line 117
    invoke-virtual {p2}, Lokhttp3/internal/ws/d$d;->getClient()Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    xor-int/lit8 p2, p2, 0x1

    .line 122
    .line 123
    invoke-virtual {p1, p2}, Lokhttp3/internal/ws/e;->noContextTakeover(Z)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    move-object v3, p0

    .line 128
    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/ws/h;-><init>(ZLv7/l;Lokhttp3/internal/ws/g;ZZ)V

    .line 129
    .line 130
    .line 131
    iput-object v0, v3, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 132
    .line 133
    return-void

    .line 134
    :catchall_1
    move-exception v0

    .line 135
    move-object v3, p0

    .line 136
    move-object p1, v0

    .line 137
    :goto_1
    monitor-exit p0

    .line 138
    throw p1
.end method

.method public final loopReader()V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Lokhttp3/internal/ws/d;->receivedCloseCode:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 7
    .line 8
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lokhttp3/internal/ws/h;->processNextFrame()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public onReadClose(ILjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "reason"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-eq p1, v0, :cond_9

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget v1, p0, Lokhttp3/internal/ws/d;->receivedCloseCode:I

    .line 11
    .line 12
    if-ne v1, v0, :cond_8

    .line 13
    .line 14
    iput p1, p0, Lokhttp3/internal/ws/d;->receivedCloseCode:I

    .line 15
    .line 16
    iput-object p2, p0, Lokhttp3/internal/ws/d;->receivedCloseReason:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->enqueuedClose:Z

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lokhttp3/internal/ws/d;->streams:Lokhttp3/internal/ws/d$d;

    .line 32
    .line 33
    iput-object v1, p0, Lokhttp3/internal/ws/d;->streams:Lokhttp3/internal/ws/d$d;

    .line 34
    .line 35
    iget-object v2, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 36
    .line 37
    iput-object v1, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 38
    .line 39
    iget-object v3, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 40
    .line 41
    iput-object v1, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 42
    .line 43
    iget-object v1, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 44
    .line 45
    invoke-virtual {v1}, Lokhttp3/internal/concurrent/c;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    move-object v1, v0

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    move-object v2, v1

    .line 53
    move-object v3, v2

    .line 54
    :goto_0
    monitor-exit p0

    .line 55
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    .line 56
    .line 57
    invoke-virtual {v0, p0, p1, p2}, Lokhttp3/o0;->onClosing(Lokhttp3/n0;ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    iget-object v0, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    .line 63
    .line 64
    invoke-virtual {v0, p0, p1, p2}, Lokhttp3/o0;->onClosed(Lokhttp3/n0;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_1
    move-exception p1

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-static {v1}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    if-eqz v2, :cond_3

    .line 76
    .line 77
    invoke-static {v2}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-static {v3}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    return-void

    .line 86
    :goto_2
    if-eqz v1, :cond_5

    .line 87
    .line 88
    invoke-static {v1}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    if-eqz v2, :cond_6

    .line 92
    .line 93
    invoke-static {v2}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    if-eqz v3, :cond_7

    .line 97
    .line 98
    invoke-static {v3}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    throw p1

    .line 102
    :cond_8
    :try_start_2
    const-string p1, "already closed"

    .line 103
    .line 104
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    :goto_3
    monitor-exit p0

    .line 111
    throw p1

    .line 112
    :cond_9
    const-string p1, "Failed requirement."

    .line 113
    .line 114
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p2
.end method

.method public onReadMessage(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    invoke-virtual {v0, p0, p1}, Lokhttp3/o0;->onMessage(Lokhttp3/n0;Ljava/lang/String;)V

    return-void
.end method

.method public onReadMessage(Lv7/m;)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    invoke-virtual {v0, p0, p1}, Lokhttp3/o0;->onMessage(Lokhttp3/n0;Lv7/m;)V

    return-void
.end method

.method public declared-synchronized onReadPing(Lv7/m;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "payload"

    .line 3
    .line 4
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->failed:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->enqueuedClose:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/d;->pongQueue:Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lokhttp3/internal/ws/d;->runWriter()V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lokhttp3/internal/ws/d;->receivedPingCount:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    iput p1, p0, Lokhttp3/internal/ws/d;->receivedPingCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :cond_1
    :goto_0
    monitor-exit p0

    .line 43
    return-void

    .line 44
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public declared-synchronized onReadPong(Lv7/m;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "payload"

    .line 3
    .line 4
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget p1, p0, Lokhttp3/internal/ws/d;->receivedPongCount:I

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    iput p1, p0, Lokhttp3/internal/ws/d;->receivedPongCount:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lokhttp3/internal/ws/d;->awaitingPong:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public final declared-synchronized pong(Lv7/m;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "payload"

    .line 3
    .line 4
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->failed:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->enqueuedClose:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/d;->pongQueue:Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lokhttp3/internal/ws/d;->runWriter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit p0

    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_1
    :goto_0
    monitor-exit p0

    .line 38
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p1
.end method

.method public final processNextFrame()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 3
    .line 4
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lokhttp3/internal/ws/h;->processNextFrame()V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lokhttp3/internal/ws/d;->receivedCloseCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :cond_0
    return v0

    .line 17
    :catch_0
    move-exception v1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, v1, v2}, Lokhttp3/internal/ws/d;->failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V

    .line 20
    .line 21
    .line 22
    return v0
.end method

.method public declared-synchronized queueSize()J
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lokhttp3/internal/ws/d;->queueSize:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-wide v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final declared-synchronized receivedPingCount()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lokhttp3/internal/ws/d;->receivedPingCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final declared-synchronized receivedPongCount()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lokhttp3/internal/ws/d;->receivedPongCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public request()Lokhttp3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->originalRequest:Lokhttp3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public send(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "text"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    sget-object v0, Lv7/m;->m:Lv7/m;

    invoke-static {p1}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lokhttp3/internal/ws/d;->send(Lv7/m;I)Z

    move-result p1

    return p1
.end method

.method public send(Lv7/m;)Z
    .locals 1

    const-string v0, "bytes"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, p1, v0}, Lokhttp3/internal/ws/d;->send(Lv7/m;I)Z

    move-result p1

    return p1
.end method

.method public final declared-synchronized sentPingCount()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lokhttp3/internal/ws/d;->sentPingCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final tearDown()V
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/concurrent/c;->shutdown()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/internal/concurrent/c;->idleLatch()Ljava/util/concurrent/CountDownLatch;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-wide/16 v1, 0xa

    .line 13
    .line 14
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final writeOneFrame$okhttp()Z
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->failed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 10
    .line 11
    iget-object v2, p0, Lokhttp3/internal/ws/d;->pongQueue:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, -0x1

    .line 20
    if-nez v2, :cond_4

    .line 21
    .line 22
    iget-object v6, p0, Lokhttp3/internal/ws/d;->messageAndCloseQueue:Ljava/util/ArrayDeque;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    instance-of v7, v6, Lokhttp3/internal/ws/d$a;

    .line 29
    .line 30
    if-eqz v7, :cond_2

    .line 31
    .line 32
    iget v1, p0, Lokhttp3/internal/ws/d;->receivedCloseCode:I

    .line 33
    .line 34
    iget-object v7, p0, Lokhttp3/internal/ws/d;->receivedCloseReason:Ljava/lang/String;

    .line 35
    .line 36
    if-eq v1, v5, :cond_1

    .line 37
    .line 38
    iget-object v5, p0, Lokhttp3/internal/ws/d;->streams:Lokhttp3/internal/ws/d$d;

    .line 39
    .line 40
    iput-object v4, p0, Lokhttp3/internal/ws/d;->streams:Lokhttp3/internal/ws/d$d;

    .line 41
    .line 42
    iget-object v8, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 43
    .line 44
    iput-object v4, p0, Lokhttp3/internal/ws/d;->reader:Lokhttp3/internal/ws/h;

    .line 45
    .line 46
    iget-object v9, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 47
    .line 48
    iput-object v4, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;

    .line 49
    .line 50
    iget-object v4, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 51
    .line 52
    invoke-virtual {v4}, Lokhttp3/internal/concurrent/c;->shutdown()V

    .line 53
    .line 54
    .line 55
    :goto_0
    move-object v4, v6

    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_1
    move-object v5, v6

    .line 61
    check-cast v5, Lokhttp3/internal/ws/d$a;

    .line 62
    .line 63
    invoke-virtual {v5}, Lokhttp3/internal/ws/d$a;->getCancelAfterCloseMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v8

    .line 67
    iget-object v5, p0, Lokhttp3/internal/ws/d;->taskQueue:Lokhttp3/internal/concurrent/c;

    .line 68
    .line 69
    new-instance v10, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v11, p0, Lokhttp3/internal/ws/d;->name:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v11, " cancel"

    .line 80
    .line 81
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 89
    .line 90
    invoke-virtual {v11, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v8

    .line 94
    new-instance v11, Lokhttp3/internal/ws/d$h;

    .line 95
    .line 96
    invoke-direct {v11, v10, v3, p0}, Lokhttp3/internal/ws/d$h;-><init>(Ljava/lang/String;ZLokhttp3/internal/ws/d;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v11, v8, v9}, Lokhttp3/internal/concurrent/c;->schedule(Lokhttp3/internal/concurrent/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    move-object v5, v4

    .line 103
    move-object v8, v5

    .line 104
    move-object v9, v8

    .line 105
    goto :goto_0

    .line 106
    :cond_2
    if-nez v6, :cond_3

    .line 107
    .line 108
    monitor-exit p0

    .line 109
    return v1

    .line 110
    :cond_3
    move-object v7, v4

    .line 111
    move-object v8, v7

    .line 112
    move-object v9, v8

    .line 113
    move v1, v5

    .line 114
    move-object v5, v9

    .line 115
    goto :goto_0

    .line 116
    :cond_4
    move-object v7, v4

    .line 117
    move-object v8, v7

    .line 118
    move-object v9, v8

    .line 119
    move v1, v5

    .line 120
    move-object v5, v9

    .line 121
    :goto_1
    monitor-exit p0

    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    :try_start_2
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    check-cast v2, Lv7/m;

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Lokhttp3/internal/ws/i;->writePong(Lv7/m;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    goto :goto_3

    .line 135
    :cond_5
    instance-of v2, v4, Lokhttp3/internal/ws/d$c;

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    check-cast v4, Lokhttp3/internal/ws/d$c;

    .line 140
    .line 141
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Lokhttp3/internal/ws/d$c;->getFormatOpcode()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {v4}, Lokhttp3/internal/ws/d$c;->getData()Lv7/m;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/ws/i;->writeMessageFrame(ILv7/m;)V

    .line 153
    .line 154
    .line 155
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 156
    :try_start_3
    iget-wide v0, p0, Lokhttp3/internal/ws/d;->queueSize:J

    .line 157
    .line 158
    invoke-virtual {v4}, Lokhttp3/internal/ws/d$c;->getData()Lv7/m;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v2}, Lv7/m;->d()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    int-to-long v6, v2

    .line 167
    sub-long/2addr v0, v6

    .line 168
    iput-wide v0, p0, Lokhttp3/internal/ws/d;->queueSize:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 169
    .line 170
    :try_start_4
    monitor-exit p0

    .line 171
    goto :goto_2

    .line 172
    :catchall_2
    move-exception v0

    .line 173
    monitor-exit p0

    .line 174
    throw v0

    .line 175
    :cond_6
    instance-of v2, v4, Lokhttp3/internal/ws/d$a;

    .line 176
    .line 177
    if-eqz v2, :cond_b

    .line 178
    .line 179
    check-cast v4, Lokhttp3/internal/ws/d$a;

    .line 180
    .line 181
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4}, Lokhttp3/internal/ws/d$a;->getCode()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-virtual {v4}, Lokhttp3/internal/ws/d$a;->getReason()Lv7/m;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v0, v2, v4}, Lokhttp3/internal/ws/i;->writeClose(ILv7/m;)V

    .line 193
    .line 194
    .line 195
    if-eqz v5, :cond_7

    .line 196
    .line 197
    iget-object v0, p0, Lokhttp3/internal/ws/d;->listener:Lokhttp3/o0;

    .line 198
    .line 199
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, p0, v1, v7}, Lokhttp3/o0;->onClosed(Lokhttp3/n0;ILjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 203
    .line 204
    .line 205
    :cond_7
    :goto_2
    if-eqz v5, :cond_8

    .line 206
    .line 207
    invoke-static {v5}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 208
    .line 209
    .line 210
    :cond_8
    if-eqz v8, :cond_9

    .line 211
    .line 212
    invoke-static {v8}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 213
    .line 214
    .line 215
    :cond_9
    if-eqz v9, :cond_a

    .line 216
    .line 217
    invoke-static {v9}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 218
    .line 219
    .line 220
    :cond_a
    return v3

    .line 221
    :cond_b
    :try_start_5
    new-instance v0, Ljava/lang/AssertionError;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 224
    .line 225
    .line 226
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 227
    :goto_3
    if-eqz v5, :cond_c

    .line 228
    .line 229
    invoke-static {v5}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 230
    .line 231
    .line 232
    :cond_c
    if-eqz v8, :cond_d

    .line 233
    .line 234
    invoke-static {v8}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 235
    .line 236
    .line 237
    :cond_d
    if-eqz v9, :cond_e

    .line 238
    .line 239
    invoke-static {v9}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 240
    .line 241
    .line 242
    :cond_e
    throw v0

    .line 243
    :goto_4
    monitor-exit p0

    .line 244
    throw v0
.end method

.method public final writePingFrame$okhttp()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/ws/d;->failed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/ws/d;->writer:Lokhttp3/internal/ws/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :cond_1
    :try_start_2
    iget-boolean v1, p0, Lokhttp3/internal/ws/d;->awaitingPong:Z

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget v1, p0, Lokhttp3/internal/ws/d;->sentPingCount:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    move v1, v2

    .line 25
    :goto_0
    iget v3, p0, Lokhttp3/internal/ws/d;->sentPingCount:I

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    add-int/2addr v3, v4

    .line 29
    iput v3, p0, Lokhttp3/internal/ws/d;->sentPingCount:I

    .line 30
    .line 31
    iput-boolean v4, p0, Lokhttp3/internal/ws/d;->awaitingPong:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eq v1, v2, :cond_3

    .line 36
    .line 37
    new-instance v0, Ljava/net/SocketTimeoutException;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v5, "sent ping but didn\'t receive pong within "

    .line 42
    .line 43
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-wide v5, p0, Lokhttp3/internal/ws/d;->pingIntervalMillis:J

    .line 47
    .line 48
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v5, "ms (after "

    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sub-int/2addr v1, v4

    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, " successful ping/pongs)"

    .line 61
    .line 62
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0, v3}, Lokhttp3/internal/ws/d;->failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    :try_start_3
    sget-object v1, Lv7/m;->m:Lv7/m;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lokhttp3/internal/ws/i;->writePing(Lv7/m;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catch_0
    move-exception v0

    .line 83
    invoke-virtual {p0, v0, v3}, Lokhttp3/internal/ws/d;->failWebSocket(Ljava/lang/Exception;Lokhttp3/i0;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :goto_1
    monitor-exit p0

    .line 88
    throw v0
.end method
