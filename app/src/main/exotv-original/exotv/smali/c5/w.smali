.class public final enum Lc5/w;
.super Ljava/lang/Enum;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final enum m:Lc5/w;

.field public static final enum n:Lc5/w;

.field public static final enum o:Lc5/w;

.field public static final enum p:Lc5/w;

.field public static final synthetic q:[Lc5/w;

.field public static final synthetic r:Ls6/b;


# instance fields
.field public final j:I

.field public final k:I

.field public final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lc5/w;

    .line 2
    .line 3
    const v4, 0x7f080108

    .line 4
    .line 5
    .line 6
    const v5, 0x3f6b851f    # 0.92f

    .line 7
    .line 8
    .line 9
    const-string v1, "LIVE"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const v3, 0x7f110136

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Lc5/w;-><init>(Ljava/lang/String;IIIF)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lc5/w;->m:Lc5/w;

    .line 19
    .line 20
    new-instance v1, Lc5/w;

    .line 21
    .line 22
    const v5, 0x7f080109

    .line 23
    .line 24
    .line 25
    const/high16 v6, 0x3f800000    # 1.0f

    .line 26
    .line 27
    const-string v2, "MOVIES"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const v4, 0x7f110137

    .line 31
    .line 32
    .line 33
    invoke-direct/range {v1 .. v6}, Lc5/w;-><init>(Ljava/lang/String;IIIF)V

    .line 34
    .line 35
    .line 36
    sput-object v1, Lc5/w;->n:Lc5/w;

    .line 37
    .line 38
    new-instance v2, Lc5/w;

    .line 39
    .line 40
    const v6, 0x7f08010b

    .line 41
    .line 42
    .line 43
    const v7, 0x3f8ccccd    # 1.1f

    .line 44
    .line 45
    .line 46
    const-string v3, "SERIES"

    .line 47
    .line 48
    const/4 v4, 0x2

    .line 49
    const v5, 0x7f110139

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v2 .. v7}, Lc5/w;-><init>(Ljava/lang/String;IIIF)V

    .line 53
    .line 54
    .line 55
    sput-object v2, Lc5/w;->o:Lc5/w;

    .line 56
    .line 57
    new-instance v3, Lc5/w;

    .line 58
    .line 59
    const v7, 0x7f08010a

    .line 60
    .line 61
    .line 62
    const v8, 0x3f6b851f    # 0.92f

    .line 63
    .line 64
    .line 65
    const-string v4, "SEARCH"

    .line 66
    .line 67
    const/4 v5, 0x3

    .line 68
    const v6, 0x7f110138

    .line 69
    .line 70
    .line 71
    invoke-direct/range {v3 .. v8}, Lc5/w;-><init>(Ljava/lang/String;IIIF)V

    .line 72
    .line 73
    .line 74
    sput-object v3, Lc5/w;->p:Lc5/w;

    .line 75
    .line 76
    filled-new-array {v0, v1, v2, v3}, [Lc5/w;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, Lc5/w;->q:[Lc5/w;

    .line 81
    .line 82
    invoke-static {v0}, Landroid/support/v4/media/session/b;->q([Ljava/lang/Enum;)Ls6/b;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, Lc5/w;->r:Ls6/b;

    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lc5/w;->j:I

    .line 5
    .line 6
    iput p4, p0, Lc5/w;->k:I

    .line 7
    .line 8
    iput p5, p0, Lc5/w;->l:F

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc5/w;
    .locals 1

    .line 1
    const-class v0, Lc5/w;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lc5/w;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lc5/w;
    .locals 1

    .line 1
    sget-object v0, Lc5/w;->q:[Lc5/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lc5/w;

    .line 8
    .line 9
    return-object v0
.end method
