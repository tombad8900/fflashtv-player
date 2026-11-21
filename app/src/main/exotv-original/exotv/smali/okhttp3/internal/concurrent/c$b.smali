.class public final Lokhttp3/internal/concurrent/c$b;
.super Lokhttp3/internal/concurrent/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/concurrent/c;->execute(Ljava/lang/String;JZLy6/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $block:Ly6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly6/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLy6/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ly6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p3, p0, Lokhttp3/internal/concurrent/c$b;->$block:Ly6/a;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/concurrent/a;-><init>(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public runOnce()J
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/concurrent/c$b;->$block:Ly6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    return-wide v0
.end method
