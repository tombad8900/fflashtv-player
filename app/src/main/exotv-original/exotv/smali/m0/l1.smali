.class public Lm0/l1;
.super Lm0/k1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public o:Le0/b;

.field public p:Le0/b;

.field public q:Le0/b;


# direct methods
.method public constructor <init>(Lm0/r1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lm0/k1;-><init>(Lm0/r1;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lm0/l1;->o:Le0/b;

    .line 6
    .line 7
    iput-object p1, p0, Lm0/l1;->p:Le0/b;

    .line 8
    .line 9
    iput-object p1, p0, Lm0/l1;->q:Le0/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public h()Le0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/l1;->p:Le0/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/i1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Le0/b;->d(Landroid/graphics/Insets;)Le0/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lm0/l1;->p:Le0/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lm0/l1;->p:Le0/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public j()Le0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/l1;->o:Le0/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/i1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Le0/b;->d(Landroid/graphics/Insets;)Le0/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lm0/l1;->o:Le0/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lm0/l1;->o:Le0/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public l()Le0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/l1;->q:Le0/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/i1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Le0/b;->d(Landroid/graphics/Insets;)Le0/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lm0/l1;->q:Le0/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lm0/l1;->q:Le0/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public m(IIII)Lm0/r1;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/i1;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, Lm0/r1;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lm0/r1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public r(Le0/b;)V
    .locals 0

    .line 1
    return-void
.end method
