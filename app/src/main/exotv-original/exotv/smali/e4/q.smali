.class public final Le4/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Ly3/e;

.field public final b:Ljava/util/List;

.field public final c:Lcom/bumptech/glide/load/data/e;


# direct methods
.method public constructor <init>(Ly3/e;Lcom/bumptech/glide/load/data/e;)V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Argument must not be null"

    .line 7
    .line 8
    invoke-static {v1, p1}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Le4/q;->a:Ly3/e;

    .line 12
    .line 13
    invoke-static {v1, v0}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Le4/q;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v1, p2}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 22
    .line 23
    return-void
.end method
