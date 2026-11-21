.class public final Ln1/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(IJLjava/lang/String;II)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p4, p0, Ln1/a;->a:Ljava/lang/String;

    .line 7
    iput p1, p0, Ln1/a;->c:I

    .line 8
    iput p5, p0, Ln1/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Ln1/a;->b:I

    .line 3
    iput p3, p0, Ln1/a;->c:I

    .line 4
    iput-object p1, p0, Ln1/a;->a:Ljava/lang/String;

    return-void
.end method
