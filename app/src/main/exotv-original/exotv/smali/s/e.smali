.class public final Ls/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lk2/q;
.implements Lm0/o;
.implements Ln1/i;
.implements Lt2/c0;
.implements Lv0/o;


# instance fields
.field public final synthetic j:I

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Ls/e;->j:I

    sparse-switch p1, :sswitch_data_0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Lh1/w;

    invoke-direct {p1}, Lh1/w;-><init>()V

    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 9
    new-instance p1, Ls2/a;

    invoke-direct {p1}, Ls2/a;-><init>()V

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Lp/k;

    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Lp/k;-><init>(I)V

    .line 13
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 14
    new-instance p1, Lp/h;

    invoke-direct {p1}, Lp/h;-><init>()V

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 17
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 20
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0xa -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Ls/e;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 5

    const/16 v0, 0x9

    iput v0, p0, Ls/e;->j:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 32
    new-instance v0, Lx0/i;

    invoke-direct {v0, p1}, Lx0/i;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 33
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 34
    sget-object v0, Lx0/a;->b:Lx0/a;

    if-nez v0, :cond_1

    .line 35
    sget-object v0, Lx0/a;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-object v1, Lx0/a;->b:Lx0/a;

    if-nez v1, :cond_0

    .line 37
    new-instance v1, Lx0/a;

    .line 38
    invoke-direct {v1}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    :try_start_1
    const-string v2, "android.text.DynamicLayout$ChangeWatcher"

    .line 40
    const-class v3, Lx0/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lx0/a;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :catchall_0
    :try_start_2
    sput-object v1, Lx0/a;->b:Lx0/a;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 43
    :cond_1
    :goto_2
    sget-object v0, Lx0/a;->b:Lx0/a;

    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method

.method public constructor <init>(Lh1/d0;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ls/e;->j:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 23
    new-instance p1, Lh1/w;

    invoke-direct {p1}, Lh1/w;-><init>()V

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, Ls/e;->j:I

    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    iput-object p3, p0, Ls/e;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Ls/e;->j:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ln1/i0;

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls/f;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls/e;->j:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt2/e0;)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, Ls/e;->j:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    .line 46
    new-instance p1, Lh1/v;

    new-array v1, v0, [B

    .line 47
    invoke-direct {p1, v1, v0}, Lh1/v;-><init>([BI)V

    .line 48
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz2/d0;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Ls/e;->j:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 26
    new-instance p1, Lo2/a;

    .line 27
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput v0, p1, Lo2/a;->a:I

    .line 29
    iput-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public static q(II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-le v2, p1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    move v2, v4

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v2, v4

    .line 25
    if-le v2, p1, :cond_3

    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    :cond_3
    return v3
.end method


# virtual methods
.method public a(Lh1/w;)V
    .locals 10

    .line 1
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt2/e0;

    .line 4
    .line 5
    iget-object v1, v0, Lt2/e0;->h:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object v2, p0, Ls/e;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lh1/v;

    .line 10
    .line 11
    invoke-virtual {p1}, Lh1/w;->u()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-virtual {p1}, Lh1/w;->u()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    and-int/lit16 v3, v3, 0x80

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    const/4 v3, 0x6

    .line 28
    invoke-virtual {p1, v3}, Lh1/w;->H(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lh1/w;->a()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x4

    .line 36
    div-int/2addr v3, v4

    .line 37
    const/4 v5, 0x0

    .line 38
    move v6, v5

    .line 39
    :goto_0
    if-ge v6, v3, :cond_4

    .line 40
    .line 41
    iget-object v7, v2, Lh1/v;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, [B

    .line 44
    .line 45
    invoke-virtual {p1, v7, v5, v4}, Lh1/w;->e([BII)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v5}, Lh1/v;->s(I)V

    .line 49
    .line 50
    .line 51
    const/16 v7, 0x10

    .line 52
    .line 53
    invoke-virtual {v2, v7}, Lh1/v;->k(I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    const/4 v8, 0x3

    .line 58
    invoke-virtual {v2, v8}, Lh1/v;->v(I)V

    .line 59
    .line 60
    .line 61
    const/16 v8, 0xd

    .line 62
    .line 63
    if-nez v7, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2, v8}, Lh1/v;->v(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v2, v8}, Lh1/v;->k(I)I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    if-nez v8, :cond_3

    .line 78
    .line 79
    new-instance v8, Lt2/d0;

    .line 80
    .line 81
    new-instance v9, Li2/j;

    .line 82
    .line 83
    invoke-direct {v9, v0, v7}, Li2/j;-><init>(Lt2/e0;I)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v8, v9}, Lt2/d0;-><init>(Lt2/c0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v7, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget v7, v0, Lt2/e0;->n:I

    .line 93
    .line 94
    add-int/lit8 v7, v7, 0x1

    .line 95
    .line 96
    iput v7, v0, Lt2/e0;->n:I

    .line 97
    .line 98
    :cond_3
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    iget p1, v0, Lt2/e0;->a:I

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    if-eq p1, v0, :cond_5

    .line 105
    .line 106
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->remove(I)V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_2
    return-void
.end method

.method public b(Lh1/d0;Ln1/p;Lt2/g0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ln1/o;J)Ln1/h;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ln1/o;->getPosition()J

    .line 4
    .line 5
    .line 6
    move-result-wide v5

    .line 7
    invoke-interface/range {p1 .. p1}, Ln1/o;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    sub-long/2addr v1, v5

    .line 12
    const-wide/16 v3, 0x4e20

    .line 13
    .line 14
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    long-to-int v1, v1

    .line 19
    iget-object v2, v0, Ls/e;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lh1/w;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lh1/w;->D(I)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v2, Lh1/w;->a:[B

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    move-object/from16 v7, p1

    .line 30
    .line 31
    invoke-interface {v7, v3, v4, v1}, Ln1/o;->i([BII)V

    .line 32
    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    move v7, v1

    .line 41
    move-wide v10, v3

    .line 42
    :goto_0
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    const/4 v9, 0x4

    .line 47
    if-lt v8, v9, :cond_e

    .line 48
    .line 49
    iget-object v8, v2, Lh1/w;->a:[B

    .line 50
    .line 51
    iget v12, v2, Lh1/w;->b:I

    .line 52
    .line 53
    invoke-static {v8, v12}, Ls1/b;->a([BI)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const/4 v12, 0x1

    .line 58
    const/16 v13, 0x1ba

    .line 59
    .line 60
    if-eq v8, v13, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2, v12}, Lh1/w;->H(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v2, v9}, Lh1/w;->H(I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, Lt2/z;->c(Lh1/w;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v14

    .line 73
    cmp-long v1, v14, v3

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    iget-object v1, v0, Ls/e;->k:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Lh1/d0;

    .line 80
    .line 81
    invoke-virtual {v1, v14, v15}, Lh1/d0;->b(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v14

    .line 85
    cmp-long v1, v14, p2

    .line 86
    .line 87
    if-lez v1, :cond_2

    .line 88
    .line 89
    cmp-long v1, v10, v3

    .line 90
    .line 91
    if-nez v1, :cond_1

    .line 92
    .line 93
    new-instance v1, Ln1/h;

    .line 94
    .line 95
    const/4 v2, -0x1

    .line 96
    move-wide v3, v14

    .line 97
    invoke-direct/range {v1 .. v6}, Ln1/h;-><init>(IJJ)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_1
    int-to-long v1, v7

    .line 102
    add-long v11, v5, v1

    .line 103
    .line 104
    new-instance v7, Ln1/h;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-direct/range {v7 .. v12}, Ln1/h;-><init>(IJJ)V

    .line 113
    .line 114
    .line 115
    return-object v7

    .line 116
    :cond_2
    move-wide v7, v14

    .line 117
    const-wide/32 v10, 0x186a0

    .line 118
    .line 119
    .line 120
    add-long v14, v7, v10

    .line 121
    .line 122
    cmp-long v1, v14, p2

    .line 123
    .line 124
    if-lez v1, :cond_3

    .line 125
    .line 126
    iget v1, v2, Lh1/w;->b:I

    .line 127
    .line 128
    int-to-long v1, v1

    .line 129
    add-long v11, v5, v1

    .line 130
    .line 131
    new-instance v7, Ln1/h;

    .line 132
    .line 133
    const/4 v8, 0x0

    .line 134
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    invoke-direct/range {v7 .. v12}, Ln1/h;-><init>(IJJ)V

    .line 140
    .line 141
    .line 142
    return-object v7

    .line 143
    :cond_3
    iget v1, v2, Lh1/w;->b:I

    .line 144
    .line 145
    move-wide v10, v7

    .line 146
    move v7, v1

    .line 147
    :cond_4
    iget v1, v2, Lh1/w;->c:I

    .line 148
    .line 149
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    const/16 v14, 0xa

    .line 154
    .line 155
    if-ge v8, v14, :cond_5

    .line 156
    .line 157
    invoke-virtual {v2, v1}, Lh1/w;->G(I)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_2

    .line 161
    .line 162
    :cond_5
    const/16 v8, 0x9

    .line 163
    .line 164
    invoke-virtual {v2, v8}, Lh1/w;->H(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    and-int/lit8 v8, v8, 0x7

    .line 172
    .line 173
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-ge v14, v8, :cond_6

    .line 178
    .line 179
    invoke-virtual {v2, v1}, Lh1/w;->G(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    invoke-virtual {v2, v8}, Lh1/w;->H(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-ge v8, v9, :cond_7

    .line 191
    .line 192
    invoke-virtual {v2, v1}, Lh1/w;->G(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_7
    iget-object v8, v2, Lh1/w;->a:[B

    .line 197
    .line 198
    iget v14, v2, Lh1/w;->b:I

    .line 199
    .line 200
    invoke-static {v8, v14}, Ls1/b;->a([BI)I

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    const/16 v14, 0x1bb

    .line 205
    .line 206
    if-ne v8, v14, :cond_9

    .line 207
    .line 208
    invoke-virtual {v2, v9}, Lh1/w;->H(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    if-ge v14, v8, :cond_8

    .line 220
    .line 221
    invoke-virtual {v2, v1}, Lh1/w;->G(I)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_8
    invoke-virtual {v2, v8}, Lh1/w;->H(I)V

    .line 226
    .line 227
    .line 228
    :cond_9
    :goto_1
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-lt v8, v9, :cond_d

    .line 233
    .line 234
    iget-object v8, v2, Lh1/w;->a:[B

    .line 235
    .line 236
    iget v14, v2, Lh1/w;->b:I

    .line 237
    .line 238
    invoke-static {v8, v14}, Ls1/b;->a([BI)I

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-eq v8, v13, :cond_d

    .line 243
    .line 244
    const/16 v14, 0x1b9

    .line 245
    .line 246
    if-ne v8, v14, :cond_a

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_a
    ushr-int/lit8 v8, v8, 0x8

    .line 250
    .line 251
    if-eq v8, v12, :cond_b

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_b
    invoke-virtual {v2, v9}, Lh1/w;->H(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    const/4 v14, 0x2

    .line 262
    if-ge v8, v14, :cond_c

    .line 263
    .line 264
    invoke-virtual {v2, v1}, Lh1/w;->G(I)V

    .line 265
    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_c
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    iget v14, v2, Lh1/w;->c:I

    .line 273
    .line 274
    iget v15, v2, Lh1/w;->b:I

    .line 275
    .line 276
    add-int/2addr v15, v8

    .line 277
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    invoke-virtual {v2, v8}, Lh1/w;->G(I)V

    .line 282
    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_d
    :goto_2
    iget v1, v2, Lh1/w;->b:I

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_e
    cmp-long v2, v10, v3

    .line 290
    .line 291
    if-eqz v2, :cond_f

    .line 292
    .line 293
    int-to-long v1, v1

    .line 294
    add-long v12, v5, v1

    .line 295
    .line 296
    new-instance v8, Ln1/h;

    .line 297
    .line 298
    const/4 v9, -0x2

    .line 299
    invoke-direct/range {v8 .. v13}, Ln1/h;-><init>(IJJ)V

    .line 300
    .line 301
    .line 302
    return-object v8

    .line 303
    :cond_f
    sget-object v1, Ln1/h;->d:Ln1/h;

    .line 304
    .line 305
    return-object v1
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv0/y;

    .line 4
    .line 5
    return-object v0
.end method

.method public f([BIILk2/p;Lh1/f;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, Ls/e;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lh1/w;

    .line 8
    .line 9
    add-int v3, v0, p3

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    invoke-virtual {v2, v4, v3}, Lh1/w;->E([BI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lh1/w;->G(I)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-static {v2}, Ls2/i;->d(Lh1/w;)V
    :try_end_0
    .catch Landroidx/media3/common/v0; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_1
    const/4 v4, 0x0

    .line 46
    const/4 v5, -0x1

    .line 47
    move v7, v4

    .line 48
    move v6, v5

    .line 49
    :goto_2
    const/4 v9, 0x1

    .line 50
    const/4 v10, 0x2

    .line 51
    if-ne v6, v5, :cond_5

    .line 52
    .line 53
    iget v7, v2, Lh1/w;->b:I

    .line 54
    .line 55
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 56
    .line 57
    invoke-virtual {v2, v6}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    move v6, v4

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const-string v11, "STYLE"

    .line 66
    .line 67
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    if-eqz v11, :cond_3

    .line 72
    .line 73
    move v6, v10

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const-string v10, "NOTE"

    .line 76
    .line 77
    invoke-virtual {v6, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    move v6, v9

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    const/4 v6, 0x3

    .line 86
    goto :goto_2

    .line 87
    :cond_5
    invoke-virtual {v2, v7}, Lh1/w;->G(I)V

    .line 88
    .line 89
    .line 90
    if-eqz v6, :cond_3d

    .line 91
    .line 92
    if-ne v6, v9, :cond_6

    .line 93
    .line 94
    :goto_3
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    const/4 v7, 0x0

    .line 108
    if-ne v6, v10, :cond_38

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_37

    .line 115
    .line 116
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 117
    .line 118
    invoke-virtual {v2, v6}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    iget-object v6, v1, Ls/e;->l:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v6, Ls2/a;

    .line 124
    .line 125
    iget-object v11, v6, Ls2/a;->a:Lh1/w;

    .line 126
    .line 127
    iget-object v6, v6, Ls2/a;->b:Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 130
    .line 131
    .line 132
    iget v12, v2, Lh1/w;->b:I

    .line 133
    .line 134
    :goto_4
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 135
    .line 136
    invoke-virtual {v2, v13}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-eqz v13, :cond_36

    .line 145
    .line 146
    iget-object v13, v2, Lh1/w;->a:[B

    .line 147
    .line 148
    iget v14, v2, Lh1/w;->b:I

    .line 149
    .line 150
    invoke-virtual {v11, v13, v14}, Lh1/w;->E([BI)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v11, v12}, Lh1/w;->G(I)V

    .line 154
    .line 155
    .line 156
    new-instance v12, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    :goto_5
    invoke-static {v11}, Ls2/a;->c(Lh1/w;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v11}, Lh1/w;->a()I

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    const-string v14, "{"

    .line 169
    .line 170
    const-string v15, ""

    .line 171
    .line 172
    const/4 v8, 0x5

    .line 173
    if-ge v13, v8, :cond_7

    .line 174
    .line 175
    :goto_6
    move-object v8, v7

    .line 176
    goto/16 :goto_a

    .line 177
    .line 178
    :cond_7
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 179
    .line 180
    invoke-virtual {v11, v8, v13}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    const-string v13, "::cue"

    .line 185
    .line 186
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-nez v8, :cond_8

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_8
    iget v8, v11, Lh1/w;->b:I

    .line 194
    .line 195
    invoke-static {v11, v6}, Ls2/a;->b(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    if-nez v13, :cond_9

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_9
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v16

    .line 206
    if-eqz v16, :cond_a

    .line 207
    .line 208
    invoke-virtual {v11, v8}, Lh1/w;->G(I)V

    .line 209
    .line 210
    .line 211
    move-object v8, v15

    .line 212
    goto :goto_a

    .line 213
    :cond_a
    const-string v8, "("

    .line 214
    .line 215
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-eqz v8, :cond_d

    .line 220
    .line 221
    iget v8, v11, Lh1/w;->b:I

    .line 222
    .line 223
    iget v13, v11, Lh1/w;->c:I

    .line 224
    .line 225
    move/from16 v16, v4

    .line 226
    .line 227
    :goto_7
    if-ge v8, v13, :cond_c

    .line 228
    .line 229
    if-nez v16, :cond_c

    .line 230
    .line 231
    iget-object v10, v11, Lh1/w;->a:[B

    .line 232
    .line 233
    add-int/lit8 v16, v8, 0x1

    .line 234
    .line 235
    aget-byte v8, v10, v8

    .line 236
    .line 237
    int-to-char v8, v8

    .line 238
    const/16 v10, 0x29

    .line 239
    .line 240
    if-ne v8, v10, :cond_b

    .line 241
    .line 242
    move v8, v9

    .line 243
    goto :goto_8

    .line 244
    :cond_b
    move v8, v4

    .line 245
    :goto_8
    move/from16 v10, v16

    .line 246
    .line 247
    move/from16 v16, v8

    .line 248
    .line 249
    move v8, v10

    .line 250
    const/4 v10, 0x2

    .line 251
    goto :goto_7

    .line 252
    :cond_c
    add-int/lit8 v8, v8, -0x1

    .line 253
    .line 254
    iget v10, v11, Lh1/w;->b:I

    .line 255
    .line 256
    sub-int/2addr v8, v10

    .line 257
    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 258
    .line 259
    invoke-virtual {v11, v8, v10}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    goto :goto_9

    .line 268
    :cond_d
    move-object v8, v7

    .line 269
    :goto_9
    invoke-static {v11, v6}, Ls2/a;->b(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    const-string v13, ")"

    .line 274
    .line 275
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    if-nez v10, :cond_e

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_e
    :goto_a
    if-eqz v8, :cond_34

    .line 283
    .line 284
    invoke-static {v11, v6}, Ls2/a;->b(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    if-nez v10, :cond_f

    .line 293
    .line 294
    goto/16 :goto_1f

    .line 295
    .line 296
    :cond_f
    new-instance v10, Ls2/b;

    .line 297
    .line 298
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 299
    .line 300
    .line 301
    iput-object v15, v10, Ls2/b;->a:Ljava/lang/String;

    .line 302
    .line 303
    iput-object v15, v10, Ls2/b;->b:Ljava/lang/String;

    .line 304
    .line 305
    sget-object v13, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 306
    .line 307
    iput-object v13, v10, Ls2/b;->c:Ljava/util/Set;

    .line 308
    .line 309
    iput-object v15, v10, Ls2/b;->d:Ljava/lang/String;

    .line 310
    .line 311
    iput-object v7, v10, Ls2/b;->e:Ljava/lang/String;

    .line 312
    .line 313
    iput-boolean v4, v10, Ls2/b;->g:Z

    .line 314
    .line 315
    iput-boolean v4, v10, Ls2/b;->i:Z

    .line 316
    .line 317
    iput v5, v10, Ls2/b;->j:I

    .line 318
    .line 319
    iput v5, v10, Ls2/b;->k:I

    .line 320
    .line 321
    iput v5, v10, Ls2/b;->l:I

    .line 322
    .line 323
    iput v5, v10, Ls2/b;->m:I

    .line 324
    .line 325
    iput v5, v10, Ls2/b;->n:I

    .line 326
    .line 327
    iput v5, v10, Ls2/b;->p:I

    .line 328
    .line 329
    iput-boolean v4, v10, Ls2/b;->q:Z

    .line 330
    .line 331
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v13

    .line 335
    if-eqz v13, :cond_10

    .line 336
    .line 337
    goto :goto_d

    .line 338
    :cond_10
    const/16 v13, 0x5b

    .line 339
    .line 340
    invoke-virtual {v8, v13}, Ljava/lang/String;->indexOf(I)I

    .line 341
    .line 342
    .line 343
    move-result v13

    .line 344
    if-eq v13, v5, :cond_12

    .line 345
    .line 346
    sget-object v14, Ls2/a;->c:Ljava/util/regex/Pattern;

    .line 347
    .line 348
    invoke-virtual {v8, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    invoke-virtual {v14, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    if-eqz v14, :cond_11

    .line 361
    .line 362
    invoke-virtual {v7, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iput-object v7, v10, Ls2/b;->d:Ljava/lang/String;

    .line 370
    .line 371
    :cond_11
    invoke-virtual {v8, v4, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    :cond_12
    sget v7, Lh1/i0;->a:I

    .line 376
    .line 377
    const-string v7, "\\."

    .line 378
    .line 379
    invoke-virtual {v8, v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    aget-object v8, v7, v4

    .line 384
    .line 385
    const/16 v13, 0x23

    .line 386
    .line 387
    invoke-virtual {v8, v13}, Ljava/lang/String;->indexOf(I)I

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    if-eq v13, v5, :cond_13

    .line 392
    .line 393
    invoke-virtual {v8, v4, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v14

    .line 397
    iput-object v14, v10, Ls2/b;->b:Ljava/lang/String;

    .line 398
    .line 399
    add-int/lit8 v13, v13, 0x1

    .line 400
    .line 401
    invoke-virtual {v8, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    iput-object v8, v10, Ls2/b;->a:Ljava/lang/String;

    .line 406
    .line 407
    goto :goto_b

    .line 408
    :cond_13
    iput-object v8, v10, Ls2/b;->b:Ljava/lang/String;

    .line 409
    .line 410
    :goto_b
    array-length v8, v7

    .line 411
    if-le v8, v9, :cond_15

    .line 412
    .line 413
    array-length v8, v7

    .line 414
    array-length v13, v7

    .line 415
    if-gt v8, v13, :cond_14

    .line 416
    .line 417
    move v13, v9

    .line 418
    goto :goto_c

    .line 419
    :cond_14
    move v13, v4

    .line 420
    :goto_c
    invoke-static {v13}, Lh1/a;->d(Z)V

    .line 421
    .line 422
    .line 423
    invoke-static {v7, v9, v8}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    check-cast v7, [Ljava/lang/String;

    .line 428
    .line 429
    new-instance v8, Ljava/util/HashSet;

    .line 430
    .line 431
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    invoke-direct {v8, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 436
    .line 437
    .line 438
    iput-object v8, v10, Ls2/b;->c:Ljava/util/Set;

    .line 439
    .line 440
    :cond_15
    :goto_d
    move v7, v4

    .line 441
    const/4 v8, 0x0

    .line 442
    :goto_e
    const-string v13, "}"

    .line 443
    .line 444
    if-nez v7, :cond_32

    .line 445
    .line 446
    iget v7, v11, Lh1/w;->b:I

    .line 447
    .line 448
    invoke-static {v11, v6}, Ls2/a;->b(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    if-eqz v8, :cond_17

    .line 453
    .line 454
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v14

    .line 458
    if-eqz v14, :cond_16

    .line 459
    .line 460
    goto :goto_f

    .line 461
    :cond_16
    move v14, v4

    .line 462
    goto :goto_10

    .line 463
    :cond_17
    :goto_f
    move v14, v9

    .line 464
    :goto_10
    if-nez v14, :cond_31

    .line 465
    .line 466
    invoke-virtual {v11, v7}, Lh1/w;->G(I)V

    .line 467
    .line 468
    .line 469
    invoke-static {v11}, Ls2/a;->c(Lh1/w;)V

    .line 470
    .line 471
    .line 472
    invoke-static {v11, v6}, Ls2/a;->a(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v7

    .line 476
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v16

    .line 480
    if-eqz v16, :cond_18

    .line 481
    .line 482
    goto/16 :goto_1c

    .line 483
    .line 484
    :cond_18
    const-string v4, ":"

    .line 485
    .line 486
    invoke-static {v11, v6}, Ls2/a;->b(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    if-nez v4, :cond_19

    .line 495
    .line 496
    goto/16 :goto_1c

    .line 497
    .line 498
    :cond_19
    invoke-static {v11}, Ls2/a;->c(Lh1/w;)V

    .line 499
    .line 500
    .line 501
    new-instance v4, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    const/4 v5, 0x0

    .line 507
    :goto_11
    const-string v9, ";"

    .line 508
    .line 509
    if-nez v5, :cond_1d

    .line 510
    .line 511
    iget v1, v11, Lh1/w;->b:I

    .line 512
    .line 513
    move/from16 v17, v5

    .line 514
    .line 515
    invoke-static {v11, v6}, Ls2/a;->b(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    if-nez v5, :cond_1a

    .line 520
    .line 521
    const/4 v1, 0x0

    .line 522
    goto :goto_13

    .line 523
    :cond_1a
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v18

    .line 527
    if-nez v18, :cond_1c

    .line 528
    .line 529
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v9

    .line 533
    if-eqz v9, :cond_1b

    .line 534
    .line 535
    goto :goto_12

    .line 536
    :cond_1b
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    move-object/from16 v1, p0

    .line 540
    .line 541
    move/from16 v5, v17

    .line 542
    .line 543
    goto :goto_11

    .line 544
    :cond_1c
    :goto_12
    invoke-virtual {v11, v1}, Lh1/w;->G(I)V

    .line 545
    .line 546
    .line 547
    const/4 v5, 0x1

    .line 548
    move-object/from16 v1, p0

    .line 549
    .line 550
    goto :goto_11

    .line 551
    :cond_1d
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    :goto_13
    if-eqz v1, :cond_1e

    .line 556
    .line 557
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    if-eqz v4, :cond_1f

    .line 562
    .line 563
    :cond_1e
    :goto_14
    const/4 v1, 0x1

    .line 564
    goto/16 :goto_1d

    .line 565
    .line 566
    :cond_1f
    iget v4, v11, Lh1/w;->b:I

    .line 567
    .line 568
    invoke-static {v11, v6}, Ls2/a;->b(Lh1/w;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    if-eqz v9, :cond_20

    .line 577
    .line 578
    goto :goto_15

    .line 579
    :cond_20
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v5

    .line 583
    if-eqz v5, :cond_1e

    .line 584
    .line 585
    invoke-virtual {v11, v4}, Lh1/w;->G(I)V

    .line 586
    .line 587
    .line 588
    :goto_15
    const-string v4, "color"

    .line 589
    .line 590
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    if-eqz v4, :cond_21

    .line 595
    .line 596
    const/4 v4, 0x1

    .line 597
    invoke-static {v1, v4}, Lh1/d;->a(Ljava/lang/String;Z)I

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    iput v1, v10, Ls2/b;->f:I

    .line 602
    .line 603
    iput-boolean v4, v10, Ls2/b;->g:Z

    .line 604
    .line 605
    goto/16 :goto_18

    .line 606
    .line 607
    :cond_21
    const/4 v4, 0x1

    .line 608
    const-string v5, "background-color"

    .line 609
    .line 610
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v5

    .line 614
    if-eqz v5, :cond_22

    .line 615
    .line 616
    invoke-static {v1, v4}, Lh1/d;->a(Ljava/lang/String;Z)I

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    iput v1, v10, Ls2/b;->h:I

    .line 621
    .line 622
    iput-boolean v4, v10, Ls2/b;->i:Z

    .line 623
    .line 624
    goto/16 :goto_18

    .line 625
    .line 626
    :cond_22
    const-string v5, "ruby-position"

    .line 627
    .line 628
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v5

    .line 632
    if-eqz v5, :cond_24

    .line 633
    .line 634
    const-string v5, "over"

    .line 635
    .line 636
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v5

    .line 640
    if-eqz v5, :cond_23

    .line 641
    .line 642
    iput v4, v10, Ls2/b;->p:I

    .line 643
    .line 644
    goto/16 :goto_18

    .line 645
    .line 646
    :cond_23
    const-string v4, "under"

    .line 647
    .line 648
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    if-eqz v1, :cond_1e

    .line 653
    .line 654
    const/4 v1, 0x2

    .line 655
    iput v1, v10, Ls2/b;->p:I

    .line 656
    .line 657
    move v5, v1

    .line 658
    const/4 v1, 0x1

    .line 659
    goto/16 :goto_1e

    .line 660
    .line 661
    :cond_24
    const-string v4, "text-combine-upright"

    .line 662
    .line 663
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v4

    .line 667
    if-eqz v4, :cond_27

    .line 668
    .line 669
    const-string v4, "all"

    .line 670
    .line 671
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    if-nez v4, :cond_26

    .line 676
    .line 677
    const-string v4, "digits"

    .line 678
    .line 679
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    if-eqz v1, :cond_25

    .line 684
    .line 685
    goto :goto_16

    .line 686
    :cond_25
    const/4 v1, 0x0

    .line 687
    goto :goto_17

    .line 688
    :cond_26
    :goto_16
    const/4 v1, 0x1

    .line 689
    :goto_17
    iput-boolean v1, v10, Ls2/b;->q:Z

    .line 690
    .line 691
    goto/16 :goto_14

    .line 692
    .line 693
    :cond_27
    const-string v4, "text-decoration"

    .line 694
    .line 695
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    if-eqz v4, :cond_28

    .line 700
    .line 701
    const-string v4, "underline"

    .line 702
    .line 703
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    if-eqz v1, :cond_1e

    .line 708
    .line 709
    const/4 v4, 0x1

    .line 710
    iput v4, v10, Ls2/b;->k:I

    .line 711
    .line 712
    goto :goto_18

    .line 713
    :cond_28
    const-string v4, "font-family"

    .line 714
    .line 715
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v4

    .line 719
    if-eqz v4, :cond_29

    .line 720
    .line 721
    invoke-static {v1}, Lcom/bumptech/glide/c;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    iput-object v1, v10, Ls2/b;->e:Ljava/lang/String;

    .line 726
    .line 727
    goto/16 :goto_14

    .line 728
    .line 729
    :cond_29
    const-string v4, "font-weight"

    .line 730
    .line 731
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v4

    .line 735
    if-eqz v4, :cond_2a

    .line 736
    .line 737
    const-string v4, "bold"

    .line 738
    .line 739
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v1

    .line 743
    if-eqz v1, :cond_1e

    .line 744
    .line 745
    const/4 v4, 0x1

    .line 746
    iput v4, v10, Ls2/b;->l:I

    .line 747
    .line 748
    goto :goto_18

    .line 749
    :cond_2a
    const/4 v4, 0x1

    .line 750
    const-string v5, "font-style"

    .line 751
    .line 752
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v5

    .line 756
    if-eqz v5, :cond_2c

    .line 757
    .line 758
    const-string v5, "italic"

    .line 759
    .line 760
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-result v1

    .line 764
    if-eqz v1, :cond_2b

    .line 765
    .line 766
    iput v4, v10, Ls2/b;->m:I

    .line 767
    .line 768
    :cond_2b
    :goto_18
    move v1, v4

    .line 769
    goto/16 :goto_1d

    .line 770
    .line 771
    :cond_2c
    const-string v4, "font-size"

    .line 772
    .line 773
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    if-eqz v4, :cond_1e

    .line 778
    .line 779
    sget-object v4, Ls2/a;->d:Ljava/util/regex/Pattern;

    .line 780
    .line 781
    invoke-static {v1}, Lcom/bumptech/glide/c;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 790
    .line 791
    .line 792
    move-result v5

    .line 793
    if-nez v5, :cond_2d

    .line 794
    .line 795
    new-instance v4, Ljava/lang/StringBuilder;

    .line 796
    .line 797
    const-string v5, "Invalid font-size: \'"

    .line 798
    .line 799
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    const-string v1, "\'."

    .line 806
    .line 807
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    const-string v4, "WebvttCssParser"

    .line 815
    .line 816
    invoke-static {v4, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    goto/16 :goto_14

    .line 820
    .line 821
    :cond_2d
    const/4 v1, 0x2

    .line 822
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v5

    .line 826
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    sparse-switch v1, :sswitch_data_0

    .line 834
    .line 835
    .line 836
    :goto_19
    const/4 v1, -0x1

    .line 837
    goto :goto_1a

    .line 838
    :sswitch_0
    const-string v1, "px"

    .line 839
    .line 840
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    if-nez v1, :cond_2e

    .line 845
    .line 846
    goto :goto_19

    .line 847
    :cond_2e
    const/4 v1, 0x2

    .line 848
    goto :goto_1a

    .line 849
    :sswitch_1
    const-string v1, "em"

    .line 850
    .line 851
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v1

    .line 855
    if-nez v1, :cond_2f

    .line 856
    .line 857
    goto :goto_19

    .line 858
    :cond_2f
    const/4 v1, 0x1

    .line 859
    goto :goto_1a

    .line 860
    :sswitch_2
    const-string v1, "%"

    .line 861
    .line 862
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v1

    .line 866
    if-nez v1, :cond_30

    .line 867
    .line 868
    goto :goto_19

    .line 869
    :cond_30
    const/4 v1, 0x0

    .line 870
    :goto_1a
    packed-switch v1, :pswitch_data_0

    .line 871
    .line 872
    .line 873
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 874
    .line 875
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 876
    .line 877
    .line 878
    throw v0

    .line 879
    :pswitch_0
    const/4 v1, 0x1

    .line 880
    iput v1, v10, Ls2/b;->n:I

    .line 881
    .line 882
    const/4 v5, 0x2

    .line 883
    goto :goto_1b

    .line 884
    :pswitch_1
    const/4 v1, 0x1

    .line 885
    const/4 v5, 0x2

    .line 886
    iput v5, v10, Ls2/b;->n:I

    .line 887
    .line 888
    goto :goto_1b

    .line 889
    :pswitch_2
    const/4 v1, 0x1

    .line 890
    const/4 v5, 0x2

    .line 891
    const/4 v7, 0x3

    .line 892
    iput v7, v10, Ls2/b;->n:I

    .line 893
    .line 894
    :goto_1b
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 902
    .line 903
    .line 904
    move-result v4

    .line 905
    iput v4, v10, Ls2/b;->o:F

    .line 906
    .line 907
    goto :goto_1e

    .line 908
    :cond_31
    :goto_1c
    move v1, v9

    .line 909
    :goto_1d
    const/4 v5, 0x2

    .line 910
    :goto_1e
    move v9, v1

    .line 911
    move v7, v14

    .line 912
    const/4 v4, 0x0

    .line 913
    const/4 v5, -0x1

    .line 914
    move-object/from16 v1, p0

    .line 915
    .line 916
    goto/16 :goto_e

    .line 917
    .line 918
    :cond_32
    move v1, v9

    .line 919
    const/4 v5, 0x2

    .line 920
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    move-result v4

    .line 924
    if-eqz v4, :cond_33

    .line 925
    .line 926
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    :cond_33
    move v9, v1

    .line 930
    move v10, v5

    .line 931
    const/4 v4, 0x0

    .line 932
    const/4 v5, -0x1

    .line 933
    const/4 v7, 0x0

    .line 934
    move-object/from16 v1, p0

    .line 935
    .line 936
    goto/16 :goto_5

    .line 937
    .line 938
    :cond_34
    :goto_1f
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 939
    .line 940
    .line 941
    :cond_35
    :goto_20
    move-object/from16 v1, p0

    .line 942
    .line 943
    goto/16 :goto_1

    .line 944
    .line 945
    :cond_36
    move-object/from16 v1, p0

    .line 946
    .line 947
    goto/16 :goto_4

    .line 948
    .line 949
    :cond_37
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 950
    .line 951
    const-string v1, "A style block was found after the first cue."

    .line 952
    .line 953
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    throw v0

    .line 957
    :cond_38
    const/4 v7, 0x3

    .line 958
    if-ne v6, v7, :cond_35

    .line 959
    .line 960
    sget-object v1, Ls2/h;->a:Ljava/util/regex/Pattern;

    .line 961
    .line 962
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 963
    .line 964
    invoke-virtual {v2, v1}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v4

    .line 968
    if-nez v4, :cond_39

    .line 969
    .line 970
    const/4 v7, 0x0

    .line 971
    goto :goto_21

    .line 972
    :cond_39
    sget-object v5, Ls2/h;->a:Ljava/util/regex/Pattern;

    .line 973
    .line 974
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 975
    .line 976
    .line 977
    move-result-object v6

    .line 978
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 979
    .line 980
    .line 981
    move-result v7

    .line 982
    if-eqz v7, :cond_3a

    .line 983
    .line 984
    const/4 v7, 0x0

    .line 985
    invoke-static {v7, v6, v2, v0}, Ls2/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Lh1/w;Ljava/util/ArrayList;)Ls2/c;

    .line 986
    .line 987
    .line 988
    move-result-object v7

    .line 989
    goto :goto_21

    .line 990
    :cond_3a
    const/4 v7, 0x0

    .line 991
    invoke-virtual {v2, v1}, Lh1/w;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    if-nez v1, :cond_3b

    .line 996
    .line 997
    goto :goto_21

    .line 998
    :cond_3b
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v5

    .line 1006
    if-eqz v5, :cond_3c

    .line 1007
    .line 1008
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v4

    .line 1012
    invoke-static {v4, v1, v2, v0}, Ls2/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Lh1/w;Ljava/util/ArrayList;)Ls2/c;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v7

    .line 1016
    :cond_3c
    :goto_21
    if-eqz v7, :cond_35

    .line 1017
    .line 1018
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    goto :goto_20

    .line 1022
    :cond_3d
    new-instance v0, La4/c;

    .line 1023
    .line 1024
    invoke-direct {v0, v3}, La4/c;-><init>(Ljava/util/ArrayList;)V

    .line 1025
    .line 1026
    .line 1027
    move-object/from16 v1, p4

    .line 1028
    .line 1029
    move-object/from16 v2, p5

    .line 1030
    .line 1031
    invoke-static {v0, v1, v2}, Landroid/support/v4/media/session/b;->O(Lk2/h;Lk2/p;Lh1/f;)V

    .line 1032
    .line 1033
    .line 1034
    return-void

    .line 1035
    :catch_0
    move-exception v0

    .line 1036
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1037
    .line 1038
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 1039
    .line 1040
    .line 1041
    throw v1

    .line 1042
    nop

    :sswitch_data_0
    .sparse-switch
        0x25 -> :sswitch_2
        0xca8 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Ljava/lang/CharSequence;IILv0/v;)Z
    .locals 3

    .line 1
    iget v0, p4, Lv0/v;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lv0/y;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    new-instance v0, Lv0/y;

    .line 16
    .line 17
    instance-of v2, p1, Landroid/text/Spannable;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p1, Landroid/text/Spannable;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    .line 25
    .line 26
    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v2

    .line 30
    :goto_0
    invoke-direct {v0, p1}, Lv0/y;-><init>(Landroid/text/Spannable;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lk2/b;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Lv0/w;

    .line 43
    .line 44
    invoke-direct {p1, p4}, Lv0/w;-><init>(Lv0/v;)V

    .line 45
    .line 46
    .line 47
    iget-object p4, p0, Ls/e;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p4, Lv0/y;

    .line 50
    .line 51
    const/16 v0, 0x21

    .line 52
    .line 53
    invoke-virtual {p4, p1, p2, p3, v0}, Lv0/y;->setSpan(Ljava/lang/Object;III)V

    .line 54
    .line 55
    .line 56
    return v1
.end method

.method public h()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public i()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/w;

    .line 4
    .line 5
    sget-object v1, Lh1/i0;->f:[B

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v2, v1

    .line 11
    invoke-virtual {v0, v1, v2}, Lh1/w;->E([BI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public j(Lz2/v0;Landroidx/media3/common/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp/k;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lz2/e1;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lz2/e1;->a()Lz2/e1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, p1, v1}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object p2, v1, Lz2/e1;->c:Landroidx/media3/common/p;

    .line 21
    .line 22
    iget p1, v1, Lz2/e1;->a:I

    .line 23
    .line 24
    or-int/lit8 p1, p1, 0x8

    .line 25
    .line 26
    iput p1, v1, Lz2/e1;->a:I

    .line 27
    .line 28
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public l(JLh1/w;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Lh1/w;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p3}, Lh1/w;->g()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p3}, Lh1/w;->g()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p3}, Lh1/w;->u()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x1b2

    .line 23
    .line 24
    if-ne v0, v3, :cond_1

    .line 25
    .line 26
    const v0, 0x47413934

    .line 27
    .line 28
    .line 29
    if-ne v1, v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-ne v2, v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, [Ln1/i0;

    .line 37
    .line 38
    invoke-static {p1, p2, p3, v0}, Ln1/b;->f(JLh1/w;[Ln1/i0;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public m(Ln1/p;Lt2/g0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ln1/i0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    array-length v3, v0

    .line 8
    if-ge v2, v3, :cond_2

    .line 9
    .line 10
    invoke-virtual {p2}, Lt2/g0;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 14
    .line 15
    .line 16
    iget v3, p2, Lt2/g0;->d:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-interface {p1, v3, v4}, Ln1/p;->track(II)Ln1/i0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Ls/e;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Landroidx/media3/common/w;

    .line 32
    .line 33
    iget-object v5, v4, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_1

    .line 42
    .line 43
    const-string v6, "application/cea-708"

    .line 44
    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v6, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 55
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v8, "Invalid closed caption MIME type provided: "

    .line 58
    .line 59
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v7, v6}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    new-instance v6, Landroidx/media3/common/v;

    .line 73
    .line 74
    invoke-direct {v6}, Landroidx/media3/common/v;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v7, p2, Lt2/g0;->e:Ljava/lang/String;

    .line 81
    .line 82
    iput-object v7, v6, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iput-object v5, v6, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 89
    .line 90
    iget v5, v4, Landroidx/media3/common/w;->e:I

    .line 91
    .line 92
    iput v5, v6, Landroidx/media3/common/v;->e:I

    .line 93
    .line 94
    iget-object v5, v4, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 95
    .line 96
    iput-object v5, v6, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 97
    .line 98
    iget v5, v4, Landroidx/media3/common/w;->H:I

    .line 99
    .line 100
    iput v5, v6, Landroidx/media3/common/v;->G:I

    .line 101
    .line 102
    iget-object v4, v4, Landroidx/media3/common/w;->q:Ljava/util/List;

    .line 103
    .line 104
    iput-object v4, v6, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 105
    .line 106
    new-instance v4, Landroidx/media3/common/w;

    .line 107
    .line 108
    invoke-direct {v4, v6}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v3, v4}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 112
    .line 113
    .line 114
    aput-object v3, v0, v2

    .line 115
    .line 116
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    return-void
.end method

.method public n(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    new-array p1, p1, [I

    .line 17
    .line 18
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    array-length v2, v0

    .line 25
    if-lt p1, v2, :cond_2

    .line 26
    .line 27
    array-length v2, v0

    .line 28
    :goto_0
    if-gt v2, p1, :cond_1

    .line 29
    .line 30
    mul-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-array p1, v2, [I

    .line 34
    .line 35
    iput-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 36
    .line 37
    array-length v2, v0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, [I

    .line 45
    .line 46
    array-length v0, v0

    .line 47
    array-length v2, p1

    .line 48
    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public o(IIII)Landroid/view/View;
    .locals 9

    .line 1
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo2/a;

    .line 4
    .line 5
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz2/d0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lz2/d0;->d()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1}, Lz2/d0;->c()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-le p2, p1, :cond_0

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v4, -0x1

    .line 22
    :goto_0
    const/4 v5, 0x0

    .line 23
    :goto_1
    if-eq p1, p2, :cond_3

    .line 24
    .line 25
    iget v6, v1, Lz2/d0;->a:I

    .line 26
    .line 27
    packed-switch v6, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    iget-object v6, v1, Lz2/d0;->b:Lz2/f0;

    .line 31
    .line 32
    invoke-virtual {v6, p1}, Lz2/f0;->u(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    goto :goto_2

    .line 37
    :pswitch_0
    iget-object v6, v1, Lz2/d0;->b:Lz2/f0;

    .line 38
    .line 39
    invoke-virtual {v6, p1}, Lz2/f0;->u(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    :goto_2
    invoke-virtual {v1, v6}, Lz2/d0;->b(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual {v1, v6}, Lz2/d0;->a(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    iput v2, v0, Lo2/a;->b:I

    .line 52
    .line 53
    iput v3, v0, Lo2/a;->c:I

    .line 54
    .line 55
    iput v7, v0, Lo2/a;->d:I

    .line 56
    .line 57
    iput v8, v0, Lo2/a;->e:I

    .line 58
    .line 59
    if-eqz p3, :cond_1

    .line 60
    .line 61
    iput p3, v0, Lo2/a;->a:I

    .line 62
    .line 63
    invoke-virtual {v0}, Lo2/a;->a()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_1

    .line 68
    .line 69
    return-object v6

    .line 70
    :cond_1
    if-eqz p4, :cond_2

    .line 71
    .line 72
    iput p4, v0, Lo2/a;->a:I

    .line 73
    .line 74
    invoke-virtual {v0}, Lo2/a;->a()Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    move-object v5, v6

    .line 81
    :cond_2
    add-int/2addr p1, v4

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    return-object v5

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Ls/e;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La4/j0;

    .line 10
    .line 11
    iget-object v4, v0, Ls/e;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Lc4/h;

    .line 14
    .line 15
    iget v5, v4, Lc4/h;->a:I

    .line 16
    .line 17
    iget v6, v4, Lc4/h;->b:I

    .line 18
    .line 19
    iget v4, v4, Lc4/h;->c:I

    .line 20
    .line 21
    iget-object v7, v2, Lm0/r1;->a:Lm0/o1;

    .line 22
    .line 23
    const/16 v8, 0x207

    .line 24
    .line 25
    invoke-virtual {v7, v8}, Lm0/o1;->f(I)Le0/b;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const/16 v9, 0x20

    .line 30
    .line 31
    invoke-virtual {v7, v9}, Lm0/o1;->f(I)Le0/b;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    iget-object v9, v3, La4/j0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 38
    .line 39
    iget v10, v8, Le0/b;->b:I

    .line 40
    .line 41
    iget v11, v8, Le0/b;->c:I

    .line 42
    .line 43
    iget v12, v8, Le0/b;->a:I

    .line 44
    .line 45
    iput v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:I

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    const/4 v14, 0x1

    .line 52
    if-ne v10, v14, :cond_0

    .line 53
    .line 54
    move v10, v14

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v10, 0x0

    .line 57
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 62
    .line 63
    .line 64
    move-result v16

    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 66
    .line 67
    .line 68
    move-result v17

    .line 69
    iget-boolean v13, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    .line 70
    .line 71
    if-eqz v13, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2}, Lm0/r1;->a()I

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    iput v15, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    .line 78
    .line 79
    add-int/2addr v15, v4

    .line 80
    :cond_1
    iget-boolean v4, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    if-eqz v10, :cond_2

    .line 85
    .line 86
    move v4, v6

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move v4, v5

    .line 89
    :goto_1
    add-int v16, v4, v12

    .line 90
    .line 91
    :cond_3
    move/from16 v4, v16

    .line 92
    .line 93
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r:Z

    .line 94
    .line 95
    if-eqz v14, :cond_5

    .line 96
    .line 97
    if-eqz v10, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move v5, v6

    .line 101
    :goto_2
    add-int v17, v5, v11

    .line 102
    .line 103
    :cond_5
    move/from16 v5, v17

    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 110
    .line 111
    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    .line 112
    .line 113
    if-eqz v10, :cond_6

    .line 114
    .line 115
    iget v10, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 116
    .line 117
    if-eq v10, v12, :cond_6

    .line 118
    .line 119
    iput v12, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 120
    .line 121
    const/16 v18, 0x1

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    const/16 v18, 0x0

    .line 125
    .line 126
    :goto_3
    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    .line 127
    .line 128
    if-eqz v10, :cond_7

    .line 129
    .line 130
    iget v10, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 131
    .line 132
    if-eq v10, v11, :cond_7

    .line 133
    .line 134
    iput v11, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 135
    .line 136
    const/16 v18, 0x1

    .line 137
    .line 138
    :cond_7
    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:Z

    .line 139
    .line 140
    if-eqz v10, :cond_8

    .line 141
    .line 142
    iget v10, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 143
    .line 144
    iget v8, v8, Le0/b;->b:I

    .line 145
    .line 146
    if-eq v10, v8, :cond_8

    .line 147
    .line 148
    iput v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 149
    .line 150
    const/4 v14, 0x1

    .line 151
    goto :goto_4

    .line 152
    :cond_8
    move/from16 v14, v18

    .line 153
    .line 154
    :goto_4
    if-eqz v14, :cond_9

    .line 155
    .line 156
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    invoke-virtual {v1, v4, v6, v5, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 164
    .line 165
    .line 166
    iget-boolean v1, v3, La4/j0;->a:Z

    .line 167
    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    iget v3, v7, Le0/b;->d:I

    .line 171
    .line 172
    iput v3, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:I

    .line 173
    .line 174
    :cond_a
    if-nez v13, :cond_c

    .line 175
    .line 176
    if-eqz v1, :cond_b

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_b
    return-object v2

    .line 180
    :cond_c
    :goto_5
    invoke-virtual {v9}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L()V

    .line 181
    .line 182
    .line 183
    return-object v2
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseIntArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public s(Landroid/view/View;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo2/a;

    .line 4
    .line 5
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz2/d0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lz2/d0;->d()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1}, Lz2/d0;->c()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v1, p1}, Lz2/d0;->b(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {v1, p1}, Lz2/d0;->a(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput v2, v0, Lo2/a;->b:I

    .line 26
    .line 27
    iput v3, v0, Lo2/a;->c:I

    .line 28
    .line 29
    iput v4, v0, Lo2/a;->d:I

    .line 30
    .line 31
    iput p1, v0, Lo2/a;->e:I

    .line 32
    .line 33
    const/16 p1, 0x6003

    .line 34
    .line 35
    iput p1, v0, Lo2/a;->a:I

    .line 36
    .line 37
    invoke-virtual {v0}, Lo2/a;->a()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public t(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    add-int v0, p1, p2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ls/e;->n(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [I

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    sub-int/2addr v2, p1

    .line 22
    sub-int/2addr v2, p2

    .line 23
    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/lit8 v0, v0, -0x1

    .line 46
    .line 47
    :goto_0
    if-ltz v0, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, Ls/e;->l:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lz2/c1;

    .line 58
    .line 59
    iget v2, v1, Lz2/c1;->j:I

    .line 60
    .line 61
    if-ge v2, p1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    add-int/2addr v2, p2

    .line 65
    iput v2, v1, Lz2/c1;->j:I

    .line 66
    .line 67
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    :goto_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Ls/e;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ls/h;

    .line 14
    .line 15
    const-string v1, "[ "

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    const/16 v2, 0x9

    .line 21
    .line 22
    if-ge v0, v2, :cond_0

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ls/h;

    .line 35
    .line 36
    iget-object v1, v1, Ls/h;->q:[F

    .line 37
    .line 38
    aget v1, v1, v0

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, " "

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "] "

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Ls/h;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public u(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    add-int v0, p1, p2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ls/e;->n(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [I

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    sub-int/2addr v2, p1

    .line 22
    sub-int/2addr v2, p2

    .line 23
    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ls/e;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    array-length v2, v1

    .line 31
    sub-int/2addr v2, p2

    .line 32
    array-length v3, v1

    .line 33
    const/4 v4, -0x1

    .line 34
    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Ls/e;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    :goto_0
    if-ltz v1, :cond_4

    .line 51
    .line 52
    iget-object v2, p0, Ls/e;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lz2/c1;

    .line 61
    .line 62
    iget v3, v2, Lz2/c1;->j:I

    .line 63
    .line 64
    if-ge v3, p1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    if-ge v3, v0, :cond_3

    .line 68
    .line 69
    iget-object v2, p0, Ls/e;->l:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    sub-int/2addr v3, p2

    .line 78
    iput v3, v2, Lz2/c1;->j:I

    .line 79
    .line 80
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    :goto_2
    return-void
.end method

.method public v(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 11

    .line 1
    new-instance v0, Lx/n;

    .line 2
    .line 3
    invoke-direct {v0}, Lx/n;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_f

    .line 13
    .line 14
    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-eqz v4, :cond_e

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    goto/16 :goto_a

    .line 27
    .line 28
    :cond_0
    const-string v6, "id"

    .line 29
    .line 30
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_e

    .line 35
    .line 36
    const-string v1, "/"

    .line 37
    .line 38
    invoke-virtual {v5, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v3, -0x1

    .line 43
    const/4 v4, 0x1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const/16 v1, 0x2f

    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/String;->indexOf(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v1, v4

    .line 53
    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v7, v1, v6, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v1, v3

    .line 71
    :goto_1
    if-ne v1, v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-le v3, v4, :cond_2

    .line 78
    .line 79
    invoke-virtual {v5, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const-string v3, "ConstraintLayoutStates"

    .line 89
    .line 90
    const-string v5, "error in parsing id"

    .line 91
    .line 92
    invoke-static {v3, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_2
    const-string v3, "Error parsing XML resource"

    .line 96
    .line 97
    const-string v5, "ConstraintSet"

    .line 98
    .line 99
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    const/4 v7, 0x0

    .line 104
    move-object v8, v7

    .line 105
    :goto_3
    if-eq v6, v4, :cond_d

    .line 106
    .line 107
    if-eqz v6, :cond_b

    .line 108
    .line 109
    const/4 v9, 0x2

    .line 110
    if-eq v6, v9, :cond_5

    .line 111
    .line 112
    const/4 v9, 0x3

    .line 113
    if-eq v6, v9, :cond_4

    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 122
    .line 123
    invoke-virtual {v6, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    sparse-switch v9, :sswitch_data_0

    .line 132
    .line 133
    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :sswitch_0
    const-string v9, "constraintset"

    .line 137
    .line 138
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_c

    .line 143
    .line 144
    goto/16 :goto_9

    .line 145
    .line 146
    :catch_0
    move-exception p1

    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :catch_1
    move-exception p1

    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :sswitch_1
    const-string v9, "constraintoverride"

    .line 153
    .line 154
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_c

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :sswitch_2
    const-string v9, "constraint"

    .line 162
    .line 163
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_c

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :sswitch_3
    const-string v9, "guideline"

    .line 171
    .line 172
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_c

    .line 177
    .line 178
    :goto_4
    iget-object v6, v0, Lx/n;->c:Ljava/util/HashMap;

    .line 179
    .line 180
    iget v9, v8, Lx/i;->a:I

    .line 181
    .line 182
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-virtual {v6, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    goto/16 :goto_6

    .line 191
    .line 192
    :cond_5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v9
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    const-string v10, "XML parser error must be within a Constraint "

    .line 201
    .line 202
    sparse-switch v9, :sswitch_data_1

    .line 203
    .line 204
    .line 205
    goto/16 :goto_6

    .line 206
    .line 207
    :sswitch_4
    :try_start_1
    const-string v9, "Constraint"

    .line 208
    .line 209
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_c

    .line 214
    .line 215
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {p1, v6, v2}, Lx/n;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Lx/i;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    goto/16 :goto_6

    .line 224
    .line 225
    :sswitch_5
    const-string v9, "CustomAttribute"

    .line 226
    .line 227
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-eqz v6, :cond_c

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :sswitch_6
    const-string v9, "Barrier"

    .line 235
    .line 236
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_c

    .line 241
    .line 242
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-static {p1, v6, v2}, Lx/n;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Lx/i;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    iget-object v6, v8, Lx/i;->d:Lx/j;

    .line 251
    .line 252
    iput v4, v6, Lx/j;->h0:I

    .line 253
    .line 254
    goto/16 :goto_6

    .line 255
    .line 256
    :sswitch_7
    const-string v9, "CustomMethod"

    .line 257
    .line 258
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_c

    .line 263
    .line 264
    :goto_5
    if-eqz v8, :cond_6

    .line 265
    .line 266
    iget-object v6, v8, Lx/i;->f:Ljava/util/HashMap;

    .line 267
    .line 268
    invoke-static {p1, p2, v6}, Lx/b;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Ljava/util/HashMap;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_6

    .line 272
    .line 273
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    .line 274
    .line 275
    new-instance v2, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p1

    .line 298
    :sswitch_8
    const-string v9, "Guideline"

    .line 299
    .line 300
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    if-eqz v6, :cond_c

    .line 305
    .line 306
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    invoke-static {p1, v6, v2}, Lx/n;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Lx/i;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    iget-object v6, v8, Lx/i;->d:Lx/j;

    .line 315
    .line 316
    iput-boolean v4, v6, Lx/j;->a:Z

    .line 317
    .line 318
    goto/16 :goto_6

    .line 319
    .line 320
    :sswitch_9
    const-string v9, "Transform"

    .line 321
    .line 322
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_c

    .line 327
    .line 328
    if-eqz v8, :cond_7

    .line 329
    .line 330
    iget-object v6, v8, Lx/i;->e:Lx/m;

    .line 331
    .line 332
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-virtual {v6, p1, v9}, Lx/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_6

    .line 340
    .line 341
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    .line 342
    .line 343
    new-instance v2, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 352
    .line 353
    .line 354
    move-result p2

    .line 355
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p2

    .line 362
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw p1

    .line 366
    :sswitch_a
    const-string v9, "PropertySet"

    .line 367
    .line 368
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-eqz v6, :cond_c

    .line 373
    .line 374
    if-eqz v8, :cond_8

    .line 375
    .line 376
    iget-object v6, v8, Lx/i;->b:Lx/l;

    .line 377
    .line 378
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-virtual {v6, p1, v9}, Lx/l;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 383
    .line 384
    .line 385
    goto/16 :goto_6

    .line 386
    .line 387
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    .line 388
    .line 389
    new-instance v2, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 398
    .line 399
    .line 400
    move-result p2

    .line 401
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw p1

    .line 412
    :sswitch_b
    const-string v9, "ConstraintOverride"

    .line 413
    .line 414
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    if-eqz v6, :cond_c

    .line 419
    .line 420
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    invoke-static {p1, v6, v4}, Lx/n;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Lx/i;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    goto :goto_6

    .line 429
    :sswitch_c
    const-string v9, "Motion"

    .line 430
    .line 431
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    if-eqz v6, :cond_c

    .line 436
    .line 437
    if-eqz v8, :cond_9

    .line 438
    .line 439
    iget-object v6, v8, Lx/i;->c:Lx/k;

    .line 440
    .line 441
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    invoke-virtual {v6, p1, v9}, Lx/k;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    .line 450
    .line 451
    new-instance v2, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 460
    .line 461
    .line 462
    move-result p2

    .line 463
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p2

    .line 470
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw p1

    .line 474
    :sswitch_d
    const-string v9, "Layout"

    .line 475
    .line 476
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    if-eqz v6, :cond_c

    .line 481
    .line 482
    if-eqz v8, :cond_a

    .line 483
    .line 484
    iget-object v6, v8, Lx/i;->d:Lx/j;

    .line 485
    .line 486
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    invoke-virtual {v6, p1, v9}, Lx/j;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 491
    .line 492
    .line 493
    goto :goto_6

    .line 494
    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    .line 495
    .line 496
    new-instance v2, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 505
    .line 506
    .line 507
    move-result p2

    .line 508
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p2

    .line 515
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    throw p1

    .line 519
    :cond_b
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    :cond_c
    :goto_6
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 523
    .line 524
    .line 525
    move-result v6
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 526
    goto/16 :goto_3

    .line 527
    .line 528
    :goto_7
    invoke-static {v5, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 529
    .line 530
    .line 531
    goto :goto_9

    .line 532
    :goto_8
    invoke-static {v5, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 533
    .line 534
    .line 535
    :cond_d
    :goto_9
    iget-object p1, p0, Ls/e;->l:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast p1, Landroid/util/SparseArray;

    .line 538
    .line 539
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :cond_e
    :goto_a
    add-int/lit8 v3, v3, 0x1

    .line 544
    .line 545
    goto/16 :goto_0

    .line 546
    .line 547
    :cond_f
    return-void

    .line 548
    nop

    .line 549
    :sswitch_data_0
    .sparse-switch
        -0x7bb8f310 -> :sswitch_3
        -0xb58ea23 -> :sswitch_2
        0x196d04a9 -> :sswitch_1
        0x7feafd65 -> :sswitch_0
    .end sparse-switch

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :sswitch_data_1
    .sparse-switch
        -0x78c018b6 -> :sswitch_d
        -0x7648542a -> :sswitch_c
        -0x74f4db17 -> :sswitch_b
        -0x4bab3dd3 -> :sswitch_a
        -0x49cf74b4 -> :sswitch_9
        -0x446d330 -> :sswitch_8
        0x15d883d2 -> :sswitch_7
        0x4f5d3b97 -> :sswitch_6
        0x6acd460b -> :sswitch_5
        0x6b78f1fd -> :sswitch_4
    .end sparse-switch
.end method

.method public w(Lz2/v0;I)Landroidx/media3/common/p;
    .locals 5

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp/k;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lp/k;->d(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Lp/k;->j(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lz2/e1;

    .line 18
    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    iget v3, v2, Lz2/e1;->a:I

    .line 22
    .line 23
    and-int v4, v3, p2

    .line 24
    .line 25
    if-eqz v4, :cond_4

    .line 26
    .line 27
    not-int v4, p2

    .line 28
    and-int/2addr v3, v4

    .line 29
    iput v3, v2, Lz2/e1;->a:I

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    if-ne p2, v4, :cond_1

    .line 33
    .line 34
    iget-object p2, v2, Lz2/e1;->b:Landroidx/media3/common/p;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/16 v4, 0x8

    .line 38
    .line 39
    if-ne p2, v4, :cond_3

    .line 40
    .line 41
    iget-object p2, v2, Lz2/e1;->c:Landroidx/media3/common/p;

    .line 42
    .line 43
    :goto_0
    and-int/lit8 v3, v3, 0xc

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lp/k;->h(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput p1, v2, Lz2/e1;->a:I

    .line 52
    .line 53
    iput-object v1, v2, Lz2/e1;->b:Landroidx/media3/common/p;

    .line 54
    .line 55
    iput-object v1, v2, Lz2/e1;->c:Landroidx/media3/common/p;

    .line 56
    .line 57
    sget-object p1, Lz2/e1;->d:Ll0/c;

    .line 58
    .line 59
    invoke-virtual {p1, v2}, Ll0/c;->g(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object p2

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string p2, "Must provide flag PRE or POST"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_4
    :goto_1
    return-object v1
.end method

.method public x(Lz2/v0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp/k;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lz2/e1;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p1, Lz2/e1;->a:I

    .line 15
    .line 16
    and-int/lit8 v0, v0, -0x2

    .line 17
    .line 18
    iput v0, p1, Lz2/e1;->a:I

    .line 19
    .line 20
    return-void
.end method

.method public y(Lz2/v0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp/h;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp/h;->e()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lp/h;->f(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ne p1, v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Lp/h;->l:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v4, v3, v1

    .line 22
    .line 23
    sget-object v5, Lp/i;->a:Ljava/lang/Object;

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    aput-object v5, v3, v1

    .line 28
    .line 29
    iput-boolean v2, v0, Lp/h;->j:Z

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    iget-object v0, p0, Ls/e;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lp/k;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lp/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lz2/e1;

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    iput v0, p1, Lz2/e1;->a:I

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    iput-object v0, p1, Lz2/e1;->b:Landroidx/media3/common/p;

    .line 52
    .line 53
    iput-object v0, p1, Lz2/e1;->c:Landroidx/media3/common/p;

    .line 54
    .line 55
    sget-object v0, Lz2/e1;->d:Ll0/c;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ll0/c;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method
