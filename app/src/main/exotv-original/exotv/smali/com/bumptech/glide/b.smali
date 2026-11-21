.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile q:Lcom/bumptech/glide/b;

.field public static volatile r:Z


# instance fields
.field public final j:Lb4/a;

.field public final k:Lc4/f;

.field public final l:Lcom/bumptech/glide/e;

.field public final m:Lb4/f;

.field public final n:Ln4/l;

.field public final o:Lk2/b;

.field public final p:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;La4/q;Lc4/f;Lb4/a;Lb4/f;Ln4/l;Lk2/b;Ly5/f;Lp/e;Ljava/util/List;Ljava/util/ArrayList;Lcom/bumptech/glide/c;La1/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/bumptech/glide/b;->j:Lb4/a;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/bumptech/glide/b;->m:Lb4/f;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/bumptech/glide/b;->k:Lc4/f;

    .line 16
    .line 17
    iput-object p6, p0, Lcom/bumptech/glide/b;->n:Ln4/l;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/bumptech/glide/b;->o:Lk2/b;

    .line 20
    .line 21
    new-instance p4, Ln4/p;

    .line 22
    .line 23
    invoke-direct {p4, p0, p11, p12}, Ln4/p;-><init>(Lcom/bumptech/glide/b;Ljava/util/ArrayList;Lcom/bumptech/glide/c;)V

    .line 24
    .line 25
    .line 26
    move-object p3, p5

    .line 27
    new-instance p5, Lk2/b;

    .line 28
    .line 29
    const/16 p6, 0x12

    .line 30
    .line 31
    invoke-direct {p5, p6}, Lk2/b;-><init>(I)V

    .line 32
    .line 33
    .line 34
    move-object p7, p9

    .line 35
    move-object p9, p2

    .line 36
    move-object p2, p1

    .line 37
    new-instance p1, Lcom/bumptech/glide/e;

    .line 38
    .line 39
    move-object p6, p8

    .line 40
    move-object p8, p10

    .line 41
    move-object p10, p13

    .line 42
    invoke-direct/range {p1 .. p10}, Lcom/bumptech/glide/e;-><init>(Landroid/content/Context;Lb4/f;Ln4/p;Lk2/b;Ly5/f;Lp/e;Ljava/util/List;La4/q;La1/o;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/e;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 4

    .line 1
    sget-object v0, Lcom/bumptech/glide/b;->q:Lcom/bumptech/glide/b;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Glide"

    .line 10
    .line 11
    :try_start_0
    const-string v2, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Landroid/content/Context;

    .line 18
    .line 19
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :catch_2
    move-exception p0

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :catch_3
    move-exception p0

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 73
    .line 74
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :catch_4
    const/4 v0, 0x5

    .line 79
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 86
    .line 87
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    :cond_0
    const/4 v0, 0x0

    .line 91
    :goto_0
    const-class v1, Lcom/bumptech/glide/b;

    .line 92
    .line 93
    monitor-enter v1

    .line 94
    :try_start_1
    sget-object v2, Lcom/bumptech/glide/b;->q:Lcom/bumptech/glide/b;

    .line 95
    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    sget-boolean v2, Lcom/bumptech/glide/b;->r:Z

    .line 99
    .line 100
    if-nez v2, :cond_1

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    sput-boolean v2, Lcom/bumptech/glide/b;->r:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    :try_start_2
    invoke-static {p0, v0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    .line 109
    :try_start_3
    sput-boolean v2, Lcom/bumptech/glide/b;->r:Z

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    sput-boolean v2, Lcom/bumptech/glide/b;->r:Z

    .line 114
    .line 115
    throw p0

    .line 116
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "Glide has been called recursively, this is probably an internal library error!"

    .line 119
    .line 120
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_2
    :goto_1
    monitor-exit v1

    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    throw p0

    .line 129
    :cond_3
    :goto_2
    sget-object p0, Lcom/bumptech/glide/b;->q:Lcom/bumptech/glide/b;

    .line 130
    .line 131
    return-object p0
.end method

.method public static b(Landroid/content/Context;)Ln4/l;
    .locals 1

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {v0, p0}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Lcom/bumptech/glide/b;->n:Ln4/l;

    .line 11
    .line 12
    return-object p0
.end method

.method public static c(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 27

    .line 1
    new-instance v9, Lp/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v9, v1}, Lp/k;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, La4/c0;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {v2, v0}, La4/c0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v8, Ly5/f;

    .line 14
    .line 15
    const/16 v0, 0xe

    .line 16
    .line 17
    invoke-direct {v8, v0}, Ly5/f;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    const-string v0, "Got app info metadata: "

    .line 27
    .line 28
    const-string v4, "ManifestParser"

    .line 29
    .line 30
    const/4 v5, 0x3

    .line 31
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    const-string v6, "Loading Glide modules"

    .line 38
    .line 39
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    :cond_0
    new-instance v11, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v6, 0x2

    .line 48
    :try_start_0
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    const/16 v12, 0x80

    .line 57
    .line 58
    invoke-virtual {v7, v10, v12}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    if-eqz v7, :cond_5

    .line 63
    .line 64
    iget-object v10, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 65
    .line 66
    if-nez v10, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-eqz v10, :cond_2

    .line 74
    .line 75
    new-instance v10, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 81
    .line 82
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception v0

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    :goto_0
    iget-object v0, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_4

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    check-cast v10, Ljava/lang/String;

    .line 116
    .line 117
    const-string v12, "GlideModule"

    .line 118
    .line 119
    iget-object v13, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 120
    .line 121
    invoke-virtual {v13, v10}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-nez v12, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-static {v10}, Lcom/bumptech/glide/d;->a0(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    throw v0

    .line 137
    :cond_4
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    const-string v0, "Finished loading Glide modules"

    .line 144
    .line 145
    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    :goto_2
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    const-string v0, "Got null app info metadata"

    .line 156
    .line 157
    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :goto_3
    const/4 v7, 0x6

    .line 162
    invoke-static {v4, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_6

    .line 167
    .line 168
    const-string v7, "Failed to parse glide modules"

    .line 169
    .line 170
    invoke-static {v4, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_4
    if-eqz p1, :cond_8

    .line 174
    .line 175
    new-instance v0, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_8

    .line 185
    .line 186
    new-instance v0, Ljava/util/HashSet;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-nez v4, :cond_7

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    new-instance v0, Ljava/lang/ClassCastException;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :cond_8
    :goto_5
    const-string v0, "Glide"

    .line 216
    .line 217
    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_a

    .line 222
    .line 223
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-nez v4, :cond_9

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    new-instance v0, Ljava/lang/ClassCastException;

    .line 242
    .line 243
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 244
    .line 245
    .line 246
    throw v0

    .line 247
    :cond_a
    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-nez v4, :cond_17

    .line 256
    .line 257
    new-instance v0, Ld4/b;

    .line 258
    .line 259
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 260
    .line 261
    .line 262
    sget v4, Ld4/e;->l:I

    .line 263
    .line 264
    const/4 v5, 0x4

    .line 265
    if-nez v4, :cond_b

    .line 266
    .line 267
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v4}, Ljava/lang/Runtime;->availableProcessors()I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    sput v4, Ld4/e;->l:I

    .line 280
    .line 281
    :cond_b
    sget v13, Ld4/e;->l:I

    .line 282
    .line 283
    const-string v4, "source"

    .line 284
    .line 285
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-nez v7, :cond_16

    .line 290
    .line 291
    new-instance v12, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 292
    .line 293
    sget-object v19, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 294
    .line 295
    new-instance v18, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 296
    .line 297
    invoke-direct/range {v18 .. v18}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 298
    .line 299
    .line 300
    new-instance v7, Ld4/c;

    .line 301
    .line 302
    invoke-direct {v7, v0, v4, v1}, Ld4/c;-><init>(Ld4/b;Ljava/lang/String;Z)V

    .line 303
    .line 304
    .line 305
    const-wide/16 v15, 0x0

    .line 306
    .line 307
    move v14, v13

    .line 308
    move-object/from16 v17, v19

    .line 309
    .line 310
    move-object/from16 v19, v7

    .line 311
    .line 312
    invoke-direct/range {v12 .. v19}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 313
    .line 314
    .line 315
    move-object/from16 v19, v17

    .line 316
    .line 317
    new-instance v0, Ld4/e;

    .line 318
    .line 319
    invoke-direct {v0, v12}, Ld4/e;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 320
    .line 321
    .line 322
    new-instance v4, Ld4/b;

    .line 323
    .line 324
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string v7, "disk-cache"

    .line 328
    .line 329
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-nez v10, :cond_15

    .line 334
    .line 335
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 336
    .line 337
    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 338
    .line 339
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 340
    .line 341
    .line 342
    new-instance v10, Ld4/c;

    .line 343
    .line 344
    const/4 v15, 0x1

    .line 345
    invoke-direct {v10, v4, v7, v15}, Ld4/c;-><init>(Ld4/b;Ljava/lang/String;Z)V

    .line 346
    .line 347
    .line 348
    const-wide/16 v17, 0x0

    .line 349
    .line 350
    move/from16 v16, v15

    .line 351
    .line 352
    move-object/from16 v21, v10

    .line 353
    .line 354
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 355
    .line 356
    .line 357
    new-instance v4, Ld4/e;

    .line 358
    .line 359
    invoke-direct {v4, v14}, Ld4/e;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 360
    .line 361
    .line 362
    sget v7, Ld4/e;->l:I

    .line 363
    .line 364
    if-nez v7, :cond_c

    .line 365
    .line 366
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 367
    .line 368
    .line 369
    move-result-object v7

    .line 370
    invoke-virtual {v7}, Ljava/lang/Runtime;->availableProcessors()I

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    sput v7, Ld4/e;->l:I

    .line 379
    .line 380
    :cond_c
    sget v7, Ld4/e;->l:I

    .line 381
    .line 382
    const/4 v10, 0x1

    .line 383
    if-lt v7, v5, :cond_d

    .line 384
    .line 385
    move v15, v6

    .line 386
    goto :goto_7

    .line 387
    :cond_d
    move v15, v10

    .line 388
    :goto_7
    new-instance v5, Ld4/b;

    .line 389
    .line 390
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 391
    .line 392
    .line 393
    const-string v6, "animation"

    .line 394
    .line 395
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    if-nez v7, :cond_14

    .line 400
    .line 401
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 402
    .line 403
    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 404
    .line 405
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 406
    .line 407
    .line 408
    new-instance v7, Ld4/c;

    .line 409
    .line 410
    invoke-direct {v7, v5, v6, v10}, Ld4/c;-><init>(Ld4/b;Ljava/lang/String;Z)V

    .line 411
    .line 412
    .line 413
    const-wide/16 v17, 0x0

    .line 414
    .line 415
    move/from16 v16, v15

    .line 416
    .line 417
    move-object/from16 v21, v7

    .line 418
    .line 419
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 420
    .line 421
    .line 422
    new-instance v5, Ld4/e;

    .line 423
    .line 424
    invoke-direct {v5, v14}, Ld4/e;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 425
    .line 426
    .line 427
    new-instance v6, Lc4/g;

    .line 428
    .line 429
    invoke-direct {v6, v3}, Lc4/g;-><init>(Landroid/content/Context;)V

    .line 430
    .line 431
    .line 432
    new-instance v7, Lc4/h;

    .line 433
    .line 434
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 435
    .line 436
    .line 437
    iget-object v10, v6, Lc4/g;->a:Landroid/content/Context;

    .line 438
    .line 439
    iget v12, v6, Lc4/g;->d:F

    .line 440
    .line 441
    iget-object v13, v6, Lc4/g;->b:Landroid/app/ActivityManager;

    .line 442
    .line 443
    invoke-virtual {v13}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 444
    .line 445
    .line 446
    move-result v14

    .line 447
    if-eqz v14, :cond_e

    .line 448
    .line 449
    const/high16 v14, 0x200000

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_e
    const/high16 v14, 0x400000

    .line 453
    .line 454
    :goto_8
    iput v14, v7, Lc4/h;->c:I

    .line 455
    .line 456
    invoke-virtual {v13}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 457
    .line 458
    .line 459
    move-result v15

    .line 460
    const/high16 v16, 0x100000

    .line 461
    .line 462
    mul-int v15, v15, v16

    .line 463
    .line 464
    invoke-virtual {v13}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 465
    .line 466
    .line 467
    move-result v16

    .line 468
    int-to-float v15, v15

    .line 469
    if-eqz v16, :cond_f

    .line 470
    .line 471
    const v16, 0x3ea8f5c3    # 0.33f

    .line 472
    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_f
    const v16, 0x3ecccccd    # 0.4f

    .line 476
    .line 477
    .line 478
    :goto_9
    mul-float v15, v15, v16

    .line 479
    .line 480
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 481
    .line 482
    .line 483
    move-result v15

    .line 484
    iget-object v6, v6, Lc4/g;->c:La1/o;

    .line 485
    .line 486
    iget-object v6, v6, La1/o;->k:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v6, Landroid/util/DisplayMetrics;

    .line 489
    .line 490
    iget v1, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 491
    .line 492
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 493
    .line 494
    mul-int/2addr v1, v6

    .line 495
    mul-int/lit8 v1, v1, 0x4

    .line 496
    .line 497
    int-to-float v1, v1

    .line 498
    mul-float v6, v1, v12

    .line 499
    .line 500
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    const/high16 v17, 0x40000000    # 2.0f

    .line 505
    .line 506
    mul-float v1, v1, v17

    .line 507
    .line 508
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    move-object/from16 v24, v0

    .line 513
    .line 514
    sub-int v0, v15, v14

    .line 515
    .line 516
    move-object/from16 v23, v4

    .line 517
    .line 518
    add-int v4, v1, v6

    .line 519
    .line 520
    if-gt v4, v0, :cond_10

    .line 521
    .line 522
    iput v1, v7, Lc4/h;->b:I

    .line 523
    .line 524
    iput v6, v7, Lc4/h;->a:I

    .line 525
    .line 526
    goto :goto_a

    .line 527
    :cond_10
    int-to-float v0, v0

    .line 528
    add-float v1, v12, v17

    .line 529
    .line 530
    div-float/2addr v0, v1

    .line 531
    mul-float v17, v17, v0

    .line 532
    .line 533
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    iput v1, v7, Lc4/h;->b:I

    .line 538
    .line 539
    mul-float/2addr v0, v12

    .line 540
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    iput v0, v7, Lc4/h;->a:I

    .line 545
    .line 546
    :goto_a
    const/4 v0, 0x3

    .line 547
    const-string v1, "MemorySizeCalculator"

    .line 548
    .line 549
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_12

    .line 554
    .line 555
    new-instance v0, Ljava/lang/StringBuilder;

    .line 556
    .line 557
    const-string v6, "Calculation complete, Calculated memory cache size: "

    .line 558
    .line 559
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    iget v6, v7, Lc4/h;->b:I

    .line 563
    .line 564
    move-object/from16 v26, v5

    .line 565
    .line 566
    int-to-long v5, v6

    .line 567
    invoke-static {v10, v5, v6}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    const-string v5, ", pool size: "

    .line 575
    .line 576
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    iget v5, v7, Lc4/h;->a:I

    .line 580
    .line 581
    int-to-long v5, v5

    .line 582
    invoke-static {v10, v5, v6}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    const-string v5, ", byte array size: "

    .line 590
    .line 591
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    int-to-long v5, v14

    .line 595
    invoke-static {v10, v5, v6}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    const-string v5, ", memory class limited? "

    .line 603
    .line 604
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    if-le v4, v15, :cond_11

    .line 608
    .line 609
    const/4 v4, 0x1

    .line 610
    goto :goto_b

    .line 611
    :cond_11
    const/4 v4, 0x0

    .line 612
    :goto_b
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    const-string v4, ", max size: "

    .line 616
    .line 617
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    int-to-long v4, v15

    .line 621
    invoke-static {v10, v4, v5}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    const-string v4, ", memoryClass: "

    .line 629
    .line 630
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v13}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    const-string v4, ", isLowMemoryDevice: "

    .line 641
    .line 642
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v13}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 646
    .line 647
    .line 648
    move-result v4

    .line 649
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 657
    .line 658
    .line 659
    goto :goto_c

    .line 660
    :cond_12
    move-object/from16 v26, v5

    .line 661
    .line 662
    :goto_c
    new-instance v0, Lk2/b;

    .line 663
    .line 664
    const/16 v1, 0xa

    .line 665
    .line 666
    invoke-direct {v0, v1}, Lk2/b;-><init>(I)V

    .line 667
    .line 668
    .line 669
    iget v1, v7, Lc4/h;->a:I

    .line 670
    .line 671
    if-lez v1, :cond_13

    .line 672
    .line 673
    new-instance v4, Lb4/g;

    .line 674
    .line 675
    int-to-long v5, v1

    .line 676
    invoke-direct {v4, v5, v6}, Lb4/g;-><init>(J)V

    .line 677
    .line 678
    .line 679
    goto :goto_d

    .line 680
    :cond_13
    new-instance v4, Ly5/f;

    .line 681
    .line 682
    const/16 v1, 0xa

    .line 683
    .line 684
    invoke-direct {v4, v1}, Ly5/f;-><init>(I)V

    .line 685
    .line 686
    .line 687
    :goto_d
    new-instance v5, Lb4/f;

    .line 688
    .line 689
    iget v1, v7, Lc4/h;->c:I

    .line 690
    .line 691
    invoke-direct {v5, v1}, Lb4/f;-><init>(I)V

    .line 692
    .line 693
    .line 694
    new-instance v1, Lc4/f;

    .line 695
    .line 696
    iget v6, v7, Lc4/h;->b:I

    .line 697
    .line 698
    int-to-long v6, v6

    .line 699
    invoke-direct {v1, v6, v7}, Lu4/i;-><init>(J)V

    .line 700
    .line 701
    .line 702
    new-instance v6, La1/o;

    .line 703
    .line 704
    invoke-direct {v6, v3}, La1/o;-><init>(Landroid/content/Context;)V

    .line 705
    .line 706
    .line 707
    new-instance v7, La4/q;

    .line 708
    .line 709
    new-instance v10, Ld4/e;

    .line 710
    .line 711
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 712
    .line 713
    sget-wide v17, Ld4/e;->k:J

    .line 714
    .line 715
    new-instance v20, Ljava/util/concurrent/SynchronousQueue;

    .line 716
    .line 717
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 718
    .line 719
    .line 720
    new-instance v12, Ld4/c;

    .line 721
    .line 722
    new-instance v13, Ld4/b;

    .line 723
    .line 724
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 725
    .line 726
    .line 727
    const-string v15, "source-unlimited"

    .line 728
    .line 729
    move-object/from16 p0, v1

    .line 730
    .line 731
    const/4 v1, 0x0

    .line 732
    invoke-direct {v12, v13, v15, v1}, Ld4/c;-><init>(Ld4/b;Ljava/lang/String;Z)V

    .line 733
    .line 734
    .line 735
    const/4 v15, 0x0

    .line 736
    const v16, 0x7fffffff

    .line 737
    .line 738
    .line 739
    move-object/from16 v21, v12

    .line 740
    .line 741
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 742
    .line 743
    .line 744
    invoke-direct {v10, v14}, Ld4/e;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 745
    .line 746
    .line 747
    move-object/from16 v21, p0

    .line 748
    .line 749
    move-object/from16 v22, v6

    .line 750
    .line 751
    move-object/from16 v20, v7

    .line 752
    .line 753
    move-object/from16 v25, v10

    .line 754
    .line 755
    invoke-direct/range {v20 .. v26}, La4/q;-><init>(Lc4/f;La1/o;Ld4/e;Ld4/e;Ld4/e;Ld4/e;)V

    .line 756
    .line 757
    .line 758
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 759
    .line 760
    new-instance v13, La1/o;

    .line 761
    .line 762
    invoke-direct {v13, v2}, La1/o;-><init>(La4/c0;)V

    .line 763
    .line 764
    .line 765
    new-instance v6, Ln4/l;

    .line 766
    .line 767
    invoke-direct {v6}, Ln4/l;-><init>()V

    .line 768
    .line 769
    .line 770
    move-object v7, v0

    .line 771
    new-instance v0, Lcom/bumptech/glide/b;

    .line 772
    .line 773
    move-object/from16 v12, p1

    .line 774
    .line 775
    move-object v1, v3

    .line 776
    move-object/from16 v2, v20

    .line 777
    .line 778
    move-object/from16 v3, v21

    .line 779
    .line 780
    invoke-direct/range {v0 .. v13}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;La4/q;Lc4/f;Lb4/a;Lb4/f;Ln4/l;Lk2/b;Ly5/f;Lp/e;Ljava/util/List;Ljava/util/ArrayList;Lcom/bumptech/glide/c;La1/o;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 784
    .line 785
    .line 786
    sput-object v0, Lcom/bumptech/glide/b;->q:Lcom/bumptech/glide/b;

    .line 787
    .line 788
    return-void

    .line 789
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 790
    .line 791
    const-string v1, "Name must be non-null and non-empty, but given: animation"

    .line 792
    .line 793
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    throw v0

    .line 797
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 798
    .line 799
    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    .line 800
    .line 801
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    throw v0

    .line 805
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 806
    .line 807
    const-string v1, "Name must be non-null and non-empty, but given: source"

    .line 808
    .line 809
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    throw v0

    .line 813
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    new-instance v0, Ljava/lang/ClassCastException;

    .line 821
    .line 822
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 823
    .line 824
    .line 825
    throw v0
.end method

.method public static d(Landroid/widget/ImageView;)Lcom/bumptech/glide/m;
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, Lu4/m;->a:[C

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    move v1, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, v3

    .line 29
    :goto_0
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ln4/l;->c(Landroid/content/Context;)Lcom/bumptech/glide/m;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "Unable to obtain a request manager for a view without a Context"

    .line 49
    .line 50
    invoke-static {v2, v1}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Ln4/l;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v0, p0}, Ln4/l;->c(Landroid/content/Context;)Lcom/bumptech/glide/m;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_2
    instance-of v2, v1, Lh/i;

    .line 77
    .line 78
    if-eqz v2, :cond_c

    .line 79
    .line 80
    check-cast v1, Lh/i;

    .line 81
    .line 82
    iget-object v2, v0, Ln4/l;->k:Lp/e;

    .line 83
    .line 84
    invoke-virtual {v2}, Lp/k;->clear()V

    .line 85
    .line 86
    .line 87
    iget-object v5, v1, Lh/i;->B:La1/o;

    .line 88
    .line 89
    iget-object v5, v5, La1/o;->k:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v5, La1/z;

    .line 92
    .line 93
    iget-object v5, v5, La1/z;->s:La1/n0;

    .line 94
    .line 95
    iget-object v5, v5, La1/n0;->c:La1/h;

    .line 96
    .line 97
    invoke-virtual {v5}, La1/h;->k()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {v5, v2}, Ln4/l;->b(Ljava/util/List;Lp/e;)V

    .line 102
    .line 103
    .line 104
    const v5, 0x1020002

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    const/4 v6, 0x0

    .line 112
    move-object v7, v6

    .line 113
    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-nez v8, :cond_4

    .line 118
    .line 119
    invoke-virtual {v2, p0}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, La1/v;

    .line 124
    .line 125
    if-eqz v7, :cond_3

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    instance-of v8, v8, Landroid/view/View;

    .line 133
    .line 134
    if-eqz v8, :cond_4

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, Landroid/view/View;

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_4
    :goto_2
    invoke-virtual {v2}, Lp/k;->clear()V

    .line 144
    .line 145
    .line 146
    if-eqz v7, :cond_b

    .line 147
    .line 148
    invoke-virtual {v7}, La1/v;->h()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    const-string v1, "You cannot start a load on a fragment before it is attached or after it is destroyed"

    .line 153
    .line 154
    invoke-static {v1, p0}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    if-ne p0, v1, :cond_5

    .line 166
    .line 167
    move p0, v4

    .line 168
    goto :goto_3

    .line 169
    :cond_5
    move p0, v3

    .line 170
    :goto_3
    if-nez p0, :cond_6

    .line 171
    .line 172
    invoke-virtual {v7}, La1/v;->h()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {v0, p0}, Ln4/l;->c(Landroid/content/Context;)Lcom/bumptech/glide/m;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :cond_6
    iget-object p0, v7, La1/v;->B:La1/z;

    .line 186
    .line 187
    if-nez p0, :cond_7

    .line 188
    .line 189
    move-object v1, v6

    .line 190
    goto :goto_4

    .line 191
    :cond_7
    iget-object v1, p0, La1/z;->p:Lh/i;

    .line 192
    .line 193
    :goto_4
    if-eqz v1, :cond_9

    .line 194
    .line 195
    iget-object v1, v0, Ln4/l;->l:Ln4/f;

    .line 196
    .line 197
    if-nez p0, :cond_8

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_8
    iget-object v6, p0, La1/z;->p:Lh/i;

    .line 201
    .line 202
    :goto_5
    invoke-interface {v1, v6}, Ln4/f;->e(Lh/i;)V

    .line 203
    .line 204
    .line 205
    :cond_9
    invoke-virtual {v7}, La1/v;->g()La1/n0;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    invoke-virtual {v7}, La1/v;->h()Landroid/content/Context;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {p0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    iget-object v8, v0, Ln4/l;->m:La1/e;

    .line 222
    .line 223
    iget-object v11, v7, La1/v;->V:Landroidx/lifecycle/x;

    .line 224
    .line 225
    invoke-virtual {v7}, La1/v;->n()Z

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    if-eqz p0, :cond_a

    .line 230
    .line 231
    invoke-virtual {v7}, La1/v;->o()Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    if-nez p0, :cond_a

    .line 236
    .line 237
    iget-object p0, v7, La1/v;->N:Landroid/view/View;

    .line 238
    .line 239
    if-eqz p0, :cond_a

    .line 240
    .line 241
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    if-eqz p0, :cond_a

    .line 246
    .line 247
    iget-object p0, v7, La1/v;->N:Landroid/view/View;

    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    if-nez p0, :cond_a

    .line 254
    .line 255
    move v13, v4

    .line 256
    goto :goto_6

    .line 257
    :cond_a
    move v13, v3

    .line 258
    :goto_6
    invoke-virtual/range {v8 .. v13}, La1/e;->C(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/o;La1/n0;Z)Lcom/bumptech/glide/m;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0

    .line 263
    :cond_b
    invoke-virtual {v0, v1}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :cond_c
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-virtual {v0, p0}, Ln4/l;->c(Landroid/content/Context;)Lcom/bumptech/glide/m;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    .line 1
    invoke-static {}, Lu4/m;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/b;->k:Lc4/f;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lu4/i;->e(J)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/b;->j:Lb4/a;

    .line 12
    .line 13
    invoke-interface {v0}, Lb4/a;->m()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/bumptech/glide/b;->m:Lb4/f;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :try_start_0
    invoke-virtual {v0, v1}, Lb4/f;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v1
.end method

.method public final onTrimMemory(I)V
    .locals 9

    .line 1
    invoke-static {}, Lu4/m;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->p:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v4, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    check-cast v5, Lcom/bumptech/glide/m;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v1, p0, Lcom/bumptech/glide/b;->k:Lc4/f;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xf

    .line 38
    .line 39
    const/16 v2, 0x14

    .line 40
    .line 41
    const/16 v4, 0x28

    .line 42
    .line 43
    if-lt p1, v4, :cond_1

    .line 44
    .line 45
    const-wide/16 v5, 0x0

    .line 46
    .line 47
    invoke-virtual {v1, v5, v6}, Lu4/i;->e(J)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-ge p1, v2, :cond_2

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    :cond_2
    monitor-enter v1

    .line 56
    :try_start_1
    iget-wide v5, v1, Lu4/i;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 57
    .line 58
    monitor-exit v1

    .line 59
    const-wide/16 v7, 0x2

    .line 60
    .line 61
    div-long/2addr v5, v7

    .line 62
    invoke-virtual {v1, v5, v6}, Lu4/i;->e(J)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/bumptech/glide/b;->j:Lb4/a;

    .line 66
    .line 67
    invoke-interface {v1, p1}, Lb4/a;->a(I)V

    .line 68
    .line 69
    .line 70
    iget-object v5, p0, Lcom/bumptech/glide/b;->m:Lb4/f;

    .line 71
    .line 72
    monitor-enter v5

    .line 73
    if-lt p1, v4, :cond_4

    .line 74
    .line 75
    :try_start_2
    monitor-enter v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 76
    :try_start_3
    invoke-virtual {v5, v3}, Lb4/f;->b(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    .line 78
    .line 79
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 80
    goto :goto_2

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 83
    :try_start_6
    throw p1

    .line 84
    :cond_4
    if-ge p1, v2, :cond_5

    .line 85
    .line 86
    if-ne p1, v0, :cond_6

    .line 87
    .line 88
    :cond_5
    iget p1, v5, Lb4/f;->e:I

    .line 89
    .line 90
    div-int/lit8 p1, p1, 0x2

    .line 91
    .line 92
    invoke-virtual {v5, p1}, Lb4/f;->b(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 93
    .line 94
    .line 95
    :cond_6
    :goto_2
    monitor-exit v5

    .line 96
    return-void

    .line 97
    :catchall_2
    move-exception p1

    .line 98
    :try_start_7
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 99
    throw p1

    .line 100
    :catchall_3
    move-exception p1

    .line 101
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 102
    throw p1

    .line 103
    :goto_3
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 104
    throw p1
.end method
