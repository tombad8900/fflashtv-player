.class public final Lokhttp3/internal/cache/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/cache/c$a;,
        Lokhttp3/internal/cache/c$b;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/internal/cache/c$a;


# instance fields
.field private final cacheResponse:Lokhttp3/i0;

.field private final networkRequest:Lokhttp3/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/cache/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/cache/c$a;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/cache/c;->Companion:Lokhttp3/internal/cache/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lokhttp3/g0;Lokhttp3/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/cache/c;->networkRequest:Lokhttp3/g0;

    .line 5
    .line 6
    iput-object p2, p0, Lokhttp3/internal/cache/c;->cacheResponse:Lokhttp3/i0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCacheResponse()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/c;->cacheResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNetworkRequest()Lokhttp3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/c;->networkRequest:Lokhttp3/g0;

    .line 2
    .line 3
    return-object v0
.end method
