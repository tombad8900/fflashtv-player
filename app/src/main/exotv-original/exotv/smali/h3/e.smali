.class public final synthetic Lh3/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:La4/c;


# direct methods
.method public synthetic constructor <init>(La4/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh3/e;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lh3/e;->k:La4/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lh3/e;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh3/e;->k:La4/c;

    .line 7
    .line 8
    sget-object v1, Lv3/k;->a:Lv3/k;

    .line 9
    .line 10
    iget-object v0, v0, La4/c;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v2, Lv3/k;->b:Lj3/i;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    sget-object v7, Lv7/p;->a:Lv7/w;

    .line 20
    .line 21
    sget-object v2, Li7/e0;->a:Lo7/e;

    .line 22
    .line 23
    sget-object v6, Lo7/d;->l:Lo7/d;

    .line 24
    .line 25
    sget-object v2, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lw6/a;->v(Ljava/io/File;)Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v2, Lv7/b0;->k:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, Lv7/a0;->e(Ljava/io/File;)Lv7/b0;

    .line 43
    .line 44
    .line 45
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    const-wide/32 v11, 0xa00000

    .line 47
    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v8}, Lv7/b0;->toFile()Ljava/io/File;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v2, Landroid/os/StatFs;

    .line 61
    .line 62
    invoke-direct {v2, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    long-to-double v3, v3

    .line 70
    const-wide v9, 0x3f947ae147ae147bL    # 0.02

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    mul-double/2addr v9, v3

    .line 76
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    long-to-double v2, v2

    .line 81
    mul-double/2addr v9, v2

    .line 82
    double-to-long v9, v9

    .line 83
    const-wide/32 v13, 0xfa00000

    .line 84
    .line 85
    .line 86
    invoke-static/range {v9 .. v14}, Lcom/bumptech/glide/c;->u(JJJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :catch_0
    move-wide v4, v11

    .line 91
    :try_start_2
    new-instance v3, Lj3/i;

    .line 92
    .line 93
    invoke-direct/range {v3 .. v8}, Lj3/i;-><init>(JLi7/r;Lv7/p;Lv7/b0;)V

    .line 94
    .line 95
    .line 96
    sput-object v3, Lv3/k;->b:Lj3/i;

    .line 97
    .line 98
    move-object v2, v3

    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    const-string v0, "cacheDir == null"

    .line 103
    .line 104
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    :cond_1
    :goto_0
    monitor-exit v1

    .line 111
    return-object v2

    .line 112
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    throw v0

    .line 114
    :pswitch_0
    iget-object v0, p0, Lh3/e;->k:La4/c;

    .line 115
    .line 116
    const-class v1, Landroid/app/ActivityManager;

    .line 117
    .line 118
    iget-object v0, v0, La4/c;->k:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Landroid/content/Context;

    .line 121
    .line 122
    sget-object v2, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 123
    .line 124
    const-wide v2, 0x3fc999999999999aL    # 0.2

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :try_start_4
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    check-cast v4, Landroid/app/ActivityManager;

    .line 137
    .line 138
    invoke-virtual {v4}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 139
    .line 140
    .line 141
    move-result v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 142
    if-eqz v4, :cond_2

    .line 143
    .line 144
    const-wide v2, 0x3fc3333333333333L    # 0.15

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    :catch_1
    :cond_2
    new-instance v4, La4/j;

    .line 150
    .line 151
    const/4 v5, 0x5

    .line 152
    const/4 v6, 0x0

    .line 153
    invoke-direct {v4, v5, v6}, La4/j;-><init>(IZ)V

    .line 154
    .line 155
    .line 156
    const-wide/16 v7, 0x0

    .line 157
    .line 158
    cmpl-double v5, v2, v7

    .line 159
    .line 160
    if-lez v5, :cond_4

    .line 161
    .line 162
    sget-object v5, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 163
    .line 164
    :try_start_5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    check-cast v1, Landroid/app/ActivityManager;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 178
    .line 179
    const/high16 v5, 0x100000

    .line 180
    .line 181
    and-int/2addr v0, v5

    .line 182
    if-eqz v0, :cond_3

    .line 183
    .line 184
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    goto :goto_2

    .line 189
    :cond_3
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 190
    .line 191
    .line 192
    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 193
    goto :goto_2

    .line 194
    :catch_2
    const/16 v0, 0x100

    .line 195
    .line 196
    :goto_2
    int-to-double v0, v0

    .line 197
    mul-double/2addr v2, v0

    .line 198
    const/16 v0, 0x400

    .line 199
    .line 200
    int-to-double v0, v0

    .line 201
    mul-double/2addr v2, v0

    .line 202
    mul-double/2addr v2, v0

    .line 203
    double-to-int v6, v2

    .line 204
    :cond_4
    if-lez v6, :cond_5

    .line 205
    .line 206
    new-instance v0, La1/e;

    .line 207
    .line 208
    invoke-direct {v0, v6, v4}, La1/e;-><init>(ILa4/j;)V

    .line 209
    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_5
    new-instance v0, Ll/o;

    .line 213
    .line 214
    invoke-direct {v0, v4}, Ll/o;-><init>(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :goto_3
    new-instance v1, Lp3/c;

    .line 218
    .line 219
    invoke-direct {v1, v0, v4}, Lp3/c;-><init>(Lp3/g;La4/j;)V

    .line 220
    .line 221
    .line 222
    return-object v1

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
