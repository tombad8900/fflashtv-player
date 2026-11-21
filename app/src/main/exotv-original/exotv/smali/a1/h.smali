.class public final La1/h;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Li0/a;
.implements Lk2/q;


# instance fields
.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    sparse-switch p1, :sswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La1/h;->j:Ljava/lang/Object;

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La1/h;->k:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La1/h;->l:Ljava/lang/Object;

    return-void

    .line 5
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Ll0/c;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Ll0/c;-><init>(I)V

    iput-object p1, p0, La1/h;->j:Ljava/lang/Object;

    .line 7
    new-instance p1, Lp/k;

    const/4 v0, 0x0

    .line 8
    invoke-direct {p1, v0}, Lp/k;-><init>(I)V

    .line 9
    iput-object p1, p0, La1/h;->k:Ljava/lang/Object;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La1/h;->l:Ljava/lang/Object;

    .line 11
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, La1/h;->m:Ljava/lang/Object;

    return-void

    .line 12
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Lh1/w;

    invoke-direct {p1}, Lh1/w;-><init>()V

    iput-object p1, p0, La1/h;->j:Ljava/lang/Object;

    .line 14
    new-instance p1, Lh1/w;

    invoke-direct {p1}, Lh1/w;-><init>()V

    iput-object p1, p0, La1/h;->k:Ljava/lang/Object;

    .line 15
    new-instance p1, Ln2/a;

    invoke-direct {p1}, Ln2/a;-><init>()V

    iput-object p1, p0, La1/h;->l:Ljava/lang/Object;

    return-void

    .line 16
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance p1, Lp/e;

    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, v0}, Lp/k;-><init>(I)V

    .line 19
    iput-object p1, p0, La1/h;->j:Ljava/lang/Object;

    .line 20
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, La1/h;->k:Ljava/lang/Object;

    .line 21
    new-instance p1, Lp/h;

    invoke-direct {p1}, Lp/h;-><init>()V

    iput-object p1, p0, La1/h;->l:Ljava/lang/Object;

    .line 22
    new-instance p1, Lp/e;

    .line 23
    invoke-direct {p1, v0}, Lp/k;-><init>(I)V

    .line 24
    iput-object p1, p0, La1/h;->m:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x5 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La1/i;La1/z0;Landroid/view/View;Landroid/view/ViewGroup;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La1/h;->j:Ljava/lang/Object;

    iput-object p4, p0, La1/h;->k:Ljava/lang/Object;

    iput-object p1, p0, La1/h;->l:Ljava/lang/Object;

    iput-object p2, p0, La1/h;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, La1/h;->k:Ljava/lang/Object;

    .line 57
    iput-object p2, p0, La1/h;->j:Ljava/lang/Object;

    .line 58
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La1/h;->l:Ljava/lang/Object;

    .line 59
    new-instance p1, Lp/k;

    const/4 p2, 0x0

    .line 60
    invoke-direct {p1, p2}, Lp/k;-><init>(I)V

    .line 61
    iput-object p1, p0, La1/h;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lw0/b;)V
    .locals 7

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, La1/h;->m:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, La1/h;->j:Ljava/lang/Object;

    .line 28
    new-instance p1, Lv0/s;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lv0/s;-><init>(I)V

    iput-object p1, p0, La1/h;->l:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 29
    invoke-virtual {p2, p1}, Lm0/b0;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 30
    iget v2, p2, Lm0/b0;->j:I

    add-int/2addr v0, v2

    .line 31
    iget-object v2, p2, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 32
    iget-object v0, p2, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 33
    new-array v0, v0, [C

    iput-object v0, p0, La1/h;->k:Ljava/lang/Object;

    .line 34
    invoke-virtual {p2, p1}, Lm0/b0;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 35
    iget v0, p2, Lm0/b0;->j:I

    add-int/2addr p1, v0

    .line 36
    iget-object v0, p2, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 37
    iget-object p1, p2, Lm0/b0;->m:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_6

    .line 38
    new-instance v0, Lv0/v;

    invoke-direct {v0, p0, p2}, Lv0/v;-><init>(La1/h;I)V

    .line 39
    invoke-virtual {v0}, Lv0/v;->b()Lw0/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 40
    invoke-virtual {v2, v3}, Lm0/b0;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Lm0/b0;->j:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    .line 41
    :goto_3
    iget-object v3, p0, La1/h;->k:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 42
    invoke-virtual {v0}, Lv0/v;->b()Lw0/a;

    move-result-object v2

    const/16 v3, 0x10

    .line 43
    invoke-virtual {v2, v3}, Lm0/b0;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 44
    iget v5, v2, Lm0/b0;->j:I

    add-int/2addr v4, v5

    .line 45
    iget-object v5, v2, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 46
    iget-object v2, v2, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    move v2, v4

    goto :goto_5

    :cond_4
    move v2, v1

    .line 47
    :goto_5
    const-string v5, "invalid metadata codepoint length"

    invoke-static {v5, v2}, Lcom/bumptech/glide/c;->j(Ljava/lang/String;Z)V

    .line 48
    iget-object v2, p0, La1/h;->l:Ljava/lang/Object;

    check-cast v2, Lv0/s;

    .line 49
    invoke-virtual {v0}, Lv0/v;->b()Lw0/a;

    move-result-object v5

    .line 50
    invoke-virtual {v5, v3}, Lm0/b0;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 51
    iget v6, v5, Lm0/b0;->j:I

    add-int/2addr v3, v6

    .line 52
    iget-object v6, v5, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    add-int/2addr v6, v3

    .line 53
    iget-object v3, v5, Lm0/b0;->m:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    goto :goto_6

    :cond_5
    move v3, v1

    :goto_6
    sub-int/2addr v3, v4

    .line 54
    invoke-virtual {v2, v0, v1, v3}, Lv0/s;->a(Lv0/v;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public constructor <init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 64
    invoke-static {p1}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 65
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 66
    :goto_0
    iput-object p1, p0, La1/h;->j:Ljava/lang/Object;

    .line 67
    iput-object p2, p0, La1/h;->k:Ljava/lang/Object;

    .line 68
    iput-object p3, p0, La1/h;->l:Ljava/lang/Object;

    .line 69
    iput-object p4, p0, La1/h;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(La1/v;)V
    .locals 3

    .line 1
    iget-object v0, p0, La1/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La1/h;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, La1/h;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p1, La1/v;->t:Z

    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "Fragment already added: "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    .line 1
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La1/h;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lp/k;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p0, v3, p2, p3}, La1/h;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 54
    .line 55
    const-string p2, "This graph contains cyclic dependencies"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public c(Ljava/lang/String;)La1/v;
    .locals 1

    .line 1
    iget-object v0, p0, La1/h;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La1/u0;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, La1/u0;->c:La1/v;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public e(Ljava/lang/String;)La1/v;
    .locals 3

    .line 1
    iget-object v0, p0, La1/h;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La1/u0;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v1, La1/u0;->c:La1/v;

    .line 28
    .line 29
    iget-object v2, v1, La1/v;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, v1, La1/v;->C:La1/n0;

    .line 39
    .line 40
    iget-object v1, v1, La1/n0;->c:La1/h;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, La1/h;->e(Ljava/lang/String;)La1/v;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    return-object p1
.end method

.method public f([BIILk2/p;Lh1/f;)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La1/h;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ln2/a;

    .line 8
    .line 9
    iget-object v3, v0, La1/h;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lh1/w;

    .line 12
    .line 13
    add-int v4, v1, p3

    .line 14
    .line 15
    move-object/from16 v5, p1

    .line 16
    .line 17
    invoke-virtual {v3, v5, v4}, Lh1/w;->E([BI)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v1}, Lh1/w;->G(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, La1/h;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lh1/w;

    .line 26
    .line 27
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/16 v5, 0xff

    .line 32
    .line 33
    if-lez v4, :cond_1

    .line 34
    .line 35
    iget-object v4, v3, Lh1/w;->a:[B

    .line 36
    .line 37
    iget v6, v3, Lh1/w;->b:I

    .line 38
    .line 39
    aget-byte v4, v4, v6

    .line 40
    .line 41
    and-int/2addr v4, v5

    .line 42
    const/16 v6, 0x78

    .line 43
    .line 44
    if-ne v4, v6, :cond_1

    .line 45
    .line 46
    iget-object v4, v0, La1/h;->m:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Ljava/util/zip/Inflater;

    .line 49
    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    new-instance v4, Ljava/util/zip/Inflater;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/util/zip/Inflater;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v4, v0, La1/h;->m:Ljava/lang/Object;

    .line 58
    .line 59
    :cond_0
    iget-object v4, v0, La1/h;->m:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ljava/util/zip/Inflater;

    .line 62
    .line 63
    invoke-static {v3, v1, v4}, Lh1/i0;->L(Lh1/w;Lh1/w;Ljava/util/zip/Inflater;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    iget-object v4, v1, Lh1/w;->a:[B

    .line 70
    .line 71
    iget v1, v1, Lh1/w;->c:I

    .line 72
    .line 73
    invoke-virtual {v3, v4, v1}, Lh1/w;->E([BI)V

    .line 74
    .line 75
    .line 76
    :cond_1
    const/4 v1, 0x0

    .line 77
    iput v1, v2, Ln2/a;->d:I

    .line 78
    .line 79
    iget-object v4, v2, Ln2/a;->b:[I

    .line 80
    .line 81
    iget-object v6, v2, Ln2/a;->a:Lh1/w;

    .line 82
    .line 83
    iput v1, v2, Ln2/a;->e:I

    .line 84
    .line 85
    iput v1, v2, Ln2/a;->f:I

    .line 86
    .line 87
    iput v1, v2, Ln2/a;->g:I

    .line 88
    .line 89
    iput v1, v2, Ln2/a;->h:I

    .line 90
    .line 91
    iput v1, v2, Ln2/a;->i:I

    .line 92
    .line 93
    invoke-virtual {v6, v1}, Lh1/w;->D(I)V

    .line 94
    .line 95
    .line 96
    iput-boolean v1, v2, Ln2/a;->c:Z

    .line 97
    .line 98
    new-instance v8, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    const/4 v9, 0x3

    .line 108
    if-lt v7, v9, :cond_16

    .line 109
    .line 110
    iget v7, v3, Lh1/w;->c:I

    .line 111
    .line 112
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    iget v12, v3, Lh1/w;->b:I

    .line 121
    .line 122
    add-int/2addr v12, v11

    .line 123
    if-le v12, v7, :cond_2

    .line 124
    .line 125
    invoke-virtual {v3, v7}, Lh1/w;->G(I)V

    .line 126
    .line 127
    .line 128
    move v7, v1

    .line 129
    move v15, v5

    .line 130
    move-object v1, v6

    .line 131
    move-object/from16 p1, v8

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    goto/16 :goto_d

    .line 135
    .line 136
    :cond_2
    const/16 v7, 0x80

    .line 137
    .line 138
    if-eq v10, v7, :cond_c

    .line 139
    .line 140
    packed-switch v10, :pswitch_data_0

    .line 141
    .line 142
    .line 143
    :cond_3
    :goto_1
    move v15, v5

    .line 144
    move-object/from16 v16, v6

    .line 145
    .line 146
    move-object/from16 p1, v8

    .line 147
    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :pswitch_0
    const/16 v7, 0x13

    .line 151
    .line 152
    if-ge v11, v7, :cond_4

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    iput v7, v2, Ln2/a;->d:I

    .line 160
    .line 161
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    iput v7, v2, Ln2/a;->e:I

    .line 166
    .line 167
    const/16 v7, 0xb

    .line 168
    .line 169
    invoke-virtual {v3, v7}, Lh1/w;->H(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    iput v7, v2, Ln2/a;->f:I

    .line 177
    .line 178
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    iput v7, v2, Ln2/a;->g:I

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :pswitch_1
    const/4 v10, 0x4

    .line 186
    if-ge v11, v10, :cond_5

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_5
    invoke-virtual {v3, v9}, Lh1/w;->H(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    and-int/2addr v7, v9

    .line 197
    if-eqz v7, :cond_6

    .line 198
    .line 199
    const/4 v14, 0x1

    .line 200
    goto :goto_2

    .line 201
    :cond_6
    move v14, v1

    .line 202
    :goto_2
    add-int/lit8 v7, v11, -0x4

    .line 203
    .line 204
    if-eqz v14, :cond_9

    .line 205
    .line 206
    const/4 v9, 0x7

    .line 207
    if-ge v7, v9, :cond_7

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_7
    invoke-virtual {v3}, Lh1/w;->x()I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-ge v7, v10, :cond_8

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_8
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    iput v9, v2, Ln2/a;->h:I

    .line 222
    .line 223
    invoke-virtual {v3}, Lh1/w;->A()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    iput v9, v2, Ln2/a;->i:I

    .line 228
    .line 229
    add-int/lit8 v7, v7, -0x4

    .line 230
    .line 231
    invoke-virtual {v6, v7}, Lh1/w;->D(I)V

    .line 232
    .line 233
    .line 234
    add-int/lit8 v7, v11, -0xb

    .line 235
    .line 236
    :cond_9
    iget v9, v6, Lh1/w;->b:I

    .line 237
    .line 238
    iget v10, v6, Lh1/w;->c:I

    .line 239
    .line 240
    if-ge v9, v10, :cond_3

    .line 241
    .line 242
    if-lez v7, :cond_3

    .line 243
    .line 244
    sub-int/2addr v10, v9

    .line 245
    invoke-static {v7, v10}, Ljava/lang/Math;->min(II)I

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    iget-object v10, v6, Lh1/w;->a:[B

    .line 250
    .line 251
    invoke-virtual {v3, v10, v9, v7}, Lh1/w;->e([BII)V

    .line 252
    .line 253
    .line 254
    add-int/2addr v9, v7

    .line 255
    invoke-virtual {v6, v9}, Lh1/w;->G(I)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :pswitch_2
    rem-int/lit8 v9, v11, 0x5

    .line 260
    .line 261
    const/4 v10, 0x2

    .line 262
    if-eq v9, v10, :cond_a

    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_a
    invoke-virtual {v3, v10}, Lh1/w;->H(I)V

    .line 266
    .line 267
    .line 268
    invoke-static {v4, v1}, Ljava/util/Arrays;->fill([II)V

    .line 269
    .line 270
    .line 271
    div-int/lit8 v11, v11, 0x5

    .line 272
    .line 273
    move v9, v1

    .line 274
    :goto_3
    if-ge v9, v11, :cond_b

    .line 275
    .line 276
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 281
    .line 282
    .line 283
    move-result v15

    .line 284
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 285
    .line 286
    .line 287
    move-result v16

    .line 288
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 289
    .line 290
    .line 291
    move-result v17

    .line 292
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 293
    .line 294
    .line 295
    move-result v18

    .line 296
    move/from16 p2, v7

    .line 297
    .line 298
    move-object/from16 p1, v8

    .line 299
    .line 300
    int-to-double v7, v15

    .line 301
    add-int/lit8 v15, v16, -0x80

    .line 302
    .line 303
    int-to-double v13, v15

    .line 304
    const-wide v15, 0x3ff66e978d4fdf3bL    # 1.402

    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    mul-double/2addr v15, v13

    .line 310
    move-object/from16 v19, v2

    .line 311
    .line 312
    add-double v1, v15, v7

    .line 313
    .line 314
    double-to-int v1, v1

    .line 315
    add-int/lit8 v2, v17, -0x80

    .line 316
    .line 317
    move-object/from16 v16, v6

    .line 318
    .line 319
    int-to-double v5, v2

    .line 320
    const-wide v21, 0x3fd60663c74fb54aL    # 0.34414

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    mul-double v21, v21, v5

    .line 326
    .line 327
    sub-double v21, v7, v21

    .line 328
    .line 329
    const-wide v23, 0x3fe6da3c21187e7cL    # 0.71414

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    mul-double v13, v13, v23

    .line 335
    .line 336
    sub-double v13, v21, v13

    .line 337
    .line 338
    double-to-int v2, v13

    .line 339
    const-wide v13, 0x3ffc5a1cac083127L    # 1.772

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    mul-double/2addr v5, v13

    .line 345
    add-double/2addr v5, v7

    .line 346
    double-to-int v5, v5

    .line 347
    shl-int/lit8 v6, v18, 0x18

    .line 348
    .line 349
    const/4 v7, 0x0

    .line 350
    const/16 v15, 0xff

    .line 351
    .line 352
    invoke-static {v1, v7, v15}, Lh1/i0;->j(III)I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    shl-int/lit8 v1, v1, 0x10

    .line 357
    .line 358
    or-int/2addr v1, v6

    .line 359
    invoke-static {v2, v7, v15}, Lh1/i0;->j(III)I

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    shl-int/lit8 v2, v2, 0x8

    .line 364
    .line 365
    or-int/2addr v1, v2

    .line 366
    invoke-static {v5, v7, v15}, Lh1/i0;->j(III)I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    or-int/2addr v1, v2

    .line 371
    aput v1, v4, v10

    .line 372
    .line 373
    add-int/lit8 v9, v9, 0x1

    .line 374
    .line 375
    move-object/from16 v8, p1

    .line 376
    .line 377
    move/from16 v7, p2

    .line 378
    .line 379
    move v5, v15

    .line 380
    move-object/from16 v6, v16

    .line 381
    .line 382
    move-object/from16 v2, v19

    .line 383
    .line 384
    const/4 v1, 0x0

    .line 385
    goto :goto_3

    .line 386
    :cond_b
    move v15, v5

    .line 387
    move-object/from16 v16, v6

    .line 388
    .line 389
    move-object/from16 p1, v8

    .line 390
    .line 391
    const/4 v1, 0x1

    .line 392
    iput-boolean v1, v2, Ln2/a;->c:Z

    .line 393
    .line 394
    :goto_4
    move-object/from16 v1, v16

    .line 395
    .line 396
    const/4 v7, 0x0

    .line 397
    const/4 v13, 0x0

    .line 398
    goto/16 :goto_c

    .line 399
    .line 400
    :cond_c
    move v15, v5

    .line 401
    move-object/from16 v16, v6

    .line 402
    .line 403
    move-object/from16 p1, v8

    .line 404
    .line 405
    iget v1, v2, Ln2/a;->d:I

    .line 406
    .line 407
    if-eqz v1, :cond_13

    .line 408
    .line 409
    iget v1, v2, Ln2/a;->e:I

    .line 410
    .line 411
    if-eqz v1, :cond_13

    .line 412
    .line 413
    iget v1, v2, Ln2/a;->h:I

    .line 414
    .line 415
    if-eqz v1, :cond_13

    .line 416
    .line 417
    iget v1, v2, Ln2/a;->i:I

    .line 418
    .line 419
    if-eqz v1, :cond_13

    .line 420
    .line 421
    move-object/from16 v1, v16

    .line 422
    .line 423
    iget v5, v1, Lh1/w;->c:I

    .line 424
    .line 425
    if-eqz v5, :cond_14

    .line 426
    .line 427
    iget v6, v1, Lh1/w;->b:I

    .line 428
    .line 429
    if-ne v6, v5, :cond_14

    .line 430
    .line 431
    iget-boolean v5, v2, Ln2/a;->c:Z

    .line 432
    .line 433
    if-nez v5, :cond_d

    .line 434
    .line 435
    goto/16 :goto_a

    .line 436
    .line 437
    :cond_d
    const/4 v7, 0x0

    .line 438
    invoke-virtual {v1, v7}, Lh1/w;->G(I)V

    .line 439
    .line 440
    .line 441
    iget v5, v2, Ln2/a;->h:I

    .line 442
    .line 443
    iget v6, v2, Ln2/a;->i:I

    .line 444
    .line 445
    mul-int/2addr v5, v6

    .line 446
    new-array v6, v5, [I

    .line 447
    .line 448
    const/4 v7, 0x0

    .line 449
    :cond_e
    :goto_5
    if-ge v7, v5, :cond_12

    .line 450
    .line 451
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 452
    .line 453
    .line 454
    move-result v8

    .line 455
    if-eqz v8, :cond_f

    .line 456
    .line 457
    add-int/lit8 v9, v7, 0x1

    .line 458
    .line 459
    aget v8, v4, v8

    .line 460
    .line 461
    aput v8, v6, v7

    .line 462
    .line 463
    :goto_6
    move v7, v9

    .line 464
    goto :goto_5

    .line 465
    :cond_f
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 466
    .line 467
    .line 468
    move-result v8

    .line 469
    if-eqz v8, :cond_e

    .line 470
    .line 471
    and-int/lit8 v9, v8, 0x40

    .line 472
    .line 473
    if-nez v9, :cond_10

    .line 474
    .line 475
    and-int/lit8 v9, v8, 0x3f

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_10
    and-int/lit8 v9, v8, 0x3f

    .line 479
    .line 480
    shl-int/lit8 v9, v9, 0x8

    .line 481
    .line 482
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    or-int/2addr v9, v10

    .line 487
    :goto_7
    and-int/lit16 v8, v8, 0x80

    .line 488
    .line 489
    if-nez v8, :cond_11

    .line 490
    .line 491
    const/16 v20, 0x0

    .line 492
    .line 493
    aget v8, v4, v20

    .line 494
    .line 495
    goto :goto_8

    .line 496
    :cond_11
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 497
    .line 498
    .line 499
    move-result v8

    .line 500
    aget v8, v4, v8

    .line 501
    .line 502
    :goto_8
    add-int/2addr v9, v7

    .line 503
    invoke-static {v6, v7, v9, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 504
    .line 505
    .line 506
    goto :goto_6

    .line 507
    :cond_12
    iget v5, v2, Ln2/a;->h:I

    .line 508
    .line 509
    iget v7, v2, Ln2/a;->i:I

    .line 510
    .line 511
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 512
    .line 513
    invoke-static {v6, v5, v7, v8}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 514
    .line 515
    .line 516
    move-result-object v25

    .line 517
    iget v5, v2, Ln2/a;->f:I

    .line 518
    .line 519
    int-to-float v5, v5

    .line 520
    iget v6, v2, Ln2/a;->d:I

    .line 521
    .line 522
    int-to-float v6, v6

    .line 523
    div-float v29, v5, v6

    .line 524
    .line 525
    iget v5, v2, Ln2/a;->g:I

    .line 526
    .line 527
    int-to-float v5, v5

    .line 528
    iget v7, v2, Ln2/a;->e:I

    .line 529
    .line 530
    int-to-float v7, v7

    .line 531
    div-float v26, v5, v7

    .line 532
    .line 533
    iget v5, v2, Ln2/a;->h:I

    .line 534
    .line 535
    int-to-float v5, v5

    .line 536
    div-float v33, v5, v6

    .line 537
    .line 538
    iget v5, v2, Ln2/a;->i:I

    .line 539
    .line 540
    int-to-float v5, v5

    .line 541
    div-float v34, v5, v7

    .line 542
    .line 543
    new-instance v21, Lg1/b;

    .line 544
    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    const/16 v27, 0x0

    .line 548
    .line 549
    const/16 v28, 0x0

    .line 550
    .line 551
    const/16 v30, 0x0

    .line 552
    .line 553
    const/high16 v31, -0x80000000

    .line 554
    .line 555
    const v32, -0x800001

    .line 556
    .line 557
    .line 558
    const/16 v35, 0x0

    .line 559
    .line 560
    const/high16 v36, -0x1000000

    .line 561
    .line 562
    const/16 v38, 0x0

    .line 563
    .line 564
    move-object/from16 v23, v22

    .line 565
    .line 566
    move-object/from16 v24, v22

    .line 567
    .line 568
    move/from16 v37, v31

    .line 569
    .line 570
    invoke-direct/range {v21 .. v38}, Lg1/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 571
    .line 572
    .line 573
    move-object/from16 v13, v21

    .line 574
    .line 575
    :goto_9
    const/4 v7, 0x0

    .line 576
    goto :goto_b

    .line 577
    :cond_13
    move-object/from16 v1, v16

    .line 578
    .line 579
    :cond_14
    :goto_a
    const/4 v13, 0x0

    .line 580
    goto :goto_9

    .line 581
    :goto_b
    iput v7, v2, Ln2/a;->d:I

    .line 582
    .line 583
    iput v7, v2, Ln2/a;->e:I

    .line 584
    .line 585
    iput v7, v2, Ln2/a;->f:I

    .line 586
    .line 587
    iput v7, v2, Ln2/a;->g:I

    .line 588
    .line 589
    iput v7, v2, Ln2/a;->h:I

    .line 590
    .line 591
    iput v7, v2, Ln2/a;->i:I

    .line 592
    .line 593
    invoke-virtual {v1, v7}, Lh1/w;->D(I)V

    .line 594
    .line 595
    .line 596
    iput-boolean v7, v2, Ln2/a;->c:Z

    .line 597
    .line 598
    :goto_c
    invoke-virtual {v3, v12}, Lh1/w;->G(I)V

    .line 599
    .line 600
    .line 601
    :goto_d
    move-object/from16 v8, p1

    .line 602
    .line 603
    if-eqz v13, :cond_15

    .line 604
    .line 605
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    :cond_15
    move-object v6, v1

    .line 609
    move v1, v7

    .line 610
    move v5, v15

    .line 611
    goto/16 :goto_0

    .line 612
    .line 613
    :cond_16
    new-instance v7, Lk2/c;

    .line 614
    .line 615
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    invoke-direct/range {v7 .. v12}, Lk2/c;-><init>(Ljava/util/List;JJ)V

    .line 626
    .line 627
    .line 628
    move-object/from16 v1, p5

    .line 629
    .line 630
    invoke-interface {v1, v7}, Lh1/f;->accept(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    return-void

    .line 634
    nop

    .line 635
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lk/a;)Lk/e;
    .locals 5

    .line 1
    iget-object v0, p0, La1/h;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lk/e;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v4, v3, Lk/e;->b:Lk/a;

    .line 21
    .line 22
    if-ne v4, p1, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v1, Lk/e;

    .line 29
    .line 30
    iget-object v2, p0, La1/h;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v1, v2, p1}, Lk/e;-><init>(Landroid/content/Context;Lk/a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public h()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public i()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La1/h;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, La1/u0;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method

.method public j()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La1/h;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, La1/u0;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, v2, La1/u0;->c:La1/v;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, La1/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, La1/h;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, La1/h;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
.end method

.method public l(La1/u0;)V
    .locals 3

    .line 1
    iget-object v0, p1, La1/u0;->c:La1/v;

    .line 2
    .line 3
    iget-object v1, v0, La1/v;->n:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La1/h;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, v0, La1/v;->n:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-static {p1}, La1/n0;->G(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Added fragment to active set "

    .line 31
    .line 32
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "FragmentManager"

    .line 43
    .line 44
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public m(La1/u0;)V
    .locals 3

    .line 1
    iget-object p1, p1, La1/u0;->c:La1/v;

    .line 2
    .line 3
    iget-boolean v0, p1, La1/v;->J:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La1/h;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La1/q0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, La1/q0;->e(La1/v;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, La1/h;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/HashMap;

    .line 17
    .line 18
    iget-object v1, p1, La1/v;->n:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La1/u0;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v0, 0x2

    .line 31
    invoke-static {v0}, La1/n0;->G(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "Removed fragment from active set "

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "FragmentManager"

    .line 52
    .line 53
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    return-void
.end method

.method public n(Lk/a;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object v0, p0, La1/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La1/h;->g(Lk/a;)Lk/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Ll/u;

    .line 10
    .line 11
    iget-object v2, p0, La1/h;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Landroid/content/Context;

    .line 14
    .line 15
    check-cast p2, Lg0/a;

    .line 16
    .line 17
    invoke-direct {v1, v2, p2}, Ll/u;-><init>(Landroid/content/Context;Lg0/a;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public o(Lk/a;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget-object v0, p0, La1/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La1/h;->g(Lk/a;)Lk/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, La1/h;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lp/k;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/view/Menu;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Ll/c0;

    .line 22
    .line 23
    iget-object v3, p0, La1/h;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Landroid/content/Context;

    .line 26
    .line 27
    move-object v4, p2

    .line 28
    check-cast v4, Ll/m;

    .line 29
    .line 30
    invoke-direct {v2, v3, v4}, Ll/c0;-><init>(Landroid/content/Context;Ll/m;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p2, v2}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public onCancel()V
    .locals 2

    .line 1
    iget-object v0, p0, La1/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La1/h;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La1/h;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La1/i;

    .line 18
    .line 19
    invoke-virtual {v0}, La1/j;->d()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-static {v0}, La1/n0;->G(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "Animation from operation "

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La1/h;->m:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La1/z0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, " has been cancelled."

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "FragmentManager"

    .line 53
    .line 54
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method
