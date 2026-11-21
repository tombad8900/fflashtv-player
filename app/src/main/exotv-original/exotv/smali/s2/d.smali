.class public final Ls2/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final c:Lj0/a;


# instance fields
.field public final a:Ls2/e;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj0/a;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lj0/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls2/d;->c:Lj0/a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ls2/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls2/d;->a:Ls2/e;

    .line 5
    .line 6
    iput p2, p0, Ls2/d;->b:I

    .line 7
    .line 8
    return-void
.end method
