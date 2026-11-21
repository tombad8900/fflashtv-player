.class public interface abstract Lokhttp3/internal/http2/n;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final CANCEL:Lokhttp3/internal/http2/n;

.field public static final Companion:Lokhttp3/internal/http2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/http2/m;->$$INSTANCE:Lokhttp3/internal/http2/m;

    .line 2
    .line 3
    sput-object v0, Lokhttp3/internal/http2/n;->Companion:Lokhttp3/internal/http2/m;

    .line 4
    .line 5
    new-instance v0, Lokhttp3/internal/http2/m$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lokhttp3/internal/http2/m$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lokhttp3/internal/http2/n;->CANCEL:Lokhttp3/internal/http2/n;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract onData(ILv7/l;IZ)Z
.end method

.method public abstract onHeaders(ILjava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lokhttp3/internal/http2/c;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract onRequest(ILjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lokhttp3/internal/http2/c;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract onReset(ILokhttp3/internal/http2/b;)V
.end method
