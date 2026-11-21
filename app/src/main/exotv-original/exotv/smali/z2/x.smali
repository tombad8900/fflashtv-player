.class public abstract Lz2/x;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lz2/y;

.field public b:Z

.field public final c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz2/y;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/database/Observable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz2/x;->a:Lz2/y;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lz2/x;->b:Z

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput v0, p0, Lz2/x;->c:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public b(I)J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/x;->a:Lz2/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz2/y;->c(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract d(Lz2/v0;I)V
.end method

.method public abstract e(Landroid/view/ViewGroup;)Lz2/v0;
.end method

.method public f(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method
