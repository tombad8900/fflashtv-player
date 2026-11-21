.class public final Lg7/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Iterable;
.implements La7/a;


# instance fields
.field public final synthetic j:Lg7/e;


# direct methods
.method public constructor <init>(Lg7/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg7/m;->j:Lg7/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lh7/b;

    .line 2
    .line 3
    iget-object v1, p0, Lg7/m;->j:Lg7/e;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh7/b;-><init>(Lg7/e;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
