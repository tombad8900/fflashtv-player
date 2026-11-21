.class public final Lr/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final d:Lr/c;


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/concurrent/Executor;

.field public c:Lr/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lr/c;-><init>(Lj6/q;Lj6/o;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr/c;->d:Lr/c;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lj6/q;Lj6/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/c;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    iput-object p2, p0, Lr/c;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    return-void
.end method
