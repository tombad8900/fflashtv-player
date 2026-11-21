.class public abstract Lokhttp3/internal/ws/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field private static final EMPTY_DEFLATE_BLOCK:Lv7/m;

.field private static final LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION:I = 0x4


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lv7/m;->m:Lv7/m;

    .line 2
    .line 3
    const-string v0, "000000ffff"

    .line 4
    .line 5
    invoke-static {v0}, Lk2/b;->n(Ljava/lang/String;)Lv7/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lokhttp3/internal/ws/b;->EMPTY_DEFLATE_BLOCK:Lv7/m;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic access$getEMPTY_DEFLATE_BLOCK$p()Lv7/m;
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/ws/b;->EMPTY_DEFLATE_BLOCK:Lv7/m;

    .line 2
    .line 3
    return-object v0
.end method
