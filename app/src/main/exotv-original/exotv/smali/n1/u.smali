.class public abstract Ln1/u;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/c0;


# instance fields
.field private final seekMap:Ln1/c0;


# direct methods
.method public constructor <init>(Ln1/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln1/u;->seekMap:Ln1/c0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getDurationUs()J
    .locals 2

    .line 1
    iget-object v0, p0, Ln1/u;->seekMap:Ln1/c0;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/c0;->getDurationUs()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getSeekPoints(J)Ln1/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Ln1/u;->seekMap:Ln1/c0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ln1/c0;->getSeekPoints(J)Ln1/b0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public isSeekable()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln1/u;->seekMap:Ln1/c0;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/c0;->isSeekable()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
