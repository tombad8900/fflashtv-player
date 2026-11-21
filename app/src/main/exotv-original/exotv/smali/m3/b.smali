.class public final Lm3/b;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public m:Lm3/h;

.field public n:Ll3/n;

.field public o:Lh3/c;

.field public p:Lr3/k;

.field public q:Ljava/lang/Object;

.field public r:Lr3/o;

.field public s:Lh3/d;

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lm3/h;

.field public w:I


# direct methods
.method public constructor <init>(Lm3/h;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm3/b;->v:Lm3/h;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lr6/c;-><init>(Lp6/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iput-object p1, p0, Lm3/b;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lm3/b;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lm3/b;->w:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, Lm3/b;->v:Lm3/h;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v7, p0

    .line 19
    invoke-static/range {v0 .. v7}, Lm3/h;->a(Lm3/h;Ll3/n;Lh3/c;Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;Lr6/c;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
