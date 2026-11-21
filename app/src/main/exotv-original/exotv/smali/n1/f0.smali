.class public final Ln1/f0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/c0;


# virtual methods
.method public final getDurationUs()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final getSeekPoints(J)Ln1/b0;
    .locals 4

    .line 1
    new-instance v0, Ln1/b0;

    .line 2
    .line 3
    new-instance v1, Ln1/d0;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-direct {v1, p1, p2, v2, v3}, Ln1/d0;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v1}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final isSeekable()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
