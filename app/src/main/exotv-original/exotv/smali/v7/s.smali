.class public final Lv7/s;
.super Lv7/n0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public a:Lv7/n0;


# direct methods
.method public constructor <init>(Lv7/n0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lv7/s;->a:Lv7/n0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final awaitSignal(Ljava/util/concurrent/locks/Condition;)V
    .locals 1

    .line 1
    const-string v0, "condition"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv7/n0;->awaitSignal(Ljava/util/concurrent/locks/Condition;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final clearDeadline()Lv7/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/n0;->clearDeadline()Lv7/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final clearTimeout()Lv7/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/n0;->clearTimeout()Lv7/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final deadlineNanoTime()J
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    invoke-virtual {v0}, Lv7/n0;->deadlineNanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final deadlineNanoTime(J)Lv7/n0;
    .locals 1

    .line 2
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    invoke-virtual {v0, p1, p2}, Lv7/n0;->deadlineNanoTime(J)Lv7/n0;

    move-result-object p1

    return-object p1
.end method

.method public final hasDeadline()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/n0;->hasDeadline()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final throwIfReached()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/n0;->throwIfReached()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final timeout(JLjava/util/concurrent/TimeUnit;)Lv7/n0;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lv7/n0;->timeout(JLjava/util/concurrent/TimeUnit;)Lv7/n0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final timeoutNanos()J
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/n0;->timeoutNanos()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final waitUntilNotified(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "monitor"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/s;->a:Lv7/n0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv7/n0;->waitUntilNotified(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
