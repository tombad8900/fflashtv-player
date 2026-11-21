.class public final synthetic Lw4/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(ILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    iput p3, p0, Lw4/f;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw4/f;->k:Landroidx/recyclerview/widget/RecyclerView;

    iput p1, p0, Lw4/f;->l:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lw4/f;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/f;->k:Landroidx/recyclerview/widget/RecyclerView;

    iput p2, p0, Lw4/f;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lw4/f;->j:I

    .line 2
    .line 3
    iget v1, p0, Lw4/f;->l:I

    .line 4
    .line 5
    iget-object v2, p0, Lw4/f;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Lcom/exotv/net/MainActivity;->C(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->requestFocus(I)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->H(I)Lz2/v0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lz2/v0;->a:Landroid/view/View;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
