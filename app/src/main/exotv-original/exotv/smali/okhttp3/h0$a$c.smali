.class public final Lokhttp3/h0$a$c;
.super Lokhttp3/h0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/h0$a;->create([BLokhttp3/d0;II)Lokhttp3/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $byteCount:I

.field final synthetic $contentType:Lokhttp3/d0;

.field final synthetic $offset:I

.field final synthetic $this_toRequestBody:[B


# direct methods
.method public constructor <init>(Lokhttp3/d0;I[BI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/h0$a$c;->$contentType:Lokhttp3/d0;

    .line 2
    .line 3
    iput p2, p0, Lokhttp3/h0$a$c;->$byteCount:I

    .line 4
    .line 5
    iput-object p3, p0, Lokhttp3/h0$a$c;->$this_toRequestBody:[B

    .line 6
    .line 7
    iput p4, p0, Lokhttp3/h0$a$c;->$offset:I

    .line 8
    .line 9
    invoke-direct {p0}, Lokhttp3/h0;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/h0$a$c;->$byteCount:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public contentType()Lokhttp3/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/h0$a$c;->$contentType:Lokhttp3/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lv7/k;)V
    .locals 3

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/h0$a$c;->$this_toRequestBody:[B

    .line 7
    .line 8
    iget v1, p0, Lokhttp3/h0$a$c;->$offset:I

    .line 9
    .line 10
    iget v2, p0, Lokhttp3/h0$a$c;->$byteCount:I

    .line 11
    .line 12
    invoke-interface {p1, v0, v1, v2}, Lv7/k;->write([BII)Lv7/k;

    .line 13
    .line 14
    .line 15
    return-void
.end method
