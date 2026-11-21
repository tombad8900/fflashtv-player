.class public final Lk2/f;
.super Lk2/n;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic l:I

.field public m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lk2/f;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lk2/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk2/f;->l:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lk2/f;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final release()V
    .locals 1

    .line 1
    iget v0, p0, Lk2/f;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk2/f;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/source/preload/a;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ll2/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lk2/n;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Ll2/h;->b:Ljava/util/ArrayDeque;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lk2/f;->m:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lk2/g;

    .line 29
    .line 30
    invoke-static {v0, p0}, Lk2/g;->access$000(Lk2/g;Lm1/h;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
