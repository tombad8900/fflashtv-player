.class public final Landroidx/media3/common/audio/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:[F


# direct methods
.method public constructor <init>(II[F)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    :goto_0
    const-string v3, "Input channel count must be positive."

    .line 12
    .line 13
    invoke-static {v3, v2}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    if-lez p2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v2, v0

    .line 21
    :goto_1
    const-string v3, "Output channel count must be positive."

    .line 22
    .line 23
    invoke-static {v3, v2}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    array-length v2, p3

    .line 27
    mul-int v3, p1, p2

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    move v2, v1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v2, v0

    .line 34
    :goto_2
    const-string v3, "Coefficient array length is invalid."

    .line 35
    .line 36
    invoke-static {v3, v2}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    iput p1, p0, Landroidx/media3/common/audio/g;->a:I

    .line 40
    .line 41
    iput p2, p0, Landroidx/media3/common/audio/g;->b:I

    .line 42
    .line 43
    move v2, v0

    .line 44
    :goto_3
    array-length v3, p3

    .line 45
    if-ge v2, v3, :cond_4

    .line 46
    .line 47
    aget v3, p3, v2

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    cmpg-float v3, v3, v4

    .line 51
    .line 52
    if-ltz v3, :cond_3

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string p2, "Coefficient at index "

    .line 60
    .line 61
    const-string p3, " is negative."

    .line 62
    .line 63
    invoke-static {p2, v2, p3}, La1/a1;->j(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_4
    iput-object p3, p0, Landroidx/media3/common/audio/g;->c:[F

    .line 72
    .line 73
    move p3, v0

    .line 74
    :goto_4
    if-ge p3, p1, :cond_7

    .line 75
    .line 76
    move v2, v0

    .line 77
    :goto_5
    if-ge v2, p2, :cond_6

    .line 78
    .line 79
    iget-object v3, p0, Landroidx/media3/common/audio/g;->c:[F

    .line 80
    .line 81
    iget v4, p0, Landroidx/media3/common/audio/g;->b:I

    .line 82
    .line 83
    mul-int/2addr v4, p3

    .line 84
    add-int/2addr v4, v2

    .line 85
    aget v3, v3, v4

    .line 86
    .line 87
    if-ne p3, v2, :cond_5

    .line 88
    .line 89
    move v4, v1

    .line 90
    goto :goto_6

    .line 91
    :cond_5
    move v4, v0

    .line 92
    :goto_6
    const/high16 v5, 0x3f800000    # 1.0f

    .line 93
    .line 94
    cmpl-float v3, v3, v5

    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_6
    add-int/lit8 p3, p3, 0x1

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    return-void
.end method
