.class public final synthetic Lw4/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/c;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/c;->k:Lcom/exotv/net/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget p1, p0, Lw4/c;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lw4/c;->k:Lcom/exotv/net/MainActivity;

    .line 7
    .line 8
    iget-object v0, p1, Lcom/exotv/net/MainActivity;->Y:Lb5/i;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v2, v0, Lb5/i;->d:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v2, v1

    .line 25
    :goto_0
    if-nez v2, :cond_2

    .line 26
    .line 27
    :cond_1
    iget-object v2, v0, Lb5/i;->e:Ljava/lang/String;

    .line 28
    .line 29
    :cond_2
    move-object v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_3
    move-object v5, v1

    .line 32
    :goto_1
    iget-object v0, p1, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 33
    .line 34
    if-eqz v0, :cond_7

    .line 35
    .line 36
    iget-object v0, v0, La5/a;->n:Landroid/widget/TextView;

    .line 37
    .line 38
    const/16 v2, 0x8

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    if-nez v5, :cond_4

    .line 44
    .line 45
    const v0, 0x7f1100ff

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "getString(...)"

    .line 53
    .line 54
    invoke-static {v1, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/exotv/net/MainActivity;->V(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/4 v0, 0x1

    .line 62
    invoke-virtual {p1, v0}, Lcom/exotv/net/MainActivity;->R(Z)V

    .line 63
    .line 64
    .line 65
    iget-object v4, p1, Lcom/exotv/net/MainActivity;->R:Lw4/b;

    .line 66
    .line 67
    if-eqz v4, :cond_6

    .line 68
    .line 69
    new-instance v7, Lw4/e;

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    invoke-direct {v7, p1, v0}, Lw4/e;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 73
    .line 74
    .line 75
    new-instance v6, Lh7/q;

    .line 76
    .line 77
    invoke-direct {v6, v0, p1}, Lh7/q;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v5}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    new-instance p1, Ljava/io/IOException;

    .line 87
    .line 88
    const-string v0, "No APK url provided"

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Ll6/f;

    .line 98
    .line 99
    invoke-direct {v0, p1}, Ll6/f;-><init>(Ljava/io/Serializable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7, v0}, Lw4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    iget-object p1, v4, Lw4/b;->b:Ljava/util/concurrent/ExecutorService;

    .line 107
    .line 108
    new-instance v3, Landroidx/media3/exoplayer/audio/j;

    .line 109
    .line 110
    const/4 v8, 0x1

    .line 111
    invoke-direct/range {v3 .. v8}, Landroidx/media3/exoplayer/audio/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    return-void

    .line 118
    :cond_6
    const-string p1, "installer"

    .line 119
    .line 120
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v1

    .line 124
    :cond_7
    const-string p1, "b"

    .line 125
    .line 126
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1

    .line 130
    :pswitch_0
    iget-object p1, p0, Lw4/c;->k:Lcom/exotv/net/MainActivity;

    .line 131
    .line 132
    iget-object v0, p1, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-virtual {p1, v1, v2, v1, v0}, Lcom/exotv/net/MainActivity;->T(ZLjava/lang/String;ZLw4/q;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p1, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_b

    .line 146
    .line 147
    const/4 v3, 0x3

    .line 148
    if-eq v0, v3, :cond_9

    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/exotv/net/MainActivity;->B()Lx4/m;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-nez v0, :cond_8

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    iget-object v3, p1, Lcom/exotv/net/MainActivity;->c0:Ljava/util/HashMap;

    .line 158
    .line 159
    invoke-static {v3, v0}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Lw4/l;

    .line 164
    .line 165
    iput-boolean v1, v3, Lw4/l;->c:Z

    .line 166
    .line 167
    iput-object v2, v3, Lw4/l;->e:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Lcom/exotv/net/MainActivity;->K(Lx4/m;)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_9
    iget-object p1, p1, Lcom/exotv/net/MainActivity;->M:Lc5/a1;

    .line 174
    .line 175
    if-eqz p1, :cond_c

    .line 176
    .line 177
    iget-object p1, p1, Lc5/a1;->g:Landroid/widget/EditText;

    .line 178
    .line 179
    if-eqz p1, :cond_a

    .line 180
    .line 181
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_a
    const-string p1, "input"

    .line 186
    .line 187
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v2

    .line 191
    :cond_b
    const/4 v0, 0x1

    .line 192
    invoke-static {p1, v0}, Lcom/exotv/net/MainActivity;->L(Lcom/exotv/net/MainActivity;I)V

    .line 193
    .line 194
    .line 195
    :cond_c
    :goto_3
    return-void

    .line 196
    :pswitch_1
    iget-object p1, p0, Lw4/c;->k:Lcom/exotv/net/MainActivity;

    .line 197
    .line 198
    iget-object v0, p1, Lcom/exotv/net/MainActivity;->Y:Lb5/i;

    .line 199
    .line 200
    const/4 v1, 0x1

    .line 201
    if-eqz v0, :cond_d

    .line 202
    .line 203
    iget-boolean v0, v0, Lb5/i;->b:Z

    .line 204
    .line 205
    if-ne v0, v1, :cond_d

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_d
    const/4 v0, 0x0

    .line 209
    iput-object v0, p1, Lcom/exotv/net/MainActivity;->Y:Lb5/i;

    .line 210
    .line 211
    invoke-virtual {p1}, Lcom/exotv/net/MainActivity;->G()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v1}, Lcom/exotv/net/MainActivity;->P(Z)V

    .line 215
    .line 216
    .line 217
    const/4 v0, 0x6

    .line 218
    invoke-static {p1, v0}, Lcom/exotv/net/MainActivity;->L(Lcom/exotv/net/MainActivity;I)V

    .line 219
    .line 220
    .line 221
    :goto_4
    return-void

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
