.class public final synthetic Lz4/z;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Li7/m;

.field public final synthetic k:Lz4/o;

.field public final synthetic l:Lz6/l;

.field public final synthetic m:Landroid/os/Handler;

.field public final synthetic n:Lz6/n;


# direct methods
.method public synthetic constructor <init>(Li7/m;Lz4/o;Lz6/l;Landroid/os/Handler;Lz6/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz4/z;->j:Li7/m;

    .line 5
    .line 6
    iput-object p2, p0, Lz4/z;->k:Lz4/o;

    .line 7
    .line 8
    iput-object p3, p0, Lz4/z;->l:Lz6/l;

    .line 9
    .line 10
    iput-object p4, p0, Lz4/z;->m:Landroid/os/Handler;

    .line 11
    .line 12
    iput-object p5, p0, Lz4/z;->n:Lz6/n;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/z;->j:Li7/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Li7/a1;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lz4/z;->k:Lz4/o;

    .line 10
    .line 11
    iget-object v1, v1, Lz4/o;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Lz4/z;->l:Lz6/l;

    .line 14
    .line 15
    iget v2, v2, Lz6/l;->j:I

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " went quiet after "

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, " refusal(s)"

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "ResolverChain"

    .line 43
    .line 44
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    sget-object v1, Lm6/p;->j:Lm6/p;

    .line 48
    .line 49
    iget-object v2, p0, Lz4/z;->m:Landroid/os/Handler;

    .line 50
    .line 51
    iget-object v3, p0, Lz4/z;->n:Lz6/n;

    .line 52
    .line 53
    invoke-static {v0, v2, v3, v1}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method
