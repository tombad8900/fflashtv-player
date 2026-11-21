.class public final Lj4/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Lb4/f;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lb4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj4/c;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Lj4/c;->b:Lb4/f;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/graphics/ImageDecoder$Source;IILy3/h;)Lj4/a;
    .locals 1

    .line 1
    new-instance v0, Lg4/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lg4/b;-><init>(IILy3/h;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroid/graphics/ImageDecoder;->decodeDrawable(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p1, p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Lj4/a;

    .line 15
    .line 16
    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lj4/a;-><init>(Landroid/graphics/drawable/AnimatedImageDrawable;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string p3, "Received unexpected drawable type for animated image, failing: "

    .line 27
    .line 28
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
