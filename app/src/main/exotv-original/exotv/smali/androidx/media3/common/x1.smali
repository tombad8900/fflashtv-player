.class public final Landroidx/media3/common/x1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final b:Landroidx/media3/common/x1;


# instance fields
.field public final a:Lf6/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/common/x1;

    .line 2
    .line 3
    sget-object v1, Lf6/m0;->k:Lf6/k0;

    .line 4
    .line 5
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroidx/media3/common/x1;-><init>(Lf6/l1;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Landroidx/media3/common/x1;->b:Landroidx/media3/common/x1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lh1/i0;->M(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lf6/l1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_2

    .line 10
    .line 11
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Landroidx/media3/common/w1;

    .line 16
    .line 17
    iget-object v3, v2, Landroidx/media3/common/w1;->e:[Z

    .line 18
    .line 19
    array-length v4, v3

    .line 20
    move v5, v0

    .line 21
    :goto_1
    if-ge v5, v4, :cond_1

    .line 22
    .line 23
    aget-boolean v6, v3, v5

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    if-ne v6, v7, :cond_0

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 29
    .line 30
    iget v2, v2, Landroidx/media3/common/q1;->c:I

    .line 31
    .line 32
    if-ne v2, p1, :cond_1

    .line 33
    .line 34
    return v7

    .line 35
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Landroidx/media3/common/x1;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Landroidx/media3/common/x1;

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 19
    .line 20
    iget-object p1, p1, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lf6/m0;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf6/m0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
