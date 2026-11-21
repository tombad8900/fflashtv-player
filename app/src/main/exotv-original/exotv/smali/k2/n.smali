.class public abstract Lk2/n;
.super Lm1/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lk2/h;


# instance fields
.field public j:Lk2/h;

.field public k:J


# virtual methods
.method public final c(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Lk2/n;->j:Lk2/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lk2/n;->k:J

    .line 7
    .line 8
    sub-long/2addr p1, v1

    .line 9
    invoke-interface {v0, p1, p2}, Lk2/h;->c(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final clear()V
    .locals 1

    .line 1
    invoke-super {p0}, Lm1/h;->clear()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lk2/n;->j:Lk2/h;

    .line 6
    .line 7
    return-void
.end method

.method public final f(I)J
    .locals 4

    .line 1
    iget-object v0, p0, Lk2/n;->j:Lk2/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, Lk2/h;->f(I)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, Lk2/n;->k:J

    .line 11
    .line 12
    add-long/2addr v0, v2

    .line 13
    return-wide v0
.end method

.method public final m(J)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lk2/n;->j:Lk2/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lk2/n;->k:J

    .line 7
    .line 8
    sub-long/2addr p1, v1

    .line 9
    invoke-interface {v0, p1, p2}, Lk2/h;->m(J)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/n;->j:Lk2/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lk2/h;->n()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method
