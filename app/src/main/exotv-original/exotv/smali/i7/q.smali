.class public final Li7/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lp6/g;


# instance fields
.field public final j:Ly6/l;

.field public final k:Lp6/g;


# direct methods
.method public constructor <init>(Lp6/g;Ly6/l;)V
    .locals 1

    .line 1
    const-string v0, "baseKey"

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
    iput-object p2, p0, Li7/q;->j:Ly6/l;

    .line 10
    .line 11
    instance-of p2, p1, Li7/q;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    check-cast p1, Li7/q;

    .line 16
    .line 17
    iget-object p1, p1, Li7/q;->k:Lp6/g;

    .line 18
    .line 19
    :cond_0
    iput-object p1, p0, Li7/q;->k:Lp6/g;

    .line 20
    .line 21
    return-void
.end method
