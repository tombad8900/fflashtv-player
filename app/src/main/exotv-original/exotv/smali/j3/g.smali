.class public final Lj3/g;
.super Lv7/q;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final j:Lc5/c1;

.field public k:Z


# direct methods
.method public constructor <init>(Lv7/i0;Lc5/c1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv7/q;-><init>(Lv7/i0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lj3/g;->j:Lc5/c1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Lv7/q;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lj3/g;->k:Z

    .line 8
    .line 9
    iget-object v1, p0, Lj3/g;->j:Lc5/c1;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final flush()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Lv7/q;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lj3/g;->k:Z

    .line 8
    .line 9
    iget-object v1, p0, Lj3/g;->j:Lc5/c1;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final write(Lv7/j;J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj3/g;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Lv7/j;->skip(J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lv7/q;->write(Lv7/j;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    const/4 p2, 0x1

    .line 15
    iput-boolean p2, p0, Lj3/g;->k:Z

    .line 16
    .line 17
    iget-object p2, p0, Lj3/g;->j:Lc5/c1;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method
