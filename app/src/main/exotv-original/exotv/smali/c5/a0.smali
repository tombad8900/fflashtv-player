.class public final synthetic Lc5/a0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lx4/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lx4/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc5/a0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/a0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lc5/a0;->l:Lx4/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget p1, p0, Lc5/a0;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lc5/a0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lc5/a1;

    .line 9
    .line 10
    iget-object p1, p1, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 11
    .line 12
    iget-object v0, p0, Lc5/a0;->l:Lx4/l;

    .line 13
    .line 14
    iget-wide v1, v0, Lx4/l;->a:J

    .line 15
    .line 16
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v0, v0, Lx4/l;->b:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/16 v3, 0x78

    .line 24
    .line 25
    invoke-static {p1, v1, v0, v2, v3}, Lc5/j;->l(Lb/l;Ljava/lang/String;Ljava/lang/String;Lw4/a0;I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :pswitch_0
    iget-object p1, p0, Lc5/a0;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Ly6/l;

    .line 33
    .line 34
    iget-object v0, p0, Lc5/a0;->l:Lx4/l;

    .line 35
    .line 36
    invoke-interface {p1, v0}, Ly6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    iget-object p1, p0, Lc5/a0;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ly6/l;

    .line 43
    .line 44
    iget-object v0, p0, Lc5/a0;->l:Lx4/l;

    .line 45
    .line 46
    invoke-interface {p1, v0}, Ly6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
