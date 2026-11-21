.class public final Lz4/g;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lz4/k;

.field public o:I


# direct methods
.method public constructor <init>(Lz4/k;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/g;->n:Lz4/k;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lz4/g;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lz4/g;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lz4/g;->o:I

    .line 9
    .line 10
    iget-object p1, p0, Lz4/g;->n:Lz4/k;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lz4/k;->f(Lb5/i;Landroid/content/Context;Lr6/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
