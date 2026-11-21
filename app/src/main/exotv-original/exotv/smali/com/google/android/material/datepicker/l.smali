.class public final Lcom/google/android/material/datepicker/l;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/l;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/datepicker/l;->k:Ljava/lang/Object;

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
    iget v0, p0, Lcom/google/android/material/datepicker/l;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/ui/TrackSelectionView;

    .line 9
    .line 10
    iget-object v1, v0, Landroidx/media3/ui/TrackSelectionView;->p:Ljava/util/HashMap;

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/media3/ui/TrackSelectionView;->l:Landroid/widget/CheckedTextView;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-ne p1, v2, :cond_0

    .line 16
    .line 17
    iput-boolean v3, v0, Landroidx/media3/ui/TrackSelectionView;->u:Z

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, Landroidx/media3/ui/TrackSelectionView;->m:Landroid/widget/CheckedTextView;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-ne p1, v2, :cond_1

    .line 28
    .line 29
    iput-boolean v4, v0, Landroidx/media3/ui/TrackSelectionView;->u:Z

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    iput-boolean v4, v0, Landroidx/media3/ui/TrackSelectionView;->u:Z

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast v2, Lw2/i0;

    .line 46
    .line 47
    iget-object v5, v2, Lw2/i0;->a:Landroidx/media3/common/w1;

    .line 48
    .line 49
    iget-object v6, v5, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 50
    .line 51
    iget v2, v2, Lw2/i0;->b:I

    .line 52
    .line 53
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Landroidx/media3/common/r1;

    .line 58
    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    iget-boolean p1, v0, Landroidx/media3/ui/TrackSelectionView;->r:Z

    .line 62
    .line 63
    if-nez p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-lez p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 72
    .line 73
    .line 74
    :cond_2
    new-instance p1, Landroidx/media3/common/r1;

    .line 75
    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-direct {p1, v6, v2}, Landroidx/media3/common/r1;-><init>(Landroidx/media3/common/q1;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :cond_3
    new-instance v8, Ljava/util/ArrayList;

    .line 93
    .line 94
    iget-object v7, v7, Landroidx/media3/common/r1;->b:Lf6/m0;

    .line 95
    .line 96
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 97
    .line 98
    .line 99
    check-cast p1, Landroid/widget/CheckedTextView;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->isChecked()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iget-boolean v7, v0, Landroidx/media3/ui/TrackSelectionView;->q:Z

    .line 106
    .line 107
    if-eqz v7, :cond_4

    .line 108
    .line 109
    iget-boolean v5, v5, Landroidx/media3/common/w1;->c:Z

    .line 110
    .line 111
    if-eqz v5, :cond_4

    .line 112
    .line 113
    move v5, v3

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    move v5, v4

    .line 116
    :goto_0
    if-nez v5, :cond_6

    .line 117
    .line 118
    iget-boolean v7, v0, Landroidx/media3/ui/TrackSelectionView;->r:Z

    .line 119
    .line 120
    if-eqz v7, :cond_5

    .line 121
    .line 122
    iget-object v7, v0, Landroidx/media3/ui/TrackSelectionView;->o:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-le v7, v3, :cond_5

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    move v3, v4

    .line 132
    :cond_6
    :goto_1
    if-eqz p1, :cond_8

    .line 133
    .line 134
    if-eqz v3, :cond_8

    .line 135
    .line 136
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    new-instance p1, Landroidx/media3/common/r1;

    .line 154
    .line 155
    invoke-direct {p1, v6, v8}, Landroidx/media3/common/r1;-><init>(Landroidx/media3/common/q1;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_8
    if-nez p1, :cond_a

    .line 163
    .line 164
    if-eqz v5, :cond_9

    .line 165
    .line 166
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    new-instance p1, Landroidx/media3/common/r1;

    .line 174
    .line 175
    invoke-direct {p1, v6, v8}, Landroidx/media3/common/r1;-><init>(Landroidx/media3/common/q1;Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_9
    new-instance p1, Landroidx/media3/common/r1;

    .line 183
    .line 184
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {v2}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-direct {p1, v6, v2}, Landroidx/media3/common/r1;-><init>(Landroidx/media3/common/q1;Ljava/util/List;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :cond_a
    :goto_2
    invoke-virtual {v0}, Landroidx/media3/ui/TrackSelectionView;->a()V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->k:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 205
    .line 206
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->U:Lm/g2;

    .line 207
    .line 208
    if-nez p1, :cond_b

    .line 209
    .line 210
    const/4 p1, 0x0

    .line 211
    goto :goto_3

    .line 212
    :cond_b
    iget-object p1, p1, Lm/g2;->k:Ll/p;

    .line 213
    .line 214
    :goto_3
    if-eqz p1, :cond_c

    .line 215
    .line 216
    invoke-virtual {p1}, Ll/p;->collapseActionView()Z

    .line 217
    .line 218
    .line 219
    :cond_c
    return-void

    .line 220
    :pswitch_1
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->k:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p1, Lk/a;

    .line 223
    .line 224
    invoke-virtual {p1}, Lk/a;->a()V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->k:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Lh/e;

    .line 231
    .line 232
    iget-object v1, v0, Lh/e;->h:Landroid/widget/Button;

    .line 233
    .line 234
    if-ne p1, v1, :cond_d

    .line 235
    .line 236
    iget-object v1, v0, Lh/e;->j:Landroid/os/Message;

    .line 237
    .line 238
    if-eqz v1, :cond_d

    .line 239
    .line 240
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    goto :goto_4

    .line 245
    :cond_d
    iget-object v1, v0, Lh/e;->k:Landroid/widget/Button;

    .line 246
    .line 247
    if-ne p1, v1, :cond_e

    .line 248
    .line 249
    iget-object v1, v0, Lh/e;->m:Landroid/os/Message;

    .line 250
    .line 251
    if-eqz v1, :cond_e

    .line 252
    .line 253
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    goto :goto_4

    .line 258
    :cond_e
    iget-object v1, v0, Lh/e;->n:Landroid/widget/Button;

    .line 259
    .line 260
    if-ne p1, v1, :cond_f

    .line 261
    .line 262
    iget-object p1, v0, Lh/e;->p:Landroid/os/Message;

    .line 263
    .line 264
    if-eqz p1, :cond_f

    .line 265
    .line 266
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    goto :goto_4

    .line 271
    :cond_f
    const/4 p1, 0x0

    .line 272
    :goto_4
    if-eqz p1, :cond_10

    .line 273
    .line 274
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 275
    .line 276
    .line 277
    :cond_10
    iget-object p1, v0, Lh/e;->D:Lh/c;

    .line 278
    .line 279
    const/4 v1, 0x1

    .line 280
    iget-object v0, v0, Lh/e;->b:Lh/g;

    .line 281
    .line 282
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->k:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p1, Lcom/google/android/material/datepicker/m;

    .line 293
    .line 294
    iget v0, p1, Lcom/google/android/material/datepicker/m;->g0:I

    .line 295
    .line 296
    const/4 v1, 0x1

    .line 297
    const/4 v2, 0x2

    .line 298
    if-ne v0, v2, :cond_11

    .line 299
    .line 300
    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/m;->K(I)V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_11
    if-ne v0, v1, :cond_12

    .line 305
    .line 306
    invoke-virtual {p1, v2}, Lcom/google/android/material/datepicker/m;->K(I)V

    .line 307
    .line 308
    .line 309
    :cond_12
    :goto_5
    iget-object v0, p1, La1/v;->N:Landroid/view/View;

    .line 310
    .line 311
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/m;->L(Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
