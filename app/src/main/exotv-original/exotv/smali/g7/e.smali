.class public final Lg7/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lg7/h;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ll6/a;


# direct methods
.method public synthetic constructor <init>(Lg7/h;Ly6/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lg7/e;->a:I

    iput-object p1, p0, Lg7/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg7/e;->c:Ll6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ly6/p;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg7/e;->a:I

    const-string v0, "input"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg7/e;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lg7/e;->c:Ll6/a;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lg7/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh7/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lh7/b;-><init>(Lg7/e;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lg7/n;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lg7/n;-><init>(Lg7/e;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, Lg7/d;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lg7/d;-><init>(Lg7/e;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
