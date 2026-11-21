.class public final Ln4/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln4/i;


# instance fields
.field public final synthetic j:Landroidx/lifecycle/o;

.field public final synthetic k:La1/e;


# direct methods
.method public constructor <init>(La1/e;Landroidx/lifecycle/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln4/j;->k:La1/e;

    .line 5
    .line 6
    iput-object p2, p0, Ln4/j;->j:Landroidx/lifecycle/o;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/j;->k:La1/e;

    .line 2
    .line 3
    iget-object v0, v0, La1/e;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v1, p0, Ln4/j;->j:Landroidx/lifecycle/o;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()V
    .locals 0

    .line 1
    return-void
.end method
