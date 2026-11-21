.class public final Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;,
        Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$DeltaUpdateException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
        "Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;",
        ">;"
    }
.end annotation


# static fields
.field private static final ATTR_CLOSED_CAPTIONS_NONE:Ljava/lang/String; = "CLOSED-CAPTIONS=NONE"

.field private static final BOOLEAN_FALSE:Ljava/lang/String; = "NO"

.field private static final BOOLEAN_TRUE:Ljava/lang/String; = "YES"

.field private static final KEYFORMAT_IDENTITY:Ljava/lang/String; = "identity"

.field private static final KEYFORMAT_PLAYREADY:Ljava/lang/String; = "com.microsoft.playready"

.field private static final KEYFORMAT_WIDEVINE_PSSH_BINARY:Ljava/lang/String; = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

.field private static final KEYFORMAT_WIDEVINE_PSSH_JSON:Ljava/lang/String; = "com.widevine"

.field private static final LOG_TAG:Ljava/lang/String; = "HlsPlaylistParser"

.field private static final METHOD_AES_128:Ljava/lang/String; = "AES-128"

.field private static final METHOD_NONE:Ljava/lang/String; = "NONE"

.field private static final METHOD_SAMPLE_AES:Ljava/lang/String; = "SAMPLE-AES"

.field private static final METHOD_SAMPLE_AES_CENC:Ljava/lang/String; = "SAMPLE-AES-CENC"

.field private static final METHOD_SAMPLE_AES_CTR:Ljava/lang/String; = "SAMPLE-AES-CTR"

.field private static final PLAYLIST_HEADER:Ljava/lang/String; = "#EXTM3U"

.field private static final REGEX_ATTR_BYTERANGE:Ljava/util/regex/Pattern;

.field private static final REGEX_ATTR_DURATION:Ljava/util/regex/Pattern;

.field private static final REGEX_AUDIO:Ljava/util/regex/Pattern;

.field private static final REGEX_AUTOSELECT:Ljava/util/regex/Pattern;

.field private static final REGEX_AVERAGE_BANDWIDTH:Ljava/util/regex/Pattern;

.field private static final REGEX_BANDWIDTH:Ljava/util/regex/Pattern;

.field private static final REGEX_BYTERANGE:Ljava/util/regex/Pattern;

.field private static final REGEX_BYTERANGE_LENGTH:Ljava/util/regex/Pattern;

.field private static final REGEX_BYTERANGE_START:Ljava/util/regex/Pattern;

.field private static final REGEX_CAN_BLOCK_RELOAD:Ljava/util/regex/Pattern;

.field private static final REGEX_CAN_SKIP_DATE_RANGES:Ljava/util/regex/Pattern;

.field private static final REGEX_CAN_SKIP_UNTIL:Ljava/util/regex/Pattern;

.field private static final REGEX_CHANNELS:Ljava/util/regex/Pattern;

.field private static final REGEX_CHARACTERISTICS:Ljava/util/regex/Pattern;

.field private static final REGEX_CLOSED_CAPTIONS:Ljava/util/regex/Pattern;

.field private static final REGEX_CODECS:Ljava/util/regex/Pattern;

.field private static final REGEX_DEFAULT:Ljava/util/regex/Pattern;

.field private static final REGEX_FORCED:Ljava/util/regex/Pattern;

.field private static final REGEX_FRAME_RATE:Ljava/util/regex/Pattern;

.field private static final REGEX_GAP:Ljava/util/regex/Pattern;

.field private static final REGEX_GROUP_ID:Ljava/util/regex/Pattern;

.field private static final REGEX_HOLD_BACK:Ljava/util/regex/Pattern;

.field private static final REGEX_IMPORT:Ljava/util/regex/Pattern;

.field private static final REGEX_INDEPENDENT:Ljava/util/regex/Pattern;

.field private static final REGEX_INSTREAM_ID:Ljava/util/regex/Pattern;

.field private static final REGEX_IV:Ljava/util/regex/Pattern;

.field private static final REGEX_KEYFORMAT:Ljava/util/regex/Pattern;

.field private static final REGEX_KEYFORMATVERSIONS:Ljava/util/regex/Pattern;

.field private static final REGEX_LANGUAGE:Ljava/util/regex/Pattern;

.field private static final REGEX_LAST_MSN:Ljava/util/regex/Pattern;

.field private static final REGEX_LAST_PART:Ljava/util/regex/Pattern;

.field private static final REGEX_MEDIA_DURATION:Ljava/util/regex/Pattern;

.field private static final REGEX_MEDIA_SEQUENCE:Ljava/util/regex/Pattern;

.field private static final REGEX_MEDIA_TITLE:Ljava/util/regex/Pattern;

.field private static final REGEX_METHOD:Ljava/util/regex/Pattern;

.field private static final REGEX_NAME:Ljava/util/regex/Pattern;

.field private static final REGEX_PART_HOLD_BACK:Ljava/util/regex/Pattern;

.field private static final REGEX_PART_TARGET_DURATION:Ljava/util/regex/Pattern;

.field private static final REGEX_PLAYLIST_TYPE:Ljava/util/regex/Pattern;

.field private static final REGEX_PRECISE:Ljava/util/regex/Pattern;

.field private static final REGEX_PRELOAD_HINT_TYPE:Ljava/util/regex/Pattern;

.field private static final REGEX_RESOLUTION:Ljava/util/regex/Pattern;

.field private static final REGEX_SKIPPED_SEGMENTS:Ljava/util/regex/Pattern;

.field private static final REGEX_SUBTITLES:Ljava/util/regex/Pattern;

.field private static final REGEX_TARGET_DURATION:Ljava/util/regex/Pattern;

.field private static final REGEX_TIME_OFFSET:Ljava/util/regex/Pattern;

.field private static final REGEX_TYPE:Ljava/util/regex/Pattern;

.field private static final REGEX_URI:Ljava/util/regex/Pattern;

.field private static final REGEX_VALUE:Ljava/util/regex/Pattern;

.field private static final REGEX_VARIABLE_REFERENCE:Ljava/util/regex/Pattern;

.field private static final REGEX_VERSION:Ljava/util/regex/Pattern;

.field private static final REGEX_VIDEO:Ljava/util/regex/Pattern;

.field private static final TAG_BYTERANGE:Ljava/lang/String; = "#EXT-X-BYTERANGE"

.field private static final TAG_DEFINE:Ljava/lang/String; = "#EXT-X-DEFINE"

.field private static final TAG_DISCONTINUITY:Ljava/lang/String; = "#EXT-X-DISCONTINUITY"

.field private static final TAG_DISCONTINUITY_SEQUENCE:Ljava/lang/String; = "#EXT-X-DISCONTINUITY-SEQUENCE"

.field private static final TAG_ENDLIST:Ljava/lang/String; = "#EXT-X-ENDLIST"

.field private static final TAG_GAP:Ljava/lang/String; = "#EXT-X-GAP"

.field private static final TAG_IFRAME:Ljava/lang/String; = "#EXT-X-I-FRAMES-ONLY"

.field private static final TAG_INDEPENDENT_SEGMENTS:Ljava/lang/String; = "#EXT-X-INDEPENDENT-SEGMENTS"

.field private static final TAG_INIT_SEGMENT:Ljava/lang/String; = "#EXT-X-MAP"

.field private static final TAG_I_FRAME_STREAM_INF:Ljava/lang/String; = "#EXT-X-I-FRAME-STREAM-INF"

.field private static final TAG_KEY:Ljava/lang/String; = "#EXT-X-KEY"

.field private static final TAG_MEDIA:Ljava/lang/String; = "#EXT-X-MEDIA"

.field private static final TAG_MEDIA_DURATION:Ljava/lang/String; = "#EXTINF"

.field private static final TAG_MEDIA_SEQUENCE:Ljava/lang/String; = "#EXT-X-MEDIA-SEQUENCE"

.field private static final TAG_PART:Ljava/lang/String; = "#EXT-X-PART"

.field private static final TAG_PART_INF:Ljava/lang/String; = "#EXT-X-PART-INF"

.field private static final TAG_PLAYLIST_TYPE:Ljava/lang/String; = "#EXT-X-PLAYLIST-TYPE"

.field private static final TAG_PREFIX:Ljava/lang/String; = "#EXT"

.field private static final TAG_PRELOAD_HINT:Ljava/lang/String; = "#EXT-X-PRELOAD-HINT"

.field private static final TAG_PROGRAM_DATE_TIME:Ljava/lang/String; = "#EXT-X-PROGRAM-DATE-TIME"

.field private static final TAG_RENDITION_REPORT:Ljava/lang/String; = "#EXT-X-RENDITION-REPORT"

.field private static final TAG_SERVER_CONTROL:Ljava/lang/String; = "#EXT-X-SERVER-CONTROL"

.field private static final TAG_SESSION_KEY:Ljava/lang/String; = "#EXT-X-SESSION-KEY"

.field private static final TAG_SKIP:Ljava/lang/String; = "#EXT-X-SKIP"

.field private static final TAG_START:Ljava/lang/String; = "#EXT-X-START"

.field private static final TAG_STREAM_INF:Ljava/lang/String; = "#EXT-X-STREAM-INF"

.field private static final TAG_TARGET_DURATION:Ljava/lang/String; = "#EXT-X-TARGETDURATION"

.field private static final TAG_VERSION:Ljava/lang/String; = "#EXT-X-VERSION"

.field private static final TYPE_AUDIO:Ljava/lang/String; = "AUDIO"

.field private static final TYPE_CLOSED_CAPTIONS:Ljava/lang/String; = "CLOSED-CAPTIONS"

.field private static final TYPE_MAP:Ljava/lang/String; = "MAP"

.field private static final TYPE_PART:Ljava/lang/String; = "PART"

.field private static final TYPE_SUBTITLES:Ljava/lang/String; = "SUBTITLES"

.field private static final TYPE_VIDEO:Ljava/lang/String; = "VIDEO"


# instance fields
.field private final multivariantPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

.field private final previousMediaPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_AVERAGE_BANDWIDTH:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "VIDEO=\"(.+?)\""

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VIDEO:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "AUDIO=\"(.+?)\""

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_AUDIO:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "SUBTITLES=\"(.+?)\""

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_SUBTITLES:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, "CLOSED-CAPTIONS=\"(.+?)\""

    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CLOSED_CAPTIONS:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BANDWIDTH:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    const-string v0, "CHANNELS=\"(.+?)\""

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CHANNELS:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    const-string v0, "CODECS=\"(.+?)\""

    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CODECS:Ljava/util/regex/Pattern;

    .line 64
    .line 65
    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_RESOLUTION:Ljava/util/regex/Pattern;

    .line 72
    .line 73
    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_FRAME_RATE:Ljava/util/regex/Pattern;

    .line 80
    .line 81
    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_TARGET_DURATION:Ljava/util/regex/Pattern;

    .line 88
    .line 89
    const-string v0, "DURATION=([\\d\\.]+)\\b"

    .line 90
    .line 91
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_ATTR_DURATION:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    .line 98
    .line 99
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PART_TARGET_DURATION:Ljava/util/regex/Pattern;

    .line 104
    .line 105
    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    .line 106
    .line 107
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VERSION:Ljava/util/regex/Pattern;

    .line 112
    .line 113
    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    .line 114
    .line 115
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PLAYLIST_TYPE:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    .line 122
    .line 123
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CAN_SKIP_UNTIL:Ljava/util/regex/Pattern;

    .line 128
    .line 129
    const-string v0, "CAN-SKIP-DATERANGES"

    .line 130
    .line 131
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CAN_SKIP_DATE_RANGES:Ljava/util/regex/Pattern;

    .line 136
    .line 137
    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    .line 138
    .line 139
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_SKIPPED_SEGMENTS:Ljava/util/regex/Pattern;

    .line 144
    .line 145
    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    .line 146
    .line 147
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_HOLD_BACK:Ljava/util/regex/Pattern;

    .line 152
    .line 153
    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    .line 154
    .line 155
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PART_HOLD_BACK:Ljava/util/regex/Pattern;

    .line 160
    .line 161
    const-string v0, "CAN-BLOCK-RELOAD"

    .line 162
    .line 163
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CAN_BLOCK_RELOAD:Ljava/util/regex/Pattern;

    .line 168
    .line 169
    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    .line 170
    .line 171
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_MEDIA_SEQUENCE:Ljava/util/regex/Pattern;

    .line 176
    .line 177
    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    .line 178
    .line 179
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_MEDIA_DURATION:Ljava/util/regex/Pattern;

    .line 184
    .line 185
    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    .line 186
    .line 187
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_MEDIA_TITLE:Ljava/util/regex/Pattern;

    .line 192
    .line 193
    const-string v0, "LAST-MSN=(\\d+)\\b"

    .line 194
    .line 195
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_LAST_MSN:Ljava/util/regex/Pattern;

    .line 200
    .line 201
    const-string v0, "LAST-PART=(\\d+)\\b"

    .line 202
    .line 203
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_LAST_PART:Ljava/util/regex/Pattern;

    .line 208
    .line 209
    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 210
    .line 211
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_TIME_OFFSET:Ljava/util/regex/Pattern;

    .line 216
    .line 217
    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    .line 218
    .line 219
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BYTERANGE:Ljava/util/regex/Pattern;

    .line 224
    .line 225
    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    .line 226
    .line 227
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_ATTR_BYTERANGE:Ljava/util/regex/Pattern;

    .line 232
    .line 233
    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    .line 234
    .line 235
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BYTERANGE_START:Ljava/util/regex/Pattern;

    .line 240
    .line 241
    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    .line 242
    .line 243
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BYTERANGE_LENGTH:Ljava/util/regex/Pattern;

    .line 248
    .line 249
    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    .line 250
    .line 251
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_METHOD:Ljava/util/regex/Pattern;

    .line 256
    .line 257
    const-string v0, "KEYFORMAT=\"(.+?)\""

    .line 258
    .line 259
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_KEYFORMAT:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    const-string v0, "KEYFORMATVERSIONS=\"(.+?)\""

    .line 266
    .line 267
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_KEYFORMATVERSIONS:Ljava/util/regex/Pattern;

    .line 272
    .line 273
    const-string v0, "URI=\"(.+?)\""

    .line 274
    .line 275
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 280
    .line 281
    const-string v0, "IV=([^,.*]+)"

    .line 282
    .line 283
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_IV:Ljava/util/regex/Pattern;

    .line 288
    .line 289
    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    .line 290
    .line 291
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_TYPE:Ljava/util/regex/Pattern;

    .line 296
    .line 297
    const-string v0, "TYPE=(PART|MAP)"

    .line 298
    .line 299
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PRELOAD_HINT_TYPE:Ljava/util/regex/Pattern;

    .line 304
    .line 305
    const-string v0, "LANGUAGE=\"(.+?)\""

    .line 306
    .line 307
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_LANGUAGE:Ljava/util/regex/Pattern;

    .line 312
    .line 313
    const-string v0, "NAME=\"(.+?)\""

    .line 314
    .line 315
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_NAME:Ljava/util/regex/Pattern;

    .line 320
    .line 321
    const-string v0, "GROUP-ID=\"(.+?)\""

    .line 322
    .line 323
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_GROUP_ID:Ljava/util/regex/Pattern;

    .line 328
    .line 329
    const-string v0, "CHARACTERISTICS=\"(.+?)\""

    .line 330
    .line 331
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CHARACTERISTICS:Ljava/util/regex/Pattern;

    .line 336
    .line 337
    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    .line 338
    .line 339
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_INSTREAM_ID:Ljava/util/regex/Pattern;

    .line 344
    .line 345
    const-string v0, "AUTOSELECT"

    .line 346
    .line 347
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_AUTOSELECT:Ljava/util/regex/Pattern;

    .line 352
    .line 353
    const-string v0, "DEFAULT"

    .line 354
    .line 355
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_DEFAULT:Ljava/util/regex/Pattern;

    .line 360
    .line 361
    const-string v0, "FORCED"

    .line 362
    .line 363
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_FORCED:Ljava/util/regex/Pattern;

    .line 368
    .line 369
    const-string v0, "INDEPENDENT"

    .line 370
    .line 371
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_INDEPENDENT:Ljava/util/regex/Pattern;

    .line 376
    .line 377
    const-string v0, "GAP"

    .line 378
    .line 379
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_GAP:Ljava/util/regex/Pattern;

    .line 384
    .line 385
    const-string v0, "PRECISE"

    .line 386
    .line 387
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PRECISE:Ljava/util/regex/Pattern;

    .line 392
    .line 393
    const-string v0, "VALUE=\"(.+?)\""

    .line 394
    .line 395
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VALUE:Ljava/util/regex/Pattern;

    .line 400
    .line 401
    const-string v0, "IMPORT=\"(.+?)\""

    .line 402
    .line 403
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_IMPORT:Ljava/util/regex/Pattern;

    .line 408
    .line 409
    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    .line 410
    .line 411
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sput-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VARIABLE_REFERENCE:Ljava/util/regex/Pattern;

    .line 416
    .line 417
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->EMPTY:Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;-><init>(Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->multivariantPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->previousMediaPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;

    return-void
.end method

.method private static checkPlaylistHeader(Ljava/io/BufferedReader;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xef

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0xbb

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0xbf

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    return v2

    .line 33
    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 34
    invoke-static {p0, v1, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->skipIgnorableWhitespace(Ljava/io/BufferedReader;ZI)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    move v1, v2

    .line 39
    :goto_2
    const/4 v3, 0x7

    .line 40
    if-ge v1, v3, :cond_4

    .line 41
    .line 42
    const-string v3, "#EXTM3U"

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eq v0, v3, :cond_3

    .line 49
    .line 50
    return v2

    .line 51
    :cond_3
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    invoke-static {p0, v2, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->skipIgnorableWhitespace(Ljava/io/BufferedReader;ZI)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p0}, Lh1/i0;->P(I)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0
.end method

.method private static compileBooleanAttrPattern(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, "=(NO|YES)"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static getPlaylistProtectionSchemes(Ljava/lang/String;[Landroidx/media3/common/r;)Landroidx/media3/common/s;
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Landroidx/media3/common/r;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    new-instance v3, Landroidx/media3/common/r;

    .line 11
    .line 12
    iget-object v4, v2, Landroidx/media3/common/r;->k:Ljava/util/UUID;

    .line 13
    .line 14
    iget-object v5, v2, Landroidx/media3/common/r;->l:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, v2, Landroidx/media3/common/r;->m:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-direct {v3, v4, v5, v2, v6}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 20
    .line 21
    .line 22
    aput-object v3, v0, v1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Landroidx/media3/common/s;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {p1, p0, v1, v0}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method private static getSegmentEncryptionIV(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    if-eqz p3, :cond_1

    .line 6
    .line 7
    return-object p3

    .line 8
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static getVariantWithAudioGroup(Ljava/util/ArrayList;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 13
    .line 14
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->audioGroupId:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private static getVariantWithSubtitleGroup(Ljava/util/ArrayList;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 13
    .line 14
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->subtitleGroupId:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private static getVariantWithVideoGroup(Ljava/util/ArrayList;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 13
    .line 14
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->videoGroupId:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private static parseDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static parseDrmSchemeData(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroidx/media3/common/r;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/media3/common/r;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_KEYFORMATVERSIONS:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    invoke-static {p0, v0, v1, p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v4, 0x2c

    .line 17
    .line 18
    const-string v5, "video/mp4"

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object p1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Landroidx/media3/common/r;

    .line 30
    .line 31
    sget-object p2, Landroidx/media3/common/k;->d:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {p1, p2, v6, v5, p0}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    const-string v2, "com.widevine"

    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    new-instance p1, Landroidx/media3/common/r;

    .line 58
    .line 59
    sget-object p2, Landroidx/media3/common/k;->d:Ljava/util/UUID;

    .line 60
    .line 61
    sget v0, Lh1/i0;->a:I

    .line 62
    .line 63
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v0, "hls"

    .line 70
    .line 71
    invoke-direct {p1, p2, v6, v0, p0}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_1
    const-string v2, "com.microsoft.playready"

    .line 76
    .line 77
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    sget-object p1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 90
    .line 91
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    sget-object p1, Landroidx/media3/common/k;->e:Ljava/util/UUID;

    .line 108
    .line 109
    invoke-static {p1, v6, p0}, Lh2/p;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    new-instance p2, Landroidx/media3/common/r;

    .line 114
    .line 115
    invoke-direct {p2, p1, v6, v5, p0}, Landroidx/media3/common/r;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 116
    .line 117
    .line 118
    return-object p2

    .line 119
    :cond_2
    return-object v6
.end method

.method private static parseEncryptionScheme(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "SAMPLE-AES-CENC"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "SAMPLE-AES-CTR"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "cbcs"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    :goto_0
    const-string p0, "cenc"

    .line 22
    .line 23
    return-object p0
.end method

.method private static parseIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)I
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static parseLongAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static parseMediaPlaylist(Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;
    .locals 89

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;->hasIndependentSegments:Z

    .line 6
    .line 7
    new-instance v3, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v5, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v6, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v7, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v8, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v9, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$ServerControl;

    .line 38
    .line 39
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/16 v17, 0x0

    .line 45
    .line 46
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/4 v12, 0x0

    .line 52
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-direct/range {v9 .. v17}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$ServerControl;-><init>(JZJJZ)V

    .line 58
    .line 59
    .line 60
    new-instance v10, Ljava/util/TreeMap;

    .line 61
    .line 62
    invoke-direct {v10}, Ljava/util/TreeMap;-><init>()V

    .line 63
    .line 64
    .line 65
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    const-wide/16 v18, 0x0

    .line 71
    .line 72
    const-string v14, ""

    .line 73
    .line 74
    move-object/from16 v20, v14

    .line 75
    .line 76
    move/from16 v23, v2

    .line 77
    .line 78
    move-wide/from16 v42, v16

    .line 79
    .line 80
    move-wide/from16 v44, v42

    .line 81
    .line 82
    move-wide/from16 v77, v44

    .line 83
    .line 84
    move-wide/from16 v27, v18

    .line 85
    .line 86
    move-wide/from16 v35, v27

    .line 87
    .line 88
    move-wide/from16 v48, v35

    .line 89
    .line 90
    move-wide/from16 v56, v48

    .line 91
    .line 92
    move-wide/from16 v70, v56

    .line 93
    .line 94
    move-wide/from16 v73, v70

    .line 95
    .line 96
    move-wide/from16 v75, v73

    .line 97
    .line 98
    move-wide/from16 v79, v75

    .line 99
    .line 100
    move-object/from16 v25, v20

    .line 101
    .line 102
    move-object/from16 v37, v25

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    const/4 v13, 0x0

    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const/16 v22, 0x0

    .line 111
    .line 112
    const/16 v26, 0x0

    .line 113
    .line 114
    const/16 v34, 0x0

    .line 115
    .line 116
    const-wide/16 v38, -0x1

    .line 117
    .line 118
    const/16 v40, 0x0

    .line 119
    .line 120
    const/16 v46, 0x0

    .line 121
    .line 122
    const/16 v47, 0x0

    .line 123
    .line 124
    const/16 v52, 0x0

    .line 125
    .line 126
    const/16 v55, 0x0

    .line 127
    .line 128
    const/16 v59, 0x0

    .line 129
    .line 130
    const-wide/16 v68, -0x1

    .line 131
    .line 132
    const/16 v72, 0x0

    .line 133
    .line 134
    move-wide/from16 v19, v77

    .line 135
    .line 136
    move-wide/from16 v16, v79

    .line 137
    .line 138
    const/16 v18, 0x1

    .line 139
    .line 140
    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v29

    .line 144
    if-eqz v29, :cond_41

    .line 145
    .line 146
    invoke-virtual/range {p2 .. p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;->next()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    const-string v11, "#EXT"

    .line 151
    .line 152
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    if-eqz v11, :cond_1

    .line 157
    .line 158
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :cond_1
    const-string v11, "#EXT-X-PLAYLIST-TYPE"

    .line 162
    .line 163
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    if-eqz v11, :cond_3

    .line 168
    .line 169
    sget-object v11, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PLAYLIST_TYPE:Ljava/util/regex/Pattern;

    .line 170
    .line 171
    invoke-static {v12, v11, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    const-string v12, "VOD"

    .line 176
    .line 177
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    if-eqz v12, :cond_2

    .line 182
    .line 183
    const/16 v21, 0x1

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_2
    const-string v12, "EVENT"

    .line 187
    .line 188
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_0

    .line 193
    .line 194
    const/4 v11, 0x2

    .line 195
    move/from16 v21, v11

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_3
    const-string v11, "#EXT-X-I-FRAMES-ONLY"

    .line 199
    .line 200
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    if-eqz v11, :cond_4

    .line 205
    .line 206
    const/16 v72, 0x1

    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_4
    const-string v11, "#EXT-X-START"

    .line 210
    .line 211
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    const-wide v30, 0x412e848000000000L    # 1000000.0

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    if-eqz v11, :cond_5

    .line 221
    .line 222
    sget-object v2, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_TIME_OFFSET:Ljava/util/regex/Pattern;

    .line 223
    .line 224
    invoke-static {v12, v2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 225
    .line 226
    .line 227
    move-result-wide v32

    .line 228
    move-object v11, v8

    .line 229
    move-object/from16 v83, v9

    .line 230
    .line 231
    mul-double v8, v32, v30

    .line 232
    .line 233
    double-to-long v8, v8

    .line 234
    sget-object v2, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PRECISE:Ljava/util/regex/Pattern;

    .line 235
    .line 236
    move-wide/from16 v29, v8

    .line 237
    .line 238
    const/4 v8, 0x0

    .line 239
    invoke-static {v12, v2, v8}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    move-object v8, v11

    .line 244
    move-wide/from16 v42, v29

    .line 245
    .line 246
    :goto_1
    move-object/from16 v9, v83

    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_5
    move-object v11, v8

    .line 250
    move-object/from16 v83, v9

    .line 251
    .line 252
    const-string v8, "#EXT-X-SERVER-CONTROL"

    .line 253
    .line 254
    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    if-eqz v8, :cond_6

    .line 259
    .line 260
    invoke-static {v12}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseServerControl(Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$ServerControl;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    move-object v8, v11

    .line 265
    goto :goto_0

    .line 266
    :cond_6
    const-string v8, "#EXT-X-PART-INF"

    .line 267
    .line 268
    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    if-eqz v8, :cond_7

    .line 273
    .line 274
    sget-object v8, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PART_TARGET_DURATION:Ljava/util/regex/Pattern;

    .line 275
    .line 276
    invoke-static {v12, v8}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 277
    .line 278
    .line 279
    move-result-wide v8

    .line 280
    mul-double v8, v8, v30

    .line 281
    .line 282
    double-to-long v8, v8

    .line 283
    move-wide/from16 v44, v8

    .line 284
    .line 285
    move-object v8, v11

    .line 286
    goto :goto_1

    .line 287
    :cond_7
    const-string v8, "#EXT-X-MAP"

    .line 288
    .line 289
    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    const-string v9, "@"

    .line 294
    .line 295
    if-eqz v8, :cond_d

    .line 296
    .line 297
    sget-object v8, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 298
    .line 299
    invoke-static {v12, v8, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    move/from16 v84, v2

    .line 304
    .line 305
    sget-object v2, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_ATTR_BYTERANGE:Ljava/util/regex/Pattern;

    .line 306
    .line 307
    invoke-static {v12, v2, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    if-eqz v2, :cond_8

    .line 312
    .line 313
    sget v12, Lh1/i0;->a:I

    .line 314
    .line 315
    const/4 v12, -0x1

    .line 316
    invoke-virtual {v2, v9, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    const/16 v82, 0x0

    .line 321
    .line 322
    aget-object v9, v2, v82

    .line 323
    .line 324
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 325
    .line 326
    .line 327
    move-result-wide v38

    .line 328
    array-length v9, v2

    .line 329
    const/4 v12, 0x1

    .line 330
    if-le v9, v12, :cond_8

    .line 331
    .line 332
    aget-object v2, v2, v12

    .line 333
    .line 334
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 335
    .line 336
    .line 337
    move-result-wide v27

    .line 338
    :cond_8
    move-wide/from16 v31, v38

    .line 339
    .line 340
    cmp-long v2, v31, v68

    .line 341
    .line 342
    if-nez v2, :cond_9

    .line 343
    .line 344
    move-wide/from16 v29, v79

    .line 345
    .line 346
    goto :goto_2

    .line 347
    :cond_9
    move-wide/from16 v29, v27

    .line 348
    .line 349
    :goto_2
    if-eqz v59, :cond_a

    .line 350
    .line 351
    if-eqz v34, :cond_b

    .line 352
    .line 353
    :cond_a
    const/4 v9, 0x0

    .line 354
    goto :goto_3

    .line 355
    :cond_b
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    .line 356
    .line 357
    const/4 v9, 0x0

    .line 358
    invoke-static {v0, v9}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    throw v0

    .line 363
    :goto_3
    new-instance v27, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 364
    .line 365
    move-object/from16 v28, v8

    .line 366
    .line 367
    move-object/from16 v33, v59

    .line 368
    .line 369
    invoke-direct/range {v27 .. v34}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    move-object/from16 v8, v34

    .line 373
    .line 374
    if-eqz v2, :cond_c

    .line 375
    .line 376
    add-long v29, v29, v31

    .line 377
    .line 378
    :cond_c
    move-object/from16 v34, v8

    .line 379
    .line 380
    move-object v8, v11

    .line 381
    move-object/from16 v52, v27

    .line 382
    .line 383
    move-wide/from16 v27, v29

    .line 384
    .line 385
    move-wide/from16 v38, v68

    .line 386
    .line 387
    move-object/from16 v9, v83

    .line 388
    .line 389
    move/from16 v2, v84

    .line 390
    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_d
    move/from16 v84, v2

    .line 394
    .line 395
    move-object/from16 v86, v11

    .line 396
    .line 397
    move-object/from16 v8, v34

    .line 398
    .line 399
    move-object/from16 v2, v59

    .line 400
    .line 401
    const/16 v85, 0x0

    .line 402
    .line 403
    const-string v11, "#EXT-X-TARGETDURATION"

    .line 404
    .line 405
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 406
    .line 407
    .line 408
    move-result v11

    .line 409
    if-eqz v11, :cond_e

    .line 410
    .line 411
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_TARGET_DURATION:Ljava/util/regex/Pattern;

    .line 412
    .line 413
    invoke-static {v12, v9}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    .line 414
    .line 415
    .line 416
    move-result v9

    .line 417
    int-to-long v11, v9

    .line 418
    const-wide/32 v19, 0xf4240

    .line 419
    .line 420
    .line 421
    mul-long v19, v19, v11

    .line 422
    .line 423
    :goto_4
    move-object/from16 v59, v2

    .line 424
    .line 425
    move-object/from16 v34, v8

    .line 426
    .line 427
    :goto_5
    move-object/from16 v9, v83

    .line 428
    .line 429
    move/from16 v2, v84

    .line 430
    .line 431
    move-object/from16 v8, v86

    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :cond_e
    const-string v11, "#EXT-X-MEDIA-SEQUENCE"

    .line 436
    .line 437
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    if-eqz v11, :cond_f

    .line 442
    .line 443
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_MEDIA_SEQUENCE:Ljava/util/regex/Pattern;

    .line 444
    .line 445
    invoke-static {v12, v9}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseLongAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    .line 446
    .line 447
    .line 448
    move-result-wide v70

    .line 449
    move-object/from16 v59, v2

    .line 450
    .line 451
    move-object/from16 v34, v8

    .line 452
    .line 453
    move-wide/from16 v16, v70

    .line 454
    .line 455
    goto :goto_5

    .line 456
    :cond_f
    const-string v11, "#EXT-X-VERSION"

    .line 457
    .line 458
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    if-eqz v11, :cond_10

    .line 463
    .line 464
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VERSION:Ljava/util/regex/Pattern;

    .line 465
    .line 466
    invoke-static {v12, v9}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    .line 467
    .line 468
    .line 469
    move-result v18

    .line 470
    goto :goto_4

    .line 471
    :cond_10
    const-string v11, "#EXT-X-DEFINE"

    .line 472
    .line 473
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 474
    .line 475
    .line 476
    move-result v11

    .line 477
    if-eqz v11, :cond_13

    .line 478
    .line 479
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_IMPORT:Ljava/util/regex/Pattern;

    .line 480
    .line 481
    invoke-static {v12, v9, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    if-eqz v9, :cond_11

    .line 486
    .line 487
    iget-object v11, v0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variableDefinitions:Ljava/util/Map;

    .line 488
    .line 489
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v11

    .line 493
    check-cast v11, Ljava/lang/String;

    .line 494
    .line 495
    if-eqz v11, :cond_12

    .line 496
    .line 497
    invoke-virtual {v3, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_11
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_NAME:Ljava/util/regex/Pattern;

    .line 502
    .line 503
    invoke-static {v12, v9, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v9

    .line 507
    sget-object v11, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VALUE:Ljava/util/regex/Pattern;

    .line 508
    .line 509
    invoke-static {v12, v11, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v11

    .line 513
    invoke-virtual {v3, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    :cond_12
    :goto_6
    move-object/from16 v88, v10

    .line 517
    .line 518
    move-wide/from16 v31, v35

    .line 519
    .line 520
    move-object/from16 v87, v37

    .line 521
    .line 522
    :goto_7
    move-object/from16 v1, v52

    .line 523
    .line 524
    move/from16 v30, v55

    .line 525
    .line 526
    move-wide/from16 v10, v70

    .line 527
    .line 528
    const/4 v12, 0x0

    .line 529
    move-wide/from16 v54, v27

    .line 530
    .line 531
    move-wide/from16 v28, v73

    .line 532
    .line 533
    :goto_8
    move-object/from16 v27, v25

    .line 534
    .line 535
    goto/16 :goto_1c

    .line 536
    .line 537
    :cond_13
    const-string v11, "#EXTINF"

    .line 538
    .line 539
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 540
    .line 541
    .line 542
    move-result v11

    .line 543
    if-eqz v11, :cond_14

    .line 544
    .line 545
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_MEDIA_DURATION:Ljava/util/regex/Pattern;

    .line 546
    .line 547
    invoke-static {v12, v9}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseTimeSecondsToUs(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    .line 548
    .line 549
    .line 550
    move-result-wide v73

    .line 551
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_MEDIA_TITLE:Ljava/util/regex/Pattern;

    .line 552
    .line 553
    move-object/from16 v11, v37

    .line 554
    .line 555
    invoke-static {v12, v9, v11, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v25

    .line 559
    goto/16 :goto_4

    .line 560
    .line 561
    :cond_14
    move-object/from16 v11, v37

    .line 562
    .line 563
    const-string v0, "#EXT-X-SKIP"

    .line 564
    .line 565
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    const-wide/16 v32, 0x1

    .line 570
    .line 571
    if-eqz v0, :cond_1c

    .line 572
    .line 573
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_SKIPPED_SEGMENTS:Ljava/util/regex/Pattern;

    .line 574
    .line 575
    invoke-static {v12, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    if-eqz v1, :cond_15

    .line 580
    .line 581
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-eqz v9, :cond_15

    .line 586
    .line 587
    const/4 v9, 0x1

    .line 588
    goto :goto_9

    .line 589
    :cond_15
    const/4 v9, 0x0

    .line 590
    :goto_9
    invoke-static {v9}, Lh1/a;->j(Z)V

    .line 591
    .line 592
    .line 593
    sget v9, Lh1/i0;->a:I

    .line 594
    .line 595
    move-object/from16 v87, v11

    .line 596
    .line 597
    iget-wide v11, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;->mediaSequence:J

    .line 598
    .line 599
    sub-long v11, v16, v11

    .line 600
    .line 601
    long-to-int v9, v11

    .line 602
    add-int/2addr v0, v9

    .line 603
    if-ltz v9, :cond_1b

    .line 604
    .line 605
    iget-object v11, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;->segments:Ljava/util/List;

    .line 606
    .line 607
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 608
    .line 609
    .line 610
    move-result v11

    .line 611
    if-gt v0, v11, :cond_1b

    .line 612
    .line 613
    move-object/from16 v59, v2

    .line 614
    .line 615
    move-object/from16 v34, v8

    .line 616
    .line 617
    move-wide/from16 v11, v35

    .line 618
    .line 619
    :goto_a
    if-ge v9, v0, :cond_1a

    .line 620
    .line 621
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;->segments:Ljava/util/List;

    .line 622
    .line 623
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 628
    .line 629
    move/from16 v24, v9

    .line 630
    .line 631
    iget-wide v8, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;->mediaSequence:J

    .line 632
    .line 633
    cmp-long v8, v16, v8

    .line 634
    .line 635
    if-eqz v8, :cond_16

    .line 636
    .line 637
    iget v8, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;->discontinuitySequence:I

    .line 638
    .line 639
    sub-int v8, v8, v47

    .line 640
    .line 641
    iget v9, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->relativeDiscontinuitySequence:I

    .line 642
    .line 643
    add-int/2addr v8, v9

    .line 644
    invoke-virtual {v2, v11, v12, v8}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;->copyWith(JI)Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    :cond_16
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    iget-wide v8, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->durationUs:J

    .line 652
    .line 653
    add-long v56, v11, v8

    .line 654
    .line 655
    iget-wide v8, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->byteRangeLength:J

    .line 656
    .line 657
    cmp-long v11, v8, v68

    .line 658
    .line 659
    if-eqz v11, :cond_17

    .line 660
    .line 661
    iget-wide v11, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->byteRangeOffset:J

    .line 662
    .line 663
    add-long v27, v11, v8

    .line 664
    .line 665
    :cond_17
    iget v8, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->relativeDiscontinuitySequence:I

    .line 666
    .line 667
    iget-object v9, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->initializationSegment:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 668
    .line 669
    iget-object v14, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->drmInitData:Landroidx/media3/common/s;

    .line 670
    .line 671
    iget-object v11, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->fullSegmentEncryptionKeyUri:Ljava/lang/String;

    .line 672
    .line 673
    iget-object v12, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->encryptionIV:Ljava/lang/String;

    .line 674
    .line 675
    move/from16 v29, v0

    .line 676
    .line 677
    if-eqz v12, :cond_18

    .line 678
    .line 679
    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-nez v0, :cond_19

    .line 688
    .line 689
    :cond_18
    iget-object v0, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->encryptionIV:Ljava/lang/String;

    .line 690
    .line 691
    move-object/from16 v34, v0

    .line 692
    .line 693
    :cond_19
    add-long v70, v70, v32

    .line 694
    .line 695
    add-int/lit8 v0, v24, 0x1

    .line 696
    .line 697
    move/from16 v55, v8

    .line 698
    .line 699
    move-object/from16 v52, v9

    .line 700
    .line 701
    move-object/from16 v59, v11

    .line 702
    .line 703
    move-wide/from16 v11, v56

    .line 704
    .line 705
    move v9, v0

    .line 706
    move/from16 v0, v29

    .line 707
    .line 708
    goto :goto_a

    .line 709
    :cond_1a
    move-object/from16 v0, p0

    .line 710
    .line 711
    move-wide/from16 v35, v11

    .line 712
    .line 713
    :goto_b
    move-object/from16 v9, v83

    .line 714
    .line 715
    move/from16 v2, v84

    .line 716
    .line 717
    move-object/from16 v8, v86

    .line 718
    .line 719
    move-object/from16 v37, v87

    .line 720
    .line 721
    goto/16 :goto_0

    .line 722
    .line 723
    :cond_1b
    new-instance v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$DeltaUpdateException;

    .line 724
    .line 725
    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$DeltaUpdateException;-><init>()V

    .line 726
    .line 727
    .line 728
    throw v0

    .line 729
    :cond_1c
    move-object/from16 v87, v11

    .line 730
    .line 731
    const-string v0, "#EXT-X-KEY"

    .line 732
    .line 733
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-eqz v0, :cond_21

    .line 738
    .line 739
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_METHOD:Ljava/util/regex/Pattern;

    .line 740
    .line 741
    invoke-static {v12, v0, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    sget-object v2, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_KEYFORMAT:Ljava/util/regex/Pattern;

    .line 746
    .line 747
    const-string v8, "identity"

    .line 748
    .line 749
    invoke-static {v12, v2, v8, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    const-string v9, "NONE"

    .line 754
    .line 755
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v9

    .line 759
    if-eqz v9, :cond_1d

    .line 760
    .line 761
    invoke-virtual {v10}, Ljava/util/TreeMap;->clear()V

    .line 762
    .line 763
    .line 764
    move-object/from16 v14, v85

    .line 765
    .line 766
    move-object/from16 v34, v14

    .line 767
    .line 768
    move-object/from16 v59, v34

    .line 769
    .line 770
    goto :goto_c

    .line 771
    :cond_1d
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_IV:Ljava/util/regex/Pattern;

    .line 772
    .line 773
    invoke-static {v12, v9, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v9

    .line 777
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v8

    .line 781
    if-eqz v8, :cond_1f

    .line 782
    .line 783
    const-string v2, "AES-128"

    .line 784
    .line 785
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v0

    .line 789
    if-eqz v0, :cond_1e

    .line 790
    .line 791
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 792
    .line 793
    invoke-static {v12, v0, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    move-object/from16 v59, v0

    .line 798
    .line 799
    move-object/from16 v34, v9

    .line 800
    .line 801
    goto :goto_c

    .line 802
    :cond_1e
    move-object/from16 v34, v9

    .line 803
    .line 804
    move-object/from16 v59, v85

    .line 805
    .line 806
    goto :goto_c

    .line 807
    :cond_1f
    if-nez v13, :cond_20

    .line 808
    .line 809
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseEncryptionScheme(Ljava/lang/String;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v13

    .line 813
    :cond_20
    invoke-static {v12, v2, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseDrmSchemeData(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroidx/media3/common/r;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    if-eqz v0, :cond_1e

    .line 818
    .line 819
    invoke-virtual {v10, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-object/from16 v34, v9

    .line 823
    .line 824
    move-object/from16 v14, v85

    .line 825
    .line 826
    move-object/from16 v59, v14

    .line 827
    .line 828
    :goto_c
    move-object/from16 v0, p0

    .line 829
    .line 830
    goto :goto_b

    .line 831
    :cond_21
    const-string v0, "#EXT-X-BYTERANGE"

    .line 832
    .line 833
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    if-eqz v0, :cond_23

    .line 838
    .line 839
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BYTERANGE:Ljava/util/regex/Pattern;

    .line 840
    .line 841
    invoke-static {v12, v0, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    sget v11, Lh1/i0;->a:I

    .line 846
    .line 847
    const/4 v12, -0x1

    .line 848
    invoke-virtual {v0, v9, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    const/16 v82, 0x0

    .line 853
    .line 854
    aget-object v9, v0, v82

    .line 855
    .line 856
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 857
    .line 858
    .line 859
    move-result-wide v38

    .line 860
    array-length v9, v0

    .line 861
    const/4 v11, 0x1

    .line 862
    if-le v9, v11, :cond_22

    .line 863
    .line 864
    aget-object v0, v0, v11

    .line 865
    .line 866
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 867
    .line 868
    .line 869
    move-result-wide v27

    .line 870
    :cond_22
    :goto_d
    move-object/from16 v0, p0

    .line 871
    .line 872
    move-object/from16 v59, v2

    .line 873
    .line 874
    move-object/from16 v34, v8

    .line 875
    .line 876
    goto/16 :goto_b

    .line 877
    .line 878
    :cond_23
    const/4 v11, 0x1

    .line 879
    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 880
    .line 881
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    move/from16 v81, v11

    .line 886
    .line 887
    const/16 v11, 0x3a

    .line 888
    .line 889
    if-eqz v0, :cond_24

    .line 890
    .line 891
    invoke-virtual {v12, v11}, Ljava/lang/String;->indexOf(I)I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    add-int/lit8 v0, v0, 0x1

    .line 896
    .line 897
    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 902
    .line 903
    .line 904
    move-result v47

    .line 905
    move-object/from16 v0, p0

    .line 906
    .line 907
    move-object/from16 v59, v2

    .line 908
    .line 909
    move-object/from16 v34, v8

    .line 910
    .line 911
    move-object/from16 v9, v83

    .line 912
    .line 913
    move/from16 v2, v84

    .line 914
    .line 915
    move-object/from16 v8, v86

    .line 916
    .line 917
    move-object/from16 v37, v87

    .line 918
    .line 919
    const/16 v46, 0x1

    .line 920
    .line 921
    goto/16 :goto_0

    .line 922
    .line 923
    :cond_24
    const-string v0, "#EXT-X-DISCONTINUITY"

    .line 924
    .line 925
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    move-result v0

    .line 929
    if-eqz v0, :cond_25

    .line 930
    .line 931
    add-int/lit8 v55, v55, 0x1

    .line 932
    .line 933
    goto :goto_d

    .line 934
    :cond_25
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    .line 935
    .line 936
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    if-eqz v0, :cond_27

    .line 941
    .line 942
    cmp-long v0, v48, v79

    .line 943
    .line 944
    if-nez v0, :cond_26

    .line 945
    .line 946
    invoke-virtual {v12, v11}, Ljava/lang/String;->indexOf(I)I

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    const/16 v81, 0x1

    .line 951
    .line 952
    add-int/lit8 v0, v0, 0x1

    .line 953
    .line 954
    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-static {v0}, Lh1/i0;->V(Ljava/lang/String;)J

    .line 959
    .line 960
    .line 961
    move-result-wide v11

    .line 962
    invoke-static {v11, v12}, Lh1/i0;->S(J)J

    .line 963
    .line 964
    .line 965
    move-result-wide v11

    .line 966
    sub-long v48, v11, v35

    .line 967
    .line 968
    goto :goto_d

    .line 969
    :cond_26
    move-object/from16 v88, v10

    .line 970
    .line 971
    :goto_e
    move-wide/from16 v31, v35

    .line 972
    .line 973
    goto/16 :goto_7

    .line 974
    .line 975
    :cond_27
    const-string v0, "#EXT-X-GAP"

    .line 976
    .line 977
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    move-result v0

    .line 981
    if-eqz v0, :cond_28

    .line 982
    .line 983
    move-object/from16 v0, p0

    .line 984
    .line 985
    move-object/from16 v59, v2

    .line 986
    .line 987
    move-object/from16 v34, v8

    .line 988
    .line 989
    move-object/from16 v9, v83

    .line 990
    .line 991
    move/from16 v2, v84

    .line 992
    .line 993
    move-object/from16 v8, v86

    .line 994
    .line 995
    move-object/from16 v37, v87

    .line 996
    .line 997
    const/16 v40, 0x1

    .line 998
    .line 999
    goto/16 :goto_0

    .line 1000
    .line 1001
    :cond_28
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 1002
    .line 1003
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v0

    .line 1007
    if-eqz v0, :cond_29

    .line 1008
    .line 1009
    move-object/from16 v0, p0

    .line 1010
    .line 1011
    move-object/from16 v59, v2

    .line 1012
    .line 1013
    move-object/from16 v34, v8

    .line 1014
    .line 1015
    move-object/from16 v9, v83

    .line 1016
    .line 1017
    move/from16 v2, v84

    .line 1018
    .line 1019
    move-object/from16 v8, v86

    .line 1020
    .line 1021
    move-object/from16 v37, v87

    .line 1022
    .line 1023
    const/16 v23, 0x1

    .line 1024
    .line 1025
    goto/16 :goto_0

    .line 1026
    .line 1027
    :cond_29
    const-string v0, "#EXT-X-ENDLIST"

    .line 1028
    .line 1029
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v0

    .line 1033
    if-eqz v0, :cond_2a

    .line 1034
    .line 1035
    move-object/from16 v0, p0

    .line 1036
    .line 1037
    move-object/from16 v59, v2

    .line 1038
    .line 1039
    move-object/from16 v34, v8

    .line 1040
    .line 1041
    move-object/from16 v9, v83

    .line 1042
    .line 1043
    move/from16 v2, v84

    .line 1044
    .line 1045
    move-object/from16 v8, v86

    .line 1046
    .line 1047
    move-object/from16 v37, v87

    .line 1048
    .line 1049
    const/16 v22, 0x1

    .line 1050
    .line 1051
    goto/16 :goto_0

    .line 1052
    .line 1053
    :cond_2a
    const-string v0, "#EXT-X-RENDITION-REPORT"

    .line 1054
    .line 1055
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v0

    .line 1059
    if-eqz v0, :cond_2b

    .line 1060
    .line 1061
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_LAST_MSN:Ljava/util/regex/Pattern;

    .line 1062
    .line 1063
    move-object v11, v10

    .line 1064
    move-wide/from16 v9, v68

    .line 1065
    .line 1066
    invoke-static {v12, v0, v9, v10}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalLongAttr(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v0

    .line 1070
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_LAST_PART:Ljava/util/regex/Pattern;

    .line 1071
    .line 1072
    const/4 v10, -0x1

    .line 1073
    invoke-static {v12, v9, v10}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    .line 1074
    .line 1075
    .line 1076
    move-result v9

    .line 1077
    sget-object v10, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 1078
    .line 1079
    invoke-static {v12, v10, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v10

    .line 1083
    move-object/from16 v12, p3

    .line 1084
    .line 1085
    invoke-static {v12, v10}, Lh1/a;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v10

    .line 1089
    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v10

    .line 1093
    move-object/from16 v88, v11

    .line 1094
    .line 1095
    new-instance v11, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;

    .line 1096
    .line 1097
    invoke-direct {v11, v10, v0, v1, v9}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;-><init>(Landroid/net/Uri;JI)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    goto/16 :goto_e

    .line 1104
    .line 1105
    :cond_2b
    move-object/from16 v88, v10

    .line 1106
    .line 1107
    const-string v0, "#EXT-X-PRELOAD-HINT"

    .line 1108
    .line 1109
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v0

    .line 1113
    if-eqz v0, :cond_32

    .line 1114
    .line 1115
    if-eqz v15, :cond_2c

    .line 1116
    .line 1117
    :goto_f
    goto/16 :goto_e

    .line 1118
    .line 1119
    :cond_2c
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PRELOAD_HINT_TYPE:Ljava/util/regex/Pattern;

    .line 1120
    .line 1121
    invoke-static {v12, v0, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    const-string v1, "PART"

    .line 1126
    .line 1127
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-nez v0, :cond_2d

    .line 1132
    .line 1133
    goto :goto_f

    .line 1134
    :cond_2d
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 1135
    .line 1136
    invoke-static {v12, v0, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v51

    .line 1140
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BYTERANGE_START:Ljava/util/regex/Pattern;

    .line 1141
    .line 1142
    const-wide/16 v9, -0x1

    .line 1143
    .line 1144
    invoke-static {v12, v0, v9, v10}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalLongAttr(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    .line 1145
    .line 1146
    .line 1147
    move-result-wide v0

    .line 1148
    sget-object v11, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BYTERANGE_LENGTH:Ljava/util/regex/Pattern;

    .line 1149
    .line 1150
    invoke-static {v12, v11, v9, v10}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalLongAttr(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    .line 1151
    .line 1152
    .line 1153
    move-result-wide v63

    .line 1154
    move-wide/from16 v10, v70

    .line 1155
    .line 1156
    invoke-static {v10, v11, v2, v8}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getSegmentEncryptionIV(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v60

    .line 1160
    if-nez v14, :cond_2e

    .line 1161
    .line 1162
    invoke-virtual/range {v88 .. v88}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1163
    .line 1164
    .line 1165
    move-result v9

    .line 1166
    if-nez v9, :cond_2e

    .line 1167
    .line 1168
    invoke-virtual/range {v88 .. v88}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v9

    .line 1172
    const/4 v12, 0x0

    .line 1173
    new-array v14, v12, [Landroidx/media3/common/r;

    .line 1174
    .line 1175
    invoke-interface {v9, v14}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v9

    .line 1179
    check-cast v9, [Landroidx/media3/common/r;

    .line 1180
    .line 1181
    new-instance v14, Landroidx/media3/common/s;

    .line 1182
    .line 1183
    const/4 v12, 0x1

    .line 1184
    invoke-direct {v14, v13, v12, v9}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 1185
    .line 1186
    .line 1187
    if-nez v26, :cond_2e

    .line 1188
    .line 1189
    invoke-static {v13, v9}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getPlaylistProtectionSchemes(Ljava/lang/String;[Landroidx/media3/common/r;)Landroidx/media3/common/s;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v9

    .line 1193
    move-object/from16 v26, v9

    .line 1194
    .line 1195
    :cond_2e
    move-object/from16 v58, v14

    .line 1196
    .line 1197
    const-wide/16 v68, -0x1

    .line 1198
    .line 1199
    cmp-long v9, v0, v68

    .line 1200
    .line 1201
    if-eqz v9, :cond_2f

    .line 1202
    .line 1203
    cmp-long v12, v63, v68

    .line 1204
    .line 1205
    if-eqz v12, :cond_31

    .line 1206
    .line 1207
    :cond_2f
    new-instance v50, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Part;

    .line 1208
    .line 1209
    if-eqz v9, :cond_30

    .line 1210
    .line 1211
    move-wide/from16 v61, v0

    .line 1212
    .line 1213
    goto :goto_10

    .line 1214
    :cond_30
    move-wide/from16 v61, v79

    .line 1215
    .line 1216
    :goto_10
    const/16 v66, 0x0

    .line 1217
    .line 1218
    const/16 v67, 0x1

    .line 1219
    .line 1220
    const-wide/16 v53, 0x0

    .line 1221
    .line 1222
    const/16 v65, 0x0

    .line 1223
    .line 1224
    move-object/from16 v59, v2

    .line 1225
    .line 1226
    invoke-direct/range {v50 .. v67}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Part;-><init>(Ljava/lang/String;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;JIJLandroidx/media3/common/s;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 1227
    .line 1228
    .line 1229
    move-object/from16 v15, v50

    .line 1230
    .line 1231
    :cond_31
    move-object/from16 v0, p0

    .line 1232
    .line 1233
    move-object/from16 v1, p1

    .line 1234
    .line 1235
    move-object/from16 v59, v2

    .line 1236
    .line 1237
    move-object/from16 v34, v8

    .line 1238
    .line 1239
    move-wide/from16 v70, v10

    .line 1240
    .line 1241
    move-object/from16 v14, v58

    .line 1242
    .line 1243
    move-object/from16 v9, v83

    .line 1244
    .line 1245
    move/from16 v2, v84

    .line 1246
    .line 1247
    move-object/from16 v8, v86

    .line 1248
    .line 1249
    move-object/from16 v37, v87

    .line 1250
    .line 1251
    move-object/from16 v10, v88

    .line 1252
    .line 1253
    const-wide/16 v68, -0x1

    .line 1254
    .line 1255
    goto/16 :goto_0

    .line 1256
    .line 1257
    :cond_32
    move-wide/from16 v10, v70

    .line 1258
    .line 1259
    const-string v0, "#EXT-X-PART"

    .line 1260
    .line 1261
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v0

    .line 1265
    if-eqz v0, :cond_39

    .line 1266
    .line 1267
    invoke-static {v10, v11, v2, v8}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getSegmentEncryptionIV(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v60

    .line 1271
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 1272
    .line 1273
    invoke-static {v12, v0, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v51

    .line 1277
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_ATTR_DURATION:Ljava/util/regex/Pattern;

    .line 1278
    .line 1279
    invoke-static {v12, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 1280
    .line 1281
    .line 1282
    move-result-wide v0

    .line 1283
    mul-double v0, v0, v30

    .line 1284
    .line 1285
    double-to-long v0, v0

    .line 1286
    move-wide/from16 v53, v0

    .line 1287
    .line 1288
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_INDEPENDENT:Ljava/util/regex/Pattern;

    .line 1289
    .line 1290
    const/4 v1, 0x0

    .line 1291
    invoke-static {v12, v0, v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 1292
    .line 1293
    .line 1294
    move-result v0

    .line 1295
    if-eqz v23, :cond_33

    .line 1296
    .line 1297
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1298
    .line 1299
    .line 1300
    move-result v24

    .line 1301
    if-eqz v24, :cond_33

    .line 1302
    .line 1303
    const/16 v24, 0x1

    .line 1304
    .line 1305
    goto :goto_11

    .line 1306
    :cond_33
    move/from16 v24, v1

    .line 1307
    .line 1308
    :goto_11
    or-int v66, v0, v24

    .line 1309
    .line 1310
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_GAP:Ljava/util/regex/Pattern;

    .line 1311
    .line 1312
    invoke-static {v12, v0, v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v65

    .line 1316
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_ATTR_BYTERANGE:Ljava/util/regex/Pattern;

    .line 1317
    .line 1318
    invoke-static {v12, v0, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    if-eqz v0, :cond_35

    .line 1323
    .line 1324
    sget v12, Lh1/i0;->a:I

    .line 1325
    .line 1326
    const/4 v12, -0x1

    .line 1327
    invoke-virtual {v0, v9, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    aget-object v9, v0, v1

    .line 1332
    .line 1333
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1334
    .line 1335
    .line 1336
    move-result-wide v29

    .line 1337
    array-length v1, v0

    .line 1338
    const/4 v12, 0x1

    .line 1339
    if-le v1, v12, :cond_34

    .line 1340
    .line 1341
    aget-object v0, v0, v12

    .line 1342
    .line 1343
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1344
    .line 1345
    .line 1346
    move-result-wide v75

    .line 1347
    :cond_34
    move-wide/from16 v63, v29

    .line 1348
    .line 1349
    :goto_12
    const-wide/16 v68, -0x1

    .line 1350
    .line 1351
    goto :goto_13

    .line 1352
    :cond_35
    const-wide/16 v63, -0x1

    .line 1353
    .line 1354
    goto :goto_12

    .line 1355
    :goto_13
    cmp-long v0, v63, v68

    .line 1356
    .line 1357
    if-nez v0, :cond_36

    .line 1358
    .line 1359
    move-wide/from16 v61, v79

    .line 1360
    .line 1361
    goto :goto_14

    .line 1362
    :cond_36
    move-wide/from16 v61, v75

    .line 1363
    .line 1364
    :goto_14
    if-nez v14, :cond_37

    .line 1365
    .line 1366
    invoke-virtual/range {v88 .. v88}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1367
    .line 1368
    .line 1369
    move-result v1

    .line 1370
    if-nez v1, :cond_37

    .line 1371
    .line 1372
    invoke-virtual/range {v88 .. v88}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v1

    .line 1376
    const/4 v12, 0x0

    .line 1377
    new-array v9, v12, [Landroidx/media3/common/r;

    .line 1378
    .line 1379
    invoke-interface {v1, v9}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v1

    .line 1383
    check-cast v1, [Landroidx/media3/common/r;

    .line 1384
    .line 1385
    new-instance v14, Landroidx/media3/common/s;

    .line 1386
    .line 1387
    const/4 v12, 0x1

    .line 1388
    invoke-direct {v14, v13, v12, v1}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 1389
    .line 1390
    .line 1391
    if-nez v26, :cond_37

    .line 1392
    .line 1393
    invoke-static {v13, v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getPlaylistProtectionSchemes(Ljava/lang/String;[Landroidx/media3/common/r;)Landroidx/media3/common/s;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v1

    .line 1397
    move-object/from16 v26, v1

    .line 1398
    .line 1399
    :cond_37
    move-object/from16 v58, v14

    .line 1400
    .line 1401
    new-instance v50, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Part;

    .line 1402
    .line 1403
    const/16 v67, 0x0

    .line 1404
    .line 1405
    move-object/from16 v59, v2

    .line 1406
    .line 1407
    invoke-direct/range {v50 .. v67}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Part;-><init>(Ljava/lang/String;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;JIJLandroidx/media3/common/s;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 1408
    .line 1409
    .line 1410
    move-object/from16 v9, v50

    .line 1411
    .line 1412
    move-object/from16 v1, v52

    .line 1413
    .line 1414
    move/from16 v30, v55

    .line 1415
    .line 1416
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    add-long v56, v56, v53

    .line 1420
    .line 1421
    if-eqz v0, :cond_38

    .line 1422
    .line 1423
    add-long v61, v61, v63

    .line 1424
    .line 1425
    :cond_38
    move-wide/from16 v75, v61

    .line 1426
    .line 1427
    move-object/from16 v0, p0

    .line 1428
    .line 1429
    move-object/from16 v52, v1

    .line 1430
    .line 1431
    move-object/from16 v59, v2

    .line 1432
    .line 1433
    move-object/from16 v34, v8

    .line 1434
    .line 1435
    move-wide/from16 v70, v10

    .line 1436
    .line 1437
    move/from16 v55, v30

    .line 1438
    .line 1439
    move-object/from16 v14, v58

    .line 1440
    .line 1441
    move-object/from16 v9, v83

    .line 1442
    .line 1443
    move/from16 v2, v84

    .line 1444
    .line 1445
    move-object/from16 v8, v86

    .line 1446
    .line 1447
    move-object/from16 v37, v87

    .line 1448
    .line 1449
    move-object/from16 v10, v88

    .line 1450
    .line 1451
    :goto_15
    const-wide/16 v68, -0x1

    .line 1452
    .line 1453
    move-object/from16 v1, p1

    .line 1454
    .line 1455
    goto/16 :goto_0

    .line 1456
    .line 1457
    :cond_39
    move-object/from16 v1, v52

    .line 1458
    .line 1459
    move/from16 v30, v55

    .line 1460
    .line 1461
    const-string v0, "#"

    .line 1462
    .line 1463
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1464
    .line 1465
    .line 1466
    move-result v0

    .line 1467
    if-nez v0, :cond_40

    .line 1468
    .line 1469
    move-wide/from16 v33, v32

    .line 1470
    .line 1471
    move-wide/from16 v31, v35

    .line 1472
    .line 1473
    invoke-static {v10, v11, v2, v8}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getSegmentEncryptionIV(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v35

    .line 1477
    add-long v70, v10, v33

    .line 1478
    .line 1479
    invoke-static {v12, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->replaceVariableReferences(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v0

    .line 1483
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v9

    .line 1487
    check-cast v9, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 1488
    .line 1489
    const-wide/16 v68, -0x1

    .line 1490
    .line 1491
    cmp-long v10, v38, v68

    .line 1492
    .line 1493
    if-nez v10, :cond_3a

    .line 1494
    .line 1495
    move-object/from16 v52, v9

    .line 1496
    .line 1497
    move-wide/from16 v36, v79

    .line 1498
    .line 1499
    goto :goto_17

    .line 1500
    :cond_3a
    if-eqz v72, :cond_3b

    .line 1501
    .line 1502
    if-nez v1, :cond_3b

    .line 1503
    .line 1504
    if-nez v9, :cond_3b

    .line 1505
    .line 1506
    new-instance v50, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 1507
    .line 1508
    const/16 v56, 0x0

    .line 1509
    .line 1510
    const/16 v57, 0x0

    .line 1511
    .line 1512
    const-wide/16 v52, 0x0

    .line 1513
    .line 1514
    move-object/from16 v51, v0

    .line 1515
    .line 1516
    move-wide/from16 v54, v27

    .line 1517
    .line 1518
    invoke-direct/range {v50 .. v57}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 1519
    .line 1520
    .line 1521
    move-object/from16 v9, v50

    .line 1522
    .line 1523
    invoke-virtual {v4, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    :goto_16
    move-object/from16 v52, v9

    .line 1527
    .line 1528
    move-wide/from16 v36, v54

    .line 1529
    .line 1530
    goto :goto_17

    .line 1531
    :cond_3b
    move-wide/from16 v54, v27

    .line 1532
    .line 1533
    goto :goto_16

    .line 1534
    :goto_17
    if-nez v14, :cond_3d

    .line 1535
    .line 1536
    invoke-virtual/range {v88 .. v88}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1537
    .line 1538
    .line 1539
    move-result v9

    .line 1540
    if-nez v9, :cond_3d

    .line 1541
    .line 1542
    invoke-virtual/range {v88 .. v88}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v9

    .line 1546
    const/4 v12, 0x0

    .line 1547
    new-array v11, v12, [Landroidx/media3/common/r;

    .line 1548
    .line 1549
    invoke-interface {v9, v11}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v9

    .line 1553
    check-cast v9, [Landroidx/media3/common/r;

    .line 1554
    .line 1555
    new-instance v14, Landroidx/media3/common/s;

    .line 1556
    .line 1557
    const/4 v11, 0x1

    .line 1558
    invoke-direct {v14, v13, v11, v9}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 1559
    .line 1560
    .line 1561
    if-nez v26, :cond_3c

    .line 1562
    .line 1563
    invoke-static {v13, v9}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getPlaylistProtectionSchemes(Ljava/lang/String;[Landroidx/media3/common/r;)Landroidx/media3/common/s;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v9

    .line 1567
    move-object/from16 v33, v14

    .line 1568
    .line 1569
    goto :goto_19

    .line 1570
    :cond_3c
    :goto_18
    move-object/from16 v33, v14

    .line 1571
    .line 1572
    move-object/from16 v9, v26

    .line 1573
    .line 1574
    goto :goto_19

    .line 1575
    :cond_3d
    const/4 v12, 0x0

    .line 1576
    goto :goto_18

    .line 1577
    :goto_19
    new-instance v24, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 1578
    .line 1579
    if-eqz v1, :cond_3e

    .line 1580
    .line 1581
    move-object/from16 v26, v1

    .line 1582
    .line 1583
    :goto_1a
    move-object/from16 v34, v2

    .line 1584
    .line 1585
    move-object/from16 v41, v6

    .line 1586
    .line 1587
    move-object/from16 v27, v25

    .line 1588
    .line 1589
    move-wide/from16 v28, v73

    .line 1590
    .line 1591
    move-object/from16 v25, v0

    .line 1592
    .line 1593
    goto :goto_1b

    .line 1594
    :cond_3e
    move-object/from16 v26, v52

    .line 1595
    .line 1596
    goto :goto_1a

    .line 1597
    :goto_1b
    invoke-direct/range {v24 .. v41}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;-><init>(Ljava/lang/String;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;Ljava/lang/String;JIJLandroidx/media3/common/s;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    .line 1598
    .line 1599
    .line 1600
    move-object/from16 v0, v24

    .line 1601
    .line 1602
    move-object/from16 v2, v34

    .line 1603
    .line 1604
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1605
    .line 1606
    .line 1607
    add-long v56, v31, v28

    .line 1608
    .line 1609
    new-instance v6, Ljava/util/ArrayList;

    .line 1610
    .line 1611
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1612
    .line 1613
    .line 1614
    if-eqz v10, :cond_3f

    .line 1615
    .line 1616
    add-long v36, v36, v38

    .line 1617
    .line 1618
    :cond_3f
    move-wide/from16 v27, v36

    .line 1619
    .line 1620
    move-object/from16 v0, p0

    .line 1621
    .line 1622
    move-object/from16 v52, v1

    .line 1623
    .line 1624
    move-object/from16 v59, v2

    .line 1625
    .line 1626
    move-object/from16 v34, v8

    .line 1627
    .line 1628
    move-object/from16 v26, v9

    .line 1629
    .line 1630
    move/from16 v40, v12

    .line 1631
    .line 1632
    move/from16 v55, v30

    .line 1633
    .line 1634
    move-object/from16 v14, v33

    .line 1635
    .line 1636
    move-wide/from16 v35, v56

    .line 1637
    .line 1638
    move-wide/from16 v73, v79

    .line 1639
    .line 1640
    move-object/from16 v9, v83

    .line 1641
    .line 1642
    move/from16 v2, v84

    .line 1643
    .line 1644
    move-object/from16 v8, v86

    .line 1645
    .line 1646
    move-object/from16 v25, v87

    .line 1647
    .line 1648
    move-object/from16 v37, v25

    .line 1649
    .line 1650
    move-object/from16 v10, v88

    .line 1651
    .line 1652
    const-wide/16 v38, -0x1

    .line 1653
    .line 1654
    goto/16 :goto_15

    .line 1655
    .line 1656
    :cond_40
    move-wide/from16 v54, v27

    .line 1657
    .line 1658
    move-wide/from16 v31, v35

    .line 1659
    .line 1660
    move-wide/from16 v28, v73

    .line 1661
    .line 1662
    const/4 v12, 0x0

    .line 1663
    goto/16 :goto_8

    .line 1664
    .line 1665
    :goto_1c
    move-object/from16 v0, p0

    .line 1666
    .line 1667
    move-object/from16 v52, v1

    .line 1668
    .line 1669
    move-object/from16 v59, v2

    .line 1670
    .line 1671
    move-object/from16 v34, v8

    .line 1672
    .line 1673
    move-wide/from16 v70, v10

    .line 1674
    .line 1675
    move-object/from16 v25, v27

    .line 1676
    .line 1677
    move-wide/from16 v73, v28

    .line 1678
    .line 1679
    move-wide/from16 v35, v31

    .line 1680
    .line 1681
    move-wide/from16 v27, v54

    .line 1682
    .line 1683
    move-object/from16 v9, v83

    .line 1684
    .line 1685
    move/from16 v2, v84

    .line 1686
    .line 1687
    move-object/from16 v8, v86

    .line 1688
    .line 1689
    move-object/from16 v37, v87

    .line 1690
    .line 1691
    move-object/from16 v10, v88

    .line 1692
    .line 1693
    const-wide/16 v68, -0x1

    .line 1694
    .line 1695
    move-object/from16 v1, p1

    .line 1696
    .line 1697
    move/from16 v55, v30

    .line 1698
    .line 1699
    goto/16 :goto_0

    .line 1700
    .line 1701
    :cond_41
    move/from16 v84, v2

    .line 1702
    .line 1703
    move-object/from16 v86, v8

    .line 1704
    .line 1705
    move-object/from16 v83, v9

    .line 1706
    .line 1707
    const/4 v12, 0x0

    .line 1708
    new-instance v0, Ljava/util/HashMap;

    .line 1709
    .line 1710
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1711
    .line 1712
    .line 1713
    move v8, v12

    .line 1714
    :goto_1d
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1715
    .line 1716
    .line 1717
    move-result v1

    .line 1718
    if-ge v8, v1, :cond_45

    .line 1719
    .line 1720
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v1

    .line 1724
    check-cast v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;

    .line 1725
    .line 1726
    iget-wide v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;->lastMediaSequence:J

    .line 1727
    .line 1728
    const-wide/16 v68, -0x1

    .line 1729
    .line 1730
    cmp-long v4, v2, v68

    .line 1731
    .line 1732
    if-nez v4, :cond_42

    .line 1733
    .line 1734
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1735
    .line 1736
    .line 1737
    move-result v2

    .line 1738
    int-to-long v2, v2

    .line 1739
    add-long v2, v16, v2

    .line 1740
    .line 1741
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1742
    .line 1743
    .line 1744
    move-result v4

    .line 1745
    int-to-long v9, v4

    .line 1746
    sub-long/2addr v2, v9

    .line 1747
    :cond_42
    iget v4, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;->lastPartIndex:I

    .line 1748
    .line 1749
    const/4 v10, -0x1

    .line 1750
    if-ne v4, v10, :cond_44

    .line 1751
    .line 1752
    cmp-long v9, v44, v77

    .line 1753
    .line 1754
    if-eqz v9, :cond_44

    .line 1755
    .line 1756
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1757
    .line 1758
    .line 1759
    move-result v4

    .line 1760
    if-eqz v4, :cond_43

    .line 1761
    .line 1762
    invoke-static {v5}, Lf6/u;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v4

    .line 1766
    check-cast v4, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 1767
    .line 1768
    iget-object v4, v4, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;->parts:Ljava/util/List;

    .line 1769
    .line 1770
    goto :goto_1e

    .line 1771
    :cond_43
    move-object v4, v6

    .line 1772
    :goto_1e
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1773
    .line 1774
    .line 1775
    move-result v4

    .line 1776
    const/16 v81, 0x1

    .line 1777
    .line 1778
    add-int/lit8 v4, v4, -0x1

    .line 1779
    .line 1780
    goto :goto_1f

    .line 1781
    :cond_44
    const/16 v81, 0x1

    .line 1782
    .line 1783
    :goto_1f
    iget-object v1, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;->playlistUri:Landroid/net/Uri;

    .line 1784
    .line 1785
    new-instance v9, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;

    .line 1786
    .line 1787
    invoke-direct {v9, v1, v2, v3, v4}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$RenditionReport;-><init>(Landroid/net/Uri;JI)V

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual {v0, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    add-int/lit8 v8, v8, 0x1

    .line 1794
    .line 1795
    goto :goto_1d

    .line 1796
    :cond_45
    const/16 v81, 0x1

    .line 1797
    .line 1798
    if-eqz v15, :cond_46

    .line 1799
    .line 1800
    invoke-interface {v6, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1801
    .line 1802
    .line 1803
    :cond_46
    move-object/from16 v27, v5

    .line 1804
    .line 1805
    new-instance v5, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;

    .line 1806
    .line 1807
    cmp-long v1, v48, v79

    .line 1808
    .line 1809
    if-eqz v1, :cond_47

    .line 1810
    .line 1811
    move/from16 v25, v81

    .line 1812
    .line 1813
    :goto_20
    move-object/from16 v7, p3

    .line 1814
    .line 1815
    move-object/from16 v30, v0

    .line 1816
    .line 1817
    move-object/from16 v28, v6

    .line 1818
    .line 1819
    move/from16 v6, v21

    .line 1820
    .line 1821
    move/from16 v24, v22

    .line 1822
    .line 1823
    move-wide/from16 v9, v42

    .line 1824
    .line 1825
    move-wide/from16 v21, v44

    .line 1826
    .line 1827
    move/from16 v14, v46

    .line 1828
    .line 1829
    move/from16 v15, v47

    .line 1830
    .line 1831
    move-wide/from16 v12, v48

    .line 1832
    .line 1833
    move-object/from16 v29, v83

    .line 1834
    .line 1835
    move/from16 v11, v84

    .line 1836
    .line 1837
    move-object/from16 v8, v86

    .line 1838
    .line 1839
    goto :goto_21

    .line 1840
    :cond_47
    move/from16 v25, v12

    .line 1841
    .line 1842
    goto :goto_20

    .line 1843
    :goto_21
    invoke-direct/range {v5 .. v30}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLandroidx/media3/common/s;Ljava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$ServerControl;Ljava/util/Map;)V

    .line 1844
    .line 1845
    .line 1846
    return-object v5
.end method

.method private static parseMultivariantPlaylist(Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;
    .locals 38

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v11, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v4, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v5, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v12, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v8, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    const-string v15, "application/x-mpegURL"

    .line 60
    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    if-eqz v14, :cond_f

    .line 64
    .line 65
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;->next()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    const-string v9, "#EXT"

    .line 70
    .line 71
    invoke-virtual {v14, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_0

    .line 76
    .line 77
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_0
    const-string v9, "#EXT-X-I-FRAME-STREAM-INF"

    .line 81
    .line 82
    invoke-virtual {v14, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    move-object/from16 v19, v7

    .line 87
    .line 88
    const-string v7, "#EXT-X-DEFINE"

    .line 89
    .line 90
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_1

    .line 95
    .line 96
    sget-object v7, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_NAME:Ljava/util/regex/Pattern;

    .line 97
    .line 98
    invoke-static {v14, v7, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VALUE:Ljava/util/regex/Pattern;

    .line 103
    .line 104
    invoke-static {v14, v9, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    invoke-virtual {v11, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    const-string v7, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 113
    .line 114
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_2

    .line 119
    .line 120
    move-object/from16 v17, v6

    .line 121
    .line 122
    move-object/from16 v20, v8

    .line 123
    .line 124
    move-object/from16 v29, v12

    .line 125
    .line 126
    const/4 v13, 0x1

    .line 127
    goto/16 :goto_b

    .line 128
    .line 129
    :cond_2
    const-string v7, "#EXT-X-MEDIA"

    .line 130
    .line 131
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_3

    .line 136
    .line 137
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    const-string v7, "#EXT-X-SESSION-KEY"

    .line 142
    .line 143
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_4

    .line 148
    .line 149
    sget-object v7, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_KEYFORMAT:Ljava/util/regex/Pattern;

    .line 150
    .line 151
    const-string v9, "identity"

    .line 152
    .line 153
    invoke-static {v14, v7, v9, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v14, v7, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseDrmSchemeData(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroidx/media3/common/r;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    if-eqz v7, :cond_5

    .line 162
    .line 163
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_METHOD:Ljava/util/regex/Pattern;

    .line 164
    .line 165
    invoke-static {v14, v9, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    invoke-static {v9}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseEncryptionScheme(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    new-instance v14, Landroidx/media3/common/s;

    .line 174
    .line 175
    filled-new-array {v7}, [Landroidx/media3/common/r;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    const/4 v15, 0x1

    .line 180
    invoke-direct {v14, v9, v15, v7}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_4
    const-string v7, "#EXT-X-STREAM-INF"

    .line 188
    .line 189
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    if-nez v7, :cond_6

    .line 194
    .line 195
    if-eqz v9, :cond_5

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    :goto_1
    move-object/from16 v17, v6

    .line 199
    .line 200
    move-object/from16 v20, v8

    .line 201
    .line 202
    move-object/from16 v29, v12

    .line 203
    .line 204
    goto/16 :goto_b

    .line 205
    .line 206
    :cond_6
    :goto_2
    const-string v7, "CLOSED-CAPTIONS=NONE"

    .line 207
    .line 208
    invoke-virtual {v14, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    or-int/2addr v10, v7

    .line 213
    if-eqz v9, :cond_7

    .line 214
    .line 215
    const/16 v7, 0x4000

    .line 216
    .line 217
    :goto_3
    move-object/from16 v20, v8

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_7
    move/from16 v7, v16

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :goto_4
    sget-object v8, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_BANDWIDTH:Ljava/util/regex/Pattern;

    .line 224
    .line 225
    invoke-static {v14, v8}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    move/from16 v21, v9

    .line 230
    .line 231
    sget-object v9, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_AVERAGE_BANDWIDTH:Ljava/util/regex/Pattern;

    .line 232
    .line 233
    move/from16 v28, v10

    .line 234
    .line 235
    const/4 v10, -0x1

    .line 236
    invoke-static {v14, v9, v10}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    sget-object v10, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CODECS:Ljava/util/regex/Pattern;

    .line 241
    .line 242
    invoke-static {v14, v10, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    move-object/from16 v29, v12

    .line 247
    .line 248
    sget-object v12, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_RESOLUTION:Ljava/util/regex/Pattern;

    .line 249
    .line 250
    invoke-static {v14, v12, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    if-eqz v12, :cond_9

    .line 255
    .line 256
    sget v22, Lh1/i0;->a:I

    .line 257
    .line 258
    move/from16 v30, v13

    .line 259
    .line 260
    const-string v13, "x"

    .line 261
    .line 262
    move-object/from16 v22, v15

    .line 263
    .line 264
    const/4 v15, -0x1

    .line 265
    invoke-virtual {v12, v13, v15}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    aget-object v13, v12, v16

    .line 270
    .line 271
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    const/16 v18, 0x1

    .line 276
    .line 277
    aget-object v12, v12, v18

    .line 278
    .line 279
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result v12

    .line 283
    if-lez v13, :cond_a

    .line 284
    .line 285
    if-gtz v12, :cond_8

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_8
    move v15, v13

    .line 289
    goto :goto_6

    .line 290
    :cond_9
    move/from16 v30, v13

    .line 291
    .line 292
    move-object/from16 v22, v15

    .line 293
    .line 294
    const/4 v15, -0x1

    .line 295
    :cond_a
    :goto_5
    move v12, v15

    .line 296
    :goto_6
    sget-object v13, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_FRAME_RATE:Ljava/util/regex/Pattern;

    .line 297
    .line 298
    invoke-static {v14, v13, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    if-eqz v13, :cond_b

    .line 303
    .line 304
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    :goto_7
    move-object/from16 v17, v6

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_b
    const/high16 v13, -0x40800000    # -1.0f

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :goto_8
    sget-object v6, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VIDEO:Ljava/util/regex/Pattern;

    .line 315
    .line 316
    invoke-static {v14, v6, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v34

    .line 320
    sget-object v6, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_AUDIO:Ljava/util/regex/Pattern;

    .line 321
    .line 322
    invoke-static {v14, v6, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v35

    .line 326
    sget-object v6, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_SUBTITLES:Ljava/util/regex/Pattern;

    .line 327
    .line 328
    invoke-static {v14, v6, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v36

    .line 332
    sget-object v6, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CLOSED_CAPTIONS:Ljava/util/regex/Pattern;

    .line 333
    .line 334
    invoke-static {v14, v6, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v37

    .line 338
    if-eqz v21, :cond_c

    .line 339
    .line 340
    sget-object v6, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 341
    .line 342
    invoke-static {v14, v6, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-static {v1, v6}, Lh1/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    :goto_9
    move-object/from16 v32, v6

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-eqz v6, :cond_e

    .line 358
    .line 359
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;->next()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    invoke-static {v6, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->replaceVariableReferences(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    invoke-static {v1, v6}, Lh1/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    goto :goto_9

    .line 372
    :goto_a
    new-instance v6, Landroidx/media3/common/v;

    .line 373
    .line 374
    invoke-direct {v6}, Landroidx/media3/common/v;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 378
    .line 379
    .line 380
    move-result v14

    .line 381
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v14

    .line 385
    iput-object v14, v6, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 386
    .line 387
    invoke-static/range {v22 .. v22}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v14

    .line 391
    iput-object v14, v6, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 392
    .line 393
    iput-object v10, v6, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 394
    .line 395
    iput v9, v6, Landroidx/media3/common/v;->h:I

    .line 396
    .line 397
    iput v8, v6, Landroidx/media3/common/v;->i:I

    .line 398
    .line 399
    iput v15, v6, Landroidx/media3/common/v;->t:I

    .line 400
    .line 401
    iput v12, v6, Landroidx/media3/common/v;->u:I

    .line 402
    .line 403
    iput v13, v6, Landroidx/media3/common/v;->v:F

    .line 404
    .line 405
    iput v7, v6, Landroidx/media3/common/v;->f:I

    .line 406
    .line 407
    new-instance v7, Landroidx/media3/common/w;

    .line 408
    .line 409
    invoke-direct {v7, v6}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 410
    .line 411
    .line 412
    new-instance v31, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 413
    .line 414
    move-object/from16 v33, v7

    .line 415
    .line 416
    invoke-direct/range {v31 .. v37}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;-><init>(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v7, v31

    .line 420
    .line 421
    move-object/from16 v6, v32

    .line 422
    .line 423
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    check-cast v7, Ljava/util/ArrayList;

    .line 431
    .line 432
    if-nez v7, :cond_d

    .line 433
    .line 434
    new-instance v7, Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    :cond_d
    new-instance v21, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    .line 443
    .line 444
    move/from16 v23, v8

    .line 445
    .line 446
    move/from16 v22, v9

    .line 447
    .line 448
    move-object/from16 v24, v34

    .line 449
    .line 450
    move-object/from16 v25, v35

    .line 451
    .line 452
    move-object/from16 v26, v36

    .line 453
    .line 454
    move-object/from16 v27, v37

    .line 455
    .line 456
    invoke-direct/range {v21 .. v27}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    move-object/from16 v6, v21

    .line 460
    .line 461
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move/from16 v10, v28

    .line 465
    .line 466
    move/from16 v13, v30

    .line 467
    .line 468
    :goto_b
    move-object/from16 v6, v17

    .line 469
    .line 470
    move-object/from16 v7, v19

    .line 471
    .line 472
    move-object/from16 v8, v20

    .line 473
    .line 474
    move-object/from16 v12, v29

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :cond_e
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    .line 479
    .line 480
    const/4 v1, 0x0

    .line 481
    invoke-static {v0, v1}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    throw v0

    .line 486
    :cond_f
    move-object/from16 v17, v6

    .line 487
    .line 488
    move-object/from16 v19, v7

    .line 489
    .line 490
    move-object/from16 v20, v8

    .line 491
    .line 492
    move v9, v10

    .line 493
    move-object/from16 v29, v12

    .line 494
    .line 495
    move/from16 v30, v13

    .line 496
    .line 497
    move-object/from16 v22, v15

    .line 498
    .line 499
    const/4 v15, -0x1

    .line 500
    new-instance v6, Ljava/util/ArrayList;

    .line 501
    .line 502
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 503
    .line 504
    .line 505
    new-instance v7, Ljava/util/HashSet;

    .line 506
    .line 507
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 508
    .line 509
    .line 510
    move/from16 v8, v16

    .line 511
    .line 512
    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 513
    .line 514
    .line 515
    move-result v10

    .line 516
    if-ge v8, v10, :cond_12

    .line 517
    .line 518
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v10

    .line 522
    check-cast v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 523
    .line 524
    iget-object v12, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->url:Landroid/net/Uri;

    .line 525
    .line 526
    invoke-virtual {v7, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v12

    .line 530
    if-eqz v12, :cond_11

    .line 531
    .line 532
    iget-object v12, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 533
    .line 534
    iget-object v12, v12, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 535
    .line 536
    if-nez v12, :cond_10

    .line 537
    .line 538
    const/4 v12, 0x1

    .line 539
    goto :goto_d

    .line 540
    :cond_10
    move/from16 v12, v16

    .line 541
    .line 542
    :goto_d
    invoke-static {v12}, Lh1/a;->j(Z)V

    .line 543
    .line 544
    .line 545
    new-instance v12, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    .line 546
    .line 547
    iget-object v13, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->url:Landroid/net/Uri;

    .line 548
    .line 549
    invoke-virtual {v0, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    check-cast v13, Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    invoke-direct {v12, v14, v14, v13}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 560
    .line 561
    .line 562
    new-instance v13, Landroidx/media3/common/t0;

    .line 563
    .line 564
    const/4 v14, 0x1

    .line 565
    new-array v15, v14, [Landroidx/media3/common/s0;

    .line 566
    .line 567
    aput-object v12, v15, v16

    .line 568
    .line 569
    invoke-direct {v13, v15}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 570
    .line 571
    .line 572
    iget-object v12, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 575
    .line 576
    .line 577
    move-result-object v12

    .line 578
    iput-object v13, v12, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 579
    .line 580
    new-instance v13, Landroidx/media3/common/w;

    .line 581
    .line 582
    invoke-direct {v13, v12}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v10, v13}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->copyWithFormat(Landroidx/media3/common/w;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 586
    .line 587
    .line 588
    move-result-object v10

    .line 589
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    :cond_11
    add-int/lit8 v8, v8, 0x1

    .line 593
    .line 594
    const/4 v15, -0x1

    .line 595
    goto :goto_c

    .line 596
    :cond_12
    move/from16 v7, v16

    .line 597
    .line 598
    const/4 v0, 0x0

    .line 599
    const/4 v8, 0x0

    .line 600
    :goto_e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 601
    .line 602
    .line 603
    move-result v10

    .line 604
    if-ge v7, v10, :cond_24

    .line 605
    .line 606
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v10

    .line 610
    check-cast v10, Ljava/lang/String;

    .line 611
    .line 612
    sget-object v12, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_GROUP_ID:Ljava/util/regex/Pattern;

    .line 613
    .line 614
    invoke-static {v10, v12, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v12

    .line 618
    sget-object v13, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_NAME:Ljava/util/regex/Pattern;

    .line 619
    .line 620
    invoke-static {v10, v13, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v13

    .line 624
    new-instance v14, Landroidx/media3/common/v;

    .line 625
    .line 626
    invoke-direct {v14}, Landroidx/media3/common/v;-><init>()V

    .line 627
    .line 628
    .line 629
    new-instance v15, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    move-object/from16 p0, v0

    .line 638
    .line 639
    const-string v0, ":"

    .line 640
    .line 641
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    iput-object v0, v14, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 652
    .line 653
    iput-object v13, v14, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 654
    .line 655
    invoke-static/range {v22 .. v22}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    iput-object v0, v14, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 660
    .line 661
    invoke-static {v10}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseSelectionFlags(Ljava/lang/String;)I

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    iput v0, v14, Landroidx/media3/common/v;->e:I

    .line 666
    .line 667
    invoke-static {v10, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseRoleFlags(Ljava/lang/String;Ljava/util/Map;)I

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    iput v0, v14, Landroidx/media3/common/v;->f:I

    .line 672
    .line 673
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_LANGUAGE:Ljava/util/regex/Pattern;

    .line 674
    .line 675
    invoke-static {v10, v0, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    iput-object v0, v14, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 680
    .line 681
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_URI:Ljava/util/regex/Pattern;

    .line 682
    .line 683
    invoke-static {v10, v0, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    if-nez v0, :cond_13

    .line 688
    .line 689
    const/4 v0, 0x0

    .line 690
    goto :goto_f

    .line 691
    :cond_13
    invoke-static {v1, v0}, Lh1/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    :goto_f
    new-instance v15, Landroidx/media3/common/t0;

    .line 696
    .line 697
    new-instance v1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    .line 698
    .line 699
    move-object/from16 v23, v3

    .line 700
    .line 701
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 702
    .line 703
    invoke-direct {v1, v12, v13, v3}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 704
    .line 705
    .line 706
    move-object/from16 v24, v1

    .line 707
    .line 708
    const/4 v3, 0x1

    .line 709
    new-array v1, v3, [Landroidx/media3/common/s0;

    .line 710
    .line 711
    aput-object v24, v1, v16

    .line 712
    .line 713
    invoke-direct {v15, v1}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 714
    .line 715
    .line 716
    sget-object v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_TYPE:Ljava/util/regex/Pattern;

    .line 717
    .line 718
    invoke-static {v10, v1, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    move/from16 v24, v3

    .line 730
    .line 731
    sparse-switch v24, :sswitch_data_0

    .line 732
    .line 733
    .line 734
    :goto_10
    const/4 v1, -0x1

    .line 735
    goto :goto_11

    .line 736
    :sswitch_0
    const-string v3, "VIDEO"

    .line 737
    .line 738
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v1

    .line 742
    if-nez v1, :cond_14

    .line 743
    .line 744
    goto :goto_10

    .line 745
    :cond_14
    const/4 v1, 0x3

    .line 746
    goto :goto_11

    .line 747
    :sswitch_1
    const-string v3, "AUDIO"

    .line 748
    .line 749
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    if-nez v1, :cond_15

    .line 754
    .line 755
    goto :goto_10

    .line 756
    :cond_15
    const/4 v1, 0x2

    .line 757
    goto :goto_11

    .line 758
    :sswitch_2
    const-string v3, "CLOSED-CAPTIONS"

    .line 759
    .line 760
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-result v1

    .line 764
    if-nez v1, :cond_16

    .line 765
    .line 766
    goto :goto_10

    .line 767
    :cond_16
    const/4 v1, 0x1

    .line 768
    goto :goto_11

    .line 769
    :sswitch_3
    const-string v3, "SUBTITLES"

    .line 770
    .line 771
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v1

    .line 775
    if-nez v1, :cond_17

    .line 776
    .line 777
    goto :goto_10

    .line 778
    :cond_17
    move/from16 v1, v16

    .line 779
    .line 780
    :goto_11
    packed-switch v1, :pswitch_data_0

    .line 781
    .line 782
    .line 783
    :goto_12
    move-object/from16 v26, v4

    .line 784
    .line 785
    :cond_18
    :goto_13
    move-object/from16 v0, v17

    .line 786
    .line 787
    goto/16 :goto_1a

    .line 788
    .line 789
    :pswitch_0
    invoke-static {v2, v12}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getVariantWithVideoGroup(Ljava/util/ArrayList;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    if-eqz v1, :cond_19

    .line 794
    .line 795
    iget-object v1, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 796
    .line 797
    iget-object v3, v1, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 798
    .line 799
    const/4 v10, 0x2

    .line 800
    invoke-static {v10, v3}, Lh1/i0;->w(ILjava/lang/String;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    iput-object v3, v14, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 805
    .line 806
    invoke-static {v3}, Landroidx/media3/common/u0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    invoke-static {v3}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v3

    .line 814
    iput-object v3, v14, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 815
    .line 816
    iget v3, v1, Landroidx/media3/common/w;->u:I

    .line 817
    .line 818
    iput v3, v14, Landroidx/media3/common/v;->t:I

    .line 819
    .line 820
    iget v3, v1, Landroidx/media3/common/w;->v:I

    .line 821
    .line 822
    iput v3, v14, Landroidx/media3/common/v;->u:I

    .line 823
    .line 824
    iget v1, v1, Landroidx/media3/common/w;->w:F

    .line 825
    .line 826
    iput v1, v14, Landroidx/media3/common/v;->v:F

    .line 827
    .line 828
    :cond_19
    if-nez v0, :cond_1a

    .line 829
    .line 830
    goto :goto_12

    .line 831
    :cond_1a
    iput-object v15, v14, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 832
    .line 833
    new-instance v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;

    .line 834
    .line 835
    new-instance v3, Landroidx/media3/common/w;

    .line 836
    .line 837
    invoke-direct {v3, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 838
    .line 839
    .line 840
    invoke-direct {v1, v0, v3, v12, v13}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;-><init>(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    goto :goto_12

    .line 847
    :pswitch_1
    invoke-static {v2, v12}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getVariantWithAudioGroup(Ljava/util/ArrayList;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    if-eqz v1, :cond_1b

    .line 852
    .line 853
    iget-object v3, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 854
    .line 855
    iget-object v3, v3, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 856
    .line 857
    move-object/from16 v25, v1

    .line 858
    .line 859
    const/4 v1, 0x1

    .line 860
    invoke-static {v1, v3}, Lh1/i0;->w(ILjava/lang/String;)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    iput-object v3, v14, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 865
    .line 866
    invoke-static {v3}, Landroidx/media3/common/u0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    goto :goto_14

    .line 871
    :cond_1b
    move-object/from16 v25, v1

    .line 872
    .line 873
    const/4 v3, 0x0

    .line 874
    :goto_14
    sget-object v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CHANNELS:Ljava/util/regex/Pattern;

    .line 875
    .line 876
    invoke-static {v10, v1, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    if-eqz v1, :cond_1c

    .line 881
    .line 882
    sget v10, Lh1/i0;->a:I

    .line 883
    .line 884
    const-string v10, "/"

    .line 885
    .line 886
    move-object/from16 v26, v4

    .line 887
    .line 888
    const/4 v4, 0x2

    .line 889
    invoke-virtual {v1, v10, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v4

    .line 893
    aget-object v4, v4, v16

    .line 894
    .line 895
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 896
    .line 897
    .line 898
    move-result v4

    .line 899
    iput v4, v14, Landroidx/media3/common/v;->B:I

    .line 900
    .line 901
    const-string v4, "audio/eac3"

    .line 902
    .line 903
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v4

    .line 907
    if-eqz v4, :cond_1d

    .line 908
    .line 909
    const-string v4, "/JOC"

    .line 910
    .line 911
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    if-eqz v1, :cond_1d

    .line 916
    .line 917
    const-string v1, "ec+3"

    .line 918
    .line 919
    iput-object v1, v14, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 920
    .line 921
    const-string v3, "audio/eac3-joc"

    .line 922
    .line 923
    goto :goto_15

    .line 924
    :cond_1c
    move-object/from16 v26, v4

    .line 925
    .line 926
    :cond_1d
    :goto_15
    invoke-static {v3}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    iput-object v1, v14, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 931
    .line 932
    if-eqz v0, :cond_1e

    .line 933
    .line 934
    iput-object v15, v14, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 935
    .line 936
    new-instance v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;

    .line 937
    .line 938
    new-instance v3, Landroidx/media3/common/w;

    .line 939
    .line 940
    invoke-direct {v3, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 941
    .line 942
    .line 943
    invoke-direct {v1, v0, v3, v12, v13}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;-><init>(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    goto/16 :goto_13

    .line 950
    .line 951
    :cond_1e
    if-eqz v25, :cond_18

    .line 952
    .line 953
    new-instance v0, Landroidx/media3/common/w;

    .line 954
    .line 955
    invoke-direct {v0, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 956
    .line 957
    .line 958
    move-object/from16 v3, p0

    .line 959
    .line 960
    move-object v8, v0

    .line 961
    :goto_16
    move-object/from16 v0, v17

    .line 962
    .line 963
    goto/16 :goto_1b

    .line 964
    .line 965
    :pswitch_2
    move-object/from16 v26, v4

    .line 966
    .line 967
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_INSTREAM_ID:Ljava/util/regex/Pattern;

    .line 968
    .line 969
    invoke-static {v10, v0, v11}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    const-string v1, "CC"

    .line 974
    .line 975
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 976
    .line 977
    .line 978
    move-result v1

    .line 979
    if-eqz v1, :cond_1f

    .line 980
    .line 981
    const/4 v4, 0x2

    .line 982
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    const-string v1, "application/cea-608"

    .line 991
    .line 992
    goto :goto_17

    .line 993
    :cond_1f
    const/4 v1, 0x7

    .line 994
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 999
    .line 1000
    .line 1001
    move-result v0

    .line 1002
    const-string v1, "application/cea-708"

    .line 1003
    .line 1004
    :goto_17
    if-nez p0, :cond_20

    .line 1005
    .line 1006
    new-instance v3, Ljava/util/ArrayList;

    .line 1007
    .line 1008
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_18

    .line 1012
    :cond_20
    move-object/from16 v3, p0

    .line 1013
    .line 1014
    :goto_18
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    iput-object v1, v14, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 1019
    .line 1020
    iput v0, v14, Landroidx/media3/common/v;->G:I

    .line 1021
    .line 1022
    new-instance v0, Landroidx/media3/common/w;

    .line 1023
    .line 1024
    invoke-direct {v0, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1028
    .line 1029
    .line 1030
    goto :goto_16

    .line 1031
    :pswitch_3
    move-object/from16 v26, v4

    .line 1032
    .line 1033
    invoke-static {v2, v12}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->getVariantWithSubtitleGroup(Ljava/util/ArrayList;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    if-eqz v1, :cond_21

    .line 1038
    .line 1039
    iget-object v1, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 1040
    .line 1041
    iget-object v1, v1, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 1042
    .line 1043
    const/4 v3, 0x3

    .line 1044
    invoke-static {v3, v1}, Lh1/i0;->w(ILjava/lang/String;)Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    iput-object v1, v14, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 1049
    .line 1050
    invoke-static {v1}, Landroidx/media3/common/u0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    goto :goto_19

    .line 1055
    :cond_21
    const/4 v1, 0x0

    .line 1056
    :goto_19
    if-nez v1, :cond_22

    .line 1057
    .line 1058
    const-string v1, "text/vtt"

    .line 1059
    .line 1060
    :cond_22
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    iput-object v1, v14, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 1065
    .line 1066
    iput-object v15, v14, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 1067
    .line 1068
    if-eqz v0, :cond_23

    .line 1069
    .line 1070
    new-instance v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;

    .line 1071
    .line 1072
    new-instance v3, Landroidx/media3/common/w;

    .line 1073
    .line 1074
    invoke-direct {v3, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 1075
    .line 1076
    .line 1077
    invoke-direct {v1, v0, v3, v12, v13}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;-><init>(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/lang/String;Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    move-object/from16 v0, v17

    .line 1081
    .line 1082
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    goto :goto_1a

    .line 1086
    :cond_23
    move-object/from16 v0, v17

    .line 1087
    .line 1088
    const-string v1, "HlsPlaylistParser"

    .line 1089
    .line 1090
    const-string v3, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    .line 1091
    .line 1092
    invoke-static {v1, v3}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    :goto_1a
    move-object/from16 v3, p0

    .line 1096
    .line 1097
    :goto_1b
    add-int/lit8 v7, v7, 0x1

    .line 1098
    .line 1099
    move-object/from16 v1, p1

    .line 1100
    .line 1101
    move-object/from16 v17, v0

    .line 1102
    .line 1103
    move-object v0, v3

    .line 1104
    move-object/from16 v3, v23

    .line 1105
    .line 1106
    move-object/from16 v4, v26

    .line 1107
    .line 1108
    goto/16 :goto_e

    .line 1109
    .line 1110
    :cond_24
    move-object/from16 p0, v0

    .line 1111
    .line 1112
    move-object/from16 v26, v4

    .line 1113
    .line 1114
    move-object/from16 v0, v17

    .line 1115
    .line 1116
    if-eqz v9, :cond_25

    .line 1117
    .line 1118
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1119
    .line 1120
    move-object v9, v1

    .line 1121
    :goto_1c
    move-object/from16 v17, v0

    .line 1122
    .line 1123
    goto :goto_1d

    .line 1124
    :cond_25
    move-object/from16 v9, p0

    .line 1125
    .line 1126
    goto :goto_1c

    .line 1127
    :goto_1d
    new-instance v0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    .line 1128
    .line 1129
    move-object/from16 v1, p1

    .line 1130
    .line 1131
    move-object v3, v6

    .line 1132
    move-object/from16 v6, v17

    .line 1133
    .line 1134
    move-object/from16 v7, v19

    .line 1135
    .line 1136
    move-object/from16 v2, v20

    .line 1137
    .line 1138
    move-object/from16 v4, v26

    .line 1139
    .line 1140
    move-object/from16 v12, v29

    .line 1141
    .line 1142
    move/from16 v10, v30

    .line 1143
    .line 1144
    invoke-direct/range {v0 .. v12}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/media3/common/w;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    .line 1145
    .line 1146
    .line 1147
    return-object v0

    .line 1148
    nop

    .line 1149
    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch

    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "YES"

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    return p2
.end method

.method private static parseOptionalDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;D)D
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_0
    return-wide p2
.end method

.method private static parseOptionalIntAttr(Ljava/lang/String;Ljava/util/regex/Pattern;I)I
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    return p2
.end method

.method private static parseOptionalLongAttr(Ljava/lang/String;Ljava/util/regex/Pattern;J)J
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_0
    return-wide p2
.end method

.method private static parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 2
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {p2, p3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->replaceVariableReferences(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object p2
.end method

.method private static parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0, p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static parseRoleFlags(Ljava/lang/String;Ljava/util/Map;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CHARACTERISTICS:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    sget p1, Lh1/i0;->a:I

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    const-string v1, ","

    .line 19
    .line 20
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "public.accessibility.describes-video"

    .line 25
    .line 26
    invoke-static {p0, p1}, Lh1/i0;->l([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/16 v0, 0x200

    .line 33
    .line 34
    :cond_1
    const-string p1, "public.accessibility.transcribes-spoken-dialog"

    .line 35
    .line 36
    invoke-static {p0, p1}, Lh1/i0;->l([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    or-int/lit16 v0, v0, 0x1000

    .line 43
    .line 44
    :cond_2
    const-string p1, "public.accessibility.describes-music-and-sound"

    .line 45
    .line 46
    invoke-static {p0, p1}, Lh1/i0;->l([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    or-int/lit16 v0, v0, 0x400

    .line 53
    .line 54
    :cond_3
    const-string p1, "public.easy-to-read"

    .line 55
    .line 56
    invoke-static {p0, p1}, Lh1/i0;->l([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    or-int/lit16 p0, v0, 0x2000

    .line 63
    .line 64
    return p0

    .line 65
    :cond_4
    return v0
.end method

.method private static parseSelectionFlags(Ljava/lang/String;)I
    .locals 3

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_DEFAULT:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget-object v2, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_FORCED:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    invoke-static {p0, v2, v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    :cond_0
    sget-object v2, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_AUTOSELECT:Ljava/util/regex/Pattern;

    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    or-int/lit8 p0, v0, 0x4

    .line 27
    .line 28
    return p0

    .line 29
    :cond_1
    return v0
.end method

.method private static parseServerControl(Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$ServerControl;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CAN_SKIP_UNTIL:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    const-wide/high16 v2, -0x3c20000000000000L    # -9.223372036854776E18

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    cmpl-double v1, v4, v2

    .line 12
    .line 13
    const-wide v6, 0x412e848000000000L    # 1000000.0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move-wide v11, v8

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    mul-double/2addr v4, v6

    .line 28
    double-to-long v4, v4

    .line 29
    move-wide v11, v4

    .line 30
    :goto_0
    sget-object v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CAN_SKIP_DATE_RANGES:Ljava/util/regex/Pattern;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static {v0, v1, v4}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v13

    .line 37
    sget-object v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_HOLD_BACK:Ljava/util/regex/Pattern;

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 40
    .line 41
    .line 42
    move-result-wide v14

    .line 43
    cmpl-double v1, v14, v2

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    move-wide v14, v8

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    mul-double/2addr v14, v6

    .line 50
    double-to-long v14, v14

    .line 51
    :goto_1
    sget-object v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_PART_HOLD_BACK:Ljava/util/regex/Pattern;

    .line 52
    .line 53
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalDoubleAttr(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v16

    .line 57
    cmpl-double v1, v16, v2

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    :goto_2
    move-wide/from16 v16, v8

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    mul-double v1, v16, v6

    .line 65
    .line 66
    double-to-long v8, v1

    .line 67
    goto :goto_2

    .line 68
    :goto_3
    sget-object v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_CAN_BLOCK_RELOAD:Ljava/util/regex/Pattern;

    .line 69
    .line 70
    invoke-static {v0, v1, v4}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalBooleanAttribute(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v18

    .line 74
    new-instance v10, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$ServerControl;

    .line 75
    .line 76
    invoke-direct/range {v10 .. v18}, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$ServerControl;-><init>(JZJJZ)V

    .line 77
    .line 78
    .line 79
    return-object v10
.end method

.method private static parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseOptionalStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v0, "Couldn\'t match "

    .line 11
    .line 12
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, " in "

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-static {p0, p1}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0
.end method

.method private static parseTimeSecondsToUs(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseStringAttr(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance p1, Ljava/math/BigDecimal;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/math/BigDecimal;

    .line 13
    .line 14
    const-wide/32 v0, 0xf4240

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Ljava/math/BigDecimal;-><init>(J)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method private static replaceVariableReferences(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->REGEX_VARIABLE_REFERENCE:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/lang/StringBuffer;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method private static skipIgnorableWhitespace(Ljava/io/BufferedReader;ZI)I
    .locals 1

    .line 1
    :goto_0
    const/4 v0, -0x1

    .line 2
    if-eq p2, v0, :cond_1

    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-static {p2}, Lh1/i0;->P(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return p2
.end method


# virtual methods
.method public parse(Landroid/net/Uri;Ljava/io/InputStream;)Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;
    .locals 4

    .line 2
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 3
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 4
    :try_start_0
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->checkPlaylistHeader(Ljava/io/BufferedReader;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 5
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    const-string v3, "#EXT-X-STREAM-INF"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 9
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;

    invoke-direct {v1, p2, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseMultivariantPlaylist(Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-static {v0}, Lh1/i0;->g(Ljava/io/Closeable;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 12
    :cond_1
    :try_start_1
    const-string v3, "#EXT-X-TARGETDURATION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-MEDIA-SEQUENCE"

    .line 13
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXTINF"

    .line 14
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-KEY"

    .line 15
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-BYTERANGE"

    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-DISCONTINUITY"

    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-ENDLIST"

    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_3
    :goto_1
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->multivariantPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    iget-object v2, p0, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->previousMediaPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;

    new-instance v3, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;

    invoke-direct {v3, p2, v0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    .line 23
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-static {v1, v2, v3, p1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parseMediaPlaylist(Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$LineIterator;Ljava/lang/String;)Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    invoke-static {v0}, Lh1/i0;->g(Ljava/io/Closeable;)V

    return-object p1

    :cond_4
    invoke-static {v0}, Lh1/i0;->g(Ljava/io/Closeable;)V

    .line 26
    const-string p1, "Failed to parse the playlist, could not identify any tags."

    invoke-static {p1, v2}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    move-result-object p1

    throw p1

    .line 27
    :cond_5
    :try_start_2
    const-string p1, "Input does not start with the #EXTM3U header."

    invoke-static {p1, v2}, Landroidx/media3/common/v0;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    :goto_2
    invoke-static {v0}, Lh1/i0;->g(Ljava/io/Closeable;)V

    .line 29
    throw p1
.end method

.method public bridge synthetic parse(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser;->parse(Landroid/net/Uri;Ljava/io/InputStream;)Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;

    move-result-object p1

    return-object p1
.end method
