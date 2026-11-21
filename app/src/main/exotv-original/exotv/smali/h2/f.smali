.class public final synthetic Lh2/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Le6/d;
.implements Li1/r;


# instance fields
.field public final synthetic j:Lh2/i;


# direct methods
.method public synthetic constructor <init>(Lh2/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh2/f;->j:Lh2/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(JLh1/w;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/f;->j:Lh2/i;

    .line 2
    .line 3
    iget-object v0, v0, Lh2/i;->K:[Ln1/i0;

    .line 4
    .line 5
    invoke-static {p1, p2, p3, v0}, Ln1/b;->e(JLh1/w;[Ln1/i0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lh2/q;

    .line 2
    .line 3
    iget-object v0, p0, Lh2/f;->j:Lh2/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
