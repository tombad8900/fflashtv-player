.class public final Lm/g;
.super Ll/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Lm/k;


# direct methods
.method public constructor <init>(Lm/k;Landroid/content/Context;Ll/f0;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lm/g;->m:I

    .line 8
    iput-object p1, p0, Lm/g;->n:Lm/k;

    const v2, 0x7f040022

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v6, p3

    move-object v5, p4

    .line 9
    invoke-direct/range {v1 .. v7}, Ll/x;-><init>(IILandroid/content/Context;Landroid/view/View;Ll/m;Z)V

    .line 10
    iget-object p2, v6, Ll/f0;->J:Ll/p;

    .line 11
    iget p2, p2, Ll/p;->G:I

    const/16 p3, 0x20

    and-int/2addr p2, p3

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p1, Lm/k;->r:Lm/j;

    if-nez p2, :cond_1

    .line 13
    iget-object p2, p1, Lm/k;->q:Ll/b0;

    .line 14
    check-cast p2, Landroid/view/View;

    .line 15
    :cond_1
    iput-object p2, v1, Ll/x;->f:Landroid/view/View;

    .line 16
    :goto_0
    iget-object p1, p1, Lm/k;->F:Ll/o;

    .line 17
    iput-object p1, v1, Ll/x;->i:Ll/y;

    .line 18
    iget-object p2, v1, Ll/x;->j:Ll/v;

    if-eqz p2, :cond_2

    .line 19
    invoke-interface {p2, p1}, Ll/z;->g(Ll/y;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Lm/k;Landroid/content/Context;Ll/m;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lm/g;->m:I

    .line 1
    iput-object p1, p0, Lm/g;->n:Lm/k;

    const v2, 0x7f040022

    const/4 v3, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move-object v4, p2

    move-object v6, p3

    move-object v5, p4

    .line 2
    invoke-direct/range {v1 .. v7}, Ll/x;-><init>(IILandroid/content/Context;Landroid/view/View;Ll/m;Z)V

    const p2, 0x800005

    .line 3
    iput p2, v1, Ll/x;->g:I

    .line 4
    iget-object p1, p1, Lm/k;->F:Ll/o;

    .line 5
    iput-object p1, v1, Ll/x;->i:Ll/y;

    .line 6
    iget-object p2, v1, Ll/x;->j:Ll/v;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, Ll/z;->g(Ll/y;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Lm/g;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/g;->n:Lm/k;

    .line 7
    .line 8
    iget-object v1, v0, Lm/k;->l:Ll/m;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Ll/m;->c(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lm/k;->B:Lm/g;

    .line 18
    .line 19
    invoke-super {p0}, Ll/x;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    const/4 v0, 0x0

    .line 24
    iget-object v1, p0, Lm/g;->n:Lm/k;

    .line 25
    .line 26
    iput-object v0, v1, Lm/k;->C:Lm/g;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-super {p0}, Ll/x;->c()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
