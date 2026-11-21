.class public final Landroidx/media3/exoplayer/smoothstreaming/offline/SsDownloader;
.super Landroidx/media3/exoplayer/offline/SegmentDownloader;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media3/exoplayer/offline/SegmentDownloader<",
        "Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o0;",
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;",
            ">;",
            "Ll1/b;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide/16 v5, 0x4e20

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 12
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/smoothstreaming/offline/SsDownloader;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o0;",
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;",
            ">;",
            "Ll1/b;",
            "Ljava/util/concurrent/Executor;",
            "J)V"
        }
    .end annotation

    .line 13
    invoke-direct/range {p0 .. p6}, Landroidx/media3/exoplayer/offline/SegmentDownloader;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Ll1/b;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/offline/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/smoothstreaming/offline/SsDownloader;-><init>(Landroidx/media3/common/o0;Ll1/b;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Ll1/b;Ljava/util/concurrent/Executor;)V
    .locals 8

    .line 2
    invoke-virtual {p1}, Landroidx/media3/common/o0;->a()Landroidx/media3/common/b0;

    move-result-object v0

    iget-object p1, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iget-object p1, p1, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object v2, Lh1/i0;->j:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 8
    const-string v1, "Manifest"

    invoke-static {p1, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 9
    :cond_1
    :goto_0
    iput-object p1, v0, Landroidx/media3/common/b0;->b:Landroid/net/Uri;

    .line 10
    invoke-virtual {v0}, Landroidx/media3/common/b0;->a()Landroidx/media3/common/o0;

    move-result-object v2

    new-instance v3, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser;

    invoke-direct {v3}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser;-><init>()V

    const-wide/16 v6, 0x4e20

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    .line 11
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/smoothstreaming/offline/SsDownloader;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getSegments(Lk1/h;Landroidx/media3/exoplayer/offline/FilterableManifest;Z)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p2, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/smoothstreaming/offline/SsDownloader;->getSegments(Lk1/h;Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getSegments(Lk1/h;Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;Z)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/h;",
            "Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;",
            "Z)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object p2, p2, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;->streamElements:[Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;

    array-length p3, p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p3, :cond_2

    aget-object v2, p2, v1

    move v3, v0

    .line 4
    :goto_1
    iget-object v4, v2, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->formats:[Landroidx/media3/common/w;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    move v4, v0

    .line 5
    :goto_2
    iget v5, v2, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->chunkCount:I

    if-ge v4, v5, :cond_0

    .line 6
    new-instance v5, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 7
    invoke-virtual {v2, v4}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->getStartTimeUs(I)J

    move-result-wide v6

    new-instance v8, Lk1/l;

    .line 8
    invoke-virtual {v2, v3, v4}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$StreamElement;->buildRequestUri(II)Landroid/net/Uri;

    move-result-object v9

    invoke-direct {v8, v9}, Lk1/l;-><init>(Landroid/net/Uri;)V

    invoke-direct {v5, v6, v7, v8}, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;-><init>(JLk1/l;)V

    .line 9
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method
