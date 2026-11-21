.class public final synthetic Lh/y;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lm0/k;


# instance fields
.field public final synthetic j:Lh/g;


# direct methods
.method public synthetic constructor <init>(Lh/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/y;->j:Lh/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/y;->j:Lh/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh/g;->i(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
