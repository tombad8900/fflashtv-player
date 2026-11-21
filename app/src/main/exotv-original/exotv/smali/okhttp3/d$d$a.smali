.class public final Lokhttp3/d$d$a;
.super Lv7/q;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/d$d;-><init>(Lokhttp3/d;Lokhttp3/internal/cache/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/d;

.field final synthetic this$1:Lokhttp3/d$d;


# direct methods
.method public constructor <init>(Lokhttp3/d;Lokhttp3/d$d;Lv7/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/d$d$a;->this$0:Lokhttp3/d;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/d$d$a;->this$1:Lokhttp3/d$d;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Lv7/q;-><init>(Lv7/i0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/d$d$a;->this$0:Lokhttp3/d;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/d$d$a;->this$1:Lokhttp3/d$d;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v1}, Lokhttp3/d$d;->getDone()Z

    .line 7
    .line 8
    .line 9
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    :try_start_1
    invoke-virtual {v1, v2}, Lokhttp3/d$d;->setDone(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lokhttp3/d;->getWriteSuccessCount$okhttp()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v2

    .line 23
    invoke-virtual {v0, v1}, Lokhttp3/d;->setWriteSuccessCount$okhttp(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    invoke-super {p0}, Lv7/q;->close()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lokhttp3/d$d$a;->this$1:Lokhttp3/d$d;

    .line 31
    .line 32
    invoke-static {v0}, Lokhttp3/d$d;->access$getEditor$p(Lokhttp3/d$d;)Lokhttp3/internal/cache/d$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lokhttp3/internal/cache/d$b;->commit()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    monitor-exit v0

    .line 42
    throw v1
.end method
