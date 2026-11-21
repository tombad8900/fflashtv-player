.class public final Lm3/c;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public m:Lm3/h;

.field public n:Lr3/k;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Lz6/n;

.field public r:Lz6/n;

.field public s:Lz6/n;

.field public t:Lz6/n;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lm3/h;

.field public w:I


# direct methods
.method public constructor <init>(Lm3/h;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm3/c;->v:Lm3/h;

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
    .locals 6

    .line 1
    iput-object p1, p0, Lm3/c;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lm3/c;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lm3/c;->w:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, Lm3/c;->v:Lm3/h;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-static/range {v0 .. v5}, Lm3/h;->b(Lm3/h;Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;Lr6/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
