.class public abstract Li1/p;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:[B

.field public static final b:[F

.field public static final c:Ljava/lang/Object;

.field public static d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Li1/p;->a:[B

    .line 8
    .line 9
    const/16 v0, 0x11

    .line 10
    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    fill-array-data v0, :array_1

    .line 14
    .line 15
    .line 16
    sput-object v0, Li1/p;->b:[F

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Li1/p;->c:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    sput-object v0, Li1/p;->d:[I

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 34
    .line 35
    .line 36
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static a([Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aput-boolean v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aput-boolean v0, p0, v1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    aput-boolean v0, p0, v1

    .line 9
    .line 10
    return-void
.end method

.method public static b([BII[Z)I
    .locals 8

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    invoke-static {v3}, Lh1/a;->j(Z)V

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return p2

    .line 16
    :cond_1
    aget-boolean v3, p3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-static {p3}, Li1/p;->a([Z)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x3

    .line 24
    .line 25
    return p1

    .line 26
    :cond_2
    const/4 v3, 0x2

    .line 27
    if-le v0, v2, :cond_3

    .line 28
    .line 29
    aget-boolean v4, p3, v2

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    aget-byte v4, p0, p1

    .line 34
    .line 35
    if-ne v4, v2, :cond_3

    .line 36
    .line 37
    invoke-static {p3}, Li1/p;->a([Z)V

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v3

    .line 41
    return p1

    .line 42
    :cond_3
    if-le v0, v3, :cond_4

    .line 43
    .line 44
    aget-boolean v4, p3, v3

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    aget-byte v4, p0, p1

    .line 49
    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, p1, 0x1

    .line 53
    .line 54
    aget-byte v4, p0, v4

    .line 55
    .line 56
    if-ne v4, v2, :cond_4

    .line 57
    .line 58
    invoke-static {p3}, Li1/p;->a([Z)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p1, v2

    .line 62
    return p1

    .line 63
    :cond_4
    add-int/lit8 v4, p2, -0x1

    .line 64
    .line 65
    add-int/2addr p1, v3

    .line 66
    :goto_1
    if-ge p1, v4, :cond_7

    .line 67
    .line 68
    aget-byte v5, p0, p1

    .line 69
    .line 70
    and-int/lit16 v6, v5, 0xfe

    .line 71
    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    add-int/lit8 v6, p1, -0x2

    .line 76
    .line 77
    aget-byte v7, p0, v6

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    add-int/lit8 v7, p1, -0x1

    .line 82
    .line 83
    aget-byte v7, p0, v7

    .line 84
    .line 85
    if-nez v7, :cond_6

    .line 86
    .line 87
    if-ne v5, v2, :cond_6

    .line 88
    .line 89
    invoke-static {p3}, Li1/p;->a([Z)V

    .line 90
    .line 91
    .line 92
    return v6

    .line 93
    :cond_6
    add-int/lit8 p1, p1, -0x2

    .line 94
    .line 95
    :goto_2
    add-int/lit8 p1, p1, 0x3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    if-le v0, v3, :cond_9

    .line 99
    .line 100
    add-int/lit8 p1, p2, -0x3

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    add-int/lit8 p1, p2, -0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    aget-byte p1, p0, v4

    .line 113
    .line 114
    if-ne p1, v2, :cond_8

    .line 115
    .line 116
    :goto_3
    move p1, v2

    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move p1, v1

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-ne v0, v3, :cond_a

    .line 121
    .line 122
    aget-boolean p1, p3, v3

    .line 123
    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    add-int/lit8 p1, p2, -0x2

    .line 127
    .line 128
    aget-byte p1, p0, p1

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    aget-byte p1, p0, v4

    .line 133
    .line 134
    if-ne p1, v2, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_a
    aget-boolean p1, p3, v2

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    aget-byte p1, p0, v4

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_4
    aput-boolean p1, p3, v1

    .line 147
    .line 148
    if-le v0, v2, :cond_c

    .line 149
    .line 150
    add-int/lit8 p1, p2, -0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    if-nez p1, :cond_b

    .line 155
    .line 156
    aget-byte p1, p0, v4

    .line 157
    .line 158
    if-nez p1, :cond_b

    .line 159
    .line 160
    :goto_5
    move p1, v2

    .line 161
    goto :goto_6

    .line 162
    :cond_b
    move p1, v1

    .line 163
    goto :goto_6

    .line 164
    :cond_c
    aget-boolean p1, p3, v3

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    aget-byte p1, p0, v4

    .line 169
    .line 170
    if-nez p1, :cond_b

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_6
    aput-boolean p1, p3, v2

    .line 174
    .line 175
    aget-byte p0, p0, v4

    .line 176
    .line 177
    if-nez p0, :cond_d

    .line 178
    .line 179
    move v1, v2

    .line 180
    :cond_d
    aput-boolean v1, p3, v3

    .line 181
    .line 182
    return p2
.end method

.method public static c(B)Z
    .locals 3

    .line 1
    and-int/lit8 v0, p0, 0x60

    .line 2
    .line 3
    shr-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    and-int/lit8 p0, p0, 0x1f

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-ne p0, v1, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    const/16 v2, 0x9

    .line 16
    .line 17
    if-ne p0, v2, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    const/16 v2, 0xe

    .line 21
    .line 22
    if-ne p0, v2, :cond_3

    .line 23
    .line 24
    return v0

    .line 25
    :cond_3
    return v1
.end method

.method public static d(Lh1/v;)Landroidx/media3/common/p;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh1/v;->u()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    invoke-virtual {p0, v0}, Lh1/v;->k(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Lh1/v;->k(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-virtual {p0, v2}, Lh1/v;->k(I)I

    .line 15
    .line 16
    .line 17
    new-instance p0, Landroidx/media3/common/p;

    .line 18
    .line 19
    invoke-direct {p0, v1, v0}, Landroidx/media3/common/p;-><init>(II)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static e(Lh1/v;ZILi1/h;)Li1/h;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    new-array v4, v3, [I

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0, v5}, Lh1/v;->k(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Lh1/v;->j()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    const/4 v9, 0x5

    .line 25
    invoke-virtual {v0, v9}, Lh1/v;->k(I)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    move v10, v7

    .line 30
    move v11, v10

    .line 31
    :goto_0
    const/16 v12, 0x20

    .line 32
    .line 33
    if-ge v10, v12, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lh1/v;->j()Z

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    if-eqz v12, :cond_0

    .line 40
    .line 41
    const/4 v12, 0x1

    .line 42
    shl-int/2addr v12, v10

    .line 43
    or-int/2addr v11, v12

    .line 44
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v10, v7

    .line 48
    :goto_1
    if-ge v10, v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Lh1/v;->k(I)I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    aput v12, v4, v10

    .line 55
    .line 56
    add-int/lit8 v10, v10, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v13, v2

    .line 60
    :goto_2
    move-object/from16 v17, v4

    .line 61
    .line 62
    move v14, v8

    .line 63
    move v15, v9

    .line 64
    move/from16 v16, v11

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    if-eqz v2, :cond_4

    .line 68
    .line 69
    iget v3, v2, Li1/h;->a:I

    .line 70
    .line 71
    iget-boolean v8, v2, Li1/h;->b:Z

    .line 72
    .line 73
    iget v9, v2, Li1/h;->c:I

    .line 74
    .line 75
    iget v11, v2, Li1/h;->d:I

    .line 76
    .line 77
    iget-object v4, v2, Li1/h;->e:[I

    .line 78
    .line 79
    move v13, v3

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object/from16 v17, v4

    .line 82
    .line 83
    move v13, v7

    .line 84
    move v14, v13

    .line 85
    move v15, v14

    .line 86
    move/from16 v16, v15

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v0, v6}, Lh1/v;->k(I)I

    .line 89
    .line 90
    .line 91
    move-result v18

    .line 92
    move v2, v7

    .line 93
    :goto_4
    if-ge v7, v1, :cond_7

    .line 94
    .line 95
    invoke-virtual {v0}, Lh1/v;->j()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x58

    .line 102
    .line 103
    :cond_5
    invoke-virtual {v0}, Lh1/v;->j()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x8

    .line 110
    .line 111
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-virtual {v0, v2}, Lh1/v;->v(I)V

    .line 115
    .line 116
    .line 117
    if-lez v1, :cond_8

    .line 118
    .line 119
    sub-int/2addr v6, v1

    .line 120
    mul-int/2addr v6, v5

    .line 121
    invoke-virtual {v0, v6}, Lh1/v;->v(I)V

    .line 122
    .line 123
    .line 124
    :cond_8
    new-instance v12, Li1/h;

    .line 125
    .line 126
    invoke-direct/range {v12 .. v18}, Li1/h;-><init>(IZII[II)V

    .line 127
    .line 128
    .line 129
    return-object v12
.end method

.method public static f([BII)Li1/k;
    .locals 8

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    :goto_0
    aget-byte v0, p0, p2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-le p2, p1, :cond_0

    .line 10
    .line 11
    add-int/lit8 p2, p2, -0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-eqz v0, :cond_e

    .line 15
    .line 16
    if-gt p2, p1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_1
    new-instance v0, Lh1/v;

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0x1

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, p2}, Lh1/v;-><init>([BII)V

    .line 25
    .line 26
    .line 27
    :cond_2
    const/16 p0, 0x10

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lh1/v;->e(I)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_e

    .line 34
    .line 35
    const/16 p0, 0x8

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Lh1/v;->k(I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 p2, 0x0

    .line 42
    move v1, p2

    .line 43
    :goto_1
    const/16 v2, 0xff

    .line 44
    .line 45
    if-ne p1, v2, :cond_3

    .line 46
    .line 47
    add-int/lit16 v1, v1, 0xff

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lh1/v;->k(I)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    add-int/2addr v1, p1

    .line 55
    invoke-virtual {v0, p0}, Lh1/v;->k(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    move v3, p2

    .line 60
    :goto_2
    if-ne p1, v2, :cond_4

    .line 61
    .line 62
    add-int/lit16 v3, v3, 0xff

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Lh1/v;->k(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    add-int/2addr v3, p1

    .line 70
    if-eqz v3, :cond_e

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Lh1/v;->e(I)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_5
    const/16 p0, 0xb0

    .line 81
    .line 82
    if-ne v1, p0, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-virtual {v0}, Lh1/v;->j()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    goto :goto_3

    .line 99
    :cond_6
    move v1, p2

    .line 100
    :goto_3
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, -0x1

    .line 105
    move v4, p2

    .line 106
    :goto_4
    if-gt v4, v2, :cond_d

    .line 107
    .line 108
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 113
    .line 114
    .line 115
    const/4 v5, 0x6

    .line 116
    invoke-virtual {v0, v5}, Lh1/v;->k(I)I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    const/16 v7, 0x3f

    .line 121
    .line 122
    if-ne v6, v7, :cond_7

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_7
    if-nez v6, :cond_8

    .line 126
    .line 127
    add-int/lit8 v6, p0, -0x1e

    .line 128
    .line 129
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    goto :goto_5

    .line 134
    :cond_8
    add-int/2addr v6, p0

    .line 135
    add-int/lit8 v6, v6, -0x1f

    .line 136
    .line 137
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    :goto_5
    invoke-virtual {v0, v6}, Lh1/v;->k(I)I

    .line 142
    .line 143
    .line 144
    if-eqz p1, :cond_b

    .line 145
    .line 146
    invoke-virtual {v0, v5}, Lh1/v;->k(I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-ne v5, v7, :cond_9

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_9
    if-nez v5, :cond_a

    .line 154
    .line 155
    add-int/lit8 v5, v1, -0x1e

    .line 156
    .line 157
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    goto :goto_6

    .line 162
    :cond_a
    add-int/2addr v5, v1

    .line 163
    add-int/lit8 v5, v5, -0x1f

    .line 164
    .line 165
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    :goto_6
    invoke-virtual {v0, v5}, Lh1/v;->k(I)I

    .line 170
    .line 171
    .line 172
    :cond_b
    invoke-virtual {v0}, Lh1/v;->j()Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-eqz v5, :cond_c

    .line 177
    .line 178
    const/16 v5, 0xa

    .line 179
    .line 180
    invoke-virtual {v0, v5}, Lh1/v;->v(I)V

    .line 181
    .line 182
    .line 183
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_d
    new-instance p0, Li1/k;

    .line 187
    .line 188
    invoke-direct {p0, v3}, Li1/k;-><init>(I)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_e
    :goto_7
    const/4 p0, 0x0

    .line 193
    return-object p0
.end method

.method public static g([BIILa1/h;)Li1/l;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, Lh1/v;

    .line 10
    .line 11
    invoke-direct {v4, v0, v1, v2}, Lh1/v;-><init>([BII)V

    .line 12
    .line 13
    .line 14
    invoke-static {v4}, Li1/p;->d(Lh1/v;)Landroidx/media3/common/p;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v5, 0x2

    .line 19
    add-int/2addr v1, v5

    .line 20
    new-instance v6, Lh1/v;

    .line 21
    .line 22
    invoke-direct {v6, v0, v1, v2}, Lh1/v;-><init>([BII)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-virtual {v6, v0}, Lh1/v;->v(I)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v4, v4, Landroidx/media3/common/p;->b:I

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    const/4 v9, 0x7

    .line 40
    if-ne v2, v9, :cond_0

    .line 41
    .line 42
    move v9, v7

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v9, 0x0

    .line 45
    :goto_0
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-object v10, v3, La1/h;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v10, Lf6/m0;

    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    if-nez v11, :cond_1

    .line 56
    .line 57
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->size()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    sub-int/2addr v11, v7

    .line 62
    invoke-static {v4, v11}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Li1/g;

    .line 71
    .line 72
    iget v4, v4, Li1/g;->a:I

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v4, 0x0

    .line 76
    :goto_1
    const/4 v10, 0x0

    .line 77
    if-nez v9, :cond_3

    .line 78
    .line 79
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 80
    .line 81
    .line 82
    invoke-static {v6, v7, v2, v10}, Li1/p;->e(Lh1/v;ZILi1/h;)Li1/h;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    :cond_2
    :goto_2
    move-object v12, v10

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    if-eqz v3, :cond_2

    .line 89
    .line 90
    iget-object v11, v3, La1/h;->k:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v11, Li1/i;

    .line 93
    .line 94
    iget-object v12, v11, Li1/i;->b:[I

    .line 95
    .line 96
    iget-object v11, v11, Li1/i;->a:Lf6/m0;

    .line 97
    .line 98
    aget v12, v12, v4

    .line 99
    .line 100
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    if-le v13, v12, :cond_2

    .line 105
    .line 106
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, Li1/h;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :goto_3
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 114
    .line 115
    .line 116
    const/16 v10, 0x8

    .line 117
    .line 118
    const/4 v11, -0x1

    .line 119
    if-eqz v9, :cond_7

    .line 120
    .line 121
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    if-eqz v13, :cond_4

    .line 126
    .line 127
    invoke-virtual {v6, v10}, Lh1/v;->k(I)I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    goto :goto_4

    .line 132
    :cond_4
    move v13, v11

    .line 133
    :goto_4
    if-eqz v3, :cond_6

    .line 134
    .line 135
    iget-object v14, v3, La1/h;->l:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v14, Li1/i;

    .line 138
    .line 139
    if-eqz v14, :cond_6

    .line 140
    .line 141
    iget-object v15, v14, Li1/i;->a:Lf6/m0;

    .line 142
    .line 143
    if-ne v13, v11, :cond_5

    .line 144
    .line 145
    iget-object v13, v14, Li1/i;->b:[I

    .line 146
    .line 147
    aget v13, v13, v4

    .line 148
    .line 149
    :cond_5
    if-eq v13, v11, :cond_6

    .line 150
    .line 151
    invoke-virtual {v15}, Ljava/util/AbstractCollection;->size()I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-le v14, v13, :cond_6

    .line 156
    .line 157
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    check-cast v13, Li1/j;

    .line 162
    .line 163
    iget v14, v13, Li1/j;->a:I

    .line 164
    .line 165
    iget v14, v13, Li1/j;->d:I

    .line 166
    .line 167
    iget v15, v13, Li1/j;->e:I

    .line 168
    .line 169
    iget v11, v13, Li1/j;->b:I

    .line 170
    .line 171
    iget v13, v13, Li1/j;->c:I

    .line 172
    .line 173
    :goto_5
    move/from16 v29, v13

    .line 174
    .line 175
    move v13, v11

    .line 176
    move v11, v15

    .line 177
    move v15, v14

    .line 178
    move/from16 v14, v29

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_6
    const/4 v11, 0x0

    .line 182
    const/4 v13, 0x0

    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    goto :goto_9

    .line 186
    :cond_7
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    if-ne v11, v1, :cond_8

    .line 191
    .line 192
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 193
    .line 194
    .line 195
    :cond_8
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    if-eqz v15, :cond_c

    .line 208
    .line 209
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 214
    .line 215
    .line 216
    move-result v16

    .line 217
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 218
    .line 219
    .line 220
    move-result v17

    .line 221
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 222
    .line 223
    .line 224
    move-result v18

    .line 225
    if-eq v11, v7, :cond_a

    .line 226
    .line 227
    if-ne v11, v5, :cond_9

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_9
    move/from16 v19, v7

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_a
    :goto_6
    move/from16 v19, v5

    .line 234
    .line 235
    :goto_7
    add-int v15, v15, v16

    .line 236
    .line 237
    mul-int v15, v15, v19

    .line 238
    .line 239
    sub-int/2addr v13, v15

    .line 240
    if-ne v11, v7, :cond_b

    .line 241
    .line 242
    move v11, v5

    .line 243
    goto :goto_8

    .line 244
    :cond_b
    move v11, v7

    .line 245
    :goto_8
    add-int v17, v17, v18

    .line 246
    .line 247
    mul-int v17, v17, v11

    .line 248
    .line 249
    sub-int v14, v14, v17

    .line 250
    .line 251
    :cond_c
    move v15, v14

    .line 252
    move v14, v13

    .line 253
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    goto :goto_5

    .line 262
    :goto_9
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 263
    .line 264
    .line 265
    move-result v16

    .line 266
    if-nez v9, :cond_f

    .line 267
    .line 268
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 269
    .line 270
    .line 271
    move-result v17

    .line 272
    if-eqz v17, :cond_d

    .line 273
    .line 274
    const/16 v17, 0x0

    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_d
    move/from16 v17, v2

    .line 278
    .line 279
    :goto_a
    move/from16 v8, v17

    .line 280
    .line 281
    const/4 v10, -0x1

    .line 282
    :goto_b
    if-gt v8, v2, :cond_e

    .line 283
    .line 284
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 285
    .line 286
    .line 287
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 296
    .line 297
    .line 298
    add-int/lit8 v8, v8, 0x1

    .line 299
    .line 300
    const/4 v5, 0x2

    .line 301
    goto :goto_b

    .line 302
    :cond_e
    move/from16 v18, v10

    .line 303
    .line 304
    goto :goto_c

    .line 305
    :cond_f
    const/16 v18, -0x1

    .line 306
    .line 307
    :goto_c
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 308
    .line 309
    .line 310
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 311
    .line 312
    .line 313
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 317
    .line 318
    .line 319
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 323
    .line 324
    .line 325
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_11

    .line 330
    .line 331
    if-eqz v9, :cond_10

    .line 332
    .line 333
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    goto :goto_d

    .line 338
    :cond_10
    const/4 v2, 0x0

    .line 339
    :goto_d
    const/4 v5, 0x6

    .line 340
    if-eqz v2, :cond_12

    .line 341
    .line 342
    invoke-virtual {v6, v5}, Lh1/v;->v(I)V

    .line 343
    .line 344
    .line 345
    :cond_11
    const/4 v0, 0x2

    .line 346
    goto :goto_13

    .line 347
    :cond_12
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-eqz v2, :cond_11

    .line 352
    .line 353
    const/4 v2, 0x0

    .line 354
    :goto_e
    if-ge v2, v0, :cond_11

    .line 355
    .line 356
    const/4 v8, 0x0

    .line 357
    :goto_f
    if-ge v8, v5, :cond_17

    .line 358
    .line 359
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 360
    .line 361
    .line 362
    move-result v9

    .line 363
    if-nez v9, :cond_13

    .line 364
    .line 365
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 366
    .line 367
    .line 368
    goto :goto_11

    .line 369
    :cond_13
    shl-int/lit8 v9, v2, 0x1

    .line 370
    .line 371
    add-int/2addr v9, v0

    .line 372
    shl-int v9, v7, v9

    .line 373
    .line 374
    const/16 v10, 0x40

    .line 375
    .line 376
    invoke-static {v10, v9}, Ljava/lang/Math;->min(II)I

    .line 377
    .line 378
    .line 379
    move-result v9

    .line 380
    if-le v2, v7, :cond_14

    .line 381
    .line 382
    invoke-virtual {v6}, Lh1/v;->p()I

    .line 383
    .line 384
    .line 385
    :cond_14
    const/4 v10, 0x0

    .line 386
    :goto_10
    if-ge v10, v9, :cond_15

    .line 387
    .line 388
    invoke-virtual {v6}, Lh1/v;->p()I

    .line 389
    .line 390
    .line 391
    add-int/lit8 v10, v10, 0x1

    .line 392
    .line 393
    goto :goto_10

    .line 394
    :cond_15
    :goto_11
    if-ne v2, v1, :cond_16

    .line 395
    .line 396
    move v9, v1

    .line 397
    goto :goto_12

    .line 398
    :cond_16
    move v9, v7

    .line 399
    :goto_12
    add-int/2addr v8, v9

    .line 400
    goto :goto_f

    .line 401
    :cond_17
    add-int/lit8 v2, v2, 0x1

    .line 402
    .line 403
    goto :goto_e

    .line 404
    :goto_13
    invoke-virtual {v6, v0}, Lh1/v;->v(I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-eqz v0, :cond_18

    .line 412
    .line 413
    const/16 v0, 0x8

    .line 414
    .line 415
    invoke-virtual {v6, v0}, Lh1/v;->v(I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 419
    .line 420
    .line 421
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 425
    .line 426
    .line 427
    :cond_18
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    const/4 v2, 0x0

    .line 432
    new-array v5, v2, [I

    .line 433
    .line 434
    new-array v8, v2, [I

    .line 435
    .line 436
    move v9, v2

    .line 437
    const/4 v2, -0x1

    .line 438
    const/4 v10, -0x1

    .line 439
    :goto_14
    if-ge v9, v0, :cond_2a

    .line 440
    .line 441
    if-eqz v9, :cond_25

    .line 442
    .line 443
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 444
    .line 445
    .line 446
    move-result v19

    .line 447
    if-eqz v19, :cond_25

    .line 448
    .line 449
    move/from16 v19, v7

    .line 450
    .line 451
    add-int v7, v10, v2

    .line 452
    .line 453
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 454
    .line 455
    .line 456
    move-result v20

    .line 457
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 458
    .line 459
    .line 460
    move-result v21

    .line 461
    add-int/lit8 v21, v21, 0x1

    .line 462
    .line 463
    const/16 v17, 0x2

    .line 464
    .line 465
    mul-int/lit8 v20, v20, 0x2

    .line 466
    .line 467
    rsub-int/lit8 v20, v20, 0x1

    .line 468
    .line 469
    mul-int v20, v20, v21

    .line 470
    .line 471
    add-int/lit8 v1, v7, 0x1

    .line 472
    .line 473
    move/from16 v22, v0

    .line 474
    .line 475
    new-array v0, v1, [Z

    .line 476
    .line 477
    move-object/from16 v23, v0

    .line 478
    .line 479
    const/4 v0, 0x0

    .line 480
    :goto_15
    if-gt v0, v7, :cond_1a

    .line 481
    .line 482
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 483
    .line 484
    .line 485
    move-result v24

    .line 486
    if-nez v24, :cond_19

    .line 487
    .line 488
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 489
    .line 490
    .line 491
    move-result v24

    .line 492
    aput-boolean v24, v23, v0

    .line 493
    .line 494
    goto :goto_16

    .line 495
    :cond_19
    aput-boolean v19, v23, v0

    .line 496
    .line 497
    :goto_16
    add-int/lit8 v0, v0, 0x1

    .line 498
    .line 499
    goto :goto_15

    .line 500
    :cond_1a
    new-array v0, v1, [I

    .line 501
    .line 502
    new-array v1, v1, [I

    .line 503
    .line 504
    add-int/lit8 v24, v2, -0x1

    .line 505
    .line 506
    const/16 v25, 0x0

    .line 507
    .line 508
    :goto_17
    if-ltz v24, :cond_1c

    .line 509
    .line 510
    aget v26, v8, v24

    .line 511
    .line 512
    add-int v26, v26, v20

    .line 513
    .line 514
    if-gez v26, :cond_1b

    .line 515
    .line 516
    add-int v27, v10, v24

    .line 517
    .line 518
    aget-boolean v27, v23, v27

    .line 519
    .line 520
    if-eqz v27, :cond_1b

    .line 521
    .line 522
    add-int/lit8 v27, v25, 0x1

    .line 523
    .line 524
    aput v26, v0, v25

    .line 525
    .line 526
    move/from16 v25, v27

    .line 527
    .line 528
    :cond_1b
    add-int/lit8 v24, v24, -0x1

    .line 529
    .line 530
    goto :goto_17

    .line 531
    :cond_1c
    if-gez v20, :cond_1d

    .line 532
    .line 533
    aget-boolean v24, v23, v7

    .line 534
    .line 535
    if-eqz v24, :cond_1d

    .line 536
    .line 537
    add-int/lit8 v24, v25, 0x1

    .line 538
    .line 539
    aput v20, v0, v25

    .line 540
    .line 541
    move/from16 v25, v24

    .line 542
    .line 543
    :cond_1d
    move/from16 v24, v4

    .line 544
    .line 545
    move/from16 v4, v25

    .line 546
    .line 547
    move-object/from16 v25, v5

    .line 548
    .line 549
    const/4 v5, 0x0

    .line 550
    :goto_18
    if-ge v5, v10, :cond_1f

    .line 551
    .line 552
    aget v26, v25, v5

    .line 553
    .line 554
    add-int v26, v26, v20

    .line 555
    .line 556
    if-gez v26, :cond_1e

    .line 557
    .line 558
    aget-boolean v27, v23, v5

    .line 559
    .line 560
    if-eqz v27, :cond_1e

    .line 561
    .line 562
    add-int/lit8 v27, v4, 0x1

    .line 563
    .line 564
    aput v26, v0, v4

    .line 565
    .line 566
    move/from16 v4, v27

    .line 567
    .line 568
    :cond_1e
    add-int/lit8 v5, v5, 0x1

    .line 569
    .line 570
    goto :goto_18

    .line 571
    :cond_1f
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    add-int/lit8 v5, v10, -0x1

    .line 576
    .line 577
    const/16 v26, 0x0

    .line 578
    .line 579
    :goto_19
    if-ltz v5, :cond_21

    .line 580
    .line 581
    aget v27, v25, v5

    .line 582
    .line 583
    add-int v27, v27, v20

    .line 584
    .line 585
    if-lez v27, :cond_20

    .line 586
    .line 587
    aget-boolean v28, v23, v5

    .line 588
    .line 589
    if-eqz v28, :cond_20

    .line 590
    .line 591
    add-int/lit8 v28, v26, 0x1

    .line 592
    .line 593
    aput v27, v1, v26

    .line 594
    .line 595
    move/from16 v26, v28

    .line 596
    .line 597
    :cond_20
    add-int/lit8 v5, v5, -0x1

    .line 598
    .line 599
    goto :goto_19

    .line 600
    :cond_21
    if-lez v20, :cond_22

    .line 601
    .line 602
    aget-boolean v5, v23, v7

    .line 603
    .line 604
    if-eqz v5, :cond_22

    .line 605
    .line 606
    add-int/lit8 v5, v26, 0x1

    .line 607
    .line 608
    aput v20, v1, v26

    .line 609
    .line 610
    move/from16 v26, v5

    .line 611
    .line 612
    :cond_22
    move/from16 v5, v26

    .line 613
    .line 614
    const/4 v7, 0x0

    .line 615
    :goto_1a
    if-ge v7, v2, :cond_24

    .line 616
    .line 617
    aget v25, v8, v7

    .line 618
    .line 619
    add-int v25, v25, v20

    .line 620
    .line 621
    if-lez v25, :cond_23

    .line 622
    .line 623
    add-int v26, v10, v7

    .line 624
    .line 625
    aget-boolean v26, v23, v26

    .line 626
    .line 627
    if-eqz v26, :cond_23

    .line 628
    .line 629
    add-int/lit8 v26, v5, 0x1

    .line 630
    .line 631
    aput v25, v1, v5

    .line 632
    .line 633
    move/from16 v5, v26

    .line 634
    .line 635
    :cond_23
    add-int/lit8 v7, v7, 0x1

    .line 636
    .line 637
    goto :goto_1a

    .line 638
    :cond_24
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    move-object v8, v1

    .line 643
    move v10, v4

    .line 644
    move v2, v5

    .line 645
    move-object v5, v0

    .line 646
    goto :goto_1f

    .line 647
    :cond_25
    move/from16 v22, v0

    .line 648
    .line 649
    move/from16 v24, v4

    .line 650
    .line 651
    move/from16 v19, v7

    .line 652
    .line 653
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    new-array v2, v0, [I

    .line 662
    .line 663
    const/4 v4, 0x0

    .line 664
    :goto_1b
    if-ge v4, v0, :cond_27

    .line 665
    .line 666
    if-lez v4, :cond_26

    .line 667
    .line 668
    add-int/lit8 v5, v4, -0x1

    .line 669
    .line 670
    aget v5, v2, v5

    .line 671
    .line 672
    goto :goto_1c

    .line 673
    :cond_26
    const/4 v5, 0x0

    .line 674
    :goto_1c
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 675
    .line 676
    .line 677
    move-result v7

    .line 678
    add-int/lit8 v7, v7, 0x1

    .line 679
    .line 680
    sub-int/2addr v5, v7

    .line 681
    aput v5, v2, v4

    .line 682
    .line 683
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 684
    .line 685
    .line 686
    add-int/lit8 v4, v4, 0x1

    .line 687
    .line 688
    goto :goto_1b

    .line 689
    :cond_27
    new-array v4, v1, [I

    .line 690
    .line 691
    const/4 v5, 0x0

    .line 692
    :goto_1d
    if-ge v5, v1, :cond_29

    .line 693
    .line 694
    if-lez v5, :cond_28

    .line 695
    .line 696
    add-int/lit8 v7, v5, -0x1

    .line 697
    .line 698
    aget v7, v4, v7

    .line 699
    .line 700
    goto :goto_1e

    .line 701
    :cond_28
    const/4 v7, 0x0

    .line 702
    :goto_1e
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 703
    .line 704
    .line 705
    move-result v8

    .line 706
    add-int/lit8 v8, v8, 0x1

    .line 707
    .line 708
    add-int/2addr v8, v7

    .line 709
    aput v8, v4, v5

    .line 710
    .line 711
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 712
    .line 713
    .line 714
    add-int/lit8 v5, v5, 0x1

    .line 715
    .line 716
    goto :goto_1d

    .line 717
    :cond_29
    move v10, v0

    .line 718
    move-object v5, v2

    .line 719
    move-object v8, v4

    .line 720
    move v2, v1

    .line 721
    :goto_1f
    add-int/lit8 v9, v9, 0x1

    .line 722
    .line 723
    move/from16 v7, v19

    .line 724
    .line 725
    move/from16 v0, v22

    .line 726
    .line 727
    move/from16 v4, v24

    .line 728
    .line 729
    const/4 v1, 0x3

    .line 730
    goto/16 :goto_14

    .line 731
    .line 732
    :cond_2a
    move/from16 v24, v4

    .line 733
    .line 734
    move/from16 v19, v7

    .line 735
    .line 736
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    if-eqz v0, :cond_2b

    .line 741
    .line 742
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    const/4 v8, 0x0

    .line 747
    :goto_20
    if-ge v8, v0, :cond_2b

    .line 748
    .line 749
    add-int/lit8 v1, v16, 0x5

    .line 750
    .line 751
    invoke-virtual {v6, v1}, Lh1/v;->v(I)V

    .line 752
    .line 753
    .line 754
    add-int/lit8 v8, v8, 0x1

    .line 755
    .line 756
    goto :goto_20

    .line 757
    :cond_2b
    const/4 v0, 0x2

    .line 758
    invoke-virtual {v6, v0}, Lh1/v;->v(I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    const/high16 v2, 0x3f800000    # 1.0f

    .line 766
    .line 767
    if-eqz v1, :cond_36

    .line 768
    .line 769
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    if-eqz v1, :cond_2e

    .line 774
    .line 775
    const/16 v1, 0x8

    .line 776
    .line 777
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    const/16 v1, 0xff

    .line 782
    .line 783
    if-ne v4, v1, :cond_2c

    .line 784
    .line 785
    const/16 v1, 0x10

    .line 786
    .line 787
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    if-eqz v4, :cond_2e

    .line 796
    .line 797
    if-eqz v1, :cond_2e

    .line 798
    .line 799
    int-to-float v2, v4

    .line 800
    int-to-float v1, v1

    .line 801
    div-float/2addr v2, v1

    .line 802
    goto :goto_21

    .line 803
    :cond_2c
    const/16 v1, 0x11

    .line 804
    .line 805
    if-ge v4, v1, :cond_2d

    .line 806
    .line 807
    sget-object v1, Li1/p;->b:[F

    .line 808
    .line 809
    aget v2, v1, v4

    .line 810
    .line 811
    goto :goto_21

    .line 812
    :cond_2d
    const-string v1, "NalUnitUtil"

    .line 813
    .line 814
    const-string v5, "Unexpected aspect_ratio_idc value: "

    .line 815
    .line 816
    invoke-static {v5, v4, v1}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 817
    .line 818
    .line 819
    :cond_2e
    :goto_21
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 820
    .line 821
    .line 822
    move-result v1

    .line 823
    if-eqz v1, :cond_2f

    .line 824
    .line 825
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 826
    .line 827
    .line 828
    :cond_2f
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 829
    .line 830
    .line 831
    move-result v1

    .line 832
    if-eqz v1, :cond_32

    .line 833
    .line 834
    const/4 v1, 0x3

    .line 835
    invoke-virtual {v6, v1}, Lh1/v;->v(I)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    if-eqz v1, :cond_30

    .line 843
    .line 844
    move/from16 v5, v19

    .line 845
    .line 846
    goto :goto_22

    .line 847
    :cond_30
    move v5, v0

    .line 848
    :goto_22
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 849
    .line 850
    .line 851
    move-result v0

    .line 852
    if-eqz v0, :cond_31

    .line 853
    .line 854
    const/16 v0, 0x8

    .line 855
    .line 856
    invoke-virtual {v6, v0}, Lh1/v;->k(I)I

    .line 857
    .line 858
    .line 859
    move-result v1

    .line 860
    invoke-virtual {v6, v0}, Lh1/v;->k(I)I

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    invoke-virtual {v6, v0}, Lh1/v;->v(I)V

    .line 865
    .line 866
    .line 867
    invoke-static {v1}, Landroidx/media3/common/l;->f(I)I

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    invoke-static {v3}, Landroidx/media3/common/l;->g(I)I

    .line 872
    .line 873
    .line 874
    move-result v1

    .line 875
    goto :goto_23

    .line 876
    :cond_31
    const/4 v0, -0x1

    .line 877
    const/4 v1, -0x1

    .line 878
    goto :goto_23

    .line 879
    :cond_32
    if-eqz v3, :cond_33

    .line 880
    .line 881
    iget-object v0, v3, La1/h;->m:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v0, Li1/i;

    .line 884
    .line 885
    if-eqz v0, :cond_33

    .line 886
    .line 887
    iget-object v1, v0, Li1/i;->a:Lf6/m0;

    .line 888
    .line 889
    iget-object v0, v0, Li1/i;->b:[I

    .line 890
    .line 891
    aget v0, v0, v24

    .line 892
    .line 893
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 894
    .line 895
    .line 896
    move-result v3

    .line 897
    if-le v3, v0, :cond_33

    .line 898
    .line 899
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    check-cast v0, Li1/m;

    .line 904
    .line 905
    iget v1, v0, Li1/m;->a:I

    .line 906
    .line 907
    iget v3, v0, Li1/m;->b:I

    .line 908
    .line 909
    iget v0, v0, Li1/m;->c:I

    .line 910
    .line 911
    move v5, v1

    .line 912
    move v1, v0

    .line 913
    move v0, v5

    .line 914
    move v5, v3

    .line 915
    goto :goto_23

    .line 916
    :cond_33
    const/4 v0, -0x1

    .line 917
    const/4 v1, -0x1

    .line 918
    const/4 v5, -0x1

    .line 919
    :goto_23
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 920
    .line 921
    .line 922
    move-result v3

    .line 923
    if-eqz v3, :cond_34

    .line 924
    .line 925
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 926
    .line 927
    .line 928
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 929
    .line 930
    .line 931
    :cond_34
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    if-eqz v3, :cond_35

    .line 939
    .line 940
    mul-int/lit8 v11, v11, 0x2

    .line 941
    .line 942
    :cond_35
    move/from16 v19, v0

    .line 943
    .line 944
    move/from16 v21, v1

    .line 945
    .line 946
    move/from16 v17, v2

    .line 947
    .line 948
    move/from16 v20, v5

    .line 949
    .line 950
    move/from16 v16, v11

    .line 951
    .line 952
    goto :goto_24

    .line 953
    :cond_36
    move/from16 v17, v2

    .line 954
    .line 955
    move/from16 v16, v11

    .line 956
    .line 957
    const/16 v19, -0x1

    .line 958
    .line 959
    const/16 v20, -0x1

    .line 960
    .line 961
    const/16 v21, -0x1

    .line 962
    .line 963
    :goto_24
    new-instance v11, Li1/l;

    .line 964
    .line 965
    invoke-direct/range {v11 .. v21}, Li1/l;-><init>(Li1/h;IIIIFIIII)V

    .line 966
    .line 967
    .line 968
    return-object v11
.end method

.method public static h([BII)La1/h;
    .locals 40

    .line 1
    new-instance v0, Lh1/v;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct {v0, v1, v2, v3}, Lh1/v;-><init>([BII)V

    .line 2
    invoke-static {v0}, Li1/p;->d(Lh1/v;)Landroidx/media3/common/p;

    const/4 v1, 0x4

    .line 3
    invoke-virtual {v0, v1}, Lh1/v;->v(I)V

    .line 4
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v2

    .line 5
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v3

    const/4 v4, 0x6

    .line 6
    invoke-virtual {v0, v4}, Lh1/v;->k(I)I

    move-result v5

    add-int/lit8 v6, v5, 0x1

    const/4 v7, 0x3

    .line 7
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v8

    const/16 v9, 0x11

    .line 8
    invoke-virtual {v0, v9}, Lh1/v;->v(I)V

    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 9
    invoke-static {v0, v9, v8, v10}, Li1/p;->e(Lh1/v;ZILi1/h;)Li1/h;

    move-result-object v11

    .line 10
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_0

    move v12, v13

    goto :goto_0

    :cond_0
    move v12, v8

    :goto_0
    if-gt v12, v8, :cond_1

    .line 11
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 12
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 13
    invoke-virtual {v0}, Lh1/v;->o()I

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v0, v4}, Lh1/v;->k(I)I

    move-result v12

    .line 15
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v14

    add-int/2addr v14, v9

    .line 16
    invoke-static {v11}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v15

    move/from16 p0, v4

    .line 17
    new-instance v4, Li1/i;

    new-array v7, v9, [I

    move/from16 p2, v9

    const/4 v9, 0x0

    invoke-direct {v4, v15, v7, v9}, Li1/i;-><init>(Lf6/l1;[II)V

    const/4 v7, 0x2

    if-lt v6, v7, :cond_2

    if-lt v14, v7, :cond_2

    move/from16 v9, p2

    goto :goto_1

    :cond_2
    move v9, v13

    :goto_1
    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    move/from16 v2, p2

    goto :goto_2

    :cond_3
    move v2, v13

    :goto_2
    add-int/lit8 v3, v12, 0x1

    if-lt v3, v6, :cond_4

    move/from16 v15, p2

    goto :goto_3

    :cond_4
    move v15, v13

    :goto_3
    if-eqz v9, :cond_5

    if-eqz v2, :cond_5

    if-nez v15, :cond_6

    :cond_5
    move-object v1, v10

    goto/16 :goto_5e

    .line 18
    :cond_6
    new-array v2, v7, [I

    aput v3, v2, p2

    aput v14, v2, v13

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[I

    .line 19
    new-array v15, v14, [I

    .line 20
    new-array v7, v14, [I

    .line 21
    aget-object v17, v2, v13

    aput v13, v17, v13

    .line 22
    aput p2, v15, v13

    .line 23
    aput v13, v7, v13

    move/from16 v13, p2

    :goto_4
    if-ge v13, v14, :cond_9

    const/4 v10, 0x0

    const/16 v19, 0x0

    :goto_5
    if-gt v10, v12, :cond_8

    .line 24
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v20

    if-eqz v20, :cond_7

    .line 25
    aget-object v20, v2, v13

    add-int/lit8 v21, v19, 0x1

    aput v10, v20, v19

    .line 26
    aput v10, v7, v13

    move/from16 v19, v21

    .line 27
    :cond_7
    aput v19, v15, v13

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_8
    add-int/lit8 v13, v13, 0x1

    const/4 v10, 0x0

    goto :goto_4

    .line 28
    :cond_9
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v10

    if-eqz v10, :cond_18

    const/16 v10, 0x40

    .line 29
    invoke-virtual {v0, v10}, Lh1/v;->v(I)V

    .line 30
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v10

    if-eqz v10, :cond_a

    .line 31
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 32
    :cond_a
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v10

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v10, :cond_18

    .line 33
    invoke-virtual {v0}, Lh1/v;->o()I

    if-eqz v1, :cond_d

    .line 34
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v20

    if-eqz v20, :cond_b

    goto :goto_7

    :cond_b
    const/16 v20, 0x0

    const/16 v21, 0x0

    :cond_c
    const/16 v22, 0x0

    goto :goto_8

    .line 35
    :cond_d
    :goto_7
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v20

    .line 36
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v21

    if-nez v20, :cond_e

    if-eqz v21, :cond_c

    .line 37
    :cond_e
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v22

    if-eqz v22, :cond_f

    const/16 v13, 0x13

    .line 38
    invoke-virtual {v0, v13}, Lh1/v;->v(I)V

    :cond_f
    const/16 v13, 0x8

    .line 39
    invoke-virtual {v0, v13}, Lh1/v;->v(I)V

    if-eqz v22, :cond_10

    const/4 v13, 0x4

    .line 40
    invoke-virtual {v0, v13}, Lh1/v;->v(I)V

    :cond_10
    const/16 v13, 0xf

    .line 41
    invoke-virtual {v0, v13}, Lh1/v;->v(I)V

    :goto_8
    const/4 v13, 0x0

    :goto_9
    if-gt v13, v8, :cond_17

    .line 42
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v24

    if-nez v24, :cond_11

    .line 43
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v24

    :cond_11
    if-eqz v24, :cond_12

    .line 44
    invoke-virtual {v0}, Lh1/v;->o()I

    const/16 v24, 0x0

    goto :goto_a

    .line 45
    :cond_12
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v24

    :goto_a
    if-nez v24, :cond_13

    .line 46
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v24

    move/from16 v25, v24

    move/from16 v24, v1

    move/from16 v1, v25

    :goto_b
    move-object/from16 v25, v2

    goto :goto_c

    :cond_13
    move/from16 v24, v1

    const/4 v1, 0x0

    goto :goto_b

    :goto_c
    add-int v2, v20, v21

    move-object/from16 v26, v7

    const/4 v7, 0x0

    :goto_d
    if-ge v7, v2, :cond_16

    move/from16 v27, v2

    const/4 v2, 0x0

    :goto_e
    if-gt v2, v1, :cond_15

    .line 47
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 48
    invoke-virtual {v0}, Lh1/v;->o()I

    if-eqz v22, :cond_14

    .line 49
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 50
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 51
    :cond_14
    invoke-virtual {v0}, Lh1/v;->u()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_15
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, v27

    goto :goto_d

    :cond_16
    add-int/lit8 v13, v13, 0x1

    move/from16 v1, v24

    move-object/from16 v2, v25

    move-object/from16 v7, v26

    goto :goto_9

    :cond_17
    move/from16 v24, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v7

    add-int/lit8 v1, v24, 0x1

    goto/16 :goto_6

    :cond_18
    move-object/from16 v25, v2

    move-object/from16 v26, v7

    .line 52
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v1

    if-nez v1, :cond_19

    .line 53
    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    .line 54
    :cond_19
    iget v1, v0, Lh1/v;->e:I

    if-lez v1, :cond_1a

    const/16 v23, 0x8

    rsub-int/lit8 v13, v1, 0x8

    .line 55
    invoke-virtual {v0, v13}, Lh1/v;->v(I)V

    :cond_1a
    const/4 v1, 0x0

    .line 56
    invoke-static {v0, v1, v8, v11}, Li1/p;->e(Lh1/v;ZILi1/h;)Li1/h;

    move-result-object v2

    .line 57
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v1

    const/16 v7, 0x10

    .line 58
    new-array v10, v7, [Z

    move/from16 v20, v1

    const/4 v1, 0x0

    const/4 v13, 0x0

    :goto_f
    if-ge v13, v7, :cond_1c

    .line 59
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v21

    aput-boolean v21, v10, v13

    if-eqz v21, :cond_1b

    add-int/lit8 v1, v1, 0x1

    :cond_1b
    add-int/lit8 v13, v13, 0x1

    goto :goto_f

    :cond_1c
    if-eqz v1, :cond_1d

    .line 60
    aget-boolean v13, v10, p2

    if-nez v13, :cond_1e

    :cond_1d
    const/4 v1, 0x0

    goto/16 :goto_5d

    .line 61
    :cond_1e
    new-array v13, v1, [I

    move-object/from16 v22, v10

    const/4 v7, 0x0

    :goto_10
    sub-int v10, v1, v20

    if-ge v7, v10, :cond_1f

    const/4 v10, 0x3

    .line 62
    invoke-virtual {v0, v10}, Lh1/v;->k(I)I

    move-result v24

    aput v24, v13, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_1f
    add-int/lit8 v7, v1, 0x1

    .line 63
    new-array v7, v7, [I

    if-eqz v20, :cond_22

    move/from16 v10, p2

    :goto_11
    if-ge v10, v1, :cond_21

    move-object/from16 v24, v7

    const/4 v7, 0x0

    :goto_12
    if-ge v7, v10, :cond_20

    .line 64
    aget v27, v24, v10

    aget v28, v13, v7

    add-int/lit8 v28, v28, 0x1

    add-int v28, v28, v27

    aput v28, v24, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_20
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, v24

    goto :goto_11

    :cond_21
    move-object/from16 v24, v7

    .line 65
    aput p0, v24, v1

    :goto_13
    const/4 v7, 0x2

    goto :goto_14

    :cond_22
    move-object/from16 v24, v7

    goto :goto_13

    .line 66
    :goto_14
    new-array v10, v7, [I

    aput v1, v10, p2

    const/16 v17, 0x0

    aput v6, v10, v17

    invoke-static {v9, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [[I

    .line 67
    new-array v9, v6, [I

    .line 68
    aput v17, v9, v17

    .line 69
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v10

    move-object/from16 v27, v7

    move/from16 v7, p2

    :goto_15
    if-ge v7, v6, :cond_26

    if-eqz v10, :cond_23

    move/from16 v28, v7

    move/from16 v7, p0

    .line 70
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v29

    aput v29, v9, v28

    goto :goto_16

    :cond_23
    move/from16 v28, v7

    move/from16 v7, p0

    .line 71
    aput v28, v9, v28

    :goto_16
    if-nez v20, :cond_24

    const/4 v7, 0x0

    :goto_17
    if-ge v7, v1, :cond_25

    .line 72
    aget-object v29, v27, v28

    aget v30, v13, v7

    move/from16 v31, v7

    add-int/lit8 v7, v30, 0x1

    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v7

    aput v7, v29, v31

    add-int/lit8 v7, v31, 0x1

    goto :goto_17

    :cond_24
    const/4 v7, 0x0

    :goto_18
    if-ge v7, v1, :cond_25

    .line 73
    aget-object v29, v27, v28

    aget v30, v9, v28

    add-int/lit8 v31, v7, 0x1

    aget v32, v24, v31

    shl-int v32, p2, v32

    add-int/lit8 v32, v32, -0x1

    and-int v30, v30, v32

    aget v32, v24, v7

    shr-int v30, v30, v32

    aput v30, v29, v7

    move/from16 v7, v31

    goto :goto_18

    :cond_25
    add-int/lit8 v7, v28, 0x1

    const/16 p0, 0x6

    goto :goto_15

    .line 74
    :cond_26
    new-array v1, v3, [I

    move/from16 v7, p2

    const/4 v10, 0x0

    :goto_19
    const/4 v13, -0x1

    if-ge v10, v6, :cond_2d

    .line 75
    aget v20, v9, v10

    aput v13, v1, v20

    move-object/from16 v24, v1

    const/4 v13, 0x0

    const/16 v20, 0x0

    :goto_1a
    const/16 v1, 0x10

    if-ge v13, v1, :cond_29

    .line 76
    aget-boolean v1, v22, v13

    if-eqz v1, :cond_28

    move/from16 v1, p2

    if-ne v13, v1, :cond_27

    .line 77
    aget v1, v9, v10

    aget-object v28, v27, v10

    aget v28, v28, v20

    aput v28, v24, v1

    :cond_27
    add-int/lit8 v20, v20, 0x1

    :cond_28
    add-int/lit8 v13, v13, 0x1

    const/16 p2, 0x1

    goto :goto_1a

    :cond_29
    if-lez v10, :cond_2c

    const/4 v1, 0x0

    :goto_1b
    if-ge v1, v10, :cond_2b

    .line 78
    aget v13, v9, v10

    aget v13, v24, v13

    aget v20, v9, v1

    move/from16 v28, v1

    aget v1, v24, v20

    if-ne v13, v1, :cond_2a

    const/4 v1, 0x0

    goto :goto_1c

    :cond_2a
    add-int/lit8 v1, v28, 0x1

    goto :goto_1b

    :cond_2b
    const/4 v1, 0x1

    :goto_1c
    if-eqz v1, :cond_2c

    add-int/lit8 v7, v7, 0x1

    :cond_2c
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, v24

    const/16 p2, 0x1

    goto :goto_19

    :cond_2d
    move-object/from16 v24, v1

    const/4 v1, 0x4

    .line 79
    invoke-virtual {v0, v1}, Lh1/v;->k(I)I

    move-result v10

    const/4 v1, 0x2

    if-lt v7, v1, :cond_88

    if-nez v10, :cond_2e

    goto/16 :goto_5c

    .line 80
    :cond_2e
    new-array v1, v7, [I

    const/4 v13, 0x0

    :goto_1d
    if-ge v13, v7, :cond_2f

    .line 81
    invoke-virtual {v0, v10}, Lh1/v;->k(I)I

    move-result v20

    aput v20, v1, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_1d

    .line 82
    :cond_2f
    new-array v10, v3, [I

    const/4 v13, 0x0

    :goto_1e
    if-ge v13, v6, :cond_30

    move-object/from16 v20, v1

    .line 83
    aget v1, v9, v13

    invoke-static {v1, v12}, Ljava/lang/Math;->min(II)I

    move-result v1

    aput v13, v10, v1

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, v20

    goto :goto_1e

    :cond_30
    move-object/from16 v20, v1

    .line 84
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    move-result-object v1

    const/4 v13, 0x0

    :goto_1f
    if-gt v13, v12, :cond_32

    move/from16 v22, v7

    .line 85
    aget v7, v24, v13

    move-object/from16 v28, v9

    const/16 v27, 0x1

    add-int/lit8 v9, v22, -0x1

    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-ltz v7, :cond_31

    .line 86
    aget v7, v20, v7

    goto :goto_20

    :cond_31
    const/4 v7, -0x1

    .line 87
    :goto_20
    new-instance v9, Li1/g;

    move-object/from16 v27, v10

    aget v10, v27, v13

    invoke-direct {v9, v10, v7}, Li1/g;-><init>(II)V

    .line 88
    invoke-virtual {v1, v9}, Lf6/g0;->a(Ljava/lang/Object;)V

    add-int/lit8 v13, v13, 0x1

    move/from16 v7, v22

    move-object/from16 v10, v27

    move-object/from16 v9, v28

    goto :goto_1f

    :cond_32
    move-object/from16 v28, v9

    .line 89
    invoke-virtual {v1}, Lf6/j0;->f()Lf6/l1;

    move-result-object v1

    const/4 v7, 0x0

    .line 90
    invoke-virtual {v1, v7}, Lf6/l1;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li1/g;

    iget v7, v9, Li1/g;->b:I

    const/4 v9, -0x1

    if-ne v7, v9, :cond_33

    .line 91
    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    :cond_33
    const/4 v7, 0x1

    :goto_21
    if-gt v7, v12, :cond_35

    .line 92
    invoke-virtual {v1, v7}, Lf6/l1;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li1/g;

    iget v10, v10, Li1/g;->b:I

    if-eq v10, v9, :cond_34

    goto :goto_22

    :cond_34
    add-int/lit8 v7, v7, 0x1

    goto :goto_21

    :cond_35
    move v7, v9

    :goto_22
    if-ne v7, v9, :cond_36

    .line 93
    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    :cond_36
    const/4 v9, 0x2

    .line 94
    new-array v10, v9, [I

    const/16 v27, 0x1

    aput v6, v10, v27

    const/16 v17, 0x0

    aput v6, v10, v17

    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [[Z

    .line 95
    new-array v13, v9, [I

    aput v6, v13, v27

    aput v6, v13, v17

    invoke-static {v12, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [[Z

    const/4 v13, 0x1

    :goto_23
    if-ge v13, v6, :cond_38

    move-object/from16 p0, v9

    const/4 v9, 0x0

    :goto_24
    if-ge v9, v13, :cond_37

    .line 96
    aget-object v20, v10, v13

    aget-object v22, p0, v13

    .line 97
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v24

    aput-boolean v24, v22, v9

    aput-boolean v24, v20, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_24

    :cond_37
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v9, p0

    goto :goto_23

    :cond_38
    move-object/from16 p0, v9

    const/4 v9, 0x1

    :goto_25
    if-ge v9, v6, :cond_3c

    const/4 v13, 0x0

    :goto_26
    if-ge v13, v5, :cond_3b

    move-object/from16 v20, v10

    const/4 v10, 0x0

    :goto_27
    if-ge v10, v9, :cond_3a

    .line 98
    aget-object v22, p0, v9

    aget-boolean v24, v22, v10

    if-eqz v24, :cond_39

    aget-object v24, p0, v10

    aget-boolean v24, v24, v13

    if-eqz v24, :cond_39

    const/16 v27, 0x1

    .line 99
    aput-boolean v27, v22, v13

    goto :goto_28

    :cond_39
    add-int/lit8 v10, v10, 0x1

    goto :goto_27

    :cond_3a
    :goto_28
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v10, v20

    goto :goto_26

    :cond_3b
    move-object/from16 v20, v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_25

    :cond_3c
    move-object/from16 v20, v10

    .line 100
    new-array v9, v3, [I

    const/4 v10, 0x0

    :goto_29
    if-ge v10, v6, :cond_3e

    const/4 v13, 0x0

    const/16 v22, 0x0

    :goto_2a
    if-ge v13, v10, :cond_3d

    .line 101
    aget-object v24, v20, v10

    aget-boolean v24, v24, v13

    add-int v22, v22, v24

    add-int/lit8 v13, v13, 0x1

    goto :goto_2a

    .line 102
    :cond_3d
    aget v13, v28, v10

    aput v22, v9, v13

    add-int/lit8 v10, v10, 0x1

    goto :goto_29

    :cond_3e
    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_2b
    if-ge v10, v6, :cond_40

    .line 103
    aget v22, v28, v10

    aget v22, v9, v22

    if-nez v22, :cond_3f

    add-int/lit8 v13, v13, 0x1

    :cond_3f
    add-int/lit8 v10, v10, 0x1

    goto :goto_2b

    :cond_40
    const/4 v10, 0x1

    if-le v13, v10, :cond_41

    .line 104
    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    .line 105
    :cond_41
    new-array v10, v6, [I

    .line 106
    new-array v13, v14, [I

    .line 107
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v22

    if-eqz v22, :cond_42

    move-object/from16 v22, v9

    const/4 v9, 0x0

    :goto_2c
    if-ge v9, v6, :cond_43

    move/from16 v24, v9

    const/4 v9, 0x3

    .line 108
    invoke-virtual {v0, v9}, Lh1/v;->k(I)I

    move-result v27

    aput v27, v10, v24

    add-int/lit8 v9, v24, 0x1

    goto :goto_2c

    :cond_42
    move-object/from16 v22, v9

    const/4 v9, 0x0

    .line 109
    invoke-static {v10, v9, v6, v8}, Ljava/util/Arrays;->fill([IIII)V

    :cond_43
    const/4 v9, 0x0

    :goto_2d
    if-ge v9, v14, :cond_45

    move/from16 v24, v9

    move-object/from16 v27, v10

    move-object/from16 v29, v13

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 110
    :goto_2e
    aget v13, v15, v24

    if-ge v9, v13, :cond_44

    .line 111
    aget-object v13, v25, v24

    aget v13, v13, v9

    .line 112
    invoke-virtual {v1, v13}, Lf6/l1;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Li1/g;

    iget v13, v13, Li1/g;->a:I

    aget v13, v27, v13

    .line 113
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    move-result v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_2e

    :cond_44
    add-int/lit8 v10, v10, 0x1

    .line 114
    aput v10, v29, v24

    add-int/lit8 v9, v24, 0x1

    move-object/from16 v10, v27

    move-object/from16 v13, v29

    goto :goto_2d

    :cond_45
    move-object/from16 v29, v13

    .line 115
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v9

    if-eqz v9, :cond_48

    const/4 v9, 0x0

    :goto_2f
    if-ge v9, v5, :cond_48

    add-int/lit8 v10, v9, 0x1

    move v13, v10

    :goto_30
    if-ge v13, v6, :cond_47

    .line 116
    aget-object v24, v20, v13

    aget-boolean v24, v24, v9

    if-eqz v24, :cond_46

    move/from16 v24, v5

    const/4 v5, 0x3

    .line 117
    invoke-virtual {v0, v5}, Lh1/v;->v(I)V

    goto :goto_31

    :cond_46
    move/from16 v24, v5

    :goto_31
    add-int/lit8 v13, v13, 0x1

    move/from16 v5, v24

    goto :goto_30

    :cond_47
    move v9, v10

    goto :goto_2f

    .line 118
    :cond_48
    invoke-virtual {v0}, Lh1/v;->u()V

    .line 119
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v5

    const/4 v10, 0x1

    add-int/2addr v5, v10

    .line 120
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    move-result-object v9

    .line 121
    invoke-virtual {v9, v11}, Lf6/g0;->a(Ljava/lang/Object;)V

    if-le v5, v10, :cond_49

    .line 122
    invoke-virtual {v9, v2}, Lf6/g0;->a(Ljava/lang/Object;)V

    const/4 v10, 0x2

    :goto_32
    if-ge v10, v5, :cond_49

    .line 123
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v11

    .line 124
    invoke-static {v0, v11, v8, v2}, Li1/p;->e(Lh1/v;ZILi1/h;)Li1/h;

    move-result-object v2

    .line 125
    invoke-virtual {v9, v2}, Lf6/g0;->a(Ljava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_32

    .line 126
    :cond_49
    invoke-virtual {v9}, Lf6/j0;->f()Lf6/l1;

    move-result-object v2

    .line 127
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v8

    add-int/2addr v8, v14

    if-le v8, v14, :cond_4a

    .line 128
    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    :cond_4a
    const/4 v9, 0x2

    .line 129
    invoke-virtual {v0, v9}, Lh1/v;->k(I)I

    move-result v10

    .line 130
    new-array v11, v9, [I

    const/16 v27, 0x1

    aput v3, v11, v27

    const/4 v9, 0x0

    aput v8, v11, v9

    invoke-static {v12, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [[Z

    .line 131
    new-array v13, v8, [I

    move/from16 v17, v9

    .line 132
    new-array v9, v8, [I

    move-object/from16 v24, v9

    move/from16 v9, v17

    :goto_33
    if-ge v9, v14, :cond_4f

    .line 133
    aput v17, v13, v9

    .line 134
    aget v27, v26, v9

    aput v27, v24, v9

    if-nez v10, :cond_4b

    move/from16 v27, v9

    .line 135
    aget-object v9, v11, v27

    move-object/from16 v30, v11

    aget v11, v15, v27

    move-object/from16 v31, v13

    move-object/from16 v32, v15

    move/from16 v13, v17

    const/4 v15, 0x1

    invoke-static {v9, v13, v11, v15}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 136
    aget v9, v32, v27

    aput v9, v31, v27

    :goto_34
    const/16 v17, 0x0

    goto :goto_37

    :cond_4b
    move/from16 v27, v9

    move-object/from16 v30, v11

    move-object/from16 v31, v13

    move-object/from16 v32, v15

    const/4 v15, 0x1

    if-ne v10, v15, :cond_4e

    .line 137
    aget v9, v26, v27

    const/4 v11, 0x0

    .line 138
    :goto_35
    aget v13, v32, v27

    if-ge v11, v13, :cond_4d

    .line 139
    aget-object v13, v30, v27

    aget-object v15, v25, v27

    aget v15, v15, v11

    if-ne v15, v9, :cond_4c

    const/4 v15, 0x1

    goto :goto_36

    :cond_4c
    const/4 v15, 0x0

    :goto_36
    aput-boolean v15, v13, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_35

    :cond_4d
    const/4 v15, 0x1

    .line 140
    aput v15, v31, v27

    goto :goto_34

    :cond_4e
    const/16 v17, 0x0

    .line 141
    aget-object v9, v30, v17

    aput-boolean v15, v9, v17

    .line 142
    aput v15, v31, v17

    :goto_37
    add-int/lit8 v9, v27, 0x1

    move-object/from16 v11, v30

    move-object/from16 v13, v31

    move-object/from16 v15, v32

    goto :goto_33

    :cond_4f
    move-object/from16 v30, v11

    move-object/from16 v31, v13

    move-object/from16 v32, v15

    const/4 v15, 0x1

    .line 143
    new-array v9, v3, [I

    const/4 v11, 0x2

    .line 144
    new-array v13, v11, [I

    aput v3, v13, v15

    aput v8, v13, v17

    invoke-static {v12, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[Z

    const/4 v12, 0x1

    const/4 v13, 0x0

    :goto_38
    if-ge v12, v8, :cond_5c

    if-ne v10, v11, :cond_51

    const/4 v11, 0x0

    .line 145
    :goto_39
    aget v15, v32, v12

    if-ge v11, v15, :cond_51

    .line 146
    aget-object v15, v30, v12

    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v26

    aput-boolean v26, v15, v11

    .line 147
    aget v15, v31, v12

    aget-object v26, v30, v12

    aget-boolean v26, v26, v11

    add-int v15, v15, v26

    aput v15, v31, v12

    if-eqz v26, :cond_50

    .line 148
    aget-object v15, v25, v12

    aget v15, v15, v11

    aput v15, v24, v12

    :cond_50
    add-int/lit8 v11, v11, 0x1

    goto :goto_39

    :cond_51
    if-nez v13, :cond_53

    .line 149
    aget-object v11, v25, v12

    const/16 v17, 0x0

    aget v11, v11, v17

    if-nez v11, :cond_54

    aget-object v11, v30, v12

    aget-boolean v11, v11, v17

    if-eqz v11, :cond_54

    const/4 v11, 0x1

    .line 150
    :goto_3a
    aget v15, v32, v12

    if-ge v11, v15, :cond_54

    .line 151
    aget-object v15, v25, v12

    aget v15, v15, v11

    if-ne v15, v7, :cond_52

    aget-object v15, v30, v12

    aget-boolean v15, v15, v7

    if-eqz v15, :cond_52

    move v13, v12

    :cond_52
    add-int/lit8 v11, v11, 0x1

    goto :goto_3a

    :cond_53
    const/16 v17, 0x0

    :cond_54
    move/from16 v11, v17

    .line 152
    :goto_3b
    aget v15, v32, v12

    if-ge v11, v15, :cond_5a

    const/4 v15, 0x1

    if-le v5, v15, :cond_58

    .line 153
    aget-object v15, v3, v12

    aget-object v26, v30, v12

    aget-boolean v26, v26, v11

    aput-boolean v26, v15, v11

    move-object v15, v2

    move-object/from16 v26, v3

    int-to-double v2, v5

    .line 154
    sget-object v27, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v2, v3}, Lh6/c;->c(D)I

    move-result v2

    .line 155
    aget-object v3, v26, v12

    aget-boolean v3, v3, v11

    if-nez v3, :cond_56

    .line 156
    aget-object v3, v25, v12

    aget v3, v3, v11

    invoke-virtual {v1, v3}, Lf6/l1;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/g;

    iget v3, v3, Li1/g;->a:I

    move/from16 v27, v3

    move/from16 v3, v17

    :goto_3c
    if-ge v3, v11, :cond_56

    .line 157
    aget-object v33, v25, v12

    move/from16 v34, v3

    aget v3, v33, v34

    invoke-virtual {v1, v3}, Lf6/l1;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/g;

    iget v3, v3, Li1/g;->a:I

    .line 158
    aget-object v33, p0, v27

    aget-boolean v3, v33, v3

    if-eqz v3, :cond_55

    .line 159
    aget-object v3, v26, v12

    const/16 v27, 0x1

    aput-boolean v27, v3, v11

    goto :goto_3d

    :cond_55
    add-int/lit8 v3, v34, 0x1

    goto :goto_3c

    .line 160
    :cond_56
    :goto_3d
    aget-object v3, v26, v12

    aget-boolean v3, v3, v11

    if-eqz v3, :cond_59

    if-lez v13, :cond_57

    if-ne v12, v13, :cond_57

    .line 161
    invoke-virtual {v0, v2}, Lh1/v;->k(I)I

    move-result v2

    aput v2, v9, v11

    goto :goto_3e

    .line 162
    :cond_57
    invoke-virtual {v0, v2}, Lh1/v;->v(I)V

    goto :goto_3e

    :cond_58
    move-object v15, v2

    move-object/from16 v26, v3

    :cond_59
    :goto_3e
    add-int/lit8 v11, v11, 0x1

    move-object v2, v15

    move-object/from16 v3, v26

    goto :goto_3b

    :cond_5a
    move-object v15, v2

    move-object/from16 v26, v3

    .line 163
    aget v2, v31, v12

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5b

    aget v2, v24, v12

    aget v2, v22, v2

    if-lez v2, :cond_5b

    .line 164
    invoke-virtual {v0}, Lh1/v;->u()V

    :cond_5b
    add-int/lit8 v12, v12, 0x1

    move-object v2, v15

    move-object/from16 v3, v26

    const/4 v11, 0x2

    goto/16 :goto_38

    :cond_5c
    move-object v15, v2

    move-object/from16 v26, v3

    const/16 v17, 0x0

    if-nez v13, :cond_5d

    .line 165
    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    .line 166
    :cond_5d
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    .line 167
    const-string v4, "expectedSize"

    invoke-static {v3, v4}, Lf6/u;->c(ILjava/lang/String;)V

    .line 168
    const-string v5, "initialCapacity"

    invoke-static {v3, v5}, Lf6/u;->c(ILjava/lang/String;)V

    .line 169
    new-array v7, v3, [Ljava/lang/Object;

    .line 170
    new-array v10, v6, [I

    move-object v13, v7

    move/from16 v7, v17

    move v11, v7

    move v12, v11

    :goto_3f
    if-ge v7, v3, :cond_66

    move/from16 v24, v7

    const/16 v7, 0x10

    .line 171
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v21

    .line 172
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v25

    .line 173
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v27

    move/from16 p0, v12

    if-eqz v27, :cond_5f

    const/4 v7, 0x2

    .line 174
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v12

    const/4 v7, 0x3

    if-ne v12, v7, :cond_5e

    .line 175
    invoke-virtual {v0}, Lh1/v;->u()V

    :cond_5e
    const/4 v7, 0x4

    .line 176
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v30

    .line 177
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v31

    move/from16 v35, v30

    move/from16 v36, v31

    goto :goto_40

    :cond_5f
    move/from16 v12, v17

    move/from16 v35, v12

    move/from16 v36, v35

    .line 178
    :goto_40
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v7

    if-eqz v7, :cond_63

    .line 179
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v7

    .line 180
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v30

    .line 181
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v31

    .line 182
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v33

    move/from16 v34, v7

    const/4 v7, 0x1

    if-eq v12, v7, :cond_61

    const/4 v7, 0x2

    if-ne v12, v7, :cond_60

    goto :goto_41

    :cond_60
    const/4 v7, 0x1

    goto :goto_42

    :cond_61
    :goto_41
    const/4 v7, 0x2

    :goto_42
    add-int v30, v34, v30

    mul-int v30, v30, v7

    sub-int v21, v21, v30

    const/4 v7, 0x1

    if-ne v12, v7, :cond_62

    const/4 v7, 0x2

    goto :goto_43

    :cond_62
    const/4 v7, 0x1

    :goto_43
    add-int v31, v31, v33

    mul-int v31, v31, v7

    sub-int v25, v25, v31

    :cond_63
    move/from16 v37, v21

    move/from16 v38, v25

    .line 183
    new-instance v33, Li1/j;

    move/from16 v34, v12

    invoke-direct/range {v33 .. v38}, Li1/j;-><init>(IIIII)V

    .line 184
    array-length v7, v13

    add-int/lit8 v12, v11, 0x1

    invoke-static {v7, v12}, Lf6/g0;->e(II)I

    move-result v7

    .line 185
    array-length v12, v13

    if-gt v7, v12, :cond_65

    if-eqz p0, :cond_64

    goto :goto_44

    :cond_64
    move/from16 v12, p0

    goto :goto_45

    .line 186
    :cond_65
    :goto_44
    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    move/from16 v12, v17

    :goto_45
    add-int/lit8 v7, v11, 0x1

    .line 187
    aput-object v33, v13, v11

    add-int/lit8 v11, v24, 0x1

    move/from16 v39, v11

    move v11, v7

    move/from16 v7, v39

    goto/16 :goto_3f

    :cond_66
    const/4 v7, 0x1

    if-le v3, v7, :cond_67

    .line 188
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v7

    if-eqz v7, :cond_67

    int-to-double v2, v3

    .line 189
    sget-object v7, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v2, v3}, Lh6/c;->c(D)I

    move-result v2

    const/4 v3, 0x1

    :goto_46
    if-ge v3, v6, :cond_68

    .line 190
    invoke-virtual {v0, v2}, Lh1/v;->k(I)I

    move-result v7

    aput v7, v10, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_46

    :cond_67
    const/4 v3, 0x1

    :goto_47
    if-ge v3, v6, :cond_68

    .line 191
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v7

    aput v7, v10, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_47

    .line 192
    :cond_68
    new-instance v2, Li1/i;

    .line 193
    invoke-static {v11, v13}, Lf6/m0;->h(I[Ljava/lang/Object;)Lf6/l1;

    move-result-object v3

    const/4 v7, 0x1

    .line 194
    invoke-direct {v2, v3, v10, v7}, Li1/i;-><init>(Lf6/l1;[II)V

    const/4 v7, 0x2

    .line 195
    invoke-virtual {v0, v7}, Lh1/v;->v(I)V

    const/4 v3, 0x1

    :goto_48
    if-ge v3, v6, :cond_6a

    .line 196
    aget v7, v28, v3

    aget v7, v22, v7

    if-nez v7, :cond_69

    .line 197
    invoke-virtual {v0}, Lh1/v;->u()V

    :cond_69
    add-int/lit8 v3, v3, 0x1

    goto :goto_48

    :cond_6a
    const/4 v3, 0x1

    :goto_49
    if-ge v3, v8, :cond_71

    .line 198
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v7

    move/from16 v10, v17

    .line 199
    :goto_4a
    aget v11, v29, v3

    if-ge v10, v11, :cond_70

    if-lez v10, :cond_6b

    if-eqz v7, :cond_6b

    .line 200
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v11

    goto :goto_4b

    :cond_6b
    if-nez v10, :cond_6c

    const/4 v11, 0x1

    goto :goto_4b

    :cond_6c
    move/from16 v11, v17

    :goto_4b
    if-eqz v11, :cond_6f

    move/from16 v11, v17

    .line 201
    :goto_4c
    aget v12, v32, v3

    if-ge v11, v12, :cond_6e

    .line 202
    aget-object v12, v26, v3

    aget-boolean v12, v12, v11

    if-eqz v12, :cond_6d

    .line 203
    invoke-virtual {v0}, Lh1/v;->o()I

    :cond_6d
    add-int/lit8 v11, v11, 0x1

    goto :goto_4c

    .line 204
    :cond_6e
    invoke-virtual {v0}, Lh1/v;->o()I

    .line 205
    invoke-virtual {v0}, Lh1/v;->o()I

    :cond_6f
    add-int/lit8 v10, v10, 0x1

    goto :goto_4a

    :cond_70
    add-int/lit8 v3, v3, 0x1

    goto :goto_49

    .line 206
    :cond_71
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v3

    const/16 v16, 0x2

    add-int/lit8 v3, v3, 0x2

    .line 207
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v7

    if-eqz v7, :cond_72

    .line 208
    invoke-virtual {v0, v3}, Lh1/v;->v(I)V

    goto :goto_4f

    :cond_72
    const/4 v7, 0x1

    :goto_4d
    if-ge v7, v6, :cond_75

    move/from16 v8, v17

    :goto_4e
    if-ge v8, v7, :cond_74

    .line 209
    aget-object v10, v20, v7

    aget-boolean v10, v10, v8

    if-eqz v10, :cond_73

    .line 210
    invoke-virtual {v0, v3}, Lh1/v;->v(I)V

    :cond_73
    add-int/lit8 v8, v8, 0x1

    goto :goto_4e

    :cond_74
    add-int/lit8 v7, v7, 0x1

    goto :goto_4d

    .line 211
    :cond_75
    :goto_4f
    invoke-virtual {v0}, Lh1/v;->o()I

    move-result v3

    const/4 v7, 0x1

    :goto_50
    if-gt v7, v3, :cond_76

    const/16 v13, 0x8

    .line 212
    invoke-virtual {v0, v13}, Lh1/v;->v(I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_50

    :cond_76
    const/16 v13, 0x8

    .line 213
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v3

    if-eqz v3, :cond_87

    .line 214
    iget v3, v0, Lh1/v;->e:I

    if-lez v3, :cond_77

    rsub-int/lit8 v3, v3, 0x8

    .line 215
    invoke-virtual {v0, v3}, Lh1/v;->v(I)V

    .line 216
    :cond_77
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v3

    if-nez v3, :cond_78

    .line 217
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v3

    goto :goto_51

    :cond_78
    const/4 v3, 0x1

    :goto_51
    if-eqz v3, :cond_79

    .line 218
    invoke-virtual {v0}, Lh1/v;->u()V

    .line 219
    :cond_79
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v3

    .line 220
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v7

    if-nez v3, :cond_7a

    if-eqz v7, :cond_80

    :cond_7a
    move/from16 v8, v17

    :goto_52
    if-ge v8, v14, :cond_80

    move/from16 v10, v17

    .line 221
    :goto_53
    aget v11, v29, v8

    if-ge v10, v11, :cond_7f

    if-eqz v3, :cond_7b

    .line 222
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v11

    goto :goto_54

    :cond_7b
    move/from16 v11, v17

    :goto_54
    if-eqz v7, :cond_7c

    .line 223
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v12

    goto :goto_55

    :cond_7c
    move/from16 v12, v17

    :goto_55
    if-eqz v11, :cond_7d

    const/16 v11, 0x20

    .line 224
    invoke-virtual {v0, v11}, Lh1/v;->v(I)V

    :cond_7d
    if-eqz v12, :cond_7e

    const/16 v11, 0x12

    .line 225
    invoke-virtual {v0, v11}, Lh1/v;->v(I)V

    :cond_7e
    add-int/lit8 v10, v10, 0x1

    goto :goto_53

    :cond_7f
    add-int/lit8 v8, v8, 0x1

    goto :goto_52

    .line 226
    :cond_80
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v3

    if-eqz v3, :cond_81

    const/4 v13, 0x4

    .line 227
    invoke-virtual {v0, v13}, Lh1/v;->k(I)I

    move-result v7

    const/16 v27, 0x1

    add-int/lit8 v7, v7, 0x1

    goto :goto_56

    :cond_81
    move v7, v6

    .line 228
    :goto_56
    invoke-static {v7, v4}, Lf6/u;->c(ILjava/lang/String;)V

    .line 229
    invoke-static {v7, v5}, Lf6/u;->c(ILjava/lang/String;)V

    .line 230
    new-array v4, v7, [Ljava/lang/Object;

    .line 231
    new-array v5, v6, [I

    move-object v11, v4

    move/from16 v4, v17

    move v8, v4

    move v10, v8

    :goto_57
    if-ge v4, v7, :cond_85

    const/4 v12, 0x3

    .line 232
    invoke-virtual {v0, v12}, Lh1/v;->v(I)V

    .line 233
    invoke-virtual {v0}, Lh1/v;->j()Z

    move-result v13

    if-eqz v13, :cond_82

    const/4 v13, 0x1

    :goto_58
    const/16 v14, 0x8

    goto :goto_59

    :cond_82
    move/from16 v13, v16

    goto :goto_58

    .line 234
    :goto_59
    invoke-virtual {v0, v14}, Lh1/v;->k(I)I

    move-result v18

    invoke-static/range {v18 .. v18}, Landroidx/media3/common/l;->f(I)I

    move-result v12

    .line 235
    invoke-virtual {v0, v14}, Lh1/v;->k(I)I

    move-result v18

    move/from16 p0, v3

    .line 236
    invoke-static/range {v18 .. v18}, Landroidx/media3/common/l;->g(I)I

    move-result v3

    .line 237
    invoke-virtual {v0, v14}, Lh1/v;->v(I)V

    .line 238
    new-instance v14, Li1/m;

    invoke-direct {v14, v12, v13, v3}, Li1/m;-><init>(III)V

    .line 239
    array-length v3, v11

    add-int/lit8 v12, v8, 0x1

    invoke-static {v3, v12}, Lf6/g0;->e(II)I

    move-result v3

    .line 240
    array-length v12, v11

    if-gt v3, v12, :cond_83

    if-eqz v10, :cond_84

    .line 241
    :cond_83
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    move/from16 v10, v17

    :cond_84
    add-int/lit8 v3, v8, 0x1

    .line 242
    aput-object v14, v11, v8

    add-int/lit8 v4, v4, 0x1

    move v8, v3

    move/from16 v3, p0

    goto :goto_57

    :cond_85
    move/from16 p0, v3

    if-eqz p0, :cond_86

    const/4 v10, 0x1

    if-le v7, v10, :cond_86

    move/from16 v13, v17

    :goto_5a
    if-ge v13, v6, :cond_86

    const/4 v7, 0x4

    .line 243
    invoke-virtual {v0, v7}, Lh1/v;->k(I)I

    move-result v3

    aput v3, v5, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_5a

    .line 244
    :cond_86
    new-instance v10, Li1/i;

    .line 245
    invoke-static {v8, v11}, Lf6/m0;->h(I[Ljava/lang/Object;)Lf6/l1;

    move-result-object v0

    const/4 v3, 0x2

    .line 246
    invoke-direct {v10, v0, v5, v3}, Li1/i;-><init>(Lf6/l1;[II)V

    goto :goto_5b

    :cond_87
    const/4 v10, 0x0

    .line 247
    :goto_5b
    new-instance v0, La1/h;

    new-instance v3, Li1/i;

    const/4 v4, 0x0

    invoke-direct {v3, v15, v9, v4}, Li1/i;-><init>(Lf6/l1;[II)V

    invoke-direct {v0, v1, v3, v2, v10}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    .line 248
    :cond_88
    :goto_5c
    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    .line 249
    :goto_5d
    new-instance v0, La1/h;

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0

    .line 250
    :goto_5e
    new-instance v0, La1/h;

    invoke-direct {v0, v1, v4, v1, v1}, La1/h;-><init>(Lf6/l1;Li1/i;Li1/i;Li1/i;)V

    return-object v0
.end method

.method public static i([BII)Li1/o;
    .locals 30

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/lit8 v1, p1, 0x1

    .line 3
    .line 4
    new-instance v2, Lh1/v;

    .line 5
    .line 6
    move-object/from16 v3, p0

    .line 7
    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v2, v3, v1, v4}, Lh1/v;-><init>([BII)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lh1/v;->k(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v2, v1}, Lh1/v;->k(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {v2, v1}, Lh1/v;->k(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/16 v3, 0x56

    .line 32
    .line 33
    const/16 v8, 0x2c

    .line 34
    .line 35
    const/16 v9, 0xf4

    .line 36
    .line 37
    const/16 v10, 0x7a

    .line 38
    .line 39
    const/16 v11, 0x6e

    .line 40
    .line 41
    const/4 v12, 0x3

    .line 42
    const/16 v15, 0x64

    .line 43
    .line 44
    if-eq v4, v15, :cond_1

    .line 45
    .line 46
    if-eq v4, v11, :cond_1

    .line 47
    .line 48
    if-eq v4, v10, :cond_1

    .line 49
    .line 50
    if-eq v4, v9, :cond_1

    .line 51
    .line 52
    if-eq v4, v8, :cond_1

    .line 53
    .line 54
    const/16 v14, 0x53

    .line 55
    .line 56
    if-eq v4, v14, :cond_1

    .line 57
    .line 58
    if-eq v4, v3, :cond_1

    .line 59
    .line 60
    const/16 v14, 0x76

    .line 61
    .line 62
    if-eq v4, v14, :cond_1

    .line 63
    .line 64
    const/16 v14, 0x80

    .line 65
    .line 66
    if-eq v4, v14, :cond_1

    .line 67
    .line 68
    const/16 v14, 0x8a

    .line 69
    .line 70
    if-ne v4, v14, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v14, v0

    .line 74
    const/16 p1, 0x10

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v13, 0x0

    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-ne v14, v12, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 89
    .line 90
    .line 91
    move-result v16

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const/16 v16, 0x0

    .line 94
    .line 95
    :goto_1
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 96
    .line 97
    .line 98
    move-result v17

    .line 99
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 100
    .line 101
    .line 102
    move-result v18

    .line 103
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 107
    .line 108
    .line 109
    move-result v19

    .line 110
    if-eqz v19, :cond_8

    .line 111
    .line 112
    if-eq v14, v12, :cond_3

    .line 113
    .line 114
    move v13, v1

    .line 115
    :goto_2
    const/16 p1, 0x10

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    const/16 v19, 0xc

    .line 119
    .line 120
    move/from16 v13, v19

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_3
    const/4 v1, 0x0

    .line 124
    :goto_4
    if-ge v1, v13, :cond_9

    .line 125
    .line 126
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 127
    .line 128
    .line 129
    move-result v19

    .line 130
    if-eqz v19, :cond_7

    .line 131
    .line 132
    const/4 v9, 0x6

    .line 133
    if-ge v1, v9, :cond_4

    .line 134
    .line 135
    move/from16 v9, p1

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    const/16 v9, 0x40

    .line 139
    .line 140
    :goto_5
    const/4 v10, 0x0

    .line 141
    const/16 v20, 0x8

    .line 142
    .line 143
    const/16 v21, 0x8

    .line 144
    .line 145
    :goto_6
    if-ge v10, v9, :cond_7

    .line 146
    .line 147
    if-eqz v20, :cond_5

    .line 148
    .line 149
    invoke-virtual {v2}, Lh1/v;->p()I

    .line 150
    .line 151
    .line 152
    move-result v20

    .line 153
    add-int v11, v20, v21

    .line 154
    .line 155
    add-int/lit16 v11, v11, 0x100

    .line 156
    .line 157
    rem-int/lit16 v11, v11, 0x100

    .line 158
    .line 159
    move/from16 v20, v11

    .line 160
    .line 161
    :cond_5
    if-nez v20, :cond_6

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_6
    move/from16 v21, v20

    .line 165
    .line 166
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    const/16 v11, 0x6e

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    const/16 v9, 0xf4

    .line 174
    .line 175
    const/16 v10, 0x7a

    .line 176
    .line 177
    const/16 v11, 0x6e

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_8
    const/16 p1, 0x10

    .line 181
    .line 182
    :cond_9
    move/from16 v13, v16

    .line 183
    .line 184
    move/from16 v11, v17

    .line 185
    .line 186
    :goto_8
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    add-int/lit8 v1, v1, 0x4

    .line 191
    .line 192
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-nez v9, :cond_a

    .line 197
    .line 198
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    add-int/lit8 v10, v10, 0x4

    .line 203
    .line 204
    move/from16 v17, v4

    .line 205
    .line 206
    move/from16 v23, v9

    .line 207
    .line 208
    move/from16 v3, v18

    .line 209
    .line 210
    :goto_9
    const/16 v18, 0x0

    .line 211
    .line 212
    goto :goto_b

    .line 213
    :cond_a
    if-ne v9, v0, :cond_c

    .line 214
    .line 215
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    invoke-virtual {v2}, Lh1/v;->p()I

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Lh1/v;->p()I

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 226
    .line 227
    .line 228
    move-result v15

    .line 229
    move/from16 v17, v4

    .line 230
    .line 231
    int-to-long v3, v15

    .line 232
    move/from16 v23, v9

    .line 233
    .line 234
    const/4 v15, 0x0

    .line 235
    :goto_a
    int-to-long v8, v15

    .line 236
    cmp-long v8, v8, v3

    .line 237
    .line 238
    if-gez v8, :cond_b

    .line 239
    .line 240
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 241
    .line 242
    .line 243
    add-int/lit8 v15, v15, 0x1

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_b
    move/from16 v3, v18

    .line 247
    .line 248
    move/from16 v18, v10

    .line 249
    .line 250
    const/4 v10, 0x0

    .line 251
    goto :goto_b

    .line 252
    :cond_c
    move/from16 v17, v4

    .line 253
    .line 254
    move/from16 v23, v9

    .line 255
    .line 256
    move/from16 v3, v18

    .line 257
    .line 258
    const/4 v10, 0x0

    .line 259
    goto :goto_9

    .line 260
    :goto_b
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    add-int/2addr v4, v0

    .line 271
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    add-int/2addr v8, v0

    .line 276
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    rsub-int/lit8 v15, v9, 0x2

    .line 281
    .line 282
    mul-int/2addr v8, v15

    .line 283
    if-nez v9, :cond_d

    .line 284
    .line 285
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 286
    .line 287
    .line 288
    :cond_d
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 289
    .line 290
    .line 291
    mul-int/lit8 v4, v4, 0x10

    .line 292
    .line 293
    mul-int/lit8 v8, v8, 0x10

    .line 294
    .line 295
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 296
    .line 297
    .line 298
    move-result v24

    .line 299
    const/16 v25, 0x2

    .line 300
    .line 301
    if-eqz v24, :cond_11

    .line 302
    .line 303
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 304
    .line 305
    .line 306
    move-result v24

    .line 307
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 308
    .line 309
    .line 310
    move-result v26

    .line 311
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 312
    .line 313
    .line 314
    move-result v27

    .line 315
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 316
    .line 317
    .line 318
    move-result v28

    .line 319
    if-nez v14, :cond_e

    .line 320
    .line 321
    move/from16 v29, v0

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_e
    if-ne v14, v12, :cond_f

    .line 325
    .line 326
    move/from16 v29, v0

    .line 327
    .line 328
    goto :goto_c

    .line 329
    :cond_f
    move/from16 v29, v25

    .line 330
    .line 331
    :goto_c
    if-ne v14, v0, :cond_10

    .line 332
    .line 333
    move/from16 v14, v25

    .line 334
    .line 335
    goto :goto_d

    .line 336
    :cond_10
    move v14, v0

    .line 337
    :goto_d
    mul-int/2addr v15, v14

    .line 338
    :goto_e
    add-int v24, v24, v26

    .line 339
    .line 340
    mul-int v24, v24, v29

    .line 341
    .line 342
    sub-int v4, v4, v24

    .line 343
    .line 344
    add-int v27, v27, v28

    .line 345
    .line 346
    mul-int v27, v27, v15

    .line 347
    .line 348
    sub-int v8, v8, v27

    .line 349
    .line 350
    :cond_11
    move v14, v9

    .line 351
    const/16 v15, 0x2c

    .line 352
    .line 353
    move v9, v8

    .line 354
    move v8, v4

    .line 355
    move/from16 v4, v17

    .line 356
    .line 357
    if-eq v4, v15, :cond_12

    .line 358
    .line 359
    const/16 v15, 0x56

    .line 360
    .line 361
    if-eq v4, v15, :cond_12

    .line 362
    .line 363
    const/16 v15, 0x64

    .line 364
    .line 365
    if-eq v4, v15, :cond_12

    .line 366
    .line 367
    const/16 v15, 0x6e

    .line 368
    .line 369
    if-eq v4, v15, :cond_12

    .line 370
    .line 371
    const/16 v15, 0x7a

    .line 372
    .line 373
    if-eq v4, v15, :cond_12

    .line 374
    .line 375
    const/16 v15, 0xf4

    .line 376
    .line 377
    if-ne v4, v15, :cond_13

    .line 378
    .line 379
    :cond_12
    and-int/lit8 v15, v5, 0x10

    .line 380
    .line 381
    if-eqz v15, :cond_13

    .line 382
    .line 383
    const/4 v15, 0x0

    .line 384
    goto :goto_f

    .line 385
    :cond_13
    move/from16 v15, p1

    .line 386
    .line 387
    :goto_f
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 388
    .line 389
    .line 390
    move-result v16

    .line 391
    const/16 v17, -0x1

    .line 392
    .line 393
    const/high16 v19, 0x3f800000    # 1.0f

    .line 394
    .line 395
    if-eqz v16, :cond_22

    .line 396
    .line 397
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 398
    .line 399
    .line 400
    move-result v16

    .line 401
    if-eqz v16, :cond_14

    .line 402
    .line 403
    const/16 v0, 0x8

    .line 404
    .line 405
    invoke-virtual {v2, v0}, Lh1/v;->k(I)I

    .line 406
    .line 407
    .line 408
    move-result v12

    .line 409
    const/16 v0, 0xff

    .line 410
    .line 411
    if-ne v12, v0, :cond_15

    .line 412
    .line 413
    move/from16 v0, p1

    .line 414
    .line 415
    invoke-virtual {v2, v0}, Lh1/v;->k(I)I

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    invoke-virtual {v2, v0}, Lh1/v;->k(I)I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v12, :cond_14

    .line 424
    .line 425
    if-eqz v0, :cond_14

    .line 426
    .line 427
    int-to-float v12, v12

    .line 428
    int-to-float v0, v0

    .line 429
    div-float v19, v12, v0

    .line 430
    .line 431
    :cond_14
    :goto_10
    move/from16 p1, v1

    .line 432
    .line 433
    goto :goto_11

    .line 434
    :cond_15
    const/16 v0, 0x11

    .line 435
    .line 436
    if-ge v12, v0, :cond_16

    .line 437
    .line 438
    sget-object v0, Li1/p;->b:[F

    .line 439
    .line 440
    aget v19, v0, v12

    .line 441
    .line 442
    goto :goto_10

    .line 443
    :cond_16
    const-string v0, "NalUnitUtil"

    .line 444
    .line 445
    move/from16 p1, v1

    .line 446
    .line 447
    const-string v1, "Unexpected aspect_ratio_idc value: "

    .line 448
    .line 449
    invoke-static {v1, v12, v0}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 450
    .line 451
    .line 452
    :goto_11
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-eqz v0, :cond_17

    .line 457
    .line 458
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 459
    .line 460
    .line 461
    :cond_17
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_1a

    .line 466
    .line 467
    const/4 v0, 0x3

    .line 468
    invoke-virtual {v2, v0}, Lh1/v;->v(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-eqz v0, :cond_18

    .line 476
    .line 477
    const/4 v0, 0x1

    .line 478
    goto :goto_12

    .line 479
    :cond_18
    move/from16 v0, v25

    .line 480
    .line 481
    :goto_12
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-eqz v1, :cond_19

    .line 486
    .line 487
    const/16 v1, 0x8

    .line 488
    .line 489
    invoke-virtual {v2, v1}, Lh1/v;->k(I)I

    .line 490
    .line 491
    .line 492
    move-result v12

    .line 493
    invoke-virtual {v2, v1}, Lh1/v;->k(I)I

    .line 494
    .line 495
    .line 496
    move-result v16

    .line 497
    invoke-virtual {v2, v1}, Lh1/v;->v(I)V

    .line 498
    .line 499
    .line 500
    invoke-static {v12}, Landroidx/media3/common/l;->f(I)I

    .line 501
    .line 502
    .line 503
    move-result v17

    .line 504
    invoke-static/range {v16 .. v16}, Landroidx/media3/common/l;->g(I)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    goto :goto_13

    .line 509
    :cond_19
    move/from16 v1, v17

    .line 510
    .line 511
    goto :goto_13

    .line 512
    :cond_1a
    move/from16 v0, v17

    .line 513
    .line 514
    move v1, v0

    .line 515
    :goto_13
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 516
    .line 517
    .line 518
    move-result v12

    .line 519
    if-eqz v12, :cond_1b

    .line 520
    .line 521
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 525
    .line 526
    .line 527
    :cond_1b
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 528
    .line 529
    .line 530
    move-result v12

    .line 531
    if-eqz v12, :cond_1c

    .line 532
    .line 533
    const/16 v12, 0x41

    .line 534
    .line 535
    invoke-virtual {v2, v12}, Lh1/v;->v(I)V

    .line 536
    .line 537
    .line 538
    :cond_1c
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 539
    .line 540
    .line 541
    move-result v12

    .line 542
    if-eqz v12, :cond_1d

    .line 543
    .line 544
    invoke-static {v2}, Li1/p;->j(Lh1/v;)V

    .line 545
    .line 546
    .line 547
    :cond_1d
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 548
    .line 549
    .line 550
    move-result v16

    .line 551
    if-eqz v16, :cond_1e

    .line 552
    .line 553
    invoke-static {v2}, Li1/p;->j(Lh1/v;)V

    .line 554
    .line 555
    .line 556
    :cond_1e
    if-nez v12, :cond_1f

    .line 557
    .line 558
    if-eqz v16, :cond_20

    .line 559
    .line 560
    :cond_1f
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 561
    .line 562
    .line 563
    :cond_20
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Lh1/v;->j()Z

    .line 567
    .line 568
    .line 569
    move-result v12

    .line 570
    if-eqz v12, :cond_21

    .line 571
    .line 572
    invoke-virtual {v2}, Lh1/v;->u()V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 588
    .line 589
    .line 590
    move-result v15

    .line 591
    invoke-virtual {v2}, Lh1/v;->o()I

    .line 592
    .line 593
    .line 594
    :cond_21
    move/from16 v12, v17

    .line 595
    .line 596
    move/from16 v17, v10

    .line 597
    .line 598
    move/from16 v10, v19

    .line 599
    .line 600
    move/from16 v19, v12

    .line 601
    .line 602
    move/from16 v20, v0

    .line 603
    .line 604
    move/from16 v21, v1

    .line 605
    .line 606
    move v12, v3

    .line 607
    move/from16 v22, v15

    .line 608
    .line 609
    goto :goto_14

    .line 610
    :cond_22
    move/from16 p1, v1

    .line 611
    .line 612
    move v12, v3

    .line 613
    move/from16 v22, v15

    .line 614
    .line 615
    move/from16 v20, v17

    .line 616
    .line 617
    move/from16 v21, v20

    .line 618
    .line 619
    move/from16 v17, v10

    .line 620
    .line 621
    move/from16 v10, v19

    .line 622
    .line 623
    move/from16 v19, v21

    .line 624
    .line 625
    :goto_14
    new-instance v3, Li1/o;

    .line 626
    .line 627
    move/from16 v15, p1

    .line 628
    .line 629
    move/from16 v16, v23

    .line 630
    .line 631
    invoke-direct/range {v3 .. v22}, Li1/o;-><init>(IIIIIIFIIZZIIIZIIII)V

    .line 632
    .line 633
    .line 634
    return-object v3
.end method

.method public static j(Lh1/v;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh1/v;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lh1/v;->v(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lh1/v;->o()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lh1/v;->o()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lh1/v;->u()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x14

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lh1/v;->v(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static k([BI)I
    .locals 8

    .line 1
    sget-object v0, Li1/p;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    :goto_0
    if-ge v2, p1, :cond_4

    .line 8
    .line 9
    :goto_1
    add-int/lit8 v4, p1, -0x2

    .line 10
    .line 11
    if-ge v2, v4, :cond_2

    .line 12
    .line 13
    :try_start_0
    aget-byte v4, p0, v2

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    add-int/lit8 v4, v2, 0x1

    .line 18
    .line 19
    aget-byte v4, p0, v4

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v4, v2, 0x2

    .line 24
    .line 25
    aget-byte v4, p0, v4

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    if-ne v4, v5, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, p1

    .line 35
    :goto_2
    if-ge v2, p1, :cond_0

    .line 36
    .line 37
    sget-object v4, Li1/p;->d:[I

    .line 38
    .line 39
    array-length v5, v4

    .line 40
    if-gt v5, v3, :cond_3

    .line 41
    .line 42
    array-length v5, v4

    .line 43
    mul-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sput-object v4, Li1/p;->d:[I

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_5

    .line 54
    :cond_3
    :goto_3
    sget-object v4, Li1/p;->d:[I

    .line 55
    .line 56
    add-int/lit8 v5, v3, 0x1

    .line 57
    .line 58
    aput v2, v4, v3

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x3

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    sub-int/2addr p1, v3

    .line 65
    move v2, v1

    .line 66
    move v4, v2

    .line 67
    move v5, v4

    .line 68
    :goto_4
    if-ge v2, v3, :cond_5

    .line 69
    .line 70
    sget-object v6, Li1/p;->d:[I

    .line 71
    .line 72
    aget v6, v6, v2

    .line 73
    .line 74
    sub-int/2addr v6, v5

    .line 75
    invoke-static {p0, v5, p0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    add-int/2addr v4, v6

    .line 79
    add-int/lit8 v7, v4, 0x1

    .line 80
    .line 81
    aput-byte v1, p0, v4

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x2

    .line 84
    .line 85
    aput-byte v1, p0, v7

    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x3

    .line 88
    .line 89
    add-int/2addr v5, v6

    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    sub-int v1, p1, v4

    .line 94
    .line 95
    invoke-static {p0, v5, p0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    monitor-exit v0

    .line 99
    return p1

    .line 100
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0
.end method
