.class public final synthetic Lc5/v;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lc5/y;

.field public final synthetic b:Lc5/x;


# direct methods
.method public synthetic constructor <init>(Lc5/y;Lc5/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/v;->a:Lc5/y;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/v;->b:Lc5/x;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 6

    .line 1
    iget-object p1, p0, Lc5/v;->b:Lc5/x;

    .line 2
    .line 3
    iget-object v0, p1, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    iget-object v1, p0, Lc5/v;->a:Lc5/y;

    .line 6
    .line 7
    iget-boolean v2, v1, Lc5/y;->g:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iput-object v0, v1, Lc5/y;->l:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    :cond_1
    if-nez p2, :cond_4

    .line 17
    .line 18
    iget-object p2, v1, Lc5/y;->f:Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    move v4, v2

    .line 35
    :cond_3
    if-ge v4, v3, :cond_5

    .line 36
    .line 37
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    check-cast v5, Lc5/x;

    .line 44
    .line 45
    iget-object v5, v5, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-virtual {v5}, Landroid/view/View;->hasFocus()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    :cond_4
    const/4 v2, 0x1

    .line 54
    :cond_5
    :goto_0
    iput-boolean v2, v1, Lc5/y;->i:Z

    .line 55
    .line 56
    invoke-virtual {v1}, Lc5/y;->f()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-virtual {v1, p1, p2}, Lc5/y;->c(Lc5/x;Z)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
