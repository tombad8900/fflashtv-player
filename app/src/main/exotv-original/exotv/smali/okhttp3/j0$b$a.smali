.class public final Lokhttp3/j0$b$a;
.super Lokhttp3/j0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/j0$b;->create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $contentLength:J

.field final synthetic $contentType:Lokhttp3/d0;

.field final synthetic $this_asResponseBody:Lv7/l;


# direct methods
.method public constructor <init>(Lokhttp3/d0;JLv7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/j0$b$a;->$contentType:Lokhttp3/d0;

    .line 2
    .line 3
    iput-wide p2, p0, Lokhttp3/j0$b$a;->$contentLength:J

    .line 4
    .line 5
    iput-object p4, p0, Lokhttp3/j0$b$a;->$this_asResponseBody:Lv7/l;

    .line 6
    .line 7
    invoke-direct {p0}, Lokhttp3/j0;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/j0$b$a;->$contentLength:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Lokhttp3/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/j0$b$a;->$contentType:Lokhttp3/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public source()Lv7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/j0$b$a;->$this_asResponseBody:Lv7/l;

    .line 2
    .line 3
    return-object v0
.end method
