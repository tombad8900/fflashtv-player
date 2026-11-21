.class public final Lw4/d0;
.super Lr6/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public m:Lcom/exotv/net/MovieDetailActivity;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lcom/exotv/net/MovieDetailActivity;

.field public p:I


# direct methods
.method public constructor <init>(Lcom/exotv/net/MovieDetailActivity;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw4/d0;->o:Lcom/exotv/net/MovieDetailActivity;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lr6/c;-><init>(Lp6/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lw4/d0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lw4/d0;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lw4/d0;->p:I

    .line 9
    .line 10
    iget-object p1, p0, Lw4/d0;->o:Lcom/exotv/net/MovieDetailActivity;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-static {p1, v0, v1, p0}, Lcom/exotv/net/MovieDetailActivity;->r(Lcom/exotv/net/MovieDetailActivity;JLr6/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
