.class public abstract Lr6/c;
.super Lr6/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final k:Lp6/h;

.field public transient l:Lp6/c;


# direct methods
.method public constructor <init>(Lp6/c;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lp6/c;->f()Lp6/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lr6/c;-><init>(Lp6/c;Lp6/h;)V

    return-void
.end method

.method public constructor <init>(Lp6/c;Lp6/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr6/a;-><init>(Lp6/c;)V

    .line 2
    iput-object p2, p0, Lr6/c;->k:Lp6/h;

    return-void
.end method


# virtual methods
.method public final f()Lp6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lr6/c;->k:Lp6/h;

    .line 2
    .line 3
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr6/c;->l:Lp6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eq v0, p0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lr6/c;->k:Lp6/h;

    .line 8
    .line 9
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lp6/d;->j:Lp6/d;

    .line 13
    .line 14
    invoke-interface {v1, v2}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Lp6/e;

    .line 22
    .line 23
    check-cast v0, Lm7/f;

    .line 24
    .line 25
    sget-object v1, Lm7/f;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lm7/a;->c:Lm7/s;

    .line 32
    .line 33
    if-eq v2, v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v1, v0, Li7/g;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    check-cast v0, Li7/g;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    :goto_0
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Li7/g;->r()V

    .line 50
    .line 51
    .line 52
    :cond_2
    sget-object v0, Lr6/b;->j:Lr6/b;

    .line 53
    .line 54
    iput-object v0, p0, Lr6/c;->l:Lp6/c;

    .line 55
    .line 56
    return-void
.end method
