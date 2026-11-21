.class public abstract Lokhttp3/internal/ws/d$d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/ws/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field private final client:Z

.field private final sink:Lv7/k;

.field private final source:Lv7/l;


# direct methods
.method public constructor <init>(ZLv7/l;Lv7/k;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sink"

    .line 7
    .line 8
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lokhttp3/internal/ws/d$d;->client:Z

    .line 15
    .line 16
    iput-object p2, p0, Lokhttp3/internal/ws/d$d;->source:Lv7/l;

    .line 17
    .line 18
    iput-object p3, p0, Lokhttp3/internal/ws/d$d;->sink:Lv7/k;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final getClient()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/ws/d$d;->client:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSink()Lv7/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d$d;->sink:Lv7/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSource()Lv7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d$d;->source:Lv7/l;

    .line 2
    .line 3
    return-object v0
.end method
