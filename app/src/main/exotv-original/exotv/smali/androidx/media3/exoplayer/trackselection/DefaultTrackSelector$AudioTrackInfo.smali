.class final Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;
.super Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioTrackInfo"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo<",
        "Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;",
        ">;",
        "Ljava/lang/Comparable<",
        "Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final allowMixedMimeTypes:Z

.field private final bitrate:I

.field private final channelCount:I

.field private final hasMainOrNoRoleFlag:Z

.field private final isDefaultSelectionFlag:Z

.field private final isObjectBasedAudio:Z

.field private final isWithinConstraints:Z

.field private final isWithinRendererCapabilities:Z

.field private final language:Ljava/lang/String;

.field private final localeLanguageMatchIndex:I

.field private final localeLanguageScore:I

.field private final parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

.field private final preferredLanguageIndex:I

.field private final preferredLanguageScore:I

.field private final preferredMimeTypeMatchIndex:I

.field private final preferredRoleFlagsScore:I

.field private final sampleRate:I

.field private final selectionEligibility:I

.field private final usesHardwareAcceleration:Z

.field private final usesPrimaryDecoder:Z


# direct methods
.method public constructor <init>(ILandroidx/media3/common/q1;ILandroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;IZLe6/f;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/media3/common/q1;",
            "I",
            "Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;",
            "IZ",
            "Le6/f;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;-><init>(ILandroidx/media3/common/q1;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    .line 5
    .line 6
    iget-boolean p1, p4, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->allowAudioNonSeamlessAdaptiveness:Z

    .line 7
    .line 8
    const/16 p2, 0x18

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move p1, p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 p1, 0x10

    .line 15
    .line 16
    :goto_0
    iget-boolean p3, p4, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->allowAudioMixedMimeTypeAdaptiveness:Z

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    and-int p3, p8, p1

    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    move p3, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move p3, v1

    .line 29
    :goto_1
    iput-boolean p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->allowMixedMimeTypes:Z

    .line 30
    .line 31
    iget-object p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 32
    .line 33
    iget-object p3, p3, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p3}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->normalizeUndeterminedLanguageToNull(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    iput-object p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->language:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p5, v1}, Landroidx/media3/exoplayer/RendererCapabilities;->isFormatSupported(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    iput-boolean p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinRendererCapabilities:Z

    .line 46
    .line 47
    move p3, v1

    .line 48
    :goto_2
    iget-object p8, p4, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 49
    .line 50
    invoke-virtual {p8}, Ljava/util/AbstractCollection;->size()I

    .line 51
    .line 52
    .line 53
    move-result p8

    .line 54
    const v2, 0x7fffffff

    .line 55
    .line 56
    .line 57
    if-ge p3, p8, :cond_3

    .line 58
    .line 59
    iget-object p8, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 60
    .line 61
    iget-object v3, p4, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 62
    .line 63
    invoke-interface {v3, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {p8, v3, v1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->getFormatLanguageScore(Landroidx/media3/common/w;Ljava/lang/String;Z)I

    .line 70
    .line 71
    .line 72
    move-result p8

    .line 73
    if-lez p8, :cond_2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    add-int/lit8 p3, p3, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move p8, v1

    .line 80
    move p3, v2

    .line 81
    :goto_3
    iput p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredLanguageIndex:I

    .line 82
    .line 83
    iput p8, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredLanguageScore:I

    .line 84
    .line 85
    iget-object p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 86
    .line 87
    iget p3, p3, Landroidx/media3/common/w;->f:I

    .line 88
    .line 89
    iget p8, p4, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 90
    .line 91
    invoke-static {p3, p8}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->access$4200(II)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    iput p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredRoleFlagsScore:I

    .line 96
    .line 97
    iget-object p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 98
    .line 99
    iget p8, p3, Landroidx/media3/common/w;->f:I

    .line 100
    .line 101
    if-eqz p8, :cond_5

    .line 102
    .line 103
    and-int/2addr p8, v0

    .line 104
    if-eqz p8, :cond_4

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    move p8, v1

    .line 108
    goto :goto_5

    .line 109
    :cond_5
    :goto_4
    move p8, v0

    .line 110
    :goto_5
    iput-boolean p8, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->hasMainOrNoRoleFlag:Z

    .line 111
    .line 112
    iget p8, p3, Landroidx/media3/common/w;->e:I

    .line 113
    .line 114
    and-int/2addr p8, v0

    .line 115
    if-eqz p8, :cond_6

    .line 116
    .line 117
    move p8, v0

    .line 118
    goto :goto_6

    .line 119
    :cond_6
    move p8, v1

    .line 120
    :goto_6
    iput-boolean p8, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isDefaultSelectionFlag:Z

    .line 121
    .line 122
    invoke-static {p3}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->access$4500(Landroidx/media3/common/w;)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    iput-boolean p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isObjectBasedAudio:Z

    .line 127
    .line 128
    iget-object p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 129
    .line 130
    iget p8, p3, Landroidx/media3/common/w;->C:I

    .line 131
    .line 132
    iput p8, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->channelCount:I

    .line 133
    .line 134
    iget v3, p3, Landroidx/media3/common/w;->D:I

    .line 135
    .line 136
    iput v3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->sampleRate:I

    .line 137
    .line 138
    iget v3, p3, Landroidx/media3/common/w;->j:I

    .line 139
    .line 140
    iput v3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->bitrate:I

    .line 141
    .line 142
    const/4 v4, -0x1

    .line 143
    if-eq v3, v4, :cond_7

    .line 144
    .line 145
    iget v5, p4, Landroidx/media3/common/v1;->maxAudioBitrate:I

    .line 146
    .line 147
    if-gt v3, v5, :cond_9

    .line 148
    .line 149
    :cond_7
    if-eq p8, v4, :cond_8

    .line 150
    .line 151
    iget v3, p4, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 152
    .line 153
    if-gt p8, v3, :cond_9

    .line 154
    .line 155
    :cond_8
    invoke-interface {p7, p3}, Le6/f;->apply(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    if-eqz p3, :cond_9

    .line 160
    .line 161
    move p3, v0

    .line 162
    goto :goto_7

    .line 163
    :cond_9
    move p3, v1

    .line 164
    :goto_7
    iput-boolean p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinConstraints:Z

    .line 165
    .line 166
    sget p3, Lh1/i0;->a:I

    .line 167
    .line 168
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    sget p7, Lh1/i0;->a:I

    .line 177
    .line 178
    if-lt p7, p2, :cond_a

    .line 179
    .line 180
    invoke-virtual {p3}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p2}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    const-string p3, ","

    .line 189
    .line 190
    invoke-virtual {p2, p3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    goto :goto_8

    .line 195
    :cond_a
    new-array p2, v0, [Ljava/lang/String;

    .line 196
    .line 197
    iget-object p3, p3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 198
    .line 199
    invoke-virtual {p3}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    aput-object p3, p2, v1

    .line 204
    .line 205
    :goto_8
    move p3, v1

    .line 206
    :goto_9
    array-length p7, p2

    .line 207
    if-ge p3, p7, :cond_b

    .line 208
    .line 209
    aget-object p7, p2, p3

    .line 210
    .line 211
    invoke-static {p7}, Lh1/i0;->T(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p7

    .line 215
    aput-object p7, p2, p3

    .line 216
    .line 217
    add-int/lit8 p3, p3, 0x1

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_b
    move p3, v1

    .line 221
    :goto_a
    array-length p7, p2

    .line 222
    if-ge p3, p7, :cond_d

    .line 223
    .line 224
    iget-object p7, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 225
    .line 226
    aget-object p8, p2, p3

    .line 227
    .line 228
    invoke-static {p7, p8, v1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->getFormatLanguageScore(Landroidx/media3/common/w;Ljava/lang/String;Z)I

    .line 229
    .line 230
    .line 231
    move-result p7

    .line 232
    if-lez p7, :cond_c

    .line 233
    .line 234
    goto :goto_b

    .line 235
    :cond_c
    add-int/lit8 p3, p3, 0x1

    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_d
    move p7, v1

    .line 239
    move p3, v2

    .line 240
    :goto_b
    iput p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->localeLanguageMatchIndex:I

    .line 241
    .line 242
    iput p7, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->localeLanguageScore:I

    .line 243
    .line 244
    move p2, v1

    .line 245
    :goto_c
    iget-object p3, p4, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 246
    .line 247
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 248
    .line 249
    .line 250
    move-result p3

    .line 251
    if-ge p2, p3, :cond_f

    .line 252
    .line 253
    iget-object p3, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 254
    .line 255
    iget-object p3, p3, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 256
    .line 257
    if-eqz p3, :cond_e

    .line 258
    .line 259
    iget-object p7, p4, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 260
    .line 261
    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p7

    .line 265
    invoke-virtual {p3, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result p3

    .line 269
    if-eqz p3, :cond_e

    .line 270
    .line 271
    move v2, p2

    .line 272
    goto :goto_d

    .line 273
    :cond_e
    add-int/lit8 p2, p2, 0x1

    .line 274
    .line 275
    goto :goto_c

    .line 276
    :cond_f
    :goto_d
    iput v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredMimeTypeMatchIndex:I

    .line 277
    .line 278
    invoke-static {p5}, Landroidx/media3/exoplayer/RendererCapabilities;->getDecoderSupport(I)I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    const/16 p3, 0x80

    .line 283
    .line 284
    if-ne p2, p3, :cond_10

    .line 285
    .line 286
    move p2, v0

    .line 287
    goto :goto_e

    .line 288
    :cond_10
    move p2, v1

    .line 289
    :goto_e
    iput-boolean p2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesPrimaryDecoder:Z

    .line 290
    .line 291
    invoke-static {p5}, Landroidx/media3/exoplayer/RendererCapabilities;->getHardwareAccelerationSupport(I)I

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    const/16 p3, 0x40

    .line 296
    .line 297
    if-ne p2, p3, :cond_11

    .line 298
    .line 299
    goto :goto_f

    .line 300
    :cond_11
    move v0, v1

    .line 301
    :goto_f
    iput-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesHardwareAcceleration:Z

    .line 302
    .line 303
    invoke-direct {p0, p5, p6, p1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->evaluateSelectionEligibility(IZI)I

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    iput p1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->selectionEligibility:I

    .line 308
    .line 309
    return-void
.end method

.method public static compareSelections(Ljava/util/List;Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->compareTo(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static createForTrackGroup(ILandroidx/media3/common/q1;Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;[IZLe6/f;I)Lf6/m0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/media3/common/q1;",
            "Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;",
            "[IZ",
            "Le6/f;",
            "I)",
            "Lf6/m0;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v5, v1

    .line 7
    :goto_0
    iget v1, p1, Landroidx/media3/common/q1;->a:I

    .line 8
    .line 9
    if-ge v5, v1, :cond_0

    .line 10
    .line 11
    new-instance v2, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;

    .line 12
    .line 13
    aget v7, p3, v5

    .line 14
    .line 15
    move v3, p0

    .line 16
    move-object v4, p1

    .line 17
    move-object v6, p2

    .line 18
    move v8, p4

    .line 19
    move-object/from16 v9, p5

    .line 20
    .line 21
    move/from16 v10, p6

    .line 22
    .line 23
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;-><init>(ILandroidx/media3/common/q1;ILandroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;IZLe6/f;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v5, v5, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Lf6/j0;->f()Lf6/l1;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private evaluateSelectionEligibility(IZI)I
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->exceedRendererCapabilitiesIfNecessary:Z

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/RendererCapabilities;->isFormatSupported(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinConstraints:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    .line 18
    .line 19
    iget-boolean v0, v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->exceedAudioConstraintsIfNecessary:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    .line 25
    .line 26
    iget-object v2, v0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 27
    .line 28
    iget v2, v2, Landroidx/media3/common/t1;->a:I

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 34
    .line 35
    invoke-static {v0, p1, v2}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->access$4600(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;ILandroidx/media3/common/w;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    invoke-static {p1, v1}, Landroidx/media3/exoplayer/RendererCapabilities;->isFormatSupported(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinConstraints:Z

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    .line 53
    .line 54
    iget v0, v0, Landroidx/media3/common/w;->j:I

    .line 55
    .line 56
    const/4 v1, -0x1

    .line 57
    if-eq v0, v1, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    .line 60
    .line 61
    iget-boolean v1, v0, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 62
    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    iget-boolean v1, v0, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    .line 66
    .line 67
    if-nez v1, :cond_4

    .line 68
    .line 69
    iget-boolean v1, v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->allowMultipleAdaptiveSelections:Z

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    if-nez p2, :cond_4

    .line 74
    .line 75
    :cond_3
    iget-object p2, v0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 76
    .line 77
    iget p2, p2, Landroidx/media3/common/t1;->a:I

    .line 78
    .line 79
    if-eq p2, v3, :cond_4

    .line 80
    .line 81
    and-int/2addr p1, p3

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    return v3

    .line 85
    :cond_4
    const/4 p1, 0x1

    .line 86
    return p1
.end method


# virtual methods
.method public compareTo(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;)I
    .locals 5

    .line 2
    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinConstraints:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinRendererCapabilities:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->access$4400()Lf6/k1;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->access$4400()Lf6/k1;

    move-result-object v0

    invoke-virtual {v0}, Lf6/k1;->a()Lf6/k1;

    move-result-object v0

    .line 5
    :goto_0
    iget-boolean v1, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinRendererCapabilities:Z

    iget-boolean v2, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinRendererCapabilities:Z

    .line 6
    sget-object v3, Lf6/d0;->a:Lf6/b0;

    invoke-virtual {v3, v1, v2}, Lf6/b0;->c(ZZ)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredLanguageIndex:I

    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredLanguageIndex:I

    .line 8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 9
    sget-object v4, Lf6/j1;->l:Lf6/j1;

    .line 10
    invoke-virtual {v1, v2, v3, v4}, Lf6/d0;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredLanguageScore:I

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredLanguageScore:I

    .line 11
    invoke-virtual {v1, v2, v3}, Lf6/d0;->a(II)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredRoleFlagsScore:I

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredRoleFlagsScore:I

    .line 12
    invoke-virtual {v1, v2, v3}, Lf6/d0;->a(II)Lf6/d0;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isDefaultSelectionFlag:Z

    iget-boolean v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isDefaultSelectionFlag:Z

    .line 13
    invoke-virtual {v1, v2, v3}, Lf6/d0;->c(ZZ)Lf6/d0;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->hasMainOrNoRoleFlag:Z

    iget-boolean v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->hasMainOrNoRoleFlag:Z

    .line 14
    invoke-virtual {v1, v2, v3}, Lf6/d0;->c(ZZ)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->localeLanguageMatchIndex:I

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->localeLanguageMatchIndex:I

    .line 16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 17
    invoke-virtual {v1, v2, v3, v4}, Lf6/d0;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->localeLanguageScore:I

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->localeLanguageScore:I

    .line 18
    invoke-virtual {v1, v2, v3}, Lf6/d0;->a(II)Lf6/d0;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinConstraints:Z

    iget-boolean v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isWithinConstraints:Z

    .line 19
    invoke-virtual {v1, v2, v3}, Lf6/d0;->c(ZZ)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredMimeTypeMatchIndex:I

    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->preferredMimeTypeMatchIndex:I

    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 22
    invoke-virtual {v1, v2, v3, v4}, Lf6/d0;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;

    move-result-object v1

    .line 23
    iget-object v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    iget-boolean v2, v2, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    if-eqz v2, :cond_1

    .line 24
    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->bitrate:I

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->bitrate:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;->access$4400()Lf6/k1;

    move-result-object v4

    invoke-virtual {v4}, Lf6/k1;->a()Lf6/k1;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lf6/d0;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;

    move-result-object v1

    .line 26
    :cond_1
    iget-boolean v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesPrimaryDecoder:Z

    iget-boolean v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesPrimaryDecoder:Z

    .line 27
    invoke-virtual {v1, v2, v3}, Lf6/d0;->c(ZZ)Lf6/d0;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesHardwareAcceleration:Z

    iget-boolean v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesHardwareAcceleration:Z

    .line 28
    invoke-virtual {v1, v2, v3}, Lf6/d0;->c(ZZ)Lf6/d0;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isObjectBasedAudio:Z

    iget-boolean v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isObjectBasedAudio:Z

    .line 29
    invoke-virtual {v1, v2, v3}, Lf6/d0;->c(ZZ)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->channelCount:I

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->channelCount:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lf6/d0;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;

    move-result-object v1

    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->sampleRate:I

    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->sampleRate:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lf6/d0;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;

    move-result-object v1

    .line 32
    iget-object v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->language:Ljava/lang/String;

    iget-object v3, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->language:Ljava/lang/String;

    sget v4, Lh1/i0;->a:I

    .line 33
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 34
    iget v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->bitrate:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget p1, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->bitrate:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lf6/d0;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lf6/d0;

    move-result-object v1

    .line 35
    :cond_2
    invoke-virtual {v1}, Lf6/d0;->e()I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->compareTo(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;)I

    move-result p1

    return p1
.end method

.method public getSelectionEligibility()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->selectionEligibility:I

    .line 2
    .line 3
    return v0
.end method

.method public isCompatibleForAdaptationWith(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;)Z
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    iget-boolean v0, v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->allowAudioMixedChannelCountAdaptiveness:Z

    const/4 v1, -0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    iget v0, v0, Landroidx/media3/common/w;->C:I

    if-eq v0, v1, :cond_3

    iget-object v2, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    iget v2, v2, Landroidx/media3/common/w;->C:I

    if-ne v0, v2, :cond_3

    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->allowMixedMimeTypes:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    iget-object v0, v0, Landroidx/media3/common/w;->n:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v2, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    iget-object v2, v2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 3
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->parameters:Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;

    iget-boolean v2, v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->allowAudioMixedSampleRateAdaptiveness:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    iget v2, v2, Landroidx/media3/common/w;->D:I

    if-eq v2, v1, :cond_3

    iget-object v1, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;->format:Landroidx/media3/common/w;

    iget v1, v1, Landroidx/media3/common/w;->D:I

    if-ne v2, v1, :cond_3

    :cond_2
    iget-boolean v0, v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$Parameters;->allowAudioMixedDecoderSupportAdaptiveness:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesPrimaryDecoder:Z

    iget-boolean v1, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesPrimaryDecoder:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesHardwareAcceleration:Z

    iget-boolean p1, p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->usesHardwareAcceleration:Z

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic isCompatibleForAdaptationWith(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$TrackInfo;)Z
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;->isCompatibleForAdaptationWith(Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector$AudioTrackInfo;)Z

    move-result p1

    return p1
.end method
