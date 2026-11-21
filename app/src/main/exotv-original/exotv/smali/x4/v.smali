.class public final Lx4/v;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lx4/v;

.field public static final b:Ljava/util/Set;

.field public static final c:Lh7/f;

.field public static final d:Lh7/f;

.field public static final e:Lh7/f;

.field public static final f:Lh7/f;

.field public static final g:Lh7/f;

.field public static final h:Lh7/f;

.field public static final i:Lh7/f;

.field public static final j:Lh7/f;

.field public static final k:Lh7/f;

.field public static final l:Lh7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lx4/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx4/v;->a:Lx4/v;

    .line 7
    .line 8
    const-string v7, "ur"

    .line 9
    .line 10
    const-string v8, "urd"

    .line 11
    .line 12
    const-string v1, "ara"

    .line 13
    .line 14
    const-string v2, "ar"

    .line 15
    .line 16
    const-string v3, "he"

    .line 17
    .line 18
    const-string v4, "heb"

    .line 19
    .line 20
    const-string v5, "fa"

    .line 21
    .line 22
    const-string v6, "per"

    .line 23
    .line 24
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lx4/v;->b:Ljava/util/Set;

    .line 33
    .line 34
    new-instance v0, Lh7/f;

    .line 35
    .line 36
    const-string v1, "(\\d{1,2}):(\\d{2}):(\\d{2})[,.](\\d{1,3})"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lx4/v;->c:Lh7/f;

    .line 42
    .line 43
    new-instance v0, Lh7/f;

    .line 44
    .line 45
    const-string v1, "<[^>]+>|\\{[^}]*\\}"

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lx4/v;->d:Lh7/f;

    .line 51
    .line 52
    new-instance v0, Lh7/f;

    .line 53
    .line 54
    const-string v1, "\n{2,}"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lx4/v;->e:Lh7/f;

    .line 60
    .line 61
    new-instance v0, Lh7/f;

    .line 62
    .line 63
    const-string v1, "^\\{(\\d+)\\}\\{(\\d+)\\}(.*)$"

    .line 64
    .line 65
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lx4/v;->f:Lh7/f;

    .line 69
    .line 70
    new-instance v0, Lh7/f;

    .line 71
    .line 72
    const-string v1, "^(\\d{1,2}):(\\d{2}):(\\d{2})[.,](\\d{1,3})\\s*,\\s*(\\d{1,2}):(\\d{2}):(\\d{2})[.,](\\d{1,3})$"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lx4/v;->g:Lh7/f;

    .line 78
    .line 79
    new-instance v0, Lh7/f;

    .line 80
    .line 81
    const-string v1, "\\{\\\\[^}]*\\}"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lx4/v;->h:Lh7/f;

    .line 87
    .line 88
    new-instance v0, Lh7/f;

    .line 89
    .line 90
    sget-object v1, Lh7/g;->k:Lh7/g;

    .line 91
    .line 92
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, "singleton(...)"

    .line 97
    .line 98
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const/4 v2, 0x0

    .line 106
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_0

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lh7/c;

    .line 117
    .line 118
    check-cast v3, Lh7/g;

    .line 119
    .line 120
    iget v3, v3, Lh7/g;->j:I

    .line 121
    .line 122
    or-int/2addr v2, v3

    .line 123
    goto :goto_0

    .line 124
    :cond_0
    invoke-static {v2}, Ly5/f;->o(I)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const-string v2, "\\{[^}]*\\\\p[1-9]\\d*[^}]*\\}.*?\\{[^}]*\\\\p0[^}]*\\}"

    .line 129
    .line 130
    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v2, "compile(...)"

    .line 135
    .line 136
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/util/regex/Pattern;)V

    .line 140
    .line 141
    .line 142
    sput-object v0, Lx4/v;->i:Lh7/f;

    .line 143
    .line 144
    new-instance v0, Lh7/f;

    .line 145
    .line 146
    const-string v1, "^(\\d+):(\\d+):(\\d+)(?:\\.(\\d+))?"

    .line 147
    .line 148
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sput-object v0, Lx4/v;->j:Lh7/f;

    .line 152
    .line 153
    new-instance v0, Lh7/f;

    .line 154
    .line 155
    const-string v1, "^(?:(\\d+):)?(\\d{1,2}):(\\d{1,2})[.,](\\d+)"

    .line 156
    .line 157
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sput-object v0, Lx4/v;->k:Lh7/f;

    .line 161
    .line 162
    new-instance v0, Lh7/f;

    .line 163
    .line 164
    const-string v1, "<[^<>]*>"

    .line 165
    .line 166
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    sput-object v0, Lx4/v;->l:Lh7/f;

    .line 170
    .line 171
    return-void
.end method

.method public static final b(Lz6/n;Ljava/lang/StringBuilder;Lz6/m;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lz6/n;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Long;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "toString(...)"

    .line 10
    .line 11
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_0

    .line 29
    .line 30
    iget-wide v1, p2, Lz6/m;->j:J

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    cmp-long v1, v1, v4

    .line 37
    .line 38
    if-lez v1, :cond_0

    .line 39
    .line 40
    new-instance v2, Lx4/s;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    iget-wide v6, p2, Lz6/m;->j:J

    .line 47
    .line 48
    invoke-direct/range {v2 .. v7}, Lx4/s;-><init>(Ljava/lang/String;JJ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    const/4 p3, 0x0

    .line 55
    iput-object p3, p0, Lz6/n;->j:Ljava/lang/Object;

    .line 56
    .line 57
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    iput-wide v0, p2, Lz6/m;->j:J

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/Long;
    .locals 9

    .line 1
    invoke-static {p0}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Lx4/v;->c:Lh7/f;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, La1/e;->A()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    check-cast v0, Lh7/e;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0}, La1/e;->A()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lh7/e;

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    invoke-virtual {v1, v2}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p0}, La1/e;->A()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lh7/e;

    .line 50
    .line 51
    const/4 v3, 0x3

    .line 52
    invoke-virtual {v2, v3}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0}, La1/e;->A()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 v4, 0x4

    .line 63
    check-cast p0, Lh7/e;

    .line 64
    .line 65
    invoke-virtual {p0, v4}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v3, p0}, Lh7/h;->F0(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v3, p0}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v5

    .line 87
    const p0, 0x36ee80

    .line 88
    .line 89
    .line 90
    int-to-long v7, p0

    .line 91
    mul-long/2addr v5, v7

    .line 92
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    const p0, 0xea60

    .line 97
    .line 98
    .line 99
    int-to-long v7, p0

    .line 100
    mul-long/2addr v0, v7

    .line 101
    add-long/2addr v0, v5

    .line 102
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    const/16 p0, 0x3e8

    .line 107
    .line 108
    int-to-long v7, p0

    .line 109
    mul-long/2addr v5, v7

    .line 110
    add-long/2addr v5, v0

    .line 111
    add-long/2addr v5, v3

    .line 112
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p0}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lx4/v;->j:Lh7/f;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v1, 0x1

    .line 31
    check-cast p0, Lh7/e;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move p0, v1

    .line 52
    :goto_0
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lh7/e;

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-virtual {v2, v3}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v2}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move v2, v1

    .line 77
    :goto_1
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const/4 v5, 0x3

    .line 82
    check-cast v4, Lh7/e;

    .line 83
    .line 84
    invoke-virtual {v4, v5}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v4}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move v4, v1

    .line 102
    :goto_2
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lh7/e;

    .line 107
    .line 108
    const/4 v5, 0x4

    .line 109
    invoke-virtual {v0, v5}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-nez v6, :cond_4

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-static {v3, v0}, Lh7/h;->F0(ILjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v3, v0}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    mul-int/lit8 v1, v0, 0xa

    .line 135
    .line 136
    :goto_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    filled-new-array {p0, v0, v2, v1}, [Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    const-string v0, "%02d:%02d:%02d,%03d"

    .line 161
    .line 162
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    invoke-static {v0, p3}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const/16 p3, 0xa

    .line 26
    .line 27
    :goto_0
    int-to-long v2, p3

    .line 28
    mul-long/2addr v0, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const/16 p3, 0x64

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    const p0, 0x36ee80

    .line 42
    .line 43
    .line 44
    int-to-long v4, p0

    .line 45
    mul-long/2addr v2, v4

    .line 46
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide p0

    .line 50
    const p3, 0xea60

    .line 51
    .line 52
    .line 53
    int-to-long v4, p3

    .line 54
    mul-long/2addr p0, v4

    .line 55
    add-long/2addr p0, v2

    .line 56
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 57
    .line 58
    .line 59
    move-result-wide p2

    .line 60
    const/16 v2, 0x3e8

    .line 61
    .line 62
    int-to-long v2, v2

    .line 63
    mul-long/2addr p2, v2

    .line 64
    add-long/2addr p2, p0

    .line 65
    add-long/2addr p2, v0

    .line 66
    return-wide p2
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "body"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "\r\n"

    .line 9
    .line 10
    const-string v2, "\n"

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/16 v1, 0xd

    .line 17
    .line 18
    const/16 v3, 0xa

    .line 19
    .line 20
    invoke-static {v0, v1, v3}, Lh7/p;->q0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x1

    .line 25
    new-array v4, v1, [C

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    aput-char v3, v4, v5

    .line 29
    .line 30
    invoke-static {v0, v4}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const-string v3, " --> "

    .line 39
    .line 40
    const-string v4, ""

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    goto/16 :goto_10

    .line 46
    .line 47
    :cond_0
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_18

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    check-cast v9, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v9}, Lh7/h;->U0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    const-string v10, "Dialogue:"

    .line 72
    .line 73
    invoke-static {v9, v10, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_1

    .line 78
    .line 79
    const-string v19, "Effect"

    .line 80
    .line 81
    const-string v20, "Text"

    .line 82
    .line 83
    const-string v11, "Layer"

    .line 84
    .line 85
    const-string v12, "Start"

    .line 86
    .line 87
    const-string v13, "End"

    .line 88
    .line 89
    const-string v14, "Style"

    .line 90
    .line 91
    const-string v15, "Name"

    .line 92
    .line 93
    const-string v16, "MarginL"

    .line 94
    .line 95
    const-string v17, "MarginR"

    .line 96
    .line 97
    const-string v18, "MarginV"

    .line 98
    .line 99
    filled-new-array/range {v11 .. v20}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    move v11, v5

    .line 112
    :cond_2
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    const/16 v13, 0x2c

    .line 117
    .line 118
    if-eqz v12, :cond_6

    .line 119
    .line 120
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    check-cast v12, Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v12}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    if-nez v11, :cond_3

    .line 135
    .line 136
    const-string v13, "[Events]"

    .line 137
    .line 138
    invoke-static {v12, v13}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-eqz v12, :cond_2

    .line 143
    .line 144
    move v11, v1

    .line 145
    goto :goto_0

    .line 146
    :cond_3
    const-string v14, "Format:"

    .line 147
    .line 148
    invoke-static {v12, v14, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    if-eqz v15, :cond_5

    .line 153
    .line 154
    invoke-static {v12, v14}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    new-array v9, v1, [C

    .line 159
    .line 160
    aput-char v13, v9, v5

    .line 161
    .line 162
    invoke-static {v0, v9}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v9, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-static {v0}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-eqz v11, :cond_4

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    check-cast v11, Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v11}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_4
    move-object v0, v9

    .line 204
    goto :goto_2

    .line 205
    :cond_5
    const-string v14, "["

    .line 206
    .line 207
    invoke-static {v12, v14, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    if-eqz v12, :cond_2

    .line 212
    .line 213
    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    move v11, v5

    .line 218
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    const/4 v14, -0x1

    .line 223
    if-eqz v12, :cond_8

    .line 224
    .line 225
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    check-cast v12, Ljava/lang/String;

    .line 230
    .line 231
    const-string v15, "Start"

    .line 232
    .line 233
    invoke-static {v12, v15}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    if-eqz v12, :cond_7

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_8
    move v11, v14

    .line 244
    :goto_4
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    if-ltz v11, :cond_9

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_9
    const/4 v9, 0x0

    .line 252
    :goto_5
    if-eqz v9, :cond_a

    .line 253
    .line 254
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    goto :goto_6

    .line 259
    :cond_a
    move v9, v1

    .line 260
    :goto_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    move v12, v5

    .line 265
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    if-eqz v15, :cond_c

    .line 270
    .line 271
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v15

    .line 275
    check-cast v15, Ljava/lang/String;

    .line 276
    .line 277
    const-string v8, "End"

    .line 278
    .line 279
    invoke-static {v15, v8}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    if-eqz v8, :cond_b

    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_c
    move v12, v14

    .line 290
    :goto_8
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    if-ltz v12, :cond_d

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_d
    const/4 v8, 0x0

    .line 298
    :goto_9
    if-eqz v8, :cond_e

    .line 299
    .line 300
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    :cond_e
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    move v8, v5

    .line 309
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    if-eqz v11, :cond_10

    .line 314
    .line 315
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    check-cast v11, Ljava/lang/String;

    .line 320
    .line 321
    const-string v12, "Text"

    .line 322
    .line 323
    invoke-static {v11, v12}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    if-eqz v11, :cond_f

    .line 328
    .line 329
    move v14, v8

    .line 330
    goto :goto_b

    .line 331
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_10
    :goto_b
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-ltz v14, :cond_11

    .line 339
    .line 340
    move-object v8, v0

    .line 341
    goto :goto_c

    .line 342
    :cond_11
    const/4 v8, 0x0

    .line 343
    :goto_c
    if-eqz v8, :cond_12

    .line 344
    .line 345
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    goto :goto_d

    .line 350
    :cond_12
    const/16 v0, 0x9

    .line 351
    .line 352
    :goto_d
    new-instance v14, Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 355
    .line 356
    .line 357
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    move v8, v5

    .line 362
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    if-eqz v11, :cond_17

    .line 367
    .line 368
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v11

    .line 372
    check-cast v11, Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v11}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 375
    .line 376
    .line 377
    move-result-object v11

    .line 378
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    invoke-static {v11, v10, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 383
    .line 384
    .line 385
    move-result v12

    .line 386
    if-eqz v12, :cond_16

    .line 387
    .line 388
    invoke-static {v11, v10}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    new-array v12, v1, [C

    .line 393
    .line 394
    aput-char v13, v12, v5

    .line 395
    .line 396
    invoke-static {v11, v12}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 401
    .line 402
    .line 403
    move-result v12

    .line 404
    if-le v12, v0, :cond_16

    .line 405
    .line 406
    invoke-static {v9, v11}, Lm6/h;->C0(ILjava/util/List;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v12

    .line 410
    check-cast v12, Ljava/lang/String;

    .line 411
    .line 412
    if-nez v12, :cond_13

    .line 413
    .line 414
    goto/16 :goto_f

    .line 415
    .line 416
    :cond_13
    invoke-static {v7, v11}, Lm6/h;->C0(ILjava/util/List;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v15

    .line 420
    check-cast v15, Ljava/lang/String;

    .line 421
    .line 422
    if-nez v15, :cond_14

    .line 423
    .line 424
    goto :goto_f

    .line 425
    :cond_14
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 426
    .line 427
    .line 428
    move-result v13

    .line 429
    invoke-interface {v11, v0, v13}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v17

    .line 433
    const/16 v21, 0x0

    .line 434
    .line 435
    const/16 v22, 0x3e

    .line 436
    .line 437
    const-string v18, ","

    .line 438
    .line 439
    const/16 v19, 0x0

    .line 440
    .line 441
    const/16 v20, 0x0

    .line 442
    .line 443
    invoke-static/range {v17 .. v22}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v11

    .line 447
    const-string v13, "\\N"

    .line 448
    .line 449
    invoke-static {v11, v13, v2}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v11

    .line 453
    const-string v13, "\\n"

    .line 454
    .line 455
    invoke-static {v11, v13, v2}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v11

    .line 459
    const-string v13, "\\h"

    .line 460
    .line 461
    const-string v1, " "

    .line 462
    .line 463
    invoke-static {v11, v13, v1}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    sget-object v11, Lx4/v;->i:Lh7/f;

    .line 468
    .line 469
    invoke-virtual {v11, v1}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    sget-object v11, Lx4/v;->h:Lh7/f;

    .line 474
    .line 475
    invoke-virtual {v11, v1}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-static {v1}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 488
    .line 489
    .line 490
    move-result v11

    .line 491
    if-nez v11, :cond_15

    .line 492
    .line 493
    goto :goto_f

    .line 494
    :cond_15
    add-int/lit8 v8, v8, 0x1

    .line 495
    .line 496
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v11

    .line 500
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    invoke-static {v12}, Lx4/v;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v11

    .line 507
    invoke-static {v15}, Lx4/v;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v12

    .line 511
    new-instance v13, Ljava/lang/StringBuilder;

    .line 512
    .line 513
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v11

    .line 529
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    :cond_16
    :goto_f
    const/4 v1, 0x1

    .line 539
    const/16 v13, 0x2c

    .line 540
    .line 541
    goto/16 :goto_e

    .line 542
    .line 543
    :cond_17
    const/16 v18, 0x0

    .line 544
    .line 545
    const/16 v19, 0x3e

    .line 546
    .line 547
    const-string v15, "\n"

    .line 548
    .line 549
    const/16 v16, 0x0

    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    invoke-static/range {v14 .. v19}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    return-object v0

    .line 558
    :cond_18
    :goto_10
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    :cond_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_1a

    .line 567
    .line 568
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    move-object v2, v1

    .line 573
    check-cast v2, Ljava/lang/String;

    .line 574
    .line 575
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-nez v2, :cond_19

    .line 580
    .line 581
    move-object v8, v1

    .line 582
    goto :goto_11

    .line 583
    :cond_1a
    const/4 v8, 0x0

    .line 584
    :goto_11
    check-cast v8, Ljava/lang/String;

    .line 585
    .line 586
    if-eqz v8, :cond_1f

    .line 587
    .line 588
    invoke-static {v8}, Lh7/h;->U0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    if-eqz v0, :cond_1f

    .line 597
    .line 598
    const-string v1, "WEBVTT"

    .line 599
    .line 600
    invoke-static {v0, v1, v5}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    const/4 v1, 0x1

    .line 605
    if-ne v0, v1, :cond_1f

    .line 606
    .line 607
    new-instance v8, Ljava/util/ArrayList;

    .line 608
    .line 609
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 610
    .line 611
    .line 612
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    move v1, v5

    .line 617
    move v2, v1

    .line 618
    :goto_12
    if-ge v1, v0, :cond_1e

    .line 619
    .line 620
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v9

    .line 624
    check-cast v9, Ljava/lang/String;

    .line 625
    .line 626
    invoke-static {v9}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 627
    .line 628
    .line 629
    move-result-object v9

    .line 630
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v9

    .line 634
    const-string v10, "-->"

    .line 635
    .line 636
    invoke-static {v9, v10, v5}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 637
    .line 638
    .line 639
    move-result v11

    .line 640
    if-eqz v11, :cond_1d

    .line 641
    .line 642
    filled-new-array {v10}, [Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v10

    .line 646
    invoke-static {v9, v10}, Lh7/h;->K0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 647
    .line 648
    .line 649
    move-result-object v9

    .line 650
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 651
    .line 652
    .line 653
    move-result v10

    .line 654
    if-lt v10, v7, :cond_1d

    .line 655
    .line 656
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v10

    .line 660
    check-cast v10, Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v10}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 663
    .line 664
    .line 665
    move-result-object v10

    .line 666
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v10

    .line 670
    invoke-static {v10}, Lx4/v;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v10

    .line 674
    const/4 v11, 0x1

    .line 675
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v9

    .line 679
    check-cast v9, Ljava/lang/String;

    .line 680
    .line 681
    invoke-static {v9}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 682
    .line 683
    .line 684
    move-result-object v9

    .line 685
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v9

    .line 689
    const/16 v12, 0x20

    .line 690
    .line 691
    invoke-static {v9, v12, v9}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v9

    .line 695
    invoke-static {v9}, Lx4/v;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v9

    .line 699
    new-instance v12, Ljava/util/ArrayList;

    .line 700
    .line 701
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 702
    .line 703
    .line 704
    add-int/lit8 v13, v1, 0x1

    .line 705
    .line 706
    :goto_13
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 707
    .line 708
    .line 709
    move-result v14

    .line 710
    if-ge v13, v14, :cond_1b

    .line 711
    .line 712
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v14

    .line 716
    check-cast v14, Ljava/lang/String;

    .line 717
    .line 718
    invoke-static {v14}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 719
    .line 720
    .line 721
    move-result-object v14

    .line 722
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v14

    .line 726
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 727
    .line 728
    .line 729
    move-result v14

    .line 730
    if-lez v14, :cond_1b

    .line 731
    .line 732
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v14

    .line 736
    check-cast v14, Ljava/lang/String;

    .line 737
    .line 738
    invoke-static {v14}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 739
    .line 740
    .line 741
    move-result-object v14

    .line 742
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v14

    .line 746
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    add-int/lit8 v13, v13, 0x1

    .line 750
    .line 751
    goto :goto_13

    .line 752
    :cond_1b
    new-instance v13, Lg7/l;

    .line 753
    .line 754
    const/4 v14, 0x5

    .line 755
    invoke-direct {v13, v14}, Lg7/l;-><init>(I)V

    .line 756
    .line 757
    .line 758
    const/16 v17, 0x1e

    .line 759
    .line 760
    move-object/from16 v16, v13

    .line 761
    .line 762
    const-string v13, "\n"

    .line 763
    .line 764
    const/4 v14, 0x0

    .line 765
    const/4 v15, 0x0

    .line 766
    invoke-static/range {v12 .. v17}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v12

    .line 770
    invoke-static {v12}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 771
    .line 772
    .line 773
    move-result-object v12

    .line 774
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v12

    .line 778
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 779
    .line 780
    .line 781
    move-result v13

    .line 782
    if-nez v13, :cond_1c

    .line 783
    .line 784
    goto :goto_14

    .line 785
    :cond_1c
    add-int/lit8 v2, v2, 0x1

    .line 786
    .line 787
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v13

    .line 791
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    new-instance v13, Ljava/lang/StringBuilder;

    .line 795
    .line 796
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v9

    .line 812
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    goto :goto_14

    .line 822
    :cond_1d
    const/4 v11, 0x1

    .line 823
    :goto_14
    add-int/lit8 v1, v1, 0x1

    .line 824
    .line 825
    goto/16 :goto_12

    .line 826
    .line 827
    :cond_1e
    const/4 v12, 0x0

    .line 828
    const/16 v13, 0x3e

    .line 829
    .line 830
    const-string v9, "\n"

    .line 831
    .line 832
    const/4 v10, 0x0

    .line 833
    const/4 v11, 0x0

    .line 834
    invoke-static/range {v8 .. v13}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    return-object v0

    .line 839
    :cond_1f
    new-instance v10, Lg7/l;

    .line 840
    .line 841
    const/4 v0, 0x4

    .line 842
    invoke-direct {v10, v0}, Lg7/l;-><init>(I)V

    .line 843
    .line 844
    .line 845
    const/16 v11, 0x1e

    .line 846
    .line 847
    const-string v7, "\n"

    .line 848
    .line 849
    const/4 v8, 0x0

    .line 850
    const/4 v9, 0x0

    .line 851
    invoke-static/range {v6 .. v11}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    return-object v0
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lx4/v;->k:Lh7/f;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v1, 0x1

    .line 15
    check-cast p0, Lh7/e;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move p0, v1

    .line 36
    :goto_0
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lh7/e;

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    invoke-virtual {v2, v3}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v2, v1

    .line 61
    :goto_1
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lh7/e;

    .line 66
    .line 67
    const/4 v4, 0x3

    .line 68
    invoke-virtual {v3, v4}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v3}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move v3, v1

    .line 86
    :goto_2
    invoke-virtual {v0}, La1/e;->A()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lh7/e;

    .line 91
    .line 92
    const/4 v5, 0x4

    .line 93
    invoke-virtual {v0, v5}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v4, v0}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v4, v0}, Lh7/h;->F0(ILjava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    :cond_4
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    filled-new-array {p0, v0, v2, v1}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    const-string v0, "%02d:%02d:%02d,%03d"

    .line 142
    .line 143
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lx4/d;Lr6/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lx4/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lx4/u;

    .line 7
    .line 8
    iget v1, v0, Lx4/u;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lx4/u;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx4/u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lx4/u;-><init>(Lx4/v;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lx4/u;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lx4/u;->o:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    if-ne p2, v4, :cond_3

    .line 60
    .line 61
    const-string p2, "tv"

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    new-instance p1, La1/u;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_4
    const-string p2, "movie"

    .line 71
    .line 72
    :goto_1
    sget-object p3, Lx4/k;->a:Lx4/k;

    .line 73
    .line 74
    new-instance p3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, "https://api.themoviedb.org/3/"

    .line 77
    .line 78
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p2, "/"

    .line 85
    .line 86
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p1, "/external_ids"

    .line 93
    .line 94
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string p2, "url"

    .line 102
    .line 103
    invoke-static {p2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const/16 p2, 0x3f

    .line 107
    .line 108
    invoke-static {p1, p2}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_5

    .line 113
    .line 114
    const-string p2, "&"

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    const-string p2, "?"

    .line 118
    .line 119
    :goto_2
    sget-object p3, Lb5/h;->a:Lb5/i;

    .line 120
    .line 121
    if-eqz p3, :cond_6

    .line 122
    .line 123
    iget-object p3, p3, Lb5/i;->r:Ljava/lang/String;

    .line 124
    .line 125
    if-nez p3, :cond_7

    .line 126
    .line 127
    :cond_6
    const-string p3, "4e44d9029b1270a757cddc766a1bcb63"

    .line 128
    .line 129
    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p1, "api_key="

    .line 141
    .line 142
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iput v4, v0, Lx4/u;->o:I

    .line 153
    .line 154
    invoke-static {p1, v3, v0}, Lx4/k;->e(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    if-ne p3, v1, :cond_8

    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_8
    :goto_3
    check-cast p3, Lorg/json/JSONObject;

    .line 162
    .line 163
    const-string p1, "imdb_id"

    .line 164
    .line 165
    invoke-virtual {p3, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    if-lez p2, :cond_9

    .line 177
    .line 178
    const-string p2, "null"

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-nez p2, :cond_9

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_9
    move-object p1, v3

    .line 188
    :goto_4
    if-eqz p1, :cond_a

    .line 189
    .line 190
    const-string p2, "tt"

    .line 191
    .line 192
    invoke-static {p1, p2}, Lh7/h;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    return-object p1

    .line 197
    :cond_a
    return-object v3
.end method
