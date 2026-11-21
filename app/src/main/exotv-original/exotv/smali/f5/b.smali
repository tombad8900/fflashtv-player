.class public final Lf5/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh2/c;


# instance fields
.field public j:I

.field public k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILandroid/util/SparseArray;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lf5/b;->j:I

    .line 24
    iput p2, p0, Lf5/b;->k:I

    .line 25
    iput-object p3, p0, Lf5/b;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 6

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf5/b;->l:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lf5/b;->k:I

    .line 6
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    .line 7
    sget-object v0, Lx/q;->h:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 8
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 9
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 10
    iget v3, p0, Lf5/b;->j:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Lf5/b;->j:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 11
    iget v3, p0, Lf5/b;->k:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Lf5/b;->k:I

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 14
    const-string v4, "layout"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 15
    new-instance v3, Lx/n;

    invoke-direct {v3}, Lx/n;-><init>()V

    .line 16
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v2}, Lx/n;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf5/b;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li1/c;Landroidx/media3/common/w;)V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iget-object p1, p1, Li1/c;->c:Lh1/w;

    iput-object p1, p0, Lf5/b;->l:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 28
    invoke-virtual {p1, v0}, Lh1/w;->G(I)V

    .line 29
    invoke-virtual {p1}, Lh1/w;->y()I

    move-result v0

    .line 30
    const-string v1, "audio/raw"

    iget-object v2, p2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 31
    iget v1, p2, Landroidx/media3/common/w;->E:I

    iget p2, p2, Landroidx/media3/common/w;->C:I

    invoke-static {v1, p2}, Lh1/i0;->E(II)I

    move-result p2

    if-eqz v0, :cond_0

    .line 32
    rem-int v1, v0, p2

    if-eqz v1, :cond_1

    .line 33
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Audio sample size mismatch. stsd sample size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", stsz sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BoxParsers"

    invoke-static {v1, v0}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    move v0, p2

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    .line 34
    :cond_2
    iput v0, p0, Lf5/b;->j:I

    .line 35
    invoke-virtual {p1}, Lh1/w;->y()I

    move-result p1

    iput p1, p0, Lf5/b;->k:I

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lf5/b;->l:Ljava/lang/Object;

    .line 20
    iput p2, p0, Lf5/b;->j:I

    .line 21
    iput p3, p0, Lf5/b;->k:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lf5/b;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lf5/b;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget v0, p0, Lf5/b;->j:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lf5/b;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh1/w;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh1/w;->y()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :cond_0
    return v0
.end method
