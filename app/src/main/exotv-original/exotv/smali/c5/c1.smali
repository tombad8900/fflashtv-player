.class public final synthetic Lc5/c1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lc5/c1;->j:I

    iput-object p2, p0, Lc5/c1;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp7/b;Lp7/a;)V
    .locals 0

    .line 2
    const/4 p2, 0x3

    iput p2, p0, Lc5/c1;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/c1;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lc5/c1;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/c1;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp7/b;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {v0, p1}, Lp7/b;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Lc5/c1;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lm6/c;

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    const-string p1, "(this Collection)"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    return-object p1

    .line 33
    :pswitch_1
    iget-object v0, p0, Lc5/c1;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lj3/f;

    .line 36
    .line 37
    check-cast p1, Ljava/io/IOException;

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, v0, Lj3/f;->t:Z

    .line 41
    .line 42
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_2
    iget-object v0, p0, Lc5/c1;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La1/e;

    .line 48
    .line 49
    check-cast p1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iget-object v0, v0, La1/e;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcom/exotv/net/MainActivity;

    .line 58
    .line 59
    int-to-float p1, p1

    .line 60
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    float-to-int p1, p1

    .line 74
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
