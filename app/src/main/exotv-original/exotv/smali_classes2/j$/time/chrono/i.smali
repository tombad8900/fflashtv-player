.class public interface abstract Lj$/time/chrono/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/m;
.implements Ljava/lang/Comparable;


# virtual methods
.method public abstract D(Lj$/time/z;)Lj$/time/chrono/i;
.end method

.method public abstract J()Lj$/time/z;
.end method

.method public W()J
    .locals 4

    .line 553
    invoke-interface {p0}, Lj$/time/chrono/i;->n()Lj$/time/chrono/ChronoLocalDate;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/ChronoLocalDate;->K()J

    move-result-wide v0

    const-wide/32 v2, 0x15180

    mul-long/2addr v0, v2

    .line 554
    invoke-interface {p0}, Lj$/time/chrono/i;->k()Lj$/time/l;

    move-result-object v2

    invoke-virtual {v2}, Lj$/time/l;->e0()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 555
    invoke-interface {p0}, Lj$/time/chrono/i;->o()Lj$/time/a0;

    move-result-object v2

    .line 474
    iget v2, v2, Lj$/time/a0;->b:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public a(JLj$/time/temporal/t;)Lj$/time/chrono/i;
    .locals 1

    .line 466
    invoke-interface {p0}, Lj$/time/chrono/i;->e()Lj$/time/chrono/l;

    move-result-object v0

    invoke-super {p0, p1, p2, p3}, Lj$/time/temporal/m;->a(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    invoke-static {v0, p1}, Lj$/time/chrono/k;->w(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 0

    .line 122
    invoke-interface {p0, p1, p2, p3}, Lj$/time/chrono/i;->a(JLj$/time/temporal/t;)Lj$/time/chrono/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Lj$/time/g;)Ljava/lang/Object;
    .locals 1

    .line 491
    sget-object v0, Lj$/time/temporal/s;->e:Lj$/time/g;

    if-eq p1, v0, :cond_5

    sget-object v0, Lj$/time/temporal/s;->a:Lj$/time/g;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 493
    :cond_0
    sget-object v0, Lj$/time/temporal/s;->d:Lj$/time/g;

    if-ne p1, v0, :cond_1

    .line 494
    invoke-interface {p0}, Lj$/time/chrono/i;->o()Lj$/time/a0;

    move-result-object p1

    return-object p1

    .line 495
    :cond_1
    sget-object v0, Lj$/time/temporal/s;->g:Lj$/time/g;

    if-ne p1, v0, :cond_2

    .line 496
    invoke-interface {p0}, Lj$/time/chrono/i;->k()Lj$/time/l;

    move-result-object p1

    return-object p1

    .line 497
    :cond_2
    sget-object v0, Lj$/time/temporal/s;->b:Lj$/time/g;

    if-ne p1, v0, :cond_3

    .line 498
    invoke-interface {p0}, Lj$/time/chrono/i;->e()Lj$/time/chrono/l;

    move-result-object p1

    return-object p1

    .line 499
    :cond_3
    sget-object v0, Lj$/time/temporal/s;->c:Lj$/time/g;

    if-ne p1, v0, :cond_4

    .line 500
    sget-object p1, Lj$/time/temporal/b;->NANOS:Lj$/time/temporal/b;

    return-object p1

    .line 504
    :cond_4
    invoke-virtual {p1, p0}, Lj$/time/g;->l(Lj$/time/temporal/n;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 492
    :cond_5
    :goto_0
    invoke-interface {p0}, Lj$/time/chrono/i;->J()Lj$/time/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 122
    check-cast p1, Lj$/time/chrono/i;

    invoke-interface {p0, p1}, Lj$/time/chrono/i;->s(Lj$/time/chrono/i;)I

    move-result p1

    return p1
.end method

.method public e()Lj$/time/chrono/l;
    .locals 1

    .line 265
    invoke-interface {p0}, Lj$/time/chrono/i;->n()Lj$/time/chrono/ChronoLocalDate;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    return-object v0
.end method

.method public f(Lj$/time/temporal/r;)I
    .locals 2

    .line 198
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 199
    sget-object v0, Lj$/time/chrono/h;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 205
    invoke-interface {p0}, Lj$/time/chrono/i;->x()Lj$/time/chrono/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/time/temporal/n;->f(Lj$/time/temporal/r;)I

    move-result p1

    return p1

    .line 203
    :cond_0
    invoke-interface {p0}, Lj$/time/chrono/i;->o()Lj$/time/a0;

    move-result-object p1

    .line 474
    iget p1, p1, Lj$/time/a0;->b:I

    return p1

    .line 201
    :cond_1
    new-instance p1, Lj$/time/temporal/u;

    const-string v0, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    .line 88
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 201
    throw p1

    .line 207
    :cond_2
    invoke-super {p0, p1}, Lj$/time/temporal/n;->f(Lj$/time/temporal/r;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic g(Lj$/time/LocalDate;)Lj$/time/temporal/m;
    .locals 0

    .line 122
    invoke-interface {p0, p1}, Lj$/time/chrono/i;->m(Lj$/time/temporal/o;)Lj$/time/chrono/i;

    move-result-object p1

    return-object p1
.end method

.method public j(Lj$/time/temporal/r;)J
    .locals 2

    .line 212
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 213
    sget-object v0, Lj$/time/chrono/h;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 217
    invoke-interface {p0}, Lj$/time/chrono/i;->x()Lj$/time/chrono/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/time/temporal/n;->j(Lj$/time/temporal/r;)J

    move-result-wide v0

    return-wide v0

    .line 215
    :cond_0
    invoke-interface {p0}, Lj$/time/chrono/i;->o()Lj$/time/a0;

    move-result-object p1

    .line 474
    iget p1, p1, Lj$/time/a0;->b:I

    int-to-long v0, p1

    return-wide v0

    .line 214
    :cond_1
    invoke-interface {p0}, Lj$/time/chrono/i;->W()J

    move-result-wide v0

    return-wide v0

    .line 219
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->P(Lj$/time/temporal/n;)J

    move-result-wide v0

    return-wide v0
.end method

.method public k()Lj$/time/l;
    .locals 1

    .line 243
    invoke-interface {p0}, Lj$/time/chrono/i;->x()Lj$/time/chrono/d;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/d;->k()Lj$/time/l;

    move-result-object v0

    return-object v0
.end method

.method public l(Lj$/time/temporal/r;)Lj$/time/temporal/v;
    .locals 1

    .line 187
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 188
    sget-object v0, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 191
    :cond_0
    invoke-interface {p0}, Lj$/time/chrono/i;->x()Lj$/time/chrono/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/time/temporal/n;->l(Lj$/time/temporal/r;)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1

    .line 189
    :cond_1
    :goto_0
    check-cast p1, Lj$/time/temporal/a;

    .line 669
    iget-object p1, p1, Lj$/time/temporal/a;->b:Lj$/time/temporal/v;

    return-object p1

    .line 193
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->A(Lj$/time/temporal/n;)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1
.end method

.method public m(Lj$/time/temporal/o;)Lj$/time/chrono/i;
    .locals 1

    .line 420
    invoke-interface {p0}, Lj$/time/chrono/i;->e()Lj$/time/chrono/l;

    move-result-object v0

    .line 190
    invoke-interface {p1, p0}, Lj$/time/temporal/o;->c(Lj$/time/temporal/m;)Lj$/time/temporal/m;

    move-result-object p1

    .line 420
    invoke-static {v0, p1}, Lj$/time/chrono/k;->w(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/k;

    move-result-object p1

    return-object p1
.end method

.method public n()Lj$/time/chrono/ChronoLocalDate;
    .locals 1

    .line 231
    invoke-interface {p0}, Lj$/time/chrono/i;->x()Lj$/time/chrono/d;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/d;->n()Lj$/time/chrono/ChronoLocalDate;

    move-result-object v0

    return-object v0
.end method

.method public abstract o()Lj$/time/a0;
.end method

.method public s(Lj$/time/chrono/i;)I
    .locals 4

    .line 577
    invoke-interface {p0}, Lj$/time/chrono/i;->W()J

    move-result-wide v0

    invoke-interface {p1}, Lj$/time/chrono/i;->W()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_0

    .line 579
    invoke-interface {p0}, Lj$/time/chrono/i;->k()Lj$/time/l;

    move-result-object v0

    .line 738
    iget v0, v0, Lj$/time/l;->d:I

    .line 579
    invoke-interface {p1}, Lj$/time/chrono/i;->k()Lj$/time/l;

    move-result-object v1

    .line 738
    iget v1, v1, Lj$/time/l;->d:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 581
    invoke-interface {p0}, Lj$/time/chrono/i;->x()Lj$/time/chrono/d;

    move-result-object v0

    invoke-interface {p1}, Lj$/time/chrono/i;->x()Lj$/time/chrono/d;

    move-result-object v1

    invoke-interface {v0, v1}, Lj$/time/chrono/d;->O(Lj$/time/chrono/d;)I

    move-result v0

    if-nez v0, :cond_0

    .line 583
    invoke-interface {p0}, Lj$/time/chrono/i;->J()Lj$/time/z;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/z;->q()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lj$/time/chrono/i;->J()Lj$/time/z;

    move-result-object v1

    invoke-virtual {v1}, Lj$/time/z;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 585
    invoke-interface {p0}, Lj$/time/chrono/i;->e()Lj$/time/chrono/l;

    move-result-object v0

    invoke-interface {p1}, Lj$/time/chrono/i;->e()Lj$/time/chrono/l;

    move-result-object p1

    check-cast v0, Lj$/time/chrono/a;

    .line 682
    invoke-interface {v0}, Lj$/time/chrono/l;->q()Ljava/lang/String;

    move-result-object v0

    .line 682
    invoke-interface {p1}, Lj$/time/chrono/l;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public abstract x()Lj$/time/chrono/d;
.end method
