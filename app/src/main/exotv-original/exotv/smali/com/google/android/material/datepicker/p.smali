.class public final Lcom/google/android/material/datepicker/p;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lm0/o;
.implements Lh2/c;


# instance fields
.field public final j:I

.field public final k:I

.field public l:I

.field public m:I

.field public final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IIIII[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/google/android/material/datepicker/p;->j:I

    .line 3
    iput p3, p0, Lcom/google/android/material/datepicker/p;->k:I

    .line 4
    iput p4, p0, Lcom/google/android/material/datepicker/p;->l:I

    .line 5
    iput p5, p0, Lcom/google/android/material/datepicker/p;->m:I

    .line 6
    iput-object p6, p0, Lcom/google/android/material/datepicker/p;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;IIII)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/material/datepicker/p;->j:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/p;->n:Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/material/datepicker/p;->k:I

    iput p4, p0, Lcom/google/android/material/datepicker/p;->l:I

    iput p5, p0, Lcom/google/android/material/datepicker/p;->m:I

    return-void
.end method

.method public constructor <init>(Li1/c;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iget-object p1, p1, Li1/c;->c:Lh1/w;

    iput-object p1, p0, Lcom/google/android/material/datepicker/p;->n:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 10
    invoke-virtual {p1, v0}, Lh1/w;->G(I)V

    .line 11
    invoke-virtual {p1}, Lh1/w;->y()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/google/android/material/datepicker/p;->k:I

    .line 12
    invoke-virtual {p1}, Lh1/w;->y()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/datepicker/p;->j:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/p;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/w;

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    iget v2, p0, Lcom/google/android/material/datepicker/p;->k:I

    .line 8
    .line 9
    if-ne v2, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    const/16 v1, 0x10

    .line 17
    .line 18
    if-ne v2, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lh1/w;->A()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0

    .line 25
    :cond_1
    iget v1, p0, Lcom/google/android/material/datepicker/p;->l:I

    .line 26
    .line 27
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    iput v2, p0, Lcom/google/android/material/datepicker/p;->l:I

    .line 30
    .line 31
    rem-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Lcom/google/android/material/datepicker/p;->m:I

    .line 40
    .line 41
    and-int/lit16 v0, v0, 0xf0

    .line 42
    .line 43
    shr-int/lit8 v0, v0, 0x4

    .line 44
    .line 45
    return v0

    .line 46
    :cond_2
    iget v0, p0, Lcom/google/android/material/datepicker/p;->m:I

    .line 47
    .line 48
    and-int/lit8 v0, v0, 0xf

    .line 49
    .line 50
    return v0
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/p;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/view/View;

    .line 4
    .line 5
    const/16 v0, 0x207

    .line 6
    .line 7
    iget-object v1, p2, Lm0/r1;->a:Lm0/o1;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lm0/o1;->f(I)Le0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/google/android/material/datepicker/p;->j:I

    .line 14
    .line 15
    if-ltz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v3, v0, Le0/b;->b:I

    .line 22
    .line 23
    add-int/2addr v1, v3

    .line 24
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget v1, p0, Lcom/google/android/material/datepicker/p;->k:I

    .line 34
    .line 35
    iget v2, v0, Le0/b;->a:I

    .line 36
    .line 37
    add-int/2addr v1, v2

    .line 38
    iget v2, p0, Lcom/google/android/material/datepicker/p;->l:I

    .line 39
    .line 40
    iget v3, v0, Le0/b;->b:I

    .line 41
    .line 42
    add-int/2addr v2, v3

    .line 43
    iget v3, p0, Lcom/google/android/material/datepicker/p;->m:I

    .line 44
    .line 45
    iget v0, v0, Le0/b;->c:I

    .line 46
    .line 47
    add-int/2addr v3, v0

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    return-object p2
.end method
