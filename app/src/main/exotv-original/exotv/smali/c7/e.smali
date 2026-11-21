.class public abstract Lc7/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final j:Lc7/d;

.field public static final k:Lc7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc7/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc7/e;->j:Lc7/d;

    .line 7
    .line 8
    sget-object v0, Lv6/a;->a:Ljava/lang/Integer;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x22

    .line 17
    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lc7/c;

    .line 22
    .line 23
    invoke-direct {v0}, Lc7/c;-><init>()V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    new-instance v0, Ld7/a;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    :goto_1
    sput-object v0, Lc7/e;->k:Lc7/a;

    .line 33
    .line 34
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
.method public abstract a(I)I
.end method

.method public abstract b()J
.end method

.method public c()J
    .locals 6

    .line 1
    :cond_0
    invoke-virtual {p0}, Lc7/e;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, 0x1

    .line 6
    ushr-long/2addr v0, v2

    .line 7
    const-wide/16 v2, 0xfa1

    .line 8
    .line 9
    rem-long v2, v0, v2

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    const-wide/16 v4, 0xfa0

    .line 13
    .line 14
    add-long/2addr v0, v4

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v0, v0, v4

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    const-wide/16 v0, 0x2ee0

    .line 22
    .line 23
    add-long/2addr v0, v2

    .line 24
    return-wide v0
.end method
