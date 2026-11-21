.class public final Lcom/google/android/material/datepicker/k;
.super Lz2/i0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/x;

.field public final synthetic b:Lcom/google/android/material/datepicker/m;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/m;Lcom/google/android/material/datepicker/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/k;->b:Lcom/google/android/material/datepicker/m;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/material/datepicker/k;->a:Lcom/google/android/material/datepicker/x;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    .line 1
    if-nez p2, :cond_2

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->b:Lcom/google/android/material/datepicker/m;

    .line 4
    .line 5
    iget-object p2, p1, Lcom/google/android/material/datepicker/m;->q0:Lz2/u;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p1, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Lz2/u;->d(Lz2/f0;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 v0, -0x1

    .line 29
    if-eq p2, v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->a:Lcom/google/android/material/datepicker/x;

    .line 32
    .line 33
    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/s;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p1, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 38
    .line 39
    iget-object v1, p1, Lcom/google/android/material/datepicker/m;->o0:Lcom/google/android/material/button/MaterialButton;

    .line 40
    .line 41
    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/s;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/s;->c()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lcom/google/android/material/datepicker/m;->N(I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/m;->M()V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->b:Lcom/google/android/material/datepicker/m;

    .line 2
    .line 3
    if-gez p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p1, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p2, p1, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    :goto_0
    iget-object p3, p1, Lcom/google/android/material/datepicker/m;->q0:Lz2/u;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->a:Lcom/google/android/material/datepicker/x;

    .line 33
    .line 34
    if-nez p3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/s;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    iput-object p3, p1, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 41
    .line 42
    :cond_1
    iget-object p3, p1, Lcom/google/android/material/datepicker/m;->o0:Lcom/google/android/material/button/MaterialButton;

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/s;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/s;->c()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lcom/google/android/material/datepicker/m;->N(I)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
