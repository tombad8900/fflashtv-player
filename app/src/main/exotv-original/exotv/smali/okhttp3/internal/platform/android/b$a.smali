.class public final Lokhttp3/internal/platform/android/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/platform/android/b;
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
    invoke-direct {p0}, Lokhttp3/internal/platform/android/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildIfSupported(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/platform/android/b;
    .locals 2

    .line 1
    const-string v0, "trustManager"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    new-instance v1, Landroid/net/http/X509TrustManagerExtensions;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-object v1, v0

    .line 14
    :goto_0
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Lokhttp3/internal/platform/android/b;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lokhttp3/internal/platform/android/b;-><init>(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
.end method
