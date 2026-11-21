.class public interface abstract Lokhttp3/internal/http/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final Companion:Lokhttp3/internal/http/e;

.field public static final DISCARD_STREAM_TIMEOUT_MILLIS:I = 0x64


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/http/e;->$$INSTANCE:Lokhttp3/internal/http/e;

    .line 2
    .line 3
    sput-object v0, Lokhttp3/internal/http/f;->Companion:Lokhttp3/internal/http/e;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract createRequestBody(Lokhttp3/g0;J)Lv7/i0;
.end method

.method public abstract finishRequest()V
.end method

.method public abstract flushRequest()V
.end method

.method public abstract getConnection()Lokhttp3/internal/connection/f;
.end method

.method public abstract openResponseBodySource(Lokhttp3/i0;)Lv7/k0;
.end method

.method public abstract readResponseHeaders(Z)Lokhttp3/i0$a;
.end method

.method public abstract reportedContentLength(Lokhttp3/i0;)J
.end method

.method public abstract trailers()Lokhttp3/y;
.end method

.method public abstract writeRequestHeaders(Lokhttp3/g0;)V
.end method
