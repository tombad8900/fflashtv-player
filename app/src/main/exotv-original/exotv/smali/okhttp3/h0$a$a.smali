.class public final Lokhttp3/h0$a$a;
.super Lokhttp3/h0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/h0$a;->create(Ljava/io/File;Lokhttp3/d0;)Lokhttp3/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $contentType:Lokhttp3/d0;

.field final synthetic $this_asRequestBody:Ljava/io/File;


# direct methods
.method public constructor <init>(Lokhttp3/d0;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/h0$a$a;->$contentType:Lokhttp3/d0;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/h0$a$a;->$this_asRequestBody:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {p0}, Lokhttp3/h0;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/h0$a$a;->$this_asRequestBody:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Lokhttp3/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/h0$a$a;->$contentType:Lokhttp3/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lv7/k;)V
    .locals 2

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/h0$a$a;->$this_asRequestBody:Ljava/io/File;

    .line 7
    .line 8
    invoke-static {v0}, Lv7/b;->h(Ljava/io/File;)Lv7/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-interface {p1, v0}, Lv7/k;->f(Lv7/k0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lv7/e;->close()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :catchall_1
    move-exception v1

    .line 22
    invoke-static {v0, p1}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw v1
.end method
