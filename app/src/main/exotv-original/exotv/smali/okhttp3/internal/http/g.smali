.class public abstract Lokhttp3/internal/http/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field private static final QUOTED_STRING_DELIMITERS:Lv7/m;

.field private static final TOKEN_DELIMITERS:Lv7/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lv7/m;->m:Lv7/m;

    .line 2
    .line 3
    const-string v0, "\"\\"

    .line 4
    .line 5
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lokhttp3/internal/http/g;->QUOTED_STRING_DELIMITERS:Lv7/m;

    .line 10
    .line 11
    const-string v0, "\t ,="

    .line 12
    .line 13
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lokhttp3/internal/http/g;->TOKEN_DELIMITERS:Lv7/m;

    .line 18
    .line 19
    return-void
.end method

.method public static final hasBody(Lokhttp3/i0;)Z
    .locals 1

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lokhttp3/internal/http/g;->promisesBody(Lokhttp3/i0;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static final parseChallenges(Lokhttp3/y;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/y;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lokhttp3/j;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headerName"

    .line 7
    .line 8
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lokhttp3/y;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lokhttp3/y;->name(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    new-instance v3, Lv7/j;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v3, v4}, Lv7/j;->Q(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-static {v3, v0}, Lokhttp3/internal/http/g;->readChallengeHeader(Lv7/j;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception v3

    .line 50
    sget-object v4, Ls7/h;->Companion:Ls7/h$a;

    .line 51
    .line 52
    invoke-virtual {v4}, Ls7/h$a;->get()Ls7/h;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v5, "Unable to parse challenge"

    .line 57
    .line 58
    const/4 v6, 0x5

    .line 59
    invoke-virtual {v4, v5, v6, v3}, Ls7/h;->log(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-object v0
.end method

.method public static final promisesBody(Lokhttp3/i0;)Z
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lokhttp3/i0;->request()Lokhttp3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lokhttp3/g0;->method()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "HEAD"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lokhttp3/i0;->code()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/16 v2, 0x64

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    if-lt v0, v2, :cond_1

    .line 32
    .line 33
    const/16 v2, 0xc8

    .line 34
    .line 35
    if-lt v0, v2, :cond_2

    .line 36
    .line 37
    :cond_1
    const/16 v2, 0xcc

    .line 38
    .line 39
    if-eq v0, v2, :cond_2

    .line 40
    .line 41
    const/16 v2, 0x130

    .line 42
    .line 43
    if-eq v0, v2, :cond_2

    .line 44
    .line 45
    return v3

    .line 46
    :cond_2
    invoke-static {p0}, Lq7/c;->headersContentLength(Lokhttp3/i0;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    const-wide/16 v6, -0x1

    .line 51
    .line 52
    cmp-long v0, v4, v6

    .line 53
    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    const-string v0, "Transfer-Encoding"

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-static {p0, v0, v4, v2, v4}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v0, "chunked"

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return v1

    .line 74
    :cond_4
    :goto_0
    return v3
.end method

.method private static final readChallengeHeader(Lv7/j;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/j;",
            "Ljava/util/List<",
            "Lokhttp3/j;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    move-object v1, v0

    .line 3
    :goto_1
    if-nez v1, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lokhttp3/internal/http/g;->skipCommasAndWhitespace(Lv7/j;)Z

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lokhttp3/internal/http/g;->readToken(Lv7/j;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    invoke-static {p0}, Lokhttp3/internal/http/g;->skipCommasAndWhitespace(Lv7/j;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {p0}, Lokhttp3/internal/http/g;->readToken(Lv7/j;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Lv7/j;->j()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    new-instance p0, Lokhttp3/j;

    .line 35
    .line 36
    sget-object v0, Lm6/q;->j:Lm6/q;

    .line 37
    .line 38
    invoke-direct {p0, v1, v0}, Lokhttp3/j;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const/16 v4, 0x3d

    .line 46
    .line 47
    invoke-static {p0, v4}, Lq7/c;->skipAll(Lv7/j;B)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-static {p0}, Lokhttp3/internal/http/g;->skipCommasAndWhitespace(Lv7/j;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Lv7/j;->j()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    :cond_3
    new-instance v2, Lokhttp3/j;

    .line 66
    .line 67
    invoke-static {v5}, Lh7/p;->p0(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v0, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v4, "singletonMap<String, Str\u2026ek + \"=\".repeat(eqCount))"

    .line 80
    .line 81
    invoke-static {v4, v3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v1, v3}, Lokhttp3/j;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v4}, Lq7/c;->skipAll(Lv7/j;B)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    add-int/2addr v6, v5

    .line 101
    :goto_2
    if-nez v3, :cond_5

    .line 102
    .line 103
    invoke-static {p0}, Lokhttp3/internal/http/g;->readToken(Lv7/j;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {p0}, Lokhttp3/internal/http/g;->skipCommasAndWhitespace(Lv7/j;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_c

    .line 112
    .line 113
    invoke-static {p0, v4}, Lq7/c;->skipAll(Lv7/j;B)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    move v6, v5

    .line 118
    :cond_5
    if-eqz v6, :cond_c

    .line 119
    .line 120
    const/4 v5, 0x1

    .line 121
    if-le v6, v5, :cond_6

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    invoke-static {p0}, Lokhttp3/internal/http/g;->skipCommasAndWhitespace(Lv7/j;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_7

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    const/16 v5, 0x22

    .line 132
    .line 133
    invoke-static {p0, v5}, Lokhttp3/internal/http/g;->startsWith(Lv7/j;B)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_8

    .line 138
    .line 139
    invoke-static {p0}, Lokhttp3/internal/http/g;->readQuotedString(Lv7/j;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    goto :goto_3

    .line 144
    :cond_8
    invoke-static {p0}, Lokhttp3/internal/http/g;->readToken(Lv7/j;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    :goto_3
    if-nez v5, :cond_9

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Ljava/lang/String;

    .line 156
    .line 157
    if-eqz v3, :cond_a

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_a
    invoke-static {p0}, Lokhttp3/internal/http/g;->skipCommasAndWhitespace(Lv7/j;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-nez v3, :cond_b

    .line 165
    .line 166
    invoke-virtual {p0}, Lv7/j;->j()Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-nez v3, :cond_b

    .line 171
    .line 172
    :goto_4
    return-void

    .line 173
    :cond_b
    move-object v3, v0

    .line 174
    goto :goto_2

    .line 175
    :cond_c
    new-instance v4, Lokhttp3/j;

    .line 176
    .line 177
    invoke-direct {v4, v1, v2}, Lokhttp3/j;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-object v1, v3

    .line 184
    goto/16 :goto_1
.end method

.method private static final readQuotedString(Lv7/j;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lv7/j;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x22

    .line 6
    .line 7
    if-ne v0, v1, :cond_3

    .line 8
    .line 9
    new-instance v0, Lv7/j;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    :goto_0
    sget-object v2, Lokhttp3/internal/http/g;->QUOTED_STRING_DELIMITERS:Lv7/m;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lv7/j;->p(Lv7/m;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    const-wide/16 v4, -0x1

    .line 21
    .line 22
    cmp-long v4, v2, v4

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    return-object v5

    .line 28
    :cond_0
    invoke-virtual {p0, v2, v3}, Lv7/j;->g(J)B

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-ne v4, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, p0, v2, v3}, Lv7/j;->write(Lv7/j;J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lv7/j;->readByte()B

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lv7/j;->G()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    iget-wide v6, p0, Lv7/j;->k:J

    .line 46
    .line 47
    const-wide/16 v8, 0x1

    .line 48
    .line 49
    add-long v10, v2, v8

    .line 50
    .line 51
    cmp-long v4, v6, v10

    .line 52
    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_2
    invoke-virtual {v0, p0, v2, v3}, Lv7/j;->write(Lv7/j;J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lv7/j;->readByte()B

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p0, v8, v9}, Lv7/j;->write(Lv7/j;J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    const-string v0, "Failed requirement."

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
.end method

.method private static final readToken(Lv7/j;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lokhttp3/internal/http/g;->TOKEN_DELIMITERS:Lv7/m;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lv7/j;->p(Lv7/m;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lv7/j;->k:J

    .line 14
    .line 15
    :cond_0
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    sget-object v2, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lv7/j;->F(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static final receiveHeaders(Lokhttp3/q;Lokhttp3/z;Lokhttp3/y;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headers"

    .line 12
    .line 13
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lokhttp3/q;->NO_COOKIES:Lokhttp3/q;

    .line 17
    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, Lokhttp3/o;->Companion:Lokhttp3/o$a;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Lokhttp3/o$a;->parseAll(Lokhttp3/z;Lokhttp3/y;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :cond_1
    invoke-interface {p0, p1, p2}, Lokhttp3/q;->saveFromResponse(Lokhttp3/z;Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private static final skipCommasAndWhitespace(Lv7/j;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Lv7/j;->j()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Lv7/j;->g(J)B

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x2c

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lv7/j;->readByte()B

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v2, 0x20

    .line 24
    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v2, 0x9

    .line 29
    .line 30
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lv7/j;->readByte()B

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v0
.end method

.method private static final startsWith(Lv7/j;B)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv7/j;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lv7/j;->g(J)B

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method
