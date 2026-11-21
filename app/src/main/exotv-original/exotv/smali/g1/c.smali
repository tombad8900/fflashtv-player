.class public final Lg1/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final b:Lg1/c;


# instance fields
.field public final a:Lf6/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg1/c;

    .line 2
    .line 3
    sget-object v1, Lf6/m0;->k:Lf6/k0;

    .line 4
    .line 5
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg1/c;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lg1/c;->b:Lg1/c;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lh1/i0;->M(I)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {v0}, Lh1/i0;->M(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lg1/c;->a:Lf6/m0;

    .line 9
    .line 10
    return-void
.end method
