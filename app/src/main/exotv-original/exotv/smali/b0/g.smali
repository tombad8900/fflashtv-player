.class public final Lb0/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;

.field public c:Ljava/util/ArrayList;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/lang/CharSequence;

.field public f:Landroid/app/PendingIntent;

.field public g:Z

.field public h:La1/e;

.field public i:I

.field public j:I

.field public k:Z

.field public l:Landroid/os/Bundle;

.field public m:Ljava/lang/String;

.field public n:I

.field public o:Z

.field public p:Landroid/app/Notification;

.field public q:Ljava/util/ArrayList;


# virtual methods
.method public final a(La1/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/g;->h:La1/e;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lb0/g;->h:La1/e;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, La1/e;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lb0/g;

    .line 12
    .line 13
    if-eq v0, p0, :cond_0

    .line 14
    .line 15
    iput-object p0, p1, La1/e;->k:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lb0/g;->a(La1/e;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
