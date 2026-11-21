.class public final Lg7/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/Iterator;
.implements La7/a;


# instance fields
.field public j:Ljava/lang/Object;

.field public k:I

.field public final synthetic l:Lg7/g;


# direct methods
.method public constructor <init>(Lg7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg7/f;->l:Lg7/g;

    .line 5
    .line 6
    const/4 p1, -0x2

    .line 7
    iput p1, p0, Lg7/f;->k:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Lg7/f;->k:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    sget-object v0, Lc7/e;->k:Lc7/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lc7/a;->d()Ljava/util/Random;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/high16 v1, 0x7fff0000

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/high16 v1, 0x10000

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lg7/f;->l:Lg7/g;

    .line 27
    .line 28
    iget-object v0, v0, Lg7/g;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lg7/l;

    .line 31
    .line 32
    iget-object v1, p0, Lg7/f;->j:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lg7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    iput-object v0, p0, Lg7/f;->j:Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    iput v0, p0, Lg7/f;->k:I

    .line 45
    .line 46
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lg7/f;->k:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lg7/f;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lg7/f;->k:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lg7/f;->k:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lg7/f;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lg7/f;->k:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lg7/f;->j:Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Lg7/f;->k:I

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
