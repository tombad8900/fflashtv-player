.class public Lokhttp3/internal/cache/e;
.super Lv7/q;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field private hasErrors:Z

.field private final onException:Ly6/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly6/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv7/i0;Ly6/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/i0;",
            "Ly6/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onException"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lv7/q;-><init>(Lv7/i0;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lokhttp3/internal/cache/e;->onException:Ly6/l;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/cache/e;->hasErrors:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-super {p0}, Lv7/q;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lokhttp3/internal/cache/e;->hasErrors:Z

    .line 13
    .line 14
    iget-object v1, p0, Lokhttp3/internal/cache/e;->onException:Ly6/l;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ly6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public flush()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/cache/e;->hasErrors:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-super {p0}, Lv7/q;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lokhttp3/internal/cache/e;->hasErrors:Z

    .line 13
    .line 14
    iget-object v1, p0, Lokhttp3/internal/cache/e;->onException:Ly6/l;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ly6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final getOnException()Ly6/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly6/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/e;->onException:Ly6/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public write(Lv7/j;J)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lokhttp3/internal/cache/e;->hasErrors:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Lv7/j;->skip(J)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lv7/q;->write(Lv7/j;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p1

    .line 19
    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, Lokhttp3/internal/cache/e;->hasErrors:Z

    .line 21
    .line 22
    iget-object p2, p0, Lokhttp3/internal/cache/e;->onException:Ly6/l;

    .line 23
    .line 24
    invoke-interface {p2, p1}, Ly6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method
