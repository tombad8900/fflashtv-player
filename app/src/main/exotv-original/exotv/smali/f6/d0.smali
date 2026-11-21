.class public abstract Lf6/d0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lf6/b0;

.field public static final b:Lf6/c0;

.field public static final c:Lf6/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf6/b0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf6/d0;->a:Lf6/b0;

    .line 7
    .line 8
    new-instance v0, Lf6/c0;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, Lf6/c0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf6/d0;->b:Lf6/c0;

    .line 15
    .line 16
    new-instance v0, Lf6/c0;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Lf6/c0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lf6/d0;->c:Lf6/c0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public abstract a(II)Lf6/d0;
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;
.end method

.method public abstract c(ZZ)Lf6/d0;
.end method

.method public abstract d(ZZ)Lf6/d0;
.end method

.method public abstract e()I
.end method
