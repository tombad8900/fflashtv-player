.class public final Le3/b;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Ll5/a;


# direct methods
.method public constructor <init>(Ll5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le3/b;->a:Ll5/a;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le3/b;->a:Ll5/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll5/a;->b:Ll5/c;

    .line 4
    .line 5
    iget-object v0, v0, Ll5/c;->x:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le3/b;->a:Ll5/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ll5/a;->a(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
