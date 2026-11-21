.class public final Lokhttp3/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field private final delegate:Lokhttp3/internal/connection/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v0, 0x5

    .line 6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x5

    invoke-direct {p0, v3, v0, v1, v2}, Lokhttp3/m;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 7

    const-string v0, "timeUnit"

    invoke-static {v0, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    new-instance v1, Lokhttp3/internal/connection/h;

    .line 4
    sget-object v2, Lokhttp3/internal/concurrent/e;->INSTANCE:Lokhttp3/internal/concurrent/e;

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    .line 5
    invoke-direct/range {v1 .. v6}, Lokhttp3/internal/connection/h;-><init>(Lokhttp3/internal/concurrent/e;IJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0, v1}, Lokhttp3/m;-><init>(Lokhttp3/internal/connection/h;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/connection/h;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lokhttp3/m;->delegate:Lokhttp3/internal/connection/h;

    return-void
.end method


# virtual methods
.method public final connectionCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/m;->delegate:Lokhttp3/internal/connection/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/connection/h;->connectionCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final evictAll()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/m;->delegate:Lokhttp3/internal/connection/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/connection/h;->evictAll()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getDelegate$okhttp()Lokhttp3/internal/connection/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/m;->delegate:Lokhttp3/internal/connection/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final idleConnectionCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/m;->delegate:Lokhttp3/internal/connection/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/connection/h;->idleConnectionCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
