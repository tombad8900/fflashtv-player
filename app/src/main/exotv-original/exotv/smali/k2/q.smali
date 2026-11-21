.class public interface abstract Lk2/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# virtual methods
.method public d([BII)Lk2/h;
    .locals 6

    .line 1
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v5, Landroidx/media3/exoplayer/source/preload/a;

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-direct {v5, v0, p2}, Landroidx/media3/exoplayer/source/preload/a;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sget-object v4, Lk2/p;->c:Lk2/p;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v3, p3

    .line 18
    invoke-interface/range {v0 .. v5}, Lk2/q;->f([BIILk2/p;Lh1/f;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lk2/d;

    .line 22
    .line 23
    invoke-virtual {p2}, Lf6/j0;->f()Lf6/l1;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Lk2/d;-><init>(Lf6/l1;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public abstract f([BIILk2/p;Lh1/f;)V
.end method

.method public abstract h()I
.end method

.method public reset()V
    .locals 0

    .line 1
    return-void
.end method
