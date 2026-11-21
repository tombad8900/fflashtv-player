.class public final Lcom/bumptech/glide/e;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final k:Lcom/bumptech/glide/a;


# instance fields
.field public final a:Lb4/f;

.field public final b:La4/p;

.field public final c:Lk2/b;

.field public final d:Ly5/f;

.field public final e:Ljava/util/List;

.field public final f:Lp/e;

.field public final g:La4/q;

.field public final h:La1/o;

.field public final i:I

.field public j:Lq4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bumptech/glide/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ls4/b;->a:Ls4/a;

    .line 7
    .line 8
    iput-object v1, v0, Lcom/bumptech/glide/a;->j:Ls4/a;

    .line 9
    .line 10
    sput-object v0, Lcom/bumptech/glide/e;->k:Lcom/bumptech/glide/a;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lb4/f;Ln4/p;Lk2/b;Ly5/f;Lp/e;Ljava/util/List;La4/q;La1/o;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/bumptech/glide/e;->a:Lb4/f;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bumptech/glide/e;->c:Lk2/b;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/bumptech/glide/e;->d:Ly5/f;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/bumptech/glide/e;->e:Ljava/util/List;

    .line 15
    .line 16
    iput-object p6, p0, Lcom/bumptech/glide/e;->f:Lp/e;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/bumptech/glide/e;->g:La4/q;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/bumptech/glide/e;->h:La1/o;

    .line 21
    .line 22
    const/4 p1, 0x4

    .line 23
    iput p1, p0, Lcom/bumptech/glide/e;->i:I

    .line 24
    .line 25
    new-instance p1, La4/p;

    .line 26
    .line 27
    invoke-direct {p1, p3}, La4/p;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/bumptech/glide/e;->b:La4/p;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/e;->b:La4/p;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/p;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/bumptech/glide/h;

    .line 8
    .line 9
    return-object v0
.end method
