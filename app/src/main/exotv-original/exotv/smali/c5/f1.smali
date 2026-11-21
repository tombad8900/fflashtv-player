.class public final synthetic Lc5/f1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroid/view/KeyEvent$Callback;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc5/f1;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/f1;->k:Landroid/view/KeyEvent$Callback;

    .line 4
    .line 5
    iput-object p2, p0, Lc5/f1;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lc5/f1;->m:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lc5/f1;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lc5/f1;->k:Landroid/view/KeyEvent$Callback;

    .line 7
    .line 8
    check-cast p1, Lcom/exotv/net/SeriesDetailActivity;

    .line 9
    .line 10
    iget-object v0, p0, Lc5/f1;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, Lc5/f1;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ly6/a;

    .line 17
    .line 18
    iput-object v0, p1, Lcom/exotv/net/SeriesDetailActivity;->S:Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {v1}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object p1, p0, Lc5/f1;->k:Landroid/view/KeyEvent$Callback;

    .line 25
    .line 26
    check-cast p1, Landroid/widget/TextView;

    .line 27
    .line 28
    iget-object v0, p0, Lc5/f1;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p0, Lc5/f1;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/TextView;->getMaxLines()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const v3, 0x7fffffff

    .line 41
    .line 42
    .line 43
    if-ne v2, v3, :cond_0

    .line 44
    .line 45
    const/4 v2, 0x3

    .line 46
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 52
    .line 53
    .line 54
    const p1, 0x7f11011e

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 66
    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 70
    .line 71
    .line 72
    const p1, 0x7f11011d

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
