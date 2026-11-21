.class public interface abstract Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/audio/DefaultAudioSink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioTrackProvider"
.end annotation


# static fields
.field public static final DEFAULT:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/audio/DefaultAudioTrackProvider;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioTrackProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;->DEFAULT:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract getAudioTrack(Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;Landroidx/media3/common/g;I)Landroid/media/AudioTrack;
.end method
