.class public final Lj2/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final synthetic a:I

.field public final b:Ln1/n;


# direct methods
.method public constructor <init>(BI)V
    .locals 2

    iput p2, p0, Lj2/a;->a:I

    packed-switch p2, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ln1/e0;

    const/4 p2, 0x2

    const-string v0, "image/png"

    const v1, 0x8950

    invoke-direct {p1, v0, v1, p2}, Ln1/e0;-><init>(Ljava/lang/String;II)V

    iput-object p1, p0, Lj2/a;->b:Ln1/n;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ln1/e0;

    const/4 p2, 0x2

    const-string v0, "image/bmp"

    const/16 v1, 0x424d

    invoke-direct {p1, v0, v1, p2}, Ln1/e0;-><init>(Ljava/lang/String;II)V

    iput-object p1, p0, Lj2/a;->b:Ln1/n;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(I)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Lj2/a;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 6
    new-instance p1, Ln1/e0;

    const/4 v0, 0x2

    const-string v1, "image/jpeg"

    const v2, 0xffd8

    invoke-direct {p1, v1, v2, v0}, Ln1/e0;-><init>(Ljava/lang/String;II)V

    iput-object p1, p0, Lj2/a;->b:Ln1/n;

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Lv1/a;

    invoke-direct {p1}, Lv1/a;-><init>()V

    iput-object p1, p0, Lj2/a;->b:Ln1/n;

    :goto_0
    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final init(Ln1/p;)V
    .locals 1

    .line 1
    iget v0, p0, Lj2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ln1/n;->init(Ln1/p;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 13
    .line 14
    check-cast v0, Ln1/e0;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ln1/e0;->init(Ln1/p;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 21
    .line 22
    check-cast v0, Ln1/e0;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ln1/e0;->init(Ln1/p;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 1

    .line 1
    iget v0, p0, Lj2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Ln1/n;->read(Ln1/o;Ln1/a0;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_0
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 14
    .line 15
    check-cast v0, Ln1/e0;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Ln1/e0;->read(Ln1/o;Ln1/a0;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :pswitch_1
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 23
    .line 24
    check-cast v0, Ln1/e0;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Ln1/e0;->read(Ln1/o;Ln1/a0;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 1

    .line 1
    iget v0, p0, Lj2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 7
    .line 8
    invoke-interface {v0}, Ln1/n;->release()V

    .line 9
    .line 10
    .line 11
    :pswitch_0
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final seek(JJ)V
    .locals 1

    .line 1
    iget v0, p0, Lj2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2, p3, p4}, Ln1/n;->seek(JJ)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 13
    .line 14
    check-cast v0, Ln1/e0;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, p3, p4}, Ln1/e0;->seek(JJ)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 21
    .line 22
    check-cast v0, Ln1/e0;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, Ln1/e0;->seek(JJ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final sniff(Ln1/o;)Z
    .locals 1

    .line 1
    iget v0, p0, Lj2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ln1/n;->sniff(Ln1/o;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_0
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 14
    .line 15
    check-cast v0, Ln1/e0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ln1/e0;->sniff(Ln1/o;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :pswitch_1
    iget-object v0, p0, Lj2/a;->b:Ln1/n;

    .line 23
    .line 24
    check-cast v0, Ln1/e0;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ln1/e0;->sniff(Ln1/o;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
