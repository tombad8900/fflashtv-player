.class public final Ly5/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Ly5/j;


# direct methods
.method public synthetic constructor <init>(Ly5/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly5/g;->a:Ly5/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ly5/d;)Ly5/d;
    .locals 2

    .line 1
    instance-of v0, p1, Ly5/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, Ly5/b;

    .line 7
    .line 8
    iget-object v1, p0, Ly5/g;->a:Ly5/j;

    .line 9
    .line 10
    invoke-virtual {v1}, Ly5/j;->j()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    neg-float v1, v1

    .line 15
    invoke-direct {v0, v1, p1}, Ly5/b;-><init>(FLy5/d;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
