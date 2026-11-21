.class public final Lokhttp3/internal/platform/android/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/platform/android/f;
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
    invoke-direct {p0}, Lokhttp3/internal/platform/android/f$a;-><init>()V

    return-void
.end method

.method public static final synthetic access$build(Lokhttp3/internal/platform/android/f$a;Ljava/lang/Class;)Lokhttp3/internal/platform/android/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lokhttp3/internal/platform/android/f$a;->build(Ljava/lang/Class;)Lokhttp3/internal/platform/android/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final build(Ljava/lang/Class;)Lokhttp3/internal/platform/android/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocket;",
            ">;)",
            "Lokhttp3/internal/platform/android/f;"
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    :goto_0
    if-eqz v0, :cond_1

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "OpenSSLSocketImpl"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "No OpenSSLSocketImpl superclass of socket of type "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    new-instance p1, Lokhttp3/internal/platform/android/f;

    .line 44
    .line 45
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Lokhttp3/internal/platform/android/f;-><init>(Ljava/lang/Class;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method


# virtual methods
.method public final factory(Ljava/lang/String;)Lokhttp3/internal/platform/android/j;
    .locals 1

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/internal/platform/android/f$a$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lokhttp3/internal/platform/android/f$a$a;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final getPlayProviderFactory()Lokhttp3/internal/platform/android/j;
    .locals 1

    .line 1
    invoke-static {}, Lokhttp3/internal/platform/android/f;->access$getPlayProviderFactory$cp()Lokhttp3/internal/platform/android/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
