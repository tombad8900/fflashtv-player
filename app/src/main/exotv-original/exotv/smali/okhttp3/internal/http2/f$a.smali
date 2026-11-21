.class public final Lokhttp3/internal/http2/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private client:Z

.field public connectionName:Ljava/lang/String;

.field private listener:Lokhttp3/internal/http2/f$c;

.field private pingIntervalMillis:I

.field private pushObserver:Lokhttp3/internal/http2/n;

.field public sink:Lv7/k;

.field public socket:Ljava/net/Socket;

.field public source:Lv7/l;

.field private final taskRunner:Lokhttp3/internal/concurrent/e;


# direct methods
.method public constructor <init>(ZLokhttp3/internal/concurrent/e;)V
    .locals 1

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-boolean p1, p0, Lokhttp3/internal/http2/f$a;->client:Z

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/http2/f$a;->taskRunner:Lokhttp3/internal/concurrent/e;

    .line 12
    .line 13
    sget-object p1, Lokhttp3/internal/http2/f$c;->REFUSE_INCOMING_STREAMS:Lokhttp3/internal/http2/f$c;

    .line 14
    .line 15
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->listener:Lokhttp3/internal/http2/f$c;

    .line 16
    .line 17
    sget-object p1, Lokhttp3/internal/http2/n;->CANCEL:Lokhttp3/internal/http2/n;

    .line 18
    .line 19
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->pushObserver:Lokhttp3/internal/http2/n;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic socket$default(Lokhttp3/internal/http2/f$a;Ljava/net/Socket;Ljava/lang/String;Lv7/l;Lv7/k;ILjava/lang/Object;)Lokhttp3/internal/http2/f$a;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lq7/c;->peerName(Ljava/net/Socket;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    and-int/lit8 p6, p5, 0x4

    .line 10
    .line 11
    if-eqz p6, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Lv7/b;->j(Ljava/net/Socket;)Lv7/k0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-static {p3}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 22
    .line 23
    if-eqz p5, :cond_2

    .line 24
    .line 25
    invoke-static {p1}, Lv7/b;->g(Ljava/net/Socket;)Lv7/i0;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    invoke-static {p4}, Lv7/b;->b(Lv7/i0;)Lv7/d0;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lokhttp3/internal/http2/f$a;->socket(Ljava/net/Socket;Ljava/lang/String;Lv7/l;Lv7/k;)Lokhttp3/internal/http2/f$a;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method


# virtual methods
.method public final build()Lokhttp3/internal/http2/f;
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/internal/http2/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokhttp3/internal/http2/f;-><init>(Lokhttp3/internal/http2/f$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final getClient$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http2/f$a;->client:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getConnectionName$okhttp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$a;->connectionName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "connectionName"

    .line 7
    .line 8
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getListener$okhttp()Lokhttp3/internal/http2/f$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$a;->listener:Lokhttp3/internal/http2/f$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPingIntervalMillis$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/internal/http2/f$a;->pingIntervalMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPushObserver$okhttp()Lokhttp3/internal/http2/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$a;->pushObserver:Lokhttp3/internal/http2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSink$okhttp()Lv7/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$a;->sink:Lv7/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "sink"

    .line 7
    .line 8
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getSocket$okhttp()Ljava/net/Socket;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$a;->socket:Ljava/net/Socket;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "socket"

    .line 7
    .line 8
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getSource$okhttp()Lv7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$a;->source:Lv7/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getTaskRunner$okhttp()Lokhttp3/internal/concurrent/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$a;->taskRunner:Lokhttp3/internal/concurrent/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final listener(Lokhttp3/internal/http2/f$c;)Lokhttp3/internal/http2/f$a;
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->listener:Lokhttp3/internal/http2/f$c;

    .line 7
    .line 8
    return-object p0
.end method

.method public final pingIntervalMillis(I)Lokhttp3/internal/http2/f$a;
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/internal/http2/f$a;->pingIntervalMillis:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final pushObserver(Lokhttp3/internal/http2/n;)Lokhttp3/internal/http2/f$a;
    .locals 1

    .line 1
    const-string v0, "pushObserver"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->pushObserver:Lokhttp3/internal/http2/n;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setClient$okhttp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/internal/http2/f$a;->client:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setConnectionName$okhttp(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->connectionName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setListener$okhttp(Lokhttp3/internal/http2/f$c;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->listener:Lokhttp3/internal/http2/f$c;

    .line 7
    .line 8
    return-void
.end method

.method public final setPingIntervalMillis$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/internal/http2/f$a;->pingIntervalMillis:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPushObserver$okhttp(Lokhttp3/internal/http2/n;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->pushObserver:Lokhttp3/internal/http2/n;

    .line 7
    .line 8
    return-void
.end method

.method public final setSink$okhttp(Lv7/k;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->sink:Lv7/k;

    .line 7
    .line 8
    return-void
.end method

.method public final setSocket$okhttp(Ljava/net/Socket;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->socket:Ljava/net/Socket;

    .line 7
    .line 8
    return-void
.end method

.method public final setSource$okhttp(Lv7/l;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/http2/f$a;->source:Lv7/l;

    .line 7
    .line 8
    return-void
.end method

.method public final socket(Ljava/net/Socket;)Lokhttp3/internal/http2/f$a;
    .locals 8

    .line 1
    const-string v0, "socket"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lokhttp3/internal/http2/f$a;->socket$default(Lokhttp3/internal/http2/f$a;Ljava/net/Socket;Ljava/lang/String;Lv7/l;Lv7/k;ILjava/lang/Object;)Lokhttp3/internal/http2/f$a;

    move-result-object p1

    return-object p1
.end method

.method public final socket(Ljava/net/Socket;Ljava/lang/String;)Lokhttp3/internal/http2/f$a;
    .locals 8

    .line 2
    const-string v0, "socket"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "peerName"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lokhttp3/internal/http2/f$a;->socket$default(Lokhttp3/internal/http2/f$a;Ljava/net/Socket;Ljava/lang/String;Lv7/l;Lv7/k;ILjava/lang/Object;)Lokhttp3/internal/http2/f$a;

    move-result-object p1

    return-object p1
.end method

.method public final socket(Ljava/net/Socket;Ljava/lang/String;Lv7/l;)Lokhttp3/internal/http2/f$a;
    .locals 8

    .line 3
    const-string v0, "socket"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "peerName"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "source"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lokhttp3/internal/http2/f$a;->socket$default(Lokhttp3/internal/http2/f$a;Ljava/net/Socket;Ljava/lang/String;Lv7/l;Lv7/k;ILjava/lang/Object;)Lokhttp3/internal/http2/f$a;

    move-result-object p1

    return-object p1
.end method

.method public final socket(Ljava/net/Socket;Ljava/lang/String;Lv7/l;Lv7/k;)Lokhttp3/internal/http2/f$a;
    .locals 1

    const-string v0, "socket"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "peerName"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "source"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "sink"

    invoke-static {v0, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0, p1}, Lokhttp3/internal/http2/f$a;->setSocket$okhttp(Ljava/net/Socket;)V

    .line 5
    iget-boolean p1, p0, Lokhttp3/internal/http2/f$a;->client:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lq7/c;->okHttpName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "MockWebServer "

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    :goto_0
    invoke-virtual {p0, p1}, Lokhttp3/internal/http2/f$a;->setConnectionName$okhttp(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, p3}, Lokhttp3/internal/http2/f$a;->setSource$okhttp(Lv7/l;)V

    .line 9
    invoke-virtual {p0, p4}, Lokhttp3/internal/http2/f$a;->setSink$okhttp(Lv7/k;)V

    return-object p0
.end method
