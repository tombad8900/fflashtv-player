.class public final Lv1/d;
.super Ln1/u;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Ln1/c0;

.field public final synthetic b:Lv1/c;


# direct methods
.method public constructor <init>(Lv1/c;Ln1/c0;Ln1/c0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv1/d;->b:Lv1/c;

    .line 2
    .line 3
    iput-object p3, p0, Lv1/d;->a:Ln1/c0;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ln1/u;-><init>(Ln1/c0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getSeekPoints(J)Ln1/b0;
    .locals 8

    .line 1
    iget-object v0, p0, Lv1/d;->a:Ln1/c0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ln1/c0;->getSeekPoints(J)Ln1/b0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Ln1/b0;

    .line 8
    .line 9
    new-instance v0, Ln1/d0;

    .line 10
    .line 11
    iget-object v1, p1, Ln1/b0;->a:Ln1/d0;

    .line 12
    .line 13
    iget-wide v2, v1, Ln1/d0;->a:J

    .line 14
    .line 15
    iget-wide v4, v1, Ln1/d0;->b:J

    .line 16
    .line 17
    iget-object v1, p0, Lv1/d;->b:Lv1/c;

    .line 18
    .line 19
    iget-wide v6, v1, Lv1/c;->k:J

    .line 20
    .line 21
    add-long/2addr v4, v6

    .line 22
    invoke-direct {v0, v2, v3, v4, v5}, Ln1/d0;-><init>(JJ)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ln1/d0;

    .line 26
    .line 27
    iget-object p1, p1, Ln1/b0;->b:Ln1/d0;

    .line 28
    .line 29
    iget-wide v2, p1, Ln1/d0;->a:J

    .line 30
    .line 31
    iget-wide v4, p1, Ln1/d0;->b:J

    .line 32
    .line 33
    add-long/2addr v4, v6

    .line 34
    invoke-direct {v1, v2, v3, v4, v5}, Ln1/d0;-><init>(JJ)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p2, v0, v1}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 38
    .line 39
    .line 40
    return-object p2
.end method
