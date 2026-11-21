.class public interface abstract Lj$/time/chrono/ChronoLocalDate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/m;
.implements Lj$/time/temporal/o;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj$/time/temporal/m;",
        "Lj$/time/temporal/o;",
        "Ljava/lang/Comparable<",
        "Lj$/time/chrono/ChronoLocalDate;",
        ">;"
    }
.end annotation


# virtual methods
.method public K()J
    .locals 2

    .line 673
    sget-object v0, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    invoke-interface {p0, v0}, Lj$/time/temporal/n;->j(Lj$/time/temporal/r;)J

    move-result-wide v0

    return-wide v0
.end method

.method public L(Lj$/time/l;)Lj$/time/chrono/d;
    .locals 1

    .line 174
    new-instance v0, Lj$/time/chrono/f;

    invoke-direct {v0, p0, p1}, Lj$/time/chrono/f;-><init>(Lj$/time/chrono/ChronoLocalDate;Lj$/time/l;)V

    return-object v0
.end method

.method public N()Lj$/time/chrono/m;
    .locals 2

    .line 326
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    sget-object v1, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    invoke-interface {p0, v1}, Lj$/time/temporal/n;->f(Lj$/time/temporal/r;)I

    move-result v1

    invoke-interface {v0, v1}, Lj$/time/chrono/l;->B(I)Lj$/time/chrono/m;

    move-result-object v0

    return-object v0
.end method

.method public R(Lj$/time/temporal/q;)Lj$/time/chrono/ChronoLocalDate;
    .locals 1

    .line 452
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    .line 262
    invoke-interface {p1, p0}, Lj$/time/temporal/q;->w(Lj$/time/chrono/ChronoLocalDate;)Lj$/time/temporal/m;

    move-result-object p1

    .line 452
    invoke-static {v0, p1}, Lj$/time/chrono/c;->w(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1
.end method

.method public U(Lj$/time/chrono/ChronoLocalDate;)I
    .locals 4

    .line 707
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->K()J

    move-result-wide v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoLocalDate;->K()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_0

    .line 709
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

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

.method public a(JLj$/time/temporal/t;)Lj$/time/chrono/ChronoLocalDate;
    .locals 1

    .line 486
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    invoke-super {p0, p1, p2, p3}, Lj$/time/temporal/m;->a(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    invoke-static {v0, p1}, Lj$/time/chrono/c;->w(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 0

    .line 241
    invoke-interface {p0, p1, p2, p3}, Lj$/time/chrono/ChronoLocalDate;->a(JLj$/time/temporal/t;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1
.end method

.method public b(Lj$/time/g;)Ljava/lang/Object;
    .locals 1

    .line 511
    sget-object v0, Lj$/time/temporal/s;->a:Lj$/time/g;

    if-eq p1, v0, :cond_4

    sget-object v0, Lj$/time/temporal/s;->e:Lj$/time/g;

    if-eq p1, v0, :cond_4

    sget-object v0, Lj$/time/temporal/s;->d:Lj$/time/g;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 513
    :cond_0
    sget-object v0, Lj$/time/temporal/s;->g:Lj$/time/g;

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 515
    :cond_1
    sget-object v0, Lj$/time/temporal/s;->b:Lj$/time/g;

    if-ne p1, v0, :cond_2

    .line 516
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object p1

    return-object p1

    .line 517
    :cond_2
    sget-object v0, Lj$/time/temporal/s;->c:Lj$/time/g;

    if-ne p1, v0, :cond_3

    .line 518
    sget-object p1, Lj$/time/temporal/b;->DAYS:Lj$/time/temporal/b;

    return-object p1

    .line 522
    :cond_3
    invoke-virtual {p1, p0}, Lj$/time/g;->l(Lj$/time/temporal/n;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Lj$/time/temporal/m;)Lj$/time/temporal/m;
    .locals 3

    .line 551
    sget-object v0, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->K()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lj$/time/temporal/m;->d(JLj$/time/temporal/r;)Lj$/time/temporal/m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 241
    check-cast p1, Lj$/time/chrono/ChronoLocalDate;

    invoke-interface {p0, p1}, Lj$/time/chrono/ChronoLocalDate;->U(Lj$/time/chrono/ChronoLocalDate;)I

    move-result p1

    return p1
.end method

.method public d(JLj$/time/temporal/r;)Lj$/time/chrono/ChronoLocalDate;
    .locals 1

    .line 439
    instance-of v0, p3, Lj$/time/temporal/a;

    if-nez v0, :cond_0

    .line 442
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/r;->V(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    invoke-static {v0, p1}, Lj$/time/chrono/c;->w(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1

    .line 440
    :cond_0
    new-instance p1, Lj$/time/temporal/u;

    const-string p2, "Unsupported field: "

    .line 0
    invoke-static {p2, p3}, Lj$/time/d;->a(Ljava/lang/String;Lj$/time/temporal/r;)Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 440
    throw p1
.end method

.method public bridge synthetic d(JLj$/time/temporal/r;)Lj$/time/temporal/m;
    .locals 0

    .line 241
    invoke-interface {p0, p1, p2, p3}, Lj$/time/chrono/ChronoLocalDate;->d(JLj$/time/temporal/r;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1
.end method

.method public abstract e()Lj$/time/chrono/l;
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public bridge synthetic g(Lj$/time/LocalDate;)Lj$/time/temporal/m;
    .locals 0

    .line 241
    invoke-interface {p0, p1}, Lj$/time/chrono/ChronoLocalDate;->m(Lj$/time/temporal/o;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1
.end method

.method public h(JLj$/time/temporal/t;)Lj$/time/chrono/ChronoLocalDate;
    .locals 1

    .line 462
    instance-of v0, p3, Lj$/time/temporal/b;

    if-nez v0, :cond_0

    .line 465
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/t;->w(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    invoke-static {v0, p1}, Lj$/time/chrono/c;->w(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1

    .line 463
    :cond_0
    new-instance p1, Lj$/time/temporal/u;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported unit: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 463
    throw p1
.end method

.method public bridge synthetic h(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 0

    .line 241
    invoke-interface {p0, p1, p2, p3}, Lj$/time/chrono/ChronoLocalDate;->h(JLj$/time/temporal/t;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1
.end method

.method public abstract hashCode()I
.end method

.method public i(Lj$/time/temporal/r;)Z
    .locals 1

    .line 387
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_0

    .line 388
    check-cast p1, Lj$/time/temporal/a;

    invoke-virtual {p1}, Lj$/time/temporal/a;->isDateBased()Z

    move-result p1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    .line 390
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->w(Lj$/time/temporal/n;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public m(Lj$/time/temporal/o;)Lj$/time/chrono/ChronoLocalDate;
    .locals 1

    .line 428
    invoke-interface {p0}, Lj$/time/chrono/ChronoLocalDate;->e()Lj$/time/chrono/l;

    move-result-object v0

    .line 190
    invoke-interface {p1, p0}, Lj$/time/temporal/o;->c(Lj$/time/temporal/m;)Lj$/time/temporal/m;

    move-result-object p1

    .line 428
    invoke-static {v0, p1}, Lj$/time/chrono/c;->w(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/ChronoLocalDate;

    move-result-object p1

    return-object p1
.end method

.method public abstract toString()Ljava/lang/String;
.end method
