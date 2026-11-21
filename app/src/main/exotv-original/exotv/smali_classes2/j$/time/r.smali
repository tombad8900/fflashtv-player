.class public final Lj$/time/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/m;
.implements Lj$/time/temporal/o;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic c:I = 0x0

.field private static final serialVersionUID:J = 0x1fbfbc5d57d80062L


# instance fields
.field public final a:Lj$/time/j;

.field public final b:Lj$/time/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 138
    sget-object v0, Lj$/time/j;->c:Lj$/time/j;

    sget-object v1, Lj$/time/a0;->h:Lj$/time/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    new-instance v2, Lj$/time/r;

    invoke-direct {v2, v0, v1}, Lj$/time/r;-><init>(Lj$/time/j;Lj$/time/a0;)V

    .line 146
    sget-object v0, Lj$/time/j;->d:Lj$/time/j;

    sget-object v1, Lj$/time/a0;->g:Lj$/time/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    new-instance v2, Lj$/time/r;

    invoke-direct {v2, v0, v1}, Lj$/time/r;-><init>(Lj$/time/j;Lj$/time/a0;)V

    return-void
.end method

.method public constructor <init>(Lj$/time/j;Lj$/time/a0;)V
    .locals 1

    .line 412
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 413
    const-string v0, "dateTime"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lj$/time/j;

    iput-object p1, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 414
    const-string p1, "offset"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object p1, p2

    check-cast p1, Lj$/time/a0;

    iput-object p2, p0, Lj$/time/r;->b:Lj$/time/a0;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1939
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1929
    new-instance v0, Lj$/time/u;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0}, Lj$/time/u;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final A(Lj$/time/j;Lj$/time/a0;)Lj$/time/r;
    .locals 1

    .line 424
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lj$/time/r;->b:Lj$/time/a0;

    invoke-virtual {v0, p2}, Lj$/time/a0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 427
    :cond_0
    new-instance v0, Lj$/time/r;

    invoke-direct {v0, p1, p2}, Lj$/time/r;-><init>(Lj$/time/j;Lj$/time/a0;)V

    return-object v0
.end method

.method public final a(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1381
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/r;->w(JLj$/time/temporal/t;)Lj$/time/r;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lj$/time/r;->w(JLj$/time/temporal/t;)Lj$/time/r;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lj$/time/r;->w(JLj$/time/temporal/t;)Lj$/time/r;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj$/time/g;)Ljava/lang/Object;
    .locals 1

    .line 1545
    sget-object v0, Lj$/time/temporal/s;->d:Lj$/time/g;

    if-eq p1, v0, :cond_6

    sget-object v0, Lj$/time/temporal/s;->e:Lj$/time/g;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1547
    :cond_0
    sget-object v0, Lj$/time/temporal/s;->a:Lj$/time/g;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 1549
    :cond_1
    sget-object v0, Lj$/time/temporal/s;->f:Lj$/time/g;

    if-ne p1, v0, :cond_2

    .line 728
    iget-object p1, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 736
    iget-object p1, p1, Lj$/time/j;->a:Lj$/time/LocalDate;

    return-object p1

    .line 1551
    :cond_2
    sget-object v0, Lj$/time/temporal/s;->g:Lj$/time/g;

    if-ne p1, v0, :cond_3

    .line 823
    iget-object p1, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 832
    iget-object p1, p1, Lj$/time/j;->b:Lj$/time/l;

    return-object p1

    .line 1553
    :cond_3
    sget-object v0, Lj$/time/temporal/s;->b:Lj$/time/g;

    if-ne p1, v0, :cond_4

    .line 1554
    sget-object p1, Lj$/time/chrono/s;->c:Lj$/time/chrono/s;

    return-object p1

    .line 1555
    :cond_4
    sget-object v0, Lj$/time/temporal/s;->c:Lj$/time/g;

    if-ne p1, v0, :cond_5

    .line 1556
    sget-object p1, Lj$/time/temporal/b;->NANOS:Lj$/time/temporal/b;

    return-object p1

    .line 1560
    :cond_5
    invoke-virtual {p1, p0}, Lj$/time/g;->l(Lj$/time/temporal/n;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 653
    :cond_6
    :goto_0
    iget-object p1, p0, Lj$/time/r;->b:Lj$/time/a0;

    return-object p1
.end method

.method public final c(Lj$/time/temporal/m;)Lj$/time/temporal/m;
    .locals 3

    .line 1595
    sget-object v0, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    .line 728
    iget-object v1, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 736
    iget-object v1, v1, Lj$/time/j;->a:Lj$/time/LocalDate;

    .line 1596
    invoke-virtual {v1}, Lj$/time/LocalDate;->K()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lj$/time/temporal/m;->d(JLj$/time/temporal/r;)Lj$/time/temporal/m;

    move-result-object p1

    sget-object v0, Lj$/time/temporal/a;->NANO_OF_DAY:Lj$/time/temporal/a;

    .line 823
    iget-object v1, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 832
    iget-object v1, v1, Lj$/time/j;->b:Lj$/time/l;

    .line 1597
    invoke-virtual {v1}, Lj$/time/l;->d0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lj$/time/temporal/m;->d(JLj$/time/temporal/r;)Lj$/time/temporal/m;

    move-result-object p1

    sget-object v0, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    .line 653
    iget-object v1, p0, Lj$/time/r;->b:Lj$/time/a0;

    .line 474
    iget v1, v1, Lj$/time/a0;->b:I

    int-to-long v1, v1

    .line 1598
    invoke-interface {p1, v1, v2, v0}, Lj$/time/temporal/m;->d(JLj$/time/temporal/r;)Lj$/time/temporal/m;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 128
    check-cast p1, Lj$/time/r;

    .line 653
    iget-object v0, p0, Lj$/time/r;->b:Lj$/time/a0;

    iget-object v1, p1, Lj$/time/r;->b:Lj$/time/a0;

    .line 174
    invoke-virtual {v0, v1}, Lj$/time/a0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 715
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    iget-object v1, p1, Lj$/time/r;->a:Lj$/time/j;

    .line 175
    invoke-virtual {v0, v1}, Lj$/time/j;->O(Lj$/time/chrono/d;)I

    move-result v0

    goto :goto_0

    .line 1774
    :cond_0
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    iget-object v1, p0, Lj$/time/r;->b:Lj$/time/a0;

    invoke-interface {v0, v1}, Lj$/time/chrono/d;->v(Lj$/time/a0;)J

    move-result-wide v0

    iget-object v2, p1, Lj$/time/r;->a:Lj$/time/j;

    iget-object v3, p1, Lj$/time/r;->b:Lj$/time/a0;

    invoke-interface {v2, v3}, Lj$/time/chrono/d;->v(Lj$/time/a0;)J

    move-result-wide v2

    .line 177
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_1

    .line 823
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 832
    iget-object v0, v0, Lj$/time/j;->b:Lj$/time/l;

    .line 738
    iget v0, v0, Lj$/time/l;->d:I

    .line 823
    iget-object v1, p1, Lj$/time/r;->a:Lj$/time/j;

    .line 832
    iget-object v1, v1, Lj$/time/j;->b:Lj$/time/l;

    .line 738
    iget v1, v1, Lj$/time/l;->d:I

    sub-int/2addr v0, v1

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 715
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    iget-object p1, p1, Lj$/time/r;->a:Lj$/time/j;

    .line 1805
    invoke-virtual {v0, p1}, Lj$/time/j;->O(Lj$/time/chrono/d;)I

    move-result p1

    return p1

    :cond_2
    return v0
.end method

.method public final d(JLj$/time/temporal/r;)Lj$/time/temporal/m;
    .locals 3

    .line 968
    instance-of v0, p3, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 969
    move-object v0, p3

    check-cast v0, Lj$/time/temporal/a;

    .line 970
    sget-object v1, Lj$/time/q;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    .line 976
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v0, p1, p2, p3}, Lj$/time/j;->Z(JLj$/time/temporal/r;)Lj$/time/j;

    move-result-object p1

    iget-object p2, p0, Lj$/time/r;->b:Lj$/time/a0;

    invoke-virtual {p0, p1, p2}, Lj$/time/r;->A(Lj$/time/j;Lj$/time/a0;)Lj$/time/r;

    move-result-object p1

    return-object p1

    .line 973
    :cond_0
    iget-object p3, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 669
    iget-object v1, v0, Lj$/time/temporal/a;->b:Lj$/time/temporal/v;

    .line 732
    invoke-virtual {v1, p1, p2, v0}, Lj$/time/temporal/v;->a(JLj$/time/temporal/r;)I

    move-result p1

    .line 973
    invoke-static {p1}, Lj$/time/a0;->Y(I)Lj$/time/a0;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lj$/time/r;->A(Lj$/time/j;Lj$/time/a0;)Lj$/time/r;

    move-result-object p1

    return-object p1

    .line 859
    :cond_1
    iget-object p3, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 868
    iget-object p3, p3, Lj$/time/j;->b:Lj$/time/l;

    .line 738
    iget p3, p3, Lj$/time/l;->d:I

    int-to-long v0, p3

    .line 971
    invoke-static {p1, p2, v0, v1}, Lj$/time/Instant;->A(JJ)Lj$/time/Instant;

    move-result-object p1

    iget-object p2, p0, Lj$/time/r;->b:Lj$/time/a0;

    .line 324
    const-string p3, "instant"

    invoke-static {p1, p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 325
    const-string p3, "zone"

    invoke-static {p2, p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 326
    invoke-virtual {p2}, Lj$/time/z;->w()Lj$/time/zone/f;

    move-result-object p2

    .line 327
    invoke-virtual {p2, p1}, Lj$/time/zone/f;->d(Lj$/time/Instant;)Lj$/time/a0;

    move-result-object p2

    .line 619
    iget-wide v0, p1, Lj$/time/Instant;->a:J

    .line 632
    iget p1, p1, Lj$/time/Instant;->b:I

    .line 328
    invoke-static {v0, v1, p1, p2}, Lj$/time/j;->P(JILj$/time/a0;)Lj$/time/j;

    move-result-object p1

    .line 329
    new-instance p3, Lj$/time/r;

    invoke-direct {p3, p1, p2}, Lj$/time/r;-><init>(Lj$/time/j;Lj$/time/a0;)V

    return-object p3

    .line 978
    :cond_2
    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/r;->V(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    check-cast p1, Lj$/time/r;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1876
    :cond_0
    instance-of v1, p1, Lj$/time/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1877
    check-cast p1, Lj$/time/r;

    .line 1878
    iget-object v1, p0, Lj$/time/r;->a:Lj$/time/j;

    iget-object v3, p1, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v1, v3}, Lj$/time/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/r;->b:Lj$/time/a0;

    iget-object p1, p1, Lj$/time/r;->b:Lj$/time/a0;

    invoke-virtual {v1, p1}, Lj$/time/a0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lj$/time/temporal/r;)I
    .locals 2

    .line 597
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 598
    sget-object v0, Lj$/time/q;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 604
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v0, p1}, Lj$/time/j;->f(Lj$/time/temporal/r;)I

    move-result p1

    return p1

    .line 653
    :cond_0
    iget-object p1, p0, Lj$/time/r;->b:Lj$/time/a0;

    .line 474
    iget p1, p1, Lj$/time/a0;->b:I

    return p1

    .line 600
    :cond_1
    new-instance p1, Lj$/time/temporal/u;

    const-string v0, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    .line 88
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 600
    throw p1

    .line 606
    :cond_2
    invoke-super {p0, p1}, Lj$/time/temporal/n;->f(Lj$/time/temporal/r;)I

    move-result p1

    return p1
.end method

.method public final g(Lj$/time/LocalDate;)Lj$/time/temporal/m;
    .locals 2

    .line 911
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    .line 920
    iget-object v1, v0, Lj$/time/j;->b:Lj$/time/l;

    .line 920
    invoke-virtual {v0, p1, v1}, Lj$/time/j;->a0(Lj$/time/LocalDate;Lj$/time/l;)Lj$/time/j;

    move-result-object p1

    .line 911
    iget-object v0, p0, Lj$/time/r;->b:Lj$/time/a0;

    invoke-virtual {p0, p1, v0}, Lj$/time/r;->A(Lj$/time/j;Lj$/time/a0;)Lj$/time/r;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic h(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 0

    .line 128
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/r;->w(JLj$/time/temporal/t;)Lj$/time/r;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1890
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v0}, Lj$/time/j;->hashCode()I

    move-result v0

    iget-object v1, p0, Lj$/time/r;->b:Lj$/time/a0;

    .line 736
    iget v1, v1, Lj$/time/a0;->b:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(Lj$/time/temporal/r;)Z
    .locals 1

    .line 485
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

    .line 634
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 635
    sget-object v0, Lj$/time/q;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 639
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v0, p1}, Lj$/time/j;->j(Lj$/time/temporal/r;)J

    move-result-wide v0

    return-wide v0

    .line 653
    :cond_0
    iget-object p1, p0, Lj$/time/r;->b:Lj$/time/a0;

    .line 474
    iget p1, p1, Lj$/time/a0;->b:I

    int-to-long v0, p1

    return-wide v0

    .line 1774
    :cond_1
    iget-object p1, p0, Lj$/time/r;->a:Lj$/time/j;

    iget-object v0, p0, Lj$/time/r;->b:Lj$/time/a0;

    invoke-interface {p1, v0}, Lj$/time/chrono/d;->v(Lj$/time/a0;)J

    move-result-wide v0

    return-wide v0

    .line 641
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->P(Lj$/time/temporal/n;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final l(Lj$/time/temporal/r;)Lj$/time/temporal/v;
    .locals 1

    .line 558
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 559
    sget-object v0, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 562
    :cond_0
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v0, p1}, Lj$/time/j;->l(Lj$/time/temporal/r;)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1

    .line 560
    :cond_1
    :goto_0
    check-cast p1, Lj$/time/temporal/a;

    .line 669
    iget-object p1, p1, Lj$/time/temporal/a;->b:Lj$/time/temporal/v;

    return-object p1

    .line 564
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->A(Lj$/time/temporal/n;)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1912
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v0}, Lj$/time/j;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lj$/time/r;->b:Lj$/time/a0;

    .line 747
    iget-object v1, v1, Lj$/time/a0;->c:Ljava/lang/String;

    .line 1912
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w(JLj$/time/temporal/t;)Lj$/time/r;
    .locals 1

    .line 1189
    instance-of v0, p3, Lj$/time/temporal/b;

    if-eqz v0, :cond_0

    .line 1190
    iget-object v0, p0, Lj$/time/r;->a:Lj$/time/j;

    invoke-virtual {v0, p1, p2, p3}, Lj$/time/j;->V(JLj$/time/temporal/t;)Lj$/time/j;

    move-result-object p1

    iget-object p2, p0, Lj$/time/r;->b:Lj$/time/a0;

    invoke-virtual {p0, p1, p2}, Lj$/time/r;->A(Lj$/time/j;Lj$/time/a0;)Lj$/time/r;

    move-result-object p1

    return-object p1

    .line 1192
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/t;->w(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    check-cast p1, Lj$/time/r;

    return-object p1
.end method
