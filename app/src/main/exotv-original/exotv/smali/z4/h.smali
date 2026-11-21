.class public final Lz4/h;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public m:Ljava/util/HashSet;

.field public n:Ljava/lang/String;

.field public o:Lb5/i;

.field public p:Landroid/content/Context;

.field public q:Ljava/lang/String;

.field public r:Lorg/json/JSONArray;

.field public s:I

.field public t:I

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public w:I


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iput-object p1, p0, Lz4/h;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lz4/h;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lz4/h;->w:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v7, p0

    .line 18
    invoke-static/range {v0 .. v7}, Lz4/k;->g(Ljava/util/HashSet;Ljava/lang/String;Lb5/i;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;ILr6/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
