.class public final Lh3/f;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public m:Lh3/h;

.field public n:Lr3/q;

.field public o:Lr3/k;

.field public p:Lh3/d;

.field public q:Landroid/graphics/Bitmap;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lh3/h;

.field public t:I


# direct methods
.method public constructor <init>(Lh3/h;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh3/f;->s:Lh3/h;

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
    iput-object p1, p0, Lh3/f;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lh3/f;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lh3/f;->t:I

    .line 9
    .line 10
    iget-object p1, p0, Lh3/f;->s:Lh3/h;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lh3/h;->a(Lh3/h;Lr3/k;Lr6/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
