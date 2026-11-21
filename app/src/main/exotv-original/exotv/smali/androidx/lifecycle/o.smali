.class public abstract Landroidx/lifecycle/o;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Le4/s;


# instance fields
.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    return-void

    .line 6
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object p1, Lu4/m;->a:[C

    .line 8
    new-instance p1, Ljava/util/ArrayDeque;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 9
    iput-object p1, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Landroidx/lifecycle/u;)V
.end method

.method public abstract b()Landroidx/lifecycle/n;
.end method

.method public c(Lb4/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x14

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public abstract d(Lm0/b1;)V
.end method

.method public abstract e(Lm0/b1;)V
.end method

.method public abstract f(Lm0/r1;Ljava/util/List;)Lm0/r1;
.end method

.method public g(Le4/x;)Le4/r;
    .locals 2

    .line 1
    new-instance p1, Le4/c;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Le4/a0;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {p1, v1, v0}, Le4/c;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public abstract h(Lm0/b1;La1/e;)La1/e;
.end method

.method public abstract i(Landroidx/lifecycle/u;)V
.end method
