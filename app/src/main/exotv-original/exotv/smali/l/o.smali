.class public Ll/o;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lk2/h;
.implements Ll/y;
.implements Ll/k;
.implements Lm/t0;
.implements Lp3/g;
.implements Lx2/c;
.implements Lm0/o;


# instance fields
.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 4
    new-instance v0, Lm0/v;

    .line 5
    invoke-direct {v0, p1}, Landroidx/media3/common/a;-><init>(Landroid/view/View;)V

    .line 6
    iput-object p1, v0, Lm0/v;->b:Landroid/view/View;

    .line 7
    iput-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    return-void

    .line 8
    :cond_0
    new-instance v0, Landroidx/media3/common/a;

    invoke-direct {v0, p1}, Landroidx/media3/common/a;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/o;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static v(Lm3/j;Lr3/k;Lp3/a;Lp3/b;)Lr3/r;
    .locals 8

    .line 1
    new-instance v0, Lr3/r;

    .line 2
    .line 3
    iget-object v1, p3, Lp3/b;->a:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget-object v2, p1, Lr3/k;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    move-object v3, v1

    .line 12
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 15
    .line 16
    .line 17
    sget-object v3, Li3/f;->j:Li3/f;

    .line 18
    .line 19
    iget-object p3, p3, Lp3/b;->b:Ljava/util/Map;

    .line 20
    .line 21
    const-string v2, "coil#disk_cache_key"

    .line 22
    .line 23
    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    instance-of v4, v2, Ljava/lang/String;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v2, v5

    .line 36
    :goto_0
    const-string v4, "coil#is_sampled"

    .line 37
    .line 38
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    instance-of v4, p3, Ljava/lang/Boolean;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    move-object v5, p3

    .line 47
    check-cast v5, Ljava/lang/Boolean;

    .line 48
    .line 49
    :cond_1
    const/4 p3, 0x0

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    move v6, v4

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v6, p3

    .line 59
    :goto_1
    sget-object v4, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    iget-boolean p0, p0, Lm3/j;->g:Z

    .line 64
    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    const/4 p3, 0x1

    .line 68
    :cond_3
    move-object v4, p2

    .line 69
    move v7, p3

    .line 70
    move-object v5, v2

    .line 71
    move-object v2, p1

    .line 72
    invoke-direct/range {v0 .. v7}, Lr3/r;-><init>(Landroid/graphics/drawable/Drawable;Lr3/k;Li3/f;Lp3/a;Ljava/lang/String;ZZ)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Ll/m;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Ll/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ll/f0;

    .line 7
    .line 8
    iget-object v0, v0, Ll/f0;->I:Ll/m;

    .line 9
    .line 10
    invoke-virtual {v0}, Ll/m;->k()Ll/m;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ll/m;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lm/k;

    .line 21
    .line 22
    iget-object v0, v0, Lm/k;->n:Ll/y;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Ll/y;->b(Ll/m;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public c(J)I
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, -0x1

    .line 10
    return p1
.end method

.method public d()V
    .locals 2

    .line 1
    const-string v0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v1, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(Lp3/a;)Lp3/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public f(I)J
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-static {p1}, Lh1/a;->d(Z)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0
.end method

.method public g(Lp3/a;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La4/j;

    .line 4
    .line 5
    invoke-static {p2}, Lb6/v;->d(Landroid/graphics/Bitmap;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, p1, p2, p3, v1}, La4/j;->h(Lp3/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public h(Ll/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->D:Lm/f2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lm/f2;->h(Ll/m;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public i(Ll/m;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm/k;

    .line 4
    .line 5
    iget-object v1, v0, Lm/k;->l:Ll/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Ll/f0;

    .line 13
    .line 14
    iget-object v1, v1, Ll/f0;->J:Ll/p;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lm/k;->n:Ll/y;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ll/y;->i(Ll/m;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    return v2
.end method

.method public j(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p2, p0, Ll/o;->j:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public k(Ll/m;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Ll/o;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->I:Lm/n;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lm/f2;

    .line 10
    .line 11
    iget-object p1, p1, Lm/f2;->j:Landroidx/appcompat/widget/Toolbar;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->P:La4/c;

    .line 14
    .line 15
    iget-object p1, p1, La4/c;->m:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, La1/g0;

    .line 34
    .line 35
    iget-object p2, p2, La1/g0;->a:La1/n0;

    .line 36
    .line 37
    invoke-virtual {p2}, La1/n0;->o()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public l(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(J)Ljava/util/List;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ll/o;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public n()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public o(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 5

    .line 1
    iget-object p1, p2, Lm0/r1;->a:Lm0/o1;

    .line 2
    .line 3
    iget-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->w:Lm0/r1;

    .line 8
    .line 9
    invoke-static {v1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_5

    .line 14
    .line 15
    iput-object p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->w:Lm0/r1;

    .line 16
    .line 17
    invoke-virtual {p2}, Lm0/r1;->d()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v2

    .line 28
    :goto_0
    iput-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->x:Z

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v3, v2

    .line 40
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lm0/o1;->n()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    :goto_2
    if-ge v2, v1, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    sget-object v4, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Lz/d;

    .line 73
    .line 74
    iget-object v3, v3, Lz/d;->a:Lz/a;

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Lm0/o1;->n()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-object p2
.end method

.method public q(IF)V
    .locals 0

    .line 1
    return-void
.end method

.method public r(I)Ln0/d;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public s(I)Ln0/d;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public t(Lr3/k;Lp3/a;Ls3/h;Ls3/g;)Lp3/b;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lr3/k;->o:Lr3/b;

    .line 8
    .line 9
    iget-boolean v3, v3, Lr3/b;->j:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    move-object/from16 v3, p0

    .line 15
    .line 16
    goto/16 :goto_14

    .line 17
    .line 18
    :cond_0
    move-object/from16 v3, p0

    .line 19
    .line 20
    iget-object v5, v3, Ll/o;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lh3/h;

    .line 23
    .line 24
    iget-object v5, v5, Lh3/h;->c:Ll6/g;

    .line 25
    .line 26
    invoke-virtual {v5}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lp3/c;

    .line 31
    .line 32
    if-eqz v5, :cond_6

    .line 33
    .line 34
    iget-object v6, v5, Lp3/c;->a:Lp3/g;

    .line 35
    .line 36
    invoke-interface {v6, v1}, Lp3/g;->e(Lp3/a;)Lp3/b;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    if-nez v6, :cond_7

    .line 41
    .line 42
    iget-object v5, v5, Lp3/c;->b:La4/j;

    .line 43
    .line 44
    monitor-enter v5

    .line 45
    :try_start_0
    iget-object v6, v5, La4/j;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-virtual {v6, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    if-nez v6, :cond_1

    .line 57
    .line 58
    monitor-exit v5

    .line 59
    :goto_0
    move-object v6, v7

    .line 60
    goto :goto_5

    .line 61
    :cond_1
    :try_start_1
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    const/4 v9, 0x0

    .line 66
    :goto_1
    if-ge v9, v8, :cond_4

    .line 67
    .line 68
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    check-cast v10, Lp3/f;

    .line 73
    .line 74
    iget-object v11, v10, Lp3/f;->b:Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    check-cast v11, Landroid/graphics/Bitmap;

    .line 81
    .line 82
    if-eqz v11, :cond_2

    .line 83
    .line 84
    new-instance v12, Lp3/b;

    .line 85
    .line 86
    iget-object v10, v10, Lp3/f;->c:Ljava/util/Map;

    .line 87
    .line 88
    invoke-direct {v12, v11, v10}, Lp3/b;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto :goto_4

    .line 94
    :cond_2
    move-object v12, v7

    .line 95
    :goto_2
    if-eqz v12, :cond_3

    .line 96
    .line 97
    move-object v7, v12

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    :goto_3
    iget v6, v5, La4/j;->j:I

    .line 103
    .line 104
    add-int/lit8 v8, v6, 0x1

    .line 105
    .line 106
    iput v8, v5, La4/j;->j:I

    .line 107
    .line 108
    const/16 v8, 0xa

    .line 109
    .line 110
    if-lt v6, v8, :cond_5

    .line 111
    .line 112
    invoke-virtual {v5}, La4/j;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    .line 115
    :cond_5
    monitor-exit v5

    .line 116
    goto :goto_0

    .line 117
    :goto_4
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    throw v0

    .line 119
    :cond_6
    move-object v6, v4

    .line 120
    :cond_7
    :goto_5
    if-eqz v6, :cond_1b

    .line 121
    .line 122
    iget-object v5, v6, Lp3/b;->a:Landroid/graphics/Bitmap;

    .line 123
    .line 124
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    if-nez v7, :cond_8

    .line 129
    .line 130
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 131
    .line 132
    :cond_8
    invoke-static {v0, v7}, La4/c;->D(Lr3/k;Landroid/graphics/Bitmap$Config;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-nez v7, :cond_9

    .line 137
    .line 138
    :goto_6
    const/4 v8, 0x0

    .line 139
    goto/16 :goto_13

    .line 140
    .line 141
    :cond_9
    iget-object v7, v6, Lp3/b;->b:Ljava/util/Map;

    .line 142
    .line 143
    const-string v9, "coil#is_sampled"

    .line 144
    .line 145
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    instance-of v9, v7, Ljava/lang/Boolean;

    .line 150
    .line 151
    if-eqz v9, :cond_a

    .line 152
    .line 153
    check-cast v7, Ljava/lang/Boolean;

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_a
    move-object v7, v4

    .line 157
    :goto_7
    if-eqz v7, :cond_b

    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    goto :goto_8

    .line 164
    :cond_b
    const/4 v7, 0x0

    .line 165
    :goto_8
    sget-object v9, Ls3/h;->c:Ls3/h;

    .line 166
    .line 167
    invoke-static {v2, v9}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_d

    .line 172
    .line 173
    if-eqz v7, :cond_c

    .line 174
    .line 175
    goto/16 :goto_11

    .line 176
    .line 177
    :cond_c
    :goto_9
    const/4 v9, 0x1

    .line 178
    goto/16 :goto_12

    .line 179
    .line 180
    :cond_d
    iget-object v1, v1, Lp3/a;->k:Ljava/util/Map;

    .line 181
    .line 182
    const-string v9, "coil#transformation_size"

    .line 183
    .line 184
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Ljava/lang/String;

    .line 189
    .line 190
    if-eqz v1, :cond_e

    .line 191
    .line 192
    invoke-virtual {v2}, Ls3/h;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    goto/16 :goto_13

    .line 201
    .line 202
    :cond_e
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    iget-object v9, v2, Ls3/h;->a:Lcom/bumptech/glide/d;

    .line 211
    .line 212
    instance-of v11, v9, Ls3/a;

    .line 213
    .line 214
    const v12, 0x7fffffff

    .line 215
    .line 216
    .line 217
    if-eqz v11, :cond_f

    .line 218
    .line 219
    check-cast v9, Ls3/a;

    .line 220
    .line 221
    iget v9, v9, Ls3/a;->n:I

    .line 222
    .line 223
    goto :goto_a

    .line 224
    :cond_f
    move v9, v12

    .line 225
    :goto_a
    iget-object v2, v2, Ls3/h;->b:Lcom/bumptech/glide/d;

    .line 226
    .line 227
    instance-of v11, v2, Ls3/a;

    .line 228
    .line 229
    if-eqz v11, :cond_10

    .line 230
    .line 231
    check-cast v2, Ls3/a;

    .line 232
    .line 233
    iget v2, v2, Ls3/a;->n:I

    .line 234
    .line 235
    :goto_b
    move-object/from16 v11, p4

    .line 236
    .line 237
    goto :goto_c

    .line 238
    :cond_10
    move v2, v12

    .line 239
    goto :goto_b

    .line 240
    :goto_c
    invoke-static {v1, v5, v9, v2, v11}, Landroid/support/v4/media/session/b;->n(IIIILs3/g;)D

    .line 241
    .line 242
    .line 243
    move-result-wide v13

    .line 244
    invoke-static {v0}, Lv3/d;->a(Lr3/k;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 249
    .line 250
    if-eqz v0, :cond_13

    .line 251
    .line 252
    cmpl-double v11, v13, v15

    .line 253
    .line 254
    if-lez v11, :cond_11

    .line 255
    .line 256
    move-wide v11, v15

    .line 257
    goto :goto_d

    .line 258
    :cond_11
    move-wide v11, v13

    .line 259
    :goto_d
    int-to-double v8, v9

    .line 260
    move-wide/from16 p1, v11

    .line 261
    .line 262
    int-to-double v10, v1

    .line 263
    mul-double v11, p1, v10

    .line 264
    .line 265
    sub-double/2addr v8, v11

    .line 266
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    .line 267
    .line 268
    .line 269
    move-result-wide v8

    .line 270
    cmpg-double v1, v8, v15

    .line 271
    .line 272
    if-lez v1, :cond_c

    .line 273
    .line 274
    int-to-double v1, v2

    .line 275
    int-to-double v8, v5

    .line 276
    mul-double v11, p1, v8

    .line 277
    .line 278
    sub-double/2addr v1, v11

    .line 279
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 280
    .line 281
    .line 282
    move-result-wide v1

    .line 283
    cmpg-double v1, v1, v15

    .line 284
    .line 285
    if-gtz v1, :cond_12

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_12
    const/4 v9, 0x1

    .line 289
    goto :goto_f

    .line 290
    :cond_13
    const/high16 v8, -0x80000000

    .line 291
    .line 292
    if-eq v9, v8, :cond_14

    .line 293
    .line 294
    if-ne v9, v12, :cond_15

    .line 295
    .line 296
    :cond_14
    const/4 v9, 0x1

    .line 297
    goto :goto_e

    .line 298
    :cond_15
    sub-int/2addr v9, v1

    .line 299
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    const/4 v9, 0x1

    .line 304
    if-gt v1, v9, :cond_17

    .line 305
    .line 306
    :goto_e
    if-eq v2, v8, :cond_1a

    .line 307
    .line 308
    if-ne v2, v12, :cond_16

    .line 309
    .line 310
    goto :goto_12

    .line 311
    :cond_16
    sub-int/2addr v2, v5

    .line 312
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-gt v1, v9, :cond_17

    .line 317
    .line 318
    goto :goto_12

    .line 319
    :cond_17
    :goto_f
    cmpg-double v1, v13, v15

    .line 320
    .line 321
    if-nez v1, :cond_18

    .line 322
    .line 323
    goto :goto_10

    .line 324
    :cond_18
    if-nez v0, :cond_19

    .line 325
    .line 326
    goto :goto_11

    .line 327
    :cond_19
    :goto_10
    cmpl-double v0, v13, v15

    .line 328
    .line 329
    if-lez v0, :cond_1a

    .line 330
    .line 331
    if-eqz v7, :cond_1a

    .line 332
    .line 333
    :goto_11
    goto/16 :goto_6

    .line 334
    .line 335
    :cond_1a
    :goto_12
    move v8, v9

    .line 336
    :goto_13
    if-eqz v8, :cond_1b

    .line 337
    .line 338
    return-object v6

    .line 339
    :cond_1b
    :goto_14
    return-object v4
.end method

.method public u(Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;)Lp3/a;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p4, p1, Lr3/k;->g:Ljava/util/List;

    .line 5
    .line 6
    iget-object v0, p0, Ll/o;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh3/h;

    .line 9
    .line 10
    iget-object v0, v0, Lh3/h;->g:Lh3/c;

    .line 11
    .line 12
    iget-object v0, v0, Lh3/c;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    const/4 v4, 0x0

    .line 21
    if-ge v3, v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Ll6/d;

    .line 28
    .line 29
    iget-object v6, v5, Ll6/d;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, Ln3/b;

    .line 32
    .line 33
    iget-object v5, v5, Ll6/d;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    const-string v5, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>"

    .line 48
    .line 49
    invoke-static {v5, v6}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v6, p2, p3}, Ln3/b;->a(Ljava/lang/Object;Lr3/o;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v5, v4

    .line 63
    :goto_1
    if-nez v5, :cond_2

    .line 64
    .line 65
    return-object v4

    .line 66
    :cond_2
    iget-object p1, p1, Lr3/k;->y:Lr3/p;

    .line 67
    .line 68
    iget-object p1, p1, Lr3/p;->j:Ljava/util/Map;

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    sget-object v0, Lm6/q;->j:Lm6/q;

    .line 75
    .line 76
    if-eqz p2, :cond_3

    .line 77
    .line 78
    move-object p2, v0

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 81
    .line 82
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_7

    .line 98
    .line 99
    :goto_2
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_4

    .line 110
    .line 111
    new-instance p1, Lp3/a;

    .line 112
    .line 113
    invoke-direct {p1, v5, v0}, Lp3/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 114
    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_4
    invoke-static {p2}, Lm6/s;->Y(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-nez p2, :cond_6

    .line 126
    .line 127
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-gtz p2, :cond_5

    .line 132
    .line 133
    iget-object p2, p3, Lr3/o;->d:Ls3/h;

    .line 134
    .line 135
    invoke-virtual {p2}, Ls3/h;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    const-string p3, "coil#transformation_size"

    .line 140
    .line 141
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance p1, Ljava/lang/ClassCastException;

    .line 153
    .line 154
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_6
    :goto_3
    new-instance p2, Lp3/a;

    .line 159
    .line 160
    invoke-direct {p2, v5, p1}, Lp3/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 161
    .line 162
    .line 163
    return-object p2

    .line 164
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Ljava/util/Map$Entry;

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance p1, Ljava/lang/ClassCastException;

    .line 178
    .line 179
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw p1
.end method

.method public w(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public x(Lcom/exotv/net/model/Channel;Lr6/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lz4/m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz4/m0;

    .line 7
    .line 8
    iget v1, v0, Lz4/m0;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/m0;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/m0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lz4/m0;-><init>(Ll/o;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lz4/m0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/m0;->p:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    if-eq v2, v6, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 46
    .line 47
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 61
    .line 62
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_3
    iget-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 68
    .line 69
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_4
    iget-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 75
    .line 76
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_5
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->isBackup()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_6

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getBackups()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-nez p2, :cond_6

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getBackups()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Lm6/h;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Lcom/exotv/net/model/BackupSource;

    .line 109
    .line 110
    new-instance p2, Lcom/exotv/net/model/ResolvedStream;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/exotv/net/model/BackupSource;->getUrl()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p1}, Lcom/exotv/net/model/BackupSource;->getHeaders()Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {p1}, Lcom/exotv/net/model/BackupSource;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p2, v0, v1, p1}, Lcom/exotv/net/model/ResolvedStream;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :cond_6
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getResolverKind()Lcom/exotv/net/model/ResolverKind;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    sget-object v2, Lz4/l0;->a:[I

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    aget p2, v2, p2

    .line 143
    .line 144
    sget-object v2, Lz4/k0;->a:Lz4/k0;

    .line 145
    .line 146
    if-eq p2, v6, :cond_f

    .line 147
    .line 148
    if-eq p2, v5, :cond_d

    .line 149
    .line 150
    if-eq p2, v4, :cond_b

    .line 151
    .line 152
    if-eq p2, v3, :cond_a

    .line 153
    .line 154
    const/4 v4, 0x5

    .line 155
    if-ne p2, v4, :cond_9

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getId()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-nez p2, :cond_7

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getIdO()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    if-nez p2, :cond_7

    .line 168
    .line 169
    const-string p2, ""

    .line 170
    .line 171
    :cond_7
    iput-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 172
    .line 173
    iput v3, v0, Lz4/m0;->p:I

    .line 174
    .line 175
    invoke-virtual {v2, p2, v0}, Lz4/k0;->d(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    if-ne p2, v1, :cond_8

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_8
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_9
    new-instance p1, La1/u;

    .line 186
    .line 187
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_a
    sget-object p2, Lm6/p;->j:Lm6/p;

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_b
    sget-object p2, Lz4/k;->a:Lz4/k;

    .line 195
    .line 196
    iget-object v2, p0, Ll/o;->j:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Lcom/exotv/net/MainActivity;

    .line 199
    .line 200
    iput-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 201
    .line 202
    iput v4, v0, Lz4/m0;->p:I

    .line 203
    .line 204
    invoke-virtual {p2, v2, p1, v0}, Lz4/k;->k(Lcom/exotv/net/MainActivity;Lcom/exotv/net/model/Channel;Lr6/c;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    if-ne p2, v1, :cond_c

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_c
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_d
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getIdO()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-static {p2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getCatO()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-static {v3}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    iput-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 229
    .line 230
    iput v5, v0, Lz4/m0;->p:I

    .line 231
    .line 232
    invoke-virtual {v2, p2, v3, v0}, Lz4/k0;->a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    if-ne p2, v1, :cond_e

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_e
    :goto_3
    check-cast p2, Ljava/util/List;

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_f
    iput-object p1, v0, Lz4/m0;->m:Lcom/exotv/net/model/Channel;

    .line 243
    .line 244
    iput v6, v0, Lz4/m0;->p:I

    .line 245
    .line 246
    invoke-virtual {v2, p1, v0}, Lz4/k0;->e(Lcom/exotv/net/model/Channel;Lr6/c;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    if-ne p2, v1, :cond_10

    .line 251
    .line 252
    :goto_4
    return-object v1

    .line 253
    :cond_10
    :goto_5
    check-cast p2, Ljava/util/List;

    .line 254
    .line 255
    :goto_6
    new-instance v0, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    :cond_11
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_12

    .line 269
    .line 270
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    move-object v2, v1

    .line 275
    check-cast v2, Lcom/exotv/net/model/ResolvedStream;

    .line 276
    .line 277
    invoke-virtual {v2}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-nez v2, :cond_11

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    const-string v1, "\'"

    .line 296
    .line 297
    const-string v2, "Resolver"

    .line 298
    .line 299
    if-eqz p2, :cond_13

    .line 300
    .line 301
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getDisplayName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    new-instance p2, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v3, "resolve failed for \'"

    .line 308
    .line 309
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 323
    .line 324
    .line 325
    return-object v0

    .line 326
    :cond_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    if-le p2, v6, :cond_14

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 333
    .line 334
    .line 335
    move-result p2

    .line 336
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getDisplayName()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    new-instance v3, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v4, "resolved "

    .line 343
    .line 344
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string p2, " servers for \'"

    .line 351
    .line 352
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 366
    .line 367
    .line 368
    :cond_14
    return-object v0
.end method
