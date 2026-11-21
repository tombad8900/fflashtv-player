.class public final Li3/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final c:Li3/i;


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li3/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Li3/i;-><init>(ZI)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li3/i;->c:Li3/i;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Li3/i;->a:Z

    .line 5
    .line 6
    iput p2, p0, Li3/i;->b:I

    .line 7
    .line 8
    return-void
.end method
