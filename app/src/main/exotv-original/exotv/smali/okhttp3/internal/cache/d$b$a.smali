.class public final Lokhttp3/internal/cache/d$b$a;
.super Lz6/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/cache/d$b;->newSink(I)Lv7/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/cache/d;

.field final synthetic this$1:Lokhttp3/internal/cache/d$b;


# direct methods
.method public constructor <init>(Lokhttp3/internal/cache/d;Lokhttp3/internal/cache/d$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/cache/d$b$a;->this$0:Lokhttp3/internal/cache/d;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/internal/cache/d$b$a;->this$1:Lokhttp3/internal/cache/d$b;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lz6/i;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/IOException;

    invoke-virtual {p0, p1}, Lokhttp3/internal/cache/d$b$a;->invoke(Ljava/io/IOException;)V

    sget-object p1, Ll6/j;->a:Ll6/j;

    return-object p1
.end method

.method public final invoke(Ljava/io/IOException;)V
    .locals 1

    const-string v0, "it"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lokhttp3/internal/cache/d$b$a;->this$0:Lokhttp3/internal/cache/d;

    iget-object v0, p0, Lokhttp3/internal/cache/d$b$a;->this$1:Lokhttp3/internal/cache/d$b;

    monitor-enter p1

    .line 3
    :try_start_0
    invoke-virtual {v0}, Lokhttp3/internal/cache/d$b;->detach$okhttp()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method
