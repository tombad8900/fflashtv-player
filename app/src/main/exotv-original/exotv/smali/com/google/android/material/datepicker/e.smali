.class public final Lcom/google/android/material/datepicker/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/google/android/material/datepicker/x;

.field public final synthetic l:Lcom/google/android/material/datepicker/m;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/m;Lcom/google/android/material/datepicker/x;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/google/android/material/datepicker/e;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/datepicker/e;->l:Lcom/google/android/material/datepicker/m;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/google/android/material/datepicker/e;->k:Lcom/google/android/material/datepicker/x;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lcom/google/android/material/datepicker/e;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/datepicker/e;->l:Lcom/google/android/material/datepicker/m;

    .line 7
    .line 8
    iget-object v0, p1, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/google/android/material/datepicker/e;->k:Lcom/google/android/material/datepicker/x;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput v2, v1, Lcom/google/android/material/datepicker/x;->i:I

    .line 24
    .line 25
    sub-int/2addr v0, v2

    .line 26
    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/s;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/m;->J(Lcom/google/android/material/datepicker/s;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/e;->l:Lcom/google/android/material/datepicker/m;

    .line 35
    .line 36
    iget-object v0, p1, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v1, 0x2

    .line 49
    iget-object v2, p0, Lcom/google/android/material/datepicker/e;->k:Lcom/google/android/material/datepicker/x;

    .line 50
    .line 51
    iput v1, v2, Lcom/google/android/material/datepicker/x;->i:I

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/s;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/m;->J(Lcom/google/android/material/datepicker/s;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
