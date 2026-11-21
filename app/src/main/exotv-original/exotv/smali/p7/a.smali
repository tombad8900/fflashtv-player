.class public final Lp7/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Li7/e;
.implements Li7/p1;


# instance fields
.field public final j:Li7/g;

.field public final synthetic k:Lp7/b;


# direct methods
.method public constructor <init>(Lp7/b;Li7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp7/a;->k:Lp7/b;

    .line 5
    .line 6
    iput-object p2, p0, Lp7/a;->j:Li7/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lp7/j;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp7/a;->j:Li7/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Li7/g;->b(Lp7/j;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp7/a;->j:Li7/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li7/g;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Ly6/q;)Lm7/s;
    .locals 3

    .line 1
    new-instance p1, Li7/f;

    .line 2
    .line 3
    iget-object v0, p0, Lp7/a;->k:Lp7/b;

    .line 4
    .line 5
    invoke-direct {p1, v0, p0}, Li7/f;-><init>(Lp7/b;Lp7/a;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp7/a;->j:Li7/g;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Li7/g;->e(Ly6/q;)Lm7/s;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object v1, Lp7/b;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p1
.end method

.method public final f()Lp6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lp7/a;->j:Li7/g;

    .line 2
    .line 3
    iget-object v0, v0, Li7/g;->n:Lp6/h;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i(Li7/f;)V
    .locals 4

    .line 1
    sget-object p1, Lp7/b;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lp7/a;->k:Lp7/b;

    .line 5
    .line 6
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lc5/c1;

    .line 10
    .line 11
    invoke-direct {p1, v1, p0}, Lc5/c1;-><init>(Lp7/b;Lp7/a;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lp7/a;->j:Li7/g;

    .line 15
    .line 16
    iget v1, v0, Li7/d0;->l:I

    .line 17
    .line 18
    new-instance v2, Li7/f;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, v3, p1}, Li7/f;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 25
    .line 26
    invoke-virtual {v0, p1, v1, v2}, Li7/g;->D(Ljava/lang/Object;ILy6/q;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp7/a;->j:Li7/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li7/g;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
