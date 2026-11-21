.class public final Lokhttp3/internal/connection/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/c0;


# static fields
.field public static final INSTANCE:Lokhttp3/internal/connection/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/internal/connection/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/internal/connection/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lokhttp3/internal/connection/a;->INSTANCE:Lokhttp3/internal/connection/a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/a0;)Lokhttp3/i0;
    .locals 10

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Lokhttp3/internal/http/i;

    .line 8
    .line 9
    invoke-virtual {v1}, Lokhttp3/internal/http/i;->getCall$okhttp()Lokhttp3/internal/connection/e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, v1}, Lokhttp3/internal/connection/e;->initExchange$okhttp(Lokhttp3/internal/http/i;)Lokhttp3/internal/connection/c;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/16 v8, 0x3d

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    invoke-static/range {v1 .. v9}, Lokhttp3/internal/http/i;->copy$okhttp$default(Lokhttp3/internal/http/i;ILokhttp3/internal/connection/c;Lokhttp3/g0;IIIILjava/lang/Object;)Lokhttp3/internal/http/i;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v1}, Lokhttp3/internal/http/i;->getRequest$okhttp()Lokhttp3/g0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Lokhttp3/internal/http/i;->proceed(Lokhttp3/g0;)Lokhttp3/i0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method
