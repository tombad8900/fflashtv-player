.class public final Lv3/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/h;
.implements Ly6/l;


# instance fields
.field public final j:Lokhttp3/g;

.field public final k:Li7/g;


# direct methods
.method public constructor <init>(Lokhttp3/g;Li7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv3/g;->j:Lokhttp3/g;

    .line 5
    .line 6
    iput-object p2, p0, Lv3/g;->k:Li7/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    :try_start_0
    iget-object p1, p0, Lv3/g;->j:Lokhttp3/g;

    .line 4
    .line 5
    invoke-interface {p1}, Lokhttp3/g;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :catchall_0
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 9
    .line 10
    return-object p1
.end method

.method public final onFailure(Lokhttp3/g;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lokhttp3/g;->isCanceled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lv3/g;->k:Li7/g;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p2}, Li7/g;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final onResponse(Lokhttp3/g;Lokhttp3/i0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lv3/g;->k:Li7/g;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Li7/g;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
