.class public interface abstract Landroidx/media3/exoplayer/metadata/MetadataDecoderFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final DEFAULT:Landroidx/media3/exoplayer/metadata/MetadataDecoderFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/metadata/MetadataDecoderFactory$1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/exoplayer/metadata/MetadataDecoderFactory$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/metadata/MetadataDecoderFactory;->DEFAULT:Landroidx/media3/exoplayer/metadata/MetadataDecoderFactory;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract createDecoder(Landroidx/media3/common/w;)Lw1/a;
.end method

.method public abstract supportsFormat(Landroidx/media3/common/w;)Z
.end method
