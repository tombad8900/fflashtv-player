.class public final Lokhttp3/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private immutable:Z

.field private maxAgeSeconds:I

.field private maxStaleSeconds:I

.field private minFreshSeconds:I

.field private noCache:Z

.field private noStore:Z

.field private noTransform:Z

.field private onlyIfCached:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lokhttp3/e$a;->maxAgeSeconds:I

    .line 6
    .line 7
    iput v0, p0, Lokhttp3/e$a;->maxStaleSeconds:I

    .line 8
    .line 9
    iput v0, p0, Lokhttp3/e$a;->minFreshSeconds:I

    .line 10
    .line 11
    return-void
.end method

.method private final clampToInt(J)I
    .locals 2

    .line 1
    const-wide/32 v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const p1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    long-to-int p1, p1

    .line 13
    return p1
.end method


# virtual methods
.method public final build()Lokhttp3/e;
    .locals 15

    .line 1
    new-instance v0, Lokhttp3/e;

    .line 2
    .line 3
    iget-boolean v1, p0, Lokhttp3/e$a;->noCache:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lokhttp3/e$a;->noStore:Z

    .line 6
    .line 7
    iget v3, p0, Lokhttp3/e$a;->maxAgeSeconds:I

    .line 8
    .line 9
    iget v8, p0, Lokhttp3/e$a;->maxStaleSeconds:I

    .line 10
    .line 11
    iget v9, p0, Lokhttp3/e$a;->minFreshSeconds:I

    .line 12
    .line 13
    iget-boolean v10, p0, Lokhttp3/e$a;->onlyIfCached:Z

    .line 14
    .line 15
    iget-boolean v11, p0, Lokhttp3/e$a;->noTransform:Z

    .line 16
    .line 17
    iget-boolean v12, p0, Lokhttp3/e$a;->immutable:Z

    .line 18
    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v4, -0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    invoke-direct/range {v0 .. v14}, Lokhttp3/e;-><init>(ZZIIZZZIIZZZLjava/lang/String;Lz6/e;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final immutable()Lokhttp3/e$a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/e$a;->immutable:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public final maxAge(ILjava/util/concurrent/TimeUnit;)Lokhttp3/e$a;
    .locals 2

    .line 1
    const-string v0, "timeUnit"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    int-to-long v0, p1

    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-direct {p0, p1, p2}, Lokhttp3/e$a;->clampToInt(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lokhttp3/e$a;->maxAgeSeconds:I

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p2, "maxAge < 0: "

    .line 21
    .line 22
    invoke-static {p1, p2}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p2
.end method

.method public final maxStale(ILjava/util/concurrent/TimeUnit;)Lokhttp3/e$a;
    .locals 2

    .line 1
    const-string v0, "timeUnit"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    int-to-long v0, p1

    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-direct {p0, p1, p2}, Lokhttp3/e$a;->clampToInt(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lokhttp3/e$a;->maxStaleSeconds:I

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p2, "maxStale < 0: "

    .line 21
    .line 22
    invoke-static {p1, p2}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p2
.end method

.method public final minFresh(ILjava/util/concurrent/TimeUnit;)Lokhttp3/e$a;
    .locals 2

    .line 1
    const-string v0, "timeUnit"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    int-to-long v0, p1

    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-direct {p0, p1, p2}, Lokhttp3/e$a;->clampToInt(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lokhttp3/e$a;->minFreshSeconds:I

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p2, "minFresh < 0: "

    .line 21
    .line 22
    invoke-static {p1, p2}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p2
.end method

.method public final noCache()Lokhttp3/e$a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/e$a;->noCache:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public final noStore()Lokhttp3/e$a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/e$a;->noStore:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public final noTransform()Lokhttp3/e$a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/e$a;->noTransform:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public final onlyIfCached()Lokhttp3/e$a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/e$a;->onlyIfCached:Z

    .line 3
    .line 4
    return-object p0
.end method
