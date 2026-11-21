.class public final Lt2/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final a:Lt2/e;

.field public final b:Lh1/w;

.field public final c:Lh1/w;

.field public final d:Lh1/v;

.field public e:Ln1/p;

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lt2/e;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {p1, v1, v0, v2}, Lt2/e;-><init>(ILjava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lt2/d;->a:Lt2/e;

    .line 13
    .line 14
    new-instance p1, Lh1/w;

    .line 15
    .line 16
    const/16 v0, 0x800

    .line 17
    .line 18
    invoke-direct {p1, v0}, Lh1/w;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lt2/d;->b:Lh1/w;

    .line 22
    .line 23
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    iput-wide v0, p0, Lt2/d;->g:J

    .line 26
    .line 27
    new-instance p1, Lh1/w;

    .line 28
    .line 29
    const/16 v0, 0xa

    .line 30
    .line 31
    invoke-direct {p1, v0}, Lh1/w;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lt2/d;->c:Lh1/w;

    .line 35
    .line 36
    new-instance v0, Lh1/v;

    .line 37
    .line 38
    iget-object p1, p1, Lh1/w;->a:[B

    .line 39
    .line 40
    array-length v1, p1

    .line 41
    invoke-direct {v0, p1, v1}, Lh1/v;-><init>([BI)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lt2/d;->d:Lh1/v;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final init(Ln1/p;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lt2/d;->e:Ln1/p;

    .line 2
    .line 3
    new-instance v0, Lt2/g0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-direct {v0, v1, v2}, Lt2/g0;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lt2/d;->a:Lt2/e;

    .line 11
    .line 12
    invoke-virtual {v1, p1, v0}, Lt2/e;->e(Ln1/p;Lt2/g0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ln1/p;->endTracks()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 8

    .line 1
    iget-object p2, p0, Lt2/d;->e:Ln1/p;

    .line 2
    .line 3
    invoke-static {p2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ln1/o;->getLength()J

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lt2/d;->b:Lh1/w;

    .line 10
    .line 11
    iget-object v0, p2, Lh1/w;->a:[B

    .line 12
    .line 13
    const/16 v1, 0x800

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-interface {p1, v0, v2, v1}, Landroidx/media3/common/m;->read([BII)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 v0, -0x1

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    move v3, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v3, v2

    .line 27
    :goto_0
    iget-boolean v4, p0, Lt2/d;->i:Z

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object v4, p0, Lt2/d;->e:Ln1/p;

    .line 33
    .line 34
    new-instance v5, Ln1/s;

    .line 35
    .line 36
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-direct {v5, v6, v7}, Ln1/s;-><init>(J)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v4, v5}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 45
    .line 46
    .line 47
    iput-boolean v1, p0, Lt2/d;->i:Z

    .line 48
    .line 49
    :goto_1
    if-eqz v3, :cond_2

    .line 50
    .line 51
    return v0

    .line 52
    :cond_2
    invoke-virtual {p2, v2}, Lh1/w;->G(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lh1/w;->F(I)V

    .line 56
    .line 57
    .line 58
    iget-boolean p1, p0, Lt2/d;->h:Z

    .line 59
    .line 60
    iget-object v0, p0, Lt2/d;->a:Lt2/e;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    iget-wide v3, p0, Lt2/d;->f:J

    .line 65
    .line 66
    iput-wide v3, v0, Lt2/e;->t:J

    .line 67
    .line 68
    iput-boolean v1, p0, Lt2/d;->h:Z

    .line 69
    .line 70
    :cond_3
    invoke-virtual {v0, p2}, Lt2/e;->a(Lh1/w;)V

    .line 71
    .line 72
    .line 73
    return v2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lt2/d;->h:Z

    .line 3
    .line 4
    iget-object p1, p0, Lt2/d;->a:Lt2/e;

    .line 5
    .line 6
    invoke-virtual {p1}, Lt2/e;->c()V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Lt2/d;->f:J

    .line 10
    .line 11
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lt2/d;->c:Lh1/w;

    .line 4
    .line 5
    iget-object v3, v2, Lh1/w;->a:[B

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    invoke-interface {p1, v3, v0, v4}, Ln1/o;->i([BII)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lh1/w;->G(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lh1/w;->x()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x494433

    .line 20
    .line 21
    .line 22
    if-eq v3, v4, :cond_5

    .line 23
    .line 24
    invoke-interface {p1}, Ln1/o;->g()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1}, Ln1/o;->d(I)V

    .line 28
    .line 29
    .line 30
    iget-wide v2, p0, Lt2/d;->g:J

    .line 31
    .line 32
    const-wide/16 v4, -0x1

    .line 33
    .line 34
    cmp-long v0, v2, v4

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    int-to-long v2, v1

    .line 39
    iput-wide v2, p0, Lt2/d;->g:J

    .line 40
    .line 41
    :cond_0
    const/4 v3, 0x0

    .line 42
    move v2, v1

    .line 43
    move v0, v3

    .line 44
    move v4, v0

    .line 45
    :cond_1
    iget-object v5, p0, Lt2/d;->c:Lh1/w;

    .line 46
    .line 47
    iget-object v6, v5, Lh1/w;->a:[B

    .line 48
    .line 49
    const/4 v7, 0x2

    .line 50
    invoke-interface {p1, v6, v3, v7}, Ln1/o;->i([BII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v3}, Lh1/w;->G(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Lh1/w;->A()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const v7, 0xfff6

    .line 61
    .line 62
    .line 63
    and-int/2addr v6, v7

    .line 64
    const v7, 0xfff0

    .line 65
    .line 66
    .line 67
    if-ne v6, v7, :cond_4

    .line 68
    .line 69
    const/4 v6, 0x1

    .line 70
    add-int/2addr v0, v6

    .line 71
    const/4 v7, 0x4

    .line 72
    if-lt v0, v7, :cond_2

    .line 73
    .line 74
    const/16 v8, 0xbc

    .line 75
    .line 76
    if-le v4, v8, :cond_2

    .line 77
    .line 78
    return v6

    .line 79
    :cond_2
    iget-object v5, v5, Lh1/w;->a:[B

    .line 80
    .line 81
    invoke-interface {p1, v5, v3, v7}, Ln1/o;->i([BII)V

    .line 82
    .line 83
    .line 84
    const/16 v5, 0xe

    .line 85
    .line 86
    iget-object v6, p0, Lt2/d;->d:Lh1/v;

    .line 87
    .line 88
    invoke-virtual {v6, v5}, Lh1/v;->s(I)V

    .line 89
    .line 90
    .line 91
    const/16 v5, 0xd

    .line 92
    .line 93
    invoke-virtual {v6, v5}, Lh1/v;->k(I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    const/4 v6, 0x6

    .line 98
    if-gt v5, v6, :cond_3

    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    invoke-interface {p1}, Ln1/o;->g()V

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, v2}, Ln1/o;->d(I)V

    .line 106
    .line 107
    .line 108
    :goto_1
    move v0, v3

    .line 109
    move v4, v0

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    add-int/lit8 v6, v5, -0x6

    .line 112
    .line 113
    invoke-interface {p1, v6}, Ln1/o;->d(I)V

    .line 114
    .line 115
    .line 116
    add-int/2addr v4, v5

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 119
    .line 120
    invoke-interface {p1}, Ln1/o;->g()V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v2}, Ln1/o;->d(I)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :goto_2
    sub-int v5, v2, v1

    .line 128
    .line 129
    const/16 v6, 0x2000

    .line 130
    .line 131
    if-lt v5, v6, :cond_1

    .line 132
    .line 133
    return v3

    .line 134
    :cond_5
    const/4 v3, 0x3

    .line 135
    invoke-virtual {v2, v3}, Lh1/w;->H(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Lh1/w;->t()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    add-int/lit8 v3, v2, 0xa

    .line 143
    .line 144
    add-int/2addr v1, v3

    .line 145
    invoke-interface {p1, v2}, Ln1/o;->d(I)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0
.end method
