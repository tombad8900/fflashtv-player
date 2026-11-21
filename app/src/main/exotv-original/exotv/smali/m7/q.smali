.class public Lm7/q;
.super Li7/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lr6/d;


# instance fields
.field public final m:Lp6/c;


# direct methods
.method public constructor <init>(Lp6/c;Lp6/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Li7/a;-><init>(Lp6/h;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lm7/q;->m:Lp6/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final a()Lr6/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lm7/q;->m:Lp6/c;

    .line 2
    .line 3
    instance-of v1, v0, Lr6/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lr6/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public k(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->m:Lp6/c;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Li7/x;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, v0}, Lm7/a;->f(Ljava/lang/Object;Lp6/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->m:Lp6/c;

    .line 2
    .line 3
    invoke-static {p1}, Li7/x;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lp6/c;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
