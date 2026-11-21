.class public final Lokhttp3/d$d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/internal/cache/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final body:Lv7/i0;

.field private final cacheOut:Lv7/i0;

.field private done:Z

.field private final editor:Lokhttp3/internal/cache/d$b;

.field final synthetic this$0:Lokhttp3/d;


# direct methods
.method public constructor <init>(Lokhttp3/d;Lokhttp3/internal/cache/d$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/cache/d$b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "editor"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/d$d;->this$0:Lokhttp3/d;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/d$d;->editor:Lokhttp3/internal/cache/d$b;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p2, v0}, Lokhttp3/internal/cache/d$b;->newSink(I)Lv7/i0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, Lokhttp3/d$d;->cacheOut:Lv7/i0;

    .line 19
    .line 20
    new-instance v0, Lokhttp3/d$d$a;

    .line 21
    .line 22
    invoke-direct {v0, p1, p0, p2}, Lokhttp3/d$d$a;-><init>(Lokhttp3/d;Lokhttp3/d$d;Lv7/i0;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lokhttp3/d$d;->body:Lv7/i0;

    .line 26
    .line 27
    return-void
.end method

.method public static final synthetic access$getEditor$p(Lokhttp3/d$d;)Lokhttp3/internal/cache/d$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/d$d;->editor:Lokhttp3/internal/cache/d$b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public abort()V
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/d$d;->this$0:Lokhttp3/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lokhttp3/d$d;->done:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :try_start_1
    iput-boolean v1, p0, Lokhttp3/d$d;->done:Z

    .line 12
    .line 13
    invoke-virtual {v0}, Lokhttp3/d;->getWriteAbortCount$okhttp()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/2addr v2, v1

    .line 18
    invoke-virtual {v0, v2}, Lokhttp3/d;->setWriteAbortCount$okhttp(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    iget-object v0, p0, Lokhttp3/d$d;->cacheOut:Lv7/i0;

    .line 23
    .line 24
    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 25
    .line 26
    .line 27
    :try_start_2
    iget-object v0, p0, Lokhttp3/d$d;->editor:Lokhttp3/internal/cache/d$b;

    .line 28
    .line 29
    invoke-virtual {v0}, Lokhttp3/internal/cache/d$b;->abort()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 30
    .line 31
    .line 32
    :catch_0
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    monitor-exit v0

    .line 35
    throw v1
.end method

.method public body()Lv7/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/d$d;->body:Lv7/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDone()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/d$d;->done:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setDone(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/d$d;->done:Z

    .line 2
    .line 3
    return-void
.end method
