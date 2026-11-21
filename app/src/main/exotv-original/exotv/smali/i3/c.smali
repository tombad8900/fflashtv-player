.class public final Li3/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Li3/k;

.field public final b:Lp7/h;


# direct methods
.method public constructor <init>(ILi3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Li3/c;->a:Li3/k;

    .line 5
    .line 6
    sget p2, Lp7/i;->a:I

    .line 7
    .line 8
    new-instance p2, Lp7/h;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Lp7/g;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Li3/c;->b:Lp7/h;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Li3/c;

    .line 2
    .line 3
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const-class v0, Li3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
