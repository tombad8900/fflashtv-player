.class public abstract Lo7/h;
.super Li7/n0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public l:Lo7/c;


# virtual methods
.method public final D(Lp6/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lo7/h;->l:Lo7/c;

    .line 2
    .line 3
    sget-object v0, Lo7/c;->q:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, p2, v0}, Lo7/c;->c(Ljava/lang/Runnable;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
