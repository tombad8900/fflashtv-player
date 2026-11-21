.class public abstract Lt0/b;
.super Lm0/b;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final n:Landroid/graphics/Rect;

.field public static final o:Lk2/b;

.field public static final p:Lk2/b;


# instance fields
.field public final d:Landroid/graphics/Rect;

.field public final e:Landroid/graphics/Rect;

.field public final f:Landroid/graphics/Rect;

.field public final g:[I

.field public final h:Landroid/view/accessibility/AccessibilityManager;

.field public final i:Lcom/google/android/material/chip/Chip;

.field public j:Lt0/a;

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/high16 v2, -0x80000000

    .line 7
    .line 8
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lt0/b;->n:Landroid/graphics/Rect;

    .line 12
    .line 13
    new-instance v0, Lk2/b;

    .line 14
    .line 15
    const/16 v1, 0x13

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lk2/b;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lt0/b;->o:Lk2/b;

    .line 21
    .line 22
    new-instance v0, Lk2/b;

    .line 23
    .line 24
    const/16 v1, 0x14

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lk2/b;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lt0/b;->p:Lk2/b;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/chip/Chip;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lm0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt0/b;->d:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lt0/b;->e:Landroid/graphics/Rect;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lt0/b;->f:Landroid/graphics/Rect;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    iput-object v0, p0, Lt0/b;->g:[I

    .line 29
    .line 30
    const/high16 v0, -0x80000000

    .line 31
    .line 32
    iput v0, p0, Lt0/b;->k:I

    .line 33
    .line 34
    iput v0, p0, Lt0/b;->l:I

    .line 35
    .line 36
    iput v0, p0, Lt0/b;->m:I

    .line 37
    .line 38
    iput-object p1, p0, Lt0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "accessibility"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 51
    .line 52
    iput-object v0, p0, Lt0/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)Ll/o;
    .locals 0

    .line 1
    iget-object p1, p0, Lt0/b;->j:Lt0/a;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lt0/a;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lt0/a;-><init>(Lt0/b;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lt0/b;->j:Lt0/a;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lt0/b;->j:Lt0/a;

    .line 13
    .line 14
    return-object p1
.end method

.method public final d(Landroid/view/View;Ln0/d;)V
    .locals 2

    .line 1
    iget-object v0, p2, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    move-object p1, p0

    .line 9
    check-cast p1, Lm5/d;

    .line 10
    .line 11
    iget-object p1, p1, Lm5/d;->q:Lcom/google/android/material/chip/Chip;

    .line 12
    .line 13
    iget-object v1, p1, Lcom/google/android/material/chip/Chip;->n:Lm5/f;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-boolean v1, v1, Lm5/f;->i0:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/android/material/chip/Chip;->getAccessibilityClassName()Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p2, v0}, Ln0/d;->i(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2, p1}, Ln0/d;->o(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final j(I)Z
    .locals 2

    .line 1
    iget v0, p0, Lt0/b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, Lt0/b;->l:I

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1}, Lt0/b;->p(IZ)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lt0/b;->r(II)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1
.end method

.method public final k(I)Ln0/d;
    .locals 10

    .line 1
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ln0/d;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ln0/d;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 15
    .line 16
    .line 17
    const-string v3, "android.view.View"

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ln0/d;->i(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lt0/b;->n:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Lt0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v1}, Lt0/b;->o(ILn0/d;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ln0/d;->f()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 52
    .line 53
    const-string v0, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    :goto_0
    iget-object v5, p0, Lt0/b;->e:Landroid/graphics/Rect;

    .line 60
    .line 61
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V

    .line 62
    .line 63
    .line 64
    iget-object v6, p0, Lt0/b;->d:Landroid/graphics/Rect;

    .line 65
    .line 66
    invoke-virtual {v0, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_3

    .line 74
    .line 75
    invoke-virtual {v6, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 83
    .line 84
    const-string v0, "Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()"

    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_3
    :goto_1
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActions()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    and-int/lit8 v8, v7, 0x40

    .line 95
    .line 96
    if-nez v8, :cond_f

    .line 97
    .line 98
    const/16 v8, 0x80

    .line 99
    .line 100
    and-int/2addr v7, v8

    .line 101
    if-nez v7, :cond_e

    .line 102
    .line 103
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v0, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    iput p1, v1, Ln0/d;->b:I

    .line 115
    .line 116
    invoke-virtual {v0, v4, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 117
    .line 118
    .line 119
    iget v7, p0, Lt0/b;->k:I

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    if-ne v7, p1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v8}, Ln0/d;->a(I)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    invoke-virtual {v0, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 132
    .line 133
    .line 134
    const/16 v7, 0x40

    .line 135
    .line 136
    invoke-virtual {v1, v7}, Ln0/d;->a(I)V

    .line 137
    .line 138
    .line 139
    :goto_2
    iget v7, p0, Lt0/b;->l:I

    .line 140
    .line 141
    if-ne v7, p1, :cond_5

    .line 142
    .line 143
    move p1, v2

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move p1, v9

    .line 146
    :goto_3
    if-eqz p1, :cond_6

    .line 147
    .line 148
    const/4 v7, 0x2

    .line 149
    invoke-virtual {v1, v7}, Ln0/d;->a(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_7

    .line 158
    .line 159
    invoke-virtual {v1, v2}, Ln0/d;->a(I)V

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_4
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lt0/b;->g:[I

    .line 166
    .line 167
    invoke-virtual {v4, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_8

    .line 175
    .line 176
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 177
    .line 178
    .line 179
    new-instance v3, Landroid/graphics/Rect;

    .line 180
    .line 181
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 188
    .line 189
    .line 190
    aget v5, p1, v9

    .line 191
    .line 192
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    sub-int/2addr v5, v7

    .line 197
    aget v7, p1, v2

    .line 198
    .line 199
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    sub-int/2addr v7, v8

    .line 204
    invoke-virtual {v3, v5, v7}, Landroid/graphics/Rect;->offset(II)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 211
    .line 212
    .line 213
    :cond_8
    iget-object v3, p0, Lt0/b;->f:Landroid/graphics/Rect;

    .line 214
    .line 215
    invoke-virtual {v4, v3}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_d

    .line 220
    .line 221
    aget v5, p1, v9

    .line 222
    .line 223
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    sub-int/2addr v5, v7

    .line 228
    aget p1, p1, v2

    .line 229
    .line 230
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    sub-int/2addr p1, v7

    .line 235
    invoke-virtual {v3, v5, p1}, Landroid/graphics/Rect;->offset(II)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v3}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-eqz p1, :cond_d

    .line 243
    .line 244
    invoke-virtual {v0, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Landroid/graphics/Rect;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_9

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_9
    invoke-virtual {v4}, Landroid/view/View;->getWindowVisibility()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-eqz p1, :cond_a

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    :goto_5
    instance-of v0, p1, Landroid/view/View;

    .line 266
    .line 267
    if-eqz v0, :cond_c

    .line 268
    .line 269
    check-cast p1, Landroid/view/View;

    .line 270
    .line 271
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    const/4 v3, 0x0

    .line 276
    cmpg-float v0, v0, v3

    .line 277
    .line 278
    if-lez v0, :cond_d

    .line 279
    .line 280
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_b

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    goto :goto_5

    .line 292
    :cond_c
    if-eqz p1, :cond_d

    .line 293
    .line 294
    iget-object p1, v1, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 295
    .line 296
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 297
    .line 298
    .line 299
    :cond_d
    :goto_6
    return-object v1

    .line 300
    :cond_e
    new-instance p1, Ljava/lang/RuntimeException;

    .line 301
    .line 302
    const-string v0, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 303
    .line 304
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw p1

    .line 308
    :cond_f
    new-instance p1, Ljava/lang/RuntimeException;

    .line 309
    .line 310
    const-string v0, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 311
    .line 312
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw p1
.end method

.method public abstract l(Ljava/util/ArrayList;)V
.end method

.method public final m(ILandroid/graphics/Rect;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lt0/b;->l(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    new-instance v4, Lp/l;

    .line 16
    .line 17
    invoke-direct {v4}, Lp/l;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-ge v6, v7, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {v0, v7}, Lt0/b;->k(I)Ln0/d;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    invoke-virtual {v4, v8, v7}, Lp/l;->c(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v3, v0, Lt0/b;->l:I

    .line 58
    .line 59
    const/high16 v7, -0x80000000

    .line 60
    .line 61
    if-ne v3, v7, :cond_1

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v4, v3}, Lp/l;->b(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ln0/d;

    .line 70
    .line 71
    :goto_1
    sget-object v8, Lt0/b;->o:Lk2/b;

    .line 72
    .line 73
    sget-object v9, Lt0/b;->p:Lk2/b;

    .line 74
    .line 75
    iget-object v10, v0, Lt0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 76
    .line 77
    const/4 v11, 0x2

    .line 78
    const/4 v13, 0x1

    .line 79
    if-eq v1, v13, :cond_15

    .line 80
    .line 81
    if-eq v1, v11, :cond_15

    .line 82
    .line 83
    const/16 v11, 0x82

    .line 84
    .line 85
    const/16 v14, 0x42

    .line 86
    .line 87
    const/16 v15, 0x21

    .line 88
    .line 89
    const/16 v6, 0x11

    .line 90
    .line 91
    if-eq v1, v6, :cond_2

    .line 92
    .line 93
    if-eq v1, v15, :cond_2

    .line 94
    .line 95
    if-eq v1, v14, :cond_2

    .line 96
    .line 97
    if-ne v1, v11, :cond_3

    .line 98
    .line 99
    :cond_2
    move/from16 v17, v13

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    const-string v2, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :goto_2
    new-instance v13, Landroid/graphics/Rect;

    .line 111
    .line 112
    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 113
    .line 114
    .line 115
    iget v5, v0, Lt0/b;->l:I

    .line 116
    .line 117
    const-string v12, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 118
    .line 119
    if-eq v5, v7, :cond_4

    .line 120
    .line 121
    invoke-virtual {v0, v5}, Lt0/b;->n(I)Ln0/d;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v2, v2, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 126
    .line 127
    invoke-virtual {v2, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    const/4 v10, -0x1

    .line 131
    goto :goto_4

    .line 132
    :cond_4
    if-eqz v2, :cond_5

    .line 133
    .line 134
    invoke-virtual {v13, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eq v1, v6, :cond_9

    .line 147
    .line 148
    if-eq v1, v15, :cond_8

    .line 149
    .line 150
    if-eq v1, v14, :cond_7

    .line 151
    .line 152
    if-ne v1, v11, :cond_6

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v10, -0x1

    .line 156
    invoke-virtual {v13, v5, v10, v2, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 161
    .line 162
    invoke-direct {v1, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    :cond_7
    const/4 v2, 0x0

    .line 167
    const/4 v10, -0x1

    .line 168
    invoke-virtual {v13, v10, v2, v10, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_8
    const/4 v7, 0x0

    .line 173
    const/4 v10, -0x1

    .line 174
    invoke-virtual {v13, v7, v5, v2, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_9
    const/4 v7, 0x0

    .line 179
    const/4 v10, -0x1

    .line 180
    invoke-virtual {v13, v2, v7, v2, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 181
    .line 182
    .line 183
    :goto_4
    new-instance v2, Landroid/graphics/Rect;

    .line 184
    .line 185
    invoke-direct {v2, v13}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 186
    .line 187
    .line 188
    if-eq v1, v6, :cond_d

    .line 189
    .line 190
    if-eq v1, v15, :cond_c

    .line 191
    .line 192
    if-eq v1, v14, :cond_b

    .line 193
    .line 194
    if-ne v1, v11, :cond_a

    .line 195
    .line 196
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    add-int/lit8 v5, v5, 0x1

    .line 201
    .line 202
    neg-int v5, v5

    .line 203
    const/4 v7, 0x0

    .line 204
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-direct {v1, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v1

    .line 214
    :cond_b
    const/4 v7, 0x0

    .line 215
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    add-int/lit8 v5, v5, 0x1

    .line 220
    .line 221
    neg-int v5, v5

    .line 222
    invoke-virtual {v2, v5, v7}, Landroid/graphics/Rect;->offset(II)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_c
    const/4 v7, 0x0

    .line 227
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    add-int/lit8 v5, v5, 0x1

    .line 232
    .line 233
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_d
    const/4 v7, 0x0

    .line 238
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    invoke-virtual {v2, v5, v7}, Landroid/graphics/Rect;->offset(II)V

    .line 245
    .line 246
    .line 247
    :goto_5
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iget v5, v4, Lp/l;->l:I

    .line 251
    .line 252
    new-instance v6, Landroid/graphics/Rect;

    .line 253
    .line 254
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 255
    .line 256
    .line 257
    move v9, v7

    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    :goto_6
    if-ge v9, v5, :cond_14

    .line 261
    .line 262
    iget-object v11, v4, Lp/l;->k:[Ljava/lang/Object;

    .line 263
    .line 264
    aget-object v11, v11, v9

    .line 265
    .line 266
    check-cast v11, Ln0/d;

    .line 267
    .line 268
    if-ne v11, v3, :cond_e

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_e
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    iget-object v12, v11, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 275
    .line 276
    invoke-virtual {v12, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v1, v13, v6}, Lcom/bumptech/glide/c;->M(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 280
    .line 281
    .line 282
    move-result v12

    .line 283
    if-nez v12, :cond_f

    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_f
    invoke-static {v1, v13, v2}, Lcom/bumptech/glide/c;->M(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    if-nez v12, :cond_10

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_10
    invoke-static {v1, v13, v6, v2}, Lcom/bumptech/glide/c;->g(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 294
    .line 295
    .line 296
    move-result v12

    .line 297
    if-eqz v12, :cond_11

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_11
    invoke-static {v1, v13, v2, v6}, Lcom/bumptech/glide/c;->g(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    if-eqz v12, :cond_12

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_12
    invoke-static {v1, v13, v6}, Lcom/bumptech/glide/c;->R(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    invoke-static {v1, v13, v6}, Lcom/bumptech/glide/c;->S(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    mul-int/lit8 v15, v12, 0xd

    .line 316
    .line 317
    mul-int/2addr v15, v12

    .line 318
    mul-int/2addr v14, v14

    .line 319
    add-int/2addr v14, v15

    .line 320
    invoke-static {v1, v13, v2}, Lcom/bumptech/glide/c;->R(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    invoke-static {v1, v13, v2}, Lcom/bumptech/glide/c;->S(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 325
    .line 326
    .line 327
    move-result v15

    .line 328
    mul-int/lit8 v17, v12, 0xd

    .line 329
    .line 330
    mul-int v17, v17, v12

    .line 331
    .line 332
    mul-int/2addr v15, v15

    .line 333
    add-int v15, v15, v17

    .line 334
    .line 335
    if-ge v14, v15, :cond_13

    .line 336
    .line 337
    :goto_7
    invoke-virtual {v2, v6}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 338
    .line 339
    .line 340
    move-object/from16 v16, v11

    .line 341
    .line 342
    :cond_13
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_14
    move v2, v10

    .line 346
    :goto_9
    move-object/from16 v1, v16

    .line 347
    .line 348
    goto/16 :goto_10

    .line 349
    .line 350
    :cond_15
    move/from16 v17, v13

    .line 351
    .line 352
    const/4 v2, -0x1

    .line 353
    const/4 v7, 0x0

    .line 354
    invoke-virtual {v10}, Landroid/view/View;->getLayoutDirection()I

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    move/from16 v6, v17

    .line 359
    .line 360
    if-ne v5, v6, :cond_16

    .line 361
    .line 362
    const/4 v5, 0x1

    .line 363
    goto :goto_a

    .line 364
    :cond_16
    move v5, v7

    .line 365
    :goto_a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    iget v6, v4, Lp/l;->l:I

    .line 369
    .line 370
    new-instance v9, Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 373
    .line 374
    .line 375
    move v10, v7

    .line 376
    :goto_b
    if-ge v10, v6, :cond_17

    .line 377
    .line 378
    iget-object v12, v4, Lp/l;->k:[Ljava/lang/Object;

    .line 379
    .line 380
    aget-object v12, v12, v10

    .line 381
    .line 382
    check-cast v12, Ln0/d;

    .line 383
    .line 384
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    add-int/lit8 v10, v10, 0x1

    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_17
    new-instance v6, Lt0/c;

    .line 391
    .line 392
    invoke-direct {v6, v5, v8}, Lt0/c;-><init>(ZLk2/b;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v9, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 396
    .line 397
    .line 398
    const/4 v6, 0x1

    .line 399
    if-eq v1, v6, :cond_1b

    .line 400
    .line 401
    if-ne v1, v11, :cond_1a

    .line 402
    .line 403
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-nez v3, :cond_18

    .line 408
    .line 409
    move v10, v2

    .line 410
    goto :goto_c

    .line 411
    :cond_18
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    :goto_c
    add-int/2addr v10, v6

    .line 416
    if-ge v10, v1, :cond_19

    .line 417
    .line 418
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    goto :goto_f

    .line 423
    :cond_19
    const/4 v6, 0x0

    .line 424
    goto :goto_f

    .line 425
    :cond_1a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 426
    .line 427
    const-string v2, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."

    .line 428
    .line 429
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v1

    .line 433
    :cond_1b
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-nez v3, :cond_1c

    .line 438
    .line 439
    :goto_d
    const/16 v17, 0x1

    .line 440
    .line 441
    goto :goto_e

    .line 442
    :cond_1c
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    goto :goto_d

    .line 447
    :goto_e
    add-int/lit8 v1, v1, -0x1

    .line 448
    .line 449
    if-ltz v1, :cond_19

    .line 450
    .line 451
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    :goto_f
    move-object/from16 v16, v6

    .line 456
    .line 457
    check-cast v16, Ln0/d;

    .line 458
    .line 459
    goto :goto_9

    .line 460
    :goto_10
    if-nez v1, :cond_1d

    .line 461
    .line 462
    const/high16 v7, -0x80000000

    .line 463
    .line 464
    goto :goto_13

    .line 465
    :cond_1d
    iget v3, v4, Lp/l;->l:I

    .line 466
    .line 467
    move v5, v7

    .line 468
    :goto_11
    if-ge v5, v3, :cond_1f

    .line 469
    .line 470
    iget-object v6, v4, Lp/l;->k:[Ljava/lang/Object;

    .line 471
    .line 472
    aget-object v6, v6, v5

    .line 473
    .line 474
    if-ne v6, v1, :cond_1e

    .line 475
    .line 476
    move v12, v5

    .line 477
    goto :goto_12

    .line 478
    :cond_1e
    add-int/lit8 v5, v5, 0x1

    .line 479
    .line 480
    goto :goto_11

    .line 481
    :cond_1f
    move v12, v2

    .line 482
    :goto_12
    iget-object v1, v4, Lp/l;->j:[I

    .line 483
    .line 484
    aget v7, v1, v12

    .line 485
    .line 486
    :goto_13
    invoke-virtual {v0, v7}, Lt0/b;->q(I)Z

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    return v1
.end method

.method public final n(I)Ln0/d;
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_3

    .line 3
    .line 4
    iget-object p1, p0, Lt0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ln0/d;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ln0/d;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/chip/Chip;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lt0/b;->l(Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v0, "Views cannot have both real and virtual children"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_1
    if-ge v3, v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v5, v1, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 67
    .line 68
    invoke-virtual {v5, p1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    return-object v1

    .line 75
    :cond_3
    invoke-virtual {p0, p1}, Lt0/b;->k(I)Ln0/d;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public abstract o(ILn0/d;)V
.end method

.method public abstract p(IZ)V
.end method

.method public final q(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lt0/b;->l:I

    .line 17
    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/high16 v1, -0x80000000

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lt0/b;->j(I)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    if-ne p1, v1, :cond_3

    .line 29
    .line 30
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_3
    iput p1, p0, Lt0/b;->l:I

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, p1, v0}, Lt0/b;->p(IZ)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x8

    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, Lt0/b;->r(II)V

    .line 41
    .line 42
    .line 43
    return v0
.end method

.method public final r(II)V
    .locals 5

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lt0/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lt0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    const/4 v2, -0x1

    .line 25
    if-eq p1, v2, :cond_4

    .line 26
    .line 27
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p1}, Lt0/b;->n(I)Ln0/d;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Ln0/d;->f()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v2, v2, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-eqz v3, :cond_2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 101
    .line 102
    const-string p2, "Callbacks must add text or a content description in populateEventForVirtualViewId()"

    .line 103
    .line 104
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_3
    :goto_0
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {v0, p2}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-interface {v1, v0, p2}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 138
    .line 139
    .line 140
    :cond_5
    :goto_2
    return-void
.end method
