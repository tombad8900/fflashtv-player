.class public final Li7/k;
.super Li7/w0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Li7/j;


# instance fields
.field public final n:Li7/a1;


# direct methods
.method public constructor <init>(Li7/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm7/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li7/k;->n:Li7/a1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Li7/w0;->i()Li7/a1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Li7/a1;->q(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final j()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li7/k;->n:Li7/a1;

    .line 2
    .line 3
    invoke-virtual {p0}, Li7/w0;->i()Li7/a1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Li7/a1;->m(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
