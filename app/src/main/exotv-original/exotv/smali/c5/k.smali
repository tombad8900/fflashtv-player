.class public final synthetic Lc5/k;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILcom/exotv/net/SeriesDetailActivity;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lc5/k;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc5/k;->k:I

    iput-object p2, p0, Lc5/k;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lz2/x;II)V
    .locals 0

    .line 2
    iput p3, p0, Lc5/k;->j:I

    iput-object p1, p0, Lc5/k;->l:Ljava/lang/Object;

    iput p2, p0, Lc5/k;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lc5/k;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lc5/k;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/exotv/net/SeriesDetailActivity;

    .line 9
    .line 10
    iget v0, p1, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 11
    .line 12
    iget v1, p0, Lc5/k;->k:I

    .line 13
    .line 14
    if-eq v1, v0, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p1, Lcom/exotv/net/SeriesDetailActivity;->T:Ljava/lang/Integer;

    .line 21
    .line 22
    iput v1, p1, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/exotv/net/SeriesDetailActivity;->C()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    iget-object p1, p0, Lc5/k;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lw2/h;

    .line 31
    .line 32
    iget-object v0, p1, Lw2/h;->g:Lw2/o;

    .line 33
    .line 34
    iget v1, p1, Lw2/h;->f:I

    .line 35
    .line 36
    iget v2, p0, Lc5/k;->k:I

    .line 37
    .line 38
    if-eq v2, v1, :cond_1

    .line 39
    .line 40
    iget-object p1, p1, Lw2/h;->e:[F

    .line 41
    .line 42
    aget p1, p1, v2

    .line 43
    .line 44
    invoke-static {v0, p1}, Lw2/o;->a(Lw2/o;F)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object p1, v0, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    iget-object p1, p0, Lc5/k;->l:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lc5/o;

    .line 56
    .line 57
    iget-object p1, p1, Lc5/o;->d:Lw4/e;

    .line 58
    .line 59
    iget v0, p0, Lc5/k;->k:I

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1, v0}, Lw4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
