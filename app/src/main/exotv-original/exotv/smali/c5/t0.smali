.class public final synthetic Lc5/t0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lc5/a1;


# direct methods
.method public synthetic constructor <init>(Lc5/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc5/t0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/t0;->k:Lc5/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    iget p1, p0, Lc5/t0;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p1, 0x15

    .line 7
    .line 8
    if-ne p2, p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lc5/t0;->k:Lc5/a1;

    .line 17
    .line 18
    iget-object p1, p1, Lc5/a1;->g:Landroid/widget/EditText;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p1, "input"

    .line 28
    .line 29
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    :goto_0
    return p1

    .line 36
    :pswitch_0
    const/16 p1, 0x14

    .line 37
    .line 38
    if-ne p2, p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Lc5/t0;->k:Lc5/a1;

    .line 47
    .line 48
    iget-object p2, p1, Lc5/a1;->k:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget-object p1, p1, Lc5/a1;->f:Lc5/w0;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/4 p1, 0x0

    .line 68
    :goto_1
    return p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
