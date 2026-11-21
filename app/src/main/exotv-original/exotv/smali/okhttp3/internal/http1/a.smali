.class public final Lokhttp3/internal/http1/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http1/a$a;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/internal/http1/a$a;

.field private static final HEADER_LIMIT:I = 0x40000


# instance fields
.field private headerLimit:J

.field private final source:Lv7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/http1/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/http1/a$a;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/http1/a;->Companion:Lokhttp3/internal/http1/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lv7/l;)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/http1/a;->source:Lv7/l;

    .line 10
    .line 11
    const-wide/32 v0, 0x40000

    .line 12
    .line 13
    .line 14
    iput-wide v0, p0, Lokhttp3/internal/http1/a;->headerLimit:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final getSource()Lv7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/a;->source:Lv7/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final readHeaders()Lokhttp3/y;
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/y$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/y$a;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p0}, Lokhttp3/internal/http1/a;->readLine()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lokhttp3/y$a;->build()Lokhttp3/y;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    invoke-virtual {v0, v1}, Lokhttp3/y$a;->addLenient$okhttp(Ljava/lang/String;)Lokhttp3/y$a;

    .line 22
    .line 23
    .line 24
    goto :goto_0
.end method

.method public final readLine()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/a;->source:Lv7/l;

    .line 2
    .line 3
    iget-wide v1, p0, Lokhttp3/internal/http1/a;->headerLimit:J

    .line 4
    .line 5
    invoke-interface {v0, v1, v2}, Lv7/l;->n(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, p0, Lokhttp3/internal/http1/a;->headerLimit:J

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    int-to-long v3, v3

    .line 16
    sub-long/2addr v1, v3

    .line 17
    iput-wide v1, p0, Lokhttp3/internal/http1/a;->headerLimit:J

    .line 18
    .line 19
    return-object v0
.end method
