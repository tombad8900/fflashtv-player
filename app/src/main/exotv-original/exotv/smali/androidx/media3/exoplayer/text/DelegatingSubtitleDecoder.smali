.class final Landroidx/media3/exoplayer/text/DelegatingSubtitleDecoder;
.super Lk2/g;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field private final subtitleParser:Lk2/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lk2/q;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lk2/g;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/text/DelegatingSubtitleDecoder;->subtitleParser:Lk2/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public decode([BIZ)Lk2/h;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p0, Landroidx/media3/exoplayer/text/DelegatingSubtitleDecoder;->subtitleParser:Lk2/q;

    .line 4
    .line 5
    invoke-interface {p3}, Lk2/q;->reset()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p3, p0, Landroidx/media3/exoplayer/text/DelegatingSubtitleDecoder;->subtitleParser:Lk2/q;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-interface {p3, p1, v0, p2}, Lk2/q;->d([BII)Lk2/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
