.class public final enum Lcom/exotv/net/model/ResolverKind;
.super Ljava/lang/Enum;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/exotv/net/model/ResolverKind;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Ls6/a;

.field private static final synthetic $VALUES:[Lcom/exotv/net/model/ResolverKind;

.field public static final enum BACKUP:Lcom/exotv/net/model/ResolverKind;

.field public static final enum DEFAULT:Lcom/exotv/net/model/ResolverKind;

.field public static final enum GEN:Lcom/exotv/net/model/ResolverKind;

.field public static final enum O:Lcom/exotv/net/model/ResolverKind;

.field public static final enum YTV:Lcom/exotv/net/model/ResolverKind;


# direct methods
.method private static final synthetic $values()[Lcom/exotv/net/model/ResolverKind;
    .locals 5

    .line 1
    sget-object v0, Lcom/exotv/net/model/ResolverKind;->BACKUP:Lcom/exotv/net/model/ResolverKind;

    .line 2
    .line 3
    sget-object v1, Lcom/exotv/net/model/ResolverKind;->YTV:Lcom/exotv/net/model/ResolverKind;

    .line 4
    .line 5
    sget-object v2, Lcom/exotv/net/model/ResolverKind;->O:Lcom/exotv/net/model/ResolverKind;

    .line 6
    .line 7
    sget-object v3, Lcom/exotv/net/model/ResolverKind;->GEN:Lcom/exotv/net/model/ResolverKind;

    .line 8
    .line 9
    sget-object v4, Lcom/exotv/net/model/ResolverKind;->DEFAULT:Lcom/exotv/net/model/ResolverKind;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/exotv/net/model/ResolverKind;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/exotv/net/model/ResolverKind;

    .line 2
    .line 3
    const-string v1, "BACKUP"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/exotv/net/model/ResolverKind;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/exotv/net/model/ResolverKind;->BACKUP:Lcom/exotv/net/model/ResolverKind;

    .line 10
    .line 11
    new-instance v0, Lcom/exotv/net/model/ResolverKind;

    .line 12
    .line 13
    const-string v1, "YTV"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/exotv/net/model/ResolverKind;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/exotv/net/model/ResolverKind;->YTV:Lcom/exotv/net/model/ResolverKind;

    .line 20
    .line 21
    new-instance v0, Lcom/exotv/net/model/ResolverKind;

    .line 22
    .line 23
    const-string v1, "O"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/exotv/net/model/ResolverKind;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/exotv/net/model/ResolverKind;->O:Lcom/exotv/net/model/ResolverKind;

    .line 30
    .line 31
    new-instance v0, Lcom/exotv/net/model/ResolverKind;

    .line 32
    .line 33
    const-string v1, "GEN"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/exotv/net/model/ResolverKind;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/exotv/net/model/ResolverKind;->GEN:Lcom/exotv/net/model/ResolverKind;

    .line 40
    .line 41
    new-instance v0, Lcom/exotv/net/model/ResolverKind;

    .line 42
    .line 43
    const-string v1, "DEFAULT"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/exotv/net/model/ResolverKind;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/exotv/net/model/ResolverKind;->DEFAULT:Lcom/exotv/net/model/ResolverKind;

    .line 50
    .line 51
    invoke-static {}, Lcom/exotv/net/model/ResolverKind;->$values()[Lcom/exotv/net/model/ResolverKind;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/exotv/net/model/ResolverKind;->$VALUES:[Lcom/exotv/net/model/ResolverKind;

    .line 56
    .line 57
    invoke-static {v0}, Landroid/support/v4/media/session/b;->q([Ljava/lang/Enum;)Ls6/b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/exotv/net/model/ResolverKind;->$ENTRIES:Ls6/a;

    .line 62
    .line 63
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getEntries()Ls6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls6/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/exotv/net/model/ResolverKind;->$ENTRIES:Ls6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/exotv/net/model/ResolverKind;
    .locals 1

    .line 1
    const-class v0, Lcom/exotv/net/model/ResolverKind;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/exotv/net/model/ResolverKind;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/exotv/net/model/ResolverKind;
    .locals 1

    .line 1
    sget-object v0, Lcom/exotv/net/model/ResolverKind;->$VALUES:[Lcom/exotv/net/model/ResolverKind;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/exotv/net/model/ResolverKind;

    .line 8
    .line 9
    return-object v0
.end method
