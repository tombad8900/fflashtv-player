.class public abstract Lv3/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lr3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr3/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lr3/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv3/d;->a:Lr3/c;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Lr3/k;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr3/k;->f:Ls3/d;

    .line 2
    .line 3
    iget-object v1, p0, Lr3/k;->c:Lt3/a;

    .line 4
    .line 5
    iget-object p0, p0, Lr3/k;->w:Ls3/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v0, v2, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-ne v0, v3, :cond_1

    .line 18
    .line 19
    instance-of v0, p0, Ls3/c;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v0, v1, Lt3/a;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    instance-of v0, p0, Ls3/f;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v0, v1, Lt3/a;->k:Landroid/widget/ImageView;

    .line 33
    .line 34
    check-cast p0, Ls3/f;

    .line 35
    .line 36
    iget-object p0, p0, Ls3/f;->a:Landroid/widget/ImageView;

    .line 37
    .line 38
    if-ne v0, p0, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance p0, La1/u;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    :goto_0
    return v2

    .line 48
    :cond_3
    const/4 p0, 0x0

    .line 49
    return p0
.end method
