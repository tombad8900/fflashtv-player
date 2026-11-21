.class public Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser$MissingFieldException;
.super Landroidx/media3/common/v0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MissingFieldException"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "Missing required field: "

    .line 2
    .line 3
    invoke-static {v0, p1}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x4

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, p1, v2, v0, v1}, Landroidx/media3/common/v0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
