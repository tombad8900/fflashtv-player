.class public final Lokhttp3/internal/ws/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final isClient:Z

.field private final maskCursor:Lv7/h;

.field private final maskKey:[B

.field private final messageBuffer:Lv7/j;

.field private messageDeflater:Lokhttp3/internal/ws/a;

.field private final minimumDeflateSize:J

.field private final noContextTakeover:Z

.field private final perMessageDeflate:Z

.field private final random:Ljava/util/Random;

.field private final sink:Lv7/k;

.field private final sinkBuffer:Lv7/j;

.field private writerClosed:Z


# direct methods
.method public constructor <init>(ZLv7/k;Ljava/util/Random;ZZJ)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "random"

    .line 7
    .line 8
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lokhttp3/internal/ws/i;->isClient:Z

    .line 15
    .line 16
    iput-object p2, p0, Lokhttp3/internal/ws/i;->sink:Lv7/k;

    .line 17
    .line 18
    iput-object p3, p0, Lokhttp3/internal/ws/i;->random:Ljava/util/Random;

    .line 19
    .line 20
    iput-boolean p4, p0, Lokhttp3/internal/ws/i;->perMessageDeflate:Z

    .line 21
    .line 22
    iput-boolean p5, p0, Lokhttp3/internal/ws/i;->noContextTakeover:Z

    .line 23
    .line 24
    iput-wide p6, p0, Lokhttp3/internal/ws/i;->minimumDeflateSize:J

    .line 25
    .line 26
    new-instance p3, Lv7/j;

    .line 27
    .line 28
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Lokhttp3/internal/ws/i;->messageBuffer:Lv7/j;

    .line 32
    .line 33
    invoke-interface {p2}, Lv7/k;->a()Lv7/j;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    const/4 p3, 0x4

    .line 43
    new-array p3, p3, [B

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object p3, p2

    .line 47
    :goto_0
    iput-object p3, p0, Lokhttp3/internal/ws/i;->maskKey:[B

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    new-instance p2, Lv7/h;

    .line 52
    .line 53
    invoke-direct {p2}, Lv7/h;-><init>()V

    .line 54
    .line 55
    .line 56
    :cond_1
    iput-object p2, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 57
    .line 58
    return-void
.end method

.method private final writeControlFrame(ILv7/m;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/ws/i;->writerClosed:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p2}, Lv7/m;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v1, v0

    .line 10
    const-wide/16 v3, 0x7d

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-gtz v1, :cond_2

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0x80

    .line 17
    .line 18
    iget-object v1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lv7/j;->K(I)V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, p0, Lokhttp3/internal/ws/i;->isClient:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    or-int/lit16 p1, v0, 0x80

    .line 28
    .line 29
    iget-object v1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lv7/j;->K(I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lokhttp3/internal/ws/i;->random:Ljava/util/Random;

    .line 35
    .line 36
    iget-object v1, p0, Lokhttp3/internal/ws/i;->maskKey:[B

    .line 37
    .line 38
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 45
    .line 46
    iget-object v1, p0, Lokhttp3/internal/ws/i;->maskKey:[B

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Lv7/j;->write([B)V

    .line 49
    .line 50
    .line 51
    if-lez v0, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 54
    .line 55
    iget-wide v0, p1, Lv7/j;->k:J

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lv7/j;->J(Lv7/m;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 61
    .line 62
    iget-object p2, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 63
    .line 64
    invoke-static {p2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lv7/j;->x(Lv7/h;)Lv7/h;

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v1}, Lv7/h;->c(J)I

    .line 73
    .line 74
    .line 75
    sget-object p1, Lokhttp3/internal/ws/f;->INSTANCE:Lokhttp3/internal/ws/f;

    .line 76
    .line 77
    iget-object p2, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 78
    .line 79
    iget-object v0, p0, Lokhttp3/internal/ws/i;->maskKey:[B

    .line 80
    .line 81
    invoke-virtual {p1, p2, v0}, Lokhttp3/internal/ws/f;->toggleMask(Lv7/h;[B)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 85
    .line 86
    invoke-virtual {p1}, Lv7/h;->close()V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    iget-object p1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lv7/j;->K(I)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Lv7/j;->J(Lv7/m;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    :goto_0
    iget-object p1, p0, Lokhttp3/internal/ws/i;->sink:Lv7/k;

    .line 101
    .line 102
    invoke-interface {p1}, Lv7/k;->flush()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    const-string p2, "Payload size must be less than or equal to 125"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 115
    .line 116
    const-string p2, "closed"

    .line 117
    .line 118
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/i;->messageDeflater:Lokhttp3/internal/ws/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lokhttp3/internal/ws/a;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final getRandom()Ljava/util/Random;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/i;->random:Ljava/util/Random;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSink()Lv7/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/i;->sink:Lv7/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final writeClose(ILv7/m;)V
    .locals 1

    .line 1
    sget-object v0, Lv7/m;->m:Lv7/m;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_3

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    sget-object v0, Lokhttp3/internal/ws/f;->INSTANCE:Lokhttp3/internal/ws/f;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lokhttp3/internal/ws/f;->validateCloseCode(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    new-instance v0, Lv7/j;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lv7/j;->O(I)V

    .line 20
    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Lv7/j;->J(Lv7/m;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-wide p1, v0, Lv7/j;->k:J

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lv7/j;->d(J)Lv7/m;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_3
    const/16 p1, 0x8

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    :try_start_0
    invoke-direct {p0, p1, v0}, Lokhttp3/internal/ws/i;->writeControlFrame(ILv7/m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    iput-boolean p2, p0, Lokhttp3/internal/ws/i;->writerClosed:Z

    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    iput-boolean p2, p0, Lokhttp3/internal/ws/i;->writerClosed:Z

    .line 44
    .line 45
    throw p1
.end method

.method public final writeMessageFrame(ILv7/m;)V
    .locals 12

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lokhttp3/internal/ws/i;->writerClosed:Z

    .line 7
    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    iget-object v0, p0, Lokhttp3/internal/ws/i;->messageBuffer:Lv7/j;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lv7/j;->J(Lv7/m;)V

    .line 13
    .line 14
    .line 15
    or-int/lit16 v0, p1, 0x80

    .line 16
    .line 17
    iget-boolean v1, p0, Lokhttp3/internal/ws/i;->perMessageDeflate:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lv7/m;->d()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    int-to-long v1, p2

    .line 26
    iget-wide v3, p0, Lokhttp3/internal/ws/i;->minimumDeflateSize:J

    .line 27
    .line 28
    cmp-long p2, v1, v3

    .line 29
    .line 30
    if-ltz p2, :cond_1

    .line 31
    .line 32
    iget-object p2, p0, Lokhttp3/internal/ws/i;->messageDeflater:Lokhttp3/internal/ws/a;

    .line 33
    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    new-instance p2, Lokhttp3/internal/ws/a;

    .line 37
    .line 38
    iget-boolean v0, p0, Lokhttp3/internal/ws/i;->noContextTakeover:Z

    .line 39
    .line 40
    invoke-direct {p2, v0}, Lokhttp3/internal/ws/a;-><init>(Z)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lokhttp3/internal/ws/i;->messageDeflater:Lokhttp3/internal/ws/a;

    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/i;->messageBuffer:Lv7/j;

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Lokhttp3/internal/ws/a;->deflate(Lv7/j;)V

    .line 48
    .line 49
    .line 50
    or-int/lit16 v0, p1, 0xc0

    .line 51
    .line 52
    :cond_1
    iget-object p1, p0, Lokhttp3/internal/ws/i;->messageBuffer:Lv7/j;

    .line 53
    .line 54
    iget-wide p1, p1, Lv7/j;->k:J

    .line 55
    .line 56
    iget-object v1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lv7/j;->K(I)V

    .line 59
    .line 60
    .line 61
    iget-boolean v0, p0, Lokhttp3/internal/ws/i;->isClient:Z

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    const/16 v0, 0x80

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v0, 0x0

    .line 69
    :goto_0
    const-wide/16 v1, 0x7d

    .line 70
    .line 71
    cmp-long v1, p1, v1

    .line 72
    .line 73
    if-gtz v1, :cond_3

    .line 74
    .line 75
    long-to-int v1, p1

    .line 76
    or-int/2addr v0, v1

    .line 77
    iget-object v1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Lv7/j;->K(I)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_3
    const-wide/32 v1, 0xffff

    .line 85
    .line 86
    .line 87
    cmp-long v1, p1, v1

    .line 88
    .line 89
    if-gtz v1, :cond_4

    .line 90
    .line 91
    or-int/lit8 v0, v0, 0x7e

    .line 92
    .line 93
    iget-object v1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 94
    .line 95
    invoke-virtual {v1, v0}, Lv7/j;->K(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 99
    .line 100
    long-to-int v1, p1

    .line 101
    invoke-virtual {v0, v1}, Lv7/j;->O(I)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    or-int/lit8 v0, v0, 0x7f

    .line 106
    .line 107
    iget-object v1, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Lv7/j;->K(I)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 113
    .line 114
    const/16 v1, 0x8

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lv7/j;->I(I)Lv7/f0;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v3, v2, Lv7/f0;->a:[B

    .line 121
    .line 122
    iget v4, v2, Lv7/f0;->c:I

    .line 123
    .line 124
    add-int/lit8 v5, v4, 0x1

    .line 125
    .line 126
    const/16 v6, 0x38

    .line 127
    .line 128
    ushr-long v6, p1, v6

    .line 129
    .line 130
    const-wide/16 v8, 0xff

    .line 131
    .line 132
    and-long/2addr v6, v8

    .line 133
    long-to-int v6, v6

    .line 134
    int-to-byte v6, v6

    .line 135
    aput-byte v6, v3, v4

    .line 136
    .line 137
    add-int/lit8 v6, v4, 0x2

    .line 138
    .line 139
    const/16 v7, 0x30

    .line 140
    .line 141
    ushr-long v10, p1, v7

    .line 142
    .line 143
    and-long/2addr v10, v8

    .line 144
    long-to-int v7, v10

    .line 145
    int-to-byte v7, v7

    .line 146
    aput-byte v7, v3, v5

    .line 147
    .line 148
    add-int/lit8 v5, v4, 0x3

    .line 149
    .line 150
    const/16 v7, 0x28

    .line 151
    .line 152
    ushr-long v10, p1, v7

    .line 153
    .line 154
    and-long/2addr v10, v8

    .line 155
    long-to-int v7, v10

    .line 156
    int-to-byte v7, v7

    .line 157
    aput-byte v7, v3, v6

    .line 158
    .line 159
    add-int/lit8 v6, v4, 0x4

    .line 160
    .line 161
    const/16 v7, 0x20

    .line 162
    .line 163
    ushr-long v10, p1, v7

    .line 164
    .line 165
    and-long/2addr v10, v8

    .line 166
    long-to-int v7, v10

    .line 167
    int-to-byte v7, v7

    .line 168
    aput-byte v7, v3, v5

    .line 169
    .line 170
    add-int/lit8 v5, v4, 0x5

    .line 171
    .line 172
    const/16 v7, 0x18

    .line 173
    .line 174
    ushr-long v10, p1, v7

    .line 175
    .line 176
    and-long/2addr v10, v8

    .line 177
    long-to-int v7, v10

    .line 178
    int-to-byte v7, v7

    .line 179
    aput-byte v7, v3, v6

    .line 180
    .line 181
    add-int/lit8 v6, v4, 0x6

    .line 182
    .line 183
    const/16 v7, 0x10

    .line 184
    .line 185
    ushr-long v10, p1, v7

    .line 186
    .line 187
    and-long/2addr v10, v8

    .line 188
    long-to-int v7, v10

    .line 189
    int-to-byte v7, v7

    .line 190
    aput-byte v7, v3, v5

    .line 191
    .line 192
    add-int/lit8 v5, v4, 0x7

    .line 193
    .line 194
    ushr-long v10, p1, v1

    .line 195
    .line 196
    and-long/2addr v10, v8

    .line 197
    long-to-int v7, v10

    .line 198
    int-to-byte v7, v7

    .line 199
    aput-byte v7, v3, v6

    .line 200
    .line 201
    add-int/2addr v4, v1

    .line 202
    and-long v6, p1, v8

    .line 203
    .line 204
    long-to-int v1, v6

    .line 205
    int-to-byte v1, v1

    .line 206
    aput-byte v1, v3, v5

    .line 207
    .line 208
    iput v4, v2, Lv7/f0;->c:I

    .line 209
    .line 210
    iget-wide v1, v0, Lv7/j;->k:J

    .line 211
    .line 212
    const-wide/16 v3, 0x8

    .line 213
    .line 214
    add-long/2addr v1, v3

    .line 215
    iput-wide v1, v0, Lv7/j;->k:J

    .line 216
    .line 217
    :goto_1
    iget-boolean v0, p0, Lokhttp3/internal/ws/i;->isClient:Z

    .line 218
    .line 219
    if-eqz v0, :cond_5

    .line 220
    .line 221
    iget-object v0, p0, Lokhttp3/internal/ws/i;->random:Ljava/util/Random;

    .line 222
    .line 223
    iget-object v1, p0, Lokhttp3/internal/ws/i;->maskKey:[B

    .line 224
    .line 225
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextBytes([B)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 232
    .line 233
    iget-object v1, p0, Lokhttp3/internal/ws/i;->maskKey:[B

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Lv7/j;->write([B)V

    .line 236
    .line 237
    .line 238
    const-wide/16 v0, 0x0

    .line 239
    .line 240
    cmp-long v2, p1, v0

    .line 241
    .line 242
    if-lez v2, :cond_5

    .line 243
    .line 244
    iget-object v2, p0, Lokhttp3/internal/ws/i;->messageBuffer:Lv7/j;

    .line 245
    .line 246
    iget-object v3, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 247
    .line 248
    invoke-static {v3}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v3}, Lv7/j;->x(Lv7/h;)Lv7/h;

    .line 252
    .line 253
    .line 254
    iget-object v2, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 255
    .line 256
    invoke-virtual {v2, v0, v1}, Lv7/h;->c(J)I

    .line 257
    .line 258
    .line 259
    sget-object v0, Lokhttp3/internal/ws/f;->INSTANCE:Lokhttp3/internal/ws/f;

    .line 260
    .line 261
    iget-object v1, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 262
    .line 263
    iget-object v2, p0, Lokhttp3/internal/ws/i;->maskKey:[B

    .line 264
    .line 265
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/ws/f;->toggleMask(Lv7/h;[B)V

    .line 266
    .line 267
    .line 268
    iget-object v0, p0, Lokhttp3/internal/ws/i;->maskCursor:Lv7/h;

    .line 269
    .line 270
    invoke-virtual {v0}, Lv7/h;->close()V

    .line 271
    .line 272
    .line 273
    :cond_5
    iget-object v0, p0, Lokhttp3/internal/ws/i;->sinkBuffer:Lv7/j;

    .line 274
    .line 275
    iget-object v1, p0, Lokhttp3/internal/ws/i;->messageBuffer:Lv7/j;

    .line 276
    .line 277
    invoke-virtual {v0, v1, p1, p2}, Lv7/j;->write(Lv7/j;J)V

    .line 278
    .line 279
    .line 280
    iget-object p1, p0, Lokhttp3/internal/ws/i;->sink:Lv7/k;

    .line 281
    .line 282
    invoke-interface {p1}, Lv7/k;->e()Lv7/k;

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_6
    new-instance p1, Ljava/io/IOException;

    .line 287
    .line 288
    const-string p2, "closed"

    .line 289
    .line 290
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw p1
.end method

.method public final writePing(Lv7/m;)V
    .locals 1

    .line 1
    const-string v0, "payload"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x9

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, Lokhttp3/internal/ws/i;->writeControlFrame(ILv7/m;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final writePong(Lv7/m;)V
    .locals 1

    .line 1
    const-string v0, "payload"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, Lokhttp3/internal/ws/i;->writeControlFrame(ILv7/m;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
