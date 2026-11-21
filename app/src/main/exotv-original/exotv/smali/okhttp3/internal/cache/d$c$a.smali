.class public final Lokhttp3/internal/cache/d$c$a;
.super Lv7/r;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/cache/d$c;->newSource(I)Lv7/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private closed:Z

.field final synthetic this$0:Lokhttp3/internal/cache/d;

.field final synthetic this$1:Lokhttp3/internal/cache/d$c;


# direct methods
.method public constructor <init>(Lv7/k0;Lokhttp3/internal/cache/d;Lokhttp3/internal/cache/d$c;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lokhttp3/internal/cache/d$c$a;->this$0:Lokhttp3/internal/cache/d;

    .line 2
    .line 3
    iput-object p3, p0, Lokhttp3/internal/cache/d$c$a;->this$1:Lokhttp3/internal/cache/d$c;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lv7/r;-><init>(Lv7/k0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    invoke-super {p0}, Lv7/r;->close()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lokhttp3/internal/cache/d$c$a;->closed:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lokhttp3/internal/cache/d$c$a;->closed:Z

    .line 10
    .line 11
    iget-object v0, p0, Lokhttp3/internal/cache/d$c$a;->this$0:Lokhttp3/internal/cache/d;

    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/internal/cache/d$c$a;->this$1:Lokhttp3/internal/cache/d$c;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-virtual {v1}, Lokhttp3/internal/cache/d$c;->getLockingSourceCount$okhttp()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/lit8 v2, v2, -0x1

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lokhttp3/internal/cache/d$c;->setLockingSourceCount$okhttp(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lokhttp3/internal/cache/d$c;->getLockingSourceCount$okhttp()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Lokhttp3/internal/cache/d$c;->getZombie$okhttp()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lokhttp3/internal/cache/d;->removeEntry$okhttp(Lokhttp3/internal/cache/d$c;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0

    .line 46
    throw v1

    .line 47
    :cond_1
    return-void
.end method
