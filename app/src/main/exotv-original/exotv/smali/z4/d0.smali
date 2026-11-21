.class public final Lz4/d0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Landroid/os/Handler;

.field public final synthetic b:Lz6/k;

.field public final synthetic c:Lz6/n;

.field public final synthetic d:Li7/m;

.field public final synthetic e:Ljava/util/ArrayList;

.field public final synthetic f:Lz6/n;

.field public final synthetic g:Lz6/n;

.field public final synthetic h:Landroid/webkit/WebView;

.field public final synthetic i:Lc5/b;

.field public final synthetic j:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lz6/k;Lz6/n;Li7/m;Ljava/util/ArrayList;Lz6/n;Lz6/n;Landroid/webkit/WebView;Lc5/b;Ljava/util/LinkedHashSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz4/d0;->a:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p2, p0, Lz4/d0;->b:Lz6/k;

    .line 7
    .line 8
    iput-object p3, p0, Lz4/d0;->c:Lz6/n;

    .line 9
    .line 10
    iput-object p4, p0, Lz4/d0;->d:Li7/m;

    .line 11
    .line 12
    iput-object p5, p0, Lz4/d0;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p6, p0, Lz4/d0;->f:Lz6/n;

    .line 15
    .line 16
    iput-object p7, p0, Lz4/d0;->g:Lz6/n;

    .line 17
    .line 18
    iput-object p8, p0, Lz4/d0;->h:Landroid/webkit/WebView;

    .line 19
    .line 20
    iput-object p9, p0, Lz4/d0;->i:Lc5/b;

    .line 21
    .line 22
    iput-object p10, p0, Lz4/d0;->j:Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final onEvent(Ljava/lang/String;)V
    .locals 14
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "raw"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/high16 v1, 0x40000

    .line 11
    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v2, Lz4/c0;

    .line 16
    .line 17
    iget-object v4, p0, Lz4/d0;->b:Lz6/k;

    .line 18
    .line 19
    iget-object v5, p0, Lz4/d0;->c:Lz6/n;

    .line 20
    .line 21
    iget-object v6, p0, Lz4/d0;->d:Li7/m;

    .line 22
    .line 23
    iget-object v7, p0, Lz4/d0;->e:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v8, p0, Lz4/d0;->f:Lz6/n;

    .line 26
    .line 27
    iget-object v9, p0, Lz4/d0;->g:Lz6/n;

    .line 28
    .line 29
    iget-object v10, p0, Lz4/d0;->h:Landroid/webkit/WebView;

    .line 30
    .line 31
    iget-object v11, p0, Lz4/d0;->i:Lc5/b;

    .line 32
    .line 33
    iget-object v12, p0, Lz4/d0;->j:Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    iget-object v13, p0, Lz4/d0;->a:Landroid/os/Handler;

    .line 36
    .line 37
    move-object v3, p1

    .line 38
    invoke-direct/range {v2 .. v13}, Lz4/c0;-><init>(Ljava/lang/String;Lz6/k;Lz6/n;Li7/m;Ljava/util/ArrayList;Lz6/n;Lz6/n;Landroid/webkit/WebView;Lc5/b;Ljava/util/LinkedHashSet;Landroid/os/Handler;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v13, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method
