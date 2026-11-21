.class public final Ld3/p;
.super Ld3/o;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Lp/e;

.field public final synthetic b:Ld3/q;


# direct methods
.method public constructor <init>(Ld3/q;Lp/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld3/p;->b:Ld3/q;

    .line 5
    .line 6
    iput-object p2, p0, Ld3/p;->a:Lp/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ld3/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld3/p;->b:Ld3/q;

    .line 2
    .line 3
    iget-object v0, v0, Ld3/q;->k:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v1, p0, Ld3/p;->a:Lp/e;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ld3/n;->w(Ld3/l;)Ld3/n;

    .line 17
    .line 18
    .line 19
    return-void
.end method
