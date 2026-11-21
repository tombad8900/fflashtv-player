.class public final Lt2/a0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lt2/h;

.field public final b:Lh1/d0;

.field public final c:Lh1/v;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J


# direct methods
.method public constructor <init>(Lt2/h;Lh1/d0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/a0;->a:Lt2/h;

    .line 5
    .line 6
    iput-object p2, p0, Lt2/a0;->b:Lh1/d0;

    .line 7
    .line 8
    new-instance p1, Lh1/v;

    .line 9
    .line 10
    const/16 p2, 0x40

    .line 11
    .line 12
    new-array v0, p2, [B

    .line 13
    .line 14
    invoke-direct {p1, v0, p2}, Lh1/v;-><init>([BI)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lt2/a0;->c:Lh1/v;

    .line 18
    .line 19
    return-void
.end method
