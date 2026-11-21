.class public Landroidx/media3/common/u1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field private audioOffloadPreferences:Landroidx/media3/common/t1;

.field private disabledTrackTypes:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private forceHighestSupportedBitrate:Z

.field private forceLowestBitrate:Z

.field private ignoredTextSelectionFlags:I

.field private isPrioritizeImageOverVideoEnabled:Z

.field private maxAudioBitrate:I

.field private maxAudioChannelCount:I

.field private maxVideoBitrate:I

.field private maxVideoFrameRate:I

.field private maxVideoHeight:I

.field private maxVideoWidth:I

.field private minVideoBitrate:I

.field private minVideoFrameRate:I

.field private minVideoHeight:I

.field private minVideoWidth:I

.field private overrides:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/media3/common/q1;",
            "Landroidx/media3/common/r1;",
            ">;"
        }
    .end annotation
.end field

.field private preferredAudioLanguages:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field private preferredAudioMimeTypes:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field private preferredAudioRoleFlags:I

.field private preferredTextLanguages:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field private preferredTextRoleFlags:I

.field private preferredVideoMimeTypes:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field private preferredVideoRoleFlags:I

.field private selectUndeterminedTextLanguage:Z

.field private viewportHeight:I

.field private viewportOrientationMayChange:Z

.field private viewportWidth:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 2
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoWidth:I

    .line 3
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoHeight:I

    .line 4
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoFrameRate:I

    .line 5
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoBitrate:I

    .line 6
    iput v0, p0, Landroidx/media3/common/u1;->viewportWidth:I

    .line 7
    iput v0, p0, Landroidx/media3/common/u1;->viewportHeight:I

    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Landroidx/media3/common/u1;->viewportOrientationMayChange:Z

    .line 9
    sget-object v1, Lf6/m0;->k:Lf6/k0;

    .line 10
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 11
    iput-object v1, p0, Landroidx/media3/common/u1;->preferredVideoMimeTypes:Lf6/m0;

    const/4 v2, 0x0

    .line 12
    iput v2, p0, Landroidx/media3/common/u1;->preferredVideoRoleFlags:I

    .line 13
    iput-object v1, p0, Landroidx/media3/common/u1;->preferredAudioLanguages:Lf6/m0;

    .line 14
    iput v2, p0, Landroidx/media3/common/u1;->preferredAudioRoleFlags:I

    .line 15
    iput v0, p0, Landroidx/media3/common/u1;->maxAudioChannelCount:I

    .line 16
    iput v0, p0, Landroidx/media3/common/u1;->maxAudioBitrate:I

    .line 17
    iput-object v1, p0, Landroidx/media3/common/u1;->preferredAudioMimeTypes:Lf6/m0;

    .line 18
    sget-object v0, Landroidx/media3/common/t1;->d:Landroidx/media3/common/t1;

    iput-object v0, p0, Landroidx/media3/common/u1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 19
    iput-object v1, p0, Landroidx/media3/common/u1;->preferredTextLanguages:Lf6/m0;

    .line 20
    iput v2, p0, Landroidx/media3/common/u1;->preferredTextRoleFlags:I

    .line 21
    iput v2, p0, Landroidx/media3/common/u1;->ignoredTextSelectionFlags:I

    .line 22
    iput-boolean v2, p0, Landroidx/media3/common/u1;->selectUndeterminedTextLanguage:Z

    .line 23
    iput-boolean v2, p0, Landroidx/media3/common/u1;->isPrioritizeImageOverVideoEnabled:Z

    .line 24
    iput-boolean v2, p0, Landroidx/media3/common/u1;->forceLowestBitrate:Z

    .line 25
    iput-boolean v2, p0, Landroidx/media3/common/u1;->forceHighestSupportedBitrate:Z

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Landroidx/media3/common/u1;-><init>()V

    .line 29
    invoke-virtual {p0, p1}, Landroidx/media3/common/u1;->setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Landroid/content/Context;)Landroidx/media3/common/u1;

    const/4 v0, 0x1

    .line 30
    invoke-virtual {p0, p1, v0}, Landroidx/media3/common/u1;->setViewportSizeToPhysicalDisplaySize(Landroid/content/Context;Z)Landroidx/media3/common/u1;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 7

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-static {}, Landroidx/media3/common/v1;->access$000()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Landroidx/media3/common/v1;->DEFAULT_WITHOUT_CONTEXT:Landroidx/media3/common/v1;

    iget v2, v1, Landroidx/media3/common/v1;->maxVideoWidth:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->maxVideoWidth:I

    .line 33
    invoke-static {}, Landroidx/media3/common/v1;->access$100()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->maxVideoHeight:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->maxVideoHeight:I

    .line 34
    invoke-static {}, Landroidx/media3/common/v1;->access$200()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->maxVideoFrameRate:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->maxVideoFrameRate:I

    .line 35
    invoke-static {}, Landroidx/media3/common/v1;->access$300()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->maxVideoBitrate:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->maxVideoBitrate:I

    .line 36
    invoke-static {}, Landroidx/media3/common/v1;->access$400()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->minVideoWidth:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->minVideoWidth:I

    .line 37
    invoke-static {}, Landroidx/media3/common/v1;->access$500()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->minVideoHeight:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->minVideoHeight:I

    .line 38
    invoke-static {}, Landroidx/media3/common/v1;->access$600()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->minVideoFrameRate:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->minVideoFrameRate:I

    .line 39
    invoke-static {}, Landroidx/media3/common/v1;->access$700()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->minVideoBitrate:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->minVideoBitrate:I

    .line 40
    invoke-static {}, Landroidx/media3/common/v1;->access$800()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->viewportWidth:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->viewportWidth:I

    .line 41
    invoke-static {}, Landroidx/media3/common/v1;->access$900()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Landroidx/media3/common/v1;->viewportHeight:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->viewportHeight:I

    .line 42
    invoke-static {}, Landroidx/media3/common/v1;->access$1000()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Landroidx/media3/common/v1;->viewportOrientationMayChange:Z

    .line 43
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/common/u1;->viewportOrientationMayChange:Z

    .line 44
    invoke-static {}, Landroidx/media3/common/v1;->access$1100()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/bumptech/glide/d;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 45
    invoke-static {v0}, Lf6/m0;->k([Ljava/lang/Object;)Lf6/l1;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/common/u1;->preferredVideoMimeTypes:Lf6/m0;

    .line 46
    invoke-static {}, Landroidx/media3/common/v1;->access$1200()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Landroidx/media3/common/v1;->preferredVideoRoleFlags:I

    .line 47
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->preferredVideoRoleFlags:I

    .line 48
    invoke-static {}, Landroidx/media3/common/v1;->access$1300()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/bumptech/glide/d;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 49
    invoke-static {v0}, Landroidx/media3/common/u1;->b([Ljava/lang/String;)Lf6/l1;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/common/u1;->preferredAudioLanguages:Lf6/m0;

    .line 50
    invoke-static {}, Landroidx/media3/common/v1;->access$1400()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 51
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->preferredAudioRoleFlags:I

    .line 52
    invoke-static {}, Landroidx/media3/common/v1;->access$1500()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 53
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->maxAudioChannelCount:I

    .line 54
    invoke-static {}, Landroidx/media3/common/v1;->access$1600()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Landroidx/media3/common/v1;->maxAudioBitrate:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->maxAudioBitrate:I

    .line 55
    invoke-static {}, Landroidx/media3/common/v1;->access$1700()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/bumptech/glide/d;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 56
    invoke-static {v0}, Lf6/m0;->k([Ljava/lang/Object;)Lf6/l1;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/common/u1;->preferredAudioMimeTypes:Lf6/m0;

    .line 57
    invoke-static {}, Landroidx/media3/common/v1;->access$2700()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 58
    new-instance v3, Landroidx/media3/common/s1;

    invoke-direct {v3}, Landroidx/media3/common/s1;-><init>()V

    sget-object v4, Landroidx/media3/common/t1;->e:Ljava/lang/String;

    sget-object v5, Landroidx/media3/common/t1;->d:Landroidx/media3/common/t1;

    iget v6, v5, Landroidx/media3/common/t1;->a:I

    .line 59
    invoke-virtual {v0, v4, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 60
    iput v4, v3, Landroidx/media3/common/s1;->a:I

    .line 61
    sget-object v4, Landroidx/media3/common/t1;->f:Ljava/lang/String;

    iget-boolean v6, v5, Landroidx/media3/common/t1;->b:Z

    .line 62
    invoke-virtual {v0, v4, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 63
    iput-boolean v4, v3, Landroidx/media3/common/s1;->b:Z

    .line 64
    sget-object v4, Landroidx/media3/common/t1;->g:Ljava/lang/String;

    iget-boolean v5, v5, Landroidx/media3/common/t1;->c:Z

    .line 65
    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 66
    iput-boolean v0, v3, Landroidx/media3/common/s1;->c:Z

    .line 67
    new-instance v0, Landroidx/media3/common/t1;

    invoke-direct {v0, v3}, Landroidx/media3/common/t1;-><init>(Landroidx/media3/common/s1;)V

    goto :goto_0

    .line 68
    :cond_0
    new-instance v0, Landroidx/media3/common/s1;

    invoke-direct {v0}, Landroidx/media3/common/s1;-><init>()V

    .line 69
    invoke-static {}, Landroidx/media3/common/v1;->access$3000()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Landroidx/media3/common/t1;->d:Landroidx/media3/common/t1;

    iget v5, v4, Landroidx/media3/common/t1;->a:I

    .line 70
    invoke-virtual {p1, v3, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 71
    iput v3, v0, Landroidx/media3/common/s1;->a:I

    .line 72
    invoke-static {}, Landroidx/media3/common/v1;->access$2900()Ljava/lang/String;

    move-result-object v3

    iget-boolean v5, v4, Landroidx/media3/common/t1;->b:Z

    .line 73
    invoke-virtual {p1, v3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 74
    iput-boolean v3, v0, Landroidx/media3/common/s1;->b:Z

    .line 75
    invoke-static {}, Landroidx/media3/common/v1;->access$2800()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, v4, Landroidx/media3/common/t1;->c:Z

    .line 76
    invoke-virtual {p1, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 77
    iput-boolean v3, v0, Landroidx/media3/common/s1;->c:Z

    .line 78
    new-instance v3, Landroidx/media3/common/t1;

    invoke-direct {v3, v0}, Landroidx/media3/common/t1;-><init>(Landroidx/media3/common/s1;)V

    move-object v0, v3

    .line 79
    :goto_0
    iput-object v0, p0, Landroidx/media3/common/u1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 80
    invoke-static {}, Landroidx/media3/common/v1;->access$1800()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/bumptech/glide/d;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 81
    invoke-static {v0}, Landroidx/media3/common/u1;->b([Ljava/lang/String;)Lf6/l1;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/common/u1;->preferredTextLanguages:Lf6/m0;

    .line 82
    invoke-static {}, Landroidx/media3/common/v1;->access$1900()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Landroidx/media3/common/v1;->preferredTextRoleFlags:I

    .line 83
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->preferredTextRoleFlags:I

    .line 84
    invoke-static {}, Landroidx/media3/common/v1;->access$2000()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Landroidx/media3/common/v1;->ignoredTextSelectionFlags:I

    .line 85
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/common/u1;->ignoredTextSelectionFlags:I

    .line 86
    invoke-static {}, Landroidx/media3/common/v1;->access$2100()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Landroidx/media3/common/v1;->selectUndeterminedTextLanguage:Z

    .line 87
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/common/u1;->selectUndeterminedTextLanguage:Z

    .line 88
    invoke-static {}, Landroidx/media3/common/v1;->access$2200()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Landroidx/media3/common/v1;->isPrioritizeImageOverVideoEnabled:Z

    .line 89
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/common/u1;->isPrioritizeImageOverVideoEnabled:Z

    .line 90
    invoke-static {}, Landroidx/media3/common/v1;->access$2300()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/common/u1;->forceLowestBitrate:Z

    .line 91
    invoke-static {}, Landroidx/media3/common/v1;->access$2400()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, v1, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 92
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/common/u1;->forceHighestSupportedBitrate:Z

    .line 93
    invoke-static {}, Landroidx/media3/common/v1;->access$2500()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_1

    .line 94
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    goto :goto_2

    .line 95
    :cond_1
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    move-result-object v1

    move v3, v2

    .line 96
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 97
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    .line 98
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    sget-object v5, Landroidx/media3/common/r1;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 100
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    invoke-static {v5}, Landroidx/media3/common/q1;->a(Landroid/os/Bundle;)Landroidx/media3/common/q1;

    move-result-object v5

    .line 102
    sget-object v6, Landroidx/media3/common/r1;->d:Ljava/lang/String;

    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v4

    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    new-instance v6, Landroidx/media3/common/r1;

    invoke-static {v4}, Lcom/bumptech/glide/d;->f([I)Ljava/util/List;

    move-result-object v4

    invoke-direct {v6, v5, v4}, Landroidx/media3/common/r1;-><init>(Landroidx/media3/common/q1;Ljava/util/List;)V

    .line 105
    invoke-virtual {v1, v6}, Lf6/g0;->a(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 106
    :cond_2
    invoke-virtual {v1}, Lf6/j0;->f()Lf6/l1;

    move-result-object v0

    .line 107
    :goto_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    move v1, v2

    .line 108
    :goto_3
    iget v3, v0, Lf6/l1;->m:I

    if-ge v1, v3, :cond_3

    .line 109
    invoke-virtual {v0, v1}, Lf6/l1;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/media3/common/r1;

    .line 110
    iget-object v4, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    iget-object v5, v3, Landroidx/media3/common/r1;->a:Landroidx/media3/common/q1;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 111
    :cond_3
    invoke-static {}, Landroidx/media3/common/v1;->access$2600()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    new-array v0, v2, [I

    invoke-static {p1, v0}, Lcom/bumptech/glide/d;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    .line 112
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    .line 113
    array-length v0, p1

    :goto_4
    if-ge v2, v0, :cond_4

    aget v1, p1, v2

    .line 114
    iget-object v3, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    return-void
.end method

.method public static synthetic access$3500(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->maxVideoWidth:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3600(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->maxVideoHeight:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3700(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->maxVideoFrameRate:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3800(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->maxVideoBitrate:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3900(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->minVideoWidth:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4000(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->minVideoHeight:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4100(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->minVideoFrameRate:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4200(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->minVideoBitrate:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4300(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->viewportWidth:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4400(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->viewportHeight:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4500(Landroidx/media3/common/u1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/common/u1;->viewportOrientationMayChange:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4600(Landroidx/media3/common/u1;)Lf6/m0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/common/u1;->preferredVideoMimeTypes:Lf6/m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$4700(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->preferredVideoRoleFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4800(Landroidx/media3/common/u1;)Lf6/m0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/common/u1;->preferredAudioLanguages:Lf6/m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$4900(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->preferredAudioRoleFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5000(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->maxAudioChannelCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5100(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->maxAudioBitrate:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5200(Landroidx/media3/common/u1;)Lf6/m0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/common/u1;->preferredAudioMimeTypes:Lf6/m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5300(Landroidx/media3/common/u1;)Landroidx/media3/common/t1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/common/u1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5400(Landroidx/media3/common/u1;)Lf6/m0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/common/u1;->preferredTextLanguages:Lf6/m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5500(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->preferredTextRoleFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5600(Landroidx/media3/common/u1;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/common/u1;->ignoredTextSelectionFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5700(Landroidx/media3/common/u1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/common/u1;->selectUndeterminedTextLanguage:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5800(Landroidx/media3/common/u1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/common/u1;->isPrioritizeImageOverVideoEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5900(Landroidx/media3/common/u1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/common/u1;->forceLowestBitrate:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$6000(Landroidx/media3/common/u1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/common/u1;->forceHighestSupportedBitrate:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$6100(Landroidx/media3/common/u1;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$6200(Landroidx/media3/common/u1;)Ljava/util/HashSet;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object p0
.end method

.method public static b([Ljava/lang/String;)Lf6/l1;
    .locals 4

    .line 1
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Lh1/i0;->T(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v0, v3}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Lf6/j0;->f()Lf6/l1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/media3/common/v1;)V
    .locals 2

    .line 1
    iget v0, p1, Landroidx/media3/common/v1;->maxVideoWidth:I

    .line 2
    .line 3
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoWidth:I

    .line 4
    .line 5
    iget v0, p1, Landroidx/media3/common/v1;->maxVideoHeight:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoHeight:I

    .line 8
    .line 9
    iget v0, p1, Landroidx/media3/common/v1;->maxVideoFrameRate:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoFrameRate:I

    .line 12
    .line 13
    iget v0, p1, Landroidx/media3/common/v1;->maxVideoBitrate:I

    .line 14
    .line 15
    iput v0, p0, Landroidx/media3/common/u1;->maxVideoBitrate:I

    .line 16
    .line 17
    iget v0, p1, Landroidx/media3/common/v1;->minVideoWidth:I

    .line 18
    .line 19
    iput v0, p0, Landroidx/media3/common/u1;->minVideoWidth:I

    .line 20
    .line 21
    iget v0, p1, Landroidx/media3/common/v1;->minVideoHeight:I

    .line 22
    .line 23
    iput v0, p0, Landroidx/media3/common/u1;->minVideoHeight:I

    .line 24
    .line 25
    iget v0, p1, Landroidx/media3/common/v1;->minVideoFrameRate:I

    .line 26
    .line 27
    iput v0, p0, Landroidx/media3/common/u1;->minVideoFrameRate:I

    .line 28
    .line 29
    iget v0, p1, Landroidx/media3/common/v1;->minVideoBitrate:I

    .line 30
    .line 31
    iput v0, p0, Landroidx/media3/common/u1;->minVideoBitrate:I

    .line 32
    .line 33
    iget v0, p1, Landroidx/media3/common/v1;->viewportWidth:I

    .line 34
    .line 35
    iput v0, p0, Landroidx/media3/common/u1;->viewportWidth:I

    .line 36
    .line 37
    iget v0, p1, Landroidx/media3/common/v1;->viewportHeight:I

    .line 38
    .line 39
    iput v0, p0, Landroidx/media3/common/u1;->viewportHeight:I

    .line 40
    .line 41
    iget-boolean v0, p1, Landroidx/media3/common/v1;->viewportOrientationMayChange:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Landroidx/media3/common/u1;->viewportOrientationMayChange:Z

    .line 44
    .line 45
    iget-object v0, p1, Landroidx/media3/common/v1;->preferredVideoMimeTypes:Lf6/m0;

    .line 46
    .line 47
    iput-object v0, p0, Landroidx/media3/common/u1;->preferredVideoMimeTypes:Lf6/m0;

    .line 48
    .line 49
    iget v0, p1, Landroidx/media3/common/v1;->preferredVideoRoleFlags:I

    .line 50
    .line 51
    iput v0, p0, Landroidx/media3/common/u1;->preferredVideoRoleFlags:I

    .line 52
    .line 53
    iget-object v0, p1, Landroidx/media3/common/v1;->preferredAudioLanguages:Lf6/m0;

    .line 54
    .line 55
    iput-object v0, p0, Landroidx/media3/common/u1;->preferredAudioLanguages:Lf6/m0;

    .line 56
    .line 57
    iget v0, p1, Landroidx/media3/common/v1;->preferredAudioRoleFlags:I

    .line 58
    .line 59
    iput v0, p0, Landroidx/media3/common/u1;->preferredAudioRoleFlags:I

    .line 60
    .line 61
    iget v0, p1, Landroidx/media3/common/v1;->maxAudioChannelCount:I

    .line 62
    .line 63
    iput v0, p0, Landroidx/media3/common/u1;->maxAudioChannelCount:I

    .line 64
    .line 65
    iget v0, p1, Landroidx/media3/common/v1;->maxAudioBitrate:I

    .line 66
    .line 67
    iput v0, p0, Landroidx/media3/common/u1;->maxAudioBitrate:I

    .line 68
    .line 69
    iget-object v0, p1, Landroidx/media3/common/v1;->preferredAudioMimeTypes:Lf6/m0;

    .line 70
    .line 71
    iput-object v0, p0, Landroidx/media3/common/u1;->preferredAudioMimeTypes:Lf6/m0;

    .line 72
    .line 73
    iget-object v0, p1, Landroidx/media3/common/v1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 74
    .line 75
    iput-object v0, p0, Landroidx/media3/common/u1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 76
    .line 77
    iget-object v0, p1, Landroidx/media3/common/v1;->preferredTextLanguages:Lf6/m0;

    .line 78
    .line 79
    iput-object v0, p0, Landroidx/media3/common/u1;->preferredTextLanguages:Lf6/m0;

    .line 80
    .line 81
    iget v0, p1, Landroidx/media3/common/v1;->preferredTextRoleFlags:I

    .line 82
    .line 83
    iput v0, p0, Landroidx/media3/common/u1;->preferredTextRoleFlags:I

    .line 84
    .line 85
    iget v0, p1, Landroidx/media3/common/v1;->ignoredTextSelectionFlags:I

    .line 86
    .line 87
    iput v0, p0, Landroidx/media3/common/u1;->ignoredTextSelectionFlags:I

    .line 88
    .line 89
    iget-boolean v0, p1, Landroidx/media3/common/v1;->selectUndeterminedTextLanguage:Z

    .line 90
    .line 91
    iput-boolean v0, p0, Landroidx/media3/common/u1;->selectUndeterminedTextLanguage:Z

    .line 92
    .line 93
    iget-boolean v0, p1, Landroidx/media3/common/v1;->isPrioritizeImageOverVideoEnabled:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Landroidx/media3/common/u1;->isPrioritizeImageOverVideoEnabled:Z

    .line 96
    .line 97
    iget-boolean v0, p1, Landroidx/media3/common/v1;->forceLowestBitrate:Z

    .line 98
    .line 99
    iput-boolean v0, p0, Landroidx/media3/common/u1;->forceLowestBitrate:Z

    .line 100
    .line 101
    iget-boolean v0, p1, Landroidx/media3/common/v1;->forceHighestSupportedBitrate:Z

    .line 102
    .line 103
    iput-boolean v0, p0, Landroidx/media3/common/u1;->forceHighestSupportedBitrate:Z

    .line 104
    .line 105
    new-instance v0, Ljava/util/HashSet;

    .line 106
    .line 107
    iget-object v1, p1, Landroidx/media3/common/v1;->disabledTrackTypes:Lf6/w0;

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    .line 113
    .line 114
    new-instance v0, Ljava/util/HashMap;

    .line 115
    .line 116
    iget-object p1, p1, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 117
    .line 118
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 122
    .line 123
    return-void
.end method

.method public addOverride(Landroidx/media3/common/r1;)Landroidx/media3/common/u1;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/media3/common/r1;->a:Landroidx/media3/common/q1;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public build()Landroidx/media3/common/v1;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/common/v1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/media3/common/v1;-><init>(Landroidx/media3/common/u1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public clearOverride(Landroidx/media3/common/q1;)Landroidx/media3/common/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public clearOverrides()Landroidx/media3/common/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public clearOverridesOfType(I)Landroidx/media3/common/u1;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/media3/common/r1;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/media3/common/r1;->a:Landroidx/media3/common/q1;

    .line 24
    .line 25
    iget v1, v1, Landroidx/media3/common/q1;->c:I

    .line 26
    .line 27
    if-ne v1, p1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object p0
.end method

.method public clearVideoSizeConstraints()Landroidx/media3/common/u1;
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0, v0}, Landroidx/media3/common/u1;->setMaxVideoSize(II)Landroidx/media3/common/u1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public setAudioOffloadPreferences(Landroidx/media3/common/t1;)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/common/u1;->audioOffloadPreferences:Landroidx/media3/common/t1;

    .line 2
    .line 3
    return-object p0
.end method

.method public setDisabledTrackTypes(Ljava/util/Set;)Landroidx/media3/common/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setForceHighestSupportedBitrate(Z)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/common/u1;->forceHighestSupportedBitrate:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setForceLowestBitrate(Z)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/common/u1;->forceLowestBitrate:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setIgnoredTextSelectionFlags(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->ignoredTextSelectionFlags:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxAudioBitrate(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->maxAudioBitrate:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxAudioChannelCount(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->maxAudioChannelCount:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxVideoBitrate(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->maxVideoBitrate:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxVideoFrameRate(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->maxVideoFrameRate:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxVideoSize(II)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->maxVideoWidth:I

    .line 2
    .line 3
    iput p2, p0, Landroidx/media3/common/u1;->maxVideoHeight:I

    .line 4
    .line 5
    return-object p0
.end method

.method public setMinVideoBitrate(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->minVideoBitrate:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setMinVideoFrameRate(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->minVideoFrameRate:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setMinVideoSize(II)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->minVideoWidth:I

    .line 2
    .line 3
    iput p2, p0, Landroidx/media3/common/u1;->minVideoHeight:I

    .line 4
    .line 5
    return-object p0
.end method

.method public setOverrideForType(Landroidx/media3/common/r1;)Landroidx/media3/common/u1;
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/media3/common/r1;->a:Landroidx/media3/common/q1;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/common/q1;->c:I

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/media3/common/u1;->clearOverridesOfType(I)Landroidx/media3/common/u1;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/common/u1;->overrides:Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object v1, p1, Landroidx/media3/common/r1;->a:Landroidx/media3/common/q1;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public varargs setPreferredAudioLanguages([Ljava/lang/String;)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/common/u1;->b([Ljava/lang/String;)Lf6/l1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/common/u1;->preferredAudioLanguages:Lf6/m0;

    .line 6
    .line 7
    return-object p0
.end method

.method public varargs setPreferredAudioMimeTypes([Ljava/lang/String;)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    invoke-static {p1}, Lf6/m0;->k([Ljava/lang/Object;)Lf6/l1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/common/u1;->preferredAudioMimeTypes:Lf6/m0;

    .line 6
    .line 7
    return-object p0
.end method

.method public setPreferredAudioRoleFlags(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->preferredAudioRoleFlags:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setPreferredTextLanguage(Ljava/lang/String;)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    new-array p1, p1, [Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/media3/common/u1;->setPreferredTextLanguages([Ljava/lang/String;)Landroidx/media3/common/u1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :cond_0
    filled-new-array {p1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/media3/common/u1;->setPreferredTextLanguages([Ljava/lang/String;)Landroidx/media3/common/u1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Landroid/content/Context;)Landroidx/media3/common/u1;
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, "captioning"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/16 v0, 0x440

    .line 32
    .line 33
    iput v0, p0, Landroidx/media3/common/u1;->preferredTextRoleFlags:I

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Landroidx/media3/common/u1;->preferredTextLanguages:Lf6/m0;

    .line 50
    .line 51
    :cond_2
    :goto_0
    return-object p0
.end method

.method public varargs setPreferredTextLanguages([Ljava/lang/String;)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/common/u1;->b([Ljava/lang/String;)Lf6/l1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/common/u1;->preferredTextLanguages:Lf6/m0;

    .line 6
    .line 7
    return-object p0
.end method

.method public setPreferredTextRoleFlags(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->preferredTextRoleFlags:I

    .line 2
    .line 3
    return-object p0
.end method

.method public varargs setPreferredVideoMimeTypes([Ljava/lang/String;)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    invoke-static {p1}, Lf6/m0;->k([Ljava/lang/Object;)Lf6/l1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/common/u1;->preferredVideoMimeTypes:Lf6/m0;

    .line 6
    .line 7
    return-object p0
.end method

.method public setPreferredVideoRoleFlags(I)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->preferredVideoRoleFlags:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setPrioritizeImageOverVideoEnabled(Z)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/common/u1;->isPrioritizeImageOverVideoEnabled:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setSelectUndeterminedTextLanguage(Z)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/common/u1;->selectUndeterminedTextLanguage:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setTrackTypeDisabled(IZ)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p2, p0, Landroidx/media3/common/u1;->disabledTrackTypes:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public setViewportSize(IIZ)Landroidx/media3/common/u1;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/u1;->viewportWidth:I

    .line 2
    .line 3
    iput p2, p0, Landroidx/media3/common/u1;->viewportHeight:I

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/media3/common/u1;->viewportOrientationMayChange:Z

    .line 6
    .line 7
    return-object p0
.end method

.method public setViewportSizeToPhysicalDisplaySize(Landroid/content/Context;Z)Landroidx/media3/common/u1;
    .locals 7

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const-string v0, "display"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-nez v0, :cond_1

    .line 21
    .line 22
    const-string v0, "window"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/view/WindowManager;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    sget v2, Lh1/i0;->a:I

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/Display;->getDisplayId()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_5

    .line 44
    .line 45
    invoke-static {p1}, Lh1/i0;->Q(Landroid/content/Context;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_5

    .line 50
    .line 51
    const/16 v3, 0x1c

    .line 52
    .line 53
    if-ge v2, v3, :cond_2

    .line 54
    .line 55
    const-string v3, "sys.display-size"

    .line 56
    .line 57
    invoke-static {v3}, Lh1/i0;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const-string v3, "vendor.display-size"

    .line 63
    .line 64
    invoke-static {v3}, Lh1/i0;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :goto_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const-string v5, "x"

    .line 79
    .line 80
    const/4 v6, -0x1

    .line 81
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    array-length v5, v4

    .line 86
    const/4 v6, 0x2

    .line 87
    if-ne v5, v6, :cond_3

    .line 88
    .line 89
    aget-object v1, v4, v1

    .line 90
    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const/4 v5, 0x1

    .line 96
    aget-object v4, v4, v5

    .line 97
    .line 98
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-lez v1, :cond_3

    .line 103
    .line 104
    if-lez v4, :cond_3

    .line 105
    .line 106
    new-instance v5, Landroid/graphics/Point;

    .line 107
    .line 108
    invoke-direct {v5, v1, v4}, Landroid/graphics/Point;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :catch_0
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v4, "Invalid display size: "

    .line 115
    .line 116
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v3, "Util"

    .line 127
    .line 128
    invoke-static {v3, v1}, Lh1/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    const-string v1, "Sony"

    .line 132
    .line 133
    sget-object v3, Lh1/i0;->c:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_5

    .line 140
    .line 141
    sget-object v1, Lh1/i0;->d:Ljava/lang/String;

    .line 142
    .line 143
    const-string v3, "BRAVIA"

    .line 144
    .line 145
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v1, "com.sony.dtv.hardware.panel.qfhd"

    .line 156
    .line 157
    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_5

    .line 162
    .line 163
    new-instance p1, Landroid/graphics/Point;

    .line 164
    .line 165
    const/16 v0, 0xf00

    .line 166
    .line 167
    const/16 v1, 0x870

    .line 168
    .line 169
    invoke-direct {p1, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 170
    .line 171
    .line 172
    :goto_2
    move-object v5, p1

    .line 173
    goto :goto_3

    .line 174
    :cond_5
    new-instance p1, Landroid/graphics/Point;

    .line 175
    .line 176
    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    .line 177
    .line 178
    .line 179
    const/16 v1, 0x17

    .line 180
    .line 181
    if-lt v2, v1, :cond_6

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Landroid/view/Display$Mode;->getPhysicalWidth()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    iput v1, p1, Landroid/graphics/Point;->x:I

    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/view/Display$Mode;->getPhysicalHeight()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iput v0, p1, Landroid/graphics/Point;->y:I

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_6
    invoke-virtual {v0, p1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :goto_3
    iget p1, v5, Landroid/graphics/Point;->x:I

    .line 205
    .line 206
    iget v0, v5, Landroid/graphics/Point;->y:I

    .line 207
    .line 208
    invoke-virtual {p0, p1, v0, p2}, Landroidx/media3/common/u1;->setViewportSize(IIZ)Landroidx/media3/common/u1;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1
.end method
