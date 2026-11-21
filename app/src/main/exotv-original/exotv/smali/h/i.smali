.class public abstract Lh/i;
.super Lb/l;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh/j;


# instance fields
.field public final B:La1/o;

.field public final C:Landroidx/lifecycle/x;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Lh/x;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lb/l;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La1/z;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La1/z;-><init>(Lh/i;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La1/o;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, v2, v0}, La1/o;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lh/i;->B:La1/o;

    .line 16
    .line 17
    new-instance v0, Landroidx/lifecycle/x;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Landroidx/lifecycle/x;-><init>(Landroidx/lifecycle/v;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lh/i;->F:Z

    .line 26
    .line 27
    iget-object v0, p0, Lb/l;->m:Ln4/p;

    .line 28
    .line 29
    iget-object v0, v0, Ln4/p;->m:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La3/e;

    .line 32
    .line 33
    new-instance v1, La1/w;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, v2, p0}, La1/w;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const-string v2, "android:support:lifecycle"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, La3/e;->e(Ljava/lang/String;La3/d;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La1/x;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, v1}, La1/x;-><init>(Lh/i;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lb/l;->g(Ll0/a;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, La1/x;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, v1}, La1/x;-><init>(Lh/i;I)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lb/l;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    new-instance v0, La1/y;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {v0, p0, v1}, La1/y;-><init>(Lh/i;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lb/l;->h(Lc/a;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lb/l;->m:Ln4/p;

    .line 74
    .line 75
    iget-object v0, v0, Ln4/p;->m:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, La3/e;

    .line 78
    .line 79
    new-instance v1, La3/a;

    .line 80
    .line 81
    invoke-direct {v1, p0}, La3/a;-><init>(Lh/i;)V

    .line 82
    .line 83
    .line 84
    const-string v2, "androidx:appcompat"

    .line 85
    .line 86
    invoke-virtual {v0, v2, v1}, La3/e;->e(Ljava/lang/String;La3/d;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lh/h;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Lh/h;-><init>(Lh/i;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lb/l;->h(Lc/a;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static l(La1/n0;)Z
    .locals 5

    .line 1
    iget-object p0, p0, La1/n0;->c:La1/h;

    .line 2
    .line 3
    invoke-virtual {p0}, La1/h;->k()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La1/v;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, La1/v;->B:La1/z;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, La1/z;->t:Lh/i;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, La1/v;->g()La1/n0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lh/i;->l(La1/n0;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, La1/v;->W:La1/w0;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    sget-object v4, Landroidx/lifecycle/n;->m:Landroidx/lifecycle/n;

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, La1/w0;->f()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v2, La1/w0;->l:Landroidx/lifecycle/x;

    .line 57
    .line 58
    iget-object v2, v2, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ltz v2, :cond_4

    .line 65
    .line 66
    iget-object v0, v1, La1/v;->W:La1/w0;

    .line 67
    .line 68
    iget-object v0, v0, La1/w0;->l:Landroidx/lifecycle/x;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/lifecycle/x;->n()V

    .line 71
    .line 72
    .line 73
    move v0, v3

    .line 74
    :cond_4
    iget-object v2, v1, La1/v;->V:Landroidx/lifecycle/x;

    .line 75
    .line 76
    iget-object v2, v2, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 77
    .line 78
    invoke-virtual {v2, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ltz v2, :cond_0

    .line 83
    .line 84
    iget-object v0, v1, La1/v;->V:Landroidx/lifecycle/x;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/lifecycle/x;->n()V

    .line 87
    .line 88
    .line 89
    move v0, v3

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    return v0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb/l;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/x;->v()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lh/x;->J:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lh/x;->v:Lh/s;

    .line 28
    .line 29
    iget-object p2, v0, Lh/x;->u:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lh/s;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/x;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lh/x;->W:Z

    .line 9
    .line 10
    iget v2, v0, Lh/x;->a0:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lh/o;->k:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lh/x;->B(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lh/o;->b(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_7

    .line 29
    .line 30
    invoke-static {p1}, Lh/o;->b(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x21

    .line 40
    .line 41
    if-lt v2, v4, :cond_2

    .line 42
    .line 43
    sget-boolean v2, Lh/o;->o:Z

    .line 44
    .line 45
    if-nez v2, :cond_7

    .line 46
    .line 47
    sget-object v2, Lh/o;->j:Lh/m;

    .line 48
    .line 49
    new-instance v4, Lh/k;

    .line 50
    .line 51
    invoke-direct {v4, p1, v3}, Lh/k;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Lh/m;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Lh/o;->r:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v4, Lh/o;->l:Li0/d;

    .line 62
    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    sget-object v4, Lh/o;->m:Li0/d;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lb0/c;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Li0/d;->a(Ljava/lang/String;)Li0/d;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sput-object v4, Lh/o;->m:Li0/d;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    sget-object v4, Lh/o;->m:Li0/d;

    .line 83
    .line 84
    iget-object v4, v4, Li0/d;->a:Li0/e;

    .line 85
    .line 86
    iget-object v4, v4, Li0/e;->a:Landroid/os/LocaleList;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/os/LocaleList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    monitor-exit v2

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    sget-object v4, Lh/o;->m:Li0/d;

    .line 97
    .line 98
    sput-object v4, Lh/o;->l:Li0/d;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    sget-object v5, Lh/o;->m:Li0/d;

    .line 102
    .line 103
    invoke-virtual {v4, v5}, Li0/d;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_6

    .line 108
    .line 109
    sget-object v4, Lh/o;->l:Li0/d;

    .line 110
    .line 111
    sput-object v4, Lh/o;->m:Li0/d;

    .line 112
    .line 113
    iget-object v4, v4, Li0/d;->a:Li0/e;

    .line 114
    .line 115
    iget-object v4, v4, Li0/e;->a:Landroid/os/LocaleList;

    .line 116
    .line 117
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {p1, v4}, Lb0/c;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_2
    monitor-exit v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    throw p1

    .line 128
    :cond_7
    :goto_4
    invoke-static {p1}, Lh/x;->o(Landroid/content/Context;)Li0/d;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    if-eqz v4, :cond_8

    .line 136
    .line 137
    invoke-static {p1, v0, v2, v5, v3}, Lh/x;->s(Landroid/content/Context;ILi0/d;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    :try_start_1
    move-object v6, p1

    .line 142
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 143
    .line 144
    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 145
    .line 146
    .line 147
    goto/16 :goto_b

    .line 148
    .line 149
    :catch_0
    :cond_8
    instance-of v4, p1, Lk/c;

    .line 150
    .line 151
    if-eqz v4, :cond_9

    .line 152
    .line 153
    invoke-static {p1, v0, v2, v5, v3}, Lh/x;->s(Landroid/content/Context;ILi0/d;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    :try_start_2
    move-object v4, p1

    .line 158
    check-cast v4, Lk/c;

    .line 159
    .line 160
    invoke-virtual {v4, v3}, Lk/c;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 161
    .line 162
    .line 163
    goto/16 :goto_b

    .line 164
    .line 165
    :catch_1
    :cond_9
    sget-boolean v3, Lh/x;->r0:Z

    .line 166
    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    goto/16 :goto_b

    .line 170
    .line 171
    :cond_a
    new-instance v3, Landroid/content/res/Configuration;

    .line 172
    .line 173
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 174
    .line 175
    .line 176
    const/4 v4, -0x1

    .line 177
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 181
    .line 182
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 203
    .line 204
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 205
    .line 206
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-nez v7, :cond_20

    .line 211
    .line 212
    new-instance v7, Landroid/content/res/Configuration;

    .line 213
    .line 214
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 215
    .line 216
    .line 217
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 218
    .line 219
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_b

    .line 224
    .line 225
    goto/16 :goto_5

    .line 226
    .line 227
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 228
    .line 229
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 230
    .line 231
    cmpl-float v4, v4, v8

    .line 232
    .line 233
    if-eqz v4, :cond_c

    .line 234
    .line 235
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 236
    .line 237
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 238
    .line 239
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 240
    .line 241
    if-eq v4, v8, :cond_d

    .line 242
    .line 243
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 244
    .line 245
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 246
    .line 247
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 248
    .line 249
    if-eq v4, v8, :cond_e

    .line 250
    .line 251
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 252
    .line 253
    :cond_e
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 254
    .line 255
    invoke-virtual {v3}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    invoke-virtual {v6}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    invoke-virtual {v8, v9}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-nez v8, :cond_f

    .line 268
    .line 269
    invoke-virtual {v7, v9}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 270
    .line 271
    .line 272
    iget-object v8, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 273
    .line 274
    iput-object v8, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 275
    .line 276
    :cond_f
    iget v8, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 277
    .line 278
    iget v9, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 279
    .line 280
    if-eq v8, v9, :cond_10

    .line 281
    .line 282
    iput v9, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 283
    .line 284
    :cond_10
    iget v8, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 285
    .line 286
    iget v9, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 287
    .line 288
    if-eq v8, v9, :cond_11

    .line 289
    .line 290
    iput v9, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 291
    .line 292
    :cond_11
    iget v8, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 293
    .line 294
    iget v9, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 295
    .line 296
    if-eq v8, v9, :cond_12

    .line 297
    .line 298
    iput v9, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 299
    .line 300
    :cond_12
    iget v8, v3, Landroid/content/res/Configuration;->navigation:I

    .line 301
    .line 302
    iget v9, v6, Landroid/content/res/Configuration;->navigation:I

    .line 303
    .line 304
    if-eq v8, v9, :cond_13

    .line 305
    .line 306
    iput v9, v7, Landroid/content/res/Configuration;->navigation:I

    .line 307
    .line 308
    :cond_13
    iget v8, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 309
    .line 310
    iget v9, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 311
    .line 312
    if-eq v8, v9, :cond_14

    .line 313
    .line 314
    iput v9, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 315
    .line 316
    :cond_14
    iget v8, v3, Landroid/content/res/Configuration;->orientation:I

    .line 317
    .line 318
    iget v9, v6, Landroid/content/res/Configuration;->orientation:I

    .line 319
    .line 320
    if-eq v8, v9, :cond_15

    .line 321
    .line 322
    iput v9, v7, Landroid/content/res/Configuration;->orientation:I

    .line 323
    .line 324
    :cond_15
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 325
    .line 326
    and-int/lit8 v8, v8, 0xf

    .line 327
    .line 328
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 329
    .line 330
    and-int/lit8 v9, v9, 0xf

    .line 331
    .line 332
    if-eq v8, v9, :cond_16

    .line 333
    .line 334
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 335
    .line 336
    or-int/2addr v8, v9

    .line 337
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 338
    .line 339
    :cond_16
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 340
    .line 341
    and-int/lit16 v8, v8, 0xc0

    .line 342
    .line 343
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 344
    .line 345
    and-int/lit16 v9, v9, 0xc0

    .line 346
    .line 347
    if-eq v8, v9, :cond_17

    .line 348
    .line 349
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 350
    .line 351
    or-int/2addr v8, v9

    .line 352
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 353
    .line 354
    :cond_17
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 355
    .line 356
    and-int/lit8 v8, v8, 0x30

    .line 357
    .line 358
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 359
    .line 360
    and-int/lit8 v9, v9, 0x30

    .line 361
    .line 362
    if-eq v8, v9, :cond_18

    .line 363
    .line 364
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 365
    .line 366
    or-int/2addr v8, v9

    .line 367
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 368
    .line 369
    :cond_18
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 370
    .line 371
    and-int/lit16 v8, v8, 0x300

    .line 372
    .line 373
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 374
    .line 375
    and-int/lit16 v9, v9, 0x300

    .line 376
    .line 377
    if-eq v8, v9, :cond_19

    .line 378
    .line 379
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 380
    .line 381
    or-int/2addr v8, v9

    .line 382
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 383
    .line 384
    :cond_19
    const/16 v8, 0x1a

    .line 385
    .line 386
    if-lt v4, v8, :cond_1a

    .line 387
    .line 388
    invoke-static {v3, v6, v7}, Lb6/v;->c(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 389
    .line 390
    .line 391
    :cond_1a
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 392
    .line 393
    and-int/lit8 v4, v4, 0xf

    .line 394
    .line 395
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 396
    .line 397
    and-int/lit8 v8, v8, 0xf

    .line 398
    .line 399
    if-eq v4, v8, :cond_1b

    .line 400
    .line 401
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 402
    .line 403
    or-int/2addr v4, v8

    .line 404
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 405
    .line 406
    :cond_1b
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 407
    .line 408
    and-int/lit8 v4, v4, 0x30

    .line 409
    .line 410
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 411
    .line 412
    and-int/lit8 v8, v8, 0x30

    .line 413
    .line 414
    if-eq v4, v8, :cond_1c

    .line 415
    .line 416
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 417
    .line 418
    or-int/2addr v4, v8

    .line 419
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 420
    .line 421
    :cond_1c
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 422
    .line 423
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 424
    .line 425
    if-eq v4, v8, :cond_1d

    .line 426
    .line 427
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 428
    .line 429
    :cond_1d
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 430
    .line 431
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 432
    .line 433
    if-eq v4, v8, :cond_1e

    .line 434
    .line 435
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 436
    .line 437
    :cond_1e
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 438
    .line 439
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 440
    .line 441
    if-eq v4, v8, :cond_1f

    .line 442
    .line 443
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 444
    .line 445
    :cond_1f
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 446
    .line 447
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 448
    .line 449
    if-eq v3, v4, :cond_21

    .line 450
    .line 451
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_20
    move-object v7, v5

    .line 455
    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v7, v1}, Lh/x;->s(Landroid/content/Context;ILi0/d;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v2, Lk/c;

    .line 460
    .line 461
    const v3, 0x7f1202c5

    .line 462
    .line 463
    .line 464
    invoke-direct {v2, p1, v3}, Lk/c;-><init>(Landroid/content/Context;I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v0}, Lk/c;->a(Landroid/content/res/Configuration;)V

    .line 468
    .line 469
    .line 470
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 471
    .line 472
    .line 473
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5

    .line 474
    if-eqz p1, :cond_25

    .line 475
    .line 476
    invoke-virtual {v2}, Lk/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 481
    .line 482
    const/16 v3, 0x1d

    .line 483
    .line 484
    if-lt v0, v3, :cond_22

    .line 485
    .line 486
    invoke-static {p1}, Ld0/j;->a(Landroid/content/res/Resources$Theme;)V

    .line 487
    .line 488
    .line 489
    goto :goto_a

    .line 490
    :cond_22
    sget-object v0, Ld0/b;->e:Ljava/lang/Object;

    .line 491
    .line 492
    monitor-enter v0

    .line 493
    :try_start_4
    sget-boolean v3, Ld0/b;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 494
    .line 495
    if-nez v3, :cond_23

    .line 496
    .line 497
    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 498
    .line 499
    const-string v4, "rebase"

    .line 500
    .line 501
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    sput-object v3, Ld0/b;->f:Ljava/lang/reflect/Method;

    .line 506
    .line 507
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 508
    .line 509
    .line 510
    goto :goto_6

    .line 511
    :catchall_1
    move-exception p1

    .line 512
    goto :goto_9

    .line 513
    :catch_2
    move-exception v3

    .line 514
    :try_start_6
    const-string v4, "ResourcesCompat"

    .line 515
    .line 516
    const-string v6, "Failed to retrieve rebase() method"

    .line 517
    .line 518
    invoke-static {v4, v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 519
    .line 520
    .line 521
    :goto_6
    sput-boolean v1, Ld0/b;->g:Z

    .line 522
    .line 523
    :cond_23
    sget-object v1, Ld0/b;->f:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 524
    .line 525
    if-eqz v1, :cond_24

    .line 526
    .line 527
    :try_start_7
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 528
    .line 529
    .line 530
    goto :goto_8

    .line 531
    :catch_3
    move-exception p1

    .line 532
    goto :goto_7

    .line 533
    :catch_4
    move-exception p1

    .line 534
    :goto_7
    :try_start_8
    const-string v1, "ResourcesCompat"

    .line 535
    .line 536
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 537
    .line 538
    invoke-static {v1, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 539
    .line 540
    .line 541
    sput-object v5, Ld0/b;->f:Ljava/lang/reflect/Method;

    .line 542
    .line 543
    :cond_24
    :goto_8
    monitor-exit v0

    .line 544
    goto :goto_a

    .line 545
    :goto_9
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 546
    throw p1

    .line 547
    :catch_5
    :cond_25
    :goto_a
    move-object p1, v2

    .line 548
    :goto_b
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 549
    .line 550
    .line 551
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/x;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/x;->z()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/x;->z()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, Lb0/e;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p4, :cond_5

    .line 6
    .line 7
    array-length v1, p4

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    aget-object v1, p4, v0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v2, "--autofill"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1a

    .line 33
    .line 34
    if-lt v1, v2, :cond_5

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v2, "--contentcapture"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v2, 0x1d

    .line 49
    .line 50
    if-lt v1, v2, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_2
    const-string v2, "--list-dumpables"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_3
    const-string v2, "--dump-dumpable"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v2, 0x21

    .line 74
    .line 75
    if-lt v1, v2, :cond_5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :sswitch_4
    const-string v2, "--translation"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 88
    .line 89
    const/16 v2, 0x1f

    .line 90
    .line 91
    if-lt v1, v2, :cond_5

    .line 92
    .line 93
    :goto_0
    return-void

    .line 94
    :cond_5
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v1, "Local FragmentActivity "

    .line 98
    .line 99
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v1, " State:"

    .line 114
    .line 115
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v2, "  "

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string v2, "mCreated="

    .line 139
    .line 140
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-boolean v2, p0, Lh/i;->D:Z

    .line 144
    .line 145
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 146
    .line 147
    .line 148
    const-string v2, " mResumed="

    .line 149
    .line 150
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-boolean v2, p0, Lh/i;->E:Z

    .line 154
    .line 155
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 156
    .line 157
    .line 158
    const-string v2, " mStopped="

    .line 159
    .line 160
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-boolean v2, p0, Lh/i;->F:Z

    .line 164
    .line 165
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eqz v2, :cond_8

    .line 173
    .line 174
    invoke-interface {p0}, Landroidx/lifecycle/u0;->b()Landroidx/lifecycle/t0;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    new-instance v3, La1/o;

    .line 179
    .line 180
    sget-object v4, Lf1/a;->c:La1/p0;

    .line 181
    .line 182
    invoke-direct {v3, v2, v4}, La1/o;-><init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;)V

    .line 183
    .line 184
    .line 185
    const-class v2, Lf1/a;

    .line 186
    .line 187
    invoke-virtual {v3, v2}, La1/o;->o(Ljava/lang/Class;)Landroidx/lifecycle/r0;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Lf1/a;

    .line 192
    .line 193
    iget-object v2, v2, Lf1/a;->b:Lp/l;

    .line 194
    .line 195
    iget v3, v2, Lp/l;->l:I

    .line 196
    .line 197
    if-lez v3, :cond_8

    .line 198
    .line 199
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const-string v3, "Loaders:"

    .line 203
    .line 204
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iget v3, v2, Lp/l;->l:I

    .line 208
    .line 209
    if-gtz v3, :cond_6

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_6
    iget-object p1, v2, Lp/l;->k:[Ljava/lang/Object;

    .line 213
    .line 214
    aget-object p1, p1, v0

    .line 215
    .line 216
    if-nez p1, :cond_7

    .line 217
    .line 218
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const-string p1, "  #"

    .line 222
    .line 223
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object p1, v2, Lp/l;->j:[I

    .line 227
    .line 228
    aget p1, p1, v0

    .line 229
    .line 230
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 231
    .line 232
    .line 233
    const-string p1, ": "

    .line 234
    .line 235
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    const/4 p1, 0x0

    .line 239
    throw p1

    .line 240
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 241
    .line 242
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 243
    .line 244
    .line 245
    throw p1

    .line 246
    :cond_8
    :goto_2
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 247
    .line 248
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, La1/z;

    .line 251
    .line 252
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 253
    .line 254
    invoke-virtual {v0, p1, p2, p3, p4}, La1/n0;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    nop

    .line 259
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/x;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/x;->v()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh/x;->u:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/x;

    .line 6
    .line 7
    iget-object v1, v0, Lh/x;->y:Lk/h;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lh/x;->z()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lk/h;

    .line 15
    .line 16
    iget-object v2, v0, Lh/x;->x:Lh/g0;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lh/g0;->i0()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lh/x;->t:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Lk/h;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lh/x;->y:Lk/h;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lh/x;->y:Lk/h;

    .line 33
    .line 34
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/x;

    .line 6
    .line 7
    iget-object v1, v0, Lh/x;->x:Lh/g0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lh/x;->z()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lh/x;->x:Lh/g0;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lh/x;->A(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final k()Lh/o;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/i;->G:Lh/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/o;->j:Lh/m;

    .line 6
    .line 7
    new-instance v0, Lh/x;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lh/x;-><init>(Landroid/content/Context;Landroid/view/Window;Lh/j;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lh/i;->G:Lh/x;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lh/i;->G:Lh/x;

    .line 16
    .line 17
    return-object v0
.end method

.method public final m()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 5
    .line 6
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La1/z;

    .line 9
    .line 10
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 11
    .line 12
    invoke-virtual {v0}, La1/n0;->k()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 16
    .line 17
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final n(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb/l;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lh/i;->B:La1/o;

    .line 13
    .line 14
    iget-object p1, p1, La1/o;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, La1/z;

    .line 17
    .line 18
    iget-object p1, p1, La1/z;->s:La1/n0;

    .line 19
    .line 20
    invoke-virtual {p1}, La1/n0;->i()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public final o()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 12
    .line 13
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La1/z;

    .line 16
    .line 17
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, La1/n0;->E:Z

    .line 21
    .line 22
    iput-boolean v1, v0, La1/n0;->F:Z

    .line 23
    .line 24
    iget-object v2, v0, La1/n0;->L:La1/q0;

    .line 25
    .line 26
    iput-boolean v1, v2, La1/q0;->g:Z

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-virtual {v0, v1}, La1/n0;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/o;->q()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lb/l;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lb/l;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh/x;

    .line 9
    .line 10
    iget-boolean v0, p1, Lh/x;->N:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Lh/x;->I:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lh/x;->z()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lh/x;->x:Lh/g0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lh/g0;->p:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/high16 v2, 0x7f050000

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lh/g0;->l0(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Lm/t;->a()Lm/t;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p1, Lh/x;->t:Landroid/content/Context;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v2, v0, Lm/t;->a:Lm/y1;

    .line 48
    .line 49
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    :try_start_1
    iget-object v3, v2, Lm/y1;->b:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lp/h;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1}, Lp/h;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    monitor-exit v0

    .line 68
    new-instance v0, Landroid/content/res/Configuration;

    .line 69
    .line 70
    iget-object v1, p1, Lh/x;->t:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p1, Lh/x;->Z:Landroid/content/res/Configuration;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p1, v0, v0}, Lh/x;->m(ZZ)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    :try_start_4
    throw p1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lb/l;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lh/i;->B:La1/o;

    .line 12
    .line 13
    iget-object p1, p1, La1/o;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, La1/z;

    .line 16
    .line 17
    iget-object p1, p1, La1/z;->s:La1/n0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, La1/n0;->E:Z

    .line 21
    .line 22
    iput-boolean v0, p1, La1/n0;->F:Z

    .line 23
    .line 24
    iget-object v1, p1, La1/n0;->L:La1/q0;

    .line 25
    .line 26
    iput-boolean v0, v1, La1/q0;->g:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, La1/n0;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 2
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    check-cast v0, La1/z;

    .line 3
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 4
    iget-object v0, v0, La1/n0;->f:La1/c0;

    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, La1/c0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 7
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 8
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    check-cast v0, La1/z;

    .line 9
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 10
    iget-object v0, v0, La1/n0;->f:La1/c0;

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1, p2, p3}, La1/c0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 12
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/i;->m()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lh/o;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lh/i;->n(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh/x;

    .line 15
    .line 16
    invoke-virtual {p1}, Lh/x;->z()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Lh/x;->x:Lh/g0;

    .line 20
    .line 21
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const v1, 0x102002c

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-ne p2, v1, :cond_7

    .line 30
    .line 31
    if-eqz p1, :cond_7

    .line 32
    .line 33
    iget-object p1, p1, Lh/g0;->t:Lm/d1;

    .line 34
    .line 35
    check-cast p1, Lm/l2;

    .line 36
    .line 37
    iget p1, p1, Lm/l2;->b:I

    .line 38
    .line 39
    and-int/lit8 p1, p1, 0x4

    .line 40
    .line 41
    if-eqz p1, :cond_7

    .line 42
    .line 43
    invoke-static {p0}, Lb0/c;->a(Lh/i;)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_7

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_6

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lb0/c;->a(Lh/i;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-nez p2, :cond_1

    .line 65
    .line 66
    invoke-static {p0}, Lb0/c;->a(Lh/i;)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :cond_1
    if-eqz p2, :cond_4

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    :try_start_0
    invoke-static {p0, v1}, Lb0/c;->b(Lh/i;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_0
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {p0, v1}, Lb0/c;->b(Lh/i;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 108
    :catch_0
    move-exception p1

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :goto_1
    const-string p2, "TaskStackBuilder"

    .line 115
    .line 116
    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    .line 117
    .line 118
    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    throw p2

    .line 127
    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_5

    .line 132
    .line 133
    new-array p2, v2, [Landroid/content/Intent;

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, [Landroid/content/Intent;

    .line 140
    .line 141
    new-instance p2, Landroid/content/Intent;

    .line 142
    .line 143
    aget-object v1, p1, v2

    .line 144
    .line 145
    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 146
    .line 147
    .line 148
    const v1, 0x1000c000

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    aput-object p2, p1, v2

    .line 156
    .line 157
    const/4 p2, 0x0

    .line 158
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 159
    .line 160
    .line 161
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 166
    .line 167
    .line 168
    :goto_3
    return v0

    .line 169
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 172
    .line 173
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :cond_6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 178
    .line 179
    .line 180
    return v0

    .line 181
    :cond_7
    return v2
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lh/i;->E:Z

    .line 6
    .line 7
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 8
    .line 9
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La1/z;

    .line 12
    .line 13
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, La1/n0;->t(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 20
    .line 21
    sget-object v1, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh/x;

    .line 9
    .line 10
    invoke-virtual {p1}, Lh/x;->v()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/i;->o()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/x;->z()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh/x;->x:Lh/g0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lh/g0;->I:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/o;->q()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lb/l;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/o;->q()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lh/i;->E:Z

    .line 11
    .line 12
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La1/z;

    .line 15
    .line 16
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La1/n0;->y(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onStart()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/i;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/x;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lh/x;->m(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/o;->q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/i;->q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/x;->z()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh/x;->x:Lh/g0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lh/g0;->I:Z

    .line 19
    .line 20
    iget-object v0, v0, Lh/g0;->H:Lk/j;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lk/j;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Lh/o;->l(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/x;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/x;->z()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 5

    .line 1
    iget-object v0, p0, Lh/i;->B:La1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/o;->q()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La1/z;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lh/i;->F:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Lh/i;->D:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Lh/i;->D:Z

    .line 22
    .line 23
    iget-object v2, v0, La1/z;->s:La1/n0;

    .line 24
    .line 25
    iput-boolean v1, v2, La1/n0;->E:Z

    .line 26
    .line 27
    iput-boolean v1, v2, La1/n0;->F:Z

    .line 28
    .line 29
    iget-object v4, v2, La1/n0;->L:La1/q0;

    .line 30
    .line 31
    iput-boolean v1, v4, La1/q0;->g:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, La1/n0;->t(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, La1/z;->s:La1/n0;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, La1/n0;->y(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 43
    .line 44
    sget-object v3, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, La1/z;->s:La1/n0;

    .line 50
    .line 51
    iput-boolean v1, v0, La1/n0;->E:Z

    .line 52
    .line 53
    iput-boolean v1, v0, La1/n0;->F:Z

    .line 54
    .line 55
    iget-object v2, v0, La1/n0;->L:La1/q0;

    .line 56
    .line 57
    iput-boolean v1, v2, La1/q0;->g:Z

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1}, La1/n0;->t(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final q()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lh/i;->F:Z

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Lh/i;->B:La1/o;

    .line 8
    .line 9
    iget-object v2, v1, La1/o;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La1/z;

    .line 12
    .line 13
    iget-object v2, v2, La1/z;->s:La1/n0;

    .line 14
    .line 15
    invoke-static {v2}, Lh/i;->l(La1/n0;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, La1/o;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La1/z;

    .line 24
    .line 25
    iget-object v1, v1, La1/z;->s:La1/n0;

    .line 26
    .line 27
    iput-boolean v0, v1, La1/n0;->F:Z

    .line 28
    .line 29
    iget-object v2, v1, La1/n0;->L:La1/q0;

    .line 30
    .line 31
    iput-boolean v0, v2, La1/q0;->g:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, La1/n0;->t(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 38
    .line 39
    sget-object v1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb/l;->j()V

    .line 2
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/o;->g(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lb/l;->j()V

    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/o;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lb/l;->j()V

    .line 6
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh/o;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->k()Lh/o;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/x;

    .line 9
    .line 10
    iput p1, v0, Lh/x;->b0:I

    .line 11
    .line 12
    return-void
.end method
