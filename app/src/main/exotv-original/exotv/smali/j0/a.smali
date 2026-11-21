.class public final synthetic Lj0/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj0/a;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lj0/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw2/b0;

    .line 7
    .line 8
    check-cast p2, Lw2/b0;

    .line 9
    .line 10
    iget v0, p2, Lw2/b0;->a:I

    .line 11
    .line 12
    iget v1, p1, Lw2/b0;->a:I

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p2, Lw2/b0;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, Lw2/b0;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p2, p2, Lw2/b0;->d:Ljava/lang/String;

    .line 33
    .line 34
    iget-object p1, p1, Lw2/b0;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    return v0

    .line 41
    :pswitch_0
    check-cast p1, Lw2/b0;

    .line 42
    .line 43
    check-cast p2, Lw2/b0;

    .line 44
    .line 45
    iget v0, p2, Lw2/b0;->b:I

    .line 46
    .line 47
    iget v1, p1, Lw2/b0;->b:I

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-object v0, p1, Lw2/b0;->c:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, p2, Lw2/b0;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    iget-object p1, p1, Lw2/b0;->d:Ljava/lang/String;

    .line 68
    .line 69
    iget-object p2, p2, Lw2/b0;->d:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :goto_1
    return v0

    .line 76
    :pswitch_1
    check-cast p1, Ls2/c;

    .line 77
    .line 78
    check-cast p2, Ls2/c;

    .line 79
    .line 80
    iget-wide v0, p1, Ls2/c;->b:J

    .line 81
    .line 82
    iget-wide p1, p2, Ls2/c;->b:J

    .line 83
    .line 84
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    return p1

    .line 89
    :pswitch_2
    check-cast p1, Ls2/d;

    .line 90
    .line 91
    check-cast p2, Ls2/d;

    .line 92
    .line 93
    iget-object p1, p1, Ls2/d;->a:Ls2/e;

    .line 94
    .line 95
    iget p1, p1, Ls2/e;->b:I

    .line 96
    .line 97
    iget-object p2, p2, Ls2/d;->a:Ls2/e;

    .line 98
    .line 99
    iget p2, p2, Ls2/e;->b:I

    .line 100
    .line 101
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    return p1

    .line 106
    :pswitch_3
    check-cast p1, Ll2/d;

    .line 107
    .line 108
    check-cast p2, Ll2/d;

    .line 109
    .line 110
    iget p2, p2, Ll2/d;->b:I

    .line 111
    .line 112
    iget p1, p1, Ll2/d;->b:I

    .line 113
    .line 114
    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    return p1

    .line 119
    :pswitch_4
    check-cast p1, [B

    .line 120
    .line 121
    check-cast p2, [B

    .line 122
    .line 123
    array-length v0, p1

    .line 124
    array-length v1, p2

    .line 125
    if-eq v0, v1, :cond_4

    .line 126
    .line 127
    array-length p1, p1

    .line 128
    array-length p2, p2

    .line 129
    sub-int/2addr p1, p2

    .line 130
    goto :goto_3

    .line 131
    :cond_4
    const/4 v0, 0x0

    .line 132
    move v1, v0

    .line 133
    :goto_2
    array-length v2, p1

    .line 134
    if-ge v1, v2, :cond_6

    .line 135
    .line 136
    aget-byte v2, p1, v1

    .line 137
    .line 138
    aget-byte v3, p2, v1

    .line 139
    .line 140
    if-eq v2, v3, :cond_5

    .line 141
    .line 142
    sub-int p1, v2, v3

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    move p1, v0

    .line 149
    :goto_3
    return p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
