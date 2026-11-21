.class public final Lu3/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lu3/e;


# instance fields
.field public final j:Lt3/a;

.field public final k:Lr3/l;


# direct methods
.method public constructor <init>(Lt3/a;Lr3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu3/c;->j:Lt3/a;

    .line 5
    .line 6
    iput-object p2, p0, Lu3/c;->k:Lr3/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu3/c;->k:Lr3/l;

    .line 2
    .line 3
    instance-of v1, v0, Lr3/r;

    .line 4
    .line 5
    iget-object v2, p0, Lu3/c;->j:Lt3/a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lr3/r;

    .line 10
    .line 11
    iget-object v0, v0, Lr3/r;->a:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lt3/a;->d(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v1, v0, Lr3/f;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, Lr3/f;

    .line 22
    .line 23
    iget-object v0, v0, Lr3/f;->a:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lt3/a;->d(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance v0, La1/u;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw v0
.end method
