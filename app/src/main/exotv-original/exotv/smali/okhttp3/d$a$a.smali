.class public final Lokhttp3/d$a$a;
.super Lv7/r;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/d$a;-><init>(Lokhttp3/internal/cache/d$d;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/d$a;


# direct methods
.method public constructor <init>(Lv7/k0;Lokhttp3/d$a;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lokhttp3/d$a$a;->this$0:Lokhttp3/d$a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lv7/r;-><init>(Lv7/k0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/d$a$a;->this$0:Lokhttp3/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/d$a;->getSnapshot()Lokhttp3/internal/cache/d$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lokhttp3/internal/cache/d$d;->close()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Lv7/r;->close()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
