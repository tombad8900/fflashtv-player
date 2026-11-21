.class public final enum Lh7/g;
.super Ljava/lang/Enum;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh7/c;


# static fields
.field public static final enum k:Lh7/g;

.field public static final synthetic l:[Lh7/g;


# instance fields
.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lh7/g;

    .line 2
    .line 3
    const-string v1, "IGNORE_CASE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lh7/g;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lh7/g;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    const-string v4, "MULTILINE"

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    invoke-direct {v1, v4, v5, v2}, Lh7/g;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lh7/g;

    .line 21
    .line 22
    const-string v4, "LITERAL"

    .line 23
    .line 24
    const/16 v6, 0x10

    .line 25
    .line 26
    invoke-direct {v2, v4, v3, v6}, Lh7/g;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lh7/g;

    .line 30
    .line 31
    const-string v4, "UNIX_LINES"

    .line 32
    .line 33
    const/4 v6, 0x3

    .line 34
    invoke-direct {v3, v4, v6, v5}, Lh7/g;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lh7/g;

    .line 38
    .line 39
    const-string v5, "COMMENTS"

    .line 40
    .line 41
    const/4 v6, 0x4

    .line 42
    invoke-direct {v4, v5, v6, v6}, Lh7/g;-><init>(Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    new-instance v5, Lh7/g;

    .line 46
    .line 47
    const/4 v6, 0x5

    .line 48
    const/16 v7, 0x20

    .line 49
    .line 50
    const-string v8, "DOT_MATCHES_ALL"

    .line 51
    .line 52
    invoke-direct {v5, v8, v6, v7}, Lh7/g;-><init>(Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    sput-object v5, Lh7/g;->k:Lh7/g;

    .line 56
    .line 57
    new-instance v6, Lh7/g;

    .line 58
    .line 59
    const/4 v7, 0x6

    .line 60
    const/16 v8, 0x80

    .line 61
    .line 62
    const-string v9, "CANON_EQ"

    .line 63
    .line 64
    invoke-direct {v6, v9, v7, v8}, Lh7/g;-><init>(Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    filled-new-array/range {v0 .. v6}, [Lh7/g;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lh7/g;->l:[Lh7/g;

    .line 72
    .line 73
    invoke-static {v0}, Landroid/support/v4/media/session/b;->q([Ljava/lang/Enum;)Ls6/b;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lh7/g;->j:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lh7/g;
    .locals 1

    .line 1
    const-class v0, Lh7/g;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lh7/g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lh7/g;
    .locals 1

    .line 1
    sget-object v0, Lh7/g;->l:[Lh7/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lh7/g;

    .line 8
    .line 9
    return-object v0
.end method
