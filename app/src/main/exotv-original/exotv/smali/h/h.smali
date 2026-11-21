.class public final Lh/h;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lc/a;


# instance fields
.field public final synthetic a:Lh/i;


# direct methods
.method public constructor <init>(Lh/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/h;->a:Lh/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lb/l;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lh/h;->a:Lh/i;

    .line 2
    .line 3
    invoke-virtual {p1}, Lh/i;->k()Lh/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lh/o;->a()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lb/l;->m:Ln4/p;

    .line 11
    .line 12
    iget-object p1, p1, Ln4/p;->m:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, La3/e;

    .line 15
    .line 16
    const-string v1, "androidx:appcompat"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, La3/e;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lh/o;->c()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
