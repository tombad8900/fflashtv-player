.class public final Lf6/o1;
.super Lf6/w0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final transient m:Lf6/q0;

.field public final transient n:Lf6/p1;


# direct methods
.method public constructor <init>(Lf6/q0;Lf6/p1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/o1;->m:Lf6/q0;

    .line 5
    .line 6
    iput-object p2, p0, Lf6/o1;->n:Lf6/p1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lf6/m0;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/o1;->n:Lf6/p1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(I[Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/o1;->n:Lf6/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lf6/m0;->b(I[Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/o1;->m:Lf6/q0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf6/q0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final g()Lf6/z1;
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/o1;->n:Lf6/p1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lf6/m0;->l(I)Lf6/k0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/o1;->m:Lf6/q0;

    .line 2
    .line 3
    check-cast v0, Lf6/q1;

    .line 4
    .line 5
    iget v0, v0, Lf6/q1;->o:I

    .line 6
    .line 7
    return v0
.end method
