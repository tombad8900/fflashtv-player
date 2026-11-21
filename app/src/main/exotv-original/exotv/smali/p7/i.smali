.class public abstract Lp7/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:I

.field public static final b:Lm7/s;

.field public static final c:Lm7/s;

.field public static final d:Lm7/s;

.field public static final e:Lm7/s;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lm7/a;->h(Ljava/lang/String;II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lp7/i;->a:I

    .line 12
    .line 13
    new-instance v0, Lm7/s;

    .line 14
    .line 15
    const-string v1, "PERMIT"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v0, v1, v3}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lp7/i;->b:Lm7/s;

    .line 22
    .line 23
    new-instance v0, Lm7/s;

    .line 24
    .line 25
    const-string v1, "TAKEN"

    .line 26
    .line 27
    invoke-direct {v0, v1, v3}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lp7/i;->c:Lm7/s;

    .line 31
    .line 32
    new-instance v0, Lm7/s;

    .line 33
    .line 34
    const-string v1, "BROKEN"

    .line 35
    .line 36
    invoke-direct {v0, v1, v3}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lp7/i;->d:Lm7/s;

    .line 40
    .line 41
    new-instance v0, Lm7/s;

    .line 42
    .line 43
    const-string v1, "CANCELLED"

    .line 44
    .line 45
    invoke-direct {v0, v1, v3}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lp7/i;->e:Lm7/s;

    .line 49
    .line 50
    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Lm7/a;->h(Ljava/lang/String;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sput v0, Lp7/i;->f:I

    .line 59
    .line 60
    return-void
.end method
