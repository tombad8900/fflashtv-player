.class public final Lz4/p;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lz4/g0;

.field public o:I


# direct methods
.method public constructor <init>(Lz4/g0;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/p;->n:Lz4/g0;

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
    iput-object p1, p0, Lz4/p;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lz4/p;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lz4/p;->o:I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, Lz4/p;->n:Lz4/g0;

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
    invoke-virtual/range {v0 .. v6}, Lz4/g0;->a(Landroid/app/Activity;Ljava/lang/String;IIZLr6/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
