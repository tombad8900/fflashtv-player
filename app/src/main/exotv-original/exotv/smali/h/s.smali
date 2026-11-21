.class public final Lh/s;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public final j:Landroid/view/Window$Callback;

.field public k:Z

.field public l:Z

.field public m:Z

.field public final synthetic n:Lh/x;


# direct methods
.method public constructor <init>(Lh/x;Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/s;->n:Lh/x;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p2, "Window callback may not be null"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lh/s;->k:Z

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lh/s;->k:Z

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    iput-boolean v1, p0, Lh/s;->k:Z

    .line 13
    .line 14
    throw p1
.end method

.method public final b(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final c(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Landroid/view/Window$Callback;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/s;->l:Z

    .line 2
    .line 3
    iget-object v1, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Lh/s;->n:Lh/x;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lh/x;->t(Landroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_8

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Lh/s;->n:Lh/x;

    .line 15
    .line 16
    invoke-virtual {v2}, Lh/x;->z()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, Lh/x;->x:Lh/g0;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    iget-object v3, v3, Lh/g0;->x:Lh/f0;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    :cond_0
    move v0, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v3, v3, Lh/f0;->m:Ll/m;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v5}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eq v5, v1, :cond_2

    .line 47
    .line 48
    move v5, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v5, v4

    .line 51
    :goto_0
    invoke-virtual {v3, v5}, Ll/m;->setQwertyMode(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0, p1, v4}, Ll/m;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    :goto_1
    if-eqz v0, :cond_4

    .line 59
    .line 60
    :cond_3
    :goto_2
    move p1, v1

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    iget-object v0, v2, Lh/x;->U:Lh/w;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v2, v0, v3, p1}, Lh/x;->E(Lh/w;ILandroid/view/KeyEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    iget-object p1, v2, Lh/x;->U:Lh/w;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iput-boolean v1, p1, Lh/w;->l:Z

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    iget-object v0, v2, Lh/x;->U:Lh/w;

    .line 84
    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Lh/x;->y(I)Lh/w;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v2, v0, p1}, Lh/x;->F(Lh/w;Landroid/view/KeyEvent;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v2, v0, v3, p1}, Lh/x;->E(Lh/w;ILandroid/view/KeyEvent;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput-boolean v4, v0, Lh/w;->k:Z

    .line 103
    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    move p1, v4

    .line 108
    :goto_3
    if-eqz p1, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    return v4

    .line 112
    :cond_8
    :goto_4
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/s;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p2, Ll/m;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lh/s;->b(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x6c

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, p2, :cond_2

    .line 8
    .line 9
    iget-object p1, p0, Lh/s;->n:Lh/x;

    .line 10
    .line 11
    invoke-virtual {p1}, Lh/x;->z()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Lh/x;->x:Lh/g0;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object p2, p1, Lh/g0;->B:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-boolean v1, p1, Lh/g0;->A:Z

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput-boolean v0, p1, Lh/g0;->A:Z

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-gtz p1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    invoke-static {p1, p2}, La1/a1;->f(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    throw p1

    .line 40
    :cond_2
    :goto_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/s;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lh/s;->c(ILandroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x6c

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iget-object v1, p0, Lh/s;->n:Lh/x;

    .line 18
    .line 19
    if-ne p1, p2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Lh/x;->z()V

    .line 22
    .line 23
    .line 24
    iget-object p1, v1, Lh/x;->x:Lh/g0;

    .line 25
    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    iget-object p2, p1, Lh/g0;->B:Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-boolean v1, p1, Lh/g0;->A:Z

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput-boolean v0, p1, Lh/g0;->A:Z

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-gtz p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {v0, p2}, La1/a1;->f(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    throw p1

    .line 49
    :cond_3
    if-nez p1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Lh/x;->y(I)Lh/w;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-boolean p2, p1, Lh/w;->m:Z

    .line 56
    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    invoke-virtual {v1, p1, v0}, Lh/x;->r(Lh/w;Z)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_0
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lb6/v;->i(Landroid/view/Window$Callback;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    .line 1
    instance-of v0, p3, Ll/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ll/m;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    iput-boolean v2, v0, Ll/m;->G:Z

    .line 20
    .line 21
    :cond_2
    iget-object v2, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 22
    .line 23
    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iput-boolean v1, v0, Ll/m;->G:Z

    .line 30
    .line 31
    :cond_3
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/s;->n:Lh/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lh/x;->y(I)Lh/w;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lh/w;->h:Ll/m;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p3}, Lh/s;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lh/s;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onSearchRequested()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onSearchRequested(Landroid/view/SearchEvent;)Z

    move-result p1

    return p1
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 9

    .line 2
    iget-object v0, p0, Lh/s;->n:Lh/x;

    iget-object v1, v0, Lh/x;->t:Landroid/content/Context;

    if-eqz p2, :cond_0

    .line 3
    iget-object v0, p0, Lh/s;->j:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p2, La1/h;

    invoke-direct {p2, v1, p1}, La1/h;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 5
    iget-object p1, v0, Lh/x;->D:Lk/a;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lk/a;->a()V

    .line 7
    :cond_1
    new-instance p1, La1/e;

    const/16 v2, 0xd

    const/4 v3, 0x0

    invoke-direct {p1, v0, p2, v2, v3}, La1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 8
    invoke-virtual {v0}, Lh/x;->z()V

    .line 9
    iget-object v2, v0, Lh/x;->x:Lh/g0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    .line 10
    iget-object v6, v2, Lh/g0;->x:Lh/f0;

    if-eqz v6, :cond_2

    .line 11
    invoke-virtual {v6}, Lh/f0;->a()V

    .line 12
    :cond_2
    iget-object v6, v2, Lh/g0;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v6, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 13
    iget-object v6, v2, Lh/g0;->u:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 14
    new-instance v6, Lh/f0;

    iget-object v7, v2, Lh/g0;->u:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v2, v7, p1}, Lh/f0;-><init>(Lh/g0;Landroid/content/Context;La1/e;)V

    .line 15
    iget-object v7, v6, Lh/f0;->m:Ll/m;

    invoke-virtual {v7}, Ll/m;->w()V

    .line 16
    :try_start_0
    iget-object v8, v6, Lh/f0;->n:La1/e;

    .line 17
    iget-object v8, v8, La1/e;->k:Ljava/lang/Object;

    check-cast v8, La1/h;

    .line 18
    invoke-virtual {v8, v6, v7}, La1/h;->o(Lk/a;Landroid/view/Menu;)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-virtual {v7}, Ll/m;->v()V

    if-eqz v8, :cond_3

    .line 20
    iput-object v6, v2, Lh/g0;->x:Lh/f0;

    .line 21
    invoke-virtual {v6}, Lh/f0;->g()V

    .line 22
    iget-object v7, v2, Lh/g0;->u:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v7, v6}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lk/a;)V

    .line 23
    invoke-virtual {v2, v4}, Lh/g0;->h0(Z)V

    goto :goto_0

    :cond_3
    move-object v6, v5

    .line 24
    :goto_0
    iput-object v6, v0, Lh/x;->D:Lk/a;

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 25
    invoke-virtual {v7}, Ll/m;->v()V

    .line 26
    throw p1

    .line 27
    :cond_4
    :goto_1
    iget-object v2, v0, Lh/x;->D:Lk/a;

    if-nez v2, :cond_11

    .line 28
    iget-object v2, v0, Lh/x;->H:Lm0/r0;

    if-eqz v2, :cond_5

    .line 29
    invoke-virtual {v2}, Lm0/r0;->b()V

    .line 30
    :cond_5
    iget-object v2, v0, Lh/x;->D:Lk/a;

    if-eqz v2, :cond_6

    .line 31
    invoke-virtual {v2}, Lk/a;->a()V

    .line 32
    :cond_6
    iget-object v2, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    if-nez v2, :cond_b

    .line 33
    iget-boolean v2, v0, Lh/x;->Q:Z

    if-eqz v2, :cond_8

    .line 34
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 35
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x7f04000b

    .line 36
    invoke-virtual {v6, v7, v2, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 37
    iget v7, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_7

    .line 38
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    .line 39
    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 40
    iget v6, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v7, v6, v4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 41
    new-instance v6, Lk/c;

    invoke-direct {v6, v1, v3}, Lk/c;-><init>(Landroid/content/Context;I)V

    .line 42
    invoke-virtual {v6}, Lk/c;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v1, v6

    .line 43
    :cond_7
    new-instance v6, Landroidx/appcompat/widget/ActionBarContextView;

    .line 44
    invoke-direct {v6, v1, v5}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    iput-object v6, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 46
    new-instance v6, Landroid/widget/PopupWindow;

    const v7, 0x7f04001a

    invoke-direct {v6, v1, v5, v7}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v6, v0, Lh/x;->F:Landroid/widget/PopupWindow;

    const/4 v7, 0x2

    .line 47
    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 48
    iget-object v6, v0, Lh/x;->F:Landroid/widget/PopupWindow;

    iget-object v7, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 49
    iget-object v6, v0, Lh/x;->F:Landroid/widget/PopupWindow;

    const/4 v7, -0x1

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 50
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x7f040005

    invoke-virtual {v6, v7, v2, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 51
    iget v2, v2, Landroid/util/TypedValue;->data:I

    .line 52
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 53
    invoke-static {v2, v1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v1

    .line 54
    iget-object v2, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 55
    iget-object v1, v0, Lh/x;->F:Landroid/widget/PopupWindow;

    const/4 v2, -0x2

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 56
    new-instance v1, Lh/p;

    invoke-direct {v1, v0, v4}, Lh/p;-><init>(Lh/x;I)V

    iput-object v1, v0, Lh/x;->G:Lh/p;

    goto :goto_4

    .line 57
    :cond_8
    iget-object v2, v0, Lh/x;->J:Landroid/view/ViewGroup;

    const v6, 0x7f0a0043

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v2, :cond_b

    .line 58
    invoke-virtual {v0}, Lh/x;->z()V

    .line 59
    iget-object v6, v0, Lh/x;->x:Lh/g0;

    if-eqz v6, :cond_9

    .line 60
    invoke-virtual {v6}, Lh/g0;->i0()Landroid/content/Context;

    move-result-object v6

    goto :goto_2

    :cond_9
    move-object v6, v5

    :goto_2
    if-nez v6, :cond_a

    goto :goto_3

    :cond_a
    move-object v1, v6

    .line 61
    :goto_3
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 62
    invoke-virtual {v2}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 63
    :cond_b
    :goto_4
    iget-object v1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v1, :cond_10

    .line 64
    iget-object v1, v0, Lh/x;->H:Lm0/r0;

    if-eqz v1, :cond_c

    .line 65
    invoke-virtual {v1}, Lm0/r0;->b()V

    .line 66
    :cond_c
    iget-object v1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 67
    new-instance v1, Lk/d;

    iget-object v2, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v6, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 68
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object v2, v1, Lk/d;->l:Landroid/content/Context;

    .line 70
    iput-object v6, v1, Lk/d;->m:Landroidx/appcompat/widget/ActionBarContextView;

    .line 71
    iput-object p1, v1, Lk/d;->n:La1/e;

    .line 72
    new-instance v2, Ll/m;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v2, v6}, Ll/m;-><init>(Landroid/content/Context;)V

    .line 73
    iput v4, v2, Ll/m;->u:I

    .line 74
    iput-object v2, v1, Lk/d;->q:Ll/m;

    .line 75
    iput-object v1, v2, Ll/m;->n:Ll/k;

    .line 76
    iget-object p1, p1, La1/e;->k:Ljava/lang/Object;

    check-cast p1, La1/h;

    invoke-virtual {p1, v1, v2}, La1/h;->o(Lk/a;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 77
    invoke-virtual {v1}, Lk/d;->g()V

    .line 78
    iget-object p1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lk/a;)V

    .line 79
    iput-object v1, v0, Lh/x;->D:Lk/a;

    .line 80
    iget-boolean p1, v0, Lh/x;->I:Z

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p1, :cond_d

    iget-object p1, v0, Lh/x;->J:Landroid/view/ViewGroup;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result p1

    if-eqz p1, :cond_d

    .line 81
    iget-object p1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 82
    iget-object p1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, Lm0/m0;->a(Landroid/view/View;)Lm0/r0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lm0/r0;->a(F)V

    iput-object p1, v0, Lh/x;->H:Lm0/r0;

    .line 83
    new-instance v1, Lh/r;

    invoke-direct {v1, v4, v0}, Lh/r;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lm0/r0;->d(Lm0/s0;)V

    goto :goto_5

    .line 84
    :cond_d
    iget-object p1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 85
    iget-object p1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 86
    iget-object p1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_e

    .line 87
    iget-object p1, v0, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 88
    invoke-static {p1}, Lm0/c0;->c(Landroid/view/View;)V

    .line 89
    :cond_e
    :goto_5
    iget-object p1, v0, Lh/x;->F:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_10

    .line 90
    iget-object p1, v0, Lh/x;->u:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v1, v0, Lh/x;->G:Lh/p;

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_6

    .line 91
    :cond_f
    iput-object v5, v0, Lh/x;->D:Lk/a;

    .line 92
    :cond_10
    :goto_6
    invoke-virtual {v0}, Lh/x;->H()V

    .line 93
    iget-object p1, v0, Lh/x;->D:Lk/a;

    .line 94
    iput-object p1, v0, Lh/x;->D:Lk/a;

    .line 95
    :cond_11
    invoke-virtual {v0}, Lh/x;->H()V

    .line 96
    iget-object p1, v0, Lh/x;->D:Lk/a;

    if-eqz p1, :cond_12

    .line 97
    invoke-virtual {p2, p1}, La1/h;->g(Lk/a;)Lk/e;

    move-result-object v5

    :cond_12
    return-object v5
.end method
