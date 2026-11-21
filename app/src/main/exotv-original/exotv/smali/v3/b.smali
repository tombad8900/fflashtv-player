.class public final Lv3/b;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public m:Landroidx/lifecycle/o;

.field public n:Lz6/n;

.field public synthetic o:Ljava/lang/Object;

.field public p:I


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lv3/b;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lv3/b;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lv3/b;->p:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p0}, Lt2/w;->b(Landroidx/lifecycle/o;Lr6/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
