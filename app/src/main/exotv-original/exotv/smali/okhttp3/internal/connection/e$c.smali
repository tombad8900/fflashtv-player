.class public final Lokhttp3/internal/connection/e$c;
.super Lv7/f;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/connection/e;-><init>(Lokhttp3/e0;Lokhttp3/g0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/connection/e;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/connection/e$c;->this$0:Lokhttp3/internal/connection/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public timedOut()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e$c;->this$0:Lokhttp3/internal/connection/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/connection/e;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
