.class public final Lk2/r;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/i0;


# instance fields
.field public final a:Ln1/i0;

.field public final b:Lk2/o;

.field public final c:Lh1/w;

.field public d:I

.field public e:I

.field public f:[B

.field public g:Lk2/q;

.field public h:Landroidx/media3/common/w;


# direct methods
.method public constructor <init>(Ln1/i0;Lk2/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/r;->a:Ln1/i0;

    .line 5
    .line 6
    iput-object p2, p0, Lk2/r;->b:Lk2/o;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lk2/r;->d:I

    .line 10
    .line 11
    iput p1, p0, Lk2/r;->e:I

    .line 12
    .line 13
    sget-object p1, Lh1/i0;->f:[B

    .line 14
    .line 15
    iput-object p1, p0, Lk2/r;->f:[B

    .line 16
    .line 17
    new-instance p1, Lh1/w;

    .line 18
    .line 19
    invoke-direct {p1}, Lh1/w;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lk2/r;->c:Lh1/w;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk2/r;->f:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Lk2/r;->e:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    if-lt v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, p0, Lk2/r;->d:I

    .line 11
    .line 12
    sub-int/2addr v1, v0

    .line 13
    mul-int/lit8 v0, v1, 0x2

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Lk2/r;->f:[B

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    if-gt p1, v2, :cond_1

    .line 24
    .line 25
    move-object p1, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-array p1, p1, [B

    .line 28
    .line 29
    :goto_0
    iget v2, p0, Lk2/r;->d:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v0, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    iput v3, p0, Lk2/r;->d:I

    .line 36
    .line 37
    iput v1, p0, Lk2/r;->e:I

    .line 38
    .line 39
    iput-object p1, p0, Lk2/r;->f:[B

    .line 40
    .line 41
    return-void
.end method

.method public final format(Landroidx/media3/common/w;)V
    .locals 6

    .line 1
    iget-object v0, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/media3/common/u0;->i(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x3

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-static {v1}, Lh1/a;->d(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lk2/r;->h:Landroidx/media3/common/w;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroidx/media3/common/w;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, Lk2/r;->b:Lk2/o;

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    iput-object p1, p0, Lk2/r;->h:Landroidx/media3/common/w;

    .line 32
    .line 33
    invoke-interface {v2, p1}, Lk2/o;->supportsFormat(Landroidx/media3/common/w;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v2, p1}, Lk2/o;->g(Landroidx/media3/common/w;)Lk2/q;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    :goto_1
    iput-object v1, p0, Lk2/r;->g:Lk2/q;

    .line 46
    .line 47
    :cond_2
    iget-object v1, p0, Lk2/r;->g:Lk2/q;

    .line 48
    .line 49
    iget-object v3, p0, Lk2/r;->a:Ln1/i0;

    .line 50
    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    invoke-interface {v3, p1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    invoke-virtual {p1}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v4, "application/x-media3-cues"

    .line 62
    .line 63
    invoke-static {v4}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iput-object v4, v1, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v0, v1, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 70
    .line 71
    const-wide v4, 0x7fffffffffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    iput-wide v4, v1, Landroidx/media3/common/v;->r:J

    .line 77
    .line 78
    invoke-interface {v2, p1}, Lk2/o;->c(Landroidx/media3/common/w;)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iput p1, v1, Landroidx/media3/common/v;->H:I

    .line 83
    .line 84
    new-instance p1, Landroidx/media3/common/w;

    .line 85
    .line 86
    invoke-direct {p1, v1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v3, p1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final sampleData(Landroidx/media3/common/m;IZI)I
    .locals 1

    .line 1
    iget-object p4, p0, Lk2/r;->g:Lk2/q;

    if-nez p4, :cond_0

    .line 2
    iget-object p4, p0, Lk2/r;->a:Ln1/i0;

    const/4 v0, 0x0

    invoke-interface {p4, p1, p2, p3, v0}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZI)I

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p0, p2}, Lk2/r;->a(I)V

    .line 4
    iget-object p4, p0, Lk2/r;->f:[B

    iget v0, p0, Lk2/r;->e:I

    invoke-interface {p1, p4, v0, p2}, Landroidx/media3/common/m;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    if-eqz p3, :cond_1

    return p2

    .line 5
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 6
    :cond_2
    iget p2, p0, Lk2/r;->e:I

    add-int/2addr p2, p1

    iput p2, p0, Lk2/r;->e:I

    return p1
.end method

.method public final sampleData(Lh1/w;II)V
    .locals 1

    .line 7
    iget-object v0, p0, Lk2/r;->g:Lk2/q;

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lk2/r;->a:Ln1/i0;

    invoke-interface {v0, p1, p2, p3}, Ln1/i0;->sampleData(Lh1/w;II)V

    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p2}, Lk2/r;->a(I)V

    .line 10
    iget-object p3, p0, Lk2/r;->f:[B

    iget v0, p0, Lk2/r;->e:I

    invoke-virtual {p1, p3, v0, p2}, Lh1/w;->e([BII)V

    .line 11
    iget p1, p0, Lk2/r;->e:I

    add-int/2addr p1, p2

    iput p1, p0, Lk2/r;->e:I

    return-void
.end method

.method public final sampleMetadata(JIIILn1/h0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lk2/r;->g:Lk2/q;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lk2/r;->a:Ln1/i0;

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    move v4, p3

    .line 9
    move v5, p4

    .line 10
    move v6, p5

    .line 11
    move-object v7, p6

    .line 12
    invoke-interface/range {v1 .. v7}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move v5, p4

    .line 17
    move v6, p5

    .line 18
    move-object v7, p6

    .line 19
    move-wide p5, p1

    .line 20
    const/4 v0, 0x0

    .line 21
    if-nez v7, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move p1, v0

    .line 26
    :goto_0
    const-string p2, "DRM on subtitles is not supported"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    iget p1, p0, Lk2/r;->e:I

    .line 32
    .line 33
    sub-int/2addr p1, v6

    .line 34
    sub-int v1, p1, v5

    .line 35
    .line 36
    iget-object v2, p0, Lk2/r;->g:Lk2/q;

    .line 37
    .line 38
    iget-object v3, p0, Lk2/r;->f:[B

    .line 39
    .line 40
    new-instance p1, Landroidx/media3/exoplayer/analytics/p;

    .line 41
    .line 42
    const/4 p4, 0x2

    .line 43
    move-object p2, p0

    .line 44
    invoke-direct/range {p1 .. p6}, Landroidx/media3/exoplayer/analytics/p;-><init>(Ljava/lang/Object;IIJ)V

    .line 45
    .line 46
    .line 47
    move-object v4, p2

    .line 48
    sget-object p5, Lk2/p;->c:Lk2/p;

    .line 49
    .line 50
    move-object p6, p1

    .line 51
    move p3, v1

    .line 52
    move-object p1, v2

    .line 53
    move-object p2, v3

    .line 54
    move p4, v5

    .line 55
    invoke-interface/range {p1 .. p6}, Lk2/q;->f([BIILk2/p;Lh1/f;)V

    .line 56
    .line 57
    .line 58
    add-int v1, p3, v5

    .line 59
    .line 60
    iput v1, v4, Lk2/r;->d:I

    .line 61
    .line 62
    iget p1, v4, Lk2/r;->e:I

    .line 63
    .line 64
    if-ne v1, p1, :cond_2

    .line 65
    .line 66
    iput v0, v4, Lk2/r;->d:I

    .line 67
    .line 68
    iput v0, v4, Lk2/r;->e:I

    .line 69
    .line 70
    :cond_2
    return-void
.end method
