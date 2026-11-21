.class public Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$ProtectionElement;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProtectionElement"
.end annotation


# instance fields
.field public final data:[B

.field public final trackEncryptionBoxes:[Lh2/r;

.field public final uuid:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;[B[Lh2/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$ProtectionElement;->uuid:Ljava/util/UUID;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$ProtectionElement;->data:[B

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest$ProtectionElement;->trackEncryptionBoxes:[Lh2/r;

    .line 9
    .line 10
    return-void
.end method
