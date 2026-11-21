.class public final synthetic Lc5/c0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lc5/c0;->j:I

    .line 2
    .line 3
    iput-object p3, p0, Lc5/c0;->l:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Lc5/c0;->k:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lc5/c0;->j:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lc5/c0;->k:I

    .line 5
    .line 6
    iget-object v3, p0, Lc5/c0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 12
    .line 13
    iget-object v0, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/view/View;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v3, v0, v2, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :pswitch_0
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 32
    .line 33
    sget-object v0, Lcom/google/android/material/button/MaterialButton;->a0:[I

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Lcom/google/android/material/button/MaterialButton;->setIconSize(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    check-cast v3, Ld0/b;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Ld0/b;->g(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    check-cast v3, Landroid/widget/HorizontalScrollView;

    .line 46
    .line 47
    invoke-virtual {v3, v2, v1}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_3
    check-cast v3, Lc5/g0;

    .line 52
    .line 53
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    .line 58
    .line 59
    invoke-static {v1, v0}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->p0(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
