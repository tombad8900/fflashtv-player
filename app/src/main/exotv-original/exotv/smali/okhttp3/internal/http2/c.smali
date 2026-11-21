.class public final Lokhttp3/internal/http2/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/c$a;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/internal/http2/c$a;

.field public static final PSEUDO_PREFIX:Lv7/m;

.field public static final RESPONSE_STATUS:Lv7/m;

.field public static final RESPONSE_STATUS_UTF8:Ljava/lang/String; = ":status"

.field public static final TARGET_AUTHORITY:Lv7/m;

.field public static final TARGET_AUTHORITY_UTF8:Ljava/lang/String; = ":authority"

.field public static final TARGET_METHOD:Lv7/m;

.field public static final TARGET_METHOD_UTF8:Ljava/lang/String; = ":method"

.field public static final TARGET_PATH:Lv7/m;

.field public static final TARGET_PATH_UTF8:Ljava/lang/String; = ":path"

.field public static final TARGET_SCHEME:Lv7/m;

.field public static final TARGET_SCHEME_UTF8:Ljava/lang/String; = ":scheme"


# instance fields
.field public final hpackSize:I

.field public final name:Lv7/m;

.field public final value:Lv7/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/http2/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/http2/c$a;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/http2/c;->Companion:Lokhttp3/internal/http2/c$a;

    .line 8
    .line 9
    sget-object v0, Lv7/m;->m:Lv7/m;

    .line 10
    .line 11
    const-string v0, ":"

    .line 12
    .line 13
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lokhttp3/internal/http2/c;->PSEUDO_PREFIX:Lv7/m;

    .line 18
    .line 19
    const-string v0, ":status"

    .line 20
    .line 21
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lokhttp3/internal/http2/c;->RESPONSE_STATUS:Lv7/m;

    .line 26
    .line 27
    const-string v0, ":method"

    .line 28
    .line 29
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lokhttp3/internal/http2/c;->TARGET_METHOD:Lv7/m;

    .line 34
    .line 35
    const-string v0, ":path"

    .line 36
    .line 37
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lokhttp3/internal/http2/c;->TARGET_PATH:Lv7/m;

    .line 42
    .line 43
    const-string v0, ":scheme"

    .line 44
    .line 45
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lokhttp3/internal/http2/c;->TARGET_SCHEME:Lv7/m;

    .line 50
    .line 51
    const-string v0, ":authority"

    .line 52
    .line 53
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lokhttp3/internal/http2/c;->TARGET_AUTHORITY:Lv7/m;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    sget-object v0, Lv7/m;->m:Lv7/m;

    invoke-static {p1}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    move-result-object p1

    invoke-static {p2}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lokhttp3/internal/http2/c;-><init>(Lv7/m;Lv7/m;)V

    return-void
.end method

.method public constructor <init>(Lv7/m;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    sget-object v0, Lv7/m;->m:Lv7/m;

    invoke-static {p2}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lokhttp3/internal/http2/c;-><init>(Lv7/m;Lv7/m;)V

    return-void
.end method

.method public constructor <init>(Lv7/m;Lv7/m;)V
    .locals 1

    const-string v0, "name"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lokhttp3/internal/http2/c;->name:Lv7/m;

    .line 3
    iput-object p2, p0, Lokhttp3/internal/http2/c;->value:Lv7/m;

    .line 4
    invoke-virtual {p1}, Lv7/m;->d()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lv7/m;->d()I

    move-result p2

    add-int/2addr p2, p1

    .line 5
    iput p2, p0, Lokhttp3/internal/http2/c;->hpackSize:I

    return-void
.end method

.method public static synthetic copy$default(Lokhttp3/internal/http2/c;Lv7/m;Lv7/m;ILjava/lang/Object;)Lokhttp3/internal/http2/c;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lokhttp3/internal/http2/c;->name:Lv7/m;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lokhttp3/internal/http2/c;->value:Lv7/m;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lokhttp3/internal/http2/c;->copy(Lv7/m;Lv7/m;)Lokhttp3/internal/http2/c;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Lv7/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/c;->name:Lv7/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Lv7/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/c;->value:Lv7/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lv7/m;Lv7/m;)Lokhttp3/internal/http2/c;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lokhttp3/internal/http2/c;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lokhttp3/internal/http2/c;-><init>(Lv7/m;Lv7/m;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lokhttp3/internal/http2/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lokhttp3/internal/http2/c;

    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/internal/http2/c;->name:Lv7/m;

    .line 14
    .line 15
    iget-object v3, p1, Lokhttp3/internal/http2/c;->name:Lv7/m;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lokhttp3/internal/http2/c;->value:Lv7/m;

    .line 25
    .line 26
    iget-object p1, p1, Lokhttp3/internal/http2/c;->value:Lv7/m;

    .line 27
    .line 28
    invoke-static {v1, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/c;->name:Lv7/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/m;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lokhttp3/internal/http2/c;->value:Lv7/m;

    .line 10
    .line 11
    invoke-virtual {v1}, Lv7/m;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/internal/http2/c;->name:Lv7/m;

    .line 7
    .line 8
    invoke-virtual {v1}, Lv7/m;->q()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lokhttp3/internal/http2/c;->value:Lv7/m;

    .line 21
    .line 22
    invoke-virtual {v1}, Lv7/m;->q()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method
