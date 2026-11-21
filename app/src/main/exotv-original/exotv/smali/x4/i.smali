.class public final Lx4/i;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lp6/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lx4/i;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lx4/i;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lx4/i;->p:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lx4/i;->n:I

    .line 2
    .line 3
    check-cast p1, Li7/u;

    .line 4
    .line 5
    check-cast p2, Lp6/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lx4/i;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lx4/i;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lx4/i;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lx4/i;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lx4/i;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lx4/i;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 3

    .line 1
    iget p1, p0, Lx4/i;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lx4/i;

    .line 7
    .line 8
    iget-object v0, p0, Lx4/i;->p:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v2, p0, Lx4/i;->o:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lx4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lp6/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lx4/i;

    .line 18
    .line 19
    iget-object v0, p0, Lx4/i;->p:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object v2, p0, Lx4/i;->o:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lx4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lp6/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lx4/i;->n:I

    .line 2
    .line 3
    const-string v1, "HTTP "

    .line 4
    .line 5
    const-string v2, "empty body"

    .line 6
    .line 7
    iget-object v3, p0, Lx4/i;->p:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lx4/i;->o:Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Lx4/k;->c:Lokhttp3/e0;

    .line 20
    .line 21
    invoke-static {v4, v3}, Lx4/k;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/i0;->isSuccessful()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    .line 56
    .line 57
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 62
    .line 63
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v2, v1}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 77
    :catchall_1
    move-exception v1

    .line 78
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v1

    .line 82
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 83
    .line 84
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lx4/k;->c:Lokhttp3/e0;

    .line 88
    .line 89
    invoke-static {v4, v3}, Lx4/k;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :try_start_3
    invoke-virtual {p1}, Lokhttp3/i0;->isSuccessful()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    new-instance v1, Lorg/json/JSONObject;

    .line 120
    .line 121
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    :catchall_2
    move-exception v0

    .line 129
    goto :goto_0

    .line 130
    :cond_2
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    .line 131
    .line 132
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 137
    .line 138
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    new-instance v3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 158
    :goto_0
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 159
    :catchall_3
    move-exception v1

    .line 160
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    throw v1

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
