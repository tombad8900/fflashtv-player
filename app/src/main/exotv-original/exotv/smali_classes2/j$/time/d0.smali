.class public final Lj$/time/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/m;
.implements Lj$/time/chrono/i;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x56e37a54888537c2L


# instance fields
.field public final a:Lj$/time/j;

.field public final b:Lj$/time/a0;

.field public final c:Lj$/time/z;


# direct methods
.method public constructor <init>(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)V
    .locals 0

    .line 609
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 610
    iput-object p1, p0, Lj$/time/d0;->a:Lj$/time/j;

    .line 611
    iput-object p3, p0, Lj$/time/d0;->b:Lj$/time/a0;

    .line 612
    iput-object p2, p0, Lj$/time/d0;->c:Lj$/time/z;

    return-void
.end method

.method public static A(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)Lj$/time/d0;
    .locals 5

    .line 367
    const-string v0, "localDateTime"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 368
    const-string v0, "zone"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 369
    instance-of v0, p1, Lj$/time/a0;

    if-eqz v0, :cond_0

    .line 370
    new-instance p2, Lj$/time/d0;

    move-object v0, p1

    check-cast v0, Lj$/time/a0;

    invoke-direct {p2, p0, p1, v0}, Lj$/time/d0;-><init>(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)V

    return-object p2

    .line 372
    :cond_0
    invoke-virtual {p1}, Lj$/time/z;->w()Lj$/time/zone/f;

    move-result-object v0

    .line 373
    invoke-virtual {v0, p0}, Lj$/time/zone/f;->f(Lj$/time/j;)Ljava/util/List;

    move-result-object v1

    .line 375
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_1

    .line 376
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj$/time/a0;

    goto :goto_1

    .line 377
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_3

    .line 684
    invoke-virtual {v0, p0}, Lj$/time/zone/f;->e(Lj$/time/j;)Ljava/lang/Object;

    move-result-object p2

    .line 685
    instance-of v0, p2, Lj$/time/zone/b;

    if-eqz v0, :cond_2

    check-cast p2, Lj$/time/zone/b;

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 316
    :goto_0
    iget-object v0, p2, Lj$/time/zone/b;->d:Lj$/time/a0;

    .line 474
    iget v0, v0, Lj$/time/a0;->b:I

    .line 305
    iget-object v1, p2, Lj$/time/zone/b;->c:Lj$/time/a0;

    .line 474
    iget v1, v1, Lj$/time/a0;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    .line 224
    invoke-static {v0, v1, v4}, Lj$/time/Duration;->A(JI)Lj$/time/Duration;

    move-result-object v0

    .line 625
    iget-wide v0, v0, Lj$/time/Duration;->a:J

    .line 379
    invoke-virtual {p0, v0, v1}, Lj$/time/j;->X(J)Lj$/time/j;

    move-result-object p0

    .line 316
    iget-object p2, p2, Lj$/time/zone/b;->d:Lj$/time/a0;

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_4

    .line 382
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 385
    :cond_4
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj$/time/a0;

    const-string v0, "offset"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 388
    :goto_1
    new-instance v0, Lj$/time/d0;

    invoke-direct {v0, p0, p1, p2}, Lj$/time/d0;-><init>(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)V

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 2249
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static w(JILj$/time/z;)Lj$/time/d0;
    .locals 3

    .line 453
    invoke-virtual {p3}, Lj$/time/z;->w()Lj$/time/zone/f;

    move-result-object v0

    int-to-long v1, p2

    .line 454
    invoke-static {p0, p1, v1, v2}, Lj$/time/Instant;->A(JJ)Lj$/time/Instant;

    move-result-object v1

    .line 455
    invoke-virtual {v0, v1}, Lj$/time/zone/f;->d(Lj$/time/Instant;)Lj$/time/a0;

    move-result-object v0

    .line 456
    invoke-static {p0, p1, p2, v0}, Lj$/time/j;->P(JILj$/time/a0;)Lj$/time/j;

    move-result-object p0

    .line 457
    new-instance p1, Lj$/time/d0;

    invoke-direct {p1, p0, p3, v0}, Lj$/time/d0;-><init>(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)V

    return-object p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 2239
    new-instance v0, Lj$/time/u;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Lj$/time/u;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final D(Lj$/time/z;)Lj$/time/chrono/i;
    .locals 2

    .line 968
    const-string v0, "zone"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 969
    iget-object v0, p0, Lj$/time/d0;->c:Lj$/time/z;

    invoke-virtual {v0, p1}, Lj$/time/z;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    iget-object v1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    invoke-static {v0, p1, v1}, Lj$/time/d0;->A(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)Lj$/time/d0;

    move-result-object p1

    return-object p1
.end method

.method public final F(JLj$/time/temporal/t;)Lj$/time/d0;
    .locals 2

    .line 1601
    instance-of v0, p3, Lj$/time/temporal/b;

    if-eqz v0, :cond_2

    .line 1602
    move-object v0, p3

    check-cast v0, Lj$/time/temporal/b;

    .line 241
    sget-object v1, Lj$/time/temporal/b;->DAYS:Lj$/time/temporal/b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_0

    sget-object v1, Lj$/time/temporal/b;->FOREVER:Lj$/time/temporal/b;

    if-eq v0, v1, :cond_0

    .line 1603
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0, p1, p2, p3}, Lj$/time/j;->V(JLj$/time/temporal/t;)Lj$/time/j;

    move-result-object p1

    .line 622
    iget-object p2, p0, Lj$/time/d0;->c:Lj$/time/z;

    iget-object p3, p0, Lj$/time/d0;->b:Lj$/time/a0;

    invoke-static {p1, p2, p3}, Lj$/time/d0;->A(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)Lj$/time/d0;

    move-result-object p1

    return-object p1

    .line 1605
    :cond_0
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0, p1, p2, p3}, Lj$/time/j;->V(JLj$/time/temporal/t;)Lj$/time/j;

    move-result-object p1

    .line 632
    iget-object p2, p0, Lj$/time/d0;->b:Lj$/time/a0;

    iget-object p3, p0, Lj$/time/d0;->c:Lj$/time/z;

    .line 433
    const-string v0, "localDateTime"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 434
    const-string v0, "offset"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 435
    const-string v0, "zone"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 436
    invoke-virtual {p3}, Lj$/time/z;->w()Lj$/time/zone/f;

    move-result-object v0

    .line 952
    invoke-virtual {v0, p1}, Lj$/time/zone/f;->f(Lj$/time/j;)Ljava/util/List;

    move-result-object v0

    .line 952
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 437
    new-instance v0, Lj$/time/d0;

    invoke-direct {v0, p1, p3, p2}, Lj$/time/d0;-><init>(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)V

    return-object v0

    .line 439
    :cond_1
    invoke-interface {p1, p2}, Lj$/time/chrono/d;->v(Lj$/time/a0;)J

    move-result-wide v0

    .line 868
    iget-object p1, p1, Lj$/time/j;->b:Lj$/time/l;

    .line 738
    iget p1, p1, Lj$/time/l;->d:I

    .line 439
    invoke-static {v0, v1, p1, p3}, Lj$/time/d0;->w(JILj$/time/z;)Lj$/time/d0;

    move-result-object p1

    return-object p1

    .line 1608
    :cond_2
    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/t;->w(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    check-cast p1, Lj$/time/d0;

    return-object p1
.end method

.method public final I(Lj$/time/LocalDate;)Lj$/time/d0;
    .locals 2

    .line 1232
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    .line 832
    iget-object v0, v0, Lj$/time/j;->b:Lj$/time/l;

    .line 1232
    invoke-static {p1, v0}, Lj$/time/j;->I(Lj$/time/LocalDate;Lj$/time/l;)Lj$/time/j;

    move-result-object p1

    .line 622
    iget-object v0, p0, Lj$/time/d0;->c:Lj$/time/z;

    iget-object v1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    invoke-static {p1, v0, v1}, Lj$/time/d0;->A(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)Lj$/time/d0;

    move-result-object p1

    return-object p1
.end method

.method public final J()Lj$/time/z;
    .locals 1

    .line 946
    iget-object v0, p0, Lj$/time/d0;->c:Lj$/time/z;

    return-object v0
.end method

.method public final a(JLj$/time/temporal/t;)Lj$/time/chrono/i;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1854
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/d0;->F(JLj$/time/temporal/t;)Lj$/time/d0;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lj$/time/d0;->F(JLj$/time/temporal/t;)Lj$/time/d0;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lj$/time/d0;->F(JLj$/time/temporal/t;)Lj$/time/d0;

    move-result-object p1

    return-object p1
.end method

.method public final a(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1854
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/d0;->F(JLj$/time/temporal/t;)Lj$/time/d0;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lj$/time/d0;->F(JLj$/time/temporal/t;)Lj$/time/d0;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lj$/time/d0;->F(JLj$/time/temporal/t;)Lj$/time/d0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj$/time/g;)Ljava/lang/Object;
    .locals 1

    .line 2056
    sget-object v0, Lj$/time/temporal/s;->f:Lj$/time/g;

    if-ne p1, v0, :cond_0

    .line 1042
    iget-object p1, p0, Lj$/time/d0;->a:Lj$/time/j;

    .line 736
    iget-object p1, p1, Lj$/time/j;->a:Lj$/time/LocalDate;

    return-object p1

    .line 2059
    :cond_0
    invoke-super {p0, p1}, Lj$/time/chrono/i;->b(Lj$/time/g;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(JLj$/time/temporal/r;)Lj$/time/temporal/m;
    .locals 3

    .line 1303
    instance-of v0, p3, Lj$/time/temporal/a;

    if-eqz v0, :cond_3

    .line 1304
    move-object v0, p3

    check-cast v0, Lj$/time/temporal/a;

    .line 1305
    sget-object v1, Lj$/time/c0;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    .line 1312
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0, p1, p2, p3}, Lj$/time/j;->Z(JLj$/time/temporal/r;)Lj$/time/j;

    move-result-object p1

    .line 622
    iget-object p2, p0, Lj$/time/d0;->c:Lj$/time/z;

    iget-object p3, p0, Lj$/time/d0;->b:Lj$/time/a0;

    invoke-static {p1, p2, p3}, Lj$/time/d0;->A(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)Lj$/time/d0;

    move-result-object p1

    return-object p1

    .line 669
    :cond_0
    iget-object p3, v0, Lj$/time/temporal/a;->b:Lj$/time/temporal/v;

    .line 732
    invoke-virtual {p3, p1, p2, v0}, Lj$/time/temporal/v;->a(JLj$/time/temporal/r;)I

    move-result p1

    .line 1309
    invoke-static {p1}, Lj$/time/a0;->Y(I)Lj$/time/a0;

    move-result-object p1

    .line 644
    iget-object p2, p0, Lj$/time/d0;->b:Lj$/time/a0;

    invoke-virtual {p1, p2}, Lj$/time/a0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lj$/time/d0;->c:Lj$/time/z;

    invoke-virtual {p2}, Lj$/time/z;->w()Lj$/time/zone/f;

    move-result-object p2

    iget-object p3, p0, Lj$/time/d0;->a:Lj$/time/j;

    .line 952
    invoke-virtual {p2, p3}, Lj$/time/zone/f;->f(Lj$/time/j;)Ljava/util/List;

    move-result-object p2

    .line 952
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 645
    new-instance p2, Lj$/time/d0;

    iget-object p3, p0, Lj$/time/d0;->a:Lj$/time/j;

    iget-object v0, p0, Lj$/time/d0;->c:Lj$/time/z;

    invoke-direct {p2, p3, v0, p1}, Lj$/time/d0;-><init>(Lj$/time/j;Lj$/time/z;Lj$/time/a0;)V

    goto :goto_0

    :cond_1
    move-object p2, p0

    :goto_0
    return-object p2

    .line 1174
    :cond_2
    iget-object p3, p0, Lj$/time/d0;->a:Lj$/time/j;

    .line 868
    iget-object p3, p3, Lj$/time/j;->b:Lj$/time/l;

    .line 738
    iget p3, p3, Lj$/time/l;->d:I

    .line 1307
    iget-object v0, p0, Lj$/time/d0;->c:Lj$/time/z;

    invoke-static {p1, p2, p3, v0}, Lj$/time/d0;->w(JILj$/time/z;)Lj$/time/d0;

    move-result-object p1

    return-object p1

    .line 1314
    :cond_3
    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/r;->V(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    check-cast p1, Lj$/time/d0;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 2185
    :cond_0
    instance-of v1, p1, Lj$/time/d0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 2186
    check-cast p1, Lj$/time/d0;

    .line 2187
    iget-object v1, p0, Lj$/time/d0;->a:Lj$/time/j;

    iget-object v3, p1, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v1, v3}, Lj$/time/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    iget-object v3, p1, Lj$/time/d0;->b:Lj$/time/a0;

    .line 2188
    invoke-virtual {v1, v3}, Lj$/time/a0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/d0;->c:Lj$/time/z;

    iget-object p1, p1, Lj$/time/d0;->c:Lj$/time/z;

    .line 2189
    invoke-virtual {v1, p1}, Lj$/time/z;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lj$/time/temporal/r;)I
    .locals 2

    .line 814
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 815
    sget-object v0, Lj$/time/c0;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 821
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0, p1}, Lj$/time/j;->f(Lj$/time/temporal/r;)I

    move-result p1

    return p1

    .line 871
    :cond_0
    iget-object p1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    .line 474
    iget p1, p1, Lj$/time/a0;->b:I

    return p1

    .line 817
    :cond_1
    new-instance p1, Lj$/time/temporal/u;

    const-string v0, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    .line 88
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 817
    throw p1

    .line 823
    :cond_2
    invoke-super {p0, p1}, Lj$/time/chrono/i;->f(Lj$/time/temporal/r;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic g(Lj$/time/LocalDate;)Lj$/time/temporal/m;
    .locals 0

    .line 164
    invoke-virtual {p0, p1}, Lj$/time/d0;->I(Lj$/time/LocalDate;)Lj$/time/d0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic h(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 0

    .line 164
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/d0;->F(JLj$/time/temporal/t;)Lj$/time/d0;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    .line 2201
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0}, Lj$/time/j;->hashCode()I

    move-result v0

    iget-object v1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    .line 736
    iget v1, v1, Lj$/time/a0;->b:I

    xor-int/2addr v0, v1

    .line 2201
    iget-object v1, p0, Lj$/time/d0;->c:Lj$/time/z;

    invoke-virtual {v1}, Lj$/time/z;->hashCode()I

    move-result v1

    const/4 v2, 0x3

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(Lj$/time/temporal/r;)Z
    .locals 1

    .line 705
    instance-of v0, p1, Lj$/time/temporal/a;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Lj$/time/temporal/r;->w(Lj$/time/temporal/n;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final j(Lj$/time/temporal/r;)J
    .locals 2

    .line 851
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 852
    sget-object v0, Lj$/time/c0;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 856
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0, p1}, Lj$/time/j;->j(Lj$/time/temporal/r;)J

    move-result-wide v0

    return-wide v0

    .line 871
    :cond_0
    iget-object p1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    .line 474
    iget p1, p1, Lj$/time/a0;->b:I

    int-to-long v0, p1

    return-wide v0

    .line 853
    :cond_1
    invoke-interface {p0}, Lj$/time/chrono/i;->W()J

    move-result-wide v0

    return-wide v0

    .line 858
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->P(Lj$/time/temporal/n;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Lj$/time/l;
    .locals 1

    .line 1138
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    .line 832
    iget-object v0, v0, Lj$/time/j;->b:Lj$/time/l;

    return-object v0
.end method

.method public final l(Lj$/time/temporal/r;)Lj$/time/temporal/v;
    .locals 1

    .line 775
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 776
    sget-object v0, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 779
    :cond_0
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0, p1}, Lj$/time/j;->l(Lj$/time/temporal/r;)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1

    .line 777
    :cond_1
    :goto_0
    check-cast p1, Lj$/time/temporal/a;

    .line 669
    iget-object p1, p1, Lj$/time/temporal/a;->b:Lj$/time/temporal/v;

    return-object p1

    .line 781
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->A(Lj$/time/temporal/n;)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic m(Lj$/time/temporal/o;)Lj$/time/chrono/i;
    .locals 0

    .line 164
    check-cast p1, Lj$/time/LocalDate;

    invoke-virtual {p0, p1}, Lj$/time/d0;->I(Lj$/time/LocalDate;)Lj$/time/d0;

    move-result-object p1

    return-object p1
.end method

.method public final n()Lj$/time/chrono/ChronoLocalDate;
    .locals 1

    .line 1042
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    .line 736
    iget-object v0, v0, Lj$/time/j;->a:Lj$/time/LocalDate;

    return-object v0
.end method

.method public final o()Lj$/time/a0;
    .locals 1

    .line 871
    iget-object v0, p0, Lj$/time/d0;->b:Lj$/time/a0;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 2217
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    invoke-virtual {v0}, Lj$/time/j;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    .line 747
    iget-object v1, v1, Lj$/time/a0;->c:Ljava/lang/String;

    .line 2217
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2218
    iget-object v1, p0, Lj$/time/d0;->b:Lj$/time/a0;

    iget-object v2, p0, Lj$/time/d0;->c:Lj$/time/z;

    if-eq v1, v2, :cond_0

    .line 2219
    invoke-virtual {v2}, Lj$/time/z;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final x()Lj$/time/chrono/d;
    .locals 1

    .line 1028
    iget-object v0, p0, Lj$/time/d0;->a:Lj$/time/j;

    return-object v0
.end method
