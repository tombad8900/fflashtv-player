.class public final Lm3/e;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public m:Lm3/h;

.field public n:Lh3/c;

.field public o:Lr3/k;

.field public p:Ljava/lang/Object;

.field public q:Lr3/o;

.field public r:Lh3/d;

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lm3/h;

.field public v:I


# direct methods
.method public constructor <init>(Lm3/h;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm3/e;->u:Lm3/h;

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
    .locals 7

    .line 1
    iput-object p1, p0, Lm3/e;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lm3/e;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lm3/e;->v:I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, Lm3/e;->u:Lm3/h;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, Lm3/h;->c(Lh3/c;Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;Lr6/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
