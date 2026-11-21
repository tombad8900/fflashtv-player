.class public final Lj6/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final d:Lj6/d;


# instance fields
.field public final a:Lj6/q;

.field public final b:Lj6/o;

.field public c:Lj6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj6/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lj6/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj6/d;->d:Lj6/d;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lj6/d;->a:Lj6/q;

    .line 6
    iput-object v0, p0, Lj6/d;->b:Lj6/o;

    return-void
.end method

.method public constructor <init>(Lj6/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj6/d;->a:Lj6/q;

    .line 3
    sget-object p1, Lj6/o;->j:Lj6/o;

    iput-object p1, p0, Lj6/d;->b:Lj6/o;

    return-void
.end method
