.class public final enum Ly3/i;
.super Ljava/lang/Enum;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final enum j:Ly3/i;

.field public static final synthetic k:[Ly3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ly3/i;

    .line 2
    .line 3
    const-string v1, "SRGB"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ly3/i;

    .line 10
    .line 11
    const-string v2, "DISPLAY_P3"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ly3/i;->j:Ly3/i;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ly3/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Ly3/i;->k:[Ly3/i;

    .line 24
    .line 25
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly3/i;
    .locals 1

    .line 1
    const-class v0, Ly3/i;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ly3/i;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ly3/i;
    .locals 1

    .line 1
    sget-object v0, Ly3/i;->k:[Ly3/i;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ly3/i;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ly3/i;

    .line 8
    .line 9
    return-object v0
.end method
