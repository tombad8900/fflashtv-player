.class public abstract Lk2/g;
.super Lm1/j;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lk2/i;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lk2/m;

    .line 3
    .line 4
    new-array v0, v0, [Lk2/n;

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lm1/j;-><init>([Lm1/g;[Lm1/h;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lk2/g;->name:Ljava/lang/String;

    .line 10
    .line 11
    const/16 p1, 0x400

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lm1/j;->setInitialInputBufferSize(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic access$000(Lk2/g;Lm1/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm1/j;->releaseOutputBuffer(Lm1/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final createInputBuffer()Lk2/m;
    .locals 2

    .line 2
    new-instance v0, Lk2/m;

    const/4 v1, 0x1

    .line 3
    invoke-direct {v0, v1}, Lm1/g;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic createInputBuffer()Lm1/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk2/g;->createInputBuffer()Lk2/m;

    move-result-object v0

    return-object v0
.end method

.method public final createOutputBuffer()Lk2/n;
    .locals 1

    .line 2
    new-instance v0, Lk2/f;

    invoke-direct {v0, p0}, Lk2/f;-><init>(Lk2/g;)V

    return-object v0
.end method

.method public bridge synthetic createOutputBuffer()Lm1/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk2/g;->createOutputBuffer()Lk2/n;

    move-result-object v0

    return-object v0
.end method

.method public final createUnexpectedDecodeException(Ljava/lang/Throwable;)Lk2/j;
    .locals 2

    .line 2
    new-instance v0, Lk2/j;

    const-string v1, "Unexpected decode error"

    .line 3
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public bridge synthetic createUnexpectedDecodeException(Ljava/lang/Throwable;)Lm1/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk2/g;->createUnexpectedDecodeException(Ljava/lang/Throwable;)Lk2/j;

    move-result-object p1

    return-object p1
.end method

.method public abstract decode([BIZ)Lk2/h;
.end method

.method public final decode(Lk2/m;Lk2/n;Z)Lk2/j;
    .locals 6

    .line 2
    :try_start_0
    iget-object v0, p1, Lm1/g;->data:Ljava/nio/ByteBuffer;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Lk2/g;->decode([BIZ)Lk2/h;

    move-result-object p3

    .line 5
    iget-wide v0, p1, Lm1/g;->timeUs:J

    iget-wide v2, p1, Lk2/m;->j:J

    .line 6
    iput-wide v0, p2, Lm1/h;->timeUs:J

    .line 7
    iput-object p3, p2, Lk2/n;->j:Lk2/h;

    const-wide v4, 0x7fffffffffffffffL

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-wide v0, v2

    .line 8
    :goto_0
    iput-wide v0, p2, Lk2/n;->k:J

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p2, Lm1/h;->shouldBeSkipped:Z
    :try_end_0
    .catch Lk2/j; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public bridge synthetic decode(Lm1/g;Lm1/h;Z)Lm1/e;
    .locals 0

    .line 1
    check-cast p1, Lk2/m;

    check-cast p2, Lk2/n;

    invoke-virtual {p0, p1, p2, p3}, Lk2/g;->decode(Lk2/m;Lk2/n;Z)Lk2/j;

    move-result-object p1

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/g;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setPositionUs(J)V
    .locals 0

    .line 1
    return-void
.end method
