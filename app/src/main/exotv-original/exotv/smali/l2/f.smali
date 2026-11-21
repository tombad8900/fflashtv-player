.class public final Ll2/f;
.super Ll2/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final h:Lh1/w;

.field public final i:Lh1/v;

.field public j:I

.field public final k:I

.field public final l:[Ll2/e;

.field public m:Ll2/e;

.field public n:Ljava/util/List;

.field public o:Ljava/util/List;

.field public p:Lh1/v;

.field public q:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ll2/h;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh1/w;

    .line 5
    .line 6
    invoke-direct {v0}, Lh1/w;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ll2/f;->h:Lh1/w;

    .line 10
    .line 11
    new-instance v0, Lh1/v;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lh1/v;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ll2/f;->i:Lh1/v;

    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    iput v0, p0, Ll2/f;->j:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    move p1, v2

    .line 26
    :cond_0
    iput p1, p0, Ll2/f;->k:I

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    sget-object p1, Lh1/c;->a:[B

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-ne p1, v2, :cond_1

    .line 37
    .line 38
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, [B

    .line 43
    .line 44
    array-length p1, p1

    .line 45
    if-ne p1, v2, :cond_1

    .line 46
    .line 47
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, [B

    .line 52
    .line 53
    aget-byte p1, p1, v1

    .line 54
    .line 55
    :cond_1
    const/16 p1, 0x8

    .line 56
    .line 57
    new-array p2, p1, [Ll2/e;

    .line 58
    .line 59
    iput-object p2, p0, Ll2/f;->l:[Ll2/e;

    .line 60
    .line 61
    move p2, v1

    .line 62
    :goto_0
    if-ge p2, p1, :cond_2

    .line 63
    .line 64
    iget-object v0, p0, Ll2/f;->l:[Ll2/e;

    .line 65
    .line 66
    new-instance v2, Ll2/e;

    .line 67
    .line 68
    invoke-direct {v2}, Ll2/e;-><init>()V

    .line 69
    .line 70
    .line 71
    aput-object v2, v0, p2

    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p1, p0, Ll2/f;->l:[Ll2/e;

    .line 77
    .line 78
    aget-object p1, p1, v1

    .line 79
    .line 80
    iput-object p1, p0, Ll2/f;->m:Ll2/e;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a()Ll/o;
    .locals 2

    .line 1
    iget-object v0, p0, Ll2/f;->n:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Ll2/f;->o:Ljava/util/List;

    .line 4
    .line 5
    new-instance v1, Ll/o;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Ll/o;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final b(Ll2/g;)V
    .locals 10

    .line 1
    iget-object p1, p1, Lm1/g;->data:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v1, p0, Ll2/f;->h:Lh1/w;

    .line 15
    .line 16
    invoke-virtual {v1, v0, p1}, Lh1/w;->E([BI)V

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x3

    .line 24
    if-lt p1, v0, :cond_9

    .line 25
    .line 26
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    and-int/lit8 v2, p1, 0x3

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    and-int/2addr p1, v3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-ne p1, v3, :cond_1

    .line 37
    .line 38
    move p1, v5

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move p1, v4

    .line 41
    :goto_1
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    int-to-byte v6, v6

    .line 46
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    int-to-byte v7, v7

    .line 51
    const/4 v8, 0x2

    .line 52
    if-eq v2, v8, :cond_2

    .line 53
    .line 54
    if-eq v2, v0, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    if-nez p1, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-string p1, "Cea708Decoder"

    .line 61
    .line 62
    if-ne v2, v0, :cond_6

    .line 63
    .line 64
    invoke-virtual {p0}, Ll2/f;->e()V

    .line 65
    .line 66
    .line 67
    and-int/lit16 v0, v6, 0xc0

    .line 68
    .line 69
    shr-int/lit8 v0, v0, 0x6

    .line 70
    .line 71
    iget v2, p0, Ll2/f;->j:I

    .line 72
    .line 73
    const/4 v9, -0x1

    .line 74
    if-eq v2, v9, :cond_4

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    rem-int/2addr v2, v3

    .line 79
    if-eq v0, v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Ll2/f;->g()V

    .line 82
    .line 83
    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v3, "Sequence number discontinuity. previous="

    .line 87
    .line 88
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget v3, p0, Ll2/f;->j:I

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v3, " current="

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {p1, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    iput v0, p0, Ll2/f;->j:I

    .line 112
    .line 113
    and-int/lit8 p1, v6, 0x3f

    .line 114
    .line 115
    if-nez p1, :cond_5

    .line 116
    .line 117
    const/16 p1, 0x40

    .line 118
    .line 119
    :cond_5
    new-instance v2, Lh1/v;

    .line 120
    .line 121
    invoke-direct {v2, v0, p1}, Lh1/v;-><init>(II)V

    .line 122
    .line 123
    .line 124
    iput-object v2, p0, Ll2/f;->p:Lh1/v;

    .line 125
    .line 126
    iget-object p1, v2, Lh1/v;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p1, [B

    .line 129
    .line 130
    iput v5, v2, Lh1/v;->e:I

    .line 131
    .line 132
    aput-byte v7, p1, v4

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    if-ne v2, v8, :cond_7

    .line 136
    .line 137
    move v4, v5

    .line 138
    :cond_7
    invoke-static {v4}, Lh1/a;->d(Z)V

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Ll2/f;->p:Lh1/v;

    .line 142
    .line 143
    if-nez v0, :cond_8

    .line 144
    .line 145
    const-string v0, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START"

    .line 146
    .line 147
    invoke-static {p1, v0}, Lh1/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_8
    iget-object p1, v0, Lh1/v;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, [B

    .line 155
    .line 156
    iget v2, v0, Lh1/v;->e:I

    .line 157
    .line 158
    add-int/lit8 v3, v2, 0x1

    .line 159
    .line 160
    iput v3, v0, Lh1/v;->e:I

    .line 161
    .line 162
    aput-byte v6, p1, v2

    .line 163
    .line 164
    add-int/2addr v2, v8

    .line 165
    iput v2, v0, Lh1/v;->e:I

    .line 166
    .line 167
    aput-byte v7, p1, v3

    .line 168
    .line 169
    :goto_2
    iget-object p1, p0, Ll2/f;->p:Lh1/v;

    .line 170
    .line 171
    iget v0, p1, Lh1/v;->e:I

    .line 172
    .line 173
    iget p1, p1, Lh1/v;->d:I

    .line 174
    .line 175
    mul-int/2addr p1, v8

    .line 176
    sub-int/2addr p1, v5

    .line 177
    if-ne v0, p1, :cond_0

    .line 178
    .line 179
    invoke-virtual {p0}, Ll2/f;->e()V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_9
    return-void
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ll2/f;->n:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Ll2/f;->o:Ljava/util/List;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final e()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ll2/f;->p:Lh1/v;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v2, v1, Lh1/v;->e:I

    .line 9
    .line 10
    iget v1, v1, Lh1/v;->d:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    mul-int/2addr v1, v3

    .line 14
    const/4 v4, 0x1

    .line 15
    sub-int/2addr v1, v4

    .line 16
    const-string v5, "Cea708Decoder"

    .line 17
    .line 18
    if-eq v2, v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "DtvCcPacket ended prematurely; size is "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, Ll2/f;->p:Lh1/v;

    .line 28
    .line 29
    iget v2, v2, Lh1/v;->d:I

    .line 30
    .line 31
    mul-int/2addr v2, v3

    .line 32
    sub-int/2addr v2, v4

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, ", but current index is "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, Ll2/f;->p:Lh1/v;

    .line 42
    .line 43
    iget v2, v2, Lh1/v;->e:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, " (sequence number "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, v0, Ll2/f;->p:Lh1/v;

    .line 54
    .line 55
    iget v2, v2, Lh1/v;->c:I

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, ");"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v5, v1}, Lh1/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v1, v0, Ll2/f;->p:Lh1/v;

    .line 73
    .line 74
    iget-object v2, v1, Lh1/v;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, [B

    .line 77
    .line 78
    iget v1, v1, Lh1/v;->e:I

    .line 79
    .line 80
    iget-object v6, v0, Ll2/f;->i:Lh1/v;

    .line 81
    .line 82
    invoke-virtual {v6, v2, v1}, Lh1/v;->r([BI)V

    .line 83
    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    :cond_2
    :goto_0
    invoke-virtual {v6}, Lh1/v;->c()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-lez v7, :cond_38

    .line 91
    .line 92
    const/4 v7, 0x3

    .line 93
    invoke-virtual {v6, v7}, Lh1/v;->k(I)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    const/4 v9, 0x5

    .line 98
    invoke-virtual {v6, v9}, Lh1/v;->k(I)I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    const/4 v10, 0x6

    .line 103
    const/4 v11, 0x7

    .line 104
    if-ne v8, v11, :cond_3

    .line 105
    .line 106
    invoke-virtual {v6, v3}, Lh1/v;->v(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v10}, Lh1/v;->k(I)I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-ge v8, v11, :cond_3

    .line 114
    .line 115
    const-string v12, "Invalid extended service number: "

    .line 116
    .line 117
    invoke-static {v12, v8, v5}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    if-nez v9, :cond_4

    .line 121
    .line 122
    if-eqz v8, :cond_38

    .line 123
    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v3, "serviceNumber is non-zero ("

    .line 127
    .line 128
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v3, ") when blockSize is 0"

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v5, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_17

    .line 147
    .line 148
    :cond_4
    iget v12, v0, Ll2/f;->k:I

    .line 149
    .line 150
    if-eq v8, v12, :cond_5

    .line 151
    .line 152
    invoke-virtual {v6, v9}, Lh1/v;->w(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_5
    invoke-virtual {v6}, Lh1/v;->i()I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    mul-int/lit8 v9, v9, 0x8

    .line 161
    .line 162
    add-int/2addr v9, v8

    .line 163
    :goto_1
    invoke-virtual {v6}, Lh1/v;->i()I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-ge v8, v9, :cond_2

    .line 168
    .line 169
    const/16 v8, 0x8

    .line 170
    .line 171
    invoke-virtual {v6, v8}, Lh1/v;->k(I)I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    const/16 v14, 0x17

    .line 176
    .line 177
    const/16 v15, 0x9f

    .line 178
    .line 179
    const/16 v1, 0x7f

    .line 180
    .line 181
    const/16 v13, 0x18

    .line 182
    .line 183
    const/16 v4, 0x1f

    .line 184
    .line 185
    const/16 v10, 0x10

    .line 186
    .line 187
    if-eq v12, v10, :cond_22

    .line 188
    .line 189
    const/16 v11, 0xa

    .line 190
    .line 191
    if-gt v12, v4, :cond_b

    .line 192
    .line 193
    if-eqz v12, :cond_a

    .line 194
    .line 195
    if-eq v12, v7, :cond_9

    .line 196
    .line 197
    if-eq v12, v8, :cond_8

    .line 198
    .line 199
    packed-switch v12, :pswitch_data_0

    .line 200
    .line 201
    .line 202
    const/16 v1, 0x11

    .line 203
    .line 204
    if-lt v12, v1, :cond_6

    .line 205
    .line 206
    if-gt v12, v14, :cond_6

    .line 207
    .line 208
    new-instance v1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v4, "Currently unsupported COMMAND_EXT1 Command: "

    .line 211
    .line 212
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v5, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6, v8}, Lh1/v;->v(I)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_6
    if-lt v12, v13, :cond_7

    .line 230
    .line 231
    if-gt v12, v4, :cond_7

    .line 232
    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v4, "Currently unsupported COMMAND_P16 Command: "

    .line 236
    .line 237
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-static {v5, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6, v10}, Lh1/v;->v(I)V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_7
    const-string v1, "Invalid C0 command: "

    .line 255
    .line 256
    invoke-static {v1, v12, v5}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :pswitch_0
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 261
    .line 262
    invoke-virtual {v1, v11}, Ll2/e;->a(C)V

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :pswitch_1
    invoke-virtual {v0}, Ll2/f;->g()V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_8
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 271
    .line 272
    iget-object v1, v1, Ll2/e;->b:Landroid/text/SpannableStringBuilder;

    .line 273
    .line 274
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-lez v4, :cond_a

    .line 279
    .line 280
    add-int/lit8 v8, v4, -0x1

    .line 281
    .line 282
    invoke-virtual {v1, v8, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 283
    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_9
    invoke-virtual {v0}, Ll2/f;->f()Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    iput-object v1, v0, Ll2/f;->n:Ljava/util/List;

    .line 291
    .line 292
    :cond_a
    :goto_2
    :pswitch_2
    move v1, v3

    .line 293
    goto :goto_4

    .line 294
    :cond_b
    if-gt v12, v1, :cond_d

    .line 295
    .line 296
    if-ne v12, v1, :cond_c

    .line 297
    .line 298
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 299
    .line 300
    const/16 v2, 0x266b

    .line 301
    .line 302
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 303
    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_c
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 307
    .line 308
    and-int/lit16 v2, v12, 0xff

    .line 309
    .line 310
    int-to-char v2, v2

    .line 311
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 312
    .line 313
    .line 314
    :goto_3
    move v1, v3

    .line 315
    const/4 v2, 0x1

    .line 316
    :goto_4
    const/4 v3, 0x7

    .line 317
    const/4 v10, 0x6

    .line 318
    const/4 v11, 0x0

    .line 319
    goto/16 :goto_16

    .line 320
    .line 321
    :cond_d
    if-gt v12, v15, :cond_20

    .line 322
    .line 323
    const/4 v1, 0x4

    .line 324
    iget-object v2, v0, Ll2/f;->l:[Ll2/e;

    .line 325
    .line 326
    packed-switch v12, :pswitch_data_1

    .line 327
    .line 328
    .line 329
    :pswitch_3
    const-string v1, "Invalid C1 command: "

    .line 330
    .line 331
    invoke-static {v1, v12, v5}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 332
    .line 333
    .line 334
    :cond_e
    :goto_5
    :pswitch_4
    const/4 v3, 0x1

    .line 335
    :cond_f
    :goto_6
    const/4 v11, 0x0

    .line 336
    goto/16 :goto_10

    .line 337
    .line 338
    :pswitch_5
    add-int/lit16 v12, v12, -0x98

    .line 339
    .line 340
    aget-object v4, v2, v12

    .line 341
    .line 342
    invoke-virtual {v6, v3}, Lh1/v;->v(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    invoke-virtual {v6, v3}, Lh1/v;->v(I)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v6, v7}, Lh1/v;->k(I)I

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    const/4 v14, 0x7

    .line 361
    invoke-virtual {v6, v14}, Lh1/v;->k(I)I

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    invoke-virtual {v6, v8}, Lh1/v;->k(I)I

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 370
    .line 371
    .line 372
    move-result v14

    .line 373
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    invoke-virtual {v6, v3}, Lh1/v;->v(I)V

    .line 378
    .line 379
    .line 380
    const/4 v7, 0x6

    .line 381
    invoke-virtual {v6, v7}, Lh1/v;->v(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v6, v3}, Lh1/v;->v(I)V

    .line 385
    .line 386
    .line 387
    const/4 v7, 0x3

    .line 388
    invoke-virtual {v6, v7}, Lh1/v;->k(I)I

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    move/from16 v16, v1

    .line 393
    .line 394
    invoke-virtual {v6, v7}, Lh1/v;->k(I)I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    iget-object v7, v4, Ll2/e;->a:Ljava/util/ArrayList;

    .line 399
    .line 400
    move-object/from16 v18, v2

    .line 401
    .line 402
    const/4 v2, 0x1

    .line 403
    iput-boolean v2, v4, Ll2/e;->c:Z

    .line 404
    .line 405
    iput-boolean v10, v4, Ll2/e;->d:Z

    .line 406
    .line 407
    iput v11, v4, Ll2/e;->e:I

    .line 408
    .line 409
    iput-boolean v13, v4, Ll2/e;->f:Z

    .line 410
    .line 411
    iput v15, v4, Ll2/e;->g:I

    .line 412
    .line 413
    iput v8, v4, Ll2/e;->h:I

    .line 414
    .line 415
    iput v14, v4, Ll2/e;->i:I

    .line 416
    .line 417
    iget v8, v4, Ll2/e;->j:I

    .line 418
    .line 419
    add-int/lit8 v10, v16, 0x1

    .line 420
    .line 421
    if-eq v8, v10, :cond_11

    .line 422
    .line 423
    iput v10, v4, Ll2/e;->j:I

    .line 424
    .line 425
    :goto_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    iget v8, v4, Ll2/e;->j:I

    .line 430
    .line 431
    if-ge v2, v8, :cond_10

    .line 432
    .line 433
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    const/16 v8, 0xf

    .line 438
    .line 439
    if-lt v2, v8, :cond_11

    .line 440
    .line 441
    :cond_10
    const/4 v2, 0x0

    .line 442
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    goto :goto_7

    .line 446
    :cond_11
    if-eqz v3, :cond_12

    .line 447
    .line 448
    iget v2, v4, Ll2/e;->l:I

    .line 449
    .line 450
    if-eq v2, v3, :cond_12

    .line 451
    .line 452
    iput v3, v4, Ll2/e;->l:I

    .line 453
    .line 454
    add-int/lit8 v3, v3, -0x1

    .line 455
    .line 456
    sget-object v2, Ll2/e;->B:[I

    .line 457
    .line 458
    aget v2, v2, v3

    .line 459
    .line 460
    sget-object v7, Ll2/e;->A:[Z

    .line 461
    .line 462
    aget-boolean v7, v7, v3

    .line 463
    .line 464
    sget-object v7, Ll2/e;->y:[I

    .line 465
    .line 466
    aget v7, v7, v3

    .line 467
    .line 468
    sget-object v7, Ll2/e;->z:[I

    .line 469
    .line 470
    aget v7, v7, v3

    .line 471
    .line 472
    sget-object v7, Ll2/e;->x:[I

    .line 473
    .line 474
    aget v3, v7, v3

    .line 475
    .line 476
    iput v2, v4, Ll2/e;->n:I

    .line 477
    .line 478
    iput v3, v4, Ll2/e;->k:I

    .line 479
    .line 480
    :cond_12
    if-eqz v1, :cond_13

    .line 481
    .line 482
    iget v2, v4, Ll2/e;->m:I

    .line 483
    .line 484
    if-eq v2, v1, :cond_13

    .line 485
    .line 486
    iput v1, v4, Ll2/e;->m:I

    .line 487
    .line 488
    add-int/lit8 v1, v1, -0x1

    .line 489
    .line 490
    sget-object v2, Ll2/e;->D:[I

    .line 491
    .line 492
    aget v2, v2, v1

    .line 493
    .line 494
    sget-object v2, Ll2/e;->C:[I

    .line 495
    .line 496
    aget v2, v2, v1

    .line 497
    .line 498
    const/4 v2, 0x0

    .line 499
    invoke-virtual {v4, v2, v2}, Ll2/e;->e(ZZ)V

    .line 500
    .line 501
    .line 502
    sget v2, Ll2/e;->v:I

    .line 503
    .line 504
    sget-object v3, Ll2/e;->E:[I

    .line 505
    .line 506
    aget v1, v3, v1

    .line 507
    .line 508
    invoke-virtual {v4, v2, v1}, Ll2/e;->f(II)V

    .line 509
    .line 510
    .line 511
    :cond_13
    iget v1, v0, Ll2/f;->q:I

    .line 512
    .line 513
    if-eq v1, v12, :cond_14

    .line 514
    .line 515
    iput v12, v0, Ll2/f;->q:I

    .line 516
    .line 517
    aget-object v1, v18, v12

    .line 518
    .line 519
    iput-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 520
    .line 521
    :cond_14
    :goto_8
    const/4 v3, 0x1

    .line 522
    const/4 v7, 0x3

    .line 523
    goto/16 :goto_6

    .line 524
    .line 525
    :pswitch_6
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 526
    .line 527
    iget-boolean v1, v1, Ll2/e;->c:Z

    .line 528
    .line 529
    if-nez v1, :cond_15

    .line 530
    .line 531
    const/16 v1, 0x20

    .line 532
    .line 533
    invoke-virtual {v6, v1}, Lh1/v;->v(I)V

    .line 534
    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_15
    const/4 v1, 0x2

    .line 538
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 547
    .line 548
    .line 549
    move-result v4

    .line 550
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 551
    .line 552
    .line 553
    move-result v7

    .line 554
    invoke-static {v3, v4, v7, v2}, Ll2/e;->c(IIII)I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 559
    .line 560
    .line 561
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 570
    .line 571
    .line 572
    move-result v7

    .line 573
    const/4 v10, 0x0

    .line 574
    invoke-static {v3, v4, v7, v10}, Ll2/e;->c(IIII)I

    .line 575
    .line 576
    .line 577
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 578
    .line 579
    .line 580
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 581
    .line 582
    .line 583
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 584
    .line 585
    .line 586
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 587
    .line 588
    .line 589
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    invoke-virtual {v6, v8}, Lh1/v;->v(I)V

    .line 594
    .line 595
    .line 596
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 597
    .line 598
    iput v2, v1, Ll2/e;->n:I

    .line 599
    .line 600
    iput v3, v1, Ll2/e;->k:I

    .line 601
    .line 602
    goto :goto_8

    .line 603
    :pswitch_7
    iget-object v2, v0, Ll2/f;->m:Ll2/e;

    .line 604
    .line 605
    iget-boolean v2, v2, Ll2/e;->c:Z

    .line 606
    .line 607
    if-nez v2, :cond_16

    .line 608
    .line 609
    invoke-virtual {v6, v10}, Lh1/v;->v(I)V

    .line 610
    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_16
    invoke-virtual {v6, v1}, Lh1/v;->v(I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    const/4 v2, 0x2

    .line 621
    invoke-virtual {v6, v2}, Lh1/v;->v(I)V

    .line 622
    .line 623
    .line 624
    const/4 v7, 0x6

    .line 625
    invoke-virtual {v6, v7}, Lh1/v;->k(I)I

    .line 626
    .line 627
    .line 628
    iget-object v2, v0, Ll2/f;->m:Ll2/e;

    .line 629
    .line 630
    iget v3, v2, Ll2/e;->u:I

    .line 631
    .line 632
    if-eq v3, v1, :cond_17

    .line 633
    .line 634
    invoke-virtual {v2, v11}, Ll2/e;->a(C)V

    .line 635
    .line 636
    .line 637
    :cond_17
    iput v1, v2, Ll2/e;->u:I

    .line 638
    .line 639
    goto :goto_8

    .line 640
    :pswitch_8
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 641
    .line 642
    iget-boolean v1, v1, Ll2/e;->c:Z

    .line 643
    .line 644
    if-nez v1, :cond_18

    .line 645
    .line 646
    invoke-virtual {v6, v13}, Lh1/v;->v(I)V

    .line 647
    .line 648
    .line 649
    goto/16 :goto_8

    .line 650
    .line 651
    :cond_18
    const/4 v2, 0x2

    .line 652
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 665
    .line 666
    .line 667
    move-result v7

    .line 668
    invoke-static {v3, v4, v7, v1}, Ll2/e;->c(IIII)I

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 673
    .line 674
    .line 675
    move-result v3

    .line 676
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 677
    .line 678
    .line 679
    move-result v4

    .line 680
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 681
    .line 682
    .line 683
    move-result v7

    .line 684
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 685
    .line 686
    .line 687
    move-result v8

    .line 688
    invoke-static {v4, v7, v8, v3}, Ll2/e;->c(IIII)I

    .line 689
    .line 690
    .line 691
    move-result v3

    .line 692
    invoke-virtual {v6, v2}, Lh1/v;->v(I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 704
    .line 705
    .line 706
    move-result v8

    .line 707
    const/4 v10, 0x0

    .line 708
    invoke-static {v4, v7, v8, v10}, Ll2/e;->c(IIII)I

    .line 709
    .line 710
    .line 711
    iget-object v4, v0, Ll2/f;->m:Ll2/e;

    .line 712
    .line 713
    invoke-virtual {v4, v1, v3}, Ll2/e;->f(II)V

    .line 714
    .line 715
    .line 716
    goto/16 :goto_8

    .line 717
    .line 718
    :pswitch_9
    move v2, v3

    .line 719
    iget-object v3, v0, Ll2/f;->m:Ll2/e;

    .line 720
    .line 721
    iget-boolean v3, v3, Ll2/e;->c:Z

    .line 722
    .line 723
    if-nez v3, :cond_19

    .line 724
    .line 725
    invoke-virtual {v6, v10}, Lh1/v;->v(I)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_8

    .line 729
    .line 730
    :cond_19
    invoke-virtual {v6, v1}, Lh1/v;->k(I)I

    .line 731
    .line 732
    .line 733
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 734
    .line 735
    .line 736
    invoke-virtual {v6, v2}, Lh1/v;->k(I)I

    .line 737
    .line 738
    .line 739
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 740
    .line 741
    .line 742
    move-result v1

    .line 743
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    const/4 v7, 0x3

    .line 748
    invoke-virtual {v6, v7}, Lh1/v;->k(I)I

    .line 749
    .line 750
    .line 751
    invoke-virtual {v6, v7}, Lh1/v;->k(I)I

    .line 752
    .line 753
    .line 754
    iget-object v3, v0, Ll2/f;->m:Ll2/e;

    .line 755
    .line 756
    invoke-virtual {v3, v1, v2}, Ll2/e;->e(ZZ)V

    .line 757
    .line 758
    .line 759
    goto/16 :goto_5

    .line 760
    .line 761
    :pswitch_a
    invoke-virtual {v0}, Ll2/f;->g()V

    .line 762
    .line 763
    .line 764
    goto/16 :goto_5

    .line 765
    .line 766
    :pswitch_b
    invoke-virtual {v6, v8}, Lh1/v;->v(I)V

    .line 767
    .line 768
    .line 769
    goto/16 :goto_5

    .line 770
    .line 771
    :pswitch_c
    move-object/from16 v18, v2

    .line 772
    .line 773
    const/4 v1, 0x1

    .line 774
    :goto_9
    if-gt v1, v8, :cond_e

    .line 775
    .line 776
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    if-eqz v2, :cond_1a

    .line 781
    .line 782
    rsub-int/lit8 v2, v1, 0x8

    .line 783
    .line 784
    aget-object v2, v18, v2

    .line 785
    .line 786
    invoke-virtual {v2}, Ll2/e;->d()V

    .line 787
    .line 788
    .line 789
    :cond_1a
    add-int/lit8 v1, v1, 0x1

    .line 790
    .line 791
    goto :goto_9

    .line 792
    :pswitch_d
    move-object/from16 v18, v2

    .line 793
    .line 794
    const/4 v2, 0x1

    .line 795
    :goto_a
    if-gt v2, v8, :cond_e

    .line 796
    .line 797
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 798
    .line 799
    .line 800
    move-result v1

    .line 801
    if-eqz v1, :cond_1b

    .line 802
    .line 803
    rsub-int/lit8 v1, v2, 0x8

    .line 804
    .line 805
    aget-object v1, v18, v1

    .line 806
    .line 807
    iget-boolean v3, v1, Ll2/e;->d:Z

    .line 808
    .line 809
    const/16 v17, 0x1

    .line 810
    .line 811
    xor-int/lit8 v3, v3, 0x1

    .line 812
    .line 813
    iput-boolean v3, v1, Ll2/e;->d:Z

    .line 814
    .line 815
    :cond_1b
    add-int/lit8 v2, v2, 0x1

    .line 816
    .line 817
    goto :goto_a

    .line 818
    :pswitch_e
    move-object/from16 v18, v2

    .line 819
    .line 820
    const/4 v2, 0x1

    .line 821
    :goto_b
    if-gt v2, v8, :cond_e

    .line 822
    .line 823
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    if-eqz v1, :cond_1c

    .line 828
    .line 829
    rsub-int/lit8 v1, v2, 0x8

    .line 830
    .line 831
    aget-object v1, v18, v1

    .line 832
    .line 833
    const/4 v10, 0x0

    .line 834
    iput-boolean v10, v1, Ll2/e;->d:Z

    .line 835
    .line 836
    :cond_1c
    add-int/lit8 v2, v2, 0x1

    .line 837
    .line 838
    goto :goto_b

    .line 839
    :pswitch_f
    move-object/from16 v18, v2

    .line 840
    .line 841
    const/4 v2, 0x1

    .line 842
    :goto_c
    if-gt v2, v8, :cond_e

    .line 843
    .line 844
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 845
    .line 846
    .line 847
    move-result v1

    .line 848
    if-eqz v1, :cond_1d

    .line 849
    .line 850
    rsub-int/lit8 v1, v2, 0x8

    .line 851
    .line 852
    aget-object v1, v18, v1

    .line 853
    .line 854
    const/4 v3, 0x1

    .line 855
    iput-boolean v3, v1, Ll2/e;->d:Z

    .line 856
    .line 857
    goto :goto_d

    .line 858
    :cond_1d
    const/4 v3, 0x1

    .line 859
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 860
    .line 861
    goto :goto_c

    .line 862
    :pswitch_10
    move-object/from16 v18, v2

    .line 863
    .line 864
    const/4 v3, 0x1

    .line 865
    move v2, v3

    .line 866
    :goto_e
    if-gt v2, v8, :cond_f

    .line 867
    .line 868
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 869
    .line 870
    .line 871
    move-result v1

    .line 872
    if-eqz v1, :cond_1e

    .line 873
    .line 874
    rsub-int/lit8 v1, v2, 0x8

    .line 875
    .line 876
    aget-object v1, v18, v1

    .line 877
    .line 878
    iget-object v4, v1, Ll2/e;->a:Ljava/util/ArrayList;

    .line 879
    .line 880
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 881
    .line 882
    .line 883
    iget-object v4, v1, Ll2/e;->b:Landroid/text/SpannableStringBuilder;

    .line 884
    .line 885
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 886
    .line 887
    .line 888
    const/4 v4, -0x1

    .line 889
    iput v4, v1, Ll2/e;->o:I

    .line 890
    .line 891
    iput v4, v1, Ll2/e;->p:I

    .line 892
    .line 893
    iput v4, v1, Ll2/e;->q:I

    .line 894
    .line 895
    iput v4, v1, Ll2/e;->s:I

    .line 896
    .line 897
    const/4 v11, 0x0

    .line 898
    iput v11, v1, Ll2/e;->u:I

    .line 899
    .line 900
    goto :goto_f

    .line 901
    :cond_1e
    const/4 v11, 0x0

    .line 902
    :goto_f
    add-int/lit8 v2, v2, 0x1

    .line 903
    .line 904
    goto :goto_e

    .line 905
    :pswitch_11
    move-object/from16 v18, v2

    .line 906
    .line 907
    const/4 v3, 0x1

    .line 908
    const/4 v11, 0x0

    .line 909
    add-int/lit8 v12, v12, -0x80

    .line 910
    .line 911
    iget v1, v0, Ll2/f;->q:I

    .line 912
    .line 913
    if-eq v1, v12, :cond_1f

    .line 914
    .line 915
    iput v12, v0, Ll2/f;->q:I

    .line 916
    .line 917
    aget-object v1, v18, v12

    .line 918
    .line 919
    iput-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 920
    .line 921
    :cond_1f
    :goto_10
    move v2, v3

    .line 922
    :goto_11
    const/4 v1, 0x2

    .line 923
    const/4 v3, 0x7

    .line 924
    :goto_12
    const/4 v10, 0x6

    .line 925
    goto/16 :goto_16

    .line 926
    .line 927
    :cond_20
    const/16 v1, 0xff

    .line 928
    .line 929
    const/4 v3, 0x1

    .line 930
    const/4 v11, 0x0

    .line 931
    if-gt v12, v1, :cond_21

    .line 932
    .line 933
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 934
    .line 935
    and-int/lit16 v2, v12, 0xff

    .line 936
    .line 937
    int-to-char v2, v2

    .line 938
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 939
    .line 940
    .line 941
    goto :goto_10

    .line 942
    :cond_21
    const-string v1, "Invalid base command: "

    .line 943
    .line 944
    invoke-static {v1, v12, v5}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 945
    .line 946
    .line 947
    goto :goto_11

    .line 948
    :cond_22
    const/4 v3, 0x1

    .line 949
    const/4 v11, 0x0

    .line 950
    invoke-virtual {v6, v8}, Lh1/v;->k(I)I

    .line 951
    .line 952
    .line 953
    move-result v12

    .line 954
    if-gt v12, v4, :cond_26

    .line 955
    .line 956
    const/4 v3, 0x7

    .line 957
    if-gt v12, v3, :cond_23

    .line 958
    .line 959
    goto/16 :goto_14

    .line 960
    .line 961
    :cond_23
    const/16 v1, 0xf

    .line 962
    .line 963
    if-gt v12, v1, :cond_24

    .line 964
    .line 965
    invoke-virtual {v6, v8}, Lh1/v;->v(I)V

    .line 966
    .line 967
    .line 968
    goto/16 :goto_14

    .line 969
    .line 970
    :cond_24
    if-gt v12, v14, :cond_25

    .line 971
    .line 972
    invoke-virtual {v6, v10}, Lh1/v;->v(I)V

    .line 973
    .line 974
    .line 975
    goto/16 :goto_14

    .line 976
    .line 977
    :cond_25
    if-gt v12, v4, :cond_32

    .line 978
    .line 979
    invoke-virtual {v6, v13}, Lh1/v;->v(I)V

    .line 980
    .line 981
    .line 982
    goto/16 :goto_14

    .line 983
    .line 984
    :cond_26
    const/4 v3, 0x7

    .line 985
    const/16 v4, 0xa0

    .line 986
    .line 987
    if-gt v12, v1, :cond_31

    .line 988
    .line 989
    const/16 v1, 0x20

    .line 990
    .line 991
    if-eq v12, v1, :cond_30

    .line 992
    .line 993
    const/16 v1, 0x21

    .line 994
    .line 995
    if-eq v12, v1, :cond_2f

    .line 996
    .line 997
    const/16 v1, 0x25

    .line 998
    .line 999
    if-eq v12, v1, :cond_2e

    .line 1000
    .line 1001
    const/16 v1, 0x2a

    .line 1002
    .line 1003
    if-eq v12, v1, :cond_2d

    .line 1004
    .line 1005
    const/16 v1, 0x2c

    .line 1006
    .line 1007
    if-eq v12, v1, :cond_2c

    .line 1008
    .line 1009
    const/16 v1, 0x3f

    .line 1010
    .line 1011
    if-eq v12, v1, :cond_2b

    .line 1012
    .line 1013
    const/16 v1, 0x39

    .line 1014
    .line 1015
    if-eq v12, v1, :cond_2a

    .line 1016
    .line 1017
    const/16 v1, 0x3a

    .line 1018
    .line 1019
    if-eq v12, v1, :cond_29

    .line 1020
    .line 1021
    const/16 v1, 0x3c

    .line 1022
    .line 1023
    if-eq v12, v1, :cond_28

    .line 1024
    .line 1025
    const/16 v1, 0x3d

    .line 1026
    .line 1027
    if-eq v12, v1, :cond_27

    .line 1028
    .line 1029
    packed-switch v12, :pswitch_data_2

    .line 1030
    .line 1031
    .line 1032
    packed-switch v12, :pswitch_data_3

    .line 1033
    .line 1034
    .line 1035
    const-string v1, "Invalid G2 character: "

    .line 1036
    .line 1037
    invoke-static {v1, v12, v5}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    goto/16 :goto_13

    .line 1041
    .line 1042
    :pswitch_12
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1043
    .line 1044
    const/16 v2, 0x250c

    .line 1045
    .line 1046
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1047
    .line 1048
    .line 1049
    goto/16 :goto_13

    .line 1050
    .line 1051
    :pswitch_13
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1052
    .line 1053
    const/16 v2, 0x2518

    .line 1054
    .line 1055
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1056
    .line 1057
    .line 1058
    goto/16 :goto_13

    .line 1059
    .line 1060
    :pswitch_14
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1061
    .line 1062
    const/16 v2, 0x2500

    .line 1063
    .line 1064
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1065
    .line 1066
    .line 1067
    goto/16 :goto_13

    .line 1068
    .line 1069
    :pswitch_15
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1070
    .line 1071
    const/16 v2, 0x2514

    .line 1072
    .line 1073
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1074
    .line 1075
    .line 1076
    goto/16 :goto_13

    .line 1077
    .line 1078
    :pswitch_16
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1079
    .line 1080
    const/16 v2, 0x2510

    .line 1081
    .line 1082
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1083
    .line 1084
    .line 1085
    goto/16 :goto_13

    .line 1086
    .line 1087
    :pswitch_17
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1088
    .line 1089
    const/16 v2, 0x2502

    .line 1090
    .line 1091
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1092
    .line 1093
    .line 1094
    goto/16 :goto_13

    .line 1095
    .line 1096
    :pswitch_18
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1097
    .line 1098
    const/16 v2, 0x215e

    .line 1099
    .line 1100
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1101
    .line 1102
    .line 1103
    goto/16 :goto_13

    .line 1104
    .line 1105
    :pswitch_19
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1106
    .line 1107
    const/16 v2, 0x215d

    .line 1108
    .line 1109
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1110
    .line 1111
    .line 1112
    goto/16 :goto_13

    .line 1113
    .line 1114
    :pswitch_1a
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1115
    .line 1116
    const/16 v2, 0x215c

    .line 1117
    .line 1118
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1119
    .line 1120
    .line 1121
    goto/16 :goto_13

    .line 1122
    .line 1123
    :pswitch_1b
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1124
    .line 1125
    const/16 v2, 0x215b

    .line 1126
    .line 1127
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1128
    .line 1129
    .line 1130
    goto/16 :goto_13

    .line 1131
    .line 1132
    :pswitch_1c
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1133
    .line 1134
    const/16 v2, 0x2022

    .line 1135
    .line 1136
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1137
    .line 1138
    .line 1139
    goto/16 :goto_13

    .line 1140
    .line 1141
    :pswitch_1d
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1142
    .line 1143
    const/16 v2, 0x201d

    .line 1144
    .line 1145
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1146
    .line 1147
    .line 1148
    goto/16 :goto_13

    .line 1149
    .line 1150
    :pswitch_1e
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1151
    .line 1152
    const/16 v2, 0x201c

    .line 1153
    .line 1154
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1155
    .line 1156
    .line 1157
    goto/16 :goto_13

    .line 1158
    .line 1159
    :pswitch_1f
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1160
    .line 1161
    const/16 v2, 0x2019

    .line 1162
    .line 1163
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1164
    .line 1165
    .line 1166
    goto :goto_13

    .line 1167
    :pswitch_20
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1168
    .line 1169
    const/16 v2, 0x2018

    .line 1170
    .line 1171
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_13

    .line 1175
    :pswitch_21
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1176
    .line 1177
    const/16 v2, 0x2588

    .line 1178
    .line 1179
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_13

    .line 1183
    :cond_27
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1184
    .line 1185
    const/16 v2, 0x2120

    .line 1186
    .line 1187
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1188
    .line 1189
    .line 1190
    goto :goto_13

    .line 1191
    :cond_28
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1192
    .line 1193
    const/16 v2, 0x153

    .line 1194
    .line 1195
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_13

    .line 1199
    :cond_29
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1200
    .line 1201
    const/16 v2, 0x161

    .line 1202
    .line 1203
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1204
    .line 1205
    .line 1206
    goto :goto_13

    .line 1207
    :cond_2a
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1208
    .line 1209
    const/16 v2, 0x2122

    .line 1210
    .line 1211
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_13

    .line 1215
    :cond_2b
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1216
    .line 1217
    const/16 v2, 0x178

    .line 1218
    .line 1219
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1220
    .line 1221
    .line 1222
    goto :goto_13

    .line 1223
    :cond_2c
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1224
    .line 1225
    const/16 v2, 0x152

    .line 1226
    .line 1227
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1228
    .line 1229
    .line 1230
    goto :goto_13

    .line 1231
    :cond_2d
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1232
    .line 1233
    const/16 v2, 0x160

    .line 1234
    .line 1235
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1236
    .line 1237
    .line 1238
    goto :goto_13

    .line 1239
    :cond_2e
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1240
    .line 1241
    const/16 v2, 0x2026

    .line 1242
    .line 1243
    invoke-virtual {v1, v2}, Ll2/e;->a(C)V

    .line 1244
    .line 1245
    .line 1246
    goto :goto_13

    .line 1247
    :cond_2f
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1248
    .line 1249
    invoke-virtual {v1, v4}, Ll2/e;->a(C)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_13

    .line 1253
    :cond_30
    iget-object v1, v0, Ll2/f;->m:Ll2/e;

    .line 1254
    .line 1255
    const/16 v10, 0x20

    .line 1256
    .line 1257
    invoke-virtual {v1, v10}, Ll2/e;->a(C)V

    .line 1258
    .line 1259
    .line 1260
    :goto_13
    const/4 v1, 0x2

    .line 1261
    const/4 v2, 0x1

    .line 1262
    goto/16 :goto_12

    .line 1263
    .line 1264
    :cond_31
    const/16 v10, 0x20

    .line 1265
    .line 1266
    if-gt v12, v15, :cond_35

    .line 1267
    .line 1268
    const/16 v1, 0x87

    .line 1269
    .line 1270
    if-gt v12, v1, :cond_33

    .line 1271
    .line 1272
    invoke-virtual {v6, v10}, Lh1/v;->v(I)V

    .line 1273
    .line 1274
    .line 1275
    :cond_32
    :goto_14
    const/4 v1, 0x2

    .line 1276
    goto/16 :goto_12

    .line 1277
    .line 1278
    :cond_33
    const/16 v1, 0x8f

    .line 1279
    .line 1280
    if-gt v12, v1, :cond_34

    .line 1281
    .line 1282
    const/16 v1, 0x28

    .line 1283
    .line 1284
    invoke-virtual {v6, v1}, Lh1/v;->v(I)V

    .line 1285
    .line 1286
    .line 1287
    goto :goto_14

    .line 1288
    :cond_34
    if-gt v12, v15, :cond_32

    .line 1289
    .line 1290
    const/4 v1, 0x2

    .line 1291
    invoke-virtual {v6, v1}, Lh1/v;->v(I)V

    .line 1292
    .line 1293
    .line 1294
    const/4 v10, 0x6

    .line 1295
    invoke-virtual {v6, v10}, Lh1/v;->k(I)I

    .line 1296
    .line 1297
    .line 1298
    move-result v4

    .line 1299
    mul-int/2addr v4, v8

    .line 1300
    invoke-virtual {v6, v4}, Lh1/v;->v(I)V

    .line 1301
    .line 1302
    .line 1303
    goto :goto_16

    .line 1304
    :cond_35
    const/4 v1, 0x2

    .line 1305
    const/16 v8, 0xff

    .line 1306
    .line 1307
    const/4 v10, 0x6

    .line 1308
    if-gt v12, v8, :cond_37

    .line 1309
    .line 1310
    if-ne v12, v4, :cond_36

    .line 1311
    .line 1312
    iget-object v2, v0, Ll2/f;->m:Ll2/e;

    .line 1313
    .line 1314
    const/16 v4, 0x33c4

    .line 1315
    .line 1316
    invoke-virtual {v2, v4}, Ll2/e;->a(C)V

    .line 1317
    .line 1318
    .line 1319
    goto :goto_15

    .line 1320
    :cond_36
    const-string v2, "Invalid G3 character: "

    .line 1321
    .line 1322
    invoke-static {v2, v12, v5}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    iget-object v2, v0, Ll2/f;->m:Ll2/e;

    .line 1326
    .line 1327
    const/16 v4, 0x5f

    .line 1328
    .line 1329
    invoke-virtual {v2, v4}, Ll2/e;->a(C)V

    .line 1330
    .line 1331
    .line 1332
    :goto_15
    const/4 v2, 0x1

    .line 1333
    goto :goto_16

    .line 1334
    :cond_37
    const-string v4, "Invalid extended command: "

    .line 1335
    .line 1336
    invoke-static {v4, v12, v5}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 1337
    .line 1338
    .line 1339
    :goto_16
    move v11, v3

    .line 1340
    const/4 v4, 0x1

    .line 1341
    move v3, v1

    .line 1342
    goto/16 :goto_1

    .line 1343
    .line 1344
    :cond_38
    :goto_17
    if-eqz v2, :cond_39

    .line 1345
    .line 1346
    invoke-virtual {v0}, Ll2/f;->f()Ljava/util/List;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v1

    .line 1350
    iput-object v1, v0, Ll2/f;->n:Ljava/util/List;

    .line 1351
    .line 1352
    :cond_39
    const/4 v1, 0x0

    .line 1353
    iput-object v1, v0, Ll2/f;->p:Lh1/v;

    .line 1354
    .line 1355
    return-void

    .line 1356
    nop

    .line 1357
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_4
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    :pswitch_data_2
    .packed-switch 0x30
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    :pswitch_data_3
    .packed-switch 0x76
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public final f()Ljava/util/List;
    .locals 17

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    const/16 v3, 0x8

    .line 9
    .line 10
    if-ge v2, v3, :cond_f

    .line 11
    .line 12
    move-object/from16 v3, p0

    .line 13
    .line 14
    iget-object v4, v3, Ll2/f;->l:[Ll2/e;

    .line 15
    .line 16
    aget-object v5, v4, v2

    .line 17
    .line 18
    iget-boolean v6, v5, Ll2/e;->c:Z

    .line 19
    .line 20
    if-eqz v6, :cond_e

    .line 21
    .line 22
    iget-object v6, v5, Ll2/e;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    iget-object v5, v5, Ll2/e;->b:Landroid/text/SpannableStringBuilder;

    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    goto/16 :goto_b

    .line 39
    .line 40
    :cond_0
    aget-object v4, v4, v2

    .line 41
    .line 42
    iget-boolean v5, v4, Ll2/e;->d:Z

    .line 43
    .line 44
    if-eqz v5, :cond_e

    .line 45
    .line 46
    iget-object v5, v4, Ll2/e;->a:Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-boolean v6, v4, Ll2/e;->c:Z

    .line 49
    .line 50
    if-eqz v6, :cond_d

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    iget-object v6, v4, Ll2/e;->b:Landroid/text/SpannableStringBuilder;

    .line 59
    .line 60
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_1

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_1
    new-instance v8, Landroid/text/SpannableStringBuilder;

    .line 69
    .line 70
    invoke-direct {v8}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    move v6, v1

    .line 74
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-ge v6, v7, :cond_2

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Ljava/lang/CharSequence;

    .line 85
    .line 86
    invoke-virtual {v8, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v7, 0xa

    .line 90
    .line 91
    invoke-virtual {v8, v7}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v6, v6, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v4}, Ll2/e;->b()Landroid/text/SpannableString;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v8, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 102
    .line 103
    .line 104
    iget v5, v4, Ll2/e;->k:I

    .line 105
    .line 106
    const/4 v6, 0x1

    .line 107
    const/4 v7, 0x2

    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    if-eq v5, v6, :cond_5

    .line 111
    .line 112
    if-eq v5, v7, :cond_4

    .line 113
    .line 114
    const/4 v9, 0x3

    .line 115
    if-ne v5, v9, :cond_3

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v2, "Unexpected justification value: "

    .line 123
    .line 124
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget v2, v4, Ll2/e;->k:I

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v0

    .line 140
    :cond_4
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 141
    .line 142
    :goto_2
    move-object v9, v5

    .line 143
    goto :goto_4

    .line 144
    :cond_5
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    :goto_3
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :goto_4
    iget-boolean v5, v4, Ll2/e;->f:Z

    .line 151
    .line 152
    if-eqz v5, :cond_7

    .line 153
    .line 154
    iget v5, v4, Ll2/e;->h:I

    .line 155
    .line 156
    int-to-float v5, v5

    .line 157
    const/high16 v10, 0x42c60000    # 99.0f

    .line 158
    .line 159
    div-float/2addr v5, v10

    .line 160
    iget v11, v4, Ll2/e;->g:I

    .line 161
    .line 162
    int-to-float v11, v11

    .line 163
    div-float/2addr v11, v10

    .line 164
    goto :goto_5

    .line 165
    :cond_7
    iget v5, v4, Ll2/e;->h:I

    .line 166
    .line 167
    int-to-float v5, v5

    .line 168
    const/high16 v10, 0x43510000    # 209.0f

    .line 169
    .line 170
    div-float/2addr v5, v10

    .line 171
    iget v10, v4, Ll2/e;->g:I

    .line 172
    .line 173
    int-to-float v10, v10

    .line 174
    const/high16 v11, 0x42940000    # 74.0f

    .line 175
    .line 176
    div-float v11, v10, v11

    .line 177
    .line 178
    :goto_5
    const v10, 0x3f666666    # 0.9f

    .line 179
    .line 180
    .line 181
    mul-float/2addr v5, v10

    .line 182
    const v12, 0x3d4ccccd    # 0.05f

    .line 183
    .line 184
    .line 185
    add-float/2addr v5, v12

    .line 186
    mul-float/2addr v11, v10

    .line 187
    add-float v10, v11, v12

    .line 188
    .line 189
    iget v11, v4, Ll2/e;->i:I

    .line 190
    .line 191
    div-int/lit8 v12, v11, 0x3

    .line 192
    .line 193
    if-nez v12, :cond_8

    .line 194
    .line 195
    move v12, v11

    .line 196
    move v11, v1

    .line 197
    goto :goto_6

    .line 198
    :cond_8
    if-ne v12, v6, :cond_9

    .line 199
    .line 200
    move v12, v11

    .line 201
    move v11, v6

    .line 202
    goto :goto_6

    .line 203
    :cond_9
    move v12, v11

    .line 204
    move v11, v7

    .line 205
    :goto_6
    rem-int/lit8 v12, v12, 0x3

    .line 206
    .line 207
    if-nez v12, :cond_a

    .line 208
    .line 209
    move v13, v1

    .line 210
    goto :goto_7

    .line 211
    :cond_a
    if-ne v12, v6, :cond_b

    .line 212
    .line 213
    move v13, v6

    .line 214
    goto :goto_7

    .line 215
    :cond_b
    move v13, v7

    .line 216
    :goto_7
    iget v15, v4, Ll2/e;->n:I

    .line 217
    .line 218
    sget v7, Ll2/e;->w:I

    .line 219
    .line 220
    if-eq v15, v7, :cond_c

    .line 221
    .line 222
    move v14, v6

    .line 223
    goto :goto_8

    .line 224
    :cond_c
    move v14, v1

    .line 225
    :goto_8
    new-instance v7, Ll2/d;

    .line 226
    .line 227
    iget v4, v4, Ll2/e;->e:I

    .line 228
    .line 229
    move/from16 v16, v4

    .line 230
    .line 231
    move v12, v5

    .line 232
    invoke-direct/range {v7 .. v16}, Ll2/d;-><init>(Landroid/text/SpannableStringBuilder;Landroid/text/Layout$Alignment;FIFIZII)V

    .line 233
    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_d
    :goto_9
    const/4 v7, 0x0

    .line 237
    :goto_a
    if-eqz v7, :cond_e

    .line 238
    .line 239
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    :cond_e
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_f
    move-object/from16 v3, p0

    .line 247
    .line 248
    sget-object v2, Ll2/d;->c:Lj0/a;

    .line 249
    .line 250
    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 260
    .line 261
    .line 262
    :goto_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-ge v1, v4, :cond_10

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    check-cast v4, Ll2/d;

    .line 273
    .line 274
    iget-object v4, v4, Ll2/d;->a:Lg1/b;

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    add-int/lit8 v1, v1, 0x1

    .line 280
    .line 281
    goto :goto_c

    .line 282
    :cond_10
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    return-object v0
.end method

.method public final flush()V
    .locals 3

    .line 1
    invoke-super {p0}, Ll2/h;->flush()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ll2/f;->n:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Ll2/f;->o:Ljava/util/List;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, p0, Ll2/f;->q:I

    .line 11
    .line 12
    iget-object v2, p0, Ll2/f;->l:[Ll2/e;

    .line 13
    .line 14
    aget-object v1, v2, v1

    .line 15
    .line 16
    iput-object v1, p0, Ll2/f;->m:Ll2/e;

    .line 17
    .line 18
    invoke-virtual {p0}, Ll2/f;->g()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ll2/f;->p:Lh1/v;

    .line 22
    .line 23
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x8

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Ll2/f;->l:[Ll2/e;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    invoke-virtual {v1}, Ll2/e;->d()V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Cea708Decoder"

    .line 2
    .line 3
    return-object v0
.end method
