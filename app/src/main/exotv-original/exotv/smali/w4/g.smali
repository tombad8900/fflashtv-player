.class public final synthetic Lw4/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/g;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/g;->k:Lcom/exotv/net/MainActivity;

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
    .locals 8

    .line 1
    iget v0, p0, Lw4/g;->j:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "nav"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lw4/g;->k:Lcom/exotv/net/MainActivity;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lc5/y;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v3

    .line 29
    :pswitch_0
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lc5/y;->b()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v3

    .line 46
    :pswitch_1
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/exotv/net/MainActivity;->A()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :pswitch_2
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 58
    .line 59
    sget-object v2, Lw4/q;->j:Lw4/q;

    .line 60
    .line 61
    if-eq v0, v2, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->T:Lc5/t;

    .line 65
    .line 66
    if-eqz v0, :cond_8

    .line 67
    .line 68
    iget-object v2, v4, Lcom/exotv/net/MainActivity;->Z:Lcom/exotv/net/model/Channel;

    .line 69
    .line 70
    const/4 v5, -0x1

    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/exotv/net/model/Channel;->getSelectionKey()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    iget-object v0, v0, Lc5/t;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move v6, v1

    .line 89
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_5

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, Lcom/exotv/net/model/Channel;

    .line 100
    .line 101
    invoke-virtual {v7}, Lcom/exotv/net/model/Channel;->getSelectionKey()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-static {v7, v2}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_4

    .line 110
    .line 111
    move v5, v6

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    :goto_1
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 117
    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    iget-object v0, v0, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 121
    .line 122
    if-ltz v5, :cond_6

    .line 123
    .line 124
    move v1, v5

    .line 125
    :cond_6
    invoke-static {v0, v1}, Lcom/exotv/net/MainActivity;->z(Landroidx/recyclerview/widget/RecyclerView;I)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :cond_7
    const-string v0, "b"

    .line 135
    .line 136
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v3

    .line 140
    :cond_8
    const-string v0, "channelAdapter"

    .line 141
    .line 142
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v3

    .line 146
    :pswitch_3
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 147
    .line 148
    sget-object v5, Lw4/q;->j:Lw4/q;

    .line 149
    .line 150
    if-eq v0, v5, :cond_9

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_9
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 154
    .line 155
    if-eqz v0, :cond_a

    .line 156
    .line 157
    invoke-virtual {v0}, Lc5/y;->a()V

    .line 158
    .line 159
    .line 160
    const/4 v1, 0x1

    .line 161
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    return-object v0

    .line 166
    :cond_a
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v3

    .line 170
    :pswitch_4
    iget-object v0, v4, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 171
    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    invoke-virtual {v0}, Lc5/y;->b()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :cond_b
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v3

    .line 187
    :pswitch_5
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 188
    .line 189
    invoke-virtual {v4}, Lcom/exotv/net/MainActivity;->A()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
