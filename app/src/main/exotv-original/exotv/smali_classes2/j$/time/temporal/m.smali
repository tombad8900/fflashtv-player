.class public interface abstract Lj$/time/temporal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/n;


# virtual methods
.method public a(JLj$/time/temporal/t;)Lj$/time/temporal/m;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 370
    invoke-interface {p0, p1, p2, p3}, Lj$/time/temporal/m;->h(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1, p3}, Lj$/time/temporal/m;->h(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-interface {p0, p1, p2, p3}, Lj$/time/temporal/m;->h(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(JLj$/time/temporal/r;)Lj$/time/temporal/m;
.end method

.method public abstract g(Lj$/time/LocalDate;)Lj$/time/temporal/m;
.end method

.method public abstract h(JLj$/time/temporal/t;)Lj$/time/temporal/m;
.end method
