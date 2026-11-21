.class public abstract Lb5/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lokhttp3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lokhttp3/e0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/e0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    const-wide/16 v2, 0x14

    .line 9
    .line 10
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/e0$a;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-wide/16 v2, 0x1e

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/e0$a;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/e0$a;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lokhttp3/e0$a;->followRedirects(Z)Lokhttp3/e0$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Lokhttp3/e0$a;->retryOnConnectionFailure(Z)Lokhttp3/e0$a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lokhttp3/e0$a;->build()Lokhttp3/e0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lb5/m;->a:Lokhttp3/e0;

    .line 38
    .line 39
    return-void
.end method
