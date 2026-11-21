.class public final La4/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lr3/j;
.implements Ln1/p;
.implements Lm4/a;
.implements Lo0/f;
.implements Lq3/f;
.implements Lk2/h;
.implements Lt2/c0;
.implements Ll0/b;


# static fields
.field public static n:La4/c;


# instance fields
.field public final synthetic j:I

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, La4/c;->j:I

    .line 13
    new-instance v0, La4/a;

    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, La4/a;-><init>(I)V

    .line 15
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 18
    new-instance v1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v1, p0, La4/c;->l:Ljava/lang/Object;

    .line 19
    new-instance v1, La1/f;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0}, La1/f;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La4/c;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La1/h;Lk2/b;Lv0/c;Ljava/util/Set;)V
    .locals 7

    const/16 v0, 0x1b

    iput v0, p0, La4/c;->j:I

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p2, p0, La4/c;->k:Ljava/lang/Object;

    .line 99
    iput-object p1, p0, La4/c;->l:Ljava/lang/Object;

    .line 100
    iput-object p3, p0, La4/c;->m:Ljava/lang/Object;

    .line 101
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 102
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 103
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 104
    new-instance v6, Lm7/s;

    const/4 p2, 0x2

    invoke-direct {v6, v1, p2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 105
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, La4/c;->H(Ljava/lang/CharSequence;IIIZLv0/o;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(La4/q;Lq4/f;La4/u;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La4/c;->j:I

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 134
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    .line 135
    iput-object p3, p0, La4/c;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    iput p2, p0, La4/c;->j:I

    packed-switch p2, :pswitch_data_0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const-class p2, Lcom/google/android/material/datepicker/m;

    .line 64
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f04036c

    .line 65
    invoke-static {p1, v0, p2}, Lt5/a;->s(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    move-result-object p2

    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 66
    sget-object v0, Ld5/a;->o:[I

    .line 67
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 68
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 69
    invoke-static {p1, v0}, La1/o;->m(Landroid/content/Context;I)La1/o;

    move-result-object v0

    iput-object v0, p0, La4/c;->k:Ljava/lang/Object;

    const/4 v0, 0x2

    .line 70
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 71
    invoke-static {p1, v0}, La1/o;->m(Landroid/content/Context;I)La1/o;

    const/4 v0, 0x3

    .line 72
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 73
    invoke-static {p1, v0}, La1/o;->m(Landroid/content/Context;I)La1/o;

    const/4 v0, 0x5

    .line 74
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 75
    invoke-static {p1, v0}, La1/o;->m(Landroid/content/Context;I)La1/o;

    const/4 v0, 0x7

    .line 76
    invoke-static {p1, p2, v0}, Lt2/w;->f(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    const/16 v2, 0x9

    .line 77
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 78
    invoke-static {p1, v2}, La1/o;->m(Landroid/content/Context;I)La1/o;

    move-result-object v2

    iput-object v2, p0, La4/c;->l:Ljava/lang/Object;

    const/16 v2, 0x8

    .line 79
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 80
    invoke-static {p1, v2}, La1/o;->m(Landroid/content/Context;I)La1/o;

    const/16 v2, 0xa

    .line 81
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 82
    invoke-static {p1, v1}, La1/o;->m(Landroid/content/Context;I)La1/o;

    move-result-object p1

    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 83
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 84
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    .line 86
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 88
    sget-object p1, Lv3/d;->a:Lr3/c;

    .line 89
    iput-object p1, p0, La4/c;->l:Ljava/lang/Object;

    .line 90
    new-instance p1, Lv3/j;

    invoke-direct {p1}, Lv3/j;-><init>()V

    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, La4/c;->j:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 43
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, La4/c;->j:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Lh/d0;

    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 52
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 53
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/ConnectivityManager;Lv3/l;)V
    .locals 2

    const/16 v0, 0x13

    iput v0, p0, La4/c;->j:I

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 56
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    .line 57
    new-instance p2, Ln4/o;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p0}, Ln4/o;-><init>(ILjava/lang/Object;)V

    iput-object p2, p0, La4/c;->m:Ljava/lang/Object;

    .line 58
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 v1, 0xc

    .line 59
    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    .line 61
    invoke-virtual {p1, v0, p2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lb4/f;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, La4/c;->j:I

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    iput-object p3, p0, La4/c;->k:Ljava/lang/Object;

    .line 130
    invoke-static {v0, p2}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    .line 132
    new-instance p2, Lcom/bumptech/glide/load/data/i;

    invoke-direct {p2, p1}, Lcom/bumptech/glide/load/data/i;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, La4/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;Landroidx/lifecycle/o;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, La4/c;->j:I

    const-string v0, "store"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "extras"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 22
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    .line 23
    iput-object p3, p0, La4/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh3/h;Lv3/l;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, La4/c;->j:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    .line 6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_3

    sget-boolean v0, Lv3/a;->a:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    if-eq p1, p2, :cond_2

    const/16 p2, 0x1b

    if-ne p1, p2, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    new-instance p1, Ln1/k0;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ln1/k0;-><init>(Z)V

    goto :goto_2

    .line 8
    :cond_2
    :goto_0
    new-instance p1, Lv3/k;

    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 10
    :cond_3
    sget-boolean p1, Lv3/a;->a:Z

    .line 11
    :goto_1
    new-instance p1, Ln1/k0;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ln1/k0;-><init>(Z)V

    .line 12
    :goto_2
    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, La4/c;->j:I

    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    iput-object p3, p0, La4/c;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, La4/c;->j:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 47
    iput-object p1, p0, La4/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    iput p2, p0, La4/c;->j:I

    packed-switch p2, :pswitch_data_0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    new-instance p2, La1/e;

    const/16 v0, 0xc

    const/4 v1, 0x0

    .line 108
    invoke-direct {p2, v0, v1}, La1/e;-><init>(IZ)V

    .line 109
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    .line 110
    iput-object p2, p0, La4/c;->m:Ljava/lang/Object;

    .line 111
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    return-void

    .line 112
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    new-instance p2, Landroidx/media3/common/v;

    invoke-direct {p2}, Landroidx/media3/common/v;-><init>()V

    .line 114
    invoke-static {p1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 115
    new-instance p1, Landroidx/media3/common/w;

    invoke-direct {p1, p2}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 116
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 6

    const/16 v0, 0x17

    iput v0, p0, La4/c;->j:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 26
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, La4/c;->l:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 28
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls2/c;

    mul-int/lit8 v2, v0, 0x2

    .line 29
    iget-object v3, p0, La4/c;->l:Ljava/lang/Object;

    check-cast v3, [J

    iget-wide v4, v1, Ls2/c;->b:J

    aput-wide v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    .line 30
    iget-wide v4, v1, Ls2/c;->c:J

    aput-wide v4, v3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 31
    :cond_0
    iget-object p1, p0, La4/c;->l:Ljava/lang/Object;

    check-cast p1, [J

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 32
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    const/16 v0, 0x19

    iput v0, p0, La4/c;->j:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 35
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ln1/i0;

    iput-object p1, p0, La4/c;->l:Ljava/lang/Object;

    .line 36
    new-instance p1, Li1/s;

    new-instance v0, Landroidx/media3/exoplayer/source/preload/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0}, Landroidx/media3/exoplayer/source/preload/a;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, v0}, Li1/s;-><init>(Li1/r;)V

    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll0/d;Lv4/a;Lk2/b;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, La4/c;->j:I

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 119
    iput-object p2, p0, La4/c;->k:Ljava/lang/Object;

    .line 120
    iput-object p3, p0, La4/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln1/p;Lk2/o;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, La4/c;->j:I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 39
    iput-object p2, p0, La4/c;->l:Ljava/lang/Object;

    .line 40
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu/e;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, La4/c;->j:I

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 93
    new-instance v0, Lv/b;

    .line 94
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 96
    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu4/j;Ljava/util/ArrayList;Lb4/f;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, La4/c;->j:I

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 123
    iput-object p3, p0, La4/c;->l:Ljava/lang/Object;

    .line 124
    invoke-static {v0, p2}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    iput-object p2, p0, La4/c;->m:Ljava/lang/Object;

    .line 126
    new-instance p2, Lcom/bumptech/glide/load/data/i;

    invoke-direct {p2, p1, p3}, Lcom/bumptech/glide/load/data/i;-><init>(Ljava/io/InputStream;Lb4/f;)V

    iput-object p2, p0, La4/c;->k:Ljava/lang/Object;

    return-void
.end method

.method public static D(Lr3/k;Landroid/graphics/Bitmap$Config;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lb6/v;->h(Landroid/graphics/Bitmap$Config;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-boolean p1, p0, Lr3/k;->l:Z

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object p0, p0, Lr3/k;->c:Lt3/a;

    .line 14
    .line 15
    instance-of p1, p0, Lt3/a;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, Lt3/a;->k:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public static F(IILandroid/content/Context;Landroid/util/AttributeSet;[I)La4/c;
    .locals 1

    .line 1
    new-instance v0, La4/c;

    .line 2
    .line 3
    invoke-virtual {p2, p3, p4, p0, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p2, p0}, La4/c;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private final K()V
    .locals 0

    .line 1
    return-void
.end method

.method private final L()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final p(La4/c;Landroid/net/Network;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_3

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    invoke-static {v4, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, 0x1

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    move v4, p2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v5, p0, La4/c;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Landroid/net/ConnectivityManager;

    .line 28
    .line 29
    invoke-virtual {v5, v4}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    const/16 v5, 0xc

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    move v4, v6

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v4, v2

    .line 46
    :goto_1
    if-eqz v4, :cond_2

    .line 47
    .line 48
    move v2, v6

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    :goto_2
    iget-object p0, p0, La4/c;->l:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lv3/l;

    .line 56
    .line 57
    monitor-enter p0

    .line 58
    :try_start_0
    iget-object p1, p0, Lv3/l;->j:Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lh3/h;

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    iput-boolean v2, p0, Lv3/l;->n:Z

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    invoke-virtual {p0}, Lv3/l;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    :goto_3
    monitor-exit p0

    .line 77
    return-void

    .line 78
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw p1
.end method

.method public static u(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Lv0/w;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Lv0/w;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method

.method public static v(Lr3/k;Ljava/lang/Throwable;)Lr3/f;
    .locals 3

    .line 1
    new-instance v0, Lr3/f;

    .line 2
    .line 3
    instance-of v1, p1, Lr3/n;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lr3/k;->A:Lr3/c;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v2, Lv3/d;->a:Lr3/c;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, p0, Lr3/k;->A:Lr3/c;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v1, Lv3/d;->a:Lr3/c;

    .line 27
    .line 28
    :goto_0
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1, p0, p1}, Lr3/f;-><init>(Landroid/graphics/drawable/Drawable;Lr3/k;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public A()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 10

    .line 1
    iget v0, p0, La4/c;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p0, La4/c;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/bumptech/glide/load/data/i;

    .line 13
    .line 14
    iget-object v2, p0, La4/c;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lb4/f;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    :goto_0
    if-ge v4, v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ly3/d;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    :try_start_0
    new-instance v7, Lh4/w;

    .line 33
    .line 34
    new-instance v8, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-virtual {v9}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v7, v8, v2}, Lh4/w;-><init>(Ljava/io/InputStream;Lb4/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-interface {v5, v7}, Ly3/d;->c(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 51
    .line 52
    .line 53
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    invoke-virtual {v7}, Lh4/w;->c()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 58
    .line 59
    .line 60
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 61
    .line 62
    if-eq v5, v6, :cond_0

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object v6, v7

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    :goto_1
    if-eqz v6, :cond_1

    .line 73
    .line 74
    invoke-virtual {v6}, Lh4/w;->c()V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 82
    .line 83
    :goto_2
    return-object v5

    .line 84
    :pswitch_0
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    iget-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lcom/bumptech/glide/load/data/i;

    .line 91
    .line 92
    iget-object v1, v1, Lcom/bumptech/glide/load/data/i;->k:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lh4/w;

    .line 95
    .line 96
    invoke-virtual {v1}, Lh4/w;->reset()V

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, La4/c;->l:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Lb4/f;

    .line 102
    .line 103
    invoke-static {v0, v1, v2}, Lt5/a;->j(Ljava/util/List;Ljava/io/InputStream;Lb4/f;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    :pswitch_1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/util/List;

    .line 111
    .line 112
    iget-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    invoke-static {v1}, Lu4/a;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v0, v1}, Lt5/a;->k(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public B(Lz6/d;Ljava/lang/String;)Landroidx/lifecycle/r0;
    .locals 6

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/s0;

    .line 4
    .line 5
    const-string v1, "key"

    .line 6
    .line 7
    invoke-static {v1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/lifecycle/t0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Landroidx/lifecycle/t0;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/lifecycle/r0;

    .line 24
    .line 25
    iget-object v3, p1, Lz6/d;->a:Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v4, Lz6/d;->b:Ljava/util/Map;

    .line 28
    .line 29
    const-string v5, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"

    .line 30
    .line 31
    invoke-static {v5, v4}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/Integer;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-static {v3, v2}, Lz6/q;->c(ILjava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    invoke-static {v3}, Lz6/o;->a(Ljava/lang/Class;)Lz6/d;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Lt2/w;->i(Lf7/b;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_1
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :goto_0
    if-eqz v3, :cond_3

    .line 70
    .line 71
    instance-of p1, v0, Landroidx/lifecycle/q0;

    .line 72
    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    check-cast v0, Landroidx/lifecycle/q0;

    .line 76
    .line 77
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    .line 81
    .line 82
    invoke-static {p1, v2}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :cond_3
    new-instance v2, Ld1/b;

    .line 87
    .line 88
    iget-object v3, p0, La4/c;->m:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Landroidx/lifecycle/o;

    .line 91
    .line 92
    invoke-direct {v2, v3}, Ld1/b;-><init>(Landroidx/lifecycle/o;)V

    .line 93
    .line 94
    .line 95
    iget-object v3, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    sget-object v4, Le1/b;->a:Le1/b;

    .line 100
    .line 101
    invoke-interface {v3, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lt2/w;->h(Lz6/d;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {v0, v3, v2}, Landroidx/lifecycle/s0;->b(Ljava/lang/Class;Ld1/b;)Landroidx/lifecycle/r0;

    .line 112
    .line 113
    .line 114
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_1

    .line 116
    :catch_0
    :try_start_1
    invoke-static {p1}, Lt2/w;->h(Lz6/d;)Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v0, v3, v2}, Landroidx/lifecycle/s0;->b(Ljava/lang/Class;Ld1/b;)Landroidx/lifecycle/r0;

    .line 121
    .line 122
    .line 123
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    .line 124
    goto :goto_1

    .line 125
    :catch_1
    invoke-static {p1}, Lt2/w;->h(Lz6/d;)Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-interface {v0, p1}, Landroidx/lifecycle/s0;->a(Ljava/lang/Class;)Landroidx/lifecycle/r0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_1
    const-string v0, "viewModel"

    .line 134
    .line 135
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    check-cast p2, Landroidx/lifecycle/r0;

    .line 143
    .line 144
    if-eqz p2, :cond_4

    .line 145
    .line 146
    invoke-virtual {p2}, Landroidx/lifecycle/r0;->a()V

    .line 147
    .line 148
    .line 149
    :cond_4
    return-object p1
.end method

.method public C(Ljava/lang/CharSequence;IILv0/v;)Z
    .locals 7

    .line 1
    iget v0, p4, Lv0/v;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lv0/g;

    .line 13
    .line 14
    invoke-virtual {p4}, Lv0/v;->b()Lw0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x8

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Lm0/b0;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    iget-object v6, v4, Lm0/b0;->m:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v4, v4, Lm0/b0;->j:I

    .line 31
    .line 32
    add-int/2addr v5, v4

    .line 33
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    check-cast v0, Lv0/c;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v4, Lv0/c;->b:Ljava/lang/ThreadLocal;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    new-instance v5, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 64
    .line 65
    .line 66
    :goto_0
    if-ge p2, p3, :cond_2

    .line 67
    .line 68
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    add-int/lit8 p2, p2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object p1, v0, Lv0/c;->a:Landroid/text/TextPaint;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget p3, Le0/c;->a:I

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iget p2, p4, Lv0/v;->c:I

    .line 91
    .line 92
    and-int/lit8 p2, p2, 0x4

    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    or-int/lit8 p1, p2, 0x2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    or-int/lit8 p1, p2, 0x1

    .line 100
    .line 101
    :goto_1
    iput p1, p4, Lv0/v;->c:I

    .line 102
    .line 103
    :cond_4
    iget p1, p4, Lv0/v;->c:I

    .line 104
    .line 105
    and-int/lit8 p1, p1, 0x3

    .line 106
    .line 107
    if-ne p1, v1, :cond_5

    .line 108
    .line 109
    return v3

    .line 110
    :cond_5
    return v2
.end method

.method public E(ILu/d;Lx/f;)Z
    .locals 6

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv/b;

    .line 4
    .line 5
    iget-object v1, p2, Lu/d;->p0:[I

    .line 6
    .line 7
    iget-object v2, p2, Lu/d;->t:[I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aget v4, v1, v3

    .line 11
    .line 12
    iput v4, v0, Lv/b;->a:I

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    aget v1, v1, v4

    .line 16
    .line 17
    iput v1, v0, Lv/b;->b:I

    .line 18
    .line 19
    invoke-virtual {p2}, Lu/d;->q()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, v0, Lv/b;->c:I

    .line 24
    .line 25
    invoke-virtual {p2}, Lu/d;->k()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, v0, Lv/b;->d:I

    .line 30
    .line 31
    iput-boolean v3, v0, Lv/b;->i:Z

    .line 32
    .line 33
    iput p1, v0, Lv/b;->j:I

    .line 34
    .line 35
    iget p1, v0, Lv/b;->a:I

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    if-ne p1, v1, :cond_0

    .line 39
    .line 40
    move p1, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move p1, v3

    .line 43
    :goto_0
    iget v5, v0, Lv/b;->b:I

    .line 44
    .line 45
    if-ne v5, v1, :cond_1

    .line 46
    .line 47
    move v1, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v1, v3

    .line 50
    :goto_1
    const/4 v5, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget p1, p2, Lu/d;->W:F

    .line 54
    .line 55
    cmpl-float p1, p1, v5

    .line 56
    .line 57
    if-lez p1, :cond_2

    .line 58
    .line 59
    move p1, v4

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move p1, v3

    .line 62
    :goto_2
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iget v1, p2, Lu/d;->W:F

    .line 65
    .line 66
    cmpl-float v1, v1, v5

    .line 67
    .line 68
    if-lez v1, :cond_3

    .line 69
    .line 70
    move v1, v4

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move v1, v3

    .line 73
    :goto_3
    const/4 v5, 0x4

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    aget p1, v2, v3

    .line 77
    .line 78
    if-ne p1, v5, :cond_4

    .line 79
    .line 80
    iput v4, v0, Lv/b;->a:I

    .line 81
    .line 82
    :cond_4
    if-eqz v1, :cond_5

    .line 83
    .line 84
    aget p1, v2, v4

    .line 85
    .line 86
    if-ne p1, v5, :cond_5

    .line 87
    .line 88
    iput v4, v0, Lv/b;->b:I

    .line 89
    .line 90
    :cond_5
    invoke-virtual {p3, p2, v0}, Lx/f;->b(Lu/d;Lv/b;)V

    .line 91
    .line 92
    .line 93
    iget p1, v0, Lv/b;->e:I

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Lu/d;->O(I)V

    .line 96
    .line 97
    .line 98
    iget p1, v0, Lv/b;->f:I

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Lu/d;->L(I)V

    .line 101
    .line 102
    .line 103
    iget-boolean p1, v0, Lv/b;->h:Z

    .line 104
    .line 105
    iput-boolean p1, p2, Lu/d;->E:Z

    .line 106
    .line 107
    iget p1, v0, Lv/b;->g:I

    .line 108
    .line 109
    invoke-virtual {p2, p1}, Lu/d;->I(I)V

    .line 110
    .line 111
    .line 112
    iput v3, v0, Lv/b;->j:I

    .line 113
    .line 114
    iget-boolean p1, v0, Lv/b;->i:Z

    .line 115
    .line 116
    return p1
.end method

.method public G(Lr3/k;Ls3/h;)Lr3/o;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    iget-object v1, v0, Lr3/k;->g:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, v0, Lr3/k;->e:Landroid/graphics/Bitmap$Config;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    sget-object v1, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lm6/g;->i0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object/from16 v1, p0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    invoke-static {v2}, Lb6/v;->h(Landroid/graphics/Bitmap$Config;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    move-object/from16 v1, p0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-static {v0, v2}, La4/c;->D(Lr3/k;Landroid/graphics/Bitmap$Config;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    move-object/from16 v1, p0

    .line 43
    .line 44
    iget-object v3, v1, La4/c;->m:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Lv3/i;

    .line 47
    .line 48
    invoke-interface {v3, v4}, Lv3/i;->a(Ls3/h;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    :goto_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 56
    .line 57
    :goto_2
    iget-object v3, v4, Ls3/h;->a:Lcom/bumptech/glide/d;

    .line 58
    .line 59
    sget-object v5, Ls3/b;->n:Ls3/b;

    .line 60
    .line 61
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_5

    .line 66
    .line 67
    iget-object v3, v4, Ls3/h;->b:Lcom/bumptech/glide/d;

    .line 68
    .line 69
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    iget-object v3, v0, Lr3/k;->x:Ls3/g;

    .line 77
    .line 78
    :goto_3
    move-object v5, v3

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    :goto_4
    sget-object v3, Ls3/g;->k:Ls3/g;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :goto_5
    iget-boolean v3, v0, Lr3/k;->m:Z

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iget-object v3, v0, Lr3/k;->g:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    sget-object v3, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 96
    .line 97
    if-eq v2, v3, :cond_6

    .line 98
    .line 99
    const/4 v3, 0x1

    .line 100
    :goto_6
    move v7, v3

    .line 101
    goto :goto_7

    .line 102
    :cond_6
    const/4 v3, 0x0

    .line 103
    goto :goto_6

    .line 104
    :goto_7
    new-instance v3, Lr3/o;

    .line 105
    .line 106
    iget-object v1, v0, Lr3/k;->a:Landroid/content/Context;

    .line 107
    .line 108
    invoke-static {v0}, Lv3/d;->a(Lr3/k;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    iget-boolean v8, v0, Lr3/k;->n:Z

    .line 113
    .line 114
    iget-object v10, v0, Lr3/k;->i:Lokhttp3/y;

    .line 115
    .line 116
    iget-object v11, v0, Lr3/k;->j:Lr3/s;

    .line 117
    .line 118
    iget-object v12, v0, Lr3/k;->y:Lr3/p;

    .line 119
    .line 120
    iget-object v13, v0, Lr3/k;->o:Lr3/b;

    .line 121
    .line 122
    iget-object v14, v0, Lr3/k;->p:Lr3/b;

    .line 123
    .line 124
    iget-object v15, v0, Lr3/k;->q:Lr3/b;

    .line 125
    .line 126
    move-object v0, v3

    .line 127
    const/4 v3, 0x0

    .line 128
    const/4 v9, 0x0

    .line 129
    invoke-direct/range {v0 .. v15}, Lr3/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Ls3/h;Ls3/g;ZZZLjava/lang/String;Lokhttp3/y;Lr3/s;Lr3/p;Lr3/b;Lr3/b;Lr3/b;)V

    .line 130
    .line 131
    .line 132
    return-object v0
.end method

.method public H(Ljava/lang/CharSequence;IIIZLv0/o;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Lv0/p;

    .line 12
    .line 13
    iget-object v6, v0, La4/c;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, La1/h;

    .line 16
    .line 17
    iget-object v6, v6, La1/h;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Lv0/s;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Lv0/p;-><init>(Lv0/s;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_f

    .line 38
    .line 39
    if-ge v10, v3, :cond_f

    .line 40
    .line 41
    if-eqz v11, :cond_f

    .line 42
    .line 43
    iget-object v13, v5, Lv0/p;->c:Lv0/s;

    .line 44
    .line 45
    iget-object v13, v13, Lv0/s;->a:Landroid/util/SparseArray;

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    const/4 v13, 0x0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    check-cast v13, Lv0/s;

    .line 56
    .line 57
    :goto_2
    iget v14, v5, Lv0/p;->a:I

    .line 58
    .line 59
    const/4 v15, 0x3

    .line 60
    if-eq v14, v12, :cond_3

    .line 61
    .line 62
    if-nez v13, :cond_2

    .line 63
    .line 64
    invoke-virtual {v5}, Lv0/p;->a()V

    .line 65
    .line 66
    .line 67
    :goto_3
    move v13, v8

    .line 68
    goto :goto_6

    .line 69
    :cond_2
    iput v12, v5, Lv0/p;->a:I

    .line 70
    .line 71
    iput-object v13, v5, Lv0/p;->c:Lv0/s;

    .line 72
    .line 73
    iput v8, v5, Lv0/p;->f:I

    .line 74
    .line 75
    :goto_4
    move v13, v12

    .line 76
    goto :goto_6

    .line 77
    :cond_3
    if-eqz v13, :cond_4

    .line 78
    .line 79
    iput-object v13, v5, Lv0/p;->c:Lv0/s;

    .line 80
    .line 81
    iget v13, v5, Lv0/p;->f:I

    .line 82
    .line 83
    add-int/2addr v13, v8

    .line 84
    iput v13, v5, Lv0/p;->f:I

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    const v13, 0xfe0e

    .line 88
    .line 89
    .line 90
    if-ne v9, v13, :cond_5

    .line 91
    .line 92
    invoke-virtual {v5}, Lv0/p;->a()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const v13, 0xfe0f

    .line 97
    .line 98
    .line 99
    if-ne v9, v13, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget-object v13, v5, Lv0/p;->c:Lv0/s;

    .line 103
    .line 104
    iget-object v14, v13, Lv0/s;->b:Lv0/v;

    .line 105
    .line 106
    if-eqz v14, :cond_9

    .line 107
    .line 108
    iget v14, v5, Lv0/p;->f:I

    .line 109
    .line 110
    if-ne v14, v8, :cond_8

    .line 111
    .line 112
    invoke-virtual {v5}, Lv0/p;->b()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_7

    .line 117
    .line 118
    iget-object v13, v5, Lv0/p;->c:Lv0/s;

    .line 119
    .line 120
    iput-object v13, v5, Lv0/p;->d:Lv0/s;

    .line 121
    .line 122
    invoke-virtual {v5}, Lv0/p;->a()V

    .line 123
    .line 124
    .line 125
    :goto_5
    move v13, v15

    .line 126
    goto :goto_6

    .line 127
    :cond_7
    invoke-virtual {v5}, Lv0/p;->a()V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    iput-object v13, v5, Lv0/p;->d:Lv0/s;

    .line 132
    .line 133
    invoke-virtual {v5}, Lv0/p;->a()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    invoke-virtual {v5}, Lv0/p;->a()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :goto_6
    iput v9, v5, Lv0/p;->e:I

    .line 142
    .line 143
    if-eq v13, v8, :cond_e

    .line 144
    .line 145
    if-eq v13, v12, :cond_c

    .line 146
    .line 147
    if-eq v13, v15, :cond_a

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_a
    if-nez p5, :cond_b

    .line 151
    .line 152
    iget-object v12, v5, Lv0/p;->d:Lv0/s;

    .line 153
    .line 154
    iget-object v12, v12, Lv0/s;->b:Lv0/v;

    .line 155
    .line 156
    invoke-virtual {v0, v1, v7, v6, v12}, La4/c;->C(Ljava/lang/CharSequence;IILv0/v;)Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-nez v12, :cond_0

    .line 161
    .line 162
    :cond_b
    iget-object v11, v5, Lv0/p;->d:Lv0/s;

    .line 163
    .line 164
    iget-object v11, v11, Lv0/s;->b:Lv0/v;

    .line 165
    .line 166
    invoke-interface {v4, v1, v7, v6, v11}, Lv0/o;->g(Ljava/lang/CharSequence;IILv0/v;)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    add-int/lit8 v10, v10, 0x1

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    add-int/2addr v12, v6

    .line 179
    if-ge v12, v2, :cond_d

    .line 180
    .line 181
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    move v9, v6

    .line 186
    :cond_d
    move v6, v12

    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    add-int/2addr v6, v7

    .line 198
    if-ge v6, v2, :cond_0

    .line 199
    .line 200
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    move v9, v7

    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_f
    iget v2, v5, Lv0/p;->a:I

    .line 208
    .line 209
    if-ne v2, v12, :cond_12

    .line 210
    .line 211
    iget-object v2, v5, Lv0/p;->c:Lv0/s;

    .line 212
    .line 213
    iget-object v2, v2, Lv0/s;->b:Lv0/v;

    .line 214
    .line 215
    if-eqz v2, :cond_12

    .line 216
    .line 217
    iget v2, v5, Lv0/p;->f:I

    .line 218
    .line 219
    if-gt v2, v8, :cond_10

    .line 220
    .line 221
    invoke-virtual {v5}, Lv0/p;->b()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_12

    .line 226
    .line 227
    :cond_10
    if-ge v10, v3, :cond_12

    .line 228
    .line 229
    if-eqz v11, :cond_12

    .line 230
    .line 231
    if-nez p5, :cond_11

    .line 232
    .line 233
    iget-object v2, v5, Lv0/p;->c:Lv0/s;

    .line 234
    .line 235
    iget-object v2, v2, Lv0/s;->b:Lv0/v;

    .line 236
    .line 237
    invoke-virtual {v0, v1, v7, v6, v2}, La4/c;->C(Ljava/lang/CharSequence;IILv0/v;)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-nez v2, :cond_12

    .line 242
    .line 243
    :cond_11
    iget-object v2, v5, Lv0/p;->c:Lv0/s;

    .line 244
    .line 245
    iget-object v2, v2, Lv0/s;->b:Lv0/v;

    .line 246
    .line 247
    invoke-interface {v4, v1, v7, v6, v2}, Lv0/o;->g(Ljava/lang/CharSequence;IILv0/v;)Z

    .line 248
    .line 249
    .line 250
    :cond_12
    invoke-interface {v4}, Lv0/o;->e()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    return-object v1
.end method

.method public I()V
    .locals 1

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public J(Lu/e;III)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lu/d;->b0:I

    .line 5
    .line 6
    iget v1, p1, Lu/d;->c0:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p1, Lu/d;->b0:I

    .line 10
    .line 11
    iput v2, p1, Lu/d;->c0:I

    .line 12
    .line 13
    invoke-virtual {p1, p3}, Lu/d;->O(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p4}, Lu/d;->L(I)V

    .line 17
    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    iput v2, p1, Lu/d;->b0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput v0, p1, Lu/d;->b0:I

    .line 25
    .line 26
    :goto_0
    if-gez v1, :cond_1

    .line 27
    .line 28
    iput v2, p1, Lu/d;->c0:I

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iput v1, p1, Lu/d;->c0:I

    .line 32
    .line 33
    :goto_1
    iget-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lu/e;

    .line 36
    .line 37
    iput p2, p1, Lu/e;->t0:I

    .line 38
    .line 39
    invoke-virtual {p1}, Lu/e;->U()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public M(Lu/e;)V
    .locals 9

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Lu/e;->q0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    const/4 v4, 0x1

    .line 17
    if-ge v3, v1, :cond_2

    .line 18
    .line 19
    iget-object v5, p1, Lu/e;->q0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lu/d;

    .line 26
    .line 27
    iget-object v6, v5, Lu/d;->p0:[I

    .line 28
    .line 29
    aget v7, v6, v2

    .line 30
    .line 31
    const/4 v8, 0x3

    .line 32
    if-eq v7, v8, :cond_0

    .line 33
    .line 34
    aget v4, v6, v4

    .line 35
    .line 36
    if-ne v4, v8, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p1, p1, Lu/e;->s0:Lv/e;

    .line 45
    .line 46
    iput-boolean v4, p1, Lv/e;->b:Z

    .line 47
    .line 48
    return-void
.end method

.method public N(Lr3/o;)Lr3/o;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lr3/o;->b:Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    iget-object v3, v0, Lr3/o;->o:Lr3/b;

    .line 8
    .line 9
    invoke-static {v2}, Lb6/v;->h(Landroid/graphics/Bitmap$Config;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    iget-object v4, v1, La4/c;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lv3/i;

    .line 19
    .line 20
    invoke-interface {v4}, Lv3/i;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 28
    .line 29
    move v4, v5

    .line 30
    :goto_0
    move-object v8, v2

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_1
    const/4 v4, 0x0

    .line 33
    goto :goto_0

    .line 34
    :goto_2
    iget-object v2, v0, Lr3/o;->o:Lr3/b;

    .line 35
    .line 36
    iget-boolean v2, v2, Lr3/b;->j:Z

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, v1, La4/c;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lv3/l;

    .line 43
    .line 44
    monitor-enter v2

    .line 45
    :try_start_0
    invoke-virtual {v2}, Lv3/l;->a()V

    .line 46
    .line 47
    .line 48
    iget-boolean v6, v2, Lv3/l;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    monitor-exit v2

    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    sget-object v3, Lr3/b;->m:Lr3/b;

    .line 54
    .line 55
    :goto_3
    move-object/from16 v21, v3

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw v0

    .line 61
    :cond_2
    move v5, v4

    .line 62
    goto :goto_3

    .line 63
    :goto_4
    if-eqz v5, :cond_3

    .line 64
    .line 65
    iget-object v7, v0, Lr3/o;->a:Landroid/content/Context;

    .line 66
    .line 67
    iget-object v9, v0, Lr3/o;->c:Landroid/graphics/ColorSpace;

    .line 68
    .line 69
    iget-object v10, v0, Lr3/o;->d:Ls3/h;

    .line 70
    .line 71
    iget-object v11, v0, Lr3/o;->e:Ls3/g;

    .line 72
    .line 73
    iget-boolean v12, v0, Lr3/o;->f:Z

    .line 74
    .line 75
    iget-boolean v13, v0, Lr3/o;->g:Z

    .line 76
    .line 77
    iget-boolean v14, v0, Lr3/o;->h:Z

    .line 78
    .line 79
    iget-object v15, v0, Lr3/o;->i:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v2, v0, Lr3/o;->j:Lokhttp3/y;

    .line 82
    .line 83
    iget-object v3, v0, Lr3/o;->k:Lr3/s;

    .line 84
    .line 85
    iget-object v4, v0, Lr3/o;->l:Lr3/p;

    .line 86
    .line 87
    iget-object v5, v0, Lr3/o;->m:Lr3/b;

    .line 88
    .line 89
    iget-object v0, v0, Lr3/o;->n:Lr3/b;

    .line 90
    .line 91
    new-instance v6, Lr3/o;

    .line 92
    .line 93
    move-object/from16 v20, v0

    .line 94
    .line 95
    move-object/from16 v16, v2

    .line 96
    .line 97
    move-object/from16 v17, v3

    .line 98
    .line 99
    move-object/from16 v18, v4

    .line 100
    .line 101
    move-object/from16 v19, v5

    .line 102
    .line 103
    invoke-direct/range {v6 .. v21}, Lr3/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Ls3/h;Ls3/g;ZZZLjava/lang/String;Lokhttp3/y;Lr3/s;Lr3/p;Lr3/b;Lr3/b;Lr3/b;)V

    .line 104
    .line 105
    .line 106
    return-object v6

    .line 107
    :cond_3
    return-object v0
.end method

.method public a(Lh1/w;)V
    .locals 13

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/d0;

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v0, Lh1/i0;->a:I

    .line 9
    .line 10
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Lh1/d0;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-wide v2, v1, Lh1/d0;->c:J

    .line 17
    .line 18
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-wide v6, v1, Lh1/d0;->b:J

    .line 28
    .line 29
    add-long/2addr v2, v6

    .line 30
    :goto_0
    move-wide v7, v2

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    invoke-virtual {v1}, Lh1/d0;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    monitor-exit v1

    .line 41
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    check-cast v2, Lh1/d0;

    .line 45
    .line 46
    monitor-enter v2

    .line 47
    :try_start_1
    iget-wide v0, v2, Lh1/d0;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    monitor-exit v2

    .line 50
    cmp-long v2, v7, v4

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    cmp-long v2, v0, v4

    .line 55
    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-object v2, p0, La4/c;->k:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Landroidx/media3/common/w;

    .line 62
    .line 63
    iget-wide v3, v2, Landroidx/media3/common/w;->s:J

    .line 64
    .line 65
    cmp-long v3, v0, v3

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {v2}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-wide v0, v2, Landroidx/media3/common/v;->r:J

    .line 74
    .line 75
    new-instance v0, Landroidx/media3/common/w;

    .line 76
    .line 77
    invoke-direct {v0, v2}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v1, p0, La4/c;->m:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ln1/i0;

    .line 85
    .line 86
    invoke-interface {v1, v0}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    invoke-virtual {p1}, Lh1/w;->a()I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ln1/i0;

    .line 96
    .line 97
    invoke-interface {v0, p1, v10}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v6, p1

    .line 103
    check-cast v6, Ln1/i0;

    .line 104
    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v9, 0x1

    .line 108
    invoke-interface/range {v6 .. v12}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_2
    return-void

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    move-object p1, v0

    .line 114
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 115
    throw p1

    .line 116
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 117
    throw p1
.end method

.method public acquire()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Ll0/d;->acquire()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lv4/a;

    .line 14
    .line 15
    invoke-interface {v0}, Lv4/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x2

    .line 20
    const-string v2, "FactoryPools"

    .line 21
    .line 22
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "Created new "

    .line 31
    .line 32
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    :cond_0
    instance-of v1, v0, Lv4/b;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, Lv4/b;

    .line 55
    .line 56
    invoke-interface {v1}, Lv4/b;->a()Lv4/d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v2, 0x0

    .line 61
    iput-boolean v2, v1, Lv4/d;->a:Z

    .line 62
    .line 63
    :cond_1
    return-object v0
.end method

.method public b(Lh1/d0;Ln1/p;Lt2/g0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p3}, Lt2/g0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Lt2/g0;->b()V

    .line 7
    .line 8
    .line 9
    iget p1, p3, Lt2/g0;->d:I

    .line 10
    .line 11
    const/4 p3, 0x5

    .line 12
    invoke-interface {p2, p1, p3}, Ln1/p;->track(II)Ln1/i0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p2, p0, La4/c;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Landroidx/media3/common/w;

    .line 21
    .line 22
    invoke-interface {p1, p2}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public c(J)I
    .locals 2

    .line 1
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p1, p2, v1}, Lh1/i0;->a([JJZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    array-length p2, v0

    .line 11
    if-ge p1, p2, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    return p1
.end method

.method public d(La4/f0;Ly3/h;)La4/f0;
    .locals 2

    .line 1
    invoke-interface {p1}, La4/f0;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, La4/c;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, La4/j;

    .line 14
    .line 15
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lb4/a;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lh4/c;->e(Landroid/graphics/Bitmap;Lb4/a;)Lh4/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0, p2}, La4/j;->d(La4/f0;Ly3/h;)La4/f0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    instance-of v0, v0, Ll4/b;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lm4/d;

    .line 41
    .line 42
    invoke-virtual {v0, p1, p2}, Lm4/d;->d(La4/f0;Ly3/h;)La4/f0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    return-object p1
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc5/s;

    .line 4
    .line 5
    iget-object v0, v0, Lc5/s;->u:La5/c;

    .line 6
    .line 7
    iget-object v1, v0, La5/c;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/widget/ImageView;

    .line 10
    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La5/c;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, La5/c;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/widget/TextView;

    .line 27
    .line 28
    iget-object v1, p0, La4/c;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public endTracks()V
    .locals 1

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln1/p;

    .line 4
    .line 5
    invoke-interface {v0}, Ln1/p;->endTracks()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(I)J
    .locals 4

    .line 1
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    move v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v1

    .line 12
    :goto_0
    invoke-static {v3}, Lh1/a;->d(Z)V

    .line 13
    .line 14
    .line 15
    array-length v3, v0

    .line 16
    if-ge p1, v3, :cond_1

    .line 17
    .line 18
    move v1, v2

    .line 19
    :cond_1
    invoke-static {v1}, Lh1/a;->d(Z)V

    .line 20
    .line 21
    .line 22
    aget-wide v1, v0, p1

    .line 23
    .line 24
    return-wide v1
.end method

.method public g(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lv4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lv4/b;

    .line 7
    .line 8
    invoke-interface {v0}, Lv4/b;->a()Lv4/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, v0, Lv4/d;->a:Z

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lk2/b;

    .line 18
    .line 19
    iget v0, v0, Lk2/b;->j:I

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object v0, p1

    .line 25
    check-cast v0, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    .line 29
    .line 30
    :pswitch_0
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ll0/d;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ll0/d;->g(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public getDescription()Landroid/content/ClipDescription;
    .locals 1

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ClipDescription;

    .line 4
    .line 5
    return-object v0
.end method

.method public h()Z
    .locals 7

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    :goto_0
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    aget-object v5, v1, v4

    .line 15
    .line 16
    invoke-virtual {v0, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    const/16 v6, 0xc

    .line 23
    .line 24
    invoke-virtual {v5, v6}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return v3
.end method

.method public i()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public j()V
    .locals 0

    .line 1
    return-void
.end method

.method public k()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc5/s;

    .line 4
    .line 5
    iget-object v0, v0, Lc5/s;->u:La5/c;

    .line 6
    .line 7
    iget-object v0, v0, La5/c;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/widget/ImageView;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public m(J)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ge v4, v5, :cond_2

    .line 22
    .line 23
    iget-object v5, p0, La4/c;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, [J

    .line 26
    .line 27
    mul-int/lit8 v6, v4, 0x2

    .line 28
    .line 29
    aget-wide v7, v5, v6

    .line 30
    .line 31
    cmp-long v7, v7, p1

    .line 32
    .line 33
    if-gtz v7, :cond_1

    .line 34
    .line 35
    add-int/lit8 v6, v6, 0x1

    .line 36
    .line 37
    aget-wide v6, v5, v6

    .line 38
    .line 39
    cmp-long v5, p1, v6

    .line 40
    .line 41
    if-gez v5, :cond_1

    .line 42
    .line 43
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ls2/c;

    .line 48
    .line 49
    iget-object v6, v5, Ls2/c;->a:Lg1/b;

    .line 50
    .line 51
    iget v7, v6, Lg1/b;->e:F

    .line 52
    .line 53
    const v8, -0x800001

    .line 54
    .line 55
    .line 56
    cmpl-float v7, v7, v8

    .line 57
    .line 58
    if-nez v7, :cond_0

    .line 59
    .line 60
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance p1, Lj0/a;

    .line 71
    .line 72
    const/4 p2, 0x3

    .line 73
    invoke-direct {p1, p2}, Lj0/a;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {v2, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-ge v3, p1, :cond_3

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Ls2/c;

    .line 90
    .line 91
    iget-object p1, p1, Ls2/c;->a:Lg1/b;

    .line 92
    .line 93
    invoke-virtual {p1}, Lg1/b;->a()Lg1/a;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    rsub-int/lit8 p2, v3, -0x1

    .line 98
    .line 99
    int-to-float p2, p2

    .line 100
    iput p2, p1, Lg1/a;->e:F

    .line 101
    .line 102
    const/4 p2, 0x1

    .line 103
    iput p2, p1, Lg1/a;->f:I

    .line 104
    .line 105
    invoke-virtual {p1}, Lg1/a;->a()Lg1/b;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    return-object v1
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    return v0
.end method

.method public o()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public declared-synchronized q(Ly3/e;La4/y;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, La4/b;

    .line 3
    .line 4
    iget-object v1, p0, La4/c;->l:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, v1}, La4/b;-><init>(Ly3/e;La4/y;Ljava/lang/ref/ReferenceQueue;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, La4/c;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, La4/b;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    iput-object p2, p1, La4/b;->c:La4/f0;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :cond_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method

.method public r(La4/b;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object v1, p1, La4/b;->a:Ly3/e;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p1, La4/b;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v2, p1, La4/b;->c:La4/f0;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    new-instance v1, La4/y;

    .line 22
    .line 23
    iget-object v5, p1, La4/b;->a:Ly3/e;

    .line 24
    .line 25
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, La4/q;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, La4/y;-><init>(La4/f0;ZZLy3/e;La4/x;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La4/q;

    .line 38
    .line 39
    iget-object p1, p1, La4/b;->a:Ly3/e;

    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, La4/q;->e(Ly3/e;La4/y;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1
.end method

.method public s(Ln1/p;Lt2/g0;)V
    .locals 9

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ln1/i0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    array-length v3, v0

    .line 8
    if-ge v2, v3, :cond_3

    .line 9
    .line 10
    invoke-virtual {p2}, Lt2/g0;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 14
    .line 15
    .line 16
    iget v3, p2, Lt2/g0;->d:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-interface {p1, v3, v4}, Ln1/p;->track(II)Ln1/i0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, La4/c;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Landroidx/media3/common/w;

    .line 32
    .line 33
    iget-object v5, v4, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_1

    .line 42
    .line 43
    const-string v6, "application/cea-708"

    .line 44
    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v6, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 55
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v8, "Invalid closed caption MIME type provided: "

    .line 58
    .line 59
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v7, v6}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    iget-object v6, v4, Landroidx/media3/common/w;->a:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_2
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v6, p2, Lt2/g0;->e:Ljava/lang/String;

    .line 81
    .line 82
    :goto_3
    new-instance v7, Landroidx/media3/common/v;

    .line 83
    .line 84
    invoke-direct {v7}, Landroidx/media3/common/v;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v6, v7, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iput-object v5, v7, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 94
    .line 95
    iget v5, v4, Landroidx/media3/common/w;->e:I

    .line 96
    .line 97
    iput v5, v7, Landroidx/media3/common/v;->e:I

    .line 98
    .line 99
    iget-object v5, v4, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v5, v7, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 102
    .line 103
    iget v5, v4, Landroidx/media3/common/w;->H:I

    .line 104
    .line 105
    iput v5, v7, Landroidx/media3/common/v;->G:I

    .line 106
    .line 107
    iget-object v4, v4, Landroidx/media3/common/w;->q:Ljava/util/List;

    .line 108
    .line 109
    iput-object v4, v7, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 110
    .line 111
    new-instance v4, Landroidx/media3/common/w;

    .line 112
    .line 113
    invoke-direct {v4, v7}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v3, v4}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 117
    .line 118
    .line 119
    aput-object v3, v0, v2

    .line 120
    .line 121
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    return-void
.end method

.method public seekMap(Ln1/c0;)V
    .locals 1

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln1/p;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public shutdown()V
    .locals 2

    .line 1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 4
    .line 5
    iget-object v1, p0, La4/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln4/o;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public t(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget v0, p0, La4/c;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/bumptech/glide/load/data/i;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_0
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/bumptech/glide/load/data/i;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/bumptech/glide/load/data/i;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lh4/w;

    .line 31
    .line 32
    invoke-virtual {v0}, Lh4/w;->reset()V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :pswitch_1
    iget-object v0, p0, La4/c;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    invoke-static {v0}, Lu4/a;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Li3/j;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Li3/j;-><init>(Ljava/nio/ByteBuffer;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v1, v0, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, La4/c;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x7b

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, La4/c;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, La1/e;

    .line 33
    .line 34
    iget-object v1, v1, La1/e;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La1/e;

    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    :goto_0
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v3, v1, La1/e;->k:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v4, 0x1

    .line 72
    sub-int/2addr v3, v4

    .line 73
    invoke-virtual {v0, v2, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object v1, v1, La1/e;->l:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, La1/e;

    .line 83
    .line 84
    const-string v2, ", "

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const/16 v1, 0x7d

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public track(II)Ln1/i0;
    .locals 3

    .line 1
    iget-object v0, p0, La4/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseArray;

    .line 4
    .line 5
    iget-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln1/p;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq p2, v2, :cond_0

    .line 11
    .line 12
    invoke-interface {v1, p1, p2}, Ln1/p;->track(II)Ln1/i0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lk2/r;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    new-instance v2, Lk2/r;

    .line 27
    .line 28
    invoke-interface {v1, p1, p2}, Ln1/p;->track(II)Ln1/i0;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object v1, p0, La4/c;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lk2/o;

    .line 35
    .line 36
    invoke-direct {v2, p2, v1}, Lk2/r;-><init>(Ln1/i0;Lk2/o;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v2
.end method

.method public w(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, La4/c;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, Landroid/support/v4/media/session/b;->t(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public x(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lcom/bumptech/glide/d;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public y(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lm/t;->a()Lm/t;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, La4/c;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v2, v0, Lm/t;->a:Lm/y1;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2, p1, v1, v3}, Lm/y1;->c(ILandroid/content/Context;Z)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public z(IILm/o0;)Landroid/graphics/Typeface;
    .locals 9

    .line 1
    iget-object v0, p0, La4/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/util/TypedValue;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, La4/c;->k:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, Landroid/content/Context;

    .line 30
    .line 31
    iget-object p1, p0, La4/c;->m:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v4, p1

    .line 34
    check-cast v4, Landroid/util/TypedValue;

    .line 35
    .line 36
    sget-object p1, Ld0/k;->a:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_2
    const/4 v7, 0x1

    .line 47
    const/4 v8, 0x0

    .line 48
    move v5, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-static/range {v2 .. v8}, Ld0/k;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILd0/b;ZZ)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method
