.class public final Lj4/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly3/j;


# instance fields
.field public final synthetic a:I

.field public final b:Lj4/c;


# direct methods
.method public synthetic constructor <init>(Lj4/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj4/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lj4/b;->b:Lj4/c;

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
    .locals 1

    .line 1
    iget p2, p0, Lj4/b;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    iget-object p2, p0, Lj4/b;->b:Lj4/c;

    .line 9
    .line 10
    iget-object v0, p2, Lj4/c;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object p2, p2, Lj4/c;->b:Lb4/f;

    .line 13
    .line 14
    invoke-static {v0, p1, p2}, Lt5/a;->j(Ljava/util/List;Ljava/io/InputStream;Lb4/f;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 19
    .line 20
    if-eq p1, p2, :cond_1

    .line 21
    .line 22
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v0, 0x1f

    .line 25
    .line 26
    if-lt p2, v0, :cond_0

    .line 27
    .line 28
    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_AVIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 29
    .line 30
    if-ne p1, p2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 36
    :goto_1
    return p1

    .line 37
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    iget-object p2, p0, Lj4/b;->b:Lj4/c;

    .line 40
    .line 41
    iget-object p2, p2, Lj4/c;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {p2, p1}, Lt5/a;->k(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 48
    .line 49
    if-eq p1, p2, :cond_3

    .line 50
    .line 51
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v0, 0x1f

    .line 54
    .line 55
    if-lt p2, v0, :cond_2

    .line 56
    .line 57
    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_AVIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 58
    .line 59
    if-ne p1, p2, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/4 p1, 0x0

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    :goto_2
    const/4 p1, 0x1

    .line 65
    :goto_3
    return p1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILy3/h;)La4/f0;
    .locals 1

    .line 1
    iget v0, p0, Lj4/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    invoke-static {p1}, Lu4/a;->b(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1, p2, p3, p4}, Lj4/c;->a(Landroid/graphics/ImageDecoder$Source;IILy3/h;)Lj4/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, p2, p3, p4}, Lj4/c;->a(Landroid/graphics/ImageDecoder$Source;IILy3/h;)Lj4/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
