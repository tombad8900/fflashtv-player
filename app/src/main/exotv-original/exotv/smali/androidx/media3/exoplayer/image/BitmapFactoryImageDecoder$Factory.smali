.class public final Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/image/ImageDecoder$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final bitmapDecoder:Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$BitmapDecoder;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/media3/common/n;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Landroidx/media3/common/n;-><init>(I)V

    iput-object v0, p0, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$Factory;->bitmapDecoder:Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$BitmapDecoder;

    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$BitmapDecoder;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$Factory;->bitmapDecoder:Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$BitmapDecoder;

    return-void
.end method

.method public static synthetic a([BI)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$Factory;->lambda$new$0([BI)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$new$0([BI)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder;->access$100([BI)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public createImageDecoder()Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder;
    .locals 3

    .line 2
    new-instance v0, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder;

    iget-object v1, p0, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$Factory;->bitmapDecoder:Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$BitmapDecoder;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder;-><init>(Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$BitmapDecoder;Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$1;)V

    return-object v0
.end method

.method public bridge synthetic createImageDecoder()Landroidx/media3/exoplayer/image/ImageDecoder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$Factory;->createImageDecoder()Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder;

    move-result-object v0

    return-object v0
.end method

.method public supportsFormat(Landroidx/media3/common/w;)I
    .locals 6

    .line 1
    iget-object v0, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    invoke-static {v0}, Landroidx/media3/common/u0;->l(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    iget-object p1, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 15
    .line 16
    sget v0, Lh1/i0;->a:I

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x4

    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v5, -0x1

    .line 28
    sparse-switch v2, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    :goto_0
    move v1, v5

    .line 32
    goto :goto_1

    .line 33
    :sswitch_0
    const-string v1, "image/png"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v1, 0x6

    .line 43
    goto :goto_1

    .line 44
    :sswitch_1
    const-string v1, "image/bmp"

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v1, 0x5

    .line 54
    goto :goto_1

    .line 55
    :sswitch_2
    const-string v1, "image/webp"

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move v1, v3

    .line 65
    goto :goto_1

    .line 66
    :sswitch_3
    const-string v1, "image/jpeg"

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const/4 v1, 0x3

    .line 76
    goto :goto_1

    .line 77
    :sswitch_4
    const-string v1, "image/heif"

    .line 78
    .line 79
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_5

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    const/4 v1, 0x2

    .line 87
    goto :goto_1

    .line 88
    :sswitch_5
    const-string v1, "image/heic"

    .line 89
    .line 90
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_6

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_6
    move v1, v4

    .line 98
    goto :goto_1

    .line 99
    :sswitch_6
    const-string v2, "image/avif"

    .line 100
    .line 101
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_7

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :pswitch_0
    const/16 p1, 0x1a

    .line 113
    .line 114
    if-lt v0, p1, :cond_8

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :pswitch_1
    const/16 p1, 0x22

    .line 118
    .line 119
    if-lt v0, p1, :cond_8

    .line 120
    .line 121
    :goto_2
    :pswitch_2
    invoke-static {v3}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    return p1

    .line 126
    :cond_8
    :goto_3
    invoke-static {v4}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    return p1

    .line 131
    :cond_9
    :goto_4
    invoke-static {v1}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    return p1

    .line 136
    nop

    .line 137
    :sswitch_data_0
    .sparse-switch
        -0x58abd7ba -> :sswitch_6
        -0x58a8e8f5 -> :sswitch_5
        -0x58a8e8f2 -> :sswitch_4
        -0x58a7d764 -> :sswitch_3
        -0x58a21830 -> :sswitch_2
        -0x3468a12f -> :sswitch_1
        -0x34686c8b -> :sswitch_0
    .end sparse-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
