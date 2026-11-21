.class public final Lf6/r;
.super Lf6/b;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final transient p:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Lf6/z;->a(I)Lf6/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lf6/b;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "expectedValuesPerKey"

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-static {v1, v0}, Lf6/u;->c(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput v1, p0, Lf6/r;->p:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final g()Ljava/util/Collection;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Lf6/r;->p:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
