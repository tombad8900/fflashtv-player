.class public final Lokhttp3/internal/ws/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/ws/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final cancelAfterCloseMillis:J

.field private final code:I

.field private final reason:Lv7/m;


# direct methods
.method public constructor <init>(ILv7/m;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lokhttp3/internal/ws/d$a;->code:I

    .line 5
    .line 6
    iput-object p2, p0, Lokhttp3/internal/ws/d$a;->reason:Lv7/m;

    .line 7
    .line 8
    iput-wide p3, p0, Lokhttp3/internal/ws/d$a;->cancelAfterCloseMillis:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getCancelAfterCloseMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/ws/d$a;->cancelAfterCloseMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCode()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/internal/ws/d$a;->code:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReason()Lv7/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/d$a;->reason:Lv7/m;

    .line 2
    .line 3
    return-object v0
.end method
