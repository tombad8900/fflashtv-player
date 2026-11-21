.class public final Lp3/e;
.super Lp/j;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic h:La1/e;


# direct methods
.method public constructor <init>(ILa1/e;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lp3/e;->h:La1/e;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lp/j;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lp3/a;

    .line 2
    .line 3
    check-cast p2, Lp3/d;

    .line 4
    .line 5
    check-cast p3, Lp3/d;

    .line 6
    .line 7
    iget-object p3, p0, Lp3/e;->h:La1/e;

    .line 8
    .line 9
    iget-object p3, p3, La1/e;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p3, La4/j;

    .line 12
    .line 13
    iget-object v0, p2, Lp3/d;->a:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iget-object v1, p2, Lp3/d;->b:Ljava/util/Map;

    .line 16
    .line 17
    iget p2, p2, Lp3/d;->c:I

    .line 18
    .line 19
    invoke-virtual {p3, p1, v0, v1, p2}, La4/j;->h(Lp3/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final m(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lp3/a;

    .line 2
    .line 3
    check-cast p2, Lp3/d;

    .line 4
    .line 5
    iget p1, p2, Lp3/d;->c:I

    .line 6
    .line 7
    return p1
.end method
