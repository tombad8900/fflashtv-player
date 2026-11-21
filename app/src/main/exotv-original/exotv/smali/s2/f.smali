.class public final Ls2/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final j:I

.field public final k:Ls2/b;


# direct methods
.method public constructor <init>(ILs2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ls2/f;->j:I

    .line 5
    .line 6
    iput-object p2, p0, Ls2/f;->k:Ls2/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ls2/f;

    .line 2
    .line 3
    iget v0, p0, Ls2/f;->j:I

    .line 4
    .line 5
    iget p1, p1, Ls2/f;->j:I

    .line 6
    .line 7
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
