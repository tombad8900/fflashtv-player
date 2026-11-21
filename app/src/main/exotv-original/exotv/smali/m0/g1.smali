.class public final Lm0/g1;
.super Lm0/f1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm0/f1;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm0/r1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lm0/f1;-><init>(Lm0/r1;)V

    return-void
.end method


# virtual methods
.method public c(ILe0/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/e1;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-static {p1}, Lm0/q1;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Le0/b;->e()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {v0, p1, p2}, Landroid/view/WindowInsets$Builder;->setInsets(ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 12
    .line 13
    .line 14
    return-void
.end method
