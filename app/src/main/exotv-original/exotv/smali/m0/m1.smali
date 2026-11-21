.class public Lm0/m1;
.super Lm0/l1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final r:Lm0/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lg2/d;->e()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Lm0/r1;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lm0/r1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lm0/m1;->r:Lm0/r1;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lm0/r1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lm0/l1;-><init>(Lm0/r1;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(I)Le0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/i1;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lm0/p1;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Le0/b;->d(Landroid/graphics/Insets;)Le0/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public g(I)Le0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/i1;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lm0/p1;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Le0/b;->d(Landroid/graphics/Insets;)Le0/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
