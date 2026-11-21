.class public final synthetic Lw4/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic m:Lcom/exotv/net/MainActivity;


# direct methods
.method public synthetic constructor <init>(IILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lw4/j;->j:I

    .line 5
    .line 6
    iput p2, p0, Lw4/j;->k:I

    .line 7
    .line 8
    iput-object p3, p0, Lw4/j;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iput-object p4, p0, Lw4/j;->m:Lcom/exotv/net/MainActivity;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lw4/j;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iget v1, p0, Lw4/j;->k:I

    .line 6
    .line 7
    iget-object v2, p0, Lw4/j;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v3, p0, Lw4/j;->m:Lcom/exotv/net/MainActivity;

    .line 10
    .line 11
    invoke-static {v1, v0, v2, v3}, Lcom/exotv/net/MainActivity;->y(IILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
