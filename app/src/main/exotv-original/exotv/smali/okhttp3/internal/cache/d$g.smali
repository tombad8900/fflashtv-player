.class public final Lokhttp3/internal/cache/d$g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/Iterator;
.implements La7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/cache/d;->snapshots()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final delegate:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lokhttp3/internal/cache/d$c;",
            ">;"
        }
    .end annotation
.end field

.field private nextSnapshot:Lokhttp3/internal/cache/d$d;

.field private removeSnapshot:Lokhttp3/internal/cache/d$d;

.field final synthetic this$0:Lokhttp3/internal/cache/d;


# direct methods
.method public constructor <init>(Lokhttp3/internal/cache/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lokhttp3/internal/cache/d$g;->this$0:Lokhttp3/internal/cache/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/internal/cache/d;->getLruEntries$okhttp()Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "ArrayList(lruEntries.values).iterator()"

    .line 24
    .line 25
    invoke-static {v0, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lokhttp3/internal/cache/d$g;->delegate:Ljava/util/Iterator;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$g;->nextSnapshot:Lokhttp3/internal/cache/d$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/cache/d$g;->this$0:Lokhttp3/internal/cache/d;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Lokhttp3/internal/cache/d;->getClosed$okhttp()Z

    .line 11
    .line 12
    .line 13
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return v3

    .line 19
    :cond_1
    :goto_0
    :try_start_1
    iget-object v2, p0, Lokhttp3/internal/cache/d$g;->delegate:Ljava/util/Iterator;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    iget-object v2, p0, Lokhttp3/internal/cache/d$g;->delegate:Ljava/util/Iterator;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lokhttp3/internal/cache/d$c;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Lokhttp3/internal/cache/d$c;->snapshot$okhttp()Lokhttp3/internal/cache/d$d;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iput-object v2, p0, Lokhttp3/internal/cache/d$g;->nextSnapshot:Lokhttp3/internal/cache/d$d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return v1

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    monitor-exit v0

    .line 51
    return v3

    .line 52
    :goto_1
    monitor-exit v0

    .line 53
    throw v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/cache/d$g;->next()Lokhttp3/internal/cache/d$d;

    move-result-object v0

    return-object v0
.end method

.method public next()Lokhttp3/internal/cache/d$d;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lokhttp3/internal/cache/d$g;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lokhttp3/internal/cache/d$g;->nextSnapshot:Lokhttp3/internal/cache/d$d;

    iput-object v0, p0, Lokhttp3/internal/cache/d$g;->removeSnapshot:Lokhttp3/internal/cache/d$d;

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lokhttp3/internal/cache/d$g;->nextSnapshot:Lokhttp3/internal/cache/d$d;

    .line 5
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$g;->removeSnapshot:Lokhttp3/internal/cache/d$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    iget-object v2, p0, Lokhttp3/internal/cache/d$g;->this$0:Lokhttp3/internal/cache/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/internal/cache/d$d;->key()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v2, v0}, Lokhttp3/internal/cache/d;->remove(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lokhttp3/internal/cache/d$g;->removeSnapshot:Lokhttp3/internal/cache/d$d;

    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    iput-object v1, p0, Lokhttp3/internal/cache/d$g;->removeSnapshot:Lokhttp3/internal/cache/d$d;

    .line 20
    .line 21
    throw v0

    .line 22
    :catch_0
    iput-object v1, p0, Lokhttp3/internal/cache/d$g;->removeSnapshot:Lokhttp3/internal/cache/d$d;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "remove() before next()"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method
