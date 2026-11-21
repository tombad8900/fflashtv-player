.class public final Li5/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Landroid/view/View;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li5/a;->j:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li5/a;->l:Landroid/view/View;

    iput-object p2, p0, Li5/a;->m:Ljava/lang/Object;

    iput p3, p0, Li5/a;->k:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li5/a;->j:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li5/a;->m:Ljava/lang/Object;

    iput-object p2, p0, Li5/a;->l:Landroid/view/View;

    iput p3, p0, Li5/a;->k:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Li5/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li5/a;->l:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p0, Li5/a;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Typeface;

    .line 13
    .line 14
    iget v2, p0, Li5/a;->k:I

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lm/s0;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Li5/a;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 23
    .line 24
    iget v1, p0, Li5/a;->k:I

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    iget-object v3, p0, Li5/a;->l:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H(Landroid/view/View;IZ)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
