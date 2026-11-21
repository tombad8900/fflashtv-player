.class public final Lo7/l;
.super Li7/r;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final l:Lo7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lo7/l;

    .line 2
    .line 3
    invoke-direct {v0}, Li7/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo7/l;->l:Lo7/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final D(Lp6/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, Lo7/e;->m:Lo7/e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p1, p1, Lo7/h;->l:Lo7/c;

    .line 5
    .line 6
    invoke-virtual {p1, p2, v0}, Lo7/c;->c(Ljava/lang/Runnable;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final F(I)Li7/r;
    .locals 1

    .line 1
    invoke-static {p1}, Lm7/a;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lo7/k;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Li7/r;->F(I)Li7/r;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method
