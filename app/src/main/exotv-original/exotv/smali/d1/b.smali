.class public final Ld1/b;
.super Landroidx/lifecycle/o;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    sget-object p1, Ld1/a;->k:Ld1/a;

    invoke-direct {p0, p1}, Ld1/b;-><init>(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Landroidx/lifecycle/o;-><init>(I)V

    .line 3
    iget-object v0, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    iget-object p1, p1, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
