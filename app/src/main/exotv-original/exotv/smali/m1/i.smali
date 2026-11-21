.class public final Lm1/i;
.super Ljava/lang/Thread;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic j:Lm1/j;


# direct methods
.method public constructor <init>(Lm1/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/i;->j:Lm1/j;

    .line 2
    .line 3
    const-string p1, "ExoPlayer:SimpleDecoder"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/i;->j:Lm1/j;

    .line 2
    .line 3
    invoke-static {v0}, Lm1/j;->access$000(Lm1/j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
