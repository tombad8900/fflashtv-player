.class public final synthetic Lc5/d1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:La1/e;


# direct methods
.method public synthetic constructor <init>(ILa1/e;)V
    .locals 0

    .line 1
    iput p1, p0, Lc5/d1;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lc5/d1;->k:La1/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lc5/d1;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    sput-boolean p1, La1/e;->m:Z

    .line 8
    .line 9
    iget-object p1, p0, Lc5/d1;->k:La1/e;

    .line 10
    .line 11
    iget-object p1, p1, La1/e;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/widget/LinearLayout;

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const-string p1, "android.intent.action.VIEW"

    .line 22
    .line 23
    iget-object v0, p0, Lc5/d1;->k:La1/e;

    .line 24
    .line 25
    iget-object v0, v0, La1/e;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/exotv/net/MainActivity;

    .line 28
    .line 29
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 30
    .line 31
    const-string v2, "tg://resolve?domain=exoTVchannel"

    .line 32
    .line 33
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    :try_start_1
    new-instance v1, Landroid/content/Intent;

    .line 45
    .line 46
    const-string v2, "https://t.me/exoTVchannel"

    .line 47
    .line 48
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_1
    const p1, 0x7f11013d

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
