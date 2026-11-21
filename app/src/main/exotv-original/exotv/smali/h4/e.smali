.class public final Lh4/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly3/j;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lh4/e;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lh4/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ly3/h;)Z
    .locals 2

    .line 1
    iget p2, p0, Lh4/e;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx3/d;

    .line 7
    .line 8
    :goto_0
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :pswitch_0
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 11
    .line 12
    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, "HUAWEI"

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, "HONOR"

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    const-wide/32 v0, 0x20000000

    .line 35
    .line 36
    .line 37
    cmp-long p1, p1, v0

    .line 38
    .line 39
    if-gtz p1, :cond_2

    .line 40
    .line 41
    :cond_1
    const-string p1, "robolectric"

    .line 42
    .line 43
    sget-object p2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    const/4 p1, 0x0

    .line 54
    :goto_1
    return p1

    .line 55
    :pswitch_1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    iget-object p1, p0, Lh4/e;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lh4/o;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILy3/h;)La4/f0;
    .locals 7

    .line 1
    iget v0, p0, Lh4/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx3/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Lx3/d;->b()Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Lh4/e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lb4/a;

    .line 15
    .line 16
    invoke-static {p1, p2}, Lh4/c;->e(Landroid/graphics/Bitmap;Lb4/a;)Lh4/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 22
    .line 23
    iget-object v0, p0, Lh4/e;->b:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Lh4/o;

    .line 27
    .line 28
    new-instance v2, La4/c;

    .line 29
    .line 30
    iget-object v0, v1, Lh4/o;->d:Ljava/util/ArrayList;

    .line 31
    .line 32
    iget-object v3, v1, Lh4/o;->c:Lb4/f;

    .line 33
    .line 34
    invoke-direct {v2, p1, v0, v3}, La4/c;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lb4/f;)V

    .line 35
    .line 36
    .line 37
    sget-object v6, Lh4/o;->j:Ly5/f;

    .line 38
    .line 39
    move v3, p2

    .line 40
    move v4, p3

    .line 41
    move-object v5, p4

    .line 42
    invoke-virtual/range {v1 .. v6}, Lh4/o;->a(La4/c;IILy3/h;Lh4/n;)Lh4/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_1
    move v2, p2

    .line 48
    move v3, p3

    .line 49
    move-object v4, p4

    .line 50
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    iget-object p2, p0, Lh4/e;->b:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v0, p2

    .line 55
    check-cast v0, Lh4/o;

    .line 56
    .line 57
    new-instance v1, La4/c;

    .line 58
    .line 59
    iget-object p2, v0, Lh4/o;->d:Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object p3, v0, Lh4/o;->c:Lb4/f;

    .line 62
    .line 63
    const/16 p4, 0xb

    .line 64
    .line 65
    invoke-direct {v1, p1, p2, p3, p4}, La4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    sget-object v5, Lh4/o;->j:Ly5/f;

    .line 69
    .line 70
    invoke-virtual/range {v0 .. v5}, Lh4/o;->a(La4/c;IILy3/h;Lh4/n;)Lh4/c;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
