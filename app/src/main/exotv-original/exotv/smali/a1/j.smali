.class public abstract La1/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Le4/s;


# instance fields
.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La1/j;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh/x;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/j;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, La1/j;->j:Ljava/lang/Object;

    iput-object p2, p0, La1/j;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, La1/j;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/u;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, La1/j;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lh/x;

    .line 10
    .line 11
    iget-object v1, v1, Lh/x;->t:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, La1/j;->j:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, La1/j;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/z0;

    .line 4
    .line 5
    iget-object v1, p0, La1/j;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Li0/b;

    .line 8
    .line 9
    iget-object v2, v0, La1/z0;->e:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, La1/z0;->b()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public abstract e()Landroid/content/IntentFilter;
.end method

.method public abstract f()I
.end method

.method public g(Le4/x;)Le4/r;
    .locals 5

    .line 1
    new-instance v0, Lf4/d;

    .line 2
    .line 3
    iget-object v1, p0, La1/j;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, La1/j;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Class;

    .line 10
    .line 11
    const-class v3, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p1, v3, v2}, Le4/x;->a(Ljava/lang/Class;Ljava/lang/Class;)Le4/r;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-class v4, Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {p1, v4, v2}, Le4/x;->a(Ljava/lang/Class;Ljava/lang/Class;)Le4/r;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, v1, v3, p1, v2}, Lf4/d;-><init>(Landroid/content/Context;Le4/r;Le4/r;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public h(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    instance-of v0, p1, Lg0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lg0/a;

    .line 6
    .line 7
    iget-object v0, p0, La1/j;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lp/k;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lp/k;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lp/k;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La1/j;->k:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, La1/j;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lp/k;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/view/MenuItem;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Ll/u;

    .line 34
    .line 35
    iget-object v1, p0, La1/j;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, Ll/u;-><init>(Landroid/content/Context;Lg0/a;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, La1/j;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lp/k;

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    return-object p1
.end method

.method public abstract i()V
.end method

.method public j()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La1/j;->c()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La1/j;->e()Landroid/content/IntentFilter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, La1/j;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lh/u;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Lh/u;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, v2, p0}, Lh/u;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, La1/j;->j:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, La1/j;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lh/x;

    .line 32
    .line 33
    iget-object v1, v1, Lh/x;->t:Landroid/content/Context;

    .line 34
    .line 35
    iget-object v2, p0, La1/j;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lh/u;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    return-void
.end method
