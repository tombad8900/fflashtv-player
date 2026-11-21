.class public final Ln1/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/i0;


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1000

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Ln1/m;->a:[B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final format(Landroidx/media3/common/w;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final sampleData(Landroidx/media3/common/m;IZI)I
    .locals 1

    .line 1
    iget-object p4, p0, Ln1/m;->a:[B

    array-length v0, p4

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, p4, v0, p2}, Landroidx/media3/common/m;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    .line 3
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return p1
.end method

.method public final sampleData(Lh1/w;II)V
    .locals 0

    .line 4
    invoke-virtual {p1, p2}, Lh1/w;->H(I)V

    return-void
.end method

.method public final sampleMetadata(JIIILn1/h0;)V
    .locals 0

    .line 1
    return-void
.end method
