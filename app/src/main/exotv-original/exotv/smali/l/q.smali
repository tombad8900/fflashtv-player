.class public final Ll/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public a:Ll/o;

.field public final b:Landroid/view/ActionProvider;


# direct methods
.method public constructor <init>(Ll/u;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ll/q;->b:Landroid/view/ActionProvider;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Ll/q;->a:Ll/o;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Ll/o;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ll/p;

    .line 8
    .line 9
    iget-object p1, p1, Ll/p;->w:Ll/m;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p1, Ll/m;->q:Z

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ll/m;->p(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
