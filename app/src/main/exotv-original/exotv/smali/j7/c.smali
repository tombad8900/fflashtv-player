.class public final synthetic Lj7/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Li7/f0;


# instance fields
.field public final synthetic j:Lj7/d;

.field public final synthetic k:Li7/k1;


# direct methods
.method public synthetic constructor <init>(Lj7/d;Li7/k1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj7/c;->j:Lj7/d;

    .line 5
    .line 6
    iput-object p2, p0, Lj7/c;->k:Li7/k1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj7/c;->k:Li7/k1;

    .line 2
    .line 3
    iget-object v1, p0, Lj7/c;->j:Lj7/d;

    .line 4
    .line 5
    iget-object v1, v1, Lj7/d;->l:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
