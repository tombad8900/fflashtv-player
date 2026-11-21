.class public final synthetic Lu0/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/animation/ValueAnimator$DurationScaleChangeListener;


# instance fields
.field public final synthetic a:Lu0/b;


# direct methods
.method public synthetic constructor <init>(Lu0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/a;->a:Lu0/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onChanged(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a;->a:Lu0/b;

    .line 2
    .line 3
    iget-object v0, v0, Lu0/b;->b:Lu0/d;

    .line 4
    .line 5
    iput p1, v0, Lu0/d;->g:F

    .line 6
    .line 7
    return-void
.end method
