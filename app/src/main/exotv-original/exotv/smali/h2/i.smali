.class public final Lh2/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# static fields
.field public static final M:[B

.field public static final N:Landroidx/media3/common/w;


# instance fields
.field public A:J

.field public B:J

.field public C:Lh2/h;

.field public D:I

.field public E:I

.field public F:I

.field public G:Z

.field public H:Z

.field public I:Ln1/p;

.field public J:[Ln1/i0;

.field public K:[Ln1/i0;

.field public L:Z

.field public final a:Lk2/o;

.field public final b:I

.field public final c:Lh2/q;

.field public final d:Ljava/util/List;

.field public final e:Landroid/util/SparseArray;

.field public final f:Lh1/w;

.field public final g:Lh1/w;

.field public final h:Lh1/w;

.field public final i:[B

.field public final j:Lh1/w;

.field public final k:Lh1/d0;

.field public final l:Ly1/c;

.field public final m:Lh1/w;

.field public final n:Ljava/util/ArrayDeque;

.field public final o:Ljava/util/ArrayDeque;

.field public final p:Li1/s;

.field public final q:Ln1/i0;

.field public r:Lf6/l1;

.field public s:I

.field public t:I

.field public u:J

.field public v:I

.field public w:Lh1/w;

.field public x:J

.field public y:I

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh2/i;->M:[B

    .line 9
    .line 10
    new-instance v0, Landroidx/media3/common/v;

    .line 11
    .line 12
    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v1, Landroidx/media3/common/w;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lh2/i;->N:Landroidx/media3/common/w;

    .line 29
    .line 30
    return-void

    .line 31
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(ILk2/o;)V
    .locals 8

    .line 1
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 2
    sget-object v6, Lf6/l1;->n:Lf6/l1;

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p1

    move-object v2, p2

    .line 3
    invoke-direct/range {v1 .. v7}, Lh2/i;-><init>(Lk2/o;ILh1/d0;Lh2/q;Ljava/util/List;Ln1/i0;)V

    return-void
.end method

.method public constructor <init>(Lk2/o;ILh1/d0;Lh2/q;Ljava/util/List;Ln1/i0;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lh2/i;->a:Lk2/o;

    .line 6
    iput p2, p0, Lh2/i;->b:I

    .line 7
    iput-object p3, p0, Lh2/i;->k:Lh1/d0;

    .line 8
    iput-object p4, p0, Lh2/i;->c:Lh2/q;

    .line 9
    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lh2/i;->d:Ljava/util/List;

    .line 10
    iput-object p6, p0, Lh2/i;->q:Ln1/i0;

    .line 11
    new-instance p1, Ly1/c;

    invoke-direct {p1}, Ly1/c;-><init>()V

    iput-object p1, p0, Lh2/i;->l:Ly1/c;

    .line 12
    new-instance p1, Lh1/w;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lh1/w;-><init>(I)V

    iput-object p1, p0, Lh2/i;->m:Lh1/w;

    .line 13
    new-instance p1, Lh1/w;

    sget-object p3, Li1/p;->a:[B

    invoke-direct {p1, p3}, Lh1/w;-><init>([B)V

    iput-object p1, p0, Lh2/i;->f:Lh1/w;

    .line 14
    new-instance p1, Lh1/w;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lh1/w;-><init>(I)V

    iput-object p1, p0, Lh2/i;->g:Lh1/w;

    .line 15
    new-instance p1, Lh1/w;

    invoke-direct {p1}, Lh1/w;-><init>()V

    iput-object p1, p0, Lh2/i;->h:Lh1/w;

    .line 16
    new-array p1, p2, [B

    iput-object p1, p0, Lh2/i;->i:[B

    .line 17
    new-instance p2, Lh1/w;

    invoke-direct {p2, p1}, Lh1/w;-><init>([B)V

    iput-object p2, p0, Lh2/i;->j:Lh1/w;

    .line 18
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lh2/i;->n:Ljava/util/ArrayDeque;

    .line 19
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lh2/i;->o:Ljava/util/ArrayDeque;

    .line 20
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lh2/i;->e:Landroid/util/SparseArray;

    .line 21
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 22
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 23
    iput-object p1, p0, Lh2/i;->r:Lf6/l1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    iput-wide p1, p0, Lh2/i;->A:J

    .line 25
    iput-wide p1, p0, Lh2/i;->z:J

    .line 26
    iput-wide p1, p0, Lh2/i;->B:J

    .line 27
    sget-object p1, Ln1/p;->i:Lk2/b;

    iput-object p1, p0, Lh2/i;->I:Ln1/p;

    const/4 p1, 0x0

    .line 28
    new-array p2, p1, [Ln1/i0;

    iput-object p2, p0, Lh2/i;->J:[Ln1/i0;

    .line 29
    new-array p1, p1, [Ln1/i0;

    iput-object p1, p0, Lh2/i;->K:[Ln1/i0;

    .line 30
    new-instance p1, Li1/s;

    new-instance p2, Lh2/f;

    invoke-direct {p2, p0}, Lh2/f;-><init>(Lh2/i;)V

    invoke-direct {p1, p2}, Li1/s;-><init>(Li1/r;)V

    iput-object p1, p0, Lh2/i;->p:Li1/s;

    return-void
.end method

.method public static a(Ljava/util/List;)Landroidx/media3/common/s;
    .locals 9

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_4

    .line 10
    .line 11
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Li1/c;

    .line 16
    .line 17
    iget v6, v5, Li1/d;->b:I

    .line 18
    .line 19
    const v7, 0x70737368    # 3.013775E29f

    .line 20
    .line 21
    .line 22
    if-ne v6, v7, :cond_3

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v5, v5, Li1/c;->c:Lh1/w;

    .line 32
    .line 33
    iget-object v5, v5, Lh1/w;->a:[B

    .line 34
    .line 35
    invoke-static {v5}, Lh2/p;->i([B)La4/o;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v6, v6, La4/o;->k:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Ljava/util/UUID;

    .line 46
    .line 47
    :goto_1
    if-nez v6, :cond_2

    .line 48
    .line 49
    const-string v5, "FragmentedMp4Extractor"

    .line 50
    .line 51
    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    .line 52
    .line 53
    invoke-static {v5, v6}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    new-instance v7, Landroidx/media3/common/r;

    .line 58
    .line 59
    const-string v8, "video/mp4"

    .line 60
    .line 61
    invoke-direct {v7, v6, v1, v8, v5}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-nez v4, :cond_5

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_5
    new-instance p0, Landroidx/media3/common/s;

    .line 74
    .line 75
    new-array v0, v2, [Landroidx/media3/common/r;

    .line 76
    .line 77
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, [Landroidx/media3/common/r;

    .line 82
    .line 83
    invoke-direct {p0, v1, v2, v0}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method public static b(Lh1/w;ILh2/s;)V
    .locals 5

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh1/w;->G(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh1/w;->g()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget-object v0, Lh2/d;->a:[B

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v0

    .line 25
    :goto_0
    invoke-virtual {p0}, Lh1/w;->y()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object p0, p2, Lh2/s;->l:[Z

    .line 32
    .line 33
    iget p1, p2, Lh2/s;->e:I

    .line 34
    .line 35
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v3, p2, Lh2/s;->e:I

    .line 40
    .line 41
    iget-object v4, p2, Lh2/s;->n:Lh1/w;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v3, p2, Lh2/s;->l:[Z

    .line 46
    .line 47
    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lh1/w;->a()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v4, p1}, Lh1/w;->D(I)V

    .line 55
    .line 56
    .line 57
    iput-boolean v1, p2, Lh2/s;->k:Z

    .line 58
    .line 59
    iput-boolean v1, p2, Lh2/s;->o:Z

    .line 60
    .line 61
    iget-object p1, v4, Lh1/w;->a:[B

    .line 62
    .line 63
    iget v1, v4, Lh1/w;->c:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, v1}, Lh1/w;->e([BII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Lh1/w;->G(I)V

    .line 69
    .line 70
    .line 71
    iput-boolean v0, p2, Lh2/s;->o:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string p1, "Senc sample count "

    .line 77
    .line 78
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, " is different from fragment sample count"

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget p1, p2, Lh2/s;->e:I

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const/4 p1, 0x0

    .line 99
    invoke-static {p0, p1}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0

    .line 104
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 105
    .line 106
    invoke-static {p0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    throw p0
.end method


# virtual methods
.method public final c(J)V
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Lh2/i;->n:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_5c

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Li1/b;

    .line 16
    .line 17
    iget-wide v4, v2, Li1/b;->c:J

    .line 18
    .line 19
    cmp-long v2, v4, p1

    .line 20
    .line 21
    if-nez v2, :cond_5c

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v4, v2

    .line 28
    check-cast v4, Li1/b;

    .line 29
    .line 30
    iget v2, v4, Li1/d;->b:I

    .line 31
    .line 32
    iget-object v5, v4, Li1/b;->e:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v6, v4, Li1/b;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    const v7, 0x6d6f6f76

    .line 37
    .line 38
    .line 39
    iget v8, v0, Lh2/i;->b:I

    .line 40
    .line 41
    const/16 v10, 0xc

    .line 42
    .line 43
    iget-object v11, v0, Lh2/i;->c:Lh2/q;

    .line 44
    .line 45
    iget-object v15, v0, Lh2/i;->e:Landroid/util/SparseArray;

    .line 46
    .line 47
    if-ne v2, v7, :cond_c

    .line 48
    .line 49
    if-nez v11, :cond_1

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v1, 0x0

    .line 54
    :goto_1
    const-string v2, "Unexpected moov box."

    .line 55
    .line 56
    invoke-static {v2, v1}, Lh1/a;->i(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    move v7, v8

    .line 60
    invoke-static {v6}, Lh2/i;->a(Ljava/util/List;)Landroidx/media3/common/s;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    const v1, 0x6d766578

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v1}, Li1/b;->g(I)Li1/b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v1, v1, Li1/b;->d:Ljava/util/ArrayList;

    .line 75
    .line 76
    new-instance v2, Landroid/util/SparseArray;

    .line 77
    .line 78
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    const/4 v6, 0x0

    .line 86
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    :goto_2
    if-ge v6, v5, :cond_5

    .line 92
    .line 93
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    check-cast v11, Li1/c;

    .line 98
    .line 99
    iget v3, v11, Li1/d;->b:I

    .line 100
    .line 101
    iget-object v11, v11, Li1/c;->c:Lh1/w;

    .line 102
    .line 103
    const/16 v17, 0x1

    .line 104
    .line 105
    const v12, 0x74726578

    .line 106
    .line 107
    .line 108
    if-ne v3, v12, :cond_2

    .line 109
    .line 110
    invoke-virtual {v11, v10}, Lh1/w;->G(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11}, Lh1/w;->g()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-virtual {v11}, Lh1/w;->g()I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    add-int/lit8 v12, v12, -0x1

    .line 122
    .line 123
    invoke-virtual {v11}, Lh1/w;->g()I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    invoke-virtual {v11}, Lh1/w;->g()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    invoke-virtual {v11}, Lh1/w;->g()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    move-object/from16 v18, v1

    .line 140
    .line 141
    new-instance v1, Lh2/e;

    .line 142
    .line 143
    invoke-direct {v1, v12, v10, v9, v11}, Lh2/e;-><init>(IIII)V

    .line 144
    .line 145
    .line 146
    invoke-static {v3, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v3, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Lh2/e;

    .line 161
    .line 162
    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_2
    move-object/from16 v18, v1

    .line 167
    .line 168
    const v1, 0x6d656864

    .line 169
    .line 170
    .line 171
    if-ne v3, v1, :cond_4

    .line 172
    .line 173
    const/16 v1, 0x8

    .line 174
    .line 175
    invoke-virtual {v11, v1}, Lh1/w;->G(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v11}, Lh1/w;->g()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-static {v1}, Lh2/d;->c(I)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_3

    .line 187
    .line 188
    invoke-virtual {v11}, Lh1/w;->w()J

    .line 189
    .line 190
    .line 191
    move-result-wide v9

    .line 192
    goto :goto_3

    .line 193
    :cond_3
    invoke-virtual {v11}, Lh1/w;->z()J

    .line 194
    .line 195
    .line 196
    move-result-wide v9

    .line 197
    :goto_3
    move-wide v13, v9

    .line 198
    :cond_4
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 199
    .line 200
    move-object/from16 v1, v18

    .line 201
    .line 202
    const/16 v10, 0xc

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_5
    const/16 v17, 0x1

    .line 206
    .line 207
    new-instance v5, Ln1/v;

    .line 208
    .line 209
    invoke-direct {v5}, Ln1/v;-><init>()V

    .line 210
    .line 211
    .line 212
    and-int/lit8 v1, v7, 0x10

    .line 213
    .line 214
    if-eqz v1, :cond_6

    .line 215
    .line 216
    move/from16 v9, v17

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_6
    const/4 v9, 0x0

    .line 220
    :goto_5
    new-instance v11, Lh2/f;

    .line 221
    .line 222
    invoke-direct {v11, v0}, Lh2/f;-><init>(Lh2/i;)V

    .line 223
    .line 224
    .line 225
    const/4 v10, 0x0

    .line 226
    move-wide v6, v13

    .line 227
    invoke-static/range {v4 .. v11}, Lh2/d;->g(Li1/b;Ln1/v;JLandroidx/media3/common/s;ZZLe6/d;)Ljava/util/ArrayList;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-nez v4, :cond_9

    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    :goto_6
    if-ge v4, v3, :cond_8

    .line 243
    .line 244
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    check-cast v5, Lh2/t;

    .line 249
    .line 250
    iget-object v6, v5, Lh2/t;->a:Lh2/q;

    .line 251
    .line 252
    new-instance v7, Lh2/h;

    .line 253
    .line 254
    iget-object v8, v0, Lh2/i;->I:Ln1/p;

    .line 255
    .line 256
    iget v9, v6, Lh2/q;->b:I

    .line 257
    .line 258
    iget v10, v6, Lh2/q;->a:I

    .line 259
    .line 260
    invoke-interface {v8, v4, v9}, Ln1/p;->track(II)Ln1/i0;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    move/from16 v11, v17

    .line 269
    .line 270
    if-ne v9, v11, :cond_7

    .line 271
    .line 272
    const/4 v9, 0x0

    .line 273
    invoke-virtual {v2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v11

    .line 277
    check-cast v11, Lh2/e;

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_7
    invoke-virtual {v2, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    move-object v11, v9

    .line 285
    check-cast v11, Lh2/e;

    .line 286
    .line 287
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    :goto_7
    invoke-direct {v7, v8, v5, v11}, Lh2/h;-><init>(Ln1/i0;Lh2/t;Lh2/e;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v15, v10, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    iget-wide v7, v0, Lh2/i;->A:J

    .line 297
    .line 298
    iget-wide v5, v6, Lh2/q;->e:J

    .line 299
    .line 300
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 301
    .line 302
    .line 303
    move-result-wide v5

    .line 304
    iput-wide v5, v0, Lh2/i;->A:J

    .line 305
    .line 306
    add-int/lit8 v4, v4, 0x1

    .line 307
    .line 308
    const/16 v17, 0x1

    .line 309
    .line 310
    goto :goto_6

    .line 311
    :cond_8
    iget-object v1, v0, Lh2/i;->I:Ln1/p;

    .line 312
    .line 313
    invoke-interface {v1}, Ln1/p;->endTracks()V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_9
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    if-ne v4, v3, :cond_a

    .line 323
    .line 324
    const/4 v4, 0x1

    .line 325
    goto :goto_8

    .line 326
    :cond_a
    const/4 v4, 0x0

    .line 327
    :goto_8
    invoke-static {v4}, Lh1/a;->j(Z)V

    .line 328
    .line 329
    .line 330
    const/4 v4, 0x0

    .line 331
    :goto_9
    if-ge v4, v3, :cond_0

    .line 332
    .line 333
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    check-cast v5, Lh2/t;

    .line 338
    .line 339
    iget-object v6, v5, Lh2/t;->a:Lh2/q;

    .line 340
    .line 341
    iget v7, v6, Lh2/q;->a:I

    .line 342
    .line 343
    invoke-virtual {v15, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    check-cast v7, Lh2/h;

    .line 348
    .line 349
    iget v6, v6, Lh2/q;->a:I

    .line 350
    .line 351
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 352
    .line 353
    .line 354
    move-result v8

    .line 355
    const/4 v11, 0x1

    .line 356
    if-ne v8, v11, :cond_b

    .line 357
    .line 358
    const/4 v9, 0x0

    .line 359
    invoke-virtual {v2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    check-cast v6, Lh2/e;

    .line 364
    .line 365
    goto :goto_a

    .line 366
    :cond_b
    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    check-cast v6, Lh2/e;

    .line 371
    .line 372
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    :goto_a
    iput-object v5, v7, Lh2/h;->d:Lh2/t;

    .line 376
    .line 377
    iput-object v6, v7, Lh2/h;->e:Lh2/e;

    .line 378
    .line 379
    iget-object v6, v7, Lh2/h;->a:Ln1/i0;

    .line 380
    .line 381
    iget-object v5, v5, Lh2/t;->a:Lh2/q;

    .line 382
    .line 383
    iget-object v5, v5, Lh2/q;->g:Landroidx/media3/common/w;

    .line 384
    .line 385
    invoke-interface {v6, v5}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v7}, Lh2/h;->e()V

    .line 389
    .line 390
    .line 391
    add-int/lit8 v4, v4, 0x1

    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_c
    move v7, v8

    .line 395
    const v3, 0x6d6f6f66

    .line 396
    .line 397
    .line 398
    if-ne v2, v3, :cond_5b

    .line 399
    .line 400
    if-eqz v11, :cond_d

    .line 401
    .line 402
    const/4 v11, 0x1

    .line 403
    goto :goto_b

    .line 404
    :cond_d
    const/4 v11, 0x0

    .line 405
    :goto_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    const/4 v9, 0x0

    .line 410
    :goto_c
    if-ge v9, v1, :cond_54

    .line 411
    .line 412
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    check-cast v3, Li1/b;

    .line 417
    .line 418
    iget v4, v3, Li1/d;->b:I

    .line 419
    .line 420
    const v8, 0x74726166

    .line 421
    .line 422
    .line 423
    if-ne v4, v8, :cond_53

    .line 424
    .line 425
    const v4, 0x74666864

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3, v4}, Li1/b;->h(I)Li1/c;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    iget-object v8, v3, Li1/b;->d:Ljava/util/ArrayList;

    .line 433
    .line 434
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    iget-object v4, v4, Li1/c;->c:Lh1/w;

    .line 438
    .line 439
    const/16 v10, 0x8

    .line 440
    .line 441
    invoke-virtual {v4, v10}, Lh1/w;->G(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 445
    .line 446
    .line 447
    move-result v10

    .line 448
    sget-object v12, Lh2/d;->a:[B

    .line 449
    .line 450
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 451
    .line 452
    .line 453
    move-result v12

    .line 454
    if-eqz v11, :cond_e

    .line 455
    .line 456
    const/4 v13, 0x0

    .line 457
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    invoke-virtual {v15, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v12

    .line 466
    :goto_d
    check-cast v12, Lh2/h;

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_e
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    invoke-virtual {v15, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v12

    .line 478
    goto :goto_d

    .line 479
    :goto_e
    if-nez v12, :cond_f

    .line 480
    .line 481
    move/from16 v22, v1

    .line 482
    .line 483
    move-object/from16 v20, v3

    .line 484
    .line 485
    const/4 v12, 0x0

    .line 486
    goto :goto_13

    .line 487
    :cond_f
    iget-object v13, v12, Lh2/h;->b:Lh2/s;

    .line 488
    .line 489
    and-int/lit8 v14, v10, 0x1

    .line 490
    .line 491
    move-object/from16 v20, v3

    .line 492
    .line 493
    if-eqz v14, :cond_10

    .line 494
    .line 495
    invoke-virtual {v4}, Lh1/w;->z()J

    .line 496
    .line 497
    .line 498
    move-result-wide v2

    .line 499
    iput-wide v2, v13, Lh2/s;->b:J

    .line 500
    .line 501
    iput-wide v2, v13, Lh2/s;->c:J

    .line 502
    .line 503
    :cond_10
    iget-object v2, v12, Lh2/h;->e:Lh2/e;

    .line 504
    .line 505
    and-int/lit8 v3, v10, 0x2

    .line 506
    .line 507
    if-eqz v3, :cond_11

    .line 508
    .line 509
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    const/16 v17, 0x1

    .line 514
    .line 515
    add-int/lit8 v3, v3, -0x1

    .line 516
    .line 517
    goto :goto_f

    .line 518
    :cond_11
    iget v3, v2, Lh2/e;->a:I

    .line 519
    .line 520
    :goto_f
    and-int/lit8 v21, v10, 0x8

    .line 521
    .line 522
    if-eqz v21, :cond_12

    .line 523
    .line 524
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 525
    .line 526
    .line 527
    move-result v21

    .line 528
    move/from16 v14, v21

    .line 529
    .line 530
    goto :goto_10

    .line 531
    :cond_12
    iget v14, v2, Lh2/e;->b:I

    .line 532
    .line 533
    :goto_10
    and-int/lit8 v22, v10, 0x10

    .line 534
    .line 535
    if-eqz v22, :cond_13

    .line 536
    .line 537
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 538
    .line 539
    .line 540
    move-result v22

    .line 541
    move/from16 v52, v22

    .line 542
    .line 543
    move/from16 v22, v1

    .line 544
    .line 545
    move/from16 v1, v52

    .line 546
    .line 547
    goto :goto_11

    .line 548
    :cond_13
    move/from16 v22, v1

    .line 549
    .line 550
    iget v1, v2, Lh2/e;->c:I

    .line 551
    .line 552
    :goto_11
    and-int/lit8 v10, v10, 0x20

    .line 553
    .line 554
    if-eqz v10, :cond_14

    .line 555
    .line 556
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    goto :goto_12

    .line 561
    :cond_14
    iget v2, v2, Lh2/e;->d:I

    .line 562
    .line 563
    :goto_12
    new-instance v4, Lh2/e;

    .line 564
    .line 565
    invoke-direct {v4, v3, v14, v1, v2}, Lh2/e;-><init>(IIII)V

    .line 566
    .line 567
    .line 568
    iput-object v4, v13, Lh2/s;->a:Lh2/e;

    .line 569
    .line 570
    :goto_13
    if-nez v12, :cond_16

    .line 571
    .line 572
    move-object/from16 v20, v5

    .line 573
    .line 574
    move-object/from16 v48, v6

    .line 575
    .line 576
    move/from16 v49, v7

    .line 577
    .line 578
    const/16 v7, 0xc

    .line 579
    .line 580
    const/4 v10, 0x1

    .line 581
    :cond_15
    const/16 v13, 0x8

    .line 582
    .line 583
    goto/16 :goto_3d

    .line 584
    .line 585
    :cond_16
    iget-object v1, v12, Lh2/h;->b:Lh2/s;

    .line 586
    .line 587
    iget-wide v2, v1, Lh2/s;->p:J

    .line 588
    .line 589
    iget-boolean v4, v1, Lh2/s;->q:Z

    .line 590
    .line 591
    invoke-virtual {v12}, Lh2/h;->e()V

    .line 592
    .line 593
    .line 594
    const/4 v10, 0x1

    .line 595
    iput-boolean v10, v12, Lh2/h;->l:Z

    .line 596
    .line 597
    const v13, 0x74666474

    .line 598
    .line 599
    .line 600
    move-object/from16 v14, v20

    .line 601
    .line 602
    invoke-virtual {v14, v13}, Li1/b;->h(I)Li1/c;

    .line 603
    .line 604
    .line 605
    move-result-object v13

    .line 606
    if-eqz v13, :cond_18

    .line 607
    .line 608
    and-int/lit8 v17, v7, 0x2

    .line 609
    .line 610
    if-nez v17, :cond_18

    .line 611
    .line 612
    iget-object v2, v13, Li1/c;->c:Lh1/w;

    .line 613
    .line 614
    const/16 v3, 0x8

    .line 615
    .line 616
    invoke-virtual {v2, v3}, Lh1/w;->G(I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 620
    .line 621
    .line 622
    move-result v3

    .line 623
    invoke-static {v3}, Lh2/d;->c(I)I

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    if-ne v3, v10, :cond_17

    .line 628
    .line 629
    invoke-virtual {v2}, Lh1/w;->z()J

    .line 630
    .line 631
    .line 632
    move-result-wide v2

    .line 633
    goto :goto_14

    .line 634
    :cond_17
    invoke-virtual {v2}, Lh1/w;->w()J

    .line 635
    .line 636
    .line 637
    move-result-wide v2

    .line 638
    :goto_14
    iput-wide v2, v1, Lh2/s;->p:J

    .line 639
    .line 640
    iput-boolean v10, v1, Lh2/s;->q:Z

    .line 641
    .line 642
    goto :goto_15

    .line 643
    :cond_18
    iput-wide v2, v1, Lh2/s;->p:J

    .line 644
    .line 645
    iput-boolean v4, v1, Lh2/s;->q:Z

    .line 646
    .line 647
    :goto_15
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    const/4 v3, 0x0

    .line 652
    const/4 v4, 0x0

    .line 653
    const/4 v10, 0x0

    .line 654
    :goto_16
    const v13, 0x7472756e

    .line 655
    .line 656
    .line 657
    if-ge v3, v2, :cond_1a

    .line 658
    .line 659
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v20

    .line 663
    move/from16 v23, v3

    .line 664
    .line 665
    move-object/from16 v3, v20

    .line 666
    .line 667
    check-cast v3, Li1/c;

    .line 668
    .line 669
    move-object/from16 v20, v5

    .line 670
    .line 671
    iget v5, v3, Li1/d;->b:I

    .line 672
    .line 673
    if-ne v5, v13, :cond_19

    .line 674
    .line 675
    iget-object v3, v3, Li1/c;->c:Lh1/w;

    .line 676
    .line 677
    const/16 v5, 0xc

    .line 678
    .line 679
    invoke-virtual {v3, v5}, Lh1/w;->G(I)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v3}, Lh1/w;->y()I

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    if-lez v3, :cond_19

    .line 687
    .line 688
    add-int/2addr v10, v3

    .line 689
    add-int/lit8 v4, v4, 0x1

    .line 690
    .line 691
    :cond_19
    add-int/lit8 v3, v23, 0x1

    .line 692
    .line 693
    move-object/from16 v5, v20

    .line 694
    .line 695
    goto :goto_16

    .line 696
    :cond_1a
    move-object/from16 v20, v5

    .line 697
    .line 698
    const/4 v3, 0x0

    .line 699
    iput v3, v12, Lh2/h;->h:I

    .line 700
    .line 701
    iput v3, v12, Lh2/h;->g:I

    .line 702
    .line 703
    iput v3, v12, Lh2/h;->f:I

    .line 704
    .line 705
    iput v4, v1, Lh2/s;->d:I

    .line 706
    .line 707
    iput v10, v1, Lh2/s;->e:I

    .line 708
    .line 709
    iget-object v3, v1, Lh2/s;->g:[I

    .line 710
    .line 711
    array-length v3, v3

    .line 712
    if-ge v3, v4, :cond_1b

    .line 713
    .line 714
    new-array v3, v4, [J

    .line 715
    .line 716
    iput-object v3, v1, Lh2/s;->f:[J

    .line 717
    .line 718
    new-array v3, v4, [I

    .line 719
    .line 720
    iput-object v3, v1, Lh2/s;->g:[I

    .line 721
    .line 722
    :cond_1b
    iget-object v3, v1, Lh2/s;->h:[I

    .line 723
    .line 724
    array-length v3, v3

    .line 725
    if-ge v3, v10, :cond_1c

    .line 726
    .line 727
    mul-int/lit8 v10, v10, 0x7d

    .line 728
    .line 729
    div-int/lit8 v10, v10, 0x64

    .line 730
    .line 731
    new-array v3, v10, [I

    .line 732
    .line 733
    iput-object v3, v1, Lh2/s;->h:[I

    .line 734
    .line 735
    new-array v3, v10, [J

    .line 736
    .line 737
    iput-object v3, v1, Lh2/s;->i:[J

    .line 738
    .line 739
    new-array v3, v10, [Z

    .line 740
    .line 741
    iput-object v3, v1, Lh2/s;->j:[Z

    .line 742
    .line 743
    new-array v3, v10, [Z

    .line 744
    .line 745
    iput-object v3, v1, Lh2/s;->l:[Z

    .line 746
    .line 747
    :cond_1c
    const/4 v3, 0x0

    .line 748
    const/4 v4, 0x0

    .line 749
    const/4 v5, 0x0

    .line 750
    :goto_17
    const-wide/16 v23, 0x0

    .line 751
    .line 752
    const/16 v25, 0x10

    .line 753
    .line 754
    if-ge v3, v2, :cond_34

    .line 755
    .line 756
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v26

    .line 760
    move-object/from16 v10, v26

    .line 761
    .line 762
    check-cast v10, Li1/c;

    .line 763
    .line 764
    move/from16 v26, v2

    .line 765
    .line 766
    iget v2, v10, Li1/d;->b:I

    .line 767
    .line 768
    if-ne v2, v13, :cond_33

    .line 769
    .line 770
    add-int/lit8 v2, v4, 0x1

    .line 771
    .line 772
    iget-object v10, v10, Li1/c;->c:Lh1/w;

    .line 773
    .line 774
    const/16 v13, 0x8

    .line 775
    .line 776
    invoke-virtual {v10, v13}, Lh1/w;->G(I)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 780
    .line 781
    .line 782
    move-result v13

    .line 783
    sget-object v29, Lh2/d;->a:[B

    .line 784
    .line 785
    move/from16 v29, v2

    .line 786
    .line 787
    iget-object v2, v12, Lh2/h;->d:Lh2/t;

    .line 788
    .line 789
    iget-object v2, v2, Lh2/t;->a:Lh2/q;

    .line 790
    .line 791
    move/from16 v30, v3

    .line 792
    .line 793
    iget-object v3, v1, Lh2/s;->a:Lh2/e;

    .line 794
    .line 795
    sget v31, Lh1/i0;->a:I

    .line 796
    .line 797
    move/from16 v31, v4

    .line 798
    .line 799
    iget-object v4, v1, Lh2/s;->g:[I

    .line 800
    .line 801
    invoke-virtual {v10}, Lh1/w;->y()I

    .line 802
    .line 803
    .line 804
    move-result v32

    .line 805
    aput v32, v4, v31

    .line 806
    .line 807
    iget-object v4, v1, Lh2/s;->f:[J

    .line 808
    .line 809
    move-object/from16 v33, v4

    .line 810
    .line 811
    move/from16 v32, v5

    .line 812
    .line 813
    iget-wide v4, v1, Lh2/s;->b:J

    .line 814
    .line 815
    aput-wide v4, v33, v31

    .line 816
    .line 817
    and-int/lit8 v34, v13, 0x1

    .line 818
    .line 819
    if-eqz v34, :cond_1d

    .line 820
    .line 821
    move-wide/from16 v34, v4

    .line 822
    .line 823
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 824
    .line 825
    .line 826
    move-result v4

    .line 827
    int-to-long v4, v4

    .line 828
    add-long v4, v34, v4

    .line 829
    .line 830
    aput-wide v4, v33, v31

    .line 831
    .line 832
    :cond_1d
    and-int/lit8 v4, v13, 0x4

    .line 833
    .line 834
    if-eqz v4, :cond_1e

    .line 835
    .line 836
    const/4 v4, 0x1

    .line 837
    goto :goto_18

    .line 838
    :cond_1e
    const/4 v4, 0x0

    .line 839
    :goto_18
    iget v5, v3, Lh2/e;->d:I

    .line 840
    .line 841
    if-eqz v4, :cond_1f

    .line 842
    .line 843
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 844
    .line 845
    .line 846
    move-result v5

    .line 847
    :cond_1f
    move/from16 v33, v4

    .line 848
    .line 849
    and-int/lit16 v4, v13, 0x100

    .line 850
    .line 851
    if-eqz v4, :cond_20

    .line 852
    .line 853
    const/4 v4, 0x1

    .line 854
    goto :goto_19

    .line 855
    :cond_20
    const/4 v4, 0x0

    .line 856
    :goto_19
    move/from16 v34, v4

    .line 857
    .line 858
    and-int/lit16 v4, v13, 0x200

    .line 859
    .line 860
    if-eqz v4, :cond_21

    .line 861
    .line 862
    const/4 v4, 0x1

    .line 863
    goto :goto_1a

    .line 864
    :cond_21
    const/4 v4, 0x0

    .line 865
    :goto_1a
    move/from16 v35, v4

    .line 866
    .line 867
    and-int/lit16 v4, v13, 0x400

    .line 868
    .line 869
    if-eqz v4, :cond_22

    .line 870
    .line 871
    const/4 v4, 0x1

    .line 872
    goto :goto_1b

    .line 873
    :cond_22
    const/4 v4, 0x0

    .line 874
    :goto_1b
    and-int/lit16 v13, v13, 0x800

    .line 875
    .line 876
    if-eqz v13, :cond_23

    .line 877
    .line 878
    const/4 v13, 0x1

    .line 879
    :goto_1c
    move/from16 v36, v4

    .line 880
    .line 881
    goto :goto_1d

    .line 882
    :cond_23
    const/4 v13, 0x0

    .line 883
    goto :goto_1c

    .line 884
    :goto_1d
    iget-object v4, v2, Lh2/q;->i:[J

    .line 885
    .line 886
    move/from16 v37, v5

    .line 887
    .line 888
    iget-object v5, v2, Lh2/q;->j:[J

    .line 889
    .line 890
    if-eqz v4, :cond_26

    .line 891
    .line 892
    move-object/from16 v38, v5

    .line 893
    .line 894
    array-length v5, v4

    .line 895
    move-object/from16 v39, v4

    .line 896
    .line 897
    const/4 v4, 0x1

    .line 898
    if-ne v5, v4, :cond_26

    .line 899
    .line 900
    if-nez v38, :cond_24

    .line 901
    .line 902
    goto :goto_1f

    .line 903
    :cond_24
    const/16 v16, 0x0

    .line 904
    .line 905
    aget-wide v40, v39, v16

    .line 906
    .line 907
    cmp-long v4, v40, v23

    .line 908
    .line 909
    if-nez v4, :cond_25

    .line 910
    .line 911
    goto :goto_1e

    .line 912
    :cond_25
    iget-wide v4, v2, Lh2/q;->d:J

    .line 913
    .line 914
    sget-object v46, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 915
    .line 916
    const-wide/32 v42, 0xf4240

    .line 917
    .line 918
    .line 919
    move-wide/from16 v44, v4

    .line 920
    .line 921
    invoke-static/range {v40 .. v46}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 922
    .line 923
    .line 924
    move-result-wide v4

    .line 925
    aget-wide v42, v38, v16

    .line 926
    .line 927
    const-wide/32 v44, 0xf4240

    .line 928
    .line 929
    .line 930
    move-wide/from16 v39, v4

    .line 931
    .line 932
    iget-wide v4, v2, Lh2/q;->c:J

    .line 933
    .line 934
    move-object/from16 v48, v46

    .line 935
    .line 936
    move-wide/from16 v46, v4

    .line 937
    .line 938
    invoke-static/range {v42 .. v48}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 939
    .line 940
    .line 941
    move-result-wide v4

    .line 942
    add-long v4, v39, v4

    .line 943
    .line 944
    move-wide/from16 v39, v4

    .line 945
    .line 946
    iget-wide v4, v2, Lh2/q;->e:J

    .line 947
    .line 948
    cmp-long v4, v39, v4

    .line 949
    .line 950
    if-ltz v4, :cond_26

    .line 951
    .line 952
    :goto_1e
    aget-wide v23, v38, v16

    .line 953
    .line 954
    :cond_26
    :goto_1f
    iget-object v4, v1, Lh2/s;->h:[I

    .line 955
    .line 956
    iget-object v5, v1, Lh2/s;->i:[J

    .line 957
    .line 958
    move-object/from16 v38, v4

    .line 959
    .line 960
    iget-object v4, v1, Lh2/s;->j:[Z

    .line 961
    .line 962
    move-object/from16 v39, v4

    .line 963
    .line 964
    iget v4, v2, Lh2/q;->b:I

    .line 965
    .line 966
    move-object/from16 v40, v5

    .line 967
    .line 968
    const/4 v5, 0x2

    .line 969
    if-ne v4, v5, :cond_27

    .line 970
    .line 971
    and-int/lit8 v4, v7, 0x1

    .line 972
    .line 973
    if-eqz v4, :cond_27

    .line 974
    .line 975
    const/4 v4, 0x1

    .line 976
    goto :goto_20

    .line 977
    :cond_27
    const/4 v4, 0x0

    .line 978
    :goto_20
    iget-object v5, v1, Lh2/s;->g:[I

    .line 979
    .line 980
    aget v5, v5, v31

    .line 981
    .line 982
    add-int v5, v32, v5

    .line 983
    .line 984
    move-object/from16 v48, v6

    .line 985
    .line 986
    move/from16 v49, v7

    .line 987
    .line 988
    iget-wide v6, v2, Lh2/q;->c:J

    .line 989
    .line 990
    move-wide/from16 v45, v6

    .line 991
    .line 992
    iget-wide v6, v1, Lh2/s;->p:J

    .line 993
    .line 994
    move/from16 v2, v32

    .line 995
    .line 996
    :goto_21
    if-ge v2, v5, :cond_32

    .line 997
    .line 998
    if-eqz v34, :cond_28

    .line 999
    .line 1000
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 1001
    .line 1002
    .line 1003
    move-result v27

    .line 1004
    move/from16 v50, v27

    .line 1005
    .line 1006
    move/from16 v27, v2

    .line 1007
    .line 1008
    move/from16 v2, v50

    .line 1009
    .line 1010
    :goto_22
    move/from16 v50, v4

    .line 1011
    .line 1012
    goto :goto_23

    .line 1013
    :cond_28
    move/from16 v27, v2

    .line 1014
    .line 1015
    iget v2, v3, Lh2/e;->b:I

    .line 1016
    .line 1017
    goto :goto_22

    .line 1018
    :goto_23
    const-string v4, "Unexpected negative value: "

    .line 1019
    .line 1020
    if-ltz v2, :cond_31

    .line 1021
    .line 1022
    if-eqz v35, :cond_29

    .line 1023
    .line 1024
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 1025
    .line 1026
    .line 1027
    move-result v31

    .line 1028
    move/from16 v52, v31

    .line 1029
    .line 1030
    move/from16 v31, v5

    .line 1031
    .line 1032
    move/from16 v5, v52

    .line 1033
    .line 1034
    goto :goto_24

    .line 1035
    :cond_29
    move/from16 v31, v5

    .line 1036
    .line 1037
    iget v5, v3, Lh2/e;->c:I

    .line 1038
    .line 1039
    :goto_24
    if-ltz v5, :cond_30

    .line 1040
    .line 1041
    if-eqz v36, :cond_2a

    .line 1042
    .line 1043
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 1044
    .line 1045
    .line 1046
    move-result v4

    .line 1047
    goto :goto_25

    .line 1048
    :cond_2a
    if-nez v27, :cond_2b

    .line 1049
    .line 1050
    if-eqz v33, :cond_2b

    .line 1051
    .line 1052
    move/from16 v4, v37

    .line 1053
    .line 1054
    goto :goto_25

    .line 1055
    :cond_2b
    iget v4, v3, Lh2/e;->d:I

    .line 1056
    .line 1057
    :goto_25
    if-eqz v13, :cond_2c

    .line 1058
    .line 1059
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 1060
    .line 1061
    .line 1062
    move-result v32

    .line 1063
    move-object/from16 v51, v3

    .line 1064
    .line 1065
    move/from16 v3, v32

    .line 1066
    .line 1067
    :goto_26
    move/from16 v32, v4

    .line 1068
    .line 1069
    goto :goto_27

    .line 1070
    :cond_2c
    move-object/from16 v51, v3

    .line 1071
    .line 1072
    const/4 v3, 0x0

    .line 1073
    goto :goto_26

    .line 1074
    :goto_27
    int-to-long v3, v3

    .line 1075
    add-long/2addr v3, v6

    .line 1076
    sub-long v41, v3, v23

    .line 1077
    .line 1078
    const-wide/32 v43, 0xf4240

    .line 1079
    .line 1080
    .line 1081
    sget-object v47, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1082
    .line 1083
    invoke-static/range {v41 .. v47}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1084
    .line 1085
    .line 1086
    move-result-wide v3

    .line 1087
    aput-wide v3, v40, v27

    .line 1088
    .line 1089
    move-wide/from16 v41, v3

    .line 1090
    .line 1091
    iget-boolean v3, v1, Lh2/s;->q:Z

    .line 1092
    .line 1093
    if-nez v3, :cond_2d

    .line 1094
    .line 1095
    iget-object v3, v12, Lh2/h;->d:Lh2/t;

    .line 1096
    .line 1097
    iget-wide v3, v3, Lh2/t;->h:J

    .line 1098
    .line 1099
    add-long v3, v41, v3

    .line 1100
    .line 1101
    aput-wide v3, v40, v27

    .line 1102
    .line 1103
    :cond_2d
    aput v5, v38, v27

    .line 1104
    .line 1105
    shr-int/lit8 v3, v32, 0x10

    .line 1106
    .line 1107
    const/16 v17, 0x1

    .line 1108
    .line 1109
    and-int/lit8 v3, v3, 0x1

    .line 1110
    .line 1111
    if-nez v3, :cond_2f

    .line 1112
    .line 1113
    if-eqz v50, :cond_2e

    .line 1114
    .line 1115
    if-nez v27, :cond_2f

    .line 1116
    .line 1117
    :cond_2e
    const/4 v3, 0x1

    .line 1118
    goto :goto_28

    .line 1119
    :cond_2f
    const/4 v3, 0x0

    .line 1120
    :goto_28
    aput-boolean v3, v39, v27

    .line 1121
    .line 1122
    int-to-long v2, v2

    .line 1123
    add-long/2addr v6, v2

    .line 1124
    add-int/lit8 v2, v27, 0x1

    .line 1125
    .line 1126
    move/from16 v5, v31

    .line 1127
    .line 1128
    move/from16 v4, v50

    .line 1129
    .line 1130
    move-object/from16 v3, v51

    .line 1131
    .line 1132
    goto/16 :goto_21

    .line 1133
    .line 1134
    :cond_30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    const/4 v14, 0x0

    .line 1147
    invoke-static {v1, v14}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    throw v1

    .line 1152
    :cond_31
    const/4 v14, 0x0

    .line 1153
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1154
    .line 1155
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    invoke-static {v1, v14}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    throw v1

    .line 1170
    :cond_32
    move/from16 v31, v5

    .line 1171
    .line 1172
    move-object v3, v14

    .line 1173
    iput-wide v6, v1, Lh2/s;->p:J

    .line 1174
    .line 1175
    move/from16 v4, v29

    .line 1176
    .line 1177
    goto :goto_29

    .line 1178
    :cond_33
    move/from16 v30, v3

    .line 1179
    .line 1180
    move/from16 v31, v4

    .line 1181
    .line 1182
    move/from16 v32, v5

    .line 1183
    .line 1184
    move-object/from16 v48, v6

    .line 1185
    .line 1186
    move/from16 v49, v7

    .line 1187
    .line 1188
    move-object v3, v14

    .line 1189
    :goto_29
    add-int/lit8 v2, v30, 0x1

    .line 1190
    .line 1191
    move-object v14, v3

    .line 1192
    move-object/from16 v6, v48

    .line 1193
    .line 1194
    move/from16 v7, v49

    .line 1195
    .line 1196
    const v13, 0x7472756e

    .line 1197
    .line 1198
    .line 1199
    move v3, v2

    .line 1200
    move/from16 v2, v26

    .line 1201
    .line 1202
    goto/16 :goto_17

    .line 1203
    .line 1204
    :cond_34
    move-object/from16 v48, v6

    .line 1205
    .line 1206
    move/from16 v49, v7

    .line 1207
    .line 1208
    move-object v3, v14

    .line 1209
    iget-object v2, v12, Lh2/h;->d:Lh2/t;

    .line 1210
    .line 1211
    iget-object v2, v2, Lh2/t;->a:Lh2/q;

    .line 1212
    .line 1213
    iget-object v4, v1, Lh2/s;->a:Lh2/e;

    .line 1214
    .line 1215
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    iget v4, v4, Lh2/e;->a:I

    .line 1219
    .line 1220
    iget-object v2, v2, Lh2/q;->l:[Lh2/r;

    .line 1221
    .line 1222
    if-nez v2, :cond_35

    .line 1223
    .line 1224
    const/4 v2, 0x0

    .line 1225
    goto :goto_2a

    .line 1226
    :cond_35
    aget-object v2, v2, v4

    .line 1227
    .line 1228
    :goto_2a
    const v4, 0x7361697a

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v3, v4}, Li1/b;->h(I)Li1/c;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v4

    .line 1235
    if-eqz v4, :cond_3c

    .line 1236
    .line 1237
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1238
    .line 1239
    .line 1240
    iget-object v4, v4, Li1/c;->c:Lh1/w;

    .line 1241
    .line 1242
    iget v5, v2, Lh2/r;->d:I

    .line 1243
    .line 1244
    const/16 v13, 0x8

    .line 1245
    .line 1246
    invoke-virtual {v4, v13}, Lh1/w;->G(I)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 1250
    .line 1251
    .line 1252
    move-result v6

    .line 1253
    sget-object v7, Lh2/d;->a:[B

    .line 1254
    .line 1255
    const/4 v10, 0x1

    .line 1256
    and-int/2addr v6, v10

    .line 1257
    if-ne v6, v10, :cond_36

    .line 1258
    .line 1259
    invoke-virtual {v4, v13}, Lh1/w;->H(I)V

    .line 1260
    .line 1261
    .line 1262
    :cond_36
    invoke-virtual {v4}, Lh1/w;->u()I

    .line 1263
    .line 1264
    .line 1265
    move-result v6

    .line 1266
    invoke-virtual {v4}, Lh1/w;->y()I

    .line 1267
    .line 1268
    .line 1269
    move-result v7

    .line 1270
    iget v10, v1, Lh2/s;->e:I

    .line 1271
    .line 1272
    if-gt v7, v10, :cond_3b

    .line 1273
    .line 1274
    if-nez v6, :cond_39

    .line 1275
    .line 1276
    iget-object v6, v1, Lh2/s;->l:[Z

    .line 1277
    .line 1278
    const/4 v10, 0x0

    .line 1279
    const/4 v12, 0x0

    .line 1280
    :goto_2b
    if-ge v10, v7, :cond_38

    .line 1281
    .line 1282
    invoke-virtual {v4}, Lh1/w;->u()I

    .line 1283
    .line 1284
    .line 1285
    move-result v13

    .line 1286
    add-int/2addr v12, v13

    .line 1287
    if-le v13, v5, :cond_37

    .line 1288
    .line 1289
    const/4 v13, 0x1

    .line 1290
    goto :goto_2c

    .line 1291
    :cond_37
    const/4 v13, 0x0

    .line 1292
    :goto_2c
    aput-boolean v13, v6, v10

    .line 1293
    .line 1294
    add-int/lit8 v10, v10, 0x1

    .line 1295
    .line 1296
    goto :goto_2b

    .line 1297
    :cond_38
    const/4 v13, 0x0

    .line 1298
    goto :goto_2e

    .line 1299
    :cond_39
    if-le v6, v5, :cond_3a

    .line 1300
    .line 1301
    const/4 v4, 0x1

    .line 1302
    goto :goto_2d

    .line 1303
    :cond_3a
    const/4 v4, 0x0

    .line 1304
    :goto_2d
    mul-int v12, v6, v7

    .line 1305
    .line 1306
    iget-object v5, v1, Lh2/s;->l:[Z

    .line 1307
    .line 1308
    const/4 v13, 0x0

    .line 1309
    invoke-static {v5, v13, v7, v4}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1310
    .line 1311
    .line 1312
    :goto_2e
    iget-object v4, v1, Lh2/s;->l:[Z

    .line 1313
    .line 1314
    iget v5, v1, Lh2/s;->e:I

    .line 1315
    .line 1316
    invoke-static {v4, v7, v5, v13}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1317
    .line 1318
    .line 1319
    if-lez v12, :cond_3c

    .line 1320
    .line 1321
    iget-object v4, v1, Lh2/s;->n:Lh1/w;

    .line 1322
    .line 1323
    invoke-virtual {v4, v12}, Lh1/w;->D(I)V

    .line 1324
    .line 1325
    .line 1326
    const/4 v10, 0x1

    .line 1327
    iput-boolean v10, v1, Lh2/s;->k:Z

    .line 1328
    .line 1329
    iput-boolean v10, v1, Lh2/s;->o:Z

    .line 1330
    .line 1331
    goto :goto_2f

    .line 1332
    :cond_3b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1333
    .line 1334
    const-string v3, "Saiz sample count "

    .line 1335
    .line 1336
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1340
    .line 1341
    .line 1342
    const-string v3, " is greater than fragment sample count"

    .line 1343
    .line 1344
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1345
    .line 1346
    .line 1347
    iget v1, v1, Lh2/s;->e:I

    .line 1348
    .line 1349
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v1

    .line 1356
    const/4 v14, 0x0

    .line 1357
    invoke-static {v1, v14}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v1

    .line 1361
    throw v1

    .line 1362
    :cond_3c
    :goto_2f
    const v4, 0x7361696f

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v3, v4}, Li1/b;->h(I)Li1/c;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v4

    .line 1369
    if-eqz v4, :cond_3f

    .line 1370
    .line 1371
    iget-object v4, v4, Li1/c;->c:Lh1/w;

    .line 1372
    .line 1373
    const/16 v13, 0x8

    .line 1374
    .line 1375
    invoke-virtual {v4, v13}, Lh1/w;->G(I)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 1379
    .line 1380
    .line 1381
    move-result v5

    .line 1382
    sget-object v6, Lh2/d;->a:[B

    .line 1383
    .line 1384
    and-int/lit8 v6, v5, 0x1

    .line 1385
    .line 1386
    const/4 v10, 0x1

    .line 1387
    if-ne v6, v10, :cond_3d

    .line 1388
    .line 1389
    invoke-virtual {v4, v13}, Lh1/w;->H(I)V

    .line 1390
    .line 1391
    .line 1392
    :cond_3d
    invoke-virtual {v4}, Lh1/w;->y()I

    .line 1393
    .line 1394
    .line 1395
    move-result v6

    .line 1396
    if-ne v6, v10, :cond_40

    .line 1397
    .line 1398
    invoke-static {v5}, Lh2/d;->c(I)I

    .line 1399
    .line 1400
    .line 1401
    move-result v5

    .line 1402
    iget-wide v6, v1, Lh2/s;->c:J

    .line 1403
    .line 1404
    if-nez v5, :cond_3e

    .line 1405
    .line 1406
    invoke-virtual {v4}, Lh1/w;->w()J

    .line 1407
    .line 1408
    .line 1409
    move-result-wide v4

    .line 1410
    goto :goto_30

    .line 1411
    :cond_3e
    invoke-virtual {v4}, Lh1/w;->z()J

    .line 1412
    .line 1413
    .line 1414
    move-result-wide v4

    .line 1415
    :goto_30
    add-long/2addr v6, v4

    .line 1416
    iput-wide v6, v1, Lh2/s;->c:J

    .line 1417
    .line 1418
    :cond_3f
    const/4 v14, 0x0

    .line 1419
    goto :goto_31

    .line 1420
    :cond_40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    const-string v2, "Unexpected saio entry count: "

    .line 1423
    .line 1424
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v1

    .line 1434
    const/4 v14, 0x0

    .line 1435
    invoke-static {v1, v14}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v1

    .line 1439
    throw v1

    .line 1440
    :goto_31
    const v4, 0x73656e63

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v3, v4}, Li1/b;->h(I)Li1/c;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v3

    .line 1447
    if-eqz v3, :cond_41

    .line 1448
    .line 1449
    iget-object v3, v3, Li1/c;->c:Lh1/w;

    .line 1450
    .line 1451
    const/4 v13, 0x0

    .line 1452
    invoke-static {v3, v13, v1}, Lh2/i;->b(Lh1/w;ILh2/s;)V

    .line 1453
    .line 1454
    .line 1455
    :cond_41
    if-eqz v2, :cond_42

    .line 1456
    .line 1457
    iget-object v2, v2, Lh2/r;->b:Ljava/lang/String;

    .line 1458
    .line 1459
    move-object/from16 v30, v2

    .line 1460
    .line 1461
    goto :goto_32

    .line 1462
    :cond_42
    move-object/from16 v30, v14

    .line 1463
    .line 1464
    :goto_32
    move-object v3, v14

    .line 1465
    move-object v4, v3

    .line 1466
    const/4 v2, 0x0

    .line 1467
    :goto_33
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1468
    .line 1469
    .line 1470
    move-result v5

    .line 1471
    if-ge v2, v5, :cond_45

    .line 1472
    .line 1473
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v5

    .line 1477
    check-cast v5, Li1/c;

    .line 1478
    .line 1479
    iget-object v6, v5, Li1/c;->c:Lh1/w;

    .line 1480
    .line 1481
    iget v5, v5, Li1/d;->b:I

    .line 1482
    .line 1483
    const v7, 0x73626770

    .line 1484
    .line 1485
    .line 1486
    const v10, 0x73656967

    .line 1487
    .line 1488
    .line 1489
    if-ne v5, v7, :cond_43

    .line 1490
    .line 1491
    const/16 v7, 0xc

    .line 1492
    .line 1493
    invoke-virtual {v6, v7}, Lh1/w;->G(I)V

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 1497
    .line 1498
    .line 1499
    move-result v5

    .line 1500
    if-ne v5, v10, :cond_44

    .line 1501
    .line 1502
    move-object v3, v6

    .line 1503
    goto :goto_34

    .line 1504
    :cond_43
    const/16 v7, 0xc

    .line 1505
    .line 1506
    const v12, 0x73677064

    .line 1507
    .line 1508
    .line 1509
    if-ne v5, v12, :cond_44

    .line 1510
    .line 1511
    invoke-virtual {v6, v7}, Lh1/w;->G(I)V

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 1515
    .line 1516
    .line 1517
    move-result v5

    .line 1518
    if-ne v5, v10, :cond_44

    .line 1519
    .line 1520
    move-object v4, v6

    .line 1521
    :cond_44
    :goto_34
    add-int/lit8 v2, v2, 0x1

    .line 1522
    .line 1523
    goto :goto_33

    .line 1524
    :cond_45
    const/16 v7, 0xc

    .line 1525
    .line 1526
    if-eqz v3, :cond_46

    .line 1527
    .line 1528
    if-nez v4, :cond_47

    .line 1529
    .line 1530
    :cond_46
    :goto_35
    const/4 v10, 0x1

    .line 1531
    goto/16 :goto_3a

    .line 1532
    .line 1533
    :cond_47
    const/16 v13, 0x8

    .line 1534
    .line 1535
    invoke-virtual {v3, v13}, Lh1/w;->G(I)V

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v3}, Lh1/w;->g()I

    .line 1539
    .line 1540
    .line 1541
    move-result v2

    .line 1542
    invoke-static {v2}, Lh2/d;->c(I)I

    .line 1543
    .line 1544
    .line 1545
    move-result v2

    .line 1546
    const/4 v5, 0x4

    .line 1547
    invoke-virtual {v3, v5}, Lh1/w;->H(I)V

    .line 1548
    .line 1549
    .line 1550
    const/4 v10, 0x1

    .line 1551
    if-ne v2, v10, :cond_48

    .line 1552
    .line 1553
    invoke-virtual {v3, v5}, Lh1/w;->H(I)V

    .line 1554
    .line 1555
    .line 1556
    :cond_48
    invoke-virtual {v3}, Lh1/w;->g()I

    .line 1557
    .line 1558
    .line 1559
    move-result v2

    .line 1560
    if-ne v2, v10, :cond_50

    .line 1561
    .line 1562
    invoke-virtual {v4, v13}, Lh1/w;->G(I)V

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 1566
    .line 1567
    .line 1568
    move-result v2

    .line 1569
    invoke-static {v2}, Lh2/d;->c(I)I

    .line 1570
    .line 1571
    .line 1572
    move-result v2

    .line 1573
    invoke-virtual {v4, v5}, Lh1/w;->H(I)V

    .line 1574
    .line 1575
    .line 1576
    if-ne v2, v10, :cond_4a

    .line 1577
    .line 1578
    invoke-virtual {v4}, Lh1/w;->w()J

    .line 1579
    .line 1580
    .line 1581
    move-result-wide v2

    .line 1582
    cmp-long v2, v2, v23

    .line 1583
    .line 1584
    if-eqz v2, :cond_49

    .line 1585
    .line 1586
    goto :goto_36

    .line 1587
    :cond_49
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 1588
    .line 1589
    invoke-static {v1}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v1

    .line 1593
    throw v1

    .line 1594
    :cond_4a
    const/4 v3, 0x2

    .line 1595
    if-lt v2, v3, :cond_4b

    .line 1596
    .line 1597
    invoke-virtual {v4, v5}, Lh1/w;->H(I)V

    .line 1598
    .line 1599
    .line 1600
    :cond_4b
    :goto_36
    invoke-virtual {v4}, Lh1/w;->w()J

    .line 1601
    .line 1602
    .line 1603
    move-result-wide v2

    .line 1604
    const-wide/16 v12, 0x1

    .line 1605
    .line 1606
    cmp-long v2, v2, v12

    .line 1607
    .line 1608
    if-nez v2, :cond_4f

    .line 1609
    .line 1610
    const/4 v10, 0x1

    .line 1611
    invoke-virtual {v4, v10}, Lh1/w;->H(I)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v4}, Lh1/w;->u()I

    .line 1615
    .line 1616
    .line 1617
    move-result v2

    .line 1618
    and-int/lit16 v3, v2, 0xf0

    .line 1619
    .line 1620
    shr-int/lit8 v33, v3, 0x4

    .line 1621
    .line 1622
    and-int/lit8 v34, v2, 0xf

    .line 1623
    .line 1624
    invoke-virtual {v4}, Lh1/w;->u()I

    .line 1625
    .line 1626
    .line 1627
    move-result v2

    .line 1628
    if-ne v2, v10, :cond_4c

    .line 1629
    .line 1630
    const/16 v29, 0x1

    .line 1631
    .line 1632
    goto :goto_37

    .line 1633
    :cond_4c
    const/16 v29, 0x0

    .line 1634
    .line 1635
    :goto_37
    if-nez v29, :cond_4d

    .line 1636
    .line 1637
    goto :goto_35

    .line 1638
    :cond_4d
    invoke-virtual {v4}, Lh1/w;->u()I

    .line 1639
    .line 1640
    .line 1641
    move-result v31

    .line 1642
    move/from16 v2, v25

    .line 1643
    .line 1644
    new-array v3, v2, [B

    .line 1645
    .line 1646
    const/4 v13, 0x0

    .line 1647
    invoke-virtual {v4, v3, v13, v2}, Lh1/w;->e([BII)V

    .line 1648
    .line 1649
    .line 1650
    if-nez v31, :cond_4e

    .line 1651
    .line 1652
    invoke-virtual {v4}, Lh1/w;->u()I

    .line 1653
    .line 1654
    .line 1655
    move-result v2

    .line 1656
    new-array v5, v2, [B

    .line 1657
    .line 1658
    invoke-virtual {v4, v5, v13, v2}, Lh1/w;->e([BII)V

    .line 1659
    .line 1660
    .line 1661
    move-object/from16 v35, v5

    .line 1662
    .line 1663
    :goto_38
    const/4 v10, 0x1

    .line 1664
    goto :goto_39

    .line 1665
    :cond_4e
    move-object/from16 v35, v14

    .line 1666
    .line 1667
    goto :goto_38

    .line 1668
    :goto_39
    iput-boolean v10, v1, Lh2/s;->k:Z

    .line 1669
    .line 1670
    new-instance v28, Lh2/r;

    .line 1671
    .line 1672
    move-object/from16 v32, v3

    .line 1673
    .line 1674
    invoke-direct/range {v28 .. v35}, Lh2/r;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1675
    .line 1676
    .line 1677
    move-object/from16 v2, v28

    .line 1678
    .line 1679
    iput-object v2, v1, Lh2/s;->m:Lh2/r;

    .line 1680
    .line 1681
    goto :goto_3a

    .line 1682
    :cond_4f
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 1683
    .line 1684
    invoke-static {v1}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v1

    .line 1688
    throw v1

    .line 1689
    :cond_50
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 1690
    .line 1691
    invoke-static {v1}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v1

    .line 1695
    throw v1

    .line 1696
    :goto_3a
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1697
    .line 1698
    .line 1699
    move-result v2

    .line 1700
    const/4 v3, 0x0

    .line 1701
    :goto_3b
    if-ge v3, v2, :cond_15

    .line 1702
    .line 1703
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v4

    .line 1707
    check-cast v4, Li1/c;

    .line 1708
    .line 1709
    iget v5, v4, Li1/d;->b:I

    .line 1710
    .line 1711
    const v6, 0x75756964

    .line 1712
    .line 1713
    .line 1714
    if-ne v5, v6, :cond_52

    .line 1715
    .line 1716
    iget-object v4, v4, Li1/c;->c:Lh1/w;

    .line 1717
    .line 1718
    const/16 v13, 0x8

    .line 1719
    .line 1720
    invoke-virtual {v4, v13}, Lh1/w;->G(I)V

    .line 1721
    .line 1722
    .line 1723
    iget-object v5, v0, Lh2/i;->i:[B

    .line 1724
    .line 1725
    const/4 v6, 0x0

    .line 1726
    const/16 v12, 0x10

    .line 1727
    .line 1728
    invoke-virtual {v4, v5, v6, v12}, Lh1/w;->e([BII)V

    .line 1729
    .line 1730
    .line 1731
    sget-object v6, Lh2/i;->M:[B

    .line 1732
    .line 1733
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v5

    .line 1737
    if-nez v5, :cond_51

    .line 1738
    .line 1739
    goto :goto_3c

    .line 1740
    :cond_51
    invoke-static {v4, v12, v1}, Lh2/i;->b(Lh1/w;ILh2/s;)V

    .line 1741
    .line 1742
    .line 1743
    goto :goto_3c

    .line 1744
    :cond_52
    const/16 v12, 0x10

    .line 1745
    .line 1746
    const/16 v13, 0x8

    .line 1747
    .line 1748
    :goto_3c
    add-int/lit8 v3, v3, 0x1

    .line 1749
    .line 1750
    goto :goto_3b

    .line 1751
    :cond_53
    move/from16 v22, v1

    .line 1752
    .line 1753
    move-object/from16 v20, v5

    .line 1754
    .line 1755
    move-object/from16 v48, v6

    .line 1756
    .line 1757
    move/from16 v49, v7

    .line 1758
    .line 1759
    const/16 v7, 0xc

    .line 1760
    .line 1761
    const/4 v10, 0x1

    .line 1762
    const/16 v13, 0x8

    .line 1763
    .line 1764
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    :goto_3d
    add-int/lit8 v9, v9, 0x1

    .line 1770
    .line 1771
    move-object/from16 v5, v20

    .line 1772
    .line 1773
    move/from16 v1, v22

    .line 1774
    .line 1775
    move-object/from16 v6, v48

    .line 1776
    .line 1777
    move/from16 v7, v49

    .line 1778
    .line 1779
    goto/16 :goto_c

    .line 1780
    .line 1781
    :cond_54
    move-object/from16 v48, v6

    .line 1782
    .line 1783
    const/4 v14, 0x0

    .line 1784
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    invoke-static/range {v48 .. v48}, Lh2/i;->a(Ljava/util/List;)Landroidx/media3/common/s;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v1

    .line 1793
    if-eqz v1, :cond_57

    .line 1794
    .line 1795
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 1796
    .line 1797
    .line 1798
    move-result v2

    .line 1799
    const/4 v9, 0x0

    .line 1800
    :goto_3e
    if-ge v9, v2, :cond_57

    .line 1801
    .line 1802
    invoke-virtual {v15, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v3

    .line 1806
    check-cast v3, Lh2/h;

    .line 1807
    .line 1808
    iget-object v4, v3, Lh2/h;->d:Lh2/t;

    .line 1809
    .line 1810
    iget-object v4, v4, Lh2/t;->a:Lh2/q;

    .line 1811
    .line 1812
    iget-object v5, v3, Lh2/h;->b:Lh2/s;

    .line 1813
    .line 1814
    iget-object v5, v5, Lh2/s;->a:Lh2/e;

    .line 1815
    .line 1816
    sget v6, Lh1/i0;->a:I

    .line 1817
    .line 1818
    iget v5, v5, Lh2/e;->a:I

    .line 1819
    .line 1820
    iget-object v4, v4, Lh2/q;->l:[Lh2/r;

    .line 1821
    .line 1822
    if-nez v4, :cond_55

    .line 1823
    .line 1824
    move-object v4, v14

    .line 1825
    goto :goto_3f

    .line 1826
    :cond_55
    aget-object v21, v4, v5

    .line 1827
    .line 1828
    move-object/from16 v4, v21

    .line 1829
    .line 1830
    :goto_3f
    if-eqz v4, :cond_56

    .line 1831
    .line 1832
    iget-object v4, v4, Lh2/r;->b:Ljava/lang/String;

    .line 1833
    .line 1834
    goto :goto_40

    .line 1835
    :cond_56
    move-object v4, v14

    .line 1836
    :goto_40
    invoke-virtual {v1, v4}, Landroidx/media3/common/s;->a(Ljava/lang/String;)Landroidx/media3/common/s;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v4

    .line 1840
    iget-object v5, v3, Lh2/h;->d:Lh2/t;

    .line 1841
    .line 1842
    iget-object v5, v5, Lh2/t;->a:Lh2/q;

    .line 1843
    .line 1844
    iget-object v5, v5, Lh2/q;->g:Landroidx/media3/common/w;

    .line 1845
    .line 1846
    invoke-virtual {v5}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v5

    .line 1850
    iput-object v4, v5, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 1851
    .line 1852
    new-instance v4, Landroidx/media3/common/w;

    .line 1853
    .line 1854
    invoke-direct {v4, v5}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 1855
    .line 1856
    .line 1857
    iget-object v3, v3, Lh2/h;->a:Ln1/i0;

    .line 1858
    .line 1859
    invoke-interface {v3, v4}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 1860
    .line 1861
    .line 1862
    add-int/lit8 v9, v9, 0x1

    .line 1863
    .line 1864
    goto :goto_3e

    .line 1865
    :cond_57
    iget-wide v1, v0, Lh2/i;->z:J

    .line 1866
    .line 1867
    cmp-long v1, v1, v18

    .line 1868
    .line 1869
    if-eqz v1, :cond_0

    .line 1870
    .line 1871
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 1872
    .line 1873
    .line 1874
    move-result v1

    .line 1875
    const/4 v3, 0x0

    .line 1876
    :goto_41
    if-ge v3, v1, :cond_5a

    .line 1877
    .line 1878
    invoke-virtual {v15, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v2

    .line 1882
    check-cast v2, Lh2/h;

    .line 1883
    .line 1884
    iget-wide v4, v0, Lh2/i;->z:J

    .line 1885
    .line 1886
    iget v6, v2, Lh2/h;->f:I

    .line 1887
    .line 1888
    :goto_42
    iget-object v7, v2, Lh2/h;->b:Lh2/s;

    .line 1889
    .line 1890
    iget v8, v7, Lh2/s;->e:I

    .line 1891
    .line 1892
    if-ge v6, v8, :cond_59

    .line 1893
    .line 1894
    iget-object v8, v7, Lh2/s;->i:[J

    .line 1895
    .line 1896
    aget-wide v9, v8, v6

    .line 1897
    .line 1898
    cmp-long v8, v9, v4

    .line 1899
    .line 1900
    if-gtz v8, :cond_59

    .line 1901
    .line 1902
    iget-object v7, v7, Lh2/s;->j:[Z

    .line 1903
    .line 1904
    aget-boolean v7, v7, v6

    .line 1905
    .line 1906
    if-eqz v7, :cond_58

    .line 1907
    .line 1908
    iput v6, v2, Lh2/h;->i:I

    .line 1909
    .line 1910
    :cond_58
    add-int/lit8 v6, v6, 0x1

    .line 1911
    .line 1912
    goto :goto_42

    .line 1913
    :cond_59
    add-int/lit8 v3, v3, 0x1

    .line 1914
    .line 1915
    goto :goto_41

    .line 1916
    :cond_5a
    move-wide/from16 v2, v18

    .line 1917
    .line 1918
    iput-wide v2, v0, Lh2/i;->z:J

    .line 1919
    .line 1920
    goto/16 :goto_0

    .line 1921
    .line 1922
    :cond_5b
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1923
    .line 1924
    .line 1925
    move-result v2

    .line 1926
    if-nez v2, :cond_0

    .line 1927
    .line 1928
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v1

    .line 1932
    check-cast v1, Li1/b;

    .line 1933
    .line 1934
    iget-object v1, v1, Li1/b;->e:Ljava/util/ArrayList;

    .line 1935
    .line 1936
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1937
    .line 1938
    .line 1939
    goto/16 :goto_0

    .line 1940
    .line 1941
    :cond_5c
    const/4 v13, 0x0

    .line 1942
    iput v13, v0, Lh2/i;->s:I

    .line 1943
    .line 1944
    iput v13, v0, Lh2/i;->v:I

    .line 1945
    .line 1946
    return-void
.end method

.method public final getSniffFailureDetails()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/i;->r:Lf6/l1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final init(Ln1/p;)V
    .locals 11

    .line 1
    iget v0, p0, Lh2/i;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x20

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, La4/c;

    .line 8
    .line 9
    iget-object v2, p0, Lh2/i;->a:Lk2/o;

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, La4/c;-><init>(Ln1/p;Lk2/o;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :cond_0
    iput-object p1, p0, Lh2/i;->I:Ln1/p;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, p0, Lh2/i;->s:I

    .line 19
    .line 20
    iput v1, p0, Lh2/i;->v:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    new-array v2, v2, [Ln1/i0;

    .line 24
    .line 25
    iput-object v2, p0, Lh2/i;->J:[Ln1/i0;

    .line 26
    .line 27
    iget-object v3, p0, Lh2/i;->q:Ln1/i0;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    aput-object v3, v2, v1

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v3, v1

    .line 36
    :goto_0
    and-int/lit8 v0, v0, 0x4

    .line 37
    .line 38
    const/16 v4, 0x64

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v0, v3, 0x1

    .line 43
    .line 44
    const/4 v5, 0x5

    .line 45
    invoke-interface {p1, v4, v5}, Ln1/p;->track(II)Ln1/i0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    aput-object p1, v2, v3

    .line 50
    .line 51
    const/16 v4, 0x65

    .line 52
    .line 53
    move v3, v0

    .line 54
    :cond_2
    iget-object p1, p0, Lh2/i;->J:[Ln1/i0;

    .line 55
    .line 56
    invoke-static {v3, p1}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, [Ln1/i0;

    .line 61
    .line 62
    iput-object p1, p0, Lh2/i;->J:[Ln1/i0;

    .line 63
    .line 64
    array-length v0, p1

    .line 65
    move v2, v1

    .line 66
    :goto_1
    if-ge v2, v0, :cond_3

    .line 67
    .line 68
    aget-object v3, p1, v2

    .line 69
    .line 70
    sget-object v5, Lh2/i;->N:Landroidx/media3/common/w;

    .line 71
    .line 72
    invoke-interface {v3, v5}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object p1, p0, Lh2/i;->d:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    new-array v0, v0, [Ln1/i0;

    .line 85
    .line 86
    iput-object v0, p0, Lh2/i;->K:[Ln1/i0;

    .line 87
    .line 88
    move v0, v1

    .line 89
    :goto_2
    iget-object v2, p0, Lh2/i;->K:[Ln1/i0;

    .line 90
    .line 91
    array-length v2, v2

    .line 92
    if-ge v0, v2, :cond_4

    .line 93
    .line 94
    iget-object v2, p0, Lh2/i;->I:Ln1/p;

    .line 95
    .line 96
    add-int/lit8 v3, v4, 0x1

    .line 97
    .line 98
    const/4 v5, 0x3

    .line 99
    invoke-interface {v2, v4, v5}, Ln1/p;->track(II)Ln1/i0;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Landroidx/media3/common/w;

    .line 108
    .line 109
    invoke-interface {v2, v4}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 110
    .line 111
    .line 112
    iget-object v4, p0, Lh2/i;->K:[Ln1/i0;

    .line 113
    .line 114
    aput-object v2, v4, v0

    .line 115
    .line 116
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    move v4, v3

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    iget-object p1, p0, Lh2/i;->c:Lh2/q;

    .line 121
    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    new-instance v0, Lh2/h;

    .line 125
    .line 126
    iget-object v2, p0, Lh2/i;->I:Ln1/p;

    .line 127
    .line 128
    iget p1, p1, Lh2/q;->b:I

    .line 129
    .line 130
    invoke-interface {v2, v1, p1}, Ln1/p;->track(II)Ln1/i0;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v2, Lh2/t;

    .line 135
    .line 136
    new-array v4, v1, [J

    .line 137
    .line 138
    new-array v5, v1, [I

    .line 139
    .line 140
    new-array v7, v1, [J

    .line 141
    .line 142
    new-array v8, v1, [I

    .line 143
    .line 144
    const-wide/16 v9, 0x0

    .line 145
    .line 146
    iget-object v3, p0, Lh2/i;->c:Lh2/q;

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    invoke-direct/range {v2 .. v10}, Lh2/t;-><init>(Lh2/q;[J[II[J[IJ)V

    .line 150
    .line 151
    .line 152
    new-instance v3, Lh2/e;

    .line 153
    .line 154
    invoke-direct {v3, v1, v1, v1, v1}, Lh2/e;-><init>(IIII)V

    .line 155
    .line 156
    .line 157
    invoke-direct {v0, p1, v2, v3}, Lh2/h;-><init>(Ln1/i0;Lh2/t;Lh2/e;)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, Lh2/i;->e:Landroid/util/SparseArray;

    .line 161
    .line 162
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lh2/i;->I:Ln1/p;

    .line 166
    .line 167
    invoke-interface {p1}, Ln1/p;->endTracks()V

    .line 168
    .line 169
    .line 170
    :cond_5
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_0
    iget v2, v0, Lh2/i;->s:I

    .line 6
    .line 7
    iget-object v5, v0, Lh2/i;->n:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iget-object v7, v0, Lh2/i;->p:Li1/s;

    .line 10
    .line 11
    iget-object v8, v0, Lh2/i;->e:Landroid/util/SparseArray;

    .line 12
    .line 13
    const/4 v11, 0x2

    .line 14
    const/4 v12, 0x1

    .line 15
    const/4 v13, 0x0

    .line 16
    if-eqz v2, :cond_47

    .line 17
    .line 18
    iget-object v14, v0, Lh2/i;->o:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    const-string v15, "FragmentedMp4Extractor"

    .line 21
    .line 22
    iget-object v4, v0, Lh2/i;->k:Lh1/d0;

    .line 23
    .line 24
    if-eq v2, v12, :cond_36

    .line 25
    .line 26
    const-wide v16, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-eq v2, v11, :cond_31

    .line 32
    .line 33
    iget-object v2, v0, Lh2/i;->C:Lh2/h;

    .line 34
    .line 35
    if-nez v2, :cond_9

    .line 36
    .line 37
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    move/from16 v18, v11

    .line 42
    .line 43
    move v6, v13

    .line 44
    const/4 v11, 0x0

    .line 45
    :goto_1
    if-ge v6, v2, :cond_4

    .line 46
    .line 47
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v20

    .line 51
    move-object/from16 v3, v20

    .line 52
    .line 53
    check-cast v3, Lh2/h;

    .line 54
    .line 55
    const/16 v20, 0x8

    .line 56
    .line 57
    iget-boolean v9, v3, Lh2/h;->l:Z

    .line 58
    .line 59
    iget-object v12, v3, Lh2/h;->b:Lh2/s;

    .line 60
    .line 61
    if-nez v9, :cond_0

    .line 62
    .line 63
    iget v5, v3, Lh2/h;->f:I

    .line 64
    .line 65
    iget-object v10, v3, Lh2/h;->d:Lh2/t;

    .line 66
    .line 67
    iget v10, v10, Lh2/t;->b:I

    .line 68
    .line 69
    if-eq v5, v10, :cond_3

    .line 70
    .line 71
    :cond_0
    if-eqz v9, :cond_1

    .line 72
    .line 73
    iget v5, v3, Lh2/h;->h:I

    .line 74
    .line 75
    iget v10, v12, Lh2/s;->d:I

    .line 76
    .line 77
    if-ne v5, v10, :cond_1

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_1
    if-nez v9, :cond_2

    .line 81
    .line 82
    iget-object v5, v3, Lh2/h;->d:Lh2/t;

    .line 83
    .line 84
    iget-object v5, v5, Lh2/t;->c:[J

    .line 85
    .line 86
    iget v9, v3, Lh2/h;->f:I

    .line 87
    .line 88
    aget-wide v9, v5, v9

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    iget-object v5, v12, Lh2/s;->f:[J

    .line 92
    .line 93
    iget v9, v3, Lh2/h;->h:I

    .line 94
    .line 95
    aget-wide v9, v5, v9

    .line 96
    .line 97
    :goto_2
    cmp-long v5, v9, v16

    .line 98
    .line 99
    if-gez v5, :cond_3

    .line 100
    .line 101
    move-object v11, v3

    .line 102
    move-wide/from16 v16, v9

    .line 103
    .line 104
    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 105
    .line 106
    const/4 v12, 0x1

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    const/16 v20, 0x8

    .line 109
    .line 110
    if-nez v11, :cond_6

    .line 111
    .line 112
    iget-wide v2, v0, Lh2/i;->x:J

    .line 113
    .line 114
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    sub-long/2addr v2, v4

    .line 119
    long-to-int v2, v2

    .line 120
    if-ltz v2, :cond_5

    .line 121
    .line 122
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 123
    .line 124
    .line 125
    iput v13, v0, Lh2/i;->s:I

    .line 126
    .line 127
    iput v13, v0, Lh2/i;->v:I

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_5
    const-string v1, "Offset to end of mdat was negative."

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    throw v1

    .line 138
    :cond_6
    iget-boolean v2, v11, Lh2/h;->l:Z

    .line 139
    .line 140
    if-nez v2, :cond_7

    .line 141
    .line 142
    iget-object v2, v11, Lh2/h;->d:Lh2/t;

    .line 143
    .line 144
    iget-object v2, v2, Lh2/t;->c:[J

    .line 145
    .line 146
    iget v3, v11, Lh2/h;->f:I

    .line 147
    .line 148
    aget-wide v5, v2, v3

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_7
    iget-object v2, v11, Lh2/h;->b:Lh2/s;

    .line 152
    .line 153
    iget-object v2, v2, Lh2/s;->f:[J

    .line 154
    .line 155
    iget v3, v11, Lh2/h;->h:I

    .line 156
    .line 157
    aget-wide v5, v2, v3

    .line 158
    .line 159
    :goto_4
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 160
    .line 161
    .line 162
    move-result-wide v2

    .line 163
    sub-long/2addr v5, v2

    .line 164
    long-to-int v2, v5

    .line 165
    if-gez v2, :cond_8

    .line 166
    .line 167
    const-string v2, "Ignoring negative offset to sample data."

    .line 168
    .line 169
    invoke-static {v15, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    move v2, v13

    .line 173
    :cond_8
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 174
    .line 175
    .line 176
    iput-object v11, v0, Lh2/i;->C:Lh2/h;

    .line 177
    .line 178
    move-object v2, v11

    .line 179
    goto :goto_5

    .line 180
    :cond_9
    move/from16 v18, v11

    .line 181
    .line 182
    const/16 v20, 0x8

    .line 183
    .line 184
    :goto_5
    iget-object v3, v2, Lh2/h;->b:Lh2/s;

    .line 185
    .line 186
    iget v5, v0, Lh2/i;->s:I

    .line 187
    .line 188
    const/4 v6, 0x6

    .line 189
    iget v8, v0, Lh2/i;->b:I

    .line 190
    .line 191
    const-string v9, "video/avc"

    .line 192
    .line 193
    const/4 v10, 0x3

    .line 194
    if-ne v5, v10, :cond_14

    .line 195
    .line 196
    iget-boolean v5, v2, Lh2/h;->l:Z

    .line 197
    .line 198
    if-nez v5, :cond_a

    .line 199
    .line 200
    iget-object v5, v2, Lh2/h;->d:Lh2/t;

    .line 201
    .line 202
    iget-object v5, v5, Lh2/t;->d:[I

    .line 203
    .line 204
    iget v10, v2, Lh2/h;->f:I

    .line 205
    .line 206
    aget v5, v5, v10

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_a
    iget-object v5, v3, Lh2/s;->h:[I

    .line 210
    .line 211
    iget v10, v2, Lh2/h;->f:I

    .line 212
    .line 213
    aget v5, v5, v10

    .line 214
    .line 215
    :goto_6
    iput v5, v0, Lh2/i;->D:I

    .line 216
    .line 217
    and-int/lit8 v5, v8, 0x40

    .line 218
    .line 219
    if-eqz v5, :cond_c

    .line 220
    .line 221
    iget-object v5, v2, Lh2/h;->d:Lh2/t;

    .line 222
    .line 223
    iget-object v5, v5, Lh2/t;->a:Lh2/q;

    .line 224
    .line 225
    iget-object v5, v5, Lh2/q;->g:Landroidx/media3/common/w;

    .line 226
    .line 227
    iget-object v5, v5, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v5, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-nez v5, :cond_b

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_b
    move v5, v13

    .line 237
    goto :goto_8

    .line 238
    :cond_c
    :goto_7
    const/4 v5, 0x1

    .line 239
    :goto_8
    iput-boolean v5, v0, Lh2/i;->G:Z

    .line 240
    .line 241
    iget v5, v2, Lh2/h;->f:I

    .line 242
    .line 243
    iget v10, v2, Lh2/h;->i:I

    .line 244
    .line 245
    if-ge v5, v10, :cond_11

    .line 246
    .line 247
    iget v4, v0, Lh2/i;->D:I

    .line 248
    .line 249
    invoke-interface {v1, v4}, Ln1/o;->h(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Lh2/h;->b()Lh2/r;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    if-nez v1, :cond_d

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_d
    iget-object v4, v3, Lh2/s;->n:Lh1/w;

    .line 260
    .line 261
    iget v1, v1, Lh2/r;->d:I

    .line 262
    .line 263
    if-eqz v1, :cond_e

    .line 264
    .line 265
    invoke-virtual {v4, v1}, Lh1/w;->H(I)V

    .line 266
    .line 267
    .line 268
    :cond_e
    iget v1, v2, Lh2/h;->f:I

    .line 269
    .line 270
    iget-boolean v5, v3, Lh2/s;->k:Z

    .line 271
    .line 272
    if-eqz v5, :cond_f

    .line 273
    .line 274
    iget-object v3, v3, Lh2/s;->l:[Z

    .line 275
    .line 276
    aget-boolean v1, v3, v1

    .line 277
    .line 278
    if-eqz v1, :cond_f

    .line 279
    .line 280
    invoke-virtual {v4}, Lh1/w;->A()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    mul-int/2addr v1, v6

    .line 285
    invoke-virtual {v4, v1}, Lh1/w;->H(I)V

    .line 286
    .line 287
    .line 288
    :cond_f
    :goto_9
    invoke-virtual {v2}, Lh2/h;->c()Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-nez v1, :cond_10

    .line 293
    .line 294
    const/4 v2, 0x0

    .line 295
    iput-object v2, v0, Lh2/i;->C:Lh2/h;

    .line 296
    .line 297
    :cond_10
    const/4 v10, 0x3

    .line 298
    iput v10, v0, Lh2/i;->s:I

    .line 299
    .line 300
    return v13

    .line 301
    :cond_11
    iget-object v5, v2, Lh2/h;->d:Lh2/t;

    .line 302
    .line 303
    iget-object v5, v5, Lh2/t;->a:Lh2/q;

    .line 304
    .line 305
    iget v5, v5, Lh2/q;->h:I

    .line 306
    .line 307
    const/4 v10, 0x1

    .line 308
    if-ne v5, v10, :cond_12

    .line 309
    .line 310
    iget v5, v0, Lh2/i;->D:I

    .line 311
    .line 312
    add-int/lit8 v5, v5, -0x8

    .line 313
    .line 314
    iput v5, v0, Lh2/i;->D:I

    .line 315
    .line 316
    move/from16 v5, v20

    .line 317
    .line 318
    invoke-interface {v1, v5}, Ln1/o;->h(I)V

    .line 319
    .line 320
    .line 321
    :cond_12
    iget-object v5, v2, Lh2/h;->d:Lh2/t;

    .line 322
    .line 323
    iget-object v5, v5, Lh2/t;->a:Lh2/q;

    .line 324
    .line 325
    iget-object v5, v5, Lh2/q;->g:Landroidx/media3/common/w;

    .line 326
    .line 327
    iget-object v5, v5, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 328
    .line 329
    const-string v10, "audio/ac4"

    .line 330
    .line 331
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    if-eqz v5, :cond_13

    .line 336
    .line 337
    iget v5, v0, Lh2/i;->D:I

    .line 338
    .line 339
    const/4 v10, 0x7

    .line 340
    invoke-virtual {v2, v5, v10}, Lh2/h;->d(II)I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    iput v5, v0, Lh2/i;->E:I

    .line 345
    .line 346
    iget v5, v0, Lh2/i;->D:I

    .line 347
    .line 348
    iget-object v11, v0, Lh2/i;->j:Lh1/w;

    .line 349
    .line 350
    invoke-static {v11, v5}, Ln1/b;->h(Lh1/w;I)V

    .line 351
    .line 352
    .line 353
    iget-object v5, v2, Lh2/h;->a:Ln1/i0;

    .line 354
    .line 355
    invoke-interface {v5, v11, v10}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 356
    .line 357
    .line 358
    iget v5, v0, Lh2/i;->E:I

    .line 359
    .line 360
    add-int/2addr v5, v10

    .line 361
    iput v5, v0, Lh2/i;->E:I

    .line 362
    .line 363
    goto :goto_a

    .line 364
    :cond_13
    iget v5, v0, Lh2/i;->D:I

    .line 365
    .line 366
    invoke-virtual {v2, v5, v13}, Lh2/h;->d(II)I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    iput v5, v0, Lh2/i;->E:I

    .line 371
    .line 372
    :goto_a
    iget v5, v0, Lh2/i;->D:I

    .line 373
    .line 374
    iget v10, v0, Lh2/i;->E:I

    .line 375
    .line 376
    add-int/2addr v5, v10

    .line 377
    iput v5, v0, Lh2/i;->D:I

    .line 378
    .line 379
    const/4 v5, 0x4

    .line 380
    iput v5, v0, Lh2/i;->s:I

    .line 381
    .line 382
    iput v13, v0, Lh2/i;->F:I

    .line 383
    .line 384
    :cond_14
    iget-object v5, v2, Lh2/h;->d:Lh2/t;

    .line 385
    .line 386
    iget-object v10, v5, Lh2/t;->a:Lh2/q;

    .line 387
    .line 388
    iget-object v11, v2, Lh2/h;->a:Ln1/i0;

    .line 389
    .line 390
    iget-boolean v12, v2, Lh2/h;->l:Z

    .line 391
    .line 392
    if-nez v12, :cond_15

    .line 393
    .line 394
    iget-object v3, v5, Lh2/t;->f:[J

    .line 395
    .line 396
    iget v5, v2, Lh2/h;->f:I

    .line 397
    .line 398
    aget-wide v15, v3, v5

    .line 399
    .line 400
    :goto_b
    move-object v3, v7

    .line 401
    move-wide v6, v15

    .line 402
    goto :goto_c

    .line 403
    :cond_15
    iget v5, v2, Lh2/h;->f:I

    .line 404
    .line 405
    iget-object v3, v3, Lh2/s;->i:[J

    .line 406
    .line 407
    aget-wide v15, v3, v5

    .line 408
    .line 409
    goto :goto_b

    .line 410
    :goto_c
    if-eqz v4, :cond_16

    .line 411
    .line 412
    invoke-virtual {v4, v6, v7}, Lh1/d0;->a(J)J

    .line 413
    .line 414
    .line 415
    move-result-wide v6

    .line 416
    :cond_16
    iget v12, v10, Lh2/q;->k:I

    .line 417
    .line 418
    iget-object v10, v10, Lh2/q;->g:Landroidx/media3/common/w;

    .line 419
    .line 420
    if-eqz v12, :cond_28

    .line 421
    .line 422
    iget-object v15, v0, Lh2/i;->g:Lh1/w;

    .line 423
    .line 424
    iget-object v5, v15, Lh1/w;->a:[B

    .line 425
    .line 426
    aput-byte v13, v5, v13

    .line 427
    .line 428
    const/16 v22, 0x1

    .line 429
    .line 430
    aput-byte v13, v5, v22

    .line 431
    .line 432
    aput-byte v13, v5, v18

    .line 433
    .line 434
    add-int/lit8 v13, v12, 0x1

    .line 435
    .line 436
    const/16 v21, 0x4

    .line 437
    .line 438
    rsub-int/lit8 v12, v12, 0x4

    .line 439
    .line 440
    move-object/from16 v17, v3

    .line 441
    .line 442
    :goto_d
    iget v3, v0, Lh2/i;->E:I

    .line 443
    .line 444
    move/from16 v20, v8

    .line 445
    .line 446
    iget v8, v0, Lh2/i;->D:I

    .line 447
    .line 448
    if-ge v3, v8, :cond_27

    .line 449
    .line 450
    iget v3, v0, Lh2/i;->F:I

    .line 451
    .line 452
    const-string v8, "video/hevc"

    .line 453
    .line 454
    if-nez v3, :cond_1f

    .line 455
    .line 456
    invoke-interface {v1, v5, v12, v13}, Ln1/o;->readFully([BII)V

    .line 457
    .line 458
    .line 459
    const/4 v3, 0x0

    .line 460
    invoke-virtual {v15, v3}, Lh1/w;->G(I)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v15}, Lh1/w;->g()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    move-object/from16 v24, v5

    .line 468
    .line 469
    const/4 v5, 0x1

    .line 470
    if-lt v3, v5, :cond_1e

    .line 471
    .line 472
    add-int/lit8 v3, v3, -0x1

    .line 473
    .line 474
    iput v3, v0, Lh2/i;->F:I

    .line 475
    .line 476
    iget-object v3, v0, Lh2/i;->f:Lh1/w;

    .line 477
    .line 478
    const/4 v5, 0x0

    .line 479
    invoke-virtual {v3, v5}, Lh1/w;->G(I)V

    .line 480
    .line 481
    .line 482
    const/4 v5, 0x4

    .line 483
    invoke-interface {v11, v3, v5}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 484
    .line 485
    .line 486
    const/4 v3, 0x1

    .line 487
    invoke-interface {v11, v15, v3}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 488
    .line 489
    .line 490
    iget-object v3, v0, Lh2/i;->K:[Ln1/i0;

    .line 491
    .line 492
    array-length v3, v3

    .line 493
    if-lez v3, :cond_1b

    .line 494
    .line 495
    aget-byte v3, v24, v5

    .line 496
    .line 497
    iget-object v5, v10, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 498
    .line 499
    move/from16 v18, v3

    .line 500
    .line 501
    iget-object v3, v10, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 502
    .line 503
    invoke-static {v5, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    if-nez v5, :cond_18

    .line 508
    .line 509
    invoke-static {v3, v9}, Landroidx/media3/common/u0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    if-eqz v5, :cond_17

    .line 514
    .line 515
    goto :goto_e

    .line 516
    :cond_17
    move/from16 v25, v12

    .line 517
    .line 518
    const/4 v12, 0x6

    .line 519
    goto :goto_f

    .line 520
    :cond_18
    :goto_e
    and-int/lit8 v5, v18, 0x1f

    .line 521
    .line 522
    move/from16 v25, v12

    .line 523
    .line 524
    const/4 v12, 0x6

    .line 525
    if-eq v5, v12, :cond_1a

    .line 526
    .line 527
    :goto_f
    iget-object v5, v10, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 528
    .line 529
    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    if-nez v5, :cond_19

    .line 534
    .line 535
    invoke-static {v3, v8}, Landroidx/media3/common/u0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    if-eqz v3, :cond_1c

    .line 540
    .line 541
    :cond_19
    and-int/lit8 v3, v18, 0x7e

    .line 542
    .line 543
    const/16 v22, 0x1

    .line 544
    .line 545
    shr-int/lit8 v3, v3, 0x1

    .line 546
    .line 547
    const/16 v5, 0x27

    .line 548
    .line 549
    if-ne v3, v5, :cond_1c

    .line 550
    .line 551
    :cond_1a
    const/4 v3, 0x1

    .line 552
    goto :goto_10

    .line 553
    :cond_1b
    move/from16 v25, v12

    .line 554
    .line 555
    const/4 v12, 0x6

    .line 556
    :cond_1c
    const/4 v3, 0x0

    .line 557
    :goto_10
    iput-boolean v3, v0, Lh2/i;->H:Z

    .line 558
    .line 559
    iget v3, v0, Lh2/i;->E:I

    .line 560
    .line 561
    add-int/lit8 v3, v3, 0x5

    .line 562
    .line 563
    iput v3, v0, Lh2/i;->E:I

    .line 564
    .line 565
    iget v3, v0, Lh2/i;->D:I

    .line 566
    .line 567
    add-int v3, v3, v25

    .line 568
    .line 569
    iput v3, v0, Lh2/i;->D:I

    .line 570
    .line 571
    iget-boolean v3, v0, Lh2/i;->G:Z

    .line 572
    .line 573
    if-nez v3, :cond_1d

    .line 574
    .line 575
    iget-object v3, v2, Lh2/h;->d:Lh2/t;

    .line 576
    .line 577
    iget-object v3, v3, Lh2/t;->a:Lh2/q;

    .line 578
    .line 579
    iget-object v3, v3, Lh2/q;->g:Landroidx/media3/common/w;

    .line 580
    .line 581
    iget-object v3, v3, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 582
    .line 583
    invoke-static {v3, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    if-eqz v3, :cond_1d

    .line 588
    .line 589
    const/16 v21, 0x4

    .line 590
    .line 591
    aget-byte v3, v24, v21

    .line 592
    .line 593
    invoke-static {v3}, Li1/p;->c(B)Z

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    if-eqz v3, :cond_1d

    .line 598
    .line 599
    const/4 v3, 0x1

    .line 600
    iput-boolean v3, v0, Lh2/i;->G:Z

    .line 601
    .line 602
    :cond_1d
    move/from16 v8, v20

    .line 603
    .line 604
    move-object/from16 v5, v24

    .line 605
    .line 606
    move/from16 v12, v25

    .line 607
    .line 608
    goto/16 :goto_d

    .line 609
    .line 610
    :cond_1e
    const-string v1, "Invalid NAL length"

    .line 611
    .line 612
    const/4 v2, 0x0

    .line 613
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    throw v1

    .line 618
    :cond_1f
    move-object/from16 v24, v5

    .line 619
    .line 620
    move/from16 v25, v12

    .line 621
    .line 622
    const/4 v12, 0x6

    .line 623
    iget-boolean v5, v0, Lh2/i;->H:Z

    .line 624
    .line 625
    if-eqz v5, :cond_25

    .line 626
    .line 627
    iget-object v5, v0, Lh2/i;->h:Lh1/w;

    .line 628
    .line 629
    invoke-virtual {v5, v3}, Lh1/w;->D(I)V

    .line 630
    .line 631
    .line 632
    iget-object v3, v5, Lh1/w;->a:[B

    .line 633
    .line 634
    iget v12, v0, Lh2/i;->F:I

    .line 635
    .line 636
    move-object/from16 v32, v2

    .line 637
    .line 638
    const/4 v2, 0x0

    .line 639
    invoke-interface {v1, v3, v2, v12}, Ln1/o;->readFully([BII)V

    .line 640
    .line 641
    .line 642
    iget v2, v0, Lh2/i;->F:I

    .line 643
    .line 644
    invoke-interface {v11, v5, v2}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 645
    .line 646
    .line 647
    iget v2, v0, Lh2/i;->F:I

    .line 648
    .line 649
    iget-object v3, v5, Lh1/w;->a:[B

    .line 650
    .line 651
    iget v12, v5, Lh1/w;->c:I

    .line 652
    .line 653
    invoke-static {v3, v12}, Li1/p;->k([BI)I

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    iget-object v12, v10, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 658
    .line 659
    invoke-static {v12, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v12

    .line 663
    if-nez v12, :cond_21

    .line 664
    .line 665
    iget-object v12, v10, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 666
    .line 667
    invoke-static {v12, v8}, Landroidx/media3/common/u0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v8

    .line 671
    if-eqz v8, :cond_20

    .line 672
    .line 673
    goto :goto_11

    .line 674
    :cond_20
    const/4 v8, 0x0

    .line 675
    goto :goto_12

    .line 676
    :cond_21
    :goto_11
    const/4 v8, 0x1

    .line 677
    :goto_12
    invoke-virtual {v5, v8}, Lh1/w;->G(I)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5, v3}, Lh1/w;->F(I)V

    .line 681
    .line 682
    .line 683
    iget v3, v10, Landroidx/media3/common/w;->p:I

    .line 684
    .line 685
    const/4 v8, -0x1

    .line 686
    if-ne v3, v8, :cond_22

    .line 687
    .line 688
    move-object/from16 v12, v17

    .line 689
    .line 690
    iget v3, v12, Li1/s;->a:I

    .line 691
    .line 692
    if-eqz v3, :cond_24

    .line 693
    .line 694
    const/4 v3, 0x0

    .line 695
    iput v3, v12, Li1/s;->a:I

    .line 696
    .line 697
    invoke-virtual {v12, v3}, Li1/s;->i(I)V

    .line 698
    .line 699
    .line 700
    goto :goto_14

    .line 701
    :cond_22
    move-object/from16 v12, v17

    .line 702
    .line 703
    iget v8, v12, Li1/s;->a:I

    .line 704
    .line 705
    if-eq v8, v3, :cond_24

    .line 706
    .line 707
    if-ltz v3, :cond_23

    .line 708
    .line 709
    const/4 v8, 0x1

    .line 710
    goto :goto_13

    .line 711
    :cond_23
    const/4 v8, 0x0

    .line 712
    :goto_13
    invoke-static {v8}, Lh1/a;->j(Z)V

    .line 713
    .line 714
    .line 715
    iput v3, v12, Li1/s;->a:I

    .line 716
    .line 717
    invoke-virtual {v12, v3}, Li1/s;->i(I)V

    .line 718
    .line 719
    .line 720
    :cond_24
    :goto_14
    invoke-virtual {v12, v6, v7, v5}, Li1/s;->a(JLh1/w;)V

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v32 .. v32}, Lh2/h;->a()I

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    const/16 v21, 0x4

    .line 728
    .line 729
    and-int/lit8 v3, v3, 0x4

    .line 730
    .line 731
    const/4 v5, 0x0

    .line 732
    if-eqz v3, :cond_26

    .line 733
    .line 734
    invoke-virtual {v12, v5}, Li1/s;->i(I)V

    .line 735
    .line 736
    .line 737
    goto :goto_15

    .line 738
    :cond_25
    move-object/from16 v32, v2

    .line 739
    .line 740
    move-object/from16 v12, v17

    .line 741
    .line 742
    const/4 v5, 0x0

    .line 743
    invoke-interface {v11, v1, v3, v5}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    :cond_26
    :goto_15
    iget v3, v0, Lh2/i;->E:I

    .line 748
    .line 749
    add-int/2addr v3, v2

    .line 750
    iput v3, v0, Lh2/i;->E:I

    .line 751
    .line 752
    iget v3, v0, Lh2/i;->F:I

    .line 753
    .line 754
    sub-int/2addr v3, v2

    .line 755
    iput v3, v0, Lh2/i;->F:I

    .line 756
    .line 757
    move-object/from16 v17, v12

    .line 758
    .line 759
    move/from16 v8, v20

    .line 760
    .line 761
    move-object/from16 v5, v24

    .line 762
    .line 763
    move/from16 v12, v25

    .line 764
    .line 765
    move-object/from16 v2, v32

    .line 766
    .line 767
    goto/16 :goto_d

    .line 768
    .line 769
    :cond_27
    move-object/from16 v32, v2

    .line 770
    .line 771
    goto :goto_17

    .line 772
    :cond_28
    move-object/from16 v32, v2

    .line 773
    .line 774
    move/from16 v20, v8

    .line 775
    .line 776
    :goto_16
    iget v2, v0, Lh2/i;->E:I

    .line 777
    .line 778
    iget v3, v0, Lh2/i;->D:I

    .line 779
    .line 780
    if-ge v2, v3, :cond_29

    .line 781
    .line 782
    sub-int/2addr v3, v2

    .line 783
    const/4 v5, 0x0

    .line 784
    invoke-interface {v11, v1, v3, v5}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    iget v3, v0, Lh2/i;->E:I

    .line 789
    .line 790
    add-int/2addr v3, v2

    .line 791
    iput v3, v0, Lh2/i;->E:I

    .line 792
    .line 793
    goto :goto_16

    .line 794
    :cond_29
    :goto_17
    invoke-virtual/range {v32 .. v32}, Lh2/h;->a()I

    .line 795
    .line 796
    .line 797
    move-result v1

    .line 798
    and-int/lit8 v2, v20, 0x40

    .line 799
    .line 800
    if-eqz v2, :cond_2a

    .line 801
    .line 802
    iget-boolean v2, v0, Lh2/i;->G:Z

    .line 803
    .line 804
    if-nez v2, :cond_2a

    .line 805
    .line 806
    const/high16 v2, 0x4000000

    .line 807
    .line 808
    or-int/2addr v1, v2

    .line 809
    :cond_2a
    move/from16 v27, v1

    .line 810
    .line 811
    invoke-virtual/range {v32 .. v32}, Lh2/h;->b()Lh2/r;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    if-eqz v1, :cond_2b

    .line 816
    .line 817
    iget-object v1, v1, Lh2/r;->c:Ln1/h0;

    .line 818
    .line 819
    move-object/from16 v30, v1

    .line 820
    .line 821
    goto :goto_18

    .line 822
    :cond_2b
    const/16 v30, 0x0

    .line 823
    .line 824
    :goto_18
    iget v1, v0, Lh2/i;->D:I

    .line 825
    .line 826
    const/16 v29, 0x0

    .line 827
    .line 828
    move/from16 v28, v1

    .line 829
    .line 830
    move-wide/from16 v25, v6

    .line 831
    .line 832
    move-object/from16 v24, v11

    .line 833
    .line 834
    invoke-interface/range {v24 .. v30}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 835
    .line 836
    .line 837
    :cond_2c
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 838
    .line 839
    .line 840
    move-result v1

    .line 841
    if-nez v1, :cond_2f

    .line 842
    .line 843
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    check-cast v1, Lh2/g;

    .line 848
    .line 849
    iget v2, v0, Lh2/i;->y:I

    .line 850
    .line 851
    iget v3, v1, Lh2/g;->c:I

    .line 852
    .line 853
    sub-int/2addr v2, v3

    .line 854
    iput v2, v0, Lh2/i;->y:I

    .line 855
    .line 856
    iget-wide v2, v1, Lh2/g;->a:J

    .line 857
    .line 858
    iget-boolean v5, v1, Lh2/g;->b:Z

    .line 859
    .line 860
    if-eqz v5, :cond_2d

    .line 861
    .line 862
    add-long v2, v2, v25

    .line 863
    .line 864
    :cond_2d
    if-eqz v4, :cond_2e

    .line 865
    .line 866
    invoke-virtual {v4, v2, v3}, Lh1/d0;->a(J)J

    .line 867
    .line 868
    .line 869
    move-result-wide v2

    .line 870
    :cond_2e
    move-wide v6, v2

    .line 871
    iget-object v2, v0, Lh2/i;->J:[Ln1/i0;

    .line 872
    .line 873
    array-length v3, v2

    .line 874
    const/4 v12, 0x0

    .line 875
    :goto_19
    if-ge v12, v3, :cond_2c

    .line 876
    .line 877
    aget-object v5, v2, v12

    .line 878
    .line 879
    iget v9, v1, Lh2/g;->c:I

    .line 880
    .line 881
    iget v10, v0, Lh2/i;->y:I

    .line 882
    .line 883
    const/4 v11, 0x0

    .line 884
    const/4 v8, 0x1

    .line 885
    invoke-interface/range {v5 .. v11}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 886
    .line 887
    .line 888
    add-int/lit8 v12, v12, 0x1

    .line 889
    .line 890
    goto :goto_19

    .line 891
    :cond_2f
    invoke-virtual/range {v32 .. v32}, Lh2/h;->c()Z

    .line 892
    .line 893
    .line 894
    move-result v1

    .line 895
    if-nez v1, :cond_30

    .line 896
    .line 897
    const/4 v2, 0x0

    .line 898
    iput-object v2, v0, Lh2/i;->C:Lh2/h;

    .line 899
    .line 900
    :cond_30
    const/4 v10, 0x3

    .line 901
    iput v10, v0, Lh2/i;->s:I

    .line 902
    .line 903
    const/16 v31, 0x0

    .line 904
    .line 905
    return v31

    .line 906
    :cond_31
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 907
    .line 908
    .line 909
    move-result v2

    .line 910
    const/4 v3, 0x0

    .line 911
    const/4 v4, 0x0

    .line 912
    :goto_1a
    if-ge v4, v2, :cond_33

    .line 913
    .line 914
    invoke-virtual {v8, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v5

    .line 918
    check-cast v5, Lh2/h;

    .line 919
    .line 920
    iget-object v5, v5, Lh2/h;->b:Lh2/s;

    .line 921
    .line 922
    iget-boolean v6, v5, Lh2/s;->o:Z

    .line 923
    .line 924
    if-eqz v6, :cond_32

    .line 925
    .line 926
    iget-wide v5, v5, Lh2/s;->c:J

    .line 927
    .line 928
    cmp-long v7, v5, v16

    .line 929
    .line 930
    if-gez v7, :cond_32

    .line 931
    .line 932
    invoke-virtual {v8, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    check-cast v3, Lh2/h;

    .line 937
    .line 938
    move-wide/from16 v16, v5

    .line 939
    .line 940
    :cond_32
    add-int/lit8 v4, v4, 0x1

    .line 941
    .line 942
    goto :goto_1a

    .line 943
    :cond_33
    if-nez v3, :cond_34

    .line 944
    .line 945
    const/4 v10, 0x3

    .line 946
    iput v10, v0, Lh2/i;->s:I

    .line 947
    .line 948
    goto/16 :goto_0

    .line 949
    .line 950
    :cond_34
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 951
    .line 952
    .line 953
    move-result-wide v4

    .line 954
    sub-long v4, v16, v4

    .line 955
    .line 956
    long-to-int v2, v4

    .line 957
    if-ltz v2, :cond_35

    .line 958
    .line 959
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 960
    .line 961
    .line 962
    iget-object v2, v3, Lh2/h;->b:Lh2/s;

    .line 963
    .line 964
    iget-object v3, v2, Lh2/s;->n:Lh1/w;

    .line 965
    .line 966
    iget-object v4, v3, Lh1/w;->a:[B

    .line 967
    .line 968
    iget v5, v3, Lh1/w;->c:I

    .line 969
    .line 970
    const/4 v6, 0x0

    .line 971
    invoke-interface {v1, v4, v6, v5}, Ln1/o;->readFully([BII)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v3, v6}, Lh1/w;->G(I)V

    .line 975
    .line 976
    .line 977
    iput-boolean v6, v2, Lh2/s;->o:Z

    .line 978
    .line 979
    goto/16 :goto_0

    .line 980
    .line 981
    :cond_35
    const-string v1, "Offset to encryption data was negative."

    .line 982
    .line 983
    const/4 v2, 0x0

    .line 984
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    throw v1

    .line 989
    :cond_36
    move/from16 v18, v11

    .line 990
    .line 991
    iget-wide v2, v0, Lh2/i;->u:J

    .line 992
    .line 993
    long-to-int v2, v2

    .line 994
    iget v3, v0, Lh2/i;->v:I

    .line 995
    .line 996
    sub-int/2addr v2, v3

    .line 997
    iget-object v3, v0, Lh2/i;->w:Lh1/w;

    .line 998
    .line 999
    if-eqz v3, :cond_45

    .line 1000
    .line 1001
    iget-object v6, v3, Lh1/w;->a:[B

    .line 1002
    .line 1003
    const/16 v7, 0x8

    .line 1004
    .line 1005
    invoke-interface {v1, v6, v7, v2}, Ln1/o;->readFully([BII)V

    .line 1006
    .line 1007
    .line 1008
    new-instance v2, Li1/c;

    .line 1009
    .line 1010
    iget v6, v0, Lh2/i;->t:I

    .line 1011
    .line 1012
    invoke-direct {v2, v3, v6}, Li1/c;-><init>(Lh1/w;I)V

    .line 1013
    .line 1014
    .line 1015
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1016
    .line 1017
    .line 1018
    move-result-wide v7

    .line 1019
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v9

    .line 1023
    if-nez v9, :cond_37

    .line 1024
    .line 1025
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v3

    .line 1029
    check-cast v3, Li1/b;

    .line 1030
    .line 1031
    iget-object v3, v3, Li1/b;->d:Ljava/util/ArrayList;

    .line 1032
    .line 1033
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    goto/16 :goto_23

    .line 1037
    .line 1038
    :cond_37
    const v2, 0x73696478

    .line 1039
    .line 1040
    .line 1041
    if-ne v6, v2, :cond_3b

    .line 1042
    .line 1043
    const/16 v5, 0x8

    .line 1044
    .line 1045
    invoke-virtual {v3, v5}, Lh1/w;->G(I)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v3}, Lh1/w;->g()I

    .line 1049
    .line 1050
    .line 1051
    move-result v2

    .line 1052
    invoke-static {v2}, Lh2/d;->c(I)I

    .line 1053
    .line 1054
    .line 1055
    move-result v2

    .line 1056
    const/4 v5, 0x4

    .line 1057
    invoke-virtual {v3, v5}, Lh1/w;->H(I)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1061
    .line 1062
    .line 1063
    move-result-wide v13

    .line 1064
    if-nez v2, :cond_38

    .line 1065
    .line 1066
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v4

    .line 1070
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1071
    .line 1072
    .line 1073
    move-result-wide v9

    .line 1074
    :goto_1b
    add-long/2addr v9, v7

    .line 1075
    move-wide/from16 v33, v9

    .line 1076
    .line 1077
    move-wide v9, v4

    .line 1078
    move-wide/from16 v4, v33

    .line 1079
    .line 1080
    goto :goto_1c

    .line 1081
    :cond_38
    invoke-virtual {v3}, Lh1/w;->z()J

    .line 1082
    .line 1083
    .line 1084
    move-result-wide v4

    .line 1085
    invoke-virtual {v3}, Lh1/w;->z()J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v9

    .line 1089
    goto :goto_1b

    .line 1090
    :goto_1c
    sget v2, Lh1/i0;->a:I

    .line 1091
    .line 1092
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1093
    .line 1094
    const-wide/32 v11, 0xf4240

    .line 1095
    .line 1096
    .line 1097
    invoke-static/range {v9 .. v15}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1098
    .line 1099
    .line 1100
    move-result-wide v6

    .line 1101
    move/from16 v2, v18

    .line 1102
    .line 1103
    invoke-virtual {v3, v2}, Lh1/w;->H(I)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 1107
    .line 1108
    .line 1109
    move-result v2

    .line 1110
    new-array v8, v2, [I

    .line 1111
    .line 1112
    new-array v11, v2, [J

    .line 1113
    .line 1114
    new-array v12, v2, [J

    .line 1115
    .line 1116
    new-array v15, v2, [J

    .line 1117
    .line 1118
    move-wide/from16 v17, v6

    .line 1119
    .line 1120
    move-object/from16 v16, v11

    .line 1121
    .line 1122
    const/4 v11, 0x0

    .line 1123
    :goto_1d
    if-ge v11, v2, :cond_3a

    .line 1124
    .line 1125
    invoke-virtual {v3}, Lh1/w;->g()I

    .line 1126
    .line 1127
    .line 1128
    move-result v19

    .line 1129
    const/high16 v20, -0x80000000

    .line 1130
    .line 1131
    and-int v20, v19, v20

    .line 1132
    .line 1133
    if-nez v20, :cond_39

    .line 1134
    .line 1135
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1136
    .line 1137
    .line 1138
    move-result-wide v24

    .line 1139
    const v20, 0x7fffffff

    .line 1140
    .line 1141
    .line 1142
    and-int v19, v19, v20

    .line 1143
    .line 1144
    aput v19, v8, v11

    .line 1145
    .line 1146
    aput-wide v4, v16, v11

    .line 1147
    .line 1148
    aput-wide v17, v15, v11

    .line 1149
    .line 1150
    add-long v9, v9, v24

    .line 1151
    .line 1152
    move/from16 v31, v11

    .line 1153
    .line 1154
    move-object/from16 v17, v12

    .line 1155
    .line 1156
    const-wide/32 v11, 0xf4240

    .line 1157
    .line 1158
    .line 1159
    move-object/from16 v18, v15

    .line 1160
    .line 1161
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1162
    .line 1163
    move/from16 p2, v2

    .line 1164
    .line 1165
    move-object/from16 v2, v16

    .line 1166
    .line 1167
    move-wide/from16 v33, v4

    .line 1168
    .line 1169
    move-object/from16 v4, v17

    .line 1170
    .line 1171
    move-wide/from16 v16, v33

    .line 1172
    .line 1173
    move-object/from16 v5, v18

    .line 1174
    .line 1175
    invoke-static/range {v9 .. v15}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v11

    .line 1179
    aget-wide v18, v5, v31

    .line 1180
    .line 1181
    sub-long v18, v11, v18

    .line 1182
    .line 1183
    aput-wide v18, v4, v31

    .line 1184
    .line 1185
    const/4 v15, 0x4

    .line 1186
    invoke-virtual {v3, v15}, Lh1/w;->H(I)V

    .line 1187
    .line 1188
    .line 1189
    aget v15, v8, v31

    .line 1190
    .line 1191
    move-wide/from16 v18, v6

    .line 1192
    .line 1193
    int-to-long v6, v15

    .line 1194
    add-long v6, v16, v6

    .line 1195
    .line 1196
    add-int/lit8 v15, v31, 0x1

    .line 1197
    .line 1198
    move-object/from16 v16, v2

    .line 1199
    .line 1200
    move/from16 v2, p2

    .line 1201
    .line 1202
    move-wide/from16 v33, v11

    .line 1203
    .line 1204
    move-object v12, v4

    .line 1205
    move v11, v15

    .line 1206
    move-object v15, v5

    .line 1207
    move-wide v4, v6

    .line 1208
    move-wide/from16 v6, v18

    .line 1209
    .line 1210
    move-wide/from16 v17, v33

    .line 1211
    .line 1212
    goto :goto_1d

    .line 1213
    :cond_39
    const-string v1, "Unhandled indirect reference"

    .line 1214
    .line 1215
    const/4 v2, 0x0

    .line 1216
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    throw v1

    .line 1221
    :cond_3a
    move-wide/from16 v18, v6

    .line 1222
    .line 1223
    move-object v4, v12

    .line 1224
    move-object v5, v15

    .line 1225
    move-object/from16 v2, v16

    .line 1226
    .line 1227
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v3

    .line 1231
    new-instance v6, Ln1/j;

    .line 1232
    .line 1233
    invoke-direct {v6, v8, v2, v4, v5}, Ln1/j;-><init>([I[J[J[J)V

    .line 1234
    .line 1235
    .line 1236
    invoke-static {v3, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v2

    .line 1240
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v3, Ljava/lang/Long;

    .line 1243
    .line 1244
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1245
    .line 1246
    .line 1247
    move-result-wide v3

    .line 1248
    iput-wide v3, v0, Lh2/i;->B:J

    .line 1249
    .line 1250
    iget-object v3, v0, Lh2/i;->I:Ln1/p;

    .line 1251
    .line 1252
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1253
    .line 1254
    check-cast v2, Ln1/c0;

    .line 1255
    .line 1256
    invoke-interface {v3, v2}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 1257
    .line 1258
    .line 1259
    const/4 v3, 0x1

    .line 1260
    iput-boolean v3, v0, Lh2/i;->L:Z

    .line 1261
    .line 1262
    goto/16 :goto_23

    .line 1263
    .line 1264
    :cond_3b
    const v2, 0x656d7367

    .line 1265
    .line 1266
    .line 1267
    if-ne v6, v2, :cond_46

    .line 1268
    .line 1269
    iget-object v2, v0, Lh2/i;->J:[Ln1/i0;

    .line 1270
    .line 1271
    array-length v2, v2

    .line 1272
    if-nez v2, :cond_3c

    .line 1273
    .line 1274
    goto/16 :goto_23

    .line 1275
    .line 1276
    :cond_3c
    const/16 v5, 0x8

    .line 1277
    .line 1278
    invoke-virtual {v3, v5}, Lh1/w;->G(I)V

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v3}, Lh1/w;->g()I

    .line 1282
    .line 1283
    .line 1284
    move-result v2

    .line 1285
    invoke-static {v2}, Lh2/d;->c(I)I

    .line 1286
    .line 1287
    .line 1288
    move-result v2

    .line 1289
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    if-eqz v2, :cond_3e

    .line 1295
    .line 1296
    const/4 v10, 0x1

    .line 1297
    if-eq v2, v10, :cond_3d

    .line 1298
    .line 1299
    const-string v3, "Skipping unsupported emsg version: "

    .line 1300
    .line 1301
    invoke-static {v3, v2, v15}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    goto/16 :goto_23

    .line 1305
    .line 1306
    :cond_3d
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1307
    .line 1308
    .line 1309
    move-result-wide v11

    .line 1310
    invoke-virtual {v3}, Lh1/w;->z()J

    .line 1311
    .line 1312
    .line 1313
    move-result-wide v7

    .line 1314
    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1315
    .line 1316
    const-wide/32 v9, 0xf4240

    .line 1317
    .line 1318
    .line 1319
    invoke-static/range {v7 .. v13}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1320
    .line 1321
    .line 1322
    move-result-wide v15

    .line 1323
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1324
    .line 1325
    .line 1326
    move-result-wide v7

    .line 1327
    const-wide/16 v9, 0x3e8

    .line 1328
    .line 1329
    invoke-static/range {v7 .. v13}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1330
    .line 1331
    .line 1332
    move-result-wide v7

    .line 1333
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1334
    .line 1335
    .line 1336
    move-result-wide v9

    .line 1337
    invoke-virtual {v3}, Lh1/w;->p()Ljava/lang/String;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v3}, Lh1/w;->p()Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v11

    .line 1348
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1349
    .line 1350
    .line 1351
    move-wide/from16 v26, v7

    .line 1352
    .line 1353
    move-wide/from16 v28, v9

    .line 1354
    .line 1355
    move-wide v9, v15

    .line 1356
    move-wide v7, v5

    .line 1357
    :goto_1e
    move-object/from16 v24, v2

    .line 1358
    .line 1359
    move-object/from16 v25, v11

    .line 1360
    .line 1361
    goto :goto_20

    .line 1362
    :cond_3e
    invoke-virtual {v3}, Lh1/w;->p()Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v3}, Lh1/w;->p()Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v11

    .line 1373
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1377
    .line 1378
    .line 1379
    move-result-wide v19

    .line 1380
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1381
    .line 1382
    .line 1383
    move-result-wide v15

    .line 1384
    sget-object v21, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1385
    .line 1386
    const-wide/32 v17, 0xf4240

    .line 1387
    .line 1388
    .line 1389
    invoke-static/range {v15 .. v21}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1390
    .line 1391
    .line 1392
    move-result-wide v7

    .line 1393
    iget-wide v9, v0, Lh2/i;->B:J

    .line 1394
    .line 1395
    cmp-long v12, v9, v5

    .line 1396
    .line 1397
    if-eqz v12, :cond_3f

    .line 1398
    .line 1399
    add-long/2addr v9, v7

    .line 1400
    goto :goto_1f

    .line 1401
    :cond_3f
    move-wide v9, v5

    .line 1402
    :goto_1f
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1403
    .line 1404
    .line 1405
    move-result-wide v15

    .line 1406
    const-wide/16 v17, 0x3e8

    .line 1407
    .line 1408
    invoke-static/range {v15 .. v21}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1409
    .line 1410
    .line 1411
    move-result-wide v12

    .line 1412
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1413
    .line 1414
    .line 1415
    move-result-wide v15

    .line 1416
    move-wide/from16 v26, v12

    .line 1417
    .line 1418
    move-wide/from16 v28, v15

    .line 1419
    .line 1420
    goto :goto_1e

    .line 1421
    :goto_20
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 1422
    .line 1423
    .line 1424
    move-result v2

    .line 1425
    new-array v2, v2, [B

    .line 1426
    .line 1427
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 1428
    .line 1429
    .line 1430
    move-result v11

    .line 1431
    const/4 v12, 0x0

    .line 1432
    invoke-virtual {v3, v2, v12, v11}, Lh1/w;->e([BII)V

    .line 1433
    .line 1434
    .line 1435
    new-instance v23, Ly1/a;

    .line 1436
    .line 1437
    move-object/from16 v30, v2

    .line 1438
    .line 1439
    invoke-direct/range {v23 .. v30}, Ly1/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 1440
    .line 1441
    .line 1442
    move-object/from16 v2, v23

    .line 1443
    .line 1444
    new-instance v3, Lh1/w;

    .line 1445
    .line 1446
    iget-object v11, v0, Lh2/i;->l:Ly1/c;

    .line 1447
    .line 1448
    invoke-virtual {v11, v2}, Ly1/c;->a(Ly1/a;)[B

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    invoke-direct {v3, v2}, Lh1/w;-><init>([B)V

    .line 1453
    .line 1454
    .line 1455
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 1456
    .line 1457
    .line 1458
    move-result v2

    .line 1459
    iget-object v11, v0, Lh2/i;->J:[Ln1/i0;

    .line 1460
    .line 1461
    array-length v12, v11

    .line 1462
    const/4 v13, 0x0

    .line 1463
    :goto_21
    if-ge v13, v12, :cond_40

    .line 1464
    .line 1465
    aget-object v15, v11, v13

    .line 1466
    .line 1467
    move-wide/from16 v16, v5

    .line 1468
    .line 1469
    const/4 v5, 0x0

    .line 1470
    invoke-virtual {v3, v5}, Lh1/w;->G(I)V

    .line 1471
    .line 1472
    .line 1473
    invoke-interface {v15, v3, v2}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 1474
    .line 1475
    .line 1476
    add-int/lit8 v13, v13, 0x1

    .line 1477
    .line 1478
    move-wide/from16 v5, v16

    .line 1479
    .line 1480
    goto :goto_21

    .line 1481
    :cond_40
    move-wide/from16 v16, v5

    .line 1482
    .line 1483
    cmp-long v3, v9, v16

    .line 1484
    .line 1485
    if-nez v3, :cond_41

    .line 1486
    .line 1487
    new-instance v3, Lh2/g;

    .line 1488
    .line 1489
    const/4 v10, 0x1

    .line 1490
    invoke-direct {v3, v2, v10, v7, v8}, Lh2/g;-><init>(IZJ)V

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1494
    .line 1495
    .line 1496
    iget v3, v0, Lh2/i;->y:I

    .line 1497
    .line 1498
    add-int/2addr v3, v2

    .line 1499
    iput v3, v0, Lh2/i;->y:I

    .line 1500
    .line 1501
    goto :goto_23

    .line 1502
    :cond_41
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1503
    .line 1504
    .line 1505
    move-result v3

    .line 1506
    if-nez v3, :cond_42

    .line 1507
    .line 1508
    new-instance v3, Lh2/g;

    .line 1509
    .line 1510
    const/4 v5, 0x0

    .line 1511
    invoke-direct {v3, v2, v5, v9, v10}, Lh2/g;-><init>(IZJ)V

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1515
    .line 1516
    .line 1517
    iget v3, v0, Lh2/i;->y:I

    .line 1518
    .line 1519
    add-int/2addr v3, v2

    .line 1520
    iput v3, v0, Lh2/i;->y:I

    .line 1521
    .line 1522
    goto :goto_23

    .line 1523
    :cond_42
    const/4 v5, 0x0

    .line 1524
    if-eqz v4, :cond_43

    .line 1525
    .line 1526
    invoke-virtual {v4}, Lh1/d0;->e()Z

    .line 1527
    .line 1528
    .line 1529
    move-result v3

    .line 1530
    if-nez v3, :cond_43

    .line 1531
    .line 1532
    new-instance v3, Lh2/g;

    .line 1533
    .line 1534
    invoke-direct {v3, v2, v5, v9, v10}, Lh2/g;-><init>(IZJ)V

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1538
    .line 1539
    .line 1540
    iget v3, v0, Lh2/i;->y:I

    .line 1541
    .line 1542
    add-int/2addr v3, v2

    .line 1543
    iput v3, v0, Lh2/i;->y:I

    .line 1544
    .line 1545
    goto :goto_23

    .line 1546
    :cond_43
    if-eqz v4, :cond_44

    .line 1547
    .line 1548
    invoke-virtual {v4, v9, v10}, Lh1/d0;->a(J)J

    .line 1549
    .line 1550
    .line 1551
    move-result-wide v9

    .line 1552
    :cond_44
    move-wide/from16 v16, v9

    .line 1553
    .line 1554
    iget-object v3, v0, Lh2/i;->J:[Ln1/i0;

    .line 1555
    .line 1556
    array-length v4, v3

    .line 1557
    const/4 v13, 0x0

    .line 1558
    :goto_22
    if-ge v13, v4, :cond_46

    .line 1559
    .line 1560
    aget-object v15, v3, v13

    .line 1561
    .line 1562
    const/16 v20, 0x0

    .line 1563
    .line 1564
    const/16 v21, 0x0

    .line 1565
    .line 1566
    const/16 v18, 0x1

    .line 1567
    .line 1568
    move/from16 v19, v2

    .line 1569
    .line 1570
    invoke-interface/range {v15 .. v21}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 1571
    .line 1572
    .line 1573
    add-int/lit8 v13, v13, 0x1

    .line 1574
    .line 1575
    goto :goto_22

    .line 1576
    :cond_45
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 1577
    .line 1578
    .line 1579
    :cond_46
    :goto_23
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1580
    .line 1581
    .line 1582
    move-result-wide v2

    .line 1583
    invoke-virtual {v0, v2, v3}, Lh2/i;->c(J)V

    .line 1584
    .line 1585
    .line 1586
    goto/16 :goto_0

    .line 1587
    .line 1588
    :cond_47
    move-object v12, v7

    .line 1589
    iget v2, v0, Lh2/i;->v:I

    .line 1590
    .line 1591
    iget-object v3, v0, Lh2/i;->m:Lh1/w;

    .line 1592
    .line 1593
    if-nez v2, :cond_49

    .line 1594
    .line 1595
    iget-object v2, v3, Lh1/w;->a:[B

    .line 1596
    .line 1597
    const/4 v6, 0x0

    .line 1598
    const/16 v7, 0x8

    .line 1599
    .line 1600
    const/4 v10, 0x1

    .line 1601
    invoke-interface {v1, v2, v6, v7, v10}, Ln1/o;->a([BIIZ)Z

    .line 1602
    .line 1603
    .line 1604
    move-result v2

    .line 1605
    if-nez v2, :cond_48

    .line 1606
    .line 1607
    invoke-virtual {v12, v6}, Li1/s;->i(I)V

    .line 1608
    .line 1609
    .line 1610
    const/16 v19, -0x1

    .line 1611
    .line 1612
    return v19

    .line 1613
    :cond_48
    iput v7, v0, Lh2/i;->v:I

    .line 1614
    .line 1615
    invoke-virtual {v3, v6}, Lh1/w;->G(I)V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v3}, Lh1/w;->w()J

    .line 1619
    .line 1620
    .line 1621
    move-result-wide v6

    .line 1622
    iput-wide v6, v0, Lh2/i;->u:J

    .line 1623
    .line 1624
    invoke-virtual {v3}, Lh1/w;->g()I

    .line 1625
    .line 1626
    .line 1627
    move-result v2

    .line 1628
    iput v2, v0, Lh2/i;->t:I

    .line 1629
    .line 1630
    :cond_49
    iget-wide v6, v0, Lh2/i;->u:J

    .line 1631
    .line 1632
    const-wide/16 v9, 0x1

    .line 1633
    .line 1634
    cmp-long v2, v6, v9

    .line 1635
    .line 1636
    if-nez v2, :cond_4a

    .line 1637
    .line 1638
    iget-object v2, v3, Lh1/w;->a:[B

    .line 1639
    .line 1640
    const/16 v7, 0x8

    .line 1641
    .line 1642
    invoke-interface {v1, v2, v7, v7}, Ln1/o;->readFully([BII)V

    .line 1643
    .line 1644
    .line 1645
    iget v2, v0, Lh2/i;->v:I

    .line 1646
    .line 1647
    add-int/2addr v2, v7

    .line 1648
    iput v2, v0, Lh2/i;->v:I

    .line 1649
    .line 1650
    invoke-virtual {v3}, Lh1/w;->z()J

    .line 1651
    .line 1652
    .line 1653
    move-result-wide v6

    .line 1654
    iput-wide v6, v0, Lh2/i;->u:J

    .line 1655
    .line 1656
    goto :goto_24

    .line 1657
    :cond_4a
    const-wide/16 v9, 0x0

    .line 1658
    .line 1659
    cmp-long v2, v6, v9

    .line 1660
    .line 1661
    if-nez v2, :cond_4c

    .line 1662
    .line 1663
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 1664
    .line 1665
    .line 1666
    move-result-wide v6

    .line 1667
    const-wide/16 v9, -0x1

    .line 1668
    .line 1669
    cmp-long v2, v6, v9

    .line 1670
    .line 1671
    if-nez v2, :cond_4b

    .line 1672
    .line 1673
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1674
    .line 1675
    .line 1676
    move-result v2

    .line 1677
    if-nez v2, :cond_4b

    .line 1678
    .line 1679
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v2

    .line 1683
    check-cast v2, Li1/b;

    .line 1684
    .line 1685
    iget-wide v6, v2, Li1/b;->c:J

    .line 1686
    .line 1687
    :cond_4b
    cmp-long v2, v6, v9

    .line 1688
    .line 1689
    if-eqz v2, :cond_4c

    .line 1690
    .line 1691
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1692
    .line 1693
    .line 1694
    move-result-wide v9

    .line 1695
    sub-long/2addr v6, v9

    .line 1696
    iget v2, v0, Lh2/i;->v:I

    .line 1697
    .line 1698
    int-to-long v9, v2

    .line 1699
    add-long/2addr v6, v9

    .line 1700
    iput-wide v6, v0, Lh2/i;->u:J

    .line 1701
    .line 1702
    :cond_4c
    :goto_24
    iget-wide v6, v0, Lh2/i;->u:J

    .line 1703
    .line 1704
    iget v2, v0, Lh2/i;->v:I

    .line 1705
    .line 1706
    int-to-long v9, v2

    .line 1707
    cmp-long v2, v6, v9

    .line 1708
    .line 1709
    if-ltz v2, :cond_59

    .line 1710
    .line 1711
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1712
    .line 1713
    .line 1714
    move-result-wide v6

    .line 1715
    iget v2, v0, Lh2/i;->v:I

    .line 1716
    .line 1717
    int-to-long v9, v2

    .line 1718
    sub-long/2addr v6, v9

    .line 1719
    iget v2, v0, Lh2/i;->t:I

    .line 1720
    .line 1721
    const v4, 0x6d646174

    .line 1722
    .line 1723
    .line 1724
    const v9, 0x6d6f6f66

    .line 1725
    .line 1726
    .line 1727
    if-eq v2, v9, :cond_4d

    .line 1728
    .line 1729
    if-ne v2, v4, :cond_4e

    .line 1730
    .line 1731
    :cond_4d
    iget-boolean v2, v0, Lh2/i;->L:Z

    .line 1732
    .line 1733
    if-nez v2, :cond_4e

    .line 1734
    .line 1735
    iget-object v2, v0, Lh2/i;->I:Ln1/p;

    .line 1736
    .line 1737
    new-instance v10, Ln1/s;

    .line 1738
    .line 1739
    iget-wide v11, v0, Lh2/i;->A:J

    .line 1740
    .line 1741
    invoke-direct {v10, v11, v12, v6, v7}, Ln1/s;-><init>(JJ)V

    .line 1742
    .line 1743
    .line 1744
    invoke-interface {v2, v10}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 1745
    .line 1746
    .line 1747
    const/4 v10, 0x1

    .line 1748
    iput-boolean v10, v0, Lh2/i;->L:Z

    .line 1749
    .line 1750
    :cond_4e
    iget v2, v0, Lh2/i;->t:I

    .line 1751
    .line 1752
    if-ne v2, v9, :cond_4f

    .line 1753
    .line 1754
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 1755
    .line 1756
    .line 1757
    move-result v2

    .line 1758
    const/4 v10, 0x0

    .line 1759
    :goto_25
    if-ge v10, v2, :cond_4f

    .line 1760
    .line 1761
    invoke-virtual {v8, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v11

    .line 1765
    check-cast v11, Lh2/h;

    .line 1766
    .line 1767
    iget-object v11, v11, Lh2/h;->b:Lh2/s;

    .line 1768
    .line 1769
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1770
    .line 1771
    .line 1772
    iput-wide v6, v11, Lh2/s;->c:J

    .line 1773
    .line 1774
    iput-wide v6, v11, Lh2/s;->b:J

    .line 1775
    .line 1776
    add-int/lit8 v10, v10, 0x1

    .line 1777
    .line 1778
    goto :goto_25

    .line 1779
    :cond_4f
    iget v2, v0, Lh2/i;->t:I

    .line 1780
    .line 1781
    if-ne v2, v4, :cond_50

    .line 1782
    .line 1783
    const/4 v4, 0x0

    .line 1784
    iput-object v4, v0, Lh2/i;->C:Lh2/h;

    .line 1785
    .line 1786
    iget-wide v2, v0, Lh2/i;->u:J

    .line 1787
    .line 1788
    add-long/2addr v6, v2

    .line 1789
    iput-wide v6, v0, Lh2/i;->x:J

    .line 1790
    .line 1791
    const/4 v2, 0x2

    .line 1792
    iput v2, v0, Lh2/i;->s:I

    .line 1793
    .line 1794
    goto/16 :goto_0

    .line 1795
    .line 1796
    :cond_50
    const v4, 0x6d6f6f76

    .line 1797
    .line 1798
    .line 1799
    if-eq v2, v4, :cond_57

    .line 1800
    .line 1801
    const v4, 0x7472616b

    .line 1802
    .line 1803
    .line 1804
    if-eq v2, v4, :cond_57

    .line 1805
    .line 1806
    const v4, 0x6d646961

    .line 1807
    .line 1808
    .line 1809
    if-eq v2, v4, :cond_57

    .line 1810
    .line 1811
    const v4, 0x6d696e66

    .line 1812
    .line 1813
    .line 1814
    if-eq v2, v4, :cond_57

    .line 1815
    .line 1816
    const v4, 0x7374626c

    .line 1817
    .line 1818
    .line 1819
    if-eq v2, v4, :cond_57

    .line 1820
    .line 1821
    if-eq v2, v9, :cond_57

    .line 1822
    .line 1823
    const v4, 0x74726166

    .line 1824
    .line 1825
    .line 1826
    if-eq v2, v4, :cond_57

    .line 1827
    .line 1828
    const v4, 0x6d766578

    .line 1829
    .line 1830
    .line 1831
    if-eq v2, v4, :cond_57

    .line 1832
    .line 1833
    const v4, 0x65647473

    .line 1834
    .line 1835
    .line 1836
    if-ne v2, v4, :cond_51

    .line 1837
    .line 1838
    goto/16 :goto_27

    .line 1839
    .line 1840
    :cond_51
    const v4, 0x68646c72    # 4.3148E24f

    .line 1841
    .line 1842
    .line 1843
    const-wide/32 v5, 0x7fffffff

    .line 1844
    .line 1845
    .line 1846
    if-eq v2, v4, :cond_54

    .line 1847
    .line 1848
    const v4, 0x6d646864

    .line 1849
    .line 1850
    .line 1851
    if-eq v2, v4, :cond_54

    .line 1852
    .line 1853
    const v4, 0x6d766864

    .line 1854
    .line 1855
    .line 1856
    if-eq v2, v4, :cond_54

    .line 1857
    .line 1858
    const v4, 0x73696478

    .line 1859
    .line 1860
    .line 1861
    if-eq v2, v4, :cond_54

    .line 1862
    .line 1863
    const v4, 0x73747364

    .line 1864
    .line 1865
    .line 1866
    if-eq v2, v4, :cond_54

    .line 1867
    .line 1868
    const v4, 0x73747473

    .line 1869
    .line 1870
    .line 1871
    if-eq v2, v4, :cond_54

    .line 1872
    .line 1873
    const v4, 0x63747473

    .line 1874
    .line 1875
    .line 1876
    if-eq v2, v4, :cond_54

    .line 1877
    .line 1878
    const v4, 0x73747363

    .line 1879
    .line 1880
    .line 1881
    if-eq v2, v4, :cond_54

    .line 1882
    .line 1883
    const v4, 0x7374737a

    .line 1884
    .line 1885
    .line 1886
    if-eq v2, v4, :cond_54

    .line 1887
    .line 1888
    const v4, 0x73747a32

    .line 1889
    .line 1890
    .line 1891
    if-eq v2, v4, :cond_54

    .line 1892
    .line 1893
    const v4, 0x7374636f

    .line 1894
    .line 1895
    .line 1896
    if-eq v2, v4, :cond_54

    .line 1897
    .line 1898
    const v4, 0x636f3634

    .line 1899
    .line 1900
    .line 1901
    if-eq v2, v4, :cond_54

    .line 1902
    .line 1903
    const v4, 0x73747373

    .line 1904
    .line 1905
    .line 1906
    if-eq v2, v4, :cond_54

    .line 1907
    .line 1908
    const v4, 0x74666474

    .line 1909
    .line 1910
    .line 1911
    if-eq v2, v4, :cond_54

    .line 1912
    .line 1913
    const v4, 0x74666864

    .line 1914
    .line 1915
    .line 1916
    if-eq v2, v4, :cond_54

    .line 1917
    .line 1918
    const v4, 0x746b6864

    .line 1919
    .line 1920
    .line 1921
    if-eq v2, v4, :cond_54

    .line 1922
    .line 1923
    const v4, 0x74726578

    .line 1924
    .line 1925
    .line 1926
    if-eq v2, v4, :cond_54

    .line 1927
    .line 1928
    const v4, 0x7472756e

    .line 1929
    .line 1930
    .line 1931
    if-eq v2, v4, :cond_54

    .line 1932
    .line 1933
    const v4, 0x70737368    # 3.013775E29f

    .line 1934
    .line 1935
    .line 1936
    if-eq v2, v4, :cond_54

    .line 1937
    .line 1938
    const v4, 0x7361697a

    .line 1939
    .line 1940
    .line 1941
    if-eq v2, v4, :cond_54

    .line 1942
    .line 1943
    const v4, 0x7361696f

    .line 1944
    .line 1945
    .line 1946
    if-eq v2, v4, :cond_54

    .line 1947
    .line 1948
    const v4, 0x73656e63

    .line 1949
    .line 1950
    .line 1951
    if-eq v2, v4, :cond_54

    .line 1952
    .line 1953
    const v4, 0x75756964

    .line 1954
    .line 1955
    .line 1956
    if-eq v2, v4, :cond_54

    .line 1957
    .line 1958
    const v4, 0x73626770

    .line 1959
    .line 1960
    .line 1961
    if-eq v2, v4, :cond_54

    .line 1962
    .line 1963
    const v4, 0x73677064

    .line 1964
    .line 1965
    .line 1966
    if-eq v2, v4, :cond_54

    .line 1967
    .line 1968
    const v4, 0x656c7374

    .line 1969
    .line 1970
    .line 1971
    if-eq v2, v4, :cond_54

    .line 1972
    .line 1973
    const v4, 0x6d656864

    .line 1974
    .line 1975
    .line 1976
    if-eq v2, v4, :cond_54

    .line 1977
    .line 1978
    const v4, 0x656d7367

    .line 1979
    .line 1980
    .line 1981
    if-ne v2, v4, :cond_52

    .line 1982
    .line 1983
    goto :goto_26

    .line 1984
    :cond_52
    iget-wide v2, v0, Lh2/i;->u:J

    .line 1985
    .line 1986
    cmp-long v2, v2, v5

    .line 1987
    .line 1988
    if-gtz v2, :cond_53

    .line 1989
    .line 1990
    const/4 v2, 0x0

    .line 1991
    iput-object v2, v0, Lh2/i;->w:Lh1/w;

    .line 1992
    .line 1993
    const/4 v10, 0x1

    .line 1994
    iput v10, v0, Lh2/i;->s:I

    .line 1995
    .line 1996
    goto/16 :goto_0

    .line 1997
    .line 1998
    :cond_53
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 1999
    .line 2000
    invoke-static {v1}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v1

    .line 2004
    throw v1

    .line 2005
    :cond_54
    :goto_26
    iget v2, v0, Lh2/i;->v:I

    .line 2006
    .line 2007
    const/16 v7, 0x8

    .line 2008
    .line 2009
    if-ne v2, v7, :cond_56

    .line 2010
    .line 2011
    iget-wide v8, v0, Lh2/i;->u:J

    .line 2012
    .line 2013
    cmp-long v2, v8, v5

    .line 2014
    .line 2015
    if-gtz v2, :cond_55

    .line 2016
    .line 2017
    new-instance v2, Lh1/w;

    .line 2018
    .line 2019
    iget-wide v4, v0, Lh2/i;->u:J

    .line 2020
    .line 2021
    long-to-int v4, v4

    .line 2022
    invoke-direct {v2, v4}, Lh1/w;-><init>(I)V

    .line 2023
    .line 2024
    .line 2025
    iget-object v3, v3, Lh1/w;->a:[B

    .line 2026
    .line 2027
    iget-object v4, v2, Lh1/w;->a:[B

    .line 2028
    .line 2029
    const/4 v5, 0x0

    .line 2030
    invoke-static {v3, v5, v4, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2031
    .line 2032
    .line 2033
    iput-object v2, v0, Lh2/i;->w:Lh1/w;

    .line 2034
    .line 2035
    const/4 v10, 0x1

    .line 2036
    iput v10, v0, Lh2/i;->s:I

    .line 2037
    .line 2038
    goto/16 :goto_0

    .line 2039
    .line 2040
    :cond_55
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 2041
    .line 2042
    invoke-static {v1}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v1

    .line 2046
    throw v1

    .line 2047
    :cond_56
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 2048
    .line 2049
    invoke-static {v1}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v1

    .line 2053
    throw v1

    .line 2054
    :cond_57
    :goto_27
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 2055
    .line 2056
    .line 2057
    move-result-wide v2

    .line 2058
    iget-wide v6, v0, Lh2/i;->u:J

    .line 2059
    .line 2060
    add-long/2addr v2, v6

    .line 2061
    const-wide/16 v6, 0x8

    .line 2062
    .line 2063
    sub-long/2addr v2, v6

    .line 2064
    new-instance v4, Li1/b;

    .line 2065
    .line 2066
    iget v6, v0, Lh2/i;->t:I

    .line 2067
    .line 2068
    invoke-direct {v4, v6, v2, v3}, Li1/b;-><init>(IJ)V

    .line 2069
    .line 2070
    .line 2071
    invoke-virtual {v5, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 2072
    .line 2073
    .line 2074
    iget-wide v4, v0, Lh2/i;->u:J

    .line 2075
    .line 2076
    iget v6, v0, Lh2/i;->v:I

    .line 2077
    .line 2078
    int-to-long v6, v6

    .line 2079
    cmp-long v4, v4, v6

    .line 2080
    .line 2081
    if-nez v4, :cond_58

    .line 2082
    .line 2083
    invoke-virtual {v0, v2, v3}, Lh2/i;->c(J)V

    .line 2084
    .line 2085
    .line 2086
    goto/16 :goto_0

    .line 2087
    .line 2088
    :cond_58
    const/4 v5, 0x0

    .line 2089
    iput v5, v0, Lh2/i;->s:I

    .line 2090
    .line 2091
    iput v5, v0, Lh2/i;->v:I

    .line 2092
    .line 2093
    goto/16 :goto_0

    .line 2094
    .line 2095
    :cond_59
    const-string v1, "Atom size less than header length (unsupported)."

    .line 2096
    .line 2097
    invoke-static {v1}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v1

    .line 2101
    throw v1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, Lh2/i;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lh2/h;

    .line 16
    .line 17
    invoke-virtual {v2}, Lh2/h;->e()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Lh2/i;->o:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, Lh2/i;->y:I

    .line 29
    .line 30
    iget-object p1, p0, Lh2/i;->p:Li1/s;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Li1/s;->i(I)V

    .line 33
    .line 34
    .line 35
    iput-wide p3, p0, Lh2/i;->z:J

    .line 36
    .line 37
    iget-object p1, p0, Lh2/i;->n:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 40
    .line 41
    .line 42
    iput v0, p0, Lh2/i;->s:I

    .line 43
    .line 44
    iput v0, p0, Lh2/i;->v:I

    .line 45
    .line 46
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, Lh2/p;->l(Ln1/o;ZZ)Ln1/g0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v2, Lf6/m0;->k:Lf6/k0;

    .line 15
    .line 16
    sget-object v2, Lf6/l1;->n:Lf6/l1;

    .line 17
    .line 18
    :goto_0
    iput-object v2, p0, Lh2/i;->r:Lf6/l1;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    return v1
.end method
