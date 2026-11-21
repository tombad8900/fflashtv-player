.class public final Landroidx/media3/exoplayer/upstream/CmcdData;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;,
        Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;,
        Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;,
        Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;,
        Landroidx/media3/exoplayer/upstream/CmcdData$ObjectType;,
        Landroidx/media3/exoplayer/upstream/CmcdData$StreamType;,
        Landroidx/media3/exoplayer/upstream/CmcdData$StreamingFormat;,
        Landroidx/media3/exoplayer/upstream/CmcdData$Factory;
    }
.end annotation


# static fields
.field private static final COMMA_JOINER:Le6/e;


# instance fields
.field private final cmcdObject:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;

.field private final cmcdRequest:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;

.field private final cmcdSession:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;

.field private final cmcdStatus:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;

.field private final dataTransmissionMode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le6/e;

    .line 2
    .line 3
    const-string v1, ","

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le6/e;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroidx/media3/exoplayer/upstream/CmcdData;->COMMA_JOINER:Le6/e;

    .line 9
    .line 10
    return-void
.end method

.method private constructor <init>(Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdObject:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdRequest:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;

    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdSession:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;

    .line 6
    iput-object p4, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdStatus:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;

    .line 7
    iput p5, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->dataTransmissionMode:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;ILandroidx/media3/exoplayer/upstream/CmcdData$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/media3/exoplayer/upstream/CmcdData;-><init>(Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;I)V

    return-void
.end method


# virtual methods
.method public addToDataSpec(Lk1/l;)Lk1/l;
    .locals 12

    .line 1
    new-instance v0, Lf6/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lf6/r;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdObject:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/upstream/CmcdData$CmcdObject;->populateCmcdDataMap(Lf6/r;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdRequest:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/upstream/CmcdData$CmcdRequest;->populateCmcdDataMap(Lf6/r;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdSession:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/upstream/CmcdData$CmcdSession;->populateCmcdDataMap(Lf6/r;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->cmcdStatus:Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/upstream/CmcdData$CmcdStatus;->populateCmcdDataMap(Lf6/r;)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Landroidx/media3/exoplayer/upstream/CmcdData;->dataTransmissionMode:I

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    new-instance v1, Lf6/p0;

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    invoke-direct {v1, v2}, Lf6/p0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Lf6/q;->k:Ljava/util/Set;

    .line 37
    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Lf6/b;->h()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iput-object v2, v0, Lf6/q;->k:Ljava/util/Set;

    .line 45
    .line 46
    :cond_0
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Lf6/b;->get(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    sget-object v5, Landroidx/media3/exoplayer/upstream/CmcdData;->COMMA_JOINER:Le6/e;

    .line 70
    .line 71
    invoke-virtual {v5, v4}, Le6/e;->b(Ljava/util/List;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v1, v3, v4}, Lf6/p0;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v1}, Lf6/p0;->a()Lf6/q1;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v5, Ljava/util/HashMap;

    .line 87
    .line 88
    iget-object v1, p1, Lk1/l;->d:Ljava/util/Map;

    .line 89
    .line 90
    invoke-direct {v5, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lk1/l;

    .line 97
    .line 98
    iget-object v2, p1, Lk1/l;->a:Landroid/net/Uri;

    .line 99
    .line 100
    iget v3, p1, Lk1/l;->b:I

    .line 101
    .line 102
    iget-object v4, p1, Lk1/l;->c:[B

    .line 103
    .line 104
    iget-wide v6, p1, Lk1/l;->e:J

    .line 105
    .line 106
    iget-wide v8, p1, Lk1/l;->f:J

    .line 107
    .line 108
    iget-object v10, p1, Lk1/l;->g:Ljava/lang/String;

    .line 109
    .line 110
    iget v11, p1, Lk1/l;->h:I

    .line 111
    .line 112
    invoke-direct/range {v1 .. v11}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    return-object v1

    .line 116
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lf6/b;->b()Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_3

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Ljava/util/Collection;

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p1, Lk1/l;->a:Landroid/net/Uri;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sget-object v2, Landroidx/media3/exoplayer/upstream/CmcdData;->COMMA_JOINER:Le6/e;

    .line 159
    .line 160
    invoke-virtual {v2, v1}, Le6/e;->b(Ljava/util/List;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    const-string v2, "CMCD"

    .line 165
    .line 166
    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {p1}, Lk1/l;->a()Lk1/k;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iput-object v0, p1, Lk1/k;->e:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-virtual {p1}, Lk1/k;->d()Lk1/l;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1
.end method
