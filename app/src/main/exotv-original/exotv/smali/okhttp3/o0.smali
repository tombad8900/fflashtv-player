.class public abstract Lokhttp3/o0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onClosed(Lokhttp3/n0;ILjava/lang/String;)V
    .locals 0

    .line 1
    const-string p2, "webSocket"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "reason"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onClosing(Lokhttp3/n0;ILjava/lang/String;)V
    .locals 0

    .line 1
    const-string p2, "webSocket"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "reason"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onFailure(Lokhttp3/n0;Ljava/lang/Throwable;Lokhttp3/i0;)V
    .locals 0

    .line 1
    const-string p3, "webSocket"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "t"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onMessage(Lokhttp3/n0;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "webSocket"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "text"

    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMessage(Lokhttp3/n0;Lv7/m;)V
    .locals 1

    .line 2
    const-string v0, "webSocket"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "bytes"

    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onOpen(Lokhttp3/n0;Lokhttp3/i0;)V
    .locals 1

    .line 1
    const-string v0, "webSocket"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
