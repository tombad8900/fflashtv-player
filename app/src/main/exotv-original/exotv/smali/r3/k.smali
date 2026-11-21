.class public final Lr3/k;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final A:Lr3/c;

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Object;

.field public final c:Lt3/a;

.field public final d:Lr3/j;

.field public final e:Landroid/graphics/Bitmap$Config;

.field public final f:Ls3/d;

.field public final g:Ljava/util/List;

.field public final h:Lu3/d;

.field public final i:Lokhttp3/y;

.field public final j:Lr3/s;

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Lr3/b;

.field public final p:Lr3/b;

.field public final q:Lr3/b;

.field public final r:Li7/r;

.field public final s:Li7/r;

.field public final t:Li7/r;

.field public final u:Li7/r;

.field public final v:Landroidx/lifecycle/o;

.field public final w:Ls3/i;

.field public final x:Ls3/g;

.field public final y:Lr3/p;

.field public final z:Lr3/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Lt3/a;Lr3/j;Landroid/graphics/Bitmap$Config;Ls3/d;Ljava/util/List;Lu3/d;Lokhttp3/y;Lr3/s;ZZZZLr3/b;Lr3/b;Lr3/b;Li7/r;Li7/r;Li7/r;Li7/r;Landroidx/lifecycle/o;Ls3/i;Ls3/g;Lr3/p;Lr3/d;Lr3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr3/k;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lr3/k;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lr3/k;->c:Lt3/a;

    .line 5
    iput-object p4, p0, Lr3/k;->d:Lr3/j;

    .line 6
    iput-object p5, p0, Lr3/k;->e:Landroid/graphics/Bitmap$Config;

    .line 7
    iput-object p6, p0, Lr3/k;->f:Ls3/d;

    .line 8
    iput-object p7, p0, Lr3/k;->g:Ljava/util/List;

    .line 9
    iput-object p8, p0, Lr3/k;->h:Lu3/d;

    .line 10
    iput-object p9, p0, Lr3/k;->i:Lokhttp3/y;

    .line 11
    iput-object p10, p0, Lr3/k;->j:Lr3/s;

    .line 12
    iput-boolean p11, p0, Lr3/k;->k:Z

    .line 13
    iput-boolean p12, p0, Lr3/k;->l:Z

    .line 14
    iput-boolean p13, p0, Lr3/k;->m:Z

    .line 15
    iput-boolean p14, p0, Lr3/k;->n:Z

    .line 16
    iput-object p15, p0, Lr3/k;->o:Lr3/b;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lr3/k;->p:Lr3/b;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lr3/k;->q:Lr3/b;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lr3/k;->r:Li7/r;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lr3/k;->s:Li7/r;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lr3/k;->t:Li7/r;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lr3/k;->u:Li7/r;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lr3/k;->v:Landroidx/lifecycle/o;

    move-object/from16 p1, p23

    .line 24
    iput-object p1, p0, Lr3/k;->w:Ls3/i;

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lr3/k;->x:Ls3/g;

    move-object/from16 p1, p25

    .line 26
    iput-object p1, p0, Lr3/k;->y:Lr3/p;

    move-object/from16 p1, p26

    .line 27
    iput-object p1, p0, Lr3/k;->z:Lr3/d;

    move-object/from16 p1, p27

    .line 28
    iput-object p1, p0, Lr3/k;->A:Lr3/c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lr3/k;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lr3/k;

    .line 10
    .line 11
    iget-object v0, p1, Lr3/k;->a:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v1, p0, Lr3/k;->a:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lr3/k;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v1, p1, Lr3/k;->b:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lr3/k;->c:Lt3/a;

    .line 32
    .line 33
    iget-object v1, p1, Lr3/k;->c:Lt3/a;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lr3/k;->d:Lr3/j;

    .line 42
    .line 43
    iget-object v1, p1, Lr3/k;->d:Lr3/j;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Lr3/k;->e:Landroid/graphics/Bitmap$Config;

    .line 52
    .line 53
    iget-object v1, p1, Lr3/k;->e:Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    if-ne v0, v1, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lr3/k;->f:Ls3/d;

    .line 58
    .line 59
    iget-object v1, p1, Lr3/k;->f:Ls3/d;

    .line 60
    .line 61
    if-ne v0, v1, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Lr3/k;->g:Ljava/util/List;

    .line 64
    .line 65
    iget-object v1, p1, Lr3/k;->g:Ljava/util/List;

    .line 66
    .line 67
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    iget-object v0, p0, Lr3/k;->h:Lu3/d;

    .line 74
    .line 75
    iget-object v1, p1, Lr3/k;->h:Lu3/d;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    iget-object v0, p0, Lr3/k;->i:Lokhttp3/y;

    .line 84
    .line 85
    iget-object v1, p1, Lr3/k;->i:Lokhttp3/y;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    iget-object v0, p0, Lr3/k;->j:Lr3/s;

    .line 94
    .line 95
    iget-object v1, p1, Lr3/k;->j:Lr3/s;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lr3/s;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    iget-boolean v0, p0, Lr3/k;->k:Z

    .line 104
    .line 105
    iget-boolean v1, p1, Lr3/k;->k:Z

    .line 106
    .line 107
    if-ne v0, v1, :cond_1

    .line 108
    .line 109
    iget-boolean v0, p0, Lr3/k;->l:Z

    .line 110
    .line 111
    iget-boolean v1, p1, Lr3/k;->l:Z

    .line 112
    .line 113
    if-ne v0, v1, :cond_1

    .line 114
    .line 115
    iget-boolean v0, p0, Lr3/k;->m:Z

    .line 116
    .line 117
    iget-boolean v1, p1, Lr3/k;->m:Z

    .line 118
    .line 119
    if-ne v0, v1, :cond_1

    .line 120
    .line 121
    iget-boolean v0, p0, Lr3/k;->n:Z

    .line 122
    .line 123
    iget-boolean v1, p1, Lr3/k;->n:Z

    .line 124
    .line 125
    if-ne v0, v1, :cond_1

    .line 126
    .line 127
    iget-object v0, p0, Lr3/k;->o:Lr3/b;

    .line 128
    .line 129
    iget-object v1, p1, Lr3/k;->o:Lr3/b;

    .line 130
    .line 131
    if-ne v0, v1, :cond_1

    .line 132
    .line 133
    iget-object v0, p0, Lr3/k;->p:Lr3/b;

    .line 134
    .line 135
    iget-object v1, p1, Lr3/k;->p:Lr3/b;

    .line 136
    .line 137
    if-ne v0, v1, :cond_1

    .line 138
    .line 139
    iget-object v0, p0, Lr3/k;->q:Lr3/b;

    .line 140
    .line 141
    iget-object v1, p1, Lr3/k;->q:Lr3/b;

    .line 142
    .line 143
    if-ne v0, v1, :cond_1

    .line 144
    .line 145
    iget-object v0, p0, Lr3/k;->r:Li7/r;

    .line 146
    .line 147
    iget-object v1, p1, Lr3/k;->r:Li7/r;

    .line 148
    .line 149
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_1

    .line 154
    .line 155
    iget-object v0, p0, Lr3/k;->s:Li7/r;

    .line 156
    .line 157
    iget-object v1, p1, Lr3/k;->s:Li7/r;

    .line 158
    .line 159
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_1

    .line 164
    .line 165
    iget-object v0, p0, Lr3/k;->t:Li7/r;

    .line 166
    .line 167
    iget-object v1, p1, Lr3/k;->t:Li7/r;

    .line 168
    .line 169
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_1

    .line 174
    .line 175
    iget-object v0, p0, Lr3/k;->u:Li7/r;

    .line 176
    .line 177
    iget-object v1, p1, Lr3/k;->u:Li7/r;

    .line 178
    .line 179
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_1

    .line 184
    .line 185
    iget-object v0, p0, Lr3/k;->v:Landroidx/lifecycle/o;

    .line 186
    .line 187
    iget-object v1, p1, Lr3/k;->v:Landroidx/lifecycle/o;

    .line 188
    .line 189
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_1

    .line 194
    .line 195
    iget-object v0, p0, Lr3/k;->w:Ls3/i;

    .line 196
    .line 197
    iget-object v1, p1, Lr3/k;->w:Ls3/i;

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_1

    .line 204
    .line 205
    iget-object v0, p0, Lr3/k;->x:Ls3/g;

    .line 206
    .line 207
    iget-object v1, p1, Lr3/k;->x:Ls3/g;

    .line 208
    .line 209
    if-ne v0, v1, :cond_1

    .line 210
    .line 211
    iget-object v0, p0, Lr3/k;->y:Lr3/p;

    .line 212
    .line 213
    iget-object v1, p1, Lr3/k;->y:Lr3/p;

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Lr3/p;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_1

    .line 220
    .line 221
    iget-object v0, p0, Lr3/k;->z:Lr3/d;

    .line 222
    .line 223
    iget-object v1, p1, Lr3/k;->z:Lr3/d;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lr3/d;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_1

    .line 230
    .line 231
    iget-object v0, p0, Lr3/k;->A:Lr3/c;

    .line 232
    .line 233
    iget-object p1, p1, Lr3/k;->A:Lr3/c;

    .line 234
    .line 235
    invoke-static {v0, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-eqz p1, :cond_1

    .line 240
    .line 241
    :goto_0
    const/4 p1, 0x1

    .line 242
    return p1

    .line 243
    :cond_1
    const/4 p1, 0x0

    .line 244
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lr3/k;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lr3/k;->b:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iget-object v2, p0, Lr3/k;->c:Lt3/a;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v2, Lt3/a;->k:Landroid/widget/ImageView;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v0

    .line 31
    :goto_0
    add-int/2addr v1, v2

    .line 32
    mul-int/lit8 v1, v1, 0x1f

    .line 33
    .line 34
    iget-object v2, p0, Lr3/k;->d:Lr3/j;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :cond_1
    add-int/2addr v1, v0

    .line 43
    mul-int/lit16 v1, v1, 0x745f

    .line 44
    .line 45
    iget-object v0, p0, Lr3/k;->e:Landroid/graphics/Bitmap$Config;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit16 v0, v0, 0x3c1

    .line 53
    .line 54
    iget-object v1, p0, Lr3/k;->f:Ls3/d;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    mul-int/lit16 v1, v1, 0x745f

    .line 62
    .line 63
    iget-object v0, p0, Lr3/k;->g:Ljava/util/List;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-int/2addr v0, v1

    .line 70
    mul-int/lit8 v0, v0, 0x1f

    .line 71
    .line 72
    iget-object v1, p0, Lr3/k;->h:Lu3/d;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v1, v0

    .line 79
    mul-int/lit8 v1, v1, 0x1f

    .line 80
    .line 81
    iget-object v0, p0, Lr3/k;->i:Lokhttp3/y;

    .line 82
    .line 83
    invoke-virtual {v0}, Lokhttp3/y;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    add-int/2addr v0, v1

    .line 88
    mul-int/lit8 v0, v0, 0x1f

    .line 89
    .line 90
    iget-object v1, p0, Lr3/k;->j:Lr3/s;

    .line 91
    .line 92
    iget-object v1, v1, Lr3/s;->a:Ljava/util/Map;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    add-int/2addr v1, v0

    .line 99
    mul-int/lit8 v1, v1, 0x1f

    .line 100
    .line 101
    iget-boolean v0, p0, Lr3/k;->k:Z

    .line 102
    .line 103
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    add-int/2addr v0, v1

    .line 108
    mul-int/lit8 v0, v0, 0x1f

    .line 109
    .line 110
    iget-boolean v1, p0, Lr3/k;->l:Z

    .line 111
    .line 112
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    add-int/2addr v1, v0

    .line 117
    mul-int/lit8 v1, v1, 0x1f

    .line 118
    .line 119
    iget-boolean v0, p0, Lr3/k;->m:Z

    .line 120
    .line 121
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    add-int/2addr v0, v1

    .line 126
    mul-int/lit8 v0, v0, 0x1f

    .line 127
    .line 128
    iget-boolean v1, p0, Lr3/k;->n:Z

    .line 129
    .line 130
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/2addr v1, v0

    .line 135
    mul-int/lit8 v1, v1, 0x1f

    .line 136
    .line 137
    iget-object v0, p0, Lr3/k;->o:Lr3/b;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    add-int/2addr v0, v1

    .line 144
    mul-int/lit8 v0, v0, 0x1f

    .line 145
    .line 146
    iget-object v1, p0, Lr3/k;->p:Lr3/b;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    add-int/2addr v1, v0

    .line 153
    mul-int/lit8 v1, v1, 0x1f

    .line 154
    .line 155
    iget-object v0, p0, Lr3/k;->q:Lr3/b;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    add-int/2addr v0, v1

    .line 162
    mul-int/lit8 v0, v0, 0x1f

    .line 163
    .line 164
    iget-object v1, p0, Lr3/k;->r:Li7/r;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    add-int/2addr v1, v0

    .line 171
    mul-int/lit8 v1, v1, 0x1f

    .line 172
    .line 173
    iget-object v0, p0, Lr3/k;->s:Li7/r;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    add-int/2addr v0, v1

    .line 180
    mul-int/lit8 v0, v0, 0x1f

    .line 181
    .line 182
    iget-object v1, p0, Lr3/k;->t:Li7/r;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    add-int/2addr v1, v0

    .line 189
    mul-int/lit8 v1, v1, 0x1f

    .line 190
    .line 191
    iget-object v0, p0, Lr3/k;->u:Li7/r;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    add-int/2addr v0, v1

    .line 198
    mul-int/lit8 v0, v0, 0x1f

    .line 199
    .line 200
    iget-object v1, p0, Lr3/k;->v:Landroidx/lifecycle/o;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    add-int/2addr v1, v0

    .line 207
    mul-int/lit8 v1, v1, 0x1f

    .line 208
    .line 209
    iget-object v0, p0, Lr3/k;->w:Ls3/i;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    add-int/2addr v0, v1

    .line 216
    mul-int/lit8 v0, v0, 0x1f

    .line 217
    .line 218
    iget-object v1, p0, Lr3/k;->x:Ls3/g;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    add-int/2addr v1, v0

    .line 225
    mul-int/lit8 v1, v1, 0x1f

    .line 226
    .line 227
    iget-object v0, p0, Lr3/k;->y:Lr3/p;

    .line 228
    .line 229
    iget-object v0, v0, Lr3/p;->j:Ljava/util/Map;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    add-int/2addr v0, v1

    .line 236
    const v1, -0x6bbb90ff

    .line 237
    .line 238
    .line 239
    mul-int/2addr v0, v1

    .line 240
    iget-object v1, p0, Lr3/k;->z:Lr3/d;

    .line 241
    .line 242
    invoke-virtual {v1}, Lr3/d;->hashCode()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    add-int/2addr v1, v0

    .line 247
    mul-int/lit8 v1, v1, 0x1f

    .line 248
    .line 249
    iget-object v0, p0, Lr3/k;->A:Lr3/c;

    .line 250
    .line 251
    invoke-virtual {v0}, Lr3/c;->hashCode()I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    add-int/2addr v0, v1

    .line 256
    return v0
.end method
