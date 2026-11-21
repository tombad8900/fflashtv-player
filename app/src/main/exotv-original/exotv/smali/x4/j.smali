.class public final Lx4/j;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lx4/k;

.field public o:I


# direct methods
.method public constructor <init>(Lx4/k;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx4/j;->n:Lx4/k;

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
    iput-object p1, p0, Lx4/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lx4/j;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lx4/j;->o:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, Lx4/j;->n:Lx4/k;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, Lx4/k;->g(IILjava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
