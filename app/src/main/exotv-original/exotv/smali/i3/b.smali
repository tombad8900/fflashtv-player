.class public final Li3/b;
.super Lv7/r;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public j:Ljava/lang/Exception;


# virtual methods
.method public final read(Lv7/j;J)J
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lv7/r;->read(Lv7/j;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-wide p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    iput-object p1, p0, Li3/b;->j:Ljava/lang/Exception;

    .line 8
    .line 9
    throw p1
.end method
