.class public final Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor;


# instance fields
.field private extractor:Ln1/n;

.field private extractorInput:Ln1/o;

.field private final extractorsFactory:Ln1/q;


# direct methods
.method public constructor <init>(Ln1/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractorsFactory:Ln1/q;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Ln1/n;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->lambda$init$0(Ln1/n;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$init$0(Ln1/n;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p0}, Ln1/n;->getUnderlyingImplementation()Ln1/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public disableSeekingOnMp3Streams()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Ln1/n;->getUnderlyingImplementation()Ln1/n;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lg2/e;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v0, Lg2/e;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, v0, Lg2/e;->r:Z

    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public getCurrentInputPosition()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractorInput:Ln1/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method

.method public init(Landroidx/media3/common/m;Landroid/net/Uri;Ljava/util/Map;JJLn1/p;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/m;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;JJ",
            "Ln1/p;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v1, Ln1/k;

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    move-wide v3, p4

    .line 5
    move-wide v5, p6

    .line 6
    invoke-direct/range {v1 .. v6}, Ln1/k;-><init>(Landroidx/media3/common/m;JJ)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractorInput:Ln1/o;

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractorsFactory:Ln1/q;

    .line 17
    .line 18
    invoke-interface {p1, p2, p3}, Ln1/q;->c(Landroid/net/Uri;Ljava/util/Map;)[Ln1/n;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length p3, p1

    .line 23
    sget-object p4, Lf6/m0;->k:Lf6/k0;

    .line 24
    .line 25
    const-string p4, "expectedSize"

    .line 26
    .line 27
    invoke-static {p3, p4}, Lf6/u;->c(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance p4, Lf6/j0;

    .line 31
    .line 32
    invoke-direct {p4, p3}, Lf6/g0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    array-length p3, p1

    .line 36
    const/4 p5, 0x1

    .line 37
    const/4 p6, 0x0

    .line 38
    if-ne p3, p5, :cond_1

    .line 39
    .line 40
    aget-object p1, p1, p6

    .line 41
    .line 42
    iput-object p1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 43
    .line 44
    goto :goto_7

    .line 45
    :cond_1
    array-length p3, p1

    .line 46
    move p7, p6

    .line 47
    :goto_0
    if-ge p7, p3, :cond_7

    .line 48
    .line 49
    aget-object v0, p1, p7

    .line 50
    .line 51
    :try_start_0
    invoke-interface {v0, v1}, Ln1/n;->sniff(Ln1/o;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iput-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    iput p6, v1, Ln1/k;->o:I

    .line 60
    .line 61
    goto :goto_6

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    :try_start_1
    invoke-interface {v0}, Ln1/n;->getSniffFailureDetails()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p4, v0}, Lf6/g0;->c(Ljava/lang/Iterable;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    iget-wide v5, v1, Ln1/k;->m:J

    .line 77
    .line 78
    cmp-long v0, v5, v3

    .line 79
    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move v0, p6

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    :goto_1
    move v0, p5

    .line 86
    :goto_2
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 87
    .line 88
    .line 89
    iput p6, v1, Ln1/k;->o:I

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :goto_3
    iget-object p2, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 93
    .line 94
    if-nez p2, :cond_6

    .line 95
    .line 96
    iget-wide p2, v1, Ln1/k;->m:J

    .line 97
    .line 98
    cmp-long p2, p2, v3

    .line 99
    .line 100
    if-nez p2, :cond_5

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move p5, p6

    .line 104
    :cond_6
    :goto_4
    invoke-static {p5}, Lh1/a;->j(Z)V

    .line 105
    .line 106
    .line 107
    iput p6, v1, Ln1/k;->o:I

    .line 108
    .line 109
    throw p1

    .line 110
    :catch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 111
    .line 112
    if-nez v0, :cond_4

    .line 113
    .line 114
    iget-wide v5, v1, Ln1/k;->m:J

    .line 115
    .line 116
    cmp-long v0, v5, v3

    .line 117
    .line 118
    if-nez v0, :cond_3

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :goto_5
    add-int/lit8 p7, p7, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    :goto_6
    iget-object p3, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 125
    .line 126
    if-eqz p3, :cond_8

    .line 127
    .line 128
    :goto_7
    iget-object p1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 129
    .line 130
    invoke-interface {p1, p8}, Ln1/n;->init(Ln1/p;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_8
    new-instance p3, Landroidx/media3/exoplayer/source/UnrecognizedInputFormatException;

    .line 135
    .line 136
    new-instance p5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string p6, "None of the available extractors ("

    .line 139
    .line 140
    invoke-direct {p5, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance p6, Le6/e;

    .line 144
    .line 145
    const-string p7, ", "

    .line 146
    .line 147
    invoke-direct {p6, p7}, Le6/e;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {p1}, Lf6/m0;->k([Ljava/lang/Object;)Lf6/l1;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance p7, Landroidx/media3/exoplayer/source/j;

    .line 155
    .line 156
    const/4 p8, 0x3

    .line 157
    invoke-direct {p7, p8}, Landroidx/media3/exoplayer/source/j;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-static {p7, p1}, Lf6/u;->u(Le6/d;Ljava/util/List;)Ljava/util/AbstractList;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p6, p1}, Le6/e;->b(Ljava/util/List;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string p1, ") could read the stream."

    .line 172
    .line 173
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p4}, Lf6/j0;->f()Lf6/l1;

    .line 184
    .line 185
    .line 186
    move-result-object p4

    .line 187
    invoke-direct {p3, p1, p2, p4}, Landroidx/media3/exoplayer/source/UnrecognizedInputFormatException;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V

    .line 188
    .line 189
    .line 190
    throw p3
.end method

.method public read(Ln1/a0;)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractorInput:Ln1/o;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, p1}, Ln1/n;->read(Ln1/o;Ln1/a0;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public release()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ln1/n;->release()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractorInput:Ln1/o;

    .line 12
    .line 13
    return-void
.end method

.method public seek(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->extractor:Ln1/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3, p4}, Ln1/n;->seek(JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
