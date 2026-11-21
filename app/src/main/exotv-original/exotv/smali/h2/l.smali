.class public final Lh2/l;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lh2/q;

.field public final b:Lh2/t;

.field public final c:Ln1/i0;

.field public final d:Ln1/j0;

.field public e:I


# direct methods
.method public constructor <init>(Lh2/q;Lh2/t;Ln1/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh2/l;->a:Lh2/q;

    .line 5
    .line 6
    iput-object p2, p0, Lh2/l;->b:Lh2/t;

    .line 7
    .line 8
    iput-object p3, p0, Lh2/l;->c:Ln1/i0;

    .line 9
    .line 10
    iget-object p1, p1, Lh2/q;->g:Landroidx/media3/common/w;

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 13
    .line 14
    const-string p2, "audio/true-hd"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p1, Ln1/j0;

    .line 23
    .line 24
    invoke-direct {p1}, Ln1/j0;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iput-object p1, p0, Lh2/l;->d:Ln1/j0;

    .line 30
    .line 31
    return-void
.end method
