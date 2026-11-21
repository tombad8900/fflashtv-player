.class public final Lokhttp3/internal/connection/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/connection/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lz6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/connection/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final newTestConnection(Lokhttp3/internal/connection/h;Lokhttp3/k0;Ljava/net/Socket;J)Lokhttp3/internal/connection/f;
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "route"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "socket"

    .line 12
    .line 13
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lokhttp3/internal/connection/f;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lokhttp3/internal/connection/f;-><init>(Lokhttp3/internal/connection/h;Lokhttp3/k0;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p3}, Lokhttp3/internal/connection/f;->access$setSocket$p(Lokhttp3/internal/connection/f;Ljava/net/Socket;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p4, p5}, Lokhttp3/internal/connection/f;->setIdleAtNs$okhttp(J)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
