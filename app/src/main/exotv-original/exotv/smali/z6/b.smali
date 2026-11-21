.class public abstract Lz6/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lf7/a;
.implements Ljava/io/Serializable;


# instance fields
.field public transient j:Lf7/a;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Class;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz6/b;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lz6/b;->l:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lz6/b;->m:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lz6/b;->n:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lz6/b;->o:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Lz6/c;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lz6/b;->o:Z

    .line 2
    .line 3
    iget-object v1, p0, Lz6/b;->l:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lz6/o;->a:Lz6/p;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lz6/j;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lz6/j;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-static {v1}, Lz6/o;->a(Ljava/lang/Class;)Lz6/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
