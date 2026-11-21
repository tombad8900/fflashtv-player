.class public final Lokhttp3/j0$b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lz6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/j0$b;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lokhttp3/j0$b;Ljava/lang/String;Lokhttp3/d0;ILjava/lang/Object;)Lokhttp3/j0;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/j0$b;->create(Ljava/lang/String;Lokhttp3/d0;)Lokhttp3/j0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lokhttp3/j0$b;Lv7/l;Lokhttp3/d0;JILjava/lang/Object;)Lokhttp3/j0;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const-wide/16 p3, -0x1

    .line 4
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lokhttp3/j0$b;->create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lokhttp3/j0$b;Lv7/m;Lokhttp3/d0;ILjava/lang/Object;)Lokhttp3/j0;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 3
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/j0$b;->create(Lv7/m;Lokhttp3/d0;)Lokhttp3/j0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lokhttp3/j0$b;[BLokhttp3/d0;ILjava/lang/Object;)Lokhttp3/j0;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/j0$b;->create([BLokhttp3/d0;)Lokhttp3/j0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/String;Lokhttp3/d0;)Lokhttp3/j0;
    .locals 4

    const-string v0, "<this>"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    sget-object v0, Lh7/a;->a:Ljava/nio/charset/Charset;

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2
    invoke-static {p2, v2, v1, v2}, Lokhttp3/d0;->charset$default(Lokhttp3/d0;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/nio/charset/Charset;

    move-result-object v1

    if-nez v1, :cond_0

    .line 3
    sget-object v1, Lokhttp3/d0;->Companion:Lokhttp3/d0$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; charset=utf-8"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lokhttp3/d0$a;->parse(Ljava/lang/String;)Lokhttp3/d0;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 4
    :cond_1
    :goto_0
    new-instance v1, Lv7/j;

    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    const-string v2, "charset"

    invoke-static {v2, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 8
    invoke-virtual {v1, p1, v2, v3, v0}, Lv7/j;->P(Ljava/lang/String;IILjava/nio/charset/Charset;)V

    .line 9
    iget-wide v2, v1, Lv7/j;->k:J

    .line 10
    invoke-virtual {p0, v1, p2, v2, v3}, Lokhttp3/j0$b;->create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lokhttp3/d0;JLv7/l;)Lokhttp3/j0;
    .locals 1

    const-string v0, "content"

    invoke-static {v0, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    invoke-virtual {p0, p4, p1, p2, p3}, Lokhttp3/j0$b;->create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lokhttp3/d0;Ljava/lang/String;)Lokhttp3/j0;
    .locals 1

    const-string v0, "content"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    invoke-virtual {p0, p2, p1}, Lokhttp3/j0$b;->create(Ljava/lang/String;Lokhttp3/d0;)Lokhttp3/j0;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lokhttp3/d0;Lv7/m;)Lokhttp3/j0;
    .locals 1

    const-string v0, "content"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    invoke-virtual {p0, p2, p1}, Lokhttp3/j0$b;->create(Lv7/m;Lokhttp3/d0;)Lokhttp3/j0;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lokhttp3/d0;[B)Lokhttp3/j0;
    .locals 1

    const-string v0, "content"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    invoke-virtual {p0, p2, p1}, Lokhttp3/j0$b;->create([BLokhttp3/d0;)Lokhttp3/j0;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    new-instance v0, Lokhttp3/j0$b$a;

    invoke-direct {v0, p2, p3, p4, p1}, Lokhttp3/j0$b$a;-><init>(Lokhttp3/d0;JLv7/l;)V

    return-object v0
.end method

.method public final create(Lv7/m;Lokhttp3/d0;)Lokhttp3/j0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    new-instance v0, Lv7/j;

    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {v0, p1}, Lv7/j;->J(Lv7/m;)V

    .line 18
    invoke-virtual {p1}, Lv7/m;->d()I

    move-result p1

    int-to-long v1, p1

    .line 19
    invoke-virtual {p0, v0, p2, v1, v2}, Lokhttp3/j0$b;->create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;

    move-result-object p1

    return-object p1
.end method

.method public final create([BLokhttp3/d0;)Lokhttp3/j0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    new-instance v0, Lv7/j;

    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-virtual {v0, p1}, Lv7/j;->write([B)V

    .line 14
    array-length p1, p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, Lokhttp3/j0$b;->create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;

    move-result-object p1

    return-object p1
.end method
