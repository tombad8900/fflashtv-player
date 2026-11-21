.class public final Lt0/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/animation/Interpolator;


# instance fields
.field public final synthetic a:Lt0/f;


# direct methods
.method public constructor <init>(Lt0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt0/e;->a:Lt0/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/e;->a:Lt0/f;

    .line 2
    .line 3
    iget-object v0, v0, Lt0/f;->u:Lt0/d;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lt0/d;->getInterpolation(F)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
