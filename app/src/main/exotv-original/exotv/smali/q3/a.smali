.class public final synthetic Lq3/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lq3/b;


# direct methods
.method public synthetic constructor <init>(Lq3/b;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq3/a;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lq3/a;->k:Lq3/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lq3/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq3/a;->k:Lq3/b;

    .line 7
    .line 8
    iget-object v0, v0, Lq3/b;->f:Lokhttp3/y;

    .line 9
    .line 10
    const-string v1, "Content-Type"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lokhttp3/y;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v1, Lokhttp3/d0;->Companion:Lokhttp3/d0$a;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lokhttp3/d0$a;->parse(Ljava/lang/String;)Lokhttp3/d0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    return-object v0

    .line 27
    :pswitch_0
    sget-object v0, Lokhttp3/e;->Companion:Lokhttp3/e$b;

    .line 28
    .line 29
    iget-object v1, p0, Lq3/a;->k:Lq3/b;

    .line 30
    .line 31
    iget-object v1, v1, Lq3/b;->f:Lokhttp3/y;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lokhttp3/e$b;->parse(Lokhttp3/y;)Lokhttp3/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
