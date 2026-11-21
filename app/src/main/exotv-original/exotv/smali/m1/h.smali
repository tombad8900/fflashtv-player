.class public abstract Lm1/h;
.super Lm1/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public shouldBeSkipped:Z

.field public skippedOutputBufferCount:I

.field public timeUs:J


# virtual methods
.method public clear()V
    .locals 2

    .line 1
    invoke-super {p0}, Lm1/a;->clear()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lm1/h;->timeUs:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lm1/h;->skippedOutputBufferCount:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lm1/h;->shouldBeSkipped:Z

    .line 12
    .line 13
    return-void
.end method

.method public abstract release()V
.end method
