.class public final Lb6/s;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public a:I

.field public b:I

.field public final c:Ljava/lang/Cloneable;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-array p1, p1, [Lh2/r;

    iput-object p1, p0, Lb6/s;->c:Ljava/lang/Cloneable;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lb6/s;->b:I

    return-void
.end method

.method public constructor <init>(Lb6/t;La4/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lb6/s;->c:Ljava/lang/Cloneable;

    .line 3
    iput-object p1, p0, Lb6/s;->d:Ljava/lang/Object;

    .line 4
    iget-object p1, p2, La4/c;->l:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1c

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 6
    iput p2, p0, Lb6/s;->a:I

    const/16 p2, 0x35

    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 8
    iput p1, p0, Lb6/s;->b:I

    return-void
.end method
