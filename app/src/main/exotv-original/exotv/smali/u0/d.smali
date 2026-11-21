.class public final Lu0/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final i:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Lp/k;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ll/o;

.field public final d:Landroidx/lifecycle/c0;

.field public final e:Ls/e;

.field public f:Z

.field public g:F

.field public h:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu0/d;->i:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ls/e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp/k;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lp/k;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lu0/d;->a:Lp/k;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lu0/d;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Ll/o;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Ll/o;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lu0/d;->c:Ll/o;

    .line 25
    .line 26
    new-instance v0, Landroidx/lifecycle/c0;

    .line 27
    .line 28
    const/16 v2, 0x11

    .line 29
    .line 30
    invoke-direct {v0, v2, p0}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lu0/d;->d:Landroidx/lifecycle/c0;

    .line 34
    .line 35
    iput-boolean v1, p0, Lu0/d;->f:Z

    .line 36
    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    iput v0, p0, Lu0/d;->g:F

    .line 40
    .line 41
    iput-object p1, p0, Lu0/d;->e:Ls/e;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Lu0/f;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu0/d;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lu0/d;->e:Ls/e;

    .line 10
    .line 11
    iget-object v1, v1, Ls/e;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/view/Choreographer;

    .line 14
    .line 15
    new-instance v2, Lu0/c;

    .line 16
    .line 17
    iget-object v3, p0, Lu0/d;->d:Landroidx/lifecycle/c0;

    .line 18
    .line 19
    invoke-direct {v2, v3}, Lu0/c;-><init>(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 23
    .line 24
    .line 25
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v2, 0x21

    .line 28
    .line 29
    if-lt v1, v2, :cond_1

    .line 30
    .line 31
    invoke-static {}, Landroid/animation/ValueAnimator;->getDurationScale()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, Lu0/d;->g:F

    .line 36
    .line 37
    iget-object v1, p0, Lu0/d;->h:Lu0/b;

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    new-instance v1, Lu0/b;

    .line 42
    .line 43
    invoke-direct {v1, p0}, Lu0/b;-><init>(Lu0/d;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lu0/d;->h:Lu0/b;

    .line 47
    .line 48
    :cond_0
    iget-object v1, p0, Lu0/d;->h:Lu0/b;

    .line 49
    .line 50
    iget-object v2, v1, Lu0/b;->a:Lu0/a;

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    new-instance v2, Lu0/a;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Lu0/a;-><init>(Lu0/b;)V

    .line 57
    .line 58
    .line 59
    iput-object v2, v1, Lu0/b;->a:Lu0/a;

    .line 60
    .line 61
    invoke-static {v2}, Landroid/animation/ValueAnimator;->registerDurationScaleChangeListener(Landroid/animation/ValueAnimator$DurationScaleChangeListener;)Z

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method
