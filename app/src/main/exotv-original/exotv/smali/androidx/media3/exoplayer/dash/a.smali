.class public final synthetic Landroidx/media3/exoplayer/dash/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 2
    .line 3
    check-cast p2, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;->a(Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
