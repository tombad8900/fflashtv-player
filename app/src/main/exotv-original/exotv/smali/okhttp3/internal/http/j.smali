.class public final Lokhttp3/internal/http/j;
.super Lokhttp3/j0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field private final contentLength:J

.field private final contentTypeString:Ljava/lang/String;

.field private final source:Lv7/l;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLv7/l;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {v0, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lokhttp3/j0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/http/j;->contentTypeString:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, Lokhttp3/internal/http/j;->contentLength:J

    .line 12
    .line 13
    iput-object p4, p0, Lokhttp3/internal/http/j;->source:Lv7/l;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/http/j;->contentLength:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Lokhttp3/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http/j;->contentTypeString:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lokhttp3/d0;->Companion:Lokhttp3/d0$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lokhttp3/d0$a;->parse(Ljava/lang/String;)Lokhttp3/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public source()Lv7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http/j;->source:Lv7/l;

    .line 2
    .line 3
    return-object v0
.end method
