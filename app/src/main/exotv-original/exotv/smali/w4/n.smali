.class public final Lw4/n;
.super Lz2/c0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lw4/n;->a:I

    .line 5
    .line 6
    iput p2, p0, Lw4/n;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Lz2/r0;)V
    .locals 0

    .line 1
    const-string p3, "outRect"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "view"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "state"

    .line 12
    .line 13
    invoke-static {p2, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lw4/n;->a:I

    .line 17
    .line 18
    div-int/lit8 p2, p2, 0x2

    .line 19
    .line 20
    iget p3, p0, Lw4/n;->b:I

    .line 21
    .line 22
    div-int/lit8 p3, p3, 0x2

    .line 23
    .line 24
    invoke-virtual {p1, p2, p3, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
