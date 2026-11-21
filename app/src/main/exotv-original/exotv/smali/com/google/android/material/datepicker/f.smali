.class public final Lcom/google/android/material/datepicker/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/datepicker/f;->j:I

    iput-object p3, p0, Lcom/google/android/material/datepicker/f;->l:Ljava/lang/Object;

    iput p1, p0, Lcom/google/android/material/datepicker/f;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    const/4 p3, 0x2

    iput p3, p0, Lcom/google/android/material/datepicker/f;->j:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string p3, "initCallbacks cannot be null"

    invoke-static {p3, p1}, Lcom/bumptech/glide/c;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, Lcom/google/android/material/datepicker/f;->l:Ljava/lang/Object;

    .line 5
    iput p2, p0, Lcom/google/android/material/datepicker/f;->k:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/f;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, Lcom/google/android/material/datepicker/f;->k:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    :goto_0
    if-ge v4, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lv0/h;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    :goto_1
    if-ge v4, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lv0/h;

    .line 41
    .line 42
    invoke-virtual {v2}, Lv0/h;->a()V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->l:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, La1/o;

    .line 52
    .line 53
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ld0/b;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget v1, p0, Lcom/google/android/material/datepicker/f;->k:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ld0/b;->g(I)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void

    .line 65
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->l:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lcom/google/android/material/datepicker/m;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->G:Z

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->w:Lz2/f0;

    .line 77
    .line 78
    if-nez v1, :cond_4

    .line 79
    .line 80
    const-string v0, "RecyclerView"

    .line 81
    .line 82
    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 83
    .line 84
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    iget v2, p0, Lcom/google/android/material/datepicker/f;->k:I

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, Lz2/f0;->z0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 91
    .line 92
    .line 93
    :goto_2
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
