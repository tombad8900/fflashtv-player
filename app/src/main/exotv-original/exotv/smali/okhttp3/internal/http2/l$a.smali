.class public final Lokhttp3/internal/http2/l$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final children:[Lokhttp3/internal/http2/l$a;

.field private final symbol:I

.field private final terminalBitCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 2
    new-array v0, v0, [Lokhttp3/internal/http2/l$a;

    iput-object v0, p0, Lokhttp3/internal/http2/l$a;->children:[Lokhttp3/internal/http2/l$a;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lokhttp3/internal/http2/l$a;->symbol:I

    .line 4
    iput v0, p0, Lokhttp3/internal/http2/l$a;->terminalBitCount:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lokhttp3/internal/http2/l$a;->children:[Lokhttp3/internal/http2/l$a;

    .line 7
    iput p1, p0, Lokhttp3/internal/http2/l$a;->symbol:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 8
    :cond_0
    iput p1, p0, Lokhttp3/internal/http2/l$a;->terminalBitCount:I

    return-void
.end method


# virtual methods
.method public final getChildren()[Lokhttp3/internal/http2/l$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/l$a;->children:[Lokhttp3/internal/http2/l$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSymbol()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/internal/http2/l$a;->symbol:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTerminalBitCount()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/internal/http2/l$a;->terminalBitCount:I

    .line 2
    .line 3
    return v0
.end method
