.class public final enum Lz4/l;
.super Ljava/lang/Enum;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final enum j:Lz4/l;

.field public static final enum k:Lz4/l;

.field public static final synthetic l:[Lz4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lz4/l;

    .line 2
    .line 3
    const-string v1, "RATE_LIMITED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lz4/l;->j:Lz4/l;

    .line 10
    .line 11
    new-instance v1, Lz4/l;

    .line 12
    .line 13
    const-string v2, "NOT_FOUND"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lz4/l;->k:Lz4/l;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lz4/l;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lz4/l;->l:[Lz4/l;

    .line 26
    .line 27
    invoke-static {v0}, Landroid/support/v4/media/session/b;->q([Ljava/lang/Enum;)Ls6/b;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lz4/l;
    .locals 1

    .line 1
    const-class v0, Lz4/l;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lz4/l;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lz4/l;
    .locals 1

    .line 1
    sget-object v0, Lz4/l;->l:[Lz4/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lz4/l;

    .line 8
    .line 9
    return-object v0
.end method
