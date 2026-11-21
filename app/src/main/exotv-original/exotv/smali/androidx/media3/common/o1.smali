.class public final Landroidx/media3/common/o1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final A:Ljava/lang/String;

.field public static final B:Ljava/lang/String;

.field public static final C:Ljava/lang/String;

.field public static final D:Ljava/lang/String;

.field public static final E:Ljava/lang/String;

.field public static final F:Ljava/lang/String;

.field public static final q:Ljava/lang/Object;

.field public static final r:Ljava/lang/Object;

.field public static final s:Landroidx/media3/common/o0;

.field public static final t:Ljava/lang/String;

.field public static final u:Ljava/lang/String;

.field public static final v:Ljava/lang/String;

.field public static final w:Ljava/lang/String;

.field public static final x:Ljava/lang/String;

.field public static final y:Ljava/lang/String;

.field public static final z:Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Landroidx/media3/common/o0;

.field public d:Ljava/lang/Object;

.field public e:J

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z

.field public j:Landroidx/media3/common/i0;

.field public k:Z

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/common/o1;->q:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/media3/common/o1;->r:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Landroidx/media3/common/c0;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/media3/common/c0;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Landroidx/media3/common/f0;

    .line 21
    .line 22
    invoke-direct {v1}, Landroidx/media3/common/f0;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    sget-object v9, Lf6/l1;->n:Lf6/l1;

    .line 28
    .line 29
    new-instance v13, Landroidx/media3/common/h0;

    .line 30
    .line 31
    invoke-direct {v13}, Landroidx/media3/common/h0;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v20, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 35
    .line 36
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 37
    .line 38
    iget-object v2, v1, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 39
    .line 40
    const/4 v14, 0x1

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iget-object v2, v1, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v2, 0x0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    move v2, v14

    .line 51
    :goto_1
    invoke-static {v2}, Lh1/a;->j(Z)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    move-object v4, v2

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    new-instance v2, Landroidx/media3/common/j0;

    .line 59
    .line 60
    iget-object v5, v1, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 61
    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    new-instance v4, Landroidx/media3/common/g0;

    .line 65
    .line 66
    invoke-direct {v4, v1}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    move-object v5, v4

    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-direct/range {v2 .. v12}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v17, v2

    .line 83
    .line 84
    :goto_2
    move v1, v14

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    move-object/from16 v17, v4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :goto_3
    new-instance v14, Landroidx/media3/common/o0;

    .line 90
    .line 91
    new-instance v2, Landroidx/media3/common/e0;

    .line 92
    .line 93
    invoke-direct {v2, v0}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Landroidx/media3/common/i0;

    .line 97
    .line 98
    invoke-direct {v0, v13}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 99
    .line 100
    .line 101
    sget-object v19, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 102
    .line 103
    const-string v15, "androidx.media3.common.Timeline"

    .line 104
    .line 105
    move-object/from16 v18, v0

    .line 106
    .line 107
    move-object/from16 v16, v2

    .line 108
    .line 109
    invoke-direct/range {v14 .. v20}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 110
    .line 111
    .line 112
    sput-object v14, Landroidx/media3/common/o1;->s:Landroidx/media3/common/o0;

    .line 113
    .line 114
    const/16 v0, 0x24

    .line 115
    .line 116
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    sput-object v1, Landroidx/media3/common/o1;->t:Ljava/lang/String;

    .line 121
    .line 122
    const/4 v1, 0x2

    .line 123
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    sput-object v1, Landroidx/media3/common/o1;->u:Ljava/lang/String;

    .line 128
    .line 129
    const/4 v1, 0x3

    .line 130
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sput-object v1, Landroidx/media3/common/o1;->v:Ljava/lang/String;

    .line 135
    .line 136
    const/4 v1, 0x4

    .line 137
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    sput-object v1, Landroidx/media3/common/o1;->w:Ljava/lang/String;

    .line 142
    .line 143
    const/4 v1, 0x5

    .line 144
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    sput-object v1, Landroidx/media3/common/o1;->x:Ljava/lang/String;

    .line 149
    .line 150
    const/4 v1, 0x6

    .line 151
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    sput-object v1, Landroidx/media3/common/o1;->y:Ljava/lang/String;

    .line 156
    .line 157
    const/4 v1, 0x7

    .line 158
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    sput-object v1, Landroidx/media3/common/o1;->z:Ljava/lang/String;

    .line 163
    .line 164
    const/16 v1, 0x8

    .line 165
    .line 166
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    sput-object v1, Landroidx/media3/common/o1;->A:Ljava/lang/String;

    .line 171
    .line 172
    const/16 v1, 0x9

    .line 173
    .line 174
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    sput-object v1, Landroidx/media3/common/o1;->B:Ljava/lang/String;

    .line 179
    .line 180
    const/16 v1, 0xa

    .line 181
    .line 182
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    sput-object v1, Landroidx/media3/common/o1;->C:Ljava/lang/String;

    .line 187
    .line 188
    const/16 v1, 0xb

    .line 189
    .line 190
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    sput-object v1, Landroidx/media3/common/o1;->D:Ljava/lang/String;

    .line 195
    .line 196
    const/16 v1, 0xc

    .line 197
    .line 198
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    sput-object v1, Landroidx/media3/common/o1;->E:Ljava/lang/String;

    .line 203
    .line 204
    const/16 v1, 0xd

    .line 205
    .line 206
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sput-object v0, Landroidx/media3/common/o1;->F:Ljava/lang/String;

    .line 211
    .line 212
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/media3/common/o1;->q:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Landroidx/media3/common/o1;->s:Landroidx/media3/common/o0;

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final b(Ljava/lang/Object;Landroidx/media3/common/o0;Ljava/lang/Object;JJJZZLandroidx/media3/common/i0;JJIIJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    move-object p1, p2

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Landroidx/media3/common/o1;->s:Landroidx/media3/common/o0;

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p1, p2, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/media3/common/j0;->h:Ljava/lang/Object;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_1
    iput-object p1, p0, Landroidx/media3/common/o1;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p3, p0, Landroidx/media3/common/o1;->d:Ljava/lang/Object;

    .line 24
    .line 25
    iput-wide p4, p0, Landroidx/media3/common/o1;->e:J

    .line 26
    .line 27
    iput-wide p6, p0, Landroidx/media3/common/o1;->f:J

    .line 28
    .line 29
    iput-wide p8, p0, Landroidx/media3/common/o1;->g:J

    .line 30
    .line 31
    iput-boolean p10, p0, Landroidx/media3/common/o1;->h:Z

    .line 32
    .line 33
    iput-boolean p11, p0, Landroidx/media3/common/o1;->i:Z

    .line 34
    .line 35
    iput-object p12, p0, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 36
    .line 37
    iput-wide p13, p0, Landroidx/media3/common/o1;->l:J

    .line 38
    .line 39
    move-wide p1, p15

    .line 40
    iput-wide p1, p0, Landroidx/media3/common/o1;->m:J

    .line 41
    .line 42
    move/from16 p1, p17

    .line 43
    .line 44
    iput p1, p0, Landroidx/media3/common/o1;->n:I

    .line 45
    .line 46
    move/from16 p1, p18

    .line 47
    .line 48
    iput p1, p0, Landroidx/media3/common/o1;->o:I

    .line 49
    .line 50
    move-wide/from16 p1, p19

    .line 51
    .line 52
    iput-wide p1, p0, Landroidx/media3/common/o1;->p:J

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Landroidx/media3/common/o1;->k:Z

    .line 56
    .line 57
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Landroidx/media3/common/o1;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_1
    check-cast p1, Landroidx/media3/common/o1;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, p1, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 35
    .line 36
    iget-object v3, p1, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 37
    .line 38
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/media3/common/o1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v3, p1, Landroidx/media3/common/o1;->d:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget-object v2, p0, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 55
    .line 56
    iget-object v3, p1, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget-wide v2, p0, Landroidx/media3/common/o1;->e:J

    .line 65
    .line 66
    iget-wide v4, p1, Landroidx/media3/common/o1;->e:J

    .line 67
    .line 68
    cmp-long v2, v2, v4

    .line 69
    .line 70
    if-nez v2, :cond_2

    .line 71
    .line 72
    iget-wide v2, p0, Landroidx/media3/common/o1;->f:J

    .line 73
    .line 74
    iget-wide v4, p1, Landroidx/media3/common/o1;->f:J

    .line 75
    .line 76
    cmp-long v2, v2, v4

    .line 77
    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    iget-wide v2, p0, Landroidx/media3/common/o1;->g:J

    .line 81
    .line 82
    iget-wide v4, p1, Landroidx/media3/common/o1;->g:J

    .line 83
    .line 84
    cmp-long v2, v2, v4

    .line 85
    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    iget-boolean v2, p0, Landroidx/media3/common/o1;->h:Z

    .line 89
    .line 90
    iget-boolean v3, p1, Landroidx/media3/common/o1;->h:Z

    .line 91
    .line 92
    if-ne v2, v3, :cond_2

    .line 93
    .line 94
    iget-boolean v2, p0, Landroidx/media3/common/o1;->i:Z

    .line 95
    .line 96
    iget-boolean v3, p1, Landroidx/media3/common/o1;->i:Z

    .line 97
    .line 98
    if-ne v2, v3, :cond_2

    .line 99
    .line 100
    iget-boolean v2, p0, Landroidx/media3/common/o1;->k:Z

    .line 101
    .line 102
    iget-boolean v3, p1, Landroidx/media3/common/o1;->k:Z

    .line 103
    .line 104
    if-ne v2, v3, :cond_2

    .line 105
    .line 106
    iget-wide v2, p0, Landroidx/media3/common/o1;->l:J

    .line 107
    .line 108
    iget-wide v4, p1, Landroidx/media3/common/o1;->l:J

    .line 109
    .line 110
    cmp-long v2, v2, v4

    .line 111
    .line 112
    if-nez v2, :cond_2

    .line 113
    .line 114
    iget-wide v2, p0, Landroidx/media3/common/o1;->m:J

    .line 115
    .line 116
    iget-wide v4, p1, Landroidx/media3/common/o1;->m:J

    .line 117
    .line 118
    cmp-long v2, v2, v4

    .line 119
    .line 120
    if-nez v2, :cond_2

    .line 121
    .line 122
    iget v2, p0, Landroidx/media3/common/o1;->n:I

    .line 123
    .line 124
    iget v3, p1, Landroidx/media3/common/o1;->n:I

    .line 125
    .line 126
    if-ne v2, v3, :cond_2

    .line 127
    .line 128
    iget v2, p0, Landroidx/media3/common/o1;->o:I

    .line 129
    .line 130
    iget v3, p1, Landroidx/media3/common/o1;->o:I

    .line 131
    .line 132
    if-ne v2, v3, :cond_2

    .line 133
    .line 134
    iget-wide v2, p0, Landroidx/media3/common/o1;->p:J

    .line 135
    .line 136
    iget-wide v4, p1, Landroidx/media3/common/o1;->p:J

    .line 137
    .line 138
    cmp-long p1, v2, v4

    .line 139
    .line 140
    if-nez p1, :cond_2

    .line 141
    .line 142
    return v0

    .line 143
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0xd9

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/media3/common/o0;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/common/o1;->d:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    :goto_0
    add-int/2addr v1, v0

    .line 32
    mul-int/lit8 v1, v1, 0x1f

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/common/i0;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    :goto_1
    add-int/2addr v1, v2

    .line 44
    mul-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    iget-wide v2, p0, Landroidx/media3/common/o1;->e:J

    .line 47
    .line 48
    const/16 v0, 0x20

    .line 49
    .line 50
    ushr-long v4, v2, v0

    .line 51
    .line 52
    xor-long/2addr v2, v4

    .line 53
    long-to-int v2, v2

    .line 54
    add-int/2addr v1, v2

    .line 55
    mul-int/lit8 v1, v1, 0x1f

    .line 56
    .line 57
    iget-wide v2, p0, Landroidx/media3/common/o1;->f:J

    .line 58
    .line 59
    ushr-long v4, v2, v0

    .line 60
    .line 61
    xor-long/2addr v2, v4

    .line 62
    long-to-int v2, v2

    .line 63
    add-int/2addr v1, v2

    .line 64
    mul-int/lit8 v1, v1, 0x1f

    .line 65
    .line 66
    iget-wide v2, p0, Landroidx/media3/common/o1;->g:J

    .line 67
    .line 68
    ushr-long v4, v2, v0

    .line 69
    .line 70
    xor-long/2addr v2, v4

    .line 71
    long-to-int v2, v2

    .line 72
    add-int/2addr v1, v2

    .line 73
    mul-int/lit8 v1, v1, 0x1f

    .line 74
    .line 75
    iget-boolean v2, p0, Landroidx/media3/common/o1;->h:Z

    .line 76
    .line 77
    add-int/2addr v1, v2

    .line 78
    mul-int/lit8 v1, v1, 0x1f

    .line 79
    .line 80
    iget-boolean v2, p0, Landroidx/media3/common/o1;->i:Z

    .line 81
    .line 82
    add-int/2addr v1, v2

    .line 83
    mul-int/lit8 v1, v1, 0x1f

    .line 84
    .line 85
    iget-boolean v2, p0, Landroidx/media3/common/o1;->k:Z

    .line 86
    .line 87
    add-int/2addr v1, v2

    .line 88
    mul-int/lit8 v1, v1, 0x1f

    .line 89
    .line 90
    iget-wide v2, p0, Landroidx/media3/common/o1;->l:J

    .line 91
    .line 92
    ushr-long v4, v2, v0

    .line 93
    .line 94
    xor-long/2addr v2, v4

    .line 95
    long-to-int v2, v2

    .line 96
    add-int/2addr v1, v2

    .line 97
    mul-int/lit8 v1, v1, 0x1f

    .line 98
    .line 99
    iget-wide v2, p0, Landroidx/media3/common/o1;->m:J

    .line 100
    .line 101
    ushr-long v4, v2, v0

    .line 102
    .line 103
    xor-long/2addr v2, v4

    .line 104
    long-to-int v2, v2

    .line 105
    add-int/2addr v1, v2

    .line 106
    mul-int/lit8 v1, v1, 0x1f

    .line 107
    .line 108
    iget v2, p0, Landroidx/media3/common/o1;->n:I

    .line 109
    .line 110
    add-int/2addr v1, v2

    .line 111
    mul-int/lit8 v1, v1, 0x1f

    .line 112
    .line 113
    iget v2, p0, Landroidx/media3/common/o1;->o:I

    .line 114
    .line 115
    add-int/2addr v1, v2

    .line 116
    mul-int/lit8 v1, v1, 0x1f

    .line 117
    .line 118
    iget-wide v2, p0, Landroidx/media3/common/o1;->p:J

    .line 119
    .line 120
    ushr-long v4, v2, v0

    .line 121
    .line 122
    xor-long/2addr v2, v4

    .line 123
    long-to-int v0, v2

    .line 124
    add-int/2addr v1, v0

    .line 125
    return v1
.end method
