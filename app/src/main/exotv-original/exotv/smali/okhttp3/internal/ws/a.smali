.class public final Lokhttp3/internal/ws/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final deflatedBytes:Lv7/j;

.field private final deflater:Ljava/util/zip/Deflater;

.field private final deflaterSink:Lv7/n;

.field private final noContextTakeover:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lokhttp3/internal/ws/a;->noContextTakeover:Z

    .line 5
    .line 6
    new-instance p1, Lv7/j;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lokhttp3/internal/ws/a;->deflatedBytes:Lv7/j;

    .line 12
    .line 13
    new-instance v0, Ljava/util/zip/Deflater;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lokhttp3/internal/ws/a;->deflater:Ljava/util/zip/Deflater;

    .line 21
    .line 22
    new-instance v1, Lv7/n;

    .line 23
    .line 24
    invoke-direct {v1, p1, v0}, Lv7/n;-><init>(Lv7/j;Ljava/util/zip/Deflater;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lokhttp3/internal/ws/a;->deflaterSink:Lv7/n;

    .line 28
    .line 29
    return-void
.end method

.method private final endsWith(Lv7/j;Lv7/m;)Z
    .locals 4

    .line 1
    iget-wide v0, p1, Lv7/j;->k:J

    .line 2
    .line 3
    invoke-virtual {p2}, Lv7/m;->d()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    int-to-long v2, v2

    .line 8
    sub-long/2addr v0, v2

    .line 9
    invoke-virtual {p1, v0, v1, p2}, Lv7/j;->t(JLv7/m;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflaterSink:Lv7/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/n;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final deflate(Lv7/j;)V
    .locals 5

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflatedBytes:Lv7/j;

    .line 7
    .line 8
    iget-wide v0, v0, Lv7/j;->k:J

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-boolean v0, p0, Lokhttp3/internal/ws/a;->noContextTakeover:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflater:Ljava/util/zip/Deflater;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->reset()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflaterSink:Lv7/n;

    .line 26
    .line 27
    iget-wide v1, p1, Lv7/j;->k:J

    .line 28
    .line 29
    invoke-virtual {v0, p1, v1, v2}, Lv7/n;->write(Lv7/j;J)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflaterSink:Lv7/n;

    .line 33
    .line 34
    invoke-virtual {v0}, Lv7/n;->flush()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflatedBytes:Lv7/j;

    .line 38
    .line 39
    invoke-static {}, Lokhttp3/internal/ws/b;->access$getEMPTY_DEFLATE_BLOCK$p()Lv7/m;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {p0, v0, v1}, Lokhttp3/internal/ws/a;->endsWith(Lv7/j;Lv7/m;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflatedBytes:Lv7/j;

    .line 50
    .line 51
    iget-wide v1, v0, Lv7/j;->k:J

    .line 52
    .line 53
    const/4 v3, 0x4

    .line 54
    int-to-long v3, v3

    .line 55
    sub-long/2addr v1, v3

    .line 56
    sget-object v3, Lv7/b;->a:Lv7/h;

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Lv7/j;->x(Lv7/h;)Lv7/h;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :try_start_0
    invoke-virtual {v0, v1, v2}, Lv7/h;->b(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lv7/h;->close()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    :catchall_1
    move-exception v1

    .line 72
    invoke-static {v0, p1}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflatedBytes:Lv7/j;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-virtual {v0, v1}, Lv7/j;->K(I)V

    .line 80
    .line 81
    .line 82
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/ws/a;->deflatedBytes:Lv7/j;

    .line 83
    .line 84
    iget-wide v1, v0, Lv7/j;->k:J

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1, v2}, Lv7/j;->write(Lv7/j;J)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    const-string v0, "Failed requirement."

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method
