.class public final La1/w0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/lifecycle/i;
.implements La3/f;
.implements Landroidx/lifecycle/u0;


# instance fields
.field public final j:La1/v;

.field public final k:Landroidx/lifecycle/t0;

.field public l:Landroidx/lifecycle/x;

.field public m:Ln4/p;


# direct methods
.method public constructor <init>(La1/v;Landroidx/lifecycle/t0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La1/w0;->l:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iput-object v0, p0, La1/w0;->m:Ln4/p;

    .line 8
    .line 9
    iput-object p1, p0, La1/w0;->j:La1/v;

    .line 10
    .line 11
    iput-object p2, p0, La1/w0;->k:Landroidx/lifecycle/t0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ld1/b;
    .locals 5

    .line 1
    iget-object v0, p0, La1/w0;->j:La1/v;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/v;->D()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    new-instance v2, Ld1/b;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, v3}, Ld1/b;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    sget-object v4, Landroidx/lifecycle/m0;->d:Ly5/f;

    .line 43
    .line 44
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_2
    sget-object v1, Landroidx/lifecycle/m0;->a:Ly5/f;

    .line 48
    .line 49
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object v1, Landroidx/lifecycle/m0;->b:Ly5/f;

    .line 53
    .line 54
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, La1/v;->o:Landroid/os/Bundle;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    sget-object v1, Landroidx/lifecycle/m0;->c:Ly5/f;

    .line 62
    .line 63
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_3
    return-object v2
.end method

.method public final b()Landroidx/lifecycle/t0;
    .locals 1

    .line 1
    invoke-virtual {p0}, La1/w0;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La1/w0;->k:Landroidx/lifecycle/t0;

    .line 5
    .line 6
    return-object v0
.end method

.method public final c()La3/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, La1/w0;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La1/w0;->m:Ln4/p;

    .line 5
    .line 6
    iget-object v0, v0, Ln4/p;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La3/e;

    .line 9
    .line 10
    return-object v0
.end method

.method public final d(Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, La1/w0;->l:Landroidx/lifecycle/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Landroidx/lifecycle/o;
    .locals 1

    .line 1
    invoke-virtual {p0}, La1/w0;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La1/w0;->l:Landroidx/lifecycle/x;

    .line 5
    .line 6
    return-object v0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, La1/w0;->l:Landroidx/lifecycle/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/x;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/x;-><init>(Landroidx/lifecycle/v;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La1/w0;->l:Landroidx/lifecycle/x;

    .line 11
    .line 12
    new-instance v0, Ln4/p;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ln4/p;-><init>(La3/f;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La1/w0;->m:Ln4/p;

    .line 18
    .line 19
    invoke-virtual {v0}, Ln4/p;->d()V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/lifecycle/m0;->d(La3/f;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
