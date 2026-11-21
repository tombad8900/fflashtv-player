.class public final Lokhttp3/internal/http2/f$d$a;
.super Lokhttp3/internal/concurrent/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/http2/f$d;->applyAndAckSettings(ZLokhttp3/internal/http2/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $newPeerSettings$inlined:Lz6/n;

.field final synthetic this$0:Lokhttp3/internal/http2/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLokhttp3/internal/http2/f;Lz6/n;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lokhttp3/internal/http2/f$d$a;->this$0:Lokhttp3/internal/http2/f;

    .line 2
    .line 3
    iput-object p4, p0, Lokhttp3/internal/http2/f$d$a;->$newPeerSettings$inlined:Lz6/n;

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/concurrent/a;-><init>(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public runOnce()J
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$d$a;->this$0:Lokhttp3/internal/http2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/http2/f;->getListener$okhttp()Lokhttp3/internal/http2/f$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lokhttp3/internal/http2/f$d$a;->this$0:Lokhttp3/internal/http2/f;

    .line 8
    .line 9
    iget-object v2, p0, Lokhttp3/internal/http2/f$d$a;->$newPeerSettings$inlined:Lz6/n;

    .line 10
    .line 11
    iget-object v2, v2, Lz6/n;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lokhttp3/internal/http2/o;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/http2/f$c;->onSettings(Lokhttp3/internal/http2/f;Lokhttp3/internal/http2/o;)V

    .line 16
    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    return-wide v0
.end method
