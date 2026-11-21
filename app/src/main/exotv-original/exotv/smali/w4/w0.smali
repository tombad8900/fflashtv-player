.class public final synthetic Lw4/w0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:Z

.field public final synthetic k:Lcom/exotv/net/SeriesDetailActivity;

.field public final synthetic l:Lw4/b1;


# direct methods
.method public synthetic constructor <init>(ZLcom/exotv/net/SeriesDetailActivity;Lw4/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lw4/w0;->j:Z

    .line 5
    .line 6
    iput-object p2, p0, Lw4/w0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 7
    .line 8
    iput-object p3, p0, Lw4/w0;->l:Lw4/b1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lw4/w0;->j:Z

    .line 2
    .line 3
    iget-object v0, p0, Lw4/w0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p1, v0, Lcom/exotv/net/SeriesDetailActivity;->N:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {p1}, Lm6/h;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/view/View;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, v0, Lcom/exotv/net/SeriesDetailActivity;->R:Z

    .line 23
    .line 24
    iget-object p1, p0, Lw4/w0;->l:Lw4/b1;

    .line 25
    .line 26
    iget p1, p1, Lw4/b1;->a:I

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/exotv/net/SeriesDetailActivity;->v(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
