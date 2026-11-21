.class public final Lokhttp3/internal/http2/f$d$c;
.super Lokhttp3/internal/concurrent/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/http2/f$d;->ping(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $payload1$inlined:I

.field final synthetic $payload2$inlined:I

.field final synthetic this$0:Lokhttp3/internal/http2/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLokhttp3/internal/http2/f;II)V
    .locals 0

    .line 1
    iput-object p3, p0, Lokhttp3/internal/http2/f$d$c;->this$0:Lokhttp3/internal/http2/f;

    .line 2
    .line 3
    iput p4, p0, Lokhttp3/internal/http2/f$d$c;->$payload1$inlined:I

    .line 4
    .line 5
    iput p5, p0, Lokhttp3/internal/http2/f$d$c;->$payload2$inlined:I

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/concurrent/a;-><init>(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public runOnce()J
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$d$c;->this$0:Lokhttp3/internal/http2/f;

    .line 2
    .line 3
    iget v1, p0, Lokhttp3/internal/http2/f$d$c;->$payload1$inlined:I

    .line 4
    .line 5
    iget v2, p0, Lokhttp3/internal/http2/f$d$c;->$payload2$inlined:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v0, v3, v1, v2}, Lokhttp3/internal/http2/f;->writePing(ZII)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    return-wide v0
.end method
