.class public final Lokhttp3/internal/http2/f$d$d;
.super Lokhttp3/internal/concurrent/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/http2/f$d;->settings(ZLokhttp3/internal/http2/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $clearPrevious$inlined:Z

.field final synthetic $settings$inlined:Lokhttp3/internal/http2/o;

.field final synthetic this$0:Lokhttp3/internal/http2/f$d;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLokhttp3/internal/http2/f$d;ZLokhttp3/internal/http2/o;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lokhttp3/internal/http2/f$d$d;->this$0:Lokhttp3/internal/http2/f$d;

    .line 2
    .line 3
    iput-boolean p4, p0, Lokhttp3/internal/http2/f$d$d;->$clearPrevious$inlined:Z

    .line 4
    .line 5
    iput-object p5, p0, Lokhttp3/internal/http2/f$d$d;->$settings$inlined:Lokhttp3/internal/http2/o;

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
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/f$d$d;->this$0:Lokhttp3/internal/http2/f$d;

    .line 2
    .line 3
    iget-boolean v1, p0, Lokhttp3/internal/http2/f$d$d;->$clearPrevious$inlined:Z

    .line 4
    .line 5
    iget-object v2, p0, Lokhttp3/internal/http2/f$d$d;->$settings$inlined:Lokhttp3/internal/http2/o;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/http2/f$d;->applyAndAckSettings(ZLokhttp3/internal/http2/o;)V

    .line 8
    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method
