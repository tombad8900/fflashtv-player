.class public final synthetic Landroidx/media3/exoplayer/analytics/p;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;
.implements Lh1/f;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:J

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/media3/exoplayer/analytics/p;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/p;->k:Ljava/lang/Object;

    iput p2, p0, Landroidx/media3/exoplayer/analytics/p;->m:I

    iput-wide p3, p0, Landroidx/media3/exoplayer/analytics/p;->l:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/media3/exoplayer/analytics/p;->j:I

    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/p;->k:Ljava/lang/Object;

    iput-wide p4, p0, Landroidx/media3/exoplayer/analytics/p;->l:J

    iput p2, p0, Landroidx/media3/exoplayer/analytics/p;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/p;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk2/r;

    .line 4
    .line 5
    check-cast p1, Lk2/c;

    .line 6
    .line 7
    iget-object v1, v0, Lk2/r;->h:Landroidx/media3/common/w;

    .line 8
    .line 9
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, Lk2/c;->a:Lf6/m0;

    .line 13
    .line 14
    iget-wide v2, p1, Lk2/c;->c:J

    .line 15
    .line 16
    invoke-static {v1, v2, v3}, Lk2/b;->o(Lf6/m0;J)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, v0, Lk2/r;->c:Lh1/w;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    array-length v3, v1

    .line 26
    invoke-virtual {v2, v1, v3}, Lh1/w;->E([BI)V

    .line 27
    .line 28
    .line 29
    iget-object v3, v0, Lk2/r;->a:Ln1/i0;

    .line 30
    .line 31
    array-length v4, v1

    .line 32
    invoke-interface {v3, v2, v4}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 33
    .line 34
    .line 35
    iget-wide v2, p1, Lk2/c;->b:J

    .line 36
    .line 37
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long p1, v2, v4

    .line 43
    .line 44
    iget-wide v4, p0, Landroidx/media3/exoplayer/analytics/p;->l:J

    .line 45
    .line 46
    const-wide v6, 0x7fffffffffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    iget-object p1, v0, Lk2/r;->h:Landroidx/media3/common/w;

    .line 54
    .line 55
    iget-wide v2, p1, Landroidx/media3/common/w;->s:J

    .line 56
    .line 57
    cmp-long p1, v2, v6

    .line 58
    .line 59
    if-nez p1, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    :goto_0
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 65
    .line 66
    .line 67
    :goto_1
    move-wide v7, v4

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    iget-object p1, v0, Lk2/r;->h:Landroidx/media3/common/w;

    .line 70
    .line 71
    iget-wide v8, p1, Landroidx/media3/common/w;->s:J

    .line 72
    .line 73
    cmp-long p1, v8, v6

    .line 74
    .line 75
    if-nez p1, :cond_2

    .line 76
    .line 77
    add-long/2addr v4, v2

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    add-long v4, v2, v8

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :goto_2
    iget-object v6, v0, Lk2/r;->a:Ln1/i0;

    .line 83
    .line 84
    array-length v10, v1

    .line 85
    const/4 v11, 0x0

    .line 86
    const/4 v12, 0x0

    .line 87
    iget v9, p0, Landroidx/media3/exoplayer/analytics/p;->m:I

    .line 88
    .line 89
    invoke-interface/range {v6 .. v12}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/analytics/p;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/p;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 9
    .line 10
    iget v1, p0, Landroidx/media3/exoplayer/analytics/p;->m:I

    .line 11
    .line 12
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 13
    .line 14
    iget-wide v2, p0, Landroidx/media3/exoplayer/analytics/p;->l:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->a0(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IJLandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/p;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 23
    .line 24
    iget-wide v1, p0, Landroidx/media3/exoplayer/analytics/p;->l:J

    .line 25
    .line 26
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 27
    .line 28
    iget v3, p0, Landroidx/media3/exoplayer/analytics/p;->m:I

    .line 29
    .line 30
    invoke-static {v0, v3, v1, v2, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->e(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IJLandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
