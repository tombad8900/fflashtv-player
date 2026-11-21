.class public final Lokhttp3/internal/cache/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lv7/k0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/cache/a;->cacheWritingResponse(Lokhttp3/internal/cache/b;Lokhttp3/i0;)Lokhttp3/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $cacheBody:Lv7/k;

.field final synthetic $cacheRequest:Lokhttp3/internal/cache/b;

.field final synthetic $source:Lv7/l;

.field private cacheRequestClosed:Z


# direct methods
.method public constructor <init>(Lv7/l;Lokhttp3/internal/cache/b;Lv7/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/cache/a$b;->$source:Lv7/l;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/internal/cache/a$b;->$cacheRequest:Lokhttp3/internal/cache/b;

    .line 4
    .line 5
    iput-object p3, p0, Lokhttp3/internal/cache/a$b;->$cacheBody:Lv7/k;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/cache/a$b;->cacheRequestClosed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x64

    .line 6
    .line 7
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    invoke-static {p0, v0, v1}, Lq7/c;->discard(Lv7/k0;ILjava/util/concurrent/TimeUnit;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lokhttp3/internal/cache/a$b;->cacheRequestClosed:Z

    .line 17
    .line 18
    iget-object v0, p0, Lokhttp3/internal/cache/a$b;->$cacheRequest:Lokhttp3/internal/cache/b;

    .line 19
    .line 20
    invoke-interface {v0}, Lokhttp3/internal/cache/b;->abort()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/cache/a$b;->$source:Lv7/l;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public read(Lv7/j;J)J
    .locals 8

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/cache/a$b;->$source:Lv7/l;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lv7/k0;->read(Lv7/j;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const-wide/16 p2, -0x1

    .line 14
    .line 15
    cmp-long v0, v6, p2

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-boolean p1, p0, Lokhttp3/internal/cache/a$b;->cacheRequestClosed:Z

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    iput-boolean v1, p0, Lokhttp3/internal/cache/a$b;->cacheRequestClosed:Z

    .line 24
    .line 25
    iget-object p1, p0, Lokhttp3/internal/cache/a$b;->$cacheBody:Lv7/k;

    .line 26
    .line 27
    invoke-interface {p1}, Lv7/i0;->close()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-wide p2

    .line 31
    :cond_1
    iget-object p2, p0, Lokhttp3/internal/cache/a$b;->$cacheBody:Lv7/k;

    .line 32
    .line 33
    invoke-interface {p2}, Lv7/k;->a()Lv7/j;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-wide p2, p1, Lv7/j;->k:J

    .line 38
    .line 39
    sub-long v4, p2, v6

    .line 40
    .line 41
    move-object v2, p1

    .line 42
    invoke-virtual/range {v2 .. v7}, Lv7/j;->c(Lv7/j;JJ)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lokhttp3/internal/cache/a$b;->$cacheBody:Lv7/k;

    .line 46
    .line 47
    invoke-interface {p1}, Lv7/k;->l()Lv7/k;

    .line 48
    .line 49
    .line 50
    return-wide v6

    .line 51
    :catch_0
    move-exception v0

    .line 52
    move-object p1, v0

    .line 53
    iget-boolean p2, p0, Lokhttp3/internal/cache/a$b;->cacheRequestClosed:Z

    .line 54
    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    iput-boolean v1, p0, Lokhttp3/internal/cache/a$b;->cacheRequestClosed:Z

    .line 58
    .line 59
    iget-object p2, p0, Lokhttp3/internal/cache/a$b;->$cacheRequest:Lokhttp3/internal/cache/b;

    .line 60
    .line 61
    invoke-interface {p2}, Lokhttp3/internal/cache/b;->abort()V

    .line 62
    .line 63
    .line 64
    :cond_2
    throw p1
.end method

.method public timeout()Lv7/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/a$b;->$source:Lv7/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lv7/k0;->timeout()Lv7/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
