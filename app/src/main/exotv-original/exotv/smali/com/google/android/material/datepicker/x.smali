.class public final Lcom/google/android/material/datepicker/x;
.super Lz2/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final d:Lcom/google/android/material/datepicker/b;

.field public final e:Lcom/google/android/material/datepicker/h;

.field public final f:Lcom/google/android/material/datepicker/h;

.field public final g:I

.field public h:Lcom/google/android/material/datepicker/s;

.field public i:I


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/b;Lcom/google/android/material/datepicker/h;Lcom/google/android/material/datepicker/h;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lz2/x;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/material/datepicker/x;->i:I

    .line 6
    .line 7
    iget-object v1, p2, Lcom/google/android/material/datepicker/b;->j:Lcom/google/android/material/datepicker/s;

    .line 8
    .line 9
    iget-object v2, p2, Lcom/google/android/material/datepicker/b;->k:Lcom/google/android/material/datepicker/s;

    .line 10
    .line 11
    iget-object v3, p2, Lcom/google/android/material/datepicker/b;->m:Lcom/google/android/material/datepicker/s;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/google/android/material/datepicker/s;->j:Ljava/util/Calendar;

    .line 14
    .line 15
    iget-object v4, v3, Lcom/google/android/material/datepicker/s;->j:Ljava/util/Calendar;

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-gtz v1, :cond_3

    .line 22
    .line 23
    iget-object v1, v3, Lcom/google/android/material/datepicker/s;->j:Ljava/util/Calendar;

    .line 24
    .line 25
    iget-object v2, v2, Lcom/google/android/material/datepicker/s;->j:Ljava/util/Calendar;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-gtz v1, :cond_2

    .line 32
    .line 33
    sget v1, Lcom/google/android/material/datepicker/t;->d:I

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const v4, 0x7f0703fe

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    mul-int/2addr v2, v1

    .line 47
    const v1, 0x101020d

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v1}, Lcom/google/android/material/datepicker/q;->K(Landroid/content/Context;I)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :cond_0
    add-int/2addr v2, v0

    .line 65
    iput v2, p0, Lcom/google/android/material/datepicker/x;->g:I

    .line 66
    .line 67
    iput-object p2, p0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/b;

    .line 68
    .line 69
    iput-object p3, p0, Lcom/google/android/material/datepicker/x;->e:Lcom/google/android/material/datepicker/h;

    .line 70
    .line 71
    iput-object p4, p0, Lcom/google/android/material/datepicker/x;->f:Lcom/google/android/material/datepicker/h;

    .line 72
    .line 73
    iput-object v3, p0, Lcom/google/android/material/datepicker/x;->h:Lcom/google/android/material/datepicker/s;

    .line 74
    .line 75
    iget-object p1, p0, Lz2/x;->a:Lz2/y;

    .line 76
    .line 77
    invoke-virtual {p1}, Lz2/y;->a()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_1

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    iput-boolean p1, p0, Lz2/x;->b:Z

    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string p2, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    .line 90
    .line 91
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    const-string p2, "currentPage cannot be after lastPage"

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    const-string p2, "firstPage cannot be after currentPage"

    .line 106
    .line 107
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/b;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/material/datepicker/b;->p:I

    .line 4
    .line 5
    return v0
.end method

.method public final b(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->j:Lcom/google/android/material/datepicker/s;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/material/datepicker/s;->j:Ljava/util/Calendar;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/android/material/datepicker/b0;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x5

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, p1, v2}, Ljava/util/Calendar;->set(II)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/google/android/material/datepicker/b0;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getMaximum(I)I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0
.end method

.method public final d(Lz2/v0;I)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/material/datepicker/w;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/b;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/material/datepicker/b;->j:Lcom/google/android/material/datepicker/s;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/material/datepicker/s;->j:Ljava/util/Calendar;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/google/android/material/datepicker/b0;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-virtual {v1, v2, p2}, Ljava/util/Calendar;->add(II)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lcom/google/android/material/datepicker/s;

    .line 18
    .line 19
    invoke-direct {p2, v1}, Lcom/google/android/material/datepicker/s;-><init>(Ljava/util/Calendar;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p1, Lcom/google/android/material/datepicker/w;->u:Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/google/android/material/datepicker/s;->c()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, Lcom/google/android/material/datepicker/w;->v:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 32
    .line 33
    const v1, 0x7f0a0178

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/t;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/t;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v1, v1, Lcom/google/android/material/datepicker/t;->a:Lcom/google/android/material/datepicker/s;

    .line 53
    .line 54
    invoke-virtual {p2, v1}, Lcom/google/android/material/datepicker/s;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/t;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    throw p1

    .line 72
    :cond_0
    new-instance p1, Lcom/google/android/material/datepicker/t;

    .line 73
    .line 74
    invoke-direct {p1, p2, v0}, Lcom/google/android/material/datepicker/t;-><init>(Lcom/google/android/material/datepicker/s;Lcom/google/android/material/datepicker/b;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    throw p1
.end method

.method public final e(Landroid/view/ViewGroup;)Lz2/v0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0d0062

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const v1, 0x101020d

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1}, Lcom/google/android/material/datepicker/q;->K(Landroid/content/Context;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    new-instance p1, Lz2/g0;

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    iget v2, p0, Lcom/google/android/material/datepicker/x;->g:I

    .line 36
    .line 37
    invoke-direct {p1, v1, v2}, Lz2/g0;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lcom/google/android/material/datepicker/w;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {p1, v0, v1}, Lcom/google/android/material/datepicker/w;-><init>(Landroid/widget/LinearLayout;Z)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_0
    new-instance p1, Lcom/google/android/material/datepicker/w;

    .line 51
    .line 52
    invoke-direct {p1, v0, v2}, Lcom/google/android/material/datepicker/w;-><init>(Landroid/widget/LinearLayout;Z)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method public final g(I)Lcom/google/android/material/datepicker/s;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->j:Lcom/google/android/material/datepicker/s;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/material/datepicker/s;->j:Ljava/util/Calendar;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/android/material/datepicker/b0;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lcom/google/android/material/datepicker/s;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lcom/google/android/material/datepicker/s;-><init>(Ljava/util/Calendar;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public final h(Lcom/google/android/material/datepicker/s;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->j:Lcom/google/android/material/datepicker/s;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/s;->d(Lcom/google/android/material/datepicker/s;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
