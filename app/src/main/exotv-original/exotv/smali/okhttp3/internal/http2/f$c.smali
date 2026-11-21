.class public abstract Lokhttp3/internal/http2/f$c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/f$c$b;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/internal/http2/f$c$b;

.field public static final REFUSE_INCOMING_STREAMS:Lokhttp3/internal/http2/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/http2/f$c$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/http2/f$c$b;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/http2/f$c;->Companion:Lokhttp3/internal/http2/f$c$b;

    .line 8
    .line 9
    new-instance v0, Lokhttp3/internal/http2/f$c$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lokhttp3/internal/http2/f$c$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lokhttp3/internal/http2/f$c;->REFUSE_INCOMING_STREAMS:Lokhttp3/internal/http2/f$c;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onSettings(Lokhttp3/internal/http2/f;Lokhttp3/internal/http2/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "settings"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract onStream(Lokhttp3/internal/http2/j;)V
.end method
