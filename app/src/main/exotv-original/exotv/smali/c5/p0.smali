.class public final Lc5/p0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc5/p0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/p0;->k:Ljava/util/Comparator;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget v0, p0, Lc5/p0;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/p0;->k:Ljava/util/Comparator;

    .line 7
    .line 8
    check-cast v0, Lx4/q;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lx4/q;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p2, Ll6/d;

    .line 18
    .line 19
    iget-object p2, p2, Ll6/d;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, Lx4/t;

    .line 22
    .line 23
    iget p2, p2, Lx4/t;->g:I

    .line 24
    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p1, Ll6/d;

    .line 30
    .line 31
    iget-object p1, p1, Ll6/d;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lx4/t;

    .line 34
    .line 35
    iget p1, p1, Lx4/t;->g:I

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p2, p1}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :goto_0
    return v0

    .line 46
    :pswitch_0
    iget-object v0, p0, Lc5/p0;->k:Ljava/util/Comparator;

    .line 47
    .line 48
    check-cast v0, Lc5/p0;

    .line 49
    .line 50
    invoke-virtual {v0, p1, p2}, Lc5/p0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    check-cast p2, Lorg/json/JSONObject;

    .line 58
    .line 59
    const-string v0, "width"

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p1, Lorg/json/JSONObject;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p2, p1}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    :goto_1
    return v0

    .line 84
    :pswitch_1
    iget-object v0, p0, Lc5/p0;->k:Ljava/util/Comparator;

    .line 85
    .line 86
    check-cast v0, Lc5/o0;

    .line 87
    .line 88
    invoke-virtual {v0, p1, p2}, Lc5/o0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    check-cast p2, Lorg/json/JSONObject;

    .line 96
    .line 97
    const-string v0, "vote_average"

    .line 98
    .line 99
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 100
    .line 101
    .line 102
    move-result-wide v1

    .line 103
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p1, Lorg/json/JSONObject;

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p2, p1}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    :goto_2
    return v0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
