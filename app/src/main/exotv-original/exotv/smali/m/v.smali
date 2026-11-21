.class public Lm/v;
.super Landroid/widget/EditText;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final j:Li1/s;

.field public final k:Lm/s0;

.field public final l:Lm/b0;

.field public final m:Lq0/i;

.field public final n:Lm/b0;

.field public o:Lm/u;

.field public p:Lm/r0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    const v0, 0x7f0401cb

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Lm/c2;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Li1/s;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Li1/s;-><init>(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lm/v;->j:Li1/s;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0}, Li1/s;->m(Landroid/util/AttributeSet;I)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lm/s0;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lm/s0;-><init>(Landroid/widget/TextView;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lm/v;->k:Lm/s0;

    .line 30
    .line 31
    invoke-virtual {p1, p2, v0}, Lm/s0;->h(Landroid/util/AttributeSet;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lm/s0;->b()V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lm/b0;

    .line 38
    .line 39
    invoke-direct {p1}, Lm/b0;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p0, p1, Lm/b0;->b:Landroid/view/View;

    .line 43
    .line 44
    iput-object p1, p0, Lm/v;->l:Lm/b0;

    .line 45
    .line 46
    new-instance p1, Lq0/i;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lm/v;->m:Lq0/i;

    .line 52
    .line 53
    new-instance p1, Lm/b0;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Lm/b0;-><init>(Landroid/widget/EditText;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lm/v;->n:Lm/b0;

    .line 59
    .line 60
    invoke-virtual {p1, p2, v0}, Lm/b0;->b(Landroid/util/AttributeSet;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    instance-of v0, p2, Landroid/text/method/NumberKeyListener;

    .line 68
    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    invoke-super {p0}, Landroid/view/View;->isFocusable()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-super {p0}, Landroid/view/View;->isClickable()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-super {p0}, Landroid/view/View;->isLongClickable()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-super {p0}, Landroid/widget/TextView;->getInputType()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {p1, p2}, Lm/b0;->a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, p2, :cond_0

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 95
    .line 96
    .line 97
    invoke-super {p0, v3}, Landroid/widget/TextView;->setRawInputType(I)V

    .line 98
    .line 99
    .line 100
    invoke-super {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 101
    .line 102
    .line 103
    invoke-super {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 104
    .line 105
    .line 106
    invoke-super {p0, v2}, Landroid/view/View;->setLongClickable(Z)V

    .line 107
    .line 108
    .line 109
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic a(Lm/v;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getSuperCaller()Lm/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->o:Lm/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm/u;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lm/u;-><init>(Lm/v;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lm/v;->o:Lm/u;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lm/v;->o:Lm/u;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final b(Lm0/h;)Lm0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->m:Lq0/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lq0/i;->a(Lm/v;Lm0/h;)Lm0/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm/v;->j:Li1/s;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Li1/s;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lm/v;->k:Lm/s0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lm/s0;->b()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/support/v4/media/session/b;->Q(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getFontVariationSettings()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/v;->getFontVariationSettingsManager()Lm/r0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lm/r0;->e:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0
.end method

.method public getFontVariationSettingsManager()Lm/r0;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/v;->p:Lm/r0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm/r0;

    .line 6
    .line 7
    new-instance v1, Lm/p;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, v2}, Lm/p;-><init>(Landroid/widget/TextView;I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lm/r0;-><init>(Landroid/widget/TextView;Ll0/a;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm/v;->p:Lm/r0;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lm/v;->p:Lm/r0;

    .line 19
    .line 20
    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->j:Li1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Li1/s;->j()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->j:Li1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Li1/s;->k()Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->k:Lm/s0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm/s0;->f()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->k:Lm/s0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm/s0;->g()Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getText()Landroid/text/Editable;
    .locals 2

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 3
    invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-super {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/v;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lm/v;->l:Lm/b0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lm/b0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/view/textclassifier/TextClassifier;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lm/b0;->b:Landroid/view/View;

    .line 19
    .line 20
    check-cast v0, Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-static {v0}, Lb6/v;->g(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_1
    return-object v1

    .line 28
    :cond_2
    :goto_0
    invoke-direct {p0}, Lm/v;->getSuperCaller()Lm/u;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Lm/u;->a:Lm/v;

    .line 33
    .line 34
    invoke-super {v0}, Landroid/widget/EditText;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
.end method

.method public getTypeface()Landroid/graphics/Typeface;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lm/v;->getFontVariationSettingsManager()Lm/r0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lm/r0;->c:Landroid/graphics/Typeface;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-super {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lm/v;->k:Lm/s0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, p0}, Lm/s0;->j(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0, p0}, Lcom/bumptech/glide/d;->U(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v2, 0x1e

    .line 21
    .line 22
    if-gt v1, v2, :cond_2

    .line 23
    .line 24
    invoke-static {p0}, Lm0/m0;->g(Lm/v;)[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-static {p1, v2}, Lo0/b;->b(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Landroidx/media3/exoplayer/source/preload/a;

    .line 34
    .line 35
    const/16 v3, 0xa

    .line 36
    .line 37
    invoke-direct {v2, v3, p0}, Landroidx/media3/exoplayer/source/preload/a;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/16 v3, 0x19

    .line 41
    .line 42
    if-lt v1, v3, :cond_0

    .line 43
    .line 44
    new-instance v1, Lo0/c;

    .line 45
    .line 46
    invoke-direct {v1, v0, v2}, Lo0/c;-><init>(Landroid/view/inputmethod/InputConnection;Landroidx/media3/exoplayer/source/preload/a;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    move-object v0, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-static {p1}, Lo0/b;->a(Landroid/view/inputmethod/EditorInfo;)[Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    array-length v1, v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance v1, Lo0/d;

    .line 60
    .line 61
    invoke-direct {v1, v0, v2}, Lo0/d;-><init>(Landroid/view/inputmethod/InputConnection;Landroidx/media3/exoplayer/source/preload/a;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :goto_1
    iget-object v1, p0, Lm/v;->n:Lm/b0;

    .line 66
    .line 67
    invoke-virtual {v1, v0, p1}, Lm/b0;->c(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Lx0/b;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "input_method"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final onDragEvent(Landroid/view/DragEvent;)Z
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/DragEvent;->getLocalState()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_6

    .line 12
    .line 13
    invoke-static {p0}, Lm0/m0;->g(Lm/v;)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    instance-of v2, v0, Landroid/app/Activity;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast v0, Landroid/app/Activity;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 v0, 0x0

    .line 44
    :goto_1
    if-nez v0, :cond_3

    .line 45
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v1, "Can\'t handle drop: no activity: view="

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "ReceiveContent"

    .line 61
    .line 62
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const/4 v3, 0x1

    .line 71
    if-ne v2, v3, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    const/4 v4, 0x3

    .line 79
    if-ne v2, v4, :cond_6

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Landroid/app/Activity;->requestDragAndDropPermissions(Landroid/view/DragEvent;)Landroid/view/DragAndDropPermissions;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/DragEvent;->getX()F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p1}, Landroid/view/DragEvent;->getY()F

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {p0, v0, v2}, Landroid/widget/TextView;->getOffsetForPosition(FF)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p0}, Landroid/widget/TextView;->beginBatchEdit()V

    .line 97
    .line 98
    .line 99
    :try_start_0
    invoke-virtual {p0}, Lm/v;->getText()Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Landroid/text/Spannable;

    .line 104
    .line 105
    invoke-static {v2, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/DragEvent;->getClipData()Landroid/content/ClipData;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 113
    .line 114
    if-lt v0, v1, :cond_5

    .line 115
    .line 116
    new-instance v0, Lm0/d;

    .line 117
    .line 118
    invoke-direct {v0, p1, v4}, Lm0/d;-><init>(Landroid/content/ClipData;I)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    new-instance v0, Lm0/f;

    .line 123
    .line 124
    invoke-direct {v0}, Lm0/f;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object p1, v0, Lm0/f;->b:Landroid/content/ClipData;

    .line 128
    .line 129
    iput v4, v0, Lm0/f;->c:I

    .line 130
    .line 131
    :goto_2
    invoke-interface {v0}, Lm0/e;->build()Lm0/h;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p0, p1}, Lm0/m0;->i(Lm/v;Lm0/h;)Lm0/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/widget/TextView;->endBatchEdit()V

    .line 139
    .line 140
    .line 141
    return v3

    .line 142
    :catchall_0
    move-exception p1

    .line 143
    invoke-virtual {p0}, Landroid/widget/TextView;->endBatchEdit()V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_6
    :goto_3
    invoke-super {p0, p1}, Landroid/view/View;->onDragEvent(Landroid/view/DragEvent;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    return p1
.end method

.method public final onTextContextMenuItem(I)Z
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_5

    .line 6
    .line 7
    invoke-static {p0}, Lm0/m0;->g(Lm/v;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_5

    .line 12
    .line 13
    const v2, 0x1020022

    .line 14
    .line 15
    .line 16
    if-eq p1, v2, :cond_0

    .line 17
    .line 18
    const v3, 0x1020031

    .line 19
    .line 20
    .line 21
    if-eq p1, v3, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "clipboard"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Landroid/content/ClipboardManager;

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v3}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_0
    const/4 v4, 0x1

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/content/ClipData;->getItemCount()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-lez v5, :cond_4

    .line 52
    .line 53
    if-lt v0, v1, :cond_2

    .line 54
    .line 55
    new-instance v0, Lm0/d;

    .line 56
    .line 57
    invoke-direct {v0, v3, v4}, Lm0/d;-><init>(Landroid/content/ClipData;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance v0, Lm0/f;

    .line 62
    .line 63
    invoke-direct {v0}, Lm0/f;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v3, v0, Lm0/f;->b:Landroid/content/ClipData;

    .line 67
    .line 68
    iput v4, v0, Lm0/f;->c:I

    .line 69
    .line 70
    :goto_1
    if-ne p1, v2, :cond_3

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move p1, v4

    .line 75
    :goto_2
    invoke-interface {v0, p1}, Lm0/e;->c(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Lm0/e;->build()Lm0/h;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p0, p1}, Lm0/m0;->i(Lm/v;Lm0/h;)Lm0/h;

    .line 83
    .line 84
    .line 85
    :cond_4
    return v4

    .line 86
    :cond_5
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    return p1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm/v;->j:Li1/s;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Li1/s;->o()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm/v;->j:Li1/s;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Li1/s;->p(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm/v;->k:Lm/s0;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lm/s0;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm/v;->k:Lm/s0;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lm/s0;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Landroid/support/v4/media/session/b;->R(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->n:Lm/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm/b0;->d(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setFontVariationSettings(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/v;->getFontVariationSettingsManager()Lm/r0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lm/r0;->a(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->n:Lm/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm/b0;->a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->j:Li1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li1/s;->u(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->j:Li1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li1/s;->v(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->k:Lm/s0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm/s0;->n(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lm/s0;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/v;->k:Lm/s0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm/s0;->o(Landroid/graphics/PorterDuff$Mode;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lm/s0;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm/v;->k:Lm/s0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lm/s0;->i(Landroid/content/Context;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lm/v;->l:Lm/b0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p1, v0, Lm/b0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0}, Lm/v;->getSuperCaller()Lm/u;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lm/u;->a:Lm/v;

    .line 20
    .line 21
    invoke-super {v0, p1}, Landroid/widget/EditText;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lm/v;->getFontVariationSettingsManager()Lm/r0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object p1, v0, Lm/r0;->c:Landroid/graphics/Typeface;

    .line 12
    .line 13
    iput-object p1, v0, Lm/r0;->d:Landroid/graphics/Typeface;

    .line 14
    .line 15
    iget-object v0, v0, Lm/r0;->b:Ll0/a;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ll0/a;->accept(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
