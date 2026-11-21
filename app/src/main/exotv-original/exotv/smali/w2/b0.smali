.class public final Lw2/b0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final e:Lj0/a;

.field public static final f:Lj0/a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj0/a;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lj0/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw2/b0;->e:Lj0/a;

    .line 8
    .line 9
    new-instance v0, Lj0/a;

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    invoke-direct {v0, v1}, Lj0/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lw2/b0;->f:Lj0/a;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lw2/b0;->a:I

    .line 5
    .line 6
    iput p2, p0, Lw2/b0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lw2/b0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lw2/b0;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method
