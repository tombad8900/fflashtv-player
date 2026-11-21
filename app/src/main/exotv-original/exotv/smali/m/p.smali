.class public final synthetic Lm/p;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ll0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm/p;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm/p;->b:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lm/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/p;->b:Landroid/widget/TextView;

    .line 7
    .line 8
    check-cast v0, Lm/w0;

    .line 9
    .line 10
    check-cast p1, Landroid/graphics/Typeface;

    .line 11
    .line 12
    invoke-static {v0, p1}, Lm/w0;->d(Lm/w0;Landroid/graphics/Typeface;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lm/p;->b:Landroid/widget/TextView;

    .line 17
    .line 18
    check-cast v0, Lm/v;

    .line 19
    .line 20
    check-cast p1, Landroid/graphics/Typeface;

    .line 21
    .line 22
    invoke-static {v0, p1}, Lm/v;->a(Lm/v;Landroid/graphics/Typeface;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lm/p;->b:Landroid/widget/TextView;

    .line 27
    .line 28
    check-cast v0, Lm/q;

    .line 29
    .line 30
    check-cast p1, Landroid/graphics/Typeface;

    .line 31
    .line 32
    invoke-static {v0, p1}, Lm/q;->a(Lm/q;Landroid/graphics/Typeface;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
