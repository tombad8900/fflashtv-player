.class public final Lokhttp3/internal/http2/f$e;
.super Lokhttp3/internal/concurrent/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/http2/f;->pushDataLater$okhttp(ILv7/l;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $buffer$inlined:Lv7/j;

.field final synthetic $byteCount$inlined:I

.field final synthetic $inFinished$inlined:Z

.field final synthetic $streamId$inlined:I

.field final synthetic this$0:Lokhttp3/internal/http2/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLokhttp3/internal/http2/f;ILv7/j;IZ)V
    .locals 0

    .line 1
    iput-object p3, p0, Lokhttp3/internal/http2/f$e;->this$0:Lokhttp3/internal/http2/f;

    .line 2
    .line 3
    iput p4, p0, Lokhttp3/internal/http2/f$e;->$streamId$inlined:I

    .line 4
    .line 5
    iput-object p5, p0, Lokhttp3/internal/http2/f$e;->$buffer$inlined:Lv7/j;

    .line 6
    .line 7
    iput p6, p0, Lokhttp3/internal/http2/f$e;->$byteCount$inlined:I

    .line 8
    .line 9
    iput-boolean p7, p0, Lokhttp3/internal/http2/f$e;->$inFinished$inlined:Z

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/concurrent/a;-><init>(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public runOnce()J
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http2/f$e;->this$0:Lokhttp3/internal/http2/f;

    .line 2
    .line 3
    invoke-static {v0}, Lokhttp3/internal/http2/f;->access$getPushObserver$p(Lokhttp3/internal/http2/f;)Lokhttp3/internal/http2/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lokhttp3/internal/http2/f$e;->$streamId$inlined:I

    .line 8
    .line 9
    iget-object v2, p0, Lokhttp3/internal/http2/f$e;->$buffer$inlined:Lv7/j;

    .line 10
    .line 11
    iget v3, p0, Lokhttp3/internal/http2/f$e;->$byteCount$inlined:I

    .line 12
    .line 13
    iget-boolean v4, p0, Lokhttp3/internal/http2/f$e;->$inFinished$inlined:Z

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, v3, v4}, Lokhttp3/internal/http2/n;->onData(ILv7/l;IZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lokhttp3/internal/http2/f$e;->this$0:Lokhttp3/internal/http2/f;

    .line 22
    .line 23
    invoke-virtual {v1}, Lokhttp3/internal/http2/f;->getWriter()Lokhttp3/internal/http2/k;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget v2, p0, Lokhttp3/internal/http2/f$e;->$streamId$inlined:I

    .line 28
    .line 29
    sget-object v3, Lokhttp3/internal/http2/b;->CANCEL:Lokhttp3/internal/http2/b;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v3}, Lokhttp3/internal/http2/k;->rstStream(ILokhttp3/internal/http2/b;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-boolean v0, p0, Lokhttp3/internal/http2/f$e;->$inFinished$inlined:Z

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http2/f$e;->this$0:Lokhttp3/internal/http2/f;

    .line 41
    .line 42
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :try_start_1
    iget-object v1, p0, Lokhttp3/internal/http2/f$e;->this$0:Lokhttp3/internal/http2/f;

    .line 44
    .line 45
    invoke-static {v1}, Lokhttp3/internal/http2/f;->access$getCurrentPushRequests$p(Lokhttp3/internal/http2/f;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget v2, p0, Lokhttp3/internal/http2/f$e;->$streamId$inlined:I

    .line 50
    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    :try_start_2
    monitor-exit v0

    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v1

    .line 61
    monitor-exit v0

    .line 62
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 63
    :catch_0
    :cond_2
    :goto_0
    const-wide/16 v0, -0x1

    .line 64
    .line 65
    return-wide v0
.end method
