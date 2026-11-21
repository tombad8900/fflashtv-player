.class public final Lb6/g;
.super Ly5/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lb6/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ly5/h;-><init>(Ly5/h;)V

    .line 4
    iget-object p1, p1, Lb6/g;->q:Landroid/graphics/RectF;

    iput-object p1, p0, Lb6/g;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Ly5/o;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly5/h;-><init>(Ly5/m;)V

    .line 2
    iput-object p2, p0, Lb6/g;->q:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Lb6/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ly5/j;-><init>(Ly5/h;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lb6/i;->P:Lb6/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Ly5/j;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
