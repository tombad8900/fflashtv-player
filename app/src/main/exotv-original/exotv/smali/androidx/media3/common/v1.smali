.class public Landroidx/media3/common/v1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final DEFAULT:Landroidx/media3/common/v1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final DEFAULT_WITHOUT_CONTEXT:Landroidx/media3/common/v1;

.field private static final FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE:Ljava/lang/String;

.field private static final FIELD_AUDIO_OFFLOAD_PREFERENCES:Ljava/lang/String;

.field protected static final FIELD_CUSTOM_ID_BASE:I = 0x3e8

.field private static final FIELD_DISABLED_TRACK_TYPE:Ljava/lang/String;

.field private static final FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE:Ljava/lang/String;

.field private static final FIELD_FORCE_LOWEST_BITRATE:Ljava/lang/String;

.field private static final FIELD_IGNORED_TEXT_SELECTION_FLAGS:Ljava/lang/String;

.field private static final FIELD_IS_GAPLESS_SUPPORT_REQUIRED:Ljava/lang/String;

.field private static final FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED:Ljava/lang/String;

.field private static final FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED:Ljava/lang/String;

.field private static final FIELD_MAX_AUDIO_BITRATE:Ljava/lang/String;

.field private static final FIELD_MAX_AUDIO_CHANNEL_COUNT:Ljava/lang/String;

.field private static final FIELD_MAX_VIDEO_BITRATE:Ljava/lang/String;

.field private static final FIELD_MAX_VIDEO_FRAMERATE:Ljava/lang/String;

.field private static final FIELD_MAX_VIDEO_HEIGHT:Ljava/lang/String;

.field private static final FIELD_MAX_VIDEO_WIDTH:Ljava/lang/String;

.field private static final FIELD_MIN_VIDEO_BITRATE:Ljava/lang/String;

.field private static final FIELD_MIN_VIDEO_FRAMERATE:Ljava/lang/String;

.field private static final FIELD_MIN_VIDEO_HEIGHT:Ljava/lang/String;

.field private static final FIELD_MIN_VIDEO_WIDTH:Ljava/lang/String;

.field private static final FIELD_PREFERRED_AUDIO_LANGUAGES:Ljava/lang/String;

.field private static final FIELD_PREFERRED_AUDIO_MIME_TYPES:Ljava/lang/String;

.field private static final FIELD_PREFERRED_AUDIO_ROLE_FLAGS:Ljava/lang/String;

.field private static final FIELD_PREFERRED_TEXT_LANGUAGES:Ljava/lang/String;

.field private static final FIELD_PREFERRED_TEXT_ROLE_FLAGS:Ljava/lang/String;

.field private static final FIELD_PREFERRED_VIDEO_MIMETYPES:Ljava/lang/String;

.field private static final FIELD_PREFERRED_VIDEO_ROLE_FLAGS:Ljava/lang/String;

.field private static final FIELD_SELECTION_OVERRIDES:Ljava/lang/String;

.field private static final FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE:Ljava/lang/String;

.field private static final FIELD_VIEWPORT_HEIGHT:Ljava/lang/String;

.field private static final FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE:Ljava/lang/String;

.field private static final FIELD_VIEWPORT_WIDTH:Ljava/lang/String;


# instance fields
.field public final audioOffloadPreferences:Landroidx/media3/common/t1;

.field public final disabledTrackTypes:Lf6/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/w0;"
        }
    .end annotation
.end field

.field public final forceHighestSupportedBitrate:Z

.field public final forceLowestBitrate:Z

.field public final ignoredTextSelectionFlags:I

.field public final isPrioritizeImageOverVideoEnabled:Z

.field public final maxAudioBitrate:I

.field public final maxAudioChannelCount:I

.field public final maxVideoBitrate:I

.field public final maxVideoFrameRate:I

.field public final maxVideoHeight:I

.field public final maxVideoWidth:I

.field public final minVideoBitrate:I

.field public final minVideoFrameRate:I

.field public final minVideoHeight:I

.field public final minVideoWidth:I

.field public final overrides:Lf6/q0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/q0;"
        }
    .end annotation
.end field

.field public final preferredAudioLanguages:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field public final preferredAudioMimeTypes:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field public final preferredAudioRoleFlags:I

.field public final preferredTextLanguages:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field public final preferredTextRoleFlags:I

.field public final preferredVideoMimeTypes:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field public final preferredVideoRoleFlags:I

.field public final selectUndeterminedTextLanguage:Z

.field public final viewportHeight:I

.field public final viewportOrientationMayChange:Z

.field public final viewportWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/common/u1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/u1;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/media3/common/v1;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Landroidx/media3/common/v1;-><init>(Landroidx/media3/common/u1;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Landroidx/media3/common/v1;->DEFAULT_WITHOUT_CONTEXT:Landroidx/media3/common/v1;

    .line 12
    .line 13
    sput-object v1, Landroidx/media3/common/v1;->DEFAULT:Landroidx/media3/common/v1;

    .line 14
    .line 15
    sget v0, Lh1/i0;->a:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/16 v1, 0x24

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_LANGUAGES:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_ROLE_FLAGS:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_TEXT_LANGUAGES:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_TEXT_ROLE_FLAGS:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x5

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Landroidx/media3/common/v1;->FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v0, 0x6

    .line 55
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_WIDTH:Ljava/lang/String;

    .line 60
    .line 61
    const/4 v0, 0x7

    .line 62
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_HEIGHT:Ljava/lang/String;

    .line 67
    .line 68
    const/16 v0, 0x8

    .line 69
    .line 70
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_FRAMERATE:Ljava/lang/String;

    .line 75
    .line 76
    const/16 v0, 0x9

    .line 77
    .line 78
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_BITRATE:Ljava/lang/String;

    .line 83
    .line 84
    const/16 v0, 0xa

    .line 85
    .line 86
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_WIDTH:Ljava/lang/String;

    .line 91
    .line 92
    const/16 v0, 0xb

    .line 93
    .line 94
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_HEIGHT:Ljava/lang/String;

    .line 99
    .line 100
    const/16 v0, 0xc

    .line 101
    .line 102
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_FRAMERATE:Ljava/lang/String;

    .line 107
    .line 108
    const/16 v0, 0xd

    .line 109
    .line 110
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_BITRATE:Ljava/lang/String;

    .line 115
    .line 116
    const/16 v0, 0xe

    .line 117
    .line 118
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sput-object v0, Landroidx/media3/common/v1;->FIELD_VIEWPORT_WIDTH:Ljava/lang/String;

    .line 123
    .line 124
    const/16 v0, 0xf

    .line 125
    .line 126
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sput-object v0, Landroidx/media3/common/v1;->FIELD_VIEWPORT_HEIGHT:Ljava/lang/String;

    .line 131
    .line 132
    const/16 v0, 0x10

    .line 133
    .line 134
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sput-object v0, Landroidx/media3/common/v1;->FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE:Ljava/lang/String;

    .line 139
    .line 140
    const/16 v0, 0x11

    .line 141
    .line 142
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_VIDEO_MIMETYPES:Ljava/lang/String;

    .line 147
    .line 148
    const/16 v0, 0x12

    .line 149
    .line 150
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MAX_AUDIO_CHANNEL_COUNT:Ljava/lang/String;

    .line 155
    .line 156
    const/16 v0, 0x13

    .line 157
    .line 158
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    sput-object v0, Landroidx/media3/common/v1;->FIELD_MAX_AUDIO_BITRATE:Ljava/lang/String;

    .line 163
    .line 164
    const/16 v0, 0x14

    .line 165
    .line 166
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    sput-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_MIME_TYPES:Ljava/lang/String;

    .line 171
    .line 172
    const/16 v0, 0x15

    .line 173
    .line 174
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    sput-object v0, Landroidx/media3/common/v1;->FIELD_FORCE_LOWEST_BITRATE:Ljava/lang/String;

    .line 179
    .line 180
    const/16 v0, 0x16

    .line 181
    .line 182
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    sput-object v0, Landroidx/media3/common/v1;->FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE:Ljava/lang/String;

    .line 187
    .line 188
    const/16 v0, 0x17

    .line 189
    .line 190
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    sput-object v0, Landroidx/media3/common/v1;->FIELD_SELECTION_OVERRIDES:Ljava/lang/String;

    .line 195
    .line 196
    const/16 v0, 0x18

    .line 197
    .line 198
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    sput-object v0, Landroidx/media3/common/v1;->FIELD_DISABLED_TRACK_TYPE:Ljava/lang/String;

    .line 203
    .line 204
    const/16 v0, 0x19

    .line 205
    .line 206
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sput-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_VIDEO_ROLE_FLAGS:Ljava/lang/String;

    .line 211
    .line 212
    const/16 v0, 0x1a

    .line 213
    .line 214
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    sput-object v0, Landroidx/media3/common/v1;->FIELD_IGNORED_TEXT_SELECTION_FLAGS:Ljava/lang/String;

    .line 219
    .line 220
    const/16 v0, 0x1b

    .line 221
    .line 222
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sput-object v0, Landroidx/media3/common/v1;->FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE:Ljava/lang/String;

    .line 227
    .line 228
    const/16 v0, 0x1c

    .line 229
    .line 230
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    sput-object v0, Landroidx/media3/common/v1;->FIELD_IS_GAPLESS_SUPPORT_REQUIRED:Ljava/lang/String;

    .line 235
    .line 236
    const/16 v0, 0x1d

    .line 237
    .line 238
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    sput-object v0, Landroidx/media3/common/v1;->FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED:Ljava/lang/String;

    .line 243
    .line 244
    const/16 v0, 0x1e

    .line 245
    .line 246
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    sput-object v0, Landroidx/media3/common/v1;->FIELD_AUDIO_OFFLOAD_PREFERENCES:Ljava/lang/String;

    .line 251
    .line 252
    const/16 v0, 0x1f

    .line 253
    .line 254
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sput-object v0, Landroidx/media3/common/v1;->FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED:Ljava/lang/String;

    .line 259
    .line 260
    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/u1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/media3/common/u1;->access$3500(Landroidx/media3/common/u1;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Landroidx/media3/common/v1;->maxVideoWidth:I

    .line 9
    .line 10
    invoke-static {p1}, Landroidx/media3/common/u1;->access$3600(Landroidx/media3/common/u1;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Landroidx/media3/common/v1;->maxVideoHeight:I

    .line 15
    .line 16
    invoke-static {p1}, Landroidx/media3/common/u1;->access$3700(Landroidx/media3/common/u1;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Landroidx/media3/common/v1;->maxVideoFrameRate:I

    .line 21
    .line 22
    invoke-static {p1}, Landroidx/media3/common/u1;->access$3800(Landroidx/media3/common/u1;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Landroidx/media3/common/v1;->maxVideoBitrate:I

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/media3/common/u1;->access$3900(Landroidx/media3/common/u1;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Landroidx/media3/common/v1;->minVideoWidth:I

    .line 33
    .line 34
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4000(Landroidx/media3/common/u1;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p0, Landroidx/media3/common/v1;->minVideoHeight:I

    .line 39
    .line 40
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4100(Landroidx/media3/common/u1;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, Landroidx/media3/common/v1;->minVideoFrameRate:I

    .line 45
    .line 46
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4200(Landroidx/media3/common/u1;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Landroidx/media3/common/v1;->minVideoBitrate:I

    .line 51
    .line 52
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4300(Landroidx/media3/common/u1;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, Landroidx/media3/common/v1;->viewportWidth:I

    .line 57
    .line 58
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4400(Landroidx/media3/common/u1;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Landroidx/media3/common/v1;->viewportHeight:I

    .line 63
    .line 64
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4500(Landroidx/media3/common/u1;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput-boolean v0, p0, Landroidx/media3/common/v1;->viewportOrientationMayChange:Z

    .line 69
    .line 70
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4600(Landroidx/media3/common/u1;)Lf6/m0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Landroidx/media3/common/v1;->preferredVideoMimeTypes:Lf6/m0;

    .line 75
    .line 76
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4700(Landroidx/media3/common/u1;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Landroidx/media3/common/v1;->preferredVideoRoleFlags:I

    .line 81
    .line 82
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4800(Landroidx/media3/common/u1;)Lf6/m0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 87
    .line 88
    invoke-static {p1}, Landroidx/media3/common/u1;->access$4900(Landroidx/media3/common/u1;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 93
    .line 94
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5000(Landroidx/media3/common/u1;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iput v0, p0, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 99
    .line 100
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5100(Landroidx/media3/common/u1;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iput v0, p0, Landroidx/media3/common/v1;->maxAudioBitrate:I

    .line 105
    .line 106
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5200(Landroidx/media3/common/u1;)Lf6/m0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 111
    .line 112
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5300(Landroidx/media3/common/u1;)Landroidx/media3/common/t1;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 117
    .line 118
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5400(Landroidx/media3/common/u1;)Lf6/m0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iput-object v0, p0, Landroidx/media3/common/v1;->preferredTextLanguages:Lf6/m0;

    .line 123
    .line 124
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5500(Landroidx/media3/common/u1;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iput v0, p0, Landroidx/media3/common/v1;->preferredTextRoleFlags:I

    .line 129
    .line 130
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5600(Landroidx/media3/common/u1;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iput v0, p0, Landroidx/media3/common/v1;->ignoredTextSelectionFlags:I

    .line 135
    .line 136
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5700(Landroidx/media3/common/u1;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iput-boolean v0, p0, Landroidx/media3/common/v1;->selectUndeterminedTextLanguage:Z

    .line 141
    .line 142
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5800(Landroidx/media3/common/u1;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iput-boolean v0, p0, Landroidx/media3/common/v1;->isPrioritizeImageOverVideoEnabled:Z

    .line 147
    .line 148
    invoke-static {p1}, Landroidx/media3/common/u1;->access$5900(Landroidx/media3/common/u1;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iput-boolean v0, p0, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    .line 153
    .line 154
    invoke-static {p1}, Landroidx/media3/common/u1;->access$6000(Landroidx/media3/common/u1;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iput-boolean v0, p0, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 159
    .line 160
    invoke-static {p1}, Landroidx/media3/common/u1;->access$6100(Landroidx/media3/common/u1;)Ljava/util/HashMap;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Lf6/q0;->a(Ljava/util/Map;)Lf6/q0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iput-object v0, p0, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 169
    .line 170
    invoke-static {p1}, Landroidx/media3/common/u1;->access$6200(Landroidx/media3/common/u1;)Ljava/util/HashSet;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p1}, Lf6/w0;->j(Ljava/util/Collection;)Lf6/w0;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, p0, Landroidx/media3/common/v1;->disabledTrackTypes:Lf6/w0;

    .line 179
    .line 180
    return-void
.end method

.method public static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_WIDTH:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_HEIGHT:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1000()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1100()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_VIDEO_MIMETYPES:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1200()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_VIDEO_ROLE_FLAGS:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1300()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_LANGUAGES:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1400()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_ROLE_FLAGS:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1500()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MAX_AUDIO_CHANNEL_COUNT:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1600()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MAX_AUDIO_BITRATE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1700()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_MIME_TYPES:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1800()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_TEXT_LANGUAGES:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1900()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_PREFERRED_TEXT_ROLE_FLAGS:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_FRAMERATE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2000()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_IGNORED_TEXT_SELECTION_FLAGS:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2100()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2200()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2300()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_FORCE_LOWEST_BITRATE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2400()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2500()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_SELECTION_OVERRIDES:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2600()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_DISABLED_TRACK_TYPE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2700()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_AUDIO_OFFLOAD_PREFERENCES:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2800()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2900()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_IS_GAPLESS_SUPPORT_REQUIRED:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$300()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_BITRATE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$3000()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$400()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_WIDTH:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$500()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_HEIGHT:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$600()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_FRAMERATE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$700()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_BITRATE:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$800()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_VIEWPORT_WIDTH:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$900()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/common/v1;->FIELD_VIEWPORT_HEIGHT:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static fromBundle(Landroid/os/Bundle;)Landroidx/media3/common/v1;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/common/u1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/media3/common/u1;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroidx/media3/common/v1;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/common/v1;-><init>(Landroidx/media3/common/u1;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static getDefaults(Landroid/content/Context;)Landroidx/media3/common/v1;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/common/u1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/media3/common/u1;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroidx/media3/common/v1;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/common/v1;-><init>(Landroidx/media3/common/u1;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public buildUpon()Landroidx/media3/common/u1;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/common/u1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroidx/media3/common/u1;->a(Landroidx/media3/common/v1;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_1
    check-cast p1, Landroidx/media3/common/v1;

    .line 21
    .line 22
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoWidth:I

    .line 23
    .line 24
    iget v3, p1, Landroidx/media3/common/v1;->maxVideoWidth:I

    .line 25
    .line 26
    if-ne v2, v3, :cond_2

    .line 27
    .line 28
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoHeight:I

    .line 29
    .line 30
    iget v3, p1, Landroidx/media3/common/v1;->maxVideoHeight:I

    .line 31
    .line 32
    if-ne v2, v3, :cond_2

    .line 33
    .line 34
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoFrameRate:I

    .line 35
    .line 36
    iget v3, p1, Landroidx/media3/common/v1;->maxVideoFrameRate:I

    .line 37
    .line 38
    if-ne v2, v3, :cond_2

    .line 39
    .line 40
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoBitrate:I

    .line 41
    .line 42
    iget v3, p1, Landroidx/media3/common/v1;->maxVideoBitrate:I

    .line 43
    .line 44
    if-ne v2, v3, :cond_2

    .line 45
    .line 46
    iget v2, p0, Landroidx/media3/common/v1;->minVideoWidth:I

    .line 47
    .line 48
    iget v3, p1, Landroidx/media3/common/v1;->minVideoWidth:I

    .line 49
    .line 50
    if-ne v2, v3, :cond_2

    .line 51
    .line 52
    iget v2, p0, Landroidx/media3/common/v1;->minVideoHeight:I

    .line 53
    .line 54
    iget v3, p1, Landroidx/media3/common/v1;->minVideoHeight:I

    .line 55
    .line 56
    if-ne v2, v3, :cond_2

    .line 57
    .line 58
    iget v2, p0, Landroidx/media3/common/v1;->minVideoFrameRate:I

    .line 59
    .line 60
    iget v3, p1, Landroidx/media3/common/v1;->minVideoFrameRate:I

    .line 61
    .line 62
    if-ne v2, v3, :cond_2

    .line 63
    .line 64
    iget v2, p0, Landroidx/media3/common/v1;->minVideoBitrate:I

    .line 65
    .line 66
    iget v3, p1, Landroidx/media3/common/v1;->minVideoBitrate:I

    .line 67
    .line 68
    if-ne v2, v3, :cond_2

    .line 69
    .line 70
    iget-boolean v2, p0, Landroidx/media3/common/v1;->viewportOrientationMayChange:Z

    .line 71
    .line 72
    iget-boolean v3, p1, Landroidx/media3/common/v1;->viewportOrientationMayChange:Z

    .line 73
    .line 74
    if-ne v2, v3, :cond_2

    .line 75
    .line 76
    iget v2, p0, Landroidx/media3/common/v1;->viewportWidth:I

    .line 77
    .line 78
    iget v3, p1, Landroidx/media3/common/v1;->viewportWidth:I

    .line 79
    .line 80
    if-ne v2, v3, :cond_2

    .line 81
    .line 82
    iget v2, p0, Landroidx/media3/common/v1;->viewportHeight:I

    .line 83
    .line 84
    iget v3, p1, Landroidx/media3/common/v1;->viewportHeight:I

    .line 85
    .line 86
    if-ne v2, v3, :cond_2

    .line 87
    .line 88
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredVideoMimeTypes:Lf6/m0;

    .line 89
    .line 90
    iget-object v3, p1, Landroidx/media3/common/v1;->preferredVideoMimeTypes:Lf6/m0;

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Lf6/m0;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    iget v2, p0, Landroidx/media3/common/v1;->preferredVideoRoleFlags:I

    .line 99
    .line 100
    iget v3, p1, Landroidx/media3/common/v1;->preferredVideoRoleFlags:I

    .line 101
    .line 102
    if-ne v2, v3, :cond_2

    .line 103
    .line 104
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 105
    .line 106
    iget-object v3, p1, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Lf6/m0;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_2

    .line 113
    .line 114
    iget v2, p0, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 115
    .line 116
    iget v3, p1, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 117
    .line 118
    if-ne v2, v3, :cond_2

    .line 119
    .line 120
    iget v2, p0, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 121
    .line 122
    iget v3, p1, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 123
    .line 124
    if-ne v2, v3, :cond_2

    .line 125
    .line 126
    iget v2, p0, Landroidx/media3/common/v1;->maxAudioBitrate:I

    .line 127
    .line 128
    iget v3, p1, Landroidx/media3/common/v1;->maxAudioBitrate:I

    .line 129
    .line 130
    if-ne v2, v3, :cond_2

    .line 131
    .line 132
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 133
    .line 134
    iget-object v3, p1, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Lf6/m0;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_2

    .line 141
    .line 142
    iget-object v2, p0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 143
    .line 144
    iget-object v3, p1, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 145
    .line 146
    invoke-virtual {v2, v3}, Landroidx/media3/common/t1;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_2

    .line 151
    .line 152
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredTextLanguages:Lf6/m0;

    .line 153
    .line 154
    iget-object v3, p1, Landroidx/media3/common/v1;->preferredTextLanguages:Lf6/m0;

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Lf6/m0;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_2

    .line 161
    .line 162
    iget v2, p0, Landroidx/media3/common/v1;->preferredTextRoleFlags:I

    .line 163
    .line 164
    iget v3, p1, Landroidx/media3/common/v1;->preferredTextRoleFlags:I

    .line 165
    .line 166
    if-ne v2, v3, :cond_2

    .line 167
    .line 168
    iget v2, p0, Landroidx/media3/common/v1;->ignoredTextSelectionFlags:I

    .line 169
    .line 170
    iget v3, p1, Landroidx/media3/common/v1;->ignoredTextSelectionFlags:I

    .line 171
    .line 172
    if-ne v2, v3, :cond_2

    .line 173
    .line 174
    iget-boolean v2, p0, Landroidx/media3/common/v1;->selectUndeterminedTextLanguage:Z

    .line 175
    .line 176
    iget-boolean v3, p1, Landroidx/media3/common/v1;->selectUndeterminedTextLanguage:Z

    .line 177
    .line 178
    if-ne v2, v3, :cond_2

    .line 179
    .line 180
    iget-boolean v2, p0, Landroidx/media3/common/v1;->isPrioritizeImageOverVideoEnabled:Z

    .line 181
    .line 182
    iget-boolean v3, p1, Landroidx/media3/common/v1;->isPrioritizeImageOverVideoEnabled:Z

    .line 183
    .line 184
    if-ne v2, v3, :cond_2

    .line 185
    .line 186
    iget-boolean v2, p0, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    .line 187
    .line 188
    iget-boolean v3, p1, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    .line 189
    .line 190
    if-ne v2, v3, :cond_2

    .line 191
    .line 192
    iget-boolean v2, p0, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 193
    .line 194
    iget-boolean v3, p1, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 195
    .line 196
    if-ne v2, v3, :cond_2

    .line 197
    .line 198
    iget-object v2, p0, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 199
    .line 200
    iget-object v3, p1, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {v2, v3}, Lf6/u;->e(Ljava/util/Map;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_2

    .line 210
    .line 211
    iget-object v2, p0, Landroidx/media3/common/v1;->disabledTrackTypes:Lf6/w0;

    .line 212
    .line 213
    iget-object p1, p1, Landroidx/media3/common/v1;->disabledTrackTypes:Lf6/w0;

    .line 214
    .line 215
    invoke-virtual {v2, p1}, Lf6/w0;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_2

    .line 220
    .line 221
    return v0

    .line 222
    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/common/v1;->maxVideoWidth:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/2addr v0, v1

    .line 7
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoHeight:I

    .line 8
    .line 9
    add-int/2addr v0, v2

    .line 10
    mul-int/2addr v0, v1

    .line 11
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoFrameRate:I

    .line 12
    .line 13
    add-int/2addr v0, v2

    .line 14
    mul-int/2addr v0, v1

    .line 15
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoBitrate:I

    .line 16
    .line 17
    add-int/2addr v0, v2

    .line 18
    mul-int/2addr v0, v1

    .line 19
    iget v2, p0, Landroidx/media3/common/v1;->minVideoWidth:I

    .line 20
    .line 21
    add-int/2addr v0, v2

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget v2, p0, Landroidx/media3/common/v1;->minVideoHeight:I

    .line 24
    .line 25
    add-int/2addr v0, v2

    .line 26
    mul-int/2addr v0, v1

    .line 27
    iget v2, p0, Landroidx/media3/common/v1;->minVideoFrameRate:I

    .line 28
    .line 29
    add-int/2addr v0, v2

    .line 30
    mul-int/2addr v0, v1

    .line 31
    iget v2, p0, Landroidx/media3/common/v1;->minVideoBitrate:I

    .line 32
    .line 33
    add-int/2addr v0, v2

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-boolean v2, p0, Landroidx/media3/common/v1;->viewportOrientationMayChange:Z

    .line 36
    .line 37
    add-int/2addr v0, v2

    .line 38
    mul-int/2addr v0, v1

    .line 39
    iget v2, p0, Landroidx/media3/common/v1;->viewportWidth:I

    .line 40
    .line 41
    add-int/2addr v0, v2

    .line 42
    mul-int/2addr v0, v1

    .line 43
    iget v2, p0, Landroidx/media3/common/v1;->viewportHeight:I

    .line 44
    .line 45
    add-int/2addr v0, v2

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredVideoMimeTypes:Lf6/m0;

    .line 48
    .line 49
    invoke-virtual {v2}, Lf6/m0;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    add-int/2addr v2, v0

    .line 54
    mul-int/2addr v2, v1

    .line 55
    iget v0, p0, Landroidx/media3/common/v1;->preferredVideoRoleFlags:I

    .line 56
    .line 57
    add-int/2addr v2, v0

    .line 58
    mul-int/2addr v2, v1

    .line 59
    iget-object v0, p0, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 60
    .line 61
    invoke-virtual {v0}, Lf6/m0;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/2addr v0, v2

    .line 66
    mul-int/2addr v0, v1

    .line 67
    iget v2, p0, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 68
    .line 69
    add-int/2addr v0, v2

    .line 70
    mul-int/2addr v0, v1

    .line 71
    iget v2, p0, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 72
    .line 73
    add-int/2addr v0, v2

    .line 74
    mul-int/2addr v0, v1

    .line 75
    iget v2, p0, Landroidx/media3/common/v1;->maxAudioBitrate:I

    .line 76
    .line 77
    add-int/2addr v0, v2

    .line 78
    mul-int/2addr v0, v1

    .line 79
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 80
    .line 81
    invoke-virtual {v2}, Lf6/m0;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    add-int/2addr v2, v0

    .line 86
    mul-int/2addr v2, v1

    .line 87
    iget-object v0, p0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroidx/media3/common/t1;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    add-int/2addr v0, v2

    .line 94
    mul-int/2addr v0, v1

    .line 95
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredTextLanguages:Lf6/m0;

    .line 96
    .line 97
    invoke-virtual {v2}, Lf6/m0;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    add-int/2addr v2, v0

    .line 102
    mul-int/2addr v2, v1

    .line 103
    iget v0, p0, Landroidx/media3/common/v1;->preferredTextRoleFlags:I

    .line 104
    .line 105
    add-int/2addr v2, v0

    .line 106
    mul-int/2addr v2, v1

    .line 107
    iget v0, p0, Landroidx/media3/common/v1;->ignoredTextSelectionFlags:I

    .line 108
    .line 109
    add-int/2addr v2, v0

    .line 110
    mul-int/2addr v2, v1

    .line 111
    iget-boolean v0, p0, Landroidx/media3/common/v1;->selectUndeterminedTextLanguage:Z

    .line 112
    .line 113
    add-int/2addr v2, v0

    .line 114
    mul-int/2addr v2, v1

    .line 115
    iget-boolean v0, p0, Landroidx/media3/common/v1;->isPrioritizeImageOverVideoEnabled:Z

    .line 116
    .line 117
    add-int/2addr v2, v0

    .line 118
    mul-int/2addr v2, v1

    .line 119
    iget-boolean v0, p0, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    .line 120
    .line 121
    add-int/2addr v2, v0

    .line 122
    mul-int/2addr v2, v1

    .line 123
    iget-boolean v0, p0, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 124
    .line 125
    add-int/2addr v2, v0

    .line 126
    mul-int/2addr v2, v1

    .line 127
    iget-object v0, p0, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 128
    .line 129
    invoke-virtual {v0}, Lf6/q0;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    add-int/2addr v0, v2

    .line 134
    mul-int/2addr v0, v1

    .line 135
    iget-object v1, p0, Landroidx/media3/common/v1;->disabledTrackTypes:Lf6/w0;

    .line 136
    .line 137
    invoke-virtual {v1}, Lf6/w0;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/2addr v1, v0

    .line 142
    return v1
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 8

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_WIDTH:Ljava/lang/String;

    .line 7
    .line 8
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoWidth:I

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_HEIGHT:Ljava/lang/String;

    .line 14
    .line 15
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoHeight:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_FRAMERATE:Ljava/lang/String;

    .line 21
    .line 22
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoFrameRate:I

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MAX_VIDEO_BITRATE:Ljava/lang/String;

    .line 28
    .line 29
    iget v2, p0, Landroidx/media3/common/v1;->maxVideoBitrate:I

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_WIDTH:Ljava/lang/String;

    .line 35
    .line 36
    iget v2, p0, Landroidx/media3/common/v1;->minVideoWidth:I

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_HEIGHT:Ljava/lang/String;

    .line 42
    .line 43
    iget v2, p0, Landroidx/media3/common/v1;->minVideoHeight:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_FRAMERATE:Ljava/lang/String;

    .line 49
    .line 50
    iget v2, p0, Landroidx/media3/common/v1;->minVideoFrameRate:I

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MIN_VIDEO_BITRATE:Ljava/lang/String;

    .line 56
    .line 57
    iget v2, p0, Landroidx/media3/common/v1;->minVideoBitrate:I

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Landroidx/media3/common/v1;->FIELD_VIEWPORT_WIDTH:Ljava/lang/String;

    .line 63
    .line 64
    iget v2, p0, Landroidx/media3/common/v1;->viewportWidth:I

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sget-object v1, Landroidx/media3/common/v1;->FIELD_VIEWPORT_HEIGHT:Ljava/lang/String;

    .line 70
    .line 71
    iget v2, p0, Landroidx/media3/common/v1;->viewportHeight:I

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    sget-object v1, Landroidx/media3/common/v1;->FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE:Ljava/lang/String;

    .line 77
    .line 78
    iget-boolean v2, p0, Landroidx/media3/common/v1;->viewportOrientationMayChange:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    sget-object v1, Landroidx/media3/common/v1;->FIELD_PREFERRED_VIDEO_MIMETYPES:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredVideoMimeTypes:Lf6/m0;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    new-array v4, v3, [Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v2, v4}, Lf6/h0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, [Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object v1, Landroidx/media3/common/v1;->FIELD_PREFERRED_VIDEO_ROLE_FLAGS:Ljava/lang/String;

    .line 100
    .line 101
    iget v2, p0, Landroidx/media3/common/v1;->preferredVideoRoleFlags:I

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    sget-object v1, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_LANGUAGES:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 109
    .line 110
    new-array v4, v3, [Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Lf6/h0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, [Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sget-object v1, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_ROLE_FLAGS:Ljava/lang/String;

    .line 122
    .line 123
    iget v2, p0, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 124
    .line 125
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MAX_AUDIO_CHANNEL_COUNT:Ljava/lang/String;

    .line 129
    .line 130
    iget v2, p0, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 131
    .line 132
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    sget-object v1, Landroidx/media3/common/v1;->FIELD_MAX_AUDIO_BITRATE:Ljava/lang/String;

    .line 136
    .line 137
    iget v2, p0, Landroidx/media3/common/v1;->maxAudioBitrate:I

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    sget-object v1, Landroidx/media3/common/v1;->FIELD_PREFERRED_AUDIO_MIME_TYPES:Ljava/lang/String;

    .line 143
    .line 144
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 145
    .line 146
    new-array v4, v3, [Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Lf6/h0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, [Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    sget-object v1, Landroidx/media3/common/v1;->FIELD_PREFERRED_TEXT_LANGUAGES:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v2, p0, Landroidx/media3/common/v1;->preferredTextLanguages:Lf6/m0;

    .line 160
    .line 161
    new-array v3, v3, [Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v2, v3}, Lf6/h0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, [Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    sget-object v1, Landroidx/media3/common/v1;->FIELD_PREFERRED_TEXT_ROLE_FLAGS:Ljava/lang/String;

    .line 173
    .line 174
    iget v2, p0, Landroidx/media3/common/v1;->preferredTextRoleFlags:I

    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 177
    .line 178
    .line 179
    sget-object v1, Landroidx/media3/common/v1;->FIELD_IGNORED_TEXT_SELECTION_FLAGS:Ljava/lang/String;

    .line 180
    .line 181
    iget v2, p0, Landroidx/media3/common/v1;->ignoredTextSelectionFlags:I

    .line 182
    .line 183
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    sget-object v1, Landroidx/media3/common/v1;->FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE:Ljava/lang/String;

    .line 187
    .line 188
    iget-boolean v2, p0, Landroidx/media3/common/v1;->selectUndeterminedTextLanguage:Z

    .line 189
    .line 190
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 191
    .line 192
    .line 193
    sget-object v1, Landroidx/media3/common/v1;->FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE:Ljava/lang/String;

    .line 194
    .line 195
    iget-object v2, p0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 196
    .line 197
    iget v2, v2, Landroidx/media3/common/t1;->a:I

    .line 198
    .line 199
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 200
    .line 201
    .line 202
    sget-object v1, Landroidx/media3/common/v1;->FIELD_IS_GAPLESS_SUPPORT_REQUIRED:Ljava/lang/String;

    .line 203
    .line 204
    iget-object v2, p0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 205
    .line 206
    iget-boolean v2, v2, Landroidx/media3/common/t1;->b:Z

    .line 207
    .line 208
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 209
    .line 210
    .line 211
    sget-object v1, Landroidx/media3/common/v1;->FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v2, p0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 214
    .line 215
    iget-boolean v2, v2, Landroidx/media3/common/t1;->c:Z

    .line 216
    .line 217
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 218
    .line 219
    .line 220
    sget-object v1, Landroidx/media3/common/v1;->FIELD_AUDIO_OFFLOAD_PREFERENCES:Ljava/lang/String;

    .line 221
    .line 222
    iget-object v2, p0, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v3, Landroid/os/Bundle;

    .line 228
    .line 229
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 230
    .line 231
    .line 232
    sget-object v4, Landroidx/media3/common/t1;->e:Ljava/lang/String;

    .line 233
    .line 234
    iget v5, v2, Landroidx/media3/common/t1;->a:I

    .line 235
    .line 236
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 237
    .line 238
    .line 239
    sget-object v4, Landroidx/media3/common/t1;->f:Ljava/lang/String;

    .line 240
    .line 241
    iget-boolean v5, v2, Landroidx/media3/common/t1;->b:Z

    .line 242
    .line 243
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 244
    .line 245
    .line 246
    sget-object v4, Landroidx/media3/common/t1;->g:Ljava/lang/String;

    .line 247
    .line 248
    iget-boolean v2, v2, Landroidx/media3/common/t1;->c:Z

    .line 249
    .line 250
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 254
    .line 255
    .line 256
    sget-object v1, Landroidx/media3/common/v1;->FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED:Ljava/lang/String;

    .line 257
    .line 258
    iget-boolean v2, p0, Landroidx/media3/common/v1;->isPrioritizeImageOverVideoEnabled:Z

    .line 259
    .line 260
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 261
    .line 262
    .line 263
    sget-object v1, Landroidx/media3/common/v1;->FIELD_FORCE_LOWEST_BITRATE:Ljava/lang/String;

    .line 264
    .line 265
    iget-boolean v2, p0, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    .line 266
    .line 267
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 268
    .line 269
    .line 270
    sget-object v1, Landroidx/media3/common/v1;->FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE:Ljava/lang/String;

    .line 271
    .line 272
    iget-boolean v2, p0, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 273
    .line 274
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 275
    .line 276
    .line 277
    sget-object v1, Landroidx/media3/common/v1;->FIELD_SELECTION_OVERRIDES:Ljava/lang/String;

    .line 278
    .line 279
    iget-object v2, p0, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 280
    .line 281
    invoke-virtual {v2}, Lf6/q0;->d()Lf6/h0;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    new-instance v3, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    if-eqz v4, :cond_0

    .line 303
    .line 304
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    check-cast v4, Landroidx/media3/common/r1;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    new-instance v5, Landroid/os/Bundle;

    .line 314
    .line 315
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 316
    .line 317
    .line 318
    sget-object v6, Landroidx/media3/common/r1;->c:Ljava/lang/String;

    .line 319
    .line 320
    iget-object v7, v4, Landroidx/media3/common/r1;->a:Landroidx/media3/common/q1;

    .line 321
    .line 322
    invoke-virtual {v7}, Landroidx/media3/common/q1;->d()Landroid/os/Bundle;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 327
    .line 328
    .line 329
    sget-object v6, Landroidx/media3/common/r1;->d:Ljava/lang/String;

    .line 330
    .line 331
    iget-object v4, v4, Landroidx/media3/common/r1;->b:Lf6/m0;

    .line 332
    .line 333
    invoke-static {v4}, Lcom/bumptech/glide/d;->p0(Ljava/util/Collection;)[I

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    goto :goto_0

    .line 344
    :cond_0
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 345
    .line 346
    .line 347
    sget-object v1, Landroidx/media3/common/v1;->FIELD_DISABLED_TRACK_TYPE:Ljava/lang/String;

    .line 348
    .line 349
    iget-object v2, p0, Landroidx/media3/common/v1;->disabledTrackTypes:Lf6/w0;

    .line 350
    .line 351
    invoke-static {v2}, Lcom/bumptech/glide/d;->p0(Ljava/util/Collection;)[I

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 356
    .line 357
    .line 358
    return-object v0
.end method
