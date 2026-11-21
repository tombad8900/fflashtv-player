.class public final synthetic Lz4/a0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Li7/m;

.field public final synthetic k:Lz4/o;

.field public final synthetic l:J

.field public final synthetic m:Landroid/os/Handler;

.field public final synthetic n:Lz6/n;


# direct methods
.method public synthetic constructor <init>(Li7/m;Lz4/o;JLandroid/os/Handler;Lz6/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz4/a0;->j:Li7/m;

    .line 5
    .line 6
    iput-object p2, p0, Lz4/a0;->k:Lz4/o;

    .line 7
    .line 8
    iput-wide p3, p0, Lz4/a0;->l:J

    .line 9
    .line 10
    iput-object p5, p0, Lz4/a0;->m:Landroid/os/Handler;

    .line 11
    .line 12
    iput-object p6, p0, Lz4/a0;->n:Lz6/n;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lz4/a0;->j:Li7/m;

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
    iget-object v1, p0, Lz4/a0;->k:Lz4/o;

    .line 10
    .line 11
    iget-object v1, v1, Lz4/o;->j:Ljava/lang/String;

    .line 12
    .line 13
    const/16 v2, 0x3e8

    .line 14
    .line 15
    int-to-long v2, v2

    .line 16
    iget-wide v4, p0, Lz4/a0;->l:J

    .line 17
    .line 18
    div-long/2addr v4, v2

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " walk timed out after "

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "s"

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "ResolverChain"

    .line 45
    .line 46
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    sget-object v1, Lm6/p;->j:Lm6/p;

    .line 50
    .line 51
    iget-object v2, p0, Lz4/a0;->m:Landroid/os/Handler;

    .line 52
    .line 53
    iget-object v3, p0, Lz4/a0;->n:Lz6/n;

    .line 54
    .line 55
    invoke-static {v0, v2, v3, v1}, Lz4/e0;->n(Li7/l;Landroid/os/Handler;Lz6/n;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method
